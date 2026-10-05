"""Passwordless accounts: the emailed sign-in link, the session cookie, the stored hashes, the outbox."""
import re
import smtplib
import sqlite3
from urllib.parse import urlsplit

import pytest
from fastapi.testclient import TestClient

from api.app import create_app
from api.mail import Mailer
from api.store import Store


def sign_in(client, email="ana@example.com"):
    """What a person does: ask for the link, open it from the email (read here from the outbox)."""
    assert client.post("/api/auth/login", json={"email": email, "lang": "en"}).json() == {"sent": True}
    body = client.app.state.store.outbox(email.strip().lower())[-1]["body"]
    link = re.search(r"https?://\S+/api/auth/verify\?token=\S+", body).group(0)
    url = urlsplit(link)
    r = client.get(f"{url.path}?{url.query}", follow_redirects=False)
    assert r.status_code == 303 and r.headers["location"] == "/mine"
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
    token = re.search(r"token=(\S+)", client.app.state.store.outbox()[-1]["body"]).group(1)
    assert client.get(f"/api/auth/verify?token={token}", follow_redirects=False).headers["location"] == "/mine"
    client.cookies.clear()
    again = client.get(f"/api/auth/verify?token={token}", follow_redirects=False)
    assert again.status_code == 303 and again.headers["location"] == "/mine?signin=expired"
    assert client.get("/api/me").json() == {"email": None}


def test_expired_or_made_up_link(client, settings):
    settings.login_minutes = -1
    client.post("/api/auth/login", json={"email": "ana@example.com"})
    token = re.search(r"token=(\S+)", client.app.state.store.outbox()[-1]["body"]).group(1)
    for t in (token, "made-up", ""):
        r = client.get(f"/api/auth/verify?token={t}", follow_redirects=False)
        assert r.headers["location"] == "/mine?signin=expired"


def test_only_hashes_are_stored(client):
    sign_in(client)
    session = client.cookies.get("ef_session")
    sent = client.app.state.store.outbox()[-1]["body"]
    dump = "\n".join(client.app.state.store.db.iterdump())
    assert session not in dump
    assert re.search(r"token=(\S+)", sent).group(1) not in dump.replace(sent, "")


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
    assert client.post("/api/auth/login", json={"email": "x" * 250 + "@example.com"}).status_code == 422


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
    assert store.link("tok")["version"] == 1
    assert store.issue_links("OLD-1", ["AAPL - 1Day - 1ADX - aaaa1111"], 7) == {"AAPL - 1Day - 1ADX - aaaa1111": "tok"}
    store.add_order("NEW-1", ["k"], "", "1.00", "USD", email="B@x.com", lines=[{"id": "k"}])
    assert store.order("NEW-1")["email"] == "b@x.com" and store.order("NEW-1")["lines"] == [{"id": "k"}]
    Store(path)  # opening it again changes nothing


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
