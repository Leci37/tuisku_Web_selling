//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: TWLO_15Min_2SV0_b6b429a2 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TWLO_15Min_2SV0_b6b429a2", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TWLO_15Min_b6b429a2(rsi1, d, k, smoothD_d, d_k, smoothK_k, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( rsi1 <= 35.0903 )
		if( VIP <= 0.924774 )
			if( d_k <= 29.4394 )
				if( VIP <= 0.611002 )
					if( d <= 1.15613 )
						if( k <= 0.033971 )
							if( VIP_VIM <= -0.901658 )
								if( rsi1 <= 0.867892 )
									ret := -1.000000 // sell
								if( rsi1 > 0.867892 )
									ret := 0.327869
							if( VIP_VIM > -0.901658 )
								if( VIP <= 0.566173 )
									ret := -0.750000 // sell
								if( VIP > 0.566173 )
									ret := -0.312500
						if( k > 0.033971 )
							if( rsi1 <= 6.67954 )
								if( VIM <= 1.47904 )
									ret := -0.700000 // sell
								if( VIM > 1.47904 )
									ret := -0.200000
							if( rsi1 > 6.67954 )
								if( d_k <= -1.25025 )
									ret := -0.294118
								if( d_k > -1.25025 )
									ret := 0.582524
					if( d > 1.15613 )
						if( d_k <= 7.0794 )
							if( VIM <= 1.3136 )
								if( d_k <= -1.49846 )
									ret := -0.400000
								if( d_k > -1.49846 )
									ret := 0.625000
							if( VIM > 1.3136 )
								if( d <= 9.65502 )
									ret := -0.177033
								if( d > 9.65502 )
									ret := -0.527559
						if( d_k > 7.0794 )
							if( VIM <= 1.39464 )
								if( k <= 8.94765 )
									ret := 0.000000
								if( k > 8.94765 )
									ret := -0.682927
							if( VIM > 1.39464 )
								if( smoothD_d <= 12.008 )
									ret := 0.000000
								if( smoothD_d > 12.008 )
									ret := 0.750000 // buy
				if( VIP > 0.611002 )
					if( d_k <= 9.76075 )
						if( d_k <= -18.2303 )
							if( smoothK_k <= 53.7201 )
								if( rsi1 <= 22.1008 )
									ret := -0.142857
								if( rsi1 > 22.1008 )
									ret := 0.660550
							if( smoothK_k > 53.7201 )
								if( VIP_VIM <= -0.63629 )
									ret := 0.625000
								if( VIP_VIM > -0.63629 )
									ret := 0.005848
						if( d_k > -18.2303 )
							if( d <= 7.58632 )
								if( rsi1 <= 33.1344 )
									ret := 0.141190
								if( rsi1 > 33.1344 )
									ret := -0.075000
							if( d > 7.58632 )
								if( k <= 14.0852 )
									ret := -0.028700
								if( k > 14.0852 )
									ret := 0.069171
					if( d_k > 9.76075 )
						if( d <= 77.0063 )
							if( VIP_VIM <= -0.753817 )
								if( d_k <= 12.2537 )
									ret := 0.617021
								if( d_k > 12.2537 )
									ret := 0.279279
							if( VIP_VIM > -0.753817 )
								if( smoothK_k <= 19.3869 )
									ret := 0.092338
								if( smoothK_k > 19.3869 )
									ret := 0.247788
						if( d > 77.0063 )
							if( d_k <= 20.4136 )
								if( rsi1 <= 20.874 )
									ret := -0.500000
								if( rsi1 > 20.874 )
									ret := 0.678899
							if( d_k > 20.4136 )
								if( d <= 80.5122 )
									ret := 0.000000
								if( d > 80.5122 )
									ret := -0.666667
			if( d_k > 29.4394 )
				if( VIM <= 1.29936 )
					if( k <= 16.3827 )
						ret := 0.000000
					if( k > 16.3827 )
						if( VIP <= 0.914398 )
							if( smoothD_d <= 59.0489 )
								if( smoothD_d <= 57.9792 )
									ret := -0.434783
								if( smoothD_d > 57.9792 )
									ret := -1.000000 // sell
							if( smoothD_d > 59.0489 )
								ret := 0.000000
						if( VIP > 0.914398 )
							ret := -1.000000 // sell
				if( VIM > 1.29936 )
					if( d_k <= 30.4533 )
						if( k <= 15.536 )
							ret := -0.800000 // sell
						if( k > 15.536 )
							if( smoothK_k <= 25.1058 )
								ret := -0.500000
							if( smoothK_k > 25.1058 )
								ret := -0.250000
					if( d_k > 30.4533 )
						if( rsi1 <= 19.556 )
							ret := -0.750000 // sell
						if( rsi1 > 19.556 )
							ret := -1.000000 // sell
		if( VIP > 0.924774 )
			if( smoothD_d <= 0.371123 )
				if( k <= 0.716406 )
					if( smoothD_d <= -2.04849 )
						if( rsi1 <= 32.3141 )
							if( rsi1 <= 8.68876 )
								if( VIM <= 1.86971 )
									ret := -0.750000 // sell
								if( VIM > 1.86971 )
									ret := 0.000000
							if( rsi1 > 8.68876 )
								if( VIM <= 1.20071 )
									ret := -0.125000
								if( VIM > 1.20071 )
									ret := 0.739130 // buy
						if( rsi1 > 32.3141 )
							if( VIM <= 1.39826 )
								if( VIM <= 1.16124 )
									ret := -0.500000
								if( VIM > 1.16124 )
									ret := 0.166667
							if( VIM > 1.39826 )
								ret := -0.500000
					if( smoothD_d > -2.04849 )
						if( VIP <= 1.3688 )
							if( rsi1 <= 12.6302 )
								ret := 0.714286 // buy
							if( rsi1 > 12.6302 )
								if( rsi1 <= 32.1002 )
									ret := -0.469388
								if( rsi1 > 32.1002 )
									ret := 0.333333
						if( VIP > 1.3688 )
							if( d_k <= 1.15466 )
								ret := -0.750000 // sell
							if( d_k > 1.15466 )
								if( d <= 3.06853 )
									ret := 0.840000 // buy
								if( d > 3.06853 )
									ret := 0.000000
				if( k > 0.716406 )
					if( d_k <= 0.954736 )
						if( rsi1 <= 20.3872 )
							if( smoothD_d <= -0.942735 )
								if( d_k <= 0.242941 )
									ret := -0.728814 // sell
								if( d_k > 0.242941 )
									ret := 0.250000
							if( smoothD_d > -0.942735 )
								if( d_k <= -0.698315 )
									ret := -0.157895
								if( d_k > -0.698315 )
									ret := 0.833333 // buy
						if( rsi1 > 20.3872 )
							if( smoothD_d <= -1.40313 )
								if( rsi1 <= 32.8205 )
									ret := 0.444444
								if( rsi1 > 32.8205 )
									ret := -0.571429
							if( smoothD_d > -1.40313 )
								if( smoothK_k <= -0.737402 )
									ret := -0.678571
								if( smoothK_k > -0.737402 )
									ret := -0.140496
					if( d_k > 0.954736 )
						if( d_k <= 1.63716 )
							if( VIP_VIM <= -0.332991 )
								ret := 0.500000
							if( VIP_VIM > -0.332991 )
								ret := 1.000000 // buy
						if( d_k > 1.63716 )
							ret := 0.000000
			if( smoothD_d > 0.371123 )
				if( smoothK_k <= 17.77 )
					if( VIP_VIM <= -0.642245 )
						if( VIP <= 1.60602 )
							if( VIP <= 1.12789 )
								if( k <= 13.6845 )
									ret := 0.253968
								if( k > 13.6845 )
									ret := -0.318182
							if( VIP > 1.12789 )
								if( k <= 19.1606 )
									ret := -0.295918
								if( k > 19.1606 )
									ret := 0.714286 // buy
						if( VIP > 1.60602 )
							if( VIP_VIM <= -1.59839 )
								ret := -0.250000
							if( VIP_VIM > -1.59839 )
								if( smoothK_k <= 10.2785 )
									ret := 0.766667 // buy
								if( smoothK_k > 10.2785 )
									ret := 0.222222
					if( VIP_VIM > -0.642245 )
						if( VIM <= 1.33676 )
							if( smoothD_d <= 20.6413 )
								if( smoothD_d <= 18.4853 )
									ret := 0.126464
								if( smoothD_d > 18.4853 )
									ret := -0.533333
							if( smoothD_d > 20.6413 )
								if( smoothD_d <= 28.1434 )
									ret := 0.618421
								if( smoothD_d > 28.1434 )
									ret := 0.192982
						if( VIM > 1.33676 )
							if( rsi1 <= 17.2147 )
								if( smoothK_k <= 1.13261 )
									ret := 0.277778
								if( smoothK_k > 1.13261 )
									ret := 0.767677 // buy
							if( rsi1 > 17.2147 )
								if( VIP_VIM <= -0.223397 )
									ret := 0.279297
								if( VIP_VIM > -0.223397 )
									ret := 0.466837
				if( smoothK_k > 17.77 )
					if( smoothD_d <= 13.9213 )
						if( VIP_VIM <= -0.55852 )
							if( rsi1 <= 27.5418 )
								if( d <= 11.5339 )
									ret := 1.000000 // buy
								if( d > 11.5339 )
									ret := 0.750000 // buy
							if( rsi1 > 27.5418 )
								ret := -0.250000
						if( VIP_VIM > -0.55852 )
							if( smoothD_d <= 12.8708 )
								if( VIM <= 1.52855 )
									ret := 0.142857
								if( VIM > 1.52855 )
									ret := -0.578947
							if( smoothD_d > 12.8708 )
								if( rsi1 <= 26.5281 )
									ret := -0.333333
								if( rsi1 > 26.5281 )
									ret := -0.925926 // sell
					if( smoothD_d > 13.9213 )
						if( smoothK_k <= 31.5099 )
							if( VIM <= 1.48179 )
								if( d <= 23.3848 )
									ret := 0.446809
								if( d > 23.3848 )
									ret := 0.117438
							if( VIM > 1.48179 )
								if( smoothD_d <= 57.3597 )
									ret := -0.130326
								if( smoothD_d > 57.3597 )
									ret := 1.000000 // buy
						if( smoothK_k > 31.5099 )
							if( d_k <= 23.479 )
								if( smoothD_d <= 46.136 )
									ret := 0.399625
								if( smoothD_d > 46.136 )
									ret := 0.171691
							if( d_k > 23.479 )
								if( VIP <= 1.50825 )
									ret := -0.666667
								if( VIP > 1.50825 )
									ret := 0.666667
	if( rsi1 > 35.0903 )
		if( d_k <= 5.30167 )
			if( rsi1 <= 67.784 )
				if( d_k <= -28.9854 )
					if( rsi1 <= 43.9763 )
						if( d_k <= -29.5651 )
							if( VIP_VIM <= -0.260141 )
								if( rsi1 <= 39.4831 )
									ret := 0.222222
								if( rsi1 > 39.4831 )
									ret := -0.142857
							if( VIP_VIM > -0.260141 )
								if( d_k <= -30.9311 )
									ret := 0.000000
								if( d_k > -30.9311 )
									ret := 0.823529 // buy
						if( d_k > -29.5651 )
							if( d <= 48.6056 )
								ret := 0.142857
							if( d > 48.6056 )
								if( smoothK_k <= 80.8843 )
									ret := -1.000000 // sell
								if( smoothK_k > 80.8843 )
									ret := 0.000000
					if( rsi1 > 43.9763 )
						if( smoothK_k <= 63.0813 )
							if( rsi1 <= 60.1407 )
								if( VIM <= 1.36082 )
									ret := -0.900000 // sell
								if( VIM > 1.36082 )
									ret := -0.500000
							if( rsi1 > 60.1407 )
								if( rsi1 <= 62.3323 )
									ret := 0.500000
								if( rsi1 > 62.3323 )
									ret := -0.583333
						if( smoothK_k > 63.0813 )
							if( k <= 77.6933 )
								if( k <= 76.5047 )
									ret := -0.035714
								if( k > 76.5047 )
									ret := 0.615385
							if( k > 77.6933 )
								if( VIM <= 0.8352 )
									ret := 0.666667
								if( VIM > 0.8352 )
									ret := -0.482143
				if( d_k > -28.9854 )
					if( VIP <= 1.1396 )
						if( smoothD_d <= 0.13031 )
							if( rsi1 <= 57.2523 )
								if( rsi1 <= 40.7338 )
									ret := -0.192560
								if( rsi1 > 40.7338 )
									ret := -0.001650
							if( rsi1 > 57.2523 )
								if( d <= 0.38198 )
									ret := -0.866667 // sell
								if( d > 0.38198 )
									ret := -0.375000
						if( smoothD_d > 0.13031 )
							if( d <= 12.5689 )
								if( d <= 7.96495 )
									ret := 0.015488
								if( d > 7.96495 )
									ret := 0.171076
							if( d > 12.5689 )
								if( d_k <= -17.5103 )
									ret := 0.050463
								if( d_k > -17.5103 )
									ret := -0.015300
					if( VIP > 1.1396 )
						if( rsi1 <= 54.448 )
							if( VIP <= 2.36991 )
								if( k <= 71.3176 )
									ret := 0.167365
								if( k > 71.3176 )
									ret := 0.073565
							if( VIP > 2.36991 )
								if( d_k <= -5.53642 )
									ret := -0.369863
								if( d_k > -5.53642 )
									ret := 0.086826
						if( rsi1 > 54.448 )
							if( VIM <= 1.19571 )
								if( k <= 76.4269 )
									ret := 0.111111
								if( k > 76.4269 )
									ret := 0.029558
							if( VIM > 1.19571 )
								if( smoothK_k <= -0.124789 )
									ret := 0.785714 // buy
								if( smoothK_k > -0.124789 )
									ret := -0.085588
			if( rsi1 > 67.784 )
				if( VIM <= 1.23171 )
					if( d_k <= -27.0268 )
						if( VIP_VIM <= 0.601227 )
							if( VIP <= 1.26579 )
								if( VIM <= 0.70997 )
									ret := 0.909091 // buy
								if( VIM > 0.70997 )
									ret := 0.231707
							if( VIP > 1.26579 )
								if( d_k <= -29.4512 )
									ret := -0.400000
								if( d_k > -29.4512 )
									ret := 0.129032
						if( VIP_VIM > 0.601227 )
							if( VIP <= 1.90059 )
								if( d_k <= -32.4333 )
									ret := 1.000000 // buy
								if( d_k > -32.4333 )
									ret := 0.563636
							if( VIP > 1.90059 )
								ret := -0.250000
					if( d_k > -27.0268 )
						if( rsi1 <= 80.5158 )
							if( VIM <= 0.727159 )
								if( k <= 92.0041 )
									ret := -0.035714
								if( k > 92.0041 )
									ret := 0.180926
							if( VIM > 0.727159 )
								if( k <= 99.4634 )
									ret := -0.005617
								if( k > 99.4634 )
									ret := -0.184783
						if( rsi1 > 80.5158 )
							if( smoothK_k <= 96.9634 )
								if( d_k <= 3.1305 )
									ret := -0.140711
								if( d_k > 3.1305 )
									ret := 0.075145
							if( smoothK_k > 96.9634 )
								if( smoothD_d <= 96.9868 )
									ret := 0.126801
								if( smoothD_d > 96.9868 )
									ret := -0.155844
				if( VIM > 1.23171 )
					if( smoothK_k <= 76.0373 )
						if( rsi1 <= 79.1303 )
							if( smoothK_k <= 43.5943 )
								if( smoothD_d <= 22.2567 )
									ret := -0.346154
								if( smoothD_d > 22.2567 )
									ret := 0.238095
							if( smoothK_k > 43.5943 )
								if( smoothK_k <= 56.9109 )
									ret := -0.621951
								if( smoothK_k > 56.9109 )
									ret := -0.323404
						if( rsi1 > 79.1303 )
							if( rsi1 <= 81.232 )
								if( d <= 56.5361 )
									ret := 0.875000 // buy
								if( d > 56.5361 )
									ret := -0.166667
							if( rsi1 > 81.232 )
								if( VIM <= 1.54459 )
									ret := -0.714286 // sell
								if( VIM > 1.54459 )
									ret := 0.000000
					if( smoothK_k > 76.0373 )
						if( VIP_VIM <= 1.11814 )
							if( d <= 87.2632 )
								if( d_k <= 0.102322 )
									ret := 0.120623
								if( d_k > 0.102322 )
									ret := -0.303030
							if( d > 87.2632 )
								if( d_k <= -1.7186 )
									ret := -0.379464
								if( d_k > -1.7186 )
									ret := -0.093126
						if( VIP_VIM > 1.11814 )
							if( smoothD_d <= 93.6132 )
								if( rsi1 <= 79.6205 )
									ret := 0.772727 // buy
								if( rsi1 > 79.6205 )
									ret := 0.000000
							if( smoothD_d > 93.6132 )
								ret := -0.200000
		if( d_k > 5.30167 )
			if( VIP_VIM <= -0.061729 )
				if( smoothD_d <= 85.6696 )
					if( smoothD_d <= 10.2806 )
						if( VIP <= 1.22836 )
							if( rsi1 <= 46.5314 )
								if( VIP <= 0.764919 )
									ret := -1.000000 // sell
								if( VIP > 0.764919 )
									ret := 0.125364
							if( rsi1 > 46.5314 )
								if( VIM <= 1.07491 )
									ret := 0.428571
								if( VIM > 1.07491 )
									ret := 0.863636 // buy
						if( VIP > 1.22836 )
							if( d <= 11.5018 )
								if( d_k <= 5.92962 )
									ret := 0.900000 // buy
								if( d_k > 5.92962 )
									ret := 0.120000
							if( d > 11.5018 )
								ret := 1.000000 // buy
					if( smoothD_d > 10.2806 )
						if( smoothK_k <= 74.9187 )
							if( smoothD_d <= 82.7438 )
								if( smoothK_k <= 60.3105 )
									ret := 0.014496
								if( smoothK_k > 60.3105 )
									ret := 0.120370
							if( smoothD_d > 82.7438 )
								if( VIM <= 1.15208 )
									ret := 0.000000
								if( VIM > 1.15208 )
									ret := -0.574468
						if( smoothK_k > 74.9187 )
							if( VIP <= 0.91678 )
								if( rsi1 <= 38.4835 )
									ret := -0.750000 // sell
								if( rsi1 > 38.4835 )
									ret := -0.250000
							if( VIP > 0.91678 )
								if( VIM <= 1.61655 )
									ret := 0.589286
								if( VIM > 1.61655 )
									ret := -0.187500
				if( smoothD_d > 85.6696 )
					if( d_k <= 7.22231 )
						if( k <= 83.0555 )
							if( d <= 88.9404 )
								ret := -1.000000 // sell
							if( d > 88.9404 )
								ret := -0.500000
						if( k > 83.0555 )
							if( d_k <= 6.88989 )
								if( VIP_VIM <= -0.08279 )
									ret := 0.041096
								if( VIP_VIM > -0.08279 )
									ret := -0.666667
							if( d_k > 6.88989 )
								if( VIP_VIM <= -0.2348 )
									ret := 1.000000 // buy
								if( VIP_VIM > -0.2348 )
									ret := 0.500000
					if( d_k > 7.22231 )
						if( d_k <= 15.572 )
							if( rsi1 <= 37.3814 )
								if( VIP <= 1.00501 )
									ret := -0.333333
								if( VIP > 1.00501 )
									ret := 0.666667
							if( rsi1 > 37.3814 )
								if( VIM <= 1.06761 )
									ret := 0.285714
								if( VIM > 1.06761 )
									ret := -0.641221
						if( d_k > 15.572 )
							ret := 0.833333 // buy
			if( VIP_VIM > -0.061729 )
				if( rsi1 <= 42.1139 )
					if( smoothD_d <= 10.3052 )
						if( rsi1 <= 38.6943 )
							if( k <= 0.281771 )
								ret := 0.000000
							if( k > 0.281771 )
								if( rsi1 <= 38.1565 )
									ret := -0.950000 // sell
								if( rsi1 > 38.1565 )
									ret := -0.500000
						if( rsi1 > 38.6943 )
							if( rsi1 <= 40.083 )
								ret := 0.750000 // buy
							if( rsi1 > 40.083 )
								if( smoothK_k <= -1.85426 )
									ret := 0.750000 // buy
								if( smoothK_k > -1.85426 )
									ret := 0.000000
					if( smoothD_d > 10.3052 )
						if( VIM <= 1.93863 )
							if( smoothD_d <= 13.5294 )
								if( d <= 14.9116 )
									ret := 0.250000
								if( d > 14.9116 )
									ret := 1.000000 // buy
							if( smoothD_d > 13.5294 )
								if( smoothK_k <= 21.5807 )
									ret := 0.117647
								if( smoothK_k > 21.5807 )
									ret := 0.398496
						if( VIM > 1.93863 )
							if( rsi1 <= 36.4741 )
								ret := 0.200000
							if( rsi1 > 36.4741 )
								if( VIM <= 2.19224 )
									ret := 1.000000 // buy
								if( VIM > 2.19224 )
									ret := 0.695652
				if( rsi1 > 42.1139 )
					if( VIP_VIM <= 0.220801 )
						if( d <= 27.5138 )
							if( rsi1 <= 54.1631 )
								if( VIP <= 2.2207 )
									ret := 0.231242
								if( VIP > 2.2207 )
									ret := -0.800000 // sell
							if( rsi1 > 54.1631 )
								if( VIP <= 1.19268 )
									ret := -0.108527
								if( VIP > 1.19268 )
									ret := 0.298851
						if( d > 27.5138 )
							if( VIP <= 0.969856 )
								if( smoothD_d <= 70.9992 )
									ret := -0.417722
								if( smoothD_d > 70.9992 )
									ret := 0.200000
							if( VIP > 0.969856 )
								if( rsi1 <= 48.0923 )
									ret := 0.136833
								if( rsi1 > 48.0923 )
									ret := 0.035618
					if( VIP_VIM > 0.220801 )
						if( VIP_VIM <= 0.426545 )
							if( d_k <= 20.9495 )
								if( d_k <= 10.5265 )
									ret := 0.118562
								if( d_k > 10.5265 )
									ret := 0.235512
							if( d_k > 20.9495 )
								if( VIP <= 1.22155 )
									ret := -0.135135
								if( VIP > 1.22155 )
									ret := 0.183333
						if( VIP_VIM > 0.426545 )
							if( rsi1 <= 72.1312 )
								if( k <= 80.5477 )
									ret := -0.015032
								if( k > 80.5477 )
									ret := 0.193846
							if( rsi1 > 72.1312 )
								if( d_k <= 7.06121 )
									ret := 0.000000
								if( d_k > 7.06121 )
									ret := 0.229913
	
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
float op_operation = decision_tree_0_TWLO_15Min_b6b429a2(rsi1, d, k, smoothD_d, d_k, smoothK_k, VIP, VIP_VIM, VIM)

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


