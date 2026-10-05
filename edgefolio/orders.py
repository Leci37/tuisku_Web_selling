# -*- coding: utf-8 -*-
"""Comprar: el precio de un carrito (sólo aquí, nunca en el navegador), el pedido de PayPal, el cobro
con la comprobación del importe y el recibo con sus enlaces.

Cobrar sólo toma el dinero que quien compra aprobó en PayPal, así que cualquiera con el id del pedido
puede pedirlo (va en la dirección de vuelta de PayPal). Los enlaces del recibo, en cambio, sólo van al
navegador que hizo el pedido (su cookie de quien compra), a la cuenta que lo hizo con la sesión abierta
o, si se compró sin cuenta, a una cuenta que ha demostrado que el correo del pedido es suyo. Cualquier
otro recibe el recibo sin ellos (``links_hidden``).
"""
from __future__ import annotations

import hmac
import re
import secrets
from datetime import timedelta
from decimal import Decimal
from typing import Iterable, Optional
from urllib.parse import urlencode

from sqlalchemy import update

from zlecitool_core.db import db, utcnow

from . import pricing
from .models import Download, Order
from .paypal import PayPalError
from .web import Refusal, digest, json_object, list_field, text_field

BUYER_DAYS = 30
BUYER_TOKEN = re.compile(r"^[A-Za-z0-9_-]{32,64}$")  # lo que da secrets.token_urlsafe(32)


def norm(email: str) -> str:
    return (email or "").strip().lower()


# ── el carrito ───────────────────────────────────────────────────────────────

def cart_of(body) -> dict:
    """Lo único que manda el navegador: ids, claves de lotes, el pack y el código tecleado."""
    body = json_object(body)
    return {"items": list_field(body, "items", 500), "bundles": list_field(body, "bundles", 50),
            "pack": list_field(body, "pack", 50), "code": text_field(body, "code", 64, default="")}


def strategies(catalogue, ids: list) -> list:
    found, unknown = [], []
    for item_id in ids:
        s = catalogue.resolve(item_id)
        (found if s else unknown).append(s or item_id)
    if unknown:
        raise Refusal("errUnknownItems", 400, items=unknown[:20])
    return found


def priced(shop, cart: dict) -> pricing.Quote:
    catalogue, settings = shop.catalogue, shop.settings
    unknown = [k for k in cart["bundles"] if k not in catalogue.bundles]
    if unknown:
        raise Refusal("errUnknownBundles", 400, bundles=unknown[:20])
    pack = strategies(catalogue, cart["pack"])
    if pack and (len({s.key for s in pack}) != settings.pack_size or any(s.price <= 0 for s in pack)):
        raise Refusal("errPackSize", 400, vars={"n": settings.pack_size})
    bundles = [catalogue.bundles[k] for k in cart["bundles"]]
    twice = pricing.overlap(bundles, pack)
    if twice:
        raise Refusal("errBundleOverlap", 400, items=[s.id for s in twice][:20])
    items = strategies(catalogue, cart["items"])
    if not (items or cart["bundles"] or pack):
        raise Refusal("errCartEmpty", 400)
    return pricing.quote(items, cart["code"], settings, bundles, pack)


# ── el pedido ────────────────────────────────────────────────────────────────

def buyer_token(cookie: Optional[str]) -> str:
    """La cookie de quien compra de este navegador, la misma para sus pedidos siguientes; una que no
    tiene la forma de las nuestras se cambia por otra."""
    return cookie if cookie and BUYER_TOKEN.match(cookie) else secrets.token_urlsafe(32)


def create(shop, cart: dict, buyer: str, return_url: str, cancel_url: str, user_id: Optional[int] = None,
           email: str = "") -> dict:
    """El pedido de PayPal por el total del servidor; ``buyer`` es la cookie del navegador (se guarda su
    hash) y ``user_id``/``email``, la cuenta si se compra con la sesión abierta."""
    q = priced(shop, cart)
    if q.total <= 0:
        raise Refusal("errNothingToPay", 400)
    keys = [s.key for s in q.strategies]
    try:
        created = shop.paypal.create_order(q.total, shop.settings.currency, reference=f"edgefolio-{len(keys)}",
                                           return_url=return_url, cancel_url=cancel_url)
    except PayPalError as e:
        raise Refusal("errPayPal", 502, detail=str(e)) from e
    db.session.add(Order(paypal_id=created.id, user_id=user_id, items=keys,
                         code=q.code if q.code_status == "applied" else "", total=str(q.total),
                         currency=shop.settings.currency, status="CREATED", payer="", email=norm(email),
                         lines=q.lines(), buyer_hash=digest(buyer)))
    db.session.commit()
    return {"id": created.id, "approve_url": created.approve_url, **q.as_dict()}


