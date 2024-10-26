//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Williams_Vix_Fix
// ID_model: PYPL_1Min_1WIL_b5d3f719 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PYPL_1Min_1WIL_b5d3f719", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PYPL_1Min_b5d3f719(sDev, Color_con1, lowerBand, wvf, upperBand, midLine, Color_con2, rangeLow, colInt, rangeHigh)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( wvf <= 0.133508 )
		if( wvf <= 0.007394 )
			if( midLine <= 0.105468 )
				if( lowerBand <= -0.073283 )
					if( midLine <= 0.080983 )
						if( lowerBand <= -0.183717 )
							if( Color_con1 <= -0.279825 )
								ret := -0.750000 // sell
							if( Color_con1 > -0.279825 )
								ret := -1.000000 // sell
						if( lowerBand > -0.183717 )
							if( wvf <= 0.002923 )
								if( Color_con1 <= -0.201919 )
									ret := -0.050000
								if( Color_con1 > -0.201919 )
									ret := 0.538462
							if( wvf > 0.002923 )
								ret := -1.000000 // sell
					if( midLine > 0.080983 )
						if( Color_con2 <= -0.173868 )
							if( Color_con2 <= -0.281598 )
								if( sDev <= 0.234849 )
									ret := 0.709677 // buy
								if( sDev > 0.234849 )
									ret := -0.250000
							if( Color_con2 > -0.281598 )
								if( midLine <= 0.091916 )
									ret := 0.166667
								if( midLine > 0.091916 )
									ret := -0.272727
						if( Color_con2 > -0.173868 )
							if( midLine <= 0.095611 )
								ret := 1.000000 // buy
							if( midLine > 0.095611 )
								ret := 0.750000 // buy
				if( lowerBand > -0.073283 )
					if( lowerBand <= -0.041659 )
						if( upperBand <= 0.260346 )
							if( Color_con2 <= -0.08464 )
								if( Color_con2 <= -0.31997 )
									ret := 0.129032
								if( Color_con2 > -0.31997 )
									ret := -0.399038
							if( Color_con2 > -0.08464 )
								ret := 0.714286 // buy
						if( upperBand > 0.260346 )
							if( sDev <= 0.160879 )
								ret := 1.000000 // buy
							if( sDev > 0.160879 )
								ret := 0.000000
					if( lowerBand > -0.041659 )
						if( sDev <= 0.072326 )
							if( lowerBand <= -0.00189 )
								if( Color_con1 <= -0.09539 )
									ret := -0.580000
								if( Color_con1 > -0.09539 )
									ret := -0.027778
							if( lowerBand > -0.00189 )
								if( Color_con1 <= -0.076941 )
									ret := 0.105263
								if( Color_con1 > -0.076941 )
									ret := 0.750000 // buy
						if( sDev > 0.072326 )
							if( Color_con2 <= -0.09189 )
								if( lowerBand <= -0.014518 )
									ret := 0.111940
								if( lowerBand > -0.014518 )
									ret := -0.392857
							if( Color_con2 > -0.09189 )
								if( Color_con1 <= -0.163259 )
									ret := 1.000000 // buy
								if( Color_con1 > -0.163259 )
									ret := 0.250000
			if( midLine > 0.105468 )
				if( Color_con1 <= -0.628059 )
					if( midLine <= 0.660794 )
						if( lowerBand <= -0.168685 )
							if( midLine <= 0.347659 )
								if( sDev <= 0.610396 )
									ret := 0.236842
								if( sDev > 0.610396 )
									ret := -0.785714 // sell
							if( midLine > 0.347659 )
								if( sDev <= 1.31611 )
									ret := 0.648649
								if( sDev > 1.31611 )
									ret := -0.250000
						if( lowerBand > -0.168685 )
							if( Color_con2 <= -0.559688 )
								if( sDev <= 0.36847 )
									ret := -0.909091 // sell
								if( sDev > 0.36847 )
									ret := -0.181818
							if( Color_con2 > -0.559688 )
								if( sDev <= 0.439761 )
									ret := 0.219512
								if( sDev > 0.439761 )
									ret := -0.714286 // sell
					if( midLine > 0.660794 )
						if( lowerBand <= -0.2514 )
							ret := -0.142857
						if( lowerBand > -0.2514 )
							if( lowerBand <= 0.015446 )
								ret := -1.000000 // sell
							if( lowerBand > 0.015446 )
								ret := -0.750000 // sell
				if( Color_con1 > -0.628059 )
					if( Color_con1 <= -0.299552 )
						if( Color_con2 <= -0.536359 )
							if( midLine <= 0.175202 )
								if( Color_con2 <= -0.568893 )
									ret := -0.090909
								if( Color_con2 > -0.568893 )
									ret := -0.700000 // sell
							if( midLine > 0.175202 )
								if( Color_con2 <= -0.781 )
									ret := -0.960000 // sell
								if( Color_con2 > -0.781 )
									ret := -0.750000 // sell
						if( Color_con2 > -0.536359 )
							if( sDev <= 0.218015 )
								if( Color_con2 <= -0.239493 )
									ret := -0.672000
								if( Color_con2 > -0.239493 )
									ret := -0.276596
							if( sDev > 0.218015 )
								if( Color_con1 <= -0.452459 )
									ret := -0.400000
								if( Color_con1 > -0.452459 )
									ret := -0.021277
					if( Color_con1 > -0.299552 )
						if( sDev <= 0.146967 )
							if( sDev <= 0.110764 )
								if( lowerBand <= 0.02113 )
									ret := -1.000000 // sell
								if( lowerBand > 0.02113 )
									ret := -0.571429
							if( sDev > 0.110764 )
								if( Color_con1 <= -0.256052 )
									ret := -0.652174
								if( Color_con1 > -0.256052 )
									ret := -0.046512
						if( sDev > 0.146967 )
							if( midLine <= 0.132279 )
								if( lowerBand <= -0.054685 )
									ret := 0.722222 // buy
								if( lowerBand > -0.054685 )
									ret := -0.369565
							if( midLine > 0.132279 )
								if( wvf <= 0.003127 )
									ret := 0.933333 // buy
								if( wvf > 0.003127 )
									ret := 0.500000
		if( wvf > 0.007394 )
			if( lowerBand <= -0.023998 )
				if( Color_con2 <= -0.188649 )
					if( lowerBand <= -0.297733 )
						if( Color_con1 <= -1.15372 )
							if( lowerBand <= -0.688712 )
								if( Color_con1 <= -2.08434 )
									ret := -0.333333
								if( Color_con1 > -2.08434 )
									ret := -0.875000 // sell
							if( lowerBand > -0.688712 )
								if( midLine <= 0.534183 )
									ret := 0.678571
								if( midLine > 0.534183 )
									ret := 0.162162
						if( Color_con1 > -1.15372 )
							if( Color_con1 <= -0.745248 )
								if( upperBand <= 1.0477 )
									ret := -0.881356 // sell
								if( upperBand > 1.0477 )
									ret := -0.282609
							if( Color_con1 > -0.745248 )
								if( upperBand <= 0.683406 )
									ret := 0.500000
								if( upperBand > 0.683406 )
									ret := 0.000000
					if( lowerBand > -0.297733 )
						if( Color_con1 <= -1.79042 )
							if( sDev <= 1.27452 )
								ret := -1.000000 // sell
							if( sDev > 1.27452 )
								ret := 0.714286 // buy
						if( Color_con1 > -1.79042 )
							if( upperBand <= 1.58931 )
								if( Color_con2 <= -1.13818 )
									ret := -0.426829
								if( Color_con2 > -1.13818 )
									ret := -0.011771
							if( upperBand > 1.58931 )
								if( Color_con2 <= -1.21313 )
									ret := 0.882353 // buy
								if( Color_con2 > -1.21313 )
									ret := 0.250000
				if( Color_con2 > -0.188649 )
					if( wvf <= 0.105379 )
						if( Color_con2 <= -0.1072 )
							if( sDev <= 0.111301 )
								if( midLine <= 0.08442 )
									ret := 0.051724
								if( midLine > 0.08442 )
									ret := -0.750000 // sell
							if( sDev > 0.111301 )
								if( Color_con1 <= -0.130408 )
									ret := -0.134653
								if( Color_con1 > -0.130408 )
									ret := -0.552239
						if( Color_con2 > -0.1072 )
							if( wvf <= 0.014893 )
								if( upperBand <= 0.150313 )
									ret := -0.142857
								if( upperBand > 0.150313 )
									ret := 0.809524 // buy
							if( wvf > 0.014893 )
								if( colInt <= 0.5 )
									ret := 0.001490
								if( colInt > 0.5 )
									ret := 0.818182 // buy
					if( wvf > 0.105379 )
						if( wvf <= 0.132458 )
							if( Color_con2 <= -0.160894 )
								if( Color_con2 <= -0.171791 )
									ret := -0.333333
								if( Color_con2 > -0.171791 )
									ret := 0.518519
							if( Color_con2 > -0.160894 )
								if( Color_con1 <= -0.008085 )
									ret := -0.260771
								if( Color_con1 > -0.008085 )
									ret := -0.705882 // sell
						if( wvf > 0.132458 )
							if( lowerBand <= -0.043675 )
								if( lowerBand <= -0.059254 )
									ret := 0.250000
								if( lowerBand > -0.059254 )
									ret := 1.000000 // buy
							if( lowerBand > -0.043675 )
								if( wvf <= 0.132833 )
									ret := 0.500000
								if( wvf > 0.132833 )
									ret := -0.400000
			if( lowerBand > -0.023998 )
				if( Color_con2 <= -0.483157 )
					if( lowerBand <= -0.013289 )
						if( Color_con1 <= -0.115534 )
							if( midLine <= 0.099598 )
								if( wvf <= 0.041817 )
									ret := -0.500000
								if( wvf > 0.041817 )
									ret := -1.000000 // sell
							if( midLine > 0.099598 )
								if( Color_con1 <= -0.25672 )
									ret := -0.325581
								if( Color_con1 > -0.25672 )
									ret := 0.016393
						if( Color_con1 > -0.115534 )
							if( sDev <= 0.0589 )
								ret := -0.750000 // sell
							if( sDev > 0.0589 )
								if( upperBand <= 0.18095 )
									ret := 0.714286 // buy
								if( upperBand > 0.18095 )
									ret := 0.090909
					if( lowerBand > -0.013289 )
						if( wvf <= 0.124369 )
							if( wvf <= 0.075006 )
								if( sDev <= 0.168267 )
									ret := 0.241245
								if( sDev > 0.168267 )
									ret := -0.053050
							if( wvf > 0.075006 )
								if( Color_con2 <= -0.569383 )
									ret := 0.175365
								if( Color_con2 > -0.569383 )
									ret := 0.461806
						if( wvf > 0.124369 )
							if( Color_con2 <= -0.514469 )
								if( Color_con2 <= -0.706561 )
									ret := -0.470588
								if( Color_con2 > -0.706561 )
									ret := -0.089552
							if( Color_con2 > -0.514469 )
								if( midLine <= 0.465995 )
									ret := 0.785714 // buy
								if( midLine > 0.465995 )
									ret := 0.000000
				if( Color_con2 > -0.483157 )
					if( Color_con1 <= -0.737104 )
						if( sDev <= 0.384823 )
							ret := -0.250000
						if( sDev > 0.384823 )
							if( lowerBand <= -0.014853 )
								if( Color_con1 <= -0.784303 )
									ret := -0.750000 // sell
								if( Color_con1 > -0.784303 )
									ret := -0.500000
							if( lowerBand > -0.014853 )
								if( Color_con2 <= -0.460081 )
									ret := -1.000000 // sell
								if( Color_con2 > -0.460081 )
									ret := -0.750000 // sell
					if( Color_con1 > -0.737104 )
						if( lowerBand <= 0.003395 )
							if( Color_con1 <= -0.188073 )
								if( Color_con1 <= -0.228664 )
									ret := 0.006364
								if( Color_con1 > -0.228664 )
									ret := -0.198690
							if( Color_con1 > -0.188073 )
								if( sDev <= 0.091473 )
									ret := 0.022962
								if( sDev > 0.091473 )
									ret := 0.159954
						if( lowerBand > 0.003395 )
							if( lowerBand <= 0.026988 )
								if( upperBand <= 0.372455 )
									ret := -0.036537
								if( upperBand > 0.372455 )
									ret := -0.206897
							if( lowerBand > 0.026988 )
								if( sDev <= 0.235819 )
									ret := -0.016369
								if( sDev > 0.235819 )
									ret := 0.193122
	if( wvf > 0.133508 )
		if( sDev <= 1.46354 )
			if( midLine <= 0.999302 )
				if( wvf <= 0.409795 )
					if( midLine <= 0.139269 )
						if( sDev <= 0.166569 )
							if( Color_con2 <= 0.122947 )
								if( Color_con2 <= -0.791258 )
									ret := 0.727273 // buy
								if( Color_con2 > -0.791258 )
									ret := 0.078131
							if( Color_con2 > 0.122947 )
								if( Color_con1 <= 0.059022 )
									ret := 0.319149
								if( Color_con1 > 0.059022 )
									ret := 0.700000 // buy
						if( sDev > 0.166569 )
							if( Color_con2 <= 0.146762 )
								if( lowerBand <= -0.065434 )
									ret := 0.316687
								if( lowerBand > -0.065434 )
									ret := 0.121277
							if( Color_con2 > 0.146762 )
								if( Color_con1 <= 0.107813 )
									ret := -0.214286
								if( Color_con1 > 0.107813 )
									ret := 0.875000 // buy
					if( midLine > 0.139269 )
						if( midLine <= 0.616073 )
							if( Color_con2 <= -1.08395 )
								if( lowerBand <= -0.273379 )
									ret := 0.200000
								if( lowerBand > -0.273379 )
									ret := -0.494253
							if( Color_con2 > -1.08395 )
								if( sDev <= 0.9546 )
									ret := 0.040351
								if( sDev > 0.9546 )
									ret := -0.571429
						if( midLine > 0.616073 )
							if( Color_con2 <= -0.598608 )
								if( sDev <= 0.76474 )
									ret := -0.134247
								if( sDev > 0.76474 )
									ret := 0.300380
							if( Color_con2 > -0.598608 )
								if( Color_con2 <= -0.527583 )
									ret := 0.628788
								if( Color_con2 > -0.527583 )
									ret := 0.349794
				if( wvf > 0.409795 )
					if( Color_con1 <= -0.805932 )
						if( upperBand <= 1.95742 )
							if( wvf <= 0.685527 )
								if( sDev <= 0.949384 )
									ret := -0.266376
								if( sDev > 0.949384 )
									ret := 0.302326
							if( wvf > 0.685527 )
								if( Color_con1 <= -1.08366 )
									ret := -0.857143 // sell
								if( Color_con1 > -1.08366 )
									ret := 0.565217
						if( upperBand > 1.95742 )
							if( wvf <= 0.455073 )
								ret := 0.500000
							if( wvf > 0.455073 )
								if( wvf <= 0.889549 )
									ret := -1.000000 // sell
								if( wvf > 0.889549 )
									ret := -0.833333 // sell
					if( Color_con1 > -0.805932 )
						if( Color_con1 <= -0.047702 )
							if( sDev <= 0.2629 )
								if( lowerBand <= 0.437094 )
									ret := -0.027115
								if( lowerBand > 0.437094 )
									ret := 0.240363
							if( sDev > 0.2629 )
								if( sDev <= 0.738982 )
									ret := 0.160185
								if( sDev > 0.738982 )
									ret := 0.000000
						if( Color_con1 > -0.047702 )
							if( Color_con1 <= 0.171025 )
								if( midLine <= 0.144205 )
									ret := 0.545852
								if( midLine > 0.144205 )
									ret := 0.227084
							if( Color_con1 > 0.171025 )
								if( Color_con1 <= 0.60339 )
									ret := -0.097065
								if( Color_con1 > 0.60339 )
									ret := 0.909091 // buy
			if( midLine > 0.999302 )
				if( wvf <= 0.426751 )
					if( Color_con1 <= -2.07868 )
						if( Color_con2 <= -1.63114 )
							ret := 0.142857
						if( Color_con2 > -1.63114 )
							if( wvf <= 0.312357 )
								if( sDev <= 1.1459 )
									ret := 0.909091 // buy
								if( sDev > 1.1459 )
									ret := 0.166667
							if( wvf > 0.312357 )
								ret := 1.000000 // buy
					if( Color_con1 > -2.07868 )
						if( sDev <= 1.12986 )
							if( Color_con2 <= -1.34038 )
								if( sDev <= 0.978833 )
									ret := 1.000000 // buy
								if( sDev > 0.978833 )
									ret := 0.750000 // buy
							if( Color_con2 > -1.34038 )
								if( Color_con2 <= -0.92435 )
									ret := -0.428571
								if( Color_con2 > -0.92435 )
									ret := 0.736842 // buy
						if( sDev > 1.12986 )
							if( wvf <= 0.27555 )
								ret := -1.000000 // sell
							if( wvf > 0.27555 )
								ret := -0.500000
				if( wvf > 0.426751 )
					if( sDev <= 0.540759 )
						if( upperBand <= 1.91143 )
							if( upperBand <= 1.59356 )
								if( midLine <= 1.2689 )
									ret := 0.241706
								if( midLine > 1.2689 )
									ret := -0.809524 // sell
							if( upperBand > 1.59356 )
								if( Color_con1 <= -0.26025 )
									ret := -0.354610
								if( Color_con1 > -0.26025 )
									ret := 0.800000 // buy
						if( upperBand > 1.91143 )
							if( sDev <= 0.532083 )
								if( wvf <= 1.41362 )
									ret := 1.000000 // buy
								if( wvf > 1.41362 )
									ret := 0.571429
							if( sDev > 0.532083 )
								ret := -0.333333
					if( sDev > 0.540759 )
						if( sDev <= 1.14641 )
							if( Color_con2 <= 0.373233 )
								if( Color_con1 <= -0.581156 )
									ret := -0.348711
								if( Color_con1 > -0.581156 )
									ret := 0.181818
							if( Color_con2 > 0.373233 )
								if( Color_con1 <= -0.297395 )
									ret := -0.361111
								if( Color_con1 > -0.297395 )
									ret := -0.833333 // sell
						if( sDev > 1.14641 )
							if( Color_con1 <= -1.26076 )
								if( Color_con2 <= -1.6345 )
									ret := 0.733333 // buy
								if( Color_con2 > -1.6345 )
									ret := -0.564103
							if( Color_con1 > -1.26076 )
								if( midLine <= 1.25773 )
									ret := 0.068966
								if( midLine > 1.25773 )
									ret := 0.674419
		if( sDev > 1.46354 )
			if( sDev <= 5.55477 )
				if( Color_con1 <= 2.15098 )
					if( Color_con2 <= 0.062 )
						if( lowerBand <= 1.68718 )
							if( Color_con2 <= -0.301702 )
								if( midLine <= 1.68719 )
									ret := 0.330709
								if( midLine > 1.68719 )
									ret := 0.707792 // buy
							if( Color_con2 > -0.301702 )
								if( sDev <= 2.01068 )
									ret := 0.402299
								if( sDev > 2.01068 )
									ret := -0.800000 // sell
						if( lowerBand > 1.68718 )
							if( sDev <= 1.49895 )
								ret := 0.500000
							if( sDev > 1.49895 )
								ret := -1.000000 // sell
					if( Color_con2 > 0.062 )
						if( Color_con2 <= 1.75209 )
							if( Color_con1 <= -0.508592 )
								if( upperBand <= 2.61035 )
									ret := 0.454545
								if( upperBand > 2.61035 )
									ret := 0.870968 // buy
							if( Color_con1 > -0.508592 )
								if( lowerBand <= -0.663602 )
									ret := 0.805556 // buy
								if( lowerBand > -0.663602 )
									ret := -0.200000
						if( Color_con2 > 1.75209 )
							if( midLine <= 1.83477 )
								if( wvf <= 2.66198 )
									ret := -0.714286 // sell
								if( wvf > 2.66198 )
									ret := 0.718750 // buy
							if( midLine > 1.83477 )
								ret := -1.000000 // sell
				if( Color_con1 > 2.15098 )
					ret := -1.000000 // sell
			if( sDev > 5.55477 )
				if( lowerBand <= -4.48399 )
					ret := -0.250000
				if( lowerBand > -4.48399 )
					if( wvf <= 6.91306 )
						ret := -1.000000 // sell
					if( wvf > 6.91306 )
						ret := -0.750000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Williams_Vix_Fix 
