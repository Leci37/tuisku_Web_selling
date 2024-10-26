//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: LINKUSDT_15Min_1WAV_a9e2c3ad Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LINKUSDT_15Min_1WAV_a9e2c3ad", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LINKUSDT_15Min_a9e2c3ad(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( d_tci <= 46.4997 )
		if( ap <= 7.07298 )
			if( wt2 <= -44.4409 )
				if( ci_wt2 <= 25.5207 )
					if( ci_wt2 <= 17.0275 )
						if( ci <= -34.5864 )
							if( esa <= 6.1832 )
								if( ci_wt2 <= -11.5521 )
									ret := 0.166667
								if( ci_wt2 > -11.5521 )
									ret := -0.461538
							if( esa > 6.1832 )
								if( wt2 <= -44.8305 )
									ret := 0.162162
								if( wt2 > -44.8305 )
									ret := 0.733333 // buy
						if( ci > -34.5864 )
							if( ci <= -34.1836 )
								ret := -1.000000 // sell
							if( ci > -34.1836 )
								if( wt2 <= -45.6016 )
									ret := -0.266667
								if( wt2 > -45.6016 )
									ret := 0.500000
					if( ci_wt2 > 17.0275 )
						if( ci <= -27.6943 )
							if( d_tci <= 45.041 )
								ret := 0.750000 // buy
							if( d_tci > 45.041 )
								ret := 1.000000 // buy
						if( ci > -27.6943 )
							if( ci_wt2 <= 25.1529 )
								if( d <= 0.020188 )
									ret := 0.375000
								if( d > 0.020188 )
									ret := 0.000000
							if( ci_wt2 > 25.1529 )
								ret := 1.000000 // buy
				if( ci_wt2 > 25.5207 )
					if( wt2 <= -46.5105 )
						if( ci <= 77.5397 )
							if( wt2 <= -56.581 )
								if( wt2 <= -57.7008 )
									ret := -0.250000
								if( wt2 > -57.7008 )
									ret := -0.900000 // sell
							if( wt2 > -56.581 )
								if( ci <= 3.75946 )
									ret := -0.223301
								if( ci > 3.75946 )
									ret := 0.028213
						if( ci > 77.5397 )
							if( d <= 0.056411 )
								if( ci <= 92.0522 )
									ret := 0.678571
								if( ci > 92.0522 )
									ret := 0.000000
							if( d > 0.056411 )
								ret := -0.600000
					if( wt2 > -46.5105 )
						if( d <= 0.048125 )
							if( ci_wt2 <= 42.2005 )
								if( esa <= 6.24599 )
									ret := 0.000000
								if( esa > 6.24599 )
									ret := -0.750000 // sell
							if( ci_wt2 > 42.2005 )
								if( esa <= 5.15843 )
									ret := 0.857143 // buy
								if( esa > 5.15843 )
									ret := -0.129252
						if( d > 0.048125 )
							if( d <= 0.053523 )
								if( ci <= 21.2156 )
									ret := -0.500000
								if( ci > 21.2156 )
									ret := -0.833333 // sell
							if( d > 0.053523 )
								ret := -1.000000 // sell
			if( wt2 > -44.4409 )
				if( tci <= -10.7816 )
					if( d <= 0.018729 )
						if( ci_wt2 <= 122.685 )
							if( ci_wt2 <= -125.861 )
								if( ci <= -240.168 )
									ret := 1.000000 // buy
								if( ci > -240.168 )
									ret := 0.129412
							if( ci_wt2 > -125.861 )
								if( esa <= 7.06456 )
									ret := -0.017041
								if( esa > 7.06456 )
									ret := -0.333333
						if( ci_wt2 > 122.685 )
							if( wt2 <= -28.694 )
								if( tci <= -19.0275 )
									ret := -0.241935
								if( tci > -19.0275 )
									ret := 0.120000
							if( wt2 > -28.694 )
								if( ci <= 105.03 )
									ret := -0.826087 // sell
								if( ci > 105.03 )
									ret := 0.000000
					if( d > 0.018729 )
						if( wt2 <= -11.4191 )
							if( tci <= -13.9507 )
								if( tci <= -15.0341 )
									ret := 0.133760
								if( tci > -15.0341 )
									ret := 0.566038
							if( tci > -13.9507 )
								if( d <= 0.053038 )
									ret := -0.105634
								if( d > 0.053038 )
									ret := -0.857143 // sell
						if( wt2 > -11.4191 )
							if( tci <= -18.9202 )
								if( ci <= -142.115 )
									ret := 0.407407
								if( ci > -142.115 )
									ret := -0.317073
							if( tci > -18.9202 )
								if( ap <= 6.29905 )
									ret := 0.287234
								if( ap > 6.29905 )
									ret := -0.022364
				if( tci > -10.7816 )
					if( tci <= 83.0486 )
						if( d <= 0.150244 )
							if( d <= 0.016056 )
								if( ci_wt2 <= 30.9822 )
									ret := 0.084437
								if( ci_wt2 > 30.9822 )
									ret := 0.021468
							if( d > 0.016056 )
								if( wt2 <= -3.002 )
									ret := 0.227828
								if( wt2 > -3.002 )
									ret := 0.096672
						if( d > 0.150244 )
							if( ci_wt2 <= 15.4317 )
								if( tci <= 38.9072 )
									ret := 0.800000 // buy
								if( tci > 38.9072 )
									ret := 1.000000 // buy
							if( ci_wt2 > 15.4317 )
								if( d_tci <= -33.201 )
									ret := -0.200000
								if( d_tci > -33.201 )
									ret := 1.000000 // buy
					if( tci > 83.0486 )
						if( ci <= 79.0956 )
							ret := 0.250000
						if( ci > 79.0956 )
							if( ap <= 6.60417 )
								if( wt2 <= 83.8257 )
									ret := -0.571429
								if( wt2 > 83.8257 )
									ret := -1.000000 // sell
							if( ap > 6.60417 )
								ret := -0.400000
		if( ap > 7.07298 )
			if( d_tci <= -69.6506 )
				if( d <= 0.077756 )
					if( tci <= 72.6276 )
						if( d <= 0.060318 )
							if( d <= 0.055904 )
								if( ci_wt2 <= 8.6423 )
									ret := 0.166667
								if( ci_wt2 > 8.6423 )
									ret := -0.311111
							if( d > 0.055904 )
								if( wt2 <= 72.2997 )
									ret := -0.884615 // sell
								if( wt2 > 72.2997 )
									ret := 0.250000
						if( d > 0.060318 )
							if( wt2 <= 73.4278 )
								if( ci_wt2 <= 58.7388 )
									ret := -0.200000
								if( ci_wt2 > 58.7388 )
									ret := 0.714286 // buy
							if( wt2 > 73.4278 )
								if( d <= 0.07057 )
									ret := 0.222222
								if( d > 0.07057 )
									ret := 1.000000 // buy
					if( tci > 72.6276 )
						if( ci <= 130.672 )
							if( wt2 <= 76.4026 )
								if( ci_wt2 <= -31.7107 )
									ret := -0.750000 // sell
								if( ci_wt2 > -31.7107 )
									ret := 0.413793
							if( wt2 > 76.4026 )
								if( ci <= 27.5295 )
									ret := 0.692308
								if( ci > 27.5295 )
									ret := -0.142857
						if( ci > 130.672 )
							if( ap <= 8.27703 )
								if( ci_wt2 <= 97.015 )
									ret := 0.600000
								if( ci_wt2 > 97.015 )
									ret := 0.000000
							if( ap > 8.27703 )
								if( ci <= 135.618 )
									ret := -1.000000 // sell
								if( ci > 135.618 )
									ret := -0.750000 // sell
				if( d > 0.077756 )
					if( d <= 0.261572 )
						if( wt2 <= 74.2107 )
							if( ci <= 130.941 )
								if( esa <= 7.4116 )
									ret := -0.333333
								if( esa > 7.4116 )
									ret := 0.608173
							if( ci > 130.941 )
								if( wt2 <= 61.6496 )
									ret := 0.666667
								if( wt2 > 61.6496 )
									ret := -0.518519
						if( wt2 > 74.2107 )
							if( d <= 0.199493 )
								if( esa <= 10.7793 )
									ret := -0.179688
								if( esa > 10.7793 )
									ret := 0.241830
							if( d > 0.199493 )
								if( d_tci <= -81.5168 )
									ret := 0.850000 // buy
								if( d_tci > -81.5168 )
									ret := 0.362319
					if( d > 0.261572 )
						if( tci <= 85.2839 )
							if( ci <= 36.205 )
								if( ci <= 31.1242 )
									ret := 0.750000 // buy
								if( ci > 31.1242 )
									ret := 1.000000 // buy
							if( ci > 36.205 )
								if( ci_wt2 <= 43.3438 )
									ret := -0.357895
								if( ci_wt2 > 43.3438 )
									ret := 0.700000 // buy
						if( tci > 85.2839 )
							if( wt2 <= 85.6168 )
								ret := 1.000000 // buy
							if( wt2 > 85.6168 )
								ret := 0.750000 // buy
			if( d_tci > -69.6506 )
				if( ap <= 20.5779 )
					if( tci <= 51.6166 )
						if( ci <= 103.63 )
							if( ci_wt2 <= -33.025 )
								if( ap <= 17.1218 )
									ret := 0.059874
								if( ap > 17.1218 )
									ret := -0.052495
							if( ci_wt2 > -33.025 )
								if( d_tci <= 14.917 )
									ret := 0.031032
								if( d_tci > 14.917 )
									ret := -0.017167
						if( ci > 103.63 )
							if( ap <= 13.7848 )
								if( ap <= 8.85844 )
									ret := -0.086606
								if( ap > 8.85844 )
									ret := 0.102290
							if( ap > 13.7848 )
								if( wt2 <= 44.8424 )
									ret := -0.142673
								if( wt2 > 44.8424 )
									ret := 0.588235
					if( tci > 51.6166 )
						if( ci <= 9.20765 )
							if( d <= 0.109571 )
								if( ci <= 8.48974 )
									ret := 0.057229
								if( ci > 8.48974 )
									ret := 0.823529 // buy
							if( d > 0.109571 )
								if( esa <= 14.286 )
									ret := -0.210526
								if( esa > 14.286 )
									ret := 0.752809 // buy
						if( ci > 9.20765 )
							if( ap <= 15.2032 )
								if( esa <= 10.569 )
									ret := -0.087447
								if( esa > 10.569 )
									ret := 0.056469
							if( ap > 15.2032 )
								if( d <= 0.162884 )
									ret := -0.223744
								if( d > 0.162884 )
									ret := 0.138728
				if( ap > 20.5779 )
					if( wt2 <= -39.8847 )
						ret := 1.000000 // buy
					if( wt2 > -39.8847 )
						if( ci_wt2 <= -59.2729 )
							if( wt2 <= 57.5745 )
								if( ci <= -152.842 )
									ret := 1.000000 // buy
								if( ci > -152.842 )
									ret := -0.146667
							if( wt2 > 57.5745 )
								ret := 1.000000 // buy
						if( ci_wt2 > -59.2729 )
							if( ci_wt2 <= 103.131 )
								if( d_tci <= 10.8292 )
									ret := -0.481481
								if( d_tci > 10.8292 )
									ret := -0.122449
							if( ci_wt2 > 103.131 )
								if( d_tci <= -24.9839 )
									ret := 0.500000
								if( d_tci > -24.9839 )
									ret := 0.052632
	if( d_tci > 46.4997 )
		if( d <= 0.028523 )
			if( ci_wt2 <= -103.377 )
				if( ap <= 5.81808 )
					if( ci <= -165.181 )
						if( tci <= -54.2335 )
							ret := 0.000000
						if( tci > -54.2335 )
							ret := 0.500000
					if( ci > -165.181 )
						if( d <= 0.016799 )
							ret := 0.750000 // buy
						if( d > 0.016799 )
							ret := 1.000000 // buy
				if( ap > 5.81808 )
					if( wt2 <= -39.8668 )
						if( d_tci <= 53.5453 )
							if( d_tci <= 52.5163 )
								if( tci <= -50.5341 )
									ret := 0.200000
								if( tci > -50.5341 )
									ret := -0.700000 // sell
							if( d_tci > 52.5163 )
								ret := -1.000000 // sell
						if( d_tci > 53.5453 )
							if( ci <= -152.545 )
								if( ci_wt2 <= -124.232 )
									ret := 0.476190
								if( ci_wt2 > -124.232 )
									ret := -0.200000
							if( ci > -152.545 )
								ret := 1.000000 // buy
					if( wt2 > -39.8668 )
						if( ci <= -150.93 )
							if( d_tci <= 52.3501 )
								if( d <= 0.014639 )
									ret := 0.142857
								if( d > 0.014639 )
									ret := 0.787234 // buy
							if( d_tci > 52.3501 )
								if( tci <= -55.2732 )
									ret := 1.000000 // buy
								if( tci > -55.2732 )
									ret := -0.666667
						if( ci > -150.93 )
							if( d_tci <= 47.9635 )
								ret := -0.500000
							if( d_tci > 47.9635 )
								if( ci_wt2 <= -109.803 )
									ret := -0.500000
								if( ci_wt2 > -109.803 )
									ret := 0.600000
			if( ci_wt2 > -103.377 )
				if( ci <= -141.005 )
					if( d_tci <= 57.5218 )
						if( ci <= -146.501 )
							ret := 0.250000
						if( ci > -146.501 )
							ret := 0.000000
					if( d_tci > 57.5218 )
						if( tci <= -66.725 )
							if( d_tci <= 70.3657 )
								ret := 0.250000
							if( d_tci > 70.3657 )
								ret := -0.666667
						if( tci > -66.725 )
							if( d <= 0.017476 )
								ret := -0.400000
							if( d > 0.017476 )
								ret := -1.000000 // sell
				if( ci > -141.005 )
					if( ap <= 5.8725 )
						if( d <= 0.024888 )
							if( tci <= -47.3622 )
								if( wt2 <= -50.5193 )
									ret := 0.219048
								if( wt2 > -50.5193 )
									ret := 0.000000
							if( tci > -47.3622 )
								if( d <= 0.018513 )
									ret := 0.714286 // buy
								if( d > 0.018513 )
									ret := 0.000000
						if( d > 0.024888 )
							if( esa <= 5.67395 )
								if( d <= 0.026176 )
									ret := 1.000000 // buy
								if( d > 0.026176 )
									ret := 0.750000 // buy
							if( esa > 5.67395 )
								if( ap <= 5.74416 )
									ret := -0.200000
								if( ap > 5.74416 )
									ret := 0.625000
					if( ap > 5.8725 )
						if( wt2 <= -36.2156 )
							if( d_tci <= 49.4932 )
								if( ci <= -115.703 )
									ret := 0.518519
								if( ci > -115.703 )
									ret := 0.043029
							if( d_tci > 49.4932 )
								if( wt2 <= -52.9832 )
									ret := -0.005882
								if( wt2 > -52.9832 )
									ret := -0.092375
						if( wt2 > -36.2156 )
							if( wt2 <= -35.2124 )
								if( ci_wt2 <= -72.7295 )
									ret := -0.500000
								if( ci_wt2 > -72.7295 )
									ret := -1.000000 // sell
							if( wt2 > -35.2124 )
								ret := 0.000000
		if( d > 0.028523 )
			if( ci <= -38.8068 )
				if( esa <= 7.08497 )
					if( tci <= -69.8801 )
						if( ap <= 5.73982 )
							if( d_tci <= 78.8549 )
								if( d <= 0.036508 )
									ret := 0.250000
								if( d > 0.036508 )
									ret := 1.000000 // buy
							if( d_tci > 78.8549 )
								if( ci_wt2 <= 7.54652 )
									ret := 0.500000
								if( ci_wt2 > 7.54652 )
									ret := -0.200000
						if( ap > 5.73982 )
							if( esa <= 6.46134 )
								if( ci <= -46.478 )
									ret := -0.161017
								if( ci > -46.478 )
									ret := -0.647059
							if( esa > 6.46134 )
								if( esa <= 6.81614 )
									ret := 0.309859
								if( esa > 6.81614 )
									ret := 0.043478
					if( tci > -69.8801 )
						if( ci <= -69.028 )
							if( d <= 0.071872 )
								if( wt2 <= -38.8074 )
									ret := 0.313797
								if( wt2 > -38.8074 )
									ret := 0.671429
							if( d > 0.071872 )
								if( ci <= -108.787 )
									ret := 0.445946
								if( ci > -108.787 )
									ret := -0.139535
						if( ci > -69.028 )
							if( d <= 0.03962 )
								if( d <= 0.031453 )
									ret := -0.097222
								if( d > 0.031453 )
									ret := 0.269841
							if( d > 0.03962 )
								if( esa <= 6.59138 )
									ret := 0.699588
								if( esa > 6.59138 )
									ret := 0.440828
				if( esa > 7.08497 )
					if( ap <= 14.5951 )
						if( tci <= -81.4113 )
							if( tci <= -87.4212 )
								if( ci <= -99.9818 )
									ret := -0.285714
								if( ci > -99.9818 )
									ret := 0.863636 // buy
							if( tci > -87.4212 )
								if( d <= 0.540649 )
									ret := -0.509259
								if( d > 0.540649 )
									ret := 1.000000 // buy
						if( tci > -81.4113 )
							if( d <= 0.096399 )
								if( ap <= 7.79217 )
									ret := 0.192661
								if( ap > 7.79217 )
									ret := 0.058798
							if( d > 0.096399 )
								if( ci_wt2 <= -13.3984 )
									ret := 0.347051
								if( ci_wt2 > -13.3984 )
									ret := 0.043630
					if( ap > 14.5951 )
						if( d <= 0.200938 )
							if( ap <= 20.3081 )
								if( d_tci <= 59.2265 )
									ret := 0.307393
								if( d_tci > 59.2265 )
									ret := 0.101770
							if( ap > 20.3081 )
								if( d_tci <= 64.8331 )
									ret := -0.727273 // sell
								if( d_tci > 64.8331 )
									ret := 0.000000
						if( d > 0.200938 )
							if( d_tci <= 87.9629 )
								if( ap <= 18.7782 )
									ret := 0.846847 // buy
								if( ap > 18.7782 )
									ret := 0.270833
							if( d_tci > 87.9629 )
								ret := -1.000000 // sell
			if( ci > -38.8068 )
				if( d_tci <= 59.244 )
					if( ap <= 7.14464 )
						if( ci_wt2 <= 75.7315 )
							if( ci <= 12.8615 )
								if( ci_wt2 <= 65.5374 )
									ret := 0.352941
								if( ci_wt2 > 65.5374 )
									ret := -0.208333
							if( ci > 12.8615 )
								if( ap <= 5.84757 )
									ret := 0.750000 // buy
								if( ap > 5.84757 )
									ret := 1.000000 // buy
						if( ci_wt2 > 75.7315 )
							if( ci_wt2 <= 118.131 )
								if( ci_wt2 <= 91.1025 )
									ret := -0.653846
								if( ci_wt2 > 91.1025 )
									ret := 0.000000
							if( ci_wt2 > 118.131 )
								ret := 1.000000 // buy
					if( ap > 7.14464 )
						if( ci_wt2 <= 109.634 )
							if( ap <= 17.1803 )
								if( ci_wt2 <= 11.3193 )
									ret := 0.777778 // buy
								if( ci_wt2 > 11.3193 )
									ret := 0.111212
							if( ap > 17.1803 )
								if( ci_wt2 <= 44.9083 )
									ret := 0.034783
								if( ci_wt2 > 44.9083 )
									ret := -0.432836
						if( ci_wt2 > 109.634 )
							if( ap <= 13.1258 )
								if( ci_wt2 <= 124.728 )
									ret := -0.960000 // sell
								if( ci_wt2 > 124.728 )
									ret := -0.500000
							if( ap > 13.1258 )
								ret := -0.285714
				if( d_tci > 59.244 )
					if( ci <= -19.8489 )
						if( wt2 <= -77.9862 )
							if( esa <= 7.20102 )
								if( d_tci <= 74.3132 )
									ret := 0.555556
								if( d_tci > 74.3132 )
									ret := -0.333333
							if( esa > 7.20102 )
								if( ci <= -34.2768 )
									ret := 1.000000 // buy
								if( ci > -34.2768 )
									ret := 0.800000 // buy
						if( wt2 > -77.9862 )
							if( d <= 0.054496 )
								if( ci <= -21.7032 )
									ret := -0.111111
								if( ci > -21.7032 )
									ret := 0.357143
							if( d > 0.054496 )
								if( tci <= -60.7854 )
									ret := -0.302682
								if( tci > -60.7854 )
									ret := -0.715909 // sell
					if( ci > -19.8489 )
						if( ci_wt2 <= 50.4395 )
							if( esa <= 13.4453 )
								if( ci <= -15.6781 )
									ret := 0.869565 // buy
								if( ci > -15.6781 )
									ret := 0.250000
							if( esa > 13.4453 )
								if( ci_wt2 <= 46.101 )
									ret := 0.600000
								if( ci_wt2 > 46.101 )
									ret := -0.250000
						if( ci_wt2 > 50.4395 )
							if( ci_wt2 <= 55.033 )
								if( ci <= -14.4607 )
									ret := -0.076923
								if( ci > -14.4607 )
									ret := -0.708333 // sell
							if( ci_wt2 > 55.033 )
								if( d <= 0.11848 )
									ret := -0.124031
								if( d > 0.11848 )
									ret := 0.451613
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Wave_Trend_Calculation 
//@version=5
//indicator "WaveTrend [LazyBear]", shorttitle="WT_LB", overlay=false)

