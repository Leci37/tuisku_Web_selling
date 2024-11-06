//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: SuperTrend
// ID_model: SNOW_1Min_1SUP_10f61ed0 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNOW_1Min_1SUP_10f61ed0", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNOW_1Min_10f61ed0(dn, atr, buySignalInt, up1, dn1, up, trend, atr2, sellSignalInt)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=0.7, min_samples_leaf=7,min_samples_split=10, random_state=843828734)
	if( trend <= -0.867902 )
		if( up1 <= 126.248 )
			if( dn <= 112.764 )
				if( up1 <= 109.732 )
					if( dn1 <= 110.042 )
						ret := 0.600000
					if( dn1 > 110.042 )
						ret := 1.000000 // buy
				if( up1 > 109.732 )
					if( up <= 110.146 )
						ret := -0.187500
					if( up > 110.146 )
						if( dn <= 111.14 )
							if( up1 <= 110.318 )
								ret := 0.800000 // buy
							if( up1 > 110.318 )
								ret := 1.000000 // buy
						if( dn > 111.14 )
							if( dn <= 112.132 )
								ret := -0.416667
							if( dn > 112.132 )
								if( dn1 <= 112.65 )
									ret := 0.947368 // buy
								if( dn1 > 112.65 )
									ret := 0.333333
			if( dn > 112.764 )
				if( atr2 <= 0.11409 )
					if( up <= 114.663 )
						if( dn1 <= 113.72 )
							ret := 1.000000 // buy
						if( dn1 > 113.72 )
							if( atr2 <= 0.088332 )
								ret := 0.583333
							if( atr2 > 0.088332 )
								ret := 0.785714 // buy
					if( up > 114.663 )
						if( atr <= 0.113168 )
							if( dn1 <= 115.879 )
								ret := 0.416667
							if( dn1 > 115.879 )
								ret := 0.764706 // buy
						if( atr > 0.113168 )
							ret := 0.055556
				if( atr2 > 0.11409 )
					if( atr <= 0.221173 )
						if( atr2 <= 0.152355 )
							if( up <= 113.392 )
								ret := 0.818182 // buy
							if( up > 113.392 )
								ret := 1.000000 // buy
						if( atr2 > 0.152355 )
							ret := 0.588235
					if( atr > 0.221173 )
						if( atr2 <= 0.287899 )
							ret := 1.000000 // buy
						if( atr2 > 0.287899 )
							ret := 0.875000 // buy
		if( up1 > 126.248 )
			if( dn <= 131.285 )
				if( dn <= 127.051 )
					ret := 0.692308
				if( dn > 127.051 )
					if( up1 <= 127.076 )
						ret := -0.714286 // sell
					if( up1 > 127.076 )
						if( dn <= 130.8 )
							if( atr <= 0.107756 )
								ret := -0.166667
							if( atr > 0.107756 )
								if( up <= 129.637 )
									ret := 0.642857
								if( up > 129.637 )
									ret := 0.125000
						if( dn > 130.8 )
							ret := -0.625000
			if( dn > 131.285 )
				if( atr <= 0.243009 )
					if( up <= 160.468 )
						if( dn <= 141.835 )
							if( dn1 <= 136.464 )
								if( dn <= 132.75 )
									ret := 0.500000
								if( dn > 132.75 )
									ret := -0.047619
							if( dn1 > 136.464 )
								if( dn <= 137.447 )
									ret := 1.000000 // buy
								if( dn > 137.447 )
									ret := 0.687500
						if( dn > 141.835 )
							if( dn1 <= 157.966 )
								if( up1 <= 156.639 )
									ret := 0.040000
								if( up1 > 156.639 )
									ret := 0.444444
							if( dn1 > 157.966 )
								ret := -0.235294
					if( up > 160.468 )
						if( atr2 <= 0.170764 )
							ret := 1.000000 // buy
						if( atr2 > 0.170764 )
							ret := 0.888889 // buy
				if( atr > 0.243009 )
					if( up <= 159.091 )
						if( atr <= 0.476678 )
							if( atr <= 0.31348 )
								if( dn1 <= 154.064 )
									ret := 1.000000 // buy
								if( dn1 > 154.064 )
									ret := 0.692308
							if( atr > 0.31348 )
								ret := 1.000000 // buy
						if( atr > 0.476678 )
							if( up <= 134.199 )
								ret := 1.000000 // buy
							if( up > 134.199 )
								ret := 0.200000
					if( up > 159.091 )
						if( atr2 <= 0.297389 )
							ret := 0.625000
						if( atr2 > 0.297389 )
							ret := -0.700000 // sell
	if( trend > -0.867902 )
		if( up <= 109.342 )
			if( atr2 <= 0.938545 )
				if( up1 <= 109.26 )
					if( atr2 <= 0.290942 )
						if( dn1 <= 109.971 )
							if( up <= 108.883 )
								if( up <= 107.293 )
									ret := 0.578313
								if( up > 107.293 )
									ret := 0.079137
							if( up > 108.883 )
								if( up <= 109.19 )
									ret := 0.579365
								if( up > 109.19 )
									ret := -0.194030
						if( dn1 > 109.971 )
							if( up1 <= 108.662 )
								if( dn <= 109.984 )
									ret := -0.083333
								if( dn > 109.984 )
									ret := -0.930233 // sell
							if( up1 > 108.662 )
								if( atr2 <= 0.14903 )
									ret := -0.656250
								if( atr2 > 0.14903 )
									ret := -0.034615
					if( atr2 > 0.290942 )
						if( dn1 <= 111.236 )
							if( dn <= 109.633 )
								if( up <= 107.074 )
									ret := 0.466667
								if( up > 107.074 )
									ret := -0.588235
							if( dn > 109.633 )
								if( dn <= 110.2 )
									ret := 0.466667
								if( dn > 110.2 )
									ret := 0.909836 // buy
						if( dn1 > 111.236 )
							if( dn1 <= 112.095 )
								if( atr <= 0.54883 )
									ret := -0.656250
								if( atr > 0.54883 )
									ret := 0.125000
							if( dn1 > 112.095 )
								if( up1 <= 108.465 )
									ret := -0.800000 // sell
								if( up1 > 108.465 )
									ret := 0.954545 // buy
				if( up1 > 109.26 )
					if( atr2 <= 0.05326 )
						ret := 0.000000
					if( atr2 > 0.05326 )
						if( atr <= 0.18979 )
							if( atr <= 0.092626 )
								if( up <= 109.297 )
									ret := 0.444444
								if( up > 109.297 )
									ret := 0.954545 // buy
							if( atr > 0.092626 )
								if( up1 <= 109.317 )
									ret := 0.550000
								if( up1 > 109.317 )
									ret := 0.166667
						if( atr > 0.18979 )
							if( up1 <= 109.314 )
								ret := 0.947368 // buy
							if( up1 > 109.314 )
								ret := 0.750000 // buy
			if( atr2 > 0.938545 )
				if( up <= 108.939 )
					if( dn1 <= 116.342 )
						ret := 1.000000 // buy
					if( dn1 > 116.342 )
						ret := 0.900000 // buy
				if( up > 108.939 )
					ret := 0.333333
		if( up > 109.342 )
			if( dn <= 164.792 )
				if( atr2 <= 0.358474 )
					if( dn1 <= 161.707 )
						if( dn1 <= 161.219 )
							if( up <= 113.458 )
								if( dn1 <= 114.412 )
									ret := 0.049806
								if( dn1 > 114.412 )
									ret := 0.456265
							if( up > 113.458 )
								if( dn <= 117.893 )
									ret := -0.080535
								if( dn > 117.893 )
									ret := 0.039946
						if( dn1 > 161.219 )
							if( atr2 <= 0.108202 )
								if( atr2 <= 0.09659 )
									ret := 0.000000
								if( atr2 > 0.09659 )
									ret := 0.750000 // buy
							if( atr2 > 0.108202 )
								if( atr <= 0.189022 )
									ret := -0.494681
								if( atr > 0.189022 )
									ret := -0.034188
					if( dn1 > 161.707 )
						if( atr <= 0.151732 )
							if( up1 <= 162.097 )
								if( up <= 161.916 )
									ret := 0.107463
								if( up > 161.916 )
									ret := 0.589286
							if( up1 > 162.097 )
								if( dn <= 163.593 )
									ret := -0.092233
								if( dn > 163.593 )
									ret := 0.086022
						if( atr > 0.151732 )
							if( atr2 <= 0.150136 )
								if( up <= 162.251 )
									ret := 0.409091
								if( up > 162.251 )
									ret := 0.770833 // buy
							if( atr2 > 0.150136 )
								if( dn <= 163.649 )
									ret := 0.278438
								if( dn > 163.649 )
									ret := 0.061170
				if( atr2 > 0.358474 )
					if( up <= 136.139 )
						if( up <= 134.434 )
							if( up <= 133.869 )
								if( atr <= 0.545939 )
									ret := 0.233460
								if( atr > 0.545939 )
									ret := -0.002066
							if( up > 133.869 )
								if( atr2 <= 0.53255 )
									ret := -0.811321 // sell
								if( atr2 > 0.53255 )
									ret := 0.727273 // buy
						if( up > 134.434 )
							if( atr2 <= 0.728323 )
								if( dn1 <= 137.091 )
									ret := 0.000000
								if( dn1 > 137.091 )
									ret := 0.626609
							if( atr2 > 0.728323 )
								ret := 0.038462
					if( up > 136.139 )
						if( up1 <= 159.85 )
							if( atr <= 0.375928 )
								if( up1 <= 158.137 )
									ret := 0.351351
								if( up1 > 158.137 )
									ret := -0.203704
							if( atr > 0.375928 )
								if( dn1 <= 147.487 )
									ret := -0.366109
								if( dn1 > 147.487 )
									ret := -0.018598
						if( up1 > 159.85 )
							if( atr <= 0.538108 )
								if( dn <= 163.892 )
									ret := 0.414634
								if( dn > 163.892 )
									ret := 0.887097 // buy
							if( atr > 0.538108 )
								if( atr2 <= 0.645557 )
									ret := -0.880000 // sell
								if( atr2 > 0.645557 )
									ret := 0.870968 // buy
			if( dn > 164.792 )
				if( up1 <= 163.199 )
					if( atr2 <= 0.350329 )
						ret := -1.000000 // sell
					if( atr2 > 0.350329 )
						if( dn1 <= 165.233 )
							if( up1 <= 162.438 )
								ret := -0.500000
							if( up1 > 162.438 )
								ret := 0.750000 // buy
						if( dn1 > 165.233 )
							if( atr <= 0.865236 )
								if( up <= 162.995 )
									ret := -0.444444
								if( up > 162.995 )
									ret := -0.875000 // sell
							if( atr > 0.865236 )
								ret := -1.000000 // sell
				if( up1 > 163.199 )
					if( up1 <= 169.731 )
						if( dn <= 167.829 )
							if( dn <= 165.648 )
								if( up1 <= 163.408 )
									ret := 0.652174
								if( up1 > 163.408 )
									ret := -0.193548
							if( dn > 165.648 )
								if( atr2 <= 0.120023 )
									ret := -0.250000
								if( atr2 > 0.120023 )
									ret := -0.847826 // sell
						if( dn > 167.829 )
							if( dn <= 175.435 )
								if( up1 <= 167.955 )
									ret := 0.890244 // buy
								if( up1 > 167.955 )
									ret := 0.128852
							if( dn > 175.435 )
								if( dn <= 182.242 )
									ret := -0.400000
								if( dn > 182.242 )
									ret := -1.000000 // sell
					if( up1 > 169.731 )
						if( up1 <= 170.534 )
							if( atr <= 0.199488 )
								ret := -0.357143
							if( atr > 0.199488 )
								if( dn <= 171.999 )
									ret := -0.750000 // sell
								if( dn > 171.999 )
									ret := -0.954545 // sell
						if( up1 > 170.534 )
							if( atr2 <= 0.441457 )
								if( up1 <= 170.723 )
									ret := -0.357143
								if( up1 > 170.723 )
									ret := -1.000000 // sell
							if( atr2 > 0.441457 )
								if( atr <= 0.574619 )
									ret := 0.863636 // buy
								if( atr > 0.574619 )
									ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_SNOW_1Min_10f61ed0(dn, atr, buySignalInt, up1, dn1, up, trend, atr2, sellSignalInt)

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


