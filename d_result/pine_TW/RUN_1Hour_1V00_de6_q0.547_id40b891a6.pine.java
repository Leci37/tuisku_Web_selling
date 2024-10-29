//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Vortex_Indicator
// ID_model: RUN_1Hour_1V00_40b891a6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_RUN_1Hour_1V00_40b891a6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_RUN_1Hour_40b891a6(VIP_VIM, VIM, VIP)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( VIP_VIM <= -0.549961 )
		if( VIM <= 1.27601 )
			if( VIM <= 1.25662 )
				ret := -0.117647
			if( VIM > 1.25662 )
				if( VIM <= 1.26359 )
					ret := 1.000000 // buy
				if( VIM > 1.26359 )
					if( VIP_VIM <= -0.558302 )
						if( VIP <= 0.70223 )
							ret := 0.384615
						if( VIP > 0.70223 )
							ret := 0.818182 // buy
					if( VIP_VIM > -0.558302 )
						ret := 0.000000
		if( VIM > 1.27601 )
			if( VIP <= 0.850032 )
				if( VIP_VIM <= -0.886201 )
					if( VIP_VIM <= -0.898088 )
						if( VIP <= 0.669778 )
							ret := 0.158228
						if( VIP > 0.669778 )
							ret := -0.382353
					if( VIP_VIM > -0.898088 )
						if( VIP <= 0.578379 )
							ret := 0.923077 // buy
						if( VIP > 0.578379 )
							ret := 0.785714 // buy
				if( VIP_VIM > -0.886201 )
					if( VIP <= 0.823182 )
						if( VIP <= 0.801712 )
							ret := -0.187961
						if( VIP > 0.801712 )
							ret := -0.614458
					if( VIP > 0.823182 )
						if( VIP_VIM <= -0.592118 )
							ret := 0.296296
						if( VIP_VIM > -0.592118 )
							ret := 0.666667
			if( VIP > 0.850032 )
				if( VIM <= 1.5236 )
					if( VIP_VIM <= -0.558771 )
						if( VIP <= 0.871738 )
							ret := -0.733333 // sell
						if( VIP > 0.871738 )
							ret := -0.891892 // sell
					if( VIP_VIM > -0.558771 )
						ret := -0.375000
				if( VIM > 1.5236 )
					if( VIP <= 0.931501 )
						if( VIP_VIM <= -0.732102 )
							ret := -0.416667
						if( VIP_VIM > -0.732102 )
							ret := 0.173913
					if( VIP > 0.931501 )
						if( VIP <= 1.13048 )
							ret := -0.754098 // sell
						if( VIP > 1.13048 )
							ret := -0.071429
	if( VIP_VIM > -0.549961 )
		if( VIM <= 1.47629 )
			if( VIP_VIM <= -0.255148 )
				if( VIM <= 1.16439 )
					if( VIP <= 0.793247 )
						if( VIM <= 1.12169 )
							ret := 0.072727
						if( VIM > 1.12169 )
							ret := 0.592593
					if( VIP > 0.793247 )
						if( VIP <= 0.891093 )
							ret := -0.378608
						if( VIP > 0.891093 )
							ret := 0.275000
				if( VIM > 1.16439 )
					if( VIM <= 1.17396 )
						if( VIP_VIM <= -0.33997 )
							ret := 0.662338
						if( VIP_VIM > -0.33997 )
							ret := -0.015504
					if( VIM > 1.17396 )
						if( VIP <= 1.01332 )
							ret := -0.049176
						if( VIP > 1.01332 )
							ret := 0.226562
			if( VIP_VIM > -0.255148 )
				if( VIM <= 1.02368 )
					if( VIM <= 0.815834 )
						if( VIP_VIM <= 0.331063 )
							ret := -0.378049
						if( VIP_VIM > 0.331063 )
							ret := 0.083284
					if( VIM > 0.815834 )
						if( VIP <= 1.21643 )
							ret := -0.004400
						if( VIP > 1.21643 )
							ret := -0.123731
				if( VIM > 1.02368 )
					if( VIP_VIM <= -0.156429 )
						if( VIP_VIM <= -0.185242 )
							ret := 0.110422
						if( VIP_VIM > -0.185242 )
							ret := 0.307255
					if( VIP_VIM > -0.156429 )
						if( VIP <= 1.58755 )
							ret := 0.027758
						if( VIP > 1.58755 )
							ret := 0.462366
		if( VIM > 1.47629 )
			if( VIP <= 1.18278 )
				if( VIP <= 1.00863 )
					ret := 0.062500
				if( VIP > 1.00863 )
					if( VIM <= 1.55081 )
						if( VIM <= 1.49788 )
							ret := 0.869565 // buy
						if( VIM > 1.49788 )
							ret := 0.200000
					if( VIM > 1.55081 )
						if( VIP_VIM <= -0.507798 )
							ret := 0.600000
						if( VIP_VIM > -0.507798 )
							ret := 0.937500 // buy
			if( VIP > 1.18278 )
				if( VIP <= 1.25093 )
					ret := -0.520000
				if( VIP > 1.25093 )
					if( VIP_VIM <= -0.38605 )
						ret := 0.818182 // buy
					if( VIP_VIM > -0.38605 )
						if( VIP <= 1.98923 )
							ret := 0.152778
						if( VIP > 1.98923 )
							ret := 0.625000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
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
float op_operation = decision_tree_0_RUN_1Hour_40b891a6(VIP_VIM, VIM, VIP)

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


