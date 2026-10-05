"""My strategies: what an account owns, its links, renewals and updates, the owner's script, favourites;
and the one-zip download of a whole order."""
import csv
import io
import time
import zipfile
from concurrent.futures import ThreadPoolExecutor

from fastapi.testclient import TestClient

from api.app import create_app
from test_accounts import sign_in
from test_formats import ONE_TREE
from test_free import FREE_ID, claim, free_file  # noqa: F401 (free_file is a fixture)

AAPL, MSFT = "AAPL_1Day_1ADX_aaaa1111", "MSFT_1Hour_2BB0_bbbb2222"


def buy(client, items):
    order = client.post("/api/orders", json={"items": items})
    assert order.status_code == 200, order.text
    r = client.post(f"/api/orders/{order.json()['id']}/capture")
    assert r.status_code == 200, r.text
    return r.json()


def mine(client):
    r = client.get("/api/mine")
    assert r.status_code == 200, r.text
    return r.json()


def test_everything_needs_a_session(client):
    assert client.get("/api/mine").status_code == 401
    assert client.post("/api/mine/renew", json={"id": AAPL}).status_code == 401
    assert client.get(f"/api/mine/{AAPL}/script").status_code == 401
    assert client.put(f"/api/favourites/{AAPL}", json={}).status_code == 401
    assert client.delete(f"/api/favourites/{AAPL}").status_code == 401


def test_a_purchase_made_signed_in(client):
    sign_in(client)
    receipt = buy(client, [AAPL])
    body = mine(client)
    assert body["email"] == "ana@example.com" and body["favourites"] == []
    [item] = body["items"]
    assert item["id"] == AAPL and item["kind"] == "paid" and item["order"] == receipt["order_id"]
    assert item["valid"] and item["days_left"] == 7 and item["version"] == 1 and item["update"] is None
    assert item["url"] == receipt["downloads"][0]["url"] and item["zip"] == item["url"] + "?format=zip"
    assert item["row"]["id"] == AAPL and item["row"]["name"] == "Apple"
    assert len(item["date"]) == 10 and item["expires"].endswith("+00:00")
    assert client.get(item["url"]).status_code == 200


def test_a_purchase_made_signed_out_is_found_by_the_paypal_email(client):
    buy(client, [AAPL, MSFT])          # FakePayPal's payer is buyer@example.com
    sign_in(client, "someone@example.com")
    assert mine(client)["items"] == [], "nobody else sees it"
    sign_in(client, "buyer@example.com")
    assert sorted(i["id"] for i in mine(client)["items"]) == [AAPL, MSFT]


def test_free_claims_are_listed(client, free_file):  # noqa: F811
    claim(client, "ana@example.com")
    sign_in(client)
    [item] = mine(client)["items"]
    assert item["id"] == FREE_ID and item["kind"] == "free" and item["order"] is None and item["valid"]


def test_an_expired_link_is_renewed_once(client, settings):
    sign_in(client)
    settings.download_days = -1
    old = buy(client, [AAPL])["downloads"][0]["url"]
    [item] = mine(client)["items"]
    assert not item["valid"] and item["url"] is None and item["days_left"] == 0
    settings.download_days = 7
    renewed = client.post("/api/mine/renew", json={"id": AAPL}).json()
    assert renewed["valid"] and renewed["url"] != old and client.get(renewed["url"]).status_code == 200
    assert client.get(old).status_code == 410
    again = client.post("/api/mine/renew", json={"id": AAPL}).json()
    assert again["url"] == renewed["url"], "a working link is not replaced (its download limit stays)"


def test_a_link_that_ran_out_is_renewed(client, settings):
    sign_in(client)
    settings.max_downloads = 1
    url = buy(client, [AAPL])["downloads"][0]["url"]
    client.get(url)
    assert mine(client)["items"][0]["valid"] is False
    assert client.post("/api/mine/renew", json={"id": AAPL}).json()["valid"] is True


def test_a_new_version_is_offered_and_delivered(client, settings, paypal):
    sign_in(client)
    buy(client, [AAPL])
    with open(settings.catalogue, newline="") as f:
        rows = list(csv.DictReader(f, delimiter="\t"))
    for r in rows:
        r["version"] = "2" if r["ticker"] == "AAPL" else "1"
    with open(settings.catalogue, "w", newline="") as f:
        w = csv.DictWriter(f, fieldnames=list(rows[0]), delimiter="\t")
        w.writeheader()
        w.writerows(rows)
    later = TestClient(create_app(settings, paypal))   # the shop restarted with the new catalogue
    later.cookies = client.cookies
    [item] = mine(later)["items"]
    assert item["valid"] and item["version"] == 1 and item["update"] == 2
    got = later.post("/api/mine/renew", json={"id": AAPL}).json()
    assert got["version"] == 2 and got["update"] is None and got["url"] != item["url"]


