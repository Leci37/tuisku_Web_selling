//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: ASAN_1Hour_2BT0_4aab5a6a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ASAN_1Hour_2BT0_4aab5a6a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ASAN_1Hour_4aab5a6a(bullPower, bbp, bearPower, bbm, BBPower_Color, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.65, min_samples_split=10,random_state=843828734)
	if( ema1 <= 13.372 )
		if( ema13 <= 0.02681 )
			if( bbp <= -1.92548 )
				ret := -0.888889 // sell
			if( bbp > -1.92548 )
				if( tema <= 11.3644 )
					if( bearPower <= -0.075479 )
						if( ema13 <= -0.022682 )
							ret := 0.828571 // buy
						if( ema13 > -0.022682 )
							ret := 0.166667
					if( bearPower > -0.075479 )
						if( ema1 <= 11.3432 )
							ret := 0.083333
						if( ema1 > 11.3432 )
							ret := 1.000000 // buy
				if( tema > 11.3644 )
					if( ema1 <= 12.3873 )
						if( bbm <= 0.467658 )
							ret := 0.016000
						if( bbm > 0.467658 )
							ret := 0.850000 // buy
					if( ema1 > 12.3873 )
						if( ema12 <= -0.067791 )
							ret := 0.296774
						if( ema12 > -0.067791 )
							ret := 0.629213
		if( ema13 > 0.02681 )
			if( ema2 <= 11.8847 )
				if( ema2 <= 11.421 )
					if( bbm <= 0.211181 )
						if( bbm <= 0.014437 )
							ret := -0.750000 // sell
						if( bbm > 0.014437 )
							ret := 0.000000
					if( bbm > 0.211181 )
						ret := 0.800000 // buy
				if( ema2 > 11.421 )
					if( ema2 <= 11.6186 )
						if( ema13 <= 0.152167 )
							ret := 0.937500 // buy
						if( ema13 > 0.152167 )
							ret := 0.000000
					if( ema2 > 11.6186 )
						if( ema12 <= 0.20428 )
							ret := 0.206897
						if( ema12 > 0.20428 )
							ret := 1.000000 // buy
			if( ema2 > 11.8847 )
				if( ema3 <= 12.661 )
					if( bbm <= 0.219115 )
						if( ema2 <= 12.5544 )
							ret := -0.308824
						if( ema2 > 12.5544 )
							ret := -0.789474 // sell
					if( bbm > 0.219115 )
						if( ema2 <= 12.0783 )
							ret := -0.833333 // sell
						if( ema2 > 12.0783 )
							ret := 0.173913
				if( ema3 > 12.661 )
					if( ema12 <= 0.079405 )
						if( bearPower <= 0.088894 )
							ret := 0.000000
						if( bearPower > 0.088894 )
							ret := -0.500000
					if( ema12 > 0.079405 )
						if( bullPower <= 0.344018 )
							ret := 0.772727 // buy
						if( bullPower > 0.344018 )
							ret := 0.083333
	if( ema1 > 13.372 )
		if( ema1 <= 135.673 )
			if( ema12 <= 0.131745 )
				if( bbp <= -0.382678 )
					if( ema1 <= 14.6054 )
						if( ema1 <= 13.7915 )
							ret := 0.220339
						if( ema1 > 13.7915 )
							ret := -0.601266
					if( ema1 > 14.6054 )
						if( ema12 <= -0.532814 )
							ret := -0.061862
						if( ema12 > -0.532814 )
							ret := 0.098709
				if( bbp > -0.382678 )
					if( ema2 <= 18.3056 )
						if( bbm <= 0.01217 )
							ret := -0.293981
						if( bbm > 0.01217 )
							ret := 0.072488
					if( ema2 > 18.3056 )
						if( ema12 <= 0.007779 )
							ret := -0.238999
						if( ema12 > 0.007779 )
							ret := -0.093796
			if( ema12 > 0.131745 )
				if( bbm <= 0.545203 )
					if( bearPower <= 0.972959 )
						if( ema13 <= 0.801045 )
							ret := 0.113615
						if( ema13 > 0.801045 )
							ret := 0.329508
					if( bearPower > 0.972959 )
						if( ema13 <= 1.38471 )
							ret := -0.450549
						if( ema13 > 1.38471 )
							ret := 0.004762
				if( bbm > 0.545203 )
					if( ema1 <= 36.6287 )
						if( ema1 <= 15.6738 )
							ret := -0.935484 // sell
						if( ema1 > 15.6738 )
							ret := -0.165871
					if( ema1 > 36.6287 )
						if( ema13 <= 3.27286 )
							ret := 0.110841
						if( ema13 > 3.27286 )
							ret := -0.387500
		if( ema1 > 135.673 )
			if( ema2 <= 138.272 )
				if( ema1 <= 136.084 )
					if( ema2 <= 134.573 )
						ret := 0.250000
					if( ema2 > 134.573 )
						if( bbp <= 1.98215 )
							ret := -0.333333
						if( bbp > 1.98215 )
							ret := -1.000000 // sell
				if( ema1 > 136.084 )
					if( tema <= 137.554 )
						ret := -0.555556
					if( tema > 137.554 )
						if( bbp <= 3.45431 )
							ret := 0.750000 // buy
						if( bbp > 3.45431 )
							ret := -0.071429
			if( ema2 > 138.272 )
				if( ema3 <= 138.824 )
					if( ema13 <= 4.16797 )
						if( ema2 <= 140.007 )
							ret := -1.000000 // sell
						if( ema2 > 140.007 )
							ret := 0.000000
					if( ema13 > 4.16797 )
						ret := 0.000000
				if( ema3 > 138.824 )
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
float op_operation = decision_tree_0_ASAN_1Hour_4aab5a6a(bullPower, bbp, bearPower, bbm, BBPower_Color, ema3, tema, ema2, ema12, ema13, ema1)

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


