//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: ADX_and_DI
// ID_model: MDB_30Min_1ADX_5a883878 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MDB_30Min_1ADX_5a883878", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MDB_30Min_5a883878(dx, directionalMovementMinus, diPlus, smoothedDirectionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedTrueRange, directionalMovementPlus, diMinus, adx)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( directionalMovementPlus <= 0.463392 )
		if( smoothedDirectionalMovementMinus <= 1.59333 )
			if( diPlus <= 5.82928 )
				if( smoothedDirectionalMovementMinus <= 0.397441 )
					if( directionalMovementMinus <= 0.009149 )
						if( dx <= 78.6394 )
							ret := 0.344828
						if( dx > 78.6394 )
							ret := -0.310345
					if( directionalMovementMinus > 0.009149 )
						if( smoothedDirectionalMovementMinus <= 0.111786 )
							ret := 0.250000
						if( smoothedDirectionalMovementMinus > 0.111786 )
							ret := 0.857143 // buy
				if( smoothedDirectionalMovementMinus > 0.397441 )
					if( directionalMovementMinus <= 1.8505 )
						if( adx <= 70.6803 )
							ret := 0.139881
						if( adx > 70.6803 )
							ret := -0.330000
					if( directionalMovementMinus > 1.8505 )
						if( smoothedDirectionalMovementPlus <= 0.03227 )
							ret := -0.291667
						if( smoothedDirectionalMovementPlus > 0.03227 )
							ret := 0.722689 // buy
			if( diPlus > 5.82928 )
				if( diPlus <= 56.8924 )
					if( adx <= 76.0703 )
						if( trueRange <= 0.489747 )
							ret := -0.016244
						if( trueRange > 0.489747 )
							ret := 0.060672
					if( adx > 76.0703 )
						if( smoothedDirectionalMovementMinus <= 0.355371 )
							ret := -0.044118
						if( smoothedDirectionalMovementMinus > 0.355371 )
							ret := -0.656000
				if( diPlus > 56.8924 )
					if( smoothedDirectionalMovementMinus <= 0.085357 )
						if( trueRange <= 1.74704 )
							ret := -0.013333
						if( trueRange > 1.74704 )
							ret := 1.000000 // buy
					if( smoothedDirectionalMovementMinus > 0.085357 )
						if( dx <= 85.4686 )
							ret := 0.862069 // buy
						if( dx > 85.4686 )
							ret := -0.066667
		if( smoothedDirectionalMovementMinus > 1.59333 )
			if( diMinus <= 36.3418 )
				if( diMinus <= 27.0427 )
					if( smoothedTrueRange <= 7.05698 )
						if( directionalMovementMinus <= 0.075116 )
							ret := 0.400000
						if( directionalMovementMinus > 0.075116 )
							ret := -0.612903
					if( smoothedTrueRange > 7.05698 )
						if( diPlus <= 26.16 )
							ret := 0.111111
						if( diPlus > 26.16 )
							ret := 0.806452 // buy
				if( diMinus > 27.0427 )
					if( directionalMovementMinus <= 3.46143 )
						if( dx <= 71.1917 )
							ret := -0.507865
						if( dx > 71.1917 )
							ret := 0.500000
					if( directionalMovementMinus > 3.46143 )
						if( dx <= 4.41517 )
							ret := 0.722222 // buy
						if( dx > 4.41517 )
							ret := -0.207317
			if( diMinus > 36.3418 )
				if( adx <= 66.2075 )
					if( smoothedDirectionalMovementPlus <= 0.952169 )
						if( trueRange <= 22.2707 )
							ret := 0.091736
						if( trueRange > 22.2707 )
							ret := -0.846154 // sell
					if( smoothedDirectionalMovementPlus > 0.952169 )
						if( directionalMovementMinus <= 9.95353 )
							ret := -0.272059
						if( directionalMovementMinus > 9.95353 )
							ret := -0.829268 // sell
				if( adx > 66.2075 )
					if( directionalMovementMinus <= 1.09623 )
						if( trueRange <= 1.73497 )
							ret := -0.136364
						if( trueRange > 1.73497 )
							ret := -0.908257 // sell
					if( directionalMovementMinus > 1.09623 )
						if( diMinus <= 43.9075 )
							ret := -0.692308
						if( diMinus > 43.9075 )
							ret := 0.217949
	if( directionalMovementPlus > 0.463392 )
		if( smoothedDirectionalMovementMinus <= 2.83098 )
			if( smoothedTrueRange <= 6.98888 )
				if( dx <= 9.25987 )
					if( diMinus <= 23.3354 )
						if( adx <= 28.594 )
							ret := 0.435424
						if( adx > 28.594 )
							ret := 0.055556
					if( diMinus > 23.3354 )
						if( diPlus <= 33.2324 )
							ret := -0.072097
						if( diPlus > 33.2324 )
							ret := 0.333333
				if( dx > 9.25987 )
					if( dx <= 15.023 )
						if( diPlus <= 25.8791 )
							ret := -0.368696
						if( diPlus > 25.8791 )
							ret := -0.116667
					if( dx > 15.023 )
						if( directionalMovementMinus <= 1.15303 )
							ret := -0.076885
						if( directionalMovementMinus > 1.15303 )
							ret := 0.280899
			if( smoothedTrueRange > 6.98888 )
				if( adx <= 33.9368 )
					if( adx <= 19.591 )
						ret := 0.708333 // buy
					if( adx > 19.591 )
						if( smoothedTrueRange <= 7.3373 )
							ret := -1.000000 // sell
						if( smoothedTrueRange > 7.3373 )
							ret := -0.340909
				if( adx > 33.9368 )
					if( smoothedDirectionalMovementPlus <= 5.62863 )
						if( smoothedTrueRange <= 8.19958 )
							ret := 0.607843
						if( smoothedTrueRange > 8.19958 )
							ret := 0.000000
					if( smoothedDirectionalMovementPlus > 5.62863 )
						if( adx <= 65.1057 )
							ret := 1.000000 // buy
						if( adx > 65.1057 )
							ret := 0.888889 // buy
		if( smoothedDirectionalMovementMinus > 2.83098 )
			if( adx <= 67.8531 )
				if( adx <= 46.4517 )
					if( directionalMovementPlus <= 3.11037 )
						ret := 0.000000
					if( directionalMovementPlus > 3.11037 )
						ret := -0.800000 // sell
				if( adx > 46.4517 )
					if( trueRange <= 6.85813 )
						if( directionalMovementPlus <= 2.4004 )
							ret := -1.000000 // sell
						if( directionalMovementPlus > 2.4004 )
							ret := -0.916667 // sell
					if( trueRange > 6.85813 )
						if( smoothedDirectionalMovementMinus <= 3.46782 )
							ret := -0.869565 // sell
						if( smoothedDirectionalMovementMinus > 3.46782 )
							ret := -0.333333
			if( adx > 67.8531 )
				ret := 0.200000
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator ADX_and_DI 
//@version=5
// This source code is subject to the terms of the Mozilla Public License 2.0 at https://mozilla.org/MPL/2.0/
// © BeikabuOyaji

