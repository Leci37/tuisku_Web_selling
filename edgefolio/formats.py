"""The other formats of a strategy, generated from its full Pine script: the rules in plain words (.md),
Python and JavaScript versions of the trees (.py, .js, beta) and the zip that carries them with the .pine.

The factory writes every tree as a Pine function `decision_tree_N_...(...) =>` of nested
`if( feat <= v )` / `if( feat > v )` blocks that end in `ret := score // buy|sell`, and the script
reads `op_operation` from the trees, buys at `op_operation >= X` and closes at `op_operation <= Y`.
At `op_operation <= 0` it arms its exit order: a stop loss and a take profit (inputs `sl`, `tp1`..`tp3`,
in % of the entry price) that move through three stages (getCurrentStage) as the price rises.
"""
import functools
import io
import json
import re
import textwrap
import zipfile
from dataclasses import dataclass, field
from typing import Optional, Union

from api.settings import ROOT

NUM = r"(-?(?:\d+(?:\.\d*)?|\.\d+)(?:[eE][-+]?\d+)?)"
RE_TREE = re.compile(r"^decision_tree_(\d+)_\w*\s*\(([^)]*)\)\s*=>")
RE_LEAF = re.compile(r"^ret\s*:=\s*" + NUM + r"\s*(?://\s*(buy|sell)\b)?", re.I)
RE_LE = re.compile(r"^if\s*\(\s*(\w+)\s*<=\s*" + NUM + r"\s*\)")
RE_PARAMS = re.compile(r"DecisionTreeRegressor\(([^)]*)\)")
RE_COMBINE = re.compile(r"\bop_operation\s*=\s*(.+)")
RE_BUY = re.compile(r"^if\s*\(\s*op_operation\s*>=\s*" + NUM + r"\s*\)")
RE_LOW = re.compile(r"^if\s*\(\s*op_operation\s*<=\s*" + NUM + r"\s*\)")
RE_NAME = re.compile(r'^strategy\(\s*"([^"]+)"')
RE_PYRAMIDING = re.compile(r"^strategy\(.*\bpyramiding\s*=\s*(\d+)")
RE_INPUT = re.compile(r"^(sl|tp1|tp2|tp3)\s*=\s*percent2points\(\s*input(?:\.float)?\(\s*" + NUM +
                      r'(?:.*?title\s*=\s*"([^"]*)")?')
RE_TRAIL = re.compile(r"^activateTrailingOnThirdStep\s*=\s*input(?:\.bool)?\(\s*(true|false)")
RE_STAGE_UP = re.compile(r"\bstage\s*==\s*(\d+)\s+and\s+curProfitInPts\(\)\s*>=\s*(\w+)")
RE_CUR_STAGE = re.compile(r"^(?:else\s+)?if\s+curStage\s*==\s*(\d+)")
RE_STOP_LEVEL = re.compile(r"^stopLevel\s*:=\s*calcStopLossPrice\(\s*(-?\w+(?:\.\d+)?)\s*\)")
RE_EXIT = re.compile(r"^strategy\.exit\((.*)\)")
RE_ENTRY_STOP = re.compile(r"^stop\s*:=\s*close\s*\*\s*" + NUM)

BETA = ("BETA: generated automatically from the Pine script. Check its signals against the strategy "
        "running in TradingView before relying on them; the Pine script is the reference.")


@dataclass
class Leaf:
    raw: str
    sig: str  # buy, sell or '' (the factory's comment on the leaf)

    @property
    def value(self) -> float:
        return float(self.raw)


@dataclass
class Split:
    feat: str
    raw: str
    le: "Node"
    gt: "Node"


Node = Optional[Union[Leaf, Split]]  # None: a branch that is not in the source (a cut preview)


@dataclass
class Tree:
    index: int
    name: str
    inputs: list
    regressor: str
    root: Node
    missing: int = 0


