// Global Constants
let binCount = 50; // Increased number of bins for a more compact histogram
let inital_count_data = 0;

// Log start of data loading process
console.log("Starting the data loading process...");
// Global variable to store the explanations data
let explanationsData = [];

// Function to load data and initialize the process
function loadData() {
    const csvFilePath = 'd_result/pine_TW_img_info_6_WEB.csv';
    const indicatorCsvFilePath = 'd_result/indicator_tech_explanation.csv'; // Path to explanations CSV

    console.log(`Loading data from ${csvFilePath} and ${indicatorCsvFilePath}...`);
    // Load the indicator explanations
    Papa.parse(indicatorCsvFilePath, {
        download: true,
        header: true,
        complete: function(results) {
            explanationsData = results.data; // Store the entire data in explanationsData
            console.log("Loaded indicator data:", explanationsData);
            populateDropdownWithIndicators('#keyTechsDropdown', explanationsData); // Call the new method
        },
        error: function(error) {
            console.error("Error loading indicator CSV:", error);
        }
    });

    Papa.parse(csvFilePath, {
        download: true,
        header: true,
        complete: function(results) {
            console.log("Data loaded successfully.");
            const data = results.data;

            inital_count_data = data.length;

            initializeDropdowns(data);
            initializeHistograms(data);
            populateTable(data);
            triggerPostLoadActions();
        },
        error: function(error) {
            console.error("Error loading CSV file:", error);
        }
    });
}

// Function to initialize dropdowns
function initializeDropdowns(data) {
    console.log("Extracting unique values for dropdowns...");

    // Get unique ticker-name pairs
    const tickerNamePairs = getUniqueTickerNamePairs(data);

    console.log("Populating dropdowns...");
    populateDropdownWithNamesAndTickers('#tickerDropdown', tickerNamePairs);

    // Get unique Indicator pairs (new logic for indicators)
    const uniqueIndicatorPairs = getUniqueIndicatorPairs(data);
    populateDropdownWithIndicators('#keyTechsDropdown', uniqueIndicatorPairs); // Populate the Indicators dropdown

    // Continue populating other dropdowns as normal
    const uniqueIntervals = getUniqueValues(data, 'interval');
    const uniqueReleaseDates = getUniqueValues(data, 'Release date');
    const uniqueIndex = getUniqueValues(data, 'Index');

    populateDropdown('#intervalDropdown', uniqueIntervals);
    populateDropdown('#releaseDateDropdown', uniqueReleaseDates);
    populateDropdown('#indexDropdown', uniqueIndex);

    initializeSelectFields();
}

// Function to get unique values from a column
function getUniqueValues(data, column) {
    return [...new Set(data.map(row => row[column]).filter(v => v))];
}

// Function to populate dropdowns
function populateDropdown(dropdownId, items) {
    const dropdown = document.querySelector(dropdownId);
    dropdown.innerHTML = ''; // Clear previous options
    items.forEach(item => {
        const option = document.createElement('option');
        option.value = item;
        option.text = item;
        dropdown.appendChild(option);
    });
    console.log(`${dropdownId} populated with ${items.length} items.`);
}

// Initialize fSelect and select all options
function initializeSelectFields() {
    console.log("Initializing fSelect for dropdowns...");
    ['#tickerDropdown', '#intervalDropdown', '#keyTechsDropdown', '#releaseDateDropdown', '#indexDropdown'].forEach(dropdown => {
        $(dropdown).fSelect();
        selectAll(dropdown);
    });
}

// Select all options in dropdown
function selectAll(dropdownId) {
    console.log(`Selecting all options in ${dropdownId}...`);
    $(dropdownId).find('option').prop('selected', true);
    $(dropdownId).fSelect('reload'); // Reload fSelect to reflect the selected options
    filterTable(); // Update the table with the selected values
}

// Function to initialize and generate histograms
function initializeHistograms(data) {
    console.log("Generating histograms...");
    const profitUsdValues = extractNumericColumn(data, 'Net Profit_usd');
    const priceValues = extractNumericColumn(data, 'Price');
    const trainingMonthsValues = extractNumericColumn(data, 'months_trained');

    const histogramDataProfit = generateHistogram(profitUsdValues, binCount, 200, 6500000 / 30 );// 30 only visual
    const histogramDataPrice = generateHistogram(priceValues, binCount, 0, 140);
    const histogramDataTrainingMonths = generateHistogram(trainingMonthsValues, binCount, 5, 105);

    updateHistogram(0, 6500000 , 'profitUsd', histogramDataProfit); // 30 only visual
    updateHistogram(0, 140, 'price', histogramDataPrice);
    updateHistogram(5, 105, 'trainingMonths', histogramDataTrainingMonths);
}

