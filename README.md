# Edgefolio (`edgefolio`) · la tienda de estrategias de TradingView

La tienda de tuisku.eu, que se vende como **Edgefolio**: un catálogo de **2.834 estrategias de
TradingView** (Pine Script v5) con su backtest. Se miran en una vista sencilla, **Lite**, o se filtran en
**Pro**; se ve cómo decide cada una; se compran con PayPal y se descarga el script. El servidor pone el
precio de cada carrito, cobra, y sólo entrega los scripts de pago por enlaces firmados que caducan.

Es una **herramienta zlecitool**: una app Flask sobre [zlecitool-core](https://github.com/Leci37/zlecitool-core),
como `cv_lin` o `md_pdf`. La barra (con la palabra Edgefolio), el idioma, las cuentas, la seguridad, el
correo, el pie y las páginas legales son del núcleo; aquí sólo está la tienda. Es pública, sin
publicidad, y **vende con PayPal, no con créditos**.

<p align="center">
  <img src="docs/img/edgefolio_lite.png" alt="Lite: la cinta de tickers, la búsqueda, las pestañas, el aviso de sobreajuste, tres lotes y Crea tu pack, y las fichas con su curva, su nota y su precio" width="900">
</p>

<table>
<tr>
<td width="50%"><img src="docs/img/edgefolio_pro.png" alt="Pro: la escalera de descuentos con el carrito, el panel de filtros con un histograma en cada deslizador y la lista"></td>
<td width="50%"><img src="docs/img/edgefolio_strategy.png" alt="La página de una estrategia: los gráficos, los 14 resultados del backtest, el indicador y las primeras líneas del script"></td>
</tr>
<tr>
<td><sub><b>Pro.</b> 21 filtros, cada deslizador con su histograma, filtrados y contados en el servidor.</sub></td>
<td><sub><b>La página de una estrategia</b> (<code>/s/&lt;id&gt;</code>): gráficos, resultados, el principio del script y lo que se compra.</sub></td>
</tr>
<tr>
<td><img src="docs/img/edgefolio_tree.png" alt="Cómo decide: el primer árbol de decisión de la estrategia, caja a caja, con los valores de los indicadores como deslizadores"></td>
<td><img src="docs/img/edgefolio_thanks.png" alt="La página de gracias: el pedido, una fila por estrategia con su .pine y su .zip, y los cinco pasos para instalarla"></td>
</tr>
<tr>
<td><sub><b>Cómo decide</b> (<code>/s/&lt;id&gt;/tree</code>): la parte gratis del árbol, leída de la vista previa pública.</sub></td>
<td><sub><b>Después de pagar:</b> las descargas y el tutorial para ponerla en TradingView.</sub></td>
</tr>
<tr>
<td><img src="docs/img/edgefolio_mine.png" alt="Mis estrategias: cada compra con lo que dura su enlace, la tarjeta para confirmar un correo y las favoritas"></td>
<td align="center"><img src="docs/img/edgefolio_phone.png" alt="La tienda en un móvil, con la barra de abajo" width="260"></td>
</tr>
<tr>
<td><sub><b>Mis estrategias</b> (<code>/mine</code>, con la cuenta del núcleo): lo comprado con la sesión abierta y lo comprado sin cuenta con un correo que la cuenta ha confirmado.</sub></td>
<td><sub>Cada página funciona desde 390 px, en 8 idiomas, el árabe de derecha a izquierda.</sub></td>
</tr>
</table>

### La tienda funcionando

<table>
<tr>
<td width="50%"><img src="docs/img/edgefolio_pro_filters.png" alt="Pro con dos símbolos y un porcentaje de aciertos del 90 % o más"></td>
<td width="50%"><img src="docs/img/edgefolio_table.png" alt="Los mismos filtros en la vista de tabla"></td>
</tr>
<tr>
<td><sub><b>Filtrar.</b> Apple y NVIDIA, aciertos ≥ 90 %: el recuento, las etiquetas, los histogramas y la lista salen del servidor.</sub></td>
<td><sub>El mismo resultado, en una tabla que se ordena.</sub></td>
</tr>
<tr>
<td><img src="docs/img/edgefolio_install.png" alt="Justo después de pagar: el tutorial de instalación, paso 1 de 5"></td>
<td><img src="docs/img/edgefolio_tour.png" alt="El recorrido de bienvenida, paso 1 de 3, la primera vez"></td>
</tr>
<tr>
<td><sub><b>Después de pagar</b> (PayPal de prueba): el tutorial de 5 pasos para ponerla en TradingView, una vez.</sub></td>
<td><sub><b>La primera visita:</b> el recorrido de bienvenida, de 3 pasos.</sub></td>
</tr>
<tr>
<td><img src="docs/img/edgefolio_compare.png" alt="Tres estrategias comparadas, con lo mejor de cada fila en verde"></td>
<td><img src="docs/img/edgefolio_pack.png" alt="Crea tu pack: cinco estrategias elegidas de la lista"></td>
</tr>
<tr>
<td><sub><b>Comparar</b> hasta 3; lo mejor de cada fila, en verde.</sub></td>
<td><sub><b>Crea tu pack:</b> 5 estrategias por un precio, buscadas entre las 2.834.</sub></td>
</tr>
<tr>
<td><img src="docs/img/edgefolio_free.png" alt="Una estrategia gratis: el correo ha salido"></td>
<td><img src="docs/img/edgefolio_arabic.png" alt="La tienda en árabe, de derecha a izquierda"></td>
</tr>
<tr>
<td><sub><b>Las gratis</b> se mandan por correo (las novedades, en una casilla aparte y sin marcar).</sub></td>
<td><sub><b>En árabe</b>, de derecha a izquierda, con los precios en riales y el cobro en dólares.</sub></td>
</tr>
<tr>
<td><img src="docs/img/edgefolio_spanish.png" alt="La página de una estrategia en español, con los precios en euros"></td>
<td align="center"><img src="docs/img/edgefolio_phone_tree.png" alt="Cómo decide en un móvil" width="260"></td>
</tr>
<tr>
<td><sub><b>En español</b>, con los precios en euros; 8 idiomas en total, los del menú del núcleo.</sub></td>
<td><sub><b>Cómo decide</b>, en un móvil.</sub></td>
</tr>
</table>

<sub>Las capturas son de `tools/screenshots.py`, que recorre la tienda en un navegador de verdad contra el
servidor local en modo de prueba: un carrito con un código, los filtros, una compra sin cuenta y una
descarga de verdad, el alta en el núcleo y la confirmación del correo con el que se pagó, comparar, el
pack, una gratis, tres idiomas y un móvil. Para en el primer paso que no funciona, y con cualquier error
de la consola (también de la CSP).</sub>

## Arrancar

### Con el lanzador de la familia

`arrancar.ps1` es el lanzador de todas las herramientas: **no está en ningún repo**, va en la carpeta
que los tiene todos al lado (`zlecitool-core`, `linkedin-to-chatgpt-cv`, `tuisku_Web_selling`…). Desde
esa carpeta:

```
pwsh ./arrancar.ps1          # en Windows: powershell -ExecutionPolicy Bypass -File arrancar.ps1
```

Clona o pone al día cada repo, monta **un solo entorno** de Python en el que el
`requirements-dev.txt` de cada herramienta instala el núcleo desde `../zlecitool-core`, escribe **el
mismo `.env`** en todas (el mismo `FLASK_SECRET_KEY`, `ZLECITOOL_DATA_DIR`, `DATABASE_URL`,
`ZLECITOOL_INSECURE_COOKIES=1`, `ZLECITOOL_ADMINS`; a la tienda, además, `PAYPAL_MODE=fake` y
`DISCOUNT_CODES=demo20=0.20`), copia la primera vez los scripts de pago
(`flask --app app edgefolio restore-scripts`) y arranca cada una con `python app.py` en su puerto. **La
tienda queda en http://localhost:5105**. Una sola cuenta vale para todas (en `localhost`, no en
`127.0.0.1`).

