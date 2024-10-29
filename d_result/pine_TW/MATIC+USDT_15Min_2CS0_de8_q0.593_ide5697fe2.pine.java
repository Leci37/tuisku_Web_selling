//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: MATICUSDT_15Min_2CS0_e5697fe2 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MATICUSDT_15Min_2CS0_e5697fe2", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MATICUSDT_15Min_e5697fe2(mf, ad_mf, ad, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( k <= 47.4213 )
		if( rsi1 <= 48.4102 )
			if( smoothK_k <= 15.7843 )
				if( rsi1 <= 34.6511 )
					if( mf <= -0.06804 )
						if( ad_mf <= -5.61469e+06 )
							if( d <= 22.7854 )
								if( d_k <= -0.159957 )
									ret := 0.750000 // buy
								if( d_k > -0.159957 )
									ret := 1.000000 // buy
							if( d > 22.7854 )
								ret := 0.000000
						if( ad_mf > -5.61469e+06 )
							if( rsi1 <= 23.262 )
								if( mf <= -0.146013 )
									ret := -0.285602
								if( mf > -0.146013 )
									ret := -0.478528
							if( rsi1 > 23.262 )
								if( mf <= -0.129371 )
									ret := -0.106505
								if( mf > -0.129371 )
									ret := -0.250631
					if( mf > -0.06804 )
						if( mf <= 0.078673 )
							if( ad_mf <= -862489 )
								if( ad <= -996761 )
									ret := -0.340164
								if( ad > -996761 )
									ret := 0.000000
							if( ad_mf > -862489 )
								if( smoothK_k <= -2.99596 )
									ret := -0.330623
								if( smoothK_k > -2.99596 )
									ret := -0.487487
						if( mf > 0.078673 )
							if( ad <= 232106 )
								if( d_k <= 0.747448 )
									ret := -0.610306
								if( d_k > 0.747448 )
									ret := -0.467095
							if( ad > 232106 )
								if( ad <= 1.53491e+06 )
									ret := -0.707379 // sell
								if( ad > 1.53491e+06 )
									ret := -0.488889
				if( rsi1 > 34.6511 )
					if( ad_mf <= 419160 )
						if( mf <= -0.018757 )
							if( ad <= -571416 )
								if( d_k <= 2.89373 )
									ret := -0.133779
								if( d_k > 2.89373 )
									ret := 0.166667
							if( ad > -571416 )
								if( mf <= -0.191364 )
									ret := 0.020921
								if( mf > -0.191364 )
									ret := -0.164485
						if( mf > -0.018757 )
							if( rsi1 <= 40.8952 )
								if( k <= 5.69037 )
									ret := -0.293103
								if( k > 5.69037 )
									ret := -0.428779
							if( rsi1 > 40.8952 )
								if( ad_mf <= -1.85577e+06 )
									ret := 0.287879
								if( ad_mf > -1.85577e+06 )
									ret := -0.234448
					if( ad_mf > 419160 )
						if( ad <= 5.513e+06 )
							if( mf <= -0.046011 )
								if( ad <= 626983 )
									ret := -0.308943
								if( ad > 626983 )
									ret := 0.067073
							if( mf > -0.046011 )
								if( mf <= 0.122266 )
									ret := -0.416309
								if( mf > 0.122266 )
									ret := -0.623256
						if( ad > 5.513e+06 )
							ret := 0.833333 // buy
			if( smoothK_k > 15.7843 )
				if( mf <= -0.075607 )
					if( ad_mf <= -1.53744e+06 )
						if( d_k <= -5.94978 )
							if( k <= 39.6842 )
								if( ad_mf <= -1.60766e+06 )
									ret := -0.202020
								if( ad_mf > -1.60766e+06 )
									ret := -1.000000 // sell
							if( k > 39.6842 )
								if( mf <= -0.186065 )
									ret := 0.708333 // buy
								if( mf > -0.186065 )
									ret := 0.235294
						if( d_k > -5.94978 )
							if( ad <= -1.56297e+06 )
								if( mf <= -0.142105 )
									ret := 0.425466
								if( mf > -0.142105 )
									ret := 0.130769
							if( ad > -1.56297e+06 )
								if( k <= 20.3327 )
									ret := 0.500000
								if( k > 20.3327 )
									ret := 1.000000 // buy
					if( ad_mf > -1.53744e+06 )
						if( rsi1 <= 36.4501 )
							if( ad <= -480961 )
								if( d_k <= -3.77055 )
									ret := -0.198606
								if( d_k > -3.77055 )
									ret := 0.071942
							if( ad > -480961 )
								if( ad <= 2.99898e+06 )
									ret := -0.189861
								if( ad > 2.99898e+06 )
									ret := 0.550000
						if( rsi1 > 36.4501 )
							if( ad <= -207398 )
								if( ad <= -218809 )
									ret := 0.108696
								if( ad > -218809 )
									ret := 0.703704 // buy
							if( ad > -207398 )
								if( d_k <= 4.3376 )
									ret := 0.024670
								if( d_k > 4.3376 )
									ret := -0.180108
				if( mf > -0.075607 )
					if( mf <= 0.008779 )
						if( rsi1 <= 34.3582 )
							if( smoothK_k <= 15.8722 )
								ret := 0.500000
							if( smoothK_k > 15.8722 )
								if( rsi1 <= 29.152 )
									ret := -0.504854
								if( rsi1 > 29.152 )
									ret := -0.346608
						if( rsi1 > 34.3582 )
							if( ad_mf <= -631486 )
								if( rsi1 <= 44.5703 )
									ret := -0.002841
								if( rsi1 > 44.5703 )
									ret := 0.304688
							if( ad_mf > -631486 )
								if( rsi1 <= 40.7386 )
									ret := -0.200201
								if( rsi1 > 40.7386 )
									ret := -0.066337
					if( mf > 0.008779 )
						if( rsi1 <= 41.7389 )
							if( d_k <= -10.5372 )
								if( ad <= 522847 )
									ret := -0.255605
								if( ad > 522847 )
									ret := 0.250000
							if( d_k > -10.5372 )
								if( ad <= 256070 )
									ret := -0.397870
								if( ad > 256070 )
									ret := -0.538913
						if( rsi1 > 41.7389 )
							if( ad <= 99847.2 )
								if( ad <= -2.09278e+06 )
									ret := 0.350000
								if( ad > -2.09278e+06 )
									ret := -0.160511
							if( ad > 99847.2 )
								if( d_k <= -2.41675 )
									ret := -0.179724
								if( d_k > -2.41675 )
									ret := -0.358824
		if( rsi1 > 48.4102 )
			if( ad <= 328734 )
				if( k <= 20.6299 )
					if( ad_mf <= -163086 )
						if( smoothK_k <= 10.9286 )
							if( rsi1 <= 55.6949 )
								if( ad_mf <= -582554 )
									ret := -0.244726
								if( ad_mf > -582554 )
									ret := 0.018750
							if( rsi1 > 55.6949 )
								if( ad_mf <= -527097 )
									ret := 0.176471
								if( ad_mf > -527097 )
									ret := -0.037559
						if( smoothK_k > 10.9286 )
							if( ad_mf <= -1.64021e+06 )
								if( d_k <= 1.47472 )
									ret := -0.785714 // sell
								if( d_k > 1.47472 )
									ret := 0.033333
							if( ad_mf > -1.64021e+06 )
								if( ad_mf <= -1.40225e+06 )
									ret := 0.789474 // buy
								if( ad_mf > -1.40225e+06 )
									ret := 0.129707
					if( ad_mf > -163086 )
						if( ad <= 295905 )
							if( ad <= 293228 )
								if( rsi1 <= 61.0004 )
									ret := -0.123663
								if( rsi1 > 61.0004 )
									ret := 0.154762
							if( ad > 293228 )
								if( mf <= 0.086825 )
									ret := 0.000000
								if( mf > 0.086825 )
									ret := -0.947368 // sell
						if( ad > 295905 )
							if( rsi1 <= 63.2826 )
								if( ad_mf <= 320559 )
									ret := 0.042553
								if( ad_mf > 320559 )
									ret := 0.400000
							if( rsi1 > 63.2826 )
								if( d_k <= 2.01404 )
									ret := 0.750000 // buy
								if( d_k > 2.01404 )
									ret := 1.000000 // buy
				if( k > 20.6299 )
					if( rsi1 <= 59.7564 )
						if( ad_mf <= -72119.7 )
							if( k <= 45.5497 )
								if( d_k <= 8.10543 )
									ret := 0.187656
								if( d_k > 8.10543 )
									ret := 0.046196
							if( k > 45.5497 )
								if( ad_mf <= -146600 )
									ret := 0.385621
								if( ad_mf > -146600 )
									ret := -0.083333
						if( ad_mf > -72119.7 )
							if( d_k <= 7.44956 )
								if( mf <= 0.251737 )
									ret := 0.055637
								if( mf > 0.251737 )
									ret := -0.173913
							if( d_k > 7.44956 )
								if( ad_mf <= 319972 )
									ret := -0.113846
								if( ad_mf > 319972 )
									ret := 0.692308
					if( rsi1 > 59.7564 )
						if( ad_mf <= -632132 )
							if( ad <= -1.15564e+06 )
								if( rsi1 <= 65.339 )
									ret := -0.098592
								if( rsi1 > 65.339 )
									ret := 0.367089
							if( ad > -1.15564e+06 )
								if( d_k <= 19.7838 )
									ret := 0.578313
								if( d_k > 19.7838 )
									ret := 0.076923
						if( ad_mf > -632132 )
							if( d_k <= 4.16136 )
								if( ad_mf <= 169059 )
									ret := 0.265957
								if( ad_mf > 169059 )
									ret := 0.435897
							if( d_k > 4.16136 )
								if( ad_mf <= 259370 )
									ret := 0.090615
								if( ad_mf > 259370 )
									ret := 0.476190
			if( ad > 328734 )
				if( smoothK_k <= 24.6394 )
					if( ad_mf <= 1.08742e+06 )
						if( k <= 4.79351 )
							if( k <= 0.017473 )
								if( ad_mf <= 907223 )
									ret := -0.354839
								if( ad_mf > 907223 )
									ret := 0.666667
							if( k > 0.017473 )
								if( ad_mf <= 681014 )
									ret := -0.345238
								if( ad_mf > 681014 )
									ret := -0.641509
						if( k > 4.79351 )
							if( ad_mf <= 358156 )
								if( smoothK_k <= 8.17264 )
									ret := 0.222222
								if( smoothK_k > 8.17264 )
									ret := -0.539326
							if( ad_mf > 358156 )
								if( mf <= 0.013074 )
									ret := -0.300613
								if( mf > 0.013074 )
									ret := -0.075123
					if( ad_mf > 1.08742e+06 )
						if( k <= 10.8542 )
							if( mf <= 0.178471 )
								if( rsi1 <= 50.401 )
									ret := -0.875000 // sell
								if( rsi1 > 50.401 )
									ret := -0.311111
							if( mf > 0.178471 )
								if( d_k <= -2.61516 )
									ret := -0.285714
								if( d_k > -2.61516 )
									ret := -0.765306 // sell
						if( k > 10.8542 )
							if( mf <= 0.047772 )
								if( ad <= 1.28278e+06 )
									ret := -0.705882 // sell
								if( ad > 1.28278e+06 )
									ret := 0.227273
							if( mf > 0.047772 )
								if( d_k <= 29.631 )
									ret := -0.381679
								if( d_k > 29.631 )
									ret := 0.800000 // buy
				if( smoothK_k > 24.6394 )
					if( ad_mf <= 1.74922e+06 )
						if( ad <= 1.64457e+06 )
							if( ad_mf <= 1.21468e+06 )
								if( ad <= 355429 )
									ret := -0.265306
								if( ad > 355429 )
									ret := 0.038783
							if( ad_mf > 1.21468e+06 )
								if( d_k <= -7.6278 )
									ret := 0.272727
								if( d_k > -7.6278 )
									ret := -0.396226
						if( ad > 1.64457e+06 )
							if( mf <= 0.04352 )
								if( mf <= -0.077919 )
									ret := -1.000000 // sell
								if( mf > -0.077919 )
									ret := 0.090909
							if( mf > 0.04352 )
								if( ad_mf <= 1.6843e+06 )
									ret := 1.000000 // buy
								if( ad_mf > 1.6843e+06 )
									ret := 0.454545
					if( ad_mf > 1.74922e+06 )
						if( d_k <= 2.4014 )
							if( rsi1 <= 73.4598 )
								if( ad_mf <= 2.61442e+06 )
									ret := 0.139535
								if( ad_mf > 2.61442e+06 )
									ret := -0.337209
							if( rsi1 > 73.4598 )
								if( d <= 32.6835 )
									ret := 1.000000 // buy
								if( d > 32.6835 )
									ret := 0.400000
						if( d_k > 2.4014 )
							if( d_k <= 25.8949 )
								if( ad_mf <= 3.78425e+06 )
									ret := -0.556522
								if( ad_mf > 3.78425e+06 )
									ret := 0.300000
							if( d_k > 25.8949 )
								ret := 0.666667
	if( k > 47.4213 )
		if( rsi1 <= 55.2691 )
			if( rsi1 <= 40.0143 )
				if( ad_mf <= -1.66048e+06 )
					if( ad_mf <= -5.30196e+06 )
						if( mf <= -0.096321 )
							ret := 1.000000 // buy
						if( mf > -0.096321 )
							ret := 0.600000
					if( ad_mf > -5.30196e+06 )
						if( d_k <= 15.4886 )
							if( ad_mf <= -3.92038e+06 )
								if( smoothK_k <= 62.4959 )
									ret := -0.466667
								if( smoothK_k > 62.4959 )
									ret := 0.375000
							if( ad_mf > -3.92038e+06 )
								if( smoothD_d <= 48.4282 )
									ret := 0.212766
								if( smoothD_d > 48.4282 )
									ret := 0.565789
						if( d_k > 15.4886 )
							if( ad <= -2.40177e+06 )
								ret := -1.000000 // sell
							if( ad > -2.40177e+06 )
								if( ad_mf <= -2.09045e+06 )
									ret := 0.909091 // buy
								if( ad_mf > -2.09045e+06 )
									ret := -0.375000
				if( ad_mf > -1.66048e+06 )
					if( rsi1 <= 32.3229 )
						if( ad_mf <= 2.6792e+06 )
							if( mf <= -0.173823 )
								if( mf <= -0.178175 )
									ret := -0.173684
								if( mf > -0.178175 )
									ret := 0.333333
							if( mf > -0.173823 )
								if( ad <= -786281 )
									ret := -0.701754 // sell
								if( ad > -786281 )
									ret := -0.325696
						if( ad_mf > 2.6792e+06 )
							if( k <= 49.785 )
								ret := -0.750000 // sell
							if( k > 49.785 )
								if( mf <= -0.055779 )
									ret := 0.714286 // buy
								if( mf > -0.055779 )
									ret := 0.111111
					if( rsi1 > 32.3229 )
						if( d_k <= 1.63019 )
							if( ad_mf <= 3.87657e+06 )
								if( ad_mf <= -514289 )
									ret := 0.130769
								if( ad_mf > -514289 )
									ret := -0.033277
							if( ad_mf > 3.87657e+06 )
								if( mf <= -0.028637 )
									ret := 1.000000 // buy
								if( mf > -0.028637 )
									ret := 0.166667
						if( d_k > 1.63019 )
							if( mf <= -0.083986 )
								if( ad <= 488816 )
									ret := -0.097087
								if( ad > 488816 )
									ret := 0.275862
							if( mf > -0.083986 )
								if( smoothD_d <= 77.9546 )
									ret := -0.312644
								if( smoothD_d > 77.9546 )
									ret := -0.055172
			if( rsi1 > 40.0143 )
				if( ad_mf <= -206594 )
					if( mf <= -0.129569 )
						if( ad_mf <= -828463 )
							if( mf <= -0.151349 )
								if( rsi1 <= 48.6902 )
									ret := 0.529915
								if( rsi1 > 48.6902 )
									ret := 0.720930 // buy
							if( mf > -0.151349 )
								if( rsi1 <= 52.8677 )
									ret := 0.230769
								if( rsi1 > 52.8677 )
									ret := 0.928571 // buy
						if( ad_mf > -828463 )
							if( ad <= -808900 )
								if( ad <= -820756 )
									ret := 0.000000
								if( ad > -820756 )
									ret := -0.857143 // sell
							if( ad > -808900 )
								if( rsi1 <= 44.2568 )
									ret := 0.160870
								if( rsi1 > 44.2568 )
									ret := 0.348872
					if( mf > -0.129569 )
						if( rsi1 <= 46.4247 )
							if( d <= 90.1928 )
								if( d_k <= 3.32311 )
									ret := 0.119490
								if( d_k > 3.32311 )
									ret := -0.092179
							if( d > 90.1928 )
								if( mf <= -0.029088 )
									ret := 0.566038
								if( mf > -0.029088 )
									ret := 0.034483
						if( rsi1 > 46.4247 )
							if( d_k <= -5.68097 )
								if( ad <= -4.60427e+06 )
									ret := -1.000000 // sell
								if( ad > -4.60427e+06 )
									ret := 0.381466
							if( d_k > -5.68097 )
								if( ad <= -3.56877e+06 )
									ret := -0.636364
								if( ad > -3.56877e+06 )
									ret := 0.221933
				if( ad_mf > -206594 )
					if( mf <= -0.012981 )
						if( d_k <= 7.07535 )
							if( rsi1 <= 48.1663 )
								if( ad <= 1.12293e+06 )
									ret := 0.087638
								if( ad > 1.12293e+06 )
									ret := 0.302521
							if( rsi1 > 48.1663 )
								if( d <= 36.4376 )
									ret := -0.118421
								if( d > 36.4376 )
									ret := 0.236245
						if( d_k > 7.07535 )
							if( smoothK_k <= 72.7596 )
								if( ad <= 2.32178e+06 )
									ret := -0.066553
								if( ad > 2.32178e+06 )
									ret := -0.888889 // sell
							if( smoothK_k > 72.7596 )
								if( rsi1 <= 41.7904 )
									ret := 0.800000 // buy
								if( rsi1 > 41.7904 )
									ret := 0.197080
					if( mf > -0.012981 )
						if( rsi1 <= 48.9289 )
							if( smoothK_k <= 66.2084 )
								if( ad <= 200029 )
									ret := -0.079268
								if( ad > 200029 )
									ret := -0.225577
							if( smoothK_k > 66.2084 )
								if( ad_mf <= 2.50937e+06 )
									ret := 0.010204
								if( ad_mf > 2.50937e+06 )
									ret := 0.583333
						if( rsi1 > 48.9289 )
							if( mf <= 0.08921 )
								if( ad <= 2.09974e+06 )
									ret := 0.111232
								if( ad > 2.09974e+06 )
									ret := 0.489362
							if( mf > 0.08921 )
								if( ad_mf <= 220325 )
									ret := 0.092619
								if( ad_mf > 220325 )
									ret := -0.075556
		if( rsi1 > 55.2691 )
			if( rsi1 <= 64.1518 )
				if( mf <= 0.176418 )
					if( mf <= -0.03615 )
						if( d_k <= 4.03222 )
							if( ad <= -288228 )
								if( mf <= -0.089554 )
									ret := 0.463366
								if( mf > -0.089554 )
									ret := 0.636591
							if( ad > -288228 )
								if( smoothK_k <= 96.1704 )
									ret := 0.363810
								if( smoothK_k > 96.1704 )
									ret := 0.163793
						if( d_k > 4.03222 )
							if( ad <= -1.63964e+06 )
								if( rsi1 <= 60.2817 )
									ret := -0.714286 // sell
								if( rsi1 > 60.2817 )
									ret := 0.142857
							if( ad > -1.63964e+06 )
								if( d <= 97.8575 )
									ret := 0.264151
								if( d > 97.8575 )
									ret := -1.000000 // sell
					if( mf > -0.03615 )
						if( d_k <= -0.507451 )
							if( ad_mf <= -111517 )
								if( d <= 98.7984 )
									ret := 0.421696
								if( d > 98.7984 )
									ret := -0.500000
							if( ad_mf > -111517 )
								if( d <= 36.953 )
									ret := -0.042105
								if( d > 36.953 )
									ret := 0.286260
						if( d_k > -0.507451 )
							if( ad_mf <= -2.577e+06 )
								if( k <= 68.4796 )
									ret := -0.157895
								if( k > 68.4796 )
									ret := -0.677419
							if( ad_mf > -2.577e+06 )
								if( k <= 69.2911 )
									ret := 0.150943
								if( k > 69.2911 )
									ret := 0.260925
				if( mf > 0.176418 )
					if( ad <= 1.70091e+06 )
						if( smoothD_d <= 87.5248 )
							if( smoothK_k <= 45.8983 )
								if( d_k <= 5.04296 )
									ret := 0.571429
								if( d_k > 5.04296 )
									ret := 0.076923
							if( smoothK_k > 45.8983 )
								if( ad_mf <= 437026 )
									ret := 0.063119
								if( ad_mf > 437026 )
									ret := -0.088889
						if( smoothD_d > 87.5248 )
							if( rsi1 <= 60.1333 )
								if( ad <= 604319 )
									ret := 0.050000
								if( ad > 604319 )
									ret := 0.500000
							if( rsi1 > 60.1333 )
								if( k <= 88.4246 )
									ret := 0.714286 // buy
								if( k > 88.4246 )
									ret := 0.350649
					if( ad > 1.70091e+06 )
						if( d_k <= -4.17218 )
							if( d <= 54.9433 )
								if( smoothD_d <= 38.5547 )
									ret := -0.250000
								if( smoothD_d > 38.5547 )
									ret := 0.909091 // buy
							if( d > 54.9433 )
								if( rsi1 <= 62.1268 )
									ret := -0.777778 // sell
								if( rsi1 > 62.1268 )
									ret := 0.500000
						if( d_k > -4.17218 )
							if( smoothD_d <= 62.94 )
								if( mf <= 0.197745 )
									ret := -0.428571
								if( mf > 0.197745 )
									ret := -1.000000 // sell
							if( smoothD_d > 62.94 )
								if( ad <= 3.10574e+06 )
									ret := -0.484848
								if( ad > 3.10574e+06 )
									ret := 0.181818
			if( rsi1 > 64.1518 )
				if( mf <= 0.04772 )
					if( ad_mf <= 2.5111e+06 )
						if( rsi1 <= 74.4249 )
							if( ad <= -300555 )
								if( ad <= -1.90804e+06 )
									ret := 0.210084
								if( ad > -1.90804e+06 )
									ret := 0.580798
							if( ad > -300555 )
								if( smoothK_k <= 79.9883 )
									ret := 0.377221
								if( smoothK_k > 79.9883 )
									ret := 0.460414
						if( rsi1 > 74.4249 )
							if( d <= 89.1093 )
								if( smoothK_k <= 72.3369 )
									ret := 0.263889
								if( smoothK_k > 72.3369 )
									ret := 0.500000
							if( d > 89.1093 )
								if( smoothK_k <= 96.9906 )
									ret := 0.654378
								if( smoothK_k > 96.9906 )
									ret := 0.495614
					if( ad_mf > 2.5111e+06 )
						if( ad_mf <= 3.25716e+06 )
							if( ad_mf <= 3.18844e+06 )
								if( ad <= 2.6736e+06 )
									ret := -0.888889 // sell
								if( ad > 2.6736e+06 )
									ret := 0.500000
							if( ad_mf > 3.18844e+06 )
								ret := -1.000000 // sell
						if( ad_mf > 3.25716e+06 )
							if( ad <= 4.81591e+06 )
								if( d_k <= -1.17439 )
									ret := 0.750000 // buy
								if( d_k > -1.17439 )
									ret := 1.000000 // buy
							if( ad > 4.81591e+06 )
								ret := -0.500000
				if( mf > 0.04772 )
					if( rsi1 <= 80.126 )
						if( mf <= 0.251948 )
							if( ad_mf <= 2.49877e+06 )
								if( d_k <= -0.404258 )
									ret := 0.416986
								if( d_k > -0.404258 )
									ret := 0.343734
							if( ad_mf > 2.49877e+06 )
								if( ad_mf <= 2.56466e+06 )
									ret := -0.833333 // sell
								if( ad_mf > 2.56466e+06 )
									ret := 0.115385
						if( mf > 0.251948 )
							if( d <= 88.0135 )
								if( ad_mf <= 1.56223e+06 )
									ret := 0.166120
								if( ad_mf > 1.56223e+06 )
									ret := -0.104972
							if( d > 88.0135 )
								if( d_k <= 2.29551 )
									ret := 0.207831
								if( d_k > 2.29551 )
									ret := 0.484979
					if( rsi1 > 80.126 )
						if( ad <= 4.64735e+06 )
							if( smoothK_k <= 96.9985 )
								if( rsi1 <= 84.0515 )
									ret := 0.498821
								if( rsi1 > 84.0515 )
									ret := 0.614388
							if( smoothK_k > 96.9985 )
								if( ad_mf <= 3.37397e+06 )
									ret := 0.345679
								if( ad_mf > 3.37397e+06 )
									ret := -0.750000 // sell
						if( ad > 4.64735e+06 )
							if( ad_mf <= 4.92941e+06 )
								ret := -1.000000 // sell
							if( ad_mf > 4.92941e+06 )
								if( ad_mf <= 6.43017e+06 )
									ret := 0.520000
								if( ad_mf > 6.43017e+06 )
									ret := -0.238095
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

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
float op_operation = decision_tree_0_MATICUSDT_15Min_e5697fe2(mf, ad_mf, ad, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


