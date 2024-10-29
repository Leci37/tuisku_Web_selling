//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power
// ID_model: ASAN_30Min_1B00_b8de2050 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ASAN_30Min_1B00_b8de2050", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ASAN_30Min_b8de2050(bullPower, bbp, bearPower, bbm, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( bullPower <= -0.012071 )
		if( bearPower <= -6.23615 )
			if( bbp <= -11.8652 )
				if( bbp <= -14.0482 )
					if( bearPower <= -11.9962 )
						ret := -1.000000 // sell
					if( bearPower > -11.9962 )
						ret := -0.500000
				if( bbp > -14.0482 )
					ret := 0.111111
			if( bbp > -11.8652 )
				if( bbp <= -10.7476 )
					ret := -1.000000 // sell
				if( bbp > -10.7476 )
					ret := -0.900000 // sell
		if( bearPower > -6.23615 )
			if( bbm <= 0.002179 )
				if( bbp <= -0.539597 )
					if( bullPower <= -0.579 )
						if( bullPower <= -0.770937 )
							ret := 0.424779
						if( bullPower > -0.770937 )
							ret := -0.202381
					if( bullPower > -0.579 )
						if( bbp <= -0.72805 )
							ret := 0.709091 // buy
						if( bbp > -0.72805 )
							ret := 0.342742
				if( bbp > -0.539597 )
					if( bullPower <= -0.197829 )
						if( bearPower <= -0.202715 )
							ret := -0.120879
						if( bearPower > -0.202715 )
							ret := -0.933333 // sell
					if( bullPower > -0.197829 )
						if( bullPower <= -0.168784 )
							ret := 0.573427
						if( bullPower > -0.168784 )
							ret := 0.121752
			if( bbm > 0.002179 )
				if( bullPower <= -0.861998 )
					if( bbm <= 1.59673 )
						if( bullPower <= -1.01056 )
							ret := 0.213256
						if( bullPower > -1.01056 )
							ret := 0.561497
					if( bbm > 1.59673 )
						if( bbm <= 1.8439 )
							ret := -0.657895
						if( bbm > 1.8439 )
							ret := 0.024590
				if( bullPower > -0.861998 )
					if( bbp <= -0.13796 )
						if( bearPower <= -0.101051 )
							ret := 0.044768
						if( bearPower > -0.101051 )
							ret := -0.610390
					if( bbp > -0.13796 )
						if( bbm <= 0.009743 )
							ret := -0.351351
						if( bbm > 0.009743 )
							ret := 0.294671
	if( bullPower > -0.012071 )
		if( bbp <= 0.982461 )
			if( bbp <= 0.27984 )
				if( bullPower <= 0.232309 )
					if( bearPower <= 0.018932 )
						if( bullPower <= 0.218118 )
							ret := -0.016132
						if( bullPower > 0.218118 )
							ret := 0.320442
					if( bearPower > 0.018932 )
						if( bbp <= 0.044658 )
							ret := -0.735294 // sell
						if( bbp > 0.044658 )
							ret := -0.119389
				if( bullPower > 0.232309 )
					if( bullPower <= 0.418102 )
						if( bbm <= 0.83088 )
							ret := -0.164319
						if( bbm > 0.83088 )
							ret := -0.376543
					if( bullPower > 0.418102 )
						if( bullPower <= 0.421529 )
							ret := 0.846154 // buy
						if( bullPower > 0.421529 )
							ret := -0.053284
			if( bbp > 0.27984 )
				if( bbm <= 0.001766 )
					if( bullPower <= 0.338162 )
						if( bearPower <= 0.327026 )
							ret := -0.122476
						if( bearPower > 0.327026 )
							ret := 0.357143
					if( bullPower > 0.338162 )
						if( bbp <= 0.731436 )
							ret := -0.666667
						if( bbp > 0.731436 )
							ret := -0.354037
				if( bbm > 0.001766 )
					if( bbp <= 0.307839 )
						if( bullPower <= 0.510365 )
							ret := 0.392617
						if( bullPower > 0.510365 )
							ret := -0.242424
					if( bbp > 0.307839 )
						if( bearPower <= 0.128027 )
							ret := -0.044509
						if( bearPower > 0.128027 )
							ret := 0.111605
		if( bbp > 0.982461 )
			if( bbm <= 0.212277 )
				if( bearPower <= 0.538375 )
					if( bbp <= 1.04501 )
						if( bearPower <= 0.50144 )
							ret := -0.040000
						if( bearPower > 0.50144 )
							ret := -0.714286 // sell
					if( bbp > 1.04501 )
						if( bbp <= 1.17135 )
							ret := -0.833333 // sell
						if( bbp > 1.17135 )
							ret := -0.600000
				if( bearPower > 0.538375 )
					if( bearPower <= 0.706464 )
						if( bbp <= 1.3431 )
							ret := -0.198198
						if( bbp > 1.3431 )
							ret := 0.447368
					if( bearPower > 0.706464 )
						if( bbp <= 1.45468 )
							ret := -0.833333 // sell
						if( bbp > 1.45468 )
							ret := -0.412698
			if( bbm > 0.212277 )
				if( bearPower <= 0.22368 )
					if( bearPower <= 0.212911 )
						if( bbm <= 0.715445 )
							ret := 0.642857
						if( bbm > 0.715445 )
							ret := -0.228304
					if( bearPower > 0.212911 )
						ret := -1.000000 // sell
				if( bearPower > 0.22368 )
					if( bbp <= 1.05828 )
						if( bearPower <= 0.374804 )
							ret := -0.625000
						if( bearPower > 0.374804 )
							ret := 0.111111
					if( bbp > 1.05828 )
						if( bbm <= 0.469561 )
							ret := -0.139021
						if( bbm > 0.469561 )
							ret := 0.071084
	
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
float op_operation = decision_tree_0_ASAN_30Min_b8de2050(bullPower, bbp, bearPower, bbm, BBPower_Color)

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


