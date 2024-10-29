//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power
// ID_model: DDOG_30Min_1B00_c7c3d69a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DDOG_30Min_1B00_c7c3d69a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DDOG_30Min_c7c3d69a(bearPower, bbm, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( bbp <= -0.152739 )
		if( bbp <= -6.32282 )
			if( bullPower <= -1.87755 )
				if( bbm <= 1.48576 )
					if( bbp <= -7.92459 )
						if( bbp <= -9.5463 )
							ret := 0.437500
						if( bbp > -9.5463 )
							ret := -0.529412
					if( bbp > -7.92459 )
						if( bearPower <= -4.02035 )
							ret := 0.064516
						if( bearPower > -4.02035 )
							ret := 0.759259 // buy
				if( bbm > 1.48576 )
					if( bbm <= 2.6625 )
						if( bearPower <= -6.45639 )
							ret := 0.289855
						if( bearPower > -6.45639 )
							ret := 0.671053
					if( bbm > 2.6625 )
						if( bbp <= -7.5895 )
							ret := 0.170588
						if( bbp > -7.5895 )
							ret := 0.734694 // buy
			if( bullPower > -1.87755 )
				if( bearPower <= -6.12424 )
					if( bullPower <= 1.42943 )
						if( bbp <= -9.79332 )
							ret := 0.000000
						if( bbp > -9.79332 )
							ret := 0.880000 // buy
					if( bullPower > 1.42943 )
						if( bbm <= 16.246 )
							ret := -0.750000 // sell
						if( bbm > 16.246 )
							ret := 1.000000 // buy
				if( bearPower > -6.12424 )
					if( bbm <= 3.4524 )
						ret := 0.461538
					if( bbm > 3.4524 )
						if( bullPower <= -1.45081 )
							ret := -0.958333 // sell
						if( bullPower > -1.45081 )
							ret := -0.620690
		if( bbp > -6.32282 )
			if( bearPower <= -4.24255 )
				if( bbp <= -3.93178 )
					if( bbp <= -4.90759 )
						if( bearPower <= -6.96642 )
							ret := 0.052632
						if( bearPower > -6.96642 )
							ret := 0.659574
					if( bbp > -4.90759 )
						if( bullPower <= -0.227906 )
							ret := -0.833333 // sell
						if( bullPower > -0.227906 )
							ret := 0.173077
				if( bbp > -3.93178 )
					if( bbp <= -2.37132 )
						if( bullPower <= 1.66796 )
							ret := 1.000000 // buy
						if( bullPower > 1.66796 )
							ret := 0.636364
					if( bbp > -2.37132 )
						if( bbp <= -1.47619 )
							ret := 0.052632
						if( bbp > -1.47619 )
							ret := 0.833333 // buy
			if( bearPower > -4.24255 )
				if( bbp <= -0.330783 )
					if( bullPower <= -0.035607 )
						if( bearPower <= -4.03614 )
							ret := -0.456522
						if( bearPower > -4.03614 )
							ret := 0.056788
					if( bullPower > -0.035607 )
						if( bbm <= 1.20371 )
							ret := -0.160350
						if( bbm > 1.20371 )
							ret := 0.036509
				if( bbp > -0.330783 )
					if( bbm <= 5.42546 )
						if( bullPower <= -0.15323 )
							ret := 0.704918 // buy
						if( bullPower > -0.15323 )
							ret := 0.116918
					if( bbm > 5.42546 )
						ret := 1.000000 // buy
	if( bbp > -0.152739 )
		if( bullPower <= 0.647289 )
			if( bearPower <= 0.577837 )
				if( bbp <= 0.066326 )
					if( bearPower <= 0.022595 )
						if( bullPower <= 0.363277 )
							ret := -0.061436
						if( bullPower > 0.363277 )
							ret := -0.304786
					if( bearPower > 0.022595 )
						if( bbm <= 4e-06 )
							ret := -0.562500
						if( bbm > 4e-06 )
							ret := -1.000000 // sell
				if( bbp > 0.066326 )
					if( bearPower <= 0.425514 )
						if( bbp <= 0.922819 )
							ret := 0.024153
						if( bbp > 0.922819 )
							ret := 0.561404
					if( bearPower > 0.425514 )
						if( bullPower <= 0.45216 )
							ret := -0.593023
						if( bullPower > 0.45216 )
							ret := -0.191682
			if( bearPower > 0.577837 )
				if( bullPower <= 0.631471 )
					if( bbp <= 1.22826 )
						if( bearPower <= 0.60054 )
							ret := 0.574074
						if( bearPower > 0.60054 )
							ret := 0.000000
					if( bbp > 1.22826 )
						if( bbm <= 0.005 )
							ret := 0.816667 // buy
						if( bbm > 0.005 )
							ret := 0.000000
				if( bullPower > 0.631471 )
					if( bullPower <= 0.64475 )
						if( bearPower <= 0.635838 )
							ret := 0.142857
						if( bearPower > 0.635838 )
							ret := -0.857143 // sell
					if( bullPower > 0.64475 )
						ret := 0.615385
		if( bullPower > 0.647289 )
			if( bbm <= 0.001391 )
				if( bbp <= 2.69573 )
					if( bullPower <= 0.814596 )
						if( bearPower <= 0.651522 )
							ret := 0.200000
						if( bearPower > 0.651522 )
							ret := -0.475806
					if( bullPower > 0.814596 )
						if( bbm <= 5e-06 )
							ret := -0.078616
						if( bbm > 5e-06 )
							ret := -0.764706 // sell
				if( bbp > 2.69573 )
					if( bbp <= 2.82197 )
						if( bullPower <= 1.37544 )
							ret := -1.000000 // sell
						if( bullPower > 1.37544 )
							ret := -0.892857 // sell
					if( bbp > 2.82197 )
						if( bearPower <= 1.62591 )
							ret := -0.061538
						if( bearPower > 1.62591 )
							ret := -0.531034
			if( bbm > 0.001391 )
				if( bbm <= 0.02278 )
					if( bearPower <= 1.06556 )
						if( bearPower <= 1.02559 )
							ret := 0.304348
						if( bearPower > 1.02559 )
							ret := 0.967742 // buy
					if( bearPower > 1.06556 )
						if( bbp <= 3.05966 )
							ret := -0.575758
						if( bbp > 3.05966 )
							ret := 0.153846
				if( bbm > 0.02278 )
					if( bbm <= 0.403511 )
						if( bearPower <= 0.904953 )
							ret := -0.254682
						if( bearPower > 0.904953 )
							ret := -0.073113
					if( bbm > 0.403511 )
						if( bbm <= 0.491101 )
							ret := 0.168210
						if( bbm > 0.491101 )
							ret := -0.069198
	
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
float op_operation = decision_tree_0_DDOG_30Min_c7c3d69a(bearPower, bbm, bbp, bullPower, BBPower_Color)

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


