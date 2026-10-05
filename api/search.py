"""GET /api/strategies, /api/strategies/{id} and /api/bundles: the catalogue, filtered on the server.

The Pro panel asks for every histogram and option count on each change, each one counted against
"every other filter". With 2,834 rows that is fast enough in plain Python if every filter becomes
a bitmask (one bit per row): the counts are then ANDs and popcounts, never a pass over the rows.
"""
import math
import weakref
from datetime import date, timedelta
from typing import Optional

from fastapi import APIRouter, HTTPException, Query, Request

router = APIRouter()

# key -> (row field, track min, track max, log scale, bins): the Pro sliders of the design (§12).
RANGES = {
    "np": ("np", 200, 6_500_000, True, 36), "price": ("price", 0, 140, False, 36),
    "npp": ("npp", 0.1, 6500, True, 32), "trades": ("tr", 0, 2000, False, 32), "win": ("w", 0, 100, False, 32),
    "pf": ("pf", 1, 35_000, True, 32), "months": ("m", 0, 400, False, 32), "mlu": ("mdd", 0, 40_000, False, 32),
    "mlp": ("mddp", 0, 4, False, 32), "avg": ("avg", 1, 2_100_000, True, 32), "avgp": ("avgp", 0, 5000, False, 32),
    "bars": ("bars", 0, 8000, False, 32), "act": ("actv", 0, 3, False, 32), "candles": ("cand", 0, 500_000, False, 32),
    "prec": ("prc", 40, 100, False, 32), "tree": ("tdep", 1, 10, False, 10),
}
SELECTS = {"sym": "ticker", "tf": "interval", "ind": "key", "idx": "index", "rel": "release"}
SORTS = {"np": "np", "npp": "npp", "win": "w", "price": "price", "trades": "tr", "avg": "avg", "months": "m"}
# "hot" is net profit % with the tickers taken in turns: one ticker's dozen variants would otherwise
# fill the whole first page, the ticker strip and the top bundle.
ORDERS = (*SORTS, "hot")
TABS = ("hot", "win", "stocks", "crypto", "new", "free")
INTERVALS = ("1Min", "3Min", "5Min", "15Min", "30Min", "1Hour", "2Hour", "4Hour", "1Day", "1Week")
EPS = 1e-6  # a handle typed as "$200" must keep the row worth $199.9999 (the mock's tolerance)


def fraction(value: float, lo: float, hi: float, log: bool) -> float:
    if log:
        f = (math.log10(max(value, lo)) - math.log10(lo)) / (math.log10(hi) - math.log10(lo))
    else:
        f = (value - lo) / (hi - lo)
    return min(1.0, max(0.0, f))


def to_mask(flags) -> int:
    """Bit i set when row i passes; built from a string because shifting in a loop is quadratic."""
    return int("".join(["1" if f else "0" for f in flags][::-1]) or "0", 2)


def masks_by(column: list) -> dict:
    """{value: mask of the rows holding it} in one pass (None is left out)."""
    n, groups = len(column), {}
    for i, v in enumerate(column):
        if v is not None:
            groups.setdefault(v, bytearray(b"0" * n))[n - 1 - i] = 49  # ord("1")
    return {v: int(buf, 2) for v, buf in groups.items()}


