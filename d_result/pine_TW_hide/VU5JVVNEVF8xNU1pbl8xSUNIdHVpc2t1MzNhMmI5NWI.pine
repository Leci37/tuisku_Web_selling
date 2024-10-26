//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: UNIUSDT_15Min_1ICH_33a2b95b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UNIUSDT_15Min_1ICH_33a2b95b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UNIUSDT_15Min_33a2b95b(senkou_span_a_displaced, cross_dn_tenkan_kinjunInt, kinjun_sen, chinkou_span, senkou_span_b_displaced, basis_minus, senkou_span_b, senkou_span_a, cross_up_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( basis_max <= 0.017761 )
		if( tenkan_sen <= 7.07051 )
			if( chinkou_span <= 6.99021 )
				if( kinjun_sen <= 6.81056 )
					if( chinkou_span <= 6.34405 )
						if( senkou_span_b <= 6.16084 )
							if( chinkou_span <= 6.12009 )
								if( tenkan_sen <= 5.98608 )
									ret := 0.046935
								if( tenkan_sen > 5.98608 )
									ret := -0.168147
							if( chinkou_span > 6.12009 )
								if( tenkan_sen <= 6.11399 )
									ret := 0.524189
								if( tenkan_sen > 6.11399 )
									ret := 0.118560
						if( senkou_span_b > 6.16084 )
							if( chinkou_span <= 6.09771 )
								if( senkou_span_a <= 6.08091 )
									ret := 0.108434
								if( senkou_span_a > 6.08091 )
									ret := -0.562028
							if( chinkou_span > 6.09771 )
								if( senkou_span_a <= 6.27951 )
									ret := -0.021251
								if( senkou_span_a > 6.27951 )
									ret := -0.317375
					if( chinkou_span > 6.34405 )
						if( senkou_span_a <= 6.35368 )
							if( chinkou_span <= 6.50123 )
								if( tenkan_sen <= 6.21842 )
									ret := 0.630045
								if( tenkan_sen > 6.21842 )
									ret := 0.357696
							if( chinkou_span > 6.50123 )
								if( senkou_span_b_displaced <= 6.36782 )
									ret := 0.777966 // buy
								if( senkou_span_b_displaced > 6.36782 )
									ret := 0.170213
						if( senkou_span_a > 6.35368 )
							if( chinkou_span <= 6.5638 )
								if( senkou_span_a <= 6.60803 )
									ret := -0.019217
								if( senkou_span_a > 6.60803 )
									ret := -0.476793
							if( chinkou_span > 6.5638 )
								if( tenkan_sen <= 6.52789 )
									ret := 0.539823
								if( tenkan_sen > 6.52789 )
									ret := 0.135936
				if( kinjun_sen > 6.81056 )
					if( chinkou_span <= 6.80539 )
						if( senkou_span_b_displaced <= 7.14599 )
							if( chinkou_span <= 6.71999 )
								if( senkou_span_b_displaced <= 6.77689 )
									ret := -0.868687 // sell
								if( senkou_span_b_displaced > 6.77689 )
									ret := -0.612903
							if( chinkou_span > 6.71999 )
								if( basis_minus <= -0.02917 )
									ret := -0.153846
								if( basis_minus > -0.02917 )
									ret := -0.511688
						if( senkou_span_b_displaced > 7.14599 )
							if( tenkan_sen <= 6.93 )
								ret := -0.500000
							if( tenkan_sen > 6.93 )
								if( tenkan_sen <= 7.00527 )
									ret := 1.000000 // buy
								if( tenkan_sen > 7.00527 )
									ret := 0.565217
					if( chinkou_span > 6.80539 )
						if( tenkan_sen <= 6.96278 )
							if( senkou_span_b_displaced <= 6.9005 )
								if( senkou_span_b <= 6.80445 )
									ret := -0.117021
								if( senkou_span_b > 6.80445 )
									ret := 0.304598
							if( senkou_span_b_displaced > 6.9005 )
								if( senkou_span_b <= 6.90888 )
									ret := -0.275862
								if( senkou_span_b > 6.90888 )
									ret := 0.058824
						if( tenkan_sen > 6.96278 )
							if( basis_minus <= 0.121374 )
								if( senkou_span_b_displaced <= 7.19575 )
									ret := -0.295987
								if( senkou_span_b_displaced > 7.19575 )
									ret := 0.655172
							if( basis_minus > 0.121374 )
								if( basis_max <= -0.04 )
									ret := -0.200000
								if( basis_max > -0.04 )
									ret := 0.545455
			if( chinkou_span > 6.99021 )
				if( chinkou_span <= 7.1972 )
					if( senkou_span_a <= 6.99837 )
						if( tenkan_sen <= 6.8579 )
							if( basis_minus <= -0.017885 )
								if( senkou_span_a <= 6.79933 )
									ret := 0.531646
								if( senkou_span_a > 6.79933 )
									ret := -0.071429
							if( basis_minus > -0.017885 )
								if( senkou_span_b_displaced <= 6.75019 )
									ret := 0.645669
								if( senkou_span_b_displaced > 6.75019 )
									ret := 0.887417 // buy
						if( tenkan_sen > 6.8579 )
							if( kinjun_sen <= 6.96058 )
								if( basis_minus <= -0.11875 )
									ret := 0.692308
								if( basis_minus > -0.11875 )
									ret := 0.160494
							if( kinjun_sen > 6.96058 )
								if( chinkou_span <= 7.08665 )
									ret := 0.798561 // buy
								if( chinkou_span > 7.08665 )
									ret := 0.233333
					if( senkou_span_a > 6.99837 )
						if( basis_max <= -0.011052 )
							if( senkou_span_b_displaced <= 6.94385 )
								if( senkou_span_a <= 7.02679 )
									ret := -0.732673 // sell
								if( senkou_span_a > 7.02679 )
									ret := 0.000000
							if( senkou_span_b_displaced > 6.94385 )
								if( cross_up_tenkan_kinjunInt <= 0.5 )
									ret := 0.346939
								if( cross_up_tenkan_kinjunInt > 0.5 )
									ret := -1.000000 // sell
						if( basis_max > -0.011052 )
							if( senkou_span_a_displaced <= 6.97096 )
								if( senkou_span_a_displaced <= 6.94472 )
									ret := 0.190476
								if( senkou_span_a_displaced > 6.94472 )
									ret := 0.888889 // buy
							if( senkou_span_a_displaced > 6.97096 )
								if( kinjun_sen <= 7.09487 )
									ret := 0.078947
								if( kinjun_sen > 7.09487 )
									ret := 0.944444 // buy
				if( chinkou_span > 7.1972 )
					if( kinjun_sen <= 6.70399 )
						if( senkou_span_b_displaced <= 6.99076 )
							ret := 0.166667
						if( senkou_span_b_displaced > 6.99076 )
							if( tenkan_sen <= 7.00019 )
								ret := -0.500000
							if( tenkan_sen > 7.00019 )
								ret := -1.000000 // sell
					if( kinjun_sen > 6.70399 )
						if( basis_minus <= 0.049757 )
							if( senkou_span_b_displaced <= 7.15146 )
								if( senkou_span_b_displaced <= 7.12887 )
									ret := 0.541322
								if( senkou_span_b_displaced > 7.12887 )
									ret := -0.190476
							if( senkou_span_b_displaced > 7.15146 )
								if( kinjun_sen <= 6.88611 )
									ret := -0.500000
								if( kinjun_sen > 6.88611 )
									ret := 0.868421 // buy
						if( basis_minus > 0.049757 )
							if( basis_max <= -0.049691 )
								ret := 0.142857
							if( basis_max > -0.049691 )
								if( basis_max <= -0.0015 )
									ret := 0.856459 // buy
								if( basis_max > -0.0015 )
									ret := 0.541667
		if( tenkan_sen > 7.07051 )
			if( chinkou_span <= 7.22422 )
				if( senkou_span_a <= 7.301 )
					if( tenkan_sen <= 7.29994 )
						if( tenkan_sen <= 7.1825 )
							if( senkou_span_b <= 6.97781 )
								if( tenkan_sen <= 7.12512 )
									ret := -0.750000 // sell
								if( tenkan_sen > 7.12512 )
									ret := -0.222222
							if( senkou_span_b > 6.97781 )
								if( senkou_span_b <= 7.08991 )
									ret := 0.031746
								if( senkou_span_b > 7.08991 )
									ret := -0.247024
						if( tenkan_sen > 7.1825 )
							if( chinkou_span <= 7.17844 )
								if( senkou_span_a <= 7.17823 )
									ret := -0.686567
								if( senkou_span_a > 7.17823 )
									ret := -0.433107
							if( chinkou_span > 7.17844 )
								if( chinkou_span <= 7.18086 )
									ret := 0.733333 // buy
								if( chinkou_span > 7.18086 )
									ret := -0.201550
					if( tenkan_sen > 7.29994 )
						if( tenkan_sen <= 7.3482 )
							if( tenkan_sen <= 7.31477 )
								if( basis_max <= -0.00977 )
									ret := 0.857143 // buy
								if( basis_max > -0.00977 )
									ret := -0.250000
							if( tenkan_sen > 7.31477 )
								if( senkou_span_b_displaced <= 7.03546 )
									ret := 0.000000
								if( senkou_span_b_displaced > 7.03546 )
									ret := 0.461538
						if( tenkan_sen > 7.3482 )
							if( senkou_span_b_displaced <= 7.10859 )
								if( basis_minus <= 0.11925 )
									ret := -0.250000
								if( basis_minus > 0.11925 )
									ret := -0.500000
							if( senkou_span_b_displaced > 7.10859 )
								if( senkou_span_b_displaced <= 7.16379 )
									ret := -0.750000 // sell
								if( senkou_span_b_displaced > 7.16379 )
									ret := -1.000000 // sell
				if( senkou_span_a > 7.301 )
					if( chinkou_span <= 7.20645 )
						if( kinjun_sen <= 7.33971 )
							if( basis_minus <= -0.0385 )
								ret := -0.250000
							if( basis_minus > -0.0385 )
								if( senkou_span_a_displaced <= 7.16256 )
									ret := -0.692308
								if( senkou_span_a_displaced > 7.16256 )
									ret := -0.915094 // sell
						if( kinjun_sen > 7.33971 )
							if( kinjun_sen <= 7.34452 )
								ret := 1.000000 // buy
							if( kinjun_sen > 7.34452 )
								if( basis_minus <= 0.004968 )
									ret := -0.792350 // sell
								if( basis_minus > 0.004968 )
									ret := -0.472441
					if( chinkou_span > 7.20645 )
						if( tenkan_sen <= 7.32906 )
							if( basis_minus <= 0.103349 )
								ret := 1.000000 // buy
							if( basis_minus > 0.103349 )
								ret := 0.000000
						if( tenkan_sen > 7.32906 )
							if( tenkan_sen <= 7.37375 )
								if( chinkou_span <= 7.2136 )
									ret := -1.000000 // sell
								if( chinkou_span > 7.2136 )
									ret := -0.428571
							if( tenkan_sen > 7.37375 )
								if( senkou_span_b <= 7.405 )
									ret := 0.333333
								if( senkou_span_b > 7.405 )
									ret := -0.461538
			if( chinkou_span > 7.22422 )
				if( senkou_span_b <= 7.28247 )
					if( senkou_span_b_displaced <= 6.80925 )
						if( senkou_span_a_displaced <= 6.72875 )
							if( tenkan_sen <= 7.14951 )
								ret := 1.000000 // buy
							if( tenkan_sen > 7.14951 )
								ret := 0.750000 // buy
						if( senkou_span_a_displaced > 6.72875 )
							if( basis_minus <= 0.079078 )
								if( senkou_span_a <= 7.08052 )
									ret := -0.750000 // sell
								if( senkou_span_a > 7.08052 )
									ret := 0.500000
							if( basis_minus > 0.079078 )
								if( tenkan_sen <= 7.5285 )
									ret := -0.968750 // sell
								if( tenkan_sen > 7.5285 )
									ret := -0.750000 // sell
					if( senkou_span_b_displaced > 6.80925 )
						if( kinjun_sen <= 7.10475 )
							if( senkou_span_a_displaced <= 6.85106 )
								if( chinkou_span <= 7.2685 )
									ret := -0.571429
								if( chinkou_span > 7.2685 )
									ret := 0.357143
							if( senkou_span_a_displaced > 6.85106 )
								if( basis_minus <= -0.08925 )
									ret := 0.125000
								if( basis_minus > -0.08925 )
									ret := 0.815029 // buy
						if( kinjun_sen > 7.10475 )
							if( senkou_span_a_displaced <= 6.95761 )
								if( chinkou_span <= 7.39923 )
									ret := -0.031746
								if( chinkou_span > 7.39923 )
									ret := -0.729730 // sell
							if( senkou_span_a_displaced > 6.95761 )
								if( chinkou_span <= 7.40404 )
									ret := 0.219355
								if( chinkou_span > 7.40404 )
									ret := 0.539898
				if( senkou_span_b > 7.28247 )
					if( chinkou_span <= 7.4424 )
						if( basis_minus <= 0.034006 )
							if( senkou_span_a_displaced <= 7.61451 )
								if( senkou_span_b_displaced <= 7.565 )
									ret := -0.186475
								if( senkou_span_b_displaced > 7.565 )
									ret := 0.224138
							if( senkou_span_a_displaced > 7.61451 )
								if( kinjun_sen <= 7.89103 )
									ret := -0.565574
								if( kinjun_sen > 7.89103 )
									ret := 0.150000
						if( basis_minus > 0.034006 )
							if( kinjun_sen <= 7.63758 )
								if( kinjun_sen <= 7.58275 )
									ret := -0.600000
								if( kinjun_sen > 7.58275 )
									ret := 0.483871
							if( kinjun_sen > 7.63758 )
								if( senkou_span_b <= 7.62984 )
									ret := -0.955556 // sell
								if( senkou_span_b > 7.62984 )
									ret := -0.200000
					if( chinkou_span > 7.4424 )
						if( kinjun_sen <= 7.6494 )
							if( chinkou_span <= 7.6335 )
								if( kinjun_sen <= 7.51425 )
									ret := 0.225852
								if( kinjun_sen > 7.51425 )
									ret := -0.052857
							if( chinkou_span > 7.6335 )
								if( tenkan_sen <= 7.91425 )
									ret := 0.414815
								if( tenkan_sen > 7.91425 )
									ret := -0.950000 // sell
						if( kinjun_sen > 7.6494 )
							if( chinkou_span <= 7.92298 )
								if( basis_max <= 0.000984 )
									ret := -0.375333
								if( basis_max > 0.000984 )
									ret := -0.131649
							if( chinkou_span > 7.92298 )
								if( kinjun_sen <= 8.00247 )
									ret := 0.377828
								if( kinjun_sen > 8.00247 )
									ret := -0.004780
	if( basis_max > 0.017761 )
		if( tenkan_sen <= 3.54188 )
			ret := 1.000000 // buy
		if( tenkan_sen > 3.54188 )
			if( senkou_span_a_displaced <= 4.36074 )
				if( senkou_span_b <= 4.23851 )
					if( senkou_span_b <= 3.6125 )
						if( senkou_span_a <= 3.69625 )
							if( chinkou_span <= 3.72854 )
								ret := 1.000000 // buy
							if( chinkou_span > 3.72854 )
								ret := 0.500000
						if( senkou_span_a > 3.69625 )
							ret := -0.500000
					if( senkou_span_b > 3.6125 )
						if( senkou_span_b_displaced <= 3.97371 )
							if( senkou_span_a_displaced <= 3.71149 )
								if( chinkou_span <= 3.65804 )
									ret := 0.888889 // buy
								if( chinkou_span > 3.65804 )
									ret := -0.466667
							if( senkou_span_a_displaced > 3.71149 )
								if( basis_minus <= -0.003983 )
									ret := -0.833333 // sell
								if( basis_minus > -0.003983 )
									ret := -0.272727
						if( senkou_span_b_displaced > 3.97371 )
							if( chinkou_span <= 3.66054 )
								if( senkou_span_b <= 4.0825 )
									ret := -0.754717 // sell
								if( senkou_span_b > 4.0825 )
									ret := 0.071429
							if( chinkou_span > 3.66054 )
								if( basis_max <= 0.040906 )
									ret := 0.000000
								if( basis_max > 0.040906 )
									ret := 0.844444 // buy
				if( senkou_span_b > 4.23851 )
					if( chinkou_span <= 4.13484 )
						if( senkou_span_b_displaced <= 4.33774 )
							if( senkou_span_a_displaced <= 4.2258 )
								ret := -0.750000 // sell
							if( senkou_span_a_displaced > 4.2258 )
								ret := -1.000000 // sell
						if( senkou_span_b_displaced > 4.33774 )
							ret := -0.666667
					if( chinkou_span > 4.13484 )
						if( senkou_span_b_displaced <= 4.29525 )
							ret := -1.000000 // sell
						if( senkou_span_b_displaced > 4.29525 )
							if( senkou_span_a <= 4.34875 )
								if( senkou_span_b_displaced <= 4.35296 )
									ret := 0.093750
								if( senkou_span_b_displaced > 4.35296 )
									ret := -0.800000 // sell
							if( senkou_span_a > 4.34875 )
								if( senkou_span_b_displaced <= 4.31014 )
									ret := 0.250000
								if( senkou_span_b_displaced > 4.31014 )
									ret := 1.000000 // buy
			if( senkou_span_a_displaced > 4.36074 )
				if( senkou_span_a <= 5.82249 )
					if( chinkou_span <= 5.76151 )
						if( tenkan_sen <= 5.06938 )
							if( chinkou_span <= 4.903 )
								if( chinkou_span <= 4.27083 )
									ret := 0.698276
								if( chinkou_span > 4.27083 )
									ret := 0.025367
							if( chinkou_span > 4.903 )
								if( senkou_span_a_displaced <= 5.53125 )
									ret := 0.610769
								if( senkou_span_a_displaced > 5.53125 )
									ret := 0.046512
						if( tenkan_sen > 5.06938 )
							if( chinkou_span <= 5.14801 )
								if( senkou_span_a_displaced <= 5.25355 )
									ret := 0.179104
								if( senkou_span_a_displaced > 5.25355 )
									ret := -0.443864
							if( chinkou_span > 5.14801 )
								if( senkou_span_a <= 5.42249 )
									ret := 0.358510
								if( senkou_span_a > 5.42249 )
									ret := 0.019266
					if( chinkou_span > 5.76151 )
						if( senkou_span_b <= 5.75325 )
							if( senkou_span_a_displaced <= 5.61787 )
								if( senkou_span_b_displaced <= 5.5383 )
									ret := 0.642857
								if( senkou_span_b_displaced > 5.5383 )
									ret := -0.200000
							if( senkou_span_a_displaced > 5.61787 )
								if( basis_max <= 0.064481 )
									ret := 0.910959 // buy
								if( basis_max > 0.064481 )
									ret := 0.526316
						if( senkou_span_b > 5.75325 )
							if( senkou_span_a_displaced <= 5.82875 )
								if( senkou_span_a <= 5.77588 )
									ret := 0.428571
								if( senkou_span_a > 5.77588 )
									ret := 0.000000
							if( senkou_span_a_displaced > 5.82875 )
								if( senkou_span_b <= 5.83349 )
									ret := 0.140000
								if( senkou_span_b > 5.83349 )
									ret := 0.767956 // buy
				if( senkou_span_a > 5.82249 )
					if( basis_minus <= -0.115316 )
						if( kinjun_sen <= 15.418 )
							if( senkou_span_a <= 13.2522 )
								if( kinjun_sen <= 13.154 )
									ret := 0.146770
								if( kinjun_sen > 13.154 )
									ret := -0.840000 // sell
							if( senkou_span_a > 13.2522 )
								if( tenkan_sen <= 13.749 )
									ret := 0.941176 // buy
								if( tenkan_sen > 13.749 )
									ret := 0.384146
						if( kinjun_sen > 15.418 )
							if( senkou_span_a_displaced <= 15.85 )
								if( chinkou_span <= 14.9905 )
									ret := -0.785714 // sell
								if( chinkou_span > 14.9905 )
									ret := -1.000000 // sell
							if( senkou_span_a_displaced > 15.85 )
								ret := 0.166667
					if( basis_minus > -0.115316 )
						if( senkou_span_b <= 12.8285 )
							if( senkou_span_a_displaced <= 12.4566 )
								if( senkou_span_b_displaced <= 5.819 )
									ret := 0.641791
								if( senkou_span_b_displaced > 5.819 )
									ret := 0.056264
							if( senkou_span_a_displaced > 12.4566 )
								if( chinkou_span <= 12.8919 )
									ret := 0.409574
								if( chinkou_span > 12.8919 )
									ret := 0.893617 // buy
						if( senkou_span_b > 12.8285 )
							if( chinkou_span <= 14.7005 )
								if( senkou_span_a_displaced <= 14.255 )
									ret := -0.195767
								if( senkou_span_a_displaced > 14.255 )
									ret := -0.695238
							if( chinkou_span > 14.7005 )
								if( basis_minus <= 0.80675 )
									ret := 0.409836
								if( basis_minus > 0.80675 )
									ret := -0.777778 // sell
	
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
float op_operation = decision_tree_0_UNIUSDT_15Min_33a2b95b(senkou_span_a_displaced, cross_dn_tenkan_kinjunInt, kinjun_sen, chinkou_span, senkou_span_b_displaced, basis_minus, senkou_span_b, senkou_span_a, cross_up_tenkan_kinjunInt, tenkan_sen, basis_max)

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


