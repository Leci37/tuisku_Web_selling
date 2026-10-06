# -*- coding: utf-8 -*-
"""catalogue/publish.py, el puente con la aplicación gemela que genera los datos
(Leci37/ML-Sklearn-strategy-stock-crypto-for-TraderView): su export pasa a ser catalogue/catalogue.csv y
sus gráficos, iconos y vistas previas van a static/assets/, de donde los sirve la tienda."""
import importlib.util
import sys
from pathlib import Path

import pandas as pd
import pytest

ROOT = Path(__file__).resolve().parent.parent
FACTORY_ROW = {"Price": "79", "ticker": "AAPL", "interval": "1Day", "key_techs": "1ADX", "id_model": "aaaa1111",
               "Name": "Apple", "pine_path": "C:/fabrica/d_result/pine_TW_b/secreto.pine",
               "path_stra": "C:\\fabrica\\d_result\\pine_TW_img\\AAPL_1Day_1ADX_aaaa1111_profit.png",
               "path_candle": "https://raw.githubusercontent.com/x/y/main/d_result/pine_TW_img/AAPL_1Day_1ADX_aaaa1111_candel.png",
               "path_ico": "d_result/icons/AAPL.png", "path_ico_big": "d_result/icons/AAPL_big.png",
               "pine_path_shadow": "d_result/pine_TW_hide/AAPL_1Day_1ADX_aaaa1111.pine"}


@pytest.fixture
def publish():
    sys.path.insert(0, str(ROOT / "catalogue"))  # publish.py importa previews, a su lado
    try:
        spec = importlib.util.spec_from_file_location("publish", ROOT / "catalogue" / "publish.py")
        module = importlib.util.module_from_spec(spec)
        spec.loader.exec_module(module)
        yield module
    finally:
        sys.path.remove(str(ROOT / "catalogue"))


def test_the_assets_go_where_the_shop_serves_them(publish):
    """Las rutas del catálogo ("assets/charts/…") son relativas a static/: ahí copia publish.py."""
    assert publish.ASSETS == ROOT / "static" / "assets"
    first = pd.read_csv(ROOT / "catalogue" / "catalogue.csv", sep="\t", nrows=1, dtype=str).iloc[0]
    for col in ("path_stra", "path_candle", "path_ico", "pine_path_shadow"):
        assert (publish.ASSETS.parent / first[col]).is_file(), col


def test_an_export_of_the_factory_is_published(publish, tmp_path, monkeypatch):
    d_result = tmp_path / "fabrica" / "d_result"
    for sub, name in [("pine_TW_img", "AAPL_1Day_1ADX_aaaa1111_profit.png"),
                      ("pine_TW_img", "AAPL_1Day_1ADX_aaaa1111_candel.png"), ("icons", "AAPL.png"),
                      ("icons", "AAPL_big.png")]:
        (d_result / sub).mkdir(parents=True, exist_ok=True)
        (d_result / sub / name).write_bytes(b"png")
    (d_result / "pine_TW_hide").mkdir()
    script = "//@version=5\n" + "\n".join(["decision_tree_0() =>"] + [f"    x{i} = {i}" for i in range(80)]) + "\n"
    (d_result / "pine_TW_hide" / "AAPL_1Day_1ADX_aaaa1111.pine").write_text(script)
    export = tmp_path / "pine_TW_img_info_6_WEB.csv"
    pd.DataFrame([FACTORY_ROW, FACTORY_ROW]).to_csv(export, sep="\t", index=False)  # el export repite filas

    shop = tmp_path / "shop"
    monkeypatch.setattr(publish, "ROOT", shop)
    monkeypatch.setattr(publish, "ASSETS", shop / "static" / "assets")
    monkeypatch.setattr(publish, "OUT", shop / "catalogue.csv")
    df = publish.publish(export, d_result)

    assert len(df) == 1 and "pine_path" not in df.columns  # dónde está el script de pago nunca sale
    row = df.iloc[0]
    assert row["path_stra"] == "assets/charts/AAPL_1Day_1ADX_aaaa1111_profit.png"
    for col in ("path_stra", "path_candle", "path_ico", "path_ico_big", "pine_path_shadow"):
        assert (shop / "static" / row[col]).is_file(), col
    preview = (shop / "static" / row["pine_path_shadow"]).read_text()
    assert preview.endswith(sys.modules["previews"].PREVIEW_TAIL) and "x70 = 70" not in preview  # cortada

    (shop / "static" / "assets" / "charts" / "OLD_profit.png").write_bytes(b"png")
    assert [f.name for f in publish.unused_assets(df)] == ["OLD_profit.png"]
