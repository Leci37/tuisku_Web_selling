//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: PYPL_15Min_1ICH_dbf0abe5 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PYPL_15Min_1ICH_dbf0abe5", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PYPL_15Min_dbf0abe5(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( chinkou_span <= 110.627 )
		if( kinjun_sen <= 108.953 )
			if( chinkou_span <= 106.891 )
				if( senkou_span_a <= 103.119 )
					if( chinkou_span <= 102.648 )
						if( kinjun_sen <= 96.9218 )
							if( kinjun_sen <= 96.3942 )
								if( chinkou_span <= 92.5015 )
									ret := 0.039184
								if( chinkou_span > 92.5015 )
									ret := 0.206160
							if( kinjun_sen > 96.3942 )
								if( chinkou_span <= 97.2624 )
									ret := 0.072072
								if( chinkou_span > 97.2624 )
									ret := 0.673171
						if( kinjun_sen > 96.9218 )
							if( chinkou_span <= 97.7475 )
								if( tenkan_sen <= 98.5662 )
									ret := -0.190104
								if( tenkan_sen > 98.5662 )
									ret := -0.590000
							if( chinkou_span > 97.7475 )
								if( senkou_span_b <= 99.6239 )
									ret := 0.254237
								if( senkou_span_b > 99.6239 )
									ret := -0.067043
					if( chinkou_span > 102.648 )
						if( tenkan_sen <= 103.197 )
							if( kinjun_sen <= 97.2092 )
								if( senkou_span_b <= 97.3053 )
									ret := 1.000000 // buy
								if( senkou_span_b > 97.3053 )
									ret := -0.642857
							if( kinjun_sen > 97.2092 )
								if( senkou_span_a <= 98.8293 )
									ret := 0.953488 // buy
								if( senkou_span_a > 98.8293 )
									ret := 0.488290
						if( tenkan_sen > 103.197 )
							if( chinkou_span <= 103.495 )
								if( kinjun_sen <= 102.443 )
									ret := -0.933333 // sell
								if( kinjun_sen > 102.443 )
									ret := 0.000000
							if( chinkou_span > 103.495 )
								if( basis_max <= -2.1381 )
									ret := -0.600000
								if( basis_max > -2.1381 )
									ret := 0.250000
				if( senkou_span_a > 103.119 )
					if( chinkou_span <= 103.058 )
						if( senkou_span_b_displaced <= 104.346 )
							if( kinjun_sen <= 104.451 )
								if( senkou_span_b_displaced <= 102.502 )
									ret := -0.781609 // sell
								if( senkou_span_b_displaced > 102.502 )
									ret := -0.507853
							if( kinjun_sen > 104.451 )
								if( senkou_span_a_displaced <= 105.016 )
									ret := -0.969697 // sell
								if( senkou_span_a_displaced > 105.016 )
									ret := -0.500000
						if( senkou_span_b_displaced > 104.346 )
							if( senkou_span_b <= 104.628 )
								if( senkou_span_a_displaced <= 105.127 )
									ret := -0.235294
								if( senkou_span_a_displaced > 105.127 )
									ret := 0.543478
							if( senkou_span_b > 104.628 )
								if( basis_max <= 1.03376 )
									ret := -0.514644
								if( basis_max > 1.03376 )
									ret := 0.631579
					if( chinkou_span > 103.058 )
						if( senkou_span_a <= 105.871 )
							if( basis_max <= -0.070332 )
								if( senkou_span_a <= 105.807 )
									ret := -0.132231
								if( senkou_span_a > 105.807 )
									ret := 0.941176 // buy
							if( basis_max > -0.070332 )
								if( chinkou_span <= 105.346 )
									ret := 0.063107
								if( chinkou_span > 105.346 )
									ret := 0.510638
						if( senkou_span_a > 105.871 )
							if( basis_max <= -0.010288 )
								if( senkou_span_a_displaced <= 104.774 )
									ret := 0.000000
								if( senkou_span_a_displaced > 104.774 )
									ret := -0.463977
							if( basis_max > -0.010288 )
								if( kinjun_sen <= 106.062 )
									ret := -0.808511 // sell
								if( kinjun_sen > 106.062 )
									ret := -0.095238
			if( chinkou_span > 106.891 )
				if( kinjun_sen <= 107.025 )
					if( basis_max <= -0.307396 )
						if( chinkou_span <= 108.576 )
							if( tenkan_sen <= 105.87 )
								if( kinjun_sen <= 104.129 )
									ret := -0.088889
								if( kinjun_sen > 104.129 )
									ret := 0.903226 // buy
							if( tenkan_sen > 105.87 )
								if( senkou_span_a <= 106.969 )
									ret := -0.214953
								if( senkou_span_a > 106.969 )
									ret := -0.900000 // sell
						if( chinkou_span > 108.576 )
							if( senkou_span_b_displaced <= 105.58 )
								if( chinkou_span <= 109.35 )
									ret := -0.142857
								if( chinkou_span > 109.35 )
									ret := 0.400000
							if( senkou_span_b_displaced > 105.58 )
								if( senkou_span_a_displaced <= 107.572 )
									ret := 0.468750
								if( senkou_span_a_displaced > 107.572 )
									ret := 0.920000 // buy
					if( basis_max > -0.307396 )
						if( tenkan_sen <= 105.386 )
							if( senkou_span_b <= 99.4744 )
								ret := -0.600000
							if( senkou_span_b > 99.4744 )
								if( basis_minus <= -2.14785 )
									ret := 0.000000
								if( basis_minus > -2.14785 )
									ret := 0.827586 // buy
						if( tenkan_sen > 105.386 )
							if( senkou_span_b <= 107.55 )
								if( tenkan_sen <= 105.677 )
									ret := -0.030303
								if( tenkan_sen > 105.677 )
									ret := 0.497685
							if( senkou_span_b > 107.55 )
								if( kinjun_sen <= 106.903 )
									ret := -0.600000
								if( kinjun_sen > 106.903 )
									ret := 0.416667
				if( kinjun_sen > 107.025 )
					if( senkou_span_b <= 109.996 )
						if( chinkou_span <= 107.932 )
							if( senkou_span_a <= 107.857 )
								if( senkou_span_a <= 107.574 )
									ret := -0.112000
								if( senkou_span_a > 107.574 )
									ret := 0.229730
							if( senkou_span_a > 107.857 )
								if( senkou_span_b_displaced <= 108.481 )
									ret := -0.522388
								if( senkou_span_b_displaced > 108.481 )
									ret := -0.178571
						if( chinkou_span > 107.932 )
							if( kinjun_sen <= 107.658 )
								if( senkou_span_a <= 107.342 )
									ret := 0.500000
								if( senkou_span_a > 107.342 )
									ret := -0.323529
							if( kinjun_sen > 107.658 )
								if( senkou_span_b <= 107.126 )
									ret := 0.803922 // buy
								if( senkou_span_b > 107.126 )
									ret := 0.120264
					if( senkou_span_b > 109.996 )
						if( senkou_span_a_displaced <= 111.474 )
							ret := 1.000000 // buy
						if( senkou_span_a_displaced > 111.474 )
							ret := 0.750000 // buy
		if( kinjun_sen > 108.953 )
			if( senkou_span_a <= 112.815 )
				if( senkou_span_b <= 111.149 )
					if( chinkou_span <= 107.47 )
						if( basis_max <= 0.092427 )
							if( senkou_span_b_displaced <= 110.725 )
								if( senkou_span_a_displaced <= 110.056 )
									ret := -0.835616 // sell
								if( senkou_span_a_displaced > 110.056 )
									ret := -0.222222
							if( senkou_span_b_displaced > 110.725 )
								if( basis_minus <= -1.30758 )
									ret := -0.818182 // sell
								if( basis_minus > -1.30758 )
									ret := -0.978261 // sell
						if( basis_max > 0.092427 )
							if( basis_minus <= -1.2892 )
								ret := 0.857143 // buy
							if( basis_minus > -1.2892 )
								if( senkou_span_a_displaced <= 111.257 )
									ret := -0.575342
								if( senkou_span_a_displaced > 111.257 )
									ret := 0.250000
					if( chinkou_span > 107.47 )
						if( basis_minus <= 0.091547 )
							if( senkou_span_b_displaced <= 110.787 )
								if( basis_minus <= -0.552957 )
									ret := -0.905660 // sell
								if( basis_minus > -0.552957 )
									ret := 0.078704
							if( senkou_span_b_displaced > 110.787 )
								if( basis_minus <= -1.18806 )
									ret := -0.538462
								if( basis_minus > -1.18806 )
									ret := 0.654762
						if( basis_minus > 0.091547 )
							if( senkou_span_b <= 109.285 )
								if( chinkou_span <= 109.674 )
									ret := -0.314815
								if( chinkou_span > 109.674 )
									ret := 0.149425
							if( senkou_span_b > 109.285 )
								if( senkou_span_b_displaced <= 110.043 )
									ret := -0.407960
								if( senkou_span_b_displaced > 110.043 )
									ret := -0.706897 // sell
				if( senkou_span_b > 111.149 )
					if( basis_max <= -0.000136 )
						if( senkou_span_b <= 111.462 )
							if( senkou_span_b <= 111.317 )
								ret := -0.250000
							if( senkou_span_b > 111.317 )
								ret := 0.250000
						if( senkou_span_b > 111.462 )
							if( senkou_span_b <= 112.173 )
								ret := -1.000000 // sell
							if( senkou_span_b > 112.173 )
								if( basis_max <= -0.15875 )
									ret := 0.000000
								if( basis_max > -0.15875 )
									ret := -0.809524 // sell
					if( basis_max > -0.000136 )
						if( tenkan_sen <= 110.922 )
							if( senkou_span_a_displaced <= 111.133 )
								if( basis_minus <= -0.492732 )
									ret := 0.600000
								if( basis_minus > -0.492732 )
									ret := 0.900000 // buy
							if( senkou_span_a_displaced > 111.133 )
								if( chinkou_span <= 107.592 )
									ret := -0.500000
								if( chinkou_span > 107.592 )
									ret := 0.391304
						if( tenkan_sen > 110.922 )
							if( senkou_span_b_displaced <= 112.768 )
								if( senkou_span_b_displaced <= 112.196 )
									ret := -0.209677
								if( senkou_span_b_displaced > 112.196 )
									ret := 0.472222
							if( senkou_span_b_displaced > 112.768 )
								if( chinkou_span <= 108.2 )
									ret := 0.500000
								if( chinkou_span > 108.2 )
									ret := -0.400000
			if( senkou_span_a > 112.815 )
				if( basis_max <= 0.104155 )
					if( senkou_span_a <= 114.58 )
						if( tenkan_sen <= 113.121 )
							if( basis_minus <= 0.172154 )
								ret := -1.000000 // sell
							if( basis_minus > 0.172154 )
								ret := -0.714286 // sell
						if( tenkan_sen > 113.121 )
							if( senkou_span_a_displaced <= 112.435 )
								ret := -0.500000
							if( senkou_span_a_displaced > 112.435 )
								if( kinjun_sen <= 113.627 )
									ret := 0.000000
								if( kinjun_sen > 113.627 )
									ret := -0.250000
					if( senkou_span_a > 114.58 )
						if( chinkou_span <= 110.457 )
							ret := -1.000000 // sell
						if( chinkou_span > 110.457 )
							ret := -0.750000 // sell
				if( basis_max > 0.104155 )
					if( senkou_span_a <= 113.902 )
						if( tenkan_sen <= 112.424 )
							ret := -0.750000 // sell
						if( tenkan_sen > 112.424 )
							ret := -1.000000 // sell
					if( senkou_span_a > 113.902 )
						ret := -0.750000 // sell
	if( chinkou_span > 110.627 )
		if( senkou_span_a_displaced <= 111.361 )
			if( kinjun_sen <= 109.679 )
				if( basis_max <= 0.343125 )
					if( basis_max <= -0.532829 )
						if( basis_minus <= 1.13994 )
							if( senkou_span_b <= 108.74 )
								if( tenkan_sen <= 109.631 )
									ret := 0.000000
								if( tenkan_sen > 109.631 )
									ret := 0.866667 // buy
							if( senkou_span_b > 108.74 )
								ret := 0.000000
						if( basis_minus > 1.13994 )
							if( senkou_span_a_displaced <= 107.09 )
								ret := 0.000000
							if( senkou_span_a_displaced > 107.09 )
								ret := -1.000000 // sell
					if( basis_max > -0.532829 )
						if( chinkou_span <= 111.324 )
							if( basis_minus <= -0.148874 )
								if( basis_max <= 0.175 )
									ret := 0.000000
								if( basis_max > 0.175 )
									ret := -1.000000 // sell
							if( basis_minus > -0.148874 )
								if( senkou_span_a <= 109.321 )
									ret := 0.733813 // buy
								if( senkou_span_a > 109.321 )
									ret := 0.136364
						if( chinkou_span > 111.324 )
							if( senkou_span_b_displaced <= 109.137 )
								if( basis_minus <= 1.11577 )
									ret := 0.931624 // buy
								if( basis_minus > 1.11577 )
									ret := 0.588235
							if( senkou_span_b_displaced > 109.137 )
								if( chinkou_span <= 115.036 )
									ret := 0.500000
								if( chinkou_span > 115.036 )
									ret := 0.961538 // buy
				if( basis_max > 0.343125 )
					if( basis_max <= 0.380898 )
						if( senkou_span_a_displaced <= 110.126 )
							ret := -1.000000 // sell
						if( senkou_span_a_displaced > 110.126 )
							ret := -0.750000 // sell
					if( basis_max > 0.380898 )
						ret := 0.666667
			if( kinjun_sen > 109.679 )
				if( senkou_span_b_displaced <= 108.276 )
					if( chinkou_span <= 112.475 )
						if( basis_minus <= 1.89125 )
							if( tenkan_sen <= 111.822 )
								if( senkou_span_a_displaced <= 108.544 )
									ret := -0.395833
								if( senkou_span_a_displaced > 108.544 )
									ret := 0.044444
							if( tenkan_sen > 111.822 )
								if( senkou_span_a_displaced <= 108.291 )
									ret := 1.000000 // buy
								if( senkou_span_a_displaced > 108.291 )
									ret := 0.750000 // buy
						if( basis_minus > 1.89125 )
							if( kinjun_sen <= 111.261 )
								ret := -0.571429
							if( kinjun_sen > 111.261 )
								ret := -1.000000 // sell
					if( chinkou_span > 112.475 )
						if( senkou_span_b_displaced <= 107.47 )
							ret := 0.200000
						if( senkou_span_b_displaced > 107.47 )
							if( senkou_span_b <= 109.509 )
								ret := 0.750000 // buy
							if( senkou_span_b > 109.509 )
								ret := 1.000000 // buy
				if( senkou_span_b_displaced > 108.276 )
					if( senkou_span_b <= 111.073 )
						if( chinkou_span <= 115.343 )
							if( senkou_span_a_displaced <= 108.746 )
								if( senkou_span_a_displaced <= 108.103 )
									ret := 0.666667
								if( senkou_span_a_displaced > 108.103 )
									ret := 1.000000 // buy
							if( senkou_span_a_displaced > 108.746 )
								if( basis_max <= -0.262245 )
									ret := 0.081081
								if( basis_max > -0.262245 )
									ret := 0.544236
						if( chinkou_span > 115.343 )
							if( senkou_span_b <= 109.586 )
								ret := -1.000000 // sell
							if( senkou_span_b > 109.586 )
								ret := 0.833333 // buy
					if( senkou_span_b > 111.073 )
						if( kinjun_sen <= 111.126 )
							if( chinkou_span <= 114.925 )
								if( senkou_span_a <= 111.082 )
									ret := 0.750000 // buy
								if( senkou_span_a > 111.082 )
									ret := -0.763158 // sell
							if( chinkou_span > 114.925 )
								if( tenkan_sen <= 111.819 )
									ret := 1.000000 // buy
								if( tenkan_sen > 111.819 )
									ret := 0.000000
						if( kinjun_sen > 111.126 )
							if( basis_minus <= 0.608282 )
								if( senkou_span_b_displaced <= 110.417 )
									ret := 0.352941
								if( senkou_span_b_displaced > 110.417 )
									ret := 0.807692 // buy
							if( basis_minus > 0.608282 )
								if( chinkou_span <= 117.13 )
									ret := 0.047619
								if( chinkou_span > 117.13 )
									ret := 1.000000 // buy
		if( senkou_span_a_displaced > 111.361 )
			if( basis_minus <= -8.44625 )
				if( basis_max <= 1.97438 )
					if( basis_minus <= -16.5007 )
						ret := 0.000000
					if( basis_minus > -16.5007 )
						if( basis_max <= 0.860006 )
							ret := -1.000000 // sell
						if( basis_max > 0.860006 )
							if( senkou_span_a_displaced <= 194.578 )
								if( basis_minus <= -13.731 )
									ret := -1.000000 // sell
								if( basis_minus > -13.731 )
									ret := 0.000000
							if( senkou_span_a_displaced > 194.578 )
								if( kinjun_sen <= 219.712 )
									ret := -0.961538 // sell
								if( kinjun_sen > 219.712 )
									ret := -0.750000 // sell
				if( basis_max > 1.97438 )
					if( senkou_span_a <= 136.593 )
						if( senkou_span_b <= 152.76 )
							ret := 1.000000 // buy
						if( senkou_span_b > 152.76 )
							ret := 0.750000 // buy
					if( senkou_span_a > 136.593 )
						if( basis_minus <= -13.7449 )
							ret := -0.750000 // sell
						if( basis_minus > -13.7449 )
							ret := 0.333333
			if( basis_minus > -8.44625 )
				if( chinkou_span <= 114.677 )
					if( senkou_span_a <= 116.462 )
						if( senkou_span_b_displaced <= 111.309 )
							if( senkou_span_b <= 112.31 )
								if( tenkan_sen <= 110.383 )
									ret := -0.304348
								if( tenkan_sen > 110.383 )
									ret := -0.787500 // sell
							if( senkou_span_b > 112.31 )
								if( senkou_span_a <= 113.583 )
									ret := 0.066667
								if( senkou_span_a > 113.583 )
									ret := -0.636364
						if( senkou_span_b_displaced > 111.309 )
							if( tenkan_sen <= 112.498 )
								if( chinkou_span <= 111.135 )
									ret := -0.369863
								if( chinkou_span > 111.135 )
									ret := 0.450000
							if( tenkan_sen > 112.498 )
								if( basis_minus <= 1.24749 )
									ret := -0.137143
								if( basis_minus > 1.24749 )
									ret := 0.840000 // buy
					if( senkou_span_a > 116.462 )
						if( senkou_span_b_displaced <= 113.156 )
							if( senkou_span_b <= 114.794 )
								ret := 1.000000 // buy
							if( senkou_span_b > 114.794 )
								if( basis_max <= -0.249175 )
									ret := -0.684211
								if( basis_max > -0.249175 )
									ret := 0.500000
						if( senkou_span_b_displaced > 113.156 )
							if( basis_minus <= 0.15625 )
								if( senkou_span_a_displaced <= 117.807 )
									ret := 0.444444
								if( senkou_span_a_displaced > 117.807 )
									ret := -0.635135
							if( basis_minus > 0.15625 )
								if( senkou_span_a <= 118.484 )
									ret := -0.982759 // sell
								if( senkou_span_a > 118.484 )
									ret := -0.800000 // sell
				if( chinkou_span > 114.677 )
					if( kinjun_sen <= 115.148 )
						if( tenkan_sen <= 114.349 )
							if( senkou_span_b <= 112.957 )
								ret := -0.400000
							if( senkou_span_b > 112.957 )
								if( senkou_span_b_displaced <= 115.112 )
									ret := 0.826923 // buy
								if( senkou_span_b_displaced > 115.112 )
									ret := 0.500000
						if( tenkan_sen > 114.349 )
							if( kinjun_sen <= 114.24 )
								if( basis_minus <= 1.13951 )
									ret := -0.052632
								if( basis_minus > 1.13951 )
									ret := 0.857143 // buy
							if( kinjun_sen > 114.24 )
								if( senkou_span_b_displaced <= 114.038 )
									ret := 0.673913
								if( senkou_span_b_displaced > 114.038 )
									ret := 0.349345
					if( kinjun_sen > 115.148 )
						if( chinkou_span <= 116.487 )
							if( tenkan_sen <= 116.523 )
								if( senkou_span_b <= 117.51 )
									ret := 0.007435
								if( senkou_span_b > 117.51 )
									ret := 0.591549
							if( tenkan_sen > 116.523 )
								if( senkou_span_b_displaced <= 112.295 )
									ret := 0.833333 // buy
								if( senkou_span_b_displaced > 112.295 )
									ret := -0.514667
						if( chinkou_span > 116.487 )
							if( kinjun_sen <= 116.711 )
								if( chinkou_span <= 118.472 )
									ret := 0.277929
								if( chinkou_span > 118.472 )
									ret := 0.729885 // buy
							if( kinjun_sen > 116.711 )
								if( chinkou_span <= 119.195 )
									ret := -0.228612
								if( chinkou_span > 119.195 )
									ret := 0.068251
	
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
float op_operation = decision_tree_0_PYPL_15Min_dbf0abe5(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)

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


