//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: BNBUSDT_15Min_1T00_bb4f8094 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BNBUSDT_15Min_1T00_bb4f8094", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BNBUSDT_15Min_bb4f8094(ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= -0.646398 )
		if( ema12 <= -4.98216 )
			if( tema <= 509.67 )
				if( ema1 <= 432.166 )
					if( tema <= 239.128 )
						if( ema12 <= -6.762 )
							if( ema12 <= -9.64977 )
								ret := 1.000000 // buy
							if( ema12 > -9.64977 )
								ret := 0.166667
						if( ema12 > -6.762 )
							ret := 1.000000 // buy
					if( tema > 239.128 )
						if( ema3 <= 279.899 )
							if( ema2 <= 257.61 )
								ret := -0.250000
							if( ema2 > 257.61 )
								ret := -1.000000 // sell
						if( ema3 > 279.899 )
							if( ema13 <= -11.042 )
								if( ema12 <= -9.21119 )
									ret := 0.882353 // buy
								if( ema12 > -9.21119 )
									ret := 1.000000 // buy
							if( ema13 > -11.042 )
								if( ema1 <= 338.206 )
									ret := 0.675676
								if( ema1 > 338.206 )
									ret := -0.125000
				if( ema1 > 432.166 )
					if( ema2 <= 466.618 )
						if( ema1 <= 450.184 )
							ret := -1.000000 // sell
						if( ema1 > 450.184 )
							ret := -0.800000 // sell
					if( ema2 > 466.618 )
						if( ema1 <= 504.01 )
							if( ema12 <= -6.61334 )
								if( ema3 <= 485.597 )
									ret := 0.400000
								if( ema3 > 485.597 )
									ret := -0.217391
							if( ema12 > -6.61334 )
								if( ema13 <= -8.8483 )
									ret := 0.933333 // buy
								if( ema13 > -8.8483 )
									ret := 0.000000
						if( ema1 > 504.01 )
							if( ema1 <= 511.589 )
								ret := -1.000000 // sell
							if( ema1 > 511.589 )
								ret := 0.000000
			if( tema > 509.67 )
				if( ema2 <= 561.773 )
					if( ema1 <= 540.792 )
						ret := 1.000000 // buy
					if( ema1 > 540.792 )
						if( ema1 <= 541.313 )
							ret := 0.000000
						if( ema1 > 541.313 )
							if( ema2 <= 555.593 )
								if( ema3 <= 551.451 )
									ret := 1.000000 // buy
								if( ema3 > 551.451 )
									ret := 0.500000
							if( ema2 > 555.593 )
								ret := 1.000000 // buy
				if( ema2 > 561.773 )
					if( ema3 <= 570.536 )
						if( tema <= 550.785 )
							ret := -0.500000
						if( tema > 550.785 )
							ret := -1.000000 // sell
					if( ema3 > 570.536 )
						if( tema <= 660.876 )
							if( tema <= 618.103 )
								if( ema13 <= -10.5396 )
									ret := 0.789474 // buy
								if( ema13 > -10.5396 )
									ret := 0.437500
							if( tema > 618.103 )
								if( ema12 <= -6.94874 )
									ret := -0.166667
								if( ema12 > -6.94874 )
									ret := -1.000000 // sell
						if( tema > 660.876 )
							ret := 1.000000 // buy
		if( ema12 > -4.98216 )
			if( ema2 <= 572.264 )
				if( ema3 <= 560.694 )
					if( ema1 <= 241.66 )
						if( tema <= 239.588 )
							if( ema12 <= -3.28212 )
								if( ema3 <= 237.667 )
									ret := 0.323529
								if( ema3 > 237.667 )
									ret := 0.900000 // buy
							if( ema12 > -3.28212 )
								if( tema <= 238.73 )
									ret := 0.194474
								if( tema > 238.73 )
									ret := -0.428571
						if( tema > 239.588 )
							if( ema2 <= 242.977 )
								if( tema <= 240.555 )
									ret := 0.851351 // buy
								if( tema > 240.555 )
									ret := 0.300000
							if( ema2 > 242.977 )
								ret := -1.000000 // sell
					if( ema1 > 241.66 )
						if( ema3 <= 255.373 )
							if( ema2 <= 253.826 )
								if( ema13 <= -1.73822 )
									ret := -0.216463
								if( ema13 > -1.73822 )
									ret := 0.102151
							if( ema2 > 253.826 )
								if( ema13 <= -0.74108 )
									ret := -0.857143 // sell
								if( ema13 > -0.74108 )
									ret := -0.250000
						if( ema3 > 255.373 )
							if( tema <= 554.094 )
								if( ema1 <= 554.365 )
									ret := 0.143076
								if( ema1 > 554.365 )
									ret := 0.611765
							if( tema > 554.094 )
								if( tema <= 556.935 )
									ret := -0.475000
								if( tema > 556.935 )
									ret := 0.038462
				if( ema3 > 560.694 )
					if( ema2 <= 557.568 )
						ret := -1.000000 // sell
					if( ema2 > 557.568 )
						if( ema1 <= 560.46 )
							if( ema2 <= 563.935 )
								if( ema13 <= -6.05648 )
									ret := 0.872340 // buy
								if( ema13 > -6.05648 )
									ret := 0.524194
							if( ema2 > 563.935 )
								ret := -0.142857
						if( ema1 > 560.46 )
							if( ema1 <= 562.346 )
								if( tema <= 559.787 )
									ret := -0.542857
								if( tema > 559.787 )
									ret := 0.166667
							if( ema1 > 562.346 )
								if( ema1 <= 563.703 )
									ret := 0.819277 // buy
								if( ema1 > 563.703 )
									ret := 0.228235
			if( ema2 > 572.264 )
				if( tema <= 574.192 )
					if( ema1 <= 573.674 )
						if( ema13 <= -6.0987 )
							if( ema13 <= -7.88157 )
								ret := 0.400000
							if( ema13 > -7.88157 )
								if( tema <= 566.445 )
									ret := -1.000000 // sell
								if( tema > 566.445 )
									ret := -0.625000
						if( ema13 > -6.0987 )
							if( ema3 <= 573.577 )
								if( ema13 <= -1.59689 )
									ret := 0.545455
								if( ema13 > -1.59689 )
									ret := -0.718750 // sell
							if( ema3 > 573.577 )
								if( ema3 <= 577.256 )
									ret := 0.329341
								if( ema3 > 577.256 )
									ret := -0.333333
					if( ema1 > 573.674 )
						if( ema2 <= 577.064 )
							if( ema1 <= 574.052 )
								if( ema1 <= 573.731 )
									ret := -0.500000
								if( ema1 > 573.731 )
									ret := -0.969697 // sell
							if( ema1 > 574.052 )
								if( tema <= 571.08 )
									ret := 0.428571
								if( tema > 571.08 )
									ret := -0.600000
						if( ema2 > 577.064 )
							if( ema3 <= 578.47 )
								if( ema13 <= -2.22051 )
									ret := 0.250000
								if( ema13 > -2.22051 )
									ret := 1.000000 // buy
							if( ema3 > 578.47 )
								if( ema3 <= 579.942 )
									ret := -0.675000
								if( ema3 > 579.942 )
									ret := -0.108108
				if( tema > 574.192 )
					if( ema3 <= 586.461 )
						if( ema3 <= 583.733 )
							if( ema12 <= -0.99128 )
								if( tema <= 574.58 )
									ret := -0.269231
								if( tema > 574.58 )
									ret := 0.347368
							if( ema12 > -0.99128 )
								if( ema2 <= 579.478 )
									ret := 0.112360
								if( ema2 > 579.478 )
									ret := -0.253012
						if( ema3 > 583.733 )
							if( ema2 <= 582.184 )
								if( ema13 <= -6.83668 )
									ret := 1.000000 // buy
								if( ema13 > -6.83668 )
									ret := 0.785714 // buy
							if( ema2 > 582.184 )
								if( ema1 <= 580.7 )
									ret := -0.178571
								if( ema1 > 580.7 )
									ret := 0.462766
					if( ema3 > 586.461 )
						if( ema2 <= 702.764 )
							if( tema <= 586.504 )
								if( ema12 <= -4.06198 )
									ret := 0.313725
								if( ema12 > -4.06198 )
									ret := -0.294461
							if( tema > 586.504 )
								if( ema1 <= 602.305 )
									ret := 0.153992
								if( ema1 > 602.305 )
									ret := -0.115429
						if( ema2 > 702.764 )
							if( ema1 <= 704.85 )
								if( ema1 <= 702.145 )
									ret := 0.428571
								if( ema1 > 702.145 )
									ret := 0.925926 // buy
							if( ema1 > 704.85 )
								if( ema12 <= -2.61514 )
									ret := 1.000000 // buy
								if( ema12 > -2.61514 )
									ret := 0.166667
	if( ema12 > -0.646398 )
		if( ema1 <= 706.964 )
			if( ema3 <= 628.484 )
				if( ema3 <= 607.986 )
					if( ema3 <= 425.185 )
						if( tema <= 306.375 )
							if( ema13 <= -1.29626 )
								if( tema <= 299.452 )
									ret := -0.123506
								if( tema > 299.452 )
									ret := -0.704918 // sell
							if( ema13 > -1.29626 )
								if( tema <= 195.85 )
									ret := 0.880000 // buy
								if( tema > 195.85 )
									ret := 0.039751
						if( tema > 306.375 )
							if( tema <= 420.409 )
								if( ema2 <= 304.66 )
									ret := -0.390152
								if( ema2 > 304.66 )
									ret := -0.018968
							if( tema > 420.409 )
								if( ema3 <= 420.525 )
									ret := -0.851351 // sell
								if( ema3 > 420.525 )
									ret := -0.038462
					if( ema3 > 425.185 )
						if( tema <= 485.404 )
							if( ema13 <= 9.52716 )
								if( ema12 <= 0.693131 )
									ret := 0.404000
								if( ema12 > 0.693131 )
									ret := 0.676580
							if( ema13 > 9.52716 )
								if( tema <= 467.299 )
									ret := 0.923077 // buy
								if( tema > 467.299 )
									ret := -0.833333 // sell
						if( tema > 485.404 )
							if( ema1 <= 578.025 )
								if( ema2 <= 483.738 )
									ret := -0.386139
								if( ema2 > 483.738 )
									ret := 0.092825
							if( ema1 > 578.025 )
								if( ema13 <= -1.02519 )
									ret := -0.255814
								if( ema13 > -1.02519 )
									ret := 0.018046
				if( ema3 > 607.986 )
					if( ema2 <= 611.402 )
						if( ema12 <= 1.34507 )
							if( tema <= 608.415 )
								if( ema3 <= 608.999 )
									ret := 0.060606
								if( ema3 > 608.999 )
									ret := -0.777778 // sell
							if( tema > 608.415 )
								if( ema1 <= 610.299 )
									ret := -0.586207
								if( ema1 > 610.299 )
									ret := -0.929825 // sell
						if( ema12 > 1.34507 )
							if( tema <= 615.236 )
								if( ema2 <= 609.893 )
									ret := 0.000000
								if( ema2 > 609.893 )
									ret := 0.769231 // buy
							if( tema > 615.236 )
								if( tema <= 616.378 )
									ret := -0.600000
								if( tema > 616.378 )
									ret := -1.000000 // sell
					if( ema2 > 611.402 )
						if( ema1 <= 616.225 )
							if( ema12 <= 0.020547 )
								if( ema1 <= 611.265 )
									ret := 0.750000 // buy
								if( ema1 > 611.265 )
									ret := -0.291139
							if( ema12 > 0.020547 )
								if( tema <= 615.266 )
									ret := 0.552239
								if( tema > 615.266 )
									ret := 0.041096
						if( ema1 > 616.225 )
							if( ema2 <= 616.649 )
								if( tema <= 619.527 )
									ret := -0.923077 // sell
								if( tema > 619.527 )
									ret := -0.347826
							if( ema2 > 616.649 )
								if( ema13 <= 1.7006 )
									ret := -0.043478
								if( ema13 > 1.7006 )
									ret := -0.524194
			if( ema3 > 628.484 )
				if( ema13 <= 2.73554 )
					if( tema <= 648.343 )
						if( ema2 <= 643.712 )
							if( ema1 <= 631.144 )
								if( ema2 <= 630.268 )
									ret := 0.809524 // buy
								if( ema2 > 630.268 )
									ret := -0.285714
							if( ema1 > 631.144 )
								if( ema12 <= 0.567166 )
									ret := -0.250000
								if( ema12 > 0.567166 )
									ret := -0.636364
						if( ema2 > 643.712 )
							ret := 1.000000 // buy
					if( tema > 648.343 )
						if( ema1 <= 682.404 )
							if( ema3 <= 683.036 )
								if( ema2 <= 678.084 )
									ret := -0.471698
								if( ema2 > 678.084 )
									ret := 0.000000
							if( ema3 > 683.036 )
								ret := -1.000000 // sell
						if( ema1 > 682.404 )
							if( ema3 <= 700.253 )
								if( ema1 <= 693.524 )
									ret := 0.136364
								if( ema1 > 693.524 )
									ret := 0.622951
							if( ema3 > 700.253 )
								if( ema3 <= 704.155 )
									ret := -0.551724
								if( ema3 > 704.155 )
									ret := 0.425532
				if( ema13 > 2.73554 )
					if( tema <= 706.114 )
						if( ema12 <= 6.72501 )
							if( ema12 <= 4.65198 )
								if( ema13 <= 6.63446 )
									ret := 0.613333
								if( ema13 > 6.63446 )
									ret := 0.844156 // buy
							if( ema12 > 4.65198 )
								if( ema3 <= 680.884 )
									ret := 0.437500
								if( ema3 > 680.884 )
									ret := -0.200000
						if( ema12 > 6.72501 )
							ret := -1.000000 // sell
					if( tema > 706.114 )
						if( ema12 <= 1.60274 )
							ret := -0.857143 // sell
						if( ema12 > 1.60274 )
							if( ema12 <= 1.96219 )
								ret := -0.500000
							if( ema12 > 1.96219 )
								if( ema12 <= 2.41489 )
									ret := 0.000000
								if( ema12 > 2.41489 )
									ret := -0.500000
		if( ema1 > 706.964 )
			if( tema <= 710.815 )
				if( tema <= 709.881 )
					if( ema13 <= 1.36494 )
						ret := -0.500000
					if( ema13 > 1.36494 )
						ret := -1.000000 // sell
				if( tema > 709.881 )
					ret := -0.166667
			if( tema > 710.815 )
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
float op_operation = decision_tree_0_BNBUSDT_15Min_bb4f8094(ema3, tema, ema2, ema12, ema13, ema1)

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


