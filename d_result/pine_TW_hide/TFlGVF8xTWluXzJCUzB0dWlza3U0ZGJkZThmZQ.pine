//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: LYFT_1Min_2BS0_4dbde8fe Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LYFT_1Min_2BS0_4dbde8fe", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LYFT_1Min_4dbde8fe(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bbp <= -0.000798 )
		if( bbm <= 0.004991 )
			if( bearPower <= -0.010537 )
				if( bearPower <= -0.027469 )
					if( d_k <= 16.6117 )
						if( bbm <= 0.00081 )
							if( bbp <= -0.070545 )
								if( d_k <= -0.205715 )
									ret := 0.476190
								if( d_k > -0.205715 )
									ret := 0.665414
							if( bbp > -0.070545 )
								if( rsi1 <= 37.3226 )
									ret := 0.217949
								if( rsi1 > 37.3226 )
									ret := 0.521127
						if( bbm > 0.00081 )
							if( d_k <= -15.4786 )
								ret := 0.000000
							if( d_k > -15.4786 )
								if( bbm <= 0.004895 )
									ret := 0.799065 // buy
								if( bbm > 0.004895 )
									ret := 0.250000
					if( d_k > 16.6117 )
						if( d_k <= 20.5624 )
							if( rsi1 <= 34.5216 )
								ret := -1.000000 // sell
							if( rsi1 > 34.5216 )
								if( smoothD_d <= 46.6528 )
									ret := -0.071429
								if( smoothD_d > 46.6528 )
									ret := 0.433333
						if( d_k > 20.5624 )
							if( smoothD_d <= 52.7051 )
								if( smoothD_d <= 45.1817 )
									ret := 0.809524 // buy
								if( smoothD_d > 45.1817 )
									ret := -0.625000
							if( smoothD_d > 52.7051 )
								if( bbp <= -0.108025 )
									ret := 0.500000
								if( bbp > -0.108025 )
									ret := 0.947368 // buy
				if( bearPower > -0.027469 )
					if( rsi1 <= 39.0107 )
						if( smoothK_k <= 29.5037 )
							if( k <= 23.4061 )
								if( bbm <= 0.0001 )
									ret := 0.177083
								if( bbm > 0.0001 )
									ret := 0.511111
							if( k > 23.4061 )
								if( d <= 23.7264 )
									ret := 0.176471
								if( d > 23.7264 )
									ret := -0.428571
						if( smoothK_k > 29.5037 )
							if( smoothD_d <= 28.3795 )
								if( smoothD_d <= 17.1823 )
									ret := -0.250000
								if( smoothD_d > 17.1823 )
									ret := 0.961538 // buy
							if( smoothD_d > 28.3795 )
								if( bbm <= 0.000672 )
									ret := 0.259259
								if( bbm > 0.000672 )
									ret := 0.666667
					if( rsi1 > 39.0107 )
						if( bbm <= 0.00043 )
							if( bearPower <= -0.019342 )
								if( smoothD_d <= 10.734 )
									ret := 0.750000 // buy
								if( smoothD_d > 10.734 )
									ret := 0.422764
							if( bearPower > -0.019342 )
								if( smoothK_k <= 55.4938 )
									ret := 0.368557
								if( smoothK_k > 55.4938 )
									ret := 0.178378
						if( bbm > 0.00043 )
							if( smoothK_k <= 21.3826 )
								if( d <= 21.9629 )
									ret := 0.793651 // buy
								if( d > 21.9629 )
									ret := 0.034483
							if( smoothK_k > 21.3826 )
								if( rsi1 <= 55.5683 )
									ret := 0.812500 // buy
								if( rsi1 > 55.5683 )
									ret := 0.000000
			if( bearPower > -0.010537 )
				if( bbm <= 0.000712 )
					if( bearPower <= -0.003879 )
						if( rsi1 <= 42.1529 )
							if( bbm <= 0.00037 )
								if( rsi1 <= 41.9268 )
									ret := 0.076336
								if( rsi1 > 41.9268 )
									ret := -0.230769
							if( bbm > 0.00037 )
								ret := -0.428571
						if( rsi1 > 42.1529 )
							if( d <= 2.61371 )
								ret := -0.400000
							if( d > 2.61371 )
								if( d_k <= 19.2143 )
									ret := 0.195021
								if( d_k > 19.2143 )
									ret := 0.454545
					if( bearPower > -0.003879 )
						if( d <= 82.1102 )
							if( smoothD_d <= 76.5734 )
								if( smoothK_k <= 14.4186 )
									ret := -0.078947
								if( smoothK_k > 14.4186 )
									ret := 0.060526
							if( smoothD_d > 76.5734 )
								if( bbp <= -0.004963 )
									ret := 0.000000
								if( bbp > -0.004963 )
									ret := -0.636364
						if( d > 82.1102 )
							if( bbp <= -0.004961 )
								if( smoothD_d <= 82.4849 )
									ret := 0.800000 // buy
								if( smoothD_d > 82.4849 )
									ret := 0.304348
							if( bbp > -0.004961 )
								if( d_k <= -4.16566 )
									ret := 0.666667
								if( d_k > -4.16566 )
									ret := 0.018868
				if( bbm > 0.000712 )
					if( k <= 44.9365 )
						if( smoothD_d <= 45.6462 )
							if( k <= 19.2255 )
								if( bbm <= 0.003321 )
									ret := -0.205128
								if( bbm > 0.003321 )
									ret := 0.521739
							if( k > 19.2255 )
								if( bearPower <= -0.00978 )
									ret := -0.375000
								if( bearPower > -0.00978 )
									ret := 0.584615
						if( smoothD_d > 45.6462 )
							if( rsi1 <= 49.7081 )
								if( bbp <= -0.011523 )
									ret := -0.500000
								if( bbp > -0.011523 )
									ret := -1.000000 // sell
							if( rsi1 > 49.7081 )
								if( rsi1 <= 51.13 )
									ret := 0.600000
								if( rsi1 > 51.13 )
									ret := -0.571429
					if( k > 44.9365 )
						if( bullPower <= -0.001241 )
							if( smoothK_k <= 88.25 )
								if( rsi1 <= 56.5431 )
									ret := 0.813333 // buy
								if( rsi1 > 56.5431 )
									ret := 0.307692
							if( smoothK_k > 88.25 )
								if( smoothK_k <= 94.1052 )
									ret := -0.750000 // sell
								if( smoothK_k > 94.1052 )
									ret := 0.333333
						if( bullPower > -0.001241 )
							if( d_k <= -20.7054 )
								ret := -0.750000 // sell
							if( d_k > -20.7054 )
								if( bbm <= 0.004162 )
									ret := 0.580645
								if( bbm > 0.004162 )
									ret := -0.111111
		if( bbm > 0.004991 )
			if( d <= 91.052 )
				if( d_k <= -11.6512 )
					if( d_k <= -29.7723 )
						if( bearPower <= -0.016681 )
							if( rsi1 <= 33.3517 )
								ret := 0.200000
							if( rsi1 > 33.3517 )
								if( d_k <= -31.0501 )
									ret := 0.692308
								if( d_k > -31.0501 )
									ret := 1.000000 // buy
						if( bearPower > -0.016681 )
							if( k <= 85.0164 )
								if( d_k <= -31.973 )
									ret := 0.750000 // buy
								if( d_k > -31.973 )
									ret := 0.142857
							if( k > 85.0164 )
								ret := -0.250000
					if( d_k > -29.7723 )
						if( bullPower <= -0.046767 )
							if( bbm <= 0.111566 )
								if( bullPower <= -0.109226 )
									ret := -1.000000 // sell
								if( bullPower > -0.109226 )
									ret := 0.500000
							if( bbm > 0.111566 )
								ret := 1.000000 // buy
						if( bullPower > -0.046767 )
							if( rsi1 <= 34.7307 )
								if( bbp <= -0.042983 )
									ret := -0.319549
								if( bbp > -0.042983 )
									ret := -0.012019
							if( rsi1 > 34.7307 )
								if( bullPower <= -0.004995 )
									ret := 0.166240
								if( bullPower > -0.004995 )
									ret := -0.001341
				if( d_k > -11.6512 )
					if( bbm <= 0.009761 )
						if( bbm <= 0.005011 )
							if( rsi1 <= 4.94588 )
								ret := 0.714286 // buy
							if( rsi1 > 4.94588 )
								if( smoothK_k <= 3.69555 )
									ret := 0.059140
								if( smoothK_k > 3.69555 )
									ret := -0.028021
						if( bbm > 0.005011 )
							if( bullPower <= -0.011496 )
								if( d <= 1.10137 )
									ret := 0.000000
								if( d > 1.10137 )
									ret := 0.511182
							if( bullPower > -0.011496 )
								if( smoothD_d <= -0.446594 )
									ret := -0.300000
								if( smoothD_d > -0.446594 )
									ret := 0.220403
					if( bbm > 0.009761 )
						if( bbm <= 0.01 )
							if( d_k <= -3.53382 )
								if( bullPower <= -0.032667 )
									ret := 0.464286
								if( bullPower > -0.032667 )
									ret := 0.117994
							if( d_k > -3.53382 )
								if( d <= 0.191396 )
									ret := 0.217949
								if( d > 0.191396 )
									ret := 0.013693
						if( bbm > 0.01 )
							if( bearPower <= -0.42621 )
								if( d_k <= -4.49371 )
									ret := 0.000000
								if( d_k > -4.49371 )
									ret := 0.900000 // buy
							if( bearPower > -0.42621 )
								if( bbm <= 0.014866 )
									ret := 0.282193
								if( bbm > 0.014866 )
									ret := 0.104637
			if( d > 91.052 )
				if( k <= 99.6243 )
					if( smoothK_k <= 95.5885 )
						if( rsi1 <= 41.1509 )
							if( rsi1 <= 34.2158 )
								if( k <= 77.7641 )
									ret := 0.750000 // buy
								if( k > 77.7641 )
									ret := -0.357143
							if( rsi1 > 34.2158 )
								if( bbp <= -0.056209 )
									ret := 0.697674
								if( bbp > -0.056209 )
									ret := 0.196970
						if( rsi1 > 41.1509 )
							if( bbm <= 0.085339 )
								if( bbm <= 0.032949 )
									ret := -0.118971
								if( bbm > 0.032949 )
									ret := 0.150289
							if( bbm > 0.085339 )
								if( d_k <= 1.02934 )
									ret := -0.750000 // sell
								if( d_k > 1.02934 )
									ret := -1.000000 // sell
					if( smoothK_k > 95.5885 )
						if( bullPower <= 0.009234 )
							if( bearPower <= -0.018218 )
								if( bbm <= 0.025557 )
									ret := -0.285714
								if( bbm > 0.025557 )
									ret := 0.600000
							if( bearPower > -0.018218 )
								if( bearPower <= -0.014656 )
									ret := 1.000000 // buy
								if( bearPower > -0.014656 )
									ret := 0.600000
						if( bullPower > 0.009234 )
							if( rsi1 <= 45.6875 )
								ret := -1.000000 // sell
							if( rsi1 > 45.6875 )
								ret := 0.500000
				if( k > 99.6243 )
					if( smoothK_k <= 96.9987 )
						if( bbp <= -0.008942 )
							if( bbm <= 0.012508 )
								ret := -0.500000
							if( bbm > 0.012508 )
								if( smoothK_k <= 96.7639 )
									ret := -0.857143 // sell
								if( smoothK_k > 96.7639 )
									ret := -1.000000 // sell
						if( bbp > -0.008942 )
							if( bbm <= 0.02701 )
								if( bbm <= 0.015133 )
									ret := -0.200000
								if( bbm > 0.015133 )
									ret := -1.000000 // sell
							if( bbm > 0.02701 )
								ret := 0.750000 // buy
					if( smoothK_k > 96.9987 )
						if( bullPower <= 0.008988 )
							if( bearPower <= -0.057234 )
								ret := -0.857143 // sell
							if( bearPower > -0.057234 )
								if( rsi1 <= 44.2867 )
									ret := 0.031250
								if( rsi1 > 44.2867 )
									ret := -0.247312
						if( bullPower > 0.008988 )
							if( rsi1 <= 68.219 )
								if( rsi1 <= 51.334 )
									ret := -0.500000
								if( rsi1 > 51.334 )
									ret := 1.000000 // buy
							if( rsi1 > 68.219 )
								ret := -1.000000 // sell
	if( bbp > -0.000798 )
		if( bearPower <= 0.013792 )
			if( d <= 69.4915 )
				if( bullPower <= 0.055183 )
					if( d_k <= -12.0446 )
						if( d_k <= -16.0066 )
							if( k <= 35.6833 )
								if( rsi1 <= 67.1197 )
									ret := -0.523077
								if( rsi1 > 67.1197 )
									ret := 0.400000
							if( k > 35.6833 )
								if( bearPower <= 0.000192 )
									ret := 0.106407
								if( bearPower > 0.000192 )
									ret := -0.066603
						if( d_k > -16.0066 )
							if( smoothK_k <= 71.5339 )
								if( rsi1 <= 57.2281 )
									ret := 0.148850
								if( rsi1 > 57.2281 )
									ret := 0.362637
							if( smoothK_k > 71.5339 )
								if( bearPower <= -0.020999 )
									ret := -1.000000 // sell
								if( bearPower > -0.020999 )
									ret := -0.095588
					if( d_k > -12.0446 )
						if( k <= 51.7333 )
							if( bearPower <= 0.007834 )
								if( d_k <= -5.46727 )
									ret := -0.073916
								if( d_k > -5.46727 )
									ret := 0.021533
							if( bearPower > 0.007834 )
								if( bbp <= 0.043191 )
									ret := -0.063250
								if( bbp > 0.043191 )
									ret := -0.256098
						if( k > 51.7333 )
							if( d <= 67.1462 )
								if( k <= 52.1509 )
									ret := -0.384615
								if( k > 52.1509 )
									ret := -0.069089
							if( d > 67.1462 )
								if( bullPower <= 0.006173 )
									ret := 0.166667
								if( bullPower > 0.006173 )
									ret := -0.279743
				if( bullPower > 0.055183 )
					if( rsi1 <= 55.5482 )
						if( smoothD_d <= 39.5359 )
							if( k <= 51.178 )
								if( bearPower <= 0.002299 )
									ret := 0.268908
								if( bearPower > 0.002299 )
									ret := -0.354839
							if( k > 51.178 )
								if( bbm <= 0.1425 )
									ret := 1.000000 // buy
								if( bbm > 0.1425 )
									ret := 0.750000 // buy
						if( smoothD_d > 39.5359 )
							if( d <= 49.5836 )
								if( rsi1 <= 50.537 )
									ret := -0.933333 // sell
								if( rsi1 > 50.537 )
									ret := -0.285714
							if( d > 49.5836 )
								if( smoothD_d <= 60.6428 )
									ret := 0.172414
								if( smoothD_d > 60.6428 )
									ret := -0.666667
					if( rsi1 > 55.5482 )
						if( bbm <= 0.057368 )
							if( d_k <= -3.57714 )
								if( smoothK_k <= 63.95 )
									ret := 0.391304
								if( smoothK_k > 63.95 )
									ret := -0.411765
							if( d_k > -3.57714 )
								if( d <= 62.0156 )
									ret := -0.703704 // sell
								if( d > 62.0156 )
									ret := 0.285714
						if( bbm > 0.057368 )
							if( bbp <= 0.055528 )
								if( smoothK_k <= 25.605 )
									ret := -0.333333
								if( smoothK_k > 25.605 )
									ret := -0.881579 // sell
							if( bbp > 0.055528 )
								if( rsi1 <= 65.9252 )
									ret := -0.241830
								if( rsi1 > 65.9252 )
									ret := -0.625000
			if( d > 69.4915 )
				if( k <= 77.3473 )
					if( bbm <= 0.030903 )
						if( d_k <= -4.60724 )
							if( rsi1 <= 57.8644 )
								if( bullPower <= 0.012978 )
									ret := 0.555556
								if( bullPower > 0.012978 )
									ret := 0.954545 // buy
							if( rsi1 > 57.8644 )
								if( bearPower <= 0.002718 )
									ret := 0.571429
								if( bearPower > 0.002718 )
									ret := -0.500000
						if( d_k > -4.60724 )
							if( rsi1 <= 66.8444 )
								if( rsi1 <= 63.3925 )
									ret := 0.024525
								if( rsi1 > 63.3925 )
									ret := 0.277551
							if( rsi1 > 66.8444 )
								if( smoothK_k <= 63.3828 )
									ret := 0.144444
								if( smoothK_k > 63.3828 )
									ret := -0.265306
					if( bbm > 0.030903 )
						if( k <= 73.0862 )
							if( rsi1 <= 57.1547 )
								if( d <= 81.8763 )
									ret := 0.088435
								if( d > 81.8763 )
									ret := 0.692308
							if( rsi1 > 57.1547 )
								if( smoothD_d <= 79.1717 )
									ret := 0.086486
								if( smoothD_d > 79.1717 )
									ret := -0.558140
						if( k > 73.0862 )
							if( bearPower <= -0.031804 )
								ret := -1.000000 // sell
							if( bearPower > -0.031804 )
								if( d <= 87.3931 )
									ret := 0.572650
								if( d > 87.3931 )
									ret := -0.222222
				if( k > 77.3473 )
					if( smoothK_k <= 77.8871 )
						if( smoothD_d <= 79.0381 )
							if( smoothD_d <= 76.9828 )
								if( bullPower <= 0.049234 )
									ret := -0.109375
								if( bullPower > 0.049234 )
									ret := -0.760000 // sell
							if( smoothD_d > 76.9828 )
								if( smoothD_d <= 78.5705 )
									ret := -0.696429
								if( smoothD_d > 78.5705 )
									ret := -0.200000
						if( smoothD_d > 79.0381 )
							if( smoothD_d <= 81.7417 )
								if( smoothK_k <= 76.5415 )
									ret := 0.030303
								if( smoothK_k > 76.5415 )
									ret := 0.489796
							if( smoothD_d > 81.7417 )
								if( bearPower <= -0.021077 )
									ret := 0.700000 // buy
								if( bearPower > -0.021077 )
									ret := -0.160156
					if( smoothK_k > 77.8871 )
						if( BBPower_Color <= 0.5 )
							if( bbm <= 0.041674 )
								if( rsi1 <= 55.9095 )
									ret := 0.085890
								if( rsi1 > 55.9095 )
									ret := 0.451049
							if( bbm > 0.041674 )
								if( d <= 92.8745 )
									ret := -0.102564
								if( d > 92.8745 )
									ret := -0.862069 // sell
						if( BBPower_Color > 0.5 )
							if( d_k <= 2.50287 )
								if( bullPower <= 0.035268 )
									ret := 0.011878
								if( bullPower > 0.035268 )
									ret := -0.090129
							if( d_k > 2.50287 )
								if( k <= 90.3444 )
									ret := 0.040000
								if( k > 90.3444 )
									ret := 0.238356
		if( bearPower > 0.013792 )
			if( bbm <= 0.009987 )
				if( smoothK_k <= 85.5908 )
					if( bullPower <= 0.025806 )
						if( rsi1 <= 47.0776 )
							if( d_k <= 3.83313 )
								if( bbm <= 0.000279 )
									ret := -0.555556
								if( bbm > 0.000279 )
									ret := -0.941176 // sell
							if( d_k > 3.83313 )
								if( d_k <= 10.6329 )
									ret := 0.166667
								if( d_k > 10.6329 )
									ret := -0.500000
						if( rsi1 > 47.0776 )
							if( d_k <= -29.1646 )
								if( bbp <= 0.046626 )
									ret := -1.000000 // sell
								if( bbp > 0.046626 )
									ret := -0.750000 // sell
							if( d_k > -29.1646 )
								if( d <= 38.5882 )
									ret := -0.050000
								if( d > 38.5882 )
									ret := -0.199438
					if( bullPower > 0.025806 )
						if( rsi1 <= 70.3981 )
							if( d_k <= -9.55331 )
								if( rsi1 <= 65.3582 )
									ret := -0.685714
								if( rsi1 > 65.3582 )
									ret := -0.333333
							if( d_k > -9.55331 )
								if( d_k <= -5.9996 )
									ret := -0.142857
								if( d_k > -5.9996 )
									ret := -0.512658
						if( rsi1 > 70.3981 )
							if( bbp <= 0.189746 )
								if( rsi1 <= 73.2306 )
									ret := 0.203125
								if( rsi1 > 73.2306 )
									ret := -0.213675
							if( bbp > 0.189746 )
								if( k <= 72.9424 )
									ret := -0.375000
								if( k > 72.9424 )
									ret := -1.000000 // sell
				if( smoothK_k > 85.5908 )
					if( smoothK_k <= 91.1687 )
						if( rsi1 <= 64.8732 )
							if( rsi1 <= 58.5994 )
								if( d_k <= -1.80801 )
									ret := 0.473684
								if( d_k > -1.80801 )
									ret := -0.588235
							if( rsi1 > 58.5994 )
								if( rsi1 <= 62.2684 )
									ret := -0.864865 // sell
								if( rsi1 > 62.2684 )
									ret := -0.066667
						if( rsi1 > 64.8732 )
							if( bullPower <= 0.02573 )
								if( bbm <= 0.00722 )
									ret := -0.085714
								if( bbm > 0.00722 )
									ret := 0.800000 // buy
							if( bullPower > 0.02573 )
								if( bbm <= 0.000794 )
									ret := 0.052632
								if( bbm > 0.000794 )
									ret := 0.581081
					if( smoothK_k > 91.1687 )
						if( rsi1 <= 51.5055 )
							if( d_k <= -5.92514 )
								ret := 0.857143 // buy
							if( d_k > -5.92514 )
								ret := 0.250000
						if( rsi1 > 51.5055 )
							if( bullPower <= 0.140018 )
								if( d_k <= 1.63951 )
									ret := -0.250000
								if( d_k > 1.63951 )
									ret := 0.187500
							if( bullPower > 0.140018 )
								ret := 0.800000 // buy
			if( bbm > 0.009987 )
				if( k <= 41.9405 )
					if( rsi1 <= 72.9523 )
						if( d_k <= 18.5857 )
							if( bearPower <= 0.028293 )
								if( smoothD_d <= 13.3344 )
									ret := -0.365385
								if( smoothD_d > 13.3344 )
									ret := -0.106628
							if( bearPower > 0.028293 )
								if( k <= 38.0928 )
									ret := -0.531646
								if( k > 38.0928 )
									ret := 0.055556
						if( d_k > 18.5857 )
							if( d_k <= 30.7477 )
								if( d <= 58.3101 )
									ret := -0.797297 // sell
								if( d > 58.3101 )
									ret := -0.214286
							if( d_k > 30.7477 )
								ret := 0.400000
					if( rsi1 > 72.9523 )
						if( k <= 29.2103 )
							if( d_k <= 3.74575 )
								if( smoothK_k <= 18.9746 )
									ret := 0.222222
								if( smoothK_k > 18.9746 )
									ret := -1.000000 // sell
							if( d_k > 3.74575 )
								if( k <= 27.6496 )
									ret := 0.388889
								if( k > 27.6496 )
									ret := 1.000000 // buy
						if( k > 29.2103 )
							if( smoothK_k <= 27.8895 )
								if( smoothK_k <= 26.9954 )
									ret := -0.500000
								if( smoothK_k > 26.9954 )
									ret := -1.000000 // sell
							if( smoothK_k > 27.8895 )
								if( d <= 24.4628 )
									ret := -0.692308
								if( d > 24.4628 )
									ret := 0.114286
				if( k > 41.9405 )
					if( rsi1 <= 86.1565 )
						if( smoothD_d <= 67.8529 )
							if( bearPower <= 0.064028 )
								if( d_k <= -8.8903 )
									ret := -0.147894
								if( d_k > -8.8903 )
									ret := 0.077473
							if( bearPower > 0.064028 )
								if( d_k <= -0.983458 )
									ret := -0.570000
								if( d_k > -0.983458 )
									ret := 0.235294
						if( smoothD_d > 67.8529 )
							if( smoothK_k <= 70.9472 )
								if( bullPower <= 0.053709 )
									ret := 0.127660
								if( bullPower > 0.053709 )
									ret := 0.480447
							if( smoothK_k > 70.9472 )
								if( smoothD_d <= 70.5091 )
									ret := 0.290909
								if( smoothD_d > 70.5091 )
									ret := -0.013880
					if( rsi1 > 86.1565 )
						if( bbp <= 0.07185 )
							if( smoothK_k <= 96.6224 )
								if( rsi1 <= 90.0279 )
									ret := -0.062500
								if( rsi1 > 90.0279 )
									ret := 0.405405
							if( smoothK_k > 96.6224 )
								if( bullPower <= 0.038061 )
									ret := -0.230769
								if( bullPower > 0.038061 )
									ret := -0.684211
						if( bbp > 0.07185 )
							if( k <= 97.0561 )
								if( smoothK_k <= 67.9688 )
									ret := 0.500000
								if( smoothK_k > 67.9688 )
									ret := -0.713178 // sell
							if( k > 97.0561 )
								if( bbp <= 0.132844 )
									ret := -0.162338
								if( bbp > 0.132844 )
									ret := -0.441489
	
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
float op_operation = decision_tree_0_LYFT_1Min_4dbde8fe(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


