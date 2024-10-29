//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: CRWD_15Min_2SV0_e96f91eb Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_15Min_2SV0_e96f91eb", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_15Min_e96f91eb(d, d_k, smoothK_k, k, rsi1, smoothD_d, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( smoothK_k <= 61.1236 )
		if( rsi1 <= 56.1632 )
			if( d <= 49.7388 )
				if( VIP_VIM <= -0.2855 )
					if( VIP <= 0.553497 )
						if( smoothD_d <= -2.91906 )
							if( VIP_VIM <= -0.950332 )
								ret := -0.611111
							if( VIP_VIM > -0.950332 )
								ret := -0.920000 // sell
						if( smoothD_d > -2.91906 )
							if( smoothD_d <= -2.6769 )
								if( VIM <= 1.52318 )
									ret := 0.764706 // buy
								if( VIM > 1.52318 )
									ret := 0.111111
							if( smoothD_d > -2.6769 )
								if( smoothK_k <= -0.275963 )
									ret := 0.048000
								if( smoothK_k > -0.275963 )
									ret := -0.469697
					if( VIP > 0.553497 )
						if( smoothD_d <= 33.579 )
							if( VIP <= 0.891699 )
								if( rsi1 <= 29.6425 )
									ret := 0.106182
								if( rsi1 > 29.6425 )
									ret := 0.008875
							if( VIP > 0.891699 )
								if( rsi1 <= 13.9609 )
									ret := -0.106599
								if( rsi1 > 13.9609 )
									ret := 0.159664
						if( smoothD_d > 33.579 )
							if( rsi1 <= 36.5814 )
								if( rsi1 <= 15.2613 )
									ret := 0.764706 // buy
								if( rsi1 > 15.2613 )
									ret := 0.043738
							if( rsi1 > 36.5814 )
								if( d_k <= 13.2637 )
									ret := -0.085470
								if( d_k > 13.2637 )
									ret := -0.660256
				if( VIP_VIM > -0.2855 )
					if( VIP <= 2.87997 )
						if( d <= 24.3396 )
							if( d_k <= 22.6041 )
								if( smoothK_k <= 11.0991 )
									ret := 0.002033
								if( smoothK_k > 11.0991 )
									ret := -0.085203
							if( d_k > 22.6041 )
								if( VIP <= 1.06046 )
									ret := 0.333333
								if( VIP > 1.06046 )
									ret := 1.000000 // buy
						if( d > 24.3396 )
							if( smoothD_d <= 22.5681 )
								if( k <= 9.3034 )
									ret := -0.288889
								if( k > 9.3034 )
									ret := 0.323113
							if( smoothD_d > 22.5681 )
								if( smoothD_d <= 24.7525 )
									ret := -0.114401
								if( smoothD_d > 24.7525 )
									ret := 0.046185
					if( VIP > 2.87997 )
						if( d <= 39.1966 )
							if( smoothK_k <= 18.4015 )
								if( k <= 17.78 )
									ret := 0.358209
								if( k > 17.78 )
									ret := 0.853659 // buy
							if( smoothK_k > 18.4015 )
								if( rsi1 <= 52.0842 )
									ret := -0.054945
								if( rsi1 > 52.0842 )
									ret := -0.555556
						if( d > 39.1966 )
							if( smoothD_d <= 44.1909 )
								if( smoothK_k <= 41.6955 )
									ret := 0.934783 // buy
								if( smoothK_k > 41.6955 )
									ret := 0.444444
							if( smoothD_d > 44.1909 )
								ret := 0.533333
			if( d > 49.7388 )
				if( smoothK_k <= 42.6272 )
					if( d <= 51.8634 )
						if( VIM <= 1.8553 )
							if( rsi1 <= 32.2815 )
								if( d_k <= 11.7448 )
									ret := 1.000000 // buy
								if( d_k > 11.7448 )
									ret := 0.564103
							if( rsi1 > 32.2815 )
								if( rsi1 <= 41.039 )
									ret := -0.236111
								if( rsi1 > 41.039 )
									ret := 0.420408
						if( VIM > 1.8553 )
							if( d <= 51.0096 )
								ret := -0.538462
							if( d > 51.0096 )
								ret := 0.000000
					if( d > 51.8634 )
						if( VIP_VIM <= 0.012754 )
							if( VIP <= 0.708296 )
								if( k <= 36.5443 )
									ret := -0.823529 // sell
								if( k > 36.5443 )
									ret := -0.250000
							if( VIP > 0.708296 )
								if( rsi1 <= 27.703 )
									ret := 0.203704
								if( rsi1 > 27.703 )
									ret := -0.142123
						if( VIP_VIM > 0.012754 )
							if( d_k <= 12.975 )
								if( rsi1 <= 51.3186 )
									ret := -0.157895
								if( rsi1 > 51.3186 )
									ret := -0.960000 // sell
							if( d_k > 12.975 )
								if( d <= 63.3305 )
									ret := 0.327177
								if( d > 63.3305 )
									ret := -0.102804
				if( smoothK_k > 42.6272 )
					if( VIP <= 0.735525 )
						if( VIP <= 0.631127 )
							ret := -0.941176 // sell
						if( VIP > 0.631127 )
							if( VIP_VIM <= -0.639998 )
								if( rsi1 <= 29.556 )
									ret := -0.857143 // sell
								if( rsi1 > 29.556 )
									ret := -1.000000 // sell
							if( VIP_VIM > -0.639998 )
								if( rsi1 <= 29.796 )
									ret := -0.333333
								if( rsi1 > 29.796 )
									ret := 0.818182 // buy
					if( VIP > 0.735525 )
						if( d <= 72.0071 )
							if( d_k <= 23.2361 )
								if( VIP_VIM <= -0.174244 )
									ret := 0.330081
								if( VIP_VIM > -0.174244 )
									ret := 0.168597
							if( d_k > 23.2361 )
								ret := -0.833333 // sell
						if( d > 72.0071 )
							if( d <= 81.3097 )
								if( d <= 76.5456 )
									ret := 0.072941
								if( d > 76.5456 )
									ret := -0.175373
							if( d > 81.3097 )
								if( k <= 63.1259 )
									ret := 0.707692 // buy
								if( k > 63.1259 )
									ret := -0.266667
		if( rsi1 > 56.1632 )
			if( smoothK_k <= 5.71669 )
				if( VIM <= 0.906898 )
					if( d <= 5.96229 )
						if( smoothD_d <= 2.13685 )
							if( d_k <= -0.202101 )
								if( rsi1 <= 67.5814 )
									ret := 0.761905 // buy
								if( rsi1 > 67.5814 )
									ret := 1.000000 // buy
							if( d_k > -0.202101 )
								if( smoothK_k <= -2.84064 )
									ret := 0.681818
								if( smoothK_k > -2.84064 )
									ret := -0.043478
						if( smoothD_d > 2.13685 )
							if( smoothK_k <= -2.87591 )
								ret := 0.916667 // buy
							if( smoothK_k > -2.87591 )
								ret := 1.000000 // buy
					if( d > 5.96229 )
						if( k <= 1.97924 )
							if( rsi1 <= 72.9764 )
								if( d_k <= 17.1769 )
									ret := -0.457143
								if( d_k > 17.1769 )
									ret := -0.058824
							if( rsi1 > 72.9764 )
								ret := 0.692308
						if( k > 1.97924 )
							if( VIP_VIM <= 0.275865 )
								if( rsi1 <= 61.0467 )
									ret := 0.850000 // buy
								if( rsi1 > 61.0467 )
									ret := 0.500000
							if( VIP_VIM > 0.275865 )
								if( smoothD_d <= 7.47913 )
									ret := 0.766667 // buy
								if( smoothD_d > 7.47913 )
									ret := 0.175676
				if( VIM > 0.906898 )
					if( VIP <= 1.19047 )
						if( d <= 1.6826 )
							if( smoothK_k <= -2.9025 )
								ret := -0.300000
							if( smoothK_k > -2.9025 )
								if( d <= 1.1435 )
									ret := -0.944444 // sell
								if( d > 1.1435 )
									ret := -0.750000 // sell
						if( d > 1.6826 )
							if( rsi1 <= 61.9082 )
								if( VIM <= 0.926846 )
									ret := -0.465517
								if( VIM > 0.926846 )
									ret := -0.179688
							if( rsi1 > 61.9082 )
								if( d <= 12.4528 )
									ret := 0.545455
								if( d > 12.4528 )
									ret := 0.000000
					if( VIP > 1.19047 )
						if( k <= 7.4979 )
							if( VIP_VIM <= 0.133589 )
								if( VIM <= 1.24875 )
									ret := 1.000000 // buy
								if( VIM > 1.24875 )
									ret := 0.800000 // buy
							if( VIP_VIM > 0.133589 )
								if( smoothD_d <= 3.96634 )
									ret := 0.516129
								if( smoothD_d > 3.96634 )
									ret := 0.056180
						if( k > 7.4979 )
							if( VIM <= 1.23679 )
								ret := -0.062500
							if( VIM > 1.23679 )
								ret := -0.866667 // sell
			if( smoothK_k > 5.71669 )
				if( VIM <= 1.0248 )
					if( VIM <= 0.792383 )
						if( rsi1 <= 76.4431 )
							if( d <= 70.6799 )
								if( d <= 68.5778 )
									ret := 0.194529
								if( d > 68.5778 )
									ret := -0.666667
							if( d > 70.6799 )
								if( k <= 53.2057 )
									ret := -0.222222
								if( k > 53.2057 )
									ret := 0.621359
						if( rsi1 > 76.4431 )
							if( VIP <= 1.3754 )
								if( k <= 30.0363 )
									ret := 0.285714
								if( k > 30.0363 )
									ret := -0.525000
							if( VIP > 1.3754 )
								if( d <= 38.7326 )
									ret := 0.722222 // buy
								if( d > 38.7326 )
									ret := -0.102564
					if( VIM > 0.792383 )
						if( d <= 66.0859 )
							if( k <= 37.0755 )
								if( smoothD_d <= 11.078 )
									ret := 0.150127
								if( smoothD_d > 11.078 )
									ret := -0.091658
							if( k > 37.0755 )
								if( d_k <= -9.26981 )
									ret := 0.206522
								if( d_k > -9.26981 )
									ret := 0.009199
						if( d > 66.0859 )
							if( rsi1 <= 58.7354 )
								if( VIP_VIM <= 0.120712 )
									ret := 0.105263
								if( VIP_VIM > 0.120712 )
									ret := -0.595238
							if( rsi1 > 58.7354 )
								if( d_k <= 3.79012 )
									ret := -0.787879 // sell
								if( d_k > 3.79012 )
									ret := -0.130342
				if( VIM > 1.0248 )
					if( d <= 46.6549 )
						if( smoothD_d <= 5.18836 )
							if( d <= 5.71041 )
								if( VIM <= 1.26117 )
									ret := -0.375000
								if( VIM > 1.26117 )
									ret := -0.769231 // sell
							if( d > 5.71041 )
								if( rsi1 <= 65.1341 )
									ret := 0.650794
								if( rsi1 > 65.1341 )
									ret := 0.100000
						if( smoothD_d > 5.18836 )
							if( VIP <= 1.84536 )
								if( smoothD_d <= 37.4231 )
									ret := -0.269430
								if( smoothD_d > 37.4231 )
									ret := -0.086957
							if( VIP > 1.84536 )
								if( smoothK_k <= 47.616 )
									ret := -0.333333
								if( smoothK_k > 47.616 )
									ret := -0.780000 // sell
					if( d > 46.6549 )
						if( k <= 36.9422 )
							if( d <= 62.2014 )
								if( VIM <= 1.24862 )
									ret := -0.148148
								if( VIM > 1.24862 )
									ret := -0.647059
							if( d > 62.2014 )
								ret := 0.615385
						if( k > 36.9422 )
							if( VIP <= 1.66819 )
								if( smoothK_k <= 40.7567 )
									ret := 0.358209
								if( smoothK_k > 40.7567 )
									ret := -0.144487
							if( VIP > 1.66819 )
								if( smoothK_k <= 57.9785 )
									ret := 0.253444
								if( smoothK_k > 57.9785 )
									ret := -0.184874
	if( smoothK_k > 61.1236 )
		if( VIM <= 0.823471 )
			if( smoothK_k <= 84.8147 )
				if( smoothD_d <= 61.3679 )
					if( smoothD_d <= 56.3499 )
						if( VIP_VIM <= 0.895315 )
							if( VIP <= 1.33981 )
								if( VIP_VIM <= 0.558106 )
									ret := 0.185185
								if( VIP_VIM > 0.558106 )
									ret := -0.600000
							if( VIP > 1.33981 )
								if( rsi1 <= 77.2349 )
									ret := 0.103448
								if( rsi1 > 77.2349 )
									ret := 0.714286 // buy
						if( VIP_VIM > 0.895315 )
							if( d <= 48.4395 )
								ret := -1.000000 // sell
							if( d > 48.4395 )
								ret := -0.133333
					if( smoothD_d > 56.3499 )
						if( d <= 63.6858 )
							if( smoothK_k <= 64.6179 )
								ret := 0.105263
							if( smoothK_k > 64.6179 )
								if( VIM <= 0.807927 )
									ret := -0.736264 // sell
								if( VIM > 0.807927 )
									ret := -0.333333
						if( d > 63.6858 )
							if( k <= 74.1638 )
								ret := -0.846154 // sell
							if( k > 74.1638 )
								ret := 0.409091
				if( smoothD_d > 61.3679 )
					if( rsi1 <= 85.9523 )
						if( d <= 81.0675 )
							if( d_k <= 12.109 )
								if( VIP <= 1.19268 )
									ret := 0.057803
								if( VIP > 1.19268 )
									ret := 0.326169
							if( d_k > 12.109 )
								if( smoothD_d <= 76.1662 )
									ret := -0.857143 // sell
								if( smoothD_d > 76.1662 )
									ret := 0.000000
						if( d > 81.0675 )
							if( smoothD_d <= 79.184 )
								if( VIP_VIM <= 0.375282 )
									ret := -0.846154 // sell
								if( VIP_VIM > 0.375282 )
									ret := -0.132653
							if( smoothD_d > 79.184 )
								if( k <= 66.8472 )
									ret := -0.727273 // sell
								if( k > 66.8472 )
									ret := 0.059777
					if( rsi1 > 85.9523 )
						if( k <= 85.3295 )
							if( k <= 77.6716 )
								ret := -0.125000
							if( k > 77.6716 )
								if( rsi1 <= 87.8964 )
									ret := -0.885714 // sell
								if( rsi1 > 87.8964 )
									ret := -0.521739
						if( k > 85.3295 )
							ret := 0.444444
			if( smoothK_k > 84.8147 )
				if( VIM <= 0.820123 )
					if( VIP_VIM <= 0.336456 )
						if( d_k <= -5.27311 )
							if( d <= 84.7967 )
								ret := 0.333333
							if( d > 84.7967 )
								ret := 0.944444 // buy
						if( d_k > -5.27311 )
							if( smoothD_d <= 87.0446 )
								ret := -0.846154 // sell
							if( smoothD_d > 87.0446 )
								if( smoothD_d <= 95.3202 )
									ret := 0.387097
								if( smoothD_d > 95.3202 )
									ret := -0.210526
					if( VIP_VIM > 0.336456 )
						if( smoothD_d <= 88.6124 )
							if( smoothD_d <= 80.6985 )
								if( rsi1 <= 65.3246 )
									ret := -0.800000 // sell
								if( rsi1 > 65.3246 )
									ret := 0.107463
							if( smoothD_d > 80.6985 )
								if( smoothD_d <= 81.8672 )
									ret := -0.633803
								if( smoothD_d > 81.8672 )
									ret := -0.174699
						if( smoothD_d > 88.6124 )
							if( smoothD_d <= 95.9612 )
								if( VIM <= 0.645277 )
									ret := -0.074844
								if( VIM > 0.645277 )
									ret := 0.075697
							if( smoothD_d > 95.9612 )
								if( smoothK_k <= 95.9479 )
									ret := -0.562914
								if( smoothK_k > 95.9479 )
									ret := -0.052870
				if( VIM > 0.820123 )
					if( k <= 94.6494 )
						if( VIP <= 1.34307 )
							if( d_k <= 2.05027 )
								ret := 0.058824
							if( d_k > 2.05027 )
								ret := 0.833333 // buy
						if( VIP > 1.34307 )
							ret := 0.923077 // buy
					if( k > 94.6494 )
						if( smoothD_d <= 95.1014 )
							if( d <= 93.4784 )
								ret := 0.210526
							if( d > 93.4784 )
								ret := 0.625000
						if( smoothD_d > 95.1014 )
							ret := -0.291667
		if( VIM > 0.823471 )
			if( d_k <= 7.66727 )
				if( rsi1 <= 62.8758 )
					if( rsi1 <= 28.2896 )
						if( smoothK_k <= 75.4127 )
							if( VIP <= 1.27438 )
								if( d <= 69.8052 )
									ret := 0.116279
								if( d > 69.8052 )
									ret := -0.666667
							if( VIP > 1.27438 )
								ret := 1.000000 // buy
						if( smoothK_k > 75.4127 )
							if( VIM <= 1.2259 )
								ret := -0.047619
							if( VIM > 1.2259 )
								if( d_k <= -18.7012 )
									ret := 0.095238
								if( d_k > -18.7012 )
									ret := 0.737500 // buy
					if( rsi1 > 28.2896 )
						if( VIP_VIM <= 0.101827 )
							if( k <= 65.9502 )
								if( d <= 48.0805 )
									ret := 0.045455
								if( d > 48.0805 )
									ret := -0.447293
							if( k > 65.9502 )
								if( VIP_VIM <= -0.504495 )
									ret := -0.311275
								if( VIP_VIM > -0.504495 )
									ret := -0.084794
						if( VIP_VIM > 0.101827 )
							if( rsi1 <= 58.676 )
								if( d <= 41.9723 )
									ret := -0.809524 // sell
								if( d > 41.9723 )
									ret := 0.081426
							if( rsi1 > 58.676 )
								if( smoothD_d <= 84.0847 )
									ret := 0.005373
								if( smoothD_d > 84.0847 )
									ret := -0.162522
				if( rsi1 > 62.8758 )
					if( smoothD_d <= 47.9985 )
						if( d_k <= -19.3706 )
							if( VIP <= 1.17998 )
								if( VIP <= 1.09193 )
									ret := -0.294118
								if( VIP > 1.09193 )
									ret := 0.666667
							if( VIP > 1.17998 )
								if( VIP_VIM <= 0.065843 )
									ret := 0.130435
								if( VIP_VIM > 0.065843 )
									ret := -0.380952
						if( d_k > -19.3706 )
							if( k <= 65.4072 )
								ret := 1.000000 // buy
							if( k > 65.4072 )
								if( d <= 50.4519 )
									ret := 0.869565 // buy
								if( d > 50.4519 )
									ret := 0.352941
					if( smoothD_d > 47.9985 )
						if( VIP_VIM <= 0.717409 )
							if( d_k <= 4.73197 )
								if( d_k <= -28.2509 )
									ret := -0.545455
								if( d_k > -28.2509 )
									ret := -0.174380
							if( d_k > 4.73197 )
								if( rsi1 <= 74.2589 )
									ret := -0.075581
								if( rsi1 > 74.2589 )
									ret := 0.418367
						if( VIP_VIM > 0.717409 )
							if( d <= 93.8648 )
								if( rsi1 <= 65.1073 )
									ret := 0.589744
								if( rsi1 > 65.1073 )
									ret := -0.190981
							if( d > 93.8648 )
								if( smoothD_d <= 94.9304 )
									ret := 0.426396
								if( smoothD_d > 94.9304 )
									ret := 0.009901
			if( d_k > 7.66727 )
				if( smoothD_d <= 73.0293 )
					if( VIP_VIM <= 0.0997 )
						if( k <= 66.5879 )
							if( VIP <= 1.71113 )
								if( smoothK_k <= 61.7254 )
									ret := 0.411765
								if( smoothK_k > 61.7254 )
									ret := -0.021277
							if( VIP > 1.71113 )
								ret := -1.000000 // sell
						if( k > 66.5879 )
							ret := -0.846154 // sell
					if( VIP_VIM > 0.0997 )
						if( k <= 66.4907 )
							if( smoothD_d <= 70.884 )
								if( VIP <= 1.35858 )
									ret := -0.823529 // sell
								if( VIP > 1.35858 )
									ret := -1.000000 // sell
							if( smoothD_d > 70.884 )
								if( VIM <= 0.92556 )
									ret := -0.500000
								if( VIM > 0.92556 )
									ret := -0.800000 // sell
						if( k > 66.4907 )
							ret := -0.230769
				if( smoothD_d > 73.0293 )
					if( d <= 93.1764 )
						if( VIP <= 1.07826 )
							if( VIP <= 0.969453 )
								if( d_k <= 14.6303 )
									ret := 0.052174
								if( d_k > 14.6303 )
									ret := 0.420455
							if( VIP > 0.969453 )
								if( k <= 66.8262 )
									ret := -0.520833
								if( k > 66.8262 )
									ret := -0.155875
						if( VIP > 1.07826 )
							if( VIP_VIM <= -0.405591 )
								if( smoothK_k <= 66.5154 )
									ret := -0.105263
								if( smoothK_k > 66.5154 )
									ret := -0.600000
							if( VIP_VIM > -0.405591 )
								if( d <= 91.9522 )
									ret := 0.163972
								if( d > 91.9522 )
									ret := -0.135417
					if( d > 93.1764 )
						if( VIP <= 1.70958 )
							if( VIM <= 1.11568 )
								if( VIP_VIM <= 0.188173 )
									ret := 0.066667
								if( VIP_VIM > 0.188173 )
									ret := 0.864407 // buy
							if( VIM > 1.11568 )
								if( d_k <= 10.9502 )
									ret := 0.974359 // buy
								if( d_k > 10.9502 )
									ret := 0.800000 // buy
						if( VIP > 1.70958 )
							if( VIP_VIM <= 0.338744 )
								ret := 0.529412
							if( VIP_VIM > 0.338744 )
								if( VIM <= 1.20844 )
									ret := 0.090909
								if( VIM > 1.20844 )
									ret := -0.615385
	
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
float op_operation = decision_tree_0_CRWD_15Min_e96f91eb(d, d_k, smoothK_k, k, rsi1, smoothD_d, VIP, VIP_VIM, VIM)

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


