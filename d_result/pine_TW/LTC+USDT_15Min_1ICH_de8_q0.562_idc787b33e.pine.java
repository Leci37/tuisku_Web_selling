//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: LTCUSDT_15Min_1ICH_c787b33e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LTCUSDT_15Min_1ICH_c787b33e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LTCUSDT_15Min_c787b33e(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( basis_max <= 0.002543 )
		if( kinjun_sen <= 102.908 )
			if( chinkou_span <= 100.808 )
				if( kinjun_sen <= 100.022 )
					if( chinkou_span <= 93.5284 )
						if( senkou_span_a <= 92.0037 )
							if( basis_max <= -1.35053 )
								if( senkou_span_a_displaced <= 69.5254 )
									ret := -0.775862 // sell
								if( senkou_span_a_displaced > 69.5254 )
									ret := -0.309859
							if( basis_max > -1.35053 )
								if( chinkou_span <= 89.2209 )
									ret := 0.003372
								if( chinkou_span > 89.2209 )
									ret := 0.190443
						if( senkou_span_a > 92.0037 )
							if( basis_max <= -0.050043 )
								if( senkou_span_a <= 94.9587 )
									ret := -0.373545
								if( senkou_span_a > 94.9587 )
									ret := -0.836735 // sell
							if( basis_max > -0.050043 )
								if( chinkou_span <= 91.7126 )
									ret := -0.631068
								if( chinkou_span > 91.7126 )
									ret := -0.025735
					if( chinkou_span > 93.5284 )
						if( senkou_span_a <= 92.9468 )
							if( tenkan_sen <= 92.0125 )
								if( basis_minus <= 0.092752 )
									ret := 0.639640
								if( basis_minus > 0.092752 )
									ret := 0.862745 // buy
							if( tenkan_sen > 92.0125 )
								if( senkou_span_a_displaced <= 90.5975 )
									ret := -0.288889
								if( senkou_span_a_displaced > 90.5975 )
									ret := 0.613900
						if( senkou_span_a > 92.9468 )
							if( senkou_span_a <= 95.9933 )
								if( basis_minus <= 1.11375 )
									ret := 0.068517
								if( basis_minus > 1.11375 )
									ret := 0.354167
							if( senkou_span_a > 95.9933 )
								if( chinkou_span <= 96.6783 )
									ret := -0.318267
								if( chinkou_span > 96.6783 )
									ret := 0.109694
				if( kinjun_sen > 100.022 )
					if( senkou_span_b_displaced <= 102.444 )
						if( senkou_span_a_displaced <= 98.8358 )
							if( tenkan_sen <= 101.229 )
								if( senkou_span_a <= 100.505 )
									ret := 0.000000
								if( senkou_span_a > 100.505 )
									ret := -0.500000
							if( tenkan_sen > 101.229 )
								if( tenkan_sen <= 101.496 )
									ret := 1.000000 // buy
								if( tenkan_sen > 101.496 )
									ret := 0.000000
						if( senkou_span_a_displaced > 98.8358 )
							if( chinkou_span <= 99.186 )
								if( kinjun_sen <= 101.213 )
									ret := -0.882353 // sell
								if( kinjun_sen > 101.213 )
									ret := 0.000000
							if( chinkou_span > 99.186 )
								if( tenkan_sen <= 100.446 )
									ret := 0.045455
								if( tenkan_sen > 100.446 )
									ret := -0.536082
					if( senkou_span_b_displaced > 102.444 )
						if( kinjun_sen <= 100.62 )
							if( senkou_span_b <= 101.268 )
								ret := 0.800000 // buy
							if( senkou_span_b > 101.268 )
								if( chinkou_span <= 100.209 )
									ret := -0.250000
								if( chinkou_span > 100.209 )
									ret := -1.000000 // sell
						if( kinjun_sen > 100.62 )
							if( senkou_span_b <= 101.7 )
								ret := 1.000000 // buy
							if( senkou_span_b > 101.7 )
								ret := 0.750000 // buy
			if( chinkou_span > 100.808 )
				if( basis_max <= -0.319209 )
					if( basis_minus <= 2.48033 )
						if( senkou_span_b <= 99.7602 )
							if( senkou_span_a_displaced <= 98.9279 )
								if( senkou_span_b_displaced <= 99.4825 )
									ret := 0.300000
								if( senkou_span_b_displaced > 99.4825 )
									ret := -0.625000
							if( senkou_span_a_displaced > 98.9279 )
								if( chinkou_span <= 101.419 )
									ret := 0.916667 // buy
								if( chinkou_span > 101.419 )
									ret := 0.416667
						if( senkou_span_b > 99.7602 )
							if( senkou_span_b_displaced <= 100.73 )
								if( senkou_span_a_displaced <= 98.8825 )
									ret := -0.250000
								if( senkou_span_a_displaced > 98.8825 )
									ret := -0.763158 // sell
							if( senkou_span_b_displaced > 100.73 )
								if( basis_minus <= 0.362872 )
									ret := -0.375000
								if( basis_minus > 0.362872 )
									ret := 0.633333
					if( basis_minus > 2.48033 )
						if( basis_minus <= 4.9575 )
							if( basis_minus <= 2.74375 )
								if( basis_minus <= 2.53497 )
									ret := 1.000000 // buy
								if( basis_minus > 2.53497 )
									ret := -0.400000
							if( basis_minus > 2.74375 )
								if( senkou_span_a_displaced <= 86.0636 )
									ret := 0.400000
								if( senkou_span_a_displaced > 86.0636 )
									ret := 0.909091 // buy
						if( basis_minus > 4.9575 )
							if( senkou_span_b_displaced <= 90.5243 )
								if( tenkan_sen <= 100.11 )
									ret := -0.600000
								if( tenkan_sen > 100.11 )
									ret := 0.076923
							if( senkou_span_b_displaced > 90.5243 )
								ret := -1.000000 // sell
				if( basis_max > -0.319209 )
					if( kinjun_sen <= 100.749 )
						if( senkou_span_a <= 94.46 )
							ret := -0.750000 // sell
						if( senkou_span_a > 94.46 )
							if( senkou_span_b <= 101.045 )
								if( chinkou_span <= 103.435 )
									ret := 0.675000
								if( chinkou_span > 103.435 )
									ret := 0.962963 // buy
							if( senkou_span_b > 101.045 )
								if( senkou_span_a_displaced <= 101.125 )
									ret := -0.571429
								if( senkou_span_a_displaced > 101.125 )
									ret := 0.454545
					if( kinjun_sen > 100.749 )
						if( tenkan_sen <= 102.637 )
							if( senkou_span_a <= 101.544 )
								if( basis_minus <= -0.41188 )
									ret := -0.259259
								if( basis_minus > -0.41188 )
									ret := 0.532468
							if( senkou_span_a > 101.544 )
								if( kinjun_sen <= 101.514 )
									ret := -1.000000 // sell
								if( kinjun_sen > 101.514 )
									ret := -0.134328
						if( tenkan_sen > 102.637 )
							if( basis_minus <= 1.40928 )
								if( chinkou_span <= 103.368 )
									ret := 0.953488 // buy
								if( chinkou_span > 103.368 )
									ret := 0.714286 // buy
							if( basis_minus > 1.40928 )
								if( senkou_span_b <= 101.466 )
									ret := -0.333333
								if( senkou_span_b > 101.466 )
									ret := 1.000000 // buy
		if( kinjun_sen > 102.908 )
			if( chinkou_span <= 104.825 )
				if( chinkou_span <= 102.465 )
					if( tenkan_sen <= 104.46 )
						if( senkou_span_b_displaced <= 101.605 )
							if( basis_minus <= 1.04273 )
								ret := 0.000000
							if( basis_minus > 1.04273 )
								ret := 0.750000 // buy
						if( senkou_span_b_displaced > 101.605 )
							if( chinkou_span <= 100.067 )
								ret := -0.166667
							if( chinkou_span > 100.067 )
								if( senkou_span_a_displaced <= 103.834 )
									ret := -0.890411 // sell
								if( senkou_span_a_displaced > 103.834 )
									ret := -0.300000
					if( tenkan_sen > 104.46 )
						if( basis_minus <= 4.19625 )
							if( senkou_span_a_displaced <= 102.956 )
								if( chinkou_span <= 98.6178 )
									ret := -0.250000
								if( chinkou_span > 98.6178 )
									ret := -0.800000 // sell
							if( senkou_span_a_displaced > 102.956 )
								if( tenkan_sen <= 104.67 )
									ret := -0.500000
								if( tenkan_sen > 104.67 )
									ret := -0.933333 // sell
						if( basis_minus > 4.19625 )
							ret := -1.000000 // sell
				if( chinkou_span > 102.465 )
					if( basis_minus <= 3.69125 )
						if( senkou_span_a <= 103.935 )
							if( basis_minus <= 0.60625 )
								if( chinkou_span <= 102.63 )
									ret := 0.250000
								if( chinkou_span > 102.63 )
									ret := 0.000000
							if( basis_minus > 0.60625 )
								if( senkou_span_a <= 103.462 )
									ret := -0.916667 // sell
								if( senkou_span_a > 103.462 )
									ret := -0.275862
						if( senkou_span_a > 103.935 )
							if( tenkan_sen <= 110.22 )
								if( basis_max <= -0.14875 )
									ret := -0.827586 // sell
								if( basis_max > -0.14875 )
									ret := -0.521739
							if( tenkan_sen > 110.22 )
								ret := 0.250000
					if( basis_minus > 3.69125 )
						ret := 1.000000 // buy
			if( chinkou_span > 104.825 )
				if( basis_minus <= 6.4756 )
					if( kinjun_sen <= 111.686 )
						if( senkou_span_a <= 110.353 )
							if( chinkou_span <= 107.986 )
								if( basis_minus <= -0.943329 )
									ret := 0.538462
								if( basis_minus > -0.943329 )
									ret := -0.110497
							if( chinkou_span > 107.986 )
								if( senkou_span_a <= 107.009 )
									ret := 0.612245
								if( senkou_span_a > 107.009 )
									ret := -0.111111
						if( senkou_span_a > 110.353 )
							if( chinkou_span <= 113.138 )
								if( chinkou_span <= 111.302 )
									ret := 1.000000 // buy
								if( chinkou_span > 111.302 )
									ret := 0.612903
							if( chinkou_span > 113.138 )
								ret := 0.000000
					if( kinjun_sen > 111.686 )
						if( basis_max <= -0.186536 )
							if( senkou_span_a_displaced <= 110.492 )
								if( senkou_span_b <= 111.066 )
									ret := -0.928571 // sell
								if( senkou_span_b > 111.066 )
									ret := -0.750000 // sell
							if( senkou_span_a_displaced > 110.492 )
								ret := -0.333333
						if( basis_max > -0.186536 )
							ret := 0.500000
				if( basis_minus > 6.4756 )
					ret := -1.000000 // sell
	if( basis_max > 0.002543 )
		if( senkou_span_b <= 100.047 )
			if( chinkou_span <= 98.8409 )
				if( senkou_span_b <= 45.56 )
					if( basis_minus <= -0.14375 )
						if( basis_max <= 0.574085 )
							if( basis_minus <= -0.71269 )
								if( senkou_span_b <= 44.215 )
									ret := 0.844828 // buy
								if( senkou_span_b > 44.215 )
									ret := 0.285714
							if( basis_minus > -0.71269 )
								if( chinkou_span <= 44.1212 )
									ret := 0.500000
								if( chinkou_span > 44.1212 )
									ret := 0.980769 // buy
						if( basis_max > 0.574085 )
							if( kinjun_sen <= 44.4251 )
								ret := 0.250000
							if( kinjun_sen > 44.4251 )
								ret := -1.000000 // sell
					if( basis_minus > -0.14375 )
						if( tenkan_sen <= 43.006 )
							if( senkou_span_b_displaced <= 43.3755 )
								ret := -1.000000 // sell
							if( senkou_span_b_displaced > 43.3755 )
								ret := -0.200000
						if( tenkan_sen > 43.006 )
							if( tenkan_sen <= 45.9059 )
								if( basis_max <= 0.06859 )
									ret := -0.076923
								if( basis_max > 0.06859 )
									ret := 0.809524 // buy
							if( tenkan_sen > 45.9059 )
								if( senkou_span_b_displaced <= 44.0175 )
									ret := -0.916667 // sell
								if( senkou_span_b_displaced > 44.0175 )
									ret := 0.444444
				if( senkou_span_b > 45.56 )
					if( kinjun_sen <= 45.996 )
						if( senkou_span_a_displaced <= 46.059 )
							if( chinkou_span <= 46.1706 )
								ret := -1.000000 // sell
							if( chinkou_span > 46.1706 )
								if( basis_minus <= -0.825793 )
									ret := -0.866667 // sell
								if( basis_minus > -0.825793 )
									ret := -0.600000
						if( senkou_span_a_displaced > 46.059 )
							if( tenkan_sen <= 45.1648 )
								if( basis_minus <= -2.69056 )
									ret := 0.000000
								if( basis_minus > -2.69056 )
									ret := -0.804878 // sell
							if( tenkan_sen > 45.1648 )
								if( senkou_span_a_displaced <= 47.2556 )
									ret := -0.500000
								if( senkou_span_a_displaced > 47.2556 )
									ret := 0.750000 // buy
					if( kinjun_sen > 45.996 )
						if( chinkou_span <= 48.641 )
							if( kinjun_sen <= 48.2674 )
								if( senkou_span_a_displaced <= 49.1323 )
									ret := 0.252101
								if( senkou_span_a_displaced > 49.1323 )
									ret := -0.347826
							if( kinjun_sen > 48.2674 )
								if( senkou_span_b_displaced <= 50.6916 )
									ret := -0.918182 // sell
								if( senkou_span_b_displaced > 50.6916 )
									ret := -0.562500
						if( chinkou_span > 48.641 )
							if( senkou_span_a_displaced <= 55.1806 )
								if( kinjun_sen <= 50.0193 )
									ret := 0.666667
								if( kinjun_sen > 50.0193 )
									ret := 0.207910
							if( senkou_span_a_displaced > 55.1806 )
								if( kinjun_sen <= 94.2617 )
									ret := 0.091378
								if( kinjun_sen > 94.2617 )
									ret := -0.038856
			if( chinkou_span > 98.8409 )
				if( senkou_span_a <= 100.175 )
					if( senkou_span_a_displaced <= 99.5376 )
						if( basis_max <= 0.010374 )
							if( kinjun_sen <= 94.765 )
								ret := -1.000000 // sell
							if( kinjun_sen > 94.765 )
								if( basis_max <= 0.007347 )
									ret := 1.000000 // buy
								if( basis_max > 0.007347 )
									ret := 0.000000
						if( basis_max > 0.010374 )
							if( senkou_span_a_displaced <= 98.2525 )
								if( senkou_span_a <= 99.2343 )
									ret := 0.883721 // buy
								if( senkou_span_a > 99.2343 )
									ret := 0.250000
							if( senkou_span_a_displaced > 98.2525 )
								if( senkou_span_b_displaced <= 99.8322 )
									ret := 0.393617
								if( senkou_span_b_displaced > 99.8322 )
									ret := 0.913043 // buy
					if( senkou_span_a_displaced > 99.5376 )
						if( senkou_span_a <= 99.6738 )
							if( senkou_span_b_displaced <= 101.22 )
								if( senkou_span_a <= 99.5036 )
									ret := 0.566667
								if( senkou_span_a > 99.5036 )
									ret := 0.108108
							if( senkou_span_b_displaced > 101.22 )
								if( basis_max <= 0.54125 )
									ret := 0.357143
								if( basis_max > 0.54125 )
									ret := -0.909091 // sell
						if( senkou_span_a > 99.6738 )
							if( senkou_span_b_displaced <= 99.8667 )
								ret := 0.000000
							if( senkou_span_b_displaced > 99.8667 )
								if( kinjun_sen <= 99.8102 )
									ret := -0.250000
								if( kinjun_sen > 99.8102 )
									ret := -1.000000 // sell
				if( senkou_span_a > 100.175 )
					if( chinkou_span <= 99.5872 )
						if( basis_max <= 0.212685 )
							ret := -1.000000 // sell
						if( basis_max > 0.212685 )
							ret := -0.500000
					if( chinkou_span > 99.5872 )
						if( basis_max <= 0.10125 )
							ret := -0.428571
						if( basis_max > 0.10125 )
							if( chinkou_span <= 100.325 )
								ret := 0.000000
							if( chinkou_span > 100.325 )
								ret := 0.500000
		if( senkou_span_b > 100.047 )
			if( chinkou_span <= 100.275 )
				if( tenkan_sen <= 100.567 )
					if( senkou_span_a_displaced <= 100.497 )
						if( senkou_span_a_displaced <= 99.8934 )
							if( senkou_span_b <= 100.187 )
								ret := -0.500000
							if( senkou_span_b > 100.187 )
								ret := -1.000000 // sell
						if( senkou_span_a_displaced > 99.8934 )
							if( chinkou_span <= 98.89 )
								if( senkou_span_a <= 98.6512 )
									ret := -0.428571
								if( senkou_span_a > 98.6512 )
									ret := -0.941176 // sell
							if( chinkou_span > 98.89 )
								if( basis_minus <= -0.595 )
									ret := 0.000000
								if( basis_minus > -0.595 )
									ret := -0.333333
					if( senkou_span_a_displaced > 100.497 )
						if( senkou_span_a <= 100.543 )
							if( chinkou_span <= 96.002 )
								if( senkou_span_b <= 100.253 )
									ret := -0.166667
								if( senkou_span_b > 100.253 )
									ret := -0.807692 // sell
							if( chinkou_span > 96.002 )
								if( kinjun_sen <= 101.45 )
									ret := -0.141379
								if( kinjun_sen > 101.45 )
									ret := 0.727273 // buy
						if( senkou_span_a > 100.543 )
							if( basis_minus <= -1.37037 )
								if( kinjun_sen <= 101.738 )
									ret := -0.166667
								if( kinjun_sen > 101.738 )
									ret := -1.000000 // sell
							if( basis_minus > -1.37037 )
								if( basis_max <= 0.065367 )
									ret := -0.857143 // sell
								if( basis_max > 0.065367 )
									ret := 0.753846 // buy
				if( tenkan_sen > 100.567 )
					if( senkou_span_a_displaced <= 99.5504 )
						ret := 0.714286 // buy
					if( senkou_span_a_displaced > 99.5504 )
						if( senkou_span_a_displaced <= 109.425 )
							if( kinjun_sen <= 100.797 )
								ret := -1.000000 // sell
							if( kinjun_sen > 100.797 )
								if( senkou_span_a_displaced <= 101.205 )
									ret := -0.281250
								if( senkou_span_a_displaced > 101.205 )
									ret := -0.771084 // sell
						if( senkou_span_a_displaced > 109.425 )
							ret := 0.666667
			if( chinkou_span > 100.275 )
				if( kinjun_sen <= 107.196 )
					if( senkou_span_a <= 104.691 )
						if( senkou_span_a_displaced <= 103.347 )
							if( chinkou_span <= 105.169 )
								if( basis_minus <= -0.46745 )
									ret := 0.468085
								if( basis_minus > -0.46745 )
									ret := 0.004484
							if( chinkou_span > 105.169 )
								if( tenkan_sen <= 101.952 )
									ret := 1.000000 // buy
								if( tenkan_sen > 101.952 )
									ret := 0.500000
						if( senkou_span_a_displaced > 103.347 )
							if( kinjun_sen <= 102.137 )
								if( tenkan_sen <= 100.608 )
									ret := -0.166667
								if( tenkan_sen > 100.608 )
									ret := -1.000000 // sell
							if( kinjun_sen > 102.137 )
								if( tenkan_sen <= 101.823 )
									ret := 0.857143 // buy
								if( tenkan_sen > 101.823 )
									ret := -0.250000
					if( senkou_span_a > 104.691 )
						if( chinkou_span <= 107.382 )
							if( senkou_span_a_displaced <= 106.323 )
								if( basis_minus <= 1.835 )
									ret := 0.032258
								if( basis_minus > 1.835 )
									ret := 1.000000 // buy
							if( senkou_span_a_displaced > 106.323 )
								if( kinjun_sen <= 105.767 )
									ret := 0.394737
								if( kinjun_sen > 105.767 )
									ret := 0.906667 // buy
						if( chinkou_span > 107.382 )
							if( tenkan_sen <= 106.44 )
								ret := 0.428571
							if( tenkan_sen > 106.44 )
								if( basis_max <= 0.075796 )
									ret := -1.000000 // sell
								if( basis_max > 0.075796 )
									ret := -0.250000
				if( kinjun_sen > 107.196 )
					if( senkou_span_a_displaced <= 105.229 )
						ret := 0.750000 // buy
					if( senkou_span_a_displaced > 105.229 )
						if( senkou_span_b_displaced <= 107.623 )
							if( cross_dn_tenkan_kinjunInt <= 0.5 )
								if( basis_max <= 1.39049 )
									ret := -0.903846 // sell
								if( basis_max > 1.39049 )
									ret := -0.500000
							if( cross_dn_tenkan_kinjunInt > 0.5 )
								ret := 0.250000
						if( senkou_span_b_displaced > 107.623 )
							if( senkou_span_b <= 109.568 )
								if( senkou_span_a_displaced <= 110.857 )
									ret := -0.142857
								if( senkou_span_a_displaced > 110.857 )
									ret := 1.000000 // buy
							if( senkou_span_b > 109.568 )
								if( chinkou_span <= 109.935 )
									ret := -0.742424 // sell
								if( chinkou_span > 109.935 )
									ret := -0.142857
	
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
float op_operation = decision_tree_0_LTCUSDT_15Min_c787b33e(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)

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


