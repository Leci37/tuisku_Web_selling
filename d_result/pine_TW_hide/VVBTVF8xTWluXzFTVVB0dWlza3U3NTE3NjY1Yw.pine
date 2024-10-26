//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: SuperTrend
// ID_model: UPST_1Min_1SUP_7517665c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UPST_1Min_1SUP_7517665c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UPST_1Min_7517665c(dn1, atr, dn, up1, up, sellSignalInt, atr2, buySignalInt, trend)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( sellSignalInt <= 0.5 )
		if( atr2 <= 0.178491 )
			if( dn <= 41.0348 )
				if( up <= 35.6587 )
					if( up1 <= 25.9785 )
						if( atr2 <= 0.069589 )
							if( buySignalInt <= 0.5 )
								if( dn1 <= 26.1798 )
									ret := 0.028442
								if( dn1 > 26.1798 )
									ret := -0.178694
							if( buySignalInt > 0.5 )
								if( up1 <= 24.2864 )
									ret := 0.412791
								if( up1 > 24.2864 )
									ret := -0.037037
						if( atr2 > 0.069589 )
							if( atr <= 0.146221 )
								if( dn <= 23.8365 )
									ret := 0.158629
								if( dn > 23.8365 )
									ret := 0.076495
							if( atr > 0.146221 )
								if( atr2 <= 0.15397 )
									ret := -0.256318
								if( atr2 > 0.15397 )
									ret := 0.087940
					if( up1 > 25.9785 )
						if( dn1 <= 27.7326 )
							if( atr <= 0.079852 )
								if( up <= 27.3002 )
									ret := -0.008857
								if( up > 27.3002 )
									ret := -0.295652
							if( atr > 0.079852 )
								if( up1 <= 26.0534 )
									ret := -0.532110
								if( up1 > 26.0534 )
									ret := -0.173093
						if( dn1 > 27.7326 )
							if( up <= 27.6034 )
								if( atr <= 0.133991 )
									ret := 0.283124
								if( atr > 0.133991 )
									ret := 0.026087
							if( up > 27.6034 )
								if( atr2 <= 0.072961 )
									ret := 0.066724
								if( atr2 > 0.072961 )
									ret := -0.029292
				if( up > 35.6587 )
					if( up1 <= 35.749 )
						if( dn <= 36.0595 )
							if( atr2 <= 0.048556 )
								ret := -0.666667
							if( atr2 > 0.048556 )
								if( up <= 35.7452 )
									ret := -0.076923
								if( up > 35.7452 )
									ret := 0.555556
						if( dn > 36.0595 )
							if( atr2 <= 0.150956 )
								if( atr2 <= 0.06963 )
									ret := 0.309524
								if( atr2 > 0.06963 )
									ret := 0.668919
							if( atr2 > 0.150956 )
								if( dn <= 36.5574 )
									ret := -1.000000 // sell
								if( dn > 36.5574 )
									ret := 0.307692
					if( up1 > 35.749 )
						if( atr <= 0.12929 )
							if( up1 <= 37.8454 )
								if( dn <= 38.1093 )
									ret := 0.034996
								if( dn > 38.1093 )
									ret := -0.197044
							if( up1 > 37.8454 )
								if( up <= 38.1527 )
									ret := 0.241491
								if( up > 38.1527 )
									ret := 0.080542
						if( atr > 0.12929 )
							if( dn <= 37.428 )
								if( up1 <= 36.6627 )
									ret := 0.471774
								if( up1 > 36.6627 )
									ret := -0.615385
							if( dn > 37.428 )
								if( dn <= 40.2492 )
									ret := 0.018868
								if( dn > 40.2492 )
									ret := 0.258845
			if( dn > 41.0348 )
				if( dn <= 41.5465 )
					if( atr <= 0.139417 )
						if( atr2 <= 0.121765 )
							if( up <= 40.4298 )
								if( atr <= 0.123491 )
									ret := 1.000000 // buy
								if( atr > 0.123491 )
									ret := 0.500000
							if( up > 40.4298 )
								if( up1 <= 40.7432 )
									ret := -0.296837
								if( up1 > 40.7432 )
									ret := -0.110000
						if( atr2 > 0.121765 )
							if( dn1 <= 41.3902 )
								if( atr <= 0.126986 )
									ret := 0.703125 // buy
								if( atr > 0.126986 )
									ret := 0.217949
							if( dn1 > 41.3902 )
								if( dn1 <= 41.5726 )
									ret := -0.666667
								if( dn1 > 41.5726 )
									ret := 0.000000
					if( atr > 0.139417 )
						if( atr <= 0.161945 )
							if( dn <= 41.122 )
								if( atr2 <= 0.158416 )
									ret := 0.074074
								if( atr2 > 0.158416 )
									ret := -1.000000 // sell
							if( dn > 41.122 )
								if( atr2 <= 0.139507 )
									ret := -0.411765
								if( atr2 > 0.139507 )
									ret := -0.830986 // sell
						if( atr > 0.161945 )
							if( dn <= 41.2206 )
								if( up <= 40.2852 )
									ret := -0.666667
								if( up > 40.2852 )
									ret := -0.125000
							if( dn > 41.2206 )
								if( atr2 <= 0.171208 )
									ret := 0.400000
								if( atr2 > 0.171208 )
									ret := -0.555556
				if( dn > 41.5465 )
					if( dn1 <= 41.7221 )
						if( up1 <= 40.9682 )
							if( up <= 40.7118 )
								if( up <= 40.6846 )
									ret := 0.222222
								if( up > 40.6846 )
									ret := 1.000000 // buy
							if( up > 40.7118 )
								if( atr <= 0.141448 )
									ret := 0.406250
								if( atr > 0.141448 )
									ret := -0.681818
						if( up1 > 40.9682 )
							if( atr <= 0.076578 )
								if( dn1 <= 41.6832 )
									ret := -0.068966
								if( dn1 > 41.6832 )
									ret := 0.500000
							if( atr > 0.076578 )
								if( up <= 41.0413 )
									ret := 0.950000 // buy
								if( up > 41.0413 )
									ret := 0.590909
					if( dn1 > 41.7221 )
						if( up1 <= 44.0667 )
							if( dn1 <= 44.4204 )
								if( up <= 43.074 )
									ret := 0.013301
								if( up > 43.074 )
									ret := -0.149306
							if( dn1 > 44.4204 )
								if( atr <= 0.125169 )
									ret := -0.237288
								if( atr > 0.125169 )
									ret := -0.678261
						if( up1 > 44.0667 )
							if( up1 <= 54.4069 )
								if( up <= 44.59 )
									ret := 0.363636
								if( up > 44.59 )
									ret := 0.078811
							if( up1 > 54.4069 )
								if( dn1 <= 55.5243 )
									ret := -0.909091 // sell
								if( dn1 > 55.5243 )
									ret := 0.264151
		if( atr2 > 0.178491 )
			if( dn <= 27.9959 )
				if( atr <= 0.220038 )
					if( dn1 <= 27.397 )
						if( dn <= 26.7877 )
							if( dn1 <= 22.5374 )
								if( up <= 19.9085 )
									ret := 0.750000 // buy
								if( up > 19.9085 )
									ret := -0.531915
							if( dn1 > 22.5374 )
								if( dn1 <= 23.3666 )
									ret := 0.428571
								if( dn1 > 23.3666 )
									ret := 0.005666
						if( dn > 26.7877 )
							if( up1 <= 25.8404 )
								if( up1 <= 25.7441 )
									ret := -1.000000 // sell
								if( up1 > 25.7441 )
									ret := -0.714286 // sell
							if( up1 > 25.8404 )
								if( up1 <= 26.0741 )
									ret := 0.562500
								if( up1 > 26.0741 )
									ret := -0.523810
					if( dn1 > 27.397 )
						if( atr <= 0.186729 )
							if( atr <= 0.171217 )
								if( atr2 <= 0.202403 )
									ret := 1.000000 // buy
								if( atr2 > 0.202403 )
									ret := 0.250000
							if( atr > 0.171217 )
								if( atr2 <= 0.218485 )
									ret := -0.625000
								if( atr2 > 0.218485 )
									ret := 0.750000 // buy
						if( atr > 0.186729 )
							if( dn <= 27.9708 )
								if( dn1 <= 27.8863 )
									ret := 0.767442 // buy
								if( dn1 > 27.8863 )
									ret := 1.000000 // buy
							if( dn > 27.9708 )
								ret := 0.400000
				if( atr > 0.220038 )
					if( up <= 19.9145 )
						if( dn <= 22.4133 )
							if( dn <= 20.8141 )
								ret := 0.500000
							if( dn > 20.8141 )
								if( dn <= 21.8449 )
									ret := 1.000000 // buy
								if( dn > 21.8449 )
									ret := 0.900000 // buy
						if( dn > 22.4133 )
							if( up <= 18.8837 )
								ret := 0.000000
							if( up > 18.8837 )
								ret := 0.500000
					if( up > 19.9145 )
						if( atr2 <= 0.335014 )
							if( dn1 <= 25.7538 )
								if( dn <= 25.2286 )
									ret := 0.541126
								if( dn > 25.2286 )
									ret := -0.692308
							if( dn1 > 25.7538 )
								if( up <= 25.1792 )
									ret := 0.976744 // buy
								if( up > 25.1792 )
									ret := 0.587629
						if( atr2 > 0.335014 )
							if( up <= 20.5236 )
								ret := -1.000000 // sell
							if( up > 20.5236 )
								if( up <= 20.8522 )
									ret := 0.647059
								if( up > 20.8522 )
									ret := -0.333333
			if( dn > 27.9959 )
				if( up1 <= 28.6439 )
					if( atr <= 0.157224 )
						if( dn1 <= 28.2348 )
							ret := 0.200000
						if( dn1 > 28.2348 )
							ret := 1.000000 // buy
					if( atr > 0.157224 )
						if( atr2 <= 0.319432 )
							if( atr <= 0.326791 )
								if( atr2 <= 0.188637 )
									ret := 0.074627
								if( atr2 > 0.188637 )
									ret := -0.588028
							if( atr > 0.326791 )
								if( dn1 <= 30.0964 )
									ret := 0.800000 // buy
								if( dn1 > 30.0964 )
									ret := -0.600000
						if( atr2 > 0.319432 )
							if( dn <= 30.6196 )
								if( up1 <= 26.5878 )
									ret := -0.043478
								if( up1 > 26.5878 )
									ret := 0.792453 // buy
							if( dn > 30.6196 )
								if( atr <= 0.519947 )
									ret := -0.362069
								if( atr > 0.519947 )
									ret := -0.900000 // sell
				if( up1 > 28.6439 )
					if( up <= 54.0088 )
						if( up <= 48.1757 )
							if( dn1 <= 34.1044 )
								if( up <= 31.9777 )
									ret := 0.247544
								if( up > 31.9777 )
									ret := 0.657895
							if( dn1 > 34.1044 )
								if( atr2 <= 0.354128 )
									ret := 0.088693
								if( atr2 > 0.354128 )
									ret := -0.358140
						if( up > 48.1757 )
							if( atr2 <= 0.24297 )
								if( up <= 52.809 )
									ret := 1.000000 // buy
								if( up > 52.809 )
									ret := 0.663043
							if( atr2 > 0.24297 )
								if( dn <= 52.914 )
									ret := 0.833333 // buy
								if( dn > 52.914 )
									ret := -0.050000
					if( up > 54.0088 )
						if( atr <= 0.227301 )
							if( atr2 <= 0.191615 )
								if( up1 <= 54.1739 )
									ret := -0.500000
								if( up1 > 54.1739 )
									ret := 0.000000
							if( atr2 > 0.191615 )
								if( dn <= 55.3735 )
									ret := -0.857143 // sell
								if( dn > 55.3735 )
									ret := -1.000000 // sell
						if( atr > 0.227301 )
							if( dn <= 56.144 )
								if( atr2 <= 0.23197 )
									ret := -0.333333
								if( atr2 > 0.23197 )
									ret := 0.538462
							if( dn > 56.144 )
								if( atr2 <= 0.271907 )
									ret := -0.200000
								if( atr2 > 0.271907 )
									ret := -0.913043 // sell
	if( sellSignalInt > 0.5 )
		if( atr <= 0.028733 )
			if( atr <= 0.021805 )
				if( up1 <= 25.2252 )
					if( dn1 <= 23.6505 )
						if( atr <= 0.019961 )
							ret := 0.142857
						if( atr > 0.019961 )
							ret := 0.600000
					if( dn1 > 23.6505 )
						ret := 0.000000
				if( up1 > 25.2252 )
					ret := 0.600000
			if( atr > 0.021805 )
				if( dn <= 22.9873 )
					if( dn1 <= 22.4823 )
						ret := 0.000000
					if( dn1 > 22.4823 )
						ret := -0.250000
				if( dn > 22.9873 )
					if( atr2 <= 0.021645 )
						ret := 0.000000
					if( atr2 > 0.021645 )
						if( atr2 <= 0.024045 )
							ret := 0.400000
						if( atr2 > 0.024045 )
							ret := 0.000000
		if( atr > 0.028733 )
			if( up1 <= 24.9055 )
				if( atr <= 0.036874 )
					if( atr2 <= 0.023076 )
						ret := 1.000000 // buy
					if( atr2 > 0.023076 )
						if( dn <= 22.4574 )
							if( up <= 22.26 )
								ret := 0.166667
							if( up > 22.26 )
								ret := 1.000000 // buy
						if( dn > 22.4574 )
							if( atr <= 0.032498 )
								if( dn1 <= 23.4256 )
									ret := 0.000000
								if( dn1 > 23.4256 )
									ret := 0.000000
							if( atr > 0.032498 )
								if( dn <= 24.681 )
									ret := 0.357143
								if( dn > 24.681 )
									ret := 0.750000 // buy
				if( atr > 0.036874 )
					if( atr <= 0.09139 )
						if( up <= 23.1134 )
							if( dn1 <= 22.5642 )
								ret := 1.000000 // buy
							if( dn1 > 22.5642 )
								if( dn <= 23.0134 )
									ret := 0.705882 // buy
								if( dn > 23.0134 )
									ret := 0.971429 // buy
						if( up > 23.1134 )
							if( up <= 23.2776 )
								if( atr2 <= 0.039765 )
									ret := 0.000000
								if( atr2 > 0.039765 )
									ret := -0.333333
							if( up > 23.2776 )
								if( up <= 24.4912 )
									ret := 0.904255 // buy
								if( up > 24.4912 )
									ret := 0.750000 // buy
					if( atr > 0.09139 )
						if( up <= 23.4313 )
							if( atr <= 0.109889 )
								ret := 0.333333
							if( atr > 0.109889 )
								ret := 1.000000 // buy
						if( up > 23.4313 )
							ret := -0.500000
			if( up1 > 24.9055 )
				if( up <= 25.6311 )
					if( atr2 <= 0.031479 )
						ret := 1.000000 // buy
					if( atr2 > 0.031479 )
						if( up <= 25.5751 )
							if( atr2 <= 0.048781 )
								if( atr <= 0.046183 )
									ret := 0.250000
								if( atr > 0.046183 )
									ret := -0.500000
							if( atr2 > 0.048781 )
								if( dn <= 25.4892 )
									ret := 1.000000 // buy
								if( dn > 25.4892 )
									ret := 0.000000
						if( up > 25.5751 )
							if( up <= 25.6076 )
								ret := -0.750000 // sell
							if( up > 25.6076 )
								ret := -1.000000 // sell
				if( up > 25.6311 )
					if( up <= 35.5927 )
						if( dn <= 26.2556 )
							ret := 1.000000 // buy
						if( dn > 26.2556 )
							if( atr <= 0.042091 )
								if( up1 <= 32.3642 )
									ret := 0.071429
								if( up1 > 32.3642 )
									ret := 0.500000
							if( atr > 0.042091 )
								if( up <= 26.5431 )
									ret := 0.400000
								if( up > 26.5431 )
									ret := 0.770186 // buy
					if( up > 35.5927 )
						if( dn1 <= 36.937 )
							if( atr <= 0.037325 )
								ret := 1.000000 // buy
							if( atr > 0.037325 )
								if( atr2 <= 0.053985 )
									ret := 0.300000
								if( atr2 > 0.053985 )
									ret := -0.421053
						if( dn1 > 36.937 )
							if( atr2 <= 0.072756 )
								if( atr <= 0.079188 )
									ret := 0.458333
								if( atr > 0.079188 )
									ret := -0.300000
							if( atr2 > 0.072756 )
								if( atr <= 0.211156 )
									ret := 0.784615 // buy
								if( atr > 0.211156 )
									ret := 0.421053
	
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
float op_operation = decision_tree_0_UPST_1Min_7517665c(dn1, atr, dn, up1, up, sellSignalInt, atr2, buySignalInt, trend)

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


