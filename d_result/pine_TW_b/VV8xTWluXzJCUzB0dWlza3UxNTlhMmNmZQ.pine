//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: U_1Min_2BS0_159a2cfe Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_U_1Min_2BS0_159a2cfe", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_U_1Min_159a2cfe(bbp, bullPower, BBPower_Color, bearPower, bbm, rsi1, d, k, smoothD_d, d_k, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( bbp <= 0.009324 )
		if( bbm <= 0.004834 )
			if( bbp <= -0.040098 )
				if( rsi1 <= 37.7591 )
					if( bullPower <= -0.034657 )
						if( d_k <= 3.18528 )
							if( d <= 1.39984 )
								if( d <= 0.636321 )
									ret := 0.400000
								if( d > 0.636321 )
									ret := -0.588235
							if( d > 1.39984 )
								if( bbm <= 0.000561 )
									ret := 0.346021
								if( bbm > 0.000561 )
									ret := 0.854167 // buy
						if( d_k > 3.18528 )
							if( bearPower <= -0.091083 )
								if( d_k <= 25.2517 )
									ret := -0.452055
								if( d_k > 25.2517 )
									ret := 0.666667
							if( bearPower > -0.091083 )
								if( smoothD_d <= 37.1933 )
									ret := 0.172619
								if( smoothD_d > 37.1933 )
									ret := 0.446809
					if( bullPower > -0.034657 )
						if( rsi1 <= 32.2479 )
							if( bbp <= -0.059671 )
								if( bearPower <= -0.03413 )
									ret := 0.272727
								if( bearPower > -0.03413 )
									ret := -0.298246
							if( bbp > -0.059671 )
								if( d_k <= 9.34984 )
									ret := 0.528926
								if( d_k > 9.34984 )
									ret := 0.086957
						if( rsi1 > 32.2479 )
							if( rsi1 <= 33.9581 )
								if( smoothD_d <= 11.9382 )
									ret := 0.230769
								if( smoothD_d > 11.9382 )
									ret := -0.568966
							if( rsi1 > 33.9581 )
								if( bbm <= 0.003032 )
									ret := -0.127660
								if( bbm > 0.003032 )
									ret := 0.666667
				if( rsi1 > 37.7591 )
					if( bearPower <= -0.034832 )
						if( bullPower <= -0.087718 )
							if( d_k <= 7.70883 )
								ret := -0.368421
							if( d_k > 7.70883 )
								ret := 0.222222
						if( bullPower > -0.087718 )
							if( smoothK_k <= -2.64744 )
								ret := -0.222222
							if( smoothK_k > -2.64744 )
								if( d_k <= 17.8335 )
									ret := 0.500000
								if( d_k > 17.8335 )
									ret := 0.759615 // buy
					if( bearPower > -0.034832 )
						if( k <= 69.1905 )
							if( d <= 5.31442 )
								if( d <= 4.49739 )
									ret := -0.285714
								if( d > 4.49739 )
									ret := -0.818182 // sell
							if( d > 5.31442 )
								if( d_k <= -7.49058 )
									ret := -0.085366
								if( d_k > -7.49058 )
									ret := 0.342556
						if( k > 69.1905 )
							if( bullPower <= -0.02692 )
								if( d_k <= -1.41476 )
									ret := 0.051282
								if( d_k > -1.41476 )
									ret := 0.812500 // buy
							if( bullPower > -0.02692 )
								if( rsi1 <= 43.5592 )
									ret := 0.961538 // buy
								if( rsi1 > 43.5592 )
									ret := 0.693548
			if( bbp > -0.040098 )
				if( bbp <= -0.007256 )
					if( smoothK_k <= 49.0503 )
						if( d <= 17.5952 )
							if( bbm <= 0.000901 )
								if( smoothK_k <= 14.5641 )
									ret := 0.100575
								if( smoothK_k > 14.5641 )
									ret := -0.102041
							if( bbm > 0.000901 )
								if( d <= 4.13057 )
									ret := 0.250000
								if( d > 4.13057 )
									ret := -0.425000
						if( d > 17.5952 )
							if( smoothK_k <= 36.9468 )
								if( k <= 10.3213 )
									ret := -0.084507
								if( k > 10.3213 )
									ret := 0.219512
							if( smoothK_k > 36.9468 )
								if( rsi1 <= 38.6345 )
									ret := -0.413793
								if( rsi1 > 38.6345 )
									ret := 0.086614
					if( smoothK_k > 49.0503 )
						if( smoothD_d <= 49.0782 )
							if( rsi1 <= 54.8756 )
								if( bbm <= 0.000106 )
									ret := 0.500000
								if( bbm > 0.000106 )
									ret := 0.950000 // buy
							if( rsi1 > 54.8756 )
								ret := -0.181818
						if( smoothD_d > 49.0782 )
							if( smoothD_d <= 50.3348 )
								ret := -0.333333
							if( smoothD_d > 50.3348 )
								if( bbp <= -0.01757 )
									ret := 0.240223
								if( bbp > -0.01757 )
									ret := 0.098160
				if( bbp > -0.007256 )
					if( bearPower <= -0.004358 )
						if( bearPower <= -0.005148 )
							ret := -0.818182 // sell
						if( bearPower > -0.005148 )
							ret := -0.388889
					if( bearPower > -0.004358 )
						if( smoothK_k <= 84.8093 )
							if( smoothD_d <= 81.2454 )
								if( k <= 66.2661 )
									ret := -0.042396
								if( k > 66.2661 )
									ret := 0.190476
							if( smoothD_d > 81.2454 )
								if( rsi1 <= 48.2479 )
									ret := 0.173913
								if( rsi1 > 48.2479 )
									ret := -0.442857
						if( smoothK_k > 84.8093 )
							if( smoothD_d <= 84.583 )
								if( smoothK_k <= 92.3191 )
									ret := 0.636364
								if( smoothK_k > 92.3191 )
									ret := 0.000000
							if( smoothD_d > 84.583 )
								if( bbm <= 0.00097 )
									ret := 0.074468
								if( bbm > 0.00097 )
									ret := 1.000000 // buy
		if( bbm > 0.004834 )
			if( bbp <= -0.135747 )
				if( rsi1 <= 8.90655 )
					if( bullPower <= -0.115604 )
						if( bbm <= 0.086888 )
							if( smoothK_k <= 1.22217 )
								ret := 1.000000 // buy
							if( smoothK_k > 1.22217 )
								ret := 0.600000
						if( bbm > 0.086888 )
							if( bbm <= 0.11316 )
								ret := -0.090909
							if( bbm > 0.11316 )
								if( k <= 0.00185 )
									ret := 0.416667
								if( k > 0.00185 )
									ret := 1.000000 // buy
					if( bullPower > -0.115604 )
						if( smoothK_k <= -2.91747 )
							if( d <= 0.076076 )
								if( bearPower <= -0.110288 )
									ret := 0.076923
								if( bearPower > -0.110288 )
									ret := 0.857143 // buy
							if( d > 0.076076 )
								if( d_k <= 0.76516 )
									ret := -0.764706 // sell
								if( d_k > 0.76516 )
									ret := 0.416667
						if( smoothK_k > -2.91747 )
							if( bullPower <= -0.061601 )
								if( bbp <= -0.213619 )
									ret := 0.909091 // buy
								if( bbp > -0.213619 )
									ret := 0.513514
							if( bullPower > -0.061601 )
								ret := 0.058824
				if( rsi1 > 8.90655 )
					if( d_k <= 19.5851 )
						if( d <= 25.4722 )
							if( bbm <= 0.029624 )
								if( k <= 0.116967 )
									ret := 0.039370
								if( k > 0.116967 )
									ret := 0.480874
							if( bbm > 0.029624 )
								if( rsi1 <= 14.1461 )
									ret := -0.190476
								if( rsi1 > 14.1461 )
									ret := 0.134638
						if( d > 25.4722 )
							if( k <= 17.0375 )
								if( k <= 15.0237 )
									ret := -0.566667
								if( k > 15.0237 )
									ret := -1.000000 // sell
							if( k > 17.0375 )
								if( smoothD_d <= 34.6252 )
									ret := -0.147870
								if( smoothD_d > 34.6252 )
									ret := 0.098865
					if( d_k > 19.5851 )
						if( k <= 21.463 )
							if( smoothD_d <= 41.4967 )
								if( smoothK_k <= 4.15365 )
									ret := -0.247312
								if( smoothK_k > 4.15365 )
									ret := 0.520833
							if( smoothD_d > 41.4967 )
								if( d_k <= 28.656 )
									ret := -1.000000 // sell
								if( d_k > 28.656 )
									ret := -0.272727
						if( k > 21.463 )
							if( smoothK_k <= 33.114 )
								if( smoothK_k <= 25.7843 )
									ret := 0.478261
								if( smoothK_k > 25.7843 )
									ret := 0.914634 // buy
							if( smoothK_k > 33.114 )
								if( smoothD_d <= 62.6839 )
									ret := -0.450000
								if( smoothD_d > 62.6839 )
									ret := 0.652778
			if( bbp > -0.135747 )
				if( d <= 54.9454 )
					if( d_k <= 12.9166 )
						if( k <= 3.23198 )
							if( d <= 5.92547 )
								if( smoothD_d <= 0.916943 )
									ret := 0.022946
								if( smoothD_d > 0.916943 )
									ret := 0.350993
							if( d > 5.92547 )
								if( smoothK_k <= -1.59709 )
									ret := -0.036190
								if( smoothK_k > -1.59709 )
									ret := -0.284211
						if( k > 3.23198 )
							if( smoothD_d <= 3.77392 )
								if( smoothD_d <= 0.711064 )
									ret := -0.008197
								if( smoothD_d > 0.711064 )
									ret := -0.193126
							if( smoothD_d > 3.77392 )
								if( smoothK_k <= 61.0604 )
									ret := -0.024179
								if( smoothK_k > 61.0604 )
									ret := 0.139303
					if( d_k > 12.9166 )
						if( smoothD_d <= 18.3017 )
							if( d_k <= 15.6943 )
								if( smoothD_d <= 11.1255 )
									ret := 0.692308
								if( smoothD_d > 11.1255 )
									ret := -0.038251
							if( d_k > 15.6943 )
								if( bbm <= 0.040102 )
									ret := 0.365672
								if( bbm > 0.040102 )
									ret := 0.925926 // buy
						if( smoothD_d > 18.3017 )
							if( bullPower <= -0.025471 )
								if( bbm <= 0.016799 )
									ret := 0.503067
								if( bbm > 0.016799 )
									ret := 0.088435
							if( bullPower > -0.025471 )
								if( rsi1 <= 56.4304 )
									ret := 0.030754
								if( rsi1 > 56.4304 )
									ret := -0.333333
				if( d > 54.9454 )
					if( bearPower <= -0.069388 )
						if( bearPower <= -0.130549 )
							if( bbm <= 0.220306 )
								if( k <= 53.1522 )
									ret := -0.333333
								if( k > 53.1522 )
									ret := -0.750000 // sell
							if( bbm > 0.220306 )
								if( bearPower <= -0.174766 )
									ret := -1.000000 // sell
								if( bearPower > -0.174766 )
									ret := -0.800000 // sell
						if( bearPower > -0.130549 )
							if( d_k <= -5.22707 )
								if( smoothK_k <= 73.4457 )
									ret := -0.134615
								if( smoothK_k > 73.4457 )
									ret := 0.387755
							if( d_k > -5.22707 )
								if( smoothK_k <= 84.8311 )
									ret := -0.116373
								if( smoothK_k > 84.8311 )
									ret := -0.529412
					if( bearPower > -0.069388 )
						if( smoothK_k <= 39.5427 )
							if( bbm <= 0.040567 )
								if( smoothK_k <= 30.2909 )
									ret := -0.079365
								if( smoothK_k > 30.2909 )
									ret := 0.284264
							if( bbm > 0.040567 )
								if( smoothK_k <= 30.0123 )
									ret := 0.296296
								if( smoothK_k > 30.0123 )
									ret := 0.715596 // buy
						if( smoothK_k > 39.5427 )
							if( k <= 84.4694 )
								if( smoothK_k <= 60.9632 )
									ret := -0.020528
								if( smoothK_k > 60.9632 )
									ret := 0.060652
							if( k > 84.4694 )
								if( d <= 78.7294 )
									ret := 0.325862
								if( d > 78.7294 )
									ret := 0.110033
	if( bbp > 0.009324 )
		if( bbm <= 0.009778 )
			if( bbp <= 0.071613 )
				if( bearPower <= 0.010171 )
					if( bearPower <= 0.009862 )
						if( smoothK_k <= 45.2051 )
							if( k <= 45.7989 )
								if( bbp <= 0.012744 )
									ret := -0.377660
								if( bbp > 0.012744 )
									ret := -0.107930
							if( k > 45.7989 )
								if( smoothD_d <= 47.6572 )
									ret := -0.210526
								if( smoothD_d > 47.6572 )
									ret := -0.695652
						if( smoothK_k > 45.2051 )
							if( d <= 75.6323 )
								if( smoothK_k <= 64.3047 )
									ret := -0.002849
								if( smoothK_k > 64.3047 )
									ret := 0.226244
							if( d > 75.6323 )
								if( smoothD_d <= 85.906 )
									ret := -0.207237
								if( smoothD_d > 85.906 )
									ret := 0.069767
					if( bearPower > 0.009862 )
						if( bbm <= 0.000138 )
							if( smoothD_d <= 42.4014 )
								ret := -0.400000
							if( smoothD_d > 42.4014 )
								if( d <= 61.7898 )
									ret := 0.000000
								if( d > 61.7898 )
									ret := 0.150000
						if( bbm > 0.000138 )
							if( d_k <= -3.9885 )
								ret := 0.250000
							if( d_k > -3.9885 )
								if( bullPower <= 0.013427 )
									ret := 0.500000
								if( bullPower > 0.013427 )
									ret := 0.888889 // buy
				if( bearPower > 0.010171 )
					if( d_k <= -27.9733 )
						if( d <= 51.1191 )
							if( smoothD_d <= 32.5006 )
								ret := 0.700000 // buy
							if( smoothD_d > 32.5006 )
								ret := -0.076923
						if( d > 51.1191 )
							ret := 0.785714 // buy
					if( d_k > -27.9733 )
						if( bbm <= 4.6e-05 )
							if( k <= 41.5564 )
								if( d_k <= -1.19072 )
									ret := -0.401813
								if( d_k > -1.19072 )
									ret := -0.129683
							if( k > 41.5564 )
								if( d <= 42.9353 )
									ret := 0.077670
								if( d > 42.9353 )
									ret := -0.130462
						if( bbm > 4.6e-05 )
							if( rsi1 <= 48.091 )
								if( bullPower <= 0.01686 )
									ret := -0.465116
								if( bullPower > 0.01686 )
									ret := -0.797980 // sell
							if( rsi1 > 48.091 )
								if( smoothK_k <= 30.0958 )
									ret := -0.063107
								if( smoothK_k > 30.0958 )
									ret := -0.325561
			if( bbp > 0.071613 )
				if( bbm <= 5.8e-05 )
					if( smoothD_d <= 91.5813 )
						if( d_k <= 21.1334 )
							if( k <= 12.873 )
								if( bearPower <= 0.046965 )
									ret := 0.055556
								if( bearPower > 0.046965 )
									ret := 0.333333
							if( k > 12.873 )
								if( smoothK_k <= 13.4785 )
									ret := -0.923077 // sell
								if( smoothK_k > 13.4785 )
									ret := -0.355397
						if( d_k > 21.1334 )
							ret := 0.846154 // buy
					if( smoothD_d > 91.5813 )
						if( rsi1 <= 86.9779 )
							if( d_k <= -3.32854 )
								ret := 0.454545
							if( d_k > -3.32854 )
								if( d <= 96.4428 )
									ret := 0.107143
								if( d > 96.4428 )
									ret := -0.281250
						if( rsi1 > 86.9779 )
							ret := 0.600000
				if( bbm > 5.8e-05 )
					if( d_k <= 14.2512 )
						if( k <= 96.2408 )
							if( smoothK_k <= 51.5037 )
								if( bearPower <= 0.035578 )
									ret := -1.000000 // sell
								if( bearPower > 0.035578 )
									ret := -0.383838
							if( smoothK_k > 51.5037 )
								if( d <= 53.2595 )
									ret := -0.952381 // sell
								if( d > 53.2595 )
									ret := -0.629977
						if( k > 96.2408 )
							if( rsi1 <= 61.9138 )
								if( smoothK_k <= 96.8257 )
									ret := -0.777778 // sell
								if( smoothK_k > 96.8257 )
									ret := -1.000000 // sell
							if( rsi1 > 61.9138 )
								if( d <= 90.8845 )
									ret := 0.448276
								if( d > 90.8845 )
									ret := -0.233333
					if( d_k > 14.2512 )
						if( bbp <= 0.11171 )
							ret := 0.400000
						if( bbp > 0.11171 )
							ret := -0.375000
		if( bbm > 0.009778 )
			if( rsi1 <= 68.3739 )
				if( smoothK_k <= 90.5587 )
					if( bbp <= 0.198264 )
						if( k <= 76.6669 )
							if( smoothK_k <= 72.6731 )
								if( d <= 63.3747 )
									ret := -0.063931
								if( d > 63.3747 )
									ret := 0.034470
							if( smoothK_k > 72.6731 )
								if( bbp <= 0.157902 )
									ret := -0.334630
								if( bbp > 0.157902 )
									ret := -1.000000 // sell
						if( k > 76.6669 )
							if( rsi1 <= 66.2042 )
								if( d_k <= -7.62144 )
									ret := -0.036742
								if( d_k > -7.62144 )
									ret := 0.097258
							if( rsi1 > 66.2042 )
								if( bbp <= 0.143315 )
									ret := -0.203833
								if( bbp > 0.143315 )
									ret := 0.224719
					if( bbp > 0.198264 )
						if( rsi1 <= 67.204 )
							if( bbp <= 0.245728 )
								if( smoothD_d <= 45.5189 )
									ret := -0.659091
								if( smoothD_d > 45.5189 )
									ret := -0.169643
							if( bbp > 0.245728 )
								if( bullPower <= 0.240888 )
									ret := 0.051852
								if( bullPower > 0.240888 )
									ret := -0.432432
						if( rsi1 > 67.204 )
							if( d <= 65.0437 )
								if( bullPower <= 0.17459 )
									ret := -0.555556
								if( bullPower > 0.17459 )
									ret := -0.942857 // sell
							if( d > 65.0437 )
								ret := -0.529412
				if( smoothK_k > 90.5587 )
					if( rsi1 <= 45.9115 )
						if( bearPower <= -0.006372 )
							if( bearPower <= -0.012256 )
								ret := -1.000000 // sell
							if( bearPower > -0.012256 )
								ret := -0.700000 // sell
						if( bearPower > -0.006372 )
							if( d_k <= 1.07855 )
								if( k <= 94.2606 )
									ret := -1.000000 // sell
								if( k > 94.2606 )
									ret := -0.434783
							if( d_k > 1.07855 )
								ret := 0.428571
					if( rsi1 > 45.9115 )
						if( d_k <= -19.7311 )
							if( k <= 96.3997 )
								if( rsi1 <= 60.1246 )
									ret := 0.052632
								if( rsi1 > 60.1246 )
									ret := -0.545455
							if( k > 96.3997 )
								if( bbp <= 0.08184 )
									ret := 0.644068
								if( bbp > 0.08184 )
									ret := -0.235294
						if( d_k > -19.7311 )
							if( d <= 99.1153 )
								if( d_k <= -7.97105 )
									ret := -0.069199
								if( d_k > -7.97105 )
									ret := -0.234267
							if( d > 99.1153 )
								if( bearPower <= 0.048565 )
									ret := 0.035608
								if( bearPower > 0.048565 )
									ret := 0.824324 // buy
			if( rsi1 > 68.3739 )
				if( rsi1 <= 91.5721 )
					if( k <= 12.7513 )
						if( d <= 6.90899 )
							if( smoothK_k <= 4.1075 )
								if( bbp <= 0.045221 )
									ret := -0.866667 // sell
								if( bbp > 0.045221 )
									ret := -0.227273
							if( smoothK_k > 4.1075 )
								if( smoothD_d <= 2.02576 )
									ret := -1.000000 // sell
								if( smoothD_d > 2.02576 )
									ret := -0.888889 // sell
						if( d > 6.90899 )
							if( rsi1 <= 70.3931 )
								if( smoothK_k <= 4.24997 )
									ret := -0.125000
								if( smoothK_k > 4.24997 )
									ret := 0.357143
							if( rsi1 > 70.3931 )
								if( bearPower <= 0.047087 )
									ret := -0.556962
								if( bearPower > 0.047087 )
									ret := 0.230769
					if( k > 12.7513 )
						if( k <= 92.8178 )
							if( smoothK_k <= 88.539 )
								if( rsi1 <= 73.5017 )
									ret := 0.164112
								if( rsi1 > 73.5017 )
									ret := -0.011082
							if( smoothK_k > 88.539 )
								if( smoothK_k <= 89.0455 )
									ret := 0.591549
								if( smoothK_k > 89.0455 )
									ret := 0.171315
						if( k > 92.8178 )
							if( bullPower <= 0.08782 )
								if( bearPower <= 0.010072 )
									ret := 0.051887
								if( bearPower > 0.010072 )
									ret := -0.130270
							if( bullPower > 0.08782 )
								if( smoothD_d <= 67.802 )
									ret := 0.965517 // buy
								if( smoothD_d > 67.802 )
									ret := 0.108000
				if( rsi1 > 91.5721 )
					if( bullPower <= 0.139589 )
						if( bullPower <= 0.060683 )
							if( smoothK_k <= 94.0056 )
								ret := 0.208333
							if( smoothK_k > 94.0056 )
								if( smoothK_k <= 96.9054 )
									ret := 0.000000
								if( smoothK_k > 96.9054 )
									ret := -0.111111
						if( bullPower > 0.060683 )
							if( d_k <= -1.336 )
								if( smoothK_k <= 96.9993 )
									ret := 1.000000 // buy
								if( smoothK_k > 96.9993 )
									ret := 0.904762 // buy
							if( d_k > -1.336 )
								if( rsi1 <= 96.6438 )
									ret := 0.476190
								if( rsi1 > 96.6438 )
									ret := -0.277778
					if( bullPower > 0.139589 )
						if( d_k <= -0.014379 )
							if( bullPower <= 0.167052 )
								ret := 0.846154 // buy
							if( bullPower > 0.167052 )
								ret := 0.312500
						if( d_k > -0.014379 )
							if( rsi1 <= 94.8587 )
								if( bearPower <= 0.105788 )
									ret := 0.750000 // buy
								if( bearPower > 0.105788 )
									ret := 0.307692
							if( rsi1 > 94.8587 )
								if( rsi1 <= 97.0312 )
									ret := -1.000000 // sell
								if( rsi1 > 97.0312 )
									ret := -0.611111
	
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
float op_operation = decision_tree_0_U_1Min_159a2cfe(bbp, bullPower, BBPower_Color, bearPower, bbm, rsi1, d, k, smoothD_d, d_k, smoothK_k)

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


