# Cambios · exportación del diseño del 2026-10-06 (la segunda)

Lo que trajo la exportación `edgefolio-design-2026-10-06` (Claude Design) y lo que hizo la tienda con
ello, cambio por cambio y marcado **herramienta** o **núcleo**. Lo que es del núcleo va al final, en
«Para el núcleo».

## La exportación

- **El zip:** `edgefolio-design-2026-10-06.zip`, aquí al lado, tal como llegó (sha256
  `5d6c94c345fd76f7bba37277666a5371ab050853b05a873ead2aca7792a536d6`, 85 ficheros).
- **Sobre:** `_ztool_dev` en `c0f85b99`, con zlecitool-core 0.23.0.
- **Cómo entró:** `python tools/design_update.py <zip> --apply`. La mezcla a tres dejó 10 conflictos en
  cinco vistas (`lite`, `pro`, `detail`, `dialogs`, `mine`) y 2 en notas (`docs/IMPLEMENTATION-v7.md`,
  `docs/design/PR_DESCRIPTION.md`); el texto nuevo `viewTableTab` entró limpio. El diseño trae un
  elemento nuevo de primer nivel, `cmpFloat` (la píldora de Comparar), que `tools/dc2htm.py` reparte ahora
  a `dialogs`. `support.js` carga React, ReactDOM, Babel y Font Awesome de `vendor/`: se guardan en
  `docs/design/vendor/` y la maqueta abre sin internet.
- **Cada conflicto** se resolvió quedándose con lo que la tienda adaptó (las rutas de verdad, la barra
  del núcleo, el «Pagar» ocupado, los enlaces contados, `dir="auto"`) y tomando el cambio del diseño.
- **Lo que no se usa del zip** (`versions/`, `offline/`, `prototype/brand/`, `docs/img/`, `texts.json`,
  `MANIFEST.md`) se queda dentro del zip archivado.
- **Ojo:** el `prototype/` del zip trae entera una vista previa gratis (NVDA 1Day 1S00, 253 líneas); la
  tienda las corta todas en `static/`. Una prueba (`tests/test_site.py`) comprueba que ningún script de
  pago está entero en un zip archivado. El repositorio es privado.

## Lo que cambió, pantalla por pantalla

Estado: **hecho** (se construyó ahora), **ya estaba** (la tienda ya lo hacía) o **no se hace** (y por qué).
Todo es de la herramienta salvo que se diga.