@dataclass
class Stage:
    n: int
    reached_at: Optional[str]  # input whose % the bar's high must reach above the entry; None: from the entry
    stop: str                  # calcStopLossPrice's argument: 'sl' (below the entry), '0' (at it), '-tp1' (above)
    profit: str                # input of the take profit, above the entry


@dataclass
class Exits:
    pct: dict = field(default_factory=dict)       # input -> its default value in %, as written ('2.92')
    titles: dict = field(default_factory=dict)    # input -> its title in TradingView ('stop loss')
    stages: list = field(default_factory=list)    # [Stage], empty when the stage code is not the factory's
    trailing: Optional[str] = None                # default of the 'activate trailing' input, if the script has it
    trailing_used: bool = False                   # whether anything but its own declaration reads it


@dataclass
class Script:
    name: str
    trees: list = field(default_factory=list)
    combine: str = "mean"          # how the script joins the trees' scores: mean or sum
    buy: Optional[str] = None      # op_operation >= buy opens a long position
    close: Optional[str] = None    # op_operation <= close closes it
    arm: Optional[str] = None      # op_operation <= arm places or moves the exit order (stop loss, take profit)
    exits: Optional[Exits] = None
    pyramiding: Optional[int] = None
    entry_stop: Optional[str] = None  # the entry order's stop = close * this (a stop-entry price, not a stop loss)


def _lines(src: str) -> list:
    """(indent width, text) of every non-blank line; tabs count as 4 so tabs and spaces both work."""
    out = []
    for line in src.replace("\r", "").split("\n"):
        text = line.strip()
        if text:
            out.append((len(line.expandtabs(4)) - len(line.expandtabs(4).lstrip()), text))
    return out


def _tree(lines: list, start: int) -> Tree:
    head = RE_TREE.match(lines[start][1])
    name = lines[start][1].split("(", 1)[0]
    body = []
    for ind, text in lines[start + 1:]:
        if ind == 0:
            break
        body.append((ind, text))
    params = RE_PARAMS.search(body[0][1]) if body else None
    i = next((n for n, (_, text) in enumerate(body) if text.startswith("if")), len(body))
    missing = 0

    def node(ind):
        nonlocal i, missing
        if i >= len(body) or body[i][0] != ind:
            missing += 1
            return None
        text = body[i][1]
        m = RE_LEAF.match(text)
        if m:
            i += 1
            return Leaf(m.group(1), (m.group(2) or "").lower())
        m = RE_LE.match(text)
        if not m:
            missing += 1
            return None
        i += 1
        feat, raw = m.group(1), m.group(2)
        le = node(body[i][0] if i < len(body) and body[i][0] > ind else -1)
        gt = None
        if i < len(body) and body[i][0] == ind and re.match(r"^if\s*\(\s*" + feat + r"\s*>", body[i][1]):
            i += 1
            gt = node(body[i][0] if i < len(body) and body[i][0] > ind else -1)
        else:
            missing += 1
        return Split(feat, raw, le, gt)

    root = node(body[i][0]) if i < len(body) else None
    return Tree(int(head.group(1)), name, [p.strip() for p in head.group(2).split(",") if p.strip()],
                params.group(1).strip() if params else "", root, missing)


def _block(lines: list, n: int) -> list:
    """The lines nested under line n."""
    out = []
    for ind, text in lines[n + 1:]:
        if ind <= lines[n][0]:
            break
        out.append(text)
    return out


def _stages(block: list, ups: dict) -> list:
    """The exit order of each stage in the `op_operation <= arm` block; [] unless every stage is understood."""
    stages, n, stop = [], None, None
    for text in block:
        if m := RE_CUR_STAGE.match(text):
            n, stop = int(m.group(1)), None
        elif m := RE_STOP_LEVEL.match(text):
            stop = m.group(1)
        elif (m := RE_EXIT.match(text)) and n is not None:
            args = dict(re.findall(r"(\w+)\s*=\s*([\w.\-]+)", m.group(1)))
            level = args.get("loss") or (stop if args.get("stop") == "stopLevel" else None)
            if not level or "profit" not in args or (n > 1 and n not in ups):
                return []
            stages.append(Stage(n, ups.get(n), level, args["profit"]))
    return stages


