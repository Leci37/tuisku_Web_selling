//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: SHOP_1Min_2BS0_f09731b1 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SHOP_1Min_2BS0_f09731b1", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SHOP_1Min_f09731b1(bbm, bearPower, bbp, bullPower, BBPower_Color, d_k, d, rsi1, k, smoothD_d, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bullPower <= -0.032404 )
		if( bbm <= 0.019984 )
			if( bbp <= -0.192923 )
				if( bbm <= 0.011283 )
					if( d <= 34.711 )
						if( k <= 33.883 )
							if( bbp <= -0.451349 )
								if( smoothD_d <= -2.2795 )
									ret := 1.000000 // buy
								if( smoothD_d > -2.2795 )
									ret := 0.446429
							if( bbp > -0.451349 )
								if( smoothD_d <= 14.1991 )
									ret := 0.164751
								if( smoothD_d > 14.1991 )
									ret := 0.378788
						if( k > 33.883 )
							if( rsi1 <= 21.2132 )
								ret := 1.000000 // buy
							if( rsi1 > 21.2132 )
								if( d_k <= -8.93603 )
									ret := 0.142857
								if( d_k > -8.93603 )
									ret := -0.722222 // sell
					if( d > 34.711 )
						if( rsi1 <= 51.7337 )
							if( d_k <= 26.8401 )
								if( d <= 68.3817 )
									ret := 0.541547
								if( d > 68.3817 )
									ret := 0.728395 // buy
							if( d_k > 26.8401 )
								if( bullPower <= -0.215051 )
									ret := -0.909091 // sell
								if( bullPower > -0.215051 )
									ret := 0.333333
						if( rsi1 > 51.7337 )
							if( smoothK_k <= 65.184 )
								if( rsi1 <= 52.1757 )
									ret := -0.800000 // sell
								if( rsi1 > 52.1757 )
									ret := 0.500000
							if( smoothK_k > 65.184 )
								if( bbp <= -0.215473 )
									ret := -0.857143 // sell
								if( bbp > -0.215473 )
									ret := -0.333333
				if( bbm > 0.011283 )
					if( k <= 0.880349 )
						if( bearPower <= -0.162086 )
							if( d_k <= 1.8874 )
								ret := 1.000000 // buy
							if( d_k > 1.8874 )
								ret := 0.000000
						if( bearPower > -0.162086 )
							ret := -0.666667
					if( k > 0.880349 )
						if( bbm <= 0.015798 )
							if( bbm <= 0.015338 )
								if( bearPower <= -0.140817 )
									ret := 0.916667 // buy
								if( bearPower > -0.140817 )
									ret := 0.421053
							if( bbm > 0.015338 )
								if( d_k <= -1.71629 )
									ret := -0.500000
								if( d_k > -1.71629 )
									ret := 0.000000
						if( bbm > 0.015798 )
							if( d_k <= 0.011462 )
								if( bearPower <= -0.198305 )
									ret := 1.000000 // buy
								if( bearPower > -0.198305 )
									ret := 0.400000
							if( d_k > 0.011462 )
								if( bbp <= -0.19964 )
									ret := 1.000000 // buy
								if( bbp > -0.19964 )
									ret := 0.500000
			if( bbp > -0.192923 )
				if( d_k <= 22.7796 )
					if( rsi1 <= 41.1472 )
						if( d_k <= 7.62898 )
							if( bearPower <= -0.085386 )
								if( rsi1 <= 37.6429 )
									ret := 0.190476
								if( rsi1 > 37.6429 )
									ret := -0.341463
							if( bearPower > -0.085386 )
								if( d_k <= -2.96143 )
									ret := 0.049587
								if( d_k > -2.96143 )
									ret := 0.315476
						if( d_k > 7.62898 )
							if( smoothK_k <= 2.59938 )
								if( smoothK_k <= 1.9006 )
									ret := -0.285714
								if( smoothK_k > 1.9006 )
									ret := -1.000000 // sell
							if( smoothK_k > 2.59938 )
								if( d_k <= 22.0608 )
									ret := 0.000000
								if( d_k > 22.0608 )
									ret := 0.833333 // buy
					if( rsi1 > 41.1472 )
						if( smoothK_k <= 22.9397 )
							if( d_k <= 13.7146 )
								if( smoothD_d <= 32.9571 )
									ret := 0.160976
								if( smoothD_d > 32.9571 )
									ret := -1.000000 // sell
							if( d_k > 13.7146 )
								if( rsi1 <= 41.9627 )
									ret := 1.000000 // buy
								if( rsi1 > 41.9627 )
									ret := 0.358974
						if( smoothK_k > 22.9397 )
							if( rsi1 <= 42.3326 )
								if( k <= 40.0731 )
									ret := 0.250000
								if( k > 40.0731 )
									ret := 0.722222 // buy
							if( rsi1 > 42.3326 )
								if( bbm <= 0.010442 )
									ret := 0.286385
								if( bbm > 0.010442 )
									ret := 0.575342
				if( d_k > 22.7796 )
					if( smoothK_k <= 17.2022 )
						if( rsi1 <= 37.1558 )
							ret := -0.250000
						if( rsi1 > 37.1558 )
							ret := 0.800000 // buy
					if( smoothK_k > 17.2022 )
						if( bbp <= -0.160581 )
							ret := 0.200000
						if( bbp > -0.160581 )
							if( bearPower <= -0.055417 )
								if( bbp <= -0.135748 )
									ret := -0.733333 // sell
								if( bbp > -0.135748 )
									ret := -1.000000 // sell
							if( bearPower > -0.055417 )
								if( bearPower <= -0.044928 )
									ret := 0.166667
								if( bearPower > -0.044928 )
									ret := -0.666667
		if( bbm > 0.019984 )
			if( rsi1 <= 41.1873 )
				if( bearPower <= -0.28573 )
					if( rsi1 <= 7.15012 )
						if( rsi1 <= 1.81728 )
							if( bbm <= 0.095 )
								ret := 0.500000
							if( bbm > 0.095 )
								ret := 0.200000
						if( rsi1 > 1.81728 )
							if( smoothD_d <= -2.98412 )
								if( bullPower <= -0.280128 )
									ret := -0.833333 // sell
								if( bullPower > -0.280128 )
									ret := 0.500000
							if( smoothD_d > -2.98412 )
								if( rsi1 <= 4.9473 )
									ret := -0.913043 // sell
								if( rsi1 > 4.9473 )
									ret := -0.464286
					if( rsi1 > 7.15012 )
						if( d <= 19.4721 )
							if( rsi1 <= 26.3608 )
								if( rsi1 <= 13.1028 )
									ret := 0.386740
								if( rsi1 > 13.1028 )
									ret := 0.088825
							if( rsi1 > 26.3608 )
								if( smoothD_d <= -0.670932 )
									ret := 0.760000 // buy
								if( smoothD_d > -0.670932 )
									ret := 0.341880
						if( d > 19.4721 )
							if( rsi1 <= 20.6983 )
								if( smoothK_k <= 56.0706 )
									ret := 0.550847
								if( smoothK_k > 56.0706 )
									ret := -0.625000
							if( rsi1 > 20.6983 )
								if( d_k <= -4.729 )
									ret := 0.400000
								if( d_k > -4.729 )
									ret := -0.099825
				if( bearPower > -0.28573 )
					if( k <= 98.9404 )
						if( rsi1 <= 28.3342 )
							if( d_k <= 16.2033 )
								if( bearPower <= -0.156179 )
									ret := 0.071637
								if( bearPower > -0.156179 )
									ret := -0.040503
							if( d_k > 16.2033 )
								if( d <= 83.8451 )
									ret := -0.265957
								if( d > 83.8451 )
									ret := 1.000000 // buy
						if( rsi1 > 28.3342 )
							if( k <= 5.13941 )
								if( rsi1 <= 38.3874 )
									ret := 0.178862
								if( rsi1 > 38.3874 )
									ret := 0.469136
							if( k > 5.13941 )
								if( smoothK_k <= 2.63378 )
									ret := -0.428571
								if( smoothK_k > 2.63378 )
									ret := 0.058759
					if( k > 98.9404 )
						if( d_k <= -7.43035 )
							if( bearPower <= -0.106042 )
								ret := 0.428571
							if( bearPower > -0.106042 )
								ret := -1.000000 // sell
						if( d_k > -7.43035 )
							if( rsi1 <= 31.9208 )
								if( d_k <= -5.58622 )
									ret := 1.000000 // buy
								if( d_k > -5.58622 )
									ret := 0.000000
							if( rsi1 > 31.9208 )
								if( rsi1 <= 39.7146 )
									ret := 1.000000 // buy
								if( rsi1 > 39.7146 )
									ret := 0.750000 // buy
			if( rsi1 > 41.1873 )
				if( smoothK_k <= -0.788145 )
					if( d <= 20.3915 )
						if( bearPower <= -0.288461 )
							ret := 1.000000 // buy
						if( bearPower > -0.288461 )
							if( bearPower <= -0.147919 )
								if( bbp <= -0.222932 )
									ret := -0.333333
								if( bbp > -0.222932 )
									ret := -1.000000 // sell
							if( bearPower > -0.147919 )
								if( d_k <= 17.0352 )
									ret := 0.000000
								if( d_k > 17.0352 )
									ret := 0.571429
					if( d > 20.3915 )
						if( k <= 0.088868 )
							ret := -0.571429
						if( k > 0.088868 )
							if( k <= 1.08445 )
								ret := -1.000000 // sell
							if( k > 1.08445 )
								ret := -0.714286 // sell
				if( smoothK_k > -0.788145 )
					if( bullPower <= -0.06978 )
						if( k <= 90.3298 )
							if( rsi1 <= 45.8847 )
								if( bbp <= -0.357764 )
									ret := 0.684615
								if( bbp > -0.357764 )
									ret := 0.475694
							if( rsi1 > 45.8847 )
								if( smoothK_k <= 7.14409 )
									ret := -0.392857
								if( smoothK_k > 7.14409 )
									ret := 0.368030
						if( k > 90.3298 )
							if( k <= 96.126 )
								if( rsi1 <= 48.5233 )
									ret := -0.500000
								if( rsi1 > 48.5233 )
									ret := -1.000000 // sell
							if( k > 96.126 )
								if( d <= 97.8914 )
									ret := 0.500000
								if( d > 97.8914 )
									ret := -1.000000 // sell
					if( bullPower > -0.06978 )
						if( rsi1 <= 49.0403 )
							if( d <= 87.6584 )
								if( bullPower <= -0.046239 )
									ret := 0.355294
								if( bullPower > -0.046239 )
									ret := 0.157143
							if( d > 87.6584 )
								if( bearPower <= -0.089286 )
									ret := -0.254902
								if( bearPower > -0.089286 )
									ret := 0.538462
						if( rsi1 > 49.0403 )
							if( k <= 63.0362 )
								if( bearPower <= -0.116985 )
									ret := -0.213592
								if( bearPower > -0.116985 )
									ret := 0.111111
							if( k > 63.0362 )
								if( smoothK_k <= 81.8147 )
									ret := 0.417722
								if( smoothK_k > 81.8147 )
									ret := 0.000000
	if( bullPower > -0.032404 )
		if( bullPower <= 0.232964 )
			if( rsi1 <= 81.7703 )
				if( bbm <= 0.007983 )
					if( bearPower <= 0.057059 )
						if( rsi1 <= 52.7814 )
							if( d_k <= -26.1802 )
								if( smoothK_k <= 76.4744 )
									ret := 1.000000 // buy
								if( smoothK_k > 76.4744 )
									ret := -0.250000
							if( d_k > -26.1802 )
								if( bbm <= 0.002066 )
									ret := -0.049489
								if( bbm > 0.002066 )
									ret := -0.255682
						if( rsi1 > 52.7814 )
							if( bbm <= 0.001208 )
								if( bbp <= 0.056887 )
									ret := 0.103651
								if( bbp > 0.056887 )
									ret := -0.005747
							if( bbm > 0.001208 )
								if( bullPower <= 0.056269 )
									ret := 0.355422
								if( bullPower > 0.056269 )
									ret := -0.166667
					if( bearPower > 0.057059 )
						if( d <= 33.2254 )
							if( smoothK_k <= 9.6211 )
								if( smoothD_d <= 1.24523 )
									ret := -0.533333
								if( smoothD_d > 1.24523 )
									ret := 0.153846
							if( smoothK_k > 9.6211 )
								if( rsi1 <= 67.2695 )
									ret := -0.509506
								if( rsi1 > 67.2695 )
									ret := 0.235294
						if( d > 33.2254 )
							if( d <= 97.6429 )
								if( rsi1 <= 61.9323 )
									ret := -0.185507
								if( rsi1 > 61.9323 )
									ret := -0.028846
							if( d > 97.6429 )
								if( bearPower <= 0.082146 )
									ret := 0.090909
								if( bearPower > 0.082146 )
									ret := -0.649123
				if( bbm > 0.007983 )
					if( d <= 95.0877 )
						if( bbm <= 0.420045 )
							if( rsi1 <= 41.7234 )
								if( smoothK_k <= 81.5439 )
									ret := -0.013931
								if( smoothK_k > 81.5439 )
									ret := 0.244156
							if( rsi1 > 41.7234 )
								if( bearPower <= 0.079177 )
									ret := 0.057067
								if( bearPower > 0.079177 )
									ret := -0.034255
						if( bbm > 0.420045 )
							if( rsi1 <= 61.3037 )
								if( d_k <= 21.7627 )
									ret := 0.485549
								if( d_k > 21.7627 )
									ret := -0.333333
							if( rsi1 > 61.3037 )
								ret := -1.000000 // sell
					if( d > 95.0877 )
						if( smoothD_d <= 96.0021 )
							if( rsi1 <= 56.3479 )
								if( bullPower <= 0.0391 )
									ret := -0.090580
								if( bullPower > 0.0391 )
									ret := -0.391608
							if( rsi1 > 56.3479 )
								if( d_k <= -1.42529 )
									ret := 0.071121
								if( d_k > -1.42529 )
									ret := -0.096401
						if( smoothD_d > 96.0021 )
							if( bbp <= 0.235359 )
								if( bullPower <= 0.081162 )
									ret := 0.342756
								if( bullPower > 0.081162 )
									ret := 0.073986
							if( bbp > 0.235359 )
								if( bearPower <= 0.079862 )
									ret := -0.888889 // sell
								if( bearPower > 0.079862 )
									ret := -0.208333
			if( rsi1 > 81.7703 )
				if( rsi1 <= 90.1234 )
					if( smoothK_k <= 94.14 )
						if( smoothK_k <= 90.223 )
							if( d <= 41.7165 )
								if( bearPower <= 0.136823 )
									ret := -0.066667
								if( bearPower > 0.136823 )
									ret := -1.000000 // sell
							if( d > 41.7165 )
								if( d <= 70.793 )
									ret := 0.436620
								if( d > 70.793 )
									ret := 0.174089
						if( smoothK_k > 90.223 )
							if( bullPower <= 0.191624 )
								if( d <= 97.9328 )
									ret := -0.105769
								if( d > 97.9328 )
									ret := 0.323529
							if( bullPower > 0.191624 )
								if( bullPower <= 0.206314 )
									ret := -1.000000 // sell
								if( bullPower > 0.206314 )
									ret := -0.294118
					if( smoothK_k > 94.14 )
						if( rsi1 <= 83.2614 )
							if( bullPower <= 0.21795 )
								if( rsi1 <= 82.1166 )
									ret := 0.206897
								if( rsi1 > 82.1166 )
									ret := 0.610619
							if( bullPower > 0.21795 )
								ret := -0.285714
						if( rsi1 > 83.2614 )
							if( rsi1 <= 86.1791 )
								if( smoothD_d <= 93.5884 )
									ret := 0.392857
								if( smoothD_d > 93.5884 )
									ret := -0.043478
							if( rsi1 > 86.1791 )
								if( bullPower <= 0.086907 )
									ret := 0.000000
								if( bullPower > 0.086907 )
									ret := 0.470588
				if( rsi1 > 90.1234 )
					if( k <= 99.6909 )
						if( bbm <= 0.1075 )
							if( rsi1 <= 92.5218 )
								if( bbm <= 0.068967 )
									ret := -0.323529
								if( bbm > 0.068967 )
									ret := 0.142857
							if( rsi1 > 92.5218 )
								if( k <= 86.7863 )
									ret := 0.666667
								if( k > 86.7863 )
									ret := 0.066667
						if( bbm > 0.1075 )
							if( d <= 97.6697 )
								ret := -0.250000
							if( d > 97.6697 )
								ret := 1.000000 // buy
					if( k > 99.6909 )
						if( smoothK_k <= 96.7536 )
							ret := -1.000000 // sell
						if( smoothK_k > 96.7536 )
							if( smoothD_d <= 96.9701 )
								if( d_k <= -2.1554 )
									ret := -0.500000
								if( d_k > -2.1554 )
									ret := 0.000000
							if( smoothD_d > 96.9701 )
								if( bearPower <= 0.078824 )
									ret := -0.125000
								if( bearPower > 0.078824 )
									ret := -0.727273 // sell
		if( bullPower > 0.232964 )
			if( bullPower <= 1.48516 )
				if( bbm <= 0.03551 )
					if( smoothD_d <= 54.7625 )
						if( k <= 19.8931 )
							if( d_k <= 0.443947 )
								if( smoothD_d <= 10.6198 )
									ret := -0.250000
								if( smoothD_d > 10.6198 )
									ret := 1.000000 // buy
							if( d_k > 0.443947 )
								if( bbp <= 0.546206 )
									ret := 0.250000
								if( bbp > 0.546206 )
									ret := -0.933333 // sell
						if( k > 19.8931 )
							if( bullPower <= 0.275485 )
								if( rsi1 <= 65.5903 )
									ret := -0.157895
								if( rsi1 > 65.5903 )
									ret := -0.923077 // sell
							if( bullPower > 0.275485 )
								if( bbm <= 0.000442 )
									ret := -0.694444
								if( bbm > 0.000442 )
									ret := -1.000000 // sell
					if( smoothD_d > 54.7625 )
						if( smoothK_k <= 94.7535 )
							if( rsi1 <= 85.2365 )
								if( smoothD_d <= 55.3242 )
									ret := 1.000000 // buy
								if( smoothD_d > 55.3242 )
									ret := -0.219512
							if( rsi1 > 85.2365 )
								if( smoothD_d <= 90.7673 )
									ret := -0.055556
								if( smoothD_d > 90.7673 )
									ret := 0.750000 // buy
						if( smoothK_k > 94.7535 )
							if( rsi1 <= 95.2085 )
								if( bbm <= 0.010151 )
									ret := -0.465753
								if( bbm > 0.010151 )
									ret := -0.914286 // sell
							if( rsi1 > 95.2085 )
								if( d_k <= -0.145778 )
									ret := 1.000000 // buy
								if( d_k > -0.145778 )
									ret := -0.600000
				if( bbm > 0.03551 )
					if( smoothD_d <= 83.5556 )
						if( k <= 84.6449 )
							if( rsi1 <= 37.9949 )
								if( smoothK_k <= 4.23834 )
									ret := 0.750000 // buy
								if( smoothK_k > 4.23834 )
									ret := 1.000000 // buy
							if( rsi1 > 37.9949 )
								if( d <= 13.6817 )
									ret := 0.345679
								if( d > 13.6817 )
									ret := -0.126803
						if( k > 84.6449 )
							if( smoothK_k <= 85.3112 )
								if( bbm <= 0.061342 )
									ret := -0.500000
								if( bbm > 0.061342 )
									ret := 0.532787
							if( smoothK_k > 85.3112 )
								if( smoothK_k <= 91.8459 )
									ret := -0.162162
								if( smoothK_k > 91.8459 )
									ret := 0.450000
					if( smoothD_d > 83.5556 )
						if( d_k <= -2.02999 )
							if( d <= 91.8838 )
								if( d <= 91.2976 )
									ret := -0.268293
								if( d > 91.2976 )
									ret := 0.269231
							if( d > 91.8838 )
								if( rsi1 <= 70.3624 )
									ret := -0.118280
								if( rsi1 > 70.3624 )
									ret := -0.597633
						if( d_k > -2.02999 )
							if( d_k <= -0.100687 )
								if( k <= 99.9712 )
									ret := 0.160550
								if( k > 99.9712 )
									ret := -0.354167
							if( d_k > -0.100687 )
								if( bearPower <= 0.194189 )
									ret := -0.082437
								if( bearPower > 0.194189 )
									ret := -0.413919
			if( bullPower > 1.48516 )
				if( rsi1 <= 85.0681 )
					if( smoothK_k <= 91.4995 )
						ret := 0.800000 // buy
					if( smoothK_k > 91.4995 )
						ret := -1.000000 // sell
				if( rsi1 > 85.0681 )
					ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_SHOP_1Min_f09731b1(bbm, bearPower, bbp, bullPower, BBPower_Color, d_k, d, rsi1, k, smoothD_d, smoothK_k)

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


