//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: SuperTrend
// ID_model: TWLO_15Min_1SUP_8e3c584c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TWLO_15Min_1SUP_8e3c584c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TWLO_15Min_8e3c584c(dn1, atr, dn, up1, up, sellSignalInt, atr2, buySignalInt, trend)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( sellSignalInt <= 0.5 )
		if( up <= 22.7873 )
			if( dn <= 28.6004 )
				if( up1 <= 22.5153 )
					if( atr2 <= 0.797171 )
						if( atr <= 0.205813 )
							ret := 1.000000 // buy
						if( atr > 0.205813 )
							if( atr2 <= 0.258675 )
								if( atr2 <= 0.231577 )
									ret := 1.000000 // buy
								if( atr2 > 0.231577 )
									ret := 0.250000
							if( atr2 > 0.258675 )
								if( dn1 <= 25.8869 )
									ret := 1.000000 // buy
								if( dn1 > 25.8869 )
									ret := 0.750000 // buy
					if( atr2 > 0.797171 )
						if( dn1 <= 28.6004 )
							if( atr <= 1.02882 )
								ret := 0.800000 // buy
							if( atr > 1.02882 )
								ret := 0.200000
						if( dn1 > 28.6004 )
							ret := 1.000000 // buy
				if( up1 > 22.5153 )
					if( atr <= 0.150987 )
						if( atr2 <= 0.129931 )
							ret := 0.750000 // buy
						if( atr2 > 0.129931 )
							ret := 1.000000 // buy
					if( atr > 0.150987 )
						if( up <= 22.7861 )
							if( atr <= 0.304131 )
								if( atr <= 0.251268 )
									ret := 0.391304
								if( atr > 0.251268 )
									ret := -0.400000
							if( atr > 0.304131 )
								ret := 0.833333 // buy
						if( up > 22.7861 )
							ret := 1.000000 // buy
			if( dn > 28.6004 )
				if( dn <= 31.4461 )
					ret := -0.750000 // sell
				if( dn > 31.4461 )
					ret := -0.500000
		if( up > 22.7873 )
			if( dn1 <= 394.416 )
				if( up <= 105.49 )
					if( atr <= 0.339095 )
						if( dn1 <= 76.052 )
							if( atr <= 0.112379 )
								if( dn <= 71.3999 )
									ret := 0.121288
								if( dn > 71.3999 )
									ret := -0.909091 // sell
							if( atr > 0.112379 )
								if( atr2 <= 0.167806 )
									ret := -0.000153
								if( atr2 > 0.167806 )
									ret := 0.051257
						if( dn1 > 76.052 )
							if( up <= 95.9845 )
								if( atr <= 0.155706 )
									ret := 0.309859
								if( atr > 0.155706 )
									ret := -0.192308
							if( up > 95.9845 )
								if( dn <= 97.6961 )
									ret := 0.800000 // buy
								if( dn > 97.6961 )
									ret := 0.031792
					if( atr > 0.339095 )
						if( up <= 77.2107 )
							if( up1 <= 69.4368 )
								if( dn <= 75.0963 )
									ret := 0.083944
								if( dn > 75.0963 )
									ret := 0.532967
							if( up1 > 69.4368 )
								if( atr <= 0.586164 )
									ret := 0.024431
								if( atr > 0.586164 )
									ret := -0.126949
						if( up > 77.2107 )
							if( dn <= 85.6076 )
								if( dn <= 85.2026 )
									ret := 0.269663
								if( dn > 85.2026 )
									ret := 0.622318
							if( dn > 85.6076 )
								if( dn <= 111.727 )
									ret := 0.080773
								if( dn > 111.727 )
									ret := 0.363636
				if( up > 105.49 )
					if( dn1 <= 109.828 )
						if( atr2 <= 0.267323 )
							if( up1 <= 105.987 )
								if( dn <= 107.38 )
									ret := 0.250000
								if( dn > 107.38 )
									ret := 0.909091 // buy
							if( up1 > 105.987 )
								if( up <= 107.386 )
									ret := 0.111111
								if( up > 107.386 )
									ret := 0.571429
						if( atr2 > 0.267323 )
							if( atr2 <= 0.658503 )
								if( atr2 <= 0.460338 )
									ret := -0.497076
								if( atr2 > 0.460338 )
									ret := -0.068966
							if( atr2 > 0.658503 )
								if( dn1 <= 109.753 )
									ret := -1.000000 // sell
								if( dn1 > 109.753 )
									ret := -0.250000
					if( dn1 > 109.828 )
						if( atr2 <= 5.15528 )
							if( up <= 114.733 )
								if( up <= 110.312 )
									ret := 0.064282
								if( up > 110.312 )
									ret := -0.159922
							if( up > 114.733 )
								if( dn <= 124.465 )
									ret := 0.265173
								if( dn > 124.465 )
									ret := 0.030539
						if( atr2 > 5.15528 )
							if( up <= 280.419 )
								if( atr <= 4.06741 )
									ret := 0.153846
								if( atr > 4.06741 )
									ret := -0.612613
							if( up > 280.419 )
								if( dn1 <= 356.088 )
									ret := 0.480769
								if( dn1 > 356.088 )
									ret := -0.445378
			if( dn1 > 394.416 )
				if( atr <= 4.20423 )
					if( atr <= 1.51612 )
						if( dn1 <= 411.695 )
							if( dn <= 396.109 )
								if( up <= 387.626 )
									ret := -0.100000
								if( up > 387.626 )
									ret := 0.698113
							if( dn > 396.109 )
								if( dn1 <= 401.526 )
									ret := -0.028986
								if( dn1 > 401.526 )
									ret := 0.347826
						if( dn1 > 411.695 )
							if( up1 <= 430.871 )
								if( atr <= 1.21654 )
									ret := -0.666667
								if( atr > 1.21654 )
									ret := -0.103448
							if( up1 > 430.871 )
								if( up <= 431.997 )
									ret := 1.000000 // buy
								if( up > 431.997 )
									ret := 0.000000
					if( atr > 1.51612 )
						if( up <= 429.017 )
							if( atr2 <= 1.39096 )
								if( dn1 <= 401.474 )
									ret := 0.000000
								if( dn1 > 401.474 )
									ret := -0.833333 // sell
							if( atr2 > 1.39096 )
								if( up <= 394.167 )
									ret := -0.250681
								if( up > 394.167 )
									ret := -0.114607
						if( up > 429.017 )
							if( atr2 <= 3.79066 )
								if( dn <= 452.148 )
									ret := -0.846154 // sell
								if( dn > 452.148 )
									ret := -0.545455
							if( atr2 > 3.79066 )
								ret := 0.500000
				if( atr > 4.20423 )
					if( dn1 <= 395.97 )
						if( atr2 <= 5.4683 )
							if( dn <= 394.005 )
								ret := -0.750000 // sell
							if( dn > 394.005 )
								ret := -1.000000 // sell
						if( atr2 > 5.4683 )
							ret := 0.000000
					if( dn1 > 395.97 )
						if( dn <= 458.911 )
							if( up1 <= 414.382 )
								if( up <= 373.144 )
									ret := 0.631579
								if( up > 373.144 )
									ret := 0.208861
							if( up1 > 414.382 )
								if( up <= 416.71 )
									ret := 0.909091 // buy
								if( up > 416.71 )
									ret := 0.481481
						if( dn > 458.911 )
							if( atr <= 7.18791 )
								if( atr <= 5.10046 )
									ret := -1.000000 // sell
								if( atr > 5.10046 )
									ret := -0.538462
							if( atr > 7.18791 )
								if( atr <= 7.30619 )
									ret := 0.750000 // buy
								if( atr > 7.30619 )
									ret := -0.333333
	if( sellSignalInt > 0.5 )
		if( dn <= 85.562 )
			if( dn <= 66.396 )
				if( up <= 63.2264 )
					if( dn <= 46.7189 )
						if( atr <= 0.588445 )
							if( up1 <= 34.0448 )
								if( up1 <= 31.6645 )
									ret := 0.664336
								if( up1 > 31.6645 )
									ret := -0.692308
							if( up1 > 34.0448 )
								if( atr <= 0.31223 )
									ret := 0.760000 // buy
								if( atr > 0.31223 )
									ret := 1.000000 // buy
						if( atr > 0.588445 )
							ret := -1.000000 // sell
					if( dn > 46.7189 )
						if( dn1 <= 47.7574 )
							ret := -1.000000 // sell
						if( dn1 > 47.7574 )
							if( atr <= 0.391312 )
								if( up <= 51.6655 )
									ret := -0.153846
								if( up > 51.6655 )
									ret := 0.606061
							if( atr > 0.391312 )
								if( dn1 <= 59.3348 )
									ret := 0.500000
								if( dn1 > 59.3348 )
									ret := -0.017857
				if( up > 63.2264 )
					if( dn <= 65.0576 )
						if( up1 <= 63.5683 )
							ret := -0.250000
						if( up1 > 63.5683 )
							ret := -1.000000 // sell
					if( dn > 65.0576 )
						if( up <= 64.3823 )
							ret := 1.000000 // buy
						if( up > 64.3823 )
							if( up <= 64.881 )
								ret := -0.833333 // sell
							if( up > 64.881 )
								ret := 0.000000
			if( dn > 66.396 )
				if( atr2 <= 0.78238 )
					if( atr <= 0.283911 )
						if( atr2 <= 0.15602 )
							ret := 0.000000
						if( atr2 > 0.15602 )
							ret := 0.428571
					if( atr > 0.283911 )
						if( dn1 <= 70.069 )
							if( up1 <= 68.0241 )
								ret := 1.000000 // buy
							if( up1 > 68.0241 )
								if( atr <= 0.319374 )
									ret := 0.750000 // buy
								if( atr > 0.319374 )
									ret := 1.000000 // buy
						if( dn1 > 70.069 )
							if( dn <= 72.8927 )
								ret := 0.000000
							if( dn > 72.8927 )
								if( dn1 <= 76.0923 )
									ret := 1.000000 // buy
								if( dn1 > 76.0923 )
									ret := 0.604167
				if( atr2 > 0.78238 )
					ret := 0.000000
		if( dn > 85.562 )
			if( up <= 86.0563 )
				if( atr <= 1.19763 )
					if( atr2 <= 0.517854 )
						ret := -0.250000
					if( atr2 > 0.517854 )
						ret := -1.000000 // sell
				if( atr > 1.19763 )
					ret := 0.250000
			if( up > 86.0563 )
				if( atr <= 0.993958 )
					if( atr2 <= 0.623449 )
						if( up1 <= 141.33 )
							if( dn1 <= 110.47 )
								if( up1 <= 98.0697 )
									ret := 0.324324
								if( up1 > 98.0697 )
									ret := -0.187500
							if( dn1 > 110.47 )
								if( atr <= 0.695361 )
									ret := 0.272727
								if( atr > 0.695361 )
									ret := 0.916667 // buy
						if( up1 > 141.33 )
							if( atr <= 0.676168 )
								if( up1 <= 145.758 )
									ret := 0.000000
								if( up1 > 145.758 )
									ret := 0.000000
							if( atr > 0.676168 )
								if( atr2 <= 0.543005 )
									ret := -0.750000 // sell
								if( atr2 > 0.543005 )
									ret := -0.500000
					if( atr2 > 0.623449 )
						if( atr <= 0.833484 )
							if( atr2 <= 0.654728 )
								ret := -1.000000 // sell
							if( atr2 > 0.654728 )
								ret := -0.250000
						if( atr > 0.833484 )
							if( dn <= 114.788 )
								if( atr <= 0.905754 )
									ret := 1.000000 // buy
								if( atr > 0.905754 )
									ret := -0.200000
							if( dn > 114.788 )
								if( dn <= 174.223 )
									ret := -0.642857
								if( dn > 174.223 )
									ret := 0.250000
				if( atr > 0.993958 )
					if( atr <= 1.54299 )
						if( up <= 147.314 )
							if( dn1 <= 111.544 )
								if( up <= 95.9242 )
									ret := 0.500000
								if( up > 95.9242 )
									ret := 1.000000 // buy
							if( dn1 > 111.544 )
								if( dn1 <= 134.598 )
									ret := 0.200000
								if( dn1 > 134.598 )
									ret := 0.812500 // buy
						if( up > 147.314 )
							if( atr <= 1.33843 )
								if( atr <= 1.18481 )
									ret := 0.090909
								if( atr > 1.18481 )
									ret := -0.500000
							if( atr > 1.33843 )
								if( dn1 <= 215.432 )
									ret := 0.857143 // buy
								if( dn1 > 215.432 )
									ret := 0.263158
					if( atr > 1.54299 )
						if( dn <= 172.725 )
							if( up <= 102.447 )
								ret := -1.000000 // sell
							if( up > 102.447 )
								if( up <= 121.057 )
									ret := 0.000000
								if( up > 121.057 )
									ret := -0.833333 // sell
						if( dn > 172.725 )
							if( dn <= 338.333 )
								if( up1 <= 302.515 )
									ret := 0.093750
								if( up1 > 302.515 )
									ret := 0.764706 // buy
							if( dn > 338.333 )
								if( atr2 <= 2.49302 )
									ret := -0.200000
								if( atr2 > 2.49302 )
									ret := 0.500000
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator SuperTrend 
//@version=5
//indicator title="Supertrend", overlay=true, format=format.price, precision=2, timeframe="")