### A mano

```
git clone https://github.com/Leci37/tuisku_Web_selling     # al lado de zlecitool-core
cd tuisku_Web_selling
python -m venv .venv && . .venv/bin/activate              # Python 3.10 o más (3.11 recomendado)
pip install -r requirements-dev.txt                       # el núcleo, editable, desde ../zlecitool-core
cp .env.example .env                                      # y un FLASK_SECRET_KEY dentro (48 caracteres)
flask --app app edgefolio restore-scripts                 # los scripts de pago, a <datos>/edgefolio/strategies
python app.py                                             # http://localhost:5105
```

`.env.example` trae `PAYPAL_MODE=fake` y `DISCOUNT_CODES=demo20=0.20`: sin PayPal, «Pagar» va directo a la
página de gracias como si se hubiera pagado, y el código `demo20` descuenta un 20 %. Sin
`ZLECITOOL_SMTP_HOST`, **ningún correo sale**: el núcleo deja cada uno en `<datos>/mail/*.eml` (el enlace
de una gratis, el de confirmar un correo, los avisos, el recibo de una compra); se abren con cualquier lector de correo. Sin los
scripts de pago todo funciona, y una descarga contesta que el fichero no está.

## Pruebas

```
pip install -r requirements-dev.txt
python -m playwright install chromium        # sólo para tools/screenshots.py
pytest
```

