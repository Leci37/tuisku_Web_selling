//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: MATICUSDT_30Min_1ICH_1da7d1eb Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MATICUSDT_30Min_1ICH_1da7d1eb", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MATICUSDT_30Min_1da7d1eb(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( senkou_span_a <= 0.365872 )
		if( basis_minus <= -0.000357 )
			if( chinkou_span <= 0.36618 )
				if( senkou_span_b_displaced <= 0.388338 )
					if( basis_max <= -0.001251 )
						if( tenkan_sen <= 0.127315 )
							if( senkou_span_a_displaced <= 0.145513 )
								ret := -1.000000 // sell
							if( senkou_span_a_displaced > 0.145513 )
								ret := -0.500000
						if( tenkan_sen > 0.127315 )
							if( chinkou_span <= 0.168605 )
								if( chinkou_span <= 0.158431 )
									ret := -0.350000
								if( chinkou_span > 0.158431 )
									ret := 0.869565 // buy
							if( chinkou_span > 0.168605 )
								if( chinkou_span <= 0.351579 )
									ret := -0.574257
								if( chinkou_span > 0.351579 )
									ret := 0.540541
					if( basis_max > -0.001251 )
						if( senkou_span_b_displaced <= 0.385041 )
							if( senkou_span_b_displaced <= 0.38498 )
								if( chinkou_span <= 0.013638 )
									ret := -0.308824
								if( chinkou_span > 0.013638 )
									ret := 0.231997
							if( senkou_span_b_displaced > 0.38498 )
								if( chinkou_span <= 0.355479 )
									ret := -1.000000 // sell
								if( chinkou_span > 0.355479 )
									ret := -0.750000 // sell
						if( senkou_span_b_displaced > 0.385041 )
							if( senkou_span_b <= 0.352898 )
								ret := 0.666667
							if( senkou_span_b > 0.352898 )
								if( chinkou_span <= 0.348207 )
									ret := 1.000000 // buy
								if( chinkou_span > 0.348207 )
									ret := 0.750000 // buy
				if( senkou_span_b_displaced > 0.388338 )
					if( senkou_span_a <= 0.333318 )
						if( senkou_span_b_displaced <= 0.419341 )
							ret := 0.000000
						if( senkou_span_b_displaced > 0.419341 )
							ret := 0.600000
					if( senkou_span_a > 0.333318 )
						if( senkou_span_b <= 0.367197 )
							if( basis_minus <= -0.003976 )
								if( chinkou_span <= 0.356742 )
									ret := -0.333333
								if( chinkou_span > 0.356742 )
									ret := -1.000000 // sell
							if( basis_minus > -0.003976 )
								ret := -1.000000 // sell
						if( senkou_span_b > 0.367197 )
							if( tenkan_sen <= 0.358915 )
								ret := -0.833333 // sell
							if( tenkan_sen > 0.358915 )
								ret := 0.500000
			if( chinkou_span > 0.36618 )
				if( senkou_span_a <= 0.355074 )
					if( basis_minus <= -0.005838 )
						if( basis_max <= -0.005662 )
							ret := 0.000000
						if( basis_max > -0.005662 )
							if( senkou_span_b_displaced <= 0.379917 )
								if( basis_max <= 0.001353 )
									ret := 0.967213 // buy
								if( basis_max > 0.001353 )
									ret := 0.684211
							if( senkou_span_b_displaced > 0.379917 )
								if( senkou_span_b_displaced <= 0.412092 )
									ret := 0.312500
								if( senkou_span_b_displaced > 0.412092 )
									ret := 1.000000 // buy
					if( basis_minus > -0.005838 )
						if( senkou_span_b_displaced <= 0.358087 )
							if( senkou_span_b <= 0.344066 )
								if( kinjun_sen <= 0.339871 )
									ret := 0.000000
								if( kinjun_sen > 0.339871 )
									ret := 0.833333 // buy
							if( senkou_span_b > 0.344066 )
								ret := -0.142857
						if( senkou_span_b_displaced > 0.358087 )
							if( basis_minus <= -0.003935 )
								ret := 1.000000 // buy
							if( basis_minus > -0.003935 )
								ret := 0.500000
				if( senkou_span_a > 0.355074 )
					if( senkou_span_b_displaced <= 0.354729 )
						if( tenkan_sen <= 0.353808 )
							ret := 0.750000 // buy
						if( tenkan_sen > 0.353808 )
							ret := -1.000000 // sell
					if( senkou_span_b_displaced > 0.354729 )
						if( senkou_span_b_displaced <= 0.366887 )
							if( chinkou_span <= 0.373579 )
								if( senkou_span_b <= 0.362297 )
									ret := 0.300000
								if( senkou_span_b > 0.362297 )
									ret := 0.714286 // buy
							if( chinkou_span > 0.373579 )
								if( senkou_span_a <= 0.363075 )
									ret := 0.190476
								if( senkou_span_a > 0.363075 )
									ret := -0.750000 // sell
						if( senkou_span_b_displaced > 0.366887 )
							if( senkou_span_a <= 0.362104 )
								if( basis_minus <= -0.003659 )
									ret := 0.500000
								if( basis_minus > -0.003659 )
									ret := 0.000000
							if( senkou_span_a > 0.362104 )
								if( basis_minus <= -0.001579 )
									ret := 0.902439 // buy
								if( basis_minus > -0.001579 )
									ret := 0.500000
		if( basis_minus > -0.000357 )
			if( chinkou_span <= 0.360958 )
				if( chinkou_span <= 0.013495 )
					if( basis_max <= -7.3e-05 )
						if( senkou_span_a_displaced <= 0.01222 )
							if( senkou_span_b <= 0.012115 )
								ret := 1.000000 // buy
							if( senkou_span_b > 0.012115 )
								ret := 0.500000
						if( senkou_span_a_displaced > 0.01222 )
							ret := 0.000000
					if( basis_max > -7.3e-05 )
						if( chinkou_span <= 0.013025 )
							if( senkou_span_a_displaced <= 0.013079 )
								if( senkou_span_b <= 0.012697 )
									ret := -0.333333
								if( senkou_span_b > 0.012697 )
									ret := -0.852941 // sell
							if( senkou_span_a_displaced > 0.013079 )
								if( senkou_span_a <= 0.013003 )
									ret := 0.125000
								if( senkou_span_a > 0.013003 )
									ret := -0.416667
						if( chinkou_span > 0.013025 )
							if( basis_minus <= -0.000214 )
								ret := -0.200000
							if( basis_minus > -0.000214 )
								if( senkou_span_a_displaced <= 0.012072 )
									ret := -0.500000
								if( senkou_span_a_displaced > 0.012072 )
									ret := -0.958333 // sell
				if( chinkou_span > 0.013495 )
					if( basis_max <= 0.000509 )
						if( senkou_span_b_displaced <= 0.016467 )
							if( chinkou_span <= 0.01755 )
								if( senkou_span_a_displaced <= 0.013407 )
									ret := 0.666667
								if( senkou_span_a_displaced > 0.013407 )
									ret := 0.127937
							if( chinkou_span > 0.01755 )
								if( senkou_span_b_displaced <= 0.015982 )
									ret := -0.600000
								if( senkou_span_b_displaced > 0.015982 )
									ret := 0.706215 // buy
						if( senkou_span_b_displaced > 0.016467 )
							if( chinkou_span <= 0.017752 )
								if( senkou_span_a <= 0.017853 )
									ret := -0.088262
								if( senkou_span_a > 0.017853 )
									ret := -0.547619
							if( chinkou_span > 0.017752 )
								if( senkou_span_a <= 0.018145 )
									ret := 0.394343
								if( senkou_span_a > 0.018145 )
									ret := 0.083588
					if( basis_max > 0.000509 )
						if( tenkan_sen <= 0.19348 )
							if( chinkou_span <= 0.186389 )
								if( chinkou_span <= 0.032965 )
									ret := -0.756757 // sell
								if( chinkou_span > 0.032965 )
									ret := -0.178161
							if( chinkou_span > 0.186389 )
								if( senkou_span_a_displaced <= 0.146134 )
									ret := -1.000000 // sell
								if( senkou_span_a_displaced > 0.146134 )
									ret := 0.968750 // buy
						if( tenkan_sen > 0.19348 )
							if( chinkou_span <= 0.223511 )
								if( basis_max <= 0.003507 )
									ret := -0.836735 // sell
								if( basis_max > 0.003507 )
									ret := -0.375000
							if( chinkou_span > 0.223511 )
								if( senkou_span_a <= 0.231494 )
									ret := 0.250000
								if( senkou_span_a > 0.231494 )
									ret := -0.520000
			if( chinkou_span > 0.360958 )
				if( tenkan_sen <= 0.365161 )
					if( basis_minus <= 0.015752 )
						if( senkou_span_b_displaced <= 0.361333 )
							if( basis_max <= 0.003396 )
								if( senkou_span_b_displaced <= 0.341512 )
									ret := 0.645833
								if( senkou_span_b_displaced > 0.341512 )
									ret := 0.861842 // buy
							if( basis_max > 0.003396 )
								ret := -0.200000
						if( senkou_span_b_displaced > 0.361333 )
							if( senkou_span_b <= 0.3425 )
								ret := 0.750000 // buy
							if( senkou_span_b > 0.3425 )
								if( kinjun_sen <= 0.359132 )
									ret := -0.200000
								if( kinjun_sen > 0.359132 )
									ret := 0.500000
					if( basis_minus > 0.015752 )
						if( chinkou_span <= 0.372655 )
							if( chinkou_span <= 0.37049 )
								if( senkou_span_a <= 0.342309 )
									ret := 0.000000
								if( senkou_span_a > 0.342309 )
									ret := -0.500000
							if( chinkou_span > 0.37049 )
								ret := -1.000000 // sell
						if( chinkou_span > 0.372655 )
							ret := 0.500000
				if( tenkan_sen > 0.365161 )
					if( basis_max <= -0.001821 )
						if( senkou_span_a <= 0.364636 )
							if( chinkou_span <= 0.399205 )
								if( senkou_span_a <= 0.363262 )
									ret := -1.000000 // sell
								if( senkou_span_a > 0.363262 )
									ret := -0.666667
							if( chinkou_span > 0.399205 )
								ret := 0.833333 // buy
						if( senkou_span_a > 0.364636 )
							if( kinjun_sen <= 0.362938 )
								if( kinjun_sen <= 0.361073 )
									ret := 0.750000 // buy
								if( kinjun_sen > 0.361073 )
									ret := -0.500000
							if( kinjun_sen > 0.362938 )
								ret := 1.000000 // buy
					if( basis_max > -0.001821 )
						if( kinjun_sen <= 0.36432 )
							if( kinjun_sen <= 0.36365 )
								ret := 1.000000 // buy
							if( kinjun_sen > 0.36365 )
								ret := 0.750000 // buy
						if( kinjun_sen > 0.36432 )
							ret := 0.250000
	if( senkou_span_a > 0.365872 )
		if( chinkou_span <= 0.388437 )
			if( kinjun_sen <= 0.379459 )
				if( chinkou_span <= 0.368169 )
					if( basis_minus <= -0.021127 )
						if( tenkan_sen <= 0.368917 )
							if( chinkou_span <= 0.365348 )
								ret := 1.000000 // buy
							if( chinkou_span > 0.365348 )
								ret := 0.500000
						if( tenkan_sen > 0.368917 )
							ret := -0.500000
					if( basis_minus > -0.021127 )
						if( kinjun_sen <= 0.363436 )
							if( senkou_span_a_displaced <= 0.332878 )
								ret := 0.000000
							if( senkou_span_a_displaced > 0.332878 )
								if( senkou_span_b <= 0.348292 )
									ret := 1.000000 // buy
								if( senkou_span_b > 0.348292 )
									ret := 0.750000 // buy
						if( kinjun_sen > 0.363436 )
							if( chinkou_span <= 0.345245 )
								if( kinjun_sen <= 0.375805 )
									ret := -0.870588 // sell
								if( kinjun_sen > 0.375805 )
									ret := 0.000000
							if( chinkou_span > 0.345245 )
								if( basis_max <= 0.001524 )
									ret := -0.397590
								if( basis_max > 0.001524 )
									ret := 0.311111
				if( chinkou_span > 0.368169 )
					if( senkou_span_b_displaced <= 0.349247 )
						if( tenkan_sen <= 0.374031 )
							ret := 0.750000 // buy
						if( tenkan_sen > 0.374031 )
							ret := 1.000000 // buy
					if( senkou_span_b_displaced > 0.349247 )
						if( senkou_span_b <= 0.379367 )
							if( senkou_span_b_displaced <= 0.374325 )
								if( cross_dn_tenkan_kinjunInt <= 0.5 )
									ret := 0.119318
								if( cross_dn_tenkan_kinjunInt > 0.5 )
									ret := 0.875000 // buy
							if( senkou_span_b_displaced > 0.374325 )
								if( senkou_span_b_displaced <= 0.376141 )
									ret := -0.733333 // sell
								if( senkou_span_b_displaced > 0.376141 )
									ret := 0.181818
						if( senkou_span_b > 0.379367 )
							if( basis_minus <= -0.006988 )
								if( tenkan_sen <= 0.375654 )
									ret := 0.896552 // buy
								if( tenkan_sen > 0.375654 )
									ret := 0.500000
							if( basis_minus > -0.006988 )
								if( senkou_span_a <= 0.375153 )
									ret := -0.250000
								if( senkou_span_a > 0.375153 )
									ret := -0.250000
			if( kinjun_sen > 0.379459 )
				if( senkou_span_a <= 0.431854 )
					if( basis_minus <= 0.016832 )
						if( kinjun_sen <= 0.432946 )
							if( kinjun_sen <= 0.415544 )
								if( senkou_span_b <= 0.40324 )
									ret := -0.451613
								if( senkou_span_b > 0.40324 )
									ret := -0.789474 // sell
							if( kinjun_sen > 0.415544 )
								if( tenkan_sen <= 0.412915 )
									ret := 0.230769
								if( tenkan_sen > 0.412915 )
									ret := -0.671233
						if( kinjun_sen > 0.432946 )
							ret := 1.000000 // buy
					if( basis_minus > 0.016832 )
						if( senkou_span_a_displaced <= 0.360222 )
							if( senkou_span_a <= 0.390039 )
								ret := -1.000000 // sell
							if( senkou_span_a > 0.390039 )
								ret := -0.500000
						if( senkou_span_a_displaced > 0.360222 )
							if( kinjun_sen <= 0.394216 )
								if( senkou_span_a_displaced <= 0.362176 )
									ret := 0.285714
								if( senkou_span_a_displaced > 0.362176 )
									ret := 0.950000 // buy
							if( kinjun_sen > 0.394216 )
								ret := -0.833333 // sell
				if( senkou_span_a > 0.431854 )
					if( chinkou_span <= 0.36655 )
						ret := -0.750000 // sell
					if( chinkou_span > 0.36655 )
						ret := -1.000000 // sell
		if( chinkou_span > 0.388437 )
			if( senkou_span_a <= 0.401038 )
				if( senkou_span_b_displaced <= 0.434933 )
					if( basis_max <= -0.002081 )
						if( basis_minus <= -0.014283 )
							if( senkou_span_a_displaced <= 0.394674 )
								ret := -1.000000 // sell
							if( senkou_span_a_displaced > 0.394674 )
								ret := -0.166667
						if( basis_minus > -0.014283 )
							if( chinkou_span <= 0.421651 )
								if( senkou_span_b <= 0.358872 )
									ret := -0.769231 // sell
								if( senkou_span_b > 0.358872 )
									ret := 0.512048
							if( chinkou_span > 0.421651 )
								if( basis_max <= -0.003095 )
									ret := -0.711538 // sell
								if( basis_max > -0.003095 )
									ret := 0.400000
					if( basis_max > -0.002081 )
						if( senkou_span_a <= 0.391906 )
							if( basis_max <= 0.004492 )
								if( basis_max <= -0.001052 )
									ret := 0.620000
								if( basis_max > -0.001052 )
									ret := 0.859551 // buy
							if( basis_max > 0.004492 )
								if( basis_max <= 0.005109 )
									ret := -0.428571
								if( basis_max > 0.005109 )
									ret := 0.720930 // buy
						if( senkou_span_a > 0.391906 )
							if( senkou_span_b <= 0.410207 )
								if( chinkou_span <= 0.40281 )
									ret := 0.208333
								if( chinkou_span > 0.40281 )
									ret := 0.787402 // buy
							if( senkou_span_b > 0.410207 )
								if( senkou_span_a_displaced <= 0.415606 )
									ret := -0.166667
								if( senkou_span_a_displaced > 0.415606 )
									ret := -1.000000 // sell
				if( senkou_span_b_displaced > 0.434933 )
					if( chinkou_span <= 0.411965 )
						ret := -0.285714
					if( chinkou_span > 0.411965 )
						ret := -1.000000 // sell
			if( senkou_span_a > 0.401038 )
				if( basis_minus <= -0.050425 )
					if( senkou_span_a_displaced <= 1.83102 )
						if( kinjun_sen <= 1.28213 )
							if( senkou_span_b_displaced <= 1.3474 )
								if( basis_max <= 0.017305 )
									ret := 0.069444
								if( basis_max > 0.017305 )
									ret := 0.647399
							if( senkou_span_b_displaced > 1.3474 )
								if( basis_max <= 0.050869 )
									ret := -0.810811 // sell
								if( basis_max > 0.050869 )
									ret := 0.111111
						if( kinjun_sen > 1.28213 )
							if( basis_max <= -0.014579 )
								if( chinkou_span <= 1.654 )
									ret := -0.842105 // sell
								if( chinkou_span > 1.654 )
									ret := 0.000000
							if( basis_max > -0.014579 )
								if( tenkan_sen <= 1.68791 )
									ret := 0.506297
								if( tenkan_sen > 1.68791 )
									ret := -0.750000 // sell
					if( senkou_span_a_displaced > 1.83102 )
						if( chinkou_span <= 1.71336 )
							if( basis_max <= 0.046828 )
								if( tenkan_sen <= 1.76617 )
									ret := -0.371134
								if( tenkan_sen > 1.76617 )
									ret := -0.891892 // sell
							if( basis_max > 0.046828 )
								ret := 0.714286 // buy
						if( chinkou_span > 1.71336 )
							if( senkou_span_a_displaced <= 2.2635 )
								if( chinkou_span <= 1.93317 )
									ret := 0.003953
								if( chinkou_span > 1.93317 )
									ret := 0.525084
							if( senkou_span_a_displaced > 2.2635 )
								if( senkou_span_b <= 2.2383 )
									ret := -0.640000
								if( senkou_span_b > 2.2383 )
									ret := -0.047619
				if( basis_minus > -0.050425 )
					if( senkou_span_b <= 1.61767 )
						if( chinkou_span <= 1.53105 )
							if( senkou_span_a <= 1.5152 )
								if( senkou_span_b_displaced <= 0.807446 )
									ret := 0.061976
								if( senkou_span_b_displaced > 0.807446 )
									ret := 0.008358
							if( senkou_span_a > 1.5152 )
								if( chinkou_span <= 1.46405 )
									ret := -0.657658
								if( chinkou_span > 1.46405 )
									ret := -0.298343
						if( chinkou_span > 1.53105 )
							if( tenkan_sen <= 1.72635 )
								if( chinkou_span <= 1.61034 )
									ret := 0.223660
								if( chinkou_span > 1.61034 )
									ret := 0.464639
							if( tenkan_sen > 1.72635 )
								if( chinkou_span <= 1.61621 )
									ret := 1.000000 // buy
								if( chinkou_span > 1.61621 )
									ret := -0.771930 // sell
					if( senkou_span_b > 1.61767 )
						if( chinkou_span <= 1.65993 )
							if( tenkan_sen <= 1.56075 )
								ret := 1.000000 // buy
							if( tenkan_sen > 1.56075 )
								if( chinkou_span <= 1.47836 )
									ret := -0.838235 // sell
								if( chinkou_span > 1.47836 )
									ret := -0.365512
						if( chinkou_span > 1.65993 )
							if( tenkan_sen <= 1.83769 )
								if( basis_minus <= 0.092746 )
									ret := 0.220573
								if( basis_minus > 0.092746 )
									ret := -0.960000 // sell
							if( tenkan_sen > 1.83769 )
								if( chinkou_span <= 1.96561 )
									ret := -0.318333
								if( chinkou_span > 1.96561 )
									ret := 0.065017
	
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
float op_operation = decision_tree_0_MATICUSDT_30Min_1da7d1eb(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)

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


