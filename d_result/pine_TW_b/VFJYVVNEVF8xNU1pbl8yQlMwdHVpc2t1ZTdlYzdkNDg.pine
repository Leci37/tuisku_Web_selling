//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: TRXUSDT_15Min_2BS0_e7ec7d48 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_15Min_2BS0_e7ec7d48", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_15Min_e7ec7d48(bbm, bearPower, bbp, bullPower, BBPower_Color, d_k, d, rsi1, k, smoothD_d, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( smoothK_k <= 34.0495 )
		if( smoothD_d <= 5.44503 )
			if( d <= 2.14535 )
				if( bbm <= 0.00013 )
					if( bbp <= -0.000289 )
						if( bullPower <= -0.000125 )
							if( rsi1 <= 17.2826 )
								if( d_k <= -1.1595 )
									ret := 0.000000
								if( d_k > -1.1595 )
									ret := -0.553571
							if( rsi1 > 17.2826 )
								if( smoothD_d <= -2.46552 )
									ret := 0.351351
								if( smoothD_d > -2.46552 )
									ret := 0.035088
						if( bullPower > -0.000125 )
							if( rsi1 <= 25.7649 )
								if( bbm <= 0.00013 )
									ret := -0.363636
								if( bbm > 0.00013 )
									ret := 0.500000
							if( rsi1 > 25.7649 )
								if( bbm <= 0.000128 )
									ret := 0.720000 // buy
								if( bbm > 0.000128 )
									ret := -0.800000 // sell
					if( bbp > -0.000289 )
						if( rsi1 <= 30.807 )
							if( bbp <= -0.000147 )
								if( rsi1 <= 20.2753 )
									ret := -0.722222 // sell
								if( rsi1 > 20.2753 )
									ret := -0.400000
							if( bbp > -0.000147 )
								if( bbm <= 8.1e-05 )
									ret := -0.492063
								if( bbm > 8.1e-05 )
									ret := -0.840708 // sell
						if( rsi1 > 30.807 )
							if( bullPower <= 0.000177 )
								if( rsi1 <= 42.9339 )
									ret := -0.186441
								if( rsi1 > 42.9339 )
									ret := 0.071429
							if( bullPower > 0.000177 )
								if( bbp <= 0.000264 )
									ret := -0.900000 // sell
								if( bbp > 0.000264 )
									ret := -0.358491
				if( bbm > 0.00013 )
					if( rsi1 <= 19.3554 )
						if( bullPower <= -0.000253 )
							if( k <= 4.54288 )
								if( rsi1 <= 17.0898 )
									ret := -0.535904
								if( rsi1 > 17.0898 )
									ret := 0.049383
							if( k > 4.54288 )
								if( k <= 5.48538 )
									ret := 0.777778 // buy
								if( k > 5.48538 )
									ret := -0.500000
						if( bullPower > -0.000253 )
							if( bullPower <= -4.1e-05 )
								if( rsi1 <= 13.2161 )
									ret := -0.888889 // sell
								if( rsi1 > 13.2161 )
									ret := -0.716157 // sell
							if( bullPower > -4.1e-05 )
								if( bbp <= -0.000707 )
									ret := -0.666667
								if( bbp > -0.000707 )
									ret := -0.956731 // sell
					if( rsi1 > 19.3554 )
						if( bullPower <= -7.2e-05 )
							if( d_k <= 1.10239 )
								if( rsi1 <= 29.2662 )
									ret := -0.317623
								if( rsi1 > 29.2662 )
									ret := 0.105263
							if( d_k > 1.10239 )
								if( rsi1 <= 21.0774 )
									ret := 0.656250
								if( rsi1 > 21.0774 )
									ret := -0.026316
						if( bullPower > -7.2e-05 )
							if( rsi1 <= 38.0626 )
								if( bullPower <= 0.000154 )
									ret := -0.602649
								if( bullPower > 0.000154 )
									ret := -0.815603 // sell
							if( rsi1 > 38.0626 )
								if( bullPower <= 0.000264 )
									ret := -0.175115
								if( bullPower > 0.000264 )
									ret := -0.592593
			if( d > 2.14535 )
				if( bbp <= -0.000154 )
					if( rsi1 <= 23.13 )
						if( bullPower <= -0.00017 )
							if( k <= 1.96248 )
								if( k <= 0.002098 )
									ret := -0.285714
								if( k > 0.002098 )
									ret := 0.393064
							if( k > 1.96248 )
								if( smoothK_k <= 3.84256 )
									ret := -0.284264
								if( smoothK_k > 3.84256 )
									ret := -0.538860
						if( bullPower > -0.00017 )
							if( bbp <= -0.000682 )
								if( d_k <= 4.39714 )
									ret := -0.892308 // sell
								if( d_k > 4.39714 )
									ret := -0.363636
							if( bbp > -0.000682 )
								if( bullPower <= -6.7e-05 )
									ret := -0.453216
								if( bullPower > -6.7e-05 )
									ret := -0.640625
					if( rsi1 > 23.13 )
						if( k <= 5.37782 )
							if( bullPower <= -0.000232 )
								if( bearPower <= -0.001135 )
									ret := -0.042857
								if( bearPower > -0.001135 )
									ret := 0.433566
							if( bullPower > -0.000232 )
								if( bbp <= -0.000807 )
									ret := 0.318681
								if( bbp > -0.000807 )
									ret := -0.013029
						if( k > 5.37782 )
							if( rsi1 <= 29.5208 )
								if( bbp <= -0.000564 )
									ret := -0.092000
								if( bbp > -0.000564 )
									ret := -0.509868
							if( rsi1 > 29.5208 )
								if( bbp <= -0.000467 )
									ret := 0.044803
								if( bbp > -0.000467 )
									ret := -0.160234
				if( bbp > -0.000154 )
					if( rsi1 <= 46.4769 )
						if( bullPower <= 7.5e-05 )
							if( bbm <= 0.000113 )
								if( rsi1 <= 32.1984 )
									ret := -0.457447
								if( rsi1 > 32.1984 )
									ret := -0.055556
							if( bbm > 0.000113 )
								if( rsi1 <= 34.6058 )
									ret := -0.658635
								if( rsi1 > 34.6058 )
									ret := -0.215753
						if( bullPower > 7.5e-05 )
							if( bbm <= 0.00181 )
								if( bbp <= 0.000187 )
									ret := -0.564125
								if( bbp > 0.000187 )
									ret := -0.757812 // sell
							if( bbm > 0.00181 )
								ret := 1.000000 // buy
					if( rsi1 > 46.4769 )
						if( bearPower <= 0.000194 )
							if( bullPower <= 0.000196 )
								if( d_k <= -5.61355 )
									ret := -0.148571
								if( d_k > -5.61355 )
									ret := 0.099270
							if( bullPower > 0.000196 )
								if( bbm <= 0.0008 )
									ret := -0.193878
								if( bbm > 0.0008 )
									ret := 0.515152
						if( bearPower > 0.000194 )
							if( rsi1 <= 65.0803 )
								if( d_k <= -4.50758 )
									ret := -0.176471
								if( d_k > -4.50758 )
									ret := -0.720000 // sell
							if( rsi1 > 65.0803 )
								if( smoothK_k <= 1.81669 )
									ret := -0.447368
								if( smoothK_k > 1.81669 )
									ret := 0.352941
		if( smoothD_d > 5.44503 )
			if( rsi1 <= 45.8962 )
				if( bullPower <= 4.2e-05 )
					if( rsi1 <= 24.2723 )
						if( rsi1 <= 13.3073 )
							if( bearPower <= -0.002875 )
								if( bullPower <= -0.001902 )
									ret := -0.250000
								if( bullPower > -0.001902 )
									ret := 1.000000 // buy
							if( bearPower > -0.002875 )
								if( bbm <= 0.000105 )
									ret := -0.235294
								if( bbm > 0.000105 )
									ret := -0.695279
						if( rsi1 > 13.3073 )
							if( bullPower <= -0.000177 )
								if( bbp <= -0.002653 )
									ret := 0.534483
								if( bbp > -0.002653 )
									ret := -0.084650
							if( bullPower > -0.000177 )
								if( smoothD_d <= 23.3912 )
									ret := -0.405082
								if( smoothD_d > 23.3912 )
									ret := -0.596154
					if( rsi1 > 24.2723 )
						if( bullPower <= -8.7e-05 )
							if( d_k <= -13.2177 )
								if( d <= 18.3194 )
									ret := -0.447917
								if( d > 18.3194 )
									ret := 0.217391
							if( d_k > -13.2177 )
								if( bearPower <= -0.000277 )
									ret := 0.210817
								if( bearPower > -0.000277 )
									ret := 0.036278
						if( bullPower > -8.7e-05 )
							if( d <= 59.5154 )
								if( smoothD_d <= 53.7537 )
									ret := -0.029222
								if( smoothD_d > 53.7537 )
									ret := -0.611111
							if( d > 59.5154 )
								if( rsi1 <= 29.9914 )
									ret := -0.400000
								if( rsi1 > 29.9914 )
									ret := 0.724138 // buy
				if( bullPower > 4.2e-05 )
					if( bearPower <= -0.000111 )
						if( bbp <= -0.000157 )
							if( smoothK_k <= -0.674565 )
								if( bearPower <= -0.000314 )
									ret := -0.903226 // sell
								if( bearPower > -0.000314 )
									ret := -0.166667
							if( smoothK_k > -0.674565 )
								if( d_k <= -8.73572 )
									ret := -0.421687
								if( d_k > -8.73572 )
									ret := -0.039514
						if( bbp > -0.000157 )
							if( d_k <= 5.57782 )
								if( rsi1 <= 34.6487 )
									ret := -0.544444
								if( rsi1 > 34.6487 )
									ret := -0.225714
							if( d_k > 5.57782 )
								if( rsi1 <= 40.5894 )
									ret := -0.577181
								if( rsi1 > 40.5894 )
									ret := -0.134328
					if( bearPower > -0.000111 )
						if( bullPower <= 0.000168 )
							if( BBPower_Color <= 0.5 )
								if( bbp <= 1e-06 )
									ret := -0.384810
								if( bbp > 1e-06 )
									ret := -0.819936 // sell
							if( BBPower_Color > 0.5 )
								if( bullPower <= 8.8e-05 )
									ret := -0.200000
								if( bullPower > 8.8e-05 )
									ret := -0.411902
						if( bullPower > 0.000168 )
							if( k <= 15.1432 )
								if( rsi1 <= 38.099 )
									ret := -0.872263 // sell
								if( rsi1 > 38.099 )
									ret := -0.667494
							if( k > 15.1432 )
								if( bbp <= 0.000329 )
									ret := -0.468571
								if( bbp > 0.000329 )
									ret := -0.726115 // sell
			if( rsi1 > 45.8962 )
				if( bbp <= 0.000172 )
					if( BBPower_Color <= 0.5 )
						if( rsi1 <= 53.3515 )
							if( bbp <= -0.000161 )
								if( smoothD_d <= 30.0806 )
									ret := 0.415236
								if( smoothD_d > 30.0806 )
									ret := 0.070513
							if( bbp > -0.000161 )
								if( bbp <= 9.3e-05 )
									ret := 0.100195
								if( bbp > 9.3e-05 )
									ret := -0.346535
						if( rsi1 > 53.3515 )
							if( bbm <= 0.001025 )
								if( smoothD_d <= 37.706 )
									ret := 0.443238
								if( smoothD_d > 37.706 )
									ret := 0.090361
							if( bbm > 0.001025 )
								if( k <= 29.6352 )
									ret := -1.000000 // sell
								if( k > 29.6352 )
									ret := -0.600000
					if( BBPower_Color > 0.5 )
						if( d_k <= -7.30634 )
							if( rsi1 <= 50.4073 )
								if( smoothD_d <= 8.4243 )
									ret := -0.514286
								if( smoothD_d > 8.4243 )
									ret := -0.188235
							if( rsi1 > 50.4073 )
								if( rsi1 <= 58.9607 )
									ret := -0.092896
								if( rsi1 > 58.9607 )
									ret := 0.100000
						if( d_k > -7.30634 )
							if( bullPower <= 0.000174 )
								if( rsi1 <= 52.0691 )
									ret := -0.037889
								if( rsi1 > 52.0691 )
									ret := 0.111524
							if( bullPower > 0.000174 )
								if( smoothK_k <= 11.0056 )
									ret := 0.018692
								if( smoothK_k > 11.0056 )
									ret := 0.329577
				if( bbp > 0.000172 )
					if( rsi1 <= 58.2404 )
						if( bearPower <= 0.000135 )
							if( rsi1 <= 49.0647 )
								if( k <= 2.88693 )
									ret := 0.200000
								if( k > 2.88693 )
									ret := -0.506787
							if( rsi1 > 49.0647 )
								if( d_k <= 23.2515 )
									ret := -0.250668
								if( d_k > 23.2515 )
									ret := 0.153061
						if( bearPower > 0.000135 )
							if( d_k <= -12.727 )
								if( smoothK_k <= 22.7115 )
									ret := 0.750000 // buy
								if( smoothK_k > 22.7115 )
									ret := 0.200000
							if( d_k > -12.727 )
								if( bearPower <= 0.000317 )
									ret := -0.516779
								if( bearPower > 0.000317 )
									ret := -0.854545 // sell
					if( rsi1 > 58.2404 )
						if( bbm <= 0.000609 )
							if( bbp <= 0.000703 )
								if( rsi1 <= 63.7868 )
									ret := 0.014349
								if( rsi1 > 63.7868 )
									ret := 0.233122
							if( bbp > 0.000703 )
								if( k <= 13.3159 )
									ret := -0.420732
								if( k > 13.3159 )
									ret := -0.078086
						if( bbm > 0.000609 )
							if( smoothK_k <= 3.91782 )
								if( k <= 5.09082 )
									ret := -0.388889
								if( k > 5.09082 )
									ret := 0.900000 // buy
							if( smoothK_k > 3.91782 )
								if( bullPower <= 0.001641 )
									ret := -0.409836
								if( bullPower > 0.001641 )
									ret := -0.796296 // sell
	if( smoothK_k > 34.0495 )
		if( rsi1 <= 70.1439 )
			if( BBPower_Color <= 0.5 )
				if( rsi1 <= 51.6426 )
					if( rsi1 <= 33.5927 )
						if( bbp <= -0.001539 )
							if( rsi1 <= 25.6041 )
								if( smoothD_d <= 29.1985 )
									ret := -0.529412
								if( smoothD_d > 29.1985 )
									ret := 0.208092
							if( rsi1 > 25.6041 )
								if( d_k <= 17.4751 )
									ret := 0.562814
								if( d_k > 17.4751 )
									ret := -0.909091 // sell
						if( bbp > -0.001539 )
							if( d <= 70.4452 )
								if( rsi1 <= 26.1403 )
									ret := -0.419087
								if( rsi1 > 26.1403 )
									ret := -0.094783
							if( d > 70.4452 )
								if( k <= 85.7056 )
									ret := -0.475177
								if( k > 85.7056 )
									ret := -0.155738
					if( rsi1 > 33.5927 )
						if( bullPower <= -0.000104 )
							if( rsi1 <= 43.3511 )
								if( bullPower <= -0.000181 )
									ret := 0.451052
								if( bullPower > -0.000181 )
									ret := 0.158263
							if( rsi1 > 43.3511 )
								if( smoothK_k <= 55.7321 )
									ret := 0.282051
								if( smoothK_k > 55.7321 )
									ret := 0.630601
						if( bullPower > -0.000104 )
							if( rsi1 <= 45.1433 )
								if( bbp <= -0.000113 )
									ret := 0.039558
								if( bbp > -0.000113 )
									ret := -0.134454
							if( rsi1 > 45.1433 )
								if( bbp <= -0.000186 )
									ret := 0.309666
								if( bbp > -0.000186 )
									ret := 0.071888
				if( rsi1 > 51.6426 )
					if( bbp <= -0.000189 )
						if( d_k <= 16.3715 )
							if( k <= 97.1747 )
								if( bbm <= 0.000884 )
									ret := 0.590208
								if( bbm > 0.000884 )
									ret := 0.206349
							if( k > 97.1747 )
								if( bbp <= -0.000279 )
									ret := 0.789588 // buy
								if( bbp > -0.000279 )
									ret := 0.639594
						if( d_k > 16.3715 )
							if( bbm <= 0.000277 )
								if( smoothK_k <= 43.0071 )
									ret := -0.250000
								if( smoothK_k > 43.0071 )
									ret := 0.692308
							if( bbm > 0.000277 )
								if( bullPower <= 0.0003 )
									ret := -0.814815 // sell
								if( bullPower > 0.0003 )
									ret := 1.000000 // buy
					if( bbp > -0.000189 )
						if( bbp <= 3e-06 )
							if( rsi1 <= 61.8728 )
								if( bearPower <= -0.000115 )
									ret := 0.350732
								if( bearPower > -0.000115 )
									ret := 0.183020
							if( rsi1 > 61.8728 )
								if( k <= 87.6156 )
									ret := 0.421603
								if( k > 87.6156 )
									ret := 0.606023
						if( bbp > 3e-06 )
							if( smoothK_k <= 52.6359 )
								if( rsi1 <= 59.8843 )
									ret := 0.090909
								if( rsi1 > 59.8843 )
									ret := 0.513889
							if( smoothK_k > 52.6359 )
								if( rsi1 <= 62.5352 )
									ret := 0.453069
								if( rsi1 > 62.5352 )
									ret := 0.812808 // buy
			if( BBPower_Color > 0.5 )
				if( bbp <= 0.00065 )
					if( smoothD_d <= 72.4571 )
						if( bbp <= 0.000194 )
							if( bbm <= 0.000272 )
								if( rsi1 <= 59.5595 )
									ret := -0.061416
								if( rsi1 > 59.5595 )
									ret := 0.124822
							if( bbm > 0.000272 )
								if( bbm <= 0.001162 )
									ret := 0.157616
								if( bbm > 0.001162 )
									ret := -0.562500
						if( bbp > 0.000194 )
							if( k <= 38.0153 )
								if( d <= 43.1648 )
									ret := 0.442857
								if( d > 43.1648 )
									ret := -0.060000
							if( k > 38.0153 )
								if( k <= 52.6764 )
									ret := -0.175513
								if( k > 52.6764 )
									ret := -0.052850
					if( smoothD_d > 72.4571 )
						if( rsi1 <= 55.729 )
							if( bearPower <= -2.5e-05 )
								if( d_k <= 15.7685 )
									ret := 0.008584
								if( d_k > 15.7685 )
									ret := 0.380952
							if( bearPower > -2.5e-05 )
								if( bbm <= 0.000131 )
									ret := -0.066667
								if( bbm > 0.000131 )
									ret := -0.231173
						if( rsi1 > 55.729 )
							if( smoothK_k <= 66.2643 )
								if( smoothD_d <= 84.4463 )
									ret := 0.316901
								if( smoothD_d > 84.4463 )
									ret := -1.000000 // sell
							if( smoothK_k > 66.2643 )
								if( bearPower <= 1e-06 )
									ret := 0.194586
								if( bearPower > 1e-06 )
									ret := 0.047631
				if( bbp > 0.00065 )
					if( d <= 84.0275 )
						if( d <= 79.1455 )
							if( d <= 24.1614 )
								if( rsi1 <= 65.2152 )
									ret := 0.928571 // buy
								if( rsi1 > 65.2152 )
									ret := 0.250000
							if( d > 24.1614 )
								if( smoothK_k <= 55.9955 )
									ret := -0.332174
								if( smoothK_k > 55.9955 )
									ret := -0.119205
						if( d > 79.1455 )
							if( d_k <= 13.957 )
								if( d_k <= -12.1401 )
									ret := 0.166667
								if( d_k > -12.1401 )
									ret := -0.673913
							if( d_k > 13.957 )
								if( bearPower <= 0.000285 )
									ret := 0.538462
								if( bearPower > 0.000285 )
									ret := -0.166667
					if( d > 84.0275 )
						if( k <= 86.9412 )
							if( bearPower <= -7.6e-05 )
								if( bbp <= 0.000989 )
									ret := -0.888889 // sell
								if( bbp > 0.000989 )
									ret := 0.500000
							if( bearPower > -7.6e-05 )
								if( d <= 84.5345 )
									ret := -0.333333
								if( d > 84.5345 )
									ret := 0.469697
						if( k > 86.9412 )
							if( smoothD_d <= 92.4901 )
								if( smoothD_d <= 91.4113 )
									ret := -0.235669
								if( smoothD_d > 91.4113 )
									ret := -0.754717 // sell
							if( smoothD_d > 92.4901 )
								if( d_k <= 1.63335 )
									ret := -0.162562
								if( d_k > 1.63335 )
									ret := 0.425287
		if( rsi1 > 70.1439 )
			if( BBPower_Color <= 0.5 )
				if( bbp <= 1e-06 )
					if( smoothK_k <= 94.8057 )
						if( bullPower <= 0.000239 )
							if( smoothD_d <= 92.8884 )
								if( d_k <= -12.1631 )
									ret := 0.826446 // buy
								if( d_k > -12.1631 )
									ret := 0.555556
							if( smoothD_d > 92.8884 )
								if( k <= 97.158 )
									ret := 0.935484 // buy
								if( k > 97.158 )
									ret := 0.500000
						if( bullPower > 0.000239 )
							ret := 0.000000
					if( smoothK_k > 94.8057 )
						if( bearPower <= -7.3e-05 )
							if( bbm <= 0.000201 )
								if( bbp <= -0.000345 )
									ret := 0.400000
								if( bbp > -0.000345 )
									ret := 0.839080 // buy
							if( bbm > 0.000201 )
								if( bullPower <= 3.8e-05 )
									ret := 1.000000 // buy
								if( bullPower > 3.8e-05 )
									ret := 0.925532 // buy
						if( bearPower > -7.3e-05 )
							if( bearPower <= -6e-05 )
								if( rsi1 <= 74.7735 )
									ret := 0.111111
								if( rsi1 > 74.7735 )
									ret := 0.666667
							if( bearPower > -6e-05 )
								if( rsi1 <= 74.2083 )
									ret := 0.333333
								if( rsi1 > 74.2083 )
									ret := 1.000000 // buy
				if( bbp > 1e-06 )
					if( k <= 48.863 )
						ret := 0.000000
					if( k > 48.863 )
						if( bullPower <= 0.001437 )
							if( d_k <= -0.2901 )
								ret := 1.000000 // buy
							if( d_k > -0.2901 )
								if( bearPower <= -0.00015 )
									ret := 0.714286 // buy
								if( bearPower > -0.00015 )
									ret := 0.972222 // buy
						if( bullPower > 0.001437 )
							if( k <= 94.4367 )
								ret := 0.500000
							if( k > 94.4367 )
								ret := 1.000000 // buy
			if( BBPower_Color > 0.5 )
				if( rsi1 <= 81.3574 )
					if( bbp <= 0.0004 )
						if( bearPower <= 3.8e-05 )
							if( k <= 96.6041 )
								if( bearPower <= -2.3e-05 )
									ret := 0.528265
								if( bearPower > -2.3e-05 )
									ret := 0.374200
							if( k > 96.6041 )
								if( bbm <= 8e-05 )
									ret := 0.318182
								if( bbm > 8e-05 )
									ret := 0.622047
						if( bearPower > 3.8e-05 )
							if( bbm <= 0.0001 )
								if( smoothD_d <= 95.9327 )
									ret := 0.071151
								if( smoothD_d > 95.9327 )
									ret := 0.392157
							if( bbm > 0.0001 )
								if( rsi1 <= 70.4035 )
									ret := -0.206897
								if( rsi1 > 70.4035 )
									ret := 0.360427
					if( bbp > 0.0004 )
						if( d_k <= 9.76437 )
							if( d <= 91.9836 )
								if( smoothD_d <= 64.2743 )
									ret := 0.301834
								if( smoothD_d > 64.2743 )
									ret := 0.016931
							if( d > 91.9836 )
								if( d_k <= -0.859123 )
									ret := 0.429224
								if( d_k > -0.859123 )
									ret := 0.195300
						if( d_k > 9.76437 )
							if( bullPower <= 0.001105 )
								if( d <= 86.896 )
									ret := 0.250814
								if( d > 86.896 )
									ret := 0.580247
							if( bullPower > 0.001105 )
								if( rsi1 <= 72.2453 )
									ret := 0.076923
								if( rsi1 > 72.2453 )
									ret := 0.797619 // buy
				if( rsi1 > 81.3574 )
					if( bearPower <= 0.000652 )
						if( rsi1 <= 87.2946 )
							if( bbp <= 0.002557 )
								if( d_k <= -27.6248 )
									ret := -0.210526
								if( d_k > -27.6248 )
									ret := 0.520876
							if( bbp > 0.002557 )
								if( d <= 98.5849 )
									ret := -0.857143 // sell
								if( d > 98.5849 )
									ret := 1.000000 // buy
						if( rsi1 > 87.2946 )
							if( smoothK_k <= 96.893 )
								if( k <= 98.3749 )
									ret := 0.654412
								if( k > 98.3749 )
									ret := 0.436709
							if( smoothK_k > 96.893 )
								if( d_k <= -0.216252 )
									ret := 0.711538 // buy
								if( d_k > -0.216252 )
									ret := 0.878338 // buy
					if( bearPower > 0.000652 )
						if( smoothK_k <= 84.5241 )
							if( bbp <= 0.003574 )
								if( rsi1 <= 90.1005 )
									ret := 0.756098 // buy
								if( rsi1 > 90.1005 )
									ret := 0.000000
							if( bbp > 0.003574 )
								if( smoothD_d <= 44.3144 )
									ret := 0.750000 // buy
								if( smoothD_d > 44.3144 )
									ret := -0.476190
						if( smoothK_k > 84.5241 )
							if( d <= 89.0473 )
								if( bullPower <= 0.00126 )
									ret := -0.500000
								if( bullPower > 0.00126 )
									ret := -0.967742 // sell
							if( d > 89.0473 )
								if( bbm <= 0.00115 )
									ret := 0.026906
								if( bbm > 0.00115 )
									ret := 0.632353
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_TRXUSDT_15Min_e7ec7d48(bbm, bearPower, bbp, bullPower, BBPower_Color, d_k, d, rsi1, k, smoothD_d, smoothK_k)

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