// Extract numeric values from a column
function extractNumericColumn(data, column) {
    return data.map(row => parseFloat(row[column])).filter(v => !isNaN(v));
}

// Main function to populate the table
//// Main function to populate the table
//function populateTable(data) {
//    const tableBody = document.querySelector('#dataTable tbody');
//    tableBody.innerHTML = ''; // Clear previous table data
//
//    console.log("Populating the table with data...");
//    data.forEach(row => {
//        const tr = document.createElement('tr');
//        tr.classList.add('simpleCart_shelfItem');
//
//        // Define the order of columns including the new Shop column
//        const columns = [
//            'Shop', 'Price', 'Name', 'interval', 'path_stra', 'path_candle',
//            'Net Profit_usd','Full Indicator Name', 'key_techs', 'Index', 'ticker', 'Net Profit_per',
//            'Total Closed Trades', 'Percent Profitable_per', 'Profit Factor',
//            'Max Drawdown_usd', 'Max Drawdown_per', 'Avg Trade_usd', 'Avg Trade_per',
//            'Avg # Bars in Trades', 'Release date', 'months_trained',  'Trade Activity Per Candle','n_candles', 'Precision f1_per', 'Tree Deep'
//        ];
//
//        // Loop through columns and generate table cells
//        columns.forEach(key => {
//            let td;
//
//            if (key === 'Shop') {
//                const price = parseFloat(row['Price']); // Ensure price is numeric
//                td = handleShopColumn(row, price);
//            }
//            else if (key === 'Name') {
//                td = handleNameColumn(row);
//            }
//            else if (key === 'path_candle' || key === 'path_stra') {
//                td = handleImageColumn(row, key);
//            }
//            else if (key === 'Price' || key.includes('usd')) {
//                td = document.createElement('td');
//                td.textContent = formatCurrency(row[key]);
//            }
//            else if (key.includes('per')) {
//                td = document.createElement('td');
//                td.textContent = formatPercentage(row[key]);
//            }
//            else if (key === 'key_techs') {
//                td = handleKeyTechsColumn(row); // Use the function for key_techs
//            }
//            else if (key === 'Full Indicator Name') {
//                td = handleFullIndicatorNameColumn(row['key_techs']); // Use the new function for Full Indicator Name
//            }
//            else {
//                td = document.createElement('td');
//                td.textContent = row[key] !== undefined ? row[key] : 'N/A';
//            }
//
//            tr.appendChild(td);
//        });
//
//        tableBody.appendChild(tr);
//    });
//    console.log("Table populated successfully.");
//    initializeColumnToggleHideColumns();
//}


