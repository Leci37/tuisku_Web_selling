# CLAUDE.md — herramienta zlecitool `edgefolio`

Esta es una herramienta **zlecitool**: una app Flask pequeña que sólo contiene
lo suyo. Lo común lo pone el núcleo, `zlecitool-core`, instalado como
dependencia (la versión la fija `requirements.txt`).

Es **pública**: cualquiera mira la tienda sin cuenta y compra sin ella; las
cuentas son las del núcleo (las mismas en todas las herramientas). Lleva la
palabra Edgefolio en la barra y en el pie (`"wordmark"` en `tool.json`), sin
publicidad, y **vende con PayPal, no con créditos** (sin `"prices"`).

Antes de escribir código, lee lo que el núcleo ofrece: su **CONTRATO.md**
(en desarrollo, `../zlecitool-core/CONTRATO.md`; si no está, en GitHub:
`Leci37/zlecitool-core`, en la etiqueta de `requirements.txt`). Y el
README de aquí: la base de datos, las compras, la prueba de un correo.

## Reglas

1. **Lo común no se escribe aquí.** Cuentas, seguridad, estética, idiomas,
   correo, pruebas: vienen del núcleo. Si falta algo, **para y dilo**: se añade
   al núcleo, en otra sesión y en su repo, sale una versión nueva y aquí se
   sube. Nada de parches locales.
2. **Nada copiado** del núcleo ni de otra herramienta.
3. **Del núcleo sólo se importa lo que está en su CONTRATO.md.**
4. **Tablas con prefijo:** `__tablename__ = "edgefolio_algo"`, siempre
   explícito. Las tablas `core_*` son del núcleo: no se leen ni se escriben.
5. **Cada cosa en su sitio:** `app.py` sólo arranca; `edgefolio/routes.py`
   recibe la petición y responde; los módulos de al lado (`search`, `pricing`,
   `orders`, `downloads`, `free`, `mine`, `proofs`, `alerts`…) hacen el
   trabajo, sin Flask, para poder probarlos solos; `edgefolio/models.py` son
   las tablas.
6. **Ficheros sólo dentro de** `current_tool().data_dir` (los scripts de
   pago, las miniaturas, los cambios del día). Lo publicado (catálogo,
   gráficos, vistas previas cortadas) va en el repo.
7. **Pruebas en verde:** `pytest`. `testing.check_tool(app)` es el contrato
   del núcleo: no se quita ni se rodea.
8. **Subir el núcleo** es una decisión: leer su CHANGELOG, cambiar la
   etiqueta en `requirements.txt` y pasar las pruebas.
9. **Idioma:** documentación y comentarios en español; nombres en el código,
   en inglés. Lo que se entrega (los formatos del zip) va en inglés, como el
   script.
10. **Toda ruta pide sesión** sin hacer nada; lo que usa quien entra sin
    cuenta (mirar, comprar, descargar con su enlace, la gratis) se marca con
    `@public`. Nada de `login_required` a mano. Lo hecho con la sesión abierta
    lleva `user_id` → `core_user.id`.
11. **Un correo no es una cuenta.** El núcleo no comprueba el correo al darse
    de alta: lo hecho sin cuenta con un correo (un pedido, una gratis) sólo es
    de una cuenta que ha **demostrado** ese correo (`proofs`, tabla
    `edgefolio_email_proof`). Nunca se enseña nada sólo porque el correo de la
    cuenta coincide. Los avisos de las favoritas, tampoco sin demostrarlo.
12. **Los precios, sólo en el servidor.** El navegador manda ids, claves de
    lotes y el código tecleado; el servidor pone el precio, el descuento (con
    el tope de `MAX_DISCOUNT`) y el total que se pide a PayPal, y comprueba el
    importe al cobrar. Ningún código de descuento llega al navegador.
13. **Los scripts completos** sólo salen por un enlace que dio la tienda, que
    caduca y tiene descargas contadas (un `UPDATE` condicional, nunca leer y
    después escribir). Las vistas previas públicas van cortadas.
14. **La sesión es de todas las herramientas:** sólo claves `edgefolio.algo`,
    pequeñas. La cookie propia (`edgefolio_buyer`, la de quien compra) sólo
    lleva un token, y la base de datos su hash.
15. **Un rechazo es una clave del diccionario** (`{"error": "errAlgo"}`),
    nunca una frase en el código. Cada POST de la página lleva el token CSRF
    (lo pone `csrf.js` del núcleo en cada `fetch`).
16. **Textos de la interfaz** en `i18n/ui.json`, en los 8 idiomas a la vez;
    ninguna clave puede repetir una del núcleo. La página los lee del
    diccionario del núcleo (`zt.i18nReady`) y se repinta con `zt:language`.
17. **La página extiende `zt/base.html`** (`templates/edgefolio/shop.html`, a
    todo lo ancho): la barra, el idioma, la cuenta, el pie y lo legal son de la
    carcasa; lo de la tienda en la barra va en `topbar_start` y `topbar_end`.
    Las vistas son las del diseño (`docs/design/`), con su marcado y sus
    estilos en línea: se cambian como el diseño, no a ojo.
18. **Nada de JavaScript en línea** (ni `<script>…</script>` ni `onclick=`):
    va en `static/js/`, con módulos.
19. **Los correos** con `zlecitool_core.mail.send`, en el idioma de la
    petición; sus enlaces, con `http.external_url(…, trusted_host_ok=False)`:
    con `ZLECITOOL_PUBLIC_URL`, nunca con la cabecera Host.

## La aplicación gemela

Esta es la interfaz gráfica. Los datos (estrategias, resultados, gráficos, scripts) los genera
[Leci37/ML-Sklearn-strategy-stock-crypto-for-TraderView](https://github.com/Leci37/ML-Sklearn-strategy-stock-crypto-for-TraderView/tree/claude/quirky-galileo-ka4mjn) (rama `claude/quirky-galileo-ka4mjn`).
Se conectan en `catalogue/publish.py` (su export y su `d_result/` → `catalogue/catalogue.csv` y
`static/assets/`) y en `STRATEGIES_DIR` (sus scripts de pago). Un cambio en las columnas del catálogo o en
dónde están los ficheros se hace en los dos repos a la vez: allí `SHOP_COLUMNS` y `tests/test_export.py`,
aquí `publish.py` y `tests/test_publish.py`. El README («La aplicación gemela») lo cuenta entero.

## Ramas

Se trabaja en `_ztool_dev`; `_ztool_main` sólo para lo estable (se fusiona
desde `_ztool_dev` al publicar). Los mismos nombres en el núcleo y en todas
las herramientas.

## Comandos

```
pip install -r requirements-dev.txt
playwright install chromium
flask --app app edgefolio restore-scripts     # los scripts de pago, de la historia del repo
python app.py                                 # http://localhost:5105
pytest
python tools/screenshots.py                   # el recorrido en un navegador (con el servidor en marcha)
```
