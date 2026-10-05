// Edgefolio storefront: the logic of the v7 design (class Component of Storefront v7.dc.html) on the
// real API. State, loading and actions live here; lib/vals.js turns the state into the values the
// views read. Nothing is computed here that the server owns: prices, totals and lists come from it.
import { Component } from '../vendor/preact.module.js';
import Storefront from './views/storefront.js';
import { api, post } from './lib/api.js';
import { read, write, readJSON, writeJSON } from './lib/saved.js';
import { parseLocation, pathOf } from './lib/route.js';
import { proQuery } from './lib/filters.js';
import { renderVals } from './lib/vals.js';
import { PRO_SIZE } from './lib/vals_shop.js';

const LANGS = ['es', 'en', 'pt', 'fr', 'de', 'zh', 'ar', 'hi'];
const LITE_SIZE = 24;
const PACK_FIND = 40;
const CART_KEY = 'edgefolio-cart-v1';
const FAVS_KEY = 'edgefolio-favs-v1';
const list = x => (Array.isArray(x) ? x.filter(v => typeof v === 'string') : []);

function startLang() {
  const saved = read('tuisku-sf-lang');
  if (LANGS.includes(saved)) return saved;
  const asked = (navigator.languages || [navigator.language || '']).map(l => String(l).slice(0, 2).toLowerCase());
  return asked.find(l => LANGS.includes(l)) || 'en';
}

export class App extends Component {
  constructor(props) {
    super(props);
    const route = parseLocation(location);
    const cart = readJSON(CART_KEY, {}), favs = readJSON(FAVS_KEY, {});
    const pview = read('tuisku-sf-pview5');
    this.rows = new Map(); // every strategy row the browser has seen, by id
    this.full = new Set(); // ids whose full record (indicator text, versions) is in this.rows
    this.asked = new Set();
    this.timers = {};
    this.seq = {};
    this.state = {
      dict: null, common: null, cfg: null, bundleDefs: null, fx: null,
      lang: startLang(), mode: read('tuisku-sf-mode') === 'pro' ? 'pro' : 'lite',
      pview: ['table', 'rows', 'cards'].includes(pview) ? pview : 'rows',
      ...route, vw: window.innerWidth,
      langOpen: false, addOpen: false, openPill: '', tv: read('edgefolio-tv') === '1', cur: 'local',
      q: '', liteTab: 'hot', lite: null, liteTotal: 0, litePage: 0, counts: {}, tape: [],
      freeOnly: false, sort: 'np', sel: {}, rg: {}, draft: {}, openSel: '', selQ: '', moreOpen: '',
      pro: [], proTotal: 0, proFirst: 1, proPage: 0, proLoaded: false, hist: {}, options: {}, ranges: null,
      expanded: '', tip: '',
      cart: list(cart.cart), bundles: list(cart.bundles), packIds: list(cart.packIds),
      code: cart.code || '', applied: cart.applied || '', codeState: '', codeOpen: !!cart.applied, quote: null,
      favs: list(favs.favs), alerts: favs.alerts && typeof favs.alerts === 'object' ? favs.alerts : {},
      compare: [], cmpOpen: false, packOpen: false, packQ: '', packFound: [],
      freeFor: '', freeEmail: '', freeNews: false, freeSent: false,
      me: null, mine: null, signEmail: '', signSent: false, signExpired: false,
      receipt: null, instStep: -1, instFor: '',
      tourStep: route.page === 'shop' && !read('edgefolio-tour-v1') ? 0 : -1,
      error: '', rowsV: 0, Tree: null, pine: {}
    };
  }

  // ---- lifecycle -------------------------------------------------------------------------------

