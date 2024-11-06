//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: SuperTrend
// ID_model: TSLA_5Min_1SUP_46460111 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TSLA_5Min_1SUP_46460111", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TSLA_5Min_46460111(dn1, atr, dn, up1, up, sellSignalInt, atr2, buySignalInt, trend)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( atr2 <= 0.725536 )
		if( up <= 234.403 )
			if( dn1 <= 168.632 )
				if( up1 <= 141.237 )
					if( dn <= 143.045 )
						if( atr <= 0.580316 )
							if( atr <= 0.323408 )
								if( up1 <= 141.132 )
									ret := 0.111111
								if( up1 > 141.132 )
									ret := 0.769231 // buy
							if( atr > 0.323408 )
								if( atr2 <= 0.40495 )
									ret := 0.777778 // buy
								if( atr2 > 0.40495 )
									ret := 0.951220 // buy
						if( atr > 0.580316 )
							ret := -0.142857
					if( dn > 143.045 )
						if( up1 <= 141.014 )
							if( dn <= 143.148 )
								ret := -0.400000
							if( dn > 143.148 )
								if( atr <= 0.50582 )
									ret := 0.588235
								if( atr > 0.50582 )
									ret := -0.062500
						if( up1 > 141.014 )
							ret := -0.785714 // sell
				if( up1 > 141.237 )
					if( up <= 150.466 )
						if( up1 <= 149.385 )
							if( dn1 <= 153.152 )
								if( atr2 <= 0.412114 )
									ret := -0.433022
								if( atr2 > 0.412114 )
									ret := 0.109626
							if( dn1 > 153.152 )
								ret := -1.000000 // sell
						if( up1 > 149.385 )
							if( atr <= 0.388432 )
								ret := -0.900000 // sell
							if( atr > 0.388432 )
								ret := -1.000000 // sell
					if( up > 150.466 )
						if( dn1 <= 153.735 )
							if( dn <= 153.609 )
								if( dn1 <= 153.583 )
									ret := 0.909091 // buy
								if( dn1 > 153.583 )
									ret := 1.000000 // buy
							if( dn > 153.609 )
								ret := 0.777778 // buy
						if( dn1 > 153.735 )
							if( atr2 <= 0.705688 )
								if( up <= 157.668 )
									ret := -0.169014
								if( up > 157.668 )
									ret := -0.023993
							if( atr2 > 0.705688 )
								if( up <= 158.917 )
									ret := 0.920000 // buy
								if( up > 158.917 )
									ret := 0.192982
			if( dn1 > 168.632 )
				if( up <= 166.581 )
					if( atr2 <= 0.498325 )
						if( atr <= 0.396284 )
							ret := 0.928571 // buy
						if( atr > 0.396284 )
							if( up <= 166.474 )
								if( up1 <= 166.076 )
									ret := 0.866667 // buy
								if( up1 > 166.076 )
									ret := 0.423077
							if( up > 166.474 )
								if( up1 <= 166.459 )
									ret := 1.000000 // buy
								if( up1 > 166.459 )
									ret := 0.846154 // buy
					if( atr2 > 0.498325 )
						if( up1 <= 166.066 )
							if( up1 <= 165.713 )
								if( up1 <= 165.272 )
									ret := 0.457143
								if( up1 > 165.272 )
									ret := -0.096154
							if( up1 > 165.713 )
								if( up1 <= 165.909 )
									ret := 0.939394 // buy
								if( up1 > 165.909 )
									ret := 0.684211
						if( up1 > 166.066 )
							if( dn1 <= 170.2 )
								if( dn <= 169.828 )
									ret := -0.162791
								if( dn > 169.828 )
									ret := -0.933333 // sell
							if( dn1 > 170.2 )
								if( up1 <= 166.367 )
									ret := 0.678571
								if( up1 > 166.367 )
									ret := 0.000000
				if( up > 166.581 )
					if( dn1 <= 172.03 )
						if( atr <= 0.402299 )
							if( up <= 170.321 )
								if( up1 <= 170.284 )
									ret := 0.062117
								if( up1 > 170.284 )
									ret := 1.000000 // buy
							if( up > 170.321 )
								if( atr2 <= 0.105735 )
									ret := -0.263636
								if( atr2 > 0.105735 )
									ret := -0.078431
						if( atr > 0.402299 )
							if( dn <= 171.143 )
								if( up1 <= 167.336 )
									ret := -0.331126
								if( up1 > 167.336 )
									ret := 0.055300
							if( dn > 171.143 )
								if( up <= 168.987 )
									ret := -0.891667 // sell
								if( up > 168.987 )
									ret := 0.380952
					if( dn1 > 172.03 )
						if( dn <= 172.479 )
							if( atr <= 0.518555 )
								if( up <= 170.055 )
									ret := 0.719512 // buy
								if( up > 170.055 )
									ret := 0.322368
							if( atr > 0.518555 )
								if( up <= 167.959 )
									ret := 0.894737 // buy
								if( up > 167.959 )
									ret := -0.296296
						if( dn > 172.479 )
							if( dn1 <= 237.186 )
								if( dn1 <= 236.944 )
									ret := 0.058749
								if( dn1 > 236.944 )
									ret := -0.565217
							if( dn1 > 237.186 )
								if( dn <= 237.751 )
									ret := 0.753425 // buy
								if( dn > 237.751 )
									ret := 0.180000
		if( up > 234.403 )
			if( up1 <= 247.184 )
				if( atr <= 0.633288 )
					if( dn <= 235.479 )
						if( atr <= 0.105265 )
							ret := -0.956522 // sell
						if( atr > 0.105265 )
							ret := -0.615385
					if( dn > 235.479 )
						if( atr2 <= 0.638915 )
							if( up1 <= 246.604 )
								if( dn <= 248.517 )
									ret := -0.046256
								if( dn > 248.517 )
									ret := 0.298611
							if( up1 > 246.604 )
								if( atr2 <= 0.3375 )
									ret := 0.135135
								if( atr2 > 0.3375 )
									ret := -0.472603
						if( atr2 > 0.638915 )
							if( dn <= 238.516 )
								if( dn1 <= 238.091 )
									ret := 0.111111
								if( dn1 > 238.091 )
									ret := -1.000000 // sell
							if( dn > 238.516 )
								if( dn <= 248.708 )
									ret := -0.247423
								if( dn > 248.708 )
									ret := 0.176471
				if( atr > 0.633288 )
					if( up1 <= 242.949 )
						if( up1 <= 236.323 )
							if( dn <= 238.319 )
								ret := -0.150000
							if( dn > 238.319 )
								if( atr <= 0.65275 )
									ret := -0.055556
								if( atr > 0.65275 )
									ret := 0.312500
						if( up1 > 236.323 )
							if( up <= 238.508 )
								if( atr <= 0.657566 )
									ret := -0.208333
								if( atr > 0.657566 )
									ret := -0.715000 // sell
							if( up > 238.508 )
								if( atr2 <= 0.684509 )
									ret := -0.397590
								if( atr2 > 0.684509 )
									ret := -0.032258
					if( up1 > 242.949 )
						if( dn1 <= 247.628 )
							if( dn <= 246.568 )
								ret := 0.000000
							if( dn > 246.568 )
								if( dn1 <= 247.185 )
									ret := 0.829787 // buy
								if( dn1 > 247.185 )
									ret := 0.510638
						if( dn1 > 247.628 )
							if( up1 <= 246.404 )
								if( up <= 246.464 )
									ret := -0.299712
								if( up > 246.464 )
									ret := 0.764706 // buy
							if( up1 > 246.404 )
								if( up <= 247.09 )
									ret := 0.610169
								if( up > 247.09 )
									ret := -0.314815
			if( up1 > 247.184 )
				if( dn <= 250.331 )
					if( up1 <= 248.537 )
						if( up1 <= 248.231 )
							if( dn1 <= 249.63 )
								if( dn1 <= 249.239 )
									ret := 0.162437
								if( dn1 > 249.239 )
									ret := -0.452830
							if( dn1 > 249.63 )
								if( dn1 <= 250.377 )
									ret := 0.643478
								if( dn1 > 250.377 )
									ret := -0.454545
						if( up1 > 248.231 )
							if( atr <= 0.223442 )
								if( dn <= 248.946 )
									ret := -0.357143
								if( dn > 248.946 )
									ret := 0.000000
							if( atr > 0.223442 )
								if( atr <= 0.250864 )
									ret := -1.000000 // sell
								if( atr > 0.250864 )
									ret := 0.181818
					if( up1 > 248.537 )
						if( atr <= 0.149578 )
							if( atr <= 0.081718 )
								if( up <= 248.996 )
									ret := 0.500000
								if( up > 248.996 )
									ret := 0.000000
							if( atr > 0.081718 )
								if( dn1 <= 249.437 )
									ret := 0.888889 // buy
								if( dn1 > 249.437 )
									ret := 0.521739
						if( atr > 0.149578 )
							if( up1 <= 249.195 )
								if( up <= 248.873 )
									ret := -0.041667
								if( up > 248.873 )
									ret := 0.117647
							if( up1 > 249.195 )
								ret := 0.571429
				if( dn > 250.331 )
					if( atr <= 0.236933 )
						if( dn1 <= 250.625 )
							if( atr2 <= 0.126835 )
								if( atr <= 0.13261 )
									ret := -0.538462
								if( atr > 0.13261 )
									ret := -1.000000 // sell
							if( atr2 > 0.126835 )
								ret := 0.000000
						if( dn1 > 250.625 )
							if( atr <= 0.116521 )
								if( up <= 255.23 )
									ret := -0.325581
								if( up > 255.23 )
									ret := -0.009877
							if( atr > 0.116521 )
								if( up <= 260.798 )
									ret := 0.032236
								if( up > 260.798 )
									ret := 0.174840
					if( atr > 0.236933 )
						if( dn1 <= 286.392 )
							if( dn <= 278.143 )
								if( atr <= 0.367289 )
									ret := -0.111868
								if( atr > 0.367289 )
									ret := 0.015899
							if( dn > 278.143 )
								if( up <= 274.48 )
									ret := -0.928571 // sell
								if( up > 274.48 )
									ret := -0.305509
						if( dn1 > 286.392 )
							if( dn <= 287.004 )
								ret := 0.846154 // buy
							if( dn > 287.004 )
								if( atr2 <= 0.278088 )
									ret := -0.538462
								if( atr2 > 0.278088 )
									ret := 0.263941
	if( atr2 > 0.725536 )
		if( up <= 158.298 )
			if( atr2 <= 1.0454 )
				if( dn1 <= 147.34 )
					if( atr2 <= 0.754639 )
						ret := 0.400000
					if( atr2 > 0.754639 )
						if( dn <= 144.313 )
							ret := 0.700000 // buy
						if( dn > 144.313 )
							ret := 1.000000 // buy
				if( dn1 > 147.34 )
					if( atr <= 1.00179 )
						if( dn1 <= 152.431 )
							ret := -0.722222 // sell
						if( dn1 > 152.431 )
							if( dn <= 157.967 )
								if( atr2 <= 0.768371 )
									ret := 0.250000
								if( atr2 > 0.768371 )
									ret := 0.800000 // buy
							if( dn > 157.967 )
								if( up1 <= 156.744 )
									ret := -0.459459
								if( up1 > 156.744 )
									ret := 0.222222
					if( atr > 1.00179 )
						if( up <= 155.988 )
							if( atr <= 1.11552 )
								if( dn <= 160.546 )
									ret := 0.846154 // buy
								if( dn > 160.546 )
									ret := 1.000000 // buy
							if( atr > 1.11552 )
								ret := 0.000000
						if( up > 155.988 )
							ret := -0.100000
			if( atr2 > 1.0454 )
				if( up1 <= 140.195 )
					if( dn1 <= 146.259 )
						ret := 0.666667
					if( dn1 > 146.259 )
						if( atr <= 1.27146 )
							ret := -0.818182 // sell
						if( atr > 1.27146 )
							ret := -1.000000 // sell
				if( up1 > 140.195 )
					if( atr <= 0.945429 )
						ret := -0.230769
					if( atr > 0.945429 )
						if( dn1 <= 166.511 )
							if( up <= 156.325 )
								if( up <= 153.806 )
									ret := 0.793103 // buy
								if( up > 153.806 )
									ret := 0.981132 // buy
							if( up > 156.325 )
								if( dn1 <= 163.541 )
									ret := 0.875000 // buy
								if( dn1 > 163.541 )
									ret := 0.391304
						if( dn1 > 166.511 )
							if( dn1 <= 167.505 )
								if( atr <= 2.05559 )
									ret := -0.750000 // sell
								if( atr > 2.05559 )
									ret := -1.000000 // sell
							if( dn1 > 167.505 )
								if( atr <= 2.08512 )
									ret := 1.000000 // buy
								if( atr > 2.08512 )
									ret := -0.250000
		if( up > 158.298 )
			if( buySignalInt <= 0.5 )
				if( up <= 253.877 )
					if( sellSignalInt <= 0.5 )
						if( atr2 <= 0.725732 )
							ret := -0.842105 // sell
						if( atr2 > 0.725732 )
							if( dn <= 261.535 )
								if( up1 <= 223.796 )
									ret := -0.061634
								if( up1 > 223.796 )
									ret := 0.012075
							if( dn > 261.535 )
								if( up <= 250.223 )
									ret := 0.076923
								if( up > 250.223 )
									ret := 0.740196 // buy
					if( sellSignalInt > 0.5 )
						if( atr2 <= 1.00548 )
							if( dn <= 234.658 )
								ret := -0.428571
							if( dn > 234.658 )
								ret := -0.600000
						if( atr2 > 1.00548 )
							ret := 0.250000
				if( up > 253.877 )
					if( dn1 <= 262.536 )
						if( dn <= 261.747 )
							if( up1 <= 255.381 )
								if( up <= 254.588 )
									ret := -0.196078
								if( up > 254.588 )
									ret := -0.479532
							if( up1 > 255.381 )
								if( atr2 <= 0.977123 )
									ret := 0.056338
								if( atr2 > 0.977123 )
									ret := -0.659091
						if( dn > 261.747 )
							if( atr <= 1.25694 )
								if( atr <= 1.00861 )
									ret := -0.770642 // sell
								if( atr > 1.00861 )
									ret := 0.162791
							if( atr > 1.25694 )
								if( atr2 <= 1.46092 )
									ret := -0.888889 // sell
								if( atr2 > 1.46092 )
									ret := -1.000000 // sell
					if( dn1 > 262.536 )
						if( dn <= 268.312 )
							if( dn1 <= 267.346 )
								if( atr <= 0.76873 )
									ret := -0.517986
								if( atr > 0.76873 )
									ret := -0.006777
							if( dn1 > 267.346 )
								if( up1 <= 260.982 )
									ret := -0.010870
								if( up1 > 260.982 )
									ret := 0.285714
						if( dn > 268.312 )
							if( atr2 <= 1.5922 )
								if( up1 <= 293.601 )
									ret := -0.095573
								if( up1 > 293.601 )
									ret := -0.673913
							if( atr2 > 1.5922 )
								if( dn1 <= 279.369 )
									ret := -0.361290
								if( dn1 > 279.369 )
									ret := -0.827338 // sell
			if( buySignalInt > 0.5 )
				if( up <= 243.161 )
					if( atr <= 1.69624 )
						if( dn1 <= 186.507 )
							ret := 0.866667 // buy
						if( dn1 > 186.507 )
							if( atr <= 1.21635 )
								ret := -0.100000
							if( atr > 1.21635 )
								ret := 0.703704 // buy
					if( atr > 1.69624 )
						ret := 0.000000
				if( up > 243.161 )
					if( up <= 251.916 )
						ret := -0.875000 // sell
					if( up > 251.916 )
						ret := -0.363636
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_TSLA_5Min_46460111(dn1, atr, dn, up1, up, sellSignalInt, atr2, buySignalInt, trend)

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


