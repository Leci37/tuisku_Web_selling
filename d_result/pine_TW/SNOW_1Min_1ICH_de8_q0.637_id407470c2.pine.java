//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: SNOW_1Min_1ICH_407470c2 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNOW_1Min_1ICH_407470c2", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNOW_1Min_407470c2(tenkan_sen, basis_minus, cross_up_tenkan_kinjunInt, senkou_span_a, cross_dn_tenkan_kinjunInt, senkou_span_b, chinkou_span, senkou_span_a_displaced, senkou_span_b_displaced, kinjun_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( tenkan_sen <= 111.847 )
		if( chinkou_span <= 111.39 )
			if( senkou_span_b <= 110.233 )
				if( basis_minus <= 0.756312 )
					if( senkou_span_a_displaced <= 109.78 )
						if( basis_max <= 0.121205 )
							if( chinkou_span <= 108.818 )
								if( senkou_span_b_displaced <= 109.112 )
									ret := 0.066445
								if( senkou_span_b_displaced > 109.112 )
									ret := -0.707071 // sell
							if( chinkou_span > 108.818 )
								if( chinkou_span <= 110.111 )
									ret := 0.286119
								if( chinkou_span > 110.111 )
									ret := 0.544379
						if( basis_max > 0.121205 )
							if( senkou_span_a <= 109.237 )
								if( tenkan_sen <= 108.635 )
									ret := -0.040541
								if( tenkan_sen > 108.635 )
									ret := -0.837838 // sell
							if( senkou_span_a > 109.237 )
								ret := 0.823529 // buy
					if( senkou_span_a_displaced > 109.78 )
						if( senkou_span_b <= 110.06 )
							if( chinkou_span <= 109.33 )
								if( senkou_span_a <= 109.437 )
									ret := -0.364865
								if( senkou_span_a > 109.437 )
									ret := -0.838095 // sell
							if( chinkou_span > 109.33 )
								if( tenkan_sen <= 109.721 )
									ret := 0.375566
								if( tenkan_sen > 109.721 )
									ret := -0.155483
						if( senkou_span_b > 110.06 )
							if( basis_max <= -0.028235 )
								if( senkou_span_b <= 110.122 )
									ret := -0.626667
								if( senkou_span_b > 110.122 )
									ret := 0.230000
							if( basis_max > -0.028235 )
								if( chinkou_span <= 110.229 )
									ret := 0.218107
								if( chinkou_span > 110.229 )
									ret := 0.616601
				if( basis_minus > 0.756312 )
					if( tenkan_sen <= 109.462 )
						ret := -0.700000 // sell
					if( tenkan_sen > 109.462 )
						ret := -1.000000 // sell
			if( senkou_span_b > 110.233 )
				if( senkou_span_b_displaced <= 110.199 )
					if( basis_minus <= -0.10375 )
						if( senkou_span_b_displaced <= 109.972 )
							ret := 0.888889 // buy
						if( senkou_span_b_displaced > 109.972 )
							ret := 0.416667
					if( basis_minus > -0.10375 )
						if( senkou_span_a_displaced <= 110.491 )
							if( kinjun_sen <= 110.642 )
								if( basis_max <= -0.019434 )
									ret := -0.428571
								if( basis_max > -0.019434 )
									ret := -0.743590 // sell
							if( kinjun_sen > 110.642 )
								if( senkou_span_a <= 110.71 )
									ret := -1.000000 // sell
								if( senkou_span_a > 110.71 )
									ret := -0.878378 // sell
						if( senkou_span_a_displaced > 110.491 )
							if( chinkou_span <= 109.672 )
								ret := -0.937500 // sell
							if( chinkou_span > 109.672 )
								if( senkou_span_a_displaced <= 110.525 )
									ret := 0.066667
								if( senkou_span_a_displaced > 110.525 )
									ret := -0.083333
				if( senkou_span_b_displaced > 110.199 )
					if( tenkan_sen <= 110.971 )
						if( chinkou_span <= 110.028 )
							if( senkou_span_a_displaced <= 110.295 )
								ret := 0.411765
							if( senkou_span_a_displaced > 110.295 )
								if( senkou_span_a <= 110.311 )
									ret := -0.805785 // sell
								if( senkou_span_a > 110.311 )
									ret := -0.505929
						if( chinkou_span > 110.028 )
							if( basis_minus <= -0.34393 )
								if( basis_max <= 0.170884 )
									ret := 0.345528
								if( basis_max > 0.170884 )
									ret := 0.773913 // buy
							if( basis_minus > -0.34393 )
								if( tenkan_sen <= 110.926 )
									ret := 0.105434
								if( tenkan_sen > 110.926 )
									ret := -0.452632
					if( tenkan_sen > 110.971 )
						if( chinkou_span <= 110.909 )
							if( basis_max <= 0.377918 )
								if( senkou_span_a <= 111.94 )
									ret := -0.501908
								if( senkou_span_a > 111.94 )
									ret := 0.333333
							if( basis_max > 0.377918 )
								ret := 0.833333 // buy
						if( chinkou_span > 110.909 )
							if( chinkou_span <= 111.371 )
								if( senkou_span_b_displaced <= 113.85 )
									ret := -0.180987
								if( senkou_span_b_displaced > 113.85 )
									ret := 0.406250
							if( chinkou_span > 111.371 )
								if( senkou_span_b <= 111.799 )
									ret := -0.250000
								if( senkou_span_b > 111.799 )
									ret := -0.937500 // sell
		if( chinkou_span > 111.39 )
			if( senkou_span_a <= 111.378 )
				if( senkou_span_b <= 109.542 )
					if( senkou_span_b_displaced <= 110.319 )
						ret := 1.000000 // buy
					if( senkou_span_b_displaced > 110.319 )
						if( chinkou_span <= 113.06 )
							if( tenkan_sen <= 110.309 )
								ret := -0.727273 // sell
							if( tenkan_sen > 110.309 )
								ret := -0.133333
						if( chinkou_span > 113.06 )
							ret := -0.961538 // sell
				if( senkou_span_b > 109.542 )
					if( tenkan_sen <= 109.995 )
						if( kinjun_sen <= 109.819 )
							if( senkou_span_a <= 109.785 )
								if( senkou_span_b_displaced <= 110.114 )
									ret := 1.000000 // buy
								if( senkou_span_b_displaced > 110.114 )
									ret := 0.333333
							if( senkou_span_a > 109.785 )
								ret := 0.100000
						if( kinjun_sen > 109.819 )
							if( senkou_span_b <= 109.896 )
								ret := -0.750000 // sell
							if( senkou_span_b > 109.896 )
								ret := -0.894737 // sell
					if( tenkan_sen > 109.995 )
						if( tenkan_sen <= 110.379 )
							if( chinkou_span <= 113.026 )
								ret := 1.000000 // buy
							if( chinkou_span > 113.026 )
								ret := 0.777778 // buy
						if( tenkan_sen > 110.379 )
							if( basis_max <= -0.291687 )
								ret := -0.866667 // sell
							if( basis_max > -0.291687 )
								if( senkou_span_b <= 111.558 )
									ret := 0.669988
								if( senkou_span_b > 111.558 )
									ret := -0.062500
			if( senkou_span_a > 111.378 )
				if( senkou_span_b_displaced <= 110.644 )
					if( basis_minus <= 0.753925 )
						if( senkou_span_a <= 111.48 )
							ret := 0.615385
						if( senkou_span_a > 111.48 )
							ret := 1.000000 // buy
					if( basis_minus > 0.753925 )
						ret := 0.473684
				if( senkou_span_b_displaced > 110.644 )
					if( chinkou_span <= 112.511 )
						if( senkou_span_a_displaced <= 111.86 )
							if( basis_minus <= 0.002285 )
								if( basis_minus <= -0.082001 )
									ret := -0.050633
								if( basis_minus > -0.082001 )
									ret := -0.623077
							if( basis_minus > 0.002285 )
								if( senkou_span_a <= 111.533 )
									ret := -0.340909
								if( senkou_span_a > 111.533 )
									ret := 0.383459
						if( senkou_span_a_displaced > 111.86 )
							if( senkou_span_b <= 111.842 )
								if( basis_max <= 0.06345 )
									ret := 0.323077
								if( basis_max > 0.06345 )
									ret := 0.925000 // buy
							if( senkou_span_b > 111.842 )
								if( senkou_span_a <= 111.907 )
									ret := 0.326007
								if( senkou_span_a > 111.907 )
									ret := -0.552632
					if( chinkou_span > 112.511 )
						if( senkou_span_a <= 111.712 )
							if( basis_max <= 0.045576 )
								ret := 1.000000 // buy
							if( basis_max > 0.045576 )
								ret := 0.909091 // buy
						if( senkou_span_a > 111.712 )
							if( basis_minus <= 0.124246 )
								ret := 0.583333
							if( basis_minus > 0.124246 )
								ret := 0.947368 // buy
	if( tenkan_sen > 111.847 )
		if( senkou_span_a_displaced <= 118.637 )
			if( senkou_span_a_displaced <= 117.972 )
				if( kinjun_sen <= 117.614 )
					if( kinjun_sen <= 114.428 )
						if( senkou_span_b_displaced <= 115.25 )
							if( senkou_span_b_displaced <= 111.732 )
								if( chinkou_span <= 112.059 )
									ret := -0.582090
								if( chinkou_span > 112.059 )
									ret := 0.077364
							if( senkou_span_b_displaced > 111.732 )
								if( basis_max <= -0.284515 )
									ret := 0.409722
								if( basis_max > -0.284515 )
									ret := -0.012162
						if( senkou_span_b_displaced > 115.25 )
							if( chinkou_span <= 117.25 )
								if( basis_max <= 0.016523 )
									ret := 0.537037
								if( basis_max > 0.016523 )
									ret := 0.829268 // buy
							if( chinkou_span > 117.25 )
								ret := -0.250000
					if( kinjun_sen > 114.428 )
						if( chinkou_span <= 114.568 )
							if( chinkou_span <= 113.382 )
								if( chinkou_span <= 113.287 )
									ret := -0.951220 // sell
								if( chinkou_span > 113.287 )
									ret := -0.769231 // sell
							if( chinkou_span > 113.382 )
								if( senkou_span_a <= 114.603 )
									ret := -0.283069
								if( senkou_span_a > 114.603 )
									ret := -0.551205
						if( chinkou_span > 114.568 )
							if( chinkou_span <= 116.62 )
								if( senkou_span_a <= 115.553 )
									ret := 0.118625
								if( senkou_span_a > 115.553 )
									ret := -0.274892
							if( chinkou_span > 116.62 )
								if( kinjun_sen <= 114.816 )
									ret := -0.821429 // sell
								if( kinjun_sen > 114.816 )
									ret := 0.380174
				if( kinjun_sen > 117.614 )
					if( tenkan_sen <= 119.047 )
						if( chinkou_span <= 118.478 )
							if( senkou_span_b_displaced <= 117.273 )
								if( tenkan_sen <= 117.72 )
									ret := -1.000000 // sell
								if( tenkan_sen > 117.72 )
									ret := -0.583333
							if( senkou_span_b_displaced > 117.273 )
								if( chinkou_span <= 117.632 )
									ret := -0.229730
								if( chinkou_span > 117.632 )
									ret := 0.213483
						if( chinkou_span > 118.478 )
							if( senkou_span_a_displaced <= 117.06 )
								if( tenkan_sen <= 118.32 )
									ret := 0.944444 // buy
								if( tenkan_sen > 118.32 )
									ret := -0.207547
							if( senkou_span_a_displaced > 117.06 )
								if( chinkou_span <= 118.722 )
									ret := 0.456522
								if( chinkou_span > 118.722 )
									ret := 0.790960 // buy
					if( tenkan_sen > 119.047 )
						if( basis_minus <= 3.03128 )
							if( kinjun_sen <= 119.015 )
								if( tenkan_sen <= 119.238 )
									ret := -0.666667
								if( tenkan_sen > 119.238 )
									ret := -0.967742 // sell
							if( kinjun_sen > 119.015 )
								if( senkou_span_b_displaced <= 117.357 )
									ret := -0.928571 // sell
								if( senkou_span_b_displaced > 117.357 )
									ret := 0.333333
						if( basis_minus > 3.03128 )
							ret := 0.692308
			if( senkou_span_a_displaced > 117.972 )
				if( basis_max <= 0.041753 )
					if( senkou_span_a <= 118.173 )
						if( senkou_span_a_displaced <= 118.082 )
							if( senkou_span_a <= 117.986 )
								if( chinkou_span <= 117.589 )
									ret := -0.923077 // sell
								if( chinkou_span > 117.589 )
									ret := -0.583333
							if( senkou_span_a > 117.986 )
								if( senkou_span_a_displaced <= 117.996 )
									ret := -0.583333
								if( senkou_span_a_displaced > 117.996 )
									ret := 0.000000
						if( senkou_span_a_displaced > 118.082 )
							if( basis_max <= 0.017918 )
								if( senkou_span_b <= 118.198 )
									ret := 0.533333
								if( senkou_span_b > 118.198 )
									ret := -0.120000
							if( basis_max > 0.017918 )
								if( chinkou_span <= 117.269 )
									ret := -0.846154 // sell
								if( chinkou_span > 117.269 )
									ret := -0.200000
					if( senkou_span_a > 118.173 )
						if( senkou_span_b <= 118.499 )
							if( tenkan_sen <= 119.145 )
								if( kinjun_sen <= 118.475 )
									ret := -0.854701 // sell
								if( kinjun_sen > 118.475 )
									ret := -0.566038
							if( tenkan_sen > 119.145 )
								ret := -1.000000 // sell
						if( senkou_span_b > 118.499 )
							if( basis_minus <= 0.769657 )
								if( basis_max <= -0.107051 )
									ret := 0.500000
								if( basis_max > -0.107051 )
									ret := -0.642857
							if( basis_minus > 0.769657 )
								if( basis_max <= -0.2525 )
									ret := -0.657143
								if( basis_max > -0.2525 )
									ret := -0.952381 // sell
				if( basis_max > 0.041753 )
					if( senkou_span_b <= 118.162 )
						if( chinkou_span <= 118.138 )
							if( basis_minus <= -0.254342 )
								if( basis_max <= 0.137816 )
									ret := -0.625000
								if( basis_max > 0.137816 )
									ret := -1.000000 // sell
							if( basis_minus > -0.254342 )
								if( kinjun_sen <= 118.165 )
									ret := -0.147541
								if( kinjun_sen > 118.165 )
									ret := -0.939394 // sell
						if( chinkou_span > 118.138 )
							if( kinjun_sen <= 117.677 )
								ret := 0.631579
							if( kinjun_sen > 117.677 )
								ret := -0.357143
					if( senkou_span_b > 118.162 )
						if( chinkou_span <= 117.75 )
							if( basis_minus <= -0.429001 )
								ret := 0.187500
							if( basis_minus > -0.429001 )
								ret := -0.777778 // sell
						if( chinkou_span > 117.75 )
							if( senkou_span_b_displaced <= 119.025 )
								if( kinjun_sen <= 118.331 )
									ret := 0.209677
								if( kinjun_sen > 118.331 )
									ret := 0.666667
							if( senkou_span_b_displaced > 119.025 )
								ret := 0.950000 // buy
		if( senkou_span_a_displaced > 118.637 )
			if( basis_minus <= 0.992498 )
				if( chinkou_span <= 119.471 )
					if( kinjun_sen <= 119.174 )
						if( senkou_span_a <= 114.371 )
							ret := -1.000000 // sell
						if( senkou_span_a > 114.371 )
							if( basis_minus <= -1.04047 )
								if( senkou_span_a_displaced <= 119.184 )
									ret := 0.000000
								if( senkou_span_a_displaced > 119.184 )
									ret := 0.897059 // buy
							if( basis_minus > -1.04047 )
								if( senkou_span_b_displaced <= 119.418 )
									ret := 0.200787
								if( senkou_span_b_displaced > 119.418 )
									ret := -0.518248
					if( kinjun_sen > 119.174 )
						if( chinkou_span <= 118.358 )
							if( senkou_span_a <= 119.02 )
								ret := -0.307692
							if( senkou_span_a > 119.02 )
								if( basis_max <= 0.12515 )
									ret := -0.729323 // sell
								if( basis_max > 0.12515 )
									ret := -0.923077 // sell
						if( chinkou_span > 118.358 )
							if( chinkou_span <= 119.057 )
								if( tenkan_sen <= 119.439 )
									ret := -0.578947
								if( tenkan_sen > 119.439 )
									ret := 0.281879
							if( chinkou_span > 119.057 )
								if( kinjun_sen <= 119.734 )
									ret := -0.020408
								if( kinjun_sen > 119.734 )
									ret := -0.659091
				if( chinkou_span > 119.471 )
					if( senkou_span_a <= 122.677 )
						if( kinjun_sen <= 122.441 )
							if( tenkan_sen <= 121.512 )
								if( senkou_span_b_displaced <= 121.963 )
									ret := 0.243775
								if( senkou_span_b_displaced > 121.963 )
									ret := 0.845794 // buy
							if( tenkan_sen > 121.512 )
								if( senkou_span_a_displaced <= 120.497 )
									ret := 0.950000 // buy
								if( senkou_span_a_displaced > 120.497 )
									ret := -0.167098
						if( kinjun_sen > 122.441 )
							if( senkou_span_a_displaced <= 122.189 )
								if( chinkou_span <= 121.554 )
									ret := 0.687500
								if( chinkou_span > 121.554 )
									ret := -0.642857
							if( senkou_span_a_displaced > 122.189 )
								if( senkou_span_a <= 122.637 )
									ret := 0.693939
								if( senkou_span_a > 122.637 )
									ret := 0.215686
					if( senkou_span_a > 122.677 )
						if( senkou_span_b <= 122.734 )
							if( senkou_span_a_displaced <= 122.17 )
								if( kinjun_sen <= 122.648 )
									ret := -0.400000
								if( kinjun_sen > 122.648 )
									ret := 0.750000 // buy
							if( senkou_span_a_displaced > 122.17 )
								if( basis_minus <= 0.177872 )
									ret := -0.311688
								if( basis_minus > 0.177872 )
									ret := -0.702381 // sell
						if( senkou_span_b > 122.734 )
							if( tenkan_sen <= 122.619 )
								if( chinkou_span <= 122.544 )
									ret := -1.000000 // sell
								if( chinkou_span > 122.544 )
									ret := -0.217391
							if( tenkan_sen > 122.619 )
								if( chinkou_span <= 122.506 )
									ret := -0.652174
								if( chinkou_span > 122.506 )
									ret := 0.005904
			if( basis_minus > 0.992498 )
				if( chinkou_span <= 122.312 )
					if( tenkan_sen <= 123.246 )
						ret := -0.916667 // sell
					if( tenkan_sen > 123.246 )
						ret := -1.000000 // sell
				if( chinkou_span > 122.312 )
					if( basis_minus <= 1.91875 )
						if( tenkan_sen <= 138.64 )
							if( chinkou_span <= 138.184 )
								if( senkou_span_b <= 135.74 )
									ret := -0.025157
								if( senkou_span_b > 135.74 )
									ret := -0.685714
							if( chinkou_span > 138.184 )
								if( senkou_span_b_displaced <= 135.62 )
									ret := 1.000000 // buy
								if( senkou_span_b_displaced > 135.62 )
									ret := 0.550000
						if( tenkan_sen > 138.64 )
							if( tenkan_sen <= 159.3 )
								if( kinjun_sen <= 158.851 )
									ret := -0.660167
								if( kinjun_sen > 158.851 )
									ret := -0.317460
							if( tenkan_sen > 159.3 )
								if( senkou_span_b_displaced <= 158.058 )
									ret := 0.115942
								if( senkou_span_b_displaced > 158.058 )
									ret := -0.664000
					if( basis_minus > 1.91875 )
						if( senkou_span_a_displaced <= 155.579 )
							if( senkou_span_a_displaced <= 146.661 )
								if( basis_minus <= 2.65924 )
									ret := 1.000000 // buy
								if( basis_minus > 2.65924 )
									ret := -0.555556
							if( senkou_span_a_displaced > 146.661 )
								if( senkou_span_b_displaced <= 154.28 )
									ret := 0.842105 // buy
								if( senkou_span_b_displaced > 154.28 )
									ret := 0.980769 // buy
						if( senkou_span_a_displaced > 155.579 )
							ret := -0.777778 // sell
	
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
float op_operation = decision_tree_0_SNOW_1Min_407470c2(tenkan_sen, basis_minus, cross_up_tenkan_kinjunInt, senkou_span_a, cross_dn_tenkan_kinjunInt, senkou_span_b, chinkou_span, senkou_span_a_displaced, senkou_span_b_displaced, kinjun_sen, basis_max)

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


