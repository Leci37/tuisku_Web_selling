import csv
from decimal import Decimal

import pytest
from fastapi.testclient import TestClient

from api.app import create_app
from api.catalogue import Strategy, b64url
from api.paypal import FakePayPal
from api.settings import ROOT, Settings

ROWS = [  # two paid strategies and a free one
    {"Price": "79", "ticker": "AAPL", "interval": "1Day", "key_techs": "1ADX", "id_model": "aaaa1111", "Name": "Apple"},
    {"Price": "93", "ticker": "MSFT", "interval": "1Hour", "key_techs": "2BB0", "id_model": "bbbb2222", "Name": "Microsoft"},
    {"Price": "0", "ticker": "NVDA", "interval": "1Day", "key_techs": "1ULT", "id_model": "cccc3333", "Name": "Nvidia"},
]


def cart_id(row: dict) -> str:
    """The id the storefront puts in the cart: base64url of 'TICKER - INTERVAL - KEY - ID'."""
    return b64url(f"{row['ticker']} - {row['interval']} - {row['key_techs']} - {row['id_model']}")


@pytest.fixture
def settings(tmp_path):
    cat = tmp_path / "catalogue"
    cat.mkdir()
    with open(cat / "catalogue.csv", "w", newline="") as f:
        w = csv.DictWriter(f, fieldnames=list(ROWS[0]), delimiter="\t")
        w.writeheader()
        w.writerows(ROWS)
    (cat / "indicators.csv").write_text("key\texplanation\n")
    private = tmp_path / "strategies"
    private.mkdir()
    for row in ROWS[:2]:  # the paid files, named as the factory names them
        s = Strategy(row["ticker"], row["interval"], row["key_techs"], row["id_model"], Decimal(row["Price"]), row)
        (private / s.private_file).write_text(f"//@version=5\nstrategy(\"{s.key}\")\n")
    return Settings(catalogue=cat / "catalogue.csv", strategies_dir=private, database=tmp_path / "shop.db",
                    storefront=ROOT / "storefront",
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