Ninguna prueba sale a la red: PayPal es el de prueba y los correos se quedan en
`testing.mail_outbox()`. `tests/test_smoke.py` lleva `testing.check_tool(app)`, el contrato del núcleo
hecho prueba. Las de los scripts de pago (`test_formats.py`, `test_cli.py`) los sacan de la historia del
repo; en un clon sin ella, se saltan.

| Fichero | Qué prueba |
|---|---|
| `test_smoke.py` | el contrato del núcleo; la ficha (pública, sin precios en créditos, la palabra Edgefolio); lo público y lo que pide sesión; la página en el idioma de la carcasa |
| `test_pricing.py`, `test_bundles.py` | los precios sólo del catálogo; los escalones y el código sumados con el tope del 70 %; los códigos de precio único; los lotes y el pack; una estrategia nunca dos veces; los lotes que se publican |
| `test_search.py` | los filtros, el orden, las páginas y los histogramas contra el catálogo de verdad; que sean rápidos |
| `test_orders.py` | pagar y descargar; el importe de PayPal comprobado; los enlaces que caducan y se gastan (también a la vez); el recibo con enlaces sólo para el navegador que compró, la cuenta que compró o la que demostró el correo |
| `test_receipt.py` | el recibo por correo: una vez por pedido, en el idioma de la página, línea a línea; sin dirección pública no sale y el pago sigue |
| `test_free.py` | las gratis por correo; el límite del día (también a la vez); las novedades con doble confirmación; el idioma del correo |
| `test_mine.py` | Mis estrategias: lo de la cuenta y lo de un correo demostrado; renovar; las versiones nuevas; el script del propietario; las favoritas; el zip de un pedido |
| `test_proofs.py` | la prueba de un correo: un uso, en dos pasos, sólo para la cuenta que la pidió, sólo hashes, sin llenar buzones, CSRF, el idioma |
| `test_alerts.py` | los avisos de las favoritas: una vez, en su idioma, sólo a un correo demostrado |
| `test_security.py` | los enlaces nunca con la cabecera Host; la cookie de quien compra; correos que un programa leería distinto; los límites por IP; la forma de los rechazos; CSRF |
| `test_formats.py` | los formatos del zip (.md, .py, .js) contra el script; cada script de pago entendido |
| `test_site.py`, `test_media.py`, `test_cli.py`, `test_layout.py` | la página sobre la carcasa; nada privado en `static/`; las vistas previas cortadas; las miniaturas y los cambios; los comandos; la forma del repo |

## Cómo funciona

### Una compra

```
navegador                                 servidor (edgefolio/)                       PayPal
  │ POST /api/quote {items, bundles,       precios de catalogue.csv y bundles.json,
  │       pack, code} ───────────────────▶ escalones + código, ≤ 70 %
  │ ◀──────────────── total, descuento ────
  │ POST /api/orders (lo mismo) ──────────▶ el mismo precio ───────────────────────▶ crear el pedido
  │ ◀──────────────────── enlace para aprobar (y la cookie edgefolio_buyer) ───────┘
  │ se paga en PayPal, que vuelve a /thanks?token=<pedido>
  │ POST /api/orders/<id>/capture ────────▶ cobrar ─────────────────────────────────▶ el dinero se mueve
  │                                          ¿importe = total del pedido? ◀─────────┘
  │ ◀──────── recibo + un enlace por fichero (sólo a quien puede verlos)
  │                                          el recibo, por correo a quien pagó
  │ GET /api/download/<token>[?format=zip] ▶ el fichero, de la carpeta privada
```

