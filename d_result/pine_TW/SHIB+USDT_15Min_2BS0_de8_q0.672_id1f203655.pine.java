//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: SHIBUSDT_15Min_2BS0_1f203655 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SHIBUSDT_15Min_2BS0_1f203655", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SHIBUSDT_15Min_1f203655(bbm, bearPower, bbp, bullPower, BBPower_Color, d_k, d, rsi1, k, smoothD_d, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( smoothK_k <= 38.2806 )
		if( smoothD_d <= 1.38742 )
			if( BBPower_Color <= 0.5 )
				if( d_k <= 0.007445 )
					if( rsi1 <= 32.2893 )
						if( rsi1 <= 31.7734 )
							if( d_k <= -0.58779 )
								if( smoothK_k <= 3.60996 )
									ret := -0.559653
								if( smoothK_k > 3.60996 )
									ret := -0.373206
							if( d_k > -0.58779 )
								if( smoothK_k <= -1.64962 )
									ret := -0.496403
								if( smoothK_k > -1.64962 )
									ret := -0.210526
						if( rsi1 > 31.7734 )
							if( rsi1 <= 31.9972 )
								if( rsi1 <= 31.8559 )
									ret := -0.800000 // sell
								if( rsi1 > 31.8559 )
									ret := -1.000000 // sell
							if( rsi1 > 31.9972 )
								if( d_k <= -1.28504 )
									ret := -0.809524 // sell
								if( d_k > -1.28504 )
									ret := -0.250000
					if( rsi1 > 32.2893 )
						if( rsi1 <= 54.0659 )
							if( bbm <= 1e-06 )
								if( k <= 9.31974 )
									ret := -0.261134
								if( k > 9.31974 )
									ret := -0.043956
							if( bbm > 1e-06 )
								ret := -1.000000 // sell
						if( rsi1 > 54.0659 )
							if( d_k <= -0.012551 )
								if( smoothD_d <= 0.487055 )
									ret := 0.892857 // buy
								if( smoothD_d > 0.487055 )
									ret := 0.200000
							if( d_k > -0.012551 )
								ret := -0.250000
				if( d_k > 0.007445 )
					if( d_k <= 0.669 )
						if( rsi1 <= 29.4837 )
							if( rsi1 <= 17.8359 )
								if( d <= 1.28305 )
									ret := -0.078431
								if( d > 1.28305 )
									ret := 0.714286 // buy
							if( rsi1 > 17.8359 )
								if( rsi1 <= 22.5874 )
									ret := -0.531250
								if( rsi1 > 22.5874 )
									ret := -0.279661
						if( rsi1 > 29.4837 )
							if( smoothK_k <= -2.16944 )
								if( rsi1 <= 55.7968 )
									ret := 0.655738
								if( rsi1 > 55.7968 )
									ret := -1.000000 // sell
							if( smoothK_k > -2.16944 )
								if( rsi1 <= 46.2668 )
									ret := -0.216981
								if( rsi1 > 46.2668 )
									ret := 0.562500
					if( d_k > 0.669 )
						if( rsi1 <= 30.5441 )
							if( rsi1 <= 3.72299 )
								if( d <= 1.11194 )
									ret := 0.750000 // buy
								if( d > 1.11194 )
									ret := 0.750000 // buy
							if( rsi1 > 3.72299 )
								if( rsi1 <= 20.6653 )
									ret := -0.290411
								if( rsi1 > 20.6653 )
									ret := -0.486922
						if( rsi1 > 30.5441 )
							if( rsi1 <= 30.7569 )
								if( smoothD_d <= -1.65898 )
									ret := 0.750000 // buy
								if( smoothD_d > -1.65898 )
									ret := 1.000000 // buy
							if( rsi1 > 30.7569 )
								if( smoothD_d <= -1.12671 )
									ret := -0.447917
								if( smoothD_d > -1.12671 )
									ret := 0.005376
			if( BBPower_Color > 0.5 )
				if( rsi1 <= 43.7645 )
					if( d <= 3.88244 )
						if( smoothK_k <= 6.22282 )
							if( rsi1 <= 31.968 )
								if( smoothK_k <= -1.8146 )
									ret := -0.910180 // sell
								if( smoothK_k > -1.8146 )
									ret := -0.758621 // sell
							if( rsi1 > 31.968 )
								if( d_k <= -1.86724 )
									ret := -0.849206 // sell
								if( d_k > -1.86724 )
									ret := -0.652709
						if( smoothK_k > 6.22282 )
							ret := -0.200000
					if( d > 3.88244 )
						if( d <= 3.94867 )
							if( k <= 0.276838 )
								ret := -0.500000
							if( k > 0.276838 )
								ret := 0.000000
						if( d > 3.94867 )
							if( d_k <= 4.22051 )
								if( smoothK_k <= -0.117222 )
									ret := -0.771429 // sell
								if( smoothK_k > -0.117222 )
									ret := -0.565217
							if( d_k > 4.22051 )
								ret := -0.166667
				if( rsi1 > 43.7645 )
					if( d <= 1.13211 )
						if( rsi1 <= 61.6203 )
							if( d_k <= -0.121578 )
								if( d_k <= -0.8257 )
									ret := -0.758621 // sell
								if( d_k > -0.8257 )
									ret := -0.950000 // sell
							if( d_k > -0.121578 )
								if( bbp <= 1e-06 )
									ret := -0.514851
								if( bbp > 1e-06 )
									ret := 0.600000
						if( rsi1 > 61.6203 )
							ret := 0.500000
					if( d > 1.13211 )
						if( rsi1 <= 63.0766 )
							if( d_k <= 3.64636 )
								if( smoothD_d <= 0.66622 )
									ret := -0.337079
								if( smoothD_d > 0.66622 )
									ret := -0.532110
							if( d_k > 3.64636 )
								if( rsi1 <= 49.0512 )
									ret := 0.692308
								if( rsi1 > 49.0512 )
									ret := -0.411765
						if( rsi1 > 63.0766 )
							if( k <= 1.68139 )
								if( k <= 0.023008 )
									ret := -0.250000
								if( k > 0.023008 )
									ret := -1.000000 // sell
							if( k > 1.68139 )
								if( k <= 10.0693 )
									ret := 0.551724
								if( k > 10.0693 )
									ret := -0.750000 // sell
		if( smoothD_d > 1.38742 )
			if( smoothK_k <= 14.3964 )
				if( rsi1 <= 37.77 )
					if( BBPower_Color <= 0.5 )
						if( rsi1 <= 29.618 )
							if( d_k <= -3.57282 )
								if( d_k <= -5.92193 )
									ret := -0.427230
								if( d_k > -5.92193 )
									ret := -0.630435
							if( d_k > -3.57282 )
								if( d_k <= 8.15895 )
									ret := -0.249274
								if( d_k > 8.15895 )
									ret := -0.422065
						if( rsi1 > 29.618 )
							if( rsi1 <= 34.3577 )
								if( bbm <= 1e-06 )
									ret := -0.150414
								if( bbm > 1e-06 )
									ret := 1.000000 // buy
							if( rsi1 > 34.3577 )
								if( d <= 29.6889 )
									ret := -0.238447
								if( d > 29.6889 )
									ret := -0.554217
					if( BBPower_Color > 0.5 )
						if( rsi1 <= 26.5197 )
							if( d_k <= 1.09708 )
								if( d_k <= 0.188964 )
									ret := -0.666667
								if( d_k > 0.188964 )
									ret := 0.000000
							if( d_k > 1.09708 )
								if( rsi1 <= 20.1942 )
									ret := -0.600000
								if( rsi1 > 20.1942 )
									ret := -0.870130 // sell
						if( rsi1 > 26.5197 )
							if( rsi1 <= 37.4788 )
								if( k <= 16.7237 )
									ret := -0.609400
								if( k > 16.7237 )
									ret := -0.200000
							if( rsi1 > 37.4788 )
								if( rsi1 <= 37.5049 )
									ret := -0.238095
								if( rsi1 > 37.5049 )
									ret := -0.833333 // sell
				if( rsi1 > 37.77 )
					if( rsi1 <= 60.7947 )
						if( d_k <= 12.6093 )
							if( BBPower_Color <= 0.5 )
								if( d <= 9.72316 )
									ret := -0.047479
								if( d > 9.72316 )
									ret := 0.094576
							if( BBPower_Color > 0.5 )
								if( d <= 17.3191 )
									ret := -0.344569
								if( d > 17.3191 )
									ret := -0.170139
						if( d_k > 12.6093 )
							if( BBPower_Color <= 0.5 )
								if( rsi1 <= 39.327 )
									ret := -0.344828
								if( rsi1 > 39.327 )
									ret := 0.049365
							if( BBPower_Color > 0.5 )
								if( smoothK_k <= 10.2658 )
									ret := -0.331412
								if( smoothK_k > 10.2658 )
									ret := -0.536398
					if( rsi1 > 60.7947 )
						if( rsi1 <= 71.3174 )
							if( BBPower_Color <= 0.5 )
								if( d_k <= -5.63627 )
									ret := -1.000000 // sell
								if( d_k > -5.63627 )
									ret := 0.821918 // buy
							if( BBPower_Color > 0.5 )
								if( smoothD_d <= 23.9387 )
									ret := -0.037736
								if( smoothD_d > 23.9387 )
									ret := 0.383178
						if( rsi1 > 71.3174 )
							if( d <= 12.0569 )
								if( rsi1 <= 71.7888 )
									ret := 0.750000 // buy
								if( rsi1 > 71.7888 )
									ret := 1.000000 // buy
							if( d > 12.0569 )
								if( smoothK_k <= 13.0756 )
									ret := 0.375000
								if( smoothK_k > 13.0756 )
									ret := 0.833333 // buy
			if( smoothK_k > 14.3964 )
				if( rsi1 <= 54.3937 )
					if( d_k <= -8.04275 )
						if( rsi1 <= 39.491 )
							if( smoothD_d <= 12.2519 )
								if( d_k <= -9.83205 )
									ret := -0.343358
								if( d_k > -9.83205 )
									ret := -0.585657
							if( smoothD_d > 12.2519 )
								if( smoothK_k <= 23.5499 )
									ret := 0.129032
								if( smoothK_k > 23.5499 )
									ret := -0.266366
						if( rsi1 > 39.491 )
							if( d_k <= -10.2598 )
								if( k <= 23.7913 )
									ret := -0.510526
								if( k > 23.7913 )
									ret := -0.119211
							if( d_k > -10.2598 )
								if( BBPower_Color <= 0.5 )
									ret := 0.055010
								if( BBPower_Color > 0.5 )
									ret := -0.188172
					if( d_k > -8.04275 )
						if( BBPower_Color <= 0.5 )
							if( rsi1 <= 40.2923 )
								if( rsi1 <= 22.2274 )
									ret := -0.360947
								if( rsi1 > 22.2274 )
									ret := -0.080283
							if( rsi1 > 40.2923 )
								if( rsi1 <= 51.0029 )
									ret := 0.015233
								if( rsi1 > 51.0029 )
									ret := 0.234875
						if( BBPower_Color > 0.5 )
							if( rsi1 <= 39.9482 )
								if( d_k <= -5.87205 )
									ret := -0.045455
								if( d_k > -5.87205 )
									ret := -0.537468
							if( rsi1 > 39.9482 )
								if( k <= 30.7259 )
									ret := -0.270924
								if( k > 30.7259 )
									ret := -0.177019
				if( rsi1 > 54.3937 )
					if( rsi1 <= 63.8893 )
						if( smoothD_d <= 49.9444 )
							if( BBPower_Color <= 0.5 )
								if( d <= 37.7679 )
									ret := 0.429752
								if( d > 37.7679 )
									ret := 0.099010
							if( BBPower_Color > 0.5 )
								if( bbp <= 1e-06 )
									ret := -0.122144
								if( bbp > 1e-06 )
									ret := -1.000000 // sell
						if( smoothD_d > 49.9444 )
							if( k <= 28.0825 )
								if( smoothD_d <= 52.038 )
									ret := 0.125000
								if( smoothD_d > 52.038 )
									ret := 1.000000 // buy
							if( k > 28.0825 )
								if( d_k <= 25.0652 )
									ret := 0.294118
								if( d_k > 25.0652 )
									ret := -0.100000
					if( rsi1 > 63.8893 )
						if( smoothK_k <= 28.0331 )
							if( d_k <= 27.6186 )
								if( d_k <= 20.1056 )
									ret := -0.014184
								if( d_k > 20.1056 )
									ret := 0.491803
							if( d_k > 27.6186 )
								if( d_k <= 29.8273 )
									ret := -1.000000 // sell
								if( d_k > 29.8273 )
									ret := -0.250000
						if( smoothK_k > 28.0331 )
							if( bullPower <= 1e-06 )
								if( BBPower_Color <= 0.5 )
									ret := 0.650000
								if( BBPower_Color > 0.5 )
									ret := 0.262385
							if( bullPower > 1e-06 )
								ret := -1.000000 // sell
	if( smoothK_k > 38.2806 )
		if( rsi1 <= 55.5609 )
			if( BBPower_Color <= 0.5 )
				if( rsi1 <= 42.9101 )
					if( smoothK_k <= 72.9222 )
						if( d_k <= -25.6386 )
							if( smoothD_d <= 36.0667 )
								if( smoothK_k <= 58.5453 )
									ret := -0.447368
								if( smoothK_k > 58.5453 )
									ret := 0.181818
							if( smoothD_d > 36.0667 )
								if( d_k <= -28.8704 )
									ret := -1.000000 // sell
								if( d_k > -28.8704 )
									ret := -0.594595
						if( d_k > -25.6386 )
							if( d <= 26.5237 )
								if( d_k <= -18.9495 )
									ret := -0.552239
								if( d_k > -18.9495 )
									ret := -0.150000
							if( d > 26.5237 )
								if( rsi1 <= 37.0889 )
									ret := -0.051938
								if( rsi1 > 37.0889 )
									ret := 0.055845
					if( smoothK_k > 72.9222 )
						if( d_k <= -15.9136 )
							if( smoothK_k <= 89.5975 )
								if( bbm <= 1e-06 )
									ret := -0.060071
								if( bbm > 1e-06 )
									ret := -1.000000 // sell
							if( smoothK_k > 89.5975 )
								if( k <= 94.6725 )
									ret := 0.615385
								if( k > 94.6725 )
									ret := 0.061224
						if( d_k > -15.9136 )
							if( d_k <= -5.51173 )
								if( d_k <= -7.94973 )
									ret := 0.215933
								if( d_k > -7.94973 )
									ret := 0.516129
							if( d_k > -5.51173 )
								if( d <= 85.0628 )
									ret := -0.009231
								if( d > 85.0628 )
									ret := 0.211624
				if( rsi1 > 42.9101 )
					if( smoothK_k <= 74.4875 )
						if( d_k <= 2.97237 )
							if( smoothD_d <= 34.7863 )
								if( k <= 48.06 )
									ret := 0.221354
								if( k > 48.06 )
									ret := 0.000000
							if( smoothD_d > 34.7863 )
								if( smoothK_k <= 43.6464 )
									ret := 0.503846
								if( smoothK_k > 43.6464 )
									ret := 0.255188
						if( d_k > 2.97237 )
							if( smoothK_k <= 69.8332 )
								if( d <= 49.6903 )
									ret := 0.543860
								if( d > 49.6903 )
									ret := 0.054162
							if( smoothK_k > 69.8332 )
								if( smoothK_k <= 73.8176 )
									ret := 0.344130
								if( smoothK_k > 73.8176 )
									ret := -0.116279
					if( smoothK_k > 74.4875 )
						if( d <= 97.6585 )
							if( d_k <= -3.21948 )
								if( rsi1 <= 48.0057 )
									ret := 0.284067
								if( rsi1 > 48.0057 )
									ret := 0.456683
							if( d_k > -3.21948 )
								if( k <= 91.0086 )
									ret := 0.304316
								if( k > 91.0086 )
									ret := 0.110155
						if( d > 97.6585 )
							if( bbm <= 1e-06 )
								if( d_k <= 3.35321 )
									ret := 0.655949
								if( d_k > 3.35321 )
									ret := 0.333333
							if( bbm > 1e-06 )
								ret := -1.000000 // sell
			if( BBPower_Color > 0.5 )
				if( rsi1 <= 49.9787 )
					if( rsi1 <= 49.3401 )
						if( k <= 85.1155 )
							if( d_k <= -5.48005 )
								if( rsi1 <= 46.1893 )
									ret := -0.126168
								if( rsi1 > 46.1893 )
									ret := -0.317518
							if( d_k > -5.48005 )
								if( d_k <= 3.21902 )
									ret := -0.424242
								if( d_k > 3.21902 )
									ret := -0.290043
						if( k > 85.1155 )
							if( k <= 90.9561 )
								if( smoothD_d <= 91.84 )
									ret := -0.024242
								if( smoothD_d > 91.84 )
									ret := 0.500000
							if( k > 90.9561 )
								if( smoothD_d <= 72.6077 )
									ret := 0.210526
								if( smoothD_d > 72.6077 )
									ret := -0.319797
					if( rsi1 > 49.3401 )
						if( smoothK_k <= 83.5824 )
							if( rsi1 <= 49.64 )
								if( d_k <= 4.27614 )
									ret := -0.888889 // sell
								if( d_k > 4.27614 )
									ret := -0.478261
							if( rsi1 > 49.64 )
								ret := -1.000000 // sell
						if( smoothK_k > 83.5824 )
							ret := 0.666667
				if( rsi1 > 49.9787 )
					if( smoothD_d <= 67.7835 )
						if( smoothK_k <= 40.1163 )
							if( bbp <= 0 )
								if( smoothD_d <= 39.2617 )
									ret := 0.285714
								if( smoothD_d > 39.2617 )
									ret := -0.048780
							if( bbp > 0 )
								ret := 0.857143 // buy
						if( smoothK_k > 40.1163 )
							if( rsi1 <= 53.8615 )
								if( rsi1 <= 52.6235 )
									ret := -0.200249
								if( rsi1 > 52.6235 )
									ret := -0.052154
							if( rsi1 > 53.8615 )
								if( rsi1 <= 55.2576 )
									ret := -0.314286
								if( rsi1 > 55.2576 )
									ret := -0.078947
					if( smoothD_d > 67.7835 )
						if( k <= 66.5137 )
							if( rsi1 <= 53.3908 )
								if( smoothD_d <= 81.4047 )
									ret := -0.020134
								if( smoothD_d > 81.4047 )
									ret := 0.750000 // buy
							if( rsi1 > 53.3908 )
								if( d <= 76.0178 )
									ret := 0.191176
								if( d > 76.0178 )
									ret := 0.509804
						if( k > 66.5137 )
							if( smoothD_d <= 96.0491 )
								if( d <= 90.6665 )
									ret := -0.099359
								if( d > 90.6665 )
									ret := 0.071730
							if( smoothD_d > 96.0491 )
								if( d_k <= -0.013141 )
									ret := -0.636364
								if( d_k > -0.013141 )
									ret := -0.233333
		if( rsi1 > 55.5609 )
			if( BBPower_Color <= 0.5 )
				if( d_k <= 4.75808 )
					if( k <= 72.9397 )
						if( smoothK_k <= 49.598 )
							if( rsi1 <= 61.0213 )
								if( smoothD_d <= 38.0574 )
									ret := 0.736842 // buy
								if( smoothD_d > 38.0574 )
									ret := 0.378641
							if( rsi1 > 61.0213 )
								if( d_k <= -19.5809 )
									ret := 0.375000
								if( d_k > -19.5809 )
									ret := 0.868966 // buy
						if( smoothK_k > 49.598 )
							if( smoothD_d <= 64.1411 )
								if( d_k <= 4.26531 )
									ret := 0.591463
								if( d_k > 4.26531 )
									ret := -0.500000
							if( smoothD_d > 64.1411 )
								if( bullPower <= 0 )
									ret := 0.076923
								if( bullPower > 0 )
									ret := -1.000000 // sell
					if( k > 72.9397 )
						if( d_k <= -9.01879 )
							if( smoothK_k <= 96.9974 )
								if( rsi1 <= 64.7081 )
									ret := 0.685775
								if( rsi1 > 64.7081 )
									ret := 0.865997 // buy
							if( smoothK_k > 96.9974 )
								if( rsi1 <= 65.6766 )
									ret := 0.340426
								if( rsi1 > 65.6766 )
									ret := 0.805825 // buy
						if( d_k > -9.01879 )
							if( rsi1 <= 65.7583 )
								if( smoothD_d <= 89.6059 )
									ret := 0.527589
								if( smoothD_d > 89.6059 )
									ret := 0.657295
							if( rsi1 > 65.7583 )
								if( rsi1 <= 74.084 )
									ret := 0.792435 // buy
								if( rsi1 > 74.084 )
									ret := 0.915825 // buy
				if( d_k > 4.75808 )
					if( smoothD_d <= 53.2784 )
						if( rsi1 <= 62.5507 )
							if( d <= 50.3608 )
								ret := 0.500000
							if( d > 50.3608 )
								if( smoothD_d <= 49.3169 )
									ret := -0.500000
								if( smoothD_d > 49.3169 )
									ret := 0.000000
						if( rsi1 > 62.5507 )
							if( k <= 42.2796 )
								ret := -0.750000 // sell
							if( k > 42.2796 )
								ret := -1.000000 // sell
					if( smoothD_d > 53.2784 )
						if( k <= 86.5573 )
							if( d_k <= 5.38803 )
								if( rsi1 <= 58.5857 )
									ret := 0.588235
								if( rsi1 > 58.5857 )
									ret := -0.239130
							if( d_k > 5.38803 )
								if( k <= 43.037 )
									ret := -0.363636
								if( k > 43.037 )
									ret := 0.444693
						if( k > 86.5573 )
							if( d_k <= 6.0572 )
								if( rsi1 <= 64.0001 )
									ret := 0.378378
								if( rsi1 > 64.0001 )
									ret := 0.823529 // buy
							if( d_k > 6.0572 )
								if( rsi1 <= 60.4608 )
									ret := 0.000000
								if( rsi1 > 60.4608 )
									ret := 0.946429 // buy
			if( BBPower_Color > 0.5 )
				if( d <= 88.213 )
					if( smoothD_d <= 60.5553 )
						if( rsi1 <= 70.0255 )
							if( bbp <= 1e-06 )
								if( smoothK_k <= 45.5443 )
									ret := 0.084608
								if( smoothK_k > 45.5443 )
									ret := -0.044248
							if( bbp > 1e-06 )
								if( smoothD_d <= 53.3431 )
									ret := -1.000000 // sell
								if( smoothD_d > 53.3431 )
									ret := -0.750000 // sell
						if( rsi1 > 70.0255 )
							if( d_k <= -4.13048 )
								if( rsi1 <= 72.0043 )
									ret := 0.182353
								if( rsi1 > 72.0043 )
									ret := 0.486111
							if( d_k > -4.13048 )
								if( smoothD_d <= 47.7019 )
									ret := -0.444444
								if( smoothD_d > 47.7019 )
									ret := 0.148305
					if( smoothD_d > 60.5553 )
						if( d_k <= 10.1151 )
							if( rsi1 <= 67.3436 )
								if( d_k <= 4.37509 )
									ret := -0.015156
								if( d_k > 4.37509 )
									ret := 0.134341
							if( rsi1 > 67.3436 )
								if( d_k <= -4.49521 )
									ret := 0.366860
								if( d_k > -4.49521 )
									ret := 0.259309
						if( d_k > 10.1151 )
							if( rsi1 <= 63.6974 )
								if( d_k <= 19.0913 )
									ret := 0.147541
								if( d_k > 19.0913 )
									ret := 0.458647
							if( rsi1 > 63.6974 )
								if( smoothK_k <= 63.4783 )
									ret := 0.409174
								if( smoothK_k > 63.4783 )
									ret := 0.609865
				if( d > 88.213 )
					if( rsi1 <= 73.0259 )
						if( smoothK_k <= 83.0532 )
							if( rsi1 <= 66.6718 )
								if( d_k <= 5.51261 )
									ret := -0.194030
								if( d_k > 5.51261 )
									ret := 0.393701
							if( rsi1 > 66.6718 )
								if( d_k <= 8.62443 )
									ret := 0.552486
								if( d_k > 8.62443 )
									ret := 0.762238 // buy
						if( smoothK_k > 83.0532 )
							if( d_k <= 3.64535 )
								if( smoothK_k <= 84.6049 )
									ret := -0.106870
								if( smoothK_k > 84.6049 )
									ret := 0.184833
							if( d_k > 3.64535 )
								if( smoothK_k <= 87.2413 )
									ret := 0.240166
								if( smoothK_k > 87.2413 )
									ret := 0.477352
					if( rsi1 > 73.0259 )
						if( k <= 79.8483 )
							if( smoothD_d <= 86.0783 )
								if( smoothD_d <= 85.7629 )
									ret := 1.000000 // buy
								if( smoothD_d > 85.7629 )
									ret := 0.000000
							if( smoothD_d > 86.0783 )
								ret := 1.000000 // buy
						if( k > 79.8483 )
							if( d_k <= -0.079036 )
								if( smoothD_d <= 96.2045 )
									ret := 0.450199
								if( smoothD_d > 96.2045 )
									ret := 0.000000
							if( d_k > -0.079036 )
								if( rsi1 <= 81.5108 )
									ret := 0.514871
								if( rsi1 > 81.5108 )
									ret := 0.659836
	
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
float op_operation = decision_tree_0_SHIBUSDT_15Min_1f203655(bbm, bearPower, bbp, bullPower, BBPower_Color, d_k, d, rsi1, k, smoothD_d, smoothK_k)

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


