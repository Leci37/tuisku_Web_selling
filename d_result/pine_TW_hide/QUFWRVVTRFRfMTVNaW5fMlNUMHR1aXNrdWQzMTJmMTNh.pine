//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: AAVEUSDT_15Min_2ST0_d312f13a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAVEUSDT_15Min_2ST0_d312f13a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAVEUSDT_15Min_d312f13a(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( smoothK_k <= 47.1045 )
		if( k <= 15.4378 )
			if( tema <= 91.0294 )
				if( rsi1 <= 34.4815 )
					if( ema12 <= -0.257459 )
						if( d_k <= 0.254621 )
							if( tema <= 58.0329 )
								if( ema3 <= 57.0586 )
									ret := -0.187500
								if( ema3 > 57.0586 )
									ret := 0.486239
							if( tema > 58.0329 )
								if( rsi1 <= 24.1027 )
									ret := -0.358760
								if( rsi1 > 24.1027 )
									ret := -0.047945
						if( d_k > 0.254621 )
							if( rsi1 <= 23.2649 )
								if( ema13 <= -1.03271 )
									ret := 0.171254
								if( ema13 > -1.03271 )
									ret := -0.308483
							if( rsi1 > 23.2649 )
								if( rsi1 <= 28.9365 )
									ret := 0.229412
								if( rsi1 > 28.9365 )
									ret := -0.018868
					if( ema12 > -0.257459 )
						if( rsi1 <= 22.2136 )
							if( ema1 <= 55.7105 )
								if( ema1 <= 51.8024 )
									ret := -0.666667
								if( ema1 > 51.8024 )
									ret := -0.083333
							if( ema1 > 55.7105 )
								if( ema1 <= 76.4751 )
									ret := -0.631902
								if( ema1 > 76.4751 )
									ret := -0.789700 // sell
						if( rsi1 > 22.2136 )
							if( ema13 <= 0.00324 )
								if( smoothK_k <= -2.98338 )
									ret := -0.140845
								if( smoothK_k > -2.98338 )
									ret := -0.380865
							if( ema13 > 0.00324 )
								if( ema12 <= -0.125677 )
									ret := 0.444444
								if( ema12 > -0.125677 )
									ret := -0.622857
				if( rsi1 > 34.4815 )
					if( ema12 <= -0.047713 )
						if( smoothK_k <= 5.39259 )
							if( d_k <= 0.013763 )
								if( ema12 <= -0.394868 )
									ret := 0.385965
								if( ema12 > -0.394868 )
									ret := -0.062500
							if( d_k > 0.013763 )
								if( d <= 23.2594 )
									ret := 0.280473
								if( d > 23.2594 )
									ret := -0.357143
						if( smoothK_k > 5.39259 )
							if( ema2 <= 51.1344 )
								ret := 1.000000 // buy
							if( ema2 > 51.1344 )
								if( smoothD_d <= 2.73218 )
									ret := -0.270270
								if( smoothD_d > 2.73218 )
									ret := 0.003304
					if( ema12 > -0.047713 )
						if( rsi1 <= 41.151 )
							if( tema <= 63.8841 )
								if( rsi1 <= 37.0958 )
									ret := -0.323232
								if( rsi1 > 37.0958 )
									ret := -0.042781
							if( tema > 63.8841 )
								if( ema12 <= 0.082287 )
									ret := -0.376368
								if( ema12 > 0.082287 )
									ret := -0.698413
						if( rsi1 > 41.151 )
							if( ema12 <= 0.130661 )
								if( d_k <= -1.84716 )
									ret := -0.150649
								if( d_k > -1.84716 )
									ret := 0.029590
							if( ema12 > 0.130661 )
								if( ema2 <= 71.5574 )
									ret := -0.357895
								if( ema2 > 71.5574 )
									ret := -0.151943
			if( tema > 91.0294 )
				if( rsi1 <= 48.7175 )
					if( ema12 <= -0.180567 )
						if( rsi1 <= 28.6545 )
							if( ema13 <= -1.57672 )
								if( ema2 <= 107.413 )
									ret := 0.213873
								if( ema2 > 107.413 )
									ret := -0.319703
							if( ema13 > -1.57672 )
								if( d <= 2.30631 )
									ret := -0.768908 // sell
								if( d > 2.30631 )
									ret := -0.478338
						if( rsi1 > 28.6545 )
							if( ema12 <= -0.650514 )
								if( ema2 <= 95.6744 )
									ret := -0.823529 // sell
								if( ema2 > 95.6744 )
									ret := 0.427184
							if( ema12 > -0.650514 )
								if( rsi1 <= 33.6342 )
									ret := -0.319398
								if( rsi1 > 33.6342 )
									ret := 0.100000
					if( ema12 > -0.180567 )
						if( rsi1 <= 33.2168 )
							if( k <= 1.23316 )
								if( ema12 <= -0.09137 )
									ret := -0.777778 // sell
								if( ema12 > -0.09137 )
									ret := -0.907173 // sell
							if( k > 1.23316 )
								if( ema12 <= -0.058542 )
									ret := -0.673529
								if( ema12 > -0.058542 )
									ret := -0.832474 // sell
						if( rsi1 > 33.2168 )
							if( ema12 <= 0.26905 )
								if( rsi1 <= 40.7975 )
									ret := -0.537183
								if( rsi1 > 40.7975 )
									ret := -0.331910
							if( ema12 > 0.26905 )
								if( ema1 <= 142.804 )
									ret := -0.839332 // sell
								if( ema1 > 142.804 )
									ret := -0.647059
				if( rsi1 > 48.7175 )
					if( ema12 <= 0.348884 )
						if( ema1 <= 96.0532 )
							if( ema13 <= 0.301564 )
								if( ema2 <= 92.3573 )
									ret := -0.133333
								if( ema2 > 92.3573 )
									ret := 0.482759
							if( ema13 > 0.301564 )
								if( smoothK_k <= 8.10871 )
									ret := -0.111111
								if( smoothK_k > 8.10871 )
									ret := -0.549020
						if( ema1 > 96.0532 )
							if( tema <= 145.491 )
								if( smoothD_d <= 18.3123 )
									ret := 0.318987
								if( smoothD_d > 18.3123 )
									ret := 0.013699
							if( tema > 145.491 )
								if( ema3 <= 159.657 )
									ret := -0.666667
								if( ema3 > 159.657 )
									ret := 0.071429
					if( ema12 > 0.348884 )
						if( rsi1 <= 69.0885 )
							if( ema3 <= 105.281 )
								if( d_k <= -2.58716 )
									ret := -0.022222
								if( d_k > -2.58716 )
									ret := -0.555556
							if( ema3 > 105.281 )
								if( tema <= 113.716 )
									ret := 0.265957
								if( tema > 113.716 )
									ret := -0.344828
						if( rsi1 > 69.0885 )
							if( ema12 <= 1.57324 )
								if( ema13 <= 2.7309 )
									ret := 0.500000
								if( ema13 > 2.7309 )
									ret := 0.916667 // buy
							if( ema12 > 1.57324 )
								if( ema2 <= 103.386 )
									ret := 0.000000
								if( ema2 > 103.386 )
									ret := -0.428571
		if( k > 15.4378 )
			if( ema12 <= -0.284541 )
				if( ema13 <= -0.492537 )
					if( tema <= 104.762 )
						if( rsi1 <= 31.871 )
							if( d_k <= -5.35713 )
								if( ema12 <= -0.72145 )
									ret := 0.043919
								if( ema12 > -0.72145 )
									ret := -0.331818
							if( d_k > -5.35713 )
								if( ema13 <= -3.11131 )
									ret := 0.871795 // buy
								if( ema13 > -3.11131 )
									ret := 0.010711
						if( rsi1 > 31.871 )
							if( ema12 <= -0.435178 )
								if( ema3 <= 100.859 )
									ret := 0.333753
								if( ema3 > 100.859 )
									ret := 0.615385
							if( ema12 > -0.435178 )
								if( smoothD_d <= 16.75 )
									ret := -0.132780
								if( smoothD_d > 16.75 )
									ret := 0.215107
					if( tema > 104.762 )
						if( rsi1 <= 33.5275 )
							if( ema12 <= -1.14283 )
								if( rsi1 <= 24.8076 )
									ret := -0.644068
								if( rsi1 > 24.8076 )
									ret := 0.166667
							if( ema12 > -1.14283 )
								if( ema3 <= 127.995 )
									ret := -0.728155 // sell
								if( ema3 > 127.995 )
									ret := -0.360215
						if( rsi1 > 33.5275 )
							if( ema12 <= -0.519192 )
								if( d_k <= -9.17464 )
									ret := 0.193333
								if( d_k > -9.17464 )
									ret := 0.566879
							if( ema12 > -0.519192 )
								if( ema2 <= 111.859 )
									ret := 0.494382
								if( ema2 > 111.859 )
									ret := -0.227106
				if( ema13 > -0.492537 )
					if( smoothD_d <= 12.0193 )
						if( ema13 <= -0.260991 )
							if( ema12 <= -0.411288 )
								if( rsi1 <= 35.5562 )
									ret := -0.333333
								if( rsi1 > 35.5562 )
									ret := 0.928571 // buy
							if( ema12 > -0.411288 )
								if( rsi1 <= 36.3191 )
									ret := -0.666667
								if( rsi1 > 36.3191 )
									ret := -0.051724
						if( ema13 > -0.260991 )
							if( rsi1 <= 41.0875 )
								if( ema12 <= -0.336034 )
									ret := -0.600000
								if( ema12 > -0.336034 )
									ret := 0.800000 // buy
							if( rsi1 > 41.0875 )
								ret := 1.000000 // buy
					if( smoothD_d > 12.0193 )
						if( rsi1 <= 35.0321 )
							if( ema3 <= 64.278 )
								if( ema13 <= -0.439364 )
									ret := 0.400000
								if( ema13 > -0.439364 )
									ret := 0.833333 // buy
							if( ema3 > 64.278 )
								if( ema12 <= -0.345272 )
									ret := 0.413793
								if( ema12 > -0.345272 )
									ret := -0.152542
						if( rsi1 > 35.0321 )
							if( rsi1 <= 47.3278 )
								if( ema12 <= -0.545489 )
									ret := -1.000000 // sell
								if( ema12 > -0.545489 )
									ret := 0.458746
							if( rsi1 > 47.3278 )
								if( ema13 <= -0.226151 )
									ret := 0.777778 // buy
								if( ema13 > -0.226151 )
									ret := 0.100000
			if( ema12 > -0.284541 )
				if( rsi1 <= 49.9926 )
					if( ema12 <= 0.067247 )
						if( rsi1 <= 36.6454 )
							if( tema <= 90.8779 )
								if( ema1 <= 83.362 )
									ret := -0.199410
								if( ema1 > 83.362 )
									ret := -0.370572
							if( tema > 90.8779 )
								if( smoothD_d <= 53.026 )
									ret := -0.641766
								if( smoothD_d > 53.026 )
									ret := -0.266667
						if( rsi1 > 36.6454 )
							if( tema <= 96.6445 )
								if( ema12 <= -0.060506 )
									ret := 0.088663
								if( ema12 > -0.060506 )
									ret := -0.092957
							if( tema > 96.6445 )
								if( ema12 <= -0.216092 )
									ret := 0.049808
								if( ema12 > -0.216092 )
									ret := -0.327987
					if( ema12 > 0.067247 )
						if( ema12 <= 0.19378 )
							if( ema3 <= 88.6173 )
								if( ema13 <= 0.450914 )
									ret := -0.282187
								if( ema13 > 0.450914 )
									ret := 0.533333
							if( ema3 > 88.6173 )
								if( d_k <= 17.5799 )
									ret := -0.635762
								if( d_k > 17.5799 )
									ret := -0.412903
						if( ema12 > 0.19378 )
							if( ema12 <= 0.384768 )
								if( ema13 <= 0.588685 )
									ret := -0.770089 // sell
								if( ema13 > 0.588685 )
									ret := -0.396396
							if( ema12 > 0.384768 )
								if( tema <= 159.525 )
									ret := -0.896861 // sell
								if( tema > 159.525 )
									ret := -0.473684
				if( rsi1 > 49.9926 )
					if( ema12 <= 0.236069 )
						if( ema3 <= 89.566 )
							if( ema12 <= 0.013889 )
								if( smoothD_d <= 16.5398 )
									ret := -0.012658
								if( smoothD_d > 16.5398 )
									ret := 0.267559
							if( ema12 > 0.013889 )
								if( rsi1 <= 58.5419 )
									ret := -0.013944
								if( rsi1 > 58.5419 )
									ret := 0.203140
						if( ema3 > 89.566 )
							if( d <= 21.2133 )
								if( ema13 <= 0.49615 )
									ret := -0.063091
								if( ema13 > 0.49615 )
									ret := 0.583333
							if( d > 21.2133 )
								if( rsi1 <= 51.7297 )
									ret := 0.135220
								if( rsi1 > 51.7297 )
									ret := 0.385399
					if( ema12 > 0.236069 )
						if( ema12 <= 0.683789 )
							if( rsi1 <= 59.1457 )
								if( ema3 <= 71.2373 )
									ret := -0.632653
								if( ema3 > 71.2373 )
									ret := -0.195611
							if( rsi1 > 59.1457 )
								if( ema2 <= 95.965 )
									ret := 0.054451
								if( ema2 > 95.965 )
									ret := 0.288967
						if( ema12 > 0.683789 )
							if( rsi1 <= 58.7005 )
								if( d <= 62.1437 )
									ret := -0.748466 // sell
								if( d > 62.1437 )
									ret := 0.000000
							if( rsi1 > 58.7005 )
								if( smoothD_d <= 25.3827 )
									ret := 0.220000
								if( smoothD_d > 25.3827 )
									ret := -0.257600
	if( smoothK_k > 47.1045 )
		if( rsi1 <= 62.5022 )
			if( ema12 <= -0.074281 )
				if( rsi1 <= 47.9141 )
					if( ema12 <= -0.340262 )
						if( rsi1 <= 36.3116 )
							if( ema12 <= -1.08366 )
								if( smoothD_d <= 63.5501 )
									ret := 0.064935
								if( smoothD_d > 63.5501 )
									ret := 0.572650
							if( ema12 > -1.08366 )
								if( tema <= 88.7555 )
									ret := 0.033467
								if( tema > 88.7555 )
									ret := -0.340502
						if( rsi1 > 36.3116 )
							if( ema12 <= -0.715296 )
								if( ema1 <= 142.931 )
									ret := 0.651554
								if( ema1 > 142.931 )
									ret := 0.039216
							if( ema12 > -0.715296 )
								if( tema <= 101.006 )
									ret := 0.397414
								if( tema > 101.006 )
									ret := 0.131810
					if( ema12 > -0.340262 )
						if( tema <= 95.0008 )
							if( rsi1 <= 44.2294 )
								if( d_k <= -23.8479 )
									ret := -0.333333
								if( d_k > -23.8479 )
									ret := -0.032808
							if( rsi1 > 44.2294 )
								if( ema12 <= -0.245147 )
									ret := 0.452055
								if( ema12 > -0.245147 )
									ret := 0.093478
						if( tema > 95.0008 )
							if( rsi1 <= 46.8681 )
								if( rsi1 <= 36.2452 )
									ret := -0.628571
								if( rsi1 > 36.2452 )
									ret := -0.285176
							if( rsi1 > 46.8681 )
								if( tema <= 102.2 )
									ret := 0.303030
								if( tema > 102.2 )
									ret := -0.051948
				if( rsi1 > 47.9141 )
					if( rsi1 <= 53.8515 )
						if( ema12 <= -0.3787 )
							if( d <= 82.8496 )
								if( d_k <= -17.395 )
									ret := 0.658065
								if( d_k > -17.395 )
									ret := 0.856655 // buy
							if( d > 82.8496 )
								if( smoothK_k <= 92.2711 )
									ret := 0.333333
								if( smoothK_k > 92.2711 )
									ret := 0.742972 // buy
						if( ema12 > -0.3787 )
							if( ema13 <= -0.58532 )
								if( ema12 <= -0.235851 )
									ret := 0.265928
								if( ema12 > -0.235851 )
									ret := -0.366972
							if( ema13 > -0.58532 )
								if( ema12 <= -0.207475 )
									ret := 0.593939
								if( ema12 > -0.207475 )
									ret := 0.257939
					if( rsi1 > 53.8515 )
						if( ema1 <= 92.601 )
							if( ema3 <= 92.3006 )
								if( d_k <= -22.6168 )
									ret := 0.333333
								if( d_k > -22.6168 )
									ret := 0.639827
							if( ema3 > 92.3006 )
								if( ema1 <= 91.6418 )
									ret := -0.818182 // sell
								if( ema1 > 91.6418 )
									ret := 0.482759
						if( ema1 > 92.601 )
							if( smoothK_k <= 96.8854 )
								if( rsi1 <= 57.1148 )
									ret := 0.689133
								if( rsi1 > 57.1148 )
									ret := 0.819858 // buy
							if( smoothK_k > 96.8854 )
								if( ema3 <= 118.924 )
									ret := 0.656566
								if( ema3 > 118.924 )
									ret := 0.243243
			if( ema12 > -0.074281 )
				if( rsi1 <= 54.1522 )
					if( ema3 <= 90.754 )
						if( ema12 <= 0.178427 )
							if( rsi1 <= 37.4318 )
								if( ema3 <= 83.3266 )
									ret := -0.276923
								if( ema3 > 83.3266 )
									ret := -0.789474 // sell
							if( rsi1 > 37.4318 )
								if( ema12 <= 0.000602 )
									ret := 0.036085
								if( ema12 > 0.000602 )
									ret := -0.054475
						if( ema12 > 0.178427 )
							if( smoothD_d <= 80.2767 )
								if( ema2 <= 89.6829 )
									ret := -0.481481
								if( ema2 > 89.6829 )
									ret := 0.571429
							if( smoothD_d > 80.2767 )
								if( tema <= 84.5187 )
									ret := 0.355556
								if( tema > 84.5187 )
									ret := -0.480000
					if( ema3 > 90.754 )
						if( ema12 <= 0.22532 )
							if( rsi1 <= 42.8527 )
								if( smoothK_k <= 63.4718 )
									ret := -0.786885 // sell
								if( smoothK_k > 63.4718 )
									ret := -0.341463
							if( rsi1 > 42.8527 )
								if( d_k <= 6.95259 )
									ret := -0.264929
								if( d_k > 6.95259 )
									ret := 0.020930
						if( ema12 > 0.22532 )
							if( d_k <= 16.6782 )
								if( d <= 78.2014 )
									ret := -0.755556 // sell
								if( d > 78.2014 )
									ret := -0.400000
							if( d_k > 16.6782 )
								if( tema <= 102.689 )
									ret := 0.333333
								if( tema > 102.689 )
									ret := -0.400000
				if( rsi1 > 54.1522 )
					if( ema12 <= 0.177676 )
						if( ema12 <= 0.005943 )
							if( tema <= 93.5288 )
								if( d_k <= 5.04087 )
									ret := 0.217190
								if( d_k > 5.04087 )
									ret := 0.505155
							if( tema > 93.5288 )
								if( ema13 <= -0.244343 )
									ret := -0.059701
								if( ema13 > -0.244343 )
									ret := 0.594272
						if( ema12 > 0.005943 )
							if( ema2 <= 93.6465 )
								if( d_k <= 0.506241 )
									ret := 0.025030
								if( d_k > 0.506241 )
									ret := 0.155733
							if( ema2 > 93.6465 )
								if( d_k <= 4.69807 )
									ret := 0.165049
								if( d_k > 4.69807 )
									ret := 0.452012
					if( ema12 > 0.177676 )
						if( rsi1 <= 59.3895 )
							if( d_k <= 13.8062 )
								if( ema3 <= 75.7627 )
									ret := 0.066667
								if( ema3 > 75.7627 )
									ret := -0.341114
							if( d_k > 13.8062 )
								if( rsi1 <= 55.1885 )
									ret := -0.160000
								if( rsi1 > 55.1885 )
									ret := 0.351562
						if( rsi1 > 59.3895 )
							if( d_k <= 4.30933 )
								if( d_k <= -1.07285 )
									ret := 0.000000
								if( d_k > -1.07285 )
									ret := -0.224939
							if( d_k > 4.30933 )
								if( ema12 <= 0.703837 )
									ret := 0.161179
								if( ema12 > 0.703837 )
									ret := -0.397436
		if( rsi1 > 62.5022 )
			if( ema12 <= 0.045526 )
				if( tema <= 75.1115 )
					if( rsi1 <= 69.5674 )
						if( ema1 <= 66.7342 )
							if( ema12 <= -0.072364 )
								if( d_k <= 1.8977 )
									ret := 0.738095 // buy
								if( d_k > 1.8977 )
									ret := 0.000000
							if( ema12 > -0.072364 )
								if( d_k <= 0.067919 )
									ret := 0.169960
								if( d_k > 0.067919 )
									ret := 0.454545
						if( ema1 > 66.7342 )
							if( ema13 <= -0.421035 )
								if( ema3 <= 69.9876 )
									ret := 0.583333
								if( ema3 > 69.9876 )
									ret := -0.416667
							if( ema13 > -0.421035 )
								if( tema <= 74.5063 )
									ret := 0.666667
								if( tema > 74.5063 )
									ret := 0.055556
					if( rsi1 > 69.5674 )
						if( ema12 <= -0.005158 )
							if( ema13 <= -0.179307 )
								if( k <= 96.2116 )
									ret := 0.423077
								if( k > 96.2116 )
									ret := 0.750000 // buy
							if( ema13 > -0.179307 )
								if( d_k <= -27.1839 )
									ret := 0.400000
								if( d_k > -27.1839 )
									ret := 0.862857 // buy
						if( ema12 > -0.005158 )
							if( rsi1 <= 75.381 )
								if( ema3 <= 53.437 )
									ret := 0.764706 // buy
								if( ema3 > 53.437 )
									ret := 0.437956
							if( rsi1 > 75.381 )
								if( smoothK_k <= 95.3639 )
									ret := 0.656250
								if( smoothK_k > 95.3639 )
									ret := 0.849315 // buy
				if( tema > 75.1115 )
					if( ema12 <= -0.068001 )
						if( k <= 84.8166 )
							if( ema13 <= -0.202 )
								if( tema <= 102.305 )
									ret := 0.310345
								if( tema > 102.305 )
									ret := 0.787879 // buy
							if( ema13 > -0.202 )
								if( ema12 <= -0.096941 )
									ret := 0.975610 // buy
								if( ema12 > -0.096941 )
									ret := 0.757576 // buy
						if( k > 84.8166 )
							if( ema12 <= -0.192691 )
								if( rsi1 <= 82.6392 )
									ret := 0.919037 // buy
								if( rsi1 > 82.6392 )
									ret := 0.200000
							if( ema12 > -0.192691 )
								if( ema13 <= -0.404463 )
									ret := 0.696133
								if( ema13 > -0.404463 )
									ret := 0.896970 // buy
					if( ema12 > -0.068001 )
						if( smoothD_d <= 87.2807 )
							if( d_k <= -6.90552 )
								if( ema13 <= -0.075152 )
									ret := 0.505376
								if( ema13 > -0.075152 )
									ret := 0.744828 // buy
							if( d_k > -6.90552 )
								if( rsi1 <= 67.5529 )
									ret := 0.226190
								if( rsi1 > 67.5529 )
									ret := 0.711111 // buy
						if( smoothD_d > 87.2807 )
							if( ema13 <= -0.27089 )
								if( ema12 <= -0.002121 )
									ret := 0.694118
								if( ema12 > -0.002121 )
									ret := 0.392857
							if( ema13 > -0.27089 )
								if( tema <= 83.1106 )
									ret := 0.669643
								if( tema > 83.1106 )
									ret := 0.817844 // buy
			if( ema12 > 0.045526 )
				if( rsi1 <= 75.0198 )
					if( ema12 <= 0.373401 )
						if( ema1 <= 100.62 )
							if( ema12 <= 0.185752 )
								if( k <= 99.9782 )
									ret := 0.348837
								if( k > 99.9782 )
									ret := 0.061905
							if( ema12 > 0.185752 )
								if( tema <= 59.7206 )
									ret := -0.079365
								if( tema > 59.7206 )
									ret := 0.191229
						if( ema1 > 100.62 )
							if( rsi1 <= 65.4121 )
								if( d <= 92.1825 )
									ret := 0.262963
								if( d > 92.1825 )
									ret := 0.638095
							if( rsi1 > 65.4121 )
								if( ema2 <= 106.151 )
									ret := 0.508306
								if( ema2 > 106.151 )
									ret := 0.701400 // buy
					if( ema12 > 0.373401 )
						if( ema2 <= 98.2325 )
							if( tema <= 87.5346 )
								if( d_k <= 9.0678 )
									ret := 0.032258
								if( d_k > 9.0678 )
									ret := 0.409910
							if( tema > 87.5346 )
								if( rsi1 <= 69.5561 )
									ret := -0.297203
								if( rsi1 > 69.5561 )
									ret := -0.004124
						if( ema2 > 98.2325 )
							if( rsi1 <= 68.2662 )
								if( d_k <= 3.91434 )
									ret := -0.031175
								if( d_k > 3.91434 )
									ret := 0.265060
							if( rsi1 > 68.2662 )
								if( ema12 <= 0.801345 )
									ret := 0.515094
								if( ema12 > 0.801345 )
									ret := 0.190860
				if( rsi1 > 75.0198 )
					if( ema12 <= 0.333182 )
						if( smoothD_d <= 91.1266 )
							if( ema1 <= 94.0796 )
								if( tema <= 55.9786 )
									ret := 0.223881
								if( tema > 55.9786 )
									ret := 0.560720
							if( ema1 > 94.0796 )
								if( d_k <= -19.6209 )
									ret := 0.400000
								if( d_k > -19.6209 )
									ret := 0.795122 // buy
						if( smoothD_d > 91.1266 )
							if( ema3 <= 85.4659 )
								if( rsi1 <= 77.0049 )
									ret := 0.531034
								if( rsi1 > 77.0049 )
									ret := 0.740299 // buy
							if( ema3 > 85.4659 )
								if( smoothD_d <= 95.5327 )
									ret := 0.747508 // buy
								if( smoothD_d > 95.5327 )
									ret := 0.911043 // buy
					if( ema12 > 0.333182 )
						if( ema1 <= 92.3344 )
							if( ema3 <= 62.6622 )
								if( ema1 <= 58.0323 )
									ret := 0.374101
								if( ema1 > 58.0323 )
									ret := -0.159091
							if( ema3 > 62.6622 )
								if( rsi1 <= 85.1218 )
									ret := 0.238456
								if( rsi1 > 85.1218 )
									ret := 0.496920
						if( ema1 > 92.3344 )
							if( rsi1 <= 80.3925 )
								if( ema12 <= 1.8082 )
									ret := 0.503329
								if( ema12 > 1.8082 )
									ret := -0.338983
							if( rsi1 > 80.3925 )
								if( ema13 <= 5.199 )
									ret := 0.780282 // buy
								if( ema13 > 5.199 )
									ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_AAVEUSDT_15Min_d312f13a(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)

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


