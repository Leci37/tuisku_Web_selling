//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: SuperTrend
// ID_model: MELI_15Min_1SUP_51349949 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MELI_15Min_1SUP_51349949", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MELI_15Min_51349949(dn1, trend, atr, atr2, buySignalInt, sellSignalInt, up1, up, dn)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( atr <= 10.0609 )
		if( up <= 260.513 )
			if( dn1 <= 282.051 )
				if( dn <= 270.488 )
					if( up1 <= 151.53 )
						if( dn <= 154.435 )
							if( up <= 151.381 )
								if( dn <= 153.722 )
									ret := 0.933333 // buy
								if( dn > 153.722 )
									ret := 0.394737
							if( up > 151.381 )
								ret := 1.000000 // buy
						if( dn > 154.435 )
							if( dn <= 156.841 )
								if( up <= 148.549 )
									ret := 0.200000
								if( up > 148.549 )
									ret := 0.031250
							if( dn > 156.841 )
								ret := -0.538462
					if( up1 > 151.53 )
						if( dn <= 167.035 )
							if( atr <= 0.613441 )
								if( up1 <= 151.974 )
									ret := -0.812500 // sell
								if( up1 > 151.974 )
									ret := 0.185455
							if( atr > 0.613441 )
								if( up <= 160.121 )
									ret := -0.218289
								if( up > 160.121 )
									ret := -0.715789 // sell
						if( dn > 167.035 )
							if( up1 <= 196.063 )
								if( atr <= 1.54848 )
									ret := 0.170468
								if( atr > 1.54848 )
									ret := 0.928571 // buy
							if( up1 > 196.063 )
								if( atr2 <= 2.51325 )
									ret := 0.096029
								if( atr2 > 2.51325 )
									ret := -0.309524
				if( dn > 270.488 )
					if( atr <= 2.70926 )
						if( atr <= 2.59586 )
							if( atr2 <= 2.39811 )
								if( atr2 <= 2.13507 )
									ret := 0.416667
								if( atr2 > 2.13507 )
									ret := 0.000000
							if( atr2 > 2.39811 )
								if( atr2 <= 2.56567 )
									ret := 0.904762 // buy
								if( atr2 > 2.56567 )
									ret := 0.333333
						if( atr > 2.59586 )
							ret := -0.833333 // sell
					if( atr > 2.70926 )
						if( dn <= 280.693 )
							if( dn <= 277.46 )
								if( atr2 <= 3.56528 )
									ret := 0.735294 // buy
								if( atr2 > 3.56528 )
									ret := 0.982456 // buy
							if( dn > 277.46 )
								if( atr2 <= 4.54854 )
									ret := 0.809524 // buy
								if( atr2 > 4.54854 )
									ret := 0.066667
						if( dn > 280.693 )
							ret := -0.882353 // sell
			if( dn1 > 282.051 )
				if( atr2 <= 6.09424 )
					ret := -0.454545
				if( atr2 > 6.09424 )
					if( dn1 <= 291.15 )
						ret := -1.000000 // sell
					if( dn1 > 291.15 )
						ret := -0.600000
		if( up > 260.513 )
			if( dn <= 1554.22 )
				if( trend <= -0.402259 )
					if( up1 <= 297.097 )
						if( atr2 <= 1.71036 )
							ret := 0.280000
						if( atr2 > 1.71036 )
							ret := 0.850000 // buy
					if( up1 > 297.097 )
						if( up1 <= 336.974 )
							if( up <= 330.909 )
								ret := -0.444444
							if( up > 330.909 )
								ret := -1.000000 // sell
						if( up1 > 336.974 )
							if( atr <= 5.85718 )
								if( up <= 340.736 )
									ret := 1.000000 // buy
								if( up > 340.736 )
									ret := -0.375796
							if( atr > 5.85718 )
								if( up1 <= 666.203 )
									ret := 0.606061
								if( up1 > 666.203 )
									ret := 0.036765
				if( trend > -0.402259 )
					if( atr <= 2.50739 )
						if( up <= 668.113 )
							if( dn1 <= 676.245 )
								if( atr <= 2.06659 )
									ret := 0.015263
								if( atr > 2.06659 )
									ret := -0.088788
							if( dn1 > 676.245 )
								if( dn <= 676.126 )
									ret := -0.937500 // sell
								if( dn > 676.126 )
									ret := -0.531250
						if( up > 668.113 )
							if( dn <= 1230.42 )
								if( dn1 <= 714.617 )
									ret := 0.258621
								if( dn1 > 714.617 )
									ret := 0.639053
							if( dn > 1230.42 )
								if( dn <= 1301.86 )
									ret := -0.531250
								if( dn > 1301.86 )
									ret := 0.774194 // buy
					if( atr > 2.50739 )
						if( dn <= 1506.43 )
							if( up <= 1188.24 )
								if( up <= 1132.2 )
									ret := 0.023022
								if( up > 1132.2 )
									ret := 0.155615
							if( up > 1188.24 )
								if( up <= 1211.4 )
									ret := -0.166473
								if( up > 1211.4 )
									ret := -0.001781
						if( dn > 1506.43 )
							if( dn1 <= 1524.28 )
								if( atr <= 7.48511 )
									ret := 0.530612
								if( atr > 7.48511 )
									ret := 0.020000
							if( dn1 > 1524.28 )
								if( up1 <= 1527.91 )
									ret := 0.092386
								if( up1 > 1527.91 )
									ret := 0.891892 // buy
			if( dn > 1554.22 )
				if( atr <= 3.11271 )
					if( up <= 1580.1 )
						if( up1 <= 1569.62 )
							if( up1 <= 1565.48 )
								if( up1 <= 1560.6 )
									ret := 0.062500
								if( up1 > 1560.6 )
									ret := 0.666667
							if( up1 > 1565.48 )
								ret := 0.000000
						if( up1 > 1569.62 )
							if( dn1 <= 1590.56 )
								if( up1 <= 1570.12 )
									ret := 0.833333 // buy
								if( up1 > 1570.12 )
									ret := 1.000000 // buy
							if( dn1 > 1590.56 )
								ret := 0.454545
					if( up > 1580.1 )
						if( up <= 1610.73 )
							if( dn1 <= 1609.89 )
								if( dn <= 1599.97 )
									ret := 0.000000
								if( dn > 1599.97 )
									ret := 0.181818
							if( dn1 > 1609.89 )
								ret := -0.875000 // sell
						if( up > 1610.73 )
							if( up1 <= 1650.15 )
								if( dn1 <= 1668.02 )
									ret := 0.588235
								if( dn1 > 1668.02 )
									ret := 1.000000 // buy
							if( up1 > 1650.15 )
								ret := 0.235294
				if( atr > 3.11271 )
					if( up <= 1552.13 )
						if( up1 <= 1525.01 )
							if( dn1 <= 1573.27 )
								if( up <= 1516.6 )
									ret := -0.393162
								if( up > 1516.6 )
									ret := 0.000000
							if( dn1 > 1573.27 )
								if( atr2 <= 9.26835 )
									ret := 0.562500
								if( atr2 > 9.26835 )
									ret := -0.111111
						if( up1 > 1525.01 )
							if( up1 <= 1527.46 )
								if( dn1 <= 1566.66 )
									ret := -0.500000
								if( dn1 > 1566.66 )
									ret := -0.726027 // sell
							if( up1 > 1527.46 )
								if( atr2 <= 6.52442 )
									ret := -0.041899
								if( atr2 > 6.52442 )
									ret := -0.310345
					if( up > 1552.13 )
						if( dn <= 2030.1 )
							if( dn1 <= 1978.06 )
								if( dn <= 1970.98 )
									ret := -0.036143
								if( dn > 1970.98 )
									ret := -0.676923
							if( dn1 > 1978.06 )
								if( atr <= 6.12455 )
									ret := 0.450000
								if( atr > 6.12455 )
									ret := 0.138756
						if( dn > 2030.1 )
							if( dn <= 2081.94 )
								if( dn1 <= 2079.51 )
									ret := -0.201521
								if( dn1 > 2079.51 )
									ret := -0.897436 // sell
							if( dn > 2081.94 )
								if( atr2 <= 7.14962 )
									ret := -0.189189
								if( atr2 > 7.14962 )
									ret := 0.163043
	if( atr > 10.0609 )
		if( atr <= 15.046 )
			if( dn <= 1401.82 )
				if( dn1 <= 1308.33 )
					if( up <= 1156.92 )
						if( up <= 1143.33 )
							if( up1 <= 748.562 )
								if( dn <= 802.106 )
									ret := -0.070938
								if( dn > 802.106 )
									ret := 0.957746 // buy
							if( up1 > 748.562 )
								if( dn <= 857.368 )
									ret := -0.444149
								if( dn > 857.368 )
									ret := -0.101054
						if( up > 1143.33 )
							if( dn1 <= 1215.01 )
								if( dn <= 1204.68 )
									ret := -0.241379
								if( dn > 1204.68 )
									ret := -0.850746 // sell
							if( dn1 > 1215.01 )
								if( up1 <= 1153.67 )
									ret := -0.545455
								if( up1 > 1153.67 )
									ret := 0.148148
					if( up > 1156.92 )
						if( dn <= 1230.25 )
							if( up <= 1169.75 )
								if( up1 <= 1163.03 )
									ret := 0.492063
								if( up1 > 1163.03 )
									ret := 0.818182 // buy
							if( up > 1169.75 )
								if( up <= 1173.35 )
									ret := -0.625000
								if( up > 1173.35 )
									ret := 0.500000
						if( dn > 1230.25 )
							if( up <= 1238.64 )
								if( atr2 <= 10.7888 )
									ret := 0.244604
								if( atr2 > 10.7888 )
									ret := -0.153605
							if( up > 1238.64 )
								if( up <= 1247.92 )
									ret := 0.813953 // buy
								if( up > 1247.92 )
									ret := -0.333333
				if( dn1 > 1308.33 )
					if( buySignalInt <= 0.5 )
						if( up <= 1249.79 )
							if( up <= 1244.23 )
								if( atr2 <= 13.742 )
									ret := -0.941176 // sell
								if( atr2 > 13.742 )
									ret := -0.523810
							if( up > 1244.23 )
								ret := -0.944444 // sell
						if( up > 1249.79 )
							if( up <= 1262.73 )
								if( atr2 <= 15.6811 )
									ret := -0.258621
								if( atr2 > 15.6811 )
									ret := 1.000000 // buy
							if( up > 1262.73 )
								if( atr <= 10.99 )
									ret := -0.184397
								if( atr > 10.99 )
									ret := -0.604863
					if( buySignalInt > 0.5 )
						ret := 0.300000
			if( dn > 1401.82 )
				if( dn1 <= 1505.21 )
					if( atr2 <= 10.2186 )
						if( atr <= 11.8963 )
							if( atr <= 10.2031 )
								ret := -0.066667
							if( atr > 10.2031 )
								if( atr2 <= 9.80616 )
									ret := 0.488889
								if( atr2 > 9.80616 )
									ret := 1.000000 // buy
						if( atr > 11.8963 )
							ret := -0.272727
					if( atr2 > 10.2186 )
						if( dn <= 1492.43 )
							if( dn <= 1482.62 )
								if( dn1 <= 1424.26 )
									ret := 0.733333 // buy
								if( dn1 > 1424.26 )
									ret := 0.055794
							if( dn > 1482.62 )
								if( atr <= 12.1705 )
									ret := -0.363636
								if( atr > 12.1705 )
									ret := -0.648649
						if( dn > 1492.43 )
							if( up <= 1439.61 )
								if( up1 <= 1428.67 )
									ret := 0.647059
								if( up1 > 1428.67 )
									ret := 1.000000 // buy
							if( up > 1439.61 )
								ret := -0.300000
				if( dn1 > 1505.21 )
					if( up1 <= 1430.53 )
						ret := -1.000000 // sell
					if( up1 > 1430.53 )
						if( dn <= 1574.77 )
							if( dn <= 1564.17 )
								if( dn1 <= 1566.23 )
									ret := -0.031008
								if( dn1 > 1566.23 )
									ret := -0.809524 // sell
							if( dn > 1564.17 )
								if( atr2 <= 13.1865 )
									ret := 0.623932
								if( atr2 > 13.1865 )
									ret := -0.416667
						if( dn > 1574.77 )
							if( atr2 <= 12.22 )
								if( dn1 <= 1585.49 )
									ret := -0.761905 // sell
								if( dn1 > 1585.49 )
									ret := -0.153794
							if( atr2 > 12.22 )
								if( up1 <= 1544.93 )
									ret := -0.378788
								if( up1 > 1544.93 )
									ret := 0.106944
		if( atr > 15.046 )
			if( dn1 <= 1984.27 )
				if( dn <= 1735.58 )
					if( dn1 <= 972.317 )
						if( dn1 <= 819.234 )
							if( up1 <= 516.07 )
								ret := -0.733333 // sell
							if( up1 > 516.07 )
								if( up <= 622.214 )
									ret := 0.714286 // buy
								if( up > 622.214 )
									ret := -0.227273
						if( dn1 > 819.234 )
							if( up <= 758.98 )
								if( up1 <= 729.35 )
									ret := 0.909091 // buy
								if( up1 > 729.35 )
									ret := 1.000000 // buy
							if( up > 758.98 )
								if( up <= 774.876 )
									ret := -0.285714
								if( up > 774.876 )
									ret := 0.738095 // buy
					if( dn1 > 972.317 )
						if( atr <= 15.8843 )
							if( up1 <= 1587.11 )
								if( atr <= 15.8485 )
									ret := 0.194805
								if( atr > 15.8485 )
									ret := 0.909091 // buy
							if( up1 > 1587.11 )
								if( dn <= 1720.92 )
									ret := -0.766667 // sell
								if( dn > 1720.92 )
									ret := 0.500000
						if( atr > 15.8843 )
							if( up <= 909.799 )
								if( atr <= 16.8453 )
									ret := 0.500000
								if( atr > 16.8453 )
									ret := -0.562874
							if( up > 909.799 )
								if( up <= 941.172 )
									ret := 0.433735
								if( up > 941.172 )
									ret := -0.144096
				if( dn > 1735.58 )
					if( atr <= 15.9369 )
						if( up1 <= 1757.06 )
							if( up <= 1706.63 )
								ret := 0.400000
							if( up > 1706.63 )
								if( up <= 1723.31 )
									ret := -1.000000 // sell
								if( up > 1723.31 )
									ret := -0.600000
						if( up1 > 1757.06 )
							if( up <= 1822.21 )
								if( dn1 <= 1885.4 )
									ret := 0.277778
								if( dn1 > 1885.4 )
									ret := 0.714286 // buy
							if( up > 1822.21 )
								if( up1 <= 1833.18 )
									ret := -0.652174
								if( up1 > 1833.18 )
									ret := -0.066667
					if( atr > 15.9369 )
						if( up1 <= 1535.75 )
							ret := -1.000000 // sell
						if( up1 > 1535.75 )
							if( trend <= 0.882611 )
								if( trend <= -0.950259 )
									ret := 0.400000
								if( trend > -0.950259 )
									ret := 1.000000 // buy
							if( trend > 0.882611 )
								if( up1 <= 1686.82 )
									ret := 0.478764
								if( up1 > 1686.82 )
									ret := 0.183036
			if( dn1 > 1984.27 )
				if( up <= 1921.24 )
					if( dn <= 2014.89 )
						if( atr2 <= 18.2925 )
							if( atr <= 17.0442 )
								ret := 0.090909
							if( atr > 17.0442 )
								ret := -0.647059
						if( atr2 > 18.2925 )
							if( up <= 1879.98 )
								ret := -0.733333 // sell
							if( up > 1879.98 )
								if( atr <= 19.2794 )
									ret := -0.714286 // sell
								if( atr > 19.2794 )
									ret := -1.000000 // sell
					if( dn > 2014.89 )
						ret := 0.642857
				if( up > 1921.24 )
					if( up1 <= 2034.61 )
						ret := -1.000000 // sell
					if( up1 > 2034.61 )
						ret := -0.818182 // sell
	
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
float op_operation = decision_tree_0_MELI_15Min_51349949(dn1, trend, atr, atr2, buySignalInt, sellSignalInt, up1, up, dn)

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


