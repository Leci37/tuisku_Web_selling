//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: SuperTrend
// ID_model: SNOW_30Min_1SUP_d55fcebd Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNOW_30Min_1SUP_d55fcebd", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNOW_30Min_d55fcebd(dn, atr, buySignalInt, up1, dn1, up, trend, atr2, sellSignalInt)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( dn <= 275.202 )
		if( dn <= 130.52 )
			if( dn1 <= 129.784 )
				if( atr2 <= 1.01341 )
					if( atr <= 0.81098 )
						if( up <= 108.215 )
							ret := 0.659341
						if( up > 108.215 )
							ret := 0.125571
					if( atr > 0.81098 )
						if( up <= 112.567 )
							ret := 0.162338
						if( up > 112.567 )
							ret := 0.632000
				if( atr2 > 1.01341 )
					if( up1 <= 115.878 )
						if( dn <= 122.754 )
							ret := -0.013263
						if( dn > 122.754 )
							ret := 0.669725
					if( up1 > 115.878 )
						if( atr <= 1.64037 )
							ret := -0.596774
						if( atr > 1.64037 )
							ret := 0.272727
			if( dn1 > 129.784 )
				if( atr2 <= 0.315813 )
					if( up <= 128.597 )
						ret := 1.000000 // buy
					if( up > 128.597 )
						ret := 0.000000
				if( atr2 > 0.315813 )
					if( atr <= 0.836061 )
						if( up1 <= 126.237 )
							ret := -0.555556
						if( up1 > 126.237 )
							ret := 0.475000
					if( atr > 0.836061 )
						if( up <= 127.048 )
							ret := 0.614754
						if( up > 127.048 )
							ret := -1.000000 // sell
		if( dn > 130.52 )
			if( atr <= 1.49565 )
				if( dn <= 132.433 )
					if( atr <= 0.933338 )
						if( dn <= 132.106 )
							ret := -0.248555
						if( dn > 132.106 )
							ret := -0.820513 // sell
					if( atr > 0.933338 )
						if( atr2 <= 0.855064 )
							ret := 0.818182 // buy
						if( atr2 > 0.855064 )
							ret := -0.090909
				if( dn > 132.433 )
					if( up1 <= 125.807 )
						if( up1 <= 124.079 )
							ret := -0.666667
						if( up1 > 124.079 )
							ret := 0.842105 // buy
					if( up1 > 125.807 )
						if( trend <= 0.828853 )
							ret := 0.248826
						if( trend > 0.828853 )
							ret := -0.038240
			if( atr > 1.49565 )
				if( atr <= 8.83525 )
					if( atr2 <= 6.78321 )
						if( up1 <= 243.659 )
							ret := 0.049494
						if( up1 > 243.659 )
							ret := 0.212605
					if( atr2 > 6.78321 )
						if( dn <= 242.39 )
							ret := -1.000000 // sell
						if( dn > 242.39 )
							ret := -0.375000
				if( atr > 8.83525 )
					if( atr2 <= 9.1798 )
						if( up1 <= 229.777 )
							ret := 1.000000 // buy
						if( up1 > 229.777 )
							ret := 0.000000
					if( atr2 > 9.1798 )
						if( atr2 <= 10.1897 )
							ret := -0.571429
						if( atr2 > 10.1897 )
							ret := 0.962963 // buy
	if( dn > 275.202 )
		if( up <= 267.543 )
			if( atr <= 3.3745 )
				if( dn <= 278.201 )
					if( dn1 <= 278.302 )
						if( up <= 266.143 )
							ret := -0.375000
						if( up > 266.143 )
							ret := -0.956522 // sell
					if( dn1 > 278.302 )
						if( atr2 <= 2.33425 )
							ret := 0.608696
						if( atr2 > 2.33425 )
							ret := -0.263158
				if( dn > 278.201 )
					if( dn1 <= 284.857 )
						if( atr2 <= 3.08022 )
							ret := -0.661290
						if( atr2 > 3.08022 )
							ret := -0.920455 // sell
					if( dn1 > 284.857 )
						ret := -0.066667
			if( atr > 3.3745 )
				if( atr2 <= 7.44377 )
					if( dn <= 288.648 )
						if( up1 <= 264.2 )
							ret := -0.080306
						if( up1 > 264.2 )
							ret := 0.551724
					if( dn > 288.648 )
						if( dn1 <= 297.147 )
							ret := -0.788732 // sell
						if( dn1 > 297.147 )
							ret := 0.416667
				if( atr2 > 7.44377 )
					if( atr2 <= 11.8445 )
						if( atr2 <= 8.77932 )
							ret := -0.950000 // sell
						if( atr2 > 8.77932 )
							ret := -1.000000 // sell
					if( atr2 > 11.8445 )
						if( atr <= 11.4609 )
							ret := 0.333333
						if( atr > 11.4609 )
							ret := -1.000000 // sell
		if( up > 267.543 )
			if( dn <= 403.246 )
				if( dn1 <= 299.228 )
					if( up <= 289.327 )
						if( atr2 <= 1.96802 )
							ret := -0.087613
						if( atr2 > 1.96802 )
							ret := 0.179533
					if( up > 289.327 )
						if( dn <= 298.739 )
							ret := 0.866667 // buy
						if( dn > 298.739 )
							ret := -0.222222
				if( dn1 > 299.228 )
					if( dn <= 309.799 )
						if( dn <= 305.963 )
							ret := -0.179394
						if( dn > 305.963 )
							ret := -0.453039
					if( dn > 309.799 )
						if( up1 <= 334.602 )
							ret := 0.026779
						if( up1 > 334.602 )
							ret := -0.148047
			if( dn > 403.246 )
				if( atr <= 9.25108 )
					if( atr <= 6.93629 )
						if( atr2 <= 1.23083 )
							ret := -1.000000 // sell
						if( atr2 > 1.23083 )
							ret := -0.346154
					if( atr > 6.93629 )
						if( atr2 <= 5.808 )
							ret := 0.000000
						if( atr2 > 5.808 )
							ret := -0.944444 // sell
				if( atr > 9.25108 )
					if( dn1 <= 411.648 )
						ret := 1.000000 // buy
					if( dn1 > 411.648 )
						ret := 0.166667
	
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
float op_operation = decision_tree_0_SNOW_30Min_d55fcebd(dn, atr, buySignalInt, up1, dn1, up, trend, atr2, sellSignalInt)

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


