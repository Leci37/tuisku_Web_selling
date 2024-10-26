//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: LTCUSDT_15Min_2ST0_b0039bab Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LTCUSDT_15Min_2ST0_b0039bab", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LTCUSDT_15Min_b0039bab(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( smoothK_k <= 34.6416 )
		if( tema <= 63.2209 )
			if( ema12 <= -0.118521 )
				if( ema13 <= -0.976985 )
					if( rsi1 <= 32.9395 )
						if( ema3 <= 59.154 )
							if( tema <= 45.4366 )
								if( rsi1 <= 25.4802 )
									ret := 1.000000 // buy
								if( rsi1 > 25.4802 )
									ret := 0.333333
							if( tema > 45.4366 )
								if( ema3 <= 51.5873 )
									ret := -0.718750 // sell
								if( ema3 > 51.5873 )
									ret := 0.179104
						if( ema3 > 59.154 )
							if( rsi1 <= 7.58387 )
								if( d_k <= 0.374572 )
									ret := 0.000000
								if( d_k > 0.374572 )
									ret := -1.000000 // sell
							if( rsi1 > 7.58387 )
								if( k <= 1.4956 )
									ret := 0.320000
								if( k > 1.4956 )
									ret := 0.686486
					if( rsi1 > 32.9395 )
						if( ema3 <= 53.0923 )
							if( ema12 <= -0.461531 )
								ret := 0.750000 // buy
							if( ema12 > -0.461531 )
								ret := 1.000000 // buy
						if( ema3 > 53.0923 )
							if( k <= 31.3308 )
								if( ema1 <= 58.1863 )
									ret := -1.000000 // sell
								if( ema1 > 58.1863 )
									ret := -0.750000 // sell
							if( k > 31.3308 )
								ret := -0.500000
				if( ema13 > -0.976985 )
					if( rsi1 <= 30.6036 )
						if( smoothK_k <= 9.12396 )
							if( d_k <= 0.180368 )
								if( ema2 <= 51.5053 )
									ret := 0.458333
								if( ema2 > 51.5053 )
									ret := -0.081731
							if( d_k > 0.180368 )
								if( d_k <= 2.77625 )
									ret := 0.375465
								if( d_k > 2.77625 )
									ret := 0.096257
						if( smoothK_k > 9.12396 )
							if( rsi1 <= 27.5367 )
								if( tema <= 57.5735 )
									ret := -0.138614
								if( tema > 57.5735 )
									ret := -0.575269
							if( rsi1 > 27.5367 )
								if( smoothD_d <= 4.15117 )
									ret := -0.888889 // sell
								if( smoothD_d > 4.15117 )
									ret := 0.092391
					if( rsi1 > 30.6036 )
						if( ema1 <= 61.5487 )
							if( smoothK_k <= -2.27774 )
								if( d <= 12.0556 )
									ret := -0.395062
								if( d > 12.0556 )
									ret := 0.500000
							if( smoothK_k > -2.27774 )
								if( rsi1 <= 33.2129 )
									ret := 0.291785
								if( rsi1 > 33.2129 )
									ret := 0.084459
						if( ema1 > 61.5487 )
							if( k <= 14.8832 )
								if( tema <= 62.8054 )
									ret := 0.101010
								if( tema > 62.8054 )
									ret := 0.800000 // buy
							if( k > 14.8832 )
								if( smoothD_d <= 48.5467 )
									ret := 0.604790
								if( smoothD_d > 48.5467 )
									ret := -0.333333
			if( ema12 > -0.118521 )
				if( rsi1 <= 34.8734 )
					if( ema12 <= -0.036252 )
						if( tema <= 57.6727 )
							if( d <= 10.482 )
								if( ema12 <= -0.101405 )
									ret := 0.512821
								if( ema12 > -0.101405 )
									ret := 0.052083
							if( d > 10.482 )
								if( ema12 <= -0.104096 )
									ret := -0.511111
								if( ema12 > -0.104096 )
									ret := -0.091954
						if( tema > 57.6727 )
							if( rsi1 <= 28.4155 )
								if( k <= 13.4586 )
									ret := -0.296875
								if( k > 13.4586 )
									ret := -0.837209 // sell
							if( rsi1 > 28.4155 )
								if( tema <= 60.1773 )
									ret := -0.490909
								if( tema > 60.1773 )
									ret := 0.000000
					if( ema12 > -0.036252 )
						if( rsi1 <= 32.4838 )
							if( ema13 <= -0.035707 )
								if( tema <= 60.2394 )
									ret := 0.000000
								if( tema > 60.2394 )
									ret := -0.375000
							if( ema13 > -0.035707 )
								if( ema12 <= 0.031809 )
									ret := -0.597938
								if( ema12 > 0.031809 )
									ret := -0.885714 // sell
						if( rsi1 > 32.4838 )
							if( k <= 3.61094 )
								if( d <= 3.59053 )
									ret := -0.166667
								if( d > 3.59053 )
									ret := 0.357143
							if( k > 3.61094 )
								if( ema3 <= 61.796 )
									ret := -0.781250 // sell
								if( ema3 > 61.796 )
									ret := -0.083333
				if( rsi1 > 34.8734 )
					if( d_k <= 2.25363 )
						if( ema3 <= 47.4981 )
							if( d_k <= -0.93509 )
								if( smoothK_k <= 19.8333 )
									ret := -0.969697 // sell
								if( smoothK_k > 19.8333 )
									ret := -0.266667
							if( d_k > -0.93509 )
								if( rsi1 <= 51.7972 )
									ret := 0.636364
								if( rsi1 > 51.7972 )
									ret := -1.000000 // sell
						if( ema3 > 47.4981 )
							if( smoothD_d <= -0.123032 )
								if( rsi1 <= 43.2001 )
									ret := -0.068182
								if( rsi1 > 43.2001 )
									ret := 0.318182
							if( smoothD_d > -0.123032 )
								if( smoothK_k <= 10.5559 )
									ret := -0.252800
								if( smoothK_k > 10.5559 )
									ret := -0.054122
					if( d_k > 2.25363 )
						if( ema12 <= 0.396791 )
							if( d_k <= 11.2181 )
								if( ema12 <= 0.001749 )
									ret := 0.273463
								if( ema12 > 0.001749 )
									ret := 0.083333
							if( d_k > 11.2181 )
								if( rsi1 <= 40.0091 )
									ret := -0.355030
								if( rsi1 > 40.0091 )
									ret := 0.007188
						if( ema12 > 0.396791 )
							if( ema3 <= 55.0412 )
								if( smoothD_d <= 21.6945 )
									ret := -0.777778 // sell
								if( smoothD_d > 21.6945 )
									ret := 0.187500
							if( ema3 > 55.0412 )
								if( ema13 <= 0.906383 )
									ret := -0.692308
								if( ema13 > 0.906383 )
									ret := -1.000000 // sell
		if( tema > 63.2209 )
			if( k <= 10.2225 )
				if( ema13 <= -0.449729 )
					if( ema1 <= 99.5387 )
						if( rsi1 <= 23.6393 )
							if( ema13 <= -1.20833 )
								if( k <= 4.55539 )
									ret := 0.554286
								if( k > 4.55539 )
									ret := -0.531250
							if( ema13 > -1.20833 )
								if( ema13 <= -0.576339 )
									ret := -0.215962
								if( ema13 > -0.576339 )
									ret := -0.628571
						if( rsi1 > 23.6393 )
							if( k <= 5.97705 )
								if( ema3 <= 70.0695 )
									ret := 0.736842 // buy
								if( ema3 > 70.0695 )
									ret := 0.219178
							if( k > 5.97705 )
								if( rsi1 <= 32.4498 )
									ret := -0.244565
								if( rsi1 > 32.4498 )
									ret := 0.324324
					if( ema1 > 99.5387 )
						if( ema3 <= 102.071 )
							if( ema3 <= 101.164 )
								if( ema12 <= -0.329319 )
									ret := -0.775510 // sell
								if( ema12 > -0.329319 )
									ret := 0.000000
							if( ema3 > 101.164 )
								if( rsi1 <= 28.5767 )
									ret := -0.230769
								if( rsi1 > 28.5767 )
									ret := 0.666667
						if( ema3 > 102.071 )
							if( ema2 <= 108.184 )
								if( ema12 <= -0.360421 )
									ret := -0.908257 // sell
								if( ema12 > -0.360421 )
									ret := -0.562500
							if( ema2 > 108.184 )
								ret := 0.000000
				if( ema13 > -0.449729 )
					if( d <= 3.8649 )
						if( rsi1 <= 28.0332 )
							if( ema13 <= -0.345826 )
								if( tema <= 66.6467 )
									ret := 0.217391
								if( tema > 66.6467 )
									ret := -0.631206
							if( ema13 > -0.345826 )
								if( ema12 <= 0.027822 )
									ret := -0.746845 // sell
								if( ema12 > 0.027822 )
									ret := -0.951389 // sell
						if( rsi1 > 28.0332 )
							if( ema12 <= -0.043706 )
								if( d <= 2.98113 )
									ret := 0.056485
								if( d > 2.98113 )
									ret := -0.332016
							if( ema12 > -0.043706 )
								if( rsi1 <= 38.4582 )
									ret := -0.651134
								if( rsi1 > 38.4582 )
									ret := -0.321303
					if( d > 3.8649 )
						if( rsi1 <= 33.3249 )
							if( ema12 <= -0.09013 )
								if( rsi1 <= 25.5883 )
									ret := -0.656118
								if( rsi1 > 25.5883 )
									ret := -0.312704
							if( ema12 > -0.09013 )
								if( ema12 <= 0.017033 )
									ret := -0.641280
								if( ema12 > 0.017033 )
									ret := -0.845977 // sell
						if( rsi1 > 33.3249 )
							if( rsi1 <= 53.1754 )
								if( ema12 <= 0.062841 )
									ret := -0.121188
								if( ema12 > 0.062841 )
									ret := -0.562783
							if( rsi1 > 53.1754 )
								if( ema12 <= 0.284344 )
									ret := 0.104854
								if( ema12 > 0.284344 )
									ret := -0.361446
			if( k > 10.2225 )
				if( rsi1 <= 44.5035 )
					if( smoothD_d <= 11.9072 )
						if( ema12 <= -0.389922 )
							if( d_k <= -7.5347 )
								if( ema1 <= 91.6265 )
									ret := -0.558442
								if( ema1 > 91.6265 )
									ret := 0.085714
							if( d_k > -7.5347 )
								if( rsi1 <= 22.9955 )
									ret := -0.290000
								if( rsi1 > 22.9955 )
									ret := 0.357843
						if( ema12 > -0.389922 )
							if( ema13 <= 0.051216 )
								if( rsi1 <= 34.1363 )
									ret := -0.548454
								if( rsi1 > 34.1363 )
									ret := -0.257825
							if( ema13 > 0.051216 )
								if( rsi1 <= 42.3483 )
									ret := -0.726950 // sell
								if( rsi1 > 42.3483 )
									ret := -0.494118
					if( smoothD_d > 11.9072 )
						if( ema12 <= -0.192676 )
							if( rsi1 <= 18.7048 )
								if( ema2 <= 92.86 )
									ret := -0.715789 // sell
								if( ema2 > 92.86 )
									ret := -0.156250
							if( rsi1 > 18.7048 )
								if( ema12 <= -0.358759 )
									ret := 0.265060
								if( ema12 > -0.358759 )
									ret := -0.047411
						if( ema12 > -0.192676 )
							if( ema12 <= 0.019493 )
								if( rsi1 <= 38.6891 )
									ret := -0.378488
								if( rsi1 > 38.6891 )
									ret := -0.077279
							if( ema12 > 0.019493 )
								if( ema12 <= 0.070213 )
									ret := -0.516588
								if( ema12 > 0.070213 )
									ret := -0.746507 // sell
				if( rsi1 > 44.5035 )
					if( ema12 <= 0.071258 )
						if( ema13 <= -0.077539 )
							if( tema <= 77.3424 )
								if( rsi1 <= 49.4066 )
									ret := 0.397849
								if( rsi1 > 49.4066 )
									ret := 0.776596 // buy
							if( tema > 77.3424 )
								if( ema12 <= -0.077103 )
									ret := 0.292035
								if( ema12 > -0.077103 )
									ret := -0.076923
						if( ema13 > -0.077539 )
							if( rsi1 <= 49.6601 )
								if( ema3 <= 64.515 )
									ret := -0.383838
								if( ema3 > 64.515 )
									ret := -0.005140
							if( rsi1 > 49.6601 )
								if( ema13 <= 0.146149 )
									ret := 0.171321
								if( ema13 > 0.146149 )
									ret := 0.369681
					if( ema12 > 0.071258 )
						if( rsi1 <= 53.0302 )
							if( ema12 <= 0.16144 )
								if( rsi1 <= 49.7759 )
									ret := -0.491954
								if( rsi1 > 49.7759 )
									ret := -0.190332
							if( ema12 > 0.16144 )
								if( smoothK_k <= 7.54876 )
									ret := 0.230769
								if( smoothK_k > 7.54876 )
									ret := -0.686335
						if( rsi1 > 53.0302 )
							if( ema12 <= 0.175526 )
								if( rsi1 <= 55.7051 )
									ret := -0.055016
								if( rsi1 > 55.7051 )
									ret := 0.148724
							if( ema12 > 0.175526 )
								if( rsi1 <= 57.249 )
									ret := -0.369021
								if( rsi1 > 57.249 )
									ret := -0.068285
	if( smoothK_k > 34.6416 )
		if( rsi1 <= 65.7374 )
			if( ema12 <= -0.046986 )
				if( rsi1 <= 45.7718 )
					if( ema12 <= -0.116537 )
						if( rsi1 <= 34.9367 )
							if( tema <= 61.2081 )
								if( ema3 <= 53.2037 )
									ret := 0.004132
								if( ema3 > 53.2037 )
									ret := 0.411765
							if( tema > 61.2081 )
								if( rsi1 <= 24.0601 )
									ret := -0.589862
								if( rsi1 > 24.0601 )
									ret := -0.101933
						if( rsi1 > 34.9367 )
							if( ema12 <= -0.338163 )
								if( ema3 <= 62.868 )
									ret := 0.013158
								if( ema3 > 62.868 )
									ret := 0.503378
							if( ema12 > -0.338163 )
								if( ema13 <= -0.608798 )
									ret := -0.164804
								if( ema13 > -0.608798 )
									ret := 0.233660
					if( ema12 > -0.116537 )
						if( ema1 <= 56.8076 )
							if( d <= 84.2592 )
								if( ema1 <= 49.447 )
									ret := -0.184211
								if( ema1 > 49.447 )
									ret := 0.293801
							if( d > 84.2592 )
								if( rsi1 <= 38.8415 )
									ret := 0.625000
								if( rsi1 > 38.8415 )
									ret := -0.357143
						if( ema1 > 56.8076 )
							if( rsi1 <= 42.3573 )
								if( d <= 87.6538 )
									ret := -0.265101
								if( d > 87.6538 )
									ret := 0.137255
							if( rsi1 > 42.3573 )
								if( d_k <= -5.51985 )
									ret := -0.140845
								if( d_k > -5.51985 )
									ret := 0.113402
				if( rsi1 > 45.7718 )
					if( ema12 <= -0.134995 )
						if( tema <= 55.6572 )
							if( tema <= 51.8416 )
								if( ema13 <= -0.516946 )
									ret := 0.190476
								if( ema13 > -0.516946 )
									ret := 0.937500 // buy
							if( tema > 51.8416 )
								if( ema13 <= -0.516272 )
									ret := -0.866667 // sell
								if( ema13 > -0.516272 )
									ret := 0.029412
						if( tema > 55.6572 )
							if( rsi1 <= 53.4757 )
								if( d_k <= -23.602 )
									ret := 0.136691
								if( d_k > -23.602 )
									ret := 0.605320
							if( rsi1 > 53.4757 )
								if( ema13 <= -1.21179 )
									ret := 0.312500
								if( ema13 > -1.21179 )
									ret := 0.794096 // buy
					if( ema12 > -0.134995 )
						if( rsi1 <= 52.893 )
							if( ema1 <= 74.6617 )
								if( ema13 <= -0.304532 )
									ret := -0.081081
								if( ema13 > -0.304532 )
									ret := 0.331970
							if( ema1 > 74.6617 )
								if( ema13 <= -0.367893 )
									ret := -0.619048
								if( ema13 > -0.367893 )
									ret := 0.137712
						if( rsi1 > 52.893 )
							if( ema13 <= -0.334489 )
								if( d <= 85.4449 )
									ret := -0.354839
								if( d > 85.4449 )
									ret := 0.407407
							if( ema13 > -0.334489 )
								if( rsi1 <= 57.1648 )
									ret := 0.473282
								if( rsi1 > 57.1648 )
									ret := 0.642916
			if( ema12 > -0.046986 )
				if( rsi1 <= 53.5558 )
					if( ema3 <= 62.6058 )
						if( ema2 <= 50.4208 )
							if( d_k <= 0.309411 )
								if( smoothD_d <= 65.1673 )
									ret := 0.377358
								if( smoothD_d > 65.1673 )
									ret := -0.500000
							if( d_k > 0.309411 )
								if( smoothK_k <= 41.1456 )
									ret := 0.000000
								if( smoothK_k > 41.1456 )
									ret := 0.692308
						if( ema2 > 50.4208 )
							if( ema12 <= 0.193546 )
								if( d_k <= 23.3542 )
									ret := 0.041492
								if( d_k > 23.3542 )
									ret := 0.652174
							if( ema12 > 0.193546 )
								if( ema2 <= 57.6217 )
									ret := 0.166667
								if( ema2 > 57.6217 )
									ret := -0.826087 // sell
					if( ema3 > 62.6058 )
						if( rsi1 <= 40.9068 )
							if( ema12 <= 0.016185 )
								if( smoothK_k <= 42.7777 )
									ret := -0.606299
								if( smoothK_k > 42.7777 )
									ret := -0.287037
							if( ema12 > 0.016185 )
								if( ema1 <= 92.1862 )
									ret := -0.836364 // sell
								if( ema1 > 92.1862 )
									ret := -0.500000
						if( rsi1 > 40.9068 )
							if( d_k <= 5.44179 )
								if( ema12 <= 0.06974 )
									ret := -0.158401
								if( ema12 > 0.06974 )
									ret := -0.371019
							if( d_k > 5.44179 )
								if( ema12 <= 0.084563 )
									ret := 0.020446
								if( ema12 > 0.084563 )
									ret := -0.335593
				if( rsi1 > 53.5558 )
					if( ema13 <= 0.23359 )
						if( ema1 <= 57.3389 )
							if( smoothD_d <= 78.5213 )
								if( tema <= 55.1803 )
									ret := 0.160043
								if( tema > 55.1803 )
									ret := -0.167742
							if( smoothD_d > 78.5213 )
								if( ema12 <= 0.036891 )
									ret := 0.094421
								if( ema12 > 0.036891 )
									ret := -0.293388
						if( ema1 > 57.3389 )
							if( ema12 <= 0.106631 )
								if( rsi1 <= 58.6671 )
									ret := 0.149800
								if( rsi1 > 58.6671 )
									ret := 0.344843
							if( ema12 > 0.106631 )
								if( ema12 <= 0.176574 )
									ret := 0.023453
								if( ema12 > 0.176574 )
									ret := -0.407960
					if( ema13 > 0.23359 )
						if( ema12 <= 0.216242 )
							if( tema <= 66.6386 )
								if( d <= 46.5896 )
									ret := -0.427419
								if( d > 46.5896 )
									ret := 0.001174
							if( tema > 66.6386 )
								if( rsi1 <= 59.824 )
									ret := -0.052050
								if( rsi1 > 59.824 )
									ret := 0.239558
						if( ema12 > 0.216242 )
							if( d_k <= 14.3212 )
								if( ema13 <= 0.378755 )
									ret := -0.385396
								if( ema13 > 0.378755 )
									ret := -0.194001
							if( d_k > 14.3212 )
								if( smoothK_k <= 47.8474 )
									ret := -0.195652
								if( smoothK_k > 47.8474 )
									ret := 0.345070
		if( rsi1 > 65.7374 )
			if( ema1 <= 62.1168 )
				if( ema12 <= 0.014481 )
					if( rsi1 <= 65.9083 )
						ret := -0.166667
					if( rsi1 > 65.9083 )
						if( tema <= 61.1811 )
							if( d <= 86.1917 )
								if( smoothD_d <= 80.1463 )
									ret := 0.800000 // buy
								if( smoothD_d > 80.1463 )
									ret := 0.333333
							if( d > 86.1917 )
								if( rsi1 <= 69.0724 )
									ret := 0.878788 // buy
								if( rsi1 > 69.0724 )
									ret := 1.000000 // buy
						if( tema > 61.1811 )
							if( ema3 <= 61.7522 )
								if( ema3 <= 61.3917 )
									ret := 0.333333
								if( ema3 > 61.3917 )
									ret := 0.000000
							if( ema3 > 61.7522 )
								if( ema3 <= 62.1019 )
									ret := 1.000000 // buy
								if( ema3 > 62.1019 )
									ret := 0.500000
				if( ema12 > 0.014481 )
					if( d <= 39.2328 )
						if( ema2 <= 61.3979 )
							if( ema2 <= 53.2689 )
								if( smoothD_d <= 24.1846 )
									ret := -0.750000 // sell
								if( smoothD_d > 24.1846 )
									ret := 0.571429
							if( ema2 > 53.2689 )
								if( ema1 <= 60.5893 )
									ret := 0.870968 // buy
								if( ema1 > 60.5893 )
									ret := 0.363636
						if( ema2 > 61.3979 )
							ret := -0.500000
					if( d > 39.2328 )
						if( rsi1 <= 81.2723 )
							if( tema <= 57.5035 )
								if( ema12 <= 0.749701 )
									ret := -0.101081
								if( ema12 > 0.749701 )
									ret := 0.630769
							if( tema > 57.5035 )
								if( ema12 <= 0.235535 )
									ret := 0.224398
								if( ema12 > 0.235535 )
									ret := -0.003953
						if( rsi1 > 81.2723 )
							if( k <= 88.3663 )
								if( rsi1 <= 86.7628 )
									ret := -0.377049
								if( rsi1 > 86.7628 )
									ret := 0.800000 // buy
							if( k > 88.3663 )
								if( d_k <= -0.410797 )
									ret := 0.489083
								if( d_k > -0.410797 )
									ret := 0.179916
			if( ema1 > 62.1168 )
				if( ema12 <= 0.214631 )
					if( rsi1 <= 70.1496 )
						if( ema12 <= 0.046136 )
							if( ema2 <= 63.5807 )
								if( d <= 99.3134 )
									ret := 0.127660
								if( d > 99.3134 )
									ret := 0.916667 // buy
							if( ema2 > 63.5807 )
								if( ema13 <= -0.073855 )
									ret := 0.697266
								if( ema13 > -0.073855 )
									ret := 0.573744
						if( ema12 > 0.046136 )
							if( ema1 <= 86.9863 )
								if( d_k <= 2.58221 )
									ret := 0.231795
								if( d_k > 2.58221 )
									ret := 0.380497
							if( ema1 > 86.9863 )
								if( tema <= 99.2703 )
									ret := 0.474093
								if( tema > 99.2703 )
									ret := 0.079365
					if( rsi1 > 70.1496 )
						if( k <= 94.7557 )
							if( d_k <= -8.69264 )
								if( ema12 <= -0.029741 )
									ret := 0.913793 // buy
								if( ema12 > -0.029741 )
									ret := 0.641762
							if( d_k > -8.69264 )
								if( smoothD_d <= 94.4398 )
									ret := 0.519858
								if( smoothD_d > 94.4398 )
									ret := 0.887097 // buy
						if( k > 94.7557 )
							if( ema13 <= -0.023244 )
								if( d_k <= 2.2e-05 )
									ret := 0.809524 // buy
								if( d_k > 2.2e-05 )
									ret := 0.916256 // buy
							if( ema13 > -0.023244 )
								if( rsi1 <= 76.8642 )
									ret := 0.576792
								if( rsi1 > 76.8642 )
									ret := 0.760303 // buy
				if( ema12 > 0.214631 )
					if( rsi1 <= 72.3461 )
						if( d_k <= 5.5455 )
							if( d_k <= -25.826 )
								if( smoothK_k <= 62.1842 )
									ret := -0.500000
								if( smoothK_k > 62.1842 )
									ret := -0.937500 // sell
							if( d_k > -25.826 )
								if( d <= 96.0881 )
									ret := 0.034692
								if( d > 96.0881 )
									ret := -0.256410
						if( d_k > 5.5455 )
							if( ema3 <= 83.4667 )
								if( ema12 <= 0.311534 )
									ret := 0.451220
								if( ema12 > 0.311534 )
									ret := 0.085973
							if( ema3 > 83.4667 )
								if( ema12 <= 2.35155 )
									ret := 0.533333
								if( ema12 > 2.35155 )
									ret := -1.000000 // sell
					if( rsi1 > 72.3461 )
						if( ema3 <= 69.9394 )
							if( ema12 <= 0.356613 )
								if( rsi1 <= 76.7239 )
									ret := 0.141243
								if( rsi1 > 76.7239 )
									ret := 0.492063
							if( ema12 > 0.356613 )
								if( smoothD_d <= 87.2653 )
									ret := 0.172566
								if( smoothD_d > 87.2653 )
									ret := -0.362903
						if( ema3 > 69.9394 )
							if( rsi1 <= 79.2844 )
								if( ema3 <= 88.8402 )
									ret := 0.258687
								if( ema3 > 88.8402 )
									ret := 0.454545
							if( rsi1 > 79.2844 )
								if( ema13 <= 1.01361 )
									ret := 0.678815
								if( ema13 > 1.01361 )
									ret := 0.332096
	
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
float op_operation = decision_tree_0_LTCUSDT_15Min_b0039bab(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)

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