def test_the_owner_reads_the_full_script(client, settings, free_file):  # noqa: F811
    claim(client, "ana@example.com")
    sign_in(client)
    r = client.get(f"/api/mine/{FREE_ID}/script")
    assert r.status_code == 200 and r.text == ONE_TREE and r.headers["cache-control"] == "private, no-store"
    assert client.get(f"/api/mine/{AAPL}/script").status_code == 404, "not bought"
    assert client.post("/api/mine/renew", json={"id": AAPL}).status_code == 404
    assert client.get("/api/mine/NOPE/script").status_code == 404


def test_favourites_with_alerts(client):
    sign_in(client)
    r = client.put(f"/api/favourites/{AAPL}", json={"alerts": {"nv": True, "pd": True}})
    assert r.status_code == 200 and r.json()["alerts"] == {"nv": True, "pd": True, "bd": False}
    client.put(f"/api/favourites/{MSFT}", json={})
    client.put(f"/api/favourites/{AAPL}", json={"alerts": {"bd": True}})
    favs = mine(client)["favourites"]
    assert [(f["id"], f["alerts"]) for f in favs] == [(AAPL, {"nv": False, "pd": False, "bd": True}),
                                                       (MSFT, {"nv": False, "pd": False, "bd": False})]
    assert favs[0]["row"]["ticker"] == "AAPL"
    assert client.delete(f"/api/favourites/{AAPL}").json() == {"id": AAPL, "deleted": True}
    assert [f["id"] for f in mine(client)["favourites"]] == [MSFT]
    assert client.put("/api/favourites/NOPE", json={}).status_code == 404
    sign_in(client, "other@example.com")
    assert mine(client)["favourites"] == []


def test_download_all_in_one_zip(client, settings):
    receipt = buy(client, [AAPL, MSFT])
    url = receipt["download_all"]
    assert url.startswith("/api/download/all?t=")
    r = client.get(url + "&t=made-up")
    assert r.status_code == 200 and r.headers["content-type"] == "application/zip"
    z = zipfile.ZipFile(io.BytesIO(r.content))
    assert sorted(z.namelist()) == ["Tuisku_AAPL_1Day_1ADX_aaaa1111.pine", "Tuisku_MSFT_1Hour_2BB0_bbbb2222.pine"]
    assert client.get("/api/download/all?t=made-up").status_code == 404
    assert client.get("/api/download/all").status_code == 404
    settings.max_downloads = 2
    client.get(url)
    assert client.get(url).status_code == 429, "each file counts one download"


def test_parallel_download_all_never_passes_the_limit(client, settings, monkeypatch):
    settings.max_downloads = 2
    receipt = buy(client, [AAPL, MSFT])
    store = client.app.state.store
    read = store.link

    def slow(token):  # every request reads the counts before any of them adds to them
        row = read(token)
        time.sleep(0.1)
        return row
    monkeypatch.setattr(store, "link", slow)
    with ThreadPoolExecutor(8) as pool:
        answers = list(pool.map(lambda _: client.get(receipt["download_all"]), range(8)))
    sent = [n for r in answers if r.status_code == 200 for n in zipfile.ZipFile(io.BytesIO(r.content)).namelist()]
    assert sorted(sent) == sorted([f"Tuisku_{AAPL}.pine", f"Tuisku_{MSFT}.pine"] * 2), "each file twice at most"
    assert {r.status_code for r in answers} <= {200, 429}
    assert [read(d["url"].rsplit("/", 1)[1])["count"] for d in receipt["downloads"]] == [2, 2]


def test_one_script_through_two_links_is_sent_and_counted_once(client, settings):
    sign_in(client)
    settings.download_days = -1
    old = buy(client, [AAPL])["downloads"][0]["url"].rsplit("/", 1)[1]
    settings.download_days = 7
    new = client.post("/api/mine/renew", json={"id": AAPL}).json()["url"].rsplit("/", 1)[1]
    other = client.app.state.store.renew({**client.app.state.store.link(new), "kind": "paid"}, 7, 1, "")
    r = client.get(f"/api/download/all?t={old}&t={new}&t={other}")
    assert zipfile.ZipFile(io.BytesIO(r.content)).namelist() == [f"Tuisku_{AAPL}.pine"]
    store = client.app.state.store
    assert (store.link(new)["count"], store.link(other)["count"]) == (1, 0)
