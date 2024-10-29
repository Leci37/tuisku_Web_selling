//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: ADX_and_DI
// ID_model: FFIV_30Min_1ADX_7d375b4b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_FFIV_30Min_1ADX_7d375b4b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_FFIV_30Min_7d375b4b(dx, directionalMovementMinus, diPlus, smoothedDirectionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedTrueRange, directionalMovementPlus, diMinus, adx)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( smoothedDirectionalMovementPlus <= 0.115151 )
		if( smoothedDirectionalMovementMinus <= 0.441298 )
			if( adx <= 78.0193 )
				if( adx <= 12.5321 )
					if( smoothedDirectionalMovementMinus <= 0.146095 )
						if( smoothedTrueRange <= 0.628082 )
							ret := -0.172185
						if( smoothedTrueRange > 0.628082 )
							ret := 0.727273 // buy
					if( smoothedDirectionalMovementMinus > 0.146095 )
						if( smoothedDirectionalMovementMinus <= 0.193934 )
							ret := -0.825397 // sell
						if( smoothedDirectionalMovementMinus > 0.193934 )
							ret := -0.125000
				if( adx > 12.5321 )
					if( adx <= 13.5107 )
						if( dx <= 5.8072 )
							ret := 0.000000
						if( dx > 5.8072 )
							ret := 0.662921
					if( adx > 13.5107 )
						if( trueRange <= 2.08173 )
							ret := 0.063341
						if( trueRange > 2.08173 )
							ret := 0.457317
			if( adx > 78.0193 )
				if( diMinus <= 22.6052 )
					if( smoothedTrueRange <= 0.614318 )
						if( smoothedTrueRange <= 0.349925 )
							ret := -0.181818
						if( smoothedTrueRange > 0.349925 )
							ret := 0.533333
					if( smoothedTrueRange > 0.614318 )
						ret := -1.000000 // sell
				if( diMinus > 22.6052 )
					if( smoothedTrueRange <= 1.0261 )
						if( diMinus <= 50.558 )
							ret := 0.850467 // buy
						if( diMinus > 50.558 )
							ret := -0.071429
					if( smoothedTrueRange > 1.0261 )
						ret := 0.000000
		if( smoothedDirectionalMovementMinus > 0.441298 )
			if( smoothedDirectionalMovementPlus <= 0.082093 )
				if( directionalMovementPlus <= 0.410248 )
					if( diPlus <= 6.83516 )
						if( adx <= 54.4383 )
							ret := -0.349081
						if( adx > 54.4383 )
							ret := 0.076115
					if( diPlus > 6.83516 )
						if( adx <= 49.4257 )
							ret := 0.051724
						if( adx > 49.4257 )
							ret := -0.802632 // sell
				if( directionalMovementPlus > 0.410248 )
					if( directionalMovementMinus <= 0.028493 )
						if( smoothedDirectionalMovementMinus <= 0.555914 )
							ret := 0.857143 // buy
						if( smoothedDirectionalMovementMinus > 0.555914 )
							ret := 0.000000
					if( directionalMovementMinus > 0.028493 )
						ret := -1.000000 // sell
			if( smoothedDirectionalMovementPlus > 0.082093 )
				if( diPlus <= 5.54462 )
					if( adx <= 42.8276 )
						ret := -0.333333
					if( adx > 42.8276 )
						if( smoothedDirectionalMovementPlus <= 0.107215 )
							ret := 0.850000 // buy
						if( smoothedDirectionalMovementPlus > 0.107215 )
							ret := -1.000000 // sell
				if( diPlus > 5.54462 )
					if( diMinus <= 59.2872 )
						if( diMinus <= 57.9903 )
							ret := 0.042793
						if( diMinus > 57.9903 )
							ret := -0.954545 // sell
					if( diMinus > 59.2872 )
						if( directionalMovementPlus <= 0.098267 )
							ret := 0.842105 // buy
						if( directionalMovementPlus > 0.098267 )
							ret := 0.000000
	if( smoothedDirectionalMovementPlus > 0.115151 )
		if( adx <= 17.9625 )
			if( directionalMovementPlus <= 5.3e-05 )
				if( smoothedTrueRange <= 2.24179 )
					if( smoothedDirectionalMovementPlus <= 0.285115 )
						if( smoothedTrueRange <= 1.03 )
							ret := 0.007031
						if( smoothedTrueRange > 1.03 )
							ret := 0.301887
					if( smoothedDirectionalMovementPlus > 0.285115 )
						if( diPlus <= 28.5492 )
							ret := 0.145833
						if( diPlus > 28.5492 )
							ret := -0.337209
				if( smoothedTrueRange > 2.24179 )
					if( diPlus <= 19.1361 )
						ret := -1.000000 // sell
					if( diPlus > 19.1361 )
						if( diMinus <= 5.62702 )
							ret := 0.000000
						if( diMinus > 5.62702 )
							ret := 1.000000 // buy
			if( directionalMovementPlus > 5.3e-05 )
				if( dx <= 34.7327 )
					if( smoothedTrueRange <= 1.09465 )
						if( smoothedDirectionalMovementPlus <= 0.131617 )
							ret := 0.258993
						if( smoothedDirectionalMovementPlus > 0.131617 )
							ret := -0.129935
					if( smoothedTrueRange > 1.09465 )
						if( dx <= 1.24368 )
							ret := 0.785714 // buy
						if( dx > 1.24368 )
							ret := -0.507865
				if( dx > 34.7327 )
					if( smoothedTrueRange <= 0.480157 )
						if( diMinus <= 9.7078 )
							ret := 1.000000 // buy
						if( diMinus > 9.7078 )
							ret := 0.076923
					if( smoothedTrueRange > 0.480157 )
						if( diMinus <= 19.7091 )
							ret := -0.580000
						if( diMinus > 19.7091 )
							ret := 0.500000
		if( adx > 17.9625 )
			if( smoothedTrueRange <= 4.0889 )
				if( smoothedDirectionalMovementPlus <= 0.835348 )
					if( diMinus <= 43.1701 )
						if( diMinus <= 38.5446 )
							ret := 0.000875
						if( diMinus > 38.5446 )
							ret := 0.235294
					if( diMinus > 43.1701 )
						if( adx <= 36.5764 )
							ret := -0.304348
						if( adx > 36.5764 )
							ret := -0.066740
				if( smoothedDirectionalMovementPlus > 0.835348 )
					if( smoothedDirectionalMovementMinus <= 0.517496 )
						if( adx <= 66.0686 )
							ret := -0.241287
						if( adx > 66.0686 )
							ret := -0.852349 // sell
					if( smoothedDirectionalMovementMinus > 0.517496 )
						if( diPlus <= 51.97 )
							ret := 0.530973
						if( diPlus > 51.97 )
							ret := -1.000000 // sell
			if( smoothedTrueRange > 4.0889 )
				if( adx <= 47.0244 )
					if( directionalMovementMinus <= 2.75949 )
						ret := -0.666667
					if( directionalMovementMinus > 2.75949 )
						ret := 1.000000 // buy
				if( adx > 47.0244 )
					if( adx <= 82.7306 )
						if( smoothedTrueRange <= 6.34089 )
							ret := 1.000000 // buy
						if( smoothedTrueRange > 6.34089 )
							ret := 0.000000
					if( adx > 82.7306 )
						ret := 0.250000
	
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
float op_operation = decision_tree_0_FFIV_30Min_7d375b4b(dx, directionalMovementMinus, diPlus, smoothedDirectionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedTrueRange, directionalMovementPlus, diMinus, adx)

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


