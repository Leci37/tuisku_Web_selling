//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power
// ID_model: GTLB_15Min_1B00_5fc71897 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GTLB_15Min_1B00_5fc71897", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GTLB_15Min_5fc71897(bearPower, bbm, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.82,max_leaf_nodes=30, random_state=843828734)
	if( bullPower <= -0.888706 )
		if( bbm <= 0.027991 )
			if( bearPower <= -0.974276 )
				ret := 0.626335
			if( bearPower > -0.974276 )
				if( bbm <= 0.00081 )
					ret := -0.344828
				if( bbm > 0.00081 )
					ret := 0.875000 // buy
		if( bbm > 0.027991 )
			if( bullPower <= -0.912801 )
				if( bearPower <= -3.53859 )
					if( bbp <= -6.18323 )
						if( bullPower <= -1.79972 )
							ret := 0.261364
						if( bullPower > -1.79972 )
							ret := -0.714286 // sell
					if( bbp > -6.18323 )
						ret := 0.698925
				if( bearPower > -3.53859 )
					if( bullPower <= -1.42192 )
						if( bbp <= -4.36455 )
							ret := -0.016736
						if( bbp > -4.36455 )
							ret := -0.500000
					if( bullPower > -1.42192 )
						ret := 0.141852
			if( bullPower > -0.912801 )
				ret := 0.563025
	if( bullPower > -0.888706 )
		if( bbp <= 0.51586 )
			if( bbp <= -2.10269 )
				if( bbm <= 0.5875 )
					ret := -0.806452 // sell
				if( bbm > 0.5875 )
					if( bullPower <= -0.719929 )
						ret := 0.131474
					if( bullPower > -0.719929 )
						if( bearPower <= -1.96851 )
							ret := 0.002950
						if( bearPower > -1.96851 )
							ret := -0.430830
			if( bbp > -2.10269 )
				if( bullPower <= -0.842661 )
					ret := -0.569231
				if( bullPower > -0.842661 )
					if( bullPower <= -0.636561 )
						if( bbp <= -1.2885 )
							ret := 0.241915
						if( bbp > -1.2885 )
							ret := -0.764706 // sell
					if( bullPower > -0.636561 )
						if( bullPower <= -0.553084 )
							ret := -0.225722
						if( bullPower > -0.553084 )
							ret := 0.019847
		if( bbp > 0.51586 )
			if( bbm <= 0.00888 )
				if( bullPower <= 0.862629 )
					if( bbp <= 1.39575 )
						if( bullPower <= 0.634206 )
							ret := -0.228346
						if( bullPower > 0.634206 )
							ret := -0.714286 // sell
					if( bbp > 1.39575 )
						if( bearPower <= 0.809397 )
							ret := 0.395833
						if( bearPower > 0.809397 )
							ret := -0.277778
				if( bullPower > 0.862629 )
					ret := -0.653257
			if( bbm > 0.00888 )
				if( bbp <= 1.97156 )
					if( bbp <= 1.83322 )
						if( bullPower <= 2.0577 )
							ret := -0.035543
						if( bullPower > 2.0577 )
							ret := -0.755102 // sell
					if( bbp > 1.83322 )
						ret := -0.399293
				if( bbp > 1.97156 )
					if( bbm <= 1.7668 )
						if( bearPower <= 1.77976 )
							ret := 0.123239
						if( bearPower > 1.77976 )
							ret := 0.508000
					if( bbm > 1.7668 )
						ret := -0.225000
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_GTLB_15Min_5fc71897(bearPower, bbm, bbp, bullPower, BBPower_Color)

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


