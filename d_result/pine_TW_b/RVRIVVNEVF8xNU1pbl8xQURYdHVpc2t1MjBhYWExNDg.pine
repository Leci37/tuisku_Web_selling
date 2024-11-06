//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: ADX_and_DI
// ID_model: ETHUSDT_15Min_1ADX_20aaa148 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETHUSDT_15Min_1ADX_20aaa148", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETHUSDT_15Min_20aaa148(dx, directionalMovementMinus, diPlus, smoothedDirectionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedTrueRange, directionalMovementPlus, diMinus, adx)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( smoothedDirectionalMovementMinus <= 3.73567 )
		if( smoothedTrueRange <= 14.2503 )
			if( directionalMovementMinus <= 14.9055 )
				if( trueRange <= 51.8462 )
					if( smoothedDirectionalMovementPlus <= 0.571847 )
						if( smoothedTrueRange <= 10.3879 )
							if( dx <= 36.7219 )
								if( diPlus <= 11.4453 )
									ret := 0.177249
								if( diPlus > 11.4453 )
									ret := 0.009403
							if( dx > 36.7219 )
								if( smoothedDirectionalMovementMinus <= 2.40329 )
									ret := -0.052217
								if( smoothedDirectionalMovementMinus > 2.40329 )
									ret := 0.031829
						if( smoothedTrueRange > 10.3879 )
							if( trueRange <= 9.77836 )
								if( diPlus <= 2.48489 )
									ret := -0.200000
								if( diPlus > 2.48489 )
									ret := 0.842105 // buy
							if( trueRange > 9.77836 )
								if( adx <= 39.8435 )
									ret := -0.600000
								if( adx > 39.8435 )
									ret := 0.333333
					if( smoothedDirectionalMovementPlus > 0.571847 )
						if( diPlus <= 17.3082 )
							if( adx <= 14.2611 )
								if( trueRange <= 9.1446 )
									ret := -0.052036
								if( trueRange > 9.1446 )
									ret := -0.422727
							if( adx > 14.2611 )
								if( dx <= 24.7343 )
									ret := 0.148251
								if( dx > 24.7343 )
									ret := 0.068330
						if( diPlus > 17.3082 )
							if( directionalMovementPlus <= 0.004438 )
								if( diPlus <= 18.6997 )
									ret := -0.070282
								if( diPlus > 18.6997 )
									ret := 0.022116
							if( directionalMovementPlus > 0.004438 )
								if( trueRange <= 9.45921 )
									ret := 0.072838
								if( trueRange > 9.45921 )
									ret := 0.020342
				if( trueRange > 51.8462 )
					if( smoothedDirectionalMovementPlus <= 5.39357 )
						if( smoothedDirectionalMovementPlus <= 5.0063 )
							ret := 1.000000 // buy
						if( smoothedDirectionalMovementPlus > 5.0063 )
							ret := -0.250000
					if( smoothedDirectionalMovementPlus > 5.39357 )
						ret := 1.000000 // buy
			if( directionalMovementMinus > 14.9055 )
				if( dx <= 3.44359 )
					if( diMinus <= 24.409 )
						if( directionalMovementMinus <= 16.21 )
							ret := -0.500000
						if( directionalMovementMinus > 16.21 )
							ret := 0.000000
					if( diMinus > 24.409 )
						if( diPlus <= 27.5409 )
							if( trueRange <= 23.2146 )
								ret := -1.000000 // sell
							if( trueRange > 23.2146 )
								ret := -0.750000 // sell
						if( diPlus > 27.5409 )
							ret := -0.333333
				if( dx > 3.44359 )
					if( directionalMovementMinus <= 26.7324 )
						if( directionalMovementMinus <= 15.7999 )
							if( dx <= 43.9842 )
								if( diPlus <= 24.9903 )
									ret := 0.736264 // buy
								if( diPlus > 24.9903 )
									ret := 0.238095
							if( dx > 43.9842 )
								if( adx <= 51.5804 )
									ret := -0.135135
								if( adx > 51.5804 )
									ret := 0.600000
						if( directionalMovementMinus > 15.7999 )
							if( smoothedTrueRange <= 8.20357 )
								if( directionalMovementMinus <= 16.7011 )
									ret := -0.321429
								if( directionalMovementMinus > 16.7011 )
									ret := 0.484472
							if( smoothedTrueRange > 8.20357 )
								if( smoothedDirectionalMovementMinus <= 2.04204 )
									ret := -0.405405
								if( smoothedDirectionalMovementMinus > 2.04204 )
									ret := 0.084375
					if( directionalMovementMinus > 26.7324 )
						if( diMinus <= 28.1302 )
							if( adx <= 31.9142 )
								ret := -1.000000 // sell
							if( adx > 31.9142 )
								if( adx <= 50.1458 )
									ret := 1.000000 // buy
								if( adx > 50.1458 )
									ret := 0.250000
						if( diMinus > 28.1302 )
							if( directionalMovementMinus <= 34.8428 )
								if( trueRange <= 29.6165 )
									ret := 0.500000
								if( trueRange > 29.6165 )
									ret := 0.884615 // buy
							if( directionalMovementMinus > 34.8428 )
								ret := 0.000000
		if( smoothedTrueRange > 14.2503 )
			if( smoothedDirectionalMovementPlus <= 10.6293 )
				if( smoothedTrueRange <= 21.1014 )
					if( diPlus <= 19.9959 )
						if( adx <= 20.6382 )
							if( diPlus <= 18.9316 )
								if( smoothedTrueRange <= 18.7264 )
									ret := 0.433071
								if( smoothedTrueRange > 18.7264 )
									ret := -0.266667
							if( diPlus > 18.9316 )
								if( directionalMovementPlus <= 0.61 )
									ret := -0.481481
								if( directionalMovementPlus > 0.61 )
									ret := 0.388889
						if( adx > 20.6382 )
							if( dx <= 2.89005 )
								if( directionalMovementMinus <= 1.74679 )
									ret := 0.641975
								if( directionalMovementMinus > 1.74679 )
									ret := -0.157895
							if( dx > 2.89005 )
								if( diPlus <= 14.8239 )
									ret := 0.186885
								if( diPlus > 14.8239 )
									ret := -0.169884
					if( diPlus > 19.9959 )
						if( directionalMovementMinus <= 18.5628 )
							if( directionalMovementPlus <= 4.02926 )
								if( adx <= 24.0684 )
									ret := -0.182524
								if( adx > 24.0684 )
									ret := -0.002060
							if( directionalMovementPlus > 4.02926 )
								if( trueRange <= 27.39 )
									ret := -0.199074
								if( trueRange > 27.39 )
									ret := 0.015152
						if( directionalMovementMinus > 18.5628 )
							if( diPlus <= 25.8032 )
								if( trueRange <= 24.8265 )
									ret := -0.600000
								if( trueRange > 24.8265 )
									ret := 1.000000 // buy
							if( diPlus > 25.8032 )
								if( dx <= 23.2015 )
									ret := -0.571429
								if( dx > 23.2015 )
									ret := 0.393939
				if( smoothedTrueRange > 21.1014 )
					if( dx <= 86.8601 )
						if( smoothedDirectionalMovementMinus <= 1.94536 )
							if( adx <= 90.2647 )
								if( diPlus <= 42.5663 )
									ret := -0.655660
								if( diPlus > 42.5663 )
									ret := -0.055556
							if( adx > 90.2647 )
								ret := 1.000000 // buy
						if( smoothedDirectionalMovementMinus > 1.94536 )
							if( diPlus <= 14.6263 )
								if( smoothedTrueRange <= 23.0521 )
									ret := 1.000000 // buy
								if( smoothedTrueRange > 23.0521 )
									ret := 0.750000 // buy
							if( diPlus > 14.6263 )
								if( adx <= 15.9358 )
									ret := -0.783784 // sell
								if( adx > 15.9358 )
									ret := -0.190476
					if( dx > 86.8601 )
						if( smoothedTrueRange <= 21.5244 )
							ret := 0.000000
						if( smoothedTrueRange > 21.5244 )
							if( smoothedDirectionalMovementPlus <= 10.1507 )
								if( smoothedDirectionalMovementMinus <= 0.088571 )
									ret := 0.250000
								if( smoothedDirectionalMovementMinus > 0.088571 )
									ret := 0.863636 // buy
							if( smoothedDirectionalMovementPlus > 10.1507 )
								ret := 0.200000
			if( smoothedDirectionalMovementPlus > 10.6293 )
				if( smoothedDirectionalMovementMinus <= 0.037857 )
					if( diPlus <= 61.4731 )
						if( smoothedDirectionalMovementPlus <= 13.5312 )
							ret := -1.000000 // sell
						if( smoothedDirectionalMovementPlus > 13.5312 )
							ret := -0.500000
					if( diPlus > 61.4731 )
						ret := 0.500000
				if( smoothedDirectionalMovementMinus > 0.037857 )
					if( directionalMovementMinus <= 1.81584 )
						if( adx <= 37.1723 )
							if( trueRange <= 19.53 )
								ret := -0.400000
							if( trueRange > 19.53 )
								if( dx <= 61.1594 )
									ret := 0.555556
								if( dx > 61.1594 )
									ret := 0.938776 // buy
						if( adx > 37.1723 )
							if( diMinus <= 6.10128 )
								if( smoothedDirectionalMovementPlus <= 12.0921 )
									ret := 0.024390
								if( smoothedDirectionalMovementPlus > 12.0921 )
									ret := 0.607143
							if( diMinus > 6.10128 )
								if( trueRange <= 15.115 )
									ret := 0.619048
								if( trueRange > 15.115 )
									ret := -0.420290
					if( directionalMovementMinus > 1.81584 )
						if( trueRange <= 11.2731 )
							ret := 0.250000
						if( trueRange > 11.2731 )
							if( smoothedDirectionalMovementPlus <= 13.9576 )
								if( diPlus <= 52.5294 )
									ret := 0.765625 // buy
								if( diPlus > 52.5294 )
									ret := 0.000000
							if( smoothedDirectionalMovementPlus > 13.9576 )
								if( adx <= 63.6165 )
									ret := 0.750000 // buy
								if( adx > 63.6165 )
									ret := 1.000000 // buy
	if( smoothedDirectionalMovementMinus > 3.73567 )
		if( dx <= 59.8801 )
			if( adx <= 48.2697 )
				if( smoothedTrueRange <= 71.0601 )
					if( smoothedDirectionalMovementMinus <= 11.7584 )
						if( smoothedTrueRange <= 44.1908 )
							if( smoothedTrueRange <= 29.5753 )
								if( directionalMovementPlus <= 19.935 )
									ret := 0.131739
								if( directionalMovementPlus > 19.935 )
									ret := -0.220339
							if( smoothedTrueRange > 29.5753 )
								if( smoothedDirectionalMovementMinus <= 9.05785 )
									ret := -0.221359
								if( smoothedDirectionalMovementMinus > 9.05785 )
									ret := 0.190871
						if( smoothedTrueRange > 44.1908 )
							if( dx <= 9.11805 )
								if( trueRange <= 44.9715 )
									ret := -0.750000 // sell
								if( trueRange > 44.9715 )
									ret := -1.000000 // sell
							if( dx > 9.11805 )
								if( dx <= 11.658 )
									ret := 0.100000
								if( dx > 11.658 )
									ret := 0.852632 // buy
					if( smoothedDirectionalMovementMinus > 11.7584 )
						if( dx <= 19.4802 )
							if( smoothedTrueRange <= 53.0644 )
								if( trueRange <= 42.8344 )
									ret := -1.000000 // sell
								if( trueRange > 42.8344 )
									ret := -0.375000
							if( smoothedTrueRange > 53.0644 )
								ret := 0.250000
						if( dx > 19.4802 )
							if( trueRange <= 39.3314 )
								if( smoothedDirectionalMovementMinus <= 14.3095 )
									ret := 0.515464
								if( smoothedDirectionalMovementMinus > 14.3095 )
									ret := -0.260870
							if( trueRange > 39.3314 )
								if( smoothedDirectionalMovementPlus <= 9.69717 )
									ret := 0.730769 // buy
								if( smoothedDirectionalMovementPlus > 9.69717 )
									ret := 0.230769
				if( smoothedTrueRange > 71.0601 )
					if( diMinus <= 30.8283 )
						ret := -1.000000 // sell
					if( diMinus > 30.8283 )
						ret := -0.250000
			if( adx > 48.2697 )
				if( smoothedDirectionalMovementPlus <= 1.91694 )
					if( trueRange <= 10.8216 )
						if( dx <= 49.7978 )
							if( trueRange <= 7.86963 )
								if( adx <= 66.1558 )
									ret := 0.525000
								if( adx > 66.1558 )
									ret := -0.250000
							if( trueRange > 7.86963 )
								if( diMinus <= 36.3064 )
									ret := 0.763441 // buy
								if( diMinus > 36.3064 )
									ret := -0.444444
						if( dx > 49.7978 )
							if( adx <= 73.3201 )
								if( diPlus <= 9.32972 )
									ret := 0.463415
								if( diPlus > 9.32972 )
									ret := -0.131387
							if( adx > 73.3201 )
								if( directionalMovementMinus <= 5.545 )
									ret := 0.676471
								if( directionalMovementMinus > 5.545 )
									ret := -0.500000
					if( trueRange > 10.8216 )
						if( directionalMovementPlus <= 13.481 )
							if( smoothedTrueRange <= 15.6585 )
								if( dx <= 50.8804 )
									ret := -0.008696
								if( dx > 50.8804 )
									ret := -0.360000
							if( smoothedTrueRange > 15.6585 )
								if( trueRange <= 18.3151 )
									ret := 0.037736
								if( trueRange > 18.3151 )
									ret := 0.553191
						if( directionalMovementPlus > 13.481 )
							if( diMinus <= 38.5654 )
								if( trueRange <= 21.5957 )
									ret := -0.944444 // sell
								if( trueRange > 21.5957 )
									ret := -0.500000
							if( diMinus > 38.5654 )
								ret := 0.000000
				if( smoothedDirectionalMovementPlus > 1.91694 )
					if( directionalMovementPlus <= 22.324 )
						if( diPlus <= 31.172 )
							if( trueRange <= 11.0776 )
								if( diPlus <= 13.9784 )
									ret := -0.157025
								if( diPlus > 13.9784 )
									ret := 0.204819
							if( trueRange > 11.0776 )
								if( diPlus <= 12.3371 )
									ret := -0.060172
								if( diPlus > 12.3371 )
									ret := -0.285375
						if( diPlus > 31.172 )
							if( diMinus <= 14.1037 )
								if( diPlus <= 32.7964 )
									ret := 0.500000
								if( diPlus > 32.7964 )
									ret := -0.750000 // sell
							if( diMinus > 14.1037 )
								if( trueRange <= 15.225 )
									ret := -0.250000
								if( trueRange > 15.225 )
									ret := 0.658537
					if( directionalMovementPlus > 22.324 )
						if( diPlus <= 25.3912 )
							if( smoothedDirectionalMovementMinus <= 12.8123 )
								if( adx <= 50.3231 )
									ret := -0.800000 // sell
								if( adx > 50.3231 )
									ret := 0.795181 // buy
							if( smoothedDirectionalMovementMinus > 12.8123 )
								if( directionalMovementPlus <= 57.295 )
									ret := -0.550000
								if( directionalMovementPlus > 57.295 )
									ret := 0.333333
						if( diPlus > 25.3912 )
							ret := -1.000000 // sell
		if( dx > 59.8801 )
			if( directionalMovementMinus <= 5.1e-05 )
				if( diMinus <= 35.4598 )
					if( dx <= 78.3495 )
						if( diMinus <= 29.8626 )
							if( dx <= 69.0643 )
								if( trueRange <= 15.7501 )
									ret := -0.093023
								if( trueRange > 15.7501 )
									ret := 0.727273 // buy
							if( dx > 69.0643 )
								if( diMinus <= 28.7465 )
									ret := -0.812500 // sell
								if( diMinus > 28.7465 )
									ret := -0.333333
						if( diMinus > 29.8626 )
							if( adx <= 40.9364 )
								if( directionalMovementPlus <= 7.02782 )
									ret := 0.580357
								if( directionalMovementPlus > 7.02782 )
									ret := -0.400000
							if( adx > 40.9364 )
								if( trueRange <= 19.4144 )
									ret := 0.190840
								if( trueRange > 19.4144 )
									ret := -0.500000
					if( dx > 78.3495 )
						if( smoothedDirectionalMovementMinus <= 5.07328 )
							if( adx <= 50.7678 )
								ret := 0.000000
							if( adx > 50.7678 )
								if( trueRange <= 10.502 )
									ret := 0.818182 // buy
								if( trueRange > 10.502 )
									ret := 1.000000 // buy
						if( smoothedDirectionalMovementMinus > 5.07328 )
							if( smoothedTrueRange <= 20.6982 )
								if( smoothedDirectionalMovementMinus <= 6.28268 )
									ret := 0.250000
								if( smoothedDirectionalMovementMinus > 6.28268 )
									ret := -1.000000 // sell
							if( smoothedTrueRange > 20.6982 )
								if( diMinus <= 33.8384 )
									ret := 0.875000 // buy
								if( diMinus > 33.8384 )
									ret := 0.250000
				if( diMinus > 35.4598 )
					if( directionalMovementPlus <= 17.9699 )
						if( smoothedDirectionalMovementMinus <= 9.17373 )
							if( adx <= 47.3939 )
								if( diMinus <= 50.1114 )
									ret := 0.201887
								if( diMinus > 50.1114 )
									ret := -0.592593
							if( adx > 47.3939 )
								if( smoothedTrueRange <= 10.0429 )
									ret := 0.215789
								if( smoothedTrueRange > 10.0429 )
									ret := -0.189024
						if( smoothedDirectionalMovementMinus > 9.17373 )
							if( adx <= 35.7425 )
								if( directionalMovementPlus <= 2.75 )
									ret := -0.200000
								if( directionalMovementPlus > 2.75 )
									ret := -1.000000 // sell
							if( adx > 35.7425 )
								if( diPlus <= 1.99277 )
									ret := -0.148148
								if( diPlus > 1.99277 )
									ret := 0.411765
					if( directionalMovementPlus > 17.9699 )
						if( smoothedTrueRange <= 33.6875 )
							if( trueRange <= 47.5441 )
								ret := 0.250000
							if( trueRange > 47.5441 )
								ret := 1.000000 // buy
						if( smoothedTrueRange > 33.6875 )
							if( adx <= 41.5577 )
								if( dx <= 66.8261 )
									ret := 1.000000 // buy
								if( dx > 66.8261 )
									ret := -1.000000 // sell
							if( adx > 41.5577 )
								if( trueRange <= 39.226 )
									ret := -0.750000 // sell
								if( trueRange > 39.226 )
									ret := -1.000000 // sell
			if( directionalMovementMinus > 5.1e-05 )
				if( adx <= 89.2436 )
					if( diPlus <= 3.94482 )
						if( smoothedDirectionalMovementMinus <= 4.87655 )
							if( smoothedTrueRange <= 10.9511 )
								if( diMinus <= 42.6009 )
									ret := -0.264706
								if( diMinus > 42.6009 )
									ret := 0.254902
							if( smoothedTrueRange > 10.9511 )
								if( adx <= 78.366 )
									ret := 0.673077
								if( adx > 78.366 )
									ret := -0.500000
						if( smoothedDirectionalMovementMinus > 4.87655 )
							if( smoothedDirectionalMovementMinus <= 7.46567 )
								if( diMinus <= 38.1039 )
									ret := -0.506849
								if( diMinus > 38.1039 )
									ret := 0.019284
							if( smoothedDirectionalMovementMinus > 7.46567 )
								if( adx <= 34.551 )
									ret := -0.411765
								if( adx > 34.551 )
									ret := 0.260504
					if( diPlus > 3.94482 )
						if( diMinus <= 29.5932 )
							if( smoothedTrueRange <= 20.4286 )
								if( trueRange <= 24.6032 )
									ret := -0.500000
								if( trueRange > 24.6032 )
									ret := 0.800000 // buy
							if( smoothedTrueRange > 20.4286 )
								if( directionalMovementMinus <= 21 )
									ret := 1.000000 // buy
								if( directionalMovementMinus > 21 )
									ret := -0.250000
						if( diMinus > 29.5932 )
							if( trueRange <= 71.3509 )
								if( adx <= 72.5997 )
									ret := 0.297406
								if( adx > 72.5997 )
									ret := 0.561056
							if( trueRange > 71.3509 )
								if( trueRange <= 78.6134 )
									ret := -0.730769 // sell
								if( trueRange > 78.6134 )
									ret := 0.253731
				if( adx > 89.2436 )
					if( directionalMovementMinus <= 15.9651 )
						if( smoothedDirectionalMovementPlus <= 1.28036 )
							if( diMinus <= 36.0662 )
								ret := -1.000000 // sell
							if( diMinus > 36.0662 )
								if( smoothedTrueRange <= 18.636 )
									ret := -0.333333
								if( smoothedTrueRange > 18.636 )
									ret := 0.800000 // buy
						if( smoothedDirectionalMovementPlus > 1.28036 )
							ret := -1.000000 // sell
					if( directionalMovementMinus > 15.9651 )
						if( smoothedTrueRange <= 19.6061 )
							ret := 1.000000 // buy
						if( smoothedTrueRange > 19.6061 )
							if( diMinus <= 41.7319 )
								ret := -0.500000
							if( diMinus > 41.7319 )
								ret := 0.750000 // buy
	
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
float op_operation = decision_tree_0_ETHUSDT_15Min_20aaa148(dx, directionalMovementMinus, diPlus, smoothedDirectionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedTrueRange, directionalMovementPlus, diMinus, adx)

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


