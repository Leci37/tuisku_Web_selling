//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: AFRM_1Min_1ICH_ba56e6f4 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AFRM_1Min_1ICH_ba56e6f4", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AFRM_1Min_ba56e6f4(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( basis_max <= 0.118816 )
		if( chinkou_span <= 44.6513 )
			if( senkou_span_a <= 43.831 )
				if( senkou_span_a_displaced <= 43.59 )
					if( basis_minus <= 0.475337 )
						if( basis_minus <= 0.264854 )
							if( senkou_span_b_displaced <= 24.4442 )
								if( chinkou_span <= 24.4858 )
									ret := -0.090435
								if( chinkou_span > 24.4858 )
									ret := 0.497970
							if( senkou_span_b_displaced > 24.4442 )
								if( chinkou_span <= 24.7778 )
									ret := -0.297953
								if( chinkou_span > 24.7778 )
									ret := -0.011215
						if( basis_minus > 0.264854 )
							if( senkou_span_b_displaced <= 34.4955 )
								if( senkou_span_a_displaced <= 32.8381 )
									ret := 0.155105
								if( senkou_span_a_displaced > 32.8381 )
									ret := -0.341026
							if( senkou_span_b_displaced > 34.4955 )
								if( senkou_span_a_displaced <= 40.2978 )
									ret := 0.380328
								if( senkou_span_a_displaced > 40.2978 )
									ret := -0.007080
					if( basis_minus > 0.475337 )
						if( chinkou_span <= 43.5837 )
							if( kinjun_sen <= 30.9809 )
								if( kinjun_sen <= 28.0025 )
									ret := -0.448598
								if( kinjun_sen > 28.0025 )
									ret := 0.701149 // buy
							if( kinjun_sen > 30.9809 )
								if( senkou_span_a_displaced <= 33.2887 )
									ret := -0.541766
								if( senkou_span_a_displaced > 33.2887 )
									ret := -0.254276
						if( chinkou_span > 43.5837 )
							if( basis_max <= -0.21546 )
								ret := -0.210526
							if( basis_max > -0.21546 )
								if( basis_max <= -0.111275 )
									ret := 0.882353 // buy
								if( basis_max > -0.111275 )
									ret := 1.000000 // buy
				if( senkou_span_a_displaced > 43.59 )
					if( kinjun_sen <= 43.4208 )
						if( chinkou_span <= 42.9284 )
							ret := -1.000000 // sell
						if( chinkou_span > 42.9284 )
							if( tenkan_sen <= 43.0545 )
								ret := 0.600000
							if( tenkan_sen > 43.0545 )
								if( basis_minus <= -0.2675 )
									ret := -0.090909
								if( basis_minus > -0.2675 )
									ret := 0.200000
					if( kinjun_sen > 43.4208 )
						if( senkou_span_b <= 43.7109 )
							if( senkou_span_a <= 43.701 )
								if( chinkou_span <= 43.6564 )
									ret := 0.292929
								if( chinkou_span > 43.6564 )
									ret := 0.772487 // buy
							if( senkou_span_a > 43.701 )
								if( tenkan_sen <= 43.723 )
									ret := -0.500000
								if( tenkan_sen > 43.723 )
									ret := 0.133333
						if( senkou_span_b > 43.7109 )
							if( senkou_span_b_displaced <= 43.7518 )
								if( basis_minus <= -0.000185 )
									ret := 0.621622
								if( basis_minus > -0.000185 )
									ret := -0.133333
							if( senkou_span_b_displaced > 43.7518 )
								if( chinkou_span <= 44.0942 )
									ret := 0.012121
								if( chinkou_span > 44.0942 )
									ret := 0.900000 // buy
			if( senkou_span_a > 43.831 )
				if( tenkan_sen <= 44.6846 )
					if( kinjun_sen <= 43.9075 )
						if( senkou_span_b_displaced <= 43.4731 )
							if( chinkou_span <= 44.3649 )
								if( senkou_span_b_displaced <= 42.9794 )
									ret := -0.428571
								if( senkou_span_b_displaced > 42.9794 )
									ret := -0.911504 // sell
							if( chinkou_span > 44.3649 )
								ret := 0.000000
						if( senkou_span_b_displaced > 43.4731 )
							if( kinjun_sen <= 43.8582 )
								if( senkou_span_b_displaced <= 43.716 )
									ret := 0.116505
								if( senkou_span_b_displaced > 43.716 )
									ret := -0.378947
							if( kinjun_sen > 43.8582 )
								if( senkou_span_b_displaced <= 43.8513 )
									ret := -0.204819
								if( senkou_span_b_displaced > 43.8513 )
									ret := -0.716814 // sell
					if( kinjun_sen > 43.9075 )
						if( senkou_span_b_displaced <= 44.592 )
							if( chinkou_span <= 43.8909 )
								if( kinjun_sen <= 44.0037 )
									ret := 0.021622
								if( kinjun_sen > 44.0037 )
									ret := -0.625000
							if( chinkou_span > 43.8909 )
								if( senkou_span_a_displaced <= 43.8691 )
									ret := -0.434783
								if( senkou_span_a_displaced > 43.8691 )
									ret := 0.170517
						if( senkou_span_b_displaced > 44.592 )
							if( kinjun_sen <= 44.7024 )
								if( chinkou_span <= 44.2073 )
									ret := -0.700000 // sell
								if( chinkou_span > 44.2073 )
									ret := 0.201754
							if( kinjun_sen > 44.7024 )
								if( basis_minus <= -0.21125 )
									ret := -1.000000 // sell
								if( basis_minus > -0.21125 )
									ret := -0.909091 // sell
				if( tenkan_sen > 44.6846 )
					if( senkou_span_b_displaced <= 44.385 )
						if( basis_max <= -0.152463 )
							if( basis_minus <= 0.182875 )
								ret := -0.769231 // sell
							if( basis_minus > 0.182875 )
								ret := -1.000000 // sell
						if( basis_max > -0.152463 )
							if( senkou_span_a_displaced <= 44.4938 )
								if( basis_minus <= 0.34591 )
									ret := -0.200000
								if( basis_minus > 0.34591 )
									ret := -0.968254 // sell
							if( senkou_span_a_displaced > 44.4938 )
								if( senkou_span_a_displaced <= 44.6148 )
									ret := 0.454545
								if( senkou_span_a_displaced > 44.6148 )
									ret := -1.000000 // sell
					if( senkou_span_b_displaced > 44.385 )
						if( kinjun_sen <= 45.0334 )
							if( basis_minus <= 0.086253 )
								if( senkou_span_b_displaced <= 44.9176 )
									ret := -0.695652
								if( senkou_span_b_displaced > 44.9176 )
									ret := -0.287671
							if( basis_minus > 0.086253 )
								if( kinjun_sen <= 44.5513 )
									ret := -0.625000
								if( kinjun_sen > 44.5513 )
									ret := 0.052632
						if( kinjun_sen > 45.0334 )
							if( senkou_span_a_displaced <= 45.4694 )
								ret := -0.600000
							if( senkou_span_a_displaced > 45.4694 )
								ret := -1.000000 // sell
		if( chinkou_span > 44.6513 )
			if( senkou_span_a_displaced <= 44.8828 )
				if( tenkan_sen <= 44.7598 )
					if( basis_minus <= 0.237027 )
						if( senkou_span_b_displaced <= 44.565 )
							if( senkou_span_b <= 44.4139 )
								if( senkou_span_b <= 44.1887 )
									ret := 0.400000
								if( senkou_span_b > 44.1887 )
									ret := 0.723005 // buy
							if( senkou_span_b > 44.4139 )
								if( basis_max <= 0.005125 )
									ret := 0.079365
								if( basis_max > 0.005125 )
									ret := 0.666667
						if( senkou_span_b_displaced > 44.565 )
							if( senkou_span_b_displaced <= 44.8561 )
								if( senkou_span_b_displaced <= 44.7173 )
									ret := 0.640000
								if( senkou_span_b_displaced > 44.7173 )
									ret := 0.896552 // buy
							if( senkou_span_b_displaced > 44.8561 )
								if( kinjun_sen <= 44.7273 )
									ret := 0.619048
								if( kinjun_sen > 44.7273 )
									ret := 0.055556
					if( basis_minus > 0.237027 )
						if( senkou_span_a <= 44.4243 )
							if( senkou_span_a <= 44.3627 )
								ret := -0.176471
							if( senkou_span_a > 44.3627 )
								ret := -0.916667 // sell
						if( senkou_span_a > 44.4243 )
							if( basis_minus <= 0.462659 )
								if( tenkan_sen <= 44.6675 )
									ret := 0.545455
								if( tenkan_sen > 44.6675 )
									ret := 0.636364
							if( basis_minus > 0.462659 )
								ret := 0.083333
				if( tenkan_sen > 44.7598 )
					if( senkou_span_b <= 45.1443 )
						if( senkou_span_a_displaced <= 44.5798 )
							if( senkou_span_a <= 44.9035 )
								if( senkou_span_b <= 44.7089 )
									ret := 0.318681
								if( senkou_span_b > 44.7089 )
									ret := -0.555556
							if( senkou_span_a > 44.9035 )
								if( senkou_span_b <= 44.7613 )
									ret := 0.428571
								if( senkou_span_b > 44.7613 )
									ret := 0.937500 // buy
						if( senkou_span_a_displaced > 44.5798 )
							if( senkou_span_b <= 44.8309 )
								if( senkou_span_a_displaced <= 44.5963 )
									ret := -0.868421 // sell
								if( senkou_span_a_displaced > 44.5963 )
									ret := -0.142857
							if( senkou_span_b > 44.8309 )
								if( basis_max <= -0.129325 )
									ret := -0.916667 // sell
								if( basis_max > -0.129325 )
									ret := 0.272000
					if( senkou_span_b > 45.1443 )
						if( tenkan_sen <= 45.4075 )
							ret := 1.000000 // buy
						if( tenkan_sen > 45.4075 )
							if( basis_minus <= 0.35125 )
								ret := -0.300000
							if( basis_minus > 0.35125 )
								if( senkou_span_a <= 45.7676 )
									ret := 1.000000 // buy
								if( senkou_span_a > 45.7676 )
									ret := 0.454545
			if( senkou_span_a_displaced > 44.8828 )
				if( chinkou_span <= 45.629 )
					if( basis_minus <= 0.023026 )
						if( senkou_span_b_displaced <= 46.4033 )
							if( basis_minus <= -0.049766 )
								if( basis_max <= 0.002759 )
									ret := -0.395833
								if( basis_max > 0.002759 )
									ret := 0.147410
							if( basis_minus > -0.049766 )
								if( senkou_span_a_displaced <= 45.6474 )
									ret := 0.505952
								if( senkou_span_a_displaced > 45.6474 )
									ret := -0.500000
						if( senkou_span_b_displaced > 46.4033 )
							if( tenkan_sen <= 46.0029 )
								if( basis_minus <= -0.236347 )
									ret := -0.976744 // sell
								if( basis_minus > -0.236347 )
									ret := -0.523810
							if( tenkan_sen > 46.0029 )
								ret := -0.166667
					if( basis_minus > 0.023026 )
						if( senkou_span_b <= 45.6179 )
							if( basis_minus <= 0.184039 )
								if( basis_minus <= 0.068795 )
									ret := -0.490196
								if( basis_minus > 0.068795 )
									ret := -0.137615
							if( basis_minus > 0.184039 )
								if( senkou_span_a_displaced <= 44.8942 )
									ret := 0.090909
								if( senkou_span_a_displaced > 44.8942 )
									ret := -0.768293 // sell
						if( senkou_span_b > 45.6179 )
							ret := -0.954545 // sell
				if( chinkou_span > 45.629 )
					if( tenkan_sen <= 47.073 )
						if( senkou_span_a_displaced <= 46.2539 )
							if( senkou_span_b <= 46.03 )
								if( senkou_span_b_displaced <= 44.9104 )
									ret := 0.692308
								if( senkou_span_b_displaced > 44.9104 )
									ret := 0.333333
							if( senkou_span_b > 46.03 )
								if( basis_max <= -0.042413 )
									ret := 0.851852 // buy
								if( basis_max > -0.042413 )
									ret := 0.964912 // buy
						if( senkou_span_a_displaced > 46.2539 )
							if( senkou_span_b <= 47.0812 )
								if( kinjun_sen <= 46.91 )
									ret := 0.046809
								if( kinjun_sen > 46.91 )
									ret := 0.571429
							if( senkou_span_b > 47.0812 )
								if( kinjun_sen <= 46.8646 )
									ret := -0.962963 // sell
								if( kinjun_sen > 46.8646 )
									ret := -0.307692
					if( tenkan_sen > 47.073 )
						if( senkou_span_b_displaced <= 48.433 )
							if( basis_max <= 0.043883 )
								if( senkou_span_b <= 46.4455 )
									ret := -0.875000 // sell
								if( senkou_span_b > 46.4455 )
									ret := -0.005386
							if( basis_max > 0.043883 )
								if( basis_max <= 0.109204 )
									ret := -0.861111 // sell
								if( basis_max > 0.109204 )
									ret := -0.555556
						if( senkou_span_b_displaced > 48.433 )
							if( senkou_span_a_displaced <= 49.2619 )
								if( senkou_span_b <= 48.7071 )
									ret := 0.750000 // buy
								if( senkou_span_b > 48.7071 )
									ret := 0.131579
							if( senkou_span_a_displaced > 49.2619 )
								if( basis_minus <= -0.00858 )
									ret := -0.464286
								if( basis_minus > -0.00858 )
									ret := -0.894737 // sell
	if( basis_max > 0.118816 )
		if( basis_max <= 0.623659 )
			if( basis_minus <= -0.259261 )
				if( senkou_span_b_displaced <= 31.4833 )
					if( chinkou_span <= 22.895 )
						if( senkou_span_a_displaced <= 25.612 )
							if( basis_max <= 0.251052 )
								if( senkou_span_b_displaced <= 24.2318 )
									ret := 0.142857
								if( senkou_span_b_displaced > 24.2318 )
									ret := -0.941176 // sell
							if( basis_max > 0.251052 )
								if( tenkan_sen <= 22.775 )
									ret := 0.555556
								if( tenkan_sen > 22.775 )
									ret := 0.700000 // buy
						if( senkou_span_a_displaced > 25.612 )
							if( senkou_span_a_displaced <= 25.6249 )
								ret := -1.000000 // sell
							if( senkou_span_a_displaced > 25.6249 )
								ret := -0.700000 // sell
					if( chinkou_span > 22.895 )
						if( senkou_span_b_displaced <= 30.9688 )
							if( senkou_span_a_displaced <= 26.0326 )
								ret := 1.000000 // buy
							if( senkou_span_a_displaced > 26.0326 )
								if( senkou_span_a <= 28.5911 )
									ret := 0.592105
								if( senkou_span_a > 28.5911 )
									ret := 0.851852 // buy
						if( senkou_span_b_displaced > 30.9688 )
							if( chinkou_span <= 30.0821 )
								if( basis_max <= 0.251702 )
									ret := -0.909091 // sell
								if( basis_max > 0.251702 )
									ret := 1.000000 // buy
							if( chinkou_span > 30.0821 )
								ret := 0.666667
				if( senkou_span_b_displaced > 31.4833 )
					if( kinjun_sen <= 40.19 )
						if( tenkan_sen <= 35.4399 )
							if( chinkou_span <= 32.3647 )
								if( tenkan_sen <= 31.8575 )
									ret := -0.006849
								if( tenkan_sen > 31.8575 )
									ret := -0.674603
							if( chinkou_span > 32.3647 )
								if( kinjun_sen <= 35.6297 )
									ret := 0.475138
								if( kinjun_sen > 35.6297 )
									ret := -0.348837
						if( tenkan_sen > 35.4399 )
							if( senkou_span_b_displaced <= 37.5168 )
								if( senkou_span_a_displaced <= 38.4094 )
									ret := -1.000000 // sell
								if( senkou_span_a_displaced > 38.4094 )
									ret := -0.769231 // sell
							if( senkou_span_b_displaced > 37.5168 )
								if( senkou_span_a_displaced <= 38.3318 )
									ret := 0.761905 // buy
								if( senkou_span_a_displaced > 38.3318 )
									ret := -0.443182
					if( kinjun_sen > 40.19 )
						if( senkou_span_b <= 42.4168 )
							if( senkou_span_a <= 41.5765 )
								if( senkou_span_b <= 40.8067 )
									ret := 0.967742 // buy
								if( senkou_span_b > 40.8067 )
									ret := -0.195122
							if( senkou_span_a > 41.5765 )
								if( kinjun_sen <= 41.7575 )
									ret := 0.857143 // buy
								if( kinjun_sen > 41.7575 )
									ret := 1.000000 // buy
						if( senkou_span_b > 42.4168 )
							if( kinjun_sen <= 43.6675 )
								if( tenkan_sen <= 43.1775 )
									ret := -0.353535
								if( tenkan_sen > 43.1775 )
									ret := -1.000000 // sell
							if( kinjun_sen > 43.6675 )
								if( basis_max <= 0.3854 )
									ret := 0.416149
								if( basis_max > 0.3854 )
									ret := -1.000000 // sell
			if( basis_minus > -0.259261 )
				if( tenkan_sen <= 24.9357 )
					if( senkou_span_a_displaced <= 24.7687 )
						if( senkou_span_b_displaced <= 23.3386 )
							ret := -0.692308
						if( senkou_span_b_displaced > 23.3386 )
							ret := 0.833333 // buy
					if( senkou_span_a_displaced > 24.7687 )
						if( chinkou_span <= 25.2128 )
							if( senkou_span_a_displaced <= 24.9495 )
								ret := -1.000000 // sell
							if( senkou_span_a_displaced > 24.9495 )
								if( senkou_span_b_displaced <= 25.3629 )
									ret := -0.666667
								if( senkou_span_b_displaced > 25.3629 )
									ret := -1.000000 // sell
						if( chinkou_span > 25.2128 )
							ret := 0.909091 // buy
				if( tenkan_sen > 24.9357 )
					if( senkou_span_a_displaced <= 47.2693 )
						if( senkou_span_b_displaced <= 44.9762 )
							if( senkou_span_a_displaced <= 33.5536 )
								if( tenkan_sen <= 32.9498 )
									ret := 0.280992
								if( tenkan_sen > 32.9498 )
									ret := -0.318182
							if( senkou_span_a_displaced > 33.5536 )
								if( tenkan_sen <= 41.2455 )
									ret := 0.527076
								if( tenkan_sen > 41.2455 )
									ret := 0.204819
						if( senkou_span_b_displaced > 44.9762 )
							if( kinjun_sen <= 45.4196 )
								ret := 1.000000 // buy
							if( kinjun_sen > 45.4196 )
								ret := 0.545455
					if( senkou_span_a_displaced > 47.2693 )
						if( tenkan_sen <= 47.2768 )
							ret := -1.000000 // sell
						if( tenkan_sen > 47.2768 )
							ret := -0.500000
		if( basis_max > 0.623659 )
			if( senkou_span_a_displaced <= 36.6257 )
				if( tenkan_sen <= 33.1021 )
					ret := -0.692308
				if( tenkan_sen > 33.1021 )
					ret := -1.000000 // sell
			if( senkou_span_a_displaced > 36.6257 )
				ret := -0.187500
	
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
float op_operation = decision_tree_0_AFRM_1Min_ba56e6f4(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)

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


