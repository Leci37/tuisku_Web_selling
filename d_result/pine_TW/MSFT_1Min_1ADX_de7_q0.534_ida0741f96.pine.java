//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: ADX_and_DI
// ID_model: MSFT_1Min_1ADX_a0741f96 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_1Min_1ADX_a0741f96", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_1Min_a0741f96(dx, directionalMovementMinus, diPlus, smoothedDirectionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedTrueRange, directionalMovementPlus, diMinus, adx)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7,max_features=sqrt, min_samples_leaf=4,random_state=843828734)
	if( directionalMovementMinus <= 0.256621 )
		if( trueRange <= 0.340957 )
			if( diPlus <= 76.1722 )
				if( smoothedDirectionalMovementPlus <= 0.116729 )
					if( diPlus <= 10.4852 )
						if( smoothedTrueRange <= 0.617319 )
							if( adx <= 78.1759 )
								ret := -0.083688
							if( adx > 78.1759 )
								ret := 0.287402
						if( smoothedTrueRange > 0.617319 )
							if( smoothedDirectionalMovementMinus <= 0.163985 )
								ret := -0.428571
							if( smoothedDirectionalMovementMinus > 0.163985 )
								ret := 0.484127
					if( diPlus > 10.4852 )
						if( diPlus <= 24.747 )
							if( diMinus <= 37.0863 )
								ret := -0.003283
							if( diMinus > 37.0863 )
								ret := 0.107884
						if( diPlus > 24.747 )
							if( diPlus <= 41.2578 )
								ret := 0.069863
							if( diPlus > 41.2578 )
								ret := -0.001934
				if( smoothedDirectionalMovementPlus > 0.116729 )
					if( smoothedDirectionalMovementPlus <= 0.235456 )
						if( smoothedDirectionalMovementPlus <= 0.162587 )
							if( directionalMovementMinus <= 0.247639 )
								ret := -0.050295
							if( directionalMovementMinus > 0.247639 )
								ret := 0.650000
						if( smoothedDirectionalMovementPlus > 0.162587 )
							if( diMinus <= 14.3068 )
								ret := 0.066277
							if( diMinus > 14.3068 )
								ret := -0.250993
					if( smoothedDirectionalMovementPlus > 0.235456 )
						if( trueRange <= 0.308592 )
							if( adx <= 74.993 )
								ret := 0.237624
							if( adx > 74.993 )
								ret := -0.766667 // sell
						if( trueRange > 0.308592 )
							if( diPlus <= 70.5541 )
								ret := -0.461538
							if( diPlus > 70.5541 )
								ret := 0.714286 // buy
			if( diPlus > 76.1722 )
				if( smoothedDirectionalMovementMinus <= 0.062841 )
					if( adx <= 18.7463 )
						if( smoothedDirectionalMovementPlus <= 0.055388 )
							ret := 0.200000
						if( smoothedDirectionalMovementPlus > 0.055388 )
							ret := 1.000000 // buy
					if( adx > 18.7463 )
						if( dx <= 56.2605 )
							if( smoothedTrueRange <= 0.117309 )
								ret := -0.400000
							if( smoothedTrueRange > 0.117309 )
								ret := -1.000000 // sell
						if( dx > 56.2605 )
							if( diPlus <= 77.6315 )
								ret := 0.075758
							if( diPlus > 77.6315 )
								ret := -0.389640
				if( smoothedDirectionalMovementMinus > 0.062841 )
					if( trueRange <= 0.068169 )
						ret := 1.000000 // buy
					if( trueRange > 0.068169 )
						if( diPlus <= 83.6019 )
							if( trueRange <= 0.173521 )
								ret := 0.666667
							if( trueRange > 0.173521 )
								ret := 0.875000 // buy
						if( diPlus > 83.6019 )
							ret := 0.200000
		if( trueRange > 0.340957 )
			if( dx <= 54.28 )
				if( directionalMovementPlus <= 0.394405 )
					if( adx <= 65.1709 )
						if( adx <= 10.8322 )
							if( dx <= 2.82347 )
								ret := -0.785714 // sell
							if( dx > 2.82347 )
								ret := -0.210526
						if( adx > 10.8322 )
							if( trueRange <= 1.65358 )
								ret := 0.016840
							if( trueRange > 1.65358 )
								ret := -0.586207
					if( adx > 65.1709 )
						if( smoothedDirectionalMovementPlus <= 0.14722 )
							if( diPlus <= 11.8708 )
								ret := -0.685185
							if( diPlus > 11.8708 )
								ret := -0.205298
						if( smoothedDirectionalMovementPlus > 0.14722 )
							if( smoothedTrueRange <= 0.685075 )
								ret := -1.000000 // sell
							if( smoothedTrueRange > 0.685075 )
								ret := -0.684211
				if( directionalMovementPlus > 0.394405 )
					if( diMinus <= 64.57 )
						if( smoothedDirectionalMovementMinus <= 0.318875 )
							if( dx <= 46.8288 )
								ret := -0.179005
							if( dx > 46.8288 )
								ret := 0.083333
						if( smoothedDirectionalMovementMinus > 0.318875 )
							if( diPlus <= 22.88 )
								ret := 0.731707 // buy
							if( diPlus > 22.88 )
								ret := -0.285714
					if( diMinus > 64.57 )
						if( smoothedDirectionalMovementPlus <= 0.074286 )
							if( dx <= 44.0924 )
								ret := 0.875000 // buy
							if( dx > 44.0924 )
								ret := 0.400000
						if( smoothedDirectionalMovementPlus > 0.074286 )
							ret := 1.000000 // buy
			if( dx > 54.28 )
				if( smoothedDirectionalMovementPlus <= 0.134364 )
					if( smoothedTrueRange <= 0.754909 )
						if( diPlus <= 82.2039 )
							if( smoothedDirectionalMovementMinus <= 0.00605 )
								ret := 0.600000
							if( smoothedDirectionalMovementMinus > 0.00605 )
								ret := -0.083758
						if( diPlus > 82.2039 )
							if( adx <= 54.8311 )
								ret := -0.965517 // sell
							if( adx > 54.8311 )
								ret := -0.750000 // sell
					if( smoothedTrueRange > 0.754909 )
						if( trueRange <= 2.20043 )
							if( adx <= 43.4644 )
								ret := -0.064516
							if( adx > 43.4644 )
								ret := -0.638889
						if( trueRange > 2.20043 )
							if( dx <= 97.2571 )
								ret := 0.333333
							if( dx > 97.2571 )
								ret := 1.000000 // buy
				if( smoothedDirectionalMovementPlus > 0.134364 )
					if( diMinus <= 4.98818 )
						if( smoothedDirectionalMovementMinus <= 0.039282 )
							if( smoothedDirectionalMovementMinus <= 0.013833 )
								ret := -0.171975
							if( smoothedDirectionalMovementMinus > 0.013833 )
								ret := 0.219512
						if( smoothedDirectionalMovementMinus > 0.039282 )
							if( diPlus <= 59.0319 )
								ret := 0.166667
							if( diPlus > 59.0319 )
								ret := -1.000000 // sell
					if( diMinus > 4.98818 )
						if( smoothedDirectionalMovementMinus <= 0.102354 )
							if( adx <= 20.1056 )
								ret := 0.203390
							if( adx > 20.1056 )
								ret := -0.333731
						if( smoothedDirectionalMovementMinus > 0.102354 )
							if( directionalMovementPlus <= 0.782365 )
								ret := 0.226190
							if( directionalMovementPlus > 0.782365 )
								ret := -0.500000
	if( directionalMovementMinus > 0.256621 )
		if( diMinus <= 31.6546 )
			if( smoothedDirectionalMovementMinus <= 0.177634 )
				if( smoothedDirectionalMovementPlus <= 0.150149 )
					if( adx <= 22.6587 )
						if( dx <= 40.8271 )
							if( adx <= 21.9096 )
								ret := -0.070106
							if( adx > 21.9096 )
								ret := -0.786885 // sell
						if( dx > 40.8271 )
							if( smoothedDirectionalMovementPlus <= 0.033338 )
								ret := -0.333333
							if( smoothedDirectionalMovementPlus > 0.033338 )
								ret := -0.909091 // sell
					if( adx > 22.6587 )
						if( smoothedDirectionalMovementMinus <= 0.153625 )
							if( directionalMovementMinus <= 0.650412 )
								ret := 0.035595
							if( directionalMovementMinus > 0.650412 )
								ret := 0.362500
						if( smoothedDirectionalMovementMinus > 0.153625 )
							if( diPlus <= 12.7688 )
								ret := 0.000000
							if( diPlus > 12.7688 )
								ret := 0.636364
				if( smoothedDirectionalMovementPlus > 0.150149 )
					if( diPlus <= 48.8918 )
						if( smoothedTrueRange <= 1.06579 )
							if( trueRange <= 0.481605 )
								ret := 0.027586
							if( trueRange > 0.481605 )
								ret := -0.317647
						if( smoothedTrueRange > 1.06579 )
							if( smoothedDirectionalMovementPlus <= 0.367139 )
								ret := 0.833333 // buy
							if( smoothedDirectionalMovementPlus > 0.367139 )
								ret := 1.000000 // buy
					if( diPlus > 48.8918 )
						if( adx <= 44.7594 )
							if( smoothedTrueRange <= 0.292439 )
								ret := -0.428571
							if( smoothedTrueRange > 0.292439 )
								ret := 0.523810
						if( adx > 44.7594 )
							if( diPlus <= 54.523 )
								ret := -0.166667
							if( diPlus > 54.523 )
								ret := -0.695652
			if( smoothedDirectionalMovementMinus > 0.177634 )
				if( smoothedDirectionalMovementPlus <= 0.538191 )
					if( smoothedDirectionalMovementPlus <= 0.171486 )
						if( diMinus <= 28.1091 )
							if( trueRange <= 0.630015 )
								ret := -0.192308
							if( trueRange > 0.630015 )
								ret := 0.717557 // buy
						if( diMinus > 28.1091 )
							if( adx <= 14.5198 )
								ret := -0.888889 // sell
							if( adx > 14.5198 )
								ret := 0.250000
					if( smoothedDirectionalMovementPlus > 0.171486 )
						if( adx <= 32.1608 )
							if( adx <= 26.8647 )
								ret := 0.008929
							if( adx > 26.8647 )
								ret := -0.439024
						if( adx > 32.1608 )
							if( smoothedDirectionalMovementMinus <= 0.283122 )
								ret := 0.136986
							if( smoothedDirectionalMovementMinus > 0.283122 )
								ret := 0.672414
				if( smoothedDirectionalMovementPlus > 0.538191 )
					if( adx <= 72.3144 )
						if( directionalMovementMinus <= 1.77046 )
							if( diMinus <= 16.7792 )
								ret := -0.416667
							if( diMinus > 16.7792 )
								ret := -0.945946 // sell
						if( directionalMovementMinus > 1.77046 )
							if( dx <= 13.7876 )
								ret := 0.500000
							if( dx > 13.7876 )
								ret := -0.333333
					if( adx > 72.3144 )
						ret := 0.833333 // buy
		if( diMinus > 31.6546 )
			if( smoothedDirectionalMovementPlus <= 0.084299 )
				if( smoothedTrueRange <= 0.369367 )
					if( dx <= 70.4722 )
						if( diPlus <= 23.8607 )
							if( trueRange <= 0.814058 )
								ret := 0.120219
							if( trueRange > 0.814058 )
								ret := -0.132159
						if( diPlus > 23.8607 )
							if( adx <= 29.0143 )
								ret := 0.306864
							if( adx > 29.0143 )
								ret := 0.149554
					if( dx > 70.4722 )
						if( diMinus <= 69.1715 )
							if( smoothedDirectionalMovementMinus <= 0.110869 )
								ret := -0.151786
							if( smoothedDirectionalMovementMinus > 0.110869 )
								ret := 0.302326
						if( diMinus > 69.1715 )
							if( adx <= 41.8843 )
								ret := 0.913580 // buy
							if( adx > 41.8843 )
								ret := 0.654545
				if( smoothedTrueRange > 0.369367 )
					if( diMinus <= 34.725 )
						if( dx <= 53.082 )
							if( dx <= 27.6799 )
								ret := -0.600000
							if( dx > 27.6799 )
								ret := 0.634146
						if( dx > 53.082 )
							if( smoothedDirectionalMovementPlus <= 0.047825 )
								ret := 0.361111
							if( smoothedDirectionalMovementPlus > 0.047825 )
								ret := -0.705882 // sell
					if( diMinus > 34.725 )
						if( dx <= 87.1312 )
							if( dx <= 64.1621 )
								ret := 0.010460
							if( dx > 64.1621 )
								ret := -0.238880
						if( dx > 87.1312 )
							if( smoothedTrueRange <= 0.430447 )
								ret := -0.740741 // sell
							if( smoothedTrueRange > 0.430447 )
								ret := 0.335526
			if( smoothedDirectionalMovementPlus > 0.084299 )
				if( diPlus <= 38.6426 )
					if( diMinus <= 67.918 )
						if( diPlus <= 15.7117 )
							if( adx <= 16.3283 )
								ret := -1.000000 // sell
							if( adx > 16.3283 )
								ret := 0.570552
						if( diPlus > 15.7117 )
							if( dx <= 45.897 )
								ret := 0.217877
							if( dx > 45.897 )
								ret := -0.562500
					if( diMinus > 67.918 )
						if( diMinus <= 69.0789 )
							ret := 1.000000 // buy
						if( diMinus > 69.0789 )
							if( trueRange <= 0.688034 )
								ret := 1.000000 // buy
							if( trueRange > 0.688034 )
								ret := 0.615385
				if( diPlus > 38.6426 )
					if( directionalMovementMinus <= 0.422213 )
						if( diMinus <= 46.7413 )
							if( diPlus <= 51.093 )
								ret := 0.666667
							if( diPlus > 51.093 )
								ret := 0.218543
						if( diMinus > 46.7413 )
							if( dx <= 10.0329 )
								ret := 0.054054
							if( dx > 10.0329 )
								ret := -0.789474 // sell
					if( directionalMovementMinus > 0.422213 )
						if( diPlus <= 60.2709 )
							if( diMinus <= 34.6177 )
								ret := 0.074074
							if( diMinus > 34.6177 )
								ret := 0.725166 // buy
						if( diPlus > 60.2709 )
							if( diMinus <= 38.6097 )
								ret := 0.333333
							if( diMinus > 38.6097 )
								ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_MSFT_1Min_a0741f96(dx, directionalMovementMinus, diPlus, smoothedDirectionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedTrueRange, directionalMovementPlus, diMinus, adx)

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


