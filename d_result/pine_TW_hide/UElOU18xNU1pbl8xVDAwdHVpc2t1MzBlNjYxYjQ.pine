//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: PINS_15Min_1T00_30e661b4 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PINS_15Min_1T00_30e661b4", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PINS_15Min_30e661b4(ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( ema12 <= 0.00649 )
		if( ema3 <= 86.3845 )
			if( ema12 <= -0.233731 )
				if( ema1 <= 27.2585 )
					if( ema1 <= 21.7539 )
						if( tema <= 21.267 )
							if( tema <= 20.5293 )
								ret := 0.081784
							if( tema > 20.5293 )
								ret := 0.746269 // buy
						if( tema > 21.267 )
							if( ema12 <= -0.309223 )
								ret := -0.750000 // sell
							if( ema12 > -0.309223 )
								ret := -1.000000 // sell
					if( ema1 > 21.7539 )
						if( ema13 <= -1.4005 )
							if( ema2 <= 24.9088 )
								ret := 0.400000
							if( ema2 > 24.9088 )
								ret := -0.619048
						if( ema13 > -1.4005 )
							if( ema2 <= 26.2497 )
								ret := 0.409091
							if( ema2 > 26.2497 )
								ret := 0.700000 // buy
				if( ema1 > 27.2585 )
					if( ema1 <= 72.3638 )
						if( tema <= 65.8098 )
							if( ema3 <= 67.0356 )
								ret := 0.055138
							if( ema3 > 67.0356 )
								ret := -0.623188
						if( tema > 65.8098 )
							if( ema2 <= 67.8434 )
								ret := 0.748299 // buy
							if( ema2 > 67.8434 )
								ret := 0.211738
					if( ema1 > 72.3638 )
						if( tema <= 74.5069 )
							if( ema13 <= -0.518255 )
								ret := -0.588983
							if( ema13 > -0.518255 )
								ret := -0.223881
						if( tema > 74.5069 )
							if( ema3 <= 75.9739 )
								ret := 0.660000
							if( ema3 > 75.9739 )
								ret := -0.026439
			if( ema12 > -0.233731 )
				if( ema1 <= 16.1225 )
					if( ema1 <= 15.4967 )
						if( ema12 <= -0.142575 )
							if( ema1 <= 12.1438 )
								ret := 0.901408 // buy
							if( ema1 > 12.1438 )
								ret := 0.035533
						if( ema12 > -0.142575 )
							if( ema1 <= 10.9153 )
								ret := 0.789474 // buy
							if( ema1 > 10.9153 )
								ret := -0.221769
					if( ema1 > 15.4967 )
						if( ema2 <= 15.9468 )
							if( tema <= 15.434 )
								ret := -0.600000
							if( tema > 15.434 )
								ret := -0.982759 // sell
						if( ema2 > 15.9468 )
							if( ema13 <= -0.305314 )
								ret := -0.250000
							if( ema13 > -0.305314 )
								ret := -1.000000 // sell
				if( ema1 > 16.1225 )
					if( tema <= 17.3573 )
						if( ema2 <= 16.3394 )
							ret := 1.000000 // buy
						if( ema2 > 16.3394 )
							if( ema2 <= 17.2543 )
								ret := 0.135417
							if( ema2 > 17.2543 )
								ret := 0.539007
					if( tema > 17.3573 )
						if( ema3 <= 17.6257 )
							if( ema13 <= -0.010183 )
								ret := -0.123077
							if( ema13 > -0.010183 )
								ret := -0.879310 // sell
						if( ema3 > 17.6257 )
							if( ema1 <= 17.5437 )
								ret := 0.795918 // buy
							if( ema1 > 17.5437 )
								ret := 0.031718
		if( ema3 > 86.3845 )
			if( tema <= 84.3861 )
				ret := 1.000000 // buy
			if( tema > 84.3861 )
				if( ema2 <= 87.0483 )
					if( ema3 <= 86.6034 )
						if( tema <= 85.63 )
							ret := -0.750000 // sell
						if( tema > 85.63 )
							ret := -0.500000
					if( ema3 > 86.6034 )
						ret := 0.000000
				if( ema2 > 87.0483 )
					if( tema <= 86.0109 )
						if( ema13 <= -1.47374 )
							ret := -1.000000 // sell
						if( ema13 > -1.47374 )
							ret := 0.000000
					if( tema > 86.0109 )
						if( tema <= 86.8151 )
							if( ema2 <= 87.2509 )
								ret := -1.000000 // sell
							if( ema2 > 87.2509 )
								ret := -0.727273 // sell
						if( tema > 86.8151 )
							if( ema2 <= 88.9801 )
								ret := -1.000000 // sell
							if( ema2 > 88.9801 )
								ret := -0.500000
	if( ema12 > 0.00649 )
		if( ema12 <= 0.344241 )
			if( ema2 <= 62.2733 )
				if( tema <= 26.4921 )
					if( ema1 <= 24.0273 )
						if( ema13 <= -0.041031 )
							if( ema2 <= 11.4092 )
								ret := 0.750000 // buy
							if( ema2 > 11.4092 )
								ret := -0.740385 // sell
						if( ema13 > -0.041031 )
							if( ema2 <= 22.6309 )
								ret := -0.008304
							if( ema2 > 22.6309 )
								ret := -0.133899
					if( ema1 > 24.0273 )
						if( ema3 <= 23.8108 )
							if( ema12 <= 0.310137 )
								ret := 0.836066 // buy
							if( ema12 > 0.310137 )
								ret := 0.000000
						if( ema3 > 23.8108 )
							if( ema1 <= 26.4707 )
								ret := 0.042020
							if( ema1 > 26.4707 )
								ret := -0.791667 // sell
				if( tema > 26.4921 )
					if( ema3 <= 59.6729 )
						if( ema2 <= 57.4802 )
							if( ema2 <= 27.0941 )
								ret := -0.171933
							if( ema2 > 27.0941 )
								ret := -0.063973
						if( ema2 > 57.4802 )
							if( ema2 <= 58.4714 )
								ret := 0.637168
							if( ema2 > 58.4714 )
								ret := 0.061594
					if( ema3 > 59.6729 )
						if( ema13 <= 0.066237 )
							if( ema2 <= 61.2 )
								ret := 0.037037
							if( ema2 > 61.2 )
								ret := -0.804878 // sell
						if( ema13 > 0.066237 )
							if( ema3 <= 60.9755 )
								ret := -0.420000
							if( ema3 > 60.9755 )
								ret := 0.097902
			if( ema2 > 62.2733 )
				if( ema1 <= 65.6632 )
					if( ema2 <= 64.651 )
						if( ema1 <= 62.7172 )
							if( ema3 <= 62.1435 )
								ret := -0.166667
							if( ema3 > 62.1435 )
								ret := 0.600000
						if( ema1 > 62.7172 )
							if( ema3 <= 62.5266 )
								ret := -0.552632
							if( ema3 > 62.5266 )
								ret := 0.143275
					if( ema2 > 64.651 )
						if( ema3 <= 64.701 )
							if( ema12 <= 0.127031 )
								ret := 0.961538 // buy
							if( ema12 > 0.127031 )
								ret := 0.636364
						if( ema3 > 64.701 )
							if( ema1 <= 65.4803 )
								ret := 0.022727
							if( ema1 > 65.4803 )
								ret := 0.718750 // buy
				if( ema1 > 65.6632 )
					if( ema2 <= 66.287 )
						if( ema12 <= 0.14562 )
							if( ema1 <= 65.7546 )
								ret := 1.000000 // buy
							if( ema1 > 65.7546 )
								ret := -0.367347
						if( ema12 > 0.14562 )
							if( ema1 <= 66.3235 )
								ret := -0.864865 // sell
							if( ema1 > 66.3235 )
								ret := -0.346154
					if( ema2 > 66.287 )
						if( ema12 <= 0.280357 )
							if( ema12 <= 0.157324 )
								ret := -0.022960
							if( ema12 > 0.157324 )
								ret := 0.122076
						if( ema12 > 0.280357 )
							if( ema1 <= 80.7043 )
								ret := -0.109272
							if( ema1 > 80.7043 )
								ret := -0.564706
		if( ema12 > 0.344241 )
			if( ema12 <= 1.12851 )
				if( tema <= 44.5683 )
					if( ema2 <= 35.5637 )
						if( ema3 <= 31.5109 )
							if( ema2 <= 30.4167 )
								ret := -0.071124
							if( ema2 > 30.4167 )
								ret := 0.671642
						if( ema3 > 31.5109 )
							if( ema1 <= 34.7266 )
								ret := -0.638889
							if( ema1 > 34.7266 )
								ret := -0.017241
					if( ema2 > 35.5637 )
						if( ema3 <= 39.2219 )
							if( ema13 <= 0.649858 )
								ret := 0.000000
							if( ema13 > 0.649858 )
								ret := 0.705882 // buy
						if( ema3 > 39.2219 )
							if( tema <= 43.0053 )
								ret := -0.547619
							if( tema > 43.0053 )
								ret := 0.607143
				if( tema > 44.5683 )
					if( tema <= 47.1876 )
						if( ema13 <= 0.544885 )
							ret := 0.000000
						if( ema13 > 0.544885 )
							if( ema12 <= 0.519168 )
								ret := -0.921875 // sell
							if( ema12 > 0.519168 )
								ret := -0.333333
					if( tema > 47.1876 )
						if( ema3 <= 72.3155 )
							if( ema13 <= 0.840524 )
								ret := -0.345576
							if( ema13 > 0.840524 )
								ret := -0.058455
						if( ema3 > 72.3155 )
							if( ema12 <= 0.50831 )
								ret := -0.252033
							if( ema12 > 0.50831 )
								ret := -0.549107
			if( ema12 > 1.12851 )
				if( ema1 <= 58.4989 )
					if( ema12 <= 1.6796 )
						if( ema12 <= 1.27485 )
							if( ema2 <= 25.5394 )
								ret := 0.428571
							if( ema2 > 25.5394 )
								ret := 0.875000 // buy
						if( ema12 > 1.27485 )
							if( ema1 <= 28.2402 )
								ret := -0.666667
							if( ema1 > 28.2402 )
								ret := 0.555556
					if( ema12 > 1.6796 )
						if( ema13 <= 2.80253 )
							ret := 0.500000
						if( ema13 > 2.80253 )
							if( ema2 <= 28.4995 )
								ret := -0.600000
							if( ema2 > 28.4995 )
								ret := -1.000000 // sell
				if( ema1 > 58.4989 )
					if( ema3 <= 83.554 )
						if( ema1 <= 83.7266 )
							if( ema1 <= 81.8355 )
								ret := 0.788732 // buy
							if( ema1 > 81.8355 )
								ret := -0.333333
						if( ema1 > 83.7266 )
							if( ema1 <= 85.1808 )
								ret := 1.000000 // buy
							if( ema1 > 85.1808 )
								ret := 0.000000
					if( ema3 > 83.554 )
						if( ema13 <= 2.41279 )
							ret := -0.750000 // sell
						if( ema13 > 2.41279 )
							ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_PINS_15Min_30e661b4(ema12, ema3, ema13, tema, ema1, ema2)

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


