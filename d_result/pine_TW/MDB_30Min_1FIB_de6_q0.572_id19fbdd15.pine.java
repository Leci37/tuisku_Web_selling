//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: MDB_30Min_1FIB_19fbdd15 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MDB_30Min_1FIB_19fbdd15", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MDB_30Min_19fbdd15(upper_2, basis, lower_6, basis_minus, lower_5, upper_5, upper_4, basis_max, upper_6, upper_3, lower_2, upper_1, lower_4, lower_1, lower_3)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( lower_6 <= 64.6234 )
		if( lower_5 <= 62.9102 )
			if( lower_1 <= 26.656 )
				if( lower_2 <= 26.1122 )
					if( basis <= 27.6194 )
						if( upper_6 <= 31.8244 )
							ret := 0.890411 // buy
						if( upper_6 > 31.8244 )
							ret := 1.000000 // buy
					if( basis > 27.6194 )
						ret := 0.333333
				if( lower_2 > 26.1122 )
					if( lower_3 <= 25.8166 )
						ret := -0.083333
					if( lower_3 > 25.8166 )
						if( lower_3 <= 25.8305 )
							ret := 0.916667 // buy
						if( lower_3 > 25.8305 )
							ret := 0.100000
			if( lower_1 > 26.656 )
				if( lower_3 <= 64.5255 )
					if( upper_1 <= 30.6443 )
						if( upper_2 <= 30.0071 )
							ret := -0.057803
						if( upper_2 > 30.0071 )
							ret := -0.422360
					if( upper_1 > 30.6443 )
						if( lower_1 <= 66.0752 )
							ret := 0.120572
						if( lower_1 > 66.0752 )
							ret := 0.505102
				if( lower_3 > 64.5255 )
					if( lower_3 <= 65.6293 )
						if( lower_4 <= 63.5258 )
							ret := -0.233333
						if( lower_4 > 63.5258 )
							ret := -0.746154 // sell
					if( lower_3 > 65.6293 )
						if( lower_4 <= 64.1184 )
							ret := 0.484848
						if( lower_4 > 64.1184 )
							ret := -0.456522
		if( lower_5 > 62.9102 )
			if( upper_6 <= 90.49 )
				if( lower_4 <= 66.5757 )
					if( upper_1 <= 72.1937 )
						if( upper_5 <= 76.6366 )
							ret := 0.867925 // buy
						if( upper_5 > 76.6366 )
							ret := -0.083333
					if( upper_1 > 72.1937 )
						if( upper_1 <= 73.29 )
							ret := 1.000000 // buy
						if( upper_1 > 73.29 )
							ret := 0.893617 // buy
				if( lower_4 > 66.5757 )
					if( upper_6 <= 90.0808 )
						if( upper_6 <= 90.0036 )
							ret := 0.391566
						if( upper_6 > 90.0036 )
							ret := -0.434783
					if( upper_6 > 90.0808 )
						if( lower_1 <= 72.427 )
							ret := -0.571429
						if( lower_1 > 72.427 )
							ret := 0.760638 // buy
			if( upper_6 > 90.49 )
				if( upper_2 <= 82.6191 )
					if( basis_minus <= 14.82 )
						if( upper_4 <= 85.4368 )
							ret := -1.000000 // sell
						if( upper_4 > 85.4368 )
							ret := -0.463768
					if( basis_minus > 14.82 )
						ret := 0.238095
				if( upper_2 > 82.6191 )
					if( lower_6 <= 64.1988 )
						if( upper_4 <= 86.2481 )
							ret := 0.974359 // buy
						if( upper_4 > 86.2481 )
							ret := 0.356923
					if( lower_6 > 64.1988 )
						if( upper_4 <= 90.779 )
							ret := 0.312500
						if( upper_4 > 90.779 )
							ret := -0.559322
	if( lower_6 > 64.6234 )
		if( lower_4 <= 363.083 )
			if( basis_minus <= 16.7714 )
				if( basis_max <= -12.6853 )
					if( lower_5 <= 121.447 )
						if( upper_6 <= 92.0001 )
							ret := -0.566929
						if( upper_6 > 92.0001 )
							ret := 0.036254
					if( lower_5 > 121.447 )
						if( basis <= 202.443 )
							ret := -0.393696
						if( basis > 202.443 )
							ret := -0.071125
				if( basis_max > -12.6853 )
					if( upper_6 <= 94.8276 )
						if( lower_5 <= 68.0513 )
							ret := 0.818182 // buy
						if( lower_5 > 68.0513 )
							ret := -0.313253
					if( upper_6 > 94.8276 )
						if( upper_2 <= 104.806 )
							ret := 0.368715
						if( upper_2 > 104.806 )
							ret := 0.054406
			if( basis_minus > 16.7714 )
				if( lower_2 <= 99.6805 )
					if( upper_2 <= 140.297 )
						if( basis_max <= -17.2699 )
							ret := 0.987179 // buy
						if( basis_max > -17.2699 )
							ret := 0.305556
					if( upper_2 > 140.297 )
						ret := -0.466667
				if( lower_2 > 99.6805 )
					if( basis_minus <= 37.6478 )
						if( basis_minus <= 27.1194 )
							ret := -0.001722
						if( basis_minus > 27.1194 )
							ret := 0.117509
					if( basis_minus > 37.6478 )
						if( lower_2 <= 253.653 )
							ret := -0.094243
						if( lower_2 > 253.653 )
							ret := 0.028762
		if( lower_4 > 363.083 )
			if( lower_6 <= 363.313 )
				if( lower_5 <= 372.157 )
					if( lower_3 <= 382.627 )
						if( basis_minus <= 58.0573 )
							ret := -0.150898
						if( basis_minus > 58.0573 )
							ret := -0.604000
					if( lower_3 > 382.627 )
						if( lower_4 <= 374.914 )
							ret := -0.191781
						if( lower_4 > 374.914 )
							ret := 0.476684
				if( lower_5 > 372.157 )
					if( lower_4 <= 400.909 )
						if( upper_6 <= 486.292 )
							ret := -0.346939
						if( upper_6 > 486.292 )
							ret := -0.767327 // sell
					if( lower_4 > 400.909 )
						ret := 0.150000
			if( lower_6 > 363.313 )
				if( lower_6 <= 379.121 )
					if( lower_2 <= 407.005 )
						if( basis_minus <= 24.9186 )
							ret := 0.545455
						if( basis_minus > 24.9186 )
							ret := -0.052219
					if( lower_2 > 407.005 )
						if( lower_3 <= 403.725 )
							ret := 0.798246 // buy
						if( lower_3 > 403.725 )
							ret := 0.203297
				if( lower_6 > 379.121 )
					if( basis_minus <= 84.811 )
						if( basis_max <= -63.1647 )
							ret := 0.147708
						if( basis_max > -63.1647 )
							ret := -0.171059
					if( basis_minus > 84.811 )
						if( lower_2 <= 452.765 )
							ret := 0.275862
						if( lower_2 > 452.765 )
							ret := -0.478365
	
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
float op_operation = decision_tree_0_MDB_30Min_19fbdd15(upper_2, basis, lower_6, basis_minus, lower_5, upper_5, upper_4, basis_max, upper_6, upper_3, lower_2, upper_1, lower_4, lower_1, lower_3)

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


