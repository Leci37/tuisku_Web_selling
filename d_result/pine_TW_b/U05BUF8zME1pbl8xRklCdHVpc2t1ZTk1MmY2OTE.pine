//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: SNAP_30Min_1FIB_e952f691 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNAP_30Min_1FIB_e952f691", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNAP_30Min_e952f691(basis, upper_2, upper_3, lower_2, lower_6, lower_1, basis_minus, lower_3, upper_6, lower_5, lower_4, upper_5, upper_4, basis_max, upper_1)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( upper_2 <= 15.1651 )
		if( lower_6 <= 5.64457 )
			if( upper_6 <= 7.03449 )
				if( upper_6 <= 6.97342 )
					if( basis_max <= -0.603434 )
						if( basis_minus <= 0.698635 )
							ret := 0.504717
						if( basis_minus > 0.698635 )
							ret := 0.058462
					if( basis_max > -0.603434 )
						if( basis_max <= -0.448668 )
							ret := -0.642857
						if( basis_max > -0.448668 )
							ret := 0.062500
				if( upper_6 > 6.97342 )
					if( upper_5 <= 6.80638 )
						if( upper_6 <= 7.01822 )
							ret := -0.942308 // sell
						if( upper_6 > 7.01822 )
							ret := 0.000000
					if( upper_5 > 6.80638 )
						if( basis_minus <= 0.753816 )
							ret := -0.900000 // sell
						if( basis_minus > 0.753816 )
							ret := 0.476190
			if( upper_6 > 7.03449 )
				if( lower_5 <= 5.59392 )
					if( lower_4 <= 6.36831 )
						if( lower_5 <= 5.53825 )
							ret := 0.721893 // buy
						if( lower_5 > 5.53825 )
							ret := 1.000000 // buy
					if( lower_4 > 6.36831 )
						if( lower_3 <= 7.29384 )
							ret := -0.740741 // sell
						if( lower_3 > 7.29384 )
							ret := 0.218750
				if( lower_5 > 5.59392 )
					if( lower_6 <= 4.99256 )
						if( lower_2 <= 7.23196 )
							ret := 1.000000 // buy
						if( lower_2 > 7.23196 )
							ret := -0.262500
					if( lower_6 > 4.99256 )
						if( upper_6 <= 12.5499 )
							ret := 0.170616
						if( upper_6 > 12.5499 )
							ret := 0.754717 // buy
		if( lower_6 > 5.64457 )
			if( basis_minus <= 2.08857 )
				if( basis_max <= -1.82182 )
					if( lower_6 <= 8.78579 )
						if( upper_6 <= 11.5795 )
							ret := 0.324324
						if( upper_6 > 11.5795 )
							ret := -0.795276 // sell
					if( lower_6 > 8.78579 )
						if( upper_6 <= 12.7939 )
							ret := 0.854962 // buy
						if( upper_6 > 12.7939 )
							ret := 0.239049
				if( basis_max > -1.82182 )
					if( lower_3 <= 5.99805 )
						if( lower_3 <= 5.99549 )
							ret := -0.870130 // sell
						if( lower_3 > 5.99549 )
							ret := -0.523810
					if( lower_3 > 5.99805 )
						if( lower_4 <= 14.4612 )
							ret := 0.024298
						if( lower_4 > 14.4612 )
							ret := -0.484127
			if( basis_minus > 2.08857 )
				if( lower_6 <= 6.54062 )
					if( lower_6 <= 6.13839 )
						if( lower_4 <= 7.117 )
							ret := -0.451220
						if( lower_4 > 7.117 )
							ret := 0.325000
					if( lower_6 > 6.13839 )
						if( lower_5 <= 7.26346 )
							ret := 0.744898 // buy
						if( lower_5 > 7.26346 )
							ret := 0.000000
				if( lower_6 > 6.54062 )
					if( upper_3 <= 15.5446 )
						if( lower_2 <= 9.75066 )
							ret := 0.019930
						if( lower_2 > 9.75066 )
							ret := -0.184417
					if( upper_3 > 15.5446 )
						if( upper_1 <= 14.382 )
							ret := 0.000000
						if( upper_1 > 14.382 )
							ret := 1.000000 // buy
	if( upper_2 > 15.1651 )
		if( upper_4 <= 18.0342 )
			if( lower_4 <= 8.24522 )
				if( lower_2 <= 9.59909 )
					ret := 0.000000
				if( lower_2 > 9.59909 )
					if( lower_6 <= 4.61893 )
						ret := 0.000000
					if( lower_6 > 4.61893 )
						if( lower_6 <= 5.14144 )
							ret := -0.983333 // sell
						if( lower_6 > 5.14144 )
							ret := -0.785714 // sell
			if( lower_4 > 8.24522 )
				if( lower_3 <= 15.8026 )
					if( upper_1 <= 14.9461 )
						if( lower_1 <= 14.0807 )
							ret := 0.600000
						if( lower_1 > 14.0807 )
							ret := -0.217391
					if( upper_1 > 14.9461 )
						if( lower_2 <= 14.0736 )
							ret := -0.330065
						if( lower_2 > 14.0736 )
							ret := -0.057057
				if( lower_3 > 15.8026 )
					if( lower_2 <= 15.9533 )
						if( basis_minus <= 0.561144 )
							ret := 0.000000
						if( basis_minus > 0.561144 )
							ret := -0.811189 // sell
					if( lower_2 > 15.9533 )
						if( lower_6 <= 16.8591 )
							ret := -0.177071
						if( lower_6 > 16.8591 )
							ret := 0.515625
		if( upper_4 > 18.0342 )
			if( lower_3 <= 16.687 )
				if( lower_1 <= 17.1375 )
					if( upper_2 <= 17.4277 )
						if( basis_max <= -3.54072 )
							ret := 0.639594
						if( basis_max > -3.54072 )
							ret := -0.800000 // sell
					if( upper_2 > 17.4277 )
						if( lower_3 <= 8.82737 )
							ret := 0.610000
						if( lower_3 > 8.82737 )
							ret := 0.011046
				if( lower_1 > 17.1375 )
					if( upper_4 <= 23.8054 )
						if( upper_4 <= 23.711 )
							ret := 0.530612
						if( upper_4 > 23.711 )
							ret := 0.926471 // buy
					if( upper_4 > 23.8054 )
						ret := -0.900000 // sell
			if( lower_3 > 16.687 )
				if( basis <= 76.5003 )
					if( lower_6 <= 16.0212 )
						if( lower_1 <= 18.2544 )
							ret := -0.319871
						if( lower_1 > 18.2544 )
							ret := 0.229730
					if( lower_6 > 16.0212 )
						if( upper_4 <= 23.5213 )
							ret := 0.084793
						if( upper_4 > 23.5213 )
							ret := -0.013571
				if( basis > 76.5003 )
					if( upper_5 <= 85.1393 )
						if( lower_4 <= 70.0143 )
							ret := 1.000000 // buy
						if( lower_4 > 70.0143 )
							ret := -0.771812 // sell
					if( upper_5 > 85.1393 )
						if( upper_3 <= 82.8354 )
							ret := 0.434783
						if( upper_3 > 82.8354 )
							ret := -0.938776 // sell
	
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
float op_operation = decision_tree_0_SNAP_30Min_e952f691(basis, upper_2, upper_3, lower_2, lower_6, lower_1, basis_minus, lower_3, upper_6, lower_5, lower_4, upper_5, upper_4, basis_max, upper_1)

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


