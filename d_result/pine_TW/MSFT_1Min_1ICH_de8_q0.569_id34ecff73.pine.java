//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: MSFT_1Min_1ICH_34ecff73 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_1Min_1ICH_34ecff73", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_1Min_34ecff73(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( basis_max <= 0.236464 )
		if( basis_minus <= 3.44971 )
			if( kinjun_sen <= 397.929 )
				if( chinkou_span <= 397.294 )
					if( senkou_span_a <= 396.689 )
						if( basis_minus <= 1.46957 )
							if( kinjun_sen <= 389.23 )
								if( tenkan_sen <= 386.22 )
									ret := -0.291667
								if( tenkan_sen > 386.22 )
									ret := 0.752212 // buy
							if( kinjun_sen > 389.23 )
								if( chinkou_span <= 389.953 )
									ret := -0.507692
								if( chinkou_span > 389.953 )
									ret := 0.155903
						if( basis_minus > 1.46957 )
							if( tenkan_sen <= 395.01 )
								if( kinjun_sen <= 392.525 )
									ret := -0.326531
								if( kinjun_sen > 392.525 )
									ret := -0.910256 // sell
							if( tenkan_sen > 395.01 )
								if( kinjun_sen <= 392.404 )
									ret := -0.500000
								if( kinjun_sen > 392.404 )
									ret := 0.740741 // buy
					if( senkou_span_a > 396.689 )
						if( senkou_span_b_displaced <= 397.588 )
							if( senkou_span_a_displaced <= 396.033 )
								if( chinkou_span <= 396.943 )
									ret := -0.200000
								if( chinkou_span > 396.943 )
									ret := 0.250000
							if( senkou_span_a_displaced > 396.033 )
								if( tenkan_sen <= 396.637 )
									ret := 0.000000
								if( tenkan_sen > 396.637 )
									ret := -0.791667 // sell
						if( senkou_span_b_displaced > 397.588 )
							if( tenkan_sen <= 397.635 )
								if( chinkou_span <= 391.837 )
									ret := -0.826087 // sell
								if( chinkou_span > 391.837 )
									ret := 0.041916
							if( tenkan_sen > 397.635 )
								if( senkou_span_b <= 397.978 )
									ret := -0.913043 // sell
								if( senkou_span_b > 397.978 )
									ret := -0.428571
				if( chinkou_span > 397.294 )
					if( basis_max <= 0.223471 )
						if( basis_minus <= 0.904649 )
							if( senkou_span_b_displaced <= 394.938 )
								if( basis_minus <= 0.3064 )
									ret := 0.632353
								if( basis_minus > 0.3064 )
									ret := -0.561644
							if( senkou_span_b_displaced > 394.938 )
								if( senkou_span_a <= 397.159 )
									ret := 0.642361
								if( senkou_span_a > 397.159 )
									ret := 0.308094
						if( basis_minus > 0.904649 )
							if( senkou_span_a <= 398.876 )
								if( senkou_span_b <= 396.305 )
									ret := 0.452830
								if( senkou_span_b > 396.305 )
									ret := 0.910959 // buy
							if( senkou_span_a > 398.876 )
								ret := -0.600000
					if( basis_max > 0.223471 )
						if( chinkou_span <= 398.395 )
							if( basis_max <= 0.229393 )
								ret := -1.000000 // sell
							if( basis_max > 0.229393 )
								ret := -0.500000
						if( chinkou_span > 398.395 )
							ret := 0.250000
			if( kinjun_sen > 397.929 )
				if( chinkou_span <= 398.522 )
					if( senkou_span_b_displaced <= 397.926 )
						if( senkou_span_a <= 398.29 )
							if( senkou_span_b_displaced <= 397.791 )
								if( senkou_span_a <= 398.27 )
									ret := 0.535714
								if( senkou_span_a > 398.27 )
									ret := 0.090909
							if( senkou_span_b_displaced > 397.791 )
								if( chinkou_span <= 397.751 )
									ret := 0.307692
								if( chinkou_span > 397.751 )
									ret := -0.428571
						if( senkou_span_a > 398.29 )
							if( senkou_span_a_displaced <= 398.566 )
								if( basis_max <= -0.391875 )
									ret := 0.500000
								if( basis_max > -0.391875 )
									ret := -0.593220
							if( senkou_span_a_displaced > 398.566 )
								if( senkou_span_a <= 400.746 )
									ret := 0.600000
								if( senkou_span_a > 400.746 )
									ret := -1.000000 // sell
					if( senkou_span_b_displaced > 397.926 )
						if( senkou_span_a <= 407.008 )
							if( chinkou_span <= 397.885 )
								if( tenkan_sen <= 397.646 )
									ret := 0.500000
								if( tenkan_sen > 397.646 )
									ret := -0.789617 // sell
							if( chinkou_span > 397.885 )
								if( senkou_span_a <= 399.898 )
									ret := -0.214286
								if( senkou_span_a > 399.898 )
									ret := -0.694118
						if( senkou_span_a > 407.008 )
							if( basis_minus <= 0.49325 )
								if( senkou_span_b <= 420.522 )
									ret := 0.100000
								if( senkou_span_b > 420.522 )
									ret := 1.000000 // buy
							if( basis_minus > 0.49325 )
								if( senkou_span_a_displaced <= 403.315 )
									ret := -0.625000
								if( senkou_span_a_displaced > 403.315 )
									ret := -1.000000 // sell
				if( chinkou_span > 398.522 )
					if( kinjun_sen <= 400.384 )
						if( chinkou_span <= 399.54 )
							if( kinjun_sen <= 398.847 )
								if( senkou_span_b <= 398.041 )
									ret := -0.033898
								if( senkou_span_b > 398.041 )
									ret := 0.446429
							if( kinjun_sen > 398.847 )
								if( tenkan_sen <= 400.249 )
									ret := -0.223404
								if( tenkan_sen > 400.249 )
									ret := 0.750000 // buy
						if( chinkou_span > 399.54 )
							if( senkou_span_b_displaced <= 399.129 )
								if( basis_minus <= 2.14827 )
									ret := 0.615776
								if( basis_minus > 2.14827 )
									ret := -0.750000 // sell
							if( senkou_span_b_displaced > 399.129 )
								if( basis_minus <= 0.207546 )
									ret := 0.525773
								if( basis_minus > 0.207546 )
									ret := -0.119497
					if( kinjun_sen > 400.384 )
						if( chinkou_span <= 402.189 )
							if( kinjun_sen <= 402.823 )
								if( senkou_span_a_displaced <= 399.964 )
									ret := -0.517241
								if( senkou_span_a_displaced > 399.964 )
									ret := -0.065634
							if( kinjun_sen > 402.823 )
								if( tenkan_sen <= 405.68 )
									ret := -0.686275
								if( tenkan_sen > 405.68 )
									ret := -0.054545
						if( chinkou_span > 402.189 )
							if( tenkan_sen <= 406.651 )
								if( chinkou_span <= 406.622 )
									ret := 0.126321
								if( chinkou_span > 406.622 )
									ret := 0.487889
							if( tenkan_sen > 406.651 )
								if( chinkou_span <= 407.75 )
									ret := -0.294266
								if( chinkou_span > 407.75 )
									ret := 0.041364
		if( basis_minus > 3.44971 )
			if( kinjun_sen <= 409.905 )
				if( basis_minus <= 4.53375 )
					if( senkou_span_a <= 404.895 )
						if( senkou_span_a <= 394.76 )
							ret := 0.500000
						if( senkou_span_a > 394.76 )
							if( basis_minus <= 3.66211 )
								ret := -0.833333 // sell
							if( basis_minus > 3.66211 )
								if( basis_max <= -0.24875 )
									ret := 0.400000
								if( basis_max > -0.24875 )
									ret := 0.000000
					if( senkou_span_a > 404.895 )
						if( kinjun_sen <= 406.987 )
							if( senkou_span_a <= 406.421 )
								if( senkou_span_b_displaced <= 398.257 )
									ret := -1.000000 // sell
								if( senkou_span_b_displaced > 398.257 )
									ret := -0.714286 // sell
							if( senkou_span_a > 406.421 )
								if( senkou_span_a_displaced <= 397.517 )
									ret := 0.000000
								if( senkou_span_a_displaced > 397.517 )
									ret := -1.000000 // sell
						if( kinjun_sen > 406.987 )
							if( kinjun_sen <= 408.567 )
								ret := 0.000000
							if( kinjun_sen > 408.567 )
								ret := -0.250000
				if( basis_minus > 4.53375 )
					if( senkou_span_a_displaced <= 406.005 )
						ret := 1.000000 // buy
					if( senkou_span_a_displaced > 406.005 )
						ret := 0.750000 // buy
			if( kinjun_sen > 409.905 )
				if( tenkan_sen <= 417.938 )
					if( basis_minus <= 6.20939 )
						if( senkou_span_a <= 416.743 )
							ret := 0.000000
						if( senkou_span_a > 416.743 )
							ret := 0.500000
					if( basis_minus > 6.20939 )
						if( basis_max <= 0.000248 )
							ret := -1.000000 // sell
						if( basis_max > 0.000248 )
							if( chinkou_span <= 414.275 )
								ret := -1.000000 // sell
							if( chinkou_span > 414.275 )
								if( chinkou_span <= 414.599 )
									ret := 0.500000
								if( chinkou_span > 414.599 )
									ret := -0.285714
				if( tenkan_sen > 417.938 )
					if( senkou_span_b_displaced <= 416.124 )
						if( basis_minus <= 5.23543 )
							ret := -1.000000 // sell
						if( basis_minus > 5.23543 )
							if( kinjun_sen <= 416.798 )
								ret := -0.250000
							if( kinjun_sen > 416.798 )
								ret := -1.000000 // sell
					if( senkou_span_b_displaced > 416.124 )
						if( chinkou_span <= 419.25 )
							ret := 0.000000
						if( chinkou_span > 419.25 )
							ret := -0.500000
	if( basis_max > 0.236464 )
		if( tenkan_sen <= 453.207 )
			if( chinkou_span <= 452.387 )
				if( senkou_span_b <= 450.544 )
					if( tenkan_sen <= 409.672 )
						if( chinkou_span <= 407.69 )
							if( tenkan_sen <= 407.143 )
								if( senkou_span_a <= 405.964 )
									ret := 0.152498
								if( senkou_span_a > 405.964 )
									ret := 0.448753
							if( tenkan_sen > 407.143 )
								if( kinjun_sen <= 410.484 )
									ret := -0.331429
								if( kinjun_sen > 410.484 )
									ret := 0.500000
						if( chinkou_span > 407.69 )
							if( senkou_span_a <= 408.946 )
								if( senkou_span_a_displaced <= 408.114 )
									ret := 0.107143
								if( senkou_span_a_displaced > 408.114 )
									ret := 0.784861 // buy
							if( senkou_span_a > 408.946 )
								if( senkou_span_b <= 412.96 )
									ret := 0.374558
								if( senkou_span_b > 412.96 )
									ret := -0.571429
					if( tenkan_sen > 409.672 )
						if( chinkou_span <= 412.759 )
							if( basis_minus <= -0.9475 )
								if( tenkan_sen <= 412.428 )
									ret := 0.311475
								if( tenkan_sen > 412.428 )
									ret := -0.540984
							if( basis_minus > -0.9475 )
								if( senkou_span_a_displaced <= 409.918 )
									ret := 0.607143
								if( senkou_span_a_displaced > 409.918 )
									ret := -0.427039
						if( chinkou_span > 412.759 )
							if( senkou_span_a_displaced <= 414.309 )
								if( chinkou_span <= 413.038 )
									ret := 0.294118
								if( chinkou_span > 413.038 )
									ret := 0.733333 // buy
							if( senkou_span_a_displaced > 414.309 )
								if( chinkou_span <= 413.745 )
									ret := -0.224638
								if( chinkou_span > 413.745 )
									ret := 0.148977
				if( senkou_span_b > 450.544 )
					if( chinkou_span <= 449.199 )
						if( chinkou_span <= 448.206 )
							ret := -1.000000 // sell
						if( chinkou_span > 448.206 )
							if( senkou_span_a <= 449.096 )
								ret := -1.000000 // sell
							if( senkou_span_a > 449.096 )
								if( basis_minus <= -0.492751 )
									ret := -0.600000
								if( basis_minus > -0.492751 )
									ret := 0.250000
					if( chinkou_span > 449.199 )
						if( senkou_span_a <= 450.632 )
							if( senkou_span_a_displaced <= 451.264 )
								ret := 0.000000
							if( senkou_span_a_displaced > 451.264 )
								if( senkou_span_b_displaced <= 453.133 )
									ret := 1.000000 // buy
								if( senkou_span_b_displaced > 453.133 )
									ret := 0.000000
						if( senkou_span_a > 450.632 )
							if( senkou_span_a_displaced <= 450.535 )
								ret := -1.000000 // sell
							if( senkou_span_a_displaced > 450.535 )
								if( senkou_span_a_displaced <= 453.972 )
									ret := -0.153846
								if( senkou_span_a_displaced > 453.972 )
									ret := -0.571429
			if( chinkou_span > 452.387 )
				if( senkou_span_a_displaced <= 453.961 )
					if( chinkou_span <= 453.916 )
						if( tenkan_sen <= 452.563 )
							ret := 0.000000
						if( tenkan_sen > 452.563 )
							if( tenkan_sen <= 452.975 )
								ret := 0.750000 // buy
							if( tenkan_sen > 452.975 )
								ret := 0.000000
					if( chinkou_span > 453.916 )
						ret := -0.750000 // sell
				if( senkou_span_a_displaced > 453.961 )
					if( senkou_span_b_displaced <= 455.98 )
						if( basis_minus <= -0.929968 )
							if( chinkou_span <= 453.357 )
								ret := 0.000000
							if( chinkou_span > 453.357 )
								ret := 0.250000
						if( basis_minus > -0.929968 )
							if( senkou_span_b_displaced <= 454.92 )
								if( senkou_span_a_displaced <= 455.014 )
									ret := 0.688312
								if( senkou_span_a_displaced > 455.014 )
									ret := -0.200000
							if( senkou_span_b_displaced > 454.92 )
								if( senkou_span_a_displaced <= 454.663 )
									ret := 0.500000
								if( senkou_span_a_displaced > 454.663 )
									ret := 0.972222 // buy
					if( senkou_span_b_displaced > 455.98 )
						if( senkou_span_b_displaced <= 456.661 )
							ret := -0.428571
						if( senkou_span_b_displaced > 456.661 )
							ret := 0.500000
		if( tenkan_sen > 453.207 )
			if( basis_max <= 0.360291 )
				if( chinkou_span <= 453.86 )
					if( senkou_span_a_displaced <= 454.24 )
						ret := 0.600000
					if( senkou_span_a_displaced > 454.24 )
						if( chinkou_span <= 452.189 )
							ret := 0.800000 // buy
						if( chinkou_span > 452.189 )
							if( senkou_span_b <= 454.069 )
								if( chinkou_span <= 453.73 )
									ret := 0.000000
								if( chinkou_span > 453.73 )
									ret := -0.250000
							if( senkou_span_b > 454.069 )
								if( senkou_span_a_displaced <= 456.48 )
									ret := -0.805556 // sell
								if( senkou_span_a_displaced > 456.48 )
									ret := 0.000000
				if( chinkou_span > 453.86 )
					if( chinkou_span <= 457.285 )
						if( senkou_span_a_displaced <= 457.123 )
							if( basis_max <= 0.271901 )
								if( senkou_span_b_displaced <= 455.452 )
									ret := 0.800000 // buy
								if( senkou_span_b_displaced > 455.452 )
									ret := 0.000000
							if( basis_max > 0.271901 )
								if( kinjun_sen <= 456.067 )
									ret := 0.125000
								if( kinjun_sen > 456.067 )
									ret := 0.750000 // buy
						if( senkou_span_a_displaced > 457.123 )
							ret := 1.000000 // buy
					if( chinkou_span > 457.285 )
						if( chinkou_span <= 458.568 )
							if( basis_max <= 0.2605 )
								ret := -0.500000
							if( basis_max > 0.2605 )
								ret := -1.000000 // sell
						if( chinkou_span > 458.568 )
							if( basis_minus <= -0.551656 )
								if( tenkan_sen <= 463.335 )
									ret := 0.090909
								if( tenkan_sen > 463.335 )
									ret := 0.684211
							if( basis_minus > -0.551656 )
								if( senkou_span_b_displaced <= 467.365 )
									ret := -0.042254
								if( senkou_span_b_displaced > 467.365 )
									ret := -1.000000 // sell
			if( basis_max > 0.360291 )
				if( chinkou_span <= 460.702 )
					if( basis_max <= 0.660633 )
						if( kinjun_sen <= 454.371 )
							ret := 0.285714
						if( kinjun_sen > 454.371 )
							if( basis_minus <= -0.25875 )
								if( basis_minus <= -1.06125 )
									ret := -0.945946 // sell
								if( basis_minus > -1.06125 )
									ret := -0.764706 // sell
							if( basis_minus > -0.25875 )
								ret := 0.000000
					if( basis_max > 0.660633 )
						if( tenkan_sen <= 456.393 )
							if( basis_minus <= -2.55868 )
								ret := -0.500000
							if( basis_minus > -2.55868 )
								ret := -0.833333 // sell
						if( tenkan_sen > 456.393 )
							if( basis_minus <= -2.17188 )
								if( senkou_span_b <= 459.863 )
									ret := 0.000000
								if( senkou_span_b > 459.863 )
									ret := 1.000000 // buy
							if( basis_minus > -2.17188 )
								if( basis_max <= 0.784189 )
									ret := 0.250000
								if( basis_max > 0.784189 )
									ret := -0.500000
				if( chinkou_span > 460.702 )
					if( senkou_span_a_displaced <= 466.497 )
						if( chinkou_span <= 464.837 )
							ret := 0.400000
						if( chinkou_span > 464.837 )
							ret := 0.750000 // buy
					if( senkou_span_a_displaced > 466.497 )
						ret := 0.000000
	
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
float op_operation = decision_tree_0_MSFT_1Min_34ecff73(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)

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


