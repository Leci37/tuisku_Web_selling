//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: MATICUSDT_5Min_1ICH_031463b9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MATICUSDT_5Min_1ICH_031463b9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MATICUSDT_5Min_031463b9(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( chinkou_span <= 0.909189 )
		if( kinjun_sen <= 0.903473 )
			if( senkou_span_a <= 0.886199 )
				if( basis_minus <= -0.003734 )
					if( senkou_span_b <= 0.874447 )
						if( tenkan_sen <= 0.854108 )
							if( senkou_span_b_displaced <= 0.392158 )
								if( chinkou_span <= 0.362148 )
									ret := -0.625000
								if( chinkou_span > 0.362148 )
									ret := 0.596059
							if( senkou_span_b_displaced > 0.392158 )
								if( kinjun_sen <= 0.51735 )
									ret := -0.086957
								if( kinjun_sen > 0.51735 )
									ret := 0.077570
						if( tenkan_sen > 0.854108 )
							if( senkou_span_b <= 0.870646 )
								if( tenkan_sen <= 0.857672 )
									ret := -0.222222
								if( tenkan_sen > 0.857672 )
									ret := -0.720238 // sell
							if( senkou_span_b > 0.870646 )
								if( basis_max <= -0.000308 )
									ret := -1.000000 // sell
								if( basis_max > -0.000308 )
									ret := 0.179487
					if( senkou_span_b > 0.874447 )
						if( cross_up_tenkan_kinjunInt <= 0.5 )
							if( kinjun_sen <= 0.867286 )
								if( senkou_span_a <= 0.862913 )
									ret := 1.000000 // buy
								if( senkou_span_a > 0.862913 )
									ret := 0.111111
							if( kinjun_sen > 0.867286 )
								if( basis_max <= -0.000184 )
									ret := -0.123894
								if( basis_max > -0.000184 )
									ret := 0.360390
						if( cross_up_tenkan_kinjunInt > 0.5 )
							if( kinjun_sen <= 0.879808 )
								ret := -0.846154 // sell
							if( kinjun_sen > 0.879808 )
								ret := -0.714286 // sell
				if( basis_minus > -0.003734 )
					if( senkou_span_a_displaced <= 0.896014 )
						if( senkou_span_a_displaced <= 0.357338 )
							if( chinkou_span <= 0.365958 )
								ret := -0.222222
							if( chinkou_span > 0.365958 )
								if( basis_minus <= 0.006803 )
									ret := 0.660714
								if( basis_minus > 0.006803 )
									ret := 1.000000 // buy
						if( senkou_span_a_displaced > 0.357338 )
							if( chinkou_span <= 0.882742 )
								if( tenkan_sen <= 0.877775 )
									ret := -0.008732
								if( tenkan_sen > 0.877775 )
									ret := -0.402509
							if( chinkou_span > 0.882742 )
								if( basis_minus <= 0.005029 )
									ret := 0.530558
								if( basis_minus > 0.005029 )
									ret := -0.087719
					if( senkou_span_a_displaced > 0.896014 )
						if( senkou_span_a_displaced <= 0.8968 )
							ret := -1.000000 // sell
						if( senkou_span_a_displaced > 0.8968 )
							if( basis_minus <= -3e-06 )
								if( basis_max <= -0.007305 )
									ret := -0.928571 // sell
								if( basis_max > -0.007305 )
									ret := -0.571429
							if( basis_minus > -3e-06 )
								ret := -1.000000 // sell
			if( senkou_span_a > 0.886199 )
				if( senkou_span_b <= 0.906125 )
					if( senkou_span_a_displaced <= 0.894725 )
						if( basis_minus <= 0.021829 )
							if( kinjun_sen <= 0.892325 )
								if( tenkan_sen <= 0.886939 )
									ret := -0.539267
								if( tenkan_sen > 0.886939 )
									ret := -0.054147
							if( kinjun_sen > 0.892325 )
								if( chinkou_span <= 0.884609 )
									ret := -0.893082 // sell
								if( chinkou_span > 0.884609 )
									ret := -0.266910
						if( basis_minus > 0.021829 )
							if( basis_minus <= 0.023207 )
								ret := 0.900000 // buy
							if( basis_minus > 0.023207 )
								ret := 1.000000 // buy
					if( senkou_span_a_displaced > 0.894725 )
						if( chinkou_span <= 0.894851 )
							if( tenkan_sen <= 0.894911 )
								if( tenkan_sen <= 0.88807 )
									ret := -0.534483
								if( tenkan_sen > 0.88807 )
									ret := -0.053957
							if( tenkan_sen > 0.894911 )
								if( senkou_span_a <= 0.899851 )
									ret := -0.752688 // sell
								if( senkou_span_a > 0.899851 )
									ret := -0.141509
						if( chinkou_span > 0.894851 )
							if( senkou_span_a_displaced <= 0.906082 )
								if( senkou_span_a_displaced <= 0.905843 )
									ret := 0.232221
								if( senkou_span_a_displaced > 0.905843 )
									ret := -0.833333 // sell
							if( senkou_span_a_displaced > 0.906082 )
								if( kinjun_sen <= 0.900261 )
									ret := 0.890909 // buy
								if( kinjun_sen > 0.900261 )
									ret := 0.111111
				if( senkou_span_b > 0.906125 )
					if( senkou_span_b_displaced <= 0.918237 )
						if( chinkou_span <= 0.89556 )
							if( tenkan_sen <= 0.900884 )
								if( senkou_span_a_displaced <= 0.907463 )
									ret := -1.000000 // sell
								if( senkou_span_a_displaced > 0.907463 )
									ret := -0.907895 // sell
							if( tenkan_sen > 0.900884 )
								ret := -0.777778 // sell
						if( chinkou_span > 0.89556 )
							if( tenkan_sen <= 0.897156 )
								ret := 0.300000
							if( tenkan_sen > 0.897156 )
								ret := 0.647059
					if( senkou_span_b_displaced > 0.918237 )
						if( basis_minus <= -0.010375 )
							if( chinkou_span <= 0.893693 )
								ret := -0.555556
							if( chinkou_span > 0.893693 )
								if( kinjun_sen <= 0.902061 )
									ret := 0.294118
								if( kinjun_sen > 0.902061 )
									ret := 0.760000 // buy
						if( basis_minus > -0.010375 )
							ret := -0.230769
		if( kinjun_sen > 0.903473 )
			if( senkou_span_a <= 0.91748 )
				if( senkou_span_a_displaced <= 0.925285 )
					if( tenkan_sen <= 0.903575 )
						if( basis_minus <= -0.006275 )
							if( senkou_span_b_displaced <= 0.897475 )
								ret := 0.800000 // buy
							if( senkou_span_b_displaced > 0.897475 )
								if( tenkan_sen <= 0.898017 )
									ret := -0.472222
								if( tenkan_sen > 0.898017 )
									ret := -0.826923 // sell
						if( basis_minus > -0.006275 )
							if( senkou_span_b <= 0.909201 )
								if( chinkou_span <= 0.901783 )
									ret := -0.666667
								if( chinkou_span > 0.901783 )
									ret := 0.031250
							if( senkou_span_b > 0.909201 )
								if( basis_max <= 0.002524 )
									ret := 0.866667 // buy
								if( basis_max > 0.002524 )
									ret := 1.000000 // buy
					if( tenkan_sen > 0.903575 )
						if( cross_up_tenkan_kinjunInt <= 0.5 )
							if( kinjun_sen <= 0.90496 )
								if( chinkou_span <= 0.898263 )
									ret := -0.902439 // sell
								if( chinkou_span > 0.898263 )
									ret := 0.000000
							if( kinjun_sen > 0.90496 )
								if( chinkou_span <= 0.907258 )
									ret := -0.768202 // sell
								if( chinkou_span > 0.907258 )
									ret := -0.129870
						if( cross_up_tenkan_kinjunInt > 0.5 )
							ret := 0.428571
				if( senkou_span_a_displaced > 0.925285 )
					if( kinjun_sen <= 0.909376 )
						if( tenkan_sen <= 0.908375 )
							if( senkou_span_b_displaced <= 0.93475 )
								ret := -0.200000
							if( senkou_span_b_displaced > 0.93475 )
								ret := -0.619048
						if( tenkan_sen > 0.908375 )
							ret := -1.000000 // sell
					if( kinjun_sen > 0.909376 )
						if( senkou_span_b <= 0.918961 )
							ret := -1.000000 // sell
						if( senkou_span_b > 0.918961 )
							if( tenkan_sen <= 0.908925 )
								if( senkou_span_b_displaced <= 0.936221 )
									ret := -0.848485 // sell
								if( senkou_span_b_displaced > 0.936221 )
									ret := 0.704545 // buy
							if( tenkan_sen > 0.908925 )
								if( chinkou_span <= 0.89445 )
									ret := 0.294118
								if( chinkou_span > 0.89445 )
									ret := 1.000000 // buy
			if( senkou_span_a > 0.91748 )
				if( basis_minus <= 0.004225 )
					if( chinkou_span <= 0.860375 )
						ret := 0.000000
					if( chinkou_span > 0.860375 )
						if( basis_minus <= -0.011839 )
							ret := -0.250000
						if( basis_minus > -0.011839 )
							if( kinjun_sen <= 0.924825 )
								if( kinjun_sen <= 0.920191 )
									ret := -0.900000 // sell
								if( kinjun_sen > 0.920191 )
									ret := -0.551724
							if( kinjun_sen > 0.924825 )
								if( kinjun_sen <= 0.929784 )
									ret := -0.987952 // sell
								if( kinjun_sen > 0.929784 )
									ret := -0.902439 // sell
				if( basis_minus > 0.004225 )
					if( chinkou_span <= 0.907909 )
						if( kinjun_sen <= 0.932133 )
							if( senkou_span_b <= 0.9174 )
								if( senkou_span_a <= 0.923132 )
									ret := -0.818182 // sell
								if( senkou_span_a > 0.923132 )
									ret := -1.000000 // sell
							if( senkou_span_b > 0.9174 )
								if( basis_max <= -0.001062 )
									ret := -0.444444
								if( basis_max > -0.001062 )
									ret := 0.285714
						if( kinjun_sen > 0.932133 )
							ret := -1.000000 // sell
					if( chinkou_span > 0.907909 )
						if( senkou_span_a <= 0.930347 )
							ret := -0.681818
						if( senkou_span_a > 0.930347 )
							ret := 0.785714 // buy
	if( chinkou_span > 0.909189 )
		if( senkou_span_a <= 0.921987 )
			if( senkou_span_b_displaced <= 0.88405 )
				if( kinjun_sen <= 0.910175 )
					if( senkou_span_b <= 0.897315 )
						if( basis_minus <= 0.020188 )
							if( kinjun_sen <= 0.89431 )
								if( senkou_span_a_displaced <= 0.845925 )
									ret := -0.294118
								if( senkou_span_a_displaced > 0.845925 )
									ret := 0.582677
							if( kinjun_sen > 0.89431 )
								if( basis_max <= -0.000209 )
									ret := 0.466667
								if( basis_max > -0.000209 )
									ret := -0.621622
						if( basis_minus > 0.020188 )
							ret := -0.777778 // sell
					if( senkou_span_b > 0.897315 )
						if( kinjun_sen <= 0.907974 )
							ret := 1.000000 // buy
						if( kinjun_sen > 0.907974 )
							ret := 0.818182 // buy
				if( kinjun_sen > 0.910175 )
					if( senkou_span_a <= 0.914971 )
						if( basis_minus <= 0.01441 )
							ret := -0.857143 // sell
						if( basis_minus > 0.01441 )
							ret := -1.000000 // sell
					if( senkou_span_a > 0.914971 )
						ret := -0.458333
			if( senkou_span_b_displaced > 0.88405 )
				if( kinjun_sen <= 0.903175 )
					if( senkou_span_a <= 0.882875 )
						ret := -0.294118
					if( senkou_span_a > 0.882875 )
						if( chinkou_span <= 0.932492 )
							if( tenkan_sen <= 0.894448 )
								if( basis_minus <= -0.001638 )
									ret := 0.978723 // buy
								if( basis_minus > -0.001638 )
									ret := 0.882353 // buy
							if( tenkan_sen > 0.894448 )
								if( senkou_span_a_displaced <= 0.906432 )
									ret := 0.657143
								if( senkou_span_a_displaced > 0.906432 )
									ret := 0.218750
						if( chinkou_span > 0.932492 )
							ret := 1.000000 // buy
				if( kinjun_sen > 0.903175 )
					if( chinkou_span <= 0.922618 )
						if( senkou_span_a_displaced <= 0.902447 )
							if( kinjun_sen <= 0.912232 )
								if( senkou_span_b <= 0.9012 )
									ret := -0.553571
								if( senkou_span_b > 0.9012 )
									ret := 0.305085
							if( kinjun_sen > 0.912232 )
								ret := -0.947368 // sell
						if( senkou_span_a_displaced > 0.902447 )
							if( senkou_span_a_displaced <= 0.922494 )
								if( kinjun_sen <= 0.912672 )
									ret := 0.493939
								if( kinjun_sen > 0.912672 )
									ret := 0.145729
							if( senkou_span_a_displaced > 0.922494 )
								if( basis_minus <= -0.005378 )
									ret := 0.268041
								if( basis_minus > -0.005378 )
									ret := -0.660377
					if( chinkou_span > 0.922618 )
						if( senkou_span_a <= 0.91911 )
							if( senkou_span_a <= 0.915611 )
								if( senkou_span_b <= 0.901081 )
									ret := 0.577778
								if( senkou_span_b > 0.901081 )
									ret := 0.845324 // buy
							if( senkou_span_a > 0.915611 )
								if( senkou_span_a <= 0.918153 )
									ret := 0.258065
								if( senkou_span_a > 0.918153 )
									ret := 0.719298 // buy
						if( senkou_span_a > 0.91911 )
							if( basis_minus <= 0.005269 )
								if( tenkan_sen <= 0.92152 )
									ret := 0.864000 // buy
								if( tenkan_sen > 0.92152 )
									ret := 0.644444
							if( basis_minus > 0.005269 )
								if( chinkou_span <= 0.93451 )
									ret := 0.869565 // buy
								if( chinkou_span > 0.93451 )
									ret := 1.000000 // buy
		if( senkou_span_a > 0.921987 )
			if( chinkou_span <= 0.932828 )
				if( tenkan_sen <= 0.931057 )
					if( basis_max <= 0.00193 )
						if( senkou_span_b_displaced <= 0.943605 )
							if( senkou_span_a_displaced <= 0.927089 )
								if( kinjun_sen <= 0.925706 )
									ret := -0.064815
								if( kinjun_sen > 0.925706 )
									ret := 0.415730
							if( senkou_span_a_displaced > 0.927089 )
								if( kinjun_sen <= 0.927369 )
									ret := -0.264706
								if( kinjun_sen > 0.927369 )
									ret := -0.872727 // sell
						if( senkou_span_b_displaced > 0.943605 )
							if( senkou_span_a_displaced <= 0.942937 )
								ret := 1.000000 // buy
							if( senkou_span_a_displaced > 0.942937 )
								ret := 0.250000
					if( basis_max > 0.00193 )
						if( basis_max <= 0.00504 )
							if( basis_minus <= -0.00555 )
								ret := 0.473684
							if( basis_minus > -0.00555 )
								if( kinjun_sen <= 0.925485 )
									ret := -0.545455
								if( kinjun_sen > 0.925485 )
									ret := -0.834586 // sell
						if( basis_max > 0.00504 )
							if( basis_minus <= -0.013638 )
								ret := 1.000000 // buy
							if( basis_minus > -0.013638 )
								ret := 0.875000 // buy
				if( tenkan_sen > 0.931057 )
					if( basis_minus <= 0.011652 )
						if( senkou_span_b <= 0.946944 )
							if( basis_minus <= 0.00519 )
								if( senkou_span_b_displaced <= 0.940769 )
									ret := -0.953846 // sell
								if( senkou_span_b_displaced > 0.940769 )
									ret := -0.548571
							if( basis_minus > 0.00519 )
								if( tenkan_sen <= 0.939154 )
									ret := -0.780702 // sell
								if( tenkan_sen > 0.939154 )
									ret := -0.259542
						if( senkou_span_b > 0.946944 )
							if( senkou_span_a_displaced <= 0.968488 )
								if( basis_max <= -0.001198 )
									ret := -0.833333 // sell
								if( basis_max > -0.001198 )
									ret := 0.300000
							if( senkou_span_a_displaced > 0.968488 )
								if( basis_max <= 0.001075 )
									ret := -1.000000 // sell
								if( basis_max > 0.001075 )
									ret := -0.826087 // sell
					if( basis_minus > 0.011652 )
						if( senkou_span_a_displaced <= 0.935913 )
							if( senkou_span_a <= 0.945139 )
								if( senkou_span_a_displaced <= 0.929429 )
									ret := 0.900000 // buy
								if( senkou_span_a_displaced > 0.929429 )
									ret := 0.454545
							if( senkou_span_a > 0.945139 )
								ret := 1.000000 // buy
						if( senkou_span_a_displaced > 0.935913 )
							ret := -1.000000 // sell
			if( chinkou_span > 0.932828 )
				if( kinjun_sen <= 0.942248 )
					if( basis_max <= -0.009455 )
						if( chinkou_span <= 0.96095 )
							ret := -1.000000 // sell
						if( chinkou_span > 0.96095 )
							ret := 0.909091 // buy
					if( basis_max > -0.009455 )
						if( senkou_span_a_displaced <= 0.949303 )
							if( senkou_span_a_displaced <= 0.933562 )
								if( tenkan_sen <= 0.946975 )
									ret := 0.550063
								if( tenkan_sen > 0.946975 )
									ret := -0.111111
							if( senkou_span_a_displaced > 0.933562 )
								if( senkou_span_b_displaced <= 0.928033 )
									ret := -0.705882 // sell
								if( senkou_span_b_displaced > 0.928033 )
									ret := 0.225806
						if( senkou_span_a_displaced > 0.949303 )
							if( basis_minus <= -0.005186 )
								if( basis_max <= 0.00208 )
									ret := 0.769231 // buy
								if( basis_max > 0.00208 )
									ret := 0.990476 // buy
							if( basis_minus > -0.005186 )
								if( kinjun_sen <= 0.93679 )
									ret := 0.352941
								if( kinjun_sen > 0.93679 )
									ret := -0.500000
				if( kinjun_sen > 0.942248 )
					if( basis_max <= 0.000403 )
						if( senkou_span_a <= 0.990301 )
							if( chinkou_span <= 0.96854 )
								if( senkou_span_a_displaced <= 0.98534 )
									ret := -0.324121
								if( senkou_span_a_displaced > 0.98534 )
									ret := -0.986486 // sell
							if( chinkou_span > 0.96854 )
								if( senkou_span_a <= 0.9639 )
									ret := 0.761905 // buy
								if( senkou_span_a > 0.9639 )
									ret := 0.175217
						if( senkou_span_a > 0.990301 )
							if( chinkou_span <= 0.992386 )
								if( senkou_span_b <= 0.98263 )
									ret := 0.703704 // buy
								if( senkou_span_b > 0.98263 )
									ret := -0.633257
							if( chinkou_span > 0.992386 )
								if( senkou_span_b <= 1.0426 )
									ret := 0.062656
								if( senkou_span_b > 1.0426 )
									ret := -0.114614
					if( basis_max > 0.000403 )
						if( senkou_span_a_displaced <= 0.950872 )
							if( senkou_span_b <= 0.944592 )
								if( tenkan_sen <= 0.940215 )
									ret := -0.500000
								if( tenkan_sen > 0.940215 )
									ret := 0.571429
							if( senkou_span_b > 0.944592 )
								if( senkou_span_a_displaced <= 0.949498 )
									ret := -0.913043 // sell
								if( senkou_span_a_displaced > 0.949498 )
									ret := -0.450000
						if( senkou_span_a_displaced > 0.950872 )
							if( tenkan_sen <= 0.992195 )
								if( basis_max <= 0.004863 )
									ret := 0.173668
								if( basis_max > 0.004863 )
									ret := 0.501466
							if( tenkan_sen > 0.992195 )
								if( basis_minus <= 0.013334 )
									ret := 0.032848
								if( basis_minus > 0.013334 )
									ret := 0.835616 // buy
	
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
float op_operation = decision_tree_0_MATICUSDT_5Min_031463b9(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)

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


