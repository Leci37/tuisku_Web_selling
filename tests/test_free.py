"""Free strategies for an email: only price 0, the link goes by email, news only when ticked, a daily limit."""
import io
import re
import zipfile
from decimal import Decimal

import pytest

from api.catalogue import Strategy
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
