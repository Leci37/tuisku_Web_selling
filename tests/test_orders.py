"""Paying and downloading: a file only leaves the server through a link issued for a paid order."""
from decimal import Decimal

from api.paypal import Capture


def buy(client, items, code=""):
    order = client.post("/api/orders", json={"items": items, "code": code})
    assert order.status_code == 200, order.text
    return client.post(f"/api/orders/{order.json()['id']}/capture")


def test_full_purchase(client, ids):
    r = buy(client, ids[:2])
    assert r.status_code == 200
    body = r.json()
    assert body["status"] == "PAID" and body["total"] == "146.20"
    assert {d["ticker"] for d in body["downloads"]} == {"AAPL", "MSFT"}
    f = client.get(body["downloads"][0]["url"])
    assert f.status_code == 200 and f.text.startswith("//@version=5")
    assert "AAPL_1Day_1ADX_aaaa1111_TW.pine" in f.headers["content-disposition"]


def test_capture_twice_returns_the_same_links(client, ids):
    order = client.post("/api/orders", json={"items": [ids[0]]}).json()["id"]
    first = client.post(f"/api/orders/{order}/capture").json()
    again = client.post(f"/api/orders/{order}/capture").json()
    assert first["downloads"][0]["url"] == again["downloads"][0]["url"]


def test_no_download_without_paying(client, ids):
    # an order that was created but never captured has no links; guessing one fails
    client.post("/api/orders", json={"items": [ids[0]]})
    assert client.get("/api/download/guessed-token").status_code == 404
    assert client.post("/api/orders/FAKE-NOTREAL/capture").status_code == 404


def test_payment_for_a_different_amount_is_refused(client, ids, paypal):
    order = client.post("/api/orders", json={"items": [ids[0]]}).json()["id"]
    paypal.capture = lambda _id: Capture("COMPLETED", Decimal("0.01"), "USD", "x@example.com")
    r = client.post(f"/api/orders/{order}/capture")
    assert r.status_code == 402
    assert client.app.state.store.order(order)["status"] == "FAILED"


def test_only_free_items_cannot_be_ordered(client, ids):
    assert client.post("/api/orders", json={"items": [ids[2]]}).status_code == 400


def test_expired_link(client, ids, settings):
    settings.download_days = -1
    url = buy(client, [ids[0]]).json()["downloads"][0]["url"]
    assert client.get(url).status_code == 410


def test_download_limit(client, ids, settings):
    settings.max_downloads = 2
    url = buy(client, [ids[0]]).json()["downloads"][0]["url"]
    assert [client.get(url).status_code for _ in range(3)] == [200, 200, 429]


def test_missing_private_file(client, ids, settings):
    url = buy(client, [ids[1]]).json()["downloads"][0]["url"]
    for f in settings.strategies_dir.iterdir():
        f.unlink()
    assert client.get(url).status_code == 404
