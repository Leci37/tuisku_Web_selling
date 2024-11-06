//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: ADX_and_DI
// ID_model: QCOM_1Min_1ADX_adb7b136 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_QCOM_1Min_1ADX_adb7b136", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_QCOM_1Min_adb7b136(directionalMovementPlus, directionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedDirectionalMovementMinus, diPlus, diMinus, smoothedTrueRange, adx, dx)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( directionalMovementMinus <= 0.52123 )
		if( directionalMovementPlus <= 0.290352 )
			if( diMinus <= 48.168 )
				if( smoothedDirectionalMovementMinus <= 0.140741 )
					if( smoothedDirectionalMovementPlus <= 0.142641 )
						if( diMinus <= 16.6514 )
							if( smoothedDirectionalMovementMinus <= 0.023345 )
								if( diPlus <= 92.2461 )
									ret := 0.045088
								if( diPlus > 92.2461 )
									ret := -0.800000 // sell
							if( smoothedDirectionalMovementMinus > 0.023345 )
								if( smoothedTrueRange <= 0.542832 )
									ret := 0.142524
								if( smoothedTrueRange > 0.542832 )
									ret := -0.296703
						if( diMinus > 16.6514 )
							if( diPlus <= 1.95909 )
								if( adx <= 92.1232 )
									ret := -0.401198
								if( adx > 92.1232 )
									ret := 1.000000 // buy
							if( diPlus > 1.95909 )
								if( adx <= 12.09 )
									ret := 0.127069
								if( adx > 12.09 )
									ret := 0.023609
					if( smoothedDirectionalMovementPlus > 0.142641 )
						if( adx <= 12.8352 )
							if( diMinus <= 19.7344 )
								if( directionalMovementMinus <= 0.11005 )
									ret := -0.250000
								if( directionalMovementMinus > 0.11005 )
									ret := -0.750000 // sell
							if( diMinus > 19.7344 )
								if( diPlus <= 47.3244 )
									ret := 0.163265
								if( diPlus > 47.3244 )
									ret := 0.631579
						if( adx > 12.8352 )
							if( adx <= 26.6824 )
								if( smoothedDirectionalMovementPlus <= 0.240239 )
									ret := -0.264232
								if( smoothedDirectionalMovementPlus > 0.240239 )
									ret := 0.265823
							if( adx > 26.6824 )
								if( dx <= 75.7473 )
									ret := 0.039216
								if( dx > 75.7473 )
									ret := -0.373016
				if( smoothedDirectionalMovementMinus > 0.140741 )
					if( smoothedDirectionalMovementPlus <= 0.273032 )
						if( diPlus <= 13.3276 )
							if( adx <= 41.2391 )
								if( smoothedTrueRange <= 1.05768 )
									ret := -0.227872
								if( smoothedTrueRange > 1.05768 )
									ret := 1.000000 // buy
							if( adx > 41.2391 )
								if( adx <= 70.4015 )
									ret := 0.112500
								if( adx > 70.4015 )
									ret := 0.470874
						if( diPlus > 13.3276 )
							if( dx <= 33.475 )
								if( diPlus <= 16.8035 )
									ret := -0.259615
								if( diPlus > 16.8035 )
									ret := 0.159975
							if( dx > 33.475 )
								if( diMinus <= 41.0868 )
									ret := 0.620397
								if( diMinus > 41.0868 )
									ret := 0.264368
					if( smoothedDirectionalMovementPlus > 0.273032 )
						if( diPlus <= 68.954 )
							if( dx <= 18.6972 )
								if( diMinus <= 23.6888 )
									ret := 0.888889 // buy
								if( diMinus > 23.6888 )
									ret := -0.099338
							if( dx > 18.6972 )
								if( diMinus <= 17.2911 )
									ret := 0.090909
								if( diMinus > 17.2911 )
									ret := -0.446602
						if( diPlus > 68.954 )
							ret := 1.000000 // buy
			if( diMinus > 48.168 )
				if( diMinus <= 50.2525 )
					if( dx <= 74.0026 )
						if( smoothedTrueRange <= 0.19087 )
							if( adx <= 11.9919 )
								if( trueRange <= 0.100825 )
									ret := 0.444444
								if( trueRange > 0.100825 )
									ret := 0.863636 // buy
							if( adx > 11.9919 )
								if( diPlus <= 47.4471 )
									ret := 0.159817
								if( diPlus > 47.4471 )
									ret := -0.383562
						if( smoothedTrueRange > 0.19087 )
							if( adx <= 55.522 )
								if( diPlus <= 48.5306 )
									ret := 0.594595
								if( diPlus > 48.5306 )
									ret := 0.126437
							if( adx > 55.522 )
								if( smoothedTrueRange <= 0.354404 )
									ret := 0.409091
								if( smoothedTrueRange > 0.354404 )
									ret := -0.888889 // sell
					if( dx > 74.0026 )
						if( smoothedDirectionalMovementMinus <= 0.295204 )
							if( trueRange <= 0.4375 )
								if( diPlus <= 0.972702 )
									ret := -0.750000 // sell
								if( diPlus > 0.972702 )
									ret := 0.125714
							if( trueRange > 0.4375 )
								if( smoothedDirectionalMovementMinus <= 0.249474 )
									ret := -0.529412
								if( smoothedDirectionalMovementMinus > 0.249474 )
									ret := -1.000000 // sell
						if( smoothedDirectionalMovementMinus > 0.295204 )
							ret := 1.000000 // buy
				if( diMinus > 50.2525 )
					if( adx <= 79.1799 )
						if( smoothedDirectionalMovementMinus <= 0.047842 )
							if( adx <= 38.6395 )
								if( diPlus <= 38.4873 )
									ret := 0.290323
								if( diPlus > 38.4873 )
									ret := 0.770492 // buy
							if( adx > 38.6395 )
								if( dx <= 69.3093 )
									ret := -0.111111
								if( dx > 69.3093 )
									ret := -1.000000 // sell
						if( smoothedDirectionalMovementMinus > 0.047842 )
							if( adx <= 8.92877 )
								if( adx <= 8.25748 )
									ret := 0.433333
								if( adx > 8.25748 )
									ret := 0.761905 // buy
							if( adx > 8.92877 )
								if( dx <= 1.11121 )
									ret := -0.750000 // sell
								if( dx > 1.11121 )
									ret := 0.106929
					if( adx > 79.1799 )
						if( diMinus <= 68.4176 )
							if( diMinus <= 50.9061 )
								ret := 0.500000
							if( diMinus > 50.9061 )
								if( smoothedTrueRange <= 0.23995 )
									ret := 0.250000
								if( smoothedTrueRange > 0.23995 )
									ret := -0.837209 // sell
						if( diMinus > 68.4176 )
							if( smoothedDirectionalMovementMinus <= 0.15022 )
								ret := 0.500000
							if( smoothedDirectionalMovementMinus > 0.15022 )
								ret := 1.000000 // buy
		if( directionalMovementPlus > 0.290352 )
			if( diPlus <= 51.2158 )
				if( trueRange <= 0.812828 )
					if( directionalMovementPlus <= 0.611813 )
						if( diPlus <= 10.1065 )
							if( adx <= 45.1382 )
								if( smoothedTrueRange <= 0.666751 )
									ret := -0.250000
								if( smoothedTrueRange > 0.666751 )
									ret := 1.000000 // buy
							if( adx > 45.1382 )
								if( smoothedDirectionalMovementMinus <= 0.159794 )
									ret := -0.333333
								if( smoothedDirectionalMovementMinus > 0.159794 )
									ret := -0.866667 // sell
						if( diPlus > 10.1065 )
							if( diPlus <= 40.0389 )
								if( smoothedDirectionalMovementMinus <= 0.02875 )
									ret := 0.303030
								if( smoothedDirectionalMovementMinus > 0.02875 )
									ret := -0.032301
							if( diPlus > 40.0389 )
								if( trueRange <= 0.625662 )
									ret := -0.241176
								if( trueRange > 0.625662 )
									ret := 0.160494
					if( directionalMovementPlus > 0.611813 )
						if( directionalMovementMinus <= 0.056935 )
							if( trueRange <= 0.767324 )
								if( smoothedDirectionalMovementMinus <= 0.206786 )
									ret := -0.596154
								if( smoothedDirectionalMovementMinus > 0.206786 )
									ret := 0.100000
							if( trueRange > 0.767324 )
								if( adx <= 48.8331 )
									ret := 0.166667
								if( adx > 48.8331 )
									ret := -0.833333 // sell
						if( directionalMovementMinus > 0.056935 )
							ret := 1.000000 // buy
				if( trueRange > 0.812828 )
					if( adx <= 15.481 )
						if( adx <= 12.4702 )
							if( diPlus <= 48.438 )
								if( diMinus <= 23.5215 )
									ret := -1.000000 // sell
								if( diMinus > 23.5215 )
									ret := 0.428571
							if( diPlus > 48.438 )
								ret := -1.000000 // sell
						if( adx > 12.4702 )
							if( adx <= 14.5704 )
								if( smoothedTrueRange <= 0.302114 )
									ret := 0.400000
								if( smoothedTrueRange > 0.302114 )
									ret := 1.000000 // buy
							if( adx > 14.5704 )
								if( smoothedDirectionalMovementMinus <= 0.182357 )
									ret := 0.000000
								if( smoothedDirectionalMovementMinus > 0.182357 )
									ret := 1.000000 // buy
					if( adx > 15.481 )
						if( directionalMovementMinus <= 0.010403 )
							if( smoothedDirectionalMovementMinus <= 0.133488 )
								if( adx <= 32.8468 )
									ret := 0.055556
								if( adx > 32.8468 )
									ret := 0.397590
							if( smoothedDirectionalMovementMinus > 0.133488 )
								if( adx <= 18.1157 )
									ret := -0.882353 // sell
								if( adx > 18.1157 )
									ret := -0.096774
						if( directionalMovementMinus > 0.010403 )
							if( adx <= 49.0887 )
								if( smoothedDirectionalMovementMinus <= 0.138632 )
									ret := 0.935484 // buy
								if( smoothedDirectionalMovementMinus > 0.138632 )
									ret := 0.285714
							if( adx > 49.0887 )
								if( smoothedDirectionalMovementMinus <= 0.091469 )
									ret := 1.000000 // buy
								if( smoothedDirectionalMovementMinus > 0.091469 )
									ret := -0.571429
			if( diPlus > 51.2158 )
				if( diPlus <= 82.1971 )
					if( diMinus <= 4.74878 )
						if( trueRange <= 0.522976 )
							if( smoothedDirectionalMovementPlus <= 0.162286 )
								ret := -0.142857
							if( smoothedDirectionalMovementPlus > 0.162286 )
								ret := -0.833333 // sell
						if( trueRange > 0.522976 )
							ret := 1.000000 // buy
					if( diMinus > 4.74878 )
						if( smoothedDirectionalMovementMinus <= 0.106727 )
							if( adx <= 35.3898 )
								if( smoothedTrueRange <= 0.20081 )
									ret := -0.228155
								if( smoothedTrueRange > 0.20081 )
									ret := -0.524027
							if( adx > 35.3898 )
								if( smoothedDirectionalMovementPlus <= 0.192109 )
									ret := -0.255319
								if( smoothedDirectionalMovementPlus > 0.192109 )
									ret := 0.342105
						if( smoothedDirectionalMovementMinus > 0.106727 )
							if( dx <= 8.99681 )
								if( diMinus <= 46.2273 )
									ret := 0.809524 // buy
								if( diMinus > 46.2273 )
									ret := -0.500000
							if( dx > 8.99681 )
								if( adx <= 18.8064 )
									ret := 0.223404
								if( adx > 18.8064 )
									ret := -0.424460
				if( diPlus > 82.1971 )
					if( diMinus <= 11.1462 )
						if( smoothedDirectionalMovementMinus <= 0.012941 )
							ret := -0.250000
						if( smoothedDirectionalMovementMinus > 0.012941 )
							ret := -1.000000 // sell
					if( diMinus > 11.1462 )
						if( smoothedTrueRange <= 0.262857 )
							ret := 1.000000 // buy
						if( smoothedTrueRange > 0.262857 )
							ret := 0.600000
	if( directionalMovementMinus > 0.52123 )
		if( dx <= 70.3071 )
			if( smoothedDirectionalMovementPlus <= 0.244532 )
				if( trueRange <= 1.66285 )
					if( smoothedTrueRange <= 0.169783 )
						if( dx <= 6.91122 )
							ret := -0.250000
						if( dx > 6.91122 )
							if( smoothedDirectionalMovementMinus <= 0.069854 )
								ret := 0.500000
							if( smoothedDirectionalMovementMinus > 0.069854 )
								if( adx <= 22.421 )
									ret := 0.625000
								if( adx > 22.421 )
									ret := 0.972222 // buy
					if( smoothedTrueRange > 0.169783 )
						if( adx <= 36.0792 )
							if( smoothedDirectionalMovementMinus <= 0.17169 )
								if( dx <= 61.433 )
									ret := 0.233202
								if( dx > 61.433 )
									ret := -0.777778 // sell
							if( smoothedDirectionalMovementMinus > 0.17169 )
								if( smoothedDirectionalMovementMinus <= 0.273187 )
									ret := 0.488987
								if( smoothedDirectionalMovementMinus > 0.273187 )
									ret := -0.352941
						if( adx > 36.0792 )
							if( dx <= 61.0355 )
								if( adx <= 41.939 )
									ret := 0.785047 // buy
								if( adx > 41.939 )
									ret := 0.437500
							if( dx > 61.0355 )
								if( adx <= 61.6935 )
									ret := -0.518519
								if( adx > 61.6935 )
									ret := 0.750000 // buy
				if( trueRange > 1.66285 )
					if( diMinus <= 73.591 )
						if( dx <= 15.4676 )
							ret := 1.000000 // buy
						if( dx > 15.4676 )
							if( smoothedDirectionalMovementMinus <= 0.2725 )
								if( adx <= 43.6604 )
									ret := 0.958333 // buy
								if( adx > 43.6604 )
									ret := -0.200000
							if( smoothedDirectionalMovementMinus > 0.2725 )
								if( smoothedDirectionalMovementMinus <= 0.331211 )
									ret := -0.444444
								if( smoothedDirectionalMovementMinus > 0.331211 )
									ret := 0.785714 // buy
					if( diMinus > 73.591 )
						ret := 1.000000 // buy
			if( smoothedDirectionalMovementPlus > 0.244532 )
				if( adx <= 54.027 )
					if( smoothedTrueRange <= 2.7993 )
						if( adx <= 41.4624 )
							if( smoothedDirectionalMovementMinus <= 0.242625 )
								if( smoothedTrueRange <= 0.466833 )
									ret := 0.750000 // buy
								if( smoothedTrueRange > 0.466833 )
									ret := -0.666667
							if( smoothedDirectionalMovementMinus > 0.242625 )
								if( smoothedDirectionalMovementPlus <= 0.259 )
									ret := -0.800000 // sell
								if( smoothedDirectionalMovementPlus > 0.259 )
									ret := 0.375000
						if( adx > 41.4624 )
							if( smoothedTrueRange <= 0.705493 )
								ret := -0.750000 // sell
							if( smoothedTrueRange > 0.705493 )
								ret := -1.000000 // sell
					if( smoothedTrueRange > 2.7993 )
						ret := 1.000000 // buy
				if( adx > 54.027 )
					ret := 1.000000 // buy
		if( dx > 70.3071 )
			if( diMinus <= 80.6627 )
				if( adx <= 45.3361 )
					if( trueRange <= 1.78144 )
						if( trueRange <= 1.10116 )
							if( adx <= 22.2673 )
								ret := -1.000000 // sell
							if( adx > 22.2673 )
								if( diPlus <= 6.16728 )
									ret := 0.782609 // buy
								if( diPlus > 6.16728 )
									ret := 0.000000
						if( trueRange > 1.10116 )
							if( diPlus <= 7.09595 )
								if( smoothedTrueRange <= 0.531543 )
									ret := -1.000000 // sell
								if( smoothedTrueRange > 0.531543 )
									ret := 0.000000
							if( diPlus > 7.09595 )
								ret := 0.571429
					if( trueRange > 1.78144 )
						ret := 1.000000 // buy
				if( adx > 45.3361 )
					if( diMinus <= 50.5444 )
						if( adx <= 64.2279 )
							if( dx <= 76.4994 )
								ret := 0.000000
							if( dx > 76.4994 )
								ret := -1.000000 // sell
						if( adx > 64.2279 )
							if( dx <= 78.7322 )
								ret := 0.000000
							if( dx > 78.7322 )
								if( dx <= 81.1344 )
									ret := 1.000000 // buy
								if( dx > 81.1344 )
									ret := 0.400000
					if( diMinus > 50.5444 )
						if( trueRange <= 0.637864 )
							ret := 0.500000
						if( trueRange > 0.637864 )
							if( diPlus <= 2.5251 )
								if( diMinus <= 59.4442 )
									ret := -0.882353 // sell
								if( diMinus > 59.4442 )
									ret := 0.500000
							if( diPlus > 2.5251 )
								ret := -1.000000 // sell
			if( diMinus > 80.6627 )
				if( diMinus <= 90.1796 )
					ret := 1.000000 // buy
				if( diMinus > 90.1796 )
					ret := 0.000000
	
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
float op_operation = decision_tree_0_QCOM_1Min_adb7b136(directionalMovementPlus, directionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedDirectionalMovementMinus, diPlus, diMinus, smoothedTrueRange, adx, dx)

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


