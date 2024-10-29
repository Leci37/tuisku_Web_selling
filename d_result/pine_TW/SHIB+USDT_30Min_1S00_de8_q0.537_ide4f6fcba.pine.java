//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: SHIBUSDT_30Min_1S00_e4f6fcba Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SHIBUSDT_30Min_1S00_e4f6fcba", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SHIBUSDT_30Min_e4f6fcba(d_k, d, rsi1, k, smoothD_d, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( d_k <= 0.314957 )
		if( k <= 22.8216 )
			if( k <= 9.78472 )
				if( k <= 6.79271 )
					if( d_k <= -1.32245 )
						if( smoothD_d <= 0.010151 )
							if( k <= 5.85453 )
								if( smoothK_k <= 0.628517 )
									ret := -0.189189
								if( smoothK_k > 0.628517 )
									ret := -0.412946
							if( k > 5.85453 )
								if( k <= 5.99853 )
									ret := 0.470588
								if( k > 5.99853 )
									ret := -0.163265
						if( smoothD_d > 0.010151 )
							if( rsi1 <= 20.1185 )
								if( smoothD_d <= 1.07938 )
									ret := -0.375000
								if( smoothD_d > 1.07938 )
									ret := -0.866667 // sell
							if( rsi1 > 20.1185 )
								if( d <= 4.55612 )
									ret := -0.028881
								if( d > 4.55612 )
									ret := 0.406250
					if( d_k > -1.32245 )
						if( smoothK_k <= -0.163347 )
							if( smoothD_d <= -2.97104 )
								if( smoothK_k <= -2.97868 )
									ret := -0.269639
								if( smoothK_k > -2.97868 )
									ret := -0.750000 // sell
							if( smoothD_d > -2.97104 )
								if( k <= 1.90251 )
									ret := 0.005413
								if( k > 1.90251 )
									ret := -0.220974
						if( smoothK_k > -0.163347 )
							if( smoothD_d <= 2.40876 )
								if( smoothD_d <= 1.63898 )
									ret := 0.121339
								if( smoothD_d > 1.63898 )
									ret := 0.588542
							if( smoothD_d > 2.40876 )
								if( smoothD_d <= 3.50028 )
									ret := -0.143885
								if( smoothD_d > 3.50028 )
									ret := -0.700000 // sell
				if( k > 6.79271 )
					if( rsi1 <= 18.765 )
						if( smoothD_d <= 1.70362 )
							ret := 0.047619
						if( smoothD_d > 1.70362 )
							if( smoothD_d <= 2.22122 )
								ret := 1.000000 // buy
							if( smoothD_d > 2.22122 )
								ret := 0.692308
					if( rsi1 > 18.765 )
						if( rsi1 <= 25.6079 )
							if( k <= 9.23614 )
								if( d_k <= -2.67041 )
									ret := -0.764706 // sell
								if( d_k > -2.67041 )
									ret := -0.317073
							if( k > 9.23614 )
								if( d_k <= -3.31014 )
									ret := -0.416667
								if( d_k > -3.31014 )
									ret := 0.166667
						if( rsi1 > 25.6079 )
							if( smoothD_d <= -0.171866 )
								if( d_k <= -4.912 )
									ret := 0.600000
								if( d_k > -4.912 )
									ret := -0.250000
							if( smoothD_d > -0.171866 )
								if( d <= 5.33235 )
									ret := -0.371482
								if( d > 5.33235 )
									ret := -0.142450
			if( k > 9.78472 )
				if( rsi1 <= 29.1293 )
					if( rsi1 <= 18.0245 )
						if( rsi1 <= 15.8133 )
							ret := -0.533333
						if( rsi1 > 15.8133 )
							if( rsi1 <= 17.0855 )
								if( rsi1 <= 16.6465 )
									ret := 0.800000 // buy
								if( rsi1 > 16.6465 )
									ret := 0.916667 // buy
							if( rsi1 > 17.0855 )
								if( d_k <= -2.84496 )
									ret := 0.566667
								if( d_k > -2.84496 )
									ret := -0.800000 // sell
					if( rsi1 > 18.0245 )
						if( smoothK_k <= 9.242 )
							if( k <= 11.9915 )
								if( d_k <= -0.735617 )
									ret := -0.382514
								if( d_k > -0.735617 )
									ret := 0.789474 // buy
							if( k > 11.9915 )
								if( smoothD_d <= 6.07581 )
									ret := -0.450000
								if( smoothD_d > 6.07581 )
									ret := -0.900000 // sell
						if( smoothK_k > 9.242 )
							if( smoothD_d <= 16.4276 )
								if( d <= 15.5797 )
									ret := -0.043478
								if( d > 15.5797 )
									ret := -0.492754
							if( smoothD_d > 16.4276 )
								ret := 0.833333 // buy
				if( rsi1 > 29.1293 )
					if( d <= 14.3108 )
						if( d <= 13.1434 )
							if( smoothK_k <= 7.83457 )
								if( d_k <= -5.57304 )
									ret := -0.180000
								if( d_k > -5.57304 )
									ret := 0.419048
							if( smoothK_k > 7.83457 )
								if( smoothK_k <= 9.68314 )
									ret := -0.113669
								if( smoothK_k > 9.68314 )
									ret := 0.071204
						if( d > 13.1434 )
							if( smoothD_d <= 11.2 )
								if( smoothK_k <= 19.3626 )
									ret := 0.389241
								if( smoothK_k > 19.3626 )
									ret := -0.461538
							if( smoothD_d > 11.2 )
								if( smoothD_d <= 11.2258 )
									ret := 0.846154 // buy
								if( smoothD_d > 11.2258 )
									ret := 1.000000 // buy
					if( d > 14.3108 )
						if( d <= 17.3661 )
							if( rsi1 <= 46.1901 )
								if( d_k <= -0.601915 )
									ret := -0.155172
								if( d_k > -0.601915 )
									ret := 0.452830
							if( rsi1 > 46.1901 )
								if( d_k <= -4.97313 )
									ret := 0.243243
								if( d_k > -4.97313 )
									ret := -0.525714
						if( d > 17.3661 )
							if( smoothK_k <= 18.0501 )
								if( smoothK_k <= 17.6931 )
									ret := 0.131068
								if( smoothK_k > 17.6931 )
									ret := 0.725000 // buy
							if( smoothK_k > 18.0501 )
								if( smoothK_k <= 18.6507 )
									ret := -0.414286
								if( smoothK_k > 18.6507 )
									ret := 0.096154
		if( k > 22.8216 )
			if( d_k <= -6.68468 )
				if( k <= 77.8433 )
					if( d_k <= -23.996 )
						if( smoothD_d <= 25.1442 )
							if( k <= 50.9813 )
								if( d_k <= -25.2974 )
									ret := 0.812500 // buy
								if( d_k > -25.2974 )
									ret := 0.055556
							if( k > 50.9813 )
								if( d <= 24.9561 )
									ret := 0.000000
								if( d > 24.9561 )
									ret := -0.476190
						if( smoothD_d > 25.1442 )
							if( rsi1 <= 73.2693 )
								if( smoothK_k <= 70.6626 )
									ret := 0.464991
								if( smoothK_k > 70.6626 )
									ret := 0.138889
							if( rsi1 > 73.2693 )
								if( rsi1 <= 81.8517 )
									ret := 0.913043 // buy
								if( rsi1 > 81.8517 )
									ret := 0.400000
					if( d_k > -23.996 )
						if( d_k <= -9.41526 )
							if( d <= 53.0351 )
								if( smoothD_d <= 47.4794 )
									ret := 0.146555
								if( smoothD_d > 47.4794 )
									ret := 0.495781
							if( d > 53.0351 )
								if( d <= 54.134 )
									ret := -0.281879
								if( d > 54.134 )
									ret := 0.064401
						if( d_k > -9.41526 )
							if( k <= 24.494 )
								if( rsi1 <= 28.7818 )
									ret := -0.833333 // sell
								if( rsi1 > 28.7818 )
									ret := 0.570370
							if( k > 24.494 )
								if( smoothK_k <= 23.0933 )
									ret := 0.000000
								if( smoothK_k > 23.0933 )
									ret := 0.251344
				if( k > 77.8433 )
					if( d_k <= -20.9951 )
						if( smoothK_k <= 96.9993 )
							if( d_k <= -29.7466 )
								if( smoothD_d <= 47.4655 )
									ret := -0.703704 // sell
								if( smoothD_d > 47.4655 )
									ret := 0.097015
							if( d_k > -29.7466 )
								if( d <= 51.5636 )
									ret := -0.160000
								if( d > 51.5636 )
									ret := 0.515121
						if( smoothK_k > 96.9993 )
							if( d <= 69.9031 )
								if( rsi1 <= 62.1357 )
									ret := -0.166667
								if( rsi1 > 62.1357 )
									ret := 1.000000 // buy
							if( d > 69.9031 )
								if( d <= 74.6309 )
									ret := -0.592593
								if( d > 74.6309 )
									ret := 0.285714
					if( d_k > -20.9951 )
						if( rsi1 <= 59.3076 )
							if( k <= 92.7971 )
								if( d_k <= -9.37513 )
									ret := 0.233577
								if( d_k > -9.37513 )
									ret := 0.041162
							if( k > 92.7971 )
								if( d <= 80.143 )
									ret := -0.226744
								if( d > 80.143 )
									ret := 0.076404
						if( rsi1 > 59.3076 )
							if( smoothD_d <= 68.5062 )
								if( smoothK_k <= 84.5079 )
									ret := 0.572062
								if( smoothK_k > 84.5079 )
									ret := -0.029412
							if( smoothD_d > 68.5062 )
								if( d_k <= -19.6381 )
									ret := 0.826087 // buy
								if( d_k > -19.6381 )
									ret := 0.306351
			if( d_k > -6.68468 )
				if( smoothD_d <= 96.9381 )
					if( rsi1 <= 62.6521 )
						if( smoothD_d <= 96.141 )
							if( rsi1 <= 38.5183 )
								if( smoothK_k <= 56.5708 )
									ret := -0.033644
								if( smoothK_k > 56.5708 )
									ret := -0.179704
							if( rsi1 > 38.5183 )
								if( d <= 44.1702 )
									ret := 0.194798
								if( d > 44.1702 )
									ret := 0.010534
						if( smoothD_d > 96.141 )
							if( rsi1 <= 61.2924 )
								if( smoothK_k <= 96.6057 )
									ret := 0.238095
								if( smoothK_k > 96.6057 )
									ret := -0.607843
							if( rsi1 > 61.2924 )
								if( k <= 99.4581 )
									ret := -0.846154 // sell
								if( k > 99.4581 )
									ret := -1.000000 // sell
					if( rsi1 > 62.6521 )
						if( smoothK_k <= 78.7751 )
							if( smoothD_d <= 71.7011 )
								if( d <= 70.4695 )
									ret := 0.410319
								if( d > 70.4695 )
									ret := 0.650224
							if( smoothD_d > 71.7011 )
								if( smoothK_k <= 75.9009 )
									ret := -0.381443
								if( smoothK_k > 75.9009 )
									ret := 0.492891
						if( smoothK_k > 78.7751 )
							if( k <= 90.261 )
								if( rsi1 <= 81.6814 )
									ret := 0.045153
								if( rsi1 > 81.6814 )
									ret := 0.739130 // buy
							if( k > 90.261 )
								if( rsi1 <= 90.1577 )
									ret := 0.202999
								if( rsi1 > 90.1577 )
									ret := -0.276190
				if( smoothD_d > 96.9381 )
					if( d_k <= 0.014968 )
						if( d <= 99.9618 )
							ret := -0.285714
						if( d > 99.9618 )
							if( d <= 99.9863 )
								ret := 0.666667
							if( d > 99.9863 )
								ret := 0.247807
					if( d_k > 0.014968 )
						if( smoothK_k <= 96.8983 )
							ret := 0.800000 // buy
						if( smoothK_k > 96.8983 )
							ret := 1.000000 // buy
	if( d_k > 0.314957 )
		if( rsi1 <= 54.7993 )
			if( k <= 3.08689 )
				if( d <= 6.63322 )
					if( smoothD_d <= 2.1551 )
						if( smoothD_d <= 1.86738 )
							if( rsi1 <= 35.9432 )
								if( d <= 2.61926 )
									ret := -0.539427
								if( d > 2.61926 )
									ret := -0.335034
							if( rsi1 > 35.9432 )
								if( smoothK_k <= -0.390691 )
									ret := -0.131810
								if( smoothK_k > -0.390691 )
									ret := -0.700000 // sell
						if( smoothD_d > 1.86738 )
							if( k <= 1.19135 )
								if( d_k <= 4.91161 )
									ret := -0.906250 // sell
								if( d_k > 4.91161 )
									ret := -0.622642
							if( k > 1.19135 )
								if( d <= 5.05506 )
									ret := -0.625000
								if( d > 5.05506 )
									ret := 0.500000
					if( smoothD_d > 2.1551 )
						if( smoothK_k <= -0.038866 )
							if( smoothD_d <= 3.45482 )
								if( rsi1 <= 43.1928 )
									ret := -0.290456
								if( rsi1 > 43.1928 )
									ret := 0.344262
							if( smoothD_d > 3.45482 )
								if( smoothD_d <= 3.52248 )
									ret := 0.588235
								if( smoothD_d > 3.52248 )
									ret := -0.031250
						if( smoothK_k > -0.038866 )
							ret := 0.615385
				if( d > 6.63322 )
					if( rsi1 <= 27.6824 )
						if( smoothK_k <= -2.86621 )
							if( d_k <= 11.6036 )
								if( smoothK_k <= -2.96889 )
									ret := -0.279720
								if( smoothK_k > -2.96889 )
									ret := 0.266667
							if( d_k > 11.6036 )
								if( d_k <= 23.1248 )
									ret := -0.864078 // sell
								if( d_k > 23.1248 )
									ret := -0.300000
						if( smoothK_k > -2.86621 )
							if( d <= 7.34304 )
								if( smoothK_k <= -0.737444 )
									ret := 0.538462
								if( smoothK_k > -0.737444 )
									ret := -0.607143
							if( d > 7.34304 )
								if( d_k <= 17.5354 )
									ret := -0.814070 // sell
								if( d_k > 17.5354 )
									ret := -0.307692
					if( rsi1 > 27.6824 )
						if( d_k <= 5.87278 )
							if( rsi1 <= 31.8985 )
								ret := 0.583333
							if( rsi1 > 31.8985 )
								if( smoothD_d <= 4.51158 )
									ret := -0.707692 // sell
								if( smoothD_d > 4.51158 )
									ret := -0.948276 // sell
						if( d_k > 5.87278 )
							if( rsi1 <= 30.7632 )
								if( smoothD_d <= 14.6652 )
									ret := 0.193548
								if( smoothD_d > 14.6652 )
									ret := -0.692308
							if( rsi1 > 30.7632 )
								if( d_k <= 20.3502 )
									ret := -0.393342
								if( d_k > 20.3502 )
									ret := -0.063636
			if( k > 3.08689 )
				if( d_k <= 7.05423 )
					if( smoothD_d <= 1.52897 )
						if( smoothD_d <= 1.17972 )
							if( k <= 3.28553 )
								ret := 0.388889
							if( k > 3.28553 )
								if( smoothD_d <= 0.961199 )
									ret := 0.500000
								if( smoothD_d > 0.961199 )
									ret := -0.363636
						if( smoothD_d > 1.17972 )
							if( rsi1 <= 34.2831 )
								ret := 0.400000
							if( rsi1 > 34.2831 )
								if( smoothD_d <= 1.3725 )
									ret := 1.000000 // buy
								if( smoothD_d > 1.3725 )
									ret := 0.454545
					if( smoothD_d > 1.52897 )
						if( rsi1 <= 10.6372 )
							if( d_k <= 2.86784 )
								ret := 0.700000 // buy
							if( d_k > 2.86784 )
								if( smoothD_d <= 5.59807 )
									ret := 1.000000 // buy
								if( smoothD_d > 5.59807 )
									ret := 0.875000 // buy
						if( rsi1 > 10.6372 )
							if( smoothK_k <= 94.7434 )
								if( rsi1 <= 38.8878 )
									ret := -0.174524
								if( rsi1 > 38.8878 )
									ret := -0.090816
							if( smoothK_k > 94.7434 )
								if( smoothD_d <= 95.7611 )
									ret := 0.923077 // buy
								if( smoothD_d > 95.7611 )
									ret := 0.175000
				if( d_k > 7.05423 )
					if( k <= 29.5692 )
						if( k <= 21.9753 )
							if( smoothD_d <= 44.8806 )
								if( rsi1 <= 40.7792 )
									ret := -0.304168
								if( rsi1 > 40.7792 )
									ret := -0.135917
							if( smoothD_d > 44.8806 )
								if( smoothK_k <= 17.3525 )
									ret := -0.529412
								if( smoothK_k > 17.3525 )
									ret := -0.900000 // sell
						if( k > 21.9753 )
							if( rsi1 <= 51.6513 )
								if( smoothD_d <= 30.8678 )
									ret := -0.396396
								if( smoothD_d > 30.8678 )
									ret := -0.103870
							if( rsi1 > 51.6513 )
								if( rsi1 <= 54.3271 )
									ret := 0.342657
								if( rsi1 > 54.3271 )
									ret := -0.461538
					if( k > 29.5692 )
						if( rsi1 <= 40.7893 )
							if( k <= 37.6421 )
								if( rsi1 <= 23.8732 )
									ret := -0.813559 // sell
								if( rsi1 > 23.8732 )
									ret := -0.506518
							if( k > 37.6421 )
								if( rsi1 <= 22.3124 )
									ret := 0.301887
								if( rsi1 > 22.3124 )
									ret := -0.375758
						if( rsi1 > 40.7893 )
							if( smoothD_d <= 88.4714 )
								if( smoothK_k <= 76.7333 )
									ret := -0.207177
								if( smoothK_k > 76.7333 )
									ret := -0.636364
							if( smoothD_d > 88.4714 )
								if( d <= 92.582 )
									ret := 0.449275
								if( d > 92.582 )
									ret := -0.208696
		if( rsi1 > 54.7993 )
			if( d <= 94.6875 )
				if( smoothD_d <= 4.02307 )
					if( rsi1 <= 57.1901 )
						if( smoothD_d <= 1.29156 )
							if( smoothD_d <= -0.080592 )
								ret := -0.523810
							if( smoothD_d > -0.080592 )
								ret := -0.750000 // sell
						if( smoothD_d > 1.29156 )
							if( rsi1 <= 55.5992 )
								if( d <= 4.78432 )
									ret := 1.000000 // buy
								if( d > 4.78432 )
									ret := 0.142857
							if( rsi1 > 55.5992 )
								ret := -0.150000
					if( rsi1 > 57.1901 )
						if( d_k <= 1.22495 )
							ret := -0.083333
						if( d_k > 1.22495 )
							if( smoothD_d <= -0.166035 )
								ret := 0.300000
							if( smoothD_d > -0.166035 )
								if( d_k <= 2.79746 )
									ret := 0.962963 // buy
								if( d_k > 2.79746 )
									ret := 0.750000 // buy
				if( smoothD_d > 4.02307 )
					if( k <= 65.5277 )
						if( rsi1 <= 73.0138 )
							if( smoothK_k <= 59.5754 )
								if( d_k <= 5.86495 )
									ret := 0.091902
								if( d_k > 5.86495 )
									ret := -0.126203
							if( smoothK_k > 59.5754 )
								if( d_k <= 15.5349 )
									ret := -0.294416
								if( d_k > 15.5349 )
									ret := 0.447368
						if( rsi1 > 73.0138 )
							if( d_k <= 18.7235 )
								if( d <= 43.2089 )
									ret := 0.725806 // buy
								if( d > 43.2089 )
									ret := 0.262032
							if( d_k > 18.7235 )
								if( k <= 47.2553 )
									ret := -0.818182 // sell
								if( k > 47.2553 )
									ret := 0.692308
					if( k > 65.5277 )
						if( d_k <= 8.15518 )
							if( smoothD_d <= 68.8333 )
								if( k <= 67.2634 )
									ret := 0.263889
								if( k > 67.2634 )
									ret := 0.600000
							if( smoothD_d > 68.8333 )
								if( d <= 92.4336 )
									ret := 0.071925
								if( d > 92.4336 )
									ret := -0.129771
						if( d_k > 8.15518 )
							if( d <= 76.6637 )
								if( rsi1 <= 61.3161 )
									ret := 0.916667 // buy
								if( rsi1 > 61.3161 )
									ret := -0.250000
							if( d > 76.6637 )
								if( k <= 79.4468 )
									ret := -0.061538
								if( k > 79.4468 )
									ret := -0.275510
			if( d > 94.6875 )
				if( rsi1 <= 61.3334 )
					if( k <= 97.3019 )
						if( d_k <= 6.70905 )
							if( k <= 89.2258 )
								ret := -0.933333 // sell
							if( k > 89.2258 )
								if( smoothK_k <= 93.6468 )
									ret := -0.018519
								if( smoothK_k > 93.6468 )
									ret := 0.564103
						if( d_k > 6.70905 )
							if( smoothK_k <= 86.3475 )
								ret := 0.416667
							if( smoothK_k > 86.3475 )
								ret := 0.941176 // buy
					if( k > 97.3019 )
						if( d <= 99.1893 )
							if( k <= 97.5621 )
								ret := -1.000000 // sell
							if( k > 97.5621 )
								if( rsi1 <= 58.5172 )
									ret := -0.363636
								if( rsi1 > 58.5172 )
									ret := -0.888889 // sell
						if( d > 99.1893 )
							ret := -0.055556
				if( rsi1 > 61.3334 )
					if( d_k <= 5.02123 )
						if( smoothK_k <= 93.4146 )
							if( smoothK_k <= 90.9215 )
								if( rsi1 <= 75.9725 )
									ret := -0.104839
								if( rsi1 > 75.9725 )
									ret := 0.359223
							if( smoothK_k > 90.9215 )
								if( smoothD_d <= 94.2778 )
									ret := 0.184438
								if( smoothD_d > 94.2778 )
									ret := 0.503425
						if( smoothK_k > 93.4146 )
							if( smoothD_d <= 94.7386 )
								if( smoothK_k <= 94.1461 )
									ret := -0.843137 // sell
								if( smoothK_k > 94.1461 )
									ret := -0.222222
							if( smoothD_d > 94.7386 )
								if( smoothD_d <= 96.6687 )
									ret := 0.097625
								if( smoothD_d > 96.6687 )
									ret := 0.736842 // buy
					if( d_k > 5.02123 )
						if( d_k <= 5.82317 )
							if( d <= 96.1383 )
								if( d_k <= 5.14949 )
									ret := 0.619048
								if( d_k > 5.14949 )
									ret := 0.933333 // buy
							if( d > 96.1383 )
								if( smoothD_d <= 93.9812 )
									ret := 0.100000
								if( smoothD_d > 93.9812 )
									ret := 0.733333 // buy
						if( d_k > 5.82317 )
							if( rsi1 <= 74.9886 )
								if( k <= 88.581 )
									ret := 0.700000 // buy
								if( k > 88.581 )
									ret := 0.022727
							if( rsi1 > 74.9886 )
								if( smoothD_d <= 92.7956 )
									ret := 0.700000 // buy
								if( smoothD_d > 92.7956 )
									ret := 0.960000 // buy
	
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
float op_operation = decision_tree_0_SHIBUSDT_30Min_e4f6fcba(d_k, d, rsi1, k, smoothD_d, smoothK_k)

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


