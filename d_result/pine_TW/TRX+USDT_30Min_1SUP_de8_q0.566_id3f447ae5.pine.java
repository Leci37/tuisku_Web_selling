//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: SuperTrend
// ID_model: TRXUSDT_30Min_1SUP_3f447ae5 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_30Min_1SUP_3f447ae5", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_30Min_3f447ae5(dn, atr, buySignalInt, up1, dn1, up, trend, atr2, sellSignalInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( up <= 0.062577 )
		if( atr2 <= 0.000267 )
			if( up1 <= 0.025963 )
				if( atr2 <= 0.000188 )
					if( dn <= 0.024473 )
						if( atr <= 0.000124 )
							if( atr2 <= 0.000112 )
								ret := 0.800000 // buy
							if( atr2 > 0.000112 )
								ret := 0.000000
						if( atr > 0.000124 )
							if( atr <= 0.00018 )
								if( dn <= 0.024335 )
									ret := 1.000000 // buy
								if( dn > 0.024335 )
									ret := 0.727273 // buy
							if( atr > 0.00018 )
								ret := 0.500000
					if( dn > 0.024473 )
						if( dn1 <= 0.025088 )
							if( dn1 <= 0.024589 )
								if( atr <= 0.000112 )
									ret := -0.250000
								if( atr > 0.000112 )
									ret := 0.071429
							if( dn1 > 0.024589 )
								if( atr2 <= 0.000154 )
									ret := -0.679487
								if( atr2 > 0.000154 )
									ret := -0.250000
						if( dn1 > 0.025088 )
							if( dn1 <= 0.025453 )
								if( up1 <= 0.024579 )
									ret := 0.620370
								if( up1 > 0.024579 )
									ret := 0.242188
							if( dn1 > 0.025453 )
								if( dn <= 0.025653 )
									ret := -0.121849
								if( dn > 0.025653 )
									ret := 0.150096
				if( atr2 > 0.000188 )
					if( dn1 <= 0.027211 )
						if( up1 <= 0.025702 )
							if( dn <= 0.025715 )
								if( atr <= 0.000271 )
									ret := 0.624242
								if( atr > 0.000271 )
									ret := -0.666667
							if( dn > 0.025715 )
								if( dn1 <= 0.025991 )
									ret := -0.431818
								if( dn1 > 0.025991 )
									ret := 0.406940
						if( up1 > 0.025702 )
							if( atr <= 0.00016 )
								ret := 1.000000 // buy
							if( atr > 0.00016 )
								if( atr <= 0.000202 )
									ret := -0.032258
								if( atr > 0.000202 )
									ret := -0.392857
					if( dn1 > 0.027211 )
						if( atr <= 0.000262 )
							if( dn1 <= 0.027428 )
								if( dn <= 0.02735 )
									ret := 1.000000 // buy
								if( dn > 0.02735 )
									ret := 0.923077 // buy
							if( dn1 > 0.027428 )
								ret := 0.750000 // buy
						if( atr > 0.000262 )
							if( up <= 0.025862 )
								ret := 1.000000 // buy
							if( up > 0.025862 )
								if( dn <= 0.02737 )
									ret := 0.750000 // buy
								if( dn > 0.02737 )
									ret := -0.625000
			if( up1 > 0.025963 )
				if( up1 <= 0.054099 )
					if( atr <= 0.000134 )
						if( atr2 <= 0.000118 )
							if( up <= 0.028929 )
								if( up <= 0.02615 )
									ret := 0.739130 // buy
								if( up > 0.02615 )
									ret := 0.000000
							if( up > 0.028929 )
								if( up <= 0.053092 )
									ret := -0.768293 // sell
								if( up > 0.053092 )
									ret := 0.014085
						if( atr2 > 0.000118 )
							if( dn1 <= 0.027281 )
								if( atr2 <= 0.000136 )
									ret := -0.666667
								if( atr2 > 0.000136 )
									ret := 0.000000
							if( dn1 > 0.027281 )
								if( atr <= 0.000123 )
									ret := -0.401961
								if( atr > 0.000123 )
									ret := -0.107438
					if( atr > 0.000134 )
						if( up <= 0.053604 )
							if( up1 <= 0.028421 )
								if( up <= 0.026527 )
									ret := 0.055470
								if( up > 0.026527 )
									ret := -0.170652
							if( up1 > 0.028421 )
								if( dn <= 0.029802 )
									ret := 0.563107
								if( dn > 0.029802 )
									ret := 0.022914
						if( up > 0.053604 )
							if( dn1 <= 0.055353 )
								if( up <= 0.053613 )
									ret := -1.000000 // sell
								if( up > 0.053613 )
									ret := -0.202247
							if( dn1 > 0.055353 )
								if( up <= 0.053949 )
									ret := -0.500000
								if( up > 0.053949 )
									ret := -0.947368 // sell
				if( up1 > 0.054099 )
					if( dn1 <= 0.062724 )
						if( atr <= 0.00018 )
							if( up <= 0.061312 )
								if( dn <= 0.061926 )
									ret := 0.003571
								if( dn > 0.061926 )
									ret := -0.294118
							if( up > 0.061312 )
								if( dn1 <= 0.06243 )
									ret := 0.524390
								if( dn1 > 0.06243 )
									ret := -0.020408
						if( atr > 0.00018 )
							if( up1 <= 0.058082 )
								if( up1 <= 0.056224 )
									ret := 0.148305
								if( up1 > 0.056224 )
									ret := 0.620690
							if( up1 > 0.058082 )
								if( dn <= 0.0626 )
									ret := 0.099402
								if( dn > 0.0626 )
									ret := 0.464286
					if( dn1 > 0.062724 )
						if( dn1 <= 0.063729 )
							if( up1 <= 0.060972 )
								ret := 0.833333 // buy
							if( up1 > 0.060972 )
								if( dn <= 0.062773 )
									ret := -0.367521
								if( dn > 0.062773 )
									ret := -0.084635
						if( dn1 > 0.063729 )
							if( atr2 <= 0.000259 )
								if( atr2 <= 0.000205 )
									ret := 1.000000 // buy
								if( atr2 > 0.000205 )
									ret := 0.024691
							if( atr2 > 0.000259 )
								if( dn1 <= 0.063882 )
									ret := 1.000000 // buy
								if( dn1 > 0.063882 )
									ret := 0.545455
		if( atr2 > 0.000267 )
			if( dn1 <= 0.03083 )
				if( atr <= 0.000385 )
					if( atr2 <= 0.000334 )
						if( atr <= 0.000303 )
							if( up1 <= 0.027137 )
								if( up <= 0.026852 )
									ret := 0.101604
								if( up > 0.026852 )
									ret := -0.600000
							if( up1 > 0.027137 )
								if( up1 <= 0.027882 )
									ret := 0.560345
								if( up1 > 0.027882 )
									ret := 0.149758
						if( atr > 0.000303 )
							if( dn1 <= 0.030538 )
								if( dn1 <= 0.028605 )
									ret := 0.625850
								if( dn1 > 0.028605 )
									ret := 0.245455
							if( dn1 > 0.030538 )
								if( dn <= 0.03079 )
									ret := 0.824561 // buy
								if( dn > 0.03079 )
									ret := 0.000000
					if( atr2 > 0.000334 )
						if( dn <= 0.029253 )
							if( dn <= 0.028272 )
								if( dn1 <= 0.028223 )
									ret := -0.188976
								if( dn1 > 0.028223 )
									ret := 0.818182 // buy
							if( dn > 0.028272 )
								if( atr2 <= 0.000385 )
									ret := -0.563830
								if( atr2 > 0.000385 )
									ret := 0.200000
						if( dn > 0.029253 )
							if( atr <= 0.000353 )
								if( dn1 <= 0.029547 )
									ret := 0.692308
								if( dn1 > 0.029547 )
									ret := -0.457143
							if( atr > 0.000353 )
								if( up <= 0.028056 )
									ret := 0.765625 // buy
								if( up > 0.028056 )
									ret := 0.111111
				if( atr > 0.000385 )
					if( atr <= 0.000498 )
						if( dn1 <= 0.029093 )
							if( dn1 <= 0.028738 )
								if( atr <= 0.000408 )
									ret := 0.166667
								if( atr > 0.000408 )
									ret := 0.710145 // buy
							if( dn1 > 0.028738 )
								if( atr2 <= 0.000441 )
									ret := -0.647059
								if( atr2 > 0.000441 )
									ret := 0.400000
						if( dn1 > 0.029093 )
							if( dn <= 0.030029 )
								if( up1 <= 0.02691 )
									ret := 0.955224 // buy
								if( up1 > 0.02691 )
									ret := 0.664336
							if( dn > 0.030029 )
								if( up <= 0.027818 )
									ret := -0.535714
								if( up > 0.027818 )
									ret := 0.727273 // buy
					if( atr > 0.000498 )
						if( up1 <= 0.026892 )
							if( up <= 0.025249 )
								if( up <= 0.024245 )
									ret := 0.466667
								if( up > 0.024245 )
									ret := -0.800000 // sell
							if( up > 0.025249 )
								if( up <= 0.027025 )
									ret := 0.808511 // buy
								if( up > 0.027025 )
									ret := 0.000000
						if( up1 > 0.026892 )
							if( dn1 <= 0.030776 )
								if( atr2 <= 0.000534 )
									ret := -0.037037
								if( atr2 > 0.000534 )
									ret := -0.871795 // sell
							if( dn1 > 0.030776 )
								ret := 0.714286 // buy
			if( dn1 > 0.03083 )
				if( up <= 0.034985 )
					if( up <= 0.026285 )
						if( dn <= 0.03202 )
							if( up1 <= 0.025242 )
								if( atr2 <= 0.001111 )
									ret := 0.000000
								if( atr2 > 0.001111 )
									ret := 1.000000 // buy
							if( up1 > 0.025242 )
								if( dn <= 0.031167 )
									ret := 1.000000 // buy
								if( dn > 0.031167 )
									ret := 0.857143 // buy
						if( dn > 0.03202 )
							if( up <= 0.025575 )
								ret := 0.666667
							if( up > 0.025575 )
								if( dn <= 0.032992 )
									ret := 0.000000
								if( dn > 0.032992 )
									ret := -0.750000 // sell
					if( up > 0.026285 )
						if( up1 <= 0.033208 )
							if( dn <= 0.039452 )
								if( dn <= 0.036209 )
									ret := -0.041379
								if( dn > 0.036209 )
									ret := 0.238889
							if( dn > 0.039452 )
								if( dn <= 0.04606 )
									ret := -0.725490 // sell
								if( dn > 0.04606 )
									ret := 0.000000
						if( up1 > 0.033208 )
							if( dn1 <= 0.037227 )
								if( dn <= 0.036465 )
									ret := -0.265306
								if( dn > 0.036465 )
									ret := 0.636364
							if( dn1 > 0.037227 )
								if( atr2 <= 0.002198 )
									ret := -0.699301
								if( atr2 > 0.002198 )
									ret := 1.000000 // buy
				if( up > 0.034985 )
					if( up <= 0.049895 )
						if( dn <= 0.056272 )
							if( dn <= 0.053605 )
								if( atr2 <= 0.000507 )
									ret := 0.468869
								if( atr2 > 0.000507 )
									ret := 0.232659
							if( dn > 0.053605 )
								if( atr <= 0.001424 )
									ret := -0.328431
								if( atr > 0.001424 )
									ret := 0.406593
						if( dn > 0.056272 )
							if( dn1 <= 0.058349 )
								if( dn1 <= 0.05641 )
									ret := 0.750000 // buy
								if( dn1 > 0.05641 )
									ret := 0.972973 // buy
							if( dn1 > 0.058349 )
								if( dn1 <= 0.059653 )
									ret := -0.125000
								if( dn1 > 0.059653 )
									ret := 0.952381 // buy
					if( up > 0.049895 )
						if( up1 <= 0.050467 )
							if( atr2 <= 0.00041 )
								if( dn <= 0.05216 )
									ret := -0.119565
								if( dn > 0.05216 )
									ret := -0.706897 // sell
							if( atr2 > 0.00041 )
								if( dn1 <= 0.053768 )
									ret := 0.482143
								if( dn1 > 0.053768 )
									ret := -0.177885
						if( up1 > 0.050467 )
							if( atr <= 0.000746 )
								if( atr <= 0.000355 )
									ret := 0.054526
								if( atr > 0.000355 )
									ret := 0.215734
							if( atr > 0.000746 )
								if( up <= 0.05511 )
									ret := 0.198598
								if( up > 0.05511 )
									ret := -0.051762
	if( up > 0.062577 )
		if( atr2 <= 0.000561 )
			if( atr2 <= 0.000331 )
				if( up <= 0.062597 )
					if( dn <= 0.063956 )
						if( up1 <= 0.062566 )
							ret := -0.400000
						if( up1 > 0.062566 )
							ret := 0.142857
					if( dn > 0.063956 )
						if( up1 <= 0.062533 )
							ret := -0.600000
						if( up1 > 0.062533 )
							if( dn1 <= 0.064256 )
								ret := -1.000000 // sell
							if( dn1 > 0.064256 )
								ret := -0.666667
				if( up > 0.062597 )
					if( dn1 <= 0.06811 )
						if( up1 <= 0.065299 )
							if( atr2 <= 0.000184 )
								if( up1 <= 0.063016 )
									ret := -0.029412
								if( up1 > 0.063016 )
									ret := 0.390110
							if( atr2 > 0.000184 )
								if( atr <= 0.000276 )
									ret := -0.108088
								if( atr > 0.000276 )
									ret := 0.014085
						if( up1 > 0.065299 )
							if( dn <= 0.06693 )
								if( up <= 0.06542 )
									ret := -0.260274
								if( up > 0.06542 )
									ret := -0.017241
							if( dn > 0.06693 )
								if( up1 <= 0.065834 )
									ret := -0.370370
								if( up1 > 0.065834 )
									ret := -0.136767
					if( dn1 > 0.06811 )
						if( up1 <= 0.076277 )
							if( dn <= 0.077426 )
								if( dn1 <= 0.068455 )
									ret := 0.303867
								if( dn1 > 0.068455 )
									ret := 0.000000
							if( dn > 0.077426 )
								if( dn <= 0.077781 )
									ret := 0.335714
								if( dn > 0.077781 )
									ret := 0.666667
						if( up1 > 0.076277 )
							if( dn <= 0.086859 )
								if( atr <= 0.000194 )
									ret := -0.014717
								if( atr > 0.000194 )
									ret := -0.118961
							if( dn > 0.086859 )
								if( up <= 0.08692 )
									ret := 0.333333
								if( up > 0.08692 )
									ret := -0.025537
			if( atr2 > 0.000331 )
				if( dn <= 0.070187 )
					if( atr2 <= 0.000449 )
						if( dn1 <= 0.069545 )
							if( up1 <= 0.067172 )
								if( dn <= 0.065098 )
									ret := 0.320690
								if( dn > 0.065098 )
									ret := 0.140203
							if( up1 > 0.067172 )
								if( atr <= 0.000343 )
									ret := -0.111111
								if( atr > 0.000343 )
									ret := -0.722222 // sell
						if( dn1 > 0.069545 )
							if( dn <= 0.06953 )
								if( dn <= 0.069229 )
									ret := 1.000000 // buy
								if( dn > 0.069229 )
									ret := -0.242424
							if( dn > 0.06953 )
								if( up <= 0.067463 )
									ret := 0.606742
								if( up > 0.067463 )
									ret := 0.282158
					if( atr2 > 0.000449 )
						if( up <= 0.066657 )
							if( up1 <= 0.066357 )
								if( dn <= 0.069319 )
									ret := -0.040256
								if( dn > 0.069319 )
									ret := 0.543478
							if( up1 > 0.066357 )
								if( up1 <= 0.066621 )
									ret := -0.769231 // sell
								if( up1 > 0.066621 )
									ret := 0.000000
						if( up > 0.066657 )
							if( dn1 <= 0.069736 )
								if( up <= 0.066819 )
									ret := 0.868421 // buy
								if( up > 0.066819 )
									ret := 0.312500
							if( dn1 > 0.069736 )
								if( dn <= 0.070041 )
									ret := -0.062500
								if( dn > 0.070041 )
									ret := 0.416667
				if( dn > 0.070187 )
					if( up1 <= 0.068066 )
						if( up <= 0.068249 )
							if( atr2 <= 0.000466 )
								if( atr <= 0.000441 )
									ret := -0.210526
								if( atr > 0.000441 )
									ret := -0.779661 // sell
							if( atr2 > 0.000466 )
								if( atr <= 0.000478 )
									ret := 0.264706
								if( atr > 0.000478 )
									ret := -0.321918
						if( up > 0.068249 )
							if( up1 <= 0.067973 )
								if( atr2 <= 0.000469 )
									ret := 0.500000
								if( atr2 > 0.000469 )
									ret := 1.000000 // buy
							if( up1 > 0.067973 )
								ret := 0.142857
					if( up1 > 0.068066 )
						if( up <= 0.069298 )
							if( dn1 <= 0.071725 )
								if( dn <= 0.070351 )
									ret := -0.392157
								if( dn > 0.070351 )
									ret := 0.093817
							if( dn1 > 0.071725 )
								if( dn1 <= 0.072159 )
									ret := 0.609756
								if( dn1 > 0.072159 )
									ret := 0.100000
						if( up > 0.069298 )
							if( dn1 <= 0.072635 )
								if( up <= 0.070054 )
									ret := -0.300283
								if( up > 0.070054 )
									ret := -0.721311 // sell
							if( dn1 > 0.072635 )
								if( buySignalInt <= 0.5 )
									ret := -0.006679
								if( buySignalInt > 0.5 )
									ret := -0.444444
		if( atr2 > 0.000561 )
			if( up <= 0.111004 )
				if( up1 <= 0.073038 )
					if( atr2 <= 0.002304 )
						if( up <= 0.069765 )
							if( up1 <= 0.063529 )
								if( up <= 0.063281 )
									ret := 0.000000
								if( up > 0.063281 )
									ret := -0.288591
							if( up1 > 0.063529 )
								if( dn <= 0.06984 )
									ret := 0.247475
								if( dn > 0.06984 )
									ret := 0.077573
						if( up > 0.069765 )
							if( atr <= 0.001183 )
								if( atr2 <= 0.000911 )
									ret := -0.023515
								if( atr2 > 0.000911 )
									ret := -0.470199
							if( atr > 0.001183 )
								if( up <= 0.072591 )
									ret := 0.355311
								if( up > 0.072591 )
									ret := -0.428571
					if( atr2 > 0.002304 )
						if( up1 <= 0.06952 )
							if( dn <= 0.085266 )
								if( atr <= 0.002882 )
									ret := -0.209302
								if( atr > 0.002882 )
									ret := -0.900000 // sell
							if( dn > 0.085266 )
								if( up <= 0.067441 )
									ret := 0.250000
								if( up > 0.067441 )
									ret := 0.900000 // buy
						if( up1 > 0.06952 )
							if( dn1 <= 0.087262 )
								ret := -1.000000 // sell
							if( dn1 > 0.087262 )
								if( dn <= 0.090416 )
									ret := -0.333333
								if( dn > 0.090416 )
									ret := -1.000000 // sell
				if( up1 > 0.073038 )
					if( dn <= 0.088213 )
						if( dn <= 0.086993 )
							if( up <= 0.078881 )
								if( dn <= 0.08626 )
									ret := 0.201439
								if( dn > 0.08626 )
									ret := 0.776119 // buy
							if( up > 0.078881 )
								if( up1 <= 0.079525 )
									ret := -0.223958
								if( up1 > 0.079525 )
									ret := 0.077941
						if( dn > 0.086993 )
							if( atr <= 0.000771 )
								if( atr2 <= 0.000813 )
									ret := 0.032520
								if( atr2 > 0.000813 )
									ret := 0.714286 // buy
							if( atr > 0.000771 )
								if( dn <= 0.087811 )
									ret := 0.417969
								if( dn > 0.087811 )
									ret := 0.689655
					if( dn > 0.088213 )
						if( up <= 0.085335 )
							if( dn1 <= 0.095813 )
								if( up <= 0.085293 )
									ret := -0.028626
								if( up > 0.085293 )
									ret := -0.920000 // sell
							if( dn1 > 0.095813 )
								if( up1 <= 0.084933 )
									ret := -0.554688
								if( up1 > 0.084933 )
									ret := 0.625000
						if( up > 0.085335 )
							if( atr <= 0.002092 )
								if( dn <= 0.095716 )
									ret := 0.200000
								if( dn > 0.095716 )
									ret := 0.044020
							if( atr > 0.002092 )
								if( atr2 <= 0.003285 )
									ret := 0.496503
								if( atr2 > 0.003285 )
									ret := 0.014760
			if( up > 0.111004 )
				if( atr <= 0.000852 )
					if( dn <= 0.129229 )
						if( dn1 <= 0.118801 )
							if( atr <= 0.000662 )
								if( dn1 <= 0.115826 )
									ret := -0.500000
								if( dn1 > 0.115826 )
									ret := -0.033333
							if( atr > 0.000662 )
								if( dn1 <= 0.117175 )
									ret := -0.375000
								if( dn1 > 0.117175 )
									ret := -0.875000 // sell
						if( dn1 > 0.118801 )
							if( dn1 <= 0.120612 )
								if( dn1 <= 0.119863 )
									ret := -0.090909
								if( dn1 > 0.119863 )
									ret := 0.647059
							if( dn1 > 0.120612 )
								if( up <= 0.12403 )
									ret := -0.013889
								if( up > 0.12403 )
									ret := -0.396226
					if( dn > 0.129229 )
						if( dn1 <= 0.167405 )
							if( up1 <= 0.1568 )
								if( atr <= 0.000679 )
									ret := 0.264516
								if( atr > 0.000679 )
									ret := 0.524444
							if( up1 > 0.1568 )
								if( atr <= 0.000796 )
									ret := -0.267327
								if( atr > 0.000796 )
									ret := 0.818182 // buy
						if( dn1 > 0.167405 )
							if( atr <= 0.000674 )
								ret := 0.666667
							if( atr > 0.000674 )
								ret := 1.000000 // buy
				if( atr > 0.000852 )
					if( atr <= 0.002024 )
						if( dn <= 0.126985 )
							if( dn <= 0.122791 )
								if( atr <= 0.001256 )
									ret := 0.109966
								if( atr > 0.001256 )
									ret := -0.312883
							if( dn > 0.122791 )
								if( dn1 <= 0.127453 )
									ret := 0.197895
								if( dn1 > 0.127453 )
									ret := 0.842105 // buy
						if( dn > 0.126985 )
							if( up <= 0.125199 )
								if( dn1 <= 0.131853 )
									ret := -0.287599
								if( dn1 > 0.131853 )
									ret := -0.766129 // sell
							if( up > 0.125199 )
								if( atr <= 0.001775 )
									ret := -0.046980
								if( atr > 0.001775 )
									ret := -0.513514
					if( atr > 0.002024 )
						if( up <= 0.158151 )
							if( atr2 <= 0.006685 )
								if( atr <= 0.004686 )
									ret := 0.037756
								if( atr > 0.004686 )
									ret := 0.484277
							if( atr2 > 0.006685 )
								if( dn <= 0.157791 )
									ret := -1.000000 // sell
								if( dn > 0.157791 )
									ret := -0.642857
						if( up > 0.158151 )
							if( up <= 0.158481 )
								ret := -0.750000 // sell
							if( up > 0.158481 )
								ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator SuperTrend 
