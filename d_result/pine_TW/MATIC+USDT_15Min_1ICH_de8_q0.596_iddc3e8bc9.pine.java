//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: MATICUSDT_15Min_1ICH_dc3e8bc9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MATICUSDT_15Min_1ICH_dc3e8bc9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MATICUSDT_15Min_dc3e8bc9(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( basis_max <= 0.001491 )
		if( tenkan_sen <= 0.892397 )
			if( chinkou_span <= 0.881223 )
				if( senkou_span_b_displaced <= 0.808937 )
					if( chinkou_span <= 0.729334 )
						if( tenkan_sen <= 0.73886 )
							if( senkou_span_b <= 0.697805 )
								if( chinkou_span <= 0.688011 )
									ret := 0.019420
								if( chinkou_span > 0.688011 )
									ret := 0.306875
							if( senkou_span_b > 0.697805 )
								if( chinkou_span <= 0.68135 )
									ret := -0.752525 // sell
								if( chinkou_span > 0.68135 )
									ret := -0.050225
						if( tenkan_sen > 0.73886 )
							if( senkou_span_b <= 0.737616 )
								if( senkou_span_a_displaced <= 0.731625 )
									ret := -0.460317
								if( senkou_span_a_displaced > 0.731625 )
									ret := 0.250000
							if( senkou_span_b > 0.737616 )
								if( senkou_span_a_displaced <= 0.762949 )
									ret := -0.751634 // sell
								if( senkou_span_a_displaced > 0.762949 )
									ret := 0.750000 // buy
					if( chinkou_span > 0.729334 )
						if( senkou_span_a <= 0.723062 )
							if( kinjun_sen <= 0.689616 )
								if( basis_minus <= 0.005279 )
									ret := 0.954023 // buy
								if( basis_minus > 0.005279 )
									ret := 0.769231 // buy
							if( kinjun_sen > 0.689616 )
								if( senkou_span_b <= 0.690108 )
									ret := 0.138889
								if( senkou_span_b > 0.690108 )
									ret := 0.627540
						if( senkou_span_a > 0.723062 )
							if( kinjun_sen <= 0.823039 )
								if( senkou_span_b <= 0.754122 )
									ret := 0.188820
								if( senkou_span_b > 0.754122 )
									ret := 0.083357
							if( kinjun_sen > 0.823039 )
								if( senkou_span_b_displaced <= 0.801942 )
									ret := -0.485207
								if( senkou_span_b_displaced > 0.801942 )
									ret := 0.073333
				if( senkou_span_b_displaced > 0.808937 )
					if( chinkou_span <= 0.812319 )
						if( senkou_span_b <= 0.8317 )
							if( chinkou_span <= 0.800495 )
								if( basis_minus <= -0.011338 )
									ret := 0.058824
								if( basis_minus > -0.011338 )
									ret := -0.610266
							if( chinkou_span > 0.800495 )
								if( basis_minus <= 0.003848 )
									ret := -0.038835
								if( basis_minus > 0.003848 )
									ret := -0.353383
						if( senkou_span_b > 0.8317 )
							if( senkou_span_b <= 0.839618 )
								if( senkou_span_b <= 0.838398 )
									ret := -0.784946 // sell
								if( senkou_span_b > 0.838398 )
									ret := 0.375000
							if( senkou_span_b > 0.839618 )
								if( basis_minus <= -0.014025 )
									ret := -0.750000 // sell
								if( basis_minus > -0.014025 )
									ret := -0.969072 // sell
					if( chinkou_span > 0.812319 )
						if( kinjun_sen <= 0.825741 )
							if( kinjun_sen <= 0.824955 )
								if( chinkou_span <= 0.826004 )
									ret := 0.058315
								if( chinkou_span > 0.826004 )
									ret := 0.466667
							if( kinjun_sen > 0.824955 )
								if( senkou_span_b <= 0.820206 )
									ret := -0.333333
								if( senkou_span_b > 0.820206 )
									ret := 0.795181 // buy
						if( kinjun_sen > 0.825741 )
							if( chinkou_span <= 0.833536 )
								if( chinkou_span <= 0.823488 )
									ret := -0.528239
								if( chinkou_span > 0.823488 )
									ret := -0.221601
							if( chinkou_span > 0.833536 )
								if( tenkan_sen <= 0.857434 )
									ret := 0.150196
								if( tenkan_sen > 0.857434 )
									ret := -0.101782
			if( chinkou_span > 0.881223 )
				if( senkou_span_a <= 0.866706 )
					if( senkou_span_a_displaced <= 0.86292 )
						if( senkou_span_b_displaced <= 0.763397 )
							ret := -0.500000
						if( senkou_span_b_displaced > 0.763397 )
							if( tenkan_sen <= 0.831875 )
								if( chinkou_span <= 0.88535 )
									ret := 0.769231 // buy
								if( chinkou_span > 0.88535 )
									ret := 1.000000 // buy
							if( tenkan_sen > 0.831875 )
								if( chinkou_span <= 0.943994 )
									ret := 0.741071 // buy
								if( chinkou_span > 0.943994 )
									ret := 0.000000
					if( senkou_span_a_displaced > 0.86292 )
						if( basis_max <= -0.004125 )
							if( kinjun_sen <= 0.816956 )
								ret := 0.142857
							if( kinjun_sen > 0.816956 )
								if( chinkou_span <= 0.912 )
									ret := -0.500000
								if( chinkou_span > 0.912 )
									ret := -1.000000 // sell
						if( basis_max > -0.004125 )
							if( tenkan_sen <= 0.86035 )
								if( tenkan_sen <= 0.82345 )
									ret := 0.750000 // buy
								if( tenkan_sen > 0.82345 )
									ret := 1.000000 // buy
							if( tenkan_sen > 0.86035 )
								if( chinkou_span <= 0.887775 )
									ret := 0.466667
								if( chinkou_span > 0.887775 )
									ret := -0.888889 // sell
				if( senkou_span_a > 0.866706 )
					if( senkou_span_a_displaced <= 0.828884 )
						if( senkou_span_a <= 0.868995 )
							if( chinkou_span <= 0.899201 )
								ret := -1.000000 // sell
							if( chinkou_span > 0.899201 )
								if( chinkou_span <= 0.904987 )
									ret := -0.400000
								if( chinkou_span > 0.904987 )
									ret := -1.000000 // sell
						if( senkou_span_a > 0.868995 )
							ret := 0.000000
					if( senkou_span_a_displaced > 0.828884 )
						if( basis_max <= -0.00659 )
							if( tenkan_sen <= 0.891968 )
								if( chinkou_span <= 0.892254 )
									ret := 0.696970
								if( chinkou_span > 0.892254 )
									ret := 1.000000 // buy
							if( tenkan_sen > 0.891968 )
								ret := -0.666667
						if( basis_max > -0.00659 )
							if( chinkou_span <= 0.910685 )
								if( basis_max <= -0.003637 )
									ret := -0.290323
								if( basis_max > -0.003637 )
									ret := 0.166285
							if( chinkou_span > 0.910685 )
								if( senkou_span_b_displaced <= 0.855587 )
									ret := 0.000000
								if( senkou_span_b_displaced > 0.855587 )
									ret := 0.688172
		if( tenkan_sen > 0.892397 )
			if( chinkou_span <= 0.902061 )
				if( chinkou_span <= 0.864438 )
					if( senkou_span_a_displaced <= 0.980404 )
						if( basis_max <= -0.000562 )
							if( chinkou_span <= 0.857557 )
								if( tenkan_sen <= 0.945997 )
									ret := -0.966292 // sell
								if( tenkan_sen > 0.945997 )
									ret := -0.750000 // sell
							if( chinkou_span > 0.857557 )
								if( kinjun_sen <= 0.89355 )
									ret := -1.000000 // sell
								if( kinjun_sen > 0.89355 )
									ret := -0.357143
						if( basis_max > -0.000562 )
							if( senkou_span_a_displaced <= 0.8967 )
								if( senkou_span_a <= 0.89569 )
									ret := 0.250000
								if( senkou_span_a > 0.89569 )
									ret := 0.750000 // buy
							if( senkou_span_a_displaced > 0.8967 )
								if( basis_minus <= 0.005598 )
									ret := -0.821918 // sell
								if( basis_minus > 0.005598 )
									ret := -0.250000
					if( senkou_span_a_displaced > 0.980404 )
						if( basis_minus <= -0.025994 )
							ret := 0.500000
						if( basis_minus > -0.025994 )
							ret := 1.000000 // buy
				if( chinkou_span > 0.864438 )
					if( tenkan_sen <= 0.909732 )
						if( senkou_span_b <= 0.8611 )
							if( tenkan_sen <= 0.894078 )
								ret := 0.250000
							if( tenkan_sen > 0.894078 )
								ret := 1.000000 // buy
						if( senkou_span_b > 0.8611 )
							if( chinkou_span <= 0.887773 )
								if( senkou_span_b_displaced <= 0.911425 )
									ret := -0.471074
								if( senkou_span_b_displaced > 0.911425 )
									ret := 0.049180
							if( chinkou_span > 0.887773 )
								if( senkou_span_b <= 0.91726 )
									ret := -0.138223
								if( senkou_span_b > 0.91726 )
									ret := -0.617647
					if( tenkan_sen > 0.909732 )
						if( senkou_span_b <= 0.914216 )
							if( basis_max <= 0.0005 )
								if( senkou_span_b <= 0.874636 )
									ret := 0.500000
								if( senkou_span_b > 0.874636 )
									ret := -0.682081
							if( basis_max > 0.0005 )
								if( kinjun_sen <= 0.918292 )
									ret := -0.266667
								if( kinjun_sen > 0.918292 )
									ret := 1.000000 // buy
						if( senkou_span_b > 0.914216 )
							if( kinjun_sen <= 0.9223 )
								if( senkou_span_a_displaced <= 0.91994 )
									ret := 0.566667
								if( senkou_span_a_displaced > 0.91994 )
									ret := -0.342857
							if( kinjun_sen > 0.9223 )
								if( tenkan_sen <= 0.95324 )
									ret := -0.297101
								if( tenkan_sen > 0.95324 )
									ret := -0.740000 // sell
			if( chinkou_span > 0.902061 )
				if( kinjun_sen <= 0.900875 )
					if( basis_minus <= 0.049164 )
						if( chinkou_span <= 0.910129 )
							if( basis_minus <= -0.009602 )
								ret := -0.800000 // sell
							if( basis_minus > -0.009602 )
								if( senkou_span_b_displaced <= 0.89243 )
									ret := 0.346667
								if( senkou_span_b_displaced > 0.89243 )
									ret := 0.065934
						if( chinkou_span > 0.910129 )
							if( basis_minus <= 0.014663 )
								if( chinkou_span <= 0.93057 )
									ret := 0.512195
								if( chinkou_span > 0.93057 )
									ret := 0.853211 // buy
							if( basis_minus > 0.014663 )
								if( tenkan_sen <= 0.90451 )
									ret := 0.885714 // buy
								if( tenkan_sen > 0.90451 )
									ret := -0.224138
					if( basis_minus > 0.049164 )
						ret := -1.000000 // sell
				if( kinjun_sen > 0.900875 )
					if( basis_minus <= -0.016282 )
						if( tenkan_sen <= 0.984269 )
							if( kinjun_sen <= 0.967873 )
								if( senkou_span_b <= 0.958388 )
									ret := 0.517241
								if( senkou_span_b > 0.958388 )
									ret := -0.117647
							if( kinjun_sen > 0.967873 )
								if( senkou_span_b_displaced <= 1.00289 )
									ret := 0.555556
								if( senkou_span_b_displaced > 1.00289 )
									ret := 1.000000 // buy
						if( tenkan_sen > 0.984269 )
							if( basis_max <= -0.010131 )
								if( senkou_span_a_displaced <= 1.16629 )
									ret := -0.918367 // sell
								if( senkou_span_a_displaced > 1.16629 )
									ret := -0.222222
							if( basis_max > -0.010131 )
								if( chinkou_span <= 1.00171 )
									ret := -0.555556
								if( chinkou_span > 1.00171 )
									ret := -0.258228
					if( basis_minus > -0.016282 )
						if( chinkou_span <= 0.986935 )
							if( kinjun_sen <= 0.931599 )
								if( senkou_span_b_displaced <= 0.844261 )
									ret := 0.900000 // buy
								if( senkou_span_b_displaced > 0.844261 )
									ret := 0.052978
							if( kinjun_sen > 0.931599 )
								if( senkou_span_a <= 1.00171 )
									ret := -0.162837
								if( senkou_span_a > 1.00171 )
									ret := -0.564955
						if( chinkou_span > 0.986935 )
							if( senkou_span_a <= 0.993597 )
								if( senkou_span_a <= 0.975037 )
									ret := 0.619694
								if( senkou_span_a > 0.975037 )
									ret := 0.298981
							if( senkou_span_a > 0.993597 )
								if( basis_max <= -0.011887 )
									ret := -0.228723
								if( basis_max > -0.011887 )
									ret := 0.023219
	if( basis_max > 0.001491 )
		if( basis_minus <= 0.04325 )
			if( chinkou_span <= 0.855907 )
				if( tenkan_sen <= 0.842754 )
					if( chinkou_span <= 0.824009 )
						if( senkou_span_a <= 0.809046 )
							if( chinkou_span <= 0.795409 )
								if( senkou_span_a <= 0.784061 )
									ret := 0.088064
								if( senkou_span_a > 0.784061 )
									ret := -0.350719
							if( chinkou_span > 0.795409 )
								if( basis_minus <= -0.037238 )
									ret := -1.000000 // sell
								if( basis_minus > -0.037238 )
									ret := 0.420749
						if( senkou_span_a > 0.809046 )
							if( senkou_span_a <= 0.850633 )
								if( senkou_span_a_displaced <= 0.906408 )
									ret := -0.268590
								if( senkou_span_a_displaced > 0.906408 )
									ret := -1.000000 // sell
							if( senkou_span_a > 0.850633 )
								if( chinkou_span <= 0.805764 )
									ret := 1.000000 // buy
								if( chinkou_span > 0.805764 )
									ret := 0.500000
					if( chinkou_span > 0.824009 )
						if( tenkan_sen <= 0.826935 )
							if( tenkan_sen <= 0.806714 )
								if( basis_minus <= -0.010892 )
									ret := 1.000000 // buy
								if( basis_minus > -0.010892 )
									ret := 0.805195 // buy
							if( tenkan_sen > 0.806714 )
								if( kinjun_sen <= 0.827365 )
									ret := 0.228571
								if( kinjun_sen > 0.827365 )
									ret := 0.730263 // buy
						if( tenkan_sen > 0.826935 )
							if( senkou_span_b <= 0.853773 )
								if( senkou_span_b <= 0.83325 )
									ret := -0.387755
								if( senkou_span_b > 0.83325 )
									ret := 0.323810
							if( senkou_span_b > 0.853773 )
								if( senkou_span_b_displaced <= 0.875487 )
									ret := 0.133333
								if( senkou_span_b_displaced > 0.875487 )
									ret := -0.666667
				if( tenkan_sen > 0.842754 )
					if( basis_minus <= 0.0063 )
						if( senkou_span_a <= 0.856146 )
							if( senkou_span_b_displaced <= 0.867025 )
								if( basis_max <= 0.002397 )
									ret := -0.119048
								if( basis_max > 0.002397 )
									ret := -0.503067
							if( senkou_span_b_displaced > 0.867025 )
								if( chinkou_span <= 0.836936 )
									ret := -0.382353
								if( chinkou_span > 0.836936 )
									ret := 0.595745
						if( senkou_span_a > 0.856146 )
							if( basis_max <= 0.01722 )
								if( senkou_span_b_displaced <= 0.920216 )
									ret := -0.433908
								if( senkou_span_b_displaced > 0.920216 )
									ret := -0.759162 // sell
							if( basis_max > 0.01722 )
								ret := 0.857143 // buy
					if( basis_minus > 0.0063 )
						if( kinjun_sen <= 0.84998 )
							ret := -0.500000
						if( kinjun_sen > 0.84998 )
							if( senkou_span_b_displaced <= 0.81373 )
								ret := 1.000000 // buy
							if( senkou_span_b_displaced > 0.81373 )
								if( basis_minus <= 0.007696 )
									ret := 1.000000 // buy
								if( basis_minus > 0.007696 )
									ret := 0.750000 // buy
			if( chinkou_span > 0.855907 )
				if( senkou_span_b_displaced <= 0.867308 )
					if( chinkou_span <= 0.88605 )
						if( senkou_span_a <= 0.866812 )
							if( basis_max <= 0.004229 )
								if( basis_minus <= 0.023408 )
									ret := 0.550239
								if( basis_minus > 0.023408 )
									ret := -0.666667
							if( basis_max > 0.004229 )
								if( basis_minus <= -0.00675 )
									ret := 0.560000
								if( basis_minus > -0.00675 )
									ret := 0.930556 // buy
						if( senkou_span_a > 0.866812 )
							if( senkou_span_b_displaced <= 0.85175 )
								if( tenkan_sen <= 0.87495 )
									ret := -0.750000 // sell
								if( tenkan_sen > 0.87495 )
									ret := -1.000000 // sell
							if( senkou_span_b_displaced > 0.85175 )
								if( senkou_span_b <= 0.876925 )
									ret := 0.107143
								if( senkou_span_b > 0.876925 )
									ret := -0.250000
					if( chinkou_span > 0.88605 )
						if( tenkan_sen <= 0.90565 )
							if( basis_minus <= 0.015295 )
								if( basis_minus <= -0.003688 )
									ret := 0.959459 // buy
								if( basis_minus > -0.003688 )
									ret := 0.794643 // buy
							if( basis_minus > 0.015295 )
								if( senkou_span_b_displaced <= 0.861418 )
									ret := 0.727273 // buy
								if( senkou_span_b_displaced > 0.861418 )
									ret := -0.200000
						if( tenkan_sen > 0.90565 )
							ret := -0.333333
				if( senkou_span_b_displaced > 0.867308 )
					if( tenkan_sen <= 0.825034 )
						if( chinkou_span <= 0.89315 )
							ret := 1.000000 // buy
						if( chinkou_span > 0.89315 )
							if( chinkou_span <= 0.941468 )
								ret := 0.500000
							if( chinkou_span > 0.941468 )
								ret := 1.000000 // buy
					if( tenkan_sen > 0.825034 )
						if( basis_minus <= -0.022557 )
							if( chinkou_span <= 1.12073 )
								if( tenkan_sen <= 1.04742 )
									ret := 0.294118
								if( tenkan_sen > 1.04742 )
									ret := -0.360825
							if( chinkou_span > 1.12073 )
								if( senkou_span_a <= 1.42459 )
									ret := 0.576792
								if( senkou_span_a > 1.42459 )
									ret := -0.909091 // sell
						if( basis_minus > -0.022557 )
							if( basis_max <= 0.013742 )
								if( senkou_span_a <= 0.89276 )
									ret := 0.242775
								if( senkou_span_a > 0.89276 )
									ret := 0.081326
							if( basis_max > 0.013742 )
								if( senkou_span_b_displaced <= 1.04738 )
									ret := 0.902174 // buy
								if( senkou_span_b_displaced > 1.04738 )
									ret := 0.137255
		if( basis_minus > 0.04325 )
			if( kinjun_sen <= 0.9089 )
				ret := 0.166667
			if( kinjun_sen > 0.9089 )
				if( chinkou_span <= 1.146 )
					if( senkou_span_b <= 0.874889 )
						if( senkou_span_a <= 0.926321 )
							ret := 1.000000 // buy
						if( senkou_span_a > 0.926321 )
							ret := 0.750000 // buy
					if( senkou_span_b > 0.874889 )
						ret := 1.000000 // buy
				if( chinkou_span > 1.146 )
					ret := 0.666667
	
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
float op_operation = decision_tree_0_MATICUSDT_15Min_dc3e8bc9(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)

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


