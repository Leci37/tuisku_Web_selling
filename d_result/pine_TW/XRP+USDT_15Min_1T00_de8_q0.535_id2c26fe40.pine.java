//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: XRPUSDT_15Min_1T00_2c26fe40 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XRPUSDT_15Min_1T00_2c26fe40", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XRPUSDT_15Min_2c26fe40(ema2, tema, ema12, ema3, ema1, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= -0.001067 )
		if( ema12 <= -0.00342 )
			if( ema2 <= 0.566375 )
				if( ema3 <= 0.526145 )
					if( ema13 <= -0.026149 )
						if( tema <= 0.444459 )
							ret := 1.000000 // buy
						if( tema > 0.444459 )
							if( ema2 <= 0.502872 )
								ret := 0.000000
							if( ema2 > 0.502872 )
								ret := 0.500000
					if( ema13 > -0.026149 )
						if( tema <= 0.403081 )
							if( ema13 <= -0.006676 )
								if( ema1 <= 0.381978 )
									ret := 0.304615
								if( ema1 > 0.381978 )
									ret := 0.686391
							if( ema13 > -0.006676 )
								if( ema3 <= 0.40609 )
									ret := 0.013072
								if( ema3 > 0.40609 )
									ret := 0.727273 // buy
						if( tema > 0.403081 )
							if( ema1 <= 0.446163 )
								if( ema2 <= 0.414852 )
									ret := -1.000000 // sell
								if( ema2 > 0.414852 )
									ret := -0.140426
							if( ema1 > 0.446163 )
								if( ema13 <= -0.022692 )
									ret := -0.619048
								if( ema13 > -0.022692 )
									ret := 0.285885
				if( ema3 > 0.526145 )
					if( ema3 <= 0.531628 )
						if( ema3 <= 0.526695 )
							if( ema2 <= 0.521926 )
								ret := -0.333333
							if( ema2 > 0.521926 )
								ret := 0.250000
						if( ema3 > 0.526695 )
							if( ema13 <= -0.009272 )
								if( ema3 <= 0.530524 )
									ret := -0.977273 // sell
								if( ema3 > 0.530524 )
									ret := -0.625000
							if( ema13 > -0.009272 )
								if( ema2 <= 0.524133 )
									ret := 0.750000 // buy
								if( ema2 > 0.524133 )
									ret := -0.723404 // sell
					if( ema3 > 0.531628 )
						if( ema12 <= -0.004667 )
							if( ema13 <= -0.007558 )
								if( tema <= 0.532509 )
									ret := 0.656863
								if( tema > 0.532509 )
									ret := 0.192308
							if( ema13 > -0.007558 )
								if( ema2 <= 0.55123 )
									ret := -0.900000 // sell
								if( ema2 > 0.55123 )
									ret := 0.400000
						if( ema12 > -0.004667 )
							if( ema2 <= 0.561201 )
								if( tema <= 0.529451 )
									ret := -0.395349
								if( tema > 0.529451 )
									ret := 0.082278
							if( ema2 > 0.561201 )
								if( ema2 <= 0.565119 )
									ret := -0.500000
								if( ema2 > 0.565119 )
									ret := -1.000000 // sell
			if( ema2 > 0.566375 )
				if( tema <= 0.565366 )
					if( ema1 <= 0.568034 )
						if( ema2 <= 0.567287 )
							if( ema1 <= 0.562422 )
								ret := 0.750000 // buy
							if( ema1 > 0.562422 )
								ret := 0.500000
						if( ema2 > 0.567287 )
							if( ema13 <= -0.006752 )
								if( ema13 <= -0.009378 )
									ret := 1.000000 // buy
								if( ema13 > -0.009378 )
									ret := 0.500000
							if( ema13 > -0.006752 )
								ret := 1.000000 // buy
					if( ema1 > 0.568034 )
						if( ema2 <= 0.573629 )
							ret := -0.166667
						if( ema2 > 0.573629 )
							if( ema13 <= -0.013114 )
								if( ema2 <= 0.579459 )
									ret := -0.250000
								if( ema2 > 0.579459 )
									ret := 0.787879 // buy
							if( ema13 > -0.013114 )
								ret := 1.000000 // buy
				if( tema > 0.565366 )
					if( ema2 <= 0.641347 )
						if( tema <= 0.61711 )
							if( ema2 <= 0.626206 )
								if( ema13 <= -0.011457 )
									ret := 0.086207
								if( ema13 > -0.011457 )
									ret := 0.385694
							if( ema2 > 0.626206 )
								if( ema3 <= 0.634069 )
									ret := 0.955556 // buy
								if( ema3 > 0.634069 )
									ret := 0.769231 // buy
						if( tema > 0.61711 )
							if( ema12 <= -0.003574 )
								if( ema1 <= 0.63165 )
									ret := -0.166667
								if( ema1 > 0.63165 )
									ret := 0.275862
							if( ema12 > -0.003574 )
								if( ema2 <= 0.633964 )
									ret := -0.461538
								if( ema2 > 0.633964 )
									ret := -0.875000 // sell
					if( ema2 > 0.641347 )
						if( ema1 <= 0.644333 )
							if( ema2 <= 0.645745 )
								if( ema1 <= 0.636894 )
									ret := 0.000000
								if( ema1 > 0.636894 )
									ret := 0.700000 // buy
							if( ema2 > 0.645745 )
								if( ema3 <= 0.657693 )
									ret := 0.967213 // buy
								if( ema3 > 0.657693 )
									ret := 0.500000
						if( ema1 > 0.644333 )
							if( ema1 <= 0.644763 )
								ret := -1.000000 // sell
							if( ema1 > 0.644763 )
								if( ema13 <= -0.004501 )
									ret := 0.476190
								if( ema13 > -0.004501 )
									ret := -0.625000
		if( ema12 > -0.00342 )
			if( ema3 <= 0.626578 )
				if( tema <= 0.310277 )
					if( ema12 <= -0.001105 )
						if( ema13 <= -0.003256 )
							if( ema3 <= 0.312567 )
								if( ema1 <= 0.298552 )
									ret := 1.000000 // buy
								if( ema1 > 0.298552 )
									ret := -0.363636
							if( ema3 > 0.312567 )
								if( ema1 <= 0.310131 )
									ret := 0.810811 // buy
								if( ema1 > 0.310131 )
									ret := 0.266667
						if( ema13 > -0.003256 )
							if( ema1 <= 0.312223 )
								if( ema12 <= -0.00111 )
									ret := 0.923077 // buy
								if( ema12 > -0.00111 )
									ret := 0.600000
							if( ema1 > 0.312223 )
								ret := 0.000000
					if( ema12 > -0.001105 )
						ret := -1.000000 // sell
				if( tema > 0.310277 )
					if( ema3 <= 0.336965 )
						if( ema2 <= 0.331343 )
							if( ema12 <= -0.00225 )
								if( ema1 <= 0.325707 )
									ret := -0.443182
								if( ema1 > 0.325707 )
									ret := 0.285714
							if( ema12 > -0.00225 )
								if( ema13 <= -0.002735 )
									ret := 0.430464
								if( ema13 > -0.002735 )
									ret := -0.052632
						if( ema2 > 0.331343 )
							if( ema13 <= -0.002311 )
								if( ema1 <= 0.333632 )
									ret := -0.428571
								if( ema1 > 0.333632 )
									ret := -0.923077 // sell
							if( ema13 > -0.002311 )
								if( ema13 <= -0.002072 )
									ret := 0.210526
								if( ema13 > -0.002072 )
									ret := -0.411765
					if( ema3 > 0.336965 )
						if( tema <= 0.339792 )
							if( ema2 <= 0.336487 )
								if( ema12 <= -0.002108 )
									ret := -1.000000 // sell
								if( ema12 > -0.002108 )
									ret := 0.344828
							if( ema2 > 0.336487 )
								if( ema13 <= -0.002885 )
									ret := 0.731544 // buy
								if( ema13 > -0.002885 )
									ret := 0.416000
						if( tema > 0.339792 )
							if( tema <= 0.348549 )
								if( ema12 <= -0.001344 )
									ret := -0.289720
								if( ema12 > -0.001344 )
									ret := 0.289157
							if( tema > 0.348549 )
								if( ema2 <= 0.361495 )
									ret := 0.360406
								if( ema2 > 0.361495 )
									ret := 0.153710
			if( ema3 > 0.626578 )
				if( ema1 <= 0.682104 )
					if( ema3 <= 0.659951 )
						if( ema3 <= 0.656593 )
							if( ema2 <= 0.654462 )
								if( ema3 <= 0.650683 )
									ret := -0.206683
								if( ema3 > 0.650683 )
									ret := 0.732143 // buy
							if( ema2 > 0.654462 )
								if( ema13 <= -0.00148 )
									ret := -1.000000 // sell
								if( ema13 > -0.00148 )
									ret := -0.500000
						if( ema3 > 0.656593 )
							if( ema2 <= 0.656142 )
								if( ema12 <= -0.001753 )
									ret := 0.956522 // buy
								if( ema12 > -0.001753 )
									ret := 0.500000
							if( ema2 > 0.656142 )
								if( ema2 <= 0.658536 )
									ret := -0.200000
								if( ema2 > 0.658536 )
									ret := 1.000000 // buy
					if( ema3 > 0.659951 )
						if( tema <= 0.6602 )
							if( ema12 <= -0.003233 )
								ret := -0.250000
							if( ema12 > -0.003233 )
								if( ema3 <= 0.661715 )
									ret := -0.550000
								if( ema3 > 0.661715 )
									ret := -0.785714 // sell
						if( tema > 0.6602 )
							if( ema13 <= -0.003943 )
								if( ema1 <= 0.676995 )
									ret := -0.279070
								if( ema1 > 0.676995 )
									ret := 0.666667
							if( ema13 > -0.003943 )
								if( ema12 <= -0.001633 )
									ret := -0.708333 // sell
								if( ema12 > -0.001633 )
									ret := -0.043478
				if( ema1 > 0.682104 )
					if( tema <= 0.685581 )
						if( ema13 <= -0.002258 )
							if( ema13 <= -0.005444 )
								if( ema12 <= -0.002481 )
									ret := 1.000000 // buy
								if( ema12 > -0.002481 )
									ret := 0.750000 // buy
							if( ema13 > -0.005444 )
								if( ema3 <= 0.68779 )
									ret := 0.862069 // buy
								if( ema3 > 0.68779 )
									ret := 0.200000
						if( ema13 > -0.002258 )
							if( ema12 <= -0.001298 )
								ret := -0.600000
							if( ema12 > -0.001298 )
								if( ema3 <= 0.685608 )
									ret := 0.500000
								if( ema3 > 0.685608 )
									ret := -0.250000
					if( tema > 0.685581 )
						if( ema1 <= 0.701399 )
							if( ema13 <= -0.005565 )
								if( tema <= 0.695988 )
									ret := -0.600000
								if( tema > 0.695988 )
									ret := -1.000000 // sell
							if( ema13 > -0.005565 )
								if( ema2 <= 0.696843 )
									ret := 0.030769
								if( ema2 > 0.696843 )
									ret := -0.450000
						if( ema1 > 0.701399 )
							if( ema1 <= 0.715086 )
								if( ema2 <= 0.716051 )
									ret := 0.243243
								if( ema2 > 0.716051 )
									ret := 0.735294 // buy
							if( ema1 > 0.715086 )
								if( ema13 <= -0.002211 )
									ret := -0.152381
								if( ema13 > -0.002211 )
									ret := 0.277778
	if( ema12 > -0.001067 )
		if( ema13 <= 0.005822 )
			if( ema2 <= 0.620688 )
				if( tema <= 0.374636 )
					if( ema2 <= 0.304336 )
						if( ema2 <= 0.302624 )
							if( ema12 <= 0.000415 )
								ret := 0.600000
							if( ema12 > 0.000415 )
								ret := -0.250000
						if( ema2 > 0.302624 )
							if( tema <= 0.307968 )
								if( ema12 <= -0.000898 )
									ret := 0.750000 // buy
								if( ema12 > -0.000898 )
									ret := 1.000000 // buy
							if( tema > 0.307968 )
								ret := 0.750000 // buy
					if( ema2 > 0.304336 )
						if( ema13 <= 0.001658 )
							if( ema13 <= -0.002423 )
								if( ema3 <= 0.328012 )
									ret := -0.758621 // sell
								if( ema3 > 0.328012 )
									ret := -0.183673
							if( ema13 > -0.002423 )
								if( ema12 <= 0.000724 )
									ret := 0.079303
								if( ema12 > 0.000724 )
									ret := -0.129653
						if( ema13 > 0.001658 )
							if( ema12 <= 0.002721 )
								if( ema1 <= 0.370973 )
									ret := 0.194384
								if( ema1 > 0.370973 )
									ret := 0.595588
							if( ema12 > 0.002721 )
								if( tema <= 0.350802 )
									ret := -0.521739
								if( tema > 0.350802 )
									ret := 0.058252
				if( tema > 0.374636 )
					if( ema3 <= 0.375217 )
						if( ema1 <= 0.376163 )
							if( ema12 <= 0.00265 )
								if( ema12 <= 0.001904 )
									ret := -0.091603
								if( ema12 > 0.001904 )
									ret := -0.745455 // sell
							if( ema12 > 0.00265 )
								if( ema13 <= 0.005627 )
									ret := 0.818182 // buy
								if( ema13 > 0.005627 )
									ret := 1.000000 // buy
						if( ema1 > 0.376163 )
							if( tema <= 0.379725 )
								if( ema1 <= 0.376818 )
									ret := -0.620690
								if( ema1 > 0.376818 )
									ret := -0.121212
							if( tema > 0.379725 )
								if( ema3 <= 0.374764 )
									ret := -1.000000 // sell
								if( ema3 > 0.374764 )
									ret := -0.818182 // sell
					if( ema3 > 0.375217 )
						if( ema13 <= 0.003302 )
							if( tema <= 0.620032 )
								if( ema12 <= -0.000457 )
									ret := 0.061209
								if( ema12 > -0.000457 )
									ret := 0.011607
							if( tema > 0.620032 )
								if( ema2 <= 0.62037 )
									ret := 0.293333
								if( ema2 > 0.62037 )
									ret := -0.093750
						if( ema13 > 0.003302 )
							if( ema2 <= 0.379482 )
								if( tema <= 0.382256 )
									ret := 0.200000
								if( tema > 0.382256 )
									ret := -0.823529 // sell
							if( ema2 > 0.379482 )
								if( ema3 <= 0.384494 )
									ret := 0.628049
								if( ema3 > 0.384494 )
									ret := 0.092508
			if( ema2 > 0.620688 )
				if( ema3 <= 0.622433 )
					if( ema1 <= 0.621334 )
						if( ema3 <= 0.622235 )
							if( tema <= 0.621868 )
								if( ema1 <= 0.62022 )
									ret := -0.333333
								if( ema1 > 0.62022 )
									ret := 0.133929
							if( tema > 0.621868 )
								if( tema <= 0.621953 )
									ret := -1.000000 // sell
								if( tema > 0.621953 )
									ret := -0.333333
						if( ema3 > 0.622235 )
							if( ema13 <= -0.001303 )
								ret := -0.571429
							if( ema13 > -0.001303 )
								if( ema1 <= 0.621225 )
									ret := -1.000000 // sell
								if( ema1 > 0.621225 )
									ret := -0.750000 // sell
					if( ema1 > 0.621334 )
						if( ema1 <= 0.62768 )
							if( ema1 <= 0.624138 )
								if( ema1 <= 0.623691 )
									ret := -0.299163
								if( ema1 > 0.623691 )
									ret := -0.773585 // sell
							if( ema1 > 0.624138 )
								if( tema <= 0.625384 )
									ret := 0.476190
								if( tema > 0.625384 )
									ret := -0.265957
						if( ema1 > 0.62768 )
							ret := 1.000000 // buy
				if( ema3 > 0.622433 )
					if( ema1 <= 0.71631 )
						if( ema12 <= 0.00219 )
							if( ema3 <= 0.709931 )
								if( ema3 <= 0.660896 )
									ret := 0.026452
								if( ema3 > 0.660896 )
									ret := -0.108793
							if( ema3 > 0.709931 )
								if( ema2 <= 0.715805 )
									ret := 0.270742
								if( ema2 > 0.715805 )
									ret := -0.500000
						if( ema12 > 0.00219 )
							if( ema3 <= 0.703403 )
								if( ema3 <= 0.64003 )
									ret := -0.051429
								if( ema3 > 0.64003 )
									ret := -0.460251
							if( ema3 > 0.703403 )
								if( ema2 <= 0.711593 )
									ret := 0.684211
								if( ema2 > 0.711593 )
									ret := -0.166667
					if( ema1 > 0.71631 )
						if( tema <= 0.732333 )
							if( ema1 <= 0.724296 )
								if( tema <= 0.721343 )
									ret := -0.206897
								if( tema > 0.721343 )
									ret := -0.707865 // sell
							if( ema1 > 0.724296 )
								if( ema3 <= 0.731632 )
									ret := -0.958333 // sell
								if( ema3 > 0.731632 )
									ret := -0.500000
						if( tema > 0.732333 )
							if( tema <= 0.740047 )
								if( ema2 <= 0.738432 )
									ret := 0.250000
								if( ema2 > 0.738432 )
									ret := 0.625000
							if( tema > 0.740047 )
								if( ema12 <= 0.001621 )
									ret := -0.270053
								if( ema12 > 0.001621 )
									ret := 0.233333
		if( ema13 > 0.005822 )
			if( ema13 <= 0.041085 )
				if( ema3 <= 0.445089 )
					if( ema3 <= 0.424286 )
						if( ema12 <= 0.006161 )
							if( ema1 <= 0.391218 )
								if( tema <= 0.395134 )
									ret := -0.200617
								if( tema > 0.395134 )
									ret := 0.692308
							if( ema1 > 0.391218 )
								if( ema12 <= 0.004492 )
									ret := -0.380435
								if( ema12 > 0.004492 )
									ret := -0.775000 // sell
						if( ema12 > 0.006161 )
							if( ema1 <= 0.436192 )
								if( tema <= 0.420096 )
									ret := 0.137097
								if( tema > 0.420096 )
									ret := 0.958333 // buy
							if( ema1 > 0.436192 )
								if( tema <= 0.455178 )
									ret := -0.750000 // sell
								if( tema > 0.455178 )
									ret := -1.000000 // sell
					if( ema3 > 0.424286 )
						if( ema12 <= 0.002509 )
							if( ema3 <= 0.435303 )
								ret := -0.500000
							if( ema3 > 0.435303 )
								ret := -1.000000 // sell
						if( ema12 > 0.002509 )
							if( tema <= 0.443436 )
								if( ema3 <= 0.431351 )
									ret := 0.900000 // buy
								if( ema3 > 0.431351 )
									ret := 0.000000
							if( tema > 0.443436 )
								if( ema3 <= 0.431748 )
									ret := -0.520000
								if( ema3 > 0.431748 )
									ret := 0.576471
				if( ema3 > 0.445089 )
					if( ema13 <= 0.011198 )
						if( tema <= 0.491944 )
							if( ema3 <= 0.476264 )
								if( ema13 <= 0.006981 )
									ret := 0.000000
								if( ema13 > 0.006981 )
									ret := -0.524752
							if( ema3 > 0.476264 )
								if( ema12 <= 0.003541 )
									ret := -0.705882 // sell
								if( ema12 > 0.003541 )
									ret := -0.960000 // sell
						if( tema > 0.491944 )
							if( ema2 <= 0.487793 )
								if( ema2 <= 0.483944 )
									ret := 0.521739
								if( ema2 > 0.483944 )
									ret := 0.941176 // buy
							if( ema2 > 0.487793 )
								if( ema12 <= 0.006602 )
									ret := -0.106848
								if( ema12 > 0.006602 )
									ret := -0.745098 // sell
					if( ema13 > 0.011198 )
						if( ema2 <= 0.474107 )
							if( ema13 <= 0.019485 )
								if( ema1 <= 0.465329 )
									ret := -1.000000 // sell
								if( ema1 > 0.465329 )
									ret := 0.925926 // buy
							if( ema13 > 0.019485 )
								if( ema3 <= 0.457536 )
									ret := -1.000000 // sell
								if( ema3 > 0.457536 )
									ret := -0.750000 // sell
						if( ema2 > 0.474107 )
							if( tema <= 0.730116 )
								if( tema <= 0.726232 )
									ret := -0.429142
								if( tema > 0.726232 )
									ret := -1.000000 // sell
							if( tema > 0.730116 )
								if( ema3 <= 0.779638 )
									ret := 0.121212
								if( ema3 > 0.779638 )
									ret := -0.500000
			if( ema13 > 0.041085 )
				if( ema2 <= 0.680345 )
					if( ema1 <= 0.579454 )
						ret := 1.000000 // buy
					if( ema1 > 0.579454 )
						if( ema1 <= 0.602487 )
							ret := -1.000000 // sell
						if( ema1 > 0.602487 )
							if( ema1 <= 0.60809 )
								ret := 0.000000
							if( ema1 > 0.60809 )
								if( tema <= 0.740824 )
									ret := 1.000000 // buy
								if( tema > 0.740824 )
									ret := 0.555556
				if( ema2 > 0.680345 )
					if( ema13 <= 0.056813 )
						ret := 0.333333
					if( ema13 > 0.056813 )
						if( ema12 <= 0.045432 )
							ret := -1.000000 // sell
						if( ema12 > 0.045432 )
							if( tema <= 0.836809 )
								ret := -0.250000
							if( tema > 0.836809 )
								ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_XRPUSDT_15Min_2c26fe40(ema2, tema, ema12, ema3, ema1, ema13)

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