class Index:
    """Per-row values and per-value masks of one catalogue, built once."""

    def __init__(self, catalogue):
        self.strategies = list(catalogue)
        rows = [s.summary for s in self.strategies]
        self.n = len(rows)
        self.everything = (1 << self.n) - 1
        self.values = {k: [r[field] for r in rows] for k, (field, *_) in RANGES.items()}
        self.bins = {}
        for k, (field, lo, hi, log, nbins) in RANGES.items():
            which = masks_by([None if v is None else min(nbins - 1, int(fraction(v, lo, hi, log) * nbins))
                              for v in self.values[k]])
            self.bins[k] = [which.get(i, 0) for i in range(nbins)]
        self.options = {}
        for k, field in SELECTS.items():
            self.options[k] = masks_by([r[field] for r in rows])
        self.labels = self._labels(rows)
        self.text = [" ".join((r["name"], r["ticker"], r["ind"], r["key"])).lower() for r in rows]
        self.free = to_mask(r["price"] == 0 for r in rows)
        self.crypto = to_mask(r["market"] == "crypto" for r in rows)
        self.order = {k: sorted(range(self.n), key=lambda i, f=field: (rows[i][f] is None, -(rows[i][f] or 0)))
                      for k, field in SORTS.items()}
        turn, seen = [0] * self.n, {}
        for i in self.order["npp"]:
            turn[i] = seen[rows[i]["ticker"]] = seen.get(rows[i]["ticker"], -1) + 1
        self.order["hot"] = sorted(self.order["npp"], key=lambda i: turn[i])
        self.releases = [s.release_date for s in self.strategies]
        self._new = (None, 0)

    def _labels(self, rows) -> dict:
        names, icons, inds = {}, {}, {}
        for r in rows:
            # a few crypto rows carry 'BINANCE:XRPUSD' as their name: prefer a real one if any row has it
            if r["ticker"] not in names or (":" in names[r["ticker"]] and ":" not in r["name"]):
                names[r["ticker"]] = r["name"]
            icons.setdefault(r["ticker"], r["icon"])
            inds.setdefault(r["key"], r["ind"])
        return {"sym": {t: (f"{n} ({t})", icons[t]) for t, n in names.items()},
                "ind": {k: (f"{k} – {i}" if i else k, None) for k, i in inds.items()}}

    def new_mask(self, new_days: int) -> int:
        """Released in the last NEW_DAYS: recomputed when the day changes, not per request."""
        today = date.today()
        if self._new[0] != (today, new_days):
            since = today - timedelta(days=new_days)
            self._new = ((today, new_days), to_mask(d is not None and since <= d <= today for d in self.releases))
        return self._new[1]

    def range_mask(self, key: str, lo: Optional[float], hi: Optional[float]) -> int:
        lo_t = None if lo is None else lo - abs(lo) * EPS
        hi_t = None if hi is None else hi + abs(hi) * EPS
        return to_mask(v is not None and (lo_t is None or v >= lo_t) and (hi_t is None or v <= hi_t)
                       for v in self.values[key])

    def select_mask(self, key: str, values: list) -> int:
        m = 0
        for v in values:
            m |= self.options[key].get(v, 0)
        return m

    def text_mask(self, q: str) -> int:
        return to_mask(q in t for t in self.text)

    def option_list(self, key: str, within: int) -> list:
        values = list(self.options[key])
        if key == "tf":
            values.sort(key=lambda v: (INTERVALS.index(v) if v in INTERVALS else len(INTERVALS), v))
        else:
            values.sort(reverse=key == "rel")
        out = []
        for v in values:
            label, icon = self.labels.get(key, {}).get(v, (v, None))
            o = {"v": v, "label": label, "count": (within & self.options[key][v]).bit_count()}
            if icon:
                o["icon"] = icon
            out.append(o)
        return out


_indexes = weakref.WeakKeyDictionary()


def index_of(catalogue) -> Index:
    if catalogue not in _indexes:
        _indexes[catalogue] = Index(catalogue)
    return _indexes[catalogue]


def bad(message: str):
    raise HTTPException(400, {"error": message})


def number_param(request: Request, name: str) -> Optional[float]:
    raw = request.query_params.get(name)
    if raw is None or raw.strip() == "":
        return None
    try:
        v = float(raw)
    except ValueError:
        bad(f"{name} is not a number")
    if math.isnan(v) or math.isinf(v):
        bad(f"{name} is not a number")
    return v


