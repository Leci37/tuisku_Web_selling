"""Passwordless sign-in for My strategies, in two steps, so that neither a mail scanner opening the
emailed link nor another site sending a token can sign anybody in:

1. POST /api/auth/login {email, lang} emails <PUBLIC_URL>/mine?signin=<token> (LOGIN_MINUTES, single use).
2. That page asks whose link it is (POST /api/auth/peek {token} -> {email}, null when it is used or
   expired; nothing is used up) and signs
   in only when the person confirms: POST /api/auth/verify {token} -> {email} and the ef_session cookie.
   Both take a JSON body: a form on another site cannot send one (FastAPI answers 422 to anything else)
   and a cross-site fetch with it needs CORS, which the shop does not allow.

GET /api/auth/verify?token= (the links in emails sent before) only redirects to step 2.
POST /api/auth/logout, GET /api/me.
"""
import re
from email.utils import parseaddr
from urllib.parse import quote

from fastapi import APIRouter, HTTPException, Query, Request, Response
from fastapi.responses import RedirectResponse
from pydantic import BaseModel, Field

from api.web import base_url, language, limited, set_cookie

router = APIRouter()

COOKIE = "ef_session"
EMAIL = re.compile(r"^[^@\s]+@[^@\s]+\.[^@\s.]+$")
# Characters that make an address mean something else to a mail program: a list (, ;), a display name
# or comment (< > ( ) "), a route or group ([ ] :), an escape (\). Whitespace (a header line break) too.
NOT_IN_EMAIL = frozenset(',;<>()"[]:\\')
# Unused sign-in links one address may have at once: stops the form from being used to flood an inbox.
MAX_PENDING_LOGINS = 5
# Sign-in emails one IP may ask for (POST /api/auth/login): LOGIN_LIMIT per LOGIN_WINDOW seconds.
LOGIN_LIMIT, LOGIN_WINDOW = 10, 600


def valid_email(email: str) -> str:
    """The address, trimmed and lower-cased, or a 400."""
    email = (email or "").strip().lower()
    if (len(email) > 254 or email.count("@") != 1
            or any(c in NOT_IN_EMAIL or c.isspace() or not c.isprintable() for c in email)
            or parseaddr(email) != ("", email) or not EMAIL.match(email)):
        raise HTTPException(400, {"error": "invalid email"})
    return email


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
    lang: str = Field("en", max_length=35)


class SignInToken(BaseModel):
    token: str = Field("", max_length=200)


def expired():
    return HTTPException(400, {"error": "expired"})


@router.post("/api/auth/login")
def login(body: Login, request: Request):
    """Same answer whether or not the address has bought anything: nobody can probe for customers."""
    state = request.app.state
    email = valid_email(body.email)
    limited(request, "login")
    token = state.store.add_login_token(email, state.settings.login_minutes, max_pending=MAX_PENDING_LOGINS)
    if token is None:
        return {"sent": True}
    lang, texts = language(body.lang), state.texts
    sent = state.mailer.send(email, texts.get("mailSignInSubject", lang),
                             texts.get("mailSignInBody", lang, link=f"{base_url(request)}/mine?signin={token}",
                                       minutes=state.settings.login_minutes))
    if not sent:  # a link nobody received: gone, so it neither works nor counts toward MAX_PENDING_LOGINS
        state.store.delete_login_token(token)
        raise HTTPException(502, {"error": "the email could not be sent; try again later"})
    return {"sent": True}


@router.post("/api/auth/peek")
def peek(body: SignInToken, request: Request):
    """Whose sign-in link this is, so the page can ask "Sign in as ...?"; the link stays usable.
    A used or unknown link is nobody's ({"email": null}), an answer rather than an error, so the page
    that opens an old link has nothing to log."""
    email = request.app.state.store.peek_login_token(body.token) if body.token else None
    return {"email": email or None}


@router.post("/api/auth/verify")
def verify(body: SignInToken, request: Request, response: Response):
    state = request.app.state
    email = state.store.use_login_token(body.token) if body.token else None
    if not email:
        raise expired()
    old = request.cookies.get(COOKIE)
    if old:  # signing in as someone else on this browser ends the session it had
        state.store.end_session(old)
    session = state.store.add_session(email, state.settings.session_days)
    set_cookie(response, request, COOKIE, session, state.settings.session_days)
    return {"email": email}


@router.get("/api/auth/verify")
def verify_link(token: str = Query("", max_length=200)):
    """Links emailed before the two-step sign-in: to the page that asks, using up nothing."""
    return RedirectResponse(f"/mine?signin={quote(token, safe='') if token else 'expired'}", status_code=303)


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
