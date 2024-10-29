//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: NVDA_30Min_2BS0_6ad6be36 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVDA_30Min_2BS0_6ad6be36", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVDA_30Min_6ad6be36(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( rsi1 <= 70.099 )
		if( d <= 3.8681 )
			if( d_k <= -0.309912 )
				if( bbm <= 0.749274 )
					if( k <= 7.58748 )
						if( rsi1 <= 8.98697 )
							if( bullPower <= -2.14101 )
								ret := -0.250000
							if( bullPower > -2.14101 )
								if( bbm <= 0.25315 )
									ret := 0.166667
								if( bbm > 0.25315 )
									ret := 1.000000 // buy
						if( rsi1 > 8.98697 )
							if( smoothD_d <= -2.01489 )
								if( bearPower <= -0.949674 )
									ret := 0.350877
								if( bearPower > -0.949674 )
									ret := -0.081633
							if( smoothD_d > -2.01489 )
								if( smoothK_k <= -0.398736 )
									ret := 0.438095
								if( smoothK_k > -0.398736 )
									ret := 0.192460
					if( k > 7.58748 )
						if( d <= 3.11591 )
							if( bullPower <= -0.511075 )
								ret := 0.000000
							if( bullPower > -0.511075 )
								if( bullPower <= -0.091826 )
									ret := -1.000000 // sell
								if( bullPower > -0.091826 )
									ret := -0.444444
						if( d > 3.11591 )
							if( smoothD_d <= 0.853931 )
								if( rsi1 <= 46.3052 )
									ret := -0.035714
								if( rsi1 > 46.3052 )
									ret := 0.250000
							if( smoothD_d > 0.853931 )
								ret := 0.750000 // buy
				if( bbm > 0.749274 )
					if( rsi1 <= 17.7814 )
						if( d_k <= -1.53196 )
							if( bbm <= 2.12361 )
								if( bearPower <= -3.02204 )
									ret := -0.133333
								if( bearPower > -3.02204 )
									ret := 0.766667 // buy
							if( bbm > 2.12361 )
								if( d <= 1.58264 )
									ret := 0.583333
								if( d > 1.58264 )
									ret := 0.875000 // buy
						if( d_k > -1.53196 )
							if( rsi1 <= 9.2961 )
								if( bbp <= -8.47729 )
									ret := 0.200000
								if( bbp > -8.47729 )
									ret := -0.800000 // sell
							if( rsi1 > 9.2961 )
								if( bbm <= 0.883804 )
									ret := 0.692308
								if( bbm > 0.883804 )
									ret := 0.108911
					if( rsi1 > 17.7814 )
						if( rsi1 <= 18.9262 )
							if( bearPower <= -3.00013 )
								if( d_k <= -2.19424 )
									ret := -0.750000 // sell
								if( d_k > -2.19424 )
									ret := -1.000000 // sell
							if( bearPower > -3.00013 )
								ret := 0.166667
						if( rsi1 > 18.9262 )
							if( d_k <= -1.35699 )
								if( bullPower <= 3.42182 )
									ret := 0.023064
								if( bullPower > 3.42182 )
									ret := -0.750000 // sell
							if( d_k > -1.35699 )
								if( k <= 1.09043 )
									ret := 0.366667
								if( k > 1.09043 )
									ret := -0.250704
			if( d_k > -0.309912 )
				if( bbm <= 1.43268 )
					if( bullPower <= -1.61282 )
						if( rsi1 <= 9.22048 )
							if( d <= 1.88945 )
								if( bbm <= 0.672749 )
									ret := 0.000000
								if( bbm > 0.672749 )
									ret := -0.555556
							if( d > 1.88945 )
								if( rsi1 <= 7.11723 )
									ret := -1.000000 // sell
								if( rsi1 > 7.11723 )
									ret := -0.500000
						if( rsi1 > 9.22048 )
							if( rsi1 <= 18.1205 )
								if( rsi1 <= 13.3102 )
									ret := 0.208333
								if( rsi1 > 13.3102 )
									ret := -0.256757
							if( rsi1 > 18.1205 )
								if( k <= 0.60957 )
									ret := 0.017241
								if( k > 0.60957 )
									ret := 0.489796
					if( bullPower > -1.61282 )
						if( bbp <= -3.21457 )
							if( smoothK_k <= -0.815345 )
								if( bbm <= 0.673747 )
									ret := -0.100000
								if( bbm > 0.673747 )
									ret := 0.564356
							if( smoothK_k > -0.815345 )
								if( k <= 2.73273 )
									ret := -0.666667
								if( k > 2.73273 )
									ret := 0.666667
						if( bbp > -3.21457 )
							if( d_k <= 0.787557 )
								if( smoothD_d <= -2.99741 )
									ret := -0.022472
								if( smoothD_d > -2.99741 )
									ret := 0.269231
							if( d_k > 0.787557 )
								if( k <= 2.1337 )
									ret := 0.033816
								if( k > 2.1337 )
									ret := -0.472222
				if( bbm > 1.43268 )
					if( bullPower <= -9.49916 )
						if( rsi1 <= 10.9995 )
							if( bullPower <= -15.2 )
								if( bullPower <= -144.204 )
									ret := 0.500000
								if( bullPower > -144.204 )
									ret := -0.357143
							if( bullPower > -15.2 )
								if( smoothK_k <= -2.96417 )
									ret := 1.000000 // buy
								if( smoothK_k > -2.96417 )
									ret := 0.750000 // buy
						if( rsi1 > 10.9995 )
							if( smoothD_d <= -2.76695 )
								if( rsi1 <= 16.1724 )
									ret := 0.666667
								if( rsi1 > 16.1724 )
									ret := -0.500000
							if( smoothD_d > -2.76695 )
								if( smoothD_d <= -0.80362 )
									ret := -0.843750 // sell
								if( smoothD_d > -0.80362 )
									ret := 0.285714
					if( bullPower > -9.49916 )
						if( rsi1 <= 10.6622 )
							if( bearPower <= -3.77737 )
								if( k <= 0.000811 )
									ret := 0.360656
								if( k > 0.000811 )
									ret := 0.721649 // buy
							if( bearPower > -3.77737 )
								if( d_k <= 0.353016 )
									ret := 0.125000
								if( d_k > 0.353016 )
									ret := -0.444444
						if( rsi1 > 10.6622 )
							if( rsi1 <= 13.628 )
								if( bbp <= -16.7297 )
									ret := 0.857143 // buy
								if( bbp > -16.7297 )
									ret := -0.418919
							if( rsi1 > 13.628 )
								if( d_k <= 0.000139 )
									ret := 0.070470
								if( d_k > 0.000139 )
									ret := 0.290012
		if( d > 3.8681 )
			if( bearPower <= -10.9271 )
				if( d_k <= 5.57226 )
					if( smoothK_k <= 24.9989 )
						if( d <= 9.45231 )
							if( bbm <= 9.67299 )
								if( smoothK_k <= 2.93605 )
									ret := 0.111111
								if( smoothK_k > 2.93605 )
									ret := 0.673913
							if( bbm > 9.67299 )
								if( bullPower <= 2.63588 )
									ret := -0.421053
								if( bullPower > 2.63588 )
									ret := 1.000000 // buy
						if( d > 9.45231 )
							if( bbm <= 3.93 )
								if( k <= 17.9658 )
									ret := 1.000000 // buy
								if( k > 17.9658 )
									ret := 0.750000 // buy
							if( bbm > 3.93 )
								if( rsi1 <= 38.6405 )
									ret := -0.651376
								if( rsi1 > 38.6405 )
									ret := 0.176471
					if( smoothK_k > 24.9989 )
						if( d <= 94.7006 )
							if( rsi1 <= 20.5517 )
								if( smoothD_d <= 29.4541 )
									ret := 0.250000
								if( smoothD_d > 29.4541 )
									ret := -0.909091 // sell
							if( rsi1 > 20.5517 )
								if( bearPower <= -40.2505 )
									ret := -0.363636
								if( bearPower > -40.2505 )
									ret := 0.545455
						if( d > 94.7006 )
							if( k <= 97.5594 )
								ret := -1.000000 // sell
							if( k > 97.5594 )
								if( bearPower <= -19.1416 )
									ret := -0.750000 // sell
								if( bearPower > -19.1416 )
									ret := -0.250000
				if( d_k > 5.57226 )
					if( smoothK_k <= 17.9315 )
						if( bbp <= -10.1504 )
							if( rsi1 <= 40.8579 )
								if( bbp <= -45.5123 )
									ret := -0.090909
								if( bbp > -45.5123 )
									ret := 0.688623
							if( rsi1 > 40.8579 )
								if( bullPower <= 0.365347 )
									ret := -0.466667
								if( bullPower > 0.365347 )
									ret := 1.000000 // buy
						if( bbp > -10.1504 )
							ret := -0.571429
					if( smoothK_k > 17.9315 )
						if( rsi1 <= 37.9179 )
							if( rsi1 <= 29.5059 )
								if( bbp <= -37.2213 )
									ret := -0.714286 // sell
								if( bbp > -37.2213 )
									ret := 0.306667
							if( rsi1 > 29.5059 )
								if( d <= 58.1344 )
									ret := -0.565217
								if( d > 58.1344 )
									ret := -0.033333
						if( rsi1 > 37.9179 )
							if( bullPower <= -6.77564 )
								if( bbp <= -27.984 )
									ret := -0.750000 // sell
								if( bbp > -27.984 )
									ret := 0.000000
							if( bullPower > -6.77564 )
								if( bbp <= -6.57677 )
									ret := 0.877193 // buy
								if( bbp > -6.57677 )
									ret := 0.500000
			if( bearPower > -10.9271 )
				if( bbp <= 6.78144 )
					if( bbp <= -3.64426 )
						if( bullPower <= -3.8069 )
							if( rsi1 <= 25.1501 )
								if( d <= 16.6889 )
									ret := 0.139535
								if( d > 16.6889 )
									ret := 0.466019
							if( rsi1 > 25.1501 )
								if( d <= 28.7909 )
									ret := -0.217391
								if( d > 28.7909 )
									ret := 0.148148
						if( bullPower > -3.8069 )
							if( d_k <= 21.7354 )
								if( smoothD_d <= 7.47327 )
									ret := 0.027640
								if( smoothD_d > 7.47327 )
									ret := -0.094452
							if( d_k > 21.7354 )
								if( bbm <= 8.81775 )
									ret := 0.090909
								if( bbm > 8.81775 )
									ret := 0.640000
					if( bbp > -3.64426 )
						if( smoothD_d <= 3.48081 )
							if( bbm <= 0.501153 )
								if( k <= 10.7923 )
									ret := 0.134146
								if( k > 10.7923 )
									ret := -0.235294
							if( bbm > 0.501153 )
								if( bbp <= -2.80587 )
									ret := 0.105556
								if( bbp > -2.80587 )
									ret := -0.184211
						if( smoothD_d > 3.48081 )
							if( d_k <= 20.8532 )
								if( rsi1 <= 21.9937 )
									ret := -0.087108
								if( rsi1 > 21.9937 )
									ret := 0.035546
							if( d_k > 20.8532 )
								if( smoothK_k <= 1.76938 )
									ret := 0.319372
								if( smoothK_k > 1.76938 )
									ret := 0.096695
				if( bbp > 6.78144 )
					if( rsi1 <= 67.6864 )
						if( smoothD_d <= 94.397 )
							if( smoothK_k <= 81.0163 )
								if( d <= 70.5852 )
									ret := -0.172932
								if( d > 70.5852 )
									ret := 0.244681
							if( smoothK_k > 81.0163 )
								if( rsi1 <= 59.9928 )
									ret := -0.200000
								if( rsi1 > 59.9928 )
									ret := -0.462406
						if( smoothD_d > 94.397 )
							if( bbp <= 13.5085 )
								if( bullPower <= 8.34713 )
									ret := 0.333333
								if( bullPower > 8.34713 )
									ret := 0.888889 // buy
							if( bbp > 13.5085 )
								if( bbp <= 22.9253 )
									ret := -0.500000
								if( bbp > 22.9253 )
									ret := -1.000000 // sell
					if( rsi1 > 67.6864 )
						if( d_k <= 4.90417 )
							if( smoothK_k <= 15.4683 )
								if( bbp <= 11.8963 )
									ret := -0.250000
								if( bbp > 11.8963 )
									ret := -1.000000 // sell
							if( smoothK_k > 15.4683 )
								if( d_k <= -6.86556 )
									ret := -0.131313
								if( d_k > -6.86556 )
									ret := 0.274074
						if( d_k > 4.90417 )
							if( bbp <= 7.07491 )
								ret := 0.000000
							if( bbp > 7.07491 )
								if( rsi1 <= 69.8911 )
									ret := 0.756098 // buy
								if( rsi1 > 69.8911 )
									ret := 0.300000
	if( rsi1 > 70.099 )
		if( bearPower <= 6.13865 )
			if( smoothK_k <= 19.5417 )
				if( smoothK_k <= 12.8169 )
					if( bearPower <= 1.65116 )
						if( smoothD_d <= 6.48195 )
							if( bearPower <= 0.801579 )
								if( bbm <= 0.385994 )
									ret := 0.142857
								if( bbm > 0.385994 )
									ret := 0.791045 // buy
							if( bearPower > 0.801579 )
								if( rsi1 <= 80.8879 )
									ret := 0.117647
								if( rsi1 > 80.8879 )
									ret := 0.750000 // buy
						if( smoothD_d > 6.48195 )
							if( d_k <= 10.4131 )
								if( d <= 19.2096 )
									ret := 0.109890
								if( d > 19.2096 )
									ret := -0.692308
							if( d_k > 10.4131 )
								if( d_k <= 12.8247 )
									ret := 0.888889 // buy
								if( d_k > 12.8247 )
									ret := 0.184783
					if( bearPower > 1.65116 )
						if( bbp <= 8.43807 )
							if( d_k <= -2.81833 )
								ret := 0.600000
							if( d_k > -2.81833 )
								if( d_k <= -0.202185 )
									ret := -1.000000 // sell
								if( d_k > -0.202185 )
									ret := -0.285714
						if( bbp > 8.43807 )
							if( bbm <= 3.39132 )
								if( bullPower <= 6.41789 )
									ret := 0.000000
								if( bullPower > 6.41789 )
									ret := -0.600000
							if( bbm > 3.39132 )
								if( bullPower <= 8.40393 )
									ret := 1.000000 // buy
								if( bullPower > 8.40393 )
									ret := 0.333333
				if( smoothK_k > 12.8169 )
					if( rsi1 <= 76.1567 )
						if( bearPower <= -0.362624 )
							if( bullPower <= 2.1617 )
								ret := 0.285714
							if( bullPower > 2.1617 )
								if( rsi1 <= 71.2287 )
									ret := 0.750000 // buy
								if( rsi1 > 71.2287 )
									ret := 1.000000 // buy
						if( bearPower > -0.362624 )
							if( bbm <= 1.88275 )
								if( smoothK_k <= 14.8715 )
									ret := 0.750000 // buy
								if( smoothK_k > 14.8715 )
									ret := 0.145161
							if( bbm > 1.88275 )
								if( smoothK_k <= 18.5108 )
									ret := -0.031250
								if( smoothK_k > 18.5108 )
									ret := -1.000000 // sell
					if( rsi1 > 76.1567 )
						if( bbm <= 0.989812 )
							if( bbp <= 6.91506 )
								if( bbm <= 0.311422 )
									ret := 0.300000
								if( bbm > 0.311422 )
									ret := 0.777778 // buy
							if( bbp > 6.91506 )
								ret := -0.250000
						if( bbm > 0.989812 )
							if( rsi1 <= 78.4499 )
								if( bbm <= 3.08353 )
									ret := 0.400000
								if( bbm > 3.08353 )
									ret := 1.000000 // buy
							if( rsi1 > 78.4499 )
								if( smoothK_k <= 15.4956 )
									ret := 0.818182 // buy
								if( smoothK_k > 15.4956 )
									ret := 1.000000 // buy
			if( smoothK_k > 19.5417 )
				if( rsi1 <= 89.0753 )
					if( smoothD_d <= 96.8653 )
						if( k <= 79.0137 )
							if( smoothK_k <= 41.3588 )
								if( smoothD_d <= 17.4754 )
									ret := -0.145985
								if( smoothD_d > 17.4754 )
									ret := 0.210938
							if( smoothK_k > 41.3588 )
								if( d <= 27.5826 )
									ret := -0.511111
								if( d > 27.5826 )
									ret := 0.010358
						if( k > 79.0137 )
							if( d_k <= -1.08612 )
								if( smoothD_d <= 77.1008 )
									ret := 0.183437
								if( smoothD_d > 77.1008 )
									ret := 0.014338
							if( d_k > -1.08612 )
								if( bbp <= -0.470109 )
									ret := 0.586667
								if( bbp > -0.470109 )
									ret := 0.145514
					if( smoothD_d > 96.8653 )
						if( bbp <= 3.41912 )
							if( bbp <= 2.69667 )
								if( bearPower <= 0.348928 )
									ret := 0.173913
								if( bearPower > 0.348928 )
									ret := -0.231884
							if( bbp > 2.69667 )
								if( bullPower <= 2.00837 )
									ret := 0.562500
								if( bullPower > 2.00837 )
									ret := 0.062500
						if( bbp > 3.41912 )
							if( smoothK_k <= 96.9975 )
								if( bbm <= 4.04446 )
									ret := -0.853659 // sell
								if( bbm > 4.04446 )
									ret := 0.250000
							if( smoothK_k > 96.9975 )
								if( bbm <= 4.25916 )
									ret := -0.428571
								if( bbm > 4.25916 )
									ret := 0.235294
				if( rsi1 > 89.0753 )
					if( d <= 87.3646 )
						if( smoothD_d <= 78.1961 )
							if( bbp <= 8.53028 )
								if( smoothK_k <= 37.6065 )
									ret := 1.000000 // buy
								if( smoothK_k > 37.6065 )
									ret := 0.214286
							if( bbp > 8.53028 )
								if( k <= 81.7856 )
									ret := 0.066667
								if( k > 81.7856 )
									ret := -0.545455
						if( smoothD_d > 78.1961 )
							if( smoothK_k <= 92.7445 )
								if( k <= 87.2934 )
									ret := -0.055556
								if( k > 87.2934 )
									ret := -0.695652
							if( smoothK_k > 92.7445 )
								if( bbm <= 1.095 )
									ret := 0.000000
								if( bbm > 1.095 )
									ret := 0.250000
					if( d > 87.3646 )
						if( rsi1 <= 93.6978 )
							if( bullPower <= 5.00558 )
								if( bbm <= 2.26559 )
									ret := 0.338809
								if( bbm > 2.26559 )
									ret := -0.107143
							if( bullPower > 5.00558 )
								if( rsi1 <= 90.6482 )
									ret := 0.691358
								if( rsi1 > 90.6482 )
									ret := 0.369565
						if( rsi1 > 93.6978 )
							if( bbm <= 2.02798 )
								if( bearPower <= 0.819148 )
									ret := 0.529412
								if( bearPower > 0.819148 )
									ret := 0.096000
							if( bbm > 2.02798 )
								if( bullPower <= 7.21716 )
									ret := -0.515152
								if( bullPower > 7.21716 )
									ret := -0.038462
		if( bearPower > 6.13865 )
			if( rsi1 <= 93.9782 )
				if( bbm <= 0.554217 )
					if( bullPower <= 7.43945 )
						ret := 0.000000
					if( bullPower > 7.43945 )
						if( bbm <= 0.309148 )
							ret := -0.750000 // sell
						if( bbm > 0.309148 )
							ret := -1.000000 // sell
				if( bbm > 0.554217 )
					if( k <= 99.9943 )
						if( d <= 76.7085 )
							if( rsi1 <= 86.5177 )
								if( k <= 62.628 )
									ret := 0.426471
								if( k > 62.628 )
									ret := -0.215190
							if( rsi1 > 86.5177 )
								if( bearPower <= 11.7845 )
									ret := 0.888889 // buy
								if( bearPower > 11.7845 )
									ret := -1.000000 // sell
						if( d > 76.7085 )
							if( bearPower <= 24.8376 )
								if( k <= 99.0738 )
									ret := 0.484375
								if( k > 99.0738 )
									ret := 0.732558 // buy
							if( bearPower > 24.8376 )
								if( bbp <= 71.6882 )
									ret := -1.000000 // sell
								if( bbp > 71.6882 )
									ret := 0.166667
					if( k > 99.9943 )
						if( bullPower <= 14.1759 )
							if( bbm <= 3.49156 )
								if( smoothD_d <= 90.6951 )
									ret := -0.500000
								if( smoothD_d > 90.6951 )
									ret := 0.181818
							if( bbm > 3.49156 )
								if( rsi1 <= 85.5491 )
									ret := -0.916667 // sell
								if( rsi1 > 85.5491 )
									ret := -0.375000
						if( bullPower > 14.1759 )
							if( smoothD_d <= 75.821 )
								ret := 1.000000 // buy
							if( smoothD_d > 75.821 )
								if( bullPower <= 15.0679 )
									ret := 0.666667
								if( bullPower > 15.0679 )
									ret := 0.000000
			if( rsi1 > 93.9782 )
				if( d <= 99.5622 )
					if( bbm <= 5.04676 )
						if( d_k <= -3.7236 )
							ret := 0.750000 // buy
						if( d_k > -3.7236 )
							if( k <= 98.7233 )
								ret := 0.000000
							if( k > 98.7233 )
								ret := -0.333333
					if( bbm > 5.04676 )
						if( bbm <= 11.625 )
							if( bearPower <= 10.7082 )
								ret := -0.500000
							if( bearPower > 10.7082 )
								if( d_k <= -3.72124 )
									ret := -0.750000 // sell
								if( d_k > -3.72124 )
									ret := -1.000000 // sell
						if( bbm > 11.625 )
							ret := -0.250000
				if( d > 99.5622 )
					if( smoothK_k <= 96.9999 )
						if( bbm <= 6.39107 )
							ret := 0.400000
						if( bbm > 6.39107 )
							ret := 1.000000 // buy
					if( smoothK_k > 96.9999 )
						if( smoothD_d <= 96.9651 )
							ret := -0.600000
						if( smoothD_d > 96.9651 )
							ret := 0.166667
	
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
float op_operation = decision_tree_0_NVDA_30Min_6ad6be36(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


