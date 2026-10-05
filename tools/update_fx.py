"""Refresh catalogue/fx.json with today's reference rates (ECB, through frankfurter.app). Run it daily:

    python tools/update_fx.py            # e.g. from cron at 17:00 CET, after the ECB publishes

The shop only uses these to show "≈ amount" in the visitor's currency; PayPal always charges USD.
"""
import json
import os
import sys
import tempfile
from pathlib import Path

import httpx

ROOT = Path(__file__).resolve().parent.parent
OUT = ROOT / "catalogue" / "fx.json"
URL = "https://api.frankfurter.app/latest?from=USD"
# The ECB does not publish the riyal; it has been pegged to the dollar at 3.75 since 1986.
PEGGED = {"SAR": 3.75}


def fetch() -> dict:
    r = httpx.get(URL, timeout=20, follow_redirects=True)
    r.raise_for_status()
    body = r.json()
    rates = {"USD": 1, **body["rates"], **PEGGED}
    return {"base": "USD", "date": body["date"], "rates": rates, "source": "ECB via frankfurter.app"}


def write(data: dict, path: Path = OUT):
    fd, tmp = tempfile.mkstemp(dir=path.parent, suffix=".tmp")
    with os.fdopen(fd, "w", encoding="utf-8") as f:
        json.dump(data, f, indent=2)
        f.write("\n")
    os.replace(tmp, path)  # the server never reads half a file


if __name__ == "__main__":
    try:
        data = fetch()
    except (httpx.HTTPError, KeyError, ValueError) as e:
        sys.exit(f"fx not updated, {OUT.name} keeps its rates: {e}")
    write(data)
    print(f"{OUT.relative_to(ROOT)}: {len(data['rates'])} rates of {data['date']}")