//@version=5
//indicator "CM_Williams_Vix_Fix", overlay=false)

// Inputs
pd = input.int(22, title="LookBack Period Standard Deviation High")
bbl = input.int(20, title="Bollinger Band Length")
mult = input.float(2.0, minval=1, maxval=5, title="Bollinger Band Standard Deviation Up")
lb = input.int(50, title="Look Back Period Percentile High")
ph = input.float(0.85, title="Highest Percentile - 0.90=90%, 0.95=95%, 0.99=99%")
pl = input.float(1.01, title="Lowest Percentile - 1.10=90%, 1.05=95%, 1.01=99%")
hp = input.bool(false, title="Show High Range - Based on Percentile and LookBack Period?")
sd = input.bool(false, title="Show Standard Deviation Line?")

// Calculations
wvf = ((ta.highest(close, pd) - low) / ta.highest(close, pd)) * 100

sDev = mult * ta.stdev(wvf, bbl)
midLine = ta.sma(wvf, bbl)
lowerBand = midLine - sDev
upperBand = midLine + sDev

rangeHigh = ta.highest(wvf, lb) * ph
rangeLow = ta.lowest(wvf, lb) * pl


Color_con1 = wvf - upperBand
Color_con2 = wvf - rangeHigh
// Color condition
col = wvf >= upperBand or wvf >= rangeHigh ? color.lime : color.gray
colInt = wvf >= upperBand or wvf >= rangeHigh ? 1 : 0 //Bool to int

// Plots
plot(hp and na(rangeHigh) ? na : rangeHigh, title="Range High Percentile", color=color.orange, linewidth=4)
plot(hp and na(rangeLow) ? na : rangeLow, title="Range Low Percentile", color=color.orange, linewidth=4)
plot(wvf, title="Williams Vix Fix", color=col, style=plot.style_histogram, linewidth=4)
plot(sd and na(upperBand) ? na : upperBand, title="Upper Band", color=color.aqua, linewidth=3)

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
float op_operation = decision_tree_0_PYPL_1Min_b5d3f719(sDev, Color_con1, lowerBand, wvf, upperBand, midLine, Color_con2, rangeLow, colInt, rangeHigh)

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


