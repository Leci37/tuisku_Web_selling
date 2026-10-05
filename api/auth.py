"""Passwordless sign-in for My strategies: an emailed link opens a session kept in an HttpOnly cookie.

POST /api/auth/login, GET /api/auth/verify, POST /api/auth/logout, GET /api/me.
"""
import re

from fastapi import APIRouter, HTTPException, Request, Response
from fastapi.responses import RedirectResponse
from pydantic import BaseModel, Field

router = APIRouter()

COOKIE = "ef_session"
EMAIL = re.compile(r"^[^@\s]+@[^@\s]+\.[^@\s.]+$")
# Unused sign-in links one address may have at once: stops the form from being used to flood an inbox.
MAX_PENDING_LOGINS = 5


def valid_email(email: str) -> str:
    """The address, trimmed and lower-cased, or a 400."""
    email = (email or "").strip().lower()
    if len(email) > 254 or not EMAIL.match(email):
        raise HTTPException(400, {"error": "invalid email"})
    return email


def base_url(request: Request) -> str:
    """Where links in emails point: PUBLIC_URL behind a proxy, else the address this request came to."""
    return request.app.state.settings.public_url or str(request.base_url).rstrip("/")


def current_email(request: Request):
    token = request.cookies.get(COOKIE)
    return request.app.state.store.session_email(token) if token else None


def require_email(request: Request) -> str:
    email = current_email(request)
    if not email:
        raise HTTPException(401, {"error": "sign in to see your strategies"})
    return email


class Login(BaseModel):
    email: str = Field(..., max_length=254)
    lang: str = Field("en", max_length=8)


@router.post("/api/auth/login")
def login(body: Login, request: Request):
    """Same answer whether or not the address has bought anything: nobody can probe for customers."""
    state = request.app.state
    email = valid_email(body.email)
    if state.store.pending_logins(email) >= MAX_PENDING_LOGINS:
        return {"sent": True}
    token = state.store.add_login_token(email, state.settings.login_minutes)
    link = f"{base_url(request)}/api/auth/verify?token={token}"
    sent = state.mailer.send(email, "Your Edgefolio sign-in link",
                             f"Open this link to sign in to My strategies on Edgefolio:\n\n{link}\n\n"
                             f"It works once, for {state.settings.login_minutes} minutes. "
                             "If you did not ask for it, ignore this email.\n")
    if not sent:
        raise HTTPException(502, {"error": "the email could not be sent; try again later"})
    return {"sent": True}


@router.get("/api/auth/verify")
def verify(request: Request, token: str = ""):
    state = request.app.state
    email = state.store.use_login_token(token) if token else None
    if not email:
        return RedirectResponse("/mine?signin=expired", status_code=303)
    session = state.store.add_session(email, state.settings.session_days)
    response = RedirectResponse("/mine", status_code=303)
    response.set_cookie(COOKIE, session, max_age=state.settings.session_days * 86400, path="/", httponly=True,
                        samesite="lax", secure=request.url.scheme == "https" or
                        state.settings.public_url.startswith("https:"))
    return response


@router.post("/api/auth/logout")
def logout(request: Request, response: Response):
    token = request.cookies.get(COOKIE)
    if token:
        request.app.state.store.end_session(token)
    response.delete_cookie(COOKIE, path="/")
    return {"email": None}


@router.get("/api/me")
def me(request: Request):
    return {"email": current_email(request)}
