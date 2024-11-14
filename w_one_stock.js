// Function to generate HTML for a new window
function generateHtmlForRow(row, pathCandle, pathStra) {
    const pathJavaFile = `${row['pine_path_shadow']}`;
    const tradingViewUrl = generateTradingViewPath(row); // Generate the TradingView URL

    // Generate technical pattern info
    const technicalPatternInfo = getTechnicalPatternInfo(row);
    // Path to the TradingView icon
    const twIconPath = getIconPath("_TW_ICO.png") ;

    return `
    <html>
        <head>
            <title>${row['ticker']} - ${row['interval']} - ${row['key_techs']}</title>
            <link rel="icon" href="d_result/icons/_tuisku_favicon.ico">
            <link rel="stylesheet" href="w_wtable.css"> <!-- Link to table styles -->
            <link rel="stylesheet" href="w_one_stock.css"> <!-- Link to one stock styles -->

            <!-- Font Awesome for icons -->
            <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">

            <!-- Prism.js CSS for Java syntax highlighting with Coy theme -->
            <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/prism/1.25.0/themes/prism-coy.min.css">
        </head>
        <body>
            <h1>
                Stock: ${row['ticker']} <img class="big-icon" src="${row['path_ico_big']}" alt="Large icon of ${row['Name']}" >
                - ${row['interval']} - ${row['key_techs']}
            </h1>

            <!-- Add the new <h4> link here -->
            <div>
            <h4 class="h4_url_tw" >
                <a href="${tradingViewUrl}" target="_blank">
                    <img src="${twIconPath}" alt="TW icon" style="width: 1.2em; height:  1.2em; vertical-align: middle;">
                    ${row['Name']} (${row['ticker']})
                </a>
            <h4><p class="h4_url_tw" style="font-style: italic; font-size: 1.2em; align-items: center; justify-content: center;">
               *In TradingView update the candles Time: <span style="font-weight: bold; background-color: yellow;">- ${row['interval']} </span>
            </p></h4>
            <!-- Table with all row data -->
            <table>
                <thead>
                    ${tableHeaders}
                </thead>
                <tbody>
                    ${getTableRowData(row)}
                </tbody>
            </table>

            <!-- Insert technical pattern info here -->
            ${technicalPatternInfo}

            <!-- Images below the table -->
            <div class="image-container">
                ${pathStra ? `<img src="${pathStra}" alt="Strategy Image for ${row['ticker']}">` : ''}
            </div>
            <div class="image-container">
                ${pathCandle ? `<img src="${pathCandle}" alt="Candle Image for ${row['ticker']}">` : ''}
            </div>

                    <!-- Java Code Block with Copy Button -->
            <div class="code-block">
                <div class="code-block-header">
                    <h4>TradingView.com Pine Script™ v5 ${row['ticker']} <img style="width: 1em; height: 1em;" src="${row['path_ico']}" alt="Small icon of ${row['Name']}"> - ${row['interval']} - ${row['key_techs']}</h4>

            <h4>
                <a href="${tradingViewUrl}" target="_blank">Open in TradingView
                    <img src="${twIconPath}"  alt="TW icon" style="width: 1.2em; height:  1.2em; vertical-align: middle;">
                    ${row['Name']} (${row['ticker']})
                </a>
            </h4>
            <p style="font-style: italic; font-size: 1.2em;">*In TW update the candles Time: <span style="font-weight: bold; background-color: yellow;">- ${row['interval']} </span></p>
                    <button class="copy-btn" onclick="copyCode_one_stock_tab()">
                        <i class="fas fa-copy"></i>
                        <div>Copy</div>
                    </button>
                </div>
                <pre><code class="language-java" id="javaCode"></code></pre>
            </div>

            <!-- Prism.js for Java syntax highlighting -->
            <script src="https://cdnjs.cloudflare.com/ajax/libs/prism/1.25.0/prism.min.js"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/prism/1.25.0/components/prism-java.min.js"></script>

            <!-- JavaScript for Copying Code and Loading the Java File -->
            <script>
                document.addEventListener('DOMContentLoaded', function() {
                    // Load the Java file from the server
                    fetch('${pathJavaFile}')
                        .then(response => response.text())
                        .then(code => {
                            // Insert the Java code into the code block
                            const codeBlock = document.getElementById('javaCode');
                            codeBlock.textContent = code;

                            // Re-run Prism.js to apply syntax highlighting
                            Prism.highlightElement(codeBlock);
                        })
                        .catch(err => {
                            console.error('Error loading Java file:', err);
                        });
                });

                function copyCode_one_stock_tab() {
                    const codeBlock = document.getElementById('javaCode');
                    const range = document.createRange();
                    range.selectNode(codeBlock);
                    window.getSelection().removeAllRanges();
                    window.getSelection().addRange(range);
                    document.execCommand('copy');
                    window.getSelection().removeAllRanges();

                    const copyButton = document.querySelector('.copy-btn');
                    const originalText = copyButton.querySelector('div').textContent;
                    copyButton.style.backgroundColor = '#28a745';
                    copyButton.querySelector('div').textContent = 'Copied';

                    setTimeout(() => {
                        copyButton.style.backgroundColor = '';
                        copyButton.querySelector('div').textContent = originalText;
                    }, 3000);
                }
            </script>
        </body>
    </html>
    `;
}




