"""The emails' texts in the visitor's language, read from the storefront's own dictionary
(storefront/i18n/storefront.ui.json, the mail* keys), so every translation lives in one file.
A language missing from a text falls back to English; {name} placeholders are filled in here."""
import json
import re
from pathlib import Path

MAIL_KEYS = ("mailSignInSubject", "mailSignInBody", "mailFreeSubject", "mailFreeBody", "mailNewsConfirm",
             "mailAlertSubject", "mailAlertBody", "mailAlertNew", "mailAlertPrice", "mailAlertBundle",
             "mailReceiptSubject", "mailReceiptBody")
PLACEHOLDER = re.compile(r"\{(\w+)\}")


class Texts:
    def __init__(self, path: Path):
        self.data = json.loads(path.read_text(encoding="utf-8"))
        missing = [k for k in MAIL_KEYS if not isinstance(self.data.get(k), dict) or not self.data[k].get("en")]
        if missing:  # found at start-up rather than when the first email fails to go out
            raise ValueError(f"{path} has no English text for {', '.join(missing)}")

    def get(self, key: str, lang: str, **values) -> str:
        entry = self.data[key]
        text = entry.get(lang) or entry["en"]
        if isinstance(text, dict):  # a plural form, as the browser's t() reads it
            text = text.get("other", "")
        return PLACEHOLDER.sub(lambda m: str(values[m[1]]) if m[1] in values else m[0], text)
