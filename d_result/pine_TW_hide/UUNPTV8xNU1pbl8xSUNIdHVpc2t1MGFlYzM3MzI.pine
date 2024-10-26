//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: QCOM_15Min_1ICH_0aec3732 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_QCOM_15Min_1ICH_0aec3732", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_QCOM_15Min_0aec3732(senkou_span_a_displaced, cross_dn_tenkan_kinjunInt, kinjun_sen, chinkou_span, senkou_span_b_displaced, basis_minus, senkou_span_b, senkou_span_a, cross_up_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( kinjun_sen <= 171.124 )
		if( senkou_span_b <= 170.666 )
			if( basis_max <= 1.45015 )
				if( basis_minus <= 1.51124 )
					if( senkou_span_a <= 50.0566 )
						if( basis_max <= -0.14875 )
							ret := 1.000000 // buy
						if( basis_max > -0.14875 )
							if( senkou_span_b <= 50.2558 )
								if( senkou_span_b <= 49.805 )
									ret := 0.330275
								if( senkou_span_b > 49.805 )
									ret := 0.574468
							if( senkou_span_b > 50.2558 )
								if( senkou_span_b_displaced <= 50.5634 )
									ret := -1.000000 // sell
								if( senkou_span_b_displaced > 50.5634 )
									ret := 0.250000
					if( senkou_span_a > 50.0566 )
						if( chinkou_span <= 165.837 )
							if( tenkan_sen <= 163.511 )
								if( basis_minus <= -5.15986 )
									ret := 0.517442
								if( basis_minus > -5.15986 )
									ret := 0.008464
							if( tenkan_sen > 163.511 )
								if( senkou_span_a <= 168.083 )
									ret := -0.305613
								if( senkou_span_a > 168.083 )
									ret := -0.731801 // sell
						if( chinkou_span > 165.837 )
							if( senkou_span_b_displaced <= 167.021 )
								if( senkou_span_a <= 165.644 )
									ret := 0.650869
								if( senkou_span_a > 165.644 )
									ret := 0.240822
							if( senkou_span_b_displaced > 167.021 )
								if( basis_max <= 0.055771 )
									ret := -0.038396
								if( basis_max > 0.055771 )
									ret := 0.360750
				if( basis_minus > 1.51124 )
					if( senkou_span_b_displaced <= 156.992 )
						if( senkou_span_b <= 154.465 )
							if( chinkou_span <= 149.794 )
								if( tenkan_sen <= 148.071 )
									ret := -0.094866
								if( tenkan_sen > 148.071 )
									ret := -0.736585 // sell
							if( chinkou_span > 149.794 )
								if( basis_max <= -0.001542 )
									ret := 0.042710
								if( basis_max > -0.001542 )
									ret := 0.716418 // buy
						if( senkou_span_b > 154.465 )
							if( senkou_span_b_displaced <= 154.241 )
								if( senkou_span_a_displaced <= 155.977 )
									ret := -0.832061 // sell
								if( senkou_span_a_displaced > 155.977 )
									ret := -0.615385
							if( senkou_span_b_displaced > 154.241 )
								if( tenkan_sen <= 159.088 )
									ret := 0.272727
								if( tenkan_sen > 159.088 )
									ret := -0.621951
					if( senkou_span_b_displaced > 156.992 )
						if( senkou_span_b <= 159.75 )
							if( basis_max <= -0.976225 )
								if( chinkou_span <= 166.151 )
									ret := 0.789474 // buy
								if( chinkou_span > 166.151 )
									ret := 1.000000 // buy
							if( basis_max > -0.976225 )
								if( kinjun_sen <= 160.688 )
									ret := 0.142857
								if( kinjun_sen > 160.688 )
									ret := 0.700000 // buy
						if( senkou_span_b > 159.75 )
							if( basis_minus <= 4.29468 )
								if( tenkan_sen <= 171.914 )
									ret := 0.003181
								if( tenkan_sen > 171.914 )
									ret := 0.634615
							if( basis_minus > 4.29468 )
								if( senkou_span_b_displaced <= 160.505 )
									ret := -0.800000 // sell
								if( senkou_span_b_displaced > 160.505 )
									ret := -1.000000 // sell
			if( basis_max > 1.45015 )
				if( senkou_span_a_displaced <= 135.16 )
					if( kinjun_sen <= 128.39 )
						if( senkou_span_a_displaced <= 117.601 )
							if( chinkou_span <= 65.96 )
								if( senkou_span_b_displaced <= 63.7451 )
									ret := -1.000000 // sell
								if( senkou_span_b_displaced > 63.7451 )
									ret := 0.409091
							if( chinkou_span > 65.96 )
								if( senkou_span_a_displaced <= 117.07 )
									ret := -0.609756
								if( senkou_span_a_displaced > 117.07 )
									ret := -1.000000 // sell
						if( senkou_span_a_displaced > 117.601 )
							if( senkou_span_b_displaced <= 130.77 )
								ret := 0.444444
							if( senkou_span_b_displaced > 130.77 )
								if( chinkou_span <= 116.033 )
									ret := -0.200000
								if( chinkou_span > 116.033 )
									ret := -0.692308
					if( kinjun_sen > 128.39 )
						ret := -1.000000 // sell
				if( senkou_span_a_displaced > 135.16 )
					if( basis_minus <= -3.7185 )
						if( senkou_span_a_displaced <= 160.045 )
							ret := -0.583333
						if( senkou_span_a_displaced > 160.045 )
							if( senkou_span_b_displaced <= 164.844 )
								ret := 1.000000 // buy
							if( senkou_span_b_displaced > 164.844 )
								ret := 0.500000
					if( basis_minus > -3.7185 )
						if( basis_minus <= -2.52786 )
							if( tenkan_sen <= 141.987 )
								ret := -0.411765
							if( tenkan_sen > 141.987 )
								if( tenkan_sen <= 164.583 )
									ret := -0.784615 // sell
								if( tenkan_sen > 164.583 )
									ret := -1.000000 // sell
						if( basis_minus > -2.52786 )
							if( basis_minus <= -2.40736 )
								if( basis_max <= 2.47586 )
									ret := 0.700000 // buy
								if( basis_max > 2.47586 )
									ret := 1.000000 // buy
							if( basis_minus > -2.40736 )
								if( chinkou_span <= 168.753 )
									ret := -0.220126
								if( chinkou_span > 168.753 )
									ret := 0.714286 // buy
		if( senkou_span_b > 170.666 )
			if( senkou_span_b <= 172.893 )
				if( basis_minus <= -2.12004 )
					if( senkou_span_b_displaced <= 173.615 )
						if( senkou_span_a_displaced <= 172.319 )
							ret := 1.000000 // buy
						if( senkou_span_a_displaced > 172.319 )
							ret := 0.375000
					if( senkou_span_b_displaced > 173.615 )
						if( basis_minus <= -2.71577 )
							if( senkou_span_b <= 172.687 )
								ret := 1.000000 // buy
							if( senkou_span_b > 172.687 )
								if( senkou_span_b_displaced <= 175.464 )
									ret := 1.000000 // buy
								if( senkou_span_b_displaced > 175.464 )
									ret := 0.769231 // buy
						if( basis_minus > -2.71577 )
							ret := 0.058824
				if( basis_minus > -2.12004 )
					if( basis_minus <= -1.71021 )
						if( senkou_span_b <= 171.521 )
							if( chinkou_span <= 168.539 )
								ret := -0.272727
							if( chinkou_span > 168.539 )
								ret := -0.954545 // sell
						if( senkou_span_b > 171.521 )
							if( chinkou_span <= 173.161 )
								ret := 0.166667
							if( chinkou_span > 173.161 )
								ret := 0.400000
					if( basis_minus > -1.71021 )
						if( senkou_span_a_displaced <= 172.523 )
							if( senkou_span_a <= 170.707 )
								if( senkou_span_b <= 171.133 )
									ret := 0.822581 // buy
								if( senkou_span_b > 171.133 )
									ret := 0.406780
							if( senkou_span_a > 170.707 )
								if( kinjun_sen <= 170.551 )
									ret := 0.909091 // buy
								if( kinjun_sen > 170.551 )
									ret := 0.248227
						if( senkou_span_a_displaced > 172.523 )
							if( chinkou_span <= 164.721 )
								ret := -0.785714 // sell
							if( chinkou_span > 164.721 )
								if( tenkan_sen <= 170.537 )
									ret := -0.016393
								if( tenkan_sen > 170.537 )
									ret := 0.750000 // buy
			if( senkou_span_b > 172.893 )
				ret := -0.866667 // sell
	if( kinjun_sen > 171.124 )
		if( chinkou_span <= 170.89 )
			if( basis_max <= 0.141792 )
				if( senkou_span_b_displaced <= 180.418 )
					if( senkou_span_b_displaced <= 177.106 )
						if( chinkou_span <= 166.344 )
							if( senkou_span_b <= 173 )
								ret := -1.000000 // sell
							if( senkou_span_b > 173 )
								ret := -0.894737 // sell
						if( chinkou_span > 166.344 )
							if( basis_max <= -0.296916 )
								if( senkou_span_a <= 173.315 )
									ret := -0.622642
								if( senkou_span_a > 173.315 )
									ret := -0.055556
							if( basis_max > -0.296916 )
								if( senkou_span_a <= 174.877 )
									ret := -0.829114 // sell
								if( senkou_span_a > 174.877 )
									ret := -0.566038
					if( senkou_span_b_displaced > 177.106 )
						if( tenkan_sen <= 173.625 )
							ret := 0.625000
						if( tenkan_sen > 173.625 )
							if( senkou_span_a <= 173.774 )
								ret := -1.000000 // sell
							if( senkou_span_a > 173.774 )
								ret := -0.636364
				if( senkou_span_b_displaced > 180.418 )
					ret := -1.000000 // sell
			if( basis_max > 0.141792 )
				if( senkou_span_b_displaced <= 173.677 )
					if( senkou_span_a <= 170.559 )
						ret := 0.909091 // buy
					if( senkou_span_a > 170.559 )
						if( basis_minus <= -0.157132 )
							if( kinjun_sen <= 172.341 )
								if( senkou_span_b_displaced <= 172.346 )
									ret := 0.260870
								if( senkou_span_b_displaced > 172.346 )
									ret := -0.569231
							if( kinjun_sen > 172.341 )
								if( tenkan_sen <= 172.368 )
									ret := 0.413043
								if( tenkan_sen > 172.368 )
									ret := -0.296296
						if( basis_minus > -0.157132 )
							if( tenkan_sen <= 172.293 )
								if( senkou_span_a <= 171.631 )
									ret := -0.650000
								if( senkou_span_a > 171.631 )
									ret := 0.105263
							if( tenkan_sen > 172.293 )
								if( tenkan_sen <= 173.583 )
									ret := -0.878788 // sell
								if( tenkan_sen > 173.583 )
									ret := -0.538462
				if( senkou_span_b_displaced > 173.677 )
					if( kinjun_sen <= 173.96 )
						if( chinkou_span <= 164.226 )
							if( kinjun_sen <= 172.285 )
								ret := -0.900000 // sell
							if( kinjun_sen > 172.285 )
								ret := -1.000000 // sell
						if( chinkou_span > 164.226 )
							if( basis_minus <= -0.742043 )
								if( senkou_span_b <= 173.41 )
									ret := -0.258065
								if( senkou_span_b > 173.41 )
									ret := -0.625000
							if( basis_minus > -0.742043 )
								ret := -1.000000 // sell
					if( kinjun_sen > 173.96 )
						if( senkou_span_b <= 176.352 )
							ret := -0.857143 // sell
						if( senkou_span_b > 176.352 )
							if( chinkou_span <= 168.986 )
								if( chinkou_span <= 165.308 )
									ret := 0.100000
								if( chinkou_span > 165.308 )
									ret := -0.750000 // sell
							if( chinkou_span > 168.986 )
								ret := 0.347826
		if( chinkou_span > 170.89 )
			if( senkou_span_a <= 183.584 )
				if( senkou_span_b_displaced <= 179.175 )
					if( basis_max <= -0.10453 )
						if( senkou_span_a_displaced <= 179.564 )
							if( chinkou_span <= 175.472 )
								if( tenkan_sen <= 175.493 )
									ret := -0.106436
								if( tenkan_sen > 175.493 )
									ret := -0.814815 // sell
							if( chinkou_span > 175.472 )
								if( kinjun_sen <= 179.32 )
									ret := 0.258699
								if( kinjun_sen > 179.32 )
									ret := -0.398907
						if( senkou_span_a_displaced > 179.564 )
							if( chinkou_span <= 183.551 )
								if( senkou_span_b_displaced <= 179.105 )
									ret := 0.852941 // buy
								if( senkou_span_b_displaced > 179.105 )
									ret := 0.000000
							if( chinkou_span > 183.551 )
								ret := 0.066667
					if( basis_max > -0.10453 )
						if( senkou_span_b_displaced <= 173.765 )
							if( basis_max <= 0.536692 )
								if( tenkan_sen <= 175.089 )
									ret := -0.132159
								if( tenkan_sen > 175.089 )
									ret := 0.750000 // buy
							if( basis_max > 0.536692 )
								if( senkou_span_b_displaced <= 172.775 )
									ret := 0.538462
								if( senkou_span_b_displaced > 172.775 )
									ret := -0.333333
						if( senkou_span_b_displaced > 173.765 )
							if( kinjun_sen <= 180.983 )
								if( chinkou_span <= 176.818 )
									ret := 0.257009
								if( chinkou_span > 176.818 )
									ret := 0.730337 // buy
							if( kinjun_sen > 180.983 )
								if( senkou_span_a_displaced <= 181.384 )
									ret := -0.452991
								if( senkou_span_a_displaced > 181.384 )
									ret := 0.818182 // buy
				if( senkou_span_b_displaced > 179.175 )
					if( kinjun_sen <= 181.476 )
						if( senkou_span_a <= 177.054 )
							if( tenkan_sen <= 176.549 )
								if( basis_max <= 0.900704 )
									ret := 0.325581
								if( basis_max > 0.900704 )
									ret := -0.632184
							if( tenkan_sen > 176.549 )
								if( senkou_span_a <= 176.682 )
									ret := 0.750000 // buy
								if( senkou_span_a > 176.682 )
									ret := 1.000000 // buy
						if( senkou_span_a > 177.054 )
							if( chinkou_span <= 179.29 )
								if( basis_minus <= 0.152562 )
									ret := -0.393885
								if( basis_minus > 0.152562 )
									ret := -0.913043 // sell
							if( chinkou_span > 179.29 )
								if( senkou_span_b_displaced <= 184.289 )
									ret := -0.083601
								if( senkou_span_b_displaced > 184.289 )
									ret := 0.681818
					if( kinjun_sen > 181.476 )
						if( tenkan_sen <= 181.21 )
							if( senkou_span_b_displaced <= 186.166 )
								if( basis_minus <= -0.53625 )
									ret := 0.768595 // buy
								if( basis_minus > -0.53625 )
									ret := 0.166667
							if( senkou_span_b_displaced > 186.166 )
								ret := -0.214286
						if( tenkan_sen > 181.21 )
							if( chinkou_span <= 180.73 )
								if( basis_max <= 1.19249 )
									ret := -0.558252
								if( basis_max > 1.19249 )
									ret := 0.727273 // buy
							if( chinkou_span > 180.73 )
								if( senkou_span_a_displaced <= 181.612 )
									ret := -0.125000
								if( senkou_span_a_displaced > 181.612 )
									ret := 0.407950
			if( senkou_span_a > 183.584 )
				if( senkou_span_a <= 184.652 )
					if( kinjun_sen <= 184.745 )
						if( senkou_span_b <= 183.776 )
							if( senkou_span_a <= 183.83 )
								if( senkou_span_a <= 183.66 )
									ret := 0.000000
								if( senkou_span_a > 183.66 )
									ret := 0.642857
							if( senkou_span_a > 183.83 )
								if( senkou_span_b <= 182.268 )
									ret := -0.607143
								if( senkou_span_b > 182.268 )
									ret := 0.046512
						if( senkou_span_b > 183.776 )
							if( senkou_span_a <= 184.205 )
								if( kinjun_sen <= 184.343 )
									ret := -0.859504 // sell
								if( kinjun_sen > 184.343 )
									ret := -0.622222
							if( senkou_span_a > 184.205 )
								if( senkou_span_b <= 184.285 )
									ret := 0.388889
								if( senkou_span_b > 184.285 )
									ret := -0.559524
					if( kinjun_sen > 184.745 )
						if( basis_minus <= -1.4053 )
							if( senkou_span_b_displaced <= 188.574 )
								ret := -1.000000 // sell
							if( senkou_span_b_displaced > 188.574 )
								ret := -0.550000
						if( basis_minus > -1.4053 )
							if( basis_minus <= -0.630825 )
								if( senkou_span_a_displaced <= 186.941 )
									ret := 0.750000 // buy
								if( senkou_span_a_displaced > 186.941 )
									ret := 1.000000 // buy
							if( basis_minus > -0.630825 )
								ret := 0.250000
				if( senkou_span_a > 184.652 )
					if( senkou_span_b_displaced <= 226.469 )
						if( senkou_span_b <= 202.745 )
							if( chinkou_span <= 183.735 )
								if( kinjun_sen <= 187.212 )
									ret := -0.552632
								if( kinjun_sen > 187.212 )
									ret := -0.867089 // sell
							if( chinkou_span > 183.735 )
								if( tenkan_sen <= 190.735 )
									ret := 0.186608
								if( tenkan_sen > 190.735 )
									ret := -0.184848
						if( senkou_span_b > 202.745 )
							if( senkou_span_a_displaced <= 206.702 )
								if( chinkou_span <= 206.922 )
									ret := -0.020833
								if( chinkou_span > 206.922 )
									ret := 0.508600
							if( senkou_span_a_displaced > 206.702 )
								if( senkou_span_a <= 206.39 )
									ret := -0.662420
								if( senkou_span_a > 206.39 )
									ret := -0.011955
					if( senkou_span_b_displaced > 226.469 )
						if( kinjun_sen <= 224.679 )
							ret := 0.090909
						if( kinjun_sen > 224.679 )
							if( chinkou_span <= 215.39 )
								if( senkou_span_a <= 228.88 )
									ret := -1.000000 // sell
								if( senkou_span_a > 228.88 )
									ret := -0.812500 // sell
							if( chinkou_span > 215.39 )
								ret := -0.300000
	
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
float op_operation = decision_tree_0_QCOM_15Min_0aec3732(senkou_span_a_displaced, cross_dn_tenkan_kinjunInt, kinjun_sen, chinkou_span, senkou_span_b_displaced, basis_minus, senkou_span_b, senkou_span_a, cross_up_tenkan_kinjunInt, tenkan_sen, basis_max)

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


