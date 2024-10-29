//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: DOGEUSDT_30Min_2CS0_22bc5ca9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOGEUSDT_30Min_2CS0_22bc5ca9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOGEUSDT_30Min_22bc5ca9(mf, ad_mf, ad, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( k <= 45.9922 )
		if( rsi1 <= 41.5782 )
			if( mf <= -0.054406 )
				if( rsi1 <= 30.3296 )
					if( ad <= -1.33392e+08 )
						if( smoothD_d <= 8.14471 )
							if( ad <= -1.84341e+08 )
								ret := 0.555556
							if( ad > -1.84341e+08 )
								ret := -0.523810
						if( smoothD_d > 8.14471 )
							if( ad_mf <= -2.44344e+08 )
								if( ad_mf <= -3.32246e+08 )
									ret := 1.000000 // buy
								if( ad_mf > -3.32246e+08 )
									ret := -0.571429
							if( ad_mf > -2.44344e+08 )
								if( ad <= -2.12991e+08 )
									ret := 1.000000 // buy
								if( ad > -2.12991e+08 )
									ret := 0.687500
					if( ad > -1.33392e+08 )
						if( smoothK_k <= 12.4857 )
							if( rsi1 <= 18.6988 )
								if( d_k <= -3.68812 )
									ret := -0.291667
								if( d_k > -3.68812 )
									ret := -0.793796 // sell
							if( rsi1 > 18.6988 )
								if( d_k <= 0.949904 )
									ret := -0.481221
								if( d_k > 0.949904 )
									ret := -0.694274
						if( smoothK_k > 12.4857 )
							if( d_k <= -2.52051 )
								if( d_k <= -8.18363 )
									ret := -0.025000
								if( d_k > -8.18363 )
									ret := -0.321053
							if( d_k > -2.52051 )
								if( ad_mf <= 9.18372e+07 )
									ret := -0.642276
								if( ad_mf > 9.18372e+07 )
									ret := 0.250000
				if( rsi1 > 30.3296 )
					if( d_k <= -2.5043 )
						if( ad <= -2.44795e+07 )
							if( k <= 39.6788 )
								if( ad <= -1.10864e+08 )
									ret := -0.102941
								if( ad > -1.10864e+08 )
									ret := 0.343849
							if( k > 39.6788 )
								if( k <= 43.1582 )
									ret := 0.866667 // buy
								if( k > 43.1582 )
									ret := 0.555556
						if( ad > -2.44795e+07 )
							if( smoothK_k <= 23.0657 )
								if( ad_mf <= -6.29323e+06 )
									ret := -0.038889
								if( ad_mf > -6.29323e+06 )
									ret := -0.286638
							if( smoothK_k > 23.0657 )
								if( ad_mf <= 2.60908e+07 )
									ret := -0.001595
								if( ad_mf > 2.60908e+07 )
									ret := 0.345679
					if( d_k > -2.5043 )
						if( ad <= 1.50774e+07 )
							if( mf <= -0.204763 )
								if( ad_mf <= -4.09525e+07 )
									ret := 0.793103 // buy
								if( ad_mf > -4.09525e+07 )
									ret := -0.322870
							if( mf > -0.204763 )
								if( d_k <= 3.69527 )
									ret := -0.295337
								if( d_k > 3.69527 )
									ret := -0.503376
						if( ad > 1.50774e+07 )
							if( d <= 2.99402 )
								if( smoothD_d <= -1.07378 )
									ret := -0.500000
								if( smoothD_d > -1.07378 )
									ret := 0.222222
							if( d > 2.99402 )
								if( mf <= -0.089986 )
									ret := -0.812500 // sell
								if( mf > -0.089986 )
									ret := -0.651786
			if( mf > -0.054406 )
				if( ad <= -3.51042e+08 )
					if( ad <= -1.06329e+09 )
						ret := 0.000000
					if( ad > -1.06329e+09 )
						if( ad <= -5.00972e+08 )
							ret := 0.571429
						if( ad > -5.00972e+08 )
							ret := 1.000000 // buy
				if( ad > -3.51042e+08 )
					if( d <= 31.3505 )
						if( rsi1 <= 33.6054 )
							if( d_k <= -5.62265 )
								if( ad <= 2.76082e+07 )
									ret := -0.466797
								if( ad > 2.76082e+07 )
									ret := -0.074074
							if( d_k > -5.62265 )
								if( k <= 0.000552 )
									ret := -0.528233
								if( k > 0.000552 )
									ret := -0.684286
						if( rsi1 > 33.6054 )
							if( k <= 31.5248 )
								if( d_k <= 3.64142 )
									ret := -0.363320
								if( d_k > 3.64142 )
									ret := -0.589062
							if( k > 31.5248 )
								if( ad_mf <= -7.22824e+06 )
									ret := 0.177083
								if( ad_mf > -7.22824e+06 )
									ret := -0.194946
					if( d > 31.3505 )
						if( d_k <= -1.05738 )
							if( mf <= 0.072573 )
								if( ad <= -4.44452e+06 )
									ret := -0.034483
								if( ad > -4.44452e+06 )
									ret := -0.422018
							if( mf > 0.072573 )
								if( ad <= -2.48848e+06 )
									ret := -0.909091 // sell
								if( ad > -2.48848e+06 )
									ret := -0.492537
						if( d_k > -1.05738 )
							if( rsi1 <= 36.2011 )
								if( d_k <= 30.1069 )
									ret := -0.770723 // sell
								if( d_k > 30.1069 )
									ret := -0.388889
							if( rsi1 > 36.2011 )
								if( smoothD_d <= 29.3719 )
									ret := -0.875000 // sell
								if( smoothD_d > 29.3719 )
									ret := -0.601208
		if( rsi1 > 41.5782 )
			if( rsi1 <= 49.4252 )
				if( mf <= 0.059633 )
					if( d <= 42.7888 )
						if( mf <= -0.018946 )
							if( smoothK_k <= 22.0259 )
								if( d <= 19.2665 )
									ret := -0.034800
								if( d > 19.2665 )
									ret := -0.342629
							if( smoothK_k > 22.0259 )
								if( ad_mf <= -9.01659e+06 )
									ret := 0.487342
								if( ad_mf > -9.01659e+06 )
									ret := 0.076301
						if( mf > -0.018946 )
							if( ad_mf <= -3.17523e+07 )
								if( smoothD_d <= 21.5825 )
									ret := 0.526829
								if( smoothD_d > 21.5825 )
									ret := -0.230303
							if( ad_mf > -3.17523e+07 )
								if( smoothK_k <= 27.7571 )
									ret := -0.216216
								if( smoothK_k > 27.7571 )
									ret := 0.048013
					if( d > 42.7888 )
						if( d_k <= 2.72767 )
							if( d_k <= -1.01254 )
								ret := 0.714286 // buy
							if( d_k > -1.01254 )
								if( ad_mf <= 1.15395e+07 )
									ret := 0.200000
								if( ad_mf > 1.15395e+07 )
									ret := -0.444444
						if( d_k > 2.72767 )
							if( ad <= 4.02488e+06 )
								if( ad <= -1.32615e+08 )
									ret := -0.806452 // sell
								if( ad > -1.32615e+08 )
									ret := -0.317647
							if( ad > 4.02488e+06 )
								if( k <= 36.9217 )
									ret := -0.765217 // sell
								if( k > 36.9217 )
									ret := -0.396104
				if( mf > 0.059633 )
					if( d <= 41.966 )
						if( mf <= 0.167296 )
							if( d_k <= 4.98218 )
								if( smoothK_k <= 35.5247 )
									ret := -0.144646
								if( smoothK_k > 35.5247 )
									ret := 0.208531
							if( d_k > 4.98218 )
								if( smoothD_d <= 38.2802 )
									ret := -0.490022
								if( smoothD_d > 38.2802 )
									ret := 0.166667
						if( mf > 0.167296 )
							if( k <= 1.43675 )
								if( ad <= 2.06122e+07 )
									ret := -0.217391
								if( ad > 2.06122e+07 )
									ret := 0.466667
							if( k > 1.43675 )
								if( d_k <= -8.87642 )
									ret := 0.035714
								if( d_k > -8.87642 )
									ret := -0.504043
					if( d > 41.966 )
						if( d_k <= 5.341 )
							if( mf <= 0.087524 )
								if( mf <= 0.068531 )
									ret := -0.523810
								if( mf > 0.068531 )
									ret := -0.909091 // sell
							if( mf > 0.087524 )
								if( d <= 43.3215 )
									ret := -0.466667
								if( d > 43.3215 )
									ret := 0.106383
						if( d_k > 5.341 )
							if( d_k <= 21.6816 )
								if( smoothK_k <= 38.9648 )
									ret := -0.725962 // sell
								if( smoothK_k > 38.9648 )
									ret := -0.580357
							if( d_k > 21.6816 )
								if( smoothK_k <= 28.6885 )
									ret := -0.275862
								if( smoothK_k > 28.6885 )
									ret := -0.525424
			if( rsi1 > 49.4252 )
				if( ad <= 9.79157e+06 )
					if( smoothD_d <= 44.6056 )
						if( k <= 26.2558 )
							if( d_k <= 4.04859 )
								if( smoothD_d <= 3.0044 )
									ret := -0.098266
								if( smoothD_d > 3.0044 )
									ret := 0.262357
							if( d_k > 4.04859 )
								if( mf <= -0.034506 )
									ret := 0.122951
								if( mf > -0.034506 )
									ret := -0.189689
						if( k > 26.2558 )
							if( rsi1 <= 59.6485 )
								if( mf <= 0.01213 )
									ret := 0.431963
								if( mf > 0.01213 )
									ret := 0.133056
							if( rsi1 > 59.6485 )
								if( d_k <= 6.05583 )
									ret := 0.494962
								if( d_k > 6.05583 )
									ret := 0.238889
					if( smoothD_d > 44.6056 )
						if( mf <= 0.198664 )
							if( d_k <= 8.27445 )
								if( mf <= 0.113214 )
									ret := 0.165354
								if( mf > 0.113214 )
									ret := -0.451613
							if( d_k > 8.27445 )
								if( rsi1 <= 51.5387 )
									ret := -0.547872
								if( rsi1 > 51.5387 )
									ret := -0.124431
						if( mf > 0.198664 )
							if( d_k <= 26.9943 )
								if( smoothD_d <= 55.0543 )
									ret := -0.064935
								if( smoothD_d > 55.0543 )
									ret := 0.242424
							if( d_k > 26.9943 )
								ret := 0.750000 // buy
				if( ad > 9.79157e+06 )
					if( d_k <= 6.67098 )
						if( rsi1 <= 62.7877 )
							if( mf <= 0.079881 )
								if( smoothK_k <= 19.3656 )
									ret := -0.078947
								if( smoothK_k > 19.3656 )
									ret := 0.290676
							if( mf > 0.079881 )
								if( k <= 21.4268 )
									ret := -0.398827
								if( k > 21.4268 )
									ret := -0.159278
						if( rsi1 > 62.7877 )
							if( ad <= 1.75883e+07 )
								if( d_k <= 2.94549 )
									ret := 0.766667 // buy
								if( d_k > 2.94549 )
									ret := 0.125000
							if( ad > 1.75883e+07 )
								if( ad <= 1.47625e+08 )
									ret := 0.186813
								if( ad > 1.47625e+08 )
									ret := 0.549451
					if( d_k > 6.67098 )
						if( smoothD_d <= 47.1262 )
							if( mf <= 0.163702 )
								if( ad_mf <= 1.81976e+08 )
									ret := -0.281955
								if( ad_mf > 1.81976e+08 )
									ret := 0.192982
							if( mf > 0.163702 )
								if( mf <= 0.230247 )
									ret := -0.649770
								if( mf > 0.230247 )
									ret := -0.363636
						if( smoothD_d > 47.1262 )
							if( smoothD_d <= 61.5295 )
								if( d_k <= 8.77703 )
									ret := 0.055556
								if( d_k > 8.77703 )
									ret := -0.631410
							if( smoothD_d > 61.5295 )
								if( k <= 42.7061 )
									ret := -0.125000
								if( k > 42.7061 )
									ret := 0.333333
	if( k > 45.9922 )
		if( rsi1 <= 56.0322 )
			if( rsi1 <= 40.7383 )
				if( ad <= -2.58913e+07 )
					if( smoothD_d <= 48.5698 )
						if( d <= 37.4615 )
							if( d_k <= -20.1791 )
								ret := 0.250000
							if( d_k > -20.1791 )
								if( d <= 34.347 )
									ret := 0.771429 // buy
								if( d > 34.347 )
									ret := 1.000000 // buy
						if( d > 37.4615 )
							if( rsi1 <= 39.6892 )
								if( mf <= -0.057705 )
									ret := 0.592308
								if( mf > -0.057705 )
									ret := -0.171429
							if( rsi1 > 39.6892 )
								ret := -0.266667
					if( smoothD_d > 48.5698 )
						if( k <= 73.0942 )
							if( mf <= -0.18115 )
								if( d <= 63.7541 )
									ret := 0.714286 // buy
								if( d > 63.7541 )
									ret := -0.269231
							if( mf > -0.18115 )
								if( d_k <= 13.8978 )
									ret := -0.401869
								if( d_k > 13.8978 )
									ret := 0.555556
						if( k > 73.0942 )
							if( smoothD_d <= 63.7346 )
								if( k <= 78.1099 )
									ret := 1.000000 // buy
								if( k > 78.1099 )
									ret := 0.875000 // buy
							if( smoothD_d > 63.7346 )
								if( d_k <= -17.9415 )
									ret := -0.666667
								if( d_k > -17.9415 )
									ret := 0.345070
				if( ad > -2.58913e+07 )
					if( smoothK_k <= 66.8661 )
						if( d <= 55.806 )
							if( d_k <= -7.01974 )
								if( mf <= -0.064343 )
									ret := 0.190024
								if( mf > -0.064343 )
									ret := -0.130548
							if( d_k > -7.01974 )
								if( ad <= -2.82599e+06 )
									ret := -0.222222
								if( ad > -2.82599e+06 )
									ret := -0.517986
						if( d > 55.806 )
							if( d_k <= -1.89559 )
								if( d <= 63.1449 )
									ret := -0.075758
								if( d > 63.1449 )
									ret := -0.655172
							if( d_k > -1.89559 )
								if( mf <= -0.090064 )
									ret := -0.404255
								if( mf > -0.090064 )
									ret := -0.690669
					if( smoothK_k > 66.8661 )
						if( d_k <= -1.91348 )
							if( smoothD_d <= 59.8287 )
								if( d <= 53.206 )
									ret := -0.075000
								if( d > 53.206 )
									ret := 0.365169
							if( smoothD_d > 59.8287 )
								if( ad_mf <= -855580 )
									ret := 0.284360
								if( ad_mf > -855580 )
									ret := -0.179412
						if( d_k > -1.91348 )
							if( k <= 84.9204 )
								if( d <= 87.3197 )
									ret := -0.362745
								if( d > 87.3197 )
									ret := -0.725000 // sell
							if( k > 84.9204 )
								if( ad_mf <= 1.17154e+08 )
									ret := -0.139241
								if( ad_mf > 1.17154e+08 )
									ret := 0.692308
			if( rsi1 > 40.7383 )
				if( smoothD_d <= 47.2035 )
					if( smoothD_d <= 40.5791 )
						if( d_k <= -27.4687 )
							if( smoothK_k <= 58.7547 )
								ret := -0.428571
							if( smoothK_k > 58.7547 )
								if( rsi1 <= 50.0105 )
									ret := 0.000000
								if( rsi1 > 50.0105 )
									ret := 0.434783
						if( d_k > -27.4687 )
							if( k <= 58.7255 )
								if( ad_mf <= -6.92866e+06 )
									ret := 0.572835
								if( ad_mf > -6.92866e+06 )
									ret := 0.355882
							if( k > 58.7255 )
								if( k <= 59.5071 )
									ret := 0.800000 // buy
								if( k > 59.5071 )
									ret := 0.497537
					if( smoothD_d > 40.5791 )
						if( k <= 49.6151 )
							if( ad_mf <= 1.06452e+07 )
								if( mf <= -0.112967 )
									ret := 0.869565 // buy
								if( mf > -0.112967 )
									ret := 0.216327
							if( ad_mf > 1.06452e+07 )
								if( mf <= 0.057817 )
									ret := -0.076923
								if( mf > 0.057817 )
									ret := -0.810811 // sell
						if( k > 49.6151 )
							if( ad_mf <= -4.04708e+06 )
								if( ad <= -8.95905e+07 )
									ret := 0.000000
								if( ad > -8.95905e+07 )
									ret := 0.670404
							if( ad_mf > -4.04708e+06 )
								if( d_k <= -3.61182 )
									ret := 0.267123
								if( d_k > -3.61182 )
									ret := -0.054054
				if( smoothD_d > 47.2035 )
					if( smoothK_k <= 61.0068 )
						if( ad <= 400690 )
							if( d <= 59.268 )
								if( rsi1 <= 48.8353 )
									ret := 0.005338
								if( rsi1 > 48.8353 )
									ret := 0.320786
							if( d > 59.268 )
								if( d_k <= 3.41513 )
									ret := 0.103286
								if( d_k > 3.41513 )
									ret := -0.260156
						if( ad > 400690 )
							if( smoothK_k <= 51.0389 )
								if( ad <= 2.19818e+07 )
									ret := -0.388693
								if( ad > 2.19818e+07 )
									ret := -0.692857
							if( smoothK_k > 51.0389 )
								if( d <= 57.8699 )
									ret := 0.074627
								if( d > 57.8699 )
									ret := -0.348416
					if( smoothK_k > 61.0068 )
						if( smoothD_d <= 64.0664 )
							if( ad <= -8.98939e+06 )
								if( mf <= 0.114246 )
									ret := 0.657534
								if( mf > 0.114246 )
									ret := -0.105263
							if( ad > -8.98939e+06 )
								if( rsi1 <= 47.5305 )
									ret := 0.118902
								if( rsi1 > 47.5305 )
									ret := 0.370995
						if( smoothD_d > 64.0664 )
							if( d_k <= -0.865436 )
								if( ad_mf <= -9.6556e+06 )
									ret := 0.553097
								if( ad_mf > -9.6556e+06 )
									ret := 0.188314
							if( d_k > -0.865436 )
								if( ad <= 1.13782e+07 )
									ret := -0.005464
								if( ad > 1.13782e+07 )
									ret := -0.283390
		if( rsi1 > 56.0322 )
			if( k <= 75.0379 )
				if( d <= 59.695 )
					if( d_k <= 0.242096 )
						if( mf <= 0.148087 )
							if( ad <= -9.97623e+06 )
								if( ad_mf <= -2.59589e+08 )
									ret := 0.416667
								if( ad_mf > -2.59589e+08 )
									ret := 0.813421 // buy
							if( ad > -9.97623e+06 )
								if( ad_mf <= 5.70221e+06 )
									ret := 0.510965
								if( ad_mf > 5.70221e+06 )
									ret := 0.671687
						if( mf > 0.148087 )
							if( d_k <= -9.66122 )
								if( mf <= 0.296773 )
									ret := 0.122807
								if( mf > 0.296773 )
									ret := -0.703704 // sell
							if( d_k > -9.66122 )
								if( rsi1 <= 59.5443 )
									ret := 0.000000
								if( rsi1 > 59.5443 )
									ret := 0.478599
					if( d_k > 0.242096 )
						if( d <= 56.0356 )
							if( smoothK_k <= 45.2374 )
								if( rsi1 <= 57.6601 )
									ret := -0.684211
								if( rsi1 > 57.6601 )
									ret := 0.215517
							if( smoothK_k > 45.2374 )
								if( d <= 55.6574 )
									ret := 0.366812
								if( d > 55.6574 )
									ret := 0.758621 // buy
						if( d > 56.0356 )
							if( ad <= 3.51234e+07 )
								if( ad_mf <= -4.72181e+07 )
									ret := -0.229167
								if( ad_mf > -4.72181e+07 )
									ret := 0.219124
							if( ad > 3.51234e+07 )
								if( d_k <= 9.16612 )
									ret := -0.066667
								if( d_k > 9.16612 )
									ret := -1.000000 // sell
				if( d > 59.695 )
					if( smoothK_k <= 62.3291 )
						if( rsi1 <= 63.903 )
							if( ad_mf <= 4.10886e+07 )
								if( mf <= 0.085597 )
									ret := 0.083650
								if( mf > 0.085597 )
									ret := -0.191806
							if( ad_mf > 4.10886e+07 )
								if( d <= 62.2061 )
									ret := 0.115385
								if( d > 62.2061 )
									ret := -0.631250
						if( rsi1 > 63.903 )
							if( ad <= 5.47695e+07 )
								if( ad_mf <= -1.98852e+07 )
									ret := 0.085714
								if( ad_mf > -1.98852e+07 )
									ret := 0.400568
							if( ad > 5.47695e+07 )
								if( ad <= 4.36368e+08 )
									ret := -0.287425
								if( ad > 4.36368e+08 )
									ret := 0.636364
					if( smoothK_k > 62.3291 )
						if( mf <= 0.071639 )
							if( smoothD_d <= 69.8306 )
								if( rsi1 <= 66.9857 )
									ret := 0.566796
								if( rsi1 > 66.9857 )
									ret := 0.779923 // buy
							if( smoothD_d > 69.8306 )
								if( k <= 68.2423 )
									ret := 0.469136
								if( k > 68.2423 )
									ret := 0.240232
						if( mf > 0.071639 )
							if( smoothD_d <= 71.9593 )
								if( rsi1 <= 70.8938 )
									ret := 0.257143
								if( rsi1 > 70.8938 )
									ret := 0.600000
							if( smoothD_d > 71.9593 )
								if( ad_mf <= 3.50276e+08 )
									ret := -0.086137
								if( ad_mf > 3.50276e+08 )
									ret := 1.000000 // buy
			if( k > 75.0379 )
				if( rsi1 <= 66.383 )
					if( d_k <= -0.75249 )
						if( ad <= -4.12598e+06 )
							if( mf <= 0.156108 )
								if( ad_mf <= -7.96162e+07 )
									ret := 0.395833
								if( ad_mf > -7.96162e+07 )
									ret := 0.674518
							if( mf > 0.156108 )
								if( k <= 83.5989 )
									ret := 0.589744
								if( k > 83.5989 )
									ret := 0.000000
						if( ad > -4.12598e+06 )
							if( smoothK_k <= 94.8855 )
								if( ad_mf <= 5.44505e+07 )
									ret := 0.503642
								if( ad_mf > 5.44505e+07 )
									ret := 0.178295
							if( smoothK_k > 94.8855 )
								if( smoothD_d <= 85.5585 )
									ret := 0.508333
								if( smoothD_d > 85.5585 )
									ret := 0.260997
					if( d_k > -0.75249 )
						if( ad_mf <= 8.5298e+07 )
							if( ad <= -5.78948e+06 )
								if( ad_mf <= -2.01121e+08 )
									ret := -0.476190
								if( ad_mf > -2.01121e+08 )
									ret := 0.449069
							if( ad > -5.78948e+06 )
								if( mf <= 0.090607 )
									ret := 0.320492
								if( mf > 0.090607 )
									ret := 0.066062
						if( ad_mf > 8.5298e+07 )
							if( ad <= 1.07745e+08 )
								if( k <= 82.6048 )
									ret := 0.625000
								if( k > 82.6048 )
									ret := -0.525000
							if( ad > 1.07745e+08 )
								if( smoothK_k <= 89.5354 )
									ret := -0.694444
								if( smoothK_k > 89.5354 )
									ret := 0.300000
				if( rsi1 > 66.383 )
					if( mf <= 0.125388 )
						if( d <= 92.0682 )
							if( rsi1 <= 79.1564 )
								if( ad <= -1.33016e+08 )
									ret := 0.131148
								if( ad > -1.33016e+08 )
									ret := 0.675436
							if( rsi1 > 79.1564 )
								if( smoothK_k <= 96.9899 )
									ret := 0.893939 // buy
								if( smoothK_k > 96.9899 )
									ret := 0.685714
						if( d > 92.0682 )
							if( ad <= -4.18677e+06 )
								if( d_k <= 3.58935 )
									ret := 0.708333 // buy
								if( d_k > 3.58935 )
									ret := 0.381443
							if( ad > -4.18677e+06 )
								if( rsi1 <= 70.2629 )
									ret := 0.399225
								if( rsi1 > 70.2629 )
									ret := 0.587828
					if( mf > 0.125388 )
						if( rsi1 <= 75.3676 )
							if( smoothK_k <= 73.2476 )
								if( ad_mf <= 3.78533e+07 )
									ret := 0.156863
								if( ad_mf > 3.78533e+07 )
									ret := -0.857143 // sell
							if( smoothK_k > 73.2476 )
								if( d_k <= -0.601367 )
									ret := 0.461438
								if( d_k > -0.601367 )
									ret := 0.277704
						if( rsi1 > 75.3676 )
							if( ad_mf <= 1.24022e+09 )
								if( d_k <= 7.18999 )
									ret := 0.599301
								if( d_k > 7.18999 )
									ret := -0.054054
							if( ad_mf > 1.24022e+09 )
								if( ad <= 1.35349e+09 )
									ret := -1.000000 // sell
								if( ad > 1.35349e+09 )
									ret := -0.111111
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

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
float op_operation = decision_tree_0_DOGEUSDT_30Min_22bc5ca9(mf, ad_mf, ad, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


