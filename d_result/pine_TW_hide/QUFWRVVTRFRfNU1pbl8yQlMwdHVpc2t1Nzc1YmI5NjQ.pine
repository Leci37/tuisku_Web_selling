//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: AAVEUSDT_5Min_2BS0_775bb964 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAVEUSDT_5Min_2BS0_775bb964", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAVEUSDT_5Min_775bb964(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( d_k <= -0.610284 )
		if( rsi1 <= 48.3783 )
			if( bbp <= -0.310037 )
				if( rsi1 <= 33.4219 )
					if( d_k <= -7.34632 )
						if( d <= 28.9352 )
							if( bullPower <= -0.233298 )
								if( rsi1 <= 23.5102 )
									ret := 0.267925
								if( rsi1 > 23.5102 )
									ret := 0.653083
							if( bullPower > -0.233298 )
								if( smoothD_d <= 13.0373 )
									ret := 0.338798
								if( smoothD_d > 13.0373 )
									ret := -0.072816
						if( d > 28.9352 )
							if( bullPower <= -0.326019 )
								if( smoothD_d <= 48.1112 )
									ret := 0.362069
								if( smoothD_d > 48.1112 )
									ret := -0.031496
							if( bullPower > -0.326019 )
								if( bearPower <= -0.604878 )
									ret := -0.637168
								if( bearPower > -0.604878 )
									ret := -0.288136
					if( d_k > -7.34632 )
						if( smoothD_d <= 9.12387 )
							if( d_k <= -2.14246 )
								if( bullPower <= -0.527036 )
									ret := 0.278626
								if( bullPower > -0.527036 )
									ret := 0.010760
							if( d_k > -2.14246 )
								if( smoothD_d <= 0.231502 )
									ret := -0.415493
								if( smoothD_d > 0.231502 )
									ret := -0.143548
						if( smoothD_d > 9.12387 )
							if( bearPower <= -3.53363 )
								if( rsi1 <= 18.0939 )
									ret := 0.142857
								if( rsi1 > 18.0939 )
									ret := 0.956522 // buy
							if( bearPower > -3.53363 )
								if( bullPower <= -0.083928 )
									ret := -0.265319
								if( bullPower > -0.083928 )
									ret := -0.634921
				if( rsi1 > 33.4219 )
					if( bbp <= -0.787183 )
						if( d_k <= -5.28831 )
							if( d <= 30.1401 )
								if( d_k <= -13.4029 )
									ret := 0.893617 // buy
								if( d_k > -13.4029 )
									ret := 0.687539
							if( d > 30.1401 )
								if( bullPower <= -0.214118 )
									ret := 0.674173
								if( bullPower > -0.214118 )
									ret := 0.384913
						if( d_k > -5.28831 )
							if( d <= 0.594625 )
								if( d <= 0.509354 )
									ret := -0.250000
								if( d > 0.509354 )
									ret := -1.000000 // sell
							if( d > 0.594625 )
								if( d_k <= -0.927753 )
									ret := 0.482661
								if( d_k > -0.927753 )
									ret := 0.142857
					if( bbp > -0.787183 )
						if( bullPower <= 0.020291 )
							if( d_k <= -5.4257 )
								if( rsi1 <= 39.0443 )
									ret := 0.193934
								if( rsi1 > 39.0443 )
									ret := 0.578834
							if( d_k > -5.4257 )
								if( k <= 6.20581 )
									ret := 0.009646
								if( k > 6.20581 )
									ret := 0.220917
						if( bullPower > 0.020291 )
							if( smoothK_k <= 1.80153 )
								if( bearPower <= -0.606706 )
									ret := -0.833333 // sell
								if( bearPower > -0.606706 )
									ret := -0.411765
							if( smoothK_k > 1.80153 )
								if( smoothK_k <= 70.7542 )
									ret := 0.170940
								if( smoothK_k > 70.7542 )
									ret := -0.048458
			if( bbp > -0.310037 )
				if( bbp <= 0.080636 )
					if( rsi1 <= 41.3576 )
						if( bbm <= 0.150084 )
							if( bullPower <= 0.041353 )
								if( rsi1 <= 32.0735 )
									ret := -0.094664
								if( rsi1 > 32.0735 )
									ret := -0.011542
							if( bullPower > 0.041353 )
								if( bearPower <= -0.028661 )
									ret := -0.291667
								if( bearPower > -0.028661 )
									ret := -0.048780
						if( bbm > 0.150084 )
							if( d_k <= -4.95539 )
								if( smoothD_d <= 12.9083 )
									ret := 0.064677
								if( smoothD_d > 12.9083 )
									ret := -0.263215
							if( d_k > -4.95539 )
								if( smoothD_d <= 17.0122 )
									ret := -0.320847
								if( smoothD_d > 17.0122 )
									ret := -0.484211
					if( rsi1 > 41.3576 )
						if( d_k <= -11.9063 )
							if( smoothK_k <= 30.7149 )
								if( smoothD_d <= 7.92538 )
									ret := -0.166667
								if( smoothD_d > 7.92538 )
									ret := 0.552000
							if( smoothK_k > 30.7149 )
								if( bbp <= -0.051385 )
									ret := 0.226164
								if( bbp > -0.051385 )
									ret := 0.054217
						if( d_k > -11.9063 )
							if( d <= 59.8118 )
								if( bearPower <= -0.523581 )
									ret := -0.950000 // sell
								if( bearPower > -0.523581 )
									ret := 0.105521
							if( d > 59.8118 )
								if( rsi1 <= 44.3292 )
									ret := -0.270903
								if( rsi1 > 44.3292 )
									ret := 0.007905
				if( bbp > 0.080636 )
					if( bbp <= 0.425056 )
						if( rsi1 <= 44.3546 )
							if( BBPower_Color <= 0.5 )
								if( rsi1 <= 41.1508 )
									ret := -1.000000 // sell
								if( rsi1 > 41.1508 )
									ret := -0.658537
							if( BBPower_Color > 0.5 )
								if( bbm <= 0.121911 )
									ret := -0.181818
								if( bbm > 0.121911 )
									ret := -0.450479
						if( rsi1 > 44.3546 )
							if( bbm <= 0.25014 )
								if( k <= 14.1405 )
									ret := -0.400000
								if( k > 14.1405 )
									ret := 0.014368
							if( bbm > 0.25014 )
								if( bbm <= 0.680199 )
									ret := -0.264706
								if( bbm > 0.680199 )
									ret := 0.140625
					if( bbp > 0.425056 )
						if( rsi1 <= 48.0175 )
							if( smoothD_d <= 25.7638 )
								if( smoothK_k <= 30.3799 )
									ret := -0.521368
								if( smoothK_k > 30.3799 )
									ret := 0.400000
							if( smoothD_d > 25.7638 )
								if( bbm <= 0.480691 )
									ret := -0.582090
								if( bbm > 0.480691 )
									ret := -0.779570 // sell
						if( rsi1 > 48.0175 )
							if( d <= 63.4992 )
								if( bullPower <= 0.939974 )
									ret := 0.285714
								if( bullPower > 0.939974 )
									ret := -0.800000 // sell
							if( d > 63.4992 )
								if( d <= 84.7222 )
									ret := -0.900000 // sell
								if( d > 84.7222 )
									ret := -0.200000
		if( rsi1 > 48.3783 )
			if( BBPower_Color <= 0.5 )
				if( bbm <= 0.130024 )
					if( bbp <= 0.000522 )
						if( bbm <= 0.070161 )
							if( rsi1 <= 56.2631 )
								if( smoothD_d <= 44.5409 )
									ret := 0.159292
								if( smoothD_d > 44.5409 )
									ret := 0.016854
							if( rsi1 > 56.2631 )
								if( bearPower <= -0.06029 )
									ret := 0.380000
								if( bearPower > -0.06029 )
									ret := 0.201220
						if( bbm > 0.070161 )
							if( d_k <= -18.0638 )
								if( k <= 68.6916 )
									ret := 0.699346
								if( k > 68.6916 )
									ret := 0.364583
							if( d_k > -18.0638 )
								if( rsi1 <= 61.0405 )
									ret := 0.258222
								if( rsi1 > 61.0405 )
									ret := 0.533708
					if( bbp > 0.000522 )
						if( rsi1 <= 56.6111 )
							if( smoothK_k <= 80.0608 )
								ret := 1.000000 // buy
							if( smoothK_k > 80.0608 )
								if( smoothD_d <= 74.1228 )
									ret := -0.500000
								if( smoothD_d > 74.1228 )
									ret := 1.000000 // buy
						if( rsi1 > 56.6111 )
							if( rsi1 <= 59.1237 )
								if( rsi1 <= 58.7601 )
									ret := 1.000000 // buy
								if( rsi1 > 58.7601 )
									ret := 0.500000
							if( rsi1 > 59.1237 )
								ret := 1.000000 // buy
				if( bbm > 0.130024 )
					if( rsi1 <= 60.174 )
						if( d_k <= -6.08945 )
							if( bearPower <= -0.261739 )
								if( bullPower <= -0.038807 )
									ret := 0.818844 // buy
								if( bullPower > -0.038807 )
									ret := 0.697307
							if( bearPower > -0.261739 )
								if( bbp <= -0.002796 )
									ret := 0.545539
								if( bbp > -0.002796 )
									ret := 0.659489
						if( d_k > -6.08945 )
							if( rsi1 <= 53.5727 )
								if( bearPower <= -0.362425 )
									ret := 0.568088
								if( bearPower > -0.362425 )
									ret := 0.276227
							if( rsi1 > 53.5727 )
								if( bbp <= -0.305296 )
									ret := 0.696552
								if( bbp > -0.305296 )
									ret := 0.556613
					if( rsi1 > 60.174 )
						if( rsi1 <= 62.6092 )
							if( smoothK_k <= 94.8889 )
								if( bbp <= -0.000497 )
									ret := 0.779481 // buy
								if( bbp > -0.000497 )
									ret := 0.920863 // buy
							if( smoothK_k > 94.8889 )
								if( bbp <= 0.617327 )
									ret := 0.494949
								if( bbp > 0.617327 )
									ret := -1.000000 // sell
						if( rsi1 > 62.6092 )
							if( bullPower <= 0.174673 )
								if( d <= 11.3403 )
									ret := 0.200000
								if( d > 11.3403 )
									ret := 0.860000 // buy
							if( bullPower > 0.174673 )
								if( bbp <= -0.023282 )
									ret := 0.891775 // buy
								if( bbp > -0.023282 )
									ret := 0.991272 // buy
			if( BBPower_Color > 0.5 )
				if( rsi1 <= 62.6264 )
					if( bearPower <= 0.068974 )
						if( smoothK_k <= 96.0884 )
							if( rsi1 <= 54.8451 )
								if( k <= 4.56216 )
									ret := -0.567568
								if( k > 4.56216 )
									ret := 0.017235
							if( rsi1 > 54.8451 )
								if( smoothD_d <= 53.5344 )
									ret := 0.299840
								if( smoothD_d > 53.5344 )
									ret := 0.103019
						if( smoothK_k > 96.0884 )
							if( bullPower <= 0.186703 )
								if( bbm <= 0.172912 )
									ret := 0.052239
								if( bbm > 0.172912 )
									ret := 0.300000
							if( bullPower > 0.186703 )
								if( d <= 90.9185 )
									ret := 0.345455
								if( d > 90.9185 )
									ret := 0.606557
					if( bearPower > 0.068974 )
						if( rsi1 <= 61.1479 )
							if( rsi1 <= 52.9395 )
								if( bullPower <= 0.404095 )
									ret := -0.180233
								if( bullPower > 0.404095 )
									ret := -0.478261
							if( rsi1 > 52.9395 )
								if( k <= 99.9629 )
									ret := -0.106272
								if( k > 99.9629 )
									ret := 0.268817
						if( rsi1 > 61.1479 )
							if( d_k <= -2.52167 )
								if( d_k <= -16.3634 )
									ret := -0.054054
								if( d_k > -16.3634 )
									ret := 0.349206
							if( d_k > -2.52167 )
								if( d <= 98.9364 )
									ret := -0.105263
								if( d > 98.9364 )
									ret := 0.833333 // buy
				if( rsi1 > 62.6264 )
					if( bearPower <= -0.041713 )
						if( bbm <= 0.141605 )
							if( rsi1 <= 71.5915 )
								if( d <= 37.8534 )
									ret := 0.500000
								if( d > 37.8534 )
									ret := 0.088235
							if( rsi1 > 71.5915 )
								if( bearPower <= -0.054052 )
									ret := 0.400000
								if( bearPower > -0.054052 )
									ret := 0.750000 // buy
						if( bbm > 0.141605 )
							if( rsi1 <= 65.0486 )
								if( bullPower <= 0.553738 )
									ret := 0.509804
								if( bullPower > 0.553738 )
									ret := 0.119565
							if( rsi1 > 65.0486 )
								if( rsi1 <= 67.3473 )
									ret := 0.630342
								if( rsi1 > 67.3473 )
									ret := 0.743568 // buy
					if( bearPower > -0.041713 )
						if( bullPower <= 0.222624 )
							if( bbm <= 0.120055 )
								if( smoothD_d <= 83.5237 )
									ret := 0.257862
								if( smoothD_d > 83.5237 )
									ret := 0.121951
							if( bbm > 0.120055 )
								if( rsi1 <= 66.6806 )
									ret := 0.333333
								if( rsi1 > 66.6806 )
									ret := 0.557439
						if( bullPower > 0.222624 )
							if( rsi1 <= 70.5261 )
								if( bearPower <= 0.096979 )
									ret := 0.554231
								if( bearPower > 0.096979 )
									ret := 0.339983
							if( rsi1 > 70.5261 )
								if( rsi1 <= 85.5774 )
									ret := 0.617205
								if( rsi1 > 85.5774 )
									ret := 0.800242 // buy
	if( d_k > -0.610284 )
		if( rsi1 <= 54.5914 )
			if( bbp <= 0.157709 )
				if( rsi1 <= 37.9307 )
					if( bbm <= 0.150039 )
						if( bbm <= 0.080036 )
							if( bullPower <= 0.023313 )
								if( bullPower <= -0.025998 )
									ret := -0.097087
								if( bullPower > -0.025998 )
									ret := -0.178977
							if( bullPower > 0.023313 )
								if( d_k <= 3.2921 )
									ret := -0.027027
								if( d_k > 3.2921 )
									ret := -0.504673
						if( bbm > 0.080036 )
							if( d_k <= 16.0768 )
								if( bbm <= 0.089936 )
									ret := -0.862069 // sell
								if( bbm > 0.089936 )
									ret := -0.265060
							if( d_k > 16.0768 )
								if( d <= 50.8503 )
									ret := -0.396226
								if( d > 50.8503 )
									ret := -0.645669
					if( bbm > 0.150039 )
						if( rsi1 <= 29.4552 )
							if( bullPower <= 0.011086 )
								if( rsi1 <= 22.0138 )
									ret := -0.719892 // sell
								if( rsi1 > 22.0138 )
									ret := -0.536953
							if( bullPower > 0.011086 )
								if( bearPower <= -2.43 )
									ret := 0.500000
								if( bearPower > -2.43 )
									ret := -0.797810 // sell
						if( rsi1 > 29.4552 )
							if( bullPower <= -0.072992 )
								if( k <= 93.8849 )
									ret := -0.223045
								if( k > 93.8849 )
									ret := 0.755102 // buy
							if( bullPower > -0.072992 )
								if( bullPower <= 0.085474 )
									ret := -0.504722
								if( bullPower > 0.085474 )
									ret := -0.663415
				if( rsi1 > 37.9307 )
					if( rsi1 <= 45.1992 )
						if( bullPower <= 0.008437 )
							if( bullPower <= -0.13481 )
								if( k <= 0.001354 )
									ret := -0.342105
								if( k > 0.001354 )
									ret := 0.211388
							if( bullPower > -0.13481 )
								if( d_k <= 7.21059 )
									ret := 0.008202
								if( d_k > 7.21059 )
									ret := -0.157851
						if( bullPower > 0.008437 )
							if( bullPower <= 0.10141 )
								if( rsi1 <= 42.4993 )
									ret := -0.351488
								if( rsi1 > 42.4993 )
									ret := -0.154000
							if( bullPower > 0.10141 )
								if( smoothD_d <= 64.5738 )
									ret := -0.447231
								if( smoothD_d > 64.5738 )
									ret := -0.672611
					if( rsi1 > 45.1992 )
						if( bbp <= -0.152632 )
							if( bbp <= -0.41076 )
								if( bearPower <= -0.992023 )
									ret := 0.638710
								if( bearPower > -0.992023 )
									ret := 0.306254
							if( bbp > -0.41076 )
								if( d_k <= 6.5588 )
									ret := 0.209302
								if( d_k > 6.5588 )
									ret := 0.036307
						if( bbp > -0.152632 )
							if( bullPower <= 0.083533 )
								if( k <= 99.8838 )
									ret := -0.001887
								if( k > 99.8838 )
									ret := 0.454545
							if( bullPower > 0.083533 )
								if( rsi1 <= 50.4651 )
									ret := -0.295775
								if( rsi1 > 50.4651 )
									ret := -0.053171
			if( bbp > 0.157709 )
				if( rsi1 <= 46.124 )
					if( BBPower_Color <= 0.5 )
						if( bearPower <= -0.296123 )
							if( rsi1 <= 40.8 )
								ret := -0.500000
							if( rsi1 > 40.8 )
								ret := 0.714286 // buy
						if( bearPower > -0.296123 )
							if( d <= 0.885383 )
								if( k <= 0.05822 )
									ret := -1.000000 // sell
								if( k > 0.05822 )
									ret := 0.200000
							if( d > 0.885383 )
								if( rsi1 <= 45.3015 )
									ret := -0.987448 // sell
								if( rsi1 > 45.3015 )
									ret := -0.777778 // sell
					if( BBPower_Color > 0.5 )
						if( bbp <= 0.310507 )
							if( d <= 38.603 )
								if( bearPower <= 0.007489 )
									ret := -0.614604
								if( bearPower > 0.007489 )
									ret := -0.372449
							if( d > 38.603 )
								if( rsi1 <= 45.4436 )
									ret := -0.721358 // sell
								if( rsi1 > 45.4436 )
									ret := -0.344828
						if( bbp > 0.310507 )
							if( d <= 40.8816 )
								if( smoothK_k <= 24.5475 )
									ret := -0.736077 // sell
								if( smoothK_k > 24.5475 )
									ret := -0.442308
							if( d > 40.8816 )
								if( d_k <= 21.1976 )
									ret := -0.801075 // sell
								if( d_k > 21.1976 )
									ret := -0.922535 // sell
				if( rsi1 > 46.124 )
					if( d_k <= 9.99494 )
						if( bbp <= 0.524562 )
							if( rsi1 <= 52.1456 )
								if( bullPower <= 0.182316 )
									ret := -0.198675
								if( bullPower > 0.182316 )
									ret := -0.434030
							if( rsi1 > 52.1456 )
								if( d <= 96.9988 )
									ret := -0.205163
								if( d > 96.9988 )
									ret := 0.400000
						if( bbp > 0.524562 )
							if( smoothD_d <= 75.0605 )
								if( d_k <= 0.046294 )
									ret := -0.760000 // sell
								if( d_k > 0.046294 )
									ret := -0.502080
							if( smoothD_d > 75.0605 )
								if( smoothK_k <= 81.3465 )
									ret := -0.767606 // sell
								if( smoothK_k > 81.3465 )
									ret := -0.530547
					if( d_k > 9.99494 )
						if( bearPower <= 0.066137 )
							if( bearPower <= -0.536243 )
								if( smoothD_d <= 26.7877 )
									ret := 1.000000 // buy
								if( smoothD_d > 26.7877 )
									ret := 0.333333
							if( bearPower > -0.536243 )
								if( bbp <= 0.259224 )
									ret := -0.434211
								if( bbp > 0.259224 )
									ret := -0.623635
						if( bearPower > 0.066137 )
							if( bbp <= 0.379338 )
								if( smoothK_k <= 21.8605 )
									ret := -0.218750
								if( smoothK_k > 21.8605 )
									ret := -0.586667
							if( bbp > 0.379338 )
								if( smoothD_d <= 33.097 )
									ret := -0.670543
								if( smoothD_d > 33.097 )
									ret := -0.805723 // sell
		if( rsi1 > 54.5914 )
			if( d_k <= 4.63698 )
				if( rsi1 <= 67.9318 )
					if( bearPower <= -0.042433 )
						if( bbp <= -0.116186 )
							if( smoothK_k <= 8.82241 )
								if( d_k <= 0.341647 )
									ret := 0.545455
								if( d_k > 0.341647 )
									ret := -0.250000
							if( smoothK_k > 8.82241 )
								if( bbm <= 0.081203 )
									ret := 0.083333
								if( bbm > 0.081203 )
									ret := 0.654003
						if( bbp > -0.116186 )
							if( bbm <= 0.140112 )
								if( d <= 99.8903 )
									ret := 0.131579
								if( d > 99.8903 )
									ret := 0.555556
							if( bbm > 0.140112 )
								if( BBPower_Color <= 0.5 )
									ret := 0.624251
								if( BBPower_Color > 0.5 )
									ret := 0.284936
					if( bearPower > -0.042433 )
						if( rsi1 <= 62.0128 )
							if( bbp <= 0.531493 )
								if( rsi1 <= 58.3464 )
									ret := -0.068543
								if( rsi1 > 58.3464 )
									ret := 0.095533
							if( bbp > 0.531493 )
								if( k <= 99.9153 )
									ret := -0.341098
								if( k > 99.9153 )
									ret := 0.511628
						if( rsi1 > 62.0128 )
							if( bearPower <= 0.299715 )
								if( smoothD_d <= 52.1133 )
									ret := 0.472561
								if( smoothD_d > 52.1133 )
									ret := 0.181011
							if( bearPower > 0.299715 )
								if( smoothD_d <= 2.10256 )
									ret := -0.722222 // sell
								if( smoothD_d > 2.10256 )
									ret := -0.093923
				if( rsi1 > 67.9318 )
					if( k <= 99.6255 )
						if( d_k <= 0.643759 )
							if( bbm <= 0.12169 )
								if( d_k <= 0.217911 )
									ret := 0.255208
								if( d_k > 0.217911 )
									ret := 0.025000
							if( bbm > 0.12169 )
								if( rsi1 <= 80.9838 )
									ret := 0.482385
								if( rsi1 > 80.9838 )
									ret := 0.684028
						if( d_k > 0.643759 )
							if( smoothD_d <= 79.3032 )
								if( smoothK_k <= 35.5911 )
									ret := 0.729064 // buy
								if( smoothK_k > 35.5911 )
									ret := 0.462435
							if( smoothD_d > 79.3032 )
								if( bullPower <= 1.87745 )
									ret := 0.231668
								if( bullPower > 1.87745 )
									ret := -0.171053
					if( k > 99.6255 )
						if( bbm <= 0.130232 )
							if( rsi1 <= 84.758 )
								if( rsi1 <= 69.1833 )
									ret := 0.642857
								if( rsi1 > 69.1833 )
									ret := 0.169118
							if( rsi1 > 84.758 )
								if( bbp <= 0.461412 )
									ret := 0.600000
								if( bbp > 0.461412 )
									ret := 0.062500
						if( bbm > 0.130232 )
							if( bullPower <= 0.853099 )
								if( smoothD_d <= 96.9999 )
									ret := 0.755844 // buy
								if( smoothD_d > 96.9999 )
									ret := 0.557778
							if( bullPower > 0.853099 )
								if( bbm <= 0.310634 )
									ret := 0.095238
								if( bbm > 0.310634 )
									ret := 0.798291 // buy
			if( d_k > 4.63698 )
				if( bearPower <= 0.152697 )
					if( BBPower_Color <= 0.5 )
						if( bbm <= 0.240141 )
							if( bbp <= -0.000139 )
								if( bearPower <= -0.058631 )
									ret := 0.235828
								if( bearPower > -0.058631 )
									ret := 0.000000
							if( bbp > -0.000139 )
								if( rsi1 <= 56.2985 )
									ret := -0.555556
								if( rsi1 > 56.2985 )
									ret := 0.733333 // buy
						if( bbm > 0.240141 )
							if( d <= 65.6417 )
								if( rsi1 <= 64.6023 )
									ret := 0.545156
								if( rsi1 > 64.6023 )
									ret := 0.916667 // buy
							if( d > 65.6417 )
								if( k <= 63.4741 )
									ret := 0.089744
								if( k > 63.4741 )
									ret := 0.504274
					if( BBPower_Color > 0.5 )
						if( smoothD_d <= 44.3577 )
							if( bearPower <= -0.020667 )
								if( bullPower <= 1.19141 )
									ret := 0.292330
								if( bullPower > 1.19141 )
									ret := -0.285714
							if( bearPower > -0.020667 )
								if( rsi1 <= 65.4685 )
									ret := -0.019890
								if( rsi1 > 65.4685 )
									ret := 0.436019
						if( smoothD_d > 44.3577 )
							if( bearPower <= -0.029707 )
								if( bbp <= 1.45677 )
									ret := 0.094188
								if( bbp > 1.45677 )
									ret := -0.600000
							if( bearPower > -0.029707 )
								if( rsi1 <= 64.2286 )
									ret := -0.289812
								if( rsi1 > 64.2286 )
									ret := 0.184086
				if( bearPower > 0.152697 )
					if( rsi1 <= 66.9327 )
						if( bearPower <= 0.286427 )
							if( smoothD_d <= 26.053 )
								if( rsi1 <= 56.2605 )
									ret := -0.500000
								if( rsi1 > 56.2605 )
									ret := 0.111940
							if( smoothD_d > 26.053 )
								if( rsi1 <= 61.1249 )
									ret := -0.626653
								if( rsi1 > 61.1249 )
									ret := -0.335907
						if( bearPower > 0.286427 )
							if( d_k <= 9.69588 )
								if( d <= 85.5884 )
									ret := -0.403694
								if( d > 85.5884 )
									ret := -0.641089
							if( d_k > 9.69588 )
								if( d <= 28.7016 )
									ret := -0.509434
								if( d > 28.7016 )
									ret := -0.798016 // sell
					if( rsi1 > 66.9327 )
						if( d <= 82.4903 )
							if( rsi1 <= 71.9769 )
								if( bearPower <= 0.427288 )
									ret := 0.120408
								if( bearPower > 0.427288 )
									ret := -0.493671
							if( rsi1 > 71.9769 )
								if( bearPower <= 0.584318 )
									ret := 0.401786
								if( bearPower > 0.584318 )
									ret := 0.022152
						if( d > 82.4903 )
							if( d_k <= 8.41714 )
								if( d <= 86.9195 )
									ret := 0.190751
								if( d > 86.9195 )
									ret := -0.301402
							if( d_k > 8.41714 )
								if( bullPower <= 0.97822 )
									ret := -0.346154
								if( bullPower > 0.97822 )
									ret := -0.721477 // sell
	
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
float op_operation = decision_tree_0_AAVEUSDT_5Min_775bb964(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


