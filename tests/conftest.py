import csv
import json
from datetime import date
from decimal import Decimal

import pytest
from fastapi.testclient import TestClient

from api.app import create_app
from api.catalogue import Strategy, b64url
from api.paypal import FakePayPal
from api.settings import ROOT, Settings

TODAY = date.today().isoformat()

ROWS = [  # three paid strategies and a free one
    {"Price": "79", "ticker": "AAPL", "interval": "1Day", "key_techs": "1ADX", "id_model": "aaaa1111", "Name": "Apple",
     "Release date": "2024-09-27"},
    {"Price": "93", "ticker": "MSFT", "interval": "1Hour", "key_techs": "2BB0", "id_model": "bbbb2222",
     "Name": "Microsoft", "Release date": "2024-09-27"},
    {"Price": "0", "ticker": "NVDA", "interval": "1Day", "key_techs": "1ULT", "id_model": "cccc3333", "Name": "Nvidia",
     "Release date": TODAY},
    {"Price": "50", "ticker": "TSLA", "interval": "1Day", "key_techs": "1C00", "id_model": "dddd4444", "Name": "Tesla",
     "Release date": "2024-10-14"},
]
# "duo": AAPL + MSFT ($172) for $150
BUNDLES = [{"key": "duo", "name_key": "bundleTop", "ids": ["AAPL_1Day_1ADX_aaaa1111", "MSFT_1Hour_2BB0_bbbb2222"],
            "price": 150}]


def cart_id(row: dict) -> str:
    """The id the old storefront put in the cart: base64url of 'TICKER - INTERVAL - KEY - ID'."""
    return b64url(f"{row['ticker']} - {row['interval']} - {row['key_techs']} - {row['id_model']}")


def strategy_id(row: dict) -> str:
    """The id of the new storefront and of /s/<id>."""
    return f"{row['ticker']}_{row['interval']}_{row['key_techs']}_{row['id_model']}"


@pytest.fixture
def settings(tmp_path):
    cat = tmp_path / "catalogue"
    cat.mkdir()
    with open(cat / "catalogue.csv", "w", newline="") as f:
        w = csv.DictWriter(f, fieldnames=list(ROWS[0]), delimiter="\t")
        w.writeheader()
        w.writerows(ROWS)
    (cat / "indicators.csv").write_text("key\texplanation\n")
    (cat / "bundles.json").write_text(json.dumps(BUNDLES))
    (cat / "fx.json").write_text((ROOT / "catalogue" / "fx.json").read_text())
    private = tmp_path / "strategies"
    private.mkdir()
    for row in ROWS:  # the paid files, named as the factory names them
        if Decimal(row["Price"]) > 0:
            s = Strategy(row["ticker"], row["interval"], row["key_techs"], row["id_model"], Decimal(row["Price"]), row)
            (private / s.private_file).write_text(f"//@version=5\nstrategy(\"{s.key}\")\n")
    return Settings(catalogue=cat / "catalogue.csv", indicators=cat / "indicators.csv", bundles=cat / "bundles.json",
                    fx=cat / "fx.json", since_release=cat / "since_release.csv", strategies_dir=private,
                    database=tmp_path / "shop.db", storefront=ROOT / "storefront", thumbs_dir=tmp_path / "thumbs",
                    discount_codes={"spring20": Decimal("0.20"), "big60": Decimal("0.60")},
                    flat_price_codes={"launch": Decimal("0.99")})


@pytest.fixture
def paypal():
    return FakePayPal()


@pytest.fixture
def client(settings, paypal):
    return TestClient(create_app(settings, paypal))


@pytest.fixture
def ids():
    return [cart_id(r) for r in ROWS]


@pytest.fixture(scope="session")
def real_client(tmp_path_factory):
    """The shop on the real catalogue (2,834 strategies), its bundles and its charts."""
    tmp = tmp_path_factory.mktemp("real")
    return TestClient(create_app(Settings(database=tmp / "shop.db", thumbs_dir=tmp / "thumbs",
                                          strategies_dir=tmp / "strategies"), FakePayPal()))
