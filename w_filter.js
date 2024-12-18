
function filterOnlyFreeRows(row, headers, display) {
    const onlyFreeChecked = document.getElementById('onlyFreeCheckbox').checked;

    // Use the ID for the Price column header
    const priceColumn = headers['header-price']; // Use the 'header-price' ID
    const td = row.getElementsByTagName('td')[priceColumn];
    if (td) {
        // Eliminar caracteres no numéricos como $ € & % etc.
        const sanitizedValue = td.textContent.replace(/[^0-9.-]+/g, ''); // Mantiene solo números, puntos y el signo negativo
        // Convierte el valor a número
        const priceValue = parseFloat(sanitizedValue);
        // If the checkbox is checked, only show rows with price 0
        if (onlyFreeChecked && priceValue !== 0) {
            display = false;
        }
    }

    return display;
}
// Function to filter only purchased items (BUY)
// Function to filter only purchased items (BUY) based on the Strategy Chart image path
function filterOnlyBuyRows(row, headers, display) {
    const onlyBuyChecked = document.getElementById('onlyBuyCheckbox').checked;

    // Use the ID for the Strategy Chart column header
    const strategyChartColumn = headers['header-strategy-chart']; // Use the 'header-strategy-chart' ID
    const strategyChartCell = row.getElementsByTagName('td')[strategyChartColumn];
    const img = strategyChartCell.querySelector('img');

    if (!img) {
        return display; // If there's no image, skip this row
    }

    // Extract the src path of the image
    let imgSrc = img.src;

    // Extract the file name from the path (assuming it's the last part of the path)
    let fileName = imgSrc.split('/').pop();

    // Remove "_profit.png" from the file name
    fileName = fileName.replace('_profit.png', '');

    // Replace underscores with ' - ' to match the purchaseInfo format
    const purchaseInfo = fileName.replace(/_/g, ' - ');

    // Encode the purchaseInfo to match the cookie key
    const encodedKey = encodeKey(purchaseInfo);

    // Check if the purchase cookie exists exactly (not using startsWith)
    const cookieExists = document.cookie.split('; ').find(cookie => {
        const [cookieKey] = cookie.split('=');
        return cookieKey.trim() === encodedKey; // Exact match for the key
    });

    // If the checkbox is checked and the cookie doesn't exist, hide the row
    if (onlyBuyChecked && !cookieExists) {
        return false;
    }

    return display;
}


// Update filterTable to include "Only Buy" filter
function filterTable() {
    const table = document.getElementById('dataTable');
    const tr = table.getElementsByTagName('tr');
    let visibleRowCount = 0;

    // Get selected dropdown values and headers
    const selectedFilters = getSelectedFilters();
    const headers = getHeaders();  // Ensure headers contain column names and their indexes
    const filters = getFilterConditions(headers);

    for (let i = 1; i < tr.length; i++) {
        let display = true;

        // Apply dropdown and numeric filters
        display = applyDropdownFilters(tr[i], selectedFilters, headers, display);
        display = applyNumericFilters(tr[i], filters, display);

        // Apply "Only the Free Ones" filter
        display = filterOnlyFreeRows(tr[i], headers, display);

        // Apply "Only Buy" filter
        //display = filterOnlyBuyRows(tr[i], headers, display);

        // Set row visibility
        tr[i].style.display = display ? '' : 'none';

        // Count visible rows
        if (display) visibleRowCount++;
    }

    updateVisibleRowCount(visibleRowCount);
    updateDeselectButtons();
}



function getSelectedFilters() {
    return {
        tickers: $('#tickerDropdown').val() || [],
        intervals: $('#intervalDropdown').val() || [],
        keyTechs: $('#keyTechsDropdown').val() || [],
        releaseDates: $('#releaseDateDropdown').val() || [],
        indexes: $('#indexDropdown').val() || []
    };
}

// Updated getHeaders function to use header IDs instead of text
function getHeaders() {
    return Array.from(document.querySelectorAll('#dataTable th')).reduce((acc, th, index) => {
        const headerId = th.id; // Get the ID instead of the text content
        if (headerId) {
            acc[headerId] = index; // Map header ID to its column index
        }
        return acc;
    }, {});
}

