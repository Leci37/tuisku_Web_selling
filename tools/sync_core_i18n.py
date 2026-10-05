"""Copy the shared texts the storefront uses from zlecitool-core's common.json.

    python tools/sync_core_i18n.py ../zlecitool-core/zlecitool_core/i18n/common.json

The storefront reads its own texts from storefront/i18n/storefront.ui.json and the shared ones
(language names, legal links, Free, Buy, email, the tour buttons) from storefront/i18n/common.json,
which is this subset of the core file: never repeat a shared text in the tool file.
"""
import json
import re
import sys
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
OUT = ROOT / "storefront" / "i18n" / "common.json"
META = ["_languages", "_rtl_languages", "_language_labels"]


def used_keys() -> set:
    """Keys the storefront code asks for that are not in its own file."""
    tool = json.loads((ROOT / "storefront" / "i18n" / "storefront.ui.json").read_text(encoding="utf-8"))
    code = "\n".join(p.read_text(encoding="utf-8") for p in (ROOT / "storefront" / "js").rglob("*.js"))
    words = set(re.findall(r"['\"]([A-Za-z][A-Za-z0-9_]*)['\"]", code))
    return {w for w in words if w not in tool}


def main(core_file: str):
    core = json.loads(Path(core_file).read_text(encoding="utf-8"))
    keep = [k for k in META if k in core] + sorted(k for k in used_keys() if k in core and not k.startswith("_"))
    out = {"_comment": "Shared texts from zlecitool-core (zlecitool_core/i18n/common.json): only the keys the "
                       "storefront uses. Refresh with: python tools/sync_core_i18n.py PATH/TO/common.json"}
    out.update({k: core[k] for k in keep})
    OUT.write_text(json.dumps(out, ensure_ascii=False, indent=1) + "\n", encoding="utf-8")
    print(f"{OUT.relative_to(ROOT)}: {len(keep)} keys")


if __name__ == "__main__":
    main(sys.argv[1])