// Main function to populate the table
function populateTable(data) {
    const tableBody = document.querySelector('#dataTable tbody');
    tableBody.innerHTML = ''; // Clear previous table data
    const loadingMessage = document.getElementById('loadingMessage');

    console.log("Populating the table with data...");

    // Show loading message with fade-in effect
    loadingMessage.classList.add('fade-in');
    loadingMessage.style.display = 'block';

    const fragment = document.createDocumentFragment();
    let chunkSize = 20;
    const initialChunkSize = 20;
    const subsequentChunkSize = 100;
    let index = 0;

    function processChunk() {
        const end = Math.min(index + chunkSize, data.length);

        for (let i = index; i < end; i++) {
            const row = data[i];
            const tr = document.createElement('tr');
            tr.classList.add('simpleCart_shelfItem');

            const columns = [
                'Shop', 'Price', 'Name', 'interval', 'path_stra', 'path_candle',
                'Net Profit_usd', 'Full Indicator Name', 'key_techs', 'Index', 'ticker', 'Net Profit_per',
                'Total Closed Trades', 'Percent Profitable_per', 'Profit Factor',
                'Max Drawdown_usd', 'Max Drawdown_per', 'Avg Trade_usd', 'Avg Trade_per',
                'Avg # Bars in Trades', 'Release date', 'months_trained', 'Trade Activity Per Candle', 'n_candles', 'Precision f1_per', 'Tree Deep'
            ];

            columns.forEach(key => {
                let td;
                if (key === 'Shop') {
                    const price = parseFloat(row['Price']);
                    td = handleShopColumn(row, price);
                } else if (key === 'Name') {
                    td = handleNameColumn(row);
                } else if (key === 'path_candle' || key === 'path_stra') {
                    td = handleImageColumn(row, key);
                } else if (key === 'Price' || key.includes('usd')) {
                    td = document.createElement('td');
                    td.textContent = formatCurrency(row[key]);
                } else if (key.includes('per')) {
                    td = document.createElement('td');
                    td.textContent = formatPercentage(row[key]);
                } else if (key === 'key_techs') {
                    td = handleKeyTechsColumn(row);
                } else if (key === 'Full Indicator Name') {
                    td = handleFullIndicatorNameColumn(row['key_techs']);
                } else {
                    td = document.createElement('td');
                    td.textContent = row[key] !== undefined ? row[key] : 'N/A';
                }
                tr.appendChild(td);
            });
            fragment.appendChild(tr);
        }

        index += chunkSize;

        if (index < data.length) {
            if (index === initialChunkSize) {
                chunkSize = subsequentChunkSize;
            }
            loadingMessage.textContent = `Loading data... (${index} of ${data.length} items loaded)`;
            requestAnimationFrame(processChunk);
        } else {
            tableBody.appendChild(fragment);
            console.log("Table populated successfully.");

            loadingMessage.classList.replace('fade-in', 'fade-out');
            setTimeout(() => {
                loadingMessage.style.display = 'none';
                loadingMessage.classList.remove('fade-out');
            }, 300);

            initializeColumnToggleHideColumns();
        }
    }

    processChunk();
}



//NNNNNNNNNNNNNNNNNNNNNNN
// Function to handle the key_techs column and add tooltip
function handleKeyTechsColumn(row) {
    const td = document.createElement('td');
    const keyTech = row['key_techs'] || 'N/A'; // Fallback if key_techs is missing

    // Find the matching explanation from explanationsData
    const explanationRow = explanationsData.find(explanationRow => explanationRow['Key'] === keyTech);

    // Extract relevant data from explanationRow
    const explanation = explanationRow ? explanationRow['Explanation'] : 'No explanation available'; // Default text
    const tradingViewUrl = explanationRow ? explanationRow['Traderview URL Indicator'] : '#'; // Default to '#' if not available
    const fullIndicatorName = explanationRow ? explanationRow['Full Indicator Name'] : keyTech; // Fallback to keyTech if full name is missing
    let keyCombination = explanationRow ? explanationRow['Key Combination'] : keyTech; // Fallback to keyTech if full name is missing

    // Check if the keyCombination contains "|", if so, add the "Composed by:" text and replace | with ", "
    if (keyCombination.includes('|')) {
        keyCombination = "Composed by: " + keyCombination.replace(/\|/g, ', ');
    }

    // Create a link element to wrap the keyTech/Full Indicator Name
    const link = document.createElement('a');
    if (tradingViewUrl && tradingViewUrl.startsWith('http'))
        link.href = tradingViewUrl;
    link.textContent = keyTech; // Or fullIndicatorName;
    link.classList.add('tooltip-keytech'); // Add a class for potential styling
    link.setAttribute('title', keyCombination + ": \n" + explanation); // Add the explanation as a tooltip
    link.setAttribute('target', '_blank'); // Open in a new tab

    // Append the link to the table cell
    td.appendChild(link);

    return td;
}

