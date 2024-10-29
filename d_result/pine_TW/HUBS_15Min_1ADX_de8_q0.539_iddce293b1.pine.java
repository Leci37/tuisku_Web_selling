//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: ADX_and_DI
// ID_model: HUBS_15Min_1ADX_dce293b1 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_HUBS_15Min_1ADX_dce293b1", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_HUBS_15Min_dce293b1(dx, directionalMovementMinus, diPlus, smoothedDirectionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedTrueRange, directionalMovementPlus, diMinus, adx)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( directionalMovementMinus <= 0.253883 )
		if( trueRange <= 1.69478 )
			if( diPlus <= 47.2495 )
				if( smoothedTrueRange <= 4.03524 )
					if( diPlus <= 4.48421 )
						if( dx <= 85.1777 )
							if( adx <= 27.8983 )
								ret := 0.550000
							if( adx > 27.8983 )
								if( smoothedTrueRange <= 0.736341 )
									ret := -0.270270
								if( smoothedTrueRange > 0.736341 )
									ret := -0.588235
						if( dx > 85.1777 )
							if( smoothedDirectionalMovementPlus <= 0.007107 )
								if( diMinus <= 43.2311 )
									ret := 0.093750
								if( diMinus > 43.2311 )
									ret := 0.500000
							if( smoothedDirectionalMovementPlus > 0.007107 )
								if( adx <= 56.2884 )
									ret := 0.386667
								if( adx > 56.2884 )
									ret := -0.448276
					if( diPlus > 4.48421 )
						if( diMinus <= 59.6808 )
							if( smoothedTrueRange <= 0.160528 )
								if( smoothedDirectionalMovementPlus <= 0.015179 )
									ret := -0.720000 // sell
								if( smoothedDirectionalMovementPlus > 0.015179 )
									ret := -0.181818
							if( smoothedTrueRange > 0.160528 )
								if( trueRange <= 0.513233 )
									ret := 0.049287
								if( trueRange > 0.513233 )
									ret := -0.007199
						if( diMinus > 59.6808 )
							if( directionalMovementPlus <= 0.002071 )
								ret := 0.750000 // buy
							if( directionalMovementPlus > 0.002071 )
								ret := 1.000000 // buy
				if( smoothedTrueRange > 4.03524 )
					if( dx <= 8.55577 )
						if( trueRange <= 1.0475 )
							if( diMinus <= 22.2289 )
								ret := -0.611111
							if( diMinus > 22.2289 )
								if( diPlus <= 22.6965 )
									ret := -1.000000 // sell
								if( diPlus > 22.6965 )
									ret := -0.687500
						if( trueRange > 1.0475 )
							if( smoothedTrueRange <= 5.51738 )
								if( smoothedTrueRange <= 4.36203 )
									ret := 0.000000
								if( smoothedTrueRange > 4.36203 )
									ret := 0.777778 // buy
							if( smoothedTrueRange > 5.51738 )
								ret := -0.100000
					if( dx > 8.55577 )
						if( adx <= 30.5144 )
							if( dx <= 23.6867 )
								if( adx <= 19.2807 )
									ret := 0.090909
								if( adx > 19.2807 )
									ret := 0.862069 // buy
							if( dx > 23.6867 )
								if( adx <= 27.6949 )
									ret := -0.404762
								if( adx > 27.6949 )
									ret := 0.666667
						if( adx > 30.5144 )
							if( trueRange <= 0.968773 )
								if( dx <= 44.8754 )
									ret := -0.837209 // sell
								if( dx > 44.8754 )
									ret := -0.032258
							if( trueRange > 0.968773 )
								if( smoothedDirectionalMovementMinus <= 0.706901 )
									ret := -0.406250
								if( smoothedDirectionalMovementMinus > 0.706901 )
									ret := 0.117021
			if( diPlus > 47.2495 )
				if( diMinus <= 11.8048 )
					if( adx <= 25.7629 )
						if( smoothedTrueRange <= 0.587096 )
							ret := 0.052632
						if( smoothedTrueRange > 0.587096 )
							if( adx <= 22.8407 )
								ret := -0.416667
							if( adx > 22.8407 )
								ret := -1.000000 // sell
					if( adx > 25.7629 )
						if( adx <= 51.7867 )
							if( directionalMovementMinus <= 0.0049 )
								if( dx <= 73.4087 )
									ret := 0.040404
								if( dx > 73.4087 )
									ret := 0.416667
							if( directionalMovementMinus > 0.0049 )
								if( directionalMovementMinus <= 0.055 )
									ret := -0.789474 // sell
								if( directionalMovementMinus > 0.055 )
									ret := 0.272727
						if( adx > 51.7867 )
							if( adx <= 63.3872 )
								if( diMinus <= 5.68721 )
									ret := -0.455090
								if( diMinus > 5.68721 )
									ret := 0.000000
							if( adx > 63.3872 )
								if( smoothedDirectionalMovementPlus <= 0.488355 )
									ret := 0.032520
								if( smoothedDirectionalMovementPlus > 0.488355 )
									ret := 0.325714
				if( diMinus > 11.8048 )
					if( directionalMovementPlus <= 0.295 )
						if( diMinus <= 21.1388 )
							if( trueRange <= 0.155073 )
								if( adx <= 31.5429 )
									ret := -0.470588
								if( adx > 31.5429 )
									ret := 0.235294
							if( trueRange > 0.155073 )
								if( smoothedTrueRange <= 3.109 )
									ret := 0.697917
								if( smoothedTrueRange > 3.109 )
									ret := -0.083333
						if( diMinus > 21.1388 )
							if( smoothedDirectionalMovementPlus <= 0.964953 )
								ret := 0.200000
							if( smoothedDirectionalMovementPlus > 0.964953 )
								ret := -0.909091 // sell
					if( directionalMovementPlus > 0.295 )
						if( trueRange <= 1.36497 )
							if( smoothedDirectionalMovementPlus <= 0.822423 )
								if( dx <= 51.7896 )
									ret := 0.454545
								if( dx > 51.7896 )
									ret := -0.173077
							if( smoothedDirectionalMovementPlus > 0.822423 )
								ret := 0.909091 // buy
						if( trueRange > 1.36497 )
							if( smoothedTrueRange <= 1.37014 )
								ret := 0.222222
							if( smoothedTrueRange > 1.37014 )
								ret := -0.769231 // sell
		if( trueRange > 1.69478 )
			if( directionalMovementPlus <= 17.6583 )
				if( trueRange <= 2.80095 )
					if( adx <= 67.7977 )
						if( diPlus <= 49.6973 )
							if( dx <= 15.8454 )
								if( diPlus <= 20.4552 )
									ret := 0.196030
								if( diPlus > 20.4552 )
									ret := -0.054327
							if( dx > 15.8454 )
								if( dx <= 20.1614 )
									ret := -0.265845
								if( dx > 20.1614 )
									ret := -0.071853
						if( diPlus > 49.6973 )
							if( trueRange <= 1.80083 )
								if( smoothedDirectionalMovementMinus <= 0.043929 )
									ret := 0.545455
								if( smoothedDirectionalMovementMinus > 0.043929 )
									ret := 0.687500
							if( trueRange > 1.80083 )
								if( dx <= 97.185 )
									ret := 0.227273
								if( dx > 97.185 )
									ret := -1.000000 // sell
					if( adx > 67.7977 )
						if( smoothedDirectionalMovementPlus <= 2.1163 )
							if( smoothedDirectionalMovementMinus <= 1.24558 )
								if( diMinus <= 33.9026 )
									ret := 0.266667
								if( diMinus > 33.9026 )
									ret := 0.688312
							if( smoothedDirectionalMovementMinus > 1.24558 )
								if( diPlus <= 10.3541 )
									ret := -0.135593
								if( diPlus > 10.3541 )
									ret := -0.666667
						if( smoothedDirectionalMovementPlus > 2.1163 )
							if( smoothedDirectionalMovementMinus <= 0.202525 )
								ret := -0.937500 // sell
							if( smoothedDirectionalMovementMinus > 0.202525 )
								if( directionalMovementPlus <= 0.16204 )
									ret := 0.000000
								if( directionalMovementPlus > 0.16204 )
									ret := -0.357143
				if( trueRange > 2.80095 )
					if( smoothedTrueRange <= 5.19981 )
						if( adx <= 25.2382 )
							if( trueRange <= 6.92132 )
								if( diMinus <= 45.907 )
									ret := -0.096225
								if( diMinus > 45.907 )
									ret := 0.941176 // buy
							if( trueRange > 6.92132 )
								if( dx <= 70.0455 )
									ret := 0.332410
								if( dx > 70.0455 )
									ret := -0.448980
						if( adx > 25.2382 )
							if( diPlus <= 16.9381 )
								if( smoothedDirectionalMovementPlus <= 0.429874 )
									ret := 0.111635
								if( smoothedDirectionalMovementPlus > 0.429874 )
									ret := -0.183299
							if( diPlus > 16.9381 )
								if( directionalMovementPlus <= 0.001925 )
									ret := 0.040773
								if( directionalMovementPlus > 0.001925 )
									ret := -0.210761
					if( smoothedTrueRange > 5.19981 )
						if( diPlus <= 62.5437 )
							if( smoothedDirectionalMovementPlus <= 5.3924 )
								if( diMinus <= 41.034 )
									ret := -0.064364
								if( diMinus > 41.034 )
									ret := 0.200508
							if( smoothedDirectionalMovementPlus > 5.3924 )
								if( dx <= 16.8496 )
									ret := -0.352941
								if( dx > 16.8496 )
									ret := -0.743590 // sell
						if( diPlus > 62.5437 )
							if( smoothedDirectionalMovementPlus <= 5.47321 )
								ret := 0.631579
							if( smoothedDirectionalMovementPlus > 5.47321 )
								if( dx <= 87.641 )
									ret := 1.000000 // buy
								if( dx > 87.641 )
									ret := 0.875000 // buy
			if( directionalMovementPlus > 17.6583 )
				if( adx <= 23.3229 )
					ret := -0.666667
				if( adx > 23.3229 )
					if( smoothedDirectionalMovementMinus <= 0.290662 )
						ret := 1.000000 // buy
					if( smoothedDirectionalMovementMinus > 0.290662 )
						if( smoothedTrueRange <= 9.52717 )
							if( diPlus <= 46.2316 )
								if( smoothedTrueRange <= 6.31211 )
									ret := 0.588235
								if( smoothedTrueRange > 6.31211 )
									ret := -0.736842 // sell
							if( diPlus > 46.2316 )
								if( dx <= 70.8359 )
									ret := 0.857143 // buy
								if( dx > 70.8359 )
									ret := 0.058824
						if( smoothedTrueRange > 9.52717 )
							if( trueRange <= 28.9463 )
								ret := 0.500000
							if( trueRange > 28.9463 )
								ret := 1.000000 // buy
	if( directionalMovementMinus > 0.253883 )
		if( diMinus <= 57.4617 )
			if( smoothedDirectionalMovementPlus <= 0.000529 )
				if( diMinus <= 43.9257 )
					ret := 0.500000
				if( diMinus > 43.9257 )
					if( smoothedTrueRange <= 2.20685 )
						if( diMinus <= 49.1928 )
							ret := -1.000000 // sell
						if( diMinus > 49.1928 )
							ret := -0.230769
					if( smoothedTrueRange > 2.20685 )
						ret := -0.958333 // sell
			if( smoothedDirectionalMovementPlus > 0.000529 )
				if( adx <= 37.9324 )
					if( smoothedTrueRange <= 3.49238 )
						if( diMinus <= 16.7989 )
							if( adx <= 17.4678 )
								if( smoothedTrueRange <= 2.42619 )
									ret := -0.565657
								if( smoothedTrueRange > 2.42619 )
									ret := 0.259259
							if( adx > 17.4678 )
								if( dx <= 51.7604 )
									ret := -0.123173
								if( dx > 51.7604 )
									ret := 0.115830
						if( diMinus > 16.7989 )
							if( dx <= 43.5292 )
								if( diMinus <= 44.2393 )
									ret := 0.077172
								if( diMinus > 44.2393 )
									ret := -0.247899
							if( dx > 43.5292 )
								if( diPlus <= 52.7889 )
									ret := -0.019566
								if( diPlus > 52.7889 )
									ret := -0.961538 // sell
					if( smoothedTrueRange > 3.49238 )
						if( directionalMovementMinus <= 28.0737 )
							if( directionalMovementMinus <= 21.8536 )
								if( smoothedDirectionalMovementPlus <= 0.996421 )
									ret := -0.192933
								if( smoothedDirectionalMovementPlus > 0.996421 )
									ret := -0.016736
							if( directionalMovementMinus > 21.8536 )
								if( directionalMovementMinus <= 24.8597 )
									ret := 0.923077 // buy
								if( directionalMovementMinus > 24.8597 )
									ret := 0.384615
						if( directionalMovementMinus > 28.0737 )
							if( diPlus <= 33.7693 )
								ret := -1.000000 // sell
							if( diPlus > 33.7693 )
								ret := -0.909091 // sell
				if( adx > 37.9324 )
					if( directionalMovementPlus <= 0.460083 )
						if( diPlus <= 2.79731 )
							if( smoothedDirectionalMovementMinus <= 1.24563 )
								if( smoothedTrueRange <= 2.40681 )
									ret := 0.856115 // buy
								if( smoothedTrueRange > 2.40681 )
									ret := 0.434783
							if( smoothedDirectionalMovementMinus > 1.24563 )
								if( dx <= 94.9379 )
									ret := 0.157895
								if( dx > 94.9379 )
									ret := -0.593750
						if( diPlus > 2.79731 )
							if( smoothedDirectionalMovementPlus <= 0.085461 )
								if( adx <= 81.4213 )
									ret := -0.078454
								if( adx > 81.4213 )
									ret := 0.857143 // buy
							if( smoothedDirectionalMovementPlus > 0.085461 )
								if( diMinus <= 56.6507 )
									ret := 0.102579
								if( diMinus > 56.6507 )
									ret := -0.648649
					if( directionalMovementPlus > 0.460083 )
						if( diPlus <= 5.43395 )
							if( smoothedDirectionalMovementPlus <= 0.110267 )
								ret := -0.500000
							if( smoothedDirectionalMovementPlus > 0.110267 )
								ret := -1.000000 // sell
						if( diPlus > 5.43395 )
							if( directionalMovementPlus <= 0.846891 )
								if( dx <= 17.4514 )
									ret := 0.090909
								if( dx > 17.4514 )
									ret := -0.494253
							if( directionalMovementPlus > 0.846891 )
								if( trueRange <= 4.15695 )
									ret := 0.252632
								if( trueRange > 4.15695 )
									ret := -0.166667
		if( diMinus > 57.4617 )
			if( smoothedDirectionalMovementPlus <= 0.103331 )
				if( diMinus <= 61.9876 )
					if( adx <= 34.7692 )
						if( dx <= 79.281 )
							ret := 0.700000 // buy
						if( dx > 79.281 )
							ret := 1.000000 // buy
					if( adx > 34.7692 )
						if( smoothedTrueRange <= 0.555666 )
							ret := -0.681818
						if( smoothedTrueRange > 0.555666 )
							if( directionalMovementMinus <= 0.780622 )
								if( adx <= 81.5846 )
									ret := -0.333333
								if( adx > 81.5846 )
									ret := 0.900000 // buy
							if( directionalMovementMinus > 0.780622 )
								if( diPlus <= 1.30699 )
									ret := 0.763158 // buy
								if( diPlus > 1.30699 )
									ret := 0.035714
				if( diMinus > 61.9876 )
					if( trueRange <= 4.00652 )
						if( diPlus <= 3.28356 )
							if( diPlus <= 1.38945 )
								ret := -0.937500 // sell
							if( diPlus > 1.38945 )
								ret := 0.333333
						if( diPlus > 3.28356 )
							if( smoothedDirectionalMovementMinus <= 0.872461 )
								ret := -1.000000 // sell
							if( smoothedDirectionalMovementMinus > 0.872461 )
								ret := -0.900000 // sell
					if( trueRange > 4.00652 )
						if( smoothedDirectionalMovementMinus <= 2.12143 )
							ret := -0.368421
						if( smoothedDirectionalMovementMinus > 2.12143 )
							ret := 0.761905 // buy
			if( smoothedDirectionalMovementPlus > 0.103331 )
				if( smoothedDirectionalMovementPlus <= 0.134169 )
					if( smoothedTrueRange <= 1.37844 )
						ret := 0.636364
					if( smoothedTrueRange > 1.37844 )
						if( diPlus <= 4.34678 )
							ret := 0.714286 // buy
						if( diPlus > 4.34678 )
							ret := 1.000000 // buy
				if( smoothedDirectionalMovementPlus > 0.134169 )
					if( trueRange <= 10.6752 )
						if( directionalMovementPlus <= 0.006621 )
							if( diMinus <= 60.2682 )
								if( diPlus <= 11.8088 )
									ret := 0.111111
								if( diPlus > 11.8088 )
									ret := -0.611111
							if( diMinus > 60.2682 )
								if( dx <= 76.4298 )
									ret := 0.685185
								if( dx > 76.4298 )
									ret := -0.266667
						if( directionalMovementPlus > 0.006621 )
							if( adx <= 47.8191 )
								ret := 0.230769
							if( adx > 47.8191 )
								ret := 1.000000 // buy
					if( trueRange > 10.6752 )
						if( dx <= 63.3681 )
							ret := 0.263158
						if( dx > 63.3681 )
							if( dx <= 70.1654 )
								if( smoothedDirectionalMovementMinus <= 3.31861 )
									ret := 1.000000 // buy
								if( smoothedDirectionalMovementMinus > 3.31861 )
									ret := 0.923077 // buy
							if( dx > 70.1654 )
								if( smoothedDirectionalMovementPlus <= 0.368571 )
									ret := 0.914894 // buy
								if( smoothedDirectionalMovementPlus > 0.368571 )
									ret := 0.000000
	
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
float op_operation = decision_tree_0_HUBS_15Min_dce293b1(dx, directionalMovementMinus, diPlus, smoothedDirectionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedTrueRange, directionalMovementPlus, diMinus, adx)

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