//indicator "ADX and DI for v5", overlay=false)

// Input parameters
len = input(14, title="Length")
th = input(20, title="Threshold")

// Calculate True Range
trueRange = math.max(math.max(high - low, math.abs(high - nz(close[1]))), math.abs(low - nz(close[1])))

// Calculate Directional Movements
directionalMovementPlus = high - nz(high[1]) > nz(low[1]) - low ? math.max(high - nz(high[1]), 0) : 0
directionalMovementMinus = nz(low[1]) - low > high - nz(high[1]) ? math.max(nz(low[1]) - low, 0) : 0

// Initialize and calculate smoothed values
var float smoothedTrueRange = 0
var float smoothedDirectionalMovementPlus = 0
var float smoothedDirectionalMovementMinus = 0

smoothedTrueRange := nz(smoothedTrueRange[1]) - (nz(smoothedTrueRange[1]) / len) + trueRange
smoothedDirectionalMovementPlus := nz(smoothedDirectionalMovementPlus[1]) - (nz(smoothedDirectionalMovementPlus[1]) / len) + directionalMovementPlus
smoothedDirectionalMovementMinus := nz(smoothedDirectionalMovementMinus[1]) - (nz(smoothedDirectionalMovementMinus[1]) / len) + directionalMovementMinus

// Calculate DI+ and DI-
diPlus = (smoothedDirectionalMovementPlus / smoothedTrueRange) * 100
diMinus = (smoothedDirectionalMovementMinus / smoothedTrueRange) * 100

