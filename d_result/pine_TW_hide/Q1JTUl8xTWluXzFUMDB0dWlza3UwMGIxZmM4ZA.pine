//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: CRSR_1Min_1T00_00b1fc8d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRSR_1Min_1T00_00b1fc8d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRSR_1Min_00b1fc8d(ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( ema2 <= 6.08993 )
		if( ema13 <= -0.003083 )
			if( ema13 <= -0.05665 )
				if( tema <= 5.84231 )
					if( ema1 <= 5.85282 )
						ret := 1.000000 // buy
					if( ema1 > 5.85282 )
						ret := 0.941176 // buy
				if( tema > 5.84231 )
					if( tema <= 5.9405 )
						if( ema12 <= -0.068531 )
							ret := 0.636364
						if( ema12 > -0.068531 )
							ret := -0.660000
					if( tema > 5.9405 )
						if( tema <= 5.95345 )
							ret := 0.916667 // buy
						if( tema > 5.95345 )
							ret := 0.222222
			if( ema13 > -0.05665 )
				if( ema12 <= -0.017922 )
					if( tema <= 5.79342 )
						ret := -1.000000 // sell
					if( tema > 5.79342 )
						if( ema2 <= 6.05808 )
							ret := 0.259259
						if( ema2 > 6.05808 )
							ret := -0.791667 // sell
				if( ema12 > -0.017922 )
					if( ema2 <= 6.08292 )
						if( ema1 <= 5.62085 )
							ret := 0.954545 // buy
						if( ema1 > 5.62085 )
							ret := -0.008961
					if( ema2 > 6.08292 )
						if( ema3 <= 6.0948 )
							ret := 0.466667
						if( ema3 > 6.0948 )
							ret := 1.000000 // buy
		if( ema13 > -0.003083 )
			if( ema3 <= 5.89391 )
				if( tema <= 5.93575 )
					if( ema2 <= 5.88449 )
						if( ema2 <= 5.66569 )
							ret := 0.627907
						if( ema2 > 5.66569 )
							ret := 0.184116
					if( ema2 > 5.88449 )
						if( ema1 <= 5.89499 )
							ret := -1.000000 // sell
						if( ema1 > 5.89499 )
							ret := -0.285714
				if( tema > 5.93575 )
					if( ema13 <= 0.052526 )
						ret := -1.000000 // sell
					if( ema13 > 0.052526 )
						ret := -0.750000 // sell
			if( ema3 > 5.89391 )
				if( ema1 <= 6.04751 )
					if( tema <= 6.03039 )
						if( ema3 <= 6.00324 )
							ret := 0.670330
						if( ema3 > 6.00324 )
							ret := -0.181818
					if( tema > 6.03039 )
						if( ema13 <= 0.001155 )
							ret := 0.083333
						if( ema13 > 0.001155 )
							ret := 0.940171 // buy
				if( ema1 > 6.04751 )
					if( ema2 <= 6.06668 )
						if( ema13 <= 0.021448 )
							ret := 0.336364
						if( ema13 > 0.021448 )
							ret := -0.324786
					if( ema2 > 6.06668 )
						if( ema3 <= 6.07526 )
							ret := 0.669065
						if( ema3 > 6.07526 )
							ret := 0.157895
	if( ema2 > 6.08993 )
		if( ema12 <= 0.036155 )
			if( tema <= 6.0724 )
				if( ema3 <= 6.11537 )
					ret := -0.285714
				if( ema3 > 6.11537 )
					if( ema1 <= 6.08473 )
						ret := -1.000000 // sell
					if( ema1 > 6.08473 )
						if( ema13 <= -0.037598 )
							ret := -0.687500
						if( ema13 > -0.037598 )
							ret := -0.920000 // sell
			if( tema > 6.0724 )
				if( ema12 <= -0.013599 )
					if( ema3 <= 7.6675 )
						if( ema2 <= 7.06932 )
							ret := 0.001601
						if( ema2 > 7.06932 )
							ret := -0.392996
					if( ema3 > 7.6675 )
						if( tema <= 8.22112 )
							ret := 0.483204
						if( tema > 8.22112 )
							ret := 0.120392
				if( ema12 > -0.013599 )
					if( ema3 <= 7.17831 )
						if( ema1 <= 7.1131 )
							ret := 0.010442
						if( ema1 > 7.1131 )
							ret := 0.248737
					if( ema3 > 7.17831 )
						if( ema1 <= 9.95461 )
							ret := -0.150126
						if( ema1 > 9.95461 )
							ret := -0.016907
		if( ema12 > 0.036155 )
			if( ema13 <= 0.060602 )
				if( ema3 <= 9.09114 )
					if( ema12 <= 0.036864 )
						ret := -0.611111
					if( ema12 > 0.036864 )
						ret := -1.000000 // sell
				if( ema3 > 9.09114 )
					if( ema12 <= 0.042384 )
						if( ema12 <= 0.036996 )
							ret := -1.000000 // sell
						if( ema12 > 0.036996 )
							ret := -0.285714
					if( ema12 > 0.042384 )
						ret := -0.954545 // sell
			if( ema13 > 0.060602 )
				if( ema12 <= 0.11863 )
					if( ema1 <= 6.58145 )
						if( ema13 <= 0.094544 )
							ret := -0.222222
						if( ema13 > 0.094544 )
							ret := 0.542373
					if( ema1 > 6.58145 )
						if( ema3 <= 8.05213 )
							ret := -0.825688 // sell
						if( ema3 > 8.05213 )
							ret := -0.026316
				if( ema12 > 0.11863 )
					if( tema <= 11.3884 )
						ret := -1.000000 // sell
					if( tema > 11.3884 )
						ret := -0.818182 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_CRSR_1Min_00b1fc8d(ema3, tema, ema2, ema12, ema13, ema1)

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


