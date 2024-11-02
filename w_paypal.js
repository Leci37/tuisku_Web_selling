
let discountCodeRate = 0;  // Global variable to track discount code rate
let allItemsDiscounted = false; // New flag to handle the bolsa_free code
let cartTotal = simpleCart.grandTotal();  // Initial cart total

// Apply discount based on the discount code entered
document.getElementById('apply-discount').addEventListener('click', function() {
    const discountCode = encodeKey(document.getElementById('discount-code').value.trim().toLowerCase());

    // Apply discount based on obfuscated discount code
    switch (discountCode) {
        case 'ZnJlZTIw':  // Encoded value for 'free20'
            discountCodeRate = 0.2;  // 20% discount
            alert('Discount code applied: 20% off');
            allItemsDiscounted = false;  // Reset the bolsa_free effect
            break;
        case 'ZnJlZTMw':  // Encoded value for 'free30'
            discountCodeRate = 0.3;  // 30% discount
            alert('Discount code applied: 30% off');
            allItemsDiscounted = false;
            break;
        case 'ZnJlZTQw':  // Encoded value for 'free40'
            discountCodeRate = 0.4;  // 40% discount
            alert('Discount code applied: 40% off');
            allItemsDiscounted = false;
            break;
        case 'ZnJlZTYw':  // Encoded value for 'free60'
            discountCodeRate = 0.6;  // 60% discount
            alert('Discount code applied: 60% off');
            allItemsDiscounted = false;
            break;
        case 'Ym9sc2FfZnJlZQ':  // Encoded value for 'bolsa_free'
            discountCodeRate = 0;  // Reset the standard discount rate
            allItemsDiscounted = true;  // Set flag for bolsa_free discount
            alert('Discount code applied: All strategies now cost $0.99!');
            break;
        default:
            alert('Invalid discount code. No discount applied.');
            discountCodeRate = 0;  // No discount applied
            allItemsDiscounted = false;  // Reset the bolsa_free effect
    }
    updateCartTotal();
});

// Function to update cart total based on dynamic discounts
function updateCartTotal() {


    let totalAmount = simpleCart.grandTotal();  // Get original total amount
    let discountRate = getDynamicDiscount(totalAmount);  // Get dynamic discount rate based on cart value

    // Combine dynamic discount and discount code
    discountRate += discountCodeRate;  // Add any discount code value to the dynamic discount

    // Check if the bolsa_free discount is applied
    if (allItemsDiscounted) {
        simpleCart.each(function(item) {
            item.set('price', 0.99);  // Set all item prices to $0.99
        });
        discountRate = 0;  // Override other discount rates
        totalAmount = simpleCart.grandTotal();  // Recalculate the new total
    }

    // Calculate the final discounted total
    let discountedTotal = totalAmount * (1 - discountRate);

    // Calculate discount values and update the display
    const originalPriceElement = document.getElementById('original-price-value');
    const discountValueElement = document.getElementById('discount-value');
    const discountPercentageElement = document.getElementById('discount-percentage');

    const discountValue = totalAmount - discountedTotal;  // Calculate the discount value
    const discountPercentage = (discountRate * 100).toFixed(2);  // Calculate the combined discount percentage

    originalPriceElement.innerText = totalAmount.toFixed(2);  // Show the original total amount
    discountValueElement.innerText = discountValue.toFixed(2);  // Show the dollar value of the discount
    discountPercentageElement.innerText = discountPercentage;  // Show the percentage of the discount

    var totalElement = document.getElementById('simpleCart_total');
    var cartTotalElement = document.getElementById('cart-total');
    cartTotalElement.innerHTML = `Total: <span class="simpleCart_total">${discountedTotal.toFixed(2)}</span>`;

    // Show or hide the discount info container based on discount presence
    const discountInfoContainer = document.getElementById('discount-info-container');
    if (discountValue > 0 || allItemsDiscounted) {
        discountInfoContainer.style.display = 'block';  // Show the discount container if discount is applied
    } else {
        discountInfoContainer.style.display = 'none';  // Hide the discount container if no discount is applied
    }
}

// Function to determine the dynamic discount rate based on the cart value
function getDynamicDiscount(totalAmount) {
    let discountRate = 0;  // Default discount is 0%
    if (totalAmount > 2500) {
        discountRate = 0.6;  // 60% discount
    } else if (totalAmount > 1000) {
        discountRate = 0.4;  // 40% discount
    } else if (totalAmount > 800) {
        discountRate = 0.25;  // 25% discount
    } else if (totalAmount > 500) {
        discountRate = 0.2;  // 20% discount
    } else if (totalAmount > 200) {
        discountRate = 0.1;  // 10% discount
    }
    return discountRate;
}

// Bind the updateCartTotal function to the simpleCart 'update' event
simpleCart.bind('update', updateCartTotal);

// Update the PayPal button configuration to reflect the discount changes
paypal.Buttons({
    createOrder: function(data, actions) {
        let totalAmount = simpleCart.grandTotal();  // Get original total amount
        dynamicDiscountRate = getDynamicDiscount(totalAmount);  // Recalculate dynamic discount
        let combinedDiscountRate = discountCodeRate + dynamicDiscountRate;  // Combine all discounts

        let discountedTotal = totalAmount * (1 - combinedDiscountRate);  // Final total with all discounts

        console.info("actions.order.create final discounted total: $" + discountedTotal.toFixed(2));
        return actions.order.create({
            purchase_units: [{
                amount: {
                    value: discountedTotal.toFixed(2)  // Set the PayPal total to the updated discounted amount
                }
            }]
        });
    },
    onApprove: function(data, actions) {
        return actions.order.capture().then(function(details) {
            // Store the relevant payment information in sessionStorage
            const paymentData = {
                orderID: data.orderID,
                payerID: data.payerID,
                paymentID: data.paymentID,
                paymentSource: data.paymentSource,
                facilitatorAccessToken: data.facilitatorAccessToken
            };

            // Save to sessionStorage for use on the thank you page
            sessionStorage.setItem('paymentData', JSON.stringify(paymentData));

            // Redirect to Thank You page after the order is captured
            window.location.href = 'w_thankyou.html';
        });
    },
    onError: function(err) {
        console.error(err);
        alert('An error occurred during the transaction');
    },
    // Add the style parameter to customize the button
    style: {
        color: 'blue',
        shape: 'pill',
        label: 'checkout',
        layout: 'vertical',
        tagline: false
    }
}).render('#paypal-button-container');  // Display PayPal button in the container



// Add event listener to PayPal toggle button
document.getElementById('togglePayButton').addEventListener('click', togglePayContainer);
// Initial cart total update based on existing items
updateCartTotal();
