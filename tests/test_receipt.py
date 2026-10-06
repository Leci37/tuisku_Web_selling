"""The receipt email ("Invoice by email" in the checkout's trust row): sent once, when the payment goes through."""
from tests.conftest import ROWS, strategy_id

AAPL, TSLA = strategy_id(ROWS[0]), strategy_id(ROWS[3])


def receipts(client):
    return [m for m in client.app.state.store.outbox() if "Edgefolio" in m["subject"] and "{" not in m["subject"]
            and ("order" in m["subject"].lower() or "pedido" in m["subject"].lower())]


def pay(client, body):
    order = client.post("/api/orders", json=body)
    assert order.status_code == 200, order.text
    return order.json()["id"], client.post(f"/api/orders/{order.json()['id']}/capture")


def test_the_payer_gets_a_receipt_in_the_pages_language(client):
    order_id, r = pay(client, {"items": [AAPL, TSLA], "bundles": [], "pack": [], "code": "", "lang": "es"})
    assert r.status_code == 200
    (mail,) = receipts(client)
    assert mail["to_addr"] == "buyer@example.com"           # the fake PayPal's payer
    assert mail["subject"] == f"Tu pedido de Edgefolio {order_id}"
    body = mail["body"]
    assert "- Apple (AAPL · 1ADX · 1Day): 79.00 USD" in body and "- Tesla (TSLA · 1C00 · 1Day): 50.00 USD" in body
    assert "Total pagado con PayPal: 129.00 USD" in body and "/mine" in body and "7 días" in body


def test_a_bundle_is_one_line_and_a_retry_sends_nothing_more(client):
    order_id, _ = pay(client, {"items": [], "bundles": ["duo"], "pack": [], "code": ""})
    assert client.post(f"/api/orders/{order_id}/capture").status_code == 200   # a retry
    (mail,) = receipts(client)
    assert mail["subject"] == f"Your Edgefolio order {order_id}"
    assert "(2): 150.00 USD" in mail["body"] and "Total paid with PayPal: 150.00 USD" in mail["body"]  # under $160: no tier


def test_a_failed_email_does_not_undo_the_payment(client):
    client.app.state.mailer.send = lambda *a, **k: False
    _, r = pay(client, {"items": [AAPL], "bundles": [], "pack": [], "code": ""})
    assert r.status_code == 200 and r.json()["status"] == "PAID"
