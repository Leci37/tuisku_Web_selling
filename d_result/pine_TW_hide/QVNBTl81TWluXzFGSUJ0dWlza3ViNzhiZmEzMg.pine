//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: ASAN_5Min_1FIB_b78bfa32 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ASAN_5Min_1FIB_b78bfa32", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ASAN_5Min_b78bfa32(basis_max, upper_1, lower_2, upper_2, lower_3, lower_6, basis_minus, lower_4, upper_4, upper_5, basis, upper_3, lower_5, upper_6, lower_1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6,max_features=sqrt, min_samples_split=10,random_state=843828734)
	if( lower_2 <= 23.3259 )
		if( lower_5 <= 11.0491 )
			if( lower_4 <= 11.2824 )
				if( upper_1 <= 11.3605 )
					if( lower_5 <= 11.0167 )
						if( lower_2 <= 11.1331 )
							ret := 1.000000 // buy
						if( lower_2 > 11.1331 )
							ret := -0.083333
					if( lower_5 > 11.0167 )
						if( lower_4 <= 11.068 )
							ret := 0.939394 // buy
						if( lower_4 > 11.068 )
							ret := 0.634615
				if( upper_1 > 11.3605 )
					if( lower_3 <= 11.1598 )
						if( upper_5 <= 14.4734 )
							ret := -0.073705
						if( upper_5 > 14.4734 )
							ret := 0.318681
					if( lower_3 > 11.1598 )
						if( upper_6 <= 12.2321 )
							ret := 0.754967 // buy
						if( upper_6 > 12.2321 )
							ret := 0.178174
			if( lower_4 > 11.2824 )
				if( upper_2 <= 14.5044 )
					if( basis <= 13.3098 )
						if( basis_max <= -1.9654 )
							ret := -1.000000 // sell
						if( basis_max > -1.9654 )
							ret := -0.600000
					if( basis > 13.3098 )
						ret := 0.600000
				if( upper_2 > 14.5044 )
					ret := 0.200000
		if( lower_5 > 11.0491 )
			if( upper_3 <= 23.6066 )
				if( basis_minus <= 0.901064 )
					if( upper_6 <= 23.1461 )
						if( upper_6 <= 23.0058 )
							ret := -0.023966
						if( upper_6 > 23.0058 )
							ret := 0.729032 // buy
					if( upper_6 > 23.1461 )
						if( upper_2 <= 22.9025 )
							ret := -0.601190
						if( upper_2 > 22.9025 )
							ret := -0.143791
				if( basis_minus > 0.901064 )
					if( lower_3 <= 22.219 )
						if( basis_max <= -3.215 )
							ret := -0.426230
						if( basis_max > -3.215 )
							ret := 0.046952
					if( lower_3 > 22.219 )
						if( upper_3 <= 23.5476 )
							ret := 0.410112
						if( upper_3 > 23.5476 )
							ret := 0.906250 // buy
			if( upper_3 > 23.6066 )
				if( basis_minus <= 1.13746 )
					if( basis <= 23.5587 )
						if( upper_4 <= 24.2041 )
							ret := 0.755814 // buy
						if( upper_4 > 24.2041 )
							ret := -0.333333
					if( basis > 23.5587 )
						if( upper_5 <= 24.4394 )
							ret := 0.006098
						if( upper_5 > 24.4394 )
							ret := 0.756757 // buy
				if( basis_minus > 1.13746 )
					if( upper_1 <= 24.3959 )
						if( upper_4 <= 25.0281 )
							ret := -0.141093
						if( upper_4 > 25.0281 )
							ret := -0.740000 // sell
					if( upper_1 > 24.3959 )
						if( basis_max <= -2.74937 )
							ret := 0.191176
						if( basis_max > -2.74937 )
							ret := 0.744186 // buy
	if( lower_2 > 23.3259 )
		if( basis_minus <= 1.49531 )
			if( lower_6 <= 23.8816 )
				if( lower_3 <= 24.0751 )
					if( lower_2 <= 23.8309 )
						if( upper_1 <= 24.2611 )
							ret := -0.237805
						if( upper_1 > 24.2611 )
							ret := 0.636364
					if( lower_2 > 23.8309 )
						if( lower_6 <= 23.2284 )
							ret := 1.000000 // buy
						if( lower_6 > 23.2284 )
							ret := -0.807018 // sell
				if( lower_3 > 24.0751 )
					if( basis_max <= -0.919034 )
						if( lower_1 <= 24.4146 )
							ret := 0.909091 // buy
						if( lower_1 > 24.4146 )
							ret := -0.036145
					if( basis_max > -0.919034 )
						if( basis_minus <= 0.909093 )
							ret := 0.562500
						if( basis_minus > 0.909093 )
							ret := 0.954545 // buy
			if( lower_6 > 23.8816 )
				if( upper_1 <= 25.4621 )
					if( lower_1 <= 24.549 )
						if( lower_3 <= 24.3308 )
							ret := -0.953488 // sell
						if( lower_3 > 24.3308 )
							ret := 0.000000
					if( lower_1 > 24.549 )
						if( lower_6 <= 23.9482 )
							ret := 0.162162
						if( lower_6 > 23.9482 )
							ret := -0.666667
				if( upper_1 > 25.4621 )
					if( upper_2 <= 25.6554 )
						ret := -1.000000 // sell
					if( upper_2 > 25.6554 )
						if( lower_4 <= 24.3955 )
							ret := -1.000000 // sell
						if( lower_4 > 24.3955 )
							ret := 0.000000
		if( basis_minus > 1.49531 )
			if( lower_2 <= 23.8328 )
				if( upper_3 <= 25.2782 )
					if( upper_1 <= 24.2801 )
						ret := -0.875000 // sell
					if( upper_1 > 24.2801 )
						ret := -1.000000 // sell
				if( upper_3 > 25.2782 )
					if( lower_2 <= 23.4022 )
						if( basis_minus <= 2.70127 )
							ret := 1.000000 // buy
						if( basis_minus > 2.70127 )
							ret := 0.400000
					if( lower_2 > 23.4022 )
						if( basis_max <= -2.2663 )
							ret := -0.758621 // sell
						if( basis_max > -2.2663 )
							ret := 0.000000
			if( lower_2 > 23.8328 )
				if( basis_max <= -1.58785 )
					if( upper_6 <= 26.621 )
						if( lower_6 <= 23.0796 )
							ret := -0.666667
						if( lower_6 > 23.0796 )
							ret := -0.959459 // sell
					if( upper_6 > 26.621 )
						ret := -0.250000
				if( basis_max > -1.58785 )
					if( lower_1 <= 24.652 )
						if( lower_6 <= 23.4461 )
							ret := -0.125000
						if( lower_6 > 23.4461 )
							ret := -1.000000 // sell
					if( lower_1 > 24.652 )
						if( upper_1 <= 25.3949 )
							ret := 1.000000 // buy
						if( upper_1 > 25.3949 )
							ret := -0.200000
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_ASAN_5Min_b78bfa32(basis_max, upper_1, lower_2, upper_2, lower_3, lower_6, basis_minus, lower_4, upper_4, upper_5, basis, upper_3, lower_5, upper_6, lower_1)

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


