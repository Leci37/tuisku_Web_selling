//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: AAVEUSDT_30Min_2BT0_8a0fff9e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAVEUSDT_30Min_2BT0_8a0fff9e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAVEUSDT_30Min_8a0fff9e(bullPower, bbp, bearPower, bbm, BBPower_Color, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( tema <= 406.989 )
		if( ema1 <= 84.2475 )
			if( ema13 <= -1.80605 )
				if( ema1 <= 81.8544 )
					if( ema1 <= 77.6511 )
						if( tema <= 57.8635 )
							if( bearPower <= -1.43763 )
								ret := 0.614634
							if( bearPower > -1.43763 )
								ret := -0.047619
						if( tema > 57.8635 )
							if( ema2 <= 69.7381 )
								ret := -0.098940
							if( ema2 > 69.7381 )
								ret := 0.346626
					if( ema1 > 77.6511 )
						if( bearPower <= -1.67019 )
							if( ema3 <= 83.4171 )
								ret := 0.750000 // buy
							if( ema3 > 83.4171 )
								ret := 0.915254 // buy
						if( bearPower > -1.67019 )
							if( ema1 <= 81.2957 )
								ret := 0.322581
							if( ema1 > 81.2957 )
								ret := 1.000000 // buy
				if( ema1 > 81.8544 )
					if( bearPower <= -4.50003 )
						if( bullPower <= -1.83652 )
							if( ema1 <= 84.0302 )
								ret := 0.888889 // buy
							if( ema1 > 84.0302 )
								ret := 0.500000
						if( bullPower > -1.83652 )
							ret := -0.250000
					if( bearPower > -4.50003 )
						if( bbm <= 1.19637 )
							if( tema <= 81.708 )
								ret := -0.142857
							if( tema > 81.708 )
								ret := 0.575000
						if( bbm > 1.19637 )
							if( bullPower <= -2.34503 )
								ret := 1.000000 // buy
							if( bullPower > -2.34503 )
								ret := -0.414141
			if( ema13 > -1.80605 )
				if( ema13 <= 1.94849 )
					if( ema3 <= 83.4387 )
						if( ema13 <= 0.3872 )
							if( ema2 <= 35.7652 )
								ret := -0.230971
							if( ema2 > 35.7652 )
								ret := 0.029011
						if( ema13 > 0.3872 )
							if( ema13 <= 0.948536 )
								ret := 0.173164
							if( ema13 > 0.948536 )
								ret := 0.011334
					if( ema3 > 83.4387 )
						if( ema2 <= 84.2564 )
							if( bbp <= 2.5684 )
								ret := 0.413948
							if( bbp > 2.5684 )
								ret := -0.863636 // sell
						if( ema2 > 84.2564 )
							if( ema12 <= -0.749892 )
								ret := 0.593220
							if( ema12 > -0.749892 )
								ret := -0.393333
				if( ema13 > 1.94849 )
					if( bbp <= 1.63635 )
						if( ema2 <= 76.4818 )
							if( bbm <= 0.765977 )
								ret := -0.750000 // sell
							if( bbm > 0.765977 )
								ret := 0.765625 // buy
						if( ema2 > 76.4818 )
							if( ema2 <= 79.5898 )
								ret := -0.578947
							if( ema2 > 79.5898 )
								ret := 0.833333 // buy
					if( bbp > 1.63635 )
						if( ema2 <= 62.9517 )
							if( ema1 <= 55.3452 )
								ret := -0.794521 // sell
							if( ema1 > 55.3452 )
								ret := 0.156627
						if( ema2 > 62.9517 )
							if( ema1 <= 77.9225 )
								ret := -0.637640
							if( ema1 > 77.9225 )
								ret := -0.217054
		if( ema1 > 84.2475 )
			if( bbp <= 17.1084 )
				if( bearPower <= -4.29295 )
					if( ema13 <= 2.20167 )
						if( tema <= 321.185 )
							if( ema2 <= 326.789 )
								ret := 0.060821
							if( ema2 > 326.789 )
								ret := 0.574194
						if( tema > 321.185 )
							if( ema3 <= 353.463 )
								ret := -0.224964
							if( ema3 > 353.463 )
								ret := 0.035480
					if( ema13 > 2.20167 )
						if( bbp <= -11.3495 )
							if( tema <= 386.362 )
								ret := -1.000000 // sell
							if( tema > 386.362 )
								ret := -0.250000
						if( bbp > -11.3495 )
							if( ema1 <= 377.419 )
								ret := 0.536232
							if( ema1 > 377.419 )
								ret := 0.047619
				if( bearPower > -4.29295 )
					if( ema3 <= 399.944 )
						if( tema <= 390.961 )
							if( ema12 <= 2.71323 )
								ret := -0.023434
							if( ema12 > 2.71323 )
								ret := -0.138379
						if( tema > 390.961 )
							if( ema12 <= 0.530836 )
								ret := 0.606061
							if( ema12 > 0.530836 )
								ret := 0.145051
					if( ema3 > 399.944 )
						if( ema3 <= 401.99 )
							if( ema1 <= 404.318 )
								ret := -0.819444 // sell
							if( ema1 > 404.318 )
								ret := 0.125000
						if( ema3 > 401.99 )
							if( ema2 <= 402.673 )
								ret := 0.307692
							if( ema2 > 402.673 )
								ret := -0.464789
			if( bbp > 17.1084 )
				if( ema1 <= 364.127 )
					if( bullPower <= 14.2091 )
						if( ema2 <= 235.516 )
							if( ema3 <= 220.887 )
								ret := 0.152542
							if( ema3 > 220.887 )
								ret := 0.969697 // buy
						if( ema2 > 235.516 )
							if( ema2 <= 264.175 )
								ret := -0.515152
							if( ema2 > 264.175 )
								ret := 0.220994
					if( bullPower > 14.2091 )
						if( ema3 <= 176.76 )
							if( bbp <= 24.3091 )
								ret := 0.666667
							if( bbp > 24.3091 )
								ret := -1.000000 // sell
						if( ema3 > 176.76 )
							if( bbm <= 11.0117 )
								ret := 0.479730
							if( bbm > 11.0117 )
								ret := 0.816993 // buy
				if( ema1 > 364.127 )
					if( bullPower <= 18.185 )
						if( tema <= 376.02 )
							if( ema2 <= 360.786 )
								ret := 0.600000
							if( ema2 > 360.786 )
								ret := 1.000000 // buy
						if( tema > 376.02 )
							if( tema <= 380.013 )
								ret := -0.782609 // sell
							if( tema > 380.013 )
								ret := 0.047244
					if( bullPower > 18.185 )
						if( bearPower <= 9.41593 )
							if( bearPower <= 3.129 )
								ret := -1.000000 // sell
							if( bearPower > 3.129 )
								ret := -0.032258
						if( bearPower > 9.41593 )
							if( bbp <= 34.5246 )
								ret := -1.000000 // sell
							if( bbp > 34.5246 )
								ret := -0.733333 // sell
	if( tema > 406.989 )
		if( bbp <= -24.4563 )
			if( tema <= 530.74 )
				if( ema13 <= -25.9423 )
					if( ema2 <= 507.727 )
						if( bearPower <= -44.6107 )
							ret := 0.500000
						if( bearPower > -44.6107 )
							ret := -1.000000 // sell
					if( ema2 > 507.727 )
						if( bearPower <= -36.4414 )
							if( tema <= 495.822 )
								ret := 1.000000 // buy
							if( tema > 495.822 )
								ret := 0.750000 // buy
						if( bearPower > -36.4414 )
							ret := 0.571429
				if( ema13 > -25.9423 )
					if( tema <= 473.637 )
						if( bbm <= 8.6667 )
							if( bearPower <= -16.7453 )
								ret := -1.000000 // sell
							if( bearPower > -16.7453 )
								ret := -0.500000
						if( bbm > 8.6667 )
							if( ema12 <= -7.28675 )
								ret := 0.831933 // buy
							if( ema12 > -7.28675 )
								ret := 0.250000
					if( tema > 473.637 )
						if( ema3 <= 545.713 )
							if( bullPower <= -8.01569 )
								ret := -0.710526 // sell
							if( bullPower > -8.01569 )
								ret := 0.200000
						if( ema3 > 545.713 )
							if( bbp <= -40.3789 )
								ret := 1.000000 // buy
							if( bbp > -40.3789 )
								ret := 0.400000
			if( tema > 530.74 )
				if( ema1 <= 553.735 )
					ret := -1.000000 // sell
				if( ema1 > 553.735 )
					if( bbm <= 23.7582 )
						if( bearPower <= -22.9841 )
							if( bearPower <= -33.1032 )
								ret := -0.250000
							if( bearPower > -33.1032 )
								ret := -0.896552 // sell
						if( bearPower > -22.9841 )
							ret := 0.428571
					if( bbm > 23.7582 )
						if( ema2 <= 604.714 )
							if( tema <= 559.221 )
								ret := 0.857143 // buy
							if( tema > 559.221 )
								ret := -1.000000 // sell
						if( ema2 > 604.714 )
							if( bbm <= 28.5763 )
								ret := 0.750000 // buy
							if( bbm > 28.5763 )
								ret := 1.000000 // buy
		if( bbp > -24.4563 )
			if( ema2 <= 404.173 )
				if( bbp <= 17.0005 )
					if( bbp <= 7.6416 )
						if( bbm <= 7.16274 )
							ret := 0.000000
						if( bbm > 7.16274 )
							ret := -1.000000 // sell
					if( bbp > 7.6416 )
						if( bbm <= 3.71114 )
							if( ema3 <= 397.459 )
								ret := -0.666667
							if( ema3 > 397.459 )
								ret := 0.000000
						if( bbm > 3.71114 )
							if( ema3 <= 394.622 )
								ret := -0.978723 // sell
							if( ema3 > 394.622 )
								ret := -0.761905 // sell
				if( bbp > 17.0005 )
					if( bearPower <= 6.24003 )
						if( ema2 <= 402.426 )
							if( bearPower <= 4.41173 )
								ret := -0.071429
							if( bearPower > 4.41173 )
								ret := 0.947368 // buy
						if( ema2 > 402.426 )
							ret := -1.000000 // sell
					if( bearPower > 6.24003 )
						if( bbm <= 9.06079 )
							if( bullPower <= 15.1988 )
								ret := -0.571429
							if( bullPower > 15.1988 )
								ret := 0.333333
						if( bbm > 9.06079 )
							if( ema2 <= 396.868 )
								ret := -1.000000 // sell
							if( ema2 > 396.868 )
								ret := -0.857143 // sell
			if( ema2 > 404.173 )
				if( ema13 <= 3.44592 )
					if( ema3 <= 413.879 )
						if( ema3 <= 403.848 )
							if( bullPower <= 4.33266 )
								ret := 1.000000 // buy
							if( bullPower > 4.33266 )
								ret := -0.250000
						if( ema3 > 403.848 )
							if( bullPower <= 1.87792 )
								ret := -0.283333
							if( bullPower > 1.87792 )
								ret := -0.739583 // sell
					if( ema3 > 413.879 )
						if( ema1 <= 437.408 )
							if( ema3 <= 435.32 )
								ret := -0.227017
							if( ema3 > 435.32 )
								ret := 0.516129
						if( ema1 > 437.408 )
							if( bbm <= 4.2809 )
								ret := 0.043478
							if( bbm > 4.2809 )
								ret := -0.312190
				if( ema13 > 3.44592 )
					if( bearPower <= 5.18808 )
						if( ema1 <= 474.295 )
							if( bullPower <= 3.81046 )
								ret := -0.233766
							if( bullPower > 3.81046 )
								ret := 0.309900
						if( ema1 > 474.295 )
							if( ema1 <= 486.882 )
								ret := -0.580110
							if( ema1 > 486.882 )
								ret := -0.019499
					if( bearPower > 5.18808 )
						if( ema1 <= 485.29 )
							if( ema2 <= 426.523 )
								ret := 0.017544
							if( ema2 > 426.523 )
								ret := -0.719008 // sell
						if( ema1 > 485.29 )
							if( ema1 <= 508.501 )
								ret := 0.575342
							if( ema1 > 508.501 )
								ret := -0.275000
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


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
float op_operation = decision_tree_0_AAVEUSDT_30Min_8a0fff9e(bullPower, bbp, bearPower, bbm, BBPower_Color, ema3, tema, ema2, ema12, ema13, ema1)

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


