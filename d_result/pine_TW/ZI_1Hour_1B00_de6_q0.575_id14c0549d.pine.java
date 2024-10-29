//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power
// ID_model: ZI_1Hour_1B00_14c0549d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ZI_1Hour_1B00_14c0549d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ZI_1Hour_14c0549d(bbp, bullPower, BBPower_Color, bearPower, bbm)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( bbp <= 1.74248 )
		if( bearPower <= 0.838601 )
			if( bearPower <= -1.79031 )
				if( bullPower <= -1.29595 )
					if( bbm <= 1.13943 )
						if( bbm <= 0.184385 )
							ret := 0.666667
						if( bbm > 0.184385 )
							ret := -0.255814
					if( bbm > 1.13943 )
						if( bbp <= -6.3685 )
							ret := -0.454545
						if( bbp > -6.3685 )
							ret := 0.741379 // buy
				if( bullPower > -1.29595 )
					if( bbp <= -4.09575 )
						if( bearPower <= -4.4025 )
							ret := -0.714286 // sell
						if( bearPower > -4.4025 )
							ret := -0.187500
					if( bbp > -4.09575 )
						if( bbm <= 3.1512 )
							ret := 0.260788
						if( bbm > 3.1512 )
							ret := 0.724638 // buy
			if( bearPower > -1.79031 )
				if( bullPower <= -1.25393 )
					if( bearPower <= -1.51042 )
						if( bullPower <= -1.41208 )
							ret := 0.413793
						if( bullPower > -1.41208 )
							ret := -0.461538
					if( bearPower > -1.51042 )
						if( bearPower <= -1.38079 )
							ret := 0.541667
						if( bearPower > -1.38079 )
							ret := 0.914286 // buy
				if( bullPower > -1.25393 )
					if( bbp <= -2.61228 )
						if( bbm <= 0.561809 )
							ret := -0.730159 // sell
						if( bbm > 0.561809 )
							ret := -0.035714
					if( bbp > -2.61228 )
						if( bullPower <= 1.4883 )
							ret := -0.004426
						if( bullPower > 1.4883 )
							ret := 0.363057
		if( bearPower > 0.838601 )
			if( bearPower <= 0.850402 )
				ret := 0.833333 // buy
			if( bearPower > 0.850402 )
				ret := 1.000000 // buy
	if( bbp > 1.74248 )
		if( bbp <= 1.91974 )
			if( bullPower <= 1.80182 )
				if( bearPower <= 0.340769 )
					if( bbp <= 1.7831 )
						ret := -1.000000 // sell
					if( bbp > 1.7831 )
						ret := -0.850000 // sell
				if( bearPower > 0.340769 )
					if( bearPower <= 0.403349 )
						ret := 0.266667
					if( bearPower > 0.403349 )
						if( bbp <= 1.81016 )
							ret := -0.153846
						if( bbp > 1.81016 )
							ret := -0.666667
			if( bullPower > 1.80182 )
				ret := 0.230769
		if( bbp > 1.91974 )
			if( bbm <= 3.14086 )
				if( bullPower <= 1.98175 )
					if( bullPower <= 1.74087 )
						if( bearPower <= 1.40124 )
							ret := -0.038801
						if( bearPower > 1.40124 )
							ret := -0.750000 // sell
					if( bullPower > 1.74087 )
						if( bbp <= 2.97856 )
							ret := -0.752941 // sell
						if( bbp > 2.97856 )
							ret := -0.326531
				if( bullPower > 1.98175 )
					if( bbm <= 0.331825 )
						if( bbm <= 0.127738 )
							ret := -0.111111
						if( bbm > 0.127738 )
							ret := -0.954545 // sell
					if( bbm > 0.331825 )
						if( bbm <= 1.33212 )
							ret := 0.336585
						if( bbm > 1.33212 )
							ret := -0.057971
			if( bbm > 3.14086 )
				if( bbm <= 3.88514 )
					if( bearPower <= 0.159394 )
						ret := -0.600000
					if( bearPower > 0.159394 )
						if( bullPower <= 4.03165 )
							ret := -0.900000 // sell
						if( bullPower > 4.03165 )
							ret := -1.000000 // sell
				if( bbm > 3.88514 )
					if( bbm <= 4.65551 )
						ret := 0.692308
					if( bbm > 4.65551 )
						if( bullPower <= 5.31928 )
							ret := -0.545455
						if( bullPower > 5.31928 )
							ret := -0.928571 // sell
	
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
float op_operation = decision_tree_0_ZI_1Hour_14c0549d(bbp, bullPower, BBPower_Color, bearPower, bbm)

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


