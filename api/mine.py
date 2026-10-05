"""My strategies (signed in): what the account bought or claimed, its links, and its favourites.

GET /api/mine, POST /api/mine/renew, GET /api/mine/{id}/script,
PUT /api/favourites/{id}, DELETE /api/favourites/{id}.
An item is owned through a paid order whose email or payer is the account's email, or a free claim of it.
"""
import math
import time
from datetime import datetime, timezone

from fastapi import APIRouter, HTTPException, Request
from fastapi.responses import PlainTextResponse
from pydantic import BaseModel, Field

from api.auth import require_email

router = APIRouter()


def strategy_or_404(request: Request, item_id: str):
    s = request.app.state.catalogue.resolve(item_id)
    if not s:
        raise HTTPException(404, {"error": "unknown strategy"})
    return s


def iso(ts: float, date_only=False) -> str:
    d = datetime.fromtimestamp(ts, timezone.utc)
    return d.date().isoformat() if date_only else d.isoformat(timespec="seconds")


def owned(request: Request, email: str) -> dict:
    """item_key -> every link the account has for it, newest last."""
    groups = {}
    for link in sorted(request.app.state.store.owned(email), key=lambda r: r["expires"]):
        groups.setdefault(link["item_key"], []).append(link)
    return groups


def entry(request: Request, s, links: list) -> dict:
    settings, now = request.app.state.settings, time.time()
    latest = links[-1]
    valid = latest["expires"] > now and latest["count"] < settings.max_downloads
    current = s.version
    url = f"/api/download/{latest['token']}"
    return {"id": s.id, "kind": latest["kind"], "date": iso(min(x["date"] for x in links), True),
            "order": latest["paypal_id"] or None, "expires": iso(latest["expires"]),
            "days_left": max(0, math.ceil((latest["expires"] - now) / 86400)), "valid": valid,
            "url": url if valid else None, "zip": f"{url}?format=zip" if valid else None,
            "version": latest["version"], "update": current if current > latest["version"] else None,
            "row": s.as_row()}


@router.get("/api/mine")
def mine(request: Request):
    email = require_email(request)
    catalogue, items = request.app.state.catalogue, []
    for key, links in owned(request, email).items():
        s = catalogue.resolve(key)
        if s:  # a strategy taken out of the catalogue has nothing left to show or download
            items.append(entry(request, s, links))
    items.sort(key=lambda e: e["date"], reverse=True)
    favourites = []
    for fav in request.app.state.store.favourites(email):
        s = catalogue.resolve(fav["item_key"])
        if s:
            favourites.append({"id": s.id, "alerts": fav["alerts"], "row": s.as_row()})
    return {"email": email, "items": items, "favourites": favourites}


class Renew(BaseModel):
    id: str = Field(..., max_length=200)


@router.post("/api/mine/renew")
def renew(body: Renew, request: Request):
    """A new link when the old one expired or ran out, or for a newer version; otherwise the same entry,
    so the button cannot be used to reset the download limit of a working link."""
    email = require_email(request)
    s = strategy_or_404(request, body.id)
    links = owned(request, email).get(s.key)
    if not links:
        raise HTTPException(404, {"error": "this strategy is not in your account"})
    current = entry(request, s, links)
    if current["valid"] and not current["update"]:
        return current
    state = request.app.state
    state.store.renew(links[-1], state.settings.download_days, s.version, email)
    return entry(request, s, owned(request, email)[s.key])


@router.get("/api/mine/{item_id}/script")
def script(item_id: str, request: Request):
    """The full script for its owner (the tree's owner view); never cached by the browser."""
    email = require_email(request)
    s = strategy_or_404(request, item_id)
    if s.key not in owned(request, email):
        raise HTTPException(404, {"error": "this strategy is not in your account"})
    path = request.app.state.settings.strategies_dir / s.private_file
    if not path.is_file():
        raise HTTPException(404, {"error": "file missing from private storage", "item": s.key})
    return PlainTextResponse(path.read_text(encoding="utf-8", errors="replace"),
                             headers={"Cache-Control": "private, no-store"})


class Alerts(BaseModel):
    nv: bool = False  # a new version
    pd: bool = False  # a price drop
    bd: bool = False  # in a bundle


class Favourite(BaseModel):
    alerts: Alerts = Alerts()


@router.put("/api/favourites/{item_id}")
def put_favourite(item_id: str, request: Request, body: Favourite = Favourite()):
    email = require_email(request)
    s = strategy_or_404(request, item_id)
    request.app.state.store.set_favourite(email, s.key, body.alerts.model_dump())
    return {"id": s.id, "alerts": body.alerts.model_dump(), "row": s.as_row()}


@router.delete("/api/favourites/{item_id}")
def delete_favourite(item_id: str, request: Request):
    email = require_email(request)
    s = strategy_or_404(request, item_id)
    request.app.state.store.delete_favourite(email, s.key)
    return {"id": s.id, "deleted": True}
