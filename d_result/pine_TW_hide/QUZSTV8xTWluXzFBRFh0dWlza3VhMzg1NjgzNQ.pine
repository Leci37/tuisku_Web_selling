//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: ADX_and_DI
// ID_model: AFRM_1Min_1ADX_a3856835 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AFRM_1Min_1ADX_a3856835", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AFRM_1Min_a3856835(smoothedDirectionalMovementMinus, directionalMovementMinus, diMinus, dx, directionalMovementPlus, smoothedDirectionalMovementPlus, adx, trueRange, smoothedTrueRange, diPlus)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( directionalMovementPlus <= 0.076585 )
		if( diMinus <= 42.9446 )
			if( adx <= 10.956 )
				if( smoothedDirectionalMovementMinus <= 0.029801 )
					if( diPlus <= 20.8364 )
						if( diMinus <= 31.6584 )
							if( diMinus <= 19.4748 )
								if( diPlus <= 15.6235 )
									ret := 0.000000
								if( diPlus > 15.6235 )
									ret := 0.677419
							if( diMinus > 19.4748 )
								if( diPlus <= 16.1915 )
									ret := -0.307692
								if( diPlus > 16.1915 )
									ret := 0.202247
						if( diMinus > 31.6584 )
							if( dx <= 32.8127 )
								if( diPlus <= 18.9525 )
									ret := -0.600000
								if( diPlus > 18.9525 )
									ret := -1.000000 // sell
							if( dx > 32.8127 )
								ret := 0.000000
					if( diPlus > 20.8364 )
						if( diMinus <= 32.1503 )
							if( diMinus <= 19.1331 )
								if( diPlus <= 21.3617 )
									ret := -0.600000
								if( diPlus > 21.3617 )
									ret := 0.217391
							if( diMinus > 19.1331 )
								if( smoothedTrueRange <= 0.053862 )
									ret := -0.375000
								if( smoothedTrueRange > 0.053862 )
									ret := -0.168067
						if( diMinus > 32.1503 )
							if( directionalMovementMinus <= 0.003492 )
								if( adx <= 9.38932 )
									ret := 0.169492
								if( adx > 9.38932 )
									ret := -0.202020
							if( directionalMovementMinus > 0.003492 )
								if( trueRange <= 0.054426 )
									ret := 0.412500
								if( trueRange > 0.054426 )
									ret := 0.019231
				if( smoothedDirectionalMovementMinus > 0.029801 )
					if( diPlus <= 19.6758 )
						if( dx <= 19.0999 )
							if( directionalMovementMinus <= 0.0705 )
								if( smoothedTrueRange <= 0.181557 )
									ret := 0.307692
								if( smoothedTrueRange > 0.181557 )
									ret := -0.555556
							if( directionalMovementMinus > 0.0705 )
								if( diPlus <= 16.0151 )
									ret := 0.500000
								if( diPlus > 16.0151 )
									ret := 1.000000 // buy
						if( dx > 19.0999 )
							if( trueRange <= 0.179734 )
								ret := -1.000000 // sell
							if( trueRange > 0.179734 )
								ret := -0.750000 // sell
					if( diPlus > 19.6758 )
						if( trueRange <= 0.130335 )
							if( diMinus <= 32.9014 )
								if( smoothedTrueRange <= 0.132496 )
									ret := -0.916667 // sell
								if( smoothedTrueRange > 0.132496 )
									ret := -0.510204
							if( diMinus > 32.9014 )
								if( diPlus <= 43.6827 )
									ret := 0.187500
								if( diPlus > 43.6827 )
									ret := -0.692308
						if( trueRange > 0.130335 )
							if( dx <= 2.78508 )
								ret := -0.200000
							if( dx > 2.78508 )
								if( diMinus <= 40.1332 )
									ret := -0.919355 // sell
								if( diMinus > 40.1332 )
									ret := -0.250000
			if( adx > 10.956 )
				if( trueRange <= 0.050002 )
					if( diPlus <= 30.4441 )
						if( smoothedDirectionalMovementMinus <= 0.018751 )
							if( smoothedTrueRange <= 0.067529 )
								if( diPlus <= 5.43021 )
									ret := -0.198758
								if( diPlus > 5.43021 )
									ret := 0.022160
							if( smoothedTrueRange > 0.067529 )
								if( adx <= 53.0466 )
									ret := 0.169448
								if( adx > 53.0466 )
									ret := -0.203704
						if( smoothedDirectionalMovementMinus > 0.018751 )
							if( adx <= 58.5053 )
								if( smoothedDirectionalMovementMinus <= 0.020168 )
									ret := 0.185115
								if( smoothedDirectionalMovementMinus > 0.020168 )
									ret := 0.047257
							if( adx > 58.5053 )
								if( adx <= 68.0701 )
									ret := 0.453333
								if( adx > 68.0701 )
									ret := 0.075000
					if( diPlus > 30.4441 )
						if( diMinus <= 30.5812 )
							if( diPlus <= 81.1121 )
								if( adx <= 53.5692 )
									ret := -0.062693
								if( adx > 53.5692 )
									ret := 0.022835
							if( diPlus > 81.1121 )
								if( smoothedDirectionalMovementMinus <= 0.006113 )
									ret := -0.200000
								if( smoothedDirectionalMovementMinus > 0.006113 )
									ret := 0.875000 // buy
						if( diMinus > 30.5812 )
							if( smoothedTrueRange <= 0.063477 )
								if( diPlus <= 46.6356 )
									ret := -0.082633
								if( diPlus > 46.6356 )
									ret := 0.105717
							if( smoothedTrueRange > 0.063477 )
								if( smoothedDirectionalMovementPlus <= 0.04429 )
									ret := 0.282353
								if( smoothedDirectionalMovementPlus > 0.04429 )
									ret := -0.169811
				if( trueRange > 0.050002 )
					if( diPlus <= 11.4576 )
						if( diMinus <= 22.2429 )
							if( trueRange <= 0.0998 )
								if( smoothedDirectionalMovementMinus <= 0.011317 )
									ret := -0.062500
								if( smoothedDirectionalMovementMinus > 0.011317 )
									ret := 0.698925
							if( trueRange > 0.0998 )
								if( directionalMovementMinus <= 0.028282 )
									ret := -0.235294
								if( directionalMovementMinus > 0.028282 )
									ret := 0.464286
						if( diMinus > 22.2429 )
							if( adx <= 82.14 )
								if( diMinus <= 35.915 )
									ret := -0.133052
								if( diMinus > 35.915 )
									ret := 0.032951
							if( adx > 82.14 )
								if( dx <= 65.5298 )
									ret := -0.600000
								if( dx > 65.5298 )
									ret := 0.821429 // buy
					if( diPlus > 11.4576 )
						if( directionalMovementPlus <= 7.8e-05 )
							if( diMinus <= 7.99899 )
								if( directionalMovementMinus <= 0.020151 )
									ret := -0.009646
								if( directionalMovementMinus > 0.020151 )
									ret := -0.333333
							if( diMinus > 7.99899 )
								if( smoothedDirectionalMovementPlus <= 0.07498 )
									ret := 0.063480
								if( smoothedDirectionalMovementPlus > 0.07498 )
									ret := -0.126761
						if( directionalMovementPlus > 7.8e-05 )
							if( directionalMovementPlus <= 0.019913 )
								if( adx <= 38.6344 )
									ret := 0.124721
								if( adx > 38.6344 )
									ret := 0.235364
							if( directionalMovementPlus > 0.019913 )
								if( diPlus <= 43.5553 )
									ret := 0.092002
								if( diPlus > 43.5553 )
									ret := -0.032258
		if( diMinus > 42.9446 )
			if( trueRange <= 0.130018 )
				if( diPlus <= 26.0276 )
					if( smoothedDirectionalMovementMinus <= 0.040844 )
						if( dx <= 94.5392 )
							if( dx <= 92.3587 )
								if( diMinus <= 44.9723 )
									ret := 0.127690
								if( diMinus > 44.9723 )
									ret := -0.032068
							if( dx > 92.3587 )
								if( adx <= 39.4396 )
									ret := 0.111111
								if( adx > 39.4396 )
									ret := -0.597561
						if( dx > 94.5392 )
							if( adx <= 58.2962 )
								if( directionalMovementMinus <= 0.06172 )
									ret := -0.071429
								if( directionalMovementMinus > 0.06172 )
									ret := 0.857143 // buy
							if( adx > 58.2962 )
								if( trueRange <= 0.044884 )
									ret := 0.676471
								if( trueRange > 0.044884 )
									ret := 0.340426
					if( smoothedDirectionalMovementMinus > 0.040844 )
						if( diPlus <= 6.36757 )
							if( smoothedDirectionalMovementPlus <= 0.017673 )
								if( smoothedTrueRange <= 0.106864 )
									ret := 0.167832
								if( smoothedTrueRange > 0.106864 )
									ret := 0.538462
							if( smoothedDirectionalMovementPlus > 0.017673 )
								if( adx <= 85.538 )
									ret := 0.000000
								if( adx > 85.538 )
									ret := -1.000000 // sell
						if( diPlus > 6.36757 )
							if( diPlus <= 10.2579 )
								if( adx <= 41.1686 )
									ret := 0.031579
								if( adx > 41.1686 )
									ret := -0.466216
							if( diPlus > 10.2579 )
								if( diPlus <= 11.7962 )
									ret := 0.650000
								if( diPlus > 11.7962 )
									ret := 0.133452
				if( diPlus > 26.0276 )
					if( directionalMovementMinus <= 0.001453 )
						if( diPlus <= 45.7369 )
							if( diMinus <= 70.5367 )
								if( dx <= 4.74044 )
									ret := 0.343023
								if( dx > 4.74044 )
									ret := 0.114176
							if( diMinus > 70.5367 )
								if( diMinus <= 72.029 )
									ret := 1.000000 // buy
								if( diMinus > 72.029 )
									ret := 0.444444
						if( diPlus > 45.7369 )
							if( smoothedDirectionalMovementPlus <= 0.021736 )
								if( adx <= 9.05898 )
									ret := 0.461538
								if( adx > 9.05898 )
									ret := 0.030612
							if( smoothedDirectionalMovementPlus > 0.021736 )
								if( dx <= 8.35132 )
									ret := -0.250000
								if( dx > 8.35132 )
									ret := 0.152542
					if( directionalMovementMinus > 0.001453 )
						if( diPlus <= 50.6409 )
							if( trueRange <= 0.006736 )
								if( smoothedTrueRange <= 0.09662 )
									ret := 0.707692 // buy
								if( smoothedTrueRange > 0.09662 )
									ret := -0.200000
							if( trueRange > 0.006736 )
								if( trueRange <= 0.081365 )
									ret := 0.194681
								if( trueRange > 0.081365 )
									ret := 0.351946
						if( diPlus > 50.6409 )
							if( smoothedTrueRange <= 0.057693 )
								if( adx <= 16.8504 )
									ret := -0.185185
								if( adx > 16.8504 )
									ret := 0.394737
							if( smoothedTrueRange > 0.057693 )
								if( diMinus <= 46.6362 )
									ret := -0.492308
								if( diMinus > 46.6362 )
									ret := 0.285714
			if( trueRange > 0.130018 )
				if( diMinus <= 60.3458 )
					if( diMinus <= 58.7578 )
						if( trueRange <= 0.905674 )
							if( dx <= 10.0405 )
								if( diPlus <= 52.092 )
									ret := 0.053333
								if( diPlus > 52.092 )
									ret := -1.000000 // sell
							if( dx > 10.0405 )
								if( dx <= 18.9863 )
									ret := 0.632530
								if( dx > 18.9863 )
									ret := 0.249562
						if( trueRange > 0.905674 )
							if( trueRange <= 1.67888 )
								ret := -1.000000 // sell
							if( trueRange > 1.67888 )
								ret := -0.400000
					if( diMinus > 58.7578 )
						if( dx <= 35.411 )
							if( directionalMovementMinus <= 0.256199 )
								if( adx <= 18.359 )
									ret := 0.500000
								if( adx > 18.359 )
									ret := 1.000000 // buy
							if( directionalMovementMinus > 0.256199 )
								ret := -0.200000
						if( dx > 35.411 )
							if( trueRange <= 0.164788 )
								if( smoothedDirectionalMovementMinus <= 0.05837 )
									ret := -0.800000 // sell
								if( smoothedDirectionalMovementMinus > 0.05837 )
									ret := 0.750000 // buy
							if( trueRange > 0.164788 )
								if( trueRange <= 0.240674 )
									ret := -1.000000 // sell
								if( trueRange > 0.240674 )
									ret := -0.583333
				if( diMinus > 60.3458 )
					if( dx <= 67.2065 )
						if( diMinus <= 74.1499 )
							if( dx <= 25.8973 )
								ret := -0.142857
							if( dx > 25.8973 )
								if( trueRange <= 0.139759 )
									ret := 0.153846
								if( trueRange > 0.139759 )
									ret := 0.784314 // buy
						if( diMinus > 74.1499 )
							if( dx <= 55.2127 )
								ret := -0.857143 // sell
							if( dx > 55.2127 )
								if( smoothedDirectionalMovementMinus <= 0.041521 )
									ret := 0.857143 // buy
								if( smoothedDirectionalMovementMinus > 0.041521 )
									ret := 0.500000
					if( dx > 67.2065 )
						if( smoothedTrueRange <= 0.12702 )
							if( diMinus <= 80.5325 )
								if( trueRange <= 0.190624 )
									ret := 0.000000
								if( trueRange > 0.190624 )
									ret := -0.875000 // sell
							if( diMinus > 80.5325 )
								if( dx <= 75.4912 )
									ret := -0.428571
								if( dx > 75.4912 )
									ret := 0.800000 // buy
						if( smoothedTrueRange > 0.12702 )
							if( diMinus <= 64.5668 )
								ret := -0.250000
							if( diMinus > 64.5668 )
								if( diMinus <= 72.6711 )
									ret := 1.000000 // buy
								if( diMinus > 72.6711 )
									ret := 0.333333
	if( directionalMovementPlus > 0.076585 )
		if( diMinus <= 31.728 )
			if( trueRange <= 0.841974 )
				if( diPlus <= 44.777 )
					if( directionalMovementPlus <= 0.07778 )
						if( diMinus <= 4.8003 )
							ret := 0.500000
						if( diMinus > 4.8003 )
							if( smoothedDirectionalMovementMinus <= 0.036137 )
								if( diMinus <= 24.8063 )
									ret := -0.593750
								if( diMinus > 24.8063 )
									ret := -1.000000 // sell
							if( smoothedDirectionalMovementMinus > 0.036137 )
								ret := 0.500000
					if( directionalMovementPlus > 0.07778 )
						if( adx <= 32.1425 )
							if( dx <= 5.17957 )
								if( diPlus <= 18.169 )
									ret := -0.600000
								if( diPlus > 18.169 )
									ret := 0.438356
							if( dx > 5.17957 )
								if( adx <= 29.5914 )
									ret := 0.018170
								if( adx > 29.5914 )
									ret := 0.303318
						if( adx > 32.1425 )
							if( dx <= 53.7569 )
								if( diMinus <= 10.4454 )
									ret := -0.702703 // sell
								if( diMinus > 10.4454 )
									ret := -0.081395
							if( dx > 53.7569 )
								if( diMinus <= 9.51006 )
									ret := 0.098592
								if( diMinus > 9.51006 )
									ret := 0.510638
				if( diPlus > 44.777 )
					if( adx <= 54.5242 )
						if( dx <= 66.0641 )
							if( smoothedTrueRange <= 0.071463 )
								if( trueRange <= 0.46 )
									ret := -0.305296
								if( trueRange > 0.46 )
									ret := 1.000000 // buy
							if( smoothedTrueRange > 0.071463 )
								if( directionalMovementPlus <= 0.283098 )
									ret := 0.017544
								if( directionalMovementPlus > 0.283098 )
									ret := -0.494118
						if( dx > 66.0641 )
							if( adx <= 15.9115 )
								ret := 1.000000 // buy
							if( adx > 15.9115 )
								if( directionalMovementPlus <= 0.093597 )
									ret := -0.056604
								if( directionalMovementPlus > 0.093597 )
									ret := -0.511737
					if( adx > 54.5242 )
						if( smoothedDirectionalMovementMinus <= 0.022006 )
							if( trueRange <= 0.373261 )
								if( directionalMovementPlus <= 0.202444 )
									ret := -0.315789
								if( directionalMovementPlus > 0.202444 )
									ret := 0.600000
							if( trueRange > 0.373261 )
								if( directionalMovementPlus <= 0.442997 )
									ret := 1.000000 // buy
								if( directionalMovementPlus > 0.442997 )
									ret := 0.500000
						if( smoothedDirectionalMovementMinus > 0.022006 )
							if( adx <= 74.2646 )
								if( diPlus <= 64.1426 )
									ret := 0.760000 // buy
								if( diPlus > 64.1426 )
									ret := 1.000000 // buy
							if( adx > 74.2646 )
								ret := -0.500000
			if( trueRange > 0.841974 )
				if( adx <= 49.3803 )
					if( smoothedDirectionalMovementPlus <= 0.158885 )
						if( smoothedDirectionalMovementPlus <= 0.104391 )
							if( smoothedTrueRange <= 0.189855 )
								ret := 1.000000 // buy
							if( smoothedTrueRange > 0.189855 )
								ret := 0.200000
						if( smoothedDirectionalMovementPlus > 0.104391 )
							ret := 1.000000 // buy
					if( smoothedDirectionalMovementPlus > 0.158885 )
						ret := 0.000000
				if( adx > 49.3803 )
					ret := 1.000000 // buy
		if( diMinus > 31.728 )
			if( diPlus <= 37.9289 )
				if( dx <= 2.28703 )
					if( smoothedTrueRange <= 0.066171 )
						if( diMinus <= 33.2068 )
							ret := -1.000000 // sell
						if( diMinus > 33.2068 )
							if( diPlus <= 37.4169 )
								if( directionalMovementPlus <= 0.088489 )
									ret := 0.250000
								if( directionalMovementPlus > 0.088489 )
									ret := 0.000000
							if( diPlus > 37.4169 )
								ret := -0.750000 // sell
					if( smoothedTrueRange > 0.066171 )
						if( smoothedTrueRange <= 0.147132 )
							if( adx <= 26.3733 )
								ret := -1.000000 // sell
							if( adx > 26.3733 )
								ret := -0.750000 // sell
						if( smoothedTrueRange > 0.147132 )
							ret := -0.333333
				if( dx > 2.28703 )
					if( directionalMovementMinus <= 0.008172 )
						if( adx <= 35.3472 )
							if( diPlus <= 35.9616 )
								if( smoothedTrueRange <= 0.120045 )
									ret := -0.056452
								if( smoothedTrueRange > 0.120045 )
									ret := -0.307692
							if( diPlus > 35.9616 )
								if( smoothedDirectionalMovementPlus <= 0.032963 )
									ret := 0.033333
								if( smoothedDirectionalMovementPlus > 0.032963 )
									ret := 0.809524 // buy
						if( adx > 35.3472 )
							if( smoothedTrueRange <= 0.067752 )
								if( smoothedDirectionalMovementPlus <= 0.019242 )
									ret := -0.500000
								if( smoothedDirectionalMovementPlus > 0.019242 )
									ret := 0.750000 // buy
							if( smoothedTrueRange > 0.067752 )
								if( adx <= 48.2798 )
									ret := 0.295775
								if( adx > 48.2798 )
									ret := 0.037209
					if( directionalMovementMinus > 0.008172 )
						if( diMinus <= 42.3447 )
							if( smoothedDirectionalMovementPlus <= 0.0401 )
								if( diMinus <= 41.4348 )
									ret := 0.513514
								if( diMinus > 41.4348 )
									ret := -0.600000
							if( smoothedDirectionalMovementPlus > 0.0401 )
								ret := -1.000000 // sell
						if( diMinus > 42.3447 )
							if( smoothedTrueRange <= 0.087936 )
								if( adx <= 25.755 )
									ret := 1.000000 // buy
								if( adx > 25.755 )
									ret := -0.666667
							if( smoothedTrueRange > 0.087936 )
								if( directionalMovementPlus <= 0.081242 )
									ret := 0.000000
								if( directionalMovementPlus > 0.081242 )
									ret := 0.904762 // buy
			if( diPlus > 37.9289 )
				if( dx <= 1.13944 )
					if( trueRange <= 0.195175 )
						if( diMinus <= 43.8064 )
							if( smoothedTrueRange <= 0.100426 )
								if( trueRange <= 0.100482 )
									ret := 0.000000
								if( trueRange > 0.100482 )
									ret := -0.875000 // sell
							if( smoothedTrueRange > 0.100426 )
								ret := 0.500000
						if( diMinus > 43.8064 )
							if( directionalMovementMinus <= 0.000284 )
								if( directionalMovementPlus <= 0.125 )
									ret := 0.588235
								if( directionalMovementPlus > 0.125 )
									ret := -0.250000
							if( directionalMovementMinus > 0.000284 )
								ret := 1.000000 // buy
					if( trueRange > 0.195175 )
						if( diPlus <= 44.8346 )
							ret := 1.000000 // buy
						if( diPlus > 44.8346 )
							ret := 0.250000
				if( dx > 1.13944 )
					if( diMinus <= 58.2338 )
						if( smoothedDirectionalMovementPlus <= 0.054639 )
							if( diMinus <= 45.4955 )
								if( smoothedTrueRange <= 0.066077 )
									ret := -0.389571
								if( smoothedTrueRange > 0.066077 )
									ret := -0.123288
							if( diMinus > 45.4955 )
								if( diMinus <= 52.4057 )
									ret := -0.654206
								if( diMinus > 52.4057 )
									ret := -0.171875
						if( smoothedDirectionalMovementPlus > 0.054639 )
							if( directionalMovementPlus <= 0.090849 )
								if( smoothedTrueRange <= 0.149904 )
									ret := -0.600000
								if( smoothedTrueRange > 0.149904 )
									ret := 0.500000
							if( directionalMovementPlus > 0.090849 )
								if( adx <= 26.7053 )
									ret := -0.836364 // sell
								if( adx > 26.7053 )
									ret := -0.187500
					if( diMinus > 58.2338 )
						ret := 1.000000 // buy
	
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
float op_operation = decision_tree_0_AFRM_1Min_a3856835(smoothedDirectionalMovementMinus, directionalMovementMinus, diMinus, dx, directionalMovementPlus, smoothedDirectionalMovementPlus, adx, trueRange, smoothedTrueRange, diPlus)

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


