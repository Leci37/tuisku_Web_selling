# -*- coding: utf-8 -*-
"""Recorre la tienda en un navegador de verdad y guarda las capturas del README en docs/img/.

    PORT=5105 python app.py                 # en una terminal, con el .env de desarrollo (PAYPAL_MODE=fake,
                                            # DISCOUNT_CODES=demo20=0.20, sin SMTP: los correos, a <datos>/mail)
    python tools/screenshots.py             # en otra; lee el mismo .env para encontrar los correos

Lite → tres estrategias y un código en el carrito → Pro, con filtros y en tabla → la página de una
estrategia y «Cómo decide» → Pagar (PayPal de prueba) → el tutorial de instalación → la página de gracias
→ descargar un script de pago → darse de alta en el núcleo, confirmar el correo con el que se pagó (el
enlace, del correo que el servidor dejó en <datos>/mail) y Mis estrategias → el recorrido de bienvenida,
comparar, «Crea tu pack», una gratis por correo → árabe y español → la tienda en un móvil.
Es también la prueba de punta a punta: para en el primer paso que falla e informa de los errores de la
consola del navegador (también de la CSP). Las descargas necesitan los scripts de pago
(flask --app app edgefolio restore-scripts).

SHOP_URL (por defecto http://localhost:5105), CHROMIUM_PATH (un navegador) y OUT (por defecto docs/img).
"""
import email
import os
import re
import sys
import time
from email import policy
from pathlib import Path

from playwright.sync_api import sync_playwright

ROOT = Path(__file__).resolve().parent.parent
sys.path.insert(0, str(ROOT))
from zlecitool_core.config import load_env_file  # noqa: E402

load_env_file(ROOT / ".env")
BASE = os.environ.get("SHOP_URL", "http://localhost:5105").rstrip("/")
OUT = Path(os.environ.get("OUT") or ROOT / "docs" / "img")
MAIL = Path(os.environ.get("ZLECITOOL_DATA_DIR") or ROOT / "data") / "mail"
BUYER = "buyer@example.com"            # quien paga en el PayPal de prueba
ACCOUNT = "ana@example.com"            # la cuenta del núcleo con la que se entra después
PASSWORD = "probando-la-tienda-1"
STRATEGY = "AAPL_1Day_2CT0_8a979adf"   # la de la página de la estrategia y el árbol
problems = []


def step(name):
    print(f"· {name}", flush=True)


def shot(page, name, height=None, full=False):
    """Primero las imágenes perezosas; después, los ``height`` px de arriba (o la página entera)."""
    # desde arriba: la barra es fija, y una captura entera hecha con la página bajada la pinta en medio
    page.evaluate("window.scrollTo(0, 0); document.querySelectorAll('img[loading=lazy]').forEach(i => i.loading = 'eager')")
    page.wait_for_load_state("networkidle")
    page.wait_for_timeout(700)
    path = OUT / f"edgefolio_{name}.png"
    if height:
        page.screenshot(path=str(path), full_page=True, clip={"x": 0, "y": 0, "width": page.viewport_size["width"],
                                                               "height": height})
    else:
        page.screenshot(path=str(path), full_page=full)
    print(f"  saved {path.relative_to(ROOT) if path.is_relative_to(ROOT) else path}")


def emailed_link(to: str, pattern: str, after: float) -> str:
    """El enlace del correo más nuevo a ``to`` que el servidor dejó en <datos>/mail después de ``after``."""
    for _ in range(40):
        for path in sorted(MAIL.glob("*.eml"), key=lambda p: p.stat().st_mtime, reverse=True):
            if path.stat().st_mtime < after:
                break
            msg = email.message_from_bytes(path.read_bytes(), policy=policy.default)
            if msg["To"] == to:
                found = re.search(r"https?://\S+" + pattern + r"\S*", msg.get_content())
                if found:
                    return found.group(0)
        time.sleep(0.25)
    raise SystemExit(f"ningún correo a {to} en {MAIL}: ¿es la carpeta de datos del servidor?")


def button(page, text):
    """A button by its visible text: the icon fonts' glyphs end up in the accessible name, so
    get_by_role(name=..., exact=True) would not match."""
    return page.locator("button", has_text=re.compile(r"^\s*" + re.escape(text) + r"\s*$"))


