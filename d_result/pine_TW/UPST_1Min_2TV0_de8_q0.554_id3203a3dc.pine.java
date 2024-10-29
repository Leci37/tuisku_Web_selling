//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: UPST_1Min_2TV0_3203a3dc Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UPST_1Min_2TV0_3203a3dc", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UPST_1Min_3203a3dc(ema2, ema1, ema12, ema3, ema13, tema, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= 0.006918 )
		if( VIP <= 1.08164 )
			if( ema1 <= 23.4058 )
				if( ema13 <= -0.15495 )
					if( ema2 <= 23.1205 )
						if( ema1 <= 20.5463 )
							if( tema <= 20.0396 )
								ret := 1.000000 // buy
							if( tema > 20.0396 )
								ret := -0.833333 // sell
						if( ema1 > 20.5463 )
							if( VIP <= 0.549017 )
								ret := 0.000000
							if( VIP > 0.549017 )
								if( ema1 <= 21.9282 )
									ret := 0.940299 // buy
								if( ema1 > 21.9282 )
									ret := 0.714286 // buy
					if( ema2 > 23.1205 )
						if( tema <= 23.1992 )
							if( VIM <= 1.75084 )
								if( ema12 <= -0.083919 )
									ret := 0.545455
								if( ema12 > -0.083919 )
									ret := -0.400000
							if( VIM > 1.75084 )
								if( ema2 <= 23.7931 )
									ret := 0.000000
								if( ema2 > 23.7931 )
									ret := -0.500000
						if( tema > 23.1992 )
							if( ema13 <= -0.180526 )
								ret := -0.750000 // sell
							if( ema13 > -0.180526 )
								ret := -0.200000
				if( ema13 > -0.15495 )
					if( ema1 <= 22.5456 )
						if( ema1 <= 22.4323 )
							if( VIP_VIM <= -0.007973 )
								if( tema <= 20.2421 )
									ret := 1.000000 // buy
								if( tema > 20.2421 )
									ret := 0.056439
							if( VIP_VIM > -0.007973 )
								if( VIP <= 1.0391 )
									ret := 0.478528
								if( VIP > 1.0391 )
									ret := 0.045113
						if( ema1 > 22.4323 )
							if( ema2 <= 22.5656 )
								if( ema12 <= -0.034615 )
									ret := -0.744681 // sell
								if( ema12 > -0.034615 )
									ret := -0.322314
							if( ema2 > 22.5656 )
								if( VIP <= 0.779114 )
									ret := -0.250000
								if( VIP > 0.779114 )
									ret := 0.777778 // buy
					if( ema1 > 22.5456 )
						if( VIM <= 0.973629 )
							if( ema2 <= 22.6789 )
								if( tema <= 22.6419 )
									ret := -0.100000
								if( tema > 22.6419 )
									ret := -0.904762 // sell
							if( ema2 > 22.6789 )
								if( VIP <= 0.926014 )
									ret := -0.833333 // sell
								if( VIP > 0.926014 )
									ret := 0.052239
						if( VIM > 0.973629 )
							if( tema <= 22.6274 )
								if( VIP <= 0.97086 )
									ret := 0.495495
								if( VIP > 0.97086 )
									ret := -0.155172
							if( tema > 22.6274 )
								if( ema3 <= 22.8833 )
									ret := -0.038462
								if( ema3 > 22.8833 )
									ret := 0.161304
			if( ema1 > 23.4058 )
				if( ema2 <= 23.6592 )
					if( tema <= 23.3638 )
						if( VIP <= 0.655682 )
							ret := 0.250000
						if( VIP > 0.655682 )
							if( VIM <= 1.21664 )
								if( ema13 <= -0.054987 )
									ret := -0.250000
								if( ema13 > -0.054987 )
									ret := -0.833333 // sell
							if( VIM > 1.21664 )
								ret := -1.000000 // sell
					if( tema > 23.3638 )
						if( VIP <= 0.694645 )
							if( ema2 <= 23.6404 )
								if( VIP_VIM <= -0.616812 )
									ret := -0.204545
								if( VIP_VIM > -0.616812 )
									ret := -1.000000 // sell
							if( ema2 > 23.6404 )
								if( ema3 <= 23.6908 )
									ret := -1.000000 // sell
								if( ema3 > 23.6908 )
									ret := -0.750000 // sell
						if( VIP > 0.694645 )
							if( VIP <= 0.744745 )
								if( VIP_VIM <= -0.635466 )
									ret := -0.250000
								if( VIP_VIM > -0.635466 )
									ret := 0.437500
							if( VIP > 0.744745 )
								if( ema12 <= -0.025493 )
									ret := -0.302752
								if( ema12 > -0.025493 )
									ret := -0.051213
				if( ema2 > 23.6592 )
					if( VIM <= 0.973411 )
						if( ema13 <= 0.034071 )
							if( VIM <= 0.906611 )
								if( ema12 <= -0.012079 )
									ret := -0.700000 // sell
								if( ema12 > -0.012079 )
									ret := -0.035714
							if( VIM > 0.906611 )
								if( ema13 <= -0.084422 )
									ret := 0.675000
								if( ema13 > -0.084422 )
									ret := 0.179122
						if( ema13 > 0.034071 )
							if( ema2 <= 31.4996 )
								if( ema13 <= 0.043269 )
									ret := 0.375000
								if( ema13 > 0.043269 )
									ret := -0.666667
							if( ema2 > 31.4996 )
								if( ema3 <= 40.8644 )
									ret := 0.698413
								if( ema3 > 40.8644 )
									ret := 0.300000
					if( VIM > 0.973411 )
						if( ema3 <= 23.6884 )
							if( VIP <= 0.851315 )
								ret := 0.000000
							if( VIP > 0.851315 )
								if( ema13 <= 0.017875 )
									ret := 0.970588 // buy
								if( ema13 > 0.017875 )
									ret := 0.600000
						if( ema3 > 23.6884 )
							if( ema12 <= -0.048427 )
								if( VIP_VIM <= -0.251256 )
									ret := 0.042127
								if( VIP_VIM > -0.251256 )
									ret := 0.215580
							if( ema12 > -0.048427 )
								if( ema2 <= 42.5566 )
									ret := 0.010528
								if( ema2 > 42.5566 )
									ret := -0.139679
		if( VIP > 1.08164 )
			if( ema12 <= -0.0068 )
				if( VIP <= 3.46087 )
					if( ema3 <= 43.4535 )
						if( tema <= 22.5966 )
							if( ema13 <= -0.084775 )
								if( VIP_VIM <= -1.25388 )
									ret := 0.730769 // buy
								if( VIP_VIM > -1.25388 )
									ret := -0.466258
							if( ema13 > -0.084775 )
								if( ema3 <= 22.2948 )
									ret := 0.379592
								if( ema3 > 22.2948 )
									ret := -0.030303
						if( tema > 22.5966 )
							if( ema3 <= 25.2427 )
								if( ema13 <= -0.087492 )
									ret := 0.779661 // buy
								if( ema13 > -0.087492 )
									ret := 0.315261
							if( ema3 > 25.2427 )
								if( ema1 <= 25.3547 )
									ret := -0.437500
								if( ema1 > 25.3547 )
									ret := 0.224727
					if( ema3 > 43.4535 )
						if( ema3 <= 43.5381 )
							if( ema13 <= -0.034574 )
								ret := -1.000000 // sell
							if( ema13 > -0.034574 )
								ret := -0.571429
						if( ema3 > 43.5381 )
							if( ema13 <= -0.111645 )
								ret := 0.833333 // buy
							if( ema13 > -0.111645 )
								if( ema2 <= 48.5056 )
									ret := -0.025974
								if( ema2 > 48.5056 )
									ret := 0.307692
				if( VIP > 3.46087 )
					if( ema13 <= -0.208477 )
						if( tema <= 22.6619 )
							ret := -1.000000 // sell
						if( tema > 22.6619 )
							if( VIP <= 4.03283 )
								if( ema2 <= 40.5981 )
									ret := -1.000000 // sell
								if( ema2 > 40.5981 )
									ret := -0.750000 // sell
							if( VIP > 4.03283 )
								if( VIP_VIM <= 0.21481 )
									ret := 0.250000
								if( VIP_VIM > 0.21481 )
									ret := -0.750000 // sell
					if( ema13 > -0.208477 )
						if( VIP_VIM <= -1.18154 )
							if( ema1 <= 37.5251 )
								if( ema3 <= 28.0992 )
									ret := 0.377778
								if( ema3 > 28.0992 )
									ret := 0.704082 // buy
							if( ema1 > 37.5251 )
								if( VIP_VIM <= -1.25589 )
									ret := -0.035294
								if( VIP_VIM > -1.25589 )
									ret := 0.434783
						if( VIP_VIM > -1.18154 )
							if( VIM <= 44.47 )
								if( VIP_VIM <= -0.091643 )
									ret := -0.024852
								if( VIP_VIM > -0.091643 )
									ret := 0.145688
							if( VIM > 44.47 )
								if( tema <= 26.3625 )
									ret := 0.745098 // buy
								if( tema > 26.3625 )
									ret := 0.103448
			if( ema12 > -0.0068 )
				if( tema <= 22.0028 )
					if( ema13 <= -0.032313 )
						ret := -1.000000 // sell
					if( ema13 > -0.032313 )
						if( ema2 <= 21.951 )
							if( ema1 <= 20.7609 )
								ret := 1.000000 // buy
							if( ema1 > 20.7609 )
								if( ema3 <= 20.9877 )
									ret := -1.000000 // sell
								if( ema3 > 20.9877 )
									ret := 0.284314
						if( ema2 > 21.951 )
							if( ema13 <= 0.007423 )
								ret := 0.500000
							if( ema13 > 0.007423 )
								ret := 1.000000 // buy
				if( tema > 22.0028 )
					if( ema13 <= -0.010225 )
						if( ema2 <= 23.0559 )
							if( tema <= 23.02 )
								if( VIP <= 1.65872 )
									ret := 0.000000
								if( VIP > 1.65872 )
									ret := -0.426667
							if( tema > 23.02 )
								ret := -1.000000 // sell
						if( ema2 > 23.0559 )
							if( VIM <= 0.925938 )
								if( VIP_VIM <= 0.30177 )
									ret := 0.537037
								if( VIP_VIM > 0.30177 )
									ret := -0.200000
							if( VIM > 0.925938 )
								if( VIM <= 0.941359 )
									ret := -0.647059
								if( VIM > 0.941359 )
									ret := -0.004615
					if( ema13 > -0.010225 )
						if( tema <= 37.7859 )
							if( ema2 <= 26.3056 )
								if( ema2 <= 23.6945 )
									ret := 0.036134
								if( ema2 > 23.6945 )
									ret := 0.179236
							if( ema2 > 26.3056 )
								if( ema1 <= 26.4935 )
									ret := -0.442623
								if( ema1 > 26.4935 )
									ret := 0.018908
						if( tema > 37.7859 )
							if( VIM <= 0.944095 )
								if( VIP_VIM <= 0.188779 )
									ret := 0.750000 // buy
								if( VIP_VIM > 0.188779 )
									ret := 0.419355
							if( VIM > 0.944095 )
								if( tema <= 39.7 )
									ret := 0.368852
								if( tema > 39.7 )
									ret := 0.057534
	if( ema12 > 0.006918 )
		if( ema13 <= 0.219796 )
			if( VIM <= 1.06084 )
				if( VIP_VIM <= 0.47224 )
					if( tema <= 54.7453 )
						if( tema <= 45.5522 )
							if( ema1 <= 21.1683 )
								if( ema2 <= 20.2868 )
									ret := -0.750000 // sell
								if( ema2 > 20.2868 )
									ret := 1.000000 // buy
							if( ema1 > 21.1683 )
								if( VIM <= 0.841706 )
									ret := 0.105772
								if( VIM > 0.841706 )
									ret := 0.038539
						if( tema > 45.5522 )
							if( VIP_VIM <= 0.124339 )
								if( ema13 <= 0.145544 )
									ret := 0.196078
								if( ema13 > 0.145544 )
									ret := -1.000000 // sell
							if( VIP_VIM > 0.124339 )
								if( ema12 <= 0.101297 )
									ret := 0.571429
								if( ema12 > 0.101297 )
									ret := 0.911765 // buy
					if( tema > 54.7453 )
						if( ema13 <= 0.138392 )
							if( VIP <= 1.13525 )
								if( ema13 <= 0.075926 )
									ret := -1.000000 // sell
								if( ema13 > 0.075926 )
									ret := -0.909091 // sell
							if( VIP > 1.13525 )
								ret := -0.666667
						if( ema13 > 0.138392 )
							if( ema12 <= 0.068733 )
								ret := 0.333333
							if( ema12 > 0.068733 )
								if( ema2 <= 54.7113 )
									ret := 0.250000
								if( ema2 > 54.7113 )
									ret := -0.739130 // sell
				if( VIP_VIM > 0.47224 )
					if( ema2 <= 43.3909 )
						if( ema2 <= 43.2598 )
							if( ema1 <= 39.5 )
								if( ema12 <= 0.062433 )
									ret := -0.014681
								if( ema12 > 0.062433 )
									ret := -0.165270
							if( ema1 > 39.5 )
								if( ema2 <= 42.5534 )
									ret := 0.244939
								if( ema2 > 42.5534 )
									ret := -0.288462
						if( ema2 > 43.2598 )
							if( ema1 <= 43.3889 )
								ret := -1.000000 // sell
							if( ema1 > 43.3889 )
								ret := -0.400000
					if( ema2 > 43.3909 )
						if( ema13 <= 0.095446 )
							if( ema2 <= 44.3819 )
								if( ema2 <= 43.8919 )
									ret := -0.250000
								if( ema2 > 43.8919 )
									ret := -1.000000 // sell
							if( ema2 > 44.3819 )
								ret := 0.250000
						if( ema13 > 0.095446 )
							if( VIM <= 0.588276 )
								ret := -0.500000
							if( VIM > 0.588276 )
								if( tema <= 47.2063 )
									ret := 0.688000
								if( tema > 47.2063 )
									ret := -0.090909
			if( VIM > 1.06084 )
				if( ema12 <= 0.029505 )
					if( VIM <= 2.77956 )
						if( ema12 <= 0.016973 )
							if( ema13 <= 0.024674 )
								if( VIP <= 2.80423 )
									ret := -0.053691
								if( VIP > 2.80423 )
									ret := -0.590164
							if( ema13 > 0.024674 )
								if( tema <= 40.3587 )
									ret := 0.130785
								if( tema > 40.3587 )
									ret := -0.144928
						if( ema12 > 0.016973 )
							if( ema1 <= 33.3507 )
								if( ema13 <= 0.029462 )
									ret := -0.557604
								if( ema13 > 0.029462 )
									ret := -0.196464
							if( ema1 > 33.3507 )
								if( ema1 <= 39.4501 )
									ret := 0.180905
								if( ema1 > 39.4501 )
									ret := -0.155779
					if( VIM > 2.77956 )
						if( ema3 <= 22.2338 )
							if( VIP_VIM <= 0.114379 )
								if( ema12 <= 0.009758 )
									ret := -0.142857
								if( ema12 > 0.009758 )
									ret := -0.793103 // sell
							if( VIP_VIM > 0.114379 )
								if( ema12 <= 0.024562 )
									ret := 0.055556
								if( ema12 > 0.024562 )
									ret := -1.000000 // sell
						if( ema3 > 22.2338 )
							if( ema13 <= 0.010995 )
								if( VIP <= 2.89638 )
									ret := 0.341463
								if( VIP > 2.89638 )
									ret := -0.178744
							if( ema13 > 0.010995 )
								if( tema <= 23.5604 )
									ret := 0.332090
								if( tema > 23.5604 )
									ret := 0.077731
				if( ema12 > 0.029505 )
					if( ema2 <= 33.3028 )
						if( VIM <= 5.99133 )
							if( ema2 <= 22.0332 )
								if( ema3 <= 21.4723 )
									ret := -0.482759
								if( ema3 > 21.4723 )
									ret := 0.289855
							if( ema2 > 22.0332 )
								if( ema2 <= 23.6871 )
									ret := -0.509859
								if( ema2 > 23.6871 )
									ret := -0.281773
						if( VIM > 5.99133 )
							if( VIP <= 37.9415 )
								if( ema13 <= 0.094084 )
									ret := -0.141975
								if( ema13 > 0.094084 )
									ret := 0.223529
							if( VIP > 37.9415 )
								if( ema1 <= 23.4667 )
									ret := 0.000000
								if( ema1 > 23.4667 )
									ret := -0.793103 // sell
					if( ema2 > 33.3028 )
						if( ema12 <= 0.072161 )
							if( ema13 <= 0.117801 )
								if( VIP <= 5.49929 )
									ret := -0.035354
								if( VIP > 5.49929 )
									ret := -0.388489
							if( ema13 > 0.117801 )
								if( VIM <= 1.34746 )
									ret := -0.176471
								if( VIM > 1.34746 )
									ret := 0.490741
						if( ema12 > 0.072161 )
							if( VIP_VIM <= 0.30733 )
								if( VIM <= 7.67732 )
									ret := -0.691729
								if( VIM > 7.67732 )
									ret := -0.208333
							if( VIP_VIM > 0.30733 )
								if( VIM <= 4.53632 )
									ret := -0.059524
								if( VIM > 4.53632 )
									ret := -0.702128 // sell
		if( ema13 > 0.219796 )
			if( ema3 <= 37.5614 )
				if( ema12 <= 0.393323 )
					if( tema <= 25.014 )
						if( ema13 <= 0.521629 )
							if( tema <= 22.6845 )
								if( VIM <= 0.753468 )
									ret := -0.071429
								if( VIM > 0.753468 )
									ret := 0.973214 // buy
							if( tema > 22.6845 )
								if( ema3 <= 22.3483 )
									ret := -0.800000 // sell
								if( ema3 > 22.3483 )
									ret := 0.592814
						if( ema13 > 0.521629 )
							if( tema <= 22.0336 )
								ret := -0.500000
							if( tema > 22.0336 )
								ret := -1.000000 // sell
					if( tema > 25.014 )
						if( VIP_VIM <= 0.815737 )
							if( tema <= 25.6623 )
								if( VIM <= 0.855245 )
									ret := -0.642857
								if( VIM > 0.855245 )
									ret := 1.000000 // buy
							if( tema > 25.6623 )
								if( ema1 <= 33.8957 )
									ret := 0.203315
								if( ema1 > 33.8957 )
									ret := 0.408616
						if( VIP_VIM > 0.815737 )
							if( ema13 <= 0.295159 )
								if( ema12 <= 0.145328 )
									ret := -0.200000
								if( ema12 > 0.145328 )
									ret := 0.500000
							if( ema13 > 0.295159 )
								if( ema2 <= 37.1471 )
									ret := -0.504132
								if( ema2 > 37.1471 )
									ret := 0.600000
				if( ema12 > 0.393323 )
					if( VIP <= 1.26251 )
						if( ema13 <= 1.18265 )
							if( VIM <= 0.724036 )
								ret := -1.000000 // sell
							if( VIM > 0.724036 )
								ret := 0.250000
						if( ema13 > 1.18265 )
							ret := 1.000000 // buy
					if( VIP > 1.26251 )
						if( ema1 <= 30.4803 )
							if( ema12 <= 1.28754 )
								if( VIM <= 0.515729 )
									ret := -0.750000 // sell
								if( VIM > 0.515729 )
									ret := -0.958333 // sell
							if( ema12 > 1.28754 )
								ret := -0.500000
						if( ema1 > 30.4803 )
							if( VIP_VIM <= 0.904302 )
								ret := -0.333333
							if( VIP_VIM > 0.904302 )
								ret := -1.000000 // sell
			if( ema3 > 37.5614 )
				if( ema3 <= 37.7171 )
					if( tema <= 38.5094 )
						if( ema2 <= 37.8125 )
							if( tema <= 38.0319 )
								if( VIP <= 1.33977 )
									ret := -0.750000 // sell
								if( VIP > 1.33977 )
									ret := -1.000000 // sell
							if( tema > 38.0319 )
								if( ema2 <= 37.776 )
									ret := 0.000000
								if( ema2 > 37.776 )
									ret := -0.600000
						if( ema2 > 37.8125 )
							ret := -1.000000 // sell
					if( tema > 38.5094 )
						ret := 0.000000
				if( ema3 > 37.7171 )
					if( ema2 <= 45.1375 )
						if( VIP_VIM <= 1.11264 )
							if( ema13 <= 0.338722 )
								if( ema2 <= 43.4848 )
									ret := 0.085928
								if( ema2 > 43.4848 )
									ret := -0.306818
							if( ema13 > 0.338722 )
								if( ema1 <= 39.5793 )
									ret := 0.098214
								if( ema1 > 39.5793 )
									ret := -0.422907
						if( VIP_VIM > 1.11264 )
							if( ema3 <= 43.1007 )
								if( VIM <= 0.940893 )
									ret := 0.282051
								if( VIM > 0.940893 )
									ret := 0.833333 // buy
							if( ema3 > 43.1007 )
								if( VIP_VIM <= 1.87483 )
									ret := -0.692308
								if( VIP_VIM > 1.87483 )
									ret := 0.600000
					if( ema2 > 45.1375 )
						if( ema2 <= 54.6509 )
							if( VIM <= 0.761541 )
								if( ema12 <= 0.565284 )
									ret := 0.701754 // buy
								if( ema12 > 0.565284 )
									ret := -0.750000 // sell
							if( VIM > 0.761541 )
								if( ema12 <= 0.203506 )
									ret := 0.523810
								if( ema12 > 0.203506 )
									ret := -0.863636 // sell
						if( ema2 > 54.6509 )
							if( VIM <= 0.682871 )
								ret := 0.285714
							if( VIM > 0.682871 )
								if( ema13 <= 0.473286 )
									ret := -0.720000 // sell
								if( ema13 > 0.473286 )
									ret := -0.166667
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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
float op_operation = decision_tree_0_UPST_1Min_3203a3dc(ema2, ema1, ema12, ema3, ema13, tema, VIP, VIP_VIM, VIM)

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


