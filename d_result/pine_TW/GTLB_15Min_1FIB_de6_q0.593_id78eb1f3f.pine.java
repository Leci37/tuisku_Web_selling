//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: GTLB_15Min_1FIB_78eb1f3f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GTLB_15Min_1FIB_78eb1f3f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GTLB_15Min_78eb1f3f(upper_2, basis, lower_6, basis_minus, lower_5, upper_5, upper_4, basis_max, upper_6, upper_3, lower_2, upper_1, lower_4, lower_1, lower_3)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6,max_features=sqrt, min_samples_split=10,random_state=843828734)
	if( upper_2 <= 47.2501 )
		if( upper_4 <= 38.8478 )
			if( basis_max <= -2.87219 )
				if( basis <= 28.0057 )
					if( basis_minus <= 3.34475 )
						ret := 0.400000
					if( basis_minus > 3.34475 )
						if( upper_1 <= 28.7614 )
							ret := 0.666667
						if( upper_1 > 28.7614 )
							ret := 0.976744 // buy
				if( basis > 28.0057 )
					if( basis_max <= -3.28907 )
						if( lower_5 <= 24.671 )
							ret := -0.861111 // sell
						if( lower_5 > 24.671 )
							ret := -0.012903
					if( basis_max > -3.28907 )
						if( upper_3 <= 31.5731 )
							ret := -0.391304
						if( upper_3 > 31.5731 )
							ret := 0.465950
			if( basis_max > -2.87219 )
				if( basis_max <= -2.64621 )
					if( upper_5 <= 38.7062 )
						if( basis <= 34.1767 )
							ret := -0.628205
						if( basis > 34.1767 )
							ret := 0.235294
					if( upper_5 > 38.7062 )
						if( upper_2 <= 37.7621 )
							ret := -0.909091 // sell
						if( upper_2 > 37.7621 )
							ret := 0.000000
				if( basis_max > -2.64621 )
					if( upper_1 <= 34.6253 )
						if( lower_3 <= 33.153 )
							ret := -0.090551
						if( lower_3 > 33.153 )
							ret := -1.000000 // sell
					if( upper_1 > 34.6253 )
						if( lower_1 <= 33.4424 )
							ret := 1.000000 // buy
						if( lower_1 > 33.4424 )
							ret := 0.353846
		if( upper_4 > 38.8478 )
			if( basis <= 45.2626 )
				if( basis <= 44.553 )
					if( upper_2 <= 39.7124 )
						if( basis <= 33.2649 )
							ret := -0.735294 // sell
						if( basis > 33.2649 )
							ret := 0.648579
					if( upper_2 > 39.7124 )
						if( upper_3 <= 40.4243 )
							ret := -0.647059
						if( upper_3 > 40.4243 )
							ret := 0.126802
				if( basis > 44.553 )
					if( lower_4 <= 41.7262 )
						if( lower_2 <= 42.7357 )
							ret := -0.383929
						if( lower_2 > 42.7357 )
							ret := -0.878049 // sell
					if( lower_4 > 41.7262 )
						if( upper_6 <= 49.9068 )
							ret := -0.130307
						if( upper_6 > 49.9068 )
							ret := 0.771429 // buy
			if( basis > 45.2626 )
				if( upper_5 <= 47.9613 )
					if( upper_5 <= 47.7267 )
						if( basis_max <= -1.17077 )
							ret := 0.539474
						if( basis_max > -1.17077 )
							ret := -0.051282
					if( upper_5 > 47.7267 )
						if( upper_2 <= 47.2348 )
							ret := -0.057143
						if( upper_2 > 47.2348 )
							ret := -0.285714
				if( upper_5 > 47.9613 )
					if( lower_1 <= 44.3344 )
						if( upper_2 <= 46.9494 )
							ret := 1.000000 // buy
						if( upper_2 > 46.9494 )
							ret := 0.573171
					if( lower_1 > 44.3344 )
						if( upper_1 <= 46.5703 )
							ret := 0.146341
						if( upper_1 > 46.5703 )
							ret := 0.640288
	if( upper_2 > 47.2501 )
		if( upper_4 <= 126.493 )
			if( lower_4 <= 97.4128 )
				if( upper_5 <= 74.561 )
					if( upper_3 <= 70.9334 )
						if( lower_3 <= 36.86 )
							ret := -0.207711
						if( lower_3 > 36.86 )
							ret := -0.015622
					if( upper_3 > 70.9334 )
						if( lower_2 <= 70.8798 )
							ret := 0.231678
						if( lower_2 > 70.8798 )
							ret := 0.595745
				if( upper_5 > 74.561 )
					if( upper_5 <= 80.173 )
						if( upper_3 <= 78.1576 )
							ret := -0.236636
						if( upper_3 > 78.1576 )
							ret := -0.894737 // sell
					if( upper_5 > 80.173 )
						if( upper_1 <= 92.4115 )
							ret := 0.058786
						if( upper_1 > 92.4115 )
							ret := -0.239374
			if( lower_4 > 97.4128 )
				if( upper_5 <= 129.579 )
					if( basis_max <= -13.8735 )
						if( upper_2 <= 117.53 )
							ret := -0.846154 // sell
						if( upper_2 > 117.53 )
							ret := 0.473684
					if( basis_max > -13.8735 )
						if( basis_minus <= 11.1051 )
							ret := 0.170732
						if( basis_minus > 11.1051 )
							ret := 0.830065 // buy
				if( upper_5 > 129.579 )
					ret := -1.000000 // sell
		if( upper_4 > 126.493 )
			if( upper_6 <= 137.798 )
				if( upper_6 <= 134.104 )
					if( lower_6 <= 104.461 )
						if( lower_2 <= 112.603 )
							ret := -0.923077 // sell
						if( lower_2 > 112.603 )
							ret := -0.250000
					if( lower_6 > 104.461 )
						ret := -1.000000 // sell
				if( upper_6 > 134.104 )
					if( upper_2 <= 127.806 )
						if( lower_1 <= 114.234 )
							ret := -0.671642
						if( lower_1 > 114.234 )
							ret := 0.442308
					if( upper_2 > 127.806 )
						if( upper_6 <= 135.781 )
							ret := 0.285714
						if( upper_6 > 135.781 )
							ret := -0.752381 // sell
			if( upper_6 > 137.798 )
				if( upper_5 <= 138.849 )
					if( lower_3 <= 112.137 )
						ret := -0.750000 // sell
					if( lower_3 > 112.137 )
						if( upper_1 <= 129.984 )
							ret := 0.373563
						if( upper_1 > 129.984 )
							ret := -0.772727 // sell
				if( upper_5 > 138.849 )
					if( lower_2 <= 119.362 )
						ret := -0.333333
					if( lower_2 > 119.362 )
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
float op_operation = decision_tree_0_GTLB_15Min_78eb1f3f(upper_2, basis, lower_6, basis_minus, lower_5, upper_5, upper_4, basis_max, upper_6, upper_3, lower_2, upper_1, lower_4, lower_1, lower_3)

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


