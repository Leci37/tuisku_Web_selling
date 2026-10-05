"""Chart thumbnails and exchange rates."""
import importlib.util
import io
import json

from PIL import Image

from api import media
from api.settings import ROOT

STEM = "AAPL_1Day_1C00_ac87f0dc_profit"


def test_thumbnail_is_a_small_webp_made_once(client, settings):
    r = client.get(f"/thumbs/{STEM}.webp")
    assert r.status_code == 200 and r.headers["content-type"] == "image/webp"
    assert "immutable" in r.headers["cache-control"]
    img = Image.open(io.BytesIO(r.content))
    assert img.format == "WEBP" and img.width == 640
    png = ROOT / "storefront" / "assets" / "charts" / f"{STEM}.png"
    assert len(r.content) < png.stat().st_size / 3
    cached = settings.thumbs_dir / f"{STEM}.webp"
    made = cached.stat().st_mtime_ns
    assert client.get(f"/thumbs/{STEM}.webp").content == r.content and cached.stat().st_mtime_ns == made


def test_only_existing_charts(client, settings):
    for path in ("/thumbs/NOPE_profit.webp", "/thumbs/..%2F..%2Fapi%2Fsettings.webp", "/thumbs/.hidden.webp",
                 f"/thumbs/{STEM}.png.webp", "/thumbs/%2Fetc%2Fpasswd.webp"):
        assert client.get(path).status_code == 404, path
    assert not settings.thumbs_dir.exists() or not any(settings.thumbs_dir.iterdir())


def test_without_pillow_the_png_is_served(client, monkeypatch):
    monkeypatch.setattr(media, "Image", None)
    r = client.get(f"/thumbs/{STEM}.webp", follow_redirects=False)
    assert r.status_code == 307 and r.headers["location"] == f"/assets/charts/{STEM}.png"


def test_fx(client, settings):
    body = client.get("/api/fx").json()
    assert body["base"] == "USD" and body["source"] == "example"
    assert body["rates"] == {"USD": 1, "EUR": 0.92, "INR": 83.5, "CNY": 7.2, "SAR": 3.75}
    settings.fx.unlink()
    assert client.get("/api/fx").json()["rates"] == {"USD": 1}


def test_update_fx_adds_the_pegged_riyal(tmp_path, monkeypatch):
    spec = importlib.util.spec_from_file_location("update_fx", ROOT / "tools" / "update_fx.py")
    update_fx = importlib.util.module_from_spec(spec)
    spec.loader.exec_module(update_fx)

    class Answer:
        def raise_for_status(self):
            pass

        def json(self):
            return {"amount": 1.0, "base": "USD", "date": "2026-10-02", "rates": {"EUR": 0.85, "INR": 88.7}}

    monkeypatch.setattr(update_fx.httpx, "get", lambda *a, **k: Answer())
    out = tmp_path / "fx.json"
    update_fx.write(update_fx.fetch(), out)
    data = json.loads(out.read_text())
    assert data["date"] == "2026-10-02" and data["rates"] == {"USD": 1, "EUR": 0.85, "INR": 88.7, "SAR": 3.75}
    assert "ECB" in data["source"]
