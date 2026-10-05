// Markup and styles ported one to one from docs/design/Storefront v7.dc.html (the v7 reference design).
import { html } from '../lib/html.js';


export default function Footer(v) {
  return html`
  <footer style="border-top:1px solid #e2e9f0;margin-top:36px;background:#fff">
    <div style="max-width:1320px;margin:0 auto;padding:16px 28px;display:flex;justify-content:space-between;align-items:center;gap:12px;flex-wrap:wrap;font-size:12.5px;color:#5a6b80">
      <nav style="display:flex;gap:16px;flex-wrap:wrap"><a style="color:#5a6b80">${v.tx?.legalPrivacy}</a><a style="color:#5a6b80">${v.tx?.legalCookies}</a><a style="color:#5a6b80">${v.tx?.legalTerms}</a><a style="color:#5a6b80">${v.tx?.legalNotice}</a><a style="color:#5a6b80">${v.tx?.contactMenu}</a></nav>
      <div style="display:flex;flex-direction:column;line-height:1.35;text-align:end"><strong translate=${false} style="color:#16263a;font-weight:700">Edge<span style="color:#0950e3">folio</span></strong><span style="font-size:11.5px">${v.tx?.toolName}</span></div>
      </div>
    </footer>
`;
}
