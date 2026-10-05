"""POST /api/orders/{id}/capture: take the money, check it matches the order, issue download links."""
from decimal import Decimal
from urllib.parse import urlencode

from fastapi import APIRouter, HTTPException, Request

from api.paypal import PayPalError

router = APIRouter()


def receipt(request: Request, order: dict) -> dict:
    """The thank-you page: one row per strategy with its links; asking again gives the same links."""
    state = request.app.state
    settings, catalogue = state.settings, state.catalogue
    bought = [catalogue.items[k] for k in order["items"] if k in catalogue.items]
    links = state.store.issue_links(order["paypal_id"], [s.key for s in bought], settings.download_days,
                                    versions={s.key: s.version for s in bought})
    downloads = [{**s.as_row(), "url": f"/api/download/{links[s.key]}",
                  "zip": f"/api/download/{links[s.key]}?format=zip"} for s in bought]
    return {"order_id": order["paypal_id"], "status": "PAID", "total": order["total"],
            "currency": order["currency"], "payer": order["payer"], "valid_days": settings.download_days,
            "max_downloads": settings.max_downloads,
            "download_all": "/api/download/all?" + urlencode([("t", links[s.key]) for s in bought]),
            "downloads": downloads}


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
    return receipt(request, state.store.order(paypal_id))
