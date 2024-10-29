//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: SuperTrend
// ID_model: UPST_1Hour_1SUP_ec7f1874 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UPST_1Hour_1SUP_ec7f1874", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UPST_1Hour_ec7f1874(dn1, atr, dn, up1, up, sellSignalInt, atr2, buySignalInt, trend)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( atr <= 2.54728 )
		if( dn <= 186.968 )
			if( dn <= 154.44 )
				if( atr <= 1.66006 )
					if( up1 <= 53.7026 )
						if( up1 <= 50.5592 )
							ret := 0.011113
						if( up1 > 50.5592 )
							ret := 0.696774
					if( up1 > 53.7026 )
						if( dn1 <= 61.4779 )
							ret := -1.000000 // sell
						if( dn1 > 61.4779 )
							ret := -0.117110
				if( atr > 1.66006 )
					if( dn1 <= 134.829 )
						if( up <= 110.237 )
							ret := 0.147300
						if( up > 110.237 )
							ret := -0.222628
					if( dn1 > 134.829 )
						if( up <= 133.653 )
							ret := 0.711712 // buy
						if( up > 133.653 )
							ret := -0.056604
			if( dn > 154.44 )
				if( atr2 <= 2.64244 )
					if( atr2 <= 2.31834 )
						if( atr2 <= 1.62958 )
							ret := -0.800000 // sell
						if( atr2 > 1.62958 )
							ret := -1.000000 // sell
					if( atr2 > 2.31834 )
						if( atr2 <= 2.44743 )
							ret := -0.500000
						if( atr2 > 2.44743 )
							ret := -0.923077 // sell
				if( atr2 > 2.64244 )
					ret := -0.352941
		if( dn > 186.968 )
			if( dn1 <= 338.965 )
				if( atr2 <= 1.67666 )
					ret := -0.384615
				if( atr2 > 1.67666 )
					if( atr2 <= 2.66128 )
						if( dn1 <= 194.419 )
							ret := 1.000000 // buy
						if( dn1 > 194.419 )
							ret := 0.666667
					if( atr2 > 2.66128 )
						if( atr2 <= 3.02946 )
							ret := 0.250000
						if( atr2 > 3.02946 )
							ret := -0.076923
			if( dn1 > 338.965 )
				ret := -0.523810
	if( atr > 2.54728 )
		if( dn <= 90.8699 )
			if( dn <= 86.4886 )
				if( dn <= 78.0522 )
					if( dn1 <= 40.8931 )
						ret := 0.500000
					if( dn1 > 40.8931 )
						if( atr2 <= 2.37725 )
							ret := -0.886792 // sell
						if( atr2 > 2.37725 )
							ret := -0.465686
				if( dn > 78.0522 )
					if( atr2 <= 2.72485 )
						if( up <= 68.7523 )
							ret := 0.863636 // buy
						if( up > 68.7523 )
							ret := 0.190476
					if( atr2 > 2.72485 )
						if( dn <= 82.3457 )
							ret := 0.266667
						if( dn > 82.3457 )
							ret := -0.705882 // sell
			if( dn > 86.4886 )
				if( atr <= 2.93027 )
					ret := -1.000000 // sell
				if( atr > 2.93027 )
					ret := -0.888889 // sell
		if( dn > 90.8699 )
			if( dn <= 103.812 )
				if( atr2 <= 2.79524 )
					if( up1 <= 83.4217 )
						if( dn <= 96.176 )
							ret := -0.083333
						if( dn > 96.176 )
							ret := -0.642857
					if( up1 > 83.4217 )
						if( atr2 <= 2.58843 )
							ret := 0.458333
						if( atr2 > 2.58843 )
							ret := 0.875000 // buy
				if( atr2 > 2.79524 )
					if( dn1 <= 104.246 )
						if( dn1 <= 98.0416 )
							ret := 0.961538 // buy
						if( dn1 > 98.0416 )
							ret := 0.615385
					if( dn1 > 104.246 )
						ret := -0.272727
			if( dn > 103.812 )
				if( dn1 <= 177.92 )
					if( dn <= 161.223 )
						if( atr <= 4.25209 )
							ret := -0.148009
						if( atr > 4.25209 )
							ret := 0.154440
					if( dn > 161.223 )
						if( up <= 128.172 )
							ret := 0.461538
						if( up > 128.172 )
							ret := -0.709459 // sell
				if( dn1 > 177.92 )
					if( atr2 <= 2.81275 )
						if( dn1 <= 249.554 )
							ret := 0.071429
						if( dn1 > 249.554 )
							ret := 0.601770
					if( atr2 > 2.81275 )
						if( dn1 <= 189.407 )
							ret := 0.365672
						if( dn1 > 189.407 )
							ret := -0.126822
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
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
float op_operation = decision_tree_0_UPST_1Hour_ec7f1874(dn1, atr, dn, up1, up, sellSignalInt, atr2, buySignalInt, trend)

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


