"""Open the reference design in a browser.

    python docs/design/serve.py          # then open http://localhost:8765/Storefront%20v7.dc.html

The mock-up loads its charts, icons and previews from storefront/assets/... and its fonts from the
core's path; this serves those two from the repository's storefront/ so nothing is copied here.
"""
import http.server
import sys
from urllib.parse import unquote
from functools import partial
from pathlib import Path

HERE = Path(__file__).resolve().parent
STOREFRONT = HERE.parent.parent / "storefront"
ROUTES = {"/storefront/": STOREFRONT, "/zlecitool_core/ui/static/fonts/": STOREFRONT / "fonts"}


class Handler(http.server.SimpleHTTPRequestHandler):
    def translate_path(self, path):
        for prefix, folder in ROUTES.items():
            if path.startswith(prefix):
                target = (folder / unquote(path[len(prefix):].split("?")[0])).resolve()
                return str(target) if target.is_relative_to(folder.resolve()) else str(HERE / "-")
        return super().translate_path(path)


if __name__ == "__main__":
    port = int(sys.argv[1]) if len(sys.argv) > 1 else 8765
    print(f"http://localhost:{port}/Storefront%20v7.dc.html")
    http.server.ThreadingHTTPServer(("", port), partial(Handler, directory=str(HERE))).serve_forever()