El navegador sólo manda ids de estrategias, claves de lotes y el código tecleado: no tiene ningún precio
que pueda cambiar, ningún código de descuento ni la ruta de un fichero de pago. Una estrategia nunca se
cobra dos veces: lo que va en un lote o en el pack no se cobra suelto, y dos lotes que comparten una
estrategia se rechazan. Cada POST lleva el token CSRF del núcleo (lo pone `csrf.js` en cada `fetch`).

### Las descargas

Cada estrategia de un pedido pagado tiene su enlace (`/api/download/<token>`): vale `DOWNLOAD_DAYS` días y
`MAX_DOWNLOADS` descargas, que se gastan con un único `UPDATE` condicional antes de mandar nada (dos
peticiones a la vez no se llevan la misma última descarga). `?format=zip` añade las reglas en Markdown y
las versiones beta en Python y JavaScript; `/api/download/all?t=…&t=…` junta los `.pine` de un pedido.
Los scripts completos están en la carpeta privada (`STRATEGIES_DIR`), nunca en `static/`; las vistas
previas públicas van cortadas a 50 líneas de su primer árbol.

**Quién ve los enlaces del recibo:** el navegador que hizo el pedido (su cookie `edgefolio_buyer`,
HttpOnly, 30 días; en la base de datos sólo su hash), la cuenta que compró con la sesión abierta y, si se
compró sin cuenta, una cuenta que ha demostrado el correo de PayPal. Cualquier otro (alguien con el id del
pedido, que va en la dirección de vuelta de PayPal) recibe el recibo sin enlaces.

**El recibo por correo** (la «factura por correo» que promete la fila de confianza bajo «Pagar»): el
primer cobro de un pedido lo manda al correo del pedido (el de la cuenta o, sin cuenta, el de PayPal),
en el idioma de la página: cada línea con lo que costó, el total, cuánto valen los enlaces y la
dirección de Mis estrategias, sin enlaces de descarga (un correo no demuestra nada; ver abajo). Es un
recibo, no una factura con datos fiscales: para eso da `CONTACT_EMAIL`. La misma fila enseña
`DOWNLOAD_DAYS`, `MAX_DOWNLOADS` y `CONTACT_EMAIL` tal como estén configurados.

### Mis estrategias y la prueba de un correo

Las cuentas son **las del núcleo**: entrar en la tienda es haber entrado en todas las herramientas.
`/mine` pide la sesión (el núcleo lleva a `/login?next=/mine`). Pero **el núcleo no comprueba el correo
de quien se da de alta**: si Mis estrategias enseñara los pedidos cuyo correo es el de la cuenta,
cualquiera podría registrarse con el de quien compró y llevarse sus enlaces. Por eso:

- lo comprado o pedido gratis **con la sesión abierta** lleva `user_id`: es de esa cuenta;
- lo hecho **sin cuenta** (se puede comprar sin ella) sólo sale en una cuenta cuando ha **demostrado**
  ese correo. Mis estrategias ofrece «¿Compraste sin cuenta?»: `POST /api/mine/proofs {email}` manda a
  esa dirección un enlace de un solo uso (24 horas, sólo para la cuenta que lo pidió). Abrirlo
  (`/mine?proof=<token>`) sólo pregunta de qué correo es (`/api/mine/proofs/peek`, sin gastar nada: un
  lector de correo que lo abre no confirma nada); el clic de la persona lo confirma
  (`/api/mine/proofs/confirm`) y queda en `edgefolio_email_proof`.

La misma prueba hace falta para los avisos de las favoritas: nadie recibe correos porque otro se
registró con su dirección y marcó unas casillas.

Desde Mis estrategias se pide un enlace nuevo cuando uno caduca o se gasta (o hay una versión nueva; uno
que funciona no se cambia, para que el botón no reinicie el límite), se lee el script entero (la vista de
propietario de «Cómo decide») y se guardan las favoritas con sus avisos.

### Las gratis y las novedades

