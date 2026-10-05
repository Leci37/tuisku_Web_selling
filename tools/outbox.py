"""Show the last emails the shop wrote, with their links: sign-in, free downloads, news confirmations.

    python tools/outbox.py [N]            # the last N (default 5) from DATABASE (default private/shop.db)

With MAIL_MODE=console (the default) nothing leaves the machine: every email is kept in the
`outbox` table, and this is how you open the sign-in link of a local run.
"""
import os
import sqlite3
import sys
from datetime import datetime
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent


def main(n: int = 5):
    db = Path(os.environ.get("DATABASE") or ROOT / "private" / "shop.db")
    if not db.is_file():
        sys.exit(f"{db} does not exist yet: start the server and send something first")
    con = sqlite3.connect(f"file:{db}?mode=ro", uri=True)
    rows = con.execute("SELECT created, to_addr, subject, body, status FROM outbox ORDER BY id DESC LIMIT ?",
                       (n,)).fetchall()
    for created, to, subject, body, status in reversed(rows):
        when = datetime.fromtimestamp(created).strftime("%Y-%m-%d %H:%M:%S")
        print(f"── {when} · {status} · to {to}\n   {subject}\n")
        print("   " + body.replace("\n", "\n   ") + "\n")
    if not rows:
        print("the outbox is empty")


if __name__ == "__main__":
    main(int(sys.argv[1]) if len(sys.argv) > 1 else 5)
