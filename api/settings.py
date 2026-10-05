"""Configuration, all from the environment, so no secret or discount code lives in the code.

PAYPAL_MODE           fake (default: no PayPal, for local runs and tests) | sandbox | live
PAYPAL_CLIENT_ID      public id of the PayPal REST app
PAYPAL_CLIENT_SECRET  server only
PUBLIC_URL            the shop's address (https://...), for PayPal's return link, the emails' links and the
                      cookies' Secure flag. Required with PAYPAL_MODE sandbox/live or MAIL_MODE=smtp; only a
                      local run (fake PayPal, console mail) may leave it out and use the request's address
STRATEGIES_DIR        private folder with the paid .pine files (default: private/strategies)
DATABASE              SQLite file: orders, links, accounts, favourites, outbox (default: private/shop.db)
DISCOUNT_CODES        code=rate pairs, e.g. "spring20=0.20,partner40=0.40"
FLAT_PRICE_CODES      code=price pairs that set every loose item to one price, e.g. "launch=0.99"
MAX_DISCOUNT          cap on tier + code discount together (default 0.70)
DOWNLOAD_DAYS         how long a download link works (default 7)
MAX_DOWNLOADS         downloads per link (default 10)
PACK_SIZE, PACK_PRICE "Build your pack": how many strategies, for how much (default 5 for 249)
NEW_DAYS              a strategy is "New" this many days after its release (default 30)
MAIL_MODE             console (default: log it and keep it in the outbox table) | smtp
SMTP_HOST, SMTP_PORT, SMTP_USER, SMTP_PASSWORD, SMTP_STARTTLS   for MAIL_MODE=smtp (port 587, STARTTLS on)
MAIL_FROM             sender of the emails (default "Edgefolio <sales@tuisku.eu>")
CONTACT_EMAIL         shown on the page for problems (default sales@tuisku.eu)
LEGAL_BASE_URL        where the legal pages are (default https://tuisku.eu, paths as in zlecitool-core)
SESSION_DAYS          how long a sign-in lasts (default 30)
LOGIN_MINUTES         how long an emailed sign-in link works (default 15)
THUMBS_DIR            cache of the WebP chart thumbnails (default cache/thumbs)
"""
import os
from dataclasses import dataclass, field
from decimal import Decimal
from pathlib import Path
from urllib.parse import urlsplit

ROOT = Path(__file__).resolve().parent.parent

# Order-size discount, as the old page applied it: over $2,500 -> 70%, ...
DEFAULT_TIERS = ((Decimal("2500"), Decimal("0.70")), (Decimal("1000"), Decimal("0.40")),
                 (Decimal("500"), Decimal("0.25")), (Decimal("290"), Decimal("0.20")),
                 (Decimal("160"), Decimal("0.15")))


def _pairs(raw: str) -> dict:
    out = {}
    for part in (raw or "").split(","):
        if "=" in part:
            k, v = part.split("=", 1)
            if k.strip():
                out[k.strip().lower()] = Decimal(v.strip())
    return out


