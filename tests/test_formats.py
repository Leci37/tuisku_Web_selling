"""The formats generated from a full Pine script: the parser, the .md rules, the beta .py/.js and the zip."""
import io
import json
import random
import re
import shutil
import subprocess
import zipfile

import pytest

from api import formats
from api.settings import ROOT

TWO_TREES = """//@version=5
strategy("Tuisku_NVDA_1Day_1ULT_cccc3333", overlay=true)
decision_tree_0_NVDA_1Day_cccc3333(ema3, ema12, histA_IsUpInt)=>
\tvar float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=3)
\tif( ema3 <= 1954.56 )
\t\tif( ema12 <= -30.33 )
\t\t\tif( ema3 <= 100.5 )
\t\t\t\tret := 1.000000 // buy
\t\t\tif( ema3 > 100.5 )
\t\t\t\tret := 0.600000
\t\tif( ema12 > -30.33 )
\t\t\tret := -0.950000 // sell
\tif( ema3 > 1954.56 )
\t\tif( histA_IsUpInt <= 0.5 )
\t\t\tret := 0.100000
\t\tif( histA_IsUpInt > 0.5 )
\t\t\tret := -0.300000
\t
    ret //return
decision_tree_1_NVDA_1Day_cccc3333(ema3)=>
\tvar float ret = 0
\tif( ema3 <= 50 )
\t\tret := 0.5
\tif( ema3 > 50 )
\t\tret := -0.5
    ret //return
plot(close)
float op_operation = (decision_tree_0_NVDA_1Day_cccc3333(ema3, ema12, histA_IsUpInt) + decision_tree_1_NVDA_1Day_cccc3333(ema3)) / 2
if (op_operation <= 0)
    strategy.cancel("x")
if (op_operation >= 0.55)
    strategy.entry("x", strategy.long)
if (op_operation <= -0.9)
    strategy.close("x", comment = "under Le1")
"""
ONE_TREE = TWO_TREES.replace(
    "(decision_tree_0_NVDA_1Day_cccc3333(ema3, ema12, histA_IsUpInt) + decision_tree_1_NVDA_1Day_cccc3333(ema3)) / 2",
    "decision_tree_0_NVDA_1Day_cccc3333(ema3, ema12, histA_IsUpInt)")
PREVIEWS = sorted((ROOT / "storefront" / "assets" / "previews").glob("*.pine"))


def pine_as_python(src: str):
    """Each tree function translated line by line, independently of formats.parse, to check it against."""
    funcs, out = {}, None
    for line in src.replace("\r", "").split("\n"):
        head = re.match(r"^decision_tree_(\d+)_\w*\(", line)
        if head:
            out = ["def f(x):"]
            funcs[int(head.group(1))] = out
            continue
        if out is None or not line.strip():
            continue
        if not line[0].isspace():
            out = None
            continue
        pad = "    " * (len(line) - len(line.lstrip("\t")))
        text = line.strip()
        if m := re.match(r"^if\(\s*(\w+)\s*(<=|>)\s*(\S+)\s*\)", text):
            out.append(f'{pad}if x["{m.group(1)}"] {m.group(2)} {m.group(3)}:')
        elif m := re.match(r"^(?:var float )?ret\s*:?=\s*(\S+)", text):
            out.append(f"{pad}ret = {m.group(1)}")
    trees = {}
    for n, lines in funcs.items():
        scope = {}
        exec("\n".join(lines + ["    return ret"]), scope)
        trees[n] = scope["f"]
    return trees


def generated(script, title="t"):
    scope = {}
    exec(formats.to_python(script, title), scope)
    return scope


def samples(script, n=300, seed=7):
    """Bar values around every threshold, so every leaf is reached."""
    cuts = {}
    for tree in script.trees:
        for path, _ in formats.leaves(tree.root):
            for f, raw, _ in path:
                cuts.setdefault(f, set()).add(float(raw))
    rnd = random.Random(seed)
    for _ in range(n):
        yield {f: rnd.choice(sorted(c)) + rnd.choice((-1, 0, 0.001, 1)) * rnd.random() for f, c in cuts.items()}


def test_parses_trees_combination_and_thresholds():
    s = formats.parse(TWO_TREES)
    assert s.name == "Tuisku_NVDA_1Day_1ULT_cccc3333"
    assert [t.index for t in s.trees] == [0, 1] and s.combine == "mean"
    assert (s.buy, s.close) == ("0.55", "-0.9"), "the <= 0 block only manages exits; -0.9 closes"
    t = s.trees[0]
    assert t.inputs == ["ema3", "ema12", "histA_IsUpInt"] and t.missing == 0
    assert t.regressor == "criterion=friedman_mse, max_depth=3"
    assert [(leaf.raw, leaf.sig) for _, leaf in formats.leaves(t.root)] == [
        ("1.000000", "buy"), ("0.600000", ""), ("-0.950000", "sell"), ("0.100000", ""), ("-0.300000", "")]