function getFilterConditions(headers) {
  // Use the new IDs for the column headers
  const filters = [
    { column: headers['header-net-profit-usd'], min: parseFloat(document.getElementById('profitUsdMinTextbox').value), max: parseFloat(document.getElementById('profitUsdMaxTextbox').value) },
    { column: headers['header-net-profit-percent'], min: parseFloat(document.getElementById('netProfitPerMinTextbox').value), max: parseFloat(document.getElementById('netProfitPerMaxTextbox').value) },
    { column: headers['header-closed-trades'], min: parseFloat(document.getElementById('totalClosedTradesMinTextbox').value), max: parseFloat(document.getElementById('totalClosedTradesMaxTextbox').value) },
    { column: headers['header-win-rate-percent'], min: parseFloat(document.getElementById('percentProfitablePerMinTextbox').value), max: parseFloat(document.getElementById('percentProfitablePerMaxTextbox').value) },
    { column: headers['header-profit-factor'], min: parseFloat(document.getElementById('profitFactorMinTextbox').value), max: parseFloat(document.getElementById('profitFactorMaxTextbox').value) },
    { column: headers['header-max-loss-usd'], min: parseFloat(document.getElementById('maxDrawdownUsdMinTextbox').value), max: parseFloat(document.getElementById('maxDrawdownUsdMaxTextbox').value) },
    { column: headers['header-max-loss-percent'], min: parseFloat(document.getElementById('maxDrawdownPerMinTextbox').value), max: parseFloat(document.getElementById('maxDrawdownPerMaxTextbox').value) },
    { column: headers['header-avg-profit-usd'], min: parseFloat(document.getElementById('avgTradeUsdMinTextbox').value), max: parseFloat(document.getElementById('avgTradeUsdMaxTextbox').value) },
    { column: headers['header-avg-profit-percent'], min: parseFloat(document.getElementById('avgTradePerMinTextbox').value), max: parseFloat(document.getElementById('avgTradePerMaxTextbox').value) },
    { column: headers['header-avg-bars-trade'], min: parseFloat(document.getElementById('avgBarsInTradesMinTextbox').value), max: parseFloat(document.getElementById('avgBarsInTradesMaxTextbox').value) },
    { column: headers['header-price'], min: parseFloat(document.getElementById('priceMinTextbox').value), max: parseFloat(document.getElementById('priceMaxTextbox').value) },
    { column: headers['header-training-months'], min: parseFloat(document.getElementById('trainingMonthsMinTextbox').value), max: parseFloat(document.getElementById('trainingMonthsMaxTextbox').value) },
    { column: headers['header-trade-activity'], min: parseFloat(document.getElementById('activityPerCandleMinTextbox').value), max: parseFloat(document.getElementById('activityPerCandleMaxTextbox').value) },
    { column: headers['header-n-candles'], min: parseFloat(document.getElementById('nCandlesMinTextbox').value), max: parseFloat(document.getElementById('nCandlesMaxTextbox').value) },
    { column: headers['header-precision-f1-per'], min: parseFloat(document.getElementById('precisionF1PerMinTextbox').value), max: parseFloat(document.getElementById('precisionF1PerMaxTextbox').value) },
    { column: headers['header-tree-deep'], min: parseFloat(document.getElementById('treeDeepMinTextbox').value), max: parseFloat(document.getElementById('treeDeepMaxTextbox').value) }
  ];
  return filters;
}


function applyDropdownFilters(row, selectedFilters, headers, display) {
    const columns = {
        ticker: row.getElementsByTagName('td')[headers['header-symbol']],
        interval: row.getElementsByTagName('td')[headers['header-time-frame']],
        keyTech: row.getElementsByTagName('td')[headers['header-indicators']],
        releaseDate: row.getElementsByTagName('td')[headers['header-release-date']],
        index: row.getElementsByTagName('td')[headers['header-index']]
    };

    return display &&
        applyFilter(columns.ticker, selectedFilters.tickers) &&
        applyFilter(columns.interval, selectedFilters.intervals) &&
        applyFilter(columns.keyTech, selectedFilters.keyTechs) &&
        applyFilter(columns.releaseDate, selectedFilters.releaseDates) &&
        applyFilter(columns.index, selectedFilters.indexes);
}
function applyFilter(column, selectedValues) {
    if (column && selectedValues.length > 0 && selectedValues.includes(column.textContent)){
         return true
    }
        return false;
}

