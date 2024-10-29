//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: BABA_30Min_2BS0_0c6b2cb5 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BABA_30Min_2BS0_0c6b2cb5", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BABA_30Min_0c6b2cb5(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( smoothD_d <= 92.5042 )
		if( bbp <= -6.30131 )
			if( bearPower <= -8.21452 )
				if( k <= 0.285283 )
					if( d_k <= 6.4946 )
						ret := 1.000000 // buy
					if( d_k > 6.4946 )
						ret := 0.000000
				if( k > 0.285283 )
					if( k <= 3.94374 )
						if( rsi1 <= 13.755 )
							if( d_k <= 1.82489 )
								ret := -1.000000 // sell
							if( d_k > 1.82489 )
								ret := -0.750000 // sell
						if( rsi1 > 13.755 )
							if( smoothD_d <= 8.04287 )
								ret := 0.250000
							if( smoothD_d > 8.04287 )
								if( d_k <= 23.5639 )
									ret := -1.000000 // sell
								if( d_k > 23.5639 )
									ret := -0.500000
					if( k > 3.94374 )
						if( bullPower <= -5.28328 )
							if( d_k <= -2.14595 )
								ret := 0.400000
							if( d_k > -2.14595 )
								if( bearPower <= -9.98826 )
									ret := -0.833333 // sell
								if( bearPower > -9.98826 )
									ret := 0.000000
						if( bullPower > -5.28328 )
							if( bbp <= -12.2235 )
								if( bbp <= -13.5934 )
									ret := 0.600000
								if( bbp > -13.5934 )
									ret := 1.000000 // buy
							if( bbp > -12.2235 )
								if( rsi1 <= 20.8051 )
									ret := 0.250000
								if( rsi1 > 20.8051 )
									ret := -0.625000
			if( bearPower > -8.21452 )
				if( smoothK_k <= 24.8937 )
					if( rsi1 <= 16.2123 )
						if( smoothK_k <= -1.04462 )
							if( bearPower <= -4.53228 )
								if( bullPower <= -3.10148 )
									ret := 0.630435
								if( bullPower > -3.10148 )
									ret := 0.214286
							if( bearPower > -4.53228 )
								if( bbp <= -6.3833 )
									ret := -0.088235
								if( bbp > -6.3833 )
									ret := 0.857143 // buy
						if( smoothK_k > -1.04462 )
							if( bbp <= -6.78829 )
								if( d <= 38.1716 )
									ret := -0.303571
								if( d > 38.1716 )
									ret := 1.000000 // buy
							if( bbp > -6.78829 )
								if( rsi1 <= 11.6426 )
									ret := 0.000000
								if( rsi1 > 11.6426 )
									ret := 0.833333 // buy
					if( rsi1 > 16.2123 )
						if( rsi1 <= 23.6784 )
							if( d_k <= 0.034161 )
								if( bbm <= 0.539983 )
									ret := -0.750000 // sell
								if( bbm > 0.539983 )
									ret := 0.526882
							if( d_k > 0.034161 )
								if( bullPower <= -3.83222 )
									ret := 0.916667 // buy
								if( bullPower > -3.83222 )
									ret := 0.690722
						if( rsi1 > 23.6784 )
							if( rsi1 <= 31.1733 )
								if( smoothK_k <= 3.15505 )
									ret := -0.272727
								if( smoothK_k > 3.15505 )
									ret := 0.293103
							if( rsi1 > 31.1733 )
								if( d_k <= -2.45395 )
									ret := -0.333333
								if( d_k > -2.45395 )
									ret := 0.636364
				if( smoothK_k > 24.8937 )
					if( d_k <= -18.6183 )
						if( bullPower <= -2.62557 )
							ret := -0.142857
						if( bullPower > -2.62557 )
							ret := -1.000000 // sell
					if( d_k > -18.6183 )
						if( bbm <= 6.10058 )
							if( rsi1 <= 37.3215 )
								if( rsi1 <= 32.7136 )
									ret := 0.066667
								if( rsi1 > 32.7136 )
									ret := -0.461538
							if( rsi1 > 37.3215 )
								if( bullPower <= -2.2842 )
									ret := 0.687500
								if( bullPower > -2.2842 )
									ret := 0.000000
						if( bbm > 6.10058 )
							ret := 1.000000 // buy
		if( bbp > -6.30131 )
			if( rsi1 <= 14.6062 )
				if( bullPower <= -1.52157 )
					if( d_k <= 0.587491 )
						if( rsi1 <= 14.3861 )
							if( rsi1 <= 9.20484 )
								if( k <= 0.490764 )
									ret := -0.388889
								if( k > 0.490764 )
									ret := 0.621622
							if( rsi1 > 9.20484 )
								if( d_k <= -0.225676 )
									ret := 0.476923
								if( d_k > -0.225676 )
									ret := 0.841270 // buy
						if( rsi1 > 14.3861 )
							if( rsi1 <= 14.5047 )
								ret := -0.500000
							if( rsi1 > 14.5047 )
								ret := 0.000000
					if( d_k > 0.587491 )
						if( rsi1 <= 7.29187 )
							if( bbm <= 0.485 )
								ret := -0.333333
							if( bbm > 0.485 )
								ret := -1.000000 // sell
						if( rsi1 > 7.29187 )
							if( bbp <= -5.89519 )
								if( rsi1 <= 11.5818 )
									ret := 0.200000
								if( rsi1 > 11.5818 )
									ret := -0.625000
							if( bbp > -5.89519 )
								if( bbm <= 0.412507 )
									ret := -0.277778
								if( bbm > 0.412507 )
									ret := 0.531646
				if( bullPower > -1.52157 )
					if( d_k <= -0.585737 )
						if( bbp <= -1.45487 )
							if( rsi1 <= 14.0171 )
								if( bullPower <= -1.48228 )
									ret := -0.750000 // sell
								if( bullPower > -1.48228 )
									ret := 0.625000
							if( rsi1 > 14.0171 )
								if( bbm <= 0.818505 )
									ret := -0.066667
								if( bbm > 0.818505 )
									ret := 0.888889 // buy
						if( bbp > -1.45487 )
							if( d <= 3.59336 )
								if( smoothK_k <= -0.897978 )
									ret := 0.466667
								if( smoothK_k > -0.897978 )
									ret := -0.234043
							if( d > 3.59336 )
								if( d_k <= -4.58943 )
									ret := -0.090909
								if( d_k > -4.58943 )
									ret := 0.515625
					if( d_k > -0.585737 )
						if( k <= 1.53318 )
							if( rsi1 <= 12.1376 )
								if( k <= 0.335426 )
									ret := -0.166667
								if( k > 0.335426 )
									ret := 0.222222
							if( rsi1 > 12.1376 )
								if( bbm <= 0.345 )
									ret := -0.105263
								if( bbm > 0.345 )
									ret := 0.485149
						if( k > 1.53318 )
							if( smoothK_k <= -0.541324 )
								if( smoothK_k <= -0.989285 )
									ret := -0.228571
								if( smoothK_k > -0.989285 )
									ret := -0.764706 // sell
							if( smoothK_k > -0.541324 )
								if( bbp <= -1.25388 )
									ret := -0.129032
								if( bbp > -1.25388 )
									ret := 0.352941
			if( rsi1 > 14.6062 )
				if( d_k <= 13.0421 )
					if( bearPower <= -1.39667 )
						if( bbm <= 2.28131 )
							if( d_k <= -3.40475 )
								if( k <= 6.49451 )
									ret := 0.564103
								if( k > 6.49451 )
									ret := 0.076664
							if( d_k > -3.40475 )
								if( smoothD_d <= -2.27223 )
									ret := 0.188742
								if( smoothD_d > -2.27223 )
									ret := -0.057272
						if( bbm > 2.28131 )
							if( d_k <= 5.90441 )
								if( bullPower <= -1.35638 )
									ret := -0.696970
								if( bullPower > -1.35638 )
									ret := -0.187104
							if( d_k > 5.90441 )
								if( bbm <= 2.60266 )
									ret := -0.254237
								if( bbm > 2.60266 )
									ret := 0.111111
					if( bearPower > -1.39667 )
						if( smoothK_k <= -2.75938 )
							if( rsi1 <= 23.9812 )
								if( bbm <= 0.16995 )
									ret := 0.227273
								if( bbm > 0.16995 )
									ret := -0.166667
							if( rsi1 > 23.9812 )
								if( bbp <= -0.895394 )
									ret := 0.413284
								if( bbp > -0.895394 )
									ret := 0.165816
						if( smoothK_k > -2.75938 )
							if( d <= 94.4931 )
								if( smoothK_k <= 93.0909 )
									ret := 0.047921
								if( smoothK_k > 93.0909 )
									ret := -0.024872
							if( d > 94.4931 )
								if( k <= 99.1123 )
									ret := 0.130056
								if( k > 99.1123 )
									ret := 0.429448
				if( d_k > 13.0421 )
					if( bullPower <= 1.4254 )
						if( d <= 31.0781 )
							if( d <= 28.7229 )
								if( d_k <= 16.2656 )
									ret := 0.201331
								if( d_k > 16.2656 )
									ret := -0.007669
							if( d > 28.7229 )
								if( rsi1 <= 51.8459 )
									ret := -0.091837
								if( rsi1 > 51.8459 )
									ret := -0.462366
						if( d > 31.0781 )
							if( smoothD_d <= 43.4323 )
								if( bullPower <= 0.124761 )
									ret := 0.138389
								if( bullPower > 0.124761 )
									ret := 0.319616
							if( smoothD_d > 43.4323 )
								if( smoothD_d <= 78.8478 )
									ret := 0.065052
								if( smoothD_d > 78.8478 )
									ret := 0.182421
					if( bullPower > 1.4254 )
						if( smoothD_d <= 47.5711 )
							if( rsi1 <= 60.4728 )
								if( d_k <= 19.3774 )
									ret := -0.645161
								if( d_k > 19.3774 )
									ret := 0.200000
							if( rsi1 > 60.4728 )
								if( rsi1 <= 81.3817 )
									ret := 0.467890
								if( rsi1 > 81.3817 )
									ret := -0.733333 // sell
						if( smoothD_d > 47.5711 )
							if( smoothK_k <= 33.0573 )
								if( bbm <= 0.9279 )
									ret := 0.250000
								if( bbm > 0.9279 )
									ret := 0.857143 // buy
							if( smoothK_k > 33.0573 )
								if( bullPower <= 3.58411 )
									ret := 0.232558
								if( bullPower > 3.58411 )
									ret := 0.736842 // buy
	if( smoothD_d > 92.5042 )
		if( bbp <= 2.88207 )
			if( BBPower_Color <= 0.5 )
				if( d_k <= -0.502386 )
					if( bullPower <= 0.028684 )
						if( bbp <= -1.76507 )
							if( d <= 97.1352 )
								if( rsi1 <= 46.1294 )
									ret := 1.000000 // buy
								if( rsi1 > 46.1294 )
									ret := 0.750000 // buy
							if( d > 97.1352 )
								ret := 0.250000
						if( bbp > -1.76507 )
							if( smoothD_d <= 94.8138 )
								if( smoothD_d <= 92.9391 )
									ret := 0.571429
								if( smoothD_d > 92.9391 )
									ret := -0.466667
							if( smoothD_d > 94.8138 )
								if( bearPower <= -0.229644 )
									ret := 0.586207
								if( bearPower > -0.229644 )
									ret := -0.500000
					if( bullPower > 0.028684 )
						if( k <= 97.8919 )
							if( d_k <= -1.50265 )
								if( d <= 95.7895 )
									ret := 0.750000 // buy
								if( d > 95.7895 )
									ret := 0.500000
							if( d_k > -1.50265 )
								ret := 1.000000 // buy
						if( k > 97.8919 )
							if( bbp <= 0.002603 )
								if( bearPower <= -1.93952 )
									ret := -0.750000 // sell
								if( bearPower > -1.93952 )
									ret := 0.189873
							if( bbp > 0.002603 )
								if( d_k <= -1.28201 )
									ret := 0.300000
								if( d_k > -1.28201 )
									ret := 1.000000 // buy
				if( d_k > -0.502386 )
					if( bullPower <= -0.717807 )
						if( rsi1 <= 30.4695 )
							ret := -0.285714
						if( rsi1 > 30.4695 )
							if( smoothK_k <= 93.6148 )
								ret := -0.750000 // sell
							if( smoothK_k > 93.6148 )
								ret := -1.000000 // sell
					if( bullPower > -0.717807 )
						if( rsi1 <= 60.97 )
							if( bearPower <= -0.618085 )
								if( rsi1 <= 47.6341 )
									ret := 0.569231
								if( rsi1 > 47.6341 )
									ret := 0.023810
							if( bearPower > -0.618085 )
								if( d <= 99.6131 )
									ret := -0.011111
								if( d > 99.6131 )
									ret := -0.271930
						if( rsi1 > 60.97 )
							if( bbm <= 0.54378 )
								if( k <= 94.7266 )
									ret := -0.111111
								if( k > 94.7266 )
									ret := 0.589474
							if( bbm > 0.54378 )
								if( rsi1 <= 89.2546 )
									ret := -0.151163
								if( rsi1 > 89.2546 )
									ret := 0.916667 // buy
			if( BBPower_Color > 0.5 )
				if( bullPower <= 0.713431 )
					if( d_k <= -2.86582 )
						if( rsi1 <= 82.9279 )
							if( d_k <= -3.86219 )
								if( k <= 99.9861 )
									ret := -0.750000 // sell
								if( k > 99.9861 )
									ret := 0.000000
							if( d_k > -3.86219 )
								if( smoothK_k <= 96.3229 )
									ret := 0.000000
								if( smoothK_k > 96.3229 )
									ret := -0.645161
						if( rsi1 > 82.9279 )
							if( bbp <= 0.569018 )
								ret := -0.600000
							if( bbp > 0.569018 )
								if( bbp <= 0.848027 )
									ret := 0.888889 // buy
								if( bbp > 0.848027 )
									ret := 0.166667
					if( d_k > -2.86582 )
						if( d_k <= -0.171378 )
							if( d <= 96.8479 )
								if( smoothK_k <= 94.3036 )
									ret := 0.108696
								if( smoothK_k > 94.3036 )
									ret := -0.301887
							if( d > 96.8479 )
								if( rsi1 <= 71.1223 )
									ret := -0.058252
								if( rsi1 > 71.1223 )
									ret := 0.239234
						if( d_k > -0.171378 )
							if( d <= 97.5171 )
								if( d_k <= 0.136384 )
									ret := -0.346939
								if( d_k > 0.136384 )
									ret := -0.029880
							if( d > 97.5171 )
								if( rsi1 <= 86.4635 )
									ret := -0.180153
								if( rsi1 > 86.4635 )
									ret := -0.545455
				if( bullPower > 0.713431 )
					if( d <= 98.2537 )
						if( smoothK_k <= 87.7632 )
							if( k <= 89.0974 )
								if( bullPower <= 1.45187 )
									ret := 0.250000
								if( bullPower > 1.45187 )
									ret := 0.500000
							if( k > 89.0974 )
								if( rsi1 <= 59.4014 )
									ret := 0.000000
								if( rsi1 > 59.4014 )
									ret := -0.666667
						if( smoothK_k > 87.7632 )
							if( smoothK_k <= 90.2332 )
								if( bbm <= 0.691946 )
									ret := 0.111111
								if( bbm > 0.691946 )
									ret := 0.567164
							if( smoothK_k > 90.2332 )
								if( k <= 97.3322 )
									ret := 0.001658
								if( k > 97.3322 )
									ret := 0.156900
					if( d > 98.2537 )
						if( bearPower <= 0.029318 )
							if( bbp <= 0.761733 )
								if( d_k <= 0.036146 )
									ret := 0.357143
								if( d_k > 0.036146 )
									ret := -0.600000
							if( bbp > 0.761733 )
								if( d_k <= -0.011546 )
									ret := -0.840000 // sell
								if( d_k > -0.011546 )
									ret := -0.303030
						if( bearPower > 0.029318 )
							if( k <= 99.4953 )
								if( k <= 97.6249 )
									ret := 0.114035
								if( k > 97.6249 )
									ret := -0.201893
							if( k > 99.4953 )
								if( rsi1 <= 94.7534 )
									ret := 0.017817
								if( rsi1 > 94.7534 )
									ret := 0.576923
		if( bbp > 2.88207 )
			if( d <= 99.8058 )
				if( bbm <= 1.20946 )
					if( rsi1 <= 72.3423 )
						if( smoothK_k <= 96.8056 )
							if( d_k <= 0.661964 )
								if( bullPower <= 2.05561 )
									ret := 0.111111
								if( bullPower > 2.05561 )
									ret := 0.888889 // buy
							if( d_k > 0.661964 )
								if( k <= 91.905 )
									ret := 0.625000
								if( k > 91.905 )
									ret := -0.142857
						if( smoothK_k > 96.8056 )
							if( bbp <= 3.53944 )
								ret := -0.200000
							if( bbp > 3.53944 )
								ret := -0.600000
					if( rsi1 > 72.3423 )
						if( rsi1 <= 86.2893 )
							if( bbm <= 0.961967 )
								if( d_k <= 3.99974 )
									ret := -0.429787
								if( d_k > 3.99974 )
									ret := 0.266667
							if( bbm > 0.961967 )
								if( smoothD_d <= 93.9855 )
									ret := -0.391304
								if( smoothD_d > 93.9855 )
									ret := 0.233333
						if( rsi1 > 86.2893 )
							if( bearPower <= 1.75558 )
								if( rsi1 <= 92.3898 )
									ret := -0.093023
								if( rsi1 > 92.3898 )
									ret := -0.605263
							if( bearPower > 1.75558 )
								if( k <= 98.2802 )
									ret := 0.410959
								if( k > 98.2802 )
									ret := -0.049383
				if( bbm > 1.20946 )
					if( bbp <= 3.05756 )
						if( d_k <= 0.419048 )
							if( d_k <= -0.988043 )
								ret := 0.000000
							if( d_k > -0.988043 )
								if( k <= 98.2333 )
									ret := 1.000000 // buy
								if( k > 98.2333 )
									ret := 0.750000 // buy
						if( d_k > 0.419048 )
							if( d_k <= 2.86674 )
								if( d <= 97.6242 )
									ret := -1.000000 // sell
								if( d > 97.6242 )
									ret := 0.000000
							if( d_k > 2.86674 )
								ret := 0.750000 // buy
					if( bbp > 3.05756 )
						if( rsi1 <= 76.12 )
							if( smoothD_d <= 92.9177 )
								if( k <= 98.4911 )
									ret := 0.200000
								if( k > 98.4911 )
									ret := -0.800000 // sell
							if( smoothD_d > 92.9177 )
								if( d <= 98.3968 )
									ret := -0.888889 // sell
								if( d > 98.3968 )
									ret := -0.583333
						if( rsi1 > 76.12 )
							if( k <= 98.0137 )
								if( k <= 96.6252 )
									ret := -0.369565
								if( k > 96.6252 )
									ret := 0.400000
							if( k > 98.0137 )
								if( bullPower <= 3.78401 )
									ret := -0.679487
								if( bullPower > 3.78401 )
									ret := -0.240741
			if( d > 99.8058 )
				if( rsi1 <= 96.1399 )
					if( rsi1 <= 91.1183 )
						if( bearPower <= 0.720756 )
							ret := -1.000000 // sell
						if( bearPower > 0.720756 )
							if( bbm <= 0.951449 )
								if( d <= 99.9514 )
									ret := 0.400000
								if( d > 99.9514 )
									ret := -0.266667
							if( bbm > 0.951449 )
								if( bearPower <= 1.05184 )
									ret := 0.142857
								if( bearPower > 1.05184 )
									ret := 0.730769 // buy
					if( rsi1 > 91.1183 )
						if( rsi1 <= 93.1243 )
							if( bullPower <= 3.26349 )
								ret := -1.000000 // sell
							if( bullPower > 3.26349 )
								ret := -0.750000 // sell
						if( rsi1 > 93.1243 )
							if( bbm <= 0.848549 )
								if( bullPower <= 4.07141 )
									ret := 0.000000
								if( bullPower > 4.07141 )
									ret := -1.000000 // sell
							if( bbm > 0.848549 )
								ret := 0.571429
				if( rsi1 > 96.1399 )
					if( bullPower <= 2.48828 )
						ret := -0.250000
					if( bullPower > 2.48828 )
						if( d <= 99.9163 )
							ret := 0.428571
						if( d > 99.9163 )
							if( bearPower <= 3.77172 )
								if( bbm <= 1.08893 )
									ret := 0.750000 // buy
								if( bbm > 1.08893 )
									ret := 1.000000 // buy
							if( bearPower > 3.77172 )
								ret := 0.750000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


//CODE associated with the technical indicator L_Stochastic_RSI 
//@version=5
//indicator title="Stochastic RSI", shorttitle="Stoch RSI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
smoothK = input.int(3, "K", minval=1)
smoothD = input.int(3, "D", minval=1)
lengthRSI = input.int(14, "RSI Length", minval=1)
lengthStoch = input.int(14, "Stochastic Length", minval=1)
src = input(close, title="RSI Source")
rsi1 = ta.rsi(src, lengthRSI)
k = ta.sma(ta.stoch(rsi1, rsi1, rsi1, lengthStoch), smoothK)
d = ta.sma(k, smoothD)
plot(k, "K", color=#2962FF)
plot(d, "D", color=#FF6D00)

d_k = d - k
smoothD_d = d - smoothD
smoothK_k = k - smoothK

h0 = hline(80, "Upper Band", color=#787B86)
hline(50, "Middle Band", color=color.new(#787B86, 50))
h1 = hline(20, "Lower Band", color=#787B86)
fill(h0, h1, color=color.rgb(33, 150, 243, 90), title="Background")
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
float op_operation = decision_tree_0_BABA_30Min_0c6b2cb5(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