Las 79 estrategias gratis se mandan por correo (`POST /api/free`): el enlace va en el correo, nunca en la
respuesta. Como mucho 10 al día por dirección (contadas con la fila de la dirección bloqueada, así que
diez peticiones a la vez no se cuelan) y 20 por IP a la hora. Las novedades son una casilla aparte, sin
marcar: se apuntan sólo si se marca y sólo cuentan cuando se confirman desde el correo
(`/api/news/confirm`, doble opt-in).

### Idiomas y textos

Los textos de la tienda están en `i18n/ui.json`, en los 8 idiomas del núcleo; la página los lee del
diccionario del núcleo (`/zt/i18n.json`, con los comunes) y sigue el idioma de la carcasa: al cambiarlo
en su menú, se repinta sin recargar (`zt:language`). Los correos salen en el idioma de la petición. Un
rechazo del servidor es una clave (`{"error": "errLinkExpired", "vars": {…}}`) y la página enseña su texto.

## Rutas

| | |
|---|---|
| `/`, `/thanks`, `/s/<id>`, `/s/<id>/tree` | la tienda (una sola plantilla; la página lee la ruta), públicas |
| `/mine` | Mis estrategias, con sesión |
| `GET /api/strategies` | el catálogo filtrado, ordenado y por páginas en el servidor: `q`, `tab` (`hot`, `win`, `stocks`, `crypto`, `new`, `free`), `free=1`, `paid=1`, `sort`, `page`, `size` (≤ 100), los rangos como `<clave>_min` / `<clave>_max`, las listas como `sym`, `tf`, `ind`, `idx`, `rel` repetidos; `facets=1` añade cada histograma y recuento |
| `GET /api/strategies/<id>`, `GET /api/bundles` | una estrategia con su indicador y sus versiones; los lotes y el pack |
| `POST /api/quote`, `POST /api/orders`, `POST /api/orders/<id>/capture` | el precio, el pedido de PayPal, el cobro y el recibo |
| `GET /api/download/<token>`, `GET /api/download/all` | las descargas |
| `POST /api/free`, `GET /api/news/confirm` | una gratis por correo; confirmar las novedades |
| `GET /api/config`, `GET /api/fx`, `GET /api/me`, `GET /thumbs/<raíz>.webp` | lo que la página necesita (nunca un código), los cambios de moneda, quién es, las miniaturas |
| `GET /api/mine`, `POST /api/mine/renew`, `GET /api/mine/<id>/script` | Mis estrategias, un enlace nuevo, el script del propietario (con sesión) |
| `POST /api/mine/proofs`, `/peek`, `/confirm` | la prueba de un correo (con sesión) |
| `PUT` / `DELETE /api/favourites/<id>` | las favoritas y sus avisos (con sesión) |

Sin sesión, un script recibe `401 {"error": "errLoginRequired"}` en lo que la pide. Las cuentas
(`/register`, `/login`, `/cuenta`), el idioma, lo legal (`/legal/…`) y el contacto son del núcleo.

## Comandos

```
flask --app app edgefolio restore-scripts [--force]   # los scripts de pago, de la historia del repo
flask --app app edgefolio fx-update                   # los cambios del día del BCE (una vez al día)
flask --app app edgefolio send-alerts                 # los avisos de las favoritas (una vez al día)
flask --app app edgefolio subscribers                 # quién confirmó las novedades, en CSV
```

Los scripts de pago **no están en el repo**, sólo en su historia (`c3fa796:d_result/pine_TW_b`).
`restore-scripts` los copia a `STRATEGIES_DIR` con `git archive`, **sin tocar la copia de trabajo ni el
índice**, y sólo si la carpeta está vacía (o con `--force`): es lo que hace el lanzador la primera vez.
Como siguen en la historia, cualquiera con el repo puede sacarlos: para cerrarlo del todo, publicar la
tienda en un repo nuevo (o reescribir la historia) antes de volver a vender.

`send-alerts` compara el catálogo con la vuelta anterior y manda un correo por persona con lo nuevo de
sus favoritas (versión nueva, bajada de precio, un lote nuevo); la primera vez sólo apunta cómo está.
`fx-update` escribe `<datos>/edgefolio/fx.json`; hasta entonces valen los cambios de ejemplo de
`catalogue/fx.json`. Los dos, con cron (o el programador del alojamiento) y el mismo entorno que el
servidor.