n1 = input.int(10, title="Channel Length")
n2 = input.int(21, title="Average Length")
obLevel1 = input.float(60, title="Over Bought Level 1")
obLevel2 = input.float(53, title="Over Bought Level 2")
osLevel1 = input.float(-60, title="Over Sold Level 1")
osLevel2 = input.float(-53, title="Over Sold Level 2")

ap = hlc3
esa = ta.ema(ap, n1)
d = ta.ema(math.abs(ap - esa), n1)
ci = (ap - esa) / (0.015 * d)
tci = ta.ema(ci, n2)

wt1 = tci
wt2 = ta.sma(wt1, 4)

d_tci = d-tci
ci_wt2 = ci - wt2

plot(0, color=color.gray)
plot(obLevel1, color=color.red)
plot(osLevel1, color=color.green)
plot(obLevel2, color=color.red, linewidth=2, style=plot.style_line, title="OB Level 2 (Dashed)", color=color.red)
plot(osLevel2, color=color.green, linewidth=2, style=plot.style_line, title="OS Level 2 (Dashed)", color=color.green)

plot(wt1, color=color.green, title="WT1")
plot(wt2, color=color.red, title="WT2", style=plot.style_line, linewidth=1)
plot(wt1 - wt2, color=color.new(color.blue, 80), title="WT1-WT2", style=plot.style_area)

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
float op_operation = decision_tree_0_LINKUSDT_15Min_a9e2c3ad(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)

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


