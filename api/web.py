"""What several routes need from a request: the shop's address for links, the cookie flags, the
visitor's IP for the per-IP limits, and the language of the emails.

Links that leave the shop (the emails, PayPal's return address) use PUBLIC_URL. The address the
request came to is only a fallback for local runs (fake PayPal and console mail, the only setup in
which Settings.from_env allows no PUBLIC_URL): anyone can send a Host header, and a sign-in link
built from it would carry the token to their server.
"""
import threading
import time
from collections import deque

from fastapi import HTTPException, Request, Response

# The storefront's languages: the emails are written in one of them.
LANGS = ("es", "en", "pt", "fr", "de", "zh", "ar", "hi")


def base_url(request: Request) -> str:
    return request.app.state.settings.public_url or str(request.base_url).rstrip("/")


def secure(request: Request) -> bool:
    """Behind a proxy that ends TLS the request looks like plain http: PUBLIC_URL says the truth."""
    return request.url.scheme == "https" or request.app.state.settings.public_url.startswith("https:")


def set_cookie(response: Response, request: Request, name: str, value: str, days: int):
    response.set_cookie(name, value, max_age=days * 86400, path="/", httponly=True, samesite="lax",
                        secure=secure(request))


def language(value: str) -> str:
    """One of LANGS ('pt-BR' -> 'pt'); anything else -> 'en'."""
    code = (value or "").strip().lower().replace("_", "-").split("-")[0]
    return code if code in LANGS else "en"


def client_ip(request: Request) -> str:
    # Behind a proxy, uvicorn must be started with --proxy-headers (and --forwarded-allow-ips) for this
    # to be the visitor's address rather than the proxy's.
    return request.client.host if request.client else "unknown"


class RateLimit:
    """At most `limit` hits per key in any `window` seconds: a sliding window kept in memory, so it is
    per process and starts empty after a restart (enough to stop a script from flooding inboxes)."""

    SWEEP_EVERY = 1000  # hits between two clean-ups of keys that have gone quiet

    def __init__(self, limit: int, window: float, clock=time.monotonic):
        self.limit, self.window, self.clock = limit, window, clock
        self.hits = {}
        self.calls = 0
        self.lock = threading.Lock()

    def hit(self, key: str) -> bool:
        """True and counted if `key` is under the limit; False (not counted) otherwise."""
        now = self.clock()
        with self.lock:
            self.calls += 1
            if self.calls % self.SWEEP_EVERY == 0:
                self.hits = {k: q for k, q in self.hits.items() if q and q[-1] > now - self.window}
            q = self.hits.setdefault(key, deque())
            while q and q[0] <= now - self.window:
                q.popleft()
            if len(q) >= self.limit:
                return False
            q.append(now)
            return True


def limited(request: Request, name: str):
    """429 when this IP has used up the limit called `name` (see create_app)."""
    if not request.app.state.limits[name].hit(client_ip(request)):
        raise HTTPException(429, {"error": "too many requests"})
