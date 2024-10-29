//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: SHOP_30Min_1FIB_7edc5b2b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SHOP_30Min_1FIB_7edc5b2b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SHOP_30Min_7edc5b2b(basis, upper_2, upper_3, lower_2, lower_6, lower_1, basis_minus, lower_3, upper_6, lower_5, lower_4, upper_5, upper_4, basis_max, upper_1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( lower_2 <= 1114.08 )
		if( lower_2 <= 1095.08 )
			if( upper_6 <= 31.9761 )
				if( lower_5 <= 24.6551 )
					if( basis <= 21.8349 )
						if( lower_1 <= 20.6791 )
							ret := 0.173653
						if( lower_1 > 20.6791 )
							ret := 0.636943
					if( basis > 21.8349 )
						if( upper_6 <= 29.4746 )
							ret := -0.315018
						if( upper_6 > 29.4746 )
							ret := 0.092807
				if( lower_5 > 24.6551 )
					if( lower_1 <= 27.6223 )
						if( basis_minus <= 2.46682 )
							ret := 0.681373
						if( basis_minus > 2.46682 )
							ret := 0.324324
					if( lower_1 > 27.6223 )
						if( upper_4 <= 30.382 )
							ret := -0.284314
						if( upper_4 > 30.382 )
							ret := 0.498592
			if( upper_6 > 31.9761 )
				if( upper_1 <= 984.468 )
					if( basis <= 908.66 )
						if( upper_2 <= 948.041 )
							ret := 0.004484
						if( upper_2 > 948.041 )
							ret := -0.536313
					if( basis > 908.66 )
						if( basis <= 934.199 )
							ret := 0.621302
						if( basis > 934.199 )
							ret := 0.138889
				if( upper_1 > 984.468 )
					if( lower_5 <= 864.066 )
						if( basis_max <= -271.876 )
							ret := 0.639344
						if( basis_max > -271.876 )
							ret := -0.425816
					if( lower_5 > 864.066 )
						if( lower_5 <= 1040.27 )
							ret := -0.051649
						if( lower_5 > 1040.27 )
							ret := -0.537736
		if( lower_2 > 1095.08 )
			if( lower_2 <= 1109.7 )
				if( upper_4 <= 1230.49 )
					if( lower_1 <= 1117.34 )
						if( lower_3 <= 1087.43 )
							ret := 0.705128 // buy
						if( lower_3 > 1087.43 )
							ret := 0.277027
					if( lower_1 > 1117.34 )
						if( lower_5 <= 1053.84 )
							ret := -0.885714 // sell
						if( lower_5 > 1053.84 )
							ret := -0.015625
				if( upper_4 > 1230.49 )
					if( lower_3 <= 1079.77 )
						if( upper_3 <= 1291.76 )
							ret := -0.250000
						if( upper_3 > 1291.76 )
							ret := 0.636364
					if( lower_3 > 1079.77 )
						if( upper_5 <= 1322.65 )
							ret := 0.875648 // buy
						if( upper_5 > 1322.65 )
							ret := 0.551724
			if( lower_2 > 1109.7 )
				if( lower_4 <= 1067.33 )
					if( basis_minus <= 225.942 )
						if( lower_1 <= 1138.49 )
							ret := -0.095238
						if( lower_1 > 1138.49 )
							ret := -0.804348 // sell
					if( basis_minus > 225.942 )
						ret := 0.800000 // buy
				if( lower_4 > 1067.33 )
					if( basis_minus <= 145.138 )
						if( upper_2 <= 1213.25 )
							ret := 0.459016
						if( upper_2 > 1213.25 )
							ret := -0.509091
					if( basis_minus > 145.138 )
						if( lower_1 <= 1135.73 )
							ret := 0.900000 // buy
						if( lower_1 > 1135.73 )
							ret := 0.075472
	if( lower_2 > 1114.08 )
		if( basis_minus <= 57.0072 )
			if( basis_max <= -47.4669 )
				if( basis_minus <= 53.417 )
					if( lower_5 <= 1411.65 )
						if( upper_3 <= 1213.94 )
							ret := -0.818182 // sell
						if( upper_3 > 1213.94 )
							ret := -1.000000 // sell
					if( lower_5 > 1411.65 )
						if( lower_2 <= 1520.07 )
							ret := -0.375000
						if( lower_2 > 1520.07 )
							ret := -0.916667 // sell
				if( basis_minus > 53.417 )
					if( basis_max <= -54.5464 )
						if( basis_max <= -56.5446 )
							ret := -1.000000 // sell
						if( basis_max > -56.5446 )
							ret := -0.681818
					if( basis_max > -54.5464 )
						ret := -0.272727
			if( basis_max > -47.4669 )
				if( lower_6 <= 1144.55 )
					if( lower_3 <= 1167.17 )
						if( lower_2 <= 1171.64 )
							ret := 0.066667
						if( lower_2 > 1171.64 )
							ret := -0.777778 // sell
					if( lower_3 > 1167.17 )
						ret := 0.600000
				if( lower_6 > 1144.55 )
					if( basis_max <= -46.0147 )
						ret := -0.071429
					if( basis_max > -46.0147 )
						ret := -1.000000 // sell
		if( basis_minus > 57.0072 )
			if( lower_4 <= 1081.13 )
				if( lower_4 <= 1061.4 )
					if( upper_2 <= 1371.15 )
						ret := 0.941176 // buy
					if( upper_2 > 1371.15 )
						ret := 0.071429
				if( lower_4 > 1061.4 )
					if( basis_max <= -182.893 )
						if( basis <= 1192.24 )
							ret := 0.777778 // buy
						if( basis > 1192.24 )
							ret := -0.598174
					if( basis_max > -182.893 )
						if( lower_2 <= 1115.38 )
							ret := -0.583333
						if( lower_2 > 1115.38 )
							ret := -0.986486 // sell
			if( lower_4 > 1081.13 )
				if( upper_5 <= 1812.5 )
					if( lower_6 <= 1044.18 )
						if( lower_6 <= 1026.58 )
							ret := -0.047297
						if( lower_6 > 1026.58 )
							ret := 0.584507
					if( lower_6 > 1044.18 )
						if( lower_4 <= 1102.16 )
							ret := -0.627451
						if( lower_4 > 1102.16 )
							ret := -0.079506
				if( upper_5 > 1812.5 )
					if( basis_minus <= 236.159 )
						ret := -0.777778 // sell
					if( basis_minus > 236.159 )
						ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Fibonacci_Bollinger 
