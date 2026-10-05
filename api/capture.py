"""POST /api/orders/{id}/capture: take the money, check it matches the order, issue download links."""
from decimal import Decimal

from fastapi import APIRouter, HTTPException, Request

from api.paypal import PayPalError

router = APIRouter()

RECEIPT_COLUMNS = ["Name", "ticker", "interval", "key_techs", "Full Indicator Name", "Index", "Net Profit_usd",
                   "Percent Profitable_per", "Total Closed Trades", "Release date", "months_trained"]


def receipt(request: Request, order: dict) -> dict:
    state = request.app.state
    links = state.store.issue_links(order["paypal_id"], order["items"], state.settings.download_days)
    downloads = []
    for key in order["items"]:
        s = state.catalogue.items[key]
        downloads.append({"id": key, "file": s.download_name, "url": f"/api/download/{links[key]}",
                          "price": str(s.price), **{c: s.row.get(c, "") for c in RECEIPT_COLUMNS}})
    return {"order_id": order["paypal_id"], "status": "PAID", "total": order["total"],
            "currency": order["currency"], "payer": order["payer"],
            "valid_days": state.settings.download_days, "downloads": downloads}


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
    return receipt(request, state.store.order(paypal_id))
