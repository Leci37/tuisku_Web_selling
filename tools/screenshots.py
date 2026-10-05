"""Walk the shop in a real browser and save the README screenshots to docs/img/.

    DATABASE=/tmp/shop.db PAYPAL_MODE=fake DISCOUNT_CODES=demo20=0.20 \\
        uvicorn --factory api.app:create_app --port 8000          # in one terminal
    pip install playwright && DATABASE=/tmp/shop.db python tools/screenshots.py

Lite → three strategies and a discount code in the cart → Pro → a strategy page and How it decides →
Checkout (fake PayPal) → thank-you page → download one paid file → sign in to My strategies with the
emailed link (read from the outbox in DATABASE, so it must be the server's) → the shop on a phone.
It doubles as the end-to-end check: it stops at the first step that fails, and reports the browser's
console errors. Downloads need the paid scripts in STRATEGIES_DIR (README: Private storage).

SHOP_URL (default http://localhost:8000), CHROMIUM_PATH (a browser binary) and OUT (default docs/img).
"""
import os
import re
import sqlite3
import sys
import time
from pathlib import Path

from playwright.sync_api import sync_playwright

ROOT = Path(__file__).resolve().parent.parent
BASE = os.environ.get("SHOP_URL", "http://localhost:8000").rstrip("/")
OUT = Path(os.environ.get("OUT") or ROOT / "docs" / "img")
DATABASE = Path(os.environ.get("DATABASE") or ROOT / "private" / "shop.db")
BUYER = "buyer@example.com"            # the payer the fake PayPal reports
STRATEGY = "AAPL_1Day_2CT0_8a979adf"   # shown on the strategy page and in the tree
problems = []


def step(name):
    print(f"· {name}", flush=True)


def shot(page, name, height=None, full=False):
    """Load the lazy images first, then save the top `height` px (or the whole page)."""
    # from the top: the bar is sticky, and a full-page shot taken scrolled down draws it mid-page
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


def sign_in_link(after: float) -> str:
    """The newest sign-in link the server wrote to BUYER's outbox after `after`."""
    for _ in range(40):
        with sqlite3.connect(f"file:{DATABASE}?mode=ro", uri=True) as con:
            row = con.execute("SELECT body FROM outbox WHERE to_addr=? AND created>=? ORDER BY id DESC LIMIT 1",
                              (BUYER, after)).fetchone()
        if row:
            m = re.search(r"https?://\S+/mine\?signin=\S+", row[0])
            if m:
                return m.group(0)
        time.sleep(0.25)
    raise SystemExit(f"no sign-in email for {BUYER} in {DATABASE}: is it the server's DATABASE?")


def button(page, text):
    """A button by its visible text: the icon fonts' glyphs end up in the accessible name, so
    get_by_role(name=..., exact=True) would not match."""
    return page.locator("button", has_text=re.compile(r"^\s*" + re.escape(text) + r"\s*$"))


def new_page(browser, width, height):
    ctx = browser.new_context(viewport={"width": width, "height": height}, accept_downloads=True)
    # once per browser in real life; here every context is fresh, so say both were seen
    ctx.add_init_script("try { localStorage.setItem('edgefolio-tour-v1', '1'); localStorage.setItem('tuisku-sf-lang', 'en'); } catch (e) {}")
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
        page.keyboard.press("Escape")               # the install tutorial opens the first time
        shot(page, "thanks", height=1000)

        step("Download one paid file")
        with page.expect_download() as dl:
            page.get_by_role("link", name=".pine").first.click()
        d = dl.value
        first = Path(d.path()).read_text(errors="replace").splitlines()[0][:60]
        print(f"  {d.suggested_filename}: {first}")

        step("Sign in to My strategies with the emailed link")
        page.goto(BASE + "/mine", wait_until="networkidle")
        asked = time.time() - 1
        page.locator("input[type=email]").fill(BUYER)
        button(page, "Send me the link").click()
        page.goto(sign_in_link(asked), wait_until="networkidle")
        page.get_by_role("button", name=re.compile(re.escape(BUYER))).click()
        page.get_by_text(f"Signed in as {BUYER}").first.wait_for()
        shot(page, "mine", height=900)

        step("A phone")
        phone = new_page(browser, 390, 844)
        phone.goto(BASE + "/", wait_until="networkidle")
        phone.get_by_text(re.compile(r"^Showing \d+ of ")).wait_for()
        shot(phone, "phone")
        browser.close()

    print(f"console errors: {len(problems)}")
    for line in problems[:20]:
        print("  ", line[:200])
    return 1 if problems else 0


if __name__ == "__main__":
    sys.exit(main())
