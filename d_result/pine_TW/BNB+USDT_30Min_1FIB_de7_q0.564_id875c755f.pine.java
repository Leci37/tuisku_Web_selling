//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: BNBUSDT_30Min_1FIB_875c755f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BNBUSDT_30Min_1FIB_875c755f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BNBUSDT_30Min_875c755f(basis_max, upper_1, lower_2, upper_2, lower_3, lower_6, basis_minus, lower_4, upper_4, upper_5, basis, upper_3, lower_5, upper_6, lower_1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( basis <= 211.225 )
		if( lower_6 <= 40.2406 )
			if( basis <= 26.4354 )
				if( lower_4 <= 18.8123 )
					if( basis_minus <= 3.93219 )
						if( upper_4 <= 23.5641 )
							ret := -0.222222
						if( upper_4 > 23.5641 )
							ret := 0.555556
					if( basis_minus > 3.93219 )
						if( lower_6 <= 17.2627 )
							ret := -1.000000 // sell
						if( lower_6 > 17.2627 )
							ret := -0.285714
				if( lower_4 > 18.8123 )
					if( basis <= 24.3191 )
						if( upper_5 <= 25.6587 )
							if( upper_2 <= 23.7312 )
								ret := 0.613333
							if( upper_2 > 23.7312 )
								ret := 0.126506
						if( upper_5 > 25.6587 )
							if( lower_3 <= 22.3012 )
								ret := 0.904762 // buy
							if( lower_3 > 22.3012 )
								ret := 0.520408
					if( basis > 24.3191 )
						if( basis <= 24.6847 )
							if( lower_1 <= 23.4234 )
								ret := 0.428571
							if( lower_1 > 23.4234 )
								ret := -0.558824
						if( basis > 24.6847 )
							if( lower_5 <= 21.6572 )
								ret := -0.163934
							if( lower_5 > 21.6572 )
								ret := 0.519062
			if( basis > 26.4354 )
				if( lower_4 <= 25.7745 )
					if( lower_1 <= 26.7586 )
						if( lower_5 <= 21.7556 )
							if( upper_2 <= 29.9891 )
								ret := -0.825000 // sell
							if( upper_2 > 29.9891 )
								ret := -0.142857
						if( lower_5 > 21.7556 )
							if( upper_4 <= 28.928 )
								ret := -0.396825
							if( upper_4 > 28.928 )
								ret := 0.419355
					if( lower_1 > 26.7586 )
						if( lower_4 <= 23.5371 )
							ret := 0.571429
						if( lower_4 > 23.5371 )
							if( lower_3 <= 26.3127 )
								ret := -0.670000
							if( lower_3 > 26.3127 )
								ret := -0.153846
				if( lower_4 > 25.7745 )
					if( lower_1 <= 41.6734 )
						if( basis_max <= -7.34659 )
							if( lower_4 <= 35.2671 )
								ret := 0.859155 // buy
							if( lower_4 > 35.2671 )
								ret := 0.369565
						if( basis_max > -7.34659 )
							if( basis_minus <= 4.37607 )
								ret := 0.123079
							if( basis_minus > 4.37607 )
								ret := -0.042931
					if( lower_1 > 41.6734 )
						if( lower_2 <= 41.8619 )
							if( lower_5 <= 39.282 )
								ret := 0.000000
							if( lower_5 > 39.282 )
								ret := -0.563786
						if( lower_2 > 41.8619 )
							if( lower_6 <= 39.5054 )
								ret := -0.051440
							if( lower_6 > 39.5054 )
								ret := 0.517986
		if( lower_6 > 40.2406 )
			if( lower_4 <= 120.331 )
				if( upper_2 <= 136.446 )
					if( upper_1 <= 88.2473 )
						if( lower_4 <= 58.9971 )
							if( upper_6 <= 87.3489 )
								ret := 0.736655 // buy
							if( upper_6 > 87.3489 )
								ret := 0.437500
						if( lower_4 > 58.9971 )
							ret := -0.875000 // sell
					if( upper_1 > 88.2473 )
						if( lower_5 <= 92.1963 )
							if( upper_4 <= 151.947 )
								ret := 1.000000 // buy
							if( upper_4 > 151.947 )
								ret := 0.857143 // buy
						if( lower_5 > 92.1963 )
							if( lower_2 <= 123.415 )
								ret := 0.666667
							if( lower_2 > 123.415 )
								ret := 1.000000 // buy
				if( upper_2 > 136.446 )
					if( upper_4 <= 152.665 )
						if( upper_1 <= 127.321 )
							ret := 0.500000
						if( upper_1 > 127.321 )
							if( upper_6 <= 156.68 )
								ret := -1.000000 // sell
							if( upper_6 > 156.68 )
								ret := -0.627451
					if( upper_4 > 152.665 )
						if( lower_3 <= 129.895 )
							if( basis_minus <= 63.2452 )
								ret := 0.380435
							if( basis_minus > 63.2452 )
								ret := 0.945652 // buy
						if( lower_3 > 129.895 )
							ret := -0.714286 // sell
			if( lower_4 > 120.331 )
				if( lower_2 <= 124.136 )
					if( upper_2 <= 135.99 )
						ret := -0.714286 // sell
					if( upper_2 > 135.99 )
						ret := -1.000000 // sell
				if( lower_2 > 124.136 )
					if( upper_6 <= 138.559 )
						if( upper_1 <= 132.641 )
							ret := 1.000000 // buy
						if( upper_1 > 132.641 )
							ret := 0.857143 // buy
					if( upper_6 > 138.559 )
						if( basis_minus <= 8.28254 )
							if( upper_3 <= 135.047 )
								ret := -0.812500 // sell
							if( upper_3 > 135.047 )
								ret := 0.032587
						if( basis_minus > 8.28254 )
							if( basis_max <= -27.5399 )
								ret := 0.014085
							if( basis_max > -27.5399 )
								ret := 0.396985
	if( basis > 211.225 )
		if( basis <= 588.768 )
			if( basis_max <= -19.381 )
				if( basis_max <= -21.0059 )
					if( lower_3 <= 203.549 )
						if( lower_3 <= 196.923 )
							if( upper_3 <= 328.201 )
								ret := 0.507812
							if( upper_3 > 328.201 )
								ret := -0.231788
						if( lower_3 > 196.923 )
							if( lower_1 <= 212.731 )
								ret := -0.322917
							if( lower_1 > 212.731 )
								ret := -0.834783 // sell
					if( lower_3 > 203.549 )
						if( lower_6 <= 175.112 )
							if( lower_5 <= 188.507 )
								ret := -0.400000
							if( lower_5 > 188.507 )
								ret := 0.530822
						if( lower_6 > 175.112 )
							if( lower_6 <= 184.167 )
								ret := -0.274151
							if( lower_6 > 184.167 )
								ret := 0.057316
				if( basis_max > -21.0059 )
					if( lower_5 <= 201.921 )
						ret := 1.000000 // buy
					if( lower_5 > 201.921 )
						if( upper_2 <= 224.864 )
							if( upper_5 <= 232.016 )
								ret := -0.714286 // sell
							if( upper_5 > 232.016 )
								ret := -1.000000 // sell
						if( upper_2 > 224.864 )
							if( lower_2 <= 225.391 )
								ret := 0.489247
							if( lower_2 > 225.391 )
								ret := 0.174113
			if( basis_max > -19.381 )
				if( basis <= 414.015 )
					if( lower_4 <= 402.053 )
						if( lower_6 <= 200.249 )
							if( lower_2 <= 207.517 )
								ret := -0.416667
							if( lower_2 > 207.517 )
								ret := -0.772727 // sell
						if( lower_6 > 200.249 )
							if( upper_6 <= 345.012 )
								ret := 0.007198
							if( upper_6 > 345.012 )
								ret := 0.115144
					if( lower_4 > 402.053 )
						if( lower_5 <= 400.067 )
							if( lower_4 <= 402.184 )
								ret := 0.333333
							if( lower_4 > 402.184 )
								ret := 0.896552 // buy
						if( lower_5 > 400.067 )
							if( upper_6 <= 427.322 )
								ret := 0.491228
							if( upper_6 > 427.322 )
								ret := 0.040816
				if( basis > 414.015 )
					if( lower_6 <= 504.868 )
						if( upper_2 <= 420.258 )
							if( upper_6 <= 428.807 )
								ret := -0.535714
							if( upper_6 > 428.807 )
								ret := -1.000000 // sell
						if( upper_2 > 420.258 )
							if( lower_6 <= 503.335 )
								ret := -0.200867
							if( lower_6 > 503.335 )
								ret := -0.764706 // sell
					if( lower_6 > 504.868 )
						if( basis_max <= -14.5591 )
							if( basis_max <= -17.932 )
								ret := 0.123552
							if( basis_max > -17.932 )
								ret := -0.177264
						if( basis_max > -14.5591 )
							if( lower_6 <= 570.986 )
								ret := 0.372603
							if( lower_6 > 570.986 )
								ret := -0.179775
		if( basis > 588.768 )
			if( upper_1 <= 614.516 )
				if( upper_3 <= 621.087 )
					if( upper_5 <= 630.391 )
						if( basis_max <= -39.2564 )
							if( basis_minus <= 42.4002 )
								ret := -0.814159 // sell
							if( basis_minus > 42.4002 )
								ret := -0.202797
						if( basis_max > -39.2564 )
							if( basis <= 590.186 )
								ret := -0.539683
							if( basis > 590.186 )
								ret := -0.082997
					if( upper_5 > 630.391 )
						if( upper_6 <= 641.489 )
							if( basis_minus <= 41.8808 )
								ret := 0.058824
							if( basis_minus > 41.8808 )
								ret := 0.725806 // buy
						if( upper_6 > 641.489 )
							if( lower_1 <= 579.903 )
								ret := 0.576923
							if( lower_1 > 579.903 )
								ret := -0.279070
				if( upper_3 > 621.087 )
					if( upper_2 <= 616.29 )
						if( lower_4 <= 553.814 )
							ret := -0.571429
						if( lower_4 > 553.814 )
							if( upper_4 <= 627.511 )
								ret := -0.750000 // sell
							if( upper_4 > 627.511 )
								ret := -1.000000 // sell
					if( upper_2 > 616.29 )
						if( basis_max <= -71.4053 )
							if( lower_4 <= 545.045 )
								ret := -0.333333
							if( lower_4 > 545.045 )
								ret := -0.886364 // sell
						if( basis_max > -71.4053 )
							if( lower_2 <= 566.51 )
								ret := 0.958333 // buy
							if( lower_2 > 566.51 )
								ret := -0.383721
			if( upper_1 > 614.516 )
				if( lower_1 <= 641.433 )
					if( upper_3 <= 648.838 )
						if( lower_3 <= 573.273 )
							if( basis <= 591.726 )
								ret := -0.875000 // sell
							if( basis > 591.726 )
								ret := 0.459075
						if( lower_3 > 573.273 )
							if( basis_minus <= 58.5666 )
								ret := 0.150421
							if( basis_minus > 58.5666 )
								ret := -0.710145 // sell
					if( upper_3 > 648.838 )
						if( upper_1 <= 646.479 )
							if( basis <= 609.021 )
								ret := -0.492754
							if( basis > 609.021 )
								ret := -0.111268
						if( upper_1 > 646.479 )
							if( upper_2 <= 657.574 )
								ret := 0.411321
							if( upper_2 > 657.574 )
								ret := -0.018841
				if( lower_1 > 641.433 )
					if( basis <= 683.018 )
						if( upper_3 <= 676.367 )
							ret := 1.000000 // buy
						if( upper_3 > 676.367 )
							if( lower_6 <= 585.14 )
								ret := -0.285714
							if( lower_6 > 585.14 )
								ret := -0.779874 // sell
					if( basis > 683.018 )
						if( basis <= 686.509 )
							if( upper_2 <= 714.085 )
								ret := 0.733333 // buy
							if( upper_2 > 714.085 )
								ret := 0.000000
						if( basis > 686.509 )
							if( upper_4 <= 716.558 )
								ret := 0.089286
							if( upper_4 > 716.558 )
								ret := -0.632653
	
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
float op_operation = decision_tree_0_BNBUSDT_30Min_875c755f(basis_max, upper_1, lower_2, upper_2, lower_3, lower_6, basis_minus, lower_4, upper_4, upper_5, basis, upper_3, lower_5, upper_6, lower_1)

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


