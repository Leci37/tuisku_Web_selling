"""Passwordless accounts: the emailed sign-in link, the two-step sign-in, the session cookie, the stored
hashes, the outbox and the emails' languages."""
import json
import re
import smtplib
import sqlite3
from urllib.parse import parse_qs, urlsplit

import pytest
from fastapi.testclient import TestClient

from api.app import create_app
from api.auth import MAX_PENDING_LOGINS
from api.mail import Mailer
from api.settings import ROOT
from api.store import Store
from api.texts import MAIL_KEYS
from api.web import LANGS


def emailed_token(client, email="ana@example.com") -> str:
    """The token of the sign-in link in the last email to `email` (read here from the outbox)."""
    body = client.app.state.store.outbox(email)[-1]["body"]
    link = re.search(r"https?://\S+/mine\?signin=[\w-]+", body).group(0)
    return parse_qs(urlsplit(link).query)["signin"][0]


def sign_in(client, email="ana@example.com"):
    """What a person does: ask for the link, open it from the email (the page shows whose it is), confirm."""
    assert client.post("/api/auth/login", json={"email": email, "lang": "en"}).json() == {"sent": True}
    clean = email.strip().lower()
    token = emailed_token(client, clean)
    assert client.post("/api/auth/peek", json={"token": token}).json() == {"email": clean}
    r = client.post("/api/auth/verify", json={"token": token})
    assert r.status_code == 200 and r.json() == {"email": clean}
    return r


def test_sign_in_sets_an_httponly_session_cookie(client):
    assert client.get("/api/me").json() == {"email": None}
    r = sign_in(client, "Ana@Example.com ")
    cookie = r.headers["set-cookie"]
    assert cookie.startswith("ef_session=") and "HttpOnly" in cookie and "samesite=lax" in cookie.lower()
    assert "Secure" not in cookie, "plain http (local runs) would otherwise drop it"
    assert client.get("/api/me").json() == {"email": "ana@example.com"}


def test_cookie_is_secure_over_https(settings, paypal):
    client = TestClient(create_app(settings, paypal), base_url="https://testserver")
    assert "Secure" in sign_in(client).headers["set-cookie"]
    assert client.get("/api/me").json()["email"] == "ana@example.com"


def test_link_works_once(client):
    client.post("/api/auth/login", json={"email": "ana@example.com"})
    token = emailed_token(client)
    assert client.post("/api/auth/verify", json={"token": token}).json() == {"email": "ana@example.com"}
    client.cookies.clear()
    for path in ("/api/auth/peek", "/api/auth/verify"):
        again = client.post(path, json={"token": token})
        assert again.status_code == 400 and again.json() == {"detail": {"error": "expired"}}, path
    assert client.get("/api/me").json() == {"email": None}


def test_expired_or_made_up_link(client, settings):
    settings.login_minutes = -1
    client.post("/api/auth/login", json={"email": "ana@example.com"})
    token = emailed_token(client)
    for t in (token, "made-up", ""):
        for path in ("/api/auth/peek", "/api/auth/verify"):
            r = client.post(path, json={"token": t})
            assert r.status_code == 400 and r.json()["detail"] == {"error": "expired"}, (path, t)
    assert "set-cookie" not in r.headers and client.get("/api/me").json() == {"email": None}


def test_opening_the_link_signs_nobody_in(client):
    """A mail scanner that opens (or even renders) the link uses nothing up: only the person's click signs in."""
    client.post("/api/auth/login", json={"email": "ana@example.com", "lang": "en"})
    body = client.app.state.store.outbox()[-1]["body"]
    token = emailed_token(client)
    assert f"http://testserver/mine?signin={token}" in body and "/api/auth/" not in body
    assert client.get(f"/mine?signin={token}").status_code == 200       # the page itself
    for _ in range(3):
        assert client.post("/api/auth/peek", json={"token": token}).json() == {"email": "ana@example.com"}
    assert client.get("/api/me").json() == {"email": None} and "ef_session" not in client.cookies
    # links in emails sent before: GET /api/auth/verify only leads to the page that asks
    old = client.get(f"/api/auth/verify?token={token}", follow_redirects=False)
    assert old.status_code == 303 and old.headers["location"] == f"/mine?signin={token}"
    assert "set-cookie" not in old.headers and client.get("/api/me").json() == {"email": None}
    assert client.get("/api/auth/verify", follow_redirects=False).headers["location"] == "/mine?signin=expired"
    assert client.post("/api/auth/verify", json={"token": token}).json() == {"email": "ana@example.com"}
    assert client.get("/api/me").json() == {"email": "ana@example.com"}


