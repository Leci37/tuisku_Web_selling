"""Orders and download links in SQLite (one file, no server to run)."""
import json
import secrets
import sqlite3
import threading
import time
from decimal import Decimal
from pathlib import Path

SCHEMA = """
CREATE TABLE IF NOT EXISTS orders (
    paypal_id TEXT PRIMARY KEY,
    items     TEXT NOT NULL,      -- JSON list of catalogue keys
    code      TEXT NOT NULL,
    total     TEXT NOT NULL,
    currency  TEXT NOT NULL,
    status    TEXT NOT NULL,      -- CREATED, PAID, FAILED
    payer     TEXT NOT NULL DEFAULT '',
    created   REAL NOT NULL
);
CREATE TABLE IF NOT EXISTS downloads (
    token     TEXT PRIMARY KEY,
    paypal_id TEXT NOT NULL REFERENCES orders(paypal_id),
    item_key  TEXT NOT NULL,
    expires   REAL NOT NULL,
    count     INTEGER NOT NULL DEFAULT 0
);
"""


class Store:
    def __init__(self, path: Path):
        path.parent.mkdir(parents=True, exist_ok=True)
        self.db = sqlite3.connect(str(path), check_same_thread=False)
        self.db.row_factory = sqlite3.Row
        self.db.executescript(SCHEMA)
        self.lock = threading.Lock()

    def add_order(self, paypal_id: str, keys: list, code: str, total: Decimal, currency: str):
        with self.lock, self.db:
            self.db.execute("INSERT INTO orders VALUES (?,?,?,?,?,'CREATED','',?)",
                            (paypal_id, json.dumps(keys), code, str(total), currency, time.time()))

    def order(self, paypal_id: str):
        row = self.db.execute("SELECT * FROM orders WHERE paypal_id=?", (paypal_id,)).fetchone()
        return dict(row, items=json.loads(row["items"])) if row else None

    def set_status(self, paypal_id: str, status: str, payer: str = ""):
        with self.lock, self.db:
            self.db.execute("UPDATE orders SET status=?, payer=? WHERE paypal_id=?", (status, payer, paypal_id))

    def issue_links(self, paypal_id: str, keys: list, days: int) -> dict:
        """One link per item; calling it again for the same order returns the existing links."""
        existing = {r["item_key"]: r["token"] for r in
                    self.db.execute("SELECT item_key, token FROM downloads WHERE paypal_id=?", (paypal_id,))}
        with self.lock, self.db:
            for k in keys:
                if k not in existing:
                    existing[k] = secrets.token_urlsafe(24)
                    self.db.execute("INSERT INTO downloads VALUES (?,?,?,?,0)",
                                    (existing[k], paypal_id, k, time.time() + days * 86400))
        return existing

    def link(self, token: str):
        row = self.db.execute("SELECT d.*, o.status FROM downloads d JOIN orders o USING (paypal_id) "
                              "WHERE d.token=?", (token,)).fetchone()
        return dict(row) if row else None

    def count_download(self, token: str):
        with self.lock, self.db:
            self.db.execute("UPDATE downloads SET count = count + 1 WHERE token=?", (token,))