  componentDidMount() {
    this.onResize = () => this.setState({ vw: window.innerWidth });
    this.onKeyDown = e => this.onKey(e);
    this.onPop = () => this.setState({ ...parseLocation(location), tip: '', langOpen: false });
    window.addEventListener('resize', this.onResize);
    window.addEventListener('keydown', this.onKeyDown);
    window.addEventListener('popstate', this.onPop);

    Promise.all([api('/i18n/storefront.ui.json'), api('/i18n/common.json')])
      .then(([dict, common]) => this.setState({ dict, common })).catch(e => this.fail(e));
    api('/api/config').then(cfg => this.setState({ cfg })).catch(e => this.fail(e));
    api('/api/bundles').then(bundleDefs => this.setState({ bundleDefs })).catch(e => this.fail(e));
    api('/api/fx').then(fx => this.setState({ fx })).catch(() => { /* prices then stay in USD */ });
    api('/api/strategies?paid=1&sort=npp&size=12').then(d => { this.keep(d.rows); this.setState({ tape: d.rows }); }).catch(e => this.fail(e));
    api('/api/me').then(me => { this.setState({ me }); if (me.email) this.afterSignIn(); }).catch(() => this.setState({ me: { email: null } }));

    const qs = new URLSearchParams(location.search);
    if (this.state.page === 'thanks') this.capture(qs.get('token'));
    if (qs.get('checkout') === 'cancel') history.replaceState(null, '', '/'); // back from PayPal: the cart is still here
    if (this.state.page === 'mine' && qs.get('signin') === 'expired') {
      this.setState({ signExpired: true });
      history.replaceState(null, '', '/mine');
    }
    this.sync(null);
  }

  componentWillUnmount() {
    window.removeEventListener('resize', this.onResize);
    window.removeEventListener('keydown', this.onKeyDown);
    window.removeEventListener('popstate', this.onPop);
    Object.values(this.timers).forEach(clearTimeout);
  }

  componentDidUpdate(prevProps, prevState) {
    this.sync(prevState);
  }

  // Brings the server's data in line with what the state shows: lists, missing rows, the quote.
  sync(prev) {
    const s = this.state;
    const changed = (...keys) => !prev || keys.some(k => prev[k] !== s[k]);
    if (changed('cart', 'bundles', 'packIds', 'code', 'applied')) {
      writeJSON(CART_KEY, { cart: s.cart, bundles: s.bundles, packIds: s.packIds, code: s.code, applied: s.applied });
    }
    if (!(s.me && s.me.email) && changed('favs', 'alerts')) writeJSON(FAVS_KEY, { favs: s.favs, alerts: s.alerts });
    if (changed('lang') && s.common) {
      document.documentElement.lang = s.lang;
      document.documentElement.dir = (s.common._rtl_languages || ['ar']).includes(s.lang) ? 'rtl' : 'ltr';
    }

    if (s.page === 'shop' && s.mode === 'pro') {
      const key = proQuery(s, s.ranges);
      if (key !== this.proKey) {
        const first = this.proKey == null;
        this.proKey = key;
        this.later('pro', () => this.loadPro(1, false), first ? 0 : 150);
      }
    } else if (s.page === 'shop') {
      const key = new URLSearchParams({ tab: s.liteTab, q: s.q.trim() }).toString();
      if (key !== this.liteKey) {
        const first = this.liteKey == null;
        this.liteKey = key;
        this.later('lite', () => this.loadLite(1), first ? 0 : 150);
      }
    }

    const bundleIds = s.bundleDefs ? s.bundleDefs.bundles.flatMap(b => b.ids) : [];
    this.fetchRows([...s.cart, ...s.packIds, ...s.compare, ...s.favs, ...bundleIds, s.freeFor, s.instFor]);
    if (s.page === 'detail' && s.detail) this.fetchFull(s.detail);
    const d = s.page === 'detail' ? this.rows.get(s.detail) : null;
    if (d && d.preview && s.pine[d.preview] === undefined && !this.asked.has(d.preview)) this.fetchPreview(d.preview);
    if (s.page === 'detail' && s.detTab === 'tree' && !s.Tree && !this.treeAsked) this.loadTree();

    const body = this.cartBody(), quoteKey = JSON.stringify(body);
    if (quoteKey !== this.quoteKey) {
      this.quoteKey = quoteKey;
      if (body.items.length || body.bundles.length || body.pack.length) this.later('quote', () => this.loadQuote(body, quoteKey), 120);
      else if (s.quote) this.setState({ quote: null });
    }

    if (s.me && s.me.email && s.page === 'mine' && !s.mine && !this.mineLoading) this.loadMine();
    if (s.packOpen && s.packQ.trim() !== this.packKey) {
      const first = this.packKey == null;
      this.packKey = s.packQ.trim();
      this.later('pack', () => this.loadPack(), first ? 0 : 150);
    }
  }

  later(name, fn, ms) {
    clearTimeout(this.timers[name]);
    this.timers[name] = setTimeout(fn, ms);
  }

