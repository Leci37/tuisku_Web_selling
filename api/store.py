"""Orders, download links, free claims, accounts, favourites and the outbox in SQLite (one file,
no server to run). Old database files gain the new columns in place when the shop starts."""
import hashlib
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
    created   REAL NOT NULL,
    email     TEXT NOT NULL DEFAULT '',    -- the signed-in buyer, or the payer's email once paid
    lines     TEXT NOT NULL DEFAULT '[]'   -- JSON: what was charged, line by line
);
CREATE TABLE IF NOT EXISTS downloads (
    token     TEXT PRIMARY KEY,
    paypal_id TEXT NOT NULL REFERENCES orders(paypal_id),
    item_key  TEXT NOT NULL,
    expires   REAL NOT NULL,
    count     INTEGER NOT NULL DEFAULT 0,
    version   INTEGER NOT NULL DEFAULT 1
);
CREATE TABLE IF NOT EXISTS free_claims (
    token      TEXT PRIMARY KEY,
    email      TEXT NOT NULL,
    item_key   TEXT NOT NULL,
    news       INTEGER NOT NULL DEFAULT 0,
    consent_at REAL NOT NULL,
    expires    REAL NOT NULL,
    count      INTEGER NOT NULL DEFAULT 0,
    version    INTEGER NOT NULL DEFAULT 1,
    lang       TEXT NOT NULL DEFAULT ''
);
CREATE INDEX IF NOT EXISTS free_claims_email ON free_claims(email);
CREATE TABLE IF NOT EXISTS subscribers (
    email      TEXT PRIMARY KEY,
    news       INTEGER NOT NULL,
    consent_at REAL NOT NULL,
    source     TEXT NOT NULL,
    lang       TEXT NOT NULL DEFAULT ''
);
CREATE TABLE IF NOT EXISTS login_tokens (
    token_hash TEXT PRIMARY KEY,
    email      TEXT NOT NULL,
    expires    REAL NOT NULL,
    used       INTEGER NOT NULL DEFAULT 0
);
CREATE TABLE IF NOT EXISTS sessions (
    token_hash TEXT PRIMARY KEY,
    email      TEXT NOT NULL,
    created    REAL NOT NULL,
    expires    REAL NOT NULL
);
CREATE TABLE IF NOT EXISTS favourites (
    email    TEXT NOT NULL,
    item_key TEXT NOT NULL,
    alerts   TEXT NOT NULL DEFAULT '{}',
    created  REAL NOT NULL,
    PRIMARY KEY (email, item_key)
);
CREATE TABLE IF NOT EXISTS outbox (
    id      INTEGER PRIMARY KEY AUTOINCREMENT,
    to_addr TEXT NOT NULL,
    subject TEXT NOT NULL,
    body    TEXT NOT NULL,
    created REAL NOT NULL,
    status  TEXT NOT NULL,       -- console, sent, failed
    error   TEXT NOT NULL DEFAULT ''
);
"""

# Columns added after the first release: CREATE TABLE IF NOT EXISTS leaves an old file without them.
MIGRATIONS = (
    ("orders", "email", "TEXT NOT NULL DEFAULT ''"),
    ("orders", "lines", "TEXT NOT NULL DEFAULT '[]'"),
    ("downloads", "version", "INTEGER NOT NULL DEFAULT 1"),
)

DAY = 86400


def digest(token: str) -> str:
    """Sign-in and session tokens are kept only as hashes: a copy of the file opens no account."""
    return hashlib.sha256(token.encode()).hexdigest()


def norm(email: str) -> str:
    return (email or "").strip().lower()


class Store:
    def __init__(self, path: Path):
        path.parent.mkdir(parents=True, exist_ok=True)
        self.db = sqlite3.connect(str(path), check_same_thread=False)
        self.db.row_factory = sqlite3.Row
        self.lock = threading.Lock()
        with self.lock, self.db:
            self._migrate()
            self.db.executescript(SCHEMA)

    def _migrate(self):
        for table, column, ddl in MIGRATIONS:
            cols = {r["name"] for r in self.db.execute(f"PRAGMA table_info({table})")}
            if cols and column not in cols:
                self.db.execute(f"ALTER TABLE {table} ADD COLUMN {column} {ddl}")

    def _write(self, sql: str, args=()) -> sqlite3.Cursor:
        with self.lock, self.db:
            return self.db.execute(sql, args)

    # Orders and paid links: the interface the order and capture code use.

    def add_order(self, paypal_id: str, keys: list, code: str, total: Decimal, currency: str,
                  email: str = "", lines: list = None):
        self._write("INSERT INTO orders (paypal_id, items, code, total, currency, status, payer, created, "
                    "email, lines) VALUES (?,?,?,?,?,'CREATED','',?,?,?)",
                    (paypal_id, json.dumps(keys), code, str(total), currency, time.time(), norm(email),
                     json.dumps(lines or [])))

    def order(self, paypal_id: str):
        row = self.db.execute("SELECT * FROM orders WHERE paypal_id=?", (paypal_id,)).fetchone()
        return dict(row, items=json.loads(row["items"]), lines=json.loads(row["lines"])) if row else None

    def set_status(self, paypal_id: str, status: str, payer: str = ""):
        self._write("UPDATE orders SET status=?, payer=? WHERE paypal_id=?", (status, payer, paypal_id))

    def set_email(self, paypal_id: str, email: str):
        self._write("UPDATE orders SET email=? WHERE paypal_id=?", (norm(email), paypal_id))

    def issue_links(self, paypal_id: str, keys: list, days: int, versions: dict = None) -> dict:
        """One link per item; calling it again for the same order returns the existing links."""
        versions = versions or {}
        with self.lock, self.db:
            existing = {r["item_key"]: r["token"] for r in self.db.execute(
                "SELECT item_key, token FROM downloads WHERE paypal_id=? ORDER BY expires", (paypal_id,))}
            for k in keys:
                if k not in existing:
                    existing[k] = secrets.token_urlsafe(24)
                    self.db.execute("INSERT INTO downloads (token, paypal_id, item_key, expires, count, version) "
                                    "VALUES (?,?,?,?,0,?)",
                                    (existing[k], paypal_id, k, time.time() + days * DAY, versions.get(k, 1)))
        return existing

    def link(self, token: str):
        """A paid link with its order's status, or None."""
        row = self.db.execute("SELECT d.*, o.status FROM downloads d JOIN orders o USING (paypal_id) "
                              "WHERE d.token=?", (token,)).fetchone()
        return dict(row) if row else None

    def count_download(self, token: str):
        # Tokens are random and unique across both tables, so one of the two updates hits.
        with self.lock, self.db:
            self.db.execute("UPDATE downloads SET count = count + 1 WHERE token=?", (token,))
            self.db.execute("UPDATE free_claims SET count = count + 1 WHERE token=?", (token,))

    # Free strategies for an email.

    def add_free_claim(self, email: str, key: str, news: bool, lang: str, days: int, version: int = 1,
                       consent_at: float = None) -> str:
        token, now = secrets.token_urlsafe(24), time.time()
        self._write("INSERT INTO free_claims VALUES (?,?,?,?,?,?,0,?,?)",
                    (token, norm(email), key, int(bool(news)), consent_at or now, now + days * DAY, version, lang))
        return token

    def free_claim(self, token: str):
        row = self.db.execute("SELECT * FROM free_claims WHERE token=?", (token,)).fetchone()
        return dict(row) if row else None

    def claims_since(self, email: str, since: float) -> int:
        return self.db.execute("SELECT COUNT(*) FROM free_claims WHERE email=? AND consent_at>=?",
                               (norm(email), since)).fetchone()[0]

    def subscribe(self, email: str, source: str, lang: str):
        """Only called when the person ticked the news box: the row is the record of that consent."""
        self._write("INSERT INTO subscribers VALUES (?,1,?,?,?) ON CONFLICT(email) DO UPDATE SET "
                    "news=1, consent_at=excluded.consent_at, source=excluded.source, lang=excluded.lang",
                    (norm(email), time.time(), source, lang))

    # Passwordless accounts.

    def add_login_token(self, email: str, minutes: int) -> str:
        token = secrets.token_urlsafe(32)
        self._write("INSERT INTO login_tokens VALUES (?,?,?,0)", (digest(token), norm(email), time.time() + minutes * 60))
        return token

    def pending_logins(self, email: str) -> int:
        return self.db.execute("SELECT COUNT(*) FROM login_tokens WHERE email=? AND used=0 AND expires>?",
                               (norm(email), time.time())).fetchone()[0]

    def use_login_token(self, token: str):
        """The email the link was sent to, once: a second click or an expired link gives None."""
        h = digest(token)
        with self.lock, self.db:
            done = self.db.execute("UPDATE login_tokens SET used=1 WHERE token_hash=? AND used=0 AND expires>?",
                                   (h, time.time())).rowcount
            if not done:
                return None
            return self.db.execute("SELECT email FROM login_tokens WHERE token_hash=?", (h,)).fetchone()[0]

    def add_session(self, email: str, days: int) -> str:
        token, now = secrets.token_urlsafe(32), time.time()
        with self.lock, self.db:
            self.db.execute("DELETE FROM sessions WHERE expires<?", (now,))
            self.db.execute("DELETE FROM login_tokens WHERE expires<?", (now - DAY,))
            self.db.execute("INSERT INTO sessions VALUES (?,?,?,?)", (digest(token), norm(email), now, now + days * DAY))
        return token

    def session_email(self, token: str):
        row = self.db.execute("SELECT email FROM sessions WHERE token_hash=? AND expires>?",
                              (digest(token), time.time())).fetchone()
        return row[0] if row else None

    def end_session(self, token: str):
        self._write("DELETE FROM sessions WHERE token_hash=?", (digest(token),))

    # My strategies.

    def owned(self, email: str) -> list:
        """Every link the account has: paid ones from its orders (as buyer or payer) and its free claims.
        `date` is when the strategy was acquired (the order or the first claim), not when the link was made."""
        e = norm(email)
        paid = self.db.execute(
            "SELECT d.token, d.item_key, d.expires, d.count, d.version, d.paypal_id, o.created AS date, "
            "'paid' AS kind FROM downloads d JOIN orders o USING (paypal_id) "
            "WHERE o.status='PAID' AND (o.email=? OR lower(o.payer)=?)", (e, e)).fetchall()
        free = self.db.execute(
            "SELECT token, item_key, expires, count, version, '' AS paypal_id, consent_at AS date, "
            "'free' AS kind FROM free_claims WHERE email=?", (e,)).fetchall()
        return [dict(r) for r in paid + free]

    def renew(self, owned_link: dict, days: int, version: int, email: str) -> str:
        """A fresh link for something the account already has (also how an update is delivered)."""
        token, now = secrets.token_urlsafe(24), time.time()
        if owned_link["kind"] == "paid":
            self._write("INSERT INTO downloads (token, paypal_id, item_key, expires, count, version) "
                        "VALUES (?,?,?,?,0,?)", (token, owned_link["paypal_id"], owned_link["item_key"],
                                                 now + days * DAY, version))
            return token
        # The renewed claim keeps the first consent time, so it does not count against the daily limit.
        first = self.db.execute("SELECT MIN(consent_at), MAX(news) FROM free_claims WHERE email=? AND item_key=?",
                                (norm(email), owned_link["item_key"])).fetchone()
        return self.add_free_claim(email, owned_link["item_key"], bool(first[1]), "", days, version, first[0])

    def favourites(self, email: str) -> list:
        return [dict(r, alerts=json.loads(r["alerts"])) for r in self.db.execute(
            "SELECT item_key, alerts, created FROM favourites WHERE email=? ORDER BY created", (norm(email),))]

    def set_favourite(self, email: str, key: str, alerts: dict):
        self._write("INSERT INTO favourites VALUES (?,?,?,?) ON CONFLICT(email, item_key) DO UPDATE SET "
                    "alerts=excluded.alerts", (norm(email), key, json.dumps(alerts), time.time()))

    def delete_favourite(self, email: str, key: str):
        self._write("DELETE FROM favourites WHERE email=? AND item_key=?", (norm(email), key))

    # Outbox: every email the shop sends or would send.

    def add_mail(self, to: str, subject: str, body: str, status: str, error: str = "") -> int:
        return self._write("INSERT INTO outbox (to_addr, subject, body, created, status, error) VALUES (?,?,?,?,?,?)",
                           (to, subject, body, time.time(), status, error)).lastrowid

    def outbox(self, to: str = None) -> list:
        sql, args = "SELECT * FROM outbox", ()
        if to:
            sql, args = sql + " WHERE to_addr=?", (to,)
        return [dict(r) for r in self.db.execute(sql + " ORDER BY id", args)]
