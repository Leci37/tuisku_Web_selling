//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: QCOM_1Hour_1T00_c7d68fbc Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_QCOM_1Hour_1T00_c7d68fbc", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_QCOM_1Hour_c7d68fbc(ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( ema2 <= 172.018 )
		if( ema12 <= 1.7144 )
			if( ema2 <= 171.069 )
				if( ema1 <= 76.1982 )
					if( ema1 <= 72.5242 )
						if( ema12 <= 0.165935 )
							ret := 0.089377
						if( ema12 > 0.165935 )
							ret := -0.238688
					if( ema1 > 72.5242 )
						if( ema2 <= 74.4617 )
							ret := 0.633907
						if( ema2 > 74.4617 )
							ret := 0.150997
				if( ema1 > 76.1982 )
					if( ema2 <= 77.2222 )
						if( ema13 <= 1.16732 )
							ret := -0.211538
						if( ema13 > 1.16732 )
							ret := -0.884211 // sell
					if( ema2 > 77.2222 )
						if( ema3 <= 76.9417 )
							ret := 0.902439 // buy
						if( ema3 > 76.9417 )
							ret := -0.003879
			if( ema2 > 171.069 )
				if( ema13 <= -2.15703 )
					ret := -0.437500
				if( ema13 > -2.15703 )
					if( ema3 <= 171.524 )
						if( ema2 <= 171.248 )
							ret := 0.619048
						if( ema2 > 171.248 )
							ret := 0.000000
					if( ema3 > 171.524 )
						if( tema <= 169.308 )
							ret := 0.166667
						if( tema > 169.308 )
							ret := 0.728070 // buy
		if( ema12 > 1.7144 )
			if( ema3 <= 120.269 )
				if( ema3 <= 96.4621 )
					if( ema2 <= 74.5865 )
						if( ema2 <= 69.2063 )
							ret := 0.947368 // buy
						if( ema2 > 69.2063 )
							ret := 0.500000
					if( ema2 > 74.5865 )
						ret := -0.300000
				if( ema3 > 96.4621 )
					if( ema12 <= 2.15219 )
						if( tema <= 116.177 )
							ret := 0.838710 // buy
						if( tema > 116.177 )
							ret := 1.000000 // buy
					if( ema12 > 2.15219 )
						ret := 0.400000
			if( ema3 > 120.269 )
				if( tema <= 149.763 )
					if( tema <= 145.733 )
						if( ema13 <= 3.38811 )
							ret := -0.473684
						if( ema13 > 3.38811 )
							ret := 0.404762
					if( tema > 145.733 )
						if( tema <= 146.946 )
							ret := -1.000000 // sell
						if( tema > 146.946 )
							ret := -0.200000
				if( tema > 149.763 )
					if( ema2 <= 170.813 )
						if( ema3 <= 164.553 )
							ret := 0.250000
						if( ema3 > 164.553 )
							ret := 0.714286 // buy
					if( ema2 > 170.813 )
						ret := -0.555556
	if( ema2 > 172.018 )
		if( ema1 <= 174.385 )
			if( tema <= 172.03 )
				if( ema2 <= 172.347 )
					if( ema3 <= 172.314 )
						ret := -0.363636
					if( ema3 > 172.314 )
						if( tema <= 169.841 )
							ret := -0.071429
						if( tema > 169.841 )
							ret := 0.666667
				if( ema2 > 172.347 )
					if( ema1 <= 170.641 )
						ret := -0.785714 // sell
					if( ema1 > 170.641 )
						if( ema3 <= 172.86 )
							ret := -0.590909
						if( ema3 > 172.86 )
							ret := -0.180000
			if( tema > 172.03 )
				if( ema12 <= 0.425603 )
					if( tema <= 172.825 )
						if( ema1 <= 173.311 )
							ret := -0.857143 // sell
						if( ema1 > 173.311 )
							ret := -0.466667
					if( tema > 172.825 )
						if( ema12 <= 0.35333 )
							ret := -1.000000 // sell
						if( ema12 > 0.35333 )
							ret := -0.789474 // sell
				if( ema12 > 0.425603 )
					if( ema1 <= 174.05 )
						if( tema <= 173.891 )
							ret := -0.633333
						if( tema > 173.891 )
							ret := -0.232558
					if( ema1 > 174.05 )
						if( ema12 <= 1.00701 )
							ret := -0.925926 // sell
						if( ema12 > 1.00701 )
							ret := -0.500000
		if( ema1 > 174.385 )
			if( ema1 <= 178.455 )
				if( ema2 <= 175.086 )
					if( ema12 <= 0.756133 )
						if( ema13 <= 1.11613 )
							ret := -0.666667
						if( ema13 > 1.11613 )
							ret := -0.964286 // sell
					if( ema12 > 0.756133 )
						if( ema3 <= 172.773 )
							ret := -0.131579
						if( ema3 > 172.773 )
							ret := 0.827586 // buy
				if( ema2 > 175.086 )
					if( ema3 <= 178.458 )
						if( ema3 <= 176.689 )
							ret := 0.328767
						if( ema3 > 176.689 )
							ret := 0.820225 // buy
					if( ema3 > 178.458 )
						if( ema13 <= -1.77004 )
							ret := 0.379310
						if( ema13 > -1.77004 )
							ret := -0.738095 // sell
			if( ema1 > 178.455 )
				if( ema2 <= 177.937 )
					if( ema2 <= 176.984 )
						ret := -0.300000
					if( ema2 > 176.984 )
						if( ema3 <= 176.643 )
							ret := -1.000000 // sell
						if( ema3 > 176.643 )
							ret := -0.888889 // sell
				if( ema2 > 177.937 )
					if( ema3 <= 179.597 )
						if( ema2 <= 178.908 )
							ret := -0.040000
						if( ema2 > 178.908 )
							ret := 0.645161
					if( ema3 > 179.597 )
						if( tema <= 193.802 )
							ret := -0.280402
						if( tema > 193.802 )
							ret := -0.039691
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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
float op_operation = decision_tree_0_QCOM_1Hour_c7d68fbc(ema2, ema1, ema12, ema3, ema13, tema)

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