function applyNumericFilters(row, filters, display) {
    filters.forEach(filter => {
        const td = row.getElementsByTagName('td')[filter.column];
        if (td) {
            // Eliminar caracteres no numéricos como $ € & % etc.
            const sanitizedValue = td.textContent.replace(/[^0-9.-]+/g, ''); // Mantiene solo números, puntos y el signo negativo
            // Convierte el valor a número
            const value = parseFloat(sanitizedValue);
            // Aplica los filtros min y max
            if (value < filter.min || value > filter.max) {
                display = false;
            }
        }
    });
    return display;
}

function updateVisibleRowCount(count) {
    document.getElementById('visibleRowCount').textContent = count;
}

// Function to update all Deselect All buttons and associated Select All buttons
function updateDeselectButtons() {
    toggleDeselectButton('#tickerDropdown', '#tickerDeselectAll', '#tickerSelectAll');
    toggleDeselectButton('#intervalDropdown', '#intervalDeselectAll', '#intervalSelectAll');
    toggleDeselectButton('#keyTechsDropdown', '#keyTechsDeselectAll', '#keyTechsSelectAll');
    toggleDeselectButton('#releaseDateDropdown', '#releaseDateDeselectAll', '#releaseDateSelectAll');
    toggleDeselectButton('#indexDropdown', '#indexDeselectAll', '#indexSelectAll');
    console.log("Deselect buttons updated.");
}
// Function to disable or enable the Deselect All button based on selections
function toggleDeselectButton(dropdownId, buttonId, selectAllButtonId) {
  const selectedOptions = $(dropdownId).val() || [];
  const deselectButton = document.querySelector(buttonId);
  const selectAllButton = document.querySelector(selectAllButtonId); // Select All button

  if (selectedOptions.length === 0) {
    deselectButton.disabled = true;
    deselectButton.classList.add('disabled-button');
    deselectButton.style.backgroundColor = '#808080'; // Grey when disabled
    deselectButton.style.color = '#fff'; // White text for contrast

    // Add green outline to Select All button
    selectAllButton.style.outline = '2px solid #FFFF00'; // highlighted in yellow
    console.log(`Deselect button for ${dropdownId} disabled.`);
  } else {
    deselectButton.disabled = false;
    deselectButton.classList.remove('disabled-button');
    deselectButton.style.backgroundColor = ''; // Reset to original background
    deselectButton.style.color = ''; // Reset to original color

    // Remove green outline from Select All button
    selectAllButton.style.outline = ''; // Reset to default
    console.log(`Deselect button for ${dropdownId} enabled.`);
  }
}


// Sort the table based on the clicked column index
function sortTable(columnIndex) {
    const table = document.getElementById('dataTable');
    const tbody = table.getElementsByTagName('tbody')[0];
    const rows = Array.from(tbody.getElementsByTagName('tr'));

    // Remove active sort state from all headers
    const thElements = table.querySelectorAll('th');
    thElements.forEach(th => {
        th.removeAttribute('data-active');
        th.removeAttribute('data-sorted'); // Remove sort direction indicator
    });

    // Determine if we need to sort in ascending or descending order
    const isNumericColumn = !isNaN(rows[0].getElementsByTagName('td')[columnIndex].textContent);
    const isAscending = tbody.getAttribute('data-sorted') !== `col${columnIndex}-asc`;

    // Sort the rows
    rows.sort((a, b) => {
        const aValue = a.getElementsByTagName('td')[columnIndex].textContent.trim();
        const bValue = b.getElementsByTagName('td')[columnIndex].textContent.trim();

        if (isNumericColumn) {
            return isAscending ? parseFloat(aValue) - parseFloat(bValue) : parseFloat(bValue) - parseFloat(aValue);
        } else {
            return isAscending ? aValue.localeCompare(bValue) : bValue.localeCompare(aValue);
        }
    });

    // Clear the table body and re-append the sorted rows
    tbody.innerHTML = '';
    rows.forEach(row => tbody.appendChild(row));

    // Set active column to show the arrow
    const sortedDirection = isAscending ? 'asc' : 'desc';
    thElements[columnIndex].setAttribute('data-active', 'true');
    thElements[columnIndex].setAttribute('data-sorted', sortedDirection);
    console.log(`Column ${columnIndex} sorted in ${sortedDirection} order.`);

    // Toggle the sort direction
    tbody.setAttribute('data-sorted', `col${columnIndex}-${sortedDirection}`);
}