## Configuración

Lo común, con las variables del núcleo (todas en `.env.example`): `FLASK_SECRET_KEY` (el mismo en todas
las herramientas), `ZLECITOOL_DATA_DIR`, `DATABASE_URL`, `ZLECITOOL_PUBLIC_URL` (la dirección pública:
los enlaces de los correos y la vuelta de PayPal se hacen con ella, nunca con la cabecera Host),
`ZLECITOOL_SMTP_*` y `ZLECITOOL_MAIL_FROM` (el correo), `ZLECITOOL_TRUSTED_PROXIES`,
`ZLECITOOL_LEGAL_*`, `ZLECITOOL_ADMINS`… Lo propio de la tienda (`edgefolio/settings.py`):

| Variable | Por defecto | |
|---|---|---|
| `PAYPAL_MODE` | `fake` | `fake`, `sandbox` o `live`. Con `sandbox` o `live` no arranca sin `ZLECITOOL_PUBLIC_URL` |
| `PAYPAL_CLIENT_ID`, `PAYPAL_CLIENT_SECRET` | | de una app REST del panel de desarrolladores de PayPal; obligatorias fuera de `fake` |
| `DISCOUNT_CODES` | ninguno | pares `código=porcentaje`: `spring20=0.20,partner40=0.40` |
| `FLAT_PRICE_CODES` | ninguno | pares `código=precio` que ponen un precio a cada estrategia suelta |
| `MAX_DISCOUNT` | `0.70` | el tope del escalón más el código, juntos |
| `PACK_SIZE`, `PACK_PRICE` | `5`, `249` | «Crea tu pack» |
| `DOWNLOAD_DAYS`, `MAX_DOWNLOADS` | `7`, `10` | lo que vale un enlace de descarga |
| `NEW_DAYS` | `30` | lo que una estrategia sale en «Nuevas» |
| `CONTACT_EMAIL` | `sales@tuisku.eu` | la dirección que la página da para los problemas |
| `STRATEGIES_DIR` | `<datos>/edgefolio/strategies` | los `.pine` de pago |
| `PORT` | `5105` | el de `python app.py` (y `gunicorn.conf.py`) |

Los escalones por importe (más de 160 $: 15 %, 290 $: 20 %, 500 $: 25 %, 1.000 $: 40 %, 2.500 $: 70 %)
están en `edgefolio/settings.py`; la página pinta su escalera con `/api/config`, así que no pueden no
coincidir.

## La base de datos

La de **todas las herramientas** (la del núcleo, `DATABASE_URL`; sin ella, SQLite en
`<ZLECITOOL_DATA_DIR>/zlecitool.db`). Las tablas se crean solas al arrancar (`create_tables`). La tienda
no lee ni escribe ninguna `core_*`: sus filas apuntan a **`core_user.id`** (la cuenta del núcleo) y las
cuentas, la sesión, el idioma elegido y lo demás de la familia los lleva el núcleo en sus tablas.

