"""POST /api/orders/{id}/capture: take the money, check it matches the order, issue download links.

Capturing only takes money the buyer approved at PayPal, so anyone holding the order id may trigger it.
The first capture of an order also emails its receipt (the "Invoice by email" of the checkout's trust row)
to the order's email: the signed-in buyer's, or the PayPal payer's.
The links in the receipt, though, go only to the browser that placed the order (its ef_buyer cookie) or
to a session whose email owns the order; anyone else gets the receipt without them (links_hidden).
"""
import hmac
from decimal import Decimal
from urllib.parse import urlencode

from fastapi import APIRouter, HTTPException, Request

from api import auth
from api.web import base_url
from api.orders import BUYER
from api.paypal import PayPalError
from api.store import digest

router = APIRouter()


def masked(email: str) -> str:
    """a•••@example.com: enough for the buyer to recognise the address, little for anyone else."""
    local, at, domain = (email or "").strip().partition("@")
    return f"{local[0]}•••@{domain}" if at and local and domain else ""


def money(value, currency: str) -> str:
    return f"{Decimal(value):,.2f} {currency}"


def email_receipt(request: Request, order: dict):
    """The order line by line, the total and where the downloads are. A failed email is in the outbox
    and does not undo the payment: the thank-you page and My strategies still have everything."""
    state = request.app.state
    if not order.get("email"):
        return
    texts, lang, cur, catalogue = state.texts, order.get("lang") or "en", order["currency"], state.catalogue
    lines = order.get("lines") or {}
    out = []
    for item in lines.get("items", []):
        s = catalogue.resolve(item["id"])
        name = f"{s.row.get('Name', s.ticker)} ({s.ticker} · {s.key_techs} · {s.interval})" if s else item["id"]
        out.append(f"{name}: {money(item['price'], cur)}")
    for b in lines.get("bundles", []):
        bundle = catalogue.bundles.get(b["key"])
        name = texts.get(bundle.name_key, lang) if bundle else b["key"]
        out.append(f"{name} ({len(bundle.items) if bundle else '?'}): {money(b['price'], cur)}")
    if lines.get("pack"):
        out.append(f"{texts.get('packTitle', lang)} ({len(lines['pack']['ids'])}): {money(lines['pack']['price'], cur)}")
    settings = state.settings
    body = texts.get("mailReceiptBody", lang, id=order["paypal_id"], lines="\n".join("- " + line for line in out),
                     total=money(order["total"], cur), mine=f"{base_url(request)}/mine", n=settings.download_days,
                     m=settings.max_downloads, contact=settings.contact_email)
    state.mailer.send(order["email"], texts.get("mailReceiptSubject", lang, id=order["paypal_id"]), body)


def may_see_links(request: Request, order: dict) -> bool:
    cookie = request.cookies.get(BUYER)
    if cookie and order.get("buyer_hash") and hmac.compare_digest(digest(cookie), order["buyer_hash"]):
        return True
    email = auth.current_email(request)
    return bool(email) and email in (order.get("email"), (order.get("payer") or "").strip().lower())


def receipt(request: Request, order: dict) -> dict:
    """The thank-you page: one row per strategy with its links; asking again gives the same links."""
    state = request.app.state
    settings, catalogue = state.settings, state.catalogue
    bought = [catalogue.items[k] for k in order["items"] if k in catalogue.items]
    # issued even when they are not shown here: My strategies lists the order's links
    links = state.store.issue_links(order["paypal_id"], [s.key for s in bought], settings.download_days,
                                    versions={s.key: s.version for s in bought})
    out = {"order_id": order["paypal_id"], "status": "PAID", "total": order["total"],
           "currency": order["currency"], "payer": masked(order["payer"]), "valid_days": settings.download_days,
           "max_downloads": settings.max_downloads}
    if not may_see_links(request, order):
        return {**out, "download_all": None, "downloads": [], "links_hidden": True}
    downloads = [{**s.as_row(), "url": f"/api/download/{links[s.key]}",
                  "zip": f"/api/download/{links[s.key]}?format=zip"} for s in bought]
    return {**out, "download_all": "/api/download/all?" + urlencode([("t", links[s.key]) for s in bought]),
            "downloads": downloads, "links_hidden": False}


@router.post("/api/orders/{paypal_id}/capture")
def capture(paypal_id: str, request: Request):
    state = request.app.state
    order = state.store.order(paypal_id)
    if not order:
        raise HTTPException(404, {"error": "unknown order"})
    if order["status"] == "PAID":  # a retry after a network error: same links again
        return receipt(request, order)
    try:
        cap = state.paypal.capture(paypal_id)
    except PayPalError as e:
        raise HTTPException(502, {"error": str(e)})
    if cap.status != "COMPLETED" or cap.amount != Decimal(order["total"]) or cap.currency != order["currency"]:
        state.store.set_status(paypal_id, "FAILED", cap.payer)
        raise HTTPException(402, {"error": "payment not completed for the order amount",
                                  "paid": f"{cap.amount} {cap.currency} {cap.status}"})
    state.store.set_status(paypal_id, "PAID", cap.payer)
    if not order.get("email") and "@" in (cap.payer or ""):
        # bought without signing in: the PayPal address is how My strategies finds the order later
        state.store.set_email(paypal_id, cap.payer)
    order = state.store.order(paypal_id)
    email_receipt(request, order)
    return receipt(request, order)
