//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: GME_15Min_1ICH_320de0fd Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GME_15Min_1ICH_320de0fd", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GME_15Min_320de0fd(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( basis_max <= 0.787057 )
		if( tenkan_sen <= 4.31003 )
			if( chinkou_span <= 4.0454 )
				if( senkou_span_a <= 3.89902 )
					if( chinkou_span <= 3.76511 )
						if( senkou_span_a_displaced <= 2.96832 )
							if( tenkan_sen <= 3.09915 )
								if( chinkou_span <= 3.04082 )
									ret := 0.000000
								if( chinkou_span > 3.04082 )
									ret := 0.930233 // buy
							if( tenkan_sen > 3.09915 )
								if( senkou_span_b_displaced <= 2.76963 )
									ret := -0.545455
								if( senkou_span_b_displaced > 2.76963 )
									ret := 0.500000
						if( senkou_span_a_displaced > 2.96832 )
							if( chinkou_span <= 2.94357 )
								if( chinkou_span <= 2.635 )
									ret := 0.785714 // buy
								if( chinkou_span > 2.635 )
									ret := -0.834951 // sell
							if( chinkou_span > 2.94357 )
								if( senkou_span_b_displaced <= 3.77497 )
									ret := 0.142665
								if( senkou_span_b_displaced > 3.77497 )
									ret := -0.329177
					if( chinkou_span > 3.76511 )
						if( basis_minus <= 0.094441 )
							if( basis_max <= -0.009015 )
								if( senkou_span_b <= 3.70035 )
									ret := 0.623762
								if( senkou_span_b > 3.70035 )
									ret := -0.139241
							if( basis_max > -0.009015 )
								if( kinjun_sen <= 3.73027 )
									ret := 0.819672 // buy
								if( kinjun_sen > 3.73027 )
									ret := 0.491803
						if( basis_minus > 0.094441 )
							if( chinkou_span <= 3.9827 )
								if( basis_minus <= 0.115833 )
									ret := -0.647059
								if( basis_minus > 0.115833 )
									ret := -1.000000 // sell
							if( chinkou_span > 3.9827 )
								ret := 0.428571
				if( senkou_span_a > 3.89902 )
					if( senkou_span_b <= 4.03393 )
						if( chinkou_span <= 3.90144 )
							if( senkou_span_b_displaced <= 3.83 )
								if( basis_max <= 0.023142 )
									ret := -0.758621 // sell
								if( basis_max > 0.023142 )
									ret := 0.666667
							if( senkou_span_b_displaced > 3.83 )
								if( senkou_span_b <= 3.95591 )
									ret := 0.329670
								if( senkou_span_b > 3.95591 )
									ret := -0.464789
						if( chinkou_span > 3.90144 )
							if( basis_max <= -0.016453 )
								if( senkou_span_b_displaced <= 4.01894 )
									ret := 0.390244
								if( senkou_span_b_displaced > 4.01894 )
									ret := -0.600000
							if( basis_max > -0.016453 )
								if( senkou_span_a_displaced <= 4.0171 )
									ret := 0.776699 // buy
								if( senkou_span_a_displaced > 4.0171 )
									ret := 0.120000
					if( senkou_span_b > 4.03393 )
						if( basis_max <= 0.022538 )
							if( senkou_span_a_displaced <= 4.04847 )
								if( chinkou_span <= 3.8576 )
									ret := -0.600000
								if( chinkou_span > 3.8576 )
									ret := 0.137931
							if( senkou_span_a_displaced > 4.04847 )
								if( kinjun_sen <= 4.01255 )
									ret := -0.939394 // sell
								if( kinjun_sen > 4.01255 )
									ret := -0.493888
						if( basis_max > 0.022538 )
							if( senkou_span_b <= 4.1243 )
								if( senkou_span_a <= 3.97554 )
									ret := -0.833333 // sell
								if( senkou_span_a > 3.97554 )
									ret := -0.321429
							if( senkou_span_b > 4.1243 )
								if( chinkou_span <= 3.7496 )
									ret := 0.520833
								if( chinkou_span > 3.7496 )
									ret := -0.006623
			if( chinkou_span > 4.0454 )
				if( chinkou_span <= 4.42639 )
					if( tenkan_sen <= 4.12883 )
						if( basis_minus <= -0.193519 )
							ret := -1.000000 // sell
						if( basis_minus > -0.193519 )
							if( senkou_span_a_displaced <= 3.49005 )
								if( basis_max <= -0.053923 )
									ret := -0.846154 // sell
								if( basis_max > -0.053923 )
									ret := 0.000000
							if( senkou_span_a_displaced > 3.49005 )
								if( senkou_span_b <= 4.22232 )
									ret := 0.426136
								if( senkou_span_b > 4.22232 )
									ret := 0.830508 // buy
					if( tenkan_sen > 4.12883 )
						if( senkou_span_b <= 3.99572 )
							if( tenkan_sen <= 4.14134 )
								if( senkou_span_b <= 3.9891 )
									ret := 0.545455
								if( senkou_span_b > 3.9891 )
									ret := -0.400000
							if( tenkan_sen > 4.14134 )
								if( basis_minus <= 0.162442 )
									ret := -1.000000 // sell
								if( basis_minus > 0.162442 )
									ret := 0.166667
						if( senkou_span_b > 3.99572 )
							if( senkou_span_b <= 4.38297 )
								if( chinkou_span <= 4.25129 )
									ret := 0.092486
								if( chinkou_span > 4.25129 )
									ret := 0.391421
							if( senkou_span_b > 4.38297 )
								if( senkou_span_a_displaced <= 4.45983 )
									ret := -0.967742 // sell
								if( senkou_span_a_displaced > 4.45983 )
									ret := 0.081967
				if( chinkou_span > 4.42639 )
					if( basis_max <= -0.072652 )
						if( senkou_span_b <= 3.7925 )
							if( senkou_span_a_displaced <= 3.4821 )
								ret := 1.000000 // buy
							if( senkou_span_a_displaced > 3.4821 )
								ret := -0.250000
						if( senkou_span_b > 3.7925 )
							ret := -1.000000 // sell
					if( basis_max > -0.072652 )
						if( basis_max <= -0.008628 )
							if( basis_minus <= -0.077749 )
								if( tenkan_sen <= 4.27125 )
									ret := 0.200000
								if( tenkan_sen > 4.27125 )
									ret := -1.000000 // sell
							if( basis_minus > -0.077749 )
								if( senkou_span_a_displaced <= 4.18612 )
									ret := 0.323944
								if( senkou_span_a_displaced > 4.18612 )
									ret := 0.850000 // buy
						if( basis_max > -0.008628 )
							if( senkou_span_b_displaced <= 4.37676 )
								if( basis_max <= 0.001548 )
									ret := 0.760000 // buy
								if( basis_max > 0.001548 )
									ret := 1.000000 // buy
							if( senkou_span_b_displaced > 4.37676 )
								if( basis_minus <= -0.135628 )
									ret := 0.849057 // buy
								if( basis_minus > -0.135628 )
									ret := 0.420290
		if( tenkan_sen > 4.31003 )
			if( senkou_span_a <= 310.315 )
				if( tenkan_sen <= 4.37488 )
					if( basis_max <= -0.003812 )
						if( senkou_span_b <= 4.34863 )
							if( senkou_span_a_displaced <= 3.98018 )
								ret := 1.000000 // buy
							if( senkou_span_a_displaced > 3.98018 )
								if( senkou_span_a_displaced <= 4.13034 )
									ret := -0.565217
								if( senkou_span_a_displaced > 4.13034 )
									ret := -0.025000
						if( senkou_span_b > 4.34863 )
							if( senkou_span_a_displaced <= 4.60624 )
								if( tenkan_sen <= 4.33495 )
									ret := 1.000000 // buy
								if( tenkan_sen > 4.33495 )
									ret := 0.800000 // buy
							if( senkou_span_a_displaced > 4.60624 )
								ret := 0.000000
					if( basis_max > -0.003812 )
						if( chinkou_span <= 4.43861 )
							if( senkou_span_a_displaced <= 4.63063 )
								if( senkou_span_b <= 4.5175 )
									ret := -0.521212
								if( senkou_span_b > 4.5175 )
									ret := 0.533333
							if( senkou_span_a_displaced > 4.63063 )
								if( tenkan_sen <= 4.33067 )
									ret := -0.600000
								if( tenkan_sen > 4.33067 )
									ret := -0.975000 // sell
						if( chinkou_span > 4.43861 )
							if( basis_minus <= -0.038789 )
								if( basis_max <= 0.105937 )
									ret := 0.625000
								if( basis_max > 0.105937 )
									ret := 0.000000
							if( basis_minus > -0.038789 )
								if( senkou_span_b <= 4.37153 )
									ret := 0.428571
								if( senkou_span_b > 4.37153 )
									ret := -0.750000 // sell
				if( tenkan_sen > 4.37488 )
					if( chinkou_span <= 4.41387 )
						if( basis_minus <= 0.157902 )
							if( senkou_span_a <= 4.41139 )
								if( basis_max <= 0.007523 )
									ret := 0.166667
								if( basis_max > 0.007523 )
									ret := -0.583333
							if( senkou_span_a > 4.41139 )
								if( kinjun_sen <= 4.51513 )
									ret := -0.621849
								if( kinjun_sen > 4.51513 )
									ret := -0.220049
						if( basis_minus > 0.157902 )
							if( senkou_span_b_displaced <= 3.836 )
								ret := -0.285714
							if( senkou_span_b_displaced > 3.836 )
								if( chinkou_span <= 4.37492 )
									ret := -1.000000 // sell
								if( chinkou_span > 4.37492 )
									ret := -0.750000 // sell
					if( chinkou_span > 4.41387 )
						if( senkou_span_a <= 4.55781 )
							if( basis_max <= -0.059144 )
								if( basis_minus <= 0.122546 )
									ret := -0.595745
								if( basis_minus > 0.122546 )
									ret := 0.312500
							if( basis_max > -0.059144 )
								if( chinkou_span <= 4.71712 )
									ret := 0.313253
								if( chinkou_span > 4.71712 )
									ret := 0.812865 // buy
						if( senkou_span_a > 4.55781 )
							if( chinkou_span <= 228.62 )
								if( kinjun_sen <= 202.755 )
									ret := 0.038871
								if( kinjun_sen > 202.755 )
									ret := -0.194213
							if( chinkou_span > 228.62 )
								if( tenkan_sen <= 255.259 )
									ret := 0.458626
								if( tenkan_sen > 255.259 )
									ret := -0.035168
			if( senkou_span_a > 310.315 )
				if( chinkou_span <= 234.169 )
					ret := 1.000000 // buy
				if( chinkou_span > 234.169 )
					if( kinjun_sen <= 338.29 )
						if( basis_max <= -0.3625 )
							if( chinkou_span <= 454.5 )
								if( basis_max <= -20.525 )
									ret := -0.857143 // sell
								if( basis_max > -20.525 )
									ret := -1.000000 // sell
							if( chinkou_span > 454.5 )
								ret := -0.500000
						if( basis_max > -0.3625 )
							ret := 0.600000
					if( kinjun_sen > 338.29 )
						if( senkou_span_a <= 362.547 )
							ret := 1.000000 // buy
						if( senkou_span_a > 362.547 )
							if( basis_max <= -23.3275 )
								ret := -1.000000 // sell
							if( basis_max > -23.3275 )
								if( tenkan_sen <= 397.344 )
									ret := -1.000000 // sell
								if( tenkan_sen > 397.344 )
									ret := 1.000000 // buy
	if( basis_max > 0.787057 )
		if( senkou_span_b_displaced <= 96.9005 )
			if( chinkou_span <= 48.1972 )
				if( kinjun_sen <= 45.6518 )
					if( basis_minus <= -1.76458 )
						if( chinkou_span <= 35.0558 )
							if( tenkan_sen <= 28.1575 )
								if( kinjun_sen <= 26.137 )
									ret := 0.000000
								if( kinjun_sen > 26.137 )
									ret := 0.857143 // buy
							if( tenkan_sen > 28.1575 )
								if( kinjun_sen <= 33.1242 )
									ret := -0.615385
								if( kinjun_sen > 33.1242 )
									ret := 0.333333
						if( chinkou_span > 35.0558 )
							if( basis_max <= 1.2858 )
								if( basis_max <= 0.828009 )
									ret := 0.500000
								if( basis_max > 0.828009 )
									ret := 0.980000 // buy
							if( basis_max > 1.2858 )
								if( tenkan_sen <= 34.6647 )
									ret := 1.000000 // buy
								if( tenkan_sen > 34.6647 )
									ret := 0.000000
					if( basis_minus > -1.76458 )
						if( tenkan_sen <= 29.8175 )
							if( chinkou_span <= 26.47 )
								if( chinkou_span <= 13.9833 )
									ret := 0.533333
								if( chinkou_span > 13.9833 )
									ret := -0.116883
							if( chinkou_span > 26.47 )
								if( senkou_span_b_displaced <= 31.3775 )
									ret := 0.266667
								if( senkou_span_b_displaced > 31.3775 )
									ret := 0.909091 // buy
						if( tenkan_sen > 29.8175 )
							if( tenkan_sen <= 30.5995 )
								ret := -1.000000 // sell
							if( tenkan_sen > 30.5995 )
								if( chinkou_span <= 38.638 )
									ret := -0.173913
								if( chinkou_span > 38.638 )
									ret := 0.736842 // buy
				if( kinjun_sen > 45.6518 )
					if( senkou_span_a_displaced <= 49.1208 )
						if( basis_max <= 3.80262 )
							if( senkou_span_a <= 51.2075 )
								if( tenkan_sen <= 48.9144 )
									ret := -0.600000
								if( tenkan_sen > 48.9144 )
									ret := 0.500000
							if( senkou_span_a > 51.2075 )
								ret := -1.000000 // sell
						if( basis_max > 3.80262 )
							ret := 1.000000 // buy
					if( senkou_span_a_displaced > 49.1208 )
						if( senkou_span_b <= 47.961 )
							ret := -0.200000
						if( senkou_span_b > 47.961 )
							if( basis_max <= 3.86909 )
								if( tenkan_sen <= 45.2274 )
									ret := -0.909091 // sell
								if( tenkan_sen > 45.2274 )
									ret := -1.000000 // sell
							if( basis_max > 3.86909 )
								if( chinkou_span <= 28.0891 )
									ret := -1.000000 // sell
								if( chinkou_span > 28.0891 )
									ret := 0.250000
			if( chinkou_span > 48.1972 )
				if( basis_max <= 16.4293 )
					if( senkou_span_b_displaced <= 37.631 )
						if( chinkou_span <= 54.2085 )
							ret := 0.500000
						if( chinkou_span > 54.2085 )
							ret := -1.000000 // sell
					if( senkou_span_b_displaced > 37.631 )
						if( senkou_span_b <= 94.8582 )
							if( senkou_span_b_displaced <= 63.8467 )
								if( basis_minus <= -2.41006 )
									ret := 0.951923 // buy
								if( basis_minus > -2.41006 )
									ret := 0.506849
							if( senkou_span_b_displaced > 63.8467 )
								if( chinkou_span <= 59.1768 )
									ret := -0.033898
								if( chinkou_span > 59.1768 )
									ret := 0.484663
						if( senkou_span_b > 94.8582 )
							if( senkou_span_a_displaced <= 99.79 )
								if( basis_max <= 2.13389 )
									ret := 0.808511 // buy
								if( basis_max > 2.13389 )
									ret := 0.960784 // buy
							if( senkou_span_a_displaced > 99.79 )
								if( chinkou_span <= 92.8671 )
									ret := 0.750000 // buy
								if( chinkou_span > 92.8671 )
									ret := 0.000000
				if( basis_max > 16.4293 )
					if( chinkou_span <= 89.3078 )
						if( senkou_span_a_displaced <= 97.6965 )
							ret := 0.250000
						if( senkou_span_a_displaced > 97.6965 )
							ret := -0.500000
					if( chinkou_span > 89.3078 )
						if( senkou_span_a_displaced <= 103.438 )
							ret := -1.000000 // sell
						if( senkou_span_a_displaced > 103.438 )
							ret := -0.500000
		if( senkou_span_b_displaced > 96.9005 )
			if( chinkou_span <= 104.46 )
				if( basis_max <= 5.88831 )
					if( basis_max <= 2.3736 )
						if( basis_minus <= -3.69076 )
							if( tenkan_sen <= 101.647 )
								if( basis_minus <= -8.03 )
									ret := 0.916667 // buy
								if( basis_minus > -8.03 )
									ret := 0.237705
							if( tenkan_sen > 101.647 )
								if( basis_minus <= -4.09645 )
									ret := -0.500000
								if( basis_minus > -4.09645 )
									ret := 0.285714
						if( basis_minus > -3.69076 )
							if( basis_minus <= 8.38698 )
								if( senkou_span_a <= 101.597 )
									ret := -0.257143
								if( senkou_span_a > 101.597 )
									ret := -0.624339
							if( basis_minus > 8.38698 )
								ret := 1.000000 // buy
					if( basis_max > 2.3736 )
						if( senkou_span_b <= 92.1846 )
							if( senkou_span_a_displaced <= 93.5938 )
								ret := -0.200000
							if( senkou_span_a_displaced > 93.5938 )
								if( basis_max <= 4.71006 )
									ret := -1.000000 // sell
								if( basis_max > 4.71006 )
									ret := -0.750000 // sell
						if( senkou_span_b > 92.1846 )
							if( kinjun_sen <= 105.531 )
								if( basis_max <= 4.52919 )
									ret := 0.923913 // buy
								if( basis_max > 4.52919 )
									ret := -0.250000
							if( kinjun_sen > 105.531 )
								if( kinjun_sen <= 125.216 )
									ret := -0.137931
								if( kinjun_sen > 125.216 )
									ret := 0.913043 // buy
				if( basis_max > 5.88831 )
					if( chinkou_span <= 35.835 )
						ret := -0.500000
					if( chinkou_span > 35.835 )
						if( basis_minus <= -8.37382 )
							if( basis_minus <= -47.3138 )
								ret := -0.500000
							if( basis_minus > -47.3138 )
								if( basis_minus <= -22.5163 )
									ret := -1.000000 // sell
								if( basis_minus > -22.5163 )
									ret := -0.777778 // sell
						if( basis_minus > -8.37382 )
							ret := -0.250000
			if( chinkou_span > 104.46 )
				if( tenkan_sen <= 108.728 )
					if( kinjun_sen <= 108.822 )
						if( basis_max <= 2.30375 )
							if( senkou_span_a_displaced <= 84.2737 )
								ret := -0.333333
							if( senkou_span_a_displaced > 84.2737 )
								if( senkou_span_a <= 96.1372 )
									ret := 1.000000 // buy
								if( senkou_span_a > 96.1372 )
									ret := 0.230769
						if( basis_max > 2.30375 )
							ret := -0.750000 // sell
					if( kinjun_sen > 108.822 )
						if( senkou_span_b_displaced <= 115.093 )
							ret := 0.200000
						if( senkou_span_b_displaced > 115.093 )
							if( tenkan_sen <= 103.14 )
								ret := 0.428571
							if( tenkan_sen > 103.14 )
								if( chinkou_span <= 107.834 )
									ret := 1.000000 // buy
								if( chinkou_span > 107.834 )
									ret := 0.896552 // buy
				if( tenkan_sen > 108.728 )
					if( senkou_span_b <= 116.951 )
						if( chinkou_span <= 120.003 )
							if( basis_max <= 0.830513 )
								ret := -0.250000
							if( basis_max > 0.830513 )
								if( chinkou_span <= 107.471 )
									ret := -0.666667
								if( chinkou_span > 107.471 )
									ret := -0.965517 // sell
						if( chinkou_span > 120.003 )
							ret := -0.250000
					if( senkou_span_b > 116.951 )
						if( senkou_span_a_displaced <= 133.155 )
							if( chinkou_span <= 114.323 )
								if( basis_minus <= -3.90405 )
									ret := 1.000000 // buy
								if( basis_minus > -3.90405 )
									ret := -0.296296
							if( chinkou_span > 114.323 )
								if( senkou_span_b <= 132.636 )
									ret := 0.402174
								if( senkou_span_b > 132.636 )
									ret := 0.931818 // buy
						if( senkou_span_a_displaced > 133.155 )
							if( chinkou_span <= 231.002 )
								if( senkou_span_a <= 234.085 )
									ret := 0.100645
								if( senkou_span_a > 234.085 )
									ret := -0.595890
							if( chinkou_span > 231.002 )
								if( tenkan_sen <= 311.754 )
									ret := 0.439926
								if( tenkan_sen > 311.754 )
									ret := -0.183908
	
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
float op_operation = decision_tree_0_GME_15Min_320de0fd(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)

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


