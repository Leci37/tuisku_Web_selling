//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: MSFT_1Hour_1FIB_6ee2b026 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_1Hour_1FIB_6ee2b026", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_1Hour_6ee2b026(upper_2, basis, lower_6, basis_minus, lower_5, upper_5, upper_4, basis_max, upper_6, upper_3, lower_2, upper_1, lower_4, lower_1, lower_3)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( lower_1 <= 419.116 )
		if( basis_max <= -14.7585 )
			if( lower_2 <= 404.762 )
				if( lower_3 <= 134.733 )
					if( lower_6 <= 119.837 )
						if( lower_2 <= 137.823 )
							ret := 0.642857
						if( lower_2 > 137.823 )
							ret := -0.600000
					if( lower_6 > 119.837 )
						ret := 1.000000 // buy
				if( lower_3 > 134.733 )
					if( basis_max <= -31.3121 )
						if( upper_3 <= 284.474 )
							ret := 0.495413
						if( upper_3 > 284.474 )
							ret := 0.034568
					if( basis_max > -31.3121 )
						if( basis <= 145.559 )
							ret := 0.620690
						if( basis > 145.559 )
							ret := -0.080959
			if( lower_2 > 404.762 )
				if( upper_3 <= 422.965 )
					if( basis_max <= -15.6268 )
						if( upper_1 <= 415.594 )
							ret := -1.000000 // sell
						if( upper_1 > 415.594 )
							ret := 0.687500
					if( basis_max > -15.6268 )
						ret := 1.000000 // buy
				if( upper_3 > 422.965 )
					if( upper_1 <= 433.902 )
						if( upper_6 <= 439.948 )
							ret := -0.047619
						if( upper_6 > 439.948 )
							ret := 0.359259
					if( upper_1 > 433.902 )
						if( lower_5 <= 397.664 )
							ret := 0.000000
						if( lower_5 > 397.664 )
							ret := -0.653846
		if( basis_max > -14.7585 )
			if( lower_2 <= 180.995 )
				if( upper_2 <= 185.762 )
					if( lower_5 <= 158.701 )
						if( basis_max <= -8.00907 )
							ret := -0.203911
						if( basis_max > -8.00907 )
							ret := 0.022218
					if( lower_5 > 158.701 )
						if( upper_4 <= 179.897 )
							ret := 0.702326 // buy
						if( upper_4 > 179.897 )
							ret := 0.008711
				if( upper_2 > 185.762 )
					if( lower_4 <= 176.769 )
						if( lower_6 <= 169.086 )
							ret := -1.000000 // sell
						if( lower_6 > 169.086 )
							ret := 0.311111
					if( lower_4 > 176.769 )
						if( lower_5 <= 177.791 )
							ret := -0.862069 // sell
						if( lower_5 > 177.791 )
							ret := 1.000000 // buy
			if( lower_2 > 180.995 )
				if( upper_3 <= 214.375 )
					if( basis_minus <= 12.0565 )
						if( basis <= 207.703 )
							ret := 0.507634
						if( basis > 207.703 )
							ret := 0.964286 // buy
					if( basis_minus > 12.0565 )
						if( basis <= 205.23 )
							ret := 0.368966
						if( basis > 205.23 )
							ret := -0.151659
				if( upper_3 > 214.375 )
					if( upper_2 <= 213.458 )
						if( upper_4 <= 215.761 )
							ret := -0.973684 // sell
						if( upper_4 > 215.761 )
							ret := -0.284314
					if( upper_2 > 213.458 )
						if( basis_minus <= 4.61438 )
							ret := -0.966667 // sell
						if( basis_minus > 4.61438 )
							ret := 0.067635
	if( lower_1 > 419.116 )
		if( lower_3 <= 436.287 )
			if( lower_5 <= 409.41 )
				if( lower_4 <= 411.155 )
					if( lower_5 <= 402.986 )
						if( basis_minus <= 35.7428 )
							ret := -0.729730 // sell
						if( basis_minus > 35.7428 )
							ret := 0.000000
					if( lower_5 > 402.986 )
						if( lower_6 <= 396.184 )
							ret := -0.307692
						if( lower_6 > 396.184 )
							ret := 0.000000
				if( lower_4 > 411.155 )
					if( upper_6 <= 469.039 )
						if( basis <= 426.319 )
							ret := 0.000000
						if( basis > 426.319 )
							ret := 0.960000 // buy
					if( upper_6 > 469.039 )
						ret := 0.166667
			if( lower_5 > 409.41 )
				if( lower_6 <= 407.775 )
					if( lower_5 <= 412.851 )
						if( lower_6 <= 403.298 )
							ret := 0.666667
						if( lower_6 > 403.298 )
							ret := -0.883721 // sell
					if( lower_5 > 412.851 )
						if( upper_6 <= 478.103 )
							ret := -0.205882
						if( upper_6 > 478.103 )
							ret := 1.000000 // buy
				if( lower_6 > 407.775 )
					if( lower_2 <= 437.919 )
						if( upper_4 <= 427.508 )
							ret := -0.602564
						if( upper_4 > 427.508 )
							ret := -0.186275
					if( lower_2 > 437.919 )
						if( upper_2 <= 462.989 )
							ret := -1.000000 // sell
						if( upper_2 > 462.989 )
							ret := 0.166667
		if( lower_3 > 436.287 )
			if( lower_4 <= 439.513 )
				if( lower_5 <= 435.367 )
					if( upper_2 <= 463.917 )
						if( lower_2 <= 440.696 )
							ret := 0.000000
						if( lower_2 > 440.696 )
							ret := -1.000000 // sell
					if( upper_2 > 463.917 )
						if( upper_6 <= 483.006 )
							ret := 0.730769 // buy
						if( upper_6 > 483.006 )
							ret := 0.100000
				if( lower_5 > 435.367 )
					if( upper_4 <= 456.007 )
						ret := 0.300000
					if( upper_4 > 456.007 )
						if( basis_minus <= 13.7761 )
							ret := 0.000000
						if( basis_minus > 13.7761 )
							ret := 1.000000 // buy
			if( lower_4 > 439.513 )
				if( lower_6 <= 432.109 )
					if( upper_1 <= 460.506 )
						ret := -1.000000 // sell
					if( upper_1 > 460.506 )
						ret := 0.000000
				if( lower_6 > 432.109 )
					if( lower_5 <= 440.3 )
						if( basis_max <= -21.5019 )
							ret := 0.625000
						if( basis_max > -21.5019 )
							ret := 0.147727
					if( lower_5 > 440.3 )
						if( upper_1 <= 461.099 )
							ret := -0.373832
						if( upper_1 > 461.099 )
							ret := 0.375000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
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
float op_operation = decision_tree_0_MSFT_1Hour_6ee2b026(upper_2, basis, lower_6, basis_minus, lower_5, upper_5, upper_4, basis_max, upper_6, upper_3, lower_2, upper_1, lower_4, lower_1, lower_3)

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


