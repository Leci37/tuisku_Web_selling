//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: ADX_and_DI
// ID_model: CRWD_15Min_1ADX_0eab5b08 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_15Min_1ADX_0eab5b08", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_15Min_0eab5b08(dx, directionalMovementMinus, diPlus, smoothedDirectionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedTrueRange, directionalMovementPlus, diMinus, adx)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( directionalMovementMinus <= 0.204517 )
		if( diMinus <= 31.3307 )
			if( diPlus <= 14.0817 )
				if( smoothedDirectionalMovementMinus <= 0.264705 )
					if( diMinus <= 29.8892 )
						if( dx <= 7.88082 )
							if( directionalMovementMinus <= 0.146358 )
								if( smoothedDirectionalMovementPlus <= 0.097855 )
									ret := 0.320000
								if( smoothedDirectionalMovementPlus > 0.097855 )
									ret := 0.694444
							if( directionalMovementMinus > 0.146358 )
								ret := 0.000000
						if( dx > 7.88082 )
							if( diPlus <= 6.43435 )
								if( diMinus <= 26.7047 )
									ret := 0.172043
								if( diMinus > 26.7047 )
									ret := 0.525253
							if( diPlus > 6.43435 )
								if( adx <= 31.1427 )
									ret := 0.167535
								if( adx > 31.1427 )
									ret := -0.016502
					if( diMinus > 29.8892 )
						if( directionalMovementMinus <= 0.000641 )
							if( smoothedDirectionalMovementPlus <= 0.101391 )
								if( smoothedDirectionalMovementMinus <= 0.22208 )
									ret := 0.191781
								if( smoothedDirectionalMovementMinus > 0.22208 )
									ret := -0.076923
							if( smoothedDirectionalMovementPlus > 0.101391 )
								ret := 0.571429
						if( directionalMovementMinus > 0.000641 )
							if( smoothedDirectionalMovementMinus <= 0.184179 )
								if( directionalMovementMinus <= 0.086313 )
									ret := 0.702703 // buy
								if( directionalMovementMinus > 0.086313 )
									ret := -0.533333
							if( smoothedDirectionalMovementMinus > 0.184179 )
								if( adx <= 28.1332 )
									ret := 0.272727
								if( adx > 28.1332 )
									ret := 0.792453 // buy
				if( smoothedDirectionalMovementMinus > 0.264705 )
					if( directionalMovementPlus <= 0.9879 )
						if( dx <= 22.4208 )
							if( diPlus <= 12.0582 )
								ret := -0.117647
							if( diPlus > 12.0582 )
								if( smoothedDirectionalMovementMinus <= 0.302648 )
									ret := 0.000000
								if( smoothedDirectionalMovementMinus > 0.302648 )
									ret := 0.670886
						if( dx > 22.4208 )
							if( directionalMovementPlus <= 0.856517 )
								if( adx <= 70.2284 )
									ret := -0.071384
								if( adx > 70.2284 )
									ret := 0.593220
							if( directionalMovementPlus > 0.856517 )
								if( diPlus <= 8.21217 )
									ret := -1.000000 // sell
								if( diPlus > 8.21217 )
									ret := -0.200000
					if( directionalMovementPlus > 0.9879 )
						if( adx <= 56.7663 )
							if( adx <= 32.507 )
								if( trueRange <= 2.06 )
									ret := 0.900000 // buy
								if( trueRange > 2.06 )
									ret := 0.333333
							if( adx > 32.507 )
								if( dx <= 44.3136 )
									ret := -0.066667
								if( dx > 44.3136 )
									ret := 0.500000
						if( adx > 56.7663 )
							if( dx <= 46.7354 )
								ret := 1.000000 // buy
							if( dx > 46.7354 )
								ret := 0.800000 // buy
			if( diPlus > 14.0817 )
				if( diPlus <= 37.9776 )
					if( adx <= 12.0283 )
						if( smoothedTrueRange <= 2.43745 )
							if( adx <= 11.9847 )
								if( dx <= 34.532 )
									ret := -0.196796
								if( dx > 34.532 )
									ret := 0.500000
							if( adx > 11.9847 )
								ret := -1.000000 // sell
						if( smoothedTrueRange > 2.43745 )
							if( adx <= 10.9466 )
								ret := -0.200000
							if( adx > 10.9466 )
								if( smoothedTrueRange <= 2.65787 )
									ret := 0.692308
								if( smoothedTrueRange > 2.65787 )
									ret := 0.900000 // buy
					if( adx > 12.0283 )
						if( diMinus <= 0.532447 )
							if( smoothedDirectionalMovementPlus <= 0.46061 )
								ret := -0.307692
							if( smoothedDirectionalMovementPlus > 0.46061 )
								if( smoothedDirectionalMovementPlus <= 0.74219 )
									ret := -0.909091 // sell
								if( smoothedDirectionalMovementPlus > 0.74219 )
									ret := -1.000000 // sell
						if( diMinus > 0.532447 )
							if( diPlus <= 34.693 )
								if( smoothedDirectionalMovementMinus <= 0.897139 )
									ret := -0.029703
								if( smoothedDirectionalMovementMinus > 0.897139 )
									ret := -0.436364
							if( diPlus > 34.693 )
								if( directionalMovementMinus <= 0.001027 )
									ret := -0.014035
								if( directionalMovementMinus > 0.001027 )
									ret := 0.203704
				if( diPlus > 37.9776 )
					if( smoothedDirectionalMovementMinus <= 0.000357 )
						if( diPlus <= 48.0098 )
							ret := 0.153846
						if( diPlus > 48.0098 )
							if( directionalMovementPlus <= 0.404349 )
								ret := 0.736842 // buy
							if( directionalMovementPlus > 0.404349 )
								ret := 0.444444
					if( smoothedDirectionalMovementMinus > 0.000357 )
						if( adx <= 77.9377 )
							if( smoothedDirectionalMovementPlus <= 0.135035 )
								if( diMinus <= 21.2051 )
									ret := -0.343662
								if( diMinus > 21.2051 )
									ret := -0.120833
							if( smoothedDirectionalMovementPlus > 0.135035 )
								if( diMinus <= 3.60647 )
									ret := -0.287020
								if( diMinus > 3.60647 )
									ret := -0.079285
						if( adx > 77.9377 )
							if( dx <= 74.1531 )
								if( trueRange <= 0.285 )
									ret := 0.466667
								if( trueRange > 0.285 )
									ret := 0.942308 // buy
							if( dx > 74.1531 )
								if( smoothedDirectionalMovementPlus <= 0.488463 )
									ret := 0.333333
								if( smoothedDirectionalMovementPlus > 0.488463 )
									ret := -0.391304
		if( diMinus > 31.3307 )
			if( adx <= 13.7062 )
				if( directionalMovementMinus <= 1.3e-05 )
					if( directionalMovementPlus <= 1.20798 )
						if( smoothedDirectionalMovementPlus <= 0.138513 )
							if( diMinus <= 39.9202 )
								if( smoothedDirectionalMovementPlus <= 0.109044 )
									ret := 0.071429
								if( smoothedDirectionalMovementPlus > 0.109044 )
									ret := -0.344828
							if( diMinus > 39.9202 )
								if( trueRange <= 0.149709 )
									ret := -0.384615
								if( trueRange > 0.149709 )
									ret := -0.769231 // sell
						if( smoothedDirectionalMovementPlus > 0.138513 )
							if( trueRange <= 0.4703 )
								if( smoothedDirectionalMovementMinus <= 0.218021 )
									ret := 0.200000
								if( smoothedDirectionalMovementMinus > 0.218021 )
									ret := 0.769231 // buy
							if( trueRange > 0.4703 )
								if( dx <= 3.34552 )
									ret := -0.352941
								if( dx > 3.34552 )
									ret := 0.122222
					if( directionalMovementPlus > 1.20798 )
						if( diMinus <= 33.1746 )
							ret := -1.000000 // sell
						if( diMinus > 33.1746 )
							ret := -0.357143
				if( directionalMovementMinus > 1.3e-05 )
					if( smoothedDirectionalMovementMinus <= 0.170858 )
						if( directionalMovementMinus <= 0.099135 )
							if( diPlus <= 35.1354 )
								ret := -1.000000 // sell
							if( diPlus > 35.1354 )
								if( adx <= 12.9547 )
									ret := 0.454545
								if( adx > 12.9547 )
									ret := -0.727273 // sell
						if( directionalMovementMinus > 0.099135 )
							if( smoothedDirectionalMovementPlus <= 0.103878 )
								ret := -0.090909
							if( smoothedDirectionalMovementPlus > 0.103878 )
								ret := 0.800000 // buy
					if( smoothedDirectionalMovementMinus > 0.170858 )
						if( diPlus <= 39.1212 )
							if( diPlus <= 22.2949 )
								ret := -0.307692
							if( diPlus > 22.2949 )
								if( diMinus <= 35.1109 )
									ret := -0.857143 // sell
								if( diMinus > 35.1109 )
									ret := -0.971429 // sell
						if( diPlus > 39.1212 )
							ret := 0.285714
			if( adx > 13.7062 )
				if( smoothedDirectionalMovementMinus <= 0.523792 )
					if( dx <= 41.487 )
						if( dx <= 19.9926 )
							if( smoothedDirectionalMovementMinus <= 0.130146 )
								if( adx <= 20.5229 )
									ret := -0.383838
								if( adx > 20.5229 )
									ret := -0.092269
							if( smoothedDirectionalMovementMinus > 0.130146 )
								if( diMinus <= 36.4592 )
									ret := 0.177156
								if( diMinus > 36.4592 )
									ret := 0.027869
						if( dx > 19.9926 )
							if( smoothedTrueRange <= 0.229054 )
								if( diMinus <= 35.9901 )
									ret := -0.135135
								if( diMinus > 35.9901 )
									ret := 0.428571
							if( smoothedTrueRange > 0.229054 )
								if( diMinus <= 47.7303 )
									ret := -0.054352
								if( diMinus > 47.7303 )
									ret := -0.256637
					if( dx > 41.487 )
						if( diMinus <= 53.7332 )
							if( dx <= 43.2905 )
								if( adx <= 40.8531 )
									ret := 0.548544
								if( adx > 40.8531 )
									ret := 0.016667
							if( dx > 43.2905 )
								if( adx <= 38.9008 )
									ret := 0.008760
								if( adx > 38.9008 )
									ret := 0.189430
						if( diMinus > 53.7332 )
							if( directionalMovementMinus <= 0.010119 )
								if( diMinus <= 56.2579 )
									ret := 0.361905
								if( diMinus > 56.2579 )
									ret := 0.087629
							if( directionalMovementMinus > 0.010119 )
								if( smoothedDirectionalMovementPlus <= 0.066675 )
									ret := 0.449438
								if( smoothedDirectionalMovementPlus > 0.066675 )
									ret := 0.813084 // buy
				if( smoothedDirectionalMovementMinus > 0.523792 )
					if( diMinus <= 32.1866 )
						if( smoothedDirectionalMovementPlus <= 0.135182 )
							ret := -0.583333
						if( smoothedDirectionalMovementPlus > 0.135182 )
							if( diPlus <= 13.804 )
								if( smoothedDirectionalMovementPlus <= 0.255714 )
									ret := 0.600000
								if( smoothedDirectionalMovementPlus > 0.255714 )
									ret := 0.958333 // buy
							if( diPlus > 13.804 )
								if( smoothedDirectionalMovementMinus <= 0.633287 )
									ret := 0.469388
								if( smoothedDirectionalMovementMinus > 0.633287 )
									ret := -0.073171
					if( diMinus > 32.1866 )
						if( dx <= 21.5794 )
							if( diMinus <= 44.8061 )
								if( directionalMovementPlus <= 0.432651 )
									ret := 0.595506
								if( directionalMovementPlus > 0.432651 )
									ret := 0.194805
							if( diMinus > 44.8061 )
								if( dx <= 16.0591 )
									ret := -0.900000 // sell
								if( dx > 16.0591 )
									ret := 0.640000
						if( dx > 21.5794 )
							if( directionalMovementPlus <= 3.88135 )
								if( smoothedDirectionalMovementMinus <= 0.525698 )
									ret := -0.814815 // sell
								if( smoothedDirectionalMovementMinus > 0.525698 )
									ret := -0.113085
							if( directionalMovementPlus > 3.88135 )
								if( smoothedDirectionalMovementMinus <= 1.61593 )
									ret := 0.500000
								if( smoothedDirectionalMovementMinus > 1.61593 )
									ret := 1.000000 // buy
	if( directionalMovementMinus > 0.204517 )
		if( diPlus <= 12.2812 )
			if( smoothedDirectionalMovementPlus <= 0.015882 )
				if( adx <= 46.9171 )
					if( directionalMovementMinus <= 0.3325 )
						ret := -0.105263
					if( directionalMovementMinus > 0.3325 )
						if( smoothedTrueRange <= 0.836079 )
							ret := 0.210526
						if( smoothedTrueRange > 0.836079 )
							ret := 0.684211
				if( adx > 46.9171 )
					if( adx <= 49.2873 )
						ret := 0.888889 // buy
					if( adx > 49.2873 )
						if( trueRange <= 2.14987 )
							if( smoothedTrueRange <= 1.00083 )
								if( trueRange <= 0.991379 )
									ret := 0.586207
								if( trueRange > 0.991379 )
									ret := 0.875000 // buy
							if( smoothedTrueRange > 1.00083 )
								ret := -0.047619
						if( trueRange > 2.14987 )
							if( dx <= 99.3049 )
								ret := 0.642857
							if( dx > 99.3049 )
								ret := 1.000000 // buy
			if( smoothedDirectionalMovementPlus > 0.015882 )
				if( smoothedDirectionalMovementMinus <= 0.264555 )
					if( diMinus <= 20.2201 )
						if( dx <= 23.0425 )
							if( directionalMovementPlus <= 0.00383 )
								if( directionalMovementMinus <= 0.46005 )
									ret := 0.000000
								if( directionalMovementMinus > 0.46005 )
									ret := -0.363636
							if( directionalMovementPlus > 0.00383 )
								ret := -1.000000 // sell
						if( dx > 23.0425 )
							if( smoothedDirectionalMovementMinus <= 0.133507 )
								if( adx <= 30.3503 )
									ret := 0.444444
								if( adx > 30.3503 )
									ret := 0.500000
							if( smoothedDirectionalMovementMinus > 0.133507 )
								if( diPlus <= 10.0668 )
									ret := -0.441176
								if( diPlus > 10.0668 )
									ret := 0.090909
					if( diMinus > 20.2201 )
						if( smoothedDirectionalMovementPlus <= 0.045707 )
							if( smoothedDirectionalMovementPlus <= 0.044654 )
								if( trueRange <= 0.686161 )
									ret := 0.188235
								if( trueRange > 0.686161 )
									ret := -0.067227
							if( smoothedDirectionalMovementPlus > 0.044654 )
								ret := -0.812500 // sell
						if( smoothedDirectionalMovementPlus > 0.045707 )
							if( adx <= 22.8762 )
								if( trueRange <= 1.62085 )
									ret := 0.142857
								if( trueRange > 1.62085 )
									ret := -0.500000
							if( adx > 22.8762 )
								if( diPlus <= 11.1978 )
									ret := 0.461318
								if( diPlus > 11.1978 )
									ret := 0.683824
				if( smoothedDirectionalMovementMinus > 0.264555 )
					if( smoothedTrueRange <= 5.82539 )
						if( adx <= 61.4596 )
							if( diPlus <= 10.6919 )
								if( dx <= 43.8371 )
									ret := -0.595238
								if( dx > 43.8371 )
									ret := -0.022399
							if( diPlus > 10.6919 )
								if( dx <= 68.114 )
									ret := 0.186462
								if( dx > 68.114 )
									ret := 0.642857
						if( adx > 61.4596 )
							if( diMinus <= 51.7147 )
								if( smoothedDirectionalMovementMinus <= 1.02638 )
									ret := 0.286184
								if( smoothedDirectionalMovementMinus > 1.02638 )
									ret := 0.830189 // buy
							if( diMinus > 51.7147 )
								if( diMinus <= 57.6148 )
									ret := -0.537037
								if( diMinus > 57.6148 )
									ret := 0.459459
					if( smoothedTrueRange > 5.82539 )
						ret := 1.000000 // buy
		if( diPlus > 12.2812 )
			if( diMinus <= 66.1494 )
				if( smoothedTrueRange <= 0.609454 )
					if( smoothedDirectionalMovementMinus <= 0.255833 )
						if( dx <= 42.3158 )
							if( dx <= 14.3519 )
								if( adx <= 43.7265 )
									ret := -0.056233
								if( adx > 43.7265 )
									ret := 0.310000
							if( dx > 14.3519 )
								if( smoothedTrueRange <= 0.426265 )
									ret := 0.242563
								if( smoothedTrueRange > 0.426265 )
									ret := 0.100962
						if( dx > 42.3158 )
							if( adx <= 35.0796 )
								if( smoothedDirectionalMovementPlus <= 0.084542 )
									ret := -0.405405
								if( smoothedDirectionalMovementPlus > 0.084542 )
									ret := 0.000000
							if( adx > 35.0796 )
								if( diPlus <= 16.5267 )
									ret := 0.480519
								if( diPlus > 16.5267 )
									ret := -0.077519
					if( smoothedDirectionalMovementMinus > 0.255833 )
						if( smoothedDirectionalMovementPlus <= 0.153477 )
							if( diPlus <= 27.6745 )
								if( trueRange <= 2.925 )
									ret := 0.310502
								if( trueRange > 2.925 )
									ret := -0.769231 // sell
							if( diPlus > 27.6745 )
								if( diMinus <= 56.5252 )
									ret := -0.400000
								if( diMinus > 56.5252 )
									ret := -0.846154 // sell
						if( smoothedDirectionalMovementPlus > 0.153477 )
							if( smoothedTrueRange <= 0.605724 )
								if( trueRange <= 0.991851 )
									ret := 0.892308 // buy
								if( trueRange > 0.991851 )
									ret := 0.550000
							if( smoothedTrueRange > 0.605724 )
								ret := -0.153846
				if( smoothedTrueRange > 0.609454 )
					if( trueRange <= 0.705826 )
						if( trueRange <= 0.70021 )
							if( diPlus <= 42.0799 )
								if( adx <= 13.3891 )
									ret := -0.373016
								if( adx > 13.3891 )
									ret := 0.099288
							if( diPlus > 42.0799 )
								if( adx <= 29.5941 )
									ret := -0.569620
								if( adx > 29.5941 )
									ret := 0.095960
						if( trueRange > 0.70021 )
							if( smoothedDirectionalMovementMinus <= 0.168862 )
								ret := 0.000000
							if( smoothedDirectionalMovementMinus > 0.168862 )
								if( smoothedTrueRange <= 0.887325 )
									ret := 0.666667
								if( smoothedTrueRange > 0.887325 )
									ret := 1.000000 // buy
					if( trueRange > 0.705826 )
						if( smoothedTrueRange <= 1.84034 )
							if( smoothedDirectionalMovementMinus <= 0.625091 )
								if( diPlus <= 42.6868 )
									ret := -0.014439
								if( diPlus > 42.6868 )
									ret := -0.189727
							if( smoothedDirectionalMovementMinus > 0.625091 )
								if( diPlus <= 23.8676 )
									ret := -0.325397
								if( diPlus > 23.8676 )
									ret := -0.017341
						if( smoothedTrueRange > 1.84034 )
							if( smoothedDirectionalMovementMinus <= 1.11208 )
								if( smoothedTrueRange <= 2.65283 )
									ret := 0.036406
								if( smoothedTrueRange > 2.65283 )
									ret := 0.251451
							if( smoothedDirectionalMovementMinus > 1.11208 )
								if( directionalMovementMinus <= 0.408103 )
									ret := -0.956522 // sell
								if( directionalMovementMinus > 0.408103 )
									ret := -0.196000
			if( diMinus > 66.1494 )
				if( trueRange <= 6.82311 )
					if( trueRange <= 1.6977 )
						if( smoothedTrueRange <= 0.557643 )
							if( diPlus <= 21.7857 )
								if( smoothedTrueRange <= 0.316584 )
									ret := 0.187500
								if( smoothedTrueRange > 0.316584 )
									ret := 0.538462
							if( diPlus > 21.7857 )
								ret := 0.933333 // buy
						if( smoothedTrueRange > 0.557643 )
							ret := 0.083333
					if( trueRange > 1.6977 )
						if( smoothedDirectionalMovementPlus <= 0.267181 )
							if( trueRange <= 2.57 )
								ret := 1.000000 // buy
							if( trueRange > 2.57 )
								if( smoothedDirectionalMovementMinus <= 0.787412 )
									ret := 0.833333 // buy
								if( smoothedDirectionalMovementMinus > 0.787412 )
									ret := 1.000000 // buy
						if( smoothedDirectionalMovementPlus > 0.267181 )
							ret := 0.600000
				if( trueRange > 6.82311 )
					ret := -0.200000
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_CRWD_15Min_0eab5b08(dx, directionalMovementMinus, diPlus, smoothedDirectionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedTrueRange, directionalMovementPlus, diMinus, adx)

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


