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
    lines     TEXT NOT NULL DEFAULT '[]',  -- JSON: what was charged, line by line
    buyer_hash TEXT NOT NULL DEFAULT '',   -- SHA-256 of the ef_buyer cookie of the browser that made it
    lang      TEXT NOT NULL DEFAULT 'en'   -- the language of its receipt email
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
    email        TEXT PRIMARY KEY,
    news         INTEGER NOT NULL,
    consent_at   REAL NOT NULL,          -- when the box was ticked
    source       TEXT NOT NULL,
    lang         TEXT NOT NULL DEFAULT '',
    token_hash   TEXT NOT NULL DEFAULT '',  -- of the emailed confirmation link, until it is used
    confirmed_at REAL                    -- NULL until confirmed: only confirmed rows are subscribers
);
CREATE INDEX IF NOT EXISTS subscribers_token ON subscribers(token_hash);
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
    lang     TEXT NOT NULL DEFAULT 'en',   -- the language of its alert emails
    PRIMARY KEY (email, item_key)
);
CREATE TABLE IF NOT EXISTS alert_state (
    item_key TEXT PRIMARY KEY,    -- what each strategy looked like at the last alert run
    version  INTEGER NOT NULL,
    price    TEXT NOT NULL,
    bundles  TEXT NOT NULL,       -- JSON list of the bundle keys it is in
    updated  REAL NOT NULL
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
    ("orders", "buyer_hash", "TEXT NOT NULL DEFAULT ''"),
    # rows from before the double opt-in stay unconfirmed: they never clicked a confirmation link
    ("subscribers", "token_hash", "TEXT NOT NULL DEFAULT ''"),
    ("subscribers", "confirmed_at", "REAL"),
    ("favourites", "lang", "TEXT NOT NULL DEFAULT 'en'"),   # the language of its alert emails
    ("orders", "lang", "TEXT NOT NULL DEFAULT 'en'"),       # the language of its receipt email
)

DAY = 86400
NEWS_CONFIRM_DAYS = 30  # how long the emailed news confirmation link works


