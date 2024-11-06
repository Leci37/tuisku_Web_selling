//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: META_1Min_2BS0_e436ca5e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_META_1Min_2BS0_e436ca5e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_META_1Min_e436ca5e(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( bbp <= -2.05729 )
		if( bbm <= 0.578403 )
			if( d <= 23.9847 )
				if( bbp <= -3.96306 )
					if( d <= 0.031502 )
						if( rsi1 <= 10.9037 )
							ret := 1.000000 // buy
						if( rsi1 > 10.9037 )
							ret := 0.937500 // buy
					if( d > 0.031502 )
						if( smoothD_d <= -1.91362 )
							if( k <= 0.038682 )
								ret := 0.647059
							if( k > 0.038682 )
								ret := 0.000000
						if( smoothD_d > -1.91362 )
							if( bullPower <= -2.39633 )
								if( rsi1 <= 13.7821 )
									ret := 1.000000 // buy
								if( rsi1 > 13.7821 )
									ret := 0.379310
							if( bullPower > -2.39633 )
								if( smoothK_k <= 2.81301 )
									ret := 0.764706 // buy
								if( smoothK_k > 2.81301 )
									ret := 1.000000 // buy
				if( bbp > -3.96306 )
					if( d <= 0.717128 )
						if( k <= 0.243377 )
							if( k <= 0.124649 )
								if( bullPower <= -1.58383 )
									ret := -0.538462
								if( bullPower > -1.58383 )
									ret := 0.270833
							if( k > 0.124649 )
								ret := 0.500000
						if( k > 0.243377 )
							if( bearPower <= -1.71897 )
								ret := 0.200000
							if( bearPower > -1.71897 )
								if( d_k <= -0.164818 )
									ret := -0.380952
								if( d_k > -0.164818 )
									ret := -0.760000 // sell
					if( d > 0.717128 )
						if( k <= 2.9788 )
							if( k <= 2.20538 )
								if( rsi1 <= 24.4428 )
									ret := 0.354497
								if( rsi1 > 24.4428 )
									ret := 0.789474 // buy
							if( k > 2.20538 )
								if( d <= 2.04122 )
									ret := 1.000000 // buy
								if( d > 2.04122 )
									ret := 0.869565 // buy
						if( k > 2.9788 )
							if( k <= 11.4506 )
								if( smoothD_d <= -0.427376 )
									ret := 0.702703 // buy
								if( smoothD_d > -0.427376 )
									ret := 0.045872
							if( k > 11.4506 )
								if( d <= 6.88628 )
									ret := 1.000000 // buy
								if( d > 6.88628 )
									ret := 0.456140
			if( d > 23.9847 )
				if( d_k <= 16.2833 )
					if( smoothD_d <= 25.0709 )
						if( bbm <= 0.112705 )
							if( bearPower <= -1.26577 )
								ret := -0.950000 // sell
							if( bearPower > -1.26577 )
								ret := 0.000000
						if( bbm > 0.112705 )
							if( bullPower <= -1.08235 )
								ret := 0.500000
							if( bullPower > -1.08235 )
								ret := -0.066667
					if( smoothD_d > 25.0709 )
						if( rsi1 <= 17.9622 )
							ret := -0.388889
						if( rsi1 > 17.9622 )
							if( bbp <= -3.82889 )
								if( smoothK_k <= 35.6561 )
									ret := 0.909091 // buy
								if( smoothK_k > 35.6561 )
									ret := 0.846154 // buy
							if( bbp > -3.82889 )
								if( bbp <= -3.22558 )
									ret := -0.206897
								if( bbp > -3.22558 )
									ret := 0.441341
				if( d_k > 16.2833 )
					if( rsi1 <= 38.7128 )
						if( bbp <= -3.21074 )
							if( bbp <= -4.95564 )
								ret := -0.454545
							if( bbp > -4.95564 )
								if( rsi1 <= 28.9736 )
									ret := -1.000000 // sell
								if( rsi1 > 28.9736 )
									ret := -0.777778 // sell
						if( bbp > -3.21074 )
							if( bbp <= -2.15551 )
								if( bbp <= -2.61923 )
									ret := 0.235294
								if( bbp > -2.61923 )
									ret := -0.394737
							if( bbp > -2.15551 )
								ret := 0.615385
					if( rsi1 > 38.7128 )
						ret := 0.550000
		if( bbm > 0.578403 )
			if( d_k <= -7.33861 )
				if( smoothK_k <= 33.8302 )
					if( bearPower <= -2.39667 )
						if( bullPower <= -0.676907 )
							if( bbm <= 1.09023 )
								ret := 0.000000
							if( bbm > 1.09023 )
								if( smoothK_k <= 16.4077 )
									ret := -1.000000 // sell
								if( smoothK_k > 16.4077 )
									ret := -0.400000
						if( bullPower > -0.676907 )
							ret := 0.153846
					if( bearPower > -2.39667 )
						if( rsi1 <= 39.657 )
							if( rsi1 <= 25.0707 )
								if( d_k <= -8.01046 )
									ret := -0.983051 // sell
								if( d_k > -8.01046 )
									ret := -0.700000 // sell
							if( rsi1 > 25.0707 )
								if( d_k <= -10.9145 )
									ret := -0.277778
								if( d_k > -10.9145 )
									ret := -0.800000 // sell
						if( rsi1 > 39.657 )
							ret := 0.153846
				if( smoothK_k > 33.8302 )
					if( d_k <= -19.1593 )
						if( smoothK_k <= 69.4906 )
							if( smoothD_d <= 35.8904 )
								ret := -0.571429
							if( smoothD_d > 35.8904 )
								ret := -1.000000 // sell
						if( smoothK_k > 69.4906 )
							if( bearPower <= -1.79936 )
								ret := 0.090909
							if( bearPower > -1.79936 )
								ret := -0.500000
					if( d_k > -19.1593 )
						if( bullPower <= -0.929161 )
							if( smoothK_k <= 48.3151 )
								if( d_k <= -13.1989 )
									ret := 0.888889 // buy
								if( d_k > -13.1989 )
									ret := 1.000000 // buy
							if( smoothK_k > 48.3151 )
								if( bbp <= -3.32955 )
									ret := 0.083333
								if( bbp > -3.32955 )
									ret := 0.714286 // buy
						if( bullPower > -0.929161 )
							if( bbm <= 1.74433 )
								if( rsi1 <= 37.0687 )
									ret := 0.021053
								if( rsi1 > 37.0687 )
									ret := 0.846154 // buy
							if( bbm > 1.74433 )
								if( bearPower <= -3.11547 )
									ret := 0.600000
								if( bearPower > -3.11547 )
									ret := -0.884615 // sell
			if( d_k > -7.33861 )
				if( smoothD_d <= 67.2139 )
					if( smoothD_d <= -2.74602 )
						if( bullPower <= -0.775052 )
							if( rsi1 <= 4.53131 )
								ret := -0.307692
							if( rsi1 > 4.53131 )
								if( bearPower <= -2.21327 )
									ret := 0.786408 // buy
								if( bearPower > -2.21327 )
									ret := 0.367347
						if( bullPower > -0.775052 )
							if( rsi1 <= 16.5007 )
								ret := 1.000000 // buy
							if( rsi1 > 16.5007 )
								if( bbm <= 0.9177 )
									ret := -1.000000 // sell
								if( bbm > 0.9177 )
									ret := 0.142857
					if( smoothD_d > -2.74602 )
						if( bearPower <= -3.71843 )
							if( rsi1 <= 25.2874 )
								if( bullPower <= -11.6051 )
									ret := 0.692308
								if( bullPower > -11.6051 )
									ret := -0.500000
							if( rsi1 > 25.2874 )
								if( d_k <= -1.44431 )
									ret := 0.951220 // buy
								if( d_k > -1.44431 )
									ret := 0.010526
						if( bearPower > -3.71843 )
							if( rsi1 <= 8.3953 )
								if( d_k <= -0.410997 )
									ret := -0.850000 // sell
								if( d_k > -0.410997 )
									ret := -0.047619
							if( rsi1 > 8.3953 )
								if( d_k <= 22.3022 )
									ret := 0.177723
								if( d_k > 22.3022 )
									ret := -0.205128
				if( smoothD_d > 67.2139 )
					if( k <= 76.5652 )
						if( d_k <= 15.7444 )
							if( rsi1 <= 49.0157 )
								if( d_k <= 7.24573 )
									ret := -0.291667
								if( d_k > 7.24573 )
									ret := 0.437500
							if( rsi1 > 49.0157 )
								ret := -0.800000 // sell
						if( d_k > 15.7444 )
							if( bearPower <= -2.83493 )
								ret := 0.333333
							if( bearPower > -2.83493 )
								if( bbp <= -2.2857 )
									ret := -0.886364 // sell
								if( bbp > -2.2857 )
									ret := -0.150000
					if( k > 76.5652 )
						if( bearPower <= -1.78348 )
							if( bbm <= 1.01147 )
								ret := -0.333333
							if( bbm > 1.01147 )
								if( d <= 85.0819 )
									ret := -1.000000 // sell
								if( d > 85.0819 )
									ret := -0.761905 // sell
						if( bearPower > -1.78348 )
							if( bbp <= -2.30356 )
								ret := 0.444444
							if( bbp > -2.30356 )
								if( d <= 88.5392 )
									ret := -0.666667
								if( d > 88.5392 )
									ret := -0.444444
	if( bbp > -2.05729 )
		if( bullPower <= 0.963422 )
			if( bbm <= 0.558318 )
				if( bbp <= -0.300513 )
					if( k <= 26.599 )
						if( bearPower <= -0.959866 )
							if( bbp <= -1.661 )
								if( smoothD_d <= 25.3836 )
									ret := -0.082370
								if( smoothD_d > 25.3836 )
									ret := 0.522388
							if( bbp > -1.661 )
								if( smoothD_d <= -0.633317 )
									ret := -0.709302 // sell
								if( smoothD_d > -0.633317 )
									ret := -0.194030
						if( bearPower > -0.959866 )
							if( bbp <= -1.35565 )
								if( smoothK_k <= -2.93459 )
									ret := -0.173913
								if( smoothK_k > -2.93459 )
									ret := 0.256991
							if( bbp > -1.35565 )
								if( smoothD_d <= 24.8042 )
									ret := -0.017091
								if( smoothD_d > 24.8042 )
									ret := 0.096070
					if( k > 26.599 )
						if( d_k <= 27.2882 )
							if( k <= 27.8984 )
								if( d_k <= 5.39675 )
									ret := 0.542857
								if( d_k > 5.39675 )
									ret := -0.135417
							if( k > 27.8984 )
								if( bullPower <= -0.503921 )
									ret := 0.252644
								if( bullPower > -0.503921 )
									ret := 0.085993
						if( d_k > 27.2882 )
							if( smoothD_d <= 62.7069 )
								if( bullPower <= -0.351048 )
									ret := -0.333333
								if( bullPower > -0.351048 )
									ret := -0.843750 // sell
							if( smoothD_d > 62.7069 )
								if( rsi1 <= 41.1576 )
									ret := 0.454545
								if( rsi1 > 41.1576 )
									ret := -0.250000
				if( bbp > -0.300513 )
					if( smoothK_k <= 52.5785 )
						if( smoothD_d <= 60.3307 )
							if( bbp <= 0.790038 )
								if( smoothK_k <= -2.83603 )
									ret := 0.173913
								if( smoothK_k > -2.83603 )
									ret := -0.001554
							if( bbp > 0.790038 )
								if( bearPower <= 0.463124 )
									ret := -0.030748
								if( bearPower > 0.463124 )
									ret := -0.257880
						if( smoothD_d > 60.3307 )
							if( k <= 47.001 )
								if( d <= 65.2254 )
									ret := -0.236111
								if( d > 65.2254 )
									ret := 0.193548
							if( k > 47.001 )
								if( rsi1 <= 42.7699 )
									ret := 0.257143
								if( rsi1 > 42.7699 )
									ret := -0.301923
					if( smoothK_k > 52.5785 )
						if( d <= 32.8735 )
							if( bullPower <= 0.314214 )
								ret := -0.200000
							if( bullPower > 0.314214 )
								if( bbm <= 0.25495 )
									ret := 1.000000 // buy
								if( bbm > 0.25495 )
									ret := 0.750000 // buy
						if( d > 32.8735 )
							if( smoothK_k <= 54.0931 )
								if( d <= 42.9799 )
									ret := -0.346535
								if( d > 42.9799 )
									ret := 0.278752
							if( smoothK_k > 54.0931 )
								if( smoothK_k <= 96.4993 )
									ret := 0.024388
								if( smoothK_k > 96.4993 )
									ret := -0.042575
			if( bbm > 0.558318 )
				if( k <= 10.4542 )
					if( rsi1 <= 46.6932 )
						if( rsi1 <= 34.0338 )
							if( bullPower <= -0.388683 )
								if( smoothD_d <= -0.235419 )
									ret := 0.127193
								if( smoothD_d > -0.235419 )
									ret := -0.146179
							if( bullPower > -0.388683 )
								if( k <= 10.0942 )
									ret := -0.195777
								if( k > 10.0942 )
									ret := -0.960000 // sell
						if( rsi1 > 34.0338 )
							if( d_k <= -2.23788 )
								if( rsi1 <= 35.444 )
									ret := 0.750000 // buy
								if( rsi1 > 35.444 )
									ret := -0.480198
							if( d_k > -2.23788 )
								if( k <= 8.87718 )
									ret := 0.124031
								if( k > 8.87718 )
									ret := -0.294574
					if( rsi1 > 46.6932 )
						if( d_k <= 3.30023 )
							if( bearPower <= -0.27627 )
								if( k <= 8.9087 )
									ret := -0.122449
								if( k > 8.9087 )
									ret := -0.790698 // sell
							if( bearPower > -0.27627 )
								if( smoothK_k <= 5.64177 )
									ret := -0.015748
								if( smoothK_k > 5.64177 )
									ret := 0.760870 // buy
						if( d_k > 3.30023 )
							if( bearPower <= -0.241836 )
								if( bbm <= 0.76946 )
									ret := -0.230769
								if( bbm > 0.76946 )
									ret := -0.538462
							if( bearPower > -0.241836 )
								if( rsi1 <= 47.5405 )
									ret := -1.000000 // sell
								if( rsi1 > 47.5405 )
									ret := 0.107345
				if( k > 10.4542 )
					if( k <= 41.5495 )
						if( smoothK_k <= 28.4461 )
							if( bullPower <= 0.242128 )
								if( smoothK_k <= 16.9413 )
									ret := 0.130310
								if( smoothK_k > 16.9413 )
									ret := -0.041724
							if( bullPower > 0.242128 )
								if( d_k <= 17.2897 )
									ret := -0.050078
								if( d_k > 17.2897 )
									ret := -0.352542
						if( smoothK_k > 28.4461 )
							if( bearPower <= -0.109725 )
								if( k <= 33.7946 )
									ret := 0.381176
								if( k > 33.7946 )
									ret := 0.100937
							if( bearPower > -0.109725 )
								if( rsi1 <= 66.3165 )
									ret := -0.181818
								if( rsi1 > 66.3165 )
									ret := 0.447368
					if( k > 41.5495 )
						if( d_k <= -28.8609 )
							if( bbm <= 0.663549 )
								ret := 0.947368 // buy
							if( bbm > 0.663549 )
								if( bbp <= 0.353607 )
									ret := 0.681818
								if( bbp > 0.353607 )
									ret := -0.095238
						if( d_k > -28.8609 )
							if( d <= 29.1976 )
								if( d <= 26.8703 )
									ret := -0.091743
								if( d > 26.8703 )
									ret := 0.627451
							if( d > 29.1976 )
								if( rsi1 <= 68.5076 )
									ret := -0.062844
								if( rsi1 > 68.5076 )
									ret := 0.076355
		if( bullPower > 0.963422 )
			if( bbp <= 3.25883 )
				if( bullPower <= 1.69312 )
					if( bbp <= 2.74012 )
						if( d <= 64.7114 )
							if( smoothK_k <= 7.4667 )
								if( smoothK_k <= 6.14865 )
									ret := 0.040000
								if( smoothK_k > 6.14865 )
									ret := 0.745098 // buy
							if( smoothK_k > 7.4667 )
								if( bearPower <= -1.89817 )
									ret := 1.000000 // buy
								if( bearPower > -1.89817 )
									ret := -0.166422
						if( d > 64.7114 )
							if( smoothK_k <= 93.9707 )
								if( d_k <= -13.9755 )
									ret := -0.298507
								if( d_k > -13.9755 )
									ret := 0.032049
							if( smoothK_k > 93.9707 )
								if( smoothD_d <= 73.6956 )
									ret := 0.536232
								if( smoothD_d > 73.6956 )
									ret := -0.155713
					if( bbp > 2.74012 )
						if( d_k <= 2.34632 )
							if( d <= 99.31 )
								if( k <= 90.3328 )
									ret := -0.413793
								if( k > 90.3328 )
									ret := 0.011236
							if( d > 99.31 )
								ret := -0.937500 // sell
						if( d_k > 2.34632 )
							if( k <= 62.1647 )
								ret := -0.285714
							if( k > 62.1647 )
								if( bearPower <= 1.44226 )
									ret := -0.933333 // sell
								if( bearPower > 1.44226 )
									ret := -0.764706 // sell
				if( bullPower > 1.69312 )
					if( rsi1 <= 80.3876 )
						if( smoothD_d <= 94.2573 )
							if( rsi1 <= 65.8683 )
								if( bullPower <= 1.92122 )
									ret := -0.268293
								if( bullPower > 1.92122 )
									ret := -0.049713
							if( rsi1 > 65.8683 )
								if( smoothD_d <= 90.696 )
									ret := -0.430159
								if( smoothD_d > 90.696 )
									ret := 0.106796
						if( smoothD_d > 94.2573 )
							if( bbm <= 0.749606 )
								ret := 0.117647
							if( bbm > 0.749606 )
								if( bullPower <= 2.16074 )
									ret := -0.780952 // sell
								if( bullPower > 2.16074 )
									ret := -0.153846
					if( rsi1 > 80.3876 )
						if( bearPower <= 1.24 )
							if( d <= 95.8093 )
								if( rsi1 <= 86.5674 )
									ret := 0.148936
								if( rsi1 > 86.5674 )
									ret := -0.558140
							if( d > 95.8093 )
								if( smoothK_k <= 94.2422 )
									ret := 0.880952 // buy
								if( smoothK_k > 94.2422 )
									ret := 0.278689
						if( bearPower > 1.24 )
							if( bbp <= 3.09516 )
								ret := -0.800000 // sell
							if( bbp > 3.09516 )
								ret := -0.466667
			if( bbp > 3.25883 )
				if( bearPower <= 1.24303 )
					if( smoothD_d <= 77.2533 )
						if( bearPower <= -0.016826 )
							if( k <= 33.9105 )
								if( bearPower <= -0.638164 )
									ret := 1.000000 // buy
								if( bearPower > -0.638164 )
									ret := 0.888889 // buy
							if( k > 33.9105 )
								ret := 0.142857
						if( bearPower > -0.016826 )
							if( bbm <= 2.75716 )
								if( bullPower <= 2.62954 )
									ret := -0.134021
								if( bullPower > 2.62954 )
									ret := 0.424658
							if( bbm > 2.75716 )
								if( bbp <= 4.16277 )
									ret := -0.333333
								if( bbp > 4.16277 )
									ret := -0.920000 // sell
					if( smoothD_d > 77.2533 )
						if( k <= 85.3398 )
							if( d <= 89.8168 )
								ret := 0.266667
							if( d > 89.8168 )
								ret := -0.900000 // sell
						if( k > 85.3398 )
							if( bullPower <= 2.22594 )
								if( rsi1 <= 81.2375 )
									ret := -0.037037
								if( rsi1 > 81.2375 )
									ret := 0.608696
							if( bullPower > 2.22594 )
								if( bbm <= 1.99546 )
									ret := 0.714286 // buy
								if( bbm > 1.99546 )
									ret := 0.304348
				if( bearPower > 1.24303 )
					if( rsi1 <= 90.1847 )
						if( k <= 44.2072 )
							if( bbm <= 1.00009 )
								if( rsi1 <= 65.8905 )
									ret := -0.636364
								if( rsi1 > 65.8905 )
									ret := -1.000000 // sell
							if( bbm > 1.00009 )
								if( rsi1 <= 61.379 )
									ret := 0.117647
								if( rsi1 > 61.379 )
									ret := -0.800000 // sell
						if( k > 44.2072 )
							if( bearPower <= 4.24977 )
								if( bbp <= 3.98279 )
									ret := -0.216590
								if( bbp > 3.98279 )
									ret := 0.024287
							if( bearPower > 4.24977 )
								ret := -1.000000 // sell
					if( rsi1 > 90.1847 )
						if( d <= 97.2769 )
							if( bbm <= 0.37243 )
								if( rsi1 <= 92.8718 )
									ret := 0.818182 // buy
								if( rsi1 > 92.8718 )
									ret := -0.705882 // sell
							if( bbm > 0.37243 )
								if( smoothK_k <= 90.8952 )
									ret := -0.300000
								if( smoothK_k > 90.8952 )
									ret := -0.880000 // sell
						if( d > 97.2769 )
							if( smoothD_d <= 94.7854 )
								if( k <= 97.339 )
									ret := 1.000000 // buy
								if( k > 97.339 )
									ret := -0.200000
							if( smoothD_d > 94.7854 )
								if( d <= 99.9968 )
									ret := 0.924731 // buy
								if( d > 99.9968 )
									ret := 0.428571
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


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
float op_operation = decision_tree_0_META_1Min_e436ca5e(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