// Function to reset all filters to their original values, including slider updates
function resetFilters() {
    // Reset checkboxes
    document.getElementById('onlyFreeCheckbox').checked = false;
    //document.getElementById('onlyBuyCheckbox').checked = false;

    document.getElementById('onlyFreeCheckbox').checked = false;
    // document.getElementById('onlyBuyCheckbox').checked = false;

    // Reset numeric ranges to their initial values and sliders
    resetRangeWithSlider('profitUsd', 200, 6500000);
    resetRangeWithSlider('price', 0, 140);
    resetRangeWithSlider('netProfitPer', 0.02, 6500);
    resetRangeWithSlider('totalClosedTrades', 3, 1100);
    resetRangeWithSlider('percentProfitablePer', 27, 100);
    resetRangeWithSlider('profitFactor', 1, 35000);
    resetRangeWithSlider('trainingMonths', 5, 105);
    resetRangeWithSlider('maxDrawdownUsd', 190, 38000);
    resetRangeWithSlider('maxDrawdownPer', 0, 4);
    resetRangeWithSlider('avgTradeUsd', 0.5, 2100000);
    resetRangeWithSlider('avgTradePer', 0.01, 51040.36);
    resetRangeWithSlider('avgBarsInTrades', 2, 8000);

    // Reset numeric ranges and sliders for additional filters
    resetRangeWithSlider('activityPerCandle', 0.002, 0.483);
    resetRangeWithSlider('nCandles', 800, 129999);
    resetRangeWithSlider('precisionF1Per', 55, 75.6);
    resetRangeWithSlider('treeDeep', 5, 8);

    // Reset multi-select dropdowns (select all options)
    selectAll('#tickerDropdown');       // Use selectAll() helper method for dropdowns
    selectAll('#intervalDropdown');
    selectAll('#keyTechsDropdown');
    selectAll('#indexDropdown');
    selectAll('#releaseDateDropdown');
    console.log("Filters reset to original values.");
    // Call filterTable to apply the reset values
    filterTable();
}

// Helper function to reset both range inputs and slider values
function resetRangeWithSlider(idPrefix, minValue, maxValue) {
    // Reset the text input fields
    document.getElementById(`${idPrefix}MinTextbox`).value = minValue;
    document.getElementById(`${idPrefix}MaxTextbox`).value = maxValue;

    // Reset the slider bar values
    $(`#slider-range-${idPrefix}`).slider("values", [minValue, maxValue]); // jQuery UI slider
}


