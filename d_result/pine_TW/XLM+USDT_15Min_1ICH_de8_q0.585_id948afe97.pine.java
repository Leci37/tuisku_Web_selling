//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: XLMUSDT_15Min_1ICH_948afe97 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XLMUSDT_15Min_1ICH_948afe97", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XLMUSDT_15Min_948afe97(basis_minus, senkou_span_b, cross_dn_tenkan_kinjunInt, cross_up_tenkan_kinjunInt, kinjun_sen, tenkan_sen, senkou_span_b_displaced, senkou_span_a, senkou_span_a_displaced, basis_max, chinkou_span)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( senkou_span_a <= 0.147399 )
		if( chinkou_span <= 0.146333 )
			if( chinkou_span <= 0.130922 )
				if( kinjun_sen <= 0.129999 )
					if( chinkou_span <= 0.123085 )
						if( kinjun_sen <= 0.122217 )
							if( chinkou_span <= 0.116329 )
								if( tenkan_sen <= 0.1153 )
									ret := 0.050566
								if( tenkan_sen > 0.1153 )
									ret := -0.318056
							if( chinkou_span > 0.116329 )
								if( kinjun_sen <= 0.11805 )
									ret := 0.344910
								if( kinjun_sen > 0.11805 )
									ret := 0.036109
						if( kinjun_sen > 0.122217 )
							if( senkou_span_a <= 0.125623 )
								if( basis_minus <= -0.001724 )
									ret := 0.056818
								if( basis_minus > -0.001724 )
									ret := -0.310157
							if( senkou_span_a > 0.125623 )
								if( kinjun_sen <= 0.1283 )
									ret := -0.792899 // sell
								if( kinjun_sen > 0.1283 )
									ret := -0.463768
					if( chinkou_span > 0.123085 )
						if( senkou_span_a <= 0.124099 )
							if( basis_minus <= 0.000125 )
								if( basis_max <= 0.000102 )
									ret := 0.374795
								if( basis_max > 0.000102 )
									ret := 0.608624
							if( basis_minus > 0.000125 )
								if( tenkan_sen <= 0.122396 )
									ret := 0.581633
								if( tenkan_sen > 0.122396 )
									ret := 0.180288
						if( senkou_span_a > 0.124099 )
							if( basis_max <= 0.000602 )
								if( chinkou_span <= 0.125795 )
									ret := -0.169365
								if( chinkou_span > 0.125795 )
									ret := 0.165308
							if( basis_max > 0.000602 )
								if( basis_minus <= -0.002421 )
									ret := 0.000000
								if( basis_minus > -0.002421 )
									ret := 0.458333
				if( kinjun_sen > 0.129999 )
					if( tenkan_sen <= 0.132877 )
						if( chinkou_span <= 0.128175 )
							if( senkou_span_b_displaced <= 0.138481 )
								if( senkou_span_a <= 0.132886 )
									ret := -0.658307
								if( senkou_span_a > 0.132886 )
									ret := 0.857143 // buy
							if( senkou_span_b_displaced > 0.138481 )
								if( basis_max <= 0.00135 )
									ret := 0.833333 // buy
								if( basis_max > 0.00135 )
									ret := -0.428571
						if( chinkou_span > 0.128175 )
							if( tenkan_sen <= 0.130873 )
								if( senkou_span_a_displaced <= 0.132847 )
									ret := -0.121849
								if( senkou_span_a_displaced > 0.132847 )
									ret := 0.267176
							if( tenkan_sen > 0.130873 )
								if( tenkan_sen <= 0.13254 )
									ret := -0.356948
								if( tenkan_sen > 0.13254 )
									ret := 0.176471
					if( tenkan_sen > 0.132877 )
						if( basis_minus <= -0.0008 )
							if( senkou_span_a <= 0.136392 )
								if( chinkou_span <= 0.129186 )
									ret := -0.931818 // sell
								if( chinkou_span > 0.129186 )
									ret := -0.457143
							if( senkou_span_a > 0.136392 )
								if( kinjun_sen <= 0.138033 )
									ret := 0.791667 // buy
								if( kinjun_sen > 0.138033 )
									ret := -0.774194 // sell
						if( basis_minus > -0.0008 )
							if( chinkou_span <= 0.130765 )
								if( senkou_span_a <= 0.132472 )
									ret := 0.000000
								if( senkou_span_a > 0.132472 )
									ret := -0.802013 // sell
							if( chinkou_span > 0.130765 )
								if( basis_max <= -0.0003 )
									ret := -1.000000 // sell
								if( basis_max > -0.0003 )
									ret := 0.222222
			if( chinkou_span > 0.130922 )
				if( tenkan_sen <= 0.133697 )
					if( tenkan_sen <= 0.131341 )
						if( senkou_span_b_displaced <= 0.131137 )
							if( senkou_span_a_displaced <= 0.118575 )
								if( tenkan_sen <= 0.122956 )
									ret := 0.555556
								if( tenkan_sen > 0.122956 )
									ret := -0.777778 // sell
							if( senkou_span_a_displaced > 0.118575 )
								if( kinjun_sen <= 0.128275 )
									ret := 0.797895 // buy
								if( kinjun_sen > 0.128275 )
									ret := 0.568149
						if( senkou_span_b_displaced > 0.131137 )
							if( basis_minus <= 0.001047 )
								if( kinjun_sen <= 0.130122 )
									ret := 0.087912
								if( kinjun_sen > 0.130122 )
									ret := 0.549296
							if( basis_minus > 0.001047 )
								if( senkou_span_b_displaced <= 0.131523 )
									ret := -0.750000 // sell
								if( senkou_span_b_displaced > 0.131523 )
									ret := -1.000000 // sell
					if( tenkan_sen > 0.131341 )
						if( chinkou_span <= 0.132505 )
							if( senkou_span_b <= 0.129828 )
								if( kinjun_sen <= 0.131244 )
									ret := -0.782609 // sell
								if( kinjun_sen > 0.131244 )
									ret := 0.437500
							if( senkou_span_b > 0.129828 )
								if( senkou_span_a_displaced <= 0.128022 )
									ret := 0.956522 // buy
								if( senkou_span_a_displaced > 0.128022 )
									ret := 0.043605
						if( chinkou_span > 0.132505 )
							if( basis_minus <= 0.001777 )
								if( kinjun_sen <= 0.130119 )
									ret := -0.875000 // sell
								if( kinjun_sen > 0.130119 )
									ret := 0.355164
							if( basis_minus > 0.001777 )
								if( tenkan_sen <= 0.132151 )
									ret := 0.411765
								if( tenkan_sen > 0.132151 )
									ret := 0.890909 // buy
				if( tenkan_sen > 0.133697 )
					if( chinkou_span <= 0.137952 )
						if( basis_max <= -0.000306 )
							if( senkou_span_b_displaced <= 0.133977 )
								if( basis_minus <= 0.001983 )
									ret := -0.510638
								if( basis_minus > 0.001983 )
									ret := -0.763514 // sell
							if( senkou_span_b_displaced > 0.133977 )
								if( senkou_span_b <= 0.138409 )
									ret := 0.054545
								if( senkou_span_b > 0.138409 )
									ret := -0.642105
						if( basis_max > -0.000306 )
							if( senkou_span_a <= 0.138063 )
								if( tenkan_sen <= 0.136697 )
									ret := 0.110259
								if( tenkan_sen > 0.136697 )
									ret := -0.226667
							if( senkou_span_a > 0.138063 )
								if( basis_max <= 0.000204 )
									ret := -0.498316
								if( basis_max > 0.000204 )
									ret := -0.065306
					if( chinkou_span > 0.137952 )
						if( tenkan_sen <= 0.139631 )
							if( chinkou_span <= 0.140007 )
								if( tenkan_sen <= 0.137 )
									ret := 0.549801
								if( tenkan_sen > 0.137 )
									ret := 0.133333
							if( chinkou_span > 0.140007 )
								if( senkou_span_a <= 0.140059 )
									ret := 0.551429
								if( senkou_span_a > 0.140059 )
									ret := -0.666667
						if( tenkan_sen > 0.139631 )
							if( chinkou_span <= 0.142442 )
								if( kinjun_sen <= 0.141416 )
									ret := 0.040000
								if( kinjun_sen > 0.141416 )
									ret := -0.308345
							if( chinkou_span > 0.142442 )
								if( senkou_span_a <= 0.143436 )
									ret := 0.436073
								if( senkou_span_a > 0.143436 )
									ret := -0.064050
		if( chinkou_span > 0.146333 )
			if( kinjun_sen <= 0.142676 )
				if( senkou_span_b_displaced <= 0.138986 )
					if( basis_max <= 0.000437 )
						if( senkou_span_a_displaced <= 0.09605 )
							ret := 0.000000
						if( senkou_span_a_displaced > 0.09605 )
							if( chinkou_span <= 0.162089 )
								if( senkou_span_b <= 0.140175 )
									ret := 0.956522 // buy
								if( senkou_span_b > 0.140175 )
									ret := 0.810811 // buy
							if( chinkou_span > 0.162089 )
								ret := 0.500000
					if( basis_max > 0.000437 )
						ret := 0.000000
				if( senkou_span_b_displaced > 0.138986 )
					if( senkou_span_a_displaced <= 0.138886 )
						if( chinkou_span <= 0.1484 )
							ret := -0.714286 // sell
						if( chinkou_span > 0.1484 )
							if( senkou_span_b <= 0.14076 )
								if( basis_max <= -0.000902 )
									ret := 1.000000 // buy
								if( basis_max > -0.000902 )
									ret := 0.750000 // buy
							if( senkou_span_b > 0.14076 )
								ret := 0.250000
					if( senkou_span_a_displaced > 0.138886 )
						if( chinkou_span <= 0.156 )
							if( senkou_span_b_displaced <= 0.1437 )
								if( senkou_span_b <= 0.142566 )
									ret := 1.000000 // buy
								if( senkou_span_b > 0.142566 )
									ret := 0.750000 // buy
							if( senkou_span_b_displaced > 0.1437 )
								if( senkou_span_b <= 0.142822 )
									ret := 0.000000
								if( senkou_span_b > 0.142822 )
									ret := 0.909091 // buy
						if( chinkou_span > 0.156 )
							ret := -0.250000
			if( kinjun_sen > 0.142676 )
				if( basis_minus <= 0.003987 )
					if( senkou_span_a_displaced <= 0.148963 )
						if( senkou_span_a_displaced <= 0.145806 )
							if( basis_minus <= 6.9e-05 )
								if( basis_max <= 0.000592 )
									ret := -0.552632
								if( basis_max > 0.000592 )
									ret := 0.666667
							if( basis_minus > 6.9e-05 )
								if( basis_max <= -0.000834 )
									ret := -0.045455
								if( basis_max > -0.000834 )
									ret := 0.715686 // buy
						if( senkou_span_a_displaced > 0.145806 )
							if( basis_minus <= -0.002623 )
								if( basis_minus <= -0.00357 )
									ret := 0.812500 // buy
								if( basis_minus > -0.00357 )
									ret := -0.363636
							if( basis_minus > -0.002623 )
								if( chinkou_span <= 0.147525 )
									ret := 0.590909
								if( chinkou_span > 0.147525 )
									ret := 0.861314 // buy
					if( senkou_span_a_displaced > 0.148963 )
						if( kinjun_sen <= 0.147709 )
							if( basis_minus <= -0.002919 )
								if( senkou_span_a_displaced <= 0.149438 )
									ret := -0.333333
								if( senkou_span_a_displaced > 0.149438 )
									ret := 0.653846
							if( basis_minus > -0.002919 )
								if( chinkou_span <= 0.148122 )
									ret := -0.800000 // sell
								if( chinkou_span > 0.148122 )
									ret := -0.136364
						if( kinjun_sen > 0.147709 )
							if( tenkan_sen <= 0.144816 )
								ret := 0.500000
							if( tenkan_sen > 0.144816 )
								if( senkou_span_a_displaced <= 0.150582 )
									ret := 0.750000 // buy
								if( senkou_span_a_displaced > 0.150582 )
									ret := 1.000000 // buy
				if( basis_minus > 0.003987 )
					if( basis_max <= -0.000838 )
						ret := 0.200000
					if( basis_max > -0.000838 )
						if( kinjun_sen <= 0.144236 )
							ret := -0.750000 // sell
						if( kinjun_sen > 0.144236 )
							ret := -0.857143 // sell
	if( senkou_span_a > 0.147399 )
		if( basis_max <= 0.001271 )
			if( basis_minus <= -0.003628 )
				if( kinjun_sen <= 0.151289 )
					if( senkou_span_a <= 0.1502 )
						if( chinkou_span <= 0.146703 )
							ret := 1.000000 // buy
						if( chinkou_span > 0.146703 )
							ret := 0.750000 // buy
					if( senkou_span_a > 0.1502 )
						if( kinjun_sen <= 0.150867 )
							ret := -1.000000 // sell
						if( kinjun_sen > 0.150867 )
							ret := -0.571429
				if( kinjun_sen > 0.151289 )
					if( senkou_span_a <= 0.169913 )
						if( basis_minus <= -0.005202 )
							if( senkou_span_a_displaced <= 0.17075 )
								ret := 1.000000 // buy
							if( senkou_span_a_displaced > 0.17075 )
								if( senkou_span_a <= 0.169712 )
									ret := 0.428571
								if( senkou_span_a > 0.169712 )
									ret := 1.000000 // buy
						if( basis_minus > -0.005202 )
							if( senkou_span_a_displaced <= 0.163752 )
								if( senkou_span_a <= 0.154125 )
									ret := 0.571429
								if( senkou_span_a > 0.154125 )
									ret := 1.000000 // buy
							if( senkou_span_a_displaced > 0.163752 )
								if( senkou_span_a <= 0.162063 )
									ret := -0.200000
								if( senkou_span_a > 0.162063 )
									ret := 0.750000 // buy
					if( senkou_span_a > 0.169913 )
						if( basis_max <= 0.00045 )
							ret := -0.166667
						if( basis_max > 0.00045 )
							ret := -1.000000 // sell
			if( basis_minus > -0.003628 )
				if( chinkou_span <= 0.147894 )
					if( kinjun_sen <= 0.154675 )
						if( senkou_span_a <= 0.14892 )
							if( senkou_span_b_displaced <= 0.1473 )
								if( basis_minus <= 0.002062 )
									ret := -0.512500
								if( basis_minus > 0.002062 )
									ret := -0.896552 // sell
							if( senkou_span_b_displaced > 0.1473 )
								if( tenkan_sen <= 0.148667 )
									ret := -0.163265
								if( tenkan_sen > 0.148667 )
									ret := 0.838710 // buy
						if( senkou_span_a > 0.14892 )
							if( senkou_span_a <= 0.15265 )
								if( senkou_span_b <= 0.146054 )
									ret := 0.500000
								if( senkou_span_b > 0.146054 )
									ret := -0.675472
							if( senkou_span_a > 0.15265 )
								if( basis_max <= 0.000575 )
									ret := -0.987952 // sell
								if( basis_max > 0.000575 )
									ret := -0.500000
					if( kinjun_sen > 0.154675 )
						if( tenkan_sen <= 0.154075 )
							ret := 1.000000 // buy
						if( tenkan_sen > 0.154075 )
							if( tenkan_sen <= 0.154186 )
								ret := 0.500000
							if( tenkan_sen > 0.154186 )
								ret := 1.000000 // buy
				if( chinkou_span > 0.147894 )
					if( kinjun_sen <= 0.159149 )
						if( basis_max <= -0.00073 )
							if( senkou_span_a_displaced <= 0.152363 )
								if( basis_max <= -0.003754 )
									ret := 0.812500 // buy
								if( basis_max > -0.003754 )
									ret := -0.169014
							if( senkou_span_a_displaced > 0.152363 )
								if( senkou_span_a <= 0.159381 )
									ret := -0.809524 // sell
								if( senkou_span_a > 0.159381 )
									ret := 0.166667
						if( basis_max > -0.00073 )
							if( senkou_span_a_displaced <= 0.146797 )
								if( basis_max <= -0.000299 )
									ret := 0.304348
								if( basis_max > -0.000299 )
									ret := 0.909091 // buy
							if( senkou_span_a_displaced > 0.146797 )
								if( chinkou_span <= 0.155725 )
									ret := -0.116987
								if( chinkou_span > 0.155725 )
									ret := 0.465046
					if( kinjun_sen > 0.159149 )
						if( chinkou_span <= 0.159248 )
							if( senkou_span_a <= 0.162795 )
								if( senkou_span_a <= 0.161825 )
									ret := -0.612335
								if( senkou_span_a > 0.161825 )
									ret := 0.516129
							if( senkou_span_a > 0.162795 )
								if( basis_max <= -0.000759 )
									ret := -0.250000
								if( basis_max > -0.000759 )
									ret := -0.875000 // sell
						if( chinkou_span > 0.159248 )
							if( chinkou_span <= 0.18662 )
								if( senkou_span_a <= 0.173725 )
									ret := 0.035417
								if( senkou_span_a > 0.173725 )
									ret := -0.269437
							if( chinkou_span > 0.18662 )
								if( basis_max <= -4.2e-05 )
									ret := 0.796296 // buy
								if( basis_max > -4.2e-05 )
									ret := -0.125000
		if( basis_max > 0.001271 )
			if( senkou_span_b <= 0.177946 )
				if( basis_minus <= 0.00625 )
					if( senkou_span_b <= 0.162476 )
						if( senkou_span_b_displaced <= 0.140696 )
							if( tenkan_sen <= 0.147191 )
								ret := -1.000000 // sell
							if( tenkan_sen > 0.147191 )
								if( senkou_span_a_displaced <= 0.142178 )
									ret := 0.909091 // buy
								if( senkou_span_a_displaced > 0.142178 )
									ret := -0.400000
						if( senkou_span_b_displaced > 0.140696 )
							if( basis_minus <= -0.004163 )
								ret := 0.000000
							if( basis_minus > -0.004163 )
								if( senkou_span_b_displaced <= 0.152125 )
									ret := 0.921569 // buy
								if( senkou_span_b_displaced > 0.152125 )
									ret := 0.590909
					if( senkou_span_b > 0.162476 )
						if( senkou_span_b_displaced <= 0.166589 )
							if( basis_max <= 0.002512 )
								if( chinkou_span <= 0.158 )
									ret := 0.250000
								if( chinkou_span > 0.158 )
									ret := -0.518519
							if( basis_max > 0.002512 )
								if( senkou_span_a_displaced <= 0.164353 )
									ret := -0.333333
								if( senkou_span_a_displaced > 0.164353 )
									ret := 1.000000 // buy
						if( senkou_span_b_displaced > 0.166589 )
							if( tenkan_sen <= 0.163131 )
								if( chinkou_span <= 0.166659 )
									ret := 0.611111
								if( chinkou_span > 0.166659 )
									ret := -1.000000 // sell
							if( tenkan_sen > 0.163131 )
								if( chinkou_span <= 0.17075 )
									ret := 0.928571 // buy
								if( chinkou_span > 0.17075 )
									ret := 0.000000
				if( basis_minus > 0.00625 )
					ret := -1.000000 // sell
			if( senkou_span_b > 0.177946 )
				if( basis_minus <= -0.002311 )
					ret := -1.000000 // sell
				if( basis_minus > -0.002311 )
					ret := -0.500000
	
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
float op_operation = decision_tree_0_XLMUSDT_15Min_948afe97(basis_minus, senkou_span_b, cross_dn_tenkan_kinjunInt, cross_up_tenkan_kinjunInt, kinjun_sen, tenkan_sen, senkou_span_b_displaced, senkou_span_a, senkou_span_a_displaced, basis_max, chinkou_span)

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


