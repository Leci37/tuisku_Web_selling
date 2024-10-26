//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: GOOG_1Min_2ST0_473c34a4 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GOOG_1Min_2ST0_473c34a4", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GOOG_1Min_473c34a4(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= -0.088024 )
		if( k <= 16.804 )
			if( ema3 <= 165.829 )
				if( rsi1 <= 14.8792 )
					if( ema3 <= 157.963 )
						if( ema1 <= 149.947 )
							if( d_k <= -1.42417 )
								if( ema12 <= -0.308873 )
									ret := 1.000000 // buy
								if( ema12 > -0.308873 )
									ret := 0.750000 // buy
							if( d_k > -1.42417 )
								if( k <= 2.82486 )
									ret := 0.090909
								if( k > 2.82486 )
									ret := -0.250000
						if( ema1 > 149.947 )
							if( ema13 <= -0.369267 )
								if( rsi1 <= 10.7958 )
									ret := -0.647059
								if( rsi1 > 10.7958 )
									ret := 0.200000
							if( ema13 > -0.369267 )
								if( rsi1 <= 13.7629 )
									ret := -0.947368 // sell
								if( rsi1 > 13.7629 )
									ret := -0.666667
					if( ema3 > 157.963 )
						if( ema13 <= -0.350695 )
							if( d_k <= 3.46452 )
								if( ema1 <= 160.424 )
									ret := 0.000000
								if( ema1 > 160.424 )
									ret := 0.767442 // buy
							if( d_k > 3.46452 )
								if( ema1 <= 158.57 )
									ret := 0.500000
								if( ema1 > 158.57 )
									ret := -0.588235
						if( ema13 > -0.350695 )
							if( rsi1 <= 8.87213 )
								if( ema1 <= 157.902 )
									ret := 0.428571
								if( ema1 > 157.902 )
									ret := -0.538462
							if( rsi1 > 8.87213 )
								if( ema12 <= -0.165317 )
									ret := -0.368421
								if( ema12 > -0.165317 )
									ret := 0.129630
				if( rsi1 > 14.8792 )
					if( d_k <= -1.27609 )
						if( smoothK_k <= 8.20598 )
							if( ema3 <= 159.974 )
								if( k <= 7.64647 )
									ret := 0.506173
								if( k > 7.64647 )
									ret := -0.040541
							if( ema3 > 159.974 )
								if( ema12 <= -0.257726 )
									ret := -0.925000 // sell
								if( ema12 > -0.257726 )
									ret := -0.108434
						if( smoothK_k > 8.20598 )
							if( ema13 <= -0.346981 )
								if( rsi1 <= 27.2356 )
									ret := 0.480769
								if( rsi1 > 27.2356 )
									ret := -0.310345
							if( ema13 > -0.346981 )
								if( ema12 <= -0.118131 )
									ret := 0.689655
								if( ema12 > -0.118131 )
									ret := 0.225806
					if( d_k > -1.27609 )
						if( ema1 <= 162.733 )
							if( tema <= 149.837 )
								if( ema1 <= 149.383 )
									ret := 0.166667
								if( ema1 > 149.383 )
									ret := 0.961538 // buy
							if( tema > 149.837 )
								if( rsi1 <= 38.5274 )
									ret := 0.311530
								if( rsi1 > 38.5274 )
									ret := -0.262500
						if( ema1 > 162.733 )
							if( ema12 <= -0.094098 )
								if( ema12 <= -0.382213 )
									ret := 0.080000
								if( ema12 > -0.382213 )
									ret := 0.619149
							if( ema12 > -0.094098 )
								if( smoothK_k <= -2.74328 )
									ret := -0.545455
								if( smoothK_k > -2.74328 )
									ret := 0.162791
			if( ema3 > 165.829 )
				if( ema13 <= -0.919501 )
					if( k <= 0.745252 )
						if( d_k <= 2.10055 )
							if( smoothD_d <= -2.61362 )
								ret := 0.500000
							if( smoothD_d > -2.61362 )
								ret := 1.000000 // buy
						if( d_k > 2.10055 )
							ret := 0.250000
					if( k > 0.745252 )
						if( d_k <= -1.8491 )
							if( d_k <= -3.5255 )
								if( d_k <= -6.13726 )
									ret := -0.500000
								if( d_k > -6.13726 )
									ret := -1.000000 // sell
							if( d_k > -3.5255 )
								if( tema <= 166.794 )
									ret := 0.875000 // buy
								if( tema > 166.794 )
									ret := 0.000000
						if( d_k > -1.8491 )
							if( d <= 1.16676 )
								ret := 0.000000
							if( d > 1.16676 )
								if( ema3 <= 185.244 )
									ret := -0.677419
								if( ema3 > 185.244 )
									ret := -1.000000 // sell
				if( ema13 > -0.919501 )
					if( d_k <= -7.39928 )
						if( ema12 <= -0.154057 )
							if( k <= 16.461 )
								if( d_k <= -8.12056 )
									ret := -0.500000
								if( d_k > -8.12056 )
									ret := -1.000000 // sell
							if( k > 16.461 )
								ret := 0.250000
						if( ema12 > -0.154057 )
							if( rsi1 <= 35.3214 )
								if( ema1 <= 176.291 )
									ret := 0.125000
								if( ema1 > 176.291 )
									ret := -0.800000 // sell
							if( rsi1 > 35.3214 )
								if( smoothD_d <= 2.4186 )
									ret := -0.500000
								if( smoothD_d > 2.4186 )
									ret := 0.600000
					if( d_k > -7.39928 )
						if( ema12 <= -0.148115 )
							if( ema13 <= -0.104539 )
								if( d_k <= 29.0282 )
									ret := 0.196950
								if( d_k > 29.0282 )
									ret := 0.880000 // buy
							if( ema13 > -0.104539 )
								if( smoothK_k <= 3.2271 )
									ret := -0.923077 // sell
								if( smoothK_k > 3.2271 )
									ret := -0.250000
						if( ema12 > -0.148115 )
							if( ema1 <= 167.982 )
								if( tema <= 167.648 )
									ret := -0.043702
								if( tema > 167.648 )
									ret := -0.666667
							if( ema1 > 167.982 )
								if( ema3 <= 168.263 )
									ret := 0.777778 // buy
								if( ema3 > 168.263 )
									ret := 0.097574
		if( k > 16.804 )
			if( ema1 <= 155.931 )
				if( ema12 <= -0.142756 )
					if( ema13 <= -0.296865 )
						if( d_k <= 12.571 )
							if( k <= 64.7851 )
								if( ema13 <= -0.431808 )
									ret := -0.983871 // sell
								if( ema13 > -0.431808 )
									ret := -0.786667 // sell
							if( k > 64.7851 )
								if( d_k <= 8.83976 )
									ret := -0.160000
								if( d_k > 8.83976 )
									ret := -1.000000 // sell
						if( d_k > 12.571 )
							if( smoothD_d <= 45.0793 )
								ret := 0.000000
							if( smoothD_d > 45.0793 )
								if( rsi1 <= 23.0037 )
									ret := 1.000000 // buy
								if( rsi1 > 23.0037 )
									ret := 0.750000 // buy
					if( ema13 > -0.296865 )
						if( rsi1 <= 40.5684 )
							if( ema12 <= -0.157716 )
								if( tema <= 151.587 )
									ret := 1.000000 // buy
								if( tema > 151.587 )
									ret := 0.333333
							if( ema12 > -0.157716 )
								if( ema2 <= 155.184 )
									ret := -0.529412
								if( ema2 > 155.184 )
									ret := 0.250000
						if( rsi1 > 40.5684 )
							ret := -1.000000 // sell
				if( ema12 > -0.142756 )
					if( smoothD_d <= 70.1701 )
						if( ema3 <= 151.258 )
							if( smoothK_k <= 82.8481 )
								if( d_k <= -7.14146 )
									ret := -0.555556
								if( d_k > -7.14146 )
									ret := 0.114754
							if( smoothK_k > 82.8481 )
								ret := 1.000000 // buy
						if( ema3 > 151.258 )
							if( d_k <= -12.3595 )
								if( d_k <= -24.7952 )
									ret := 0.250000
								if( d_k > -24.7952 )
									ret := 0.804878 // buy
							if( d_k > -12.3595 )
								if( k <= 19.0401 )
									ret := -0.400000
								if( k > 19.0401 )
									ret := 0.333333
					if( smoothD_d > 70.1701 )
						if( d_k <= -5.40709 )
							ret := 0.285714
						if( d_k > -5.40709 )
							if( ema12 <= -0.13328 )
								ret := -1.000000 // sell
							if( ema12 > -0.13328 )
								if( rsi1 <= 44.142 )
									ret := -0.259259
								if( rsi1 > 44.142 )
									ret := -0.714286 // sell
			if( ema1 > 155.931 )
				if( k <= 22.7517 )
					if( ema12 <= -0.451202 )
						if( tema <= 158.553 )
							ret := 0.200000
						if( tema > 158.553 )
							if( rsi1 <= 13.925 )
								ret := -0.500000
							if( rsi1 > 13.925 )
								if( rsi1 <= 24.682 )
									ret := -1.000000 // sell
								if( rsi1 > 24.682 )
									ret := -0.666667
					if( ema12 > -0.451202 )
						if( rsi1 <= 26.5646 )
							if( smoothD_d <= 8.59171 )
								if( ema12 <= -0.17289 )
									ret := 0.750000 // buy
								if( ema12 > -0.17289 )
									ret := 0.093750
							if( smoothD_d > 8.59171 )
								if( d_k <= 1.95366 )
									ret := -0.104938
								if( d_k > 1.95366 )
									ret := 0.336449
						if( rsi1 > 26.5646 )
							if( rsi1 <= 36.9697 )
								if( ema13 <= -0.242989 )
									ret := -0.336406
								if( ema13 > -0.242989 )
									ret := 0.000000
							if( rsi1 > 36.9697 )
								if( ema3 <= 157.402 )
									ret := -0.928571 // sell
								if( ema3 > 157.402 )
									ret := 0.233918
				if( k > 22.7517 )
					if( ema13 <= -0.243275 )
						if( k <= 29.2125 )
							if( ema12 <= -0.292533 )
								if( tema <= 167.27 )
									ret := 0.181818
								if( tema > 167.27 )
									ret := 0.796296 // buy
							if( ema12 > -0.292533 )
								if( d <= 21.6257 )
									ret := 0.281513
								if( d > 21.6257 )
									ret := -0.097297
						if( k > 29.2125 )
							if( smoothD_d <= 23.4273 )
								if( ema13 <= -0.293928 )
									ret := -0.298507
								if( ema13 > -0.293928 )
									ret := 0.066667
							if( smoothD_d > 23.4273 )
								if( ema12 <= -0.580778 )
									ret := 0.621622
								if( ema12 > -0.580778 )
									ret := 0.046641
					if( ema13 > -0.243275 )
						if( smoothD_d <= 91.5647 )
							if( tema <= 185.133 )
								if( ema1 <= 179.617 )
									ret := 0.209650
								if( ema1 > 179.617 )
									ret := 0.494048
							if( tema > 185.133 )
								if( k <= 29.4236 )
									ret := -0.413793
								if( k > 29.4236 )
									ret := 0.182320
						if( smoothD_d > 91.5647 )
							if( smoothD_d <= 94.3349 )
								if( k <= 94.6568 )
									ret := -0.222222
								if( k > 94.6568 )
									ret := -0.947368 // sell
							if( smoothD_d > 94.3349 )
								ret := 0.428571
	if( ema12 > -0.088024 )
		if( d_k <= 2.85142 )
			if( ema12 <= 0.15415 )
				if( ema3 <= 163.891 )
					if( k <= 15.107 )
						if( ema1 <= 157.777 )
							if( ema1 <= 157.382 )
								if( rsi1 <= 21.3462 )
									ret := -0.650000
								if( rsi1 > 21.3462 )
									ret := 0.085526
							if( ema1 > 157.382 )
								if( rsi1 <= 34.1787 )
									ret := 0.000000
								if( rsi1 > 34.1787 )
									ret := 0.680000
						if( ema1 > 157.777 )
							if( tema <= 162.199 )
								if( rsi1 <= 38.413 )
									ret := -0.060790
								if( rsi1 > 38.413 )
									ret := -0.339853
							if( tema > 162.199 )
								if( smoothK_k <= 9.91836 )
									ret := 0.151429
								if( smoothK_k > 9.91836 )
									ret := -0.285714
					if( k > 15.107 )
						if( ema13 <= 0.222447 )
							if( ema2 <= 156.737 )
								if( rsi1 <= 63.6621 )
									ret := -0.085311
								if( rsi1 > 63.6621 )
									ret := 0.219008
							if( ema2 > 156.737 )
								if( d <= 91.9238 )
									ret := 0.115224
								if( d > 91.9238 )
									ret := -0.007673
						if( ema13 > 0.222447 )
							if( k <= 65.0678 )
								if( d <= 40.6523 )
									ret := 0.258621
								if( d > 40.6523 )
									ret := 0.854839 // buy
							if( k > 65.0678 )
								if( ema12 <= 0.145645 )
									ret := 0.045455
								if( ema12 > 0.145645 )
									ret := 0.540984
				if( ema3 > 163.891 )
					if( ema12 <= 0.0454 )
						if( d <= 20.5864 )
							if( ema13 <= 0.160975 )
								if( k <= 21.9571 )
									ret := 0.002159
								if( k > 21.9571 )
									ret := -0.124785
							if( ema13 > 0.160975 )
								if( tema <= 180.731 )
									ret := 0.500000
								if( tema > 180.731 )
									ret := 1.000000 // buy
						if( d > 20.5864 )
							if( ema1 <= 163.829 )
								if( d_k <= -4.3973 )
									ret := -0.818182 // sell
								if( d_k > -4.3973 )
									ret := 0.142857
							if( ema1 > 163.829 )
								if( ema3 <= 187.609 )
									ret := 0.057593
								if( ema3 > 187.609 )
									ret := -0.050401
					if( ema12 > 0.0454 )
						if( d_k <= -9.60331 )
							if( smoothK_k <= 33.9803 )
								if( k <= 22.4971 )
									ret := 0.083333
								if( k > 22.4971 )
									ret := -0.395833
							if( smoothK_k > 33.9803 )
								if( d <= 19.7488 )
									ret := 0.750000 // buy
								if( d > 19.7488 )
									ret := -0.104569
						if( d_k > -9.60331 )
							if( ema13 <= 0.06636 )
								if( ema1 <= 186.063 )
									ret := -0.208511
								if( ema1 > 186.063 )
									ret := 0.268293
							if( ema13 > 0.06636 )
								if( rsi1 <= 83.9883 )
									ret := -0.013845
								if( rsi1 > 83.9883 )
									ret := 0.259701
			if( ema12 > 0.15415 )
				if( ema13 <= 1.9603 )
					if( ema3 <= 187.485 )
						if( tema <= 173.833 )
							if( tema <= 155.901 )
								if( rsi1 <= 79.8286 )
									ret := -0.152778
								if( rsi1 > 79.8286 )
									ret := -0.651163
							if( tema > 155.901 )
								if( ema13 <= 0.392749 )
									ret := -0.119487
								if( ema13 > 0.392749 )
									ret := 0.104628
						if( tema > 173.833 )
							if( smoothD_d <= 90.5591 )
								if( k <= 82.4595 )
									ret := -0.414201
								if( k > 82.4595 )
									ret := 0.032468
							if( smoothD_d > 90.5591 )
								if( rsi1 <= 64.0792 )
									ret := 0.238095
								if( rsi1 > 64.0792 )
									ret := -0.488372
					if( ema3 > 187.485 )
						if( k <= 95.1348 )
							if( smoothK_k <= 61.8262 )
								if( ema2 <= 188.092 )
									ret := 0.833333 // buy
								if( ema2 > 188.092 )
									ret := -0.105263
							if( smoothK_k > 61.8262 )
								if( rsi1 <= 82.8205 )
									ret := -0.607143
								if( rsi1 > 82.8205 )
									ret := 0.428571
						if( k > 95.1348 )
							if( ema12 <= 0.226343 )
								if( smoothD_d <= 95.8837 )
									ret := 0.529412
								if( smoothD_d > 95.8837 )
									ret := -0.600000
							if( ema12 > 0.226343 )
								if( d <= 99.9982 )
									ret := 0.907407 // buy
								if( d > 99.9982 )
									ret := 0.250000
				if( ema13 > 1.9603 )
					if( ema13 <= 9.82694 )
						if( ema3 <= 174.82 )
							ret := 1.000000 // buy
						if( ema3 > 174.82 )
							ret := 0.200000
					if( ema13 > 9.82694 )
						ret := 0.000000
		if( d_k > 2.85142 )
			if( ema1 <= 149.986 )
				if( smoothK_k <= 75.4053 )
					if( k <= 23.537 )
						if( rsi1 <= 40.1199 )
							ret := 1.000000 // buy
						if( rsi1 > 40.1199 )
							if( ema3 <= 149.915 )
								if( d <= 29.4624 )
									ret := 0.000000
								if( d > 29.4624 )
									ret := 0.500000
							if( ema3 > 149.915 )
								ret := 0.800000 // buy
					if( k > 23.537 )
						if( d_k <= 6.21641 )
							if( ema12 <= -0.027464 )
								ret := -1.000000 // sell
							if( ema12 > -0.027464 )
								ret := 0.000000
						if( d_k > 6.21641 )
							if( rsi1 <= 33.4363 )
								ret := 0.800000 // buy
							if( rsi1 > 33.4363 )
								if( smoothK_k <= 54.8038 )
									ret := -0.166667
								if( smoothK_k > 54.8038 )
									ret := 0.230769
				if( smoothK_k > 75.4053 )
					if( ema3 <= 149.745 )
						if( smoothD_d <= 90.8959 )
							if( smoothK_k <= 81.3633 )
								if( ema12 <= 0.130604 )
									ret := 1.000000 // buy
								if( ema12 > 0.130604 )
									ret := 0.750000 // buy
							if( smoothK_k > 81.3633 )
								ret := 0.500000
						if( smoothD_d > 90.8959 )
							ret := 1.000000 // buy
					if( ema3 > 149.745 )
						ret := -0.250000
			if( ema1 > 149.986 )
				if( k <= 0.160491 )
					if( rsi1 <= 36.3064 )
						if( rsi1 <= 29.9203 )
							if( rsi1 <= 24.4888 )
								if( d <= 11.8932 )
									ret := 0.200000
								if( d > 11.8932 )
									ret := -0.291667
							if( rsi1 > 24.4888 )
								if( ema12 <= -0.051847 )
									ret := -0.403509
								if( ema12 > -0.051847 )
									ret := 0.062500
						if( rsi1 > 29.9203 )
							if( ema3 <= 168.606 )
								if( rsi1 <= 33.7499 )
									ret := 0.619048
								if( rsi1 > 33.7499 )
									ret := 0.062500
							if( ema3 > 168.606 )
								if( ema3 <= 169.198 )
									ret := -0.714286 // sell
								if( ema3 > 169.198 )
									ret := 0.107143
					if( rsi1 > 36.3064 )
						if( ema1 <= 167.65 )
							if( ema3 <= 156.532 )
								if( d <= 9.5414 )
									ret := 0.363636
								if( d > 9.5414 )
									ret := -0.125000
							if( ema3 > 156.532 )
								if( ema13 <= 0.312896 )
									ret := -0.417840
								if( ema13 > 0.312896 )
									ret := 0.272727
						if( ema1 > 167.65 )
							if( smoothD_d <= 0.08194 )
								if( ema2 <= 174.137 )
									ret := 0.500000
								if( ema2 > 174.137 )
									ret := 0.800000 // buy
							if( smoothD_d > 0.08194 )
								if( rsi1 <= 67.1905 )
									ret := -0.080460
								if( rsi1 > 67.1905 )
									ret := 0.600000
				if( k > 0.160491 )
					if( rsi1 <= 50.9169 )
						if( k <= 16.3845 )
							if( rsi1 <= 29.0969 )
								if( ema12 <= -0.078466 )
									ret := 0.408602
								if( ema12 > -0.078466 )
									ret := 0.140673
							if( rsi1 > 29.0969 )
								if( ema3 <= 151.195 )
									ret := 0.578947
								if( ema3 > 151.195 )
									ret := 0.027893
						if( k > 16.3845 )
							if( d_k <= 10.9805 )
								if( ema13 <= 0.03238 )
									ret := 0.137347
								if( ema13 > 0.03238 )
									ret := 0.309133
							if( d_k > 10.9805 )
								if( ema13 <= -0.053335 )
									ret := -0.015898
								if( ema13 > -0.053335 )
									ret := 0.129425
					if( rsi1 > 50.9169 )
						if( ema3 <= 185.16 )
							if( ema3 <= 181.1 )
								if( ema12 <= 0.205083 )
									ret := 0.052045
								if( ema12 > 0.205083 )
									ret := -0.077118
							if( ema3 > 181.1 )
								if( d <= 48.3188 )
									ret := -0.090551
								if( d > 48.3188 )
									ret := 0.315254
						if( ema3 > 185.16 )
							if( rsi1 <= 73.903 )
								if( ema12 <= 0.064398 )
									ret := -0.006803
								if( ema12 > 0.064398 )
									ret := -0.244032
							if( rsi1 > 73.903 )
								if( ema1 <= 187.793 )
									ret := -0.162162
								if( ema1 > 187.793 )
									ret := 0.262626
	
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
float op_operation = decision_tree_0_GOOG_1Min_473c34a4(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)

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


