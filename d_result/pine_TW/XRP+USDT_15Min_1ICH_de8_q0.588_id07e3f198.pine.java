//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: XRPUSDT_15Min_1ICH_07e3f198 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XRPUSDT_15Min_1ICH_07e3f198", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XRPUSDT_15Min_07e3f198(basis_minus, senkou_span_b, cross_dn_tenkan_kinjunInt, cross_up_tenkan_kinjunInt, kinjun_sen, tenkan_sen, senkou_span_b_displaced, senkou_span_a, senkou_span_a_displaced, basis_max, chinkou_span)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( basis_minus <= 0.002677 )
		if( kinjun_sen <= 0.620762 )
			if( chinkou_span <= 0.607802 )
				if( tenkan_sen <= 0.598968 )
					if( kinjun_sen <= 0.315153 )
						if( basis_max <= -0.000345 )
							if( senkou_span_b_displaced <= 0.315996 )
								if( senkou_span_a <= 0.313931 )
									ret := -0.378698
								if( senkou_span_a > 0.313931 )
									ret := 0.580645
							if( senkou_span_b_displaced > 0.315996 )
								if( kinjun_sen <= 0.313359 )
									ret := 0.682540
								if( kinjun_sen > 0.313359 )
									ret := -0.285714
						if( basis_max > -0.000345 )
							if( senkou_span_b_displaced <= 0.325725 )
								if( basis_minus <= -0.003037 )
									ret := 0.159817
								if( basis_minus > -0.003037 )
									ret := 0.622340
							if( senkou_span_b_displaced > 0.325725 )
								if( basis_max <= 0.000534 )
									ret := 0.000000
								if( basis_max > 0.000534 )
									ret := -1.000000 // sell
					if( kinjun_sen > 0.315153 )
						if( senkou_span_a_displaced <= 0.316642 )
							if( kinjun_sen <= 0.3199 )
								if( basis_minus <= -0.000656 )
									ret := -0.894737 // sell
								if( basis_minus > -0.000656 )
									ret := -0.409938
							if( kinjun_sen > 0.3199 )
								ret := 0.294118
						if( senkou_span_a_displaced > 0.316642 )
							if( basis_max <= 0.001058 )
								if( senkou_span_a <= 0.524284 )
									ret := 0.014705
								if( senkou_span_a > 0.524284 )
									ret := -0.061812
							if( basis_max > 0.001058 )
								if( tenkan_sen <= 0.545398 )
									ret := 0.097621
								if( tenkan_sen > 0.545398 )
									ret := 0.232329
				if( tenkan_sen > 0.598968 )
					if( senkou_span_b_displaced <= 0.587975 )
						if( basis_minus <= 0.001738 )
							if( senkou_span_a_displaced <= 0.596865 )
								ret := 0.615385
							if( senkou_span_a_displaced > 0.596865 )
								ret := 1.000000 // buy
						if( basis_minus > 0.001738 )
							ret := -0.526316
					if( senkou_span_b_displaced > 0.587975 )
						if( senkou_span_b_displaced <= 0.592998 )
							if( tenkan_sen <= 0.599936 )
								if( senkou_span_b <= 0.597615 )
									ret := -0.714286 // sell
								if( senkou_span_b > 0.597615 )
									ret := -1.000000 // sell
							if( tenkan_sen > 0.599936 )
								ret := -1.000000 // sell
						if( senkou_span_b_displaced > 0.592998 )
							if( basis_minus <= -0.010376 )
								if( tenkan_sen <= 0.606286 )
									ret := -0.968750 // sell
								if( tenkan_sen > 0.606286 )
									ret := -0.636364
							if( basis_minus > -0.010376 )
								if( basis_minus <= -0.009688 )
									ret := 0.833333 // buy
								if( basis_minus > -0.009688 )
									ret := -0.349315
			if( chinkou_span > 0.607802 )
				if( senkou_span_b_displaced <= 0.599153 )
					if( basis_max <= -0.002188 )
						if( basis_minus <= -0.009874 )
							ret := 0.538462
						if( basis_minus > -0.009874 )
							ret := -0.444444
					if( basis_max > -0.002188 )
						if( tenkan_sen <= 0.58895 )
							if( senkou_span_a <= 0.57911 )
								if( senkou_span_b <= 0.566428 )
									ret := 0.896552 // buy
								if( senkou_span_b > 0.566428 )
									ret := -0.181818
							if( senkou_span_a > 0.57911 )
								ret := 1.000000 // buy
						if( tenkan_sen > 0.58895 )
							if( senkou_span_a_displaced <= 0.588838 )
								if( senkou_span_b <= 0.592013 )
									ret := 0.250000
								if( senkou_span_b > 0.592013 )
									ret := -0.400000
							if( senkou_span_a_displaced > 0.588838 )
								if( senkou_span_b <= 0.5932 )
									ret := 0.227273
								if( senkou_span_b > 0.5932 )
									ret := 0.799228 // buy
				if( senkou_span_b_displaced > 0.599153 )
					if( senkou_span_a <= 0.606623 )
						if( basis_max <= -0.002947 )
							if( chinkou_span <= 0.61085 )
								if( basis_max <= -0.003632 )
									ret := -1.000000 // sell
								if( basis_max > -0.003632 )
									ret := -0.777778 // sell
							if( chinkou_span > 0.61085 )
								if( basis_minus <= -0.0026 )
									ret := -0.800000 // sell
								if( basis_minus > -0.0026 )
									ret := -0.050000
						if( basis_max > -0.002947 )
							if( senkou_span_b_displaced <= 0.605903 )
								if( basis_minus <= -0.002437 )
									ret := 0.852459 // buy
								if( basis_minus > -0.002437 )
									ret := 0.261146
							if( senkou_span_b_displaced > 0.605903 )
								if( chinkou_span <= 0.62575 )
									ret := 0.730290 // buy
								if( chinkou_span > 0.62575 )
									ret := -0.142857
					if( senkou_span_a > 0.606623 )
						if( chinkou_span <= 0.617903 )
							if( tenkan_sen <= 0.616842 )
								if( kinjun_sen <= 0.605637 )
									ret := -0.945946 // sell
								if( kinjun_sen > 0.605637 )
									ret := 0.014559
							if( tenkan_sen > 0.616842 )
								if( basis_max <= -0.002463 )
									ret := 0.416667
								if( basis_max > -0.002463 )
									ret := -0.325153
						if( chinkou_span > 0.617903 )
							if( kinjun_sen <= 0.618743 )
								if( basis_max <= 0.000617 )
									ret := 0.303241
								if( basis_max > 0.000617 )
									ret := 0.602667
							if( kinjun_sen > 0.618743 )
								if( basis_minus <= -0.001995 )
									ret := -0.279070
								if( basis_minus > -0.001995 )
									ret := 0.275081
		if( kinjun_sen > 0.620762 )
			if( senkou_span_a_displaced <= 0.65102 )
				if( chinkou_span <= 0.613261 )
					if( senkou_span_b <= 0.621462 )
						if( senkou_span_a <= 0.618625 )
							ret := 1.000000 // buy
						if( senkou_span_a > 0.618625 )
							if( basis_minus <= 0.001344 )
								if( senkou_span_b_displaced <= 0.611675 )
									ret := -1.000000 // sell
								if( senkou_span_b_displaced > 0.611675 )
									ret := -0.444444
							if( basis_minus > 0.001344 )
								ret := 0.142857
					if( senkou_span_b > 0.621462 )
						if( senkou_span_b_displaced <= 0.6208 )
							if( senkou_span_b_displaced <= 0.613161 )
								if( basis_max <= 0.002232 )
									ret := -0.800000 // sell
								if( basis_max > 0.002232 )
									ret := -1.000000 // sell
							if( senkou_span_b_displaced > 0.613161 )
								if( senkou_span_a_displaced <= 0.622222 )
									ret := -0.800000 // sell
								if( senkou_span_a_displaced > 0.622222 )
									ret := -0.978022 // sell
						if( senkou_span_b_displaced > 0.6208 )
							if( chinkou_span <= 0.600083 )
								if( basis_max <= -0.000246 )
									ret := -0.689655
								if( basis_max > -0.000246 )
									ret := -0.936508 // sell
							if( chinkou_span > 0.600083 )
								if( senkou_span_b <= 0.622929 )
									ret := -0.181818
								if( senkou_span_b > 0.622929 )
									ret := -0.709091 // sell
				if( chinkou_span > 0.613261 )
					if( chinkou_span <= 0.638992 )
						if( senkou_span_a <= 0.635078 )
							if( kinjun_sen <= 0.636275 )
								if( senkou_span_a <= 0.621349 )
									ret := 0.306034
								if( senkou_span_a > 0.621349 )
									ret := -0.096284
							if( kinjun_sen > 0.636275 )
								if( senkou_span_b_displaced <= 0.636325 )
									ret := 0.901639 // buy
								if( senkou_span_b_displaced > 0.636325 )
									ret := 0.465116
						if( senkou_span_a > 0.635078 )
							if( basis_minus <= 0.002394 )
								if( senkou_span_a_displaced <= 0.638435 )
									ret := -0.855263 // sell
								if( senkou_span_a_displaced > 0.638435 )
									ret := -0.494172
							if( basis_minus > 0.002394 )
								if( senkou_span_a <= 0.63905 )
									ret := 0.875000 // buy
								if( senkou_span_a > 0.63905 )
									ret := -0.142857
					if( chinkou_span > 0.638992 )
						if( senkou_span_a_displaced <= 0.644578 )
							if( senkou_span_a_displaced <= 0.619193 )
								if( basis_max <= -0.00102 )
									ret := -0.642857
								if( basis_max > -0.00102 )
									ret := -0.333333
							if( senkou_span_a_displaced > 0.619193 )
								if( tenkan_sen <= 0.633988 )
									ret := 0.320000
								if( tenkan_sen > 0.633988 )
									ret := 0.666667
						if( senkou_span_a_displaced > 0.644578 )
							if( basis_max <= 0.003953 )
								if( tenkan_sen <= 0.641875 )
									ret := 0.848485 // buy
								if( tenkan_sen > 0.641875 )
									ret := -0.094340
							if( basis_max > 0.003953 )
								if( tenkan_sen <= 0.665288 )
									ret := -0.888889 // sell
								if( tenkan_sen > 0.665288 )
									ret := -0.631579
			if( senkou_span_a_displaced > 0.65102 )
				if( tenkan_sen <= 0.715351 )
					if( senkou_span_b_displaced <= 0.7038 )
						if( senkou_span_a_displaced <= 0.660594 )
							if( kinjun_sen <= 0.658548 )
								if( tenkan_sen <= 0.627365 )
									ret := 0.863636 // buy
								if( tenkan_sen > 0.627365 )
									ret := 0.279683
							if( kinjun_sen > 0.658548 )
								if( senkou_span_a_displaced <= 0.657988 )
									ret := 0.307692
								if( senkou_span_a_displaced > 0.657988 )
									ret := -0.725000 // sell
						if( senkou_span_a_displaced > 0.660594 )
							if( senkou_span_a <= 0.654611 )
								if( basis_max <= 0.004889 )
									ret := -0.731183 // sell
								if( basis_max > 0.004889 )
									ret := -0.258065
							if( senkou_span_a > 0.654611 )
								if( tenkan_sen <= 0.653917 )
									ret := 0.878378 // buy
								if( tenkan_sen > 0.653917 )
									ret := -0.090347
					if( senkou_span_b_displaced > 0.7038 )
						if( basis_minus <= -0.011771 )
							if( tenkan_sen <= 0.710676 )
								if( tenkan_sen <= 0.694314 )
									ret := 0.714286 // buy
								if( tenkan_sen > 0.694314 )
									ret := 0.950000 // buy
							if( tenkan_sen > 0.710676 )
								ret := 0.500000
						if( basis_minus > -0.011771 )
							if( chinkou_span <= 0.713581 )
								if( senkou_span_a <= 0.695921 )
									ret := 0.686047
								if( senkou_span_a > 0.695921 )
									ret := 0.117302
							if( chinkou_span > 0.713581 )
								if( senkou_span_a <= 0.715798 )
									ret := 0.563025
								if( senkou_span_a > 0.715798 )
									ret := 0.958333 // buy
				if( tenkan_sen > 0.715351 )
					if( senkou_span_b <= 0.714597 )
						ret := 1.000000 // buy
					if( senkou_span_b > 0.714597 )
						if( chinkou_span <= 0.736094 )
							if( senkou_span_b <= 0.766364 )
								if( senkou_span_a_displaced <= 0.763475 )
									ret := -0.639665
								if( senkou_span_a_displaced > 0.763475 )
									ret := 0.142857
							if( senkou_span_b > 0.766364 )
								ret := -1.000000 // sell
						if( chinkou_span > 0.736094 )
							if( kinjun_sen <= 0.744981 )
								if( basis_max <= -0.001806 )
									ret := -0.210526
								if( basis_max > -0.001806 )
									ret := 0.637838
							if( kinjun_sen > 0.744981 )
								if( kinjun_sen <= 0.761441 )
									ret := -0.739583 // sell
								if( kinjun_sen > 0.761441 )
									ret := -0.130769
	if( basis_minus > 0.002677 )
		if( senkou_span_b_displaced <= 0.318744 )
			if( senkou_span_a_displaced <= 0.3099 )
				if( chinkou_span <= 0.30655 )
					if( tenkan_sen <= 0.308389 )
						ret := -0.944444 // sell
					if( tenkan_sen > 0.308389 )
						ret := -0.866667 // sell
				if( chinkou_span > 0.30655 )
					if( senkou_span_a_displaced <= 0.304713 )
						if( chinkou_span <= 0.313437 )
							ret := -0.384615
						if( chinkou_span > 0.313437 )
							if( senkou_span_a_displaced <= 0.30336 )
								ret := -0.272727
							if( senkou_span_a_displaced > 0.30336 )
								ret := 1.000000 // buy
					if( senkou_span_a_displaced > 0.304713 )
						if( senkou_span_b <= 0.310281 )
							ret := 0.100000
						if( senkou_span_b > 0.310281 )
							if( senkou_span_b <= 0.317363 )
								ret := -1.000000 // sell
							if( senkou_span_b > 0.317363 )
								ret := -0.842105 // sell
			if( senkou_span_a_displaced > 0.3099 )
				if( senkou_span_a <= 0.329213 )
					if( senkou_span_b <= 0.313303 )
						if( chinkou_span <= 0.313436 )
							ret := 0.727273 // buy
						if( chinkou_span > 0.313436 )
							if( tenkan_sen <= 0.31348 )
								ret := 0.850000 // buy
							if( tenkan_sen > 0.31348 )
								if( senkou_span_a_displaced <= 0.310615 )
									ret := 0.800000 // buy
								if( senkou_span_a_displaced > 0.310615 )
									ret := 1.000000 // buy
					if( senkou_span_b > 0.313303 )
						if( senkou_span_b <= 0.314675 )
							if( basis_minus <= 0.003246 )
								ret := -0.950000 // sell
							if( basis_minus > 0.003246 )
								ret := 0.000000
						if( senkou_span_b > 0.314675 )
							if( senkou_span_b_displaced <= 0.309475 )
								ret := -0.214286
							if( senkou_span_b_displaced > 0.309475 )
								if( basis_max <= -1e-06 )
									ret := 0.698980
								if( basis_max > -1e-06 )
									ret := -0.071429
				if( senkou_span_a > 0.329213 )
					if( basis_max <= -0.004348 )
						ret := -1.000000 // sell
					if( basis_max > -0.004348 )
						if( tenkan_sen <= 0.335695 )
							ret := -1.000000 // sell
						if( tenkan_sen > 0.335695 )
							ret := -0.272727
		if( senkou_span_b_displaced > 0.318744 )
			if( chinkou_span <= 0.326487 )
				if( senkou_span_b_displaced <= 0.319648 )
					if( tenkan_sen <= 0.33372 )
						ret := -1.000000 // sell
					if( tenkan_sen > 0.33372 )
						ret := -0.857143 // sell
				if( senkou_span_b_displaced > 0.319648 )
					if( chinkou_span <= 0.323669 )
						if( tenkan_sen <= 0.327325 )
							if( senkou_span_a <= 0.32441 )
								if( senkou_span_a_displaced <= 0.31713 )
									ret := -0.882353 // sell
								if( senkou_span_a_displaced > 0.31713 )
									ret := -0.965517 // sell
							if( senkou_span_a > 0.32441 )
								ret := -0.625000
						if( tenkan_sen > 0.327325 )
							if( chinkou_span <= 0.318023 )
								ret := -0.928571 // sell
							if( chinkou_span > 0.318023 )
								ret := -1.000000 // sell
					if( chinkou_span > 0.323669 )
						if( senkou_span_b_displaced <= 0.321132 )
							ret := 0.000000
						if( senkou_span_b_displaced > 0.321132 )
							ret := -0.944444 // sell
			if( chinkou_span > 0.326487 )
				if( senkou_span_a <= 0.34735 )
					if( tenkan_sen <= 0.332129 )
						if( basis_minus <= 0.003227 )
							if( basis_max <= -0.000117 )
								if( senkou_span_b_displaced <= 0.321938 )
									ret := -0.562500
								if( senkou_span_b_displaced > 0.321938 )
									ret := 0.214286
							if( basis_max > -0.000117 )
								if( senkou_span_a <= 0.330392 )
									ret := 0.960000 // buy
								if( senkou_span_a > 0.330392 )
									ret := 0.625000
						if( basis_minus > 0.003227 )
							if( basis_max <= -0.003927 )
								ret := 1.000000 // buy
							if( basis_max > -0.003927 )
								if( chinkou_span <= 0.33221 )
									ret := 0.285714
								if( chinkou_span > 0.33221 )
									ret := 0.888889 // buy
					if( tenkan_sen > 0.332129 )
						if( senkou_span_b <= 0.335459 )
							if( basis_minus <= 0.008137 )
								if( chinkou_span <= 0.342168 )
									ret := -0.679803
								if( chinkou_span > 0.342168 )
									ret := 0.818182 // buy
							if( basis_minus > 0.008137 )
								if( senkou_span_b_displaced <= 0.320456 )
									ret := -0.157895
								if( senkou_span_b_displaced > 0.320456 )
									ret := 0.954545 // buy
						if( senkou_span_b > 0.335459 )
							if( chinkou_span <= 0.346221 )
								if( senkou_span_a_displaced <= 0.336962 )
									ret := 0.744444 // buy
								if( senkou_span_a_displaced > 0.336962 )
									ret := -0.320000
							if( chinkou_span > 0.346221 )
								if( senkou_span_a <= 0.341 )
									ret := 0.200000
								if( senkou_span_a > 0.341 )
									ret := 0.853659 // buy
				if( senkou_span_a > 0.34735 )
					if( senkou_span_b_displaced <= 0.491734 )
						if( kinjun_sen <= 0.492615 )
							if( chinkou_span <= 0.365096 )
								if( kinjun_sen <= 0.356432 )
									ret := -0.179775
								if( kinjun_sen > 0.356432 )
									ret := -0.555882
							if( chinkou_span > 0.365096 )
								if( tenkan_sen <= 0.3748 )
									ret := 0.235979
								if( tenkan_sen > 0.3748 )
									ret := -0.055716
						if( kinjun_sen > 0.492615 )
							if( tenkan_sen <= 0.516874 )
								if( chinkou_span <= 0.519475 )
									ret := 0.152985
								if( chinkou_span > 0.519475 )
									ret := 0.823077 // buy
							if( tenkan_sen > 0.516874 )
								if( kinjun_sen <= 0.704913 )
									ret := -0.628099
								if( kinjun_sen > 0.704913 )
									ret := 1.000000 // buy
					if( senkou_span_b_displaced > 0.491734 )
						if( senkou_span_a_displaced <= 0.546263 )
							if( senkou_span_b_displaced <= 0.53495 )
								if( kinjun_sen <= 0.546098 )
									ret := -0.145354
								if( kinjun_sen > 0.546098 )
									ret := -0.566667
							if( senkou_span_b_displaced > 0.53495 )
								if( senkou_span_b <= 0.54415 )
									ret := -0.296943
								if( senkou_span_b > 0.54415 )
									ret := -0.744898 // sell
						if( senkou_span_a_displaced > 0.546263 )
							if( tenkan_sen <= 0.621808 )
								if( basis_max <= -0.002544 )
									ret := -0.179464
								if( basis_max > -0.002544 )
									ret := 0.087772
							if( tenkan_sen > 0.621808 )
								if( kinjun_sen <= 0.622197 )
									ret := -0.448980
								if( kinjun_sen > 0.622197 )
									ret := -0.103386
	
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
float op_operation = decision_tree_0_XRPUSDT_15Min_07e3f198(basis_minus, senkou_span_b, cross_dn_tenkan_kinjunInt, cross_up_tenkan_kinjunInt, kinjun_sen, tenkan_sen, senkou_span_b_displaced, senkou_span_a, senkou_span_a_displaced, basis_max, chinkou_span)

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


