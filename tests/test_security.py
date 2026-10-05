"""Links never built from the Host header, the cookies' Secure flag, the API docs only on local runs,
strict email addresses, per-IP limits on the forms that send email, the emails' language codes."""
import re

import pytest
from fastapi.testclient import TestClient

from api import auth, free
from api.app import create_app
from api.settings import Settings
from api.web import RateLimit, language
from test_accounts import emailed_token
from test_free import FREE_ID, claim, free_file  # noqa: F401 (free_file is a fixture)

EVIL = {"host": "evil.example"}
ENV = ("PAYPAL_MODE", "PAYPAL_CLIENT_ID", "PAYPAL_CLIENT_SECRET", "PUBLIC_URL", "MAIL_MODE", "SMTP_HOST")


@pytest.fixture
def env(monkeypatch):
    for name in ENV:
        monkeypatch.delenv(name, raising=False)

    def setenv(**values):
        for k, v in values.items():
            monkeypatch.setenv(k, v)
    return setenv


def test_public_url_is_required_with_real_paypal(env):
    assert Settings.from_env().public_url == "", "a local run (fake PayPal, console mail) may go without"
    env(PAYPAL_MODE="live", PAYPAL_CLIENT_ID="id", PAYPAL_CLIENT_SECRET="secret")
    with pytest.raises(ValueError, match="PUBLIC_URL is required"):
        Settings.from_env()
    env(PUBLIC_URL="https://shop.example/")
    assert Settings.from_env().public_url == "https://shop.example"


def test_public_url_is_required_to_send_real_email(env):
    env(MAIL_MODE="smtp", SMTP_HOST="mail.example")
    with pytest.raises(ValueError, match="PUBLIC_URL is required"):
        Settings.from_env()
    for bad in ("shop.example", "ftp://shop.example", "https://", "https://shop.example/?x=1"):
        env(PUBLIC_URL=bad)
        with pytest.raises(ValueError, match="PUBLIC_URL must be"):
            Settings.from_env()
    env(PUBLIC_URL="https://shop.example")
    assert Settings.from_env().mail_mode == "smtp"


def test_links_never_come_from_the_host_header(client, settings, ids, paypal, free_file):  # noqa: F811
    sent = []
    create = paypal.create_order
    paypal.create_order = lambda *a, **kw: sent.append(kw) or create(*a, **kw)
    settings.public_url = "https://shop.example"
    assert client.post("/api/auth/login", json={"email": "ana@example.com"}, headers=EVIL).status_code == 200
    assert client.post("/api/free", json={"id": FREE_ID, "email": "bo@example.com", "news": True},
                       headers=EVIL).status_code == 200
    order = client.post("/api/orders", json={"items": [ids[0]]}, headers=EVIL).json()
    mails = client.app.state.store.outbox()
    links = [u for m in mails for u in re.findall(r"https?://[^\s)]+", m["body"])]
    links += [order["approve_url"], sent[0]["return_url"], sent[0]["cancel_url"]]
    assert len(links) == 1 + 4 + 3, links  # sign-in; .pine, .zip, My strategies, news; PayPal's three
    assert all(u.startswith("https://shop.example/") for u in links), links
    assert "evil.example" not in "".join(m["body"] for m in mails)
    # only a local run with no PUBLIC_URL falls back to the address the request came to
    settings.public_url = ""
    client.post("/api/auth/login", json={"email": "dev@example.com"}, headers=EVIL)
    assert "http://evil.example/mine?signin=" in client.app.state.store.outbox("dev@example.com")[-1]["body"]


def test_cookies_are_secure_when_the_shop_is_https(client, settings, ids):
    settings.public_url = "https://shop.example"  # TLS ends at the proxy: the request itself is plain http
    order = client.post("/api/orders", json={"items": [ids[0]]})
    assert order.headers["set-cookie"].startswith("ef_buyer=") and "Secure" in order.headers["set-cookie"]
    client.post("/api/auth/login", json={"email": "ana@example.com"})
    r = client.post("/api/auth/verify", json={"token": emailed_token(client)})
    assert r.headers["set-cookie"].startswith("ef_session=") and "Secure" in r.headers["set-cookie"]


def test_api_docs_only_on_local_runs(settings, paypal):
    local = TestClient(create_app(settings, paypal))
    assert local.get("/api/docs").status_code == 200 and local.get("/api/openapi.json").status_code == 200
    settings.paypal_mode, settings.public_url = "live", "https://shop.example"
    shop = TestClient(create_app(settings, paypal))
    for path in ("/api/docs", "/api/openapi.json", "/docs", "/redoc", "/openapi.json"):
        assert shop.get(path).status_code == 404, path
    assert local.get("/redoc").status_code == 404


