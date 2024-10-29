//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: SuperTrend
// ID_model: GME_15Min_1SUP_09fc64d3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GME_15Min_1SUP_09fc64d3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GME_15Min_09fc64d3(dn1, trend, atr, atr2, buySignalInt, sellSignalInt, up1, up, dn)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( up1 <= 3.92693 )
		if( up <= 3.02452 )
			if( atr2 <= 0.082326 )
				if( dn1 <= 2.94787 )
					if( dn <= 2.78393 )
						ret := 1.000000 // buy
					if( dn > 2.78393 )
						if( atr <= 0.048453 )
							ret := 0.833333 // buy
						if( atr > 0.048453 )
							ret := -0.368421
				if( dn1 > 2.94787 )
					if( dn <= 3.15208 )
						if( atr <= 0.045846 )
							if( up <= 2.79368 )
								ret := 0.666667
							if( up > 2.79368 )
								if( up1 <= 2.81965 )
									ret := -0.928571 // sell
								if( up1 > 2.81965 )
									ret := -0.533333
						if( atr > 0.045846 )
							if( up <= 2.62628 )
								ret := -1.000000 // sell
							if( up > 2.62628 )
								if( up1 <= 2.76694 )
									ret := -0.533333
								if( up1 > 2.76694 )
									ret := -1.000000 // sell
					if( dn > 3.15208 )
						if( dn <= 3.21656 )
							if( atr <= 0.046264 )
								ret := 0.687500
							if( atr > 0.046264 )
								ret := 1.000000 // buy
						if( dn > 3.21656 )
							if( atr2 <= 0.063833 )
								if( up1 <= 3.01206 )
									ret := -0.941176 // sell
								if( up1 > 3.01206 )
									ret := -1.000000 // sell
							if( atr2 > 0.063833 )
								ret := -0.083333
			if( atr2 > 0.082326 )
				if( up1 <= 2.86731 )
					if( dn1 <= 3.19776 )
						ret := 1.000000 // buy
					if( dn1 > 3.19776 )
						ret := 0.529412
				if( up1 > 2.86731 )
					if( up <= 2.98299 )
						if( atr2 <= 0.118554 )
							ret := -0.470588
						if( atr2 > 0.118554 )
							ret := 0.000000
					if( up > 2.98299 )
						ret := 0.916667 // buy
		if( up > 3.02452 )
			if( up1 <= 3.11501 )
				if( up1 <= 3.03528 )
					if( atr2 <= 0.085233 )
						ret := 1.000000 // buy
					if( atr2 > 0.085233 )
						ret := 0.900000 // buy
				if( up1 > 3.03528 )
					if( up1 <= 3.10076 )
						if( up1 <= 3.08351 )
							ret := 0.541667
						if( up1 > 3.08351 )
							ret := -0.117647
					if( up1 > 3.10076 )
						if( up1 <= 3.10717 )
							ret := 1.000000 // buy
						if( up1 > 3.10717 )
							if( dn <= 3.50029 )
								ret := 0.687500
							if( dn > 3.50029 )
								ret := 1.000000 // buy
			if( up1 > 3.11501 )
				if( up1 <= 3.78409 )
					if( up <= 3.63269 )
						if( up1 <= 3.59271 )
							if( trend <= 0 )
								ret := 1.000000 // buy
							if( trend > 0 )
								if( atr <= 0.033455 )
									ret := 0.436090
								if( atr > 0.033455 )
									ret := 0.099869
						if( up1 > 3.59271 )
							if( up1 <= 3.62728 )
								if( atr <= 0.042584 )
									ret := 0.187500
								if( atr > 0.042584 )
									ret := 0.514019
							if( up1 > 3.62728 )
								if( up1 <= 3.62954 )
									ret := 1.000000 // buy
								if( up1 > 3.62954 )
									ret := 0.833333 // buy
					if( up > 3.63269 )
						if( up <= 3.64989 )
							if( dn <= 3.84514 )
								if( up <= 3.63496 )
									ret := -0.454545
								if( up > 3.63496 )
									ret := -0.882353 // sell
							if( dn > 3.84514 )
								if( atr <= 0.06585 )
									ret := 0.129032
								if( atr > 0.06585 )
									ret := -0.590164
						if( up > 3.64989 )
							if( atr2 <= 0.043372 )
								if( atr <= 0.030768 )
									ret := 0.743363 // buy
								if( atr > 0.030768 )
									ret := -0.040000
							if( atr2 > 0.043372 )
								if( up <= 3.74637 )
									ret := 0.066176
								if( up > 3.74637 )
									ret := -0.288066
				if( up1 > 3.78409 )
					if( atr <= 0.020232 )
						ret := 0.900000 // buy
					if( atr > 0.020232 )
						if( dn <= 4.46044 )
							if( dn <= 4.36228 )
								if( dn <= 4.32923 )
									ret := 0.260820
								if( dn > 4.32923 )
									ret := -0.400000
							if( dn > 4.36228 )
								if( dn <= 4.44692 )
									ret := 0.920455 // buy
								if( dn > 4.44692 )
									ret := 0.636364
						if( dn > 4.46044 )
							if( up <= 3.86402 )
								if( up <= 3.83686 )
									ret := 0.500000
								if( up > 3.83686 )
									ret := 1.000000 // buy
							if( up > 3.86402 )
								if( dn1 <= 4.62704 )
									ret := -0.681818
								if( dn1 > 4.62704 )
									ret := -0.046512
	if( up1 > 3.92693 )
		if( atr <= 1.85916 )
			if( dn1 <= 23.0206 )
				if( dn <= 21.5179 )
					if( sellSignalInt <= 0.5 )
						if( dn <= 16.5234 )
							if( up1 <= 4.13772 )
								if( dn <= 4.37959 )
									ret := 0.011284
								if( dn > 4.37959 )
									ret := -0.249746
							if( up1 > 4.13772 )
								if( up <= 4.1912 )
									ret := 0.360000
								if( up > 4.1912 )
									ret := 0.010969
						if( dn > 16.5234 )
							if( up1 <= 16.9378 )
								if( atr <= 0.762187 )
									ret := -0.110591
								if( atr > 0.762187 )
									ret := -0.653333
							if( up1 > 16.9378 )
								if( up <= 17.122 )
									ret := 0.331950
								if( up > 17.122 )
									ret := -0.012593
					if( sellSignalInt > 0.5 )
						if( up <= 4.0544 )
							ret := -0.857143 // sell
						if( up > 4.0544 )
							if( dn <= 5.09655 )
								if( atr <= 0.085602 )
									ret := 0.954545 // buy
								if( atr > 0.085602 )
									ret := 0.600000
							if( dn > 5.09655 )
								if( atr <= 0.402249 )
									ret := 0.331776
								if( atr > 0.402249 )
									ret := -0.411765
				if( dn > 21.5179 )
					if( atr2 <= 0.303429 )
						if( dn <= 22.8113 )
							if( up <= 22.1583 )
								if( up1 <= 21.6735 )
									ret := -0.004690
								if( up1 > 21.6735 )
									ret := 0.172524
							if( up > 22.1583 )
								if( up <= 22.4136 )
									ret := -0.138614
								if( up > 22.4136 )
									ret := -0.460317
						if( dn > 22.8113 )
							if( atr2 <= 0.166157 )
								if( up1 <= 22.5159 )
									ret := -0.022124
								if( up1 > 22.5159 )
									ret := 0.304636
							if( atr2 > 0.166157 )
								if( dn <= 22.9881 )
									ret := 0.477778
								if( dn > 22.9881 )
									ret := -0.200000
					if( atr2 > 0.303429 )
						if( up <= 19.6858 )
							if( up <= 19.0355 )
								if( up <= 18.8994 )
									ret := 0.337662
								if( up > 18.8994 )
									ret := -0.611111
							if( up > 19.0355 )
								if( atr2 <= 0.413085 )
									ret := 0.391304
								if( atr2 > 0.413085 )
									ret := 0.980000 // buy
						if( up > 19.6858 )
							if( atr2 <= 0.393823 )
								if( dn <= 21.808 )
									ret := 0.067568
								if( dn > 21.808 )
									ret := 0.418803
							if( atr2 > 0.393823 )
								if( up1 <= 20.3309 )
									ret := -0.274854
								if( up1 > 20.3309 )
									ret := 0.294118
			if( dn1 > 23.0206 )
				if( up <= 22.3792 )
					if( up <= 21.1558 )
						if( up <= 17.2858 )
							if( atr <= 1.17376 )
								ret := -0.888889 // sell
							if( atr > 1.17376 )
								if( up1 <= 15.8164 )
									ret := -1.000000 // sell
								if( up1 > 15.8164 )
									ret := -0.272727
						if( up > 17.2858 )
							if( atr2 <= 0.795265 )
								if( up <= 21.0354 )
									ret := -0.257310
								if( up > 21.0354 )
									ret := 0.569444
							if( atr2 > 0.795265 )
								if( dn <= 23.8916 )
									ret := 0.140351
								if( dn > 23.8916 )
									ret := 0.723881 // buy
					if( up > 21.1558 )
						if( up1 <= 21.6661 )
							if( atr2 <= 0.710955 )
								if( dn1 <= 24.7463 )
									ret := -0.357558
								if( dn1 > 24.7463 )
									ret := -0.800000 // sell
							if( atr2 > 0.710955 )
								if( atr2 <= 0.865151 )
									ret := 0.785714 // buy
								if( atr2 > 0.865151 )
									ret := -0.301205
						if( up1 > 21.6661 )
							if( dn <= 25.6988 )
								if( up <= 21.7326 )
									ret := 0.678571
								if( up > 21.7326 )
									ret := -0.198140
							if( dn > 25.6988 )
								if( atr2 <= 1.02025 )
									ret := 0.487805
								if( atr2 > 1.02025 )
									ret := -0.250000
				if( up > 22.3792 )
					if( dn <= 177.443 )
						if( up <= 169.874 )
							if( dn <= 166.347 )
								if( dn <= 162.824 )
									ret := -0.027509
								if( dn > 162.824 )
									ret := 0.154104
							if( dn > 166.347 )
								if( up1 <= 167.306 )
									ret := -0.325000
								if( up1 > 167.306 )
									ret := 0.148649
						if( up > 169.874 )
							if( atr <= 0.900404 )
								if( atr <= 0.49079 )
									ret := 0.000000
								if( atr > 0.49079 )
									ret := 0.643312
							if( atr > 0.900404 )
								if( up <= 171.928 )
									ret := -0.103448
								if( up > 171.928 )
									ret := 0.625000
					if( dn > 177.443 )
						if( up1 <= 172.518 )
							if( dn1 <= 180.397 )
								ret := -0.601504
							if( dn1 > 180.397 )
								if( up1 <= 171.815 )
									ret := 0.179487
								if( up1 > 171.815 )
									ret := -0.333333
						if( up1 > 172.518 )
							if( dn1 <= 180.322 )
								if( dn <= 177.735 )
									ret := 0.833333 // buy
								if( dn > 177.735 )
									ret := -0.373444
							if( dn1 > 180.322 )
								if( dn1 <= 222.991 )
									ret := -0.059178
								if( dn1 > 222.991 )
									ret := -0.225806
		if( atr > 1.85916 )
			if( dn <= 141.454 )
				if( up1 <= 104.441 )
					if( atr <= 12.4661 )
						if( dn1 <= 98.8334 )
							if( atr <= 3.29308 )
								if( dn1 <= 48.5307 )
									ret := 0.123077
								if( dn1 > 48.5307 )
									ret := 0.397561
							if( atr > 3.29308 )
								if( up <= 54.6017 )
									ret := -0.206677
								if( up > 54.6017 )
									ret := 0.563107
						if( dn1 > 98.8334 )
							if( dn <= 106.515 )
								if( atr <= 2.57718 )
									ret := -0.533333
								if( atr > 2.57718 )
									ret := 0.010067
							if( dn > 106.515 )
								if( up <= 105.368 )
									ret := 0.083945
								if( up > 105.368 )
									ret := -0.576923
					if( atr > 12.4661 )
						if( up1 <= 43.566 )
							if( up <= 34.4916 )
								ret := 0.923077 // buy
							if( up > 34.4916 )
								ret := 1.000000 // buy
						if( up1 > 43.566 )
							ret := 0.727273 // buy
				if( up1 > 104.441 )
					if( up1 <= 127.871 )
						if( dn1 <= 140.069 )
							if( up <= 109.831 )
								if( dn <= 117.755 )
									ret := -0.347826
								if( dn > 117.755 )
									ret := 0.666667
							if( up > 109.831 )
								if( up <= 122.178 )
									ret := 0.307933
								if( up > 122.178 )
									ret := 0.104693
						if( dn1 > 140.069 )
							if( atr <= 2.27568 )
								ret := 0.500000
							if( atr > 2.27568 )
								if( atr <= 2.47172 )
									ret := 1.000000 // buy
								if( atr > 2.47172 )
									ret := 0.777778 // buy
					if( up1 > 127.871 )
						if( atr <= 1.92936 )
							ret := -0.153846
						if( atr > 1.92936 )
							if( up <= 129.255 )
								ret := -0.375000
							if( up > 129.255 )
								ret := -0.444444
			if( dn > 141.454 )
				if( dn1 <= 150.494 )
					if( atr2 <= 2.09434 )
						if( dn <= 144.04 )
							if( atr2 <= 1.82101 )
								ret := -0.500000
							if( atr2 > 1.82101 )
								if( atr2 <= 1.94329 )
									ret := -1.000000 // sell
								if( atr2 > 1.94329 )
									ret := -0.875000 // sell
						if( dn > 144.04 )
							if( dn <= 149.686 )
								if( atr <= 1.89616 )
									ret := -0.615385
								if( atr > 1.89616 )
									ret := -0.321429
							if( dn > 149.686 )
								if( atr <= 1.98581 )
									ret := -1.000000 // sell
								if( atr > 1.98581 )
									ret := -0.636364
					if( atr2 > 2.09434 )
						if( up <= 94.0502 )
							ret := 0.652174
						if( up > 94.0502 )
							if( atr <= 2.8697 )
								if( up1 <= 131.709 )
									ret := 0.238806
								if( up1 > 131.709 )
									ret := -0.476190
							if( atr > 2.8697 )
								if( atr2 <= 3.17528 )
									ret := -0.730769 // sell
								if( atr2 > 3.17528 )
									ret := -0.216495
				if( dn1 > 150.494 )
					if( dn1 <= 151.636 )
						if( up1 <= 136.293 )
							if( atr <= 4.46586 )
								if( atr <= 3.54532 )
									ret := 0.588235
								if( atr > 3.54532 )
									ret := -0.636364
							if( atr > 4.46586 )
								ret := 0.882353 // buy
						if( up1 > 136.293 )
							if( atr <= 2.20399 )
								if( atr2 <= 2.05101 )
									ret := 0.818182 // buy
								if( atr2 > 2.05101 )
									ret := 0.111111
							if( atr > 2.20399 )
								if( dn1 <= 150.931 )
									ret := 1.000000 // buy
								if( dn1 > 150.931 )
									ret := 0.888889 // buy
					if( dn1 > 151.636 )
						if( atr <= 5.71552 )
							if( up <= 137.07 )
								if( dn <= 151.884 )
									ret := 0.150943
								if( dn > 151.884 )
									ret := -0.638743
							if( up > 137.07 )
								if( up1 <= 220.18 )
									ret := 0.017109
								if( up1 > 220.18 )
									ret := 0.199595
						if( atr > 5.71552 )
							if( up <= 257.545 )
								if( dn <= 292.828 )
									ret := -0.125000
								if( dn > 292.828 )
									ret := 0.208723
							if( up > 257.545 )
								if( dn1 <= 325.097 )
									ret := -0.208696
								if( dn1 > 325.097 )
									ret := -0.684015
	
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
float op_operation = decision_tree_0_GME_15Min_09fc64d3(dn1, trend, atr, atr2, buySignalInt, sellSignalInt, up1, up, dn)

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


