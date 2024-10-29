//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: LINKUSDT_15Min_1ICH_acd343f0 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LINKUSDT_15Min_1ICH_acd343f0", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LINKUSDT_15Min_acd343f0(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( chinkou_span <= 6.93967 )
		if( kinjun_sen <= 6.93266 )
			if( senkou_span_a <= 6.14755 )
				if( tenkan_sen <= 6.13151 )
					if( kinjun_sen <= 5.04938 )
						if( tenkan_sen <= 5.0359 )
							ret := 1.000000 // buy
						if( tenkan_sen > 5.0359 )
							ret := 0.818182 // buy
					if( kinjun_sen > 5.04938 )
						if( senkou_span_a_displaced <= 6.01387 )
							if( chinkou_span <= 6.03098 )
								if( basis_max <= -0.007095 )
									ret := 0.161269
								if( basis_max > -0.007095 )
									ret := -0.103677
							if( chinkou_span > 6.03098 )
								if( senkou_span_a_displaced <= 5.63534 )
									ret := -0.945946 // sell
								if( senkou_span_a_displaced > 5.63534 )
									ret := 0.456731
						if( senkou_span_a_displaced > 6.01387 )
							if( senkou_span_a_displaced <= 6.18441 )
								if( senkou_span_b_displaced <= 6.14035 )
									ret := 0.276664
								if( senkou_span_b_displaced > 6.14035 )
									ret := 0.095066
							if( senkou_span_a_displaced > 6.18441 )
								if( senkou_span_b <= 6.36813 )
									ret := -0.096070
								if( senkou_span_b > 6.36813 )
									ret := 0.763889 // buy
				if( tenkan_sen > 6.13151 )
					if( senkou_span_a_displaced <= 5.83502 )
						ret := -1.000000 // sell
					if( senkou_span_a_displaced > 5.83502 )
						if( senkou_span_a <= 6.12828 )
							if( tenkan_sen <= 6.13415 )
								if( kinjun_sen <= 6.10764 )
									ret := 0.384615
								if( kinjun_sen > 6.10764 )
									ret := 0.944444 // buy
							if( tenkan_sen > 6.13415 )
								if( senkou_span_a_displaced <= 6.13962 )
									ret := -0.152672
								if( senkou_span_a_displaced > 6.13962 )
									ret := 0.708333 // buy
						if( senkou_span_a > 6.12828 )
							if( senkou_span_a_displaced <= 6.12263 )
								if( basis_max <= -0.026451 )
									ret := 0.875000 // buy
								if( basis_max > -0.026451 )
									ret := 0.593220
							if( senkou_span_a_displaced > 6.12263 )
								if( senkou_span_b <= 6.28587 )
									ret := 0.195804
								if( senkou_span_b > 6.28587 )
									ret := 0.647059
			if( senkou_span_a > 6.14755 )
				if( senkou_span_b_displaced <= 6.04537 )
					if( chinkou_span <= 6.14025 )
						if( basis_minus <= 0.013875 )
							ret := 0.500000
						if( basis_minus > 0.013875 )
							if( senkou_span_a <= 6.165 )
								ret := -0.125000
							if( senkou_span_a > 6.165 )
								if( basis_minus <= 0.057371 )
									ret := -0.608696
								if( basis_minus > 0.057371 )
									ret := -0.876106 // sell
					if( chinkou_span > 6.14025 )
						if( senkou_span_a <= 6.49093 )
							if( senkou_span_b <= 6.06428 )
								if( chinkou_span <= 6.55162 )
									ret := 0.441176
								if( chinkou_span > 6.55162 )
									ret := -0.958333 // sell
							if( senkou_span_b > 6.06428 )
								if( basis_minus <= 0.127372 )
									ret := -0.654135
								if( basis_minus > 0.127372 )
									ret := 0.045455
						if( senkou_span_a > 6.49093 )
							ret := 1.000000 // buy
				if( senkou_span_b_displaced > 6.04537 )
					if( kinjun_sen <= 6.79501 )
						if( senkou_span_a_displaced <= 6.99347 )
							if( senkou_span_a <= 6.73243 )
								if( chinkou_span <= 6.41592 )
									ret := -0.200559
								if( chinkou_span > 6.41592 )
									ret := 0.116647
							if( senkou_span_a > 6.73243 )
								if( senkou_span_b <= 6.83666 )
									ret := 0.171076
								if( senkou_span_b > 6.83666 )
									ret := 0.509434
						if( senkou_span_a_displaced > 6.99347 )
							if( tenkan_sen <= 6.658 )
								if( basis_minus <= -0.282993 )
									ret := -0.556818
								if( basis_minus > -0.282993 )
									ret := 0.283019
							if( tenkan_sen > 6.658 )
								if( tenkan_sen <= 6.781 )
									ret := -0.737374 // sell
								if( tenkan_sen > 6.781 )
									ret := 0.000000
					if( kinjun_sen > 6.79501 )
						if( senkou_span_b <= 6.83072 )
							if( senkou_span_a <= 6.77713 )
								if( basis_max <= 0.04686 )
									ret := -0.866667 // sell
								if( basis_max > 0.04686 )
									ret := -1.000000 // sell
							if( senkou_span_a > 6.77713 )
								if( tenkan_sen <= 6.9445 )
									ret := -0.298030
								if( tenkan_sen > 6.9445 )
									ret := -0.771429 // sell
						if( senkou_span_b > 6.83072 )
							if( kinjun_sen <= 6.88449 )
								if( senkou_span_a_displaced <= 6.70223 )
									ret := -0.833333 // sell
								if( senkou_span_a_displaced > 6.70223 )
									ret := 0.051282
							if( kinjun_sen > 6.88449 )
								if( tenkan_sen <= 6.89084 )
									ret := 0.100478
								if( tenkan_sen > 6.89084 )
									ret := -0.328283
		if( kinjun_sen > 6.93266 )
			if( basis_minus <= -0.467249 )
				if( senkou_span_a_displaced <= 7.78254 )
					if( kinjun_sen <= 7.484 )
						if( basis_max <= 0.089902 )
							ret := 0.357143
						if( basis_max > 0.089902 )
							if( tenkan_sen <= 6.96221 )
								ret := 1.000000 // buy
							if( tenkan_sen > 6.96221 )
								ret := 0.833333 // buy
					if( kinjun_sen > 7.484 )
						ret := -0.636364
				if( senkou_span_a_displaced > 7.78254 )
					ret := -0.615385
			if( basis_minus > -0.467249 )
				if( senkou_span_b_displaced <= 7.55925 )
					if( senkou_span_a <= 7.12889 )
						if( basis_max <= 0.049157 )
							if( chinkou_span <= 6.75421 )
								if( tenkan_sen <= 7.07913 )
									ret := -0.693478
								if( tenkan_sen > 7.07913 )
									ret := 0.018519
							if( chinkou_span > 6.75421 )
								if( senkou_span_a_displaced <= 7.21173 )
									ret := -0.422251
								if( senkou_span_a_displaced > 7.21173 )
									ret := 0.251908
						if( basis_max > 0.049157 )
							if( senkou_span_b <= 7.16371 )
								if( senkou_span_b_displaced <= 7.39668 )
									ret := 0.091371
								if( senkou_span_b_displaced > 7.39668 )
									ret := -0.878788 // sell
							if( senkou_span_b > 7.16371 )
								if( basis_minus <= -0.097856 )
									ret := 0.830986 // buy
								if( basis_minus > -0.097856 )
									ret := -0.105263
					if( senkou_span_a > 7.12889 )
						if( senkou_span_a <= 7.32351 )
							if( senkou_span_a <= 7.25404 )
								if( senkou_span_b <= 7.15 )
									ret := -0.855172 // sell
								if( senkou_span_b > 7.15 )
									ret := -0.580645
							if( senkou_span_a > 7.25404 )
								if( chinkou_span <= 6.713 )
									ret := -0.727273 // sell
								if( chinkou_span > 6.713 )
									ret := -0.949495 // sell
						if( senkou_span_a > 7.32351 )
							if( basis_minus <= 0.101479 )
								if( senkou_span_a_displaced <= 7.41997 )
									ret := -0.885714 // sell
								if( senkou_span_a_displaced > 7.41997 )
									ret := 0.333333
							if( basis_minus > 0.101479 )
								ret := 0.571429
				if( senkou_span_b_displaced > 7.55925 )
					if( senkou_span_a_displaced <= 7.61763 )
						if( senkou_span_a <= 7.0906 )
							if( kinjun_sen <= 7.12336 )
								if( basis_minus <= -0.185847 )
									ret := -1.000000 // sell
								if( basis_minus > -0.185847 )
									ret := -0.750000 // sell
							if( kinjun_sen > 7.12336 )
								ret := 0.647059
						if( senkou_span_a > 7.0906 )
							if( senkou_span_a <= 7.22744 )
								ret := -1.000000 // sell
							if( senkou_span_a > 7.22744 )
								if( kinjun_sen <= 7.39375 )
									ret := -0.583333
								if( kinjun_sen > 7.39375 )
									ret := -0.964912 // sell
					if( senkou_span_a_displaced > 7.61763 )
						if( senkou_span_a <= 7.25125 )
							ret := 1.000000 // buy
						if( senkou_span_a > 7.25125 )
							if( tenkan_sen <= 7.20108 )
								ret := -0.727273 // sell
							if( tenkan_sen > 7.20108 )
								if( senkou_span_a_displaced <= 8.33102 )
									ret := -1.000000 // sell
								if( senkou_span_a_displaced > 8.33102 )
									ret := -0.846154 // sell
	if( chinkou_span > 6.93967 )
		if( senkou_span_a <= 7.02924 )
			if( tenkan_sen <= 6.82995 )
				if( senkou_span_b <= 6.38409 )
					if( tenkan_sen <= 6.44049 )
						if( basis_max <= -0.021 )
							if( senkou_span_b_displaced <= 6.3775 )
								ret := -0.818182 // sell
							if( senkou_span_b_displaced > 6.3775 )
								ret := 0.333333
						if( basis_max > -0.021 )
							ret := 1.000000 // buy
					if( tenkan_sen > 6.44049 )
						if( basis_max <= -0.028552 )
							ret := -1.000000 // sell
						if( basis_max > -0.028552 )
							if( senkou_span_a <= 6.68554 )
								ret := -0.777778 // sell
							if( senkou_span_a > 6.68554 )
								ret := -1.000000 // sell
				if( senkou_span_b > 6.38409 )
					if( senkou_span_a_displaced <= 6.29186 )
						if( basis_max <= 0.00125 )
							ret := 0.000000
						if( basis_max > 0.00125 )
							ret := -1.000000 // sell
					if( senkou_span_a_displaced > 6.29186 )
						if( senkou_span_a <= 6.66375 )
							if( senkou_span_b_displaced <= 7.01275 )
								if( chinkou_span <= 6.95123 )
									ret := 0.384615
								if( chinkou_span > 6.95123 )
									ret := 0.931818 // buy
							if( senkou_span_b_displaced > 7.01275 )
								ret := -0.714286 // sell
						if( senkou_span_a > 6.66375 )
							if( senkou_span_a <= 6.68516 )
								if( senkou_span_a <= 6.68301 )
									ret := 0.355556
								if( senkou_span_a > 6.68301 )
									ret := -0.692308
							if( senkou_span_a > 6.68516 )
								if( chinkou_span <= 7.08333 )
									ret := 0.591102
								if( chinkou_span > 7.08333 )
									ret := 0.821561 // buy
			if( tenkan_sen > 6.82995 )
				if( basis_max <= -0.051316 )
					if( kinjun_sen <= 6.87558 )
						if( chinkou_span <= 7.04561 )
							if( basis_max <= -0.06375 )
								if( basis_minus <= 0.143625 )
									ret := 0.842105 // buy
								if( basis_minus > 0.143625 )
									ret := 1.000000 // buy
							if( basis_max > -0.06375 )
								ret := 0.083333
						if( chinkou_span > 7.04561 )
							if( senkou_span_b <= 6.853 )
								if( senkou_span_b <= 6.65233 )
									ret := 0.900000 // buy
								if( senkou_span_b > 6.65233 )
									ret := 1.000000 // buy
							if( senkou_span_b > 6.853 )
								ret := 0.894737 // buy
					if( kinjun_sen > 6.87558 )
						if( tenkan_sen <= 7.02398 )
							ret := 0.000000
						if( tenkan_sen > 7.02398 )
							if( tenkan_sen <= 7.0478 )
								if( tenkan_sen <= 7.03652 )
									ret := 0.615385
								if( tenkan_sen > 7.03652 )
									ret := 0.936170 // buy
							if( tenkan_sen > 7.0478 )
								if( basis_max <= -0.065168 )
									ret := 0.080000
								if( basis_max > -0.065168 )
									ret := 0.723404 // buy
				if( basis_max > -0.051316 )
					if( senkou_span_b_displaced <= 7.36407 )
						if( senkou_span_a <= 6.85591 )
							if( tenkan_sen <= 6.84191 )
								if( senkou_span_a <= 6.82355 )
									ret := 0.074074
								if( senkou_span_a > 6.82355 )
									ret := 0.702128 // buy
							if( tenkan_sen > 6.84191 )
								if( senkou_span_b_displaced <= 6.91548 )
									ret := -0.066667
								if( senkou_span_b_displaced > 6.91548 )
									ret := -0.840909 // sell
						if( senkou_span_a > 6.85591 )
							if( chinkou_span <= 7.17807 )
								if( senkou_span_b_displaced <= 6.9171 )
									ret := 0.393418
								if( senkou_span_b_displaced > 6.9171 )
									ret := 0.168848
							if( chinkou_span > 7.17807 )
								if( chinkou_span <= 7.22002 )
									ret := 0.579545
								if( chinkou_span > 7.22002 )
									ret := 0.751491 // buy
					if( senkou_span_b_displaced > 7.36407 )
						if( senkou_span_a <= 6.91798 )
							ret := -0.692308
						if( senkou_span_a > 6.91798 )
							ret := -0.812500 // sell
		if( senkou_span_a > 7.02924 )
			if( basis_minus <= -0.03376 )
				if( chinkou_span <= 7.19821 )
					if( senkou_span_b <= 7.26425 )
						if( kinjun_sen <= 7.12436 )
							if( tenkan_sen <= 7.05067 )
								if( senkou_span_a <= 7.04335 )
									ret := -0.138462
								if( senkou_span_a > 7.04335 )
									ret := 0.648936
							if( tenkan_sen > 7.05067 )
								if( senkou_span_b_displaced <= 7.50782 )
									ret := -0.370370
								if( senkou_span_b_displaced > 7.50782 )
									ret := 0.888889 // buy
						if( kinjun_sen > 7.12436 )
							if( senkou_span_b <= 7.18725 )
								if( chinkou_span <= 7.0185 )
									ret := -0.028571
								if( chinkou_span > 7.0185 )
									ret := 0.553571
							if( senkou_span_b > 7.18725 )
								if( tenkan_sen <= 7.1391 )
									ret := 0.250000
								if( tenkan_sen > 7.1391 )
									ret := -0.220779
					if( senkou_span_b > 7.26425 )
						if( basis_max <= 0.081522 )
							if( senkou_span_a_displaced <= 7.34388 )
								if( chinkou_span <= 7.154 )
									ret := -0.852632 // sell
								if( chinkou_span > 7.154 )
									ret := -0.230769
							if( senkou_span_a_displaced > 7.34388 )
								if( senkou_span_a <= 7.31996 )
									ret := -0.289474
								if( senkou_span_a > 7.31996 )
									ret := -0.593968
						if( basis_max > 0.081522 )
							if( senkou_span_a <= 7.30679 )
								if( basis_minus <= -0.12375 )
									ret := 0.275862
								if( basis_minus > -0.12375 )
									ret := 0.864865 // buy
							if( senkou_span_a > 7.30679 )
								if( basis_max <= 0.171875 )
									ret := -0.745283 // sell
								if( basis_max > 0.171875 )
									ret := 0.619048
				if( chinkou_span > 7.19821 )
					if( senkou_span_b_displaced <= 7.374 )
						if( senkou_span_b_displaced <= 6.99379 )
							ret := -0.437500
						if( senkou_span_b_displaced > 6.99379 )
							if( tenkan_sen <= 7.30837 )
								if( chinkou_span <= 7.3925 )
									ret := 0.430233
								if( chinkou_span > 7.3925 )
									ret := 0.848684 // buy
							if( tenkan_sen > 7.30837 )
								if( senkou_span_b_displaced <= 7.34245 )
									ret := -0.533333
								if( senkou_span_b_displaced > 7.34245 )
									ret := 0.000000
					if( senkou_span_b_displaced > 7.374 )
						if( tenkan_sen <= 20.8805 )
							if( senkou_span_b_displaced <= 7.89317 )
								if( kinjun_sen <= 7.16257 )
									ret := 0.902778 // buy
								if( kinjun_sen > 7.16257 )
									ret := 0.127273
							if( senkou_span_b_displaced > 7.89317 )
								if( senkou_span_b <= 7.92175 )
									ret := -0.212978
								if( senkou_span_b > 7.92175 )
									ret := 0.034347
						if( tenkan_sen > 20.8805 )
							if( senkou_span_b_displaced <= 21.368 )
								if( kinjun_sen <= 21.3059 )
									ret := -0.793814 // sell
								if( kinjun_sen > 21.3059 )
									ret := -0.071429
							if( senkou_span_b_displaced > 21.368 )
								ret := 0.777778 // buy
			if( basis_minus > -0.03376 )
				if( senkou_span_b_displaced <= 7.45004 )
					if( chinkou_span <= 7.36248 )
						if( senkou_span_b <= 7.28904 )
							if( senkou_span_b <= 6.96132 )
								if( basis_max <= -0.004235 )
									ret := -0.501976
								if( basis_max > -0.004235 )
									ret := 0.583333
							if( senkou_span_b > 6.96132 )
								if( chinkou_span <= 7.2402 )
									ret := -0.092393
								if( chinkou_span > 7.2402 )
									ret := 0.207429
						if( senkou_span_b > 7.28904 )
							if( senkou_span_a <= 7.4055 )
								if( senkou_span_b_displaced <= 7.26421 )
									ret := -0.005025
								if( senkou_span_b_displaced > 7.26421 )
									ret := -0.391243
							if( senkou_span_a > 7.4055 )
								if( basis_minus <= 0.109974 )
									ret := -0.690860
								if( basis_minus > 0.109974 )
									ret := -0.512821
					if( chinkou_span > 7.36248 )
						if( kinjun_sen <= 7.65585 )
							if( tenkan_sen <= 7.21634 )
								if( basis_minus <= -0.024729 )
									ret := -0.095238
								if( basis_minus > -0.024729 )
									ret := 0.730000 // buy
							if( tenkan_sen > 7.21634 )
								if( basis_minus <= 0.069165 )
									ret := 0.379565
								if( basis_minus > 0.069165 )
									ret := 0.164195
						if( kinjun_sen > 7.65585 )
							if( tenkan_sen <= 8.18234 )
								if( tenkan_sen <= 7.85222 )
									ret := -0.365854
								if( tenkan_sen > 7.85222 )
									ret := 0.837838 // buy
							if( tenkan_sen > 8.18234 )
								if( senkou_span_b_displaced <= 6.95704 )
									ret := -0.750000 // sell
								if( senkou_span_b_displaced > 6.95704 )
									ret := -1.000000 // sell
				if( senkou_span_b_displaced > 7.45004 )
					if( senkou_span_b_displaced <= 9.22358 )
						if( tenkan_sen <= 8.63084 )
							if( chinkou_span <= 8.15603 )
								if( senkou_span_b <= 7.9356 )
									ret := -0.126644
								if( senkou_span_b > 7.9356 )
									ret := -0.403567
							if( chinkou_span > 8.15603 )
								if( senkou_span_b_displaced <= 7.73839 )
									ret := 0.829114 // buy
								if( senkou_span_b_displaced > 7.73839 )
									ret := 0.299528
						if( tenkan_sen > 8.63084 )
							if( basis_max <= 0.004922 )
								if( kinjun_sen <= 8.82363 )
									ret := -0.538715
								if( kinjun_sen > 8.82363 )
									ret := -0.136364
							if( basis_max > 0.004922 )
								if( tenkan_sen <= 8.83407 )
									ret := -0.455285
								if( tenkan_sen > 8.83407 )
									ret := 0.214533
					if( senkou_span_b_displaced > 9.22358 )
						if( tenkan_sen <= 20.1215 )
							if( chinkou_span <= 20.09 )
								if( senkou_span_b_displaced <= 14.0593 )
									ret := 0.022940
								if( senkou_span_b_displaced > 14.0593 )
									ret := -0.060943
							if( chinkou_span > 20.09 )
								if( kinjun_sen <= 19.6889 )
									ret := 0.796680 // buy
								if( kinjun_sen > 19.6889 )
									ret := 0.291429
						if( tenkan_sen > 20.1215 )
							if( chinkou_span <= 20.5176 )
								if( basis_minus <= -0.001808 )
									ret := -0.037037
								if( basis_minus > -0.001808 )
									ret := -0.549231
							if( chinkou_span > 20.5176 )
								if( senkou_span_a_displaced <= 20.5971 )
									ret := -0.152882
								if( senkou_span_a_displaced > 20.5971 )
									ret := 0.347368
	
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
float op_operation = decision_tree_0_LINKUSDT_15Min_acd343f0(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)

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


