//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: SuperTrend
// ID_model: SNAP_1Min_1SUP_eb23cc5d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNAP_1Min_1SUP_eb23cc5d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNAP_1Min_eb23cc5d(dn, atr, buySignalInt, up1, dn1, up, trend, atr2, sellSignalInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( trend <= 0 )
		if( atr2 <= 0.027273 )
			if( atr2 <= 0.010578 )
				if( up1 <= 9.45241 )
					if( atr <= 0.004422 )
						if( dn <= 9.06259 )
							if( atr <= 0.003691 )
								ret := -0.500000
							if( atr > 0.003691 )
								ret := 0.166667
						if( dn > 9.06259 )
							ret := 0.333333
					if( atr > 0.004422 )
						if( atr <= 0.012387 )
							if( atr2 <= 0.008688 )
								if( dn1 <= 8.87532 )
									ret := 0.766667 // buy
								if( dn1 > 8.87532 )
									ret := 0.444444
							if( atr2 > 0.008688 )
								if( dn1 <= 8.83557 )
									ret := -0.200000
								if( dn1 > 8.83557 )
									ret := 0.750000 // buy
						if( atr > 0.012387 )
							ret := 1.000000 // buy
				if( up1 > 9.45241 )
					if( up <= 10.5644 )
						if( dn <= 10.02 )
							if( dn <= 9.72419 )
								ret := 0.000000
							if( dn > 9.72419 )
								ret := 0.750000 // buy
						if( dn > 10.02 )
							if( up1 <= 10.3544 )
								ret := -1.000000 // sell
							if( up1 > 10.3544 )
								ret := 0.000000
					if( up > 10.5644 )
						if( atr2 <= 0.004995 )
							if( atr <= 0.005656 )
								ret := 0.000000
							if( atr > 0.005656 )
								ret := -0.500000
						if( atr2 > 0.004995 )
							if( up <= 16.32 )
								if( atr <= 0.009625 )
									ret := 0.250000
								if( atr > 0.009625 )
									ret := 0.595745
							if( up > 16.32 )
								ret := -0.142857
			if( atr2 > 0.010578 )
				if( dn1 <= 9.36626 )
					if( up <= 8.94644 )
						if( dn1 <= 8.94242 )
							if( dn <= 8.90354 )
								if( atr <= 0.014192 )
									ret := 0.500000
								if( atr > 0.014192 )
									ret := 1.000000 // buy
							if( dn > 8.90354 )
								ret := 0.250000
						if( dn1 > 8.94242 )
							ret := -0.400000
					if( up > 8.94644 )
						if( up <= 9.19006 )
							if( dn <= 9.10993 )
								ret := 1.000000 // buy
							if( dn > 9.10993 )
								if( atr2 <= 0.015352 )
									ret := 0.400000
								if( atr2 > 0.015352 )
									ret := 1.000000 // buy
						if( up > 9.19006 )
							ret := 1.000000 // buy
				if( dn1 > 9.36626 )
					if( dn1 <= 9.47867 )
						ret := -0.166667
					if( dn1 > 9.47867 )
						if( dn1 <= 16.3145 )
							if( dn1 <= 15.7731 )
								if( atr2 <= 0.019184 )
									ret := 0.539474
								if( atr2 > 0.019184 )
									ret := 0.780220 // buy
							if( dn1 > 15.7731 )
								if( up <= 15.871 )
									ret := -0.200000
								if( up > 15.871 )
									ret := 0.555556
						if( dn1 > 16.3145 )
							if( up1 <= 16.8707 )
								if( atr2 <= 0.013728 )
									ret := 0.769231 // buy
								if( atr2 > 0.013728 )
									ret := 0.965517 // buy
							if( up1 > 16.8707 )
								ret := 0.250000
		if( atr2 > 0.027273 )
			if( dn1 <= 15.8471 )
				if( sellSignalInt <= 0.5 )
					if( up1 <= 15.4086 )
						if( atr2 <= 0.049579 )
							if( up1 <= 14.2509 )
								ret := -1.000000 // sell
							if( up1 > 14.2509 )
								ret := -0.750000 // sell
						if( atr2 > 0.049579 )
							ret := -0.250000
					if( up1 > 15.4086 )
						ret := 1.000000 // buy
				if( sellSignalInt > 0.5 )
					if( atr <= 0.078649 )
						if( atr2 <= 0.02857 )
							ret := -0.166667
						if( atr2 > 0.02857 )
							if( atr <= 0.051097 )
								if( dn1 <= 15.1914 )
									ret := 0.638889
								if( dn1 > 15.1914 )
									ret := 1.000000 // buy
							if( atr > 0.051097 )
								if( atr2 <= 0.052198 )
									ret := 0.090909
								if( atr2 > 0.052198 )
									ret := 1.000000 // buy
					if( atr > 0.078649 )
						if( up <= 13.6889 )
							ret := -1.000000 // sell
						if( up > 13.6889 )
							ret := 0.285714
			if( dn1 > 15.8471 )
				if( up <= 16.2424 )
					if( up <= 15.8783 )
						if( atr2 <= 0.038705 )
							ret := 0.857143 // buy
						if( atr2 > 0.038705 )
							ret := -1.000000 // sell
					if( up > 15.8783 )
						if( atr2 <= 0.034186 )
							if( up1 <= 16.0576 )
								ret := -0.500000
							if( up1 > 16.0576 )
								ret := -1.000000 // sell
						if( atr2 > 0.034186 )
							ret := -1.000000 // sell
				if( up > 16.2424 )
					if( up <= 16.8701 )
						if( atr2 <= 0.031358 )
							ret := 0.200000
						if( atr2 > 0.031358 )
							if( atr2 <= 0.052155 )
								ret := 1.000000 // buy
							if( atr2 > 0.052155 )
								ret := 0.750000 // buy
					if( up > 16.8701 )
						ret := -1.000000 // sell
	if( trend > 0 )
		if( atr2 <= 0.031061 )
			if( atr <= 0.026605 )
				if( up <= 16.7296 )
					if( buySignalInt <= 0.5 )
						if( dn <= 8.30642 )
							if( atr2 <= 0.00797 )
								if( atr <= 0.007857 )
									ret := 0.076923
								if( atr > 0.007857 )
									ret := 0.750000 // buy
							if( atr2 > 0.00797 )
								if( atr <= 0.009657 )
									ret := 0.954545 // buy
								if( atr > 0.009657 )
									ret := 0.333333
						if( dn > 8.30642 )
							if( up <= 8.38326 )
								if( up <= 8.34954 )
									ret := 0.016032
								if( up > 8.34954 )
									ret := -0.457516
							if( up > 8.38326 )
								if( dn1 <= 8.59173 )
									ret := 0.236806
								if( dn1 > 8.59173 )
									ret := 0.043430
					if( buySignalInt > 0.5 )
						if( up <= 15.6463 )
							if( up1 <= 8.91836 )
								if( up <= 8.53153 )
									ret := 0.666667
								if( up > 8.53153 )
									ret := -0.333333
							if( up1 > 8.91836 )
								if( up1 <= 9.39365 )
									ret := 0.674157
								if( up1 > 9.39365 )
									ret := 0.276995
						if( up > 15.6463 )
							if( up1 <= 15.9717 )
								if( atr <= 0.013686 )
									ret := 0.000000
								if( atr > 0.013686 )
									ret := -0.629630
							if( up1 > 15.9717 )
								if( up <= 16.6959 )
									ret := 0.200000
								if( up > 16.6959 )
									ret := -0.500000
				if( up > 16.7296 )
					if( atr <= 0.023755 )
						if( up <= 17.0741 )
							if( dn1 <= 16.9373 )
								if( up1 <= 16.7523 )
									ret := 0.045918
								if( up1 > 16.7523 )
									ret := -0.294393
							if( dn1 > 16.9373 )
								if( atr <= 0.018108 )
									ret := -0.400000
								if( atr > 0.018108 )
									ret := 0.277567
						if( up > 17.0741 )
							if( dn1 <= 17.2366 )
								if( atr2 <= 0.02026 )
									ret := -0.358974
								if( atr2 > 0.02026 )
									ret := -0.750000 // sell
							if( dn1 > 17.2366 )
								if( dn <= 17.2209 )
									ret := 1.000000 // buy
								if( dn > 17.2209 )
									ret := 0.000000
					if( atr > 0.023755 )
						if( dn <= 17.1316 )
							if( atr <= 0.025116 )
								if( up <= 16.7406 )
									ret := -1.000000 // sell
								if( up > 16.7406 )
									ret := -0.573034
							if( atr > 0.025116 )
								if( dn <= 16.8731 )
									ret := 0.833333 // buy
								if( dn > 16.8731 )
									ret := -0.254902
						if( dn > 17.1316 )
							if( up <= 17.0825 )
								if( atr2 <= 0.027477 )
									ret := 0.470588
								if( atr2 > 0.027477 )
									ret := -0.500000
							if( up > 17.0825 )
								if( atr <= 0.026109 )
									ret := -0.225806
								if( atr > 0.026109 )
									ret := -1.000000 // sell
			if( atr > 0.026605 )
				if( dn <= 15.986 )
					if( up <= 9.49897 )
						if( dn <= 8.66875 )
							if( atr <= 0.033349 )
								if( dn1 <= 8.55772 )
									ret := 0.266667
								if( dn1 > 8.55772 )
									ret := 0.736842 // buy
							if( atr > 0.033349 )
								ret := -0.833333 // sell
						if( dn > 8.66875 )
							if( dn1 <= 8.72869 )
								if( dn <= 8.67606 )
									ret := -0.285714
								if( dn > 8.67606 )
									ret := -0.809524 // sell
							if( dn1 > 8.72869 )
								if( dn <= 8.86626 )
									ret := 0.277457
								if( dn > 8.86626 )
									ret := -0.008917
					if( up > 9.49897 )
						if( up <= 10.9567 )
							if( up <= 10.8368 )
								if( up <= 10.7757 )
									ret := 0.337681
								if( up > 10.7757 )
									ret := -0.588235
							if( up > 10.8368 )
								if( dn1 <= 11.1195 )
									ret := 0.826667 // buy
								if( dn1 > 11.1195 )
									ret := 0.000000
						if( up > 10.9567 )
							if( up <= 11.0769 )
								if( dn <= 11.1925 )
									ret := -0.095238
								if( dn > 11.1925 )
									ret := -0.605263
							if( up > 11.0769 )
								if( up <= 11.338 )
									ret := 0.573171
								if( up > 11.338 )
									ret := 0.169682
				if( dn > 15.986 )
					if( dn1 <= 16.1254 )
						if( atr2 <= 0.026457 )
							if( up <= 15.8622 )
								if( dn <= 15.9968 )
									ret := 0.000000
								if( dn > 15.9968 )
									ret := 0.909091 // buy
							if( up > 15.8622 )
								if( up1 <= 15.8879 )
									ret := -0.631579
								if( up1 > 15.8879 )
									ret := 0.031250
						if( atr2 > 0.026457 )
							if( up <= 15.8848 )
								if( up1 <= 15.8546 )
									ret := -0.460000
								if( up1 > 15.8546 )
									ret := -0.791667 // sell
							if( up > 15.8848 )
								if( up <= 15.9637 )
									ret := -0.280000
								if( up > 15.9637 )
									ret := -1.000000 // sell
					if( dn1 > 16.1254 )
						if( up <= 17.1535 )
							if( atr2 <= 0.027869 )
								if( atr <= 0.03479 )
									ret := 0.239933
								if( atr > 0.03479 )
									ret := -0.533333
							if( atr2 > 0.027869 )
								if( up1 <= 16.6709 )
									ret := -0.042357
								if( up1 > 16.6709 )
									ret := 0.205882
						if( up > 17.1535 )
							if( atr <= 0.027577 )
								ret := -0.500000
							if( atr > 0.027577 )
								if( dn1 <= 17.3384 )
									ret := -1.000000 // sell
								if( dn1 > 17.3384 )
									ret := -0.818182 // sell
		if( atr2 > 0.031061 )
			if( dn1 <= 8.71666 )
				if( up <= 8.44075 )
					if( dn <= 8.6842 )
						if( dn <= 8.44838 )
							if( up1 <= 8.23305 )
								ret := 0.000000
							if( up1 > 8.23305 )
								ret := -0.250000
						if( dn > 8.44838 )
							if( up1 <= 8.40554 )
								if( up <= 8.19006 )
									ret := 0.727273 // buy
								if( up > 8.19006 )
									ret := 0.948276 // buy
							if( up1 > 8.40554 )
								if( up1 <= 8.41118 )
									ret := -0.166667
								if( up1 > 8.41118 )
									ret := 0.833333 // buy
					if( dn > 8.6842 )
						ret := -0.400000
				if( up > 8.44075 )
					if( dn1 <= 8.6895 )
						if( dn <= 8.66557 )
							ret := 0.285714
						if( dn > 8.66557 )
							if( up1 <= 8.45104 )
								ret := -1.000000 // sell
							if( up1 > 8.45104 )
								if( atr2 <= 0.036425 )
									ret := -0.600000
								if( atr2 > 0.036425 )
									ret := -0.250000
					if( dn1 > 8.6895 )
						if( dn1 <= 8.70714 )
							ret := 1.000000 // buy
						if( dn1 > 8.70714 )
							ret := 0.750000 // buy
			if( dn1 > 8.71666 )
				if( atr2 <= 0.05602 )
					if( atr <= 0.049966 )
						if( atr <= 0.045358 )
							if( atr <= 0.039942 )
								if( up1 <= 8.58127 )
									ret := -0.534483
								if( up1 > 8.58127 )
									ret := -0.006250
							if( atr > 0.039942 )
								if( up1 <= 14.83 )
									ret := -0.207513
								if( up1 > 14.83 )
									ret := -0.016977
						if( atr > 0.045358 )
							if( up1 <= 16.781 )
								if( dn <= 17.0009 )
									ret := 0.083682
								if( dn > 17.0009 )
									ret := 1.000000 // buy
							if( up1 > 16.781 )
								if( dn <= 17.1459 )
									ret := -0.900000 // sell
								if( dn > 17.1459 )
									ret := 0.000000
					if( atr > 0.049966 )
						if( dn <= 14.9179 )
							if( dn <= 10.7129 )
								if( up <= 8.41526 )
									ret := 1.000000 // buy
								if( up > 8.41526 )
									ret := -0.390244
							if( dn > 10.7129 )
								if( dn1 <= 11.2959 )
									ret := 0.544444
								if( dn1 > 11.2959 )
									ret := 0.094388
						if( dn > 14.9179 )
							if( dn1 <= 15.0042 )
								if( dn1 <= 14.9452 )
									ret := -0.941176 // sell
								if( dn1 > 14.9452 )
									ret := -0.555556
							if( dn1 > 15.0042 )
								if( dn <= 15.1742 )
									ret := 0.565217
								if( dn > 15.1742 )
									ret := -0.232941
				if( atr2 > 0.05602 )
					if( dn <= 15.8228 )
						if( dn1 <= 11.665 )
							if( up1 <= 9.51155 )
								if( dn <= 9.09365 )
									ret := -0.067416
								if( dn > 9.09365 )
									ret := 0.738739 // buy
							if( up1 > 9.51155 )
								if( dn <= 10.0138 )
									ret := -1.000000 // sell
								if( dn > 10.0138 )
									ret := -0.161551
						if( dn1 > 11.665 )
							if( up <= 15.2326 )
								if( atr <= 0.099463 )
									ret := 0.232304
								if( atr > 0.099463 )
									ret := 0.010081
							if( up > 15.2326 )
								if( up <= 15.3949 )
									ret := 0.811765 // buy
								if( up > 15.3949 )
									ret := 0.358209
					if( dn > 15.8228 )
						if( up <= 15.5084 )
							if( atr <= 0.585267 )
								if( atr2 <= 0.116638 )
									ret := -0.490196
								if( atr2 > 0.116638 )
									ret := -1.000000 // sell
							if( atr > 0.585267 )
								ret := 1.000000 // buy
						if( up > 15.5084 )
							if( up <= 15.6284 )
								if( dn1 <= 15.913 )
									ret := -0.157895
								if( dn1 > 15.913 )
									ret := 0.610390
							if( up > 15.6284 )
								if( atr <= 0.080029 )
									ret := -0.136951
								if( atr > 0.080029 )
									ret := 0.170103
	
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
float op_operation = decision_tree_0_SNAP_1Min_eb23cc5d(dn, atr, buySignalInt, up1, dn1, up, trend, atr2, sellSignalInt)

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


