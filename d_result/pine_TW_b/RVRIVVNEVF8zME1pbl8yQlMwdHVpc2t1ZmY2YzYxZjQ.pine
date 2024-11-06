//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: ETHUSDT_30Min_2BS0_ff6c61f4 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETHUSDT_30Min_2BS0_ff6c61f4", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETHUSDT_30Min_ff6c61f4(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( rsi1 <= 51.7155 )
		if( d_k <= -3.12301 )
			if( bbp <= -15.8281 )
				if( d <= 9.73586 )
					if( rsi1 <= 30.2357 )
						if( bullPower <= -5.85649 )
							if( rsi1 <= 23.6654 )
								if( bbm <= 6.295 )
									ret := 0.454545
								if( bbm > 6.295 )
									ret := -0.553719
							if( rsi1 > 23.6654 )
								if( bullPower <= -9.22306 )
									ret := -0.053140
								if( bullPower > -9.22306 )
									ret := -0.416667
						if( bullPower > -5.85649 )
							if( d_k <= -8.06129 )
								ret := 0.000000
							if( d_k > -8.06129 )
								if( bbm <= 21.1119 )
									ret := -0.545455
								if( bbm > 21.1119 )
									ret := -0.890411 // sell
					if( rsi1 > 30.2357 )
						if( bbp <= -58.6301 )
							if( bbm <= 127.065 )
								if( smoothD_d <= 6.36907 )
									ret := 0.474684
								if( smoothD_d > 6.36907 )
									ret := -0.230769
							if( bbm > 127.065 )
								ret := -0.833333 // sell
						if( bbp > -58.6301 )
							if( d_k <= -6.77387 )
								if( smoothD_d <= 3.68431 )
									ret := -0.500000
								if( smoothD_d > 3.68431 )
									ret := 0.035294
							if( d_k > -6.77387 )
								if( rsi1 <= 34.1926 )
									ret := -0.188889
								if( rsi1 > 34.1926 )
									ret := 0.241546
				if( d > 9.73586 )
					if( bbp <= -34.9115 )
						if( rsi1 <= 36.8965 )
							if( bullPower <= -19.6207 )
								if( d_k <= -7.65958 )
									ret := 0.473684
								if( d_k > -7.65958 )
									ret := 0.129555
							if( bullPower > -19.6207 )
								if( smoothK_k <= 65.8911 )
									ret := 0.035549
								if( smoothK_k > 65.8911 )
									ret := -0.409722
						if( rsi1 > 36.8965 )
							if( bbp <= -53.6332 )
								if( rsi1 <= 41.9617 )
									ret := 0.600666
								if( rsi1 > 41.9617 )
									ret := 0.844282 // buy
							if( bbp > -53.6332 )
								if( d <= 59.8041 )
									ret := 0.636240
								if( d > 59.8041 )
									ret := 0.347639
					if( bbp > -34.9115 )
						if( rsi1 <= 40.351 )
							if( rsi1 <= 33.8646 )
								if( bbm <= 12.6882 )
									ret := -0.086420
								if( bbm > 12.6882 )
									ret := -0.465116
							if( rsi1 > 33.8646 )
								if( bullPower <= 4.45925 )
									ret := 0.098276
								if( bullPower > 4.45925 )
									ret := -0.517857
						if( rsi1 > 40.351 )
							if( bbp <= -26.8214 )
								if( rsi1 <= 44.0584 )
									ret := 0.382979
								if( rsi1 > 44.0584 )
									ret := 0.665663
							if( bbp > -26.8214 )
								if( rsi1 <= 48.6408 )
									ret := 0.263374
								if( rsi1 > 48.6408 )
									ret := 0.533557
			if( bbp > -15.8281 )
				if( bearPower <= 3.53296 )
					if( rsi1 <= 40.7926 )
						if( bbm <= 6.315 )
							if( bbm <= 3.01499 )
								if( bbp <= -2.0481 )
									ret := 0.232000
								if( bbp > -2.0481 )
									ret := -0.132530
							if( bbm > 3.01499 )
								if( rsi1 <= 33.0963 )
									ret := -0.377432
								if( rsi1 > 33.0963 )
									ret := -0.065217
						if( bbm > 6.315 )
							if( rsi1 <= 36.7362 )
								if( bullPower <= 1.96667 )
									ret := -0.478261
								if( bullPower > 1.96667 )
									ret := -0.773333 // sell
							if( rsi1 > 36.7362 )
								if( bullPower <= -0.919179 )
									ret := 0.187500
								if( bullPower > -0.919179 )
									ret := -0.414414
					if( rsi1 > 40.7926 )
						if( bbp <= -5.3644 )
							if( bearPower <= -8.31996 )
								if( smoothD_d <= 84.0286 )
									ret := 0.276968
								if( smoothD_d > 84.0286 )
									ret := -0.363636
							if( bearPower > -8.31996 )
								if( smoothD_d <= 42.39 )
									ret := -0.072289
								if( smoothD_d > 42.39 )
									ret := 0.106742
						if( bbp > -5.3644 )
							if( d_k <= -6.72465 )
								if( bbm <= 72.6673 )
									ret := -0.009849
								if( bbm > 72.6673 )
									ret := 0.785714 // buy
							if( d_k > -6.72465 )
								if( bullPower <= 3.91455 )
									ret := 0.050000
								if( bullPower > 3.91455 )
									ret := -0.291139
				if( bearPower > 3.53296 )
					if( k <= 16.2808 )
						if( bbm <= 6.59837 )
							ret := -0.250000
						if( bbm > 6.59837 )
							if( bullPower <= 25.8893 )
								if( bearPower <= 7.54401 )
									ret := -1.000000 // sell
								if( bearPower > 7.54401 )
									ret := -0.750000 // sell
							if( bullPower > 25.8893 )
								if( bbp <= 48.6317 )
									ret := -0.650000
								if( bbp > 48.6317 )
									ret := -1.000000 // sell
					if( k > 16.2808 )
						if( smoothK_k <= 14.1337 )
							ret := 0.142857
						if( smoothK_k > 14.1337 )
							if( bbp <= 32.2094 )
								if( d <= 26.9869 )
									ret := -0.647059
								if( d > 26.9869 )
									ret := -0.323529
							if( bbp > 32.2094 )
								if( bbm <= 30.4405 )
									ret := -0.880000 // sell
								if( bbm > 30.4405 )
									ret := -0.454545
		if( d_k > -3.12301 )
			if( rsi1 <= 32.4649 )
				if( rsi1 <= 23.0066 )
					if( bullPower <= 0.732487 )
						if( bbm <= 5.01578 )
							if( rsi1 <= 12.8883 )
								if( bullPower <= -8.417 )
									ret := 0.000000
								if( bullPower > -8.417 )
									ret := -0.794118 // sell
							if( rsi1 > 12.8883 )
								if( smoothD_d <= 0.57241 )
									ret := 0.276316
								if( smoothD_d > 0.57241 )
									ret := -0.167785
						if( bbm > 5.01578 )
							if( bullPower <= -26.9019 )
								if( rsi1 <= 15.4684 )
									ret := -0.809524 // sell
								if( rsi1 > 15.4684 )
									ret := -0.408451
							if( bullPower > -26.9019 )
								if( smoothK_k <= -1.12539 )
									ret := -0.856517 // sell
								if( smoothK_k > -1.12539 )
									ret := -0.740356 // sell
					if( bullPower > 0.732487 )
						if( bbm <= 5.35864 )
							if( bullPower <= 3.12117 )
								if( bullPower <= 1.82251 )
									ret := -0.615385
								if( bullPower > 1.82251 )
									ret := -0.947368 // sell
							if( bullPower > 3.12117 )
								if( d_k <= 12.128 )
									ret := -0.090909
								if( d_k > 12.128 )
									ret := -0.750000 // sell
						if( bbm > 5.35864 )
							if( bbm <= 12.2197 )
								if( k <= 10.1589 )
									ret := -0.881356 // sell
								if( k > 10.1589 )
									ret := -0.523810
							if( bbm > 12.2197 )
								if( d_k <= -2.71205 )
									ret := -0.666667
								if( d_k > -2.71205 )
									ret := -0.961140 // sell
				if( rsi1 > 23.0066 )
					if( bullPower <= 0.81858 )
						if( bbm <= 5.435 )
							if( smoothD_d <= 0.950866 )
								if( smoothK_k <= -2.46851 )
									ret := 0.000000
								if( smoothK_k > -2.46851 )
									ret := -0.404494
							if( smoothD_d > 0.950866 )
								if( smoothK_k <= 0.017279 )
									ret := 0.250000
								if( smoothK_k > 0.017279 )
									ret := -0.104938
						if( bbm > 5.435 )
							if( bullPower <= -17.9619 )
								if( smoothK_k <= 21.8126 )
									ret := -0.147826
								if( smoothK_k > 21.8126 )
									ret := -0.530000
							if( bullPower > -17.9619 )
								if( bbm <= 14.7094 )
									ret := -0.407375
								if( bbm > 14.7094 )
									ret := -0.586122
					if( bullPower > 0.81858 )
						if( bbm <= 7.21739 )
							if( smoothD_d <= 50.4635 )
								if( rsi1 <= 25.0626 )
									ret := -0.694444
								if( rsi1 > 25.0626 )
									ret := -0.436364
							if( smoothD_d > 50.4635 )
								if( bbm <= 3.33161 )
									ret := -0.222222
								if( bbm > 3.33161 )
									ret := -0.907407 // sell
						if( bbm > 7.21739 )
							if( rsi1 <= 29.2805 )
								if( bullPower <= 4.34514 )
									ret := -0.769968 // sell
								if( bullPower > 4.34514 )
									ret := -0.888535 // sell
							if( rsi1 > 29.2805 )
								if( bullPower <= 7.02239 )
									ret := -0.622396
								if( bullPower > 7.02239 )
									ret := -0.854447 // sell
			if( rsi1 > 32.4649 )
				if( bullPower <= 7.82538 )
					if( rsi1 <= 41.0124 )
						if( bbm <= 6.24355 )
							if( bullPower <= 1.09518 )
								if( d_k <= 11.2392 )
									ret := 0.117260
								if( d_k > 11.2392 )
									ret := -0.143498
							if( bullPower > 1.09518 )
								if( bbp <= 1.39643 )
									ret := -0.123077
								if( bbp > 1.39643 )
									ret := -0.323232
						if( bbm > 6.24355 )
							if( bearPower <= -52.4429 )
								if( d_k <= 3.0944 )
									ret := 0.266667
								if( d_k > 3.0944 )
									ret := -0.258883
							if( bearPower > -52.4429 )
								if( bearPower <= -7.50483 )
									ret := -0.244668
								if( bearPower > -7.50483 )
									ret := -0.474830
					if( rsi1 > 41.0124 )
						if( bullPower <= -1.45441 )
							if( bearPower <= -24.2255 )
								if( d_k <= 4.47828 )
									ret := 0.565074
								if( d_k > 4.47828 )
									ret := 0.216912
							if( bearPower > -24.2255 )
								if( bullPower <= -2.76499 )
									ret := 0.071017
								if( bullPower > -2.76499 )
									ret := 0.258258
						if( bullPower > -1.45441 )
							if( d_k <= 2.41579 )
								if( bbp <= -31.3153 )
									ret := 0.612500
								if( bbp > -31.3153 )
									ret := 0.091120
							if( d_k > 2.41579 )
								if( bullPower <= 2.31293 )
									ret := -0.006562
								if( bullPower > 2.31293 )
									ret := -0.144164
				if( bullPower > 7.82538 )
					if( rsi1 <= 42.581 )
						if( bullPower <= 13.4754 )
							if( d_k <= 4.94682 )
								if( d_k <= 4.75485 )
									ret := -0.516529
								if( d_k > 4.75485 )
									ret := 0.428571
							if( d_k > 4.94682 )
								if( d <= 83.1052 )
									ret := -0.669421
								if( d > 83.1052 )
									ret := -0.360000
						if( bullPower > 13.4754 )
							if( bbp <= 17.8392 )
								if( smoothK_k <= 29.0338 )
									ret := -0.671053
								if( smoothK_k > 29.0338 )
									ret := -0.834375 // sell
							if( bbp > 17.8392 )
								if( bbm <= 9.585 )
									ret := -0.562500
								if( bbm > 9.585 )
									ret := -0.865273 // sell
					if( rsi1 > 42.581 )
						if( bullPower <= 29.624 )
							if( bbp <= 1.31353 )
								if( smoothK_k <= 72.723 )
									ret := 0.062847
								if( smoothK_k > 72.723 )
									ret := -0.445378
							if( bbp > 1.31353 )
								if( bullPower <= 12.8052 )
									ret := -0.293006
								if( bullPower > 12.8052 )
									ret := -0.501406
						if( bullPower > 29.624 )
							if( bearPower <= -40.7891 )
								if( bullPower <= 36.3038 )
									ret := 0.750000 // buy
								if( bullPower > 36.3038 )
									ret := -0.454545
							if( bearPower > -40.7891 )
								if( bullPower <= 37.7203 )
									ret := -0.655263
								if( bullPower > 37.7203 )
									ret := -0.814216 // sell
	if( rsi1 > 51.7155 )
		if( smoothK_k <= 87.2718 )
			if( bearPower <= -3.42278 )
				if( d_k <= -1.01335 )
					if( bearPower <= -11.2028 )
						if( bearPower <= -23.1739 )
							if( smoothD_d <= 5.04814 )
								if( rsi1 <= 55.3918 )
									ret := 0.000000
								if( rsi1 > 55.3918 )
									ret := 0.857143 // buy
							if( smoothD_d > 5.04814 )
								if( bearPower <= -28.211 )
									ret := 0.892442 // buy
								if( bearPower > -28.211 )
									ret := 0.780220 // buy
						if( bearPower > -23.1739 )
							if( bbm <= 40.3739 )
								if( rsi1 <= 55.193 )
									ret := 0.539150
								if( rsi1 > 55.193 )
									ret := 0.755486 // buy
							if( bbm > 40.3739 )
								if( rsi1 <= 61.5244 )
									ret := -0.053571
								if( rsi1 > 61.5244 )
									ret := 0.763158 // buy
					if( bearPower > -11.2028 )
						if( rsi1 <= 61.2405 )
							if( rsi1 <= 54.3977 )
								if( bearPower <= -7.18572 )
									ret := 0.362069
								if( bearPower > -7.18572 )
									ret := 0.099602
							if( rsi1 > 54.3977 )
								if( bullPower <= 43.7902 )
									ret := 0.440037
								if( bullPower > 43.7902 )
									ret := -0.700000 // sell
						if( rsi1 > 61.2405 )
							if( rsi1 <= 67.4267 )
								if( bbm <= 5.35 )
									ret := 0.121951
								if( bbm > 5.35 )
									ret := 0.648515
							if( rsi1 > 67.4267 )
								if( d_k <= -7.86952 )
									ret := 0.838006 // buy
								if( d_k > -7.86952 )
									ret := 0.615385
				if( d_k > -1.01335 )
					if( rsi1 <= 56.6116 )
						if( bbp <= -6.41537 )
							if( bearPower <= -22.1994 )
								if( bullPower <= 46.7291 )
									ret := 0.700508 // buy
								if( bullPower > 46.7291 )
									ret := -0.300000
							if( bearPower > -22.1994 )
								if( k <= 62.6779 )
									ret := 0.436548
								if( k > 62.6779 )
									ret := 0.082090
						if( bbp > -6.41537 )
							if( bbp <= 23.3589 )
								if( bbp <= 6.97862 )
									ret := 0.105563
								if( bbp > 6.97862 )
									ret := -0.111111
							if( bbp > 23.3589 )
								if( k <= 42.6879 )
									ret := -0.129032
								if( k > 42.6879 )
									ret := -0.750000 // sell
					if( rsi1 > 56.6116 )
						if( bullPower <= 33.8213 )
							if( rsi1 <= 60.0351 )
								if( bearPower <= -17.9519 )
									ret := 0.762963 // buy
								if( bearPower > -17.9519 )
									ret := 0.342308
							if( rsi1 > 60.0351 )
								if( smoothK_k <= 68.6713 )
									ret := 0.513382
								if( smoothK_k > 68.6713 )
									ret := 0.723744 // buy
						if( bullPower > 33.8213 )
							if( rsi1 <= 67.286 )
								if( bearPower <= -11.6813 )
									ret := 0.369565
								if( bearPower > -11.6813 )
									ret := -0.510638
							if( rsi1 > 67.286 )
								if( smoothD_d <= 86.392 )
									ret := 0.866667 // buy
								if( smoothD_d > 86.392 )
									ret := 0.000000
			if( bearPower > -3.42278 )
				if( rsi1 <= 65.5807 )
					if( bbp <= 41.016 )
						if( rsi1 <= 58.9479 )
							if( bearPower <= 1.47832 )
								if( smoothD_d <= 32.6586 )
									ret := 0.199265
								if( smoothD_d > 32.6586 )
									ret := -0.033287
							if( bearPower > 1.47832 )
								if( d_k <= -0.874189 )
									ret := 0.010619
								if( d_k > -0.874189 )
									ret := -0.342316
						if( rsi1 > 58.9479 )
							if( d_k <= -0.676058 )
								if( bbm <= 4.84802 )
									ret := 0.037736
								if( bbm > 4.84802 )
									ret := 0.308956
							if( d_k > -0.676058 )
								if( bearPower <= 6.95274 )
									ret := 0.117440
								if( bearPower > 6.95274 )
									ret := -0.093264
					if( bbp > 41.016 )
						if( d_k <= -0.33729 )
							if( d <= 27.5184 )
								if( bbm <= 27.6988 )
									ret := -0.068966
								if( bbm > 27.6988 )
									ret := -0.577465
							if( d > 27.5184 )
								if( d <= 61.0251 )
									ret := 0.412162
								if( d > 61.0251 )
									ret := -0.115646
						if( d_k > -0.33729 )
							if( d_k <= 9.11535 )
								if( bearPower <= 12.1935 )
									ret := -0.218605
								if( bearPower > 12.1935 )
									ret := -0.518927
							if( d_k > 9.11535 )
								if( smoothK_k <= 76.0013 )
									ret := -0.653700
								if( smoothK_k > 76.0013 )
									ret := 0.200000
				if( rsi1 > 65.5807 )
					if( bearPower <= 17.4885 )
						if( bbm <= 5.9616 )
							if( bbp <= 6.05825 )
								if( d <= 90.3767 )
									ret := 0.222561
								if( d > 90.3767 )
									ret := 0.611111
							if( bbp > 6.05825 )
								if( bbp <= 8.17009 )
									ret := -0.125000
								if( bbp > 8.17009 )
									ret := 0.149201
						if( bbm > 5.9616 )
							if( bearPower <= 3.49531 )
								if( d_k <= -10.2619 )
									ret := 0.722096 // buy
								if( d_k > -10.2619 )
									ret := 0.541112
							if( bearPower > 3.49531 )
								if( rsi1 <= 74.5271 )
									ret := 0.310847
								if( rsi1 > 74.5271 )
									ret := 0.545229
					if( bearPower > 17.4885 )
						if( rsi1 <= 75.5274 )
							if( d_k <= 0.082961 )
								if( bullPower <= 83.1178 )
									ret := 0.282946
								if( bullPower > 83.1178 )
									ret := 0.851064 // buy
							if( d_k > 0.082961 )
								if( bearPower <= 38.667 )
									ret := -0.111272
								if( bearPower > 38.667 )
									ret := -0.506024
						if( rsi1 > 75.5274 )
							if( d_k <= 2.18472 )
								if( bbp <= 66.7375 )
									ret := 0.233766
								if( bbp > 66.7375 )
									ret := 0.626609
							if( d_k > 2.18472 )
								if( bbp <= 117.037 )
									ret := 0.339744
								if( bbp > 117.037 )
									ret := -0.050000
		if( smoothK_k > 87.2718 )
			if( rsi1 <= 71.5708 )
				if( bearPower <= -3.127 )
					if( bearPower <= -14.3129 )
						if( d <= 88.9501 )
							if( bbp <= 20.1771 )
								if( rsi1 <= 53.4208 )
									ret := 0.583333
								if( rsi1 > 53.4208 )
									ret := 0.870159 // buy
							if( bbp > 20.1771 )
								ret := -0.250000
						if( d > 88.9501 )
							if( bbp <= 25.2397 )
								if( bearPower <= -39.7794 )
									ret := 0.879070 // buy
								if( bearPower > -39.7794 )
									ret := 0.660793
							if( bbp > 25.2397 )
								if( d <= 92.8284 )
									ret := -0.900000 // sell
								if( d > 92.8284 )
									ret := 0.357143
					if( bearPower > -14.3129 )
						if( rsi1 <= 62.8896 )
							if( rsi1 <= 56.2289 )
								if( d_k <= -18.0448 )
									ret := 0.686567
								if( d_k > -18.0448 )
									ret := 0.080702
							if( rsi1 > 56.2289 )
								if( bbm <= 5.855 )
									ret := 0.177778
								if( bbm > 5.855 )
									ret := 0.491776
						if( rsi1 > 62.8896 )
							if( bullPower <= -0.769452 )
								if( d <= 96.0015 )
									ret := 0.444444
								if( d > 96.0015 )
									ret := 0.034483
							if( bullPower > -0.769452 )
								if( bbp <= 23.483 )
									ret := 0.728218 // buy
								if( bbp > 23.483 )
									ret := 0.489796
				if( bearPower > -3.127 )
					if( rsi1 <= 63.2188 )
						if( bbp <= 49.6625 )
							if( rsi1 <= 56.5491 )
								if( bullPower <= 30.9773 )
									ret := 0.016722
								if( bullPower > 30.9773 )
									ret := -0.575758
							if( rsi1 > 56.5491 )
								if( bbm <= 16.0038 )
									ret := 0.113333
								if( bbm > 16.0038 )
									ret := 0.373737
						if( bbp > 49.6625 )
							if( bbm <= 49.905 )
								if( d <= 82.8224 )
									ret := 0.750000 // buy
								if( d > 82.8224 )
									ret := -0.550000
							if( bbm > 49.905 )
								if( bbp <= 70.2583 )
									ret := 0.523810
								if( bbp > 70.2583 )
									ret := -0.285714
					if( rsi1 > 63.2188 )
						if( bullPower <= 6.70009 )
							if( smoothD_d <= 94.1821 )
								if( smoothD_d <= 90.6643 )
									ret := 0.216312
								if( smoothD_d > 90.6643 )
									ret := -0.177914
							if( smoothD_d > 94.1821 )
								if( smoothK_k <= 95.1966 )
									ret := 0.558824
								if( smoothK_k > 95.1966 )
									ret := 0.188679
						if( bullPower > 6.70009 )
							if( bullPower <= 47.411 )
								if( bearPower <= 1.83064 )
									ret := 0.678647
								if( bearPower > 1.83064 )
									ret := 0.368862
							if( bullPower > 47.411 )
								if( bullPower <= 73.3129 )
									ret := -0.141975
								if( bullPower > 73.3129 )
									ret := 0.328947
			if( rsi1 > 71.5708 )
				if( bbm <= 5.2001 )
					if( bearPower <= 0.297552 )
						if( rsi1 <= 73.2482 )
							if( d_k <= -8.19359 )
								ret := 0.400000
							if( d_k > -8.19359 )
								if( bearPower <= 0.083919 )
									ret := -0.090909
								if( bearPower > 0.083919 )
									ret := 0.250000
						if( rsi1 > 73.2482 )
							if( bbm <= 2.11785 )
								if( k <= 93.1427 )
									ret := 0.875000 // buy
								if( k > 93.1427 )
									ret := 0.125000
							if( bbm > 2.11785 )
								if( d <= 96.8469 )
									ret := 0.861314 // buy
								if( d > 96.8469 )
									ret := 0.679612
					if( bearPower > 0.297552 )
						if( rsi1 <= 90.0123 )
							if( bearPower <= 2.79651 )
								if( d <= 92.8432 )
									ret := 0.103093
								if( d > 92.8432 )
									ret := 0.494949
							if( bearPower > 2.79651 )
								if( bbm <= 4.06683 )
									ret := -0.127119
								if( bbm > 4.06683 )
									ret := 0.183908
						if( rsi1 > 90.0123 )
							if( bbp <= 14.1069 )
								ret := 1.000000 // buy
							if( bbp > 14.1069 )
								if( bbm <= 4.475 )
									ret := 0.000000
								if( bbm > 4.475 )
									ret := 1.000000 // buy
				if( bbm > 5.2001 )
					if( bearPower <= 8.1944 )
						if( rsi1 <= 81.4152 )
							if( bearPower <= -4.7608 )
								if( bbp <= 42.3242 )
									ret := 0.909524 // buy
								if( bbp > 42.3242 )
									ret := 0.538462
							if( bearPower > -4.7608 )
								if( rsi1 <= 74.0015 )
									ret := 0.564644
								if( rsi1 > 74.0015 )
									ret := 0.717839 // buy
						if( rsi1 > 81.4152 )
							if( bearPower <= -1.40063 )
								if( bbp <= -9.3927 )
									ret := 0.666667
								if( bbp > -9.3927 )
									ret := 0.968750 // buy
							if( bearPower > -1.40063 )
								if( bullPower <= 11.5543 )
									ret := 0.750000 // buy
								if( bullPower > 11.5543 )
									ret := 0.895871 // buy
					if( bearPower > 8.1944 )
						if( k <= 99.3335 )
							if( rsi1 <= 83.208 )
								if( bbp <= 58.651 )
									ret := 0.564428
								if( bbp > 58.651 )
									ret := 0.371105
							if( rsi1 > 83.208 )
								if( bbm <= 17.9062 )
									ret := 0.604396
								if( bbm > 17.9062 )
									ret := 0.754286 // buy
						if( k > 99.3335 )
							if( bullPower <= 153.458 )
								if( rsi1 <= 77.1773 )
									ret := 0.540541
								if( rsi1 > 77.1773 )
									ret := 0.827419 // buy
							if( bullPower > 153.458 )
								ret := -0.571429
	
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
float op_operation = decision_tree_0_ETHUSDT_30Min_ff6c61f4(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


