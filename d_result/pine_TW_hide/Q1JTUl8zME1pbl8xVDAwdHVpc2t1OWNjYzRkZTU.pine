//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: CRSR_30Min_1T00_9ccc4de5 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRSR_30Min_1T00_9ccc4de5", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRSR_30Min_9ccc4de5(ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( ema12 <= 0.010727 )
		if( ema2 <= 46.8138 )
			if( ema13 <= -0.559136 )
				if( ema3 <= 33.5339 )
					if( ema1 <= 20.0857 )
						if( ema1 <= 19.0359 )
							ret := 0.464912
						if( ema1 > 19.0359 )
							ret := -0.926829 // sell
					if( ema1 > 20.0857 )
						if( ema12 <= -0.282802 )
							ret := 0.669355
						if( ema12 > -0.282802 )
							ret := -0.047619
				if( ema3 > 33.5339 )
					if( ema3 <= 44.2701 )
						if( ema1 <= 41.5933 )
							ret := 0.125392
						if( ema1 > 41.5933 )
							ret := -0.634146
					if( ema3 > 44.2701 )
						if( ema13 <= -1.87851 )
							ret := 0.523810
						if( ema13 > -1.87851 )
							ret := 0.913043 // buy
			if( ema13 > -0.559136 )
				if( tema <= 39.5482 )
					if( ema1 <= 39.2888 )
						if( ema2 <= 39.1484 )
							ret := 0.056147
						if( ema2 > 39.1484 )
							ret := -0.710145 // sell
					if( ema1 > 39.2888 )
						if( ema13 <= -0.171697 )
							ret := 0.250000
						if( ema13 > -0.171697 )
							ret := 0.842105 // buy
				if( tema > 39.5482 )
					if( ema3 <= 40.8054 )
						if( ema13 <= 0.03596 )
							ret := -0.911765 // sell
						if( ema13 > 0.03596 )
							ret := 0.214286
					if( ema3 > 40.8054 )
						if( ema2 <= 44.9168 )
							ret := -0.185185
						if( ema2 > 44.9168 )
							ret := 0.842105 // buy
		if( ema2 > 46.8138 )
			if( ema12 <= -1.26147 )
				ret := -0.125000
			if( ema12 > -1.26147 )
				if( ema3 <= 47.2371 )
					ret := -0.428571
				if( ema3 > 47.2371 )
					ret := -1.000000 // sell
	if( ema12 > 0.010727 )
		if( ema3 <= 6.31437 )
			if( ema3 <= 6.10614 )
				if( ema3 <= 6.05058 )
					if( ema2 <= 5.76464 )
						ret := -0.250000
					if( ema2 > 5.76464 )
						if( ema12 <= 0.062298 )
							ret := 1.000000 // buy
						if( ema12 > 0.062298 )
							ret := 0.142857
				if( ema3 > 6.05058 )
					if( ema2 <= 6.12401 )
						if( ema2 <= 6.06013 )
							ret := -1.000000 // sell
						if( ema2 > 6.06013 )
							ret := -0.777778 // sell
					if( ema2 > 6.12401 )
						ret := 0.071429
			if( ema3 > 6.10614 )
				if( tema <= 6.47002 )
					if( ema2 <= 6.18963 )
						if( ema3 <= 6.1295 )
							ret := 1.000000 // buy
						if( ema3 > 6.1295 )
							ret := 0.181818
					if( ema2 > 6.18963 )
						if( ema12 <= 0.04808 )
							ret := 1.000000 // buy
						if( ema12 > 0.04808 )
							ret := 0.806452 // buy
				if( tema > 6.47002 )
					if( ema13 <= 0.151777 )
						ret := -0.333333
					if( ema13 > 0.151777 )
						ret := 0.769231 // buy
		if( ema3 > 6.31437 )
			if( ema3 <= 10.9635 )
				if( ema1 <= 6.98514 )
					if( ema2 <= 6.59075 )
						if( ema3 <= 6.44843 )
							ret := 0.086420
						if( ema3 > 6.44843 )
							ret := -0.742268 // sell
					if( ema2 > 6.59075 )
						if( ema1 <= 6.75754 )
							ret := 0.593750
						if( ema1 > 6.75754 )
							ret := -0.123711
				if( ema1 > 6.98514 )
					if( ema13 <= 0.072772 )
						if( ema1 <= 10.6385 )
							ret := -0.406015
						if( ema1 > 10.6385 )
							ret := 0.250000
					if( ema13 > 0.072772 )
						if( ema12 <= 0.04524 )
							ret := -0.444444
						if( ema12 > 0.04524 )
							ret := -0.842857 // sell
			if( ema3 > 10.9635 )
				if( ema13 <= 0.008064 )
					if( ema3 <= 32.2787 )
						if( ema3 <= 26.9204 )
							ret := -0.365967
						if( ema3 > 26.9204 )
							ret := 0.448718
					if( ema3 > 32.2787 )
						if( tema <= 40.9555 )
							ret := -0.657718
						if( tema > 40.9555 )
							ret := 0.076923
				if( ema13 > 0.008064 )
					if( ema13 <= 0.46629 )
						if( tema <= 11.3535 )
							ret := 0.309677
						if( tema > 11.3535 )
							ret := -0.088558
					if( ema13 > 0.46629 )
						if( ema12 <= 0.264032 )
							ret := 0.365942
						if( ema12 > 0.264032 )
							ret := -0.009110
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_CRSR_30Min_9ccc4de5(ema3, tema, ema2, ema12, ema13, ema1)

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