def test_markdown_rules_in_plain_words():
    md = formats.to_markdown(formats.parse(ONE_TREE), "Tuisku_NVDA")
    assert "1. If ema3 ≤ 100.5 and ema12 ≤ -30.33 → Buy (score 1.00)" in md, "repeated splits become one bound"
    assert "2. If 100.5 < ema3 ≤ 1954.56 and ema12 ≤ -30.33 → Buy (score 0.60)" in md, "0.60 ≥ 0.55: the script buys"
    assert "3. If ema3 ≤ 1954.56 and ema12 > -30.33 → Sell (score -0.95)" in md
    assert "4. If ema3 > 1954.56 and histA_IsUpInt = 0 → Wait (score 0.10)" in md, "0/1 values read as yes/no"
    assert "- `ema3`: Slow average." in md, "names from storefront/trees/features.json"
    assert "0.55 or more" in md and "-0.9 or less" in md
    # with several trees one leaf does not decide alone: the factory's labels are used
    md2 = formats.to_markdown(formats.parse(TWO_TREES), "Tuisku_NVDA")
    assert "→ Wait (score 0.60)" in md2 and "## Tree 2 of 2" in md2 and "average" in md2


def test_python_matches_the_pine_trees_and_combines_them_like_the_script():
    script = formats.parse(TWO_TREES)
    py, pine = generated(script), pine_as_python(TWO_TREES)
    assert "BETA" in py["__doc__"] and "TradingView" in py["__doc__"]
    for x in samples(script):
        assert py["tree_0"](x) == pine[0](x) and py["tree_1"](x) == pine[1](x)
        assert py["score"](x) == pytest.approx((pine[0](x) + pine[1](x)) / 2)
    assert py["signal"]({"ema3": 10, "ema12": -40, "histA_IsUpInt": 0}) == "buy"      # (1 + 0.5) / 2
    assert py["signal"]({"ema3": 3000, "ema12": 0, "histA_IsUpInt": 1}) == "none"     # (-0.3 - 0.5) / 2
    assert py["INPUTS"] == ["ema3", "ema12", "histA_IsUpInt"]


@pytest.mark.skipif(not shutil.which("node"), reason="node is not installed")
def test_javascript_gives_the_same_scores(tmp_path):
    script = formats.parse(TWO_TREES)
    xs = list(samples(script, 100))
    (tmp_path / "s.mjs").write_text(formats.to_javascript(script, "t"))
    (tmp_path / "run.mjs").write_text("import * as s from './s.mjs';\n"
                                      f"const xs = {json.dumps(xs)};\n"
                                      "console.log(JSON.stringify(xs.map(x => [s.score(x), s.signal(x)])));\n")
    out = json.loads(subprocess.run(["node", str(tmp_path / "run.mjs")], capture_output=True, text=True,
                                    check=True).stdout)
    py = generated(script)
    assert out == [[pytest.approx(py["score"](x)), py["signal"](x)] for x in xs]


def test_every_preview_parses():
    assert len(PREVIEWS) > 2000
    complete = 0
    for path in PREVIEWS:
        script = formats.parse(path.read_text(encoding="utf-8"))
        assert script.trees and any(leaf for _, leaf in formats.leaves(script.trees[0].root)), path.name
        complete += script.trees[0].missing == 0
    assert complete > 100, "some previews hold a whole tree: those are checked leaf by leaf below"


def test_whole_previews_match_the_pine_leaf_by_leaf():
    checked = 0
    for path in PREVIEWS[::7]:
        src = path.read_text(encoding="utf-8")
        script = formats.parse(src)
        if script.trees[0].missing:
            continue
        py, pine = generated(script), pine_as_python(src)
        for x in samples(script, 60):
            assert py["tree_0"](x) == pine[0](x), path.name
        checked += 1
    assert checked > 10


def test_a_cut_preview_says_what_is_missing():
    path = next(p for p in PREVIEWS if formats.parse(p.read_text(encoding="utf-8")).trees[0].missing)
    script = formats.parse(path.read_text(encoding="utf-8"))
    assert "(not in this copy of the script)" in formats.to_markdown(script, "x")
    with pytest.raises(ValueError):  # a branch the preview does not have is never guessed
        for x in samples(script, 400):
            generated(script)["tree_0"](x)


def test_zip_holds_the_script_and_every_format():
    data = formats.build_zip(ONE_TREE, "Tuisku_NVDA_1Day_1ULT_cccc3333", "help@example.com")
    z = zipfile.ZipFile(io.BytesIO(data))
    stem = "Tuisku_NVDA_1Day_1ULT_cccc3333"
    assert sorted(z.namelist()) == sorted([f"{stem}.pine", f"{stem}.md", f"{stem}.py", f"{stem}.js", "README.txt"])
    assert z.read(f"{stem}.pine").decode() == ONE_TREE
    assert "Beta" in z.read("README.txt").decode() or "BETA" in z.read("README.txt").decode()
    assert "help@example.com" in z.read("README.txt").decode()
    assert "BETA" in z.read(f"{stem}.js").decode()


def test_a_script_without_trees_still_gets_its_zip():
    z = zipfile.ZipFile(io.BytesIO(formats.build_zip('//@version=5\nstrategy("x")\n', "x")))
    assert "No decision trees" in z.read("x.md").decode()
    scope = {}
    exec(z.read("x.py").decode(), scope)
    assert scope["signal"]({}) == "none"