Periods = input.int(title="ATR Period", defval=10)
src = input.source(hl2, title="Source")
Multiplier = input.float(title="ATR Multiplier", step=0.1, defval=3.0)
changeATR = input.bool(title="Change ATR Calculation Method?", defval=true)
showsignals = input.bool(title="Show Buy/Sell Signals?", defval=true)
highlighting = input.bool(title="Highlighter On/Off?", defval=true)

atr2 = ta.sma(ta.tr, Periods)
atr = changeATR ? ta.atr(Periods) : atr2

up = src - (Multiplier * atr)
up1 = nz(up[1], up)
up := close[1] > up1 ? math.max(up, up1) : up

dn = src + (Multiplier * atr)
dn1 = nz(dn[1], dn)
dn := close[1] < dn1 ? math.min(dn, dn1) : dn

var trend = 1
trend := nz(trend[1], trend)
trend := trend == -1 and close > dn1 ? 1 : trend == 1 and close < up1 ? -1 : trend

upPlot = plot(trend == 1 ? up : na, title="Up Trend", style=plot.style_linebr, linewidth=2, color=color.green)
dnPlot = plot(trend == 1 ? na : dn, title="Down Trend", style=plot.style_linebr, linewidth=2, color=color.red)

buySignal = trend == 1 and trend[1] == -1
sellSignal = trend == -1 and trend[1] == 1

