//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: SuperTrend
// ID_model: DOGEUSDT_30Min_1SUP_84949a61 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOGEUSDT_30Min_1SUP_84949a61", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOGEUSDT_30Min_84949a61(dn1, trend, atr, atr2, buySignalInt, sellSignalInt, up1, up, dn)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( up1 <= 0.050456 )
		if( atr <= 0.000747 )
			if( up1 <= 0.00847 )
				if( up1 <= 0.004571 )
					if( dn1 <= 0.00561 )
						if( dn <= 0.002944 )
							if( dn1 <= 0.00289 )
								ret := 0.058249
							if( dn1 > 0.00289 )
								ret := -0.500000
						if( dn > 0.002944 )
							if( atr2 <= 8.9e-05 )
								ret := 0.198246
							if( atr2 > 8.9e-05 )
								ret := -0.077586
					if( dn1 > 0.00561 )
						ret := -1.000000 // sell
				if( up1 > 0.004571 )
					if( up1 <= 0.00761 )
						if( dn1 <= 0.005072 )
							ret := -0.222222
						if( dn1 > 0.005072 )
							if( atr2 <= 0.000604 )
								ret := 0.736508 // buy
							if( atr2 > 0.000604 )
								ret := -0.047619
					if( up1 > 0.00761 )
						if( dn1 <= 0.008917 )
							if( atr <= 8.6e-05 )
								ret := -0.253012
							if( atr > 8.6e-05 )
								ret := 0.459916
						if( dn1 > 0.008917 )
							if( up1 <= 0.007842 )
								ret := 0.355932
							if( up1 > 0.007842 )
								ret := -0.129129
			if( up1 > 0.00847 )
				if( up <= 0.048001 )
					if( dn <= 0.010496 )
						if( up <= 0.009281 )
							if( up <= 0.009025 )
								ret := -0.035448
							if( up > 0.009025 )
								ret := -0.705882 // sell
						if( up > 0.009281 )
							if( dn1 <= 0.010489 )
								ret := 1.000000 // buy
							if( dn1 > 0.010489 )
								ret := 0.812500 // buy
					if( dn > 0.010496 )
						if( up <= 0.047936 )
							if( up1 <= 0.046595 )
								ret := -0.292929
							if( up1 > 0.046595 )
								ret := 0.269231
						if( up > 0.047936 )
							if( atr2 <= 0.0006 )
								ret := -1.000000 // sell
							if( atr2 > 0.0006 )
								ret := -0.777778 // sell
				if( up > 0.048001 )
					if( atr2 <= 0.000467 )
						if( up <= 0.048641 )
							if( dn1 <= 0.051131 )
								ret := 0.545455
							if( dn1 > 0.051131 )
								ret := 0.970588 // buy
						if( up > 0.048641 )
							if( atr2 <= 0.000376 )
								ret := 0.550000
							if( atr2 > 0.000376 )
								ret := 0.066667
					if( atr2 > 0.000467 )
						if( dn1 <= 0.051539 )
							if( dn1 <= 0.051488 )
								ret := -0.500000
							if( dn1 > 0.051488 )
								ret := -1.000000 // sell
						if( dn1 > 0.051539 )
							if( dn1 <= 0.052227 )
								ret := 0.333333
							if( dn1 > 0.052227 )
								ret := -0.193750
		if( atr > 0.000747 )
			if( dn <= 0.053805 )
				if( up1 <= 0.042119 )
					if( dn1 <= 0.050268 )
						if( atr2 <= 0.000801 )
							if( dn1 <= 0.034763 )
								ret := 0.978723 // buy
							if( dn1 > 0.034763 )
								ret := 0.714286 // buy
						if( atr2 > 0.000801 )
							if( atr <= 0.001441 )
								ret := 0.035857
							if( atr > 0.001441 )
								ret := 0.488608
					if( dn1 > 0.050268 )
						if( atr <= 0.002139 )
							if( atr <= 0.001675 )
								ret := -0.571429
							if( atr > 0.001675 )
								ret := -1.000000 // sell
						if( atr > 0.002139 )
							if( atr2 <= 0.002519 )
								ret := 0.733333 // buy
							if( atr2 > 0.002519 )
								ret := -0.655172
				if( up1 > 0.042119 )
					if( atr <= 0.001631 )
						if( up <= 0.04865 )
							if( up <= 0.047423 )
								ret := 0.649770
							if( up > 0.047423 )
								ret := 0.893805 // buy
						if( up > 0.04865 )
							ret := -0.153846
					if( atr > 0.001631 )
						ret := -0.400000
			if( dn > 0.053805 )
				if( up1 <= 0.049321 )
					if( atr <= 0.001478 )
						if( atr2 <= 0.00139 )
							if( atr <= 0.001387 )
								ret := -0.364162
							if( atr > 0.001387 )
								ret := 0.777778 // buy
						if( atr2 > 0.00139 )
							if( atr2 <= 0.00147 )
								ret := -1.000000 // sell
							if( atr2 > 0.00147 )
								ret := -0.857143 // sell
					if( atr > 0.001478 )
						if( up <= 0.041073 )
							if( up1 <= 0.0234 )
								ret := 0.707317 // buy
							if( up1 > 0.0234 )
								ret := -0.461538
						if( up > 0.041073 )
							if( up <= 0.048819 )
								ret := 0.479167
							if( up > 0.048819 )
								ret := -0.129630
				if( up1 > 0.049321 )
					if( up <= 0.051459 )
						if( dn1 <= 0.064069 )
							if( up <= 0.050205 )
								ret := 0.503759
							if( up > 0.050205 )
								ret := 0.131868
						if( dn1 > 0.064069 )
							ret := 1.000000 // buy
					if( up > 0.051459 )
						ret := -0.888889 // sell
	if( up1 > 0.050456 )
		if( atr <= 0.002373 )
			if( up <= 0.310975 )
				if( dn <= 0.14446 )
					if( dn1 <= 0.14142 )
						if( up <= 0.073542 )
							if( dn <= 0.074658 )
								ret := 0.041421
							if( dn > 0.074658 )
								ret := 0.163087
						if( up > 0.073542 )
							if( atr2 <= 0.000585 )
								ret := -0.027905
							if( atr2 > 0.000585 )
								ret := 0.034785
					if( dn1 > 0.14142 )
						if( dn <= 0.141815 )
							if( dn <= 0.14051 )
								ret := -0.571429
							if( dn > 0.14051 )
								ret := 0.632184
						if( dn > 0.141815 )
							if( up1 <= 0.139317 )
								ret := 0.156210
							if( up1 > 0.139317 )
								ret := -0.297297
				if( dn > 0.14446 )
					if( up <= 0.136588 )
						if( atr2 <= 0.001519 )
							if( up <= 0.136028 )
								ret := -0.750000 // sell
							if( up > 0.136028 )
								ret := -1.000000 // sell
						if( atr2 > 0.001519 )
							if( up1 <= 0.13648 )
								ret := -0.225108
							if( up1 > 0.13648 )
								ret := -1.000000 // sell
					if( up > 0.136588 )
						if( dn1 <= 0.24606 )
							if( atr2 <= 0.002559 )
								ret := -0.016243
							if( atr2 > 0.002559 )
								ret := -0.300000
						if( dn1 > 0.24606 )
							if( atr2 <= 0.001143 )
								ret := 0.843750 // buy
							if( atr2 > 0.001143 )
								ret := 0.055838
			if( up > 0.310975 )
				if( up1 <= 0.31488 )
					if( up1 <= 0.311416 )
						ret := -0.428571
					if( up1 > 0.311416 )
						if( up <= 0.313352 )
							ret := -1.000000 // sell
						if( up > 0.313352 )
							if( atr2 <= 0.002434 )
								ret := -0.666667
							if( atr2 > 0.002434 )
								ret := -1.000000 // sell
				if( up1 > 0.31488 )
					if( up <= 0.316007 )
						ret := 0.714286 // buy
					if( up > 0.316007 )
						if( dn <= 0.331639 )
							if( dn <= 0.329943 )
								ret := -1.000000 // sell
							if( dn > 0.329943 )
								ret := -0.857143 // sell
						if( dn > 0.331639 )
							if( up <= 0.36529 )
								ret := -0.071429
							if( up > 0.36529 )
								ret := -0.636364
		if( atr > 0.002373 )
			if( up <= 0.236195 )
				if( dn1 <= 0.243666 )
					if( dn <= 0.216523 )
						if( up1 <= 0.175234 )
							if( dn1 <= 0.208812 )
								ret := 0.148815
							if( dn1 > 0.208812 )
								ret := -0.500000
						if( up1 > 0.175234 )
							if( dn <= 0.208343 )
								ret := 0.181364
							if( dn > 0.208343 )
								ret := 0.437186
					if( dn > 0.216523 )
						if( atr <= 0.011367 )
							if( up1 <= 0.184872 )
								ret := -0.721519 // sell
							if( up1 > 0.184872 )
								ret := -0.040552
						if( atr > 0.011367 )
							ret := 1.000000 // buy
				if( dn1 > 0.243666 )
					if( dn <= 0.270646 )
						if( dn <= 0.261312 )
							if( atr <= 0.007086 )
								ret := 0.338327
							if( atr > 0.007086 )
								ret := 0.000000
						if( dn > 0.261312 )
							if( up <= 0.222497 )
								ret := 0.770000 // buy
							if( up > 0.222497 )
								ret := 0.445946
					if( dn > 0.270646 )
						if( dn1 <= 0.305985 )
							if( up1 <= 0.230543 )
								ret := -0.074074
							if( up1 > 0.230543 )
								ret := -0.769231 // sell
						if( dn1 > 0.305985 )
							if( atr <= 0.020735 )
								ret := 0.900000 // buy
							if( atr > 0.020735 )
								ret := 0.139706
			if( up > 0.236195 )
				if( up1 <= 0.264866 )
					if( dn1 <= 0.405683 )
						if( up1 <= 0.256812 )
							if( atr2 <= 0.005334 )
								ret := -0.124063
							if( atr2 > 0.005334 )
								ret := 0.083214
						if( up1 > 0.256812 )
							if( atr2 <= 0.002858 )
								ret := 0.194444
							if( atr2 > 0.002858 )
								ret := -0.329815
					if( dn1 > 0.405683 )
						if( atr <= 0.032293 )
							if( atr <= 0.025678 )
								ret := -0.857143 // sell
							if( atr > 0.025678 )
								ret := -1.000000 // sell
						if( atr > 0.032293 )
							ret := -0.636364
				if( up1 > 0.264866 )
					if( up <= 0.31099 )
						if( up1 <= 0.306105 )
							if( atr <= 0.018039 )
								ret := 0.105549
							if( atr > 0.018039 )
								ret := -0.290323
						if( up1 > 0.306105 )
							if( atr2 <= 0.002318 )
								ret := -0.777778 // sell
							if( atr2 > 0.002318 )
								ret := 0.512500
					if( up > 0.31099 )
						if( atr2 <= 0.01384 )
							if( up <= 0.477877 )
								ret := -0.085648
							if( up > 0.477877 )
								ret := -0.558659
						if( atr2 > 0.01384 )
							if( dn1 <= 0.620241 )
								ret := 0.192024
							if( dn1 > 0.620241 )
								ret := -0.103194
	
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
float op_operation = decision_tree_0_DOGEUSDT_30Min_84949a61(dn1, trend, atr, atr2, buySignalInt, sellSignalInt, up1, up, dn)

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