| Tabla | Columnas | Qué guarda |
|---|---|---|
| `edgefolio_order` | `paypal_id` (clave), `user_id` → `core_user` (vacío sin cuenta), `items` (JSON: las claves), `code`, `total`, `currency`, `status` (`CREATED`, `PAID`, `FAILED`), `payer`, `email`, `lines` (JSON: lo cobrado, línea a línea), `buyer_hash`, `created_at` | un pedido de PayPal; `email` es el de la cuenta o, sin cuenta, el de PayPal (en minúsculas); `buyer_hash`, el SHA-256 de la cookie del navegador que compró |
| `edgefolio_download` | `token` (clave), `paypal_id` → `edgefolio_order`, `item_key`, `expires_at`, `count`, `version`, `created_at` | un enlace de descarga de una estrategia de un pedido pagado (y los que lo renuevan) |
| `edgefolio_free_claim` | `token` (clave), `user_id` → `core_user` (vacío sin cuenta), `email`, `item_key`, `news`, `consent_at`, `expires_at`, `count`, `version`, `lang` | una gratis mandada a un correo, con su enlace y su consentimiento |
| `edgefolio_subscriber` | `email` (clave), `news`, `consent_at`, `source`, `lang`, `token_hash`, `confirmed_at` | quien pidió las novedades; sólo cuenta con `confirmed_at` (doble opt-in) |
| `edgefolio_favourite` | `user_id` → `core_user` y `item_key` (clave), `alerts` (JSON: `nv`, `pd`, `bd`), `email`, `lang`, `created_at` | las favoritas de una cuenta, con sus avisos, y el correo y el idioma a los que van |
| `edgefolio_alert_state` | `item_key` (clave), `version`, `price`, `bundles` (JSON), `updated_at` | cómo era cada estrategia en la última vuelta de los avisos: un cambio se avisa una vez |
| `edgefolio_email_proof` | `id`, `user_id` → `core_user`, `email` (únicos juntos), `token_hash`, `requested_at`, `expires_at`, `verified_at` | que una cuenta ha demostrado un correo (`verified_at`); hasta entonces, el hash del enlace mandado |
| `edgefolio_mailbox` | `email` (clave), `first_seen_at`, `last_seen_at` | una fila por dirección a la que escribe la tienda: se bloquea para contar lo que va por dirección (las gratis del día) de una vez, en SQLite y en Postgres |

Los enlaces de un solo uso y la cookie de quien compra se guardan sólo como hash. Fuera de la base de
datos, en `<ZLECITOOL_DATA_DIR>/edgefolio/`: `strategies/` (los scripts de pago), `thumbs/` (las
miniaturas WebP, hechas la primera vez que se piden) y `fx.json` (los cambios del día). Con
`flask --app app zt backup` (del núcleo) se copia la base de datos; la carpeta de datos, con el resto del
servidor.

## Publicar un catálogo nuevo

La fábrica de estrategias (el repo privado `ML-Sklearn-strategy-stock-crypto-for-TraderView`) escribe un
export separado por tabuladores con el backtest de TradingView de cada estrategia. Para publicarlo:

```
python catalogue/publish.py ruta/a/pine_TW_img_info_6_WEB.csv --assets ruta/a/la/fabrica/d_result --prune
```

Deja una fila por estrategia, hace relativa cada ruta de imagen, quita dónde está el fichero de pago, da un
nombre legible a los que tienen el código de la bolsa, copia a `static/assets/` los gráficos y las vistas
previas que usan las filas (con `--prune` borra los que ya no usa ninguna) y corta cada vista previa a su
parte pública. Después: los scripts de pago nuevos a `STRATEGIES_DIR`, comprobar que
`catalogue/bundles.json` sigue nombrando estrategias que existen, y `pytest`. `docs/catalogue-updates.md`
cuenta la renovación mensual y la diaria.

## Desplegar

1. **El servidor**: Python 3.10 o más (3.11 recomendado), con HTTPS delante.
2. **El núcleo** es privado: un token de GitHub con lectura de `Leci37/zlecitool-core` para que `pip` lo
   instale en la etiqueta que fija `requirements.txt` (**v0.23.0**).
3. `pip install -r requirements.txt`
4. **El entorno**: el común de la familia (`FLASK_SECRET_KEY` el mismo que las otras, `DATABASE_URL` a
   Postgres, `ZLECITOOL_PUBLIC_URL`, el SMTP, `ZLECITOOL_TRUSTED_PROXIES=1` detrás de nginx, los datos
   legales) y el de la tienda: `PAYPAL_MODE=sandbox` con sus claves de prueba primero; con `live`, la
   primera compra de verdad es la prueba. Los códigos de descuento, en `DISCOUNT_CODES`.
5. **Los scripts de pago**, a `STRATEGIES_DIR` (fuera de lo que se sirve, y que se conserve entre
   despliegues), o `flask --app app edgefolio restore-scripts` desde un clon con la historia.
6. **Arrancar**: `gunicorn -c gunicorn.conf.py "app:create_app()"` (el `Procfile`). Las tablas se crean
   solas.
7. **Los trabajos diarios**: `flask --app app edgefolio send-alerts` y `fx-update`, con cron.
8. **Los datos de la versión FastAPI** (`private/shop.db`) no se traen solos: sus pedidos no tienen cuenta
   del núcleo, así que pasarían a ser pedidos sin cuenta (que cada comprador ve al demostrar su correo).
   Si hace falta, se copian a `edgefolio_order` / `edgefolio_download` con un guion de una vez.

