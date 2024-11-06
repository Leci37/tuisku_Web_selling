//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: META_30Min_2BS0_0b2d39b4 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_META_30Min_2BS0_0b2d39b4", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_META_30Min_0b2d39b4(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( d_k <= -1.59162 )
		if( BBPower_Color <= 0.5 )
			if( bearPower <= -1.47175 )
				if( rsi1 <= 29.111 )
					if( smoothD_d <= 77.4642 )
						if( rsi1 <= 23.6088 )
							if( d_k <= -12.7482 )
								if( d_k <= -20.2675 )
									ret := -0.187500
								if( d_k > -20.2675 )
									ret := 0.661017
							if( d_k > -12.7482 )
								if( bullPower <= -8.8819 )
									ret := 1.000000 // buy
								if( bullPower > -8.8819 )
									ret := -0.133525
						if( rsi1 > 23.6088 )
							if( smoothD_d <= 20.863 )
								if( smoothD_d <= 15.8831 )
									ret := -0.366316
								if( smoothD_d > 15.8831 )
									ret := -0.759494 // sell
							if( smoothD_d > 20.863 )
								if( smoothK_k <= 49.9648 )
									ret := 0.147208
								if( smoothK_k > 49.9648 )
									ret := -0.323383
					if( smoothD_d > 77.4642 )
						if( smoothK_k <= 89.5017 )
							ret := 1.000000 // buy
						if( smoothK_k > 89.5017 )
							ret := 0.777778 // buy
				if( rsi1 > 29.111 )
					if( k <= 17.9571 )
						if( rsi1 <= 32.0016 )
							if( bearPower <= -4.99589 )
								ret := -0.444444
							if( bearPower > -4.99589 )
								if( bbp <= -2.4933 )
									ret := 0.411765
								if( bbp > -2.4933 )
									ret := 0.796296 // buy
						if( rsi1 > 32.0016 )
							if( d_k <= -1.90035 )
								if( k <= 16.9518 )
									ret := 0.034404
								if( k > 16.9518 )
									ret := 0.615385
							if( d_k > -1.90035 )
								if( rsi1 <= 37.7065 )
									ret := -0.952381 // sell
								if( rsi1 > 37.7065 )
									ret := -0.200000
					if( k > 17.9571 )
						if( smoothK_k <= 18.0259 )
							if( smoothD_d <= 10.8853 )
								if( bbm <= 1.86112 )
									ret := 0.000000
								if( bbm > 1.86112 )
									ret := -0.675000
							if( smoothD_d > 10.8853 )
								if( rsi1 <= 34.1972 )
									ret := -1.000000 // sell
								if( rsi1 > 34.1972 )
									ret := -0.578947
						if( smoothK_k > 18.0259 )
							if( rsi1 <= 60.5651 )
								if( smoothD_d <= 72.1339 )
									ret := -0.022409
								if( smoothD_d > 72.1339 )
									ret := -0.368421
							if( rsi1 > 60.5651 )
								if( d_k <= -8.48666 )
									ret := -0.027778
								if( d_k > -8.48666 )
									ret := 0.592593
			if( bearPower > -1.47175 )
				if( bbp <= -0.277749 )
					if( d <= 82.884 )
						if( smoothD_d <= 78.1066 )
							if( k <= 25.5655 )
								if( d_k <= -5.18742 )
									ret := -0.086556
								if( d_k > -5.18742 )
									ret := 0.035655
							if( k > 25.5655 )
								if( bbp <= -0.591529 )
									ret := 0.035389
								if( bbp > -0.591529 )
									ret := 0.167084
						if( smoothD_d > 78.1066 )
							if( rsi1 <= 45.647 )
								ret := 0.058824
							if( rsi1 > 45.647 )
								if( k <= 92.1949 )
									ret := -0.804348 // sell
								if( k > 92.1949 )
									ret := -0.300000
					if( d > 82.884 )
						if( bbm <= 1.4552 )
							if( d_k <= -2.10624 )
								if( bbm <= 0.319661 )
									ret := -0.013793
								if( bbm > 0.319661 )
									ret := 0.306338
							if( d_k > -2.10624 )
								if( bbp <= -1.33042 )
									ret := 0.100000
								if( bbp > -1.33042 )
									ret := 0.711864 // buy
						if( bbm > 1.4552 )
							if( k <= 96.3632 )
								ret := -0.846154 // sell
							if( k > 96.3632 )
								ret := -0.066667
				if( bbp > -0.277749 )
					if( smoothK_k <= 89.5245 )
						if( d <= 18.8419 )
							if( bullPower <= 0.381673 )
								if( smoothK_k <= 17.846 )
									ret := 0.017668
								if( smoothK_k > 17.846 )
									ret := -0.264423
							if( bullPower > 0.381673 )
								if( smoothD_d <= -1.10452 )
									ret := 0.600000
								if( smoothD_d > -1.10452 )
									ret := -0.406250
						if( d > 18.8419 )
							if( bearPower <= -1.36751 )
								if( rsi1 <= 44.6404 )
									ret := 1.000000 // buy
								if( rsi1 > 44.6404 )
									ret := 0.692308
							if( bearPower > -1.36751 )
								if( bbm <= 1.31971 )
									ret := -0.004249
								if( bbm > 1.31971 )
									ret := -0.136691
					if( smoothK_k > 89.5245 )
						if( smoothK_k <= 92.0975 )
							if( bbp <= -0.154906 )
								if( bearPower <= -0.340032 )
									ret := 0.111111
								if( bearPower > -0.340032 )
									ret := 0.000000
							if( bbp > -0.154906 )
								if( rsi1 <= 63.7128 )
									ret := 0.616667
								if( rsi1 > 63.7128 )
									ret := 1.000000 // buy
						if( smoothK_k > 92.0975 )
							if( bbm <= 1.59039 )
								if( d <= 88.2199 )
									ret := 0.373984
								if( d > 88.2199 )
									ret := -0.044872
							if( bbm > 1.59039 )
								if( bbp <= 0.869473 )
									ret := -0.764706 // sell
								if( bbp > 0.869473 )
									ret := -0.111111
		if( BBPower_Color > 0.5 )
			if( bbp <= 15.795 )
				if( d <= 93.7032 )
					if( smoothK_k <= 75.2848 )
						if( rsi1 <= 45.2228 )
							if( smoothD_d <= 30.5379 )
								if( d_k <= -6.95133 )
									ret := -0.132231
								if( d_k > -6.95133 )
									ret := 0.095865
							if( smoothD_d > 30.5379 )
								if( d <= 57.4412 )
									ret := 0.258621
								if( d > 57.4412 )
									ret := -0.311475
						if( rsi1 > 45.2228 )
							if( bullPower <= 9.88922 )
								if( bearPower <= -0.264443 )
									ret := -0.282821
								if( bearPower > -0.264443 )
									ret := -0.084874
							if( bullPower > 9.88922 )
								if( rsi1 <= 81.4705 )
									ret := 1.000000 // buy
								if( rsi1 > 81.4705 )
									ret := 0.818182 // buy
					if( smoothK_k > 75.2848 )
						if( bearPower <= -0.897057 )
							if( smoothK_k <= 78.8122 )
								if( d <= 71.9593 )
									ret := -0.333333
								if( d > 71.9593 )
									ret := 0.608696
							if( smoothK_k > 78.8122 )
								if( rsi1 <= 71.5654 )
									ret := -0.641791
								if( rsi1 > 71.5654 )
									ret := -0.027397
						if( bearPower > -0.897057 )
							if( k <= 79.7288 )
								if( bullPower <= 2.44954 )
									ret := 0.274788
								if( bullPower > 2.44954 )
									ret := -0.333333
							if( k > 79.7288 )
								if( rsi1 <= 65.0718 )
									ret := -0.067945
								if( rsi1 > 65.0718 )
									ret := 0.017974
				if( d > 93.7032 )
					if( bbp <= 7.1882 )
						if( k <= 99.9731 )
							if( smoothK_k <= 96.8893 )
								if( bbm <= 3.84792 )
									ret := -0.142857
								if( bbm > 3.84792 )
									ret := -0.916667 // sell
							if( smoothK_k > 96.8893 )
								if( smoothD_d <= 92.0993 )
									ret := 0.076923
								if( smoothD_d > 92.0993 )
									ret := -0.723077 // sell
						if( k > 99.9731 )
							if( bbm <= 2.11174 )
								if( bbm <= 0.025819 )
									ret := -0.777778 // sell
								if( bbm > 0.025819 )
									ret := -0.079070
							if( bbm > 2.11174 )
								if( rsi1 <= 70.2705 )
									ret := 1.000000 // buy
								if( rsi1 > 70.2705 )
									ret := 0.392857
					if( bbp > 7.1882 )
						if( bbm <= 2.14879 )
							if( smoothK_k <= 96.876 )
								if( d <= 95.3273 )
									ret := -0.200000
								if( d > 95.3273 )
									ret := 0.818182 // buy
							if( smoothK_k > 96.876 )
								if( smoothD_d <= 94.4863 )
									ret := -0.333333
								if( smoothD_d > 94.4863 )
									ret := -0.692308
						if( bbm > 2.14879 )
							if( bbp <= 10.9376 )
								if( d_k <= -1.97701 )
									ret := -0.984848 // sell
								if( d_k > -1.97701 )
									ret := -0.272727
							if( bbp > 10.9376 )
								if( bearPower <= 3.74601 )
									ret := 0.250000
								if( bearPower > 3.74601 )
									ret := -0.347826
			if( bbp > 15.795 )
				if( bearPower <= 5.27209 )
					ret := 0.944444 // buy
				if( bearPower > 5.27209 )
					if( bearPower <= 7.22452 )
						ret := 0.083333
					if( bearPower > 7.22452 )
						if( smoothD_d <= 84.7634 )
							if( smoothK_k <= 83.5384 )
								ret := 0.272727
							if( smoothK_k > 83.5384 )
								if( smoothK_k <= 95.9622 )
									ret := 0.909091 // buy
								if( smoothK_k > 95.9622 )
									ret := 1.000000 // buy
						if( smoothD_d > 84.7634 )
							ret := -0.142857
	if( d_k > -1.59162 )
		if( d_k <= 2.18409 )
			if( bbp <= -7.90715 )
				if( bbp <= -10.0597 )
					if( rsi1 <= 6.12605 )
						if( bbp <= -15.3514 )
							if( k <= 0.013612 )
								ret := 0.818182 // buy
							if( k > 0.013612 )
								ret := -0.200000
						if( bbp > -15.3514 )
							if( k <= 1.34325 )
								if( bearPower <= -7.13319 )
									ret := -0.875000 // sell
								if( bearPower > -7.13319 )
									ret := 0.250000
							if( k > 1.34325 )
								ret := -1.000000 // sell
					if( rsi1 > 6.12605 )
						if( smoothD_d <= 8.19913 )
							if( bullPower <= -11.3622 )
								ret := 1.000000 // buy
							if( bullPower > -11.3622 )
								if( rsi1 <= 21.8839 )
									ret := 0.156627
								if( rsi1 > 21.8839 )
									ret := 0.741935 // buy
						if( smoothD_d > 8.19913 )
							if( smoothD_d <= 13.2984 )
								ret := -0.900000 // sell
							if( smoothD_d > 13.2984 )
								if( d_k <= -0.284086 )
									ret := 0.833333 // buy
								if( d_k > -0.284086 )
									ret := -0.333333
				if( bbp > -10.0597 )
					if( bearPower <= -5.40819 )
						if( bbm <= 6.00338 )
							if( bullPower <= -3.84427 )
								ret := 0.333333
							if( bullPower > -3.84427 )
								if( bbm <= 2.74813 )
									ret := 0.959184 // buy
								if( bbm > 2.74813 )
									ret := 0.671875
						if( bbm > 6.00338 )
							if( d <= 1.60058 )
								ret := -0.133333
							if( d > 1.60058 )
								ret := 0.600000
					if( bearPower > -5.40819 )
						if( rsi1 <= 4.30897 )
							ret := 1.000000 // buy
						if( rsi1 > 4.30897 )
							if( d_k <= -0.628973 )
								if( d_k <= -1.04695 )
									ret := 0.400000
								if( d_k > -1.04695 )
									ret := 0.777778 // buy
							if( d_k > -0.628973 )
								if( d_k <= -0.382463 )
									ret := -0.533333
								if( d_k > -0.382463 )
									ret := 0.026316
			if( bbp > -7.90715 )
				if( bearPower <= -2.19951 )
					if( rsi1 <= 28.7274 )
						if( d <= 0.230644 )
							if( bbm <= 1.94149 )
								if( rsi1 <= 20.3235 )
									ret := 0.010204
								if( rsi1 > 20.3235 )
									ret := -0.859375 // sell
							if( bbm > 1.94149 )
								if( bearPower <= -3.17701 )
									ret := 0.425532
								if( bearPower > -3.17701 )
									ret := -0.600000
						if( d > 0.230644 )
							if( smoothK_k <= 20.0127 )
								if( bbp <= -6.93469 )
									ret := 0.453947
								if( bbp > -6.93469 )
									ret := 0.091860
							if( smoothK_k > 20.0127 )
								if( bullPower <= -1.54539 )
									ret := -0.520833
								if( bullPower > -1.54539 )
									ret := 0.042553
					if( rsi1 > 28.7274 )
						if( bbp <= -2.32889 )
							if( bbp <= -3.32391 )
								if( rsi1 <= 53.9957 )
									ret := -0.220486
								if( rsi1 > 53.9957 )
									ret := 1.000000 // buy
							if( bbp > -3.32391 )
								if( d <= 30.2082 )
									ret := 0.010870
								if( d > 30.2082 )
									ret := 0.416667
						if( bbp > -2.32889 )
							if( k <= 22.7305 )
								if( bullPower <= 1.59602 )
									ret := -0.900000 // sell
								if( bullPower > 1.59602 )
									ret := -0.636364
							if( k > 22.7305 )
								if( bearPower <= -2.95244 )
									ret := -0.571429
								if( bearPower > -2.95244 )
									ret := -0.137255
				if( bearPower > -2.19951 )
					if( d <= 5.2833 )
						if( k <= 2.38999 )
							if( bullPower <= 0.057289 )
								if( rsi1 <= 12.3942 )
									ret := -0.241758
								if( rsi1 > 12.3942 )
									ret := 0.061224
							if( bullPower > 0.057289 )
								if( d_k <= 1.87147 )
									ret := 0.118827
								if( d_k > 1.87147 )
									ret := 0.700000 // buy
						if( k > 2.38999 )
							if( smoothK_k <= 2.5049 )
								if( bullPower <= 0.0043 )
									ret := 0.240658
								if( bullPower > 0.0043 )
									ret := 0.472067
							if( smoothK_k > 2.5049 )
								if( smoothK_k <= 2.75807 )
									ret := -0.466667
								if( smoothK_k > 2.75807 )
									ret := 0.092593
					if( d > 5.2833 )
						if( bearPower <= -1.58149 )
							if( bearPower <= -2.18326 )
								ret := 0.869565 // buy
							if( bearPower > -2.18326 )
								if( bbm <= 3.09104 )
									ret := 0.145985
								if( bbm > 3.09104 )
									ret := 0.458333
						if( bearPower > -1.58149 )
							if( smoothK_k <= 4.02529 )
								if( bbp <= 1.60412 )
									ret := -0.137306
								if( bbp > 1.60412 )
									ret := -0.750000 // sell
							if( smoothK_k > 4.02529 )
								if( d_k <= 0.946791 )
									ret := 0.031122
								if( d_k > 0.946791 )
									ret := 0.103297
		if( d_k > 2.18409 )
			if( bbm <= 2.01482 )
				if( k <= 88.7825 )
					if( bbp <= -0.494553 )
						if( bbp <= -0.896286 )
							if( bearPower <= -2.33748 )
								if( bbp <= -4.2483 )
									ret := 0.037365
								if( bbp > -4.2483 )
									ret := -0.137226
							if( bearPower > -2.33748 )
								if( k <= 74.2687 )
									ret := 0.039102
								if( k > 74.2687 )
									ret := 0.372881
						if( bbp > -0.896286 )
							if( smoothK_k <= 76.3132 )
								if( rsi1 <= 57.1193 )
									ret := 0.161100
								if( rsi1 > 57.1193 )
									ret := -0.222222
							if( smoothK_k > 76.3132 )
								if( d <= 93.7693 )
									ret := 0.601351
								if( d > 93.7693 )
									ret := -0.875000 // sell
					if( bbp > -0.494553 )
						if( bbm <= 0.462604 )
							if( bbm <= 0.430826 )
								if( bbp <= 2.38158 )
									ret := -0.018432
								if( bbp > 2.38158 )
									ret := -0.195918
							if( bbm > 0.430826 )
								if( smoothK_k <= -1.33915 )
									ret := 0.548387
								if( smoothK_k > -1.33915 )
									ret := -0.192405
						if( bbm > 0.462604 )
							if( bearPower <= 3.03153 )
								if( rsi1 <= 70.8896 )
									ret := -0.011209
								if( rsi1 > 70.8896 )
									ret := 0.183541
							if( bearPower > 3.03153 )
								if( k <= 73.8651 )
									ret := -0.272727
								if( k > 73.8651 )
									ret := 0.750000 // buy
				if( k > 88.7825 )
					if( bbm <= 0.928973 )
						if( d <= 97.7585 )
							if( rsi1 <= 72.4482 )
								if( bearPower <= 0.789422 )
									ret := -0.238690
								if( bearPower > 0.789422 )
									ret := -0.640000
							if( rsi1 > 72.4482 )
								if( bearPower <= 0.066475 )
									ret := 0.392857
								if( bearPower > 0.066475 )
									ret := 0.000000
						if( d > 97.7585 )
							if( smoothD_d <= 95.025 )
								if( rsi1 <= 58.8691 )
									ret := -0.117647
								if( rsi1 > 58.8691 )
									ret := 0.551724
							if( smoothD_d > 95.025 )
								if( d_k <= 2.66646 )
									ret := 0.000000
								if( d_k > 2.66646 )
									ret := -0.333333
					if( bbm > 0.928973 )
						if( d <= 97.0226 )
							if( smoothK_k <= 88.8288 )
								if( bbm <= 1.75863 )
									ret := 0.009677
								if( bbm > 1.75863 )
									ret := 0.826087 // buy
							if( smoothK_k > 88.8288 )
								if( d <= 96.2096 )
									ret := -0.300971
								if( d > 96.2096 )
									ret := -0.648649
						if( d > 97.0226 )
							if( d_k <= 5.23518 )
								if( bullPower <= 2.75196 )
									ret := 0.260870
								if( bullPower > 2.75196 )
									ret := 0.687500
							if( d_k > 5.23518 )
								ret := 1.000000 // buy
			if( bbm > 2.01482 )
				if( d_k <= 16.6903 )
					if( rsi1 <= 67.9879 )
						if( rsi1 <= 17.7397 )
							if( bbp <= -22.984 )
								ret := -0.904762 // sell
							if( bbp > -22.984 )
								if( d <= 31.4563 )
									ret := 0.283898
								if( d > 31.4563 )
									ret := -0.322581
						if( rsi1 > 17.7397 )
							if( bearPower <= 0.151702 )
								if( d_k <= 11.186 )
									ret := -0.100797
								if( d_k > 11.186 )
									ret := -0.250000
							if( bearPower > 0.151702 )
								if( d <= 13.6461 )
									ret := -0.944444 // sell
								if( d > 13.6461 )
									ret := -0.378531
					if( rsi1 > 67.9879 )
						if( bbp <= 1.3439 )
							if( bullPower <= 1.47312 )
								if( smoothD_d <= 59.4292 )
									ret := 0.400000
								if( smoothD_d > 59.4292 )
									ret := -0.200000
							if( bullPower > 1.47312 )
								if( rsi1 <= 75.1302 )
									ret := 0.904762 // buy
								if( rsi1 > 75.1302 )
									ret := 0.285714
						if( bbp > 1.3439 )
							if( smoothD_d <= 52.9692 )
								if( smoothD_d <= 45.5458 )
									ret := -0.156250
								if( smoothD_d > 45.5458 )
									ret := -0.760000 // sell
							if( smoothD_d > 52.9692 )
								if( d_k <= 2.76695 )
									ret := -0.524590
								if( d_k > 2.76695 )
									ret := 0.172500
				if( d_k > 16.6903 )
					if( smoothK_k <= 22.1983 )
						if( bearPower <= -0.186961 )
							if( smoothD_d <= 47.4564 )
								if( rsi1 <= 26.2505 )
									ret := 0.201681
								if( rsi1 > 26.2505 )
									ret := -0.161954
							if( smoothD_d > 47.4564 )
								if( smoothK_k <= 20.469 )
									ret := 1.000000 // buy
								if( smoothK_k > 20.469 )
									ret := 0.666667
						if( bearPower > -0.186961 )
							if( rsi1 <= 67.1276 )
								ret := -0.500000
							if( rsi1 > 67.1276 )
								ret := -0.909091 // sell
					if( smoothK_k > 22.1983 )
						if( bbp <= -3.43263 )
							if( smoothD_d <= 56.0112 )
								if( smoothD_d <= 49.9473 )
									ret := 0.464286
								if( smoothD_d > 49.9473 )
									ret := 0.828571 // buy
							if( smoothD_d > 56.0112 )
								if( bullPower <= -0.205736 )
									ret := 0.382609
								if( bullPower > -0.205736 )
									ret := -0.393939
						if( bbp > -3.43263 )
							if( d <= 70.0855 )
								if( bearPower <= -2.55226 )
									ret := -0.670886
								if( bearPower > -2.55226 )
									ret := 0.162162
							if( d > 70.0855 )
								if( k <= 59.3363 )
									ret := 0.577236
								if( k > 59.3363 )
									ret := -0.095238
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_META_30Min_0b2d39b4(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