// Variable for table headers (inside <thead>)
const tableHeaders = `
    <tr>
        <th title="${columnTooltips['Price']}">Price</th>
        <th title="${columnTooltips['Name']}">Name</th>
        <th title="${columnTooltips['Time Frame']}">Time frame</th>
        <th title="${columnTooltips['Net Profit ($)']}">Net Profit ($)</th>
        <th title="${columnTooltips['Indicators Name']}">Indicators Name</th> <!-- New Column for Full Indicator Name -->
        <th title="${columnTooltips['Indicators']}">Indicators</th> <!-- Existing column -->
        <th title="${columnTooltips['Index']}">Index</th>
        <th title="${columnTooltips['Symbol']}">Symbol</th>
        <th title="${columnTooltips['Net Profit (%)']}">Net Profit (%)</th>
        <th title="${columnTooltips['Closed Trades']}">Closed Trades</th>
        <th title="${columnTooltips['Win Rate (%)']}">Win Rate (%)</th>
        <th title="${columnTooltips['Profit Factor']}">Profit Factor</th>
        <th title="${columnTooltips['Max Loss ($)']}">Max Loss ($)</th>
        <th title="${columnTooltips['Max Loss (%)']}">Max Loss (%)</th>
        <th title="${columnTooltips['Avg Profit ($)']}">Avg Profit ($)</th>
        <th title="${columnTooltips['Avg Profit (%)']}">Avg Profit (%)</th>
        <th title="${columnTooltips['Avg Bars/Trade']}">Avg Bars/Trade</th>
        <th title="${columnTooltips['Release Date']}">Release Date</th>
        <th title="${columnTooltips['Months Trained']}">Training (Months)</th>
    </tr>
`;


// Variable for table row data (inside <tbody>)
function getTableRowData(row) {
    return `
    <tr>
        <td>${formatCurrency(row['Price'])}</td> <!-- Format as currency -->
        <td>
            ${row['Name']}
            <img src="${row['path_ico']}" class="icon" alt="Icon of ${row['Name']}">
        </td>
        <td>${row['interval']}</td>
        <td>${formatCurrency(row['Net Profit_usd'])}</td> <!-- Format as currency -->
        ${handleFullIndicatorNameColumn(row['key_techs']).outerHTML} <!-- Use the function for Full Indicator Name -->
        <td>${row['key_techs']}</td> <!-- Existing Indicators column -->
        <td>${row['Index']}</td>
        <td>${row['ticker']}</td>
        <td>${formatPercentage(row['Net Profit_per'])}</td> <!-- Format as percentage -->
        <td>${row['Total Closed Trades']}</td>
        <td>${formatPercentage(row['Percent Profitable_per'])}</td> <!-- Format as percentage -->
        <td>${row['Profit Factor']}</td>
        <td>${formatCurrency(row['Max Drawdown_usd'])}</td> <!-- Format as currency -->
        <td>${formatPercentage(row['Max Drawdown_per'])}</td> <!-- Format as percentage -->
        <td>${formatCurrency(row['Avg Trade_usd'])}</td> <!-- Format as currency -->
        <td>${formatPercentage(row['Avg Trade_per'])}</td> <!-- Format as percentage -->
        <td>${row['Avg # Bars in Trades']}</td>
        <td>${row['Release date']}</td>
        <td>${row['months_trained']}</td>
    </tr>
    `;
}


