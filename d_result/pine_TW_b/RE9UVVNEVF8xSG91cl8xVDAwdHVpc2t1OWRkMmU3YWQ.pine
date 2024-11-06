//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: DOTUSDT_1Hour_1T00_9dd2e7ad Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOTUSDT_1Hour_1T00_9dd2e7ad", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOTUSDT_1Hour_9dd2e7ad(ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( tema <= 4.05993 )
		if( ema13 <= -0.036215 )
			if( ema1 <= 4.27216 )
				if( ema12 <= -0.059956 )
					if( tema <= 3.98792 )
						if( tema <= 3.8898 )
							ret := 0.843750 // buy
						if( tema > 3.8898 )
							ret := 1.000000 // buy
					if( tema > 3.98792 )
						ret := 0.428571
				if( ema12 > -0.059956 )
					if( ema13 <= -0.101291 )
						ret := -0.642857
					if( ema13 > -0.101291 )
						if( tema <= 2.90483 )
							ret := 0.950000 // buy
						if( tema > 2.90483 )
							ret := 0.437299
			if( ema1 > 4.27216 )
				ret := -0.428571
		if( ema13 > -0.036215 )
			if( ema13 <= 0.019897 )
				if( tema <= 2.86932 )
					ret := 1.000000 // buy
				if( tema > 2.86932 )
					if( ema3 <= 3.36541 )
						if( ema12 <= 0.001975 )
							ret := -0.790698 // sell
						if( ema12 > 0.001975 )
							ret := 0.411765
					if( ema3 > 3.36541 )
						if( ema13 <= -0.028716 )
							ret := 0.344262
						if( ema13 > -0.028716 )
							ret := -0.053226
			if( ema13 > 0.019897 )
				if( ema3 <= 3.08213 )
					if( ema3 <= 2.87742 )
						if( ema12 <= 0.038376 )
							ret := -0.750000 // sell
						if( ema12 > 0.038376 )
							ret := -1.000000 // sell
					if( ema3 > 2.87742 )
						if( ema2 <= 2.91977 )
							ret := 0.266667
						if( ema2 > 2.91977 )
							ret := -0.500000
				if( ema3 > 3.08213 )
					if( ema3 <= 3.93674 )
						if( ema2 <= 3.78699 )
							ret := 0.770492 // buy
						if( ema2 > 3.78699 )
							ret := 0.000000
					if( ema3 > 3.93674 )
						if( ema12 <= 0.018756 )
							ret := 1.000000 // buy
						if( ema12 > 0.018756 )
							ret := 0.555556
	if( tema > 4.05993 )
		if( ema1 <= 7.18222 )
			if( ema12 <= -0.070881 )
				if( ema2 <= 4.70897 )
					if( ema3 <= 4.58037 )
						if( ema13 <= -0.134239 )
							ret := 0.393939
						if( ema13 > -0.134239 )
							ret := -1.000000 // sell
					if( ema3 > 4.58037 )
						if( ema3 <= 4.62757 )
							ret := -0.868421 // sell
						if( ema3 > 4.62757 )
							ret := -0.466667
				if( ema2 > 4.70897 )
					if( ema12 <= -0.085932 )
						if( ema12 <= -0.199914 )
							ret := 0.756757 // buy
						if( ema12 > -0.199914 )
							ret := 0.155416
					if( ema12 > -0.085932 )
						if( ema1 <= 5.96764 )
							ret := 0.775610 // buy
						if( ema1 > 5.96764 )
							ret := 0.177083
			if( ema12 > -0.070881 )
				if( ema13 <= -0.117479 )
					if( ema1 <= 6.81743 )
						if( ema2 <= 6.37061 )
							ret := -0.204878
						if( ema2 > 6.37061 )
							ret := -0.680851
					if( ema1 > 6.81743 )
						if( tema <= 6.78071 )
							ret := 0.880000 // buy
						if( tema > 6.78071 )
							ret := -0.159091
				if( ema13 > -0.117479 )
					if( ema12 <= -0.05089 )
						if( ema13 <= -0.09526 )
							ret := 0.152905
						if( ema13 > -0.09526 )
							ret := 0.383285
					if( ema12 > -0.05089 )
						if( ema13 <= -0.004258 )
							ret := -0.038374
						if( ema13 > -0.004258 )
							ret := 0.048937
		if( ema1 > 7.18222 )
			if( ema12 <= -0.21883 )
				if( ema12 <= -0.358111 )
					if( ema12 <= -1.0361 )
						if( ema13 <= -4.69413 )
							ret := -0.538462
						if( ema13 > -4.69413 )
							ret := 0.418773
					if( ema12 > -1.0361 )
						if( ema2 <= 31.0404 )
							ret := 0.056623
						if( ema2 > 31.0404 )
							ret := -0.201439
				if( ema12 > -0.358111 )
					if( ema2 <= 48.3199 )
						if( ema3 <= 15.8299 )
							ret := 0.452381
						if( ema3 > 15.8299 )
							ret := 0.112371
					if( ema2 > 48.3199 )
						if( ema1 <= 50.7376 )
							ret := 1.000000 // buy
						if( ema1 > 50.7376 )
							ret := -0.300000
			if( ema12 > -0.21883 )
				if( ema3 <= 43.699 )
					if( ema2 <= 7.25391 )
						if( ema2 <= 7.24576 )
							ret := -0.253521
						if( ema2 > 7.24576 )
							ret := -0.756098 // sell
					if( ema2 > 7.25391 )
						if( ema1 <= 7.38104 )
							ret := 0.189145
						if( ema1 > 7.38104 )
							ret := -0.039448
				if( ema3 > 43.699 )
					if( ema3 <= 45.6839 )
						if( ema1 <= 44.0023 )
							ret := -0.288136
						if( ema1 > 44.0023 )
							ret := -0.812950 // sell
					if( ema3 > 45.6839 )
						if( tema <= 45.7338 )
							ret := 0.960000 // buy
						if( tema > 45.7338 )
							ret := -0.238806
	
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
float op_operation = decision_tree_0_DOTUSDT_1Hour_9dd2e7ad(ema12, ema3, ema13, tema, ema1, ema2)

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


