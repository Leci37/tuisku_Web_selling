//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power
// ID_model: NVST_15Min_1B00_4aa9ae64 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVST_15Min_1B00_4aa9ae64", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVST_15Min_4aa9ae64(bearPower, bbm, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( bearPower <= -0.738313 )
		if( bullPower <= -0.531133 )
			if( bbp <= -1.60509 )
				if( bbm <= 0.070695 )
					if( bearPower <= -1.09266 )
						ret := 1.000000 // buy
					if( bearPower > -1.09266 )
						if( bbp <= -2.085 )
							ret := 0.250000
						if( bbp > -2.085 )
							ret := 0.916667 // buy
				if( bbm > 0.070695 )
					if( bullPower <= -0.829431 )
						if( bbp <= -2.12785 )
							ret := 0.170732
						if( bbp > -2.12785 )
							ret := -0.615385
					if( bullPower > -0.829431 )
						if( bearPower <= -1.17228 )
							ret := 0.900000 // buy
						if( bearPower > -1.17228 )
							ret := 0.462687
			if( bbp > -1.60509 )
				if( bearPower <= -0.783256 )
					if( bbm <= 0.2597 )
						if( bbp <= -1.3769 )
							ret := -0.785714 // sell
						if( bbp > -1.3769 )
							ret := -1.000000 // sell
					if( bbm > 0.2597 )
						if( bbm <= 0.365541 )
							ret := -0.200000
						if( bbm > 0.365541 )
							ret := 0.777778 // buy
				if( bearPower > -0.783256 )
					if( bullPower <= -0.543079 )
						if( bbp <= -1.33456 )
							ret := 0.545455
						if( bbp > -1.33456 )
							ret := 1.000000 // buy
					if( bullPower > -0.543079 )
						ret := -0.538462
		if( bullPower > -0.531133 )
			if( bbm <= 0.464883 )
				if( bbp <= -1.29289 )
					if( bbp <= -1.36344 )
						ret := 1.000000 // buy
					if( bbp > -1.36344 )
						if( bbp <= -1.35108 )
							ret := -0.454545
						if( bbp > -1.35108 )
							ret := 0.324324
				if( bbp > -1.29289 )
					if( bearPower <= -0.746376 )
						if( bearPower <= -0.828151 )
							ret := 0.400000
						if( bearPower > -0.828151 )
							ret := 0.787879 // buy
					if( bearPower > -0.746376 )
						ret := 0.090909
			if( bbm > 0.464883 )
				if( bullPower <= -0.320465 )
					if( bbp <= -1.40411 )
						if( bearPower <= -1.20193 )
							ret := -0.065217
						if( bearPower > -1.20193 )
							ret := 0.833333 // buy
					if( bbp > -1.40411 )
						if( bullPower <= -0.351943 )
							ret := -0.642857
						if( bullPower > -0.351943 )
							ret := 0.000000
				if( bullPower > -0.320465 )
					if( bbp <= -0.757036 )
						if( bearPower <= -1.36286 )
							ret := 0.767442 // buy
						if( bearPower > -1.36286 )
							ret := 0.314917
					if( bbp > -0.757036 )
						if( bbm <= 1.05275 )
							ret := 0.916667 // buy
						if( bbm > 1.05275 )
							ret := 1.000000 // buy
	if( bearPower > -0.738313 )
		if( bearPower <= 0.36513 )
			if( bullPower <= -0.144102 )
				if( bearPower <= -0.342694 )
					if( bbm <= 0.366862 )
						if( bbp <= -1.07678 )
							ret := -0.211656
						if( bbp > -1.07678 )
							ret := 0.023750
					if( bbm > 0.366862 )
						if( bbm <= 0.474473 )
							ret := 0.449495
						if( bbm > 0.474473 )
							ret := -0.254237
				if( bearPower > -0.342694 )
					if( bbp <= -0.313229 )
						if( bearPower <= -0.331856 )
							ret := 0.700535 // buy
						if( bearPower > -0.331856 )
							ret := 0.137508
					if( bbp > -0.313229 )
						if( bullPower <= -0.147757 )
							ret := 1.000000 // buy
						if( bullPower > -0.147757 )
							ret := 0.615385
			if( bullPower > -0.144102 )
				if( bbm <= 1.11282 )
					if( bearPower <= 0.356909 )
						if( bbp <= 0.512822 )
							ret := 0.000945
						if( bbp > 0.512822 )
							ret := -0.077221
					if( bearPower > 0.356909 )
						if( bullPower <= 0.614052 )
							ret := 0.125000
						if( bullPower > 0.614052 )
							ret := 0.863636 // buy
				if( bbm > 1.11282 )
					if( bearPower <= -0.334939 )
						ret := 0.500000
					if( bearPower > -0.334939 )
						ret := 1.000000 // buy
		if( bearPower > 0.36513 )
			if( bullPower <= 0.465466 )
				if( bullPower <= 0.444221 )
					if( bullPower <= 0.403875 )
						if( bullPower <= 0.39247 )
							ret := 0.461538
						if( bullPower > 0.39247 )
							ret := 0.400000
					if( bullPower > 0.403875 )
						if( bearPower <= 0.412503 )
							ret := -0.555556
						if( bearPower > 0.412503 )
							ret := -1.000000 // sell
				if( bullPower > 0.444221 )
					ret := 1.000000 // buy
			if( bullPower > 0.465466 )
				if( bearPower <= 0.447132 )
					if( bbm <= 0.190331 )
						if( bullPower <= 0.530878 )
							ret := -0.444444
						if( bullPower > 0.530878 )
							ret := 0.319149
					if( bbm > 0.190331 )
						if( bbm <= 0.317538 )
							ret := -0.809783 // sell
						if( bbm > 0.317538 )
							ret := -0.416000
				if( bearPower > 0.447132 )
					if( bearPower <= 0.460274 )
						if( bearPower <= 0.452932 )
							ret := 0.181818
						if( bearPower > 0.452932 )
							ret := 0.780488 // buy
					if( bearPower > 0.460274 )
						if( bbm <= 0.266482 )
							ret := -0.331707
						if( bbm > 0.266482 )
							ret := 0.093633
	
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
float op_operation = decision_tree_0_NVST_15Min_4aa9ae64(bearPower, bbm, bbp, bullPower, BBPower_Color)

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


