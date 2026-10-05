"""The strategies for sale, read from catalogue/catalogue.csv: the only source of prices.

Next to it: indicators.csv (what each indicator is, for the strategy page), bundles.json (the
bundles and their prices) and the optional since_release.csv that the daily job writes.
"""
import base64
import binascii
import csv
import json
import logging
import math
from dataclasses import dataclass, field, replace
from datetime import date, timedelta
from decimal import Decimal
from functools import cached_property
from pathlib import Path

from api.settings import Settings

log = logging.getLogger(__name__)

TV_SCRIPTS = "https://www.tradingview.com/scripts/"

# CSV column -> (row field, type). Every one may be missing or empty: the row then says null.
NUMBERS = {
    "Net Profit_usd": ("np", float), "Net Profit_per": ("npp", float), "Total Closed Trades": ("tr", int),
    "Percent Profitable_per": ("w", float), "Profit Factor": ("pf", float), "Max Drawdown_usd": ("mdd", float),
    "Max Drawdown_per": ("mddp", float), "Avg Trade_usd": ("avg", float), "Avg Trade_per": ("avgp", float),
    "Avg # Bars in Trades": ("bars", float), "months_trained": ("m", int), "n_candles": ("cand", float),
    "Precision f1_per": ("prc", float), "Tree Deep": ("tdep", int),
}


def b64url(text: str) -> str:
    return base64.urlsafe_b64encode(text.encode()).decode().rstrip("=")


def unb64url(text: str) -> str:
    return base64.urlsafe_b64decode(text + "=" * (-len(text) % 4)).decode()


def number(raw, kind=float):
    try:
        v = float(raw)
    except (TypeError, ValueError):
        return None
    if math.isnan(v) or math.isinf(v):
        return None
    return int(round(v)) if kind is int else v


def asset(path: str) -> str:
    """The catalogue stores 'assets/...' relative to storefront/; the page runs at /s/<id> too."""
    return "/" + path.lstrip("/") if path else ""


def grade(trades) -> str:
    """How much evidence the backtest has: the cut-offs of the design (still to be agreed)."""
    t = trades or 0
    return "A" if t >= 300 else "B" if t >= 100 else "C" if t >= 30 else "D"


@dataclass(frozen=True)
class Strategy:
    ticker: str
    interval: str
    key_techs: str
    id_model: str
    price: Decimal
    row: dict = field(repr=False, compare=False)  # the whole catalogue row
    live: float = None        # % since release, from the daily job; None until it has run
    live_as_of: str = None
    new_days: int = 30

    @property
    def id(self) -> str:
        """The URL id (/s/<id>) and the stem of the chart files."""
        return f"{self.ticker}_{self.interval}_{self.key_techs}_{self.id_model}"

    @property
    def key(self) -> str:
        """The id orders and download links store (and the old cart's id before base64)."""
        return f"{self.ticker} - {self.interval} - {self.key_techs} - {self.id_model}"

    @property
    def private_file(self) -> str:
        """Name of the paid script in STRATEGIES_DIR, as the factory names it (pine_TW_b/)."""
        return b64url(f"{self.ticker}_{self.interval}_{self.key_techs}tuisku{self.id_model}") + ".pine"

    @property
    def download_name(self) -> str:
        """The .pine a buyer saves: named as the script inside TradingView, the tutorial and the zip."""
        return f"{self.file}.pine"

    @property
    def file(self) -> str:
        """The script's name inside TradingView, and the base name of every format sold."""
        return f"Tuisku_{self.id}"

    @property
    def market(self) -> str:
        return "crypto" if self.row.get("Index") == "CRYPTO" else "stocks"

    @property
    def tv_symbol(self) -> str:
        if self.market == "crypto":
            return f"BINANCE:{self.ticker}"
        return f"{self.row.get('Index') or 'NASDAQ'}:{self.ticker}"

    @property
    def grade(self) -> str:
        return grade(self.numbers["tr"])

    @property
    def version(self) -> int:
        return number(self.row.get("version"), int) or 1

    @property
    def release(self) -> str:
        return (self.row.get("Release date") or "").strip()[:10]

    @property
    def release_date(self):
        try:
            return date.fromisoformat(self.release)
        except ValueError:
            return None

    @property
    def is_new(self) -> bool:
        d = self.release_date
        return bool(d) and date.today() - timedelta(days=self.new_days) <= d <= date.today()

    @cached_property
    def numbers(self) -> dict:
        out = {name: number(self.row.get(col), kind) for col, (name, kind) in NUMBERS.items()}
        out["actv"] = out["tr"] / out["m"] if out["tr"] is not None and out["m"] else None
        return out

    @cached_property
    def summary(self) -> dict:
        """The row fields that never change while the server runs (is_new does, at midnight)."""
        r = self.row
        stems = {k: Path(r.get(col) or "").stem for k, col in (("profit", "path_stra"), ("candle", "path_candle"))}
        return {
            "id": self.id, "ticker": self.ticker, "interval": self.interval, "key": self.key_techs,
            "hash": self.id_model, "name": r.get("Name") or self.ticker, "ind": r.get("Full Indicator Name") or "",
            "index": r.get("Index") or "", "market": self.market, "price": number(self.price) or 0,
            **self.numbers, "release": self.release, "version": self.version,
            "profit": asset(r.get("path_stra")), "candle": asset(r.get("path_candle")),
            "icon": asset(r.get("path_ico_big")), "preview": asset(r.get("pine_path_shadow")),
            "thumb_profit": f"/thumbs/{stems['profit']}.webp" if stems["profit"] else "",
            "thumb_candle": f"/thumbs/{stems['candle']}.webp" if stems["candle"] else "",
            "grade": self.grade, "tv_symbol": self.tv_symbol, "file": self.file,
        }

    def as_row(self) -> dict:
        return {**self.summary, "live": self.live, "live_as_of": self.live_as_of, "is_new": self.is_new}


