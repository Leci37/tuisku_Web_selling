//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: AMZN_5Min_1ICH_22fd408a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMZN_5Min_1ICH_22fd408a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMZN_5Min_22fd408a(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( chinkou_span <= 104.182 )
		if( kinjun_sen <= 104.009 )
			if( basis_max <= -0.23625 )
				ret := -1.000000 // sell
			if( basis_max > -0.23625 )
				if( senkou_span_a_displaced <= 102.847 )
					if( basis_minus <= -0.233897 )
						if( senkou_span_a_displaced <= 102.631 )
							if( senkou_span_b_displaced <= 102.19 )
								ret := 0.416667
							if( senkou_span_b_displaced > 102.19 )
								ret := 0.000000
						if( senkou_span_a_displaced > 102.631 )
							ret := -0.777778 // sell
					if( basis_minus > -0.233897 )
						if( chinkou_span <= 103.388 )
							if( senkou_span_b_displaced <= 101.507 )
								if( kinjun_sen <= 101.734 )
									ret := 1.000000 // buy
								if( kinjun_sen > 101.734 )
									ret := 0.555556
							if( senkou_span_b_displaced > 101.507 )
								if( basis_max <= -0.017149 )
									ret := 0.433333
								if( basis_max > -0.017149 )
									ret := -0.350000
						if( chinkou_span > 103.388 )
							if( kinjun_sen <= 102.903 )
								if( senkou_span_a_displaced <= 102.46 )
									ret := 0.818182 // buy
								if( senkou_span_a_displaced > 102.46 )
									ret := 1.000000 // buy
							if( kinjun_sen > 102.903 )
								if( chinkou_span <= 103.482 )
									ret := 0.900000 // buy
								if( chinkou_span > 103.482 )
									ret := 0.058824
				if( senkou_span_a_displaced > 102.847 )
					if( basis_minus <= -0.230395 )
						if( senkou_span_a <= 102.92 )
							if( basis_max <= 0.091983 )
								if( tenkan_sen <= 102.813 )
									ret := -1.000000 // sell
								if( tenkan_sen > 102.813 )
									ret := -0.666667
							if( basis_max > 0.091983 )
								if( basis_minus <= -0.387325 )
									ret := -0.461538
								if( basis_minus > -0.387325 )
									ret := -0.833333 // sell
						if( senkou_span_a > 102.92 )
							if( senkou_span_b <= 104.305 )
								if( senkou_span_a_displaced <= 104.611 )
									ret := 0.214286
								if( senkou_span_a_displaced > 104.611 )
									ret := 1.000000 // buy
							if( senkou_span_b > 104.305 )
								ret := -0.238095
					if( basis_minus > -0.230395 )
						if( senkou_span_a_displaced <= 103.498 )
							if( tenkan_sen <= 103.491 )
								ret := 0.285714
							if( tenkan_sen > 103.491 )
								if( senkou_span_a_displaced <= 103.395 )
									ret := -0.538462
								if( senkou_span_a_displaced > 103.395 )
									ret := -0.133333
						if( senkou_span_a_displaced > 103.498 )
							if( tenkan_sen <= 103.58 )
								ret := -0.125000
							if( tenkan_sen > 103.58 )
								if( senkou_span_a_displaced <= 103.518 )
									ret := 0.866667 // buy
								if( senkou_span_a_displaced > 103.518 )
									ret := 0.764706 // buy
		if( kinjun_sen > 104.009 )
			if( senkou_span_a <= 104.97 )
				if( senkou_span_a_displaced <= 105.211 )
					if( senkou_span_b <= 104.597 )
						if( tenkan_sen <= 104.188 )
							if( senkou_span_b <= 104.436 )
								ret := -0.294118
							if( senkou_span_b > 104.436 )
								if( basis_max <= 0.11125 )
									ret := -1.000000 // sell
								if( basis_max > 0.11125 )
									ret := -0.780488 // sell
						if( tenkan_sen > 104.188 )
							if( senkou_span_b <= 104.075 )
								ret := -1.000000 // sell
							if( senkou_span_b > 104.075 )
								if( kinjun_sen <= 104.582 )
									ret := -0.047619
								if( kinjun_sen > 104.582 )
									ret := -0.909091 // sell
					if( senkou_span_b > 104.597 )
						if( senkou_span_b <= 104.9 )
							if( kinjun_sen <= 104.55 )
								ret := 0.250000
							if( kinjun_sen > 104.55 )
								if( basis_minus <= -0.05875 )
									ret := -0.214286
								if( basis_minus > -0.05875 )
									ret := -0.600000
						if( senkou_span_b > 104.9 )
							ret := 0.769231 // buy
				if( senkou_span_a_displaced > 105.211 )
					if( senkou_span_b <= 104.777 )
						ret := -1.000000 // sell
					if( senkou_span_b > 104.777 )
						ret := -0.636364
			if( senkou_span_a > 104.97 )
				if( tenkan_sen <= 105.14 )
					if( tenkan_sen <= 104.952 )
						ret := -0.894737 // sell
					if( tenkan_sen > 104.952 )
						if( senkou_span_b <= 105.044 )
							ret := -0.875000 // sell
						if( senkou_span_b > 105.044 )
							ret := -1.000000 // sell
				if( tenkan_sen > 105.14 )
					if( chinkou_span <= 104.092 )
						ret := -0.588235
					if( chinkou_span > 104.092 )
						ret := -0.090909
	if( chinkou_span > 104.182 )
		if( kinjun_sen <= 130.045 )
			if( senkou_span_b_displaced <= 127.746 )
				if( senkou_span_a <= 127.873 )
					if( senkou_span_a_displaced <= 126.085 )
						if( senkou_span_b <= 104.524 )
							if( chinkou_span <= 104.598 )
								if( tenkan_sen <= 104.024 )
									ret := 0.674699
								if( tenkan_sen > 104.024 )
									ret := -0.309091
							if( chinkou_span > 104.598 )
								if( basis_minus <= -0.359514 )
									ret := -0.333333
								if( basis_minus > -0.359514 )
									ret := 0.617117
						if( senkou_span_b > 104.524 )
							if( senkou_span_b <= 105.787 )
								if( basis_minus <= -0.054992 )
									ret := 0.175115
								if( basis_minus > -0.054992 )
									ret := -0.302694
							if( senkou_span_b > 105.787 )
								if( chinkou_span <= 125.594 )
									ret := 0.012485
								if( chinkou_span > 125.594 )
									ret := 0.350325
					if( senkou_span_a_displaced > 126.085 )
						if( tenkan_sen <= 127.64 )
							if( senkou_span_a <= 127.365 )
								if( senkou_span_b <= 127.097 )
									ret := -0.128923
								if( senkou_span_b > 127.097 )
									ret := 0.410853
							if( senkou_span_a > 127.365 )
								if( chinkou_span <= 127.961 )
									ret := -0.787671 // sell
								if( chinkou_span > 127.961 )
									ret := 0.083333
						if( tenkan_sen > 127.64 )
							if( senkou_span_b_displaced <= 126.8 )
								if( chinkou_span <= 127.762 )
									ret := -0.711538 // sell
								if( chinkou_span > 127.762 )
									ret := 0.291667
							if( senkou_span_b_displaced > 126.8 )
								if( senkou_span_b_displaced <= 127.14 )
									ret := 0.873418 // buy
								if( senkou_span_b_displaced > 127.14 )
									ret := 0.217822
				if( senkou_span_a > 127.873 )
					if( basis_minus <= 0.14274 )
						if( chinkou_span <= 127.333 )
							if( kinjun_sen <= 127.945 )
								ret := 0.583333
							if( kinjun_sen > 127.945 )
								if( basis_max <= -0.00125 )
									ret := -0.300000
								if( basis_max > -0.00125 )
									ret := -0.650000
						if( chinkou_span > 127.333 )
							if( senkou_span_a_displaced <= 128.935 )
								if( tenkan_sen <= 128.824 )
									ret := 0.590909
								if( tenkan_sen > 128.824 )
									ret := 0.000000
							if( senkou_span_a_displaced > 128.935 )
								if( basis_max <= 0.117972 )
									ret := 0.970588 // buy
								if( basis_max > 0.117972 )
									ret := 0.700000 // buy
					if( basis_minus > 0.14274 )
						if( basis_max <= -0.074296 )
							if( senkou_span_a_displaced <= 125.878 )
								if( kinjun_sen <= 127.674 )
									ret := 0.500000
								if( kinjun_sen > 127.674 )
									ret := 0.000000
							if( senkou_span_a_displaced > 125.878 )
								if( kinjun_sen <= 128.631 )
									ret := -0.809524 // sell
								if( kinjun_sen > 128.631 )
									ret := -0.457143
						if( basis_max > -0.074296 )
							if( basis_max <= -0.062168 )
								if( senkou_span_a_displaced <= 127.482 )
									ret := 0.909091 // buy
								if( senkou_span_a_displaced > 127.482 )
									ret := 0.600000
							if( basis_max > -0.062168 )
								if( senkou_span_b <= 129.157 )
									ret := -0.346591
								if( senkou_span_b > 129.157 )
									ret := -1.000000 // sell
			if( senkou_span_b_displaced > 127.746 )
				if( basis_minus <= 0.506583 )
					if( chinkou_span <= 129.266 )
						if( senkou_span_a_displaced <= 128.635 )
							if( chinkou_span <= 126.188 )
								if( basis_max <= 0.3301 )
									ret := -0.710227 // sell
								if( basis_max > 0.3301 )
									ret := 0.725000 // buy
							if( chinkou_span > 126.188 )
								if( senkou_span_b <= 128.253 )
									ret := 0.391068
								if( senkou_span_b > 128.253 )
									ret := -0.101010
						if( senkou_span_a_displaced > 128.635 )
							if( basis_minus <= -0.459616 )
								if( senkou_span_a <= 128.228 )
									ret := 0.315493
								if( senkou_span_a > 128.228 )
									ret := -0.167959
							if( basis_minus > -0.459616 )
								if( tenkan_sen <= 129.131 )
									ret := -0.133188
								if( tenkan_sen > 129.131 )
									ret := -0.556263
					if( chinkou_span > 129.266 )
						if( chinkou_span <= 130.606 )
							if( basis_minus <= 0.287407 )
								if( kinjun_sen <= 128.413 )
									ret := 0.581152
								if( kinjun_sen > 128.413 )
									ret := 0.213746
							if( basis_minus > 0.287407 )
								if( tenkan_sen <= 129.151 )
									ret := 0.847222 // buy
								if( tenkan_sen > 129.151 )
									ret := 0.429487
						if( chinkou_span > 130.606 )
							if( basis_max <= -0.042756 )
								if( senkou_span_b_displaced <= 128.358 )
									ret := 0.066667
								if( senkou_span_b_displaced > 128.358 )
									ret := 0.844828 // buy
							if( basis_max > -0.042756 )
								if( senkou_span_b_displaced <= 129.192 )
									ret := 0.652893
								if( senkou_span_b_displaced > 129.192 )
									ret := 0.110092
				if( basis_minus > 0.506583 )
					if( chinkou_span <= 129.15 )
						if( senkou_span_a <= 128.771 )
							if( tenkan_sen <= 128.783 )
								if( chinkou_span <= 128.906 )
									ret := -0.535714
								if( chinkou_span > 128.906 )
									ret := -1.000000 // sell
							if( tenkan_sen > 128.783 )
								ret := 1.000000 // buy
						if( senkou_span_a > 128.771 )
							if( basis_max <= -0.178658 )
								ret := -0.222222
							if( basis_max > -0.178658 )
								if( senkou_span_a_displaced <= 128.136 )
									ret := -0.428571
								if( senkou_span_a_displaced > 128.136 )
									ret := -0.864865 // sell
					if( chinkou_span > 129.15 )
						if( basis_minus <= 0.521224 )
							if( senkou_span_b <= 129.381 )
								ret := 0.555556
							if( senkou_span_b > 129.381 )
								ret := 1.000000 // buy
						if( basis_minus > 0.521224 )
							if( senkou_span_b <= 129.454 )
								if( basis_max <= -0.386003 )
									ret := -0.375000
								if( basis_max > -0.386003 )
									ret := 0.111111
							if( senkou_span_b > 129.454 )
								ret := -0.652174
		if( kinjun_sen > 130.045 )
			if( tenkan_sen <= 131.001 )
				if( senkou_span_a <= 130.238 )
					if( basis_max <= 0.395844 )
						if( basis_max <= 0.203945 )
							if( kinjun_sen <= 130.08 )
								if( chinkou_span <= 130.479 )
									ret := -0.621622
								if( chinkou_span > 130.479 )
									ret := 0.857143 // buy
							if( kinjun_sen > 130.08 )
								if( basis_max <= 0.139004 )
									ret := 0.117857
								if( basis_max > 0.139004 )
									ret := 0.693069
						if( basis_max > 0.203945 )
							if( tenkan_sen <= 129.495 )
								ret := 0.111111
							if( tenkan_sen > 129.495 )
								if( chinkou_span <= 130.568 )
									ret := -0.790909 // sell
								if( chinkou_span > 130.568 )
									ret := 0.800000 // buy
					if( basis_max > 0.395844 )
						if( senkou_span_b <= 130.62 )
							if( senkou_span_b_displaced <= 131.47 )
								ret := 0.500000
							if( senkou_span_b_displaced > 131.47 )
								ret := 0.823529 // buy
						if( senkou_span_b > 130.62 )
							ret := 1.000000 // buy
				if( senkou_span_a > 130.238 )
					if( chinkou_span <= 130.255 )
						if( kinjun_sen <= 131.005 )
							if( senkou_span_b_displaced <= 131.005 )
								if( basis_max <= 0.093491 )
									ret := -0.632058
								if( basis_max > 0.093491 )
									ret := -0.852941 // sell
							if( senkou_span_b_displaced > 131.005 )
								if( senkou_span_b <= 130.843 )
									ret := -1.000000 // sell
								if( senkou_span_b > 130.843 )
									ret := -0.828571 // sell
						if( kinjun_sen > 131.005 )
							if( basis_max <= 0.478063 )
								if( kinjun_sen <= 131.063 )
									ret := -0.105263
								if( kinjun_sen > 131.063 )
									ret := -0.877551 // sell
							if( basis_max > 0.478063 )
								ret := 1.000000 // buy
					if( chinkou_span > 130.255 )
						if( kinjun_sen <= 130.79 )
							if( senkou_span_a <= 130.715 )
								if( senkou_span_b_displaced <= 128.829 )
									ret := -0.375000
								if( senkou_span_b_displaced > 128.829 )
									ret := 0.262537
							if( senkou_span_a > 130.715 )
								if( basis_minus <= 0.650965 )
									ret := 0.763158 // buy
								if( basis_minus > 0.650965 )
									ret := 0.153846
						if( kinjun_sen > 130.79 )
							if( senkou_span_b <= 130.857 )
								if( basis_minus <= 0.211139 )
									ret := 0.545455
								if( basis_minus > 0.211139 )
									ret := 0.083333
							if( senkou_span_b > 130.857 )
								if( basis_minus <= -0.288406 )
									ret := -0.911111 // sell
								if( basis_minus > -0.288406 )
									ret := -0.584615
			if( tenkan_sen > 131.001 )
				if( senkou_span_a_displaced <= 200.027 )
					if( tenkan_sen <= 143.707 )
						if( chinkou_span <= 131.147 )
							if( senkou_span_b <= 131.485 )
								if( basis_minus <= 1.07061 )
									ret := 0.064516
								if( basis_minus > 1.07061 )
									ret := -0.868852 // sell
							if( senkou_span_b > 131.485 )
								if( kinjun_sen <= 132.351 )
									ret := -0.615385
								if( kinjun_sen > 132.351 )
									ret := -0.886364 // sell
						if( chinkou_span > 131.147 )
							if( senkou_span_a_displaced <= 132.109 )
								if( chinkou_span <= 131.704 )
									ret := -0.063492
								if( chinkou_span > 131.704 )
									ret := 0.397260
							if( senkou_span_a_displaced > 132.109 )
								if( basis_max <= -0.38608 )
									ret := -0.570637
								if( basis_max > -0.38608 )
									ret := -0.046037
					if( tenkan_sen > 143.707 )
						if( chinkou_span <= 143.895 )
							if( basis_minus <= 0.227513 )
								if( senkou_span_b_displaced <= 145.143 )
									ret := -0.347826
								if( senkou_span_b_displaced > 145.143 )
									ret := -0.800000 // sell
							if( basis_minus > 0.227513 )
								if( kinjun_sen <= 143.595 )
									ret := 0.000000
								if( kinjun_sen > 143.595 )
									ret := 0.125000
						if( chinkou_span > 143.895 )
							if( tenkan_sen <= 145.259 )
								if( chinkou_span <= 145.094 )
									ret := 0.075472
								if( chinkou_span > 145.094 )
									ret := 0.434921
							if( tenkan_sen > 145.259 )
								if( senkou_span_b_displaced <= 144.357 )
									ret := -0.541485
								if( senkou_span_b_displaced > 144.357 )
									ret := 0.012059
				if( senkou_span_a_displaced > 200.027 )
					if( tenkan_sen <= 199.81 )
						if( tenkan_sen <= 199.461 )
							if( senkou_span_b_displaced <= 200.079 )
								ret := 0.000000
							if( senkou_span_b_displaced > 200.079 )
								if( basis_minus <= -0.38252 )
									ret := -0.883721 // sell
								if( basis_minus > -0.38252 )
									ret := -0.411765
						if( tenkan_sen > 199.461 )
							if( kinjun_sen <= 199.745 )
								ret := -0.777778 // sell
							if( kinjun_sen > 199.745 )
								if( senkou_span_a_displaced <= 200.089 )
									ret := -1.000000 // sell
								if( senkou_span_a_displaced > 200.089 )
									ret := -0.857143 // sell
					if( tenkan_sen > 199.81 )
						if( senkou_span_a <= 200.458 )
							if( senkou_span_a <= 200.064 )
								if( kinjun_sen <= 199.944 )
									ret := -0.200000
								if( kinjun_sen > 199.944 )
									ret := -0.550000
							if( senkou_span_a > 200.064 )
								ret := 0.000000
						if( senkou_span_a > 200.458 )
							if( basis_minus <= 0.208478 )
								ret := -1.000000 // sell
							if( basis_minus > 0.208478 )
								ret := -0.700000 // sell
	
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
float op_operation = decision_tree_0_AMZN_5Min_22fd408a(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)

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