def find(paypal_id: str) -> Optional[Order]:
    return db.session.get(Order, paypal_id)


def capture(shop, paypal_id: str) -> Order:
    """Cobrar en PayPal y comprobar que se pagó el total del pedido, en su moneda. Repetirlo (un fallo de
    red) no cobra otra vez: un pedido pagado se devuelve tal cual."""
    order = find(paypal_id)
    if order is None:
        raise Refusal("errUnknownOrder", 404)
    if order.status == "PAID":
        return order
    try:
        cap = shop.paypal.capture(paypal_id)
    except PayPalError as e:
        raise Refusal("errPayPal", 502, detail=str(e)) from e
    if cap.status != "COMPLETED" or cap.amount != Decimal(order.total) or cap.currency != order.currency:
        order.status, order.payer = "FAILED", cap.payer or ""
        db.session.commit()
        raise Refusal("errPayment", 402, paid=f"{cap.amount} {cap.currency} {cap.status}")
    # Una sola vez de CREATED a PAID, aunque lleguen dos cobros a la vez.
    db.session.execute(update(Order).where(Order.paypal_id == paypal_id, Order.status != "PAID")
                       .values(status="PAID", payer=cap.payer or ""))
    if not order.email and "@" in (cap.payer or ""):
        # Sin cuenta: el correo de PayPal es con el que una cuenta podrá demostrar que el pedido es suyo.
        db.session.execute(update(Order).where(Order.paypal_id == paypal_id).values(email=norm(cap.payer)))
    db.session.commit()
    db.session.refresh(order)
    return order


# ── los enlaces ──────────────────────────────────────────────────────────────

def issue_links(paypal_id: str, strategies_bought: Iterable, days: int) -> dict:
    """Un enlace por estrategia; otra vez para el mismo pedido, los mismos enlaces."""
    existing = {}
    for d in Download.query.filter_by(paypal_id=paypal_id).order_by(Download.expires_at):
        existing.setdefault(d.item_key, d.token)
    for s in strategies_bought:
        if s.key not in existing:
            existing[s.key] = secrets.token_urlsafe(24)
            db.session.add(Download(token=existing[s.key], paypal_id=paypal_id, item_key=s.key,
                                    expires_at=utcnow() + timedelta(days=days), count=0, version=s.version))
    db.session.commit()
    return existing


def masked(email: str) -> str:
    """a•••@example.com: basta para que quien compró reconozca la dirección, y poco para los demás."""
    local, at, domain = (email or "").strip().partition("@")
    return f"{local[0]}•••@{domain}" if at and local and domain else ""


def may_see_links(order: Order, buyer_cookie: Optional[str], user_id: Optional[int], proven: Iterable[str]) -> bool:
    if buyer_cookie and order.buyer_hash and hmac.compare_digest(digest(buyer_cookie), order.buyer_hash):
        return True
    if user_id is None:
        return False
    if order.user_id is not None:
        return order.user_id == user_id
    emails = set(proven)
    return bool(emails) and bool({order.email, norm(order.payer)} & emails)


def receipt(shop, order: Order, may_see: bool) -> dict:
    """La página de gracias: una fila por estrategia con sus enlaces; pedirla otra vez da los mismos."""
    settings, catalogue = shop.settings, shop.catalogue
    bought = [catalogue.items[k] for k in order.items if k in catalogue.items]
    # se hacen aunque no se enseñen aquí: Mis estrategias lista los enlaces del pedido
    links = issue_links(order.paypal_id, bought, settings.download_days)
    out = {"order_id": order.paypal_id, "status": "PAID", "total": order.total, "currency": order.currency,
           "payer": masked(order.payer), "valid_days": settings.download_days,
           "max_downloads": settings.max_downloads}
    if not may_see:
        return {**out, "download_all": None, "downloads": [], "links_hidden": True}
    downloads = [{**s.as_row(), "url": f"/api/download/{links[s.key]}",
                  "zip": f"/api/download/{links[s.key]}?format=zip"} for s in bought]
    return {**out, "download_all": "/api/download/all?" + urlencode([("t", links[s.key]) for s in bought]),
            "downloads": downloads, "links_hidden": False}
