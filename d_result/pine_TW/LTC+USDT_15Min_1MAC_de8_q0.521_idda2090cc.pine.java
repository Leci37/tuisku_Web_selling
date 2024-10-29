//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: MACD_ULT_MTF
// ID_model: LTCUSDT_15Min_1MAC_da2090cc Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LTCUSDT_15Min_1MAC_da2090cc", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LTCUSDT_15Min_da2090cc(macd, macd_IsBelowInt, signal, histB_IsUpInt, macd_IsAboveInt, histB_IsDownInt, histA_IsUpInt, hist, histA_IsDownInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( macd <= -0.104867 )
		if( hist <= 0.037465 )
			if( macd <= -0.555453 )
				if( hist <= -0.533719 )
					if( signal <= -1.17457 )
						if( macd <= -2.7775 )
							ret := 0.541667
						if( macd > -2.7775 )
							if( histB_IsUpInt <= 0.5 )
								if( signal <= -1.54206 )
									ret := 1.000000 // buy
								if( signal > -1.54206 )
									ret := 0.631579
							if( histB_IsUpInt > 0.5 )
								if( macd <= -1.96603 )
									ret := 1.000000 // buy
								if( macd > -1.96603 )
									ret := 0.818182 // buy
					if( signal > -1.17457 )
						if( macd <= -1.69296 )
							if( macd <= -2.08482 )
								ret := 0.384615
							if( macd > -2.08482 )
								if( macd <= -1.85824 )
									ret := -0.954545 // sell
								if( macd > -1.85824 )
									ret := -0.258065
						if( macd > -1.69296 )
							if( macd <= -1.07527 )
								if( hist <= -0.83779 )
									ret := 0.937500 // buy
								if( hist > -0.83779 )
									ret := 0.245902
							if( macd > -1.07527 )
								if( signal <= -0.115314 )
									ret := 0.743243 // buy
								if( signal > -0.115314 )
									ret := 0.133333
				if( hist > -0.533719 )
					if( hist <= -0.405686 )
						if( macd <= -1.00209 )
							if( histB_IsUpInt <= 0.5 )
								if( signal <= -1.11537 )
									ret := 0.272727
								if( signal > -1.11537 )
									ret := -0.523810
							if( histB_IsUpInt > 0.5 )
								if( signal <= -1.52336 )
									ret := 0.500000
								if( signal > -1.52336 )
									ret := -0.687500
						if( macd > -1.00209 )
							if( hist <= -0.415161 )
								if( histB_IsDownInt <= 0.5 )
									ret := -0.271186
								if( histB_IsDownInt > 0.5 )
									ret := 0.191176
							if( hist > -0.415161 )
								if( signal <= -0.481346 )
									ret := -0.900000 // sell
								if( signal > -0.481346 )
									ret := -0.428571
					if( hist > -0.405686 )
						if( histB_IsDownInt <= 0.5 )
							if( histA_IsDownInt <= 0.5 )
								if( macd <= -0.847998 )
									ret := 0.006873
								if( macd > -0.847998 )
									ret := 0.260484
							if( histA_IsDownInt > 0.5 )
								if( hist <= 0.01167 )
									ret := -0.312500
								if( hist > 0.01167 )
									ret := 0.456311
						if( histB_IsDownInt > 0.5 )
							if( hist <= -0.152917 )
								if( macd <= -1.0519 )
									ret := -0.054054
								if( macd > -1.0519 )
									ret := 0.386838
							if( hist > -0.152917 )
								if( signal <= -0.621684 )
									ret := 0.377990
								if( signal > -0.621684 )
									ret := -0.115741
			if( macd > -0.555453 )
				if( hist <= -0.246475 )
					if( hist <= -0.445178 )
						if( signal <= 0.163047 )
							if( signal <= 0.033007 )
								if( signal <= -0.009682 )
									ret := 0.846154 // buy
								if( signal > -0.009682 )
									ret := 1.000000 // buy
							if( signal > 0.033007 )
								if( macd <= -0.381388 )
									ret := 0.300000
								if( macd > -0.381388 )
									ret := 0.777778 // buy
						if( signal > 0.163047 )
							if( macd <= -0.23561 )
								if( hist <= -0.526788 )
									ret := -0.888889 // sell
								if( hist > -0.526788 )
									ret := -0.300000
							if( macd > -0.23561 )
								ret := 0.428571
					if( hist > -0.445178 )
						if( hist <= -0.404412 )
							if( signal <= 0.116351 )
								if( macd <= -0.488224 )
									ret := 0.285714
								if( macd > -0.488224 )
									ret := -0.735294 // sell
							if( signal > 0.116351 )
								ret := 0.318182
						if( hist > -0.404412 )
							if( signal <= 0.027588 )
								if( signal <= -0.017149 )
									ret := 0.203081
								if( signal > -0.017149 )
									ret := -0.373016
							if( signal > 0.027588 )
								if( macd <= -0.126677 )
									ret := 0.570909
								if( macd > -0.126677 )
									ret := -0.333333
				if( hist > -0.246475 )
					if( histB_IsDownInt <= 0.5 )
						if( hist <= -0.212615 )
							if( hist <= -0.21351 )
								if( hist <= -0.216882 )
									ret := -0.137566
								if( hist > -0.216882 )
									ret := 0.384615
							if( hist > -0.21351 )
								ret := -0.947368 // sell
						if( hist > -0.212615 )
							if( macd <= -0.199138 )
								if( macd <= -0.263993 )
									ret := 0.059261
								if( macd > -0.263993 )
									ret := 0.145029
							if( macd > -0.199138 )
								if( histA_IsDownInt <= 0.5 )
									ret := 0.019244
								if( histA_IsDownInt > 0.5 )
									ret := 0.142572
					if( histB_IsDownInt > 0.5 )
						if( hist <= -0.088847 )
							if( macd <= -0.542611 )
								if( signal <= -0.417518 )
									ret := 1.000000 // buy
								if( signal > -0.417518 )
									ret := 0.500000
							if( macd > -0.542611 )
								if( signal <= 0.046672 )
									ret := 0.023564
								if( signal > 0.046672 )
									ret := 0.464968
						if( hist > -0.088847 )
							if( hist <= -0.081547 )
								if( signal <= -0.055761 )
									ret := 0.478873
								if( signal > -0.055761 )
									ret := -0.025974
							if( hist > -0.081547 )
								if( hist <= -0.041151 )
									ret := 0.080139
								if( hist > -0.041151 )
									ret := 0.195663
		if( hist > 0.037465 )
			if( signal <= -0.721569 )
				if( hist <= 0.461407 )
					if( histA_IsUpInt <= 0.5 )
						if( hist <= 0.080385 )
							if( signal <= -0.955443 )
								if( hist <= 0.07574 )
									ret := 0.636364
								if( hist > 0.07574 )
									ret := 1.000000 // buy
							if( signal > -0.955443 )
								if( signal <= -0.900586 )
									ret := -1.000000 // sell
								if( signal > -0.900586 )
									ret := 0.700000 // buy
						if( hist > 0.080385 )
							if( macd <= -1.40817 )
								if( hist <= 0.310878 )
									ret := 0.952381 // buy
								if( hist > 0.310878 )
									ret := 0.538462
							if( macd > -1.40817 )
								if( hist <= 0.172169 )
									ret := -0.450000
								if( hist > 0.172169 )
									ret := 0.018692
					if( histA_IsUpInt > 0.5 )
						if( macd <= -1.12673 )
							if( signal <= -1.40852 )
								if( signal <= -2.18447 )
									ret := 0.631579
								if( signal > -2.18447 )
									ret := -0.298780
							if( signal > -1.40852 )
								if( hist <= 0.155622 )
									ret := 0.967742 // buy
								if( hist > 0.155622 )
									ret := 0.833333 // buy
						if( macd > -1.12673 )
							if( macd <= -0.835492 )
								if( macd <= -0.990905 )
									ret := -0.571429
								if( macd > -0.990905 )
									ret := 0.033898
							if( macd > -0.835492 )
								if( macd <= -0.794305 )
									ret := -0.752475 // sell
								if( macd > -0.794305 )
									ret := -0.331481
				if( hist > 0.461407 )
					if( macd <= -1.1627 )
						if( signal <= -2.28323 )
							if( hist <= 0.548796 )
								ret := -1.000000 // sell
							if( hist > 0.548796 )
								ret := -0.666667
						if( signal > -2.28323 )
							if( signal <= -2.00044 )
								ret := 1.000000 // buy
							if( signal > -2.00044 )
								if( macd <= -1.3057 )
									ret := -0.846154 // sell
								if( macd > -1.3057 )
									ret := -0.500000
					if( macd > -1.1627 )
						if( macd <= -0.817195 )
							if( histA_IsUpInt <= 0.5 )
								ret := -0.588235
							if( histA_IsUpInt > 0.5 )
								ret := -1.000000 // sell
						if( macd > -0.817195 )
							if( hist <= 0.469334 )
								ret := -0.928571 // sell
							if( hist > 0.469334 )
								ret := -1.000000 // sell
			if( signal > -0.721569 )
				if( macd <= -0.283593 )
					if( signal <= -0.561718 )
						if( histA_IsUpInt <= 0.5 )
							if( signal <= -0.567186 )
								if( macd <= -0.480517 )
									ret := 0.649123
								if( macd > -0.480517 )
									ret := 0.125000
							if( signal > -0.567186 )
								if( signal <= -0.563438 )
									ret := 1.000000 // buy
								if( signal > -0.563438 )
									ret := 0.857143 // buy
						if( histA_IsUpInt > 0.5 )
							if( macd <= -0.666438 )
								ret := 1.000000 // buy
							if( macd > -0.666438 )
								if( macd <= -0.638732 )
									ret := -0.900000 // sell
								if( macd > -0.638732 )
									ret := 0.084383
					if( signal > -0.561718 )
						if( macd <= -0.40376 )
							if( macd <= -0.405954 )
								if( signal <= -0.532173 )
									ret := 0.025316
								if( signal > -0.532173 )
									ret := -0.335294
							if( macd > -0.405954 )
								ret := -0.741935 // sell
						if( macd > -0.40376 )
							if( hist <= 0.039103 )
								if( signal <= -0.350083 )
									ret := -0.200000
								if( signal > -0.350083 )
									ret := -0.700000 // sell
							if( hist > 0.039103 )
								if( macd <= -0.302261 )
									ret := 0.082569
								if( macd > -0.302261 )
									ret := 0.314381
				if( macd > -0.283593 )
					if( hist <= 0.14947 )
						if( signal <= -0.297473 )
							if( histA_IsUpInt <= 0.5 )
								if( signal <= -0.384825 )
									ret := 0.608696
								if( signal > -0.384825 )
									ret := 0.004008
							if( histA_IsUpInt > 0.5 )
								if( signal <= -0.322769 )
									ret := -0.120654
								if( signal > -0.322769 )
									ret := 0.189602
						if( signal > -0.297473 )
							if( signal <= -0.289205 )
								if( hist <= 0.127644 )
									ret := -0.561728
								if( hist > 0.127644 )
									ret := 0.400000
							if( signal > -0.289205 )
								if( signal <= -0.178113 )
									ret := -0.063575
								if( signal > -0.178113 )
									ret := 0.070866
					if( hist > 0.14947 )
						if( macd <= -0.116292 )
							if( histA_IsDownInt <= 0.5 )
								if( macd <= -0.251212 )
									ret := -0.785714 // sell
								if( macd > -0.251212 )
									ret := -0.339093
							if( histA_IsDownInt > 0.5 )
								if( macd <= -0.260851 )
									ret := 0.365385
								if( macd > -0.260851 )
									ret := -0.333333
						if( macd > -0.116292 )
							if( hist <= 0.255189 )
								if( histA_IsDownInt <= 0.5 )
									ret := 0.769231 // buy
								if( histA_IsDownInt > 0.5 )
									ret := 0.071429
							if( hist > 0.255189 )
								ret := 0.100000
	if( macd > -0.104867 )
		if( histB_IsUpInt <= 0.5 )
			if( hist <= -0.281624 )
				if( macd <= 1.68662 )
					if( macd <= 0.850624 )
						if( macd <= 0.582579 )
							if( signal <= 0.24372 )
								ret := -0.545455
							if( signal > 0.24372 )
								if( hist <= -0.285974 )
									ret := 0.401747
								if( hist > -0.285974 )
									ret := 1.000000 // buy
						if( macd > 0.582579 )
							if( signal <= 1.08876 )
								if( hist <= -0.330662 )
									ret := 1.000000 // buy
								if( hist > -0.330662 )
									ret := 0.756757 // buy
							if( signal > 1.08876 )
								if( signal <= 1.17504 )
									ret := -0.142857
								if( signal > 1.17504 )
									ret := 0.428571
					if( macd > 0.850624 )
						if( hist <= -0.400713 )
							ret := 0.588235
						if( hist > -0.400713 )
							if( hist <= -0.345168 )
								if( signal <= 1.38887 )
									ret := -1.000000 // sell
								if( signal > 1.38887 )
									ret := -0.692308
							if( hist > -0.345168 )
								if( hist <= -0.327142 )
									ret := 0.571429
								if( hist > -0.327142 )
									ret := -0.391304
				if( macd > 1.68662 )
					if( hist <= -0.353008 )
						if( signal <= 2.44928 )
							ret := 1.000000 // buy
						if( signal > 2.44928 )
							ret := 0.923077 // buy
					if( hist > -0.353008 )
						ret := 0.666667
			if( hist > -0.281624 )
				if( hist <= -0.119909 )
					if( macd <= 1.42971 )
						if( hist <= -0.160941 )
							if( signal <= 0.855423 )
								if( hist <= -0.257411 )
									ret := -0.298701
								if( hist > -0.257411 )
									ret := 0.053082
							if( signal > 0.855423 )
								if( hist <= -0.257769 )
									ret := 0.100000
								if( hist > -0.257769 )
									ret := -0.289216
						if( hist > -0.160941 )
							if( macd <= 0.01328 )
								if( signal <= 0.138973 )
									ret := 0.034169
								if( signal > 0.138973 )
									ret := -0.448276
							if( macd > 0.01328 )
								if( hist <= -0.14519 )
									ret := 0.349633
								if( hist > -0.14519 )
									ret := 0.119469
					if( macd > 1.42971 )
						if( hist <= -0.164712 )
							if( signal <= 2.73224 )
								if( macd <= 1.71878 )
									ret := 0.900000 // buy
								if( macd > 1.71878 )
									ret := 0.923077 // buy
							if( signal > 2.73224 )
								ret := 1.000000 // buy
						if( hist > -0.164712 )
							ret := 0.666667
				if( hist > -0.119909 )
					if( signal <= 0.28783 )
						if( histA_IsUpInt <= 0.5 )
							if( macd <= 0.384839 )
								if( hist <= 0.245607 )
									ret := -0.000867
								if( hist > 0.245607 )
									ret := 0.270992
							if( macd > 0.384839 )
								if( hist <= 0.122507 )
									ret := -0.772727 // sell
								if( hist > 0.122507 )
									ret := 0.267578
						if( histA_IsUpInt > 0.5 )
							if( hist <= 0.002176 )
								if( signal <= 0.062323 )
									ret := -0.104803
								if( signal > 0.062323 )
									ret := -0.447514
							if( hist > 0.002176 )
								if( macd <= 1.08884 )
									ret := -0.018493
								if( macd > 1.08884 )
									ret := -1.000000 // sell
					if( signal > 0.28783 )
						if( macd <= 0.397488 )
							if( hist <= -0.017348 )
								if( signal <= 0.45124 )
									ret := -0.131313
								if( signal > 0.45124 )
									ret := 0.295238
							if( hist > -0.017348 )
								if( macd <= 0.305186 )
									ret := -0.698113
								if( macd > 0.305186 )
									ret := -0.277419
						if( macd > 0.397488 )
							if( hist <= 0.528093 )
								if( hist <= 0.317145 )
									ret := -0.054233
								if( hist > 0.317145 )
									ret := -0.427015
							if( hist > 0.528093 )
								if( hist <= 0.974674 )
									ret := 0.347826
								if( hist > 0.974674 )
									ret := -0.653846
		if( histB_IsUpInt > 0.5 )
			if( macd <= 0.223569 )
				if( hist <= -0.040131 )
					if( signal <= 0.297849 )
						if( signal <= 0.0705 )
							if( hist <= -0.046208 )
								if( hist <= -0.061358 )
									ret := -0.085828
								if( hist > -0.061358 )
									ret := 0.167428
							if( hist > -0.046208 )
								if( signal <= 0.061033 )
									ret := -0.365269
								if( signal > 0.061033 )
									ret := 0.625000
						if( signal > 0.0705 )
							if( hist <= -0.074895 )
								if( macd <= -0.021637 )
									ret := -0.346369
								if( macd > -0.021637 )
									ret := 0.000611
							if( hist > -0.074895 )
								if( signal <= 0.09195 )
									ret := -0.007299
								if( signal > 0.09195 )
									ret := -0.248507
					if( signal > 0.297849 )
						if( signal <= 0.377012 )
							if( hist <= -0.106488 )
								if( signal <= 0.309485 )
									ret := 0.142857
								if( signal > 0.309485 )
									ret := 0.671875
							if( hist > -0.106488 )
								if( signal <= 0.304089 )
									ret := 0.347826
								if( signal > 0.304089 )
									ret := -0.181818
						if( signal > 0.377012 )
							if( macd <= 0.10205 )
								if( signal <= 0.445215 )
									ret := -0.906977 // sell
								if( signal > 0.445215 )
									ret := 0.636364
							if( macd > 0.10205 )
								if( macd <= 0.165368 )
									ret := 0.777778 // buy
								if( macd > 0.165368 )
									ret := -0.097561
				if( hist > -0.040131 )
					if( macd <= 0.157146 )
						if( signal <= 0.099625 )
							if( macd <= 0.008226 )
								if( hist <= -0.035431 )
									ret := 0.264438
								if( hist > -0.035431 )
									ret := -0.076617
							if( macd > 0.008226 )
								if( macd <= 0.022031 )
									ret := 0.251196
								if( macd > 0.022031 )
									ret := 0.076165
						if( signal > 0.099625 )
							if( macd <= 0.109455 )
								if( macd <= 0.102593 )
									ret := -0.099010
								if( macd > 0.102593 )
									ret := -0.560000
							if( macd > 0.109455 )
								if( macd <= 0.148991 )
									ret := 0.061189
								if( macd > 0.148991 )
									ret := -0.427083
					if( macd > 0.157146 )
						if( hist <= -0.029884 )
							if( hist <= -0.038528 )
								ret := -0.076923
							if( hist > -0.038528 )
								if( macd <= 0.173324 )
									ret := 0.860465 // buy
								if( macd > 0.173324 )
									ret := 0.350877
						if( hist > -0.029884 )
							if( signal <= 0.172806 )
								if( hist <= -0.007898 )
									ret := 0.928571 // buy
								if( hist > -0.007898 )
									ret := 0.357143
							if( signal > 0.172806 )
								if( signal <= 0.231809 )
									ret := 0.005935
								if( signal > 0.231809 )
									ret := 0.444444
			if( macd > 0.223569 )
				if( hist <= -0.173252 )
					if( macd <= 0.373208 )
						if( macd <= 0.272554 )
							if( macd <= 0.250475 )
								if( macd <= 0.235109 )
									ret := -0.700000 // sell
								if( macd > 0.235109 )
									ret := 0.000000
							if( macd > 0.250475 )
								ret := -0.900000 // sell
						if( macd > 0.272554 )
							if( hist <= -0.238887 )
								if( macd <= 0.333796 )
									ret := -0.125000
								if( macd > 0.333796 )
									ret := -0.724138 // sell
							if( hist > -0.238887 )
								if( signal <= 0.501976 )
									ret := 0.833333 // buy
								if( signal > 0.501976 )
									ret := 0.062500
					if( macd > 0.373208 )
						if( macd <= 0.471376 )
							if( signal <= 0.588233 )
								ret := 1.000000 // buy
							if( signal > 0.588233 )
								if( signal <= 0.625115 )
									ret := 0.272727
								if( signal > 0.625115 )
									ret := 0.711111 // buy
						if( macd > 0.471376 )
							if( hist <= -0.458081 )
								if( signal <= 2.31796 )
									ret := 0.000000
								if( signal > 2.31796 )
									ret := -1.000000 // sell
							if( hist > -0.458081 )
								if( macd <= 1.25524 )
									ret := 0.055249
								if( macd > 1.25524 )
									ret := 0.633333
				if( hist > -0.173252 )
					if( signal <= 0.6123 )
						if( signal <= 0.576022 )
							if( macd <= 0.410936 )
								if( macd <= 0.262741 )
									ret := -0.087071
								if( macd > 0.262741 )
									ret := -0.296976
							if( macd > 0.410936 )
								if( signal <= 0.542584 )
									ret := 0.084112
								if( signal > 0.542584 )
									ret := -0.376238
						if( signal > 0.576022 )
							if( hist <= -0.082876 )
								if( macd <= 0.485112 )
									ret := 0.146341
								if( macd > 0.485112 )
									ret := -0.625000
							if( hist > -0.082876 )
								if( macd <= 0.548176 )
									ret := 0.964286 // buy
								if( macd > 0.548176 )
									ret := 0.411765
					if( signal > 0.6123 )
						if( signal <= 1.47281 )
							if( macd <= 0.774574 )
								if( hist <= -0.076355 )
									ret := -0.489796
								if( hist > -0.076355 )
									ret := -0.887097 // sell
							if( macd > 0.774574 )
								if( hist <= -0.153203 )
									ret := -0.685714
								if( hist > -0.153203 )
									ret := -0.014085
						if( signal > 1.47281 )
							ret := 0.857143 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator MACD_ULT_MTF 