@router.get("/api/strategies")
def strategies(request: Request, q: str = Query("", max_length=100), tab: str = "", free: bool = False,
               paid: bool = False, sort: str = "", page: int = Query(1, ge=1), size: int = Query(25, ge=1, le=100),
               facets: bool = False, sym: Optional[list[str]] = Query(None), tf: Optional[list[str]] = Query(None),
               ind: Optional[list[str]] = Query(None), idx: Optional[list[str]] = Query(None),
               rel: Optional[list[str]] = Query(None)):
    """One page of strategies; with facets=1 also every histogram and option count of the Pro panel."""
    settings = request.app.state.settings
    ix = index_of(request.app.state.catalogue)
    if tab and tab not in TABS:
        bad("unknown tab")
    if sort and sort not in ORDERS:
        bad("unknown sort")

    filters = []  # (name, mask): the facets leave out their own name
    query = q.strip().lower()
    if query:
        filters.append(("q", ix.text_mask(query)))
    if tab == "stocks":
        filters.append(("tab", ix.everything & ~ix.crypto))
    elif tab == "crypto":
        filters.append(("tab", ix.crypto))
    elif tab == "new":
        filters.append(("tab", ix.new_mask(settings.new_days)))
    elif tab == "free":
        filters.append(("tab", ix.free))
    if free:
        filters.append(("free", ix.free))
    if paid:
        filters.append(("paid", ix.everything & ~ix.free))
    for key in RANGES:
        lo, hi = number_param(request, f"{key}_min"), number_param(request, f"{key}_max")
        if lo is not None or hi is not None:
            filters.append((key, ix.range_mask(key, lo, hi)))
    for key, values in (("sym", sym), ("tf", tf), ("ind", ind), ("idx", idx), ("rel", rel)):
        if values is not None:  # present but only empty values: none ticked, nothing passes
            filters.append((key, ix.select_mask(key, [v for v in values if v])))

    # prefix[i] = AND of filters before i, suffix[i] = AND of filters from i: "all but one" in two ANDs
    prefix, suffix = [ix.everything], [ix.everything]
    for _, m in filters:
        prefix.append(prefix[-1] & m)
    for _, m in reversed(filters):
        suffix.append(suffix[-1] & m)
    suffix.reverse()
    passing = prefix[-1]

    order = sort or ("win" if tab == "win" else "hot" if tab else "np")
    bits = format(passing, f"0{ix.n}b")[::-1] if ix.n else ""
    hits = [i for i in ix.order[order] if bits[i] == "1"]
    start = (page - 1) * size
    body = {"total": len(hits), "page": page, "size": size,
            "rows": [ix.strategies[i].as_row() for i in hits[start:start + size]],
            "counts": {"all": ix.n, "new": ix.new_mask(settings.new_days).bit_count()}}

    if facets:
        positions = {name: i for i, (name, _) in enumerate(filters)}

        def others(name: str) -> int:
            i = positions.get(name)
            return passing if i is None else prefix[i] & suffix[i + 1]

        body["hist"] = {k: [(others(k) & b).bit_count() for b in ix.bins[k]] for k in RANGES}
        body["ranges"] = {k: {"min": lo, "max": hi, "log": log, "bins": n} for k, (_, lo, hi, log, n) in RANGES.items()}
        body["options"] = {k: ix.option_list(k, others(k)) for k in SELECTS}
    return body


@router.get("/api/strategies/{strategy_id}")
def strategy(strategy_id: str, request: Request):
    catalogue = request.app.state.catalogue
    s = catalogue.resolve(strategy_id)
    if not s:
        raise HTTPException(404, {"error": "unknown strategy"})
    return catalogue.detail(s)


@router.get("/api/bundles")
def bundles(request: Request):
    settings = request.app.state.settings
    return {"bundles": [b.as_dict() for b in request.app.state.catalogue.bundles.values()],
            "pack": {"size": settings.pack_size, "price": float(settings.pack_price)}}