def digest(token: str) -> str:
    """Sign-in, session, buyer and news tokens are kept only as hashes: a copy of the file opens nothing."""
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
                  email: str = "", lines: list = None, buyer: str = "", lang: str = "en"):
        """`buyer`: the ef_buyer cookie of the browser placing the order; only its hash is kept."""
        self._write("INSERT INTO orders (paypal_id, items, code, total, currency, status, payer, created, "
                    "email, lines, buyer_hash, lang) VALUES (?,?,?,?,?,'CREATED','',?,?,?,?,?)",
                    (paypal_id, json.dumps(keys), code, str(total), currency, time.time(), norm(email),
                     json.dumps(lines or []), digest(buyer) if buyer else "", lang))

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

    def claim_download(self, token: str, max_downloads: int) -> bool:
        """Spend one download of a usable link (paid or free) in a single conditional UPDATE: of two requests
        racing for the last download only one gets it, where a read followed by a write lets both through."""
        now = time.time()
        with self.lock, self.db:
            done = self.db.execute(
                "UPDATE downloads SET count = count + 1 WHERE token=? AND count<? AND expires>? "
                "AND paypal_id IN (SELECT paypal_id FROM orders WHERE status='PAID')",
                (token, max_downloads, now)).rowcount
            if not done:
                done = self.db.execute("UPDATE free_claims SET count = count + 1 WHERE token=? AND count<? "
                                       "AND expires>?", (token, max_downloads, now)).rowcount
        return done == 1

    # Free strategies for an email.

    def add_free_claim(self, email: str, key: str, news: bool, lang: str, days: int, version: int = 1,
                       consent_at: float = None, daily_limit: int = None):
        """The new claim's token; None when `daily_limit` is given and the address already made that many
        claims in the last day. Counting and inserting happen in one locked transaction, so parallel
        requests cannot all pass the count before any of them inserts."""
        token, now = secrets.token_urlsafe(24), time.time()
        with self.lock, self.db:
            if daily_limit is not None and self.db.execute(
                    "SELECT COUNT(*) FROM free_claims WHERE email=? AND consent_at>=?",
                    (norm(email), now - DAY)).fetchone()[0] >= daily_limit:
                return None
            self.db.execute("INSERT INTO free_claims VALUES (?,?,?,?,?,?,0,?,?)",
                            (token, norm(email), key, int(bool(news)), consent_at or now, now + days * DAY,
                             version, lang))
        return token

    def delete_free_claim(self, token: str):
        """A claim whose email could not be sent: it gave nothing, so it must not count or stay usable."""
        self._write("DELETE FROM free_claims WHERE token=?", (token,))

    def free_claim(self, token: str):
        row = self.db.execute("SELECT * FROM free_claims WHERE token=?", (token,)).fetchone()
        return dict(row) if row else None

    def claims_since(self, email: str, since: float) -> int:
        return self.db.execute("SELECT COUNT(*) FROM free_claims WHERE email=? AND consent_at>=?",
                               (norm(email), since)).fetchone()[0]

    def news_confirmed(self, email: str) -> bool:
        return bool(self.db.execute("SELECT 1 FROM subscribers WHERE email=? AND news=1 AND confirmed_at IS NOT "
                                    "NULL", (norm(email),)).fetchone())

    def request_news(self, email: str, source: str, lang: str, token: str = None):
        """Only called when the person ticked the news box, once the email with the link has gone out. The row
        stays pending (confirmed_at NULL) until the link is opened, so nobody is subscribed by someone typing
        their address (double opt-in). Returns the token of that link (`token`, or a new one), or None if the
        address is already a confirmed subscriber. A newer request replaces the token: the latest email's
        link is the one that works."""
        e, now, token = norm(email), time.time(), token or secrets.token_urlsafe(24)
        with self.lock, self.db:
            row = self.db.execute("SELECT confirmed_at FROM subscribers WHERE email=? AND news=1", (e,)).fetchone()
            if row and row[0] is not None:
                return None
            self.db.execute(
                "INSERT INTO subscribers (email, news, consent_at, source, lang, token_hash, confirmed_at) "
                "VALUES (?,1,?,?,?,?,NULL) ON CONFLICT(email) DO UPDATE SET news=1, "
                "consent_at=excluded.consent_at, source=excluded.source, lang=excluded.lang, "
                "token_hash=excluded.token_hash, confirmed_at=NULL", (e, now, source, lang, digest(token)))
        return token

    def confirm_news(self, token: str, days: int = NEWS_CONFIRM_DAYS):
        """The email whose pending subscription the link confirms, once; None for a used, old or made-up link."""
        h, now = digest(token), time.time()
        with self.lock, self.db:
            row = self.db.execute("SELECT email FROM subscribers WHERE token_hash=? AND news=1 AND "
                                  "confirmed_at IS NULL AND consent_at>?", (h, now - days * DAY)).fetchone()
            if not row:
                return None
            self.db.execute("UPDATE subscribers SET confirmed_at=?, token_hash='' WHERE email=?", (now, row[0]))
            return row[0]

    def subscribers(self) -> list:
        """Who may be sent news: confirmed rows only."""
        return [dict(r) for r in self.db.execute(
            "SELECT email, lang, source, consent_at, confirmed_at FROM subscribers "
            "WHERE news=1 AND confirmed_at IS NOT NULL ORDER BY confirmed_at")]

    # Passwordless accounts.

    def add_login_token(self, email: str, minutes: int, max_pending: int = None):
        """A new sign-in token; None when `max_pending` is given and the address already has that many unused
        ones (counted and inserted in one locked transaction)."""
        token, now = secrets.token_urlsafe(32), time.time()
        with self.lock, self.db:
            if max_pending is not None and self.db.execute(
                    "SELECT COUNT(*) FROM login_tokens WHERE email=? AND used=0 AND expires>?",
                    (norm(email), now)).fetchone()[0] >= max_pending:
                return None
            self.db.execute("INSERT INTO login_tokens VALUES (?,?,?,0)", (digest(token), norm(email), now + minutes * 60))
        return token

    def delete_login_token(self, token: str):
        """A sign-in link whose email could not be sent: it must not count toward the pending ones."""
        self._write("DELETE FROM login_tokens WHERE token_hash=?", (digest(token),))

    def pending_logins(self, email: str) -> int:
        return self.db.execute("SELECT COUNT(*) FROM login_tokens WHERE email=? AND used=0 AND expires>?",
                               (norm(email), time.time())).fetchone()[0]

    def peek_login_token(self, token: str):
        """The email of a usable sign-in link, without using it up (the page asks before signing in)."""
        row = self.db.execute("SELECT email FROM login_tokens WHERE token_hash=? AND used=0 AND expires>?",
                              (digest(token), time.time())).fetchone()
        return row[0] if row else None

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

    def set_favourite(self, email: str, key: str, alerts: dict, lang: str = "en"):
        self._write("INSERT INTO favourites (email, item_key, alerts, created, lang) VALUES (?,?,?,?,?) "
                    "ON CONFLICT(email, item_key) DO UPDATE SET alerts=excluded.alerts, lang=excluded.lang",
                    (norm(email), key, json.dumps(alerts), time.time(), lang))

    def alert_subscriptions(self) -> list:
        """Every favourite with at least one alert switched on: {email, item_key, alerts, lang}."""
        rows = self.db.execute("SELECT email, item_key, alerts, lang FROM favourites ORDER BY email, created")
        out = [dict(r, alerts=json.loads(r["alerts"])) for r in rows]
        return [r for r in out if any(r["alerts"].values())]

    def alert_state(self) -> dict:
        return {r["item_key"]: {"version": r["version"], "price": r["price"], "bundles": json.loads(r["bundles"])}
                for r in self.db.execute("SELECT * FROM alert_state")}

    def save_alert_state(self, state: dict):
        now = time.time()
        with self.lock, self.db:
            self.db.execute("DELETE FROM alert_state")
            self.db.executemany("INSERT INTO alert_state VALUES (?,?,?,?,?)",
                                [(k, v["version"], v["price"], json.dumps(v["bundles"]), now) for k, v in state.items()])

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
