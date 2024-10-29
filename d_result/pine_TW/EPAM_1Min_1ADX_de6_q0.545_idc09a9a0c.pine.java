//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: ADX_and_DI
// ID_model: EPAM_1Min_1ADX_c09a9a0c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_EPAM_1Min_1ADX_c09a9a0c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_EPAM_1Min_c09a9a0c(dx, directionalMovementMinus, diPlus, smoothedDirectionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedTrueRange, directionalMovementPlus, diMinus, adx)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( dx <= 84.829 )
		if( adx <= 62.5321 )
			if( smoothedDirectionalMovementMinus <= 0.238946 )
				if( smoothedDirectionalMovementMinus <= 0.03552 )
					if( trueRange <= 0.427941 )
						if( smoothedTrueRange <= 0.202864 )
							ret := 0.056248
						if( smoothedTrueRange > 0.202864 )
							ret := 0.238377
					if( trueRange > 0.427941 )
						if( diPlus <= 68.1295 )
							ret := -0.010959
						if( diPlus > 68.1295 )
							ret := -0.576923
				if( smoothedDirectionalMovementMinus > 0.03552 )
					if( directionalMovementMinus <= 0.785809 )
						if( dx <= 73.6949 )
							ret := -0.012912
						if( dx > 73.6949 )
							ret := 0.218371
					if( directionalMovementMinus > 0.785809 )
						if( dx <= 2.36539 )
							ret := -0.571429
						if( dx > 2.36539 )
							ret := 0.454183
			if( smoothedDirectionalMovementMinus > 0.238946 )
				if( adx <= 30.1587 )
					if( smoothedDirectionalMovementMinus <= 0.242531 )
						if( diMinus <= 44.9238 )
							ret := 1.000000 // buy
						if( diMinus > 44.9238 )
							ret := 0.333333
					if( smoothedDirectionalMovementMinus > 0.242531 )
						if( smoothedTrueRange <= 2.35605 )
							ret := -0.056093
						if( smoothedTrueRange > 2.35605 )
							ret := -1.000000 // sell
				if( adx > 30.1587 )
					if( directionalMovementMinus <= 0.061436 )
						if( diPlus <= 40.0166 )
							ret := 0.323420
						if( diPlus > 40.0166 )
							ret := -0.390625
					if( directionalMovementMinus > 0.061436 )
						if( dx <= 19.2378 )
							ret := 0.355932
						if( dx > 19.2378 )
							ret := 0.703470 // buy
		if( adx > 62.5321 )
			if( diMinus <= 54.7013 )
				if( diMinus <= 45.3912 )
					if( smoothedTrueRange <= 0.607802 )
						if( diMinus <= 13.0155 )
							ret := -0.047297
						if( diMinus > 13.0155 )
							ret := -0.324029
					if( smoothedTrueRange > 0.607802 )
						if( smoothedDirectionalMovementPlus <= 0.280045 )
							ret := 0.942857 // buy
						if( smoothedDirectionalMovementPlus > 0.280045 )
							ret := 0.151515
				if( diMinus > 45.3912 )
					if( adx <= 76.6672 )
						if( smoothedTrueRange <= 0.203562 )
							ret := 0.358696
						if( smoothedTrueRange > 0.203562 )
							ret := 0.925000 // buy
					if( adx > 76.6672 )
						if( diPlus <= 15.163 )
							ret := 0.145833
						if( diPlus > 15.163 )
							ret := -0.869565 // sell
			if( diMinus > 54.7013 )
				if( smoothedTrueRange <= 0.384064 )
					if( diMinus <= 62.6371 )
						if( directionalMovementPlus <= 0.019079 )
							ret := -0.606557
						if( directionalMovementPlus > 0.019079 )
							ret := -0.136364
					if( diMinus > 62.6371 )
						if( dx <= 79.0129 )
							ret := 0.013333
						if( dx > 79.0129 )
							ret := 0.909091 // buy
				if( smoothedTrueRange > 0.384064 )
					if( diPlus <= 7.39758 )
						ret := -0.181818
					if( diPlus > 7.39758 )
						if( diMinus <= 63.1599 )
							ret := -0.904762 // sell
						if( diMinus > 63.1599 )
							ret := -1.000000 // sell
	if( dx > 84.829 )
		if( adx <= 60.5959 )
			if( smoothedDirectionalMovementPlus <= 0.000368 )
				if( diMinus <= 57.0641 )
					if( diMinus <= 54.705 )
						ret := 0.800000 // buy
					if( diMinus > 54.705 )
						ret := 1.000000 // buy
				if( diMinus > 57.0641 )
					ret := 0.166667
			if( smoothedDirectionalMovementPlus > 0.000368 )
				if( diPlus <= 70.1576 )
					if( directionalMovementMinus <= 0.000319 )
						if( dx <= 88.3671 )
							ret := -0.134831
						if( dx > 88.3671 )
							ret := -0.450331
					if( directionalMovementMinus > 0.000319 )
						if( diMinus <= 50.5257 )
							ret := -0.862385 // sell
						if( diMinus > 50.5257 )
							ret := -0.500000
				if( diPlus > 70.1576 )
					if( smoothedTrueRange <= 0.355714 )
						if( adx <= 46.1789 )
							ret := -0.311475
						if( adx > 46.1789 )
							ret := 0.481481
					if( smoothedTrueRange > 0.355714 )
						ret := -0.857143 // sell
		if( adx > 60.5959 )
			if( diMinus <= 79.8432 )
				if( diPlus <= 50.8892 )
					if( dx <= 93.9234 )
						if( smoothedDirectionalMovementMinus <= 0.416693 )
							ret := 0.713376 // buy
						if( smoothedDirectionalMovementMinus > 0.416693 )
							ret := -0.421053
					if( dx > 93.9234 )
						if( adx <= 69.0626 )
							ret := 0.450000
						if( adx > 69.0626 )
							ret := -0.590909
				if( diPlus > 50.8892 )
					if( smoothedDirectionalMovementMinus <= 0.003849 )
						if( trueRange <= 0.325119 )
							ret := -0.025000
						if( trueRange > 0.325119 )
							ret := 0.833333 // buy
					if( smoothedDirectionalMovementMinus > 0.003849 )
						if( smoothedTrueRange <= 0.171763 )
							ret := 0.166667
						if( smoothedTrueRange > 0.171763 )
							ret := -0.715789 // sell
			if( diMinus > 79.8432 )
				if( diMinus <= 89.8209 )
					if( diMinus <= 86.0057 )
						ret := -0.818182 // sell
					if( diMinus > 86.0057 )
						ret := -1.000000 // sell
				if( diMinus > 89.8209 )
					ret := -0.444444
	
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
float op_operation = decision_tree_0_EPAM_1Min_c09a9a0c(dx, directionalMovementMinus, diPlus, smoothedDirectionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedTrueRange, directionalMovementPlus, diMinus, adx)

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


