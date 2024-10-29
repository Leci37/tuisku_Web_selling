//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: SHOP_1Min_1FIB_7c998f19 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SHOP_1Min_1FIB_7c998f19", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SHOP_1Min_7c998f19(basis, upper_2, upper_3, lower_2, lower_6, lower_1, basis_minus, lower_3, upper_6, lower_5, lower_4, upper_5, upper_4, basis_max, upper_1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( upper_6 <= 58.3922 )
		if( upper_6 <= 58.3531 )
			if( upper_3 <= 53.0419 )
				if( upper_5 <= 53.1161 )
					if( basis_minus <= 2.63819 )
						if( lower_5 <= 48.9678 )
							if( lower_1 <= 50.243 )
								ret := 0.600000
							if( lower_1 > 50.243 )
								ret := -1.000000 // sell
						if( lower_5 > 48.9678 )
							if( upper_3 <= 52.2363 )
								ret := 1.000000 // buy
							if( upper_3 > 52.2363 )
								ret := 0.571429
					if( basis_minus > 2.63819 )
						if( upper_5 <= 53.0531 )
							ret := -1.000000 // sell
						if( upper_5 > 53.0531 )
							ret := -0.571429
				if( upper_5 > 53.1161 )
					if( upper_5 <= 53.5653 )
						if( lower_5 <= 51.4226 )
							if( upper_4 <= 53.1903 )
								ret := 0.818966 // buy
							if( upper_4 > 53.1903 )
								ret := 0.142857
						if( lower_5 > 51.4226 )
							if( basis_max <= -1.16385 )
								ret := -0.666667
							if( basis_max > -1.16385 )
								ret := 0.428571
					if( upper_5 > 53.5653 )
						if( lower_3 <= 47.2788 )
							if( lower_2 <= 47.8129 )
								ret := 0.636364
							if( lower_2 > 47.8129 )
								ret := 0.181818
						if( lower_3 > 47.2788 )
							if( basis_max <= -3.26532 )
								ret := -0.750000 // sell
							if( basis_max > -3.26532 )
								ret := -0.142857
			if( upper_3 > 53.0419 )
				if( upper_3 <= 53.0812 )
					if( lower_6 <= 52.2496 )
						if( basis <= 52.7494 )
							if( basis_minus <= 0.985881 )
								ret := -0.762712 // sell
							if( basis_minus > 0.985881 )
								ret := -0.137255
						if( basis > 52.7494 )
							if( upper_5 <= 53.1975 )
								ret := -0.833333 // sell
							if( upper_5 > 53.1975 )
								ret := 0.515152
					if( lower_6 > 52.2496 )
						ret := -1.000000 // sell
				if( upper_3 > 53.0812 )
					if( lower_5 <= 48.244 )
						if( upper_6 <= 55.9509 )
							if( lower_4 <= 48.8186 )
								ret := -0.857143 // sell
							if( lower_4 > 48.8186 )
								ret := -1.000000 // sell
						if( upper_6 > 55.9509 )
							ret := -0.333333
					if( lower_5 > 48.244 )
						if( basis <= 53.6263 )
							if( basis <= 53.2683 )
								ret := 0.110687
							if( basis > 53.2683 )
								ret := 0.614108
						if( basis > 53.6263 )
							if( lower_1 <= 53.1872 )
								ret := -0.372881
							if( lower_1 > 53.1872 )
								ret := 0.109021
		if( upper_6 > 58.3531 )
			if( upper_5 <= 58.3108 )
				if( basis_minus <= 0.820607 )
					if( lower_6 <= 57.0075 )
						if( upper_4 <= 58.0834 )
							if( upper_4 <= 58.0746 )
								ret := 1.000000 // buy
							if( upper_4 > 58.0746 )
								ret := 0.571429
						if( upper_4 > 58.0834 )
							ret := 1.000000 // buy
					if( lower_6 > 57.0075 )
						if( upper_4 <= 58.1781 )
							ret := 0.090909
						if( upper_4 > 58.1781 )
							if( upper_6 <= 58.3836 )
								ret := 0.842105 // buy
							if( upper_6 > 58.3836 )
								ret := 0.333333
				if( basis_minus > 0.820607 )
					if( upper_1 <= 57.6752 )
						ret := 0.555556
					if( upper_1 > 57.6752 )
						ret := 0.125000
			if( upper_5 > 58.3108 )
				if( lower_3 <= 58.1315 )
					if( upper_6 <= 58.374 )
						ret := 0.142857
					if( upper_6 > 58.374 )
						ret := 0.000000
				if( lower_3 > 58.1315 )
					if( lower_3 <= 58.1606 )
						ret := 1.000000 // buy
					if( lower_3 > 58.1606 )
						ret := 0.714286 // buy
	if( upper_6 > 58.3922 )
		if( upper_2 <= 58.3388 )
			if( upper_1 <= 55.2136 )
				if( upper_3 <= 56.4868 )
					if( basis_max <= -4.74503 )
						ret := -0.600000
					if( basis_max > -4.74503 )
						if( lower_2 <= 52.2665 )
							ret := 1.000000 // buy
						if( lower_2 > 52.2665 )
							ret := 0.555556
				if( upper_3 > 56.4868 )
					if( upper_3 <= 56.5397 )
						ret := 1.000000 // buy
					if( upper_3 > 56.5397 )
						if( upper_2 <= 55.946 )
							ret := 0.444444
						if( upper_2 > 55.946 )
							if( upper_2 <= 55.9991 )
								ret := 1.000000 // buy
							if( upper_2 > 55.9991 )
								ret := 0.666667
			if( upper_1 > 55.2136 )
				if( upper_2 <= 56.144 )
					if( lower_1 <= 52.7591 )
						if( upper_1 <= 55.3101 )
							if( upper_1 <= 55.2778 )
								ret := -0.772727 // sell
							if( upper_1 > 55.2778 )
								ret := -1.000000 // sell
						if( upper_1 > 55.3101 )
							ret := -0.625000
					if( lower_1 > 52.7591 )
						ret := 0.444444
				if( upper_2 > 56.144 )
					if( lower_1 <= 56.8834 )
						if( upper_5 <= 58.4199 )
							if( basis <= 53.9177 )
								ret := -1.000000 // sell
							if( basis > 53.9177 )
								ret := 0.269231
						if( upper_5 > 58.4199 )
							if( lower_5 <= 55.7589 )
								ret := 0.395062
							if( lower_5 > 55.7589 )
								ret := 0.968750 // buy
					if( lower_1 > 56.8834 )
						if( basis_minus <= 0.836175 )
							if( lower_5 <= 57.2993 )
								ret := 0.419355
							if( lower_5 > 57.2993 )
								ret := -0.089974
						if( basis_minus > 0.836175 )
							if( lower_5 <= 57.0136 )
								ret := -0.116861
							if( lower_5 > 57.0136 )
								ret := -0.373134
		if( upper_2 > 58.3388 )
			if( basis <= 58.1222 )
				if( upper_1 <= 58.1216 )
					if( upper_4 <= 58.9684 )
						if( lower_5 <= 56.4855 )
							if( upper_2 <= 58.3514 )
								ret := -1.000000 // sell
							if( upper_2 > 58.3514 )
								ret := -0.588235
						if( lower_5 > 56.4855 )
							ret := 0.000000
					if( upper_4 > 58.9684 )
						ret := 0.777778 // buy
				if( upper_1 > 58.1216 )
					if( lower_2 <= 57.1058 )
						if( lower_1 <= 57.3598 )
							if( upper_3 <= 59.0507 )
								ret := 0.833333 // buy
							if( upper_3 > 59.0507 )
								ret := 1.000000 // buy
						if( lower_1 > 57.3598 )
							ret := 0.375000
					if( lower_2 > 57.1058 )
						if( upper_3 <= 58.5408 )
							if( upper_1 <= 58.2239 )
								ret := 0.297297
							if( upper_1 > 58.2239 )
								ret := 0.741935 // buy
						if( upper_3 > 58.5408 )
							if( basis <= 57.9903 )
								ret := -0.400000
							if( basis > 57.9903 )
								ret := 0.312500
			if( basis > 58.1222 )
				if( lower_6 <= 48.493 )
					if( lower_2 <= 56.2494 )
						if( lower_1 <= 59.0705 )
							if( lower_1 <= 58.4846 )
								ret := 0.928571 // buy
							if( lower_1 > 58.4846 )
								ret := -0.252427
						if( lower_1 > 59.0705 )
							if( basis_minus <= 21.8377 )
								ret := 0.850000 // buy
							if( basis_minus > 21.8377 )
								ret := 1.000000 // buy
					if( lower_2 > 56.2494 )
						if( upper_1 <= 69.7986 )
							if( lower_5 <= 51.5843 )
								ret := -0.725000 // sell
							if( lower_5 > 51.5843 )
								ret := -0.906977 // sell
						if( upper_1 > 69.7986 )
							if( upper_2 <= 73.0099 )
								ret := 0.576923
							if( upper_2 > 73.0099 )
								ret := -0.960784 // sell
				if( lower_6 > 48.493 )
					if( lower_5 <= 51.6281 )
						if( lower_5 <= 51.592 )
							ret := 1.000000 // buy
						if( lower_5 > 51.592 )
							ret := 0.857143 // buy
					if( lower_5 > 51.6281 )
						if( basis_minus <= 2.01174 )
							if( lower_3 <= 57.5383 )
								ret := -0.389610
							if( lower_3 > 57.5383 )
								ret := 0.052016
						if( basis_minus > 2.01174 )
							if( basis <= 61.9402 )
								ret := -0.263872
							if( basis > 61.9402 )
								ret := 0.030540
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_SHOP_1Min_7c998f19(basis, upper_2, upper_3, lower_2, lower_6, lower_1, basis_minus, lower_3, upper_6, lower_5, lower_4, upper_5, upper_4, basis_max, upper_1)

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


