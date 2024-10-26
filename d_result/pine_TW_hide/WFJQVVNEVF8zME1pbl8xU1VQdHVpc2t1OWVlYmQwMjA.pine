//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: SuperTrend
// ID_model: XRPUSDT_30Min_1SUP_9eebd020 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XRPUSDT_30Min_1SUP_9eebd020", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XRPUSDT_30Min_9eebd020(atr2, sellSignalInt, dn1, up1, dn, buySignalInt, up, trend, atr)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( up <= 0.592873 )
		if( dn <= 0.612332 )
			if( atr2 <= 0.004556 )
				if( up1 <= 0.381249 )
					if( dn1 <= 0.393375 )
						if( atr <= 0.004045 )
							if( dn1 <= 0.243501 )
								if( dn <= 0.227056 )
									ret := 0.851852 // buy
								if( dn > 0.227056 )
									ret := 0.144411
							if( dn1 > 0.243501 )
								if( atr <= 0.00336 )
									ret := 0.007009
								if( atr > 0.00336 )
									ret := 0.173544
						if( atr > 0.004045 )
							if( up <= 0.302734 )
								ret := 0.173611
							if( up > 0.302734 )
								if( up <= 0.314892 )
									ret := -0.618182
								if( up > 0.314892 )
									ret := -0.137631
					if( dn1 > 0.393375 )
						if( dn <= 0.393653 )
							if( up <= 0.36817 )
								ret := 1.000000 // buy
							if( up > 0.36817 )
								if( up1 <= 0.372065 )
									ret := -0.277778
								if( up1 > 0.372065 )
									ret := 0.584158
						if( dn > 0.393653 )
							if( up <= 0.374296 )
								ret := -0.285714
							if( up > 0.374296 )
								if( up1 <= 0.377208 )
									ret := 0.458128
								if( up1 > 0.377208 )
									ret := 0.109034
				if( up1 > 0.381249 )
					if( up1 <= 0.404299 )
						if( dn <= 0.424263 )
							if( up1 <= 0.399083 )
								if( dn1 <= 0.413898 )
									ret := -0.091530
								if( dn1 > 0.413898 )
									ret := 0.225564
							if( up1 > 0.399083 )
								if( dn <= 0.411186 )
									ret := 0.200000
								if( dn > 0.411186 )
									ret := -0.379227
						if( dn > 0.424263 )
							if( dn <= 0.428371 )
								if( dn <= 0.425079 )
									ret := -0.750000 // sell
								if( dn > 0.425079 )
									ret := -0.968750 // sell
							if( dn > 0.428371 )
								ret := -0.333333
					if( up1 > 0.404299 )
						if( atr <= 0.004189 )
							if( atr <= 0.004078 )
								if( dn <= 0.430059 )
									ret := 0.184982
								if( dn > 0.430059 )
									ret := -0.015002
							if( atr > 0.004078 )
								if( up1 <= 0.429843 )
									ret := 0.650000
								if( up1 > 0.429843 )
									ret := 0.055944
						if( atr > 0.004189 )
							if( up1 <= 0.406249 )
								ret := 1.000000 // buy
							if( up1 > 0.406249 )
								if( atr <= 0.004237 )
									ret := -0.351695
								if( atr > 0.004237 )
									ret := -0.038987
			if( atr2 > 0.004556 )
				if( up <= 0.315201 )
					if( dn <= 0.336906 )
						if( atr <= 0.004181 )
							if( up <= 0.224443 )
								if( dn <= 0.234689 )
									ret := 0.833333 // buy
								if( dn > 0.234689 )
									ret := 0.600000
							if( up > 0.224443 )
								if( dn1 <= 0.299975 )
									ret := -0.250000
								if( dn1 > 0.299975 )
									ret := 0.625000
						if( atr > 0.004181 )
							if( up1 <= 0.297505 )
								if( atr2 <= 0.006523 )
									ret := -0.152096
								if( atr2 > 0.006523 )
									ret := 0.115052
							if( up1 > 0.297505 )
								if( atr <= 0.00511 )
									ret := 0.309524
								if( atr > 0.00511 )
									ret := 0.822785 // buy
					if( dn > 0.336906 )
						if( atr <= 0.00965 )
							if( up <= 0.297362 )
								if( up <= 0.294829 )
									ret := -0.962963 // sell
								if( up > 0.294829 )
									ret := -0.777778 // sell
							if( up > 0.297362 )
								if( up1 <= 0.311052 )
									ret := -0.165468
								if( up1 > 0.311052 )
									ret := -0.750000 // sell
						if( atr > 0.00965 )
							if( atr <= 0.015149 )
								if( atr2 <= 0.012373 )
									ret := 0.020690
								if( atr2 > 0.012373 )
									ret := 0.812500 // buy
							if( atr > 0.015149 )
								if( atr2 <= 0.020854 )
									ret := -0.697674
								if( atr2 > 0.020854 )
									ret := 0.017647
				if( up > 0.315201 )
					if( dn1 <= 0.540395 )
						if( atr <= 0.02027 )
							if( atr <= 0.015315 )
								if( atr2 <= 0.012987 )
									ret := 0.137995
								if( atr2 > 0.012987 )
									ret := -0.288889
							if( atr > 0.015315 )
								if( atr2 <= 0.021149 )
									ret := -0.131498
								if( atr2 > 0.021149 )
									ret := -0.944444 // sell
						if( atr > 0.02027 )
							if( atr <= 0.02982 )
								if( up1 <= 0.376533 )
									ret := 0.492063
								if( up1 > 0.376533 )
									ret := 0.928571 // buy
							if( atr > 0.02982 )
								ret := -0.473684
					if( dn1 > 0.540395 )
						if( atr <= 0.00591 )
							if( up1 <= 0.564319 )
								if( up <= 0.549017 )
									ret := 0.172193
								if( up > 0.549017 )
									ret := -0.093361
							if( up1 > 0.564319 )
								if( up1 <= 0.566221 )
									ret := 0.614286
								if( up1 > 0.566221 )
									ret := 0.196864
						if( atr > 0.00591 )
							if( atr <= 0.006271 )
								if( atr2 <= 0.005438 )
									ret := 0.396552
								if( atr2 > 0.005438 )
									ret := -0.363196
							if( atr > 0.006271 )
								if( up1 <= 0.376547 )
									ret := -0.705882 // sell
								if( up1 > 0.376547 )
									ret := -0.014535
		if( dn > 0.612332 )
			if( atr2 <= 0.00926 )
				if( up <= 0.582939 )
					if( atr2 <= 0.007264 )
						if( up1 <= 0.58185 )
							if( dn1 <= 0.616562 )
								if( dn <= 0.614511 )
									ret := 0.378947
								if( dn > 0.614511 )
									ret := 0.853659 // buy
							if( dn1 > 0.616562 )
								if( atr2 <= 0.005901 )
									ret := -1.000000 // sell
								if( atr2 > 0.005901 )
									ret := -0.063830
						if( up1 > 0.58185 )
							if( up1 <= 0.582503 )
								ret := 0.944444 // buy
							if( up1 > 0.582503 )
								ret := 0.583333
					if( atr2 > 0.007264 )
						if( dn1 <= 0.633121 )
							if( atr2 <= 0.008192 )
								if( atr <= 0.007507 )
									ret := 0.534884
								if( atr > 0.007507 )
									ret := 0.922156 // buy
							if( atr2 > 0.008192 )
								if( dn <= 0.62787 )
									ret := 0.433333
								if( dn > 0.62787 )
									ret := 1.000000 // buy
						if( dn1 > 0.633121 )
							if( dn1 <= 0.636476 )
								if( up1 <= 0.579211 )
									ret := -0.666667
								if( up1 > 0.579211 )
									ret := 0.800000 // buy
							if( dn1 > 0.636476 )
								ret := -0.562500
				if( up > 0.582939 )
					if( dn1 <= 0.627389 )
						if( dn1 <= 0.616282 )
							if( atr <= 0.00396 )
								if( up1 <= 0.58975 )
									ret := 0.956522 // buy
								if( up1 > 0.58975 )
									ret := 0.428571
							if( atr > 0.00396 )
								if( atr2 <= 0.004555 )
									ret := -0.220779
								if( atr2 > 0.004555 )
									ret := 0.481928
						if( dn1 > 0.616282 )
							if( up <= 0.58788 )
								if( up <= 0.587399 )
									ret := -0.252381
								if( up > 0.587399 )
									ret := -0.722222 // sell
							if( up > 0.58788 )
								if( atr2 <= 0.004933 )
									ret := -0.460674
								if( atr2 > 0.004933 )
									ret := 0.149254
					if( dn1 > 0.627389 )
						if( atr <= 0.008497 )
							if( up <= 0.586599 )
								if( up <= 0.583537 )
									ret := 0.277778
								if( up > 0.583537 )
									ret := 0.754098 // buy
							if( up > 0.586599 )
								if( atr <= 0.006517 )
									ret := 0.627119
								if( atr > 0.006517 )
									ret := 0.240223
						if( atr > 0.008497 )
							if( up1 <= 0.58659 )
								ret := -0.444444
							if( up1 > 0.58659 )
								if( dn <= 0.637061 )
									ret := 0.818182 // buy
								if( dn > 0.637061 )
									ret := -0.181818
			if( atr2 > 0.00926 )
				if( atr2 <= 0.065255 )
					if( up <= 0.586958 )
						if( up <= 0.578744 )
							if( atr2 <= 0.034924 )
								if( dn <= 0.662334 )
									ret := 0.048501
								if( dn > 0.662334 )
									ret := -0.251534
							if( atr2 > 0.034924 )
								if( atr <= 0.040408 )
									ret := 0.672414
								if( atr > 0.040408 )
									ret := 0.032258
						if( up > 0.578744 )
							if( dn <= 0.65276 )
								if( atr2 <= 0.009337 )
									ret := -0.727273 // sell
								if( atr2 > 0.009337 )
									ret := 0.671429
							if( dn > 0.65276 )
								if( atr <= 0.0143 )
									ret := -0.315789
								if( atr > 0.0143 )
									ret := 0.311475
					if( up > 0.586958 )
						if( dn1 <= 0.646221 )
							if( dn <= 0.636502 )
								ret := -0.200000
							if( dn > 0.636502 )
								ret := 0.727273 // buy
						if( dn1 > 0.646221 )
							if( up <= 0.592122 )
								if( dn1 <= 0.656749 )
									ret := -0.781609 // sell
								if( dn1 > 0.656749 )
									ret := -0.264151
							if( up > 0.592122 )
								if( dn1 <= 0.659834 )
									ret := -0.181818
								if( dn1 > 0.659834 )
									ret := 0.357143
				if( atr2 > 0.065255 )
					ret := -1.000000 // sell
	if( up > 0.592873 )
		if( up <= 1.5445 )
			if( dn1 <= 1.03301 )
				if( up <= 0.963631 )
					if( atr2 <= 0.019583 )
						if( up1 <= 0.58966 )
							if( dn1 <= 0.66963 )
								if( dn <= 0.63488 )
									ret := -0.750000 // sell
								if( dn > 0.63488 )
									ret := -0.957447 // sell
							if( dn1 > 0.66963 )
								ret := -0.294118
						if( up1 > 0.58966 )
							if( up <= 0.750259 )
								if( atr2 <= 0.00425 )
									ret := -0.115266
								if( atr2 > 0.00425 )
									ret := -0.005527
							if( up > 0.750259 )
								if( dn1 <= 0.804488 )
									ret := -0.257485
								if( dn1 > 0.804488 )
									ret := -0.099478
					if( atr2 > 0.019583 )
						if( atr2 <= 0.022693 )
							if( dn1 <= 0.843201 )
								if( dn1 <= 0.751367 )
									ret := 0.407407
								if( dn1 > 0.751367 )
									ret := -0.666667
							if( dn1 > 0.843201 )
								if( dn <= 1.02279 )
									ret := 0.389078
								if( dn > 1.02279 )
									ret := 1.000000 // buy
						if( atr2 > 0.022693 )
							if( atr <= 0.022199 )
								if( up1 <= 0.879907 )
									ret := -0.857143 // sell
								if( up1 > 0.879907 )
									ret := -0.200000
							if( atr > 0.022199 )
								if( dn1 <= 0.845152 )
									ret := -0.214286
								if( dn1 > 0.845152 )
									ret := 0.292683
				if( up > 0.963631 )
					if( atr2 <= 0.0089 )
						if( atr2 <= 0.007756 )
							if( atr <= 0.007537 )
								if( up1 <= 0.96429 )
									ret := -0.166667
								if( up1 > 0.96429 )
									ret := -0.768116 // sell
							if( atr > 0.007537 )
								if( up <= 0.969031 )
									ret := -1.000000 // sell
								if( up > 0.969031 )
									ret := -0.900000 // sell
						if( atr2 > 0.007756 )
							if( atr2 <= 0.0081 )
								ret := 0.687500
							if( atr2 > 0.0081 )
								if( up1 <= 0.969885 )
									ret := -0.125000
								if( up1 > 0.969885 )
									ret := -0.555556
					if( atr2 > 0.0089 )
						if( up <= 0.973869 )
							if( up <= 0.96837 )
								if( up <= 0.964282 )
									ret := -0.692308
								if( up > 0.964282 )
									ret := -0.894737 // sell
							if( up > 0.96837 )
								ret := -0.444444
						if( up > 0.973869 )
							if( up <= 0.975617 )
								ret := -1.000000 // sell
							if( up > 0.975617 )
								ret := -0.894737 // sell
			if( dn1 > 1.03301 )
				if( dn <= 1.91566 )
					if( atr2 <= 0.104837 )
						if( dn1 <= 1.52654 )
							if( up <= 1.35631 )
								if( atr2 <= 0.030659 )
									ret := 0.012507
								if( atr2 > 0.030659 )
									ret := 0.197080
							if( up > 1.35631 )
								if( up1 <= 1.37395 )
									ret := 0.566667
								if( up1 > 1.37395 )
									ret := 0.977778 // buy
						if( dn1 > 1.52654 )
							if( atr <= 0.016248 )
								if( up <= 1.54092 )
									ret := 0.777778 // buy
								if( up > 1.54092 )
									ret := 0.375000
							if( atr > 0.016248 )
								if( atr <= 0.025436 )
									ret := -0.388393
								if( atr > 0.025436 )
									ret := -0.080851
					if( atr2 > 0.104837 )
						if( up <= 0.638649 )
							ret := 1.000000 // buy
						if( up > 0.638649 )
							ret := 0.933333 // buy
				if( dn > 1.91566 )
					ret := 1.000000 // buy
		if( up > 1.5445 )
			if( dn <= 1.73217 )
				if( dn <= 1.63359 )
					if( up1 <= 1.5453 )
						ret := -0.909091 // sell
					if( up1 > 1.5453 )
						ret := -1.000000 // sell
				if( dn > 1.63359 )
					if( atr2 <= 0.019726 )
						if( up1 <= 1.55448 )
							ret := -0.416667
						if( up1 > 1.55448 )
							ret := -0.636364
					if( atr2 > 0.019726 )
						if( atr2 <= 0.025057 )
							ret := -1.000000 // sell
						if( atr2 > 0.025057 )
							ret := -0.500000
			if( dn > 1.73217 )
				if( dn1 <= 1.97653 )
					if( dn <= 1.91003 )
						if( atr <= 0.032051 )
							if( atr2 <= 0.032333 )
								ret := 0.875000 // buy
							if( atr2 > 0.032333 )
								ret := 0.533333
						if( atr > 0.032051 )
							if( atr <= 0.045876 )
								if( up1 <= 1.58404 )
									ret := -0.793478 // sell
								if( up1 > 1.58404 )
									ret := -0.349057
							if( atr > 0.045876 )
								if( atr2 <= 0.050673 )
									ret := 0.666667
								if( atr2 > 0.050673 )
									ret := 0.900000 // buy
					if( dn > 1.91003 )
						if( dn <= 1.95523 )
							if( up1 <= 1.60374 )
								if( up <= 1.55403 )
									ret := 0.428571
								if( up > 1.55403 )
									ret := 0.885714 // buy
							if( up1 > 1.60374 )
								if( dn1 <= 1.95657 )
									ret := 0.150000
								if( dn1 > 1.95657 )
									ret := 1.000000 // buy
						if( dn > 1.95523 )
							ret := -0.777778 // sell
				if( dn1 > 1.97653 )
					if( up1 <= 1.66221 )
						ret := -1.000000 // sell
					if( up1 > 1.66221 )
						if( atr <= 0.057483 )
							ret := -1.000000 // sell
						if( atr > 0.057483 )
							ret := 0.416667
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_XRPUSDT_30Min_9eebd020(atr2, sellSignalInt, dn1, up1, dn, buySignalInt, up, trend, atr)

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


