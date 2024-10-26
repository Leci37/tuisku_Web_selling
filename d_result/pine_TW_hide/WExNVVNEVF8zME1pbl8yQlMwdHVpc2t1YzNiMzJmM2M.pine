//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: XLMUSDT_30Min_2BS0_c3b32f3c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XLMUSDT_30Min_2BS0_c3b32f3c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XLMUSDT_30Min_c3b32f3c(bbp, bullPower, BBPower_Color, bearPower, bbm, smoothK_k, d_k, k, smoothD_d, rsi1, d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( rsi1 <= 50.0103 )
		if( d_k <= -4.77814 )
			if( bbp <= -0.00205 )
				if( rsi1 <= 36.3 )
					if( bullPower <= -0.001356 )
						if( d_k <= -9.60467 )
							if( rsi1 <= 25.0063 )
								if( bbp <= -0.021272 )
									ret := 0.629630
								if( bbp > -0.021272 )
									ret := -0.191919
							if( rsi1 > 25.0063 )
								if( smoothD_d <= 53.062 )
									ret := 0.654122
								if( smoothD_d > 53.062 )
									ret := 0.193798
						if( d_k > -9.60467 )
							if( rsi1 <= 21.1091 )
								if( bbm <= 0.001502 )
									ret := 0.194444
								if( bbm > 0.001502 )
									ret := -0.727273 // sell
							if( rsi1 > 21.1091 )
								if( rsi1 <= 34.4198 )
									ret := 0.055441
								if( rsi1 > 34.4198 )
									ret := 0.495868
					if( bullPower > -0.001356 )
						if( bullPower <= -0.000765 )
							if( smoothD_d <= 2.12272 )
								if( bearPower <= -0.00201 )
									ret := -0.875000 // sell
								if( bearPower > -0.00201 )
									ret := -0.250000
							if( smoothD_d > 2.12272 )
								if( smoothD_d <= 14.832 )
									ret := -0.180328
								if( smoothD_d > 14.832 )
									ret := 0.014545
						if( bullPower > -0.000765 )
							if( d_k <= -9.88777 )
								if( bbm <= 0.005825 )
									ret := -0.256000
								if( bbm > 0.005825 )
									ret := 0.714286 // buy
							if( d_k > -9.88777 )
								if( bbm <= 0.005342 )
									ret := -0.389163
								if( bbm > 0.005342 )
									ret := -0.769231 // sell
				if( rsi1 > 36.3 )
					if( bullPower <= -0.001044 )
						if( rsi1 <= 48.0015 )
							if( d_k <= -17.5633 )
								if( d <= 20.4335 )
									ret := 0.419355
								if( d > 20.4335 )
									ret := 0.857143 // buy
							if( d_k > -17.5633 )
								if( smoothK_k <= 76.366 )
									ret := 0.590909
								if( smoothK_k > 76.366 )
									ret := 0.772021 // buy
						if( rsi1 > 48.0015 )
							if( rsi1 <= 49.7782 )
								if( d <= 78.9701 )
									ret := 0.973510 // buy
								if( d > 78.9701 )
									ret := 0.714286 // buy
							if( rsi1 > 49.7782 )
								if( bbm <= 0.005066 )
									ret := 0.444444
								if( bbm > 0.005066 )
									ret := 1.000000 // buy
					if( bullPower > -0.001044 )
						if( rsi1 <= 40.0861 )
							if( smoothK_k <= 71.4851 )
								if( bullPower <= -0.000596 )
									ret := 0.369128
								if( bullPower > -0.000596 )
									ret := 0.089005
							if( smoothK_k > 71.4851 )
								if( d_k <= -11.5627 )
									ret := 0.181818
								if( d_k > -11.5627 )
									ret := -0.481481
						if( rsi1 > 40.0861 )
							if( d_k <= -8.20061 )
								if( k <= 38.6066 )
									ret := 0.447917
								if( k > 38.6066 )
									ret := 0.684000
							if( d_k > -8.20061 )
								if( bbp <= -0.012748 )
									ret := 1.000000 // buy
								if( bbp > -0.012748 )
									ret := 0.281159
			if( bbp > -0.00205 )
				if( rsi1 <= 39.9445 )
					if( bbm <= 0.00041 )
						if( rsi1 <= 26.2714 )
							if( k <= 29.8908 )
								if( d_k <= -6.83883 )
									ret := -0.703704 // sell
								if( d_k > -6.83883 )
									ret := -0.222222
							if( k > 29.8908 )
								ret := 0.000000
						if( rsi1 > 26.2714 )
							if( bbp <= -7.1e-05 )
								if( d_k <= -20.2585 )
									ret := -0.256410
								if( d_k > -20.2585 )
									ret := -0.042755
							if( bbp > -7.1e-05 )
								if( k <= 52.8456 )
									ret := -0.384615
								if( k > 52.8456 )
									ret := -0.058824
					if( bbm > 0.00041 )
						if( rsi1 <= 30.5549 )
							if( bullPower <= -0.000218 )
								if( rsi1 <= 24.2834 )
									ret := -0.764706 // sell
								if( rsi1 > 24.2834 )
									ret := -0.391304
							if( bullPower > -0.000218 )
								if( bullPower <= 6e-05 )
									ret := -0.698795
								if( bullPower > 6e-05 )
									ret := -0.892308 // sell
						if( rsi1 > 30.5549 )
							if( bullPower <= -7e-05 )
								if( d <= 38.9287 )
									ret := -0.194767
								if( d > 38.9287 )
									ret := -0.013605
							if( bullPower > -7e-05 )
								if( bullPower <= 0.002048 )
									ret := -0.476027
								if( bullPower > 0.002048 )
									ret := -0.034483
				if( rsi1 > 39.9445 )
					if( bbp <= -0.000801 )
						if( d <= 66.1596 )
							if( rsi1 <= 45.4701 )
								if( bearPower <= -0.002683 )
									ret := 0.527778
								if( bearPower > -0.002683 )
									ret := 0.090909
							if( rsi1 > 45.4701 )
								if( bbp <= -0.00125 )
									ret := 0.485816
								if( bbp > -0.00125 )
									ret := 0.238739
						if( d > 66.1596 )
							if( k <= 74.9355 )
								if( bbm <= 0.001971 )
									ret := -0.428571
								if( bbm > 0.001971 )
									ret := -1.000000 // sell
							if( k > 74.9355 )
								if( bbm <= 0.006972 )
									ret := 0.133562
								if( bbm > 0.006972 )
									ret := -1.000000 // sell
					if( bbp > -0.000801 )
						if( bbp <= 0.000215 )
							if( rsi1 <= 44.854 )
								if( bbm <= 0.000515 )
									ret := -0.029570
								if( bbm > 0.000515 )
									ret := -0.296296
							if( rsi1 > 44.854 )
								if( smoothD_d <= 16.7386 )
									ret := -0.069767
								if( smoothD_d > 16.7386 )
									ret := 0.077615
						if( bbp > 0.000215 )
							if( rsi1 <= 46.1662 )
								if( bearPower <= -0.00126 )
									ret := -0.037736
								if( bearPower > -0.00126 )
									ret := -0.504983
							if( rsi1 > 46.1662 )
								if( k <= 12.0298 )
									ret := 0.333333
								if( k > 12.0298 )
									ret := -0.214912
		if( d_k > -4.77814 )
			if( bullPower <= 0.000465 )
				if( rsi1 <= 32.7951 )
					if( rsi1 <= 26.2619 )
						if( rsi1 <= 15.8826 )
							if( bbm <= 0.000301 )
								if( bullPower <= -0.000123 )
									ret := -0.076923
								if( bullPower > -0.000123 )
									ret := -0.434783
							if( bbm > 0.000301 )
								if( bbm <= 0.000605 )
									ret := -0.666667
								if( bbm > 0.000605 )
									ret := -0.857143 // sell
						if( rsi1 > 15.8826 )
							if( bbm <= 0.000501 )
								if( bbm <= 0.000204 )
									ret := -0.074468
								if( bbm > 0.000204 )
									ret := -0.367424
							if( bbm > 0.000501 )
								if( bullPower <= -0.001147 )
									ret := -0.375444
								if( bullPower > -0.001147 )
									ret := -0.709894 // sell
					if( rsi1 > 26.2619 )
						if( d_k <= 1.18392 )
							if( d <= 2.76881 )
								if( d_k <= -0.610496 )
									ret := -0.565041
								if( d_k > -0.610496 )
									ret := -0.251825
							if( d > 2.76881 )
								if( bullPower <= -0.000833 )
									ret := 0.025126
								if( bullPower > -0.000833 )
									ret := -0.276596
						if( d_k > 1.18392 )
							if( bbm <= 0.000602 )
								if( bullPower <= 0.000192 )
									ret := -0.145548
								if( bullPower > 0.000192 )
									ret := -0.516393
							if( bbm > 0.000602 )
								if( bullPower <= -0.000661 )
									ret := -0.377535
								if( bullPower > -0.000661 )
									ret := -0.613730
				if( rsi1 > 32.7951 )
					if( bullPower <= -9.2e-05 )
						if( rsi1 <= 39.6228 )
							if( bullPower <= -0.000724 )
								if( bullPower <= -0.004669 )
									ret := 0.386364
								if( bullPower > -0.004669 )
									ret := 0.065836
							if( bullPower > -0.000724 )
								if( rsi1 <= 35.8216 )
									ret := -0.279601
								if( rsi1 > 35.8216 )
									ret := -0.020380
						if( rsi1 > 39.6228 )
							if( d <= 95.904 )
								if( bbp <= -0.000929 )
									ret := 0.280058
								if( bbp > -0.000929 )
									ret := 0.051613
							if( d > 95.904 )
								if( smoothD_d <= 95.7215 )
									ret := 0.675159
								if( smoothD_d > 95.7215 )
									ret := 0.250000
					if( bullPower > -9.2e-05 )
						if( rsi1 <= 39.964 )
							if( bbm <= 0.000503 )
								if( bullPower <= 0.000303 )
									ret := -0.090794
								if( bullPower > 0.000303 )
									ret := -0.388889
							if( bbm > 0.000503 )
								if( bullPower <= 0.000242 )
									ret := -0.341361
								if( bullPower > 0.000242 )
									ret := -0.529617
						if( rsi1 > 39.964 )
							if( rsi1 <= 43.2366 )
								if( bbp <= -0.011858 )
									ret := -1.000000 // sell
								if( bbp > -0.011858 )
									ret := -0.109948
							if( rsi1 > 43.2366 )
								if( bearPower <= -0.000498 )
									ret := 0.132224
								if( bearPower > -0.000498 )
									ret := -0.051339
			if( bullPower > 0.000465 )
				if( rsi1 <= 39.6174 )
					if( bearPower <= -0.001785 )
						if( bullPower <= 0.001969 )
							if( rsi1 <= 36.9108 )
								if( d_k <= -1.21323 )
									ret := -0.348837
								if( d_k > -1.21323 )
									ret := -0.689320
							if( rsi1 > 36.9108 )
								if( smoothK_k <= 9.25599 )
									ret := -0.109375
								if( smoothK_k > 9.25599 )
									ret := -0.459259
						if( bullPower > 0.001969 )
							if( bbm <= 0.005309 )
								if( d <= 21.6387 )
									ret := -0.318182
								if( d > 21.6387 )
									ret := -0.843750 // sell
							if( bbm > 0.005309 )
								if( d_k <= 6.78132 )
									ret := -0.800000 // sell
								if( d_k > 6.78132 )
									ret := -0.919075 // sell
					if( bearPower > -0.001785 )
						if( bullPower <= 0.000855 )
							if( rsi1 <= 33.314 )
								if( BBPower_Color <= 0.5 )
									ret := -0.908676 // sell
								if( BBPower_Color > 0.5 )
									ret := -0.800000 // sell
							if( rsi1 > 33.314 )
								if( d_k <= 27.7216 )
									ret := -0.684292
								if( d_k > 27.7216 )
									ret := -0.166667
						if( bullPower > 0.000855 )
							if( d_k <= 9.2181 )
								if( smoothK_k <= 7.37169 )
									ret := -0.881988 // sell
								if( smoothK_k > 7.37169 )
									ret := -0.709677 // sell
							if( d_k > 9.2181 )
								if( rsi1 <= 36.9229 )
									ret := -0.964730 // sell
								if( rsi1 > 36.9229 )
									ret := -0.882114 // sell
				if( rsi1 > 39.6174 )
					if( bbp <= 0.000859 )
						if( bbp <= -0.00166 )
							if( rsi1 <= 46.1869 )
								if( smoothD_d <= 53.4545 )
									ret := -0.009554
								if( smoothD_d > 53.4545 )
									ret := -0.410853
							if( rsi1 > 46.1869 )
								if( smoothD_d <= 88.4251 )
									ret := 0.314286
								if( smoothD_d > 88.4251 )
									ret := -0.818182 // sell
						if( bbp > -0.00166 )
							if( d_k <= 7.33102 )
								if( bearPower <= -0.000336 )
									ret := -0.175151
								if( bearPower > -0.000336 )
									ret := -0.344227
							if( d_k > 7.33102 )
								if( rsi1 <= 44.6113 )
									ret := -0.537698
								if( rsi1 > 44.6113 )
									ret := -0.254486
					if( bbp > 0.000859 )
						if( d_k <= 5.27236 )
							if( k <= 6.20077 )
								if( bbm <= 0.002699 )
									ret := -0.751020 // sell
								if( bbm > 0.002699 )
									ret := -0.540230
							if( k > 6.20077 )
								if( bearPower <= -0.000666 )
									ret := -0.183784
								if( bearPower > -0.000666 )
									ret := -0.458564
						if( d_k > 5.27236 )
							if( bullPower <= 0.00121 )
								if( rsi1 <= 48.0951 )
									ret := -0.538168
								if( rsi1 > 48.0951 )
									ret := -0.248000
							if( bullPower > 0.00121 )
								if( bearPower <= -0.001699 )
									ret := -0.460674
								if( bearPower > -0.001699 )
									ret := -0.785326 // sell
	if( rsi1 > 50.0103 )
		if( BBPower_Color <= 0.5 )
			if( bbm <= 0.0007 )
				if( rsi1 <= 60.028 )
					if( bearPower <= -0.000631 )
						if( bbp <= -0.001196 )
							if( d_k <= -13.7393 )
								if( rsi1 <= 51.6409 )
									ret := 0.571429
								if( rsi1 > 51.6409 )
									ret := 0.875000 // buy
							if( d_k > -13.7393 )
								if( rsi1 <= 54.238 )
									ret := 0.294118
								if( rsi1 > 54.238 )
									ret := 0.666667
						if( bbp > -0.001196 )
							if( d <= 86.0549 )
								if( bbm <= 0.000595 )
									ret := 0.602564
								if( bbm > 0.000595 )
									ret := 0.333333
							if( d > 86.0549 )
								if( bearPower <= -0.000712 )
									ret := 0.315789
								if( bearPower > -0.000712 )
									ret := 0.000000
					if( bearPower > -0.000631 )
						if( bbm <= 0.000401 )
							if( rsi1 <= 51.0875 )
								if( bbm <= 0.000325 )
									ret := 0.222222
								if( bbm > 0.000325 )
									ret := 0.684211
							if( rsi1 > 51.0875 )
								if( bbp <= -0.0006 )
									ret := 0.209524
								if( bbp > -0.0006 )
									ret := 0.048611
						if( bbm > 0.000401 )
							if( bearPower <= 0.000572 )
								if( bbm <= 0.000499 )
									ret := 0.506329
								if( bbm > 0.000499 )
									ret := 0.228205
							if( bearPower > 0.000572 )
								ret := -1.000000 // sell
				if( rsi1 > 60.028 )
					if( bbm <= 0.000302 )
						if( smoothD_d <= 95.9773 )
							if( rsi1 <= 71.1787 )
								if( bullPower <= 2.2e-05 )
									ret := 0.255556
								if( bullPower > 2.2e-05 )
									ret := 0.100917
							if( rsi1 > 71.1787 )
								if( smoothD_d <= 86.6904 )
									ret := 0.647059
								if( smoothD_d > 86.6904 )
									ret := 0.238095
						if( smoothD_d > 95.9773 )
							if( k <= 99.9404 )
								ret := 1.000000 // buy
							if( k > 99.9404 )
								if( rsi1 <= 70.7386 )
									ret := 0.571429
								if( rsi1 > 70.7386 )
									ret := 0.000000
					if( bbm > 0.000302 )
						if( bbp <= -1e-06 )
							if( bbp <= -0.000214 )
								if( rsi1 <= 62.0871 )
									ret := 0.444444
								if( rsi1 > 62.0871 )
									ret := 0.668224
							if( bbp > -0.000214 )
								if( bullPower <= 0.000334 )
									ret := 0.443299
								if( bullPower > 0.000334 )
									ret := 0.000000
						if( bbp > -1e-06 )
							if( d <= 99.3602 )
								if( d <= 52.5353 )
									ret := 0.809524 // buy
								if( d > 52.5353 )
									ret := 0.982609 // buy
							if( d > 99.3602 )
								ret := 0.500000
			if( bbm > 0.0007 )
				if( smoothK_k <= 77.7337 )
					if( d_k <= -4.01163 )
						if( bbm <= 0.001004 )
							if( rsi1 <= 59.6653 )
								if( bullPower <= 0.0002 )
									ret := 0.653061
								if( bullPower > 0.0002 )
									ret := 0.121739
							if( rsi1 > 59.6653 )
								if( bbm <= 0.000996 )
									ret := 0.894231 // buy
								if( bbm > 0.000996 )
									ret := 0.294118
						if( bbm > 0.001004 )
							if( rsi1 <= 58.1856 )
								if( bbp <= -0.002243 )
									ret := 0.822335 // buy
								if( bbp > -0.002243 )
									ret := 0.611794
							if( rsi1 > 58.1856 )
								if( bullPower <= 0.013164 )
									ret := 0.864991 // buy
								if( bullPower > 0.013164 )
									ret := 0.111111
					if( d_k > -4.01163 )
						if( rsi1 <= 55.0738 )
							if( bullPower <= 0.002338 )
								if( bbp <= 0.000446 )
									ret := 0.356345
								if( bbp > 0.000446 )
									ret := -0.123288
							if( bullPower > 0.002338 )
								if( d_k <= 13.0229 )
									ret := 0.016216
								if( d_k > 13.0229 )
									ret := -0.718750 // sell
						if( rsi1 > 55.0738 )
							if( d <= 38.3654 )
								if( bbm <= 0.001533 )
									ret := 0.472222
								if( bbm > 0.001533 )
									ret := 0.849359 // buy
							if( d > 38.3654 )
								if( k <= 40.7061 )
									ret := 0.070588
								if( k > 40.7061 )
									ret := 0.540055
				if( smoothK_k > 77.7337 )
					if( d_k <= -2.84766 )
						if( smoothK_k <= 92.6333 )
							if( rsi1 <= 61.7812 )
								if( bbp <= -0.000629 )
									ret := 0.748800 // buy
								if( bbp > -0.000629 )
									ret := 0.509934
							if( rsi1 > 61.7812 )
								if( bbp <= 0.010809 )
									ret := 0.931741 // buy
								if( bbp > 0.010809 )
									ret := 0.571429
						if( smoothK_k > 92.6333 )
							if( rsi1 <= 61.5438 )
								if( bearPower <= -0.000881 )
									ret := 0.824176 // buy
								if( bearPower > -0.000881 )
									ret := 0.600000
							if( rsi1 > 61.5438 )
								if( smoothD_d <= 93.868 )
									ret := 0.953445 // buy
								if( smoothD_d > 93.868 )
									ret := 0.250000
					if( d_k > -2.84766 )
						if( rsi1 <= 56.9798 )
							if( bullPower <= 0.000804 )
								if( bearPower <= -0.000907 )
									ret := 0.720365 // buy
								if( bearPower > -0.000907 )
									ret := 0.351351
							if( bullPower > 0.000804 )
								if( smoothK_k <= 79.4252 )
									ret := 0.933333 // buy
								if( smoothK_k > 79.4252 )
									ret := 0.024876
						if( rsi1 > 56.9798 )
							if( bearPower <= 0.006257 )
								if( rsi1 <= 62.3105 )
									ret := 0.716981 // buy
								if( rsi1 > 62.3105 )
									ret := 0.910791 // buy
							if( bearPower > 0.006257 )
								ret := 0.000000
		if( BBPower_Color > 0.5 )
			if( rsi1 <= 64.7724 )
				if( bearPower <= 0.000496 )
					if( bearPower <= 1.5e-05 )
						if( d_k <= -6.26764 )
							if( rsi1 <= 58.84 )
								if( bullPower <= 0.003194 )
									ret := 0.026994
								if( bullPower > 0.003194 )
									ret := 0.229167
							if( rsi1 > 58.84 )
								if( bbm <= 0.000803 )
									ret := 0.141631
								if( bbm > 0.000803 )
									ret := 0.611670
						if( d_k > -6.26764 )
							if( bullPower <= 0.009983 )
								if( d_k <= 19.6035 )
									ret := 0.086263
								if( d_k > 19.6035 )
									ret := -0.261364
							if( bullPower > 0.009983 )
								if( bbp <= 0.01042 )
									ret := 0.000000
								if( bbp > 0.01042 )
									ret := -0.491071
					if( bearPower > 1.5e-05 )
						if( rsi1 <= 56.2029 )
							if( bbm <= 0.000802 )
								if( bullPower <= 0.000603 )
									ret := -0.007075
								if( bullPower > 0.000603 )
									ret := -0.185417
							if( bbm > 0.000802 )
								if( smoothD_d <= 5.88656 )
									ret := -0.017857
								if( smoothD_d > 5.88656 )
									ret := -0.499176
						if( rsi1 > 56.2029 )
							if( rsi1 <= 59.6857 )
								if( bearPower <= 0.000179 )
									ret := 0.059965
								if( bearPower > 0.000179 )
									ret := -0.079585
							if( rsi1 > 59.6857 )
								if( d_k <= 21.3628 )
									ret := 0.082455
								if( d_k > 21.3628 )
									ret := 0.416667
				if( bearPower > 0.000496 )
					if( d_k <= 5.66171 )
						if( rsi1 <= 59.3788 )
							if( d_k <= -9.89114 )
								if( rsi1 <= 53.8138 )
									ret := 0.625000
								if( rsi1 > 53.8138 )
									ret := -0.056338
							if( d_k > -9.89114 )
								if( d <= 96.775 )
									ret := -0.375358
								if( d > 96.775 )
									ret := 0.277778
						if( rsi1 > 59.3788 )
							if( bearPower <= 0.00289 )
								if( bbm <= 0.001934 )
									ret := -0.185410
								if( bbm > 0.001934 )
									ret := 0.086705
							if( bearPower > 0.00289 )
								if( smoothD_d <= 90.1773 )
									ret := -0.445161
								if( smoothD_d > 90.1773 )
									ret := 0.500000
					if( d_k > 5.66171 )
						if( bbp <= 0.00376 )
							if( rsi1 <= 60.2168 )
								if( bbp <= 0.002304 )
									ret := -0.260504
								if( bbp > 0.002304 )
									ret := -0.595541
							if( rsi1 > 60.2168 )
								if( smoothK_k <= 70.3446 )
									ret := -0.116564
								if( smoothK_k > 70.3446 )
									ret := 0.256410
						if( bbp > 0.00376 )
							if( bearPower <= 0.00099 )
								if( d <= 24.852 )
									ret := -0.766667 // sell
								if( d > 24.852 )
									ret := -0.365385
							if( bearPower > 0.00099 )
								if( k <= 85.4549 )
									ret := -0.718404 // sell
								if( k > 85.4549 )
									ret := -0.035714
			if( rsi1 > 64.7724 )
				if( rsi1 <= 75.0001 )
					if( d_k <= 2.76189 )
						if( bbm <= 0.000503 )
							if( smoothD_d <= 93.0078 )
								if( bbp <= 0.001059 )
									ret := 0.111524
								if( bbp > 0.001059 )
									ret := -0.030457
							if( smoothD_d > 93.0078 )
								if( rsi1 <= 72.5677 )
									ret := 0.184397
								if( rsi1 > 72.5677 )
									ret := 0.420290
						if( bbm > 0.000503 )
							if( smoothD_d <= -0.843936 )
								if( d <= 0.682854 )
									ret := -0.750000 // sell
								if( d > 0.682854 )
									ret := -1.000000 // sell
							if( smoothD_d > -0.843936 )
								if( bearPower <= 0.000222 )
									ret := 0.607018
								if( bearPower > 0.000222 )
									ret := 0.312478
					if( d_k > 2.76189 )
						if( bearPower <= 0.001275 )
							if( bearPower <= -7.6e-05 )
								if( bbp <= 0.00895 )
									ret := 0.610619
								if( bbp > 0.00895 )
									ret := -0.181818
							if( bearPower > -7.6e-05 )
								if( d_k <= 7.38388 )
									ret := 0.203520
								if( d_k > 7.38388 )
									ret := 0.336992
						if( bearPower > 0.001275 )
							if( k <= 89.0013 )
								if( d_k <= 15.6203 )
									ret := -0.183882
								if( d_k > 15.6203 )
									ret := -0.532407
							if( k > 89.0013 )
								if( bbp <= 0.05166 )
									ret := 0.540230
								if( bbp > 0.05166 )
									ret := -1.000000 // sell
				if( rsi1 > 75.0001 )
					if( k <= 97.9202 )
						if( bullPower <= 0.008179 )
							if( bbm <= 0.000701 )
								if( bbp <= 0.001085 )
									ret := 0.249389
								if( bbp > 0.001085 )
									ret := 0.392781
							if( bbm > 0.000701 )
								if( d_k <= 2.95422 )
									ret := 0.691912
								if( d_k > 2.95422 )
									ret := 0.494094
						if( bullPower > 0.008179 )
							if( d_k <= 4.73874 )
								if( smoothD_d <= 86.5804 )
									ret := 0.569832
								if( smoothD_d > 86.5804 )
									ret := 0.191489
							if( d_k > 4.73874 )
								if( k <= 48.0013 )
									ret := 0.600000
								if( k > 48.0013 )
									ret := -0.313725
					if( k > 97.9202 )
						if( bullPower <= 0.02661 )
							if( bbm <= 0.0004 )
								if( rsi1 <= 91.814 )
									ret := 0.309859
								if( rsi1 > 91.814 )
									ret := 0.739130 // buy
							if( bbm > 0.0004 )
								if( rsi1 <= 88.7819 )
									ret := 0.713189 // buy
								if( rsi1 > 88.7819 )
									ret := 0.898420 // buy
						if( bullPower > 0.02661 )
							if( rsi1 <= 88.424 )
								if( rsi1 <= 84.2982 )
									ret := -0.200000
								if( rsi1 > 84.2982 )
									ret := 1.000000 // buy
							if( rsi1 > 88.424 )
								ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_XLMUSDT_30Min_c3b32f3c(bbp, bullPower, BBPower_Color, bearPower, bbm, smoothK_k, d_k, k, smoothD_d, rsi1, d)

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