## Antes de volver a vender

Las estrategias se generaron el 2024-10-18 y llevan una «caducidad recomendada» del 2025-06-18. Una
revisión del generador encontró que un tercio calcula sus indicadores en TradingView de forma distinta
que el Python que las entrenó, y que la familia Ichimoku usó precios futuros al entrenar. Hay que
regenerar el catálogo con eso corregido antes de relanzarla. Sin hacer, porque necesitan datos o
trabajos que la tienda no tiene: el trabajo diario que mide cada estrategia desde su publicación
(`catalogue/since_release.csv`), las versiones de pago más allá de la v1 y las descripciones de los
valores de los indicadores que el árbol aún no conoce (`static/trees/features.json`).

## Qué cambió desde la versión FastAPI

- **Una herramienta zlecitool**: Flask sobre el núcleo (`app.py` como el de la plantilla, `tool.json`,
  el paquete `edgefolio/`), con `testing.check_tool(app)` en las pruebas. FastAPI y uvicorn ya no están.
- **La carcasa del núcleo**: la barra con la palabra Edgefolio, el menú de idioma, la cuenta («Entrar»),
  la raya de colores, el pie y las páginas legales son los de la familia; lo de la tienda en la barra
  (Lite | Pro, Mis estrategias, Ver tutorial, TradingView, la moneda) va en sus huecos, con el marcado
  del diseño. La página se ve como antes; cambian «Entrar», «Preferencias de cookies» en el pie y el
  aviso de cookies de la familia.
- **Las cuentas del núcleo**: se fue el acceso por enlace de la tienda y su cookie `ef_session`. Lo de
  una compra sin cuenta se ve al demostrar el correo (la tabla `edgefolio_email_proof`).
- **La base de datos común** (SQLAlchemy, tablas `edgefolio_*`) en lugar de `private/shop.db`; los
  ficheros privados, en la carpeta de datos de la herramienta.
- **Los correos del núcleo** (`zlecitool_core.mail.send`): sin SMTP, en `<datos>/mail/`. Se fueron la
  tabla `outbox`, `MAIL_MODE`, `SMTP_*`, `PUBLIC_URL` (ahora `ZLECITOOL_PUBLIC_URL`) y `tools/outbox.py`.
  El núcleo los manda en segundo plano: un fallo de SMTP queda en su log (la descarga gratis ya está
  apuntada y se puede pedir otra vez).
- **Los textos** en `i18n/ui.json` con el diccionario y el idioma del núcleo; las claves que chocaban con
  las suyas, renombradas; cada rechazo, una clave traducida.
- **Los trabajos** son comandos: `restore-scripts`, `fx-update`, `send-alerts`, `subscribers` (antes
  `tools/update_fx.py`, `tools/send_alerts.py`, `tools/outbox.py`).
- **Los límites por dirección** se cuentan con la fila de la dirección bloqueada (también con varios
  procesos y con Postgres); antes, con un candado del proceso.

## Qué hay aquí

```
app.py, tool.json          el arranque y la ficha
edgefolio/                 la tienda: routes.py (las rutas), models.py (las tablas), cli.py (los comandos);
                           catalogue, search, pricing, paypal, orders, downloads, formats, free, mine,
                           proofs, alerts, media, fx, settings, shop, web (el trabajo, sin Flask)
templates/edgefolio/       shop.html, la página sobre zt/base.html
static/                    la página tal cual (sin compilar): js/ (Preact + htm, las vistas del diseño),
                           css/ (edgefolio.css y theme.css), vendor/, trees/, img/, assets/ (5.668
                           gráficos, 2.834 vistas previas, iconos)
i18n/ui.json               los textos de la tienda, en 8 idiomas
catalogue/                 catalogue.csv, indicators.csv, bundles.json, fx.json; publish.py y previews.py
tests/                     las pruebas (arriba)
tools/screenshots.py       el recorrido en un navegador (las capturas de arriba)
docs/                      IMPLEMENTATION-v7.md (el diseño), catalogue-updates.md, design/ (el diseño de
                           referencia: python docs/design/serve.py lo abre), img/, notes/
```
