"""POST /api/free: a free strategy for an email address. The link goes by email, never in the answer,
so the address is real. News is a separate opt-in, recorded only when ticked and only counted once the
person confirms it from the email (GDPR double opt-in): GET /api/news/confirm."""
import secrets

from fastapi import APIRouter, HTTPException, Query, Request
from fastapi.responses import RedirectResponse
from pydantic import BaseModel, Field

from api.auth import valid_email
from api.web import base_url, language, limited

router = APIRouter()

DAILY_CLAIMS = 10  # per email
# Free claims one IP may make (POST /api/free): FREE_LIMIT per FREE_WINDOW seconds.
FREE_LIMIT, FREE_WINDOW = 20, 3600


class FreeClaim(BaseModel):
    id: str = Field(..., max_length=200)
    email: str = Field(..., max_length=254)
    news: bool = False
    lang: str = Field("en", max_length=35)


@router.post("/api/free")
def claim(body: FreeClaim, request: Request):
    state = request.app.state
    strategy = state.catalogue.resolve(body.id)
    if not strategy:
        raise HTTPException(400, {"error": "unknown strategy"})
    if strategy.price != 0:
        raise HTTPException(400, {"error": "only free strategies can be downloaded for an email"})
    email = valid_email(body.email)
    limited(request, "free")
    if not (state.settings.strategies_dir / strategy.private_file).is_file():
        raise HTTPException(404, {"error": "file missing from private storage", "item": strategy.key})
    days, lang, texts = state.settings.download_days, language(body.lang), state.texts
    store = state.store
    token = store.add_free_claim(email, strategy.key, body.news, lang, days, strategy.version, daily_limit=DAILY_CLAIMS)
    if token is None:
        raise HTTPException(429, {"error": "too many free downloads for this email today; try again tomorrow"})
    # the pending subscription is written only once the email with its link has gone out
    news = secrets.token_urlsafe(24) if body.news and not store.news_confirmed(email) else None
    base = base_url(request)
    what = {"name": strategy.row.get("Name") or strategy.ticker, "ticker": strategy.ticker,
            "interval": strategy.interval}
    text = texts.get("mailFreeBody", lang, **what, pine=f"{base}/api/download/{token}",
                     zip=f"{base}/api/download/{token}?format=zip", days=days, n=state.settings.max_downloads,
                     mine=f"{base}/mine")
    if news:
        text += "\n" + texts.get("mailNewsConfirm", lang, link=f"{base}/api/news/confirm?token={news}")
    if not state.mailer.send(email, texts.get("mailFreeSubject", lang, **what), text):
        store.delete_free_claim(token)  # nothing was received: no claim to count, no link that works
        raise HTTPException(502, {"error": "the email could not be sent; try again later"})
    if news:
        store.request_news(email, "free", lang, token=news)
    return {"sent": True}


@router.get("/api/news/confirm")
def confirm_news(request: Request, token: str = Query("", max_length=200)):
    """The link in the free-download email: from now on the address may be sent news."""
    done = request.app.state.store.confirm_news(token) if token else None
    return RedirectResponse("/?news=confirmed" if done else "/?news=expired", status_code=303)
