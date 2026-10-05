"""Prices and discounts, computed on the server only. The browser sends item ids and a code."""
from dataclasses import dataclass
from decimal import ROUND_HALF_UP, Decimal

from api.catalogue import Strategy
from api.settings import Settings

CENT = Decimal("0.01")


@dataclass
class Quote:
    items: list            # [(Strategy, price charged)]
    subtotal: Decimal      # catalogue prices
    discount_rate: Decimal
    total: Decimal
    code: str              # as typed, lower-cased ('' if none)
    code_status: str       # '' | 'applied' | 'invalid'

    def as_dict(self) -> dict:
        return {
            "items": [{"id": s.key, "price": str(p)} for s, p in self.items],
            "subtotal": str(self.subtotal),
            "discount_rate": str(self.discount_rate),
            "discount": str((self.subtotal - self.total).quantize(CENT)),
            "total": str(self.total),
            "code_status": self.code_status,
        }


def tier_rate(subtotal: Decimal, settings: Settings) -> Decimal:
    for over, rate in settings.tiers:  # highest threshold first
        if subtotal > over:
            return rate
    return Decimal("0")


def quote(strategies: list, code: str, settings: Settings) -> Quote:
    """One of each strategy; a flat-price code replaces every price, otherwise the order-size
    tier and the code add up, capped at MAX_DISCOUNT so a total can never reach zero."""
    unique = list({s.key: s for s in strategies}.values())
    subtotal = sum((s.price for s in unique), Decimal("0")).quantize(CENT)
    code = (code or "").strip().lower()
    if code and code in settings.flat_price_codes:
        flat = settings.flat_price_codes[code].quantize(CENT)
        charged = [(s, min(flat, s.price)) for s in unique]
        total = sum((p for _, p in charged), Decimal("0")).quantize(CENT)
        return Quote(charged, subtotal, Decimal("0"), total, code, "applied")
    code_rate = settings.discount_codes.get(code, Decimal("0")) if code else Decimal("0")
    status = "" if not code else ("applied" if code in settings.discount_codes else "invalid")
    rate = min(tier_rate(subtotal, settings) + code_rate, settings.max_discount)
    charged = [(s, (s.price * (1 - rate)).quantize(CENT, ROUND_HALF_UP)) for s in unique]
    total = (subtotal * (1 - rate)).quantize(CENT, ROUND_HALF_UP)
    return Quote(charged, subtotal, rate, total, code, status)