  // A newer request of the same kind makes an older answer stale: only the last one is applied.
  ticket(name) {
    const n = (this.seq[name] || 0) + 1;
    this.seq[name] = n;
    return () => this.seq[name] === n;
  }

  fail(e) {
    this.setState({ error: (e && e.message) || String(e) });
  }

  // ---- rows ------------------------------------------------------------------------------------

  keep(rows, full) {
    (rows || []).forEach(r => {
      if (!r || !r.id) return;
      this.rows.set(r.id, { ...(this.rows.get(r.id) || {}), ...r });
      if (full) this.full.add(r.id);
    });
  }

  row(id) {
    return (id && this.rows.get(id)) || null;
  }

  fetchRows(ids) {
    ids.forEach(id => {
      if (!id || this.rows.has(id) || this.asked.has(id)) return;
      this.fetchOne(id);
    });
  }

  fetchFull(id) {
    if (this.full.has(id) || this.asked.has('full:' + id)) return;
    this.asked.add('full:' + id);
    this.fetchOne(id);
  }

  fetchOne(id) {
    this.asked.add(id);
    api('/api/strategies/' + encodeURIComponent(id)).then(r => {
      this.keep([r], true);
      this.setState(st => ({ rowsV: st.rowsV + 1 }));
    }).catch(e => {
      if (e.status !== 404) { this.fail(e); return; }
      // gone from the catalogue: drop it from what the browser remembers
      const drop = arr => arr.filter(x => x !== id);
      this.setState(st => ({ cart: drop(st.cart), packIds: drop(st.packIds), compare: drop(st.compare), favs: drop(st.favs),
        freeFor: st.freeFor === id ? '' : st.freeFor }));
      if (this.state.page === 'detail' && this.state.detail === id) {
        this.fail(e);
        this.go({ page: 'shop' }, { replace: true });
      }
    });
  }

  fetchPreview(url) {
    this.asked.add(url);
    fetch(url).then(r => (r.ok ? r.text() : '')).catch(() => '')
      .then(text => this.setState(st => ({ pine: { ...st.pine, [url]: text } })));
  }

  loadTree() {
    this.treeAsked = true;
    import('/js/tree.js').then(m => this.setState({ Tree: m.StrategyTree })).catch(e => this.fail(e));
  }

  // ---- lists -----------------------------------------------------------------------------------

  loadLite(page) {
    const fresh = this.ticket('lite');
    api('/api/strategies?' + this.liteKey + '&size=' + LITE_SIZE + '&page=' + page).then(d => {
      if (!fresh()) return;
      this.keep(d.rows);
      this.setState(st => ({ lite: page === 1 ? d.rows : [...(st.lite || []), ...d.rows], liteTotal: d.total, litePage: page, counts: d.counts || st.counts }));
    }).catch(e => this.fail(e));
  }

  // Table pages replace the list; "Load more" (rows, cards) appends the next page.
  loadPro(page, append) {
    const fresh = this.ticket('pro'), key = this.proKey, facets = this.facetsKey !== key;
    api('/api/strategies?' + key + '&size=' + PRO_SIZE + '&page=' + page + (facets ? '&facets=1' : '')).then(d => {
      if (!fresh()) return;
      this.keep(d.rows);
      const patch = { pro: append ? [...this.state.pro, ...d.rows] : d.rows, proTotal: d.total, proPage: page, proLoaded: true, counts: d.counts || this.state.counts };
      if (!append) patch.proFirst = page;
      if (d.hist) {
        this.facetsKey = key;
        Object.assign(patch, { hist: d.hist, options: d.options || {}, ranges: d.ranges || null });
      }
      this.setState(patch);
    }).catch(e => this.fail(e));
  }

  loadPack() {
    const fresh = this.ticket('pack'), q = this.packKey;
    api('/api/strategies?paid=1&sort=npp&size=' + PACK_FIND + (q ? '&q=' + encodeURIComponent(q) : '')).then(d => {
      if (!fresh()) return;
      this.keep(d.rows);
      this.setState({ packFound: d.rows });
    }).catch(e => this.fail(e));
  }

  // ---- cart and checkout -----------------------------------------------------------------------

  cartBody() {
    const s = this.state, size = s.bundleDefs ? s.bundleDefs.pack.size : 0;
    const custom = s.bundles.includes('custom') && s.packIds.length === size;
    return { items: s.cart, bundles: s.bundles.filter(b => b !== 'custom'), pack: custom ? s.packIds : [], code: s.applied };
  }

