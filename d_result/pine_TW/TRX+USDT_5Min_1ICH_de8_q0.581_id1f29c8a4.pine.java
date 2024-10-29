//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: TRXUSDT_5Min_1ICH_1f29c8a4 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_5Min_1ICH_1f29c8a4", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_5Min_1f29c8a4(tenkan_sen, basis_minus, cross_up_tenkan_kinjunInt, senkou_span_a, cross_dn_tenkan_kinjunInt, senkou_span_b, chinkou_span, senkou_span_a_displaced, senkou_span_b_displaced, kinjun_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( chinkou_span <= 0.103897 )
		if( senkou_span_b_displaced <= 0.103333 )
			if( senkou_span_b <= 0.074859 )
				if( senkou_span_b <= 0.07433 )
					if( basis_minus <= 0.000323 )
						if( senkou_span_a_displaced <= 0.072656 )
							if( chinkou_span <= 0.072828 )
								ret := 0.166667
							if( chinkou_span > 0.072828 )
								if( senkou_span_a_displaced <= 0.072299 )
									ret := 0.707317 // buy
								if( senkou_span_a_displaced > 0.072299 )
									ret := 0.977778 // buy
						if( senkou_span_a_displaced > 0.072656 )
							if( chinkou_span <= 0.072319 )
								if( kinjun_sen <= 0.072681 )
									ret := -0.526316
								if( kinjun_sen > 0.072681 )
									ret := -0.866667 // sell
							if( chinkou_span > 0.072319 )
								if( kinjun_sen <= 0.074239 )
									ret := 0.216010
								if( kinjun_sen > 0.074239 )
									ret := -0.326316
					if( basis_minus > 0.000323 )
						if( senkou_span_b_displaced <= 0.072401 )
							ret := -1.000000 // sell
						if( senkou_span_b_displaced > 0.072401 )
							ret := -0.600000
				if( senkou_span_b > 0.07433 )
					if( senkou_span_a <= 0.074902 )
						if( basis_minus <= -0.000168 )
							ret := 0.312500
						if( basis_minus > -0.000168 )
							if( chinkou_span <= 0.075519 )
								if( basis_minus <= 0.000222 )
									ret := 0.689441
								if( basis_minus > 0.000222 )
									ret := 0.938776 // buy
							if( chinkou_span > 0.075519 )
								if( basis_minus <= 2.7e-05 )
									ret := 1.000000 // buy
								if( basis_minus > 2.7e-05 )
									ret := 0.935484 // buy
					if( senkou_span_a > 0.074902 )
						if( basis_max <= -8.2e-05 )
							if( chinkou_span <= 0.075631 )
								ret := 0.588235
							if( chinkou_span > 0.075631 )
								if( basis_minus <= 0.000251 )
									ret := 1.000000 // buy
								if( basis_minus > 0.000251 )
									ret := 0.733333 // buy
						if( basis_max > -8.2e-05 )
							if( chinkou_span <= 0.074697 )
								ret := -0.500000
							if( chinkou_span > 0.074697 )
								if( kinjun_sen <= 0.074958 )
									ret := 0.361111
								if( kinjun_sen > 0.074958 )
									ret := -0.125000
			if( senkou_span_b > 0.074859 )
				if( senkou_span_a <= 0.075455 )
					if( kinjun_sen <= 0.074571 )
						ret := 0.687500
					if( kinjun_sen > 0.074571 )
						if( basis_max <= 2.9e-05 )
							if( kinjun_sen <= 0.074738 )
								if( basis_max <= -1.3e-05 )
									ret := -1.000000 // sell
								if( basis_max > -1.3e-05 )
									ret := -0.833333 // sell
							if( kinjun_sen > 0.074738 )
								if( chinkou_span <= 0.075555 )
									ret := -0.578603
								if( chinkou_span > 0.075555 )
									ret := 0.600000
						if( basis_max > 2.9e-05 )
							if( senkou_span_b_displaced <= 0.075723 )
								if( kinjun_sen <= 0.075157 )
									ret := 0.131579
								if( kinjun_sen > 0.075157 )
									ret := -0.931034 // sell
							if( senkou_span_b_displaced > 0.075723 )
								if( basis_minus <= -0.000194 )
									ret := -0.937500 // sell
								if( basis_minus > -0.000194 )
									ret := -0.200000
				if( senkou_span_a > 0.075455 )
					if( basis_max <= -0.000337 )
						if( basis_minus <= 0.000528 )
							if( tenkan_sen <= 0.088184 )
								ret := -0.214286
							if( tenkan_sen > 0.088184 )
								ret := -0.181818
						if( basis_minus > 0.000528 )
							if( senkou_span_b_displaced <= 0.080516 )
								if( tenkan_sen <= 0.090426 )
									ret := -0.250000
								if( tenkan_sen > 0.090426 )
									ret := -1.000000 // sell
							if( senkou_span_b_displaced > 0.080516 )
								if( tenkan_sen <= 0.10086 )
									ret := -0.959596 // sell
								if( tenkan_sen > 0.10086 )
									ret := -0.619048
					if( basis_max > -0.000337 )
						if( tenkan_sen <= 0.092075 )
							if( senkou_span_b_displaced <= 0.091105 )
								if( senkou_span_a <= 0.075602 )
									ret := 0.538961
								if( senkou_span_a > 0.075602 )
									ret := -0.028076
							if( senkou_span_b_displaced > 0.091105 )
								if( kinjun_sen <= 0.091249 )
									ret := -0.562500
								if( kinjun_sen > 0.091249 )
									ret := -0.227119
						if( tenkan_sen > 0.092075 )
							if( chinkou_span <= 0.1029 )
								if( senkou_span_a <= 0.102433 )
									ret := 0.039292
								if( senkou_span_a > 0.102433 )
									ret := -0.299605
							if( chinkou_span > 0.1029 )
								if( kinjun_sen <= 0.103581 )
									ret := 0.273616
								if( kinjun_sen > 0.103581 )
									ret := -0.627358
		if( senkou_span_b_displaced > 0.103333 )
			if( tenkan_sen <= 0.103483 )
				if( senkou_span_a <= 0.103184 )
					if( senkou_span_a_displaced <= 0.10283 )
						if( chinkou_span <= 0.103065 )
							if( senkou_span_a_displaced <= 0.102811 )
								if( basis_max <= -1e-05 )
									ret := -0.250000
								if( basis_max > -1e-05 )
									ret := 0.833333 // buy
							if( senkou_span_a_displaced > 0.102811 )
								ret := 1.000000 // buy
						if( chinkou_span > 0.103065 )
							ret := -0.521739
					if( senkou_span_a_displaced > 0.10283 )
						if( basis_minus <= -0.000555 )
							if( senkou_span_a_displaced <= 0.103229 )
								if( chinkou_span <= 0.102385 )
									ret := -0.911765 // sell
								if( chinkou_span > 0.102385 )
									ret := 0.000000
							if( senkou_span_a_displaced > 0.103229 )
								if( senkou_span_b_displaced <= 0.104441 )
									ret := 0.532847
								if( senkou_span_b_displaced > 0.104441 )
									ret := -0.636364
						if( basis_minus > -0.000555 )
							if( tenkan_sen <= 0.102591 )
								if( senkou_span_a_displaced <= 0.103395 )
									ret := -0.921053 // sell
								if( senkou_span_a_displaced > 0.103395 )
									ret := -0.657143
							if( tenkan_sen > 0.102591 )
								if( chinkou_span <= 0.102158 )
									ret := -0.856502 // sell
								if( chinkou_span > 0.102158 )
									ret := 0.026667
				if( senkou_span_a > 0.103184 )
					if( chinkou_span <= 0.102725 )
						if( chinkou_span <= 0.10221 )
							if( senkou_span_a_displaced <= 0.105588 )
								if( tenkan_sen <= 0.103165 )
									ret := -0.900000 // sell
								if( tenkan_sen > 0.103165 )
									ret := -1.000000 // sell
							if( senkou_span_a_displaced > 0.105588 )
								ret := -0.875000 // sell
						if( chinkou_span > 0.10221 )
							if( basis_minus <= -0.000155 )
								if( senkou_span_b_displaced <= 0.1043 )
									ret := -0.085714
								if( senkou_span_b_displaced > 0.1043 )
									ret := -0.707317 // sell
							if( basis_minus > -0.000155 )
								if( kinjun_sen <= 0.103391 )
									ret := -0.700000 // sell
								if( kinjun_sen > 0.103391 )
									ret := -0.944444 // sell
					if( chinkou_span > 0.102725 )
						if( basis_minus <= -0.00084 )
							ret := -1.000000 // sell
						if( basis_minus > -0.00084 )
							if( senkou_span_a <= 0.103368 )
								if( senkou_span_a_displaced <= 0.103458 )
									ret := -0.094017
								if( senkou_span_a_displaced > 0.103458 )
									ret := 0.632836
							if( senkou_span_a > 0.103368 )
								if( senkou_span_b <= 0.103428 )
									ret := 0.473214
								if( senkou_span_b > 0.103428 )
									ret := -0.062500
			if( tenkan_sen > 0.103483 )
				if( basis_minus <= -0.000606 )
					if( kinjun_sen <= 0.104205 )
						ret := -0.357143
					if( kinjun_sen > 0.104205 )
						if( tenkan_sen <= 0.104251 )
							ret := -0.600000
						if( tenkan_sen > 0.104251 )
							if( senkou_span_a <= 0.104728 )
								ret := -1.000000 // sell
							if( senkou_span_a > 0.104728 )
								ret := -0.875000 // sell
				if( basis_minus > -0.000606 )
					if( basis_minus <= 0.000355 )
						if( tenkan_sen <= 0.104032 )
							if( senkou_span_b_displaced <= 0.105034 )
								if( chinkou_span <= 0.103539 )
									ret := -0.640504
								if( chinkou_span > 0.103539 )
									ret := -0.151631
							if( senkou_span_b_displaced > 0.105034 )
								if( basis_max <= 8.4e-05 )
									ret := -0.105263
								if( basis_max > 8.4e-05 )
									ret := 0.700000 // buy
						if( tenkan_sen > 0.104032 )
							if( senkou_span_a_displaced <= 0.104794 )
								if( basis_max <= -2e-06 )
									ret := -0.517857
								if( basis_max > -2e-06 )
									ret := -0.861736 // sell
							if( senkou_span_a_displaced > 0.104794 )
								if( senkou_span_a <= 0.104498 )
									ret := 0.035714
								if( senkou_span_a > 0.104498 )
									ret := -0.541667
					if( basis_minus > 0.000355 )
						if( basis_max <= -2e-05 )
							if( senkou_span_a <= 0.104183 )
								ret := -0.083333
							if( senkou_span_a > 0.104183 )
								ret := 0.954545 // buy
						if( basis_max > -2e-05 )
							if( tenkan_sen <= 0.104293 )
								ret := -0.933333 // sell
							if( tenkan_sen > 0.104293 )
								ret := -0.857143 // sell
	if( chinkou_span > 0.103897 )
		if( senkou_span_a <= 0.10422 )
			if( tenkan_sen <= 0.103584 )
				if( basis_minus <= 0.000138 )
					if( basis_max <= -7.9e-05 )
						ret := 0.269231
					if( basis_max > -7.9e-05 )
						if( chinkou_span <= 0.104216 )
							if( basis_max <= -2.9e-05 )
								if( senkou_span_a_displaced <= 0.103067 )
									ret := 1.000000 // buy
								if( senkou_span_a_displaced > 0.103067 )
									ret := 0.800000 // buy
							if( basis_max > -2.9e-05 )
								if( tenkan_sen <= 0.10356 )
									ret := 0.638614
								if( tenkan_sen > 0.10356 )
									ret := 0.200000
						if( chinkou_span > 0.104216 )
							if( tenkan_sen <= 0.103373 )
								if( senkou_span_a_displaced <= 0.102933 )
									ret := 0.925373 // buy
								if( senkou_span_a_displaced > 0.102933 )
									ret := 0.679245
							if( tenkan_sen > 0.103373 )
								if( basis_minus <= 7.9e-05 )
									ret := 1.000000 // buy
								if( basis_minus > 7.9e-05 )
									ret := 0.916667 // buy
				if( basis_minus > 0.000138 )
					if( tenkan_sen <= 0.103473 )
						if( tenkan_sen <= 0.103158 )
							ret := 0.222222
						if( tenkan_sen > 0.103158 )
							if( senkou_span_a <= 0.103353 )
								if( chinkou_span <= 0.104225 )
									ret := 0.769231 // buy
								if( chinkou_span > 0.104225 )
									ret := 1.000000 // buy
							if( senkou_span_a > 0.103353 )
								ret := 0.454545
					if( tenkan_sen > 0.103473 )
						if( chinkou_span <= 0.104253 )
							ret := -0.818182 // sell
						if( chinkou_span > 0.104253 )
							ret := 1.000000 // buy
			if( tenkan_sen > 0.103584 )
				if( chinkou_span <= 0.10445 )
					if( senkou_span_b <= 0.103682 )
						if( kinjun_sen <= 0.10378 )
							if( tenkan_sen <= 0.103927 )
								if( chinkou_span <= 0.104023 )
									ret := 0.019608
								if( chinkou_span > 0.104023 )
									ret := 0.543353
							if( tenkan_sen > 0.103927 )
								if( chinkou_span <= 0.104377 )
									ret := 0.938462 // buy
								if( chinkou_span > 0.104377 )
									ret := 0.666667
						if( kinjun_sen > 0.10378 )
							if( senkou_span_a <= 0.103936 )
								ret := -0.062500
							if( senkou_span_a > 0.103936 )
								ret := -0.400000
					if( senkou_span_b > 0.103682 )
						if( senkou_span_b_displaced <= 0.103792 )
							if( senkou_span_b <= 0.103778 )
								if( senkou_span_a_displaced <= 0.103574 )
									ret := -0.416667
								if( senkou_span_a_displaced > 0.103574 )
									ret := -0.011364
							if( senkou_span_b > 0.103778 )
								if( tenkan_sen <= 0.104018 )
									ret := 0.805369 // buy
								if( tenkan_sen > 0.104018 )
									ret := 0.184713
						if( senkou_span_b_displaced > 0.103792 )
							if( basis_minus <= 0.000126 )
								if( senkou_span_a_displaced <= 0.104515 )
									ret := -0.103030
								if( senkou_span_a_displaced > 0.104515 )
									ret := 0.634921
							if( basis_minus > 0.000126 )
								if( chinkou_span <= 0.10415 )
									ret := 0.100000
								if( chinkou_span > 0.10415 )
									ret := -0.894737 // sell
				if( chinkou_span > 0.10445 )
					if( basis_max <= -0.000133 )
						if( chinkou_span <= 0.104542 )
							ret := 0.437500
						if( chinkou_span > 0.104542 )
							ret := 1.000000 // buy
					if( basis_max > -0.000133 )
						if( senkou_span_b_displaced <= 0.103807 )
							if( chinkou_span <= 0.104905 )
								if( basis_max <= -4e-06 )
									ret := 0.735714 // buy
								if( basis_max > -4e-06 )
									ret := 0.090909
							if( chinkou_span > 0.104905 )
								ret := -0.166667
						if( senkou_span_b_displaced > 0.103807 )
							if( tenkan_sen <= 0.104205 )
								if( senkou_span_a_displaced <= 0.103823 )
									ret := 0.368421
								if( senkou_span_a_displaced > 0.103823 )
									ret := 0.833333 // buy
							if( tenkan_sen > 0.104205 )
								if( basis_max <= -4.6e-05 )
									ret := 0.545455
								if( basis_max > -4.6e-05 )
									ret := 0.100000
		if( senkou_span_a > 0.10422 )
			if( chinkou_span <= 0.104997 )
				if( senkou_span_a <= 0.104739 )
					if( basis_max <= -2.4e-05 )
						if( chinkou_span <= 0.104618 )
							if( basis_minus <= 0.000235 )
								if( senkou_span_b_displaced <= 0.104246 )
									ret := -0.739837 // sell
								if( senkou_span_b_displaced > 0.104246 )
									ret := -0.408451
							if( basis_minus > 0.000235 )
								if( senkou_span_b <= 0.103925 )
									ret := -0.485437
								if( senkou_span_b > 0.103925 )
									ret := 0.391304
						if( chinkou_span > 0.104618 )
							if( senkou_span_a <= 0.104447 )
								if( kinjun_sen <= 0.10414 )
									ret := -0.384615
								if( kinjun_sen > 0.10414 )
									ret := 0.546296
							if( senkou_span_a > 0.104447 )
								if( senkou_span_b <= 0.104172 )
									ret := 0.352941
								if( senkou_span_b > 0.104172 )
									ret := -0.218182
					if( basis_max > -2.4e-05 )
						if( basis_max <= -2.2e-05 )
							if( senkou_span_b <= 0.104471 )
								ret := -0.076923
							if( senkou_span_b > 0.104471 )
								if( kinjun_sen <= 0.104557 )
									ret := 0.733333 // buy
								if( kinjun_sen > 0.104557 )
									ret := 0.964286 // buy
						if( basis_max > -2.2e-05 )
							if( basis_minus <= -1.8e-05 )
								if( senkou_span_b_displaced <= 0.105083 )
									ret := -0.256831
								if( senkou_span_b_displaced > 0.105083 )
									ret := 0.278846
							if( basis_minus > -1.8e-05 )
								if( senkou_span_b <= 0.10431 )
									ret := 0.482759
								if( senkou_span_b > 0.10431 )
									ret := -0.041667
				if( senkou_span_a > 0.104739 )
					if( kinjun_sen <= 0.106991 )
						if( basis_minus <= -0.000376 )
							if( chinkou_span <= 0.104096 )
								ret := 1.000000 // buy
							if( chinkou_span > 0.104096 )
								if( senkou_span_a_displaced <= 0.106131 )
									ret := 0.800000 // buy
								if( senkou_span_a_displaced > 0.106131 )
									ret := -0.800000 // sell
						if( basis_minus > -0.000376 )
							if( basis_minus <= 4.1e-05 )
								if( cross_dn_tenkan_kinjunInt <= 0.5 )
									ret := -0.663701
								if( cross_dn_tenkan_kinjunInt > 0.5 )
									ret := 0.125000
							if( basis_minus > 4.1e-05 )
								if( kinjun_sen <= 0.1061 )
									ret := -0.401345
								if( kinjun_sen > 0.1061 )
									ret := -0.862069 // sell
					if( kinjun_sen > 0.106991 )
						if( tenkan_sen <= 0.107777 )
							if( chinkou_span <= 0.104415 )
								ret := -1.000000 // sell
							if( chinkou_span > 0.104415 )
								ret := -0.666667
						if( tenkan_sen > 0.107777 )
							ret := -1.000000 // sell
			if( chinkou_span > 0.104997 )
				if( senkou_span_b <= 0.107834 )
					if( tenkan_sen <= 0.10533 )
						if( senkou_span_a_displaced <= 0.1071 )
							if( senkou_span_a <= 0.104284 )
								if( chinkou_span <= 0.105446 )
									ret := -0.846154 // sell
								if( chinkou_span > 0.105446 )
									ret := -0.555556
							if( senkou_span_a > 0.104284 )
								if( kinjun_sen <= 0.104713 )
									ret := 0.674473
								if( kinjun_sen > 0.104713 )
									ret := 0.405904
						if( senkou_span_a_displaced > 0.1071 )
							ret := -1.000000 // sell
					if( tenkan_sen > 0.10533 )
						if( senkou_span_a_displaced <= 0.104377 )
							if( basis_minus <= 0.00051 )
								if( senkou_span_a <= 0.106146 )
									ret := -0.979592 // sell
								if( senkou_span_a > 0.106146 )
									ret := -0.791667 // sell
							if( basis_minus > 0.00051 )
								ret := 0.153846
						if( senkou_span_a_displaced > 0.104377 )
							if( tenkan_sen <= 0.107565 )
								if( senkou_span_a_displaced <= 0.108915 )
									ret := 0.099844
								if( senkou_span_a_displaced > 0.108915 )
									ret := 0.869565 // buy
							if( tenkan_sen > 0.107565 )
								if( basis_max <= -0.000214 )
									ret := 0.660714
								if( basis_max > -0.000214 )
									ret := 0.211163
				if( senkou_span_b > 0.107834 )
					if( chinkou_span <= 0.107701 )
						if( basis_max <= 0.000345 )
							if( senkou_span_b <= 0.107866 )
								if( basis_minus <= -0.000161 )
									ret := 0.022222
								if( basis_minus > -0.000161 )
									ret := -0.611111
							if( senkou_span_b > 0.107866 )
								if( chinkou_span <= 0.106073 )
									ret := 0.833333 // buy
								if( chinkou_span > 0.106073 )
									ret := -0.777927 // sell
						if( basis_max > 0.000345 )
							if( kinjun_sen <= 0.108439 )
								if( senkou_span_b_displaced <= 0.109669 )
									ret := 0.500000
								if( senkou_span_b_displaced > 0.109669 )
									ret := 0.666667
							if( kinjun_sen > 0.108439 )
								ret := -0.818182 // sell
					if( chinkou_span > 0.107701 )
						if( tenkan_sen <= 0.108274 )
							if( basis_minus <= -0.000102 )
								if( basis_max <= -3.6e-05 )
									ret := -0.068966
								if( basis_max > -3.6e-05 )
									ret := 0.619048
							if( basis_minus > -0.000102 )
								if( senkou_span_b_displaced <= 0.108335 )
									ret := 0.166163
								if( senkou_span_b_displaced > 0.108335 )
									ret := -0.282828
						if( tenkan_sen > 0.108274 )
							if( chinkou_span <= 0.109157 )
								if( kinjun_sen <= 0.109427 )
									ret := -0.245492
								if( kinjun_sen > 0.109427 )
									ret := -0.650000
							if( chinkou_span > 0.109157 )
								if( kinjun_sen <= 0.109197 )
									ret := 0.512798
								if( kinjun_sen > 0.109197 )
									ret := 0.003885
	
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
float op_operation = decision_tree_0_TRXUSDT_5Min_1f29c8a4(tenkan_sen, basis_minus, cross_up_tenkan_kinjunInt, senkou_span_a, cross_dn_tenkan_kinjunInt, senkou_span_b, chinkou_span, senkou_span_a_displaced, senkou_span_b_displaced, kinjun_sen, basis_max)

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


