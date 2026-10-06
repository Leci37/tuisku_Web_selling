# Edgefolio · TradingView strategy shop

The shop behind tuisku.eu, sold as **Edgefolio**: a catalogue of **2,834 TradingView strategies**
(Pine Script v5) with their backtests. Visitors browse them in a simple **Lite** view or filter them in
**Pro**, see how each strategy decides, buy with PayPal and download the script. A small server prices
every cart, takes the payment, and hands out the paid files only through signed, expiring links.

<p align="center">
  <img src="docs/img/edgefolio_lite.png" alt="Lite: the ticker strip, the search, the tabs, the overfitting warning, three bundles and Build your pack, and the strategy cards with their profit curves, grade and price" width="900">
</p>

<table>
<tr>
<td width="50%"><img src="docs/img/edgefolio_pro.png" alt="Pro: the discount ladder with the cart, the filter panel with histograms over every slider, and the list of strategies"></td>
<td width="50%"><img src="docs/img/edgefolio_strategy.png" alt="Strategy page: charts, the 14 backtest results, the indicator, and the first lines of the Pine script"></td>
</tr>
<tr>
<td><sub><b>Pro.</b> 21 filters, each slider with its histogram, filtered and counted on the server.</sub></td>
<td><sub><b>Strategy page</b> (<code>/s/&lt;id&gt;</code>): charts, results, the script's first lines and what you buy.</sub></td>
</tr>
<tr>
<td><img src="docs/img/edgefolio_tree.png" alt="How it decides: the strategy's first decision tree drawn box by box, with the indicator values as sliders"></td>
<td><img src="docs/img/edgefolio_thanks.png" alt="Thank-you page: the order, one row per strategy with .pine and .zip downloads, and the five install steps"></td>
</tr>
<tr>
<td><sub><b>How it decides</b> (<code>/s/&lt;id&gt;/tree</code>): the free part of the tree, read from the public preview.</sub></td>
<td><sub><b>After paying:</b> the downloads, then a tutorial to add the script to TradingView.</sub></td>
</tr>
<tr>
<td><img src="docs/img/edgefolio_mine.png" alt="My strategies: every purchase and free download with how long its link lasts, and favourites with alerts"></td>
<td align="center"><img src="docs/img/edgefolio_phone.png" alt="The shop on a phone, with the bottom bar" width="260"></td>
</tr>
<tr>
<td><sub><b>My strategies</b> (<code>/mine</code>): sign in with an emailed link; new links when one expires.</sub></td>
<td><sub>Every page works from 390 px up, in 8 languages, Arabic right to left.</sub></td>
</tr>
</table>

### The shop working

<table>
<tr>
<td width="50%"><img src="docs/img/edgefolio_pro_filters.png" alt="Pro with two symbols and a win rate of 90% or more: 14 strategies, the chips above the list and the histogram of the win rate"></td>
<td width="50%"><img src="docs/img/edgefolio_table.png" alt="The same filters in the Table view, sortable, with the grade next to each ticker"></td>
</tr>
<tr>
<td><sub><b>Filtering.</b> Apple and NVIDIA, win rate ≥ 90 %: the count, the chips, the histograms and the list come from the server.</sub></td>
<td><sub>The same result as a sortable table.</sub></td>
</tr>
<tr>
<td><img src="docs/img/edgefolio_install.png" alt="Right after paying: the install tutorial, step 1 of 5, over the thank-you page"></td>
<td><img src="docs/img/edgefolio_tour.png" alt="The welcome tour, step 1 of 3, on the first visit"></td>
</tr>
<tr>
<td><sub><b>After paying</b> (fake PayPal): the 5-step tutorial to add the script to TradingView opens once.</sub></td>
<td><sub><b>First visit:</b> the 3-step welcome tour.</sub></td>
</tr>
<tr>
<td><img src="docs/img/edgefolio_compare.png" alt="Three strategies compared side by side, the best value of each row marked in green"></td>
<td><img src="docs/img/edgefolio_pack.png" alt="Build your pack: five strategies picked from the searchable list"></td>
</tr>
<tr>
<td><sub><b>Compare</b> up to 3 strategies; the best value of each row in green.</sub></td>
<td><sub><b>Build your pack:</b> 5 strategies for one price, searchable among all 2,834.</sub></td>
</tr>
<tr>
<td><img src="docs/img/edgefolio_free.png" alt="A free strategy: the email was sent, check your inbox"></td>
<td><img src="docs/img/edgefolio_arabic.png" alt="The shop in Arabic, laid out right to left"></td>
</tr>
<tr>
<td><sub><b>Free strategies</b> are sent by email (news is a separate box, unticked).</sub></td>
<td><sub><b>Arabic</b>, right to left, prices shown in riyals and charged in dollars.</sub></td>
</tr>
<tr>
<td><img src="docs/img/edgefolio_spanish.png" alt="The strategy page in Spanish, prices in euros"></td>
<td align="center"><img src="docs/img/edgefolio_phone_tree.png" alt="How it decides on a phone: the tree output and the bottom bar" width="260"></td>
</tr>
<tr>
<td><sub><b>Spanish</b> strategy page, prices in euros; 8 languages in all.</sub></td>
<td><sub><b>How it decides</b> on a phone.</sub></td>
</tr>
</table>

