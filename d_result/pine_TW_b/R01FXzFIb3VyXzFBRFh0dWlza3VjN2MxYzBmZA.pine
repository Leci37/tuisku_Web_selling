//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: ADX_and_DI
// ID_model: GME_1Hour_1ADX_c7c1c0fd Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GME_1Hour_1ADX_c7c1c0fd", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GME_1Hour_c7c1c0fd(dx, directionalMovementMinus, diPlus, smoothedDirectionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedTrueRange, directionalMovementPlus, diMinus, adx)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( adx <= 36.3459 )
		if( diMinus <= 12.7122 )
			if( dx <= 34.8497 )
				if( directionalMovementMinus <= 0.269636 )
					if( trueRange <= 0.301125 )
						if( directionalMovementPlus <= 5e-06 )
							ret := 0.065574
						if( directionalMovementPlus > 5e-06 )
							ret := 0.604167
					if( trueRange > 0.301125 )
						if( diPlus <= 17.8766 )
							ret := 0.285714
						if( diPlus > 17.8766 )
							ret := 0.878788 // buy
				if( directionalMovementMinus > 0.269636 )
					ret := -0.375000
			if( dx > 34.8497 )
				if( diMinus <= 11.7905 )
					if( dx <= 86.0563 )
						if( directionalMovementMinus <= 0.10878 )
							ret := 0.168690
						if( directionalMovementMinus > 0.10878 )
							ret := -0.357798
					if( dx > 86.0563 )
						if( dx <= 87.255 )
							ret := 0.545455
						if( dx > 87.255 )
							ret := 0.956522 // buy
				if( diMinus > 11.7905 )
					if( dx <= 43.4266 )
						if( directionalMovementPlus <= 0.060005 )
							ret := 0.428571
						if( directionalMovementPlus > 0.060005 )
							ret := -0.500000
					if( dx > 43.4266 )
						if( adx <= 30.9605 )
							ret := -0.557377
						if( adx > 30.9605 )
							ret := -0.152174
		if( diMinus > 12.7122 )
			if( smoothedDirectionalMovementPlus <= 0.671154 )
				if( adx <= 11.6453 )
					if( diMinus <= 15.1731 )
						ret := -0.736842 // sell
					if( diMinus > 15.1731 )
						if( diPlus <= 21.6263 )
							ret := 0.494737
						if( diPlus > 21.6263 )
							ret := 0.041667
				if( adx > 11.6453 )
					if( directionalMovementPlus <= 0.186852 )
						if( diMinus <= 24.1378 )
							ret := -0.001231
						if( diMinus > 24.1378 )
							ret := -0.111578
					if( directionalMovementPlus > 0.186852 )
						if( dx <= 1.95668 )
							ret := -0.776316 // sell
						if( dx > 1.95668 )
							ret := -0.179831
			if( smoothedDirectionalMovementPlus > 0.671154 )
				if( dx <= 10.9348 )
					if( diMinus <= 29.5246 )
						if( diMinus <= 19.712 )
							ret := -0.236559
						if( diMinus > 19.712 )
							ret := -0.646688
					if( diMinus > 29.5246 )
						if( diMinus <= 30.7803 )
							ret := 0.000000
						if( diMinus > 30.7803 )
							ret := 0.611111
				if( dx > 10.9348 )
					if( diPlus <= 41.0408 )
						if( dx <= 37.36 )
							ret := -0.097356
						if( dx > 37.36 )
							ret := -0.534653
					if( diPlus > 41.0408 )
						if( dx <= 52.0487 )
							ret := 0.850000 // buy
						if( dx > 52.0487 )
							ret := 0.375000
	if( adx > 36.3459 )
		if( diMinus <= 9.08081 )
			if( smoothedDirectionalMovementMinus <= 0.610532 )
				if( adx <= 82.4649 )
					if( trueRange <= 30.6484 )
						if( diPlus <= 30.8998 )
							ret := -0.070248
						if( diPlus > 30.8998 )
							ret := 0.218870
					if( trueRange > 30.6484 )
						ret := -1.000000 // sell
				if( adx > 82.4649 )
					if( directionalMovementMinus <= 1.09567 )
						if( smoothedDirectionalMovementPlus <= 0.159043 )
							ret := 0.027027
						if( smoothedDirectionalMovementPlus > 0.159043 )
							ret := -0.518248
					if( directionalMovementMinus > 1.09567 )
						ret := 0.928571 // buy
			if( smoothedDirectionalMovementMinus > 0.610532 )
				if( trueRange <= 34.8449 )
					if( smoothedDirectionalMovementPlus <= 4.44058 )
						if( smoothedDirectionalMovementPlus <= 3.37953 )
							ret := 0.906250 // buy
						if( smoothedDirectionalMovementPlus > 3.37953 )
							ret := -0.055556
					if( smoothedDirectionalMovementPlus > 4.44058 )
						ret := 1.000000 // buy
				if( trueRange > 34.8449 )
					ret := -0.666667
		if( diMinus > 9.08081 )
			if( adx <= 42.3846 )
				if( directionalMovementPlus <= 3.0569 )
					if( trueRange <= 4.75715 )
						if( directionalMovementPlus <= 0.066523 )
							ret := 0.194892
						if( directionalMovementPlus > 0.066523 )
							ret := -0.015515
					if( trueRange > 4.75715 )
						if( directionalMovementMinus <= 3.57 )
							ret := 0.813008 // buy
						if( directionalMovementMinus > 3.57 )
							ret := 0.126761
				if( directionalMovementPlus > 3.0569 )
					if( smoothedDirectionalMovementPlus <= 1.01573 )
						if( smoothedTrueRange <= 2.80119 )
							ret := -0.625000
						if( smoothedTrueRange > 2.80119 )
							ret := -1.000000 // sell
					if( smoothedDirectionalMovementPlus > 1.01573 )
						ret := 0.133333
			if( adx > 42.3846 )
				if( adx <= 50.3312 )
					if( directionalMovementPlus <= 0.009351 )
						if( smoothedTrueRange <= 1.41796 )
							ret := 0.060914
						if( smoothedTrueRange > 1.41796 )
							ret := -0.241313
					if( directionalMovementPlus > 0.009351 )
						if( dx <= 16.8779 )
							ret := 0.046875
						if( dx > 16.8779 )
							ret := -0.291627
				if( adx > 50.3312 )
					if( smoothedDirectionalMovementMinus <= 8.49918 )
						if( adx <= 56.8298 )
							ret := 0.169935
						if( adx > 56.8298 )
							ret := -0.002110
					if( smoothedDirectionalMovementMinus > 8.49918 )
						if( smoothedDirectionalMovementPlus <= 12.4536 )
							ret := -0.944444 // sell
						if( smoothedDirectionalMovementPlus > 12.4536 )
							ret := 0.000000
	
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
float op_operation = decision_tree_0_GME_1Hour_c7c1c0fd(dx, directionalMovementMinus, diPlus, smoothedDirectionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedTrueRange, directionalMovementPlus, diMinus, adx)

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


