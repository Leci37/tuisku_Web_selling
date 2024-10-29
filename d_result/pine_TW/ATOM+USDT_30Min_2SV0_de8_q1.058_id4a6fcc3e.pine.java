//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: ATOMUSDT_30Min_2SV0_4a6fcc3e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ATOMUSDT_30Min_2SV0_4a6fcc3e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ATOMUSDT_30Min_4a6fcc3e(rsi1, smoothK_k, d_k, k, d, smoothD_d, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( rsi1 <= 48.7179 )
		if( d_k <= -3.39749 )
			if( VIP_VIM <= -0.221034 )
				if( k <= 18.6254 )
					if( rsi1 <= 21.5585 )
						if( VIP_VIM <= -0.823195 )
							if( d_k <= -5.4756 )
								if( d <= 7.02943 )
									ret := 1.000000 // buy
								if( d > 7.02943 )
									ret := 0.750000 // buy
							if( d_k > -5.4756 )
								if( d <= 9.46384 )
									ret := 0.166667
								if( d > 9.46384 )
									ret := -0.250000
						if( VIP_VIM > -0.823195 )
							if( VIM <= 1.258 )
								if( rsi1 <= 20.8148 )
									ret := -0.900000 // sell
								if( rsi1 > 20.8148 )
									ret := -0.500000
							if( VIM > 1.258 )
								if( rsi1 <= 17.2961 )
									ret := -0.720930 // sell
								if( rsi1 > 17.2961 )
									ret := -0.243590
					if( rsi1 > 21.5585 )
						if( VIP_VIM <= -0.344546 )
							if( rsi1 <= 27.9483 )
								if( smoothK_k <= 4.55158 )
									ret := 0.756757 // buy
								if( smoothK_k > 4.55158 )
									ret := -0.068273
							if( rsi1 > 27.9483 )
								if( d <= 3.85546 )
									ret := -0.310345
								if( d > 3.85546 )
									ret := 0.437186
						if( VIP_VIM > -0.344546 )
							if( rsi1 <= 33.1791 )
								if( smoothD_d <= 1.9984 )
									ret := -0.754386 // sell
								if( smoothD_d > 1.9984 )
									ret := -0.287129
							if( rsi1 > 33.1791 )
								if( VIP <= 0.852684 )
									ret := 0.349206
								if( VIP > 0.852684 )
									ret := 0.111702
				if( k > 18.6254 )
					if( rsi1 <= 35.21 )
						if( VIP_VIM <= -0.413592 )
							if( rsi1 <= 27.0417 )
								if( smoothK_k <= 35.3338 )
									ret := 0.096045
								if( smoothK_k > 35.3338 )
									ret := -0.333333
							if( rsi1 > 27.0417 )
								if( d <= 23.2654 )
									ret := 0.449275
								if( d > 23.2654 )
									ret := 0.172030
						if( VIP_VIM > -0.413592 )
							if( smoothD_d <= 48.3343 )
								if( smoothK_k <= 24.5335 )
									ret := -0.004878
								if( smoothK_k > 24.5335 )
									ret := -0.342857
							if( smoothD_d > 48.3343 )
								if( smoothD_d <= 66.3 )
									ret := 0.213115
								if( smoothD_d > 66.3 )
									ret := -0.390244
					if( rsi1 > 35.21 )
						if( VIP <= 0.824832 )
							if( VIP <= 0.782279 )
								if( d_k <= -8.89196 )
									ret := 0.620456
								if( d_k > -8.89196 )
									ret := 0.405018
							if( VIP > 0.782279 )
								if( rsi1 <= 37.8907 )
									ret := 0.159483
								if( rsi1 > 37.8907 )
									ret := 0.488722
						if( VIP > 0.824832 )
							if( smoothK_k <= 49.476 )
								if( rsi1 <= 43.8815 )
									ret := 0.306096
								if( rsi1 > 43.8815 )
									ret := 0.509740
							if( smoothK_k > 49.476 )
								if( rsi1 <= 40.8353 )
									ret := -0.024316
								if( rsi1 > 40.8353 )
									ret := 0.241798
			if( VIP_VIM > -0.221034 )
				if( rsi1 <= 39.7669 )
					if( d <= 31.6235 )
						if( VIM <= 1.15441 )
							if( rsi1 <= 35.5384 )
								if( VIP_VIM <= -0.076845 )
									ret := -0.607509
								if( VIP_VIM > -0.076845 )
									ret := -0.753555 // sell
							if( rsi1 > 35.5384 )
								if( d_k <= -3.57533 )
									ret := -0.448087
								if( d_k > -3.57533 )
									ret := 0.200000
						if( VIM > 1.15441 )
							if( d_k <= -4.18331 )
								ret := 0.000000
							if( d_k > -4.18331 )
								ret := 0.500000
					if( d > 31.6235 )
						if( VIP <= 0.903707 )
							if( d_k <= -5.51442 )
								if( VIP_VIM <= -0.214293 )
									ret := 0.000000
								if( VIP_VIM > -0.214293 )
									ret := -0.875000 // sell
							if( d_k > -5.51442 )
								if( VIM <= 1.07715 )
									ret := 0.000000
								if( VIM > 1.07715 )
									ret := 1.000000 // buy
						if( VIP > 0.903707 )
							if( k <= 55.8292 )
								if( VIP <= 0.911095 )
									ret := 0.111111
								if( VIP > 0.911095 )
									ret := -0.346154
							if( k > 55.8292 )
								if( d <= 78.9047 )
									ret := 0.568182
								if( d > 78.9047 )
									ret := -0.571429
				if( rsi1 > 39.7669 )
					if( VIP_VIM <= -0.04948 )
						if( VIP <= 0.898158 )
							if( d_k <= -8.70621 )
								if( k <= 92.9143 )
									ret := 0.092593
								if( k > 92.9143 )
									ret := -0.700000 // sell
							if( d_k > -8.70621 )
								if( smoothK_k <= 6.46332 )
									ret := -0.800000 // sell
								if( smoothK_k > 6.46332 )
									ret := 0.504950
						if( VIP > 0.898158 )
							if( rsi1 <= 43.4156 )
								if( VIM <= 1.02393 )
									ret := -0.578947
								if( VIM > 1.02393 )
									ret := -0.112288
							if( rsi1 > 43.4156 )
								if( d_k <= -11.6567 )
									ret := -0.109145
								if( d_k > -11.6567 )
									ret := 0.175214
					if( VIP_VIM > -0.04948 )
						if( VIM <= 1.05093 )
							if( d_k <= -7.23259 )
								if( smoothD_d <= 29.6504 )
									ret := -0.453061
								if( smoothD_d > 29.6504 )
									ret := -0.114583
							if( d_k > -7.23259 )
								if( rsi1 <= 47.4447 )
									ret := -0.259819
								if( rsi1 > 47.4447 )
									ret := 0.055556
						if( VIM > 1.05093 )
							if( VIM <= 1.05967 )
								if( d <= 36.7289 )
									ret := 1.000000 // buy
								if( d > 36.7289 )
									ret := 0.500000
							if( VIM > 1.05967 )
								if( VIP_VIM <= -0.037188 )
									ret := -0.500000
								if( VIP_VIM > -0.037188 )
									ret := 0.400000
		if( d_k > -3.39749 )
			if( rsi1 <= 34.7743 )
				if( VIM <= 1.13304 )
					if( rsi1 <= 31.5119 )
						if( VIP <= 0.630789 )
							if( smoothK_k <= 8.5581 )
								ret := 1.000000 // buy
							if( smoothK_k > 8.5581 )
								ret := 0.750000 // buy
						if( VIP > 0.630789 )
							if( d_k <= 3.6703 )
								if( rsi1 <= 21.0858 )
									ret := -0.746888 // sell
								if( rsi1 > 21.0858 )
									ret := -0.584538
							if( d_k > 3.6703 )
								if( VIP_VIM <= -0.317767 )
									ret := 0.095238
								if( VIP_VIM > -0.317767 )
									ret := -0.733122 // sell
					if( rsi1 > 31.5119 )
						if( VIP <= 0.92097 )
							if( k <= 4.01324 )
								if( smoothK_k <= -2.7379 )
									ret := -0.440000
								if( smoothK_k > -2.7379 )
									ret := 0.355556
							if( k > 4.01324 )
								if( smoothK_k <= 36.628 )
									ret := -0.329298
								if( smoothK_k > 36.628 )
									ret := -0.635714
						if( VIP > 0.92097 )
							if( VIP_VIM <= -0.047655 )
								if( VIM <= 1.0951 )
									ret := -0.569264
								if( VIM > 1.0951 )
									ret := -0.212121
							if( VIP_VIM > -0.047655 )
								if( d <= 15.3817 )
									ret := -0.616935
								if( d > 15.3817 )
									ret := -0.751092 // sell
				if( VIM > 1.13304 )
					if( rsi1 <= 17.7298 )
						if( VIP <= 0.682012 )
							if( d_k <= 0.41009 )
								if( smoothD_d <= 1.28038 )
									ret := -0.721212 // sell
								if( smoothD_d > 1.28038 )
									ret := -0.122807
							if( d_k > 0.41009 )
								if( k <= 2.70667 )
									ret := 0.461538
								if( k > 2.70667 )
									ret := -0.583333
						if( VIP > 0.682012 )
							if( k <= 0.681576 )
								if( VIP <= 0.717677 )
									ret := -0.674419
								if( VIP > 0.717677 )
									ret := -0.887240 // sell
							if( k > 0.681576 )
								if( rsi1 <= 12.6745 )
									ret := -0.818182 // sell
								if( rsi1 > 12.6745 )
									ret := -0.655385
					if( rsi1 > 17.7298 )
						if( VIP_VIM <= -0.419502 )
							if( k <= 1.51965 )
								if( VIP <= 0.760829 )
									ret := 0.542857
								if( VIP > 0.760829 )
									ret := -0.285714
							if( k > 1.51965 )
								if( rsi1 <= 21.7936 )
									ret := -0.450363
								if( rsi1 > 21.7936 )
									ret := -0.076344
						if( VIP_VIM > -0.419502 )
							if( rsi1 <= 31.9719 )
								if( rsi1 <= 22.8049 )
									ret := -0.667526
								if( rsi1 > 22.8049 )
									ret := -0.386432
							if( rsi1 > 31.9719 )
								if( d <= 18.0573 )
									ret := 0.246914
								if( d > 18.0573 )
									ret := -0.287975
			if( rsi1 > 34.7743 )
				if( VIP_VIM <= -0.004345 )
					if( VIP <= 0.887487 )
						if( VIP <= 0.810279 )
							if( smoothD_d <= 50.2284 )
								if( VIP <= 0.781046 )
									ret := 0.673077
								if( VIP > 0.781046 )
									ret := 0.397849
							if( smoothD_d > 50.2284 )
								if( rsi1 <= 38.8212 )
									ret := 0.098039
								if( rsi1 > 38.8212 )
									ret := 0.421053
						if( VIP > 0.810279 )
							if( rsi1 <= 42.9745 )
								if( k <= 67.6929 )
									ret := 0.074928
								if( k > 67.6929 )
									ret := -0.273684
							if( rsi1 > 42.9745 )
								if( d_k <= -3.0684 )
									ret := -0.166667
								if( d_k > -3.0684 )
									ret := 0.304110
					if( VIP > 0.887487 )
						if( rsi1 <= 39.4493 )
							if( VIP <= 0.935742 )
								if( d_k <= 13.3032 )
									ret := -0.301305
								if( d_k > 13.3032 )
									ret := 0.121212
							if( VIP > 0.935742 )
								if( smoothD_d <= -1.24046 )
									ret := 0.162162
								if( smoothD_d > -1.24046 )
									ret := -0.523203
						if( rsi1 > 39.4493 )
							if( d <= 43.9243 )
								if( rsi1 <= 46.9995 )
									ret := -0.000536
								if( rsi1 > 46.9995 )
									ret := 0.259843
							if( d > 43.9243 )
								if( VIM <= 1.05347 )
									ret := -0.256607
								if( VIM > 1.05347 )
									ret := -0.052768
				if( VIP_VIM > -0.004345 )
					if( d_k <= 4.0749 )
						if( VIP_VIM <= 0.090074 )
							if( smoothD_d <= -2.36715 )
								if( VIP <= 1.03865 )
									ret := -0.757576 // sell
								if( VIP > 1.03865 )
									ret := -0.200000
							if( smoothD_d > -2.36715 )
								if( rsi1 <= 43.8897 )
									ret := -0.329759
								if( rsi1 > 43.8897 )
									ret := -0.085586
						if( VIP_VIM > 0.090074 )
							if( rsi1 <= 38.306 )
								if( d_k <= -1.97303 )
									ret := -0.100000
								if( d_k > -1.97303 )
									ret := -0.579235
							if( rsi1 > 38.306 )
								if( d_k <= 3.28781 )
									ret := -0.346294
								if( d_k > 3.28781 )
									ret := 0.000000
					if( d_k > 4.0749 )
						if( rsi1 <= 45.9014 )
							if( VIM <= 1.00883 )
								if( d_k <= 6.8173 )
									ret := -0.479070
								if( d_k > 6.8173 )
									ret := -0.635563
							if( VIM > 1.00883 )
								if( smoothK_k <= 20.8609 )
									ret := -0.161290
								if( smoothK_k > 20.8609 )
									ret := -0.462121
						if( rsi1 > 45.9014 )
							if( VIP_VIM <= 0.125633 )
								if( smoothK_k <= 49.5829 )
									ret := -0.052758
								if( smoothK_k > 49.5829 )
									ret := -0.346491
							if( VIP_VIM > 0.125633 )
								if( k <= 9.71544 )
									ret := -0.661184
								if( k > 9.71544 )
									ret := -0.471637
	if( rsi1 > 48.7179 )
		if( d_k <= 4.14323 )
			if( rsi1 <= 61.1544 )
				if( VIP_VIM <= -0.001606 )
					if( VIP <= 0.928684 )
						if( smoothD_d <= 67.729 )
							if( VIP <= 0.867373 )
								if( smoothD_d <= 28.8128 )
									ret := 0.845070 // buy
								if( smoothD_d > 28.8128 )
									ret := 0.717122 // buy
							if( VIP > 0.867373 )
								if( rsi1 <= 50.8703 )
									ret := 0.455729
								if( rsi1 > 50.8703 )
									ret := 0.631101
						if( smoothD_d > 67.729 )
							if( rsi1 <= 53.378 )
								if( smoothK_k <= 94.8357 )
									ret := 0.271898
								if( smoothK_k > 94.8357 )
									ret := 0.521898
							if( rsi1 > 53.378 )
								if( d <= 94.5448 )
									ret := 0.607465
								if( d > 94.5448 )
									ret := 0.334630
					if( VIP > 0.928684 )
						if( rsi1 <= 53.196 )
							if( d_k <= -25.3178 )
								if( VIP_VIM <= -0.139097 )
									ret := 0.250000
								if( VIP_VIM > -0.139097 )
									ret := -0.833333 // sell
							if( d_k > -25.3178 )
								if( k <= 75.5416 )
									ret := 0.278424
								if( k > 75.5416 )
									ret := 0.091900
						if( rsi1 > 53.196 )
							if( d <= 62.8674 )
								if( smoothD_d <= 25.4703 )
									ret := 0.685714
								if( smoothD_d > 25.4703 )
									ret := 0.528302
							if( d > 62.8674 )
								if( VIM <= 1.04203 )
									ret := 0.302479
								if( VIM > 1.04203 )
									ret := 0.452967
				if( VIP_VIM > -0.001606 )
					if( VIP <= 1.08295 )
						if( rsi1 <= 56.8677 )
							if( VIP_VIM <= 0.066394 )
								if( rsi1 <= 53.619 )
									ret := 0.056509
								if( rsi1 > 53.619 )
									ret := 0.225309
							if( VIP_VIM > 0.066394 )
								if( k <= 16.2254 )
									ret := 0.132132
								if( k > 16.2254 )
									ret := -0.097173
						if( rsi1 > 56.8677 )
							if( k <= 45.536 )
								if( VIM <= 0.905345 )
									ret := 0.176471
								if( VIM > 0.905345 )
									ret := 0.520305
							if( k > 45.536 )
								if( VIM <= 0.943344 )
									ret := 0.133333
								if( VIM > 0.943344 )
									ret := 0.378571
					if( VIP > 1.08295 )
						if( VIM <= 0.80389 )
							if( d_k <= -5.27926 )
								if( d <= 32.26 )
									ret := -0.086957
								if( d > 32.26 )
									ret := 0.500000
							if( d_k > -5.27926 )
								if( VIM <= 0.755107 )
									ret := -0.503759
								if( VIM > 0.755107 )
									ret := -0.305195
						if( VIM > 0.80389 )
							if( VIP_VIM <= 0.120395 )
								if( d_k <= -0.317779 )
									ret := 0.047059
								if( d_k > -0.317779 )
									ret := 0.530303
							if( VIP_VIM > 0.120395 )
								if( rsi1 <= 53.7535 )
									ret := -0.231405
								if( rsi1 > 53.7535 )
									ret := -0.017219
			if( rsi1 > 61.1544 )
				if( VIP_VIM <= 0.227953 )
					if( d_k <= -5.00749 )
						if( rsi1 <= 70.2476 )
							if( VIP <= 1.09576 )
								if( VIP <= 0.993637 )
									ret := 0.730315 // buy
								if( VIP > 0.993637 )
									ret := 0.606231
							if( VIP > 1.09576 )
								if( d_k <= -9.95016 )
									ret := 0.121019
								if( d_k > -9.95016 )
									ret := 0.556291
						if( rsi1 > 70.2476 )
							if( rsi1 <= 89.4823 )
								if( VIP_VIM <= -0.39559 )
									ret := 0.272727
								if( VIP_VIM > -0.39559 )
									ret := 0.781457 // buy
							if( rsi1 > 89.4823 )
								ret := 0.000000
					if( d_k > -5.00749 )
						if( rsi1 <= 69.2022 )
							if( VIP_VIM <= 0.018652 )
								if( smoothD_d <= 91.9528 )
									ret := 0.427083
								if( smoothD_d > 91.9528 )
									ret := 0.632727
							if( VIP_VIM > 0.018652 )
								if( d_k <= 1.24284 )
									ret := 0.462698
								if( d_k > 1.24284 )
									ret := 0.281768
						if( rsi1 > 69.2022 )
							if( rsi1 <= 73.2208 )
								if( smoothK_k <= 93.8983 )
									ret := 0.509235
								if( smoothK_k > 93.8983 )
									ret := 0.665848
							if( rsi1 > 73.2208 )
								if( d <= 86.2292 )
									ret := 0.318182
								if( d > 86.2292 )
									ret := 0.728287 // buy
				if( VIP_VIM > 0.227953 )
					if( k <= 96.1324 )
						if( rsi1 <= 72.263 )
							if( d_k <= -14.4922 )
								if( smoothK_k <= 58.5026 )
									ret := -0.031746
								if( smoothK_k > 58.5026 )
									ret := -0.365217
							if( d_k > -14.4922 )
								if( VIP_VIM <= 0.523273 )
									ret := 0.240794
								if( VIP_VIM > 0.523273 )
									ret := -0.227979
						if( rsi1 > 72.263 )
							if( VIP <= 1.17229 )
								if( smoothD_d <= 15.6584 )
									ret := -0.166667
								if( smoothD_d > 15.6584 )
									ret := 0.673969
							if( VIP > 1.17229 )
								if( rsi1 <= 76.4339 )
									ret := 0.229977
								if( rsi1 > 76.4339 )
									ret := 0.480162
					if( k > 96.1324 )
						if( rsi1 <= 72.8248 )
							if( VIM <= 0.810263 )
								if( VIP <= 1.13151 )
									ret := 0.500000
								if( VIP > 1.13151 )
									ret := -0.195876
							if( VIM > 0.810263 )
								if( rsi1 <= 68.2759 )
									ret := -0.049505
								if( rsi1 > 68.2759 )
									ret := 0.458763
						if( rsi1 > 72.8248 )
							if( VIM <= 0.805844 )
								if( rsi1 <= 89.0879 )
									ret := 0.409794
								if( rsi1 > 89.0879 )
									ret := 0.857143 // buy
							if( VIM > 0.805844 )
								if( VIP <= 1.14732 )
									ret := 0.791549 // buy
								if( VIP > 1.14732 )
									ret := 0.656566
		if( d_k > 4.14323 )
			if( rsi1 <= 68.6238 )
				if( VIM <= 0.84233 )
					if( rsi1 <= 63.9722 )
						if( d_k <= 16.4007 )
							if( k <= 54.5015 )
								if( VIP_VIM <= 0.472628 )
									ret := -0.143766
								if( VIP_VIM > 0.472628 )
									ret := -0.420339
							if( k > 54.5015 )
								if( smoothD_d <= 89.5787 )
									ret := -0.435862
								if( smoothD_d > 89.5787 )
									ret := 0.093750
						if( d_k > 16.4007 )
							if( VIP_VIM <= 0.381767 )
								if( rsi1 <= 53.3888 )
									ret := -0.587719
								if( rsi1 > 53.3888 )
									ret := -0.191617
							if( VIP_VIM > 0.381767 )
								if( VIP <= 1.17007 )
									ret := 0.166667
								if( VIP > 1.17007 )
									ret := -0.564368
					if( rsi1 > 63.9722 )
						if( VIP_VIM <= 0.5315 )
							if( d <= 80.0477 )
								if( d_k <= 8.34797 )
									ret := -0.041420
								if( d_k > 8.34797 )
									ret := 0.231806
							if( d > 80.0477 )
								if( k <= 72.5034 )
									ret := -0.553191
								if( k > 72.5034 )
									ret := -0.087591
						if( VIP_VIM > 0.5315 )
							if( smoothK_k <= 37.364 )
								if( k <= 39.5937 )
									ret := -0.160000
								if( k > 39.5937 )
									ret := 0.666667
							if( smoothK_k > 37.364 )
								if( k <= 80.9861 )
									ret := -0.451064
								if( k > 80.9861 )
									ret := 0.100000
				if( VIM > 0.84233 )
					if( VIP <= 1.03419 )
						if( d <= 13.4447 )
							if( d_k <= 11.678 )
								if( rsi1 <= 50.027 )
									ret := -0.800000 // sell
								if( rsi1 > 50.027 )
									ret := 0.000000
							if( d_k > 11.678 )
								ret := 0.000000
						if( d > 13.4447 )
							if( rsi1 <= 55.1498 )
								if( d_k <= 5.82733 )
									ret := -0.076577
								if( d_k > 5.82733 )
									ret := 0.233425
							if( rsi1 > 55.1498 )
								if( smoothK_k <= 59.6614 )
									ret := 0.250000
								if( smoothK_k > 59.6614 )
									ret := 0.470024
					if( VIP > 1.03419 )
						if( d_k <= 4.56163 )
							if( smoothD_d <= 29.9533 )
								if( VIP_VIM <= 0.135284 )
									ret := 0.866667 // buy
								if( VIP_VIM > 0.135284 )
									ret := 0.303030
							if( smoothD_d > 29.9533 )
								if( smoothD_d <= 57.8558 )
									ret := -0.317073
								if( smoothD_d > 57.8558 )
									ret := 0.186047
						if( d_k > 4.56163 )
							if( rsi1 <= 54.6273 )
								if( d <= 29.1843 )
									ret := -0.077273
								if( d > 29.1843 )
									ret := -0.324899
							if( rsi1 > 54.6273 )
								if( rsi1 <= 58.9025 )
									ret := -0.025142
								if( rsi1 > 58.9025 )
									ret := 0.199203
			if( rsi1 > 68.6238 )
				if( VIM <= 0.721227 )
					if( rsi1 <= 76.067 )
						if( k <= 45.1993 )
							if( d <= 29.513 )
								if( d <= 10.8792 )
									ret := 0.750000 // buy
								if( d > 10.8792 )
									ret := -0.038462
							if( d > 29.513 )
								if( smoothD_d <= 46.4034 )
									ret := 0.555556
								if( smoothD_d > 46.4034 )
									ret := 0.238806
						if( k > 45.1993 )
							if( k <= 86.2201 )
								if( rsi1 <= 72.8967 )
									ret := -0.387850
								if( rsi1 > 72.8967 )
									ret := -0.138122
							if( k > 86.2201 )
								if( smoothD_d <= 94.254 )
									ret := 0.300000
								if( smoothD_d > 94.254 )
									ret := -0.750000 // sell
					if( rsi1 > 76.067 )
						if( VIP <= 1.32847 )
							if( smoothD_d <= 91.5692 )
								if( k <= 87.5963 )
									ret := 0.466667
								if( k > 87.5963 )
									ret := -0.363636
							if( smoothD_d > 91.5692 )
								if( VIP <= 1.27032 )
									ret := 0.941176 // buy
								if( VIP > 1.27032 )
									ret := 0.571429
						if( VIP > 1.32847 )
							if( smoothK_k <= 73.8309 )
								if( d_k <= 14.3121 )
									ret := 0.442623
								if( d_k > 14.3121 )
									ret := -0.187500
							if( smoothK_k > 73.8309 )
								if( rsi1 <= 85.1872 )
									ret := -0.468085
								if( rsi1 > 85.1872 )
									ret := 0.800000 // buy
				if( VIM > 0.721227 )
					if( rsi1 <= 71.563 )
						if( VIP <= 1.15203 )
							if( VIP_VIM <= -0.131741 )
								if( d <= 90.3326 )
									ret := 0.750000 // buy
								if( d > 90.3326 )
									ret := 1.000000 // buy
							if( VIP_VIM > -0.131741 )
								if( d <= 66.5892 )
									ret := 0.800000 // buy
								if( d > 66.5892 )
									ret := 0.470588
						if( VIP > 1.15203 )
							if( d_k <= 7.71658 )
								if( VIM <= 0.763029 )
									ret := -0.260870
								if( VIM > 0.763029 )
									ret := 0.158333
							if( d_k > 7.71658 )
								if( VIP_VIM <= 0.480332 )
									ret := 0.473282
								if( VIP_VIM > 0.480332 )
									ret := 0.135135
					if( rsi1 > 71.563 )
						if( VIP_VIM <= 0.540727 )
							if( rsi1 <= 73.8656 )
								if( smoothK_k <= 86.3471 )
									ret := 0.524017
								if( smoothK_k > 86.3471 )
									ret := 0.000000
							if( rsi1 > 73.8656 )
								if( d_k <= 10.2167 )
									ret := 0.677914
								if( d_k > 10.2167 )
									ret := 0.404762
						if( VIP_VIM > 0.540727 )
							if( d_k <= 10.7302 )
								if( rsi1 <= 75.6496 )
									ret := -0.200000
								if( rsi1 > 75.6496 )
									ret := 0.560000
							if( d_k > 10.7302 )
								if( smoothD_d <= 66.5829 )
									ret := 0.500000
								if( smoothD_d > 66.5829 )
									ret := 1.000000 // buy
	
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
float op_operation = decision_tree_0_ATOMUSDT_30Min_4a6fcc3e(rsi1, smoothK_k, d_k, k, d, smoothD_d, VIP, VIM, VIP_VIM)

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


