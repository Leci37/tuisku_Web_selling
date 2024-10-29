//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: SuperTrend
// ID_model: BNBUSDT_30Min_1SUP_1cd18f79 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BNBUSDT_30Min_1SUP_1cd18f79", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BNBUSDT_30Min_1cd18f79(atr, up, dn1, sellSignalInt, buySignalInt, atr2, dn, trend, up1)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( dn1 <= 596.398 )
		if( dn1 <= 28.8135 )
			if( up <= 20.525 )
				if( dn <= 20.1839 )
					if( atr2 <= 0.492573 )
						if( up1 <= 17.8749 )
							ret := 0.272727
						if( up1 > 17.8749 )
							ret := -0.090909
					if( atr2 > 0.492573 )
						ret := 1.000000 // buy
				if( dn > 20.1839 )
					if( dn1 <= 21.3195 )
						if( atr <= 0.520309 )
							if( up1 <= 18.0762 )
								ret := -1.000000 // sell
							if( up1 > 18.0762 )
								if( dn <= 20.7707 )
									ret := -0.692308
								if( dn > 20.7707 )
									ret := -1.000000 // sell
						if( atr > 0.520309 )
							ret := 0.333333
					if( dn1 > 21.3195 )
						if( up <= 19.7778 )
							if( atr <= 0.485212 )
								if( atr2 <= 0.494982 )
									ret := 0.965517 // buy
								if( atr2 > 0.494982 )
									ret := 0.700000 // buy
							if( atr > 0.485212 )
								if( dn1 <= 22.2332 )
									ret := 0.200000
								if( dn1 > 22.2332 )
									ret := 0.722222 // buy
						if( up > 19.7778 )
							if( atr2 <= 0.329957 )
								if( up1 <= 20.2907 )
									ret := -0.852941 // sell
								if( up1 > 20.2907 )
									ret := -1.000000 // sell
							if( atr2 > 0.329957 )
								if( atr2 <= 0.346096 )
									ret := 0.500000
								if( atr2 > 0.346096 )
									ret := -0.404762
			if( up > 20.525 )
				if( up <= 26.4747 )
					if( up1 <= 24.1498 )
						if( up <= 23.6204 )
							if( up <= 23.3728 )
								if( up <= 22.9257 )
									ret := 0.178832
								if( up > 22.9257 )
									ret := -0.432432
							if( up > 23.3728 )
								if( dn1 <= 25.3081 )
									ret := 0.641509
								if( dn1 > 25.3081 )
									ret := -0.809524 // sell
						if( up > 23.6204 )
							if( dn1 <= 25.3326 )
								if( up <= 23.884 )
									ret := 0.680000
								if( up > 23.884 )
									ret := -0.157895
							if( dn1 > 25.3326 )
								if( atr2 <= 0.337137 )
									ret := -0.407407
								if( atr2 > 0.337137 )
									ret := -0.950000 // sell
					if( up1 > 24.1498 )
						if( up <= 25.3519 )
							if( atr <= 0.385242 )
								if( dn <= 25.9727 )
									ret := 0.826087 // buy
								if( dn > 25.9727 )
									ret := 0.162162
							if( atr > 0.385242 )
								if( dn1 <= 27.2679 )
									ret := 0.516129
								if( dn1 > 27.2679 )
									ret := 0.860656 // buy
						if( up > 25.3519 )
							if( dn <= 27.0627 )
								if( dn <= 26.9526 )
									ret := -0.047619
								if( dn > 26.9526 )
									ret := -0.514286
							if( dn > 27.0627 )
								if( atr <= 0.230688 )
									ret := 0.526012
								if( atr > 0.230688 )
									ret := 0.122685
				if( up > 26.4747 )
					if( dn <= 27.8416 )
						if( up1 <= 26.404 )
							ret := 0.416667
						if( up1 > 26.404 )
							if( up <= 26.5317 )
								ret := -0.950000 // sell
							if( up > 26.5317 )
								if( dn1 <= 27.5977 )
									ret := 0.071429
								if( dn1 > 27.5977 )
									ret := -0.500000
					if( dn > 27.8416 )
						if( atr2 <= 0.22808 )
							if( up1 <= 27.8357 )
								if( atr <= 0.204441 )
									ret := 0.046988
								if( atr > 0.204441 )
									ret := -0.421569
							if( up1 > 27.8357 )
								if( up <= 27.857 )
									ret := 0.666667
								if( up > 27.857 )
									ret := 0.305085
						if( atr2 > 0.22808 )
							if( up <= 26.7085 )
								if( dn1 <= 28.0123 )
									ret := 0.000000
								if( dn1 > 28.0123 )
									ret := 0.698413
							if( up > 26.7085 )
								if( up1 <= 26.6713 )
									ret := -0.725000 // sell
								if( up1 > 26.6713 )
									ret := 0.279070
		if( dn1 > 28.8135 )
			if( up <= 27.8302 )
				if( atr2 <= 0.419783 )
					if( up <= 27.5229 )
						if( dn1 <= 29.5804 )
							if( dn1 <= 29.3322 )
								if( up1 <= 27.3673 )
									ret := 0.074074
								if( up1 > 27.3673 )
									ret := 0.812500 // buy
							if( dn1 > 29.3322 )
								if( dn <= 29.3423 )
									ret := 0.750000 // buy
								if( dn > 29.3423 )
									ret := 0.900000 // buy
						if( dn1 > 29.5804 )
							ret := -0.692308
					if( up > 27.5229 )
						if( atr2 <= 0.22611 )
							if( up1 <= 27.7378 )
								if( dn <= 28.858 )
									ret := 0.750000 // buy
								if( dn > 28.858 )
									ret := 0.500000
							if( up1 > 27.7378 )
								ret := -0.461538
						if( atr2 > 0.22611 )
							if( dn1 <= 29.1606 )
								if( atr <= 0.241435 )
									ret := -0.867925 // sell
								if( atr > 0.241435 )
									ret := -0.105263
							if( dn1 > 29.1606 )
								if( up1 <= 27.6908 )
									ret := -0.686275
								if( up1 > 27.6908 )
									ret := 0.139535
				if( atr2 > 0.419783 )
					if( up <= 27.0644 )
						if( up <= 26.054 )
							if( atr <= 0.718371 )
								ret := 0.125000
							if( atr > 0.718371 )
								ret := 1.000000 // buy
						if( up > 26.054 )
							if( atr2 <= 0.544095 )
								if( atr2 <= 0.443167 )
									ret := -0.575758
								if( atr2 > 0.443167 )
									ret := -0.871212 // sell
							if( atr2 > 0.544095 )
								if( dn1 <= 30.4064 )
									ret := 0.000000
								if( dn1 > 30.4064 )
									ret := 0.760870 // buy
					if( up > 27.0644 )
						if( dn1 <= 32.5756 )
							if( atr2 <= 0.509888 )
								ret := -0.500000
							if( atr2 > 0.509888 )
								if( dn1 <= 32.1679 )
									ret := -1.000000 // sell
								if( dn1 > 32.1679 )
									ret := -0.888889 // sell
						if( dn1 > 32.5756 )
							ret := -0.166667
			if( up > 27.8302 )
				if( trend <= 0.971 )
					if( up1 <= 307.71 )
						if( dn1 <= 304.716 )
							if( trend <= -0.589347 )
								if( atr2 <= 1.79 )
									ret := 0.000000
								if( atr2 > 1.79 )
									ret := 0.750000 // buy
							if( trend > -0.589347 )
								if( atr2 <= 1.43649 )
									ret := -0.157895
								if( atr2 > 1.43649 )
									ret := 0.800000 // buy
						if( dn1 > 304.716 )
							if( up <= 307.401 )
								ret := 1.000000 // buy
							if( up > 307.401 )
								ret := 0.777778 // buy
					if( up1 > 307.71 )
						if( dn1 <= 332.223 )
							ret := -0.904762 // sell
						if( dn1 > 332.223 )
							if( up <= 324.093 )
								if( dn1 <= 335.201 )
									ret := 0.875000 // buy
								if( dn1 > 335.201 )
									ret := 1.000000 // buy
							if( up > 324.093 )
								if( dn1 <= 346.534 )
									ret := -0.850000 // sell
								if( dn1 > 346.534 )
									ret := -0.099099
				if( trend > 0.971 )
					if( atr2 <= 7.59983 )
						if( up <= 206.115 )
							if( dn <= 216.258 )
								if( up1 <= 27.8235 )
									ret := 0.588235
								if( up1 > 27.8235 )
									ret := 0.043728
							if( dn > 216.258 )
								if( up1 <= 197.991 )
									ret := 0.711656 // buy
								if( up1 > 197.991 )
									ret := 0.233129
						if( up > 206.115 )
							if( up1 <= 205.852 )
								if( dn <= 223.261 )
									ret := -0.363636
								if( dn > 223.261 )
									ret := -0.880952 // sell
							if( up1 > 205.852 )
								if( atr <= 8.29551 )
									ret := -0.005660
								if( atr > 8.29551 )
									ret := 0.495238
					if( atr2 > 7.59983 )
						if( dn1 <= 340.638 )
							if( dn1 <= 311.606 )
								if( dn <= 246.673 )
									ret := 0.750000 // buy
								if( dn > 246.673 )
									ret := 0.073840
							if( dn1 > 311.606 )
								if( up <= 281.977 )
									ret := -0.300319
								if( up > 281.977 )
									ret := -0.957447 // sell
						if( dn1 > 340.638 )
							if( up1 <= 271.911 )
								if( atr2 <= 21.0123 )
									ret := 0.402597
								if( atr2 > 21.0123 )
									ret := 1.000000 // buy
							if( up1 > 271.911 )
								if( atr <= 8.54105 )
									ret := 0.369658
								if( atr > 8.54105 )
									ret := 0.045071
	if( dn1 > 596.398 )
		if( atr2 <= 12.6065 )
			if( dn1 <= 652.825 )
				if( dn1 <= 634.849 )
					if( atr <= 8.43073 )
						if( atr <= 6.39382 )
							if( up <= 603.112 )
								if( dn <= 621.121 )
									ret := -0.154291
								if( dn > 621.121 )
									ret := 0.229437
							if( up > 603.112 )
								if( dn1 <= 626.275 )
									ret := -0.072727
								if( dn1 > 626.275 )
									ret := -0.526718
						if( atr > 6.39382 )
							if( atr2 <= 7.66962 )
								if( dn1 <= 597.515 )
									ret := 0.416667
								if( dn1 > 597.515 )
									ret := -0.596234
							if( atr2 > 7.66962 )
								if( atr <= 8.18464 )
									ret := 0.000000
								if( atr > 8.18464 )
									ret := -0.636364
					if( atr > 8.43073 )
						if( up <= 545.223 )
							if( atr <= 10.5693 )
								if( up1 <= 542.139 )
									ret := -0.979167 // sell
								if( up1 > 542.139 )
									ret := -0.866667 // sell
							if( atr > 10.5693 )
								if( up <= 540.187 )
									ret := -0.775000 // sell
								if( up > 540.187 )
									ret := 0.000000
						if( up > 545.223 )
							if( dn <= 623.554 )
								if( dn <= 598.955 )
									ret := -0.913043 // sell
								if( dn > 598.955 )
									ret := 0.521994
							if( dn > 623.554 )
								if( up1 <= 564.687 )
									ret := -0.894737 // sell
								if( up1 > 564.687 )
									ret := 0.120482
				if( dn1 > 634.849 )
					if( dn1 <= 641.595 )
						if( atr <= 8.96244 )
							if( up <= 616.176 )
								if( dn <= 637.246 )
									ret := 0.371728
								if( dn > 637.246 )
									ret := -0.004902
							if( up > 616.176 )
								if( dn1 <= 636.755 )
									ret := 0.333333
								if( dn1 > 636.755 )
									ret := 0.754386 // buy
						if( atr > 8.96244 )
							if( dn <= 634.717 )
								ret := -0.470588
							if( dn > 634.717 )
								ret := -1.000000 // sell
					if( dn1 > 641.595 )
						if( dn1 <= 642.515 )
							if( atr <= 6.8453 )
								if( atr2 <= 5.10381 )
									ret := 0.363636
								if( atr2 > 5.10381 )
									ret := -0.857143 // sell
							if( atr > 6.8453 )
								if( up1 <= 593.993 )
									ret := -0.666667
								if( up1 > 593.993 )
									ret := 1.000000 // buy
						if( dn1 > 642.515 )
							if( dn <= 643.685 )
								if( atr <= 10.3441 )
									ret := 0.432432
								if( atr > 10.3441 )
									ret := -0.357143
							if( dn > 643.685 )
								if( dn <= 644.547 )
									ret := -0.553846
								if( dn > 644.547 )
									ret := 0.016779
			if( dn1 > 652.825 )
				if( atr <= 7.18403 )
					if( dn <= 676.756 )
						if( up1 <= 629.293 )
							if( up <= 623.787 )
								if( atr <= 6.39845 )
									ret := -0.490566
								if( atr > 6.39845 )
									ret := 0.529412
							if( up > 623.787 )
								if( dn <= 655.187 )
									ret := -0.428571
								if( dn > 655.187 )
									ret := 0.314050
						if( up1 > 629.293 )
							if( dn <= 661.584 )
								if( up <= 631.745 )
									ret := -0.378788
								if( up > 631.745 )
									ret := 0.062500
							if( dn > 661.584 )
								if( up <= 644.853 )
									ret := -0.581498
								if( up > 644.853 )
									ret := -1.000000 // sell
					if( dn > 676.756 )
						if( atr2 <= 4.77547 )
							if( dn <= 712.745 )
								if( dn <= 687.639 )
									ret := -0.473684
								if( dn > 687.639 )
									ret := 0.105691
							if( dn > 712.745 )
								if( atr2 <= 3.99636 )
									ret := -0.270833
								if( atr2 > 3.99636 )
									ret := -0.617021
						if( atr2 > 4.77547 )
							if( up1 <= 658.326 )
								if( up1 <= 652.804 )
									ret := 0.171429
								if( up1 > 652.804 )
									ret := 0.909091 // buy
							if( up1 > 658.326 )
								if( atr <= 6.48472 )
									ret := -0.439024
								if( atr > 6.48472 )
									ret := 0.769231 // buy
				if( atr > 7.18403 )
					if( dn <= 717.571 )
						if( atr <= 11.5385 )
							if( up <= 641.267 )
								if( atr2 <= 11.4665 )
									ret := -0.400000
								if( atr2 > 11.4665 )
									ret := 0.714286 // buy
							if( up > 641.267 )
								if( dn1 <= 685.612 )
									ret := -0.500000
								if( dn1 > 685.612 )
									ret := -0.876543 // sell
						if( atr > 11.5385 )
							if( up <= 599.153 )
								ret := -0.900000 // sell
							if( up > 599.153 )
								ret := -1.000000 // sell
					if( dn > 717.571 )
						ret := 0.444444
		if( atr2 > 12.6065 )
			if( dn <= 622.831 )
				if( dn1 <= 599.777 )
					if( atr <= 14.8538 )
						ret := -0.562500
					if( atr > 14.8538 )
						ret := 0.700000 // buy
				if( dn1 > 599.777 )
					if( up <= 515.408 )
						ret := 0.238095
					if( up > 515.408 )
						if( up <= 540.875 )
							if( dn <= 609.53 )
								if( atr <= 13.5905 )
									ret := 0.937500 // buy
								if( atr > 13.5905 )
									ret := 0.545455
							if( dn > 609.53 )
								if( atr2 <= 13.4628 )
									ret := 0.888889 // buy
								if( atr2 > 13.4628 )
									ret := 1.000000 // buy
						if( up > 540.875 )
							if( atr2 <= 12.9387 )
								ret := 0.875000 // buy
							if( atr2 > 12.9387 )
								if( up <= 546.556 )
									ret := 0.444444
								if( up > 546.556 )
									ret := -0.375000
			if( dn > 622.831 )
				if( dn <= 629.093 )
					ret := -0.733333 // sell
				if( dn > 629.093 )
					if( up <= 591.429 )
						if( dn1 <= 667.936 )
							if( atr2 <= 16.2168 )
								if( up1 <= 572.721 )
									ret := 0.106383
								if( up1 > 572.721 )
									ret := -0.875000 // sell
							if( atr2 > 16.2168 )
								if( up1 <= 524.946 )
									ret := -0.294118
								if( up1 > 524.946 )
									ret := 0.865385 // buy
						if( dn1 > 667.936 )
							if( up1 <= 584.445 )
								if( dn <= 680.662 )
									ret := -0.615385
								if( dn > 680.662 )
									ret := -1.000000 // sell
							if( up1 > 584.445 )
								ret := -0.300000
					if( up > 591.429 )
						if( up1 <= 590.735 )
							ret := -0.500000
						if( up1 > 590.735 )
							if( atr <= 13.717 )
								ret := 0.750000 // buy
							if( atr > 13.717 )
								ret := 0.916667 // buy
	
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
float op_operation = decision_tree_0_BNBUSDT_30Min_1cd18f79(atr, up, dn1, sellSignalInt, buySignalInt, atr2, dn, trend, up1)

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


