//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: AVAXUSDT_30Min_1ICH_37196b4a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AVAXUSDT_30Min_1ICH_37196b4a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AVAXUSDT_30Min_37196b4a(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( basis_max <= -0.200008 )
		if( senkou_span_a <= 121.846 )
			if( chinkou_span <= 29.6413 )
				if( senkou_span_b <= 26.7925 )
					if( chinkou_span <= 17.7385 )
						if( senkou_span_a_displaced <= 11.0047 )
							if( kinjun_sen <= 6.0225 )
								if( kinjun_sen <= 4.96041 )
									ret := -1.000000 // sell
								if( kinjun_sen > 4.96041 )
									ret := -0.444444
							if( kinjun_sen > 6.0225 )
								if( basis_max <= -0.312946 )
									ret := 0.652174
								if( basis_max > -0.312946 )
									ret := 0.212389
						if( senkou_span_a_displaced > 11.0047 )
							if( chinkou_span <= 13.3812 )
								if( tenkan_sen <= 12.2527 )
									ret := -0.348837
								if( tenkan_sen > 12.2527 )
									ret := -0.839623 // sell
							if( chinkou_span > 13.3812 )
								if( tenkan_sen <= 17.1635 )
									ret := -0.117512
								if( tenkan_sen > 17.1635 )
									ret := -0.761062 // sell
					if( chinkou_span > 17.7385 )
						if( senkou_span_a <= 19.2775 )
							if( basis_minus <= 0.253356 )
								if( chinkou_span <= 18.5465 )
									ret := 0.200000
								if( chinkou_span > 18.5465 )
									ret := 0.795699 // buy
							if( basis_minus > 0.253356 )
								if( senkou_span_a_displaced <= 17.1075 )
									ret := 0.040609
								if( senkou_span_a_displaced > 17.1075 )
									ret := 0.464088
						if( senkou_span_a > 19.2775 )
							if( basis_minus <= 0.642365 )
								if( senkou_span_a <= 23.4661 )
									ret := -0.215010
								if( senkou_span_a > 23.4661 )
									ret := 0.236659
							if( basis_minus > 0.642365 )
								if( senkou_span_a <= 21.9147 )
									ret := 0.053435
								if( senkou_span_a > 21.9147 )
									ret := -0.325163
				if( senkou_span_b > 26.7925 )
					if( chinkou_span <= 27.9009 )
						if( senkou_span_b <= 30.9925 )
							if( senkou_span_a <= 27.0461 )
								if( tenkan_sen <= 26.7128 )
									ret := -0.900000 // sell
								if( tenkan_sen > 26.7128 )
									ret := -1.000000 // sell
							if( senkou_span_a > 27.0461 )
								if( senkou_span_a_displaced <= 26.3628 )
									ret := -0.444444
								if( senkou_span_a_displaced > 26.3628 )
									ret := -0.827476 // sell
						if( senkou_span_b > 30.9925 )
							if( kinjun_sen <= 35.9811 )
								ret := 0.857143 // buy
							if( kinjun_sen > 35.9811 )
								ret := -1.000000 // sell
					if( chinkou_span > 27.9009 )
						if( chinkou_span <= 28.157 )
							if( senkou_span_a <= 28.6826 )
								if( tenkan_sen <= 27.9999 )
									ret := 0.666667
								if( tenkan_sen > 27.9999 )
									ret := -0.035714
							if( senkou_span_a > 28.6826 )
								ret := -0.866667 // sell
						if( chinkou_span > 28.157 )
							if( basis_max <= -0.299983 )
								if( tenkan_sen <= 29.896 )
									ret := -0.541667
								if( tenkan_sen > 29.896 )
									ret := -0.845070 // sell
							if( basis_max > -0.299983 )
								if( senkou_span_b_displaced <= 27.8029 )
									ret := -0.613333
								if( senkou_span_b_displaced > 27.8029 )
									ret := -0.110294
			if( chinkou_span > 29.6413 )
				if( senkou_span_a <= 29.3295 )
					if( senkou_span_b <= 25.0329 )
						if( basis_minus <= 1.11185 )
							ret := 0.642857
						if( basis_minus > 1.11185 )
							ret := 1.000000 // buy
					if( senkou_span_b > 25.0329 )
						if( senkou_span_b <= 27.305 )
							if( senkou_span_a <= 27.3598 )
								if( basis_minus <= 0.352414 )
									ret := 1.000000 // buy
								if( basis_minus > 0.352414 )
									ret := 0.428571
							if( senkou_span_a > 27.3598 )
								if( senkou_span_a <= 28.3362 )
									ret := -0.486486
								if( senkou_span_a > 28.3362 )
									ret := 1.000000 // buy
						if( senkou_span_b > 27.305 )
							if( senkou_span_a <= 28.9346 )
								if( basis_max <= -0.225125 )
									ret := 0.952941 // buy
								if( basis_max > -0.225125 )
									ret := 0.700000 // buy
							if( senkou_span_a > 28.9346 )
								if( basis_minus <= 0.782963 )
									ret := 0.444444
								if( basis_minus > 0.782963 )
									ret := 1.000000 // buy
				if( senkou_span_a > 29.3295 )
					if( kinjun_sen <= 118.107 )
						if( senkou_span_b_displaced <= 28.8236 )
							if( senkou_span_a_displaced <= 27.022 )
								if( basis_max <= -0.889441 )
									ret := -0.865385 // sell
								if( basis_max > -0.889441 )
									ret := 0.037500
							if( senkou_span_a_displaced > 27.022 )
								if( senkou_span_b <= 30.3789 )
									ret := 0.767045 // buy
								if( senkou_span_b > 30.3789 )
									ret := -0.096154
						if( senkou_span_b_displaced > 28.8236 )
							if( senkou_span_b <= 30.935 )
								if( senkou_span_a_displaced <= 29.6088 )
									ret := -0.655738
								if( senkou_span_a_displaced > 29.6088 )
									ret := -0.223958
							if( senkou_span_b > 30.935 )
								if( senkou_span_a_displaced <= 30.4033 )
									ret := 0.850000 // buy
								if( senkou_span_a_displaced > 30.4033 )
									ret := -0.047713
					if( kinjun_sen > 118.107 )
						if( senkou_span_a_displaced <= 118.421 )
							if( kinjun_sen <= 120.253 )
								if( senkou_span_b_displaced <= 115.457 )
									ret := 1.000000 // buy
								if( senkou_span_b_displaced > 115.457 )
									ret := 0.480000
							if( kinjun_sen > 120.253 )
								if( basis_minus <= 3.12424 )
									ret := 1.000000 // buy
								if( basis_minus > 3.12424 )
									ret := 0.800000 // buy
						if( senkou_span_a_displaced > 118.421 )
							if( chinkou_span <= 123.021 )
								ret := -0.250000
							if( chinkou_span > 123.021 )
								ret := -0.785714 // sell
		if( senkou_span_a > 121.846 )
			if( chinkou_span <= 119.325 )
				if( senkou_span_b <= 122.328 )
					if( tenkan_sen <= 125.353 )
						if( basis_max <= -0.622282 )
							ret := -0.400000
						if( basis_max > -0.622282 )
							ret := -0.750000 // sell
					if( tenkan_sen > 125.353 )
						ret := -1.000000 // sell
				if( senkou_span_b > 122.328 )
					ret := -1.000000 // sell
			if( chinkou_span > 119.325 )
				if( senkou_span_b_displaced <= 136.324 )
					if( kinjun_sen <= 122.324 )
						if( senkou_span_b <= 118.692 )
							ret := -1.000000 // sell
						if( senkou_span_b > 118.692 )
							if( kinjun_sen <= 122.053 )
								ret := -0.058824
							if( kinjun_sen > 122.053 )
								ret := -0.764706 // sell
					if( kinjun_sen > 122.324 )
						if( kinjun_sen <= 131.252 )
							if( chinkou_span <= 125.67 )
								ret := -0.333333
							if( chinkou_span > 125.67 )
								if( chinkou_span <= 131.357 )
									ret := 1.000000 // buy
								if( chinkou_span > 131.357 )
									ret := 0.590909
						if( kinjun_sen > 131.252 )
							if( senkou_span_a_displaced <= 127.222 )
								ret := -0.909091 // sell
							if( senkou_span_a_displaced > 127.222 )
								if( chinkou_span <= 136.288 )
									ret := 0.500000
								if( chinkou_span > 136.288 )
									ret := -0.187500
				if( senkou_span_b_displaced > 136.324 )
					ret := -1.000000 // sell
	if( basis_max > -0.200008 )
		if( senkou_span_a_displaced <= 35.6035 )
			if( chinkou_span <= 34.9443 )
				if( senkou_span_a <= 33.7451 )
					if( basis_minus <= -1.1258 )
						if( tenkan_sen <= 30.1411 )
							if( chinkou_span <= 15.5595 )
								if( senkou_span_b_displaced <= 17.4406 )
									ret := -0.888889 // sell
								if( senkou_span_b_displaced > 17.4406 )
									ret := 0.000000
							if( chinkou_span > 15.5595 )
								if( senkou_span_a <= 20.2781 )
									ret := 0.709497 // buy
								if( senkou_span_a > 20.2781 )
									ret := 0.268081
						if( tenkan_sen > 30.1411 )
							if( senkou_span_b <= 34.4655 )
								if( tenkan_sen <= 31.8605 )
									ret := -0.222222
								if( tenkan_sen > 31.8605 )
									ret := 0.511628
							if( senkou_span_b > 34.4655 )
								if( senkou_span_a_displaced <= 34.9415 )
									ret := -1.000000 // sell
								if( senkou_span_a_displaced > 34.9415 )
									ret := -0.909091 // sell
					if( basis_minus > -1.1258 )
						if( tenkan_sen <= 2.9028 )
							if( senkou_span_a <= 2.90673 )
								if( senkou_span_b <= 2.85804 )
									ret := 1.000000 // buy
								if( senkou_span_b > 2.85804 )
									ret := 0.033898
							if( senkou_span_a > 2.90673 )
								if( senkou_span_b <= 3.13687 )
									ret := 1.000000 // buy
								if( senkou_span_b > 3.13687 )
									ret := 0.894737 // buy
						if( tenkan_sen > 2.9028 )
							if( senkou_span_b_displaced <= 3.10067 )
								if( chinkou_span <= 3.17564 )
									ret := -0.360577
								if( chinkou_span > 3.17564 )
									ret := 0.140000
							if( senkou_span_b_displaced > 3.10067 )
								if( chinkou_span <= 32.8302 )
									ret := 0.014412
								if( chinkou_span > 32.8302 )
									ret := 0.377577
				if( senkou_span_a > 33.7451 )
					if( basis_minus <= -0.903153 )
						if( kinjun_sen <= 34.3149 )
							ret := -0.692308
						if( kinjun_sen > 34.3149 )
							ret := -1.000000 // sell
					if( basis_minus > -0.903153 )
						if( senkou_span_b <= 35.3404 )
							if( senkou_span_a_displaced <= 35.4507 )
								if( kinjun_sen <= 35.7788 )
									ret := -0.308921
								if( kinjun_sen > 35.7788 )
									ret := 0.444444
							if( senkou_span_a_displaced > 35.4507 )
								if( basis_max <= 0.113511 )
									ret := 0.913043 // buy
								if( basis_max > 0.113511 )
									ret := 0.263158
						if( senkou_span_b > 35.3404 )
							if( kinjun_sen <= 36.034 )
								if( tenkan_sen <= 35.6942 )
									ret := -0.806452 // sell
								if( tenkan_sen > 35.6942 )
									ret := -0.357143
							if( kinjun_sen > 36.034 )
								ret := 0.800000 // buy
			if( chinkou_span > 34.9443 )
				if( kinjun_sen <= 33.669 )
					if( senkou_span_a_displaced <= 34.9755 )
						if( senkou_span_b_displaced <= 27.4976 )
							ret := 0.000000
						if( senkou_span_b_displaced > 27.4976 )
							if( basis_max <= -0.169013 )
								ret := 0.176471
							if( basis_max > -0.169013 )
								if( senkou_span_a <= 33.13 )
									ret := 0.813472 // buy
								if( senkou_span_a > 33.13 )
									ret := 0.983193 // buy
					if( senkou_span_a_displaced > 34.9755 )
						ret := 0.294118
				if( kinjun_sen > 33.669 )
					if( senkou_span_b_displaced <= 32.2952 )
						ret := -1.000000 // sell
					if( senkou_span_b_displaced > 32.2952 )
						if( basis_max <= -0.179049 )
							if( tenkan_sen <= 36.7607 )
								if( basis_minus <= 0.3 )
									ret := 0.375000
								if( basis_minus > 0.3 )
									ret := 0.142857
							if( tenkan_sen > 36.7607 )
								if( senkou_span_a_displaced <= 35.3278 )
									ret := -1.000000 // sell
								if( senkou_span_a_displaced > 35.3278 )
									ret := -0.555556
						if( basis_max > -0.179049 )
							if( basis_minus <= -0.7325 )
								if( senkou_span_b_displaced <= 35.751 )
									ret := -0.967742 // sell
								if( senkou_span_b_displaced > 35.751 )
									ret := 0.918919 // buy
							if( basis_minus > -0.7325 )
								if( basis_minus <= -0.323438 )
									ret := 0.833333 // buy
								if( basis_minus > -0.323438 )
									ret := 0.447222
		if( senkou_span_a_displaced > 35.6035 )
			if( chinkou_span <= 35.2084 )
				if( tenkan_sen <= 36.0176 )
					if( senkou_span_b <= 37.2779 )
						if( senkou_span_b <= 30.0185 )
							if( senkou_span_a <= 25.5294 )
								ret := 0.076923
							if( senkou_span_a > 25.5294 )
								ret := 1.000000 // buy
						if( senkou_span_b > 30.0185 )
							if( senkou_span_b_displaced <= 36.3757 )
								if( basis_minus <= -0.807979 )
									ret := -0.727848 // sell
								if( basis_minus > -0.807979 )
									ret := -0.260163
							if( senkou_span_b_displaced > 36.3757 )
								if( kinjun_sen <= 33.7493 )
									ret := -1.000000 // sell
								if( kinjun_sen > 33.7493 )
									ret := 0.166667
					if( senkou_span_b > 37.2779 )
						if( senkou_span_a_displaced <= 45.1 )
							if( basis_max <= 0.487825 )
								ret := -1.000000 // sell
							if( basis_max > 0.487825 )
								ret := -0.500000
						if( senkou_span_a_displaced > 45.1 )
							ret := -1.000000 // sell
				if( tenkan_sen > 36.0176 )
					if( basis_minus <= -1.16271 )
						if( senkou_span_a <= 38.6219 )
							if( senkou_span_b <= 39.9847 )
								ret := -0.052632
							if( senkou_span_b > 39.9847 )
								if( senkou_span_a_displaced <= 44.3125 )
									ret := -0.700000 // sell
								if( senkou_span_a_displaced > 44.3125 )
									ret := -1.000000 // sell
						if( senkou_span_a > 38.6219 )
							if( senkou_span_a <= 43.3275 )
								if( kinjun_sen <= 39.7687 )
									ret := 0.846154 // buy
								if( kinjun_sen > 39.7687 )
									ret := 1.000000 // buy
							if( senkou_span_a > 43.3275 )
								ret := -1.000000 // sell
					if( basis_minus > -1.16271 )
						if( chinkou_span <= 34.8373 )
							if( senkou_span_a <= 36.199 )
								if( senkou_span_a <= 36.1598 )
									ret := -0.809524 // sell
								if( senkou_span_a > 36.1598 )
									ret := -0.181818
							if( senkou_span_a > 36.199 )
								if( senkou_span_b_displaced <= 35.3895 )
									ret := -0.760000 // sell
								if( senkou_span_b_displaced > 35.3895 )
									ret := -0.930435 // sell
						if( chinkou_span > 34.8373 )
							if( senkou_span_a_displaced <= 39.2584 )
								if( tenkan_sen <= 37.3051 )
									ret := -0.547619
								if( tenkan_sen > 37.3051 )
									ret := -1.000000 // sell
							if( senkou_span_a_displaced > 39.2584 )
								ret := 0.636364
			if( chinkou_span > 35.2084 )
				if( basis_minus <= 3.81025 )
					if( senkou_span_a <= 36.921 )
						if( tenkan_sen <= 34.2288 )
							if( basis_minus <= -1.126 )
								ret := 0.818182 // buy
							if( basis_minus > -1.126 )
								ret := 1.000000 // buy
						if( tenkan_sen > 34.2288 )
							if( senkou_span_b_displaced <= 36.5534 )
								if( senkou_span_b_displaced <= 35.7323 )
									ret := 0.360577
								if( senkou_span_b_displaced > 35.7323 )
									ret := -0.121849
							if( senkou_span_b_displaced > 36.5534 )
								if( senkou_span_a <= 35.5513 )
									ret := -0.085714
								if( senkou_span_a > 35.5513 )
									ret := 0.314112
					if( senkou_span_a > 36.921 )
						if( chinkou_span <= 39.156 )
							if( tenkan_sen <= 38.6107 )
								if( chinkou_span <= 37.2245 )
									ret := -0.278689
								if( chinkou_span > 37.2245 )
									ret := 0.284024
							if( tenkan_sen > 38.6107 )
								if( senkou_span_b <= 44.082 )
									ret := -0.417614
								if( senkou_span_b > 44.082 )
									ret := -0.846154 // sell
						if( chinkou_span > 39.156 )
							if( senkou_span_a_displaced <= 49.0792 )
								if( chinkou_span <= 44.06 )
									ret := -0.024655
								if( chinkou_span > 44.06 )
									ret := 0.351206
							if( senkou_span_a_displaced > 49.0792 )
								if( chinkou_span <= 48.46 )
									ret := -0.522551
								if( chinkou_span > 48.46 )
									ret := -0.020165
				if( basis_minus > 3.81025 )
					if( kinjun_sen <= 80.9666 )
						if( basis_minus <= 5.55125 )
							if( basis_max <= 0.42575 )
								ret := -0.916667 // sell
							if( basis_max > 0.42575 )
								ret := 0.400000
						if( basis_minus > 5.55125 )
							ret := 0.700000 // buy
					if( kinjun_sen > 80.9666 )
						if( basis_minus <= 4.33222 )
							if( kinjun_sen <= 118.248 )
								if( tenkan_sen <= 111.165 )
									ret := 0.873239 // buy
								if( tenkan_sen > 111.165 )
									ret := 0.541667
							if( kinjun_sen > 118.248 )
								ret := 1.000000 // buy
						if( basis_minus > 4.33222 )
							if( senkou_span_b_displaced <= 86.2473 )
								if( basis_minus <= 4.55966 )
									ret := 0.625000
								if( basis_minus > 4.55966 )
									ret := 0.956522 // buy
							if( senkou_span_b_displaced > 86.2473 )
								if( tenkan_sen <= 100.45 )
									ret := -0.869565 // sell
								if( tenkan_sen > 100.45 )
									ret := 0.550000
	
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
float op_operation = decision_tree_0_AVAXUSDT_30Min_37196b4a(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)

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