| # | Cambio del diseño | Estado | Dónde |
|---|---|---|---|
| 1 | Insignia «Nuevo» (`tabNew`) en las fichas de Lite publicadas en los últimos 30 días | hecho | `is_new` del servidor (el mismo `NEW_DAYS` que la pestaña); `vals.js` `isNew`; `lite.js`. El catálogo de hoy no tiene ninguna de los últimos 30 días |
| 1 | Añadir un lote o el pack quita los otros lotes que comparten estrategia | ya estaba | `vals_cart.js` `addBundle`; el servidor rechaza un carrito con una estrategia dos veces (`errBundleOverlap`) |
| 1 | La píldora Comparar va encima del carrito flotante, no lo tapa | hecho | `lite.js` (el «dock»), `vals_pages.js` `cmpFloat`, `dockBottom` |
| 1 | Esc cierra el selector del pack y Comparar | hecho | `app.js` `onKey`: una capa por pulsación (Comparar, pack, gratis, desplegable de Pro) |
| 2 | Fichas de Pro: «CLAVE · indicador» abre la página del indicador en TradingView | hecho | las filas de `/api/strategies` llevan `ind_url` e `ind_text` (`catalogue.row`); al pasar por encima, su explicación |
| 2 | Esc cierra los desplegables de los filtros | hecho | `app.js` `onKey` (el menú de idioma es del núcleo y ya se cerraba) |
| 2 | La vista Tabla usa la clave nueva `viewTableTab` | hecho | `vals.js`, `vals_shop.js`; `pviewTable` se quita de `i18n/ui.json` |
| 3 | «Actualización disponible» sólo para quien tiene la v1 | hecho | `vals_pages.js` `detOwnOld` (de `/api/mine`: `update`); Mis estrategias se lee en silencio en la ficha. Para pagos y gratis: el diseño mira sólo los pagos |
| 3 | La dirección sigue a la página: Atrás, Adelante y recargar; un id que no existe lleva a la tienda | ya estaba | rutas de verdad `/s/<id>` y `/s/<id>/tree` (`route.js`), con un aviso «no encontramos esa estrategia» |
| 4 | «Comprar para desbloquear» sólo añade; en una gratis, abre el diálogo de la gratis | ya estaba | `vals_pages.js` `treeBuy` |
| 4 | La dirección mantiene `/tree` y Atrás vuelve a la ficha | ya estaba | — |
| 4 | El árbol incrustado no carga sus letras ni sus iconos | ya estaba | la tienda carga `tree.js` como módulo, con la página |
| 5 | «Vaciar el carrito» quita también los lotes y el pack | ya estaba | `vals_cart.js` `emptyCart` |
| 5 | El subtotal tachado sólo con descuento, en Lite y en Pro | hecho | ya con tramos y códigos de porcentaje; ahora también con un código de precio fijo (`total < subtotal`) |
| 5 | Pro: «Pagas X US$ con PayPal» bajo el total en moneda local | hecho | `pro.js` (Lite ya lo tenía) |
| 5 | Lite: el código dice «Código de descuento aplicado» o «Código no válido» | hecho | `lite.js`; y aplicar otra vez el mismo código ya no borra el mensaje (`app.applyCode`); vacío quita el código |
| 6 | Correo vacío o mal escrito: `errEmailRequired` / `errEmailInvalid` del núcleo bajo el campo, borde rojo | hecho | `dialogs.js`, `vals_pages.js` `freeErr*`, `app.sendFree`; el rechazo del servidor a la dirección va también ahí |
| 6 | Intro envía, Esc cierra | hecho | Intro ya estaba (ahora no mientras se compone en zh/hi); Esc nuevo |
| 6 | Pedir otra vez la misma gratis reinicia su enlace en Mis estrategias | ya estaba | `free.claim` da un enlace nuevo; Mis estrategias enseña el último |
| 7 | Gracias: sin cambios | — | — |
| 8 | «Conseguir un enlace nuevo» conserva la fecha, el pedido y la versión | en parte | fecha y pedido, sí; **versión, no**: hay un solo script por estrategia, así que el enlace nuevo da la versión de hoy (pregunta abierta de STATUS: ¿la actualización se paga?) |
| 8 | Cada fila: `.zip` y «Ficha técnica ↗» / «Cómo decide ↗» | hecho | `mine.js` (los `.pine` y `.zip` son los enlaces contados de la tienda) |
| 9 | Móvil: el carrito flotante y la píldora, 76 px arriba, sobre la barra de abajo | hecho | el carrito ya estaba; la píldora va ahora dentro del dock |
| 9 | «Buscar» enfoca el buscador de la tienda | ya estaba | ahora con el atributo del diseño, `data-search` |
| 9 | «Carrito» abre la tienda con el carrito a la vista | hecho | en Lite ya no salta al final de la lista; desde otra página, la tienda arriba |
| — | Imágenes y textos como recursos (`window.__resources`) | no se hace | es para empaquetar la maqueta; la tienda la sirve Flask |

**Además, de paso** (de comparar `FLUJO_USUARIO.md` con la tienda):

- Los avisos (errores, novedades) se ponen encima del carrito flotante midiendo su alto, no con 84 px fijos
  (tapaban «Pagar» en el móvil).
- «Mis estrategias» sin sesión va a `/mine`, y el núcleo vuelve ahí después de entrar (antes volvía a la
  página de la que se venía).
- La casilla de novedades del diálogo gratis y el interruptor «Sólo GRATIS» de Pro son botones: Tab y
  Espacio llegan a ellos (`USER-FLOW-v7.md` §15).
