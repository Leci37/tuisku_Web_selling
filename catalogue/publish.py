"""Turn the strategy factory's export into the shop's catalogue.

    python catalogue/publish.py EXPORT.csv [--assets DIR] [--prune]

EXPORT.csv is the tab-separated file the factory writes (pine_TW_img_info_*_WEB.csv). This:
  - keeps one row per strategy (ticker, interval, key_techs, id_model): the export repeats some;
  - rewrites every image and preview path to a relative storefront/assets/... path, whether the
    export gave a local path or an absolute raw.githubusercontent.com URL;
  - drops pine_path, the location of the full paid script, which must never be public;
  - names a ticker the export calls by its exchange code (BINANCE:XRPUSD) as "XRP / US Dollar",
    or by the name another row of the same ticker has;
  - keeps the shop's own optional columns (version) from the current catalogue.csv when the
    export does not bring them, so a re-publish does not reset every strategy to v1;
  - writes catalogue/catalogue.csv, the one file both the storefront and the API read
    (the API takes prices from it, never from the browser).

--assets DIR  copies the charts, icons and previews the catalogue uses from DIR (the factory's
              d_result/ folder) into storefront/assets/.
--prune       deletes files in storefront/assets/{charts,previews} that no catalogue row uses.
The paid scripts are not handled here: they go to the API's private storage (STRATEGIES_DIR).

Every preview is cut as the factory cuts the paid ones (the script up to 50 lines into its first
tree, then a note): the factory's previews of the free strategies were the whole script, which
made the free download's email step pointless.
"""
import argparse
import posixpath
import shutil
from pathlib import Path

import pandas as pd

from previews import cut_preview

ROOT = Path(__file__).resolve().parent.parent
ASSETS = ROOT / "storefront" / "assets"
OUT = ROOT / "catalogue" / "catalogue.csv"
KEY = ["ticker", "interval", "key_techs", "id_model"]
# Columns the shop adds that the factory does not write (the API defaults them when missing).
OPTIONAL = ["version"]

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


def cut_previews(names) -> int:
    """Cut every preview of the catalogue in place; returns how many needed it."""
    done = 0
    for n in names:
        f = ASSETS / "previews" / n
        if f.is_file():
            text = f.read_text(encoding="utf-8")
            cut = cut_preview(text)
            if cut != text:
                f.write_text(cut, encoding="utf-8")
                done += 1
    return done


def keep_optional(df: pd.DataFrame, previous: Path) -> pd.DataFrame:
    if not previous.is_file():
        return df
    old = pd.read_csv(previous, sep="\t", dtype=str)
    carry = [c for c in OPTIONAL if c in old.columns and c not in df.columns]
    if not carry:
        return df
    old = old[KEY + carry].drop_duplicates(subset=KEY)
    return df.astype({k: str for k in KEY}).merge(old, on=KEY, how="left")


def readable_names(df: pd.DataFrame) -> pd.DataFrame:
    """The export names a few crypto rows by their exchange symbol; the page shows Name as is."""
    coded = df["Name"].astype(str).str.contains(":")
    good = df[~coded].drop_duplicates("ticker").set_index("ticker")["Name"]
    def name(row):
        if row["ticker"] in good:
            return good[row["ticker"]]
        base = row["ticker"][:-4] if row["ticker"].endswith("USDT") else row["ticker"]
        return f"{base} / US Dollar"
    df.loc[coded, "Name"] = df[coded].apply(name, axis=1)
    return df


def publish(export: Path, assets_src: Path = None) -> pd.DataFrame:
    df = pd.read_csv(export, sep="\t", dtype={k: str for k in KEY})
    before = len(df)
    df = df.drop_duplicates(subset=KEY, keep="first").drop(columns=["pine_path"], errors="ignore")
    df = keep_optional(df, OUT)
    df = readable_names(df)
    for col, (sub, src_folder) in PATH_COLUMNS.items():
        names = df[col].map(file_name)
        df[col] = "assets/" + sub + "/" + names
        if assets_src:
            (ASSETS / sub).mkdir(parents=True, exist_ok=True)
            for n in names.unique():
                src = assets_src / src_folder / n
                if src.exists() and not (ASSETS / sub / n).exists():
                    shutil.copy2(src, ASSETS / sub / n)
    cut = cut_previews(df["pine_path_shadow"].map(file_name).unique())
    df.to_csv(OUT, sep="\t", index=False)
    print(f"{OUT.relative_to(ROOT)}: {len(df)} strategies ({before - len(df)} repeated rows dropped, "
          f"{cut} previews cut to their public part)")
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
