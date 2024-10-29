//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: DOTUSDT_30Min_1WAV_aa615235 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOTUSDT_30Min_1WAV_aa615235", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOTUSDT_30Min_aa615235(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ci <= -13.6978 )
		if( d <= 0.037177 )
			if( ci <= -19.333 )
				if( ci_wt2 <= -173.453 )
					if( wt2 <= 25.2112 )
						if( d_tci <= -7.26526 )
							ret := 0.750000 // buy
						if( d_tci > -7.26526 )
							if( ci_wt2 <= -207.044 )
								if( d <= 0.028004 )
									ret := 0.000000
								if( d > 0.028004 )
									ret := 0.800000 // buy
							if( ci_wt2 > -207.044 )
								if( d <= 0.009111 )
									ret := 0.500000
								if( d > 0.009111 )
									ret := -0.333333
					if( wt2 > 25.2112 )
						if( wt2 <= 39.8968 )
							if( ap <= 5.31991 )
								if( ap <= 5.16393 )
									ret := -0.545455
								if( ap > 5.16393 )
									ret := 0.000000
							if( ap > 5.31991 )
								if( d <= 0.015823 )
									ret := -0.250000
								if( d > 0.015823 )
									ret := -0.814815 // sell
						if( wt2 > 39.8968 )
							ret := 0.333333
				if( ci_wt2 > -173.453 )
					if( d <= 0.022463 )
						if( d_tci <= 46.357 )
							if( ci <= -26.3399 )
								if( ci_wt2 <= -14.2802 )
									ret := -0.004315
								if( ci_wt2 > -14.2802 )
									ret := 0.115942
							if( ci > -26.3399 )
								if( ap <= 5.90784 )
									ret := -0.169154
								if( ap > 5.90784 )
									ret := 0.040000
						if( d_tci > 46.357 )
							if( esa <= 4.07672 )
								if( ci <= -168.555 )
									ret := -0.500000
								if( ci > -168.555 )
									ret := 0.027972
							if( esa > 4.07672 )
								if( ci_wt2 <= 1.6185 )
									ret := -0.084084
								if( ci_wt2 > 1.6185 )
									ret := -0.208791
					if( d > 0.022463 )
						if( esa <= 8.35448 )
							if( wt2 <= 22.891 )
								if( wt2 <= 19.2229 )
									ret := 0.042332
								if( wt2 > 19.2229 )
									ret := -0.321101
							if( wt2 > 22.891 )
								if( ci <= -23.9217 )
									ret := 0.231847
								if( ci > -23.9217 )
									ret := -0.281250
						if( esa > 8.35448 )
							if( d_tci <= -0.52694 )
								if( d <= 0.036267 )
									ret := 0.160000
								if( d > 0.036267 )
									ret := -0.500000
							if( d_tci > -0.52694 )
								if( ci <= -96.3984 )
									ret := 0.044118
								if( ci > -96.3984 )
									ret := -0.296703
			if( ci > -19.333 )
				if( ap <= 5.17428 )
					if( d <= 0.028867 )
						if( d_tci <= 4.9673 )
							if( tci <= 5.07758 )
								if( ap <= 4.64949 )
									ret := -0.300000
								if( ap > 4.64949 )
									ret := -0.769231 // sell
							if( tci > 5.07758 )
								if( ci <= -13.9665 )
									ret := -0.056180
								if( ci > -13.9665 )
									ret := -1.000000 // sell
						if( d_tci > 4.9673 )
							if( d <= 0.013499 )
								if( esa <= 4.25599 )
									ret := 0.035714
								if( esa > 4.25599 )
									ret := -0.179487
							if( d > 0.013499 )
								if( d_tci <= 42.0024 )
									ret := 0.441176
								if( d_tci > 42.0024 )
									ret := 0.068966
					if( d > 0.028867 )
						if( d_tci <= -43.1231 )
							ret := 1.000000 // buy
						if( d_tci > -43.1231 )
							if( tci <= 30.517 )
								if( ap <= 4.22555 )
									ret := -0.250000
								if( ap > 4.22555 )
									ret := 0.636364
							if( tci > 30.517 )
								ret := -0.250000
				if( ap > 5.17428 )
					if( d <= 0.015078 )
						if( ap <= 6.284 )
							if( ci <= -14.3594 )
								if( esa <= 6.00508 )
									ret := -0.036364
								if( esa > 6.00508 )
									ret := 0.294118
							if( ci > -14.3594 )
								if( esa <= 5.63485 )
									ret := 0.615385
								if( esa > 5.63485 )
									ret := -0.250000
						if( ap > 6.284 )
							if( tci <= -7.9111 )
								if( esa <= 6.7349 )
									ret := -0.833333 // sell
								if( esa > 6.7349 )
									ret := -0.200000
							if( tci > -7.9111 )
								if( ci <= -16.5953 )
									ret := 0.100000
								if( ci > -16.5953 )
									ret := -0.230769
					if( d > 0.015078 )
						if( d_tci <= 38.1176 )
							if( ci_wt2 <= 13.349 )
								if( tci <= -20.2655 )
									ret := -0.139535
								if( tci > -20.2655 )
									ret := 0.338290
							if( ci_wt2 > 13.349 )
								if( ap <= 5.84653 )
									ret := 0.933333 // buy
								if( ap > 5.84653 )
									ret := 0.500000
						if( d_tci > 38.1176 )
							if( tci <= -41.6995 )
								if( d <= 0.020801 )
									ret := 0.000000
								if( d > 0.020801 )
									ret := 0.387755
							if( tci > -41.6995 )
								if( ap <= 6.69847 )
									ret := -1.000000 // sell
								if( ap > 6.69847 )
									ret := -0.181818
		if( d > 0.037177 )
			if( d_tci <= 48.1467 )
				if( esa <= 41.3799 )
					if( esa <= 6.62473 )
						if( d <= 0.085517 )
							if( wt2 <= 22.867 )
								if( ci <= -121.131 )
									ret := -0.103659
								if( ci > -121.131 )
									ret := 0.190586
							if( wt2 > 22.867 )
								if( wt2 <= 31.3102 )
									ret := 0.683544
								if( wt2 > 31.3102 )
									ret := 0.242424
						if( d > 0.085517 )
							if( ci <= -148.957 )
								ret := 1.000000 // buy
							if( ci > -148.957 )
								if( d_tci <= 30.5561 )
									ret := 0.140351
								if( d_tci > 30.5561 )
									ret := 0.576923
					if( esa > 6.62473 )
						if( d <= 0.259967 )
							if( ci <= -146.274 )
								if( ci_wt2 <= -216.723 )
									ret := -0.358974
								if( ci_wt2 > -216.723 )
									ret := 0.295547
							if( ci > -146.274 )
								if( ci <= -22.8815 )
									ret := 0.058703
								if( ci > -22.8815 )
									ret := 0.198428
						if( d > 0.259967 )
							if( tci <= 45.2044 )
								if( ap <= 31.5804 )
									ret := 0.277419
								if( ap > 31.5804 )
									ret := 0.105004
							if( tci > 45.2044 )
								if( ci_wt2 <= -114.287 )
									ret := 0.285714
								if( ci_wt2 > -114.287 )
									ret := 0.770270 // buy
				if( esa > 41.3799 )
					if( ci <= -33.6052 )
						if( tci <= 20.3509 )
							if( wt2 <= 18.775 )
								if( ci <= -130.198 )
									ret := 0.265625
								if( ci > -130.198 )
									ret := -0.124260
							if( wt2 > 18.775 )
								if( wt2 <= 25.5981 )
									ret := 0.549020
								if( wt2 > 25.5981 )
									ret := -0.269231
						if( tci > 20.3509 )
							if( ci <= -45.9653 )
								if( esa <= 48.0551 )
									ret := -0.666667
								if( esa > 48.0551 )
									ret := 0.222222
							if( ci > -45.9653 )
								if( d_tci <= -37.7755 )
									ret := 0.750000 // buy
								if( d_tci > -37.7755 )
									ret := 0.000000
					if( ci > -33.6052 )
						if( d_tci <= 24.6579 )
							if( ci <= -20.8976 )
								if( ap <= 41.6363 )
									ret := 0.200000
								if( ap > 41.6363 )
									ret := -0.734940 // sell
							if( ci > -20.8976 )
								if( ci <= -19.5396 )
									ret := 0.800000 // buy
								if( ci > -19.5396 )
									ret := -0.142857
						if( d_tci > 24.6579 )
							if( ci <= -27.6489 )
								if( ci <= -32.3083 )
									ret := -0.400000
								if( ci > -32.3083 )
									ret := 0.750000 // buy
							if( ci > -27.6489 )
								if( d <= 0.255463 )
									ret := 0.000000
								if( d > 0.255463 )
									ret := -0.720000 // sell
			if( d_tci > 48.1467 )
				if( wt2 <= -61.9003 )
					if( ci <= -75.6101 )
						if( ci_wt2 <= -6.18182 )
							if( d_tci <= 80.0229 )
								if( d <= 0.662301 )
									ret := 0.211200
								if( d > 0.662301 )
									ret := 0.753086 // buy
							if( d_tci > 80.0229 )
								if( d_tci <= 89.307 )
									ret := 0.719101 // buy
								if( d_tci > 89.307 )
									ret := -0.416667
						if( ci_wt2 > -6.18182 )
							if( ci_wt2 <= 1.85156 )
								if( d <= 0.043807 )
									ret := 0.000000
								if( d > 0.043807 )
									ret := 0.796875 // buy
							if( ci_wt2 > 1.85156 )
								if( ci_wt2 <= 12.7078 )
									ret := -0.714286 // sell
								if( ci_wt2 > 12.7078 )
									ret := 0.666667
					if( ci > -75.6101 )
						if( esa <= 17.9218 )
							if( d <= 0.495885 )
								if( wt2 <= -71.9203 )
									ret := -0.132890
								if( wt2 > -71.9203 )
									ret := 0.143043
							if( d > 0.495885 )
								if( d_tci <= 70.9111 )
									ret := 0.840000 // buy
								if( d_tci > 70.9111 )
									ret := 0.400000
						if( esa > 17.9218 )
							if( wt2 <= -75.3427 )
								if( esa <= 19.0633 )
									ret := -0.400000
								if( esa > 19.0633 )
									ret := 0.557692
							if( wt2 > -75.3427 )
								if( ci_wt2 <= 12.7122 )
									ret := -0.005464
								if( ci_wt2 > 12.7122 )
									ret := -0.413889
				if( wt2 > -61.9003 )
					if( d <= 0.772305 )
						if( wt2 <= -50.8342 )
							if( ci <= -158.125 )
								if( ci <= -173.558 )
									ret := 0.409091
								if( ci > -173.558 )
									ret := -0.733333 // sell
							if( ci > -158.125 )
								if( ci_wt2 <= -36.1726 )
									ret := 0.411590
								if( ci_wt2 > -36.1726 )
									ret := 0.224661
						if( wt2 > -50.8342 )
							if( ci <= -61.4636 )
								if( d_tci <= 51.7187 )
									ret := 0.303279
								if( d_tci > 51.7187 )
									ret := 0.108738
							if( ci > -61.4636 )
								if( ap <= 7.45124 )
									ret := 0.339806
								if( ap > 7.45124 )
									ret := -0.159170
					if( d > 0.772305 )
						if( ci <= -23.1552 )
							if( esa <= 41.8989 )
								if( wt2 <= -60.6601 )
									ret := 0.272727
								if( wt2 > -60.6601 )
									ret := 0.822785 // buy
							if( esa > 41.8989 )
								if( ap <= 41.622 )
									ret := -0.625000
								if( ap > 41.622 )
									ret := 0.791667 // buy
						if( ci > -23.1552 )
							ret := -0.750000 // sell
	if( ci > -13.6978 )
		if( esa <= 36.1967 )
			if( ci <= 129.526 )
				if( ci_wt2 <= 43.8506 )
					if( ci_wt2 <= -7.59279 )
						if( d <= 0.353525 )
							if( ci_wt2 <= -65.535 )
								if( ci <= -7.20743 )
									ret := 0.000000
								if( ci > -7.20743 )
									ret := -0.468750
							if( ci_wt2 > -65.535 )
								if( ap <= 22.3179 )
									ret := 0.030841
								if( ap > 22.3179 )
									ret := 0.122172
						if( d > 0.353525 )
							if( ci_wt2 <= -10.7273 )
								if( esa <= 30.3528 )
									ret := 0.417445
								if( esa > 30.3528 )
									ret := -0.017442
							if( ci_wt2 > -10.7273 )
								if( d_tci <= -37.995 )
									ret := -0.553571
								if( d_tci > -37.995 )
									ret := 0.750000 // buy
					if( ci_wt2 > -7.59279 )
						if( wt2 <= -42.1019 )
							if( d <= 0.170513 )
								if( ap <= 4.38983 )
									ret := -0.034483
								if( ap > 4.38983 )
									ret := 0.405000
							if( d > 0.170513 )
								if( esa <= 27.2777 )
									ret := -0.666667
								if( esa > 27.2777 )
									ret := 0.300000
						if( wt2 > -42.1019 )
							if( tci <= -30.8543 )
								if( ap <= 10.2876 )
									ret := -0.122517
								if( ap > 10.2876 )
									ret := -0.452055
							if( tci > -30.8543 )
								if( wt2 <= 31.7328 )
									ret := 0.008057
								if( wt2 > 31.7328 )
									ret := -0.053289
				if( ci_wt2 > 43.8506 )
					if( d <= 0.097449 )
						if( d <= 0.018583 )
							if( tci <= -22.7391 )
								if( ap <= 4.01049 )
									ret := 0.195652
								if( ap > 4.01049 )
									ret := -0.058594
							if( tci > -22.7391 )
								if( ci_wt2 <= 110.776 )
									ret := 0.024006
								if( ci_wt2 > 110.776 )
									ret := 0.114114
						if( d > 0.018583 )
							if( d_tci <= 73.031 )
								if( d <= 0.096916 )
									ret := 0.076982
								if( d > 0.096916 )
									ret := 0.636364
							if( d_tci > 73.031 )
								if( d <= 0.03843 )
									ret := -0.750000 // sell
								if( d > 0.03843 )
									ret := -1.000000 // sell
					if( d > 0.097449 )
						if( ap <= 29.9687 )
							if( d <= 0.399425 )
								if( ci <= 81.2641 )
									ret := -0.120297
								if( ci > 81.2641 )
									ret := -0.011958
							if( d > 0.399425 )
								if( d <= 0.773881 )
									ret := 0.255754
								if( d > 0.773881 )
									ret := -0.300000
						if( ap > 29.9687 )
							if( d <= 0.726466 )
								if( ci <= 121.845 )
									ret := 0.094460
								if( ci > 121.845 )
									ret := 0.542373
							if( d > 0.726466 )
								if( wt2 <= -40.6311 )
									ret := 0.538462
								if( wt2 > -40.6311 )
									ret := -0.647059
			if( ci > 129.526 )
				if( tci <= 1.91453 )
					if( d <= 0.220752 )
						if( ci_wt2 <= 150.712 )
							if( d_tci <= -0.514458 )
								if( wt2 <= -10.9853 )
									ret := 1.000000 // buy
								if( wt2 > -10.9853 )
									ret := 0.750000 // buy
							if( d_tci > -0.514458 )
								if( ap <= 27.6417 )
									ret := 0.333333
								if( ap > 27.6417 )
									ret := 1.000000 // buy
						if( ci_wt2 > 150.712 )
							if( d <= 0.158852 )
								if( ap <= 7.14234 )
									ret := 0.430168
								if( ap > 7.14234 )
									ret := 0.066038
							if( d > 0.158852 )
								if( d <= 0.210044 )
									ret := 0.888889 // buy
								if( d > 0.210044 )
									ret := 0.500000
					if( d > 0.220752 )
						if( ap <= 30.7299 )
							if( tci <= -5.91705 )
								if( ap <= 27.3525 )
									ret := 0.750000 // buy
								if( ap > 27.3525 )
									ret := -0.250000
							if( tci > -5.91705 )
								if( ci_wt2 <= 162.698 )
									ret := -1.000000 // sell
								if( ci_wt2 > 162.698 )
									ret := -0.571429
						if( ap > 30.7299 )
							if( ci <= 143.618 )
								if( ap <= 32.932 )
									ret := 1.000000 // buy
								if( ap > 32.932 )
									ret := 0.750000 // buy
							if( ci > 143.618 )
								ret := -0.400000
				if( tci > 1.91453 )
					if( ci_wt2 <= 88.2395 )
						if( ap <= 30.8128 )
							if( d <= 0.048233 )
								if( tci <= 58.8048 )
									ret := 0.600000
								if( tci > 58.8048 )
									ret := 0.022727
							if( d > 0.048233 )
								if( ci <= 133.298 )
									ret := 0.488372
								if( ci > 133.298 )
									ret := 0.909091 // buy
						if( ap > 30.8128 )
							if( d_tci <= -61.9552 )
								if( ci <= 139.495 )
									ret := -1.000000 // sell
								if( ci > 139.495 )
									ret := -0.250000
							if( d_tci > -61.9552 )
								ret := 0.800000 // buy
					if( ci_wt2 > 88.2395 )
						if( wt2 <= 3.21785 )
							if( ci_wt2 <= 159.807 )
								if( d_tci <= -17.3313 )
									ret := -0.581818
								if( d_tci > -17.3313 )
									ret := 0.076305
							if( ci_wt2 > 159.807 )
								if( ci <= 164.395 )
									ret := -0.538462
								if( ci > 164.395 )
									ret := -0.164634
						if( wt2 > 3.21785 )
							if( d_tci <= -32.727 )
								if( ci <= 210.699 )
									ret := 0.033272
								if( ci > 210.699 )
									ret := -0.676471
							if( d_tci > -32.727 )
								if( d_tci <= -28.8531 )
									ret := 0.437500
								if( d_tci > -28.8531 )
									ret := 0.161644
		if( esa > 36.1967 )
			if( d <= 0.877973 )
				if( d <= 0.249612 )
					if( esa <= 46.0539 )
						if( ci_wt2 <= -24.0145 )
							if( ci <= 15.4784 )
								if( ci_wt2 <= -43.2308 )
									ret := 0.066667
								if( ci_wt2 > -43.2308 )
									ret := -0.548387
							if( ci > 15.4784 )
								if( ap <= 38.808 )
									ret := 0.800000 // buy
								if( ap > 38.808 )
									ret := 0.500000
						if( ci_wt2 > -24.0145 )
							if( ci_wt2 <= -19.6181 )
								if( d <= 0.157739 )
									ret := 0.000000
								if( d > 0.157739 )
									ret := 1.000000 // buy
							if( ci_wt2 > -19.6181 )
								if( wt2 <= -23.4226 )
									ret := -0.114537
								if( wt2 > -23.4226 )
									ret := 0.082111
					if( esa > 46.0539 )
						if( wt2 <= -41.2759 )
							if( d <= 0.17783 )
								ret := 0.800000 // buy
							if( d > 0.17783 )
								ret := -0.500000
						if( wt2 > -41.2759 )
							if( d <= 0.245917 )
								if( d_tci <= 32.0304 )
									ret := -0.277778
								if( d_tci > 32.0304 )
									ret := -1.000000 // sell
							if( d > 0.245917 )
								ret := -1.000000 // sell
				if( d > 0.249612 )
					if( tci <= 45.8827 )
						if( esa <= 42.8215 )
							if( ci_wt2 <= 20.9889 )
								if( ci_wt2 <= -51.5752 )
									ret := -0.875000 // sell
								if( ci_wt2 > -51.5752 )
									ret := 0.243802
							if( ci_wt2 > 20.9889 )
								if( wt2 <= -49.6821 )
									ret := 0.253731
								if( wt2 > -49.6821 )
									ret := -0.222384
						if( esa > 42.8215 )
							if( d_tci <= -8.80538 )
								if( wt2 <= 6.04854 )
									ret := -0.840000 // sell
								if( wt2 > 6.04854 )
									ret := -0.383420
							if( d_tci > -8.80538 )
								if( ap <= 46.1635 )
									ret := -0.439560
								if( ap > 46.1635 )
									ret := 0.262295
					if( tci > 45.8827 )
						if( d_tci <= -62.6263 )
							if( esa <= 42.9553 )
								if( ci_wt2 <= 61.3691 )
									ret := -0.347368
								if( ci_wt2 > 61.3691 )
									ret := 0.545455
							if( esa > 42.9553 )
								if( ci <= 64.0752 )
									ret := 0.500000
								if( ci > 64.0752 )
									ret := 0.923077 // buy
						if( d_tci > -62.6263 )
							if( ci_wt2 <= 149.798 )
								if( ap <= 36.7217 )
									ret := -0.875000 // sell
								if( ap > 36.7217 )
									ret := -0.362069
							if( ci_wt2 > 149.798 )
								ret := 0.833333 // buy
			if( d > 0.877973 )
				if( ci_wt2 <= -26.7585 )
					if( ci <= 19.7515 )
						ret := -0.800000 // sell
					if( ci > 19.7515 )
						if( ci <= 41.5003 )
							if( d_tci <= -72.4387 )
								ret := 1.000000 // buy
							if( d_tci > -72.4387 )
								if( d <= 1.01556 )
									ret := 0.714286 // buy
								if( d > 1.01556 )
									ret := -1.000000 // sell
						if( ci > 41.5003 )
							if( d <= 1.21145 )
								ret := 1.000000 // buy
							if( d > 1.21145 )
								ret := 0.600000
				if( ci_wt2 > -26.7585 )
					if( ci_wt2 <= 75.8329 )
						if( ci_wt2 <= 62.0423 )
							if( esa <= 42.6952 )
								if( ci <= 60.7574 )
									ret := -0.869565 // sell
								if( ci > 60.7574 )
									ret := -0.136364
							if( esa > 42.6952 )
								if( d <= 1.16196 )
									ret := 0.454545
								if( d > 1.16196 )
									ret := -0.666667
						if( ci_wt2 > 62.0423 )
							if( d_tci <= -71.7006 )
								ret := -0.250000
							if( d_tci > -71.7006 )
								if( ci <= 109.821 )
									ret := 0.666667
								if( ci > 109.821 )
									ret := 1.000000 // buy
					if( ci_wt2 > 75.8329 )
						if( ap <= 40.4771 )
							ret := -0.500000
						if( ap > 40.4771 )
							ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_DOTUSDT_30Min_aa615235(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)

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