// Calculate DX and ADX
dx = math.abs(diPlus - diMinus) / (diPlus + diMinus) * 100
adx = ta.sma(dx, len)

// Plot DI+, DI-, and ADX
plot(diPlus, color=color.green, title="DI+")
plot(diMinus, color=color.red, title="DI-")
plot(adx, color=color.navy, title="ADX")

// Plot threshold line
hline(th, "Threshold", color=color.black)

// EXPLANATION OF THE STRATEGY
//The provided Pine Script implements a trading strategy that includes stop loss (SL) and multiple take profit (TP) levels,
//with an option to activate a trailing stop at the third TP level. Here's a detailed breakdown of its components and functionality:

//Variables Initialization:
var float stop = na
var float limit1 = na
var float limit2 = na

// Converts a percentage to points based on the average position price and the minimum tick size.
percent2points(percent) =>
    strategy.position_avg_price * percent / 100 / syminfo.mintick

// Stop Loss and Take Profit Inputs:
//Defines inputs for stop loss and three take profit levels in percentage terms.
sl = percent2points(input(2.92, title="stop loss %%"))
tp1 = percent2points(input(1.12, title="take profit 1 %%"))
tp2 = percent2points(input(2.31, title="take profit 2 %%"))
tp3 = percent2points(input(3.91, title="take profit 3 %%"))
activateTrailingOnThirdStep = input(false,title="activate trailing on third stage (tp3 is amount, tp2 is offset level)")
log.info("Stop Loss (sl):", sl," Take Profit 1 (tp1):", tp1, " Take Profit 2 (tp2):", tp2," Take Profit 3 (tp3):", tp3)

// Current Profit Calculation:
//Calculates the current profit in points based on the position size and price.
curProfitInPts() =>
    if strategy.position_size > 0
        (high - strategy.position_avg_price) / syminfo.mintick
    else if strategy.position_size < 0
        (strategy.position_avg_price - low) / syminfo.mintick
    else
        0
// Stop Loss and Profit Target Price Calculations:
//Determines the stop loss and profit target prices based on the position size and offset points.
calcStopLossPrice(OffsetPts) =>
    if strategy.position_size > 0
        strategy.position_avg_price - OffsetPts * syminfo.mintick
    else if strategy.position_size < 0
        strategy.position_avg_price + OffsetPts * syminfo.mintick
    else
        0
calcProfitTrgtPrice(OffsetPts) =>
    calcStopLossPrice(-OffsetPts)
// Current Stage Determination:
//Determines the current stage of the trade based on the profit points reached.
getCurrentStage() =>
    var stage = 0
    if strategy.position_size == 0
        stage := 0
    if stage == 0 and strategy.position_size != 0
        stage := 1
    else if stage == 1 and curProfitInPts() >= tp1
        stage := 2
    else if stage == 2 and curProfitInPts() >= tp2
        stage := 3
    stage
stopLevel = -1.
profitLevel = calcProfitTrgtPrice(tp3)