def _exits(lines: list, arm_block: list) -> Optional[Exits]:
    exits = Exits()
    ups = {}
    for _, text in lines:
        if m := RE_INPUT.match(text):
            exits.pct[m.group(1)] = m.group(2)
            exits.titles[m.group(1)] = (m.group(3) or m.group(1)).replace("%", "").strip()
        if m := RE_TRAIL.match(text):
            exits.trailing = m.group(1)
        elif "activateTrailingOnThirdStep" in text and not text.startswith("//"):
            exits.trailing_used = True
        if m := RE_STAGE_UP.search(text):
            ups[int(m.group(1)) + 1] = m.group(2)
    stages = _stages(arm_block, ups)
    known = all(s.profit in exits.pct and s.stop.lstrip("-") in exits.pct | {"0": ""} and
                (s.reached_at is None or s.reached_at in exits.pct) for s in stages)
    exits.stages = stages if known and [s.n for s in stages] == list(range(1, len(stages) + 1)) else []
    return exits if exits.pct else None


def parse(src: str) -> Script:
    lines = _lines(src)
    name = next((m.group(1) for _, t in lines if (m := RE_NAME.match(t))), "")
    script = Script(name, [_tree(lines, n) for n, (_, t) in enumerate(lines) if RE_TREE.match(t)])
    arm_block = []
    for n, (ind, text) in enumerate(lines):
        if (m := RE_PYRAMIDING.match(text)) and script.pyramiding is None:
            script.pyramiding = int(m.group(1))
        m = RE_COMBINE.search(text)
        if m and "decision_tree_" in m.group(1) and not text.startswith("//"):
            expr = m.group(1)
            used = {int(x) for x in re.findall(r"decision_tree_(\d+)_", expr)}
            script.trees = [t for t in script.trees if t.index in used] or script.trees
            script.combine = "sum" if "+" in expr and "/" not in expr else "mean"
        if (m := RE_BUY.match(text)) and script.buy is None:
            script.buy = m.group(1)
            entry = _block(lines, n)
            stop = next((e.group(1) for t in entry if (e := RE_ENTRY_STOP.match(t))), None)
            if stop and any(t.startswith("strategy.entry(") and re.search(r"\bstop\s*=\s*stop\b", t) for t in entry):
                script.entry_stop = stop
        if m := RE_LOW.match(text):
            block = _block(lines, n)
            if script.close is None and any("strategy.close" in s for s in block):
                script.close = m.group(1)
            if script.arm is None and any(s.startswith("strategy.exit(") for s in block):
                script.arm, arm_block = m.group(1), block
    script.exits = _exits(lines, arm_block)
    return script


@functools.lru_cache(maxsize=1)
def feature_names() -> dict:
    """English name and description of each indicator value the factory uses (storefront/trees/)."""
    try:
        data = json.loads((ROOT / "storefront" / "trees" / "features.json").read_text(encoding="utf-8"))
    except (OSError, ValueError):
        return {}
    return {k: (v[0], v[1]) for k, v in data.get("features", {}).items() if len(v) >= 2}


def is_flag(feat: str, raw: str) -> bool:
    """The factory's 0/1 values end in Int; a split between 0 and 1 then just asks yes or no."""
    return feat.endswith("Int") and 0 < float(raw) < 1


def leaves(node: Node, path=()):
    """(conditions, leaf) for every leaf, in the order the script lists them."""
    if node is None:
        yield path, None
    elif isinstance(node, Leaf):
        yield path, node
    else:
        yield from leaves(node.le, path + ((node.feat, node.raw, "le"),))
        yield from leaves(node.gt, path + ((node.feat, node.raw, "gt"),))


def features(script: Script) -> list:
    seen = {}
    for tree in script.trees:
        for path, _ in leaves(tree.root):
            seen.update((f, None) for f, _, _ in path)
    return list(seen)


