"""Configuration, all from the environment, so no secret or discount code lives in the code.

PAYPAL_MODE           fake (default: no PayPal, for local runs and tests) | sandbox | live
PAYPAL_CLIENT_ID      public id, also sent to the browser to load the PayPal button
PAYPAL_CLIENT_SECRET  server only
STRATEGIES_DIR        private folder with the paid .pine files (default: private/strategies)
DATABASE              SQLite file for orders and download links (default: private/shop.db)
DISCOUNT_CODES        code=rate pairs, e.g. "spring20=0.20,partner40=0.40"
FLAT_PRICE_CODES      code=price pairs that set every item to one price, e.g. "launch=0.99"
MAX_DISCOUNT          cap on tier + code discount together (default 0.70)
DOWNLOAD_DAYS         how long a download link works (default 7)
MAX_DOWNLOADS         downloads per link (default 10)
"""
import os
from dataclasses import dataclass, field
from decimal import Decimal
from pathlib import Path

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
    currency: str = "USD"
    strategies_dir: Path = ROOT / "private" / "strategies"
    database: Path = ROOT / "private" / "shop.db"
    catalogue: Path = ROOT / "catalogue" / "catalogue.csv"
    storefront: Path = ROOT / "storefront"
    discount_codes: dict = field(default_factory=dict)
    flat_price_codes: dict = field(default_factory=dict)
    max_discount: Decimal = Decimal("0.70")
    tiers: tuple = DEFAULT_TIERS
    download_days: int = 7
    max_downloads: int = 10

    @classmethod
    def from_env(cls) -> "Settings":
        e = os.environ.get
        s = cls(
            paypal_mode=e("PAYPAL_MODE", "fake").lower(),
            paypal_client_id=e("PAYPAL_CLIENT_ID", ""),
            paypal_client_secret=e("PAYPAL_CLIENT_SECRET", ""),
            discount_codes=_pairs(e("DISCOUNT_CODES", "")),
            flat_price_codes=_pairs(e("FLAT_PRICE_CODES", "")),
            max_discount=Decimal(e("MAX_DISCOUNT", "0.70")),
            download_days=int(e("DOWNLOAD_DAYS", "7")),
            max_downloads=int(e("MAX_DOWNLOADS", "10")),
        )
        if e("STRATEGIES_DIR"):
            s.strategies_dir = Path(e("STRATEGIES_DIR"))
        if e("DATABASE"):
            s.database = Path(e("DATABASE"))
        if s.paypal_mode not in ("fake", "sandbox", "live"):
            raise ValueError(f"PAYPAL_MODE must be fake, sandbox or live, not {s.paypal_mode!r}")
        if s.paypal_mode != "fake" and not (s.paypal_client_id and s.paypal_client_secret):
            raise ValueError("PAYPAL_CLIENT_ID and PAYPAL_CLIENT_SECRET are required outside fake mode")
        return s
