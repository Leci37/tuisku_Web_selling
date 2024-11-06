//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: AFRM_1Min_2SV0_b9c00200 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AFRM_1Min_2SV0_b9c00200", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AFRM_1Min_b9c00200(rsi1, smoothK_k, d_k, k, d, smoothD_d, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( rsi1 <= 53.4914 )
		if( VIM <= 1.8128 )
			if( smoothD_d <= 18.8948 )
				if( VIP_VIM <= -0.170683 )
					if( d_k <= 14.1826 )
						if( VIP_VIM <= -1.13217 )
							if( d_k <= 0.835094 )
								if( smoothD_d <= -2.16517 )
									ret := 1.000000 // buy
								if( smoothD_d > -2.16517 )
									ret := 0.333333
							if( d_k > 0.835094 )
								ret := 0.954545 // buy
						if( VIP_VIM > -1.13217 )
							if( VIM <= 1.06341 )
								if( d_k <= -0.061676 )
									ret := 0.555556
								if( d_k > -0.061676 )
									ret := 0.866667 // buy
							if( VIM > 1.06341 )
								if( smoothD_d <= -2.9906 )
									ret := 0.183865
								if( smoothD_d > -2.9906 )
									ret := -0.056519
					if( d_k > 14.1826 )
						if( VIP <= 0.885781 )
							if( VIP_VIM <= -0.665647 )
								ret := 0.500000
							if( VIP_VIM > -0.665647 )
								if( VIP <= 0.803746 )
									ret := -0.400000
								if( VIP > 0.803746 )
									ret := -0.047619
						if( VIP > 0.885781 )
							if( k <= 0.547394 )
								if( d_k <= 15.5125 )
									ret := -1.000000 // sell
								if( d_k > 15.5125 )
									ret := -0.866667 // sell
							if( k > 0.547394 )
								if( smoothK_k <= -0.532448 )
									ret := 0.454545
								if( smoothK_k > -0.532448 )
									ret := -0.692308
				if( VIP_VIM > -0.170683 )
					if( d <= 14.3856 )
						if( d_k <= -7.64908 )
							if( smoothK_k <= 24.7248 )
								if( k <= 19.9159 )
									ret := 0.220588
								if( k > 19.9159 )
									ret := 0.524138
							if( smoothK_k > 24.7248 )
								ret := -0.666667
						if( d_k > -7.64908 )
							if( VIP <= 1.04088 )
								if( smoothD_d <= 10.623 )
									ret := -0.003559
								if( smoothD_d > 10.623 )
									ret := 0.614286
							if( VIP > 1.04088 )
								if( smoothD_d <= -2.95507 )
									ret := -0.750000 // sell
								if( smoothD_d > -2.95507 )
									ret := 0.259811
					if( d > 14.3856 )
						if( smoothK_k <= 21.1129 )
							if( rsi1 <= 46.9796 )
								if( rsi1 <= 44.3339 )
									ret := -0.096685
								if( rsi1 > 44.3339 )
									ret := 0.220833
							if( rsi1 > 46.9796 )
								if( smoothK_k <= 2.20108 )
									ret := -0.459770
								if( smoothK_k > 2.20108 )
									ret := -0.198830
						if( smoothK_k > 21.1129 )
							if( k <= 30.6687 )
								if( smoothD_d <= 15.6438 )
									ret := 0.395833
								if( smoothD_d > 15.6438 )
									ret := -0.030612
							if( k > 30.6687 )
								if( VIP_VIM <= 0.021761 )
									ret := 0.000000
								if( VIP_VIM > 0.021761 )
									ret := -0.758621 // sell
			if( smoothD_d > 18.8948 )
				if( d_k <= 5.61107 )
					if( d_k <= 2.97492 )
						if( d_k <= -28.542 )
							if( d <= 28.0798 )
								ret := -0.800000 // sell
							if( d > 28.0798 )
								if( smoothK_k <= 63.9473 )
									ret := 0.909091 // buy
								if( smoothK_k > 63.9473 )
									ret := 0.322368
						if( d_k > -28.542 )
							if( d <= 73.2357 )
								if( rsi1 <= 50.5483 )
									ret := 0.023243
								if( rsi1 > 50.5483 )
									ret := -0.100980
							if( d > 73.2357 )
								if( VIM <= 0.939368 )
									ret := 0.564516
								if( VIM > 0.939368 )
									ret := 0.085989
					if( d_k > 2.97492 )
						if( smoothK_k <= 77.9573 )
							if( k <= 18.5297 )
								if( d <= 22.7983 )
									ret := -0.176471
								if( d > 22.7983 )
									ret := -1.000000 // sell
							if( k > 18.5297 )
								if( smoothD_d <= 20.2024 )
									ret := 0.775000 // buy
								if( smoothD_d > 20.2024 )
									ret := 0.281229
						if( smoothK_k > 77.9573 )
							if( d <= 90.4901 )
								if( d <= 88.2984 )
									ret := 0.050000
								if( d > 88.2984 )
									ret := -0.514706
							if( d > 90.4901 )
								if( VIP <= 0.907221 )
									ret := 0.745763 // buy
								if( VIP > 0.907221 )
									ret := 0.024648
				if( d_k > 5.61107 )
					if( VIP <= 1.02148 )
						if( smoothD_d <= 21.2604 )
							if( VIP_VIM <= -0.03519 )
								if( VIP_VIM <= -0.076113 )
									ret := 0.340102
								if( VIP_VIM > -0.076113 )
									ret := -0.233333
							if( VIP_VIM > -0.03519 )
								if( d_k <= 13.5518 )
									ret := 0.964286 // buy
								if( d_k > 13.5518 )
									ret := 0.388889
						if( smoothD_d > 21.2604 )
							if( smoothK_k <= 85.2638 )
								if( VIM <= 1.25894 )
									ret := -0.111290
								if( VIM > 1.25894 )
									ret := 0.168869
							if( smoothK_k > 85.2638 )
								if( k <= 89.6932 )
									ret := -0.954545 // sell
								if( k > 89.6932 )
									ret := -0.636364
					if( VIP > 1.02148 )
						if( VIP_VIM <= 0.433027 )
							if( k <= 6.93306 )
								if( smoothK_k <= 2.41227 )
									ret := 0.268293
								if( smoothK_k > 2.41227 )
									ret := 0.826087 // buy
							if( k > 6.93306 )
								if( VIP_VIM <= -0.07691 )
									ret := 0.245347
								if( VIP_VIM > -0.07691 )
									ret := 0.029695
						if( VIP_VIM > 0.433027 )
							if( rsi1 <= 52.8331 )
								if( smoothD_d <= 33.6215 )
									ret := 0.100000
								if( smoothD_d > 33.6215 )
									ret := 0.838235 // buy
							if( rsi1 > 52.8331 )
								ret := -0.100000
		if( VIM > 1.8128 )
			if( d <= 2.98048 )
				if( rsi1 <= 3.41172 )
					if( smoothK_k <= -1.62036 )
						ret := 0.857143 // buy
					if( smoothK_k > -1.62036 )
						ret := 1.000000 // buy
				if( rsi1 > 3.41172 )
					if( VIM <= 2.48389 )
						if( k <= 4.75121 )
							if( VIM <= 2.18398 )
								if( d_k <= -1.15998 )
									ret := 1.000000 // buy
								if( d_k > -1.15998 )
									ret := 0.288136
							if( VIM > 2.18398 )
								if( smoothK_k <= -2.77101 )
									ret := 0.066667
								if( smoothK_k > -2.77101 )
									ret := -0.428571
						if( k > 4.75121 )
							ret := -0.642857
					if( VIM > 2.48389 )
						if( smoothD_d <= -2.50167 )
							if( rsi1 <= 16.2513 )
								ret := -0.700000 // sell
							if( rsi1 > 16.2513 )
								if( VIP_VIM <= -0.509224 )
									ret := -0.166667
								if( VIP_VIM > -0.509224 )
									ret := 0.724138 // buy
						if( smoothD_d > -2.50167 )
							if( VIP <= 22.4157 )
								if( d_k <= -0.4913 )
									ret := 0.415385
								if( d_k > -0.4913 )
									ret := 0.826590 // buy
							if( VIP > 22.4157 )
								ret := 0.100000
			if( d > 2.98048 )
				if( d <= 17.7804 )
					if( k <= 6.48731 )
						if( rsi1 <= 11.4509 )
							if( d <= 4.93675 )
								if( VIP <= 1.6476 )
									ret := -1.000000 // sell
								if( VIP > 1.6476 )
									ret := -0.800000 // sell
							if( d > 4.93675 )
								ret := 0.315789
						if( rsi1 > 11.4509 )
							if( k <= 1.1714 )
								if( VIP_VIM <= -1.08008 )
									ret := 0.789474 // buy
								if( VIP_VIM > -1.08008 )
									ret := 0.382353
							if( k > 1.1714 )
								if( smoothD_d <= 4.74391 )
									ret := 0.000000
								if( smoothD_d > 4.74391 )
									ret := 0.256917
					if( k > 6.48731 )
						if( VIP_VIM <= -1.26389 )
							if( d_k <= -4.1389 )
								if( VIP <= 2.88034 )
									ret := -0.400000
								if( VIP > 2.88034 )
									ret := -0.176471
							if( d_k > -4.1389 )
								if( VIP_VIM <= -1.40802 )
									ret := 0.415094
								if( VIP_VIM > -1.40802 )
									ret := 0.882353 // buy
						if( VIP_VIM > -1.26389 )
							if( d <= 7.82284 )
								if( d <= 3.77359 )
									ret := 0.523810
								if( d > 3.77359 )
									ret := -0.439216
							if( d > 7.82284 )
								if( VIM <= 24.4738 )
									ret := -0.124679
								if( VIM > 24.4738 )
									ret := 0.804878 // buy
				if( d > 17.7804 )
					if( rsi1 <= 48.0319 )
						if( d <= 18.5331 )
							if( k <= 23.8034 )
								if( VIP_VIM <= -0.601546 )
									ret := 0.611111
								if( VIP_VIM > -0.601546 )
									ret := 0.954545 // buy
							if( k > 23.8034 )
								ret := 0.200000
						if( d > 18.5331 )
							if( smoothD_d <= 17.6532 )
								if( VIP_VIM <= -0.57661 )
									ret := 0.081081
								if( VIP_VIM > -0.57661 )
									ret := -0.378151
							if( smoothD_d > 17.6532 )
								if( VIP_VIM <= -0.09352 )
									ret := 0.297645
								if( VIP_VIM > -0.09352 )
									ret := 0.158516
					if( rsi1 > 48.0319 )
						if( d <= 60.094 )
							if( VIM <= 2.25553 )
								if( VIP <= 1.43024 )
									ret := -0.593750
								if( VIP > 1.43024 )
									ret := 0.296482
							if( VIM > 2.25553 )
								if( d_k <= -17.1813 )
									ret := 0.247059
								if( d_k > -17.1813 )
									ret := -0.128457
						if( d > 60.094 )
							if( VIP_VIM <= 1.05199 )
								if( d <= 65.4395 )
									ret := 0.590361
								if( d > 65.4395 )
									ret := 0.204370
							if( VIP_VIM > 1.05199 )
								if( VIP_VIM <= 1.43619 )
									ret := -0.181818
								if( VIP_VIM > 1.43619 )
									ret := -0.718750 // sell
	if( rsi1 > 53.4914 )
		if( VIP_VIM <= 0.688345 )
			if( VIP <= 1.3581 )
				if( smoothD_d <= 61.9841 )
					if( VIP <= 1.04265 )
						if( smoothK_k <= 74.9212 )
							if( VIP_VIM <= -0.019228 )
								if( VIP_VIM <= -0.205482 )
									ret := 0.562500
								if( VIP_VIM > -0.205482 )
									ret := -0.457143
							if( VIP_VIM > -0.019228 )
								if( VIP <= 1.01203 )
									ret := 0.183908
								if( VIP > 1.01203 )
									ret := -0.172524
						if( smoothK_k > 74.9212 )
							if( d_k <= -22.9233 )
								ret := -0.307692
							if( d_k > -22.9233 )
								ret := 0.800000 // buy
					if( VIP > 1.04265 )
						if( VIM <= 1.07672 )
							if( VIP_VIM <= 0.645801 )
								if( smoothK_k <= 8.90736 )
									ret := -0.090615
								if( smoothK_k > 8.90736 )
									ret := 0.103281
							if( VIP_VIM > 0.645801 )
								if( k <= 67.3774 )
									ret := 0.805556 // buy
								if( k > 67.3774 )
									ret := 0.100000
						if( VIM > 1.07672 )
							if( smoothD_d <= 23.1033 )
								if( d <= 21.085 )
									ret := -0.226415
								if( d > 21.085 )
									ret := 0.710526 // buy
							if( smoothD_d > 23.1033 )
								if( VIP <= 1.21278 )
									ret := -0.523179
								if( VIP > 1.21278 )
									ret := -0.235602
				if( smoothD_d > 61.9841 )
					if( smoothK_k <= 70.8596 )
						if( VIM <= 0.705433 )
							if( rsi1 <= 74.0455 )
								if( d_k <= 7.94619 )
									ret := -0.785714 // sell
								if( d_k > 7.94619 )
									ret := 0.133333
							if( rsi1 > 74.0455 )
								if( d_k <= 1.48026 )
									ret := -0.615385
								if( d_k > 1.48026 )
									ret := 0.506173
						if( VIM > 0.705433 )
							if( d <= 67.9585 )
								if( k <= 47.3619 )
									ret := 0.227273
								if( k > 47.3619 )
									ret := -0.293556
							if( d > 67.9585 )
								if( d <= 68.347 )
									ret := 0.428571
								if( d > 68.347 )
									ret := -0.102870
					if( smoothK_k > 70.8596 )
						if( rsi1 <= 73.6359 )
							if( smoothD_d <= 83.2786 )
								if( smoothD_d <= 81.6219 )
									ret := -0.023956
								if( smoothD_d > 81.6219 )
									ret := -0.212281
							if( smoothD_d > 83.2786 )
								if( smoothD_d <= 92.175 )
									ret := 0.081446
								if( smoothD_d > 92.175 )
									ret := -0.058729
						if( rsi1 > 73.6359 )
							if( rsi1 <= 78.8791 )
								if( k <= 89.5519 )
									ret := -0.067194
								if( k > 89.5519 )
									ret := -0.299611
							if( rsi1 > 78.8791 )
								if( d <= 94.9109 )
									ret := -0.167630
								if( d > 94.9109 )
									ret := 0.172414
			if( VIP > 1.3581 )
				if( rsi1 <= 82.4911 )
					if( smoothD_d <= 69.9275 )
						if( d_k <= -12.1503 )
							if( k <= 70.9351 )
								if( k <= 68.6295 )
									ret := -0.346154
								if( k > 68.6295 )
									ret := 0.312500
							if( k > 70.9351 )
								if( rsi1 <= 57.1512 )
									ret := -0.134146
								if( rsi1 > 57.1512 )
									ret := -0.551821
						if( d_k > -12.1503 )
							if( VIP <= 6.71687 )
								if( k <= 53.7064 )
									ret := -0.051524
								if( k > 53.7064 )
									ret := -0.234437
							if( VIP > 6.71687 )
								if( VIM <= 13.7162 )
									ret := -0.486607
								if( VIM > 13.7162 )
									ret := -0.075630
					if( smoothD_d > 69.9275 )
						if( smoothK_k <= 92.5567 )
							if( VIP <= 3.40653 )
								if( k <= 77.1936 )
									ret := 0.117117
								if( k > 77.1936 )
									ret := -0.156928
							if( VIP > 3.40653 )
								if( smoothD_d <= 90.2674 )
									ret := 0.154610
								if( smoothD_d > 90.2674 )
									ret := -0.337662
						if( smoothK_k > 92.5567 )
							if( VIM <= 11.7963 )
								if( VIP_VIM <= 0.513221 )
									ret := -0.345205
								if( VIP_VIM > 0.513221 )
									ret := -0.045226
							if( VIM > 11.7963 )
								if( smoothD_d <= 92.4982 )
									ret := -0.972222 // sell
								if( smoothD_d > 92.4982 )
									ret := -0.454545
				if( rsi1 > 82.4911 )
					if( k <= 99.7541 )
						if( VIP <= 4.07549 )
							if( VIP_VIM <= 0.396267 )
								ret := 0.294118
							if( VIP_VIM > 0.396267 )
								if( VIP <= 1.39889 )
									ret := 0.387097
								if( VIP > 1.39889 )
									ret := -0.500000
						if( VIP > 4.07549 )
							if( smoothK_k <= 95.3165 )
								if( rsi1 <= 86.7412 )
									ret := 0.833333 // buy
								if( rsi1 > 86.7412 )
									ret := 0.428571
							if( smoothK_k > 95.3165 )
								ret := -0.454545
					if( k > 99.7541 )
						if( VIP <= 1.60696 )
							if( d <= 95.3497 )
								ret := 1.000000 // buy
							if( d > 95.3497 )
								ret := 0.700000 // buy
						if( VIP > 1.60696 )
							ret := 0.307692
		if( VIP_VIM > 0.688345 )
			if( d_k <= 1.90044 )
				if( VIP <= 7.13006 )
					if( rsi1 <= 84.3758 )
						if( smoothK_k <= 96.6549 )
							if( smoothK_k <= 88.4222 )
								if( smoothD_d <= 69.0382 )
									ret := -0.231023
								if( smoothD_d > 69.0382 )
									ret := -0.513812
							if( smoothK_k > 88.4222 )
								if( VIP_VIM <= 1.00023 )
									ret := -0.065185
								if( VIP_VIM > 1.00023 )
									ret := -0.474359
						if( smoothK_k > 96.6549 )
							if( rsi1 <= 76.2247 )
								if( VIM <= 2.84147 )
									ret := 0.242424
								if( VIM > 2.84147 )
									ret := -0.538462
							if( rsi1 > 76.2247 )
								if( d <= 90.5651 )
									ret := 0.080000
								if( d > 90.5651 )
									ret := -0.667954
					if( rsi1 > 84.3758 )
						if( rsi1 <= 86.1191 )
							if( VIM <= 0.539358 )
								if( VIM <= 0.50596 )
									ret := 1.000000 // buy
								if( VIM > 0.50596 )
									ret := 0.769231 // buy
							if( VIM > 0.539358 )
								if( d <= 88.9936 )
									ret := -0.333333
								if( d > 88.9936 )
									ret := 0.256757
						if( rsi1 > 86.1191 )
							if( d_k <= -0.012908 )
								if( smoothD_d <= 96.1286 )
									ret := -0.155488
								if( smoothD_d > 96.1286 )
									ret := -0.851852 // sell
							if( d_k > -0.012908 )
								if( k <= 93.0768 )
									ret := -0.700000 // sell
								if( k > 93.0768 )
									ret := 0.029674
				if( VIP > 7.13006 )
					if( d_k <= -6.9026 )
						if( rsi1 <= 57.6919 )
							if( VIM <= 27.5127 )
								ret := 0.937500 // buy
							if( VIM > 27.5127 )
								ret := 0.000000
						if( rsi1 > 57.6919 )
							if( VIM <= 31.2977 )
								if( smoothD_d <= 69.1108 )
									ret := -0.413043
								if( smoothD_d > 69.1108 )
									ret := 0.120000
							if( VIM > 31.2977 )
								if( d <= 64.5152 )
									ret := -0.900000 // sell
								if( d > 64.5152 )
									ret := -1.000000 // sell
					if( d_k > -6.9026 )
						if( VIM <= 17.9983 )
							if( k <= 84.5634 )
								if( d_k <= -0.412841 )
									ret := 0.535714
								if( d_k > -0.412841 )
									ret := -0.040000
							if( k > 84.5634 )
								if( smoothD_d <= 91.881 )
									ret := 0.839286 // buy
								if( smoothD_d > 91.881 )
									ret := 0.217391
						if( VIM > 17.9983 )
							if( rsi1 <= 55.623 )
								ret := 0.357143
							if( rsi1 > 55.623 )
								if( k <= 87.6744 )
									ret := -0.400000
								if( k > 87.6744 )
									ret := -0.733333 // sell
			if( d_k > 1.90044 )
				if( smoothD_d <= 84.192 )
					if( d_k <= 3.58715 )
						if( k <= 69.6095 )
							if( smoothK_k <= 39.0927 )
								ret := 0.142857
							if( smoothK_k > 39.0927 )
								if( rsi1 <= 57.3151 )
									ret := -0.818182 // sell
								if( rsi1 > 57.3151 )
									ret := -0.400000
						if( k > 69.6095 )
							if( smoothK_k <= 75.31 )
								if( VIP <= 1.67621 )
									ret := 0.666667
								if( VIP > 1.67621 )
									ret := 0.960000 // buy
							if( smoothK_k > 75.31 )
								if( k <= 83.1914 )
									ret := -0.150000
								if( k > 83.1914 )
									ret := 0.642857
					if( d_k > 3.58715 )
						if( d_k <= 12.6378 )
							if( VIP_VIM <= 0.733104 )
								if( k <= 48.1813 )
									ret := -0.935484 // sell
								if( k > 48.1813 )
									ret := -0.524590
							if( VIP_VIM > 0.733104 )
								if( rsi1 <= 74.0189 )
									ret := -0.082734
								if( rsi1 > 74.0189 )
									ret := -0.543860
						if( d_k > 12.6378 )
							if( VIP_VIM <= 0.805862 )
								if( rsi1 <= 70.7811 )
									ret := -0.194444
								if( rsi1 > 70.7811 )
									ret := 0.764706 // buy
							if( VIP_VIM > 0.805862 )
								if( rsi1 <= 69.6453 )
									ret := -0.072289
								if( rsi1 > 69.6453 )
									ret := -0.735294 // sell
				if( smoothD_d > 84.192 )
					if( VIM <= 0.428361 )
						ret := -0.800000 // sell
					if( VIM > 0.428361 )
						if( VIM <= 0.474058 )
							ret := 0.842105 // buy
						if( VIM > 0.474058 )
							if( smoothK_k <= 88.0911 )
								if( k <= 87.0683 )
									ret := 0.200873
								if( k > 87.0683 )
									ret := -0.150000
							if( smoothK_k > 88.0911 )
								if( d <= 95.3925 )
									ret := 0.557377
								if( d > 95.3925 )
									ret := 0.195219
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_AFRM_1Min_b9c00200(rsi1, smoothK_k, d_k, k, d, smoothD_d, VIP, VIM, VIP_VIM)

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