- Abrir otra vez la página de gracias de un pedido da el enlace más nuevo de cada estrategia, no el que
  caducó (`orders.issue_links`).

## Lo que la tienda hace distinto, a propósito

Se queda como está; el diseño no lo enseña o lo simula:

- **Direcciones de verdad** (`/`, `/s/<id>`, `/s/<id>/tree`, `/thanks`, `/mine`) en vez de `#s=<id>`;
  los enlaces `#s=` de antes siguen abriendo.
- **La carcasa del núcleo:** la barra (con la palabra Edgefolio), el menú de idioma, la cuenta («Entrar»)
  y el pie. La barra ocupa cuatro filas a 390 px, en la tienda y en la maqueta.
- **PayPal de verdad**, con «Pagar» ocupado mientras se crea el pedido; el recibo por correo.
- **Los enlaces de descarga** caducan y se cuentan; en la página de gracias sólo los ve el navegador que
  pagó o la cuenta dueña; los demás van a Mis estrategias.
- **«¿Compraste sin cuenta?»** en Mis estrategias (demostrar un correo); Mis estrategias pide cuenta.
- **El contacto** sólo si `CONTACT_EMAIL` está puesto; las cifras de la fila de confianza, las del servidor.
- **Los precios, los lotes, el pack y los tramos** los pone el servidor; ningún código llega a la página
  (`DEMO20` es una maqueta).
- **El paginador** de Pro funciona; «Ver más» sólo mientras queda algo; el selector del pack busca.
- **Las cifras de ejemplo** del diseño («Desde su publicación», «2.834», la v2, los cambios de moneda)
  son las de verdad o «—» mientras no hay cálculo diario.
- **Toda vista previa pública va cortada**, también las gratis (STATUS y FLUJO dicen lo contrario de la
  tienda: la maqueta, al cortarla, coincide con ella).
- **El recorrido de bienvenida y el tutorial de instalación** son de la tienda, una vez por navegador (el
  del núcleo sólo sale con sesión; ver «Para el núcleo»).
- **`dir="auto"`** en los nombres latinos, para el árabe; los deslizadores del árbol se quedan de izquierda
  a derecha.
- **El carrito** se guarda en este navegador (`edgefolio-cart-v1`).
- **Esc** no cierra el menú de idioma desde la tienda: es del núcleo, y lo cierra él.

## Correcciones a la exportación

- El repositorio es `Leci37/tuisku_strategy_store` (antes `tuisku_Web_selling`, el nombre que traen
  README, STATUS, MANIFEST, FLUJO e IMPLEMENTATION).
- La tienda corta todas las vistas previas públicas, también las gratis (fila 3 de STATUS, «Facts» del
  README y FLUJO §3).
- El recorrido de bienvenida no es del núcleo en esta tienda (README, «core vs tool»): `tool.json` no
  tiene `"tour"`, porque el del núcleo no sale sin sesión.
- Los tramos de descuento están en `edgefolio/settings.py` y se sirven en `/api/config`, no en
  `api/settings.py`.
- `storefront/assets/icons/a_logo_tuisku_azulLetras.png` sale en MANIFEST, pero ninguna pantalla lo usa.
- La v2 «sin fecha» sobre la v1 fechada necesita fechas por versión, que el generador no da todavía.

## Las preguntas abiertas de STATUS.md

