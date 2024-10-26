//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: SOLUSDT_30Min_2SV0_39fd6def Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SOLUSDT_30Min_2SV0_39fd6def", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SOLUSDT_30Min_39fd6def(d_k, d, rsi1, k, smoothD_d, smoothK_k, VIP_VIM, VIM, VIP)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( rsi1 <= 49.517 )
		if( d_k <= -3.78348 )
			if( VIP <= 0.943966 )
				if( k <= 18.7578 )
					if( rsi1 <= 36.5094 )
						if( rsi1 <= 26.6582 )
							if( VIM <= 1.24053 )
								if( VIP_VIM <= -0.554355 )
									ret := 0.142857
								if( VIP_VIM > -0.554355 )
									ret := -0.692737
							if( VIM > 1.24053 )
								if( smoothD_d <= -0.580711 )
									ret := 0.909091 // buy
								if( smoothD_d > -0.580711 )
									ret := -0.293333
						if( rsi1 > 26.6582 )
							if( VIP_VIM <= -0.366513 )
								if( smoothD_d <= 2.09655 )
									ret := -0.215909
								if( smoothD_d > 2.09655 )
									ret := 0.140523
							if( VIP_VIM > -0.366513 )
								if( rsi1 <= 35.2449 )
									ret := -0.221649
								if( rsi1 > 35.2449 )
									ret := -0.621212
					if( rsi1 > 36.5094 )
						if( VIP <= 0.874974 )
							if( smoothK_k <= 12.5657 )
								if( smoothD_d <= 3.83509 )
									ret := 0.426667
								if( smoothD_d > 3.83509 )
									ret := -0.282051
							if( smoothK_k > 12.5657 )
								if( rsi1 <= 45.7886 )
									ret := 0.512821
								if( rsi1 > 45.7886 )
									ret := 0.888889 // buy
						if( VIP > 0.874974 )
							if( smoothK_k <= 10.8112 )
								if( d <= 4.42908 )
									ret := -0.242424
								if( d > 4.42908 )
									ret := 0.423913
							if( smoothK_k > 10.8112 )
								if( rsi1 <= 45.968 )
									ret := -0.277778
								if( rsi1 > 45.968 )
									ret := 0.571429
				if( k > 18.7578 )
					if( VIP <= 0.796296 )
						if( rsi1 <= 31.776 )
							if( VIP_VIM <= -0.618429 )
								if( VIP <= 0.643347 )
									ret := 0.486842
								if( VIP > 0.643347 )
									ret := -0.022222
							if( VIP_VIM > -0.618429 )
								if( rsi1 <= 27.6472 )
									ret := -0.335150
								if( rsi1 > 27.6472 )
									ret := 0.046559
						if( rsi1 > 31.776 )
							if( VIP <= 0.767737 )
								if( d_k <= -20.1147 )
									ret := 0.654088
								if( d_k > -20.1147 )
									ret := 0.477273
							if( VIP > 0.767737 )
								if( rsi1 <= 34.5743 )
									ret := 0.072000
								if( rsi1 > 34.5743 )
									ret := 0.455733
					if( VIP > 0.796296 )
						if( d_k <= -10.9371 )
							if( rsi1 <= 45.7187 )
								if( rsi1 <= 37.5151 )
									ret := -0.175281
								if( rsi1 > 37.5151 )
									ret := 0.170566
							if( rsi1 > 45.7187 )
								if( VIP_VIM <= -0.13064 )
									ret := 0.507653
								if( VIP_VIM > -0.13064 )
									ret := -0.230769
						if( d_k > -10.9371 )
							if( smoothD_d <= 80.6421 )
								if( smoothD_d <= 34.2899 )
									ret := 0.083867
								if( smoothD_d > 34.2899 )
									ret := -0.051827
							if( smoothD_d > 80.6421 )
								if( rsi1 <= 42.4778 )
									ret := -0.113208
								if( rsi1 > 42.4778 )
									ret := 0.429245
			if( VIP > 0.943966 )
				if( smoothD_d <= 7.31536 )
					if( rsi1 <= 32.0337 )
						if( VIP_VIM <= -0.176812 )
							ret := 0.000000
						if( VIP_VIM > -0.176812 )
							if( VIP_VIM <= 0.224093 )
								if( k <= 12.6117 )
									ret := -0.937500 // sell
								if( k > 12.6117 )
									ret := -0.666667
							if( VIP_VIM > 0.224093 )
								ret := -0.400000
					if( rsi1 > 32.0337 )
						if( VIM <= 0.992268 )
							if( rsi1 <= 35.0029 )
								if( smoothK_k <= 6.40443 )
									ret := -0.400000
								if( smoothK_k > 6.40443 )
									ret := 0.000000
							if( rsi1 > 35.0029 )
								if( rsi1 <= 41.5032 )
									ret := -0.678899
								if( rsi1 > 41.5032 )
									ret := -0.465278
						if( VIM > 0.992268 )
							if( d_k <= -5.02803 )
								if( VIM <= 1.14483 )
									ret := -0.457627
								if( VIM > 1.14483 )
									ret := 0.600000
							if( d_k > -5.02803 )
								if( smoothD_d <= 3.08755 )
									ret := -0.295082
								if( smoothD_d > 3.08755 )
									ret := 0.212121
				if( smoothD_d > 7.31536 )
					if( rsi1 <= 44.7911 )
						if( VIM <= 1.06505 )
							if( d_k <= -13.7366 )
								if( k <= 67.8439 )
									ret := -0.792453 // sell
								if( k > 67.8439 )
									ret := 0.500000
							if( d_k > -13.7366 )
								if( rsi1 <= 35.3834 )
									ret := -0.731707 // sell
								if( rsi1 > 35.3834 )
									ret := -0.346154
						if( VIM > 1.06505 )
							if( smoothK_k <= 89.6277 )
								if( d_k <= -12.8173 )
									ret := -0.523810
								if( d_k > -12.8173 )
									ret := -0.041379
							if( smoothK_k > 89.6277 )
								if( VIM <= 1.10429 )
									ret := -0.142857
								if( VIM > 1.10429 )
									ret := 0.875000 // buy
					if( rsi1 > 44.7911 )
						if( VIP <= 0.986805 )
							if( smoothD_d <= 10.5113 )
								if( VIP <= 0.977469 )
									ret := 0.794118 // buy
								if( VIP > 0.977469 )
									ret := 0.000000
							if( smoothD_d > 10.5113 )
								if( smoothD_d <= 38.883 )
									ret := 0.101796
								if( smoothD_d > 38.883 )
									ret := -0.066667
						if( VIP > 0.986805 )
							if( smoothK_k <= 74.2539 )
								if( d_k <= -6.92382 )
									ret := -0.327434
								if( d_k > -6.92382 )
									ret := -0.055556
							if( smoothK_k > 74.2539 )
								if( smoothK_k <= 82.4092 )
									ret := 0.608696
								if( smoothK_k > 82.4092 )
									ret := -0.166667
		if( d_k > -3.78348 )
			if( rsi1 <= 35.4049 )
				if( VIP_VIM <= -0.306317 )
					if( VIP <= 0.524397 )
						if( VIM <= 1.44848 )
							if( k <= 1.06236 )
								if( VIP_VIM <= -0.977957 )
									ret := 1.000000 // buy
								if( VIP_VIM > -0.977957 )
									ret := 0.869565 // buy
							if( k > 1.06236 )
								if( smoothK_k <= 0.472663 )
									ret := -0.833333 // sell
								if( smoothK_k > 0.472663 )
									ret := 0.650000
						if( VIM > 1.44848 )
							if( rsi1 <= 9.39943 )
								ret := 0.250000
							if( rsi1 > 9.39943 )
								ret := -1.000000 // sell
					if( VIP > 0.524397 )
						if( rsi1 <= 25.9907 )
							if( VIP_VIM <= -0.483939 )
								if( rsi1 <= 15.5604 )
									ret := -0.524775
								if( rsi1 > 15.5604 )
									ret := -0.166858
							if( VIP_VIM > -0.483939 )
								if( rsi1 <= 15.2981 )
									ret := -0.827586 // sell
								if( rsi1 > 15.2981 )
									ret := -0.510052
						if( rsi1 > 25.9907 )
							if( VIP <= 0.799618 )
								if( rsi1 <= 31.1473 )
									ret := -0.061840
								if( rsi1 > 31.1473 )
									ret := 0.215152
							if( VIP > 0.799618 )
								if( smoothK_k <= 39.8959 )
									ret := -0.149888
								if( smoothK_k > 39.8959 )
									ret := -0.565217
				if( VIP_VIM > -0.306317 )
					if( rsi1 <= 26.5295 )
						if( k <= 0.719435 )
							if( d_k <= 1.1292 )
								if( rsi1 <= 21.2042 )
									ret := -0.909836 // sell
								if( rsi1 > 21.2042 )
									ret := -0.801020 // sell
							if( d_k > 1.1292 )
								if( rsi1 <= 18.912 )
									ret := -0.877273 // sell
								if( rsi1 > 18.912 )
									ret := -0.738717 // sell
						if( k > 0.719435 )
							if( VIM <= 1.18663 )
								if( d_k <= -3.49613 )
									ret := -0.235294
								if( d_k > -3.49613 )
									ret := -0.735213 // sell
							if( VIM > 1.18663 )
								if( VIP_VIM <= -0.254458 )
									ret := 0.500000
								if( VIP_VIM > -0.254458 )
									ret := -0.750000 // sell
					if( rsi1 > 26.5295 )
						if( VIP_VIM <= -0.193588 )
							if( k <= 42.9283 )
								if( rsi1 <= 33.1815 )
									ret := -0.380468
								if( rsi1 > 33.1815 )
									ret := -0.114286
							if( k > 42.9283 )
								if( d_k <= 15.9691 )
									ret := -0.682927
								if( d_k > 15.9691 )
									ret := -0.148148
						if( VIP_VIM > -0.193588 )
							if( VIM <= 1.02251 )
								if( d_k <= 5.17169 )
									ret := -0.567757
								if( d_k > 5.17169 )
									ret := -0.719563 // sell
							if( VIM > 1.02251 )
								if( rsi1 <= 33.598 )
									ret := -0.594464
								if( rsi1 > 33.598 )
									ret := -0.362525
			if( rsi1 > 35.4049 )
				if( VIP_VIM <= 0.053714 )
					if( rsi1 <= 41.9338 )
						if( VIP <= 0.899657 )
							if( d_k <= 13.7078 )
								if( VIP_VIM <= -0.328478 )
									ret := 0.109415
								if( VIP_VIM > -0.328478 )
									ret := -0.127319
							if( d_k > 13.7078 )
								if( d <= 39.1026 )
									ret := 0.088235
								if( d > 39.1026 )
									ret := 0.481481
						if( VIP > 0.899657 )
							if( VIM <= 1.05506 )
								if( d <= 27.3035 )
									ret := -0.329821
								if( d > 27.3035 )
									ret := -0.512387
							if( VIM > 1.05506 )
								if( d_k <= 7.90903 )
									ret := -0.316279
								if( d_k > 7.90903 )
									ret := -0.082707
					if( rsi1 > 41.9338 )
						if( d_k <= 0.725043 )
							if( VIM <= 1.07071 )
								if( VIP <= 0.995928 )
									ret := 0.093750
								if( VIP > 0.995928 )
									ret := -0.176871
							if( VIM > 1.07071 )
								if( VIP <= 0.827989 )
									ret := 0.529915
								if( VIP > 0.827989 )
									ret := 0.192529
						if( d_k > 0.725043 )
							if( VIP <= 0.957388 )
								if( VIP_VIM <= -0.233135 )
									ret := 0.283401
								if( VIP_VIM > -0.233135 )
									ret := 0.023015
							if( VIP > 0.957388 )
								if( smoothK_k <= 52.6589 )
									ret := -0.034404
								if( smoothK_k > 52.6589 )
									ret := -0.241283
				if( VIP_VIM > 0.053714 )
					if( VIP_VIM <= 0.188014 )
						if( rsi1 <= 43.9583 )
							if( smoothD_d <= 35.3869 )
								if( VIP <= 1.09004 )
									ret := -0.458015
								if( VIP > 1.09004 )
									ret := -0.284672
							if( smoothD_d > 35.3869 )
								if( smoothK_k <= 57.2823 )
									ret := -0.662592
								if( smoothK_k > 57.2823 )
									ret := -0.396552
						if( rsi1 > 43.9583 )
							if( smoothK_k <= 25.974 )
								if( d <= 1.72699 )
									ret := -0.704545 // sell
								if( d > 1.72699 )
									ret := -0.142857
							if( smoothK_k > 25.974 )
								if( d_k <= 23.469 )
									ret := -0.467164
								if( d_k > 23.469 )
									ret := 0.307692
					if( VIP_VIM > 0.188014 )
						if( d_k <= 17.8641 )
							if( rsi1 <= 42.9897 )
								if( d_k <= 3.47777 )
									ret := -0.472656
								if( d_k > 3.47777 )
									ret := -0.641414
							if( rsi1 > 42.9897 )
								if( VIM <= 0.91236 )
									ret := -0.489152
								if( VIM > 0.91236 )
									ret := -0.111111
						if( d_k > 17.8641 )
							if( VIM <= 0.914297 )
								if( VIP <= 1.18112 )
									ret := -0.704152 // sell
								if( VIP > 1.18112 )
									ret := -0.545833
							if( VIM > 0.914297 )
								if( VIP_VIM <= 0.20607 )
									ret := -0.709677 // sell
								if( VIP_VIM > 0.20607 )
									ret := -0.157895
	if( rsi1 > 49.517 )
		if( k <= 78.5876 )
			if( VIP_VIM <= 0.143452 )
				if( rsi1 <= 58.7582 )
					if( VIP <= 0.984461 )
						if( VIP <= 0.877675 )
							if( smoothD_d <= 9.93082 )
								ret := -0.333333
							if( smoothD_d > 9.93082 )
								if( d <= 62.0359 )
									ret := 0.704797 // buy
								if( d > 62.0359 )
									ret := 0.393939
						if( VIP > 0.877675 )
							if( k <= 66.4175 )
								if( rsi1 <= 50.0028 )
									ret := 0.241573
								if( rsi1 > 50.0028 )
									ret := 0.519565
							if( k > 66.4175 )
								if( smoothD_d <= 49.5272 )
									ret := -0.061224
								if( smoothD_d > 49.5272 )
									ret := 0.294505
					if( VIP > 0.984461 )
						if( rsi1 <= 53.2052 )
							if( smoothK_k <= 43.3068 )
								if( k <= 7.08 )
									ret := -0.305085
								if( k > 7.08 )
									ret := 0.133537
							if( smoothK_k > 43.3068 )
								if( d_k <= 7.20383 )
									ret := -0.193159
								if( d_k > 7.20383 )
									ret := 0.018018
						if( rsi1 > 53.2052 )
							if( VIM <= 0.96531 )
								if( k <= 27.6664 )
									ret := 0.374468
								if( k > 27.6664 )
									ret := 0.095164
							if( VIM > 0.96531 )
								if( d_k <= -5.70023 )
									ret := 0.431227
								if( d_k > -5.70023 )
									ret := 0.221889
				if( rsi1 > 58.7582 )
					if( rsi1 <= 62.0438 )
						if( VIP <= 1.01289 )
							if( rsi1 <= 62.0279 )
								if( k <= 57.0616 )
									ret := 0.700980 // buy
								if( k > 57.0616 )
									ret := 0.578571
							if( rsi1 > 62.0279 )
								ret := 0.000000
						if( VIP > 1.01289 )
							if( smoothK_k <= 13.7361 )
								if( smoothD_d <= 6.99973 )
									ret := 0.214286
								if( smoothD_d > 6.99973 )
									ret := -0.750000 // sell
							if( smoothK_k > 13.7361 )
								if( VIP <= 1.0618 )
									ret := 0.453552
								if( VIP > 1.0618 )
									ret := 0.219697
					if( rsi1 > 62.0438 )
						if( d_k <= -4.95301 )
							if( d <= 43.4844 )
								if( d_k <= -22.1104 )
									ret := 0.879397 // buy
								if( d_k > -22.1104 )
									ret := 0.730337 // buy
							if( d > 43.4844 )
								if( smoothK_k <= 73.5899 )
									ret := 0.635747
								if( smoothK_k > 73.5899 )
									ret := 0.852632 // buy
						if( d_k > -4.95301 )
							if( smoothK_k <= 15.9258 )
								ret := -0.750000 // sell
							if( smoothK_k > 15.9258 )
								if( VIM <= 0.997422 )
									ret := 0.584795
								if( VIM > 0.997422 )
									ret := 0.354839
			if( VIP_VIM > 0.143452 )
				if( rsi1 <= 60.8085 )
					if( VIM <= 0.86202 )
						if( smoothD_d <= 44.846 )
							if( VIP_VIM <= 0.419649 )
								if( d_k <= -0.345719 )
									ret := -0.363636
								if( d_k > -0.345719 )
									ret := -0.103896
							if( VIP_VIM > 0.419649 )
								if( smoothD_d <= -0.693087 )
									ret := 0.222222
								if( smoothD_d > -0.693087 )
									ret := -0.476122
						if( smoothD_d > 44.846 )
							if( rsi1 <= 53.6047 )
								if( d_k <= 6.63822 )
									ret := 0.153846
								if( d_k > 6.63822 )
									ret := -0.677778
							if( rsi1 > 53.6047 )
								if( VIP_VIM <= 0.315064 )
									ret := -0.314935
								if( VIP_VIM > 0.315064 )
									ret := -0.502781
					if( VIM > 0.86202 )
						if( rsi1 <= 53.8348 )
							if( smoothD_d <= 9.71278 )
								if( rsi1 <= 53.5117 )
									ret := 0.036866
								if( rsi1 > 53.5117 )
									ret := -0.642857
							if( smoothD_d > 9.71278 )
								if( d <= 88.9043 )
									ret := -0.334732
								if( d > 88.9043 )
									ret := 0.600000
						if( rsi1 > 53.8348 )
							if( VIP_VIM <= 0.176766 )
								if( smoothD_d <= 3.44719 )
									ret := -0.480000
								if( smoothD_d > 3.44719 )
									ret := 0.201869
							if( VIP_VIM > 0.176766 )
								if( k <= 26.3345 )
									ret := 0.117296
								if( k > 26.3345 )
									ret := -0.127016
				if( rsi1 > 60.8085 )
					if( VIM <= 0.799269 )
						if( rsi1 <= 68.7878 )
							if( VIM <= 0.744623 )
								if( smoothD_d <= 42.6827 )
									ret := -0.282392
								if( smoothD_d > 42.6827 )
									ret := -0.501040
							if( VIM > 0.744623 )
								if( k <= 33.646 )
									ret := 0.146758
								if( k > 33.646 )
									ret := -0.214286
						if( rsi1 > 68.7878 )
							if( VIP_VIM <= 0.584764 )
								if( rsi1 <= 72.3162 )
									ret := 0.176174
								if( rsi1 > 72.3162 )
									ret := 0.420424
							if( VIP_VIM > 0.584764 )
								if( d_k <= 8.28286 )
									ret := 0.125475
								if( d_k > 8.28286 )
									ret := -0.199495
					if( VIM > 0.799269 )
						if( VIP_VIM <= 0.321121 )
							if( rsi1 <= 70.2836 )
								if( rsi1 <= 62.2094 )
									ret := 0.190987
								if( rsi1 > 62.2094 )
									ret := 0.423806
							if( rsi1 > 70.2836 )
								if( VIP <= 1.17278 )
									ret := 0.768519 // buy
								if( VIP > 1.17278 )
									ret := 0.318182
						if( VIP_VIM > 0.321121 )
							if( d_k <= 3.25596 )
								if( smoothD_d <= 58.7012 )
									ret := 0.451444
								if( smoothD_d > 58.7012 )
									ret := 0.209184
							if( d_k > 3.25596 )
								if( smoothD_d <= 10.8666 )
									ret := 0.645161
								if( smoothD_d > 10.8666 )
									ret := 0.129577
		if( k > 78.5876 )
			if( rsi1 <= 67.5864 )
				if( VIM <= 0.891398 )
					if( VIP_VIM <= 0.319204 )
						if( rsi1 <= 56.7413 )
							if( smoothK_k <= 76.9211 )
								if( smoothK_k <= 76.2494 )
									ret := 0.200000
								if( smoothK_k > 76.2494 )
									ret := 0.500000
							if( smoothK_k > 76.9211 )
								if( d <= 87.8818 )
									ret := -0.333333
								if( d > 87.8818 )
									ret := -0.725806 // sell
						if( rsi1 > 56.7413 )
							if( VIP_VIM <= 0.225053 )
								if( k <= 79.861 )
									ret := -0.529412
								if( k > 79.861 )
									ret := 0.290476
							if( VIP_VIM > 0.225053 )
								if( VIP <= 1.1761 )
									ret := -0.019108
								if( VIP > 1.1761 )
									ret := 0.541667
					if( VIP_VIM > 0.319204 )
						if( d <= 99.6477 )
							if( VIM <= 0.857299 )
								if( smoothK_k <= 83.2485 )
									ret := -0.174051
								if( smoothK_k > 83.2485 )
									ret := -0.394161
							if( VIM > 0.857299 )
								if( VIP_VIM <= 0.322155 )
									ret := -0.500000
								if( VIP_VIM > 0.322155 )
									ret := 0.380952
						if( d > 99.6477 )
							ret := 1.000000 // buy
				if( VIM > 0.891398 )
					if( VIP <= 0.943818 )
						if( d_k <= -8.78702 )
							if( rsi1 <= 59.0787 )
								if( VIP_VIM <= -0.218549 )
									ret := 0.669863
								if( VIP_VIM > -0.218549 )
									ret := 0.470430
							if( rsi1 > 59.0787 )
								if( d_k <= -12.9968 )
									ret := 0.797619 // buy
								if( d_k > -12.9968 )
									ret := 0.596899
						if( d_k > -8.78702 )
							if( rsi1 <= 54.7536 )
								if( VIM <= 1.05041 )
									ret := 0.000000
								if( VIM > 1.05041 )
									ret := 0.416667
							if( rsi1 > 54.7536 )
								if( VIM <= 0.921258 )
									ret := -0.750000 // sell
								if( VIM > 0.921258 )
									ret := 0.543551
					if( VIP > 0.943818 )
						if( rsi1 <= 57.3896 )
							if( d <= 81.6322 )
								if( d_k <= -13.1056 )
									ret := -0.033898
								if( d_k > -13.1056 )
									ret := 0.401146
							if( d > 81.6322 )
								if( VIP_VIM <= 0.039742 )
									ret := 0.095137
								if( VIP_VIM > 0.039742 )
									ret := -0.141935
						if( rsi1 > 57.3896 )
							if( VIP_VIM <= 0.097971 )
								if( rsi1 <= 63.0636 )
									ret := 0.447592
								if( rsi1 > 63.0636 )
									ret := 0.601810
							if( VIP_VIM > 0.097971 )
								if( rsi1 <= 61.7193 )
									ret := 0.197417
								if( rsi1 > 61.7193 )
									ret := 0.397550
			if( rsi1 > 67.5864 )
				if( VIP_VIM <= 0.327093 )
					if( d_k <= -11.4326 )
						if( VIP_VIM <= 0.254975 )
							if( k <= 79.0938 )
								ret := 0.000000
							if( k > 79.0938 )
								if( VIM <= 1.1537 )
									ret := 0.846567 // buy
								if( VIM > 1.1537 )
									ret := 0.548387
						if( VIP_VIM > 0.254975 )
							if( rsi1 <= 73.3976 )
								if( smoothD_d <= 77.4399 )
									ret := 0.233333
								if( smoothD_d > 77.4399 )
									ret := -0.833333 // sell
							if( rsi1 > 73.3976 )
								if( d <= 70.1393 )
									ret := 0.466667
								if( d > 70.1393 )
									ret := 0.840909 // buy
					if( d_k > -11.4326 )
						if( rsi1 <= 73.6384 )
							if( VIP <= 1.11039 )
								if( VIM <= 0.863237 )
									ret := 0.358696
								if( VIM > 0.863237 )
									ret := 0.651831
							if( VIP > 1.11039 )
								if( smoothD_d <= 95.7913 )
									ret := 0.462158
								if( smoothD_d > 95.7913 )
									ret := 0.000000
						if( rsi1 > 73.6384 )
							if( k <= 99.5231 )
								if( d_k <= 3.22538 )
									ret := 0.679780
								if( d_k > 3.22538 )
									ret := 0.786070 // buy
							if( k > 99.5231 )
								if( VIM <= 0.982443 )
									ret := 0.858364 // buy
								if( VIM > 0.982443 )
									ret := 0.724551 // buy
				if( VIP_VIM > 0.327093 )
					if( rsi1 <= 76.6697 )
						if( smoothK_k <= 93.3406 )
							if( VIP_VIM <= 0.442056 )
								if( rsi1 <= 74.5602 )
									ret := 0.326501
								if( rsi1 > 74.5602 )
									ret := 0.580488
							if( VIP_VIM > 0.442056 )
								if( VIM <= 0.692099 )
									ret := -0.129496
								if( VIM > 0.692099 )
									ret := 0.161616
						if( smoothK_k > 93.3406 )
							if( smoothD_d <= 80.7208 )
								if( d_k <= -20.6163 )
									ret := -0.750000 // sell
								if( d_k > -20.6163 )
									ret := -1.000000 // sell
							if( smoothD_d > 80.7208 )
								if( smoothD_d <= 94.7728 )
									ret := 0.124138
								if( smoothD_d > 94.7728 )
									ret := -0.210526
					if( rsi1 > 76.6697 )
						if( VIP <= 1.2833 )
							if( rsi1 <= 84.2647 )
								if( VIP_VIM <= 0.503608 )
									ret := 0.650916
								if( VIP_VIM > 0.503608 )
									ret := 0.355030
							if( rsi1 > 84.2647 )
								if( rsi1 <= 89.7921 )
									ret := 0.844784 // buy
								if( rsi1 > 89.7921 )
									ret := 0.949686 // buy
						if( VIP > 1.2833 )
							if( rsi1 <= 84.8019 )
								if( VIM <= 0.663491 )
									ret := -0.025105
								if( VIM > 0.663491 )
									ret := 0.359447
							if( rsi1 > 84.8019 )
								if( VIP <= 1.36406 )
									ret := 0.754513 // buy
								if( VIP > 1.36406 )
									ret := 0.218182
	
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
float op_operation = decision_tree_0_SOLUSDT_30Min_39fd6def(d_k, d, rsi1, k, smoothD_d, smoothK_k, VIP_VIM, VIM, VIP)

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


