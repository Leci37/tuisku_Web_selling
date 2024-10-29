//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: MATICUSDT_15Min_1T00_d5e8e30f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MATICUSDT_15Min_1T00_d5e8e30f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MATICUSDT_15Min_d5e8e30f(ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ema12 <= -0.009146 )
		if( tema <= 0.861295 )
			if( ema12 <= -0.01535 )
				if( ema2 <= 0.798279 )
					if( tema <= 0.59041 )
						if( ema1 <= 0.584893 )
							ret := 0.454545
						if( ema1 > 0.584893 )
							ret := 0.800000 // buy
					if( tema > 0.59041 )
						if( tema <= 0.652497 )
							if( ema1 <= 0.630076 )
								ret := -1.000000 // sell
							if( ema1 > 0.630076 )
								if( tema <= 0.608381 )
									ret := 0.375000
								if( tema > 0.608381 )
									ret := -0.269231
						if( tema > 0.652497 )
							if( ema1 <= 0.754818 )
								ret := -1.000000 // sell
							if( ema1 > 0.754818 )
								ret := -0.818182 // sell
				if( ema2 > 0.798279 )
					if( ema2 <= 0.8919 )
						if( ema3 <= 0.886601 )
							if( ema2 <= 0.840377 )
								if( ema1 <= 0.780049 )
									ret := 1.000000 // buy
								if( ema1 > 0.780049 )
									ret := 0.409091
							if( ema2 > 0.840377 )
								if( ema1 <= 0.840262 )
									ret := -0.304348
								if( ema1 > 0.840262 )
									ret := -0.777778 // sell
						if( ema3 > 0.886601 )
							if( tema <= 0.841287 )
								ret := 1.000000 // buy
							if( tema > 0.841287 )
								ret := 0.500000
					if( ema2 > 0.8919 )
						if( ema12 <= -0.020759 )
							if( ema1 <= 0.895914 )
								ret := -1.000000 // sell
							if( ema1 > 0.895914 )
								ret := -0.900000 // sell
						if( ema12 > -0.020759 )
							ret := -0.142857
			if( ema12 > -0.01535 )
				if( ema1 <= 0.77509 )
					if( ema2 <= 0.750173 )
						if( tema <= 0.710517 )
							if( ema13 <= -0.025917 )
								if( ema3 <= 0.611337 )
									ret := -0.909091 // sell
								if( ema3 > 0.611337 )
									ret := -0.090909
							if( ema13 > -0.025917 )
								if( tema <= 0.535383 )
									ret := -0.018519
								if( tema > 0.535383 )
									ret := 0.421875
						if( tema > 0.710517 )
							ret := -0.750000 // sell
					if( ema2 > 0.750173 )
						if( ema12 <= -0.010982 )
							if( tema <= 0.744618 )
								ret := 0.000000
							if( tema > 0.744618 )
								if( tema <= 0.750412 )
									ret := 1.000000 // buy
								if( tema > 0.750412 )
									ret := 0.181818
						if( ema12 > -0.010982 )
							if( ema12 <= -0.009756 )
								ret := 1.000000 // buy
							if( ema12 > -0.009756 )
								ret := 0.823529 // buy
				if( ema1 > 0.77509 )
					if( ema2 <= 0.821579 )
						if( ema13 <= -0.021815 )
							if( ema13 <= -0.023781 )
								ret := -0.307692
							if( ema13 > -0.023781 )
								ret := 0.200000
						if( ema13 > -0.021815 )
							if( ema1 <= 0.801507 )
								if( ema2 <= 0.788173 )
									ret := -0.400000
								if( ema2 > 0.788173 )
									ret := -0.818182 // sell
							if( ema1 > 0.801507 )
								ret := -0.312500
					if( ema2 > 0.821579 )
						if( ema2 <= 0.838853 )
							if( ema1 <= 0.812943 )
								ret := 0.500000
							if( ema1 > 0.812943 )
								if( ema2 <= 0.831129 )
									ret := 0.928571 // buy
								if( ema2 > 0.831129 )
									ret := 1.000000 // buy
						if( ema2 > 0.838853 )
							if( tema <= 0.852831 )
								if( ema12 <= -0.012511 )
									ret := -0.238095
								if( ema12 > -0.012511 )
									ret := 0.389474
							if( tema > 0.852831 )
								ret := -0.615385
		if( tema > 0.861295 )
			if( ema1 <= 0.878209 )
				ret := -0.733333 // sell
			if( ema1 > 0.878209 )
				if( ema1 <= 1.39772 )
					if( ema3 <= 1.28905 )
						if( ema3 <= 1.2085 )
							if( ema3 <= 1.1806 )
								if( ema2 <= 1.09795 )
									ret := 0.464440
								if( ema2 > 1.09795 )
									ret := 0.094488
							if( ema3 > 1.1806 )
								if( ema13 <= -0.03442 )
									ret := -0.120000
								if( ema13 > -0.03442 )
									ret := 0.930233 // buy
						if( ema3 > 1.2085 )
							if( ema2 <= 1.21285 )
								if( ema1 <= 1.18478 )
									ret := -0.076923
								if( ema1 > 1.18478 )
									ret := -0.812500 // sell
							if( ema2 > 1.21285 )
								if( ema2 <= 1.23271 )
									ret := 0.662338
								if( ema2 > 1.23271 )
									ret := 0.202532
					if( ema3 > 1.28905 )
						if( ema1 <= 1.30826 )
							if( ema3 <= 1.30962 )
								if( ema1 <= 1.27315 )
									ret := 1.000000 // buy
								if( ema1 > 1.27315 )
									ret := 0.900000 // buy
							if( ema3 > 1.30962 )
								ret := 0.300000
						if( ema1 > 1.30826 )
							if( ema2 <= 1.40307 )
								ret := 1.000000 // buy
							if( ema2 > 1.40307 )
								ret := 0.857143 // buy
				if( ema1 > 1.39772 )
					if( ema2 <= 1.47955 )
						if( ema2 <= 1.44521 )
							ret := -0.166667
						if( ema2 > 1.44521 )
							if( ema2 <= 1.4576 )
								ret := -0.785714 // sell
							if( ema2 > 1.4576 )
								ret := -0.625000
					if( ema2 > 1.47955 )
						ret := 0.857143 // buy
	if( ema12 > -0.009146 )
		if( ema3 <= 1.1698 )
			if( ema12 <= -0.003906 )
				if( tema <= 0.477851 )
					if( tema <= 0.382898 )
						if( ema1 <= 0.340815 )
							ret := 1.000000 // buy
						if( ema1 > 0.340815 )
							if( tema <= 0.3644 )
								if( ema3 <= 0.372109 )
									ret := -0.250000
								if( ema3 > 0.372109 )
									ret := 0.828571 // buy
							if( tema > 0.3644 )
								if( ema1 <= 0.371152 )
									ret := -1.000000 // sell
								if( ema1 > 0.371152 )
									ret := 0.389474
					if( tema > 0.382898 )
						if( ema13 <= -0.008378 )
							if( ema2 <= 0.442059 )
								if( ema13 <= -0.013084 )
									ret := 0.945946 // buy
								if( ema13 > -0.013084 )
									ret := -0.113772
							if( ema2 > 0.442059 )
								if( ema3 <= 0.473342 )
									ret := -0.848837 // sell
								if( ema3 > 0.473342 )
									ret := -0.291339
						if( ema13 > -0.008378 )
							if( ema3 <= 0.442772 )
								if( tema <= 0.397495 )
									ret := -0.300000
								if( tema > 0.397495 )
									ret := -0.913978 // sell
							if( ema3 > 0.442772 )
								if( ema3 <= 0.468921 )
									ret := -0.142857
								if( ema3 > 0.468921 )
									ret := 0.500000
				if( tema > 0.477851 )
					if( ema2 <= 0.510697 )
						if( ema13 <= -0.008494 )
							if( ema2 <= 0.505393 )
								if( ema12 <= -0.005384 )
									ret := 1.000000 // buy
								if( ema12 > -0.005384 )
									ret := 0.782609 // buy
							if( ema2 > 0.505393 )
								ret := 0.611111
						if( ema13 > -0.008494 )
							if( tema <= 0.489485 )
								ret := -0.363636
							if( tema > 0.489485 )
								ret := 0.333333
					if( ema2 > 0.510697 )
						if( ema13 <= -0.011356 )
							if( ema2 <= 1.14868 )
								if( ema2 <= 1.1201 )
									ret := 0.029008
								if( ema2 > 1.1201 )
									ret := -0.677419
							if( ema2 > 1.14868 )
								if( ema3 <= 1.16469 )
									ret := 0.968750 // buy
								if( ema3 > 1.16469 )
									ret := 0.312500
						if( ema13 > -0.011356 )
							if( ema1 <= 1.15651 )
								if( ema2 <= 0.571394 )
									ret := 0.332288
								if( ema2 > 0.571394 )
									ret := 0.132845
							if( ema1 > 1.15651 )
								if( ema3 <= 1.16853 )
									ret := -0.181818
								if( ema3 > 1.16853 )
									ret := -0.928571 // sell
			if( ema12 > -0.003906 )
				if( ema1 <= 0.37617 )
					if( ema2 <= 0.374093 )
						if( ema1 <= 0.337611 )
							if( ema12 <= 1e-06 )
								if( ema3 <= 0.340282 )
									ret := 0.200000
								if( ema3 > 0.340282 )
									ret := 1.000000 // buy
							if( ema12 > 1e-06 )
								if( ema3 <= 0.333993 )
									ret := 0.818182 // buy
								if( ema3 > 0.333993 )
									ret := 1.000000 // buy
						if( ema1 > 0.337611 )
							if( ema12 <= 0.002936 )
								if( ema12 <= 0.000882 )
									ret := 0.015184
								if( ema12 > 0.000882 )
									ret := -0.326923
							if( ema12 > 0.002936 )
								if( ema3 <= 0.352816 )
									ret := 0.187500
								if( ema3 > 0.352816 )
									ret := 0.983871 // buy
					if( ema2 > 0.374093 )
						if( ema13 <= 0.000377 )
							if( tema <= 0.372542 )
								ret := 0.090909
							if( tema > 0.372542 )
								if( ema13 <= -0.001101 )
									ret := 0.890411 // buy
								if( ema13 > -0.001101 )
									ret := 0.563636
						if( ema13 > 0.000377 )
							ret := 0.000000
				if( ema1 > 0.37617 )
					if( ema2 <= 0.856142 )
						if( ema3 <= 0.441827 )
							if( ema1 <= 0.42333 )
								if( ema2 <= 0.392547 )
									ret := -0.212766
								if( ema2 > 0.392547 )
									ret := 0.015118
							if( ema1 > 0.42333 )
								if( ema1 <= 0.428499 )
									ret := -0.491429
								if( ema1 > 0.428499 )
									ret := -0.114467
						if( ema3 > 0.441827 )
							if( ema2 <= 0.460606 )
								if( ema2 <= 0.456359 )
									ret := 0.116705
								if( ema2 > 0.456359 )
									ret := 0.649425
							if( ema2 > 0.460606 )
								if( ema1 <= 0.85243 )
									ret := 0.002175
								if( ema1 > 0.85243 )
									ret := 0.251670
					if( ema2 > 0.856142 )
						if( ema2 <= 1.07977 )
							if( ema1 <= 1.06399 )
								if( ema1 <= 0.863692 )
									ret := -0.200401
								if( ema1 > 0.863692 )
									ret := -0.040779
							if( ema1 > 1.06399 )
								if( ema3 <= 1.07096 )
									ret := -0.486200
								if( ema3 > 1.07096 )
									ret := -0.083544
						if( ema2 > 1.07977 )
							if( ema1 <= 1.0902 )
								if( ema3 <= 1.08242 )
									ret := -0.036810
								if( ema3 > 1.08242 )
									ret := 0.616162
							if( ema1 > 1.0902 )
								if( ema13 <= 0.029695 )
									ret := -0.021917
								if( ema13 > 0.029695 )
									ret := 0.701299 // buy
		if( ema3 > 1.1698 )
			if( ema12 <= 0.013995 )
				if( tema <= 1.16563 )
					if( tema <= 1.15516 )
						if( ema1 <= 1.16136 )
							ret := 0.615385
						if( ema1 > 1.16136 )
							ret := 0.444444
					if( tema > 1.15516 )
						if( ema2 <= 1.1747 )
							if( ema13 <= -0.012296 )
								ret := -0.272727
							if( ema13 > -0.012296 )
								if( ema12 <= -0.005142 )
									ret := -0.666667
								if( ema12 > -0.005142 )
									ret := -0.921053 // sell
						if( ema2 > 1.1747 )
							ret := -0.400000
				if( tema > 1.16563 )
					if( ema13 <= 0.017847 )
						if( tema <= 1.52816 )
							if( ema2 <= 1.42864 )
								if( ema12 <= 0.003006 )
									ret := -0.133947
								if( ema12 > 0.003006 )
									ret := 0.004338
							if( ema2 > 1.42864 )
								if( ema3 <= 1.5102 )
									ret := 0.261364
								if( ema3 > 1.5102 )
									ret := -0.456522
						if( tema > 1.52816 )
							if( ema2 <= 1.52552 )
								if( ema1 <= 1.52416 )
									ret := -1.000000 // sell
								if( ema1 > 1.52416 )
									ret := -0.777778 // sell
							if( ema2 > 1.52552 )
								if( ema1 <= 1.54182 )
									ret := -0.312500
								if( ema1 > 1.54182 )
									ret := -0.562500
					if( ema13 > 0.017847 )
						if( ema2 <= 1.41561 )
							if( ema1 <= 1.25514 )
								if( ema1 <= 1.2181 )
									ret := 0.478261
								if( ema1 > 1.2181 )
									ret := 0.830189 // buy
							if( ema1 > 1.25514 )
								if( ema2 <= 1.38049 )
									ret := -0.192308
								if( ema2 > 1.38049 )
									ret := 1.000000 // buy
						if( ema2 > 1.41561 )
							ret := -0.684211
			if( ema12 > 0.013995 )
				if( ema12 <= 0.018027 )
					if( tema <= 1.41521 )
						if( ema1 <= 1.21367 )
							ret := -1.000000 // sell
						if( ema1 > 1.21367 )
							if( tema <= 1.27988 )
								ret := -0.272727
							if( tema > 1.27988 )
								ret := -0.461538
					if( tema > 1.41521 )
						ret := -1.000000 // sell
				if( ema12 > 0.018027 )
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
float op_operation = decision_tree_0_MATICUSDT_15Min_d5e8e30f(ema12, ema3, ema13, tema, ema1, ema2)

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