| # | Pregunta | Lo que hace la tienda hoy |
|---|---|---|
| 1 | Cortes de la nota (A ≥ 300, B ≥ 100, C ≥ 30) | Esos, sobre el número de operaciones; por acordar |
| 2 | ¿Los tramos se suman al precio de un lote? | Sí: tramo y código (con el tope `MAX_DISCOUNT`) también sobre lotes y pack; un código de precio fijo, no |
| 3 | Un lote nuevo sustituye a otro que comparte estrategia | Sí, en la página; el servidor rechaza (nunca elige) un carrito con una estrategia dos veces |
| 4 | ¿Qué hace «Conectar TradingView»? | Abre tradingview.com en otra pestaña y lo recuerda; no hay API a la que conectarse |
| 5 | `tour1Pro` dice «y 15 más» y son 16 | Igual que el diseño; por decidir el texto (y «2.834» va escrito en él) |
| 6 | La nota se explica al pasar el ratón | Igual (`title`); en el móvil no se ve |
| 7 | ¿Comparar y Favorita en Filas y Fichas de Pro? | Igual que el diseño: sólo en la Tabla |
| 8 | La ficha no tiene resumen del carrito | Igual; en el móvil la barra de abajo cuenta lo que hay |
| 9 | Pro enseña «Pagar» con el carrito vacío | Igual; no hace nada |
| 10 | Los tramos en USD y los totales en moneda local | Igual; se paga en USD («Pagas X US$ con PayPal») |
| 11 | Revisión nativa de zh, ar e hi | Pendiente |

Y la de la pantalla 8: **¿«Conseguir la actualización» se paga?** Hoy no hay versiones más allá de la v1;
renovar un enlace da la versión de hoy. Si se paga, hace falta un script por versión y un pedido.

## Para el núcleo

Nada de esto se parchea en la tienda; si se quiere, entra en una versión del núcleo:

1. **Un tutorial de bienvenida sin cuenta**, en una herramienta pública: hoy `tour.context()` no da nada
   sin sesión y el chip «Ver tutorial» la pide. Haría falta que saliera una vez por navegador (por
   herramienta y versión), que pasara a la cuenta al entrar, y el chip sin sesión. Con eso y lo de abajo,
   la tienda dejaría su recorrido propio.
2. **Pasos del tutorial que la página elige e ilustra:** un texto según una variante
   (`zt.openTour({variant})`, p. ej. Lite o Pro) y un paso con sólo una imagen fija o con un dibujo HTML
   de la herramienta.
3. **Más de un tutorial por herramienta**, abierto por la página en su momento (p. ej. `"tours":
   {"welcome", "install"}` y `zt.openTour(nombre, {step, once})`), con puntos que se pueden pulsar y un
   evento al cerrar con el paso.
4. **Prioridad baja:** un evento cancelable en el enlace de la marca de la barra (p. ej. `zt:home`), para
   que una herramienta con rutas en el navegador vuelva a su portada sin recargar y sin perder lo que
   tiene en memoria (la lista de Comparar, los filtros).
5. **Documentar dos ganchos que la tienda usa sin contrato:** el alto de la barra fija (la tienda lee
   `header.app-topbar` para dejar un elemento justo debajo; serviría una variable `--zt-topbar-height` o
   un `scroll-padding-top` del núcleo) y un sitio para la barra fija de abajo de una herramienta (la
   tienda pone `body.app-shell{padding-bottom:64px}`; `app-shell` no está en CONTRATO.md).
6. **Para las pruebas:** `zlecitool_core.testing` podría dar un servidor en marcha de la app y una página
   de Playwright sobre el Chromium del núcleo (saltando sin Chromium), para que una herramienta pruebe su
   página en un navegador con `pytest` sin montarlo ella. Hoy la tienda lo hace en `tools/screenshots.py`.

## Pruebas

- `pytest`: 220 pruebas en verde (antes 210). Nuevas: `tests/test_page_code.py` (sin marcas de conflicto;
  cada valor, campo y texto que leen las vistas lo da `static/js`; los textos en los 8 idiomas con las
  mismas variables y sin claves del núcleo; los ganchos `data-search`, `data-sf-cart`, `data-sf-bundles`),
  el enlace del indicador en las filas (`test_search.py`), el enlace nuevo en una página de gracias
  reabierta (`test_mine.py`), ningún script de pago entero en un zip archivado (`test_site.py`).
- `tools/screenshots.py`, el recorrido en un navegador, comprueba cada cambio de esta exportación.
