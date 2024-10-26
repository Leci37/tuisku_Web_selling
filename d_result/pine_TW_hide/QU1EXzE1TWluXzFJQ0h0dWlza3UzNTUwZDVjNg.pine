//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: AMD_15Min_1ICH_3550d5c6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMD_15Min_1ICH_3550d5c6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMD_15Min_3550d5c6(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( senkou_span_b_displaced <= 80.772 )
		if( chinkou_span <= 79.1021 )
			if( tenkan_sen <= 77.7275 )
				if( chinkou_span <= 76.6017 )
					if( senkou_span_b <= 74.4821 )
						if( chinkou_span <= 74.588 )
							if( kinjun_sen <= 9.94326 )
								if( chinkou_span <= 9.76753 )
									ret := 0.011204
								if( chinkou_span > 9.76753 )
									ret := 0.399204
							if( kinjun_sen > 9.94326 )
								if( senkou_span_a_displaced <= 63.4423 )
									ret := 0.063439
								if( senkou_span_a_displaced > 63.4423 )
									ret := -0.026509
						if( chinkou_span > 74.588 )
							if( tenkan_sen <= 73.6225 )
								if( basis_max <= -0.4375 )
									ret := -0.350000
								if( basis_max > -0.4375 )
									ret := 0.791045 // buy
							if( tenkan_sen > 73.6225 )
								if( kinjun_sen <= 76.0075 )
									ret := 0.351032
								if( kinjun_sen > 76.0075 )
									ret := -0.631579
					if( senkou_span_b > 74.4821 )
						if( chinkou_span <= 75.27 )
							if( basis_max <= 0.337312 )
								if( kinjun_sen <= 74.5393 )
									ret := -0.055215
								if( kinjun_sen > 74.5393 )
									ret := -0.516588
							if( basis_max > 0.337312 )
								if( senkou_span_a_displaced <= 76.0887 )
									ret := -0.035714
								if( senkou_span_a_displaced > 76.0887 )
									ret := 0.254717
						if( chinkou_span > 75.27 )
							if( senkou_span_b <= 76.9326 )
								if( basis_minus <= 0.202152 )
									ret := 0.298137
								if( basis_minus > 0.202152 )
									ret := -0.124514
							if( senkou_span_b > 76.9326 )
								if( tenkan_sen <= 76.1393 )
									ret := -0.959184 // sell
								if( tenkan_sen > 76.1393 )
									ret := -0.241259
				if( chinkou_span > 76.6017 )
					if( tenkan_sen <= 75.9012 )
						if( basis_max <= 0.21375 )
							if( senkou_span_a_displaced <= 76.0741 )
								if( basis_minus <= -0.853039 )
									ret := -0.727273 // sell
								if( basis_minus > -0.853039 )
									ret := 0.470046
							if( senkou_span_a_displaced > 76.0741 )
								if( senkou_span_b <= 76.1172 )
									ret := 0.933333 // buy
								if( senkou_span_b > 76.1172 )
									ret := 0.375000
						if( basis_max > 0.21375 )
							if( basis_max <= 0.403953 )
								if( basis_minus <= -0.0225 )
									ret := 0.935484 // buy
								if( basis_minus > -0.0225 )
									ret := 0.666667
							if( basis_max > 0.403953 )
								if( kinjun_sen <= 76.0925 )
									ret := -0.111111
								if( kinjun_sen > 76.0925 )
									ret := 1.000000 // buy
					if( tenkan_sen > 75.9012 )
						if( chinkou_span <= 77.83 )
							if( basis_max <= -0.056106 )
								if( tenkan_sen <= 77.0395 )
									ret := -0.361538
								if( tenkan_sen > 77.0395 )
									ret := 0.000000
							if( basis_max > -0.056106 )
								if( senkou_span_b_displaced <= 78.9163 )
									ret := 0.144420
								if( senkou_span_b_displaced > 78.9163 )
									ret := 0.608108
						if( chinkou_span > 77.83 )
							if( tenkan_sen <= 76.3255 )
								if( senkou_span_a_displaced <= 74.0241 )
									ret := -1.000000 // sell
								if( senkou_span_a_displaced > 74.0241 )
									ret := 0.000000
							if( tenkan_sen > 76.3255 )
								if( tenkan_sen <= 77.5443 )
									ret := 0.524324
								if( tenkan_sen > 77.5443 )
									ret := 0.095745
			if( tenkan_sen > 77.7275 )
				if( chinkou_span <= 77.4948 )
					if( senkou_span_a_displaced <= 76.5813 )
						if( basis_minus <= 1.5636 )
							ret := -0.500000
						if( basis_minus > 1.5636 )
							if( senkou_span_b_displaced <= 75.2965 )
								ret := 0.125000
							if( senkou_span_b_displaced > 75.2965 )
								ret := 0.600000
					if( senkou_span_a_displaced > 76.5813 )
						if( tenkan_sen <= 77.9478 )
							if( chinkou_span <= 76.8892 )
								if( chinkou_span <= 75.975 )
									ret := -0.937500 // sell
								if( chinkou_span > 75.975 )
									ret := -0.511628
							if( chinkou_span > 76.8892 )
								if( tenkan_sen <= 77.8722 )
									ret := -0.238095
								if( tenkan_sen > 77.8722 )
									ret := 0.533333
						if( tenkan_sen > 77.9478 )
							if( senkou_span_a_displaced <= 76.7194 )
								ret := -1.000000 // sell
							if( senkou_span_a_displaced > 76.7194 )
								if( senkou_span_a_displaced <= 78.8294 )
									ret := -0.484472
								if( senkou_span_a_displaced > 78.8294 )
									ret := -0.730159 // sell
				if( chinkou_span > 77.4948 )
					if( tenkan_sen <= 79.0106 )
						if( kinjun_sen <= 77.8298 )
							if( senkou_span_a_displaced <= 75.9062 )
								if( senkou_span_b_displaced <= 75.76 )
									ret := -0.333333
								if( senkou_span_b_displaced > 75.76 )
									ret := 0.541667
							if( senkou_span_a_displaced > 75.9062 )
								if( kinjun_sen <= 77.817 )
									ret := -0.313433
								if( kinjun_sen > 77.817 )
									ret := -1.000000 // sell
						if( kinjun_sen > 77.8298 )
							if( chinkou_span <= 78.1286 )
								if( senkou_span_a_displaced <= 79.3047 )
									ret := -0.057143
								if( senkou_span_a_displaced > 79.3047 )
									ret := -0.584906
							if( chinkou_span > 78.1286 )
								if( tenkan_sen <= 78.6456 )
									ret := 0.407583
								if( tenkan_sen > 78.6456 )
									ret := 0.043103
					if( tenkan_sen > 79.0106 )
						if( senkou_span_b_displaced <= 78.7586 )
							if( senkou_span_b_displaced <= 78.13 )
								if( chinkou_span <= 77.6523 )
									ret := 0.600000
								if( chinkou_span > 77.6523 )
									ret := -0.515464
							if( senkou_span_b_displaced > 78.13 )
								if( basis_max <= -0.159297 )
									ret := 0.387097
								if( basis_max > -0.159297 )
									ret := -0.300000
						if( senkou_span_b_displaced > 78.7586 )
							if( basis_max <= -0.3375 )
								if( senkou_span_b <= 80.3693 )
									ret := -1.000000 // sell
								if( senkou_span_b > 80.3693 )
									ret := -0.500000
							if( basis_max > -0.3375 )
								if( senkou_span_b_displaced <= 80.2188 )
									ret := -0.428571
								if( senkou_span_b_displaced > 80.2188 )
									ret := -0.785714 // sell
		if( chinkou_span > 79.1021 )
			if( tenkan_sen <= 81.4325 )
				if( tenkan_sen <= 78.5689 )
					if( basis_max <= -0.420714 )
						if( basis_minus <= 1.63396 )
							if( senkou_span_b_displaced <= 75.5329 )
								ret := 0.500000
							if( senkou_span_b_displaced > 75.5329 )
								if( senkou_span_a_displaced <= 75.8467 )
									ret := 0.066667
								if( senkou_span_a_displaced > 75.8467 )
									ret := -0.500000
						if( basis_minus > 1.63396 )
							ret := -0.750000 // sell
					if( basis_max > -0.420714 )
						if( basis_minus <= -0.753975 )
							if( basis_max <= -0.1775 )
								ret := 0.000000
							if( basis_max > -0.1775 )
								if( chinkou_span <= 79.2972 )
									ret := 0.500000
								if( chinkou_span > 79.2972 )
									ret := 0.956522 // buy
						if( basis_minus > -0.753975 )
							if( senkou_span_b_displaced <= 78.9305 )
								if( basis_max <= -0.071685 )
									ret := 0.464706
								if( basis_max > -0.071685 )
									ret := 0.733333 // buy
							if( senkou_span_b_displaced > 78.9305 )
								if( senkou_span_a <= 77.5371 )
									ret := -1.000000 // sell
								if( senkou_span_a > 77.5371 )
									ret := 0.333333
				if( tenkan_sen > 78.5689 )
					if( basis_minus <= 1.63922 )
						if( chinkou_span <= 81.2267 )
							if( kinjun_sen <= 80.9057 )
								if( senkou_span_a <= 80.9187 )
									ret := 0.119469
								if( senkou_span_a > 80.9187 )
									ret := 0.818182 // buy
							if( kinjun_sen > 80.9057 )
								if( tenkan_sen <= 80.8701 )
									ret := -0.941176 // sell
								if( tenkan_sen > 80.8701 )
									ret := 0.000000
						if( chinkou_span > 81.2267 )
							if( senkou_span_a_displaced <= 77.8812 )
								if( senkou_span_b <= 77.9569 )
									ret := 0.250000
								if( senkou_span_b > 77.9569 )
									ret := 0.865854 // buy
							if( senkou_span_a_displaced > 77.8812 )
								if( chinkou_span <= 82.7615 )
									ret := 0.423913
								if( chinkou_span > 82.7615 )
									ret := 0.724138 // buy
					if( basis_minus > 1.63922 )
						if( tenkan_sen <= 80.6575 )
							if( kinjun_sen <= 78.7396 )
								ret := 0.000000
							if( kinjun_sen > 78.7396 )
								if( basis_max <= -0.075323 )
									ret := -0.964286 // sell
								if( basis_max > -0.075323 )
									ret := -0.400000
						if( tenkan_sen > 80.6575 )
							if( basis_max <= -0.487638 )
								ret := 0.666667
							if( basis_max > -0.487638 )
								ret := 0.200000
			if( tenkan_sen > 81.4325 )
				if( senkou_span_a_displaced <= 82.92 )
					if( senkou_span_b <= 82.0098 )
						if( basis_max <= -0.951887 )
							if( chinkou_span <= 82.8628 )
								ret := -0.400000
							if( chinkou_span > 82.8628 )
								if( kinjun_sen <= 81.742 )
									ret := 0.500000
								if( kinjun_sen > 81.742 )
									ret := 0.916667 // buy
						if( basis_max > -0.951887 )
							if( basis_max <= -0.019859 )
								if( chinkou_span <= 80.9551 )
									ret := -0.392857
								if( chinkou_span > 80.9551 )
									ret := -0.026764
							if( basis_max > -0.019859 )
								if( basis_minus <= 0.473563 )
									ret := -0.365854
								if( basis_minus > 0.473563 )
									ret := 0.500000
					if( senkou_span_b > 82.0098 )
						if( basis_minus <= 1.14251 )
							if( senkou_span_a_displaced <= 82.4588 )
								if( chinkou_span <= 83.0778 )
									ret := -0.880952 // sell
								if( chinkou_span > 83.0778 )
									ret := -0.250000
							if( senkou_span_a_displaced > 82.4588 )
								if( chinkou_span <= 81.865 )
									ret := 0.000000
								if( chinkou_span > 81.865 )
									ret := -0.500000
						if( basis_minus > 1.14251 )
							if( chinkou_span <= 82.48 )
								ret := 0.500000
							if( chinkou_span > 82.48 )
								ret := 0.000000
				if( senkou_span_a_displaced > 82.92 )
					if( basis_max <= -0.127441 )
						ret := 0.400000
					if( basis_max > -0.127441 )
						if( basis_minus <= 1.15692 )
							ret := 1.000000 // buy
						if( basis_minus > 1.15692 )
							ret := 0.750000 // buy
	if( senkou_span_b_displaced > 80.772 )
		if( tenkan_sen <= 216.025 )
			if( basis_minus <= -3.00578 )
				if( basis_max <= 0.167037 )
					if( tenkan_sen <= 202.461 )
						if( basis_minus <= -4.90621 )
							if( senkou_span_a_displaced <= 126.442 )
								if( senkou_span_a_displaced <= 114.025 )
									ret := 0.285714
								if( senkou_span_a_displaced > 114.025 )
									ret := 1.000000 // buy
							if( senkou_span_a_displaced > 126.442 )
								if( kinjun_sen <= 134.881 )
									ret := -1.000000 // sell
								if( kinjun_sen > 134.881 )
									ret := 0.433333
						if( basis_minus > -4.90621 )
							if( kinjun_sen <= 150.488 )
								if( senkou_span_a <= 132.429 )
									ret := 0.019737
								if( senkou_span_a > 132.429 )
									ret := -0.496689
							if( kinjun_sen > 150.488 )
								if( basis_minus <= -3.858 )
									ret := 0.478261
								if( basis_minus > -3.858 )
									ret := 0.030000
					if( tenkan_sen > 202.461 )
						if( chinkou_span <= 200.04 )
							ret := -1.000000 // sell
						if( chinkou_span > 200.04 )
							ret := -0.250000
				if( basis_max > 0.167037 )
					if( chinkou_span <= 204.763 )
						if( basis_max <= 2.31135 )
							if( senkou_span_b_displaced <= 113.684 )
								if( senkou_span_a_displaced <= 109.952 )
									ret := 0.271523
								if( senkou_span_a_displaced > 109.952 )
									ret := 0.842105 // buy
							if( senkou_span_b_displaced > 113.684 )
								if( senkou_span_b <= 113.807 )
									ret := -0.714286 // sell
								if( senkou_span_b > 113.807 )
									ret := 0.271044
						if( basis_max > 2.31135 )
							if( senkou_span_a <= 164.245 )
								if( chinkou_span <= 143.625 )
									ret := 0.657143
								if( chinkou_span > 143.625 )
									ret := 0.974359 // buy
							if( senkou_span_a > 164.245 )
								if( basis_minus <= -3.26237 )
									ret := 0.416667
								if( basis_minus > -3.26237 )
									ret := -1.000000 // sell
					if( chinkou_span > 204.763 )
						if( senkou_span_a <= 212.464 )
							if( chinkou_span <= 208.455 )
								if( senkou_span_b_displaced <= 210.649 )
									ret := -0.750000 // sell
								if( senkou_span_b_displaced > 210.649 )
									ret := -0.750000 // sell
							if( chinkou_span > 208.455 )
								ret := -1.000000 // sell
						if( senkou_span_a > 212.464 )
							ret := 0.000000
			if( basis_minus > -3.00578 )
				if( chinkou_span <= 84.194 )
					if( senkou_span_a <= 83.6901 )
						if( basis_max <= 0.475606 )
							if( chinkou_span <= 79.7275 )
								if( senkou_span_a <= 80.248 )
									ret := -0.152273
								if( senkou_span_a > 80.248 )
									ret := -0.531532
							if( chinkou_span > 79.7275 )
								if( kinjun_sen <= 81.66 )
									ret := 0.186888
								if( kinjun_sen > 81.66 )
									ret := -0.082067
						if( basis_max > 0.475606 )
							if( senkou_span_b <= 81.7955 )
								if( chinkou_span <= 80.6357 )
									ret := -0.206667
								if( chinkou_span > 80.6357 )
									ret := 0.631579
							if( senkou_span_b > 81.7955 )
								if( senkou_span_b <= 82.6113 )
									ret := 0.804598 // buy
								if( senkou_span_b > 82.6113 )
									ret := 0.181818
					if( senkou_span_a > 83.6901 )
						if( basis_max <= 0.385622 )
							if( basis_minus <= 1.724 )
								if( senkou_span_a_displaced <= 82.6058 )
									ret := 0.222222
								if( senkou_span_a_displaced > 82.6058 )
									ret := -0.494176
							if( basis_minus > 1.724 )
								if( chinkou_span <= 83.6342 )
									ret := 0.714286 // buy
								if( chinkou_span > 83.6342 )
									ret := 1.000000 // buy
						if( basis_max > 0.385622 )
							if( senkou_span_a_displaced <= 89.405 )
								if( tenkan_sen <= 83.1659 )
									ret := -0.689655
								if( tenkan_sen > 83.1659 )
									ret := 0.220859
							if( senkou_span_a_displaced > 89.405 )
								if( senkou_span_a_displaced <= 90.1243 )
									ret := -0.500000
								if( senkou_span_a_displaced > 90.1243 )
									ret := -1.000000 // sell
				if( chinkou_span > 84.194 )
					if( senkou_span_a <= 85.1698 )
						if( kinjun_sen <= 83.2438 )
							if( cross_up_tenkan_kinjunInt <= 0.5 )
								if( senkou_span_b <= 82.0477 )
									ret := 0.367816
								if( senkou_span_b > 82.0477 )
									ret := 0.706122 // buy
							if( cross_up_tenkan_kinjunInt > 0.5 )
								if( basis_minus <= 0.023 )
									ret := 0.142857
								if( basis_minus > 0.023 )
									ret := -0.750000 // sell
						if( kinjun_sen > 83.2438 )
							if( senkou_span_a <= 84.1287 )
								if( chinkou_span <= 86.4781 )
									ret := -0.097973
								if( chinkou_span > 86.4781 )
									ret := 0.750000 // buy
							if( senkou_span_a > 84.1287 )
								if( basis_minus <= -0.14875 )
									ret := 0.626437
								if( basis_minus > -0.14875 )
									ret := 0.277863
					if( senkou_span_a > 85.1698 )
						if( chinkou_span <= 88.4186 )
							if( senkou_span_a <= 86.6825 )
								if( chinkou_span <= 86.5112 )
									ret := -0.107865
								if( chinkou_span > 86.5112 )
									ret := 0.302508
							if( senkou_span_a > 86.6825 )
								if( senkou_span_a <= 88.5413 )
									ret := -0.174401
								if( senkou_span_a > 88.5413 )
									ret := -0.477379
						if( chinkou_span > 88.4186 )
							if( tenkan_sen <= 89.6075 )
								if( chinkou_span <= 90.5009 )
									ret := 0.299710
								if( chinkou_span > 90.5009 )
									ret := 0.661836
							if( tenkan_sen > 89.6075 )
								if( chinkou_span <= 92.2558 )
									ret := -0.206063
								if( chinkou_span > 92.2558 )
									ret := 0.038153
		if( tenkan_sen > 216.025 )
			ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_AMD_15Min_3550d5c6(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)

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


