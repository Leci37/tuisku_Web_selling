//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: MSFT_30Min_2CS0_11febaff Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_30Min_2CS0_11febaff", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_30Min_11febaff(mf, ad_mf, ad, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ad_mf <= -1750.81 )
		if( ad <= -281198 )
			if( ad_mf <= -321955 )
				if( d_k <= 10.7374 )
					if( smoothD_d <= 18.6391 )
						if( ad_mf <= -3.3878e+06 )
							if( mf <= -0.231704 )
								if( d_k <= -0.027698 )
									ret := 0.100000
								if( d_k > -0.027698 )
									ret := 0.579832
							if( mf > -0.231704 )
								if( ad_mf <= -6.87438e+06 )
									ret := 0.800000 // buy
								if( ad_mf > -6.87438e+06 )
									ret := -0.031915
						if( ad_mf > -3.3878e+06 )
							if( mf <= 0.080787 )
								if( ad <= -1.45461e+06 )
									ret := -0.115789
								if( ad > -1.45461e+06 )
									ret := 0.007903
							if( mf > 0.080787 )
								if( mf <= 0.311856 )
									ret := 0.240586
								if( mf > 0.311856 )
									ret := -0.051724
					if( smoothD_d > 18.6391 )
						if( mf <= 0.473282 )
							if( ad <= -1.44229e+06 )
								if( ad_mf <= -1.58144e+06 )
									ret := 0.099402
								if( ad_mf > -1.58144e+06 )
									ret := -0.187500
							if( ad > -1.44229e+06 )
								if( d_k <= 1.45118 )
									ret := 0.093030
								if( d_k > 1.45118 )
									ret := 0.178528
						if( mf > 0.473282 )
							if( ad_mf <= -921768 )
								if( ad <= -1.7792e+06 )
									ret := -0.461538
								if( ad > -1.7792e+06 )
									ret := 0.439024
							if( ad_mf > -921768 )
								if( ad_mf <= -377957 )
									ret := -0.449438
								if( ad_mf > -377957 )
									ret := 0.500000
				if( d_k > 10.7374 )
					if( mf <= -0.500675 )
						if( ad <= -992357 )
							if( ad_mf <= -2.42375e+06 )
								if( k <= 16.4182 )
									ret := 0.769231 // buy
								if( k > 16.4182 )
									ret := -0.177778
							if( ad_mf > -2.42375e+06 )
								if( smoothD_d <= 56.0315 )
									ret := -0.672727
								if( smoothD_d > 56.0315 )
									ret := -0.234043
						if( ad > -992357 )
							if( rsi1 <= 34.235 )
								if( mf <= -0.57753 )
									ret := -0.571429
								if( mf > -0.57753 )
									ret := 0.000000
							if( rsi1 > 34.235 )
								if( smoothK_k <= 15.409 )
									ret := 0.000000
								if( smoothK_k > 15.409 )
									ret := 0.760000 // buy
					if( mf > -0.500675 )
						if( ad_mf <= -9.90774e+06 )
							if( ad <= -1.25385e+07 )
								ret := -0.400000
							if( ad > -1.25385e+07 )
								ret := -1.000000 // sell
						if( ad_mf > -9.90774e+06 )
							if( ad <= -3.26236e+06 )
								if( rsi1 <= 39.1677 )
									ret := 0.436364
								if( rsi1 > 39.1677 )
									ret := 0.078740
							if( ad > -3.26236e+06 )
								if( ad_mf <= -2.70907e+06 )
									ret := -0.448819
								if( ad_mf > -2.70907e+06 )
									ret := 0.021145
			if( ad_mf > -321955 )
				if( d_k <= -4.31499 )
					if( k <= 27.8409 )
						if( smoothD_d <= 11.5404 )
							if( mf <= 0.003323 )
								ret := -0.500000
							if( mf > 0.003323 )
								ret := -0.833333 // sell
						if( smoothD_d > 11.5404 )
							ret := 0.000000
					if( k > 27.8409 )
						if( ad <= -320663 )
							ret := -0.750000 // sell
						if( ad > -320663 )
							if( mf <= 0.149376 )
								if( d <= 36.4656 )
									ret := 0.142857
								if( d > 36.4656 )
									ret := 0.636364
							if( mf > 0.149376 )
								if( smoothD_d <= 39.0391 )
									ret := -0.250000
								if( smoothD_d > 39.0391 )
									ret := 0.000000
				if( d_k > -4.31499 )
					if( ad <= -300946 )
						if( d_k <= 9.11529 )
							if( rsi1 <= 70.1174 )
								if( ad <= -302644 )
									ret := -0.445255
								if( ad > -302644 )
									ret := -0.758621 // sell
							if( rsi1 > 70.1174 )
								if( d <= 50.5772 )
									ret := -1.000000 // sell
								if( d > 50.5772 )
									ret := 0.100000
						if( d_k > 9.11529 )
							if( smoothD_d <= 72.49 )
								if( ad <= -318965 )
									ret := 0.800000 // buy
								if( ad > -318965 )
									ret := 0.035714
							if( smoothD_d > 72.49 )
								if( d_k <= 14.6358 )
									ret := -0.500000
								if( d_k > 14.6358 )
									ret := -1.000000 // sell
					if( ad > -300946 )
						if( mf <= -0.280338 )
							if( ad <= -288083 )
								if( smoothK_k <= 15.395 )
									ret := 0.000000
								if( smoothK_k > 15.395 )
									ret := 0.750000 // buy
							if( ad > -288083 )
								ret := 1.000000 // buy
						if( mf > -0.280338 )
							if( rsi1 <= 54.0527 )
								if( rsi1 <= 29.6729 )
									ret := 0.529412
								if( rsi1 > 29.6729 )
									ret := 0.000000
							if( rsi1 > 54.0527 )
								if( ad <= -290384 )
									ret := -0.057143
								if( ad > -290384 )
									ret := -0.608696
		if( ad > -281198 )
			if( rsi1 <= 38.021 )
				if( d_k <= 1.22104 )
					if( ad <= -11040.9 )
						if( ad <= -204829 )
							if( ad <= -270996 )
								if( d <= 15.8902 )
									ret := 0.142857
								if( d > 15.8902 )
									ret := -0.666667
							if( ad > -270996 )
								if( ad <= -265970 )
									ret := 0.793103 // buy
								if( ad > -265970 )
									ret := 0.259259
						if( ad > -204829 )
							if( ad <= -18290.3 )
								if( ad_mf <= -28358.2 )
									ret := 0.025958
								if( ad_mf > -28358.2 )
									ret := 0.247748
							if( ad > -18290.3 )
								if( d <= 83.0293 )
									ret := -0.108014
								if( d > 83.0293 )
									ret := 0.750000 // buy
					if( ad > -11040.9 )
						if( d <= 23.1845 )
							if( d_k <= -6.09101 )
								if( ad_mf <= -6244.52 )
									ret := 0.844444 // buy
								if( ad_mf > -6244.52 )
									ret := 0.437500
							if( d_k > -6.09101 )
								if( mf <= 0.323243 )
									ret := 0.297989
								if( mf > 0.323243 )
									ret := -0.043478
						if( d > 23.1845 )
							if( mf <= -0.282836 )
								if( ad_mf <= -2095.92 )
									ret := 0.433824
								if( ad_mf > -2095.92 )
									ret := -0.800000 // sell
							if( mf > -0.282836 )
								if( smoothD_d <= 43.7136 )
									ret := 0.052632
								if( smoothD_d > 43.7136 )
									ret := -0.234234
				if( d_k > 1.22104 )
					if( ad <= -32571.4 )
						if( ad <= -36339.4 )
							if( smoothD_d <= 12.7249 )
								if( ad_mf <= -240645 )
									ret := 0.529412
								if( ad_mf > -240645 )
									ret := -0.077626
							if( smoothD_d > 12.7249 )
								if( ad_mf <= -40701.7 )
									ret := 0.261214
								if( ad_mf > -40701.7 )
									ret := 0.756757 // buy
						if( ad > -36339.4 )
							if( rsi1 <= 32.1025 )
								if( d <= 14.4936 )
									ret := -0.461538
								if( d > 14.4936 )
									ret := -0.875000 // sell
							if( rsi1 > 32.1025 )
								if( mf <= 0.207038 )
									ret := -0.300000
								if( mf > 0.207038 )
									ret := 1.000000 // buy
					if( ad > -32571.4 )
						if( rsi1 <= 27.0445 )
							if( smoothK_k <= 7.09914 )
								if( k <= 8.2559 )
									ret := 0.435088
								if( k > 8.2559 )
									ret := -0.034483
							if( smoothK_k > 7.09914 )
								if( d <= 78.6502 )
									ret := 0.613027
								if( d > 78.6502 )
									ret := 0.062500
						if( rsi1 > 27.0445 )
							if( mf <= -0.090364 )
								if( mf <= -0.590799 )
									ret := -0.714286 // sell
								if( mf > -0.590799 )
									ret := 0.450000
							if( mf > -0.090364 )
								if( ad_mf <= -6391.01 )
									ret := 0.309255
								if( ad_mf > -6391.01 )
									ret := 0.038869
			if( rsi1 > 38.021 )
				if( ad <= -172047 )
					if( mf <= -0.241415 )
						if( d <= 50.4075 )
							if( d_k <= -0.029093 )
								if( mf <= -0.312225 )
									ret := 0.000000
								if( mf > -0.312225 )
									ret := -0.625000
							if( d_k > -0.029093 )
								if( rsi1 <= 47.8612 )
									ret := 0.818182 // buy
								if( rsi1 > 47.8612 )
									ret := 0.000000
						if( d > 50.4075 )
							if( d <= 92.3893 )
								if( smoothK_k <= 44.3022 )
									ret := -0.875000 // sell
								if( smoothK_k > 44.3022 )
									ret := -0.396226
							if( d > 92.3893 )
								if( k <= 94.9356 )
									ret := 0.750000 // buy
								if( k > 94.9356 )
									ret := -0.142857
					if( mf > -0.241415 )
						if( d_k <= -19.8348 )
							if( smoothK_k <= 86.1108 )
								if( ad_mf <= -237717 )
									ret := 0.000000
								if( ad_mf > -237717 )
									ret := 0.636364
							if( smoothK_k > 86.1108 )
								ret := 1.000000 // buy
						if( d_k > -19.8348 )
							if( ad_mf <= -278602 )
								if( smoothK_k <= 9.00695 )
									ret := 0.000000
								if( smoothK_k > 9.00695 )
									ret := 0.791667 // buy
							if( ad_mf > -278602 )
								if( ad_mf <= -275962 )
									ret := -0.409091
								if( ad_mf > -275962 )
									ret := 0.200391
				if( ad > -172047 )
					if( d_k <= -8.92267 )
						if( mf <= -0.594798 )
							if( k <= 81.5408 )
								if( mf <= -0.64383 )
									ret := 0.250000
								if( mf > -0.64383 )
									ret := -0.666667
							if( k > 81.5408 )
								if( mf <= -0.620851 )
									ret := -1.000000 // sell
								if( mf > -0.620851 )
									ret := -0.833333 // sell
						if( mf > -0.594798 )
							if( ad_mf <= -49929.3 )
								if( ad_mf <= -55407.6 )
									ret := -0.132479
								if( ad_mf > -55407.6 )
									ret := -0.705882 // sell
							if( ad_mf > -49929.3 )
								if( ad_mf <= -39340.5 )
									ret := 0.489362
								if( ad_mf > -39340.5 )
									ret := 0.025761
					if( d_k > -8.92267 )
						if( ad <= -164443 )
							if( smoothK_k <= 76.7027 )
								if( smoothK_k <= 34.7006 )
									ret := 0.090909
								if( smoothK_k > 34.7006 )
									ret := -0.627907
							if( smoothK_k > 76.7027 )
								if( mf <= -0.152614 )
									ret := 1.000000 // buy
								if( mf > -0.152614 )
									ret := 0.125000
						if( ad > -164443 )
							if( ad_mf <= -84299.7 )
								if( d <= 15.3599 )
									ret := -0.141304
								if( d > 15.3599 )
									ret := 0.201954
							if( ad_mf > -84299.7 )
								if( ad_mf <= -80352.7 )
									ret := -0.205128
								if( ad_mf > -80352.7 )
									ret := 0.075826
	if( ad_mf > -1750.81 )
		if( ad_mf <= 36538.8 )
			if( ad_mf <= 1900.7 )
				if( rsi1 <= 47.6999 )
					if( smoothD_d <= 30.7268 )
						if( smoothD_d <= 12.4335 )
							if( ad <= -338.303 )
								if( rsi1 <= 24.493 )
									ret := 0.285714
								if( rsi1 > 24.493 )
									ret := -0.100000
							if( ad > -338.303 )
								if( d <= 5.98332 )
									ret := 0.053191
								if( d > 5.98332 )
									ret := 0.246980
						if( smoothD_d > 12.4335 )
							if( d_k <= -14.5882 )
								if( ad_mf <= 1605.93 )
									ret := 0.307692
								if( ad_mf > 1605.93 )
									ret := -0.500000
							if( d_k > -14.5882 )
								if( rsi1 <= 18.9036 )
									ret := 0.500000
								if( rsi1 > 18.9036 )
									ret := -0.043274
					if( smoothD_d > 30.7268 )
						if( d <= 68.931 )
							if( ad_mf <= -1232.76 )
								if( ad_mf <= -1490.16 )
									ret := 0.291667
								if( ad_mf > -1490.16 )
									ret := -0.410256
							if( ad_mf > -1232.76 )
								if( ad <= -146.359 )
									ret := 0.415730
								if( ad > -146.359 )
									ret := 0.253316
						if( d > 68.931 )
							if( mf <= -0.247635 )
								if( mf <= -0.322709 )
									ret := 0.028571
								if( mf > -0.322709 )
									ret := -0.381818
							if( mf > -0.247635 )
								if( d_k <= 10.086 )
									ret := 0.112583
								if( d_k > 10.086 )
									ret := -0.102190
				if( rsi1 > 47.6999 )
					if( ad_mf <= -1615.1 )
						if( smoothK_k <= 3.33711 )
							if( k <= 2.71843 )
								ret := 0.250000
							if( k > 2.71843 )
								ret := 0.800000 // buy
						if( smoothK_k > 3.33711 )
							if( k <= 87.8418 )
								if( smoothD_d <= 70.8615 )
									ret := -0.231707
								if( smoothD_d > 70.8615 )
									ret := -0.673913
							if( k > 87.8418 )
								if( d_k <= 2.00854 )
									ret := -0.214286
								if( d_k > 2.00854 )
									ret := 0.363636
					if( ad_mf > -1615.1 )
						if( ad_mf <= -1610.89 )
							if( d <= 89.4564 )
								ret := 1.000000 // buy
							if( d > 89.4564 )
								ret := 0.750000 // buy
						if( ad_mf > -1610.89 )
							if( d <= 24.4755 )
								if( mf <= -0.064743 )
									ret := -0.240385
								if( mf > -0.064743 )
									ret := -0.051768
							if( d > 24.4755 )
								if( rsi1 <= 52.9289 )
									ret := 0.099331
								if( rsi1 > 52.9289 )
									ret := -0.025721
			if( ad_mf > 1900.7 )
				if( rsi1 <= 58.7375 )
					if( smoothD_d <= 45.5982 )
						if( ad <= 16246 )
							if( ad_mf <= 14414.2 )
								if( ad <= 13781.3 )
									ret := -0.033026
								if( ad > 13781.3 )
									ret := -0.714286 // sell
							if( ad_mf > 14414.2 )
								if( ad <= 14630.4 )
									ret := 0.757576 // buy
								if( ad > 14630.4 )
									ret := 0.142857
						if( ad > 16246 )
							if( ad_mf <= 18918.8 )
								if( ad <= 18285.7 )
									ret := -0.288889
								if( ad > 18285.7 )
									ret := -0.763636 // sell
							if( ad_mf > 18918.8 )
								if( ad <= 26391.8 )
									ret := 0.020000
								if( ad > 26391.8 )
									ret := -0.264789
					if( smoothD_d > 45.5982 )
						if( ad <= 2428.49 )
							if( ad <= 2389.91 )
								if( d <= 93.3631 )
									ret := -0.050251
								if( d > 93.3631 )
									ret := -0.727273 // sell
							if( ad > 2389.91 )
								if( d <= 84.3312 )
									ret := -0.933333 // sell
								if( d > 84.3312 )
									ret := -0.250000
						if( ad > 2428.49 )
							if( d_k <= -8.77816 )
								if( ad <= 27728.2 )
									ret := 0.002053
								if( ad > 27728.2 )
									ret := -0.636364
							if( d_k > -8.77816 )
								if( k <= 41.417 )
									ret := -0.120000
								if( k > 41.417 )
									ret := 0.168179
				if( rsi1 > 58.7375 )
					if( ad <= 9764.18 )
						if( ad_mf <= 9514.72 )
							if( d <= 27.3944 )
								if( ad_mf <= 8861.06 )
									ret := -0.004505
								if( ad_mf > 8861.06 )
									ret := 0.772727 // buy
							if( d > 27.3944 )
								if( rsi1 <= 69.2576 )
									ret := -0.202381
								if( rsi1 > 69.2576 )
									ret := -0.087176
						if( ad_mf > 9514.72 )
							if( smoothK_k <= 78.9612 )
								if( smoothD_d <= 68.798 )
									ret := -0.523810
								if( smoothD_d > 68.798 )
									ret := -0.111111
							if( smoothK_k > 78.9612 )
								if( smoothD_d <= 90.267 )
									ret := -0.962963 // sell
								if( smoothD_d > 90.267 )
									ret := -0.666667
					if( ad > 9764.18 )
						if( smoothD_d <= 86.2467 )
							if( ad_mf <= 10606.6 )
								if( k <= 43.8636 )
									ret := 0.565217
								if( k > 43.8636 )
									ret := 0.037736
							if( ad_mf > 10606.6 )
								if( ad <= 29032.2 )
									ret := -0.124456
								if( ad > 29032.2 )
									ret := 0.082902
						if( smoothD_d > 86.2467 )
							if( d_k <= -1.39681 )
								if( smoothD_d <= 87.0356 )
									ret := 0.500000
								if( smoothD_d > 87.0356 )
									ret := -0.173554
							if( d_k > -1.39681 )
								if( mf <= -0.573969 )
									ret := -0.642857
								if( mf > -0.573969 )
									ret := 0.227397
		if( ad_mf > 36538.8 )
			if( mf <= 0.601549 )
				if( ad_mf <= 37352 )
					if( ad <= 36734.7 )
						if( mf <= -0.371592 )
							ret := 0.500000
						if( mf > -0.371592 )
							ret := 1.000000 // buy
					if( ad > 36734.7 )
						if( k <= 63.0154 )
							if( d <= 41.8088 )
								if( d_k <= -0.253838 )
									ret := 0.250000
								if( d_k > -0.253838 )
									ret := 0.000000
							if( d > 41.8088 )
								ret := 0.400000
						if( k > 63.0154 )
							if( ad <= 36957.7 )
								ret := 0.333333
							if( ad > 36957.7 )
								if( mf <= 0.283141 )
									ret := 0.950000 // buy
								if( mf > 0.283141 )
									ret := 0.400000
				if( ad_mf > 37352 )
					if( ad_mf <= 4.19402e+06 )
						if( d_k <= 0.301537 )
							if( d_k <= -2.98746 )
								if( smoothK_k <= 88.3605 )
									ret := 0.073728
								if( smoothK_k > 88.3605 )
									ret := -0.064279
							if( d_k > -2.98746 )
								if( rsi1 <= 37.9008 )
									ret := 0.184183
								if( rsi1 > 37.9008 )
									ret := 0.084776
						if( d_k > 0.301537 )
							if( ad <= 38043.6 )
								if( ad_mf <= 37675.4 )
									ret := -0.285714
								if( ad_mf > 37675.4 )
									ret := -0.809524 // sell
							if( ad > 38043.6 )
								if( mf <= -0.506904 )
									ret := -0.341772
								if( mf > -0.506904 )
									ret := 0.027366
					if( ad_mf > 4.19402e+06 )
						if( k <= 9.50834 )
							if( mf <= 0.078273 )
								if( smoothD_d <= 0.123273 )
									ret := 0.090909
								if( smoothD_d > 0.123273 )
									ret := 0.736842 // buy
							if( mf > 0.078273 )
								if( smoothD_d <= 4.82116 )
									ret := 0.117647
								if( smoothD_d > 4.82116 )
									ret := -0.454545
						if( k > 9.50834 )
							if( d_k <= -16.2928 )
								if( rsi1 <= 64.2539 )
									ret := -0.037736
								if( rsi1 > 64.2539 )
									ret := 0.533333
							if( d_k > -16.2928 )
								if( k <= 75.7459 )
									ret := -0.285714
								if( k > 75.7459 )
									ret := -0.027624
			if( mf > 0.601549 )
				if( smoothK_k <= 6.73601 )
					if( d_k <= -0.329787 )
						if( rsi1 <= 51.7981 )
							ret := 1.000000 // buy
						if( rsi1 > 51.7981 )
							ret := 0.714286 // buy
					if( d_k > -0.329787 )
						if( rsi1 <= 60.8771 )
							ret := 0.000000
						if( rsi1 > 60.8771 )
							ret := -1.000000 // sell
				if( smoothK_k > 6.73601 )
					if( rsi1 <= 85.5947 )
						if( d_k <= -11.4285 )
							if( d_k <= -22.6887 )
								if( smoothD_d <= 54.311 )
									ret := 0.333333
								if( smoothD_d > 54.311 )
									ret := -0.750000 // sell
							if( d_k > -22.6887 )
								if( rsi1 <= 53.1219 )
									ret := 0.500000
								if( rsi1 > 53.1219 )
									ret := -0.506667
						if( d_k > -11.4285 )
							if( d <= 6.02099 )
								ret := -0.833333 // sell
							if( d > 6.02099 )
								if( d_k <= -3.23365 )
									ret := 0.016807
								if( d_k > -3.23365 )
									ret := -0.232394
					if( rsi1 > 85.5947 )
						if( rsi1 <= 94.8743 )
							if( d_k <= -4.17061 )
								if( rsi1 <= 87.0589 )
									ret := 0.200000
								if( rsi1 > 87.0589 )
									ret := 0.909091 // buy
							if( d_k > -4.17061 )
								if( d_k <= -0.082803 )
									ret := -0.100000
								if( d_k > -0.082803 )
									ret := 0.235294
						if( rsi1 > 94.8743 )
							ret := -0.857143 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_MSFT_30Min_11febaff(mf, ad_mf, ad, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


