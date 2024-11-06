//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: META_1Min_1T00_090f1afd Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_META_1Min_1T00_090f1afd", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_META_1Min_090f1afd(ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= -0.13237 )
		if( tema <= 431.073 )
			if( ema13 <= -1.41391 )
				if( ema2 <= 432.926 )
					if( ema3 <= 431.165 )
						if( tema <= 416.421 )
							if( ema2 <= 414.822 )
								ret := 0.500000
							if( ema2 > 414.822 )
								if( ema1 <= 416.067 )
									ret := 1.000000 // buy
								if( ema1 > 416.067 )
									ret := 0.750000 // buy
						if( tema > 416.421 )
							if( ema1 <= 419.37 )
								ret := -0.800000 // sell
							if( ema1 > 419.37 )
								if( ema13 <= -1.7905 )
									ret := -0.250000
								if( ema13 > -1.7905 )
									ret := 0.761905 // buy
					if( ema3 > 431.165 )
						if( ema2 <= 432.67 )
							if( ema1 <= 430.901 )
								ret := 1.000000 // buy
							if( ema1 > 430.901 )
								if( ema2 <= 432.205 )
									ret := 0.500000
								if( ema2 > 432.205 )
									ret := 1.000000 // buy
						if( ema2 > 432.67 )
							ret := 0.500000
				if( ema2 > 432.926 )
					if( tema <= 429.317 )
						ret := -1.000000 // sell
					if( tema > 429.317 )
						ret := 0.000000
			if( ema13 > -1.41391 )
				if( ema2 <= 424.894 )
					if( ema2 <= 420.332 )
						if( ema2 <= 412.342 )
							ret := 1.000000 // buy
						if( ema2 > 412.342 )
							if( ema3 <= 415.989 )
								if( ema1 <= 412.422 )
									ret := 0.250000
								if( ema1 > 412.422 )
									ret := -1.000000 // sell
							if( ema3 > 415.989 )
								if( ema13 <= -1.07627 )
									ret := 0.880000 // buy
								if( ema13 > -1.07627 )
									ret := 0.239437
					if( ema2 > 420.332 )
						if( ema3 <= 422.246 )
							if( ema2 <= 421.379 )
								ret := -1.000000 // sell
							if( ema2 > 421.379 )
								ret := -0.750000 // sell
						if( ema3 > 422.246 )
							if( ema13 <= -0.865425 )
								if( ema2 <= 422.582 )
									ret := 0.000000
								if( ema2 > 422.582 )
									ret := -0.833333 // sell
							if( ema13 > -0.865425 )
								if( ema12 <= -0.437132 )
									ret := -0.500000
								if( ema12 > -0.437132 )
									ret := 0.666667
				if( ema2 > 424.894 )
					if( ema3 <= 430.241 )
						if( ema12 <= -0.236246 )
							if( tema <= 426.334 )
								if( ema1 <= 426.436 )
									ret := 0.705882 // buy
								if( ema1 > 426.436 )
									ret := -0.200000
							if( tema > 426.334 )
								if( ema12 <= -0.575647 )
									ret := 0.400000
								if( ema12 > -0.575647 )
									ret := 0.873418 // buy
						if( ema12 > -0.236246 )
							if( ema3 <= 428.237 )
								if( tema <= 426.877 )
									ret := 0.117647
								if( tema > 426.877 )
									ret := -0.636364
							if( ema3 > 428.237 )
								if( ema1 <= 429.548 )
									ret := 0.350000
								if( ema1 > 429.548 )
									ret := 0.777778 // buy
					if( ema3 > 430.241 )
						if( tema <= 428.74 )
							ret := -1.000000 // sell
						if( tema > 428.74 )
							if( ema2 <= 430.556 )
								if( ema1 <= 430.229 )
									ret := -0.434783
								if( ema1 > 430.229 )
									ret := 0.750000 // buy
							if( ema2 > 430.556 )
								if( ema2 <= 430.61 )
									ret := 0.933333 // buy
								if( ema2 > 430.61 )
									ret := 0.174603
		if( tema > 431.073 )
			if( ema3 <= 434.224 )
				if( ema3 <= 433.586 )
					if( tema <= 431.7 )
						if( ema2 <= 432.22 )
							if( ema12 <= -0.156093 )
								if( tema <= 431.224 )
									ret := 0.250000
								if( tema > 431.224 )
									ret := -0.076923
							if( ema12 > -0.156093 )
								ret := -0.800000 // sell
						if( ema2 > 432.22 )
							if( ema12 <= -0.628648 )
								ret := -0.750000 // sell
							if( ema12 > -0.628648 )
								if( ema1 <= 432.056 )
									ret := -0.750000 // sell
								if( ema1 > 432.056 )
									ret := -1.000000 // sell
					if( tema > 431.7 )
						if( ema13 <= -0.192849 )
							if( ema12 <= -0.160486 )
								if( ema3 <= 433.42 )
									ret := 0.000000
								if( ema3 > 433.42 )
									ret := 0.750000 // buy
							if( ema12 > -0.160486 )
								ret := -0.500000
						if( ema13 > -0.192849 )
							if( ema13 <= -0.120452 )
								ret := 1.000000 // buy
							if( ema13 > -0.120452 )
								ret := 0.500000
				if( ema3 > 433.586 )
					if( ema12 <= -0.519678 )
						ret := -0.250000
					if( ema12 > -0.519678 )
						if( tema <= 432.955 )
							if( ema13 <= -0.848715 )
								ret := -0.750000 // sell
							if( ema13 > -0.848715 )
								ret := -1.000000 // sell
						if( tema > 432.955 )
							ret := -0.750000 // sell
			if( ema3 > 434.224 )
				if( ema2 <= 468.503 )
					if( ema12 <= -0.665965 )
						if( ema2 <= 465.042 )
							if( ema3 <= 440.236 )
								if( ema3 <= 435.854 )
									ret := -0.590909
								if( ema3 > 435.854 )
									ret := 0.342857
							if( ema3 > 440.236 )
								if( ema2 <= 441.081 )
									ret := -0.666667
								if( ema2 > 441.081 )
									ret := -0.134513
						if( ema2 > 465.042 )
							if( ema13 <= -1.0463 )
								if( tema <= 461.899 )
									ret := -0.500000
								if( tema > 461.899 )
									ret := 0.674157
							if( ema13 > -1.0463 )
								ret := -0.750000 // sell
					if( ema12 > -0.665965 )
						if( ema3 <= 448.229 )
							if( ema2 <= 435.179 )
								if( ema2 <= 434.763 )
									ret := 0.063830
								if( ema2 > 434.763 )
									ret := 0.833333 // buy
							if( ema2 > 435.179 )
								if( ema3 <= 437.448 )
									ret := -0.437500
								if( ema3 > 437.448 )
									ret := 0.056452
						if( ema3 > 448.229 )
							if( ema3 <= 457.211 )
								if( ema12 <= -0.144512 )
									ret := 0.627778
								if( ema12 > -0.144512 )
									ret := -0.157895
							if( ema3 > 457.211 )
								if( ema1 <= 457.161 )
									ret := -0.391304
								if( ema1 > 457.161 )
									ret := 0.211786
				if( ema2 > 468.503 )
					if( ema2 <= 596.337 )
						if( ema1 <= 485.535 )
							if( ema2 <= 477.134 )
								if( ema12 <= -0.521426 )
									ret := 0.296530
								if( ema12 > -0.521426 )
									ret := -0.004423
							if( ema2 > 477.134 )
								if( tema <= 474.63 )
									ret := 1.000000 // buy
								if( tema > 474.63 )
									ret := -0.099042
						if( ema1 > 485.535 )
							if( ema1 <= 487.109 )
								if( ema2 <= 487.014 )
									ret := 0.250859
								if( ema2 > 487.014 )
									ret := 0.573684
							if( ema1 > 487.109 )
								if( ema2 <= 488.504 )
									ret := -0.289377
								if( ema2 > 488.504 )
									ret := 0.083693
					if( ema2 > 596.337 )
						if( ema2 <= 596.856 )
							if( ema1 <= 596.162 )
								ret := -0.500000
							if( ema1 > 596.162 )
								ret := -1.000000 // sell
						if( ema2 > 596.856 )
							if( ema3 <= 598.209 )
								if( ema1 <= 596.721 )
									ret := 0.500000
								if( ema1 > 596.721 )
									ret := 0.000000
							if( ema3 > 598.209 )
								if( ema2 <= 598.516 )
									ret := -1.000000 // sell
								if( ema2 > 598.516 )
									ret := -0.571429
	if( ema12 > -0.13237 )
		if( ema2 <= 596.163 )
			if( ema12 <= 0.596512 )
				if( ema12 <= 0.017301 )
					if( ema2 <= 412.906 )
						if( ema13 <= -0.006763 )
							ret := 0.750000 // buy
						if( ema13 > -0.006763 )
							ret := 1.000000 // buy
					if( ema2 > 412.906 )
						if( ema3 <= 428.758 )
							if( ema2 <= 428.146 )
								if( ema13 <= -0.171396 )
									ret := -0.569444
								if( ema13 > -0.171396 )
									ret := 0.214286
							if( ema2 > 428.146 )
								ret := -1.000000 // sell
						if( ema3 > 428.758 )
							if( ema3 <= 442.098 )
								if( ema12 <= -0.040499 )
									ret := 0.261538
								if( ema12 > -0.040499 )
									ret := 0.011364
							if( ema3 > 442.098 )
								if( ema2 <= 449.699 )
									ret := -0.276224
								if( ema2 > 449.699 )
									ret := 0.010322
				if( ema12 > 0.017301 )
					if( ema3 <= 531.144 )
						if( ema3 <= 529.836 )
							if( tema <= 530.302 )
								if( ema3 <= 527.033 )
									ret := 0.055070
								if( ema3 > 527.033 )
									ret := 0.185542
							if( tema > 530.302 )
								if( tema <= 530.672 )
									ret := -0.666667
								if( tema > 530.672 )
									ret := 0.136364
						if( ema3 > 529.836 )
							if( ema2 <= 529.879 )
								if( ema2 <= 529.798 )
									ret := 0.714286 // buy
								if( ema2 > 529.798 )
									ret := 1.000000 // buy
							if( ema2 > 529.879 )
								if( ema2 <= 530.05 )
									ret := -0.088235
								if( ema2 > 530.05 )
									ret := 0.321429
					if( ema3 > 531.144 )
						if( ema2 <= 533.318 )
							if( ema12 <= 0.224945 )
								if( ema1 <= 532.408 )
									ret := -0.257732
								if( ema1 > 532.408 )
									ret := 0.108491
							if( ema12 > 0.224945 )
								if( ema13 <= 0.344028 )
									ret := -0.833333 // sell
								if( ema13 > 0.344028 )
									ret := -0.386076
						if( ema2 > 533.318 )
							if( tema <= 535.023 )
								if( ema1 <= 533.554 )
									ret := -0.727273 // sell
								if( ema1 > 533.554 )
									ret := 0.273333
							if( tema > 535.023 )
								if( ema1 <= 535.032 )
									ret := -0.504673
								if( ema1 > 535.032 )
									ret := 0.015311
			if( ema12 > 0.596512 )
				if( ema13 <= 1.20176 )
					if( ema2 <= 459.232 )
						if( ema2 <= 449.527 )
							if( ema2 <= 437.485 )
								if( ema2 <= 432.592 )
									ret := 0.060000
								if( ema2 > 432.592 )
									ret := 0.888889 // buy
							if( ema2 > 437.485 )
								if( ema12 <= 0.613097 )
									ret := 0.600000
								if( ema12 > 0.613097 )
									ret := -0.341463
						if( ema2 > 449.527 )
							if( ema12 <= 0.717764 )
								if( ema2 <= 457.488 )
									ret := -0.062500
								if( ema2 > 457.488 )
									ret := 1.000000 // buy
							if( ema12 > 0.717764 )
								if( ema12 <= 0.750436 )
									ret := 0.750000 // buy
								if( ema12 > 0.750436 )
									ret := 1.000000 // buy
					if( ema2 > 459.232 )
						if( ema1 <= 564.36 )
							if( ema1 <= 519.274 )
								if( tema <= 519.313 )
									ret := -0.193182
								if( tema > 519.313 )
									ret := 0.571429
							if( ema1 > 519.274 )
								if( tema <= 529.192 )
									ret := -0.673684
								if( tema > 529.192 )
									ret := -0.323741
						if( ema1 > 564.36 )
							if( ema2 <= 564.696 )
								ret := 1.000000 // buy
							if( ema2 > 564.696 )
								if( ema13 <= 0.99959 )
									ret := 0.583333
								if( ema13 > 0.99959 )
									ret := 0.019608
				if( ema13 > 1.20176 )
					if( ema12 <= 5.83401 )
						if( tema <= 524.833 )
							if( ema1 <= 520.6 )
								if( ema12 <= 1.6741 )
									ret := 0.002556
								if( ema12 > 1.6741 )
									ret := 0.237342
							if( ema1 > 520.6 )
								if( ema1 <= 523.308 )
									ret := 0.635294
								if( ema1 > 523.308 )
									ret := -0.071429
						if( tema > 524.833 )
							if( ema2 <= 527.916 )
								if( ema13 <= 1.21213 )
									ret := -0.250000
								if( ema13 > 1.21213 )
									ret := -0.837500 // sell
							if( ema2 > 527.916 )
								if( tema <= 575.922 )
									ret := 0.041068
								if( tema > 575.922 )
									ret := -0.306748
					if( ema12 > 5.83401 )
						ret := -1.000000 // sell
		if( ema2 > 596.163 )
			if( tema <= 597.371 )
				if( ema2 <= 596.987 )
					if( ema1 <= 596.48 )
						if( tema <= 596.205 )
							ret := -0.750000 // sell
						if( tema > 596.205 )
							ret := -1.000000 // sell
					if( ema1 > 596.48 )
						if( ema2 <= 596.898 )
							ret := 0.000000
						if( ema2 > 596.898 )
							ret := -0.200000
				if( ema2 > 596.987 )
					if( tema <= 597.034 )
						ret := -0.750000 // sell
					if( tema > 597.034 )
						ret := -1.000000 // sell
			if( tema > 597.371 )
				if( tema <= 598.657 )
					if( ema12 <= 0.012851 )
						ret := -0.750000 // sell
					if( ema12 > 0.012851 )
						ret := -1.000000 // sell
				if( tema > 598.657 )
					if( ema1 <= 598.661 )
						ret := 0.000000
					if( ema1 > 598.661 )
						if( tema <= 599.421 )
							ret := -0.500000
						if( tema > 599.421 )
							if( tema <= 601.402 )
								ret := -1.000000 // sell
							if( tema > 601.402 )
								ret := -0.750000 // sell
	
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
float op_operation = decision_tree_0_META_1Min_090f1afd(ema12, ema3, ema13, tema, ema1, ema2)

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


