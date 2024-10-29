//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: MATICUSDT_15Min_1FIB_2d27934e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MATICUSDT_15Min_1FIB_2d27934e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MATICUSDT_15Min_2d27934e(upper_2, basis, lower_6, basis_minus, lower_5, upper_5, upper_4, basis_max, upper_6, upper_3, lower_2, upper_1, lower_4, lower_1, lower_3)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( basis <= 0.355034 )
		if( lower_3 <= 0.330029 )
			if( upper_1 <= 0.367357 )
				if( lower_4 <= 0.322607 )
					if( lower_1 <= 0.341994 )
						ret := -0.500000
					if( lower_1 > 0.341994 )
						ret := -1.000000 // sell
				if( lower_4 > 0.322607 )
					if( upper_1 <= 0.366179 )
						ret := 0.333333
					if( upper_1 > 0.366179 )
						ret := 1.000000 // buy
			if( upper_1 > 0.367357 )
				if( lower_2 <= 0.328975 )
					if( basis_minus <= 0.070587 )
						if( lower_6 <= 0.284851 )
							ret := 0.750000 // buy
						if( lower_6 > 0.284851 )
							ret := 1.000000 // buy
					if( basis_minus > 0.070587 )
						ret := 1.000000 // buy
				if( lower_2 > 0.328975 )
					if( lower_2 <= 0.329746 )
						ret := 0.833333 // buy
					if( lower_2 > 0.329746 )
						ret := 0.666667
		if( lower_3 > 0.330029 )
			ret := 1.000000 // buy
	if( basis > 0.355034 )
		if( basis_max <= -0.118267 )
			if( basis_max <= -0.124058 )
				if( lower_5 <= 0.45503 )
					if( lower_4 <= 0.472401 )
						if( lower_3 <= 0.500896 )
							if( lower_5 <= 0.368699 )
								if( upper_4 <= 0.526486 )
									ret := 0.840000 // buy
								if( upper_4 > 0.526486 )
									ret := -0.224719
							if( lower_5 > 0.368699 )
								if( lower_4 <= 0.40141 )
									ret := 0.685484
								if( lower_4 > 0.40141 )
									ret := 0.091603
						if( lower_3 > 0.500896 )
							if( lower_1 <= 0.570475 )
								if( lower_2 <= 0.531521 )
									ret := -0.500000
								if( lower_2 > 0.531521 )
									ret := -1.000000 // sell
							if( lower_1 > 0.570475 )
								if( lower_6 <= 0.36972 )
									ret := -0.400000
								if( lower_6 > 0.36972 )
									ret := 1.000000 // buy
					if( lower_4 > 0.472401 )
						if( upper_3 <= 0.73899 )
							if( upper_1 <= 0.634034 )
								ret := 1.000000 // buy
							if( upper_1 > 0.634034 )
								ret := -0.600000
						if( upper_3 > 0.73899 )
							if( lower_2 <= 0.534015 )
								ret := -0.166667
							if( lower_2 > 0.534015 )
								if( basis_minus <= 0.403634 )
									ret := 0.917647 // buy
								if( basis_minus > 0.403634 )
									ret := 0.688889
				if( lower_5 > 0.45503 )
					if( lower_6 <= 0.873866 )
						if( lower_2 <= 0.938219 )
							if( upper_2 <= 1.12042 )
								if( upper_2 <= 0.672749 )
									ret := -0.651515
								if( upper_2 > 0.672749 )
									ret := 0.044804
							if( upper_2 > 1.12042 )
								if( upper_2 <= 1.17884 )
									ret := 0.713415 // buy
								if( upper_2 > 1.17884 )
									ret := -0.470588
						if( lower_2 > 0.938219 )
							if( lower_3 <= 0.917092 )
								ret := -1.000000 // sell
							if( lower_3 > 0.917092 )
								if( upper_6 <= 1.41337 )
									ret := -0.301508
								if( upper_6 > 1.41337 )
									ret := 0.253012
					if( lower_6 > 0.873866 )
						if( basis_max <= -0.189243 )
							if( lower_5 <= 1.19859 )
								if( lower_1 <= 1.09041 )
									ret := 0.320000
								if( lower_1 > 1.09041 )
									ret := -0.652542
							if( lower_5 > 1.19859 )
								if( basis_max <= -0.199418 )
									ret := -0.375000
								if( basis_max > -0.199418 )
									ret := 0.794118 // buy
						if( basis_max > -0.189243 )
							if( upper_6 <= 1.20439 )
								if( basis_minus <= 0.12732 )
									ret := 0.083333
								if( basis_minus > 0.12732 )
									ret := 0.723077 // buy
							if( upper_6 > 1.20439 )
								if( upper_6 <= 1.61613 )
									ret := 0.189751
								if( upper_6 > 1.61613 )
									ret := -0.525424
			if( basis_max > -0.124058 )
				if( lower_1 <= 1.19582 )
					if( lower_1 <= 0.416293 )
						if( lower_6 <= 0.323877 )
							ret := -0.750000 // sell
						if( lower_6 > 0.323877 )
							ret := -1.000000 // sell
					if( lower_1 > 0.416293 )
						if( upper_1 <= 1.24347 )
							if( lower_5 <= 1.06127 )
								if( lower_6 <= 0.771177 )
									ret := 0.255814
								if( lower_6 > 0.771177 )
									ret := 0.522613
							if( lower_5 > 1.06127 )
								if( upper_5 <= 1.2554 )
									ret := -0.903226 // sell
								if( upper_5 > 1.2554 )
									ret := 0.180000
						if( upper_1 > 1.24347 )
							if( upper_4 <= 1.29824 )
								ret := 1.000000 // buy
							if( upper_4 > 1.29824 )
								ret := 0.285714
				if( lower_1 > 1.19582 )
					if( basis_max <= -0.121553 )
						if( lower_1 <= 1.19831 )
							if( lower_6 <= 1.10379 )
								ret := 0.000000
							if( lower_6 > 1.10379 )
								ret := 1.000000 // buy
						if( lower_1 > 1.19831 )
							if( basis <= 1.30555 )
								ret := -0.500000
							if( basis > 1.30555 )
								if( upper_5 <= 1.53492 )
									ret := 0.800000 // buy
								if( upper_5 > 1.53492 )
									ret := -0.500000
					if( basis_max > -0.121553 )
						if( upper_2 <= 1.27084 )
							if( upper_1 <= 1.25196 )
								ret := -0.750000 // sell
							if( upper_1 > 1.25196 )
								ret := -1.000000 // sell
						if( upper_2 > 1.27084 )
							if( upper_6 <= 1.34994 )
								if( basis <= 1.22538 )
									ret := 0.000000
								if( basis > 1.22538 )
									ret := 0.500000
							if( upper_6 > 1.34994 )
								if( basis_minus <= 0.120664 )
									ret := -0.361111
								if( basis_minus > 0.120664 )
									ret := -0.846154 // sell
		if( basis_max > -0.118267 )
			if( upper_1 <= 0.998369 )
				if( basis <= 0.969085 )
					if( lower_1 <= 0.900961 )
						if( upper_1 <= 0.370167 )
							if( lower_2 <= 0.336261 )
								if( basis_max <= -0.062721 )
									ret := -0.750000 // sell
								if( basis_max > -0.062721 )
									ret := -0.964286 // sell
							if( lower_2 > 0.336261 )
								if( lower_1 <= 0.344395 )
									ret := 0.500000
								if( lower_1 > 0.344395 )
									ret := -1.000000 // sell
						if( upper_1 > 0.370167 )
							if( lower_3 <= 0.323658 )
								if( basis_minus <= 0.079705 )
									ret := 0.119403
								if( basis_minus > 0.079705 )
									ret := 0.797468 // buy
							if( lower_3 > 0.323658 )
								if( upper_1 <= 0.431529 )
									ret := -0.041277
								if( upper_1 > 0.431529 )
									ret := 0.056720
					if( lower_1 > 0.900961 )
						if( lower_1 <= 0.904479 )
							if( basis_minus <= 0.074034 )
								if( basis <= 0.916355 )
									ret := -0.160784
								if( basis > 0.916355 )
									ret := -0.716418 // sell
							if( basis_minus > 0.074034 )
								if( upper_2 <= 0.96436 )
									ret := 0.456790
								if( upper_2 > 0.96436 )
									ret := -0.800000 // sell
						if( lower_1 > 0.904479 )
							if( upper_5 <= 0.937996 )
								if( upper_3 <= 0.928773 )
									ret := -0.127660
								if( upper_3 > 0.928773 )
									ret := 0.536585
							if( upper_5 > 0.937996 )
								if( lower_1 <= 0.943242 )
									ret := -0.049290
								if( lower_1 > 0.943242 )
									ret := 0.149789
				if( basis > 0.969085 )
					if( upper_3 <= 0.984646 )
						if( basis_minus <= 0.027554 )
							ret := 0.250000
						if( basis_minus > 0.027554 )
							if( lower_4 <= 0.952107 )
								if( upper_6 <= 0.998072 )
									ret := 0.500000
								if( upper_6 > 0.998072 )
									ret := 1.000000 // buy
							if( lower_4 > 0.952107 )
								ret := 1.000000 // buy
					if( upper_3 > 0.984646 )
						if( basis_minus <= 0.029489 )
							if( basis <= 0.990317 )
								if( upper_3 <= 1.00138 )
									ret := -0.541667
								if( upper_3 > 1.00138 )
									ret := -1.000000 // sell
							if( basis > 0.990317 )
								if( basis <= 0.99155 )
									ret := 0.413793
								if( basis > 0.99155 )
									ret := 0.029126
						if( basis_minus > 0.029489 )
							if( basis_minus <= 0.036248 )
								if( upper_4 <= 1.00599 )
									ret := 0.333333
								if( upper_4 > 1.00599 )
									ret := 0.628866
							if( basis_minus > 0.036248 )
								if( lower_3 <= 0.952751 )
									ret := 0.262123
								if( lower_3 > 0.952751 )
									ret := 0.106383
			if( upper_1 > 0.998369 )
				if( basis_minus <= 0.093489 )
					if( upper_6 <= 1.0493 )
						if( upper_6 <= 1.0473 )
							if( lower_3 <= 0.966738 )
								if( lower_3 <= 0.964018 )
									ret := -0.283186
								if( lower_3 > 0.964018 )
									ret := -0.727273 // sell
							if( lower_3 > 0.966738 )
								if( basis_minus <= 0.0202 )
									ret := -0.716981 // sell
								if( basis_minus > 0.0202 )
									ret := 0.000000
						if( upper_6 > 1.0473 )
							if( lower_6 <= 0.941505 )
								if( basis_minus <= 0.055119 )
									ret := -0.206897
								if( basis_minus > 0.055119 )
									ret := 0.461538
							if( lower_6 > 0.941505 )
								if( basis <= 1.00883 )
									ret := -0.653846
								if( basis > 1.00883 )
									ret := -1.000000 // sell
					if( upper_6 > 1.0493 )
						if( lower_2 <= 1.21128 )
							if( lower_4 <= 1.19439 )
								if( lower_1 <= 1.09777 )
									ret := 0.106107
								if( lower_1 > 1.09777 )
									ret := -0.000683
							if( lower_4 > 1.19439 )
								if( lower_6 <= 1.16969 )
									ret := 1.000000 // buy
								if( lower_6 > 1.16969 )
									ret := 0.297030
						if( lower_2 > 1.21128 )
							if( lower_1 <= 1.24186 )
								if( upper_6 <= 1.31841 )
									ret := -0.496622
								if( upper_6 > 1.31841 )
									ret := 0.186047
							if( lower_1 > 1.24186 )
								if( upper_1 <= 1.31032 )
									ret := 0.106383
								if( upper_1 > 1.31032 )
									ret := -0.224319
				if( basis_minus > 0.093489 )
					if( upper_4 <= 1.19073 )
						if( upper_2 <= 1.14771 )
							if( lower_3 <= 1.04208 )
								if( lower_2 <= 0.991659 )
									ret := -0.086687
								if( lower_2 > 0.991659 )
									ret := -0.431373
							if( lower_3 > 1.04208 )
								if( upper_2 <= 1.1398 )
									ret := 0.300000
								if( upper_2 > 1.1398 )
									ret := 0.808824 // buy
						if( upper_2 > 1.14771 )
							if( lower_1 <= 1.08592 )
								if( upper_5 <= 1.19071 )
									ret := -0.948718 // sell
								if( upper_5 > 1.19071 )
									ret := -0.565217
							if( lower_1 > 1.08592 )
								if( lower_2 <= 1.07436 )
									ret := 0.027027
								if( lower_2 > 1.07436 )
									ret := -0.538071
					if( upper_4 > 1.19073 )
						if( upper_6 <= 1.27517 )
							if( basis_minus <= 0.095854 )
								if( lower_1 <= 1.12077 )
									ret := 0.307692
								if( lower_1 > 1.12077 )
									ret := -0.547170
							if( basis_minus > 0.095854 )
								if( lower_6 <= 1.03873 )
									ret := 0.036530
								if( lower_6 > 1.03873 )
									ret := 0.661290
						if( upper_6 > 1.27517 )
							if( basis_max <= -0.112597 )
								if( upper_6 <= 1.34733 )
									ret := -0.496774
								if( upper_6 > 1.34733 )
									ret := 0.142857
							if( basis_max > -0.112597 )
								if( basis_minus <= 0.106966 )
									ret := -0.158513
								if( basis_minus > 0.106966 )
									ret := 0.240506
	
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
float op_operation = decision_tree_0_MATICUSDT_15Min_2d27934e(upper_2, basis, lower_6, basis_minus, lower_5, upper_5, upper_4, basis_max, upper_6, upper_3, lower_2, upper_1, lower_4, lower_1, lower_3)

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


