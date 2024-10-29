//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: ATOMUSDT_5Min_1ICH_b3ac46b8 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ATOMUSDT_5Min_1ICH_b3ac46b8", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ATOMUSDT_5Min_b3ac46b8(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( basis_max <= 0.020821 )
		if( kinjun_sen <= 12.5092 )
			if( chinkou_span <= 12.4352 )
				if( tenkan_sen <= 12.2746 )
					if( senkou_span_b_displaced <= 4.6095 )
						if( chinkou_span <= 4.58115 )
							if( basis_minus <= 0.024844 )
								if( senkou_span_a_displaced <= 4.15487 )
									ret := 0.163839
								if( senkou_span_a_displaced > 4.15487 )
									ret := 0.017614
							if( basis_minus > 0.024844 )
								if( tenkan_sen <= 4.43 )
									ret := -0.049072
								if( tenkan_sen > 4.43 )
									ret := -0.421512
						if( chinkou_span > 4.58115 )
							if( tenkan_sen <= 4.56798 )
								if( senkou_span_b_displaced <= 4.32712 )
									ret := -0.461538
								if( senkou_span_b_displaced > 4.32712 )
									ret := 0.767380 // buy
							if( tenkan_sen > 4.56798 )
								if( chinkou_span <= 4.69814 )
									ret := 0.165676
								if( chinkou_span > 4.69814 )
									ret := 0.697917
					if( senkou_span_b_displaced > 4.6095 )
						if( chinkou_span <= 4.68531 )
							if( kinjun_sen <= 4.70245 )
								if( senkou_span_a_displaced <= 4.64623 )
									ret := 0.033088
								if( senkou_span_a_displaced > 4.64623 )
									ret := -0.293035
							if( kinjun_sen > 4.70245 )
								if( senkou_span_a_displaced <= 4.69062 )
									ret := -0.128205
								if( senkou_span_a_displaced > 4.69062 )
									ret := -0.713092 // sell
						if( chinkou_span > 4.68531 )
							if( tenkan_sen <= 4.81643 )
								if( chinkou_span <= 4.82055 )
									ret := 0.109589
								if( chinkou_span > 4.82055 )
									ret := 0.597619
							if( tenkan_sen > 4.81643 )
								if( kinjun_sen <= 4.81697 )
									ret := -0.466258
								if( kinjun_sen > 4.81697 )
									ret := 0.036630
				if( tenkan_sen > 12.2746 )
					if( chinkou_span <= 12.2837 )
						if( kinjun_sen <= 12.4889 )
							if( senkou_span_b_displaced <= 12.4042 )
								if( senkou_span_a_displaced <= 12.3882 )
									ret := -0.378223
								if( senkou_span_a_displaced > 12.3882 )
									ret := 0.518519
							if( senkou_span_b_displaced > 12.4042 )
								if( kinjun_sen <= 12.4568 )
									ret := -0.854167 // sell
								if( kinjun_sen > 12.4568 )
									ret := -0.461538
						if( kinjun_sen > 12.4889 )
							if( senkou_span_a_displaced <= 12.5394 )
								if( basis_minus <= 0.068054 )
									ret := 1.000000 // buy
								if( basis_minus > 0.068054 )
									ret := 0.750000 // buy
							if( senkou_span_a_displaced > 12.5394 )
								if( basis_max <= -0.020375 )
									ret := 0.000000
								if( basis_max > -0.020375 )
									ret := 0.750000 // buy
					if( chinkou_span > 12.2837 )
						if( senkou_span_a_displaced <= 12.1861 )
							if( chinkou_span <= 12.4268 )
								ret := 1.000000 // buy
							if( chinkou_span > 12.4268 )
								ret := 0.571429
						if( senkou_span_a_displaced > 12.1861 )
							if( tenkan_sen <= 12.4317 )
								if( basis_minus <= 0.063375 )
									ret := -0.048780
								if( basis_minus > 0.063375 )
									ret := 0.708333 // buy
							if( tenkan_sen > 12.4317 )
								if( senkou_span_b_displaced <= 12.457 )
									ret := -0.708333 // sell
								if( senkou_span_b_displaced > 12.457 )
									ret := -0.078947
			if( chinkou_span > 12.4352 )
				if( tenkan_sen <= 12.6188 )
					if( senkou_span_a_displaced <= 12.2756 )
						if( senkou_span_a_displaced <= 11.7955 )
							if( kinjun_sen <= 12.106 )
								ret := -0.250000
							if( kinjun_sen > 12.106 )
								ret := -0.750000 // sell
						if( senkou_span_a_displaced > 11.7955 )
							if( senkou_span_b <= 12.2368 )
								if( basis_minus <= 0.022183 )
									ret := 0.250000
								if( basis_minus > 0.022183 )
									ret := 0.930818 // buy
							if( senkou_span_b > 12.2368 )
								if( senkou_span_b_displaced <= 12.1673 )
									ret := 0.151515
								if( senkou_span_b_displaced > 12.1673 )
									ret := 0.825581 // buy
					if( senkou_span_a_displaced > 12.2756 )
						if( basis_minus <= -0.012985 )
							if( senkou_span_a_displaced <= 12.4261 )
								if( senkou_span_b <= 12.4423 )
									ret := 0.938776 // buy
								if( senkou_span_b > 12.4423 )
									ret := 0.650000
							if( senkou_span_a_displaced > 12.4261 )
								if( senkou_span_b_displaced <= 12.46 )
									ret := 0.116279
								if( senkou_span_b_displaced > 12.46 )
									ret := 0.628205
						if( basis_minus > -0.012985 )
							if( senkou_span_b_displaced <= 12.3929 )
								if( senkou_span_b <= 12.2483 )
									ret := 0.500000
								if( senkou_span_b > 12.2483 )
									ret := -0.500000
							if( senkou_span_b_displaced > 12.3929 )
								if( senkou_span_b <= 12.4901 )
									ret := 0.323529
								if( senkou_span_b > 12.4901 )
									ret := 0.937500 // buy
				if( tenkan_sen > 12.6188 )
					if( senkou_span_a <= 12.5634 )
						if( tenkan_sen <= 12.6378 )
							ret := -1.000000 // sell
						if( tenkan_sen > 12.6378 )
							if( senkou_span_a <= 12.5547 )
								ret := -0.750000 // sell
							if( senkou_span_a > 12.5547 )
								ret := -0.750000 // sell
					if( senkou_span_a > 12.5634 )
						if( tenkan_sen <= 12.683 )
							ret := 0.250000
						if( tenkan_sen > 12.683 )
							ret := -0.750000 // sell
		if( kinjun_sen > 12.5092 )
			if( basis_minus <= 0.317625 )
				if( kinjun_sen <= 12.6196 )
					if( senkou_span_b_displaced <= 12.4246 )
						if( chinkou_span <= 12.6919 )
							if( senkou_span_b_displaced <= 12.3953 )
								ret := -1.000000 // sell
							if( senkou_span_b_displaced > 12.3953 )
								if( tenkan_sen <= 12.5348 )
									ret := -1.000000 // sell
								if( tenkan_sen > 12.5348 )
									ret := -0.500000
						if( chinkou_span > 12.6919 )
							ret := -0.142857
					if( senkou_span_b_displaced > 12.4246 )
						if( chinkou_span <= 12.7165 )
							if( kinjun_sen <= 12.5462 )
								if( chinkou_span <= 12.2915 )
									ret := -0.741935 // sell
								if( chinkou_span > 12.2915 )
									ret := 0.046875
							if( kinjun_sen > 12.5462 )
								if( senkou_span_b_displaced <= 12.5356 )
									ret := -0.880734 // sell
								if( senkou_span_b_displaced > 12.5356 )
									ret := -0.509804
						if( chinkou_span > 12.7165 )
							if( senkou_span_b <= 12.5961 )
								if( basis_minus <= 0.076967 )
									ret := 0.312500
								if( basis_minus > 0.076967 )
									ret := 0.888889 // buy
							if( senkou_span_b > 12.5961 )
								if( chinkou_span <= 12.8021 )
									ret := 0.000000
								if( chinkou_span > 12.8021 )
									ret := -1.000000 // sell
				if( kinjun_sen > 12.6196 )
					if( senkou_span_b_displaced <= 13.5185 )
						if( chinkou_span <= 13.4911 )
							if( senkou_span_a <= 13.3435 )
								if( senkou_span_b <= 12.7662 )
									ret := -0.193089
								if( senkou_span_b > 12.7662 )
									ret := 0.189555
							if( senkou_span_a > 13.3435 )
								if( basis_minus <= -0.026734 )
									ret := 0.206897
								if( basis_minus > -0.026734 )
									ret := -0.562753
						if( chinkou_span > 13.4911 )
							if( kinjun_sen <= 13.6515 )
								if( senkou_span_b_displaced <= 13.1546 )
									ret := -0.394737
								if( senkou_span_b_displaced > 13.1546 )
									ret := 0.597468
							if( kinjun_sen > 13.6515 )
								if( senkou_span_b_displaced <= 13.0347 )
									ret := 0.714286 // buy
								if( senkou_span_b_displaced > 13.0347 )
									ret := -0.512500
					if( senkou_span_b_displaced > 13.5185 )
						if( chinkou_span <= 13.7844 )
							if( tenkan_sen <= 13.6682 )
								if( chinkou_span <= 13.6645 )
									ret := -0.375817
								if( chinkou_span > 13.6645 )
									ret := 0.463415
							if( tenkan_sen > 13.6682 )
								if( basis_max <= -0.021364 )
									ret := -0.782895 // sell
								if( basis_max > -0.021364 )
									ret := -0.415512
						if( chinkou_span > 13.7844 )
							if( senkou_span_a_displaced <= 13.8092 )
								if( basis_minus <= 0.0205 )
									ret := 0.774775 // buy
								if( basis_minus > 0.0205 )
									ret := 0.139394
							if( senkou_span_a_displaced > 13.8092 )
								if( basis_minus <= -0.017028 )
									ret := 0.692308
								if( basis_minus > -0.017028 )
									ret := -0.518519
			if( basis_minus > 0.317625 )
				if( chinkou_span <= 14.361 )
					if( basis_max <= -0.038306 )
						if( basis_max <= -0.104109 )
							if( senkou_span_b <= 12.6616 )
								if( kinjun_sen <= 12.8302 )
									ret := 0.750000 // buy
								if( kinjun_sen > 12.8302 )
									ret := 1.000000 // buy
							if( senkou_span_b > 12.6616 )
								if( senkou_span_b_displaced <= 12.7137 )
									ret := 0.000000
								if( senkou_span_b_displaced > 12.7137 )
									ret := 1.000000 // buy
						if( basis_max > -0.104109 )
							if( senkou_span_a <= 14.1233 )
								if( basis_minus <= 0.341338 )
									ret := 0.827586 // buy
								if( basis_minus > 0.341338 )
									ret := 1.000000 // buy
							if( senkou_span_a > 14.1233 )
								ret := 0.500000
					if( basis_max > -0.038306 )
						if( basis_minus <= 0.36192 )
							ret := -0.500000
						if( basis_minus > 0.36192 )
							ret := 0.500000
				if( chinkou_span > 14.361 )
					ret := -0.600000
	if( basis_max > 0.020821 )
		if( basis_minus <= -0.116646 )
			if( senkou_span_a <= 13.7295 )
				if( basis_minus <= -0.160015 )
					if( chinkou_span <= 9.9935 )
						if( tenkan_sen <= 9.95275 )
							if( basis_max <= 0.051473 )
								if( chinkou_span <= 9.29036 )
									ret := -0.651515
								if( chinkou_span > 9.29036 )
									ret := 0.705882 // buy
							if( basis_max > 0.051473 )
								if( senkou_span_b_displaced <= 10.6188 )
									ret := 0.375723
								if( senkou_span_b_displaced > 10.6188 )
									ret := -0.875000 // sell
						if( tenkan_sen > 9.95275 )
							if( chinkou_span <= 9.85325 )
								if( basis_max <= 0.03542 )
									ret := -1.000000 // sell
								if( basis_max > 0.03542 )
									ret := 0.166667
							if( chinkou_span > 9.85325 )
								if( chinkou_span <= 9.93545 )
									ret := -1.000000 // sell
								if( chinkou_span > 9.93545 )
									ret := -0.666667
					if( chinkou_span > 9.9935 )
						if( senkou_span_a <= 11.6664 )
							if( basis_max <= 0.085207 )
								if( basis_max <= 0.062268 )
									ret := 0.634409
								if( basis_max > 0.062268 )
									ret := 0.069444
							if( basis_max > 0.085207 )
								if( basis_max <= 0.180469 )
									ret := 0.871795 // buy
								if( basis_max > 0.180469 )
									ret := 0.000000
						if( senkou_span_a > 11.6664 )
							if( chinkou_span <= 12.8355 )
								if( basis_max <= 0.03525 )
									ret := 0.500000
								if( basis_max > 0.03525 )
									ret := -0.632911
							if( chinkou_span > 12.8355 )
								if( senkou_span_b_displaced <= 13.8995 )
									ret := 0.840909 // buy
								if( senkou_span_b_displaced > 13.8995 )
									ret := 0.200000
				if( basis_minus > -0.160015 )
					if( chinkou_span <= 11.8399 )
						if( senkou_span_a_displaced <= 12.1286 )
							if( basis_max <= 0.036322 )
								if( senkou_span_b_displaced <= 9.52425 )
									ret := 0.500000
								if( senkou_span_b_displaced > 9.52425 )
									ret := 0.026087
							if( basis_max > 0.036322 )
								if( senkou_span_a_displaced <= 6.11062 )
									ret := -0.277778
								if( senkou_span_a_displaced > 6.11062 )
									ret := 0.639640
						if( senkou_span_a_displaced > 12.1286 )
							if( kinjun_sen <= 11.8971 )
								ret := -1.000000 // sell
							if( kinjun_sen > 11.8971 )
								if( chinkou_span <= 11.7425 )
									ret := -0.400000
								if( chinkou_span > 11.7425 )
									ret := -1.000000 // sell
					if( chinkou_span > 11.8399 )
						if( basis_minus <= -0.122051 )
							if( senkou_span_a_displaced <= 13.6106 )
								if( basis_minus <= -0.125308 )
									ret := 0.932773 // buy
								if( basis_minus > -0.125308 )
									ret := 0.600000
							if( senkou_span_a_displaced > 13.6106 )
								if( kinjun_sen <= 13.6342 )
									ret := -0.083333
								if( kinjun_sen > 13.6342 )
									ret := 0.694444
						if( basis_minus > -0.122051 )
							if( senkou_span_a <= 12.2566 )
								if( tenkan_sen <= 12.0523 )
									ret := 1.000000 // buy
								if( tenkan_sen > 12.0523 )
									ret := 0.777778 // buy
							if( senkou_span_a > 12.2566 )
								if( chinkou_span <= 12.4168 )
									ret := -0.928571 // sell
								if( chinkou_span > 12.4168 )
									ret := 0.000000
			if( senkou_span_a > 13.7295 )
				if( senkou_span_a_displaced <= 14.1696 )
					if( senkou_span_b_displaced <= 13.9582 )
						ret := -0.250000
					if( senkou_span_b_displaced > 13.9582 )
						if( basis_max <= 0.045592 )
							if( basis_max <= 0.030802 )
								ret := -0.750000 // sell
							if( basis_max > 0.030802 )
								ret := -1.000000 // sell
						if( basis_max > 0.045592 )
							ret := -0.500000
				if( senkou_span_a_displaced > 14.1696 )
					ret := 0.000000
		if( basis_minus > -0.116646 )
			if( senkou_span_a_displaced <= 13.9242 )
				if( chinkou_span <= 12.4093 )
					if( senkou_span_a_displaced <= 11.5519 )
						if( chinkou_span <= 11.3196 )
							if( senkou_span_a <= 11.0849 )
								if( senkou_span_b_displaced <= 10.9858 )
									ret := 0.120742
								if( senkou_span_b_displaced > 10.9858 )
									ret := 0.457421
							if( senkou_span_a > 11.0849 )
								if( tenkan_sen <= 11.1361 )
									ret := -0.577778
								if( tenkan_sen > 11.1361 )
									ret := 0.109524
						if( chinkou_span > 11.3196 )
							if( senkou_span_b_displaced <= 11.4905 )
								if( kinjun_sen <= 11.1068 )
									ret := 1.000000 // buy
								if( kinjun_sen > 11.1068 )
									ret := 0.546448
							if( senkou_span_b_displaced > 11.4905 )
								if( kinjun_sen <= 11.4372 )
									ret := 1.000000 // buy
								if( kinjun_sen > 11.4372 )
									ret := -0.730769 // sell
					if( senkou_span_a_displaced > 11.5519 )
						if( chinkou_span <= 11.5625 )
							if( basis_minus <= -0.096124 )
								if( senkou_span_a_displaced <= 11.7578 )
									ret := 0.500000
								if( senkou_span_a_displaced > 11.7578 )
									ret := -0.875000 // sell
							if( basis_minus > -0.096124 )
								if( senkou_span_a_displaced <= 12.1702 )
									ret := -0.544236
								if( senkou_span_a_displaced > 12.1702 )
									ret := 1.000000 // buy
						if( chinkou_span > 11.5625 )
							if( tenkan_sen <= 12.4077 )
								if( senkou_span_a <= 11.5476 )
									ret := 0.930233 // buy
								if( senkou_span_a > 11.5476 )
									ret := 0.094380
							if( tenkan_sen > 12.4077 )
								if( basis_max <= 0.025332 )
									ret := -0.064516
								if( basis_max > 0.025332 )
									ret := -0.710145 // sell
				if( chinkou_span > 12.4093 )
					if( senkou_span_b <= 13.3659 )
						if( senkou_span_b_displaced <= 12.4528 )
							if( chinkou_span <= 12.7174 )
								if( senkou_span_a <= 12.3989 )
									ret := 0.500000
								if( senkou_span_a > 12.3989 )
									ret := 0.919192 // buy
							if( chinkou_span > 12.7174 )
								if( basis_minus <= -0.013237 )
									ret := 0.400000
								if( basis_minus > -0.013237 )
									ret := -0.800000 // sell
						if( senkou_span_b_displaced > 12.4528 )
							if( senkou_span_a <= 12.4823 )
								if( kinjun_sen <= 12.4527 )
									ret := 0.700000 // buy
								if( kinjun_sen > 12.4527 )
									ret := -0.644068
							if( senkou_span_a > 12.4823 )
								if( basis_max <= 0.035413 )
									ret := 0.405405
								if( basis_max > 0.035413 )
									ret := 0.823529 // buy
					if( senkou_span_b > 13.3659 )
						if( senkou_span_b_displaced <= 13.5271 )
							if( chinkou_span <= 13.3894 )
								if( senkou_span_b_displaced <= 13.2848 )
									ret := -0.500000
								if( senkou_span_b_displaced > 13.2848 )
									ret := -0.953488 // sell
							if( chinkou_span > 13.3894 )
								if( chinkou_span <= 13.601 )
									ret := -0.105263
								if( chinkou_span > 13.601 )
									ret := 1.000000 // buy
						if( senkou_span_b_displaced > 13.5271 )
							if( chinkou_span <= 13.5964 )
								if( senkou_span_a_displaced <= 13.667 )
									ret := 0.417476
								if( senkou_span_a_displaced > 13.667 )
									ret := -0.589744
							if( chinkou_span > 13.5964 )
								if( kinjun_sen <= 14.0177 )
									ret := 0.585185
								if( kinjun_sen > 14.0177 )
									ret := -0.333333
			if( senkou_span_a_displaced > 13.9242 )
				if( chinkou_span <= 13.555 )
					ret := 1.000000 // buy
				if( chinkou_span > 13.555 )
					if( senkou_span_b_displaced <= 13.9323 )
						if( senkou_span_a <= 13.9626 )
							ret := 0.200000
						if( senkou_span_a > 13.9626 )
							if( kinjun_sen <= 14.0179 )
								ret := -1.000000 // sell
							if( kinjun_sen > 14.0179 )
								if( basis_minus <= -0.037368 )
									ret := -0.250000
								if( basis_minus > -0.037368 )
									ret := -0.764706 // sell
					if( senkou_span_b_displaced > 13.9323 )
						if( senkou_span_b_displaced <= 14.0192 )
							ret := -1.000000 // sell
						if( senkou_span_b_displaced > 14.0192 )
							ret := -0.750000 // sell
	
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
float op_operation = decision_tree_0_ATOMUSDT_5Min_b3ac46b8(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)

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