//// Event listeners for toggle buttons
//document.getElementById('toggleFilterButton').addEventListener('click', toggleFilterColumn);
//document.getElementById('togglePayButton').addEventListener('click', togglePayContainer);
//
//// Screen resizing function to adjust visibility for both buttons and containers
//function handleResize() {
//    const filterColumn = document.querySelector('.filter-column');
//    const toggleFilterButton = document.getElementById('toggleFilterButton');
//    const payContainer = document.getElementById('paypal-button-container');
//    const togglePayButton = document.getElementById('togglePayButton');
//
//    if (window.innerWidth <= 1000) {
//        // Show buttons, hide containers by default on small screens
//        toggleFilterButton.style.display = 'inline-flex';
//        filterColumn.style.display = 'none';
//
//        togglePayButton.style.display = 'inline-flex';
//        payContainer.style.display = 'none';
//        console.log(`Resized to ${window.innerWidth}px: Hiding filter and PayPal containers.`);
//    } else {
//        // Show containers and hide buttons on larger screens
//        toggleFilterButton.style.display = 'none';
//        filterColumn.style.display = 'block';
//
//        togglePayButton.style.display = 'none';
//        payContainer.style.display = 'block';
//        console.log(`Resized to ${window.innerWidth}px: Showing filter and PayPal containers.`);
//    }
//}
//
//// Run resize handling on load and when the window resizes
//window.addEventListener('resize', handleResize);
//handleResize();
//
//
//// Screen resizing function to adjust visibility based on separate breakpoints
//function handleResize() {
//    const filterColumn = document.querySelector('.filter-column');
//    const toggleFilterButton = document.getElementById('toggleFilterButton');
//    const payContainer = document.getElementById('paypal-button-container');
//    const togglePayButton = document.getElementById('togglePayButton');
//
//    // For filter column elements, resize at 1100px
//    if (window.innerWidth <= 1100) {
//        toggleFilterButton.style.display = 'inline-flex';
//        filterColumn.style.display = 'none';
//    } else {
//        toggleFilterButton.style.display = 'none';
//        filterColumn.style.display = 'block';
//    }
//
//    // For PayPal container elements, resize at 1350px
//    if (window.innerWidth <= 1350) {
//        togglePayButton.style.display = 'inline-flex';
//        payContainer.style.display = 'none';
//    } else {
//        togglePayButton.style.display = 'none';
//        payContainer.style.display = 'block';
//    }
//}



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
                console.log(`OnlyFreeCheckbox synced to ${this.checked}`);
            });

            // Sync function for 'onlyFreeCheckbox_HIDE' to update 'onlyFreeCheckbox'
            onlyFreeCheckbox_HIDE.addEventListener('change', function () {
                onlyFreeCheckbox.checked = this.checked; // Sync the main checkbox
                filterTable(); // Apply filtering
                console.log(`OnlyFreeCheckbox_HIDE synced to ${this.checked}`);
            });
        } else {
            // Retry after a short delay if elements are not yet available
            setTimeout(initCheckboxSync, 900);
        }
    }

    initCheckboxSync(); // Start the initialization check
});


//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
// Initialize a flag to control resize behavior
// Method to check if either filters-container or paypal-button-container is visible
function isAnyContainerShown() {
    const filterColumn = document.getElementById('filters-container');
    const payContainer = document.getElementById('paypal-button-container');

    // Check if either container is currently visible
    const isFilterVisible = filterColumn && filterColumn.style.display === 'block';
    const isPayVisible = payContainer && payContainer.style.display === 'block';

    return isFilterVisible || isPayVisible;
}

let resizeAllowed = true;

// Unified toggle function to manage visibility for filter and PayPal containers
//function toggleVisibility(containerIdToShow, containerIdToHide) {
//    const containerToShow = document.getElementById(containerIdToShow);
//    const containerToHide = document.getElementById(containerIdToHide);
//
//    // Toggle the visibility of the container to show and hide the other container
//    if (containerToShow.style.display === 'block') {
//        containerToShow.style.display = 'none';
//        console.log(`${containerIdToShow} hidden, resizing allowed.`);
//    } else {
//        containerToShow.style.display = 'block';
//        containerToShow.scrollIntoView({ behavior: 'smooth', block: 'start' });
//        console.log(`${containerIdToShow} displayed, resizing disabled.`);
//    }
//    containerToHide.style.display = 'none';
//    console.log(`${containerIdToHide} hidden.`);
//    resizeAllowed = ! isAnyContainerShown()
//
//    // Additional style adjustment for PayPal container on small screens
//    if (containerIdToShow === 'paypal-button-container' && window.innerWidth <= 1000) {
//        containerToShow.style.maxWidth = '95%';
//        containerToShow.style.overflowX = 'auto';
//        containerToShow.style.margin = '0 auto';
//    }
//}

