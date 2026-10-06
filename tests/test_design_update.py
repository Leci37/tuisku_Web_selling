# -*- coding: utf-8 -*-
"""tools/design_update.py, con una exportación hecha de docs/design: la que llegó la última vez.

Si una exportación igual que la anterior cambiara algo, la mezcla a tres estaría tocando lo que la tienda
adaptó; y un cambio del diseño tiene que llegar a la vista ya adaptada. Las dos, sin escribir nada (sin
--apply): la prueba no toca el repo.
"""
import re
import shutil
import subprocess
import sys
import zipfile
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
DESIGN = ROOT / "docs" / "design"
STOREFRONT = "Storefront v7.dc.html"


def _export(tmp_path, change=None):
    """El zip como lo exporta Claude Design: prototype/ con la maqueta y, fuera, sus notas (docs/design/handoff/)."""
    src = tmp_path / "export"
    shutil.copytree(DESIGN, src / "prototype", ignore=shutil.ignore_patterns("handoff"))
    shutil.copytree(DESIGN / "handoff", src, dirs_exist_ok=True)
    if change:
        page = src / "prototype" / STOREFRONT
        old, new = change
        text = page.read_text(encoding="utf-8")
        assert text.count(old) == 1
        page.write_text(text.replace(old, new), encoding="utf-8")
    out = tmp_path / "export.zip"
    with zipfile.ZipFile(out, "w") as z:
        for f in sorted(src.rglob("*")):
            if f.is_file():
                z.write(f, f.relative_to(src).as_posix())
    return out


def _run(zip_path):
    return subprocess.run([sys.executable, "tools/design_update.py", str(zip_path)], cwd=ROOT,
                          capture_output=True, text=True, timeout=300)


def test_an_export_like_the_last_one_changes_nothing(tmp_path):
    done = _run(_export(tmp_path))
    assert done.returncode == 0, done.stdout + done.stderr
    assert "Cambiaría: 0 ficheros" in done.stdout, done.stdout


def test_a_design_change_reaches_the_adapted_view(tmp_path):
    # Un estilo que sólo está una vez en la maqueta y una vez en la vista de Lite: cambiarlo en el diseño
    # tiene que llegar a lite.js aunque la tienda haya cambiado lo de alrededor.
    lite = ROOT / "static" / "js" / "views" / "lite.js"
    page = (DESIGN / STOREFRONT).read_text(encoding="utf-8")
    view = lite.read_text(encoding="utf-8")
    style = next((s for s in re.findall(r'style="([^"]{30,80})"', view)
                  if page.count(s) == 1 and view.count(s) == 1), None)
    assert style, "no hay un estilo de Lite que esté una sola vez en la maqueta y en la vista"
    before = lite.read_bytes()

    done = _run(_export(tmp_path, change=(style, style + ";outline:0")))

    assert done.returncode == 0, done.stdout + done.stderr
    assert "static/js/views/lite.js" in done.stdout, done.stdout
    assert lite.read_bytes() == before, "sin --apply no se escribe nada"
