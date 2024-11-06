//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: UNIUSDT_5Min_2CS0_d3e51046 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UNIUSDT_5Min_2CS0_d3e51046", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UNIUSDT_5Min_d3e51046(ad_mf, mf, ad, rsi1, d, k, smoothD_d, d_k, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( k <= 17.4351 )
		if( d_k <= -0.663375 )
			if( rsi1 <= 38.4925 )
				if( smoothK_k <= 6.61103 )
					if( rsi1 <= 23.2117 )
						if( smoothK_k <= 2.49621 )
							if( ad <= -2704.14 )
								if( ad <= -78073.1 )
									ret := 0.000000
								if( ad > -78073.1 )
									ret := -0.756098 // sell
							if( ad > -2704.14 )
								if( mf <= -0.155904 )
									ret := -0.360825
								if( mf > -0.155904 )
									ret := -0.588235
						if( smoothK_k > 2.49621 )
							if( rsi1 <= 11.5431 )
								if( ad <= -14433.4 )
									ret := -0.500000
								if( ad > -14433.4 )
									ret := 0.117647
							if( rsi1 > 11.5431 )
								if( smoothD_d <= 3.45453 )
									ret := -0.494774
								if( smoothD_d > 3.45453 )
									ret := -0.238095
					if( rsi1 > 23.2117 )
						if( d <= 2.40754 )
							if( ad_mf <= -2388.76 )
								if( d <= 1.91163 )
									ret := -0.452941
								if( d > 1.91163 )
									ret := -0.653061
							if( ad_mf > -2388.76 )
								if( d <= 2.31397 )
									ret := -0.254717
								if( d > 2.31397 )
									ret := -0.595238
						if( d > 2.40754 )
							if( ad_mf <= -17395.5 )
								if( rsi1 <= 29.6379 )
									ret := -0.250000
								if( rsi1 > 29.6379 )
									ret := 0.380952
							if( ad_mf > -17395.5 )
								if( mf <= -0.218092 )
									ret := -0.074534
								if( mf > -0.218092 )
									ret := -0.287218
				if( smoothK_k > 6.61103 )
					if( ad_mf <= -414.692 )
						if( ad_mf <= -599.653 )
							if( mf <= -0.167326 )
								if( ad <= -23808.7 )
									ret := 0.329268
								if( ad > -23808.7 )
									ret := 0.029340
							if( mf > -0.167326 )
								if( smoothK_k <= 11.1886 )
									ret := -0.147860
								if( smoothK_k > 11.1886 )
									ret := 0.012422
						if( ad_mf > -599.653 )
							if( d_k <= -1.66232 )
								if( ad_mf <= -581.545 )
									ret := 0.916667 // buy
								if( ad_mf > -581.545 )
									ret := 0.071429
							if( d_k > -1.66232 )
								ret := 0.833333 // buy
					if( ad_mf > -414.692 )
						if( rsi1 <= 24.8948 )
							if( ad_mf <= 3605.27 )
								if( k <= 12.6537 )
									ret := -0.327586
								if( k > 12.6537 )
									ret := -0.052632
							if( ad_mf > 3605.27 )
								if( d <= 10.1832 )
									ret := -0.454545
								if( d > 10.1832 )
									ret := -0.866667 // sell
						if( rsi1 > 24.8948 )
							if( ad_mf <= 5747.29 )
								if( k <= 13.8542 )
									ret := -0.231169
								if( k > 13.8542 )
									ret := -0.083916
							if( ad_mf > 5747.29 )
								if( ad_mf <= 6003.93 )
									ret := 0.666667
								if( ad_mf > 6003.93 )
									ret := 0.041420
			if( rsi1 > 38.4925 )
				if( smoothD_d <= 2.81793 )
					if( smoothD_d <= -0.777364 )
						if( mf <= 0.108282 )
							if( mf <= 0.104672 )
								if( smoothK_k <= 2.20555 )
									ret := -0.037433
								if( smoothK_k > 2.20555 )
									ret := -0.375000
							if( mf > 0.104672 )
								if( rsi1 <= 42.9769 )
									ret := 0.750000 // buy
								if( rsi1 > 42.9769 )
									ret := 0.200000
						if( mf > 0.108282 )
							if( mf <= 0.115702 )
								ret := -0.833333 // sell
							if( mf > 0.115702 )
								if( rsi1 <= 46.0636 )
									ret := -0.451220
								if( rsi1 > 46.0636 )
									ret := -0.053191
					if( smoothD_d > -0.777364 )
						if( rsi1 <= 47.3885 )
							if( d <= 5.60668 )
								if( ad <= -50223.1 )
									ret := 0.666667
								if( ad > -50223.1 )
									ret := -0.090253
							if( d > 5.60668 )
								if( mf <= -0.075957 )
									ret := -0.130435
								if( mf > -0.075957 )
									ret := 0.433333
						if( rsi1 > 47.3885 )
							if( rsi1 <= 56.9089 )
								if( d <= 5.63603 )
									ret := 0.136471
								if( d > 5.63603 )
									ret := -0.370370
							if( rsi1 > 56.9089 )
								if( d_k <= -1.61482 )
									ret := 0.414966
								if( d_k > -1.61482 )
									ret := -0.150000
				if( smoothD_d > 2.81793 )
					if( ad <= -1565.22 )
						if( rsi1 <= 53.048 )
							if( mf <= -0.030347 )
								if( rsi1 <= 41.3851 )
									ret := 0.650000
								if( rsi1 > 41.3851 )
									ret := 0.486607
							if( mf > -0.030347 )
								if( mf <= 0.048654 )
									ret := 0.172619
								if( mf > 0.048654 )
									ret := 0.408602
						if( rsi1 > 53.048 )
							if( k <= 8.69299 )
								if( rsi1 <= 55.3584 )
									ret := 0.750000 // buy
								if( rsi1 > 55.3584 )
									ret := -0.800000 // sell
							if( k > 8.69299 )
								if( ad_mf <= -5835.95 )
									ret := 0.772358 // buy
								if( ad_mf > -5835.95 )
									ret := 0.588235
					if( ad > -1565.22 )
						if( d_k <= -1.69423 )
							if( rsi1 <= 44.2738 )
								if( d_k <= -7.80414 )
									ret := -0.270270
								if( d_k > -7.80414 )
									ret := 0.107477
							if( rsi1 > 44.2738 )
								if( rsi1 <= 63.515 )
									ret := 0.302491
								if( rsi1 > 63.515 )
									ret := 0.617647
						if( d_k > -1.69423 )
							if( mf <= 0.253914 )
								if( rsi1 <= 48.5554 )
									ret := -0.087719
								if( rsi1 > 48.5554 )
									ret := 0.241071
							if( mf > 0.253914 )
								if( rsi1 <= 55.9765 )
									ret := -0.475000
								if( rsi1 > 55.9765 )
									ret := 0.000000
		if( d_k > -0.663375 )
			if( rsi1 <= 44.7605 )
				if( rsi1 <= 33.3321 )
					if( d_k <= 0.079972 )
						if( rsi1 <= 21.5352 )
							if( d <= 4.86357 )
								if( ad_mf <= -1453.49 )
									ret := -0.729730 // sell
								if( ad_mf > -1453.49 )
									ret := -0.543103
							if( d > 4.86357 )
								if( rsi1 <= 11.5135 )
									ret := 0.571429
								if( rsi1 > 11.5135 )
									ret := -0.310811
						if( rsi1 > 21.5352 )
							if( ad <= -124189 )
								ret := 1.000000 // buy
							if( ad > -124189 )
								if( ad <= -3907.25 )
									ret := -0.522727
								if( ad > -3907.25 )
									ret := -0.384193
					if( d_k > 0.079972 )
						if( ad <= 1569.37 )
							if( mf <= -0.204768 )
								if( ad <= -1609.82 )
									ret := -0.580899
								if( ad > -1609.82 )
									ret := -0.392989
							if( mf > -0.204768 )
								if( k <= 4.79953 )
									ret := -0.704914 // sell
								if( k > 4.79953 )
									ret := -0.592920
						if( ad > 1569.37 )
							if( ad <= 432203 )
								if( d_k <= 2.53822 )
									ret := -0.686934
								if( d_k > 2.53822 )
									ret := -0.789033 // sell
							if( ad > 432203 )
								ret := 1.000000 // buy
				if( rsi1 > 33.3321 )
					if( mf <= -0.020004 )
						if( d_k <= 1.62625 )
							if( k <= 9.09892 )
								if( rsi1 <= 38.1469 )
									ret := -0.354054
								if( rsi1 > 38.1469 )
									ret := -0.149425
							if( k > 9.09892 )
								if( rsi1 <= 38.0275 )
									ret := -0.141414
								if( rsi1 > 38.0275 )
									ret := 0.255319
						if( d_k > 1.62625 )
							if( d_k <= 9.30992 )
								if( ad_mf <= 10142.6 )
									ret := -0.330133
								if( ad_mf > 10142.6 )
									ret := -0.765957 // sell
							if( d_k > 9.30992 )
								if( mf <= -0.238582 )
									ret := -0.292683
								if( mf > -0.238582 )
									ret := -0.538929
					if( mf > -0.020004 )
						if( ad <= 977.746 )
							if( d_k <= 5.21481 )
								if( rsi1 <= 37.6736 )
									ret := -0.470516
								if( rsi1 > 37.6736 )
									ret := -0.297297
							if( d_k > 5.21481 )
								if( ad_mf <= -6265.16 )
									ret := -0.816832 // sell
								if( ad_mf > -6265.16 )
									ret := -0.565136
						if( ad > 977.746 )
							if( smoothD_d <= -0.65517 )
								if( ad_mf <= 2011.14 )
									ret := -0.611111
								if( ad_mf > 2011.14 )
									ret := -0.239316
							if( smoothD_d > -0.65517 )
								if( d_k <= 2.55139 )
									ret := -0.442857
								if( d_k > 2.55139 )
									ret := -0.740351 // sell
			if( rsi1 > 44.7605 )
				if( d_k <= 9.10094 )
					if( ad_mf <= 1931.06 )
						if( rsi1 <= 52.958 )
							if( smoothK_k <= 4.8295 )
								if( ad_mf <= -8678.85 )
									ret := -0.360825
								if( ad_mf > -8678.85 )
									ret := -0.128286
							if( smoothK_k > 4.8295 )
								if( d_k <= 3.76544 )
									ret := 0.192412
								if( d_k > 3.76544 )
									ret := -0.134328
						if( rsi1 > 52.958 )
							if( k <= 2.52645 )
								if( rsi1 <= 71.5421 )
									ret := -0.065789
								if( rsi1 > 71.5421 )
									ret := 0.833333 // buy
							if( k > 2.52645 )
								if( ad <= -2604.31 )
									ret := 0.342711
								if( ad > -2604.31 )
									ret := 0.137931
					if( ad_mf > 1931.06 )
						if( rsi1 <= 54.9889 )
							if( mf <= 0.007654 )
								if( ad <= 2745.2 )
									ret := -0.600000
								if( ad > 2745.2 )
									ret := 0.017094
							if( mf > 0.007654 )
								if( ad <= 10358.2 )
									ret := -0.400504
								if( ad > 10358.2 )
									ret := -0.678161
						if( rsi1 > 54.9889 )
							if( k <= 1.29475 )
								if( rsi1 <= 66.0023 )
									ret := -0.465517
								if( rsi1 > 66.0023 )
									ret := 0.214286
							if( k > 1.29475 )
								if( ad <= 7118.75 )
									ret := 0.208589
								if( ad > 7118.75 )
									ret := -0.181102
				if( d_k > 9.10094 )
					if( ad_mf <= 1021.69 )
						if( ad <= -2283.28 )
							if( rsi1 <= 57.3838 )
								if( rsi1 <= 51.1917 )
									ret := -0.606593
								if( rsi1 > 51.1917 )
									ret := -0.428016
							if( rsi1 > 57.3838 )
								if( mf <= 0.164401 )
									ret := -0.026087
								if( mf > 0.164401 )
									ret := -0.360656
						if( ad > -2283.28 )
							if( d_k <= 12.1245 )
								if( mf <= 0.374868 )
									ret := -0.013636
								if( mf > 0.374868 )
									ret := -0.500000
							if( d_k > 12.1245 )
								if( mf <= 0.032381 )
									ret := -0.124294
								if( mf > 0.032381 )
									ret := -0.370787
					if( ad_mf > 1021.69 )
						if( rsi1 <= 62.1612 )
							if( d_k <= 22.4621 )
								if( ad <= 5092.78 )
									ret := -0.553444
								if( ad > 5092.78 )
									ret := -0.756667 // sell
							if( d_k > 22.4621 )
								if( mf <= 0.063119 )
									ret := -0.689655
								if( mf > 0.063119 )
									ret := -0.913907 // sell
						if( rsi1 > 62.1612 )
							if( smoothD_d <= 30.3201 )
								if( d_k <= 16.4222 )
									ret := -0.144737
								if( d_k > 16.4222 )
									ret := -0.519231
							if( smoothD_d > 30.3201 )
								if( ad <= 3727.09 )
									ret := -0.272727
								if( ad > 3727.09 )
									ret := -0.935484 // sell
	if( k > 17.4351 )
		if( rsi1 <= 54.955 )
			if( d_k <= -1.19329 )
				if( d_k <= -8.56115 )
					if( ad <= -1727.99 )
						if( rsi1 <= 32.6814 )
							if( ad <= -13036.9 )
								if( rsi1 <= 26.0841 )
									ret := 0.400000
								if( rsi1 > 26.0841 )
									ret := 0.734440 // buy
							if( ad > -13036.9 )
								if( ad_mf <= -12248.1 )
									ret := -0.700000 // sell
								if( ad_mf > -12248.1 )
									ret := 0.161017
						if( rsi1 > 32.6814 )
							if( d_k <= -14.8342 )
								if( ad_mf <= -6358.09 )
									ret := 0.819411 // buy
								if( ad_mf > -6358.09 )
									ret := 0.698435
							if( d_k > -14.8342 )
								if( ad_mf <= -3242.29 )
									ret := 0.647059
								if( ad_mf > -3242.29 )
									ret := 0.452941
					if( ad > -1727.99 )
						if( d_k <= -13.9314 )
							if( ad <= 6358.58 )
								if( rsi1 <= 44.6658 )
									ret := 0.251761
								if( rsi1 > 44.6658 )
									ret := 0.513320
							if( ad > 6358.58 )
								if( rsi1 <= 39.7423 )
									ret := 0.484746
								if( rsi1 > 39.7423 )
									ret := 0.742424 // buy
						if( d_k > -13.9314 )
							if( rsi1 <= 36.8449 )
								if( d <= 33.8768 )
									ret := 0.162896
								if( d > 33.8768 )
									ret := -0.081841
							if( rsi1 > 36.8449 )
								if( ad <= 3846.18 )
									ret := 0.322963
								if( ad > 3846.18 )
									ret := 0.485407
				if( d_k > -8.56115 )
					if( rsi1 <= 41.2912 )
						if( ad_mf <= -500.064 )
							if( d <= 31.4442 )
								if( rsi1 <= 28.9294 )
									ret := -0.090411
								if( rsi1 > 28.9294 )
									ret := 0.303061
							if( d > 31.4442 )
								if( ad_mf <= -43488.6 )
									ret := 0.471429
								if( ad_mf > -43488.6 )
									ret := -0.107066
						if( ad_mf > -500.064 )
							if( rsi1 <= 33.465 )
								if( d_k <= -5.94025 )
									ret := -0.110540
								if( d_k > -5.94025 )
									ret := -0.369925
							if( rsi1 > 33.465 )
								if( smoothD_d <= 29.2375 )
									ret := 0.025455
								if( smoothD_d > 29.2375 )
									ret := -0.177948
					if( rsi1 > 41.2912 )
						if( ad <= -1800.61 )
							if( d_k <= -5.02452 )
								if( ad_mf <= -4936.85 )
									ret := 0.645946
								if( ad_mf > -4936.85 )
									ret := 0.425150
							if( d_k > -5.02452 )
								if( ad <= -10672.9 )
									ret := 0.534161
								if( ad > -10672.9 )
									ret := 0.289530
						if( ad > -1800.61 )
							if( rsi1 <= 48.6324 )
								if( smoothD_d <= 31.4446 )
									ret := 0.217355
								if( smoothD_d > 31.4446 )
									ret := 0.036353
							if( rsi1 > 48.6324 )
								if( d_k <= -5.67029 )
									ret := 0.361646
								if( d_k > -5.67029 )
									ret := 0.182362
			if( d_k > -1.19329 )
				if( d_k <= 5.49582 )
					if( rsi1 <= 41.0582 )
						if( rsi1 <= 34.7535 )
							if( rsi1 <= 26.0193 )
								if( k <= 18.6858 )
									ret := -0.333333
								if( k > 18.6858 )
									ret := -0.685714
							if( rsi1 > 26.0193 )
								if( mf <= -0.36389 )
									ret := -0.017544
								if( mf > -0.36389 )
									ret := -0.484133
						if( rsi1 > 34.7535 )
							if( smoothK_k <= 26.808 )
								if( rsi1 <= 37.7783 )
									ret := -0.048872
								if( rsi1 > 37.7783 )
									ret := -0.228873
							if( smoothK_k > 26.808 )
								if( smoothK_k <= 85.5623 )
									ret := -0.428339
								if( smoothK_k > 85.5623 )
									ret := -0.135135
					if( rsi1 > 41.0582 )
						if( k <= 91.9714 )
							if( ad_mf <= 1628.5 )
								if( k <= 28.105 )
									ret := 0.184911
								if( k > 28.105 )
									ret := -0.104667
							if( ad_mf > 1628.5 )
								if( d_k <= 2.74462 )
									ret := -0.198859
								if( d_k > 2.74462 )
									ret := -0.406863
						if( k > 91.9714 )
							if( ad_mf <= -4486.25 )
								if( ad_mf <= -46016.6 )
									ret := -0.800000 // sell
								if( ad_mf > -46016.6 )
									ret := 0.492424
							if( ad_mf > -4486.25 )
								if( ad <= -1459.17 )
									ret := -0.194030
								if( ad > -1459.17 )
									ret := 0.146172
				if( d_k > 5.49582 )
					if( ad_mf <= 1524.22 )
						if( smoothD_d <= 79.1643 )
							if( rsi1 <= 44.4433 )
								if( rsi1 <= 37.7017 )
									ret := -0.629958
								if( rsi1 > 37.7017 )
									ret := -0.512076
							if( rsi1 > 44.4433 )
								if( d_k <= 11.3136 )
									ret := -0.262564
								if( d_k > 11.3136 )
									ret := -0.461822
						if( smoothD_d > 79.1643 )
							if( rsi1 <= 48.6585 )
								if( smoothK_k <= 86.4582 )
									ret := -0.391521
								if( smoothK_k > 86.4582 )
									ret := 0.235294
							if( rsi1 > 48.6585 )
								if( mf <= -0.14354 )
									ret := 0.060403
								if( mf > -0.14354 )
									ret := -0.257036
					if( ad_mf > 1524.22 )
						if( d_k <= 12.0647 )
							if( rsi1 <= 46.8702 )
								if( ad_mf <= 2632.17 )
									ret := -0.492701
								if( ad_mf > 2632.17 )
									ret := -0.696809
							if( rsi1 > 46.8702 )
								if( ad_mf <= 4001.47 )
									ret := -0.391129
								if( ad_mf > 4001.47 )
									ret := -0.572079
						if( d_k > 12.0647 )
							if( mf <= -0.257295 )
								if( ad_mf <= 2535.09 )
									ret := -0.647059
								if( ad_mf > 2535.09 )
									ret := -0.195122
							if( mf > -0.257295 )
								if( ad_mf <= 3925.5 )
									ret := -0.693894
								if( ad_mf > 3925.5 )
									ret := -0.799388 // sell
		if( rsi1 > 54.955 )
			if( d_k <= 3.30044 )
				if( d_k <= -0.003424 )
					if( ad_mf <= -2407.12 )
						if( d_k <= -4.27411 )
							if( ad <= -6050.65 )
								if( smoothD_d <= 6.77716 )
									ret := 0.416667
								if( smoothD_d > 6.77716 )
									ret := 0.805676 // buy
							if( ad > -6050.65 )
								if( rsi1 <= 68.633 )
									ret := 0.713947 // buy
								if( rsi1 > 68.633 )
									ret := 0.824859 // buy
						if( d_k > -4.27411 )
							if( ad_mf <= -15970.2 )
								if( rsi1 <= 63.8708 )
									ret := 0.666667
								if( rsi1 > 63.8708 )
									ret := 0.869010 // buy
							if( ad_mf > -15970.2 )
								if( ad <= -15692.2 )
									ret := -0.571429
								if( ad > -15692.2 )
									ret := 0.650129
					if( ad_mf > -2407.12 )
						if( ad <= 2509.14 )
							if( d_k <= -11.3975 )
								if( mf <= 0.184212 )
									ret := 0.661258
								if( mf > 0.184212 )
									ret := 0.472579
							if( d_k > -11.3975 )
								if( mf <= 0.231384 )
									ret := 0.502695
								if( mf > 0.231384 )
									ret := 0.306178
						if( ad > 2509.14 )
							if( rsi1 <= 69.673 )
								if( d_k <= -4.42976 )
									ret := 0.647844
								if( d_k > -4.42976 )
									ret := 0.425359
							if( rsi1 > 69.673 )
								if( mf <= 0.323058 )
									ret := 0.788570 // buy
								if( mf > 0.323058 )
									ret := 0.607553
				if( d_k > -0.003424 )
					if( rsi1 <= 72.1325 )
						if( mf <= 0.145022 )
							if( ad_mf <= -4569.86 )
								if( d_k <= 1.13629 )
									ret := 0.641791
								if( d_k > 1.13629 )
									ret := 0.408854
							if( ad_mf > -4569.86 )
								if( smoothD_d <= 92.9209 )
									ret := 0.216007
								if( smoothD_d > 92.9209 )
									ret := 0.403953
						if( mf > 0.145022 )
							if( ad_mf <= -3005.17 )
								if( rsi1 <= 58.1377 )
									ret := -0.142857
								if( rsi1 > 58.1377 )
									ret := 0.453947
							if( ad_mf > -3005.17 )
								if( d_k <= 1.67453 )
									ret := 0.165605
								if( d_k > 1.67453 )
									ret := 0.008251
					if( rsi1 > 72.1325 )
						if( ad_mf <= 2820.72 )
							if( ad <= -2321.13 )
								if( smoothD_d <= 73.2606 )
									ret := 0.844156 // buy
								if( smoothD_d > 73.2606 )
									ret := 0.618644
							if( ad > -2321.13 )
								if( d_k <= 3.14935 )
									ret := 0.379824
								if( d_k > 3.14935 )
									ret := 0.081081
						if( ad_mf > 2820.72 )
							if( k <= 94.9031 )
								if( d_k <= 2.81919 )
									ret := 0.529532
								if( d_k > 2.81919 )
									ret := 0.142857
							if( k > 94.9031 )
								if( d <= 97.2718 )
									ret := 0.527132
								if( d > 97.2718 )
									ret := 0.712206 // buy
			if( d_k > 3.30044 )
				if( d_k <= 7.48862 )
					if( rsi1 <= 71.5505 )
						if( ad <= 3832.24 )
							if( smoothD_d <= 61.754 )
								if( rsi1 <= 61.948 )
									ret := 0.110320
								if( rsi1 > 61.948 )
									ret := 0.364829
							if( smoothD_d > 61.754 )
								if( d <= 90.8495 )
									ret := -0.072956
								if( d > 90.8495 )
									ret := 0.104261
						if( ad > 3832.24 )
							if( smoothK_k <= 82.8976 )
								if( smoothD_d <= 68.2067 )
									ret := -0.086643
								if( smoothD_d > 68.2067 )
									ret := -0.440574
							if( smoothK_k > 82.8976 )
								if( mf <= -0.022576 )
									ret := 0.260417
								if( mf > -0.022576 )
									ret := -0.124579
					if( rsi1 > 71.5505 )
						if( d_k <= 5.75745 )
							if( smoothD_d <= 71.8931 )
								if( mf <= 0.002684 )
									ret := 0.142857
								if( mf > 0.002684 )
									ret := 0.557143
							if( smoothD_d > 71.8931 )
								if( d <= 95.8505 )
									ret := 0.237148
								if( d > 95.8505 )
									ret := 0.454545
						if( d_k > 5.75745 )
							if( rsi1 <= 75.8298 )
								if( ad_mf <= 20486.6 )
									ret := 0.146893
								if( ad_mf > 20486.6 )
									ret := -0.681818
							if( rsi1 > 75.8298 )
								if( ad_mf <= 123270 )
									ret := 0.235849
								if( ad_mf > 123270 )
									ret := 1.000000 // buy
				if( d_k > 7.48862 )
					if( rsi1 <= 68.8877 )
						if( mf <= 0.085324 )
							if( ad <= 1332.34 )
								if( d_k <= 14.3395 )
									ret := -0.094571
								if( d_k > 14.3395 )
									ret := -0.286538
							if( ad > 1332.34 )
								if( d <= 92.6175 )
									ret := -0.432606
								if( d > 92.6175 )
									ret := 0.150000
						if( mf > 0.085324 )
							if( ad_mf <= 2304.07 )
								if( rsi1 <= 63.0026 )
									ret := -0.356831
								if( rsi1 > 63.0026 )
									ret := -0.141042
							if( ad_mf > 2304.07 )
								if( d_k <= 14.9818 )
									ret := -0.521186
								if( d_k > 14.9818 )
									ret := -0.714495 // sell
					if( rsi1 > 68.8877 )
						if( mf <= 0.411834 )
							if( rsi1 <= 77.0199 )
								if( smoothK_k <= 56.2632 )
									ret := 0.121495
								if( smoothK_k > 56.2632 )
									ret := -0.099842
							if( rsi1 > 77.0199 )
								if( mf <= 0.337173 )
									ret := 0.120000
								if( mf > 0.337173 )
									ret := 0.447761
						if( mf > 0.411834 )
							if( k <= 84.6182 )
								if( d <= 38.1583 )
									ret := 0.500000
								if( d > 38.1583 )
									ret := -0.314721
							if( k > 84.6182 )
								if( ad_mf <= 26705.6 )
									ret := 0.000000
								if( ad_mf > 26705.6 )
									ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

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
float op_operation = decision_tree_0_UNIUSDT_5Min_d3e51046(ad_mf, mf, ad, rsi1, d, k, smoothD_d, d_k, smoothK_k)

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


