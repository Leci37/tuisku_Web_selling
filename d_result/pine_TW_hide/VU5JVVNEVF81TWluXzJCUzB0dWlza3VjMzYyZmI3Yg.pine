//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: UNIUSDT_5Min_2BS0_c362fb7b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UNIUSDT_5Min_2BS0_c362fb7b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UNIUSDT_5Min_c362fb7b(bbp, bullPower, BBPower_Color, bearPower, bbm, rsi1, d, k, smoothD_d, d_k, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( d_k <= 0.772528 )
		if( rsi1 <= 40.9095 )
			if( smoothK_k <= 7.2904 )
				if( rsi1 <= 24.4311 )
					if( bbm <= 0.012049 )
						if( bbm <= 0.007276 )
							if( d_k <= 0.344645 )
								if( smoothK_k <= -1.54413 )
									ret := -0.154762
								if( smoothK_k > -1.54413 )
									ret := -0.029412
							if( d_k > 0.344645 )
								if( bullPower <= -0.005336 )
									ret := -0.176471
								if( bullPower > -0.005336 )
									ret := -1.000000 // sell
						if( bbm > 0.007276 )
							if( k <= 2.31052 )
								if( k <= 1.52535 )
									ret := -0.308271
								if( k > 1.52535 )
									ret := -0.575758
							if( k > 2.31052 )
								if( bbm <= 0.01101 )
									ret := -0.126984
								if( bbm > 0.01101 )
									ret := -0.400000
					if( bbm > 0.012049 )
						if( smoothD_d <= -0.402773 )
							if( bbm <= 0.018048 )
								if( d_k <= 0.118127 )
									ret := -0.615917
								if( d_k > 0.118127 )
									ret := -0.279070
							if( bbm > 0.018048 )
								if( rsi1 <= 20.5023 )
									ret := -0.839450 // sell
								if( rsi1 > 20.5023 )
									ret := -0.606335
						if( smoothD_d > -0.402773 )
							if( bbm <= 0.030117 )
								if( smoothK_k <= 0.936375 )
									ret := -0.566038
								if( smoothK_k > 0.936375 )
									ret := -0.310458
							if( bbm > 0.030117 )
								if( bearPower <= -0.166427 )
									ret := -0.372093
								if( bearPower > -0.166427 )
									ret := -0.695980
				if( rsi1 > 24.4311 )
					if( bbp <= -0.083699 )
						if( bbm <= 0.123786 )
							if( rsi1 <= 38.5761 )
								if( d_k <= -0.452793 )
									ret := -0.035242
								if( d_k > -0.452793 )
									ret := -0.435185
							if( rsi1 > 38.5761 )
								if( d_k <= -2.958 )
									ret := -0.300000
								if( d_k > -2.958 )
									ret := 0.785714 // buy
						if( bbm > 0.123786 )
							if( d_k <= -2.99419 )
								if( bullPower <= -0.079064 )
									ret := 0.909091 // buy
								if( bullPower > -0.079064 )
									ret := -0.407407
							if( d_k > -2.99419 )
								if( bearPower <= -0.270899 )
									ret := 1.000000 // buy
								if( bearPower > -0.270899 )
									ret := 0.547170
					if( bbp > -0.083699 )
						if( bbm <= 0.013091 )
							if( bullPower <= -0.001965 )
								if( bbm <= 0.010025 )
									ret := -0.035061
								if( bbm > 0.010025 )
									ret := -0.174721
							if( bullPower > -0.001965 )
								if( bbp <= 0.012781 )
									ret := -0.252273
								if( bbp > 0.012781 )
									ret := -0.740741 // sell
						if( bbm > 0.013091 )
							if( bbp <= -0.028744 )
								if( smoothD_d <= -0.232019 )
									ret := -0.425382
								if( smoothD_d > -0.232019 )
									ret := -0.220464
							if( bbp > -0.028744 )
								if( smoothK_k <= 2.65629 )
									ret := -0.679027
								if( smoothK_k > 2.65629 )
									ret := -0.427374
			if( smoothK_k > 7.2904 )
				if( bbp <= -0.06359 )
					if( d_k <= -9.76899 )
						if( rsi1 <= 26.1918 )
							if( d <= 33.2957 )
								if( smoothD_d <= 11.0506 )
									ret := -0.444444
								if( smoothD_d > 11.0506 )
									ret := 0.547264
							if( d > 33.2957 )
								if( d_k <= -21.7336 )
									ret := 0.583333
								if( d_k > -21.7336 )
									ret := -0.342342
						if( rsi1 > 26.1918 )
							if( bbp <= -0.108016 )
								if( smoothK_k <= 25.6765 )
									ret := 0.419162
								if( smoothK_k > 25.6765 )
									ret := 0.804348 // buy
							if( bbp > -0.108016 )
								if( d_k <= -17.9385 )
									ret := 0.720721 // buy
								if( d_k > -17.9385 )
									ret := 0.426390
					if( d_k > -9.76899 )
						if( d_k <= -2.79275 )
							if( k <= 29.8316 )
								if( smoothK_k <= 18.577 )
									ret := 0.163894
								if( smoothK_k > 18.577 )
									ret := 0.496667
							if( k > 29.8316 )
								if( smoothK_k <= 94.6922 )
									ret := -0.011331
								if( smoothK_k > 94.6922 )
									ret := 0.859649 // buy
						if( d_k > -2.79275 )
							if( rsi1 <= 33.7409 )
								if( bbp <= -0.280174 )
									ret := 0.128205
								if( bbp > -0.280174 )
									ret := -0.478130
							if( rsi1 > 33.7409 )
								if( smoothK_k <= 15.1096 )
									ret := -0.204819
								if( smoothK_k > 15.1096 )
									ret := 0.338182
				if( bbp > -0.06359 )
					if( rsi1 <= 33.6392 )
						if( bbm <= 0.026037 )
							if( rsi1 <= 19.2868 )
								if( d_k <= -1.0244 )
									ret := -0.316327
								if( d_k > -1.0244 )
									ret := -0.800000 // sell
							if( rsi1 > 19.2868 )
								if( d_k <= -1.69432 )
									ret := -0.089089
								if( d_k > -1.69432 )
									ret := -0.319512
						if( bbm > 0.026037 )
							if( d_k <= -19.9854 )
								ret := 0.571429
							if( d_k > -19.9854 )
								if( smoothD_d <= 23.4643 )
									ret := -0.372611
								if( smoothD_d > 23.4643 )
									ret := -0.630094
					if( rsi1 > 33.6392 )
						if( bullPower <= -9.9e-05 )
							if( d_k <= -8.82055 )
								if( bbp <= -0.037435 )
									ret := 0.430809
								if( bbp > -0.037435 )
									ret := 0.065949
							if( d_k > -8.82055 )
								if( bullPower <= -0.006304 )
									ret := 0.089855
								if( bullPower > -0.006304 )
									ret := -0.051985
						if( bullPower > -9.9e-05 )
							if( bbm <= 0.015008 )
								if( k <= 11.7972 )
									ret := -0.387097
								if( k > 11.7972 )
									ret := -0.061069
							if( bbm > 0.015008 )
								if( bbp <= -0.009906 )
									ret := -0.295337
								if( bbp > -0.009906 )
									ret := -0.532000
		if( rsi1 > 40.9095 )
			if( bbm <= 0.013012 )
				if( rsi1 <= 55.2949 )
					if( bbp <= -0.011068 )
						if( d_k <= -8.79437 )
							if( bearPower <= -0.013869 )
								if( rsi1 <= 49.6169 )
									ret := 0.428016
								if( rsi1 > 49.6169 )
									ret := 0.729167 // buy
							if( bearPower > -0.013869 )
								if( rsi1 <= 50.0592 )
									ret := 0.162963
								if( rsi1 > 50.0592 )
									ret := 0.463768
						if( d_k > -8.79437 )
							if( rsi1 <= 45.896 )
								if( bbp <= -0.050001 )
									ret := 0.647059
								if( bbp > -0.050001 )
									ret := 0.018789
							if( rsi1 > 45.896 )
								if( bearPower <= -0.013513 )
									ret := 0.298701
								if( bearPower > -0.013513 )
									ret := 0.127660
					if( bbp > -0.011068 )
						if( bearPower <= -0.008475 )
							if( smoothK_k <= 93.7076 )
								if( k <= 0.562266 )
									ret := 0.714286 // buy
								if( k > 0.562266 )
									ret := 0.117225
							if( smoothK_k > 93.7076 )
								if( bbp <= -0.00995 )
									ret := 0.142857
								if( bbp > -0.00995 )
									ret := 0.700000 // buy
						if( bearPower > -0.008475 )
							if( bbp <= 0.012255 )
								if( rsi1 <= 45.296 )
									ret := -0.093645
								if( rsi1 > 45.296 )
									ret := 0.033545
							if( bbp > 0.012255 )
								if( rsi1 <= 48.9898 )
									ret := -0.206897
								if( rsi1 > 48.9898 )
									ret := -0.065440
				if( rsi1 > 55.2949 )
					if( bearPower <= -0.007126 )
						if( bearPower <= -0.01207 )
							if( d_k <= -12.0889 )
								if( bearPower <= -0.017075 )
									ret := 0.910891 // buy
								if( bearPower > -0.017075 )
									ret := 0.760870 // buy
							if( d_k > -12.0889 )
								if( k <= 13.6965 )
									ret := -0.250000
								if( k > 13.6965 )
									ret := 0.652941
						if( bearPower > -0.01207 )
							if( rsi1 <= 64.8974 )
								if( d_k <= -22.4688 )
									ret := 0.838235 // buy
								if( d_k > -22.4688 )
									ret := 0.405462
							if( rsi1 > 64.8974 )
								if( bullPower <= 0.004861 )
									ret := 0.802817 // buy
								if( bullPower > 0.004861 )
									ret := 0.230769
					if( bearPower > -0.007126 )
						if( BBPower_Color <= 0.5 )
							if( bbp <= 0.00021 )
								if( rsi1 <= 61.3654 )
									ret := 0.206799
								if( rsi1 > 61.3654 )
									ret := 0.481268
							if( bbp > 0.00021 )
								if( d <= 63.9355 )
									ret := 0.959459 // buy
								if( d > 63.9355 )
									ret := 0.717791 // buy
						if( BBPower_Color > 0.5 )
							if( rsi1 <= 69.4506 )
								if( bbm <= 0.008155 )
									ret := 0.058027
								if( bbm > 0.008155 )
									ret := 0.185203
							if( rsi1 > 69.4506 )
								if( smoothD_d <= 41.6157 )
									ret := 0.592105
								if( smoothD_d > 41.6157 )
									ret := 0.356184
			if( bbm > 0.013012 )
				if( rsi1 <= 54.8786 )
					if( bbp <= -0.01458 )
						if( bbp <= -0.039146 )
							if( d <= 8.05488 )
								if( smoothK_k <= 1.99104 )
									ret := 0.051471
								if( smoothK_k > 1.99104 )
									ret := 0.500000
							if( d > 8.05488 )
								if( rsi1 <= 44.6439 )
									ret := 0.665461
								if( rsi1 > 44.6439 )
									ret := 0.804646 // buy
						if( bbp > -0.039146 )
							if( rsi1 <= 48.2609 )
								if( d_k <= -9.70634 )
									ret := 0.481283
								if( d_k > -9.70634 )
									ret := 0.194559
							if( rsi1 > 48.2609 )
								if( d <= 6.43394 )
									ret := 0.326241
								if( d > 6.43394 )
									ret := 0.636758
					if( bbp > -0.01458 )
						if( rsi1 <= 49.4167 )
							if( bbp <= 0.00524 )
								if( rsi1 <= 44.8788 )
									ret := -0.188067
								if( rsi1 > 44.8788 )
									ret := 0.054444
							if( bbp > 0.00524 )
								if( smoothK_k <= 96.4321 )
									ret := -0.413170
								if( smoothK_k > 96.4321 )
									ret := 0.761905 // buy
						if( rsi1 > 49.4167 )
							if( bbp <= 0.004803 )
								if( BBPower_Color <= 0.5 )
									ret := 0.456522
								if( BBPower_Color > 0.5 )
									ret := 0.176471
							if( bbp > 0.004803 )
								if( BBPower_Color <= 0.5 )
									ret := 0.331633
								if( BBPower_Color > 0.5 )
									ret := -0.111913
				if( rsi1 > 54.8786 )
					if( BBPower_Color <= 0.5 )
						if( d_k <= -3.62657 )
							if( rsi1 <= 61.489 )
								if( bbp <= -0.024147 )
									ret := 0.883372 // buy
								if( bbp > -0.024147 )
									ret := 0.766282 // buy
							if( rsi1 > 61.489 )
								if( bbp <= -0.000326 )
									ret := 0.900612 // buy
								if( bbp > -0.000326 )
									ret := 0.973098 // buy
						if( d_k > -3.62657 )
							if( rsi1 <= 63.2862 )
								if( smoothD_d <= -1.79589 )
									ret := -0.350000
								if( smoothD_d > -1.79589 )
									ret := 0.604096
							if( rsi1 > 63.2862 )
								if( bbp <= -1.7e-05 )
									ret := 0.761194 // buy
								if( bbp > -1.7e-05 )
									ret := 0.969231 // buy
					if( BBPower_Color > 0.5 )
						if( rsi1 <= 64.303 )
							if( bearPower <= 0.005834 )
								if( rsi1 <= 61.4913 )
									ret := 0.320210
								if( rsi1 > 61.4913 )
									ret := 0.537897
							if( bearPower > 0.005834 )
								if( bbp <= 0.113915 )
									ret := 0.089286
								if( bbp > 0.113915 )
									ret := -0.349515
						if( rsi1 > 64.303 )
							if( k <= 97.9466 )
								if( d <= 84.7651 )
									ret := 0.691007
								if( d > 84.7651 )
									ret := 0.556124
							if( k > 97.9466 )
								if( rsi1 <= 73.1199 )
									ret := 0.612658
								if( rsi1 > 73.1199 )
									ret := 0.811648 // buy
	if( d_k > 0.772528 )
		if( rsi1 <= 57.3824 )
			if( bullPower <= 0.012358 )
				if( rsi1 <= 38.4607 )
					if( bbm <= 0.009003 )
						if( bullPower <= 0.001503 )
							if( rsi1 <= 28.834 )
								if( d_k <= 6.92602 )
									ret := -0.141129
								if( d_k > 6.92602 )
									ret := -0.398693
							if( rsi1 > 28.834 )
								if( bullPower <= -0.005293 )
									ret := 0.044776
								if( bullPower > -0.005293 )
									ret := -0.104106
						if( bullPower > 0.001503 )
							if( bullPower <= 0.00536 )
								if( d_k <= 22.9106 )
									ret := -0.370833
								if( d_k > 22.9106 )
									ret := -0.692308
							if( bullPower > 0.00536 )
								if( smoothK_k <= 4.4428 )
									ret := -0.861538 // sell
								if( smoothK_k > 4.4428 )
									ret := -0.541667
					if( bbm > 0.009003 )
						if( rsi1 <= 26.9521 )
							if( bearPower <= -0.039563 )
								if( rsi1 <= 24.9823 )
									ret := -0.801970 // sell
								if( rsi1 > 24.9823 )
									ret := -0.665871
							if( bearPower > -0.039563 )
								if( bbm <= 0.016004 )
									ret := -0.570764
								if( bbm > 0.016004 )
									ret := -0.760544 // sell
						if( rsi1 > 26.9521 )
							if( bullPower <= -0.005205 )
								if( rsi1 <= 33.7387 )
									ret := -0.433788
								if( rsi1 > 33.7387 )
									ret := -0.142259
							if( bullPower > -0.005205 )
								if( d_k <= 4.32714 )
									ret := -0.511224
								if( d_k > 4.32714 )
									ret := -0.694852
				if( rsi1 > 38.4607 )
					if( rsi1 <= 47.9861 )
						if( bbp <= -0.023927 )
							if( rsi1 <= 41.7078 )
								if( d_k <= 4.85269 )
									ret := -0.002457
								if( d_k > 4.85269 )
									ret := -0.271012
							if( rsi1 > 41.7078 )
								if( d_k <= 6.79158 )
									ret := 0.270345
								if( d_k > 6.79158 )
									ret := -0.010695
						if( bbp > -0.023927 )
							if( bullPower <= 0.004806 )
								if( bbm <= 0.017113 )
									ret := -0.092471
								if( bbm > 0.017113 )
									ret := -0.306034
							if( bullPower > 0.004806 )
								if( rsi1 <= 43.8261 )
									ret := -0.500000
								if( rsi1 > 43.8261 )
									ret := -0.283048
					if( rsi1 > 47.9861 )
						if( bbp <= -0.008259 )
							if( bullPower <= -0.010409 )
								if( k <= 8.78996 )
									ret := -0.166667
								if( k > 8.78996 )
									ret := 0.666667
							if( bullPower > -0.010409 )
								if( smoothD_d <= 84.6938 )
									ret := 0.189152
								if( smoothD_d > 84.6938 )
									ret := 0.437309
						if( bbp > -0.008259 )
							if( bbp <= -0.002817 )
								if( k <= 79.6517 )
									ret := 0.014577
								if( k > 79.6517 )
									ret := 0.242857
							if( bbp > -0.002817 )
								if( rsi1 <= 49.9943 )
									ret := -0.212245
								if( rsi1 > 49.9943 )
									ret := -0.045983
			if( bullPower > 0.012358 )
				if( d_k <= 9.57994 )
					if( rsi1 <= 49.223 )
						if( rsi1 <= 42.3402 )
							if( bearPower <= -0.130826 )
								if( smoothK_k <= 8.72919 )
									ret := 0.272727
								if( smoothK_k > 8.72919 )
									ret := -0.500000
							if( bearPower > -0.130826 )
								if( rsi1 <= 36.3614 )
									ret := -0.843669 // sell
								if( rsi1 > 36.3614 )
									ret := -0.721196 // sell
						if( rsi1 > 42.3402 )
							if( bullPower <= 0.023554 )
								if( bbp <= 0.000498 )
									ret := -0.262376
								if( bbp > 0.000498 )
									ret := -0.471545
							if( bullPower > 0.023554 )
								if( bbp <= 0.020254 )
									ret := -0.504373
								if( bbp > 0.020254 )
									ret := -0.741803 // sell
					if( rsi1 > 49.223 )
						if( bearPower <= -0.010598 )
							if( smoothD_d <= 89.3237 )
								if( d_k <= 1.63853 )
									ret := 0.486486
								if( d_k > 1.63853 )
									ret := -0.010086
							if( smoothD_d > 89.3237 )
								if( rsi1 <= 54.0964 )
									ret := 0.716418 // buy
								if( rsi1 > 54.0964 )
									ret := 0.381818
						if( bearPower > -0.010598 )
							if( d <= 97.4414 )
								if( bearPower <= 0.009497 )
									ret := -0.278720
								if( bearPower > 0.009497 )
									ret := -0.594542
							if( d > 97.4414 )
								if( bbp <= 0.086504 )
									ret := 0.379630
								if( bbp > 0.086504 )
									ret := -0.666667
				if( d_k > 9.57994 )
					if( rsi1 <= 47.6626 )
						if( rsi1 <= 43.2746 )
							if( bullPower <= 0.023272 )
								if( rsi1 <= 29.8423 )
									ret := -0.970414 // sell
								if( rsi1 > 29.8423 )
									ret := -0.833333 // sell
							if( bullPower > 0.023272 )
								if( bbp <= -0.105066 )
									ret := 0.250000
								if( bbp > -0.105066 )
									ret := -0.932555 // sell
						if( rsi1 > 43.2746 )
							if( bbp <= 0.022006 )
								if( bearPower <= -0.068717 )
									ret := 0.571429
								if( bearPower > -0.068717 )
									ret := -0.670868
							if( bbp > 0.022006 )
								if( bbp <= 0.04391 )
									ret := -0.780908 // sell
								if( bbp > 0.04391 )
									ret := -0.905626 // sell
					if( rsi1 > 47.6626 )
						if( bearPower <= 0.010165 )
							if( bbp <= 0.02853 )
								if( rsi1 <= 54.3207 )
									ret := -0.460090
								if( rsi1 > 54.3207 )
									ret := -0.140921
							if( bbp > 0.02853 )
								if( rsi1 <= 54.8869 )
									ret := -0.694989
								if( rsi1 > 54.8869 )
									ret := -0.454545
						if( bearPower > 0.010165 )
							if( bullPower <= 0.025462 )
								if( bbp <= 0.03372 )
									ret := -0.406780
								if( bbp > 0.03372 )
									ret := -0.612500
							if( bullPower > 0.025462 )
								if( bullPower <= 0.042503 )
									ret := -0.796238 // sell
								if( bullPower > 0.042503 )
									ret := -0.895625 // sell
		if( rsi1 > 57.3824 )
			if( d_k <= 5.82276 )
				if( rsi1 <= 76.8112 )
					if( bearPower <= -0.002114 )
						if( bbm <= 0.013417 )
							if( bearPower <= -0.01899 )
								ret := -0.800000 // sell
							if( bearPower > -0.01899 )
								if( smoothK_k <= 94.5619 )
									ret := 0.201320
								if( smoothK_k > 94.5619 )
									ret := 1.000000 // buy
						if( bbm > 0.013417 )
							if( BBPower_Color <= 0.5 )
								if( bbp <= -0.000142 )
									ret := 0.609756
								if( bbp > -0.000142 )
									ret := 0.942857 // buy
							if( BBPower_Color > 0.5 )
								if( smoothK_k <= 87.5761 )
									ret := 0.279152
								if( smoothK_k > 87.5761 )
									ret := 0.608059
					if( bearPower > -0.002114 )
						if( smoothD_d <= 92.5461 )
							if( rsi1 <= 67.7688 )
								if( bbp <= 0.102332 )
									ret := 0.006625
								if( bbp > 0.102332 )
									ret := -0.330383
							if( rsi1 > 67.7688 )
								if( bearPower <= 0.083471 )
									ret := 0.266393
								if( bearPower > 0.083471 )
									ret := -0.500000
						if( smoothD_d > 92.5461 )
							if( bbm <= 0.010009 )
								if( rsi1 <= 75.9914 )
									ret := 0.055556
								if( rsi1 > 75.9914 )
									ret := 0.416667
							if( bbm > 0.010009 )
								if( bbp <= 0.078546 )
									ret := 0.406532
								if( bbp > 0.078546 )
									ret := 0.189066
				if( rsi1 > 76.8112 )
					if( bbm <= 0.017091 )
						if( bbm <= 0.014006 )
							if( smoothD_d <= 89.825 )
								if( d <= 91.7862 )
									ret := 0.238462
								if( d > 91.7862 )
									ret := 0.818182 // buy
							if( smoothD_d > 89.825 )
								if( smoothD_d <= 91.1175 )
									ret := -0.230769
								if( smoothD_d > 91.1175 )
									ret := 0.156118
						if( bbm > 0.014006 )
							if( bbp <= 0.048331 )
								if( bbm <= 0.016988 )
									ret := 0.696429
								if( bbm > 0.016988 )
									ret := 0.181818
							if( bbp > 0.048331 )
								if( smoothD_d <= 90.1406 )
									ret := 0.033333
								if( smoothD_d > 90.1406 )
									ret := 0.434783
					if( bbm > 0.017091 )
						if( rsi1 <= 86.0883 )
							if( bearPower <= 0.006187 )
								if( rsi1 <= 76.984 )
									ret := 0.500000
								if( rsi1 > 76.984 )
									ret := 0.857143 // buy
							if( bearPower > 0.006187 )
								if( bbm <= 0.034018 )
									ret := 0.489559
								if( bbm > 0.034018 )
									ret := 0.698473
						if( rsi1 > 86.0883 )
							if( bbp <= 0.101765 )
								if( bullPower <= 0.062204 )
									ret := 0.567568
								if( bullPower > 0.062204 )
									ret := -0.333333
							if( bbp > 0.101765 )
								if( bearPower <= 0.030694 )
									ret := 0.500000
								if( bearPower > 0.030694 )
									ret := 0.893023 // buy
			if( d_k > 5.82276 )
				if( bearPower <= 0.012232 )
					if( BBPower_Color <= 0.5 )
						if( d <= 77.8749 )
							if( bbm <= 0.010162 )
								if( bbp <= -0.00858 )
									ret := 0.482759
								if( bbp > -0.00858 )
									ret := 0.040984
							if( bbm > 0.010162 )
								if( smoothK_k <= 2.0296 )
									ret := -0.416667
								if( smoothK_k > 2.0296 )
									ret := 0.657224
						if( d > 77.8749 )
							if( d <= 87.6888 )
								if( rsi1 <= 60.8149 )
									ret := 0.224490
								if( rsi1 > 60.8149 )
									ret := -0.365854
							if( d > 87.6888 )
								if( bbp <= 0.001303 )
									ret := 0.318182
								if( bbp > 0.001303 )
									ret := 0.750000 // buy
					if( BBPower_Color > 0.5 )
						if( rsi1 <= 63.1473 )
							if( bearPower <= 0.003794 )
								if( rsi1 <= 58.591 )
									ret := -0.156342
								if( rsi1 > 58.591 )
									ret := 0.077821
							if( bearPower > 0.003794 )
								if( rsi1 <= 59.7355 )
									ret := -0.359155
								if( rsi1 > 59.7355 )
									ret := -0.157385
						if( rsi1 > 63.1473 )
							if( bbm <= 0.018108 )
								if( d <= 38.5158 )
									ret := 0.283465
								if( d > 38.5158 )
									ret := 0.069376
							if( bbm > 0.018108 )
								if( bbp <= 0.05417 )
									ret := 0.378205
								if( bbp > 0.05417 )
									ret := 0.012903
				if( bearPower > 0.012232 )
					if( rsi1 <= 69.9419 )
						if( rsi1 <= 62.577 )
							if( bullPower <= 0.038409 )
								if( smoothD_d <= 82.1632 )
									ret := -0.505660
								if( smoothD_d > 82.1632 )
									ret := -0.259740
							if( bullPower > 0.038409 )
								if( bbp <= 0.090544 )
									ret := -0.673285
								if( bbp > 0.090544 )
									ret := -0.809257 // sell
						if( rsi1 > 62.577 )
							if( d_k <= 14.7853 )
								if( smoothD_d <= 54.8599 )
									ret := -0.049096
								if( smoothD_d > 54.8599 )
									ret := -0.400957
							if( d_k > 14.7853 )
								if( bbp <= 0.162619 )
									ret := -0.553903
								if( bbp > 0.162619 )
									ret := -0.920863 // sell
					if( rsi1 > 69.9419 )
						if( bbp <= 0.163257 )
							if( bearPower <= 0.057928 )
								if( rsi1 <= 77.3766 )
									ret := 0.026634
								if( rsi1 > 77.3766 )
									ret := 0.337423
							if( bearPower > 0.057928 )
								if( d_k <= 13.4311 )
									ret := 0.047619
								if( d_k > 13.4311 )
									ret := -0.708333 // sell
						if( bbp > 0.163257 )
							if( rsi1 <= 77.2952 )
								if( k <= 62.2047 )
									ret := -0.416058
								if( k > 62.2047 )
									ret := -0.688312
							if( rsi1 > 77.2952 )
								if( bbm <= 0.043133 )
									ret := -0.650000
								if( bbm > 0.043133 )
									ret := 0.223684
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_UNIUSDT_5Min_c362fb7b(bbp, bullPower, BBPower_Color, bearPower, bbm, rsi1, d, k, smoothD_d, d_k, smoothK_k)

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


