"""POST /api/quote and POST /api/orders: the price of a cart, computed here, never in the browser."""
from fastapi import APIRouter, HTTPException, Request
from pydantic import BaseModel, Field

from api import pricing

router = APIRouter()


class Cart(BaseModel):
    items: list[str] = Field(..., max_length=500, description="cart item ids (the storefront's base64 keys)")
    code: str = Field("", max_length=64)


def resolve(request: Request, cart: Cart):
    catalogue = request.app.state.catalogue
    found, unknown = [], []
    for item_id in cart.items:
        s = catalogue.resolve(item_id)
        (found if s else unknown).append(s or item_id)
    if unknown:
        raise HTTPException(400, {"error": "unknown items", "items": unknown[:20]})
    if not found:
        raise HTTPException(400, {"error": "the cart is empty"})
    return found


@router.post("/api/quote")
def quote(cart: Cart, request: Request):
    return pricing.quote(resolve(request, cart), cart.code, request.app.state.settings).as_dict()


@router.post("/api/orders")
def create_order(cart: Cart, request: Request):
    state = request.app.state
    q = pricing.quote(resolve(request, cart), cart.code, state.settings)
    if q.total <= 0:
        raise HTTPException(400, {"error": "nothing to pay: free strategies download directly"})
    keys = [s.key for s, _ in q.items]
    paypal_id = state.paypal.create_order(q.total, state.settings.currency, reference=f"tuisku-{len(keys)}")
    state.store.add_order(paypal_id, keys, q.code if q.code_status == "applied" else "", q.total, state.settings.currency)
    return {"id": paypal_id, **q.as_dict()}
