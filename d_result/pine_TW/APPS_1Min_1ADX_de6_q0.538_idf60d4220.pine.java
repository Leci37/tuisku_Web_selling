//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: ADX_and_DI
// ID_model: APPS_1Min_1ADX_f60d4220 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_APPS_1Min_1ADX_f60d4220", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_APPS_1Min_f60d4220(smoothedDirectionalMovementMinus, directionalMovementMinus, diMinus, dx, directionalMovementPlus, smoothedDirectionalMovementPlus, adx, trueRange, smoothedTrueRange, diPlus)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( directionalMovementPlus <= 1e-06 )
		if( directionalMovementMinus <= 0.0002 )
			if( diPlus <= 26.0128 )
				if( smoothedTrueRange <= 0.011389 )
					if( diMinus <= 80.0296 )
						if( diMinus <= 15.7703 )
							ret := 0.072504
						if( diMinus > 15.7703 )
							ret := -0.020127
					if( diMinus > 80.0296 )
						ret := 1.000000 // buy
				if( smoothedTrueRange > 0.011389 )
					if( trueRange <= 0.026449 )
						if( diMinus <= 15.697 )
							ret := -0.049808
						if( diMinus > 15.697 )
							ret := 0.219378
					if( trueRange > 0.026449 )
						if( diMinus <= 15.4953 )
							ret := -0.812500 // sell
						if( diMinus > 15.4953 )
							ret := -0.181818
			if( diPlus > 26.0128 )
				if( smoothedTrueRange <= 0.010388 )
					if( smoothedDirectionalMovementMinus <= 0.002854 )
						if( directionalMovementMinus <= 1e-06 )
							ret := -0.009717
						if( directionalMovementMinus > 1e-06 )
							ret := -0.238095
					if( smoothedDirectionalMovementMinus > 0.002854 )
						if( diPlus <= 36.5599 )
							ret := 0.024291
						if( diPlus > 36.5599 )
							ret := 0.395833
				if( smoothedTrueRange > 0.010388 )
					if( diMinus <= 2.91941 )
						if( smoothedDirectionalMovementMinus <= 5.5e-05 )
							ret := -0.232143
						if( smoothedDirectionalMovementMinus > 5.5e-05 )
							ret := 0.769231 // buy
					if( diMinus > 2.91941 )
						if( dx <= 2.6042 )
							ret := 0.174699
						if( dx > 2.6042 )
							ret := -0.182876
		if( directionalMovementMinus > 0.0002 )
			if( trueRange <= 0.020003 )
				if( diPlus <= 11.7245 )
					if( smoothedDirectionalMovementMinus <= 0.01299 )
						if( diMinus <= 63.9844 )
							ret := 0.200330
						if( diMinus > 63.9844 )
							ret := -0.298701
					if( smoothedDirectionalMovementMinus > 0.01299 )
						if( adx <= 39.2639 )
							ret := 1.000000 // buy
						if( adx > 39.2639 )
							ret := 0.727273 // buy
				if( diPlus > 11.7245 )
					if( dx <= 21.0664 )
						if( adx <= 38.8726 )
							ret := 0.096010
						if( adx > 38.8726 )
							ret := 0.331429
					if( dx > 21.0664 )
						if( diMinus <= 65.7693 )
							ret := 0.035209
						if( diMinus > 65.7693 )
							ret := 0.439024
			if( trueRange > 0.020003 )
				if( diMinus <= 39.5039 )
					if( dx <= 14.8938 )
						if( adx <= 15.2178 )
							ret := -0.137255
						if( adx > 15.2178 )
							ret := 0.439331
					if( dx > 14.8938 )
						if( diMinus <= 10.2539 )
							ret := 0.481481
						if( diMinus > 10.2539 )
							ret := -0.014518
				if( diMinus > 39.5039 )
					if( smoothedTrueRange <= 0.017027 )
						if( smoothedTrueRange <= 0.012008 )
							ret := 0.311475
						if( smoothedTrueRange > 0.012008 )
							ret := 0.601918
					if( smoothedTrueRange > 0.017027 )
						if( smoothedTrueRange <= 0.017191 )
							ret := -0.521739
						if( smoothedTrueRange > 0.017191 )
							ret := 0.284289
	if( directionalMovementPlus > 1e-06 )
		if( directionalMovementPlus <= 0.02554 )
			if( adx <= 39.2399 )
				if( dx <= 77.7919 )
					if( smoothedTrueRange <= 0.054154 )
						if( smoothedDirectionalMovementPlus <= 0.000468 )
							ret := 0.523810
						if( smoothedDirectionalMovementPlus > 0.000468 )
							ret := -0.110942
					if( smoothedTrueRange > 0.054154 )
						if( diMinus <= 23.6698 )
							ret := -0.062500
						if( diMinus > 23.6698 )
							ret := 0.813953 // buy
				if( dx > 77.7919 )
					if( diMinus <= 3.69946 )
						if( directionalMovementPlus <= 0.002412 )
							ret := 0.476190
						if( directionalMovementPlus > 0.002412 )
							ret := -0.312500
					if( diMinus > 3.69946 )
						if( smoothedTrueRange <= 0.005719 )
							ret := -0.294118
						if( smoothedTrueRange > 0.005719 )
							ret := 0.664000
			if( adx > 39.2399 )
				if( smoothedTrueRange <= 0.030075 )
					if( trueRange <= 0.004997 )
						if( dx <= 12.0636 )
							ret := 0.337500
						if( dx > 12.0636 )
							ret := -0.285511
					if( trueRange > 0.004997 )
						if( diMinus <= 22.5926 )
							ret := 0.062052
						if( diMinus > 22.5926 )
							ret := -0.078517
				if( smoothedTrueRange > 0.030075 )
					if( diPlus <= 54.5667 )
						if( dx <= 67.1486 )
							ret := 0.337662
						if( dx > 67.1486 )
							ret := 0.773585 // buy
					if( diPlus > 54.5667 )
						ret := -0.826087 // sell
		if( directionalMovementPlus > 0.02554 )
			if( diPlus <= 43.8978 )
				if( diMinus <= 20.1339 )
					if( adx <= 62.3726 )
						if( diPlus <= 38.5445 )
							ret := 0.000000
						if( diPlus > 38.5445 )
							ret := 0.718310 // buy
					if( adx > 62.3726 )
						if( directionalMovementPlus <= 0.03005 )
							ret := -1.000000 // sell
						if( directionalMovementPlus > 0.03005 )
							ret := -0.526316
				if( diMinus > 20.1339 )
					if( adx <= 44.7372 )
						if( diMinus <= 24.5778 )
							ret := -0.559524
						if( diMinus > 24.5778 )
							ret := -0.075472
					if( adx > 44.7372 )
						if( smoothedDirectionalMovementPlus <= 0.004417 )
							ret := -0.204082
						if( smoothedDirectionalMovementPlus > 0.004417 )
							ret := -0.789474 // sell
			if( diPlus > 43.8978 )
				if( adx <= 17.112 )
					if( adx <= 12.6539 )
						if( trueRange <= 0.030321 )
							ret := 0.181818
						if( trueRange > 0.030321 )
							ret := -0.695652
					if( adx > 12.6539 )
						if( trueRange <= 0.04621 )
							ret := -0.960526 // sell
						if( trueRange > 0.04621 )
							ret := -0.717949 // sell
				if( adx > 17.112 )
					if( smoothedTrueRange <= 0.007992 )
						ret := 0.636364
					if( smoothedTrueRange > 0.007992 )
						if( dx <= 60.7374 )
							ret := -0.522727
						if( dx > 60.7374 )
							ret := -0.252809
	
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
float op_operation = decision_tree_0_APPS_1Min_f60d4220(smoothedDirectionalMovementMinus, directionalMovementMinus, diMinus, dx, directionalMovementPlus, smoothedDirectionalMovementPlus, adx, trueRange, smoothedTrueRange, diPlus)

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


