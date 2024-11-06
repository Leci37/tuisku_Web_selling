//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: UPST_1Min_1ICH_4f5f6e06 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UPST_1Min_1ICH_4f5f6e06", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UPST_1Min_4f5f6e06(senkou_span_a_displaced, cross_dn_tenkan_kinjunInt, kinjun_sen, chinkou_span, senkou_span_b_displaced, basis_minus, senkou_span_b, senkou_span_a, cross_up_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( senkou_span_b <= 54.8875 )
		if( senkou_span_b_displaced <= 20.8866 )
			if( chinkou_span <= 20.6103 )
				if( tenkan_sen <= 20.2817 )
					if( senkou_span_b_displaced <= 20.6382 )
						ret := 0.142857
					if( senkou_span_b_displaced > 20.6382 )
						if( chinkou_span <= 20.5518 )
							if( kinjun_sen <= 20.4069 )
								if( tenkan_sen <= 20.2592 )
									ret := 1.000000 // buy
								if( tenkan_sen > 20.2592 )
									ret := 0.750000 // buy
							if( kinjun_sen > 20.4069 )
								ret := 0.600000
						if( chinkou_span > 20.5518 )
							ret := 0.250000
				if( tenkan_sen > 20.2817 )
					if( senkou_span_a <= 20.2706 )
						ret := -0.750000 // sell
					if( senkou_span_a > 20.2706 )
						ret := -1.000000 // sell
			if( chinkou_span > 20.6103 )
				if( senkou_span_a_displaced <= 20.2559 )
					if( senkou_span_a_displaced <= 20.2401 )
						ret := -0.800000 // sell
					if( senkou_span_a_displaced > 20.2401 )
						ret := -0.200000
				if( senkou_span_a_displaced > 20.2559 )
					if( chinkou_span <= 22.7547 )
						if( senkou_span_b <= 21.2793 )
							if( senkou_span_a_displaced <= 20.2618 )
								ret := 0.428571
							if( senkou_span_a_displaced > 20.2618 )
								if( senkou_span_b_displaced <= 20.5901 )
									ret := 0.940594 // buy
								if( senkou_span_b_displaced > 20.5901 )
									ret := 0.500000
						if( senkou_span_b > 21.2793 )
							if( basis_minus <= 0.380075 )
								ret := -0.428571
							if( basis_minus > 0.380075 )
								ret := 1.000000 // buy
					if( chinkou_span > 22.7547 )
						if( kinjun_sen <= 21.173 )
							ret := 1.000000 // buy
						if( kinjun_sen > 21.173 )
							ret := -0.666667
		if( senkou_span_b_displaced > 20.8866 )
			if( chinkou_span <= 45.2102 )
				if( senkou_span_a <= 43.4173 )
					if( chinkou_span <= 43.0311 )
						if( senkou_span_a <= 40.7796 )
							if( basis_minus <= -0.129252 )
								if( chinkou_span <= 40.3075 )
									ret := 0.086109
								if( chinkou_span > 40.3075 )
									ret := 0.635204
							if( basis_minus > -0.129252 )
								if( basis_max <= 0.115738 )
									ret := 0.042977
								if( basis_max > 0.115738 )
									ret := -0.303258
						if( senkou_span_a > 40.7796 )
							if( chinkou_span <= 41.8638 )
								if( tenkan_sen <= 41.3339 )
									ret := -0.074205
								if( tenkan_sen > 41.3339 )
									ret := -0.412513
							if( chinkou_span > 41.8638 )
								if( kinjun_sen <= 42.5422 )
									ret := 0.226190
								if( kinjun_sen > 42.5422 )
									ret := -0.175664
					if( chinkou_span > 43.0311 )
						if( kinjun_sen <= 43.1025 )
							if( chinkou_span <= 43.1755 )
								if( senkou_span_b <= 42.535 )
									ret := 0.700000 // buy
								if( senkou_span_b > 42.535 )
									ret := 0.162791
							if( chinkou_span > 43.1755 )
								if( tenkan_sen <= 43.395 )
									ret := 0.629156
								if( tenkan_sen > 43.395 )
									ret := 0.950000 // buy
						if( kinjun_sen > 43.1025 )
							if( basis_max <= 0.010499 )
								if( chinkou_span <= 43.8064 )
									ret := -0.140625
								if( chinkou_span > 43.8064 )
									ret := 0.727273 // buy
							if( basis_max > 0.010499 )
								if( senkou_span_b_displaced <= 43.7361 )
									ret := 0.594737
								if( senkou_span_b_displaced > 43.7361 )
									ret := -0.176471
				if( senkou_span_a > 43.4173 )
					if( chinkou_span <= 43.5539 )
						if( basis_minus <= -0.312139 )
							if( senkou_span_b <= 44.145 )
								if( basis_minus <= -0.4798 )
									ret := 0.200000
								if( basis_minus > -0.4798 )
									ret := 0.900000 // buy
							if( senkou_span_b > 44.145 )
								if( basis_minus <= -0.459025 )
									ret := -0.789474 // sell
								if( basis_minus > -0.459025 )
									ret := 0.000000
						if( basis_minus > -0.312139 )
							if( basis_minus <= 0.09461 )
								if( basis_minus <= -0.003501 )
									ret := -0.500000
								if( basis_minus > -0.003501 )
									ret := -0.910000 // sell
							if( basis_minus > 0.09461 )
								if( senkou_span_a <= 43.8241 )
									ret := -0.259259
								if( senkou_span_a > 43.8241 )
									ret := -0.633333
					if( chinkou_span > 43.5539 )
						if( senkou_span_b_displaced <= 45.0411 )
							if( basis_max <= -0.059851 )
								if( senkou_span_b_displaced <= 44.2132 )
									ret := -0.162281
								if( senkou_span_b_displaced > 44.2132 )
									ret := -0.851852 // sell
							if( basis_max > -0.059851 )
								if( senkou_span_a <= 43.8997 )
									ret := 0.371212
								if( senkou_span_a > 43.8997 )
									ret := -0.031603
						if( senkou_span_b_displaced > 45.0411 )
							if( senkou_span_a_displaced <= 45.3298 )
								if( tenkan_sen <= 44.9725 )
									ret := -0.111111
								if( tenkan_sen > 44.9725 )
									ret := -0.595238
							if( senkou_span_a_displaced > 45.3298 )
								if( chinkou_span <= 44.0682 )
									ret := -1.000000 // sell
								if( chinkou_span > 44.0682 )
									ret := -0.250000
			if( chinkou_span > 45.2102 )
				if( tenkan_sen <= 54.7085 )
					if( kinjun_sen <= 46.626 )
						if( kinjun_sen <= 44.2673 )
							ret := -1.000000 // sell
						if( kinjun_sen > 44.2673 )
							if( basis_minus <= 0.43375 )
								if( basis_minus <= 0.139702 )
									ret := 0.548673
								if( basis_minus > 0.139702 )
									ret := 0.828358 // buy
							if( basis_minus > 0.43375 )
								if( chinkou_span <= 46.6925 )
									ret := -0.750000 // sell
								if( chinkou_span > 46.6925 )
									ret := 0.000000
					if( kinjun_sen > 46.626 )
						if( kinjun_sen <= 48.6115 )
							if( senkou_span_a_displaced <= 46.51 )
								if( senkou_span_b_displaced <= 45.9367 )
									ret := -0.166667
								if( senkou_span_b_displaced > 45.9367 )
									ret := -0.800000 // sell
							if( senkou_span_a_displaced > 46.51 )
								if( basis_minus <= 0.150427 )
									ret := 0.169811
								if( basis_minus > 0.150427 )
									ret := -0.138614
						if( kinjun_sen > 48.6115 )
							if( basis_minus <= 1.2572 )
								if( senkou_span_b <= 54.0775 )
									ret := 0.684411
								if( senkou_span_b > 54.0775 )
									ret := 0.238095
							if( basis_minus > 1.2572 )
								if( chinkou_span <= 52.3892 )
									ret := -1.000000 // sell
								if( chinkou_span > 52.3892 )
									ret := -0.750000 // sell
				if( tenkan_sen > 54.7085 )
					if( chinkou_span <= 54.9518 )
						if( senkou_span_a_displaced <= 53.7603 )
							if( tenkan_sen <= 55.4964 )
								if( basis_minus <= 0.888611 )
									ret := 0.250000
								if( basis_minus > 0.888611 )
									ret := 0.800000 // buy
							if( tenkan_sen > 55.4964 )
								if( basis_minus <= 1.31573 )
									ret := -0.555556
								if( basis_minus > 1.31573 )
									ret := 0.500000
						if( senkou_span_a_displaced > 53.7603 )
							if( tenkan_sen <= 54.7864 )
								if( basis_minus <= 0.440714 )
									ret := -0.642857
								if( basis_minus > 0.440714 )
									ret := 0.600000
							if( tenkan_sen > 54.7864 )
								if( senkou_span_a_displaced <= 54.7488 )
									ret := -0.875000 // sell
								if( senkou_span_a_displaced > 54.7488 )
									ret := -0.333333
					if( chinkou_span > 54.9518 )
						if( chinkou_span <= 55.4655 )
							if( tenkan_sen <= 54.9888 )
								if( senkou_span_a_displaced <= 54.3311 )
									ret := 0.600000
								if( senkou_span_a_displaced > 54.3311 )
									ret := 1.000000 // buy
							if( tenkan_sen > 54.9888 )
								ret := 0.000000
						if( chinkou_span > 55.4655 )
							ret := -0.400000
	if( senkou_span_b > 54.8875 )
		if( senkou_span_b_displaced <= 54.58 )
			if( senkou_span_b <= 55.1615 )
				if( senkou_span_a <= 55.3026 )
					if( senkou_span_b_displaced <= 54.4281 )
						ret := 0.200000
					if( senkou_span_b_displaced > 54.4281 )
						if( senkou_span_a_displaced <= 54.979 )
							ret := 0.750000 // buy
						if( senkou_span_a_displaced > 54.979 )
							ret := 1.000000 // buy
				if( senkou_span_a > 55.3026 )
					ret := -0.200000
			if( senkou_span_b > 55.1615 )
				if( senkou_span_a_displaced <= 55.393 )
					ret := -1.000000 // sell
				if( senkou_span_a_displaced > 55.393 )
					ret := -0.250000
		if( senkou_span_b_displaced > 54.58 )
			if( tenkan_sen <= 54.4885 )
				if( senkou_span_a_displaced <= 54.9364 )
					if( chinkou_span <= 53.6217 )
						ret := -1.000000 // sell
					if( chinkou_span > 53.6217 )
						ret := -0.500000
				if( senkou_span_a_displaced > 54.9364 )
					ret := -0.250000
			if( tenkan_sen > 54.4885 )
				if( tenkan_sen <= 55.0972 )
					ret := -1.000000 // sell
				if( tenkan_sen > 55.0972 )
					if( chinkou_span <= 54.0715 )
						ret := -0.571429
					if( chinkou_span > 54.0715 )
						ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Ichimoku_Cloud 
