//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: PYPL_1Min_2ST0_cf2404e2 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PYPL_1Min_2ST0_cf2404e2", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PYPL_1Min_cf2404e2(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( rsi1 <= 55.6272 )
		if( ema12 <= -0.096248 )
			if( ema3 <= 64.6604 )
				if( d <= 9.31709 )
					if( ema3 <= 62.529 )
						if( smoothK_k <= 0.612663 )
							if( rsi1 <= 14.1603 )
								if( tema <= 61.7486 )
									ret := 0.307692
								if( tema > 61.7486 )
									ret := -0.600000
							if( rsi1 > 14.1603 )
								if( ema13 <= -0.19152 )
									ret := 0.949153 // buy
								if( ema13 > -0.19152 )
									ret := 0.583333
						if( smoothK_k > 0.612663 )
							if( rsi1 <= 21.8791 )
								if( smoothD_d <= -0.219119 )
									ret := 0.333333
								if( smoothD_d > -0.219119 )
									ret := -0.760000 // sell
							if( rsi1 > 21.8791 )
								if( rsi1 <= 31.2295 )
									ret := 0.128205
								if( rsi1 > 31.2295 )
									ret := 0.750000 // buy
					if( ema3 > 62.529 )
						if( ema12 <= -0.223613 )
							if( ema12 <= -0.324919 )
								if( d <= 2.78054 )
									ret := 0.500000
								if( d > 2.78054 )
									ret := 0.250000
							if( ema12 > -0.324919 )
								if( ema13 <= -0.499077 )
									ret := -0.428571
								if( ema13 > -0.499077 )
									ret := -0.952381 // sell
						if( ema12 > -0.223613 )
							if( ema13 <= -0.260618 )
								if( ema2 <= 63.1169 )
									ret := 0.000000
								if( ema2 > 63.1169 )
									ret := 0.762712 // buy
							if( ema13 > -0.260618 )
								if( d <= 8.31893 )
									ret := 0.090909
								if( d > 8.31893 )
									ret := -0.857143 // sell
				if( d > 9.31709 )
					if( ema2 <= 60.1585 )
						if( d_k <= 8.75017 )
							if( ema12 <= -0.204157 )
								if( ema13 <= -1.30134 )
									ret := -0.500000
								if( ema13 > -1.30134 )
									ret := 0.900000 // buy
							if( ema12 > -0.204157 )
								if( ema2 <= 58.9971 )
									ret := 0.318182
								if( ema2 > 58.9971 )
									ret := -0.406250
						if( d_k > 8.75017 )
							if( d <= 25.5229 )
								if( ema3 <= 58.5716 )
									ret := 0.750000 // buy
								if( ema3 > 58.5716 )
									ret := 1.000000 // buy
							if( d > 25.5229 )
								if( smoothK_k <= 9.05124 )
									ret := -0.600000
								if( smoothK_k > 9.05124 )
									ret := 0.583333
					if( ema2 > 60.1585 )
						if( d <= 25.2817 )
							if( k <= 44.4052 )
								if( ema13 <= -0.236437 )
									ret := 0.851562 // buy
								if( ema13 > -0.236437 )
									ret := 0.530864
							if( k > 44.4052 )
								ret := -0.500000
						if( d > 25.2817 )
							if( smoothK_k <= 11.069 )
								if( rsi1 <= 23.7616 )
									ret := -1.000000 // sell
								if( rsi1 > 23.7616 )
									ret := 0.166667
							if( smoothK_k > 11.069 )
								if( ema12 <= -0.127597 )
									ret := 0.000000
								if( ema12 > -0.127597 )
									ret := 0.494949
			if( ema3 > 64.6604 )
				if( ema2 <= 74.622 )
					if( rsi1 <= 22.67 )
						if( ema2 <= 71.9575 )
							if( ema1 <= 68.7951 )
								if( tema <= 67.566 )
									ret := 0.272727
								if( tema > 67.566 )
									ret := -0.282609
							if( ema1 > 68.7951 )
								if( rsi1 <= 8.93583 )
									ret := -0.088889
								if( rsi1 > 8.93583 )
									ret := 0.620112
						if( ema2 > 71.9575 )
							if( k <= 20.2948 )
								if( rsi1 <= 13.4018 )
									ret := -0.842105 // sell
								if( rsi1 > 13.4018 )
									ret := -0.307692
							if( k > 20.2948 )
								if( d_k <= -6.36559 )
									ret := 0.250000
								if( d_k > -6.36559 )
									ret := 1.000000 // buy
					if( rsi1 > 22.67 )
						if( d_k <= -11.5446 )
							if( ema13 <= -0.23925 )
								if( k <= 63.2467 )
									ret := -0.903226 // sell
								if( k > 63.2467 )
									ret := -0.222222
							if( ema13 > -0.23925 )
								if( tema <= 71.7142 )
									ret := 0.103448
								if( tema > 71.7142 )
									ret := -1.000000 // sell
						if( d_k > -11.5446 )
							if( k <= 33.357 )
								if( ema2 <= 70.7592 )
									ret := -0.258398
								if( ema2 > 70.7592 )
									ret := 0.273381
							if( k > 33.357 )
								if( k <= 96.3636 )
									ret := 0.227273
								if( k > 96.3636 )
									ret := 1.000000 // buy
				if( ema2 > 74.622 )
					if( ema1 <= 79.1934 )
						if( smoothK_k <= 59.8669 )
							if( k <= 14.3594 )
								if( ema12 <= -0.119019 )
									ret := 0.602273
								if( ema12 > -0.119019 )
									ret := 0.150943
							if( k > 14.3594 )
								if( rsi1 <= 39.5329 )
									ret := 0.773913 // buy
								if( rsi1 > 39.5329 )
									ret := 0.090909
						if( smoothK_k > 59.8669 )
							if( smoothD_d <= 57.8027 )
								ret := -1.000000 // sell
							if( smoothD_d > 57.8027 )
								if( d_k <= -1.74331 )
									ret := 1.000000 // buy
								if( d_k > -1.74331 )
									ret := 0.111111
					if( ema1 > 79.1934 )
						if( rsi1 <= 35.693 )
							if( d_k <= -6.28468 )
								if( smoothD_d <= 11.1733 )
									ret := -0.900000 // sell
								if( smoothD_d > 11.1733 )
									ret := -0.300000
							if( d_k > -6.28468 )
								if( ema3 <= 80.5702 )
									ret := 0.395604
								if( ema3 > 80.5702 )
									ret := -0.261905
						if( rsi1 > 35.693 )
							if( k <= 79.8846 )
								ret := -1.000000 // sell
							if( k > 79.8846 )
								ret := -0.750000 // sell
		if( ema12 > -0.096248 )
			if( d_k <= -11.9183 )
				if( d <= 76.2782 )
					if( k <= 26.6984 )
						if( ema13 <= -0.006832 )
							if( rsi1 <= 44.3448 )
								if( k <= 23.6661 )
									ret := -0.486486
								if( k > 23.6661 )
									ret := -0.047619
							if( rsi1 > 44.3448 )
								if( k <= 22.388 )
									ret := -0.166667
								if( k > 22.388 )
									ret := -0.750000 // sell
						if( ema13 > -0.006832 )
							if( ema2 <= 75.3291 )
								if( d_k <= -12.8193 )
									ret := 0.000000
								if( d_k > -12.8193 )
									ret := -0.600000
							if( ema2 > 75.3291 )
								ret := 0.833333 // buy
					if( k > 26.6984 )
						if( ema12 <= -0.033557 )
							if( tema <= 57.8937 )
								if( d_k <= -17.8405 )
									ret := -1.000000 // sell
								if( d_k > -17.8405 )
									ret := -0.733333 // sell
							if( tema > 57.8937 )
								if( ema3 <= 80.2338 )
									ret := 0.071885
								if( ema3 > 80.2338 )
									ret := -0.655172
						if( ema12 > -0.033557 )
							if( ema13 <= -0.063121 )
								if( smoothK_k <= 74.8904 )
									ret := -0.288525
								if( smoothK_k > 74.8904 )
									ret := 0.000000
							if( ema13 > -0.063121 )
								if( ema12 <= -0.005764 )
									ret := 0.017121
								if( ema12 > -0.005764 )
									ret := -0.088485
				if( d > 76.2782 )
					if( k <= 95.1041 )
						if( ema13 <= -0.175801 )
							ret := -0.750000 // sell
						if( ema13 > -0.175801 )
							if( ema1 <= 64.1948 )
								if( smoothD_d <= 74.5022 )
									ret := 0.000000
								if( smoothD_d > 74.5022 )
									ret := 0.524590
							if( ema1 > 64.1948 )
								if( tema <= 71.947 )
									ret := 0.857143 // buy
								if( tema > 71.947 )
									ret := 0.421053
					if( k > 95.1041 )
						if( ema12 <= -0.06778 )
							ret := -0.857143 // sell
						if( ema12 > -0.06778 )
							if( d_k <= -17.6171 )
								if( d <= 78.5247 )
									ret := 0.000000
								if( d > 78.5247 )
									ret := -0.354839
							if( d_k > -17.6171 )
								if( tema <= 64.8843 )
									ret := -0.068493
								if( tema > 64.8843 )
									ret := 0.432432
			if( d_k > -11.9183 )
				if( d_k <= 3.54675 )
					if( ema12 <= -0.006261 )
						if( rsi1 <= 52.4031 )
							if( d_k <= 1.74299 )
								if( k <= 43.8674 )
									ret := 0.087941
								if( k > 43.8674 )
									ret := 0.146806
							if( d_k > 1.74299 )
								if( ema13 <= -0.051406 )
									ret := -0.075824
								if( ema13 > -0.051406 )
									ret := 0.088710
						if( rsi1 > 52.4031 )
							if( d_k <= -2.89761 )
								if( ema2 <= 58.5353 )
									ret := 0.500000
								if( ema2 > 58.5353 )
									ret := -0.314721
							if( d_k > -2.89761 )
								if( smoothD_d <= 92.6671 )
									ret := 0.200000
								if( smoothD_d > 92.6671 )
									ret := -0.323529
					if( ema12 > -0.006261 )
						if( ema3 <= 78.647 )
							if( smoothK_k <= 11.4084 )
								if( ema12 <= 0.047799 )
									ret := 0.155194
								if( ema12 > 0.047799 )
									ret := -0.558824
							if( smoothK_k > 11.4084 )
								if( ema12 <= 0.097181 )
									ret := 0.016057
								if( ema12 > 0.097181 )
									ret := 0.842105 // buy
						if( ema3 > 78.647 )
							if( d_k <= -7.67744 )
								if( ema12 <= 0.024563 )
									ret := 0.071429
								if( ema12 > 0.024563 )
									ret := 0.625000
							if( d_k > -7.67744 )
								if( ema3 <= 78.8359 )
									ret := -0.772727 // sell
								if( ema3 > 78.8359 )
									ret := -0.200573
				if( d_k > 3.54675 )
					if( smoothK_k <= 28.3451 )
						if( tema <= 59.0086 )
							if( d <= 52.0952 )
								if( k <= 18.1809 )
									ret := 0.129412
								if( k > 18.1809 )
									ret := 0.443966
							if( d > 52.0952 )
								if( k <= 30.5993 )
									ret := -0.714286 // sell
								if( k > 30.5993 )
									ret := -0.200000
						if( tema > 59.0086 )
							if( smoothD_d <= 42.7866 )
								if( d_k <= 16.7995 )
									ret := 0.054932
								if( d_k > 16.7995 )
									ret := 0.160027
							if( smoothD_d > 42.7866 )
								if( smoothD_d <= 53.6085 )
									ret := -0.134694
								if( smoothD_d > 53.6085 )
									ret := 0.368421
					if( smoothK_k > 28.3451 )
						if( ema13 <= 0.054703 )
							if( smoothD_d <= 36.6331 )
								if( ema3 <= 78.9711 )
									ret := 0.452991
								if( ema3 > 78.9711 )
									ret := -0.600000
							if( smoothD_d > 36.6331 )
								if( ema13 <= -0.181101 )
									ret := -0.523810
								if( ema13 > -0.181101 )
									ret := 0.150980
						if( ema13 > 0.054703 )
							if( ema2 <= 71.5521 )
								if( smoothK_k <= 77.1888 )
									ret := 0.474320
								if( smoothK_k > 77.1888 )
									ret := -0.100000
							if( ema2 > 71.5521 )
								if( d_k <= 14.5612 )
									ret := -0.179487
								if( d_k > 14.5612 )
									ret := 0.320755
	if( rsi1 > 55.6272 )
		if( ema12 <= 0.050961 )
			if( k <= 70.3283 )
				if( d_k <= -19.8167 )
					if( d <= 39.901 )
						if( ema12 <= 0.008172 )
							if( ema3 <= 66.8558 )
								if( k <= 66.2553 )
									ret := -0.658537
								if( k > 66.2553 )
									ret := 0.250000
							if( ema3 > 66.8558 )
								if( rsi1 <= 61.5208 )
									ret := 0.105263
								if( rsi1 > 61.5208 )
									ret := -0.857143 // sell
						if( ema12 > 0.008172 )
							if( smoothK_k <= 52.8616 )
								if( smoothK_k <= 40.8095 )
									ret := -0.461538
								if( smoothK_k > 40.8095 )
									ret := 0.197917
							if( smoothK_k > 52.8616 )
								if( tema <= 72.0922 )
									ret := -0.489583
								if( tema > 72.0922 )
									ret := 0.157895
					if( d > 39.901 )
						if( ema3 <= 62.6108 )
							if( ema3 <= 62.1536 )
								if( d_k <= -25.8571 )
									ret := 0.875000 // buy
								if( d_k > -25.8571 )
									ret := 0.130435
							if( ema3 > 62.1536 )
								ret := 1.000000 // buy
						if( ema3 > 62.6108 )
							if( smoothK_k <= 62.2693 )
								if( ema13 <= 0.049931 )
									ret := -0.700000 // sell
								if( ema13 > 0.049931 )
									ret := 0.833333 // buy
							if( smoothK_k > 62.2693 )
								if( k <= 66.0961 )
									ret := 0.750000 // buy
								if( k > 66.0961 )
									ret := 0.029412
				if( d_k > -19.8167 )
					if( ema2 <= 72.865 )
						if( d_k <= 16.7096 )
							if( tema <= 71.6322 )
								if( d_k <= -6.7504 )
									ret := -0.016320
								if( d_k > -6.7504 )
									ret := 0.108499
							if( tema > 71.6322 )
								if( d_k <= 10.988 )
									ret := -0.205333
								if( d_k > 10.988 )
									ret := 0.333333
						if( d_k > 16.7096 )
							if( tema <= 65.0071 )
								if( ema3 <= 64.5387 )
									ret := -0.140777
								if( ema3 > 64.5387 )
									ret := -0.600000
							if( tema > 65.0071 )
								if( k <= 23.2107 )
									ret := 0.294872
								if( k > 23.2107 )
									ret := -0.085271
					if( ema2 > 72.865 )
						if( ema2 <= 79.047 )
							if( d_k <= -15.128 )
								if( ema2 <= 76.287 )
									ret := -0.200000
								if( ema2 > 76.287 )
									ret := 0.785714 // buy
							if( d_k > -15.128 )
								if( d <= 72.2696 )
									ret := 0.181818
								if( d > 72.2696 )
									ret := 0.466667
						if( ema2 > 79.047 )
							if( smoothD_d <= 29.9285 )
								if( ema12 <= 0.040295 )
									ret := -0.118182
								if( ema12 > 0.040295 )
									ret := -0.750000 // sell
							if( smoothD_d > 29.9285 )
								if( smoothD_d <= 77.9348 )
									ret := 0.191729
								if( smoothD_d > 77.9348 )
									ret := -0.888889 // sell
			if( k > 70.3283 )
				if( ema1 <= 64.7984 )
					if( ema13 <= 0.087647 )
						if( ema1 <= 58.0673 )
							if( ema13 <= -0.010909 )
								if( d <= 94.7757 )
									ret := 1.000000 // buy
								if( d > 94.7757 )
									ret := 0.250000
							if( ema13 > -0.010909 )
								if( rsi1 <= 73.6384 )
									ret := 0.013514
								if( rsi1 > 73.6384 )
									ret := 0.425000
						if( ema1 > 58.0673 )
							if( d <= 50.8758 )
								if( rsi1 <= 58.7099 )
									ret := 0.628571
								if( rsi1 > 58.7099 )
									ret := -0.027778
							if( d > 50.8758 )
								if( k <= 93.6188 )
									ret := -0.103163
								if( k > 93.6188 )
									ret := -0.024146
					if( ema13 > 0.087647 )
						if( d_k <= 10.7518 )
							if( rsi1 <= 65.2129 )
								if( k <= 76.2026 )
									ret := -0.857143 // sell
								if( k > 76.2026 )
									ret := 0.181818
							if( rsi1 > 65.2129 )
								if( smoothD_d <= 82.9809 )
									ret := 0.573770
								if( smoothD_d > 82.9809 )
									ret := 0.200000
						if( d_k > 10.7518 )
							if( rsi1 <= 68.1654 )
								ret := -1.000000 // sell
							if( rsi1 > 68.1654 )
								ret := 0.200000
				if( ema1 > 64.7984 )
					if( tema <= 65.9534 )
						if( d_k <= 2.40937 )
							if( smoothK_k <= 80.4043 )
								if( d_k <= 1.39958 )
									ret := -0.234694
								if( d_k > 1.39958 )
									ret := 0.461538
							if( smoothK_k > 80.4043 )
								if( d_k <= -2.78803 )
									ret := 0.319372
								if( d_k > -2.78803 )
									ret := 0.029412
						if( d_k > 2.40937 )
							if( rsi1 <= 63.3554 )
								if( smoothD_d <= 80.1564 )
									ret := 0.000000
								if( smoothD_d > 80.1564 )
									ret := 0.606061
							if( rsi1 > 63.3554 )
								if( d_k <= 2.81811 )
									ret := 0.625000
								if( d_k > 2.81811 )
									ret := -0.170213
					if( tema > 65.9534 )
						if( ema3 <= 71.1011 )
							if( d <= 98.8147 )
								if( ema13 <= -0.020949 )
									ret := -0.622642
								if( ema13 > -0.020949 )
									ret := -0.009721
							if( d > 98.8147 )
								if( rsi1 <= 73.7413 )
									ret := -0.603448
								if( rsi1 > 73.7413 )
									ret := -0.095238
						if( ema3 > 71.1011 )
							if( smoothD_d <= 49.6436 )
								if( smoothK_k <= 74.9029 )
									ret := -0.120000
								if( smoothK_k > 74.9029 )
									ret := -0.842105 // sell
							if( smoothD_d > 49.6436 )
								if( ema3 <= 80.3088 )
									ret := 0.084256
								if( ema3 > 80.3088 )
									ret := -0.108434
		if( ema12 > 0.050961 )
			if( ema13 <= 1.02944 )
				if( rsi1 <= 94.7858 )
					if( k <= 94.7925 )
						if( d <= 78.8559 )
							if( ema13 <= 0.194067 )
								if( d <= 71.4659 )
									ret := -0.042680
								if( d > 71.4659 )
									ret := -0.265378
							if( ema13 > 0.194067 )
								if( rsi1 <= 70.3754 )
									ret := -0.124031
								if( rsi1 > 70.3754 )
									ret := -0.445570
						if( d > 78.8559 )
							if( ema2 <= 58.8513 )
								if( k <= 90.9083 )
									ret := -0.329897
								if( k > 90.9083 )
									ret := -0.833333 // sell
							if( ema2 > 58.8513 )
								if( ema13 <= 0.25208 )
									ret := -0.004748
								if( ema13 > 0.25208 )
									ret := 0.286807
					if( k > 94.7925 )
						if( rsi1 <= 78.2779 )
							if( ema3 <= 58.4051 )
								if( k <= 97.3977 )
									ret := -0.777778 // sell
								if( k > 97.3977 )
									ret := 0.777778 // buy
							if( ema3 > 58.4051 )
								if( ema12 <= 0.093401 )
									ret := -0.191610
								if( ema12 > 0.093401 )
									ret := -0.461165
						if( rsi1 > 78.2779 )
							if( d <= 97.076 )
								if( ema1 <= 72.2282 )
									ret := -0.044304
								if( ema1 > 72.2282 )
									ret := -0.460177
							if( d > 97.076 )
								if( ema12 <= 0.23962 )
									ret := 0.077904
								if( ema12 > 0.23962 )
									ret := -0.695652
				if( rsi1 > 94.7858 )
					if( ema13 <= 0.20443 )
						if( smoothD_d <= 96.9958 )
							if( ema3 <= 71.8207 )
								if( ema13 <= 0.188064 )
									ret := 0.843750 // buy
								if( ema13 > 0.188064 )
									ret := 0.250000
							if( ema3 > 71.8207 )
								ret := 1.000000 // buy
						if( smoothD_d > 96.9958 )
							if( ema2 <= 68.1684 )
								ret := 0.000000
							if( ema2 > 68.1684 )
								ret := 0.428571
					if( ema13 > 0.20443 )
						if( tema <= 63.247 )
							ret := -1.000000 // sell
						if( tema > 63.247 )
							if( smoothK_k <= 96.8076 )
								ret := -0.400000
							if( smoothK_k > 96.8076 )
								ret := 0.500000
			if( ema13 > 1.02944 )
				if( k <= 73.4179 )
					if( d <= 72.3055 )
						if( smoothK_k <= 69.4521 )
							ret := 0.142857
						if( smoothK_k > 69.4521 )
							ret := 1.000000 // buy
					if( d > 72.3055 )
						ret := -1.000000 // sell
				if( k > 73.4179 )
					if( smoothK_k <= 84.7766 )
						ret := 1.000000 // buy
					if( smoothK_k > 84.7766 )
						ret := -0.500000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_PYPL_1Min_cf2404e2(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)

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


