"""PayPal Orders v2: create an order for an amount the server computed, then capture it and
check what was actually paid. FakePayPal stands in for local runs and tests."""
import secrets
from dataclasses import dataclass
from decimal import Decimal

import httpx

BASE_URLS = {"sandbox": "https://api-m.sandbox.paypal.com", "live": "https://api-m.paypal.com"}


@dataclass
class Capture:
    status: str          # COMPLETED when the money moved
    amount: Decimal
    currency: str
    payer: str           # payer email or id, for the receipt


@dataclass
class Created:
    id: str
    approve_url: str     # where the browser goes to approve the payment


class PayPalError(Exception):
    pass


class PayPalREST:
    def __init__(self, mode: str, client_id: str, secret: str, timeout: float = 20):
        self.base = BASE_URLS[mode]
        self.auth = (client_id, secret)
        self.timeout = timeout

    def _token(self) -> str:
        r = httpx.post(f"{self.base}/v1/oauth2/token", auth=self.auth,
                       data={"grant_type": "client_credentials"}, timeout=self.timeout)
        if r.status_code != 200:
            raise PayPalError(f"PayPal auth failed: {r.status_code}")
        return r.json()["access_token"]

    def create_order(self, total: Decimal, currency: str, reference: str, return_url: str,
                     cancel_url: str) -> Created:
        r = httpx.post(f"{self.base}/v2/checkout/orders", timeout=self.timeout,
                       headers={"Authorization": f"Bearer {self._token()}"},
                       json={"intent": "CAPTURE",
                             "purchase_units": [{"reference_id": reference,
                                                 "amount": {"currency_code": currency, "value": str(total)}}],
                             "payment_source": {"paypal": {"experience_context": {
                                 "brand_name": "Edgefolio", "user_action": "PAY_NOW",
                                 "shipping_preference": "NO_SHIPPING",
                                 "return_url": return_url, "cancel_url": cancel_url}}}})
        if r.status_code not in (200, 201):
            raise PayPalError(f"PayPal create order failed: {r.status_code} {r.text[:200]}")
        body = r.json()
        links = {link.get("rel"): link.get("href") for link in body.get("links", [])}
        # with payment_source PayPal answers 'payer-action'; the older flow says 'approve'
        approve = links.get("payer-action") or links.get("approve")
        if not approve:
            raise PayPalError("PayPal gave no link to approve the order")
        return Created(body["id"], approve)

    def capture(self, order_id: str) -> Capture:
        r = httpx.post(f"{self.base}/v2/checkout/orders/{order_id}/capture", timeout=self.timeout,
                       headers={"Authorization": f"Bearer {self._token()}", "Content-Type": "application/json"})
        if r.status_code not in (200, 201):
            raise PayPalError(f"PayPal capture failed: {r.status_code} {r.text[:200]}")
        body = r.json()
        cap = body["purchase_units"][0]["payments"]["captures"][0]
        payer = body.get("payer", {})
        return Capture(cap["status"], Decimal(cap["amount"]["value"]), cap["amount"]["currency_code"],
                       payer.get("email_address") or payer.get("payer_id", ""))


class FakePayPal:
    """Approves every order for exactly the amount it was created with (PAYPAL_MODE=fake)."""

    def __init__(self):
        self.orders = {}

    def create_order(self, total: Decimal, currency: str, reference: str, return_url: str,
                     cancel_url: str) -> Created:
        order_id = "FAKE-" + secrets.token_hex(6).upper()
        self.orders[order_id] = (total, currency)
        # straight back to the shop, as PayPal does once the buyer approves
        return Created(order_id, f"{return_url}?token={order_id}&PayerID=FAKE")

    def capture(self, order_id: str) -> Capture:
        if order_id not in self.orders:
            raise PayPalError("unknown order")
        total, currency = self.orders[order_id]
        return Capture("COMPLETED", total, currency, "buyer@example.com")
