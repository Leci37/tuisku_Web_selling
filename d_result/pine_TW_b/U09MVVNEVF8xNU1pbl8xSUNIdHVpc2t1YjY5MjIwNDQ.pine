//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: SOLUSDT_15Min_1ICH_b6922044 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SOLUSDT_15Min_1ICH_b6922044", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SOLUSDT_15Min_b6922044(tenkan_sen, basis_minus, cross_up_tenkan_kinjunInt, senkou_span_a, cross_dn_tenkan_kinjunInt, senkou_span_b, chinkou_span, senkou_span_a_displaced, senkou_span_b_displaced, kinjun_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( tenkan_sen <= 145.536 )
		if( chinkou_span <= 145.315 )
			if( basis_max <= -0.123134 )
				if( kinjun_sen <= 139.293 )
					if( senkou_span_b <= 64.7525 )
						if( basis_minus <= 1.6529 )
							if( chinkou_span <= 22.225 )
								if( senkou_span_b_displaced <= 21.3775 )
									ret := -0.179283
								if( senkou_span_b_displaced > 21.3775 )
									ret := -0.795699 // sell
							if( chinkou_span > 22.225 )
								if( senkou_span_a <= 24.4318 )
									ret := 0.271261
								if( senkou_span_a > 24.4318 )
									ret := -0.068691
						if( basis_minus > 1.6529 )
							if( chinkou_span <= 54.415 )
								if( basis_max <= -0.398926 )
									ret := -0.875000 // sell
								if( basis_max > -0.398926 )
									ret := -0.445783
							if( chinkou_span > 54.415 )
								if( senkou_span_a_displaced <= 47.4378 )
									ret := 1.000000 // buy
								if( senkou_span_a_displaced > 47.4378 )
									ret := -0.597222
					if( senkou_span_b > 64.7525 )
						if( senkou_span_a_displaced <= 66.8078 )
							if( tenkan_sen <= 69.955 )
								if( kinjun_sen <= 66.0448 )
									ret := 0.888889 // buy
								if( kinjun_sen > 66.0448 )
									ret := 0.610294
							if( tenkan_sen > 69.955 )
								ret := -0.941176 // sell
						if( senkou_span_a_displaced > 66.8078 )
							if( basis_max <= -2.495 )
								if( tenkan_sen <= 132.15 )
									ret := 0.044444
								if( tenkan_sen > 132.15 )
									ret := -0.773810 // sell
							if( basis_max > -2.495 )
								if( chinkou_span <= 137.195 )
									ret := -0.040512
								if( chinkou_span > 137.195 )
									ret := 0.313327
				if( kinjun_sen > 139.293 )
					if( senkou_span_b_displaced <= 134.938 )
						if( tenkan_sen <= 140.984 )
							ret := 0.000000
						if( tenkan_sen > 140.984 )
							if( senkou_span_a_displaced <= 137.893 )
								if( kinjun_sen <= 139.883 )
									ret := -0.888889 // sell
								if( kinjun_sen > 139.883 )
									ret := -1.000000 // sell
							if( senkou_span_a_displaced > 137.893 )
								ret := -0.666667
					if( senkou_span_b_displaced > 134.938 )
						if( chinkou_span <= 138.352 )
							if( senkou_span_a <= 143.973 )
								if( senkou_span_a_displaced <= 142.536 )
									ret := -0.755102 // sell
								if( senkou_span_a_displaced > 142.536 )
									ret := -0.277778
							if( senkou_span_a > 143.973 )
								ret := -1.000000 // sell
						if( chinkou_span > 138.352 )
							if( kinjun_sen <= 140.155 )
								if( senkou_span_b_displaced <= 142.405 )
									ret := 0.115789
								if( senkou_span_b_displaced > 142.405 )
									ret := -0.888889 // sell
							if( kinjun_sen > 140.155 )
								if( basis_minus <= -3.47576 )
									ret := 0.937500 // buy
								if( basis_minus > -3.47576 )
									ret := -0.192211
			if( basis_max > -0.123134 )
				if( basis_max <= 0.694232 )
					if( senkou_span_b <= 132.777 )
						if( chinkou_span <= 130.676 )
							if( tenkan_sen <= 129.48 )
								if( senkou_span_a <= 112.082 )
									ret := 0.023075
								if( senkou_span_a > 112.082 )
									ret := -0.141350
							if( tenkan_sen > 129.48 )
								if( senkou_span_a_displaced <= 129.075 )
									ret := -0.827586 // sell
								if( senkou_span_a_displaced > 129.075 )
									ret := -0.383764
						if( chinkou_span > 130.676 )
							if( chinkou_span <= 136.251 )
								if( kinjun_sen <= 128.807 )
									ret := 0.821705 // buy
								if( kinjun_sen > 128.807 )
									ret := 0.319149
							if( chinkou_span > 136.251 )
								if( senkou_span_a_displaced <= 130.967 )
									ret := 0.682927
								if( senkou_span_a_displaced > 130.967 )
									ret := 0.979167 // buy
					if( senkou_span_b > 132.777 )
						if( senkou_span_b_displaced <= 150.081 )
							if( senkou_span_a <= 143.768 )
								if( chinkou_span <= 137.289 )
									ret := -0.269536
								if( chinkou_span > 137.289 )
									ret := 0.126488
							if( senkou_span_a > 143.768 )
								if( tenkan_sen <= 143.496 )
									ret := -0.666667
								if( tenkan_sen > 143.496 )
									ret := -0.290135
						if( senkou_span_b_displaced > 150.081 )
							if( senkou_span_b_displaced <= 150.428 )
								ret := 1.000000 // buy
							if( senkou_span_b_displaced > 150.428 )
								ret := 0.000000
				if( basis_max > 0.694232 )
					if( tenkan_sen <= 89.405 )
						if( kinjun_sen <= 90.9225 )
							if( kinjun_sen <= 88.721 )
								if( senkou_span_a <= 86.2191 )
									ret := 0.064422
								if( senkou_span_a > 86.2191 )
									ret := -0.939394 // sell
							if( kinjun_sen > 88.721 )
								if( chinkou_span <= 89.9874 )
									ret := 0.500000
								if( chinkou_span > 89.9874 )
									ret := 1.000000 // buy
						if( kinjun_sen > 90.9225 )
							ret := -1.000000 // sell
					if( tenkan_sen > 89.405 )
						if( senkou_span_b <= 97.4492 )
							if( chinkou_span <= 91.413 )
								ret := -0.272727
							if( chinkou_span > 91.413 )
								if( senkou_span_b_displaced <= 93.3598 )
									ret := 0.482759
								if( senkou_span_b_displaced > 93.3598 )
									ret := 0.866071 // buy
						if( senkou_span_b > 97.4492 )
							if( senkou_span_a <= 98.0775 )
								if( basis_max <= 0.95875 )
									ret := 0.108108
								if( basis_max > 0.95875 )
									ret := -1.000000 // sell
							if( senkou_span_a > 98.0775 )
								if( senkou_span_b <= 128.796 )
									ret := 0.408124
								if( senkou_span_b > 128.796 )
									ret := 0.117435
		if( chinkou_span > 145.315 )
			if( kinjun_sen <= 142.365 )
				if( senkou_span_a <= 140.746 )
					if( senkou_span_b_displaced <= 144.896 )
						if( senkou_span_b <= 139.544 )
							if( senkou_span_b <= 139.156 )
								if( kinjun_sen <= 139.801 )
									ret := 0.640449
								if( kinjun_sen > 139.801 )
									ret := 0.142857
							if( senkou_span_b > 139.156 )
								ret := -0.187500
						if( senkou_span_b > 139.544 )
							if( basis_minus <= -0.440558 )
								if( tenkan_sen <= 139.591 )
									ret := 0.975610 // buy
								if( tenkan_sen > 139.591 )
									ret := -0.090909
							if( basis_minus > -0.440558 )
								ret := 1.000000 // buy
					if( senkou_span_b_displaced > 144.896 )
						if( chinkou_span <= 147.749 )
							ret := -1.000000 // sell
						if( chinkou_span > 147.749 )
							ret := -0.166667
				if( senkou_span_a > 140.746 )
					if( senkou_span_a_displaced <= 142.024 )
						if( senkou_span_a <= 141.038 )
							ret := 0.000000
						if( senkou_span_a > 141.038 )
							if( senkou_span_a_displaced <= 140.519 )
								if( senkou_span_b <= 142.118 )
									ret := 0.833333 // buy
								if( senkou_span_b > 142.118 )
									ret := 0.461538
							if( senkou_span_a_displaced > 140.519 )
								ret := 0.368421
					if( senkou_span_a_displaced > 142.024 )
						if( basis_max <= -0.083833 )
							if( senkou_span_a_displaced <= 143.378 )
								if( basis_minus <= -0.295 )
									ret := 1.000000 // buy
								if( basis_minus > -0.295 )
									ret := 0.764706 // buy
							if( senkou_span_a_displaced > 143.378 )
								ret := 0.545455
						if( basis_max > -0.083833 )
							if( kinjun_sen <= 142.16 )
								if( basis_minus <= -1.04617 )
									ret := 1.000000 // buy
								if( basis_minus > -1.04617 )
									ret := 0.882353 // buy
							if( kinjun_sen > 142.16 )
								ret := 1.000000 // buy
			if( kinjun_sen > 142.365 )
				if( senkou_span_b_displaced <= 139.792 )
					if( senkou_span_b <= 142.857 )
						if( senkou_span_a <= 143.368 )
							ret := 0.266667
						if( senkou_span_a > 143.368 )
							ret := -0.250000
					if( senkou_span_b > 142.857 )
						ret := -0.933333 // sell
				if( senkou_span_b_displaced > 139.792 )
					if( senkou_span_b_displaced <= 150.32 )
						if( chinkou_span <= 149.492 )
							if( senkou_span_b <= 143.162 )
								if( kinjun_sen <= 142.969 )
									ret := 0.096774
								if( kinjun_sen > 142.969 )
									ret := -0.365854
							if( senkou_span_b > 143.162 )
								if( senkou_span_b_displaced <= 147.451 )
									ret := 0.320847
								if( senkou_span_b_displaced > 147.451 )
									ret := 0.753086 // buy
						if( chinkou_span > 149.492 )
							if( senkou_span_b <= 142.364 )
								ret := 0.000000
							if( senkou_span_b > 142.364 )
								if( chinkou_span <= 153.273 )
									ret := 0.820106 // buy
								if( chinkou_span > 153.273 )
									ret := 0.958904 // buy
					if( senkou_span_b_displaced > 150.32 )
						if( chinkou_span <= 146.826 )
							ret := 0.058824
						if( chinkou_span > 146.826 )
							if( senkou_span_a <= 145.504 )
								ret := -0.615385
							if( senkou_span_a > 145.504 )
								ret := 0.000000
	if( tenkan_sen > 145.536 )
		if( chinkou_span <= 144.586 )
			if( senkou_span_a <= 146.23 )
				if( senkou_span_a_displaced <= 144.563 )
					if( senkou_span_b_displaced <= 143.96 )
						if( senkou_span_b <= 142.575 )
							ret := -0.772727 // sell
						if( senkou_span_b > 142.575 )
							if( senkou_span_a_displaced <= 143.469 )
								ret := -1.000000 // sell
							if( senkou_span_a_displaced > 143.469 )
								ret := -0.875000 // sell
					if( senkou_span_b_displaced > 143.96 )
						ret := -0.380952
				if( senkou_span_a_displaced > 144.563 )
					if( chinkou_span <= 143.485 )
						if( chinkou_span <= 141.905 )
							ret := -1.000000 // sell
						if( chinkou_span > 141.905 )
							if( chinkou_span <= 142.932 )
								if( chinkou_span <= 142.664 )
									ret := -0.900000 // sell
								if( chinkou_span > 142.664 )
									ret := -0.555556
							if( chinkou_span > 142.932 )
								ret := -1.000000 // sell
					if( chinkou_span > 143.485 )
						if( senkou_span_b <= 146.202 )
							if( senkou_span_b_displaced <= 145.99 )
								ret := -0.272727
							if( senkou_span_b_displaced > 145.99 )
								ret := -0.909091 // sell
						if( senkou_span_b > 146.202 )
							if( tenkan_sen <= 145.726 )
								ret := -1.000000 // sell
							if( tenkan_sen > 145.726 )
								ret := -0.923077 // sell
			if( senkou_span_a > 146.23 )
				if( kinjun_sen <= 146.674 )
					if( tenkan_sen <= 146.14 )
						ret := 0.818182 // buy
					if( tenkan_sen > 146.14 )
						if( basis_minus <= 0.418822 )
							if( basis_max <= -0.005 )
								if( basis_minus <= 0.17875 )
									ret := -0.095238
								if( basis_minus > 0.17875 )
									ret := 0.000000
							if( basis_max > -0.005 )
								ret := -0.461538
						if( basis_minus > 0.418822 )
							if( senkou_span_b <= 145.899 )
								if( basis_minus <= 1.28375 )
									ret := -0.333333
								if( basis_minus > 1.28375 )
									ret := -0.500000
							if( senkou_span_b > 145.899 )
								if( chinkou_span <= 144.055 )
									ret := -1.000000 // sell
								if( chinkou_span > 144.055 )
									ret := -0.777778 // sell
				if( kinjun_sen > 146.674 )
					if( chinkou_span <= 143.28 )
						if( chinkou_span <= 131.905 )
							ret := -0.526316
						if( chinkou_span > 131.905 )
							if( senkou_span_b_displaced <= 155.105 )
								if( chinkou_span <= 140.718 )
									ret := -0.949153 // sell
								if( chinkou_span > 140.718 )
									ret := -0.795812 // sell
							if( senkou_span_b_displaced > 155.105 )
								ret := -0.300000
					if( chinkou_span > 143.28 )
						if( chinkou_span <= 143.331 )
							ret := 0.300000
						if( chinkou_span > 143.331 )
							if( senkou_span_a_displaced <= 144.676 )
								ret := 0.000000
							if( senkou_span_a_displaced > 144.676 )
								if( basis_max <= -0.182536 )
									ret := -0.925373 // sell
								if( basis_max > -0.182536 )
									ret := -0.639405
		if( chinkou_span > 144.586 )
			if( tenkan_sen <= 185.59 )
				if( senkou_span_a_displaced <= 146.403 )
					if( senkou_span_b <= 146.882 )
						if( senkou_span_a <= 146.722 )
							if( senkou_span_a <= 145.78 )
								if( chinkou_span <= 152.46 )
									ret := 0.122302
								if( chinkou_span > 152.46 )
									ret := -1.000000 // sell
							if( senkou_span_a > 145.78 )
								if( senkou_span_b <= 143.738 )
									ret := 0.081081
								if( senkou_span_b > 143.738 )
									ret := 0.517647
						if( senkou_span_a > 146.722 )
							if( basis_minus <= 5.42185 )
								if( basis_minus <= 4.29775 )
									ret := -0.003810
								if( basis_minus > 4.29775 )
									ret := -0.673077
							if( basis_minus > 5.42185 )
								ret := 1.000000 // buy
					if( senkou_span_b > 146.882 )
						if( chinkou_span <= 150.345 )
							if( basis_max <= -0.10125 )
								if( chinkou_span <= 146.715 )
									ret := -0.714286 // sell
								if( chinkou_span > 146.715 )
									ret := 0.000000
							if( basis_max > -0.10125 )
								ret := 0.750000 // buy
						if( chinkou_span > 150.345 )
							if( kinjun_sen <= 148.43 )
								if( basis_max <= -0.491317 )
									ret := 0.760000 // buy
								if( basis_max > -0.491317 )
									ret := 0.914286 // buy
							if( kinjun_sen > 148.43 )
								if( chinkou_span <= 152.991 )
									ret := 0.606061
								if( chinkou_span > 152.991 )
									ret := 0.021277
				if( senkou_span_a_displaced > 146.403 )
					if( senkou_span_b_displaced <= 173.565 )
						if( senkou_span_a_displaced <= 174.978 )
							if( kinjun_sen <= 161.817 )
								if( senkou_span_b_displaced <= 153.513 )
									ret := 0.044952
								if( senkou_span_b_displaced > 153.513 )
									ret := -0.131304
							if( kinjun_sen > 161.817 )
								if( senkou_span_b_displaced <= 168.905 )
									ret := -0.052040
								if( senkou_span_b_displaced > 168.905 )
									ret := 0.157702
						if( senkou_span_a_displaced > 174.978 )
							if( senkou_span_a <= 180.17 )
								if( basis_max <= 1.45924 )
									ret := 0.608333
								if( basis_max > 1.45924 )
									ret := 0.944444 // buy
							if( senkou_span_a > 180.17 )
								ret := -0.333333
					if( senkou_span_b_displaced > 173.565 )
						if( kinjun_sen <= 182.917 )
							if( senkou_span_a_displaced <= 169.062 )
								if( senkou_span_b_displaced <= 174.318 )
									ret := -1.000000 // sell
								if( senkou_span_b_displaced > 174.318 )
									ret := -0.666667
							if( senkou_span_a_displaced > 169.062 )
								if( basis_minus <= -4.68875 )
									ret := 0.466667
								if( basis_minus > -4.68875 )
									ret := -0.181076
						if( kinjun_sen > 182.917 )
							if( chinkou_span <= 186.19 )
								if( tenkan_sen <= 181.592 )
									ret := 0.692308
								if( tenkan_sen > 181.592 )
									ret := -0.056235
							if( chinkou_span > 186.19 )
								if( basis_minus <= 1.385 )
									ret := 0.744444 // buy
								if( basis_minus > 1.385 )
									ret := 0.035714
			if( tenkan_sen > 185.59 )
				if( basis_minus <= 0.355491 )
					if( chinkou_span <= 187.744 )
						if( senkou_span_b_displaced <= 181.356 )
							if( senkou_span_b <= 190.158 )
								ret := 0.615385
							if( senkou_span_b > 190.158 )
								ret := 0.100000
						if( senkou_span_b_displaced > 181.356 )
							if( chinkou_span <= 183.14 )
								if( tenkan_sen <= 187.733 )
									ret := -0.211765
								if( tenkan_sen > 187.733 )
									ret := -0.745763 // sell
							if( chinkou_span > 183.14 )
								if( tenkan_sen <= 185.661 )
									ret := -0.473684
								if( tenkan_sen > 185.661 )
									ret := -0.828685 // sell
					if( chinkou_span > 187.744 )
						if( tenkan_sen <= 190.878 )
							if( kinjun_sen <= 186.907 )
								if( senkou_span_a_displaced <= 186.033 )
									ret := -0.473684
								if( senkou_span_a_displaced > 186.033 )
									ret := 0.777778 // buy
							if( kinjun_sen > 186.907 )
								if( senkou_span_b <= 190.963 )
									ret := -0.333333
								if( senkou_span_b > 190.963 )
									ret := 0.619048
						if( tenkan_sen > 190.878 )
							if( senkou_span_b_displaced <= 201.945 )
								if( chinkou_span <= 193.855 )
									ret := -0.775281 // sell
								if( chinkou_span > 193.855 )
									ret := -0.186275
							if( senkou_span_b_displaced > 201.945 )
								ret := 0.428571
				if( basis_minus > 0.355491 )
					if( basis_max <= 0.567774 )
						if( senkou_span_b_displaced <= 182.165 )
							if( chinkou_span <= 191.027 )
								if( basis_max <= -1.2425 )
									ret := 0.250000
								if( basis_max > -1.2425 )
									ret := -0.540230
							if( chinkou_span > 191.027 )
								if( senkou_span_a_displaced <= 182.934 )
									ret := 0.951807 // buy
								if( senkou_span_a_displaced > 182.934 )
									ret := 0.176471
						if( senkou_span_b_displaced > 182.165 )
							if( senkou_span_b <= 185.905 )
								if( kinjun_sen <= 188.063 )
									ret := -0.492647
								if( kinjun_sen > 188.063 )
									ret := 0.500000
							if( senkou_span_b > 185.905 )
								if( senkou_span_a_displaced <= 199.332 )
									ret := -0.016234
								if( senkou_span_a_displaced > 199.332 )
									ret := -0.455882
					if( basis_max > 0.567774 )
						if( basis_max <= 0.7225 )
							ret := 0.933333 // buy
						if( basis_max > 0.7225 )
							if( senkou_span_b <= 190.3 )
								ret := 0.555556
							if( senkou_span_b > 190.3 )
								ret := 0.727273 // buy
	
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
float op_operation = decision_tree_0_SOLUSDT_15Min_b6922044(tenkan_sen, basis_minus, cross_up_tenkan_kinjunInt, senkou_span_a, cross_dn_tenkan_kinjunInt, senkou_span_b, chinkou_span, senkou_span_a_displaced, senkou_span_b_displaced, kinjun_sen, basis_max)

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


