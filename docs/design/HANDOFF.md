# Handoff: Edgefolio storefront (v7)

## Prompt for Claude Code

> Read `design_handoff_edgefolio_storefront/README.md` and `docs/IMPLEMENTATION-v7.md`. In `Leci37/tuisku_Web_selling`, create branch `design/edgefolio-v7` from `zlecitool_main`. Implement the steps in `PR_DESCRIPTION.md` in order, one commit each, keeping `pytest` green. Copy `docs/` into the repo's `docs/` and `prototype/*.dc.html` into `docs/design/`. Then open a pull request to `zlecitool_main` with `PR_DESCRIPTION.md` as its description.

## Overview

A redesign of the strategy shop in `Leci37/tuisku_Web_selling` (branch `zlecitool_main`, folders `storefront/` and `api/`), sold as **Edgefolio**. It covers:
- **Lite** (default) and **Pro** modes;
- the strategy page, with a decision-tree view ("How it decides");
- the cart with the discount ladder and PayPal;
- the free download for an email;
- the thank-you page with the install tutorial;
- **My strategies**.

The shell, languages and tour come from `Leci37/zlecitool-core` (branch `develop`).

## About the design files

The files in `prototype/` are **design references built in HTML**. They show the intended look and behaviour; they are not production code. Recreate them in the shop's own stack (static HTML and JS in `storefront/`, the Python API in `api/`), following its existing patterns. Don't serve the `.dc.html` files.

**To view them,** run a local server in `prototype/` (`python -m http.server`) and open `Storefront v7.dc.html`. The page loads JSON, fonts and images by relative path, and Font Awesome 6 from cdnjs.

## Fidelity

**High fidelity:** the colours, type, spacing and interactions are final. The data is a sample of 8 strategies (see "Sample data").

## Where the detailed specs are

- `docs/IMPLEMENTATION-v7.md`:
  - §0 brand rules, §1 shell, §2 Lite, §3 Pro, §4 strategy page, §5 flows;
  - §6 server work, §7 translations, §8 acceptance checklist;
  - §9 decision tree (with compact sizes), §10 script preview and formats, §11 install tutorial, §12 filters.
- `docs/catalogue-updates.md`: refreshing the catalogue, monthly in full and daily for light changes.
- `PR_DESCRIPTION.md`: the PR to open, with the steps.

## Screens

| Screen | Where in the mock | Purpose |
|---|---|---|
| Lite | default `page: shop`, `mode: lite` | Tabs (Hot, Win rate, Stocks, Crypto, Free, New), search, cards with Add to cart, bundles and the custom pack, overfitting box, floating cart |
| Pro | Lite \| Pro switch | Discount ladder strip, left filter panel, chips, Rows / Cards / Table views, compare |
| Strategy page | `#s=<id>` (real route `/s/<id>`) | Overview: charts, 14 results, grade, versions, script preview, formats. "How it decides" tab: `#s=<id>/tree` |
| Thank you | after Pay | Order, downloads (.pine, .zip, Fact sheet, How it decides), install tutorial |
| My strategies | top bar | Purchases, update notices, favourites and alerts |

## Filters (Pro)

21 filters, plus Only FREE and search. The full table and rules are in `docs/IMPLEMENTATION-v7.md` §12. In short:
- **16 range sliders.** Each has a histogram, a log or linear track, and typed min / max boxes that apply on Enter or blur. A handle at the end of its track means no limit on that side.
- **5 multi-selects:** Symbol, Time frame, Indicators, Index and Release date. Each has search, Select all / Deselect all, and a count per option. Options inside one filter combine with OR; filters combine with AND.
- **Everything updates together:** the count, the chips (with × and Clear all), the list and the pager (25 per page).
- **On the server:** filter, sort and page there with `GET /api/strategies`, which returns `total`, `rows`, the histogram bins and the option counts.

## Interactions and state

- **Remembered in localStorage:**
  - `tuisku-sf-mode`: Lite or Pro;
  - `edgefolio-tour-v1`: the welcome tour, shown once;
  - `edgefolio-install-v1`: the install tutorial, shown once.