def new_page(browser, width, height, lang="en", tour_seen=True):
    ctx = browser.new_context(viewport={"width": width, "height": height}, accept_downloads=True, locale="en-US")
    # el idioma es el de la carcasa (su cookie); el aviso de cookies, ya contestado
    ctx.add_cookies([{"name": "zt_lang", "value": lang, "url": BASE}, {"name": "zt_consent", "value": "none", "url": BASE}])
    # el recorrido de bienvenida sale una vez por navegador; cada contexto de aquí es un navegador nuevo
    if tour_seen:
        ctx.add_init_script("try { localStorage.setItem('edgefolio-tour-v1', '1'); } catch (e) {}")
    page = ctx.new_page()
    page.on("console", lambda m: problems.append(f"{m.type}: {m.text}") if m.type == "error" else None)
    page.on("pageerror", lambda e: problems.append(f"pageerror: {e}"))
    return page


def main():
    OUT.mkdir(parents=True, exist_ok=True)
    with sync_playwright() as p:
        launch = {"executable_path": os.environ["CHROMIUM_PATH"]} if os.environ.get("CHROMIUM_PATH") else {}
        browser = p.chromium.launch(**launch)
        page = new_page(browser, 1366, 900)

        step("Lite: three strategies and a code in the cart")
        page.goto(BASE + "/", wait_until="networkidle")
        page.get_by_text(re.compile(r"^Showing \d+ of ")).wait_for()
        buy = button(page, "Buy")
        for _ in range(3):
            buy.first.click()
            page.wait_for_timeout(300)
        page.get_by_text("Have a code?", exact=True).click()
        page.get_by_placeholder("Code").fill("demo20")
        button(page, "Apply").click()
        page.get_by_text("−35%").first.wait_for()  # 15% for over $160 + 20% for the code, priced by the server
        shot(page, "lite", height=1480)

        step("Pro")
        page.get_by_role("radio", name="Pro").click()
        page.get_by_text("strategies shown").wait_for()
        shot(page, "pro", height=1480)

        step("Pro with filters: two symbols and a win rate of 90% or more")
        panel = page.locator("aside").first
        # dispatched clicks: the sticky cart strip covers the panel's rows once the page has scrolled
        panel.get_by_text("Symbol", exact=True).dispatch_event("click")
        button(page, "Deselect all").dispatch_event("click")
        for name in ("Apple (AAPL)", "NVIDIA Corporation (NVDA)"):
            panel.get_by_text(name, exact=True).dispatch_event("click")
        panel.get_by_text("Symbol", exact=True).dispatch_event("click")
        panel.get_by_text("Win Rate (%)", exact=True).dispatch_event("click")
        low = panel.locator("input").nth(-2)
        low.fill("90")
        low.press("Enter")
        page.get_by_text("Clear all").first.wait_for()
        page.wait_for_timeout(1200)
        shot(page, "pro_filters", height=1300)
        button(page, "Table").click()
        page.locator("table").first.wait_for()
        shot(page, "table", height=1100)
        page.get_by_text("Clear all").first.click()
        button(page, "Rows").click()

        step("Strategy page and How it decides")
        page.goto(f"{BASE}/s/{STRATEGY}", wait_until="networkidle")
        page.get_by_text("Backtest results", exact=False).first.wait_for()
        shot(page, "strategy", height=1700)
        page.get_by_role("button", name="How it decides").first.click()
        page.get_by_text("Tree output", exact=False).first.wait_for()
        page.wait_for_timeout(1200)
        shot(page, "tree", height=1480)

        step("Checkout with the fake PayPal")
        page.goto(BASE + "/", wait_until="networkidle")
        page.get_by_role("button", name="Checkout").first.click()
        page.wait_for_url("**/thanks**", timeout=20000)
        page.get_by_text("Download all").first.wait_for(timeout=20000)
        page.wait_for_timeout(800)
        shot(page, "install")                       # the install tutorial opens the first time
        page.keyboard.press("Escape")
        shot(page, "thanks", height=1000)

        step("Download one paid file")
        with page.expect_download() as dl:
            page.get_by_role("link", name=".pine").first.click()
        d = dl.value
        first = Path(d.path()).read_text(errors="replace").splitlines()[0][:60]
        print(f"  {d.suggested_filename}: {first}")

        step("My strategies: an account of the core, and the email paid with, confirmed")
        page.goto(BASE + "/mine", wait_until="networkidle")
        assert "/login?next=/mine" in page.url, page.url        # Mis estrategias pide la sesión del núcleo
        for door in ("/register?next=/mine", "/login?next=/mine"):   # la cuenta, nueva o la de otra vuelta
            page.goto(BASE + door, wait_until="networkidle")
            page.locator("input[name=email]").fill(ACCOUNT)
            page.locator("input[name=password]").fill(PASSWORD)
            page.locator("form.account-form button[type=submit]").click()
            page.wait_for_load_state("networkidle")
            if page.url.rstrip("/").endswith("/mine"):
                break
        page.get_by_text(f"Signed in as {ACCOUNT}").first.wait_for()
        offer = page.get_by_text("Bought without an account?")
        if offer.count():                                   # se compró sin cuenta: confirmar ese correo
            asked = time.time() - 1
            page.locator("input[type=email]").fill(BUYER)
            button(page, "Send me the link").click()
            page.get_by_text("Check that inbox", exact=False).wait_for()
            page.goto(emailed_link(BUYER, r"/mine\?proof=", asked), wait_until="networkidle")
            page.get_by_role("button", name=f"Yes, {BUYER} is mine").click()
        page.get_by_role("link", name=".pine").first.wait_for()
        shot(page, "mine", height=900)

        step("The welcome tour, the first time")
        tour = new_page(browser, 1366, 900, tour_seen=False)
        tour.goto(BASE + "/", wait_until="networkidle")
        tour.get_by_text("Step 1 of 3").wait_for()
        shot(tour, "tour")

        step("Compare three strategies")
        lite = new_page(browser, 1366, 900)
        lite.goto(BASE + "/", wait_until="networkidle")
        lite.get_by_text(re.compile(r"^Showing \d+ of ")).wait_for()
        for i in (1, 2, 3):
            lite.locator("button[title=Compare]").nth(i).click()
        lite.locator("button", has_text=re.compile(r"Compare")).last.click()
        lite.locator("[role=dialog]").first.wait_for()
        shot(lite, "compare")
        lite.keyboard.press("Escape")
        lite.goto(BASE + "/", wait_until="networkidle")

        step("Build your pack")
        lite.get_by_text(re.compile(r"^Showing \d+ of ")).wait_for()
        button(lite, "Add pack").click()
        rows = lite.locator("[role=dialog] button").filter(has_text=re.compile(r"%"))
        for i in range(5):
            rows.nth(i).click()
        lite.wait_for_timeout(600)
        shot(lite, "pack")
        button(lite, "Done").click()

        step("A free strategy, sent by email")
        lite.goto(BASE + "/", wait_until="networkidle")
        lite.get_by_text("Free", exact=True).first.click()
        lite.wait_for_timeout(1200)
        button(lite, "Download").first.click()
        lite.locator("[role=dialog] input[type=email]").fill("visitor@example.com")
        button(lite, "Send me the link").click()
        lite.get_by_text("Check your inbox", exact=False).first.wait_for()
        shot(lite, "free")
        print("  " + emailed_link("visitor@example.com", r"/api/download/", time.time() - 30)[:60])

        step("Arabic, right to left, and Spanish")
        ar = new_page(browser, 1366, 900, lang="ar")
        ar.goto(BASE + "/", wait_until="networkidle")
        ar.wait_for_timeout(1500)
        shot(ar, "arabic", height=1100)
        es = new_page(browser, 1366, 900, lang="es")
        es.goto(f"{BASE}/s/{STRATEGY}", wait_until="networkidle")
        es.wait_for_timeout(1500)
        shot(es, "spanish", height=1100)

        step("A phone")
        phone = new_page(browser, 390, 844)
        phone.goto(BASE + "/", wait_until="networkidle")
        phone.get_by_text(re.compile(r"^Showing \d+ of ")).wait_for()
        shot(phone, "phone")
        phone.goto(f"{BASE}/s/{STRATEGY}/tree", wait_until="networkidle")
        phone.get_by_text("Tree output", exact=False).first.wait_for()
        phone.wait_for_timeout(1200)
        # what the phone shows once scrolled to the tree: a full-page shot would draw the fixed bottom bar mid-page
        phone.get_by_text("Tree output", exact=False).first.scroll_into_view_if_needed()
        phone.evaluate("window.scrollBy(0, -90)")
        phone.wait_for_timeout(600)
        phone.screenshot(path=str(OUT / "edgefolio_phone_tree.png"))
        print("  saved edgefolio_phone_tree.png")
        browser.close()

    print(f"console errors: {len(problems)}")
    for line in problems[:20]:
        print("  ", line[:200])
    return 1 if problems else 0


if __name__ == "__main__":
    sys.exit(main())