<sub>All screenshots come from `tools/screenshots.py`, which walks the shop in a real browser against a
local server in test mode: a cart with a code, filters, a purchase and a real download, the emailed
sign-in, compare, the pack, a free download, three languages and a phone. It fails at the first step
that does not work, and on any console error.</sub>

## Run it locally

Python 3.11 or newer.

```bash
pip install -r api/requirements.txt
PAYPAL_MODE=fake DISCOUNT_CODES=demo20=0.20 uvicorn --factory api.app:create_app --port 8000
# open http://localhost:8000
```

That is all the shop needs to run: the catalogue, the charts and the page are in the repository, and
the database (`private/shop.db`, SQLite) is created on the first start.

- **Payments.** With `PAYPAL_MODE=fake` there is no PayPal: Checkout goes straight to the thank-you
  page as if the buyer had paid, so the whole flow works offline.
- **Emails.** With `MAIL_MODE=console` (the default) nothing is sent: every email is kept in the
  database. `python tools/outbox.py` prints the last ones, with their links; that is how you sign in
  to *My strategies* on a local run.
- **Downloads** need the paid scripts in `private/strategies/` (see [Private storage](#private-storage)).
  Without them everything else works and a download answers 404.

Tests and the browser walk:

```bash
pip install -r requirements-dev.txt && pytest          # no network, PayPal and email faked
pip install playwright && python tools/screenshots.py  # with the server above running; Chromium needed
```

## What is on the page

| | Where | What it does |
|---|---|---|
| **Lite** (default) | `/` | Ticker strip, search, tabs (Hot, Win rate, Stocks, Crypto, New, Free), the overfitting warning, three bundles and *Build your pack* (5 strategies for one price), cards with grade A–D, favourite and compare, a floating cart with the discount code. |
| **Pro** | `/` + the Lite \| Pro switch | The discount ladder, the filter panel (16 sliders with histograms and typed min / max, 5 multi-selects, Only FREE), chips, Rows / Cards / Table, 25 per page. |
| **Under Checkout** | Lite and Pro | The trust row: PayPal (the shop never sees the card), how long the links last and how many downloads (from `DOWNLOAD_DAYS` and `MAX_DOWNLOADS`), the receipt by email, and `CONTACT_EMAIL`. |
| **Strategy page** | `/s/<id>` | Both TradingView charts, the 14 results, backtest against results since release, versions, the indicator, the first lines of the script, the formats you get. |
| **How it decides** | `/s/<id>/tree` | The first decision tree of the strategy, from its public preview: values as sliders, the path to the result, every rule in plain words. Owners see the complete tree. |
| **Thank-you page** | `/thanks` | The order, `.pine` and `.zip` per strategy, *Download all*, and the 5-step install tutorial. The receipt goes to the PayPal payer's email, in the page's language: every line with what it cost, the total, and the links to My strategies. |
| **My strategies** | `/mine` | Everything bought or downloaded with how long its link lasts, *Get a new link*, favourites with alert opt-ins. Sign-in by emailed link, no password. |
| **Free download** | a dialog | Free strategies are sent by email; news is a separate box, unticked, confirmed by email. |

Other things the page remembers in the browser: Lite or Pro, the language, the view, the cart (it
survives the trip to PayPal), the welcome tour and the install tutorial (each shown once).
The 8 languages are the ones of zlecitool-core (es en pt fr de zh ar hi); prices can be shown in the
local currency ("≈ €72"), and PayPal always charges USD.

## How a purchase works

```
browser                                  server (api/)                         PayPal
  │ POST /api/quote {items, bundles,      prices from catalogue.csv and
  │       pack, code} ───────────────────▶ bundles.json, tiers + code, ≤ 70%
  │ ◀─────────────── total, discount ──────
  │ POST /api/orders (same body) ─────────▶ same price ─────────────────────▶ create order
  │ ◀──────────────────────── approve link ───────────────────────────────────┘
  │ the buyer pays on PayPal, PayPal sends them back to /thanks?token=<order>
  │ POST /api/orders/{id}/capture ────────▶ capture ─────────────────────────▶ money moves
  │                                          amount = order total? ◀─────────┘
  │ ◀──────── receipt + one link per file (only to the browser that ordered)
  │                                          receipt by email to the payer
  │ GET /api/download/{token}[?format=zip] ▶ file from private storage
```

The browser only ever sends strategy ids, bundle names and the code the buyer typed. It holds no
price it can change, no discount code, and no path to a paid file. A strategy is never charged twice:
items inside a chosen bundle or the pack are dropped, and two bundles that share a strategy are refused.

## Server API

| | |
|---|---|
| `GET /api/strategies` | the catalogue, filtered, sorted and paged on the server. `q`, `tab` (`hot`, `win`, `stocks`, `crypto`, `new`, `free`), `free=1`, `paid=1`, `sort` (`np`, `npp`, `win`, `price`, `trades`, `avg`, `months`, `hot`), `page`, `size` (≤ 100), ranges as `<key>_min` / `<key>_max` (an absent end is open), multi-selects as repeated `sym`, `tf`, `ind`, `idx`, `rel`. `facets=1` adds every histogram and option count, each counted against all the other filters. `hot` is net profit % with the tickers taken in turns, so one ticker's variants do not fill the page. |
| `GET /api/strategies/{id}` | one strategy with the indicator's description and its versions |
| `GET /api/bundles` | the bundles and the pack: contents and prices |
| `POST /api/quote`, `POST /api/orders` | the price of a cart; create the PayPal order (`approve_url`) |
| `POST /api/orders/{id}/capture` | take the payment, check the amount, issue the links |
| `GET /api/download/{token}` | the `.pine`; `?format=zip` adds the rules in Markdown and beta Python and JavaScript; `/api/download/all?t=…` zips several |
| `POST /api/free` | a free strategy, sent by email |
| `POST /api/auth/login`, `/peek`, `/verify`, `/logout`, `GET /api/me` | sign-in by emailed link, in two steps so a mail scanner cannot use the link up |
| `GET /api/mine`, `POST /api/mine/renew`, `GET /api/mine/{id}/script` | My strategies, a new link, the full script for its owner (the tree's owner view) |
| `PUT` / `DELETE /api/favourites/{id}` | favourites and their alert opt-ins |
| `GET /api/config`, `GET /api/fx` | tiers, pack, links for the page (never a code); exchange rates |
| `GET /thumbs/{chart}.webp` | 640 px WebP of a chart for the lists, made on first request and cached |

## Configuration

All from environment variables (`api/settings.py`):

| Variable | Default | |
|---|---|---|
| `PUBLIC_URL` | | the shop's address, e.g. `https://edgefolio.tuisku.eu`. **Required** with real PayPal or real email: every link in an email and PayPal's return link are built from it, never from the request |
| `PAYPAL_MODE` | `fake` | `fake`, `sandbox` or `live` |
| `PAYPAL_CLIENT_ID`, `PAYPAL_CLIENT_SECRET` | | from a REST app in the PayPal developer dashboard; required outside `fake` |
| `MAIL_MODE` | `console` | `console` keeps every email in the database; `smtp` sends them |
| `SMTP_HOST`, `SMTP_PORT`, `SMTP_USER`, `SMTP_PASSWORD`, `SMTP_STARTTLS` | `587`, STARTTLS on | for `MAIL_MODE=smtp` |
| `MAIL_FROM` | `Edgefolio <sales@tuisku.eu>` | sender |
| `CONTACT_EMAIL` | `sales@tuisku.eu` | shown on the page for problems |
| `LEGAL_BASE_URL` | `https://tuisku.eu` | the footer's legal pages (`/legal/privacidad`, `/legal/cookies`, `/legal/terminos`, `/legal/aviso-legal`, as in zlecitool-core) |
| `STRATEGIES_DIR` | `private/strategies` | the paid `.pine` files |
| `DATABASE` | `private/shop.db` | the SQLite file (see [Database](#database)) |
| `THUMBS_DIR` | `cache/thumbs` | the WebP thumbnails, made on demand |
| `DISCOUNT_CODES` | none | `code=rate` pairs, e.g. `spring20=0.20,partner40=0.40` |
| `FLAT_PRICE_CODES` | none | `code=price` pairs that set every loose item to one price |
| `MAX_DISCOUNT` | `0.70` | cap on order-size tier + code together |
| `PACK_SIZE`, `PACK_PRICE` | `5`, `249` | *Build your pack* |
| `DOWNLOAD_DAYS`, `MAX_DOWNLOADS` | `7`, `10` | life of a download link |
| `NEW_DAYS` | `30` | how long a strategy is in the *New* tab |
| `SESSION_DAYS`, `LOGIN_MINUTES` | `30`, `15` | how long a sign-in lasts; how long an emailed sign-in link works |

Order-size discounts (over $160: 15%, $290: 20%, $500: 25%, $1,000: 40%, $2,500: 70%) are in
`api/settings.py`; the page draws its ladder from `/api/config`, so the two cannot disagree.

Files the server reads from `catalogue/`: `catalogue.csv` (strategies and prices), `indicators.csv`
(what each indicator is), `bundles.json` (bundles: ids and price), `fx.json` (exchange rates, refreshed
by `python tools/update_fx.py` from the ECB; the shipped file holds example rates) and, when it exists,
`since_release.csv` (`id`, `pct`, `as_of`: each strategy's result since its release; until a job writes
it, the page shows "—").

## Database

One SQLite file (`DATABASE`), created and migrated by `api/store.py` on start: an older file gets the
new columns in place, nothing to run by hand. Back it up with the rest of `private/`.

| Table | What it keeps |
|---|---|
| `orders` | one row per PayPal order: the strategy keys, the code, the total, the status (`CREATED`, `PAID`, `FAILED`), the payer, the buyer's email, the page's language (for the receipt), what was charged line by line, and a hash of the buying browser's cookie |
| `downloads` | one link per strategy of a paid order: token, expiry, download count, version |
| `free_claims` | free strategies sent by email: the address, the link, when the visitor asked for it |
| `subscribers` | news opt-ins: only addresses that ticked the box and confirmed it from the email |
| `login_tokens` | emailed sign-in links (SHA-256 of the token only), single use, 15 minutes |
| `sessions` | signed-in browsers (SHA-256 of the cookie only) |
| `favourites` | favourites per email, with the alert opt-ins (new version, price drop, in a bundle) and the language of their emails |
| `alert_state` | what each strategy looked like at the last alert run (version, price, bundles), so a change is emailed once |
| `outbox` | every email the shop wrote, with its status (`console`, `sent`, `failed`) |

To look inside: `sqlite3 private/shop.db '.tables'`, or `python tools/outbox.py` for the emails.

## Private storage

The paid scripts are **not in this repository**. The server reads them from `STRATEGIES_DIR`, with the
names the strategy factory gives them (its `pine_TW_b/` folder), so that folder can be copied there as
it is. They are still in the repository's history, from where you can restore them for a local run:

```bash
mkdir -p private/strategies && git archive c3fa796 d_result/pine_TW_b | tar -x -C private/strategies --strip-components=2
```

Because they stay in the history, anyone can still fetch them. To close that for good, publish this
branch as a new repository (or rewrite the history) before selling again.

The public previews (`storefront/assets/previews/`) are cut 50 lines into the first tree; the tests
check every one of them.

## Publishing a new catalogue

The strategy factory (the private `ML-Sklearn-strategy-stock-crypto-for-TraderView` repository)
writes a tab-separated export with the TradingView backtest of each strategy. To publish it:

```bash
python catalogue/publish.py path/to/pine_TW_img_info_6_WEB.csv --assets path/to/factory/d_result --prune
```

It keeps one row per strategy, makes every image path relative, drops the location of the paid file,
gives exchange-coded names a readable one, copies the charts and previews the rows use (and with
`--prune` deletes the ones no row uses), and cuts every preview to its public part. Then copy the new
paid scripts to `STRATEGIES_DIR`, check `catalogue/bundles.json` still names existing strategies, and
run the tests. `docs/catalogue-updates.md` describes a monthly full refresh and the daily light one.

## Layout

```
storefront/   the page, served as it is (no build step)
  index.html    the shell; js/main.js mounts the app
  js/app.js     state and actions; js/lib/ builds what the views show from the API's data
  js/views/     the screens, ported one to one from the reference design (htm templates for Preact)
  js/tree.js    "How it decides"
  i18n/         texts in 8 languages (storefront.ui.json) + the shared ones from zlecitool-core
  css/, fonts/, vendor/ (Preact, htm, Font Awesome), trees/ (indicator names and texts)
  assets/       charts (5,668), previews (2,834), icons
api/          FastAPI: search, pricing, orders + capture + PayPal, downloads + formats, accounts,
              free downloads, My strategies, mail, thumbnails, SQLite
catalogue/    catalogue.csv, indicators.csv, bundles.json, fx.json; publish.py and previews.py
tests/        prices, bundles, filters, payments, links, accounts, formats, what must stay private
tools/        screenshots.py (the walk in a browser), send_alerts.py, update_fx.py, outbox.py,
              sync_core_i18n.py
docs/         IMPLEMENTATION-v7.md (the design spec), catalogue-updates.md, design/ (the reference
              design: python docs/design/serve.py opens it), img/, notes/
```

## Deploying

One process serves everything:

```bash
PUBLIC_URL=https://shop.example PAYPAL_MODE=sandbox PAYPAL_CLIENT_ID=… PAYPAL_CLIENT_SECRET=… \
MAIL_MODE=smtp SMTP_HOST=… SMTP_USER=… SMTP_PASSWORD=… \
uvicorn --factory api.app:create_app --host 0.0.0.0 --port 8000 --proxy-headers --forwarded-allow-ips='*'
```

behind HTTPS (any host that runs Python: a small VPS, Render, Railway, Fly.io), with `private/` on a
disk that is not served and kept between deploys. `--proxy-headers` lets the server see the visitor's
address (for the per-address limits on sign-in and free downloads) and https behind the proxy. Try
`PAYPAL_MODE=sandbox` with sandbox credentials first; with `live`, the first real purchase is the test.

Two daily jobs, with the same environment as the server (cron, or the host's scheduler):

```bash
python tools/send_alerts.py   # favourites' alerts: one email per person for a new version, a price drop
                              # or a new bundle since the previous run (the first run only records)
python tools/update_fx.py     # exchange rates from the ECB for the local-currency prices
```

## Before selling again

The strategies were generated on 2024-10-18 and carry a "recommended expiry" of 2025-06-18. A review of
the generator found that about a third of the strategies compute their indicators differently in
TradingView than in the Python that trained them, and that the Ichimoku family used future prices in
training. Regenerate the catalogue with those fixed before relaunching.

Also not built yet, because they need data or jobs the shop does not have: the daily job that measures
each strategy since its release (`since_release.csv`), versions and update notices beyond v1 (the page and
the alert emails show them once the catalogue has a `version` column above 1), and descriptions for the
indicator values the tree view does not know yet (`storefront/trees/features.json` covers the most common
ones).

## What changed in the Edgefolio redesign

- The page is the v7 design: Lite and Pro, the strategy page with *How it decides*, bundles and the
  pack, the thank-you page with the install tutorial, My strategies, 8 languages. The old page (jQuery,
  simpleCart, the CSV loaded and filtered in the browser) is gone.
- Filtering, sorting, paging and the histograms run on the server; the browser no longer downloads
  the whole catalogue.
- New on the server: accounts by emailed link, free downloads for an email with recorded consent,
  renewable links, favourites, the receipt by email on payment, the zip with the rules in Markdown,
  Python and JavaScript, WebP thumbnails, exchange rates, and PayPal's redirect flow (the Checkout
  button of the design).
- The 79 free strategies' public previews were their whole script; they are now cut like the paid ones.

The previous redesign (server-side prices and discounts, links per paid order, scripts out of the
repository) is described in the history of this file.
