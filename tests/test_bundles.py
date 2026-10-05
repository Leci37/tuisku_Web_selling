"""Bundles and "Build your pack": priced on the server, and a strategy is never charged twice."""
import json
from decimal import Decimal

from fastapi.testclient import TestClient

from api.app import create_app
from api.catalogue import Catalogue
from api.settings import ROOT
from tests.conftest import ROWS, strategy_id

AAPL, MSFT, NVDA, TSLA = (strategy_id(r) for r in ROWS)


def quote(client, **cart):
    return client.post("/api/quote", json=cart)


def test_bundles_and_pack_are_listed(client):
    body = client.get("/api/bundles").json()
    assert body == {"bundles": [{"key": "duo", "name_key": "bundleTop", "ids": [AAPL, MSFT], "price": 150,
                                 "was": 172}], "pack": {"size": 5, "price": 249}}


def test_shipped_bundles_come_from_the_real_catalogue(real_client):
    cat = Catalogue(ROOT / "catalogue" / "catalogue.csv")
    paid = sorted((s for s in cat if s.price > 0), key=lambda s: -s.numbers["npp"])
    best_per_ticker = list({s.ticker: s for s in reversed(paid)}.values())[::-1]  # each ticker's best, by npp
    best_per_ticker.sort(key=lambda s: -s.numbers["npp"])
    bundles = {b["key"]: b for b in real_client.get("/api/bundles").json()["bundles"]}
    assert bundles["top5"]["ids"] == [s.id for s in best_per_ticker[:5]] and bundles["top5"]["price"] == 249
    assert len({cat.resolve(i).ticker for i in bundles["top5"]["ids"]}) == 5, "five different tickers"
    assert bundles["crypto"]["ids"] == [s.id for s in paid if s.market == "crypto"][:2]
    assert bundles["amzn"]["ids"] == [s.id for s in paid if s.ticker == "AMZN"][:2]
    for b in bundles.values():
        assert b["price"] < b["was"] == sum(float(cat.resolve(i).price) for i in b["ids"])


def test_unknown_ids_in_the_file_are_dropped(settings, caplog):
    settings.bundles.write_text(json.dumps([{"key": "duo", "ids": [AAPL, "GONE_1Day_X_0"], "price": 70},
                                            {"key": "ghost", "ids": ["GONE_1Day_X_0"], "price": 9}]))
    body = TestClient(create_app(settings)).get("/api/bundles").json()
    assert [(b["key"], b["ids"]) for b in body["bundles"]] == [("duo", [AAPL])]
    assert "GONE_1Day_X_0" in caplog.text


def test_items_in_a_bundle_are_not_charged_twice(client):
    r = quote(client, items=[AAPL, TSLA], bundles=["duo"]).json()
    assert r["items"] == [{"id": TSLA, "price": "42.50"}] and r["bundles"] == [{"key": "duo", "price": "127.50"}]
    assert r["subtotal"] == "200.00" and r["tier_rate"] == "0.15" and r["total"] == "170.00"  # 150 + 50, 15% tier
    assert r["pack"] is None


def test_code_adds_to_the_tier_with_bundles(client):
    r = quote(client, bundles=["duo", "duo"], code="spring20").json()
    assert r["subtotal"] == "150.00" and r["code_rate"] == "0.20" and r["tier_rate"] == "0"
    assert r["total"] == "120.00" and r["code_status"] == "applied"


def test_flat_price_code_is_for_loose_items_only(client):
    r = quote(client, items=[TSLA], bundles=["duo"], code="launch").json()
    assert r["items"] == [{"id": TSLA, "price": "0.99"}] and r["bundles"] == [{"key": "duo", "price": "150.00"}]
    assert r["total"] == "150.99" and r["discount_rate"] == "0" and r["subtotal"] == "200.00"


def test_pack(client, settings):
    settings.pack_size, settings.pack_price = 2, Decimal("120")
    r = quote(client, items=[AAPL, MSFT, TSLA], pack=[AAPL, TSLA]).json()
    assert r["pack"] == {"ids": [AAPL, TSLA], "price": "102.00"} and [i["id"] for i in r["items"]] == [MSFT]
    assert r["subtotal"] == "213.00" and r["total"] == "181.05"  # 93 + 120, 15% tier


def test_a_pack_needs_exactly_its_size_of_paid_strategies(client, settings):
    settings.pack_size = 2
    for pack in ([AAPL], [AAPL, AAPL], [AAPL, NVDA], [AAPL, MSFT, TSLA]):
        r = quote(client, pack=pack)
        assert r.status_code == 400 and "pack" in r.json()["detail"]["error"], pack


def test_unknown_bundle_and_empty_cart(client):
    assert quote(client, bundles=["gold"]).status_code == 400
    assert quote(client, items=[], bundles=[], pack=[]).status_code == 400


def test_buying_a_bundle_and_a_pack(client, settings):
    settings.pack_size, settings.pack_price = 2, Decimal("80")
    order = client.post("/api/orders", json={"bundles": ["duo"], "pack": [TSLA, AAPL]})
    assert order.status_code == 200, order.text
    o = order.json()
    assert o["total"] == "195.50"  # 150 + 80 = 230, 15% tier
    stored = client.app.state.store.order(o["id"])
    assert sorted(stored["items"]) == sorted(" - ".join(r[k] for k in ("ticker", "interval", "key_techs", "id_model"))
                                             for r in (ROWS[0], ROWS[1], ROWS[3]))
    assert stored["lines"]["bundles"] == [{"key": "duo", "price": "127.50"}]
    receipt = client.post(f"/api/orders/{o['id']}/capture").json()
    assert {d["id"] for d in receipt["downloads"]} == {AAPL, MSFT, TSLA}
