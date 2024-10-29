//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: NFLX_15Min_1ICH_df0e57c8 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NFLX_15Min_1ICH_df0e57c8", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NFLX_15Min_df0e57c8(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7,max_features=sqrt, min_samples_leaf=4,random_state=843828734)
	if( senkou_span_a <= 291.295 )
		if( kinjun_sen <= 117.332 )
			if( senkou_span_a <= 117.322 )
				if( basis_minus <= -0.201996 )
					if( basis_minus <= -0.847638 )
						ret := 0.866667 // buy
					if( basis_minus > -0.847638 )
						ret := 1.000000 // buy
				if( basis_minus > -0.201996 )
					if( basis_max <= -0.179918 )
						if( chinkou_span <= 119.834 )
							ret := 0.250000
						if( chinkou_span > 119.834 )
							if( chinkou_span <= 120.057 )
								ret := 0.857143 // buy
							if( chinkou_span > 120.057 )
								ret := 1.000000 // buy
					if( basis_max > -0.179918 )
						ret := 0.000000
			if( senkou_span_a > 117.322 )
				ret := 0.200000
		if( kinjun_sen > 117.332 )
			if( chinkou_span <= 288.189 )
				if( senkou_span_b_displaced <= 272.391 )
					if( senkou_span_b_displaced <= 271.346 )
						if( basis_minus <= -6.389 )
							if( basis_minus <= -6.95457 )
								ret := 0.273684
							if( basis_minus > -6.95457 )
								ret := 0.896552 // buy
						if( basis_minus > -6.389 )
							if( basis_max <= 1.798 )
								ret := 0.048760
							if( basis_max > 1.798 )
								ret := -0.174041
					if( senkou_span_b_displaced > 271.346 )
						if( kinjun_sen <= 279.685 )
							if( senkou_span_b_displaced <= 272.316 )
								ret := 0.601562
							if( senkou_span_b_displaced > 272.316 )
								ret := 0.012821
						if( kinjun_sen > 279.685 )
							if( senkou_span_a <= 281.9 )
								ret := -0.944444 // sell
							if( senkou_span_a > 281.9 )
								ret := 0.000000
				if( senkou_span_b_displaced > 272.391 )
					if( chinkou_span <= 280.588 )
						if( basis_minus <= -1.28342 )
							if( senkou_span_b_displaced <= 284.217 )
								ret := 0.108604
							if( senkou_span_b_displaced > 284.217 )
								ret := -0.354194
						if( basis_minus > -1.28342 )
							if( senkou_span_a_displaced <= 266.733 )
								ret := 0.692308
							if( senkou_span_a_displaced > 266.733 )
								ret := -0.621795
					if( chinkou_span > 280.588 )
						if( kinjun_sen <= 289.55 )
							if( tenkan_sen <= 283.552 )
								ret := 0.294509
							if( tenkan_sen > 283.552 )
								ret := 0.004766
						if( kinjun_sen > 289.55 )
							if( senkou_span_b_displaced <= 295.063 )
								ret := -0.444898
							if( senkou_span_b_displaced > 295.063 )
								ret := -0.015748
			if( chinkou_span > 288.189 )
				if( chinkou_span <= 293.447 )
					if( tenkan_sen <= 280.489 )
						if( senkou_span_a_displaced <= 280.526 )
							if( senkou_span_b <= 270.621 )
								ret := 0.500000
							if( senkou_span_b > 270.621 )
								ret := 0.938202 // buy
						if( senkou_span_a_displaced > 280.526 )
							if( kinjun_sen <= 279.082 )
								ret := 0.533333
							if( kinjun_sen > 279.082 )
								ret := 0.833333 // buy
					if( tenkan_sen > 280.489 )
						if( basis_max <= 0.000232 )
							if( basis_minus <= 1.28373 )
								ret := -0.098299
							if( basis_minus > 1.28373 )
								ret := 0.285714
						if( basis_max > 0.000232 )
							if( senkou_span_a_displaced <= 279.5 )
								ret := -1.000000 // sell
							if( senkou_span_a_displaced > 279.5 )
								ret := 0.505660
				if( chinkou_span > 293.447 )
					if( senkou_span_a <= 287.387 )
						if( chinkou_span <= 309.81 )
							if( senkou_span_a_displaced <= 284.871 )
								ret := 0.886598 // buy
							if( senkou_span_a_displaced > 284.871 )
								ret := 0.673469
						if( chinkou_span > 309.81 )
							if( basis_minus <= -0.059609 )
								ret := 0.750000 // buy
							if( basis_minus > -0.059609 )
								ret := -0.545455
					if( senkou_span_a > 287.387 )
						if( senkou_span_b_displaced <= 277.139 )
							if( senkou_span_a_displaced <= 277.274 )
								ret := 1.000000 // buy
							if( senkou_span_a_displaced > 277.274 )
								ret := -0.727273 // sell
						if( senkou_span_b_displaced > 277.139 )
							if( tenkan_sen <= 288.653 )
								ret := 0.078947
							if( tenkan_sen > 288.653 )
								ret := 0.650862
	if( senkou_span_a > 291.295 )
		if( kinjun_sen <= 295.273 )
			if( senkou_span_b <= 291.903 )
				if( basis_max <= -0.292627 )
					if( senkou_span_b <= 290.747 )
						if( senkou_span_a <= 293.64 )
							if( kinjun_sen <= 291.769 )
								ret := 0.069930
							if( kinjun_sen > 291.769 )
								ret := 0.717391 // buy
						if( senkou_span_a > 293.64 )
							if( chinkou_span <= 289.564 )
								ret := -1.000000 // sell
							if( chinkou_span > 289.564 )
								ret := 0.416667
					if( senkou_span_b > 290.747 )
						if( chinkou_span <= 293.765 )
							if( basis_max <= -1.43404 )
								ret := -0.062500
							if( basis_max > -1.43404 )
								ret := -0.833333 // sell
						if( chinkou_span > 293.765 )
							if( senkou_span_a <= 301.352 )
								ret := 0.227273
							if( senkou_span_a > 301.352 )
								ret := -0.791667 // sell
				if( basis_max > -0.292627 )
					if( senkou_span_b_displaced <= 285.538 )
						if( tenkan_sen <= 293.672 )
							if( chinkou_span <= 292.897 )
								ret := 0.000000
							if( chinkou_span > 292.897 )
								ret := 0.785714 // buy
						if( tenkan_sen > 293.672 )
							ret := -0.500000
					if( senkou_span_b_displaced > 285.538 )
						if( basis_max <= 0.505 )
							if( kinjun_sen <= 291.317 )
								ret := -0.142857
							if( kinjun_sen > 291.317 )
								ret := -0.847458 // sell
						if( basis_max > 0.505 )
							if( basis_minus <= 0.356975 )
								ret := 0.500000
							if( basis_minus > 0.356975 )
								ret := -0.250000
			if( senkou_span_b > 291.903 )
				if( senkou_span_a <= 294.414 )
					if( basis_max <= -0.486872 )
						if( basis_max <= -1.978 )
							ret := 1.000000 // buy
						if( basis_max > -1.978 )
							if( basis_max <= -1.89498 )
								ret := -1.000000 // sell
							if( basis_max > -1.89498 )
								ret := -0.376238
					if( basis_max > -0.486872 )
						if( senkou_span_a <= 291.531 )
							if( basis_minus <= -1.26168 )
								ret := -0.272727
							if( basis_minus > -1.26168 )
								ret := -0.941176 // sell
						if( senkou_span_a > 291.531 )
							if( senkou_span_b_displaced <= 294.658 )
								ret := 0.342657
							if( senkou_span_b_displaced > 294.658 )
								ret := 0.015528
				if( senkou_span_a > 294.414 )
					if( senkou_span_a_displaced <= 289.844 )
						if( tenkan_sen <= 297.372 )
							if( tenkan_sen <= 295.94 )
								ret := 1.000000 // buy
							if( tenkan_sen > 295.94 )
								ret := 0.625000
						if( tenkan_sen > 297.372 )
							if( tenkan_sen <= 297.855 )
								ret := -0.125000
							if( tenkan_sen > 297.855 )
								ret := 0.222222
					if( senkou_span_a_displaced > 289.844 )
						if( senkou_span_a <= 295.219 )
							if( chinkou_span <= 297.71 )
								ret := -0.444444
							if( chinkou_span > 297.71 )
								ret := 0.706897 // buy
						if( senkou_span_a > 295.219 )
							if( kinjun_sen <= 294.581 )
								ret := -0.272727
							if( kinjun_sen > 294.581 )
								ret := -0.814570 // sell
		if( kinjun_sen > 295.273 )
			if( chinkou_span <= 307.612 )
				if( senkou_span_a_displaced <= 316.357 )
					if( tenkan_sen <= 305.136 )
						if( tenkan_sen <= 295.446 )
							if( basis_minus <= -1.05746 )
								ret := 0.508475
							if( basis_minus > -1.05746 )
								ret := 0.110000
						if( tenkan_sen > 295.446 )
							if( senkou_span_b_displaced <= 310.452 )
								ret := -0.128342
							if( senkou_span_b_displaced > 310.452 )
								ret := 0.437158
					if( tenkan_sen > 305.136 )
						if( senkou_span_a_displaced <= 288.084 )
							if( kinjun_sen <= 299.491 )
								ret := 0.750000 // buy
							if( kinjun_sen > 299.491 )
								ret := 1.000000 // buy
						if( senkou_span_a_displaced > 288.084 )
							if( chinkou_span <= 301.375 )
								ret := -0.735795 // sell
							if( chinkou_span > 301.375 )
								ret := -0.401620
				if( senkou_span_a_displaced > 316.357 )
					if( basis_max <= 4.16564 )
						if( tenkan_sen <= 335.01 )
							if( kinjun_sen <= 312.573 )
								ret := -0.503817
							if( kinjun_sen > 312.573 )
								ret := -0.774419 // sell
						if( tenkan_sen > 335.01 )
							if( basis_max <= -0.685625 )
								ret := -0.527778
							if( basis_max > -0.685625 )
								ret := 1.000000 // buy
					if( basis_max > 4.16564 )
						if( senkou_span_a <= 310.656 )
							ret := -0.222222
						if( senkou_span_a > 310.656 )
							ret := 1.000000 // buy
			if( chinkou_span > 307.612 )
				if( kinjun_sen <= 306.05 )
					if( tenkan_sen <= 304.622 )
						if( basis_max <= -0.555007 )
							if( basis_minus <= 8.60583 )
								ret := 0.637681
							if( basis_minus > 8.60583 )
								ret := -0.375000
						if( basis_max > -0.555007 )
							if( kinjun_sen <= 304.609 )
								ret := 0.878676 // buy
							if( kinjun_sen > 304.609 )
								ret := 0.693878
					if( tenkan_sen > 304.622 )
						if( basis_max <= -2.49128 )
							if( senkou_span_a <= 302.454 )
								ret := 0.000000
							if( senkou_span_a > 302.454 )
								ret := -0.857143 // sell
						if( basis_max > -2.49128 )
							if( chinkou_span <= 308.804 )
								ret := 0.000000
							if( chinkou_span > 308.804 )
								ret := 0.551495
				if( kinjun_sen > 306.05 )
					if( tenkan_sen <= 310.087 )
						if( tenkan_sen <= 307.471 )
							if( chinkou_span <= 308.28 )
								ret := -0.461538
							if( chinkou_span > 308.28 )
								ret := 0.684982
						if( tenkan_sen > 307.471 )
							if( senkou_span_b <= 313.68 )
								ret := 0.290698
							if( senkou_span_b > 313.68 )
								ret := -0.375000
					if( tenkan_sen > 310.087 )
						if( basis_max <= 0.027116 )
							if( senkou_span_a_displaced <= 348.301 )
								ret := 0.024898
							if( senkou_span_a_displaced > 348.301 )
								ret := -0.050973
						if( basis_max > 0.027116 )
							if( basis_minus <= 10.7646 )
								ret := 0.023454
							if( basis_minus > 10.7646 )
								ret := -0.668750
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_NFLX_15Min_df0e57c8(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)

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


