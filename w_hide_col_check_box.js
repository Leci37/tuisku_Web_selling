const columnTooltips = {
    "Shop": "This column contains a link to the shop or service where the trading view script can be purchased or accessed. Typically hosted on platforms like TradingView or other strategy marketplaces.",
    "Price": "Displays the price in dollars for the trading view script or strategy, indicating the cost of accessing this strategy.",
    "Name": "The name or identifier of the trading view strategy or indicator, often indicative of the technical method used, like 'Triple Moving Average' or 'RSI Strategy'.",
    "Time Frame": "Specifies the time interval for the trading strategy, such as 1d for 1 day or 4h for 4 hours. Defines how frequently new data points are generated in the strategy.",
    "Strategy Chart": "Link or image showing the strategy's chart representation, including plotted indicators and signals for visual analysis.",
    "Candle Chart": "Provides a link or image of the candle chart, showing price movements over specific time intervals based on the strategy.",
    "Net Profit ($)": "Represents the net profit in dollars generated by the strategy after gains and losses are accounted for over the specified period.",
    "Indicators Name": "Names of the indicator(s) used in the strategy, providing insight into the technical analysis methods applied.",
    "Indicators": "Specific indicators or technical signals used within the strategy, often with parameter settings to help signal trade actions.",
    "Index": "Specifies the trading index or market, like NASDAQ or BINANCE, where the strategy is applied. This helps contextualize the strategy’s market.",
    "Symbol": "Ticker symbol of the asset (e.g., AAPL for Apple or BTCUSD for Bitcoin/USD), identifying the specific asset the strategy targets.",
    "Net Profit (%)": "Shows the percentage net profit achieved by the strategy, helpful for comparing strategy profitability across assets and periods.",
    "Closed Trades": "Indicates the total count of closed trades in the strategy’s timeframe, showing how active the strategy is.",
    "Win Rate (%)": "Displays the percentage of trades that were profitable, helping gauge the strategy’s success in producing profitable trades.",
    "Profit Factor": "The ratio of gross profit to gross loss, which helps evaluate the strategy's overall profitability. A value above 1 indicates profitability.",
    "Max Loss ($)": "Maximum dollar loss incurred in a single trade or across trades within the strategy, helping assess potential financial risk.",
    "Max Loss (%)": "Largest percentage drop (drawdown) experienced in a trade, reflecting the maximum loss risk in percentage terms.",
    "Avg Profit ($)": "Average profit per trade in dollars, providing insight into the reward side of the strategy's risk-reward balance.",
    "Avg Profit (%)": "Average profit per trade in percentage, showing the expected return on each trade based on past performance.",
    "Avg Bars/Trade": "Shows the average number of bars (time intervals) that each trade is open. Useful for understanding the average trade duration.",
    "Release Date": "The date when the strategy was published or released, helpful for users looking for new or established strategies.",
    "Months Trained": "Number of months the strategy or model has been back-tested or trained on historical data to improve its accuracy and performance.",
    "Trades Per Candle": "The average number of trades executed per candle or time interval, indicating the strategy's activity level.",
    "Numbers Candles": "Total count of candles used in the analysis or training period, providing an idea of the data volume backing the strategy.",
    "Precision f1 (%)": "The F1 score metric (percentage) indicating the accuracy of trades or signals made by the strategy, used to evaluate precision in classification.",
    "Tree Deep": "Represents the depth of the decision tree model (if used). Higher depth indicates greater model complexity, affecting decision making."
};

// Responsive breakpoints for hiding specific columns based on screen size
// Responsive breakpoints for hiding specific columns based on screen size
const responsiveBreakpoints = [
    // { width: 2700, columns: [26] }, // Tree Deep
    // { width: 2600, columns: [25] }, // Precision f1 (%)
    // { width: 2500, columns: [24] }, // Numbers Candles
    { width: 2400, columns: [23] }, // Trades Per Candle
    // { width: 2300, columns: [22] }, // Months Trained
    // { width: 2200, columns: [21] }, // Release Date
    { width: 2100, columns: [20] }, // Avg Bars/Trade
    { width: 2000, columns: [19] }, // Avg Profit (%)
    { width: 1900, columns: [18] }, // Avg Profit ($)
    // { width: 1800, columns: [17] }, // Max Loss (%)
    // { width: 1700, columns: [16] }, // Max Loss ($)
    // { width: 1600, columns: [15] }, // Profit Factor
    { width: 1500, columns: [14] }, // Win Rate (%)
    { width: 1400, columns: [13] }, // Closed Trades
    { width: 1300, columns: [12] }, // Net Profit (%)
    // { width: 1200, columns: [11] }, // Symbol
    { width: 1100, columns: [10] }, // Index
    // { width: 1000, columns: [9] },  // Indicators
    { width: 700, columns: [8] },   // Indicators Name
    { width: 500, columns: [7] },   // Net Profit ($)
    { width: 750, columns: [6] },   // Candle Chart
    // { width: 600, columns: [5] },   // Strategy Chart
    { width: 700, columns: [4] },   // Time Frame
    // { width: 400, columns: [3] },   // Name
    { width: 200, columns: [2] },   // Price
];



// Main function to initialize the column toggle functionality
function initializeColumnToggleHideColumns() {
    initializeColumnCheckboxes();
    bindCheckboxEvents();
    applyResponsiveColumnHiding(); // Apply responsive hiding based on screen size
}