//@version=5
//indicator shorttitle="FBB", title="Fibonacci Bollinger Bands", overlay=true)

// Inputs
length_FiboBB = input.int(200, minval=1)
src = input(hlc3, title="Source")
mult = input.float(3.0, minval=0.001, maxval=50)

// Calculations
basis = ta.vwma(src, length_FiboBB)
dev = mult * ta.stdev(src, length_FiboBB)

// Upper Bands
upper_1 = basis + (0.236 * dev)
upper_2 = basis + (0.382 * dev)
upper_3 = basis + (0.5 * dev)
upper_4 = basis + (0.618 * dev)
upper_5 = basis + (0.764 * dev)
upper_6 = basis + (1 * dev)

// Lower Bands
lower_1 = basis - (0.236 * dev)
lower_2 = basis - (0.382 * dev)
lower_3 = basis - (0.5 * dev)
lower_4 = basis - (0.618 * dev)
lower_5 = basis - (0.764 * dev)
lower_6 = basis - (1 * dev)

basis_minus = basis -lower_6
basis_max = basis -upper_6

// Plotting
plot(basis, color=color.fuchsia, linewidth=2)
plot(upper_1, color=color.white, linewidth=1, title="0.236")
plot(upper_2, color=color.white, linewidth=1, title="0.382")
plot(upper_3, color=color.white, linewidth=1, title="0.5")
plot(upper_4, color=color.white, linewidth=1, title="0.618")
plot(upper_5, color=color.white, linewidth=1, title="0.764")
plot(upper_6, color=color.red, linewidth=2, title="1")
plot(lower_1, color=color.white, linewidth=1, title="0.236")
plot(lower_2, color=color.white, linewidth=1, title="0.382")
plot(lower_3, color=color.white, linewidth=1, title="0.5")
plot(lower_4, color=color.white, linewidth=1, title="0.618")
plot(lower_5, color=color.white, linewidth=1, title="0.764")
plot(lower_6, color=color.green, linewidth=2, title="1")

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
float op_operation = decision_tree_0_SHOP_30Min_7edc5b2b(basis, upper_2, upper_3, lower_2, lower_6, lower_1, basis_minus, lower_3, upper_6, lower_5, lower_4, upper_5, upper_4, basis_max, upper_1)

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


