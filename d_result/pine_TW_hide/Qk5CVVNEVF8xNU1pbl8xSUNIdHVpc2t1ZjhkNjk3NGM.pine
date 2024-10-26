//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: BNBUSDT_15Min_1ICH_f8d6974c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BNBUSDT_15Min_1ICH_f8d6974c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BNBUSDT_15Min_f8d6974c(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( basis_max <= 0.250478 )
		if( chinkou_span <= 244.817 )
			if( senkou_span_a <= 242.514 )
				if( tenkan_sen <= 217.906 )
					if( basis_minus <= 5.96497 )
						if( basis_minus <= 3.13634 )
							if( chinkou_span <= 206.018 )
								if( senkou_span_b <= 207.353 )
									ret := -0.248062
								if( senkou_span_b > 207.353 )
									ret := -0.702128 // sell
							if( chinkou_span > 206.018 )
								if( kinjun_sen <= 206.058 )
									ret := 0.611511
								if( kinjun_sen > 206.058 )
									ret := 0.027091
						if( basis_minus > 3.13634 )
							if( basis_minus <= 4.9125 )
								if( senkou_span_b_displaced <= 209.669 )
									ret := -0.351351
								if( senkou_span_b_displaced > 209.669 )
									ret := -0.774194 // sell
							if( basis_minus > 4.9125 )
								ret := -1.000000 // sell
					if( basis_minus > 5.96497 )
						if( senkou_span_a_displaced <= 203.987 )
							if( chinkou_span <= 210.69 )
								ret := 0.300000
							if( chinkou_span > 210.69 )
								ret := 1.000000 // buy
						if( senkou_span_a_displaced > 203.987 )
							ret := 1.000000 // buy
				if( tenkan_sen > 217.906 )
					if( senkou_span_b_displaced <= 219.875 )
						if( kinjun_sen <= 218.125 )
							if( senkou_span_b <= 217.484 )
								if( senkou_span_a_displaced <= 216 )
									ret := 0.583815
								if( senkou_span_a_displaced > 216 )
									ret := -0.316667
							if( senkou_span_b > 217.484 )
								if( chinkou_span <= 225.8 )
									ret := -0.746479 // sell
								if( chinkou_span > 225.8 )
									ret := 1.000000 // buy
						if( kinjun_sen > 218.125 )
							if( senkou_span_b_displaced <= 209.372 )
								ret := 0.533333
							if( senkou_span_b_displaced > 209.372 )
								if( chinkou_span <= 227.034 )
									ret := -0.560274
								if( chinkou_span > 227.034 )
									ret := 0.370370
					if( senkou_span_b_displaced > 219.875 )
						if( senkou_span_a <= 230.777 )
							if( tenkan_sen <= 228.378 )
								if( basis_minus <= -2.70695 )
									ret := -0.477778
								if( basis_minus > -2.70695 )
									ret := -0.016589
							if( tenkan_sen > 228.378 )
								if( basis_max <= -1.0492 )
									ret := 0.621849
								if( basis_max > -1.0492 )
									ret := 0.087071
						if( senkou_span_a > 230.777 )
							if( chinkou_span <= 233.649 )
								if( tenkan_sen <= 232.051 )
									ret := -0.257908
								if( tenkan_sen > 232.051 )
									ret := -0.559486
							if( chinkou_span > 233.649 )
								if( senkou_span_b <= 237.473 )
									ret := 0.153444
								if( senkou_span_b > 237.473 )
									ret := -0.073812
			if( senkou_span_a > 242.514 )
				if( senkou_span_a_displaced <= 244.532 )
					if( senkou_span_a_displaced <= 242.618 )
						if( senkou_span_b <= 243.557 )
							if( kinjun_sen <= 243.471 )
								if( senkou_span_b <= 242 )
									ret := -0.691542
								if( senkou_span_b > 242 )
									ret := -0.362637
							if( kinjun_sen > 243.471 )
								if( tenkan_sen <= 244.167 )
									ret := -0.619048
								if( tenkan_sen > 244.167 )
									ret := 0.085714
						if( senkou_span_b > 243.557 )
							if( basis_minus <= 2.17642 )
								ret := -0.700000 // sell
							if( basis_minus > 2.17642 )
								ret := -0.892857 // sell
					if( senkou_span_a_displaced > 242.618 )
						if( senkou_span_b <= 242.65 )
							if( senkou_span_b <= 242.389 )
								ret := 0.000000
							if( senkou_span_b > 242.389 )
								ret := 1.000000 // buy
						if( senkou_span_b > 242.65 )
							if( kinjun_sen <= 243.857 )
								if( kinjun_sen <= 242.625 )
									ret := 0.378378
								if( kinjun_sen > 242.625 )
									ret := -0.038567
							if( kinjun_sen > 243.857 )
								if( tenkan_sen <= 246.917 )
									ret := -0.374502
								if( tenkan_sen > 246.917 )
									ret := -1.000000 // sell
				if( senkou_span_a_displaced > 244.532 )
					if( chinkou_span <= 242.587 )
						if( senkou_span_b <= 261.699 )
							if( senkou_span_b_displaced <= 246.605 )
								if( kinjun_sen <= 245.933 )
									ret := -0.569444
								if( kinjun_sen > 245.933 )
									ret := 0.500000
							if( senkou_span_b_displaced > 246.605 )
								if( tenkan_sen <= 262.353 )
									ret := -0.813187 // sell
								if( tenkan_sen > 262.353 )
									ret := -0.071429
						if( senkou_span_b > 261.699 )
							ret := -0.200000
					if( chinkou_span > 242.587 )
						if( senkou_span_b_displaced <= 243.725 )
							if( basis_max <= -0.052617 )
								ret := -0.700000 // sell
							if( basis_max > -0.052617 )
								if( senkou_span_a_displaced <= 244.766 )
									ret := -1.000000 // sell
								if( senkou_span_a_displaced > 244.766 )
									ret := -0.812500 // sell
						if( senkou_span_b_displaced > 243.725 )
							if( senkou_span_a <= 243.378 )
								if( senkou_span_b <= 245.189 )
									ret := -0.868421 // sell
								if( senkou_span_b > 245.189 )
									ret := -0.466667
							if( senkou_span_a > 243.378 )
								if( basis_max <= -0.052536 )
									ret := -0.458333
								if( basis_max > -0.052536 )
									ret := -0.263889
		if( chinkou_span > 244.817 )
			if( kinjun_sen <= 250.195 )
				if( chinkou_span <= 248.522 )
					if( tenkan_sen <= 246.499 )
						if( kinjun_sen <= 240.639 )
							if( kinjun_sen <= 238.85 )
								if( senkou_span_a_displaced <= 233.485 )
									ret := -0.176471
								if( senkou_span_a_displaced > 233.485 )
									ret := 0.463415
							if( kinjun_sen > 238.85 )
								if( tenkan_sen <= 240.682 )
									ret := 0.986842 // buy
								if( tenkan_sen > 240.682 )
									ret := 0.824561 // buy
						if( kinjun_sen > 240.639 )
							if( senkou_span_a <= 241.624 )
								if( senkou_span_b_displaced <= 242.845 )
									ret := -0.904762 // sell
								if( senkou_span_b_displaced > 242.845 )
									ret := 0.181818
							if( senkou_span_a > 241.624 )
								if( tenkan_sen <= 242.974 )
									ret := 0.636364
								if( tenkan_sen > 242.974 )
									ret := 0.217195
					if( tenkan_sen > 246.499 )
						if( basis_minus <= -2.5375 )
							ret := 0.833333 // buy
						if( basis_minus > -2.5375 )
							if( senkou_span_b_displaced <= 239.636 )
								if( tenkan_sen <= 248.005 )
									ret := -0.937500 // sell
								if( tenkan_sen > 248.005 )
									ret := -0.444444
							if( senkou_span_b_displaced > 239.636 )
								if( kinjun_sen <= 248.802 )
									ret := -0.139905
								if( kinjun_sen > 248.802 )
									ret := -0.427711
				if( chinkou_span > 248.522 )
					if( chinkou_span <= 259.85 )
						if( kinjun_sen <= 242.9 )
							if( senkou_span_b <= 241.663 )
								if( senkou_span_a <= 236.025 )
									ret := 0.666667
								if( senkou_span_a > 236.025 )
									ret := 0.962264 // buy
							if( senkou_span_b > 241.663 )
								if( kinjun_sen <= 242.1 )
									ret := 0.300000
								if( kinjun_sen > 242.1 )
									ret := 1.000000 // buy
						if( kinjun_sen > 242.9 )
							if( senkou_span_a_displaced <= 246.437 )
								if( basis_minus <= 2.96298 )
									ret := 0.522727
								if( basis_minus > 2.96298 )
									ret := -0.429688
							if( senkou_span_a_displaced > 246.437 )
								if( senkou_span_a_displaced <= 250.694 )
									ret := 0.603486
								if( senkou_span_a_displaced > 250.694 )
									ret := 0.875000 // buy
					if( chinkou_span > 259.85 )
						if( senkou_span_a_displaced <= 250.284 )
							if( senkou_span_a <= 249.72 )
								ret := 0.666667
							if( senkou_span_a > 249.72 )
								ret := 0.777778 // buy
						if( senkou_span_a_displaced > 250.284 )
							ret := 1.000000 // buy
			if( kinjun_sen > 250.195 )
				if( senkou_span_a_displaced <= 583.998 )
					if( tenkan_sen <= 254.747 )
						if( chinkou_span <= 253.07 )
							if( basis_minus <= -1.9875 )
								ret := 0.454545
							if( basis_minus > -1.9875 )
								if( kinjun_sen <= 250.855 )
									ret := -0.145251
								if( kinjun_sen > 250.855 )
									ret := -0.684211
						if( chinkou_span > 253.07 )
							if( senkou_span_b_displaced <= 250.15 )
								if( basis_max <= -0.3875 )
									ret := -0.340909
								if( basis_max > -0.3875 )
									ret := 0.364341
							if( senkou_span_b_displaced > 250.15 )
								if( senkou_span_b <= 250.953 )
									ret := 0.611111
								if( senkou_span_b > 250.953 )
									ret := 0.959459 // buy
					if( tenkan_sen > 254.747 )
						if( senkou_span_a <= 268.595 )
							if( basis_max <= -0.224154 )
								if( senkou_span_a <= 266.282 )
									ret := -0.007958
								if( senkou_span_a > 266.282 )
									ret := 0.372937
							if( basis_max > -0.224154 )
								if( chinkou_span <= 255.663 )
									ret := -0.806818 // sell
								if( chinkou_span > 255.663 )
									ret := 0.363388
						if( senkou_span_a > 268.595 )
							if( senkou_span_b <= 378.626 )
								if( kinjun_sen <= 355.215 )
									ret := -0.030031
								if( kinjun_sen > 355.215 )
									ret := -0.319429
							if( senkou_span_b > 378.626 )
								if( senkou_span_b <= 380.325 )
									ret := 0.659341
								if( senkou_span_b > 380.325 )
									ret := 0.041371
				if( senkou_span_a_displaced > 583.998 )
					if( senkou_span_b_displaced <= 598.475 )
						if( chinkou_span <= 589.766 )
							if( senkou_span_b_displaced <= 587.941 )
								if( basis_minus <= 2.78144 )
									ret := -0.242254
								if( basis_minus > 2.78144 )
									ret := -0.673469
							if( senkou_span_b_displaced > 587.941 )
								if( senkou_span_b_displaced <= 597.125 )
									ret := -0.615114
								if( senkou_span_b_displaced > 597.125 )
									ret := 0.031250
						if( chinkou_span > 589.766 )
							if( tenkan_sen <= 597.425 )
								if( senkou_span_a <= 589.788 )
									ret := 0.538136
								if( senkou_span_a > 589.788 )
									ret := 0.069597
							if( tenkan_sen > 597.425 )
								if( chinkou_span <= 601.396 )
									ret := -0.598266
								if( chinkou_span > 601.396 )
									ret := -0.145530
					if( senkou_span_b_displaced > 598.475 )
						if( senkou_span_a_displaced <= 604.998 )
							if( chinkou_span <= 604.541 )
								if( chinkou_span <= 570.761 )
									ret := 0.928571 // buy
								if( chinkou_span > 570.761 )
									ret := -0.228142
							if( chinkou_span > 604.541 )
								if( tenkan_sen <= 610.91 )
									ret := 0.298113
								if( tenkan_sen > 610.91 )
									ret := 0.756522 // buy
						if( senkou_span_a_displaced > 604.998 )
							if( basis_minus <= 13.2439 )
								if( chinkou_span <= 595.277 )
									ret := -0.795918 // sell
								if( chinkou_span > 595.277 )
									ret := -0.202048
							if( basis_minus > 13.2439 )
								if( senkou_span_a <= 689.808 )
									ret := 0.855263 // buy
								if( senkou_span_a > 689.808 )
									ret := -0.200000
	if( basis_max > 0.250478 )
		if( basis_minus <= -15.0482 )
			if( senkou_span_b_displaced <= 506.454 )
				if( senkou_span_b_displaced <= 426.8 )
					if( tenkan_sen <= 322.902 )
						if( basis_minus <= -16.0933 )
							if( basis_minus <= -23.4332 )
								ret := 0.888889 // buy
							if( basis_minus > -23.4332 )
								if( basis_max <= 3.41667 )
									ret := 1.000000 // buy
								if( basis_max > 3.41667 )
									ret := 0.928571 // buy
						if( basis_minus > -16.0933 )
							if( chinkou_span <= 234.841 )
								ret := 0.222222
							if( chinkou_span > 234.841 )
								if( chinkou_span <= 241.921 )
									ret := 1.000000 // buy
								if( chinkou_span > 241.921 )
									ret := 0.500000
					if( tenkan_sen > 322.902 )
						ret := -0.692308
				if( senkou_span_b_displaced > 426.8 )
					ret := 1.000000 // buy
			if( senkou_span_b_displaced > 506.454 )
				if( chinkou_span <= 511.3 )
					if( senkou_span_a <= 452.402 )
						ret := -0.200000
					if( senkou_span_a > 452.402 )
						ret := -0.812500 // sell
				if( chinkou_span > 511.3 )
					if( basis_max <= 1.43258 )
						ret := 1.000000 // buy
					if( basis_max > 1.43258 )
						ret := 0.571429
		if( basis_minus > -15.0482 )
			if( senkou_span_a <= 583.656 )
				if( senkou_span_b_displaced <= 597.025 )
					if( senkou_span_a_displaced <= 595.47 )
						if( senkou_span_a <= 194.513 )
							if( basis_max <= 0.777451 )
								ret := 0.785714 // buy
							if( basis_max > 0.777451 )
								ret := 1.000000 // buy
						if( senkou_span_a > 194.513 )
							if( kinjun_sen <= 204.923 )
								if( senkou_span_a_displaced <= 205.308 )
									ret := -0.937500 // sell
								if( senkou_span_a_displaced > 205.308 )
									ret := -0.476190
							if( kinjun_sen > 204.923 )
								if( senkou_span_b <= 212.307 )
									ret := 0.330389
								if( senkou_span_b > 212.307 )
									ret := 0.061485
					if( senkou_span_a_displaced > 595.47 )
						if( tenkan_sen <= 565.711 )
							ret := -0.333333
						if( tenkan_sen > 565.711 )
							if( chinkou_span <= 580.983 )
								ret := -0.956522 // sell
							if( chinkou_span > 580.983 )
								ret := -0.777778 // sell
				if( senkou_span_b_displaced > 597.025 )
					if( kinjun_sen <= 582 )
						ret := 0.153846
					if( kinjun_sen > 582 )
						if( senkou_span_b_displaced <= 597.9 )
							if( chinkou_span <= 573.996 )
								ret := 1.000000 // buy
							if( chinkou_span > 573.996 )
								ret := 0.600000
						if( senkou_span_b_displaced > 597.9 )
							if( tenkan_sen <= 576.826 )
								ret := 0.916667 // buy
							if( tenkan_sen > 576.826 )
								ret := 1.000000 // buy
			if( senkou_span_a > 583.656 )
				if( tenkan_sen <= 590.325 )
					if( senkou_span_a_displaced <= 581.359 )
						if( chinkou_span <= 594.92 )
							ret := 0.500000
						if( chinkou_span > 594.92 )
							if( chinkou_span <= 621.82 )
								ret := 0.866667 // buy
							if( chinkou_span > 621.82 )
								ret := 0.800000 // buy
					if( senkou_span_a_displaced > 581.359 )
						if( kinjun_sen <= 595.075 )
							if( basis_max <= 1.92818 )
								if( chinkou_span <= 581.922 )
									ret := -0.535055
								if( chinkou_span > 581.922 )
									ret := -0.004717
							if( basis_max > 1.92818 )
								if( senkou_span_a <= 588.513 )
									ret := -0.321429
								if( senkou_span_a > 588.513 )
									ret := -0.849315 // sell
						if( kinjun_sen > 595.075 )
							ret := 0.888889 // buy
				if( tenkan_sen > 590.325 )
					if( senkou_span_b_displaced <= 588.197 )
						if( senkou_span_a <= 600.679 )
							if( basis_max <= 1.45753 )
								if( basis_minus <= 1.10024 )
									ret := 1.000000 // buy
								if( basis_minus > 1.10024 )
									ret := 0.484848
							if( basis_max > 1.45753 )
								ret := 1.000000 // buy
						if( senkou_span_a > 600.679 )
							ret := -0.900000 // sell
					if( senkou_span_b_displaced > 588.197 )
						if( senkou_span_a_displaced <= 702.838 )
							if( tenkan_sen <= 602.46 )
								if( basis_max <= 4.525 )
									ret := 0.053584
								if( basis_max > 4.525 )
									ret := -1.000000 // sell
							if( tenkan_sen > 602.46 )
								if( chinkou_span <= 606.284 )
									ret := -0.458915
								if( chinkou_span > 606.284 )
									ret := 0.057766
						if( senkou_span_a_displaced > 702.838 )
							if( senkou_span_a_displaced <= 704.428 )
								if( tenkan_sen <= 702.546 )
									ret := 1.000000 // buy
								if( tenkan_sen > 702.546 )
									ret := 0.866667 // buy
							if( senkou_span_a_displaced > 704.428 )
								if( basis_minus <= -2.67617 )
									ret := 0.884615 // buy
								if( basis_minus > -2.67617 )
									ret := 0.111111
	
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
float op_operation = decision_tree_0_BNBUSDT_15Min_f8d6974c(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)

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


