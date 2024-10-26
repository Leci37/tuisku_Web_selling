//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: ATOMUSDT_15Min_2BS0_5584590f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ATOMUSDT_15Min_2BS0_5584590f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ATOMUSDT_15Min_5584590f(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( smoothK_k <= 42.3207 )
		if( rsi1 <= 34.6771 )
			if( bearPower <= -0.104202 )
				if( bearPower <= -0.290612 )
					if( d <= 24.3581 )
						if( d_k <= 17.1956 )
							if( rsi1 <= 11.5507 )
								if( rsi1 <= 4.61559 )
									ret := -0.200000
								if( rsi1 > 4.61559 )
									ret := 0.739130 // buy
							if( rsi1 > 11.5507 )
								if( smoothD_d <= 0.480288 )
									ret := -0.068441
								if( smoothD_d > 0.480288 )
									ret := 0.291209
						if( d_k > 17.1956 )
							if( bbp <= -0.543696 )
								ret := -1.000000 // sell
							if( bbp > -0.543696 )
								ret := -0.750000 // sell
					if( d > 24.3581 )
						if( d_k <= 26.6191 )
							if( bearPower <= -0.425181 )
								if( d_k <= 23.0158 )
									ret := 0.903226 // buy
								if( d_k > 23.0158 )
									ret := 0.250000
							if( bearPower > -0.425181 )
								if( d_k <= -7.14861 )
									ret := -0.333333
								if( d_k > -7.14861 )
									ret := 0.454545
						if( d_k > 26.6191 )
							if( bullPower <= -0.160541 )
								ret := -0.857143 // sell
							if( bullPower > -0.160541 )
								ret := -0.142857
				if( bearPower > -0.290612 )
					if( rsi1 <= 20.5952 )
						if( bearPower <= -0.199044 )
							if( bullPower <= -0.074801 )
								if( d_k <= 0.348546 )
									ret := -0.188406
								if( d_k > 0.348546 )
									ret := 0.134228
							if( bullPower > -0.074801 )
								if( smoothD_d <= 8.99819 )
									ret := -0.661017
								if( smoothD_d > 8.99819 )
									ret := 0.050000
						if( bearPower > -0.199044 )
							if( d_k <= 1.50878 )
								if( bbm <= 0.110819 )
									ret := -0.479570
								if( bbm > 0.110819 )
									ret := -0.836066 // sell
							if( d_k > 1.50878 )
								if( bbp <= -0.222068 )
									ret := 0.065217
								if( bbp > -0.222068 )
									ret := -0.368794
					if( rsi1 > 20.5952 )
						if( bullPower <= -0.058286 )
							if( k <= 4.58544 )
								if( d <= 4.28347 )
									ret := 0.420875
								if( d > 4.28347 )
									ret := 0.155378
							if( k > 4.58544 )
								if( d <= 3.7742 )
									ret := -0.548387
								if( d > 3.7742 )
									ret := 0.095551
						if( bullPower > -0.058286 )
							if( k <= 36.2927 )
								if( d_k <= 11.4301 )
									ret := -0.026590
								if( d_k > 11.4301 )
									ret := -0.256809
							if( k > 36.2927 )
								if( bearPower <= -0.179726 )
									ret := 0.162791
								if( bearPower > -0.179726 )
									ret := -0.487179
			if( bearPower > -0.104202 )
				if( rsi1 <= 24.9231 )
					if( bbm <= 0.02405 )
						if( smoothD_d <= 0.708269 )
							if( d <= 0.175469 )
								if( bbp <= -0.064633 )
									ret := -0.416667
								if( bbp > -0.064633 )
									ret := -0.846939 // sell
							if( d > 0.175469 )
								if( bbm <= 0.012056 )
									ret := -0.341463
								if( bbm > 0.012056 )
									ret := -0.599222
						if( smoothD_d > 0.708269 )
							if( bullPower <= -0.003405 )
								if( rsi1 <= 11.8867 )
									ret := -0.733333 // sell
								if( rsi1 > 11.8867 )
									ret := -0.266854
							if( bullPower > -0.003405 )
								if( bbm <= 0.0175 )
									ret := -0.466667
								if( bbm > 0.0175 )
									ret := -0.811594 // sell
					if( bbm > 0.02405 )
						if( bullPower <= -0.029535 )
							if( smoothD_d <= 6.44133 )
								if( rsi1 <= 23.9852 )
									ret := -0.655589
								if( rsi1 > 23.9852 )
									ret := -0.114286
							if( smoothD_d > 6.44133 )
								if( bbm <= 0.049127 )
									ret := -0.277311
								if( bbm > 0.049127 )
									ret := -0.565217
						if( bullPower > -0.029535 )
							if( bullPower <= 0.001955 )
								if( bbm <= 0.0875 )
									ret := -0.735348 // sell
								if( bbm > 0.0875 )
									ret := -0.052632
							if( bullPower > 0.001955 )
								if( smoothK_k <= 29.7741 )
									ret := -0.890220 // sell
								if( smoothK_k > 29.7741 )
									ret := -0.400000
				if( rsi1 > 24.9231 )
					if( bullPower <= 0.009979 )
						if( bullPower <= -0.009212 )
							if( d <= 29.3335 )
								if( bullPower <= -0.044519 )
									ret := -0.079602
								if( bullPower > -0.044519 )
									ret := -0.315663
							if( d > 29.3335 )
								if( d <= 34.2422 )
									ret := 0.130435
								if( d > 34.2422 )
									ret := -0.181034
						if( bullPower > -0.009212 )
							if( rsi1 <= 29.2006 )
								if( bbm <= 0.017057 )
									ret := -0.329193
								if( bbm > 0.017057 )
									ret := -0.606775
							if( rsi1 > 29.2006 )
								if( d_k <= -1.79333 )
									ret := -0.491589
								if( d_k > -1.79333 )
									ret := -0.292471
					if( bullPower > 0.009979 )
						if( bearPower <= -0.054479 )
							if( rsi1 <= 28.611 )
								if( bbm <= 0.071189 )
									ret := 0.200000
								if( bbm > 0.071189 )
									ret := -0.745098 // sell
							if( rsi1 > 28.611 )
								if( d_k <= -6.36279 )
									ret := -0.788462 // sell
								if( d_k > -6.36279 )
									ret := -0.286364
						if( bearPower > -0.054479 )
							if( bbp <= 0.027164 )
								if( d_k <= -9.71443 )
									ret := -0.160000
								if( d_k > -9.71443 )
									ret := -0.718261 // sell
							if( bbp > 0.027164 )
								if( d_k <= -3.03267 )
									ret := -0.500000
								if( d_k > -3.03267 )
									ret := -0.921839 // sell
		if( rsi1 > 34.6771 )
			if( bbp <= -0.008896 )
				if( bbp <= -0.091915 )
					if( smoothD_d <= 11.5092 )
						if( d_k <= -3.50055 )
							if( bearPower <= -0.357078 )
								if( rsi1 <= 40.9439 )
									ret := 1.000000 // buy
								if( rsi1 > 40.9439 )
									ret := 0.750000 // buy
							if( bearPower > -0.357078 )
								if( rsi1 <= 36.6015 )
									ret := -0.285714
								if( rsi1 > 36.6015 )
									ret := 0.019002
						if( d_k > -3.50055 )
							if( bbp <= -0.288754 )
								if( d_k <= 2.84667 )
									ret := 0.659091
								if( d_k > 2.84667 )
									ret := -0.083333
							if( bbp > -0.288754 )
								if( rsi1 <= 54.7871 )
									ret := 0.170259
								if( rsi1 > 54.7871 )
									ret := -1.000000 // sell
					if( smoothD_d > 11.5092 )
						if( bbm <= 0.158241 )
							if( bullPower <= -0.047659 )
								if( rsi1 <= 43.0545 )
									ret := 0.518962
								if( rsi1 > 43.0545 )
									ret := 0.204225
							if( bullPower > -0.047659 )
								if( d_k <= -13.0264 )
									ret := -0.085470
								if( d_k > -13.0264 )
									ret := 0.286540
						if( bbm > 0.158241 )
							if( smoothD_d <= 20.3546 )
								if( d_k <= -8.01692 )
									ret := 0.228571
								if( d_k > -8.01692 )
									ret := -0.413793
							if( smoothD_d > 20.3546 )
								if( d_k <= 11.9773 )
									ret := 0.359375
								if( d_k > 11.9773 )
									ret := -0.088398
				if( bbp > -0.091915 )
					if( rsi1 <= 41.2549 )
						if( smoothD_d <= 7.35917 )
							if( d_k <= -1.86111 )
								if( smoothK_k <= 19.4833 )
									ret := -0.435849
								if( smoothK_k > 19.4833 )
									ret := 0.833333 // buy
							if( d_k > -1.86111 )
								if( bbp <= -0.075245 )
									ret := 0.229885
								if( bbp > -0.075245 )
									ret := -0.236295
						if( smoothD_d > 7.35917 )
							if( bearPower <= -0.077314 )
								if( bearPower <= -0.091388 )
									ret := -0.147887
								if( bearPower > -0.091388 )
									ret := 0.204420
							if( bearPower > -0.077314 )
								if( bullPower <= 0.000999 )
									ret := -0.084084
								if( bullPower > 0.000999 )
									ret := -0.211663
					if( rsi1 > 41.2549 )
						if( rsi1 <= 53.1458 )
							if( smoothD_d <= 19.8789 )
								if( d_k <= -1.03977 )
									ret := -0.076707
								if( d_k > -1.03977 )
									ret := 0.115349
							if( smoothD_d > 19.8789 )
								if( d_k <= -12.6069 )
									ret := -0.173228
								if( d_k > -12.6069 )
									ret := 0.189010
						if( rsi1 > 53.1458 )
							if( bullPower <= 0.028713 )
								if( d <= 58.4484 )
									ret := 0.374663
								if( d > 58.4484 )
									ret := -0.160000
							if( bullPower > 0.028713 )
								if( d <= 5.75434 )
									ret := -0.875000 // sell
								if( d > 5.75434 )
									ret := 0.175824
			if( bbp > -0.008896 )
				if( k <= 13.7051 )
					if( rsi1 <= 52.9114 )
						if( bearPower <= 0.012543 )
							if( bullPower <= 0.023825 )
								if( rsi1 <= 40.3877 )
									ret := -0.409664
								if( rsi1 > 40.3877 )
									ret := -0.076177
							if( bullPower > 0.023825 )
								if( rsi1 <= 44.3249 )
									ret := -0.583099
								if( rsi1 > 44.3249 )
									ret := -0.236025
						if( bearPower > 0.012543 )
							if( bullPower <= 0.046898 )
								if( d <= 4.1602 )
									ret := -0.651163
								if( d > 4.1602 )
									ret := -0.389381
							if( bullPower > 0.046898 )
								if( rsi1 <= 45.3229 )
									ret := -0.895522 // sell
								if( rsi1 > 45.3229 )
									ret := -0.722222 // sell
					if( rsi1 > 52.9114 )
						if( bearPower <= 0.017975 )
							if( rsi1 <= 58.3349 )
								if( bbm <= 0.219726 )
									ret := -0.014354
								if( bbm > 0.219726 )
									ret := -0.875000 // sell
							if( rsi1 > 58.3349 )
								if( bearPower <= -0.00581 )
									ret := 0.467153
								if( bearPower > -0.00581 )
									ret := 0.190114
						if( bearPower > 0.017975 )
							if( bearPower <= 0.066959 )
								if( k <= 9.42767 )
									ret := -0.201327
								if( k > 9.42767 )
									ret := -0.439306
							if( bearPower > 0.066959 )
								if( smoothD_d <= 3.45623 )
									ret := -0.791045 // sell
								if( smoothD_d > 3.45623 )
									ret := -0.490323
				if( k > 13.7051 )
					if( rsi1 <= 56.8661 )
						if( rsi1 <= 47.3969 )
							if( bbp <= 0.033299 )
								if( bbm <= 0.021145 )
									ret := -0.140684
								if( bbm > 0.021145 )
									ret := -0.344320
							if( bbp > 0.033299 )
								if( bearPower <= -0.025155 )
									ret := -0.126050
								if( bearPower > -0.025155 )
									ret := -0.581140
						if( rsi1 > 47.3969 )
							if( bbp <= 0.046467 )
								if( d <= 42.1004 )
									ret := 0.041073
								if( d > 42.1004 )
									ret := -0.111667
							if( bbp > 0.046467 )
								if( bbm <= 0.121275 )
									ret := -0.378134
								if( bbm > 0.121275 )
									ret := 0.018018
					if( rsi1 > 56.8661 )
						if( bearPower <= 0.025307 )
							if( rsi1 <= 67.4198 )
								if( BBPower_Color <= 0.5 )
									ret := 0.408100
								if( BBPower_Color > 0.5 )
									ret := 0.107464
							if( rsi1 > 67.4198 )
								if( d <= 15.7789 )
									ret := 0.769231 // buy
								if( d > 15.7789 )
									ret := 0.393316
						if( bearPower > 0.025307 )
							if( rsi1 <= 63.8789 )
								if( bullPower <= 0.228792 )
									ret := -0.264766
								if( bullPower > 0.228792 )
									ret := -0.844444 // sell
							if( rsi1 > 63.8789 )
								if( smoothD_d <= 44.369 )
									ret := 0.020110
								if( smoothD_d > 44.369 )
									ret := 0.395062
	if( smoothK_k > 42.3207 )
		if( d <= 84.5793 )
			if( BBPower_Color <= 0.5 )
				if( bbp <= -0.105846 )
					if( smoothK_k <= 65.9851 )
						if( rsi1 <= 36.0204 )
							if( bbp <= -0.231095 )
								if( bbp <= -0.714374 )
									ret := 0.920000 // buy
								if( bbp > -0.714374 )
									ret := 0.212209
							if( bbp > -0.231095 )
								if( d_k <= -22.7479 )
									ret := -0.787879 // sell
								if( d_k > -22.7479 )
									ret := 0.000000
						if( rsi1 > 36.0204 )
							if( d_k <= -4.58218 )
								if( rsi1 <= 48.3149 )
									ret := 0.470250
								if( rsi1 > 48.3149 )
									ret := 0.813953 // buy
							if( d_k > -4.58218 )
								if( bbm <= 0.12384 )
									ret := 0.440964
								if( bbm > 0.12384 )
									ret := 0.175497
					if( smoothK_k > 65.9851 )
						if( rsi1 <= 44.5376 )
							if( bbp <= -0.163544 )
								if( rsi1 <= 29.4118 )
									ret := 0.310606
								if( rsi1 > 29.4118 )
									ret := 0.625235
							if( bbp > -0.163544 )
								if( d_k <= -4.56492 )
									ret := 0.405797
								if( d_k > -4.56492 )
									ret := 0.060976
						if( rsi1 > 44.5376 )
							if( d_k <= 1.94226 )
								if( smoothK_k <= 96.9729 )
									ret := 0.812287 // buy
								if( smoothK_k > 96.9729 )
									ret := 0.333333
							if( d_k > 1.94226 )
								if( d_k <= 3.49122 )
									ret := -0.333333
								if( d_k > 3.49122 )
									ret := 0.574074
				if( bbp > -0.105846 )
					if( rsi1 <= 47.7914 )
						if( rsi1 <= 36.85 )
							if( d_k <= -3.16289 )
								if( bullPower <= 0.057712 )
									ret := -0.229373
								if( bullPower > 0.057712 )
									ret := 0.454545
							if( d_k > -3.16289 )
								if( bullPower <= 0.004073 )
									ret := -0.287324
								if( bullPower > 0.004073 )
									ret := -0.696629
						if( rsi1 > 36.85 )
							if( bbp <= -0.012258 )
								if( bearPower <= -0.052869 )
									ret := 0.161353
								if( bearPower > -0.052869 )
									ret := -0.029344
							if( bbp > -0.012258 )
								if( bbp <= 0.027117 )
									ret := -0.207349
								if( bbp > 0.027117 )
									ret := -0.510204
					if( rsi1 > 47.7914 )
						if( rsi1 <= 56.6064 )
							if( bbp <= -0.027714 )
								if( d_k <= 10.4362 )
									ret := 0.403846
								if( d_k > 10.4362 )
									ret := -0.016484
							if( bbp > -0.027714 )
								if( bearPower <= -0.061926 )
									ret := -0.241379
								if( bearPower > -0.061926 )
									ret := 0.127564
						if( rsi1 > 56.6064 )
							if( k <= 83.4513 )
								if( d_k <= -3.69374 )
									ret := 0.614978
								if( d_k > -3.69374 )
									ret := 0.324176
							if( k > 83.4513 )
								if( d_k <= -0.957034 )
									ret := 0.698694
								if( d_k > -0.957034 )
									ret := -0.363636
			if( BBPower_Color > 0.5 )
				if( bearPower <= 0.069331 )
					if( rsi1 <= 68.5725 )
						if( bbp <= 0.0661 )
							if( rsi1 <= 55.3696 )
								if( rsi1 <= 39.1225 )
									ret := -0.416107
								if( rsi1 > 39.1225 )
									ret := -0.109284
							if( rsi1 > 55.3696 )
								if( rsi1 <= 58.7403 )
									ret := 0.037629
								if( rsi1 > 58.7403 )
									ret := 0.166602
						if( bbp > 0.0661 )
							if( rsi1 <= 57.135 )
								if( d_k <= -5.99139 )
									ret := -0.124317
								if( d_k > -5.99139 )
									ret := -0.398180
							if( rsi1 > 57.135 )
								if( d_k <= 12.9669 )
									ret := -0.101466
								if( d_k > 12.9669 )
									ret := 0.293375
					if( rsi1 > 68.5725 )
						if( bullPower <= 0.121993 )
							if( rsi1 <= 76.9707 )
								if( bearPower <= -0.003435 )
									ret := 0.587591
								if( bearPower > -0.003435 )
									ret := 0.320629
							if( rsi1 > 76.9707 )
								if( bbm <= 0.0192 )
									ret := 0.305263
								if( bbm > 0.0192 )
									ret := 0.617904
						if( bullPower > 0.121993 )
							if( d_k <= 5.55121 )
								if( rsi1 <= 77.2076 )
									ret := -0.192201
								if( rsi1 > 77.2076 )
									ret := 0.392000
							if( d_k > 5.55121 )
								if( rsi1 <= 71.9052 )
									ret := 0.100000
								if( rsi1 > 71.9052 )
									ret := 0.485915
				if( bearPower > 0.069331 )
					if( d_k <= -20.6937 )
						if( bearPower <= 0.104917 )
							if( bbp <= 0.305436 )
								if( k <= 79.0815 )
									ret := 0.806452 // buy
								if( k > 79.0815 )
									ret := -0.192308
							if( bbp > 0.305436 )
								if( d_k <= -22.0681 )
									ret := -0.606061
								if( d_k > -22.0681 )
									ret := 0.500000
						if( bearPower > 0.104917 )
							if( bbm <= 0.288136 )
								if( bearPower <= 0.109003 )
									ret := 0.250000
								if( bearPower > 0.109003 )
									ret := 0.760000 // buy
							if( bbm > 0.288136 )
								if( smoothK_k <= 79.3588 )
									ret := -0.222222
								if( smoothK_k > 79.3588 )
									ret := 0.500000
					if( d_k > -20.6937 )
						if( rsi1 <= 73.1758 )
							if( d_k <= -4.45536 )
								if( smoothD_d <= 71.9067 )
									ret := -0.015385
								if( smoothD_d > 71.9067 )
									ret := -0.392857
							if( d_k > -4.45536 )
								if( d_k <= 3.49081 )
									ret := -0.625000
								if( d_k > 3.49081 )
									ret := -0.295652
						if( rsi1 > 73.1758 )
							if( bullPower <= 0.430289 )
								if( bbm <= 0.080647 )
									ret := 0.353293
								if( bbm > 0.080647 )
									ret := -0.008658
							if( bullPower > 0.430289 )
								if( bbm <= 0.235296 )
									ret := -0.095238
								if( bbm > 0.235296 )
									ret := -0.833333 // sell
		if( d > 84.5793 )
			if( bullPower <= 0.081536 )
				if( smoothK_k <= 89.2277 )
					if( rsi1 <= 60.1375 )
						if( bearPower <= -0.016207 )
							if( rsi1 <= 42.1951 )
								if( bbm <= 0.0815 )
									ret := -0.165625
								if( bbm > 0.0815 )
									ret := 0.182266
							if( rsi1 > 42.1951 )
								if( k <= 72.0635 )
									ret := -0.348837
								if( k > 72.0635 )
									ret := 0.321925
						if( bearPower > -0.016207 )
							if( bearPower <= 0.025326 )
								if( bbm <= 0.080611 )
									ret := 0.041809
								if( bbm > 0.080611 )
									ret := 0.421053
							if( bearPower > 0.025326 )
								if( rsi1 <= 55.2152 )
									ret := -0.500000
								if( rsi1 > 55.2152 )
									ret := -0.133333
					if( rsi1 > 60.1375 )
						if( bbm <= 0.019004 )
							if( bbm <= 0.014005 )
								if( rsi1 <= 83.2929 )
									ret := 0.111111
								if( rsi1 > 83.2929 )
									ret := 0.555556
							if( bbm > 0.014005 )
								if( d_k <= 5.57038 )
									ret := 0.195946
								if( d_k > 5.57038 )
									ret := 0.418182
						if( bbm > 0.019004 )
							if( BBPower_Color <= 0.5 )
								if( bearPower <= -0.05347 )
									ret := 0.281690
								if( bearPower > -0.05347 )
									ret := 0.726437 // buy
							if( BBPower_Color > 0.5 )
								if( rsi1 <= 71.2151 )
									ret := 0.372305
								if( rsi1 > 71.2151 )
									ret := 0.616794
				if( smoothK_k > 89.2277 )
					if( rsi1 <= 71.6441 )
						if( bearPower <= -0.021677 )
							if( rsi1 <= 53.5371 )
								if( bullPower <= -0.015249 )
									ret := 0.633383
								if( bullPower > -0.015249 )
									ret := 0.216545
							if( rsi1 > 53.5371 )
								if( bullPower <= 0.029758 )
									ret := 0.741718 // buy
								if( bullPower > 0.029758 )
									ret := 0.415612
						if( bearPower > -0.021677 )
							if( BBPower_Color <= 0.5 )
								if( bbp <= -0.000872 )
									ret := 0.264220
								if( bbp > -0.000872 )
									ret := 0.714724 // buy
							if( BBPower_Color > 0.5 )
								if( rsi1 <= 64.011 )
									ret := 0.008987
								if( rsi1 > 64.011 )
									ret := 0.312808
					if( rsi1 > 71.6441 )
						if( bearPower <= -0.001536 )
							if( bbm <= 0.029022 )
								if( bbm <= 0.0095 )
									ret := 0.200000
								if( bbm > 0.0095 )
									ret := 0.719178 // buy
							if( bbm > 0.029022 )
								if( bbm <= 0.135 )
									ret := 0.864516 // buy
								if( bbm > 0.135 )
									ret := 0.000000
						if( bearPower > -0.001536 )
							if( bbm <= 0.021084 )
								if( bbm <= 0.013021 )
									ret := 0.270115
								if( bbm > 0.013021 )
									ret := 0.496855
							if( bbm > 0.021084 )
								if( rsi1 <= 78.6493 )
									ret := 0.540134
								if( rsi1 > 78.6493 )
									ret := 0.795699 // buy
			if( bullPower > 0.081536 )
				if( bbm <= 0.078924 )
					if( rsi1 <= 76.0034 )
						if( rsi1 <= 66.6935 )
							if( d <= 85.2008 )
								if( rsi1 <= 62.8461 )
									ret := 0.846154 // buy
								if( rsi1 > 62.8461 )
									ret := 0.454545
							if( d > 85.2008 )
								if( d_k <= 3.66034 )
									ret := -0.175481
								if( d_k > 3.66034 )
									ret := 0.124294
						if( rsi1 > 66.6935 )
							if( BBPower_Color <= 0.5 )
								if( smoothD_d <= 96.2108 )
									ret := 1.000000 // buy
								if( smoothD_d > 96.2108 )
									ret := 0.000000
							if( BBPower_Color > 0.5 )
								if( bullPower <= 0.100216 )
									ret := 0.303725
								if( bullPower > 0.100216 )
									ret := 0.084479
					if( rsi1 > 76.0034 )
						if( bullPower <= 0.131368 )
							if( rsi1 <= 88.4565 )
								if( bearPower <= 0.068538 )
									ret := 0.605802
								if( bearPower > 0.068538 )
									ret := 0.307692
							if( rsi1 > 88.4565 )
								if( bbm <= 0.031792 )
									ret := 0.600000
								if( bbm > 0.031792 )
									ret := 0.911111 // buy
						if( bullPower > 0.131368 )
							if( bbm <= 0.065377 )
								if( d_k <= -4.40278 )
									ret := -0.526316
								if( d_k > -4.40278 )
									ret := 0.093750
							if( bbm > 0.065377 )
								if( bbp <= 0.411324 )
									ret := 0.497297
								if( bbp > 0.411324 )
									ret := -0.125000
				if( bbm > 0.078924 )
					if( rsi1 <= 53.7763 )
						if( bbp <= 0.140521 )
							if( rsi1 <= 39.9958 )
								ret := -1.000000 // sell
							if( rsi1 > 39.9958 )
								if( d <= 88.0724 )
									ret := -0.571429
								if( d > 88.0724 )
									ret := -0.024000
						if( bbp > 0.140521 )
							if( bbm <= 0.129691 )
								if( k <= 98.0464 )
									ret := -0.529412
								if( k > 98.0464 )
									ret := 0.500000
							if( bbm > 0.129691 )
								if( bbm <= 0.191504 )
									ret := -0.714286 // sell
								if( bbm > 0.191504 )
									ret := -0.960000 // sell
					if( rsi1 > 53.7763 )
						if( BBPower_Color <= 0.5 )
							if( bullPower <= 0.136206 )
								if( d <= 90.119 )
									ret := 0.742857 // buy
								if( d > 90.119 )
									ret := 0.215054
							if( bullPower > 0.136206 )
								if( bbm <= 0.163122 )
									ret := 0.766667 // buy
								if( bbm > 0.163122 )
									ret := 1.000000 // buy
						if( BBPower_Color > 0.5 )
							if( k <= 91.0784 )
								if( rsi1 <= 81.2638 )
									ret := 0.236125
								if( rsi1 > 81.2638 )
									ret := 0.645455
							if( k > 91.0784 )
								if( rsi1 <= 70.2368 )
									ret := -0.090020
								if( rsi1 > 70.2368 )
									ret := 0.149112
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_ATOMUSDT_15Min_5584590f(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