// Toggle visibility of the Filter container
function toggleFilterContainer() {
    const filterColumn = document.getElementById('filters-container');
    const toggleFilterButton = document.getElementById('toggleFilterButton');

    if (filterColumn.style.display === 'block') {
        filterColumn.style.display = 'none';
        console.log("Filter container hidden, resizing allowed.");
    } else {
        filterColumn.style.display = 'block';
        filterColumn.scrollIntoView({ behavior: 'smooth', block: 'start' });
        console.log("Filter container displayed, resizing disabled.");
    }
    resizeAllowed = ! isAnyContainerShown()
}

// Toggle visibility of the PayPal container
function togglePayContainer() {
    const payContainer = document.getElementById('paypal-button-container');
    const togglePayButton = document.getElementById('togglePayButton');

    if (payContainer.style.display === 'block') {
        payContainer.style.display = 'none';
        console.log("PayPal container hidden, resizing allowed.");
    } else {
        payContainer.style.display = 'block';
        payContainer.scrollIntoView({ behavior: 'smooth', block: 'start' });
        console.log("PayPal container displayed, resizing disabled.");
    }
    // Style adjustments for PayPal container on smaller screens
    if (window.innerWidth <= 1000) {
        payContainer.style.maxWidth = '95%';
        payContainer.style.overflowX = 'auto';
        payContainer.style.margin = '0 auto';
    }
    resizeAllowed = ! isAnyContainerShown()
}


// Event listeners setup for buttons to toggle filter and PayPal containers
function setupEventListeners() {
    const toggleFilterButton = document.getElementById('toggleFilterButton');
    const togglePayButton = document.getElementById('togglePayButton');

    // Toggle Filter container
    toggleFilterButton.addEventListener('click', toggleFilterContainer);
    toggleFilterButton.addEventListener('touchstart', (e) => {
        e.preventDefault();
        toggleFilterContainer();
    });

    // Toggle PayPal container
    togglePayButton.addEventListener('click', togglePayContainer);
    togglePayButton.addEventListener('touchstart', (e) => {
        e.preventDefault();
        togglePayContainer();
    });
}

// Adjusting visibility based on screen size with control to prevent unintended resizing
function handleResize() {
    if (!resizeAllowed) {
        console.log("Resize prevented because a container is visible.");
        return;
    }

    const filterColumn = document.getElementById('filters-container');
    const toggleFilterButton = document.getElementById('toggleFilterButton');
    const payContainer = document.getElementById('paypal-button-container');
    const togglePayButton = document.getElementById('togglePayButton');

    // Use document.documentElement.clientWidth for more accurate viewport width
    const viewportWidth = document.documentElement.clientWidth;

    if (viewportWidth > 1350) {
        // Greater than 1350px: Show containers, hide toggle buttons
        toggleFilterButton.style.display = 'none';
        togglePayButton.style.display = 'none';
        filterColumn.style.display = 'block';
        payContainer.style.display = 'block';
        console.log("Width > 1350px - containers displayed, toggle buttons hidden.");

    } else if (viewportWidth <= 1350 && viewportWidth > 1000) {
        // Between 1350px and 1000px: Show togglePayButton, hide payContainer, show filterColumn
        toggleFilterButton.style.display = 'none';
        togglePayButton.style.display = 'inline-flex';
        filterColumn.style.display = 'block';
        payContainer.style.display = 'none';
        console.log("Width between 1350px and 1000px - filter displayed, Pay toggle button shown, Pay container hidden.");

    } else if (viewportWidth <= 1000) {
        // Less than 1000px: Show both toggle buttons, hide both containers
        toggleFilterButton.style.display = 'inline-flex';
        togglePayButton.style.display = 'inline-flex';
        filterColumn.style.display = 'none';
        payContainer.style.display = 'none';
        console.log("Width <= 1000px - containers hidden, both toggle buttons shown.");
    }
}

// Initialize event listeners on DOMContentLoaded and handle resize events with control
document.addEventListener('DOMContentLoaded', () => {
    setupEventListeners();
    handleResize();
    window.addEventListener('resize', () => {
        if (resizeAllowed) handleResize();
    });
});






