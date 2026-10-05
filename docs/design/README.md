# Edgefolio v7: the reference design

The design the storefront follows, as it was handed over: a working mock-up of every screen with 8
sample strategies. It is a reference, not production code, and the server never serves it.

| File | What |
|---|---|
| `Storefront v7.dc.html` | the whole store: Lite, Pro, strategy page, thank-you page, My strategies, dialogs |
| `Strategy Tree.dc.html` | the "How it decides" view, embedded in the strategy page |
| `support.js` | the runtime the two files need to open (it loads React and Babel from unpkg) |
| `i18n/`, `trees/`, `zlecitool_core/` | the texts, tree data and fonts the mock-up loads |
| `HANDOFF.md`, `PR_DESCRIPTION.md` | the designer's notes; the full spec is `../IMPLEMENTATION-v7.md` |

To open it:

```bash
python docs/design/serve.py
# open http://localhost:8765/Storefront%20v7.dc.html
```

The script serves the charts, icons, previews and fonts the mock-up asks for from the repository's
`storefront/`, so they are not copied here. The texts in `i18n/` and `trees/` are the handoff's copies,
frozen: the storefront's own files have grown since (new texts for the parts the mock-up did not have).

## How the real storefront follows it

The views in `storefront/js/views/` are this mock-up's templates, converted one to one into
[htm](https://github.com/developit/htm) templates for Preact: the same elements and the same inline
styles. With the mock-up's own data they render the same pixels (checked screen by screen at 1366,
768 and 390 px). What changed is where the data comes from: `storefront/js/app.js` is the mock-up's
logic with the sample rows, prices and purchases replaced by the shop's API.

When the design changes, change the view and the logic the same way here and in the mock-up, so the
two keep matching.
