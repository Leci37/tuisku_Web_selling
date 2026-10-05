"""Prices come from the catalogue and discounts are computed on the server, never trusted from the browser."""
from decimal import Decimal

from api.pricing import quote


def test_quote_uses_catalogue_prices_not_the_browsers(client, ids):
    # the old page sent the amount; a tampered cart that still claims a price must not change it
    r = client.post("/api/quote", json={"items": ids[:2], "code": "", "price": "0.01", "total": "0.01"})
    assert r.status_code == 200
    assert r.json()["subtotal"] == "172.00" and r.json()["total"] == "146.20"  # 79 + 93, 15% tier over $160


def test_each_strategy_counts_once(client, ids):
    r = client.post("/api/quote", json={"items": [ids[0]] * 5})
    assert r.json()["total"] == "79.00"


def test_code_adds_to_the_tier(client, ids):
    r = client.post("/api/quote", json={"items": ids[:2], "code": " Spring20 "})
    assert r.json()["code_status"] == "applied"
    assert Decimal(r.json()["discount_rate"]) == Decimal("0.35")  # 15% tier + 20% code


def test_stacked_discounts_are_capped(settings):
    # the old page added the 70% tier to a 60% code and sent PayPal a negative amount
    from api.catalogue import Strategy
    big = [Strategy("T", "1Day", f"K{i}", f"id{i}", Decimal("99"), {}) for i in range(30)]  # $2,970
    q = quote(big, "big60", settings)
    assert q.discount_rate == settings.max_discount
    assert q.total == Decimal("891.00") and q.total > 0


def test_flat_price_code(client, ids):
    r = client.post("/api/quote", json={"items": ids[:2], "code": "launch"})
    assert r.json()["total"] == "1.98" and r.json()["code_status"] == "applied"


def test_unknown_code_gives_no_discount(client, ids):
    r = client.post("/api/quote", json={"items": [ids[0]], "code": "free60"})
    assert r.json()["code_status"] == "invalid" and r.json()["total"] == "79.00"


def test_unknown_item_and_empty_cart(client):
    assert client.post("/api/quote", json={"items": ["bm90LWEtc3RyYXRlZ3k"]}).status_code == 400
    assert client.post("/api/quote", json={"items": []}).status_code == 400


def test_plain_key_is_accepted_too(client):
    r = client.post("/api/quote", json={"items": ["AAPL - 1Day - 1ADX - aaaa1111"]})
    assert r.json()["total"] == "79.00"


def test_config_exposes_no_codes_or_secrets(client, settings):
    body = client.get("/api/config").text
    for secret in ("spring20", "big60", "launch"):
        assert secret not in body
    assert client.get("/api/config").json()["tiers"][0] == {"over": "2500", "rate": "0.70"}