log.info("Stop Level:", stopLevel)
log.info("Profit Level:", profitLevel)
//This part of the strategy sets up exit conditions based on the current stage of the trade and uses the same exit ID "x" to modify the exit parameters dynamically.
//The exit parameters include stop loss, take profit, and comments for each stage.
// based on current stage set up exit
// note: we use same exit ids ("x") consciously, for MODIFY the exit's parameters
curStage = getCurrentStage()
float op_operation = decision_tree_0_MDB_30Min_5a883878(dx, directionalMovementMinus, diPlus, smoothedDirectionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedTrueRange, directionalMovementPlus, diMinus, adx)

log.info("Decision Tree Operation (op_operation):", op_operation)
if (op_operation <= 0)
    if curStage == 1
        stopLevel := calcStopLossPrice(sl)
        strategy.exit("x", loss = sl, profit = tp3, comment = "sl or tp3")
    else if curStage == 2
        stopLevel := calcStopLossPrice(0)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "breakeven or tp3")
    else if curStage == 3
        stopLevel := calcStopLossPrice(-tp1)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "tp1 or tp3")
    else
        strategy.cancel("x")


//SIGNAL MANAGE    User Adjustments and Risk Management
// The user can adjust the threshold values for op_operation to control the level of risk they are willing to take:
// Lower op_operation Threshold for Buy Signal (e.g., 0.5 instead of 0.55):
//     Effect: Generates more buy signals, increasing the frequency of trades. This is suitable for a user willing to take more risks and potentially capture more trading opportunities.
// Higher op_operation Threshold for Buy Signal (e.g., 0.8 instead of 0.55):
//     Effect: Generates fewer buy signals, reducing the frequency of trades. This is suitable for a user seeking to take fewer risks and only enter trades under more favorable conditions.
// Lower op_operation Threshold for Signal Closure (e.g., -0.8 instead of -0.9):
//     Effect: Closes positions less frequently, allowing trades more room to recover from temporary unfavorable conditions. This increases risk but can capture larger gains if the market reverses favorably.
// Higher op_operation Threshold for Signal Closure (e.g., -0.95 instead of -0.9):
//     Effect: Closes positions more frequently, exiting trades quickly at the first sign of unfavorable conditions. This decreases risk but may result in missed opportunities for recovery.
//Signal BUY
FIXED_DOLLAR_AMOUNT  = 10000
positionSize = FIXED_DOLLAR_AMOUNT / close
log.info("Position Size (in dollars $",FIXED_DOLLAR_AMOUNT,"):", positionSize)

if (op_operation >= 0.55)
    stop := close * 0.965
    limit1 := close * 1.03
    limit2 := close * 1.02
    strategy.entry("x", strategy.long, qty=positionSize, stop=stop, comment="in")
//Signal SELL
if (op_operation <= -0.9)
    strategy.close("x", comment = "under Le1")

// Impact on the Dataset
//Stop Loss (SL): Limits the maximum loss by exiting the position if the price moves against the trade by a specified percentage.
//Take Profit (TP1, TP2, TP3): Defines profit-taking levels to secure gains at different stages.
//Trailing Stop: Optionally activates a trailing stop at the third TP level to lock in profits while allowing for further gains if the price continues to move favorably.
//Position Entry and Exit: The strategy's buy and sell signals determine when to enter and exit positions, influencing the dataset by marking the points of trade execution and closure.
//Current Stage Tracking: Monitors the trade's progress through predefined stages, adjusting stop and profit levels accordingly.
//This strategy is designed to manage risk and maximize profits through a structured approach, incorporating multiple exit levels and dynamic adjustments based on market conditions. The dataset will reflect these actions, showing entries, exits, stop loss activations, and profit-taking events, providing valuable information for backtesting and performance analysis.
//Random forest AI offers significant advantages in trading, including the ability to handle large data sets, reduce overfitting and provide more robust predictions through the aggregation of multiple decision trees.

// NOTE: While the Tuisku team stands behind the quality and effectiveness of this trading strategy,
// PLEASE be aware that there is NO GUARANTEE of specific results or profits. TRADING INVOLVES SIGNIFICANT RISK, and it is important to use this strategy with careful consideration of your financial situation and risk tolerance.
// For further information and support, please contact us at Tuisku.eu.


