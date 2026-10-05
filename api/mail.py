"""Outgoing email. MAIL_MODE=console keeps every message on this machine (the log and the outbox table);
MAIL_MODE=smtp sends it. Either way the outbox records it, and a failure never breaks the request."""
import logging
import smtplib
import ssl
from email.message import EmailMessage
from email.utils import formatdate, make_msgid

log = logging.getLogger("api.mail")


class Mailer:
    def __init__(self, settings, store):
        self.settings, self.store = settings, store

    def send(self, to: str, subject: str, body: str) -> bool:
        s = self.settings
        if s.mail_mode != "smtp":
            log.info("mail to %s: %s\n%s", to, subject, body)
            self.store.add_mail(to, subject, body, "console")
            return True
        msg = EmailMessage()
        msg["From"], msg["To"], msg["Subject"] = s.mail_from, to, subject
        msg["Date"], msg["Message-ID"] = formatdate(localtime=False), make_msgid(domain="tuisku.eu")
        msg.set_content(body)
        try:
            with smtplib.SMTP(s.smtp_host, s.smtp_port, timeout=20) as smtp:
                if s.smtp_starttls:
                    smtp.starttls(context=ssl.create_default_context())
                if s.smtp_user:
                    smtp.login(s.smtp_user, s.smtp_password)
                smtp.send_message(msg)
        except (OSError, smtplib.SMTPException) as e:
            log.warning("mail to %s failed: %s", to, e)
            self.store.add_mail(to, subject, body, "failed", str(e)[:500])
            return False
        self.store.add_mail(to, subject, body, "sent")
        return True
