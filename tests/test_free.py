"""Free strategies for an email: only price 0, the link goes by email, news only when ticked and confirmed,
a daily limit, the email in the visitor's language."""
import io
import re
import sqlite3
import time
import zipfile
from concurrent.futures import ThreadPoolExecutor
from decimal import Decimal
from urllib.parse import urlsplit

import pytest

from api.catalogue import Strategy
from api.store import DAY, Store, digest
from conftest import ROWS
from test_formats import ONE_TREE

FREE = ROWS[2]
FREE_ID = "NVDA_1Day_1ULT_cccc3333"


@pytest.fixture
def free_file(settings):
    """The free strategy's full script in private storage (the shared fixture only has the paid ones)."""
    s = Strategy(FREE["ticker"], FREE["interval"], FREE["key_techs"], FREE["id_model"], Decimal("0"), FREE)
    path = settings.strategies_dir / s.private_file
    path.write_text(ONE_TREE)
    return path


def claim(client, email="ana@example.com", news=False, item=FREE_ID):
    return client.post("/api/free", json={"id": item, "email": email, "news": news, "lang": "es"})


def emailed_link(client, email="ana@example.com") -> str:
    body = client.app.state.store.outbox(email)[-1]["body"]
    return re.search(r"/api/download/[\w-]+", body).group(0)


def test_claim_emails_a_link_to_the_script_and_its_zip(client, free_file):
    r = claim(client)
    assert r.status_code == 200 and r.json() == {"sent": True}
    [mail] = client.app.state.store.outbox("ana@example.com")
    assert mail["status"] == "console" and "Nvidia" in mail["subject"]
    assert "http://testserver/api/download/" in mail["body"] and "?format=zip" in mail["body"]
    link = emailed_link(client)
    f = client.get(link)
    assert f.status_code == 200 and f.text == ONE_TREE and f.headers["cache-control"] == "private, no-store"
    assert 'filename="Tuisku_NVDA_1Day_1ULT_cccc3333.pine"' in f.headers["content-disposition"]
    z = zipfile.ZipFile(io.BytesIO(client.get(link + "?format=zip").content))
    assert "Tuisku_NVDA_1Day_1ULT_cccc3333.md" in z.namelist()
    assert "→ Buy (score 1.00)" in z.read("Tuisku_NVDA_1Day_1ULT_cccc3333.md").decode()


def test_news_is_recorded_only_when_ticked(client, free_file):
    claim(client, "quiet@example.com", news=False)
    claim(client, "Keen@Example.com", news=True)
    db = client.app.state.store.db
    assert [tuple(r) for r in db.execute("SELECT email, news, source, lang FROM subscribers")] == [
        ("keen@example.com", 1, "free", "es")]
    claims = {r["email"]: r["news"] for r in db.execute("SELECT email, news FROM free_claims")}
    assert claims == {"quiet@example.com": 0, "keen@example.com": 1}
    assert all(r[0] for r in db.execute("SELECT consent_at FROM free_claims"))


def test_only_free_strategies(client, free_file, ids):
    assert claim(client, item=ids[0]).status_code == 400, "a paid strategy never goes out for an email"
    assert claim(client, item="NOPE_1Day_X_00000000").status_code == 400
    assert claim(client, email="not-an-email").status_code == 400
    assert claim(client, item=ids[2]).status_code == 200, "the old cart id works too"
    assert len(client.app.state.store.outbox()) == 1


def test_ten_claims_per_email_per_day(client, free_file):
    assert [claim(client).status_code for _ in range(11)] == [200] * 10 + [429]
    assert claim(client, "other@example.com").status_code == 200


def test_missing_file_sends_nothing(client):
    r = claim(client)
    assert r.status_code == 404 and client.app.state.store.outbox() == []


def test_free_links_expire_and_run_out(client, free_file, settings):
    settings.max_downloads = 2
    claim(client)
    link = emailed_link(client)
    assert [client.get(link).status_code for _ in range(3)] == [200, 200, 429]
    settings.download_days = -1
    claim(client, "late@example.com")
    assert client.get(emailed_link(client, "late@example.com")).status_code == 410


def confirm_link(client, email) -> str:
    """The news confirmation link of the last email to `email`, as a path, or None."""
    body = client.app.state.store.outbox(email)[-1]["body"]
    found = re.search(r"https?://\S+/api/news/confirm\?token=[\w-]+", body)
    return found and f"{urlsplit(found.group(0)).path}?{urlsplit(found.group(0)).query}"


def opened(client, path) -> str:
    r = client.get(path, follow_redirects=False)
    assert r.status_code == 303
    return r.headers["location"]