  loadQuote(body, key) {
    post('/api/quote', body).then(q => {
      if (this.quoteKey !== key) return;
      const patch = { quote: q };
      if (body.code && q.code_status === 'applied') patch.codeState = 'ok';
      if (body.code && q.code_status === 'invalid') Object.assign(patch, { codeState: 'bad', applied: '' });
      this.setState(patch);
    }).catch(e => {
      if (this.quoteKey !== key) return;
      // ids or bundles the server no longer sells (an old cart in this browser): take them out
      const gone = (e.detail && (e.detail.items || e.detail.bundles)) || [];
      if (e.status === 400 && gone.length) {
        this.setState(st => ({ cart: st.cart.filter(x => !gone.includes(x)), bundles: st.bundles.filter(x => !gone.includes(x)), packIds: st.packIds.filter(x => !gone.includes(x)) }));
      } else this.fail(e);
    });
  }

  applyCode() {
    const code = this.state.code.trim();
    this.setState({ applied: code, codeState: '' });
  }

  checkout() {
    const body = this.cartBody();
    if (!body.items.length && !body.bundles.length && !body.pack.length) return;
    post('/api/orders', body).then(o => window.location.assign(o.approve_url)).catch(e => this.fail(e));
  }

  // Back from PayPal at /thanks?token=<order>: capturing again is harmless (the server makes it idempotent).
  capture(token) {
    if (!token) { this.go({ page: 'shop' }, { replace: true }); return; }
    post('/api/orders/' + encodeURIComponent(token) + '/capture').then(rc => {
      this.keep(rc.downloads);
      const first = (rc.downloads || [])[0];
      this.setState({ receipt: rc, cart: [], bundles: [], packIds: [], instFor: first ? first.id : '', mine: null,
        instStep: read('edgefolio-install-v1') ? -1 : 0 });
    }).catch(e => { this.fail(e); this.go({ page: 'shop' }, { replace: true }); });
  }

  toggleCompare(id) {
    this.setState(st => ({ compare: st.compare.includes(id) ? st.compare.filter(x => x !== id) : st.compare.length >= 3 ? st.compare : [...st.compare, id] }));
  }

  // ---- accounts, My strategies, favourites -----------------------------------------------------

  signedIn() {
    return !!(this.state.me && this.state.me.email);
  }

  signIn() {
    const email = this.state.signEmail.trim();
    if (!/.+@.+\..+/.test(email)) return;
    post('/api/auth/login', { email, lang: this.state.lang }).then(() => this.setState({ signSent: true })).catch(e => this.fail(e));
  }

  signOut() {
    post('/api/auth/logout').then(() => this.setState({ me: { email: null }, mine: null, favs: [], alerts: {}, signSent: false, signEmail: '' }))
      .catch(e => this.fail(e));
  }

  // Favourites kept in this browser while signed out move to the account once signed in.
  afterSignIn() {
    const local = readJSON(FAVS_KEY, {}), favs = list(local.favs), alerts = local.alerts || {};
    Promise.all(favs.map(id => api('/api/favourites/' + encodeURIComponent(id), { method: 'PUT', body: { alerts: alerts[id] || {} } }).catch(() => null)))
      .then(() => { write(FAVS_KEY, null); this.loadMine(); });
  }

  loadMine() {
    this.mineLoading = true;
    api('/api/mine').then(m => {
      this.keep(m.items.map(x => x.row));
      this.keep(m.favourites.map(x => x.row));
      const alerts = {};
      m.favourites.forEach(x => { alerts[x.id] = x.alerts || {}; });
      this.setState({ mine: m, favs: m.favourites.map(x => x.id), alerts });
    }).catch(e => {
      if (e.status === 401) this.setState({ me: { email: null }, mine: null });
      else this.fail(e);
    }).then(() => { this.mineLoading = false; });
  }

  renew(id) {
    post('/api/mine/renew', { id }).then(entry => this.setState(st => ({
      mine: { ...st.mine, items: st.mine.items.map(x => (x.id === id ? entry : x)) }
    }))).catch(e => this.fail(e));
  }

  saveFav(id, alerts) {
    if (!this.signedIn()) return;
    const url = '/api/favourites/' + encodeURIComponent(id);
    (alerts ? api(url, { method: 'PUT', body: { alerts } }) : api(url, { method: 'DELETE' })).catch(e => this.fail(e));
  }

