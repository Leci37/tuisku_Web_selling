//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: DOGEUSDT_15Min_2ST0_537ae22b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOGEUSDT_15Min_2ST0_537ae22b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOGEUSDT_15Min_537ae22b(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( smoothK_k <= 33.6065 )
		if( tema <= 0.089678 )
			if( ema12 <= -0.00025 )
				if( d_k <= -1.15517 )
					if( rsi1 <= 33.4056 )
						if( ema13 <= -0.001179 )
							if( ema2 <= 0.062306 )
								if( rsi1 <= 23.6745 )
									ret := 0.560000
								if( rsi1 > 23.6745 )
									ret := 0.900000 // buy
							if( ema2 > 0.062306 )
								if( ema12 <= -0.001292 )
									ret := 0.490566
								if( ema12 > -0.001292 )
									ret := -0.044068
						if( ema13 > -0.001179 )
							if( rsi1 <= 22.3921 )
								if( ema1 <= 0.073478 )
									ret := -0.265060
								if( ema1 > 0.073478 )
									ret := -0.800000 // sell
							if( rsi1 > 22.3921 )
								if( ema2 <= 0.083871 )
									ret := -0.089922
								if( ema2 > 0.083871 )
									ret := -0.401130
					if( rsi1 > 33.4056 )
						if( d_k <= -1.8094 )
							if( ema1 <= 0.057385 )
								ret := -0.833333 // sell
							if( ema1 > 0.057385 )
								if( k <= 20.105 )
									ret := 0.106280
								if( k > 20.105 )
									ret := 0.348083
						if( d_k > -1.8094 )
							if( ema12 <= -0.000308 )
								if( smoothD_d <= 16.8642 )
									ret := -0.850000 // sell
								if( smoothD_d > 16.8642 )
									ret := -0.333333
							if( ema12 > -0.000308 )
								if( ema2 <= 0.072577 )
									ret := 1.000000 // buy
								if( ema2 > 0.072577 )
									ret := -0.166667
				if( d_k > -1.15517 )
					if( ema12 <= -0.001471 )
						if( d <= 0.573484 )
							ret := -0.571429
						if( d > 0.573484 )
							if( smoothK_k <= 4.77355 )
								if( rsi1 <= 25.19 )
									ret := 1.000000 // buy
								if( rsi1 > 25.19 )
									ret := 0.642857
							if( smoothK_k > 4.77355 )
								if( rsi1 <= 32.2465 )
									ret := 0.709677 // buy
								if( rsi1 > 32.2465 )
									ret := -0.333333
					if( ema12 > -0.001471 )
						if( rsi1 <= 17.0523 )
							if( ema1 <= 0.067779 )
								if( d_k <= 4.76319 )
									ret := 0.427083
								if( d_k > 4.76319 )
									ret := -0.642857
							if( ema1 > 0.067779 )
								if( ema12 <= -0.00064 )
									ret := -0.022989
								if( ema12 > -0.00064 )
									ret := -0.479381
						if( rsi1 > 17.0523 )
							if( ema1 <= 0.056636 )
								if( smoothD_d <= 9.96767 )
									ret := 0.130435
								if( smoothD_d > 9.96767 )
									ret := -0.954545 // sell
							if( ema1 > 0.056636 )
								if( ema12 <= -0.000518 )
									ret := 0.377070
								if( ema12 > -0.000518 )
									ret := 0.187382
			if( ema12 > -0.00025 )
				if( rsi1 <= 35.4568 )
					if( ema2 <= 0.067595 )
						if( ema1 <= 0.061234 )
							if( rsi1 <= 12.5949 )
								if( ema12 <= -0.000144 )
									ret := -1.000000 // sell
								if( ema12 > -0.000144 )
									ret := -0.250000
							if( rsi1 > 12.5949 )
								if( k <= 0.095872 )
									ret := 0.267857
								if( k > 0.095872 )
									ret := 0.000000
						if( ema1 > 0.061234 )
							if( ema12 <= -4.8e-05 )
								if( rsi1 <= 22.9129 )
									ret := -0.464286
								if( rsi1 > 22.9129 )
									ret := -0.071429
							if( ema12 > -4.8e-05 )
								if( ema3 <= 0.064549 )
									ret := -0.240816
								if( ema3 > 0.064549 )
									ret := -0.619565
					if( ema2 > 0.067595 )
						if( rsi1 <= 22.1889 )
							if( tema <= 0.083344 )
								if( d_k <= -1.04685 )
									ret := -0.827957 // sell
								if( d_k > -1.04685 )
									ret := -0.612994
							if( tema > 0.083344 )
								if( ema3 <= 0.088383 )
									ret := -0.982143 // sell
								if( ema3 > 0.088383 )
									ret := -0.705882 // sell
						if( rsi1 > 22.1889 )
							if( ema12 <= 1.9e-05 )
								if( ema12 <= -0.000134 )
									ret := -0.207495
								if( ema12 > -0.000134 )
									ret := -0.430481
							if( ema12 > 1.9e-05 )
								if( ema12 <= 3.6e-05 )
									ret := -0.618421
								if( ema12 > 3.6e-05 )
									ret := -0.789318 // sell
				if( rsi1 > 35.4568 )
					if( ema12 <= 0.0001 )
						if( rsi1 <= 46.6745 )
							if( ema12 <= -8e-06 )
								if( d_k <= -0.817837 )
									ret := -0.084661
								if( d_k > -0.817837 )
									ret := 0.076329
							if( ema12 > -8e-06 )
								if( ema2 <= 0.06585 )
									ret := -0.100719
								if( ema2 > 0.06585 )
									ret := -0.254331
						if( rsi1 > 46.6745 )
							if( ema13 <= 0.00028 )
								if( ema12 <= -4e-05 )
									ret := 0.217647
								if( ema12 > -4e-05 )
									ret := 0.061523
							if( ema13 > 0.00028 )
								if( tema <= 0.066773 )
									ret := -0.040000
								if( tema > 0.066773 )
									ret := 0.449664
					if( ema12 > 0.0001 )
						if( smoothD_d <= 6.73142 )
							if( rsi1 <= 47.7243 )
								if( ema12 <= 0.000133 )
									ret := -0.469027
								if( ema12 > 0.000133 )
									ret := -0.750000 // sell
							if( rsi1 > 47.7243 )
								if( ema12 <= 0.000287 )
									ret := -0.022173
								if( ema12 > 0.000287 )
									ret := -0.395349
						if( smoothD_d > 6.73142 )
							if( rsi1 <= 55.2889 )
								if( ema12 <= 0.000205 )
									ret := -0.230110
								if( ema12 > 0.000205 )
									ret := -0.468889
							if( rsi1 > 55.2889 )
								if( ema12 <= 0.000258 )
									ret := 0.113490
								if( ema12 > 0.000258 )
									ret := -0.059829
		if( tema > 0.089678 )
			if( smoothD_d <= 4.907 )
				if( ema12 <= -0.001152 )
					if( ema3 <= 0.141221 )
						if( smoothK_k <= 1.35205 )
							if( rsi1 <= 11.0618 )
								ret := -0.833333 // sell
							if( rsi1 > 11.0618 )
								if( d_k <= -2.39927 )
									ret := -1.000000 // sell
								if( d_k > -2.39927 )
									ret := 0.641509
						if( smoothK_k > 1.35205 )
							if( rsi1 <= 36.2327 )
								if( smoothK_k <= 4.04083 )
									ret := -0.125000
								if( smoothK_k > 4.04083 )
									ret := -0.679245
							if( rsi1 > 36.2327 )
								if( ema13 <= -0.001804 )
									ret := 1.000000 // buy
								if( ema13 > -0.001804 )
									ret := 0.000000
					if( ema3 > 0.141221 )
						if( rsi1 <= 29.8767 )
							if( smoothK_k <= 3.64248 )
								if( smoothD_d <= 0.16427 )
									ret := -0.877193 // sell
								if( smoothD_d > 0.16427 )
									ret := 0.041667
							if( smoothK_k > 3.64248 )
								if( ema12 <= -0.001312 )
									ret := -0.982759 // sell
								if( ema12 > -0.001312 )
									ret := -0.750000 // sell
						if( rsi1 > 29.8767 )
							if( tema <= 0.148448 )
								ret := -0.571429
							if( tema > 0.148448 )
								if( smoothK_k <= 0.481171 )
									ret := 1.000000 // buy
								if( smoothK_k > 0.481171 )
									ret := 0.142857
				if( ema12 > -0.001152 )
					if( rsi1 <= 32.8352 )
						if( ema12 <= -0.000631 )
							if( ema3 <= 0.151388 )
								if( rsi1 <= 21.3361 )
									ret := -0.722222 // sell
								if( rsi1 > 21.3361 )
									ret := -0.089888
							if( ema3 > 0.151388 )
								if( rsi1 <= 23.657 )
									ret := -0.933333 // sell
								if( rsi1 > 23.657 )
									ret := -0.631579
						if( ema12 > -0.000631 )
							if( ema12 <= -4.5e-05 )
								if( rsi1 <= 23.7499 )
									ret := -0.844156 // sell
								if( rsi1 > 23.7499 )
									ret := -0.588313
							if( ema12 > -4.5e-05 )
								if( rsi1 <= 26.5635 )
									ret := -0.951965 // sell
								if( rsi1 > 26.5635 )
									ret := -0.823729 // sell
					if( rsi1 > 32.8352 )
						if( ema12 <= -1.3e-05 )
							if( rsi1 <= 41.4918 )
								if( ema12 <= -0.000502 )
									ret := 0.174419
								if( ema12 > -0.000502 )
									ret := -0.344168
							if( rsi1 > 41.4918 )
								if( smoothK_k <= 0.027704 )
									ret := 0.500000
								if( smoothK_k > 0.027704 )
									ret := 0.026316
						if( ema12 > -1.3e-05 )
							if( rsi1 <= 48.3258 )
								if( ema12 <= 0.000283 )
									ret := -0.555008
								if( ema12 > 0.000283 )
									ret := -0.770878 // sell
							if( rsi1 > 48.3258 )
								if( rsi1 <= 56.8932 )
									ret := -0.328918
								if( rsi1 > 56.8932 )
									ret := 0.068182
			if( smoothD_d > 4.907 )
				if( ema12 <= -0.000763 )
					if( smoothD_d <= 40.6979 )
						if( rsi1 <= 29.2881 )
							if( tema <= 0.103852 )
								if( d_k <= -8.57215 )
									ret := -0.625000
								if( d_k > -8.57215 )
									ret := 0.529412
							if( tema > 0.103852 )
								if( d_k <= -7.95379 )
									ret := -0.732673 // sell
								if( d_k > -7.95379 )
									ret := -0.130769
						if( rsi1 > 29.2881 )
							if( ema12 <= -0.001121 )
								if( d_k <= -11.195 )
									ret := -0.078947
								if( d_k > -11.195 )
									ret := 0.475000
							if( ema12 > -0.001121 )
								if( ema13 <= -0.00142 )
									ret := -0.122699
								if( ema13 > -0.00142 )
									ret := 0.413043
					if( smoothD_d > 40.6979 )
						if( k <= 22.761 )
							ret := 0.000000
						if( k > 22.761 )
							if( ema3 <= 0.197829 )
								ret := -1.000000 // sell
							if( ema3 > 0.197829 )
								ret := -0.750000 // sell
				if( ema12 > -0.000763 )
					if( rsi1 <= 42.6791 )
						if( ema12 <= -0.000163 )
							if( rsi1 <= 30.0514 )
								if( rsi1 <= 24.3683 )
									ret := -0.757812 // sell
								if( rsi1 > 24.3683 )
									ret := -0.424837
							if( rsi1 > 30.0514 )
								if( d_k <= -5.14582 )
									ret := -0.460744
								if( d_k > -5.14582 )
									ret := -0.059764
						if( ema12 > -0.000163 )
							if( rsi1 <= 37.2806 )
								if( ema12 <= -4e-05 )
									ret := -0.652991
								if( ema12 > -4e-05 )
									ret := -0.836314 // sell
							if( rsi1 > 37.2806 )
								if( ema12 <= 0.000108 )
									ret := -0.420000
								if( ema12 > 0.000108 )
									ret := -0.776524 // sell
					if( rsi1 > 42.6791 )
						if( ema13 <= 0.000306 )
							if( d_k <= -9.79591 )
								if( rsi1 <= 52.0638 )
									ret := -0.386364
								if( rsi1 > 52.0638 )
									ret := 0.387097
							if( d_k > -9.79591 )
								if( ema12 <= 1.1e-05 )
									ret := 0.250444
								if( ema12 > 1.1e-05 )
									ret := -0.117073
						if( ema13 > 0.000306 )
							if( rsi1 <= 51.469 )
								if( ema13 <= 0.000676 )
									ret := -0.315712
								if( ema13 > 0.000676 )
									ret := -0.568536
							if( rsi1 > 51.469 )
								if( ema12 <= 0.00039 )
									ret := 0.165591
								if( ema12 > 0.00039 )
									ret := -0.169211
	if( smoothK_k > 33.6065 )
		if( smoothK_k <= 80.2175 )
			if( ema12 <= -0.000235 )
				if( rsi1 <= 42.3322 )
					if( rsi1 <= 33.5515 )
						if( tema <= 0.080977 )
							if( smoothD_d <= 42.7946 )
								if( ema12 <= -0.000893 )
									ret := 0.557692
								if( ema12 > -0.000893 )
									ret := -0.118881
							if( smoothD_d > 42.7946 )
								if( d_k <= -3.83743 )
									ret := 0.042857
								if( d_k > -3.83743 )
									ret := 0.438931
						if( tema > 0.080977 )
							if( smoothD_d <= 26.8432 )
								if( rsi1 <= 25.3304 )
									ret := -0.857143 // sell
								if( rsi1 > 25.3304 )
									ret := -0.557377
							if( smoothD_d > 26.8432 )
								if( d <= 57.8288 )
									ret := 0.000000
								if( d > 57.8288 )
									ret := -0.371758
					if( rsi1 > 33.5515 )
						if( ema1 <= 0.116997 )
							if( ema12 <= -0.000423 )
								if( d <= 26.0984 )
									ret := -0.241379
								if( d > 26.0984 )
									ret := 0.478202
							if( ema12 > -0.000423 )
								if( smoothK_k <= 78.3473 )
									ret := 0.159091
								if( smoothK_k > 78.3473 )
									ret := -0.750000 // sell
						if( ema1 > 0.116997 )
							if( ema12 <= -0.000777 )
								if( ema13 <= -0.007074 )
									ret := -0.538462
								if( ema13 > -0.007074 )
									ret := 0.410095
							if( ema12 > -0.000777 )
								if( ema3 <= 0.14541 )
									ret := -0.107143
								if( ema3 > 0.14541 )
									ret := -0.377049
				if( rsi1 > 42.3322 )
					if( d_k <= -31.5755 )
						if( rsi1 <= 49.188 )
							ret := -0.750000 // sell
						if( rsi1 > 49.188 )
							ret := -1.000000 // sell
					if( d_k > -31.5755 )
						if( ema12 <= -0.00061 )
							if( smoothD_d <= 86.3301 )
								if( tema <= 0.158569 )
									ret := 0.823383 // buy
								if( tema > 0.158569 )
									ret := 0.583851
							if( smoothD_d > 86.3301 )
								ret := -0.714286 // sell
						if( ema12 > -0.00061 )
							if( ema13 <= -0.000938 )
								if( ema12 <= -0.000427 )
									ret := 0.315152
								if( ema12 > -0.000427 )
									ret := -0.190476
							if( ema13 > -0.000938 )
								if( ema13 <= -0.000523 )
									ret := 0.482635
								if( ema13 > -0.000523 )
									ret := 0.692449
			if( ema12 > -0.000235 )
				if( d <= 72.8104 )
					if( rsi1 <= 49.6365 )
						if( tema <= 0.088588 )
							if( rsi1 <= 44.5895 )
								if( ema12 <= -1.6e-05 )
									ret := -0.048653
								if( ema12 > -1.6e-05 )
									ret := -0.266491
							if( rsi1 > 44.5895 )
								if( ema3 <= 0.077511 )
									ret := 0.081372
								if( ema3 > 0.077511 )
									ret := -0.031746
						if( tema > 0.088588 )
							if( ema12 <= 5.9e-05 )
								if( rsi1 <= 43.3754 )
									ret := -0.467766
								if( rsi1 > 43.3754 )
									ret := -0.106299
							if( ema12 > 5.9e-05 )
								if( d_k <= -17.7942 )
									ret := 0.333333
								if( d_k > -17.7942 )
									ret := -0.682692
					if( rsi1 > 49.6365 )
						if( ema13 <= 0.00024 )
							if( ema12 <= -2.5e-05 )
								if( rsi1 <= 54.8626 )
									ret := 0.263553
								if( rsi1 > 54.8626 )
									ret := 0.597105
							if( ema12 > -2.5e-05 )
								if( ema12 <= 0.000109 )
									ret := 0.122924
								if( ema12 > 0.000109 )
									ret := -0.087515
						if( ema13 > 0.00024 )
							if( ema12 <= 0.000186 )
								if( ema3 <= 0.088516 )
									ret := 0.115054
								if( ema3 > 0.088516 )
									ret := 0.491525
							if( ema12 > 0.000186 )
								if( ema1 <= 0.10726 )
									ret := -0.099144
								if( ema1 > 0.10726 )
									ret := 0.107907
				if( d > 72.8104 )
					if( rsi1 <= 62.4449 )
						if( ema12 <= 0.000301 )
							if( rsi1 <= 47.1736 )
								if( smoothD_d <= 71.9633 )
									ret := 0.139037
								if( smoothD_d > 71.9633 )
									ret := -0.165984
							if( rsi1 > 47.1736 )
								if( ema12 <= -3.7e-05 )
									ret := 0.367668
								if( ema12 > -3.7e-05 )
									ret := 0.145418
						if( ema12 > 0.000301 )
							if( ema3 <= 0.132427 )
								if( ema3 <= 0.084129 )
									ret := -0.022059
								if( ema3 > 0.084129 )
									ret := -0.382445
							if( ema3 > 0.132427 )
								if( ema13 <= 0.000379 )
									ret := -0.666667
								if( ema13 > 0.000379 )
									ret := 0.208791
					if( rsi1 > 62.4449 )
						if( ema3 <= 0.090984 )
							if( ema13 <= 0.00234 )
								if( d_k <= 10.0677 )
									ret := 0.160510
								if( d_k > 10.0677 )
									ret := 0.471954
							if( ema13 > 0.00234 )
								if( rsi1 <= 69.7757 )
									ret := 0.333333
								if( rsi1 > 69.7757 )
									ret := -0.744186 // sell
						if( ema3 > 0.090984 )
							if( smoothD_d <= 78.7586 )
								if( ema12 <= 0.000751 )
									ret := 0.488656
								if( ema12 > 0.000751 )
									ret := 0.111111
							if( smoothD_d > 78.7586 )
								if( k <= 78.3669 )
									ret := 0.757764 // buy
								if( k > 78.3669 )
									ret := 0.487805
		if( smoothK_k > 80.2175 )
			if( ema1 <= 0.092997 )
				if( rsi1 <= 71.4755 )
					if( ema12 <= -0.000121 )
						if( rsi1 <= 45.2178 )
							if( ema12 <= -0.000347 )
								if( rsi1 <= 35.7827 )
									ret := 0.097222
								if( rsi1 > 35.7827 )
									ret := 0.562937
							if( ema12 > -0.000347 )
								if( ema13 <= -0.000875 )
									ret := -0.722222 // sell
								if( ema13 > -0.000875 )
									ret := 0.107330
						if( rsi1 > 45.2178 )
							if( ema12 <= -0.000186 )
								if( ema3 <= 0.093754 )
									ret := 0.626374
								if( ema3 > 0.093754 )
									ret := -0.416667
							if( ema12 > -0.000186 )
								if( rsi1 <= 56.0461 )
									ret := 0.346032
								if( rsi1 > 56.0461 )
									ret := 0.619289
					if( ema12 > -0.000121 )
						if( ema12 <= 0.000199 )
							if( rsi1 <= 62.255 )
								if( d <= 76.3132 )
									ret := -0.046843
								if( d > 76.3132 )
									ret := 0.128609
							if( rsi1 > 62.255 )
								if( ema3 <= 0.065724 )
									ret := 0.067511
								if( ema3 > 0.065724 )
									ret := 0.331420
						if( ema12 > 0.000199 )
							if( smoothK_k <= 92.505 )
								if( rsi1 <= 63.7041 )
									ret := -0.131148
								if( rsi1 > 63.7041 )
									ret := 0.205696
							if( smoothK_k > 92.505 )
								if( k <= 99.9741 )
									ret := -0.275000
								if( k > 99.9741 )
									ret := 0.202020
				if( rsi1 > 71.4755 )
					if( ema12 <= 0.000361 )
						if( ema2 <= 0.062416 )
							if( rsi1 <= 86.8523 )
								if( ema12 <= -5e-06 )
									ret := 0.555556
								if( ema12 > -5e-06 )
									ret := 0.105263
							if( rsi1 > 86.8523 )
								if( ema2 <= 0.059845 )
									ret := 0.000000
								if( ema2 > 0.059845 )
									ret := 0.642857
						if( ema2 > 0.062416 )
							if( rsi1 <= 78.0235 )
								if( ema12 <= 2.1e-05 )
									ret := 0.696850
								if( ema12 > 2.1e-05 )
									ret := 0.404272
							if( rsi1 > 78.0235 )
								if( ema13 <= 0.000529 )
									ret := 0.668979
								if( ema13 > 0.000529 )
									ret := 0.375000
					if( ema12 > 0.000361 )
						if( smoothK_k <= 88.9635 )
							if( smoothD_d <= 90.777 )
								if( smoothD_d <= 88.8725 )
									ret := 0.314286
								if( smoothD_d > 88.8725 )
									ret := -0.208333
							if( smoothD_d > 90.777 )
								if( ema2 <= 0.088902 )
									ret := 0.802326 // buy
								if( ema2 > 0.088902 )
									ret := 0.142857
						if( smoothK_k > 88.9635 )
							if( rsi1 <= 78.6739 )
								if( d_k <= 3.45323 )
									ret := -0.085714
								if( d_k > 3.45323 )
									ret := -0.863636 // sell
							if( rsi1 > 78.6739 )
								if( ema12 <= 0.001195 )
									ret := 0.240602
								if( ema12 > 0.001195 )
									ret := -0.229167
			if( ema1 > 0.092997 )
				if( rsi1 <= 59.0689 )
					if( ema13 <= -0.000969 )
						if( rsi1 <= 35.0235 )
							if( ema12 <= -0.002021 )
								if( smoothK_k <= 92.7633 )
									ret := 0.928571 // buy
								if( smoothK_k > 92.7633 )
									ret := -0.200000
							if( ema12 > -0.002021 )
								if( smoothK_k <= 88.1472 )
									ret := -0.054054
								if( smoothK_k > 88.1472 )
									ret := -0.828571 // sell
						if( rsi1 > 35.0235 )
							if( ema12 <= -0.00046 )
								if( rsi1 <= 48.0075 )
									ret := 0.564706
								if( rsi1 > 48.0075 )
									ret := 0.808349 // buy
							if( ema12 > -0.00046 )
								if( ema13 <= -0.001457 )
									ret := -0.705882 // sell
								if( ema13 > -0.001457 )
									ret := 0.141593
					if( ema13 > -0.000969 )
						if( ema13 <= 4.1e-05 )
							if( rsi1 <= 53.0594 )
								if( ema12 <= -0.00018 )
									ret := 0.255515
								if( ema12 > -0.00018 )
									ret := -0.199482
							if( rsi1 > 53.0594 )
								if( ema12 <= -8.2e-05 )
									ret := 0.535714
								if( ema12 > -8.2e-05 )
									ret := 0.153355
						if( ema13 > 4.1e-05 )
							if( ema12 <= 9.5e-05 )
								if( rsi1 <= 55.5701 )
									ret := -0.142857
								if( rsi1 > 55.5701 )
									ret := 0.553191
							if( ema12 > 9.5e-05 )
								if( smoothD_d <= 82.2773 )
									ret := -0.597701
								if( smoothD_d > 82.2773 )
									ret := 0.000000
				if( rsi1 > 59.0689 )
					if( ema12 <= 7e-05 )
						if( d <= 98.6028 )
							if( ema12 <= -0.000277 )
								if( ema13 <= -0.002625 )
									ret := 0.608696
								if( ema13 > -0.002625 )
									ret := 0.911290 // buy
							if( ema12 > -0.000277 )
								if( rsi1 <= 69.1759 )
									ret := 0.670498
								if( rsi1 > 69.1759 )
									ret := 0.846361 // buy
						if( d > 98.6028 )
							if( k <= 99.3806 )
								if( k <= 97.1088 )
									ret := 0.916667 // buy
								if( k > 97.1088 )
									ret := 0.993103 // buy
							if( k > 99.3806 )
								if( smoothK_k <= 96.729 )
									ret := 0.461538
								if( smoothK_k > 96.729 )
									ret := 0.906810 // buy
					if( ema12 > 7e-05 )
						if( rsi1 <= 74.5835 )
							if( ema13 <= 0.001199 )
								if( ema12 <= 0.000546 )
									ret := 0.444444
								if( ema12 > 0.000546 )
									ret := 0.114094
							if( ema13 > 0.001199 )
								if( d <= 84.9754 )
									ret := -0.310680
								if( d > 84.9754 )
									ret := 0.230453
						if( rsi1 > 74.5835 )
							if( ema13 <= 0.00143 )
								if( rsi1 <= 77.3968 )
									ret := 0.707317 // buy
								if( rsi1 > 77.3968 )
									ret := 0.834931 // buy
							if( ema13 > 0.00143 )
								if( ema3 <= 0.104753 )
									ret := 0.086207
								if( ema3 > 0.104753 )
									ret := 0.667500
	
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
float op_operation = decision_tree_0_DOGEUSDT_15Min_537ae22b(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)

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


