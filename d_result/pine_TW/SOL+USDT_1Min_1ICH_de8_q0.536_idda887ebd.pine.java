//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: SOLUSDT_1Min_1ICH_da887ebd Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SOLUSDT_1Min_1ICH_da887ebd", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SOLUSDT_1Min_da887ebd(tenkan_sen, basis_minus, cross_up_tenkan_kinjunInt, senkou_span_a, cross_dn_tenkan_kinjunInt, senkou_span_b, chinkou_span, senkou_span_a_displaced, senkou_span_b_displaced, kinjun_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( chinkou_span <= 132.43 )
		if( senkou_span_b_displaced <= 131.279 )
			if( tenkan_sen <= 112.955 )
				if( senkou_span_b <= 114.69 )
					if( basis_max <= 0.345292 )
						ret := 0.888889 // buy
					if( basis_max > 0.345292 )
						ret := 1.000000 // buy
				if( senkou_span_b > 114.69 )
					ret := 0.857143 // buy
			if( tenkan_sen > 112.955 )
				if( kinjun_sen <= 132.721 )
					if( chinkou_span <= 130 )
						if( chinkou_span <= 119.695 )
							if( basis_minus <= -1.20086 )
								if( senkou_span_a <= 116.552 )
									ret := 0.652174
								if( senkou_span_a > 116.552 )
									ret := -0.577465
							if( basis_minus > -1.20086 )
								if( senkou_span_a <= 119.954 )
									ret := -0.509843
								if( senkou_span_a > 119.954 )
									ret := -0.849398 // sell
						if( chinkou_span > 119.695 )
							if( senkou_span_a_displaced <= 128.833 )
								if( chinkou_span <= 127.721 )
									ret := -0.058749
								if( chinkou_span > 127.721 )
									ret := 0.186230
							if( senkou_span_a_displaced > 128.833 )
								if( basis_max <= 0.206913 )
									ret := -0.238741
								if( basis_max > 0.206913 )
									ret := 0.242678
					if( chinkou_span > 130 )
						if( kinjun_sen <= 130.059 )
							if( basis_minus <= 1.77785 )
								if( senkou_span_b <= 129.483 )
									ret := 0.691704
								if( senkou_span_b > 129.483 )
									ret := 0.347982
							if( basis_minus > 1.77785 )
								if( senkou_span_b_displaced <= 123.24 )
									ret := 0.066667
								if( senkou_span_b_displaced > 123.24 )
									ret := -1.000000 // sell
						if( kinjun_sen > 130.059 )
							if( basis_max <= -0.31875 )
								if( chinkou_span <= 131.86 )
									ret := -0.712963 // sell
								if( chinkou_span > 131.86 )
									ret := 0.062500
							if( basis_max > -0.31875 )
								if( senkou_span_b <= 130.916 )
									ret := 0.162151
								if( senkou_span_b > 130.916 )
									ret := -0.058287
				if( kinjun_sen > 132.721 )
					if( basis_max <= -0.065 )
						if( tenkan_sen <= 133.473 )
							if( kinjun_sen <= 132.92 )
								ret := -1.000000 // sell
							if( kinjun_sen > 132.92 )
								ret := -0.562500
						if( tenkan_sen > 133.473 )
							if( tenkan_sen <= 133.812 )
								if( senkou_span_b <= 132.439 )
									ret := -0.888889 // sell
								if( senkou_span_b > 132.439 )
									ret := -1.000000 // sell
							if( tenkan_sen > 133.812 )
								ret := -1.000000 // sell
					if( basis_max > -0.065 )
						ret := -0.421053
		if( senkou_span_b_displaced > 131.279 )
			if( senkou_span_b <= 132.779 )
				if( basis_minus <= 0.183179 )
					if( senkou_span_a_displaced <= 130.717 )
						if( senkou_span_b <= 130.341 )
							if( senkou_span_b_displaced <= 131.798 )
								if( chinkou_span <= 128.668 )
									ret := -0.846154 // sell
								if( chinkou_span > 128.668 )
									ret := 0.000000
							if( senkou_span_b_displaced > 131.798 )
								ret := 1.000000 // buy
						if( senkou_span_b > 130.341 )
							if( basis_max <= 0.019399 )
								ret := 0.363636
							if( basis_max > 0.019399 )
								ret := 1.000000 // buy
					if( senkou_span_a_displaced > 130.717 )
						if( senkou_span_a <= 132.683 )
							if( basis_max <= -0.076767 )
								if( senkou_span_a <= 130.14 )
									ret := -0.018868
								if( senkou_span_a > 130.14 )
									ret := -0.564270
							if( basis_max > -0.076767 )
								if( senkou_span_a <= 131.282 )
									ret := -0.230189
								if( senkou_span_a > 131.282 )
									ret := -0.051361
						if( senkou_span_a > 132.683 )
							if( tenkan_sen <= 132.72 )
								ret := -0.500000
							if( tenkan_sen > 132.72 )
								if( chinkou_span <= 132.419 )
									ret := -0.982143 // sell
								if( chinkou_span > 132.419 )
									ret := -0.777778 // sell
				if( basis_minus > 0.183179 )
					if( chinkou_span <= 130.875 )
						if( basis_max <= -0.00576 )
							ret := -1.000000 // sell
						if( basis_max > -0.00576 )
							ret := -0.875000 // sell
					if( chinkou_span > 130.875 )
						if( senkou_span_b <= 131.992 )
							if( senkou_span_a <= 132.384 )
								if( tenkan_sen <= 132.324 )
									ret := -0.118110
								if( tenkan_sen > 132.324 )
									ret := -0.628571
							if( senkou_span_a > 132.384 )
								if( chinkou_span <= 131.48 )
									ret := 0.818182 // buy
								if( chinkou_span > 131.48 )
									ret := 0.625000
						if( senkou_span_b > 131.992 )
							if( senkou_span_a_displaced <= 132.828 )
								if( senkou_span_a_displaced <= 131.855 )
									ret := -0.884058 // sell
								if( senkou_span_a_displaced > 131.855 )
									ret := -0.474886
							if( senkou_span_a_displaced > 132.828 )
								ret := 0.333333
			if( senkou_span_b > 132.779 )
				if( tenkan_sen <= 132.665 )
					if( basis_max <= 0.235419 )
						if( tenkan_sen <= 132.162 )
							if( senkou_span_a <= 131.974 )
								ret := -0.384615
							if( senkou_span_a > 131.974 )
								if( kinjun_sen <= 132.337 )
									ret := 0.750000 // buy
								if( kinjun_sen > 132.337 )
									ret := 1.000000 // buy
						if( tenkan_sen > 132.162 )
							if( chinkou_span <= 131.895 )
								if( senkou_span_a <= 132.749 )
									ret := -0.875000 // sell
								if( senkou_span_a > 132.749 )
									ret := -0.466667
							if( chinkou_span > 131.895 )
								if( tenkan_sen <= 132.56 )
									ret := -0.163636
								if( tenkan_sen > 132.56 )
									ret := 0.153846
					if( basis_max > 0.235419 )
						if( kinjun_sen <= 132.778 )
							if( basis_minus <= -1.08375 )
								if( kinjun_sen <= 132.368 )
									ret := -1.000000 // sell
								if( kinjun_sen > 132.368 )
									ret := -0.714286 // sell
							if( basis_minus > -1.08375 )
								if( senkou_span_b <= 133.012 )
									ret := -0.857143 // sell
								if( senkou_span_b > 133.012 )
									ret := 0.600000
						if( kinjun_sen > 132.778 )
							if( kinjun_sen <= 133.296 )
								if( senkou_span_b_displaced <= 134.816 )
									ret := -0.945055 // sell
								if( senkou_span_b_displaced > 134.816 )
									ret := -0.777778 // sell
							if( kinjun_sen > 133.296 )
								ret := -0.444444
				if( tenkan_sen > 132.665 )
					if( basis_minus <= 0.389665 )
						if( senkou_span_b_displaced <= 132.823 )
							if( senkou_span_a_displaced <= 132.499 )
								ret := -0.500000
							if( senkou_span_a_displaced > 132.499 )
								if( basis_max <= -0.240628 )
									ret := -0.785714 // sell
								if( basis_max > -0.240628 )
									ret := -0.945274 // sell
						if( senkou_span_b_displaced > 132.823 )
							if( senkou_span_b <= 134.255 )
								if( chinkou_span <= 132.36 )
									ret := -0.685121
								if( chinkou_span > 132.36 )
									ret := -0.337349
							if( senkou_span_b > 134.255 )
								if( basis_max <= 0.266396 )
									ret := -0.829060 // sell
								if( basis_max > 0.266396 )
									ret := -0.962121 // sell
					if( basis_minus > 0.389665 )
						if( senkou_span_b_displaced <= 132.828 )
							if( tenkan_sen <= 133.9 )
								if( senkou_span_a <= 133.321 )
									ret := -0.666667
								if( senkou_span_a > 133.321 )
									ret := -1.000000 // sell
							if( tenkan_sen > 133.9 )
								if( senkou_span_b <= 133.054 )
									ret := -0.900000 // sell
								if( senkou_span_b > 133.054 )
									ret := 0.000000
						if( senkou_span_b_displaced > 132.828 )
							if( senkou_span_a <= 133.39 )
								ret := 0.545455
							if( senkou_span_a > 133.39 )
								if( tenkan_sen <= 133.383 )
									ret := -0.454545
								if( tenkan_sen > 133.383 )
									ret := 0.277778
	if( chinkou_span > 132.43 )
		if( tenkan_sen <= 133.01 )
			if( senkou_span_a <= 132.317 )
				if( kinjun_sen <= 130.873 )
					if( senkou_span_b <= 129.61 )
						if( basis_max <= -0.441827 )
							ret := -0.583333
						if( basis_max > -0.441827 )
							ret := -0.900000 // sell
					if( senkou_span_b > 129.61 )
						if( tenkan_sen <= 130.851 )
							if( senkou_span_b_displaced <= 132.738 )
								if( senkou_span_b <= 129.799 )
									ret := 1.000000 // buy
								if( senkou_span_b > 129.799 )
									ret := 0.836735 // buy
							if( senkou_span_b_displaced > 132.738 )
								ret := 0.272727
						if( tenkan_sen > 130.851 )
							ret := 1.000000 // buy
				if( kinjun_sen > 130.873 )
					if( chinkou_span <= 133.492 )
						if( senkou_span_a <= 130.897 )
							ret := -1.000000 // sell
						if( senkou_span_a > 130.897 )
							if( senkou_span_b_displaced <= 129.513 )
								if( senkou_span_a_displaced <= 130.104 )
									ret := 0.400000
								if( senkou_span_a_displaced > 130.104 )
									ret := -0.888889 // sell
							if( senkou_span_b_displaced > 129.513 )
								if( kinjun_sen <= 132.411 )
									ret := 0.470407
								if( kinjun_sen > 132.411 )
									ret := -0.888889 // sell
					if( chinkou_span > 133.492 )
						if( senkou_span_a <= 132.02 )
							if( tenkan_sen <= 131.38 )
								if( senkou_span_a <= 131.461 )
									ret := 0.916667 // buy
								if( senkou_span_a > 131.461 )
									ret := -0.333333
							if( tenkan_sen > 131.38 )
								if( basis_max <= -0.202156 )
									ret := 0.846154 // buy
								if( basis_max > -0.202156 )
									ret := -0.323944
						if( senkou_span_a > 132.02 )
							if( basis_max <= -0.119032 )
								if( senkou_span_b_displaced <= 132.781 )
									ret := 0.962406 // buy
								if( senkou_span_b_displaced > 132.781 )
									ret := 0.647059
							if( basis_max > -0.119032 )
								if( senkou_span_b_displaced <= 131.457 )
									ret := 0.076923
								if( senkou_span_b_displaced > 131.457 )
									ret := 0.888889 // buy
			if( senkou_span_a > 132.317 )
				if( chinkou_span <= 132.775 )
					if( senkou_span_b <= 133.431 )
						if( senkou_span_b <= 132.895 )
							if( tenkan_sen <= 132.385 )
								if( kinjun_sen <= 132.516 )
									ret := 0.241935
								if( kinjun_sen > 132.516 )
									ret := 0.764706 // buy
							if( tenkan_sen > 132.385 )
								if( kinjun_sen <= 132.526 )
									ret := 0.182390
								if( kinjun_sen > 132.526 )
									ret := -0.246809
						if( senkou_span_b > 132.895 )
							if( senkou_span_a_displaced <= 133.397 )
								if( chinkou_span <= 132.755 )
									ret := -0.674847
								if( chinkou_span > 132.755 )
									ret := 0.111111
							if( senkou_span_a_displaced > 133.397 )
								if( chinkou_span <= 132.611 )
									ret := 0.558140
								if( chinkou_span > 132.611 )
									ret := -0.333333
					if( senkou_span_b > 133.431 )
						if( chinkou_span <= 132.603 )
							if( basis_minus <= -0.51957 )
								ret := -0.428571
							if( basis_minus > -0.51957 )
								ret := 0.933333 // buy
						if( chinkou_span > 132.603 )
							ret := 1.000000 // buy
				if( chinkou_span > 132.775 )
					if( chinkou_span <= 133.242 )
						if( senkou_span_b_displaced <= 132.973 )
							if( senkou_span_b <= 132.014 )
								if( tenkan_sen <= 132.821 )
									ret := 0.784091 // buy
								if( tenkan_sen > 132.821 )
									ret := -0.307692
							if( senkou_span_b > 132.014 )
								if( kinjun_sen <= 133.399 )
									ret := 0.080378
								if( kinjun_sen > 133.399 )
									ret := -0.894737 // sell
						if( senkou_span_b_displaced > 132.973 )
							if( senkou_span_a_displaced <= 132.809 )
								ret := -0.058824
							if( senkou_span_a_displaced > 132.809 )
								if( kinjun_sen <= 132.488 )
									ret := -0.545455
								if( kinjun_sen > 132.488 )
									ret := 0.676923
					if( chinkou_span > 133.242 )
						if( senkou_span_a_displaced <= 134.159 )
							if( basis_max <= -0.484234 )
								ret := -0.705882 // sell
							if( basis_max > -0.484234 )
								if( senkou_span_a <= 133.022 )
									ret := 0.630108
								if( senkou_span_a > 133.022 )
									ret := 0.196721
						if( senkou_span_a_displaced > 134.159 )
							if( kinjun_sen <= 133.079 )
								if( basis_minus <= -1.93052 )
									ret := -0.583333
								if( basis_minus > -1.93052 )
									ret := -0.909091 // sell
							if( kinjun_sen > 133.079 )
								ret := 0.666667
		if( tenkan_sen > 133.01 )
			if( senkou_span_a <= 180.56 )
				if( senkou_span_b_displaced <= 181.549 )
					if( chinkou_span <= 180.043 )
						if( senkou_span_b <= 178.409 )
							if( tenkan_sen <= 143.484 )
								if( senkou_span_b_displaced <= 145.452 )
									ret := 0.020242
								if( senkou_span_b_displaced > 145.452 )
									ret := 0.753769 // buy
							if( tenkan_sen > 143.484 )
								if( basis_max <= 0.105527 )
									ret := -0.025426
								if( basis_max > 0.105527 )
									ret := 0.052130
						if( senkou_span_b > 178.409 )
							if( tenkan_sen <= 179.985 )
								if( basis_max <= 0.307362 )
									ret := -0.247525
								if( basis_max > 0.307362 )
									ret := 0.209524
							if( tenkan_sen > 179.985 )
								if( senkou_span_b <= 180.636 )
									ret := -0.561047
								if( senkou_span_b > 180.636 )
									ret := -0.838710 // sell
					if( chinkou_span > 180.043 )
						if( tenkan_sen <= 179.964 )
							if( senkou_span_a <= 180.343 )
								if( senkou_span_b_displaced <= 178.051 )
									ret := 0.581081
								if( senkou_span_b_displaced > 178.051 )
									ret := 0.759732 // buy
							if( senkou_span_a > 180.343 )
								ret := -0.250000
						if( tenkan_sen > 179.964 )
							if( senkou_span_b <= 180.518 )
								if( basis_max <= -0.265 )
									ret := 0.541667
								if( basis_max > -0.265 )
									ret := 0.057613
							if( senkou_span_b > 180.518 )
								if( chinkou_span <= 181.018 )
									ret := 0.688406
								if( chinkou_span > 181.018 )
									ret := 0.383929
				if( senkou_span_b_displaced > 181.549 )
					if( basis_max <= 0.190931 )
						if( senkou_span_b_displaced <= 181.997 )
							if( basis_minus <= -0.8125 )
								ret := -0.947368 // sell
							if( basis_minus > -0.8125 )
								if( senkou_span_b_displaced <= 181.76 )
									ret := -0.250000
								if( senkou_span_b_displaced > 181.76 )
									ret := 0.275862
						if( senkou_span_b_displaced > 181.997 )
							if( basis_minus <= -0.795658 )
								if( kinjun_sen <= 180.057 )
									ret := 0.916667 // buy
								if( kinjun_sen > 180.057 )
									ret := 1.000000 // buy
							if( basis_minus > -0.795658 )
								ret := 0.000000
					if( basis_max > 0.190931 )
						if( chinkou_span <= 180.435 )
							if( senkou_span_a_displaced <= 182.036 )
								if( senkou_span_b <= 181.16 )
									ret := 0.500000
								if( senkou_span_b > 181.16 )
									ret := 1.000000 // buy
							if( senkou_span_a_displaced > 182.036 )
								if( tenkan_sen <= 180.024 )
									ret := -0.300000
								if( tenkan_sen > 180.024 )
									ret := 0.615385
						if( chinkou_span > 180.435 )
							if( senkou_span_b_displaced <= 181.973 )
								if( basis_minus <= -0.575978 )
									ret := 0.947368 // buy
								if( basis_minus > -0.575978 )
									ret := 0.800000 // buy
							if( senkou_span_b_displaced > 181.973 )
								ret := 0.700000 // buy
			if( senkou_span_a > 180.56 )
				if( chinkou_span <= 180.869 )
					if( basis_max <= 0.445622 )
						if( senkou_span_a <= 181.047 )
							if( senkou_span_a <= 180.684 )
								if( chinkou_span <= 179.079 )
									ret := -1.000000 // sell
								if( chinkou_span > 179.079 )
									ret := -0.349112
							if( senkou_span_a > 180.684 )
								if( tenkan_sen <= 180.759 )
									ret := -0.654054
								if( tenkan_sen > 180.759 )
									ret := 0.054264
						if( senkou_span_a > 181.047 )
							if( chinkou_span <= 180.771 )
								if( basis_max <= 0.342358 )
									ret := -0.653402
								if( basis_max > 0.342358 )
									ret := 0.500000
							if( chinkou_span > 180.771 )
								if( basis_max <= -0.016144 )
									ret := -0.718750 // sell
								if( basis_max > -0.016144 )
									ret := -0.042553
					if( basis_max > 0.445622 )
						ret := 0.666667
				if( chinkou_span > 180.869 )
					if( basis_max <= -0.740493 )
						if( senkou_span_b_displaced <= 177.07 )
							if( chinkou_span <= 182.462 )
								ret := -0.800000 // sell
							if( chinkou_span > 182.462 )
								ret := -0.916667 // sell
						if( senkou_span_b_displaced > 177.07 )
							ret := -1.000000 // sell
					if( basis_max > -0.740493 )
						if( tenkan_sen <= 181.375 )
							if( basis_max <= 0.161681 )
								if( senkou_span_b <= 181.64 )
									ret := 0.333333
								if( senkou_span_b > 181.64 )
									ret := -0.280000
							if( basis_max > 0.161681 )
								if( tenkan_sen <= 180.79 )
									ret := 0.340000
								if( tenkan_sen > 180.79 )
									ret := 0.890909 // buy
						if( tenkan_sen > 181.375 )
							if( kinjun_sen <= 182.423 )
								if( chinkou_span <= 181.814 )
									ret := -0.306243
								if( chinkou_span > 181.814 )
									ret := 0.337531
							if( kinjun_sen > 182.423 )
								if( senkou_span_b_displaced <= 183.34 )
									ret := -0.156563
								if( senkou_span_b_displaced > 183.34 )
									ret := -0.057539
	
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
float op_operation = decision_tree_0_SOLUSDT_1Min_da887ebd(tenkan_sen, basis_minus, cross_up_tenkan_kinjunInt, senkou_span_a, cross_dn_tenkan_kinjunInt, senkou_span_b, chinkou_span, senkou_span_a_displaced, senkou_span_b_displaced, kinjun_sen, basis_max)

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


