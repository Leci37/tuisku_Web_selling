//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: SHOP_1Min_1ICH_333c695d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SHOP_1Min_1ICH_333c695d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SHOP_1Min_333c695d(tenkan_sen, basis_minus, cross_up_tenkan_kinjunInt, senkou_span_a, cross_dn_tenkan_kinjunInt, senkou_span_b, chinkou_span, senkou_span_a_displaced, senkou_span_b_displaced, kinjun_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( chinkou_span <= 63.2849 )
		if( senkou_span_b_displaced <= 62.4573 )
			if( senkou_span_b <= 53.9541 )
				if( kinjun_sen <= 53.8413 )
					if( basis_minus <= 1.08813 )
						if( kinjun_sen <= 51.5815 )
							if( senkou_span_a <= 49.4832 )
								if( chinkou_span <= 49.4916 )
									ret := 0.209302
								if( chinkou_span > 49.4916 )
									ret := 0.891304 // buy
							if( senkou_span_a > 49.4832 )
								if( basis_max <= -0.146207 )
									ret := 0.364865
								if( basis_max > -0.146207 )
									ret := -0.536184
						if( kinjun_sen > 51.5815 )
							if( kinjun_sen <= 52.0384 )
								if( tenkan_sen <= 51.8583 )
									ret := 1.000000 // buy
								if( tenkan_sen > 51.8583 )
									ret := 0.709677 // buy
							if( kinjun_sen > 52.0384 )
								if( basis_max <= -0.117974 )
									ret := -0.565789
								if( basis_max > -0.117974 )
									ret := 0.141399
					if( basis_minus > 1.08813 )
						if( senkou_span_b_displaced <= 50.2638 )
							ret := 1.000000 // buy
						if( senkou_span_b_displaced > 50.2638 )
							if( basis_max <= 0.01204 )
								ret := 0.909091 // buy
							if( basis_max > 0.01204 )
								ret := 1.000000 // buy
				if( kinjun_sen > 53.8413 )
					if( basis_minus <= 0.227375 )
						if( kinjun_sen <= 53.9475 )
							if( basis_max <= -0.00599 )
								if( basis_max <= -0.022316 )
									ret := -0.692308
								if( basis_max > -0.022316 )
									ret := 0.000000
							if( basis_max > -0.00599 )
								if( basis_max <= -0.001097 )
									ret := 0.888889 // buy
								if( basis_max > -0.001097 )
									ret := 0.272727
						if( kinjun_sen > 53.9475 )
							if( tenkan_sen <= 53.9249 )
								ret := 0.700000 // buy
							if( tenkan_sen > 53.9249 )
								ret := 1.000000 // buy
					if( basis_minus > 0.227375 )
						if( senkou_span_b_displaced <= 53.0826 )
							if( basis_max <= -0.236333 )
								ret := 1.000000 // buy
							if( basis_max > -0.236333 )
								ret := 0.666667
						if( senkou_span_b_displaced > 53.0826 )
							ret := 1.000000 // buy
			if( senkou_span_b > 53.9541 )
				if( senkou_span_a_displaced <= 54.6063 )
					if( chinkou_span <= 54.575 )
						if( tenkan_sen <= 53.9858 )
							if( chinkou_span <= 53.7898 )
								if( senkou_span_a <= 53.2653 )
									ret := 0.700000 // buy
								if( senkou_span_a > 53.2653 )
									ret := -0.520000
							if( chinkou_span > 53.7898 )
								if( basis_minus <= -0.110607 )
									ret := 0.621951
								if( basis_minus > -0.110607 )
									ret := 0.062500
						if( tenkan_sen > 53.9858 )
							if( basis_minus <= -0.12827 )
								if( chinkou_span <= 54.083 )
									ret := 0.229508
								if( chinkou_span > 54.083 )
									ret := -0.925926 // sell
							if( basis_minus > -0.12827 )
								if( basis_max <= 0.062486 )
									ret := -0.758772 // sell
								if( basis_max > 0.062486 )
									ret := 0.692308
					if( chinkou_span > 54.575 )
						if( senkou_span_a <= 54.4687 )
							if( basis_minus <= 0.147195 )
								if( chinkou_span <= 54.7753 )
									ret := 0.947368 // buy
								if( chinkou_span > 54.7753 )
									ret := -0.083333
							if( basis_minus > 0.147195 )
								if( senkou_span_b <= 54.1531 )
									ret := -1.000000 // sell
								if( senkou_span_b > 54.1531 )
									ret := -0.428571
						if( senkou_span_a > 54.4687 )
							if( tenkan_sen <= 54.6425 )
								if( tenkan_sen <= 54.615 )
									ret := 0.454545
								if( tenkan_sen > 54.615 )
									ret := -0.636364
							if( tenkan_sen > 54.6425 )
								if( kinjun_sen <= 54.7409 )
									ret := 0.794118 // buy
								if( kinjun_sen > 54.7409 )
									ret := -0.294118
				if( senkou_span_a_displaced > 54.6063 )
					if( kinjun_sen <= 54.4036 )
						if( basis_max <= 0.25125 )
							if( basis_max <= 0.094107 )
								ret := 0.952381 // buy
							if( basis_max > 0.094107 )
								ret := 0.666667
						if( basis_max > 0.25125 )
							ret := 1.000000 // buy
					if( kinjun_sen > 54.4036 )
						if( senkou_span_b_displaced <= 54.04 )
							ret := 1.000000 // buy
						if( senkou_span_b_displaced > 54.04 )
							if( kinjun_sen <= 62.5658 )
								if( basis_minus <= -0.662002 )
									ret := 0.571429
								if( basis_minus > -0.662002 )
									ret := -0.019291
							if( kinjun_sen > 62.5658 )
								if( chinkou_span <= 62.8525 )
									ret := -0.707317 // sell
								if( chinkou_span > 62.8525 )
									ret := 0.404255
		if( senkou_span_b_displaced > 62.4573 )
			if( senkou_span_a <= 61.9513 )
				if( senkou_span_b_displaced <= 62.838 )
					if( basis_minus <= -0.30781 )
						ret := 0.933333 // buy
					if( basis_minus > -0.30781 )
						ret := 0.250000
				if( senkou_span_b_displaced > 62.838 )
					if( senkou_span_a <= 61.8951 )
						ret := 1.000000 // buy
					if( senkou_span_a > 61.8951 )
						ret := 0.875000 // buy
			if( senkou_span_a > 61.9513 )
				if( senkou_span_a_displaced <= 62.3248 )
					if( senkou_span_b <= 62.225 )
						if( senkou_span_b_displaced <= 62.6648 )
							if( chinkou_span <= 62.2805 )
								ret := -0.692308
							if( chinkou_span > 62.2805 )
								ret := -1.000000 // sell
						if( senkou_span_b_displaced > 62.6648 )
							ret := -0.416667
					if( senkou_span_b > 62.225 )
						if( chinkou_span <= 61.8027 )
							ret := -0.900000 // sell
						if( chinkou_span > 61.8027 )
							ret := -1.000000 // sell
				if( senkou_span_a_displaced > 62.3248 )
					if( basis_max <= -0.000421 )
						if( senkou_span_a <= 74.198 )
							if( senkou_span_a_displaced <= 63.3018 )
								if( tenkan_sen <= 62.9856 )
									ret := -0.488048
								if( tenkan_sen > 62.9856 )
									ret := 0.011719
							if( senkou_span_a_displaced > 63.3018 )
								if( senkou_span_b_displaced <= 63.245 )
									ret := 0.500000
								if( senkou_span_b_displaced > 63.245 )
									ret := -0.682432
						if( senkou_span_a > 74.198 )
							ret := 0.857143 // buy
					if( basis_max > -0.000421 )
						if( senkou_span_a <= 62.7337 )
							if( senkou_span_a <= 62.5498 )
								if( basis_max <= 0.072512 )
									ret := 0.099206
								if( basis_max > 0.072512 )
									ret := -0.600000
							if( senkou_span_a > 62.5498 )
								if( chinkou_span <= 62.535 )
									ret := -0.092593
								if( chinkou_span > 62.535 )
									ret := 0.607527
						if( senkou_span_a > 62.7337 )
							if( senkou_span_b <= 63.3209 )
								if( senkou_span_b_displaced <= 63.3916 )
									ret := -0.274662
								if( senkou_span_b_displaced > 63.3916 )
									ret := 0.116505
							if( senkou_span_b > 63.3209 )
								if( basis_max <= 0.0284 )
									ret := -0.085714
								if( basis_max > 0.0284 )
									ret := -0.507289
	if( chinkou_span > 63.2849 )
		if( senkou_span_a <= 63.271 )
			if( senkou_span_b <= 59.3968 )
				ret := 1.000000 // buy
			if( senkou_span_b > 59.3968 )
				if( basis_max <= -0.05725 )
					if( kinjun_sen <= 60.3275 )
						if( chinkou_span <= 63.7255 )
							if( basis_max <= -2.40153 )
								ret := -1.000000 // sell
							if( basis_max > -2.40153 )
								ret := -0.375000
						if( chinkou_span > 63.7255 )
							ret := -1.000000 // sell
					if( kinjun_sen > 60.3275 )
						if( basis_minus <= 0.236212 )
							if( tenkan_sen <= 63.2936 )
								ret := -0.300000
							if( tenkan_sen > 63.2936 )
								ret := -0.700000 // sell
						if( basis_minus > 0.236212 )
							if( senkou_span_a_displaced <= 57.854 )
								ret := 0.333333
							if( senkou_span_a_displaced > 57.854 )
								ret := 0.888889 // buy
				if( basis_max > -0.05725 )
					if( senkou_span_b <= 62.8091 )
						if( senkou_span_a_displaced <= 63.6911 )
							if( senkou_span_b_displaced <= 62.7344 )
								ret := -0.833333 // sell
							if( senkou_span_b_displaced > 62.7344 )
								if( tenkan_sen <= 62.7526 )
									ret := 0.562500
								if( tenkan_sen > 62.7526 )
									ret := -0.105263
						if( senkou_span_a_displaced > 63.6911 )
							ret := 0.923077 // buy
					if( senkou_span_b > 62.8091 )
						if( kinjun_sen <= 63.0793 )
							if( basis_minus <= -0.13945 )
								ret := 0.529412
							if( basis_minus > -0.13945 )
								if( chinkou_span <= 63.426 )
									ret := 0.913462 // buy
								if( chinkou_span > 63.426 )
									ret := 0.736111 // buy
						if( kinjun_sen > 63.0793 )
							if( kinjun_sen <= 63.1358 )
								if( basis_minus <= -0.132619 )
									ret := 0.777778 // buy
								if( basis_minus > -0.132619 )
									ret := -0.023810
							if( kinjun_sen > 63.1358 )
								if( basis_max <= -0.023566 )
									ret := 0.440000
								if( basis_max > -0.023566 )
									ret := 0.818750 // buy
		if( senkou_span_a > 63.271 )
			if( senkou_span_b <= 64.3845 )
				if( tenkan_sen <= 64.3562 )
					if( senkou_span_a_displaced <= 59.6725 )
						ret := -1.000000 // sell
					if( senkou_span_a_displaced > 59.6725 )
						if( senkou_span_b_displaced <= 59.433 )
							if( tenkan_sen <= 63.8125 )
								ret := 1.000000 // buy
							if( tenkan_sen > 63.8125 )
								ret := 0.750000 // buy
						if( senkou_span_b_displaced > 59.433 )
							if( kinjun_sen <= 64.4178 )
								if( basis_max <= -0.075043 )
									ret := -0.316794
								if( basis_max > -0.075043 )
									ret := 0.136174
							if( kinjun_sen > 64.4178 )
								ret := 1.000000 // buy
				if( tenkan_sen > 64.3562 )
					if( kinjun_sen <= 64.098 )
						ret := -1.000000 // sell
					if( kinjun_sen > 64.098 )
						if( senkou_span_a <= 64.5245 )
							if( chinkou_span <= 64.0975 )
								if( basis_minus <= 0.135868 )
									ret := -0.636364
								if( basis_minus > 0.135868 )
									ret := -1.000000 // sell
							if( chinkou_span > 64.0975 )
								if( basis_max <= -0.012796 )
									ret := 0.525597
								if( basis_max > -0.012796 )
									ret := -0.053333
						if( senkou_span_a > 64.5245 )
							if( chinkou_span <= 65.0155 )
								if( chinkou_span <= 64.875 )
									ret := 1.000000 // buy
								if( chinkou_span > 64.875 )
									ret := 0.833333 // buy
							if( chinkou_span > 65.0155 )
								if( basis_max <= -0.017789 )
									ret := -0.400000
								if( basis_max > -0.017789 )
									ret := 1.000000 // buy
			if( senkou_span_b > 64.3845 )
				if( chinkou_span <= 65.0198 )
					if( senkou_span_a <= 64.9964 )
						if( chinkou_span <= 64.4035 )
							if( basis_minus <= -0.073569 )
								if( chinkou_span <= 63.9098 )
									ret := -0.451613
								if( chinkou_span > 63.9098 )
									ret := -0.026829
							if( basis_minus > -0.073569 )
								if( senkou_span_a <= 64.3965 )
									ret := 0.162162
								if( senkou_span_a > 64.3965 )
									ret := -0.668750
						if( chinkou_span > 64.4035 )
							if( basis_max <= -0.115333 )
								if( tenkan_sen <= 65.111 )
									ret := -0.777778 // sell
								if( tenkan_sen > 65.111 )
									ret := -1.000000 // sell
							if( basis_max > -0.115333 )
								if( tenkan_sen <= 64.7231 )
									ret := 0.208999
								if( tenkan_sen > 64.7231 )
									ret := -0.066667
					if( senkou_span_a > 64.9964 )
						if( kinjun_sen <= 65.0315 )
							if( senkou_span_a <= 65.0091 )
								if( senkou_span_b_displaced <= 65.04 )
									ret := -0.133333
								if( senkou_span_b_displaced > 65.04 )
									ret := -0.764706 // sell
							if( senkou_span_a > 65.0091 )
								if( basis_minus <= 0.246875 )
									ret := -0.706422 // sell
								if( basis_minus > 0.246875 )
									ret := -0.929825 // sell
						if( kinjun_sen > 65.0315 )
							if( tenkan_sen <= 65.1208 )
								if( chinkou_span <= 64.0775 )
									ret := -0.849057 // sell
								if( chinkou_span > 64.0775 )
									ret := 0.008850
							if( tenkan_sen > 65.1208 )
								if( chinkou_span <= 63.9335 )
									ret := -0.900000 // sell
								if( chinkou_span > 63.9335 )
									ret := -0.522843
				if( chinkou_span > 65.0198 )
					if( senkou_span_a <= 65.5904 )
						if( senkou_span_a_displaced <= 64.3576 )
							if( senkou_span_b <= 64.7004 )
								ret := 0.222222
							if( senkou_span_b > 64.7004 )
								ret := -1.000000 // sell
						if( senkou_span_a_displaced > 64.3576 )
							if( basis_max <= -0.027844 )
								if( senkou_span_b_displaced <= 64.9917 )
									ret := 0.532692
								if( senkou_span_b_displaced > 64.9917 )
									ret := 0.285714
							if( basis_max > -0.027844 )
								if( chinkou_span <= 65.6533 )
									ret := 0.074454
								if( chinkou_span > 65.6533 )
									ret := 0.441065
					if( senkou_span_a > 65.5904 )
						if( basis_minus <= -0.597894 )
							if( senkou_span_b_displaced <= 69.3149 )
								if( senkou_span_a <= 66.625 )
									ret := -0.103448
								if( senkou_span_a > 66.625 )
									ret := 0.708333 // buy
							if( senkou_span_b_displaced > 69.3149 )
								if( senkou_span_b_displaced <= 73.7134 )
									ret := -0.707547 // sell
								if( senkou_span_b_displaced > 73.7134 )
									ret := -0.022222
						if( basis_minus > -0.597894 )
							if( chinkou_span <= 65.6048 )
								if( senkou_span_a <= 67.4042 )
									ret := -0.577558
								if( senkou_span_a > 67.4042 )
									ret := 0.888889 // buy
							if( chinkou_span > 65.6048 )
								if( senkou_span_b <= 66.3624 )
									ret := 0.138591
								if( senkou_span_b > 66.3624 )
									ret := 0.006285
	
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
float op_operation = decision_tree_0_SHOP_1Min_333c695d(tenkan_sen, basis_minus, cross_up_tenkan_kinjunInt, senkou_span_a, cross_dn_tenkan_kinjunInt, senkou_span_b, chinkou_span, senkou_span_a_displaced, senkou_span_b_displaced, kinjun_sen, basis_max)

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