//@version=5
//indicator title="Supertrend", overlay=true, format=format.price, precision=2, timeframe="")

Periods = input.int(title="ATR Period", defval=10)
src = input.source(hl2, title="Source")
Multiplier = input.float(title="ATR Multiplier", step=0.1, defval=3.0)
changeATR = input.bool(title="Change ATR Calculation Method?", defval=true)
showsignals = input.bool(title="Show Buy/Sell Signals?", defval=true)
highlighting = input.bool(title="Highlighter On/Off?", defval=true)

atr2 = ta.sma(ta.tr, Periods)
atr = changeATR ? ta.atr(Periods) : atr2

up = src - (Multiplier * atr)
up1 = nz(up[1], up)
up := close[1] > up1 ? math.max(up, up1) : up

dn = src + (Multiplier * atr)
dn1 = nz(dn[1], dn)
dn := close[1] < dn1 ? math.min(dn, dn1) : dn

var trend = 1
trend := nz(trend[1], trend)
trend := trend == -1 and close > dn1 ? 1 : trend == 1 and close < up1 ? -1 : trend

upPlot = plot(trend == 1 ? up : na, title="Up Trend", style=plot.style_linebr, linewidth=2, color=color.green)
dnPlot = plot(trend == 1 ? na : dn, title="Down Trend", style=plot.style_linebr, linewidth=2, color=color.red)

