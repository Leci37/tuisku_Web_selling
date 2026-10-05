"""GET /api/download/{token}: the paid script, only through a link issued for a paid order."""
import time

from fastapi import APIRouter, HTTPException, Request
from fastapi.responses import FileResponse

router = APIRouter()


@router.get("/api/download/{token}")
def download(token: str, request: Request):
    state = request.app.state
    link = state.store.link(token)
    if not link or link["status"] != "PAID":
        raise HTTPException(404, {"error": "unknown download link"})
    if link["expires"] < time.time():
        raise HTTPException(410, {"error": "this download link has expired; write to sales@tuisku.eu"})
    if link["count"] >= state.settings.max_downloads:
        raise HTTPException(429, {"error": "download limit reached for this link"})
    strategy = state.catalogue.items[link["item_key"]]
    path = state.settings.strategies_dir / strategy.private_file
    if not path.is_file():
        raise HTTPException(404, {"error": "file missing from private storage", "item": strategy.key})
    state.store.count_download(token)
    return FileResponse(path, filename=strategy.download_name, media_type="text/plain")
