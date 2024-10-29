//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: TRXUSDT_15Min_1ICH_6beb9d25 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_15Min_1ICH_6beb9d25", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_15Min_6beb9d25(tenkan_sen, basis_minus, cross_up_tenkan_kinjunInt, senkou_span_a, cross_dn_tenkan_kinjunInt, senkou_span_b, chinkou_span, senkou_span_a_displaced, senkou_span_b_displaced, kinjun_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( tenkan_sen <= 0.063572 )
		if( chinkou_span <= 0.063214 )
			if( tenkan_sen <= 0.062339 )
				if( basis_minus <= 0.000381 )
					if( basis_minus <= -8.3e-05 )
						if( kinjun_sen <= 0.062528 )
							if( chinkou_span <= 0.060274 )
								if( senkou_span_b_displaced <= 0.061525 )
									ret := 0.095587
								if( senkou_span_b_displaced > 0.061525 )
									ret := -0.271008
							if( chinkou_span > 0.060274 )
								if( basis_max <= -3e-06 )
									ret := 0.085484
								if( basis_max > -3e-06 )
									ret := 0.389716
						if( kinjun_sen > 0.062528 )
							if( kinjun_sen <= 0.062863 )
								if( tenkan_sen <= 0.062299 )
									ret := -0.831933 // sell
								if( tenkan_sen > 0.062299 )
									ret := -0.200000
							if( kinjun_sen > 0.062863 )
								ret := 0.842105 // buy
					if( basis_minus > -8.3e-05 )
						if( basis_max <= -7.6e-05 )
							if( chinkou_span <= 0.062191 )
								if( tenkan_sen <= 0.054145 )
									ret := 0.352034
								if( tenkan_sen > 0.054145 )
									ret := -0.065868
							if( chinkou_span > 0.062191 )
								if( senkou_span_b <= 0.060648 )
									ret := -0.900000 // sell
								if( senkou_span_b > 0.060648 )
									ret := 0.709877 // buy
						if( basis_max > -7.6e-05 )
							if( tenkan_sen <= 0.04997 )
								if( basis_minus <= -1.4e-05 )
									ret := -0.809524 // sell
								if( basis_minus > -1.4e-05 )
									ret := -1.000000 // sell
							if( tenkan_sen > 0.04997 )
								if( chinkou_span <= 0.062131 )
									ret := -0.034624
								if( chinkou_span > 0.062131 )
									ret := 0.395122
				if( basis_minus > 0.000381 )
					if( tenkan_sen <= 0.050385 )
						if( kinjun_sen <= 0.050555 )
							if( basis_max <= -0.000761 )
								ret := 0.541667
							if( basis_max > -0.000761 )
								if( tenkan_sen <= 0.050284 )
									ret := 0.946429 // buy
								if( tenkan_sen > 0.050284 )
									ret := 0.636364
						if( kinjun_sen > 0.050555 )
							ret := 0.272727
					if( tenkan_sen > 0.050385 )
						if( chinkou_span <= 0.062409 )
							if( senkou_span_a_displaced <= 0.060157 )
								if( senkou_span_b_displaced <= 0.056457 )
									ret := -0.247412
								if( senkou_span_b_displaced > 0.056457 )
									ret := 0.136729
							if( senkou_span_a_displaced > 0.060157 )
								if( chinkou_span <= 0.061489 )
									ret := -0.809187 // sell
								if( chinkou_span > 0.061489 )
									ret := -0.065693
						if( chinkou_span > 0.062409 )
							if( basis_minus <= 0.002306 )
								if( senkou_span_b <= 0.061495 )
									ret := 0.600000
								if( senkou_span_b > 0.061495 )
									ret := 0.875000 // buy
							if( basis_minus > 0.002306 )
								if( basis_minus <= 0.002823 )
									ret := -0.166667
								if( basis_minus > 0.002823 )
									ret := 0.250000
			if( tenkan_sen > 0.062339 )
				if( kinjun_sen <= 0.059525 )
					ret := 1.000000 // buy
				if( kinjun_sen > 0.059525 )
					if( chinkou_span <= 0.062487 )
						if( chinkou_span <= 0.061332 )
							if( basis_minus <= -0.000101 )
								if( basis_max <= 0.000198 )
									ret := -0.428571
								if( basis_max > 0.000198 )
									ret := -0.863636 // sell
							if( basis_minus > -0.000101 )
								if( senkou_span_b <= 0.062662 )
									ret := -0.905660 // sell
								if( senkou_span_b > 0.062662 )
									ret := -1.000000 // sell
						if( chinkou_span > 0.061332 )
							if( senkou_span_a <= 0.063424 )
								if( basis_max <= -7.5e-05 )
									ret := -0.144654
								if( basis_max > -7.5e-05 )
									ret := -0.498994
							if( senkou_span_a > 0.063424 )
								if( senkou_span_b_displaced <= 0.063865 )
									ret := 0.400000
								if( senkou_span_b_displaced > 0.063865 )
									ret := -0.526316
					if( chinkou_span > 0.062487 )
						if( senkou_span_a <= 0.062868 )
							if( basis_minus <= 0.000112 )
								if( basis_max <= 4.2e-05 )
									ret := 0.173184
								if( basis_max > 4.2e-05 )
									ret := 0.648352
							if( basis_minus > 0.000112 )
								if( tenkan_sen <= 0.062745 )
									ret := -0.208651
								if( tenkan_sen > 0.062745 )
									ret := 0.196721
						if( senkou_span_a > 0.062868 )
							if( kinjun_sen <= 0.063892 )
								if( basis_max <= -1.5e-05 )
									ret := -0.379518
								if( basis_max > -1.5e-05 )
									ret := -0.020952
							if( kinjun_sen > 0.063892 )
								if( kinjun_sen <= 0.063946 )
									ret := -0.750000 // sell
								if( kinjun_sen > 0.063946 )
									ret := -1.000000 // sell
		if( chinkou_span > 0.063214 )
			if( kinjun_sen <= 0.062519 )
				if( senkou_span_b_displaced <= 0.062341 )
					if( basis_max <= -0.000131 )
						if( basis_minus <= 0.000925 )
							if( chinkou_span <= 0.06338 )
								if( senkou_span_a <= 0.062766 )
									ret := 0.884615 // buy
								if( senkou_span_a > 0.062766 )
									ret := 1.000000 // buy
							if( chinkou_span > 0.06338 )
								ret := 1.000000 // buy
						if( basis_minus > 0.000925 )
							if( chinkou_span <= 0.063817 )
								ret := 0.866667 // buy
							if( chinkou_span > 0.063817 )
								ret := 0.600000
					if( basis_max > -0.000131 )
						if( basis_minus <= -3.9e-05 )
							if( senkou_span_a_displaced <= 0.061506 )
								ret := 1.000000 // buy
							if( senkou_span_a_displaced > 0.061506 )
								if( senkou_span_a_displaced <= 0.062225 )
									ret := 0.555556
								if( senkou_span_a_displaced > 0.062225 )
									ret := 1.000000 // buy
						if( basis_minus > -3.9e-05 )
							if( tenkan_sen <= 0.059124 )
								if( senkou_span_a_displaced <= 0.057445 )
									ret := 1.000000 // buy
								if( senkou_span_a_displaced > 0.057445 )
									ret := 0.700000 // buy
							if( tenkan_sen > 0.059124 )
								if( tenkan_sen <= 0.059468 )
									ret := -0.666667
								if( tenkan_sen > 0.059468 )
									ret := 0.666667
				if( senkou_span_b_displaced > 0.062341 )
					if( basis_max <= -0.000295 )
						ret := -0.900000 // sell
					if( basis_max > -0.000295 )
						if( senkou_span_a <= 0.061863 )
							ret := 1.000000 // buy
						if( senkou_span_a > 0.061863 )
							if( chinkou_span <= 0.063934 )
								ret := 0.421053
							if( chinkou_span > 0.063934 )
								ret := 1.000000 // buy
			if( kinjun_sen > 0.062519 )
				if( basis_max <= 1.3e-05 )
					if( senkou_span_a <= 0.062849 )
						if( tenkan_sen <= 0.062916 )
							if( basis_minus <= 0.000624 )
								if( senkou_span_b <= 0.062864 )
									ret := 0.842857 // buy
								if( senkou_span_b > 0.062864 )
									ret := 0.300000
							if( basis_minus > 0.000624 )
								ret := 0.428571
						if( tenkan_sen > 0.062916 )
							if( senkou_span_b_displaced <= 0.062292 )
								ret := -0.416667
							if( senkou_span_b_displaced > 0.062292 )
								ret := 0.625000
					if( senkou_span_a > 0.062849 )
						if( senkou_span_b <= 0.063974 )
							if( senkou_span_b <= 0.063315 )
								if( senkou_span_a_displaced <= 0.062351 )
									ret := -0.292683
								if( senkou_span_a_displaced > 0.062351 )
									ret := 0.145427
							if( senkou_span_b > 0.063315 )
								if( senkou_span_a <= 0.063549 )
									ret := 0.565789
								if( senkou_span_a > 0.063549 )
									ret := -0.285714
						if( senkou_span_b > 0.063974 )
							ret := -0.727273 // sell
				if( basis_max > 1.3e-05 )
					if( kinjun_sen <= 0.063303 )
						if( kinjun_sen <= 0.06305 )
							if( senkou_span_a_displaced <= 0.064378 )
								if( senkou_span_a <= 0.062702 )
									ret := 0.730769 // buy
								if( senkou_span_a > 0.062702 )
									ret := -0.074074
							if( senkou_span_a_displaced > 0.064378 )
								ret := 1.000000 // buy
						if( kinjun_sen > 0.06305 )
							if( tenkan_sen <= 0.062965 )
								if( basis_minus <= -0.000307 )
									ret := 0.526316
								if( basis_minus > -0.000307 )
									ret := 0.820513 // buy
							if( tenkan_sen > 0.062965 )
								if( senkou_span_a <= 0.063158 )
									ret := 0.857143 // buy
								if( senkou_span_a > 0.063158 )
									ret := 0.965812 // buy
					if( kinjun_sen > 0.063303 )
						if( basis_max <= 5.2e-05 )
							if( chinkou_span <= 0.064956 )
								if( basis_max <= 3.9e-05 )
									ret := 0.522523
								if( basis_max > 3.9e-05 )
									ret := 0.833333 // buy
							if( chinkou_span > 0.064956 )
								ret := -0.105263
						if( basis_max > 5.2e-05 )
							if( senkou_span_b <= 0.064825 )
								if( chinkou_span <= 0.064465 )
									ret := 0.162420
								if( chinkou_span > 0.064465 )
									ret := 0.700000 // buy
							if( senkou_span_b > 0.064825 )
								if( senkou_span_b <= 0.067047 )
									ret := 0.809524 // buy
								if( senkou_span_b > 0.067047 )
									ret := 1.000000 // buy
	if( tenkan_sen > 0.063572 )
		if( chinkou_span <= 0.064127 )
			if( tenkan_sen <= 0.064841 )
				if( senkou_span_b_displaced <= 0.06381 )
					if( senkou_span_b <= 0.063757 )
						if( senkou_span_a_displaced <= 0.063506 )
							if( senkou_span_b <= 0.063638 )
								if( senkou_span_b <= 0.063542 )
									ret := -0.296364
								if( senkou_span_b > 0.063542 )
									ret := -0.819820 // sell
							if( senkou_span_b > 0.063638 )
								ret := 1.000000 // buy
						if( senkou_span_a_displaced > 0.063506 )
							if( kinjun_sen <= 0.063718 )
								if( senkou_span_b_displaced <= 0.063568 )
									ret := -0.111111
								if( senkou_span_b_displaced > 0.063568 )
									ret := -0.928571 // sell
							if( kinjun_sen > 0.063718 )
								if( senkou_span_a <= 0.063827 )
									ret := 0.706897 // buy
								if( senkou_span_a > 0.063827 )
									ret := -0.243902
					if( senkou_span_b > 0.063757 )
						if( senkou_span_a <= 0.064452 )
							if( kinjun_sen <= 0.063948 )
								if( tenkan_sen <= 0.063988 )
									ret := -0.239130
								if( tenkan_sen > 0.063988 )
									ret := -0.809524 // sell
							if( kinjun_sen > 0.063948 )
								if( basis_max <= -0.000117 )
									ret := -0.944444 // sell
								if( basis_max > -0.000117 )
									ret := -0.611111
						if( senkou_span_a > 0.064452 )
							ret := 0.409091
				if( senkou_span_b_displaced > 0.06381 )
					if( basis_minus <= -0.000485 )
						if( senkou_span_a <= 0.063993 )
							if( chinkou_span <= 0.06295 )
								if( kinjun_sen <= 0.06405 )
									ret := -1.000000 // sell
								if( kinjun_sen > 0.06405 )
									ret := -0.666667
							if( chinkou_span > 0.06295 )
								if( basis_minus <= -0.000673 )
									ret := -0.166667
								if( basis_minus > -0.000673 )
									ret := 0.468085
						if( senkou_span_a > 0.063993 )
							if( basis_max <= 8.2e-05 )
								if( chinkou_span <= 0.063863 )
									ret := -1.000000 // sell
								if( chinkou_span > 0.063863 )
									ret := -0.600000
							if( basis_max > 8.2e-05 )
								if( senkou_span_b <= 0.066594 )
									ret := -0.566667
								if( senkou_span_b > 0.066594 )
									ret := -0.920000 // sell
					if( basis_minus > -0.000485 )
						if( basis_minus <= 0.000274 )
							if( senkou_span_b_displaced <= 0.066851 )
								if( senkou_span_b <= 0.063727 )
									ret := 0.640625
								if( senkou_span_b > 0.063727 )
									ret := -0.150592
							if( senkou_span_b_displaced > 0.066851 )
								ret := 1.000000 // buy
						if( basis_minus > 0.000274 )
							if( senkou_span_b <= 0.063967 )
								if( senkou_span_a <= 0.063523 )
									ret := -1.000000 // sell
								if( senkou_span_a > 0.063523 )
									ret := -0.758621 // sell
							if( senkou_span_b > 0.063967 )
								if( kinjun_sen <= 0.064909 )
									ret := 0.115385
								if( kinjun_sen > 0.064909 )
									ret := -1.000000 // sell
			if( tenkan_sen > 0.064841 )
				if( basis_minus <= -0.0024 )
					ret := 0.562500
				if( basis_minus > -0.0024 )
					if( chinkou_span <= 0.064088 )
						if( tenkan_sen <= 0.065267 )
							if( kinjun_sen <= 0.065513 )
								if( tenkan_sen <= 0.065245 )
									ret := -0.762712 // sell
								if( tenkan_sen > 0.065245 )
									ret := 0.181818
							if( kinjun_sen > 0.065513 )
								if( basis_minus <= -0.000539 )
									ret := -0.272727
								if( basis_minus > -0.000539 )
									ret := 0.333333
						if( tenkan_sen > 0.065267 )
							if( senkou_span_a <= 0.066775 )
								if( senkou_span_b_displaced <= 0.066115 )
									ret := -0.933333 // sell
								if( senkou_span_b_displaced > 0.066115 )
									ret := -0.658537
							if( senkou_span_a > 0.066775 )
								if( chinkou_span <= 0.061635 )
									ret := -0.897959 // sell
								if( chinkou_span > 0.061635 )
									ret := -0.992188 // sell
					if( chinkou_span > 0.064088 )
						if( senkou_span_a_displaced <= 0.065712 )
							ret := -0.230769
						if( senkou_span_a_displaced > 0.065712 )
							ret := -0.538462
		if( chinkou_span > 0.064127 )
			if( senkou_span_a <= 0.064906 )
				if( senkou_span_a_displaced <= 0.062754 )
					if( senkou_span_b <= 0.063118 )
						if( basis_minus <= 0.000856 )
							ret := 0.818182 // buy
						if( basis_minus > 0.000856 )
							ret := 0.125000
					if( senkou_span_b > 0.063118 )
						if( senkou_span_b_displaced <= 0.06201 )
							if( senkou_span_a_displaced <= 0.060752 )
								ret := -1.000000 // sell
							if( senkou_span_a_displaced > 0.060752 )
								ret := -0.888889 // sell
						if( senkou_span_b_displaced > 0.06201 )
							ret := -0.473684
				if( senkou_span_a_displaced > 0.062754 )
					if( kinjun_sen <= 0.06368 )
						if( senkou_span_a <= 0.063487 )
							ret := 0.052632
						if( senkou_span_a > 0.063487 )
							if( senkou_span_b_displaced <= 0.064053 )
								if( tenkan_sen <= 0.06378 )
									ret := 0.858209 // buy
								if( tenkan_sen > 0.06378 )
									ret := 0.536585
							if( senkou_span_b_displaced > 0.064053 )
								ret := 1.000000 // buy
					if( kinjun_sen > 0.06368 )
						if( basis_max <= -0.000118 )
							if( basis_minus <= 0.000876 )
								if( basis_max <= -0.000368 )
									ret := 1.000000 // buy
								if( basis_max > -0.000368 )
									ret := -0.292490
							if( basis_minus > 0.000876 )
								if( senkou_span_b_displaced <= 0.062288 )
									ret := 1.000000 // buy
								if( senkou_span_b_displaced > 0.062288 )
									ret := 0.555556
						if( basis_max > -0.000118 )
							if( senkou_span_a_displaced <= 0.06502 )
								if( kinjun_sen <= 0.063723 )
									ret := -0.744186 // sell
								if( kinjun_sen > 0.063723 )
									ret := 0.288618
							if( senkou_span_a_displaced > 0.06502 )
								if( chinkou_span <= 0.064934 )
									ret := 0.219008
								if( chinkou_span > 0.064934 )
									ret := 0.772201 // buy
			if( senkou_span_a > 0.064906 )
				if( senkou_span_b <= 0.160444 )
					if( senkou_span_a <= 0.06573 )
						if( kinjun_sen <= 0.06555 )
							if( chinkou_span <= 0.065261 )
								if( basis_max <= 0.000243 )
									ret := -0.239777
								if( basis_max > 0.000243 )
									ret := 0.750000 // buy
							if( chinkou_span > 0.065261 )
								if( chinkou_span <= 0.066331 )
									ret := 0.166552
								if( chinkou_span > 0.066331 )
									ret := 0.518519
						if( kinjun_sen > 0.06555 )
							if( chinkou_span <= 0.06569 )
								if( senkou_span_a_displaced <= 0.065559 )
									ret := -0.733333 // sell
								if( senkou_span_a_displaced > 0.065559 )
									ret := 0.180258
							if( chinkou_span > 0.06569 )
								if( basis_minus <= -0.00012 )
									ret := 0.384615
								if( basis_minus > -0.00012 )
									ret := 0.669065
					if( senkou_span_a > 0.06573 )
						if( senkou_span_b <= 0.06599 )
							if( senkou_span_a <= 0.066609 )
								if( chinkou_span <= 0.06603 )
									ret := -0.472843
								if( chinkou_span > 0.06603 )
									ret := 0.108982
							if( senkou_span_a > 0.066609 )
								if( basis_max <= -2e-05 )
									ret := -0.834711 // sell
								if( basis_max > -2e-05 )
									ret := 0.357143
						if( senkou_span_b > 0.06599 )
							if( basis_minus <= -0.001401 )
								if( senkou_span_b <= 0.072533 )
									ret := 0.630814
								if( senkou_span_b > 0.072533 )
									ret := 0.072120
							if( basis_minus > -0.001401 )
								if( chinkou_span <= 0.06632 )
									ret := -0.289146
								if( chinkou_span > 0.06632 )
									ret := 0.000321
				if( senkou_span_b > 0.160444 )
					if( kinjun_sen <= 0.162299 )
						if( senkou_span_b <= 0.161963 )
							if( tenkan_sen <= 0.162246 )
								if( chinkou_span <= 0.160288 )
									ret := -0.563786
								if( chinkou_span > 0.160288 )
									ret := 0.138462
							if( tenkan_sen > 0.162246 )
								ret := 0.538462
						if( senkou_span_b > 0.161963 )
							if( chinkou_span <= 0.157794 )
								if( chinkou_span <= 0.157583 )
									ret := -1.000000 // sell
								if( chinkou_span > 0.157583 )
									ret := -0.888889 // sell
							if( chinkou_span > 0.157794 )
								if( senkou_span_a_displaced <= 0.161263 )
									ret := -1.000000 // sell
								if( senkou_span_a_displaced > 0.161263 )
									ret := -0.653061
					if( kinjun_sen > 0.162299 )
						if( kinjun_sen <= 0.16546 )
							if( basis_max <= -0.000446 )
								if( basis_minus <= 0.002641 )
									ret := -0.583333
								if( basis_minus > 0.002641 )
									ret := -1.000000 // sell
							if( basis_max > -0.000446 )
								if( basis_minus <= -0.002088 )
									ret := 0.900000 // buy
								if( basis_minus > -0.002088 )
									ret := 0.088235
						if( kinjun_sen > 0.16546 )
							if( basis_max <= -0.000337 )
								ret := -0.153846
							if( basis_max > -0.000337 )
								if( senkou_span_b <= 0.165043 )
									ret := -0.090909
								if( senkou_span_b > 0.165043 )
									ret := -0.810526 // sell
	
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
float op_operation = decision_tree_0_TRXUSDT_15Min_6beb9d25(tenkan_sen, basis_minus, cross_up_tenkan_kinjunInt, senkou_span_a, cross_dn_tenkan_kinjunInt, senkou_span_b, chinkou_span, senkou_span_a_displaced, senkou_span_b_displaced, kinjun_sen, basis_max)

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


