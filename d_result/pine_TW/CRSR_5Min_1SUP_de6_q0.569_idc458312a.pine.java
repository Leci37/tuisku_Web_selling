//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: SuperTrend
// ID_model: CRSR_5Min_1SUP_c458312a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRSR_5Min_1SUP_c458312a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRSR_5Min_c458312a(atr, up, dn1, sellSignalInt, buySignalInt, atr2, dn, trend, up1)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( dn <= 6.59104 )
		if( atr <= 0.030497 )
			if( dn1 <= 6.32076 )
				if( dn1 <= 5.73862 )
					if( up1 <= 5.54455 )
						ret := 0.000000
					if( up1 > 5.54455 )
						if( dn <= 5.71142 )
							ret := 1.000000 // buy
						if( dn > 5.71142 )
							ret := 0.882353 // buy
				if( dn1 > 5.73862 )
					if( up1 <= 5.6132 )
						if( dn <= 5.78745 )
							ret := -0.967742 // sell
						if( dn > 5.78745 )
							ret := 0.000000
					if( up1 > 5.6132 )
						if( dn <= 5.75584 )
							ret := 0.914894 // buy
						if( dn > 5.75584 )
							ret := 0.101254
			if( dn1 > 6.32076 )
				if( atr <= 0.01469 )
					if( dn1 <= 6.37453 )
						if( atr2 <= 0.013781 )
							ret := 0.785714 // buy
						if( atr2 > 0.013781 )
							ret := -1.000000 // sell
					if( dn1 > 6.37453 )
						if( up <= 6.36115 )
							ret := -0.526316
						if( up > 6.36115 )
							ret := 0.000000
				if( atr > 0.01469 )
					if( atr <= 0.022535 )
						if( atr2 <= 0.02229 )
							ret := 0.515480
						if( atr2 > 0.02229 )
							ret := 0.846154 // buy
					if( atr > 0.022535 )
						if( up1 <= 6.4333 )
							ret := 0.407500
						if( up1 > 6.4333 )
							ret := -0.414634
		if( atr > 0.030497 )
			if( up <= 5.92456 )
				if( dn1 <= 6.05792 )
					if( up1 <= 5.79664 )
						if( dn1 <= 6.0441 )
							ret := 0.433628
						if( dn1 > 6.0441 )
							ret := -0.750000 // sell
					if( up1 > 5.79664 )
						if( up <= 5.83514 )
							ret := -1.000000 // sell
						if( up > 5.83514 )
							ret := 1.000000 // buy
				if( dn1 > 6.05792 )
					if( dn1 <= 6.11872 )
						if( atr2 <= 0.081371 )
							ret := 0.910448 // buy
						if( atr2 > 0.081371 )
							ret := -1.000000 // sell
					if( dn1 > 6.11872 )
						if( atr <= 0.079058 )
							ret := -0.736842 // sell
						if( atr > 0.079058 )
							ret := 0.705882 // buy
			if( up > 5.92456 )
				if( sellSignalInt <= 0.5 )
					if( dn1 <= 6.58673 )
						if( atr2 <= 0.102255 )
							ret := -0.371029
						if( atr2 > 0.102255 )
							ret := 1.000000 // buy
					if( dn1 > 6.58673 )
						if( up <= 6.36387 )
							ret := 0.716667 // buy
						if( up > 6.36387 )
							ret := -0.650000
				if( sellSignalInt > 0.5 )
					if( up <= 5.96802 )
						ret := -1.000000 // sell
					if( up > 5.96802 )
						if( dn1 <= 6.51404 )
							ret := 0.958333 // buy
						if( dn1 > 6.51404 )
							ret := 0.272727
	if( dn > 6.59104 )
		if( sellSignalInt <= 0.5 )
			if( dn <= 19.8245 )
				if( up <= 18.8847 )
					if( atr2 <= 0.103871 )
						if( buySignalInt <= 0.5 )
							ret := -0.041930
						if( buySignalInt > 0.5 )
							ret := 0.298507
					if( atr2 > 0.103871 )
						if( up <= 14.5978 )
							ret := 0.018750
						if( up > 14.5978 )
							ret := 0.301184
				if( up > 18.8847 )
					if( atr <= 0.063561 )
						if( up <= 19.1206 )
							ret := 0.809859 // buy
						if( up > 19.1206 )
							ret := 0.227431
					if( atr > 0.063561 )
						if( dn1 <= 19.8672 )
							ret := -0.103896
						if( dn1 > 19.8672 )
							ret := 0.826087 // buy
			if( dn > 19.8245 )
				if( atr2 <= 0.376745 )
					if( atr2 <= 0.178154 )
						if( atr2 <= 0.140425 )
							ret := -0.371014
						if( atr2 > 0.140425 )
							ret := 0.313253
					if( atr2 > 0.178154 )
						if( dn1 <= 21.1764 )
							ret := -0.842697 // sell
						if( dn1 > 21.1764 )
							ret := 0.200000
				if( atr2 > 0.376745 )
					if( atr2 <= 0.5693 )
						ret := 1.000000 // buy
					if( atr2 > 0.5693 )
						ret := 0.600000
		if( sellSignalInt > 0.5 )
			if( dn1 <= 7.67481 )
				if( up <= 6.68928 )
					ret := -1.000000 // sell
				if( up > 6.68928 )
					if( dn <= 6.87502 )
						ret := 0.818182 // buy
					if( dn > 6.87502 )
						if( atr <= 0.079869 )
							ret := -0.714286 // sell
						if( atr > 0.079869 )
							ret := 1.000000 // buy
			if( dn1 > 7.67481 )
				if( atr2 <= 0.029628 )
					if( up1 <= 12.9242 )
						if( atr <= 0.025853 )
							ret := 0.150000
						if( atr > 0.025853 )
							ret := 0.787879 // buy
					if( up1 > 12.9242 )
						if( up1 <= 13.6901 )
							ret := -0.642857
						if( up1 > 13.6901 )
							ret := -0.074074
				if( atr2 > 0.029628 )
					if( up <= 11.7325 )
						if( dn <= 11.6912 )
							ret := 0.978417 // buy
						if( dn > 11.6912 )
							ret := 0.666667
					if( up > 11.7325 )
						if( atr <= 0.049111 )
							ret := -0.044118
						if( atr > 0.049111 )
							ret := 0.644776
	
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
float op_operation = decision_tree_0_CRSR_5Min_c458312a(atr, up, dn1, sellSignalInt, buySignalInt, atr2, dn, trend, up1)

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


