//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: U_1Min_2BT0_2a7a00db Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_U_1Min_2BT0_2a7a00db", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_U_1Min_2a7a00db(bbp, bullPower, BBPower_Color, bearPower, bbm, ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( bbp <= -0.011828 )
		if( bbm <= 0.009799 )
			if( bbp <= -0.047393 )
				if( ema13 <= -0.023117 )
					if( bullPower <= -0.036573 )
						if( tema <= 16.309 )
							if( bearPower <= -0.058724 )
								if( ema1 <= 14.6354 )
									ret := 0.406780
								if( ema1 > 14.6354 )
									ret := -0.579310
							if( bearPower > -0.058724 )
								if( bbm <= 0.000502 )
									ret := 0.188406
								if( bbm > 0.000502 )
									ret := 0.477612
						if( tema > 16.309 )
							if( ema1 <= 17.2799 )
								if( ema1 <= 16.384 )
									ret := 0.342105
								if( ema1 > 16.384 )
									ret := 0.793970 // buy
							if( ema1 > 17.2799 )
								if( ema3 <= 19.0585 )
									ret := -0.019868
								if( ema3 > 19.0585 )
									ret := 0.428344
					if( bullPower > -0.036573 )
						if( bearPower <= -0.029302 )
							if( ema2 <= 14.8798 )
								if( bearPower <= -0.032677 )
									ret := -0.600000
								if( bearPower > -0.032677 )
									ret := -0.333333
							if( ema2 > 14.8798 )
								if( ema13 <= -0.087258 )
									ret := -0.846154 // sell
								if( ema13 > -0.087258 )
									ret := 0.052411
						if( bearPower > -0.029302 )
							if( ema12 <= -0.014782 )
								if( ema2 <= 16.5379 )
									ret := 0.477273
								if( ema2 > 16.5379 )
									ret := -0.035897
							if( ema12 > -0.014782 )
								if( ema2 <= 16.148 )
									ret := 0.333333
								if( ema2 > 16.148 )
									ret := 0.795918 // buy
				if( ema13 > -0.023117 )
					if( ema13 <= -0.014156 )
						if( ema3 <= 15.8504 )
							if( ema2 <= 15.2339 )
								if( bearPower <= -0.034834 )
									ret := 0.812500 // buy
								if( bearPower > -0.034834 )
									ret := -0.142857
							if( ema2 > 15.2339 )
								if( ema13 <= -0.020398 )
									ret := 0.375000
								if( ema13 > -0.020398 )
									ret := -0.387097
						if( ema3 > 15.8504 )
							if( ema12 <= -0.008296 )
								if( ema1 <= 16.3511 )
									ret := 0.775281 // buy
								if( ema1 > 16.3511 )
									ret := 0.417722
							if( ema12 > -0.008296 )
								ret := 0.071429
					if( ema13 > -0.014156 )
						if( ema1 <= 19.9888 )
							if( ema13 <= 0.040935 )
								if( bullPower <= -0.034567 )
									ret := 0.727273 // buy
								if( bullPower > -0.034567 )
									ret := 0.540000
							if( ema13 > 0.040935 )
								ret := 0.000000
						if( ema1 > 19.9888 )
							if( ema3 <= 21.7986 )
								if( tema <= 20.5984 )
									ret := -0.133333
								if( tema > 20.5984 )
									ret := 0.426667
							if( ema3 > 21.7986 )
								if( ema1 <= 23.1991 )
									ret := 0.695946
								if( ema1 > 23.1991 )
									ret := 0.504000
			if( bbp > -0.047393 )
				if( ema12 <= 0.002513 )
					if( ema1 <= 16.0547 )
						if( ema2 <= 15.9556 )
							if( tema <= 15.7359 )
								if( ema1 <= 14.2366 )
									ret := 0.088000
								if( ema1 > 14.2366 )
									ret := 0.378973
							if( tema > 15.7359 )
								if( tema <= 15.8003 )
									ret := -0.571429
								if( tema > 15.8003 )
									ret := 0.212766
						if( ema2 > 15.9556 )
							if( bbm <= 0.004623 )
								if( ema12 <= -0.003536 )
									ret := 0.870130 // buy
								if( ema12 > -0.003536 )
									ret := 0.250000
							if( bbm > 0.004623 )
								if( ema3 <= 16.0609 )
									ret := 0.105263
								if( ema3 > 16.0609 )
									ret := 0.454545
					if( ema1 > 16.0547 )
						if( ema2 <= 16.4221 )
							if( bbm <= 0.006612 )
								if( ema3 <= 16.3791 )
									ret := 0.038462
								if( ema3 > 16.3791 )
									ret := -0.325843
							if( bbm > 0.006612 )
								if( ema13 <= -0.023458 )
									ret := 0.125000
								if( ema13 > -0.023458 )
									ret := -0.482759
						if( ema2 > 16.4221 )
							if( ema1 <= 23.2081 )
								if( ema3 <= 22.7197 )
									ret := 0.127534
								if( ema3 > 22.7197 )
									ret := 0.607477
							if( ema1 > 23.2081 )
								if( tema <= 23.3766 )
									ret := -0.511628
								if( tema > 23.3766 )
									ret := 0.032653
				if( ema12 > 0.002513 )
					if( bullPower <= -0.011209 )
						if( ema12 <= 0.002848 )
							ret := -0.062500
						if( ema12 > 0.002848 )
							if( bbm <= 0.001779 )
								if( ema1 <= 20.8786 )
									ret := 0.669291
								if( ema1 > 20.8786 )
									ret := 0.268293
							if( bbm > 0.001779 )
								ret := 1.000000 // buy
					if( bullPower > -0.011209 )
						if( ema2 <= 16.567 )
							if( ema13 <= 0.024394 )
								if( bullPower <= -0.009978 )
									ret := -0.111111
								if( bullPower > -0.009978 )
									ret := 0.453125
							if( ema13 > 0.024394 )
								ret := -0.333333
						if( ema2 > 16.567 )
							if( ema3 <= 17.202 )
								if( tema <= 16.915 )
									ret := 0.653846
								if( tema > 16.915 )
									ret := 0.861111 // buy
							if( ema3 > 17.202 )
								if( ema3 <= 17.7576 )
									ret := -0.636364
								if( ema3 > 17.7576 )
									ret := 0.474227
		if( bbm > 0.009799 )
			if( tema <= 14.1961 )
				if( ema3 <= 13.8568 )
					if( ema3 <= 13.6183 )
						if( tema <= 13.2383 )
							ret := 1.000000 // buy
						if( tema > 13.2383 )
							ret := 0.785714 // buy
					if( ema3 > 13.6183 )
						if( bbm <= 0.147293 )
							if( bearPower <= -0.063822 )
								if( bullPower <= -0.060784 )
									ret := -0.750000 // sell
								if( bullPower > -0.060784 )
									ret := -0.974359 // sell
							if( bearPower > -0.063822 )
								if( bullPower <= -0.007789 )
									ret := -0.384615
								if( bullPower > -0.007789 )
									ret := 0.466667
						if( bbm > 0.147293 )
							ret := 0.400000
				if( ema3 > 13.8568 )
					if( ema3 <= 14.1985 )
						if( ema13 <= -0.070628 )
							if( ema1 <= 13.7584 )
								if( ema2 <= 13.8443 )
									ret := 0.578947
								if( ema2 > 13.8443 )
									ret := 0.111111
							if( ema1 > 13.7584 )
								ret := 1.000000 // buy
						if( ema13 > -0.070628 )
							if( ema1 <= 14.0605 )
								if( bearPower <= -0.028514 )
									ret := 0.726496 // buy
								if( bearPower > -0.028514 )
									ret := 0.170732
							if( ema1 > 14.0605 )
								if( ema12 <= -0.007758 )
									ret := -0.484375
								if( ema12 > -0.007758 )
									ret := 0.782609 // buy
					if( ema3 > 14.1985 )
						if( ema2 <= 14.2192 )
							if( ema3 <= 14.2364 )
								if( tema <= 14.1515 )
									ret := 1.000000 // buy
								if( tema > 14.1515 )
									ret := 0.864865 // buy
							if( ema3 > 14.2364 )
								ret := 0.375000
						if( ema2 > 14.2192 )
							if( bearPower <= -0.177244 )
								ret := 1.000000 // buy
							if( bearPower > -0.177244 )
								if( tema <= 14.0979 )
									ret := 1.000000 // buy
								if( tema > 14.0979 )
									ret := -0.375000
			if( tema > 14.1961 )
				if( ema13 <= -0.135383 )
					if( tema <= 21.4697 )
						if( ema1 <= 20.6255 )
							if( tema <= 20.4951 )
								if( ema1 <= 16.5914 )
									ret := 0.079710
								if( ema1 > 16.5914 )
									ret := 0.465021
							if( tema > 20.4951 )
								if( tema <= 20.5193 )
									ret := -1.000000 // sell
								if( tema > 20.5193 )
									ret := -0.571429
						if( ema1 > 20.6255 )
							if( ema12 <= -0.089736 )
								if( bbm <= 0.097231 )
									ret := 0.769231 // buy
								if( bbm > 0.097231 )
									ret := 0.987952 // buy
							if( ema12 > -0.089736 )
								if( ema3 <= 21.5571 )
									ret := 0.941176 // buy
								if( ema3 > 21.5571 )
									ret := 0.230769
					if( tema > 21.4697 )
						if( tema <= 22.1373 )
							if( bbp <= -0.297655 )
								if( ema13 <= -0.250273 )
									ret := -0.652174
								if( ema13 > -0.250273 )
									ret := -0.950820 // sell
							if( bbp > -0.297655 )
								if( tema <= 21.6164 )
									ret := -0.862069 // sell
								if( tema > 21.6164 )
									ret := 0.054545
						if( tema > 22.1373 )
							if( tema <= 23.0668 )
								if( ema13 <= -0.215705 )
									ret := -0.063492
								if( ema13 > -0.215705 )
									ret := 0.655556
							if( tema > 23.0668 )
								if( ema12 <= -0.081448 )
									ret := 0.051724
								if( ema12 > -0.081448 )
									ret := -0.562500
				if( ema13 > -0.135383 )
					if( bbm <= 0.026025 )
						if( ema1 <= 14.2744 )
							if( ema1 <= 14.2248 )
								ret := -0.750000 // sell
							if( ema1 > 14.2248 )
								if( ema2 <= 14.2534 )
									ret := 0.958333 // buy
								if( ema2 > 14.2534 )
									ret := 0.392857
						if( ema1 > 14.2744 )
							if( ema12 <= 0.009538 )
								if( bbp <= -0.088242 )
									ret := 0.046301
								if( bbp > -0.088242 )
									ret := -0.058931
							if( ema12 > 0.009538 )
								if( ema1 <= 18.0082 )
									ret := 0.263158
								if( ema1 > 18.0082 )
									ret := 0.779412 // buy
					if( bbm > 0.026025 )
						if( bbm <= 0.535382 )
							if( bullPower <= 0.01324 )
								if( bbp <= -0.043982 )
									ret := 0.039566
								if( bbp > -0.043982 )
									ret := -0.036299
							if( bullPower > 0.01324 )
								if( ema1 <= 24.4768 )
									ret := 0.114729
								if( ema1 > 24.4768 )
									ret := 0.511905
						if( bbm > 0.535382 )
							ret := -0.800000 // sell
	if( bbp > -0.011828 )
		if( bbm <= 0.004956 )
			if( bullPower <= 0.026297 )
				if( ema13 <= 0.05884 )
					if( bullPower <= 0.009715 )
						if( tema <= 24.0939 )
							if( ema3 <= 14.281 )
								if( bullPower <= -0.001062 )
									ret := 0.894737 // buy
								if( bullPower > -0.001062 )
									ret := -0.137931
							if( ema3 > 14.281 )
								if( ema12 <= -0.003808 )
									ret := -0.174475
								if( ema12 > -0.003808 )
									ret := -0.021339
						if( tema > 24.0939 )
							if( ema2 <= 24.8024 )
								if( bbp <= 0.014689 )
									ret := 0.507463
								if( bbp > 0.014689 )
									ret := 0.954545 // buy
							if( ema2 > 24.8024 )
								if( ema2 <= 25.3611 )
									ret := -0.076923
								if( ema2 > 25.3611 )
									ret := -0.583333
					if( bullPower > 0.009715 )
						if( ema3 <= 18.88 )
							if( tema <= 16.0859 )
								if( ema1 <= 15.5803 )
									ret := -0.272727
								if( ema1 > 15.5803 )
									ret := -0.589744
							if( tema > 16.0859 )
								if( ema1 <= 16.3768 )
									ret := 0.067308
								if( ema1 > 16.3768 )
									ret := -0.330517
						if( ema3 > 18.88 )
							if( ema13 <= 0.017662 )
								if( ema2 <= 21.0216 )
									ret := 0.195730
								if( ema2 > 21.0216 )
									ret := -0.345912
							if( ema13 > 0.017662 )
								if( bullPower <= 0.019886 )
									ret := -0.011236
								if( bullPower > 0.019886 )
									ret := 0.273171
				if( ema13 > 0.05884 )
					if( ema12 <= 0.030203 )
						if( ema12 <= 0.027871 )
							ret := 0.315789
						if( ema12 > 0.027871 )
							ret := 0.571429
					if( ema12 > 0.030203 )
						if( tema <= 19.0785 )
							ret := -0.090909
						if( tema > 19.0785 )
							ret := 0.235294
			if( bullPower > 0.026297 )
				if( ema12 <= 0.02578 )
					if( ema13 <= 0.007462 )
						if( ema2 <= 24.1492 )
							if( ema12 <= -0.004605 )
								if( ema1 <= 16.6931 )
									ret := -0.545455
								if( ema1 > 16.6931 )
									ret := -0.214286
							if( ema12 > -0.004605 )
								if( ema3 <= 15.0653 )
									ret := -0.857143 // sell
								if( ema3 > 15.0653 )
									ret := -0.620047
						if( ema2 > 24.1492 )
							if( bullPower <= 0.042431 )
								ret := -0.750000 // sell
							if( bullPower > 0.042431 )
								ret := -1.000000 // sell
					if( ema13 > 0.007462 )
						if( bullPower <= 0.068055 )
							if( ema12 <= 0.008818 )
								if( ema2 <= 15.7265 )
									ret := -0.833333 // sell
								if( ema2 > 15.7265 )
									ret := 0.090909
							if( ema12 > 0.008818 )
								if( bullPower <= 0.051319 )
									ret := -0.508790
								if( bullPower > 0.051319 )
									ret := -0.263393
						if( bullPower > 0.068055 )
							if( ema2 <= 23.1844 )
								ret := -1.000000 // sell
							if( ema2 > 23.1844 )
								ret := -0.692308
				if( ema12 > 0.02578 )
					if( bbp <= 0.106769 )
						if( ema12 <= 0.032127 )
							if( ema2 <= 16.1927 )
								if( tema <= 15.9133 )
									ret := -0.318182
								if( tema > 15.9133 )
									ret := -0.894737 // sell
							if( ema2 > 16.1927 )
								if( ema2 <= 20.065 )
									ret := 0.208955
								if( ema2 > 20.065 )
									ret := -0.186916
						if( ema12 > 0.032127 )
							if( ema3 <= 14.0731 )
								ret := -0.500000
							if( ema3 > 14.0731 )
								if( bbm <= 0.002172 )
									ret := 0.408759
								if( bbm > 0.002172 )
									ret := 0.000000
					if( bbp > 0.106769 )
						if( ema12 <= 0.034784 )
							if( tema <= 16.2897 )
								if( ema13 <= 0.042269 )
									ret := 0.133333
								if( ema13 > 0.042269 )
									ret := -0.875000 // sell
							if( tema > 16.2897 )
								if( tema <= 16.4715 )
									ret := -1.000000 // sell
								if( tema > 16.4715 )
									ret := -0.723577 // sell
						if( ema12 > 0.034784 )
							if( tema <= 16.1094 )
								if( ema2 <= 14.4463 )
									ret := -0.212121
								if( ema2 > 14.4463 )
									ret := 0.441860
							if( tema > 16.1094 )
								if( ema1 <= 16.1174 )
									ret := -0.787879 // sell
								if( ema1 > 16.1174 )
									ret := -0.270833
		if( bbm > 0.004956 )
			if( ema12 <= 0.024925 )
				if( bbp <= 0.022887 )
					if( ema3 <= 16.625 )
						if( ema1 <= 14.2687 )
							if( tema <= 14.1941 )
								if( ema1 <= 14.0639 )
									ret := 0.623656
								if( ema1 > 14.0639 )
									ret := -0.314815
							if( tema > 14.1941 )
								if( bbp <= -0.005935 )
									ret := 0.200000
								if( bbp > -0.005935 )
									ret := 0.865854 // buy
						if( ema1 > 14.2687 )
							if( ema13 <= 0.001093 )
								if( bullPower <= 0.003258 )
									ret := -0.038251
								if( bullPower > 0.003258 )
									ret := 0.180168
							if( ema13 > 0.001093 )
								if( ema3 <= 14.5084 )
									ret := -0.429952
								if( ema3 > 14.5084 )
									ret := -0.005669
					if( ema3 > 16.625 )
						if( ema1 <= 16.8226 )
							if( bearPower <= 0.003353 )
								if( bbp <= 0.001994 )
									ret := -0.194139
								if( bbp > 0.001994 )
									ret := -0.498525
							if( bearPower > 0.003353 )
								if( bbp <= 0.020687 )
									ret := 0.689655
								if( bbp > 0.020687 )
									ret := 0.000000
						if( ema1 > 16.8226 )
							if( ema2 <= 17.9741 )
								if( ema12 <= 0.011228 )
									ret := 0.039224
								if( ema12 > 0.011228 )
									ret := -0.202970
							if( ema2 > 17.9741 )
								if( ema13 <= -0.014266 )
									ret := 0.063148
								if( ema13 > -0.014266 )
									ret := -0.101259
				if( bbp > 0.022887 )
					if( ema13 <= -0.001547 )
						if( ema1 <= 16.8278 )
							if( ema3 <= 13.8804 )
								ret := 0.833333 // buy
							if( ema3 > 13.8804 )
								if( bbm <= 0.097151 )
									ret := -0.383745
								if( bbm > 0.097151 )
									ret := 0.229167
						if( ema1 > 16.8278 )
							if( ema2 <= 16.9986 )
								if( bullPower <= 0.026945 )
									ret := 1.000000 // buy
								if( bullPower > 0.026945 )
									ret := 0.312500
							if( ema2 > 16.9986 )
								if( bullPower <= 0.173158 )
									ret := -0.119093
								if( bullPower > 0.173158 )
									ret := 0.838710 // buy
					if( ema13 > -0.001547 )
						if( bearPower <= 0.030887 )
							if( bbp <= 0.099472 )
								if( tema <= 14.5392 )
									ret := -0.261667
								if( tema > 14.5392 )
									ret := -0.037966
							if( bbp > 0.099472 )
								if( bbm <= 0.048288 )
									ret := -0.520000
								if( bbm > 0.048288 )
									ret := 0.283626
						if( bearPower > 0.030887 )
							if( tema <= 15.4991 )
								if( bbp <= 0.145069 )
									ret := 0.205882
								if( bbp > 0.145069 )
									ret := -1.000000 // sell
							if( tema > 15.4991 )
								if( bbm <= 0.020475 )
									ret := -0.341501
								if( bbm > 0.020475 )
									ret := -0.043590
			if( ema12 > 0.024925 )
				if( tema <= 20.6742 )
					if( bearPower <= -0.034806 )
						if( ema2 <= 16.4284 )
							if( bbm <= 0.212284 )
								ret := 0.100000
							if( bbm > 0.212284 )
								ret := -0.846154 // sell
						if( ema2 > 16.4284 )
							if( ema3 <= 17.4758 )
								if( tema <= 16.763 )
									ret := -0.785714 // sell
								if( tema > 16.763 )
									ret := -1.000000 // sell
							if( ema3 > 17.4758 )
								ret := -0.588235
					if( bearPower > -0.034806 )
						if( ema13 <= 0.041163 )
							if( ema3 <= 16.3473 )
								if( bearPower <= 0.067439 )
									ret := -0.375000
								if( bearPower > 0.067439 )
									ret := -0.931034 // sell
							if( ema3 > 16.3473 )
								if( ema1 <= 20.143 )
									ret := 0.030837
								if( ema1 > 20.143 )
									ret := 0.725490 // buy
						if( ema13 > 0.041163 )
							if( tema <= 20.5734 )
								if( bbp <= 0.529436 )
									ret := 0.096450
								if( bbp > 0.529436 )
									ret := 0.639344
							if( tema > 20.5734 )
								if( bullPower <= 0.214667 )
									ret := 0.679487
								if( bullPower > 0.214667 )
									ret := -0.666667
				if( tema > 20.6742 )
					if( bearPower <= 0.054658 )
						if( ema3 <= 23.4293 )
							if( ema3 <= 22.8675 )
								if( ema3 <= 21.706 )
									ret := -0.057038
								if( ema3 > 21.706 )
									ret := 0.123723
							if( ema3 > 22.8675 )
								if( ema3 <= 23.034 )
									ret := -0.557377
								if( ema3 > 23.034 )
									ret := -0.121076
						if( ema3 > 23.4293 )
							if( ema2 <= 24.2285 )
								if( ema12 <= 0.074983 )
									ret := 0.542636
								if( ema12 > 0.074983 )
									ret := -0.400000
							if( ema2 > 24.2285 )
								if( bearPower <= 0.014813 )
									ret := -0.367089
								if( bearPower > 0.014813 )
									ret := 0.139535
					if( bearPower > 0.054658 )
						if( ema3 <= 21.1952 )
							if( tema <= 21.1509 )
								if( tema <= 20.9336 )
									ret := -0.335052
								if( tema > 20.9336 )
									ret := 0.435897
							if( tema > 21.1509 )
								if( bearPower <= 0.062336 )
									ret := -0.400000
								if( bearPower > 0.062336 )
									ret := -0.893204 // sell
						if( ema3 > 21.1952 )
							if( ema2 <= 22.9863 )
								if( bbp <= 0.254023 )
									ret := -0.041063
								if( bbp > 0.254023 )
									ret := 0.290970
							if( ema2 > 22.9863 )
								if( ema3 <= 23.2544 )
									ret := -0.590278
								if( ema3 > 23.2544 )
									ret := -0.128205
	
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
float op_operation = decision_tree_0_U_1Min_2a7a00db(bbp, bullPower, BBPower_Color, bearPower, bbm, ema2, ema1, ema12, ema3, ema13, tema)

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


