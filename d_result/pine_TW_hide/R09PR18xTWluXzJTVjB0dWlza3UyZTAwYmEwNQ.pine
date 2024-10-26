//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: GOOG_1Min_2SV0_2e00ba05 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GOOG_1Min_2SV0_2e00ba05", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GOOG_1Min_2e00ba05(d, d_k, smoothK_k, k, rsi1, smoothD_d, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( rsi1 <= 41.7893 )
		if( VIP <= 1.00017 )
			if( VIM <= 1.56767 )
				if( VIP <= 0.806812 )
					if( smoothK_k <= 13.6696 )
						if( VIM <= 1.36319 )
							if( rsi1 <= 20.2859 )
								if( VIP <= 0.649964 )
									ret := 0.105096
								if( VIP > 0.649964 )
									ret := -0.199721
							if( rsi1 > 20.2859 )
								if( smoothK_k <= -1.73269 )
									ret := 0.151270
								if( smoothK_k > -1.73269 )
									ret := 0.014768
						if( VIM > 1.36319 )
							if( rsi1 <= 7.90269 )
								if( rsi1 <= 6.26734 )
									ret := 0.026144
								if( rsi1 > 6.26734 )
									ret := -0.484375
							if( rsi1 > 7.90269 )
								if( smoothK_k <= 12.9771 )
									ret := 0.222102
								if( smoothK_k > 12.9771 )
									ret := -0.571429
					if( smoothK_k > 13.6696 )
						if( d_k <= 9.93427 )
							if( VIP <= 0.766674 )
								if( rsi1 <= 25.5515 )
									ret := -0.054759
								if( rsi1 > 25.5515 )
									ret := -0.225216
							if( VIP > 0.766674 )
								if( rsi1 <= 25.3175 )
									ret := 0.315789
								if( rsi1 > 25.3175 )
									ret := -0.051630
						if( d_k > 9.93427 )
							if( d <= 45.1795 )
								if( smoothD_d <= 30.2983 )
									ret := 0.451613
								if( smoothD_d > 30.2983 )
									ret := -0.242105
							if( d > 45.1795 )
								if( d_k <= 30.5535 )
									ret := 0.320896
								if( d_k > 30.5535 )
									ret := -0.538462
				if( VIP > 0.806812 )
					if( rsi1 <= 35.1698 )
						if( rsi1 <= 24.8589 )
							if( d_k <= -5.57074 )
								if( d <= 15.5639 )
									ret := 0.923077 // buy
								if( d > 15.5639 )
									ret := -0.166667
							if( d_k > -5.57074 )
								if( VIP_VIM <= -0.467985 )
									ret := 0.094595
								if( VIP_VIM > -0.467985 )
									ret := -0.250000
						if( rsi1 > 24.8589 )
							if( VIP <= 0.952907 )
								if( rsi1 <= 28.4287 )
									ret := 0.329596
								if( rsi1 > 28.4287 )
									ret := 0.119398
							if( VIP > 0.952907 )
								if( VIM <= 1.3477 )
									ret := 0.536082
								if( VIM > 1.3477 )
									ret := 0.241379
					if( rsi1 > 35.1698 )
						if( smoothD_d <= -0.452905 )
							if( VIP <= 0.869058 )
								if( d <= 0.791309 )
									ret := 0.257576
								if( d > 0.791309 )
									ret := -0.156863
							if( VIP > 0.869058 )
								if( VIM <= 1.09144 )
									ret := 0.000000
								if( VIM > 1.09144 )
									ret := -0.374233
						if( smoothD_d > -0.452905 )
							if( smoothD_d <= 0.85028 )
								if( VIP_VIM <= -0.3908 )
									ret := 0.913043 // buy
								if( VIP_VIM > -0.3908 )
									ret := 0.214724
							if( smoothD_d > 0.85028 )
								if( smoothK_k <= 12.6173 )
									ret := -0.006254
								if( smoothK_k > 12.6173 )
									ret := 0.083783
			if( VIM > 1.56767 )
				if( rsi1 <= 21.4787 )
					if( rsi1 <= 1.52746 )
						ret := -0.500000
					if( rsi1 > 1.52746 )
						if( VIP_VIM <= -0.940919 )
							if( smoothD_d <= 2.61459 )
								if( VIP <= 0.703276 )
									ret := 0.421053
								if( VIP > 0.703276 )
									ret := 0.807692 // buy
							if( smoothD_d > 2.61459 )
								if( smoothK_k <= 13.0847 )
									ret := 0.931034 // buy
								if( smoothK_k > 13.0847 )
									ret := 0.705882 // buy
						if( VIP_VIM > -0.940919 )
							if( smoothK_k <= 14.6235 )
								if( smoothD_d <= 5.55745 )
									ret := 0.080000
								if( smoothD_d > 5.55745 )
									ret := 0.750000 // buy
							if( smoothK_k > 14.6235 )
								if( rsi1 <= 19.4903 )
									ret := -0.583333
								if( rsi1 > 19.4903 )
									ret := 0.500000
				if( rsi1 > 21.4787 )
					if( VIM <= 1.82428 )
						if( d_k <= 5.42687 )
							if( smoothD_d <= 13.1369 )
								if( rsi1 <= 27.9188 )
									ret := 0.464286
								if( rsi1 > 27.9188 )
									ret := 0.000000
							if( smoothD_d > 13.1369 )
								if( smoothK_k <= 17.4825 )
									ret := -1.000000 // sell
								if( smoothK_k > 17.4825 )
									ret := -0.107527
						if( d_k > 5.42687 )
							if( rsi1 <= 27.5927 )
								if( k <= 39.4787 )
									ret := 0.823529 // buy
								if( k > 39.4787 )
									ret := -0.250000
							if( rsi1 > 27.5927 )
								if( VIP <= 0.936393 )
									ret := 0.129032
								if( VIP > 0.936393 )
									ret := 1.000000 // buy
					if( VIM > 1.82428 )
						if( rsi1 <= 31.4011 )
							if( smoothK_k <= 0.186006 )
								if( d <= 0.059271 )
									ret := -0.750000 // sell
								if( d > 0.059271 )
									ret := 0.166667
							if( smoothK_k > 0.186006 )
								if( rsi1 <= 24.6869 )
									ret := -0.772727 // sell
								if( rsi1 > 24.6869 )
									ret := -0.459459
						if( rsi1 > 31.4011 )
							if( VIM <= 1.90345 )
								if( VIP <= 0.869861 )
									ret := 0.800000 // buy
								if( VIP > 0.869861 )
									ret := -0.562500
							if( VIM > 1.90345 )
								if( VIP <= 0.950913 )
									ret := 0.200000
								if( VIP > 0.950913 )
									ret := 1.000000 // buy
		if( VIP > 1.00017 )
			if( smoothD_d <= 47.9173 )
				if( d_k <= -15.5737 )
					if( d_k <= -21.3955 )
						if( smoothK_k <= 64.8514 )
							if( d_k <= -23.1309 )
								ret := 1.000000 // buy
							if( d_k > -23.1309 )
								if( VIP <= 1.19067 )
									ret := 0.250000
								if( VIP > 1.19067 )
									ret := 0.750000 // buy
						if( smoothK_k > 64.8514 )
							if( rsi1 <= 38.1113 )
								ret := 0.250000
							if( rsi1 > 38.1113 )
								ret := -0.750000 // sell
					if( d_k > -21.3955 )
						if( d <= 43.707 )
							if( rsi1 <= 28.4157 )
								ret := 0.500000
							if( rsi1 > 28.4157 )
								if( smoothD_d <= 27.2878 )
									ret := -0.395349
								if( smoothD_d > 27.2878 )
									ret := -0.758621 // sell
						if( d > 43.707 )
							if( rsi1 <= 38.3375 )
								if( rsi1 <= 37.9579 )
									ret := 0.166667
								if( rsi1 > 37.9579 )
									ret := 1.000000 // buy
							if( rsi1 > 38.3375 )
								if( smoothD_d <= 45.3716 )
									ret := 0.428571
								if( smoothD_d > 45.3716 )
									ret := -0.750000 // sell
				if( d_k > -15.5737 )
					if( smoothD_d <= -2.56871 )
						if( VIM <= 3.72297 )
							if( d <= 0.070736 )
								if( VIP_VIM <= -0.500834 )
									ret := 0.760000 // buy
								if( VIP_VIM > -0.500834 )
									ret := 0.178571
							if( d > 0.070736 )
								if( rsi1 <= 21.2771 )
									ret := -0.642857
								if( rsi1 > 21.2771 )
									ret := 0.200000
						if( VIM > 3.72297 )
							if( rsi1 <= 11.6765 )
								if( rsi1 <= 9.52418 )
									ret := 0.400000
								if( rsi1 > 9.52418 )
									ret := 1.000000 // buy
							if( rsi1 > 11.6765 )
								if( VIM <= 10.305 )
									ret := -0.500000
								if( VIM > 10.305 )
									ret := 0.125000
					if( smoothD_d > -2.56871 )
						if( smoothD_d <= -1.79208 )
							if( VIM <= 44.5679 )
								if( VIM <= 2.09081 )
									ret := 0.129032
								if( VIM > 2.09081 )
									ret := 0.613497
							if( VIM > 44.5679 )
								ret := -1.000000 // sell
						if( smoothD_d > -1.79208 )
							if( VIP_VIM <= 1.34656 )
								if( rsi1 <= 29.1573 )
									ret := 0.257979
								if( rsi1 > 29.1573 )
									ret := 0.149162
							if( VIP_VIM > 1.34656 )
								if( VIP <= 6.10802 )
									ret := -0.909091 // sell
								if( VIP > 6.10802 )
									ret := -0.170732
			if( smoothD_d > 47.9173 )
				if( k <= 90.1771 )
					if( smoothK_k <= 65.5264 )
						if( d_k <= 26.42 )
							if( VIM <= 12.5526 )
								if( smoothD_d <= 49.541 )
									ret := 0.578313
								if( smoothD_d > 49.541 )
									ret := 0.234168
							if( VIM > 12.5526 )
								if( VIM <= 18.0032 )
									ret := -0.457143
								if( VIM > 18.0032 )
									ret := 0.636364
						if( d_k > 26.42 )
							if( d <= 70.5896 )
								if( smoothK_k <= 22.2938 )
									ret := 0.466667
								if( smoothK_k > 22.2938 )
									ret := 0.792453 // buy
							if( d > 70.5896 )
								ret := 0.142857
					if( smoothK_k > 65.5264 )
						if( rsi1 <= 32.486 )
							if( VIP_VIM <= -0.111987 )
								if( VIP_VIM <= -0.733626 )
									ret := 0.720000 // buy
								if( VIP_VIM > -0.733626 )
									ret := 0.944444 // buy
							if( VIP_VIM > -0.111987 )
								ret := 0.200000
						if( rsi1 > 32.486 )
							if( k <= 80.872 )
								if( VIM <= 1.06202 )
									ret := -0.750000 // sell
								if( VIM > 1.06202 )
									ret := 0.496032
							if( k > 80.872 )
								if( VIM <= 3.63724 )
									ret := -0.087719
								if( VIM > 3.63724 )
									ret := 0.695652
				if( k > 90.1771 )
					if( smoothD_d <= 71.4372 )
						if( smoothD_d <= 68.2518 )
							ret := -0.250000
						if( smoothD_d > 68.2518 )
							ret := -1.000000 // sell
					if( smoothD_d > 71.4372 )
						if( rsi1 <= 32.6889 )
							if( smoothD_d <= 81.9759 )
								ret := 1.000000 // buy
							if( smoothD_d > 81.9759 )
								ret := 0.428571
						if( rsi1 > 32.6889 )
							if( d <= 92.8428 )
								if( smoothK_k <= 91.0471 )
									ret := -0.500000
								if( smoothK_k > 91.0471 )
									ret := -0.037037
							if( d > 92.8428 )
								if( smoothD_d <= 92.4291 )
									ret := 0.700000 // buy
								if( smoothD_d > 92.4291 )
									ret := -0.333333
	if( rsi1 > 41.7893 )
		if( smoothD_d <= 11.8908 )
			if( VIP_VIM <= -0.799568 )
				if( d <= 4.87751 )
					if( rsi1 <= 46.1377 )
						if( smoothK_k <= 4.66038 )
							ret := 0.500000
						if( smoothK_k > 4.66038 )
							ret := 0.500000
					if( rsi1 > 46.1377 )
						ret := -0.166667
				if( d > 4.87751 )
					if( d_k <= -8.32355 )
						if( rsi1 <= 58.7306 )
							if( rsi1 <= 44.0835 )
								ret := 0.000000
							if( rsi1 > 44.0835 )
								ret := 0.714286 // buy
						if( rsi1 > 58.7306 )
							ret := -0.750000 // sell
					if( d_k > -8.32355 )
						if( rsi1 <= 45.1899 )
							if( VIM <= 4.19693 )
								if( VIM <= 2.44425 )
									ret := -0.750000 // sell
								if( VIM > 2.44425 )
									ret := -0.142857
							if( VIM > 4.19693 )
								if( k <= 8.02814 )
									ret := -1.000000 // sell
								if( k > 8.02814 )
									ret := -0.782609 // sell
						if( rsi1 > 45.1899 )
							if( VIP_VIM <= -1.11954 )
								if( d_k <= -1.12032 )
									ret := -0.714286 // sell
								if( d_k > -1.12032 )
									ret := -0.200000
							if( VIP_VIM > -1.11954 )
								if( VIM <= 7.7667 )
									ret := 0.100000
								if( VIM > 7.7667 )
									ret := -0.285714
			if( VIP_VIM > -0.799568 )
				if( VIM <= 1.07565 )
					if( VIP <= 0.94916 )
						if( d <= 11.6182 )
							if( k <= 1.93298 )
								if( k <= 1.27479 )
									ret := 0.390244
								if( k > 1.27479 )
									ret := 0.875000 // buy
							if( k > 1.93298 )
								if( smoothK_k <= 18.1145 )
									ret := 0.157447
								if( smoothK_k > 18.1145 )
									ret := 0.681818
						if( d > 11.6182 )
							if( smoothD_d <= 11.1116 )
								if( VIP_VIM <= -0.04658 )
									ret := -0.438356
								if( VIP_VIM > -0.04658 )
									ret := 0.400000
							if( smoothD_d > 11.1116 )
								if( VIP_VIM <= -0.156441 )
									ret := -0.400000
								if( VIP_VIM > -0.156441 )
									ret := 0.562500
					if( VIP > 0.94916 )
						if( d_k <= 1.66671 )
							if( smoothD_d <= 5.26171 )
								if( VIP_VIM <= 0.305058 )
									ret := -0.163934
								if( VIP_VIM > 0.305058 )
									ret := 0.240000
							if( smoothD_d > 5.26171 )
								if( rsi1 <= 60.0026 )
									ret := 0.093511
								if( rsi1 > 60.0026 )
									ret := -0.200000
						if( d_k > 1.66671 )
							if( d_k <= 11.1169 )
								if( k <= 7.41766 )
									ret := 0.162050
								if( k > 7.41766 )
									ret := -0.233645
							if( d_k > 11.1169 )
								if( VIM <= 0.979575 )
									ret := -0.175000
								if( VIM > 0.979575 )
									ret := -0.600000
				if( VIM > 1.07565 )
					if( VIP <= 2.02889 )
						if( d_k <= 11.7038 )
							if( VIP <= 0.917093 )
								if( smoothK_k <= 17.155 )
									ret := -0.024823
								if( smoothK_k > 17.155 )
									ret := 0.390244
							if( VIP > 0.917093 )
								if( smoothD_d <= 2.69529 )
									ret := -0.286550
								if( smoothD_d > 2.69529 )
									ret := -0.103896
						if( d_k > 11.7038 )
							if( d_k <= 12.9705 )
								ret := -1.000000 // sell
							if( d_k > 12.9705 )
								if( VIP_VIM <= -0.12797 )
									ret := -0.833333 // sell
								if( VIP_VIM > -0.12797 )
									ret := -0.400000
					if( VIP > 2.02889 )
						if( VIP_VIM <= 0.251239 )
							if( smoothD_d <= 0.173393 )
								if( d <= 2.7364 )
									ret := 0.409836
								if( d > 2.7364 )
									ret := 0.941176 // buy
							if( smoothD_d > 0.173393 )
								if( VIP_VIM <= 0.230951 )
									ret := 0.023102
								if( VIP_VIM > 0.230951 )
									ret := 0.636364
						if( VIP_VIM > 0.251239 )
							if( VIM <= 59.7097 )
								if( smoothK_k <= -2.66204 )
									ret := -0.571429
								if( smoothK_k > -2.66204 )
									ret := -0.061093
							if( VIM > 59.7097 )
								ret := -1.000000 // sell
		if( smoothD_d > 11.8908 )
			if( rsi1 <= 52.8763 )
				if( VIP <= 1.16559 )
					if( k <= 77.4257 )
						if( smoothK_k <= 11.0127 )
							if( VIP <= 1.0851 )
								if( VIP <= 0.994818 )
									ret := -0.171694
								if( VIP > 0.994818 )
									ret := 0.063910
							if( VIP > 1.0851 )
								if( smoothD_d <= 13.279 )
									ret := 0.400000
								if( smoothD_d > 13.279 )
									ret := -0.628571
						if( smoothK_k > 11.0127 )
							if( k <= 75.1018 )
								if( d <= 66.5637 )
									ret := 0.082287
								if( d > 66.5637 )
									ret := -0.011323
							if( k > 75.1018 )
								if( d_k <= 7.33281 )
									ret := 0.322957
								if( d_k > 7.33281 )
									ret := -0.056604
					if( k > 77.4257 )
						if( VIM <= 1.24298 )
							if( smoothK_k <= 96.8818 )
								if( d_k <= -6.69673 )
									ret := 0.046107
								if( d_k > -6.69673 )
									ret := -0.126461
							if( smoothK_k > 96.8818 )
								if( d_k <= -15.125 )
									ret := -0.343750
								if( d_k > -15.125 )
									ret := 0.275424
						if( VIM > 1.24298 )
							if( d <= 64.9903 )
								if( d <= 54.8309 )
									ret := 0.800000 // buy
								if( d > 54.8309 )
									ret := -0.500000
							if( d > 64.9903 )
								if( smoothK_k <= 81.3359 )
									ret := 0.176471
								if( smoothK_k > 81.3359 )
									ret := 0.638889
				if( VIP > 1.16559 )
					if( d <= 80.3413 )
						if( smoothD_d <= 19.04 )
							if( d_k <= -2.27841 )
								if( k <= 32.0364 )
									ret := 0.299492
								if( k > 32.0364 )
									ret := -0.217391
							if( d_k > -2.27841 )
								if( smoothD_d <= 13.4564 )
									ret := 0.189655
								if( smoothD_d > 13.4564 )
									ret := -0.287879
						if( smoothD_d > 19.04 )
							if( d <= 35.8303 )
								if( d <= 32.1369 )
									ret := 0.155666
								if( d > 32.1369 )
									ret := 0.435737
							if( d > 35.8303 )
								if( d <= 62.8303 )
									ret := 0.033691
								if( d > 62.8303 )
									ret := 0.155294
					if( d > 80.3413 )
						if( VIP_VIM <= -0.052189 )
							if( d <= 98.4938 )
								if( d_k <= 6.76721 )
									ret := 0.476471
								if( d_k > 6.76721 )
									ret := 0.179245
							if( d > 98.4938 )
								if( d_k <= 1.07763 )
									ret := -0.090909
								if( d_k > 1.07763 )
									ret := -1.000000 // sell
						if( VIP_VIM > -0.052189 )
							if( k <= 92.0607 )
								if( d_k <= 10.1282 )
									ret := 0.347267
								if( d_k > 10.1282 )
									ret := -0.086538
							if( k > 92.0607 )
								if( d_k <= -9.77071 )
									ret := 0.714286 // buy
								if( d_k > -9.77071 )
									ret := -0.264151
			if( rsi1 > 52.8763 )
				if( d_k <= -0.059637 )
					if( VIP <= 1.31348 )
						if( k <= 20.8301 )
							if( rsi1 <= 59.0722 )
								if( VIP_VIM <= -0.002198 )
									ret := -0.333333
								if( VIP_VIM > -0.002198 )
									ret := 0.818182 // buy
							if( rsi1 > 59.0722 )
								if( d_k <= -0.947548 )
									ret := -0.266667
								if( d_k > -0.947548 )
									ret := 0.714286 // buy
						if( k > 20.8301 )
							if( VIM <= 0.736556 )
								if( smoothK_k <= 21.0084 )
									ret := -1.000000 // sell
								if( smoothK_k > 21.0084 )
									ret := 0.167513
							if( VIM > 0.736556 )
								if( rsi1 <= 84.3084 )
									ret := 0.007746
								if( rsi1 > 84.3084 )
									ret := -0.666667
					if( VIP > 1.31348 )
						if( rsi1 <= 90.4913 )
							if( smoothK_k <= 49.5866 )
								if( VIP_VIM <= 1.48486 )
									ret := -0.216162
								if( VIP_VIM > 1.48486 )
									ret := 0.440678
							if( smoothK_k > 49.5866 )
								if( k <= 91.8076 )
									ret := 0.024748
								if( k > 91.8076 )
									ret := -0.128759
						if( rsi1 > 90.4913 )
							if( VIP_VIM <= 0.726537 )
								if( d <= 98.6468 )
									ret := 0.000000
								if( d > 98.6468 )
									ret := -0.800000 // sell
							if( VIP_VIM > 0.726537 )
								if( smoothK_k <= 94.3735 )
									ret := 0.025000
								if( smoothK_k > 94.3735 )
									ret := 0.481752
				if( d_k > -0.059637 )
					if( VIM <= 0.678934 )
						if( VIM <= 0.525092 )
							if( k <= 89.9193 )
								if( smoothK_k <= 74.7552 )
									ret := 0.250000
								if( smoothK_k > 74.7552 )
									ret := 0.769231 // buy
							if( k > 89.9193 )
								if( d_k <= -0.013841 )
									ret := 1.000000 // buy
								if( d_k > -0.013841 )
									ret := -0.390071
						if( VIM > 0.525092 )
							if( VIP <= 1.5672 )
								if( rsi1 <= 88.8355 )
									ret := 0.135903
								if( rsi1 > 88.8355 )
									ret := 0.406417
							if( VIP > 1.5672 )
								if( smoothK_k <= 92.2133 )
									ret := 0.827586 // buy
								if( smoothK_k > 92.2133 )
									ret := 0.111111
					if( VIM > 0.678934 )
						if( rsi1 <= 86.8183 )
							if( k <= 99.8686 )
								if( rsi1 <= 86.0726 )
									ret := 0.032332
								if( rsi1 > 86.0726 )
									ret := 0.625000
							if( k > 99.8686 )
								if( rsi1 <= 78.178 )
									ret := 0.067010
								if( rsi1 > 78.178 )
									ret := 0.514851
						if( rsi1 > 86.8183 )
							if( d <= 92.4685 )
								if( smoothK_k <= 83.7052 )
									ret := -0.400000
								if( smoothK_k > 83.7052 )
									ret := -0.944444 // sell
							if( d > 92.4685 )
								if( smoothK_k <= 89.844 )
									ret := 0.625000
								if( smoothK_k > 89.844 )
									ret := -0.250000
	
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
float op_operation = decision_tree_0_GOOG_1Min_2e00ba05(d, d_k, smoothK_k, k, rsi1, smoothD_d, VIP, VIP_VIM, VIM)

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


