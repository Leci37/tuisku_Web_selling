"""The shop: the API under /api, the storefront everywhere else.

    uvicorn --factory api.app:create_app --port 8000      # then open http://localhost:8000
"""
from fastapi import FastAPI, Request
from fastapi.responses import FileResponse
from fastapi.staticfiles import StaticFiles

from api import auth, capture, download, free, media, mine, orders, search
from api.catalogue import Catalogue
from api.mail import Mailer
from api.paypal import FakePayPal, PayPalREST
from api.settings import Settings
from api.store import Store
from api.texts import Texts
from api.web import RateLimit

CSP = ("default-src 'self'; script-src 'self'; style-src 'self' 'unsafe-inline'; img-src 'self' data:; "
       "font-src 'self'; connect-src 'self'; frame-ancestors 'none'; base-uri 'self'; form-action 'self'")

# Addresses the single-page storefront answers itself (it reads the path in the browser).
PAGES = ("/", "/mine", "/thanks", "/s/{strategy_id}", "/s/{strategy_id}/tree")


def create_app(settings: Settings = None, paypal=None) -> FastAPI:
    settings = settings or Settings.from_env()
    docs = settings.paypal_mode == "fake"  # the map of the API is for local runs, not for the public shop
    app = FastAPI(title="Edgefolio shop", docs_url="/api/docs" if docs else None,
                  openapi_url="/api/openapi.json" if docs else None, redoc_url=None)
    app.state.settings = settings
    app.state.catalogue = Catalogue(settings)
    search.index_of(app.state.catalogue)  # built now, so the first visitor does not wait for it
    app.state.store = Store(settings.database)
    app.state.mailer = Mailer(settings, app.state.store)
    app.state.texts = Texts(settings.storefront / "i18n" / "storefront.ui.json")
    app.state.limits = {"login": RateLimit(auth.LOGIN_LIMIT, auth.LOGIN_WINDOW),
                        "free": RateLimit(free.FREE_LIMIT, free.FREE_WINDOW)}
    app.state.paypal = paypal or (FakePayPal() if settings.paypal_mode == "fake" else
                                  PayPalREST(settings.paypal_mode, settings.paypal_client_id,
                                             settings.paypal_client_secret))

    @app.middleware("http")
    async def security_headers(request: Request, call_next):
        response = await call_next(request)
        response.headers.setdefault("Content-Security-Policy", CSP)
        response.headers.setdefault("X-Content-Type-Options", "nosniff")
        response.headers.setdefault("Referrer-Policy", "strict-origin-when-cross-origin")
        return response

    @app.get("/api/config")
    def config():
        """What the storefront needs to draw prices and links: never a secret or a discount code."""
        return {"mode": settings.paypal_mode, "currency": settings.currency,
                "max_discount": str(settings.max_discount),
                "tiers": [{"over": str(o), "rate": str(r)} for o, r in settings.tiers],
                "pack": {"size": settings.pack_size, "price": str(settings.pack_price)},
                "download_days": settings.download_days, "max_downloads": settings.max_downloads,
                "new_days": settings.new_days, "contact_email": settings.contact_email,
                "legal_base_url": settings.legal_base_url,
                "strategies": len(app.state.catalogue)}

    def page():
        return FileResponse(settings.storefront / "index.html", media_type="text/html")

    for path in PAGES:
        app.add_api_route(path, page, methods=["GET"], include_in_schema=False)

    for module in (search, orders, capture, download, free, auth, mine, media):
        app.include_router(module.router)
    app.mount("/", StaticFiles(directory=settings.storefront, html=True), name="storefront")
    return app
