// Screen resizing function to adjust visibility for both buttons and containers
function handleResize() {
    const filterColumn = document.querySelector('.filter-column');
    const toggleFilterButton = document.getElementById('toggleFilterButton');
    const payContainer = document.getElementById('paypal-button-container');
    const togglePayButton = document.getElementById('togglePayButton');

    console.log("handleResize called. Window width:", window.innerWidth);

    if (window.innerWidth <= 1000) {
        console.log("Small screen detected, hiding containers by default");
        toggleFilterButton.style.display = 'inline-flex';
        filterColumn.style.display = 'none';

        togglePayButton.style.display = 'inline-flex';
        payContainer.style.display = 'none';
    } else {
        console.log("Large screen detected, showing containers by default");
        toggleFilterButton.style.display = 'none';
        filterColumn.style.display = 'block';

        togglePayButton.style.display = 'none';
        payContainer.style.display = 'block';
    }
}

// Run resize handling on load and when the window resizes
window.addEventListener('resize', handleResize);
handleResize();

// Toggle function for filter column
function toggleFilterColumn() {
    const filterColumn = document.querySelector('.filter-column');

    if (filterColumn.style.display === 'block') {
        console.log("Hiding filter column");
        filterColumn.style.display = 'none';
    } else {
        console.log("Showing filter column");
        filterColumn.style.display = 'block';
        filterColumn.scrollIntoView({ behavior: 'smooth', block: 'start' });
    }
}

// Toggle function for PayPal container
function togglePayContainer() {
    const payContainer = document.getElementById('paypal-button-container');

    if (payContainer.style.display === 'block') {
        console.log("Hiding PayPal container");
        payContainer.style.display = 'none';
    } else {
        console.log("Showing PayPal container");
        payContainer.style.display = 'block';
        payContainer.scrollIntoView({ behavior: 'smooth', block: 'start' });

        // Ensure it fits within the screen on small screens
        if (window.innerWidth <= 1000) {
            payContainer.style.maxWidth = '95%';  // Restrict width to avoid overflow
            payContainer.style.overflowX = 'auto'; // Allow horizontal scrolling if necessary
            payContainer.style.margin = '0 auto';  // Center the container
        }
    }
}


// Event listeners for toggle buttons
document.getElementById('toggleFilterButton').addEventListener('click', () => {
    console.log("Filter toggle button clicked");
    toggleFilterColumn();
});

document.getElementById('togglePayButton').addEventListener('click', () => {
    console.log("Pay toggle button clicked");
    togglePayContainer();
});
// Additional setup for logging dropdown interactions
document.querySelectorAll('select[id$="Dropdown"]').forEach(dropdown => {
    dropdown.addEventListener('focus', () => {
        console.log("Dropdown focused:", dropdown.id);
    });
    dropdown.addEventListener('blur', () => {
        console.log("Dropdown blurred:", dropdown.id);
    });
});

// Screen resizing function to adjust visibility based on separate breakpoints
function handleResize() {
    const filterColumn = document.querySelector('.filter-column');
    const toggleFilterButton = document.getElementById('toggleFilterButton');
    const payContainer = document.getElementById('paypal-button-container');
    const togglePayButton = document.getElementById('togglePayButton');

    // For filter column elements, resize at 1100px
    if (window.innerWidth <= 1100) {
        toggleFilterButton.style.display = 'inline-flex';
        filterColumn.style.display = 'none';
    } else {
        toggleFilterButton.style.display = 'none';
        filterColumn.style.display = 'block';
    }

    // For PayPal container elements, resize at 1350px
    if (window.innerWidth <= 1350) {
        togglePayButton.style.display = 'inline-flex';
        payContainer.style.display = 'none';
    } else {
        togglePayButton.style.display = 'none';
        payContainer.style.display = 'block';
    }
}

// Run resize handling on load and when the window resizes
window.addEventListener('resize', handleResize);
handleResize();


// This setup makes both onlyFreeCheckbox and onlyFreeCheckbox_HIDE sync their states as soon as either of them is changed.
document.addEventListener('DOMContentLoaded', function () {
    function initCheckboxSync() {
        const onlyFreeCheckbox = document.getElementById('onlyFreeCheckbox');
        const onlyFreeCheckbox_HIDE = document.getElementById('onlyFreeCheckbox_HIDE');

        if (onlyFreeCheckbox && onlyFreeCheckbox_HIDE) {
            // Sync function for 'onlyFreeCheckbox' to update 'onlyFreeCheckbox_HIDE'
            onlyFreeCheckbox.addEventListener('change', function () {
                onlyFreeCheckbox_HIDE.checked = this.checked; // Sync the hidden checkbox
                filterTable(); // Apply filtering
            });

            // Sync function for 'onlyFreeCheckbox_HIDE' to update 'onlyFreeCheckbox'
            onlyFreeCheckbox_HIDE.addEventListener('change', function () {
                onlyFreeCheckbox.checked = this.checked; // Sync the main checkbox
                filterTable(); // Apply filtering
            });
        } else {
            // Retry after a short delay if elements are not yet available
            setTimeout(initCheckboxSync, 900);
        }
    }

    initCheckboxSync(); // Start the initialization check
});







