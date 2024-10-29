//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power
// ID_model: PYPL_1Hour_1B00_9ca775a3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PYPL_1Hour_1B00_9ca775a3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PYPL_1Hour_9ca775a3(bearPower, bbm, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( bbp <= 3.9685 )
		if( bbp <= -2.24356 )
			if( bullPower <= -0.951349 )
				if( bbm <= 0.094629 )
					if( bbp <= -4.61937 )
						if( bullPower <= -2.81882 )
							ret := 0.000000
						if( bullPower > -2.81882 )
							ret := 1.000000 // buy
					if( bbp > -4.61937 )
						if( bullPower <= -2.04911 )
							ret := -0.750000 // sell
						if( bullPower > -2.04911 )
							ret := 0.279661
				if( bbm > 0.094629 )
					if( bullPower <= -1.91219 )
						if( bearPower <= -2.27093 )
							ret := 0.113912
						if( bearPower > -2.27093 )
							ret := -1.000000 // sell
					if( bullPower > -1.91219 )
						if( bbp <= -4.65132 )
							ret := -0.279373
						if( bbp > -4.65132 )
							ret := -0.018018
			if( bullPower > -0.951349 )
				if( bbm <= 0.64277 )
					if( bullPower <= -0.932358 )
						if( bearPower <= -1.37021 )
							ret := 0.176471
						if( bearPower > -1.37021 )
							ret := -1.000000 // sell
					if( bullPower > -0.932358 )
						if( bullPower <= -0.922872 )
							ret := 1.000000 // buy
						if( bullPower > -0.922872 )
							ret := 0.788462 // buy
				if( bbm > 0.64277 )
					if( bbp <= -4.05885 )
						if( bearPower <= -3.55487 )
							ret := -0.062500
						if( bearPower > -3.55487 )
							ret := -0.928571 // sell
					if( bbp > -4.05885 )
						if( bearPower <= -1.85921 )
							ret := 0.197851
						if( bearPower > -1.85921 )
							ret := -0.021201
		if( bbp > -2.24356 )
			if( bearPower <= -1.18689 )
				if( bearPower <= -1.40904 )
					if( bbm <= 6.60702 )
						if( bbm <= 1.355 )
							ret := -0.242424
						if( bbm > 1.355 )
							ret := 0.015404
					if( bbm > 6.60702 )
						if( bbp <= 1.99105 )
							ret := -0.857143 // sell
						if( bbp > 1.99105 )
							ret := -0.363636
				if( bearPower > -1.40904 )
					if( bbp <= -2.12148 )
						if( bbm <= 0.442527 )
							ret := 0.027027
						if( bbm > 0.442527 )
							ret := 0.647059
					if( bbp > -2.12148 )
						if( bbp <= -2.07655 )
							ret := -0.647059
						if( bbp > -2.07655 )
							ret := -0.262376
			if( bearPower > -1.18689 )
				if( bbm <= 1.18232 )
					if( bbp <= 3.39403 )
						if( bearPower <= 0.611042 )
							ret := -0.022964
						if( bearPower > 0.611042 )
							ret := 0.051271
					if( bbp > 3.39403 )
						if( bbp <= 3.6398 )
							ret := -0.470588
						if( bbp > 3.6398 )
							ret := -0.064865
				if( bbm > 1.18232 )
					if( bbm <= 1.73179 )
						if( bbm <= 1.71031 )
							ret := 0.130726
						if( bbm > 1.71031 )
							ret := 0.641509
					if( bbm > 1.73179 )
						if( bbp <= 0.103261 )
							ret := -0.395062
						if( bbp > 0.103261 )
							ret := 0.011897
	if( bbp > 3.9685 )
		if( bbm <= 0.5782 )
			if( bbp <= 5.99737 )
				if( bullPower <= 2.57405 )
					if( bbm <= 0.075289 )
						if( bbm <= 0.005 )
							ret := -0.333333
						if( bbm > 0.005 )
							ret := 0.565217
					if( bbm > 0.075289 )
						if( bearPower <= 2.27136 )
							ret := -0.341176
						if( bearPower > 2.27136 )
							ret := -1.000000 // sell
				if( bullPower > 2.57405 )
					if( bbp <= 4.92722 )
						ret := 0.888889 // buy
					if( bbp > 4.92722 )
						if( bbp <= 5.73741 )
							ret := -0.100000
						if( bbp > 5.73741 )
							ret := 0.521739
			if( bbp > 5.99737 )
				if( bbm <= 0.398284 )
					if( bearPower <= 2.94272 )
						ret := -1.000000 // sell
					if( bearPower > 2.94272 )
						if( bbm <= 0.105909 )
							ret := -1.000000 // sell
						if( bbm > 0.105909 )
							ret := -0.470588
				if( bbm > 0.398284 )
					if( bbp <= 6.44854 )
						if( bullPower <= 3.35498 )
							ret := 0.500000
						if( bullPower > 3.35498 )
							ret := -0.750000 // sell
					if( bbp > 6.44854 )
						if( bbm <= 0.46 )
							ret := -0.250000
						if( bbm > 0.46 )
							ret := 0.500000
		if( bbm > 0.5782 )
			if( bbp <= 10.8167 )
				if( bbp <= 4.11384 )
					if( bullPower <= 2.80553 )
						if( bbp <= 4.04141 )
							ret := 0.894737 // buy
						if( bbp > 4.04141 )
							ret := 0.620690
					if( bullPower > 2.80553 )
						if( bearPower <= 0.957182 )
							ret := 0.578947
						if( bearPower > 0.957182 )
							ret := -0.600000
				if( bbp > 4.11384 )
					if( bullPower <= 6.0667 )
						if( bbm <= 5.64683 )
							ret := 0.152766
						if( bbm > 5.64683 )
							ret := -0.541667
					if( bullPower > 6.0667 )
						if( bbp <= 10.4057 )
							ret := 0.671053
						if( bbp > 10.4057 )
							ret := 0.000000
			if( bbp > 10.8167 )
				if( bullPower <= 8.36777 )
					if( bullPower <= 8.03421 )
						ret := -0.714286 // sell
					if( bullPower > 8.03421 )
						ret := 0.666667
				if( bullPower > 8.36777 )
					if( bbp <= 20.6153 )
						if( bearPower <= 5.23411 )
							ret := -1.000000 // sell
						if( bearPower > 5.23411 )
							ret := -0.800000 // sell
					if( bbp > 20.6153 )
						ret := 0.000000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
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
float op_operation = decision_tree_0_PYPL_1Hour_9ca775a3(bearPower, bbm, bbp, bullPower, BBPower_Color)

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


