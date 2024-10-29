//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: QCOM_1Min_1ICH_ad7615d7 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_QCOM_1Min_1ICH_ad7615d7", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_QCOM_1Min_ad7615d7(senkou_span_a_displaced, cross_dn_tenkan_kinjunInt, kinjun_sen, chinkou_span, senkou_span_b_displaced, basis_minus, senkou_span_b, senkou_span_a, cross_up_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( tenkan_sen <= 158.621 )
		if( basis_minus <= -0.186197 )
			if( chinkou_span <= 158.431 )
				if( basis_minus <= -0.593079 )
					if( basis_max <= 1.00664 )
						if( chinkou_span <= 151.995 )
							if( tenkan_sen <= 151.282 )
								if( basis_minus <= -0.88 )
									ret := 0.900000 // buy
								if( basis_minus > -0.88 )
									ret := -0.028571
							if( tenkan_sen > 151.282 )
								if( basis_minus <= -1.42787 )
									ret := -0.230769
								if( basis_minus > -1.42787 )
									ret := -0.880952 // sell
						if( chinkou_span > 151.995 )
							if( senkou_span_b_displaced <= 159.985 )
								if( senkou_span_b_displaced <= 159.408 )
									ret := 0.288660
								if( senkou_span_b_displaced > 159.408 )
									ret := 0.766667 // buy
							if( senkou_span_b_displaced > 159.985 )
								if( chinkou_span <= 157.588 )
									ret := 0.800000 // buy
								if( chinkou_span > 157.588 )
									ret := -0.642857
					if( basis_max > 1.00664 )
						ret := 1.000000 // buy
				if( basis_minus > -0.593079 )
					if( basis_max <= 0.330255 )
						if( senkou_span_a_displaced <= 159.889 )
							if( basis_max <= 0.065424 )
								if( senkou_span_a <= 158.001 )
									ret := -0.154412
								if( senkou_span_a > 158.001 )
									ret := -0.759259 // sell
							if( basis_max > 0.065424 )
								if( basis_minus <= -0.19375 )
									ret := 0.030928
								if( basis_minus > -0.19375 )
									ret := -0.923077 // sell
						if( senkou_span_a_displaced > 159.889 )
							ret := 1.000000 // buy
					if( basis_max > 0.330255 )
						if( chinkou_span <= 157.425 )
							if( senkou_span_a_displaced <= 159.149 )
								if( senkou_span_a <= 149.764 )
									ret := -0.500000
								if( senkou_span_a > 149.764 )
									ret := -0.882353 // sell
							if( senkou_span_a_displaced > 159.149 )
								ret := -0.500000
						if( chinkou_span > 157.425 )
							ret := 0.000000
			if( chinkou_span > 158.431 )
				if( basis_max <= 0.050285 )
					if( tenkan_sen <= 158.23 )
						if( chinkou_span <= 160.125 )
							if( senkou_span_b <= 158.452 )
								ret := 0.000000
							if( senkou_span_b > 158.452 )
								ret := 0.600000
						if( chinkou_span > 160.125 )
							if( basis_minus <= -1.09125 )
								ret := 0.600000
							if( basis_minus > -1.09125 )
								if( chinkou_span <= 160.531 )
									ret := -0.600000
								if( chinkou_span > 160.531 )
									ret := -0.900000 // sell
					if( tenkan_sen > 158.23 )
						if( chinkou_span <= 159.616 )
							ret := 0.200000
						if( chinkou_span > 159.616 )
							if( senkou_span_a_displaced <= 158.785 )
								ret := 0.600000
							if( senkou_span_a_displaced > 158.785 )
								ret := 1.000000 // buy
				if( basis_max > 0.050285 )
					if( senkou_span_b <= 159.932 )
						if( senkou_span_a_displaced <= 157.791 )
							ret := 0.000000
						if( senkou_span_a_displaced > 157.791 )
							if( tenkan_sen <= 157.604 )
								if( senkou_span_a <= 158.408 )
									ret := 1.000000 // buy
								if( senkou_span_a > 158.408 )
									ret := 0.000000
							if( tenkan_sen > 157.604 )
								if( senkou_span_a <= 158.725 )
									ret := 0.489583
								if( senkou_span_a > 158.725 )
									ret := 0.844444 // buy
					if( senkou_span_b > 159.932 )
						ret := -0.600000
		if( basis_minus > -0.186197 )
			if( chinkou_span <= 158.782 )
				if( senkou_span_a <= 156.963 )
					if( basis_minus <= 1.34293 )
						if( senkou_span_a_displaced <= 150.243 )
							if( senkou_span_a <= 149.257 )
								ret := 0.500000
							if( senkou_span_a > 149.257 )
								ret := 1.000000 // buy
						if( senkou_span_a_displaced > 150.243 )
							if( senkou_span_a_displaced <= 151.162 )
								if( senkou_span_b_displaced <= 151.29 )
									ret := -0.875000 // sell
								if( senkou_span_b_displaced > 151.29 )
									ret := 0.166667
							if( senkou_span_a_displaced > 151.162 )
								if( chinkou_span <= 157.475 )
									ret := 0.808219 // buy
								if( chinkou_span > 157.475 )
									ret := -0.058824
					if( basis_minus > 1.34293 )
						if( basis_minus <= 1.76655 )
							if( chinkou_span <= 156.54 )
								ret := -1.000000 // sell
							if( chinkou_span > 156.54 )
								if( chinkou_span <= 157.143 )
									ret := 0.555556
								if( chinkou_span > 157.143 )
									ret := -0.714286 // sell
						if( basis_minus > 1.76655 )
							if( chinkou_span <= 155.576 )
								ret := 0.200000
							if( chinkou_span > 155.576 )
								if( chinkou_span <= 158.477 )
									ret := 1.000000 // buy
								if( chinkou_span > 158.477 )
									ret := 0.750000 // buy
				if( senkou_span_a > 156.963 )
					if( senkou_span_b <= 157.565 )
						if( senkou_span_a_displaced <= 157.189 )
							if( chinkou_span <= 157.565 )
								if( chinkou_span <= 157.022 )
									ret := 0.120000
								if( chinkou_span > 157.022 )
									ret := 0.650000
							if( chinkou_span > 157.565 )
								if( senkou_span_b <= 156.049 )
									ret := 1.000000 // buy
								if( senkou_span_b > 156.049 )
									ret := -0.659091
						if( senkou_span_a_displaced > 157.189 )
							if( kinjun_sen <= 157.53 )
								if( tenkan_sen <= 157.272 )
									ret := -0.857143 // sell
								if( tenkan_sen > 157.272 )
									ret := -1.000000 // sell
							if( kinjun_sen > 157.53 )
								if( senkou_span_b <= 157.355 )
									ret := 0.500000
								if( senkou_span_b > 157.355 )
									ret := -0.285714
					if( senkou_span_b > 157.565 )
						if( senkou_span_b_displaced <= 158.015 )
							if( senkou_span_b <= 157.837 )
								if( senkou_span_a_displaced <= 157.003 )
									ret := -0.200000
								if( senkou_span_a_displaced > 157.003 )
									ret := 0.906250 // buy
							if( senkou_span_b > 157.837 )
								if( basis_minus <= 0.15875 )
									ret := -0.083333
								if( basis_minus > 0.15875 )
									ret := 0.676471
						if( senkou_span_b_displaced > 158.015 )
							if( basis_max <= 0.021875 )
								if( chinkou_span <= 158.486 )
									ret := -0.585366
								if( chinkou_span > 158.486 )
									ret := 0.000000
							if( basis_max > 0.021875 )
								if( senkou_span_b_displaced <= 158.305 )
									ret := -0.069767
								if( senkou_span_b_displaced > 158.305 )
									ret := 0.597222
			if( chinkou_span > 158.782 )
				if( basis_max <= -0.118696 )
					if( basis_minus <= 0.647592 )
						if( senkou_span_b <= 157.987 )
							if( senkou_span_a <= 156.386 )
								ret := -0.142857
							if( senkou_span_a > 156.386 )
								ret := -1.000000 // sell
						if( senkou_span_b > 157.987 )
							if( basis_minus <= 0.145463 )
								if( senkou_span_b <= 158.31 )
									ret := -0.500000
								if( senkou_span_b > 158.31 )
									ret := 0.400000
							if( basis_minus > 0.145463 )
								ret := 1.000000 // buy
					if( basis_minus > 0.647592 )
						if( tenkan_sen <= 156.017 )
							ret := -0.200000
						if( tenkan_sen > 156.017 )
							if( senkou_span_b_displaced <= 155.633 )
								ret := 0.600000
							if( senkou_span_b_displaced > 155.633 )
								if( chinkou_span <= 159.627 )
									ret := 0.750000 // buy
								if( chinkou_span > 159.627 )
									ret := 1.000000 // buy
				if( basis_max > -0.118696 )
					if( chinkou_span <= 159.653 )
						if( senkou_span_a_displaced <= 157.264 )
							if( senkou_span_a_displaced <= 157.259 )
								ret := 1.000000 // buy
							if( senkou_span_a_displaced > 157.259 )
								if( senkou_span_a_displaced <= 157.26 )
									ret := 0.750000 // buy
								if( senkou_span_a_displaced > 157.26 )
									ret := 1.000000 // buy
						if( senkou_span_a_displaced > 157.264 )
							if( senkou_span_a_displaced <= 157.644 )
								if( senkou_span_a <= 156.946 )
									ret := 0.666667
								if( senkou_span_a > 156.946 )
									ret := -0.555556
							if( senkou_span_a_displaced > 157.644 )
								if( senkou_span_b <= 158.127 )
									ret := 0.710280 // buy
								if( senkou_span_b > 158.127 )
									ret := 0.280000
					if( chinkou_span > 159.653 )
						if( basis_max <= 0.204404 )
							if( kinjun_sen <= 158.294 )
								if( senkou_span_a_displaced <= 156.359 )
									ret := 0.916667 // buy
								if( senkou_span_a_displaced > 156.359 )
									ret := 1.000000 // buy
							if( kinjun_sen > 158.294 )
								if( basis_max <= 0.004524 )
									ret := 0.500000
								if( basis_max > 0.004524 )
									ret := 1.000000 // buy
						if( basis_max > 0.204404 )
							if( senkou_span_a <= 158.102 )
								ret := 0.000000
							if( senkou_span_a > 158.102 )
								ret := 1.000000 // buy
	if( tenkan_sen > 158.621 )
		if( chinkou_span <= 159.922 )
			if( basis_minus <= -1.21748 )
				if( chinkou_span <= 159.816 )
					if( tenkan_sen <= 158.91 )
						ret := 0.333333
					if( tenkan_sen > 158.91 )
						if( senkou_span_a_displaced <= 160.423 )
							ret := 1.000000 // buy
						if( senkou_span_a_displaced > 160.423 )
							if( chinkou_span <= 159.599 )
								if( tenkan_sen <= 159.567 )
									ret := 1.000000 // buy
								if( tenkan_sen > 159.567 )
									ret := 0.750000 // buy
							if( chinkou_span > 159.599 )
								ret := 0.500000
				if( chinkou_span > 159.816 )
					ret := 0.200000
			if( basis_minus > -1.21748 )
				if( kinjun_sen <= 160.777 )
					if( chinkou_span <= 158.168 )
						if( chinkou_span <= 152.003 )
							if( senkou_span_b_displaced <= 159.103 )
								ret := -0.500000
							if( senkou_span_b_displaced > 159.103 )
								ret := 1.000000 // buy
						if( chinkou_span > 152.003 )
							if( senkou_span_b <= 159.345 )
								if( basis_minus <= 0.5375 )
									ret := -0.611650
								if( basis_minus > 0.5375 )
									ret := -1.000000 // sell
							if( senkou_span_b > 159.345 )
								if( kinjun_sen <= 158.885 )
									ret := 0.733333 // buy
								if( kinjun_sen > 158.885 )
									ret := -0.481481
					if( chinkou_span > 158.168 )
						if( senkou_span_b <= 159.981 )
							if( basis_max <= 0.253107 )
								if( senkou_span_b <= 158.119 )
									ret := -0.857143 // sell
								if( senkou_span_b > 158.119 )
									ret := -0.061252
							if( basis_max > 0.253107 )
								if( tenkan_sen <= 158.707 )
									ret := 0.000000
								if( tenkan_sen > 158.707 )
									ret := 0.933333 // buy
						if( senkou_span_b > 159.981 )
							if( senkou_span_b_displaced <= 160.257 )
								if( kinjun_sen <= 160.316 )
									ret := -0.566667
								if( kinjun_sen > 160.316 )
									ret := 0.812500 // buy
							if( senkou_span_b_displaced > 160.257 )
								if( senkou_span_a_displaced <= 161.188 )
									ret := -0.694853
								if( senkou_span_a_displaced > 161.188 )
									ret := 0.015748
				if( kinjun_sen > 160.777 )
					if( chinkou_span <= 159.591 )
						if( senkou_span_b_displaced <= 163.12 )
							if( basis_minus <= 0.419566 )
								if( senkou_span_a_displaced <= 160.097 )
									ret := 0.000000
								if( senkou_span_a_displaced > 160.097 )
									ret := -0.828729 // sell
							if( basis_minus > 0.419566 )
								ret := -1.000000 // sell
						if( senkou_span_b_displaced > 163.12 )
							if( senkou_span_a_displaced <= 162.543 )
								if( senkou_span_a <= 162.152 )
									ret := -0.916667 // sell
								if( senkou_span_a > 162.152 )
									ret := -0.500000
							if( senkou_span_a_displaced > 162.543 )
								if( tenkan_sen <= 161.303 )
									ret := 0.750000 // buy
								if( tenkan_sen > 161.303 )
									ret := 0.250000
					if( chinkou_span > 159.591 )
						if( kinjun_sen <= 161.553 )
							if( tenkan_sen <= 161.36 )
								if( senkou_span_b_displaced <= 161.066 )
									ret := -0.750000 // sell
								if( senkou_span_b_displaced > 161.066 )
									ret := 0.206897
							if( tenkan_sen > 161.36 )
								if( basis_max <= -0.027093 )
									ret := 0.750000 // buy
								if( basis_max > -0.027093 )
									ret := 1.000000 // buy
						if( kinjun_sen > 161.553 )
							if( chinkou_span <= 159.695 )
								if( senkou_span_b <= 162.053 )
									ret := -0.400000
								if( senkou_span_b > 162.053 )
									ret := 0.250000
							if( chinkou_span > 159.695 )
								if( tenkan_sen <= 161.97 )
									ret := -0.966667 // sell
								if( tenkan_sen > 161.97 )
									ret := -0.571429
		if( chinkou_span > 159.922 )
			if( senkou_span_a <= 160.384 )
				if( senkou_span_b <= 160.966 )
					if( tenkan_sen <= 159.715 )
						if( kinjun_sen <= 159.606 )
							if( senkou_span_a_displaced <= 160.849 )
								if( basis_minus <= 0.249357 )
									ret := 0.512397
								if( basis_minus > 0.249357 )
									ret := 0.767857 // buy
							if( senkou_span_a_displaced > 160.849 )
								ret := -1.000000 // sell
						if( kinjun_sen > 159.606 )
							if( tenkan_sen <= 159.582 )
								if( basis_max <= 0.539957 )
									ret := 0.976744 // buy
								if( basis_max > 0.539957 )
									ret := 0.750000 // buy
							if( tenkan_sen > 159.582 )
								if( senkou_span_a_displaced <= 160.68 )
									ret := 0.729730 // buy
								if( senkou_span_a_displaced > 160.68 )
									ret := 0.333333
					if( tenkan_sen > 159.715 )
						if( tenkan_sen <= 160.284 )
							if( senkou_span_a_displaced <= 159.852 )
								if( senkou_span_a_displaced <= 159.406 )
									ret := 0.365482
								if( senkou_span_a_displaced > 159.406 )
									ret := -0.225806
							if( senkou_span_a_displaced > 159.852 )
								if( basis_max <= 0.197446 )
									ret := 0.605000
								if( basis_max > 0.197446 )
									ret := -0.205882
						if( tenkan_sen > 160.284 )
							if( senkou_span_a_displaced <= 157.87 )
								if( chinkou_span <= 160.062 )
									ret := -0.833333 // sell
								if( chinkou_span > 160.062 )
									ret := -0.285714
							if( senkou_span_a_displaced > 157.87 )
								if( senkou_span_b_displaced <= 160.613 )
									ret := 0.815287 // buy
								if( senkou_span_b_displaced > 160.613 )
									ret := -0.111111
				if( senkou_span_b > 160.966 )
					if( basis_max <= 0.245554 )
						if( chinkou_span <= 160.575 )
							ret := -1.000000 // sell
						if( chinkou_span > 160.575 )
							ret := -0.714286 // sell
					if( basis_max > 0.245554 )
						if( senkou_span_a <= 160.141 )
							if( basis_max <= 0.595622 )
								ret := 1.000000 // buy
							if( basis_max > 0.595622 )
								ret := 0.750000 // buy
						if( senkou_span_a > 160.141 )
							ret := 0.000000
			if( senkou_span_a > 160.384 )
				if( chinkou_span <= 160.977 )
					if( tenkan_sen <= 160.37 )
						if( basis_max <= 0.301626 )
							if( kinjun_sen <= 160.688 )
								if( chinkou_span <= 160.621 )
									ret := 0.000000
								if( chinkou_span > 160.621 )
									ret := 1.000000 // buy
							if( kinjun_sen > 160.688 )
								if( tenkan_sen <= 160.274 )
									ret := -1.000000 // sell
								if( tenkan_sen > 160.274 )
									ret := -0.500000
						if( basis_max > 0.301626 )
							ret := 1.000000 // buy
					if( tenkan_sen > 160.37 )
						if( basis_minus <= 0.563261 )
							if( basis_minus <= 0.0517 )
								if( senkou_span_a_displaced <= 162.366 )
									ret := -0.537118
								if( senkou_span_a_displaced > 162.366 )
									ret := -0.153061
							if( basis_minus > 0.0517 )
								if( kinjun_sen <= 162.423 )
									ret := 0.043478
								if( kinjun_sen > 162.423 )
									ret := -0.628571
						if( basis_minus > 0.563261 )
							if( chinkou_span <= 160.798 )
								if( kinjun_sen <= 160.933 )
									ret := -0.972973 // sell
								if( kinjun_sen > 160.933 )
									ret := -0.733333 // sell
							if( chinkou_span > 160.798 )
								if( basis_minus <= 1.46437 )
									ret := -0.923077 // sell
								if( basis_minus > 1.46437 )
									ret := 1.000000 // buy
				if( chinkou_span > 160.977 )
					if( senkou_span_a <= 161.448 )
						if( chinkou_span <= 162.156 )
							if( basis_minus <= -0.147832 )
								if( senkou_span_a_displaced <= 162.558 )
									ret := -0.046512
								if( senkou_span_a_displaced > 162.558 )
									ret := -0.888889 // sell
							if( basis_minus > -0.147832 )
								if( basis_max <= -0.151617 )
									ret := 0.000000
								if( basis_max > -0.151617 )
									ret := 0.360697
						if( chinkou_span > 162.156 )
							if( senkou_span_a_displaced <= 160.408 )
								if( basis_max <= -0.259461 )
									ret := 0.520000
								if( basis_max > -0.259461 )
									ret := -0.391304
							if( senkou_span_a_displaced > 160.408 )
								if( kinjun_sen <= 161.504 )
									ret := 0.764151 // buy
								if( kinjun_sen > 161.504 )
									ret := 1.000000 // buy
					if( senkou_span_a > 161.448 )
						if( chinkou_span <= 162.174 )
							if( tenkan_sen <= 162.688 )
								if( kinjun_sen <= 161.425 )
									ret := -0.477273
								if( kinjun_sen > 161.425 )
									ret := -0.082391
							if( tenkan_sen > 162.688 )
								if( kinjun_sen <= 163.114 )
									ret := -0.703390 // sell
								if( kinjun_sen > 163.114 )
									ret := -0.252212
						if( chinkou_span > 162.174 )
							if( tenkan_sen <= 163.246 )
								if( basis_max <= -0.000199 )
									ret := 0.115694
								if( basis_max > -0.000199 )
									ret := 0.438825
							if( tenkan_sen > 163.246 )
								if( chinkou_span <= 163.941 )
									ret := -0.251964
								if( chinkou_span > 163.941 )
									ret := 0.047552
	
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
float op_operation = decision_tree_0_QCOM_1Min_ad7615d7(senkou_span_a_displaced, cross_dn_tenkan_kinjunInt, kinjun_sen, chinkou_span, senkou_span_b_displaced, basis_minus, senkou_span_b, senkou_span_a, cross_up_tenkan_kinjunInt, tenkan_sen, basis_max)

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


