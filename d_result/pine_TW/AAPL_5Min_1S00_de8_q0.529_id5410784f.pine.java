//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: AAPL_5Min_1S00_5410784f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAPL_5Min_1S00_5410784f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAPL_5Min_5410784f(rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( d_k <= 1.10925 )
		if( rsi1 <= 61.9263 )
			if( rsi1 <= 22.7832 )
				if( d_k <= -0.02113 )
					if( rsi1 <= 17.0959 )
						if( k <= 0.436557 )
							if( rsi1 <= 8.33542 )
								ret := -0.400000
							if( rsi1 > 8.33542 )
								if( rsi1 <= 14.9111 )
									ret := 0.909091 // buy
								if( rsi1 > 14.9111 )
									ret := 0.272727
						if( k > 0.436557 )
							if( k <= 17.6672 )
								if( smoothD_d <= 8.29708 )
									ret := -0.018868
								if( smoothD_d > 8.29708 )
									ret := -0.532258
							if( k > 17.6672 )
								if( smoothK_k <= 18.7398 )
									ret := 0.653846
								if( smoothK_k > 18.7398 )
									ret := -0.020833
					if( rsi1 > 17.0959 )
						if( smoothK_k <= 21.1971 )
							if( d_k <= -7.05329 )
								if( smoothD_d <= 5.91839 )
									ret := 0.058824
								if( smoothD_d > 5.91839 )
									ret := 0.847458 // buy
							if( d_k > -7.05329 )
								if( d <= 1.17297 )
									ret := 0.081967
								if( d > 1.17297 )
									ret := 0.301370
						if( smoothK_k > 21.1971 )
							if( d_k <= -11.8288 )
								if( smoothD_d <= 33.7524 )
									ret := 0.434783
								if( smoothD_d > 33.7524 )
									ret := -0.047619
							if( d_k > -11.8288 )
								if( smoothK_k <= 32.1265 )
									ret := -0.228261
								if( smoothK_k > 32.1265 )
									ret := 0.135593
				if( d_k > -0.02113 )
					if( rsi1 <= 13.9079 )
						if( smoothK_k <= 3.4491 )
							if( d_k <= 0.319911 )
								if( smoothK_k <= -2.97287 )
									ret := 0.366667
								if( smoothK_k > -2.97287 )
									ret := -0.089552
							if( d_k > 0.319911 )
								if( d_k <= 0.746901 )
									ret := 0.409836
								if( d_k > 0.746901 )
									ret := 0.681818
						if( smoothK_k > 3.4491 )
							if( smoothD_d <= 9.28768 )
								ret := -0.142857
							if( smoothD_d > 9.28768 )
								if( d <= 16.7793 )
									ret := -0.846154 // sell
								if( d > 16.7793 )
									ret := 0.000000
					if( rsi1 > 13.9079 )
						if( rsi1 <= 16.099 )
							if( smoothD_d <= -2.1295 )
								if( k <= 0.037626 )
									ret := -0.721311 // sell
								if( k > 0.037626 )
									ret := -1.000000 // sell
							if( smoothD_d > -2.1295 )
								if( d <= 1.59267 )
									ret := 0.500000
								if( d > 1.59267 )
									ret := -0.125000
						if( rsi1 > 16.099 )
							if( smoothD_d <= 0.938848 )
								if( smoothK_k <= -0.857673 )
									ret := 0.057778
								if( smoothK_k > -0.857673 )
									ret := 0.500000
							if( smoothD_d > 0.938848 )
								if( d <= 5.65947 )
									ret := -0.379310
								if( d > 5.65947 )
									ret := -0.131579
			if( rsi1 > 22.7832 )
				if( d <= 52.0617 )
					if( d <= 0.773948 )
						if( d_k <= 0.106063 )
							if( rsi1 <= 39.1722 )
								if( smoothD_d <= -2.95274 )
									ret := -0.041860
								if( smoothD_d > -2.95274 )
									ret := 0.181818
							if( rsi1 > 39.1722 )
								if( d <= 0.557858 )
									ret := 0.312057
								if( d > 0.557858 )
									ret := 0.631579
						if( d_k > 0.106063 )
							if( rsi1 <= 30.9377 )
								if( rsi1 <= 23.774 )
									ret := -0.666667
								if( rsi1 > 23.774 )
									ret := 0.437500
							if( rsi1 > 30.9377 )
								if( d_k <= 0.341059 )
									ret := -0.540000
								if( d_k > 0.341059 )
									ret := 0.080000
					if( d > 0.773948 )
						if( d <= 1.58459 )
							if( d_k <= -0.491543 )
								if( k <= 2.65258 )
									ret := 0.168000
								if( k > 2.65258 )
									ret := -0.251799
							if( d_k > -0.491543 )
								if( smoothK_k <= -2.28668 )
									ret := -0.124088
								if( smoothK_k > -2.28668 )
									ret := -0.390244
						if( d > 1.58459 )
							if( smoothK_k <= 3.46473 )
								if( rsi1 <= 53.9906 )
									ret := 0.106061
								if( rsi1 > 53.9906 )
									ret := -0.408602
							if( smoothK_k > 3.46473 )
								if( k <= 9.09304 )
									ret := -0.149415
								if( k > 9.09304 )
									ret := 0.017997
				if( d > 52.0617 )
					if( rsi1 <= 38.9605 )
						if( smoothD_d <= 93.4186 )
							if( k <= 58.8118 )
								if( d_k <= -1.43849 )
									ret := 0.744681 // buy
								if( d_k > -1.43849 )
									ret := -0.125000
							if( k > 58.8118 )
								if( d_k <= -7.72088 )
									ret := 0.038400
								if( d_k > -7.72088 )
									ret := -0.140684
						if( smoothD_d > 93.4186 )
							if( rsi1 <= 29.4964 )
								ret := 0.166667
							if( rsi1 > 29.4964 )
								if( rsi1 <= 36.636 )
									ret := -0.926829 // sell
								if( rsi1 > 36.636 )
									ret := -0.222222
					if( rsi1 > 38.9605 )
						if( d <= 54.6968 )
							if( d_k <= -5.06784 )
								if( smoothK_k <= 60.2495 )
									ret := -0.112245
								if( smoothK_k > 60.2495 )
									ret := 0.248092
							if( d_k > -5.06784 )
								if( d_k <= -1.51025 )
									ret := 0.593985
								if( d_k > -1.51025 )
									ret := 0.175676
						if( d > 54.6968 )
							if( k <= 60.0725 )
								if( d_k <= 0.518145 )
									ret := -0.142857
								if( d_k > 0.518145 )
									ret := -0.530612
							if( k > 60.0725 )
								if( d_k <= -4.46811 )
									ret := 0.045630
								if( d_k > -4.46811 )
									ret := 0.123243
		if( rsi1 > 61.9263 )
			if( smoothD_d <= 31.0803 )
				if( rsi1 <= 68.2245 )
					if( smoothD_d <= -1.77423 )
						ret := 0.833333 // buy
					if( smoothD_d > -1.77423 )
						if( smoothK_k <= 44.5424 )
							if( smoothK_k <= 9.4252 )
								if( smoothD_d <= 1.54276 )
									ret := -0.580645
								if( smoothD_d > 1.54276 )
									ret := 0.255319
							if( smoothK_k > 9.4252 )
								if( smoothK_k <= 19.6835 )
									ret := -0.594771
								if( smoothK_k > 19.6835 )
									ret := -0.257218
						if( smoothK_k > 44.5424 )
							if( rsi1 <= 67.1561 )
								if( smoothD_d <= 29.0206 )
									ret := 0.342105
								if( smoothD_d > 29.0206 )
									ret := -0.384615
							if( rsi1 > 67.1561 )
								if( d <= 29.2432 )
									ret := -0.800000 // sell
								if( d > 29.2432 )
									ret := -0.500000
				if( rsi1 > 68.2245 )
					if( rsi1 <= 70.7524 )
						if( smoothK_k <= 21.1127 )
							if( smoothD_d <= 12.2136 )
								if( d <= 13.3189 )
									ret := -0.114286
								if( d > 13.3189 )
									ret := 1.000000 // buy
							if( smoothD_d > 12.2136 )
								if( d_k <= -2.99145 )
									ret := -1.000000 // sell
								if( d_k > -2.99145 )
									ret := -0.500000
						if( smoothK_k > 21.1127 )
							if( d_k <= -6.6242 )
								if( d <= 32.473 )
									ret := -0.012658
								if( d > 32.473 )
									ret := 0.857143 // buy
							if( d_k > -6.6242 )
								if( smoothD_d <= 24.1512 )
									ret := 0.863636 // buy
								if( smoothD_d > 24.1512 )
									ret := 0.181818
					if( rsi1 > 70.7524 )
						if( smoothD_d <= 24.8824 )
							if( d_k <= -12.8588 )
								if( d <= 14.5904 )
									ret := -0.350000
								if( d > 14.5904 )
									ret := 0.250000
							if( d_k > -12.8588 )
								if( smoothD_d <= 23.7219 )
									ret := -0.278846
								if( smoothD_d > 23.7219 )
									ret := 0.428571
						if( smoothD_d > 24.8824 )
							if( rsi1 <= 73.0431 )
								if( rsi1 <= 72.8146 )
									ret := -0.135135
								if( rsi1 > 72.8146 )
									ret := 0.750000 // buy
							if( rsi1 > 73.0431 )
								if( smoothK_k <= 48.8853 )
									ret := -0.774194 // sell
								if( smoothK_k > 48.8853 )
									ret := -0.294118
			if( smoothD_d > 31.0803 )
				if( d_k <= -16.6366 )
					if( smoothK_k <= 62.0956 )
						if( d <= 41.4732 )
							if( k <= 53.7577 )
								if( d <= 35.548 )
									ret := 0.000000
								if( d > 35.548 )
									ret := -0.750000 // sell
							if( k > 53.7577 )
								if( d <= 36.8078 )
									ret := 0.458333
								if( d > 36.8078 )
									ret := 0.040816
						if( d > 41.4732 )
							if( d_k <= -18.3751 )
								if( d_k <= -20.1471 )
									ret := 0.250000
								if( d_k > -20.1471 )
									ret := 0.818182 // buy
							if( d_k > -18.3751 )
								if( d <= 42.4608 )
									ret := 1.000000 // buy
								if( d > 42.4608 )
									ret := 0.125000
					if( smoothK_k > 62.0956 )
						if( d <= 38.0029 )
							if( d_k <= -32.2245 )
								ret := -0.750000 // sell
							if( d_k > -32.2245 )
								if( smoothK_k <= 62.7989 )
									ret := 0.000000
								if( smoothK_k > 62.7989 )
									ret := 0.826087 // buy
						if( d > 38.0029 )
							if( rsi1 <= 73.9644 )
								if( rsi1 <= 62.5784 )
									ret := -0.474576
								if( rsi1 > 62.5784 )
									ret := -0.008495
							if( rsi1 > 73.9644 )
								if( d <= 50.8272 )
									ret := -0.222222
								if( d > 50.8272 )
									ret := 0.323887
				if( d_k > -16.6366 )
					if( d <= 66.4062 )
						if( smoothD_d <= 51.0838 )
							if( d <= 49.6829 )
								if( smoothK_k <= 55.6405 )
									ret := -0.008230
								if( smoothK_k > 55.6405 )
									ret := -0.493976
							if( d > 49.6829 )
								if( d_k <= -4.30812 )
									ret := 0.450382
								if( d_k > -4.30812 )
									ret := -0.062500
						if( smoothD_d > 51.0838 )
							if( smoothD_d <= 56.9241 )
								if( smoothK_k <= 57.0802 )
									ret := -0.013333
								if( smoothK_k > 57.0802 )
									ret := -0.348592
							if( smoothD_d > 56.9241 )
								if( smoothK_k <= 75.2837 )
									ret := -0.047244
								if( smoothK_k > 75.2837 )
									ret := -0.409836
					if( d > 66.4062 )
						if( k <= 99.9999 )
							if( k <= 99.2954 )
								if( rsi1 <= 63.2443 )
									ret := -0.156576
								if( rsi1 > 63.2443 )
									ret := 0.013520
							if( k > 99.2954 )
								if( k <= 99.7663 )
									ret := 0.291165
								if( k > 99.7663 )
									ret := 0.017595
						if( k > 99.9999 )
							if( smoothD_d <= 94.6753 )
								if( rsi1 <= 83.9237 )
									ret := 0.110733
								if( rsi1 > 83.9237 )
									ret := -0.460674
							if( smoothD_d > 94.6753 )
								if( d <= 99.9859 )
									ret := -0.249412
								if( d > 99.9859 )
									ret := -0.089147
	if( d_k > 1.10925 )
		if( smoothD_d <= 63.4627 )
			if( rsi1 <= 58.7712 )
				if( rsi1 <= 18.5002 )
					if( k <= 2.54589 )
						if( rsi1 <= 10.8247 )
							if( d_k <= 1.50099 )
								if( d_k <= 1.23908 )
									ret := 0.000000
								if( d_k > 1.23908 )
									ret := 0.928571 // buy
							if( d_k > 1.50099 )
								if( d <= 12.2952 )
									ret := -0.033333
								if( d > 12.2952 )
									ret := -0.857143 // sell
						if( rsi1 > 10.8247 )
							if( rsi1 <= 18.0296 )
								if( smoothK_k <= -2.8693 )
									ret := 0.447059
								if( smoothK_k > -2.8693 )
									ret := 0.666667
							if( rsi1 > 18.0296 )
								if( k <= 0.199655 )
									ret := -0.461538
								if( k > 0.199655 )
									ret := 0.400000
					if( k > 2.54589 )
						if( k <= 6.00208 )
							if( d_k <= 3.39836 )
								if( smoothD_d <= 1.87495 )
									ret := 0.750000 // buy
								if( smoothD_d > 1.87495 )
									ret := 0.068966
							if( d_k > 3.39836 )
								if( rsi1 <= 16.3823 )
									ret := -0.645833
								if( rsi1 > 16.3823 )
									ret := 0.105263
						if( k > 6.00208 )
							if( smoothD_d <= 8.79381 )
								if( smoothD_d <= 7.77569 )
									ret := 0.250000
								if( smoothD_d > 7.77569 )
									ret := 0.925926 // buy
							if( smoothD_d > 8.79381 )
								if( smoothD_d <= 11.5579 )
									ret := -0.590909
								if( smoothD_d > 11.5579 )
									ret := 0.069149
				if( rsi1 > 18.5002 )
					if( rsi1 <= 46.3544 )
						if( rsi1 <= 37.0548 )
							if( k <= 55.2181 )
								if( d_k <= 32.5798 )
									ret := 0.078701
								if( d_k > 32.5798 )
									ret := 0.736842 // buy
							if( k > 55.2181 )
								if( d_k <= 4.85582 )
									ret := 0.679245
								if( d_k > 4.85582 )
									ret := -0.181818
						if( rsi1 > 37.0548 )
							if( k <= 44.1593 )
								if( smoothK_k <= 23.2835 )
									ret := 0.030916
								if( smoothK_k > 23.2835 )
									ret := -0.117827
							if( k > 44.1593 )
								if( d <= 50.2061 )
									ret := 0.527778
								if( d > 50.2061 )
									ret := 0.106383
					if( rsi1 > 46.3544 )
						if( k <= 57.9569 )
							if( d_k <= 23.9833 )
								if( d_k <= 2.71387 )
									ret := 0.023904
								if( d_k > 2.71387 )
									ret := 0.120926
							if( d_k > 23.9833 )
								if( d_k <= 29.3284 )
									ret := 0.353896
								if( d_k > 29.3284 )
									ret := -0.070423
						if( k > 57.9569 )
							if( rsi1 <= 55.137 )
								if( rsi1 <= 52.0128 )
									ret := -0.022472
								if( rsi1 > 52.0128 )
									ret := -0.436620
							if( rsi1 > 55.137 )
								if( rsi1 <= 56.7754 )
									ret := 0.607143
								if( rsi1 > 56.7754 )
									ret := -0.107143
			if( rsi1 > 58.7712 )
				if( smoothK_k <= 57.0067 )
					if( smoothK_k <= 55.0281 )
						if( k <= 57.1231 )
							if( d_k <= 28.195 )
								if( k <= 0.015521 )
									ret := 0.327586
								if( k > 0.015521 )
									ret := -0.039442
							if( d_k > 28.195 )
								if( rsi1 <= 68.2653 )
									ret := -0.656250
								if( rsi1 > 68.2653 )
									ret := 0.285714
						if( k > 57.1231 )
							if( d <= 62.3995 )
								if( d_k <= 4.01943 )
									ret := 0.142857
								if( d_k > 4.01943 )
									ret := -0.800000 // sell
							if( d > 62.3995 )
								if( rsi1 <= 72.6474 )
									ret := 0.718750 // buy
								if( rsi1 > 72.6474 )
									ret := -0.250000
					if( smoothK_k > 55.0281 )
						if( smoothD_d <= 60.8945 )
							if( k <= 58.303 )
								ret := -0.250000
							if( k > 58.303 )
								if( smoothD_d <= 58.93 )
									ret := 0.000000
								if( smoothD_d > 58.93 )
									ret := 0.250000
						if( smoothD_d > 60.8945 )
							if( rsi1 <= 76.2453 )
								if( d_k <= 6.22149 )
									ret := -0.461538
								if( d_k > 6.22149 )
									ret := -0.884615 // sell
							if( rsi1 > 76.2453 )
								ret := -0.200000
				if( smoothK_k > 57.0067 )
					if( smoothK_k <= 60.677 )
						if( rsi1 <= 61.3616 )
							if( smoothD_d <= 60.5104 )
								ret := -0.600000
							if( smoothD_d > 60.5104 )
								if( smoothD_d <= 61.8056 )
									ret := 0.000000
								if( smoothD_d > 61.8056 )
									ret := -0.250000
						if( rsi1 > 61.3616 )
							if( smoothK_k <= 58.6546 )
								if( d_k <= 4.66729 )
									ret := 0.825000 // buy
								if( d_k > 4.66729 )
									ret := 0.111111
							if( smoothK_k > 58.6546 )
								if( rsi1 <= 70.9783 )
									ret := -0.125000
								if( rsi1 > 70.9783 )
									ret := 0.526316
					if( smoothK_k > 60.677 )
						if( smoothD_d <= 62.9758 )
							ret := -0.833333 // sell
						if( smoothD_d > 62.9758 )
							ret := -0.285714
		if( smoothD_d > 63.4627 )
			if( d_k <= 24.7215 )
				if( k <= 90.3851 )
					if( rsi1 <= 88.045 )
						if( rsi1 <= 59.2175 )
							if( d_k <= 3.7621 )
								if( k <= 78.4865 )
									ret := 0.131687
								if( k > 78.4865 )
									ret := -0.075188
							if( d_k > 3.7621 )
								if( smoothD_d <= 65.31 )
									ret := 0.309816
								if( smoothD_d > 65.31 )
									ret := 0.128210
						if( rsi1 > 59.2175 )
							if( rsi1 <= 61.6418 )
								if( d <= 80.9586 )
									ret := -0.212938
								if( d > 80.9586 )
									ret := 0.056277
							if( rsi1 > 61.6418 )
								if( smoothK_k <= 85.8277 )
									ret := 0.078099
								if( smoothK_k > 85.8277 )
									ret := -0.127119
					if( rsi1 > 88.045 )
						if( d <= 91.2458 )
							if( rsi1 <= 89.0648 )
								if( d <= 86.9354 )
									ret := 0.800000 // buy
								if( d > 86.9354 )
									ret := 0.500000
							if( rsi1 > 89.0648 )
								if( smoothK_k <= 71.6541 )
									ret := 1.000000 // buy
								if( smoothK_k > 71.6541 )
									ret := 0.842105 // buy
						if( d > 91.2458 )
							if( smoothD_d <= 88.8197 )
								if( smoothK_k <= 85.754 )
									ret := -1.000000 // sell
								if( smoothK_k > 85.754 )
									ret := -0.500000
							if( smoothD_d > 88.8197 )
								if( smoothD_d <= 90.1769 )
									ret := 0.400000
								if( smoothD_d > 90.1769 )
									ret := 0.857143 // buy
				if( k > 90.3851 )
					if( rsi1 <= 78.0122 )
						if( rsi1 <= 74.8454 )
							if( rsi1 <= 38.9347 )
								if( smoothK_k <= 89.9923 )
									ret := 0.416667
								if( smoothK_k > 89.9923 )
									ret := 0.814815 // buy
							if( rsi1 > 38.9347 )
								if( rsi1 <= 41.0894 )
									ret := -0.480000
								if( rsi1 > 41.0894 )
									ret := 0.185404
						if( rsi1 > 74.8454 )
							if( d_k <= 4.51038 )
								if( smoothD_d <= 93.8838 )
									ret := 0.559140
								if( smoothD_d > 93.8838 )
									ret := 0.119565
							if( d_k > 4.51038 )
								if( d <= 96.5167 )
									ret := 0.875000 // buy
								if( d > 96.5167 )
									ret := 1.000000 // buy
					if( rsi1 > 78.0122 )
						if( rsi1 <= 88.4802 )
							if( k <= 90.6869 )
								if( d_k <= 4.79903 )
									ret := 0.833333 // buy
								if( d_k > 4.79903 )
									ret := 0.500000
							if( k > 90.6869 )
								if( rsi1 <= 81.4034 )
									ret := 0.000000
								if( rsi1 > 81.4034 )
									ret := -0.327103
						if( rsi1 > 88.4802 )
							if( smoothD_d <= 91.7229 )
								if( rsi1 <= 91.6058 )
									ret := 1.000000 // buy
								if( rsi1 > 91.6058 )
									ret := 0.750000 // buy
							if( smoothD_d > 91.7229 )
								if( k <= 95.251 )
									ret := 0.115385
								if( k > 95.251 )
									ret := 0.615385
			if( d_k > 24.7215 )
				if( rsi1 <= 64.3166 )
					if( d <= 75.7411 )
						if( k <= 45.4341 )
							if( d <= 71.3721 )
								if( d_k <= 29.7134 )
									ret := 0.607143
								if( d_k > 29.7134 )
									ret := 0.076923
							if( d > 71.3721 )
								if( rsi1 <= 44.7449 )
									ret := -0.300000
								if( rsi1 > 44.7449 )
									ret := 0.400000
						if( k > 45.4341 )
							if( d <= 74.3759 )
								if( smoothK_k <= 42.8346 )
									ret := 1.000000 // buy
								if( smoothK_k > 42.8346 )
									ret := 0.608696
							if( d > 74.3759 )
								ret := 1.000000 // buy
					if( d > 75.7411 )
						if( rsi1 <= 53.872 )
							if( rsi1 <= 38.9526 )
								ret := -0.500000
							if( rsi1 > 38.9526 )
								ret := 0.000000
						if( rsi1 > 53.872 )
							ret := 0.571429
				if( rsi1 > 64.3166 )
					if( rsi1 <= 77.3745 )
						if( d_k <= 26.1262 )
							if( smoothK_k <= 45.1135 )
								ret := -0.857143 // sell
							if( smoothK_k > 45.1135 )
								ret := -0.500000
						if( d_k > 26.1262 )
							ret := 0.000000
					if( rsi1 > 77.3745 )
						ret := 1.000000 // buy
	
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
float op_operation = decision_tree_0_AAPL_5Min_5410784f(rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


