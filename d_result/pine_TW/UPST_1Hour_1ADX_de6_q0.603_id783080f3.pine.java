//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: ADX_and_DI
// ID_model: UPST_1Hour_1ADX_783080f3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UPST_1Hour_1ADX_783080f3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UPST_1Hour_783080f3(directionalMovementPlus, directionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedDirectionalMovementMinus, diPlus, diMinus, smoothedTrueRange, adx, dx)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( diMinus <= 16.9625 )
		if( adx <= 26.8315 )
			if( diPlus <= 28.9313 )
				if( adx <= 21.6424 )
					if( diPlus <= 20.3987 )
						if( trueRange <= 1.94594 )
							ret := 0.527897
						if( trueRange > 1.94594 )
							ret := -0.857143 // sell
					if( diPlus > 20.3987 )
						if( adx <= 15.344 )
							ret := -0.400000
						if( adx > 15.344 )
							ret := 0.254032
				if( adx > 21.6424 )
					if( smoothedTrueRange <= 0.570302 )
						if( trueRange <= 0.273454 )
							ret := -0.012346
						if( trueRange > 0.273454 )
							ret := -0.737374 // sell
					if( smoothedTrueRange > 0.570302 )
						if( diPlus <= 24.6355 )
							ret := 0.531250
						if( diPlus > 24.6355 )
							ret := -0.144330
			if( diPlus > 28.9313 )
				if( smoothedDirectionalMovementMinus <= 0.544888 )
					if( diPlus <= 32.8933 )
						if( trueRange <= 0.274455 )
							ret := 0.202899
						if( trueRange > 0.274455 )
							ret := 0.674699
					if( diPlus > 32.8933 )
						if( dx <= 37.8058 )
							ret := -0.600000
						if( dx > 37.8058 )
							ret := 0.283708
				if( smoothedDirectionalMovementMinus > 0.544888 )
					if( adx <= 20.3232 )
						if( directionalMovementPlus <= 0.746387 )
							ret := -0.777778 // sell
						if( directionalMovementPlus > 0.746387 )
							ret := -1.000000 // sell
					if( adx > 20.3232 )
						ret := 0.266667
		if( adx > 26.8315 )
			if( smoothedTrueRange <= 7.1096 )
				if( smoothedDirectionalMovementPlus <= 2.90861 )
					if( dx <= 13.1342 )
						if( directionalMovementMinus <= 0.044107 )
							ret := 0.112903
						if( directionalMovementMinus > 0.044107 )
							ret := -0.642857
					if( dx > 13.1342 )
						if( smoothedTrueRange <= 0.414118 )
							ret := 0.175751
						if( smoothedTrueRange > 0.414118 )
							ret := 0.026362
				if( smoothedDirectionalMovementPlus > 2.90861 )
					if( adx <= 67.0845 )
						ret := -0.500000
					if( adx > 67.0845 )
						ret := -1.000000 // sell
			if( smoothedTrueRange > 7.1096 )
				if( smoothedDirectionalMovementPlus <= 2.99543 )
					ret := 0.333333
				if( smoothedDirectionalMovementPlus > 2.99543 )
					if( diMinus <= 10.8427 )
						ret := 1.000000 // buy
					if( diMinus > 10.8427 )
						ret := 0.700000 // buy
	if( diMinus > 16.9625 )
		if( adx <= 30.1509 )
			if( diMinus <= 35.5821 )
				if( smoothedDirectionalMovementMinus <= 0.115368 )
					if( adx <= 18.8478 )
						if( directionalMovementMinus <= 0.252657 )
							ret := -0.043200
						if( directionalMovementMinus > 0.252657 )
							ret := 0.556962
					if( adx > 18.8478 )
						if( adx <= 26.4173 )
							ret := -0.329688
						if( adx > 26.4173 )
							ret := -0.010949
				if( smoothedDirectionalMovementMinus > 0.115368 )
					if( dx <= 14.3566 )
						if( smoothedDirectionalMovementPlus <= 0.684881 )
							ret := 0.067606
						if( smoothedDirectionalMovementPlus > 0.684881 )
							ret := -0.235698
					if( dx > 14.3566 )
						if( directionalMovementMinus <= 0.055744 )
							ret := 0.129291
						if( directionalMovementMinus > 0.055744 )
							ret := 0.338834
			if( diMinus > 35.5821 )
				if( trueRange <= 2.37616 )
					if( directionalMovementPlus <= 0.074972 )
						if( adx <= 18.9167 )
							ret := -0.551724
						if( adx > 18.9167 )
							ret := -0.059524
					if( directionalMovementPlus > 0.074972 )
						if( adx <= 25.7902 )
							ret := 0.649123
						if( adx > 25.7902 )
							ret := -0.347826
				if( trueRange > 2.37616 )
					if( smoothedDirectionalMovementPlus <= 0.445106 )
						if( directionalMovementMinus <= 2.11444 )
							ret := -0.938272 // sell
						if( directionalMovementMinus > 2.11444 )
							ret := -0.641509
					if( smoothedDirectionalMovementPlus > 0.445106 )
						if( diMinus <= 38.9474 )
							ret := -0.571429
						if( diMinus > 38.9474 )
							ret := 0.289474
		if( adx > 30.1509 )
			if( adx <= 69.922 )
				if( directionalMovementPlus <= 0.001599 )
					if( smoothedDirectionalMovementPlus <= 0.168932 )
						if( trueRange <= 0.32437 )
							ret := -0.160156
						if( trueRange > 0.32437 )
							ret := 0.093838
					if( smoothedDirectionalMovementPlus > 0.168932 )
						if( diMinus <= 41.5819 )
							ret := -0.094723
						if( diMinus > 41.5819 )
							ret := -0.612022
				if( directionalMovementPlus > 0.001599 )
					if( dx <= 35.0578 )
						if( adx <= 55.8285 )
							ret := -0.029801
						if( adx > 55.8285 )
							ret := -0.616740
					if( dx > 35.0578 )
						if( diMinus <= 48.0375 )
							ret := -0.365706
						if( diMinus > 48.0375 )
							ret := 0.259259
			if( adx > 69.922 )
				if( directionalMovementMinus <= 0.084445 )
					if( diMinus <= 25.101 )
						if( smoothedDirectionalMovementPlus <= 0.115803 )
							ret := 0.000000
						if( smoothedDirectionalMovementPlus > 0.115803 )
							ret := -0.820513 // sell
					if( diMinus > 25.101 )
						if( diPlus <= 3.98339 )
							ret := -0.491228
						if( diPlus > 3.98339 )
							ret := 0.279070
				if( directionalMovementMinus > 0.084445 )
					if( directionalMovementPlus <= 0.696273 )
						if( adx <= 84.6484 )
							ret := 0.508287
						if( adx > 84.6484 )
							ret := -0.363636
					if( directionalMovementPlus > 0.696273 )
						ret := -0.500000
	
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
float op_operation = decision_tree_0_UPST_1Hour_783080f3(directionalMovementPlus, directionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedDirectionalMovementMinus, diPlus, diMinus, smoothedTrueRange, adx, dx)

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