BAD = ("a,b@example.com", "a;b@example.com", "<a@example.com>", "Ana <a@example.com>", "a(b)@example.com",
       '"a"@example.com', "a[b]@example.com", "a:b@example.com", "a b@example.com", "a\tb@example.com",
       "a@b@example.com", "a@example.com\r\nBcc: x@example.com", "a@exam ple.com", "a\x00@example.com",
       "a\\b@example.com", "a@example.com,b@example.com")


def test_addresses_a_mail_program_would_read_differently(client, free_file):  # noqa: F811
    for bad in BAD:
        assert client.post("/api/auth/login", json={"email": bad}).status_code == 400, bad
        assert claim(client, bad).status_code == 400, bad
    assert client.app.state.store.outbox() == []
    for good in ("ana.maria+shop@example.co.uk", "  Ana@Example.COM ", "o'neil@example.ie", "josé@example.es"):
        assert client.post("/api/auth/login", json={"email": good}).json() == {"sent": True}, good
    assert [m["to_addr"] for m in client.app.state.store.outbox()] == [
        "ana.maria+shop@example.co.uk", "ana@example.com", "o'neil@example.ie", "josé@example.es"]


def test_sign_in_emails_are_limited_per_ip(client):
    for i in range(auth.LOGIN_LIMIT):
        assert client.post("/api/auth/login", json={"email": f"p{i}@example.com"}).status_code == 200
    r = client.post("/api/auth/login", json={"email": "one-more@example.com"})
    assert r.status_code == 429 and r.json() == {"detail": {"error": "too many requests"}}
    assert client.app.state.store.outbox("one-more@example.com") == []
    other = TestClient(client.app, client=("203.0.113.9", 50000))
    assert other.post("/api/auth/login", json={"email": "one-more@example.com"}).status_code == 200


def test_free_claims_are_limited_per_ip(client, free_file):  # noqa: F811
    for i in range(free.FREE_LIMIT):
        assert claim(client, f"p{i // 5}@example.com").status_code == 200
    r = claim(client, "fresh@example.com")
    assert r.status_code == 429 and r.json() == {"detail": {"error": "too many requests"}}
    assert client.app.state.store.outbox("fresh@example.com") == []
    other = TestClient(client.app, client=("198.51.100.7", 50000))
    assert claim(other, "fresh@example.com").status_code == 200


def test_the_limit_is_a_sliding_window():
    now = [0.0]
    limit = RateLimit(3, 60, clock=lambda: now[0])
    assert [limit.hit("ip") for _ in range(4)] == [True, True, True, False]
    assert limit.hit("other")
    now[0] = 30
    assert not limit.hit("ip"), "refused hits do not count, but the window has not moved past the first ones"
    now[0] = 60.5
    assert [limit.hit("ip") for _ in range(4)] == [True, True, True, False]
    quiet = RateLimit(1, 10, clock=lambda: now[0])
    quiet.SWEEP_EVERY = 4
    for key in "abc":
        quiet.hit(key)
    now[0] = 100
    quiet.hit("d")
    assert set(quiet.hits) == {"d"}, "addresses that went quiet are forgotten"


def test_language_codes():
    assert [language(x) for x in ("es", "PT-br", "zh_Hans", "ar-SA", "hi", "de", "fr", "en", "xx", "", None,
                                  "english", "<b>")] == [
        "es", "pt", "zh", "ar", "hi", "de", "fr", "en", "en", "en", "en", "en", "en"]


def test_invalid_requests_answer_like_the_rest_of_the_api(client, ids):
    cases = (("post", "/api/free", {"json": {}}, "id"),
             ("post", "/api/free", {"json": {"id": "x", "email": "a@example.com", "news": "maybe"}}, "news"),
             ("post", "/api/quote", {"json": {"items": "not a list"}}, "items"),
             ("post", "/api/quote", {"json": {"items": [ids[0], 7]}}, "items"),
             ("post", "/api/quote", {"content": "{broken", "headers": {"content-type": "application/json"}}, "body"),
             ("post", "/api/quote", {"json": ["a list"]}, "body"),
             ("get", "/api/strategies?page=0", {}, "page"),
             ("put", "/api/favourites/X", {"json": {"alerts": {"nv": "loud"}}}, "alerts.nv"),
             ("get", "/api/auth/verify?token=" + "x" * 201, {}, "token"))
    for method, path, kw, field in cases:
        r = getattr(client, method)(path, **kw)
        assert r.status_code == 400 and r.json() == {"detail": {"error": f"{field} is invalid"}}, (path, r.text)
        assert r.headers["x-content-type-options"] == "nosniff", "the security headers too"
