//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: BABA_1Min_2BT0_9e2ac00d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BABA_1Min_2BT0_9e2ac00d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BABA_1Min_9e2ac00d(bullPower, bbp, bearPower, bbm, BBPower_Color, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bullPower <= -0.032986 )
		if( ema3 <= 107.988 )
			if( ema2 <= 92.2601 )
				if( ema3 <= 80.4007 )
					if( tema <= 79.5722 )
						if( bearPower <= -0.326329 )
							if( ema12 <= -0.281679 )
								if( ema2 <= 78.3314 )
									ret := 0.688312
								if( ema2 > 78.3314 )
									ret := -0.206107
							if( ema12 > -0.281679 )
								if( ema13 <= -0.410955 )
									ret := -0.758621 // sell
								if( ema13 > -0.410955 )
									ret := -0.133588
						if( bearPower > -0.326329 )
							if( ema12 <= -0.013687 )
								if( ema13 <= -0.150853 )
									ret := 0.253559
								if( ema13 > -0.150853 )
									ret := 0.100075
							if( ema12 > -0.013687 )
								if( bbm <= 0.076085 )
									ret := 0.380671
								if( bbm > 0.076085 )
									ret := -0.294118
					if( tema > 79.5722 )
						if( bbp <= -0.13676 )
							if( ema13 <= -0.290163 )
								if( bearPower <= -0.319949 )
									ret := 1.000000 // buy
								if( bearPower > -0.319949 )
									ret := -0.500000
							if( ema13 > -0.290163 )
								if( ema13 <= -0.099133 )
									ret := 0.795699 // buy
								if( ema13 > -0.099133 )
									ret := 0.477178
						if( bbp > -0.13676 )
							if( ema3 <= 80.133 )
								if( tema <= 79.861 )
									ret := 0.302752
								if( tema > 79.861 )
									ret := -0.368421
							if( ema3 > 80.133 )
								if( ema1 <= 80.3602 )
									ret := 0.535211
								if( ema1 > 80.3602 )
									ret := -0.333333
				if( ema3 > 80.4007 )
					if( tema <= 80.2936 )
						if( ema13 <= -0.137424 )
							if( ema2 <= 81.0279 )
								if( tema <= 80.1736 )
									ret := 0.157576
								if( tema > 80.1736 )
									ret := -0.405405
							if( ema2 > 81.0279 )
								if( bbp <= -1.63863 )
									ret := -0.250000
								if( bbp > -1.63863 )
									ret := -1.000000 // sell
						if( ema13 > -0.137424 )
							if( ema12 <= -0.060785 )
								if( bbm <= 0.075844 )
									ret := -0.750000 // sell
								if( bbm > 0.075844 )
									ret := -1.000000 // sell
							if( ema12 > -0.060785 )
								if( bullPower <= -0.049166 )
									ret := -0.250000
								if( bullPower > -0.049166 )
									ret := -0.800000 // sell
					if( tema > 80.2936 )
						if( bearPower <= -0.270493 )
							if( ema2 <= 80.8224 )
								if( ema3 <= 80.6453 )
									ret := 0.166667
								if( ema3 > 80.6453 )
									ret := 0.978723 // buy
							if( ema2 > 80.8224 )
								if( ema2 <= 81.5609 )
									ret := -0.389610
								if( ema2 > 81.5609 )
									ret := 0.252205
						if( bearPower > -0.270493 )
							if( ema12 <= -0.019978 )
								if( ema2 <= 86.5059 )
									ret := 0.051898
								if( ema2 > 86.5059 )
									ret := -0.093797
							if( ema12 > -0.019978 )
								if( ema13 <= -0.014465 )
									ret := 0.382979
								if( ema13 > -0.014465 )
									ret := 0.140162
			if( ema2 > 92.2601 )
				if( ema13 <= -0.090628 )
					if( tema <= 102.46 )
						if( ema2 <= 94.7338 )
							if( ema3 <= 94.3994 )
								if( ema2 <= 93.6862 )
									ret := 1.000000 // buy
								if( ema2 > 93.6862 )
									ret := 0.615385
							if( ema3 > 94.3994 )
								if( ema13 <= -0.21611 )
									ret := -0.923077 // sell
								if( ema13 > -0.21611 )
									ret := 0.000000
						if( ema2 > 94.7338 )
							if( ema1 <= 95.7228 )
								if( ema13 <= -0.177249 )
									ret := 0.666667
								if( ema13 > -0.177249 )
									ret := 0.907895 // buy
							if( ema1 > 95.7228 )
								if( ema2 <= 101.156 )
									ret := 0.117647
								if( ema2 > 101.156 )
									ret := 0.886364 // buy
					if( tema > 102.46 )
						if( ema3 <= 103.23 )
							if( bearPower <= -0.365071 )
								ret := -0.750000 // sell
							if( bearPower > -0.365071 )
								ret := -1.000000 // sell
						if( ema3 > 103.23 )
							if( bbm <= 0.056617 )
								if( ema1 <= 105.621 )
									ret := 0.925373 // buy
								if( ema1 > 105.621 )
									ret := 0.396648
							if( bbm > 0.056617 )
								if( bbp <= -0.53638 )
									ret := 0.720588 // buy
								if( bbp > -0.53638 )
									ret := 0.208817
				if( ema13 > -0.090628 )
					if( bbm <= 0.004605 )
						if( ema2 <= 105.583 )
							if( ema1 <= 105.387 )
								if( ema1 <= 95.1496 )
									ret := 0.645161
								if( ema1 > 95.1496 )
									ret := 0.178571
							if( ema1 > 105.387 )
								if( bearPower <= -0.08588 )
									ret := 0.750000 // buy
								if( bearPower > -0.08588 )
									ret := 1.000000 // buy
						if( ema2 > 105.583 )
							if( ema2 <= 107.937 )
								if( bbm <= 5e-05 )
									ret := 0.217391
								if( bbm > 5e-05 )
									ret := -0.444444
							if( ema2 > 107.937 )
								ret := 1.000000 // buy
					if( bbm > 0.004605 )
						if( bullPower <= -0.082085 )
							if( ema12 <= -0.097752 )
								if( bbp <= -0.546948 )
									ret := -0.750000 // sell
								if( bbp > -0.546948 )
									ret := -1.000000 // sell
							if( ema12 > -0.097752 )
								if( bbp <= -0.326588 )
									ret := 0.666667
								if( bbp > -0.326588 )
									ret := 0.119048
						if( bullPower > -0.082085 )
							if( bbp <= -0.259007 )
								if( ema2 <= 96.4103 )
									ret := 0.000000
								if( ema2 > 96.4103 )
									ret := -0.781250 // sell
							if( bbp > -0.259007 )
								if( bearPower <= -0.162008 )
									ret := 0.521739
								if( bearPower > -0.162008 )
									ret := -0.127660
		if( ema3 > 107.988 )
			if( bullPower <= -0.276406 )
				if( ema2 <= 108.375 )
					if( bbm <= 0.130353 )
						ret := 0.000000
					if( bbm > 0.130353 )
						if( ema3 <= 108.417 )
							if( ema2 <= 107.983 )
								if( bbm <= 0.140772 )
									ret := 0.750000 // buy
								if( bbm > 0.140772 )
									ret := 1.000000 // buy
							if( ema2 > 107.983 )
								ret := 0.500000
						if( ema3 > 108.417 )
							ret := 1.000000 // buy
				if( ema2 > 108.375 )
					if( ema1 <= 114.941 )
						if( ema3 <= 114.562 )
							if( bbp <= -3.05465 )
								if( tema <= 105.736 )
									ret := 0.857143 // buy
								if( tema > 105.736 )
									ret := -0.894737 // sell
							if( bbp > -3.05465 )
								if( bbp <= -0.838374 )
									ret := 0.541667
								if( bbp > -0.838374 )
									ret := -0.625000
						if( ema3 > 114.562 )
							if( tema <= 105.851 )
								ret := 0.833333 // buy
							if( tema > 105.851 )
								if( bbm <= 0.34015 )
									ret := -0.913043 // sell
								if( bbm > 0.34015 )
									ret := -0.055556
					if( ema1 > 114.941 )
						if( ema12 <= -0.217443 )
							if( ema12 <= -0.362117 )
								if( ema12 <= -0.392812 )
									ret := 1.000000 // buy
								if( ema12 > -0.392812 )
									ret := 0.600000
							if( ema12 > -0.362117 )
								ret := 1.000000 // buy
						if( ema12 > -0.217443 )
							if( ema2 <= 117.537 )
								if( bullPower <= -0.30333 )
									ret := -0.750000 // sell
								if( bullPower > -0.30333 )
									ret := 0.000000
							if( ema2 > 117.537 )
								ret := 1.000000 // buy
			if( bullPower > -0.276406 )
				if( ema2 <= 109.281 )
					if( ema1 <= 108.878 )
						if( tema <= 108.038 )
							if( ema1 <= 108.014 )
								if( ema13 <= -0.406351 )
									ret := -0.696970
								if( ema13 > -0.406351 )
									ret := 0.108696
							if( ema1 > 108.014 )
								if( ema2 <= 108.244 )
									ret := -0.538462
								if( ema2 > 108.244 )
									ret := -0.918919 // sell
						if( tema > 108.038 )
							if( ema3 <= 108.524 )
								if( bbp <= -0.104566 )
									ret := 0.455882
								if( bbp > -0.104566 )
									ret := -0.375000
							if( ema3 > 108.524 )
								if( ema3 <= 108.66 )
									ret := -0.588235
								if( ema3 > 108.66 )
									ret := 0.028902
					if( ema1 > 108.878 )
						if( ema12 <= -0.141676 )
							if( ema3 <= 109.344 )
								ret := -1.000000 // sell
							if( ema3 > 109.344 )
								ret := -0.500000
						if( ema12 > -0.141676 )
							if( bearPower <= -0.212261 )
								if( bbp <= -0.475209 )
									ret := 1.000000 // buy
								if( bbp > -0.475209 )
									ret := 0.111111
							if( bearPower > -0.212261 )
								if( bearPower <= -0.083418 )
									ret := -0.687500
								if( bearPower > -0.083418 )
									ret := -0.157895
				if( ema2 > 109.281 )
					if( ema1 <= 117.731 )
						if( ema2 <= 117.57 )
							if( tema <= 109.43 )
								if( ema3 <= 109.602 )
									ret := 0.097826
								if( ema3 > 109.602 )
									ret := 0.779661 // buy
							if( tema > 109.43 )
								if( tema <= 110.981 )
									ret := -0.133028
								if( tema > 110.981 )
									ret := 0.082687
						if( ema2 > 117.57 )
							if( ema13 <= -0.047723 )
								if( tema <= 117.576 )
									ret := 0.914894 // buy
								if( tema > 117.576 )
									ret := -0.500000
							if( ema13 > -0.047723 )
								if( tema <= 117.582 )
									ret := -1.000000 // sell
								if( tema > 117.582 )
									ret := 0.800000 // buy
					if( ema1 > 117.731 )
						if( bbp <= -0.400001 )
							if( bearPower <= -0.410415 )
								ret := 0.200000
							if( bearPower > -0.410415 )
								ret := 0.750000 // buy
						if( bbp > -0.400001 )
							if( ema2 <= 117.829 )
								ret := -0.250000
							if( ema2 > 117.829 )
								if( ema2 <= 118.493 )
									ret := -1.000000 // sell
								if( ema2 > 118.493 )
									ret := -0.500000
	if( bullPower > -0.032986 )
		if( bbm <= 0.04207 )
			if( ema3 <= 74.5455 )
				if( ema3 <= 74.3448 )
					if( ema2 <= 68.4323 )
						if( bearPower <= 0.037371 )
							if( bbm <= 0.029696 )
								if( ema12 <= -0.029301 )
									ret := 0.250000
								if( ema12 > -0.029301 )
									ret := 0.944444 // buy
							if( bbm > 0.029696 )
								ret := 0.166667
						if( bearPower > 0.037371 )
							if( bbm <= 0.005 )
								ret := 0.428571
							if( bbm > 0.005 )
								ret := -0.500000
					if( ema2 > 68.4323 )
						if( ema13 <= 0.103827 )
							if( bullPower <= 0.140793 )
								if( tema <= 74.2383 )
									ret := 0.048107
								if( tema > 74.2383 )
									ret := -0.129707
							if( bullPower > 0.140793 )
								if( ema2 <= 72.4778 )
									ret := 1.000000 // buy
								if( ema2 > 72.4778 )
									ret := 0.500000
						if( ema13 > 0.103827 )
							if( ema13 <= 0.128095 )
								if( bbp <= 0.091795 )
									ret := 0.000000
								if( bbp > 0.091795 )
									ret := -0.733333 // sell
							if( ema13 > 0.128095 )
								if( ema12 <= 0.204822 )
									ret := 0.012048
								if( ema12 > 0.204822 )
									ret := -0.645161
				if( ema3 > 74.3448 )
					if( ema13 <= 0.043571 )
						if( bbp <= 0.106489 )
							if( bearPower <= 0.0381 )
								if( tema <= 74.3824 )
									ret := -0.024194
								if( tema > 74.3824 )
									ret := 0.224176
							if( bearPower > 0.0381 )
								if( bullPower <= 0.044049 )
									ret := -1.000000 // sell
								if( bullPower > 0.044049 )
									ret := -0.500000
						if( bbp > 0.106489 )
							if( bullPower <= 0.077975 )
								if( bearPower <= 0.061306 )
									ret := -0.200000
								if( bearPower > 0.061306 )
									ret := -1.000000 // sell
							if( bullPower > 0.077975 )
								ret := 0.250000
					if( ema13 > 0.043571 )
						if( ema2 <= 74.438 )
							if( ema13 <= 0.056146 )
								if( bbm <= 0.0198 )
									ret := 0.888889 // buy
								if( bbm > 0.0198 )
									ret := 0.000000
							if( ema13 > 0.056146 )
								if( ema1 <= 74.4567 )
									ret := 1.000000 // buy
								if( ema1 > 74.4567 )
									ret := 0.714286 // buy
						if( ema2 > 74.438 )
							if( ema1 <= 74.541 )
								if( ema12 <= 0.055176 )
									ret := 0.071429
								if( ema12 > 0.055176 )
									ret := -0.500000
							if( ema1 > 74.541 )
								if( bullPower <= 0.06566 )
									ret := 0.000000
								if( bullPower > 0.06566 )
									ret := 0.633333
			if( ema3 > 74.5455 )
				if( ema1 <= 74.8877 )
					if( bearPower <= 0.079421 )
						if( ema3 <= 74.8087 )
							if( ema12 <= 0.037276 )
								if( ema2 <= 74.63 )
									ret := -0.283688
								if( ema2 > 74.63 )
									ret := -0.056604
							if( ema12 > 0.037276 )
								if( ema2 <= 74.7377 )
									ret := 0.527778
								if( ema2 > 74.7377 )
									ret := 0.000000
						if( ema3 > 74.8087 )
							if( ema13 <= 0.005463 )
								if( bbp <= -0.060497 )
									ret := 0.000000
								if( bbp > -0.060497 )
									ret := -0.627119
							if( ema13 > 0.005463 )
								if( bbm <= 0.02845 )
									ret := 0.000000
								if( bbm > 0.02845 )
									ret := -0.466667
					if( bearPower > 0.079421 )
						if( ema1 <= 74.714 )
							if( bbm <= 0.029569 )
								ret := -1.000000 // sell
							if( bbm > 0.029569 )
								ret := -0.750000 // sell
						if( ema1 > 74.714 )
							ret := -0.333333
				if( ema1 > 74.8877 )
					if( ema1 <= 75.3783 )
						if( ema2 <= 75.3496 )
							if( ema12 <= 0.002239 )
								if( bullPower <= -0.021977 )
									ret := 0.326087
								if( bullPower > -0.021977 )
									ret := -0.121739
							if( ema12 > 0.002239 )
								if( tema <= 75.1913 )
									ret := 0.420408
								if( tema > 75.1913 )
									ret := 0.090426
						if( ema2 > 75.3496 )
							if( bullPower <= -0.023174 )
								if( ema1 <= 75.3662 )
									ret := 1.000000 // buy
								if( ema1 > 75.3662 )
									ret := 0.500000
							if( bullPower > -0.023174 )
								if( bearPower <= -0.008427 )
									ret := 0.093023
								if( bearPower > -0.008427 )
									ret := 0.690909
					if( ema1 > 75.3783 )
						if( ema12 <= -0.009645 )
							if( bearPower <= 0.032288 )
								if( ema1 <= 112.029 )
									ret := -0.048424
								if( ema1 > 112.029 )
									ret := 0.214815
							if( bearPower > 0.032288 )
								if( ema13 <= -0.117845 )
									ret := 0.307692
								if( ema13 > -0.117845 )
									ret := -0.543860
						if( ema12 > -0.009645 )
							if( bullPower <= -0.016972 )
								if( tema <= 79.1762 )
									ret := 0.274238
								if( tema > 79.1762 )
									ret := 0.070234
							if( bullPower > -0.016972 )
								if( bearPower <= 0.010902 )
									ret := 0.032207
								if( bearPower > 0.010902 )
									ret := -0.023539
		if( bbm > 0.04207 )
			if( bbp <= 0.492223 )
				if( ema12 <= 0.049905 )
					if( ema3 <= 80.9556 )
						if( tema <= 68.776 )
							if( bbm <= 0.090236 )
								if( ema13 <= -0.050208 )
									ret := 0.000000
								if( ema13 > -0.050208 )
									ret := 0.523810
							if( bbm > 0.090236 )
								ret := 1.000000 // buy
						if( tema > 68.776 )
							if( ema12 <= -0.044394 )
								if( bbm <= 0.408099 )
									ret := 0.224261
								if( bbm > 0.408099 )
									ret := 0.658730
							if( ema12 > -0.044394 )
								if( bbp <= -0.282286 )
									ret := -0.711538 // sell
								if( bbp > -0.282286 )
									ret := 0.078164
					if( ema3 > 80.9556 )
						if( ema2 <= 81.119 )
							if( bearPower <= -0.062739 )
								if( bbm <= 0.100604 )
									ret := -0.350000
								if( bbm > 0.100604 )
									ret := -0.714286 // sell
							if( bearPower > -0.062739 )
								if( bbp <= -0.030589 )
									ret := 0.535714
								if( bbp > -0.030589 )
									ret := -0.216667
						if( ema2 > 81.119 )
							if( ema13 <= 0.146175 )
								if( ema12 <= 0.021964 )
									ret := 0.043274
								if( ema12 > 0.021964 )
									ret := -0.058861
							if( ema13 > 0.146175 )
								if( bullPower <= 0.092562 )
									ret := 0.302326
								if( bullPower > 0.092562 )
									ret := 0.891892 // buy
				if( ema12 > 0.049905 )
					if( ema2 <= 81.9079 )
						if( tema <= 78.1506 )
							if( ema13 <= 0.199532 )
								if( bbm <= 0.306273 )
									ret := 0.084411
								if( bbm > 0.306273 )
									ret := -0.813953 // sell
							if( ema13 > 0.199532 )
								if( ema3 <= 76.6183 )
									ret := 0.395112
								if( ema3 > 76.6183 )
									ret := 0.830357 // buy
						if( tema > 78.1506 )
							if( ema13 <= 0.15406 )
								if( bbp <= 0.391936 )
									ret := 0.064121
								if( bbp > 0.391936 )
									ret := -0.609375
							if( ema13 > 0.15406 )
								if( ema2 <= 79.8487 )
									ret := -0.327751
								if( ema2 > 79.8487 )
									ret := -0.088319
					if( ema2 > 81.9079 )
						if( ema3 <= 114.485 )
							if( ema12 <= 0.140761 )
								if( bbm <= 0.090051 )
									ret := 0.085202
								if( bbm > 0.090051 )
									ret := 0.293204
							if( ema12 > 0.140761 )
								if( bearPower <= 0.177519 )
									ret := 0.055675
								if( bearPower > 0.177519 )
									ret := -0.466667
						if( ema3 > 114.485 )
							if( tema <= 116.371 )
								if( ema3 <= 115.637 )
									ret := -0.205357
								if( ema3 > 115.637 )
									ret := -0.800000 // sell
							if( tema > 116.371 )
								if( ema3 <= 116.368 )
									ret := 0.779661 // buy
								if( ema3 > 116.368 )
									ret := -0.068182
			if( bbp > 0.492223 )
				if( tema <= 108.49 )
					if( ema2 <= 75.8252 )
						if( bullPower <= 0.32385 )
							if( ema13 <= 0.18946 )
								ret := -0.600000
							if( ema13 > 0.18946 )
								if( ema13 <= 0.317333 )
									ret := 0.863636 // buy
								if( ema13 > 0.317333 )
									ret := -0.250000
						if( bullPower > 0.32385 )
							if( ema12 <= 0.073827 )
								ret := 0.428571
							if( ema12 > 0.073827 )
								if( bbm <= 0.155155 )
									ret := -0.268657
								if( bbm > 0.155155 )
									ret := -0.779817 // sell
					if( ema2 > 75.8252 )
						if( ema13 <= 0.432345 )
							if( tema <= 98.7648 )
								if( ema12 <= -0.018147 )
									ret := 1.000000 // buy
								if( ema12 > -0.018147 )
									ret := -0.106516
							if( tema > 98.7648 )
								if( ema1 <= 105.059 )
									ret := 0.692308
								if( ema1 > 105.059 )
									ret := 0.167539
						if( ema13 > 0.432345 )
							if( tema <= 89.5521 )
								if( ema12 <= 0.791888 )
									ret := 0.390476
								if( ema12 > 0.791888 )
									ret := -0.666667
							if( tema > 89.5521 )
								if( ema12 <= 0.326232 )
									ret := 0.405797
								if( ema12 > 0.326232 )
									ret := -0.484848
				if( tema > 108.49 )
					if( ema13 <= 0.349572 )
						if( ema2 <= 112.189 )
							if( bbm <= 0.656971 )
								if( tema <= 110.5 )
									ret := -0.314516
								if( tema > 110.5 )
									ret := 0.138462
							if( bbm > 0.656971 )
								if( tema <= 108.883 )
									ret := 0.000000
								if( tema > 108.883 )
									ret := 1.000000 // buy
						if( ema2 > 112.189 )
							if( ema3 <= 115.215 )
								if( tema <= 114.38 )
									ret := -0.651685
								if( tema > 114.38 )
									ret := 0.461538
							if( ema3 > 115.215 )
								if( tema <= 118.265 )
									ret := -0.791045 // sell
								if( tema > 118.265 )
									ret := 0.000000
					if( ema13 > 0.349572 )
						if( tema <= 114.318 )
							if( bullPower <= 0.30664 )
								ret := 0.200000
							if( bullPower > 0.30664 )
								if( ema1 <= 108.558 )
									ret := -0.444444
								if( ema1 > 108.558 )
									ret := -0.831579 // sell
						if( tema > 114.318 )
							if( tema <= 117.512 )
								if( bbm <= 0.1684 )
									ret := 0.760000 // buy
								if( bbm > 0.1684 )
									ret := -0.242424
							if( tema > 117.512 )
								if( bullPower <= 1.72018 )
									ret := -0.905660 // sell
								if( bullPower > 1.72018 )
									ret := -0.333333
	
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
float op_operation = decision_tree_0_BABA_1Min_9e2ac00d(bullPower, bbp, bearPower, bbm, BBPower_Color, ema3, tema, ema2, ema12, ema13, ema1)

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


