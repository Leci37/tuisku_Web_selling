//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: VETUSDT_15Min_2ST0_f5494c27 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_VETUSDT_15Min_2ST0_f5494c27", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_VETUSDT_15Min_f5494c27(smoothK_k, d_k, k, smoothD_d, rsi1, d, ema2, tema, ema12, ema3, ema1, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( smoothK_k <= 50.6477 )
		if( rsi1 <= 47.0082 )
			if( ema12 <= 4e-05 )
				if( ema12 <= -0.000135 )
					if( rsi1 <= 33.2155 )
						if( tema <= 0.032609 )
							if( ema13 <= -0.000348 )
								if( tema <= 0.026174 )
									ret := 0.257005
								if( tema > 0.026174 )
									ret := 0.029233
							if( ema13 > -0.000348 )
								if( smoothK_k <= 0.632701 )
									ret := 0.109813
								if( smoothK_k > 0.632701 )
									ret := -0.122502
						if( tema > 0.032609 )
							if( rsi1 <= 26.8383 )
								if( ema12 <= -0.00033 )
									ret := -0.329897
								if( ema12 > -0.00033 )
									ret := -0.692825
							if( rsi1 > 26.8383 )
								if( k <= 9.18157 )
									ret := 0.223684
								if( k > 9.18157 )
									ret := -0.280193
					if( rsi1 > 33.2155 )
						if( d_k <= -9.09844 )
							if( k <= 21.7273 )
								if( ema12 <= -0.000186 )
									ret := -0.941176 // sell
								if( ema12 > -0.000186 )
									ret := -0.357143
							if( k > 21.7273 )
								if( ema1 <= 0.023107 )
									ret := 0.619048
								if( ema1 > 0.023107 )
									ret := 0.005000
						if( d_k > -9.09844 )
							if( k <= 16.842 )
								if( k <= 13.7558 )
									ret := 0.363395
								if( k > 13.7558 )
									ret := -0.201923
							if( k > 16.842 )
								if( tema <= 0.046551 )
									ret := 0.502242
								if( tema > 0.046551 )
									ret := -0.115385
				if( ema12 > -0.000135 )
					if( rsi1 <= 31.2131 )
						if( tema <= 0.025194 )
							if( rsi1 <= 22.7207 )
								if( ema2 <= 0.016908 )
									ret := -0.273408
								if( ema2 > 0.016908 )
									ret := -0.635834
							if( rsi1 > 22.7207 )
								if( ema13 <= -6e-05 )
									ret := -0.195539
								if( ema13 > -6e-05 )
									ret := -0.447866
						if( tema > 0.025194 )
							if( ema12 <= -4.4e-05 )
								if( rsi1 <= 23.5508 )
									ret := -0.746914 // sell
								if( rsi1 > 23.5508 )
									ret := -0.468412
							if( ema12 > -4.4e-05 )
								if( rsi1 <= 27.5795 )
									ret := -0.871940 // sell
								if( rsi1 > 27.5795 )
									ret := -0.697479
					if( rsi1 > 31.2131 )
						if( tema <= 0.031406 )
							if( ema13 <= -7.3e-05 )
								if( ema12 <= -4.9e-05 )
									ret := 0.090254
								if( ema12 > -4.9e-05 )
									ret := -0.264822
							if( ema13 > -7.3e-05 )
								if( ema12 <= 2.4e-05 )
									ret := -0.150789
								if( ema12 > 2.4e-05 )
									ret := -0.501836
						if( tema > 0.031406 )
							if( rsi1 <= 39.9983 )
								if( ema12 <= -7.6e-05 )
									ret := -0.255670
								if( ema12 > -7.6e-05 )
									ret := -0.585321
							if( rsi1 > 39.9983 )
								if( ema12 <= -5.7e-05 )
									ret := 0.006135
								if( ema12 > -5.7e-05 )
									ret := -0.282916
			if( ema12 > 4e-05 )
				if( rsi1 <= 42.8552 )
					if( rsi1 <= 33.7709 )
						if( ema3 <= 0.027063 )
							if( ema2 <= 0.026577 )
								if( ema3 <= 0.023762 )
									ret := -0.790698 // sell
								if( ema3 > 0.023762 )
									ret := -1.000000 // sell
							if( ema2 > 0.026577 )
								if( d <= 1.25385 )
									ret := -0.750000 // sell
								if( d > 1.25385 )
									ret := 0.400000
						if( ema3 > 0.027063 )
							if( ema12 <= 4.9e-05 )
								if( tema <= 0.045548 )
									ret := -0.965517 // sell
								if( tema > 0.045548 )
									ret := -0.750000 // sell
							if( ema12 > 4.9e-05 )
								if( smoothK_k <= -2.96642 )
									ret := -0.974359 // sell
								if( smoothK_k > -2.96642 )
									ret := -1.000000 // sell
					if( rsi1 > 33.7709 )
						if( d_k <= 25.6176 )
							if( rsi1 <= 33.7946 )
								ret := 1.000000 // buy
							if( rsi1 > 33.7946 )
								if( smoothK_k <= -0.42021 )
									ret := -0.758621 // sell
								if( smoothK_k > -0.42021 )
									ret := -0.850852 // sell
						if( d_k > 25.6176 )
							if( smoothD_d <= 54.1661 )
								if( d_k <= 29.3449 )
									ret := -0.538462
								if( d_k > 29.3449 )
									ret := -1.000000 // sell
							if( smoothD_d > 54.1661 )
								if( d_k <= 30.5261 )
									ret := -0.166667
								if( d_k > 30.5261 )
									ret := 1.000000 // buy
				if( rsi1 > 42.8552 )
					if( d <= 11.7767 )
						if( ema12 <= 0.000133 )
							if( ema13 <= 0.000261 )
								if( smoothK_k <= 0.704302 )
									ret := -0.522936
								if( smoothK_k > 0.704302 )
									ret := -0.788889 // sell
							if( ema13 > 0.000261 )
								if( ema12 <= 9.4e-05 )
									ret := 0.777778 // buy
								if( ema12 > 9.4e-05 )
									ret := -0.409091
						if( ema12 > 0.000133 )
							if( k <= 9.57939 )
								if( d <= 4.0656 )
									ret := -0.849057 // sell
								if( d > 4.0656 )
									ret := -0.983051 // sell
							if( k > 9.57939 )
								ret := -0.200000
					if( d > 11.7767 )
						if( ema12 <= 6.5e-05 )
							if( ema3 <= 0.036119 )
								if( ema13 <= 0.000152 )
									ret := -0.327778
								if( ema13 > 0.000152 )
									ret := 0.750000 // buy
							if( ema3 > 0.036119 )
								if( d_k <= 16.5727 )
									ret := -0.820513 // sell
								if( d_k > 16.5727 )
									ret := 0.000000
						if( ema12 > 6.5e-05 )
							if( k <= 6.80979 )
								if( k <= 3.38828 )
									ret := -0.739130 // sell
								if( k > 3.38828 )
									ret := 0.333333
							if( k > 6.80979 )
								if( d_k <= 27.2922 )
									ret := -0.789720 // sell
								if( d_k > 27.2922 )
									ret := -0.350000
		if( rsi1 > 47.0082 )
			if( ema12 <= -2.3e-05 )
				if( d_k <= -13.1656 )
					if( rsi1 <= 51.5583 )
						if( k <= 24.3839 )
							ret := 1.000000 // buy
						if( k > 24.3839 )
							if( ema3 <= 0.022893 )
								if( d_k <= -14.5796 )
									ret := 0.357143
								if( d_k > -14.5796 )
									ret := -0.117647
							if( ema3 > 0.022893 )
								if( ema12 <= -0.000145 )
									ret := 0.555556
								if( ema12 > -0.000145 )
									ret := -0.210084
					if( rsi1 > 51.5583 )
						if( smoothD_d <= 25.2418 )
							if( rsi1 <= 56.3053 )
								if( tema <= 0.029961 )
									ret := -0.222222
								if( tema > 0.029961 )
									ret := 0.333333
							if( rsi1 > 56.3053 )
								if( ema13 <= -5.4e-05 )
									ret := 0.000000
								if( ema13 > -5.4e-05 )
									ret := 0.875000 // buy
						if( smoothD_d > 25.2418 )
							if( ema12 <= -3.6e-05 )
								if( ema3 <= 0.026071 )
									ret := 0.611111
								if( ema3 > 0.026071 )
									ret := 0.896552 // buy
							if( ema12 > -3.6e-05 )
								if( ema13 <= -4e-05 )
									ret := 0.000000
								if( ema13 > -4e-05 )
									ret := 0.250000
				if( d_k > -13.1656 )
					if( d <= 57.15 )
						if( d_k <= 21.5223 )
							if( rsi1 <= 53.4924 )
								if( ema12 <= -4e-05 )
									ret := 0.559242
								if( ema12 > -4e-05 )
									ret := 0.302885
							if( rsi1 > 53.4924 )
								if( ema2 <= 0.023803 )
									ret := 0.448276
								if( ema2 > 0.023803 )
									ret := 0.823529 // buy
						if( d_k > 21.5223 )
							if( rsi1 <= 48.5789 )
								if( ema12 <= -3.9e-05 )
									ret := -1.000000 // sell
								if( ema12 > -3.9e-05 )
									ret := -0.750000 // sell
							if( rsi1 > 48.5789 )
								ret := 0.200000
					if( d > 57.15 )
						if( smoothK_k <= 45.8597 )
							if( k <= 46.2566 )
								if( d_k <= 25.6891 )
									ret := -0.818182 // sell
								if( d_k > 25.6891 )
									ret := 0.750000 // buy
							if( k > 46.2566 )
								if( ema13 <= -6.2e-05 )
									ret := 0.714286 // buy
								if( ema13 > -6.2e-05 )
									ret := 1.000000 // buy
						if( smoothK_k > 45.8597 )
							if( ema2 <= 0.022648 )
								ret := 0.750000 // buy
							if( ema2 > 0.022648 )
								if( k <= 52.6426 )
									ret := -0.933333 // sell
								if( k > 52.6426 )
									ret := -0.166667
			if( ema12 > -2.3e-05 )
				if( rsi1 <= 62.1548 )
					if( ema12 <= 6.5e-05 )
						if( ema2 <= 0.031839 )
							if( rsi1 <= 55.4565 )
								if( ema13 <= 0.000155 )
									ret := -0.048173
								if( ema13 > 0.000155 )
									ret := 0.316832
							if( rsi1 > 55.4565 )
								if( ema12 <= 1e-05 )
									ret := 0.281947
								if( ema12 > 1e-05 )
									ret := 0.073039
						if( ema2 > 0.031839 )
							if( d_k <= -9.01919 )
								if( k <= 49.1412 )
									ret := -0.125000
								if( k > 49.1412 )
									ret := 0.478261
							if( d_k > -9.01919 )
								if( rsi1 <= 52.6438 )
									ret := -0.002128
								if( rsi1 > 52.6438 )
									ret := 0.487047
					if( ema12 > 6.5e-05 )
						if( ema12 <= 0.00014 )
							if( ema13 <= 0.000267 )
								if( rsi1 <= 53.7658 )
									ret := -0.506550
								if( rsi1 > 53.7658 )
									ret := -0.171797
							if( ema13 > 0.000267 )
								if( smoothK_k <= 1.16832 )
									ret := -0.365854
								if( smoothK_k > 1.16832 )
									ret := 0.368852
						if( ema12 > 0.00014 )
							if( rsi1 <= 55.0072 )
								if( d_k <= -11.0056 )
									ret := 0.555556
								if( d_k > -11.0056 )
									ret := -0.649123
							if( rsi1 > 55.0072 )
								if( ema3 <= 0.033077 )
									ret := -0.428169
								if( ema3 > 0.033077 )
									ret := -0.151163
				if( rsi1 > 62.1548 )
					if( ema12 <= 0.000226 )
						if( ema3 <= 0.033898 )
							if( rsi1 <= 67.1506 )
								if( k <= 47.1925 )
									ret := 0.155704
								if( k > 47.1925 )
									ret := -0.090164
							if( rsi1 > 67.1506 )
								if( smoothK_k <= 16.0791 )
									ret := 0.534694
								if( smoothK_k > 16.0791 )
									ret := 0.250755
						if( ema3 > 0.033898 )
							if( d <= 11.531 )
								if( smoothK_k <= 10.1472 )
									ret := 0.000000
								if( smoothK_k > 10.1472 )
									ret := -0.700000 // sell
							if( d > 11.531 )
								if( d <= 38.5153 )
									ret := 0.689655
								if( d > 38.5153 )
									ret := 0.376147
					if( ema12 > 0.000226 )
						if( rsi1 <= 67.6028 )
							if( tema <= 0.028468 )
								if( k <= 11.0582 )
									ret := -0.300000
								if( k > 11.0582 )
									ret := -0.814815 // sell
							if( tema > 0.028468 )
								if( smoothK_k <= 12.2205 )
									ret := 0.193878
								if( smoothK_k > 12.2205 )
									ret := -0.260870
						if( rsi1 > 67.6028 )
							if( k <= 4.98945 )
								if( d <= 23.0438 )
									ret := -0.629630
								if( d > 23.0438 )
									ret := 0.500000
							if( k > 4.98945 )
								if( d_k <= 10.4434 )
									ret := 0.119048
								if( d_k > 10.4434 )
									ret := 0.450000
	if( smoothK_k > 50.6477 )
		if( k <= 87.0917 )
			if( rsi1 <= 57.0269 )
				if( ema12 <= 3.2e-05 )
					if( ema12 <= -7.5e-05 )
						if( k <= 81.1917 )
							if( rsi1 <= 41.3783 )
								if( ema2 <= 0.027245 )
									ret := 0.120598
								if( ema2 > 0.027245 )
									ret := -0.069036
							if( rsi1 > 41.3783 )
								if( rsi1 <= 45.9577 )
									ret := 0.294925
								if( rsi1 > 45.9577 )
									ret := 0.609665
						if( k > 81.1917 )
							if( ema13 <= -0.000394 )
								if( rsi1 <= 39.7608 )
									ret := -0.191304
								if( rsi1 > 39.7608 )
									ret := 0.596491
							if( ema13 > -0.000394 )
								if( rsi1 <= 32.9638 )
									ret := -0.075472
								if( rsi1 > 32.9638 )
									ret := 0.580000
					if( ema12 > -7.5e-05 )
						if( k <= 59.7367 )
							if( tema <= 0.033368 )
								if( ema13 <= -0.000113 )
									ret := -0.296053
								if( ema13 > -0.000113 )
									ret := 0.021918
							if( tema > 0.033368 )
								if( ema13 <= -5e-05 )
									ret := -0.531250
								if( ema13 > -5e-05 )
									ret := 0.109589
						if( k > 59.7367 )
							if( rsi1 <= 50.0072 )
								if( tema <= 0.024375 )
									ret := 0.024236
								if( tema > 0.024375 )
									ret := -0.155862
							if( rsi1 > 50.0072 )
								if( d_k <= 12.2024 )
									ret := 0.180171
								if( d_k > 12.2024 )
									ret := 0.418410
				if( ema12 > 3.2e-05 )
					if( ema2 <= 0.032358 )
						if( ema12 <= 0.000123 )
							if( smoothK_k <= 65.2129 )
								if( ema12 <= 4.1e-05 )
									ret := -0.040230
								if( ema12 > 4.1e-05 )
									ret := -0.316667
							if( smoothK_k > 65.2129 )
								if( smoothK_k <= 74.1749 )
									ret := 0.039634
								if( smoothK_k > 74.1749 )
									ret := -0.253425
						if( ema12 > 0.000123 )
							if( rsi1 <= 47.5234 )
								ret := 0.200000
							if( rsi1 > 47.5234 )
								if( smoothK_k <= 54.8248 )
									ret := 0.000000
								if( smoothK_k > 54.8248 )
									ret := -0.796610 // sell
					if( ema2 > 0.032358 )
						if( d <= 89.4306 )
							if( d_k <= 12.6933 )
								if( d_k <= -18.3894 )
									ret := -0.071429
								if( d_k > -18.3894 )
									ret := -0.686364
							if( d_k > 12.6933 )
								if( ema12 <= 0.000283 )
									ret := -0.095890
								if( ema12 > 0.000283 )
									ret := -1.000000 // sell
						if( d > 89.4306 )
							if( k <= 81.6284 )
								if( d <= 90.5542 )
									ret := 0.555556
								if( d > 90.5542 )
									ret := 1.000000 // buy
							if( k > 81.6284 )
								if( smoothD_d <= 89.2441 )
									ret := -0.833333 // sell
								if( smoothD_d > 89.2441 )
									ret := 0.000000
			if( rsi1 > 57.0269 )
				if( ema12 <= -3e-06 )
					if( ema12 <= -1.6e-05 )
						if( k <= 86.9632 )
							if( ema1 <= 0.049895 )
								if( tema <= 0.01799 )
									ret := 0.413793
								if( tema > 0.01799 )
									ret := 0.804317 // buy
							if( ema1 > 0.049895 )
								ret := -0.200000
						if( k > 86.9632 )
							ret := -0.166667
					if( ema12 > -1.6e-05 )
						if( ema2 <= 0.019525 )
							if( d <= 58.4595 )
								if( d <= 35.0791 )
									ret := 0.375000
								if( d > 35.0791 )
									ret := 0.046512
							if( d > 58.4595 )
								if( k <= 70.7498 )
									ret := 0.750000 // buy
								if( k > 70.7498 )
									ret := 0.266667
						if( ema2 > 0.019525 )
							if( rsi1 <= 64.7208 )
								if( smoothD_d <= 77.276 )
									ret := 0.414894
								if( smoothD_d > 77.276 )
									ret := 0.690476
							if( rsi1 > 64.7208 )
								if( smoothD_d <= 37.7384 )
									ret := 0.500000
								if( smoothD_d > 37.7384 )
									ret := 0.847059 // buy
				if( ema12 > -3e-06 )
					if( smoothD_d <= 84.7118 )
						if( rsi1 <= 75.6878 )
							if( rsi1 <= 64.5863 )
								if( ema12 <= 7.2e-05 )
									ret := 0.190681
								if( ema12 > 7.2e-05 )
									ret := -0.161316
							if( rsi1 > 64.5863 )
								if( ema13 <= 0.000318 )
									ret := 0.253778
								if( ema13 > 0.000318 )
									ret := 0.033679
						if( rsi1 > 75.6878 )
							if( rsi1 <= 79.3586 )
								if( ema2 <= 0.029376 )
									ret := 0.305882
								if( ema2 > 0.029376 )
									ret := 0.627451
							if( rsi1 > 79.3586 )
								if( d_k <= -3.61297 )
									ret := 0.733333 // buy
								if( d_k > -3.61297 )
									ret := 0.525994
					if( smoothD_d > 84.7118 )
						if( rsi1 <= 73.0976 )
							if( ema12 <= 0.000287 )
								if( k <= 85.9097 )
									ret := 0.431352
								if( k > 85.9097 )
									ret := 0.143478
							if( ema12 > 0.000287 )
								if( ema2 <= 0.044365 )
									ret := -0.821429 // sell
								if( ema2 > 0.044365 )
									ret := 0.428571
						if( rsi1 > 73.0976 )
							if( ema3 <= 0.016365 )
								if( d <= 89.8891 )
									ret := 0.000000
								if( d > 89.8891 )
									ret := 0.250000
							if( ema3 > 0.016365 )
								if( ema13 <= 0.000233 )
									ret := 0.723982 // buy
								if( ema13 > 0.000233 )
									ret := 0.492683
		if( k > 87.0917 )
			if( ema12 <= -4.7e-05 )
				if( smoothD_d <= 92.7536 )
					if( rsi1 <= 50.003 )
						if( smoothK_k <= 95.0313 )
							if( ema12 <= -0.000116 )
								if( rsi1 <= 36.4134 )
									ret := 0.300613
								if( rsi1 > 36.4134 )
									ret := 0.688928
							if( ema12 > -0.000116 )
								if( tema <= 0.023019 )
									ret := 0.441860
								if( tema > 0.023019 )
									ret := 0.082569
						if( smoothK_k > 95.0313 )
							if( ema12 <= -0.000112 )
								if( d_k <= -20.9442 )
									ret := -0.720000 // sell
								if( d_k > -20.9442 )
									ret := 0.360000
							if( ema12 > -0.000112 )
								if( rsi1 <= 44.4075 )
									ret := -0.584906
								if( rsi1 > 44.4075 )
									ret := -0.156250
					if( rsi1 > 50.003 )
						if( rsi1 <= 60.3932 )
							if( tema <= 0.048401 )
								if( ema13 <= -0.001085 )
									ret := -0.600000
								if( ema13 > -0.001085 )
									ret := 0.707187 // buy
							if( tema > 0.048401 )
								if( ema13 <= -0.00018 )
									ret := 0.200000
								if( ema13 > -0.00018 )
									ret := -0.750000 // sell
						if( rsi1 > 60.3932 )
							if( ema2 <= 0.019065 )
								if( rsi1 <= 64.1635 )
									ret := 0.583333
								if( rsi1 > 64.1635 )
									ret := 0.000000
							if( ema2 > 0.019065 )
								if( ema1 <= 0.026286 )
									ret := 0.803571 // buy
								if( ema1 > 0.026286 )
									ret := 0.927492 // buy
				if( smoothD_d > 92.7536 )
					if( ema12 <= -0.000182 )
						if( smoothK_k <= 90.8908 )
							if( tema <= 0.033198 )
								if( ema13 <= -0.000635 )
									ret := 0.800000 // buy
								if( ema13 > -0.000635 )
									ret := 0.000000
							if( tema > 0.033198 )
								if( d <= 96.5764 )
									ret := 1.000000 // buy
								if( d > 96.5764 )
									ret := 0.750000 // buy
						if( smoothK_k > 90.8908 )
							if( rsi1 <= 41.7198 )
								if( rsi1 <= 36.8088 )
									ret := 0.962963 // buy
								if( rsi1 > 36.8088 )
									ret := 0.500000
							if( rsi1 > 41.7198 )
								if( tema <= 0.048055 )
									ret := 0.962791 // buy
								if( tema > 0.048055 )
									ret := 0.600000
					if( ema12 > -0.000182 )
						if( rsi1 <= 50.4569 )
							if( k <= 99.721 )
								if( k <= 98.6933 )
									ret := 0.232394
								if( k > 98.6933 )
									ret := 0.786885 // buy
							if( k > 99.721 )
								if( d_k <= -0.724916 )
									ret := 0.272727
								if( d_k > -0.724916 )
									ret := -0.500000
						if( rsi1 > 50.4569 )
							if( ema2 <= 0.048245 )
								if( ema12 <= -6.2e-05 )
									ret := 0.881686 // buy
								if( ema12 > -6.2e-05 )
									ret := 0.750000 // buy
							if( ema2 > 0.048245 )
								ret := 0.166667
			if( ema12 > -4.7e-05 )
				if( rsi1 <= 66.6721 )
					if( rsi1 <= 57.2145 )
						if( ema12 <= 7.1e-05 )
							if( rsi1 <= 51.7143 )
								if( ema1 <= 0.023288 )
									ret := 0.024233
								if( ema1 > 0.023288 )
									ret := -0.242604
							if( rsi1 > 51.7143 )
								if( k <= 92.1744 )
									ret := 0.226471
								if( k > 92.1744 )
									ret := -0.024472
						if( ema12 > 7.1e-05 )
							if( smoothD_d <= 94.6442 )
								if( smoothK_k <= 96.9891 )
									ret := -0.520710
								if( smoothK_k > 96.9891 )
									ret := 0.625000
							if( smoothD_d > 94.6442 )
								if( smoothD_d <= 95.1483 )
									ret := 1.000000 // buy
								if( smoothD_d > 95.1483 )
									ret := 0.000000
					if( rsi1 > 57.2145 )
						if( ema12 <= 2.8e-05 )
							if( ema12 <= -1.2e-05 )
								if( rsi1 <= 60.6562 )
									ret := 0.449495
								if( rsi1 > 60.6562 )
									ret := 0.694391
							if( ema12 > -1.2e-05 )
								if( ema3 <= 0.019943 )
									ret := 0.198361
								if( ema3 > 0.019943 )
									ret := 0.340734
						if( ema12 > 2.8e-05 )
							if( d_k <= 1.86397 )
								if( ema12 <= 6.2e-05 )
									ret := 0.045033
								if( ema12 > 6.2e-05 )
									ret := -0.220501
							if( d_k > 1.86397 )
								if( rsi1 <= 63.6618 )
									ret := 0.073801
								if( rsi1 > 63.6618 )
									ret := 0.421053
				if( rsi1 > 66.6721 )
					if( ema12 <= 8e-05 )
						if( ema2 <= 0.019424 )
							if( rsi1 <= 83.3884 )
								if( ema12 <= -1e-06 )
									ret := 0.600000
								if( ema12 > -1e-06 )
									ret := 0.304223
							if( rsi1 > 83.3884 )
								if( ema12 <= 7.3e-05 )
									ret := 0.717391 // buy
								if( ema12 > 7.3e-05 )
									ret := 0.210526
						if( ema2 > 0.019424 )
							if( ema12 <= 2.4e-05 )
								if( ema12 <= 2e-06 )
									ret := 0.853026 // buy
								if( ema12 > 2e-06 )
									ret := 0.726667 // buy
							if( ema12 > 2.4e-05 )
								if( rsi1 <= 76.4816 )
									ret := 0.407627
								if( rsi1 > 76.4816 )
									ret := 0.745055 // buy
					if( ema12 > 8e-05 )
						if( rsi1 <= 77.3442 )
							if( ema2 <= 0.031843 )
								if( ema2 <= 0.022335 )
									ret := 0.331190
								if( ema2 > 0.022335 )
									ret := 0.023438
							if( ema2 > 0.031843 )
								if( d_k <= 3.07744 )
									ret := 0.300420
								if( d_k > 3.07744 )
									ret := 0.639175
						if( rsi1 > 77.3442 )
							if( ema3 <= 0.026725 )
								if( ema13 <= 0.000264 )
									ret := 0.429348
								if( ema13 > 0.000264 )
									ret := 0.139059
							if( ema3 > 0.026725 )
								if( ema12 <= 0.000678 )
									ret := 0.678636
								if( ema12 > 0.000678 )
									ret := 0.071429
	
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
float op_operation = decision_tree_0_VETUSDT_15Min_f5494c27(smoothK_k, d_k, k, smoothD_d, rsi1, d, ema2, tema, ema12, ema3, ema1, ema13)

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


