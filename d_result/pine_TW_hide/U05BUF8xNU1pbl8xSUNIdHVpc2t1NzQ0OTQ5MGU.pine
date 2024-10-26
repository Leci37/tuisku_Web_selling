//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: SNAP_15Min_1ICH_7449490e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNAP_15Min_1ICH_7449490e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNAP_15Min_7449490e(tenkan_sen, basis_minus, cross_up_tenkan_kinjunInt, senkou_span_a, cross_dn_tenkan_kinjunInt, senkou_span_b, chinkou_span, senkou_span_a_displaced, senkou_span_b_displaced, kinjun_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( basis_max <= 1.2e-05 )
		if( basis_minus <= 0.141558 )
			if( senkou_span_a_displaced <= 10.8885 )
				if( chinkou_span <= 10.9502 )
					if( senkou_span_b <= 10.3941 )
						if( chinkou_span <= 10.4807 )
							if( senkou_span_a <= 10.1253 )
								ret := 0.053326
							if( senkou_span_a > 10.1253 )
								ret := -0.186528
						if( chinkou_span > 10.4807 )
							if( tenkan_sen <= 10.3922 )
								ret := 0.637708
							if( tenkan_sen > 10.3922 )
								ret := 0.335443
					if( senkou_span_b > 10.3941 )
						if( chinkou_span <= 10.4886 )
							if( tenkan_sen <= 9.85 )
								ret := 1.000000 // buy
							if( tenkan_sen > 9.85 )
								ret := -0.491713
						if( chinkou_span > 10.4886 )
							if( tenkan_sen <= 10.6624 )
								ret := 0.225552
							if( tenkan_sen > 10.6624 )
								ret := -0.131225
				if( chinkou_span > 10.9502 )
					if( senkou_span_b <= 10.9994 )
						if( basis_max <= -0.011682 )
							if( senkou_span_b_displaced <= 10.3326 )
								ret := 0.803738 // buy
							if( senkou_span_b_displaced > 10.3326 )
								ret := 0.213759
						if( basis_max > -0.011682 )
							if( senkou_span_b <= 10.9238 )
								ret := 0.685976
							if( senkou_span_b > 10.9238 )
								ret := 0.172414
					if( senkou_span_b > 10.9994 )
						if( chinkou_span <= 11.2 )
							if( senkou_span_b_displaced <= 10.5076 )
								ret := -1.000000 // sell
							if( senkou_span_b_displaced > 10.5076 )
								ret := -0.500000
						if( chinkou_span > 11.2 )
							if( basis_minus <= 0.056719 )
								ret := -1.000000 // sell
							if( basis_minus > 0.056719 )
								ret := 0.510638
			if( senkou_span_a_displaced > 10.8885 )
				if( kinjun_sen <= 10.844 )
					if( senkou_span_a_displaced <= 10.9355 )
						if( senkou_span_b_displaced <= 10.8692 )
							ret := 0.666667
						if( senkou_span_b_displaced > 10.8692 )
							if( basis_max <= -0.011788 )
								ret := 0.000000
							if( basis_max > -0.011788 )
								ret := -0.480000
					if( senkou_span_a_displaced > 10.9355 )
						if( senkou_span_a_displaced <= 10.9717 )
							if( senkou_span_b_displaced <= 10.983 )
								ret := -1.000000 // sell
							if( senkou_span_b_displaced > 10.983 )
								ret := -0.444444
						if( senkou_span_a_displaced > 10.9717 )
							if( kinjun_sen <= 10.7775 )
								ret := -0.453125
							if( kinjun_sen > 10.7775 )
								ret := -0.829787 // sell
				if( kinjun_sen > 10.844 )
					if( chinkou_span <= 11.2294 )
						if( tenkan_sen <= 11.1183 )
							if( chinkou_span <= 10.9371 )
								ret := -0.248062
							if( chinkou_span > 10.9371 )
								ret := 0.195171
						if( tenkan_sen > 11.1183 )
							if( basis_max <= -0.001172 )
								ret := -0.364537
							if( basis_max > -0.001172 )
								ret := -0.640000
					if( chinkou_span > 11.2294 )
						if( tenkan_sen <= 11.5003 )
							if( senkou_span_b <= 11.1158 )
								ret := 0.664706
							if( senkou_span_b > 11.1158 )
								ret := 0.313582
						if( tenkan_sen > 11.5003 )
							if( chinkou_span <= 12.085 )
								ret := -0.249455
							if( chinkou_span > 12.085 )
								ret := 0.002782
		if( basis_minus > 0.141558 )
			if( senkou_span_b <= 74.872 )
				if( chinkou_span <= 75.4375 )
					if( senkou_span_b <= 63.0525 )
						if( chinkou_span <= 62.0056 )
							if( tenkan_sen <= 60.6639 )
								ret := 0.065506
							if( tenkan_sen > 60.6639 )
								ret := -0.396364
						if( chinkou_span > 62.0056 )
							if( senkou_span_a <= 60.3343 )
								ret := 0.885965 // buy
							if( senkou_span_a > 60.3343 )
								ret := 0.232772
					if( senkou_span_b > 63.0525 )
						if( chinkou_span <= 63.3092 )
							if( senkou_span_b <= 63.1235 )
								ret := -0.266667
							if( senkou_span_b > 63.1235 )
								ret := -0.872340 // sell
						if( chinkou_span > 63.3092 )
							if( senkou_span_b_displaced <= 63.4938 )
								ret := 0.370166
							if( senkou_span_b_displaced > 63.4938 )
								ret := -0.122120
				if( chinkou_span > 75.4375 )
					if( senkou_span_a <= 74.1819 )
						if( senkou_span_a <= 72.1198 )
							if( tenkan_sen <= 73.2075 )
								ret := 0.571429
							if( tenkan_sen > 73.2075 )
								ret := -0.125000
						if( senkou_span_a > 72.1198 )
							if( senkou_span_a_displaced <= 73.1399 )
								ret := 0.870000 // buy
							if( senkou_span_a_displaced > 73.1399 )
								ret := 0.578947
					if( senkou_span_a > 74.1819 )
						if( basis_minus <= 0.657447 )
							if( senkou_span_b_displaced <= 74.4305 )
								ret := 0.742268 // buy
							if( senkou_span_b_displaced > 74.4305 )
								ret := 0.041667
						if( basis_minus > 0.657447 )
							if( senkou_span_a_displaced <= 70.75 )
								ret := -1.000000 // sell
							if( senkou_span_a_displaced > 70.75 )
								ret := 0.185714
			if( senkou_span_b > 74.872 )
				if( kinjun_sen <= 75.2825 )
					if( senkou_span_b_displaced <= 74.4934 )
						ret := 0.000000
					if( senkou_span_b_displaced > 74.4934 )
						if( basis_max <= -0.111315 )
							if( basis_max <= -0.201874 )
								ret := -0.857143 // sell
							if( basis_max > -0.201874 )
								ret := -1.000000 // sell
						if( basis_max > -0.111315 )
							if( tenkan_sen <= 75.2775 )
								ret := -1.000000 // sell
							if( tenkan_sen > 75.2775 )
								ret := -0.277778
				if( kinjun_sen > 75.2825 )
					if( kinjun_sen <= 75.4907 )
						if( tenkan_sen <= 76.0277 )
							if( tenkan_sen <= 75.6606 )
								ret := 0.476190
							if( tenkan_sen > 75.6606 )
								ret := 0.923077 // buy
						if( tenkan_sen > 76.0277 )
							ret := -0.142857
					if( kinjun_sen > 75.4907 )
						if( chinkou_span <= 77.645 )
							if( senkou_span_a_displaced <= 75.1298 )
								ret := -0.173333
							if( senkou_span_a_displaced > 75.1298 )
								ret := -0.528796
						if( chinkou_span > 77.645 )
							if( chinkou_span <= 79.855 )
								ret := 0.141667
							if( chinkou_span > 79.855 )
								ret := -0.369565
	if( basis_max > 1.2e-05 )
		if( basis_minus <= -0.484965 )
			if( basis_minus <= -2.33096 )
				if( basis_max <= 0.731587 )
					if( senkou_span_a_displaced <= 62.1975 )
						if( basis_max <= 0.105751 )
							if( basis_minus <= -3.07516 )
								ret := -0.777778 // sell
							if( basis_minus > -3.07516 )
								ret := 0.071429
						if( basis_max > 0.105751 )
							if( basis_max <= 0.27375 )
								ret := -0.936842 // sell
							if( basis_max > 0.27375 )
								ret := -0.500000
					if( senkou_span_a_displaced > 62.1975 )
						if( senkou_span_b_displaced <= 67.4015 )
							ret := 0.800000 // buy
						if( senkou_span_b_displaced > 67.4015 )
							if( senkou_span_a_displaced <= 66.6576 )
								ret := -0.666667
							if( senkou_span_a_displaced > 66.6576 )
								ret := 0.200000
				if( basis_max > 0.731587 )
					if( tenkan_sen <= 26.52 )
						ret := -0.571429
					if( tenkan_sen > 26.52 )
						if( kinjun_sen <= 64.3252 )
							if( senkou_span_a_displaced <= 75.061 )
								ret := 0.885714 // buy
							if( senkou_span_a_displaced > 75.061 )
								ret := 0.285714
						if( kinjun_sen > 64.3252 )
							ret := -0.142857
			if( basis_minus > -2.33096 )
				if( basis_minus <= -0.72981 )
					if( basis_max <= 0.040423 )
						if( chinkou_span <= 8.51386 )
							ret := 0.875000 // buy
						if( chinkou_span > 8.51386 )
							if( chinkou_span <= 28.1827 )
								ret := -0.476562
							if( chinkou_span > 28.1827 )
								ret := -0.102941
					if( basis_max > 0.040423 )
						if( senkou_span_b_displaced <= 9.96119 )
							if( basis_max <= 0.084663 )
								ret := 0.714286 // buy
							if( basis_max > 0.084663 )
								ret := 0.954545 // buy
						if( senkou_span_b_displaced > 9.96119 )
							if( kinjun_sen <= 78.36 )
								ret := 0.097561
							if( kinjun_sen > 78.36 )
								ret := -0.500000
				if( basis_minus > -0.72981 )
					if( senkou_span_a_displaced <= 13.297 )
						if( basis_max <= 0.01875 )
							if( chinkou_span <= 9.20193 )
								ret := 0.700000 // buy
							if( chinkou_span > 9.20193 )
								ret := 0.125000
						if( basis_max > 0.01875 )
							if( basis_minus <= -0.678562 )
								ret := 0.277778
							if( basis_minus > -0.678562 )
								ret := -0.623656
					if( senkou_span_a_displaced > 13.297 )
						if( senkou_span_a_displaced <= 22.9983 )
							if( kinjun_sen <= 22.1474 )
								ret := 0.115016
							if( kinjun_sen > 22.1474 )
								ret := 0.933333 // buy
						if( senkou_span_a_displaced > 22.9983 )
							if( senkou_span_b <= 22.9308 )
								ret := -0.871795 // sell
							if( senkou_span_b > 22.9308 )
								ret := -0.063425
		if( basis_minus > -0.484965 )
			if( chinkou_span <= 9.19812 )
				if( tenkan_sen <= 9.15256 )
					if( chinkou_span <= 8.93012 )
						if( senkou_span_a <= 8.86809 )
							if( chinkou_span <= 8.6299 )
								ret := 0.022727
							if( chinkou_span > 8.6299 )
								ret := 0.324000
						if( senkou_span_a > 8.86809 )
							if( chinkou_span <= 8.79978 )
								ret := -0.626866
							if( chinkou_span > 8.79978 )
								ret := -0.120419
					if( chinkou_span > 8.93012 )
						if( senkou_span_b <= 9.02634 )
							if( senkou_span_a_displaced <= 8.4575 )
								ret := -0.272727
							if( senkou_span_a_displaced > 8.4575 )
								ret := 0.605128
						if( senkou_span_b > 9.02634 )
							if( senkou_span_a <= 9.19825 )
								ret := 0.117647
							if( senkou_span_a > 9.19825 )
								ret := 0.894737 // buy
				if( tenkan_sen > 9.15256 )
					if( chinkou_span <= 8.7 )
						if( basis_max <= 0.0425 )
							if( senkou_span_b <= 10.5312 )
								ret := 1.000000 // buy
							if( senkou_span_b > 10.5312 )
								ret := 0.857143 // buy
						if( basis_max > 0.0425 )
							if( senkou_span_a <= 10.8806 )
								ret := -0.571429
							if( senkou_span_a > 10.8806 )
								ret := -1.000000 // sell
					if( chinkou_span > 8.7 )
						if( senkou_span_a <= 9.28875 )
							if( chinkou_span <= 9.07844 )
								ret := -0.603175
							if( chinkou_span > 9.07844 )
								ret := 0.031579
						if( senkou_span_a > 9.28875 )
							if( senkou_span_b_displaced <= 9.3125 )
								ret := -0.285714
							if( senkou_span_b_displaced > 9.3125 )
								ret := -0.684426
			if( chinkou_span > 9.19812 )
				if( tenkan_sen <= 9.40037 )
					if( chinkou_span <= 9.38758 )
						if( senkou_span_a <= 9.19497 )
							if( senkou_span_b <= 9.29475 )
								ret := 0.670391
							if( senkou_span_b > 9.29475 )
								ret := 0.045455
						if( senkou_span_a > 9.19497 )
							if( basis_minus <= 0.07483 )
								ret := 0.098726
							if( basis_minus > 0.07483 )
								ret := -0.708333 // sell
					if( chinkou_span > 9.38758 )
						if( tenkan_sen <= 9.33996 )
							if( chinkou_span <= 10.9389 )
								ret := 0.729592 // buy
							if( chinkou_span > 10.9389 )
								ret := -0.428571
						if( tenkan_sen > 9.33996 )
							if( senkou_span_a_displaced <= 9.46676 )
								ret := 0.205607
							if( senkou_span_a_displaced > 9.46676 )
								ret := 0.666667
				if( tenkan_sen > 9.40037 )
					if( chinkou_span <= 9.47005 )
						if( senkou_span_a_displaced <= 10.1574 )
							if( senkou_span_b_displaced <= 10.0975 )
								ret := -0.236769
							if( senkou_span_b_displaced > 10.0975 )
								ret := 0.531250
						if( senkou_span_a_displaced > 10.1574 )
							if( senkou_span_b <= 10.2831 )
								ret := -0.975610 // sell
							if( senkou_span_b > 10.2831 )
								ret := -0.304348
					if( chinkou_span > 9.47005 )
						if( senkou_span_b_displaced <= 9.70783 )
							if( basis_max <= 0.012565 )
								ret := 0.530675
							if( basis_max > 0.012565 )
								ret := 0.122066
						if( senkou_span_b_displaced > 9.70783 )
							if( chinkou_span <= 9.84005 )
								ret := -0.140329
							if( chinkou_span > 9.84005 )
								ret := 0.099594
	
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
float op_operation = decision_tree_0_SNAP_15Min_7449490e(tenkan_sen, basis_minus, cross_up_tenkan_kinjunInt, senkou_span_a, cross_dn_tenkan_kinjunInt, senkou_span_b, chinkou_span, senkou_span_a_displaced, senkou_span_b_displaced, kinjun_sen, basis_max)

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