//@version=5
//indicator "Ichimoku Cloud", overlay=true)

// Input parameters for the Ichimoku Cloud
turning_periods = input.int(9, title="Tenkan-Sen Period")
standard_periods = input.int(26, title="Kinjun-Sen Period")
leading_span2_periods = input.int(52, title="Senkou Span B Period")
displacement = input.int(26, title="Displacement")

show_tenkan_sen = input.bool(true, title="Show Tenkan-Sen")
show_kinjun_sen = input.bool(true, title="Show Kinjun-Sen")
show_chinkou_span = input.bool(true, title="Show Chinkou Span")
show_cloud = input.bool(true, title="Show Cloud")
show_crosses = input.bool(false, title="Show Crosses")

// Donchian channel calculation
donchian(highs, lows, length) =>
    (ta.highest(highs, length) + ta.lowest(lows, length)) / 2

// Ichimoku calculations
tenkan_sen = donchian(high, low, turning_periods)
kinjun_sen = donchian(high, low, standard_periods)
senkou_span_a = (tenkan_sen + kinjun_sen) / 2
senkou_span_b = donchian(high, low, leading_span2_periods)

// Displaced Senkou Spans
senkou_span_a_displaced = senkou_span_a[displacement]
senkou_span_b_displaced = senkou_span_b[displacement]

