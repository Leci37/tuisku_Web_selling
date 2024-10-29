//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: LINKUSDT_30Min_1FIB_8fa046f5 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LINKUSDT_30Min_1FIB_8fa046f5", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LINKUSDT_30Min_8fa046f5(upper_2, basis, lower_6, basis_minus, lower_5, upper_5, upper_4, basis_max, upper_6, upper_3, lower_2, upper_1, lower_4, lower_1, lower_3)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( lower_4 <= 6.73515 )
		if( basis_max <= -0.947112 )
			if( upper_4 <= 7.11058 )
				if( upper_5 <= 7.25153 )
					if( basis_minus <= 1.22504 )
						if( lower_3 <= 5.90814 )
							if( lower_1 <= 6.14938 )
								ret := 0.136364
							if( lower_1 > 6.14938 )
								ret := 0.704545 // buy
						if( lower_3 > 5.90814 )
							if( basis_minus <= 1.02006 )
								ret := -0.224490
							if( basis_minus > 1.02006 )
								ret := -0.818182 // sell
					if( basis_minus > 1.22504 )
						if( lower_4 <= 4.49067 )
							if( lower_4 <= 4.45742 )
								ret := 0.000000
							if( lower_4 > 4.45742 )
								ret := 0.416667
						if( lower_4 > 4.49067 )
							if( upper_1 <= 5.57768 )
								ret := -0.962963 // sell
							if( upper_1 > 5.57768 )
								ret := -0.437500
				if( upper_5 > 7.25153 )
					if( basis_minus <= 1.16827 )
						if( upper_4 <= 7.10241 )
							if( upper_4 <= 7.09698 )
								ret := 0.375000
							if( upper_4 > 7.09698 )
								ret := -0.625000
						if( upper_4 > 7.10241 )
							if( upper_5 <= 7.27254 )
								ret := 0.941176 // buy
							if( upper_5 > 7.27254 )
								ret := 0.000000
					if( basis_minus > 1.16827 )
						if( basis_max <= -1.17067 )
							if( lower_5 <= 5.46894 )
								ret := 0.655172
							if( lower_5 > 5.46894 )
								ret := -0.555556
						if( basis_max > -1.17067 )
							if( basis_max <= -1.16908 )
								ret := 0.884615 // buy
							if( basis_max > -1.16908 )
								ret := 1.000000 // buy
			if( upper_4 > 7.11058 )
				if( upper_2 <= 7.06457 )
					if( basis <= 6.26365 )
						if( upper_4 <= 7.11223 )
							ret := 0.250000
						if( upper_4 > 7.11223 )
							if( lower_1 <= 5.92971 )
								ret := 1.000000 // buy
							if( lower_1 > 5.92971 )
								ret := 0.500000
					if( basis > 6.26365 )
						if( upper_1 <= 6.68364 )
							if( lower_5 <= 5.34857 )
								ret := -0.825503 // sell
							if( lower_5 > 5.34857 )
								ret := -0.333333
						if( upper_1 > 6.68364 )
							if( upper_4 <= 7.25817 )
								ret := 0.488372
							if( upper_4 > 7.25817 )
								ret := -0.570946
				if( upper_2 > 7.06457 )
					if( upper_1 <= 6.91741 )
						if( lower_2 <= 5.60092 )
							ret := -1.000000 // sell
						if( lower_2 > 5.60092 )
							if( upper_3 <= 7.22276 )
								ret := 0.111111
							if( upper_3 > 7.22276 )
								ret := 0.884615 // buy
					if( upper_1 > 6.91741 )
						if( upper_2 <= 9.30078 )
							if( upper_2 <= 9.19225 )
								ret := -0.027122
							if( upper_2 > 9.19225 )
								ret := -0.791304 // sell
						if( upper_2 > 9.30078 )
							if( upper_4 <= 10.2385 )
								ret := 0.851351 // buy
							if( upper_4 > 10.2385 )
								ret := -1.000000 // sell
		if( basis_max > -0.947112 )
			if( lower_6 <= 4.64799 )
				if( lower_1 <= 4.99878 )
					if( basis <= 5.17814 )
						ret := 0.000000
					if( basis > 5.17814 )
						ret := -0.250000
				if( lower_1 > 4.99878 )
					if( upper_5 <= 6.02265 )
						if( basis_max <= -0.735625 )
							if( basis_max <= -0.766644 )
								ret := -0.400000
							if( basis_max > -0.766644 )
								ret := 0.000000
						if( basis_max > -0.735625 )
							if( upper_5 <= 5.64189 )
								ret := 0.500000
							if( upper_5 > 5.64189 )
								ret := 0.944444 // buy
					if( upper_5 > 6.02265 )
						ret := 1.000000 // buy
			if( lower_6 > 4.64799 )
				if( basis <= 7.08472 )
					if( lower_1 <= 6.93474 )
						if( upper_6 <= 7.95551 )
							if( upper_3 <= 6.96908 )
								ret := 0.046851
							if( upper_3 > 6.96908 )
								ret := 0.149977
						if( upper_6 > 7.95551 )
							ret := -1.000000 // sell
					if( lower_1 > 6.93474 )
						if( upper_2 <= 7.31067 )
							if( basis <= 7.0815 )
								ret := -0.800000 // sell
							if( basis > 7.0815 )
								ret := -0.250000
						if( upper_2 > 7.31067 )
							if( upper_5 <= 7.55593 )
								ret := -1.000000 // sell
							if( upper_5 > 7.55593 )
								ret := -0.750000 // sell
				if( basis > 7.08472 )
					if( upper_6 <= 8.14978 )
						if( lower_1 <= 6.91857 )
							if( basis <= 7.08738 )
								ret := 0.083333
							if( basis > 7.08738 )
								ret := 0.726027 // buy
						if( lower_1 > 6.91857 )
							if( lower_3 <= 6.72079 )
								ret := -0.043860
							if( lower_3 > 6.72079 )
								ret := 0.387792
					if( upper_6 > 8.14978 )
						if( lower_6 <= 6.36031 )
							if( basis_minus <= 0.919878 )
								ret := -0.880000 // sell
							if( basis_minus > 0.919878 )
								ret := 0.461538
						if( lower_6 > 6.36031 )
							if( lower_2 <= 6.94178 )
								ret := 0.714286 // buy
							if( lower_2 > 6.94178 )
								ret := -0.600000
	if( lower_4 > 6.73515 )
		if( lower_5 <= 6.79885 )
			if( lower_3 <= 6.94558 )
				if( lower_2 <= 6.80304 )
					if( upper_4 <= 6.98684 )
						if( basis_max <= -0.188963 )
							ret := 0.000000
						if( basis_max > -0.188963 )
							ret := -0.666667
					if( upper_4 > 6.98684 )
						if( lower_4 <= 6.7428 )
							ret := -0.400000
						if( lower_4 > 6.7428 )
							if( basis_minus <= 0.189725 )
								ret := -0.750000 // sell
							if( basis_minus > 0.189725 )
								ret := -1.000000 // sell
				if( lower_2 > 6.80304 )
					if( lower_6 <= 6.50187 )
						if( lower_6 <= 6.41272 )
							if( basis <= 7.48187 )
								ret := -0.484848
							if( basis > 7.48187 )
								ret := 0.288136
						if( lower_6 > 6.41272 )
							if( upper_6 <= 8.08535 )
								ret := 0.237410
							if( upper_6 > 8.08535 )
								ret := 0.728814 // buy
					if( lower_6 > 6.50187 )
						if( basis_minus <= 0.424696 )
							if( upper_5 <= 7.28918 )
								ret := -0.126289
							if( upper_5 > 7.28918 )
								ret := 0.255924
						if( basis_minus > 0.424696 )
							if( upper_4 <= 7.71576 )
								ret := -0.260522
							if( upper_4 > 7.71576 )
								ret := 0.247934
			if( lower_3 > 6.94558 )
				if( basis_minus <= 0.859219 )
					if( basis_minus <= 0.830058 )
						if( upper_3 <= 7.6618 )
							if( lower_3 <= 6.96523 )
								ret := -0.871429 // sell
							if( lower_3 > 6.96523 )
								ret := -0.250000
						if( upper_3 > 7.6618 )
							if( lower_4 <= 6.85439 )
								ret := 0.400000
							if( lower_4 > 6.85439 )
								ret := 0.000000
					if( basis_minus > 0.830058 )
						if( basis_minus <= 0.85525 )
							if( upper_2 <= 7.72594 )
								ret := -0.888889 // sell
							if( upper_2 > 7.72594 )
								ret := -1.000000 // sell
						if( basis_minus > 0.85525 )
							ret := -0.666667
				if( basis_minus > 0.859219 )
					if( upper_6 <= 8.53764 )
						if( basis_minus <= 0.875631 )
							if( upper_4 <= 7.9188 )
								ret := 0.666667
							if( upper_4 > 7.9188 )
								ret := -0.593750
						if( basis_minus > 0.875631 )
							if( lower_1 <= 7.296 )
								ret := 0.641509
							if( lower_1 > 7.296 )
								ret := -0.200000
					if( upper_6 > 8.53764 )
						if( upper_2 <= 8.00705 )
							if( lower_1 <= 7.31947 )
								ret := -0.851351 // sell
							if( lower_1 > 7.31947 )
								ret := 0.400000
						if( upper_2 > 8.00705 )
							if( lower_1 <= 7.31881 )
								ret := 0.413043
							if( lower_1 > 7.31881 )
								ret := -0.317130
		if( lower_5 > 6.79885 )
			if( lower_4 <= 25.9068 )
				if( basis_max <= -1.44686 )
					if( basis_minus <= 1.59107 )
						if( lower_6 <= 10.1219 )
							if( lower_6 <= 6.80777 )
								ret := 0.422078
							if( lower_6 > 6.80777 )
								ret := -0.225225
						if( lower_6 > 10.1219 )
							if( lower_6 <= 10.82 )
								ret := 0.691860
							if( lower_6 > 10.82 )
								ret := 0.166846
					if( basis_minus > 1.59107 )
						if( upper_5 <= 35.1888 )
							if( basis_minus <= 10.9667 )
								ret := 0.022038
							if( basis_minus > 10.9667 )
								ret := 0.609959
						if( upper_5 > 35.1888 )
							if( lower_1 <= 26.0968 )
								ret := -0.718033 // sell
							if( lower_1 > 26.0968 )
								ret := -0.025381
				if( basis_max > -1.44686 )
					if( upper_1 <= 7.40103 )
						if( lower_4 <= 6.93347 )
							if( lower_5 <= 6.8381 )
								ret := 0.090909
							if( lower_5 > 6.8381 )
								ret := -0.323529
						if( lower_4 > 6.93347 )
							if( upper_2 <= 7.40812 )
								ret := 0.156000
							if( upper_2 > 7.40812 )
								ret := 0.416107
					if( upper_1 > 7.40103 )
						if( lower_1 <= 7.23147 )
							if( upper_2 <= 7.49606 )
								ret := -0.697479
							if( upper_2 > 7.49606 )
								ret := -0.303318
						if( lower_1 > 7.23147 )
							if( lower_3 <= 7.12956 )
								ret := 0.204429
							if( lower_3 > 7.12956 )
								ret := -0.042739
			if( lower_4 > 25.9068 )
				if( lower_5 <= 28.5377 )
					if( basis_max <= -2.0534 )
						if( basis_minus <= 2.40361 )
							if( upper_5 <= 29.1349 )
								ret := -0.687500
							if( upper_5 > 29.1349 )
								ret := 0.450000
						if( basis_minus > 2.40361 )
							if( lower_4 <= 28.5605 )
								ret := -0.115359
							if( lower_4 > 28.5605 )
								ret := -0.349580
					if( basis_max > -2.0534 )
						if( lower_3 <= 26.8246 )
							if( lower_2 <= 26.7808 )
								ret := -0.305040
							if( lower_2 > 26.7808 )
								ret := 0.226891
						if( lower_3 > 26.8246 )
							if( lower_2 <= 29.1546 )
								ret := -0.701493 // sell
							if( lower_2 > 29.1546 )
								ret := 0.090909
				if( lower_5 > 28.5377 )
					if( basis_minus <= 2.79996 )
						if( lower_6 <= 29.7642 )
							if( upper_5 <= 31.7201 )
								ret := -0.300000
							if( upper_5 > 31.7201 )
								ret := 0.426471
						if( lower_6 > 29.7642 )
							if( basis_minus <= 2.4937 )
								ret := -0.118280
							if( basis_minus > 2.4937 )
								ret := 0.570312
					if( basis_minus > 2.79996 )
						if( lower_6 <= 27.013 )
							if( basis_max <= -10.4415 )
								ret := -0.666667
							if( basis_max > -10.4415 )
								ret := 0.936170 // buy
						if( lower_6 > 27.013 )
							if( lower_2 <= 47.2208 )
								ret := -0.060939
							if( lower_2 > 47.2208 )
								ret := -0.900000 // sell
	
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
float op_operation = decision_tree_0_LINKUSDT_30Min_8fa046f5(upper_2, basis, lower_6, basis_minus, lower_5, upper_5, upper_4, basis_max, upper_6, upper_3, lower_2, upper_1, lower_4, lower_1, lower_3)

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


