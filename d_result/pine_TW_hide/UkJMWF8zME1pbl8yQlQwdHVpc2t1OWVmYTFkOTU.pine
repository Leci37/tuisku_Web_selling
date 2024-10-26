//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: RBLX_30Min_2BT0_9efa1d95 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_RBLX_30Min_2BT0_9efa1d95", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_RBLX_30Min_9efa1d95(bbp, bullPower, BBPower_Color, bearPower, bbm, ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( tema <= 40.7227 )
		if( bbp <= -0.738647 )
			if( tema <= 23.8488 )
				if( tema <= 22.3879 )
					ret := 1.000000 // buy
				if( tema > 22.3879 )
					ret := 0.900000 // buy
			if( tema > 23.8488 )
				if( ema3 <= 42.2356 )
					if( bbm <= 1.57654 )
						if( bullPower <= -1.25767 )
							ret := -0.485915
						if( bullPower > -1.25767 )
							ret := -0.076317
					if( bbm > 1.57654 )
						if( ema13 <= -0.16394 )
							ret := 0.489796
						if( ema13 > -0.16394 )
							ret := -0.777778 // sell
				if( ema3 > 42.2356 )
					if( bbp <= -5.49134 )
						ret := 0.333333
					if( bbp > -5.49134 )
						if( bbm <= 0.44755 )
							ret := 0.500000
						if( bbm > 0.44755 )
							ret := 0.947368 // buy
		if( bbp > -0.738647 )
			if( bearPower <= -0.015898 )
				if( ema3 <= 27.5472 )
					if( bbp <= -0.269543 )
						if( ema2 <= 27.1807 )
							ret := 0.579882
						if( ema2 > 27.1807 )
							ret := 1.000000 // buy
					if( bbp > -0.269543 )
						if( ema1 <= 27.0559 )
							ret := -0.038062
						if( ema1 > 27.0559 )
							ret := 0.605769
				if( ema3 > 27.5472 )
					if( tema <= 27.8995 )
						if( bearPower <= -0.448371 )
							ret := -0.850000 // sell
						if( bearPower > -0.448371 )
							ret := -0.113300
					if( tema > 27.8995 )
						if( ema3 <= 31.0767 )
							ret := 0.251150
						if( ema3 > 31.0767 )
							ret := 0.098305
			if( bearPower > -0.015898 )
				if( ema13 <= 0.061922 )
					if( ema2 <= 39.9233 )
						if( bbm <= 0.25995 )
							ret := -0.294046
						if( bbm > 0.25995 )
							ret := 0.029412
					if( ema2 > 39.9233 )
						if( ema13 <= -0.129132 )
							ret := -0.250000
						if( ema13 > -0.129132 )
							ret := 0.753623 // buy
				if( ema13 > 0.061922 )
					if( ema3 <= 24.9312 )
						if( ema3 <= 24.2293 )
							ret := -1.000000 // sell
						if( ema3 > 24.2293 )
							ret := -0.900000 // sell
					if( ema3 > 24.9312 )
						if( ema3 <= 26.3847 )
							ret := 0.608333
						if( ema3 > 26.3847 )
							ret := 0.054808
	if( tema > 40.7227 )
		if( bearPower <= -0.328277 )
			if( bearPower <= -5.70806 )
				if( bearPower <= -8.83114 )
					ret := 0.000000
				if( bearPower > -8.83114 )
					if( ema13 <= -1.81277 )
						ret := -1.000000 // sell
					if( ema13 > -1.81277 )
						ret := -0.875000 // sell
			if( bearPower > -5.70806 )
				if( ema2 <= 64.436 )
					if( ema3 <= 63.0164 )
						if( tema <= 58.2676 )
							ret := -0.075257
						if( tema > 58.2676 )
							ret := 0.836364 // buy
					if( ema3 > 63.0164 )
						if( bbm <= 0.618302 )
							ret := -0.095238
						if( bbm > 0.618302 )
							ret := -0.816092 // sell
				if( ema2 > 64.436 )
					if( tema <= 65.4727 )
						if( ema12 <= -0.443257 )
							ret := 0.751479 // buy
						if( ema12 > -0.443257 )
							ret := -0.103448
					if( tema > 65.4727 )
						if( bbm <= 0.463636 )
							ret := 0.244074
						if( bbm > 0.463636 )
							ret := 0.008547
		if( bearPower > -0.328277 )
			if( bullPower <= 2.40148 )
				if( tema <= 126.468 )
					if( ema2 <= 79.0113 )
						if( ema3 <= 75.9666 )
							ret := -0.128040
						if( ema3 > 75.9666 )
							ret := 0.125581
					if( ema2 > 79.0113 )
						if( ema1 <= 80.6426 )
							ret := -0.611111
						if( ema1 > 80.6426 )
							ret := -0.204492
				if( tema > 126.468 )
					if( ema13 <= 1.60486 )
						if( bullPower <= 0.852848 )
							ret := 0.888889 // buy
						if( bullPower > 0.852848 )
							ret := -0.320000
					if( ema13 > 1.60486 )
						if( bbm <= 0.779261 )
							ret := 0.700000 // buy
						if( bbm > 0.779261 )
							ret := 1.000000 // buy
			if( bullPower > 2.40148 )
				if( ema13 <= 4.78 )
					if( bbm <= 2.68973 )
						if( ema13 <= 0.837216 )
							ret := -0.521739
						if( ema13 > 0.837216 )
							ret := 0.155431
					if( bbm > 2.68973 )
						if( bbp <= 8.65176 )
							ret := 0.713115 // buy
						if( bbp > 8.65176 )
							ret := -0.600000
				if( ema13 > 4.78 )
					if( bullPower <= 5.03542 )
						ret := -0.545455
					if( bullPower > 5.03542 )
						ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_RBLX_30Min_9efa1d95(bbp, bullPower, BBPower_Color, bearPower, bbm, ema2, ema1, ema12, ema3, ema13, tema)

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


