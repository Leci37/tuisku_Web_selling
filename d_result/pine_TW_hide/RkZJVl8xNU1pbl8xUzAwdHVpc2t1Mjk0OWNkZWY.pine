//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: FFIV_15Min_1S00_2949cdef Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_FFIV_15Min_1S00_2949cdef", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_FFIV_15Min_2949cdef(d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( d <= 13.6409 )
		if( k <= 5.02299 )
			if( d <= 12.428 )
				if( k <= 4.25984 )
					if( d <= 0.000157 )
						if( rsi1 <= 13.3026 )
							if( rsi1 <= 2.3924 )
								ret := 0.818182 // buy
							if( rsi1 > 2.3924 )
								if( rsi1 <= 8.46093 )
									ret := -0.729730 // sell
								if( rsi1 > 8.46093 )
									ret := -0.536232
						if( rsi1 > 13.3026 )
							if( rsi1 <= 43.4416 )
								if( rsi1 <= 39.5892 )
									ret := 0.026012
								if( rsi1 > 39.5892 )
									ret := 0.633333
							if( rsi1 > 43.4416 )
								if( rsi1 <= 56.4948 )
									ret := -0.535714
								if( rsi1 > 56.4948 )
									ret := 0.066667
					if( d > 0.000157 )
						if( smoothK_k <= -2.96957 )
							if( rsi1 <= 36.34 )
								if( d_k <= 0.122811 )
									ret := 0.607595
								if( d_k > 0.122811 )
									ret := 0.118102
							if( rsi1 > 36.34 )
								if( d <= 2.05484 )
									ret := -0.433498
								if( d > 2.05484 )
									ret := 0.060606
						if( smoothK_k > -2.96957 )
							if( rsi1 <= 61.7685 )
								if( smoothD_d <= -2.29038 )
									ret := 0.100443
								if( smoothD_d > -2.29038 )
									ret := -0.040287
							if( rsi1 > 61.7685 )
								if( d <= 0.981567 )
									ret := -0.882353 // sell
								if( d > 0.981567 )
									ret := -0.236842
				if( k > 4.25984 )
					if( d_k <= 5.60043 )
						if( smoothK_k <= 1.96425 )
							if( rsi1 <= 30.4096 )
								if( smoothD_d <= 2.69079 )
									ret := 0.214724
								if( smoothD_d > 2.69079 )
									ret := 0.792208 // buy
							if( rsi1 > 30.4096 )
								if( d_k <= 2.69114 )
									ret := 0.203883
								if( d_k > 2.69114 )
									ret := -0.129412
						if( smoothK_k > 1.96425 )
							if( k <= 4.98772 )
								ret := 0.789474 // buy
							if( k > 4.98772 )
								ret := 0.428571
					if( d_k > 5.60043 )
						if( smoothD_d <= 8.50963 )
							if( smoothD_d <= 7.71122 )
								ret := -1.000000 // sell
							if( smoothD_d > 7.71122 )
								if( smoothD_d <= 8.10615 )
									ret := -0.368421
								if( smoothD_d > 8.10615 )
									ret := -0.800000 // sell
						if( smoothD_d > 8.50963 )
							if( smoothD_d <= 8.97341 )
								if( smoothK_k <= 1.77128 )
									ret := 0.538462
								if( smoothK_k > 1.77128 )
									ret := 0.666667
							if( smoothD_d > 8.97341 )
								ret := -0.250000
			if( d > 12.428 )
				if( d_k <= 9.83526 )
					if( d <= 12.7565 )
						if( smoothK_k <= 1.52812 )
							if( k <= 3.42708 )
								ret := -0.937500 // sell
							if( k > 3.42708 )
								ret := -0.444444
						if( smoothK_k > 1.52812 )
							ret := -1.000000 // sell
					if( d > 12.7565 )
						if( smoothK_k <= 1.13612 )
							ret := -0.666667
						if( smoothK_k > 1.13612 )
							ret := -0.266667
				if( d_k > 9.83526 )
					if( smoothK_k <= -0.262079 )
						if( k <= 0.098473 )
							if( rsi1 <= 21.4009 )
								if( d_k <= 13.1491 )
									ret := -0.800000 // sell
								if( d_k > 13.1491 )
									ret := -0.818182 // sell
							if( rsi1 > 21.4009 )
								if( rsi1 <= 40.3833 )
									ret := 0.454545
								if( rsi1 > 40.3833 )
									ret := -0.307692
						if( k > 0.098473 )
							if( rsi1 <= 37.8383 )
								if( d_k <= 11.8184 )
									ret := -0.758621 // sell
								if( d_k > 11.8184 )
									ret := -0.416667
							if( rsi1 > 37.8383 )
								ret := 0.000000
					if( smoothK_k > -0.262079 )
						ret := 0.700000 // buy
		if( k > 5.02299 )
			if( smoothD_d <= 3.07838 )
				if( k <= 5.74641 )
					if( k <= 5.71611 )
						if( rsi1 <= 60.9475 )
							if( smoothD_d <= 1.90352 )
								if( rsi1 <= 50.0252 )
									ret := -0.469136
								if( rsi1 > 50.0252 )
									ret := -0.966667 // sell
							if( smoothD_d > 1.90352 )
								if( d <= 5.59046 )
									ret := 0.328571
								if( d > 5.59046 )
									ret := -0.533333
						if( rsi1 > 60.9475 )
							ret := 0.928571 // buy
					if( k > 5.71611 )
						ret := -0.875000 // sell
				if( k > 5.74641 )
					if( smoothD_d <= 1.91004 )
						if( smoothK_k <= 9.02314 )
							if( d_k <= -1.54721 )
								if( smoothK_k <= 3.04023 )
									ret := -0.224806
								if( smoothK_k > 3.04023 )
									ret := 0.022777
							if( d_k > -1.54721 )
								if( k <= 6.16555 )
									ret := 0.300000
								if( k > 6.16555 )
									ret := 0.875000 // buy
						if( smoothK_k > 9.02314 )
							if( smoothK_k <= 9.41279 )
								ret := -0.916667 // sell
							if( smoothK_k > 9.41279 )
								if( smoothK_k <= 10.1421 )
									ret := -0.071429
								if( smoothK_k > 10.1421 )
									ret := -0.705882 // sell
					if( smoothD_d > 1.91004 )
						if( rsi1 <= 34.862 )
							if( rsi1 <= 29.0508 )
								if( rsi1 <= 28.5771 )
									ret := -0.224771
								if( rsi1 > 28.5771 )
									ret := 0.600000
							if( rsi1 > 29.0508 )
								if( d_k <= -0.54139 )
									ret := -0.702532 // sell
								if( d_k > -0.54139 )
									ret := 0.230769
						if( rsi1 > 34.862 )
							if( d_k <= -10.9992 )
								ret := 0.727273 // buy
							if( d_k > -10.9992 )
								if( smoothD_d <= 2.97248 )
									ret := -0.059406
								if( smoothD_d > 2.97248 )
									ret := -0.756757 // sell
			if( smoothD_d > 3.07838 )
				if( d_k <= -7.82227 )
					if( smoothK_k <= 19.3115 )
						if( rsi1 <= 46.6805 )
							if( rsi1 <= 29.1193 )
								if( d_k <= -9.74509 )
									ret := 0.566667
								if( d_k > -9.74509 )
									ret := -0.326087
							if( rsi1 > 29.1193 )
								if( rsi1 <= 37.5644 )
									ret := 0.512953
								if( rsi1 > 37.5644 )
									ret := 0.238095
						if( rsi1 > 46.6805 )
							if( smoothK_k <= 15.4605 )
								if( d_k <= -8.66797 )
									ret := -0.603774
								if( d_k > -8.66797 )
									ret := 0.000000
							if( smoothK_k > 15.4605 )
								if( d <= 12.3597 )
									ret := 0.266667
								if( d > 12.3597 )
									ret := -0.846154 // sell
					if( smoothK_k > 19.3115 )
						if( smoothK_k <= 26.0092 )
							if( d <= 10.6393 )
								if( k <= 24.2673 )
									ret := 0.355556
								if( k > 24.2673 )
									ret := -0.785714 // sell
							if( d > 10.6393 )
								if( d_k <= -14.3887 )
									ret := -0.610169
								if( d_k > -14.3887 )
									ret := -0.244048
						if( smoothK_k > 26.0092 )
							if( rsi1 <= 65.2963 )
								if( d_k <= -18.3833 )
									ret := -0.368421
								if( d_k > -18.3833 )
									ret := 0.307692
							if( rsi1 > 65.2963 )
								ret := 0.818182 // buy
				if( d_k > -7.82227 )
					if( smoothK_k <= 16.6441 )
						if( k <= 17.2499 )
							if( rsi1 <= 66.6898 )
								if( rsi1 <= 63.6738 )
									ret := -0.047211
								if( rsi1 > 63.6738 )
									ret := -0.434783
							if( rsi1 > 66.6898 )
								if( k <= 13.8193 )
									ret := 0.630435
								if( k > 13.8193 )
									ret := -0.230769
						if( k > 17.2499 )
							if( rsi1 <= 23.2042 )
								if( d <= 13.1601 )
									ret := 0.560000
								if( d > 13.1601 )
									ret := -0.909091 // sell
							if( rsi1 > 23.2042 )
								if( smoothD_d <= 7.91538 )
									ret := -0.100000
								if( smoothD_d > 7.91538 )
									ret := -0.533937
					if( smoothK_k > 16.6441 )
						if( d_k <= -7.15423 )
							if( k <= 20.1715 )
								ret := -0.300000
							if( k > 20.1715 )
								if( rsi1 <= 25.9942 )
									ret := 1.000000 // buy
								if( rsi1 > 25.9942 )
									ret := 0.666667
						if( d_k > -7.15423 )
							if( rsi1 <= 25.4574 )
								ret := 1.000000 // buy
							if( rsi1 > 25.4574 )
								ret := 0.692308
	if( d > 13.6409 )
		if( smoothK_k <= 27.2342 )
			if( d_k <= 15.0278 )
				if( d_k <= 11.097 )
					if( smoothD_d <= 28.6956 )
						if( smoothK_k <= 9.27802 )
							if( d_k <= 2.95836 )
								if( rsi1 <= 52.7385 )
									ret := 0.456522
								if( rsi1 > 52.7385 )
									ret := 0.933333 // buy
							if( d_k > 2.95836 )
								if( d <= 16.1816 )
									ret := 0.055556
								if( d > 16.1816 )
									ret := 0.292157
						if( smoothK_k > 9.27802 )
							if( smoothK_k <= 24.405 )
								if( k <= 27.2912 )
									ret := -0.006341
								if( k > 27.2912 )
									ret := -0.673077
							if( smoothK_k > 24.405 )
								if( rsi1 <= 17.9654 )
									ret := 0.900000 // buy
								if( rsi1 > 17.9654 )
									ret := 0.132804
					if( smoothD_d > 28.6956 )
						if( k <= 23.926 )
							if( k <= 22.1085 )
								ret := 0.428571
							if( k > 22.1085 )
								if( d_k <= 9.23842 )
									ret := -0.166667
								if( d_k > 9.23842 )
									ret := -0.677419
						if( k > 23.926 )
							if( d_k <= 8.89013 )
								if( d <= 33.1695 )
									ret := 0.671233
								if( d > 33.1695 )
									ret := 0.276151
							if( d_k > 8.89013 )
								if( d <= 35.1167 )
									ret := -0.500000
								if( d > 35.1167 )
									ret := 0.191176
				if( d_k > 11.097 )
					if( k <= 9.37434 )
						if( rsi1 <= 30.6666 )
							if( smoothK_k <= 3.08228 )
								if( smoothD_d <= 11.1098 )
									ret := -0.416667
								if( smoothD_d > 11.1098 )
									ret := 0.617391
							if( smoothK_k > 3.08228 )
								if( d <= 19.9438 )
									ret := -1.000000 // sell
								if( d > 19.9438 )
									ret := -0.406250
						if( rsi1 > 30.6666 )
							if( d <= 20.0147 )
								if( smoothD_d <= 16.6756 )
									ret := -0.489164
								if( smoothD_d > 16.6756 )
									ret := -0.807692 // sell
							if( d > 20.0147 )
								if( rsi1 <= 44.2903 )
									ret := 0.160714
								if( rsi1 > 44.2903 )
									ret := -0.301075
					if( k > 9.37434 )
						if( smoothD_d <= 21.4675 )
							if( rsi1 <= 49.6225 )
								if( d_k <= 11.3982 )
									ret := 0.000000
								if( d_k > 11.3982 )
									ret := 0.640625
							if( rsi1 > 49.6225 )
								if( d <= 22.1599 )
									ret := 0.750000 // buy
								if( d > 22.1599 )
									ret := -0.250000
						if( smoothD_d > 21.4675 )
							if( d <= 26.3467 )
								if( k <= 12.4743 )
									ret := -0.063830
								if( k > 12.4743 )
									ret := -0.700000 // sell
							if( d > 26.3467 )
								if( d_k <= 12.7422 )
									ret := -0.175342
								if( d_k > 12.7422 )
									ret := 0.062921
			if( d_k > 15.0278 )
				if( rsi1 <= 28.0419 )
					if( d_k <= 18.2452 )
						if( rsi1 <= 25.1977 )
							if( rsi1 <= 18.2871 )
								if( smoothD_d <= 29.3901 )
									ret := 0.611111
								if( smoothD_d > 29.3901 )
									ret := 0.952381 // buy
							if( rsi1 > 18.2871 )
								if( rsi1 <= 21.6302 )
									ret := -0.289474
								if( rsi1 > 21.6302 )
									ret := 0.362069
						if( rsi1 > 25.1977 )
							if( rsi1 <= 26.351 )
								ret := 1.000000 // buy
							if( rsi1 > 26.351 )
								if( k <= 11.7105 )
									ret := 0.526316
								if( k > 11.7105 )
									ret := 0.937500 // buy
					if( d_k > 18.2452 )
						if( smoothK_k <= -2.75599 )
							if( smoothD_d <= 18.5134 )
								if( smoothD_d <= 16.0668 )
									ret := -0.571429
								if( smoothD_d > 16.0668 )
									ret := 0.642857
							if( smoothD_d > 18.5134 )
								ret := -0.481481
						if( smoothK_k > -2.75599 )
							if( rsi1 <= 21.7147 )
								if( rsi1 <= 13.8746 )
									ret := -0.032258
								if( rsi1 > 13.8746 )
									ret := 0.614458
							if( rsi1 > 21.7147 )
								if( smoothK_k <= 18.4679 )
									ret := -0.103659
								if( smoothK_k > 18.4679 )
									ret := 0.666667
				if( rsi1 > 28.0419 )
					if( smoothK_k <= 23.5858 )
						if( d <= 53.9112 )
							if( d <= 15.5873 )
								if( smoothD_d <= 12.3126 )
									ret := -0.562500
								if( smoothD_d > 12.3126 )
									ret := -0.666667
							if( d > 15.5873 )
								if( smoothK_k <= 16.7093 )
									ret := 0.046146
								if( smoothK_k > 16.7093 )
									ret := 0.199693
						if( d > 53.9112 )
							if( smoothD_d <= 51.3089 )
								ret := 0.615385
							if( smoothD_d > 51.3089 )
								if( smoothK_k <= 22.1783 )
									ret := 0.636364
								if( smoothK_k > 22.1783 )
									ret := 1.000000 // buy
					if( smoothK_k > 23.5858 )
						if( d <= 49.6591 )
							if( smoothK_k <= 24.1113 )
								ret := 0.090909
							if( smoothK_k > 24.1113 )
								if( smoothD_d <= 43.0378 )
									ret := -0.650000
								if( smoothD_d > 43.0378 )
									ret := -0.366667
						if( d > 49.6591 )
							if( d_k <= 29.3089 )
								if( d <= 57.9005 )
									ret := -0.069767
								if( d > 57.9005 )
									ret := 0.785714 // buy
							if( d_k > 29.3089 )
								if( d <= 58.7936 )
									ret := -0.400000
								if( d > 58.7936 )
									ret := -0.666667
		if( smoothK_k > 27.2342 )
			if( smoothK_k <= 43.6761 )
				if( d_k <= 0.404771 )
					if( d_k <= -0.24065 )
						if( d_k <= -19.5622 )
							if( smoothK_k <= 42.3977 )
								if( d <= 21.2778 )
									ret := -0.151163
								if( d > 21.2778 )
									ret := -0.708333 // sell
							if( smoothK_k > 42.3977 )
								if( d <= 23.7078 )
									ret := -0.083333
								if( d > 23.7078 )
									ret := 0.250000
						if( d_k > -19.5622 )
							if( d <= 43.9543 )
								if( d <= 39.0451 )
									ret := -0.061136
								if( d > 39.0451 )
									ret := -0.339339
							if( d > 43.9543 )
								if( smoothK_k <= 42.8056 )
									ret := 0.760870 // buy
								if( smoothK_k > 42.8056 )
									ret := -0.440000
					if( d_k > -0.24065 )
						if( smoothD_d <= 42.6846 )
							if( d <= 34.2175 )
								if( d <= 32.9058 )
									ret := -0.516129
								if( d > 32.9058 )
									ret := 0.545455
							if( d > 34.2175 )
								if( k <= 38.0081 )
									ret := -0.616438
								if( k > 38.0081 )
									ret := -0.209877
						if( smoothD_d > 42.6846 )
							if( smoothK_k <= 43.1663 )
								if( smoothD_d <= 42.8851 )
									ret := -1.000000 // sell
								if( smoothD_d > 42.8851 )
									ret := -0.888889 // sell
							if( smoothK_k > 43.1663 )
								ret := -0.700000 // sell
				if( d_k > 0.404771 )
					if( smoothD_d <= 31.7764 )
						if( smoothK_k <= 27.4337 )
							ret := -0.222222
						if( smoothK_k > 27.4337 )
							if( smoothD_d <= 29.1804 )
								ret := -0.300000
							if( smoothD_d > 29.1804 )
								if( rsi1 <= 58.2565 )
									ret := 0.727273 // buy
								if( rsi1 > 58.2565 )
									ret := 0.153846
					if( smoothD_d > 31.7764 )
						if( rsi1 <= 39.0463 )
							if( rsi1 <= 38.8049 )
								if( rsi1 <= 38.0556 )
									ret := 0.119461
								if( rsi1 > 38.0556 )
									ret := -0.217822
							if( rsi1 > 38.8049 )
								if( k <= 39.1451 )
									ret := 0.846154 // buy
								if( k > 39.1451 )
									ret := 0.428571
						if( rsi1 > 39.0463 )
							if( smoothD_d <= 33.5516 )
								if( d_k <= 2.7421 )
									ret := -0.243243
								if( d_k > 2.7421 )
									ret := -0.788462 // sell
							if( smoothD_d > 33.5516 )
								if( rsi1 <= 68.2911 )
									ret := -0.024173
								if( rsi1 > 68.2911 )
									ret := -0.279874
			if( smoothK_k > 43.6761 )
				if( d_k <= -21.5614 )
					if( rsi1 <= 87.5973 )
						if( smoothD_d <= 44.4782 )
							if( smoothD_d <= 25.9106 )
								if( rsi1 <= 60.5536 )
									ret := 0.148387
								if( rsi1 > 60.5536 )
									ret := 0.743243 // buy
							if( smoothD_d > 25.9106 )
								if( smoothK_k <= 68.7488 )
									ret := 0.011509
								if( smoothK_k > 68.7488 )
									ret := -0.284810
						if( smoothD_d > 44.4782 )
							if( smoothK_k <= 76.7068 )
								if( k <= 75.9471 )
									ret := 0.261905
								if( k > 75.9471 )
									ret := 0.495935
							if( smoothK_k > 76.7068 )
								if( k <= 96.7052 )
									ret := 0.042929
								if( k > 96.7052 )
									ret := 0.309278
					if( rsi1 > 87.5973 )
						ret := -0.909091 // sell
				if( d_k > -21.5614 )
					if( smoothD_d <= 80.5287 )
						if( d <= 81.7727 )
							if( k <= 94.1486 )
								if( d <= 63.4387 )
									ret := -0.011406
								if( d > 63.4387 )
									ret := 0.039277
							if( k > 94.1486 )
								if( rsi1 <= 79.7432 )
									ret := -0.216931
								if( rsi1 > 79.7432 )
									ret := 0.555556
						if( d > 81.7727 )
							if( d <= 83.504 )
								if( k <= 71.2885 )
									ret := -0.176471
								if( k > 71.2885 )
									ret := 0.267872
							if( d > 83.504 )
								ret := 0.842105 // buy
					if( smoothD_d > 80.5287 )
						if( rsi1 <= 81.3497 )
							if( rsi1 <= 76.6488 )
								if( smoothK_k <= 62.511 )
									ret := -0.515152
								if( smoothK_k > 62.511 )
									ret := -0.005586
							if( rsi1 > 76.6488 )
								if( d_k <= -3.30929 )
									ret := -0.014706
								if( d_k > -3.30929 )
									ret := -0.200148
						if( rsi1 > 81.3497 )
							if( rsi1 <= 81.9157 )
								if( d_k <= 2.68692 )
									ret := 0.277027
								if( d_k > 2.68692 )
									ret := 0.636364
							if( rsi1 > 81.9157 )
								if( d_k <= -3.5247 )
									ret := -0.154791
								if( d_k > -3.5247 )
									ret := 0.074074
	
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
float op_operation = decision_tree_0_FFIV_15Min_2949cdef(d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


