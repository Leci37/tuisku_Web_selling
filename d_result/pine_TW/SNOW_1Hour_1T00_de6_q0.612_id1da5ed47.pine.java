//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: SNOW_1Hour_1T00_1da5ed47 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNOW_1Hour_1T00_1da5ed47", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNOW_1Hour_1da5ed47(ema1, tema, ema12, ema2, ema3, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( tema <= 266.362 )
		if( ema2 <= 238.705 )
			if( ema3 <= 141.626 )
				if( ema2 <= 139.604 )
					if( ema3 <= 129.525 )
						if( ema2 <= 127.3 )
							ret := 0.108130
						if( ema2 > 127.3 )
							ret := 0.417367
					if( ema3 > 129.525 )
						if( ema2 <= 134.073 )
							ret := -0.343348
						if( ema2 > 134.073 )
							ret := 0.118070
				if( ema2 > 139.604 )
					if( tema <= 138.274 )
						if( ema12 <= -1.90936 )
							ret := 0.666667
						if( ema12 > -1.90936 )
							ret := -0.400000
					if( tema > 138.274 )
						if( ema3 <= 140.062 )
							ret := 0.689922
						if( ema3 > 140.062 )
							ret := 0.408730
			if( ema3 > 141.626 )
				if( ema13 <= -9.6703 )
					if( ema1 <= 215.246 )
						if( ema1 <= 207.758 )
							ret := 0.344828
						if( ema1 > 207.758 )
							ret := -0.600000
					if( ema1 > 215.246 )
						if( tema <= 212.456 )
							ret := 0.823529 // buy
						if( tema > 212.456 )
							ret := 1.000000 // buy
				if( ema13 > -9.6703 )
					if( ema13 <= 8.02585 )
						if( ema1 <= 231.946 )
							ret := -0.020630
						if( ema1 > 231.946 )
							ret := -0.247340
					if( ema13 > 8.02585 )
						if( ema1 <= 160.511 )
							ret := -0.772727 // sell
						if( ema1 > 160.511 )
							ret := 0.669355
		if( ema2 > 238.705 )
			if( ema3 <= 278.382 )
				if( ema3 <= 273.745 )
					if( ema1 <= 240.773 )
						if( ema3 <= 242.491 )
							ret := 0.602339
						if( ema3 > 242.491 )
							ret := 0.180328
					if( ema1 > 240.773 )
						if( tema <= 257.217 )
							ret := 0.005656
						if( tema > 257.217 )
							ret := 0.322105
				if( ema3 > 273.745 )
					if( ema2 <= 268.831 )
						ret := -1.000000 // sell
					if( ema2 > 268.831 )
						if( ema3 <= 276.153 )
							ret := 1.000000 // buy
						if( ema3 > 276.153 )
							ret := 0.709677 // buy
			if( ema3 > 278.382 )
				if( ema12 <= -4.6425 )
					if( ema2 <= 280.733 )
						if( tema <= 258.882 )
							ret := -0.900000 // sell
						if( tema > 258.882 )
							ret := -1.000000 // sell
					if( ema2 > 280.733 )
						ret := 0.000000
				if( ema12 > -4.6425 )
					ret := 0.000000
	if( tema > 266.362 )
		if( ema13 <= 3.3842 )
			if( ema12 <= -5.11005 )
				if( ema2 <= 343.517 )
					if( tema <= 323.678 )
						if( ema13 <= -9.94091 )
							ret := 0.846154 // buy
						if( ema13 > -9.94091 )
							ret := 0.310345
					if( tema > 323.678 )
						ret := -0.285714
				if( ema2 > 343.517 )
					if( ema1 <= 368.576 )
						if( tema <= 345.793 )
							ret := 0.111111
						if( tema > 345.793 )
							ret := -0.588235
					if( ema1 > 368.576 )
						if( ema13 <= -12.1153 )
							ret := -0.333333
						if( ema13 > -12.1153 )
							ret := 0.777778 // buy
			if( ema12 > -5.11005 )
				if( tema <= 275.625 )
					if( ema13 <= -6.91739 )
						if( ema1 <= 272.573 )
							ret := -0.833333 // sell
						if( ema1 > 272.573 )
							ret := -1.000000 // sell
					if( ema13 > -6.91739 )
						if( ema3 <= 267.195 )
							ret := -0.581699
						if( ema3 > 267.195 )
							ret := -0.235880
				if( tema > 275.625 )
					if( ema2 <= 370.809 )
						if( ema12 <= 1.72866 )
							ret := -0.080702
						if( ema12 > 1.72866 )
							ret := -0.676056
					if( ema2 > 370.809 )
						if( ema1 <= 393.697 )
							ret := -0.784483 // sell
						if( ema1 > 393.697 )
							ret := -0.145455
		if( ema13 > 3.3842 )
			if( ema3 <= 294.346 )
				if( ema1 <= 271.591 )
					if( ema12 <= 2.21979 )
						if( ema13 <= 3.41299 )
							ret := -1.000000 // sell
						if( ema13 > 3.41299 )
							ret := 0.777778 // buy
					if( ema12 > 2.21979 )
						if( ema12 <= 4.24875 )
							ret := -0.690141
						if( ema12 > 4.24875 )
							ret := 0.545455
				if( ema1 > 271.591 )
					if( ema13 <= 11.7688 )
						if( ema12 <= 3.31031 )
							ret := 0.212121
						if( ema12 > 3.31031 )
							ret := 0.785714 // buy
					if( ema13 > 11.7688 )
						if( tema <= 301.586 )
							ret := -0.769231 // sell
						if( tema > 301.586 )
							ret := 0.542857
			if( ema3 > 294.346 )
				if( ema13 <= 7.59188 )
					if( ema12 <= 2.32128 )
						if( tema <= 360.316 )
							ret := -0.395062
						if( tema > 360.316 )
							ret := 0.319149
					if( ema12 > 2.32128 )
						if( ema12 <= 4.04082 )
							ret := 0.333333
						if( ema12 > 4.04082 )
							ret := -0.454545
				if( ema13 > 7.59188 )
					if( ema2 <= 312.335 )
						if( tema <= 310.706 )
							ret := 0.333333
						if( tema > 310.706 )
							ret := -0.894737 // sell
					if( ema2 > 312.335 )
						if( tema <= 348.779 )
							ret := 0.714286 // buy
						if( tema > 348.779 )
							ret := -0.342466
	
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
float op_operation = decision_tree_0_SNOW_1Hour_1da5ed47(ema1, tema, ema12, ema2, ema3, ema13)

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


