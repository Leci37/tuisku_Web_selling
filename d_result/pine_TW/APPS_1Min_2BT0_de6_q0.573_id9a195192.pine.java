//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: APPS_1Min_2BT0_9a195192 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_APPS_1Min_2BT0_9a195192", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_APPS_1Min_9a195192(bullPower, bbp, bearPower, bbm, BBPower_Color, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( bullPower <= 0.001281 )
		if( bbp <= -0.03513 )
			if( ema2 <= 4.24993 )
				if( bbm <= 0.001132 )
					if( ema13 <= -0.064643 )
						if( bbp <= -0.118723 )
							ret := -0.875000 // sell
						if( bbp > -0.118723 )
							ret := -1.000000 // sell
					if( ema13 > -0.064643 )
						if( bearPower <= -0.02216 )
							ret := 0.620301
						if( bearPower > -0.02216 )
							ret := 0.125828
				if( bbm > 0.001132 )
					if( ema3 <= 2.86111 )
						if( ema3 <= 1.99782 )
							ret := 0.042478
						if( ema3 > 1.99782 )
							ret := 0.344943
					if( ema3 > 2.86111 )
						if( ema2 <= 2.89462 )
							ret := -0.440559
						if( ema2 > 2.89462 )
							ret := 0.161433
			if( ema2 > 4.24993 )
				if( ema13 <= -0.001907 )
					if( ema13 <= -0.080693 )
						ret := 0.500000
					if( ema13 > -0.080693 )
						ret := -1.000000 // sell
				if( ema13 > -0.001907 )
					ret := 1.000000 // buy
		if( bbp > -0.03513 )
			if( ema13 <= -0.013026 )
				if( ema2 <= 2.93163 )
					if( ema1 <= 1.63469 )
						if( bullPower <= -0.014472 )
							ret := 0.666667
						if( bullPower > -0.014472 )
							ret := -0.430108
					if( ema1 > 1.63469 )
						if( ema1 <= 1.65512 )
							ret := 1.000000 // buy
						if( ema1 > 1.65512 )
							ret := 0.006021
				if( ema2 > 2.93163 )
					if( tema <= 3.06175 )
						if( ema12 <= -0.0168 )
							ret := 1.000000 // buy
						if( ema12 > -0.0168 )
							ret := -0.526786
					if( tema > 3.06175 )
						if( ema1 <= 3.09754 )
							ret := 0.815789 // buy
						if( ema1 > 3.09754 )
							ret := -0.150628
			if( ema13 > -0.013026 )
				if( ema13 <= 0.010978 )
					if( bullPower <= -0.010678 )
						if( ema12 <= -0.002999 )
							ret := 0.187947
						if( ema12 > -0.002999 )
							ret := 0.571970
					if( bullPower > -0.010678 )
						if( ema2 <= 3.64419 )
							ret := 0.065961
						if( ema2 > 3.64419 )
							ret := -0.211127
				if( ema13 > 0.010978 )
					if( ema2 <= 3.21489 )
						if( tema <= 2.79605 )
							ret := 0.500000
						if( tema > 2.79605 )
							ret := 0.866667 // buy
					if( ema2 > 3.21489 )
						if( tema <= 3.28373 )
							ret := -1.000000 // sell
						if( tema > 3.28373 )
							ret := 0.158730
	if( bullPower > 0.001281 )
		if( bbm <= 0.004799 )
			if( bearPower <= 0.022979 )
				if( ema13 <= 0.018361 )
					if( ema13 <= -0.009881 )
						if( tema <= 3.99746 )
							ret := -0.739645 // sell
						if( tema > 3.99746 )
							ret := 0.214286
					if( ema13 > -0.009881 )
						if( bullPower <= 0.006649 )
							ret := -0.096927
						if( bullPower > 0.006649 )
							ret := -0.234699
				if( ema13 > 0.018361 )
					if( ema1 <= 1.51337 )
						ret := -1.000000 // sell
					if( ema1 > 1.51337 )
						if( ema3 <= 1.60073 )
							ret := 0.720930 // buy
						if( ema3 > 1.60073 )
							ret := 0.100396
			if( bearPower > 0.022979 )
				if( bearPower <= 0.040134 )
					if( ema1 <= 1.70506 )
						if( bearPower <= 0.024748 )
							ret := -0.500000
						if( bearPower > 0.024748 )
							ret := -1.000000 // sell
					if( ema1 > 1.70506 )
						if( ema2 <= 1.85271 )
							ret := 0.230769
						if( ema2 > 1.85271 )
							ret := -0.371534
				if( bearPower > 0.040134 )
					if( ema1 <= 3.47544 )
						if( tema <= 3.48554 )
							ret := -0.709845 // sell
						if( tema > 3.48554 )
							ret := 1.000000 // buy
					if( ema1 > 3.47544 )
						if( bullPower <= 0.043963 )
							ret := -0.428571
						if( bullPower > 0.043963 )
							ret := -1.000000 // sell
		if( bbm > 0.004799 )
			if( ema1 <= 1.42478 )
				if( ema2 <= 1.42348 )
					if( ema1 <= 1.42441 )
						if( bullPower <= 0.005829 )
							ret := 0.042553
						if( bullPower > 0.005829 )
							ret := 0.464789
					if( ema1 > 1.42441 )
						ret := -0.785714 // sell
				if( ema2 > 1.42348 )
					if( bullPower <= 0.005579 )
						if( ema3 <= 1.4238 )
							ret := 0.333333
						if( ema3 > 1.4238 )
							ret := 0.898734 // buy
					if( bullPower > 0.005579 )
						if( bbm <= 0.009981 )
							ret := 0.650000
						if( bbm > 0.009981 )
							ret := 0.000000
			if( ema1 > 1.42478 )
				if( ema1 <= 1.42928 )
					if( bbp <= -0.000843 )
						if( tema <= 1.42511 )
							ret := 0.000000
						if( tema > 1.42511 )
							ret := -0.962264 // sell
					if( bbp > -0.000843 )
						if( bbp <= -0.000739 )
							ret := 1.000000 // buy
						if( bbp > -0.000739 )
							ret := -0.368421
				if( ema1 > 1.42928 )
					if( ema13 <= 0.060158 )
						if( tema <= 4.26579 )
							ret := -0.019964
						if( tema > 4.26579 )
							ret := -0.787234 // sell
					if( ema13 > 0.060158 )
						if( ema3 <= 3.10744 )
							ret := 0.382134
						if( ema3 > 3.10744 )
							ret := -0.068293
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_APPS_1Min_9a195192(bullPower, bbp, bearPower, bbm, BBPower_Color, ema3, tema, ema2, ema12, ema13, ema1)

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


