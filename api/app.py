"""The shop: the API under /api, the catalogue CSVs under /catalogue, the storefront at /.

    uvicorn --factory api.app:create_app --port 8000      # then open http://localhost:8000
"""
from fastapi import FastAPI
from fastapi.responses import FileResponse
from fastapi.staticfiles import StaticFiles

from api import capture, download, orders
from api.catalogue import Catalogue
from api.paypal import FakePayPal, PayPalREST
from api.settings import Settings
from api.store import Store


def create_app(settings: Settings = None, paypal=None) -> FastAPI:
    settings = settings or Settings.from_env()
    app = FastAPI(title="tuisku shop", docs_url="/api/docs", openapi_url="/api/openapi.json")
    app.state.settings = settings
    app.state.catalogue = Catalogue(settings.catalogue)
    app.state.store = Store(settings.database)
    app.state.paypal = paypal or (FakePayPal() if settings.paypal_mode == "fake" else
                                  PayPalREST(settings.paypal_mode, settings.paypal_client_id,
                                             settings.paypal_client_secret))

    @app.get("/api/config")
    def config():
        """What the storefront needs to draw the checkout: never a secret or a discount code."""
        return {"mode": settings.paypal_mode, "paypal_client_id": settings.paypal_client_id,
                "currency": settings.currency, "max_discount": str(settings.max_discount),
                "tiers": [{"over": str(o), "rate": str(r)} for o, r in settings.tiers],
                "strategies": len(app.state.catalogue)}

    def csv_file(path):
        def endpoint():
            return FileResponse(path, media_type="text/csv")
        return endpoint

    for name in ("catalogue.csv", "indicators.csv"):
        app.add_api_route(f"/catalogue/{name}", csv_file(settings.catalogue.parent / name),
                          methods=["GET"], include_in_schema=False)

    app.include_router(orders.router)
    app.include_router(capture.router)
    app.include_router(download.router)
    app.mount("/", StaticFiles(directory=settings.storefront, html=True), name="storefront")
    return app

