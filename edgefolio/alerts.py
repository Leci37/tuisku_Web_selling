"""The favourites' alerts: one email per person when a strategy they follow gets a new version, a
lower price, or goes into a bundle. Run daily by tools/send_alerts.py (cron), not by a request.

Each run compares the catalogue with what it looked like at the previous run (table alert_state)
and then stores the new picture, so a change is announced once. The first run only takes the
picture: there is nothing to compare with yet.
"""
from decimal import Decimal

from api.settings import Settings

# alert switch (as the page stores it) -> what changed
ALERTS = {"nv": "version", "pd": "price", "bd": "bundle"}


def money(value) -> str:
    return f"${Decimal(value):,.2f}"


def picture(catalogue) -> dict:
    """{key: {version, price, bundles}} of every strategy now."""
    bundles_of = {}
    for b in catalogue.bundles.values():
        for s in b.items:
            bundles_of.setdefault(s.key, []).append(b.key)
    return {s.key: {"version": s.version, "price": str(s.price), "bundles": sorted(bundles_of.get(s.key, []))}
            for s in catalogue}


def changes(before: dict, now: dict) -> dict:
    """{key: {'version': v, 'price': (old, new), 'bundle': [keys]}} for what is new since `before`."""
    out = {}
    for key, cur in now.items():
        old = before.get(key)
        if not old:
            continue  # new in the catalogue: nobody can follow it yet
        found = {}
        if cur["version"] > old["version"]:
            found["version"] = cur["version"]
        if Decimal(cur["price"]) < Decimal(old["price"]):
            found["price"] = (old["price"], cur["price"])
        added = [b for b in cur["bundles"] if b not in old["bundles"]]
        if added:
            found["bundle"] = added
        if found:
            out[key] = found
    return out


def run(catalogue, store, mailer, texts, settings: Settings) -> dict:
    """Send what is due and store the new picture; returns counts for the log."""
    now = picture(catalogue)
    before = store.alert_state()
    if not before:
        store.save_alert_state(now)
        return {"first_run": True, "emails": 0, "failed": 0, "changes": 0}
    found = changes(before, now)
    base = settings.public_url or "http://localhost:8000"
    per_person = {}  # email -> (lang, [lines])
    for sub in store.alert_subscriptions():
        news = found.get(sub["item_key"])
        s = catalogue.items.get(sub["item_key"])
        if not news or not s:
            continue
        lang = sub["lang"]
        common = {"name": s.row.get("Name", s.ticker), "ticker": s.ticker, "code": s.key_techs,
                  "url": f"{base}/s/{s.id}"}
        lines = per_person.setdefault(sub["email"], (lang, []))[1]
        for switch, what in ALERTS.items():
            if not sub["alerts"].get(switch) or what not in news:
                continue
            if what == "version":
                lines.append(texts.get("mailAlertNew", lang, version=news["version"], **common))
            elif what == "price":
                was, price = news["price"]
                lines.append(texts.get("mailAlertPrice", lang, price=money(price), was=money(was), **common))
            else:
                for key in news["bundle"]:
                    b = catalogue.bundles[key]
                    lines.append(texts.get("mailAlertBundle", lang, bundle=texts.get(b.name_key, lang),
                                           price=money(b.price), n=len(b.items), **common))
    sent = failed = 0
    for email, (lang, lines) in per_person.items():
        if not lines:
            continue
        body = texts.get("mailAlertBody", lang, lines="\n".join("- " + line for line in lines), mine=f"{base}/mine")
        if mailer.send(email, texts.get("mailAlertSubject", lang), body):
            sent += 1
        else:
            failed += 1
    # A failed email is not retried tomorrow: the change is in the picture now, as for everyone else.
    store.save_alert_state(now)
    return {"first_run": False, "emails": sent, "failed": failed, "changes": len(found)}