def plain(path) -> str:
    """The conditions of one path, one per value: repeated splits on a value become one range."""
    bounds = {}
    for feat, raw, way in path:
        lo, hi = bounds.get(feat, (None, None))
        if way == "le" and (hi is None or float(raw) < float(hi)):
            hi = raw
        if way == "gt" and (lo is None or float(raw) > float(lo)):
            lo = raw
        bounds[feat] = (lo, hi)
    parts = []
    for feat, (lo, hi) in bounds.items():
        if is_flag(feat, lo or hi):
            parts.append(f"{feat} = {1 if lo is not None else 0}")
        elif lo is not None and hi is not None:
            parts.append(f"{lo} < {feat} ≤ {hi}")
        else:
            parts.append(f"{feat} ≤ {hi}" if hi is not None else f"{feat} > {lo}")
    return " and ".join(parts) or "always"


ACTIONS = {"buy": "Buy", "sell": "Sell", "": "Wait"}
ARM = "Arm the exits"


def action(leaf: Leaf, script: Script) -> str:
    """What the script does when this leaf decides. With one tree the leaf's score is the script's score,
    so its thresholds tell; the factory's own buy/sell comments (at ±0.7) are not what the script acts on.
    With several trees one leaf does not decide alone: the factory's label is the best hint."""
    if len(script.trees) == 1 and script.buy:
        v = leaf.value
        if v >= float(script.buy):
            return "Buy"
        if script.close and v <= float(script.close):
            return "Close"
        return ARM if script.arm is not None and v <= float(script.arm) else "Wait"
    return ACTIONS[leaf.sig]


def stop_pct(stage: Stage, exits: Exits) -> str:
    """Where the stage's stop is, in % above (+) or below (-) the entry price: calcStopLossPrice(x) puts it
    x points below the entry, so 'sl' is below, '0' at the entry and '-tp1' above."""
    if stage.stop == "0":
        return "0"
    return exits.pct[stage.stop[1:]] if stage.stop.startswith("-") else "-" + exits.pct[stage.stop]


def _stage_line(stage: Stage, exits: Exits) -> str:
    stop = stop_pct(stage, exits)
    where = ("a stop at the entry price (break-even)" if stop == "0" else
             f"a stop {stop} % above the entry price (that gain is kept)" if not stop.startswith("-") else
             f"a stop loss {stop[1:]} % below the entry price")
    when = ("From the bar the position opens" if stage.reached_at is None else
            f"Once {'a' if stage.n == 2 else 'a later'} bar's high has reached {exits.pct[stage.reached_at]} % "
            f"above the entry price ({exits.titles[stage.reached_at]})")
    return f"{stage.n}. {when}: {where} and a take profit {exits.pct[stage.profit]} % above it."


def how_it_decides(script: Script) -> list:
    """What the script does with its score, as its Pine code does it (one tree or several)."""
    n = len(script.trees)
    out = [(f"On every bar, each of the {n} decision trees gives a score between -1 and 1, and the script "
            f"takes their {'sum' if script.combine == 'sum' else 'average'}." if n > 1 else
            "On every bar, the decision tree gives a score between -1 and 1.")]
    if not script.buy:
        return out
    out[0] += " At the bar's close the script acts on it; the orders it sends are filled from the next bar on:"
    one = "only one at a time: a buy signal while a position is open adds nothing" if script.pyramiding == 1 else ""
    out += ["", f"- **{script.buy} or more: Buy.** It opens a long position" + (f" ({one})." if one else ".")]
    low = [x for x in (script.arm, script.close) if x is not None]
    out.append(f"- **Above {max(low, key=float) if low else '-1'} and below {script.buy}: Wait.** No new order"
               + ("; an open position keeps the exits it already has." if script.arm is not None else "."))
    if script.arm is not None:
        out.append(f"- **{script.arm} or less: {ARM.lower()}.** With a position open, it places or moves its "
                   "stop loss and take profit (see Exits); with no position, it cancels any pending order.")
    if script.close:
        out.append(f"- **{script.close} or less: Close.** It closes the whole position at market.")
    out += ["", "It only ever buys (long positions); it never sells short."]
    if script.entry_stop:
        pct = f"{float(script.entry_stop) * 100:g}"
        out += ["", f"The entry order carries `stop = close × {script.entry_stop}`. For a buy order that is a "
                    f"stop-entry price ({pct} % of the close, below the price at that moment), so the order is "
                    "filled on the next bar; it is not a stop loss."]
    return out


