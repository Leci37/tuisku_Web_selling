//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: ZI_15Min_1FIB_9e8946b3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ZI_15Min_1FIB_9e8946b3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ZI_15Min_9e8946b3(basis_minus, lower_4, lower_6, upper_1, upper_3, lower_2, basis, upper_4, upper_5, lower_1, upper_6, lower_3, basis_max, lower_5, upper_2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6,max_features=sqrt, min_samples_split=10,random_state=843828734)
	if( upper_6 <= 67.7394 )
		if( basis <= 56.2124 )
			if( upper_4 <= 52.444 )
				if( lower_4 <= 44.3309 )
					if( upper_6 <= 54.9075 )
						if( lower_6 <= 41.0657 )
							ret := 0.015970
						if( lower_6 > 41.0657 )
							ret := -0.147425
					if( upper_6 > 54.9075 )
						if( upper_2 <= 49.1039 )
							ret := 0.024691
						if( upper_2 > 49.1039 )
							ret := 0.595745
				if( lower_4 > 44.3309 )
					if( basis_minus <= 2.25794 )
						if( upper_1 <= 48.5141 )
							ret := 0.803279 // buy
						if( upper_1 > 48.5141 )
							ret := 0.187500
					if( basis_minus > 2.25794 )
						if( lower_5 <= 44.0089 )
							ret := 0.500000
						if( lower_5 > 44.0089 )
							ret := 0.070089
			if( upper_4 > 52.444 )
				if( upper_1 <= 51.8662 )
					if( lower_2 <= 47.3551 )
						if( basis_minus <= 12.373 )
							ret := -0.144809
						if( basis_minus > 12.373 )
							ret := 0.561404
					if( lower_2 > 47.3551 )
						if( upper_6 <= 54.4724 )
							ret := -0.239130
						if( upper_6 > 54.4724 )
							ret := -0.770992 // sell
				if( upper_1 > 51.8662 )
					if( basis <= 51.1574 )
						if( lower_4 <= 40.7072 )
							ret := -0.553846
						if( lower_4 > 40.7072 )
							ret := 0.238542
					if( basis > 51.1574 )
						if( basis <= 51.3279 )
							ret := -0.604651
						if( basis > 51.3279 )
							ret := -0.080281
		if( basis > 56.2124 )
			if( upper_3 <= 58.036 )
				if( lower_1 <= 55.5341 )
					if( upper_2 <= 57.6149 )
						if( basis_minus <= 3.56907 )
							ret := 0.740000 // buy
						if( basis_minus > 3.56907 )
							ret := 1.000000 // buy
					if( upper_2 > 57.6149 )
						ret := 0.000000
				if( lower_1 > 55.5341 )
					if( basis_max <= -3.24019 )
						ret := -0.666667
					if( basis_max > -3.24019 )
						if( basis_minus <= 3.20071 )
							ret := 0.000000
						if( basis_minus > 3.20071 )
							ret := 0.628571
			if( upper_3 > 58.036 )
				if( upper_5 <= 64.8515 )
					if( lower_4 <= 50.4271 )
						if( upper_6 <= 67.401 )
							ret := 1.000000 // buy
						if( upper_6 > 67.401 )
							ret := 0.000000
					if( lower_4 > 50.4271 )
						if( basis_minus <= 2.67485 )
							ret := 0.546154
						if( basis_minus > 2.67485 )
							ret := 0.022876
				if( upper_5 > 64.8515 )
					if( upper_1 <= 63.3158 )
						if( basis <= 60.3198 )
							ret := 0.905263 // buy
						if( basis > 60.3198 )
							ret := 0.603175
					if( upper_1 > 63.3158 )
						if( lower_2 <= 62.54 )
							ret := 0.129032
						if( lower_2 > 62.54 )
							ret := 0.920000 // buy
	if( upper_6 > 67.7394 )
		if( upper_3 <= 66.2761 )
			if( lower_5 <= 58.6809 )
				if( lower_2 <= 55.6895 )
					if( lower_2 <= 54.1883 )
						if( lower_1 <= 47.39 )
							ret := -0.214765
						if( lower_1 > 47.39 )
							ret := -0.539823
					if( lower_2 > 54.1883 )
						if( upper_1 <= 61.9942 )
							ret := 0.825000 // buy
						if( upper_1 > 61.9942 )
							ret := 0.411765
				if( lower_2 > 55.6895 )
					if( upper_6 <= 69.8639 )
						if( lower_4 <= 55.3549 )
							ret := -0.766667 // sell
						if( lower_4 > 55.3549 )
							ret := -0.268199
					if( upper_6 > 69.8639 )
						if( upper_2 <= 65.2011 )
							ret := -0.755556 // sell
						if( upper_2 > 65.2011 )
							ret := 0.166667
			if( lower_5 > 58.6809 )
				if( lower_3 <= 60.3411 )
					if( lower_5 <= 58.8216 )
						if( lower_3 <= 60.1891 )
							ret := 0.705882 // buy
						if( lower_3 > 60.1891 )
							ret := 0.105263
					if( lower_5 > 58.8216 )
						if( upper_1 <= 64.0931 )
							ret := 0.875000 // buy
						if( upper_1 > 64.0931 )
							ret := 1.000000 // buy
				if( lower_3 > 60.3411 )
					if( upper_1 <= 64.1037 )
						if( upper_5 <= 66.6949 )
							ret := -0.153846
						if( upper_5 > 66.6949 )
							ret := 0.777778 // buy
					if( upper_1 > 64.1037 )
						if( upper_5 <= 66.8444 )
							ret := -0.880000 // sell
						if( upper_5 > 66.8444 )
							ret := -0.232323
		if( upper_3 > 66.2761 )
			if( lower_2 <= 60.5041 )
				if( lower_5 <= 53.6714 )
					if( upper_5 <= 73.3017 )
						if( lower_5 <= 51.99 )
							ret := 0.961538 // buy
						if( lower_5 > 51.99 )
							ret := -0.077465
					if( upper_5 > 73.3017 )
						if( upper_5 <= 73.7029 )
							ret := -0.857143 // sell
						if( upper_5 > 73.7029 )
							ret := 0.000000
				if( lower_5 > 53.6714 )
					if( upper_4 <= 67.6939 )
						if( upper_3 <= 66.368 )
							ret := 0.384615
						if( upper_3 > 66.368 )
							ret := 0.835821 // buy
					if( upper_4 > 67.6939 )
						if( upper_3 <= 70.3053 )
							ret := 0.116279
						if( upper_3 > 70.3053 )
							ret := 0.659574
			if( lower_2 > 60.5041 )
				if( lower_4 <= 58.8638 )
					if( upper_3 <= 70.1566 )
						if( upper_6 <= 72.376 )
							ret := -0.800000 // sell
						if( upper_6 > 72.376 )
							ret := -0.187500
					if( upper_3 > 70.1566 )
						if( basis <= 64.844 )
							ret := -0.400000
						if( basis > 64.844 )
							ret := -1.000000 // sell
				if( lower_4 > 58.8638 )
					if( lower_1 <= 75.2221 )
						if( basis_max <= -3.19845 )
							ret := -0.005481
						if( basis_max > -3.19845 )
							ret := -0.210526
					if( lower_1 > 75.2221 )
						ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_ZI_15Min_9e8946b3(basis_minus, lower_4, lower_6, upper_1, upper_3, lower_2, basis, upper_4, upper_5, lower_1, upper_6, lower_3, basis_max, lower_5, upper_2)

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


