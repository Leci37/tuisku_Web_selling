//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power
// ID_model: MDB_1Hour_1B00_582bb6b0 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MDB_1Hour_1B00_582bb6b0", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MDB_1Hour_582bb6b0(bearPower, bbm, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( bearPower <= -3.05014 )
		if( bbp <= -15.2334 )
			if( bbp <= -23.7802 )
				if( bearPower <= -22.659 )
					if( bearPower <= -26.5081 )
						if( bbp <= -54.274 )
							ret := -0.481481
						if( bbp > -54.274 )
							ret := 0.166667
					if( bearPower > -26.5081 )
						if( bbm <= 22.1316 )
							ret := -0.627907
						if( bbm > 22.1316 )
							ret := 1.000000 // buy
				if( bearPower > -22.659 )
					if( bbp <= -28.8916 )
						if( bbm <= 9.22547 )
							ret := 0.263158
						if( bbm > 9.22547 )
							ret := 1.000000 // buy
					if( bbp > -28.8916 )
						if( bbm <= 5.2384 )
							ret := 0.315068
						if( bbm > 5.2384 )
							ret := -0.254545
			if( bbp > -23.7802 )
				if( bbp <= -20.0369 )
					if( bbp <= -21.0884 )
						if( bearPower <= -15.1175 )
							ret := -0.112676
						if( bearPower > -15.1175 )
							ret := -0.536424
					if( bbp > -21.0884 )
						if( bbp <= -20.5258 )
							ret := -0.903614 // sell
						if( bbp > -20.5258 )
							ret := -0.408163
				if( bbp > -20.0369 )
					if( bullPower <= -7.83609 )
						if( bullPower <= -9.34275 )
							ret := -0.857143 // sell
						if( bullPower > -9.34275 )
							ret := 0.228571
					if( bullPower > -7.83609 )
						if( bearPower <= -9.87347 )
							ret := -0.170022
						if( bearPower > -9.87347 )
							ret := -0.526882
		if( bbp > -15.2334 )
			if( bearPower <= -3.84483 )
				if( bearPower <= -12.5285 )
					if( bullPower <= 0.939671 )
						if( bearPower <= -13.1148 )
							ret := -0.555556
						if( bearPower > -13.1148 )
							ret := 1.000000 // buy
					if( bullPower > 0.939671 )
						if( bbm <= 27.2723 )
							ret := 0.666667
						if( bbm > 27.2723 )
							ret := 0.142857
				if( bearPower > -12.5285 )
					if( bbp <= -5.02236 )
						if( bearPower <= -3.97068 )
							ret := -0.047272
						if( bearPower > -3.97068 )
							ret := 0.428571
					if( bbp > -5.02236 )
						if( bbm <= 4.98773 )
							ret := -0.167364
						if( bbm > 4.98773 )
							ret := 0.131073
			if( bearPower > -3.84483 )
				if( bbm <= 3.08994 )
					if( bullPower <= -3.79533 )
						ret := -0.916667 // sell
					if( bullPower > -3.79533 )
						if( bearPower <= -3.40794 )
							ret := -0.189911
						if( bearPower > -3.40794 )
							ret := 0.130268
				if( bbm > 3.08994 )
					if( bullPower <= 2.48286 )
						if( bbm <= 4.98603 )
							ret := -0.384615
						if( bbm > 4.98603 )
							ret := -0.805195 // sell
					if( bullPower > 2.48286 )
						if( bbp <= 3.00545 )
							ret := 0.096000
						if( bbp > 3.00545 )
							ret := -0.654762
	if( bearPower > -3.05014 )
		if( bullPower <= -1.66832 )
			if( bbp <= -3.90428 )
				if( bbm <= 0.000199 )
					if( bearPower <= -2.70677 )
						if( bearPower <= -3.04624 )
							ret := 1.000000 // buy
						if( bearPower > -3.04624 )
							ret := -0.425287
					if( bearPower > -2.70677 )
						if( bearPower <= -2.1295 )
							ret := 0.204082
						if( bearPower > -2.1295 )
							ret := -0.451613
				if( bbm > 0.000199 )
					if( bbp <= -4.03191 )
						if( bearPower <= -2.34623 )
							ret := 0.212000
						if( bearPower > -2.34623 )
							ret := 0.763441 // buy
					if( bbp > -4.03191 )
						if( bbm <= 0.072549 )
							ret := -0.250000
						if( bbm > 0.072549 )
							ret := -1.000000 // sell
			if( bbp > -3.90428 )
				if( bbp <= -3.47415 )
					if( bearPower <= -1.86036 )
						if( bearPower <= -2.00745 )
							ret := 0.000000
						if( bearPower > -2.00745 )
							ret := 0.913793 // buy
					if( bearPower > -1.86036 )
						if( bullPower <= -1.73374 )
							ret := 0.210526
						if( bullPower > -1.73374 )
							ret := 1.000000 // buy
				if( bbp > -3.47415 )
					if( bullPower <= -1.70101 )
						ret := 0.923077 // buy
					if( bullPower > -1.70101 )
						ret := 1.000000 // buy
		if( bullPower > -1.66832 )
			if( bbp <= 34.9802 )
				if( bbm <= 0.486828 )
					if( bbm <= 0.410341 )
						if( bullPower <= 0.847236 )
							ret := 0.043668
						if( bullPower > 0.847236 )
							ret := -0.109624
					if( bbm > 0.410341 )
						if( bbp <= 12.1644 )
							ret := -0.508197
						if( bbp > 12.1644 )
							ret := 0.400000
				if( bbm > 0.486828 )
					if( bbm <= 7.64552 )
						if( bbm <= 6.72201 )
							ret := 0.051828
						if( bbm > 6.72201 )
							ret := 0.276650
					if( bbm > 7.64552 )
						if( bbp <= 5.58367 )
							ret := -0.506173
						if( bbp > 5.58367 )
							ret := -0.046707
			if( bbp > 34.9802 )
				if( bullPower <= 28.4031 )
					if( bbm <= 1.01567 )
						ret := -0.200000
					if( bbm > 1.01567 )
						if( bbm <= 10.4911 )
							ret := 0.920000 // buy
						if( bbm > 10.4911 )
							ret := -0.200000
				if( bullPower > 28.4031 )
					if( bullPower <= 35.9212 )
						if( bullPower <= 29.9992 )
							ret := 0.272727
						if( bullPower > 29.9992 )
							ret := -0.666667
					if( bullPower > 35.9212 )
						if( bbm <= 4.68071 )
							ret := 0.333333
						if( bbm > 4.68071 )
							ret := 0.842105 // buy
	
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
float op_operation = decision_tree_0_MDB_1Hour_582bb6b0(bearPower, bbm, bbp, bullPower, BBPower_Color)

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


