//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: ADX_and_DI
// ID_model: TSLA_1Hour_1ADX_ff3467c0 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TSLA_1Hour_1ADX_ff3467c0", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TSLA_1Hour_ff3467c0(directionalMovementPlus, directionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedDirectionalMovementMinus, diPlus, diMinus, smoothedTrueRange, adx, dx)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( diPlus <= 26.7187 )
		if( adx <= 16.2676 )
			if( diMinus <= 19.1294 )
				if( directionalMovementPlus <= 0.409732 )
					if( adx <= 10.2664 )
						if( adx <= 8.86949 )
							ret := 0.833333 // buy
						if( adx > 8.86949 )
							ret := -0.391304
					if( adx > 10.2664 )
						if( diPlus <= 20.0521 )
							ret := 0.722892 // buy
						if( diPlus > 20.0521 )
							ret := 0.425532
				if( directionalMovementPlus > 0.409732 )
					if( adx <= 13.4274 )
						if( dx <= 8.598 )
							ret := -0.375000
						if( dx > 8.598 )
							ret := 0.628571
					if( adx > 13.4274 )
						if( diMinus <= 16.8 )
							ret := -0.584906
						if( diMinus > 16.8 )
							ret := 0.075000
			if( diMinus > 19.1294 )
				if( smoothedDirectionalMovementMinus <= 2.25559 )
					if( smoothedTrueRange <= 5.79774 )
						if( smoothedDirectionalMovementPlus <= 0.369952 )
							ret := -0.157303
						if( smoothedDirectionalMovementPlus > 0.369952 )
							ret := 0.180832
					if( smoothedTrueRange > 5.79774 )
						if( diMinus <= 24.3711 )
							ret := 0.720497 // buy
						if( diMinus > 24.3711 )
							ret := 0.086207
				if( smoothedDirectionalMovementMinus > 2.25559 )
					if( adx <= 12.4638 )
						if( trueRange <= 10.464 )
							ret := -0.291667
						if( trueRange > 10.464 )
							ret := -0.776119 // sell
					if( adx > 12.4638 )
						if( directionalMovementMinus <= 9.94733 )
							ret := 0.080292
						if( directionalMovementMinus > 9.94733 )
							ret := -0.707317 // sell
		if( adx > 16.2676 )
			if( smoothedTrueRange <= 49.1405 )
				if( directionalMovementMinus <= 15.6819 )
					if( smoothedTrueRange <= 32.8161 )
						if( smoothedTrueRange <= 9.61884 )
							ret := -0.051930
						if( smoothedTrueRange > 9.61884 )
							ret := -0.152369
					if( smoothedTrueRange > 32.8161 )
						if( smoothedDirectionalMovementPlus <= 8.63855 )
							ret := -0.820312 // sell
						if( smoothedDirectionalMovementPlus > 8.63855 )
							ret := -0.040000
				if( directionalMovementMinus > 15.6819 )
					if( smoothedDirectionalMovementMinus <= 5.09076 )
						if( diMinus <= 38.2733 )
							ret := -0.211429
						if( diMinus > 38.2733 )
							ret := 0.344444
					if( smoothedDirectionalMovementMinus > 5.09076 )
						if( smoothedTrueRange <= 37.1359 )
							ret := 0.551237
						if( smoothedTrueRange > 37.1359 )
							ret := -0.700000 // sell
			if( smoothedTrueRange > 49.1405 )
				if( smoothedDirectionalMovementPlus <= 10.2491 )
					if( directionalMovementMinus <= 11.22 )
						if( smoothedDirectionalMovementMinus <= 134.505 )
							ret := 1.000000 // buy
						if( smoothedDirectionalMovementMinus > 134.505 )
							ret := 0.000000
					if( directionalMovementMinus > 11.22 )
						ret := 0.000000
				if( smoothedDirectionalMovementPlus > 10.2491 )
					if( trueRange <= 45.4425 )
						ret := 0.700000 // buy
					if( trueRange > 45.4425 )
						ret := -0.444444
	if( diPlus > 26.7187 )
		if( smoothedTrueRange <= 28.0367 )
			if( smoothedTrueRange <= 3.96395 )
				if( directionalMovementMinus <= 0.000158 )
					if( adx <= 58.01 )
						if( diPlus <= 46.0085 )
							ret := -0.011544
						if( diPlus > 46.0085 )
							ret := 0.350000
					if( adx > 58.01 )
						if( trueRange <= 2.68225 )
							ret := -0.090361
						if( trueRange > 2.68225 )
							ret := -0.630841
				if( directionalMovementMinus > 0.000158 )
					if( diMinus <= 9.48324 )
						if( dx <= 65.5744 )
							ret := 0.493289
						if( dx > 65.5744 )
							ret := 0.121495
					if( diMinus > 9.48324 )
						if( directionalMovementMinus <= 0.157859 )
							ret := 0.424731
						if( directionalMovementMinus > 0.157859 )
							ret := 0.017383
			if( smoothedTrueRange > 3.96395 )
				if( smoothedDirectionalMovementMinus <= 1.75503 )
					if( dx <= 87.1599 )
						if( diMinus <= 6.10606 )
							ret := 0.025074
						if( diMinus > 6.10606 )
							ret := 0.227372
					if( dx > 87.1599 )
						if( smoothedDirectionalMovementPlus <= 2.75505 )
							ret := 0.018519
						if( smoothedDirectionalMovementPlus > 2.75505 )
							ret := 0.523944
				if( smoothedDirectionalMovementMinus > 1.75503 )
					if( directionalMovementPlus <= 26.8405 )
						if( dx <= 55.7355 )
							ret := 0.000000
						if( dx > 55.7355 )
							ret := -0.550000
					if( directionalMovementPlus > 26.8405 )
						if( smoothedTrueRange <= 15.4494 )
							ret := -0.263158
						if( smoothedTrueRange > 15.4494 )
							ret := 0.864865 // buy
		if( smoothedTrueRange > 28.0367 )
			if( adx <= 91.0317 )
				if( diMinus <= 9.66659 )
					if( smoothedDirectionalMovementPlus <= 10.0211 )
						ret := 0.000000
					if( smoothedDirectionalMovementPlus > 10.0211 )
						if( smoothedTrueRange <= 30.7543 )
							ret := -0.722222 // sell
						if( smoothedTrueRange > 30.7543 )
							ret := -0.975610 // sell
				if( diMinus > 9.66659 )
					if( diMinus <= 14.1568 )
						if( trueRange <= 14.4817 )
							ret := 1.000000 // buy
						if( trueRange > 14.4817 )
							ret := -0.214286
					if( diMinus > 14.1568 )
						if( dx <= 10.9315 )
							ret := 1.000000 // buy
						if( dx > 10.9315 )
							ret := -0.511364
			if( adx > 91.0317 )
				ret := 0.833333 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
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
float op_operation = decision_tree_0_TSLA_1Hour_ff3467c0(directionalMovementPlus, directionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedDirectionalMovementMinus, diPlus, diMinus, smoothedTrueRange, adx, dx)

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