- **Discount tiers** (as in `api/settings.py`): $160 → 15 %, $290 → 20 %, $500 → 25 %, $1,000 → 40 %, $2,500 → 70 %, plus a code (`demo20` = 20 % in the mock). Every price comes from the server.
- **Front-end state:**
  - **shop:** `mode`, `lang`, `cur` (USD / local), `cart`, `bundles`, `packIds`, `code`;
  - **filters:** `rg` (per slider, `[lo, hi]` as 0–1 positions on the track), `sel` (per multi-select, the ticked values; absent means all), `freeOnly`, `q`;
  - **view:** `sort`, `view` (rows / cards / table), `page` (shop / detail / thanks / mine), `detail`, `detTab`;
  - **account:** `favs`, `alerts`, `compare`, `purchased`.

## Design tokens

- **Text:** ink `#16263a`, secondary `#5a6b80`, tertiary `#8d9cae`.
- **Surfaces:** page `#f4f8fb`, surface `#ffffff`, border `#e2e9f0`, control border `#cfd8e3`, segmented track `#e9eef4`, tree canvas `#fbfcfe`.
- **Primary:** `#0950e3`, with the selected fill `#f5f8ff`, the chip fill `#e9f0fd` and the hover border `#9fb8ef`.
- **Gradients:**
  - CTA: `linear-gradient(135deg,#0950e3,#0e7c98)`;
  - brand line and slider fill: `linear-gradient(90deg,#47f9e5,#0950e3)`.
- **Signals:**
  - Buy: `#15803d` on `#e8f7ef`, border `#b7e4c7`;
  - Sell: `#c0392b` on `#fdecea`, border `#f3c1bb`;
  - Wait: `#5a6b80` on `#f4f8fb`, border `#cfd8e3`.
- **Notes:**
  - warning: `#fff7ec`, border `#f6d9ae`, icon `#f79009`;
  - info: `#eef3fd`, border `#d6e2fb`.
- **Type:** Ubuntu 400 / 500 / 700. Sizes 40 (Lite title), 26 (counts), 22 (section titles), 18, 16, 14 (body), 13, 12.5, 12, 11.5, 11, 10.5.
- **Radii:** 18 (panels and cards), 16, 14, 12, 10, 8, and 999 for pills.
- **Shadows:**
  - card hover: `0 12px 32px rgba(22,38,58,.10)`;
  - dropdown: `0 18px 48px rgba(26,35,56,.2)`;
  - dialog: `0 30px 80px` at a similar opacity.

## Assets

All the assets come from the repos:
- `storefront/assets/charts/*_candel.png` and `*_profit.png`: the strategies' TradingView screenshots;
- `storefront/assets/icons/`: ticker icons, the TradingView icon and the PayPal logo;
- `storefront/assets/previews/*.pine`: the free preview scripts;
- the Ubuntu fonts: `zlecitool-core`.

The icons in the mock are Font Awesome 6.

## Sample data (not real)

- **The Pro list:** 8 sample strategies. The count, pager and histograms are computed from them.
- **Example values:**
  - profit factor, max loss $ and %, avg profit % and avg bars for AMZN 1T00, ADBE 1T00, AAPL 1C00 and NVDA 1M00;
  - precision and tree depth for all 8.
- **Computed values:** activity is trades ÷ months, and candles are months × 21 (stocks) or × 30.4 (crypto).
- **Also examples:** the since-release results, the A–D grade cut-offs, the exchange rates and the $249 pack price.

## Files

- `prototype/Storefront v7.dc.html`: the whole store, all screens.
- `prototype/Strategy Tree.dc.html`: the decision-tree view, embedded in the strategy page.
- `prototype/support.js`: the runtime the two files need to open.
- `prototype/i18n/storefront.ui.json` and `prototype/zlecitool_core/i18n/common.json`: UI texts in 8 languages.
- `prototype/trees/`: indicator names and descriptions, tree texts and the preview list.
- `prototype/storefront/assets/`: charts, icons and previews.
- `docs/IMPLEMENTATION-v7.md` and `docs/catalogue-updates.md`.
- `PR_DESCRIPTION.md`.
