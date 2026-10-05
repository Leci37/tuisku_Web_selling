// Calls to the shop's own server. The server answers errors as {"detail": {"error": "..."}}; the
// message travels on the ApiError so the page can show what the server said.
export class ApiError extends Error {
  constructor(status, message, detail) {
    super(message);
    this.status = status;
    this.detail = detail || {};
  }
}

function messageOf(detail, fallback) {
  if (detail && typeof detail === 'object' && !Array.isArray(detail) && detail.error) return String(detail.error);
  if (typeof detail === 'string') return detail;
  if (Array.isArray(detail) && detail[0] && detail[0].msg) return String(detail[0].msg); // FastAPI validation
  return fallback;
}

export async function api(path, { method = 'GET', body } = {}) {
  const init = { method, credentials: 'same-origin', headers: { Accept: 'application/json' } };
  if (body !== undefined) {
    init.headers['Content-Type'] = 'application/json';
    init.body = JSON.stringify(body);
  }
  let res;
  try {
    res = await fetch(path, init);
  } catch (e) { // no answer at all (offline, DNS, connection cut): the one case that is a network error
    const err = new ApiError(0, 'network', {});
    err.network = true;
    throw err;
  }
  let data = null;
  try { data = await res.json(); } catch (e) { data = null; }
  if (!res.ok) {
    const detail = data && data.detail;
    throw new ApiError(res.status, messageOf(detail, res.statusText || 'HTTP ' + res.status), detail);
  }
  return data;
}

export const post = (path, body) => api(path, { method: 'POST', body: body || {} });
