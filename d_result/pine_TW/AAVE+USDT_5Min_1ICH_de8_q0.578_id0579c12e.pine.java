//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: AAVEUSDT_5Min_1ICH_0579c12e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAVEUSDT_5Min_1ICH_0579c12e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAVEUSDT_5Min_0579c12e(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( chinkou_span <= 125.173 )
		if( kinjun_sen <= 125.589 )
			if( senkou_span_a <= 100.933 )
				if( senkou_span_a <= 100.219 )
					if( basis_minus <= -0.54187 )
						if( senkou_span_a_displaced <= 64.9688 )
							if( chinkou_span <= 62.9702 )
								if( senkou_span_b <= 60.8425 )
									ret := 0.438776
								if( senkou_span_b > 60.8425 )
									ret := 0.042424
							if( chinkou_span > 62.9702 )
								if( senkou_span_b_displaced <= 65.4307 )
									ret := 0.659722
								if( senkou_span_b_displaced > 65.4307 )
									ret := 0.000000
						if( senkou_span_a_displaced > 64.9688 )
							if( chinkou_span <= 98.203 )
								if( senkou_span_a_displaced <= 99.9251 )
									ret := 0.039373
								if( senkou_span_a_displaced > 99.9251 )
									ret := -0.392405
							if( chinkou_span > 98.203 )
								if( tenkan_sen <= 98.0251 )
									ret := 0.729508 // buy
								if( tenkan_sen > 98.0251 )
									ret := 0.130942
					if( basis_minus > -0.54187 )
						if( basis_minus <= 0.884182 )
							if( chinkou_span <= 98.3768 )
								if( senkou_span_b_displaced <= 97.5412 )
									ret := -0.001382
								if( senkou_span_b_displaced > 97.5412 )
									ret := -0.265258
							if( chinkou_span > 98.3768 )
								if( tenkan_sen <= 98.4633 )
									ret := 0.484705
								if( tenkan_sen > 98.4633 )
									ret := 0.127927
						if( basis_minus > 0.884182 )
							if( senkou_span_b <= 98.1311 )
								if( chinkou_span <= 99.714 )
									ret := -0.103256
								if( chinkou_span > 99.714 )
									ret := 0.553957
							if( senkou_span_b > 98.1311 )
								if( kinjun_sen <= 99.2373 )
									ret := -0.831858 // sell
								if( kinjun_sen > 99.2373 )
									ret := -0.068182
				if( senkou_span_a > 100.219 )
					if( senkou_span_a_displaced <= 95.585 )
						ret := -1.000000 // sell
					if( senkou_span_a_displaced > 95.585 )
						if( senkou_span_b <= 100.02 )
							if( senkou_span_b_displaced <= 94.2137 )
								ret := -0.933333 // sell
							if( senkou_span_b_displaced > 94.2137 )
								if( basis_max <= -0.0525 )
									ret := 0.728571 // buy
								if( basis_max > -0.0525 )
									ret := -0.549020
						if( senkou_span_b > 100.02 )
							if( senkou_span_a_displaced <= 100.362 )
								if( senkou_span_a <= 100.268 )
									ret := 0.645161
								if( senkou_span_a > 100.268 )
									ret := -0.149660
							if( senkou_span_a_displaced > 100.362 )
								if( chinkou_span <= 100.617 )
									ret := -0.059222
								if( chinkou_span > 100.617 )
									ret := 0.513219
			if( senkou_span_a > 100.933 )
				if( chinkou_span <= 101.297 )
					if( basis_minus <= -0.604866 )
						if( senkou_span_a <= 102.036 )
							if( basis_minus <= -0.705424 )
								if( kinjun_sen <= 102.104 )
									ret := 0.011765
								if( kinjun_sen > 102.104 )
									ret := 0.651163
							if( basis_minus > -0.705424 )
								if( chinkou_span <= 99.2863 )
									ret := -0.800000 // sell
								if( chinkou_span > 99.2863 )
									ret := -0.068182
						if( senkou_span_a > 102.036 )
							if( kinjun_sen <= 111.668 )
								if( chinkou_span <= 100.224 )
									ret := -0.901554 // sell
								if( chinkou_span > 100.224 )
									ret := -0.604167
							if( kinjun_sen > 111.668 )
								ret := 0.500000
					if( basis_minus > -0.604866 )
						if( kinjun_sen <= 101.524 )
							if( kinjun_sen <= 100.554 )
								if( chinkou_span <= 100.775 )
									ret := -0.955556 // sell
								if( chinkou_span > 100.775 )
									ret := -0.714286 // sell
							if( kinjun_sen > 100.554 )
								if( tenkan_sen <= 101.379 )
									ret := -0.520492
								if( tenkan_sen > 101.379 )
									ret := -0.238095
						if( kinjun_sen > 101.524 )
							if( kinjun_sen <= 102.761 )
								if( basis_minus <= 1.92 )
									ret := -0.634597
								if( basis_minus > 1.92 )
									ret := -0.350000
							if( kinjun_sen > 102.761 )
								if( basis_max <= -0.216254 )
									ret := 0.250000
								if( basis_max > -0.216254 )
									ret := -0.790076 // sell
				if( chinkou_span > 101.297 )
					if( senkou_span_a <= 102.32 )
						if( kinjun_sen <= 103.144 )
							if( basis_minus <= 1.16667 )
								if( senkou_span_a <= 100.952 )
									ret := -0.425000
								if( senkou_span_a > 100.952 )
									ret := 0.225750
							if( basis_minus > 1.16667 )
								if( tenkan_sen <= 101.968 )
									ret := -1.000000 // sell
								if( tenkan_sen > 101.968 )
									ret := -0.375000
						if( kinjun_sen > 103.144 )
							if( basis_minus <= -2.1958 )
								ret := -0.750000 // sell
							if( basis_minus > -2.1958 )
								ret := -1.000000 // sell
					if( senkou_span_a > 102.32 )
						if( senkou_span_a_displaced <= 113.439 )
							if( senkou_span_a_displaced <= 106.731 )
								if( chinkou_span <= 103.451 )
									ret := -0.264947
								if( chinkou_span > 103.451 )
									ret := 0.063485
							if( senkou_span_a_displaced > 106.731 )
								if( senkou_span_a <= 104.747 )
									ret := -0.942857 // sell
								if( senkou_span_a > 104.747 )
									ret := 0.101076
						if( senkou_span_a_displaced > 113.439 )
							if( chinkou_span <= 112.577 )
								if( senkou_span_b <= 112.507 )
									ret := 0.225641
								if( senkou_span_b > 112.507 )
									ret := -0.610012
							if( chinkou_span > 112.577 )
								if( kinjun_sen <= 114.584 )
									ret := 0.284035
								if( kinjun_sen > 114.584 )
									ret := -0.032483
		if( kinjun_sen > 125.589 )
			if( senkou_span_a_displaced <= 127.978 )
				if( senkou_span_a_displaced <= 126.565 )
					if( basis_max <= -0.292895 )
						if( kinjun_sen <= 127.33 )
							if( tenkan_sen <= 126.819 )
								ret := -1.000000 // sell
							if( tenkan_sen > 126.819 )
								if( basis_minus <= 1.74335 )
									ret := 0.000000
								if( basis_minus > 1.74335 )
									ret := -1.000000 // sell
						if( kinjun_sen > 127.33 )
							if( basis_minus <= 1.63084 )
								ret := -1.000000 // sell
							if( basis_minus > 1.63084 )
								ret := -0.923077 // sell
					if( basis_max > -0.292895 )
						if( basis_max <= -0.096895 )
							if( kinjun_sen <= 126.235 )
								if( kinjun_sen <= 126.015 )
									ret := -0.090909
								if( kinjun_sen > 126.015 )
									ret := 0.846154 // buy
							if( kinjun_sen > 126.235 )
								if( senkou_span_a <= 127.386 )
									ret := -0.312500
								if( senkou_span_a > 127.386 )
									ret := -0.913043 // sell
						if( basis_max > -0.096895 )
							if( basis_max <= 0.534284 )
								if( basis_max <= 0.152097 )
									ret := -0.734266 // sell
								if( basis_max > 0.152097 )
									ret := -0.046875
							if( basis_max > 0.534284 )
								ret := -1.000000 // sell
				if( senkou_span_a_displaced > 126.565 )
					if( basis_max <= 0.084921 )
						if( basis_max <= -0.580365 )
							ret := -1.000000 // sell
						if( basis_max > -0.580365 )
							if( senkou_span_b <= 126.407 )
								ret := -0.714286 // sell
							if( senkou_span_b > 126.407 )
								if( senkou_span_a_displaced <= 127.179 )
									ret := 0.375000
								if( senkou_span_a_displaced > 127.179 )
									ret := 0.829268 // buy
					if( basis_max > 0.084921 )
						if( basis_max <= 0.491255 )
							if( senkou_span_a_displaced <= 127.289 )
								if( senkou_span_b <= 126.502 )
									ret := -0.750000 // sell
								if( senkou_span_b > 126.502 )
									ret := 0.388889
							if( senkou_span_a_displaced > 127.289 )
								if( senkou_span_b_displaced <= 126.805 )
									ret := -0.885246 // sell
								if( senkou_span_b_displaced > 126.805 )
									ret := -0.535211
						if( basis_max > 0.491255 )
							if( senkou_span_a_displaced <= 127.287 )
								if( basis_minus <= -0.658689 )
									ret := 0.826087 // buy
								if( basis_minus > -0.658689 )
									ret := 0.400000
							if( senkou_span_a_displaced > 127.287 )
								if( tenkan_sen <= 125.707 )
									ret := -0.583333
								if( tenkan_sen > 125.707 )
									ret := -1.000000 // sell
			if( senkou_span_a_displaced > 127.978 )
				if( senkou_span_b <= 126.852 )
					ret := 0.250000
				if( senkou_span_b > 126.852 )
					if( basis_minus <= -2.12125 )
						ret := -0.315789
					if( basis_minus > -2.12125 )
						if( senkou_span_a_displaced <= 128.907 )
							if( senkou_span_b_displaced <= 128.936 )
								if( chinkou_span <= 125.044 )
									ret := -0.954338 // sell
								if( chinkou_span > 125.044 )
									ret := -0.611111
							if( senkou_span_b_displaced > 128.936 )
								if( basis_max <= 0.1175 )
									ret := -1.000000 // sell
								if( basis_max > 0.1175 )
									ret := 0.058824
						if( senkou_span_a_displaced > 128.907 )
							if( senkou_span_a <= 127.288 )
								if( basis_max <= 0.628711 )
									ret := 0.407407
								if( basis_max > 0.628711 )
									ret := -0.850746 // sell
							if( senkou_span_a > 127.288 )
								if( tenkan_sen <= 131.39 )
									ret := -0.966102 // sell
								if( tenkan_sen > 131.39 )
									ret := -0.678571
	if( chinkou_span > 125.173 )
		if( tenkan_sen <= 124.963 )
			if( tenkan_sen <= 124.41 )
				if( senkou_span_b_displaced <= 118.068 )
					if( senkou_span_a_displaced <= 114.045 )
						ret := 0.600000
					if( senkou_span_a_displaced > 114.045 )
						if( basis_max <= -0.04375 )
							ret := 1.000000 // buy
						if( basis_max > -0.04375 )
							ret := 0.928571 // buy
				if( senkou_span_b_displaced > 118.068 )
					if( basis_max <= 0.152519 )
						if( senkou_span_a_displaced <= 125.101 )
							if( kinjun_sen <= 122.823 )
								if( basis_max <= 0.12331 )
									ret := 0.717262 // buy
								if( basis_max > 0.12331 )
									ret := 0.166667
							if( kinjun_sen > 122.823 )
								if( basis_max <= -0.225217 )
									ret := 0.384615
								if( basis_max > -0.225217 )
									ret := 0.939394 // buy
						if( senkou_span_a_displaced > 125.101 )
							if( senkou_span_b <= 124.103 )
								ret := 1.000000 // buy
							if( senkou_span_b > 124.103 )
								if( senkou_span_b <= 124.771 )
									ret := -0.769231 // sell
								if( senkou_span_b > 124.771 )
									ret := -0.076923
					if( basis_max > 0.152519 )
						if( chinkou_span <= 126.48 )
							if( senkou_span_a_displaced <= 127.295 )
								if( kinjun_sen <= 122.151 )
									ret := 0.800000 // buy
								if( kinjun_sen > 122.151 )
									ret := 0.939891 // buy
							if( senkou_span_a_displaced > 127.295 )
								ret := 0.695652
						if( chinkou_span > 126.48 )
							if( tenkan_sen <= 123.302 )
								if( senkou_span_a_displaced <= 124.353 )
									ret := 0.620690
								if( senkou_span_a_displaced > 124.353 )
									ret := 1.000000 // buy
							if( tenkan_sen > 123.302 )
								ret := 0.388889
			if( tenkan_sen > 124.41 )
				if( basis_minus <= -0.413115 )
					if( kinjun_sen <= 124.454 )
						ret := -0.739130 // sell
					if( kinjun_sen > 124.454 )
						if( kinjun_sen <= 125.854 )
							if( senkou_span_a_displaced <= 126.192 )
								if( basis_minus <= -1.01937 )
									ret := 0.892857 // buy
								if( basis_minus > -1.01937 )
									ret := 0.466667
							if( senkou_span_a_displaced > 126.192 )
								if( basis_minus <= -1.04125 )
									ret := 0.346154
								if( basis_minus > -1.04125 )
									ret := -0.166667
						if( kinjun_sen > 125.854 )
							ret := -0.555556
				if( basis_minus > -0.413115 )
					if( senkou_span_b <= 122.885 )
						if( tenkan_sen <= 124.575 )
							ret := -0.466667
						if( tenkan_sen > 124.575 )
							ret := 0.153846
					if( senkou_span_b > 122.885 )
						if( senkou_span_b <= 124.695 )
							if( chinkou_span <= 125.485 )
								ret := 0.041667
							if( chinkou_span > 125.485 )
								if( kinjun_sen <= 124.738 )
									ret := 0.737226 // buy
								if( kinjun_sen > 124.738 )
									ret := 0.339623
						if( senkou_span_b > 124.695 )
							if( senkou_span_a <= 124.813 )
								ret := 0.818182 // buy
							if( senkou_span_a > 124.813 )
								if( kinjun_sen <= 125.28 )
									ret := 1.000000 // buy
								if( kinjun_sen > 125.28 )
									ret := 0.944444 // buy
		if( tenkan_sen > 124.963 )
			if( tenkan_sen <= 126.594 )
				if( basis_minus <= -1.92309 )
					if( senkou_span_a_displaced <= 128.299 )
						ret := 0.600000
					if( senkou_span_a_displaced > 128.299 )
						if( tenkan_sen <= 125.087 )
							ret := 0.875000 // buy
						if( tenkan_sen > 125.087 )
							ret := 1.000000 // buy
				if( basis_minus > -1.92309 )
					if( senkou_span_a_displaced <= 130.11 )
						if( chinkou_span <= 128.21 )
							if( senkou_span_a <= 124.602 )
								if( senkou_span_b <= 123.581 )
									ret := 1.000000 // buy
								if( senkou_span_b > 123.581 )
									ret := 0.818182 // buy
							if( senkou_span_a > 124.602 )
								if( basis_minus <= -0.542403 )
									ret := -0.126904
								if( basis_minus > -0.542403 )
									ret := 0.123089
						if( chinkou_span > 128.21 )
							if( senkou_span_b <= 125.125 )
								if( basis_max <= -0.118928 )
									ret := 0.406593
								if( basis_max > -0.118928 )
									ret := -0.625000
							if( senkou_span_b > 125.125 )
								if( chinkou_span <= 128.494 )
									ret := 0.657534
								if( chinkou_span > 128.494 )
									ret := 0.875000 // buy
					if( senkou_span_a_displaced > 130.11 )
						if( kinjun_sen <= 127.509 )
							ret := 1.000000 // buy
						if( kinjun_sen > 127.509 )
							if( senkou_span_a_displaced <= 131.451 )
								ret := 0.500000
							if( senkou_span_a_displaced > 131.451 )
								ret := 1.000000 // buy
			if( tenkan_sen > 126.594 )
				if( senkou_span_a <= 169.683 )
					if( chinkou_span <= 167.04 )
						if( chinkou_span <= 126.871 )
							if( kinjun_sen <= 126.218 )
								if( senkou_span_a <= 126.409 )
									ret := 0.055556
								if( senkou_span_a > 126.409 )
									ret := 0.784314 // buy
							if( kinjun_sen > 126.218 )
								if( basis_max <= -0.205366 )
									ret := -0.705674 // sell
								if( basis_max > -0.205366 )
									ret := -0.333333
						if( chinkou_span > 126.871 )
							if( senkou_span_b <= 128.789 )
								if( senkou_span_b_displaced <= 129.303 )
									ret := 0.179907
								if( senkou_span_b_displaced > 129.303 )
									ret := 0.619835
							if( senkou_span_b > 128.789 )
								if( senkou_span_a <= 167.141 )
									ret := -0.014934
								if( senkou_span_a > 167.141 )
									ret := -0.495356
					if( chinkou_span > 167.04 )
						if( kinjun_sen <= 166.579 )
							if( senkou_span_b <= 159.465 )
								ret := -0.105263
							if( senkou_span_b > 159.465 )
								if( basis_minus <= 0.265041 )
									ret := 0.803468 // buy
								if( basis_minus > 0.265041 )
									ret := 0.553719
						if( kinjun_sen > 166.579 )
							if( senkou_span_b_displaced <= 165.821 )
								if( tenkan_sen <= 167.977 )
									ret := 0.076923
								if( tenkan_sen > 167.977 )
									ret := -1.000000 // sell
							if( senkou_span_b_displaced > 165.821 )
								if( tenkan_sen <= 168.721 )
									ret := 0.563077
								if( tenkan_sen > 168.721 )
									ret := 0.129353
				if( senkou_span_a > 169.683 )
					if( basis_minus <= 1.35397 )
						if( chinkou_span <= 173.519 )
							if( chinkou_span <= 167.64 )
								if( kinjun_sen <= 170.107 )
									ret := -0.941176 // sell
								if( kinjun_sen > 170.107 )
									ret := -0.600000
							if( chinkou_span > 167.64 )
								if( senkou_span_a_displaced <= 170.786 )
									ret := 0.107692
								if( senkou_span_a_displaced > 170.786 )
									ret := -0.480349
						if( chinkou_span > 173.519 )
							if( senkou_span_a_displaced <= 171.86 )
								if( basis_minus <= 0.594497 )
									ret := 0.733333 // buy
								if( basis_minus > 0.594497 )
									ret := -0.956522 // sell
							if( senkou_span_a_displaced > 171.86 )
								if( senkou_span_a <= 174.976 )
									ret := 0.890110 // buy
								if( senkou_span_a > 174.976 )
									ret := 0.103448
					if( basis_minus > 1.35397 )
						if( senkou_span_b_displaced <= 166.387 )
							if( chinkou_span <= 170.939 )
								if( tenkan_sen <= 173.082 )
									ret := 0.043478
								if( tenkan_sen > 173.082 )
									ret := -0.892857 // sell
							if( chinkou_span > 170.939 )
								ret := 0.545455
						if( senkou_span_b_displaced > 166.387 )
							if( senkou_span_b_displaced <= 168.114 )
								if( senkou_span_a <= 170.701 )
									ret := -0.400000
								if( senkou_span_a > 170.701 )
									ret := -0.744681 // sell
							if( senkou_span_b_displaced > 168.114 )
								if( senkou_span_a <= 171.985 )
									ret := -0.875000 // sell
								if( senkou_span_a > 171.985 )
									ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_AAVEUSDT_5Min_0579c12e(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)

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


