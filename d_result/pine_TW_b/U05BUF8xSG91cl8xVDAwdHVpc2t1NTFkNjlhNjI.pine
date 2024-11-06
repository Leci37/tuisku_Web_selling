//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: SNAP_1Hour_1T00_51d69a62 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNAP_1Hour_1T00_51d69a62", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNAP_1Hour_51d69a62(ema1, tema, ema12, ema2, ema3, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( ema1 <= 11.1948 )
		if( ema3 <= 11.3981 )
			if( tema <= 10.618 )
				if( ema1 <= 10.416 )
					if( ema12 <= 0.038851 )
						if( ema2 <= 5.85351 )
							ret := 0.445820
						if( ema2 > 5.85351 )
							ret := 0.114915
					if( ema12 > 0.038851 )
						if( ema1 <= 7.08423 )
							ret := -0.305046
						if( ema1 > 7.08423 )
							ret := 0.082538
				if( ema1 > 10.416 )
					if( ema12 <= -0.146949 )
						if( ema13 <= -0.350377 )
							ret := 0.793103 // buy
						if( ema13 > -0.350377 )
							ret := 0.139535
					if( ema12 > -0.146949 )
						if( ema13 <= 0.055492 )
							ret := -0.471526
						if( ema13 > 0.055492 )
							ret := 0.117647
			if( tema > 10.618 )
				if( tema <= 10.8112 )
					if( ema13 <= 0.226979 )
						if( ema1 <= 10.5861 )
							ret := -0.121212
						if( ema1 > 10.5861 )
							ret := 0.355385
					if( ema13 > 0.226979 )
						if( ema1 <= 10.5881 )
							ret := 0.640000
						if( ema1 > 10.5881 )
							ret := 0.938776 // buy
				if( tema > 10.8112 )
					if( ema1 <= 11.0725 )
						if( ema3 <= 10.4592 )
							ret := 0.556818
						if( ema3 > 10.4592 )
							ret := -0.054271
					if( ema1 > 11.0725 )
						if( ema12 <= -0.025213 )
							ret := 0.471698
						if( ema12 > -0.025213 )
							ret := 0.182825
		if( ema3 > 11.3981 )
			if( tema <= 9.88567 )
				ret := -0.300000
			if( tema > 9.88567 )
				if( ema3 <= 11.4569 )
					ret := -1.000000 // sell
				if( ema3 > 11.4569 )
					if( ema3 <= 11.5364 )
						if( tema <= 11.0466 )
							ret := -0.333333
						if( tema > 11.0466 )
							ret := -0.857143 // sell
					if( ema3 > 11.5364 )
						ret := -1.000000 // sell
	if( ema1 > 11.1948 )
		if( ema1 <= 11.3593 )
			if( ema3 <= 11.3497 )
				if( ema13 <= 0.043838 )
					if( tema <= 11.1779 )
						if( ema2 <= 11.2248 )
							ret := -1.000000 // sell
						if( ema2 > 11.2248 )
							ret := -0.080000
					if( tema > 11.1779 )
						if( tema <= 11.2823 )
							ret := 0.213115
						if( tema > 11.2823 )
							ret := 0.758621 // buy
				if( ema13 > 0.043838 )
					if( ema2 <= 11.3116 )
						if( ema3 <= 11.2372 )
							ret := -0.503226
						if( ema3 > 11.2372 )
							ret := 0.700000 // buy
					if( ema2 > 11.3116 )
						ret := -1.000000 // sell
			if( ema3 > 11.3497 )
				if( ema2 <= 11.372 )
					if( tema <= 11.165 )
						if( ema12 <= -0.109005 )
							ret := -0.818182 // sell
						if( ema12 > -0.109005 )
							ret := -0.315789
					if( tema > 11.165 )
						if( ema12 <= -0.039483 )
							ret := -1.000000 // sell
						if( ema12 > -0.039483 )
							ret := -0.714286 // sell
				if( ema2 > 11.372 )
					if( ema3 <= 11.7037 )
						if( ema12 <= -0.058934 )
							ret := -0.310345
						if( ema12 > -0.058934 )
							ret := -0.818182 // sell
					if( ema3 > 11.7037 )
						if( ema2 <= 11.5134 )
							ret := -1.000000 // sell
						if( ema2 > 11.5134 )
							ret := -0.750000 // sell
		if( ema1 > 11.3593 )
			if( ema2 <= 63.1186 )
				if( ema13 <= -3.63466 )
					if( ema1 <= 37.1162 )
						ret := -1.000000 // sell
					if( ema1 > 37.1162 )
						ret := -0.785714 // sell
				if( ema13 > -3.63466 )
					if( ema12 <= -0.955362 )
						if( ema2 <= 15.1956 )
							ret := -0.880952 // sell
						if( ema2 > 15.1956 )
							ret := 0.679842
					if( ema12 > -0.955362 )
						if( ema13 <= 0.652827 )
							ret := -0.031027
						if( ema13 > 0.652827 )
							ret := 0.143870
			if( ema2 > 63.1186 )
				if( tema <= 65.7264 )
					if( ema3 <= 63.0576 )
						if( ema13 <= 0.464389 )
							ret := -0.687500
						if( ema13 > 0.464389 )
							ret := -0.925373 // sell
					if( ema3 > 63.0576 )
						if( ema2 <= 63.5083 )
							ret := 0.185185
						if( ema2 > 63.5083 )
							ret := -0.611538
				if( tema > 65.7264 )
					if( ema1 <= 74.2895 )
						if( ema1 <= 69.2509 )
							ret := -0.268657
						if( ema1 > 69.2509 )
							ret := 0.205703
					if( ema1 > 74.2895 )
						if( ema2 <= 76.2141 )
							ret := -0.423800
						if( ema2 > 76.2141 )
							ret := -0.039130
	
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
float op_operation = decision_tree_0_SNAP_1Hour_51d69a62(ema1, tema, ema12, ema2, ema3, ema13)

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


