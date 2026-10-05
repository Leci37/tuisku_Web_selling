"""The strategies for sale, read from catalogue/catalogue.csv: the only source of prices."""
import base64
import binascii
import csv
from dataclasses import dataclass
from decimal import Decimal
from pathlib import Path


def b64url(text: str) -> str:
    return base64.urlsafe_b64encode(text.encode()).decode().rstrip("=")


def unb64url(text: str) -> str:
    return base64.urlsafe_b64decode(text + "=" * (-len(text) % 4)).decode()


@dataclass(frozen=True)
class Strategy:
    ticker: str
    interval: str
    key_techs: str
    id_model: str
    price: Decimal
    row: dict  # the whole catalogue row, for the receipt

    @property
    def key(self) -> str:
        """The id the storefront cart uses (before its base64 encoding)."""
        return f"{self.ticker} - {self.interval} - {self.key_techs} - {self.id_model}"

    @property
    def private_file(self) -> str:
        """Name of the paid script in STRATEGIES_DIR, as the factory names it (pine_TW_b/)."""
        return b64url(f"{self.ticker}_{self.interval}_{self.key_techs}tuisku{self.id_model}") + ".pine"

    @property
    def download_name(self) -> str:
        return f"{self.ticker}_{self.interval}_{self.key_techs}_{self.id_model}_TW.pine"


class Catalogue:
    def __init__(self, path: Path):
        self.items = {}
        with open(path, newline="", encoding="utf-8") as f:
            for row in csv.DictReader(f, delimiter="\t"):
                s = Strategy(row["ticker"], row["interval"], row["key_techs"], row["id_model"],
                             Decimal(row["Price"]).quantize(Decimal("0.01")), row)
                self.items.setdefault(s.key, s)

    def __len__(self):
        return len(self.items)

    def resolve(self, item_id: str):
        """Accept the cart's base64 id or the plain 'TICKER - INTERVAL - KEY - ID'."""
        if item_id in self.items:
            return self.items[item_id]
        try:
            return self.items.get(unb64url(item_id))
        except (binascii.Error, UnicodeDecodeError, ValueError):
            return None
