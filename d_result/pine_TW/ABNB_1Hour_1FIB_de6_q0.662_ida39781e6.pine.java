//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: ABNB_1Hour_1FIB_a39781e6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ABNB_1Hour_1FIB_a39781e6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ABNB_1Hour_a39781e6(basis_max, upper_1, lower_2, upper_2, lower_3, lower_6, basis_minus, lower_4, upper_4, upper_5, basis, upper_3, lower_5, upper_6, lower_1)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( basis_max <= -10.3617 )
		if( lower_1 <= 162.98 )
			if( basis_max <= -12.2529 )
				if( upper_1 <= 103.828 )
					if( upper_5 <= 111.565 )
						if( lower_4 <= 91.6417 )
							ret := 0.174184
						if( lower_4 > 91.6417 )
							ret := -1.000000 // sell
					if( upper_5 > 111.565 )
						if( basis_minus <= 18.3859 )
							ret := 0.929293 // buy
						if( basis_minus > 18.3859 )
							ret := 0.000000
				if( upper_1 > 103.828 )
					if( basis <= 102.136 )
						if( lower_4 <= 90.5751 )
							ret := -0.565957
						if( lower_4 > 90.5751 )
							ret := -0.098039
					if( basis > 102.136 )
						if( upper_5 <= 125.253 )
							ret := 0.263158
						if( upper_5 > 125.253 )
							ret := -0.013711
			if( basis_max > -12.2529 )
				if( lower_4 <= 144.867 )
					if( basis_minus <= 11.2231 )
						if( lower_1 <= 95.0556 )
							ret := 0.583333
						if( lower_1 > 95.0556 )
							ret := -0.089723
					if( basis_minus > 11.2231 )
						if( lower_5 <= 114.895 )
							ret := -0.402550
						if( lower_5 > 114.895 )
							ret := -0.113801
				if( lower_4 > 144.867 )
					if( upper_2 <= 165.937 )
						if( lower_5 <= 150.417 )
							ret := 0.545455
						if( lower_5 > 150.417 )
							ret := 0.925000 // buy
					if( upper_2 > 165.937 )
						if( basis_minus <= 11.4655 )
							ret := 0.166667
						if( basis_minus > 11.4655 )
							ret := 0.650000
		if( lower_1 > 162.98 )
			if( lower_2 <= 161.502 )
				if( upper_6 <= 206.213 )
					if( upper_3 <= 172.659 )
						if( upper_5 <= 175.912 )
							ret := -0.613636
						if( upper_5 > 175.912 )
							ret := 0.235294
					if( upper_3 > 172.659 )
						if( basis_max <= -34.125 )
							ret := -0.594595
						if( basis_max > -34.125 )
							ret := -0.869919 // sell
				if( upper_6 > 206.213 )
					if( upper_3 <= 190.432 )
						if( lower_6 <= 140.054 )
							ret := 0.722222 // buy
						if( lower_6 > 140.054 )
							ret := -1.000000 // sell
					if( upper_3 > 190.432 )
						if( basis <= 176.319 )
							ret := -0.755725 // sell
						if( basis > 176.319 )
							ret := 0.300000
			if( lower_2 > 161.502 )
				if( lower_4 <= 174.437 )
					if( lower_2 <= 179.515 )
						if( lower_1 <= 182.404 )
							ret := -0.059824
						if( lower_1 > 182.404 )
							ret := -0.569307
					if( lower_2 > 179.515 )
						if( basis_max <= -27.9071 )
							ret := 0.255396
						if( basis_max > -27.9071 )
							ret := 0.921348 // buy
				if( lower_4 > 174.437 )
					if( basis_max <= -28.2146 )
						if( lower_6 <= 166.997 )
							ret := -0.339768
						if( lower_6 > 166.997 )
							ret := -0.719457 // sell
					if( basis_max > -28.2146 )
						if( lower_5 <= 181.731 )
							ret := 0.381503
						if( lower_5 > 181.731 )
							ret := -0.804878 // sell
	if( basis_max > -10.3617 )
		if( lower_5 <= 143.339 )
			if( lower_2 <= 115.309 )
				if( basis_max <= -7.75413 )
					if( lower_3 <= 82.7832 )
						if( lower_3 <= 82.6212 )
							ret := 0.000000
						if( lower_3 > 82.6212 )
							ret := 0.967742 // buy
					if( lower_3 > 82.7832 )
						if( upper_3 <= 100.479 )
							ret := -0.201183
						if( upper_3 > 100.479 )
							ret := 0.253235
				if( basis_max > -7.75413 )
					if( lower_6 <= 79.7764 )
						ret := -0.750000 // sell
					if( lower_6 > 79.7764 )
						if( basis_minus <= 6.51683 )
							ret := 0.376190
						if( basis_minus > 6.51683 )
							ret := 0.729032 // buy
			if( lower_2 > 115.309 )
				if( lower_3 <= 121.033 )
					if( lower_1 <= 116.753 )
						if( lower_3 <= 114.816 )
							ret := 0.449275
						if( lower_3 > 114.816 )
							ret := -0.268041
					if( lower_1 > 116.753 )
						if( basis_minus <= 9.47986 )
							ret := -0.721893 // sell
						if( basis_minus > 9.47986 )
							ret := -0.289474
				if( lower_3 > 121.033 )
					if( lower_4 <= 123.958 )
						if( lower_3 <= 124.83 )
							ret := 0.463203
						if( lower_3 > 124.83 )
							ret := 1.000000 // buy
					if( lower_4 > 123.958 )
						if( lower_3 <= 131.779 )
							ret := -0.376147
						if( lower_3 > 131.779 )
							ret := 0.211422
		if( lower_5 > 143.339 )
			if( lower_3 <= 167.864 )
				if( basis_max <= -9.60923 )
					if( basis <= 169.971 )
						if( upper_1 <= 172.221 )
							ret := 0.183908
						if( upper_1 > 172.221 )
							ret := 0.935484 // buy
					if( basis > 169.971 )
						if( lower_1 <= 167.665 )
							ret := -1.000000 // sell
						if( lower_1 > 167.665 )
							ret := -0.200000
				if( basis_max > -9.60923 )
					if( upper_6 <= 155.763 )
						if( lower_6 <= 144.957 )
							ret := 0.022388
						if( lower_6 > 144.957 )
							ret := 0.826087 // buy
					if( upper_6 > 155.763 )
						if( lower_6 <= 151.924 )
							ret := -0.285124
						if( lower_6 > 151.924 )
							ret := -0.034568
			if( lower_3 > 167.864 )
				if( upper_1 <= 172.412 )
					if( basis_max <= -5.80425 )
						if( lower_4 <= 167.266 )
							ret := 0.500000
						if( lower_4 > 167.266 )
							ret := 0.000000
					if( basis_max > -5.80425 )
						if( basis_max <= -5.61925 )
							ret := 0.933333 // buy
						if( basis_max > -5.61925 )
							ret := 0.000000
				if( upper_1 > 172.412 )
					if( lower_3 <= 167.88 )
						ret := 0.714286 // buy
					if( lower_3 > 167.88 )
						ret := 1.000000 // buy
	
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
float op_operation = decision_tree_0_ABNB_1Hour_a39781e6(basis_max, upper_1, lower_2, upper_2, lower_3, lower_6, basis_minus, lower_4, upper_4, upper_5, basis, upper_3, lower_5, upper_6, lower_1)

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


