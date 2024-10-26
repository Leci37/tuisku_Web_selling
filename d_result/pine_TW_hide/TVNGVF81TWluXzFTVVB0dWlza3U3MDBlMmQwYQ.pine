//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: SuperTrend
// ID_model: MSFT_5Min_1SUP_700e2d0a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_5Min_1SUP_700e2d0a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_5Min_700e2d0a(dn1, trend, atr, atr2, buySignalInt, sellSignalInt, up1, up, dn)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( atr <= 0.746974 )
		if( atr <= 0.646133 )
			if( trend <= -0.515353 )
				if( atr2 <= 0.257256 )
					if( atr2 <= 0.235999 )
						if( dn <= 370.63 )
							if( up <= 324.908 )
								ret := 0.150000
							if( up > 324.908 )
								ret := -0.357143
						if( dn > 370.63 )
							if( up <= 381.649 )
								if( up <= 376.012 )
									ret := 0.600000
								if( up > 376.012 )
									ret := 1.000000 // buy
							if( up > 381.649 )
								if( up <= 400.44 )
									ret := -0.454545
								if( up > 400.44 )
									ret := 0.085106
					if( atr2 > 0.235999 )
						if( up1 <= 351.309 )
							ret := -0.090909
						if( up1 > 351.309 )
							if( atr <= 0.306692 )
								if( up1 <= 415.095 )
									ret := -0.571429
								if( up1 > 415.095 )
									ret := -0.200000
							if( atr > 0.306692 )
								ret := -1.000000 // sell
				if( atr2 > 0.257256 )
					if( atr <= 0.354477 )
						if( up1 <= 425.849 )
							if( up <= 412.723 )
								if( atr2 <= 0.270565 )
									ret := 0.571429
								if( atr2 > 0.270565 )
									ret := -0.071429
							if( up > 412.723 )
								ret := -0.666667
						if( up1 > 425.849 )
							ret := 0.562500
					if( atr > 0.354477 )
						if( up1 <= 375.531 )
							if( dn1 <= 370.206 )
								if( up1 <= 334.109 )
									ret := 0.734694 // buy
								if( up1 > 334.109 )
									ret := 0.121951
							if( dn1 > 370.206 )
								ret := -0.733333 // sell
						if( up1 > 375.531 )
							if( up1 <= 412.894 )
								if( dn1 <= 409.754 )
									ret := 0.846154 // buy
								if( dn1 > 409.754 )
									ret := 0.051282
							if( up1 > 412.894 )
								if( atr2 <= 0.33164 )
									ret := 0.711111 // buy
								if( atr2 > 0.33164 )
									ret := 0.848485 // buy
			if( trend > -0.515353 )
				if( dn1 <= 410.27 )
					if( dn1 <= 395.708 )
						if( dn1 <= 390.24 )
							if( up1 <= 385.706 )
								if( up1 <= 383.589 )
									ret := 0.009273
								if( up1 > 383.589 )
									ret := -0.579832
							if( up1 > 385.706 )
								if( up1 <= 386.953 )
									ret := 0.702381 // buy
								if( up1 > 386.953 )
									ret := 0.273438
						if( dn1 > 390.24 )
							if( dn <= 392.181 )
								ret := -0.352159
							if( dn > 392.181 )
								if( dn <= 394.056 )
									ret := 0.343750
								if( dn > 394.056 )
									ret := -0.318182
					if( dn1 > 395.708 )
						if( dn <= 397.496 )
							if( dn1 <= 397.693 )
								if( atr2 <= 0.133548 )
									ret := 0.080000
								if( atr2 > 0.133548 )
									ret := 0.570492
							if( dn1 > 397.693 )
								ret := -0.083333
						if( dn > 397.496 )
							if( dn1 <= 398.642 )
								if( dn1 <= 398.41 )
									ret := -0.053279
								if( dn1 > 398.41 )
									ret := -0.648148
							if( dn1 > 398.642 )
								if( up1 <= 407.158 )
									ret := 0.070699
								if( up1 > 407.158 )
									ret := -0.114990
				if( dn1 > 410.27 )
					if( up <= 463.676 )
						if( up1 <= 463.123 )
							if( dn1 <= 410.439 )
								if( atr2 <= 0.667006 )
									ret := -0.320388
								if( atr2 > 0.667006 )
									ret := -1.000000 // sell
							if( dn1 > 410.439 )
								if( atr <= 0.625911 )
									ret := -0.033190
								if( atr > 0.625911 )
									ret := 0.125000
						if( up1 > 463.123 )
							if( up <= 463.556 )
								ret := -1.000000 // sell
							if( up > 463.556 )
								ret := -0.900000 // sell
					if( up > 463.676 )
						if( up1 <= 464.303 )
							if( dn1 <= 466.244 )
								ret := 1.000000 // buy
							if( dn1 > 466.244 )
								ret := 0.444444
						if( up1 > 464.303 )
							if( dn1 <= 468.006 )
								if( dn <= 467.581 )
									ret := -0.035294
								if( dn > 467.581 )
									ret := 0.710145 // buy
							if( dn1 > 468.006 )
								if( up1 <= 466.41 )
									ret := 0.000000
								if( up1 > 466.41 )
									ret := -0.290323
		if( atr > 0.646133 )
			if( trend <= -0.195846 )
				if( up1 <= 346.799 )
					ret := 1.000000 // buy
				if( up1 > 346.799 )
					if( up <= 412.108 )
						if( dn1 <= 406.675 )
							ret := 0.833333 // buy
						if( dn1 > 406.675 )
							ret := 0.272727
					if( up > 412.108 )
						if( atr <= 0.708076 )
							ret := 1.000000 // buy
						if( atr > 0.708076 )
							ret := 0.785714 // buy
			if( trend > -0.195846 )
				if( dn1 <= 438.15 )
					if( up1 <= 328.636 )
						if( up1 <= 328.489 )
							if( atr2 <= 0.82134 )
								if( atr <= 0.652074 )
									ret := -0.227273
								if( atr > 0.652074 )
									ret := 0.196223
							if( atr2 > 0.82134 )
								if( up1 <= 324.351 )
									ret := -0.065217
								if( up1 > 324.351 )
									ret := -0.772727 // sell
						if( up1 > 328.489 )
							ret := 1.000000 // buy
					if( up1 > 328.636 )
						if( up1 <= 347.613 )
							if( up <= 335.852 )
								if( up <= 335.462 )
									ret := -0.156164
								if( up > 335.462 )
									ret := 0.641026
							if( up > 335.852 )
								if( up1 <= 346.384 )
									ret := -0.399293
								if( up1 > 346.384 )
									ret := -0.879310 // sell
						if( up1 > 347.613 )
							if( up <= 367.096 )
								if( atr <= 0.677846 )
									ret := 0.070175
								if( atr > 0.677846 )
									ret := 0.482301
							if( up > 367.096 )
								if( up <= 399.747 )
									ret := -0.086495
								if( up > 399.747 )
									ret := 0.122332
				if( dn1 > 438.15 )
					if( dn <= 466.202 )
						if( up1 <= 452.444 )
							if( dn1 <= 453.085 )
								if( up1 <= 443.194 )
									ret := 0.558140
								if( up1 > 443.194 )
									ret := -0.161290
							if( dn1 > 453.085 )
								if( dn1 <= 454.664 )
									ret := 0.920000 // buy
								if( dn1 > 454.664 )
									ret := 0.531250
						if( up1 > 452.444 )
							if( dn <= 457.167 )
								if( dn1 <= 457.027 )
									ret := -0.294118
								if( dn1 > 457.027 )
									ret := -0.739130 // sell
							if( dn > 457.167 )
								if( up1 <= 456.435 )
									ret := 0.162162
								if( up1 > 456.435 )
									ret := 0.591837
					if( dn > 466.202 )
						if( up1 <= 463.725 )
							ret := -0.952381 // sell
						if( up1 > 463.725 )
							if( atr2 <= 0.646238 )
								ret := -1.000000 // sell
							if( atr2 > 0.646238 )
								ret := -0.266667
	if( atr > 0.746974 )
		if( dn1 <= 304.889 )
			if( up1 <= 283.295 )
				if( up1 <= 277.313 )
					if( up1 <= 276.615 )
						ret := -0.066667
					if( up1 > 276.615 )
						if( dn <= 281.405 )
							ret := 1.000000 // buy
						if( dn > 281.405 )
							ret := 0.875000 // buy
				if( up1 > 277.313 )
					if( atr <= 1.64755 )
						if( up <= 280.544 )
							ret := -1.000000 // sell
						if( up > 280.544 )
							if( up <= 281.714 )
								ret := 0.500000
							if( up > 281.714 )
								ret := -0.846154 // sell
					if( atr > 1.64755 )
						ret := 0.666667
			if( up1 > 283.295 )
				if( up <= 290.916 )
					ret := 1.000000 // buy
				if( up > 290.916 )
					if( atr2 <= 0.729031 )
						if( dn1 <= 299.378 )
							ret := 1.000000 // buy
						if( dn1 > 299.378 )
							ret := -0.818182 // sell
					if( atr2 > 0.729031 )
						if( up <= 293.192 )
							ret := 0.133333
						if( up > 293.192 )
							if( up <= 296.384 )
								if( up1 <= 293.406 )
									ret := 1.000000 // buy
								if( up1 > 293.406 )
									ret := 0.396825
							if( up > 296.384 )
								ret := 1.000000 // buy
		if( dn1 > 304.889 )
			if( atr2 <= 0.78055 )
				if( trend <= -0.984167 )
					if( dn1 <= 417.93 )
						if( dn1 <= 411.668 )
							if( dn <= 335.217 )
								ret := 1.000000 // buy
							if( dn > 335.217 )
								if( dn <= 405.107 )
									ret := -0.062500
								if( dn > 405.107 )
									ret := -0.307692
						if( dn1 > 411.668 )
							ret := 0.900000 // buy
					if( dn1 > 417.93 )
						if( dn <= 421.663 )
							ret := -1.000000 // sell
						if( dn > 421.663 )
							ret := 0.222222
				if( trend > -0.984167 )
					if( up <= 332.335 )
						if( dn1 <= 324.424 )
							if( atr <= 0.886726 )
								if( atr2 <= 0.686546 )
									ret := 0.202381
								if( atr2 > 0.686546 )
									ret := -0.317073
							if( atr > 0.886726 )
								ret := 0.750000 // buy
						if( dn1 > 324.424 )
							if( dn1 <= 331.883 )
								if( dn <= 327.321 )
									ret := 0.052632
								if( dn > 327.321 )
									ret := 0.400000
							if( dn1 > 331.883 )
								if( dn1 <= 334.591 )
									ret := -0.328767
								if( dn1 > 334.591 )
									ret := 0.288136
					if( up > 332.335 )
						if( up1 <= 416.404 )
							if( dn1 <= 411.058 )
								if( up <= 374.999 )
									ret := -0.387826
								if( up > 374.999 )
									ret := -0.020747
							if( dn1 > 411.058 )
								if( atr2 <= 0.700041 )
									ret := -0.256250
								if( atr2 > 0.700041 )
									ret := -0.542416
						if( up1 > 416.404 )
							if( dn <= 455.544 )
								if( dn1 <= 435.781 )
									ret := -0.044888
								if( dn1 > 435.781 )
									ret := 0.313901
							if( dn > 455.544 )
								if( up <= 457.857 )
									ret := -0.813559 // sell
								if( up > 457.857 )
									ret := 0.000000
			if( atr2 > 0.78055 )
				if( dn1 <= 346.615 )
					if( up1 <= 336.435 )
						if( up1 <= 336.042 )
							if( dn <= 342.882 )
								if( atr2 <= 1.08592 )
									ret := -0.103308
								if( atr2 > 1.08592 )
									ret := 0.020654
							if( dn > 342.882 )
								if( up1 <= 333.408 )
									ret := -0.642857
								if( up1 > 333.408 )
									ret := -0.966667 // sell
						if( up1 > 336.042 )
							if( dn <= 341.014 )
								ret := 0.400000
							if( dn > 341.014 )
								if( up1 <= 336.37 )
									ret := 0.909091 // buy
								if( up1 > 336.37 )
									ret := 0.461538
					if( up1 > 336.435 )
						if( up1 <= 338.864 )
							if( dn <= 341.282 )
								ret := 0.666667
							if( dn > 341.282 )
								if( up <= 338.397 )
									ret := -0.752852 // sell
								if( up > 338.397 )
									ret := -0.272727
						if( up1 > 338.864 )
							if( up <= 340.567 )
								ret := 0.200000
							if( up > 340.567 )
								ret := 0.642857
				if( dn1 > 346.615 )
					if( dn <= 347.905 )
						if( dn <= 347.254 )
							if( atr2 <= 0.998694 )
								if( atr2 <= 0.963378 )
									ret := 1.000000 // buy
								if( atr2 > 0.963378 )
									ret := 0.888889 // buy
							if( atr2 > 0.998694 )
								ret := 1.000000 // buy
						if( dn > 347.254 )
							if( atr2 <= 0.972402 )
								if( dn <= 347.626 )
									ret := -0.421053
								if( dn > 347.626 )
									ret := 1.000000 // buy
							if( atr2 > 0.972402 )
								if( dn1 <= 348.022 )
									ret := 0.863636 // buy
								if( dn1 > 348.022 )
									ret := 0.250000
					if( dn > 347.905 )
						if( dn <= 422.319 )
							if( dn <= 365.736 )
								if( dn <= 353.666 )
									ret := 0.043738
								if( dn > 353.666 )
									ret := -0.398374
							if( dn > 365.736 )
								if( dn1 <= 369.159 )
									ret := 0.905405 // buy
								if( dn1 > 369.159 )
									ret := 0.013823
						if( dn > 422.319 )
							if( dn <= 425.462 )
								if( atr2 <= 1.42116 )
									ret := -0.463768
								if( atr2 > 1.42116 )
									ret := 0.030303
							if( dn > 425.462 )
								if( up1 <= 411.321 )
									ret := -0.607143
								if( up1 > 411.321 )
									ret := -0.047469
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_MSFT_5Min_700e2d0a(dn1, trend, atr, atr2, buySignalInt, sellSignalInt, up1, up, dn)

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


