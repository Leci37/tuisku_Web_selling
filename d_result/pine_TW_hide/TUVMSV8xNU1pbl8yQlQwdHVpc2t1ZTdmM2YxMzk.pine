//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: MELI_15Min_2BT0_e7f3f139 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MELI_15Min_2BT0_e7f3f139", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MELI_15Min_e7f3f139(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( bbp <= -17.6656 )
		if( bbm <= 0.215111 )
			if( ema13 <= -13.2817 )
				if( ema12 <= -8.09642 )
					if( ema12 <= -33.3032 )
						ret := 1.000000 // buy
					if( ema12 > -33.3032 )
						if( ema1 <= 1452.89 )
							if( bullPower <= -9.9957 )
								if( ema3 <= 1162.88 )
									ret := 0.398148
								if( ema3 > 1162.88 )
									ret := 0.764706 // buy
							if( bullPower > -9.9957 )
								ret := -0.588235
						if( ema1 > 1452.89 )
							if( ema12 <= -15.2596 )
								ret := -0.739130 // sell
							if( ema12 > -15.2596 )
								if( ema2 <= 1473.93 )
									ret := -1.000000 // sell
								if( ema2 > 1473.93 )
									ret := 0.320000
				if( ema12 > -8.09642 )
					if( bearPower <= -10.5799 )
						ret := 0.714286 // buy
					if( bearPower > -10.5799 )
						ret := 1.000000 // buy
			if( ema13 > -13.2817 )
				if( bearPower <= -11.8259 )
					if( ema1 <= 639.178 )
						if( ema13 <= -3.45587 )
							if( bullPower <= -15.4447 )
								ret := 0.900000 // buy
							if( bullPower > -15.4447 )
								ret := 1.000000 // buy
						if( ema13 > -3.45587 )
							ret := 0.636364
					if( ema1 > 639.178 )
						if( ema13 <= -8.88225 )
							if( tema <= 966.305 )
								ret := -0.454545
							if( tema > 966.305 )
								if( tema <= 1489.79 )
									ret := 0.680000
								if( tema > 1489.79 )
									ret := 0.000000
						if( ema13 > -8.88225 )
							if( tema <= 1022.87 )
								if( ema13 <= -2.53892 )
									ret := -0.660000
								if( ema13 > -2.53892 )
									ret := 0.416667
							if( tema > 1022.87 )
								if( ema12 <= -3.01646 )
									ret := 0.625000
								if( ema12 > -3.01646 )
									ret := 0.033333
				if( bearPower > -11.8259 )
					if( tema <= 456.793 )
						if( bbp <= -21.5314 )
							ret := 1.000000 // buy
						if( bbp > -21.5314 )
							ret := 0.083333
					if( tema > 456.793 )
						if( ema12 <= -5.89776 )
							if( ema1 <= 1087.55 )
								ret := -1.000000 // sell
							if( ema1 > 1087.55 )
								if( bearPower <= -10.1956 )
									ret := -1.000000 // sell
								if( bearPower > -10.1956 )
									ret := -0.666667
						if( ema12 > -5.89776 )
							if( ema2 <= 511.306 )
								ret := -1.000000 // sell
							if( ema2 > 511.306 )
								if( bearPower <= -10.0585 )
									ret := -0.277778
								if( bearPower > -10.0585 )
									ret := 0.342105
		if( bbm > 0.215111 )
			if( ema12 <= -20.586 )
				if( bbm <= 2.92874 )
					ret := -0.714286 // sell
				if( bbm > 2.92874 )
					if( ema2 <= 1286.57 )
						if( bbm <= 13.8871 )
							if( ema3 <= 1015.85 )
								ret := 0.538462
							if( ema3 > 1015.85 )
								if( ema12 <= -25.006 )
									ret := 1.000000 // buy
								if( ema12 > -25.006 )
									ret := 0.647059
						if( bbm > 13.8871 )
							if( tema <= 1105.8 )
								ret := -0.466667
							if( tema > 1105.8 )
								if( bbp <= -85.0204 )
									ret := -1.000000 // sell
								if( bbp > -85.0204 )
									ret := -0.818182 // sell
					if( ema2 > 1286.57 )
						if( ema2 <= 1762.24 )
							if( ema12 <= -21.8167 )
								if( bullPower <= -34.6119 )
									ret := 0.645161
								if( bullPower > -34.6119 )
									ret := 0.956522 // buy
							if( ema12 > -21.8167 )
								if( tema <= 1399.7 )
									ret := 0.250000
								if( tema > 1399.7 )
									ret := 0.666667
						if( ema2 > 1762.24 )
							if( bbm <= 9.37575 )
								ret := -0.600000
							if( bbm > 9.37575 )
								if( ema12 <= -22.6473 )
									ret := 0.611111
								if( ema12 > -22.6473 )
									ret := -0.400000
			if( ema12 > -20.586 )
				if( bullPower <= -23.5905 )
					if( ema3 <= 891.226 )
						if( bearPower <= -34.293 )
							ret := 0.928571 // buy
						if( bearPower > -34.293 )
							if( ema2 <= 667.614 )
								ret := 0.200000
							if( ema2 > 667.614 )
								ret := -0.200000
					if( ema3 > 891.226 )
						if( ema1 <= 1651.23 )
							if( ema3 <= 1215.96 )
								if( ema3 <= 987.684 )
									ret := -0.900000 // sell
								if( ema3 > 987.684 )
									ret := -0.029851
							if( ema3 > 1215.96 )
								if( ema2 <= 1344.96 )
									ret := -1.000000 // sell
								if( ema2 > 1344.96 )
									ret := -0.598291
						if( ema1 > 1651.23 )
							if( bullPower <= -25.4791 )
								if( ema2 <= 1756.78 )
									ret := 0.928571 // buy
								if( ema2 > 1756.78 )
									ret := 0.142857
							if( bullPower > -25.4791 )
								ret := -0.428571
				if( bullPower > -23.5905 )
					if( tema <= 655.366 )
						if( ema12 <= -7.79125 )
							if( ema3 <= 653.963 )
								if( ema3 <= 495.7 )
									ret := 0.337209
								if( ema3 > 495.7 )
									ret := 0.805031 // buy
							if( ema3 > 653.963 )
								if( bbp <= -37.961 )
									ret := 0.206897
								if( bbp > -37.961 )
									ret := -0.347826
						if( ema12 > -7.79125 )
							if( bullPower <= -8.85671 )
								if( bbp <= -34.704 )
									ret := -0.545455
								if( bbp > -34.704 )
									ret := 0.370370
							if( bullPower > -8.85671 )
								if( bbm <= 17.5057 )
									ret := -0.366310
								if( bbm > 17.5057 )
									ret := 0.545455
					if( tema > 655.366 )
						if( ema3 <= 773.868 )
							if( ema2 <= 711.55 )
								if( bullPower <= -14.8573 )
									ret := 0.000000
								if( bullPower > -14.8573 )
									ret := -0.488189
							if( ema2 > 711.55 )
								if( ema13 <= -28.7147 )
									ret := -0.375000
								if( ema13 > -28.7147 )
									ret := -0.917431 // sell
						if( ema3 > 773.868 )
							if( ema1 <= 1791.84 )
								if( ema1 <= 1186.51 )
									ret := -0.051298
								if( ema1 > 1186.51 )
									ret := -0.184753
							if( ema1 > 1791.84 )
								if( ema13 <= -9.73973 )
									ret := 0.027356
								if( ema13 > -9.73973 )
									ret := 0.373418
	if( bbp > -17.6656 )
		if( ema13 <= 3.00198 )
			if( ema13 <= -15.281 )
				if( bullPower <= -6.23125 )
					if( ema2 <= 1245.34 )
						if( ema13 <= -15.8777 )
							ret := -1.000000 // sell
						if( ema13 > -15.8777 )
							ret := -0.888889 // sell
					if( ema2 > 1245.34 )
						ret := 0.062500
				if( bullPower > -6.23125 )
					if( ema3 <= 1248.07 )
						if( tema <= 1052.13 )
							if( tema <= 920.408 )
								if( ema3 <= 812.463 )
									ret := -0.287356
								if( ema3 > 812.463 )
									ret := 0.606557
							if( tema > 920.408 )
								if( bearPower <= -11.1107 )
									ret := -0.846154 // sell
								if( bearPower > -11.1107 )
									ret := -0.489796
						if( tema > 1052.13 )
							if( ema1 <= 1077.3 )
								ret := 1.000000 // buy
							if( ema1 > 1077.3 )
								if( bbp <= -6.80339 )
									ret := 0.491525
								if( bbp > -6.80339 )
									ret := -0.190476
					if( ema3 > 1248.07 )
						if( tema <= 1483.5 )
							if( ema2 <= 1458.67 )
								if( ema3 <= 1412.73 )
									ret := -0.710526 // sell
								if( ema3 > 1412.73 )
									ret := 0.200000
							if( ema2 > 1458.67 )
								ret := -1.000000 // sell
						if( tema > 1483.5 )
							if( ema3 <= 1665.54 )
								if( bbp <= -4.68535 )
									ret := 0.272727
								if( bbp > -4.68535 )
									ret := -0.333333
							if( ema3 > 1665.54 )
								if( ema2 <= 1817.89 )
									ret := -0.432836
								if( ema2 > 1817.89 )
									ret := 0.129032
			if( ema13 > -15.281 )
				if( bullPower <= 19.8991 )
					if( bearPower <= 2.57192 )
						if( bbp <= 5.29569 )
							if( bbm <= 1.00699 )
								if( bbp <= -15.1961 )
									ret := 0.446602
								if( bbp > -15.1961 )
									ret := 0.075607
							if( bbm > 1.00699 )
								if( ema12 <= -3.49397 )
									ret := 0.093588
								if( ema12 > -3.49397 )
									ret := 0.009702
						if( bbp > 5.29569 )
							if( ema3 <= 280.974 )
								if( ema3 <= 178.51 )
									ret := 0.900000 // buy
								if( ema3 > 178.51 )
									ret := -0.296875
							if( ema3 > 280.974 )
								if( ema2 <= 323.566 )
									ret := 0.517699
								if( ema2 > 323.566 )
									ret := 0.113104
					if( bearPower > 2.57192 )
						if( bullPower <= 3.86013 )
							if( ema13 <= 2.54505 )
								if( ema3 <= 1619.36 )
									ret := -0.504167
								if( ema3 > 1619.36 )
									ret := 0.227273
							if( ema13 > 2.54505 )
								if( tema <= 303.489 )
									ret := 0.615385
								if( tema > 303.489 )
									ret := 0.068966
						if( bullPower > 3.86013 )
							if( ema12 <= 1.5535 )
								if( ema1 <= 1452.03 )
									ret := -0.184874
								if( ema1 > 1452.03 )
									ret := 0.066667
							if( ema12 > 1.5535 )
								if( bearPower <= 9.76537 )
									ret := 0.080369
								if( bearPower > 9.76537 )
									ret := -0.373333
				if( bullPower > 19.8991 )
					if( ema2 <= 773.357 )
						ret := 0.111111
					if( ema2 > 773.357 )
						if( ema1 <= 1198.12 )
							if( bearPower <= 9.73827 )
								if( bbp <= 28.1444 )
									ret := -0.710145 // sell
								if( bbp > 28.1444 )
									ret := 0.636364
							if( bearPower > 9.73827 )
								if( bbp <= 46.3694 )
									ret := -0.888889 // sell
								if( bbp > 46.3694 )
									ret := -1.000000 // sell
						if( ema1 > 1198.12 )
							if( ema1 <= 1256.36 )
								ret := 0.588235
							if( ema1 > 1256.36 )
								if( bearPower <= 17.7962 )
									ret := -0.425926
								if( bearPower > 17.7962 )
									ret := -0.909091 // sell
		if( ema13 > 3.00198 )
			if( tema <= 268.828 )
				if( ema12 <= 2.55851 )
					if( ema13 <= 4.01641 )
						if( ema3 <= 251.386 )
							if( ema3 <= 233.659 )
								ret := -0.062500
							if( ema3 > 233.659 )
								ret := 0.100000
						if( ema3 > 251.386 )
							ret := 0.769231 // buy
					if( ema13 > 4.01641 )
						if( ema2 <= 249.427 )
							ret := 0.363636
						if( ema2 > 249.427 )
							if( bearPower <= 1.82015 )
								ret := 1.000000 // buy
							if( bearPower > 1.82015 )
								ret := 0.833333 // buy
				if( ema12 > 2.55851 )
					if( ema13 <= 6.36714 )
						if( ema1 <= 245.537 )
							ret := 1.000000 // buy
						if( ema1 > 245.537 )
							if( bbp <= 8.28974 )
								ret := 1.000000 // buy
							if( bbp > 8.28974 )
								ret := 0.750000 // buy
					if( ema13 > 6.36714 )
						ret := 0.466667
			if( tema > 268.828 )
				if( ema2 <= 664.715 )
					if( bbm <= 2.08301 )
						if( bearPower <= -0.85558 )
							if( ema12 <= 1.44213 )
								ret := -0.583333
							if( ema12 > 1.44213 )
								ret := -1.000000 // sell
						if( bearPower > -0.85558 )
							if( bbp <= 18.2283 )
								if( ema12 <= 3.49821 )
									ret := -0.059555
								if( ema12 > 3.49821 )
									ret := 0.370690
							if( bbp > 18.2283 )
								if( ema12 <= 10.8604 )
									ret := -0.568627
								if( ema12 > 10.8604 )
									ret := 0.916667 // buy
					if( bbm > 2.08301 )
						if( ema2 <= 353.82 )
							if( bearPower <= 7.6824 )
								if( tema <= 356.294 )
									ret := -0.220463
								if( tema > 356.294 )
									ret := -0.851485 // sell
							if( bearPower > 7.6824 )
								ret := -1.000000 // sell
						if( ema2 > 353.82 )
							if( tema <= 466.139 )
								if( ema1 <= 462.113 )
									ret := 0.073043
								if( ema1 > 462.113 )
									ret := 1.000000 // buy
							if( tema > 466.139 )
								if( bbp <= -8.04092 )
									ret := 0.809524 // buy
								if( bbp > -8.04092 )
									ret := -0.176521
				if( ema2 > 664.715 )
					if( tema <= 1538.85 )
						if( ema3 <= 672.805 )
							if( ema13 <= 4.21766 )
								ret := -0.307692
							if( ema13 > 4.21766 )
								if( ema2 <= 666.006 )
									ret := 0.100000
								if( ema2 > 666.006 )
									ret := 0.734177 // buy
						if( ema3 > 672.805 )
							if( bullPower <= -5.89144 )
								if( bbp <= -14.8099 )
									ret := -1.000000 // sell
								if( bbp > -14.8099 )
									ret := -0.538462
							if( bullPower > -5.89144 )
								if( ema2 <= 1414.07 )
									ret := -0.003626
								if( ema2 > 1414.07 )
									ret := 0.199225
					if( tema > 1538.85 )
						if( ema12 <= 5.5167 )
							if( ema1 <= 2051.22 )
								if( bullPower <= 25.345 )
									ret := -0.164824
								if( bullPower > 25.345 )
									ret := 0.285714
							if( ema1 > 2051.22 )
								if( tema <= 2099.6 )
									ret := -0.736842 // sell
								if( tema > 2099.6 )
									ret := 0.054054
						if( ema12 > 5.5167 )
							if( ema3 <= 1523.89 )
								if( ema12 <= 9.44504 )
									ret := -0.333333
								if( ema12 > 9.44504 )
									ret := -0.605263
							if( ema3 > 1523.89 )
								if( bearPower <= -4.41434 )
									ret := -0.652174
								if( bearPower > -4.41434 )
									ret := 0.017284
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_MELI_15Min_e7f3f139(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)

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


