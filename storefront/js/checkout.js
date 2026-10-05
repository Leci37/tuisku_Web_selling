// Checkout. The server prices the cart, creates the PayPal order and hands out the download
// links; the browser only sends the cart's item ids and the discount code the buyer typed.
// (Before 2026 this file computed the amount here and kept the discount codes in the page.)

let shopConfig = null;
let appliedCode = '';
let quoteTimer = null;

function cartIds() {
    const ids = [];
    simpleCart.each(item => ids.push(item.get('name')));  // base64 of "TICKER - INTERVAL - KEY - ID"
    return ids;
}

async function api(path, body) {
    const options = body === undefined ? {} :
        { method: 'POST', headers: { 'Content-Type': 'application/json' }, body: JSON.stringify(body) };
    const response = await fetch(path, options);
    const data = await response.json().catch(() => ({}));
    if (!response.ok) {
        const detail = data.detail || {};
        throw new Error(detail.error || response.statusText);
    }
    return data;
}

const money = value => Number(value).toFixed(2);

function showMessage(id, text, isError) {
    const el = document.getElementById(id);
    if (!el) return;
    el.textContent = text;
    el.style.color = isError ? '#c0392b' : '#2c6b52';
}

// Ask the server for the cart's price; the page shows only what it answers.
async function updateCartTotal() {
    const ids = cartIds();
    const total = document.getElementById('server-total');
    const info = document.getElementById('discount-info-container');
    if (!ids.length) {
        total.textContent = '$0.00';
        info.style.display = 'none';
        return null;
    }
    try {
        const q = await api('/api/quote', { items: ids, code: appliedCode });
        total.textContent = '$' + money(q.total);
        document.getElementById('original-price-value').innerText = money(q.subtotal);
        document.getElementById('discount-value').innerText = money(q.discount);
        document.getElementById('discount-percentage').innerText = (Number(q.discount_rate) * 100).toFixed(0);
        info.style.display = Number(q.discount) > 0 ? 'block' : 'none';
        return q;
    } catch (e) {
        total.textContent = 'unavailable';
        showMessage('checkout-message', 'Could not price the cart: ' + e.message, true);
        return null;
    }
}

function scheduleQuote() {
    clearTimeout(quoteTimer);
    quoteTimer = setTimeout(updateCartTotal, 150);  // simpleCart fires many updates in a row
}

function renderTiers(tiers) {
    const icons = ['📉', '📈', '📊', '💸', '🏦'];
    const rows = tiers.slice().reverse().map((t, i) =>
        `<li>${icons[i] || '•'} Buy over <strong>$${Number(t.over).toLocaleString('en-US')}</strong>: ` +
        `<span style="color: green;">${(Number(t.rate) * 100).toFixed(0)}%</span></li>`);
    document.getElementById('discount-tiers').innerHTML = rows.join('');
}

async function createOrder() {
    showMessage('checkout-message', '');
    const order = await api('/api/orders', { items: cartIds(), code: appliedCode });
    return order.id;
}

// Capture on the server, keep the receipt for the thank-you page, empty the cart.
async function finishOrder(orderId) {
    const receipt = await api(`/api/orders/${encodeURIComponent(orderId)}/capture`, {});
    sessionStorage.setItem('purchase', JSON.stringify(receipt));
    simpleCart.empty();
    window.location.href = 'thankyou.html';
}

function loadScript(src) {
    return new Promise((resolve, reject) => {
        const s = document.createElement('script');
        s.src = src;
        s.onload = resolve;
        s.onerror = () => reject(new Error('could not load ' + src));
        document.head.appendChild(s);
    });
}

async function initCheckout() {
    try {
        shopConfig = await api('/api/config');
    } catch (e) {
        showMessage('checkout-message', 'The shop server is not reachable: ' + e.message, true);
        return;
    }
    renderTiers(shopConfig.tiers);
    const box = document.getElementById('paypal-buttons');
    if (shopConfig.mode === 'fake') {
        // Local runs and demos: no PayPal, the server approves the order as if it were paid.
        box.innerHTML = '<button id="test-pay" class="test-pay-button">Pay (test mode, no money moves)</button>';
        document.getElementById('test-pay').addEventListener('click', async () => {
            try {
                await finishOrder(await createOrder());
            } catch (e) {
                showMessage('checkout-message', e.message, true);
            }
        });
    } else {
        await loadScript(`https://www.paypal.com/sdk/js?client-id=${encodeURIComponent(shopConfig.paypal_client_id)}` +
                         `&currency=${shopConfig.currency}&locale=en_US`);
        paypal.Buttons({
            createOrder: () => createOrder(),
            onApprove: data => finishOrder(data.orderID),
            onError: err => showMessage('checkout-message', 'The payment did not go through: ' + (err.message || err), true),
            style: { color: 'blue', shape: 'pill', label: 'checkout', layout: 'vertical', tagline: false }
        }).render('#paypal-buttons');
    }
    updateCartTotal();
}

document.getElementById('apply-discount').addEventListener('click', async () => {
    appliedCode = document.getElementById('discount-code').value.trim();
    const q = await updateCartTotal();
    if (q && appliedCode) {
        const ok = q.code_status === 'applied';
        showMessage('discount-message', ok ? 'Discount code applied' : 'Invalid code, no discount applied', !ok);
        if (!ok) appliedCode = '';
    }
});

simpleCart.bind('update', scheduleQuote);
initCheckout();
