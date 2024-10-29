//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow
// ID_model: SHIBUSDT_30Min_1C00_caaa0927 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SHIBUSDT_30Min_1C00_caaa0927", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SHIBUSDT_30Min_caaa0927(mf, ad, ad_mf)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ad_mf <= -3.81509e+10 )
		if( mf <= -0.114842 )
			if( ad <= -3.49728e+11 )
				if( ad <= -4.89131e+11 )
					if( ad_mf <= -6.91662e+11 )
						if( mf <= -0.157969 )
							if( ad_mf <= -1.27196e+12 )
								if( ad <= -1.49259e+12 )
									ret := 0.703704 // buy
								if( ad > -1.49259e+12 )
									ret := 1.000000 // buy
							if( ad_mf > -1.27196e+12 )
								if( ad_mf <= -1.24959e+12 )
									ret := -1.000000 // sell
								if( ad_mf > -1.24959e+12 )
									ret := 0.627907
						if( mf > -0.157969 )
							if( ad_mf <= -2.45334e+12 )
								ret := -0.750000 // sell
							if( ad_mf > -2.45334e+12 )
								if( ad_mf <= -1.74878e+12 )
									ret := 1.000000 // buy
								if( ad_mf > -1.74878e+12 )
									ret := 0.328125
					if( ad_mf > -6.91662e+11 )
						if( ad_mf <= -6.67778e+11 )
							ret := -1.000000 // sell
						if( ad_mf > -6.67778e+11 )
							if( ad_mf <= -5.53515e+11 )
								if( ad <= -5.69416e+11 )
									ret := 0.022727
								if( ad > -5.69416e+11 )
									ret := 0.821429 // buy
							if( ad_mf > -5.53515e+11 )
								if( ad_mf <= -5.22954e+11 )
									ret := -0.833333 // sell
								if( ad_mf > -5.22954e+11 )
									ret := 0.296296
				if( ad > -4.89131e+11 )
					if( mf <= -0.151697 )
						if( ad_mf <= -3.61853e+11 )
							if( ad_mf <= -3.83673e+11 )
								if( mf <= -0.359106 )
									ret := 0.142857
								if( mf > -0.359106 )
									ret := 0.782258 // buy
							if( ad_mf > -3.83673e+11 )
								if( ad <= -3.77436e+11 )
									ret := -0.285714
								if( ad > -3.77436e+11 )
									ret := 0.642857
						if( ad_mf > -3.61853e+11 )
							ret := 1.000000 // buy
					if( mf > -0.151697 )
						if( ad_mf <= -4.2024e+11 )
							if( ad <= -4.76455e+11 )
								ret := 0.000000
							if( ad > -4.76455e+11 )
								if( ad <= -4.46398e+11 )
									ret := 0.615385
								if( ad > -4.46398e+11 )
									ret := 0.941176 // buy
						if( ad_mf > -4.2024e+11 )
							if( ad_mf <= -4.17818e+11 )
								ret := -1.000000 // sell
							if( ad_mf > -4.17818e+11 )
								if( ad <= -4.12081e+11 )
									ret := 1.000000 // buy
								if( ad > -4.12081e+11 )
									ret := 0.327586
			if( ad > -3.49728e+11 )
				if( ad_mf <= -3.82269e+10 )
					if( ad <= -3.37814e+11 )
						if( mf <= -0.324713 )
							ret := 0.750000 // buy
						if( mf > -0.324713 )
							if( ad_mf <= -3.41627e+11 )
								if( ad <= -3.43402e+11 )
									ret := -0.600000
								if( ad > -3.43402e+11 )
									ret := 1.000000 // buy
							if( ad_mf > -3.41627e+11 )
								if( ad_mf <= -3.40732e+11 )
									ret := -1.000000 // sell
								if( ad_mf > -3.40732e+11 )
									ret := -0.714286 // sell
					if( ad > -3.37814e+11 )
						if( ad <= -3.18454e+11 )
							if( ad_mf <= -3.3064e+11 )
								if( ad <= -3.33225e+11 )
									ret := 0.769231 // buy
								if( ad > -3.33225e+11 )
									ret := -0.166667
							if( ad_mf > -3.3064e+11 )
								if( mf <= -0.169348 )
									ret := 0.714286 // buy
								if( mf > -0.169348 )
									ret := 1.000000 // buy
						if( ad > -3.18454e+11 )
							if( ad_mf <= -3.12383e+11 )
								if( ad <= -3.16415e+11 )
									ret := 0.250000
								if( ad > -3.16415e+11 )
									ret := -0.916667 // sell
							if( ad_mf > -3.12383e+11 )
								if( ad_mf <= -2.93036e+11 )
									ret := 0.470588
								if( ad_mf > -2.93036e+11 )
									ret := 0.111383
				if( ad_mf > -3.82269e+10 )
					ret := 1.000000 // buy
		if( mf > -0.114842 )
			if( ad <= -4.70311e+10 )
				if( ad <= -4.94827e+10 )
					if( mf <= 0.007202 )
						if( ad_mf <= -4.96574e+10 )
							if( ad_mf <= -5.08551e+10 )
								if( ad_mf <= -1.33408e+11 )
									ret := 0.142903
								if( ad_mf > -1.33408e+11 )
									ret := 0.068614
							if( ad_mf > -5.08551e+10 )
								if( ad <= -5.01241e+10 )
									ret := 0.740000 // buy
								if( ad > -5.01241e+10 )
									ret := 0.230769
						if( ad_mf > -4.96574e+10 )
							if( ad <= -4.95744e+10 )
								ret := -1.000000 // sell
							if( ad > -4.95744e+10 )
								ret := -0.285714
					if( mf > 0.007202 )
						if( ad_mf <= -9.42308e+11 )
							if( ad_mf <= -1.20676e+12 )
								if( ad_mf <= -1.26772e+12 )
									ret := 0.014218
								if( ad_mf > -1.26772e+12 )
									ret := 0.769231 // buy
							if( ad_mf > -1.20676e+12 )
								if( ad <= -1.11704e+12 )
									ret := -1.000000 // sell
								if( ad > -1.11704e+12 )
									ret := -0.253731
						if( ad_mf > -9.42308e+11 )
							if( ad_mf <= -9.38198e+11 )
								ret := 1.000000 // buy
							if( ad_mf > -9.38198e+11 )
								if( ad <= -5.61504e+10 )
									ret := 0.056140
								if( ad > -5.61504e+10 )
									ret := 0.157598
				if( ad > -4.94827e+10 )
					if( ad_mf <= -4.90737e+10 )
						if( ad <= -4.92879e+10 )
							if( ad <= -4.9398e+10 )
								ret := -0.500000
							if( ad > -4.9398e+10 )
								if( ad_mf <= -4.93808e+10 )
									ret := 0.250000
								if( ad_mf > -4.93808e+10 )
									ret := -0.100000
						if( ad > -4.92879e+10 )
							if( ad <= -4.92723e+10 )
								ret := -1.000000 // sell
							if( ad > -4.92723e+10 )
								if( ad_mf <= -4.92008e+10 )
									ret := -0.400000
								if( ad_mf > -4.92008e+10 )
									ret := -0.700000 // sell
					if( ad_mf > -4.90737e+10 )
						if( mf <= -0.080438 )
							if( ad <= -4.80452e+10 )
								if( mf <= -0.108826 )
									ret := -0.333333
								if( mf > -0.108826 )
									ret := 0.700000 // buy
							if( ad > -4.80452e+10 )
								if( ad_mf <= -4.73278e+10 )
									ret := -0.136364
								if( ad_mf > -4.73278e+10 )
									ret := 0.571429
						if( mf > -0.080438 )
							if( ad_mf <= -4.71246e+10 )
								if( ad_mf <= -4.73243e+10 )
									ret := -0.111111
								if( ad_mf > -4.73243e+10 )
									ret := 0.375000
							if( ad_mf > -4.71246e+10 )
								if( ad_mf <= -4.71097e+10 )
									ret := -1.000000 // sell
								if( ad_mf > -4.71097e+10 )
									ret := -0.583333
			if( ad > -4.70311e+10 )
				if( mf <= 0.010597 )
					if( ad_mf <= -4.50562e+10 )
						if( ad <= -4.6954e+10 )
							if( ad_mf <= -4.70163e+10 )
								ret := 1.000000 // buy
							if( ad_mf > -4.70163e+10 )
								if( mf <= -0.01756 )
									ret := 1.000000 // buy
								if( mf > -0.01756 )
									ret := 0.250000
						if( ad > -4.6954e+10 )
							if( ad <= -4.68871e+10 )
								ret := -0.800000 // sell
							if( ad > -4.68871e+10 )
								if( ad_mf <= -4.51401e+10 )
									ret := 0.298137
								if( ad_mf > -4.51401e+10 )
									ret := 0.846154 // buy
					if( ad_mf > -4.50562e+10 )
						if( ad <= -4.46363e+10 )
							if( ad <= -4.47254e+10 )
								if( ad <= -4.48538e+10 )
									ret := -0.588235
								if( ad > -4.48538e+10 )
									ret := 0.000000
							if( ad > -4.47254e+10 )
								if( ad_mf <= -4.46553e+10 )
									ret := -1.000000 // sell
								if( ad_mf > -4.46553e+10 )
									ret := -0.555556
						if( ad > -4.46363e+10 )
							if( mf <= -0.113348 )
								ret := -0.800000 // sell
							if( mf > -0.113348 )
								if( ad <= -4.31295e+10 )
									ret := -0.043478
								if( ad > -4.31295e+10 )
									ret := 0.125000
				if( mf > 0.010597 )
					if( mf <= 0.062379 )
						if( ad <= -4.31528e+10 )
							if( ad_mf <= -4.33488e+10 )
								if( ad <= -4.36722e+10 )
									ret := 0.366906
								if( ad > -4.36722e+10 )
									ret := 0.047619
							if( ad_mf > -4.33488e+10 )
								ret := -0.666667
						if( ad > -4.31528e+10 )
							if( ad <= -4.08911e+10 )
								if( ad <= -4.1869e+10 )
									ret := 0.473684
								if( ad > -4.1869e+10 )
									ret := 0.760000 // buy
							if( ad > -4.08911e+10 )
								if( mf <= 0.023779 )
									ret := 0.619048
								if( mf > 0.023779 )
									ret := 0.233333
					if( mf > 0.062379 )
						if( ad <= -4.34742e+10 )
							if( ad <= -4.35799e+10 )
								if( ad <= -4.69731e+10 )
									ret := -0.750000 // sell
								if( ad > -4.69731e+10 )
									ret := 0.232432
							if( ad > -4.35799e+10 )
								if( ad <= -4.35452e+10 )
									ret := 0.750000 // buy
								if( ad > -4.35452e+10 )
									ret := 0.888889 // buy
						if( ad > -4.34742e+10 )
							if( ad_mf <= -4.18579e+10 )
								if( ad_mf <= -4.31389e+10 )
									ret := -0.428571
								if( ad_mf > -4.31389e+10 )
									ret := -0.086207
							if( ad_mf > -4.18579e+10 )
								if( ad <= -4.0228e+10 )
									ret := 0.350515
								if( ad > -4.0228e+10 )
									ret := 0.000000
	if( ad_mf > -3.81509e+10 )
		if( ad_mf <= 8.97643e+11 )
			if( ad_mf <= 2.40406e+11 )
				if( ad <= 2.06055e+11 )
					if( ad_mf <= 1.96625e+11 )
						if( mf <= 0.057553 )
							if( ad_mf <= 1.95483e+11 )
								if( ad_mf <= 1.3596e+11 )
									ret := 0.015714
								if( ad_mf > 1.3596e+11 )
									ret := -0.072353
							if( ad_mf > 1.95483e+11 )
								if( ad <= 1.96292e+11 )
									ret := 1.000000 // buy
								if( ad > 1.96292e+11 )
									ret := 0.727273 // buy
						if( mf > 0.057553 )
							if( ad_mf <= -1.3112e+10 )
								if( ad_mf <= -1.9332e+10 )
									ret := 0.042758
								if( ad_mf > -1.9332e+10 )
									ret := 0.267066
							if( ad_mf > -1.3112e+10 )
								if( ad <= 1.02079e+10 )
									ret := -0.007255
								if( ad > 1.02079e+10 )
									ret := 0.063083
					if( ad_mf > 1.96625e+11 )
						if( ad_mf <= 2.03503e+11 )
							if( ad_mf <= 2.0258e+11 )
								if( ad <= 2.00836e+11 )
									ret := -0.422222
								if( ad > 2.00836e+11 )
									ret := 0.290323
							if( ad_mf > 2.0258e+11 )
								if( ad <= 2.03294e+11 )
									ret := -0.900000 // sell
								if( ad > 2.03294e+11 )
									ret := -0.428571
						if( ad_mf > 2.03503e+11 )
							if( ad <= 2.05289e+11 )
								if( mf <= 0.101909 )
									ret := 0.512821
								if( mf > 0.101909 )
									ret := -0.222222
							if( ad > 2.05289e+11 )
								if( mf <= 0.11286 )
									ret := -0.750000 // sell
								if( mf > 0.11286 )
									ret := 0.052632
				if( ad > 2.06055e+11 )
					if( ad <= 2.18496e+11 )
						if( ad <= 2.15076e+11 )
							if( ad_mf <= 2.08519e+11 )
								if( ad <= 2.08205e+11 )
									ret := 0.555556
								if( ad > 2.08205e+11 )
									ret := 1.000000 // buy
							if( ad_mf > 2.08519e+11 )
								if( ad <= 2.14259e+11 )
									ret := 0.120690
								if( ad > 2.14259e+11 )
									ret := -0.466667
						if( ad > 2.15076e+11 )
							if( mf <= 0.109537 )
								if( ad_mf <= 2.16697e+11 )
									ret := 0.606061
								if( ad_mf > 2.16697e+11 )
									ret := 0.888889 // buy
							if( mf > 0.109537 )
								if( ad <= 2.16846e+11 )
									ret := 0.666667
								if( ad > 2.16846e+11 )
									ret := 0.222222
					if( ad > 2.18496e+11 )
						if( ad <= 2.3563e+11 )
							if( ad_mf <= 2.33813e+11 )
								if( ad <= 2.20898e+11 )
									ret := -0.441860
								if( ad > 2.20898e+11 )
									ret := 0.083045
							if( ad_mf > 2.33813e+11 )
								if( ad <= 2.34865e+11 )
									ret := -0.640000
								if( ad > 2.34865e+11 )
									ret := 0.000000
						if( ad > 2.3563e+11 )
							if( ad_mf <= 2.39419e+11 )
								if( mf <= 0.095527 )
									ret := 0.736842 // buy
								if( mf > 0.095527 )
									ret := 0.238095
							if( ad_mf > 2.39419e+11 )
								if( ad <= 2.39811e+11 )
									ret := -1.000000 // sell
								if( ad > 2.39811e+11 )
									ret := 0.272727
			if( ad_mf > 2.40406e+11 )
				if( ad <= 2.41501e+11 )
					if( ad <= 2.41225e+11 )
						if( ad_mf <= 2.40962e+11 )
							if( mf <= 0.073328 )
								ret := -1.000000 // sell
							if( mf > 0.073328 )
								ret := -0.500000
						if( ad_mf > 2.40962e+11 )
							ret := -0.166667
					if( ad > 2.41225e+11 )
						if( mf <= -0.017667 )
							ret := -0.750000 // sell
						if( mf > -0.017667 )
							ret := -1.000000 // sell
				if( ad > 2.41501e+11 )
					if( ad_mf <= 8.78216e+11 )
						if( ad <= 7.1144e+11 )
							if( mf <= 0.185929 )
								if( ad_mf <= 4.08888e+11 )
									ret := 0.017070
								if( ad_mf > 4.08888e+11 )
									ret := -0.079696
							if( mf > 0.185929 )
								if( ad_mf <= 6.26917e+11 )
									ret := -0.201856
								if( ad_mf > 6.26917e+11 )
									ret := -0.888889 // sell
						if( ad > 7.1144e+11 )
							if( mf <= 0.171182 )
								if( ad <= 7.23217e+11 )
									ret := 0.880000 // buy
								if( ad > 7.23217e+11 )
									ret := -0.095652
							if( mf > 0.171182 )
								if( ad <= 8.30438e+11 )
									ret := 0.373134
								if( ad > 8.30438e+11 )
									ret := 0.857143 // buy
					if( ad_mf > 8.78216e+11 )
						if( mf <= 0.155612 )
							if( mf <= -0.052666 )
								ret := -0.500000
							if( mf > -0.052666 )
								ret := -1.000000 // sell
						if( mf > 0.155612 )
							ret := 0.600000
		if( ad_mf > 8.97643e+11 )
			if( mf <= 0.046075 )
				if( ad_mf <= 1.81453e+12 )
					if( ad <= 1.2474e+12 )
						if( ad_mf <= 9.78582e+11 )
							if( mf <= -0.104695 )
								if( ad <= 9.24142e+11 )
									ret := 1.000000 // buy
								if( ad > 9.24142e+11 )
									ret := 0.500000
							if( mf > -0.104695 )
								if( ad <= 9.19277e+11 )
									ret := -0.166667
								if( ad > 9.19277e+11 )
									ret := 0.437500
						if( ad_mf > 9.78582e+11 )
							if( mf <= -0.076209 )
								ret := 1.000000 // buy
							if( mf > -0.076209 )
								if( mf <= -0.001792 )
									ret := 0.750000 // buy
								if( mf > -0.001792 )
									ret := 1.000000 // buy
					if( ad > 1.2474e+12 )
						if( ad_mf <= 1.37893e+12 )
							if( mf <= -0.058423 )
								ret := -0.800000 // sell
							if( mf > -0.058423 )
								ret := -1.000000 // sell
						if( ad_mf > 1.37893e+12 )
							if( ad <= 1.74109e+12 )
								if( ad <= 1.6238e+12 )
									ret := 0.333333
								if( ad > 1.6238e+12 )
									ret := 0.894737 // buy
							if( ad > 1.74109e+12 )
								ret := -1.000000 // sell
				if( ad_mf > 1.81453e+12 )
					if( ad <= 4.48672e+12 )
						if( ad_mf <= 2.50898e+12 )
							if( ad_mf <= 2.14884e+12 )
								if( ad_mf <= 1.93699e+12 )
									ret := 1.000000 // buy
								if( ad_mf > 1.93699e+12 )
									ret := 0.700000 // buy
							if( ad_mf > 2.14884e+12 )
								if( mf <= -0.088652 )
									ret := 1.000000 // buy
								if( mf > -0.088652 )
									ret := -0.142857
						if( ad_mf > 2.50898e+12 )
							ret := 1.000000 // buy
					if( ad > 4.48672e+12 )
						ret := 0.000000
			if( mf > 0.046075 )
				if( ad <= 9.99635e+11 )
					if( ad_mf <= 9.56244e+11 )
						if( mf <= 0.196312 )
							if( ad_mf <= 9.45875e+11 )
								if( ad_mf <= 9.14966e+11 )
									ret := -0.166667
								if( ad_mf > 9.14966e+11 )
									ret := 0.400000
							if( ad_mf > 9.45875e+11 )
								ret := -0.500000
						if( mf > 0.196312 )
							if( ad <= 9.38069e+11 )
								if( ad_mf <= 9.2005e+11 )
									ret := 0.900000 // buy
								if( ad_mf > 9.2005e+11 )
									ret := 0.250000
							if( ad > 9.38069e+11 )
								ret := 1.000000 // buy
					if( ad_mf > 9.56244e+11 )
						if( ad_mf <= 9.83735e+11 )
							if( ad_mf <= 9.73057e+11 )
								ret := 0.750000 // buy
							if( ad_mf > 9.73057e+11 )
								ret := 0.833333 // buy
						if( ad_mf > 9.83735e+11 )
							ret := 1.000000 // buy
				if( ad > 9.99635e+11 )
					if( ad_mf <= 1.15557e+12 )
						if( ad_mf <= 1.04462e+12 )
							if( mf <= 0.085015 )
								if( ad_mf <= 1.01593e+12 )
									ret := 0.750000 // buy
								if( ad_mf > 1.01593e+12 )
									ret := -0.600000
							if( mf > 0.085015 )
								if( ad_mf <= 1.00885e+12 )
									ret := -0.500000
								if( ad_mf > 1.00885e+12 )
									ret := -1.000000 // sell
						if( ad_mf > 1.04462e+12 )
							if( ad <= 1.08508e+12 )
								if( ad <= 1.07525e+12 )
									ret := 0.500000
								if( ad > 1.07525e+12 )
									ret := 1.000000 // buy
							if( ad > 1.08508e+12 )
								if( mf <= 0.190299 )
									ret := -0.758621 // sell
								if( mf > 0.190299 )
									ret := 0.000000
					if( ad_mf > 1.15557e+12 )
						if( mf <= 0.289831 )
							if( mf <= 0.071463 )
								if( mf <= 0.052641 )
									ret := 0.250000
								if( mf > 0.052641 )
									ret := -0.440000
							if( mf > 0.071463 )
								if( ad_mf <= 1.29713e+12 )
									ret := -0.133333
								if( ad_mf > 1.29713e+12 )
									ret := 0.216495
						if( mf > 0.289831 )
							if( ad_mf <= 1.2442e+12 )
								if( ad_mf <= 1.16068e+12 )
									ret := 0.000000
								if( ad_mf > 1.16068e+12 )
									ret := 1.000000 // buy
							if( ad_mf > 1.2442e+12 )
								if( ad_mf <= 1.42851e+12 )
									ret := -1.000000 // sell
								if( ad_mf > 1.42851e+12 )
									ret := -0.219178
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_SHIBUSDT_30Min_caaa0927(mf, ad, ad_mf)

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


