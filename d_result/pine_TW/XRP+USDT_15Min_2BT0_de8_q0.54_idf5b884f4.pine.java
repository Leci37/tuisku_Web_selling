//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: XRPUSDT_15Min_2BT0_f5b884f4 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XRPUSDT_15Min_2BT0_f5b884f4", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XRPUSDT_15Min_f5b884f4(bbp, bullPower, BBPower_Color, bearPower, bbm, ema2, tema, ema12, ema3, ema1, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bbp <= -0.002317 )
		if( ema13 <= -0.006573 )
			if( bbp <= -0.018127 )
				if( ema3 <= 0.536027 )
					if( ema3 <= 0.525483 )
						if( ema3 <= 0.473934 )
							if( ema3 <= 0.435403 )
								if( bearPower <= -0.012623 )
									ret := 0.354651
								if( bearPower > -0.012623 )
									ret := 0.961538 // buy
							if( ema3 > 0.435403 )
								if( ema3 <= 0.46338 )
									ret := -0.088235
								if( ema3 > 0.46338 )
									ret := -0.657143
						if( ema3 > 0.473934 )
							if( ema3 <= 0.519253 )
								if( bbm <= 0.015764 )
									ret := 0.615385
								if( bbm > 0.015764 )
									ret := 0.968254 // buy
							if( ema3 > 0.519253 )
								if( ema13 <= -0.021398 )
									ret := -1.000000 // sell
								if( ema13 > -0.021398 )
									ret := 0.512821
					if( ema3 > 0.525483 )
						if( ema3 <= 0.53129 )
							if( ema1 <= 0.510084 )
								ret := 0.000000
							if( ema1 > 0.510084 )
								if( ema13 <= -0.011652 )
									ret := -0.945946 // sell
								if( ema13 > -0.011652 )
									ret := -0.363636
						if( ema3 > 0.53129 )
							if( ema1 <= 0.52154 )
								ret := 1.000000 // buy
							if( ema1 > 0.52154 )
								if( bbp <= -0.02133 )
									ret := -0.500000
								if( bbp > -0.02133 )
									ret := -1.000000 // sell
				if( ema3 > 0.536027 )
					if( bearPower <= -0.013501 )
						if( ema3 <= 0.747127 )
							if( ema12 <= -0.004605 )
								if( bullPower <= -0.008107 )
									ret := 0.592417
								if( bullPower > -0.008107 )
									ret := 0.829630 // buy
							if( ema12 > -0.004605 )
								if( bullPower <= -0.006608 )
									ret := -1.000000 // sell
								if( bullPower > -0.006608 )
									ret := 0.600000
						if( ema3 > 0.747127 )
							if( ema3 <= 0.784192 )
								if( bbm <= 0.01885 )
									ret := 0.210526
								if( bbm > 0.01885 )
									ret := -0.857143 // sell
							if( ema3 > 0.784192 )
								if( ema2 <= 0.803706 )
									ret := 1.000000 // buy
								if( ema2 > 0.803706 )
									ret := 0.200000
					if( bearPower > -0.013501 )
						if( bbp <= -0.020378 )
							if( bullPower <= -0.008244 )
								if( ema12 <= -0.007558 )
									ret := 1.000000 // buy
								if( ema12 > -0.007558 )
									ret := 0.000000
							if( bullPower > -0.008244 )
								if( ema13 <= -0.009027 )
									ret := -0.750000 // sell
								if( ema13 > -0.009027 )
									ret := -1.000000 // sell
						if( bbp > -0.020378 )
							if( ema2 <= 0.614352 )
								if( tema <= 0.596641 )
									ret := 0.410256
								if( tema > 0.596641 )
									ret := -1.000000 // sell
							if( ema2 > 0.614352 )
								if( ema12 <= -0.005354 )
									ret := 0.774194 // buy
								if( ema12 > -0.005354 )
									ret := 0.111111
			if( bbp > -0.018127 )
				if( ema2 <= 0.409996 )
					if( tema <= 0.376533 )
						if( ema1 <= 0.336268 )
							if( bbp <= -0.005779 )
								if( bullPower <= -0.004755 )
									ret := 0.470588
								if( bullPower > -0.004755 )
									ret := 0.875000 // buy
							if( bbp > -0.005779 )
								ret := -1.000000 // sell
						if( ema1 > 0.336268 )
							if( ema2 <= 0.36976 )
								if( ema3 <= 0.366797 )
									ret := -0.067797
								if( ema3 > 0.366797 )
									ret := -0.806452 // sell
							if( ema2 > 0.36976 )
								if( ema13 <= -0.00867 )
									ret := 0.944444 // buy
								if( ema13 > -0.00867 )
									ret := -0.058824
					if( tema > 0.376533 )
						if( ema13 <= -0.007032 )
							if( ema13 <= -0.008647 )
								if( ema12 <= -0.004468 )
									ret := 1.000000 // buy
								if( ema12 > -0.004468 )
									ret := 0.250000
							if( ema13 > -0.008647 )
								if( ema2 <= 0.397361 )
									ret := 0.875000 // buy
								if( ema2 > 0.397361 )
									ret := 1.000000 // buy
						if( ema13 > -0.007032 )
							if( ema3 <= 0.391458 )
								ret := 1.000000 // buy
							if( ema3 > 0.391458 )
								if( tema <= 0.38826 )
									ret := -0.166667
								if( tema > 0.38826 )
									ret := 0.900000 // buy
				if( ema2 > 0.409996 )
					if( tema <= 0.427649 )
						if( ema3 <= 0.43112 )
							if( tema <= 0.406913 )
								if( tema <= 0.403103 )
									ret := 0.250000
								if( tema > 0.403103 )
									ret := -0.875000 // sell
							if( tema > 0.406913 )
								if( bbp <= -0.013465 )
									ret := 0.000000
								if( bbp > -0.013465 )
									ret := 0.705882 // buy
						if( ema3 > 0.43112 )
							if( ema13 <= -0.007362 )
								if( bbp <= -0.01043 )
									ret := -0.930233 // sell
								if( bbp > -0.01043 )
									ret := -0.500000
							if( ema13 > -0.007362 )
								ret := -0.333333
					if( tema > 0.427649 )
						if( ema3 <= 0.726645 )
							if( ema1 <= 0.688175 )
								if( ema2 <= 0.640355 )
									ret := 0.165041
								if( ema2 > 0.640355 )
									ret := 0.575472
							if( ema1 > 0.688175 )
								if( tema <= 0.689345 )
									ret := -0.882353 // sell
								if( tema > 0.689345 )
									ret := -0.160000
						if( ema3 > 0.726645 )
							if( tema <= 0.810917 )
								if( ema1 <= 0.771486 )
									ret := 0.909091 // buy
								if( ema1 > 0.771486 )
									ret := 0.541667
							if( tema > 0.810917 )
								ret := -0.600000
		if( ema13 > -0.006573 )
			if( tema <= 0.611687 )
				if( bbm <= 0.002505 )
					if( ema2 <= 0.326976 )
						if( ema1 <= 0.32406 )
							if( ema13 <= -0.003058 )
								if( bbp <= -0.008468 )
									ret := -0.857143 // sell
								if( bbp > -0.008468 )
									ret := 0.608696
							if( ema13 > -0.003058 )
								if( bbm <= 0.002271 )
									ret := 0.206573
								if( bbm > 0.002271 )
									ret := -0.282609
						if( ema1 > 0.32406 )
							if( bearPower <= -0.003362 )
								if( bullPower <= -0.001951 )
									ret := 0.400000
								if( bullPower > -0.001951 )
									ret := 0.000000
							if( bearPower > -0.003362 )
								if( ema13 <= -0.002562 )
									ret := -0.250000
								if( ema13 > -0.002562 )
									ret := 0.887324 // buy
					if( ema2 > 0.326976 )
						if( ema2 <= 0.509025 )
							if( tema <= 0.34799 )
								if( ema1 <= 0.348072 )
									ret := 0.030864
								if( ema1 > 0.348072 )
									ret := -0.659574
							if( tema > 0.34799 )
								if( tema <= 0.355972 )
									ret := 0.422053
								if( tema > 0.355972 )
									ret := 0.131746
						if( ema2 > 0.509025 )
							if( ema2 <= 0.51071 )
								if( ema1 <= 0.50814 )
									ret := 0.105263
								if( ema1 > 0.50814 )
									ret := -0.528302
							if( ema2 > 0.51071 )
								if( bearPower <= -0.001944 )
									ret := 0.071357
								if( bearPower > -0.001944 )
									ret := -0.125899
				if( bbm > 0.002505 )
					if( ema2 <= 0.615079 )
						if( bullPower <= -0.006869 )
							if( ema3 <= 0.498655 )
								if( ema12 <= -0.004035 )
									ret := -0.058824
								if( ema12 > -0.004035 )
									ret := 0.750000 // buy
							if( ema3 > 0.498655 )
								if( bearPower <= -0.017338 )
									ret := -1.000000 // sell
								if( bearPower > -0.017338 )
									ret := -0.423077
						if( bullPower > -0.006869 )
							if( ema3 <= 0.52447 )
								if( tema <= 0.512011 )
									ret := 0.193086
								if( tema > 0.512011 )
									ret := 0.439024
							if( ema3 > 0.52447 )
								if( ema3 <= 0.540647 )
									ret := -0.019108
								if( ema3 > 0.540647 )
									ret := 0.178789
					if( ema2 > 0.615079 )
						if( ema3 <= 0.61653 )
							ret := -0.666667
						if( ema3 > 0.61653 )
							if( bullPower <= -0.002955 )
								if( bearPower <= -0.00674 )
									ret := 0.972973 // buy
								if( bearPower > -0.00674 )
									ret := 0.750000 // buy
							if( bullPower > -0.002955 )
								if( ema13 <= -0.004978 )
									ret := -0.178571
								if( ema13 > -0.004978 )
									ret := 0.714286 // buy
			if( tema > 0.611687 )
				if( ema2 <= 0.683382 )
					if( ema3 <= 0.66095 )
						if( ema2 <= 0.658977 )
							if( ema1 <= 0.65381 )
								if( ema2 <= 0.649156 )
									ret := -0.067797
								if( ema2 > 0.649156 )
									ret := 0.327957
							if( ema1 > 0.65381 )
								if( bullPower <= -0.001998 )
									ret := -0.166667
								if( bullPower > -0.001998 )
									ret := -0.775862 // sell
						if( ema2 > 0.658977 )
							if( ema3 <= 0.660709 )
								if( bbm <= 0.002608 )
									ret := 0.600000
								if( bbm > 0.002608 )
									ret := 1.000000 // buy
							if( ema3 > 0.660709 )
								ret := 0.400000
					if( ema3 > 0.66095 )
						if( bullPower <= -0.005029 )
							if( ema13 <= -0.005685 )
								ret := 0.500000
							if( ema13 > -0.005685 )
								ret := 1.000000 // buy
						if( bullPower > -0.005029 )
							if( bearPower <= -0.004207 )
								if( bullPower <= -0.002035 )
									ret := -0.405405
								if( bullPower > -0.002035 )
									ret := -0.762500 // sell
							if( bearPower > -0.004207 )
								if( ema13 <= -0.00083 )
									ret := -0.013333
								if( ema13 > -0.00083 )
									ret := -0.558140
				if( ema2 > 0.683382 )
					if( bbp <= -0.00281 )
						if( ema1 <= 0.714845 )
							if( tema <= 0.710687 )
								if( ema12 <= -0.002268 )
									ret := 0.449275
								if( ema12 > -0.002268 )
									ret := 0.102941
							if( tema > 0.710687 )
								if( ema12 <= -0.00179 )
									ret := 0.166667
								if( ema12 > -0.00179 )
									ret := 0.944444 // buy
						if( ema1 > 0.714845 )
							if( ema2 <= 0.718019 )
								if( ema3 <= 0.716262 )
									ret := -0.838710 // sell
								if( ema3 > 0.716262 )
									ret := -0.275862
							if( ema2 > 0.718019 )
								if( ema3 <= 0.722521 )
									ret := 0.649123
								if( ema3 > 0.722521 )
									ret := -0.032070
					if( bbp > -0.00281 )
						if( ema1 <= 0.683853 )
							ret := 1.000000 // buy
						if( ema1 > 0.683853 )
							if( bbm <= 0.002806 )
								if( tema <= 0.697868 )
									ret := 0.125000
								if( tema > 0.697868 )
									ret := -0.357143
							if( bbm > 0.002806 )
								if( bullPower <= 0.001325 )
									ret := -0.780488 // sell
								if( bullPower > 0.001325 )
									ret := -0.222222
	if( bbp > -0.002317 )
		if( ema1 <= 0.621385 )
			if( ema12 <= 0.003706 )
				if( ema1 <= 0.334968 )
					if( ema12 <= 0.00046 )
						if( bullPower <= 0.001364 )
							if( ema13 <= 0.000412 )
								if( ema2 <= 0.312778 )
									ret := 0.386207
								if( ema2 > 0.312778 )
									ret := 0.026697
							if( ema13 > 0.000412 )
								if( ema3 <= 0.317056 )
									ret := -0.136364
								if( ema3 > 0.317056 )
									ret := 0.396624
						if( bullPower > 0.001364 )
							if( tema <= 0.306394 )
								if( tema <= 0.303234 )
									ret := 0.400000
								if( tema > 0.303234 )
									ret := 1.000000 // buy
							if( tema > 0.306394 )
								if( ema1 <= 0.312003 )
									ret := -0.710526 // sell
								if( ema1 > 0.312003 )
									ret := -0.117143
					if( ema12 > 0.00046 )
						if( ema13 <= 0.00449 )
							if( tema <= 0.31745 )
								if( tema <= 0.314914 )
									ret := 0.297297
								if( tema > 0.314914 )
									ret := 0.776699 // buy
							if( tema > 0.31745 )
								if( ema12 <= 0.001006 )
									ret := 0.100733
								if( ema12 > 0.001006 )
									ret := 0.316957
						if( ema13 > 0.00449 )
							if( ema12 <= 0.003432 )
								if( ema1 <= 0.324525 )
									ret := -0.851852 // sell
								if( ema1 > 0.324525 )
									ret := -0.185185
							if( ema12 > 0.003432 )
								ret := 0.600000
				if( ema1 > 0.334968 )
					if( bbm <= 0.0013 )
						if( bbp <= 0.003014 )
							if( ema3 <= 0.335414 )
								if( ema2 <= 0.335275 )
									ret := -0.054054
								if( ema2 > 0.335275 )
									ret := -0.589744
							if( ema3 > 0.335414 )
								if( ema2 <= 0.336603 )
									ret := 0.320000
								if( ema2 > 0.336603 )
									ret := -0.015316
						if( bbp > 0.003014 )
							if( ema2 <= 0.383512 )
								if( tema <= 0.338507 )
									ret := -0.818182 // sell
								if( tema > 0.338507 )
									ret := 0.261965
							if( ema2 > 0.383512 )
								if( ema2 <= 0.385123 )
									ret := -0.590909
								if( ema2 > 0.385123 )
									ret := 0.029851
					if( bbm > 0.0013 )
						if( ema13 <= -0.002404 )
							if( ema12 <= -0.003053 )
								if( bbm <= 0.0141 )
									ret := -0.687500
								if( bbm > 0.0141 )
									ret := -1.000000 // sell
							if( ema12 > -0.003053 )
								if( ema3 <= 0.60723 )
									ret := 0.237733
								if( ema3 > 0.60723 )
									ret := -0.186667
						if( ema13 > -0.002404 )
							if( ema1 <= 0.613076 )
								if( ema2 <= 0.529001 )
									ret := 0.043372
								if( ema2 > 0.529001 )
									ret := -0.006775
							if( ema1 > 0.613076 )
								if( ema13 <= 0.000903 )
									ret := -0.008427
								if( ema13 > 0.000903 )
									ret := 0.288199
			if( ema12 > 0.003706 )
				if( tema <= 0.620082 )
					if( bbp <= 0.00734 )
						if( ema3 <= 0.535339 )
							if( bullPower <= 0.005376 )
								if( bullPower <= 0.004891 )
									ret := -0.321429
								if( bullPower > 0.004891 )
									ret := 0.357143
							if( bullPower > 0.005376 )
								if( ema13 <= 0.009029 )
									ret := -1.000000 // sell
								if( ema13 > 0.009029 )
									ret := -0.388889
						if( ema3 > 0.535339 )
							if( ema13 <= 0.008264 )
								if( bbm <= 0.0056 )
									ret := -0.250000
								if( bbm > 0.0056 )
									ret := -0.500000
							if( ema13 > 0.008264 )
								if( bullPower <= 0.004014 )
									ret := -0.500000
								if( bullPower > 0.004014 )
									ret := -0.970588 // sell
					if( bbp > 0.00734 )
						if( bbm <= 0.008759 )
							if( bearPower <= 0.011812 )
								if( ema13 <= 0.016909 )
									ret := -0.150761
								if( ema13 > 0.016909 )
									ret := 0.500000
							if( bearPower > 0.011812 )
								if( ema13 <= 0.012798 )
									ret := 0.200000
								if( ema13 > 0.012798 )
									ret := 0.675676
						if( bbm > 0.008759 )
							if( tema <= 0.485273 )
								if( ema3 <= 0.432326 )
									ret := -0.271739
								if( ema3 > 0.432326 )
									ret := 0.571429
							if( tema > 0.485273 )
								if( ema12 <= 0.004172 )
									ret := 0.285714
								if( ema12 > 0.004172 )
									ret := -0.560484
				if( tema > 0.620082 )
					if( tema <= 0.633725 )
						if( ema12 <= 0.004348 )
							if( bbp <= 0.015451 )
								ret := -0.500000
							if( bbp > 0.015451 )
								ret := 0.000000
						if( ema12 > 0.004348 )
							if( ema3 <= 0.601841 )
								if( bullPower <= 0.019348 )
									ret := -1.000000 // sell
								if( bullPower > 0.019348 )
									ret := 0.687500
							if( ema3 > 0.601841 )
								if( tema <= 0.629926 )
									ret := 0.909091 // buy
								if( tema > 0.629926 )
									ret := 0.250000
					if( tema > 0.633725 )
						if( bearPower <= 0.037931 )
							ret := -1.000000 // sell
						if( bearPower > 0.037931 )
							ret := 0.000000
		if( ema1 > 0.621385 )
			if( bearPower <= 0.002506 )
				if( ema3 <= 0.622289 )
					if( ema12 <= 0.002012 )
						if( bullPower <= 0.007471 )
							if( bbm <= 0.003825 )
								if( bbm <= 0.002616 )
									ret := -0.338889
								if( bbm > 0.002616 )
									ret := 0.013514
							if( bbm > 0.003825 )
								if( bbm <= 0.00635 )
									ret := -0.661017
								if( bbm > 0.00635 )
									ret := 0.250000
						if( bullPower > 0.007471 )
							ret := 1.000000 // buy
					if( ema12 > 0.002012 )
						if( ema1 <= 0.625246 )
							if( ema13 <= 0.006518 )
								if( ema12 <= 0.002359 )
									ret := 0.090909
								if( ema12 > 0.002359 )
									ret := 0.708333 // buy
							if( ema13 > 0.006518 )
								ret := -0.750000 // sell
						if( ema1 > 0.625246 )
							if( tema <= 0.627685 )
								ret := 0.428571
							if( tema > 0.627685 )
								if( bbp <= 0.006767 )
									ret := -0.941176 // sell
								if( bbp > 0.006767 )
									ret := -0.444444
				if( ema3 > 0.622289 )
					if( ema3 <= 0.660759 )
						if( ema3 <= 0.648887 )
							if( tema <= 0.652082 )
								if( ema2 <= 0.639595 )
									ret := -0.041833
								if( ema2 > 0.639595 )
									ret := 0.146382
							if( tema > 0.652082 )
								if( ema12 <= 0.002749 )
									ret := -0.833333 // sell
								if( ema12 > 0.002749 )
									ret := 0.076923
						if( ema3 > 0.648887 )
							if( ema12 <= 0.002324 )
								if( bullPower <= 0.009405 )
									ret := 0.390887
								if( bullPower > 0.009405 )
									ret := -0.875000 // sell
							if( ema12 > 0.002324 )
								if( ema3 <= 0.652349 )
									ret := 0.454545
								if( ema3 > 0.652349 )
									ret := -0.718750 // sell
					if( ema3 > 0.660759 )
						if( ema3 <= 0.665151 )
							if( ema2 <= 0.663533 )
								if( ema3 <= 0.661236 )
									ret := -0.600000
								if( ema3 > 0.661236 )
									ret := 0.000000
							if( ema2 > 0.663533 )
								if( ema3 <= 0.663985 )
									ret := -0.860000 // sell
								if( ema3 > 0.663985 )
									ret := -0.384615
						if( ema3 > 0.665151 )
							if( ema1 <= 0.82998 )
								if( bullPower <= 0.018594 )
									ret := -0.066334
								if( bullPower > 0.018594 )
									ret := -0.823529 // sell
							if( ema1 > 0.82998 )
								if( bearPower <= -0.003981 )
									ret := -0.500000
								if( bearPower > -0.003981 )
									ret := -0.941176 // sell
			if( bearPower > 0.002506 )
				if( ema3 <= 0.609181 )
					if( ema2 <= 0.614489 )
						ret := 1.000000 // buy
					if( ema2 > 0.614489 )
						ret := 0.571429
				if( ema3 > 0.609181 )
					if( ema2 <= 0.62431 )
						if( ema1 <= 0.623157 )
							if( ema2 <= 0.617811 )
								ret := -1.000000 // sell
							if( ema2 > 0.617811 )
								if( ema12 <= 0.001816 )
									ret := -0.800000 // sell
								if( ema12 > 0.001816 )
									ret := 0.473684
						if( ema1 > 0.623157 )
							if( ema3 <= 0.621093 )
								if( bbm <= 0.01875 )
									ret := -0.851852 // sell
								if( bbm > 0.01875 )
									ret := -0.250000
							if( ema3 > 0.621093 )
								if( ema2 <= 0.623501 )
									ret := 0.000000
								if( ema2 > 0.623501 )
									ret := -0.777778 // sell
					if( ema2 > 0.62431 )
						if( ema2 <= 0.628126 )
							if( ema1 <= 0.630269 )
								if( bbp <= 0.010857 )
									ret := 0.230769
								if( bbp > 0.010857 )
									ret := -0.875000 // sell
							if( ema1 > 0.630269 )
								if( bullPower <= 0.01442 )
									ret := 0.880000 // buy
								if( bullPower > 0.01442 )
									ret := -0.300000
						if( ema2 > 0.628126 )
							if( ema2 <= 0.799218 )
								if( ema2 <= 0.630294 )
									ret := -0.860465 // sell
								if( ema2 > 0.630294 )
									ret := -0.333333
							if( ema2 > 0.799218 )
								if( ema1 <= 0.827123 )
									ret := 0.863636 // buy
								if( ema1 > 0.827123 )
									ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_XRPUSDT_15Min_f5b884f4(bbp, bullPower, BBPower_Color, bearPower, bbm, ema2, tema, ema12, ema3, ema1, ema13)

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


