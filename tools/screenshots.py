"""Buy three strategies in a real browser and save the README screenshots to docs/img/.

    PAYPAL_MODE=fake DISCOUNT_CODES=demo20=0.20 uvicorn --factory api.app:create_app --port 8000
    pip install playwright && python tools/screenshots.py

catalogue -> add 3 strategies -> apply a code (priced by the server) -> pay (fake mode) ->
thank-you page -> download one paid file through its link. It doubles as the end-to-end check:
it fails if any step does. CHROMIUM_PATH picks a browser binary; HTTPS_PROXY is passed on.
"""
import os
import sys
from pathlib import Path

from playwright.sync_api import sync_playwright

BASE = os.environ.get("SHOP_URL", "http://localhost:8000")
OUT = Path(sys.argv[1]) if len(sys.argv) > 1 else Path(__file__).resolve().parent.parent / "docs" / "img"
OUT.mkdir(parents=True, exist_ok=True)
console = []

with sync_playwright() as p:
    launch = {}
    if os.environ.get("CHROMIUM_PATH"):
        launch["executable_path"] = os.environ["CHROMIUM_PATH"]
    if os.environ.get("HTTPS_PROXY"):  # the page loads jQuery and PapaParse from CDNs
        launch["proxy"] = {"server": os.environ["HTTPS_PROXY"], "bypass": "localhost,127.0.0.1"}
    browser = p.chromium.launch(**launch)
    page = browser.new_page(viewport={"width": 1920, "height": 1000}, accept_downloads=True)
    page.on("console", lambda m: console.append(f"{m.type}: {m.text}") if m.type in ("error", "warning") else None)
    page.on("pageerror", lambda e: console.append(f"pageerror: {e}"))
    # keep the walkthrough out of the site's Google Analytics
    page.route("**/*googletagmanager.com/**", lambda r: r.abort())
    page.route("**/*google-analytics.com/**", lambda r: r.abort())

    page.goto(BASE + "/", wait_until="networkidle")
    page.wait_for_selector("#dataTable tbody tr", timeout=60000)
    page.wait_for_timeout(1500)
    rows = page.locator("#dataTable tbody tr:visible")
    print("visible rows:", rows.count(), "| visible counter:", page.locator("#visibleRowCount").inner_text())
    page.screenshot(path=str(OUT / "shop_catalogue.png"))

    added = 0
    for i in range(rows.count()):
        link = rows.nth(i).locator("td.shop-cell a.item_add").first
        if link.count() and link.is_visible():
            link.click()
            added += 1
            page.wait_for_timeout(300)
        if added == 3:
            break
    page.wait_for_timeout(800)
    print("added:", added, "| total before code:", page.locator("#server-total").inner_text())

    page.fill("#discount-code", "demo20")
    page.click("#apply-discount")
    page.wait_for_timeout(800)
    print("after code:", page.locator("#server-total").inner_text(), "|", page.locator("#discount-message").inner_text(),
          "| discount", page.locator("#discount-percentage").inner_text(), "%")
    cart = page.locator("#paypal-button-container")
    cart.scroll_into_view_if_needed()
    page.screenshot(path=str(OUT / "shop_cart.png"))

    page.click("#test-pay")
    page.wait_for_url("**/thankyou.html", timeout=15000)
    page.wait_for_selector("#cart-items td.download-cell")
    page.wait_for_timeout(800)
    page.screenshot(path=str(OUT / "shop_thankyou.png"), full_page=True)
    print("thank-you rows:", page.locator("#cart-items tr").count(), "| order:", page.locator("#order-id").inner_text(),
          "| paid:", page.locator("#paid-total").inner_text())

    with page.expect_download() as dl:
        page.locator("#cart-items td.download-cell").first.click()
    d = dl.value
    path = OUT / d.suggested_filename
    d.save_as(path)
    print("downloaded:", d.suggested_filename, path.stat().st_size, "bytes; first line:", path.read_text().splitlines()[0][:70])
    path.unlink()
    browser.close()

print("console problems:", len(console))
for c in console[:15]:
    print("  ", c[:200])