@dataclass
class Settings:
    paypal_mode: str = "fake"
    paypal_client_id: str = ""
    paypal_client_secret: str = ""
    public_url: str = ""
    currency: str = "USD"
    strategies_dir: Path = ROOT / "private" / "strategies"
    database: Path = ROOT / "private" / "shop.db"
    catalogue: Path = ROOT / "catalogue" / "catalogue.csv"
    indicators: Path = ROOT / "catalogue" / "indicators.csv"
    bundles: Path = ROOT / "catalogue" / "bundles.json"
    fx: Path = ROOT / "catalogue" / "fx.json"
    since_release: Path = ROOT / "catalogue" / "since_release.csv"
    storefront: Path = ROOT / "storefront"
    thumbs_dir: Path = ROOT / "cache" / "thumbs"
    discount_codes: dict = field(default_factory=dict)
    flat_price_codes: dict = field(default_factory=dict)
    max_discount: Decimal = Decimal("0.70")
    tiers: tuple = DEFAULT_TIERS
    download_days: int = 7
    max_downloads: int = 10
    pack_size: int = 5
    pack_price: Decimal = Decimal("249")
    new_days: int = 30
    mail_mode: str = "console"
    smtp_host: str = ""
    smtp_port: int = 587
    smtp_user: str = ""
    smtp_password: str = ""
    smtp_starttls: bool = True
    mail_from: str = "Edgefolio <sales@tuisku.eu>"
    contact_email: str = "sales@tuisku.eu"
    legal_base_url: str = "https://tuisku.eu"
    session_days: int = 30
    login_minutes: int = 15

    @classmethod
    def from_env(cls) -> "Settings":
        e = os.environ.get
        s = cls(
            paypal_mode=e("PAYPAL_MODE", "fake").lower(),
            paypal_client_id=e("PAYPAL_CLIENT_ID", ""),
            paypal_client_secret=e("PAYPAL_CLIENT_SECRET", ""),
            public_url=e("PUBLIC_URL", "").rstrip("/"),
            discount_codes=_pairs(e("DISCOUNT_CODES", "")),
            flat_price_codes=_pairs(e("FLAT_PRICE_CODES", "")),
            max_discount=Decimal(e("MAX_DISCOUNT", "0.70")),
            download_days=int(e("DOWNLOAD_DAYS", "7")),
            max_downloads=int(e("MAX_DOWNLOADS", "10")),
            pack_size=int(e("PACK_SIZE", "5")),
            pack_price=Decimal(e("PACK_PRICE", "249")),
            new_days=int(e("NEW_DAYS", "30")),
            mail_mode=e("MAIL_MODE", "console").lower(),
            smtp_host=e("SMTP_HOST", ""),
            smtp_port=int(e("SMTP_PORT", "587")),
            smtp_user=e("SMTP_USER", ""),
            smtp_password=e("SMTP_PASSWORD", ""),
            smtp_starttls=e("SMTP_STARTTLS", "1") not in ("0", "false", "no"),
            mail_from=e("MAIL_FROM", "Edgefolio <sales@tuisku.eu>"),
            contact_email=e("CONTACT_EMAIL", "sales@tuisku.eu"),
            legal_base_url=e("LEGAL_BASE_URL", "https://tuisku.eu").rstrip("/"),
            session_days=int(e("SESSION_DAYS", "30")),
            login_minutes=int(e("LOGIN_MINUTES", "15")),
        )
        if e("STRATEGIES_DIR"):
            s.strategies_dir = Path(e("STRATEGIES_DIR"))
        if e("DATABASE"):
            s.database = Path(e("DATABASE"))
        if e("THUMBS_DIR"):
            s.thumbs_dir = Path(e("THUMBS_DIR"))
        if s.paypal_mode not in ("fake", "sandbox", "live"):
            raise ValueError(f"PAYPAL_MODE must be fake, sandbox or live, not {s.paypal_mode!r}")
        if s.paypal_mode != "fake" and not (s.paypal_client_id and s.paypal_client_secret):
            raise ValueError("PAYPAL_CLIENT_ID and PAYPAL_CLIENT_SECRET are required outside fake mode")
        if s.mail_mode not in ("console", "smtp"):
            raise ValueError(f"MAIL_MODE must be console or smtp, not {s.mail_mode!r}")
        if s.mail_mode == "smtp" and not s.smtp_host:
            raise ValueError("SMTP_HOST is required with MAIL_MODE=smtp")
        if (s.paypal_mode != "fake" or s.mail_mode == "smtp") and not s.public_url:
            # Without it the links in emails and PayPal's return address would be built from the Host
            # header, which the visitor chooses: a sign-in link could then point at someone else's server.
            raise ValueError("PUBLIC_URL is required with PAYPAL_MODE=sandbox/live or MAIL_MODE=smtp: the shop's "
                             "address, e.g. PUBLIC_URL=https://shop.example.com")
        if s.public_url:
            u = urlsplit(s.public_url)
            if u.scheme not in ("http", "https") or not u.hostname or u.query or u.fragment:
                raise ValueError(f"PUBLIC_URL must be the shop's address, like https://shop.example.com, "
                                 f"not {s.public_url!r}")
        return s