def exits_section(script: Script) -> list:
    exits = script.exits
    if not exits or script.arm is None:
        return []
    values = ", ".join(f"{exits.titles[k]} {v} %" for k, v in exits.pct.items())
    out = ["## Exits", "", f"The exits are inputs of the script, in % of the entry price (in TradingView: the "
                           f"strategy's Settings, Inputs tab): {values}."]
    if exits.stages:
        out += ["", f"The exit order moves through {len(exits.stages)} stages:", ""]
        out += [_stage_line(stage, exits) for stage in exits.stages]
        out += ["", "The stage is updated on every bar, one step at most per bar, but the exit order is only "
                    f"placed or moved on a bar whose score is {script.arm} or less. Until the first such bar after "
                    "the entry the position has no stop loss and no take profit; once placed, the order stays "
                    f"in force while the score is above {script.arm} again, until it is filled, moved, or the "
                    "position is closed."]
    else:
        out += ["", f"On a bar whose score is {script.arm} or less, the script places or moves its exit order "
                    "with them (see the Pine script for how)."]
    if exits.trailing is not None:
        state = "on" if exits.trailing == "true" else "off"
        out += ["", f"The script also has an input \"activate trailing on third stage\" ({state} by default)"
                + (", but nothing in the script reads it: there is no trailing stop, whatever it is set to."
                   if not exits.trailing_used else "; see the Pine script for what it changes.")]
    return out + [""]


def to_markdown(script: Script, title: str) -> str:
    n = len(script.trees)
    out = [f"# {title}: the rules in plain words", "",
           f"Generated from the Pine script of {script.name or title} (Edgefolio). The Pine script is the "
           "product and the reference; this file explains what it decides, for people and for AI assistants.", ""]
    labels = ("Buy, Wait, " + (f"{ARM} " if script.arm is not None else "") + "and Close"
              if script.close else "Buy and Wait")
    out += ["## How it decides", "", *how_it_decides(script), "",
            "Each rule below is one leaf of a tree: when every condition holds, the tree gives that score. "
            + (f"{labels} are what the script does with that score, as above."
               if len(script.trees) == 1 and script.buy else
               "Buy and Sell mark the leaves the factory labelled as strong signals; Wait is any other leaf."), ""]
    out += exits_section(script)
    names = feature_names()
    used = features(script)
    if used:
        out += ["## Values used", ""]
        for f in used:
            label, text = names.get(f, ("", ""))
            out.append(f"- `{f}`" + (f": {label}. {text}" if label else ""))
        out.append("")
    if not script.trees:
        out += ["No decision trees were found in this script.", ""]
    for tree in script.trees:
        rules = list(leaves(tree.root))
        out += [f"## Tree {tree.index + 1} of {n}" if n > 1 else "## The tree", ""]
        if tree.regressor:
            out += [f"DecisionTreeRegressor({tree.regressor})", ""]
        for k, (path, leaf) in enumerate(rules, 1):
            if leaf is None:
                out.append(f"{k}. If {plain(path)} → (not in this copy of the script)")
            else:
                out.append(f"{k}. If {plain(path)} → {action(leaf, script)} (score {leaf.value:.2f})")
        out.append("")
    return "\n".join(out)


