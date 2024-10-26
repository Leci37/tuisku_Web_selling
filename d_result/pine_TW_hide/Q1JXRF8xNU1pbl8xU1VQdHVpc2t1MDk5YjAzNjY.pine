//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: SuperTrend
// ID_model: CRWD_15Min_1SUP_099b0366 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_15Min_1SUP_099b0366", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_15Min_099b0366(dn1, trend, atr, atr2, buySignalInt, sellSignalInt, up1, up, dn)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( up1 <= 140.734 )
		if( atr <= 1.26842 )
			if( dn <= 53.4191 )
				if( up1 <= 48.7349 )
					if( up <= 47.8768 )
						if( dn <= 48.524 )
							if( up <= 31.487 )
								if( up <= 31.2619 )
									ret := 0.875000 // buy
								if( up > 31.2619 )
									ret := 1.000000 // buy
							if( up > 31.487 )
								if( up <= 43.9709 )
									ret := -0.024752
								if( up > 43.9709 )
									ret := 0.205788
						if( dn > 48.524 )
							if( up <= 45.2916 )
								if( dn <= 48.8059 )
									ret := -0.750000 // sell
								if( dn > 48.8059 )
									ret := 0.948718 // buy
							if( up > 45.2916 )
								if( atr2 <= 1.21385 )
									ret := -0.155989
								if( atr2 > 1.21385 )
									ret := -0.958333 // sell
					if( up > 47.8768 )
						if( dn <= 50.7838 )
							if( atr <= 0.196166 )
								if( up1 <= 48.4646 )
									ret := 0.800000 // buy
								if( up1 > 48.4646 )
									ret := 0.000000
							if( atr > 0.196166 )
								if( atr <= 0.346253 )
									ret := 0.303371
								if( atr > 0.346253 )
									ret := 0.618421
						if( dn > 50.7838 )
							if( up1 <= 47.9466 )
								if( atr2 <= 0.66244 )
									ret := 0.428571
								if( atr2 > 0.66244 )
									ret := -0.916667 // sell
							if( up1 > 47.9466 )
								if( atr <= 0.538746 )
									ret := -0.072727
								if( atr > 0.538746 )
									ret := 0.823529 // buy
				if( up1 > 48.7349 )
					if( atr <= 0.61322 )
						if( dn1 <= 52.1039 )
							if( atr2 <= 0.379331 )
								if( atr2 <= 0.239868 )
									ret := -0.430712
								if( atr2 > 0.239868 )
									ret := -0.032258
							if( atr2 > 0.379331 )
								if( atr <= 0.335164 )
									ret := 0.000000
								if( atr > 0.335164 )
									ret := -0.786885 // sell
						if( dn1 > 52.1039 )
							if( dn <= 52.5934 )
								if( dn <= 52.1326 )
									ret := -0.285714
								if( dn > 52.1326 )
									ret := 0.468085
							if( dn > 52.5934 )
								if( up <= 50.6166 )
									ret := -0.700000 // sell
								if( up > 50.6166 )
									ret := 0.269231
					if( atr > 0.61322 )
						if( dn1 <= 53.2439 )
							ret := -0.250000
						if( dn1 > 53.2439 )
							if( up1 <= 49.4733 )
								ret := 0.200000
							if( up1 > 49.4733 )
								ret := 1.000000 // buy
			if( dn > 53.4191 )
				if( up <= 53.2204 )
					if( atr2 <= 0.47109 )
						if( up <= 51.2127 )
							if( up1 <= 51.1056 )
								if( up <= 50.9836 )
									ret := -0.142857
								if( up > 50.9836 )
									ret := 1.000000 // buy
							if( up1 > 51.1056 )
								ret := -1.000000 // sell
						if( up > 51.2127 )
							if( atr <= 0.410198 )
								if( dn <= 54.4173 )
									ret := 0.866667 // buy
								if( dn > 54.4173 )
									ret := 0.071429
							if( atr > 0.410198 )
								if( dn1 <= 56.032 )
									ret := 0.966102 // buy
								if( dn1 > 56.032 )
									ret := 0.846154 // buy
					if( atr2 > 0.47109 )
						if( atr <= 0.67239 )
							if( dn <= 55.481 )
								if( up1 <= 51.4735 )
									ret := 0.029412
								if( up1 > 51.4735 )
									ret := -0.660714
							if( dn > 55.481 )
								if( atr2 <= 0.74534 )
									ret := 0.378788
								if( atr2 > 0.74534 )
									ret := -1.000000 // sell
						if( atr > 0.67239 )
							if( dn <= 57.4617 )
								if( dn <= 56.9207 )
									ret := 0.411458
								if( dn > 56.9207 )
									ret := -0.340909
							if( dn > 57.4617 )
								if( dn1 <= 59.0317 )
									ret := 0.866667 // buy
								if( dn1 > 59.0317 )
									ret := -0.500000
				if( up > 53.2204 )
					if( dn <= 146.728 )
						if( dn <= 62.2932 )
							if( up <= 55.6808 )
								if( up1 <= 55.0753 )
									ret := 0.019625
								if( up1 > 55.0753 )
									ret := 0.398406
							if( up > 55.6808 )
								if( up1 <= 56.1619 )
									ret := -0.335277
								if( up1 > 56.1619 )
									ret := 0.041693
						if( dn > 62.2932 )
							if( up <= 58.7955 )
								if( atr2 <= 1.2977 )
									ret := 0.772152 // buy
								if( atr2 > 1.2977 )
									ret := -0.250000
							if( up > 58.7955 )
								if( dn <= 96.5115 )
									ret := 0.108141
								if( dn > 96.5115 )
									ret := 0.054917
					if( dn > 146.728 )
						if( atr2 <= 1.09277 )
							if( up1 <= 140.597 )
								ret := 0.000000
							if( up1 > 140.597 )
								ret := 0.500000
						if( atr2 > 1.09277 )
							if( dn1 <= 147.857 )
								if( atr2 <= 1.34003 )
									ret := 0.909091 // buy
								if( atr2 > 1.34003 )
									ret := 0.000000
							if( dn1 > 147.857 )
								if( atr <= 1.17908 )
									ret := 0.600000
								if( atr > 1.17908 )
									ret := 1.000000 // buy
		if( atr > 1.26842 )
			if( dn <= 64.4927 )
				if( dn1 <= 56.337 )
					if( dn <= 51.8136 )
						if( dn <= 45.1379 )
							if( dn <= 43.771 )
								if( dn <= 42.2352 )
									ret := 1.000000 // buy
								if( dn > 42.2352 )
									ret := 0.250000
							if( dn > 43.771 )
								ret := -1.000000 // sell
						if( dn > 45.1379 )
							if( up <= 38.0251 )
								ret := 0.500000
							if( up > 38.0251 )
								ret := 1.000000 // buy
					if( dn > 51.8136 )
						if( atr <= 1.49297 )
							if( atr2 <= 1.32453 )
								ret := -0.500000
							if( atr2 > 1.32453 )
								ret := -0.800000 // sell
						if( atr > 1.49297 )
							if( dn <= 54.203 )
								ret := -0.750000 // sell
							if( dn > 54.203 )
								ret := 0.600000
				if( dn1 > 56.337 )
					if( atr <= 1.62355 )
						ret := 1.000000 // buy
					if( atr > 1.62355 )
						if( dn <= 57.0819 )
							ret := 1.000000 // buy
						if( dn > 57.0819 )
							ret := 0.428571
			if( dn > 64.4927 )
				if( up1 <= 56.172 )
					ret := -1.000000 // sell
				if( up1 > 56.172 )
					if( dn <= 149.375 )
						if( dn <= 69.2938 )
							if( atr <= 1.6878 )
								if( up <= 61.0086 )
									ret := 1.000000 // buy
								if( up > 61.0086 )
									ret := 0.750000 // buy
							if( atr > 1.6878 )
								ret := -0.500000
						if( dn > 69.2938 )
							if( up1 <= 61.3322 )
								if( up <= 58.4443 )
									ret := -0.500000
								if( up > 58.4443 )
									ret := -0.928571 // sell
							if( up1 > 61.3322 )
								if( up1 <= 129.631 )
									ret := 0.137053
								if( up1 > 129.631 )
									ret := 0.311424
					if( dn > 149.375 )
						if( atr2 <= 2.79866 )
							if( dn1 <= 150.558 )
								if( up <= 136.312 )
									ret := -1.000000 // sell
								if( up > 136.312 )
									ret := -0.625000
							if( dn1 > 150.558 )
								if( dn <= 153.739 )
									ret := 0.050000
								if( dn > 153.739 )
									ret := 0.650000
						if( atr2 > 2.79866 )
							if( up <= 138.312 )
								if( up <= 121.693 )
									ret := -1.000000 // sell
								if( up > 121.693 )
									ret := 0.181818
							if( up > 138.312 )
								if( up1 <= 140.14 )
									ret := -0.777778 // sell
								if( up1 > 140.14 )
									ret := 0.142857
	if( up1 > 140.734 )
		if( trend <= 0.795465 )
			if( up <= 343.082 )
				if( atr <= 3.72967 )
					if( dn1 <= 336.379 )
						if( atr2 <= 0.952718 )
							if( dn <= 144.207 )
								if( dn1 <= 144.127 )
									ret := 0.000000
								if( dn1 > 144.127 )
									ret := -1.000000 // sell
							if( dn > 144.207 )
								if( dn1 <= 155.238 )
									ret := 0.732143 // buy
								if( dn1 > 155.238 )
									ret := 0.313070
						if( atr2 > 0.952718 )
							if( atr <= 1.26085 )
								if( dn <= 177.992 )
									ret := -1.000000 // sell
								if( dn > 177.992 )
									ret := -0.266667
							if( atr > 1.26085 )
								if( trend <= 0.146359 )
									ret := 0.100457
								if( trend > 0.146359 )
									ret := 0.760000 // buy
					if( dn1 > 336.379 )
						if( dn1 <= 346.518 )
							ret := 1.000000 // buy
						if( dn1 > 346.518 )
							ret := 0.750000 // buy
				if( atr > 3.72967 )
					if( atr2 <= 3.15505 )
						ret := -1.000000 // sell
					if( atr2 > 3.15505 )
						ret := -0.250000
			if( up > 343.082 )
				if( trend <= 0.024999 )
					if( atr2 <= 2.34891 )
						if( atr <= 1.48276 )
							if( atr <= 1.17394 )
								ret := -0.250000
							if( atr > 1.17394 )
								ret := 0.600000
						if( atr > 1.48276 )
							if( atr <= 1.80569 )
								ret := -1.000000 // sell
							if( atr > 1.80569 )
								if( up1 <= 382.911 )
									ret := -0.500000
								if( up1 > 382.911 )
									ret := 0.500000
					if( atr2 > 2.34891 )
						ret := -0.833333 // sell
				if( trend > 0.024999 )
					ret := -1.000000 // sell
		if( trend > 0.795465 )
			if( atr2 <= 1.04638 )
				if( up1 <= 146.138 )
					if( dn <= 147.822 )
						if( up1 <= 145.32 )
							if( dn1 <= 143.174 )
								if( atr2 <= 0.251176 )
									ret := -0.500000
								if( atr2 > 0.251176 )
									ret := -0.923077 // sell
							if( dn1 > 143.174 )
								if( dn1 <= 146.694 )
									ret := 0.108818
								if( dn1 > 146.694 )
									ret := -0.071942
						if( up1 > 145.32 )
							if( dn1 <= 147.536 )
								if( dn1 <= 147.187 )
									ret := 0.833333 // buy
								if( dn1 > 147.187 )
									ret := 0.066667
							if( dn1 > 147.536 )
								if( dn1 <= 147.878 )
									ret := 0.904762 // buy
								if( dn1 > 147.878 )
									ret := 0.500000
					if( dn > 147.822 )
						if( dn1 <= 150.311 )
							if( dn1 <= 149.217 )
								if( dn1 <= 148.821 )
									ret := -0.175355
								if( dn1 > 148.821 )
									ret := -0.570248
							if( dn1 > 149.217 )
								if( up <= 143.664 )
									ret := -0.560000
								if( up > 143.664 )
									ret := 0.235714
						if( dn1 > 150.311 )
							if( dn1 <= 152.53 )
								if( dn <= 150.881 )
									ret := -0.634615
								if( dn > 150.881 )
									ret := -0.333333
							if( dn1 > 152.53 )
								ret := 0.571429
				if( up1 > 146.138 )
					if( up1 <= 148.024 )
						if( atr <= 0.526002 )
							if( dn <= 149.926 )
								if( up1 <= 147.564 )
									ret := -0.032258
								if( up1 > 147.564 )
									ret := 0.823529 // buy
							if( dn > 149.926 )
								if( up <= 148.029 )
									ret := -0.454545
								if( up > 148.029 )
									ret := 0.000000
						if( atr > 0.526002 )
							if( up1 <= 147.955 )
								if( atr <= 1.01446 )
									ret := 0.241026
								if( atr > 1.01446 )
									ret := 0.794872 // buy
							if( up1 > 147.955 )
								if( up <= 148.359 )
									ret := 0.913043 // buy
								if( up > 148.359 )
									ret := 0.000000
					if( up1 > 148.024 )
						if( atr <= 0.733056 )
							if( atr2 <= 0.713403 )
								if( up <= 299.122 )
									ret := 0.062808
								if( up > 299.122 )
									ret := -0.066937
							if( atr2 > 0.713403 )
								if( dn1 <= 209.48 )
									ret := 0.382504
								if( dn1 > 209.48 )
									ret := 0.057269
						if( atr > 0.733056 )
							if( atr2 <= 0.788482 )
								if( dn1 <= 256.356 )
									ret := -0.057477
								if( dn1 > 256.356 )
									ret := 0.098266
							if( atr2 > 0.788482 )
								if( up1 <= 148.553 )
									ret := -0.371429
								if( up1 > 148.553 )
									ret := 0.063330
			if( atr2 > 1.04638 )
				if( up1 <= 313.852 )
					if( up1 <= 305.778 )
						if( atr2 <= 1.5024 )
							if( up <= 179.671 )
								if( dn <= 177.199 )
									ret := -0.043332
								if( dn > 177.199 )
									ret := -0.241935
							if( up > 179.671 )
								if( dn1 <= 191.895 )
									ret := 0.223325
								if( dn1 > 191.895 )
									ret := -0.019875
						if( atr2 > 1.5024 )
							if( dn <= 240.099 )
								if( dn1 <= 237.475 )
									ret := 0.064085
								if( dn1 > 237.475 )
									ret := 0.374486
							if( dn > 240.099 )
								if( atr <= 9.77079 )
									ret := -0.065653
								if( atr > 9.77079 )
									ret := 0.653061
					if( up1 > 305.778 )
						if( atr <= 1.83262 )
							if( dn <= 314.322 )
								if( up <= 308.018 )
									ret := 0.525000
								if( up > 308.018 )
									ret := -0.750000 // sell
							if( dn > 314.322 )
								if( dn <= 319.332 )
									ret := -0.041667
								if( dn > 319.332 )
									ret := 0.190476
						if( atr > 1.83262 )
							if( atr2 <= 2.80787 )
								if( dn <= 328.313 )
									ret := 0.524324
								if( dn > 328.313 )
									ret := -0.333333
							if( atr2 > 2.80787 )
								if( dn <= 339.244 )
									ret := -0.205882
								if( dn > 339.244 )
									ret := 0.941176 // buy
				if( up1 > 313.852 )
					if( up1 <= 320.276 )
						if( up1 <= 317.412 )
							if( atr2 <= 4.97284 )
								if( dn <= 320.279 )
									ret := 0.666667
								if( dn > 320.279 )
									ret := -0.134328
							if( atr2 > 4.97284 )
								ret := 1.000000 // buy
						if( up1 > 317.412 )
							if( dn1 <= 326.355 )
								if( atr <= 1.08485 )
									ret := 0.111111
								if( atr > 1.08485 )
									ret := -0.741935 // sell
							if( dn1 > 326.355 )
								if( dn <= 330.973 )
									ret := -0.192308
								if( dn > 330.973 )
									ret := -0.571429
					if( up1 > 320.276 )
						if( atr <= 3.06587 )
							if( dn1 <= 396.688 )
								if( up <= 344.87 )
									ret := 0.124805
								if( up > 344.87 )
									ret := -0.069829
							if( dn1 > 396.688 )
								if( dn <= 397.243 )
									ret := -0.500000
								if( dn > 397.243 )
									ret := -1.000000 // sell
						if( atr > 3.06587 )
							if( up <= 356.908 )
								if( up1 <= 330.937 )
									ret := -0.272727
								if( up1 > 330.937 )
									ret := -0.819672 // sell
							if( up > 356.908 )
								if( dn1 <= 381.557 )
									ret := 0.647059
								if( dn1 > 381.557 )
									ret := -0.333333
	
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
float op_operation = decision_tree_0_CRWD_15Min_099b0366(dn1, trend, atr, atr2, buySignalInt, sellSignalInt, up1, up, dn)

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