// Chinkou Span
chinkou_span = close[displacement]

// Crosses
cross_up_tenkan_kinjun = ta.crossover(tenkan_sen, kinjun_sen)
cross_dn_tenkan_kinjun = ta.crossunder(tenkan_sen, kinjun_sen)
cross_up_tenkan_kinjunInt = cross_up_tenkan_kinjun ? 1 : 0  // Bool to int
cross_dn_tenkan_kinjunInt = cross_dn_tenkan_kinjun ? 1 : 0  // Bool to int

basis_minus = senkou_span_a - senkou_span_b
basis_max = senkou_span_a - tenkan_sen

// Plotting
plot(show_tenkan_sen ? tenkan_sen : na, color=color.lime, title="Tenkan-Sen", linewidth=1)
plot(show_kinjun_sen ? kinjun_sen : na, color=color.fuchsia, title="Kinjun-Sen", linewidth=1)
plot(show_chinkou_span ? chinkou_span : na, color=color.aqua, title="Chinkou Span", linewidth=1, offset=-displacement)

// Plot the Senkou Span lines and store the plot references
senkou_span_a_plot = plot(show_cloud ? senkou_span_a_displaced : na, color=color.green, title="Senkou Span A", linewidth=1)
senkou_span_b_plot = plot(show_cloud ? senkou_span_b_displaced : na, color=color.red, title="Senkou Span B", linewidth=1)

// Cloud filling
fill(senkou_span_a_plot, senkou_span_b_plot, color=color.new(color.lime, 90), title="Bullish Cloud", transp=70, fillgaps=true)
fill(senkou_span_a_plot, senkou_span_b_plot, color=color.new(color.red, 90), title="Bearish Cloud", transp=70, fillgaps=true)

plotshape(series=(show_crosses and cross_up_tenkan_kinjun) ? close : na, location=location.belowbar, color=color.yellow, style=shape.triangleup, size=size.small, title="Cross Up Tenkan Kinjun")
plotshape(series=(show_crosses and cross_dn_tenkan_kinjun) ? close : na, location=location.abovebar, color=color.yellow, style=shape.triangledown, size=size.small, title="Cross Down Tenkan Kinjun")

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
float op_operation = decision_tree_0_UPST_1Min_4f5f6e06(senkou_span_a_displaced, cross_dn_tenkan_kinjunInt, kinjun_sen, chinkou_span, senkou_span_b_displaced, basis_minus, senkou_span_b, senkou_span_a, cross_up_tenkan_kinjunInt, tenkan_sen, basis_max)

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


