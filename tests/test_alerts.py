"""The favourites' alerts: one email per person, in their language, for what changed since the last run."""
import csv
import json

from api import alerts
from api.catalogue import Catalogue
from tests.conftest import BUNDLES, ROWS, strategy_id
from tests.test_accounts import sign_in

AAPL, MSFT, TSLA = strategy_id(ROWS[0]), strategy_id(ROWS[1]), strategy_id(ROWS[3])


def follow(client, item, lang="es", **alerts_on):
    r = client.put(f"/api/favourites/{item}", json={"alerts": alerts_on, "lang": lang})
    assert r.status_code == 200, r.text


def republish(settings, rows, bundles):
    """What publish.py and an edit of bundles.json do between two runs."""
    with open(settings.catalogue, "w", newline="") as f:
        w = csv.DictWriter(f, fieldnames=list(rows[0]), delimiter="\t")
        w.writeheader()
        w.writerows(rows)
    settings.bundles.write_text(json.dumps(bundles))
    return Catalogue(settings)


def run(client, settings, catalogue=None):
    st = client.app.state
    return alerts.run(catalogue or st.catalogue, st.store, st.mailer, st.texts, settings)


def mails(client, to="ana@example.com"):
    return [m for m in client.app.state.store.outbox(to) if "Edgefolio:" in m["subject"]]


def test_the_first_run_only_takes_the_picture(client, settings):
    sign_in(client)
    follow(client, TSLA, pd=True)
    assert run(client, settings)["first_run"] and mails(client) == []
    assert run(client, settings) == {"first_run": False, "emails": 0, "failed": 0, "changes": 0}


def test_changes_are_emailed_once_in_the_persons_language(client, settings):
    sign_in(client)
    follow(client, TSLA, pd=True, bd=True)
    follow(client, AAPL, nv=True)
    follow(client, MSFT)                      # a favourite with no alert on gets nothing
    run(client, settings)
    rows = [dict(r, version="2" if r["ticker"] == "AAPL" else "1") for r in ROWS]
    rows[3]["Price"], rows[1]["Price"] = "40", "60"   # TSLA and MSFT cheaper
    trio = {"key": "trio", "name_key": "bundleCrypto", "ids": [TSLA, strategy_id(ROWS[1])], "price": 90}
    result = run(client, settings, republish(settings, rows, BUNDLES + [trio]))
    assert result["emails"] == 1 and result["changes"] == 3   # AAPL version, TSLA price + bundle, MSFT price
    (mail,) = mails(client)
    assert mail["subject"] == "Edgefolio: novedades de tus estrategias favoritas"
    body = mail["body"]
    assert "Tesla (TSLA · 1C00): ahora $40.00, antes $50.00." in body
    assert "ahora está en el pack «" in body and "$90.00 por 2 estrategias" in body
    assert "Apple (AAPL · 1ADX): versión nueva, v2." in body
    assert "Microsoft" not in body, "no alert switched on for it"
    assert f"/s/{TSLA}" in body and "/mine" in body
    assert run(client, settings, Catalogue(settings))["emails"] == 0, "the same change is not sent twice"


def test_a_price_rise_or_switched_off_alert_sends_nothing(client, settings):
    sign_in(client)
    follow(client, TSLA, pd=False, nv=True)
    run(client, settings)
    rows = [dict(r) for r in ROWS]
    rows[3]["Price"] = "40"
    assert run(client, settings, republish(settings, rows, BUNDLES))["emails"] == 0
    rows[3]["Price"] = "70"
    assert run(client, settings, republish(settings, rows, BUNDLES))["emails"] == 0


def test_an_unknown_language_falls_back_to_english(client, settings):
    sign_in(client)
    follow(client, TSLA, lang="xx", pd=True)
    run(client, settings)
    rows = [dict(r) for r in ROWS]
    rows[3]["Price"] = "45"
    run(client, settings, republish(settings, rows, BUNDLES))
    (mail,) = mails(client)
    assert mail["subject"] == "Edgefolio: news about your favourite strategies"
    assert "Tesla (TSLA · 1C00): now $45.00, was $50.00." in mail["body"]
