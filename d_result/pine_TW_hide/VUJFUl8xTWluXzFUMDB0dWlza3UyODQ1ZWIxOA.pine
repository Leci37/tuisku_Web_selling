//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: UBER_1Min_1T00_2845eb18 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UBER_1Min_1T00_2845eb18", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UBER_1Min_2845eb18(ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= 0.018853 )
		if( ema12 <= -0.48734 )
			if( ema13 <= -0.961078 )
				if( ema3 <= 71.5035 )
					ret := 1.000000 // buy
				if( ema3 > 71.5035 )
					if( ema1 <= 71.4958 )
						ret := 0.000000
					if( ema1 > 71.4958 )
						ret := 1.000000 // buy
			if( ema13 > -0.961078 )
				if( ema3 <= 62.3388 )
					if( ema2 <= 61.0525 )
						ret := 0.500000
					if( ema2 > 61.0525 )
						ret := 1.000000 // buy
				if( ema3 > 62.3388 )
					if( ema1 <= 69.8643 )
						ret := -0.333333
					if( ema1 > 69.8643 )
						if( ema3 <= 72.8759 )
							ret := 1.000000 // buy
						if( ema3 > 72.8759 )
							ret := 0.166667
		if( ema12 > -0.48734 )
			if( ema13 <= -0.341257 )
				if( tema <= 69.5548 )
					if( ema1 <= 69.1434 )
						if( ema2 <= 68.3531 )
							if( ema1 <= 66.7475 )
								if( tema <= 65.5979 )
									ret := 0.017301
								if( tema > 65.5979 )
									ret := -0.936170 // sell
							if( ema1 > 66.7475 )
								if( tema <= 67.2856 )
									ret := 0.870370 // buy
								if( tema > 67.2856 )
									ret := 0.365079
						if( ema2 > 68.3531 )
							if( tema <= 68.1874 )
								if( ema1 <= 68.2097 )
									ret := -0.913043 // sell
								if( ema1 > 68.2097 )
									ret := -0.071429
							if( tema > 68.1874 )
								if( tema <= 68.7487 )
									ret := -0.969697 // sell
								if( tema > 68.7487 )
									ret := -0.750000 // sell
					if( ema1 > 69.1434 )
						if( ema12 <= -0.180503 )
							if( ema1 <= 69.6969 )
								if( tema <= 69.0344 )
									ret := 1.000000 // buy
								if( tema > 69.0344 )
									ret := 0.416667
							if( ema1 > 69.6969 )
								ret := 1.000000 // buy
						if( ema12 > -0.180503 )
							ret := -0.666667
				if( tema > 69.5548 )
					if( ema3 <= 80.0553 )
						if( ema13 <= -0.799942 )
							if( ema12 <= -0.452303 )
								ret := 1.000000 // buy
							if( ema12 > -0.452303 )
								ret := 0.500000
						if( ema13 > -0.799942 )
							if( ema3 <= 73.768 )
								if( tema <= 71.5465 )
									ret := -0.342995
								if( tema > 71.5465 )
									ret := -0.788462 // sell
							if( ema3 > 73.768 )
								if( ema3 <= 75.7547 )
									ret := 0.333333
								if( ema3 > 75.7547 )
									ret := -0.823529 // sell
					if( ema3 > 80.0553 )
						if( ema2 <= 85.3221 )
							if( ema3 <= 85.2199 )
								if( tema <= 81.2226 )
									ret := 0.800000 // buy
								if( tema > 81.2226 )
									ret := 0.200000
							if( ema3 > 85.2199 )
								ret := 1.000000 // buy
						if( ema2 > 85.3221 )
							ret := 0.000000
			if( ema13 > -0.341257 )
				if( ema13 <= -0.163621 )
					if( tema <= 70.3453 )
						if( ema1 <= 69.6916 )
							if( ema12 <= -0.115148 )
								if( ema1 <= 64.7793 )
									ret := 0.405333
								if( ema1 > 64.7793 )
									ret := 0.155738
							if( ema12 > -0.115148 )
								if( ema2 <= 67.99 )
									ret := 0.123429
								if( ema2 > 67.99 )
									ret := -0.075419
						if( ema1 > 69.6916 )
							if( ema13 <= -0.175085 )
								if( tema <= 69.491 )
									ret := 1.000000 // buy
								if( tema > 69.491 )
									ret := -0.430000
							if( ema13 > -0.175085 )
								if( ema13 <= -0.165583 )
									ret := 0.325000
								if( ema13 > -0.165583 )
									ret := 0.900000 // buy
					if( tema > 70.3453 )
						if( tema <= 70.4444 )
							if( ema2 <= 70.6765 )
								if( tema <= 70.4254 )
									ret := 0.829268 // buy
								if( tema > 70.4254 )
									ret := 0.250000
							if( ema2 > 70.6765 )
								ret := 1.000000 // buy
						if( tema > 70.4444 )
							if( ema3 <= 73.0426 )
								if( ema1 <= 72.7869 )
									ret := 0.228051
								if( ema1 > 72.7869 )
									ret := -0.840000 // sell
							if( ema3 > 73.0426 )
								if( tema <= 73.5331 )
									ret := 0.664430
								if( tema > 73.5331 )
									ret := 0.250943
				if( ema13 > -0.163621 )
					if( tema <= 56.4816 )
						if( tema <= 55.2735 )
							if( tema <= 55.2155 )
								ret := 0.500000
							if( tema > 55.2155 )
								ret := 1.000000 // buy
						if( tema > 55.2735 )
							if( tema <= 56.0245 )
								if( ema2 <= 55.724 )
									ret := -0.625000
								if( ema2 > 55.724 )
									ret := -0.971429 // sell
							if( tema > 56.0245 )
								ret := -0.500000
					if( tema > 56.4816 )
						if( ema3 <= 86.4547 )
							if( tema <= 58.9537 )
								if( ema2 <= 58.6425 )
									ret := 0.059441
								if( ema2 > 58.6425 )
									ret := 0.444444
							if( tema > 58.9537 )
								if( ema3 <= 61.8493 )
									ret := -0.199060
								if( ema3 > 61.8493 )
									ret := 0.065946
						if( ema3 > 86.4547 )
							if( ema12 <= -0.087357 )
								ret := -0.250000
							if( ema12 > -0.087357 )
								if( ema1 <= 86.4836 )
									ret := -0.954545 // sell
								if( ema1 > 86.4836 )
									ret := -0.625000
	if( ema12 > 0.018853 )
		if( ema1 <= 55.3683 )
			if( ema3 <= 53.6557 )
				ret := 0.250000
			if( ema3 > 53.6557 )
				if( ema12 <= 0.209591 )
					if( ema3 <= 53.6849 )
						ret := 0.750000 // buy
					if( ema3 > 53.6849 )
						ret := 1.000000 // buy
				if( ema12 > 0.209591 )
					if( ema3 <= 54.6464 )
						ret := 0.500000
					if( ema3 > 54.6464 )
						ret := 1.000000 // buy
		if( ema1 > 55.3683 )
			if( tema <= 79.0629 )
				if( ema12 <= 0.386049 )
					if( tema <= 69.2362 )
						if( tema <= 67.6477 )
							if( ema1 <= 64.9345 )
								if( ema1 <= 64.6893 )
									ret := 0.037106
								if( ema1 > 64.6893 )
									ret := 0.301852
							if( ema1 > 64.9345 )
								if( ema13 <= 0.110409 )
									ret := -0.139486
								if( ema13 > 0.110409 )
									ret := 0.058450
						if( tema > 67.6477 )
							if( ema2 <= 67.4927 )
								if( ema1 <= 67.4695 )
									ret := 0.200000
								if( ema1 > 67.4695 )
									ret := 0.733333 // buy
							if( ema2 > 67.4927 )
								if( ema13 <= 0.160703 )
									ret := 0.136922
								if( ema13 > 0.160703 )
									ret := -0.098918
					if( tema > 69.2362 )
						if( ema12 <= 0.061132 )
							if( ema2 <= 77.7463 )
								if( ema13 <= 0.004488 )
									ret := -0.282443
								if( ema13 > 0.004488 )
									ret := 0.012510
							if( ema2 > 77.7463 )
								if( ema3 <= 77.752 )
									ret := -0.800000 // sell
								if( ema3 > 77.752 )
									ret := -0.163399
						if( ema12 > 0.061132 )
							if( ema1 <= 71.4834 )
								if( ema2 <= 68.824 )
									ret := 1.000000 // buy
								if( ema2 > 68.824 )
									ret := -0.255962
							if( ema1 > 71.4834 )
								if( tema <= 71.633 )
									ret := 0.803571 // buy
								if( tema > 71.633 )
									ret := -0.022314
				if( ema12 > 0.386049 )
					if( tema <= 72.1714 )
						if( tema <= 69.5239 )
							if( ema12 <= 0.393952 )
								ret := -0.666667
							if( ema12 > 0.393952 )
								ret := -1.000000 // sell
						if( tema > 69.5239 )
							if( ema3 <= 70.5332 )
								ret := 1.000000 // buy
							if( ema3 > 70.5332 )
								if( tema <= 71.9792 )
									ret := -0.500000
								if( tema > 71.9792 )
									ret := -1.000000 // sell
					if( tema > 72.1714 )
						if( tema <= 73.6134 )
							ret := -1.000000 // sell
						if( tema > 73.6134 )
							if( ema1 <= 73.6882 )
								if( tema <= 73.7801 )
									ret := -0.750000 // sell
								if( tema > 73.7801 )
									ret := -0.250000
							if( ema1 > 73.6882 )
								ret := -1.000000 // sell
			if( tema > 79.0629 )
				if( ema1 <= 81.6857 )
					if( ema12 <= 0.144591 )
						if( ema13 <= 0.079307 )
							if( ema13 <= 0.070705 )
								if( ema2 <= 80.8617 )
									ret := 0.750000 // buy
								if( ema2 > 80.8617 )
									ret := 1.000000 // buy
							if( ema13 > 0.070705 )
								ret := 0.333333
						if( ema13 > 0.079307 )
							if( ema1 <= 80.9636 )
								ret := 1.000000 // buy
							if( ema1 > 80.9636 )
								if( ema2 <= 81.5318 )
									ret := 0.755556 // buy
								if( ema2 > 81.5318 )
									ret := 1.000000 // buy
					if( ema12 > 0.144591 )
						if( tema <= 81.0141 )
							if( ema12 <= 0.357354 )
								if( ema12 <= 0.221063 )
									ret := 0.875000 // buy
								if( ema12 > 0.221063 )
									ret := 0.000000
							if( ema12 > 0.357354 )
								ret := 1.000000 // buy
						if( tema > 81.0141 )
							if( ema3 <= 80.3939 )
								ret := -0.600000
							if( ema3 > 80.3939 )
								if( ema12 <= 0.169244 )
									ret := -0.750000 // sell
								if( ema12 > 0.169244 )
									ret := -1.000000 // sell
				if( ema1 > 81.6857 )
					if( tema <= 82.188 )
						if( tema <= 81.8382 )
							ret := 0.200000
						if( tema > 81.8382 )
							if( ema2 <= 81.8446 )
								if( ema13 <= 0.247649 )
									ret := -0.952381 // sell
								if( ema13 > 0.247649 )
									ret := -0.625000
							if( ema2 > 81.8446 )
								if( ema12 <= 0.056105 )
									ret := -0.736842 // sell
								if( ema12 > 0.056105 )
									ret := 0.571429
					if( tema > 82.188 )
						if( ema2 <= 84.7016 )
							if( tema <= 82.8584 )
								if( ema2 <= 82.0295 )
									ret := 0.622222
								if( ema2 > 82.0295 )
									ret := -0.473684
							if( tema > 82.8584 )
								if( tema <= 83.9298 )
									ret := 0.976744 // buy
								if( tema > 83.9298 )
									ret := 0.641304
						if( ema2 > 84.7016 )
							if( ema1 <= 86.6031 )
								if( ema3 <= 86.2225 )
									ret := -0.046729
								if( ema3 > 86.2225 )
									ret := 0.808511 // buy
							if( ema1 > 86.6031 )
								if( ema12 <= 0.111382 )
									ret := -0.800000 // sell
								if( ema12 > 0.111382 )
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
float op_operation = decision_tree_0_UBER_1Min_2845eb18(ema2, ema1, ema12, ema3, ema13, tema)

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


