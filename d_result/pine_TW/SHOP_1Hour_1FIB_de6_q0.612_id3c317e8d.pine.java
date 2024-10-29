//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: SHOP_1Hour_1FIB_3c317e8d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SHOP_1Hour_1FIB_3c317e8d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SHOP_1Hour_3c317e8d(basis, upper_2, upper_3, lower_2, lower_6, lower_1, basis_minus, lower_3, upper_6, lower_5, lower_4, upper_5, upper_4, basis_max, upper_1)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( basis_max <= -170.259 )
		if( basis_minus <= 181.829 )
			if( upper_5 <= 569.26 )
				if( upper_4 <= 498.533 )
					ret := -0.555556
				if( upper_4 > 498.533 )
					if( upper_6 <= 576.29 )
						ret := 1.000000 // buy
					if( upper_6 > 576.29 )
						if( upper_1 <= 457.352 )
							ret := -0.500000
						if( upper_1 > 457.352 )
							ret := 0.636364
			if( upper_5 > 569.26 )
				if( upper_1 <= 508.008 )
					if( lower_2 <= 375.708 )
						ret := 0.000000
					if( lower_2 > 375.708 )
						if( upper_3 <= 542.895 )
							ret := -1.000000 // sell
						if( upper_3 > 542.895 )
							ret := -0.933333 // sell
				if( upper_1 > 508.008 )
					if( lower_6 <= 1285.62 )
						if( lower_5 <= 1325.68 )
							ret := -0.339066
						if( lower_5 > 1325.68 )
							ret := -0.974359 // sell
					if( lower_6 > 1285.62 )
						if( upper_5 <= 1625.11 )
							ret := 0.627907
						if( upper_5 > 1625.11 )
							ret := -0.714286 // sell
		if( basis_minus > 181.829 )
			if( upper_6 <= 1356.13 )
				if( lower_4 <= 537.318 )
					if( lower_6 <= 287.836 )
						if( basis_minus <= 189.168 )
							ret := 0.753086 // buy
						if( basis_minus > 189.168 )
							ret := -0.001684
					if( lower_6 > 287.836 )
						if( lower_6 <= 427.67 )
							ret := -0.548747
						if( lower_6 > 427.67 )
							ret := -0.128834
				if( lower_4 > 537.318 )
					if( lower_4 <= 571.426 )
						if( lower_3 <= 563.529 )
							ret := -1.000000 // sell
						if( lower_3 > 563.529 )
							ret := 0.838710 // buy
					if( lower_4 > 571.426 )
						if( basis_minus <= 344.191 )
							ret := 0.046445
						if( basis_minus > 344.191 )
							ret := 0.902778 // buy
			if( upper_6 > 1356.13 )
				if( basis <= 1177.87 )
					if( lower_5 <= 745.86 )
						ret := 1.000000 // buy
					if( lower_5 > 745.86 )
						if( upper_5 <= 1312.12 )
							ret := -0.832215 // sell
						if( upper_5 > 1312.12 )
							ret := -0.320690
				if( basis > 1177.87 )
					if( upper_2 <= 1415.86 )
						if( upper_4 <= 1476.87 )
							ret := 0.087558
						if( upper_4 > 1476.87 )
							ret := 0.681159
					if( upper_2 > 1415.86 )
						if( upper_3 <= 1720.46 )
							ret := -0.254735
						if( upper_3 > 1720.46 )
							ret := 0.888889 // buy
	if( basis_max > -170.259 )
		if( upper_2 <= 30.19 )
			if( lower_1 <= 26.6329 )
				if( upper_4 <= 31.327 )
					if( upper_1 <= 29.1186 )
						if( lower_6 <= 23.3099 )
							ret := -0.423077
						if( lower_6 > 23.3099 )
							ret := 1.000000 // buy
					if( upper_1 > 29.1186 )
						if( upper_1 <= 29.1563 )
							ret := 0.857143 // buy
						if( upper_1 > 29.1563 )
							ret := 0.000000
				if( upper_4 > 31.327 )
					if( upper_4 <= 31.3522 )
						ret := -1.000000 // sell
					if( upper_4 > 31.3522 )
						ret := 0.222222
			if( lower_1 > 26.6329 )
				if( upper_4 <= 31.4433 )
					if( basis <= 27.8248 )
						if( upper_3 <= 29.8592 )
							ret := 0.916667 // buy
						if( upper_3 > 29.8592 )
							ret := 0.136364
					if( basis > 27.8248 )
						if( lower_1 <= 26.641 )
							ret := 0.400000
						if( lower_1 > 26.641 )
							ret := 0.871795 // buy
				if( upper_4 > 31.4433 )
					ret := -0.666667
		if( upper_2 > 30.19 )
			if( lower_6 <= 27.5526 )
				if( upper_6 <= 34.6116 )
					if( upper_5 <= 32.1722 )
						if( basis_max <= -4.54662 )
							ret := 0.227273
						if( basis_max > -4.54662 )
							ret := -0.619048
					if( upper_5 > 32.1722 )
						if( upper_1 <= 29.5243 )
							ret := -0.977778 // sell
						if( upper_1 > 29.5243 )
							ret := -0.658824
				if( upper_6 > 34.6116 )
					if( upper_6 <= 36.7538 )
						if( upper_6 <= 35.5172 )
							ret := -0.277778
						if( upper_6 > 35.5172 )
							ret := 0.644068
					if( upper_6 > 36.7538 )
						if( basis_max <= -4.71864 )
							ret := -0.152328
						if( basis_max > -4.71864 )
							ret := -0.754545 // sell
			if( lower_6 > 27.5526 )
				if( lower_2 <= 33.2286 )
					if( basis_max <= -4.67117 )
						if( basis <= 33.372 )
							ret := -1.000000 // sell
						if( basis > 33.372 )
							ret := 0.605000
					if( basis_max > -4.67117 )
						if( lower_6 <= 27.7605 )
							ret := 0.000000
						if( lower_6 > 27.7605 )
							ret := 0.903448 // buy
				if( lower_2 > 33.2286 )
					if( basis_max <= -13.303 )
						if( basis <= 142.14 )
							ret := 0.210320
						if( basis > 142.14 )
							ret := 0.032320
					if( basis_max > -13.303 )
						if( upper_6 <= 44.8771 )
							ret := 0.219589
						if( upper_6 > 44.8771 )
							ret := -0.054261
	
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
float op_operation = decision_tree_0_SHOP_1Hour_3c317e8d(basis, upper_2, upper_3, lower_2, lower_6, lower_1, basis_minus, lower_3, upper_6, lower_5, lower_4, upper_5, upper_4, basis_max, upper_1)

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


