//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: SuperTrend
// ID_model: UBER_1Min_1SUP_9e00c748 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UBER_1Min_1SUP_9e00c748", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UBER_1Min_9e00c748(dn1, atr, dn, up1, up, sellSignalInt, atr2, buySignalInt, trend)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( atr2 <= 0.105549 )
		if( dn <= 79.6795 )
			if( sellSignalInt <= 0.5 )
				if( up1 <= 72.505 )
					if( dn <= 72.3507 )
						if( up <= 72.0829 )
							if( buySignalInt <= 0.5 )
								if( atr <= 0.084447 )
									ret := 0.001438
								if( atr > 0.084447 )
									ret := 0.064367
							if( buySignalInt > 0.5 )
								if( up <= 71.6958 )
									ret := 0.345550
								if( up > 71.6958 )
									ret := -0.923077 // sell
						if( up > 72.0829 )
							if( atr2 <= 0.032745 )
								ret := -1.000000 // sell
							if( atr2 > 0.032745 )
								if( dn <= 72.3397 )
									ret := -0.750000 // sell
								if( dn > 72.3397 )
									ret := -0.500000
					if( dn > 72.3507 )
						if( atr2 <= 0.037631 )
							if( atr <= 0.021391 )
								if( up1 <= 72.4452 )
									ret := -0.666667
								if( up1 > 72.4452 )
									ret := -0.076923
							if( atr > 0.021391 )
								if( dn1 <= 72.4975 )
									ret := 0.750000 // buy
								if( dn1 > 72.4975 )
									ret := 0.363057
						if( atr2 > 0.037631 )
							if( atr2 <= 0.088547 )
								if( dn <= 72.4312 )
									ret := 0.349432
								if( dn > 72.4312 )
									ret := 0.114349
							if( atr2 > 0.088547 )
								if( dn1 <= 73.0611 )
									ret := -0.007143
								if( dn1 > 73.0611 )
									ret := 0.875000 // buy
				if( up1 > 72.505 )
					if( dn1 <= 73.0336 )
						if( up <= 72.5625 )
							if( up <= 72.5245 )
								if( up <= 72.5203 )
									ret := -0.266667
								if( up > 72.5203 )
									ret := -0.133333
							if( up > 72.5245 )
								if( up1 <= 72.5473 )
									ret := -0.617021
								if( up1 > 72.5473 )
									ret := -0.343750
						if( up > 72.5625 )
							if( atr <= 0.066422 )
								if( up <= 72.5744 )
									ret := 0.394366
								if( up > 72.5744 )
									ret := -0.119266
							if( atr > 0.066422 )
								if( dn <= 72.9333 )
									ret := -0.062500
								if( dn > 72.9333 )
									ret := -0.603448
					if( dn1 > 73.0336 )
						if( up1 <= 77.5364 )
							if( dn1 <= 77.539 )
								if( atr <= 0.01963 )
									ret := 0.444444
								if( atr > 0.01963 )
									ret := -0.036277
							if( dn1 > 77.539 )
								if( up1 <= 77.3984 )
									ret := 0.415385
								if( up1 > 77.3984 )
									ret := -0.008403
						if( up1 > 77.5364 )
							if( atr <= 0.052809 )
								if( up1 <= 77.7621 )
									ret := -0.190217
								if( up1 > 77.7621 )
									ret := 0.261146
							if( atr > 0.052809 )
								if( atr <= 0.059539 )
									ret := -0.607407
								if( atr > 0.059539 )
									ret := -0.278912
			if( sellSignalInt > 0.5 )
				if( up1 <= 71.3766 )
					if( dn1 <= 70.2291 )
						if( up1 <= 63.4722 )
							if( dn <= 59.0222 )
								ret := 1.000000 // buy
							if( dn > 59.0222 )
								if( up1 <= 62.1497 )
									ret := 0.888889 // buy
								if( up1 > 62.1497 )
									ret := 0.947368 // buy
						if( up1 > 63.4722 )
							if( dn1 <= 67.7192 )
								if( up <= 66.4202 )
									ret := 0.549708
								if( up > 66.4202 )
									ret := -0.487805
							if( dn1 > 67.7192 )
								if( up1 <= 67.576 )
									ret := 0.962963 // buy
								if( up1 > 67.576 )
									ret := 0.527397
					if( dn1 > 70.2291 )
						if( dn <= 71.3562 )
							if( dn <= 71.0353 )
								if( atr2 <= 0.060229 )
									ret := 0.750000 // buy
								if( atr2 > 0.060229 )
									ret := 0.979592 // buy
							if( dn > 71.0353 )
								if( atr <= 0.085557 )
									ret := 0.769231 // buy
								if( atr > 0.085557 )
									ret := 0.166667
						if( dn > 71.3562 )
							ret := 1.000000 // buy
				if( up1 > 71.3766 )
					if( up1 <= 71.6638 )
						if( up1 <= 71.6054 )
							ret := -0.529412
						if( up1 > 71.6054 )
							ret := -0.818182 // sell
					if( up1 > 71.6638 )
						if( atr2 <= 0.043021 )
							if( up <= 72.5808 )
								ret := 0.117647
							if( up > 72.5808 )
								if( atr <= 0.05468 )
									ret := -0.600000
								if( atr > 0.05468 )
									ret := -0.200000
						if( atr2 > 0.043021 )
							if( dn1 <= 72.4121 )
								ret := 1.000000 // buy
							if( dn1 > 72.4121 )
								if( dn1 <= 73.1529 )
									ret := -0.147541
								if( dn1 > 73.1529 )
									ret := 0.690909
		if( dn > 79.6795 )
			if( atr2 <= 0.082085 )
				if( atr <= 0.08839 )
					if( up <= 84.8413 )
						if( up1 <= 81.3424 )
							ret := -0.500000
						if( up1 > 81.3424 )
							if( up1 <= 81.566 )
								if( atr2 <= 0.060354 )
									ret := 0.363636
								if( atr2 > 0.060354 )
									ret := 0.920000 // buy
							if( up1 > 81.566 )
								if( up1 <= 81.9733 )
									ret := -0.454545
								if( up1 > 81.9733 )
									ret := 0.234483
					if( up > 84.8413 )
						if( up <= 85.1157 )
							if( atr <= 0.056035 )
								if( up <= 84.9372 )
									ret := 0.052632
								if( up > 84.9372 )
									ret := -0.137931
							if( atr > 0.056035 )
								if( dn <= 85.219 )
									ret := -0.941176 // sell
								if( dn > 85.219 )
									ret := -0.307692
						if( up > 85.1157 )
							if( dn <= 85.7986 )
								if( up <= 85.3935 )
									ret := 0.022472
								if( up > 85.3935 )
									ret := 0.823529 // buy
							if( dn > 85.7986 )
								if( up1 <= 85.8477 )
									ret := -0.536585
								if( up1 > 85.8477 )
									ret := 0.100000
				if( atr > 0.08839 )
					if( atr2 <= 0.074003 )
						ret := -0.687500
					if( atr2 > 0.074003 )
						ret := 0.000000
			if( atr2 > 0.082085 )
				if( atr2 <= 0.08866 )
					if( atr <= 0.092581 )
						if( dn <= 86.0694 )
							ret := 1.000000 // buy
						if( dn > 86.0694 )
							ret := 0.916667 // buy
					if( atr > 0.092581 )
						ret := 0.285714
				if( atr2 > 0.08866 )
					if( atr <= 0.117781 )
						if( up1 <= 81.1354 )
							ret := 1.000000 // buy
						if( up1 > 81.1354 )
							if( up <= 81.4725 )
								ret := -0.176471
							if( up > 81.4725 )
								if( atr <= 0.08888 )
									ret := -0.088235
								if( atr > 0.08888 )
									ret := 0.553191
					if( atr > 0.117781 )
						if( dn <= 82.4307 )
							ret := -1.000000 // sell
						if( dn > 82.4307 )
							ret := 0.000000
	if( atr2 > 0.105549 )
		if( dn1 <= 65.5079 )
			if( atr2 <= 0.20796 )
				if( atr2 <= 0.132577 )
					if( up1 <= 64.0713 )
						if( atr <= 0.145286 )
							if( atr <= 0.096595 )
								if( dn1 <= 60.2695 )
									ret := 0.722222 // buy
								if( dn1 > 60.2695 )
									ret := 0.029851
							if( atr > 0.096595 )
								if( up <= 63.8761 )
									ret := 0.009574
								if( up > 63.8761 )
									ret := -0.401198
						if( atr > 0.145286 )
							if( up1 <= 58.259 )
								ret := -0.461538
							if( up1 > 58.259 )
								if( dn <= 61.733 )
									ret := 0.181818
								if( dn > 61.733 )
									ret := 0.800000 // buy
					if( up1 > 64.0713 )
						if( atr <= 0.136911 )
							if( atr <= 0.107323 )
								if( dn1 <= 65.0418 )
									ret := -0.785714 // sell
								if( dn1 > 65.0418 )
									ret := 0.100000
							if( atr > 0.107323 )
								if( up1 <= 64.5357 )
									ret := 0.625483
								if( up1 > 64.5357 )
									ret := 0.150000
						if( atr > 0.136911 )
							if( atr <= 0.151852 )
								if( atr2 <= 0.127784 )
									ret := -0.055556
								if( atr2 > 0.127784 )
									ret := -0.692308
							if( atr > 0.151852 )
								ret := -0.769231 // sell
				if( atr2 > 0.132577 )
					if( dn1 <= 65.343 )
						if( dn1 <= 65.2995 )
							if( up <= 64.2094 )
								if( trend <= -0.956204 )
									ret := 0.666667
								if( trend > -0.956204 )
									ret := -0.129288
							if( up > 64.2094 )
								if( atr2 <= 0.164931 )
									ret := 0.094118
								if( atr2 > 0.164931 )
									ret := 0.857143 // buy
						if( dn1 > 65.2995 )
							ret := -0.742857 // sell
					if( dn1 > 65.343 )
						ret := 0.214286
			if( atr2 > 0.20796 )
				if( dn1 <= 57.6789 )
					if( up <= 54.62 )
						if( atr2 <= 0.419814 )
							if( dn1 <= 55.8413 )
								if( dn1 <= 54.997 )
									ret := 0.833333 // buy
								if( dn1 > 54.997 )
									ret := 1.000000 // buy
							if( dn1 > 55.8413 )
								if( up <= 54.5654 )
									ret := 0.000000
								if( up > 54.5654 )
									ret := 0.714286 // buy
						if( atr2 > 0.419814 )
							ret := 1.000000 // buy
					if( up > 54.62 )
						if( up <= 55.2661 )
							if( dn1 <= 56.7846 )
								ret := -1.000000 // sell
							if( dn1 > 56.7846 )
								ret := 0.095238
						if( up > 55.2661 )
							if( atr <= 0.312788 )
								if( up <= 56.2897 )
									ret := 0.800000 // buy
								if( up > 56.2897 )
									ret := -0.375000
							if( atr > 0.312788 )
								if( up1 <= 55.3183 )
									ret := 0.904762 // buy
								if( up1 > 55.3183 )
									ret := 0.777778 // buy
				if( dn1 > 57.6789 )
					if( dn1 <= 62.5698 )
						if( dn1 <= 59.9038 )
							if( dn1 <= 57.7842 )
								ret := -0.411765
							if( dn1 > 57.7842 )
								if( up1 <= 57.9062 )
									ret := 0.642202
								if( up1 > 57.9062 )
									ret := -0.921569 // sell
						if( dn1 > 59.9038 )
							if( dn1 <= 60.7431 )
								if( atr2 <= 0.35843 )
									ret := -1.000000 // sell
								if( atr2 > 0.35843 )
									ret := -0.727273 // sell
							if( dn1 > 60.7431 )
								if( up1 <= 59.5249 )
									ret := 0.466667
								if( up1 > 59.5249 )
									ret := -0.711111 // sell
					if( dn1 > 62.5698 )
						if( dn <= 63.2429 )
							if( atr <= 0.25998 )
								if( atr2 <= 0.238885 )
									ret := -0.562500
								if( atr2 > 0.238885 )
									ret := -0.100000
							if( atr > 0.25998 )
								if( atr2 <= 0.466148 )
									ret := 0.755814 // buy
								if( atr2 > 0.466148 )
									ret := 0.948276 // buy
						if( dn > 63.2429 )
							if( up1 <= 61.3051 )
								if( dn1 <= 64.1194 )
									ret := -0.946667 // sell
								if( dn1 > 64.1194 )
									ret := -0.421053
							if( up1 > 61.3051 )
								if( dn1 <= 65.2958 )
									ret := 0.326180
								if( dn1 > 65.2958 )
									ret := -0.214286
		if( dn1 > 65.5079 )
			if( dn <= 76.8012 )
				if( trend <= 0.0666 )
					if( up1 <= 66.1315 )
						ret := 1.000000 // buy
					if( up1 > 66.1315 )
						if( dn <= 69.7366 )
							if( atr <= 0.156165 )
								ret := 0.700000 // buy
							if( atr > 0.156165 )
								ret := -0.421053
						if( dn > 69.7366 )
							if( atr <= 0.285401 )
								if( atr <= 0.155618 )
									ret := 0.476190
								if( atr > 0.155618 )
									ret := 0.895349 // buy
							if( atr > 0.285401 )
								ret := -0.200000
				if( trend > 0.0666 )
					if( atr2 <= 1.45285 )
						if( dn1 <= 65.5831 )
							if( up <= 65.014 )
								if( up <= 64.4076 )
									ret := -0.270833
								if( up > 64.4076 )
									ret := -0.761589 // sell
							if( up > 65.014 )
								ret := 0.500000
						if( dn1 > 65.5831 )
							if( up1 <= 63.2555 )
								if( dn1 <= 68.8108 )
									ret := 0.979167 // buy
								if( dn1 > 68.8108 )
									ret := 0.272727
							if( up1 > 63.2555 )
								if( buySignalInt <= 0.5 )
									ret := -0.098908
								if( buySignalInt > 0.5 )
									ret := -0.159341
					if( atr2 > 1.45285 )
						if( dn1 <= 69.9539 )
							ret := -0.692308
						if( dn1 > 69.9539 )
							ret := -1.000000 // sell
			if( dn > 76.8012 )
				if( dn <= 85.4336 )
					if( atr2 <= 0.174799 )
						if( up1 <= 76.4161 )
							if( dn <= 76.8828 )
								ret := 1.000000 // buy
							if( dn > 76.8828 )
								if( dn <= 77.3333 )
									ret := -0.812500 // sell
								if( dn > 77.3333 )
									ret := -0.333333
						if( up1 > 76.4161 )
							if( atr2 <= 0.127999 )
								if( up <= 76.7169 )
									ret := 0.700000 // buy
								if( up > 76.7169 )
									ret := 0.008108
							if( atr2 > 0.127999 )
								if( atr <= 0.178712 )
									ret := 0.607676
								if( atr > 0.178712 )
									ret := -0.416667
					if( atr2 > 0.174799 )
						if( atr <= 0.269679 )
							if( up <= 76.1116 )
								if( dn <= 77.0656 )
									ret := 0.750000 // buy
								if( dn > 77.0656 )
									ret := 0.931034 // buy
							if( up > 76.1116 )
								if( atr <= 0.182112 )
									ret := 0.333333
								if( atr > 0.182112 )
									ret := -0.510135
						if( atr > 0.269679 )
							if( up <= 79.9942 )
								if( dn <= 77.7412 )
									ret := 0.777778 // buy
								if( dn > 77.7412 )
									ret := -0.947368 // sell
							if( up > 79.9942 )
								if( up1 <= 83.526 )
									ret := 0.831683 // buy
								if( up1 > 83.526 )
									ret := 0.200000
				if( dn > 85.4336 )
					if( atr <= 0.125315 )
						if( dn <= 85.7224 )
							if( up1 <= 84.9659 )
								ret := -0.714286 // sell
							if( up1 > 84.9659 )
								ret := -0.571429
						if( dn > 85.7224 )
							if( dn <= 86.3013 )
								if( atr2 <= 0.115501 )
									ret := 0.500000
								if( atr2 > 0.115501 )
									ret := -0.391304
							if( dn > 86.3013 )
								if( atr2 <= 0.110181 )
									ret := 1.000000 // buy
								if( atr2 > 0.110181 )
									ret := 0.500000
					if( atr > 0.125315 )
						if( up <= 83.9533 )
							ret := 0.705882 // buy
						if( up > 83.9533 )
							if( up1 <= 86.1939 )
								if( dn1 <= 85.8214 )
									ret := -0.697917
								if( dn1 > 85.8214 )
									ret := -0.450980
							if( up1 > 86.1939 )
								ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_UBER_1Min_9e00c748(dn1, atr, dn, up1, up, sellSignalInt, atr2, buySignalInt, trend)

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


