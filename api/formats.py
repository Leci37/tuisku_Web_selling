"""The other formats of a strategy, generated from its full Pine script: the rules in plain words (.md),
Python and JavaScript versions of the trees (.py, .js, beta) and the zip that carries them with the .pine.

The factory writes every tree as a Pine function `decision_tree_N_...(...) =>` of nested
`if( feat <= v )` / `if( feat > v )` blocks that end in `ret := score // buy|sell`, and the script
reads `op_operation` from the trees, buys at `op_operation >= X` and closes at `op_operation <= Y`.
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
class Script:
    name: str
    trees: list = field(default_factory=list)
    combine: str = "mean"          # how the script joins the trees' scores: mean or sum
    buy: Optional[str] = None      # op_operation >= buy opens a long position
    close: Optional[str] = None    # op_operation <= close closes it


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


def parse(src: str) -> Script:
    lines = _lines(src)
    name = next((m.group(1) for _, t in lines if (m := RE_NAME.match(t))), "")
    script = Script(name, [_tree(lines, n) for n, (_, t) in enumerate(lines) if RE_TREE.match(t)])
    for n, (ind, text) in enumerate(lines):
        m = RE_COMBINE.search(text)
        if m and "decision_tree_" in m.group(1) and not text.startswith("//"):
            expr = m.group(1)
            used = {int(x) for x in re.findall(r"decision_tree_(\d+)_", expr)}
            script.trees = [t for t in script.trees if t.index in used] or script.trees
            script.combine = "sum" if "+" in expr and "/" not in expr else "mean"
        if (m := RE_BUY.match(text)) and script.buy is None:
            script.buy = m.group(1)
        if (m := RE_LOW.match(text)) and script.close is None:
            block = []
            for sub_ind, sub in lines[n + 1:]:
                if sub_ind <= ind:
                    break
                block.append(sub)
            if any("strategy.close" in s for s in block):
                script.close = m.group(1)
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


def action(leaf: Leaf, script: Script) -> str:
    """What the script does when this leaf decides. With one tree the leaf's score is the script's score,
    so its thresholds tell; the factory's own buy/sell comments (at ±0.7) are not what the script acts on.
    With several trees one leaf does not decide alone: the factory's label is the best hint."""
    if len(script.trees) == 1 and script.buy:
        if leaf.value >= float(script.buy):
            return "Buy"
        return "Sell" if script.close and leaf.value <= float(script.close) else "Wait"
    return ACTIONS[leaf.sig]


def to_markdown(script: Script, title: str) -> str:
    n = len(script.trees)
    out = [f"# {title}: the rules in plain words", "",
           f"Generated from the Pine script of {script.name or title} (Edgefolio). The Pine script is the "
           "product and the reference; this file explains what it decides, for people and for AI assistants.", ""]
    how = (f"On every bar, each of the {n} decision trees gives a score between -1 and 1, and the script "
           f"takes their {'sum' if script.combine == 'sum' else 'average'}." if n > 1 else
           "On every bar, the decision tree gives a score between -1 and 1.")
    if script.buy:
        how += f" It buys (opens a long position) when the score is {script.buy} or more"
        how += f" and closes the position when it is {script.close} or less." if script.close else "."
    out += ["## How it decides", "", how,
            "Each rule below is one leaf of a tree: when every condition holds, the tree gives that score. "
            + ("Buy, Sell (close the position) and Wait are what the script does with that score."
               if len(script.trees) == 1 and script.buy else
               "Buy and Sell mark the leaves the factory labelled as strong signals; Wait is any other leaf."), ""]
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
            "keeps the previous bar's score when a value is na; these functions expect numbers."]


def to_python(script: Script, title: str) -> str:
    out = ['"""' + "\n".join(_header(title)) + '\n"""', "",
           f"BUY_AT = {script.buy}  # opens a long position when score() is at least this",
           f"CLOSE_AT = {script.close}  # closes it when score() is at most this",
           f"INPUTS = {json.dumps(features(script))}", ""]
    for tree in script.trees:
        out += ["", f"def tree_{tree.index}(x):", f'    """{tree.name}"""'] + _code(tree.root, 1, "py") + [""]
    calls = " + ".join(f"tree_{t.index}(x)" for t in script.trees) or "0.0"
    joined = calls if script.combine == "sum" else f"({calls}) / {max(len(script.trees), 1)}"
    out += ["", "def score(x):", f"    return {joined}", "", "",
            "def signal(x):", '    """buy, close or none, as the script acts on the score."""',
            "    s = score(x)",
            "    if BUY_AT is not None and s >= BUY_AT:", '        return "buy"',
            "    if CLOSE_AT is not None and s <= CLOSE_AT:", '        return "close"',
            '    return "none"', ""]
    return "\n".join(out)


def to_javascript(script: Script, title: str) -> str:
    out = ["/*"] + [(" * " + line).rstrip() for line in _header(title)] + [" */", "",
           f"export const BUY_AT = {script.buy or 'null'}; // opens a long position when score() is at least this",
           f"export const CLOSE_AT = {script.close or 'null'}; // closes it when score() is at most this",
           f"export const INPUTS = {json.dumps(features(script))};", ""]
    for tree in script.trees:
        out += [f"// {tree.name}", f"export function tree{tree.index}(x) {{"] + _code(tree.root, 1, "js") + ["}", ""]
    calls = " + ".join(f"tree{t.index}(x)" for t in script.trees) or "0"
    joined = calls if script.combine == "sum" else f"({calls}) / {max(len(script.trees), 1)}"
    out += ["export function score(x) {", f"  return {joined};", "}", "",
            "// buy, close or none, as the script acts on the score.",
            "export function signal(x) {", "  const s = score(x);",
            '  if (BUY_AT !== null && s >= BUY_AT) return "buy";',
            '  if (CLOSE_AT !== null && s <= CLOSE_AT) return "close";', '  return "none";', "}", ""]
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
