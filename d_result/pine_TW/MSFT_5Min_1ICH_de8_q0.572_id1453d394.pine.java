//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: MSFT_5Min_1ICH_1453d394 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_5Min_1ICH_1453d394", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_5Min_1453d394(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( basis_max <= -0.603987 )
		if( chinkou_span <= 419.528 )
			if( senkou_span_a <= 407.976 )
				if( chinkou_span <= 405.9 )
					if( senkou_span_a_displaced <= 277.181 )
						if( kinjun_sen <= 283.387 )
							if( chinkou_span <= 298.82 )
								ret := 1.000000 // buy
							if( chinkou_span > 298.82 )
								ret := 0.750000 // buy
						if( kinjun_sen > 283.387 )
							ret := 0.500000
					if( senkou_span_a_displaced > 277.181 )
						if( tenkan_sen <= 406.361 )
							if( basis_minus <= 3.29915 )
								if( basis_max <= -1.84251 )
									ret := -0.819672 // sell
								if( basis_max > -1.84251 )
									ret := -0.116682
							if( basis_minus > 3.29915 )
								if( senkou_span_a <= 359.285 )
									ret := -0.313725
								if( senkou_span_a > 359.285 )
									ret := 0.543103
						if( tenkan_sen > 406.361 )
							if( tenkan_sen <= 408.075 )
								if( senkou_span_a <= 405.266 )
									ret := -0.250000
								if( senkou_span_a > 405.266 )
									ret := -0.880000 // sell
							if( tenkan_sen > 408.075 )
								if( senkou_span_a <= 406.947 )
									ret := 1.000000 // buy
								if( senkou_span_a > 406.947 )
									ret := -0.250000
				if( chinkou_span > 405.9 )
					if( kinjun_sen <= 403.34 )
						if( basis_minus <= 0.823062 )
							if( senkou_span_a <= 405.287 )
								if( basis_max <= -0.688604 )
									ret := 1.000000 // buy
								if( basis_max > -0.688604 )
									ret := 0.789474 // buy
							if( senkou_span_a > 405.287 )
								ret := 0.500000
						if( basis_minus > 0.823062 )
							if( senkou_span_a <= 403.854 )
								if( basis_max <= -0.677887 )
									ret := 0.735849 // buy
								if( basis_max > -0.677887 )
									ret := 0.000000
							if( senkou_span_a > 403.854 )
								if( chinkou_span <= 407.837 )
									ret := 0.000000
								if( chinkou_span > 407.837 )
									ret := -0.750000 // sell
					if( kinjun_sen > 403.34 )
						if( chinkou_span <= 408.213 )
							if( kinjun_sen <= 405.707 )
								if( basis_minus <= 1.25208 )
									ret := -0.076923
								if( basis_minus > 1.25208 )
									ret := 0.520000
							if( kinjun_sen > 405.707 )
								if( basis_minus <= 1.22335 )
									ret := -0.086957
								if( basis_minus > 1.22335 )
									ret := -0.647059
						if( chinkou_span > 408.213 )
							if( senkou_span_b_displaced <= 408.065 )
								if( basis_max <= -0.900112 )
									ret := 0.071429
								if( basis_max > -0.900112 )
									ret := 0.709091 // buy
							if( senkou_span_b_displaced > 408.065 )
								if( basis_minus <= 0.237858 )
									ret := 0.400000
								if( basis_minus > 0.237858 )
									ret := -0.666667
			if( senkou_span_a > 407.976 )
				if( chinkou_span <= 411.005 )
					if( senkou_span_a_displaced <= 417.517 )
						if( tenkan_sen <= 411.412 )
							if( tenkan_sen <= 411.342 )
								if( tenkan_sen <= 408.803 )
									ret := -0.153846
								if( tenkan_sen > 408.803 )
									ret := -0.712500 // sell
							if( tenkan_sen > 411.342 )
								if( basis_minus <= 1.06138 )
									ret := 1.000000 // buy
								if( basis_minus > 1.06138 )
									ret := -0.250000
						if( tenkan_sen > 411.412 )
							if( basis_max <= -0.744714 )
								if( senkou_span_a_displaced <= 406.812 )
									ret := -0.750000 // sell
								if( senkou_span_a_displaced > 406.812 )
									ret := -1.000000 // sell
							if( basis_max > -0.744714 )
								if( basis_max <= -0.71626 )
									ret := -0.500000
								if( basis_max > -0.71626 )
									ret := -0.750000 // sell
					if( senkou_span_a_displaced > 417.517 )
						if( senkou_span_a <= 408.229 )
							ret := 1.000000 // buy
						if( senkou_span_a > 408.229 )
							ret := -0.250000
				if( chinkou_span > 411.005 )
					if( tenkan_sen <= 417.283 )
						if( senkou_span_b_displaced <= 395.183 )
							ret := -1.000000 // sell
						if( senkou_span_b_displaced > 395.183 )
							if( senkou_span_a_displaced <= 401.356 )
								ret := 1.000000 // buy
							if( senkou_span_a_displaced > 401.356 )
								if( basis_max <= -2.66375 )
									ret := -0.700000 // sell
								if( basis_max > -2.66375 )
									ret := -0.052632
					if( tenkan_sen > 417.283 )
						if( senkou_span_a_displaced <= 416.136 )
							if( chinkou_span <= 415.998 )
								ret := -1.000000 // sell
							if( chinkou_span > 415.998 )
								if( senkou_span_a_displaced <= 409.485 )
									ret := -1.000000 // sell
								if( senkou_span_a_displaced > 409.485 )
									ret := -0.095890
						if( senkou_span_a_displaced > 416.136 )
							if( kinjun_sen <= 416.117 )
								ret := 0.285714
							if( kinjun_sen > 416.117 )
								if( senkou_span_a <= 417.69 )
									ret := -1.000000 // sell
								if( senkou_span_a > 417.69 )
									ret := -0.600000
		if( chinkou_span > 419.528 )
			if( tenkan_sen <= 420.99 )
				if( senkou_span_a <= 419.732 )
					if( senkou_span_b_displaced <= 413.772 )
						if( senkou_span_a <= 418.459 )
							if( chinkou_span <= 422.927 )
								if( basis_minus <= 1.56181 )
									ret := 0.875000 // buy
								if( basis_minus > 1.56181 )
									ret := 1.000000 // buy
							if( chinkou_span > 422.927 )
								if( basis_max <= -0.756488 )
									ret := 0.000000
								if( basis_max > -0.756488 )
									ret := 1.000000 // buy
						if( senkou_span_a > 418.459 )
							if( senkou_span_a_displaced <= 413.813 )
								ret := 0.000000
							if( senkou_span_a_displaced > 413.813 )
								ret := 0.833333 // buy
					if( senkou_span_b_displaced > 413.772 )
						if( tenkan_sen <= 418.154 )
							if( basis_minus <= 1.35245 )
								ret := 0.200000
							if( basis_minus > 1.35245 )
								ret := -1.000000 // sell
						if( tenkan_sen > 418.154 )
							if( tenkan_sen <= 419.064 )
								ret := 1.000000 // buy
							if( tenkan_sen > 419.064 )
								if( chinkou_span <= 422.953 )
									ret := 0.090909
								if( chinkou_span > 422.953 )
									ret := 0.857143 // buy
				if( senkou_span_a > 419.732 )
					if( senkou_span_a_displaced <= 417.698 )
						if( basis_max <= -0.710567 )
							ret := 1.000000 // buy
						if( basis_max > -0.710567 )
							if( basis_minus <= 1.35932 )
								ret := 0.500000
							if( basis_minus > 1.35932 )
								ret := 1.000000 // buy
					if( senkou_span_a_displaced > 417.698 )
						ret := 0.250000
			if( tenkan_sen > 420.99 )
				if( chinkou_span <= 424.785 )
					if( tenkan_sen <= 425.768 )
						if( senkou_span_b_displaced <= 417.288 )
							if( basis_minus <= 2.36556 )
								ret := -1.000000 // sell
							if( basis_minus > 2.36556 )
								ret := 0.000000
						if( senkou_span_b_displaced > 417.288 )
							if( basis_minus <= 0.810602 )
								if( basis_minus <= -1.51375 )
									ret := 0.600000
								if( basis_minus > -1.51375 )
									ret := -0.607143
							if( basis_minus > 0.810602 )
								if( basis_max <= -1.07394 )
									ret := 0.500000
								if( basis_max > -1.07394 )
									ret := 0.000000
					if( tenkan_sen > 425.768 )
						if( senkou_span_a <= 425.117 )
							if( senkou_span_a_displaced <= 423.564 )
								ret := -1.000000 // sell
							if( senkou_span_a_displaced > 423.564 )
								if( kinjun_sen <= 424.016 )
									ret := -0.500000
								if( kinjun_sen > 424.016 )
									ret := -0.500000
						if( senkou_span_a > 425.117 )
							if( kinjun_sen <= 425.055 )
								if( senkou_span_b_displaced <= 422.69 )
									ret := 0.000000
								if( senkou_span_b_displaced > 422.69 )
									ret := -0.250000
							if( kinjun_sen > 425.055 )
								ret := -1.000000 // sell
				if( chinkou_span > 424.785 )
					if( tenkan_sen <= 423.745 )
						if( chinkou_span <= 425.352 )
							if( basis_max <= -0.832131 )
								ret := 0.857143 // buy
							if( basis_max > -0.832131 )
								ret := 0.250000
						if( chinkou_span > 425.352 )
							if( senkou_span_a <= 421.766 )
								if( tenkan_sen <= 422.214 )
									ret := 0.950000 // buy
								if( tenkan_sen > 422.214 )
									ret := 0.500000
							if( senkou_span_a > 421.766 )
								ret := 1.000000 // buy
					if( tenkan_sen > 423.745 )
						if( basis_max <= -1.08501 )
							if( senkou_span_a_displaced <= 438.82 )
								if( kinjun_sen <= 436.46 )
									ret := 0.417910
								if( kinjun_sen > 436.46 )
									ret := -0.250000
							if( senkou_span_a_displaced > 438.82 )
								if( chinkou_span <= 453.383 )
									ret := 0.500000
								if( chinkou_span > 453.383 )
									ret := 0.871795 // buy
						if( basis_max > -1.08501 )
							if( basis_minus <= 2.47538 )
								if( basis_minus <= 2.00664 )
									ret := 0.003937
								if( basis_minus > 2.00664 )
									ret := 0.609756
							if( basis_minus > 2.47538 )
								if( chinkou_span <= 448.209 )
									ret := -0.689655
								if( chinkou_span > 448.209 )
									ret := -0.142857
	if( basis_max > -0.603987 )
		if( senkou_span_a_displaced <= 465.699 )
			if( kinjun_sen <= 330.695 )
				if( chinkou_span <= 329.526 )
					if( basis_max <= 0.000512 )
						if( tenkan_sen <= 328.149 )
							if( chinkou_span <= 327.073 )
								if( senkou_span_a <= 325.464 )
									ret := 0.010870
								if( senkou_span_a > 325.464 )
									ret := -0.320513
							if( chinkou_span > 327.073 )
								if( senkou_span_b <= 326.702 )
									ret := 0.583333
								if( senkou_span_b > 326.702 )
									ret := 0.064516
						if( tenkan_sen > 328.149 )
							if( basis_max <= -0.258671 )
								if( chinkou_span <= 328.836 )
									ret := -0.649718
								if( chinkou_span > 328.836 )
									ret := -0.075472
							if( basis_max > -0.258671 )
								if( basis_max <= -0.000659 )
									ret := -0.166381
								if( basis_max > -0.000659 )
									ret := 0.181818
					if( basis_max > 0.000512 )
						if( kinjun_sen <= 328.474 )
							if( kinjun_sen <= 326.622 )
								if( senkou_span_a_displaced <= 320.957 )
									ret := 0.176723
								if( senkou_span_a_displaced > 320.957 )
									ret := -0.019218
							if( kinjun_sen > 326.622 )
								if( senkou_span_a_displaced <= 331.88 )
									ret := 0.343874
								if( senkou_span_a_displaced > 331.88 )
									ret := -1.000000 // sell
						if( kinjun_sen > 328.474 )
							if( basis_minus <= -2.63727 )
								if( kinjun_sen <= 329.081 )
									ret := 0.200000
								if( kinjun_sen > 329.081 )
									ret := 0.920000 // buy
							if( basis_minus > -2.63727 )
								if( chinkou_span <= 327.482 )
									ret := -0.593548
								if( chinkou_span > 327.482 )
									ret := -0.049180
				if( chinkou_span > 329.526 )
					if( chinkou_span <= 331.357 )
						if( tenkan_sen <= 329.298 )
							if( tenkan_sen <= 327.179 )
								if( tenkan_sen <= 326.545 )
									ret := 0.400000
								if( tenkan_sen > 326.545 )
									ret := -0.476190
							if( tenkan_sen > 327.179 )
								if( tenkan_sen <= 327.733 )
									ret := 0.913580 // buy
								if( tenkan_sen > 327.733 )
									ret := 0.474777
						if( tenkan_sen > 329.298 )
							if( basis_max <= 0.453592 )
								if( chinkou_span <= 329.598 )
									ret := 0.800000 // buy
								if( chinkou_span > 329.598 )
									ret := 0.124756
							if( basis_max > 0.453592 )
								if( tenkan_sen <= 329.328 )
									ret := 0.800000 // buy
								if( tenkan_sen > 329.328 )
									ret := 1.000000 // buy
					if( chinkou_span > 331.357 )
						if( senkou_span_b_displaced <= 326.278 )
							if( chinkou_span <= 332.445 )
								if( senkou_span_a_displaced <= 324.818 )
									ret := 0.941176 // buy
								if( senkou_span_a_displaced > 324.818 )
									ret := 0.500000
							if( chinkou_span > 332.445 )
								if( senkou_span_b_displaced <= 326.122 )
									ret := -0.312500
								if( senkou_span_b_displaced > 326.122 )
									ret := -0.909091 // sell
						if( senkou_span_b_displaced > 326.278 )
							if( senkou_span_b_displaced <= 331.368 )
								if( basis_minus <= 0.570898 )
									ret := 0.670300
								if( basis_minus > 0.570898 )
									ret := 0.853535 // buy
							if( senkou_span_b_displaced > 331.368 )
								if( senkou_span_b <= 329.608 )
									ret := -0.388889
								if( senkou_span_b > 329.608 )
									ret := 0.526316
			if( kinjun_sen > 330.695 )
				if( senkou_span_b_displaced <= 333.546 )
					if( chinkou_span <= 331.163 )
						if( chinkou_span <= 328.598 )
							if( senkou_span_a_displaced <= 329.946 )
								ret := 0.857143 // buy
							if( senkou_span_a_displaced > 329.946 )
								if( basis_max <= 0.26101 )
									ret := -0.621118
								if( basis_max > 0.26101 )
									ret := -0.902439 // sell
						if( chinkou_span > 328.598 )
							if( senkou_span_a_displaced <= 333.147 )
								if( senkou_span_a <= 330.598 )
									ret := 0.333333
								if( senkou_span_a > 330.598 )
									ret := -0.412044
							if( senkou_span_a_displaced > 333.147 )
								if( kinjun_sen <= 333.695 )
									ret := -0.823529 // sell
								if( kinjun_sen > 333.695 )
									ret := 0.000000
					if( chinkou_span > 331.163 )
						if( kinjun_sen <= 331.71 )
							if( senkou_span_b <= 331.003 )
								if( basis_max <= 0.073448 )
									ret := 0.272727
								if( basis_max > 0.073448 )
									ret := -0.517857
							if( senkou_span_b > 331.003 )
								if( senkou_span_a <= 331.852 )
									ret := 0.478355
								if( senkou_span_a > 331.852 )
									ret := -0.448276
						if( kinjun_sen > 331.71 )
							if( basis_max <= -0.472695 )
								if( chinkou_span <= 334.303 )
									ret := -0.285714
								if( chinkou_span > 334.303 )
									ret := 0.741935 // buy
							if( basis_max > -0.472695 )
								if( chinkou_span <= 336.274 )
									ret := -0.091724
								if( chinkou_span > 336.274 )
									ret := 0.432584
				if( senkou_span_b_displaced > 333.546 )
					if( senkou_span_b_displaced <= 334.35 )
						if( basis_max <= -0.184847 )
							if( chinkou_span <= 335.286 )
								if( senkou_span_b_displaced <= 333.688 )
									ret := 0.000000
								if( senkou_span_b_displaced > 333.688 )
									ret := -0.480000
							if( chinkou_span > 335.286 )
								if( chinkou_span <= 337.597 )
									ret := 0.750000 // buy
								if( chinkou_span > 337.597 )
									ret := -0.407407
						if( basis_max > -0.184847 )
							if( chinkou_span <= 333.89 )
								if( senkou_span_a <= 334.302 )
									ret := 0.304933
								if( senkou_span_a > 334.302 )
									ret := -0.727273 // sell
							if( chinkou_span > 333.89 )
								if( senkou_span_a <= 332.77 )
									ret := 1.000000 // buy
								if( senkou_span_a > 332.77 )
									ret := 0.541806
					if( senkou_span_b_displaced > 334.35 )
						if( chinkou_span <= 337.465 )
							if( tenkan_sen <= 335.085 )
								if( chinkou_span <= 333.513 )
									ret := -0.274956
								if( chinkou_span > 333.513 )
									ret := 0.264624
							if( tenkan_sen > 335.085 )
								if( basis_max <= 0.411401 )
									ret := -0.351101
								if( basis_max > 0.411401 )
									ret := 0.009524
						if( chinkou_span > 337.465 )
							if( tenkan_sen <= 337.549 )
								if( chinkou_span <= 338.745 )
									ret := 0.352941
								if( chinkou_span > 338.745 )
									ret := 0.656388
							if( tenkan_sen > 337.549 )
								if( tenkan_sen <= 408.271 )
									ret := 0.085316
								if( tenkan_sen > 408.271 )
									ret := 0.030308
		if( senkou_span_a_displaced > 465.699 )
			if( chinkou_span <= 466.275 )
				if( senkou_span_b <= 465.21 )
					if( basis_minus <= -3.22785 )
						ret := -0.250000
					if( basis_minus > -3.22785 )
						if( basis_max <= 0.35625 )
							ret := -0.428571
						if( basis_max > 0.35625 )
							if( senkou_span_a <= 460.768 )
								if( chinkou_span <= 454.993 )
									ret := -0.600000
								if( chinkou_span > 454.993 )
									ret := -1.000000 // sell
							if( senkou_span_a > 460.768 )
								ret := -1.000000 // sell
				if( senkou_span_b > 465.21 )
					if( senkou_span_a <= 465.965 )
						if( tenkan_sen <= 463.915 )
							if( basis_max <= 0.769623 )
								ret := -0.750000 // sell
							if( basis_max > 0.769623 )
								ret := 0.250000
						if( tenkan_sen > 463.915 )
							if( senkou_span_a_displaced <= 467.724 )
								if( senkou_span_b_displaced <= 466.991 )
									ret := 0.333333
								if( senkou_span_b_displaced > 466.991 )
									ret := 0.000000
							if( senkou_span_a_displaced > 467.724 )
								ret := 0.500000
					if( senkou_span_a > 465.965 )
						if( kinjun_sen <= 466.96 )
							if( senkou_span_b_displaced <= 467.914 )
								if( tenkan_sen <= 466.351 )
									ret := -1.000000 // sell
								if( tenkan_sen > 466.351 )
									ret := -0.888889 // sell
							if( senkou_span_b_displaced > 467.914 )
								if( basis_max <= 0.181822 )
									ret := -0.500000
								if( basis_max > 0.181822 )
									ret := -1.000000 // sell
						if( kinjun_sen > 466.96 )
							if( basis_max <= 0.1715 )
								if( tenkan_sen <= 467.873 )
									ret := 0.000000
								if( tenkan_sen > 467.873 )
									ret := -0.333333
							if( basis_max > 0.1715 )
								if( basis_max <= 0.40454 )
									ret := -0.842105 // sell
								if( basis_max > 0.40454 )
									ret := 0.000000
			if( chinkou_span > 466.275 )
				if( chinkou_span <= 467.822 )
					if( senkou_span_b <= 467.983 )
						if( senkou_span_a_displaced <= 467.497 )
							ret := 0.000000
						if( senkou_span_a_displaced > 467.497 )
							ret := 0.571429
					if( senkou_span_b > 467.983 )
						if( senkou_span_b <= 468.072 )
							ret := -1.000000 // sell
						if( senkou_span_b > 468.072 )
							ret := -0.250000
				if( chinkou_span > 467.822 )
					if( senkou_span_a_displaced <= 467.22 )
						if( basis_minus <= 0.308628 )
							ret := 0.400000
						if( basis_minus > 0.308628 )
							if( basis_minus <= 0.336562 )
								ret := 1.000000 // buy
							if( basis_minus > 0.336562 )
								ret := 0.500000
					if( senkou_span_a_displaced > 467.22 )
						ret := 0.000000
	
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
float op_operation = decision_tree_0_MSFT_5Min_1453d394(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)

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


