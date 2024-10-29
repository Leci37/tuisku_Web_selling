//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: DOTUSDT_15Min_2ST0_cc97613d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOTUSDT_15Min_2ST0_cc97613d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOTUSDT_15Min_cc97613d(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( smoothK_k <= 45.101 )
		if( rsi1 <= 49.9966 )
			if( ema12 <= 0.00145 )
				if( rsi1 <= 33.3329 )
					if( ema3 <= 5.70149 )
						if( ema12 <= -0.028045 )
							if( rsi1 <= 25.6807 )
								if( smoothK_k <= 42.2595 )
									ret := -0.377358
								if( smoothK_k > 42.2595 )
									ret := 0.812500 // buy
							if( rsi1 > 25.6807 )
								if( smoothD_d <= 15.7289 )
									ret := -0.036697
								if( smoothD_d > 15.7289 )
									ret := 0.455696
						if( ema12 > -0.028045 )
							if( d <= 11.2745 )
								if( rsi1 <= 24.9884 )
									ret := -0.695450
								if( rsi1 > 24.9884 )
									ret := -0.542091
							if( d > 11.2745 )
								if( rsi1 <= 28.5706 )
									ret := -0.467120
								if( rsi1 > 28.5706 )
									ret := -0.327103
					if( ema3 > 5.70149 )
						if( ema12 <= -0.026268 )
							if( d_k <= -5.47458 )
								if( d <= 24.6781 )
									ret := -0.382126
								if( d > 24.6781 )
									ret := 0.056995
							if( d_k > -5.47458 )
								if( ema12 <= -0.044842 )
									ret := 0.101058
								if( ema12 > -0.044842 )
									ret := -0.103981
						if( ema12 > -0.026268 )
							if( rsi1 <= 21.2657 )
								if( d <= 2.43099 )
									ret := -0.902597 // sell
								if( d > 2.43099 )
									ret := -0.625000
							if( rsi1 > 21.2657 )
								if( ema12 <= -0.009157 )
									ret := -0.328678
								if( ema12 > -0.009157 )
									ret := -0.598385
				if( rsi1 > 33.3329 )
					if( ema13 <= -0.021238 )
						if( d_k <= -11.2169 )
							if( rsi1 <= 38.983 )
								if( k <= 37.5151 )
									ret := -0.539216
								if( k > 37.5151 )
									ret := -0.090909
							if( rsi1 > 38.983 )
								if( ema1 <= 6.39066 )
									ret := 0.219512
								if( ema1 > 6.39066 )
									ret := -0.070588
						if( d_k > -11.2169 )
							if( ema12 <= -0.020627 )
								if( tema <= 14.8008 )
									ret := 0.251673
								if( tema > 14.8008 )
									ret := -0.333333
							if( ema12 > -0.020627 )
								if( ema1 <= 7.02294 )
									ret := 0.086237
								if( ema1 > 7.02294 )
									ret := -0.174046
					if( ema13 > -0.021238 )
						if( rsi1 <= 42.5189 )
							if( d_k <= -3.71481 )
								if( smoothD_d <= 10.1816 )
									ret := -0.438247
								if( smoothD_d > 10.1816 )
									ret := -0.203368
							if( d_k > -3.71481 )
								if( rsi1 <= 36.3273 )
									ret := -0.260327
								if( rsi1 > 36.3273 )
									ret := -0.079048
						if( rsi1 > 42.5189 )
							if( ema12 <= -0.002715 )
								if( d_k <= -4.48666 )
									ret := -0.005708
								if( d_k > -4.48666 )
									ret := 0.226651
							if( ema12 > -0.002715 )
								if( ema13 <= -0.003591 )
									ret := -0.289100
								if( ema13 > -0.003591 )
									ret := 0.021045
			if( ema12 > 0.00145 )
				if( rsi1 <= 42.0143 )
					if( ema12 <= 0.005874 )
						if( ema13 <= 0.003966 )
							if( smoothD_d <= 66.1156 )
								if( tema <= 4.13795 )
									ret := -0.444444
								if( tema > 4.13795 )
									ret := -0.833333 // sell
							if( smoothD_d > 66.1156 )
								ret := 0.000000
						if( ema13 > 0.003966 )
							if( rsi1 <= 37.2103 )
								if( d_k <= 5.09198 )
									ret := -0.778281 // sell
								if( d_k > 5.09198 )
									ret := -0.537445
							if( rsi1 > 37.2103 )
								if( smoothK_k <= 0.927469 )
									ret := -0.100719
								if( smoothK_k > 0.927469 )
									ret := -0.518428
					if( ema12 > 0.005874 )
						if( rsi1 <= 36.9544 )
							if( ema3 <= 7.7224 )
								if( smoothD_d <= -2.99787 )
									ret := -0.666667
								if( smoothD_d > -2.99787 )
									ret := -0.883534 // sell
							if( ema3 > 7.7224 )
								if( ema12 <= 0.006069 )
									ret := -0.750000 // sell
								if( ema12 > 0.006069 )
									ret := -0.975904 // sell
						if( rsi1 > 36.9544 )
							if( k <= 3.96769 )
								if( ema3 <= 9.55254 )
									ret := -0.628483
								if( ema3 > 9.55254 )
									ret := -0.041667
							if( k > 3.96769 )
								if( d_k <= 28.0304 )
									ret := -0.839060 // sell
								if( d_k > 28.0304 )
									ret := -0.437500
				if( rsi1 > 42.0143 )
					if( ema12 <= 0.009449 )
						if( ema13 <= 0.024461 )
							if( ema12 <= 0.006687 )
								if( d_k <= -3.05982 )
									ret := -0.464853
								if( d_k > -3.05982 )
									ret := -0.181818
							if( ema12 > 0.006687 )
								if( ema13 <= 0.016017 )
									ret := -0.557692
								if( ema13 > 0.016017 )
									ret := -0.271028
						if( ema13 > 0.024461 )
							if( smoothK_k <= -2.098 )
								if( smoothD_d <= -2.4495 )
									ret := -0.222222
								if( smoothD_d > -2.4495 )
									ret := 0.702703 // buy
							if( smoothK_k > -2.098 )
								if( d <= 9.92879 )
									ret := -0.238095
								if( d > 9.92879 )
									ret := 0.207792
					if( ema12 > 0.009449 )
						if( k <= 6.35418 )
							if( ema2 <= 10.9308 )
								if( ema3 <= 4.12294 )
									ret := 0.400000
								if( ema3 > 4.12294 )
									ret := -0.547988
							if( ema2 > 10.9308 )
								if( k <= 5.73327 )
									ret := -0.333333
								if( k > 5.73327 )
									ret := 0.875000 // buy
						if( k > 6.35418 )
							if( d_k <= 24.4827 )
								if( ema12 <= 0.01322 )
									ret := -0.605991
								if( ema12 > 0.01322 )
									ret := -0.746556 // sell
							if( d_k > 24.4827 )
								if( smoothD_d <= 50.3495 )
									ret := -0.577778
								if( smoothD_d > 50.3495 )
									ret := 0.133333
		if( rsi1 > 49.9966 )
			if( ema12 <= 0.0142 )
				if( ema2 <= 7.47817 )
					if( rsi1 <= 56.2636 )
						if( rsi1 <= 51.5828 )
							if( ema12 <= 0.002614 )
								if( d_k <= -3.75942 )
									ret := 0.012500
								if( d_k > -3.75942 )
									ret := 0.274194
							if( ema12 > 0.002614 )
								if( k <= 10.9028 )
									ret := 0.064103
								if( k > 10.9028 )
									ret := -0.338843
						if( rsi1 > 51.5828 )
							if( ema12 <= -0.002057 )
								if( smoothD_d <= 17.526 )
									ret := 0.000000
								if( smoothD_d > 17.526 )
									ret := 0.544850
							if( ema12 > -0.002057 )
								if( ema12 <= 0.009419 )
									ret := 0.084531
								if( ema12 > 0.009419 )
									ret := -0.135135
					if( rsi1 > 56.2636 )
						if( d <= 40.5109 )
							if( tema <= 4.63998 )
								if( ema12 <= 0.000693 )
									ret := 0.439024
								if( ema12 > 0.000693 )
									ret := 0.115385
							if( tema > 4.63998 )
								if( ema12 <= 0.004771 )
									ret := 0.420582
								if( ema12 > 0.004771 )
									ret := 0.240642
						if( d > 40.5109 )
							if( ema13 <= 0.019296 )
								if( d <= 41.1444 )
									ret := -0.500000
								if( d > 41.1444 )
									ret := 0.005900
							if( ema13 > 0.019296 )
								if( smoothD_d <= 41.8634 )
									ret := 0.051948
								if( smoothD_d > 41.8634 )
									ret := 0.380952
				if( ema2 > 7.47817 )
					if( tema <= 10.958 )
						if( rsi1 <= 50.1131 )
							if( ema12 <= 0.008319 )
								if( ema1 <= 7.64242 )
									ret := -0.357143
								if( ema1 > 7.64242 )
									ret := 0.213115
							if( ema12 > 0.008319 )
								if( tema <= 8.14977 )
									ret := -0.857143 // sell
								if( tema > 8.14977 )
									ret := -0.333333
						if( rsi1 > 50.1131 )
							if( ema12 <= -0.010766 )
								if( smoothD_d <= 7.5499 )
									ret := -0.500000
								if( smoothD_d > 7.5499 )
									ret := 0.739130 // buy
							if( ema12 > -0.010766 )
								if( k <= 4.94335 )
									ret := 0.904762 // buy
								if( k > 4.94335 )
									ret := 0.325444
					if( tema > 10.958 )
						if( smoothK_k <= 41.3983 )
							if( smoothD_d <= 16.9596 )
								if( ema12 <= -0.00784 )
									ret := -0.714286 // sell
								if( ema12 > -0.00784 )
									ret := 0.333333
							if( smoothD_d > 16.9596 )
								if( d_k <= 18.9219 )
									ret := -0.718750 // sell
								if( d_k > 18.9219 )
									ret := -0.166667
						if( smoothK_k > 41.3983 )
							if( smoothK_k <= 43.3289 )
								ret := 0.800000 // buy
							if( smoothK_k > 43.3289 )
								ret := -0.200000
			if( ema12 > 0.0142 )
				if( smoothD_d <= 58.6837 )
					if( rsi1 <= 56.3711 )
						if( ema12 <= 0.025934 )
							if( ema13 <= 0.050251 )
								if( rsi1 <= 52.9279 )
									ret := -0.542199
								if( rsi1 > 52.9279 )
									ret := -0.281314
							if( ema13 > 0.050251 )
								if( ema13 <= 0.06472 )
									ret := 0.053435
								if( ema13 > 0.06472 )
									ret := 0.589744
						if( ema12 > 0.025934 )
							if( d <= 17.6262 )
								if( ema13 <= 0.156862 )
									ret := -0.451389
								if( ema13 > 0.156862 )
									ret := 0.523810
							if( d > 17.6262 )
								if( ema12 <= 0.048702 )
									ret := -0.577703
								if( ema12 > 0.048702 )
									ret := -0.877551 // sell
					if( rsi1 > 56.3711 )
						if( rsi1 <= 66.6894 )
							if( k <= 35.1445 )
								if( ema12 <= 0.029594 )
									ret := 0.100688
								if( ema12 > 0.029594 )
									ret := -0.165575
							if( k > 35.1445 )
								if( ema2 <= 5.27572 )
									ret := -0.632184
								if( ema2 > 5.27572 )
									ret := -0.176568
						if( rsi1 > 66.6894 )
							if( smoothD_d <= 25.2599 )
								if( ema12 <= 0.107337 )
									ret := 0.030568
								if( ema12 > 0.107337 )
									ret := -0.733333 // sell
							if( smoothD_d > 25.2599 )
								if( d_k <= 3.74739 )
									ret := 0.581250
								if( d_k > 3.74739 )
									ret := 0.244989
				if( smoothD_d > 58.6837 )
					if( ema13 <= 0.357388 )
						if( smoothK_k <= 43.9322 )
							if( rsi1 <= 67.8549 )
								if( tema <= 9.66183 )
									ret := 0.224299
								if( tema > 9.66183 )
									ret := 0.823529 // buy
							if( rsi1 > 67.8549 )
								if( ema12 <= 0.065792 )
									ret := 0.617021
								if( ema12 > 0.065792 )
									ret := 1.000000 // buy
						if( smoothK_k > 43.9322 )
							if( tema <= 6.25726 )
								if( smoothK_k <= 44.5574 )
									ret := -0.200000
								if( smoothK_k > 44.5574 )
									ret := -0.800000 // sell
							if( tema > 6.25726 )
								if( smoothK_k <= 44.3913 )
									ret := -0.100000
								if( smoothK_k > 44.3913 )
									ret := 0.500000
					if( ema13 > 0.357388 )
						ret := -1.000000 // sell
	if( smoothK_k > 45.101 )
		if( k <= 86.1787 )
			if( rsi1 <= 63.8972 )
				if( ema12 <= -0.00111 )
					if( d_k <= -2.43139 )
						if( rsi1 <= 52.232 )
							if( ema12 <= -0.015725 )
								if( rsi1 <= 40.5075 )
									ret := 0.132484
								if( rsi1 > 40.5075 )
									ret := 0.479968
							if( ema12 > -0.015725 )
								if( smoothD_d <= 67.3996 )
									ret := -0.007101
								if( smoothD_d > 67.3996 )
									ret := 0.213793
						if( rsi1 > 52.232 )
							if( ema12 <= -0.005652 )
								if( ema12 <= -0.009412 )
									ret := 0.769962 // buy
								if( ema12 > -0.009412 )
									ret := 0.576119
							if( ema12 > -0.005652 )
								if( ema13 <= -0.001208 )
									ret := 0.267227
								if( ema13 > -0.001208 )
									ret := 0.658120
					if( d_k > -2.43139 )
						if( ema13 <= -0.07834 )
							if( ema1 <= 8.48908 )
								if( smoothK_k <= 59.9881 )
									ret := -0.298077
								if( smoothK_k > 59.9881 )
									ret := 0.251701
							if( ema1 > 8.48908 )
								if( smoothK_k <= 51.6754 )
									ret := 0.705882 // buy
								if( smoothK_k > 51.6754 )
									ret := -0.491429
						if( ema13 > -0.07834 )
							if( smoothD_d <= 79.8835 )
								if( ema13 <= -0.007424 )
									ret := 0.048474
								if( ema13 > -0.007424 )
									ret := 0.245211
							if( smoothD_d > 79.8835 )
								if( smoothD_d <= 87.8545 )
									ret := 0.283178
								if( smoothD_d > 87.8545 )
									ret := 0.026178
				if( ema12 > -0.00111 )
					if( rsi1 <= 54.6492 )
						if( d <= 55.5746 )
							if( ema12 <= 0.001871 )
								if( rsi1 <= 50.581 )
									ret := -0.302905
								if( rsi1 > 50.581 )
									ret := 0.071429
							if( ema12 > 0.001871 )
								if( tema <= 8.61313 )
									ret := -0.401425
								if( tema > 8.61313 )
									ret := -0.113208
						if( d > 55.5746 )
							if( ema3 <= 8.65035 )
								if( ema12 <= 0.003469 )
									ret := -0.038462
								if( ema12 > 0.003469 )
									ret := -0.189621
							if( ema3 > 8.65035 )
								if( ema1 <= 9.99503 )
									ret := 0.218519
								if( ema1 > 9.99503 )
									ret := -0.145161
					if( rsi1 > 54.6492 )
						if( ema12 <= 0.013738 )
							if( d_k <= 2.31195 )
								if( ema13 <= 0.027178 )
									ret := 0.089727
								if( ema13 > 0.027178 )
									ret := 0.521739
							if( d_k > 2.31195 )
								if( ema3 <= 8.54121 )
									ret := 0.240085
								if( ema3 > 8.54121 )
									ret := 0.639098
						if( ema12 > 0.013738 )
							if( d_k <= 11.8318 )
								if( d <= 90.7793 )
									ret := -0.188542
								if( d > 90.7793 )
									ret := 0.329114
							if( d_k > 11.8318 )
								if( ema13 <= 0.134262 )
									ret := 0.227941
								if( ema13 > 0.134262 )
									ret := -0.823529 // sell
			if( rsi1 > 63.8972 )
				if( ema12 <= 0.027029 )
					if( ema13 <= 0.000974 )
						if( ema12 <= -0.001532 )
							if( smoothD_d <= 67.9529 )
								if( d <= 58.6469 )
									ret := 0.710526 // buy
								if( d > 58.6469 )
									ret := 0.907407 // buy
							if( smoothD_d > 67.9529 )
								if( ema13 <= -0.021967 )
									ret := 0.133333
								if( ema13 > -0.021967 )
									ret := 0.588235
						if( ema12 > -0.001532 )
							if( d_k <= 5.90206 )
								if( ema3 <= 6.28039 )
									ret := 0.267442
								if( ema3 > 6.28039 )
									ret := 0.622222
							if( d_k > 5.90206 )
								if( ema3 <= 4.21088 )
									ret := 0.400000
								if( ema3 > 4.21088 )
									ret := 0.888889 // buy
					if( ema13 > 0.000974 )
						if( smoothD_d <= 81.025 )
							if( rsi1 <= 73.2642 )
								if( smoothK_k <= 79.3127 )
									ret := 0.296552
								if( smoothK_k > 79.3127 )
									ret := 0.029289
							if( rsi1 > 73.2642 )
								if( k <= 83.381 )
									ret := 0.562284
								if( k > 83.381 )
									ret := 0.272727
						if( smoothD_d > 81.025 )
							if( d_k <= 7.49324 )
								if( smoothD_d <= 88.1959 )
									ret := 0.391579
								if( smoothD_d > 88.1959 )
									ret := 0.703704 // buy
							if( d_k > 7.49324 )
								if( ema2 <= 4.16711 )
									ret := 0.193548
								if( ema2 > 4.16711 )
									ret := 0.617318
				if( ema12 > 0.027029 )
					if( d_k <= 8.97695 )
						if( rsi1 <= 76.0769 )
							if( smoothD_d <= 46.0904 )
								if( ema13 <= 0.074105 )
									ret := 0.628571
								if( ema13 > 0.074105 )
									ret := 0.228070
							if( smoothD_d > 46.0904 )
								if( smoothD_d <= 57.8798 )
									ret := -0.231034
								if( smoothD_d > 57.8798 )
									ret := 0.023299
						if( rsi1 > 76.0769 )
							if( d <= 37.7519 )
								if( k <= 54.1212 )
									ret := -0.750000 // sell
								if( k > 54.1212 )
									ret := -1.000000 // sell
							if( d > 37.7519 )
								if( ema13 <= 0.067912 )
									ret := 0.597122
								if( ema13 > 0.067912 )
									ret := 0.205298
					if( d_k > 8.97695 )
						if( smoothD_d <= 70.5509 )
							if( smoothK_k <= 50.8005 )
								if( rsi1 <= 76.5484 )
									ret := 0.170213
								if( rsi1 > 76.5484 )
									ret := 0.785714 // buy
							if( smoothK_k > 50.8005 )
								if( ema1 <= 5.92193 )
									ret := 0.400000
								if( ema1 > 5.92193 )
									ret := -0.555556
						if( smoothD_d > 70.5509 )
							if( smoothD_d <= 84.3783 )
								if( rsi1 <= 76.4861 )
									ret := 0.326389
								if( rsi1 > 76.4861 )
									ret := 0.775281 // buy
							if( smoothD_d > 84.3783 )
								if( k <= 81.8945 )
									ret := 0.802548 // buy
								if( k > 81.8945 )
									ret := 0.166667
		if( k > 86.1787 )
			if( rsi1 <= 70.0002 )
				if( tema <= 9.28735 )
					if( ema12 <= -0.001477 )
						if( rsi1 <= 53.0743 )
							if( ema12 <= -0.015914 )
								if( rsi1 <= 44.4269 )
									ret := 0.351991
								if( rsi1 > 44.4269 )
									ret := 0.651256
							if( ema12 > -0.015914 )
								if( rsi1 <= 49.3991 )
									ret := -0.085590
								if( rsi1 > 49.3991 )
									ret := 0.184000
						if( rsi1 > 53.0743 )
							if( ema12 <= -0.006979 )
								if( rsi1 <= 56.7386 )
									ret := 0.609195
								if( rsi1 > 56.7386 )
									ret := 0.815261 // buy
							if( ema12 > -0.006979 )
								if( rsi1 <= 64.4732 )
									ret := 0.426421
								if( rsi1 > 64.4732 )
									ret := 0.783455 // buy
					if( ema12 > -0.001477 )
						if( rsi1 <= 64.4766 )
							if( rsi1 <= 58.3272 )
								if( ema13 <= -0.016996 )
									ret := -0.482759
								if( ema13 > -0.016996 )
									ret := -0.087881
							if( rsi1 > 58.3272 )
								if( ema13 <= 0.002806 )
									ret := 0.170186
								if( ema13 > 0.002806 )
									ret := -0.031037
						if( rsi1 > 64.4766 )
							if( tema <= 6.79575 )
								if( ema12 <= 0.009972 )
									ret := 0.393910
								if( ema12 > 0.009972 )
									ret := 0.167230
							if( tema > 6.79575 )
								if( ema12 <= 0.01082 )
									ret := 0.590909
								if( ema12 > 0.01082 )
									ret := -0.075581
				if( tema > 9.28735 )
					if( ema13 <= -0.014249 )
						if( rsi1 <= 45.9051 )
							if( ema13 <= -0.176284 )
								if( rsi1 <= 25.6674 )
									ret := -0.166667
								if( rsi1 > 25.6674 )
									ret := 0.650000
							if( ema13 > -0.176284 )
								if( ema3 <= 16.148 )
									ret := -0.233083
								if( ema3 > 16.148 )
									ret := 0.642857
						if( rsi1 > 45.9051 )
							if( ema3 <= 15.9349 )
								if( ema12 <= -0.173176 )
									ret := -1.000000 // sell
								if( ema12 > -0.173176 )
									ret := 0.550369
							if( ema3 > 15.9349 )
								if( d_k <= -3.98526 )
									ret := -0.800000 // sell
								if( d_k > -3.98526 )
									ret := 0.200000
					if( ema13 > -0.014249 )
						if( ema3 <= 14.7133 )
							if( d_k <= 3.25758 )
								if( ema12 <= 0.006573 )
									ret := 0.389831
								if( ema12 > 0.006573 )
									ret := -0.327907
							if( d_k > 3.25758 )
								if( smoothD_d <= 93.1449 )
									ret := 0.701754 // buy
								if( smoothD_d > 93.1449 )
									ret := -0.315789
						if( ema3 > 14.7133 )
							if( d <= 82.8378 )
								if( rsi1 <= 58.3864 )
									ret := -0.066667
								if( rsi1 > 58.3864 )
									ret := -0.882353 // sell
							if( d > 82.8378 )
								if( ema3 <= 16.1407 )
									ret := 0.708333 // buy
								if( ema3 > 16.1407 )
									ret := -0.030303
			if( rsi1 > 70.0002 )
				if( ema13 <= 0.050198 )
					if( smoothD_d <= 92.5308 )
						if( rsi1 <= 77.0882 )
							if( ema12 <= 0.01532 )
								if( ema12 <= -3.3e-05 )
									ret := 0.850622 // buy
								if( ema12 > -3.3e-05 )
									ret := 0.513094
							if( ema12 > 0.01532 )
								if( k <= 97.7688 )
									ret := 0.337931
								if( k > 97.7688 )
									ret := -0.133333
						if( rsi1 > 77.0882 )
							if( ema3 <= 6.99644 )
								if( k <= 98.826 )
									ret := 0.553480
								if( k > 98.826 )
									ret := 0.728033 // buy
							if( ema3 > 6.99644 )
								if( rsi1 <= 77.8271 )
									ret := 0.709677 // buy
								if( rsi1 > 77.8271 )
									ret := 0.920245 // buy
					if( smoothD_d > 92.5308 )
						if( ema12 <= -0.000954 )
							if( d_k <= 2.71122 )
								if( ema1 <= 5.98806 )
									ret := 0.765432 // buy
								if( ema1 > 5.98806 )
									ret := 0.923567 // buy
							if( d_k > 2.71122 )
								if( ema12 <= -0.017622 )
									ret := -0.500000
								if( ema12 > -0.017622 )
									ret := 0.800000 // buy
						if( ema12 > -0.000954 )
							if( rsi1 <= 80.5249 )
								if( k <= 99.9662 )
									ret := 0.652597
								if( k > 99.9662 )
									ret := 0.442222
							if( rsi1 > 80.5249 )
								if( rsi1 <= 92.9866 )
									ret := 0.758824 // buy
								if( rsi1 > 92.9866 )
									ret := 0.951923 // buy
				if( ema13 > 0.050198 )
					if( rsi1 <= 80.7565 )
						if( d_k <= 3.02943 )
							if( d <= 99.5652 )
								if( d_k <= 1.90468 )
									ret := 0.144186
								if( d_k > 1.90468 )
									ret := -0.265625
							if( d > 99.5652 )
								if( ema12 <= 0.040442 )
									ret := -0.428571
								if( ema12 > 0.040442 )
									ret := 0.571429
						if( d_k > 3.02943 )
							if( ema12 <= 0.058258 )
								if( rsi1 <= 70.5404 )
									ret := -0.375000
								if( rsi1 > 70.5404 )
									ret := 0.693252
							if( ema12 > 0.058258 )
								if( ema12 <= 0.101422 )
									ret := -0.036145
								if( ema12 > 0.101422 )
									ret := 0.730769 // buy
					if( rsi1 > 80.7565 )
						if( d <= 97.6875 )
							if( ema13 <= 0.477704 )
								if( ema13 <= 0.073037 )
									ret := 0.748571 // buy
								if( ema13 > 0.073037 )
									ret := 0.525469
							if( ema13 > 0.477704 )
								ret := -0.750000 // sell
						if( d > 97.6875 )
							if( ema1 <= 8.70103 )
								if( ema13 <= 0.160655 )
									ret := 0.323988
								if( ema13 > 0.160655 )
									ret := -0.363636
							if( ema1 > 8.70103 )
								if( ema1 <= 9.65111 )
									ret := 0.841667 // buy
								if( ema1 > 9.65111 )
									ret := 0.031250
	
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

//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_DOTUSDT_15Min_cc97613d(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)

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