def test_another_site_cannot_post_a_token(client):
    """Login CSRF: a form elsewhere can only send form-encoded or text/plain bodies, never JSON (refused)."""
    client.post("/api/auth/login", json={"email": "attacker@example.com"})
    token = emailed_token(client, "attacker@example.com")
    for headers, content in (({"content-type": "text/plain"}, json.dumps({"token": token})),
                             ({"content-type": "application/x-www-form-urlencoded"}, f"token={token}")):
        r = client.post("/api/auth/verify", content=content, headers=headers)
        assert r.status_code == 400 and r.json() == {"detail": {"error": "body is invalid"}}
        assert "set-cookie" not in r.headers
    assert client.get("/api/me").json() == {"email": None}
    assert client.post("/api/auth/peek", json={"token": token}).status_code == 200, "still unused"


def test_signing_in_again_ends_the_old_session(client):
    sign_in(client)
    old = client.cookies.get("ef_session")
    sign_in(client, "other@example.com")
    assert client.app.state.store.session_email(old) is None
    assert client.get("/api/me").json() == {"email": "other@example.com"}


def test_only_hashes_are_stored(client):
    sign_in(client)
    session = client.cookies.get("ef_session")
    sent = client.app.state.store.outbox()[-1]["body"]
    dump = "\n".join(client.app.state.store.db.iterdump())
    assert session not in dump
    assert re.search(r"signin=([\w-]+)", sent).group(1) not in dump.replace(sent, "")


def test_logout(client):
    sign_in(client)
    r = client.post("/api/auth/logout")
    assert r.json() == {"email": None} and 'ef_session=""' in r.headers["set-cookie"]
    assert client.get("/api/me").json() == {"email": None}


def test_same_answer_for_anyone_and_no_flooding(client):
    for _ in range(8):
        assert client.post("/api/auth/login", json={"email": "nobody@example.com"}).json() == {"sent": True}
    assert len(client.app.state.store.outbox("nobody@example.com")) == 5, "at most 5 unused links at once"
    for bad in ("", "no-at-sign", "a@b", "two@@example.com", "sp ace@example.com"):
        assert client.post("/api/auth/login", json={"email": bad}).status_code == 400
    r = client.post("/api/auth/login", json={"email": "x" * 250 + "@example.com"})  # over 254 characters
    assert r.status_code == 400 and r.json() == {"detail": {"error": "email is invalid"}}


def test_a_failed_email_leaves_no_sign_in_link(client, monkeypatch):
    store, mailer = client.app.state.store, client.app.state.mailer
    send = mailer.send
    monkeypatch.setattr(mailer, "send", lambda to, subject, body: False)
    for _ in range(MAX_PENDING_LOGINS + 1):  # unsent links never fill the cap of pending ones
        assert client.post("/api/auth/login", json={"email": "ana@example.com"}).status_code == 502
    assert store.db.execute("SELECT COUNT(*) FROM login_tokens").fetchone()[0] == 0
    monkeypatch.setattr(mailer, "send", send)
    sign_in(client)
    assert store.db.execute("SELECT COUNT(*) FROM login_tokens").fetchone()[0] == 1


def test_old_database_files_gain_the_new_columns(tmp_path):
    path = tmp_path / "old.db"
    old = sqlite3.connect(path)
    old.executescript("""
        CREATE TABLE orders (paypal_id TEXT PRIMARY KEY, items TEXT NOT NULL, code TEXT NOT NULL, total TEXT NOT NULL,
            currency TEXT NOT NULL, status TEXT NOT NULL, payer TEXT NOT NULL DEFAULT '', created REAL NOT NULL);
        CREATE TABLE downloads (token TEXT PRIMARY KEY, paypal_id TEXT NOT NULL REFERENCES orders(paypal_id),
            item_key TEXT NOT NULL, expires REAL NOT NULL, count INTEGER NOT NULL DEFAULT 0);
        INSERT INTO orders VALUES ('OLD-1', '["AAPL - 1Day - 1ADX - aaaa1111"]', '', '79.00', 'USD', 'PAID', 'p@x.com', 1);
        INSERT INTO downloads VALUES ('tok', 'OLD-1', 'AAPL - 1Day - 1ADX - aaaa1111', 9e12, 0);
    """)
    old.commit()
    old.close()
    store = Store(path)
    order = store.order("OLD-1")
    assert order["email"] == "" and order["lines"] == [] and order["items"] == ["AAPL - 1Day - 1ADX - aaaa1111"]
    assert order["buyer_hash"] == "", "an old order has no buyer cookie: only the payer's account sees its links"
    assert store.link("tok")["version"] == 1
    assert store.issue_links("OLD-1", ["AAPL - 1Day - 1ADX - aaaa1111"], 7) == {"AAPL - 1Day - 1ADX - aaaa1111": "tok"}
    store.add_order("NEW-1", ["k"], "", "1.00", "USD", email="B@x.com", lines=[{"id": "k"}])
    assert store.order("NEW-1")["email"] == "b@x.com" and store.order("NEW-1")["lines"] == [{"id": "k"}]
    Store(path)  # opening it again changes nothing


