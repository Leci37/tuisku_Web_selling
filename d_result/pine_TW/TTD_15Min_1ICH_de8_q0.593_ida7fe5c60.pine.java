//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: TTD_15Min_1ICH_a7fe5c60 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TTD_15Min_1ICH_a7fe5c60", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TTD_15Min_a7fe5c60(senkou_span_a_displaced, cross_dn_tenkan_kinjunInt, kinjun_sen, chinkou_span, senkou_span_b_displaced, basis_minus, senkou_span_b, senkou_span_a, cross_up_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( senkou_span_b <= 44.3441 )
		if( senkou_span_b_displaced <= 42.815 )
			if( basis_minus <= 0.376988 )
				if( tenkan_sen <= 36.3363 )
					if( senkou_span_a <= 30.7895 )
						if( senkou_span_a <= 27.33 )
							if( chinkou_span <= 26.5328 )
								if( senkou_span_b <= 26.6702 )
									ret := 0.193548
								if( senkou_span_b > 26.6702 )
									ret := -0.795918 // sell
							if( chinkou_span > 26.5328 )
								if( senkou_span_b <= 26.5375 )
									ret := 0.326531
								if( senkou_span_b > 26.5375 )
									ret := 0.833333 // buy
						if( senkou_span_a > 27.33 )
							if( chinkou_span <= 29.1408 )
								if( tenkan_sen <= 29.703 )
									ret := -0.200292
								if( tenkan_sen > 29.703 )
									ret := -0.883721 // sell
							if( chinkou_span > 29.1408 )
								if( tenkan_sen <= 29.344 )
									ret := 0.598291
								if( tenkan_sen > 29.344 )
									ret := 0.033403
					if( senkou_span_a > 30.7895 )
						if( senkou_span_b <= 34.3693 )
							if( senkou_span_a_displaced <= 30.8028 )
								ret := 0.461538
							if( senkou_span_a_displaced > 30.8028 )
								if( senkou_span_b_displaced <= 30.5754 )
									ret := 0.700000 // buy
								if( senkou_span_b_displaced > 30.5754 )
									ret := 0.980952 // buy
						if( senkou_span_b > 34.3693 )
							if( senkou_span_a_displaced <= 32.3215 )
								ret := -1.000000 // sell
							if( senkou_span_a_displaced > 32.3215 )
								if( basis_minus <= -1.14769 )
									ret := 0.114754
								if( basis_minus > -1.14769 )
									ret := 0.709443 // buy
				if( tenkan_sen > 36.3363 )
					if( chinkou_span <= 40.0948 )
						if( senkou_span_b <= 40.7293 )
							if( chinkou_span <= 37.5223 )
								if( basis_max <= -0.0875 )
									ret := 0.242424
								if( basis_max > -0.0875 )
									ret := -0.373737
							if( chinkou_span > 37.5223 )
								if( senkou_span_a_displaced <= 37.5124 )
									ret := 0.432927
								if( senkou_span_a_displaced > 37.5124 )
									ret := -0.107807
						if( senkou_span_b > 40.7293 )
							if( senkou_span_a <= 41.4939 )
								if( tenkan_sen <= 40.4525 )
									ret := -1.000000 // sell
								if( tenkan_sen > 40.4525 )
									ret := -0.878788 // sell
							if( senkou_span_a > 41.4939 )
								ret := -0.454545
					if( chinkou_span > 40.0948 )
						if( basis_max <= 0.091286 )
							if( senkou_span_b_displaced <= 41.5502 )
								if( basis_minus <= -0.3075 )
									ret := 0.366667
								if( basis_minus > -0.3075 )
									ret := 0.842105 // buy
							if( senkou_span_b_displaced > 41.5502 )
								if( senkou_span_b_displaced <= 41.6345 )
									ret := -0.600000
								if( senkou_span_b_displaced > 41.6345 )
									ret := 0.422680
						if( basis_max > 0.091286 )
							if( senkou_span_a <= 42.5591 )
								if( tenkan_sen <= 41.8799 )
									ret := 0.065217
								if( tenkan_sen > 41.8799 )
									ret := 0.800000 // buy
							if( senkou_span_a > 42.5591 )
								if( senkou_span_a_displaced <= 43.5298 )
									ret := -0.965517 // sell
								if( senkou_span_a_displaced > 43.5298 )
									ret := -0.208333
			if( basis_minus > 0.376988 )
				if( basis_max <= -0.009345 )
					if( chinkou_span <= 43.4027 )
						if( tenkan_sen <= 42.6195 )
							if( chinkou_span <= 31.705 )
								if( kinjun_sen <= 29.0972 )
									ret := 0.545455
								if( kinjun_sen > 29.0972 )
									ret := -0.668639
							if( chinkou_span > 31.705 )
								if( tenkan_sen <= 34.994 )
									ret := 0.764706 // buy
								if( tenkan_sen > 34.994 )
									ret := -0.042394
						if( tenkan_sen > 42.6195 )
							if( chinkou_span <= 43.1293 )
								if( senkou_span_a <= 43.8561 )
									ret := -0.711111 // sell
								if( senkou_span_a > 43.8561 )
									ret := -0.961538 // sell
							if( chinkou_span > 43.1293 )
								if( tenkan_sen <= 43.965 )
									ret := -0.900000 // sell
								if( tenkan_sen > 43.965 )
									ret := -0.083333
					if( chinkou_span > 43.4027 )
						if( chinkou_span <= 44.145 )
							if( basis_max <= -0.1125 )
								if( senkou_span_a <= 44.42 )
									ret := 0.258065
								if( senkou_span_a > 44.42 )
									ret := 1.000000 // buy
							if( basis_max > -0.1125 )
								if( chinkou_span <= 43.6628 )
									ret := 0.470588
								if( chinkou_span > 43.6628 )
									ret := 0.913793 // buy
						if( chinkou_span > 44.145 )
							if( senkou_span_a <= 43.2068 )
								if( basis_minus <= 0.581875 )
									ret := -0.142857
								if( basis_minus > 0.581875 )
									ret := 0.840000 // buy
							if( senkou_span_a > 43.2068 )
								if( chinkou_span <= 46.4314 )
									ret := -0.585106
								if( chinkou_span > 46.4314 )
									ret := 0.413793
				if( basis_max > -0.009345 )
					if( cross_dn_tenkan_kinjunInt <= 0.5 )
						if( tenkan_sen <= 34.6003 )
							if( tenkan_sen <= 30.0039 )
								if( basis_max <= 0.028863 )
									ret := -1.000000 // sell
								if( basis_max > 0.028863 )
									ret := -0.200000
							if( tenkan_sen > 30.0039 )
								ret := 0.750000 // buy
						if( tenkan_sen > 34.6003 )
							if( senkou_span_a_displaced <= 43.4575 )
								if( chinkou_span <= 42.9852 )
									ret := -0.841270 // sell
								if( chinkou_span > 42.9852 )
									ret := -0.470588
							if( senkou_span_a_displaced > 43.4575 )
								ret := 0.500000
					if( cross_dn_tenkan_kinjunInt > 0.5 )
						ret := 0.304348
		if( senkou_span_b_displaced > 42.815 )
			if( tenkan_sen <= 42.2577 )
				if( basis_max <= -0.186594 )
					ret := -0.142857
				if( basis_max > -0.186594 )
					if( chinkou_span <= 43.0363 )
						if( senkou_span_b <= 42.093 )
							if( senkou_span_a <= 41.6787 )
								ret := 0.250000
							if( senkou_span_a > 41.6787 )
								ret := -0.857143 // sell
						if( senkou_span_b > 42.093 )
							if( senkou_span_a_displaced <= 44.5627 )
								if( senkou_span_a <= 42.1643 )
									ret := 0.707547 // buy
								if( senkou_span_a > 42.1643 )
									ret := -0.117647
							if( senkou_span_a_displaced > 44.5627 )
								if( senkou_span_a <= 41.5372 )
									ret := 0.785714 // buy
								if( senkou_span_a > 41.5372 )
									ret := 0.983051 // buy
					if( chinkou_span > 43.0363 )
						if( tenkan_sen <= 40.0175 )
							ret := 0.000000
						if( tenkan_sen > 40.0175 )
							if( senkou_span_b <= 44.2059 )
								if( basis_max <= 0.051375 )
									ret := 1.000000 // buy
								if( basis_max > 0.051375 )
									ret := 0.862069 // buy
							if( senkou_span_b > 44.2059 )
								ret := 0.600000
			if( tenkan_sen > 42.2577 )
				if( tenkan_sen <= 43.2158 )
					if( senkou_span_a_displaced <= 43.2726 )
						if( basis_max <= 0.090363 )
							if( tenkan_sen <= 42.3162 )
								ret := -0.545455
							if( tenkan_sen > 42.3162 )
								if( senkou_span_b_displaced <= 43.2825 )
									ret := -0.125000
								if( senkou_span_b_displaced > 43.2825 )
									ret := 0.519608
						if( basis_max > 0.090363 )
							if( basis_minus <= -0.61125 )
								ret := -1.000000 // sell
							if( basis_minus > -0.61125 )
								ret := 0.090909
					if( senkou_span_a_displaced > 43.2726 )
						if( chinkou_span <= 41.4717 )
							if( senkou_span_a_displaced <= 44.0869 )
								ret := 0.000000
							if( senkou_span_a_displaced > 44.0869 )
								ret := 0.571429
						if( chinkou_span > 41.4717 )
							if( senkou_span_b <= 42.8755 )
								ret := 0.600000
							if( senkou_span_b > 42.8755 )
								if( tenkan_sen <= 42.585 )
									ret := 0.240000
								if( tenkan_sen > 42.585 )
									ret := -0.585000
				if( tenkan_sen > 43.2158 )
					if( chinkou_span <= 45.5265 )
						if( basis_minus <= -0.598583 )
							if( senkou_span_a <= 43.3236 )
								ret := -0.647059
							if( senkou_span_a > 43.3236 )
								if( kinjun_sen <= 43.6726 )
									ret := 0.927536 // buy
								if( kinjun_sen > 43.6726 )
									ret := 0.272727
						if( basis_minus > -0.598583 )
							if( senkou_span_b_displaced <= 45.2501 )
								if( kinjun_sen <= 43.7744 )
									ret := -0.335227
								if( kinjun_sen > 43.7744 )
									ret := 0.069652
							if( senkou_span_b_displaced > 45.2501 )
								if( senkou_span_b_displaced <= 45.8662 )
									ret := 0.954545 // buy
								if( senkou_span_b_displaced > 45.8662 )
									ret := 0.444444
					if( chinkou_span > 45.5265 )
						if( kinjun_sen <= 44.2958 )
							if( basis_max <= -0.230532 )
								if( senkou_span_b_displaced <= 43.3958 )
									ret := 1.000000 // buy
								if( senkou_span_b_displaced > 43.3958 )
									ret := 0.612903
							if( basis_max > -0.230532 )
								if( chinkou_span <= 46.3756 )
									ret := 0.981651 // buy
								if( chinkou_span > 46.3756 )
									ret := 0.877551 // buy
						if( kinjun_sen > 44.2958 )
							if( senkou_span_a_displaced <= 41.8352 )
								if( senkou_span_a <= 46.0747 )
									ret := -0.176471
								if( senkou_span_a > 46.0747 )
									ret := -0.894737 // sell
							if( senkou_span_a_displaced > 41.8352 )
								if( chinkou_span <= 46.3982 )
									ret := 0.140000
								if( chinkou_span > 46.3982 )
									ret := 0.839623 // buy
	if( senkou_span_b > 44.3441 )
		if( chinkou_span <= 47.9367 )
			if( kinjun_sen <= 47.2723 )
				if( kinjun_sen <= 45.8288 )
					if( kinjun_sen <= 45.0337 )
						if( basis_max <= -0.516954 )
							ret := -0.979167 // sell
						if( basis_max > -0.516954 )
							if( chinkou_span <= 44.849 )
								if( tenkan_sen <= 44.8635 )
									ret := -0.129784
								if( tenkan_sen > 44.8635 )
									ret := -0.614035
							if( chinkou_span > 44.849 )
								if( senkou_span_a_displaced <= 43.3999 )
									ret := -0.800000 // sell
								if( senkou_span_a_displaced > 43.3999 )
									ret := 0.447368
					if( kinjun_sen > 45.0337 )
						if( chinkou_span <= 45.4568 )
							if( tenkan_sen <= 43.9151 )
								if( tenkan_sen <= 43.7539 )
									ret := 0.500000
								if( tenkan_sen > 43.7539 )
									ret := 0.866667 // buy
							if( tenkan_sen > 43.9151 )
								if( basis_max <= -0.326952 )
									ret := 0.142857
								if( basis_max > -0.326952 )
									ret := -0.660173
						if( chinkou_span > 45.4568 )
							if( senkou_span_b_displaced <= 44.3445 )
								if( senkou_span_a_displaced <= 43.8733 )
									ret := -0.850000 // sell
								if( senkou_span_a_displaced > 43.8733 )
									ret := -0.050000
							if( senkou_span_b_displaced > 44.3445 )
								if( tenkan_sen <= 46.6938 )
									ret := 0.407035
								if( tenkan_sen > 46.6938 )
									ret := -0.764706 // sell
				if( kinjun_sen > 45.8288 )
					if( basis_max <= 0.171228 )
						if( senkou_span_b_displaced <= 46.7251 )
							if( senkou_span_b_displaced <= 45.745 )
								if( senkou_span_a <= 47.2063 )
									ret := -0.261261
								if( senkou_span_a > 47.2063 )
									ret := 0.846154 // buy
							if( senkou_span_b_displaced > 45.745 )
								if( kinjun_sen <= 46.5678 )
									ret := -0.042424
								if( kinjun_sen > 46.5678 )
									ret := 0.320690
						if( senkou_span_b_displaced > 46.7251 )
							if( senkou_span_a_displaced <= 48.5277 )
								if( chinkou_span <= 46.7452 )
									ret := -0.616667
								if( chinkou_span > 46.7452 )
									ret := 0.034091
							if( senkou_span_a_displaced > 48.5277 )
								ret := 0.666667
					if( basis_max > 0.171228 )
						if( kinjun_sen <= 46.8842 )
							if( basis_max <= 0.590501 )
								if( basis_minus <= -0.597919 )
									ret := 0.922414 // buy
								if( basis_minus > -0.597919 )
									ret := 0.292929
							if( basis_max > 0.590501 )
								ret := -0.500000
						if( kinjun_sen > 46.8842 )
							if( senkou_span_b_displaced <= 47.2746 )
								ret := -1.000000 // sell
							if( senkou_span_b_displaced > 47.2746 )
								if( senkou_span_a <= 46.8218 )
									ret := -0.023810
								if( senkou_span_a > 46.8218 )
									ret := -0.705882 // sell
			if( kinjun_sen > 47.2723 )
				if( senkou_span_b_displaced <= 45.6746 )
					ret := 0.727273 // buy
				if( senkou_span_b_displaced > 45.6746 )
					if( chinkou_span <= 42.2949 )
						ret := 0.777778 // buy
					if( chinkou_span > 42.2949 )
						if( senkou_span_a <= 46.7852 )
							ret := 0.777778 // buy
						if( senkou_span_a > 46.7852 )
							if( senkou_span_a <= 49.295 )
								if( basis_max <= 0.005046 )
									ret := -0.723312 // sell
								if( basis_max > 0.005046 )
									ret := -0.422069
							if( senkou_span_a > 49.295 )
								if( basis_minus <= -0.423132 )
									ret := -0.653179
								if( basis_minus > -0.423132 )
									ret := -0.796117 // sell
		if( chinkou_span > 47.9367 )
			if( kinjun_sen <= 49.0608 )
				if( senkou_span_a_displaced <= 45.1005 )
					if( senkou_span_a <= 47.0209 )
						if( basis_max <= -0.147223 )
							if( basis_minus <= 0.786315 )
								ret := 0.000000
							if( basis_minus > 0.786315 )
								if( senkou_span_b_displaced <= 43.705 )
									ret := -0.666667
								if( senkou_span_b_displaced > 43.705 )
									ret := -0.886792 // sell
						if( basis_max > -0.147223 )
							if( senkou_span_b_displaced <= 44.4993 )
								ret := -0.150000
							if( senkou_span_b_displaced > 44.4993 )
								ret := 0.500000
					if( senkou_span_a > 47.0209 )
						if( senkou_span_a_displaced <= 44.0731 )
							ret := -0.818182 // sell
						if( senkou_span_a_displaced > 44.0731 )
							if( senkou_span_b_displaced <= 43.8827 )
								ret := -0.230769
							if( senkou_span_b_displaced > 43.8827 )
								if( basis_max <= 0.019445 )
									ret := 0.500000
								if( basis_max > 0.019445 )
									ret := 1.000000 // buy
				if( senkou_span_a_displaced > 45.1005 )
					if( kinjun_sen <= 46.8065 )
						if( senkou_span_a <= 45.9891 )
							if( senkou_span_a_displaced <= 45.5444 )
								ret := -0.888889 // sell
							if( senkou_span_a_displaced > 45.5444 )
								if( tenkan_sen <= 45.8779 )
									ret := 0.900000 // buy
								if( tenkan_sen > 45.8779 )
									ret := -0.454545
						if( senkou_span_a > 45.9891 )
							if( senkou_span_a <= 46.6291 )
								if( senkou_span_b_displaced <= 46.255 )
									ret := 0.977778 // buy
								if( senkou_span_b_displaced > 46.255 )
									ret := 0.771186 // buy
							if( senkou_span_a > 46.6291 )
								if( basis_max <= -0.158433 )
									ret := 0.860465 // buy
								if( basis_max > -0.158433 )
									ret := -0.333333
					if( kinjun_sen > 46.8065 )
						if( chinkou_span <= 50.3019 )
							if( senkou_span_a_displaced <= 46.1004 )
								if( senkou_span_a <= 48.3802 )
									ret := -0.118110
								if( senkou_span_a > 48.3802 )
									ret := -0.853659 // sell
							if( senkou_span_a_displaced > 46.1004 )
								if( senkou_span_a <= 48.0554 )
									ret := 0.456876
								if( senkou_span_a > 48.0554 )
									ret := 0.084733
						if( chinkou_span > 50.3019 )
							if( basis_max <= -0.105 )
								if( chinkou_span <= 53.611 )
									ret := 0.241379
								if( chinkou_span > 53.611 )
									ret := 1.000000 // buy
							if( basis_max > -0.105 )
								if( kinjun_sen <= 48.8906 )
									ret := 0.918182 // buy
								if( kinjun_sen > 48.8906 )
									ret := 0.529412
			if( kinjun_sen > 49.0608 )
				if( senkou_span_a <= 49.0549 )
					if( senkou_span_b <= 48.4769 )
						ret := 1.000000 // buy
					if( senkou_span_b > 48.4769 )
						if( tenkan_sen <= 48.8457 )
							if( senkou_span_a <= 48.9252 )
								if( senkou_span_b_displaced <= 49.372 )
									ret := 0.280000
								if( senkou_span_b_displaced > 49.372 )
									ret := 0.629630
							if( senkou_span_a > 48.9252 )
								if( senkou_span_a <= 49.0103 )
									ret := 0.809524 // buy
								if( senkou_span_a > 49.0103 )
									ret := 0.285714
						if( tenkan_sen > 48.8457 )
							ret := -0.090909
				if( senkou_span_a > 49.0549 )
					if( senkou_span_a_displaced <= 87.05 )
						if( chinkou_span <= 50.6918 )
							if( kinjun_sen <= 50.2651 )
								if( basis_minus <= -1.30135 )
									ret := 0.681818
								if( basis_minus > -1.30135 )
									ret := -0.182601
							if( kinjun_sen > 50.2651 )
								if( senkou_span_b <= 49.795 )
									ret := 0.800000 // buy
								if( senkou_span_b > 49.795 )
									ret := -0.485021
						if( chinkou_span > 50.6918 )
							if( senkou_span_a <= 52.0938 )
								if( kinjun_sen <= 49.2249 )
									ret := -0.292135
								if( kinjun_sen > 49.2249 )
									ret := 0.379143
							if( senkou_span_a > 52.0938 )
								if( basis_minus <= -2.89011 )
									ret := 0.378788
								if( basis_minus > -2.89011 )
									ret := -0.032831
					if( senkou_span_a_displaced > 87.05 )
						if( tenkan_sen <= 84.2765 )
							if( senkou_span_b <= 326.123 )
								if( chinkou_span <= 83.1564 )
									ret := 0.132075
								if( chinkou_span > 83.1564 )
									ret := 0.697368
							if( senkou_span_b > 326.123 )
								if( tenkan_sen <= 59.0987 )
									ret := 0.777778 // buy
								if( tenkan_sen > 59.0987 )
									ret := 0.900000 // buy
						if( tenkan_sen > 84.2765 )
							if( kinjun_sen <= 948.118 )
								if( kinjun_sen <= 615.08 )
									ret := 0.024756
								if( kinjun_sen > 615.08 )
									ret := -0.037376
							if( kinjun_sen > 948.118 )
								if( senkou_span_b <= 949.7 )
									ret := -0.250000
								if( senkou_span_b > 949.7 )
									ret := -0.811321 // sell
	
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
float op_operation = decision_tree_0_TTD_15Min_a7fe5c60(senkou_span_a_displaced, cross_dn_tenkan_kinjunInt, kinjun_sen, chinkou_span, senkou_span_b_displaced, basis_minus, senkou_span_b, senkou_span_a, cross_up_tenkan_kinjunInt, tenkan_sen, basis_max)

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