def test_news_counts_only_once_confirmed_from_the_email(client, free_file):
    store = client.app.state.store
    claim(client, "keen@example.com", news=True)
    row = store.db.execute("SELECT * FROM subscribers").fetchone()
    assert row["news"] == 1 and row["confirmed_at"] is None and row["consent_at"]
    assert store.subscribers() == [], "typing someone's address subscribes nobody"
    body = store.outbox("keen@example.com")[-1]["body"]
    assert "http://testserver/api/news/confirm?token=" in body and "Confírmalo con este enlace" in body
    link = confirm_link(client, "keen@example.com")
    assert row["token_hash"] == digest(link.split("token=")[1]), "only the hash is kept"
    assert opened(client, link) == "/?news=confirmed"
    [sub] = store.subscribers()
    assert sub["email"] == "keen@example.com" and sub["lang"] == "es" and sub["confirmed_at"] >= sub["consent_at"]
    assert opened(client, link) == "/?news=expired", "used"
    for bad in ("made-up", ""):
        assert opened(client, f"/api/news/confirm?token={bad}") == "/?news=expired"
    claim(client, "keen@example.com", news=True)
    assert confirm_link(client, "keen@example.com") is None, "already confirmed: nothing more to ask"
    assert [s["email"] for s in store.subscribers()] == ["keen@example.com"]


def test_no_news_writes_nothing(client, free_file):
    claim(client, "quiet@example.com", news=False)
    assert client.app.state.store.db.execute("SELECT COUNT(*) FROM subscribers").fetchone()[0] == 0
    assert "/api/news/" not in client.app.state.store.outbox("quiet@example.com")[-1]["body"]


def test_only_the_latest_recent_confirmation_link_works(client, free_file):
    store = client.app.state.store
    claim(client, "keen@example.com", news=True)
    first = confirm_link(client, "keen@example.com")
    claim(client, "keen@example.com", news=True)
    latest = confirm_link(client, "keen@example.com")
    assert opened(client, first) == "/?news=expired" and store.subscribers() == []
    store.db.execute("UPDATE subscribers SET consent_at=?", (time.time() - 31 * DAY,))
    assert opened(client, latest) == "/?news=expired", "a month-old request is not confirmed any more"
    claim(client, "keen@example.com", news=True)
    assert opened(client, confirm_link(client, "keen@example.com")) == "/?news=confirmed"


def test_subscribers_from_before_the_double_opt_in_are_not_confirmed(tmp_path):
    path = tmp_path / "old.db"
    old = sqlite3.connect(path)
    old.executescript("""
        CREATE TABLE subscribers (email TEXT PRIMARY KEY, news INTEGER NOT NULL, consent_at REAL NOT NULL,
            source TEXT NOT NULL, lang TEXT NOT NULL DEFAULT '');
        INSERT INTO subscribers VALUES ('old@example.com', 1, 1, 'free', 'es');
    """)
    old.commit()
    old.close()
    store = Store(path)
    assert store.subscribers() == []
    assert store.confirm_news(store.request_news("old@example.com", "free", "es")) == "old@example.com"
    assert [s["email"] for s in store.subscribers()] == ["old@example.com"]
    Store(path)  # opening it again changes nothing


def test_free_email_in_the_visitors_language(client, free_file):
    store = client.app.state.store
    client.post("/api/free", json={"id": FREE_ID, "email": "de@example.com", "news": True, "lang": "de"})
    [mail] = store.outbox("de@example.com")
    assert mail["subject"] == "Deine kostenlose Strategie: Nvidia (NVDA, 1Day)"
    assert "Die Links gelten 7 Tage und für bis zu 10 Downloads" in mail["body"]
    assert "unter http://testserver/mine an" in mail["body"] and "Bestätige das mit diesem Link" in mail["body"]
    client.post("/api/free", json={"id": FREE_ID, "email": "fr@example.com", "lang": "fr-CA"})
    [mail] = store.outbox("fr@example.com")
    assert mail["subject"] == "Votre stratégie gratuite : Nvidia (NVDA, 1Day)" and "/api/news/" not in mail["body"]
    client.post("/api/free", json={"id": FREE_ID, "email": "x@example.com", "lang": "<b>"})
    [mail] = store.outbox("x@example.com")
    assert mail["subject"] == "Your free strategy: Nvidia (NVDA, 1Day)" and "{" not in mail["body"]
    langs = dict(store.db.execute("SELECT email, lang FROM free_claims").fetchall())
    assert langs == {"de@example.com": "de", "fr@example.com": "fr", "x@example.com": "en"}


def test_parallel_free_downloads_never_pass_the_limit(client, free_file, settings, monkeypatch):
    settings.max_downloads = 2
    claim(client)
    link = emailed_link(client)
    store = client.app.state.store
    read = store.free_claim

    def slow(token):  # every request reads the count before any of them adds to it
        row = read(token)
        time.sleep(0.2)
        return row
    monkeypatch.setattr(store, "free_claim", slow)
    with ThreadPoolExecutor(10) as pool:
        codes = sorted(pool.map(lambda _: client.get(link).status_code, range(10)))
    assert codes == [200] * 2 + [429] * 8
    assert read(link.rsplit("/", 1)[1])["count"] == 2