// Function to initialize checkboxes based on table headers
// Function to initialize checkboxes based on table headers
function initializeColumnCheckboxes() {
    const tableHeaders = $('#dataTable th');
    const checkboxContainer = $('#column-toggle-container');
    checkboxContainer.empty(); // Clear the container

    // List of columns that should not have checkboxes (like "Shop")
    const excludedColumns = ['Shop'];

    // List of columns that should be unchecked by default, prioritized for hiding
    const uncheckedColumns = [
        'Indicators', 'Symbol', 'Max Loss ($)', 'Max Loss (%)', 'Profit Factor',
        'Avg Bars/Trade', 'Numbers candles', 'Months trained', 'Release Date',
        'Months Trained', 'Numbers Candles', 'Precision f1 (%)', 'Tree Deep'
    ];

    // Determine which columns should be visible based on screen width
    const screenWidth = $(window).width();
    let visibleColumns = Array.from({ length: tableHeaders.length }, (_, i) => true);

    // Loop through breakpoints to hide columns as per screen size
    responsiveBreakpoints.forEach(({ width, columns }) => {
        if (screenWidth < width) {
            columns.forEach(index => {
                visibleColumns[index - 1] = false; // Set visibility to false based on 1-based index
            });
        }
    });

    tableHeaders.each(function(index) {
        const columnName = $(this).text();

        // Skip generating a checkbox for the "Shop" column
        if (excludedColumns.includes(columnName)) return;

        // Check if column is visible based on the screen width and default unchecked list
        const isVisible = visibleColumns[index] && !uncheckedColumns.includes(columnName);

        // Create a div to wrap the checkbox and label
        const checkboxWrapper = createCheckboxWrapper(index, columnName, isVisible);

        // Append the wrapper div to the container
        checkboxContainer.append(checkboxWrapper);

        // Set initial visibility of the column based on checkbox state
        toggleColumnVisibility(index, isVisible, false);
    });
}



// Function to create a checkbox wrapper with initial visibility state
function createCheckboxWrapper(index, columnName, isChecked) {
    const checkboxWrapper = $('<div>', { class: 'checkbox-wrapper' });

    const checkbox = $('<input>', {
        type: 'checkbox',
        id: `column-toggle-${index}`,
        'data-column-index': index,
        checked: isChecked // Set initial checked state based on visibility
    });

    const label = $('<label>', {
        for: `column-toggle-${index}`,
        text: columnName,
        title: columnTooltips[columnName] || "No description available" // Set tooltip based on column name
    });

    // Append the checkbox and label inside the wrapper div
    checkboxWrapper.append(checkbox).append(label);

    return checkboxWrapper;
}



// Function to bind the checkbox change events to show/hide columns
function bindCheckboxEvents() {
    $('#column-toggle-container input[type="checkbox"]').change(function() {
        const columnIndex = $(this).data('column-index');
        toggleColumnVisibility(columnIndex, $(this).is(':checked'), true);
        saveColumnPreferences();
    });
}

// Array to store the visibility state of columns toggled by the user
const userToggledColumns = {};

// Function to apply responsive column hiding based on breakpoints, considering user toggles
function applyResponsiveColumnHiding() {
    $(window).resize(() => {
        const width = $(window).width();
        responsiveBreakpoints.forEach(({ width: breakpoint, columns }) => {
            columns.forEach(columnIndex => {
                // Check if the column has been manually toggled by the user
                if (userToggledColumns[columnIndex] !== undefined) return;

                const th = $(`#dataTable th:nth-child(${columnIndex})`);
                const td = $(`#dataTable td:nth-child(${columnIndex})`);
                if (width < breakpoint) {
                    th.hide();
                    td.hide();
                } else {
                    th.show();
                    td.show();
                }
            });
        });
    }).resize(); // Trigger initial resize event
}

// Modified toggleColumnVisibility to update userToggledColumns state
function toggleColumnVisibility(columnIndex, isVisible, highlight) {
    const th = $(`#dataTable th:nth-child(${columnIndex + 1})`);
    const td = $(`#dataTable td:nth-child(${columnIndex + 1})`);

    if (isVisible) {
        th.show();
        td.show();
        userToggledColumns[columnIndex] = true;  // Mark as manually toggled to show
        if (highlight) {
            th.css({ backgroundColor: '#FFA07A' });
            td.css({ backgroundColor: '#FFF9C4' });
            setTimeout(() => {
                th.css({ transition: 'background-color 3.5s', backgroundColor: '' });
                td.css({ transition: 'background-color 3.5s', backgroundColor: '' });
            }, 0);
        }
    } else {
        th.hide();
        td.hide();
        delete userToggledColumns[columnIndex];  // Remove manual toggle state
    }
}




function saveColumnPreferences() {
    const preferences = {};
    $('#column-toggle-container input[type=checkbox]').each(function() {
        preferences[$(this).data('column-index')] = $(this).is(':checked');
    });
    localStorage.setItem('columnPreferences', JSON.stringify(preferences));
}

function loadColumnPreferences() {
    const preferences = JSON.parse(localStorage.getItem('columnPreferences'));
    if (preferences) {
        $.each(preferences, function(index, isVisible) {
            $(`#column-toggle-${index}`).prop('checked', isVisible).trigger('change');
        });
    }
}

// Call save function whenever a checkbox changes
$('#column-toggle-container input[type=checkbox]').on('change', saveColumnPreferences);

// Ensure user toggles are applied on page load
$(document).ready(function() {
    loadColumnPreferences();
    initializeColumnToggleHideColumns();
    applyResponsiveColumnHiding();
});
