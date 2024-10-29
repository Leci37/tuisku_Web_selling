//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: SuperTrend
// ID_model: ETSY_15Min_1SUP_89bf0342 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETSY_15Min_1SUP_89bf0342", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETSY_15Min_89bf0342(dn1, trend, atr, atr2, buySignalInt, sellSignalInt, up1, up, dn)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( dn1 <= 223.696 )
		if( up <= 169.874 )
			if( sellSignalInt <= 0.5 )
				if( dn <= 43.0282 )
					if( atr <= 0.455131 )
						if( trend <= 0.656898 )
							if( up <= 21.2345 )
								ret := 1.000000 // buy
							if( up > 21.2345 )
								ret := 0.333333
						if( trend > 0.656898 )
							if( atr2 <= 0.050134 )
								if( up <= 11.4858 )
									ret := 0.014241
								if( up > 11.4858 )
									ret := 0.161473
							if( atr2 > 0.050134 )
								if( atr <= 0.41981 )
									ret := 0.022422
								if( atr > 0.41981 )
									ret := -0.357143
					if( atr > 0.455131 )
						if( up1 <= 32.2278 )
							if( up <= 31.8703 )
								if( up1 <= 30.0763 )
									ret := -0.028571
								if( up1 > 30.0763 )
									ret := 0.535211
							if( up > 31.8703 )
								if( dn <= 35.5658 )
									ret := 0.000000
								if( dn > 35.5658 )
									ret := -0.791667 // sell
						if( up1 > 32.2278 )
							if( dn1 <= 39.7487 )
								if( atr <= 0.656203 )
									ret := 0.117647
								if( atr > 0.656203 )
									ret := 0.834646 // buy
							if( dn1 > 39.7487 )
								if( dn <= 42.4128 )
									ret := 0.069124
								if( dn > 42.4128 )
									ret := 0.637681
				if( dn > 43.0282 )
					if( dn <= 45.9637 )
						if( dn <= 45.4975 )
							if( atr <= 0.66957 )
								if( atr <= 0.471611 )
									ret := -0.094062
								if( atr > 0.471611 )
									ret := -0.358209
							if( atr > 0.66957 )
								if( dn <= 44.3892 )
									ret := 0.669811
								if( dn > 44.3892 )
									ret := -0.124031
						if( dn > 45.4975 )
							if( atr2 <= 0.204108 )
								if( atr2 <= 0.185706 )
									ret := -0.500000
								if( atr2 > 0.185706 )
									ret := -0.937500 // sell
							if( atr2 > 0.204108 )
								if( atr2 <= 0.22301 )
									ret := 0.447368
								if( atr2 > 0.22301 )
									ret := -0.371681
					if( dn > 45.9637 )
						if( up <= 142.12 )
							if( dn1 <= 151.397 )
								if( atr2 <= 0.133852 )
									ret := 0.201070
								if( atr2 > 0.133852 )
									ret := -0.008332
							if( dn1 > 151.397 )
								if( up1 <= 140.083 )
									ret := 0.596330
								if( up1 > 140.083 )
									ret := 0.083333
						if( up > 142.12 )
							if( atr2 <= 0.598354 )
								if( up <= 155.271 )
									ret := -0.251656
								if( up > 155.271 )
									ret := 0.281008
							if( atr2 > 0.598354 )
								if( up1 <= 150.237 )
									ret := -0.214183
								if( up1 > 150.237 )
									ret := -0.056118
			if( sellSignalInt > 0.5 )
				if( up <= 47.6118 )
					if( up <= 43.3553 )
						if( atr2 <= 0.272715 )
							if( up <= 42.5134 )
								if( up1 <= 12.607 )
									ret := 0.333333
								if( up1 > 12.607 )
									ret := 0.780702 // buy
							if( up > 42.5134 )
								ret := 0.125000
						if( atr2 > 0.272715 )
							if( up <= 39.7485 )
								ret := 0.545455
							if( up > 39.7485 )
								ret := -0.666667
					if( up > 43.3553 )
						if( atr2 <= 0.16583 )
							ret := 0.454545
						if( atr2 > 0.16583 )
							if( atr <= 0.374379 )
								ret := 1.000000 // buy
							if( atr > 0.374379 )
								ret := 0.722222 // buy
				if( up > 47.6118 )
					if( dn <= 50.5152 )
						ret := -0.642857
					if( dn > 50.5152 )
						if( up <= 49.7865 )
							if( atr <= 0.482189 )
								ret := 1.000000 // buy
							if( atr > 0.482189 )
								ret := 0.909091 // buy
						if( up > 49.7865 )
							if( up1 <= 50.5432 )
								ret := -0.733333 // sell
							if( up1 > 50.5432 )
								if( dn <= 55.2157 )
									ret := 0.753425 // buy
								if( dn > 55.2157 )
									ret := 0.297837
		if( up > 169.874 )
			if( dn1 <= 185.545 )
				if( dn1 <= 184.57 )
					if( up <= 170.747 )
						if( up1 <= 170.306 )
							if( atr2 <= 0.723437 )
								if( up <= 170.184 )
									ret := 0.214286
								if( up > 170.184 )
									ret := 0.789474 // buy
							if( atr2 > 0.723437 )
								if( up <= 170.498 )
									ret := 0.859649 // buy
								if( up > 170.498 )
									ret := 0.611111
						if( up1 > 170.306 )
							if( dn1 <= 174.417 )
								ret := 0.888889 // buy
							if( dn1 > 174.417 )
								ret := -0.411765
					if( up > 170.747 )
						if( up1 <= 179.622 )
							if( up1 <= 177.252 )
								if( up <= 176.745 )
									ret := 0.008715
								if( up > 176.745 )
									ret := 0.643836
							if( up1 > 177.252 )
								if( atr2 <= 0.960655 )
									ret := -0.182796
								if( atr2 > 0.960655 )
									ret := -0.787879 // sell
						if( up1 > 179.622 )
							if( up1 <= 180.421 )
								if( up1 <= 179.984 )
									ret := 0.750000 // buy
								if( up1 > 179.984 )
									ret := 0.333333
							if( up1 > 180.421 )
								ret := 0.812500 // buy
				if( dn1 > 184.57 )
					if( dn <= 184.342 )
						if( dn1 <= 184.636 )
							ret := 0.846154 // buy
						if( dn1 > 184.636 )
							ret := -0.235294
					if( dn > 184.342 )
						if( dn <= 185.214 )
							if( dn1 <= 185.231 )
								if( atr2 <= 1.04826 )
									ret := 0.366667
								if( atr2 > 1.04826 )
									ret := 0.857143 // buy
							if( dn1 > 185.231 )
								if( dn <= 184.947 )
									ret := 0.750000 // buy
								if( dn > 184.947 )
									ret := 1.000000 // buy
						if( dn > 185.214 )
							ret := 0.176471
			if( dn1 > 185.545 )
				if( atr <= 0.411281 )
					if( atr2 <= 0.207335 )
						ret := 0.944444 // buy
					if( atr2 > 0.207335 )
						if( atr <= 0.400883 )
							if( up <= 205.506 )
								if( atr2 <= 0.31125 )
									ret := 0.066667
								if( atr2 > 0.31125 )
									ret := 0.648148
							if( up > 205.506 )
								if( dn1 <= 222.083 )
									ret := -0.553191
								if( dn1 > 222.083 )
									ret := 0.454545
						if( atr > 0.400883 )
							if( dn1 <= 214.888 )
								ret := 0.636364
							if( dn1 > 214.888 )
								ret := 1.000000 // buy
				if( atr > 0.411281 )
					if( up <= 218.686 )
						if( up1 <= 216.28 )
							if( up1 <= 174.794 )
								if( dn1 <= 189.05 )
									ret := -0.080000
								if( dn1 > 189.05 )
									ret := 0.936170 // buy
							if( up1 > 174.794 )
								if( up <= 176.946 )
									ret := -0.861111 // sell
								if( up > 176.946 )
									ret := 0.038651
						if( up1 > 216.28 )
							if( dn1 <= 222.807 )
								if( dn <= 220.406 )
									ret := 0.897436 // buy
								if( dn > 220.406 )
									ret := 0.544776
							if( dn1 > 222.807 )
								if( up <= 218.253 )
									ret := -0.119048
								if( up > 218.253 )
									ret := 0.687500
					if( up > 218.686 )
						if( atr2 <= 0.469387 )
							if( up <= 219.554 )
								ret := -1.000000 // sell
							if( up > 219.554 )
								ret := -0.357143
						if( atr2 > 0.469387 )
							if( atr2 <= 0.769696 )
								if( dn1 <= 222.677 )
									ret := 0.416667
								if( dn1 > 222.677 )
									ret := -0.181818
							if( atr2 > 0.769696 )
								if( atr <= 0.898787 )
									ret := -0.812500 // sell
								if( atr > 0.898787 )
									ret := -0.615385
	if( dn1 > 223.696 )
		if( atr <= 1.39388 )
			if( up1 <= 291.562 )
				if( atr2 <= 1.008 )
					if( up <= 270.947 )
						if( dn <= 245.259 )
							if( dn <= 233.169 )
								if( atr <= 0.751249 )
									ret := 0.013453
								if( atr > 0.751249 )
									ret := -0.337731
							if( dn > 233.169 )
								if( up <= 239.88 )
									ret := 0.163121
								if( up > 239.88 )
									ret := 0.875000 // buy
						if( dn > 245.259 )
							if( dn1 <= 255.548 )
								if( atr2 <= 0.890723 )
									ret := -0.900901 // sell
								if( atr2 > 0.890723 )
									ret := -0.090909
							if( dn1 > 255.548 )
								if( atr <= 0.770531 )
									ret := 0.875000 // buy
								if( atr > 0.770531 )
									ret := -0.421875
					if( up > 270.947 )
						if( up <= 281.122 )
							if( up <= 277.265 )
								ret := 1.000000 // buy
							if( up > 277.265 )
								ret := 0.666667
						if( up > 281.122 )
							if( dn <= 295.301 )
								if( dn <= 293.968 )
									ret := -0.136364
								if( dn > 293.968 )
									ret := -0.866667 // sell
							if( dn > 295.301 )
								ret := 0.750000 // buy
				if( atr2 > 1.008 )
					if( dn1 <= 227.5 )
						if( dn <= 225.053 )
							if( dn1 <= 224.959 )
								if( atr2 <= 1.46798 )
									ret := -0.031250
								if( atr2 > 1.46798 )
									ret := 0.416667
							if( dn1 > 224.959 )
								if( atr <= 1.26824 )
									ret := 0.909091 // buy
								if( atr > 1.26824 )
									ret := 0.363636
						if( dn > 225.053 )
							if( up <= 219.377 )
								if( dn <= 226.038 )
									ret := -0.750000 // sell
								if( dn > 226.038 )
									ret := -0.285714
							if( up > 219.377 )
								if( dn1 <= 226.135 )
									ret := 0.555556
								if( dn1 > 226.135 )
									ret := -0.263158
					if( dn1 > 227.5 )
						if( dn <= 242.689 )
							if( up <= 233.486 )
								if( atr <= 1.02353 )
									ret := 0.000000
								if( atr > 1.02353 )
									ret := 0.286408
							if( up > 233.486 )
								if( up <= 235.512 )
									ret := 0.600000
								if( up > 235.512 )
									ret := 0.916667 // buy
						if( dn > 242.689 )
							if( up1 <= 244.254 )
								if( dn1 <= 243.612 )
									ret := -0.900000 // sell
								if( dn1 > 243.612 )
									ret := -0.169014
							if( up1 > 244.254 )
								if( atr2 <= 1.04381 )
									ret := 0.833333 // buy
								if( atr2 > 1.04381 )
									ret := 0.151079
			if( up1 > 291.562 )
				ret := -0.846154 // sell
		if( atr > 1.39388 )
			if( dn1 <= 223.93 )
				if( atr <= 1.88922 )
					if( atr2 <= 1.50881 )
						ret := -0.888889 // sell
					if( atr2 > 1.50881 )
						ret := 0.230769
				if( atr > 1.88922 )
					if( up1 <= 210.212 )
						ret := -0.600000
					if( up1 > 210.212 )
						ret := -1.000000 // sell
			if( dn1 > 223.93 )
				if( up1 <= 196.276 )
					if( atr <= 6.63918 )
						ret := 0.666667
					if( atr > 6.63918 )
						ret := 1.000000 // buy
				if( up1 > 196.276 )
					if( up <= 198.407 )
						ret := -1.000000 // sell
					if( up > 198.407 )
						if( atr <= 4.07778 )
							if( atr2 <= 2.95758 )
								if( trend <= 0.125006 )
									ret := 0.375000
								if( trend > 0.125006 )
									ret := -0.198068
							if( atr2 > 2.95758 )
								if( atr <= 2.67249 )
									ret := -0.033333
								if( atr > 2.67249 )
									ret := -0.480122
						if( atr > 4.07778 )
							if( atr2 <= 3.91918 )
								if( up1 <= 234.132 )
									ret := 1.000000 // buy
								if( up1 > 234.132 )
									ret := 0.588235
							if( atr2 > 3.91918 )
								if( atr <= 4.84057 )
									ret := -0.406250
								if( atr > 4.84057 )
									ret := 0.183333
	
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
float op_operation = decision_tree_0_ETSY_15Min_89bf0342(dn1, trend, atr, atr2, buySignalInt, sellSignalInt, up1, up, dn)

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


