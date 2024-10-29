//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: CRWD_1Min_1ICH_f663a217 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_1Min_1ICH_f663a217", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_1Min_f663a217(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( basis_max <= 0.251467 )
		if( senkou_span_b_displaced <= 203.36 )
			if( chinkou_span <= 220.769 )
				if( chinkou_span <= 215.39 )
					if( senkou_span_b_displaced <= 200.249 )
						ret := -1.000000 // sell
					if( senkou_span_b_displaced > 200.249 )
						if( senkou_span_a_displaced <= 199.574 )
							if( basis_minus <= 1.84153 )
								ret := 0.911111 // buy
							if( basis_minus > 1.84153 )
								ret := 0.400000
						if( senkou_span_a_displaced > 199.574 )
							if( senkou_span_a_displaced <= 199.736 )
								ret := -0.750000 // sell
							if( senkou_span_a_displaced > 199.736 )
								ret := 0.857143 // buy
				if( chinkou_span > 215.39 )
					if( senkou_span_b <= 206.4 )
						if( chinkou_span <= 218.854 )
							ret := 1.000000 // buy
						if( chinkou_span > 218.854 )
							ret := 0.428571
					if( senkou_span_b > 206.4 )
						ret := 1.000000 // buy
			if( chinkou_span > 220.769 )
				ret := -0.833333 // sell
		if( senkou_span_b_displaced > 203.36 )
			if( tenkan_sen <= 390.477 )
				if( basis_minus <= 6.72827 )
					if( basis_minus <= 5.17478 )
						if( chinkou_span <= 213.825 )
							if( basis_max <= 0.049838 )
								ret := -0.740458 // sell
							if( basis_max > 0.049838 )
								ret := 0.121495
						if( chinkou_span > 213.825 )
							if( senkou_span_b <= 221.615 )
								ret := 0.218690
							if( senkou_span_b > 221.615 )
								ret := 0.033303
					if( basis_minus > 5.17478 )
						if( basis_max <= -5.51875 )
							if( tenkan_sen <= 322.422 )
								ret := 0.000000
							if( tenkan_sen > 322.422 )
								ret := -0.857143 // sell
						if( basis_max > -5.51875 )
							if( senkou_span_a_displaced <= 265.433 )
								ret := -0.294118
							if( senkou_span_a_displaced > 265.433 )
								ret := 0.720779 // buy
				if( basis_minus > 6.72827 )
					if( basis_max <= -3.69773 )
						if( senkou_span_a_displaced <= 306.112 )
							if( basis_max <= -7.3482 )
								ret := 0.142857
							if( basis_max > -7.3482 )
								ret := 0.826087 // buy
						if( senkou_span_a_displaced > 306.112 )
							ret := -0.636364
					if( basis_max > -3.69773 )
						if( chinkou_span <= 367.847 )
							if( basis_minus <= 20.1514 )
								ret := -0.666667
							if( basis_minus > 20.1514 )
								ret := 0.214286
						if( chinkou_span > 367.847 )
							if( kinjun_sen <= 369.363 )
								ret := 1.000000 // buy
							if( kinjun_sen > 369.363 )
								ret := 0.125000
			if( tenkan_sen > 390.477 )
				if( basis_minus <= 0.79815 )
					if( kinjun_sen <= 392.855 )
						if( senkou_span_b <= 390.002 )
							if( chinkou_span <= 391.611 )
								ret := -0.615385
							if( chinkou_span > 391.611 )
								ret := -1.000000 // sell
						if( senkou_span_b > 390.002 )
							if( senkou_span_b_displaced <= 388.298 )
								ret := -0.583333
							if( senkou_span_b_displaced > 388.298 )
								ret := 0.044010
					if( kinjun_sen > 392.855 )
						if( basis_minus <= 0.476288 )
							if( chinkou_span <= 390.71 )
								ret := -1.000000 // sell
							if( chinkou_span > 390.71 )
								ret := -0.800000 // sell
						if( basis_minus > 0.476288 )
							ret := -0.333333
				if( basis_minus > 0.79815 )
					if( chinkou_span <= 392.503 )
						if( chinkou_span <= 390.538 )
							if( tenkan_sen <= 390.724 )
								ret := -0.333333
							if( tenkan_sen > 390.724 )
								ret := -0.821918 // sell
						if( chinkou_span > 390.538 )
							if( senkou_span_a_displaced <= 389.395 )
								ret := 0.250000
							if( senkou_span_a_displaced > 389.395 )
								ret := -0.571429
					if( chinkou_span > 392.503 )
						if( basis_max <= -0.276203 )
							ret := 0.875000 // buy
						if( basis_max > -0.276203 )
							if( basis_minus <= 1.00523 )
								ret := 0.181818
							if( basis_minus > 1.00523 )
								ret := -0.714286 // sell
	if( basis_max > 0.251467 )
		if( basis_max <= 1.23699 )
			if( basis_minus <= 7.08992 )
				if( kinjun_sen <= 387.059 )
					if( basis_minus <= -0.342513 )
						if( chinkou_span <= 383.92 )
							if( senkou_span_b_displaced <= 234.026 )
								ret := 0.295908
							if( senkou_span_b_displaced > 234.026 )
								ret := 0.085119
						if( chinkou_span > 383.92 )
							if( senkou_span_b_displaced <= 389.942 )
								ret := 0.682243
							if( senkou_span_b_displaced > 389.942 )
								ret := -0.142857
					if( basis_minus > -0.342513 )
						if( chinkou_span <= 261.654 )
							if( senkou_span_a <= 218.574 )
								ret := 0.718750 // buy
							if( senkou_span_a > 218.574 )
								ret := -0.096280
						if( chinkou_span > 261.654 )
							if( basis_max <= 0.43352 )
								ret := 0.206316
							if( basis_max > 0.43352 )
								ret := 0.504621
				if( kinjun_sen > 387.059 )
					if( chinkou_span <= 387.05 )
						if( basis_minus <= -0.53125 )
							if( senkou_span_b_displaced <= 390.569 )
								ret := -0.897436 // sell
							if( senkou_span_b_displaced > 390.569 )
								ret := -0.357143
						if( basis_minus > -0.53125 )
							if( senkou_span_a_displaced <= 386.91 )
								ret := -0.857143 // sell
							if( senkou_span_a_displaced > 386.91 )
								ret := 0.117647
					if( chinkou_span > 387.05 )
						if( chinkou_span <= 388.319 )
							if( senkou_span_b <= 391.245 )
								ret := 0.203704
							if( senkou_span_b > 391.245 )
								ret := -0.458333
						if( chinkou_span > 388.319 )
							if( senkou_span_b <= 389.486 )
								ret := 0.722222 // buy
							if( senkou_span_b > 389.486 )
								ret := 0.302632
			if( basis_minus > 7.08992 )
				if( senkou_span_a_displaced <= 367.242 )
					if( basis_max <= 0.310345 )
						ret := -1.000000 // sell
					if( basis_max > 0.310345 )
						ret := -0.076923
				if( senkou_span_a_displaced > 367.242 )
					ret := -1.000000 // sell
		if( basis_max > 1.23699 )
			if( chinkou_span <= 342.895 )
				if( tenkan_sen <= 266.63 )
					if( kinjun_sen <= 216.462 )
						if( basis_minus <= -1.6042 )
							ret := -0.416667
						if( basis_minus > -1.6042 )
							ret := -1.000000 // sell
					if( kinjun_sen > 216.462 )
						if( senkou_span_a <= 233.954 )
							if( chinkou_span <= 227.689 )
								ret := 0.714286 // buy
							if( chinkou_span > 227.689 )
								ret := 1.000000 // buy
						if( senkou_span_a > 233.954 )
							if( senkou_span_b_displaced <= 254.979 )
								ret := -0.666667
							if( senkou_span_b_displaced > 254.979 )
								ret := 0.225225
				if( tenkan_sen > 266.63 )
					if( chinkou_span <= 276.793 )
						if( tenkan_sen <= 268.266 )
							if( basis_max <= 1.46899 )
								ret := -0.857143 // sell
							if( basis_max > 1.46899 )
								ret := 0.000000
						if( tenkan_sen > 268.266 )
							if( chinkou_span <= 266.017 )
								ret := -0.571429
							if( chinkou_span > 266.017 )
								ret := -1.000000 // sell
					if( chinkou_span > 276.793 )
						if( basis_minus <= -18.8404 )
							ret := 1.000000 // buy
						if( basis_minus > -18.8404 )
							if( tenkan_sen <= 275.931 )
								ret := 0.425000
							if( tenkan_sen > 275.931 )
								ret := -0.326633
			if( chinkou_span > 342.895 )
				if( kinjun_sen <= 387.236 )
					if( senkou_span_b <= 352.316 )
						if( senkou_span_a <= 341.075 )
							ret := 1.000000 // buy
						if( senkou_span_a > 341.075 )
							if( tenkan_sen <= 341.599 )
								ret := 0.142857
							if( tenkan_sen > 341.599 )
								ret := 0.750000 // buy
					if( senkou_span_b > 352.316 )
						if( chinkou_span <= 349.908 )
							if( tenkan_sen <= 347.642 )
								ret := -0.142857
							if( tenkan_sen > 347.642 )
								ret := -1.000000 // sell
						if( chinkou_span > 349.908 )
							if( senkou_span_a <= 384.463 )
								ret := 0.225806
							if( senkou_span_a > 384.463 )
								ret := 0.851852 // buy
				if( kinjun_sen > 387.236 )
					if( senkou_span_a_displaced <= 390.45 )
						if( basis_minus <= -1.8158 )
							ret := 0.625000
						if( basis_minus > -1.8158 )
							ret := 0.285714
					if( senkou_span_a_displaced > 390.45 )
						if( basis_minus <= -1.80114 )
							ret := -1.000000 // sell
						if( basis_minus > -1.80114 )
							if( chinkou_span <= 385.965 )
								ret := -0.700000 // sell
							if( chinkou_span > 385.965 )
								ret := -0.142857
	
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
float op_operation = decision_tree_0_CRWD_1Min_f663a217(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)

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