plotshape(buySignal, title="UpTrend Begins", location=location.absolute, style=shape.circle, size=size.tiny, color=color.green, textcolor=color.white)
plotshape(sellSignal, title="DownTrend Begins", location=location.absolute, style=shape.circle, size=size.tiny, color=color.red, textcolor=color.white)

plotshape(showsignals and buySignal, title="Buy", text="Buy", location=location.absolute, style=shape.labelup, size=size.tiny, color=color.green, textcolor=color.white)
plotshape(showsignals and sellSignal, title="Sell", text="Sell", location=location.absolute, style=shape.labeldown, size=size.tiny, color=color.red, textcolor=color.white)

mPlot = plot(ohlc4, title="", style=plot.style_circles, linewidth=1)

longFillColor = highlighting ? (trend == 1 ? color.new(color.green, 80) : color.new(color.white, 100)) : color.new(color.white, 100)
shortFillColor = highlighting ? (trend == -1 ? color.new(color.red, 80) : color.new(color.white, 100)) : color.new(color.white, 100)

fill(mPlot, upPlot, title="UpTrend Highlighter", color=longFillColor)
fill(mPlot, dnPlot, title="DownTrend Highlighter", color=shortFillColor)

alertcondition(buySignal, title="SuperTrend Buy", message="SuperTrend Buy!")
alertcondition(sellSignal, title="SuperTrend Sell", message="SuperTrend Sell!")
changeCond = trend != trend[1]
alertcondition(changeCond, title="SuperTrend Direction Change", message="SuperTrend has changed direction!")

buySignalInt = buySignal ? 1: 0   //Bool to int
sellSignalInt = sellSignal ? 1: 0   //Bool to int

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
float op_operation = decision_tree_0_TWLO_15Min_8e3c584c(dn1, atr, dn, up1, up, sellSignalInt, atr2, buySignalInt, trend)

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


