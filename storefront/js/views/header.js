// Markup and styles ported one to one from docs/design/Storefront v7.dc.html (the v7 reference design).
import { html } from '../lib/html.js';
import { s, T } from '../lib/tpl.js';

export default function Header(v) {
  return html`
  <header style="position:sticky;top:0;z-index:20;background:#fff;border-bottom:1px solid #e2e9f0">
    <div style="max-width:1320px;margin:0 auto;padding:10px 28px;display:flex;flex-wrap:wrap;align-items:center;justify-content:space-between;gap:8px 16px">
      <a href="/" onClick=${v.goHome} style="display:flex;align-items:center;gap:12px;color:#16263a;text-decoration:none;min-width:0;cursor:pointer">
        <span translate=${false} style="font-weight:700;font-size:21px;letter-spacing:-.5px;line-height:1;flex-shrink:0">Edge<span style="color:#0950e3">folio</span></span>
        <span style="width:1px;height:20px;background:#e2e9f0;flex-shrink:0"></span>
        <span style="font-weight:500;font-size:13px;color:#5a6b80;white-space:nowrap;overflow:hidden;text-overflow:ellipsis">${v.tx?.toolName}</span>
        </a>
      <div style="display:flex;flex-wrap:wrap;align-items:center;justify-content:flex-end;gap:8px 10px;font-size:11px;margin-inline-start:auto">
        <div role="radiogroup" aria-label=${v.tx?.view} style="display:flex;background:#e9eef4;border-radius:12px;padding:3px;gap:2px">
          ${(v.modeTabs || []).map((md, $index) => html`<button role="radio" aria-checked=${md?.on} onClick=${md?.go} style="font-family:inherit;border:none;border-radius:10px;padding:8px 18px;font-size:14px;font-weight:700;cursor:pointer;display:inline-flex;align-items:center;gap:8px;white-space:nowrap;background:${s(md?.bg)};color:${s(md?.color)};box-shadow:${s(md?.shadow)}"><i class=${md?.icon}></i>${T(md?.label)}</button>`)}
          </div>
        <button class="sf-hover0" onClick=${v.goMine} style="font-family:inherit;border-radius:999px;padding:5px 11px;font-size:11px;font-weight:600;background:#fff;border:1px solid #e2e9f0;display:inline-flex;align-items:center;gap:7px;cursor:pointer;color:#16263a;white-space:nowrap"><i class="fa-regular fa-folder-open" style="color:#0950e3"></i>${T(v.tx?.myStrategies)}</button>
        <button class="sf-hover0" onClick=${v.openTour} title=${v.tx?.tourOpen} style="font-family:inherit;border-radius:999px;padding:5px 11px;font-size:11px;font-weight:600;background:#fff;border:1px solid #e2e9f0;display:inline-flex;align-items:center;gap:6px;cursor:pointer;color:#0950e3;white-space:nowrap"><span style="width:15px;height:15px;border-radius:50%;display:grid;place-items:center;background:#0950e3;color:#fff;font-size:10px;font-weight:700;line-height:1">?</span>${T(v.tx?.tourOpen)}</button>
        <button class="sf-hover0" onClick=${v.toggleTv} title=${v.tvTitle} style="font-family:inherit;border-radius:999px;padding:5px 11px;font-size:11px;font-weight:600;background:#fff;border:1px solid #e2e9f0;display:inline-flex;align-items:center;gap:7px;cursor:pointer;color:#16263a;white-space:nowrap">
          <img src="/assets/icons/TW_ICO.svg" alt="TradingView" style="width:15px;height:15px;display:block" />
          ${v.tv ? html`<span translate=${false}>TradingView</span><span style="width:7px;height:7px;border-radius:50%;background:#12b76a"></span><span style="color:#5a6b80;font-weight:500">${v.tx?.tvConnected}</span>` : null}
          ${v.tvOff ? html`<span style="color:#0950e3">${v.tx?.tvConnect}</span>` : null}
          </button>
        <button onClick=${v.toggleCur} title=${v.tx?.currencyLabel} style="font-family:inherit;border-radius:999px;padding:5px 11px;font-size:11px;font-weight:700;background:#fff;border:1px solid #e2e9f0;cursor:pointer;color:#16263a">${v.curLabel}</button>
        <div style="position:relative">${' '}
          <button onClick=${v.toggleLangMenu} aria-label=${v.tx?.language} aria-haspopup="true" style="font-family:inherit;border-radius:999px;padding:5px 11px;font-size:11px;font-weight:600;background:#fff;border:1px solid #e2e9f0;display:inline-flex;align-items:center;gap:6px;cursor:pointer;color:#16263a">
            <span aria-hidden="true">${v.langFlag}</span><span>${v.langName}</span><span style="font-size:10px;color:#8d9cae">▾</span>
            </button>${' '}
          ${v.langOpen ? html`
            <div style="position:absolute;inset-inline-end:0;top:calc(100% + 12px);width:210px;background:#fff;border:1px solid #e2e9f0;border-radius:14px;box-shadow:0 18px 48px rgba(26,35,56,.2);padding:8px;z-index:60">
              <div style="font-size:10px;font-weight:700;letter-spacing:.4px;text-transform:uppercase;color:#8d9cae;padding:4px 10px 8px">${v.tx?.language}</div>${' '}
              ${(v.languages || []).map((lg, $index) => html`
                <button class="sf-hover1" onClick=${lg?.go} lang=${lg?.code} style="display:flex;align-items:center;gap:10px;width:100%;border:none;cursor:pointer;font-family:inherit;padding:9px 12px;border-radius:9px;font-size:13.5px;text-align:start;background:${s(lg?.bg)};color:${s(lg?.color)};font-weight:${s(lg?.weight)}"><span aria-hidden="true">${lg?.flag}</span>${T(lg?.name)}</button>
                `)}${' '}
              </div>
            ` : null}${' '}
          </div>
        </div>
      </div>
    <div style="position:absolute;inset-inline:0;bottom:-1px;height:3px;background:linear-gradient(${s(v.g90)},#47f9e5,#0950e3)"></div>
    </header>
  ${v.anyMenu ? html`<div onClick=${v.closeMenus} style="position:fixed;inset:0;z-index:15"></div>` : null}
`;
}