function handleFullIndicatorNameColumn(row_key_techs) {
    const td = document.createElement('td');
    td.classList.add('full-indicator-name'); // Add the CSS class for proper styling

    const keyTech = row_key_techs || 'N/A'; // Fallback if key_techs is missing   row['key_techs']

    // Find the matching explanation from explanationsData
    const explanationRow = explanationsData.find(explanationRow => explanationRow['Key'] === keyTech);

    // Extract relevant data from explanationRow
    const explanation = explanationRow ? explanationRow['Explanation'] : 'No explanation available'; // Default text
    const tradingViewUrl = explanationRow ? explanationRow['Traderview URL Indicator'] : '#'; // Default to '#' if not available
    const fullIndicatorName = explanationRow ? explanationRow['Full Indicator Name'] : keyTech; // Fallback to keyTech if full name is missing
    let keyCombination = explanationRow ? explanationRow['Key Combination'] : keyTech; // Fallback to keyTech if full name is missing

    // Check if the keyCombination contains "|", if so, add the "Composed by:" text and replace | with ", "
    if (keyCombination.includes('|')) {
        keyCombination = "Composed by: " + keyCombination.replace(/\|/g, ', ');
    }

    // Create a link element to wrap the Full Indicator Name
    const link = document.createElement('a');
    if (tradingViewUrl && tradingViewUrl.startsWith('http')) {
        link.href = tradingViewUrl;
    }
    link.textContent = fullIndicatorName;
    link.classList.add('tooltip-keytech'); // Add a class for potential styling
    link.setAttribute('title', keyCombination + ": \n" + explanation); // Add the explanation as a tooltip
    link.setAttribute('target', '_blank'); // Open in a new tab

    // Append the link to the table cell
    td.appendChild(link);

    return td;
}







// Function to trigger actions after data load
function triggerPostLoadActions() {
    console.log("Triggering post-load actions...");
    filterTable();
    updateHistogramOpacity(0, 6500000, 'profitUsd');
    updateHistogramOpacity(1.00, 140, 'price');
    updateHistogramOpacity(0, 400, 'trainingMonths');
    document.getElementById('visibleRowCount').textContent = inital_count_data;
}

// Get unique Name, Ticker, and Icon pairs
function getUniqueTickerNamePairs(data) {
    const uniquePairs = {};
    data.forEach(row => {
        const ticker = row['ticker'];
        const name = row['Name'];
        const iconPath = row['path_ico'];  // Extract icon path

        if (!uniquePairs[ticker]) {
            uniquePairs[ticker] = { name: name, iconPath: iconPath };  // Associate ticker with name and icon
        }
    });
    return uniquePairs;
}

function getUniqueIndicatorPairs(data) {
    const uniqueIndicators = {};

    // Loop through data to populate indicators
    data.forEach(row => {
        const keyTech = row['key_techs'];
        const explanationRow = explanationsData.find(explanationRow => explanationRow['Key'] === keyTech);

        // Get full indicator name or default to keyTech
        const fullIndicatorName = explanationRow ? explanationRow['Full Indicator Name'] : keyTech;

        // Create the combined text without HTML tags
        const displayText = `${keyTech}  -  ${fullIndicatorName}`;

        // Store in the uniqueIndicators object
        if (!uniqueIndicators[keyTech]) {
            uniqueIndicators[keyTech] = displayText;
        }
    });

    return uniqueIndicators;
}




// Populate dropdown with {SVG Icon} {Name} ({ticker}) display
// Populate dropdown with {SVG Icon} {Name} ({ticker}) display
function populateDropdownWithNamesAndTickers(dropdownId, tickerNamePairs) {
    const dropdown = document.querySelector(dropdownId);
    dropdown.innerHTML = ''; // Clear previous options

    Object.keys(tickerNamePairs).forEach(ticker => {
        const option = document.createElement('option');
        option.value = ticker;

        // Generate the CSS class name for the mosaic icon based on the ticker
        const tickerClassMosaic = `icon-${ticker}_18x18`;

        // Create a span element with the mosaic class instead of an img element
        const iconSpan = `<span class="${tickerClassMosaic}" style="width: 18px; height: 18px; vertical-align: middle; margin-right: 1px; display: inline-block;"></span>`;

        // Set the option's innerHTML to include the icon and ticker name
        option.innerHTML = `${iconSpan} ${tickerNamePairs[ticker].name} (${ticker})`;

        dropdown.appendChild(option);
    });
    console.log(`${dropdownId} populated with ${Object.keys(tickerNamePairs).length} items.`);
}
function populateDropdownWithIndicators(dropdownId, indicatorPairs) {
    const dropdown = document.querySelector(dropdownId);
    dropdown.innerHTML = ''; // Clear previous options

    Object.keys(indicatorPairs).forEach(keyTech => {
        const option = document.createElement('option');
        option.value = keyTech;
        option.text = indicatorPairs[keyTech]; // Set the display text (e.g., "1BOL - Bollinger RSI Double Strategy")
        dropdown.appendChild(option);
    });

    console.log(`${dropdownId} populated with ${Object.keys(indicatorPairs).length} indicators.`);
}



