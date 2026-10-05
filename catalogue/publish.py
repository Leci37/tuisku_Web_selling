"""Turn the strategy factory's export into the shop's catalogue.

    python catalogue/publish.py EXPORT.csv [--assets DIR] [--prune]

EXPORT.csv is the tab-separated file the factory writes (pine_TW_img_info_*_WEB.csv). This:
  - keeps one row per strategy (ticker, interval, key_techs, id_model): the export repeats some;
  - rewrites every image and preview path to a relative storefront/assets/... path, whether the
    export gave a local path or an absolute raw.githubusercontent.com URL;
  - drops pine_path, the location of the full paid script, which must never be public;
  - writes catalogue/catalogue.csv, the one file both the storefront and the API read
    (the API takes prices from it, never from the browser).

--assets DIR  copies the charts, icons and previews the catalogue uses from DIR (the factory's
              d_result/ folder) into storefront/assets/.
--prune       deletes files in storefront/assets/{charts,previews} that no catalogue row uses.
The paid scripts are not handled here: they go to the API's private storage (STRATEGIES_DIR).
"""
import argparse
import posixpath
import shutil
from pathlib import Path

import pandas as pd

ROOT = Path(__file__).resolve().parent.parent
ASSETS = ROOT / "storefront" / "assets"
OUT = ROOT / "catalogue" / "catalogue.csv"
KEY = ["ticker", "interval", "key_techs", "id_model"]

# column -> (assets subfolder, the factory's folder name)
PATH_COLUMNS = {
    "path_stra": ("charts", "pine_TW_img"),
    "path_candle": ("charts", "pine_TW_img"),
    "path_ico": ("icons", "icons"),
    "path_ico_big": ("icons", "icons"),
    "pine_path_shadow": ("previews", "pine_TW_hide"),
}


def file_name(value: str) -> str:
    """Last path component of a local path, a Windows path or a URL."""
    return posixpath.basename(str(value).replace("\\", "/"))


def publish(export: Path, assets_src: Path = None) -> pd.DataFrame:
    df = pd.read_csv(export, sep="\t")
    before = len(df)
    df = df.drop_duplicates(subset=KEY, keep="first").drop(columns=["pine_path"], errors="ignore")
    for col, (sub, src_folder) in PATH_COLUMNS.items():
        names = df[col].map(file_name)
        df[col] = "assets/" + sub + "/" + names
        if assets_src:
            (ASSETS / sub).mkdir(parents=True, exist_ok=True)
            for n in names.unique():
                src = assets_src / src_folder / n
                if src.exists() and not (ASSETS / sub / n).exists():
                    shutil.copy2(src, ASSETS / sub / n)
    df.to_csv(OUT, sep="\t", index=False)
    print(f"{OUT.relative_to(ROOT)}: {len(df)} strategies ({before - len(df)} repeated rows dropped)")
    return df


def unused_assets(df: pd.DataFrame) -> list:
    used = {Path(p) for col in PATH_COLUMNS for p in df[col]}
    out = []
    for sub in ("charts", "previews"):
        for f in sorted((ASSETS / sub).glob("*")):
            if f.relative_to(ROOT / "storefront") not in used:
                out.append(f)
    return out


if __name__ == "__main__":
    ap = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    ap.add_argument("export", type=Path)
    ap.add_argument("--assets", type=Path, help="factory d_result/ folder to copy assets from")
    ap.add_argument("--prune", action="store_true", help="delete charts/previews no row uses")
    args = ap.parse_args()
    catalogue = publish(args.export, args.assets)
    unused = unused_assets(catalogue)
    print(f"{len(unused)} files in storefront/assets/charts|previews are not used by any row")
    if args.prune:
        for f in unused:
            f.unlink()
        print("deleted them")
