//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: ADX_and_DI
// ID_model: AMZN_30Min_1ADX_9edefe55 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMZN_30Min_1ADX_9edefe55", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMZN_30Min_9edefe55(smoothedDirectionalMovementMinus, directionalMovementMinus, diMinus, dx, directionalMovementPlus, smoothedDirectionalMovementPlus, adx, trueRange, smoothedTrueRange, diPlus)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( smoothedDirectionalMovementMinus <= 2.05502 )
		if( directionalMovementPlus <= 35.5341 )
			if( diMinus <= 1.8751 )
				if( adx <= 85.1611 )
					if( smoothedTrueRange <= 4.12467 )
						if( adx <= 73.4303 )
							if( directionalMovementMinus <= 0.000198 )
								if( adx <= 69.9676 )
									ret := 0.184332
								if( adx > 69.9676 )
									ret := 0.705882 // buy
							if( directionalMovementMinus > 0.000198 )
								if( diMinus <= 1.46344 )
									ret := 0.933333 // buy
								if( diMinus > 1.46344 )
									ret := 0.266667
						if( adx > 73.4303 )
							if( diMinus <= 0.585269 )
								ret := -0.913043 // sell
							if( diMinus > 0.585269 )
								if( diPlus <= 41.8012 )
									ret := 0.583333
								if( diPlus > 41.8012 )
									ret := -0.208333
					if( smoothedTrueRange > 4.12467 )
						if( directionalMovementMinus <= 0.009461 )
							if( smoothedDirectionalMovementPlus <= 2.08231 )
								if( dx <= 94.6696 )
									ret := 0.272727
								if( dx > 94.6696 )
									ret := 0.000000
							if( smoothedDirectionalMovementPlus > 2.08231 )
								if( directionalMovementPlus <= 0.01182 )
									ret := 0.323529
								if( directionalMovementPlus > 0.01182 )
									ret := 0.698795
						if( directionalMovementMinus > 0.009461 )
							if( trueRange <= 6.79684 )
								ret := 0.384615
							if( trueRange > 6.79684 )
								ret := -0.181818
				if( adx > 85.1611 )
					if( dx <= 99.6118 )
						if( diMinus <= 0.309041 )
							ret := -0.904762 // sell
						if( diMinus > 0.309041 )
							ret := 0.000000
					if( dx > 99.6118 )
						ret := 0.250000
			if( diMinus > 1.8751 )
				if( smoothedTrueRange <= 2.08503 )
					if( diPlus <= 51.6485 )
						if( adx <= 55.8763 )
							if( trueRange <= 0.328116 )
								if( dx <= 31.3339 )
									ret := 0.034031
								if( dx > 31.3339 )
									ret := 0.117425
							if( trueRange > 0.328116 )
								if( diMinus <= 44.2788 )
									ret := -0.024084
								if( diMinus > 44.2788 )
									ret := 0.152905
						if( adx > 55.8763 )
							if( diPlus <= 37.5233 )
								if( diMinus <= 35.5517 )
									ret := 0.123844
								if( diMinus > 35.5517 )
									ret := -0.183117
							if( diPlus > 37.5233 )
								if( diMinus <= 3.75282 )
									ret := -0.235294
								if( diMinus > 3.75282 )
									ret := 0.399621
					if( diPlus > 51.6485 )
						if( trueRange <= 2.26652 )
							if( smoothedTrueRange <= 1.5669 )
								if( adx <= 31.8082 )
									ret := -0.015385
								if( adx > 31.8082 )
									ret := -0.527523
							if( smoothedTrueRange > 1.5669 )
								if( adx <= 42.6301 )
									ret := 0.187500
								if( adx > 42.6301 )
									ret := -0.157895
						if( trueRange > 2.26652 )
							if( adx <= 25.6325 )
								ret := 0.565217
							if( adx > 25.6325 )
								if( diPlus <= 51.9635 )
									ret := -0.571429
								if( diPlus > 51.9635 )
									ret := -0.050000
				if( smoothedTrueRange > 2.08503 )
					if( smoothedDirectionalMovementMinus <= 0.445618 )
						if( diMinus <= 12.5554 )
							if( adx <= 31.7643 )
								if( trueRange <= 2.8613 )
									ret := 0.119883
								if( trueRange > 2.8613 )
									ret := -0.377778
							if( adx > 31.7643 )
								if( smoothedDirectionalMovementPlus <= 5.5432 )
									ret := 0.119255
								if( smoothedDirectionalMovementPlus > 5.5432 )
									ret := -0.381818
						if( diMinus > 12.5554 )
							if( smoothedDirectionalMovementPlus <= 1.34308 )
								if( directionalMovementMinus <= 0.176941 )
									ret := 0.232022
								if( directionalMovementMinus > 0.176941 )
									ret := 0.016529
							if( smoothedDirectionalMovementPlus > 1.34308 )
								if( trueRange <= 3.36725 )
									ret := -0.095238
								if( trueRange > 3.36725 )
									ret := 0.797872 // buy
					if( smoothedDirectionalMovementMinus > 0.445618 )
						if( directionalMovementMinus <= 9.69647 )
							if( directionalMovementPlus <= 11.0908 )
								if( diMinus <= 38.6969 )
									ret := 0.023295
								if( diMinus > 38.6969 )
									ret := 0.124490
							if( directionalMovementPlus > 11.0908 )
								if( adx <= 34.1439 )
									ret := -0.302956
								if( adx > 34.1439 )
									ret := 0.034826
						if( directionalMovementMinus > 9.69647 )
							if( smoothedDirectionalMovementPlus <= 0.74277 )
								if( adx <= 49.4412 )
									ret := 0.339286
								if( adx > 49.4412 )
									ret := -0.583333
							if( smoothedDirectionalMovementPlus > 0.74277 )
								if( smoothedDirectionalMovementMinus <= 1.6693 )
									ret := -0.088757
								if( smoothedDirectionalMovementMinus > 1.6693 )
									ret := -0.396313
		if( directionalMovementPlus > 35.5341 )
			if( diPlus <= 59.6616 )
				if( trueRange <= 58.0795 )
					if( smoothedDirectionalMovementMinus <= 1.85026 )
						if( smoothedDirectionalMovementMinus <= 1.28018 )
							if( trueRange <= 46.5808 )
								ret := -0.928571 // sell
							if( trueRange > 46.5808 )
								ret := -0.700000 // sell
						if( smoothedDirectionalMovementMinus > 1.28018 )
							ret := -1.000000 // sell
					if( smoothedDirectionalMovementMinus > 1.85026 )
						ret := -0.428571
				if( trueRange > 58.0795 )
					if( diPlus <= 55.8813 )
						ret := 0.000000
					if( diPlus > 55.8813 )
						ret := 0.636364
			if( diPlus > 59.6616 )
				if( smoothedTrueRange <= 10.2397 )
					ret := -1.000000 // sell
				if( smoothedTrueRange > 10.2397 )
					if( directionalMovementPlus <= 51.5059 )
						ret := -0.900000 // sell
					if( directionalMovementPlus > 51.5059 )
						ret := -0.727273 // sell
	if( smoothedDirectionalMovementMinus > 2.05502 )
		if( smoothedDirectionalMovementPlus <= 7.62741 )
			if( diMinus <= 46.5293 )
				if( trueRange <= 10.0506 )
					if( diMinus <= 21.4928 )
						if( diMinus <= 17.8309 )
							if( trueRange <= 8.055 )
								if( adx <= 21.3681 )
									ret := 0.200000
								if( adx > 21.3681 )
									ret := -0.228682
							if( trueRange > 8.055 )
								if( smoothedTrueRange <= 17.3172 )
									ret := -0.102273
								if( smoothedTrueRange > 17.3172 )
									ret := 0.627451
						if( diMinus > 17.8309 )
							if( smoothedDirectionalMovementMinus <= 2.25976 )
								if( dx <= 12.0512 )
									ret := 0.355556
								if( dx > 12.0512 )
									ret := -0.316456
							if( smoothedDirectionalMovementMinus > 2.25976 )
								if( diMinus <= 19.483 )
									ret := 0.453441
								if( diMinus > 19.483 )
									ret := 0.201954
					if( diMinus > 21.4928 )
						if( adx <= 65.137 )
							if( dx <= 74.7683 )
								if( directionalMovementPlus <= 5.60295 )
									ret := -0.054846
								if( directionalMovementPlus > 5.60295 )
									ret := 0.288889
							if( dx > 74.7683 )
								if( trueRange <= 4.24 )
									ret := 0.559585
								if( trueRange > 4.24 )
									ret := 0.234940
						if( adx > 65.137 )
							if( dx <= 33.1922 )
								if( dx <= 26.6705 )
									ret := -0.250000
								if( dx > 26.6705 )
									ret := 0.787879 // buy
							if( dx > 33.1922 )
								if( diPlus <= 2.82953 )
									ret := -0.757895 // sell
								if( diPlus > 2.82953 )
									ret := -0.273418
				if( trueRange > 10.0506 )
					if( smoothedTrueRange <= 17.9745 )
						if( dx <= 56.5117 )
							if( diPlus <= 11.5847 )
								if( smoothedDirectionalMovementPlus <= 1.18581 )
									ret := -0.217949
								if( smoothedDirectionalMovementPlus > 1.18581 )
									ret := 0.348718
							if( diPlus > 11.5847 )
								if( diMinus <= 26.0695 )
									ret := -0.208882
								if( diMinus > 26.0695 )
									ret := -0.091595
						if( dx > 56.5117 )
							if( trueRange <= 20.9601 )
								if( dx <= 62.0688 )
									ret := -0.668449
								if( dx > 62.0688 )
									ret := -0.343675
							if( trueRange > 20.9601 )
								if( adx <= 35.8274 )
									ret := 0.578947
								if( adx > 35.8274 )
									ret := -0.288288
					if( smoothedTrueRange > 17.9745 )
						if( smoothedTrueRange <= 27.7563 )
							if( adx <= 30.7721 )
								if( smoothedDirectionalMovementMinus <= 3.24054 )
									ret := 0.400000
								if( smoothedDirectionalMovementMinus > 3.24054 )
									ret := -0.106777
							if( adx > 30.7721 )
								if( smoothedDirectionalMovementPlus <= 1.75823 )
									ret := -0.190625
								if( smoothedDirectionalMovementPlus > 1.75823 )
									ret := 0.217587
						if( smoothedTrueRange > 27.7563 )
							if( adx <= 55.4228 )
								if( trueRange <= 16.6455 )
									ret := -0.603306
								if( trueRange > 16.6455 )
									ret := -0.211957
							if( adx > 55.4228 )
								if( trueRange <= 19.9447 )
									ret := -0.785714 // sell
								if( trueRange > 19.9447 )
									ret := 0.326316
			if( diMinus > 46.5293 )
				if( dx <= 99.5595 )
					if( adx <= 95.052 )
						if( dx <= 80.4644 )
							if( diMinus <= 58.2751 )
								if( trueRange <= 18.4091 )
									ret := 0.113656
								if( trueRange > 18.4091 )
									ret := -0.115843
							if( diMinus > 58.2751 )
								if( dx <= 64.0528 )
									ret := 0.809091 // buy
								if( dx > 64.0528 )
									ret := 0.092050
						if( dx > 80.4644 )
							if( directionalMovementMinus <= 3.99216 )
								if( trueRange <= 4.37692 )
									ret := 0.664384
								if( trueRange > 4.37692 )
									ret := -0.126582
							if( directionalMovementMinus > 3.99216 )
								if( trueRange <= 53.3948 )
									ret := 0.570815
								if( trueRange > 53.3948 )
									ret := -0.315789
					if( adx > 95.052 )
						ret := -1.000000 // sell
				if( dx > 99.5595 )
					if( diMinus <= 58.0156 )
						ret := -0.200000
					if( diMinus > 58.0156 )
						if( smoothedTrueRange <= 4.45821 )
							ret := -1.000000 // sell
						if( smoothedTrueRange > 4.45821 )
							ret := -0.916667 // sell
		if( smoothedDirectionalMovementPlus > 7.62741 )
			if( adx <= 38.5479 )
				if( smoothedDirectionalMovementMinus <= 6.64685 )
					if( diPlus <= 43.0799 )
						if( directionalMovementMinus <= 1.24 )
							if( trueRange <= 13.104 )
								if( smoothedTrueRange <= 30.2614 )
									ret := 0.305085
								if( smoothedTrueRange > 30.2614 )
									ret := -0.894737 // sell
							if( trueRange > 13.104 )
								if( trueRange <= 19.3666 )
									ret := -0.474359
								if( trueRange > 19.3666 )
									ret := -0.801170 // sell
						if( directionalMovementMinus > 1.24 )
							if( dx <= 17.4935 )
								ret := -0.214286
							if( dx > 17.4935 )
								if( smoothedTrueRange <= 24.3068 )
									ret := -0.600000
								if( smoothedTrueRange > 24.3068 )
									ret := -0.937500 // sell
					if( diPlus > 43.0799 )
						if( smoothedDirectionalMovementPlus <= 9.74273 )
							if( diMinus <= 15.569 )
								if( directionalMovementPlus <= 40.8016 )
									ret := -0.272727
								if( directionalMovementPlus > 40.8016 )
									ret := -1.000000 // sell
							if( diMinus > 15.569 )
								if( trueRange <= 31.8928 )
									ret := 0.574468
								if( trueRange > 31.8928 )
									ret := -0.034483
						if( smoothedDirectionalMovementPlus > 9.74273 )
							if( smoothedDirectionalMovementMinus <= 3.66236 )
								if( smoothedDirectionalMovementPlus <= 10.1335 )
									ret := 0.272727
								if( smoothedDirectionalMovementPlus > 10.1335 )
									ret := -0.461538
							if( smoothedDirectionalMovementMinus > 3.66236 )
								if( trueRange <= 17.46 )
									ret := -0.862069 // sell
								if( trueRange > 17.46 )
									ret := -1.000000 // sell
				if( smoothedDirectionalMovementMinus > 6.64685 )
					if( smoothedDirectionalMovementPlus <= 7.88682 )
						if( smoothedDirectionalMovementMinus <= 7.51955 )
							ret := -0.666667
						if( smoothedDirectionalMovementMinus > 7.51955 )
							if( smoothedDirectionalMovementMinus <= 10.2045 )
								ret := -0.888889 // sell
							if( smoothedDirectionalMovementMinus > 10.2045 )
								ret := -1.000000 // sell
					if( smoothedDirectionalMovementPlus > 7.88682 )
						if( trueRange <= 37.2011 )
							if( diPlus <= 33.5689 )
								if( smoothedDirectionalMovementMinus <= 9.77741 )
									ret := -0.051282
								if( smoothedDirectionalMovementMinus > 9.77741 )
									ret := -0.781250 // sell
							if( diPlus > 33.5689 )
								if( smoothedTrueRange <= 25.4476 )
									ret := -0.625000
								if( smoothedTrueRange > 25.4476 )
									ret := -0.928571 // sell
						if( trueRange > 37.2011 )
							if( directionalMovementMinus <= 31.2697 )
								if( adx <= 32.8645 )
									ret := 0.743243 // buy
								if( adx > 32.8645 )
									ret := -0.636364
							if( directionalMovementMinus > 31.2697 )
								if( adx <= 18.2853 )
									ret := -0.384615
								if( adx > 18.2853 )
									ret := -0.875000 // sell
			if( adx > 38.5479 )
				if( smoothedDirectionalMovementPlus <= 35.3347 )
					if( smoothedDirectionalMovementPlus <= 15.6651 )
						if( diMinus <= 19.0869 )
							if( diMinus <= 11.5757 )
								if( smoothedTrueRange <= 29.1731 )
									ret := -0.523810
								if( smoothedTrueRange > 29.1731 )
									ret := 0.782609 // buy
							if( diMinus > 11.5757 )
								if( smoothedDirectionalMovementMinus <= 2.19711 )
									ret := 0.117647
								if( smoothedDirectionalMovementMinus > 2.19711 )
									ret := -0.652174
						if( diMinus > 19.0869 )
							if( adx <= 42.8053 )
								if( diPlus <= 39.6677 )
									ret := 0.714286 // buy
								if( diPlus > 39.6677 )
									ret := 1.000000 // buy
							if( adx > 42.8053 )
								if( directionalMovementPlus <= 1.27897 )
									ret := -0.676471
								if( directionalMovementPlus > 1.27897 )
									ret := 0.322581
					if( smoothedDirectionalMovementPlus > 15.6651 )
						if( directionalMovementPlus <= 0.167734 )
							if( diPlus <= 47.1035 )
								ret := 1.000000 // buy
							if( diPlus > 47.1035 )
								if( adx <= 69.0427 )
									ret := -0.300000
								if( adx > 69.0427 )
									ret := 0.000000
						if( directionalMovementPlus > 0.167734 )
							if( smoothedDirectionalMovementPlus <= 19.6684 )
								if( smoothedDirectionalMovementPlus <= 16.9794 )
									ret := 0.818182 // buy
								if( smoothedDirectionalMovementPlus > 16.9794 )
									ret := 1.000000 // buy
							if( smoothedDirectionalMovementPlus > 19.6684 )
								ret := 0.400000
				if( smoothedDirectionalMovementPlus > 35.3347 )
					if( dx <= 60.5645 )
						ret := -1.000000 // sell
					if( dx > 60.5645 )
						ret := -0.866667 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_AMZN_30Min_9edefe55(smoothedDirectionalMovementMinus, directionalMovementMinus, diMinus, dx, directionalMovementPlus, smoothedDirectionalMovementPlus, adx, trueRange, smoothedTrueRange, diPlus)

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


