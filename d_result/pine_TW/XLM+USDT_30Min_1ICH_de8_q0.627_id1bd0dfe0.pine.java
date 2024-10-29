//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: XLMUSDT_30Min_1ICH_1bd0dfe0 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XLMUSDT_30Min_1ICH_1bd0dfe0", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XLMUSDT_30Min_1bd0dfe0(basis_minus, senkou_span_b, cross_dn_tenkan_kinjunInt, cross_up_tenkan_kinjunInt, kinjun_sen, tenkan_sen, senkou_span_b_displaced, senkou_span_a, senkou_span_a_displaced, basis_max, chinkou_span)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( basis_minus <= -0.0017 )
		if( kinjun_sen <= 0.091833 )
			if( basis_minus <= -0.002876 )
				if( tenkan_sen <= 0.08935 )
					if( kinjun_sen <= 0.080482 )
						ret := 1.000000 // buy
					if( kinjun_sen > 0.080482 )
						if( chinkou_span <= 0.087906 )
							ret := 0.647059
						if( chinkou_span > 0.087906 )
							ret := 1.000000 // buy
				if( tenkan_sen > 0.08935 )
					ret := 0.181818
			if( basis_minus > -0.002876 )
				if( senkou_span_b_displaced <= 0.090175 )
					if( senkou_span_b_displaced <= 0.090075 )
						if( chinkou_span <= 0.078076 )
							if( senkou_span_a <= 0.075279 )
								if( basis_minus <= -0.001883 )
									ret := 0.411765
								if( basis_minus > -0.001883 )
									ret := -0.050000
							if( senkou_span_a > 0.075279 )
								if( chinkou_span <= 0.076471 )
									ret := 0.454545
								if( chinkou_span > 0.076471 )
									ret := -0.811321 // sell
						if( chinkou_span > 0.078076 )
							if( tenkan_sen <= 0.08154 )
								if( senkou_span_a_displaced <= 0.084271 )
									ret := 0.696078
								if( senkou_span_a_displaced > 0.084271 )
									ret := 0.925926 // buy
							if( tenkan_sen > 0.08154 )
								if( kinjun_sen <= 0.085941 )
									ret := 0.136986
								if( kinjun_sen > 0.085941 )
									ret := -0.047619
					if( senkou_span_b_displaced > 0.090075 )
						ret := -1.000000 // sell
				if( senkou_span_b_displaced > 0.090175 )
					if( basis_max <= 0.000353 )
						if( kinjun_sen <= 0.089806 )
							ret := 0.416667
						if( kinjun_sen > 0.089806 )
							ret := 0.714286 // buy
					if( basis_max > 0.000353 )
						if( senkou_span_a_displaced <= 0.093051 )
							if( senkou_span_a <= 0.086244 )
								ret := 0.777778 // buy
							if( senkou_span_a > 0.086244 )
								ret := 0.923077 // buy
						if( senkou_span_a_displaced > 0.093051 )
							ret := 1.000000 // buy
		if( kinjun_sen > 0.091833 )
			if( kinjun_sen <= 0.232838 )
				if( tenkan_sen <= 0.195612 )
					if( senkou_span_a_displaced <= 0.173133 )
						if( basis_minus <= -0.009654 )
							if( basis_minus <= -0.013007 )
								ret := 1.000000 // buy
							if( basis_minus > -0.013007 )
								if( senkou_span_b_displaced <= 0.138391 )
									ret := 0.925926 // buy
								if( senkou_span_b_displaced > 0.138391 )
									ret := -0.062500
						if( basis_minus > -0.009654 )
							if( senkou_span_b <= 0.166991 )
								if( senkou_span_b_displaced <= 0.169937 )
									ret := 0.002195
								if( senkou_span_b_displaced > 0.169937 )
									ret := 0.798077 // buy
							if( senkou_span_b > 0.166991 )
								if( cross_dn_tenkan_kinjunInt <= 0.5 )
									ret := -0.556604
								if( cross_dn_tenkan_kinjunInt > 0.5 )
									ret := 0.818182 // buy
					if( senkou_span_a_displaced > 0.173133 )
						if( basis_max <= 0.004203 )
							if( chinkou_span <= 0.190237 )
								if( senkou_span_b <= 0.18037 )
									ret := 0.454787
								if( senkou_span_b > 0.18037 )
									ret := -0.069940
							if( chinkou_span > 0.190237 )
								if( senkou_span_b <= 0.197675 )
									ret := 0.706271 // buy
								if( senkou_span_b > 0.197675 )
									ret := 0.262500
						if( basis_max > 0.004203 )
							if( senkou_span_a_displaced <= 0.204853 )
								if( chinkou_span <= 0.183175 )
									ret := -0.571429
								if( chinkou_span > 0.183175 )
									ret := -1.000000 // sell
							if( senkou_span_a_displaced > 0.204853 )
								if( kinjun_sen <= 0.188207 )
									ret := 0.692308
								if( kinjun_sen > 0.188207 )
									ret := -0.541667
				if( tenkan_sen > 0.195612 )
					if( senkou_span_a_displaced <= 0.231745 )
						if( senkou_span_b_displaced <= 0.223872 )
							if( senkou_span_a_displaced <= 0.20945 )
								if( senkou_span_a_displaced <= 0.198946 )
									ret := -0.836066 // sell
								if( senkou_span_a_displaced > 0.198946 )
									ret := -0.419847
							if( senkou_span_a_displaced > 0.20945 )
								if( kinjun_sen <= 0.208186 )
									ret := 0.409091
								if( kinjun_sen > 0.208186 )
									ret := -0.268156
						if( senkou_span_b_displaced > 0.223872 )
							if( chinkou_span <= 0.216275 )
								if( tenkan_sen <= 0.21014 )
									ret := -0.577320
								if( tenkan_sen > 0.21014 )
									ret := -0.885845 // sell
							if( chinkou_span > 0.216275 )
								if( basis_minus <= -0.003187 )
									ret := 0.050000
								if( basis_minus > -0.003187 )
									ret := -0.800000 // sell
					if( senkou_span_a_displaced > 0.231745 )
						if( senkou_span_a <= 0.225776 )
							if( chinkou_span <= 0.259418 )
								if( kinjun_sen <= 0.225254 )
									ret := 0.000000
								if( kinjun_sen > 0.225254 )
									ret := 1.000000 // buy
							if( chinkou_span > 0.259418 )
								ret := -0.750000 // sell
						if( senkou_span_a > 0.225776 )
							if( senkou_span_b <= 0.233226 )
								if( senkou_span_a_displaced <= 0.235991 )
									ret := 0.377049
								if( senkou_span_a_displaced > 0.235991 )
									ret := -0.409091
							if( senkou_span_b > 0.233226 )
								if( senkou_span_a <= 0.226641 )
									ret := -1.000000 // sell
								if( senkou_span_a > 0.226641 )
									ret := -0.323529
			if( kinjun_sen > 0.232838 )
				if( senkou_span_b_displaced <= 0.282375 )
					if( chinkou_span <= 0.259197 )
						if( senkou_span_b_displaced <= 0.262793 )
							if( tenkan_sen <= 0.233372 )
								if( basis_minus <= -0.00311 )
									ret := 0.757576 // buy
								if( basis_minus > -0.00311 )
									ret := 0.403509
							if( tenkan_sen > 0.233372 )
								if( chinkou_span <= 0.255 )
									ret := -0.031524
								if( chinkou_span > 0.255 )
									ret := 0.692308
						if( senkou_span_b_displaced > 0.262793 )
							if( senkou_span_a <= 0.261237 )
								if( senkou_span_a_displaced <= 0.26568 )
									ret := -0.640845
								if( senkou_span_a_displaced > 0.26568 )
									ret := 0.166667
							if( senkou_span_a > 0.261237 )
								if( basis_minus <= -0.005913 )
									ret := 0.272727
								if( basis_minus > -0.005913 )
									ret := -0.751938 // sell
					if( chinkou_span > 0.259197 )
						if( tenkan_sen <= 0.270913 )
							if( kinjun_sen <= 0.258545 )
								if( senkou_span_b_displaced <= 0.26785 )
									ret := 0.859259 // buy
								if( senkou_span_b_displaced > 0.26785 )
									ret := 0.445455
							if( kinjun_sen > 0.258545 )
								if( senkou_span_a_displaced <= 0.271359 )
									ret := 0.077181
								if( senkou_span_a_displaced > 0.271359 )
									ret := 0.673993
						if( tenkan_sen > 0.270913 )
							if( senkou_span_a <= 0.278731 )
								if( basis_max <= 0.000685 )
									ret := 0.450549
								if( basis_max > 0.000685 )
									ret := -0.628866
							if( senkou_span_a > 0.278731 )
								if( basis_minus <= -0.002092 )
									ret := 0.871795 // buy
								if( basis_minus > -0.002092 )
									ret := 0.250000
				if( senkou_span_b_displaced > 0.282375 )
					if( chinkou_span <= 0.288261 )
						if( senkou_span_a <= 0.29363 )
							if( senkou_span_b <= 0.27453 )
								if( chinkou_span <= 0.273469 )
									ret := -1.000000 // sell
								if( chinkou_span > 0.273469 )
									ret := -0.166667
							if( senkou_span_b > 0.27453 )
								if( senkou_span_b <= 0.29498 )
									ret := -0.155689
								if( senkou_span_b > 0.29498 )
									ret := 0.613636
						if( senkou_span_a > 0.29363 )
							if( senkou_span_b_displaced <= 0.304986 )
								if( senkou_span_a <= 0.299934 )
									ret := -0.777778 // sell
								if( senkou_span_a > 0.299934 )
									ret := 1.000000 // buy
							if( senkou_span_b_displaced > 0.304986 )
								if( chinkou_span <= 0.287137 )
									ret := -0.811538 // sell
								if( chinkou_span > 0.287137 )
									ret := 0.000000
					if( chinkou_span > 0.288261 )
						if( senkou_span_a_displaced <= 0.343649 )
							if( basis_minus <= -0.005432 )
								if( chinkou_span <= 0.313867 )
									ret := 0.205047
								if( chinkou_span > 0.313867 )
									ret := 0.683702
							if( basis_minus > -0.005432 )
								if( senkou_span_a <= 0.320743 )
									ret := 0.249091
								if( senkou_span_a > 0.320743 )
									ret := -0.145768
						if( senkou_span_a_displaced > 0.343649 )
							if( chinkou_span <= 0.349073 )
								if( tenkan_sen <= 0.346805 )
									ret := -0.010139
								if( tenkan_sen > 0.346805 )
									ret := -0.716088 // sell
							if( chinkou_span > 0.349073 )
								if( tenkan_sen <= 0.395124 )
									ret := 0.257500
								if( tenkan_sen > 0.395124 )
									ret := 0.034640
	if( basis_minus > -0.0017 )
		if( tenkan_sen <= 0.701127 )
			if( tenkan_sen <= 0.109152 )
				if( chinkou_span <= 0.1083 )
					if( tenkan_sen <= 0.103773 )
						if( chinkou_span <= 0.100916 )
							if( senkou_span_a <= 0.090363 )
								if( kinjun_sen <= 0.089702 )
									ret := 0.033159
								if( kinjun_sen > 0.089702 )
									ret := 0.219409
							if( senkou_span_a > 0.090363 )
								if( kinjun_sen <= 0.101818 )
									ret := -0.099204
								if( kinjun_sen > 0.101818 )
									ret := -0.554140
						if( chinkou_span > 0.100916 )
							if( kinjun_sen <= 0.100125 )
								if( tenkan_sen <= 0.102989 )
									ret := 0.615970
								if( tenkan_sen > 0.102989 )
									ret := 0.093750
							if( kinjun_sen > 0.100125 )
								if( tenkan_sen <= 0.101399 )
									ret := 0.635945
								if( tenkan_sen > 0.101399 )
									ret := 0.184556
					if( tenkan_sen > 0.103773 )
						if( chinkou_span <= 0.103564 )
							if( basis_minus <= 0.0026 )
								if( senkou_span_b_displaced <= 0.10925 )
									ret := -0.422764
								if( senkou_span_b_displaced > 0.10925 )
									ret := 0.684211
							if( basis_minus > 0.0026 )
								if( kinjun_sen <= 0.102087 )
									ret := -0.090909
								if( kinjun_sen > 0.102087 )
									ret := -0.990291 // sell
						if( chinkou_span > 0.103564 )
							if( senkou_span_a_displaced <= 0.102112 )
								if( chinkou_span <= 0.104528 )
									ret := -0.142857
								if( chinkou_span > 0.104528 )
									ret := -0.878788 // sell
							if( senkou_span_a_displaced > 0.102112 )
								if( kinjun_sen <= 0.104499 )
									ret := 0.284722
								if( kinjun_sen > 0.104499 )
									ret := -0.073407
				if( chinkou_span > 0.1083 )
					if( senkou_span_a_displaced <= 0.106658 )
						if( kinjun_sen <= 0.105201 )
							if( senkou_span_b <= 0.104853 )
								if( chinkou_span <= 0.110601 )
									ret := 0.216216
								if( chinkou_span > 0.110601 )
									ret := 0.732283 // buy
							if( senkou_span_b > 0.104853 )
								if( senkou_span_a <= 0.105463 )
									ret := -0.837838 // sell
								if( senkou_span_a > 0.105463 )
									ret := -0.250000
						if( kinjun_sen > 0.105201 )
							if( kinjun_sen <= 0.107963 )
								if( tenkan_sen <= 0.10842 )
									ret := 0.810390 // buy
								if( tenkan_sen > 0.10842 )
									ret := 0.222222
							if( kinjun_sen > 0.107963 )
								if( chinkou_span <= 0.11165 )
									ret := 0.000000
								if( chinkou_span > 0.11165 )
									ret := 0.764706 // buy
					if( senkou_span_a_displaced > 0.106658 )
						if( tenkan_sen <= 0.107312 )
							if( chinkou_span <= 0.109221 )
								if( basis_max <= 0.000664 )
									ret := -0.023256
								if( basis_max > 0.000664 )
									ret := 0.714286 // buy
							if( chinkou_span > 0.109221 )
								if( senkou_span_a <= 0.105532 )
									ret := -0.454545
								if( senkou_span_a > 0.105532 )
									ret := 0.788571 // buy
						if( tenkan_sen > 0.107312 )
							if( senkou_span_b_displaced <= 0.109115 )
								if( senkou_span_a_displaced <= 0.109436 )
									ret := 0.055814
								if( senkou_span_a_displaced > 0.109436 )
									ret := -0.529412
							if( senkou_span_b_displaced > 0.109115 )
								if( chinkou_span <= 0.108468 )
									ret := 0.700000 // buy
								if( chinkou_span > 0.108468 )
									ret := 0.310078
			if( tenkan_sen > 0.109152 )
				if( basis_max <= 0.005531 )
					if( basis_minus <= 0.030015 )
						if( senkou_span_a <= 0.562023 )
							if( kinjun_sen <= 0.553483 )
								if( senkou_span_a_displaced <= 0.322928 )
									ret := -0.055016
								if( senkou_span_a_displaced > 0.322928 )
									ret := 0.008522
							if( kinjun_sen > 0.553483 )
								if( senkou_span_b_displaced <= 0.53979 )
									ret := -0.464789
								if( senkou_span_b_displaced > 0.53979 )
									ret := -1.000000 // sell
						if( senkou_span_a > 0.562023 )
							if( senkou_span_b_displaced <= 0.609423 )
								if( basis_minus <= 0.020156 )
									ret := 0.239362
								if( basis_minus > 0.020156 )
									ret := 0.807692 // buy
							if( senkou_span_b_displaced > 0.609423 )
								if( senkou_span_b <= 0.675974 )
									ret := -0.256849
								if( senkou_span_b > 0.675974 )
									ret := 0.888889 // buy
					if( basis_minus > 0.030015 )
						if( tenkan_sen <= 0.491512 )
							if( senkou_span_b <= 0.314085 )
								if( senkou_span_b <= 0.307043 )
									ret := -1.000000 // sell
								if( senkou_span_b > 0.307043 )
									ret := -0.424242
							if( senkou_span_b > 0.314085 )
								if( basis_max <= 0.000655 )
									ret := 0.236559
								if( basis_max > 0.000655 )
									ret := 1.000000 // buy
						if( tenkan_sen > 0.491512 )
							if( tenkan_sen <= 0.67608 )
								if( basis_minus <= 0.030768 )
									ret := 0.250000
								if( basis_minus > 0.030768 )
									ret := -0.896861 // sell
							if( tenkan_sen > 0.67608 )
								if( basis_max <= -0.010447 )
									ret := -0.631579
								if( basis_max > -0.010447 )
									ret := 0.400000
				if( basis_max > 0.005531 )
					if( senkou_span_b_displaced <= 0.663157 )
						if( chinkou_span <= 0.292706 )
							if( basis_minus <= 0.007089 )
								if( basis_max <= 0.007318 )
									ret := -0.636364
								if( basis_max > 0.007318 )
									ret := -0.928571 // sell
							if( basis_minus > 0.007089 )
								ret := 0.333333
						if( chinkou_span > 0.292706 )
							if( basis_max <= 0.006831 )
								if( kinjun_sen <= 0.619937 )
									ret := 0.216667
								if( kinjun_sen > 0.619937 )
									ret := 0.928571 // buy
							if( basis_max > 0.006831 )
								if( senkou_span_a_displaced <= 0.602674 )
									ret := 0.873563 // buy
								if( senkou_span_a_displaced > 0.602674 )
									ret := 0.409091
					if( senkou_span_b_displaced > 0.663157 )
						if( basis_minus <= 0.008899 )
							if( senkou_span_a_displaced <= 0.699344 )
								ret := -0.833333 // sell
							if( senkou_span_a_displaced > 0.699344 )
								ret := -0.777778 // sell
						if( basis_minus > 0.008899 )
							if( tenkan_sen <= 0.693219 )
								ret := 0.000000
							if( tenkan_sen > 0.693219 )
								ret := -0.555556
		if( tenkan_sen > 0.701127 )
			if( basis_minus <= 0.011039 )
				ret := 0.050000
			if( basis_minus > 0.011039 )
				if( senkou_span_a_displaced <= 0.652857 )
					if( senkou_span_a <= 0.69931 )
						ret := 0.437500
					if( senkou_span_a > 0.69931 )
						if( senkou_span_b <= 0.679942 )
							if( tenkan_sen <= 0.731162 )
								ret := 0.000000
							if( tenkan_sen > 0.731162 )
								ret := -0.769231 // sell
						if( senkou_span_b > 0.679942 )
							ret := -1.000000 // sell
				if( senkou_span_a_displaced > 0.652857 )
					if( senkou_span_a_displaced <= 0.686484 )
						ret := -1.000000 // sell
					if( senkou_span_a_displaced > 0.686484 )
						if( senkou_span_a_displaced <= 0.695067 )
							if( chinkou_span <= 0.681691 )
								ret := -0.555556
							if( chinkou_span > 0.681691 )
								ret := -1.000000 // sell
						if( senkou_span_a_displaced > 0.695067 )
							ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_XLMUSDT_30Min_1bd0dfe0(basis_minus, senkou_span_b, cross_dn_tenkan_kinjunInt, cross_up_tenkan_kinjunInt, kinjun_sen, tenkan_sen, senkou_span_b_displaced, senkou_span_a, senkou_span_a_displaced, basis_max, chinkou_span)

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


