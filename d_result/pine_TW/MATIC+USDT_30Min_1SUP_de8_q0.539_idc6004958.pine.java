//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: SuperTrend
// ID_model: MATICUSDT_30Min_1SUP_c6004958 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MATICUSDT_30Min_1SUP_c6004958", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MATICUSDT_30Min_c6004958(dn1, trend, atr, atr2, buySignalInt, sellSignalInt, up1, up, dn)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( up1 <= 0.355414 )
		if( atr <= 0.000139 )
			if( atr2 <= 0.000101 )
				if( dn1 <= 0.013984 )
					if( up1 <= 0.012732 )
						ret := -0.454545
					if( up1 > 0.012732 )
						if( up <= 0.013362 )
							ret := -1.000000 // sell
						if( up > 0.013362 )
							ret := -0.625000
				if( dn1 > 0.013984 )
					if( atr <= 0.000112 )
						if( dn <= 0.014134 )
							if( up <= 0.013486 )
								ret := 0.750000 // buy
							if( up > 0.013486 )
								ret := 0.571429
						if( dn > 0.014134 )
							if( up <= 0.018637 )
								if( up <= 0.017739 )
									ret := -0.056391
								if( up > 0.017739 )
									ret := 0.273585
							if( up > 0.018637 )
								ret := -0.611111
					if( atr > 0.000112 )
						ret := 0.571429
			if( atr2 > 0.000101 )
				if( up1 <= 0.016828 )
					if( atr <= 0.000121 )
						if( atr <= 0.0001 )
							ret := 0.300000
						if( atr > 0.0001 )
							if( dn1 <= 0.013388 )
								if( up1 <= 0.012573 )
									ret := -0.941176 // sell
								if( up1 > 0.012573 )
									ret := -1.000000 // sell
							if( dn1 > 0.013388 )
								if( atr2 <= 0.000111 )
									ret := -0.611650
								if( atr2 > 0.000111 )
									ret := -0.440678
					if( atr > 0.000121 )
						if( dn <= 0.012718 )
							if( atr2 <= 0.000124 )
								ret := 0.866667 // buy
							if( atr2 > 0.000124 )
								ret := -0.076923
						if( dn > 0.012718 )
							if( up1 <= 0.015837 )
								if( atr2 <= 0.000121 )
									ret := 0.190476
								if( atr2 > 0.000121 )
									ret := -0.654206
							if( up1 > 0.015837 )
								if( up <= 0.016139 )
									ret := 0.533333
								if( up > 0.016139 )
									ret := -0.300000
				if( up1 > 0.016828 )
					if( dn <= 0.0178 )
						if( dn <= 0.017728 )
							if( dn <= 0.017557 )
								ret := 0.850000 // buy
							if( dn > 0.017557 )
								if( up <= 0.016969 )
									ret := 0.000000
								if( up > 0.016969 )
									ret := -0.153846
						if( dn > 0.017728 )
							if( dn <= 0.017763 )
								ret := 0.916667 // buy
							if( dn > 0.017763 )
								ret := 0.500000
					if( dn > 0.0178 )
						if( up <= 0.017664 )
							if( up1 <= 0.017164 )
								ret := 0.500000
							if( up1 > 0.017164 )
								if( atr2 <= 0.000143 )
									ret := -0.614583
								if( atr2 > 0.000143 )
									ret := -0.217391
						if( up > 0.017664 )
							if( atr <= 0.000114 )
								if( up <= 0.019062 )
									ret := -0.080645
								if( up > 0.019062 )
									ret := -1.000000 // sell
							if( atr > 0.000114 )
								if( dn1 <= 0.021201 )
									ret := 0.035714
								if( dn1 > 0.021201 )
									ret := -0.625000
		if( atr > 0.000139 )
			if( dn <= 0.016924 )
				if( dn1 <= 0.013452 )
					if( up1 <= 0.011629 )
						ret := 0.904762 // buy
					if( up1 > 0.011629 )
						if( dn1 <= 0.012912 )
							if( atr2 <= 0.000145 )
								ret := -0.166667
							if( atr2 > 0.000145 )
								ret := 0.333333
						if( dn1 > 0.012912 )
							if( atr2 <= 0.000202 )
								if( up <= 0.012226 )
									ret := -1.000000 // sell
								if( up > 0.012226 )
									ret := -0.750000 // sell
							if( atr2 > 0.000202 )
								ret := -0.400000
				if( dn1 > 0.013452 )
					if( dn <= 0.016892 )
						if( up <= 0.015177 )
							if( up1 <= 0.013281 )
								if( dn1 <= 0.014358 )
									ret := 0.666667
								if( dn1 > 0.014358 )
									ret := -0.187500
							if( up1 > 0.013281 )
								if( atr2 <= 0.000167 )
									ret := -0.302326
								if( atr2 > 0.000167 )
									ret := 0.241590
						if( up > 0.015177 )
							if( dn1 <= 0.016148 )
								ret := -0.545455
							if( dn1 > 0.016148 )
								if( dn1 <= 0.016694 )
									ret := 0.712707 // buy
								if( dn1 > 0.016694 )
									ret := 0.390000
					if( dn > 0.016892 )
						if( up <= 0.015996 )
							ret := 0.636364
						if( up > 0.015996 )
							ret := 1.000000 // buy
			if( dn > 0.016924 )
				if( dn1 <= 0.024712 )
					if( dn <= 0.022839 )
						if( atr2 <= 0.000468 )
							if( atr2 <= 0.000361 )
								if( atr2 <= 0.000301 )
									ret := 0.053865
								if( atr2 > 0.000301 )
									ret := -0.222222
							if( atr2 > 0.000361 )
								if( up <= 0.016001 )
									ret := -0.629630
								if( up > 0.016001 )
									ret := 0.413361
						if( atr2 > 0.000468 )
							if( atr <= 0.000655 )
								if( dn <= 0.020822 )
									ret := -0.121076
								if( dn > 0.020822 )
									ret := -0.636364
							if( atr > 0.000655 )
								if( dn1 <= 0.02059 )
									ret := 0.857143 // buy
								if( dn1 > 0.02059 )
									ret := -0.302326
					if( dn > 0.022839 )
						if( atr <= 0.000672 )
							if( up <= 0.021478 )
								if( dn1 <= 0.024004 )
									ret := -0.626168
								if( dn1 > 0.024004 )
									ret := 0.562500
							if( up > 0.021478 )
								ret := -1.000000 // sell
						if( atr > 0.000672 )
							ret := 0.555556
				if( dn1 > 0.024712 )
					if( up <= 0.02488 )
						if( dn1 <= 0.026732 )
							if( up1 <= 0.022953 )
								if( up <= 0.021981 )
									ret := 0.934783 // buy
								if( up > 0.021981 )
									ret := 1.000000 // buy
							if( up1 > 0.022953 )
								ret := -0.166667
						if( dn1 > 0.026732 )
							if( dn1 <= 0.027303 )
								if( up <= 0.021756 )
									ret := 0.476190
								if( up > 0.021756 )
									ret := -0.333333
							if( dn1 > 0.027303 )
								if( atr <= 0.000836 )
									ret := 0.786667 // buy
								if( atr > 0.000836 )
									ret := 0.482270
					if( up > 0.02488 )
						if( dn1 <= 0.494794 )
							if( atr <= 0.014119 )
								if( atr <= 0.010981 )
									ret := 0.101733
								if( atr > 0.010981 )
									ret := 0.369610
							if( atr > 0.014119 )
								if( up1 <= 0.333044 )
									ret := -0.346939
								if( up1 > 0.333044 )
									ret := 0.441860
						if( dn1 > 0.494794 )
							if( atr2 <= 0.039012 )
								ret := 0.600000
							if( atr2 > 0.039012 )
								ret := 1.000000 // buy
	if( up1 > 0.355414 )
		if( dn1 <= 0.404891 )
			if( up <= 0.358294 )
				if( up1 <= 0.357347 )
					if( dn1 <= 0.387142 )
						if( dn <= 0.381341 )
							ret := -0.071429
						if( dn > 0.381341 )
							ret := -0.500000
					if( dn1 > 0.387142 )
						ret := 0.400000
				if( up1 > 0.357347 )
					ret := 0.636364
			if( up > 0.358294 )
				if( atr <= 0.002617 )
					if( up1 <= 0.366779 )
						if( up <= 0.364093 )
							ret := 0.500000
						if( up > 0.364093 )
							if( dn <= 0.377199 )
								ret := 0.000000
							if( dn > 0.377199 )
								ret := 0.421053
					if( up1 > 0.366779 )
						if( up <= 0.369102 )
							if( dn1 <= 0.380774 )
								ret := 0.000000
							if( dn1 > 0.380774 )
								ret := 0.083333
						if( up > 0.369102 )
							ret := 0.000000
				if( atr > 0.002617 )
					if( up <= 0.359002 )
						if( up <= 0.358629 )
							ret := -0.625000
						if( up > 0.358629 )
							if( dn <= 0.390949 )
								ret := -1.000000 // sell
							if( dn > 0.390949 )
								ret := -0.875000 // sell
					if( up > 0.359002 )
						if( up1 <= 0.362839 )
							if( up <= 0.365782 )
								if( up1 <= 0.356379 )
									ret := -1.000000 // sell
								if( up1 > 0.356379 )
									ret := -0.291429
							if( up > 0.365782 )
								ret := 0.666667
						if( up1 > 0.362839 )
							if( atr2 <= 0.005124 )
								ret := -0.679245
							if( atr2 > 0.005124 )
								if( up1 <= 0.369696 )
									ret := -0.633333
								if( up1 > 0.369696 )
									ret := 0.571429
		if( dn1 > 0.404891 )
			if( atr <= 0.013911 )
				if( up1 <= 0.847315 )
					if( dn <= 0.859161 )
						if( dn <= 0.831703 )
							if( dn <= 0.781986 )
								if( up <= 0.365157 )
									ret := 0.294118
								if( up > 0.365157 )
									ret := -0.031492
							if( dn > 0.781986 )
								if( atr2 <= 0.009243 )
									ret := 0.008346
								if( atr2 > 0.009243 )
									ret := 0.247259
						if( dn > 0.831703 )
							if( up <= 0.76831 )
								if( atr <= 0.01169 )
									ret := -0.157895
								if( atr > 0.01169 )
									ret := -0.852459 // sell
							if( up > 0.76831 )
								if( dn1 <= 0.849119 )
									ret := -0.183399
								if( dn1 > 0.849119 )
									ret := -0.041506
					if( dn > 0.859161 )
						if( dn1 <= 0.920308 )
							if( dn <= 0.895443 )
								if( dn <= 0.866121 )
									ret := 0.239737
								if( dn > 0.866121 )
									ret := 0.018927
							if( dn > 0.895443 )
								if( up1 <= 0.828119 )
									ret := -0.150943
								if( up1 > 0.828119 )
									ret := 0.456667
						if( dn1 > 0.920308 )
							if( up <= 0.84266 )
								ret := -1.000000 // sell
							if( up > 0.84266 )
								ret := -0.523810
				if( up1 > 0.847315 )
					if( up <= 0.85467 )
						if( dn <= 0.869704 )
							if( dn1 <= 0.86816 )
								ret := 0.000000
							if( dn1 > 0.86816 )
								ret := 0.950000 // buy
						if( dn > 0.869704 )
							if( atr2 <= 0.010633 )
								if( dn <= 0.899855 )
									ret := -0.460274
								if( dn > 0.899855 )
									ret := 0.160920
							if( atr2 > 0.010633 )
								if( atr2 <= 0.011986 )
									ret := -0.878378 // sell
								if( atr2 > 0.011986 )
									ret := -0.437500
					if( up > 0.85467 )
						if( atr <= 0.01381 )
							if( up <= 1.56087 )
								if( up <= 0.923107 )
									ret := -0.092421
								if( up > 0.923107 )
									ret := -0.027611
							if( up > 1.56087 )
								if( up1 <= 1.74042 )
									ret := -0.245376
								if( up1 > 1.74042 )
									ret := 0.272000
						if( atr > 0.01381 )
							if( dn1 <= 1.34588 )
								if( dn1 <= 0.975599 )
									ret := -0.800000 // sell
								if( dn1 > 0.975599 )
									ret := 0.010638
							if( dn1 > 1.34588 )
								if( atr2 <= 0.013217 )
									ret := -0.500000
								if( atr2 > 0.013217 )
									ret := -0.780000 // sell
			if( atr > 0.013911 )
				if( dn <= 0.935383 )
					if( up1 <= 0.486274 )
						if( dn1 <= 0.583082 )
							if( up <= 0.415083 )
								if( up <= 0.360336 )
									ret := 0.650000
								if( up > 0.360336 )
									ret := -0.405405
							if( up > 0.415083 )
								if( atr2 <= 0.022607 )
									ret := 0.777778 // buy
								if( atr2 > 0.022607 )
									ret := 0.076923
						if( dn1 > 0.583082 )
							if( dn <= 0.616101 )
								if( atr2 <= 0.023512 )
									ret := -0.818182 // sell
								if( atr2 > 0.023512 )
									ret := -0.642857
							if( dn > 0.616101 )
								if( up <= 0.460588 )
									ret := 0.500000
								if( up > 0.460588 )
									ret := -0.657895
					if( up1 > 0.486274 )
						if( atr2 <= 0.050775 )
							if( up <= 0.755997 )
								if( dn <= 0.802238 )
									ret := 0.280269
								if( dn > 0.802238 )
									ret := 0.542296
							if( up > 0.755997 )
								if( up1 <= 0.771026 )
									ret := -0.228216
								if( up1 > 0.771026 )
									ret := 0.274247
						if( atr2 > 0.050775 )
							ret := -1.000000 // sell
				if( dn > 0.935383 )
					if( dn1 <= 1.46716 )
						if( up <= 1.28631 )
							if( dn1 <= 1.03454 )
								if( dn <= 0.986623 )
									ret := 0.079263
								if( dn > 0.986623 )
									ret := -0.275656
							if( dn1 > 1.03454 )
								if( dn <= 1.06898 )
									ret := 0.435855
								if( dn > 1.06898 )
									ret := 0.041629
						if( up > 1.28631 )
							if( up <= 1.31916 )
								if( dn <= 1.41947 )
									ret := 0.222222
								if( dn > 1.41947 )
									ret := 0.627049
							if( up > 1.31916 )
								if( up <= 1.34424 )
									ret := -0.193642
								if( up > 1.34424 )
									ret := 0.288462
					if( dn1 > 1.46716 )
						if( atr2 <= 0.043892 )
							if( dn <= 2.6136 )
								if( dn1 <= 2.56962 )
									ret := -0.058886
								if( dn1 > 2.56962 )
									ret := 0.502439
							if( dn > 2.6136 )
								if( dn1 <= 2.86323 )
									ret := -0.375000
								if( dn1 > 2.86323 )
									ret := 0.096774
						if( atr2 > 0.043892 )
							if( up1 <= 1.40949 )
								if( atr2 <= 0.102298 )
									ret := 0.606343
								if( atr2 > 0.102298 )
									ret := -0.275676
							if( up1 > 1.40949 )
								if( atr2 <= 0.048241 )
									ret := 0.191617
								if( atr2 > 0.048241 )
									ret := -0.073915
	
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
float op_operation = decision_tree_0_MATICUSDT_30Min_c6004958(dn1, trend, atr, atr2, buySignalInt, sellSignalInt, up1, up, dn)

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


