// Markup and styles ported one to one from docs/design/Storefront v7.dc.html (the v7 reference design).
import { html } from '../lib/html.js';
import Header from './header.js';
import Lite from './lite.js';
import Pro from './pro.js';
import Thanks from './thanks.js';
import Mine from './mine.js';
import Detail from './detail.js';
import Footer from './footer.js';
import Dialogs from './dialogs.js';
import PhoneBar from './phonebar.js';

export default function Storefront(v) {
  return html`<div lang=${v.lang} dir=${v.dir} data-screen-label="Edgefolio storefront" style="min-height:100vh;display:flex;flex-direction:column;background:#f4f8fb;font-family:Ubuntu,system-ui,'Segoe UI',Roboto,Arial,sans-serif;color:#16263a;font-size:14px;line-height:1.5">
    ${Header(v)}
    ${Lite(v)}
    ${Pro(v)}
    ${Thanks(v)}
    ${Mine(v)}
    ${Detail(v)}
    ${Footer(v)}
    ${Dialogs(v)}
    ${PhoneBar(v)}
  </div>`;
}
