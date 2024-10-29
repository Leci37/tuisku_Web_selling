//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: ADX_and_DI
// ID_model: LTCUSDT_15Min_1ADX_80eddc2d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LTCUSDT_15Min_1ADX_80eddc2d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LTCUSDT_15Min_80eddc2d(dx, directionalMovementMinus, diPlus, smoothedDirectionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedTrueRange, directionalMovementPlus, diMinus, adx)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7,max_features=sqrt, min_samples_leaf=4,random_state=843828734)
	if( smoothedDirectionalMovementMinus <= 0.15049 )
		if( directionalMovementMinus <= 0.069997 )
			if( smoothedTrueRange <= 0.353411 )
				if( smoothedDirectionalMovementPlus <= 0.096752 )
					if( diPlus <= 9.60743 )
						if( dx <= 48.9647 )
							if( adx <= 15.6798 )
								ret := -0.500000
							if( adx > 15.6798 )
								ret := 0.210526
						if( dx > 48.9647 )
							if( smoothedDirectionalMovementPlus <= 0.019994 )
								ret := -0.013109
							if( smoothedDirectionalMovementPlus > 0.019994 )
								ret := 0.106212
					if( diPlus > 9.60743 )
						if( diPlus <= 10.9189 )
							if( diPlus <= 10.5278 )
								ret := -0.072511
							if( diPlus > 10.5278 )
								ret := -0.320312
						if( diPlus > 10.9189 )
							if( adx <= 74.6569 )
								ret := 0.005050
							if( adx > 74.6569 )
								ret := -0.441441
				if( smoothedDirectionalMovementPlus > 0.096752 )
					if( diMinus <= 2.89467 )
						if( smoothedDirectionalMovementMinus <= 0.002014 )
							if( smoothedTrueRange <= 0.318471 )
								ret := -0.593750
							if( smoothedTrueRange > 0.318471 )
								ret := 0.153846
						if( smoothedDirectionalMovementMinus > 0.002014 )
							if( diMinus <= 1.66099 )
								ret := -0.088235
							if( diMinus > 1.66099 )
								ret := 0.452128
					if( diMinus > 2.89467 )
						if( directionalMovementPlus <= 0.002262 )
							if( smoothedDirectionalMovementPlus <= 0.11752 )
								ret := -0.014862
							if( smoothedDirectionalMovementPlus > 0.11752 )
								ret := 0.198068
						if( directionalMovementPlus > 0.002262 )
							if( diPlus <= 32.8555 )
								ret := -0.329044
							if( diPlus > 32.8555 )
								ret := -0.107104
			if( smoothedTrueRange > 0.353411 )
				if( diMinus <= 13.9055 )
					if( adx <= 79.8436 )
						if( directionalMovementMinus <= 2e-06 )
							if( dx <= 35.8677 )
								ret := -0.241789
							if( dx > 35.8677 )
								ret := -0.133116
						if( directionalMovementMinus > 2e-06 )
							if( adx <= 20.906 )
								ret := 0.239130
							if( adx > 20.906 )
								ret := -0.095906
					if( adx > 79.8436 )
						if( diPlus <= 50.0065 )
							if( dx <= 71.8135 )
								ret := -0.260000
							if( dx > 71.8135 )
								ret := -0.694915
						if( diPlus > 50.0065 )
							if( adx <= 86.9267 )
								ret := -0.352941
							if( adx > 86.9267 )
								ret := 0.833333 // buy
				if( diMinus > 13.9055 )
					if( diPlus <= 7.87578 )
						if( smoothedDirectionalMovementMinus <= 0.084573 )
							if( adx <= 28.3577 )
								ret := 0.100000
							if( adx > 28.3577 )
								ret := 0.638298
						if( smoothedDirectionalMovementMinus > 0.084573 )
							if( diPlus <= 3.14318 )
								ret := 0.423077
							if( diPlus > 3.14318 )
								ret := 0.059937
					if( diPlus > 7.87578 )
						if( adx <= 16.6866 )
							if( dx <= 0.962362 )
								ret := 0.813953 // buy
							if( dx > 0.962362 )
								ret := 0.065912
						if( adx > 16.6866 )
							if( trueRange <= 0.458073 )
								ret := -0.051055
							if( trueRange > 0.458073 )
								ret := -0.139159
		if( directionalMovementMinus > 0.069997 )
			if( smoothedDirectionalMovementMinus <= 0.097879 )
				if( adx <= 75.5065 )
					if( adx <= 40.5125 )
						if( diMinus <= 12.6268 )
							if( smoothedTrueRange <= 0.541018 )
								ret := -0.054499
							if( smoothedTrueRange > 0.541018 )
								ret := -0.258228
						if( diMinus > 12.6268 )
							if( dx <= 48.9581 )
								ret := 0.018263
							if( dx > 48.9581 )
								ret := -0.118934
					if( adx > 40.5125 )
						if( smoothedDirectionalMovementPlus <= 0.231383 )
							if( directionalMovementPlus <= 0.233309 )
								ret := 0.055895
							if( directionalMovementPlus > 0.233309 )
								ret := -0.600000
						if( smoothedDirectionalMovementPlus > 0.231383 )
							if( trueRange <= 1.09737 )
								ret := 0.352564
							if( trueRange > 1.09737 )
								ret := -0.088608
				if( adx > 75.5065 )
					if( trueRange <= 0.430056 )
						if( smoothedDirectionalMovementMinus <= 0.043063 )
							if( directionalMovementMinus <= 0.094863 )
								ret := 0.631579
							if( directionalMovementMinus > 0.094863 )
								ret := -0.325000
						if( smoothedDirectionalMovementMinus > 0.043063 )
							if( smoothedTrueRange <= 0.45307 )
								ret := 0.633333
							if( smoothedTrueRange > 0.45307 )
								ret := 0.000000
					if( trueRange > 0.430056 )
						if( diMinus <= 5.1191 )
							if( smoothedDirectionalMovementPlus <= 0.433929 )
								ret := -0.947368 // sell
							if( smoothedDirectionalMovementPlus > 0.433929 )
								ret := -0.678571
						if( diMinus > 5.1191 )
							if( smoothedDirectionalMovementPlus <= 0.218249 )
								ret := -0.647059
							if( smoothedDirectionalMovementPlus > 0.218249 )
								ret := 0.361111
			if( smoothedDirectionalMovementMinus > 0.097879 )
				if( diPlus <= 24.2736 )
					if( dx <= 33.1555 )
						if( trueRange <= 0.470378 )
							if( smoothedDirectionalMovementMinus <= 0.121404 )
								ret := 0.167824
							if( smoothedDirectionalMovementMinus > 0.121404 )
								ret := -0.051836
						if( trueRange > 0.470378 )
							if( directionalMovementMinus <= 0.147401 )
								ret := -0.286082
							if( directionalMovementMinus > 0.147401 )
								ret := -0.018302
					if( dx > 33.1555 )
						if( diPlus <= 3.09233 )
							if( trueRange <= 0.453824 )
								ret := -0.025316
							if( trueRange > 0.453824 )
								ret := -0.507042
						if( diPlus > 3.09233 )
							if( adx <= 14.3246 )
								ret := 0.736842 // buy
							if( adx > 14.3246 )
								ret := 0.104235
				if( diPlus > 24.2736 )
					if( smoothedDirectionalMovementPlus <= 0.142728 )
						if( adx <= 16.7871 )
							if( smoothedDirectionalMovementPlus <= 0.137857 )
								ret := 0.928571 // buy
							if( smoothedDirectionalMovementPlus > 0.137857 )
								ret := 0.285714
						if( adx > 16.7871 )
							if( directionalMovementMinus <= 0.390156 )
								ret := 0.378049
							if( directionalMovementMinus > 0.390156 )
								ret := 0.777778 // buy
					if( smoothedDirectionalMovementPlus > 0.142728 )
						if( dx <= 54.2636 )
							if( dx <= 14.3489 )
								ret := 0.475309
							if( dx > 14.3489 )
								ret := 0.006361
						if( dx > 54.2636 )
							if( directionalMovementPlus <= 0.000961 )
								ret := 0.574468
							if( directionalMovementPlus > 0.000961 )
								ret := 1.000000 // buy
	if( smoothedDirectionalMovementMinus > 0.15049 )
		if( diMinus <= 30.7671 )
			if( adx <= 26.9258 )
				if( smoothedDirectionalMovementPlus <= 0.400036 )
					if( diPlus <= 9.6608 )
						if( trueRange <= 0.368865 )
							if( dx <= 57.0741 )
								ret := -0.333333
							if( dx > 57.0741 )
								ret := 1.000000 // buy
						if( trueRange > 0.368865 )
							if( adx <= 26.0418 )
								ret := -0.469697
							if( adx > 26.0418 )
								ret := -0.954545 // sell
					if( diPlus > 9.6608 )
						if( smoothedTrueRange <= 1.12519 )
							if( smoothedDirectionalMovementPlus <= 0.0675 )
								ret := 0.704918 // buy
							if( smoothedDirectionalMovementPlus > 0.0675 )
								ret := 0.093122
						if( smoothedTrueRange > 1.12519 )
							if( diPlus <= 28.1175 )
								ret := -0.031447
							if( diPlus > 28.1175 )
								ret := -1.000000 // sell
				if( smoothedDirectionalMovementPlus > 0.400036 )
					if( smoothedDirectionalMovementPlus <= 0.593571 )
						if( smoothedTrueRange <= 1.73277 )
							if( diPlus <= 36.9619 )
								ret := 1.000000 // buy
							if( diPlus > 36.9619 )
								ret := 0.800000 // buy
						if( smoothedTrueRange > 1.73277 )
							if( adx <= 17.4374 )
								ret := 0.000000
							if( adx > 17.4374 )
								ret := 0.777778 // buy
					if( smoothedDirectionalMovementPlus > 0.593571 )
						ret := -0.600000
			if( adx > 26.9258 )
				if( directionalMovementMinus <= 0.982307 )
					if( adx <= 81.4717 )
						if( smoothedTrueRange <= 3.16889 )
							if( smoothedDirectionalMovementMinus <= 0.279733 )
								ret := -0.040647
							if( smoothedDirectionalMovementMinus > 0.279733 )
								ret := -0.295154
						if( smoothedTrueRange > 3.16889 )
							if( diPlus <= 19.5764 )
								ret := 1.000000 // buy
							if( diPlus > 19.5764 )
								ret := -0.714286 // sell
					if( adx > 81.4717 )
						if( diPlus <= 7.45723 )
							if( diPlus <= 4.10198 )
								ret := -1.000000 // sell
							if( diPlus > 4.10198 )
								ret := 0.500000
						if( diPlus > 7.45723 )
							if( dx <= 51.2002 )
								ret := -1.000000 // sell
							if( dx > 51.2002 )
								ret := -0.833333 // sell
				if( directionalMovementMinus > 0.982307 )
					if( smoothedDirectionalMovementPlus <= 0.181173 )
						if( smoothedTrueRange <= 0.93 )
							if( adx <= 42.9434 )
								ret := 0.100000
							if( adx > 42.9434 )
								ret := 0.916667 // buy
						if( smoothedTrueRange > 0.93 )
							if( trueRange <= 1.77245 )
								ret := -0.833333 // sell
							if( trueRange > 1.77245 )
								ret := -0.083333
					if( smoothedDirectionalMovementPlus > 0.181173 )
						if( directionalMovementMinus <= 1.05146 )
							if( smoothedTrueRange <= 0.850145 )
								ret := 0.857143 // buy
							if( smoothedTrueRange > 0.850145 )
								ret := 1.000000 // buy
						if( directionalMovementMinus > 1.05146 )
							if( smoothedDirectionalMovementPlus <= 0.505 )
								ret := 0.628571
							if( smoothedDirectionalMovementPlus > 0.505 )
								ret := 0.000000
		if( diMinus > 30.7671 )
			if( dx <= 42.4662 )
				if( smoothedTrueRange <= 1.06453 )
					if( adx <= 21.3518 )
						if( dx <= 32.1088 )
							if( directionalMovementMinus <= 0.325 )
								ret := -0.680000
							if( directionalMovementMinus > 0.325 )
								ret := -0.017544
						if( dx > 32.1088 )
							if( dx <= 38.6836 )
								ret := 0.396396
							if( dx > 38.6836 )
								ret := -0.600000
					if( adx > 21.3518 )
						if( dx <= 40.3213 )
							if( diMinus <= 31.8085 )
								ret := 0.382022
							if( diMinus > 31.8085 )
								ret := 0.117589
						if( dx > 40.3213 )
							if( smoothedTrueRange <= 0.715357 )
								ret := -0.024845
							if( smoothedTrueRange > 0.715357 )
								ret := -0.758621 // sell
				if( smoothedTrueRange > 1.06453 )
					if( diPlus <= 20.5153 )
						if( trueRange <= 0.494405 )
							ret := 0.285714
						if( trueRange > 0.494405 )
							if( diPlus <= 13.3031 )
								ret := 0.333333
							if( diPlus > 13.3031 )
								ret := -0.757576 // sell
					if( diPlus > 20.5153 )
						if( adx <= 32.2095 )
							ret := 0.600000
						if( adx > 32.2095 )
							ret := 0.888889 // buy
			if( dx > 42.4662 )
				if( trueRange <= 1.71781 )
					if( diMinus <= 40.8153 )
						if( trueRange <= 1.10502 )
							if( adx <= 45.2112 )
								ret := 0.120096
							if( adx > 45.2112 )
								ret := 0.277263
						if( trueRange > 1.10502 )
							if( diMinus <= 33.8901 )
								ret := 0.226562
							if( diMinus > 33.8901 )
								ret := 0.650224
					if( diMinus > 40.8153 )
						if( dx <= 51.0336 )
							if( diMinus <= 42.3376 )
								ret := 0.807018 // buy
							if( diMinus > 42.3376 )
								ret := 0.308824
						if( dx > 51.0336 )
							if( diPlus <= 2.73606 )
								ret := 0.223275
							if( diPlus > 2.73606 )
								ret := 0.014158
				if( trueRange > 1.71781 )
					if( diMinus <= 44.13 )
						if( diMinus <= 37.7004 )
							if( dx <= 47.0557 )
								ret := 0.000000
							if( dx > 47.0557 )
								ret := 0.926606 // buy
						if( diMinus > 37.7004 )
							if( diMinus <= 42.915 )
								ret := 0.526316
							if( diMinus > 42.915 )
								ret := 1.000000 // buy
					if( diMinus > 44.13 )
						if( diMinus <= 44.7256 )
							ret := -1.000000 // sell
						if( diMinus > 44.7256 )
							if( adx <= 85.617 )
								ret := 0.354740
							if( adx > 85.617 )
								ret := 0.954545 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_LTCUSDT_15Min_80eddc2d(dx, directionalMovementMinus, diPlus, smoothedDirectionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedTrueRange, directionalMovementPlus, diMinus, adx)

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


