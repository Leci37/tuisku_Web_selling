//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: TRXUSDT_15Min_2SV0_0ac0f013 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_15Min_2SV0_0ac0f013", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_15Min_0ac0f013(d_k, d, rsi1, k, smoothD_d, smoothK_k, VIP_VIM, VIM, VIP)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( rsi1 <= 45.5819 )
		if( VIM <= 1.0106 )
			if( smoothK_k <= 37.2019 )
				if( VIP <= 0.978155 )
					if( rsi1 <= 40.5328 )
						if( smoothK_k <= 6.26946 )
							if( rsi1 <= 22.7743 )
								if( smoothK_k <= -1.08413 )
									ret := -0.930435 // sell
								if( smoothK_k > -1.08413 )
									ret := -0.500000
							if( rsi1 > 22.7743 )
								if( VIP <= 0.923237 )
									ret := -0.413793
								if( VIP > 0.923237 )
									ret := -0.700787 // sell
						if( smoothK_k > 6.26946 )
							if( VIP_VIM <= -0.112594 )
								if( smoothK_k <= 16.2166 )
									ret := 0.450000
								if( smoothK_k > 16.2166 )
									ret := -0.500000
							if( VIP_VIM > -0.112594 )
								if( VIP_VIM <= -0.099164 )
									ret := -0.960000 // sell
								if( VIP_VIM > -0.099164 )
									ret := -0.438889
					if( rsi1 > 40.5328 )
						if( smoothK_k <= 14.1951 )
							if( smoothD_d <= 3.81636 )
								if( k <= 2.09817 )
									ret := 0.333333
								if( k > 2.09817 )
									ret := -0.777778 // sell
							if( smoothD_d > 3.81636 )
								if( VIP_VIM <= -0.025253 )
									ret := 0.500000
								if( VIP_VIM > -0.025253 )
									ret := 0.065217
						if( smoothK_k > 14.1951 )
							if( d <= 30.0549 )
								if( VIP_VIM <= -0.05104 )
									ret := -0.228571
								if( VIP_VIM > -0.05104 )
									ret := -0.628571
							if( d > 30.0549 )
								if( rsi1 <= 44.9095 )
									ret := -0.411765
								if( rsi1 > 44.9095 )
									ret := 0.500000
				if( VIP > 0.978155 )
					if( d <= 13.2028 )
						if( rsi1 <= 38.7011 )
							if( smoothD_d <= 7.54743 )
								if( d <= 2.45378 )
									ret := -0.828642 // sell
								if( d > 2.45378 )
									ret := -0.745931 // sell
							if( smoothD_d > 7.54743 )
								if( k <= 0.009907 )
									ret := -0.740741 // sell
								if( k > 0.009907 )
									ret := -0.937255 // sell
						if( rsi1 > 38.7011 )
							if( VIP <= 1.05005 )
								if( d_k <= 1.38911 )
									ret := -0.535354
								if( d_k > 1.38911 )
									ret := -0.305970
							if( VIP > 1.05005 )
								if( VIP <= 1.26394 )
									ret := -0.625342
								if( VIP > 1.26394 )
									ret := -0.896226 // sell
					if( d > 13.2028 )
						if( rsi1 <= 39.9988 )
							if( VIP <= 1.08353 )
								if( rsi1 <= 32.5004 )
									ret := -0.778986 // sell
								if( rsi1 > 32.5004 )
									ret := -0.588542
							if( VIP > 1.08353 )
								if( rsi1 <= 32.2106 )
									ret := -0.866667 // sell
								if( rsi1 > 32.2106 )
									ret := -0.734649 // sell
						if( rsi1 > 39.9988 )
							if( rsi1 <= 40.0077 )
								if( d_k <= 4.81593 )
									ret := -0.285714
								if( d_k > 4.81593 )
									ret := 0.068966
							if( rsi1 > 40.0077 )
								if( rsi1 <= 42.8475 )
									ret := -0.595707
								if( rsi1 > 42.8475 )
									ret := -0.437028
			if( smoothK_k > 37.2019 )
				if( VIM <= 0.986424 )
					if( smoothK_k <= 53.813 )
						if( VIP <= 0.944754 )
							if( d_k <= 5.02698 )
								ret := 0.000000
							if( d_k > 5.02698 )
								if( k <= 44.6542 )
									ret := 0.909091 // buy
								if( k > 44.6542 )
									ret := 0.076923
						if( VIP > 0.944754 )
							if( k <= 40.8394 )
								ret := -0.812500 // sell
							if( k > 40.8394 )
								if( k <= 55.8387 )
									ret := -0.292181
								if( k > 55.8387 )
									ret := 0.250000
					if( smoothK_k > 53.813 )
						if( k <= 70.451 )
							if( d <= 66.1322 )
								if( rsi1 <= 44.5984 )
									ret := -0.977778 // sell
								if( rsi1 > 44.5984 )
									ret := -0.650000
							if( d > 66.1322 )
								if( smoothD_d <= 72.8693 )
									ret := -0.062500
								if( smoothD_d > 72.8693 )
									ret := -0.619565
						if( k > 70.451 )
							if( rsi1 <= 44.6854 )
								if( rsi1 <= 43.9472 )
									ret := -0.111111
								if( rsi1 > 43.9472 )
									ret := 0.538462
							if( rsi1 > 44.6854 )
								ret := -0.647059
				if( VIM > 0.986424 )
					if( k <= 40.5637 )
						ret := 0.733333 // buy
					if( k > 40.5637 )
						if( smoothD_d <= 89.203 )
							if( smoothD_d <= 78.6592 )
								if( d_k <= 13.9734 )
									ret := -0.262222
								if( d_k > 13.9734 )
									ret := 0.140845
							if( smoothD_d > 78.6592 )
								if( d <= 83.8023 )
									ret := 0.800000 // buy
								if( d > 83.8023 )
									ret := -0.033333
						if( smoothD_d > 89.203 )
							ret := -1.000000 // sell
		if( VIM > 1.0106 )
			if( k <= 18.2573 )
				if( d_k <= 0.930927 )
					if( smoothK_k <= -1.16221 )
						if( VIP_VIM <= -0.954112 )
							if( rsi1 <= 3.12671 )
								ret := -0.750000 // sell
							if( rsi1 > 3.12671 )
								if( VIP <= 0.428637 )
									ret := 1.000000 // buy
								if( VIP > 0.428637 )
									ret := 0.000000
						if( VIP_VIM > -0.954112 )
							if( VIP_VIM <= -0.50609 )
								if( rsi1 <= 17.4697 )
									ret := -0.576826
								if( rsi1 > 17.4697 )
									ret := 0.192771
							if( VIP_VIM > -0.50609 )
								if( k <= 1.67625 )
									ret := -0.603919
								if( k > 1.67625 )
									ret := -0.909091 // sell
					if( smoothK_k > -1.16221 )
						if( d_k <= -1.61796 )
							if( rsi1 <= 23.9866 )
								if( VIM <= 1.32023 )
									ret := -0.755837 // sell
								if( VIM > 1.32023 )
									ret := -0.346809
							if( rsi1 > 23.9866 )
								if( rsi1 <= 35.3492 )
									ret := -0.285573
								if( rsi1 > 35.3492 )
									ret := -0.101072
						if( d_k > -1.61796 )
							if( VIM <= 1.09149 )
								if( rsi1 <= 33.302 )
									ret := -0.649842
								if( rsi1 > 33.302 )
									ret := -0.179144
							if( VIM > 1.09149 )
								if( d <= 16.2878 )
									ret := -0.103044
								if( d > 16.2878 )
									ret := -0.686747
				if( d_k > 0.930927 )
					if( smoothK_k <= -2.7224 )
						if( rsi1 <= 22.8977 )
							if( VIP <= 0.738254 )
								if( d_k <= 1.63937 )
									ret := -0.539683
								if( d_k > 1.63937 )
									ret := -0.011719
							if( VIP > 0.738254 )
								if( rsi1 <= 19.6534 )
									ret := -0.898507 // sell
								if( rsi1 > 19.6534 )
									ret := -0.483333
						if( rsi1 > 22.8977 )
							if( VIP_VIM <= -0.439228 )
								if( smoothD_d <= -0.780528 )
									ret := 0.187500
								if( smoothD_d > -0.780528 )
									ret := 0.701923 // buy
							if( VIP_VIM > -0.439228 )
								if( VIP_VIM <= -0.089738 )
									ret := -0.052147
								if( VIP_VIM > -0.089738 )
									ret := -0.557692
					if( smoothK_k > -2.7224 )
						if( VIP <= 0.904911 )
							if( VIP_VIM <= -0.906328 )
								if( smoothD_d <= 3.2456 )
									ret := 0.916667 // buy
								if( smoothD_d > 3.2456 )
									ret := 0.666667
							if( VIP_VIM > -0.906328 )
								if( VIP <= 0.568028 )
									ret := -0.711111 // sell
								if( VIP > 0.568028 )
									ret := -0.006210
						if( VIP > 0.904911 )
							if( VIP <= 0.964441 )
								if( rsi1 <= 35.6911 )
									ret := -0.641079
								if( rsi1 > 35.6911 )
									ret := -0.013483
							if( VIP > 0.964441 )
								if( rsi1 <= 41.7847 )
									ret := -0.572193
								if( rsi1 > 41.7847 )
									ret := -0.037500
			if( k > 18.2573 )
				if( VIP_VIM <= -0.35571 )
					if( smoothD_d <= 15.9447 )
						if( d_k <= -12.6999 )
							if( d_k <= -15.3005 )
								if( VIM <= 1.24824 )
									ret := 0.071429
								if( VIM > 1.24824 )
									ret := -0.535714
							if( d_k > -15.3005 )
								if( VIP_VIM <= -0.449383 )
									ret := -0.773810 // sell
								if( VIP_VIM > -0.449383 )
									ret := -0.187500
						if( d_k > -12.6999 )
							if( VIM <= 1.39344 )
								if( d <= 10.4591 )
									ret := -0.451613
								if( d > 10.4591 )
									ret := 0.068452
							if( VIM > 1.39344 )
								if( VIP <= 0.580734 )
									ret := -0.581395
								if( VIP > 0.580734 )
									ret := -0.136364
					if( smoothD_d > 15.9447 )
						if( d_k <= 3.87536 )
							if( VIP <= 0.651268 )
								if( d <= 38.3461 )
									ret := 0.105263
								if( d > 38.3461 )
									ret := 0.408907
							if( VIP > 0.651268 )
								if( smoothD_d <= 50.3233 )
									ret := 0.043253
								if( smoothD_d > 50.3233 )
									ret := 0.196712
						if( d_k > 3.87536 )
							if( smoothD_d <= 24.6604 )
								if( VIP_VIM <= -0.398228 )
									ret := 0.878049 // buy
								if( VIP_VIM > -0.398228 )
									ret := -0.428571
							if( smoothD_d > 24.6604 )
								if( rsi1 <= 28.2285 )
									ret := -0.412475
								if( rsi1 > 28.2285 )
									ret := 0.152700
				if( VIP_VIM > -0.35571 )
					if( smoothK_k <= 95.1937 )
						if( VIP_VIM <= -0.064072 )
							if( rsi1 <= 33.2326 )
								if( VIP <= 0.848236 )
									ret := -0.247801
								if( VIP > 0.848236 )
									ret := -0.568042
							if( rsi1 > 33.2326 )
								if( smoothK_k <= 91.5182 )
									ret := -0.038884
								if( smoothK_k > 91.5182 )
									ret := -0.429864
						if( VIP_VIM > -0.064072 )
							if( smoothK_k <= 41.8219 )
								if( rsi1 <= 36.0238 )
									ret := -0.779221 // sell
								if( rsi1 > 36.0238 )
									ret := -0.322115
							if( smoothK_k > 41.8219 )
								if( d <= 93.0925 )
									ret := -0.130705
								if( d > 93.0925 )
									ret := 0.607143
					if( smoothK_k > 95.1937 )
						if( d_k <= -15.7088 )
							if( VIP <= 0.898052 )
								ret := 0.941176 // buy
							if( VIP > 0.898052 )
								ret := 0.600000
						if( d_k > -15.7088 )
							if( d_k <= -7.3033 )
								if( rsi1 <= 42.8458 )
									ret := 0.142857
								if( rsi1 > 42.8458 )
									ret := -0.769231 // sell
							if( d_k > -7.3033 )
								if( VIM <= 1.18409 )
									ret := 0.557143
								if( VIM > 1.18409 )
									ret := -0.500000
	if( rsi1 > 45.5819 )
		if( smoothK_k <= 57.4624 )
			if( k <= 22.4521 )
				if( VIP <= 1.05949 )
					if( VIM <= 1.0189 )
						if( d <= 11.777 )
							if( d_k <= 4.12033 )
								if( VIM <= 0.970093 )
									ret := -0.341772
								if( VIM > 0.970093 )
									ret := -0.146154
							if( d_k > 4.12033 )
								if( VIM <= 1.0031 )
									ret := 0.051020
								if( VIM > 1.0031 )
									ret := 0.944444 // buy
						if( d > 11.777 )
							if( VIP_VIM <= 0.082341 )
								if( smoothK_k <= 18.4293 )
									ret := 0.020768
								if( smoothK_k > 18.4293 )
									ret := 0.436170
							if( VIP_VIM > 0.082341 )
								if( k <= 21.8762 )
									ret := 0.315920
								if( k > 21.8762 )
									ret := -0.562500
					if( VIM > 1.0189 )
						if( smoothD_d <= 12.6688 )
							if( k <= 6.75016 )
								if( smoothD_d <= 10.1219 )
									ret := 0.304762
								if( smoothD_d > 10.1219 )
									ret := -0.923077 // sell
							if( k > 6.75016 )
								if( d_k <= 1.76357 )
									ret := 0.023091
								if( d_k > 1.76357 )
									ret := -0.560976
						if( smoothD_d > 12.6688 )
							if( smoothK_k <= 12.8251 )
								if( smoothK_k <= 6.00296 )
									ret := 0.862069 // buy
								if( smoothK_k > 6.00296 )
									ret := 0.428571
							if( smoothK_k > 12.8251 )
								if( smoothD_d <= 22.3096 )
									ret := 0.283951
								if( smoothD_d > 22.3096 )
									ret := -0.208333
				if( VIP > 1.05949 )
					if( smoothD_d <= 41.3213 )
						if( rsi1 <= 58.1841 )
							if( VIP_VIM <= 0.371754 )
								if( d_k <= 5.82878 )
									ret := -0.352302
								if( d_k > 5.82878 )
									ret := -0.109040
							if( VIP_VIM > 0.371754 )
								if( smoothK_k <= -1.21425 )
									ret := -0.344729
								if( smoothK_k > -1.21425 )
									ret := -0.577299
						if( rsi1 > 58.1841 )
							if( VIP_VIM <= 0.627715 )
								if( k <= 1.58895 )
									ret := 0.291005
								if( k > 1.58895 )
									ret := -0.016486
							if( VIP_VIM > 0.627715 )
								if( rsi1 <= 67.2117 )
									ret := -0.631579
								if( rsi1 > 67.2117 )
									ret := -0.112500
					if( smoothD_d > 41.3213 )
						if( d_k <= 28.969 )
							if( d_k <= 25.6378 )
								if( smoothK_k <= 18.646 )
									ret := -0.111111
								if( smoothK_k > 18.646 )
									ret := 0.642857
							if( d_k > 25.6378 )
								if( VIM <= 0.787248 )
									ret := 0.857143 // buy
								if( VIM > 0.787248 )
									ret := 0.500000
						if( d_k > 28.969 )
							if( VIP <= 1.19894 )
								ret := -0.071429
							if( VIP > 1.19894 )
								ret := 0.200000
			if( k > 22.4521 )
				if( VIP <= 0.948295 )
					if( smoothD_d <= 13.7673 )
						if( VIP_VIM <= -0.171418 )
							if( VIM <= 1.12032 )
								if( k <= 27.2868 )
									ret := 0.250000
								if( k > 27.2868 )
									ret := 0.428571
							if( VIM > 1.12032 )
								if( rsi1 <= 48.5692 )
									ret := 0.000000
								if( rsi1 > 48.5692 )
									ret := -0.500000
						if( VIP_VIM > -0.171418 )
							if( VIP_VIM <= -0.143279 )
								if( VIP <= 0.915589 )
									ret := -0.857143 // sell
								if( VIP > 0.915589 )
									ret := -0.578947
							if( VIP_VIM > -0.143279 )
								if( d <= 11.873 )
									ret := -0.800000 // sell
								if( d > 11.873 )
									ret := -0.012821
					if( smoothD_d > 13.7673 )
						if( d_k <= -20.048 )
							if( d <= 36.8885 )
								if( d <= 21.1253 )
									ret := 0.371429
								if( d > 21.1253 )
									ret := -0.108333
							if( d > 36.8885 )
								ret := 0.647059
						if( d_k > -20.048 )
							if( rsi1 <= 47.6456 )
								if( VIP <= 0.82236 )
									ret := 0.894737 // buy
								if( VIP > 0.82236 )
									ret := 0.203358
							if( rsi1 > 47.6456 )
								if( rsi1 <= 51.2301 )
									ret := 0.456044
								if( rsi1 > 51.2301 )
									ret := 0.608456
				if( VIP > 0.948295 )
					if( rsi1 <= 66.7839 )
						if( VIP_VIM <= 0.269268 )
							if( VIM <= 0.89547 )
								if( d <= 43.5322 )
									ret := 0.064828
								if( d > 43.5322 )
									ret := -0.148352
							if( VIM > 0.89547 )
								if( smoothK_k <= 20.3123 )
									ret := 0.289855
								if( smoothK_k > 20.3123 )
									ret := 0.070865
						if( VIP_VIM > 0.269268 )
							if( rsi1 <= 57.8466 )
								if( d_k <= 15.1094 )
									ret := -0.536859
								if( d_k > 15.1094 )
									ret := -0.285366
							if( rsi1 > 57.8466 )
								if( VIM <= 0.807302 )
									ret := -0.331688
								if( VIM > 0.807302 )
									ret := -0.062075
					if( rsi1 > 66.7839 )
						if( rsi1 <= 76.3273 )
							if( VIP_VIM <= 0.277131 )
								if( d_k <= 8.00446 )
									ret := 0.481865
								if( d_k > 8.00446 )
									ret := -0.183673
							if( VIP_VIM > 0.277131 )
								if( VIM <= 0.828379 )
									ret := 0.049905
								if( VIM > 0.828379 )
									ret := 0.327217
						if( rsi1 > 76.3273 )
							if( smoothD_d <= 66.1253 )
								if( VIM <= 0.743255 )
									ret := 0.232500
								if( VIM > 0.743255 )
									ret := 0.519553
							if( smoothD_d > 66.1253 )
								if( smoothK_k <= 55.5814 )
									ret := 0.482759
								if( smoothK_k > 55.5814 )
									ret := 0.952381 // buy
		if( smoothK_k > 57.4624 )
			if( VIP_VIM <= -0.095982 )
				if( rsi1 <= 57.3581 )
					if( VIP_VIM <= -0.327045 )
						if( rsi1 <= 49.2331 )
							if( smoothK_k <= 94.5811 )
								if( smoothK_k <= 92.6838 )
									ret := 0.491124
								if( smoothK_k > 92.6838 )
									ret := 0.963636 // buy
							if( smoothK_k > 94.5811 )
								if( smoothD_d <= 88.9538 )
									ret := 0.612245
								if( smoothD_d > 88.9538 )
									ret := 0.025000
						if( rsi1 > 49.2331 )
							if( k <= 97.2625 )
								if( VIM <= 1.24662 )
									ret := 0.603248
								if( VIM > 1.24662 )
									ret := 0.295455
							if( k > 97.2625 )
								if( rsi1 <= 56.7961 )
									ret := 0.749271 // buy
								if( rsi1 > 56.7961 )
									ret := 0.400000
					if( VIP_VIM > -0.327045 )
						if( smoothK_k <= 75.7642 )
							if( d_k <= -27.2407 )
								if( k <= 73.2296 )
									ret := -0.333333
								if( k > 73.2296 )
									ret := 0.181818
							if( d_k > -27.2407 )
								if( VIP_VIM <= -0.137246 )
									ret := 0.522135
								if( VIP_VIM > -0.137246 )
									ret := 0.219780
						if( smoothK_k > 75.7642 )
							if( rsi1 <= 48.6089 )
								if( VIP_VIM <= -0.235845 )
									ret := 0.279221
								if( VIP_VIM > -0.235845 )
									ret := -0.104348
							if( rsi1 > 48.6089 )
								if( k <= 79.6212 )
									ret := -0.217391
								if( k > 79.6212 )
									ret := 0.328892
				if( rsi1 > 57.3581 )
					if( d_k <= 6.46991 )
						if( VIP <= 0.839873 )
							if( VIP_VIM <= -0.596673 )
								if( VIP_VIM <= -0.708417 )
									ret := 0.812500 // buy
								if( VIP_VIM > -0.708417 )
									ret := 0.378378
							if( VIP_VIM > -0.596673 )
								if( rsi1 <= 60.7528 )
									ret := 0.713043 // buy
								if( rsi1 > 60.7528 )
									ret := 0.814000 // buy
						if( VIP > 0.839873 )
							if( d <= 68.7377 )
								if( rsi1 <= 59.4989 )
									ret := 0.308642
								if( rsi1 > 59.4989 )
									ret := 0.588629
							if( d > 68.7377 )
								if( VIM <= 1.15907 )
									ret := 0.660851
								if( VIM > 1.15907 )
									ret := 0.486239
					if( d_k > 6.46991 )
						if( VIP <= 0.841838 )
							ret := 0.700000 // buy
						if( VIP > 0.841838 )
							if( VIM <= 1.07016 )
								ret := 0.500000
							if( VIM > 1.07016 )
								if( k <= 82.2035 )
									ret := 0.000000
								if( k > 82.2035 )
									ret := -0.333333
			if( VIP_VIM > -0.095982 )
				if( k <= 90.4672 )
					if( k <= 77.8209 )
						if( d <= 85.8322 )
							if( k <= 62.3922 )
								if( smoothD_d <= 63.6825 )
									ret := 0.337171
								if( smoothD_d > 63.6825 )
									ret := 0.164319
							if( k > 62.3922 )
								if( rsi1 <= 79.4104 )
									ret := 0.043257
								if( rsi1 > 79.4104 )
									ret := 0.573529
						if( d > 85.8322 )
							if( rsi1 <= 76.4783 )
								if( smoothK_k <= 73.9679 )
									ret := 0.337900
								if( smoothK_k > 73.9679 )
									ret := -0.125000
							if( rsi1 > 76.4783 )
								if( VIP_VIM <= 0.736965 )
									ret := 0.519231
								if( VIP_VIM > 0.736965 )
									ret := 0.948276 // buy
					if( k > 77.8209 )
						if( smoothK_k <= 79.1177 )
							if( d <= 89.4565 )
								if( rsi1 <= 53.1061 )
									ret := -0.070455
								if( rsi1 > 53.1061 )
									ret := 0.316197
							if( d > 89.4565 )
								if( VIM <= 0.81775 )
									ret := 0.290323
								if( VIM > 0.81775 )
									ret := 0.571429
						if( smoothK_k > 79.1177 )
							if( rsi1 <= 78.0455 )
								if( d <= 90.1657 )
									ret := 0.031414
								if( d > 90.1657 )
									ret := 0.202726
							if( rsi1 > 78.0455 )
								if( rsi1 <= 84.1215 )
									ret := 0.317965
								if( rsi1 > 84.1215 )
									ret := 0.655779
				if( k > 90.4672 )
					if( rsi1 <= 69.8674 )
						if( VIP_VIM <= 0.194376 )
							if( d_k <= 2.2779 )
								if( VIM <= 1.10007 )
									ret := 0.217682
								if( VIM > 1.10007 )
									ret := -0.558824
							if( d_k > 2.2779 )
								if( VIP_VIM <= 0.129385 )
									ret := 0.447090
								if( VIP_VIM > 0.129385 )
									ret := 0.739130 // buy
						if( VIP_VIM > 0.194376 )
							if( d_k <= 3.03819 )
								if( rsi1 <= 58.7338 )
									ret := 0.328767
								if( rsi1 > 58.7338 )
									ret := -0.125353
							if( d_k > 3.03819 )
								if( VIP_VIM <= 0.441507 )
									ret := 0.606695
								if( VIP_VIM > 0.441507 )
									ret := -0.217391
					if( rsi1 > 69.8674 )
						if( rsi1 <= 81.5933 )
							if( VIM <= 0.796247 )
								if( VIM <= 0.744428 )
									ret := -0.233636
								if( VIM > 0.744428 )
									ret := 0.153173
							if( VIM > 0.796247 )
								if( VIP <= 1.1855 )
									ret := 0.673505
								if( VIP > 1.1855 )
									ret := 0.185921
						if( rsi1 > 81.5933 )
							if( VIP <= 1.3148 )
								if( d <= 68.8891 )
									ret := -0.437500
								if( d > 68.8891 )
									ret := 0.719926 // buy
							if( VIP > 1.3148 )
								if( smoothD_d <= 96.9999 )
									ret := 0.140021
								if( smoothD_d > 96.9999 )
									ret := 0.639456
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_TRXUSDT_15Min_0ac0f013(d_k, d, rsi1, k, smoothD_d, smoothK_k, VIP_VIM, VIM, VIP)

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


