//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: LINKUSDT_15Min_1T00_6524e08f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LINKUSDT_15Min_1T00_6524e08f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LINKUSDT_15Min_6524e08f(ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( ema12 <= -0.031046 )
		if( ema12 <= -0.170824 )
			if( ema3 <= 13.0013 )
				if( tema <= 8.80176 )
					if( ema2 <= 6.29951 )
						if( ema12 <= -0.180689 )
							ret := -0.846154 // sell
						if( ema12 > -0.180689 )
							ret := 0.714286 // buy
					if( ema2 > 6.29951 )
						if( ema13 <= -0.460114 )
							if( ema12 <= -0.328366 )
								ret := 0.809524 // buy
							if( ema12 > -0.328366 )
								ret := 1.000000 // buy
						if( ema13 > -0.460114 )
							if( ema13 <= -0.296227 )
								ret := 0.127660
							if( ema13 > -0.296227 )
								ret := 0.823529 // buy
				if( tema > 8.80176 )
					if( ema13 <= -0.288242 )
						if( ema3 <= 10.8911 )
							if( ema12 <= -0.349 )
								ret := -0.833333 // sell
							if( ema12 > -0.349 )
								ret := -1.000000 // sell
						if( ema3 > 10.8911 )
							if( ema13 <= -0.509358 )
								ret := 0.875000 // buy
							if( ema13 > -0.509358 )
								ret := -0.559322
					if( ema13 > -0.288242 )
						if( ema3 <= 11.5422 )
							ret := 1.000000 // buy
						if( ema3 > 11.5422 )
							ret := 0.428571
			if( ema3 > 13.0013 )
				if( ema1 <= 13.9776 )
					if( ema13 <= -0.427778 )
						if( ema13 <= -0.560728 )
							ret := 1.000000 // buy
						if( ema13 > -0.560728 )
							if( ema3 <= 14.2471 )
								ret := 1.000000 // buy
							if( ema3 > 14.2471 )
								ret := 0.818182 // buy
					if( ema13 > -0.427778 )
						ret := 0.545455
				if( ema1 > 13.9776 )
					if( ema1 <= 14.1302 )
						ret := -0.666667
					if( ema1 > 14.1302 )
						if( ema12 <= -0.407924 )
							if( ema2 <= 15.0946 )
								ret := 0.571429
							if( ema2 > 15.0946 )
								ret := 0.934426 // buy
						if( ema12 > -0.407924 )
							if( ema13 <= -0.559235 )
								ret := -0.263158
							if( ema13 > -0.559235 )
								ret := 0.632107
		if( ema12 > -0.170824 )
			if( tema <= 6.38727 )
				if( ema12 <= -0.039 )
					if( ema3 <= 5.95064 )
						if( ema3 <= 5.88481 )
							if( ema12 <= -0.064252 )
								ret := 0.789474 // buy
							if( ema12 > -0.064252 )
								ret := 0.195652
						if( ema3 > 5.88481 )
							if( ema2 <= 5.86647 )
								ret := -0.363636
							if( ema2 > 5.86647 )
								ret := -0.878788 // sell
					if( ema3 > 5.95064 )
						if( tema <= 6.31124 )
							if( tema <= 6.25298 )
								ret := 0.367556
							if( tema > 6.25298 )
								ret := -0.062500
						if( tema > 6.31124 )
							if( ema3 <= 6.62374 )
								ret := 0.699507
							if( ema3 > 6.62374 )
								ret := -0.125000
				if( ema12 > -0.039 )
					if( tema <= 5.79413 )
						if( ema13 <= -0.077688 )
							ret := -0.375000
						if( ema13 > -0.077688 )
							if( ema3 <= 5.89098 )
								ret := 0.543478
							if( ema3 > 5.89098 )
								ret := 1.000000 // buy
					if( tema > 5.79413 )
						if( tema <= 6.21038 )
							if( ema3 <= 6.27643 )
								ret := -0.127389
							if( ema3 > 6.27643 )
								ret := 0.888889 // buy
						if( tema > 6.21038 )
							if( ema2 <= 6.32038 )
								ret := -0.894737 // sell
							if( ema2 > 6.32038 )
								ret := -0.109091
			if( tema > 6.38727 )
				if( ema3 <= 6.54115 )
					if( ema2 <= 6.47916 )
						ret := -0.083333
					if( ema2 > 6.47916 )
						if( ema12 <= -0.033058 )
							ret := -1.000000 // sell
						if( ema12 > -0.033058 )
							ret := -0.857143 // sell
				if( ema3 > 6.54115 )
					if( ema13 <= -0.28635 )
						if( ema12 <= -0.148673 )
							if( ema1 <= 14.4916 )
								ret := -0.173913
							if( ema1 > 14.4916 )
								ret := -0.714286 // sell
						if( ema12 > -0.148673 )
							if( tema <= 9.79326 )
								ret := -0.666667
							if( tema > 9.79326 )
								ret := 0.246575
					if( ema13 > -0.28635 )
						if( ema2 <= 20.7107 )
							if( ema3 <= 19.0104 )
								ret := 0.099441
							if( ema3 > 19.0104 )
								ret := 0.250228
						if( ema2 > 20.7107 )
							if( ema2 <= 21.2593 )
								ret := -0.633333
							if( ema2 > 21.2593 )
								ret := 0.500000
	if( ema12 > -0.031046 )
		if( ema3 <= 5.91564 )
			if( ema1 <= 5.89559 )
				if( ema3 <= 5.09078 )
					if( ema12 <= 0.025548 )
						if( tema <= 5.04201 )
							if( ema3 <= 5.02424 )
								ret := 1.000000 // buy
							if( ema3 > 5.02424 )
								ret := 0.829268 // buy
						if( tema > 5.04201 )
							if( ema13 <= 0.023633 )
								ret := 0.315789
							if( ema13 > 0.023633 )
								ret := 0.964286 // buy
					if( ema12 > 0.025548 )
						ret := -0.384615
				if( ema3 > 5.09078 )
					if( ema3 <= 5.86177 )
						if( ema1 <= 5.81997 )
							if( ema13 <= -0.040715 )
								ret := 0.478261
							if( ema13 > -0.040715 )
								ret := 0.069492
						if( ema1 > 5.81997 )
							if( ema13 <= 0.017878 )
								ret := 0.586667
							if( ema13 > 0.017878 )
								ret := 0.146667
					if( ema3 > 5.86177 )
						if( tema <= 5.90389 )
							if( tema <= 5.89508 )
								ret := -0.190000
							if( tema > 5.89508 )
								ret := -0.950000 // sell
						if( tema > 5.90389 )
							ret := 0.714286 // buy
			if( ema1 > 5.89559 )
				if( tema <= 6.09241 )
					if( ema13 <= -0.000829 )
						if( ema1 <= 5.8996 )
							ret := 0.700000 // buy
						if( ema1 > 5.8996 )
							if( ema12 <= 0.000149 )
								ret := 0.000000
							if( ema12 > 0.000149 )
								ret := -0.428571
					if( ema13 > -0.000829 )
						if( ema3 <= 5.90415 )
							if( ema1 <= 5.90257 )
								ret := 0.953488 // buy
							if( ema1 > 5.90257 )
								ret := 0.781955 // buy
						if( ema3 > 5.90415 )
							if( ema2 <= 5.91195 )
								ret := 0.076923
							if( ema2 > 5.91195 )
								ret := 0.716049 // buy
				if( tema > 6.09241 )
					if( ema12 <= 0.102994 )
						ret := -1.000000 // sell
					if( ema12 > 0.102994 )
						if( ema1 <= 6.14178 )
							if( ema12 <= 0.133268 )
								ret := 0.857143 // buy
							if( ema12 > 0.133268 )
								ret := 1.000000 // buy
						if( ema1 > 6.14178 )
							ret := -0.142857
		if( ema3 > 5.91564 )
			if( ema2 <= 20.4848 )
				if( ema3 <= 5.99903 )
					if( ema13 <= -0.040283 )
						if( ema3 <= 5.97032 )
							if( ema12 <= -0.017799 )
								ret := -0.176471
							if( ema12 > -0.017799 )
								ret := -1.000000 // sell
						if( ema3 > 5.97032 )
							if( ema1 <= 5.94096 )
								ret := -0.971429 // sell
							if( ema1 > 5.94096 )
								ret := -0.200000
					if( ema13 > -0.040283 )
						if( ema3 <= 5.98441 )
							if( ema1 <= 6.00832 )
								ret := 0.046606
							if( ema1 > 6.00832 )
								ret := -0.408451
						if( ema3 > 5.98441 )
							if( ema2 <= 6.00963 )
								ret := -0.270732
							if( ema2 > 6.00963 )
								ret := 0.352941
				if( ema3 > 5.99903 )
					if( tema <= 5.97479 )
						if( ema12 <= -0.019475 )
							if( ema13 <= -0.038716 )
								ret := 0.178571
							if( ema13 > -0.038716 )
								ret := -0.571429
						if( ema12 > -0.019475 )
							if( ema2 <= 6.00218 )
								ret := 0.540000
							if( ema2 > 6.00218 )
								ret := 0.815789 // buy
					if( tema > 5.97479 )
						if( ema13 <= 0.346218 )
							if( ema2 <= 7.00411 )
								ret := 0.053443
							if( ema2 > 7.00411 )
								ret := 0.018532
						if( ema13 > 0.346218 )
							if( ema3 <= 11.1516 )
								ret := 0.540541
							if( ema3 > 11.1516 )
								ret := 0.164557
			if( ema2 > 20.4848 )
				if( ema12 <= 0.15612 )
					if( ema13 <= 0.167659 )
						if( ema13 <= 0.078356 )
							if( ema1 <= 20.6316 )
								ret := -0.197452
							if( ema1 > 20.6316 )
								ret := -0.573770
						if( ema13 > 0.078356 )
							if( ema2 <= 20.5461 )
								ret := 0.666667
							if( ema2 > 20.5461 )
								ret := -0.115789
					if( ema13 > 0.167659 )
						if( ema12 <= 0.134415 )
							if( ema13 <= 0.177924 )
								ret := -0.714286 // sell
							if( ema13 > 0.177924 )
								ret := -0.957447 // sell
						if( ema12 > 0.134415 )
							ret := -0.571429
				if( ema12 > 0.15612 )
					if( tema <= 21.6018 )
						if( ema13 <= 0.380484 )
							if( tema <= 21.3495 )
								ret := 0.619048
							if( tema > 21.3495 )
								ret := 1.000000 // buy
						if( ema13 > 0.380484 )
							if( ema13 <= 0.416756 )
								ret := -0.250000
							if( ema13 > 0.416756 )
								ret := 0.666667
					if( tema > 21.6018 )
						if( ema2 <= 20.9489 )
							ret := -1.000000 // sell
						if( ema2 > 20.9489 )
							ret := -0.714286 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_LINKUSDT_15Min_6524e08f(ema12, ema3, ema13, tema, ema1, ema2)

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


