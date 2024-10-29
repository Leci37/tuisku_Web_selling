//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: SuperTrend
// ID_model: DOGEUSDT_1Hour_1SUP_ec44b610 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOGEUSDT_1Hour_1SUP_ec44b610", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOGEUSDT_1Hour_ec44b610(dn1, trend, atr, atr2, buySignalInt, sellSignalInt, up1, up, dn)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6,max_features=sqrt, min_samples_split=10,random_state=843828734)
	if( up1 <= 0.121622 )
		if( atr <= 0.004042 )
			if( dn1 <= 0.001781 )
				if( atr2 <= 2.4e-05 )
					if( atr <= 2.4e-05 )
						ret := -1.000000 // sell
					if( atr > 2.4e-05 )
						ret := 0.000000
				if( atr2 > 2.4e-05 )
					if( dn <= 0.001672 )
						if( dn1 <= 0.001655 )
							ret := -1.000000 // sell
						if( dn1 > 0.001655 )
							ret := 1.000000 // buy
					if( dn > 0.001672 )
						if( up1 <= 0.001557 )
							ret := 0.288889
						if( up1 > 0.001557 )
							ret := 0.937500 // buy
			if( dn1 > 0.001781 )
				if( atr2 <= 0.003979 )
					if( atr <= 0.002785 )
						if( up1 <= 0.001297 )
							ret := 0.870370 // buy
						if( up1 > 0.001297 )
							ret := 0.019385
					if( atr > 0.002785 )
						if( dn <= 0.037461 )
							ret := 1.000000 // buy
						if( dn > 0.037461 )
							ret := -0.175420
				if( atr2 > 0.003979 )
					if( up1 <= 0.105135 )
						if( atr <= 0.003881 )
							ret := 0.875000 // buy
						if( atr > 0.003881 )
							ret := 0.325581
					if( up1 > 0.105135 )
						ret := 0.000000
		if( atr > 0.004042 )
			if( up1 <= 0.0815 )
				if( atr <= 0.005279 )
					if( up <= 0.079136 )
						if( atr2 <= 0.004416 )
							ret := 0.000000
						if( atr2 > 0.004416 )
							ret := 0.651961
					if( up > 0.079136 )
						if( up1 <= 0.07972 )
							ret := -0.904762 // sell
						if( up1 > 0.07972 )
							ret := -0.166667
				if( atr > 0.005279 )
					if( atr2 <= 0.020205 )
						if( atr2 <= 0.013303 )
							ret := -0.166667
						if( atr2 > 0.013303 )
							ret := -0.933333 // sell
					if( atr2 > 0.020205 )
						ret := 1.000000 // buy
			if( up1 > 0.0815 )
				if( atr <= 0.004703 )
					if( dn <= 0.106749 )
						ret := -1.000000 // sell
					if( dn > 0.106749 )
						if( dn1 <= 0.134209 )
							ret := 0.416667
						if( dn1 > 0.134209 )
							ret := 0.764706 // buy
				if( atr > 0.004703 )
					if( dn <= 0.144054 )
						if( atr2 <= 0.004417 )
							ret := -1.000000 // sell
						if( atr2 > 0.004417 )
							ret := 0.757062 // buy
					if( dn > 0.144054 )
						if( dn <= 0.168586 )
							ret := 0.025751
						if( dn > 0.168586 )
							ret := 0.622642
	if( up1 > 0.121622 )
		if( atr2 <= 0.001434 )
			if( dn <= 0.131467 )
				if( dn <= 0.12909 )
					if( dn <= 0.128211 )
						if( dn <= 0.127622 )
							ret := -0.177778
						if( dn > 0.127622 )
							ret := -0.684211
					if( dn > 0.128211 )
						ret := 0.000000
				if( dn > 0.12909 )
					if( up1 <= 0.123153 )
						if( dn <= 0.130143 )
							ret := -0.766667 // sell
						if( dn > 0.130143 )
							ret := 0.333333
					if( up1 > 0.123153 )
						if( atr2 <= 0.001157 )
							ret := -1.000000 // sell
						if( atr2 > 0.001157 )
							ret := -0.878788 // sell
			if( dn > 0.131467 )
				if( dn1 <= 0.144117 )
					if( up <= 0.134432 )
						if( up <= 0.128597 )
							ret := 0.069444
						if( up > 0.128597 )
							ret := -0.360656
					if( up > 0.134432 )
						if( atr2 <= 0.00137 )
							ret := 0.706522 // buy
						if( atr2 > 0.00137 )
							ret := -0.250000
				if( dn1 > 0.144117 )
					if( dn1 <= 0.144876 )
						if( atr <= 0.001306 )
							ret := -0.444444
						if( atr > 0.001306 )
							ret := -0.918919 // sell
					if( dn1 > 0.144876 )
						if( dn <= 0.150783 )
							ret := -0.092593
						if( dn > 0.150783 )
							ret := -0.331250
		if( atr2 > 0.001434 )
			if( up <= 0.447297 )
				if( dn <= 0.686153 )
					if( sellSignalInt <= 0.5 )
						if( atr <= 0.01663 )
							ret := -0.049137
						if( atr > 0.01663 )
							ret := 0.108850
					if( sellSignalInt > 0.5 )
						if( dn1 <= 0.172527 )
							ret := 0.400000
						if( dn1 > 0.172527 )
							ret := 0.875000 // buy
				if( dn > 0.686153 )
					ret := -1.000000 // sell
			if( up > 0.447297 )
				if( up <= 0.561153 )
					if( up <= 0.458247 )
						if( dn <= 0.524778 )
							ret := -1.000000 // sell
						if( dn > 0.524778 )
							ret := -0.753623 // sell
					if( up > 0.458247 )
						if( up <= 0.517168 )
							ret := -0.219178
						if( up > 0.517168 )
							ret := -0.672727
				if( up > 0.561153 )
					if( up <= 0.626371 )
						if( dn <= 0.739791 )
							ret := 1.000000 // buy
						if( dn > 0.739791 )
							ret := 0.866667 // buy
					if( up > 0.626371 )
						if( dn <= 0.800874 )
							ret := -0.916667 // sell
						if( dn > 0.800874 )
							ret := 0.000000
	
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
float op_operation = decision_tree_0_DOGEUSDT_1Hour_ec44b610(dn1, trend, atr, atr2, buySignalInt, sellSignalInt, up1, up, dn)

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