buySignal = trend == 1 and trend[1] == -1
sellSignal = trend == -1 and trend[1] == 1

plotshape(buySignal, title="UpTrend Begins", location=location.absolute, style=shape.circle, size=size.tiny, color=color.green, textcolor=color.white)
plotshape(sellSignal, title="DownTrend Begins", location=location.absolute, style=shape.circle, size=size.tiny, color=color.red, textcolor=color.white)

plotshape(showsignals and buySignal, title="Buy", text="Buy", location=location.absolute, style=shape.labelup, size=size.tiny, color=color.green, textcolor=color.white)
plotshape(showsignals and sellSignal, title="Sell", text="Sell", location=location.absolute, style=shape.labeldown, size=size.tiny, color=color.red, textcolor=color.white)

mPlot = plot(ohlc4, title="", style=plot.style_circles, linewidth=1)

longFillColor = highlighting ? (trend == 1 ? color.new(color.green, 80) : color.new(color.white, 100)) : color.new(color.white, 100)
shortFillColor = highlighting ? (trend == -1 ? color.new(color.red, 80) : color.new(color.white, 100)) : color.new(color.white, 100)

fill(mPlot, upPlot, title="UpTrend Highlighter", color=longFillColor)
fill(mPlot, dnPlot, title="DownTrend Highlighter", color=shortFillColor)

alertcondition(buySignal, title="SuperTrend Buy", message="SuperTrend Buy!")
alertcondition(sellSignal, title="SuperTrend Sell", message="SuperTrend Sell!")
changeCond = trend != trend[1]
alertcondition(changeCond, title="SuperTrend Direction Change", message="SuperTrend has changed direction!")

buySignalInt = buySignal ? 1: 0   //Bool to int
sellSignalInt = sellSignal ? 1: 0   //Bool to int

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
float op_operation = decision_tree_0_TRXUSDT_30Min_3f447ae5(dn, atr, buySignalInt, up1, dn1, up, trend, atr2, sellSignalInt)

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


