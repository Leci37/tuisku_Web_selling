//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: ETHUSDT_30Min_1ICH_6ae01fea Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETHUSDT_30Min_1ICH_6ae01fea", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETHUSDT_30Min_6ae01fea(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( senkou_span_a <= 4210.08 )
		if( kinjun_sen <= 333.855 )
			if( basis_max <= 1.1253 )
				if( basis_minus <= -3.05125 )
					ret := 1.000000 // buy
				if( basis_minus > -3.05125 )
					if( senkou_span_a <= 331.01 )
						if( chinkou_span <= 348.305 )
							ret := 0.250000
						if( chinkou_span > 348.305 )
							ret := 0.750000 // buy
					if( senkou_span_a > 331.01 )
						ret := 1.000000 // buy
			if( basis_max > 1.1253 )
				if( basis_minus <= -4.76214 )
					ret := 1.000000 // buy
				if( basis_minus > -4.76214 )
					if( senkou_span_a_displaced <= 338.596 )
						ret := 0.500000
					if( senkou_span_a_displaced > 338.596 )
						ret := 0.000000
		if( kinjun_sen > 333.855 )
			if( basis_minus <= 198.738 )
				if( chinkou_span <= 4084.12 )
					if( senkou_span_b <= 3893.48 )
						if( chinkou_span <= 3545.91 )
							if( kinjun_sen <= 3468.84 )
								if( chinkou_span <= 3223.68 )
									ret := 0.039517
								if( chinkou_span > 3223.68 )
									ret := 0.211636
							if( kinjun_sen > 3468.84 )
								if( tenkan_sen <= 3516.39 )
									ret := -0.142857
								if( tenkan_sen > 3516.39 )
									ret := -0.475917
						if( chinkou_span > 3545.91 )
							if( tenkan_sen <= 3572.11 )
								if( tenkan_sen <= 3455.66 )
									ret := 0.762931 // buy
								if( tenkan_sen > 3455.66 )
									ret := 0.412104
							if( tenkan_sen > 3572.11 )
								if( chinkou_span <= 3968.28 )
									ret := 0.062571
								if( chinkou_span > 3968.28 )
									ret := 0.524345
					if( senkou_span_b > 3893.48 )
						if( senkou_span_a <= 4172.81 )
							if( chinkou_span <= 3924.88 )
								if( senkou_span_a <= 3868.51 )
									ret := 0.008000
								if( senkou_span_a > 3868.51 )
									ret := -0.478964
							if( chinkou_span > 3924.88 )
								if( kinjun_sen <= 4070.13 )
									ret := 0.074468
								if( kinjun_sen > 4070.13 )
									ret := -0.311728
						if( senkou_span_a > 4172.81 )
							if( kinjun_sen <= 4195.14 )
								if( senkou_span_a <= 4193.35 )
									ret := 1.000000 // buy
								if( senkou_span_a > 4193.35 )
									ret := 0.714286 // buy
							if( kinjun_sen > 4195.14 )
								if( senkou_span_b_displaced <= 4339.89 )
									ret := -0.285714
								if( senkou_span_b_displaced > 4339.89 )
									ret := 0.857143 // buy
				if( chinkou_span > 4084.12 )
					if( kinjun_sen <= 4090.34 )
						if( chinkou_span <= 4203.27 )
							if( basis_max <= 2.945 )
								if( tenkan_sen <= 3958.68 )
									ret := 0.775862 // buy
								if( tenkan_sen > 3958.68 )
									ret := 0.390558
							if( basis_max > 2.945 )
								if( basis_max <= 6.6355 )
									ret := -0.264706
								if( basis_max > 6.6355 )
									ret := 0.277778
						if( chinkou_span > 4203.27 )
							if( tenkan_sen <= 4070.82 )
								if( senkou_span_b <= 4125.76 )
									ret := 0.919355 // buy
								if( senkou_span_b > 4125.76 )
									ret := 0.000000
							if( tenkan_sen > 4070.82 )
								if( tenkan_sen <= 4090.93 )
									ret := 0.240000
								if( tenkan_sen > 4090.93 )
									ret := 0.810127 // buy
					if( kinjun_sen > 4090.34 )
						if( chinkou_span <= 4204.14 )
							if( senkou_span_a_displaced <= 4167.85 )
								if( senkou_span_b_displaced <= 3869.18 )
									ret := 1.000000 // buy
								if( senkou_span_b_displaced > 3869.18 )
									ret := -0.414414
							if( senkou_span_a_displaced > 4167.85 )
								if( senkou_span_a <= 4119.29 )
									ret := -0.142857
								if( senkou_span_a > 4119.29 )
									ret := 0.546667
						if( chinkou_span > 4204.14 )
							if( senkou_span_b_displaced <= 4271.14 )
								if( senkou_span_a <= 4113.77 )
									ret := 0.000000
								if( senkou_span_a > 4113.77 )
									ret := 0.776119 // buy
							if( senkou_span_b_displaced > 4271.14 )
								if( chinkou_span <= 4304.58 )
									ret := 0.315789
								if( chinkou_span > 4304.58 )
									ret := -0.714286 // sell
			if( basis_minus > 198.738 )
				if( tenkan_sen <= 2777.65 )
					if( chinkou_span <= 2565.59 )
						ret := 0.500000
					if( chinkou_span > 2565.59 )
						if( basis_max <= 4.77137 )
							if( basis_minus <= 239.603 )
								if( senkou_span_a_displaced <= 2041.27 )
									ret := 0.900000 // buy
								if( senkou_span_a_displaced > 2041.27 )
									ret := 1.000000 // buy
							if( basis_minus > 239.603 )
								ret := 0.750000 // buy
						if( basis_max > 4.77137 )
							ret := 0.777778 // buy
				if( tenkan_sen > 2777.65 )
					if( basis_minus <= 277.196 )
						if( senkou_span_b_displaced <= 2481.06 )
							ret := -1.000000 // sell
						if( senkou_span_b_displaced > 2481.06 )
							if( senkou_span_b_displaced <= 4031.94 )
								if( senkou_span_a <= 3761.84 )
									ret := 0.847826 // buy
								if( senkou_span_a > 3761.84 )
									ret := -0.608696
							if( senkou_span_b_displaced > 4031.94 )
								if( basis_max <= -22.4763 )
									ret := 1.000000 // buy
								if( basis_max > -22.4763 )
									ret := 0.750000 // buy
					if( basis_minus > 277.196 )
						if( basis_max <= -21.14 )
							if( tenkan_sen <= 3792.66 )
								ret := -0.666667
							if( tenkan_sen > 3792.66 )
								ret := -1.000000 // sell
						if( basis_max > -21.14 )
							ret := 0.000000
	if( senkou_span_a > 4210.08 )
		if( kinjun_sen <= 4266.72 )
			if( chinkou_span <= 4269 )
				if( senkou_span_a_displaced <= 4371.72 )
					if( tenkan_sen <= 4230.71 )
						if( basis_minus <= 19.0175 )
							if( basis_minus <= -55.6606 )
								if( tenkan_sen <= 4226.77 )
									ret := -0.428571
								if( tenkan_sen > 4226.77 )
									ret := -1.000000 // sell
							if( basis_minus > -55.6606 )
								ret := -1.000000 // sell
						if( basis_minus > 19.0175 )
							if( chinkou_span <= 4159.4 )
								if( basis_max <= 5.50375 )
									ret := -1.000000 // sell
								if( basis_max > 5.50375 )
									ret := -0.166667
							if( chinkou_span > 4159.4 )
								ret := -0.142857
					if( tenkan_sen > 4230.71 )
						if( basis_minus <= 134.124 )
							if( senkou_span_a_displaced <= 4177.29 )
								if( senkou_span_b <= 4130.41 )
									ret := -0.666667
								if( senkou_span_b > 4130.41 )
									ret := 0.166667
							if( senkou_span_a_displaced > 4177.29 )
								if( senkou_span_a <= 4267.66 )
									ret := -1.000000 // sell
								if( senkou_span_a > 4267.66 )
									ret := -0.500000
						if( basis_minus > 134.124 )
							if( chinkou_span <= 4111.3 )
								ret := -1.000000 // sell
							if( chinkou_span > 4111.3 )
								ret := -0.250000
				if( senkou_span_a_displaced > 4371.72 )
					if( basis_max <= -22.2347 )
						if( senkou_span_b <= 4377.73 )
							ret := -0.750000 // sell
						if( senkou_span_b > 4377.73 )
							ret := -0.800000 // sell
					if( basis_max > -22.2347 )
						if( basis_minus <= -60.6182 )
							if( kinjun_sen <= 4236.43 )
								ret := 0.666667
							if( kinjun_sen > 4236.43 )
								if( senkou_span_a <= 4220.16 )
									ret := -0.250000
								if( senkou_span_a > 4220.16 )
									ret := 0.000000
						if( basis_minus > -60.6182 )
							ret := 0.800000 // buy
			if( chinkou_span > 4269 )
				if( senkou_span_a <= 4264.34 )
					if( tenkan_sen <= 4257.77 )
						if( basis_max <= 3.135 )
							if( chinkou_span <= 4312.59 )
								if( tenkan_sen <= 4235.45 )
									ret := 0.750000 // buy
								if( tenkan_sen > 4235.45 )
									ret := 0.000000
							if( chinkou_span > 4312.59 )
								if( senkou_span_b <= 4255.17 )
									ret := 0.750000 // buy
								if( senkou_span_b > 4255.17 )
									ret := 1.000000 // buy
						if( basis_max > 3.135 )
							if( chinkou_span <= 4294.55 )
								ret := -0.166667
							if( chinkou_span > 4294.55 )
								if( basis_minus <= -32.2687 )
									ret := 0.000000
								if( basis_minus > -32.2687 )
									ret := 0.600000
					if( tenkan_sen > 4257.77 )
						if( senkou_span_a_displaced <= 4046.96 )
							ret := 0.666667
						if( senkou_span_a_displaced > 4046.96 )
							if( senkou_span_b_displaced <= 4101.96 )
								if( kinjun_sen <= 4185.75 )
									ret := -0.090909
								if( kinjun_sen > 4185.75 )
									ret := -0.600000
							if( senkou_span_b_displaced > 4101.96 )
								if( senkou_span_b_displaced <= 4210.67 )
									ret := 0.500000
								if( senkou_span_b_displaced > 4210.67 )
									ret := -0.100000
				if( senkou_span_a > 4264.34 )
					if( senkou_span_b <= 4265.15 )
						if( basis_minus <= 137.121 )
							if( tenkan_sen <= 4335.74 )
								if( senkou_span_b_displaced <= 4100.33 )
									ret := -1.000000 // sell
								if( senkou_span_b_displaced > 4100.33 )
									ret := -0.300000
							if( tenkan_sen > 4335.74 )
								if( basis_minus <= 88.8782 )
									ret := -0.666667
								if( basis_minus > 88.8782 )
									ret := 0.000000
						if( basis_minus > 137.121 )
							ret := 0.166667
					if( senkou_span_b > 4265.15 )
						if( chinkou_span <= 4363.9 )
							ret := -1.000000 // sell
						if( chinkou_span > 4363.9 )
							ret := -0.600000
		if( kinjun_sen > 4266.72 )
			if( senkou_span_b_displaced <= 4285.92 )
				if( chinkou_span <= 4380.54 )
					if( basis_max <= -0.419992 )
						if( kinjun_sen <= 4293.22 )
							if( chinkou_span <= 4326.18 )
								if( senkou_span_a_displaced <= 4082.65 )
									ret := 0.800000 // buy
								if( senkou_span_a_displaced > 4082.65 )
									ret := -0.384615
							if( chinkou_span > 4326.18 )
								if( kinjun_sen <= 4288.48 )
									ret := 0.500000
								if( kinjun_sen > 4288.48 )
									ret := 1.000000 // buy
						if( kinjun_sen > 4293.22 )
							if( chinkou_span <= 4300.21 )
								if( senkou_span_a <= 4467 )
									ret := 0.266667
								if( senkou_span_a > 4467 )
									ret := -0.833333 // sell
							if( chinkou_span > 4300.21 )
								if( basis_max <= -11.1348 )
									ret := -0.071429
								if( basis_max > -11.1348 )
									ret := -0.822581 // sell
					if( basis_max > -0.419992 )
						if( senkou_span_b <= 4253.89 )
							if( senkou_span_a <= 4290.18 )
								if( chinkou_span <= 4260.57 )
									ret := 0.000000
								if( chinkou_span > 4260.57 )
									ret := 0.500000
							if( senkou_span_a > 4290.18 )
								if( senkou_span_a_displaced <= 4264.09 )
									ret := 0.000000
								if( senkou_span_a_displaced > 4264.09 )
									ret := -0.833333 // sell
						if( senkou_span_b > 4253.89 )
							if( kinjun_sen <= 4350.9 )
								if( basis_max <= 21.8563 )
									ret := 0.860465 // buy
								if( basis_max > 21.8563 )
									ret := 0.428571
							if( kinjun_sen > 4350.9 )
								if( senkou_span_b_displaced <= 4207.34 )
									ret := 0.000000
								if( senkou_span_b_displaced > 4207.34 )
									ret := -0.250000
				if( chinkou_span > 4380.54 )
					if( tenkan_sen <= 4451.07 )
						if( basis_max <= -15.5409 )
							if( kinjun_sen <= 4384.08 )
								if( basis_max <= -19.255 )
									ret := 0.000000
								if( basis_max > -19.255 )
									ret := 0.250000
							if( kinjun_sen > 4384.08 )
								ret := -0.333333
						if( basis_max > -15.5409 )
							if( chinkou_span <= 4497.56 )
								if( tenkan_sen <= 4339.13 )
									ret := 0.204545
								if( tenkan_sen > 4339.13 )
									ret := 0.692308
							if( chinkou_span > 4497.56 )
								if( senkou_span_b_displaced <= 4212.05 )
									ret := 0.285714
								if( senkou_span_b_displaced > 4212.05 )
									ret := 0.893333 // buy
					if( tenkan_sen > 4451.07 )
						if( basis_minus <= 44.3642 )
							if( basis_minus <= 39.4035 )
								ret := -0.200000
							if( basis_minus > 39.4035 )
								if( tenkan_sen <= 4462.18 )
									ret := -1.000000 // sell
								if( tenkan_sen > 4462.18 )
									ret := -0.750000 // sell
						if( basis_minus > 44.3642 )
							ret := 0.000000
			if( senkou_span_b_displaced > 4285.92 )
				if( senkou_span_b_displaced <= 4364.71 )
					if( chinkou_span <= 4391.11 )
						if( tenkan_sen <= 4217.71 )
							if( senkou_span_a_displaced <= 4341.63 )
								ret := 0.000000
							if( senkou_span_a_displaced > 4341.63 )
								ret := 0.750000 // buy
						if( tenkan_sen > 4217.71 )
							if( tenkan_sen <= 4429.96 )
								if( basis_max <= 13.6064 )
									ret := -0.443299
								if( basis_max > 13.6064 )
									ret := -0.773810 // sell
							if( tenkan_sen > 4429.96 )
								if( senkou_span_b_displaced <= 4327.07 )
									ret := -1.000000 // sell
								if( senkou_span_b_displaced > 4327.07 )
									ret := -0.800000 // sell
					if( chinkou_span > 4391.11 )
						if( senkou_span_b <= 4403.02 )
							if( senkou_span_a <= 4314.53 )
								ret := 1.000000 // buy
							if( senkou_span_a > 4314.53 )
								ret := 0.285714
						if( senkou_span_b > 4403.02 )
							ret := 1.000000 // buy
				if( senkou_span_b_displaced > 4364.71 )
					if( senkou_span_a <= 4737.74 )
						if( basis_max <= 41.3245 )
							if( senkou_span_b <= 4655.62 )
								if( tenkan_sen <= 4542.86 )
									ret := 0.166078
								if( tenkan_sen > 4542.86 )
									ret := -0.223958
							if( senkou_span_b > 4655.62 )
								if( tenkan_sen <= 4726.02 )
									ret := 0.250000
								if( tenkan_sen > 4726.02 )
									ret := 0.794872 // buy
						if( basis_max > 41.3245 )
							if( basis_minus <= -145.213 )
								if( senkou_span_a <= 4283.55 )
									ret := 1.000000 // buy
								if( senkou_span_a > 4283.55 )
									ret := 0.200000
							if( basis_minus > -145.213 )
								if( senkou_span_a <= 4333.24 )
									ret := -0.464286
								if( senkou_span_a > 4333.24 )
									ret := -0.904762 // sell
					if( senkou_span_a > 4737.74 )
						if( senkou_span_b <= 4705.48 )
							if( senkou_span_b <= 4689.38 )
								ret := 0.571429
							if( senkou_span_b > 4689.38 )
								if( senkou_span_a_displaced <= 4705.58 )
									ret := 0.000000
								if( senkou_span_a_displaced > 4705.58 )
									ret := 0.200000
						if( senkou_span_b > 4705.48 )
							if( chinkou_span <= 4687.5 )
								if( senkou_span_a_displaced <= 4741.03 )
									ret := -0.960784 // sell
								if( senkou_span_a_displaced > 4741.03 )
									ret := 0.000000
							if( chinkou_span > 4687.5 )
								if( senkou_span_a_displaced <= 4729.09 )
									ret := -0.733333 // sell
								if( senkou_span_a_displaced > 4729.09 )
									ret := -0.125000
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_ETHUSDT_30Min_6ae01fea(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)

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