def _code(node: Node, depth: int, lang: str) -> list:
    pad = ("    " if lang == "py" else "  ") * depth
    if node is None:
        return [pad + ('raise ValueError("this branch is not in the source script")' if lang == "py" else
                       'throw new Error("this branch is not in the source script");')]
    if isinstance(node, Leaf):
        return [pad + (f"return {node.raw}" if lang == "py" else f"return {node.raw};")]
    if lang == "py":
        return ([f'{pad}if x["{node.feat}"] <= {node.raw}:'] + _code(node.le, depth + 1, lang) +
                [f"{pad}else:"] + _code(node.gt, depth + 1, lang))
    return ([f'{pad}if (x["{node.feat}"] <= {node.raw}) {{'] + _code(node.le, depth + 1, lang) +
            [f"{pad}}} else {{"] + _code(node.gt, depth + 1, lang) + [f"{pad}}}"])


def _header(title: str) -> list:
    return [f"{title}: the decision trees of the Pine script as functions.", "", *textwrap.wrap(BETA, 100), "",
            "Each tree function takes the indicator values of one bar (name -> number, computed as the Pine",
            "script computes them; see the .md for what each one is) and returns that tree's score. score()",
            "combines the trees as the script does and signal() applies the script's thresholds. TradingView",
            "keeps the previous bar's score when a value is na; these functions expect numbers.", "",
            "The price exits (stop loss, take profits and their stages: the constants below) are NOT simulated:",
            "they act on the prices after the entry, which one bar's indicator values do not tell. They are",
            "here as data; TradingView applies them when it runs the Pine script."]


PCT_NAMES = {"sl": "STOP_LOSS_PCT", "tp1": "TAKE_PROFIT_1_PCT", "tp2": "TAKE_PROFIT_2_PCT",
             "tp3": "TAKE_PROFIT_3_PCT"}


def _constants(script: Script, lang: str) -> list:
    """BUY_AT, ARM_EXITS_AT, CLOSE_AT and the exits as data, in Python or JavaScript."""
    none, start, end = ("None", "", "") if lang == "py" else ("null", "export const ", ";")
    exits = script.exits

    def const(name, value, note=""):
        return f"{start}{name} = {value if value is not None else none}{end}" + (f"  # {note}" if lang == "py" and
                                                                                  note else f" // {note}" if note else "")
    out = [const("BUY_AT", script.buy, "opens a long position when score() is at least this"),
           const("ARM_EXITS_AT", script.arm, "at most this: places or moves the stop loss and take profit"),
           const("CLOSE_AT", script.close, "closes the position when score() is at most this"), ""]
    out.append(("# " if lang == "py" else "// ") + "The exits, in % of the entry price (the script's inputs). "
               "Not simulated here.")
    for key, name in PCT_NAMES.items():
        out.append(const(name, exits.pct.get(key) if exits else None, exits.titles.get(key, "") if exits else ""))
    rows = []
    for stage in exits.stages if exits and script.arm is not None else []:
        reached = exits.pct[stage.reached_at] if stage.reached_at else none
        rows.append(f'    {{"stage": {stage.n}, "from_high_pct": {reached}, "stop_pct": {stop_pct(stage, exits)}, '
                    f'"take_profit_pct": {exits.pct[stage.profit]}}},')
    mark = "# " if lang == "py" else "// "
    out += [f"{mark}Each stage: from when (the bar's high, in % above the entry price; {none}: from the entry),",
            f"{mark}then its stop and its take profit, in % from the entry price (- below, + above)."]
    out += [f"{start}STAGES = [", *rows, f"]{end}"] if rows else [f"{start}STAGES = []{end}"]
    trailing = "false" if lang == "js" else "False"
    note = ("the 'activate trailing' input exists but the script never reads it: no trailing stop"
            if exits and exits.trailing is not None and not exits.trailing_used else "")
    if exits and exits.trailing_used:
        trailing, note = none, "the script uses its 'activate trailing' input: see the Pine script"
    out += [const("TRAILING_STOP", trailing, note), ""]
    return out


