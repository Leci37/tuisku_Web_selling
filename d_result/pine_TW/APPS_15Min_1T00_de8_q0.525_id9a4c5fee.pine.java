//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: APPS_15Min_1T00_9a4c5fee Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_APPS_15Min_1T00_9a4c5fee", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_APPS_15Min_9a4c5fee(ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ema3 <= 84.8233 )
		if( ema12 <= -0.000622 )
			if( ema3 <= 1.21801 )
				if( ema1 <= 0.674215 )
					if( ema3 <= 0.612473 )
						if( ema13 <= -0.009036 )
							ret := 1.000000 // buy
						if( ema13 > -0.009036 )
							ret := 0.900000 // buy
					if( ema3 > 0.612473 )
						if( ema1 <= 0.654912 )
							if( ema13 <= -0.018527 )
								ret := 0.428571
							if( ema13 > -0.018527 )
								if( ema12 <= -0.008933 )
									ret := -0.090909
								if( ema12 > -0.008933 )
									ret := -0.794393 // sell
						if( ema1 > 0.654912 )
							if( ema2 <= 0.675215 )
								if( ema13 <= -0.003137 )
									ret := 0.391304
								if( ema13 > -0.003137 )
									ret := -0.210526
							if( ema2 > 0.675215 )
								if( ema12 <= -0.012593 )
									ret := 0.454545
								if( ema12 > -0.012593 )
									ret := -0.857143 // sell
				if( ema1 > 0.674215 )
					if( ema3 <= 0.692891 )
						if( ema13 <= -0.00436 )
							if( ema13 <= -0.008303 )
								ret := 1.000000 // buy
							if( ema13 > -0.008303 )
								if( ema12 <= -0.003391 )
									ret := 0.887097 // buy
								if( ema12 > -0.003391 )
									ret := 0.083333
						if( ema13 > -0.00436 )
							if( ema13 <= -0.003932 )
								ret := -0.733333 // sell
							if( ema13 > -0.003932 )
								if( ema3 <= 0.690788 )
									ret := 0.516129
								if( ema3 > 0.690788 )
									ret := 0.869565 // buy
					if( ema3 > 0.692891 )
						if( ema12 <= -0.007161 )
							if( ema1 <= 1.13762 )
								if( ema13 <= -0.01532 )
									ret := 0.165394
								if( ema13 > -0.01532 )
									ret := 0.627737
							if( ema1 > 1.13762 )
								if( ema13 <= -0.015813 )
									ret := 0.827586 // buy
								if( ema13 > -0.015813 )
									ret := 0.459459
						if( ema12 > -0.007161 )
							if( ema2 <= 1.20849 )
								if( ema1 <= 0.911775 )
									ret := 0.022360
								if( ema1 > 0.911775 )
									ret := 0.185647
							if( ema2 > 1.20849 )
								if( ema1 <= 1.20598 )
									ret := 0.928571 // buy
								if( ema1 > 1.20598 )
									ret := 0.642857
			if( ema3 > 1.21801 )
				if( ema12 <= -0.909591 )
					if( ema12 <= -2.41371 )
						ret := 1.000000 // buy
					if( ema12 > -2.41371 )
						if( ema2 <= 67.3596 )
							if( ema1 <= 13.1722 )
								ret := -1.000000 // sell
							if( ema1 > 13.1722 )
								if( tema <= 52.4268 )
									ret := 0.798561 // buy
								if( tema > 52.4268 )
									ret := 0.368687
						if( ema2 > 67.3596 )
							if( ema1 <= 69.0761 )
								if( ema2 <= 67.8725 )
									ret := -0.214286
								if( ema2 > 67.8725 )
									ret := -0.852941 // sell
							if( ema1 > 69.0761 )
								if( ema2 <= 71.068 )
									ret := 1.000000 // buy
								if( ema2 > 71.068 )
									ret := 0.089172
				if( ema12 > -0.909591 )
					if( ema1 <= 50.8751 )
						if( ema3 <= 1.33381 )
							if( ema12 <= -0.005648 )
								if( ema2 <= 1.25951 )
									ret := 0.443662
								if( ema2 > 1.25951 )
									ret := -0.192661
							if( ema12 > -0.005648 )
								if( ema2 <= 1.2993 )
									ret := -0.562893
								if( ema2 > 1.2993 )
									ret := 0.086207
						if( ema3 > 1.33381 )
							if( ema13 <= -0.004747 )
								if( ema13 <= -0.032129 )
									ret := 0.069503
								if( ema13 > -0.032129 )
									ret := -0.008685
							if( ema13 > -0.004747 )
								if( ema3 <= 1.52112 )
									ret := 0.355513
								if( ema3 > 1.52112 )
									ret := 0.114870
					if( ema1 > 50.8751 )
						if( ema3 <= 83.9726 )
							if( tema <= 51.6465 )
								if( ema1 <= 52.4331 )
									ret := -0.320442
								if( ema1 > 52.4331 )
									ret := -0.900000 // sell
							if( tema > 51.6465 )
								if( ema3 <= 78.3589 )
									ret := -0.035922
								if( ema3 > 78.3589 )
									ret := -0.200000
						if( ema3 > 83.9726 )
							if( ema1 <= 84.5423 )
								if( ema13 <= -0.55674 )
									ret := 0.190476
								if( ema13 > -0.55674 )
									ret := 0.709677 // buy
							if( ema1 > 84.5423 )
								ret := -0.812500 // sell
		if( ema12 > -0.000622 )
			if( ema3 <= 1.48656 )
				if( tema <= 0.653766 )
					if( tema <= 0.621891 )
						if( ema2 <= 0.606045 )
							if( ema1 <= 0.602584 )
								ret := 1.000000 // buy
							if( ema1 > 0.602584 )
								ret := 0.437500
						if( ema2 > 0.606045 )
							ret := 1.000000 // buy
					if( tema > 0.621891 )
						if( ema3 <= 0.635544 )
							if( tema <= 0.636499 )
								ret := -0.181818
							if( tema > 0.636499 )
								ret := 0.000000
						if( ema3 > 0.635544 )
							ret := 1.000000 // buy
				if( tema > 0.653766 )
					if( ema1 <= 1.49124 )
						if( ema1 <= 1.48957 )
							if( ema12 <= 0.015397 )
								if( ema13 <= 0.012178 )
									ret := -0.172001
								if( ema13 > 0.012178 )
									ret := 0.064314
							if( ema12 > 0.015397 )
								if( ema3 <= 0.707411 )
									ret := -1.000000 // sell
								if( ema3 > 0.707411 )
									ret := -0.342857
						if( ema1 > 1.48957 )
							if( ema3 <= 1.46691 )
								ret := 1.000000 // buy
							if( ema3 > 1.46691 )
								ret := 0.571429
					if( ema1 > 1.49124 )
						if( ema1 <= 1.52177 )
							if( tema <= 1.52592 )
								if( tema <= 1.51778 )
									ret := -0.810811 // sell
								if( tema > 1.51778 )
									ret := -0.526316
							if( tema > 1.52592 )
								if( tema <= 1.53763 )
									ret := -1.000000 // sell
								if( tema > 1.53763 )
									ret := -0.833333 // sell
						if( ema1 > 1.52177 )
							ret := 0.500000
			if( ema3 > 1.48656 )
				if( tema <= 1.63193 )
					if( ema2 <= 1.60987 )
						if( ema3 <= 1.59858 )
							if( ema2 <= 1.591 )
								if( ema12 <= 0.007421 )
									ret := 0.208978
								if( ema12 > 0.007421 )
									ret := -0.091716
							if( ema2 > 1.591 )
								if( ema12 <= 0.003721 )
									ret := 0.787879 // buy
								if( ema12 > 0.003721 )
									ret := 0.367347
						if( ema3 > 1.59858 )
							if( ema12 <= 0.003998 )
								if( ema13 <= 0.001091 )
									ret := -0.666667
								if( ema13 > 0.001091 )
									ret := 0.588235
							if( ema12 > 0.003998 )
								if( ema1 <= 1.60955 )
									ret := -1.000000 // sell
								if( ema1 > 1.60955 )
									ret := 0.000000
					if( ema2 > 1.60987 )
						if( ema3 <= 1.62269 )
							if( ema1 <= 1.62608 )
								ret := 1.000000 // buy
							if( ema1 > 1.62608 )
								ret := 0.777778 // buy
						if( ema3 > 1.62269 )
							if( ema2 <= 1.62873 )
								ret := -0.285714
							if( ema2 > 1.62873 )
								ret := 0.833333 // buy
				if( tema > 1.63193 )
					if( ema1 <= 84.3805 )
						if( tema <= 84.4582 )
							if( ema12 <= 0.387341 )
								if( ema3 <= 1.5944 )
									ret := -0.750000 // sell
								if( ema3 > 1.5944 )
									ret := -0.035700
							if( ema12 > 0.387341 )
								if( ema13 <= 1.67397 )
									ret := 0.125953
								if( ema13 > 1.67397 )
									ret := -0.147609
						if( tema > 84.4582 )
							if( ema2 <= 83.5651 )
								if( ema3 <= 81.9063 )
									ret := -0.562500
								if( ema3 > 81.9063 )
									ret := -0.913793 // sell
							if( ema2 > 83.5651 )
								ret := 0.000000
					if( ema1 > 84.3805 )
						if( ema12 <= 1.34585 )
							if( ema13 <= 0.099078 )
								if( ema3 <= 84.5077 )
									ret := 1.000000 // buy
								if( ema3 > 84.5077 )
									ret := 0.720000 // buy
							if( ema13 > 0.099078 )
								if( ema1 <= 85.3529 )
									ret := 0.160377
								if( ema1 > 85.3529 )
									ret := 0.700000 // buy
						if( ema12 > 1.34585 )
							if( ema12 <= 1.62051 )
								ret := -0.611111
							if( ema12 > 1.62051 )
								ret := -0.882353 // sell
	if( ema3 > 84.8233 )
		if( ema1 <= 94.9068 )
			if( ema3 <= 93.8065 )
				if( tema <= 88.7637 )
					if( ema2 <= 88.6075 )
						if( ema12 <= -0.801718 )
							if( ema2 <= 85.493 )
								if( ema12 <= -0.951007 )
									ret := -0.645833
								if( ema12 > -0.951007 )
									ret := -1.000000 // sell
							if( ema2 > 85.493 )
								if( ema3 <= 86.8955 )
									ret := 0.902439 // buy
								if( ema3 > 86.8955 )
									ret := 0.552239
						if( ema12 > -0.801718 )
							if( ema3 <= 87.8944 )
								if( ema13 <= 0.4089 )
									ret := -0.105341
								if( ema13 > 0.4089 )
									ret := -0.339080
							if( ema3 > 87.8944 )
								if( ema13 <= -0.56225 )
									ret := -0.855072 // sell
								if( ema13 > -0.56225 )
									ret := -0.360656
					if( ema2 > 88.6075 )
						if( ema3 <= 90.5225 )
							if( ema2 <= 89.3467 )
								if( ema13 <= -0.898604 )
									ret := -0.250000
								if( ema13 > -0.898604 )
									ret := 0.602941
							if( ema2 > 89.3467 )
								if( ema1 <= 88.9489 )
									ret := -0.444444
								if( ema1 > 88.9489 )
									ret := 0.272727
						if( ema3 > 90.5225 )
							ret := 1.000000 // buy
				if( tema > 88.7637 )
					if( ema12 <= 0.915567 )
						if( ema13 <= -0.059625 )
							if( tema <= 92.3399 )
								if( ema13 <= -0.920264 )
									ret := 0.300000
								if( ema13 > -0.920264 )
									ret := -0.568000
							if( tema > 92.3399 )
								ret := -1.000000 // sell
						if( ema13 > -0.059625 )
							if( ema3 <= 90.6464 )
								if( ema2 <= 90.3809 )
									ret := -0.348259
								if( ema2 > 90.3809 )
									ret := -0.857143 // sell
							if( ema3 > 90.6464 )
								if( ema1 <= 94.3486 )
									ret := 0.055556
								if( ema1 > 94.3486 )
									ret := -0.384615
					if( ema12 > 0.915567 )
						if( tema <= 89.7091 )
							if( ema1 <= 87.7036 )
								ret := -0.666667
							if( ema1 > 87.7036 )
								ret := -0.900000 // sell
						if( tema > 89.7091 )
							if( ema13 <= 2.41104 )
								if( ema1 <= 90.3405 )
									ret := 0.920000 // buy
								if( ema1 > 90.3405 )
									ret := 0.000000
							if( ema13 > 2.41104 )
								if( ema2 <= 89.8593 )
									ret := -0.250000
								if( ema2 > 89.8593 )
									ret := -0.111111
			if( ema3 > 93.8065 )
				if( ema3 <= 94.8022 )
					if( ema2 <= 94.1677 )
						if( ema12 <= -0.190437 )
							ret := 0.588235
						if( ema12 > -0.190437 )
							ret := 0.866667 // buy
					if( ema2 > 94.1677 )
						ret := 0.933333 // buy
				if( ema3 > 94.8022 )
					ret := -0.400000
		if( ema1 > 94.9068 )
			if( tema <= 94.9348 )
				ret := -0.166667
			if( tema > 94.9348 )
				if( ema2 <= 95.2667 )
					if( tema <= 95.9766 )
						ret := -1.000000 // sell
					if( tema > 95.9766 )
						ret := -0.400000
				if( ema2 > 95.2667 )
					if( ema1 <= 95.398 )
						ret := -0.500000
					if( ema1 > 95.398 )
						ret := -0.750000 // sell
	
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
float op_operation = decision_tree_0_APPS_15Min_9a4c5fee(ema3, tema, ema2, ema12, ema13, ema1)

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