def test_sign_in_email_in_the_visitors_language(client):
    for i, (lang, subject, words) in enumerate((
            ("es", "Tu enlace para entrar en Edgefolio", "Funciona una sola vez y durante 15 minutos"),
            ("de", "Dein Anmeldelink für Edgefolio", "Er funktioniert einmal und 15 Minuten lang"),
            ("zh", "你的 Edgefolio 登录链接", "15 分钟内有效"),
            ("ar", "رابط تسجيل الدخول إلى Edgefolio", "ولمدة 15 دقيقة"),
            ("pt-PT", "A tua ligação para entrar no Edgefolio", "durante 15 minutos"),
            ("xx", "Your Edgefolio sign-in link", "It works once, for 15 minutes"),
            ("", "Your Edgefolio sign-in link", "It works once, for 15 minutes"))):
        assert client.post("/api/auth/login", json={"email": f"p{i}@example.com", "lang": lang}).status_code == 200
        [mail] = client.app.state.store.outbox(f"p{i}@example.com")
        assert mail["subject"] == subject and words in mail["body"], lang
        assert re.search(r"\nhttp://testserver/mine\?signin=[\w-]+\n", mail["body"]), "the link on a line of its own"
        assert "{" not in mail["body"], "every placeholder filled in"


def test_every_email_text_is_in_every_language():
    data = json.loads((ROOT / "storefront" / "i18n" / "storefront.ui.json").read_text(encoding="utf-8"))
    for key in MAIL_KEYS:
        names = sorted(re.findall(r"\{(\w+)\}", data[key]["en"]))
        for lang in LANGS:
            text = data[key][lang]
            assert text.strip() and sorted(re.findall(r"\{(\w+)\}", text)) == names, (key, lang)
            assert text != data[key]["en"] or lang == "en", (key, lang)


class FakeSMTP:
    sent, fail = [], False

    def __init__(self, host, port, timeout):
        self.calls = [("connect", host, port)]

    def __enter__(self):
        return self

    def __exit__(self, *exc):
        return False

    def starttls(self, context):
        self.calls.append(("starttls",))

    def login(self, user, password):
        self.calls.append(("login", user))

    def send_message(self, msg):
        if FakeSMTP.fail:
            raise smtplib.SMTPRecipientsRefused({msg["To"]: (550, b"no")})
        FakeSMTP.sent.append((self.calls, msg))


@pytest.fixture
def smtp(monkeypatch, settings):
    monkeypatch.setattr(smtplib, "SMTP", FakeSMTP)
    FakeSMTP.sent, FakeSMTP.fail = [], False
    settings.mail_mode, settings.smtp_host, settings.smtp_user = "smtp", "mail.example.com", "shop"
    return FakeSMTP


def test_smtp_sends_with_starttls_and_records_it(settings, smtp, tmp_path):
    mailer = Mailer(settings, Store(tmp_path / "m.db"))
    assert mailer.send("ana@example.com", "Hi", "Body") is True
    calls, msg = smtp.sent[0]
    assert calls == [("connect", "mail.example.com", 587), ("starttls",), ("login", "shop")]
    assert msg["From"] == "Edgefolio <sales@tuisku.eu>" and msg["To"] == "ana@example.com"
    assert [m["status"] for m in mailer.store.outbox()] == ["sent"]


def test_a_failed_mail_is_recorded_not_raised(settings, smtp, paypal):
    smtp.fail = True
    client = TestClient(create_app(settings, paypal))
    r = client.post("/api/auth/login", json={"email": "ana@example.com"})
    assert r.status_code == 502 and r.json()["detail"]["error"]
    [mail] = client.app.state.store.outbox()
    assert mail["status"] == "failed" and "550" in mail["error"]