def to_python(script: Script, title: str) -> str:
    out = ['"""' + "\n".join(_header(title)) + '\n"""', "", *_constants(script, "py"),
           f"INPUTS = {json.dumps(features(script))}", ""]
    for tree in script.trees:
        out += ["", f"def tree_{tree.index}(x):", f'    """{tree.name}"""'] + _code(tree.root, 1, "py") + [""]
    calls = " + ".join(f"tree_{t.index}(x)" for t in script.trees) or "0.0"
    joined = calls if script.combine == "sum" else f"({calls}) / {max(len(script.trees), 1)}"
    out += ["", "def score(x):", f"    return {joined}", "", "",
            "def signal(x):",
            '    """buy, close, arm_exits or none: what the script does with the score (the exits themselves',
            '    are not simulated)."""',
            "    s = score(x)",
            "    if BUY_AT is not None and s >= BUY_AT:", '        return "buy"',
            "    if CLOSE_AT is not None and s <= CLOSE_AT:", '        return "close"',
            "    if ARM_EXITS_AT is not None and s <= ARM_EXITS_AT:", '        return "arm_exits"',
            '    return "none"', ""]
    return "\n".join(out)


def to_javascript(script: Script, title: str) -> str:
    out = ["/*"] + [(" * " + line).rstrip() for line in _header(title)] + [" */", "", *_constants(script, "js"),
           f"export const INPUTS = {json.dumps(features(script))};", ""]
    for tree in script.trees:
        out += [f"// {tree.name}", f"export function tree{tree.index}(x) {{"] + _code(tree.root, 1, "js") + ["}", ""]
    calls = " + ".join(f"tree{t.index}(x)" for t in script.trees) or "0"
    joined = calls if script.combine == "sum" else f"({calls}) / {max(len(script.trees), 1)}"
    out += ["export function score(x) {", f"  return {joined};", "}", "",
            "// buy, close, arm_exits or none: what the script does with the score (the exits are not simulated).",
            "export function signal(x) {", "  const s = score(x);",
            '  if (BUY_AT !== null && s >= BUY_AT) return "buy";',
            '  if (CLOSE_AT !== null && s <= CLOSE_AT) return "close";',
            '  if (ARM_EXITS_AT !== null && s <= ARM_EXITS_AT) return "arm_exits";', '  return "none";', "}", ""]
    return "\n".join(out)


def readme(stem: str, title: str, contact: str) -> str:
    return "\n".join([
        f"{title} - Edgefolio", "",
        f"{stem}.pine   The strategy for TradingView: the product.",
        f"{stem}.md     The rules in plain words, generated from every tree of the script (handy for AI assistants).",
        f"{stem}.py     Python version of the trees. {BETA}",
        f"{stem}.js     JavaScript version of the trees. Beta as well, same caveat.", "",
        "Add it to TradingView:",
        f"1. Open {stem}.pine and copy all of it.",
        "2. Sign in to TradingView (the free plan works).",
        "3. Open the chart of the strategy's symbol and interval.",
        "4. Open the Pine Editor, paste the script and click \"Save\".",
        "5. Click \"Add to chart\" and look at the Strategy Tester.", "",
        "Past results do not guarantee future results. Trading involves significant risk.",
        f"Questions: {contact}", ""])


def build_zip(src: str, stem: str, contact: str = "sales@tuisku.eu") -> bytes:
    """The .zip a buyer downloads: the script and the formats generated from it."""
    script = parse(src)
    title = script.name or stem
    buf = io.BytesIO()
    with zipfile.ZipFile(buf, "w", zipfile.ZIP_DEFLATED) as z:
        z.writestr(f"{stem}.pine", src)
        z.writestr(f"{stem}.md", to_markdown(script, title))
        z.writestr(f"{stem}.py", to_python(script, title))
        z.writestr(f"{stem}.js", to_javascript(script, title))
        z.writestr("README.txt", readme(stem, title, contact))
    return buf.getvalue()
