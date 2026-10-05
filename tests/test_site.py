"""The real catalogue, the served storefront, and what must never be public again."""
import csv
import re

from api.catalogue import Catalogue
from api.settings import ROOT

STOREFRONT = ROOT / "storefront"


def test_real_catalogue_loads_one_row_per_strategy():
    cat = Catalogue(ROOT / "catalogue" / "catalogue.csv")
    assert len(cat) > 2000
    with open(ROOT / "catalogue" / "catalogue.csv", newline="") as f:
        rows = list(csv.DictReader(f, delimiter="\t"))
    assert len(rows) == len(cat), "catalogue/publish.py keeps one row per strategy"
    assert "pine_path" not in rows[0], "the location of the paid file must not be published"
    for col in ("path_stra", "path_candle", "path_ico", "pine_path_shadow"):
        assert all(r[col].startswith("assets/") and (STOREFRONT / r[col]).is_file() for r in rows[:200]), col


def test_pages_serve_the_storefront(client):
    index = (STOREFRONT / "index.html").read_bytes()
    for path in ("/", "/mine", "/thanks?token=X", "/s/AAPL_1Day_1ADX_aaaa1111", "/s/AAPL_1Day_1ADX_aaaa1111/tree"):
        r = client.get(path)
        assert r.status_code == 200 and r.content == index and r.headers["content-type"].startswith("text/html"), path


def test_security_headers_on_every_response(client):
    for path in ("/", "/api/config", "/api/strategies?size=1", "/favicon.svg", "/no-such-page"):
        h = client.get(path).headers
        assert "script-src 'self';" in h["content-security-policy"] and "frame-ancestors 'none'" in h[
            "content-security-policy"], path
        assert h["x-content-type-options"] == "nosniff"
        assert h["referrer-policy"] == "strict-origin-when-cross-origin"


def test_the_browser_no_longer_downloads_the_catalogue(client):
    for path in ("/catalogue/catalogue.csv", "/catalogue/indicators.csv", "/catalogue/bundles.json"):
        assert client.get(path).status_code == 404, path


def test_no_codes_prices_or_paid_files_in_the_browser_code():
    js = "\n".join(p.read_text(errors="ignore") for p in STOREFRONT.rglob("*.js") if "vendor" not in p.parts)
    html = "\n".join(p.read_text(errors="ignore") for p in STOREFRONT.rglob("*.html"))
    for text in (js, html):
        assert "pine_TW_b" not in text and "raw.githubusercontent.com" not in text
        assert not re.search(r"ZnJlZT|Ym9sc2FfZnJlZQ", text), "old base64 discount codes"
        assert "actions.order.create" not in text, "the amount must be set by the server"
        assert "<script>" not in text and not re.search(r"\son[a-z]+=\"", text), "no inline JS (CSP)"
    assert not (STOREFRONT / "assets" / "strategies").exists()


def test_only_cut_previews_are_public():
    paid = {s.private_file for s in Catalogue(ROOT / "catalogue" / "catalogue.csv")}
    pine = list(STOREFRONT.rglob("*.pine"))
    assert pine and all(p.parent == STOREFRONT / "assets" / "previews" for p in pine)
    assert not paid & {p.name for p in STOREFRONT.rglob("*")}, "a paid script is in storefront/"
