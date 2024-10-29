//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: QCOM_1Min_1T00_dd1110e6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_QCOM_1Min_1T00_dd1110e6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_QCOM_1Min_dd1110e6(ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ema12 <= 0.286618 )
		if( ema2 <= 158.235 )
			if( ema3 <= 149.144 )
				if( ema3 <= 148.277 )
					ret := 0.727273 // buy
				if( ema3 > 148.277 )
					ret := 1.000000 // buy
			if( ema3 > 149.144 )
				if( ema3 <= 155.744 )
					if( ema13 <= 0.361718 )
						if( tema <= 150.763 )
							if( tema <= 149.376 )
								ret := -1.000000 // sell
							if( tema > 149.376 )
								if( ema3 <= 150.817 )
									ret := -0.235294
								if( ema3 > 150.817 )
									ret := 0.962963 // buy
						if( tema > 150.763 )
							if( ema12 <= -0.215555 )
								if( tema <= 151.885 )
									ret := 0.800000 // buy
								if( tema > 151.885 )
									ret := 0.200000
							if( ema12 > -0.215555 )
								if( ema1 <= 155.677 )
									ret := -0.911765 // sell
								if( ema1 > 155.677 )
									ret := -0.142857
					if( ema13 > 0.361718 )
						if( tema <= 151.773 )
							ret := 1.000000 // buy
						if( tema > 151.773 )
							ret := 0.833333 // buy
				if( ema3 > 155.744 )
					if( ema13 <= -0.320148 )
						if( ema13 <= -0.67474 )
							if( tema <= 156.272 )
								if( ema13 <= -1.01202 )
									ret := 0.966667 // buy
								if( ema13 > -1.01202 )
									ret := 0.363636
							if( tema > 156.272 )
								if( ema2 <= 157.464 )
									ret := -0.578947
								if( ema2 > 157.464 )
									ret := 0.411765
						if( ema13 > -0.67474 )
							if( ema3 <= 157.993 )
								if( ema12 <= -0.244932 )
									ret := 0.698413
								if( ema12 > -0.244932 )
									ret := 0.909091 // buy
							if( ema3 > 157.993 )
								if( ema13 <= -0.358038 )
									ret := 0.696629
								if( ema13 > -0.358038 )
									ret := -0.250000
					if( ema13 > -0.320148 )
						if( ema12 <= 0.127339 )
							if( ema1 <= 157.234 )
								if( ema3 <= 156.303 )
									ret := -0.444444
								if( ema3 > 156.303 )
									ret := 0.634615
							if( ema1 > 157.234 )
								if( ema2 <= 157.26 )
									ret := -0.757576 // sell
								if( ema2 > 157.26 )
									ret := 0.184524
						if( ema12 > 0.127339 )
							if( ema2 <= 157.745 )
								if( ema13 <= 0.521324 )
									ret := -0.570248
								if( ema13 > 0.521324 )
									ret := 0.777778 // buy
							if( ema2 > 157.745 )
								if( ema12 <= 0.138524 )
									ret := -0.642857
								if( ema12 > 0.138524 )
									ret := 0.658537
		if( ema2 > 158.235 )
			if( tema <= 229.287 )
				if( ema1 <= 158.176 )
					if( tema <= 157.61 )
						if( ema12 <= -0.378567 )
							ret := -1.000000 // sell
						if( ema12 > -0.378567 )
							ret := -0.571429
					if( tema > 157.61 )
						if( tema <= 157.722 )
							ret := 0.200000
						if( tema > 157.722 )
							ret := -0.200000
				if( ema1 > 158.176 )
					if( tema <= 157.935 )
						if( ema13 <= -0.738784 )
							ret := 1.000000 // buy
						if( ema13 > -0.738784 )
							if( tema <= 157.902 )
								ret := 0.625000
							if( tema > 157.902 )
								ret := 0.818182 // buy
					if( tema > 157.935 )
						if( ema12 <= -0.701272 )
							if( ema2 <= 217.605 )
								if( ema13 <= -2.98754 )
									ret := -0.454545
								if( ema13 > -2.98754 )
									ret := 0.460154
							if( ema2 > 217.605 )
								if( ema13 <= -1.63936 )
									ret := -0.409091
								if( ema13 > -1.63936 )
									ret := -0.878788 // sell
						if( ema12 > -0.701272 )
							if( ema2 <= 158.352 )
								if( ema1 <= 158.437 )
									ret := -0.675676
								if( ema1 > 158.437 )
									ret := 0.384615
							if( ema2 > 158.352 )
								if( ema2 <= 158.535 )
									ret := 0.476744
								if( ema2 > 158.535 )
									ret := 0.007198
			if( tema > 229.287 )
				if( ema1 <= 229.495 )
					if( ema2 <= 229.117 )
						if( tema <= 229.425 )
							if( ema13 <= 0.161694 )
								ret := -1.000000 // sell
							if( ema13 > 0.161694 )
								ret := -0.555556
						if( tema > 229.425 )
							if( ema2 <= 229.034 )
								ret := -0.909091 // sell
							if( ema2 > 229.034 )
								ret := -1.000000 // sell
					if( ema2 > 229.117 )
						if( ema13 <= 0.095164 )
							if( ema3 <= 229.367 )
								ret := 0.000000
							if( ema3 > 229.367 )
								if( ema13 <= 0.030751 )
									ret := -0.600000
								if( ema13 > 0.030751 )
									ret := -1.000000 // sell
						if( ema13 > 0.095164 )
							ret := -0.043478
				if( ema1 > 229.495 )
					if( ema2 <= 229.414 )
						ret := -0.529412
					if( ema2 > 229.414 )
						if( ema2 <= 229.621 )
							if( tema <= 229.525 )
								ret := -0.900000 // sell
							if( tema > 229.525 )
								ret := -1.000000 // sell
						if( ema2 > 229.621 )
							ret := -0.533333
	if( ema12 > 0.286618 )
		if( tema <= 209.823 )
			if( tema <= 156.987 )
				if( ema3 <= 150.9 )
					if( ema13 <= 0.890175 )
						if( ema3 <= 149.185 )
							ret := 1.000000 // buy
						if( ema3 > 149.185 )
							ret := 0.600000
					if( ema13 > 0.890175 )
						if( ema2 <= 148.765 )
							ret := -0.818182 // sell
						if( ema2 > 148.765 )
							ret := -1.000000 // sell
				if( ema3 > 150.9 )
					ret := 1.000000 // buy
			if( tema > 156.987 )
				if( ema3 <= 166.733 )
					if( ema1 <= 166.862 )
						if( ema1 <= 166.416 )
							if( ema1 <= 157.235 )
								if( ema1 <= 156.88 )
									ret := -0.666667
								if( ema1 > 156.88 )
									ret := -1.000000 // sell
							if( ema1 > 157.235 )
								if( ema13 <= 0.349748 )
									ret := 0.400000
								if( ema13 > 0.349748 )
									ret := -0.261691
						if( ema1 > 166.416 )
							if( ema1 <= 166.524 )
								ret := 0.909091 // buy
							if( ema1 > 166.524 )
								if( ema12 <= 0.364192 )
									ret := 0.680000
								if( ema12 > 0.364192 )
									ret := 0.142857
					if( ema1 > 166.862 )
						if( ema13 <= 0.616006 )
							ret := -0.148148
						if( ema13 > 0.616006 )
							if( ema1 <= 167.338 )
								if( tema <= 167.297 )
									ret := -1.000000 // sell
								if( tema > 167.297 )
									ret := -0.727273 // sell
							if( ema1 > 167.338 )
								ret := -0.250000
				if( ema3 > 166.733 )
					if( ema13 <= 0.611176 )
						if( tema <= 209.593 )
							if( ema2 <= 207.528 )
								if( tema <= 206.938 )
									ret := -0.281385
								if( tema > 206.938 )
									ret := 0.777778 // buy
							if( ema2 > 207.528 )
								if( ema2 <= 208.424 )
									ret := -0.926829 // sell
								if( ema2 > 208.424 )
									ret := -0.461538
						if( tema > 209.593 )
							ret := 0.928571 // buy
					if( ema13 > 0.611176 )
						if( tema <= 168.541 )
							if( tema <= 167.991 )
								ret := 0.545455
							if( tema > 167.991 )
								if( ema1 <= 167.716 )
									ret := 1.000000 // buy
								if( ema1 > 167.716 )
									ret := 0.904762 // buy
						if( tema > 168.541 )
							if( ema13 <= 6.29455 )
								if( tema <= 208.527 )
									ret := 0.005879
								if( tema > 208.527 )
									ret := 0.394958
							if( ema13 > 6.29455 )
								ret := -1.000000 // sell
		if( tema > 209.823 )
			if( ema12 <= 0.402642 )
				if( ema13 <= 0.659702 )
					if( ema3 <= 227.709 )
						if( ema3 <= 224.403 )
							if( ema2 <= 215.343 )
								if( ema1 <= 215.088 )
									ret := -0.146789
								if( ema1 > 215.088 )
									ret := 0.687500
							if( ema2 > 215.343 )
								if( ema1 <= 217.228 )
									ret := -0.868421 // sell
								if( ema1 > 217.228 )
									ret := 0.060606
						if( ema3 > 224.403 )
							if( ema2 <= 225.816 )
								ret := 1.000000 // buy
							if( ema2 > 225.816 )
								ret := 0.636364
					if( ema3 > 227.709 )
						if( ema2 <= 228.382 )
							ret := -0.937500 // sell
						if( ema2 > 228.382 )
							ret := -0.470588
				if( ema13 > 0.659702 )
					if( ema12 <= 0.360986 )
						if( ema3 <= 215.139 )
							if( ema3 <= 210.135 )
								ret := -0.947368 // sell
							if( ema3 > 210.135 )
								ret := -0.846154 // sell
						if( ema3 > 215.139 )
							if( ema12 <= 0.32995 )
								ret := -0.833333 // sell
							if( ema12 > 0.32995 )
								ret := -0.500000
					if( ema12 > 0.360986 )
						if( tema <= 214.448 )
							ret := -1.000000 // sell
						if( tema > 214.448 )
							if( ema1 <= 226.666 )
								if( ema2 <= 215.237 )
									ret := 0.615385
								if( ema2 > 215.237 )
									ret := 0.500000
							if( ema1 > 226.666 )
								ret := -0.571429
			if( ema12 > 0.402642 )
				if( tema <= 212.654 )
					if( tema <= 211.674 )
						if( tema <= 211.148 )
							if( tema <= 210.058 )
								ret := -1.000000 // sell
							if( tema > 210.058 )
								if( tema <= 210.525 )
									ret := -0.750000 // sell
								if( tema > 210.525 )
									ret := -1.000000 // sell
						if( tema > 211.148 )
							ret := -0.300000
					if( tema > 211.674 )
						ret := -1.000000 // sell
				if( tema > 212.654 )
					if( tema <= 214.971 )
						if( ema3 <= 210.65 )
							ret := -0.857143 // sell
						if( ema3 > 210.65 )
							if( tema <= 214.353 )
								ret := 0.000000
							if( tema > 214.353 )
								ret := 0.812500 // buy
					if( tema > 214.971 )
						if( tema <= 218.572 )
							if( ema3 <= 215.385 )
								if( ema1 <= 215.014 )
									ret := -0.893617 // sell
								if( ema1 > 215.014 )
									ret := -0.263158
							if( ema3 > 215.385 )
								ret := -1.000000 // sell
						if( tema > 218.572 )
							if( ema2 <= 229.278 )
								if( tema <= 229.25 )
									ret := -0.536585
								if( tema > 229.25 )
									ret := 0.052632
							if( ema2 > 229.278 )
								ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_QCOM_1Min_dd1110e6(ema2, ema1, ema12, ema3, ema13, tema)

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


