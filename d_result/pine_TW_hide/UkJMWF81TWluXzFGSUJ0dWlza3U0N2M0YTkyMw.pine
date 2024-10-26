//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: RBLX_5Min_1FIB_47c4a923 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_RBLX_5Min_1FIB_47c4a923", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_RBLX_5Min_47c4a923(lower_6, lower_3, basis_max, lower_1, upper_2, upper_6, upper_4, lower_2, basis_minus, upper_3, lower_5, upper_1, lower_4, basis, upper_5)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( basis <= 39.6739 )
		if( upper_1 <= 39.5238 )
			if( upper_2 <= 26.78 )
				if( upper_4 <= 26.8613 )
					if( lower_3 <= 24.92 )
						if( basis <= 25.43 )
							ret := 0.470588
						if( basis > 25.43 )
							ret := 0.960000 // buy
					if( lower_3 > 24.92 )
						if( lower_6 <= 24.6907 )
							ret := -0.333333
						if( lower_6 > 24.6907 )
							ret := 0.167213
				if( upper_4 > 26.8613 )
					if( upper_1 <= 26.4088 )
						if( lower_6 <= 24.7193 )
							ret := -0.117647
						if( lower_6 > 24.7193 )
							ret := -1.000000 // sell
					if( upper_1 > 26.4088 )
						if( upper_1 <= 26.724 )
							ret := 0.563636
						if( upper_1 > 26.724 )
							ret := 1.000000 // buy
			if( upper_2 > 26.78 )
				if( lower_1 <= 26.7431 )
					if( lower_3 <= 26.2703 )
						if( lower_6 <= 24.9966 )
							ret := -0.760000 // sell
						if( lower_6 > 24.9966 )
							ret := 0.125581
					if( lower_3 > 26.2703 )
						if( lower_4 <= 26.4483 )
							ret := -0.390018
						if( lower_4 > 26.4483 )
							ret := 0.166667
				if( lower_1 > 26.7431 )
					if( lower_6 <= 38.4748 )
						if( lower_3 <= 38.7519 )
							ret := 0.025643
						if( lower_3 > 38.7519 )
							ret := 0.670213
					if( lower_6 > 38.4748 )
						if( basis_minus <= 0.51732 )
							ret := -0.034483
						if( basis_minus > 0.51732 )
							ret := -0.600000
		if( upper_1 > 39.5238 )
			if( lower_5 <= 35.3721 )
				if( basis_minus <= 4.29969 )
					ret := 1.000000 // buy
				if( basis_minus > 4.29969 )
					if( lower_4 <= 35.0624 )
						if( basis_max <= -6.7345 )
							ret := 0.600000
						if( basis_max > -6.7345 )
							ret := -0.608696
					if( lower_4 > 35.0624 )
						if( upper_3 <= 40.7081 )
							ret := -0.238095
						if( upper_3 > 40.7081 )
							ret := -0.918605 // sell
			if( lower_5 > 35.3721 )
				if( basis_max <= -0.924402 )
					if( upper_1 <= 39.593 )
						if( upper_2 <= 39.6883 )
							ret := 0.000000
						if( upper_2 > 39.6883 )
							ret := 0.619926
					if( upper_1 > 39.593 )
						if( basis_max <= -1.15802 )
							ret := 0.189036
						if( basis_max > -1.15802 )
							ret := 0.627907
				if( basis_max > -0.924402 )
					if( lower_6 <= 38.4493 )
						ret := -1.000000 // sell
					if( lower_6 > 38.4493 )
						if( basis <= 39.355 )
							ret := 0.351351
						if( basis > 39.355 )
							ret := -0.529412
	if( basis > 39.6739 )
		if( basis <= 39.7698 )
			if( lower_3 <= 38.8919 )
				if( basis_minus <= 1.88535 )
					if( lower_1 <= 39.3062 )
						if( basis <= 39.7357 )
							ret := 0.125000
						if( basis > 39.7357 )
							ret := -1.000000 // sell
					if( lower_1 > 39.3062 )
						if( lower_1 <= 39.3167 )
							ret := 0.894737 // buy
						if( lower_1 > 39.3167 )
							ret := 0.242424
				if( basis_minus > 1.88535 )
					if( basis_max <= -2.0881 )
						if( lower_3 <= 37.5609 )
							ret := -0.763158 // sell
						if( lower_3 > 37.5609 )
							ret := 0.019737
					if( basis_max > -2.0881 )
						if( lower_4 <= 38.502 )
							ret := -0.942308 // sell
						if( lower_4 > 38.502 )
							ret := -0.152174
			if( lower_3 > 38.8919 )
				if( lower_3 <= 38.9567 )
					if( lower_3 <= 38.9083 )
						ret := -0.615385
					if( lower_3 > 38.9083 )
						if( basis <= 39.7171 )
							ret := -1.000000 // sell
						if( basis > 39.7171 )
							ret := -0.896552 // sell
				if( lower_3 > 38.9567 )
					if( basis <= 39.7347 )
						if( basis <= 39.71 )
							ret := -0.451456
						if( basis > 39.71 )
							ret := 0.171429
					if( basis > 39.7347 )
						if( upper_1 <= 40.1089 )
							ret := -0.582353
						if( upper_1 > 40.1089 )
							ret := 0.500000
		if( basis > 39.7698 )
			if( upper_1 <= 47.7369 )
				if( lower_3 <= 46.6845 )
					if( upper_6 <= 47.1858 )
						if( lower_3 <= 45.2158 )
							ret := -0.030221
						if( lower_3 > 45.2158 )
							ret := 0.273128
					if( upper_6 > 47.1858 )
						if( upper_2 <= 47.0662 )
							ret := -0.263023
						if( upper_2 > 47.0662 )
							ret := 0.069409
				if( lower_3 > 46.6845 )
					if( basis <= 47.4173 )
						ret := 1.000000 // buy
					if( basis > 47.4173 )
						ret := 0.000000
			if( upper_1 > 47.7369 )
				if( upper_5 <= 48.4807 )
					ret := -0.166667
				if( upper_5 > 48.4807 )
					if( upper_4 <= 48.706 )
						if( upper_3 <= 48.1579 )
							ret := -0.727273 // sell
						if( upper_3 > 48.1579 )
							ret := -0.971429 // sell
					if( upper_4 > 48.706 )
						ret := -0.631579
	
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
float op_operation = decision_tree_0_RBLX_5Min_47c4a923(lower_6, lower_3, basis_max, lower_1, upper_2, upper_6, upper_4, lower_2, basis_minus, upper_3, lower_5, upper_1, lower_4, basis, upper_5)

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