//@version=5
//indicator title="CM_MacD_Ult_MTF", shorttitle="CM_Ult_MacD_MTF", overlay=false)

source = close
useCurrentRes = input(true, title="Use Current Chart Resolution?")
resCustom = input.timeframe(title="Use Different Timeframe? Uncheck Box Above", defval="60")
smd = input(true, title="Show MacD & Signal Line? Also Turn Off Dots Below")
sd = input(true, title="Show Dots When MacD Crosses Signal Line?")
sh = input(true, title="Show Histogram?")
macd_colorChange = input(true,title="Change MacD Line Color-Signal Line Cross?")
hist_colorChange = input(true,title="MacD Histogram 4 Colors?")

res = useCurrentRes ? timeframe.period : resCustom

fastLength = input.int(12, minval=1)
slowLength = input.int(26, minval=1)
signalLength = input.int(9, minval=1)

fastMA = ta.ema(source, fastLength)
slowMA = ta.ema(source, slowLength)

macd = fastMA - slowMA
signal = ta.sma(macd, signalLength)
hist = macd - signal

outMacD = request.security(syminfo.tickerid, res, macd)
outSignal = request.security(syminfo.tickerid, res, signal)
outHist = request.security(syminfo.tickerid, res, hist)

histA_IsUp = outHist > outHist[1] and outHist > 0
histA_IsDown = outHist < outHist[1] and outHist > 0
histB_IsDown = outHist < outHist[1] and outHist <= 0
histB_IsUp = outHist > outHist[1] and outHist <= 0