  toggleFav(id) {
    const on = this.state.favs.includes(id);
    this.setState(st => ({ favs: on ? st.favs.filter(x => x !== id) : [...st.favs, id] }));
    this.saveFav(id, on ? null : this.state.alerts[id] || {});
  }

  toggleAlert(id, k) {
    const cur = this.state.alerts[id] || {}, next = { ...cur, [k]: !cur[k] };
    this.setState(st => ({ alerts: { ...st.alerts, [id]: next } }));
    this.saveFav(id, next);
  }

  sendFree() {
    const s = this.state, email = s.freeEmail.trim();
    if (!/.+@.+\..+/.test(email) || this.freeBusy) return;
    this.freeBusy = true;
    post('/api/free', { id: s.freeFor, email, news: s.freeNews, lang: s.lang })
      .then(() => this.setState({ freeSent: true, mine: null }))
      .catch(e => this.fail(e))
      .then(() => { this.freeBusy = false; });
  }

  // ---- navigation and preferences --------------------------------------------------------------

  go(patch, { replace = false, scroll = true } = {}) {
    const path = pathOf({ ...this.state, ...patch });
    if (path !== location.pathname || location.search || location.hash) history[replace ? 'replaceState' : 'pushState'](null, '', path);
    this.setState({ ...patch, tip: '', langOpen: false });
    if (scroll) try { window.scrollTo(0, 0); } catch (e) { /* not scrollable */ }
  }

  setMode(mode) {
    write('tuisku-sf-mode', mode);
    this.setState({ mode });
    if (this.state.page !== 'shop') this.go({ page: 'shop' });
  }

  setPview(pview) {
    write('tuisku-sf-pview5', pview);
    this.setState({ pview });
  }

  setLang(lang) {
    write('tuisku-sf-lang', lang);
    this.setState({ lang, langOpen: false });
  }

  // There is no TradingView API to connect to: the chip opens TradingView and remembers the choice.
  toggleTv() {
    const on = !this.state.tv;
    if (on) window.open('https://www.tradingview.com/', '_blank', 'noopener');
    write('edgefolio-tv', on ? '1' : null);
    this.setState({ tv: on });
  }

  closeTour() {
    write('edgefolio-tour-v1', '1');
    this.setState({ tourStep: -1 });
  }

  closeInst() {
    write('edgefolio-install-v1', '1');
    this.setState({ instStep: -1 });
  }

  // Tour and tutorial: a tap moves on, a swipe moves either way (flipped in Arabic), keys too.
  swDown(e) { this.sw = { x: e.clientX, y: e.clientY }; }

  swUp(e, which) {
    const p = this.sw;
    this.sw = null;
    if (!p) return;
    const s = this.state, cur = s[which], max = which === 'instStep' ? 4 : 2;
    if (cur < 0) return;
    const dx = e.clientX - p.x, dy = e.clientY - p.y, rtl = s.lang === 'ar';
    let d = 0;
    if (Math.abs(dx) < 10 && Math.abs(dy) < 10) d = 1;
    else if (Math.abs(dx) > 40 && Math.abs(dx) > Math.abs(dy)) d = ((dx < 0) !== rtl) ? 1 : -1;
    const n = Math.min(max, Math.max(0, cur + d));
    if (n !== cur) this.setState({ [which]: n });
  }

  onKey(e) {
    const s = this.state, which = s.instStep >= 0 ? 'instStep' : s.tourStep >= 0 ? 'tourStep' : '';
    if (!which) return;
    if (e.key === 'Escape') { if (which === 'instStep') this.closeInst(); else this.closeTour(); return; }
    if (e.key !== 'ArrowRight' && e.key !== 'ArrowLeft') return;
    const max = which === 'instStep' ? 4 : 2, fwd = (e.key === 'ArrowRight') !== (s.lang === 'ar');
    const n = Math.min(max, Math.max(0, s[which] + (fwd ? 1 : -1)));
    if (n !== s[which]) { e.preventDefault(); this.setState({ [which]: n }); }
  }

  render() {
    const s = this.state;
    // no placeholder text: nothing shows until both dictionaries are in
    if (!s.dict || !s.common) return null;
    return Storefront(renderVals(this));
  }
}
