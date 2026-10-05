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


def test_order_sends_the_buyer_to_paypal_and_back(client, ids, paypal, settings):
    o = client.post("/api/orders", json={"items": [ids[0]]}).json()
    assert o["approve_url"] == f"http://testserver/thanks?token={o['id']}&PayerID=FAKE"
    assert o["total"] == "79.00" and o["items"] == [{"id": "AAPL_1Day_1ADX_aaaa1111", "price": "79.00"}]
    settings.public_url = "https://shop.example"
    assert client.post("/api/orders", json={"items": [ids[0]]}).json()["approve_url"].startswith(
        "https://shop.example/thanks?token=")


def test_receipt(client, ids, settings):
    body = buy(client, ids[:2]).json()
    assert body["valid_days"] == settings.download_days and body["max_downloads"] == settings.max_downloads
    d = body["downloads"][0]
    assert d["id"] == "AAPL_1Day_1ADX_aaaa1111" and d["file"] == "Tuisku_AAPL_1Day_1ADX_aaaa1111"
    assert d["zip"] == d["url"] + "?format=zip" and d["price"] == 79 and d["name"] == "Apple"
    tokens = [x["url"].rsplit("/", 1)[1] for x in body["downloads"]]
    assert body["download_all"] == "/api/download/all?" + "&".join(f"t={t}" for t in tokens)
    assert client.app.state.store.order(body["order_id"])["email"] == "buyer@example.com", "the payer finds it later"


def test_paypal_rest_order(monkeypatch):
    from api import paypal as pp
    sent = []

    class Answer:
        def __init__(self, body, status=201):
            self.status_code, self.body, self.text = status, body, ""

        def json(self):
            return self.body

    def post(url, **kw):
        sent.append((url, kw.get("json")))
        if url.endswith("/oauth2/token"):
            return Answer({"access_token": "T"}, 200)
        return Answer({"id": "5O190127", "links": [{"rel": "self", "href": "https://x/self"},
                                                   {"rel": "payer-action", "href": "https://paypal/checkoutnow"}]})

    monkeypatch.setattr(pp.httpx, "post", post)
    created = pp.PayPalREST("sandbox", "id", "secret").create_order(Decimal("12.50"), "USD", "edgefolio-1",
                                                                    "https://s/thanks", "https://s/?checkout=cancel")
    assert (created.id, created.approve_url) == ("5O190127", "https://paypal/checkoutnow")
    ctx = sent[-1][1]["payment_source"]["paypal"]["experience_context"]
    assert ctx == {"brand_name": "Edgefolio", "user_action": "PAY_NOW", "shipping_preference": "NO_SHIPPING",
                   "return_url": "https://s/thanks", "cancel_url": "https://s/?checkout=cancel"}
    assert sent[-1][1]["purchase_units"][0]["amount"] == {"currency_code": "USD", "value": "12.50"}
