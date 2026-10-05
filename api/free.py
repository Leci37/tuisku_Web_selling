"""POST /api/free: a free strategy for an email address. The link goes by email, never in the answer,
so the address is real; news is a separate opt-in, recorded only when ticked (GDPR)."""
import time

from fastapi import APIRouter, HTTPException, Request
from pydantic import BaseModel, Field

from api.auth import base_url, valid_email

router = APIRouter()

DAILY_CLAIMS = 10


class FreeClaim(BaseModel):
    id: str = Field(..., max_length=200)
    email: str = Field(..., max_length=254)
    news: bool = False
    lang: str = Field("en", max_length=8)


@router.post("/api/free")
def claim(body: FreeClaim, request: Request):
    state = request.app.state
    strategy = state.catalogue.resolve(body.id)
    if not strategy:
        raise HTTPException(400, {"error": "unknown strategy"})
    if strategy.price != 0:
        raise HTTPException(400, {"error": "only free strategies can be downloaded for an email"})
    email = valid_email(body.email)
    if state.store.claims_since(email, time.time() - 86400) >= DAILY_CLAIMS:
        raise HTTPException(429, {"error": "too many free downloads for this email today; try again tomorrow"})
    if not (state.settings.strategies_dir / strategy.private_file).is_file():
        raise HTTPException(404, {"error": "file missing from private storage", "item": strategy.key})
    days = state.settings.download_days
    token = state.store.add_free_claim(email, strategy.key, body.news, body.lang, days, strategy.version)
    if body.news:
        state.store.subscribe(email, "free", body.lang)
    base, name = base_url(request), strategy.row.get("Name") or strategy.ticker
    sent = state.mailer.send(email, f"Your free strategy: {name} ({strategy.ticker}, {strategy.interval})",
                             f"Here is your free Edgefolio strategy for TradingView, {name} "
                             f"({strategy.ticker}, {strategy.interval}).\n\n"
                             f"Pine script: {base}/api/download/{token}\n"
                             f"Script + rules in plain words + Python/JavaScript (zip): "
                             f"{base}/api/download/{token}?format=zip\n\n"
                             f"The link works for {days} days and {state.settings.max_downloads} downloads. "
                             f"Sign in with this email at {base}/mine to see your strategies and get new links.\n\n"
                             "To use it: copy the script, open the Pine Editor in TradingView, paste it, "
                             "click \"Save\" and then \"Add to chart\".\n")
    if not sent:
        raise HTTPException(502, {"error": "the email could not be sent; try again later"})
    return {"sent": True}
