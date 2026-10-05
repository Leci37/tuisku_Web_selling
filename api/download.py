"""The full scripts leave the server only through links the shop issued, for a paid order or a free claim.

GET /api/download/{token}               the .pine; ?format=zip adds the .md rules and the beta .py/.js
GET /api/download/all?t=<tok>&t=<tok>   the .pine of every valid link in one zip (the thank-you page)
"""
import io
import time
import zipfile

from fastapi import APIRouter, HTTPException, Query, Request, Response
from fastapi.responses import FileResponse

from api import formats

router = APIRouter()

PRIVATE = {"Cache-Control": "private, no-store"}
MAX_TOKENS = 100


def checked(request: Request, token: str):
    """(strategy, path) for a usable link, else the HTTP error a person should see."""
    state = request.app.state
    link = state.store.link(token)
    if link and link["status"] != "PAID":
        link = None
    link = link or state.store.free_claim(token)
    if not link:
        raise HTTPException(404, {"error": "unknown download link"})
    if link["expires"] < time.time():
        raise HTTPException(410, {"error": "this download link has expired: get a new one in My strategies, "
                                           f"or write to {state.settings.contact_email}"})
    if link["count"] >= state.settings.max_downloads:
        raise HTTPException(429, {"error": "download limit reached for this link"})
    strategy = state.catalogue.resolve(link["item_key"])
    if not strategy:
        raise HTTPException(404, {"error": "this strategy is no longer in the catalogue"})
    path = state.settings.strategies_dir / strategy.private_file
    if not path.is_file():
        raise HTTPException(404, {"error": "file missing from private storage", "item": strategy.key})
    return strategy, path


def attachment(name: str) -> dict:
    return {**PRIVATE, "Content-Disposition": f'attachment; filename="{name}"'}


# Declared before /{token} so "all" is never taken for a token.
@router.get("/api/download/all")
def download_all(request: Request, t: list[str] = Query([])):
    tokens = list(dict.fromkeys(t))[:MAX_TOKENS]
    files, first_error = {}, None
    for token in tokens:
        try:
            strategy, path = checked(request, token)
        except HTTPException as e:
            first_error = first_error or e
            continue
        files[(token, strategy.download_name)] = path
    if not files:
        raise first_error or HTTPException(404, {"error": "no download links given"})
    buf = io.BytesIO()
    with zipfile.ZipFile(buf, "w", zipfile.ZIP_DEFLATED) as z:
        for (token, name), path in files.items():
            if name not in z.namelist():
                z.write(path, name)
            request.app.state.store.count_download(token)
    return Response(buf.getvalue(), media_type="application/zip", headers=attachment("edgefolio-strategies.zip"))


@router.get("/api/download/{token}")
def download(token: str, request: Request, format: str = "pine"):
    strategy, path = checked(request, token)
    request.app.state.store.count_download(token)
    if format == "zip":
        stem = strategy.file
        data = formats.build_zip(path.read_text(encoding="utf-8", errors="replace"), stem,
                                 request.app.state.settings.contact_email)
        return Response(data, media_type="application/zip", headers=attachment(f"{stem}.zip"))
    return FileResponse(path, filename=strategy.download_name, media_type="text/plain", headers=PRIVATE)
