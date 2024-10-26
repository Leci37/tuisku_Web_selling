//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: MSFT_30Min_2SV0_0d0b58b2 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_30Min_2SV0_0d0b58b2", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_30Min_0d0b58b2(d, d_k, smoothK_k, k, rsi1, smoothD_d, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( VIP <= 1.21609 )
		if( rsi1 <= 26.71 )
			if( d <= 15.0425 )
				if( VIM <= 1.25004 )
					if( VIP <= 0.624597 )
						ret := 0.782609 // buy
					if( VIP > 0.624597 )
						if( smoothD_d <= 0.739666 )
							if( VIP_VIM <= -0.372003 )
								if( rsi1 <= 21.9018 )
									ret := 0.009390
								if( rsi1 > 21.9018 )
									ret := -0.408497
							if( VIP_VIM > -0.372003 )
								if( VIM <= 1.0596 )
									ret := -1.000000 // sell
								if( VIM > 1.0596 )
									ret := 0.059406
						if( smoothD_d > 0.739666 )
							if( VIP_VIM <= -0.503872 )
								if( VIP_VIM <= -0.56187 )
									ret := -1.000000 // sell
								if( VIP_VIM > -0.56187 )
									ret := -0.238095
							if( VIP_VIM > -0.503872 )
								if( VIP <= 0.733539 )
									ret := 0.485437
								if( VIP > 0.733539 )
									ret := 0.039816
				if( VIM > 1.25004 )
					if( smoothD_d <= -2.65249 )
						if( VIM <= 1.30503 )
							if( k <= 0.234415 )
								if( rsi1 <= 20.8499 )
									ret := -0.380282
								if( rsi1 > 20.8499 )
									ret := 0.218750
							if( k > 0.234415 )
								if( d_k <= -0.131381 )
									ret := 0.208333
								if( d_k > -0.131381 )
									ret := 1.000000 // buy
						if( VIM > 1.30503 )
							if( VIP <= 0.742042 )
								if( d <= 0.00165 )
									ret := 0.345588
								if( d > 0.00165 )
									ret := 0.765432 // buy
							if( VIP > 0.742042 )
								if( d_k <= -0.011156 )
									ret := 0.153846
								if( d_k > -0.011156 )
									ret := -0.242424
					if( smoothD_d > -2.65249 )
						if( rsi1 <= 14.5041 )
							if( VIP <= 0.692935 )
								if( d_k <= 7.37908 )
									ret := -0.355865
								if( d_k > 7.37908 )
									ret := 0.578947
							if( VIP > 0.692935 )
								if( k <= 7.9102 )
									ret := 0.576687
								if( k > 7.9102 )
									ret := -0.412500
						if( rsi1 > 14.5041 )
							if( d_k <= 7.12369 )
								if( smoothK_k <= -2.01007 )
									ret := 0.280742
								if( smoothK_k > -2.01007 )
									ret := 0.106526
							if( d_k > 7.12369 )
								if( d <= 11.4811 )
									ret := -0.500000
								if( d > 11.4811 )
									ret := 0.056180
			if( d > 15.0425 )
				if( k <= 38.8231 )
					if( k <= 33.8379 )
						if( smoothD_d <= 33.3033 )
							if( smoothK_k <= 29.0909 )
								if( d <= 32.5567 )
									ret := 0.241812
								if( d > 32.5567 )
									ret := -0.265625
							if( smoothK_k > 29.0909 )
								if( d <= 27.5009 )
									ret := -0.250000
								if( d > 27.5009 )
									ret := -0.909091 // sell
						if( smoothD_d > 33.3033 )
							if( d <= 43.0581 )
								if( smoothK_k <= 12.0289 )
									ret := 0.444444
								if( smoothK_k > 12.0289 )
									ret := 0.875000 // buy
							if( d > 43.0581 )
								if( d_k <= 25.8768 )
									ret := -0.195122
								if( d_k > 25.8768 )
									ret := 0.633333
					if( k > 33.8379 )
						if( rsi1 <= 18.2096 )
							ret := 0.050000
						if( rsi1 > 18.2096 )
							if( rsi1 <= 25.8424 )
								if( VIP_VIM <= -0.48904 )
									ret := 0.660377
								if( VIP_VIM > -0.48904 )
									ret := 0.876712 // buy
							if( rsi1 > 25.8424 )
								ret := 0.000000
				if( k > 38.8231 )
					if( k <= 44.2447 )
						if( VIM <= 1.33862 )
							if( k <= 42.5907 )
								if( d_k <= 3.48593 )
									ret := -0.653061
								if( d_k > 3.48593 )
									ret := 0.156250
							if( k > 42.5907 )
								if( d_k <= 17.0587 )
									ret := -0.714286 // sell
								if( d_k > 17.0587 )
									ret := -1.000000 // sell
						if( VIM > 1.33862 )
							if( d <= 35.2261 )
								ret := -0.176471
							if( d > 35.2261 )
								ret := 0.692308
					if( k > 44.2447 )
						if( smoothK_k <= 44.7469 )
							if( k <= 46.7009 )
								if( smoothD_d <= 24.6095 )
									ret := 1.000000 // buy
								if( smoothD_d > 24.6095 )
									ret := 0.275862
							if( k > 46.7009 )
								ret := 0.933333 // buy
						if( smoothK_k > 44.7469 )
							if( rsi1 <= 23.1626 )
								if( VIP_VIM <= -0.315217 )
									ret := 0.167513
								if( VIP_VIM > -0.315217 )
									ret := 0.863636 // buy
							if( rsi1 > 23.1626 )
								if( VIP_VIM <= -0.328204 )
									ret := -0.149635
								if( VIP_VIM > -0.328204 )
									ret := 0.500000
		if( rsi1 > 26.71 )
			if( d_k <= -7.6223 )
				if( VIP_VIM <= -0.137455 )
					if( VIP_VIM <= -0.288297 )
						if( VIM <= 1.31376 )
							if( VIP <= 0.872734 )
								if( d_k <= -7.8917 )
									ret := -0.202403
								if( d_k > -7.8917 )
									ret := 0.591837
							if( VIP > 0.872734 )
								if( VIM <= 1.30448 )
									ret := 0.107317
								if( VIM > 1.30448 )
									ret := -0.521739
						if( VIM > 1.31376 )
							if( VIP <= 1.02789 )
								if( smoothD_d <= 77.8596 )
									ret := 0.318519
								if( smoothD_d > 77.8596 )
									ret := -0.272727
							if( VIP > 1.02789 )
								if( rsi1 <= 48.0391 )
									ret := 0.417910
								if( rsi1 > 48.0391 )
									ret := -0.407895
					if( VIP_VIM > -0.288297 )
						if( rsi1 <= 38.4464 )
							if( smoothK_k <= 60.6815 )
								if( d <= 48.048 )
									ret := 0.382937
								if( d > 48.048 )
									ret := -0.545455
							if( smoothK_k > 60.6815 )
								if( k <= 64.5344 )
									ret := -0.846154 // sell
								if( k > 64.5344 )
									ret := 0.072519
						if( rsi1 > 38.4464 )
							if( rsi1 <= 38.8258 )
								if( d_k <= -12.1233 )
									ret := -0.189189
								if( d_k > -12.1233 )
									ret := -0.622222
							if( rsi1 > 38.8258 )
								if( d <= 31.6229 )
									ret := -0.085915
								if( d > 31.6229 )
									ret := 0.092576
				if( VIP_VIM > -0.137455 )
					if( d_k <= -10.1341 )
						if( smoothD_d <= 51.8889 )
							if( VIM <= 0.83993 )
								if( d <= 37.4041 )
									ret := 0.068063
								if( d > 37.4041 )
									ret := 0.392523
							if( VIM > 0.83993 )
								if( smoothK_k <= 67.2792 )
									ret := -0.051434
								if( smoothK_k > 67.2792 )
									ret := 0.169713
						if( smoothD_d > 51.8889 )
							if( d <= 65.7233 )
								if( d <= 61.4602 )
									ret := -0.108197
								if( d > 61.4602 )
									ret := -0.363171
							if( d > 65.7233 )
								if( d <= 72.6385 )
									ret := 0.110439
								if( d > 72.6385 )
									ret := -0.107345
					if( d_k > -10.1341 )
						if( rsi1 <= 46.2601 )
							if( VIP <= 0.984287 )
								if( rsi1 <= 38.6586 )
									ret := -0.222222
								if( rsi1 > 38.6586 )
									ret := -0.671875
							if( VIP > 0.984287 )
								if( VIM <= 1.22093 )
									ret := -0.254438
								if( VIM > 1.22093 )
									ret := 0.833333 // buy
						if( rsi1 > 46.2601 )
							if( k <= 40.277 )
								if( k <= 38.6506 )
									ret := -0.042105
								if( k > 38.6506 )
									ret := 0.622222
							if( k > 40.277 )
								if( smoothK_k <= 53.4424 )
									ret := -0.419929
								if( smoothK_k > 53.4424 )
									ret := -0.108342
			if( d_k > -7.6223 )
				if( VIP <= 0.789659 )
					if( d <= 61.8576 )
						if( d <= 38.6389 )
							if( d <= 20.3899 )
								if( k <= 0.555066 )
									ret := -0.463415
								if( k > 0.555066 )
									ret := -0.140318
							if( d > 20.3899 )
								if( d <= 20.8206 )
									ret := 0.777778 // buy
								if( d > 20.8206 )
									ret := 0.072993
						if( d > 38.6389 )
							if( k <= 60.1077 )
								if( d <= 42.965 )
									ret := -0.753846 // sell
								if( d > 42.965 )
									ret := -0.246269
							if( k > 60.1077 )
								ret := -1.000000 // sell
					if( d > 61.8576 )
						if( rsi1 <= 28.5422 )
							if( k <= 76.3766 )
								ret := 0.727273 // buy
							if( k > 76.3766 )
								if( smoothD_d <= 87.1199 )
									ret := 1.000000 // buy
								if( smoothD_d > 87.1199 )
									ret := 0.818182 // buy
						if( rsi1 > 28.5422 )
							if( d_k <= 10.6169 )
								if( k <= 87.2545 )
									ret := -0.586207
								if( k > 87.2545 )
									ret := 0.833333 // buy
							if( d_k > 10.6169 )
								if( rsi1 <= 31.3298 )
									ret := -0.260870
								if( rsi1 > 31.3298 )
									ret := 1.000000 // buy
				if( VIP > 0.789659 )
					if( VIP <= 0.910497 )
						if( d <= 73.1058 )
							if( smoothD_d <= -0.952049 )
								if( d <= 0.588617 )
									ret := -0.013699
								if( d > 0.588617 )
									ret := -0.282222
							if( smoothD_d > -0.952049 )
								if( k <= 5.63098 )
									ret := 0.177115
								if( k > 5.63098 )
									ret := 0.023181
						if( d > 73.1058 )
							if( rsi1 <= 47.6338 )
								if( smoothK_k <= 96.836 )
									ret := 0.353617
								if( smoothK_k > 96.836 )
									ret := -0.541667
							if( rsi1 > 47.6338 )
								if( k <= 78.2671 )
									ret := -0.629630
								if( k > 78.2671 )
									ret := 0.207547
					if( VIP > 0.910497 )
						if( smoothK_k <= 52.0036 )
							if( k <= 53.167 )
								if( VIM <= 0.852742 )
									ret := 0.123842
								if( VIM > 0.852742 )
									ret := -0.017360
							if( k > 53.167 )
								if( smoothD_d <= 47.0386 )
									ret := 0.444444
								if( smoothD_d > 47.0386 )
									ret := -0.277344
						if( smoothK_k > 52.0036 )
							if( d <= 66.2103 )
								if( smoothK_k <= 58.7236 )
									ret := 0.115955
								if( smoothK_k > 58.7236 )
									ret := 0.298077
							if( d > 66.2103 )
								if( smoothK_k <= 96.9997 )
									ret := 0.039261
								if( smoothK_k > 96.9997 )
									ret := -0.172823
	if( VIP > 1.21609 )
		if( VIM <= 0.909409 )
			if( smoothK_k <= 70.5824 )
				if( smoothD_d <= 81.0869 )
					if( VIP_VIM <= 0.339689 )
						if( d_k <= 15.0825 )
							if( d <= 36.3142 )
								if( VIP_VIM <= 0.329833 )
									ret := -0.071429
								if( VIP_VIM > 0.329833 )
									ret := 0.600000
							if( d > 36.3142 )
								if( rsi1 <= 74.1775 )
									ret := -0.765957 // sell
								if( rsi1 > 74.1775 )
									ret := -0.272727
						if( d_k > 15.0825 )
							ret := 0.266667
					if( VIP_VIM > 0.339689 )
						if( VIP <= 1.30836 )
							if( smoothK_k <= 5.59978 )
								if( smoothK_k <= 4.72825 )
									ret := 0.260417
								if( smoothK_k > 4.72825 )
									ret := 0.937500 // buy
							if( smoothK_k > 5.59978 )
								if( VIM <= 0.690043 )
									ret := -0.418605
								if( VIM > 0.690043 )
									ret := 0.043505
						if( VIP > 1.30836 )
							if( VIM <= 0.809315 )
								if( rsi1 <= 81.3636 )
									ret := 0.283237
								if( rsi1 > 81.3636 )
									ret := -0.008065
							if( VIM > 0.809315 )
								if( d <= 56.3803 )
									ret := -0.079646
								if( d > 56.3803 )
									ret := 0.254902
				if( smoothD_d > 81.0869 )
					if( k <= 73.1865 )
						if( VIP <= 1.26361 )
							ret := 0.928571 // buy
						if( VIP > 1.26361 )
							if( rsi1 <= 70.3668 )
								ret := -0.083333
							if( rsi1 > 70.3668 )
								if( rsi1 <= 79.2171 )
									ret := 0.909091 // buy
								if( rsi1 > 79.2171 )
									ret := 0.250000
					if( k > 73.1865 )
						ret := 0.250000
			if( smoothK_k > 70.5824 )
				if( smoothK_k <= 73.1409 )
					if( rsi1 <= 66.3497 )
						ret := 0.222222
					if( rsi1 > 66.3497 )
						if( d_k <= -22.4856 )
							if( smoothD_d <= 44.9005 )
								ret := -0.153846
							if( smoothD_d > 44.9005 )
								ret := 0.750000 // buy
						if( d_k > -22.4856 )
							if( rsi1 <= 70.5813 )
								if( k <= 74.7967 )
									ret := -0.466667
								if( k > 74.7967 )
									ret := -0.892857 // sell
							if( rsi1 > 70.5813 )
								if( VIP_VIM <= 0.650557 )
									ret := -0.271429
								if( VIP_VIM > 0.650557 )
									ret := -0.605263
				if( smoothK_k > 73.1409 )
					if( d_k <= -6.41787 )
						if( rsi1 <= 77.4887 )
							if( smoothD_d <= 69.8464 )
								if( d_k <= -10.1761 )
									ret := 0.023585
								if( d_k > -10.1761 )
									ret := -0.666667
							if( smoothD_d > 69.8464 )
								if( d_k <= -17.861 )
									ret := 0.634921
								if( d_k > -17.861 )
									ret := 0.339056
						if( rsi1 > 77.4887 )
							if( VIP <= 1.24717 )
								if( k <= 93.535 )
									ret := 0.843750 // buy
								if( k > 93.535 )
									ret := 0.071429
							if( VIP > 1.24717 )
								if( smoothD_d <= 56.6953 )
									ret := -0.769231 // sell
								if( smoothD_d > 56.6953 )
									ret := -0.083929
					if( d_k > -6.41787 )
						if( VIP <= 1.333 )
							if( VIM <= 0.803769 )
								if( d_k <= -2.38987 )
									ret := -0.156028
								if( d_k > -2.38987 )
									ret := 0.108316
							if( VIM > 0.803769 )
								if( VIP_VIM <= 0.329749 )
									ret := -0.600000
								if( VIP_VIM > 0.329749 )
									ret := -0.056987
						if( VIP > 1.333 )
							if( VIM <= 0.718473 )
								if( VIM <= 0.574956 )
									ret := -0.224771
								if( VIM > 0.574956 )
									ret := -0.022342
							if( VIM > 0.718473 )
								if( smoothD_d <= 93.2873 )
									ret := -0.285550
								if( smoothD_d > 93.2873 )
									ret := 0.003945
		if( VIM > 0.909409 )
			if( rsi1 <= 60.3563 )
				if( d <= 55.342 )
					if( rsi1 <= 35.1572 )
						if( smoothD_d <= 6.29254 )
							if( d_k <= 2.01269 )
								if( VIP <= 1.51063 )
									ret := -0.382114
								if( VIP > 1.51063 )
									ret := 0.250000
							if( d_k > 2.01269 )
								if( VIP <= 1.47426 )
									ret := 0.068966
								if( VIP > 1.47426 )
									ret := 0.933333 // buy
						if( smoothD_d > 6.29254 )
							if( d_k <= 8.31658 )
								if( d_k <= -8.12547 )
									ret := -0.098361
								if( d_k > -8.12547 )
									ret := 0.464646
							if( d_k > 8.31658 )
								if( k <= 3.04581 )
									ret := -0.545455
								if( k > 3.04581 )
									ret := 0.017241
					if( rsi1 > 35.1572 )
						if( VIM <= 1.85482 )
							if( d <= 12.305 )
								if( k <= 7.32386 )
									ret := -0.208791
								if( k > 7.32386 )
									ret := 0.277457
							if( d > 12.305 )
								if( smoothK_k <= 26.9958 )
									ret := -0.269970
								if( smoothK_k > 26.9958 )
									ret := -0.098105
						if( VIM > 1.85482 )
							if( d <= 26.4167 )
								ret := -0.066667
							if( d > 26.4167 )
								if( smoothD_d <= 27.5602 )
									ret := 0.950000 // buy
								if( smoothD_d > 27.5602 )
									ret := 0.291667
				if( d > 55.342 )
					if( smoothD_d <= 56.9224 )
						if( rsi1 <= 54.3572 )
							if( VIP_VIM <= 0.086052 )
								if( VIP <= 1.23095 )
									ret := 0.272727
								if( VIP > 1.23095 )
									ret := 0.818182 // buy
							if( VIP_VIM > 0.086052 )
								if( VIP <= 1.63866 )
									ret := 0.067568
								if( VIP > 1.63866 )
									ret := 0.823529 // buy
						if( rsi1 > 54.3572 )
							if( k <= 63.5803 )
								if( smoothK_k <= 33.6692 )
									ret := 0.454545
								if( smoothK_k > 33.6692 )
									ret := -0.333333
							if( k > 63.5803 )
								ret := 0.714286 // buy
					if( smoothD_d > 56.9224 )
						if( smoothK_k <= 72.0093 )
							if( d_k <= 3.3721 )
								if( smoothD_d <= 64.4328 )
									ret := -0.673077
								if( smoothD_d > 64.4328 )
									ret := 0.050847
							if( d_k > 3.3721 )
								if( k <= 72.9652 )
									ret := -0.015924
								if( k > 72.9652 )
									ret := -0.638298
						if( smoothK_k > 72.0093 )
							if( d <= 85.4154 )
								if( k <= 76.9871 )
									ret := 0.580247
								if( k > 76.9871 )
									ret := 0.139276
							if( d > 85.4154 )
								if( smoothD_d <= 85.2403 )
									ret := -0.432692
								if( smoothD_d > 85.2403 )
									ret := 0.088312
			if( rsi1 > 60.3563 )
				if( smoothD_d <= 42.2782 )
					if( d <= 6.806 )
						if( k <= 1.0668 )
							ret := 0.785714 // buy
						if( k > 1.0668 )
							ret := 0.166667
					if( d > 6.806 )
						if( smoothD_d <= 29.5744 )
							if( d_k <= 6.95964 )
								if( k <= 36.4153 )
									ret := -0.343434
								if( k > 36.4153 )
									ret := -0.666667
							if( d_k > 6.95964 )
								if( d_k <= 14.8135 )
									ret := -0.898305 // sell
								if( d_k > 14.8135 )
									ret := -0.636364
						if( smoothD_d > 29.5744 )
							if( d <= 39.7316 )
								if( rsi1 <= 62.8631 )
									ret := 0.272727
								if( rsi1 > 62.8631 )
									ret := -0.214953
							if( d > 39.7316 )
								if( VIM <= 1.11346 )
									ret := -0.192771
								if( VIM > 1.11346 )
									ret := -0.656566
				if( smoothD_d > 42.2782 )
					if( d_k <= 14.2909 )
						if( smoothK_k <= 74.9233 )
							if( smoothD_d <= 43.2843 )
								if( k <= 45.9591 )
									ret := 0.952381 // buy
								if( k > 45.9591 )
									ret := 0.450000
							if( smoothD_d > 43.2843 )
								if( VIP_VIM <= -0.123252 )
									ret := -0.595238
								if( VIP_VIM > -0.123252 )
									ret := -0.019560
						if( smoothK_k > 74.9233 )
							if( smoothK_k <= 78.6715 )
								if( d <= 74.5292 )
									ret := 0.034483
								if( d > 74.5292 )
									ret := -0.634615
							if( smoothK_k > 78.6715 )
								if( d <= 80.306 )
									ret := -0.333333
								if( d > 80.306 )
									ret := -0.105832
					if( d_k > 14.2909 )
						if( VIM <= 0.974928 )
							if( VIP_VIM <= 0.338875 )
								if( rsi1 <= 68.6013 )
									ret := 0.000000
								if( rsi1 > 68.6013 )
									ret := -0.900000 // sell
							if( VIP_VIM > 0.338875 )
								if( d_k <= 20.1968 )
									ret := 0.346154
								if( d_k > 20.1968 )
									ret := -0.272727
						if( VIM > 0.974928 )
							if( rsi1 <= 63.8789 )
								if( smoothK_k <= 46.4323 )
									ret := -0.718750 // sell
								if( smoothK_k > 46.4323 )
									ret := -0.928571 // sell
							if( rsi1 > 63.8789 )
								if( d <= 53.8696 )
									ret := 0.222222
								if( d > 53.8696 )
									ret := -0.609756
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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

//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
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
float op_operation = decision_tree_0_MSFT_30Min_0d0b58b2(d, d_k, smoothK_k, k, rsi1, smoothD_d, VIP, VIP_VIM, VIM)

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


