//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: ADX_and_DI
// ID_model: LYFT_1Min_1ADX_d4a5cfd5 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LYFT_1Min_1ADX_d4a5cfd5", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LYFT_1Min_d4a5cfd5(dx, directionalMovementMinus, diPlus, smoothedDirectionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedTrueRange, directionalMovementPlus, diMinus, adx)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( directionalMovementMinus <= 9.2e-05 )
		if( trueRange <= 0.035 )
			if( diPlus <= 46.0499 )
				if( smoothedDirectionalMovementMinus <= 0.007964 )
					if( diMinus <= 8.89557 )
						if( trueRange <= 0.021443 )
							if( adx <= 59.3608 )
								if( smoothedDirectionalMovementMinus <= 0.00184 )
									ret := 0.013089
								if( smoothedDirectionalMovementMinus > 0.00184 )
									ret := -0.339869
							if( adx > 59.3608 )
								if( smoothedDirectionalMovementPlus <= 0.011527 )
									ret := -0.336683
								if( smoothedDirectionalMovementPlus > 0.011527 )
									ret := 0.272727
						if( trueRange > 0.021443 )
							if( diPlus <= 36.8347 )
								if( dx <= 60.355 )
									ret := -0.190751
								if( dx > 60.355 )
									ret := -0.454315
							if( diPlus > 36.8347 )
								if( smoothedDirectionalMovementPlus <= 0.010963 )
									ret := -0.259259
								if( smoothedDirectionalMovementPlus > 0.010963 )
									ret := 0.258373
					if( diMinus > 8.89557 )
						if( smoothedTrueRange <= 0.011661 )
							if( smoothedTrueRange <= 0.004989 )
								if( smoothedDirectionalMovementPlus <= 0.001957 )
									ret := 0.151899
								if( smoothedDirectionalMovementPlus > 0.001957 )
									ret := 0.800000 // buy
							if( smoothedTrueRange > 0.004989 )
								if( trueRange <= 0.000397 )
									ret := 0.136555
								if( trueRange > 0.000397 )
									ret := 0.042373
						if( smoothedTrueRange > 0.011661 )
							if( dx <= 43.1012 )
								if( diPlus <= 30.6495 )
									ret := -0.021861
								if( diPlus > 30.6495 )
									ret := -0.101117
							if( dx > 43.1012 )
								if( smoothedTrueRange <= 0.021717 )
									ret := 0.080270
								if( smoothedTrueRange > 0.021717 )
									ret := -0.058625
				if( smoothedDirectionalMovementMinus > 0.007964 )
					if( trueRange <= 0.014472 )
						if( smoothedTrueRange <= 0.065443 )
							if( dx <= 2.70346 )
								if( smoothedTrueRange <= 0.021607 )
									ret := -0.590909
								if( smoothedTrueRange > 0.021607 )
									ret := -0.135135
							if( dx > 2.70346 )
								if( dx <= 39.0866 )
									ret := 0.180816
								if( dx > 39.0866 )
									ret := 0.345161
						if( smoothedTrueRange > 0.065443 )
							if( dx <= 49.1166 )
								if( adx <= 37.7998 )
									ret := -0.206897
								if( adx > 37.7998 )
									ret := -0.882353 // sell
							if( dx > 49.1166 )
								ret := 0.250000
					if( trueRange > 0.014472 )
						if( diPlus <= 16.1416 )
							if( dx <= 56.4427 )
								if( adx <= 41.1069 )
									ret := -0.084615
								if( adx > 41.1069 )
									ret := 0.184659
							if( dx > 56.4427 )
								if( diMinus <= 33.3289 )
									ret := 0.451613
								if( diMinus > 33.3289 )
									ret := 0.170360
						if( diPlus > 16.1416 )
							if( adx <= 33.3655 )
								if( dx <= 6.90257 )
									ret := -0.203883
								if( dx > 6.90257 )
									ret := 0.055474
							if( adx > 33.3655 )
								if( adx <= 36.7171 )
									ret := -0.502646
								if( adx > 36.7171 )
									ret := -0.142857
			if( diPlus > 46.0499 )
				if( smoothedDirectionalMovementMinus <= 0.004294 )
					if( diPlus <= 62.6024 )
						if( smoothedTrueRange <= 0.025412 )
							if( directionalMovementPlus <= 0.01994 )
								if( smoothedDirectionalMovementPlus <= 0.007336 )
									ret := -0.058030
								if( smoothedDirectionalMovementPlus > 0.007336 )
									ret := 0.146739
							if( directionalMovementPlus > 0.01994 )
								if( smoothedTrueRange <= 0.011457 )
									ret := -0.361446
								if( smoothedTrueRange > 0.011457 )
									ret := -0.108527
						if( smoothedTrueRange > 0.025412 )
							if( dx <= 85.414 )
								if( directionalMovementPlus <= 0.003841 )
									ret := 0.625000
								if( directionalMovementPlus > 0.003841 )
									ret := -0.303797
							if( dx > 85.414 )
								if( diPlus <= 57.4064 )
									ret := -0.753247 // sell
								if( diPlus > 57.4064 )
									ret := -0.166667
					if( diPlus > 62.6024 )
						if( smoothedDirectionalMovementPlus <= 0.005293 )
							if( smoothedDirectionalMovementMinus <= 0.002121 )
								if( adx <= 24.9598 )
									ret := 0.235294
								if( adx > 24.9598 )
									ret := -0.086207
							if( smoothedDirectionalMovementMinus > 0.002121 )
								ret := -0.294118
						if( smoothedDirectionalMovementPlus > 0.005293 )
							if( dx <= 84.4495 )
								if( trueRange <= 2e-05 )
									ret := -0.078125
								if( trueRange > 2e-05 )
									ret := -0.448718
							if( dx > 84.4495 )
								if( smoothedDirectionalMovementPlus <= 0.013657 )
									ret := -0.666667
								if( smoothedDirectionalMovementPlus > 0.013657 )
									ret := -0.966667 // sell
				if( smoothedDirectionalMovementMinus > 0.004294 )
					if( adx <= 33.641 )
						if( smoothedTrueRange <= 0.056223 )
							if( directionalMovementPlus <= 0.0104 )
								if( diMinus <= 33.1917 )
									ret := -0.007194
								if( diMinus > 33.1917 )
									ret := -0.295720
							if( directionalMovementPlus > 0.0104 )
								if( smoothedDirectionalMovementMinus <= 0.004962 )
									ret := -0.835443 // sell
								if( smoothedDirectionalMovementMinus > 0.004962 )
									ret := -0.441176
						if( smoothedTrueRange > 0.056223 )
							if( trueRange <= 0.007109 )
								ret := -1.000000 // sell
							if( trueRange > 0.007109 )
								ret := -0.818182 // sell
					if( adx > 33.641 )
						if( diPlus <= 47.9301 )
							if( trueRange <= 0.012116 )
								ret := -0.333333
							if( trueRange > 0.012116 )
								ret := -1.000000 // sell
						if( diPlus > 47.9301 )
							if( smoothedDirectionalMovementPlus <= 0.012337 )
								if( trueRange <= 0.011625 )
									ret := 0.024390
								if( trueRange > 0.011625 )
									ret := -0.708333 // sell
							if( smoothedDirectionalMovementPlus > 0.012337 )
								if( smoothedDirectionalMovementMinus <= 0.005678 )
									ret := -0.269231
								if( smoothedDirectionalMovementMinus > 0.005678 )
									ret := 0.314286
		if( trueRange > 0.035 )
			if( smoothedDirectionalMovementPlus <= 0.030446 )
				if( directionalMovementPlus <= 0.033134 )
					if( smoothedDirectionalMovementMinus <= 0.000847 )
						if( directionalMovementPlus <= 0.01981 )
							if( smoothedTrueRange <= 0.031967 )
								ret := -0.894737 // sell
							if( smoothedTrueRange > 0.031967 )
								if( directionalMovementPlus <= 0.010331 )
									ret := -0.388889
								if( directionalMovementPlus > 0.010331 )
									ret := -0.846154 // sell
						if( directionalMovementPlus > 0.01981 )
							if( dx <= 99.5325 )
								if( smoothedDirectionalMovementPlus <= 0.011842 )
									ret := 0.083333
								if( smoothedDirectionalMovementPlus > 0.011842 )
									ret := -0.727273 // sell
							if( dx > 99.5325 )
								ret := 0.400000
					if( smoothedDirectionalMovementMinus > 0.000847 )
						if( diPlus <= 45.9455 )
							if( smoothedTrueRange <= 0.017743 )
								if( trueRange <= 0.038197 )
									ret := -0.090909
								if( trueRange > 0.038197 )
									ret := -0.543210
							if( smoothedTrueRange > 0.017743 )
								if( adx <= 50.871 )
									ret := -0.034502
								if( adx > 50.871 )
									ret := -0.212833
						if( diPlus > 45.9455 )
							if( smoothedTrueRange <= 0.032747 )
								if( dx <= 17.3688 )
									ret := -0.733333 // sell
								if( dx > 17.3688 )
									ret := -0.014184
							if( smoothedTrueRange > 0.032747 )
								if( directionalMovementPlus <= 0.000113 )
									ret := -0.133333
								if( directionalMovementPlus > 0.000113 )
									ret := -0.671141
				if( directionalMovementPlus > 0.033134 )
					if( smoothedTrueRange <= 0.042385 )
						if( smoothedDirectionalMovementPlus <= 0.01446 )
							if( diPlus <= 75.8433 )
								if( trueRange <= 0.03911 )
									ret := -0.672269
								if( trueRange > 0.03911 )
									ret := -0.201628
							if( diPlus > 75.8433 )
								if( adx <= 29.0608 )
									ret := 0.666667
								if( adx > 29.0608 )
									ret := 0.066667
						if( smoothedDirectionalMovementPlus > 0.01446 )
							if( adx <= 14.6228 )
								if( adx <= 11.1966 )
									ret := -0.865385 // sell
								if( adx > 11.1966 )
									ret := 0.329114
							if( adx > 14.6228 )
								if( directionalMovementPlus <= 0.198746 )
									ret := -0.522936
								if( directionalMovementPlus > 0.198746 )
									ret := 0.454545
					if( smoothedTrueRange > 0.042385 )
						if( adx <= 24.1452 )
							if( adx <= 23.0979 )
								if( diMinus <= 41.8015 )
									ret := 0.123153
								if( diMinus > 41.8015 )
									ret := -0.450000
							if( adx > 23.0979 )
								if( smoothedDirectionalMovementPlus <= 0.020772 )
									ret := 0.916667 // buy
								if( smoothedDirectionalMovementPlus > 0.020772 )
									ret := -0.222222
						if( adx > 24.1452 )
							if( diMinus <= 21.9285 )
								if( dx <= 18.4126 )
									ret := 0.568627
								if( dx > 18.4126 )
									ret := -0.194245
							if( diMinus > 21.9285 )
								if( diPlus <= 21.9076 )
									ret := -0.064706
								if( diPlus > 21.9076 )
									ret := -0.649215
			if( smoothedDirectionalMovementPlus > 0.030446 )
				if( dx <= 83.083 )
					if( directionalMovementPlus <= 3.3e-05 )
						if( dx <= 77.826 )
							if( diMinus <= 9.70413 )
								ret := 0.526316
							if( diMinus > 9.70413 )
								if( dx <= 45.1501 )
									ret := 0.030303
								if( dx > 45.1501 )
									ret := -0.703704 // sell
						if( dx > 77.826 )
							ret := -1.000000 // sell
					if( directionalMovementPlus > 3.3e-05 )
						if( adx <= 25.7258 )
							if( diMinus <= 27.4112 )
								if( diMinus <= 24.1461 )
									ret := -0.384615
								if( diMinus > 24.1461 )
									ret := 0.909091 // buy
							if( diMinus > 27.4112 )
								if( adx <= 20.1158 )
									ret := -0.862069 // sell
								if( adx > 20.1158 )
									ret := -0.444444
						if( adx > 25.7258 )
							if( diPlus <= 39.3698 )
								if( diPlus <= 36.6181 )
									ret := -0.755906 // sell
								if( diPlus > 36.6181 )
									ret := 0.240000
							if( diPlus > 39.3698 )
								if( diMinus <= 6.79809 )
									ret := -0.333333
								if( diMinus > 6.79809 )
									ret := -0.904762 // sell
				if( dx > 83.083 )
					if( dx <= 97.8546 )
						if( smoothedTrueRange <= 0.135859 )
							if( smoothedDirectionalMovementMinus <= 0.00315 )
								if( diPlus <= 60.0978 )
									ret := 0.136364
								if( diPlus > 60.0978 )
									ret := -0.809524 // sell
							if( smoothedDirectionalMovementMinus > 0.00315 )
								ret := 0.142857
						if( smoothedTrueRange > 0.135859 )
							ret := 0.666667
					if( dx > 97.8546 )
						ret := -1.000000 // sell
	if( directionalMovementMinus > 9.2e-05 )
		if( smoothedDirectionalMovementPlus <= 0.030932 )
			if( diMinus <= 52.821 )
				if( dx <= 19.4826 )
					if( directionalMovementMinus <= 0.02 )
						if( smoothedDirectionalMovementPlus <= 0.01947 )
							if( diMinus <= 29.726 )
								if( diPlus <= 37.2612 )
									ret := 0.036179
								if( diPlus > 37.2612 )
									ret := 0.645833
							if( diMinus > 29.726 )
								if( directionalMovementPlus <= 0.014833 )
									ret := 0.184989
								if( directionalMovementPlus > 0.014833 )
									ret := -0.152815
						if( smoothedDirectionalMovementPlus > 0.01947 )
							if( dx <= 1.60865 )
								ret := -0.157895
							if( dx > 1.60865 )
								if( smoothedDirectionalMovementPlus <= 0.020123 )
									ret := 0.744681 // buy
								if( smoothedDirectionalMovementPlus > 0.020123 )
									ret := 0.286624
					if( directionalMovementMinus > 0.02 )
						if( trueRange <= 0.029995 )
							if( diPlus <= 25.7819 )
								if( diMinus <= 17.3086 )
									ret := 0.625000
								if( diMinus > 17.3086 )
									ret := 0.045977
							if( diPlus > 25.7819 )
								if( diMinus <= 23.4331 )
									ret := -0.300000
								if( diMinus > 23.4331 )
									ret := 0.663793
						if( trueRange > 0.029995 )
							if( dx <= 16.3938 )
								if( smoothedTrueRange <= 0.109547 )
									ret := 0.228124
								if( smoothedTrueRange > 0.109547 )
									ret := -0.866667 // sell
							if( dx > 16.3938 )
								if( diMinus <= 33.1683 )
									ret := -0.056291
								if( diMinus > 33.1683 )
									ret := 0.336134
				if( dx > 19.4826 )
					if( adx <= 44.4287 )
						if( smoothedDirectionalMovementPlus <= 0.000367 )
							if( smoothedDirectionalMovementMinus <= 0.008316 )
								if( diMinus <= 18.9238 )
									ret := 1.000000 // buy
								if( diMinus > 18.9238 )
									ret := 0.616438
							if( smoothedDirectionalMovementMinus > 0.008316 )
								ret := -0.222222
						if( smoothedDirectionalMovementPlus > 0.000367 )
							if( smoothedTrueRange <= 0.077764 )
								if( adx <= 13.9463 )
									ret := -0.162123
								if( adx > 13.9463 )
									ret := 0.038698
							if( smoothedTrueRange > 0.077764 )
								if( smoothedDirectionalMovementMinus <= 0.045586 )
									ret := -0.358079
								if( smoothedDirectionalMovementMinus > 0.045586 )
									ret := 0.416667
					if( adx > 44.4287 )
						if( directionalMovementMinus <= 0.016534 )
							if( smoothedDirectionalMovementPlus <= 0.00037 )
								if( diMinus <= 48.9106 )
									ret := 0.209945
								if( diMinus > 48.9106 )
									ret := 0.575758
							if( smoothedDirectionalMovementPlus > 0.00037 )
								if( trueRange <= 0.030435 )
									ret := -0.048101
								if( trueRange > 0.030435 )
									ret := -0.245968
						if( directionalMovementMinus > 0.016534 )
							if( smoothedDirectionalMovementMinus <= 0.048385 )
								if( diMinus <= 12.0871 )
									ret := -0.371069
								if( diMinus > 12.0871 )
									ret := 0.077348
							if( smoothedDirectionalMovementMinus > 0.048385 )
								ret := 0.884615 // buy
			if( diMinus > 52.821 )
				if( smoothedTrueRange <= 0.035853 )
					if( diPlus <= 10.7886 )
						if( smoothedTrueRange <= 0.016354 )
							if( adx <= 47.1175 )
								if( adx <= 36.2845 )
									ret := 0.363636
								if( adx > 36.2845 )
									ret := 1.000000 // buy
							if( adx > 47.1175 )
								if( diMinus <= 61.1614 )
									ret := 0.388889
								if( diMinus > 61.1614 )
									ret := 0.800000 // buy
						if( smoothedTrueRange > 0.016354 )
							if( adx <= 65.3477 )
								if( diPlus <= 0.033822 )
									ret := 0.562500
								if( diPlus > 0.033822 )
									ret := -0.010753
							if( adx > 65.3477 )
								if( directionalMovementMinus <= 0.018672 )
									ret := 1.000000 // buy
								if( directionalMovementMinus > 0.018672 )
									ret := 0.769231 // buy
					if( diPlus > 10.7886 )
						if( dx <= 62.5831 )
							if( dx <= 46.6074 )
								if( directionalMovementPlus <= 0.014645 )
									ret := 0.481219
								if( directionalMovementPlus > 0.014645 )
									ret := -0.090909
							if( dx > 46.6074 )
								if( dx <= 49.8696 )
									ret := -0.354167
								if( dx > 49.8696 )
									ret := 0.352423
						if( dx > 62.5831 )
							if( smoothedDirectionalMovementPlus <= 0.001433 )
								if( diMinus <= 74.9173 )
									ret := 0.714286 // buy
								if( diMinus > 74.9173 )
									ret := 0.000000
							if( smoothedDirectionalMovementPlus > 0.001433 )
								if( diMinus <= 69.718 )
									ret := 0.755556 // buy
								if( diMinus > 69.718 )
									ret := 1.000000 // buy
				if( smoothedTrueRange > 0.035853 )
					if( diPlus <= 20.5482 )
						if( diMinus <= 69.771 )
							if( directionalMovementMinus <= 0.019378 )
								if( diMinus <= 54.4058 )
									ret := -0.625000
								if( diMinus > 54.4058 )
									ret := 0.336735
							if( directionalMovementMinus > 0.019378 )
								if( trueRange <= 0.054726 )
									ret := 0.037736
								if( trueRange > 0.054726 )
									ret := -0.482301
						if( diMinus > 69.771 )
							if( adx <= 38.4326 )
								ret := 1.000000 // buy
							if( adx > 38.4326 )
								if( smoothedDirectionalMovementPlus <= 0.005233 )
									ret := 1.000000 // buy
								if( smoothedDirectionalMovementPlus > 0.005233 )
									ret := 0.500000
					if( diPlus > 20.5482 )
						if( adx <= 23.7661 )
							if( smoothedDirectionalMovementMinus <= 0.022743 )
								if( directionalMovementMinus <= 0.017226 )
									ret := 0.600000
								if( directionalMovementMinus > 0.017226 )
									ret := -0.878788 // sell
							if( smoothedDirectionalMovementMinus > 0.022743 )
								if( smoothedDirectionalMovementMinus <= 0.034351 )
									ret := 0.557377
								if( smoothedDirectionalMovementMinus > 0.034351 )
									ret := -0.388889
						if( adx > 23.7661 )
							if( directionalMovementPlus <= 0.023576 )
								if( smoothedDirectionalMovementMinus <= 0.033436 )
									ret := 0.715447 // buy
								if( smoothedDirectionalMovementMinus > 0.033436 )
									ret := 1.000000 // buy
							if( directionalMovementPlus > 0.023576 )
								ret := 0.000000
		if( smoothedDirectionalMovementPlus > 0.030932 )
			if( dx <= 71.0976 )
				if( directionalMovementMinus <= 0.095324 )
					if( smoothedTrueRange <= 0.106008 )
						if( diMinus <= 42.4642 )
							if( trueRange <= 0.04829 )
								if( adx <= 37.4961 )
									ret := 0.090909
								if( adx > 37.4961 )
									ret := 0.785714 // buy
							if( trueRange > 0.04829 )
								if( adx <= 65.0699 )
									ret := -0.611570
								if( adx > 65.0699 )
									ret := 0.200000
						if( diMinus > 42.4642 )
							ret := 0.769231 // buy
					if( smoothedTrueRange > 0.106008 )
						if( diPlus <= 48.5087 )
							if( smoothedDirectionalMovementMinus <= 0.015094 )
								ret := -1.000000 // sell
							if( smoothedDirectionalMovementMinus > 0.015094 )
								if( diPlus <= 21.1159 )
									ret := -0.300000
								if( diPlus > 21.1159 )
									ret := -0.868421 // sell
						if( diPlus > 48.5087 )
							ret := -0.111111
				if( directionalMovementMinus > 0.095324 )
					if( smoothedDirectionalMovementMinus <= 0.04408 )
						if( diPlus <= 48.8376 )
							if( smoothedTrueRange <= 0.090543 )
								ret := -0.333333
							if( smoothedTrueRange > 0.090543 )
								if( adx <= 41.1014 )
									ret := 0.333333
								if( adx > 41.1014 )
									ret := 0.666667
						if( diPlus > 48.8376 )
							ret := 1.000000 // buy
					if( smoothedDirectionalMovementMinus > 0.04408 )
						ret := -0.545455
			if( dx > 71.0976 )
				if( diMinus <= 2.31002 )
					ret := -0.666667
				if( diMinus > 2.31002 )
					if( dx <= 81.8967 )
						if( dx <= 79.8864 )
							if( dx <= 76.6601 )
								ret := 0.142857
							if( dx > 76.6601 )
								ret := 1.000000 // buy
						if( dx > 79.8864 )
							ret := -0.800000 // sell
					if( dx > 81.8967 )
						ret := 0.750000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator ADX_and_DI 
