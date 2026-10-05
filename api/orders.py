"""POST /api/quote and POST /api/orders: the price of a cart, computed here, never in the browser.

Placing an order gives the browser an ef_buyer cookie (HttpOnly, 30 days, the same one for its later
orders); the order keeps its hash, and only that browser (or the owner's session) sees the receipt's links.
"""
import re
import secrets

from fastapi import APIRouter, HTTPException, Request, Response
from pydantic import BaseModel, Field

from api import auth, pricing
from api.paypal import PayPalError
from api.web import base_url, set_cookie

router = APIRouter()

BUYER, BUYER_DAYS = "ef_buyer", 30
BUYER_TOKEN = re.compile(r"^[A-Za-z0-9_-]{32,64}$")  # what secrets.token_urlsafe(32) gives


class Cart(BaseModel):
    items: list[str] = Field([], max_length=500, description="strategy ids (also the plain key or the old cart id)")
    bundles: list[str] = Field([], max_length=50, description="bundle keys from /api/bundles")
    pack: list[str] = Field([], max_length=50, description="the PACK_SIZE strategies of 'Build your pack'")
    code: str = Field("", max_length=64)


def strategies(catalogue, ids: list) -> list:
    found, unknown = [], []
    for item_id in ids:
        s = catalogue.resolve(item_id)
        (found if s else unknown).append(s or item_id)
    if unknown:
        raise HTTPException(400, {"error": "unknown items", "items": unknown[:20]})
    return found


def priced(request: Request, cart: Cart) -> pricing.Quote:
    state = request.app.state
    catalogue, settings = state.catalogue, state.settings
    unknown = [k for k in cart.bundles if k not in catalogue.bundles]
    if unknown:
        raise HTTPException(400, {"error": "unknown bundles", "bundles": unknown[:20]})
    pack = strategies(catalogue, cart.pack)
    if pack and (len({s.key for s in pack}) != settings.pack_size or any(s.price <= 0 for s in pack)):
        raise HTTPException(400, {"error": f"a pack needs exactly {settings.pack_size} different paid strategies"})
    bundles = [catalogue.bundles[k] for k in cart.bundles]
    twice = pricing.overlap(bundles, pack)
    if twice:
        raise HTTPException(400, {"error": "a strategy is in two of the chosen bundles",
                                  "items": [s.id for s in twice][:20]})
    items = strategies(catalogue, cart.items)
    if not (items or cart.bundles or pack):
        raise HTTPException(400, {"error": "the cart is empty"})
    return pricing.quote(items, cart.code, settings, bundles, pack)


@router.post("/api/quote")
def quote(cart: Cart, request: Request):
    return priced(request, cart).as_dict()


@router.post("/api/orders")
def create_order(cart: Cart, request: Request, response: Response):
    state = request.app.state
    q = priced(request, cart)
    if q.total <= 0:
        raise HTTPException(400, {"error": "nothing to pay: free strategies download directly"})
    keys = [s.key for s in q.strategies]
    base = base_url(request)
    try:
        created = state.paypal.create_order(q.total, state.settings.currency, reference=f"edgefolio-{len(keys)}",
                                            return_url=f"{base}/thanks", cancel_url=f"{base}/?checkout=cancel")
    except PayPalError as e:
        raise HTTPException(502, {"error": str(e)})
    buyer = request.cookies.get(BUYER, "")
    if not BUYER_TOKEN.match(buyer):
        buyer = secrets.token_urlsafe(32)
    state.store.add_order(created.id, keys, q.code if q.code_status == "applied" else "", q.total,
                          state.settings.currency, email=auth.current_email(request) or "", lines=q.lines(),
                          buyer=buyer)
    set_cookie(response, request, BUYER, buyer, BUYER_DAYS)
    return {"id": created.id, "approve_url": created.approve_url, **q.as_dict()}
