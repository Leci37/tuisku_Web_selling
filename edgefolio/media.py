"""GET /thumbs/{stem}.webp (small charts for cards and tables) and GET /api/fx (rates for the "≈" prices).

A chart PNG is about 100 KB; a card needs a 640px WebP of a tenth of that. Each one is made on its
first request and kept in THUMBS_DIR, so publishing a catalogue never has to build 5,668 of them.
"""
import json
import os
import re
import tempfile

from fastapi import APIRouter, HTTPException, Request
from fastapi.responses import FileResponse, RedirectResponse

try:
    from PIL import Image
except ImportError:  # the shop still works: the browser gets the full PNG
    Image = None

router = APIRouter()

WIDTH = 640
QUALITY = 80
STEM = re.compile(r"^[A-Za-z0-9][A-Za-z0-9_+=-]{0,200}$")
FOREVER = {"Cache-Control": "public, max-age=31536000, immutable"}


def charts(request: Request) -> set:
    """Names of the charts that exist: the only stems a thumbnail can be asked for."""
    state = request.app.state
    if getattr(state, "chart_stems", None) is None:
        folder = state.settings.storefront / "assets" / "charts"
        state.chart_stems = {p.stem for p in folder.glob("*.png")} if folder.is_dir() else set()
    return state.chart_stems


def make_thumb(src, dest):
    with Image.open(src) as im:
        im.load()
        if im.width > WIDTH:
            im = im.resize((WIDTH, round(im.height * WIDTH / im.width)), Image.LANCZOS)
        if im.mode not in ("RGB", "RGBA"):
            im = im.convert("RGBA")
        dest.parent.mkdir(parents=True, exist_ok=True)
        # written aside and renamed, so two first requests never serve half a file
        fd, tmp = tempfile.mkstemp(dir=dest.parent, suffix=".tmp")
        try:
            with os.fdopen(fd, "wb") as f:
                im.save(f, "WEBP", quality=QUALITY, method=4)
            os.replace(tmp, dest)
        except BaseException:
            os.unlink(tmp)
            raise


@router.get("/thumbs/{stem}.webp")
def thumb(stem: str, request: Request):
    if not STEM.match(stem) or stem not in charts(request):
        raise HTTPException(404, {"error": "unknown chart"})
    settings = request.app.state.settings
    if Image is None:
        return RedirectResponse(f"/assets/charts/{stem}.png", status_code=307)
    dest = settings.thumbs_dir / f"{stem}.webp"
    if not dest.is_file():
        make_thumb(settings.storefront / "assets" / "charts" / f"{stem}.png", dest)
    return FileResponse(dest, media_type="image/webp", headers=FOREVER)


@router.get("/api/fx")
def fx(request: Request):
    """USD to the shop's local currencies; PayPal always charges USD, these only draw the "≈" figure."""
    path = request.app.state.settings.fx
    try:
        data = json.loads(path.read_text(encoding="utf-8"))
    except (OSError, ValueError):
        return {"base": "USD", "date": None, "rates": {"USD": 1}, "source": "none"}
    return {"base": data.get("base", "USD"), "date": data.get("date"), "rates": data.get("rates", {}),
            "source": data.get("source", "")}
