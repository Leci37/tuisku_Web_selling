"""Prices and discounts, computed on the server only. The browser sends ids, bundle keys and a code.

A cart is loose strategies, bundles (catalogue/bundles.json) and at most one "Build your pack"
(PACK_SIZE paid strategies for PACK_PRICE). A strategy inside a chosen bundle or the pack is not
charged again as a loose item.
"""
from dataclasses import dataclass, field
from decimal import ROUND_HALF_UP, Decimal

from api.settings import Settings

CENT = Decimal("0.01")
ZERO = Decimal("0")


def cents(value: Decimal) -> Decimal:
    return value.quantize(CENT, ROUND_HALF_UP)


@dataclass
class Quote:
    items: list            # [(Strategy, price charged)]: the loose ones
    subtotal: Decimal      # catalogue prices: loose items + bundle prices + pack price
    discount_rate: Decimal
    total: Decimal
    code: str              # as typed, lower-cased ('' if none)
    code_status: str       # '' | 'applied' | 'invalid'
    bundles: list = field(default_factory=list)   # [(Bundle, price charged)]
    pack: tuple = None                             # ([Strategy], price charged) or None
    tier_rate: Decimal = ZERO
    code_rate: Decimal = ZERO

    @property
    def strategies(self) -> list:
        """Every strategy the buyer gets, once: what the order stores and the links are issued for."""
        out = {s.key: s for s, _ in self.items}
        for b, _ in self.bundles:
            out.update((s.key, s) for s in b.items)
        if self.pack:
            out.update((s.key, s) for s in self.pack[0])
        return list(out.values())

    def lines(self) -> dict:
        return {
            "items": [{"id": s.id, "price": str(p)} for s, p in self.items],
            "bundles": [{"key": b.key, "price": str(p)} for b, p in self.bundles],
            "pack": {"ids": [s.id for s in self.pack[0]], "price": str(self.pack[1])} if self.pack else None,
        }

    def as_dict(self) -> dict:
        return {
            **self.lines(),
            "subtotal": str(self.subtotal),
            "tier_rate": str(self.tier_rate),
            "code_rate": str(self.code_rate),
            "discount_rate": str(self.discount_rate),
            "discount": str((self.subtotal - self.total).quantize(CENT)),
            "total": str(self.total),
            "code_status": self.code_status,
        }


def tier_rate(subtotal: Decimal, settings: Settings) -> Decimal:
    for over, rate in settings.tiers:  # highest threshold first
        if subtotal > over:
            return rate
    return ZERO


def quote(strategies: list, code: str, settings: Settings, bundles: list = (), pack: list = ()) -> Quote:
    """One of each strategy and bundle; a flat-price code replaces every loose price, otherwise the
    order-size tier and the code add up, capped at MAX_DISCOUNT so a total can never reach zero."""
    chosen = list({b.key: b for b in bundles}.values())
    pack = list({s.key: s for s in pack}.values())
    covered = {s.key for b in chosen for s in b.items} | {s.key for s in pack}
    loose = [s for s in {s.key: s for s in strategies}.values() if s.key not in covered]
    pack_price = settings.pack_price.quantize(CENT) if pack else ZERO
    fixed = sum((b.price for b in chosen), ZERO) + pack_price
    subtotal = (sum((s.price for s in loose), ZERO) + fixed).quantize(CENT)
    code = (code or "").strip().lower()
    if code and code in settings.flat_price_codes:
        # a launch price for single strategies: bundles and the pack are already a deal, no tier on top
        flat = settings.flat_price_codes[code].quantize(CENT)
        charged = [(s, min(flat, s.price)) for s in loose]
        total = (sum((p for _, p in charged), ZERO) + fixed).quantize(CENT)
        return Quote(charged, subtotal, ZERO, total, code, "applied", [(b, b.price) for b in chosen],
                     (pack, pack_price) if pack else None)
    code_rate = settings.discount_codes.get(code, ZERO) if code else ZERO
    status = "" if not code else ("applied" if code in settings.discount_codes else "invalid")
    tier = tier_rate(subtotal, settings)
    rate = min(tier + code_rate, settings.max_discount)
    off = 1 - rate
    return Quote([(s, cents(s.price * off)) for s in loose], subtotal, rate, cents(subtotal * off), code, status,
                 [(b, cents(b.price * off)) for b in chosen], (pack, cents(pack_price * off)) if pack else None,
                 tier, code_rate)
