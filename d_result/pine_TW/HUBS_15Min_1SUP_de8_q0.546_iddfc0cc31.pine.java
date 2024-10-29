//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: SuperTrend
// ID_model: HUBS_15Min_1SUP_dfc0cc31 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_HUBS_15Min_1SUP_dfc0cc31", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_HUBS_15Min_dfc0cc31(dn1, trend, atr, atr2, buySignalInt, sellSignalInt, up1, up, dn)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( atr <= 2.02879 )
		if( up <= 202.36 )
			if( dn1 <= 184.583 )
				if( up <= 180.352 )
					if( up1 <= 45.7822 )
						if( dn <= 47.1361 )
							if( dn <= 46.6066 )
								ret := 1.000000 // buy
							if( dn > 46.6066 )
								if( up1 <= 44.8558 )
									ret := 0.866667 // buy
								if( up1 > 44.8558 )
									ret := 0.600000
						if( dn > 47.1361 )
							if( up1 <= 45.5972 )
								ret := 0.160000
							if( up1 > 45.5972 )
								ret := 0.687500
					if( up1 > 45.7822 )
						if( dn <= 82.2991 )
							if( dn <= 74.8793 )
								if( atr <= 0.705132 )
									ret := -0.006604
								if( atr > 0.705132 )
									ret := 0.445255
							if( dn > 74.8793 )
								if( up1 <= 75.9836 )
									ret := -0.293497
								if( up1 > 75.9836 )
									ret := -0.095395
						if( dn > 82.2991 )
							if( up1 <= 124.023 )
								if( atr2 <= 1.98073 )
									ret := 0.126225
								if( atr2 > 1.98073 )
									ret := -0.531915
							if( up1 > 124.023 )
								if( dn1 <= 180.352 )
									ret := -0.013093
								if( dn1 > 180.352 )
									ret := 0.154260
				if( up > 180.352 )
					if( dn <= 183.37 )
						if( atr <= 0.423031 )
							ret := 0.285714
						if( atr > 0.423031 )
							if( dn1 <= 183.27 )
								ret := -0.416667
							if( dn1 > 183.27 )
								ret := 0.363636
					if( dn > 183.37 )
						ret := 0.705426 // buy
			if( dn1 > 184.583 )
				if( dn <= 192.373 )
					if( up <= 182.016 )
						if( atr2 <= 0.843395 )
							if( up1 <= 180.817 )
								if( dn <= 185.818 )
									ret := 0.416667
								if( dn > 185.818 )
									ret := 1.000000 // buy
							if( up1 > 180.817 )
								if( atr <= 0.614822 )
									ret := 0.333333
								if( atr > 0.614822 )
									ret := 0.065217
						if( atr2 > 0.843395 )
							if( atr <= 1.5942 )
								if( atr2 <= 1.52862 )
									ret := -0.360262
								if( atr2 > 1.52862 )
									ret := 0.096154
							if( atr > 1.5942 )
								if( atr <= 1.95648 )
									ret := 0.358974
								if( atr > 1.95648 )
									ret := -0.444444
					if( up > 182.016 )
						if( dn1 <= 185.658 )
							if( up1 <= 182.434 )
								if( up1 <= 182.089 )
									ret := -0.722222 // sell
								if( up1 > 182.089 )
									ret := -0.894737 // sell
							if( up1 > 182.434 )
								ret := -0.090909
						if( dn1 > 185.658 )
							if( atr2 <= 0.429623 )
								if( up1 <= 184.619 )
									ret := -0.925926 // sell
								if( up1 > 184.619 )
									ret := -0.722222 // sell
							if( atr2 > 0.429623 )
								if( dn <= 187.431 )
									ret := -0.093750
								if( dn > 187.431 )
									ret := -0.442177
				if( dn > 192.373 )
					if( atr <= 1.19716 )
						if( dn1 <= 194.405 )
							if( dn1 <= 193.786 )
								if( up <= 188.383 )
									ret := -0.025641
								if( up > 188.383 )
									ret := -0.551724
							if( dn1 > 193.786 )
								if( atr <= 0.938799 )
									ret := 0.666667
								if( atr > 0.938799 )
									ret := -0.259259
						if( dn1 > 194.405 )
							if( atr <= 0.839424 )
								if( dn <= 198.751 )
									ret := -0.521277
								if( dn > 198.751 )
									ret := 0.291971
							if( atr > 0.839424 )
								if( atr2 <= 0.98974 )
									ret := -0.589474
								if( atr2 > 0.98974 )
									ret := -0.147059
					if( atr > 1.19716 )
						if( dn <= 207.318 )
							if( up1 <= 194.437 )
								if( dn1 <= 199.487 )
									ret := 0.229773
								if( dn1 > 199.487 )
									ret := -0.160920
							if( up1 > 194.437 )
								if( up1 <= 196.487 )
									ret := 0.744681 // buy
								if( up1 > 196.487 )
									ret := 0.047619
						if( dn > 207.318 )
							if( up1 <= 201.118 )
								if( dn1 <= 209.718 )
									ret := -0.756757 // sell
								if( dn1 > 209.718 )
									ret := 0.200000
							if( up1 > 201.118 )
								if( dn <= 209.445 )
									ret := -0.588235
								if( dn > 209.445 )
									ret := 0.909091 // buy
		if( up > 202.36 )
			if( atr2 <= 0.731663 )
				if( dn <= 214.134 )
					ret := 0.357143
				if( dn > 214.134 )
					if( atr2 <= 0.643162 )
						ret := 0.555556
					if( atr2 > 0.643162 )
						if( up1 <= 223.745 )
							if( dn <= 222.062 )
								ret := 0.909091 // buy
							if( dn > 222.062 )
								ret := 1.000000 // buy
						if( up1 > 223.745 )
							ret := 0.789474 // buy
			if( atr2 > 0.731663 )
				if( up <= 206.804 )
					if( dn1 <= 212.801 )
						if( atr <= 1.09589 )
							ret := 0.444444
						if( atr > 1.09589 )
							if( atr <= 1.20495 )
								ret := 0.961538 // buy
							if( atr > 1.20495 )
								ret := 0.736842 // buy
					if( dn1 > 212.801 )
						if( atr <= 1.76681 )
							if( dn <= 214.998 )
								if( atr <= 1.58732 )
									ret := 0.500000
								if( atr > 1.58732 )
									ret := 0.625000
							if( dn > 214.998 )
								ret := 0.055556
						if( atr > 1.76681 )
							if( dn1 <= 214.915 )
								ret := 0.437500
							if( dn1 > 214.915 )
								if( dn <= 215.526 )
									ret := 1.000000 // buy
								if( dn > 215.526 )
									ret := 0.909091 // buy
				if( up > 206.804 )
					if( dn <= 323.277 )
						if( dn1 <= 303.247 )
							if( dn <= 300.799 )
								if( atr2 <= 1.72912 )
									ret := 0.142722
								if( atr2 > 1.72912 )
									ret := -0.221172
							if( dn > 300.799 )
								if( up <= 292.95 )
									ret := 0.736264 // buy
								if( up > 292.95 )
									ret := 0.392857
						if( dn1 > 303.247 )
							if( dn1 <= 319.249 )
								if( atr2 <= 1.75262 )
									ret := -0.246398
								if( atr2 > 1.75262 )
									ret := 0.288557
							if( dn1 > 319.249 )
								if( dn1 <= 320.056 )
									ret := -0.888889 // sell
								if( dn1 > 320.056 )
									ret := -0.564516
					if( dn > 323.277 )
						if( atr <= 1.18646 )
							if( atr2 <= 1.1563 )
								if( up1 <= 435.811 )
									ret := -0.200000
								if( up1 > 435.811 )
									ret := 0.323232
							if( atr2 > 1.1563 )
								if( dn1 <= 425.873 )
									ret := 0.884058 // buy
								if( dn1 > 425.873 )
									ret := 0.243243
						if( atr > 1.18646 )
							if( up <= 329.447 )
								if( up1 <= 321.397 )
									ret := 0.465517
								if( up1 > 321.397 )
									ret := 0.840000 // buy
							if( up > 329.447 )
								if( dn <= 340.043 )
									ret := -1.000000 // sell
								if( dn > 340.043 )
									ret := 0.070876
	if( atr > 2.02879 )
		if( up <= 270.451 )
			if( atr <= 2.86258 )
				if( up <= 98.0324 )
					if( dn1 <= 105.578 )
						ret := 0.272727
					if( dn1 > 105.578 )
						if( atr <= 2.51948 )
							ret := -1.000000 // sell
						if( atr > 2.51948 )
							ret := -0.818182 // sell
				if( up > 98.0324 )
					if( up1 <= 108.479 )
						if( atr2 <= 2.87772 )
							if( up1 <= 105.478 )
								if( atr <= 2.60176 )
									ret := 1.000000 // buy
								if( atr > 2.60176 )
									ret := 0.875000 // buy
							if( up1 > 105.478 )
								if( up <= 107.238 )
									ret := 0.000000
								if( up > 107.238 )
									ret := 0.764706 // buy
						if( atr2 > 2.87772 )
							ret := -0.571429
					if( up1 > 108.479 )
						if( up1 <= 148.981 )
							if( dn1 <= 151.954 )
								if( dn1 <= 144.425 )
									ret := -0.388587
								if( dn1 > 144.425 )
									ret := 0.191667
							if( dn1 > 151.954 )
								if( up <= 140.431 )
									ret := -0.782609 // sell
								if( up > 140.431 )
									ret := -0.966667 // sell
						if( up1 > 148.981 )
							if( up <= 170.311 )
								if( atr2 <= 1.96803 )
									ret := 0.021739
								if( atr2 > 1.96803 )
									ret := 0.675439
							if( up > 170.311 )
								if( up1 <= 217.635 )
									ret := -0.284810
								if( up1 > 217.635 )
									ret := 0.022189
			if( atr > 2.86258 )
				if( dn1 <= 139.082 )
					if( dn1 <= 117.73 )
						if( up <= 94.1165 )
							ret := 0.916667 // buy
						if( up > 94.1165 )
							if( dn1 <= 117.052 )
								if( atr2 <= 3.06011 )
									ret := 0.000000
								if( atr2 > 3.06011 )
									ret := 0.454545
							if( dn1 > 117.052 )
								ret := 1.000000 // buy
					if( dn1 > 117.73 )
						if( dn1 <= 134.185 )
							if( up <= 106.939 )
								if( atr <= 4.07234 )
									ret := -0.672727
								if( atr > 4.07234 )
									ret := 0.400000
							if( up > 106.939 )
								if( atr2 <= 3.50255 )
									ret := 0.092105
								if( atr2 > 3.50255 )
									ret := 0.809524 // buy
						if( dn1 > 134.185 )
							if( atr <= 3.30618 )
								ret := 0.090909
							if( atr > 3.30618 )
								if( dn <= 134.407 )
									ret := -0.909091 // sell
								if( dn > 134.407 )
									ret := -1.000000 // sell
				if( dn1 > 139.082 )
					if( up1 <= 135.057 )
						if( atr2 <= 3.09587 )
							if( dn1 <= 151.961 )
								ret := 0.000000
							if( dn1 > 151.961 )
								ret := 1.000000 // buy
						if( atr2 > 3.09587 )
							if( dn1 <= 153.281 )
								if( dn <= 147.372 )
									ret := 0.950000 // buy
								if( dn > 147.372 )
									ret := 1.000000 // buy
							if( dn1 > 153.281 )
								ret := 0.769231 // buy
					if( up1 > 135.057 )
						if( up1 <= 165.582 )
							if( dn1 <= 161.952 )
								if( up1 <= 138.266 )
									ret := -0.111111
								if( up1 > 138.266 )
									ret := -0.827586 // sell
							if( dn1 > 161.952 )
								if( atr2 <= 3.53841 )
									ret := 0.636364
								if( atr2 > 3.53841 )
									ret := -0.600000
						if( up1 > 165.582 )
							if( dn <= 269.765 )
								if( buySignalInt <= 0.5 )
									ret := 0.728507 // buy
								if( buySignalInt > 0.5 )
									ret := 0.272727
							if( dn > 269.765 )
								if( dn <= 276.697 )
									ret := -0.010870
								if( dn > 276.697 )
									ret := 0.406452
		if( up > 270.451 )
			if( atr <= 14.8268 )
				if( up1 <= 285.593 )
					if( dn1 <= 303.726 )
						if( atr <= 3.41681 )
							if( up1 <= 272.568 )
								if( atr <= 2.7694 )
									ret := -0.326667
								if( atr > 2.7694 )
									ret := -0.716216 // sell
							if( up1 > 272.568 )
								if( dn1 <= 286.606 )
									ret := 0.480000
								if( dn1 > 286.606 )
									ret := -0.209414
						if( atr > 3.41681 )
							ret := 0.265625
					if( dn1 > 303.726 )
						if( up <= 280.342 )
							if( dn <= 309.83 )
								if( atr2 <= 6.00243 )
									ret := -0.555556
								if( atr2 > 6.00243 )
									ret := -0.300000
							if( dn > 309.83 )
								if( dn <= 311.423 )
									ret := 0.941176 // buy
								if( dn > 311.423 )
									ret := -0.217391
						if( up > 280.342 )
							if( dn1 <= 306.573 )
								if( atr <= 3.41936 )
									ret := -0.884615 // sell
								if( atr > 3.41936 )
									ret := -0.090909
							if( dn1 > 306.573 )
								if( atr <= 4.68729 )
									ret := -0.876712 // sell
								if( atr > 4.68729 )
									ret := -0.547619
				if( up1 > 285.593 )
					if( dn <= 618.887 )
						if( dn1 <= 322.196 )
							if( dn <= 315.493 )
								if( dn <= 314.385 )
									ret := 0.100000
								if( dn > 314.385 )
									ret := -0.449275
							if( dn > 315.493 )
								if( atr <= 4.49504 )
									ret := 0.209497
								if( atr > 4.49504 )
									ret := 0.982456 // buy
						if( dn1 > 322.196 )
							if( atr <= 2.17593 )
								if( atr2 <= 2.01557 )
									ret := -0.013534
								if( atr2 > 2.01557 )
									ret := 0.182292
							if( atr > 2.17593 )
								if( up <= 310.352 )
									ret := -0.327690
								if( up > 310.352 )
									ret := -0.029427
					if( dn > 618.887 )
						if( atr2 <= 2.12471 )
							if( up1 <= 643.549 )
								if( dn1 <= 647.056 )
									ret := -0.503226
								if( dn1 > 647.056 )
									ret := -1.000000 // sell
							if( up1 > 643.549 )
								if( up1 <= 649.35 )
									ret := 0.272727
								if( up1 > 649.35 )
									ret := -0.406250
						if( atr2 > 2.12471 )
							if( up1 <= 608.589 )
								if( dn <= 625.61 )
									ret := -0.171558
								if( dn > 625.61 )
									ret := -0.441667
							if( up1 > 608.589 )
								if( dn1 <= 829.636 )
									ret := -0.053715
								if( dn1 > 829.636 )
									ret := -0.317490
			if( atr > 14.8268 )
				if( up <= 609.325 )
					if( dn <= 684.333 )
						if( dn1 <= 605.037 )
							ret := 0.727273 // buy
						if( dn1 > 605.037 )
							ret := 0.187500
					if( dn > 684.333 )
						if( up <= 593.822 )
							ret := -0.900000 // sell
						if( up > 593.822 )
							ret := -1.000000 // sell
				if( up > 609.325 )
					if( atr <= 15.3728 )
						ret := 0.600000
					if( atr > 15.3728 )
						if( up <= 729.168 )
							ret := 1.000000 // buy
						if( up > 729.168 )
							ret := 0.454545
	
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
float op_operation = decision_tree_0_HUBS_15Min_dfc0cc31(dn1, trend, atr, atr2, buySignalInt, sellSignalInt, up1, up, dn)

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


