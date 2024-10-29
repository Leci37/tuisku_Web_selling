//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: TSLA_30Min_1ICH_18718505 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TSLA_30Min_1ICH_18718505", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TSLA_30Min_18718505(senkou_span_a_displaced, cross_dn_tenkan_kinjunInt, kinjun_sen, chinkou_span, senkou_span_b_displaced, basis_minus, senkou_span_b, senkou_span_a, cross_up_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( senkou_span_a_displaced <= 171.98 )
		if( senkou_span_b <= 168.283 )
			if( basis_max <= -0.128292 )
				if( tenkan_sen <= 171.932 )
					if( basis_max <= -3.13281 )
						if( tenkan_sen <= 163.103 )
							ret := -0.130435
						if( tenkan_sen > 163.103 )
							ret := -0.769231 // sell
					if( basis_max > -3.13281 )
						if( senkou_span_a <= 158.05 )
							if( kinjun_sen <= 119.813 )
								if( basis_minus <= 2.23552 )
									ret := 0.863636 // buy
								if( basis_minus > 2.23552 )
									ret := 0.344262
							if( kinjun_sen > 119.813 )
								if( senkou_span_b_displaced <= 125.319 )
									ret := -0.282209
								if( senkou_span_b_displaced > 125.319 )
									ret := 0.180778
						if( senkou_span_a > 158.05 )
							if( senkou_span_b_displaced <= 154.912 )
								if( basis_max <= -0.56793 )
									ret := 0.785714 // buy
								if( basis_max > -0.56793 )
									ret := 1.000000 // buy
							if( senkou_span_b_displaced > 154.912 )
								if( senkou_span_a <= 163.172 )
									ret := 0.134615
								if( senkou_span_a > 163.172 )
									ret := 0.677966
				if( tenkan_sen > 171.932 )
					if( senkou_span_a_displaced <= 167.5 )
						if( senkou_span_a_displaced <= 158.815 )
							if( senkou_span_a_displaced <= 158.097 )
								ret := -0.866667 // sell
							if( senkou_span_a_displaced > 158.097 )
								ret := 0.272727
						if( senkou_span_a_displaced > 158.815 )
							if( basis_max <= -1.56565 )
								if( senkou_span_a <= 171.591 )
									ret := -0.833333 // sell
								if( senkou_span_a > 171.591 )
									ret := -1.000000 // sell
							if( basis_max > -1.56565 )
								ret := -0.428571
					if( senkou_span_a_displaced > 167.5 )
						ret := 0.000000
			if( basis_max > -0.128292 )
				if( senkou_span_a_displaced <= 111.085 )
					if( senkou_span_b_displaced <= 110.989 )
						ret := 1.000000 // buy
					if( senkou_span_b_displaced > 110.989 )
						ret := 0.583333
				if( senkou_span_a_displaced > 111.085 )
					if( kinjun_sen <= 170.098 )
						if( senkou_span_b_displaced <= 112.351 )
							if( chinkou_span <= 112.984 )
								ret := -0.666667
							if( chinkou_span > 112.984 )
								if( basis_minus <= 3.08956 )
									ret := -1.000000 // sell
								if( basis_minus > 3.08956 )
									ret := -0.909091 // sell
						if( senkou_span_b_displaced > 112.351 )
							if( senkou_span_b <= 117.633 )
								if( basis_minus <= -0.594975 )
									ret := 0.562500
								if( basis_minus > -0.594975 )
									ret := 1.000000 // buy
							if( senkou_span_b > 117.633 )
								if( kinjun_sen <= 138.656 )
									ret := -0.370000
								if( kinjun_sen > 138.656 )
									ret := -0.015873
					if( kinjun_sen > 170.098 )
						if( tenkan_sen <= 170.545 )
							ret := -0.884615 // sell
						if( tenkan_sen > 170.545 )
							ret := -0.769231 // sell
		if( senkou_span_b > 168.283 )
			if( chinkou_span <= 169.564 )
				if( basis_max <= 0.771111 )
					if( senkou_span_a <= 170.648 )
						if( basis_minus <= -0.748846 )
							if( senkou_span_a_displaced <= 170.07 )
								ret := 0.714286 // buy
							if( senkou_span_a_displaced > 170.07 )
								if( chinkou_span <= 166.178 )
									ret := -0.764706 // sell
								if( chinkou_span > 166.178 )
									ret := -0.080000
						if( basis_minus > -0.748846 )
							if( chinkou_span <= 163.596 )
								ret := 1.000000 // buy
							if( chinkou_span > 163.596 )
								ret := 0.545455
					if( senkou_span_a > 170.648 )
						if( senkou_span_a <= 173.321 )
							if( senkou_span_a_displaced <= 171.394 )
								if( basis_max <= 0.128907 )
									ret := -0.571429
								if( basis_max > 0.128907 )
									ret := -0.230769
							if( senkou_span_a_displaced > 171.394 )
								ret := -1.000000 // sell
						if( senkou_span_a > 173.321 )
							if( basis_minus <= 2.03911 )
								ret := -1.000000 // sell
							if( basis_minus > 2.03911 )
								ret := -0.684211
				if( basis_max > 0.771111 )
					if( senkou_span_b_displaced <= 173.78 )
						ret := 0.294118
					if( senkou_span_b_displaced > 173.78 )
						ret := 0.894737 // buy
			if( chinkou_span > 169.564 )
				if( kinjun_sen <= 182.741 )
					if( chinkou_span <= 186.435 )
						if( kinjun_sen <= 169.952 )
							if( senkou_span_a_displaced <= 169.747 )
								if( senkou_span_a <= 170.08 )
									ret := 0.946970 // buy
								if( senkou_span_a > 170.08 )
									ret := 0.714286 // buy
							if( senkou_span_a_displaced > 169.747 )
								if( senkou_span_b_displaced <= 172.081 )
									ret := 0.703704 // buy
								if( senkou_span_b_displaced > 172.081 )
									ret := 0.153846
						if( kinjun_sen > 169.952 )
							if( tenkan_sen <= 175.579 )
								if( basis_minus <= 3.59865 )
									ret := 0.339623
								if( basis_minus > 3.59865 )
									ret := -0.812500 // sell
							if( tenkan_sen > 175.579 )
								if( senkou_span_a <= 178.994 )
									ret := 0.608000
								if( senkou_span_a > 178.994 )
									ret := 0.906977 // buy
					if( chinkou_span > 186.435 )
						if( basis_minus <= 0.24875 )
							ret := 1.000000 // buy
						if( basis_minus > 0.24875 )
							if( senkou_span_b_displaced <= 170.425 )
								if( kinjun_sen <= 176.52 )
									ret := 1.000000 // buy
								if( kinjun_sen > 176.52 )
									ret := 0.100000
							if( senkou_span_b_displaced > 170.425 )
								if( senkou_span_b <= 170.178 )
									ret := 1.000000 // buy
								if( senkou_span_b > 170.178 )
									ret := 0.800000 // buy
				if( kinjun_sen > 182.741 )
					ret := -0.928571 // sell
	if( senkou_span_a_displaced > 171.98 )
		if( basis_max <= -2.4151 )
			if( senkou_span_b_displaced <= 927.074 )
				if( chinkou_span <= 876.928 )
					if( senkou_span_a <= 890.434 )
						if( senkou_span_a_displaced <= 741.592 )
							if( senkou_span_b_displaced <= 364.787 )
								if( senkou_span_b_displaced <= 321.312 )
									ret := 0.077099
								if( senkou_span_b_displaced > 321.312 )
									ret := -0.317829
							if( senkou_span_b_displaced > 364.787 )
								if( chinkou_span <= 759.516 )
									ret := 0.163166
								if( chinkou_span > 759.516 )
									ret := 0.539877
						if( senkou_span_a_displaced > 741.592 )
							if( chinkou_span <= 794.334 )
								if( senkou_span_a <= 785.792 )
									ret := -0.204301
								if( senkou_span_a > 785.792 )
									ret := -0.890351 // sell
							if( chinkou_span > 794.334 )
								if( kinjun_sen <= 870.91 )
									ret := 0.132653
								if( kinjun_sen > 870.91 )
									ret := 0.769231 // buy
					if( senkou_span_a > 890.434 )
						if( kinjun_sen <= 899.207 )
							if( senkou_span_b_displaced <= 719.895 )
								ret := -0.400000
							if( senkou_span_b_displaced > 719.895 )
								if( senkou_span_a_displaced <= 864.799 )
									ret := -0.976190 // sell
								if( senkou_span_a_displaced > 864.799 )
									ret := -1.000000 // sell
						if( kinjun_sen > 899.207 )
							if( kinjun_sen <= 920.447 )
								ret := 0.416667
							if( kinjun_sen > 920.447 )
								if( senkou_span_b <= 927.085 )
									ret := -1.000000 // sell
								if( senkou_span_b > 927.085 )
									ret := -0.857143 // sell
				if( chinkou_span > 876.928 )
					if( chinkou_span <= 1017.86 )
						if( kinjun_sen <= 885.855 )
							if( senkou_span_b_displaced <= 635.564 )
								if( senkou_span_b_displaced <= 635.488 )
									ret := 1.000000 // buy
								if( senkou_span_b_displaced > 635.488 )
									ret := -0.714286 // sell
							if( senkou_span_b_displaced > 635.564 )
								if( senkou_span_a <= 868.904 )
									ret := 0.788889 // buy
								if( senkou_span_a > 868.904 )
									ret := 0.431624
						if( kinjun_sen > 885.855 )
							if( chinkou_span <= 926.465 )
								if( senkou_span_a <= 925.455 )
									ret := -0.313433
								if( senkou_span_a > 925.455 )
									ret := -0.854167 // sell
							if( chinkou_span > 926.465 )
								if( senkou_span_a_displaced <= 877.916 )
									ret := 0.780488 // buy
								if( senkou_span_a_displaced > 877.916 )
									ret := 0.191304
					if( chinkou_span > 1017.86 )
						if( senkou_span_a <= 986.084 )
							if( senkou_span_a_displaced <= 884.85 )
								ret := 0.615385
							if( senkou_span_a_displaced > 884.85 )
								if( senkou_span_a_displaced <= 906.43 )
									ret := 1.000000 // buy
								if( senkou_span_a_displaced > 906.43 )
									ret := 0.863636 // buy
						if( senkou_span_a > 986.084 )
							if( senkou_span_a_displaced <= 922.088 )
								ret := 0.416667
							if( senkou_span_a_displaced > 922.088 )
								ret := 0.928571 // buy
			if( senkou_span_b_displaced > 927.074 )
				if( senkou_span_b_displaced <= 946.196 )
					if( senkou_span_a_displaced <= 939.874 )
						if( senkou_span_b_displaced <= 930.652 )
							if( basis_max <= -3.11467 )
								ret := -0.333333
							if( basis_max > -3.11467 )
								ret := -0.833333 // sell
						if( senkou_span_b_displaced > 930.652 )
							if( senkou_span_a <= 978.817 )
								if( basis_max <= -4.38126 )
									ret := -0.700000 // sell
								if( basis_max > -4.38126 )
									ret := -0.951220 // sell
							if( senkou_span_a > 978.817 )
								ret := -1.000000 // sell
					if( senkou_span_a_displaced > 939.874 )
						if( basis_max <= -10.8786 )
							ret := -0.187500
						if( basis_max > -10.8786 )
							ret := 0.461538
				if( senkou_span_b_displaced > 946.196 )
					if( senkou_span_a_displaced <= 1058.02 )
						if( senkou_span_b <= 1052.25 )
							if( chinkou_span <= 1022.75 )
								if( senkou_span_b <= 950.265 )
									ret := 0.507937
								if( senkou_span_b > 950.265 )
									ret := -0.571429
							if( chinkou_span > 1022.75 )
								if( tenkan_sen <= 1044.26 )
									ret := 0.735294 // buy
								if( tenkan_sen > 1044.26 )
									ret := 0.254808
						if( senkou_span_b > 1052.25 )
							if( tenkan_sen <= 1071.14 )
								if( chinkou_span <= 1012.25 )
									ret := -1.000000 // sell
								if( chinkou_span > 1012.25 )
									ret := -0.923077 // sell
							if( tenkan_sen > 1071.14 )
								if( chinkou_span <= 1097.34 )
									ret := -0.615385
								if( chinkou_span > 1097.34 )
									ret := -0.911765 // sell
					if( senkou_span_a_displaced > 1058.02 )
						if( basis_minus <= 16.9944 )
							if( kinjun_sen <= 1063.23 )
								if( basis_max <= -11.0276 )
									ret := -0.090909
								if( basis_max > -11.0276 )
									ret := 0.730769 // buy
							if( kinjun_sen > 1063.23 )
								if( chinkou_span <= 1084.15 )
									ret := -0.692308
								if( chinkou_span > 1084.15 )
									ret := -0.098121
						if( basis_minus > 16.9944 )
							if( kinjun_sen <= 1154.44 )
								if( tenkan_sen <= 1155.35 )
									ret := 0.640000
								if( tenkan_sen > 1155.35 )
									ret := 0.941176 // buy
							if( kinjun_sen > 1154.44 )
								if( kinjun_sen <= 1190.92 )
									ret := -0.580645
								if( kinjun_sen > 1190.92 )
									ret := 0.245211
		if( basis_max > -2.4151 )
			if( chinkou_span <= 186.934 )
				if( kinjun_sen <= 188.462 )
					if( basis_max <= 0.229005 )
						if( kinjun_sen <= 182.848 )
							if( senkou_span_b_displaced <= 170.7 )
								if( senkou_span_a_displaced <= 172.782 )
									ret := 0.681818
								if( senkou_span_a_displaced > 172.782 )
									ret := -0.272727
							if( senkou_span_b_displaced > 170.7 )
								if( senkou_span_a <= 181.49 )
									ret := -0.226087
								if( senkou_span_a > 181.49 )
									ret := 0.177994
						if( kinjun_sen > 182.848 )
							if( senkou_span_b_displaced <= 189.54 )
								if( chinkou_span <= 178.761 )
									ret := -0.956522 // sell
								if( chinkou_span > 178.761 )
									ret := -0.497418
							if( senkou_span_b_displaced > 189.54 )
								if( senkou_span_a <= 186.658 )
									ret := -0.314286
								if( senkou_span_a > 186.658 )
									ret := 0.469388
					if( basis_max > 0.229005 )
						if( basis_minus <= 1.39406 )
							if( tenkan_sen <= 161.73 )
								if( basis_max <= 2.35918 )
									ret := -1.000000 // sell
								if( basis_max > 2.35918 )
									ret := -0.857143 // sell
							if( tenkan_sen > 161.73 )
								if( senkou_span_a_displaced <= 195.488 )
									ret := 0.095708
								if( senkou_span_a_displaced > 195.488 )
									ret := -0.742857 // sell
						if( basis_minus > 1.39406 )
							if( senkou_span_a_displaced <= 182.066 )
								if( basis_max <= 0.5 )
									ret := -0.830508 // sell
								if( basis_max > 0.5 )
									ret := -0.456522
							if( senkou_span_a_displaced > 182.066 )
								ret := 0.052632
				if( kinjun_sen > 188.462 )
					if( senkou_span_a <= 192.31 )
						if( chinkou_span <= 183.067 )
							if( senkou_span_b_displaced <= 201.751 )
								if( kinjun_sen <= 190.84 )
									ret := -0.636842
								if( kinjun_sen > 190.84 )
									ret := -0.891089 // sell
							if( senkou_span_b_displaced > 201.751 )
								ret := 0.363636
						if( chinkou_span > 183.067 )
							if( kinjun_sen <= 192.342 )
								if( senkou_span_a_displaced <= 194.927 )
									ret := -0.588785
								if( senkou_span_a_displaced > 194.927 )
									ret := 0.254902
							if( kinjun_sen > 192.342 )
								ret := 0.870968 // buy
					if( senkou_span_a > 192.31 )
						if( senkou_span_a <= 193.43 )
							if( tenkan_sen <= 192.336 )
								if( senkou_span_a_displaced <= 196.6 )
									ret := -0.200000
								if( senkou_span_a_displaced > 196.6 )
									ret := 0.388889
							if( tenkan_sen > 192.336 )
								if( senkou_span_b_displaced <= 186.622 )
									ret := -0.384615
								if( senkou_span_b_displaced > 186.622 )
									ret := -0.947826 // sell
						if( senkou_span_a > 193.43 )
							if( chinkou_span <= 186.083 )
								if( basis_max <= 0.189262 )
									ret := -0.769231 // sell
								if( basis_max > 0.189262 )
									ret := -0.946667 // sell
							if( chinkou_span > 186.083 )
								if( chinkou_span <= 186.636 )
									ret := -0.750000 // sell
								if( chinkou_span > 186.636 )
									ret := -0.636364
			if( chinkou_span > 186.934 )
				if( senkou_span_a_displaced <= 187.374 )
					if( kinjun_sen <= 188.125 )
						if( tenkan_sen <= 185.273 )
							if( kinjun_sen <= 180.226 )
								if( basis_max <= -0.710134 )
									ret := 0.384615
								if( basis_max > -0.710134 )
									ret := 0.942857 // buy
							if( kinjun_sen > 180.226 )
								if( basis_max <= -0.016032 )
									ret := 0.595000
								if( basis_max > -0.016032 )
									ret := 0.222222
						if( tenkan_sen > 185.273 )
							if( senkou_span_b <= 187.376 )
								if( basis_minus <= 3.6941 )
									ret := 0.778125 // buy
								if( basis_minus > 3.6941 )
									ret := 0.533333
							if( senkou_span_b > 187.376 )
								if( basis_minus <= 1.42199 )
									ret := -0.083333
								if( basis_minus > 1.42199 )
									ret := 0.200000
					if( kinjun_sen > 188.125 )
						if( senkou_span_a <= 190.284 )
							if( kinjun_sen <= 188.334 )
								ret := -0.444444
							if( kinjun_sen > 188.334 )
								if( senkou_span_b <= 187.75 )
									ret := 0.541284
								if( senkou_span_b > 187.75 )
									ret := 0.818182 // buy
						if( senkou_span_a > 190.284 )
							if( chinkou_span <= 201.066 )
								if( tenkan_sen <= 196.277 )
									ret := -0.549618
								if( tenkan_sen > 196.277 )
									ret := 0.621622
							if( chinkou_span > 201.066 )
								if( tenkan_sen <= 196.821 )
									ret := 0.955556 // buy
								if( tenkan_sen > 196.821 )
									ret := -0.400000
				if( senkou_span_a_displaced > 187.374 )
					if( chinkou_span <= 1480.28 )
						if( senkou_span_a <= 1537.38 )
							if( senkou_span_a <= 195.475 )
								if( chinkou_span <= 193.482 )
									ret := 0.003766
								if( chinkou_span > 193.482 )
									ret := 0.408297
							if( senkou_span_a > 195.475 )
								if( basis_max <= 1.31079 )
									ret := -0.006811
								if( basis_max > 1.31079 )
									ret := -0.087996
						if( senkou_span_a > 1537.38 )
							if( tenkan_sen <= 1600.34 )
								if( basis_minus <= -43.2113 )
									ret := -1.000000 // sell
								if( basis_minus > -43.2113 )
									ret := -0.388889
							if( tenkan_sen > 1600.34 )
								ret := -1.000000 // sell
					if( chinkou_span > 1480.28 )
						if( kinjun_sen <= 1590.86 )
							if( senkou_span_a_displaced <= 1628.32 )
								if( senkou_span_b <= 1524.3 )
									ret := 0.422747
								if( senkou_span_b > 1524.3 )
									ret := 0.900000 // buy
							if( senkou_span_a_displaced > 1628.32 )
								if( senkou_span_b <= 1613.66 )
									ret := -0.100000
								if( senkou_span_b > 1613.66 )
									ret := -1.000000 // sell
						if( kinjun_sen > 1590.86 )
							if( basis_minus <= -1.78507 )
								if( basis_max <= 10.1279 )
									ret := -0.032258
								if( basis_max > 10.1279 )
									ret := -0.607143
							if( basis_minus > -1.78507 )
								if( senkou_span_b_displaced <= 1592.28 )
									ret := 0.000000
								if( senkou_span_b_displaced > 1592.28 )
									ret := 0.676056
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_TSLA_30Min_18718505(senkou_span_a_displaced, cross_dn_tenkan_kinjunInt, kinjun_sen, chinkou_span, senkou_span_b_displaced, basis_minus, senkou_span_b, senkou_span_a, cross_up_tenkan_kinjunInt, tenkan_sen, basis_max)

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


