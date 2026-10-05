"""Send the favourites' alert emails (new version, price drop, in a bundle). Run it once a day:

    PUBLIC_URL=https://shop.example MAIL_MODE=smtp ... python tools/send_alerts.py
    # crontab:  7 8 * * *  cd /srv/shop && /srv/shop/.venv/bin/python tools/send_alerts.py

It reads the same settings as the server (DATABASE, MAIL_MODE, SMTP_*, PUBLIC_URL). The first run
only records what the catalogue looks like; from then on each run emails what changed since the last.
"""
import logging
import sys
from pathlib import Path

sys.path.insert(0, str(Path(__file__).resolve().parent.parent))

from api import alerts  # noqa: E402
from api.catalogue import Catalogue  # noqa: E402
from api.mail import Mailer  # noqa: E402
from api.settings import Settings  # noqa: E402
from api.store import Store  # noqa: E402
from api.texts import Texts  # noqa: E402

if __name__ == "__main__":
    logging.basicConfig(level=logging.INFO, format="%(message)s")
    settings = Settings.from_env()
    store = Store(settings.database)
    result = alerts.run(Catalogue(settings), store, Mailer(settings, store),
                        Texts(settings.storefront / "i18n" / "storefront.ui.json"), settings)
    if result["first_run"]:
        print("first run: recorded the catalogue; alerts are sent from the next run on")
    else:
        print(f"{result['changes']} strategies changed; {result['emails']} emails sent, {result['failed']} failed")
    sys.exit(1 if result["failed"] else 0)
