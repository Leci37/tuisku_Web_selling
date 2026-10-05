"""The real catalogue, the served storefront, and what must never be public again."""
import csv
import re

from api.catalogue import Catalogue
from api.settings import ROOT


def test_real_catalogue_loads_one_row_per_strategy():
    cat = Catalogue(ROOT / "catalogue" / "catalogue.csv")
    assert len(cat) > 2000
    with open(ROOT / "catalogue" / "catalogue.csv", newline="") as f:
        rows = list(csv.DictReader(f, delimiter="\t"))
    assert len(rows) == len(cat), "catalogue/publish.py keeps one row per strategy"
    assert "pine_path" not in rows[0], "the location of the paid file must not be published"
    for col in ("path_stra", "path_candle", "path_ico", "pine_path_shadow"):
        assert all(r[col].startswith("assets/") and (ROOT / "storefront" / r[col]).is_file() for r in rows[:200]), col


def test_storefront_and_catalogue_are_served(client):
    assert client.get("/").status_code == 200
    assert client.get("/thankyou.html").status_code == 200
    assert client.get("/catalogue/catalogue.csv").status_code == 200


def test_no_codes_prices_or_paid_files_in_the_browser_code():
    js = "\n".join(p.read_text(errors="ignore") for p in (ROOT / "storefront").rglob("*.js") if "vendor" not in p.parts)
    html = "\n".join(p.read_text(errors="ignore") for p in (ROOT / "storefront").rglob("*.html"))
    for text in (js, html):
        assert "pine_TW_b" not in text and "raw.githubusercontent.com" not in text
        assert not re.search(r"ZnJlZT|Ym9sc2FfZnJlZQ", text), "old base64 discount codes"
        assert "actions.order.create" not in text, "the amount must be set by the server"
    assert not (ROOT / "storefront" / "assets" / "strategies").exists()
