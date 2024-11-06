//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: LYFT_1Min_1ICH_1f0a92b7 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LYFT_1Min_1ICH_1f0a92b7", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LYFT_1Min_1f0a92b7(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( senkou_span_a <= 12.4966 )
		if( kinjun_sen <= 9.22881 )
			if( senkou_span_b_displaced <= 9.21216 )
				if( senkou_span_b_displaced <= 9.18127 )
					if( senkou_span_b <= 9.10709 )
						if( senkou_span_b <= 9.08439 )
							if( chinkou_span <= 9.13051 )
								if( senkou_span_b <= 9.07944 )
									ret := 0.550000
								if( senkou_span_b > 9.07944 )
									ret := 0.155556
							if( chinkou_span > 9.13051 )
								ret := 1.000000 // buy
						if( senkou_span_b > 9.08439 )
							if( tenkan_sen <= 9.1072 )
								if( senkou_span_b_displaced <= 9.09117 )
									ret := 0.020833
								if( senkou_span_b_displaced > 9.09117 )
									ret := 0.545455
							if( tenkan_sen > 9.1072 )
								if( senkou_span_a <= 9.11875 )
									ret := -1.000000 // sell
								if( senkou_span_a > 9.11875 )
									ret := -0.200000
					if( senkou_span_b > 9.10709 )
						if( senkou_span_b <= 9.19241 )
							if( basis_max <= -0.001565 )
								if( chinkou_span <= 9.24033 )
									ret := 0.038462
								if( chinkou_span > 9.24033 )
									ret := 0.640000
							if( basis_max > -0.001565 )
								ret := 0.904762 // buy
						if( senkou_span_b > 9.19241 )
							ret := 1.000000 // buy
				if( senkou_span_b_displaced > 9.18127 )
					ret := -0.700000 // sell
			if( senkou_span_b_displaced > 9.21216 )
				if( senkou_span_b <= 9.15839 )
					ret := 0.000000
				if( senkou_span_b > 9.15839 )
					if( tenkan_sen <= 9.12896 )
						if( kinjun_sen <= 9.14928 )
							ret := 0.800000 // buy
						if( kinjun_sen > 9.14928 )
							if( tenkan_sen <= 9.11248 )
								ret := 1.000000 // buy
							if( tenkan_sen > 9.11248 )
								ret := 0.923077 // buy
					if( tenkan_sen > 9.12896 )
						if( senkou_span_b_displaced <= 9.26913 )
							ret := 1.000000 // buy
						if( senkou_span_b_displaced > 9.26913 )
							if( chinkou_span <= 9.13199 )
								ret := -0.357143
							if( chinkou_span > 9.13199 )
								if( kinjun_sen <= 9.19435 )
									ret := 1.000000 // buy
								if( kinjun_sen > 9.19435 )
									ret := 0.363636
		if( kinjun_sen > 9.22881 )
			if( senkou_span_a_displaced <= 12.4263 )
				if( basis_max <= 0.00534 )
					if( chinkou_span <= 12.5754 )
						if( senkou_span_a <= 12.3717 )
							if( chinkou_span <= 12.2389 )
								if( tenkan_sen <= 12.2292 )
									ret := -0.013415
								if( tenkan_sen > 12.2292 )
									ret := -0.542088
							if( chinkou_span > 12.2389 )
								if( senkou_span_b_displaced <= 12.1971 )
									ret := 0.630952
								if( senkou_span_b_displaced > 12.1971 )
									ret := 0.174492
						if( senkou_span_a > 12.3717 )
							if( chinkou_span <= 12.2949 )
								if( senkou_span_a_displaced <= 12.3644 )
									ret := -0.863636 // sell
								if( senkou_span_a_displaced > 12.3644 )
									ret := -0.519231
							if( chinkou_span > 12.2949 )
								if( senkou_span_b <= 12.3029 )
									ret := -0.846154 // sell
								if( senkou_span_b > 12.3029 )
									ret := -0.089938
					if( chinkou_span > 12.5754 )
						if( basis_minus <= -0.03625 )
							ret := -0.444444
						if( basis_minus > -0.03625 )
							if( senkou_span_b <= 12.2947 )
								ret := 1.000000 // buy
							if( senkou_span_b > 12.2947 )
								if( senkou_span_b_displaced <= 12.3065 )
									ret := -0.450000
								if( senkou_span_b_displaced > 12.3065 )
									ret := 0.801370 // buy
				if( basis_max > 0.00534 )
					if( senkou_span_b <= 9.32538 )
						if( basis_max <= 0.01667 )
							ret := -1.000000 // sell
						if( basis_max > 0.01667 )
							ret := -0.800000 // sell
					if( senkou_span_b > 9.32538 )
						if( senkou_span_a <= 10.9103 )
							if( basis_minus <= 0.026468 )
								if( kinjun_sen <= 9.32736 )
									ret := 0.886792 // buy
								if( kinjun_sen > 9.32736 )
									ret := 0.166201
							if( basis_minus > 0.026468 )
								if( chinkou_span <= 10.4934 )
									ret := 0.453704
								if( chinkou_span > 10.4934 )
									ret := 0.885714 // buy
						if( senkou_span_a > 10.9103 )
							if( kinjun_sen <= 11.1236 )
								if( senkou_span_b_displaced <= 11.24 )
									ret := -0.277286
								if( senkou_span_b_displaced > 11.24 )
									ret := -0.888889 // sell
							if( kinjun_sen > 11.1236 )
								if( chinkou_span <= 12.2402 )
									ret := 0.013514
								if( chinkou_span > 12.2402 )
									ret := 0.403321
			if( senkou_span_a_displaced > 12.4263 )
				if( senkou_span_a_displaced <= 12.6131 )
					if( basis_max <= 0.012746 )
						if( chinkou_span <= 12.4104 )
							if( senkou_span_a <= 12.4521 )
								if( chinkou_span <= 12.2697 )
									ret := -0.857143 // sell
								if( chinkou_span > 12.2697 )
									ret := 0.141304
							if( senkou_span_a > 12.4521 )
								if( basis_minus <= -0.014395 )
									ret := 0.043478
								if( basis_minus > -0.014395 )
									ret := -0.609524
						if( chinkou_span > 12.4104 )
							if( kinjun_sen <= 12.4237 )
								if( senkou_span_b <= 12.4492 )
									ret := 0.566265
								if( senkou_span_b > 12.4492 )
									ret := 0.875000 // buy
							if( kinjun_sen > 12.4237 )
								if( tenkan_sen <= 12.4225 )
									ret := -0.239437
								if( tenkan_sen > 12.4225 )
									ret := 0.271712
					if( basis_max > 0.012746 )
						if( senkou_span_b_displaced <= 12.4501 )
							if( basis_minus <= -0.044837 )
								if( chinkou_span <= 12.2925 )
									ret := -0.848485 // sell
								if( chinkou_span > 12.2925 )
									ret := 0.034483
							if( basis_minus > -0.044837 )
								if( kinjun_sen <= 12.4458 )
									ret := 0.626667
								if( kinjun_sen > 12.4458 )
									ret := -0.214286
						if( senkou_span_b_displaced > 12.4501 )
							if( chinkou_span <= 12.4672 )
								if( senkou_span_a <= 12.4736 )
									ret := 0.352273
								if( senkou_span_a > 12.4736 )
									ret := -0.625000
							if( chinkou_span > 12.4672 )
								if( chinkou_span <= 12.5714 )
									ret := 0.765125 // buy
								if( chinkou_span > 12.5714 )
									ret := 0.000000
				if( senkou_span_a_displaced > 12.6131 )
					if( chinkou_span <= 12.3572 )
						if( senkou_span_a <= 12.3123 )
							if( kinjun_sen <= 12.3124 )
								ret := -1.000000 // sell
							if( kinjun_sen > 12.3124 )
								ret := -0.928571 // sell
						if( senkou_span_a > 12.3123 )
							if( basis_minus <= -0.357183 )
								ret := 0.000000
							if( basis_minus > -0.357183 )
								ret := -1.000000 // sell
					if( chinkou_span > 12.3572 )
						ret := 0.600000
	if( senkou_span_a > 12.4966 )
		if( tenkan_sen <= 17.5579 )
			if( basis_minus <= -0.053702 )
				if( chinkou_span <= 17.3754 )
					if( basis_minus <= -0.332223 )
						if( basis_minus <= -0.415625 )
							if( basis_max <= -0.005 )
								ret := -0.411765
							if( basis_max > -0.005 )
								if( kinjun_sen <= 15.4005 )
									ret := 0.000000
								if( kinjun_sen > 15.4005 )
									ret := 0.142857
						if( basis_minus > -0.415625 )
							if( basis_max <= 0.061622 )
								if( tenkan_sen <= 15.9161 )
									ret := 0.666667
								if( tenkan_sen > 15.9161 )
									ret := 0.846154 // buy
							if( basis_max > 0.061622 )
								ret := 1.000000 // buy
					if( basis_minus > -0.332223 )
						if( senkou_span_b <= 17.5295 )
							if( kinjun_sen <= 17.4203 )
								if( senkou_span_b <= 17.3278 )
									ret := -0.154415
								if( senkou_span_b > 17.3278 )
									ret := -0.542289
							if( kinjun_sen > 17.4203 )
								if( senkou_span_a <= 17.3417 )
									ret := 1.000000 // buy
								if( senkou_span_a > 17.3417 )
									ret := 0.583333
						if( senkou_span_b > 17.5295 )
							if( senkou_span_b_displaced <= 17.0587 )
								ret := -1.000000 // sell
							if( senkou_span_b_displaced > 17.0587 )
								if( senkou_span_a <= 17.5102 )
									ret := -0.911111 // sell
								if( senkou_span_a > 17.5102 )
									ret := 0.750000 // buy
				if( chinkou_span > 17.3754 )
					if( senkou_span_b <= 17.6909 )
						if( senkou_span_a <= 17.3149 )
							if( basis_max <= -0.109417 )
								ret := -0.272727
							if( basis_max > -0.109417 )
								if( chinkou_span <= 17.4005 )
									ret := -0.166667
								if( chinkou_span > 17.4005 )
									ret := 0.827586 // buy
						if( senkou_span_a > 17.3149 )
							if( senkou_span_b_displaced <= 17.6291 )
								if( kinjun_sen <= 17.4075 )
									ret := -0.857143 // sell
								if( kinjun_sen > 17.4075 )
									ret := -0.142857
							if( senkou_span_b_displaced > 17.6291 )
								if( senkou_span_b <= 17.6599 )
									ret := 0.370370
								if( senkou_span_b > 17.6599 )
									ret := 0.945946 // buy
					if( senkou_span_b > 17.6909 )
						if( senkou_span_b_displaced <= 17.9142 )
							ret := -1.000000 // sell
						if( senkou_span_b_displaced > 17.9142 )
							ret := -0.333333
			if( basis_minus > -0.053702 )
				if( basis_max <= 0.001887 )
					if( senkou_span_a <= 12.5086 )
						if( senkou_span_b_displaced <= 12.3869 )
							ret := 0.800000 // buy
						if( senkou_span_b_displaced > 12.3869 )
							if( basis_minus <= 0.009066 )
								if( basis_minus <= -0.004384 )
									ret := -0.472973
								if( basis_minus > -0.004384 )
									ret := 0.406250
							if( basis_minus > 0.009066 )
								if( kinjun_sen <= 12.5001 )
									ret := -0.697248
								if( kinjun_sen > 12.5001 )
									ret := -0.900000 // sell
					if( senkou_span_a > 12.5086 )
						if( senkou_span_b_displaced <= 17.3294 )
							if( senkou_span_a_displaced <= 17.2738 )
								if( chinkou_span <= 12.5247 )
									ret := -0.459736
								if( chinkou_span > 12.5247 )
									ret := -0.014178
							if( senkou_span_a_displaced > 17.2738 )
								if( senkou_span_b <= 17.2905 )
									ret := -0.183099
								if( senkou_span_b > 17.2905 )
									ret := -0.552764
						if( senkou_span_b_displaced > 17.3294 )
							if( basis_minus <= -0.017057 )
								if( chinkou_span <= 17.3625 )
									ret := -0.828283 // sell
								if( chinkou_span > 17.3625 )
									ret := 0.272059
							if( basis_minus > -0.017057 )
								if( senkou_span_b <= 17.3476 )
									ret := 0.756345 // buy
								if( senkou_span_b > 17.3476 )
									ret := 0.133178
				if( basis_max > 0.001887 )
					if( chinkou_span <= 17.4398 )
						if( senkou_span_a <= 16.1582 )
							if( senkou_span_b <= 16.0941 )
								if( basis_minus <= 0.02673 )
									ret := 0.074042
								if( basis_minus > 0.02673 )
									ret := -0.163176
							if( senkou_span_b > 16.0941 )
								if( chinkou_span <= 15.8925 )
									ret := -1.000000 // sell
								if( chinkou_span > 15.8925 )
									ret := 0.491166
						if( senkou_span_a > 16.1582 )
							if( senkou_span_b_displaced <= 16.1695 )
								if( senkou_span_b_displaced <= 16.0775 )
									ret := 0.714286 // buy
								if( senkou_span_b_displaced > 16.0775 )
									ret := -0.645022
							if( senkou_span_b_displaced > 16.1695 )
								if( basis_minus <= -0.002786 )
									ret := -0.149674
								if( basis_minus > -0.002786 )
									ret := 0.107981
					if( chinkou_span > 17.4398 )
						if( senkou_span_b <= 17.3927 )
							if( senkou_span_b_displaced <= 17.3976 )
								if( chinkou_span <= 17.4925 )
									ret := 0.666667
								if( chinkou_span > 17.4925 )
									ret := 1.000000 // buy
							if( senkou_span_b_displaced > 17.3976 )
								if( tenkan_sen <= 17.3675 )
									ret := 0.541667
								if( tenkan_sen > 17.3675 )
									ret := 1.000000 // buy
						if( senkou_span_b > 17.3927 )
							if( kinjun_sen <= 17.5712 )
								if( kinjun_sen <= 17.5631 )
									ret := 0.406926
								if( kinjun_sen > 17.5631 )
									ret := 0.850000 // buy
							if( kinjun_sen > 17.5712 )
								if( senkou_span_a <= 17.5635 )
									ret := -0.250000
								if( senkou_span_a > 17.5635 )
									ret := 0.133333
		if( tenkan_sen > 17.5579 )
			if( tenkan_sen <= 17.7245 )
				if( senkou_span_a <= 17.6143 )
					if( senkou_span_b_displaced <= 17.4304 )
						if( kinjun_sen <= 17.5219 )
							if( basis_max <= -0.054375 )
								ret := -0.250000
							if( basis_max > -0.054375 )
								ret := -0.904762 // sell
						if( kinjun_sen > 17.5219 )
							if( chinkou_span <= 17.5804 )
								if( basis_minus <= 0.036402 )
									ret := 0.800000 // buy
								if( basis_minus > 0.036402 )
									ret := -0.121212
							if( chinkou_span > 17.5804 )
								if( tenkan_sen <= 17.5938 )
									ret := 0.800000 // buy
								if( tenkan_sen > 17.5938 )
									ret := 1.000000 // buy
					if( senkou_span_b_displaced > 17.4304 )
						if( basis_minus <= 0.010971 )
							if( basis_minus <= 0.003588 )
								if( senkou_span_b <= 17.6186 )
									ret := -0.468085
								if( senkou_span_b > 17.6186 )
									ret := 0.153846
							if( basis_minus > 0.003588 )
								if( chinkou_span <= 17.5526 )
									ret := -0.277778
								if( chinkou_span > 17.5526 )
									ret := 0.750000 // buy
						if( basis_minus > 0.010971 )
							if( senkou_span_a <= 17.5785 )
								if( senkou_span_a <= 17.575 )
									ret := -0.571429
								if( senkou_span_a > 17.575 )
									ret := 0.230769
							if( senkou_span_a > 17.5785 )
								if( basis_max <= -0.049948 )
									ret := -0.615385
								if( basis_max > -0.049948 )
									ret := -0.962963 // sell
				if( senkou_span_a > 17.6143 )
					if( senkou_span_a <= 17.7131 )
						if( senkou_span_b_displaced <= 17.5474 )
							if( senkou_span_b <= 17.5629 )
								ret := -0.181818
							if( senkou_span_b > 17.5629 )
								if( senkou_span_b_displaced <= 17.5248 )
									ret := -0.810811 // sell
								if( senkou_span_b_displaced > 17.5248 )
									ret := -0.250000
						if( senkou_span_b_displaced > 17.5474 )
							if( senkou_span_a <= 17.624 )
								ret := -0.611111
							if( senkou_span_a > 17.624 )
								if( kinjun_sen <= 17.619 )
									ret := -0.909091 // sell
								if( kinjun_sen > 17.619 )
									ret := -1.000000 // sell
					if( senkou_span_a > 17.7131 )
						ret := 0.133333
			if( tenkan_sen > 17.7245 )
				if( senkou_span_b <= 17.9448 )
					if( chinkou_span <= 17.2525 )
						if( senkou_span_a_displaced <= 17.7669 )
							if( basis_max <= -0.005465 )
								ret := -0.952381 // sell
							if( basis_max > -0.005465 )
								ret := -0.727273 // sell
						if( senkou_span_a_displaced > 17.7669 )
							ret := -0.642857
					if( chinkou_span > 17.2525 )
						if( senkou_span_a <= 18.077 )
							if( basis_minus <= 0.234899 )
								if( senkou_span_b_displaced <= 17.7567 )
									ret := -0.044586
								if( senkou_span_b_displaced > 17.7567 )
									ret := 0.330508
							if( basis_minus > 0.234899 )
								ret := -1.000000 // sell
						if( senkou_span_a > 18.077 )
							ret := 1.000000 // buy
				if( senkou_span_b > 17.9448 )
					if( senkou_span_a <= 17.8681 )
						ret := 0.833333 // buy
					if( senkou_span_a > 17.8681 )
						if( senkou_span_b_displaced <= 17.829 )
							if( basis_max <= 0.035 )
								ret := 0.588235
							if( basis_max > 0.035 )
								ret := -0.363636
						if( senkou_span_b_displaced > 17.829 )
							if( basis_minus <= 0.048863 )
								if( basis_minus <= 0.030648 )
									ret := -1.000000 // sell
								if( basis_minus > 0.030648 )
									ret := -0.888889 // sell
							if( basis_minus > 0.048863 )
								if( senkou_span_a <= 18.0672 )
									ret := 0.100000
								if( senkou_span_a > 18.0672 )
									ret := -0.954545 // sell
	
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
float op_operation = decision_tree_0_LYFT_1Min_1f0a92b7(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)

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