//@version=5
// This source code is subject to the terms of the Mozilla Public License 2.0 at https://mozilla.org/MPL/2.0/
// © BeikabuOyaji

//indicator "ADX and DI for v5", overlay=false)

// Input parameters
len = input(14, title="Length")
th = input(20, title="Threshold")

// Calculate True Range
trueRange = math.max(math.max(high - low, math.abs(high - nz(close[1]))), math.abs(low - nz(close[1])))

// Calculate Directional Movements
directionalMovementPlus = high - nz(high[1]) > nz(low[1]) - low ? math.max(high - nz(high[1]), 0) : 0
directionalMovementMinus = nz(low[1]) - low > high - nz(high[1]) ? math.max(nz(low[1]) - low, 0) : 0

// Initialize and calculate smoothed values
var float smoothedTrueRange = 0
var float smoothedDirectionalMovementPlus = 0
var float smoothedDirectionalMovementMinus = 0

smoothedTrueRange := nz(smoothedTrueRange[1]) - (nz(smoothedTrueRange[1]) / len) + trueRange
smoothedDirectionalMovementPlus := nz(smoothedDirectionalMovementPlus[1]) - (nz(smoothedDirectionalMovementPlus[1]) / len) + directionalMovementPlus
smoothedDirectionalMovementMinus := nz(smoothedDirectionalMovementMinus[1]) - (nz(smoothedDirectionalMovementMinus[1]) / len) + directionalMovementMinus

// Calculate DI+ and DI-
diPlus = (smoothedDirectionalMovementPlus / smoothedTrueRange) * 100
diMinus = (smoothedDirectionalMovementMinus / smoothedTrueRange) * 100

// Calculate DX and ADX
dx = math.abs(diPlus - diMinus) / (diPlus + diMinus) * 100
adx = ta.sma(dx, len)

// Plot DI+, DI-, and ADX
plot(diPlus, color=color.green, title="DI+")
plot(diMinus, color=color.red, title="DI-")
plot(adx, color=color.navy, title="ADX")

// Plot threshold line
hline(th, "Threshold", color=color.black)

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
float op_operation = decision_tree_0_LYFT_1Min_d4a5cfd5(dx, directionalMovementMinus, diPlus, smoothedDirectionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedTrueRange, directionalMovementPlus, diMinus, adx)

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