@dataclass(frozen=True)
class Bundle:
    key: str
    name_key: str          # i18n key of its name
    items: tuple           # Strategy, ...
    price: Decimal

    @property
    def was(self) -> Decimal:
        return sum((s.price for s in self.items), Decimal("0"))

    def as_dict(self) -> dict:
        return {"key": self.key, "name_key": self.name_key, "ids": [s.id for s in self.items],
                "price": number(self.price), "was": number(self.was)}


def read_table(path: Path) -> list:
    """A small CSV that may be comma- or tab-separated (indicators.csv is the first, tests write the second)."""
    if not path or not path.is_file():
        return []
    with open(path, newline="", encoding="utf-8") as f:
        head = f.readline()
        f.seek(0)
        return list(csv.DictReader(f, delimiter="\t" if "\t" in head else ","))


def clean(value) -> str:
    v = (value or "").strip()
    return "" if v in ("--", "-") else v


class Catalogue:
    def __init__(self, source):
        """source: the Settings, or the path of catalogue.csv with its companions next to it."""
        if not isinstance(source, Settings):
            path = Path(source)
            source = Settings(catalogue=path, indicators=path.parent / "indicators.csv",
                              bundles=path.parent / "bundles.json", since_release=path.parent / "since_release.csv")
        live = {r.get("id"): r for r in read_table(source.since_release)}
        self.items = {}   # by key: what orders and links store
        self.by_id = {}
        with open(source.catalogue, newline="", encoding="utf-8") as f:
            for row in csv.DictReader(f, delimiter="\t"):
                s = Strategy(row["ticker"], row["interval"], row["key_techs"], row["id_model"],
                             Decimal(row["Price"]).quantize(Decimal("0.01")), row, new_days=source.new_days)
                if s.id in live:
                    s = replace(s, live=number(live[s.id].get("pct")), live_as_of=live[s.id].get("as_of") or None)
                if s.key not in self.items:
                    self.items[s.key] = s
                    self.by_id[s.id] = s
        self.indicators = {}
        for r in read_table(source.indicators):
            lower = {k.strip().lower(): v for k, v in r.items() if k}
            if clean(lower.get("key")):
                self.indicators[clean(lower["key"])] = {
                    "ind_text": clean(lower.get("explanation")),
                    "ind_url": clean(lower.get("traderview url indicator")) or TV_SCRIPTS,
                    "ind_author": clean(lower.get("author")),
                }
        self.bundles = self._bundles(source.bundles)

    def _bundles(self, path: Path) -> dict:
        if not path or not path.is_file():
            return {}
        out = {}
        for b in json.loads(path.read_text(encoding="utf-8")):
            items = []
            for i in b.get("ids", []):
                s = self.resolve(i)
                if s:
                    items.append(s)
                else:
                    log.warning("bundle %s: %s is not in the catalogue, dropped", b.get("key"), i)
            if items:
                out[b["key"]] = Bundle(b["key"], b.get("name_key", b["key"]), tuple(items),
                                       Decimal(str(b["price"])).quantize(Decimal("0.01")))
            else:
                log.warning("bundle %s: no strategy left, dropped", b.get("key"))
        return out

    def __len__(self):
        return len(self.items)

    def __iter__(self):
        return iter(self.items.values())

    def resolve(self, item_id: str):
        """Accept the id (AAPL_1Day_1C00_ac87f0dc), the plain 'T - I - K - H' or the old cart's base64 of it."""
        if item_id in self.by_id:
            return self.by_id[item_id]
        if item_id in self.items:
            return self.items[item_id]
        try:
            return self.items.get(unb64url(item_id))
        except (binascii.Error, UnicodeDecodeError, ValueError):
            return None

    def detail(self, s: Strategy) -> dict:
        ind = self.indicators.get(s.key_techs, {})
        versions = [{"v": v, "date": s.release if v == s.version else None, "note": ""}
                    for v in range(s.version, 0, -1)]
        return {**s.as_row(), "ind_text": ind.get("ind_text", ""), "ind_url": ind.get("ind_url", TV_SCRIPTS),
                "ind_author": ind.get("ind_author", ""), "versions": versions}