// MacD Color Definitions
macd_IsAbove = outMacD >= outSignal
macd_IsBelow = outMacD < outSignal

plot_color = hist_colorChange ? histA_IsUp ? color.aqua : histA_IsDown ? color.blue : histB_IsDown ? color.red : histB_IsUp ? color.maroon : color.yellow : color.gray
macd_color = macd_colorChange ? macd_IsAbove ? color.lime : color.red : color.red
signal_color = macd_colorChange ? macd_IsAbove ? color.yellow : color.yellow : color.lime

circleYPosition = outSignal

plot(smd and outMacD ? outMacD : na, title="MACD", color=macd_color, linewidth=4)
plot(smd and outSignal ? outSignal : na, title="Signal Line", color=signal_color, style=plot.style_line, linewidth=2)
plot(sh and outHist ? outHist : na, title="Histogram", color=plot_color, style=plot.style_histogram, linewidth=4)
plot(sd and ta.cross(outMacD, outSignal) ? circleYPosition : na, title="Cross", style=plot.style_circles, linewidth=4, color=macd_color)
hline(0, '0 Line', linestyle=hline.style_solid, linewidth=2, color=color.white)

histA_IsUpInt = histA_IsUp ? 1: 0
histA_IsDownInt = histA_IsDown ? 1: 0
histB_IsDownInt = histB_IsDown ? 1: 0
histB_IsUpInt = histB_IsUp ? 1: 0
macd_IsAboveInt = macd_IsAbove ? 1: 0
macd_IsBelowInt = macd_IsBelow ? 1: 0

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
float op_operation = decision_tree_0_LTCUSDT_15Min_da2090cc(macd, macd_IsBelowInt, signal, histB_IsUpInt, macd_IsAboveInt, histB_IsDownInt, histA_IsUpInt, hist, histA_IsDownInt)

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


