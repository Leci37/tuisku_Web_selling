// Mounts the storefront into #app, inside the .sc-host wrapper the design's runtime used.
import { h, render } from '../vendor/preact.module.js';
import { App } from './app.js';

render(h('div', { class: 'sc-host' }, h(App, {})), document.getElementById('app'));
