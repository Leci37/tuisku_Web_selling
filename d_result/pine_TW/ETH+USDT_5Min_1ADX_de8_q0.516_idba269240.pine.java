//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: ADX_and_DI
// ID_model: ETHUSDT_5Min_1ADX_ba269240 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETHUSDT_5Min_1ADX_ba269240", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETHUSDT_5Min_ba269240(dx, directionalMovementMinus, diPlus, smoothedDirectionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedTrueRange, directionalMovementPlus, diMinus, adx)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( smoothedDirectionalMovementMinus <= 3.7638 )
		if( diMinus <= 12.8843 )
			if( smoothedTrueRange <= 5.11076 )
				if( smoothedDirectionalMovementPlus <= 0.741912 )
					if( smoothedDirectionalMovementMinus <= 0.278246 )
						if( smoothedTrueRange <= 2.44975 )
							if( adx <= 26.0868 )
								if( smoothedTrueRange <= 1.51521 )
									ret := 0.061350
								if( smoothedTrueRange > 1.51521 )
									ret := -0.242754
							if( adx > 26.0868 )
								if( diPlus <= 32.5247 )
									ret := -0.036115
								if( diPlus > 32.5247 )
									ret := 0.103146
						if( smoothedTrueRange > 2.44975 )
							if( diPlus <= 27.1592 )
								if( adx <= 49.5779 )
									ret := -0.081818
								if( adx > 49.5779 )
									ret := 0.734694 // buy
							if( diPlus > 27.1592 )
								if( smoothedDirectionalMovementPlus <= 0.712157 )
									ret := 1.000000 // buy
								if( smoothedDirectionalMovementPlus > 0.712157 )
									ret := 0.888889 // buy
					if( smoothedDirectionalMovementMinus > 0.278246 )
						if( smoothedDirectionalMovementPlus <= 0.616211 )
							if( directionalMovementMinus <= 0.406195 )
								if( trueRange <= 2.44376 )
									ret := -0.067568
								if( trueRange > 2.44376 )
									ret := -0.281250
							if( directionalMovementMinus > 0.406195 )
								if( dx <= 23.8695 )
									ret := 0.542857
								if( dx > 23.8695 )
									ret := 0.181818
						if( smoothedDirectionalMovementPlus > 0.616211 )
							if( adx <= 11.543 )
								ret := -0.600000
							if( adx > 11.543 )
								if( directionalMovementPlus <= 0.000848 )
									ret := 0.096970
								if( directionalMovementPlus > 0.000848 )
									ret := 0.429119
				if( smoothedDirectionalMovementPlus > 0.741912 )
					if( diMinus <= 3.78025 )
						if( adx <= 74.347 )
							if( directionalMovementMinus <= 0.000326 )
								if( dx <= 97.9838 )
									ret := -0.253450
								if( dx > 97.9838 )
									ret := 0.476190
							if( directionalMovementMinus > 0.000326 )
								if( smoothedTrueRange <= 3.9474 )
									ret := 0.007299
								if( smoothedTrueRange > 3.9474 )
									ret := 0.540230
						if( adx > 74.347 )
							if( adx <= 81.2352 )
								if( trueRange <= 3.38174 )
									ret := -0.653061
								if( trueRange > 3.38174 )
									ret := -0.934783 // sell
							if( adx > 81.2352 )
								if( diPlus <= 50.055 )
									ret := 0.384615
								if( diPlus > 50.055 )
									ret := -0.842105 // sell
					if( diMinus > 3.78025 )
						if( trueRange <= 3.41084 )
							if( dx <= 46.6958 )
								if( diMinus <= 11.0734 )
									ret := 0.087097
								if( diMinus > 11.0734 )
									ret := -0.223899
							if( dx > 46.6958 )
								if( diPlus <= 38.2799 )
									ret := 0.148104
								if( diPlus > 38.2799 )
									ret := 0.013506
						if( trueRange > 3.41084 )
							if( directionalMovementMinus <= 0.466254 )
								if( smoothedTrueRange <= 3.98107 )
									ret := -0.160100
								if( smoothedTrueRange > 3.98107 )
									ret := -0.019189
							if( directionalMovementMinus > 0.466254 )
								if( adx <= 68.4606 )
									ret := 0.090206
								if( adx > 68.4606 )
									ret := -0.259259
			if( smoothedTrueRange > 5.11076 )
				if( smoothedDirectionalMovementPlus <= 12.3523 )
					if( directionalMovementMinus <= 1.52101 )
						if( adx <= 49.1217 )
							if( directionalMovementPlus <= 0.700889 )
								if( smoothedDirectionalMovementMinus <= 0.800675 )
									ret := -0.079126
								if( smoothedDirectionalMovementMinus > 0.800675 )
									ret := -0.250670
							if( directionalMovementPlus > 0.700889 )
								if( dx <= 94.6675 )
									ret := -0.040067
								if( dx > 94.6675 )
									ret := 0.493333
						if( adx > 49.1217 )
							if( diPlus <= 56.884 )
								if( directionalMovementPlus <= 8.86976 )
									ret := -0.199845
								if( directionalMovementPlus > 8.86976 )
									ret := -0.355083
							if( diPlus > 56.884 )
								if( dx <= 96.7022 )
									ret := 0.620438
								if( dx > 96.7022 )
									ret := 0.048387
					if( directionalMovementMinus > 1.52101 )
						if( dx <= 46.7494 )
							if( diPlus <= 22.7907 )
								if( adx <= 64.4513 )
									ret := -0.064865
								if( adx > 64.4513 )
									ret := 0.560000
							if( diPlus > 22.7907 )
								if( smoothedDirectionalMovementPlus <= 3.20638 )
									ret := 0.380597
								if( smoothedDirectionalMovementPlus > 3.20638 )
									ret := -0.014085
						if( dx > 46.7494 )
							if( directionalMovementMinus <= 14.39 )
								if( trueRange <= 19.636 )
									ret := 0.008271
								if( trueRange > 19.636 )
									ret := -0.518072
							if( directionalMovementMinus > 14.39 )
								if( smoothedDirectionalMovementPlus <= 8.25687 )
									ret := 0.642857
								if( smoothedDirectionalMovementPlus > 8.25687 )
									ret := 0.941176 // buy
				if( smoothedDirectionalMovementPlus > 12.3523 )
					if( diPlus <= 43.1049 )
						if( dx <= 75.8301 )
							if( trueRange <= 24.9764 )
								ret := -0.111111
							if( trueRange > 24.9764 )
								if( dx <= 69.2492 )
									ret := 1.000000 // buy
								if( dx > 69.2492 )
									ret := 0.473684
						if( dx > 75.8301 )
							ret := -1.000000 // sell
					if( diPlus > 43.1049 )
						if( diPlus <= 46.4573 )
							ret := 0.666667
						if( diPlus > 46.4573 )
							if( diPlus <= 61.0129 )
								ret := 1.000000 // buy
							if( diPlus > 61.0129 )
								if( adx <= 65.5937 )
									ret := 1.000000 // buy
								if( adx > 65.5937 )
									ret := 0.700000 // buy
		if( diMinus > 12.8843 )
			if( smoothedDirectionalMovementPlus <= 2.34323 )
				if( trueRange <= 22.3836 )
					if( adx <= 11.9512 )
						if( smoothedDirectionalMovementPlus <= 1.67223 )
							if( directionalMovementMinus <= 0.022586 )
								if( dx <= 0.810799 )
									ret := 0.656716
								if( dx > 0.810799 )
									ret := 0.098765
							if( directionalMovementMinus > 0.022586 )
								if( dx <= 3.73759 )
									ret := -0.322581
								if( dx > 3.73759 )
									ret := 0.047530
						if( smoothedDirectionalMovementPlus > 1.67223 )
							if( directionalMovementMinus <= 0.697262 )
								if( diMinus <= 16.2181 )
									ret := 0.833333 // buy
								if( diMinus > 16.2181 )
									ret := 0.268293
							if( directionalMovementMinus > 0.697262 )
								if( adx <= 10.3436 )
									ret := 0.584906
								if( adx > 10.3436 )
									ret := 0.865979 // buy
					if( adx > 11.9512 )
						if( trueRange <= 17.2169 )
							if( smoothedTrueRange <= 4.7384 )
								if( smoothedTrueRange <= 2.74954 )
									ret := 0.014522
								if( smoothedTrueRange > 2.74954 )
									ret := -0.027388
							if( smoothedTrueRange > 4.7384 )
								if( dx <= 90.4981 )
									ret := 0.020608
								if( dx > 90.4981 )
									ret := 0.299020
						if( trueRange > 17.2169 )
							if( dx <= 80.5234 )
								if( smoothedTrueRange <= 9.75821 )
									ret := -0.376543
								if( smoothedTrueRange > 9.75821 )
									ret := -0.100000
							if( dx > 80.5234 )
								if( smoothedDirectionalMovementPlus <= 0.13 )
									ret := 0.937500 // buy
								if( smoothedDirectionalMovementPlus > 0.13 )
									ret := 0.237288
				if( trueRange > 22.3836 )
					if( diPlus <= 15.0601 )
						if( smoothedDirectionalMovementPlus <= 0.977036 )
							if( diPlus <= 12.3297 )
								if( diPlus <= 5.23042 )
									ret := -0.068182
								if( diPlus > 5.23042 )
									ret := 0.852632 // buy
							if( diPlus > 12.3297 )
								ret := -0.818182 // sell
						if( smoothedDirectionalMovementPlus > 0.977036 )
							if( adx <= 61.6392 )
								if( dx <= 33.0667 )
									ret := 0.555556
								if( dx > 33.0667 )
									ret := -0.860465 // sell
							if( adx > 61.6392 )
								ret := 1.000000 // buy
					if( diPlus > 15.0601 )
						if( dx <= 20.9056 )
							if( smoothedTrueRange <= 10.5186 )
								if( adx <= 24.1846 )
									ret := -0.461538
								if( adx > 24.1846 )
									ret := 0.400000
							if( smoothedTrueRange > 10.5186 )
								ret := 0.833333 // buy
						if( dx > 20.9056 )
							if( diPlus <= 18.3838 )
								if( diPlus <= 17.3304 )
									ret := 1.000000 // buy
								if( diPlus > 17.3304 )
									ret := 0.833333 // buy
							if( diPlus > 18.3838 )
								ret := 0.523810
			if( smoothedDirectionalMovementPlus > 2.34323 )
				if( dx <= 26.253 )
					if( adx <= 11.0183 )
						if( diMinus <= 26.2969 )
							if( smoothedTrueRange <= 14.5438 )
								if( dx <= 11.6101 )
									ret := -0.951613 // sell
								if( dx > 11.6101 )
									ret := -0.488372
							if( smoothedTrueRange > 14.5438 )
								ret := 0.000000
						if( diMinus > 26.2969 )
							if( smoothedTrueRange <= 10.3933 )
								ret := 1.000000 // buy
							if( smoothedTrueRange > 10.3933 )
								if( trueRange <= 14.3911 )
									ret := -0.400000
								if( trueRange > 14.3911 )
									ret := -1.000000 // sell
					if( adx > 11.0183 )
						if( smoothedDirectionalMovementPlus <= 2.86036 )
							if( smoothedDirectionalMovementMinus <= 1.48561 )
								if( smoothedDirectionalMovementMinus <= 1.43835 )
									ret := -0.071429
								if( smoothedDirectionalMovementMinus > 1.43835 )
									ret := 0.655172
							if( smoothedDirectionalMovementMinus > 1.48561 )
								if( smoothedTrueRange <= 13.6791 )
									ret := -0.065584
								if( smoothedTrueRange > 13.6791 )
									ret := -0.341297
						if( smoothedDirectionalMovementPlus > 2.86036 )
							if( smoothedDirectionalMovementMinus <= 1.88685 )
								if( diMinus <= 16.5179 )
									ret := -0.294118
								if( diMinus > 16.5179 )
									ret := 0.697842
							if( smoothedDirectionalMovementMinus > 1.88685 )
								if( adx <= 21.756 )
									ret := -0.132743
								if( adx > 21.756 )
									ret := 0.067081
				if( dx > 26.253 )
					if( dx <= 55.69 )
						if( dx <= 52.9048 )
							if( dx <= 46.8518 )
								if( smoothedTrueRange <= 17.3175 )
									ret := -0.082820
								if( smoothedTrueRange > 17.3175 )
									ret := -0.410526
							if( dx > 46.8518 )
								if( diMinus <= 13.1676 )
									ret := 0.180000
								if( diMinus > 13.1676 )
									ret := -0.320856
						if( dx > 52.9048 )
							if( diMinus <= 13.2415 )
								if( diPlus <= 43.1014 )
									ret := 0.642857
								if( diPlus > 43.1014 )
									ret := -0.266667
							if( diMinus > 13.2415 )
								if( adx <= 26.5968 )
									ret := 0.400000
								if( adx > 26.5968 )
									ret := 0.836735 // buy
					if( dx > 55.69 )
						if( trueRange <= 10.135 )
							if( smoothedTrueRange <= 7.14342 )
								ret := -0.800000 // sell
							if( smoothedTrueRange > 7.14342 )
								ret := -1.000000 // sell
						if( trueRange > 10.135 )
							if( trueRange <= 29.9573 )
								ret := 0.500000
							if( trueRange > 29.9573 )
								ret := -1.000000 // sell
	if( smoothedDirectionalMovementMinus > 3.7638 )
		if( diPlus <= 9.40264 )
			if( smoothedDirectionalMovementPlus <= 4.50147 )
				if( diPlus <= 3.20349 )
					if( dx <= 96.5341 )
						if( smoothedTrueRange <= 12.5314 )
							if( adx <= 85.7483 )
								if( smoothedDirectionalMovementMinus <= 3.87797 )
									ret := 0.685714
								if( smoothedDirectionalMovementMinus > 3.87797 )
									ret := -0.194647
							if( adx > 85.7483 )
								ret := -1.000000 // sell
						if( smoothedTrueRange > 12.5314 )
							if( smoothedTrueRange <= 13.4727 )
								if( directionalMovementPlus <= 0.294336 )
									ret := 0.444444
								if( directionalMovementPlus > 0.294336 )
									ret := 1.000000 // buy
							if( smoothedTrueRange > 13.4727 )
								if( trueRange <= 19.4161 )
									ret := -0.220974
								if( trueRange > 19.4161 )
									ret := 0.365079
					if( dx > 96.5341 )
						if( smoothedTrueRange <= 13.4578 )
							if( smoothedTrueRange <= 8.37459 )
								ret := -0.500000
							if( smoothedTrueRange > 8.37459 )
								if( diPlus <= 0.524736 )
									ret := 0.870370 // buy
								if( diPlus > 0.524736 )
									ret := 0.441176
						if( smoothedTrueRange > 13.4578 )
							if( smoothedTrueRange <= 25.2654 )
								if( adx <= 76.6421 )
									ret := -0.425532
								if( adx > 76.6421 )
									ret := 0.500000
							if( smoothedTrueRange > 25.2654 )
								ret := 1.000000 // buy
				if( diPlus > 3.20349 )
					if( directionalMovementPlus <= 3.555 )
						if( smoothedTrueRange <= 11.744 )
							if( trueRange <= 5.73576 )
								if( adx <= 72.5673 )
									ret := -0.292818
								if( adx > 72.5673 )
									ret := 0.847826 // buy
							if( trueRange > 5.73576 )
								if( adx <= 75.7949 )
									ret := 0.351795
								if( adx > 75.7949 )
									ret := -0.222222
						if( smoothedTrueRange > 11.744 )
							if( adx <= 76.7777 )
								if( smoothedDirectionalMovementPlus <= 2.96353 )
									ret := 0.073031
								if( smoothedDirectionalMovementPlus > 2.96353 )
									ret := 1.000000 // buy
							if( adx > 76.7777 )
								if( smoothedDirectionalMovementPlus <= 0.597047 )
									ret := -0.478261
								if( smoothedDirectionalMovementPlus > 0.597047 )
									ret := 0.646104
					if( directionalMovementPlus > 3.555 )
						if( diPlus <= 5.22361 )
							if( directionalMovementPlus <= 4.12831 )
								ret := 0.928571 // buy
							if( directionalMovementPlus > 4.12831 )
								if( diMinus <= 49.0248 )
									ret := -0.306818
								if( diMinus > 49.0248 )
									ret := 0.366667
						if( diPlus > 5.22361 )
							if( trueRange <= 18.3165 )
								if( smoothedDirectionalMovementMinus <= 6.45338 )
									ret := 0.409326
								if( smoothedDirectionalMovementMinus > 6.45338 )
									ret := 0.820225 // buy
							if( trueRange > 18.3165 )
								if( trueRange <= 21.4447 )
									ret := -0.148936
								if( trueRange > 21.4447 )
									ret := 0.397849
			if( smoothedDirectionalMovementPlus > 4.50147 )
				if( adx <= 70.2604 )
					ret := -0.333333
				if( adx > 70.2604 )
					ret := -1.000000 // sell
		if( diPlus > 9.40264 )
			if( diMinus <= 16.585 )
				if( smoothedTrueRange <= 25.074 )
					ret := 0.411765
				if( smoothedTrueRange > 25.074 )
					if( directionalMovementPlus <= 1.58845 )
						ret := 1.000000 // buy
					if( directionalMovementPlus > 1.58845 )
						ret := 0.846154 // buy
			if( diMinus > 16.585 )
				if( dx <= 6.39662 )
					if( smoothedTrueRange <= 23.1162 )
						if( smoothedDirectionalMovementPlus <= 3.72813 )
							if( smoothedDirectionalMovementPlus <= 3.52978 )
								ret := 0.294118
							if( smoothedDirectionalMovementPlus > 3.52978 )
								if( trueRange <= 19.2871 )
									ret := -1.000000 // sell
								if( trueRange > 19.2871 )
									ret := -0.125000
						if( smoothedDirectionalMovementPlus > 3.72813 )
							if( smoothedDirectionalMovementMinus <= 5.51524 )
								if( diPlus <= 27.0917 )
									ret := 0.208163
								if( diPlus > 27.0917 )
									ret := 0.666667
							if( smoothedDirectionalMovementMinus > 5.51524 )
								ret := -0.782609 // sell
					if( smoothedTrueRange > 23.1162 )
						if( diMinus <= 26.6662 )
							if( diMinus <= 20.4827 )
								ret := 0.000000
							if( diMinus > 20.4827 )
								if( diMinus <= 24.9922 )
									ret := 1.000000 // buy
								if( diMinus > 24.9922 )
									ret := 0.750000 // buy
						if( diMinus > 26.6662 )
							ret := -0.583333
				if( dx > 6.39662 )
					if( smoothedDirectionalMovementPlus <= 9.48483 )
						if( smoothedDirectionalMovementMinus <= 20.4529 )
							if( diMinus <= 28.648 )
								if( adx <= 63.8446 )
									ret := 0.047262
								if( adx > 63.8446 )
									ret := 0.611842
							if( diMinus > 28.648 )
								if( trueRange <= 7.08824 )
									ret := 0.192015
								if( trueRange > 7.08824 )
									ret := -0.062096
						if( smoothedDirectionalMovementMinus > 20.4529 )
							if( smoothedDirectionalMovementPlus <= 6.76149 )
								ret := 0.428571
							if( smoothedDirectionalMovementPlus > 6.76149 )
								ret := 1.000000 // buy
					if( smoothedDirectionalMovementPlus > 9.48483 )
						if( directionalMovementMinus <= 3.27357 )
							if( directionalMovementPlus <= 28.4444 )
								if( diMinus <= 20.136 )
									ret := -0.384615
								if( diMinus > 20.136 )
									ret := -0.975610 // sell
							if( directionalMovementPlus > 28.4444 )
								ret := -0.333333
						if( directionalMovementMinus > 3.27357 )
							ret := 0.153846
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_ETHUSDT_5Min_ba269240(dx, directionalMovementMinus, diPlus, smoothedDirectionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedTrueRange, directionalMovementPlus, diMinus, adx)

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


