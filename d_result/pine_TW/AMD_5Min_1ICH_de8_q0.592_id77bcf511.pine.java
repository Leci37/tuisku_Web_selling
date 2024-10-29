//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: AMD_5Min_1ICH_77bcf511 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMD_5Min_1ICH_77bcf511", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMD_5Min_77bcf511(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=0.7, min_samples_leaf=7,min_samples_split=10, random_state=843828734)
	if( senkou_span_a_displaced <= 96.5738 )
		if( chinkou_span <= 97.7986 )
			if( chinkou_span <= 86.3107 )
				if( tenkan_sen <= 85.3762 )
					if( senkou_span_b_displaced <= 84.7927 )
						if( tenkan_sen <= 81.4857 )
							if( basis_minus <= -0.290971 )
								ret := 0.000000
							if( basis_minus > -0.290971 )
								if( senkou_span_a_displaced <= 81.4533 )
									ret := 0.571429
								if( senkou_span_a_displaced > 81.4533 )
									ret := 1.000000 // buy
						if( tenkan_sen > 81.4857 )
							if( basis_max <= -0.137431 )
								ret := 0.687500
							if( basis_max > -0.137431 )
								if( tenkan_sen <= 81.8823 )
									ret := -0.024691
								if( tenkan_sen > 81.8823 )
									ret := -0.418848
					if( senkou_span_b_displaced > 84.7927 )
						if( senkou_span_b_displaced <= 85.2233 )
							if( senkou_span_b_displaced <= 85.015 )
								if( basis_max <= 0.021556 )
									ret := 0.977273 // buy
								if( basis_max > 0.021556 )
									ret := 0.750000 // buy
							if( senkou_span_b_displaced > 85.015 )
								if( basis_max <= 0.32681 )
									ret := 0.230769
								if( basis_max > 0.32681 )
									ret := 1.000000 // buy
						if( senkou_span_b_displaced > 85.2233 )
							if( senkou_span_a_displaced <= 85.8489 )
								if( tenkan_sen <= 84.63 )
									ret := -0.130435
								if( tenkan_sen > 84.63 )
									ret := -0.692308
							if( senkou_span_a_displaced > 85.8489 )
								if( senkou_span_b_displaced <= 88.1951 )
									ret := 0.850000 // buy
								if( senkou_span_b_displaced > 88.1951 )
									ret := -0.041667
				if( tenkan_sen > 85.3762 )
					if( senkou_span_a_displaced <= 87.115 )
						if( senkou_span_a_displaced <= 86.3688 )
							if( basis_minus <= 0.435799 )
								ret := 0.047619
							if( basis_minus > 0.435799 )
								ret := -0.500000
						if( senkou_span_a_displaced > 86.3688 )
							if( kinjun_sen <= 86.0754 )
								if( senkou_span_a <= 85.6319 )
									ret := -0.777778 // sell
								if( senkou_span_a > 85.6319 )
									ret := -0.976744 // sell
							if( kinjun_sen > 86.0754 )
								if( chinkou_span <= 84.8945 )
									ret := 0.714286 // buy
								if( chinkou_span > 84.8945 )
									ret := -0.606897
					if( senkou_span_a_displaced > 87.115 )
						if( senkou_span_a_displaced <= 89.459 )
							if( tenkan_sen <= 89.9592 )
								if( chinkou_span <= 85.9012 )
									ret := 0.905660 // buy
								if( chinkou_span > 85.9012 )
									ret := 0.312500
							if( tenkan_sen > 89.9592 )
								ret := -0.250000
						if( senkou_span_a_displaced > 89.459 )
							ret := -1.000000 // sell
			if( chinkou_span > 86.3107 )
				if( kinjun_sen <= 94.5846 )
					if( basis_max <= 0.173566 )
						if( senkou_span_a_displaced <= 94.1623 )
							if( tenkan_sen <= 94.405 )
								if( chinkou_span <= 91.4985 )
									ret := 0.190123
								if( chinkou_span > 91.4985 )
									ret := 0.926316 // buy
							if( tenkan_sen > 94.405 )
								if( basis_max <= -0.567957 )
									ret := 0.142857
								if( basis_max > -0.567957 )
									ret := -0.732143 // sell
						if( senkou_span_a_displaced > 94.1623 )
							if( senkou_span_a_displaced <= 95.2718 )
								if( senkou_span_b_displaced <= 94.5436 )
									ret := 0.872549 // buy
								if( senkou_span_b_displaced > 94.5436 )
									ret := 0.518248
							if( senkou_span_a_displaced > 95.2718 )
								if( senkou_span_a <= 94.3944 )
									ret := -0.750000 // sell
								if( senkou_span_a > 94.3944 )
									ret := 0.727273 // buy
					if( basis_max > 0.173566 )
						if( basis_minus <= -0.166066 )
							if( basis_minus <= -0.358212 )
								if( tenkan_sen <= 84.9725 )
									ret := 1.000000 // buy
								if( tenkan_sen > 84.9725 )
									ret := 0.320000
							if( basis_minus > -0.358212 )
								if( basis_max <= 0.19283 )
									ret := 0.687500
								if( basis_max > 0.19283 )
									ret := 0.972973 // buy
						if( basis_minus > -0.166066 )
							if( tenkan_sen <= 87.1127 )
								ret := 0.526316
							if( tenkan_sen > 87.1127 )
								ret := 0.000000
				if( kinjun_sen > 94.5846 )
					if( senkou_span_a_displaced <= 94.3013 )
						if( senkou_span_b <= 94.6043 )
							ret := 0.352941
						if( senkou_span_b > 94.6043 )
							if( chinkou_span <= 94.8637 )
								ret := -1.000000 // sell
							if( chinkou_span > 94.8637 )
								ret := -0.500000
					if( senkou_span_a_displaced > 94.3013 )
						if( chinkou_span <= 95.045 )
							if( chinkou_span <= 93.8088 )
								ret := 0.636364
							if( chinkou_span > 93.8088 )
								if( basis_max <= 0.143838 )
									ret := -0.201183
								if( basis_max > 0.143838 )
									ret := -0.684932
						if( chinkou_span > 95.045 )
							if( senkou_span_a <= 95.8819 )
								if( chinkou_span <= 96.369 )
									ret := 0.165441
								if( chinkou_span > 96.369 )
									ret := 0.771605 // buy
							if( senkou_span_a > 95.8819 )
								if( chinkou_span <= 96.959 )
									ret := -0.110360
								if( chinkou_span > 96.959 )
									ret := 0.247059
		if( chinkou_span > 97.7986 )
			if( kinjun_sen <= 97.169 )
				if( senkou_span_b <= 95.9224 )
					if( senkou_span_a <= 95.7834 )
						ret := 1.000000 // buy
					if( senkou_span_a > 95.7834 )
						if( basis_max <= -0.268762 )
							if( chinkou_span <= 98.3522 )
								ret := 0.900000 // buy
							if( chinkou_span > 98.3522 )
								ret := 1.000000 // buy
						if( basis_max > -0.268762 )
							if( tenkan_sen <= 96.5484 )
								ret := 0.500000
							if( tenkan_sen > 96.5484 )
								ret := 0.846154 // buy
				if( senkou_span_b > 95.9224 )
					if( chinkou_span <= 103.557 )
						ret := 1.000000 // buy
					if( chinkou_span > 103.557 )
						ret := 0.909091 // buy
			if( kinjun_sen > 97.169 )
				if( kinjun_sen <= 98 )
					if( tenkan_sen <= 98.2611 )
						ret := 0.375000
					if( tenkan_sen > 98.2611 )
						ret := -0.666667
				if( kinjun_sen > 98 )
					ret := 0.642857
	if( senkou_span_a_displaced > 96.5738 )
		if( chinkou_span <= 101.101 )
			if( kinjun_sen <= 97.7375 )
				if( basis_minus <= 0.09875 )
					if( chinkou_span <= 97.145 )
						if( chinkou_span <= 95.9407 )
							if( basis_max <= 0.122874 )
								if( tenkan_sen <= 97.1247 )
									ret := -0.779070 // sell
								if( tenkan_sen > 97.1247 )
									ret := 0.166667
							if( basis_max > 0.122874 )
								if( senkou_span_a_displaced <= 98.6043 )
									ret := 0.068493
								if( senkou_span_a_displaced > 98.6043 )
									ret := -0.916667 // sell
						if( chinkou_span > 95.9407 )
							if( basis_max <= 0.413686 )
								if( chinkou_span <= 96.0121 )
									ret := 0.516129
								if( chinkou_span > 96.0121 )
									ret := -0.059859
							if( basis_max > 0.413686 )
								if( tenkan_sen <= 96.5923 )
									ret := 0.952381 // buy
								if( tenkan_sen > 96.5923 )
									ret := 0.125000
					if( chinkou_span > 97.145 )
						if( chinkou_span <= 97.5005 )
							if( senkou_span_b_displaced <= 97.2575 )
								if( kinjun_sen <= 97.025 )
									ret := 0.416667
								if( kinjun_sen > 97.025 )
									ret := 0.058824
							if( senkou_span_b_displaced > 97.2575 )
								if( tenkan_sen <= 97.0375 )
									ret := 0.916667 // buy
								if( tenkan_sen > 97.0375 )
									ret := 0.533333
						if( chinkou_span > 97.5005 )
							if( basis_minus <= -0.03625 )
								if( senkou_span_b_displaced <= 96.4841 )
									ret := 0.500000
								if( senkou_span_b_displaced > 96.4841 )
									ret := 0.923077 // buy
							if( basis_minus > -0.03625 )
								if( chinkou_span <= 97.6707 )
									ret := 0.823529 // buy
								if( chinkou_span > 97.6707 )
									ret := 0.285714
				if( basis_minus > 0.09875 )
					if( senkou_span_b <= 96.5764 )
						if( tenkan_sen <= 97.07 )
							if( tenkan_sen <= 96.5621 )
								ret := -0.937500 // sell
							if( tenkan_sen > 96.5621 )
								ret := -0.642857
						if( tenkan_sen > 97.07 )
							if( tenkan_sen <= 97.0963 )
								ret := -1.000000 // sell
							if( tenkan_sen > 97.0963 )
								ret := -0.900000 // sell
					if( senkou_span_b > 96.5764 )
						if( basis_max <= -0.121397 )
							if( chinkou_span <= 96.6792 )
								ret := 0.066667
							if( chinkou_span > 96.6792 )
								if( senkou_span_b_displaced <= 96.3985 )
									ret := 0.000000
								if( senkou_span_b_displaced > 96.3985 )
									ret := -0.877193 // sell
						if( basis_max > -0.121397 )
							if( senkou_span_b <= 97.0675 )
								if( senkou_span_a_displaced <= 97.222 )
									ret := 0.038462
								if( senkou_span_a_displaced > 97.222 )
									ret := -0.555556
							if( senkou_span_b > 97.0675 )
								if( chinkou_span <= 97.095 )
									ret := -0.740741 // sell
								if( chinkou_span > 97.095 )
									ret := 0.000000
			if( kinjun_sen > 97.7375 )
				if( senkou_span_a <= 98.7818 )
					if( chinkou_span <= 97.0875 )
						if( tenkan_sen <= 98.1262 )
							if( basis_max <= 0.105379 )
								ret := -0.562500
							if( basis_max > 0.105379 )
								if( basis_max <= 0.382096 )
									ret := -0.944444 // sell
								if( basis_max > 0.382096 )
									ret := -0.636364
						if( tenkan_sen > 98.1262 )
							ret := -1.000000 // sell
					if( chinkou_span > 97.0875 )
						if( basis_minus <= 0.355361 )
							if( kinjun_sen <= 97.7693 )
								ret := -0.923077 // sell
							if( kinjun_sen > 97.7693 )
								if( senkou_span_a_displaced <= 97.7056 )
									ret := 0.136364
								if( senkou_span_a_displaced > 97.7056 )
									ret := -0.320000
						if( basis_minus > 0.355361 )
							if( chinkou_span <= 98.0573 )
								ret := -0.900000 // sell
							if( chinkou_span > 98.0573 )
								ret := -1.000000 // sell
				if( senkou_span_a > 98.7818 )
					if( tenkan_sen <= 100.865 )
						if( senkou_span_b_displaced <= 99.7066 )
							if( chinkou_span <= 100.655 )
								if( basis_minus <= 1.32592 )
									ret := 0.405405
								if( basis_minus > 1.32592 )
									ret := 0.950000 // buy
							if( chinkou_span > 100.655 )
								ret := -0.500000
						if( senkou_span_b_displaced > 99.7066 )
							if( senkou_span_a_displaced <= 101.113 )
								if( chinkou_span <= 98.0192 )
									ret := -0.666667
								if( chinkou_span > 98.0192 )
									ret := -0.211982
							if( senkou_span_a_displaced > 101.113 )
								if( basis_minus <= -0.168137 )
									ret := 0.136364
								if( basis_minus > -0.168137 )
									ret := 0.875000 // buy
					if( tenkan_sen > 100.865 )
						if( senkou_span_b <= 101.232 )
							if( kinjun_sen <= 101.008 )
								if( senkou_span_b_displaced <= 100.565 )
									ret := 0.000000
								if( senkou_span_b_displaced > 100.565 )
									ret := -0.655172
							if( kinjun_sen > 101.008 )
								if( senkou_span_a <= 101.624 )
									ret := 0.093023
								if( senkou_span_a > 101.624 )
									ret := -0.333333
						if( senkou_span_b > 101.232 )
							if( chinkou_span <= 100.296 )
								if( senkou_span_a_displaced <= 101.524 )
									ret := -0.615385
								if( senkou_span_a_displaced > 101.524 )
									ret := -0.934066 // sell
							if( chinkou_span > 100.296 )
								if( senkou_span_b_displaced <= 101.771 )
									ret := -0.081081
								if( senkou_span_b_displaced > 101.771 )
									ret := -0.559701
		if( chinkou_span > 101.101 )
			if( senkou_span_a <= 102.251 )
				if( kinjun_sen <= 100.932 )
					if( tenkan_sen <= 97.8876 )
						if( senkou_span_a_displaced <= 97.6072 )
							ret := -0.461538
						if( senkou_span_a_displaced > 97.6072 )
							ret := -0.833333 // sell
					if( tenkan_sen > 97.8876 )
						if( chinkou_span <= 102.315 )
							if( basis_minus <= -0.063395 )
								if( basis_minus <= -0.212784 )
									ret := 0.435897
								if( basis_minus > -0.212784 )
									ret := 1.000000 // buy
							if( basis_minus > -0.063395 )
								if( chinkou_span <= 101.253 )
									ret := -0.266667
								if( chinkou_span > 101.253 )
									ret := 0.328947
						if( chinkou_span > 102.315 )
							if( basis_max <= -0.998592 )
								ret := 0.526316
							if( basis_max > -0.998592 )
								if( basis_minus <= 0.015701 )
									ret := 0.400000
								if( basis_minus > 0.015701 )
									ret := 0.942675 // buy
				if( kinjun_sen > 100.932 )
					if( chinkou_span <= 101.993 )
						if( basis_max <= 0.237636 )
							if( basis_minus <= -0.754817 )
								if( senkou_span_b <= 102.995 )
									ret := 1.000000 // buy
								if( senkou_span_b > 102.995 )
									ret := -0.230769
							if( basis_minus > -0.754817 )
								if( basis_max <= -0.327569 )
									ret := -0.684211
								if( basis_max > -0.327569 )
									ret := -0.058252
						if( basis_max > 0.237636 )
							if( senkou_span_b_displaced <= 101.256 )
								ret := 0.950000 // buy
							if( senkou_span_b_displaced > 101.256 )
								if( senkou_span_b <= 102.109 )
									ret := -0.227273
								if( senkou_span_b > 102.109 )
									ret := 0.545455
					if( chinkou_span > 101.993 )
						if( chinkou_span <= 102.878 )
							if( senkou_span_a_displaced <= 101.562 )
								if( kinjun_sen <= 101.977 )
									ret := 0.621622
								if( kinjun_sen > 101.977 )
									ret := -0.545455
							if( senkou_span_a_displaced > 101.562 )
								if( senkou_span_a_displaced <= 102.664 )
									ret := 0.130952
								if( senkou_span_a_displaced > 102.664 )
									ret := 0.670732
						if( chinkou_span > 102.878 )
							if( kinjun_sen <= 101.867 )
								if( chinkou_span <= 103.771 )
									ret := 0.162162
								if( chinkou_span > 103.771 )
									ret := 0.916667 // buy
							if( kinjun_sen > 101.867 )
								if( senkou_span_a <= 102.21 )
									ret := 0.952381 // buy
								if( senkou_span_a > 102.21 )
									ret := 0.600000
			if( senkou_span_a > 102.251 )
				if( chinkou_span <= 106.615 )
					if( kinjun_sen <= 106.858 )
						if( chinkou_span <= 103.345 )
							if( tenkan_sen <= 102.432 )
								if( tenkan_sen <= 102.26 )
									ret := 0.503876
								if( tenkan_sen > 102.26 )
									ret := 0.035714
							if( tenkan_sen > 102.432 )
								if( senkou_span_a_displaced <= 104.245 )
									ret := -0.273353
								if( senkou_span_a_displaced > 104.245 )
									ret := -0.675393
						if( chinkou_span > 103.345 )
							if( tenkan_sen <= 105.596 )
								if( kinjun_sen <= 103.809 )
									ret := 0.396825
								if( kinjun_sen > 103.809 )
									ret := 0.086745
							if( tenkan_sen > 105.596 )
								if( tenkan_sen <= 106.16 )
									ret := -0.288321
								if( tenkan_sen > 106.16 )
									ret := -0.007317
					if( kinjun_sen > 106.858 )
						if( senkou_span_b <= 108.163 )
							if( kinjun_sen <= 107.647 )
								if( senkou_span_b <= 107.082 )
									ret := -0.760274 // sell
								if( senkou_span_b > 107.082 )
									ret := -0.488722
							if( kinjun_sen > 107.647 )
								if( senkou_span_a_displaced <= 108.903 )
									ret := 0.258065
								if( senkou_span_a_displaced > 108.903 )
									ret := -1.000000 // sell
						if( senkou_span_b > 108.163 )
							if( kinjun_sen <= 109.433 )
								if( senkou_span_b <= 109.615 )
									ret := -0.756522 // sell
								if( senkou_span_b > 109.615 )
									ret := 0.000000
							if( kinjun_sen > 109.433 )
								if( chinkou_span <= 102.902 )
									ret := -0.750000 // sell
								if( chinkou_span > 102.902 )
									ret := -1.000000 // sell
				if( chinkou_span > 106.615 )
					if( senkou_span_a <= 107.617 )
						if( kinjun_sen <= 105.863 )
							if( senkou_span_b_displaced <= 105.42 )
								if( kinjun_sen <= 102.452 )
									ret := 0.166667
								if( kinjun_sen > 102.452 )
									ret := 0.828897 // buy
							if( senkou_span_b_displaced > 105.42 )
								if( senkou_span_b <= 105.63 )
									ret := -0.375000
								if( senkou_span_b > 105.63 )
									ret := 0.732394 // buy
						if( kinjun_sen > 105.863 )
							if( senkou_span_a_displaced <= 105.052 )
								if( basis_minus <= 0.715 )
									ret := 0.071429
								if( basis_minus > 0.715 )
									ret := -0.580000
							if( senkou_span_a_displaced > 105.052 )
								if( chinkou_span <= 107.232 )
									ret := 0.056133
								if( chinkou_span > 107.232 )
									ret := 0.493896
					if( senkou_span_a > 107.617 )
						if( senkou_span_b <= 216.885 )
							if( senkou_span_a_displaced <= 211.983 )
								if( basis_max <= -1.23625 )
									ret := 0.335294
								if( basis_max > -1.23625 )
									ret := 0.041358
							if( senkou_span_a_displaced > 211.983 )
								if( chinkou_span <= 212.868 )
									ret := 0.878788 // buy
								if( chinkou_span > 212.868 )
									ret := 0.312500
						if( senkou_span_b > 216.885 )
							if( basis_max <= 3.08501 )
								if( basis_max <= 2.53803 )
									ret := -1.000000 // sell
								if( basis_max > 2.53803 )
									ret := -0.875000 // sell
							if( basis_max > 3.08501 )
								ret := -0.263158
	
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
float op_operation = decision_tree_0_AMD_5Min_77bcf511(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)

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


