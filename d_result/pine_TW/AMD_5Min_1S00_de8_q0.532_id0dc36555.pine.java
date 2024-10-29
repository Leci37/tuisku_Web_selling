//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: AMD_5Min_1S00_0dc36555 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMD_5Min_1S00_0dc36555", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMD_5Min_0dc36555(rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( rsi1 <= 47.638 )
		if( k <= 37.8871 )
			if( rsi1 <= 29.1671 )
				if( smoothD_d <= 55.5148 )
					if( k <= 0.017546 )
						if( d <= 26.8516 )
							if( smoothD_d <= 17.7909 )
								if( smoothD_d <= 2.36266 )
									ret := 0.139091
								if( smoothD_d > 2.36266 )
									ret := -0.013405
							if( smoothD_d > 17.7909 )
								if( d_k <= 24.1647 )
									ret := 0.608696
								if( d_k > 24.1647 )
									ret := 1.000000 // buy
						if( d > 26.8516 )
							ret := -0.666667
					if( k > 0.017546 )
						if( smoothD_d <= -1.10489 )
							if( rsi1 <= 4.66286 )
								if( d_k <= -0.191927 )
									ret := 1.000000 // buy
								if( d_k > -0.191927 )
									ret := 0.916667 // buy
							if( rsi1 > 4.66286 )
								if( smoothK_k <= 1.07377 )
									ret := 0.072549
								if( smoothK_k > 1.07377 )
									ret := 0.825000 // buy
						if( smoothD_d > -1.10489 )
							if( rsi1 <= 25.3543 )
								if( rsi1 <= 23.5966 )
									ret := -0.037134
								if( rsi1 > 23.5966 )
									ret := -0.224903
							if( rsi1 > 25.3543 )
								if( smoothK_k <= 6.98783 )
									ret := -0.059934
								if( smoothK_k > 6.98783 )
									ret := 0.173523
				if( smoothD_d > 55.5148 )
					if( rsi1 <= 27.383 )
						ret := -0.800000 // sell
					if( rsi1 > 27.383 )
						ret := -1.000000 // sell
			if( rsi1 > 29.1671 )
				if( rsi1 <= 32.4664 )
					if( d_k <= 20.7194 )
						if( smoothK_k <= 28.6739 )
							if( d_k <= -10.8424 )
								if( smoothD_d <= 11.3955 )
									ret := 0.250000
								if( smoothD_d > 11.3955 )
									ret := 0.786885 // buy
							if( d_k > -10.8424 )
								if( smoothD_d <= 6.45526 )
									ret := -0.179873
								if( smoothD_d > 6.45526 )
									ret := -0.042285
						if( smoothK_k > 28.6739 )
							if( smoothK_k <= 30.957 )
								if( smoothK_k <= 29.9059 )
									ret := -0.363636
								if( smoothK_k > 29.9059 )
									ret := -0.876543 // sell
							if( smoothK_k > 30.957 )
								if( d_k <= 9.64311 )
									ret := 0.014493
								if( d_k > 9.64311 )
									ret := -0.538462
					if( d_k > 20.7194 )
						if( rsi1 <= 31.0465 )
							if( d <= 45.8945 )
								if( smoothK_k <= 2.97568 )
									ret := -0.928571 // sell
								if( smoothK_k > 2.97568 )
									ret := -0.344828
							if( d > 45.8945 )
								if( k <= 31.9367 )
									ret := -0.962963 // sell
								if( k > 31.9367 )
									ret := -0.785714 // sell
						if( rsi1 > 31.0465 )
							if( smoothK_k <= 18.6523 )
								if( smoothD_d <= 28.6541 )
									ret := -0.636364
								if( smoothD_d > 28.6541 )
									ret := 0.058824
							if( smoothK_k > 18.6523 )
								if( smoothD_d <= 51.4326 )
									ret := -0.714286 // sell
								if( smoothD_d > 51.4326 )
									ret := -0.500000
				if( rsi1 > 32.4664 )
					if( smoothD_d <= 33.5731 )
						if( d <= 34.1445 )
							if( d_k <= -17.6094 )
								if( smoothD_d <= 14.7795 )
									ret := -0.758065 // sell
								if( smoothD_d > 14.7795 )
									ret := -0.269231
							if( d_k > -17.6094 )
								if( d <= 27.8778 )
									ret := -0.050566
								if( d > 27.8778 )
									ret := -0.146647
						if( d > 34.1445 )
							if( rsi1 <= 41.6616 )
								if( d <= 34.4846 )
									ret := -0.864865 // sell
								if( d > 34.4846 )
									ret := -0.440000
							if( rsi1 > 41.6616 )
								if( d <= 36.3858 )
									ret := -0.098592
								if( d > 36.3858 )
									ret := -0.904762 // sell
					if( smoothD_d > 33.5731 )
						if( d <= 39.484 )
							if( k <= 35.6531 )
								if( k <= 15.0836 )
									ret := 0.628571
								if( k > 15.0836 )
									ret := 0.136201
							if( k > 35.6531 )
								if( smoothD_d <= 35.5225 )
									ret := 0.568182
								if( smoothD_d > 35.5225 )
									ret := 0.807692 // buy
						if( d > 39.484 )
							if( smoothK_k <= 34.1487 )
								if( rsi1 <= 46.4474 )
									ret := 0.059177
								if( rsi1 > 46.4474 )
									ret := -0.306306
							if( smoothK_k > 34.1487 )
								if( d <= 42.3904 )
									ret := -0.150000
								if( d > 42.3904 )
									ret := -0.552239
		if( k > 37.8871 )
			if( k <= 79.5506 )
				if( d_k <= -9.5436 )
					if( rsi1 <= 45.1739 )
						if( d <= 41.2366 )
							if( d <= 32.7449 )
								if( smoothK_k <= 35.0139 )
									ret := 0.812500 // buy
								if( smoothK_k > 35.0139 )
									ret := 0.009957
							if( d > 32.7449 )
								if( smoothK_k <= 62.3287 )
									ret := -0.218213
								if( smoothK_k > 62.3287 )
									ret := 0.333333
						if( d > 41.2366 )
							if( k <= 62.1264 )
								if( d_k <= -10.6771 )
									ret := 0.430189
								if( d_k > -10.6771 )
									ret := -0.241379
							if( k > 62.1264 )
								if( d_k <= -17.6858 )
									ret := 0.091429
								if( d_k > -17.6858 )
									ret := -0.087260
					if( rsi1 > 45.1739 )
						if( d <= 26.3225 )
							if( d <= 24.4332 )
								ret := 0.150000
							if( d > 24.4332 )
								if( d_k <= -14.2029 )
									ret := 0.500000
								if( d_k > -14.2029 )
									ret := 0.909091 // buy
						if( d > 26.3225 )
							if( k <= 70.1625 )
								if( k <= 62.3427 )
									ret := -0.299213
								if( k > 62.3427 )
									ret := 0.241379
							if( k > 70.1625 )
								if( smoothD_d <= 50.8493 )
									ret := -0.928571 // sell
								if( smoothD_d > 50.8493 )
									ret := -0.405405
				if( d_k > -9.5436 )
					if( k <= 74.0337 )
						if( rsi1 <= 23.4954 )
							if( d <= 58.2086 )
								if( smoothD_d <= 32.4193 )
									ret := 0.052632
								if( smoothD_d > 32.4193 )
									ret := -0.635514
							if( d > 58.2086 )
								if( d_k <= 22.4156 )
									ret := 0.000000
								if( d_k > 22.4156 )
									ret := 0.791667 // buy
						if( rsi1 > 23.4954 )
							if( k <= 41.3689 )
								if( smoothK_k <= 36.1099 )
									ret := 0.062893
								if( smoothK_k > 36.1099 )
									ret := 0.287234
							if( k > 41.3689 )
								if( rsi1 <= 33.2384 )
									ret := 0.214004
								if( rsi1 > 33.2384 )
									ret := 0.048310
					if( k > 74.0337 )
						if( d_k <= -2.57111 )
							if( d <= 75.1638 )
								if( smoothK_k <= 74.5009 )
									ret := 0.492424
								if( smoothK_k > 74.5009 )
									ret := -0.085714
							if( d > 75.1638 )
								ret := 1.000000 // buy
						if( d_k > -2.57111 )
							if( smoothD_d <= 74.6068 )
								if( rsi1 <= 36.6827 )
									ret := -1.000000 // sell
								if( rsi1 > 36.6827 )
									ret := -0.083333
							if( smoothD_d > 74.6068 )
								if( smoothK_k <= 72.6116 )
									ret := 0.541667
								if( smoothK_k > 72.6116 )
									ret := 0.128205
			if( k > 79.5506 )
				if( k <= 99.5208 )
					if( rsi1 <= 22.3375 )
						if( smoothK_k <= 83.5108 )
							ret := -1.000000 // sell
						if( smoothK_k > 83.5108 )
							if( k <= 93.3045 )
								ret := -0.555556
							if( k > 93.3045 )
								ret := -1.000000 // sell
					if( rsi1 > 22.3375 )
						if( rsi1 <= 44.0405 )
							if( d_k <= -26.3022 )
								if( rsi1 <= 36.8195 )
									ret := 0.954545 // buy
								if( rsi1 > 36.8195 )
									ret := 0.322581
							if( d_k > -26.3022 )
								if( d <= 93.2072 )
									ret := -0.005297
								if( d > 93.2072 )
									ret := -0.230971
						if( rsi1 > 44.0405 )
							if( smoothK_k <= 90.1246 )
								if( d_k <= -30.8022 )
									ret := -1.000000 // sell
								if( d_k > -30.8022 )
									ret := -0.265409
							if( smoothK_k > 90.1246 )
								if( d <= 97.6722 )
									ret := 0.020619
								if( d > 97.6722 )
									ret := -0.362319
				if( k > 99.5208 )
					if( smoothD_d <= 90.6609 )
						if( smoothD_d <= 82.6581 )
							if( d_k <= -15.3012 )
								if( k <= 99.9852 )
									ret := 0.866667 // buy
								if( k > 99.9852 )
									ret := 0.428571
							if( d_k > -15.3012 )
								ret := 1.000000 // buy
						if( smoothD_d > 82.6581 )
							if( smoothD_d <= 87.0207 )
								if( d_k <= -12.5975 )
									ret := -0.055556
								if( d_k > -12.5975 )
									ret := -0.111111
							if( smoothD_d > 87.0207 )
								if( k <= 99.9951 )
									ret := 0.909091 // buy
								if( k > 99.9951 )
									ret := 0.500000
					if( smoothD_d > 90.6609 )
						if( rsi1 <= 40.434 )
							if( rsi1 <= 35.707 )
								if( smoothK_k <= 96.8126 )
									ret := -0.111111
								if( smoothK_k > 96.8126 )
									ret := -0.363636
							if( rsi1 > 35.707 )
								ret := -0.846154 // sell
						if( rsi1 > 40.434 )
							if( smoothK_k <= 96.8458 )
								ret := 0.700000 // buy
							if( smoothK_k > 96.8458 )
								if( smoothD_d <= 96.7633 )
									ret := 0.093750
								if( smoothD_d > 96.7633 )
									ret := -0.500000
	if( rsi1 > 47.638 )
		if( smoothK_k <= 8.10168 )
			if( smoothK_k <= 4.95767 )
				if( d_k <= 0.606724 )
					if( smoothK_k <= 3.7895 )
						if( smoothK_k <= 3.56964 )
							if( rsi1 <= 55.1847 )
								if( d <= 2.50839 )
									ret := 0.164706
								if( d > 2.50839 )
									ret := -0.322034
							if( rsi1 > 55.1847 )
								if( d <= 5.60895 )
									ret := -0.517413
								if( d > 5.60895 )
									ret := 0.764706 // buy
						if( smoothK_k > 3.56964 )
							ret := -0.947368 // sell
					if( smoothK_k > 3.7895 )
						if( d <= 4.02766 )
							if( k <= 7.02642 )
								if( smoothK_k <= 3.82157 )
									ret := 1.000000 // buy
								if( smoothK_k > 3.82157 )
									ret := 0.909091 // buy
							if( k > 7.02642 )
								ret := 0.555556
						if( d > 4.02766 )
							if( smoothK_k <= 4.17461 )
								if( smoothK_k <= 3.91362 )
									ret := -0.148148
								if( smoothK_k > 3.91362 )
									ret := -0.761905 // sell
							if( smoothK_k > 4.17461 )
								if( smoothD_d <= 1.36318 )
									ret := -0.529412
								if( smoothD_d > 1.36318 )
									ret := 0.269231
				if( d_k > 0.606724 )
					if( smoothK_k <= 2.02638 )
						if( rsi1 <= 54.365 )
							if( smoothD_d <= 0.830014 )
								if( smoothK_k <= -2.56399 )
									ret := 0.611111
								if( smoothK_k > -2.56399 )
									ret := 0.315789
							if( smoothD_d > 0.830014 )
								if( d <= 5.52257 )
									ret := -0.267857
								if( d > 5.52257 )
									ret := 0.177730
						if( rsi1 > 54.365 )
							if( d <= 30.0699 )
								if( smoothD_d <= 4.17843 )
									ret := -0.029412
								if( smoothD_d > 4.17843 )
									ret := -0.263492
							if( d > 30.0699 )
								ret := 0.857143 // buy
					if( smoothK_k > 2.02638 )
						if( rsi1 <= 53.71 )
							if( d <= 8.68564 )
								if( smoothK_k <= 3.2944 )
									ret := 0.000000
								if( smoothK_k > 3.2944 )
									ret := -0.947368 // sell
							if( d > 8.68564 )
								if( k <= 7.58218 )
									ret := 0.128049
								if( k > 7.58218 )
									ret := -0.375000
						if( rsi1 > 53.71 )
							if( rsi1 <= 65.2997 )
								if( smoothK_k <= 4.56656 )
									ret := 0.548077
								if( smoothK_k > 4.56656 )
									ret := 0.275862
							if( rsi1 > 65.2997 )
								if( d <= 14.3188 )
									ret := -0.588235
								if( d > 14.3188 )
									ret := 0.200000
			if( smoothK_k > 4.95767 )
				if( rsi1 <= 49.4257 )
					if( d <= 5.96835 )
						if( d_k <= -4.75354 )
							ret := 0.954545 // buy
						if( d_k > -4.75354 )
							ret := 0.250000
					if( d > 5.96835 )
						if( smoothK_k <= 7.5672 )
							if( d <= 15.3912 )
								if( smoothK_k <= 6.80122 )
									ret := -0.766667 // sell
								if( smoothK_k > 6.80122 )
									ret := -0.444444
							if( d > 15.3912 )
								if( d <= 24.14 )
									ret := 0.000000
								if( d > 24.14 )
									ret := 0.562500
						if( smoothK_k > 7.5672 )
							if( smoothD_d <= 19.3538 )
								ret := 0.888889 // buy
							if( smoothD_d > 19.3538 )
								ret := 0.714286 // buy
				if( rsi1 > 49.4257 )
					if( smoothK_k <= 6.27133 )
						if( smoothD_d <= 1.94419 )
							if( d_k <= -4.80326 )
								ret := -0.461538
							if( d_k > -4.80326 )
								if( k <= 8.81628 )
									ret := -0.809524 // sell
								if( k > 8.81628 )
									ret := -1.000000 // sell
						if( smoothD_d > 1.94419 )
							if( d_k <= 4.96355 )
								if( smoothK_k <= 5.44214 )
									ret := 0.259259
								if( smoothK_k > 5.44214 )
									ret := -0.439252
							if( d_k > 4.96355 )
								if( d_k <= 7.03798 )
									ret := -0.753623 // sell
								if( d_k > 7.03798 )
									ret := -0.416000
					if( smoothK_k > 6.27133 )
						if( rsi1 <= 58.2042 )
							if( k <= 10.7242 )
								if( k <= 10.5842 )
									ret := -0.203980
								if( k > 10.5842 )
									ret := 0.400000
							if( k > 10.7242 )
								if( rsi1 <= 52.1269 )
									ret := -0.360000
								if( rsi1 > 52.1269 )
									ret := -0.755102 // sell
						if( rsi1 > 58.2042 )
							if( smoothD_d <= 5.63749 )
								if( d <= 8.03845 )
									ret := 0.111111
								if( d > 8.03845 )
									ret := 1.000000 // buy
							if( smoothD_d > 5.63749 )
								if( smoothK_k <= 6.93019 )
									ret := 0.193548
								if( smoothK_k > 6.93019 )
									ret := -0.316832
		if( smoothK_k > 8.10168 )
			if( k <= 17.0962 )
				if( k <= 16.9253 )
					if( d_k <= 29.0553 )
						if( d <= 39.6097 )
							if( smoothD_d <= 1.82572 )
								ret := -0.692308
							if( smoothD_d > 1.82572 )
								if( d <= 21.402 )
									ret := 0.226721
								if( d > 21.402 )
									ret := 0.063348
						if( d > 39.6097 )
							if( d <= 42.8253 )
								if( k <= 15.2257 )
									ret := 0.800000 // buy
								if( k > 15.2257 )
									ret := 0.444444
							if( d > 42.8253 )
								ret := 0.266667
					if( d_k > 29.0553 )
						if( d_k <= 31.3073 )
							if( smoothK_k <= 11.9673 )
								ret := 0.444444
							if( smoothK_k > 11.9673 )
								ret := -0.608696
						if( d_k > 31.3073 )
							ret := -0.769231 // sell
				if( k > 16.9253 )
					if( smoothK_k <= 13.9643 )
						ret := 0.555556
					if( smoothK_k > 13.9643 )
						if( smoothK_k <= 14.0304 )
							ret := 1.000000 // buy
						if( smoothK_k > 14.0304 )
							ret := 0.818182 // buy
			if( k > 17.0962 )
				if( rsi1 <= 85.8719 )
					if( d <= 98.7857 )
						if( rsi1 <= 71.2332 )
							if( d <= 78.0961 )
								if( smoothK_k <= 69.3342 )
									ret := 0.020925
								if( smoothK_k > 69.3342 )
									ret := -0.047721
							if( d > 78.0961 )
								if( smoothK_k <= 95.7855 )
									ret := 0.096016
								if( smoothK_k > 95.7855 )
									ret := -0.077999
						if( rsi1 > 71.2332 )
							if( smoothK_k <= 16.0827 )
								if( d_k <= -1.63828 )
									ret := 0.833333 // buy
								if( d_k > -1.63828 )
									ret := 0.958333 // buy
							if( smoothK_k > 16.0827 )
								if( d <= 86.2483 )
									ret := -0.070840
								if( d > 86.2483 )
									ret := 0.006536
					if( d > 98.7857 )
						if( d_k <= -0.056057 )
							if( rsi1 <= 51.7333 )
								if( d_k <= -0.711171 )
									ret := 0.066667
								if( d_k > -0.711171 )
									ret := 0.972973 // buy
							if( rsi1 > 51.7333 )
								if( d_k <= -1.11573 )
									ret := -0.750000 // sell
								if( d_k > -1.11573 )
									ret := 0.063457
						if( d_k > -0.056057 )
							if( d_k <= 2.22106 )
								if( smoothD_d <= 96.3552 )
									ret := -0.277628
								if( smoothD_d > 96.3552 )
									ret := -0.110199
							if( d_k > 2.22106 )
								ret := 0.642857
				if( rsi1 > 85.8719 )
					if( rsi1 <= 87.5307 )
						if( d <= 76.6203 )
							if( smoothK_k <= 75.754 )
								if( smoothK_k <= 72.2963 )
									ret := -0.050000
								if( smoothK_k > 72.2963 )
									ret := 0.785714 // buy
							if( smoothK_k > 75.754 )
								if( d <= 71.1945 )
									ret := 0.100000
								if( d > 71.1945 )
									ret := -0.880000 // sell
						if( d > 76.6203 )
							if( d_k <= -1.51393 )
								if( k <= 94.4753 )
									ret := 0.611111
								if( k > 94.4753 )
									ret := -0.349206
							if( d_k > -1.51393 )
								if( d <= 99.9958 )
									ret := 0.608856
								if( d > 99.9958 )
									ret := -0.333333
					if( rsi1 > 87.5307 )
						if( rsi1 <= 92.4388 )
							if( d <= 87.6653 )
								if( smoothD_d <= 78.6679 )
									ret := 0.029412
								if( smoothD_d > 78.6679 )
									ret := -0.625000
							if( d > 87.6653 )
								if( rsi1 <= 91.403 )
									ret := 0.138648
								if( rsi1 > 91.403 )
									ret := -0.514563
						if( rsi1 > 92.4388 )
							if( smoothD_d <= 96.9995 )
								if( d_k <= -0.87499 )
									ret := 0.061538
								if( d_k > -0.87499 )
									ret := 0.518293
							if( smoothD_d > 96.9995 )
								if( rsi1 <= 95.6026 )
									ret := -0.600000
								if( rsi1 > 95.6026 )
									ret := -0.333333
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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
float op_operation = decision_tree_0_AMD_5Min_0dc36555(rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


