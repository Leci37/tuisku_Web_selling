//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: APPS_15Min_2BT0_9f808f58 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_APPS_15Min_2BT0_9f808f58", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_APPS_15Min_9f808f58(bullPower, bbp, bearPower, bbm, BBPower_Color, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( bullPower <= -0.003156 )
		if( bbm <= 0.008298 )
			if( ema1 <= 15.0553 )
				if( bullPower <= -0.026608 )
					if( ema3 <= 5.80174 )
						if( bearPower <= -0.229528 )
							ret := -1.000000 // sell
						if( bearPower > -0.229528 )
							if( bbp <= -0.080689 )
								ret := 0.699203
							if( bbp > -0.080689 )
								ret := 0.498856
					if( ema3 > 5.80174 )
						if( ema2 <= 11.6315 )
							if( ema13 <= -0.008395 )
								ret := 0.197115
							if( ema13 > -0.008395 )
								ret := 0.551724
						if( ema2 > 11.6315 )
							if( ema2 <= 14.7 )
								ret := 0.607251
							if( ema2 > 14.7 )
								ret := 0.166667
				if( bullPower > -0.026608 )
					if( ema12 <= -0.002512 )
						if( ema1 <= 0.675162 )
							if( tema <= 0.603369 )
								ret := 0.708333 // buy
							if( tema > 0.603369 )
								ret := -0.573333
						if( ema1 > 0.675162 )
							if( tema <= 0.699647 )
								ret := 0.661290
							if( tema > 0.699647 )
								ret := 0.165582
					if( ema12 > -0.002512 )
						if( ema3 <= 6.78937 )
							if( bullPower <= -0.006229 )
								ret := 0.560811
							if( bullPower > -0.006229 )
								ret := 0.324190
						if( ema3 > 6.78937 )
							if( ema2 <= 12.8814 )
								ret := -0.061856
							if( ema2 > 12.8814 )
								ret := 0.812500 // buy
			if( ema1 > 15.0553 )
				if( ema2 <= 15.5345 )
					if( bearPower <= -0.146037 )
						if( ema12 <= -0.04251 )
							ret := 0.000000
						if( ema12 > -0.04251 )
							ret := 0.500000
					if( bearPower > -0.146037 )
						if( tema <= 15.4623 )
							if( tema <= 15.1306 )
								ret := 0.000000
							if( tema > 15.1306 )
								ret := -0.953488 // sell
						if( tema > 15.4623 )
							ret := 1.000000 // buy
				if( ema2 > 15.5345 )
					if( bullPower <= -0.154394 )
						if( ema2 <= 25.0938 )
							if( bbp <= -0.589027 )
								ret := 0.716418 // buy
							if( bbp > -0.589027 )
								ret := 0.365385
						if( ema2 > 25.0938 )
							if( ema1 <= 26.0492 )
								ret := -0.571429
							if( ema1 > 26.0492 )
								ret := 0.183942
					if( bullPower > -0.154394 )
						if( ema13 <= -0.066683 )
							if( ema3 <= 17.7905 )
								ret := -0.409639
							if( ema3 > 17.7905 )
								ret := -0.094556
						if( ema13 > -0.066683 )
							if( ema2 <= 42.2784 )
								ret := 0.310651
							if( ema2 > 42.2784 )
								ret := 0.028736
		if( bbm > 0.008298 )
			if( bearPower <= -3.6176 )
				if( ema3 <= 64.052 )
					if( ema1 <= 26.9175 )
						ret := 0.333333
					if( ema1 > 26.9175 )
						if( ema1 <= 51.8994 )
							ret := 1.000000 // buy
						if( ema1 > 51.8994 )
							if( ema2 <= 55.5954 )
								ret := 0.500000
							if( ema2 > 55.5954 )
								ret := 1.000000 // buy
				if( ema3 > 64.052 )
					if( bullPower <= -1.98375 )
						if( ema13 <= -1.48618 )
							if( ema2 <= 87.7037 )
								ret := -0.305556
							if( ema2 > 87.7037 )
								ret := 1.000000 // buy
						if( ema13 > -1.48618 )
							if( ema1 <= 79.0415 )
								ret := 1.000000 // buy
							if( ema1 > 79.0415 )
								ret := 0.400000
					if( bullPower > -1.98375 )
						if( bearPower <= -5.75306 )
							ret := 1.000000 // buy
						if( bearPower > -5.75306 )
							if( ema13 <= -0.854919 )
								ret := 0.703704 // buy
							if( ema13 > -0.854919 )
								ret := -0.285714
			if( bearPower > -3.6176 )
				if( bbp <= -0.040762 )
					if( tema <= 1.68097 )
						if( bullPower <= -0.015281 )
							if( bearPower <= -0.045656 )
								ret := 0.658031
							if( bearPower > -0.045656 )
								ret := 0.359649
						if( bullPower > -0.015281 )
							if( bbp <= -0.069317 )
								ret := 0.666667
							if( bbp > -0.069317 )
								ret := 0.026616
					if( tema > 1.68097 )
						if( tema <= 38.9962 )
							if( ema12 <= -0.477721 )
								ret := 0.414188
							if( ema12 > -0.477721 )
								ret := 0.049323
						if( tema > 38.9962 )
							if( bbm <= 0.298668 )
								ret := 0.076822
							if( bbm > 0.298668 )
								ret := -0.068015
				if( bbp > -0.040762 )
					if( ema1 <= 1.07557 )
						if( ema12 <= -0.009888 )
							if( ema2 <= 0.968474 )
								ret := 0.843750 // buy
							if( ema2 > 0.968474 )
								ret := 0.363636
						if( ema12 > -0.009888 )
							if( ema1 <= 0.790307 )
								ret := -0.260870
							if( ema1 > 0.790307 )
								ret := 0.329545
					if( ema1 > 1.07557 )
						if( bearPower <= -0.01432 )
							if( ema2 <= 1.54818 )
								ret := -0.249453
							if( ema2 > 1.54818 )
								ret := -0.074030
						if( bearPower > -0.01432 )
							if( ema12 <= -0.01223 )
								ret := 0.642857
							if( ema12 > -0.01223 )
								ret := 0.089005
	if( bullPower > -0.003156 )
		if( bbm <= 0.003774 )
			if( ema13 <= 0.081522 )
				if( bbp <= 0.07519 )
					if( ema13 <= 0.015437 )
						if( bbp <= 0.008577 )
							if( ema2 <= 0.699043 )
								ret := 0.337778
							if( ema2 > 0.699043 )
								ret := -0.086741
						if( bbp > 0.008577 )
							if( ema2 <= 1.20725 )
								ret := -0.600619
							if( ema2 > 1.20725 )
								ret := -0.164787
					if( ema13 > 0.015437 )
						if( bbp <= 0.035352 )
							if( ema3 <= 0.892959 )
								ret := -0.846154 // sell
							if( ema3 > 0.892959 )
								ret := 0.196646
						if( bbp > 0.035352 )
							if( ema1 <= 2.23937 )
								ret := -0.439153
							if( ema1 > 2.23937 )
								ret := 0.024952
				if( bbp > 0.07519 )
					if( ema3 <= 24.5592 )
						if( ema13 <= 0.031605 )
							if( tema <= 11.8527 )
								ret := -0.699176
							if( tema > 11.8527 )
								ret := -0.349057
						if( ema13 > 0.031605 )
							if( bbp <= 0.097761 )
								ret := 0.044025
							if( bbp > 0.097761 )
								ret := -0.452830
					if( ema3 > 24.5592 )
						if( ema2 <= 34.2771 )
							if( ema12 <= -0.042109 )
								ret := -0.250000
							if( ema12 > -0.042109 )
								ret := 0.500000
						if( ema2 > 34.2771 )
							if( bbm <= 0.000137 )
								ret := -0.011494
							if( bbm > 0.000137 )
								ret := -0.625000
			if( ema13 > 0.081522 )
				if( bearPower <= 0.236804 )
					if( ema2 <= 3.44188 )
						ret := -1.000000 // sell
					if( ema2 > 3.44188 )
						if( tema <= 4.32687 )
							if( ema13 <= 0.136835 )
								ret := 1.000000 // buy
							if( ema13 > 0.136835 )
								ret := 0.250000
						if( tema > 4.32687 )
							if( ema12 <= 0.059475 )
								ret := 0.222222
							if( ema12 > 0.059475 )
								ret := 0.057534
				if( bearPower > 0.236804 )
					if( ema1 <= 15.5978 )
						if( bullPower <= 0.315553 )
							if( ema1 <= 13.1638 )
								ret := -1.000000 // sell
							if( ema1 > 13.1638 )
								ret := -0.857143 // sell
						if( bullPower > 0.315553 )
							if( ema1 <= 15.1171 )
								ret := -0.500000
							if( ema1 > 15.1171 )
								ret := -1.000000 // sell
					if( ema1 > 15.5978 )
						if( bbm <= 3.2e-05 )
							if( ema2 <= 41.1504 )
								ret := -0.245033
							if( ema2 > 41.1504 )
								ret := -0.030303
						if( bbm > 3.2e-05 )
							if( bearPower <= 0.307011 )
								ret := -0.909091 // sell
							if( bearPower > 0.307011 )
								ret := -0.416667
		if( bbm > 0.003774 )
			if( bearPower <= 0.05002 )
				if( ema3 <= 88.0909 )
					if( bearPower <= -3.84497 )
						if( bbm <= 6.00637 )
							if( bbm <= 5.30318 )
								ret := 1.000000 // buy
							if( bbm > 5.30318 )
								ret := 0.500000
						if( bbm > 6.00637 )
							ret := 1.000000 // buy
					if( bearPower > -3.84497 )
						if( ema2 <= 0.610831 )
							if( bbm <= 0.012322 )
								ret := 1.000000 // buy
							if( bbm > 0.012322 )
								ret := 0.740741 // buy
						if( ema2 > 0.610831 )
							if( ema3 <= 0.627735 )
								ret := -0.672131
							if( ema3 > 0.627735 )
								ret := -0.008244
				if( ema3 > 88.0909 )
					if( bbm <= 0.532931 )
						if( tema <= 93.7725 )
							if( ema13 <= -0.064267 )
								ret := -0.700000 // sell
							if( ema13 > -0.064267 )
								ret := 0.000000
						if( tema > 93.7725 )
							ret := 1.000000 // buy
					if( bbm > 0.532931 )
						if( tema <= 91.3294 )
							if( bbp <= -1.4114 )
								ret := 0.600000
							if( bbp > -1.4114 )
								ret := -0.635135
						if( tema > 91.3294 )
							if( bullPower <= 0.257223 )
								ret := -0.125000
							if( bullPower > 0.257223 )
								ret := -0.858491 // sell
			if( bearPower > 0.05002 )
				if( ema3 <= 2.64997 )
					if( bullPower <= 0.107126 )
						if( ema1 <= 1.22379 )
							ret := 0.500000
						if( ema1 > 1.22379 )
							if( bearPower <= 0.051533 )
								ret := -0.375000
							if( bearPower > 0.051533 )
								ret := -0.885496 // sell
					if( bullPower > 0.107126 )
						if( ema1 <= 2.22505 )
							if( bbm <= 0.061231 )
								ret := -0.621622
							if( bbm > 0.061231 )
								ret := 0.317073
						if( ema1 > 2.22505 )
							if( bbp <= 0.215944 )
								ret := 0.200000
							if( bbp > 0.215944 )
								ret := -0.866667 // sell
				if( ema3 > 2.64997 )
					if( bbm <= 0.20912 )
						if( ema2 <= 2.83621 )
							if( bbp <= 0.143193 )
								ret := -0.500000
							if( bbp > 0.143193 )
								ret := 0.893617 // buy
						if( ema2 > 2.83621 )
							if( ema13 <= 0.097644 )
								ret := -0.222979
							if( ema13 > 0.097644 )
								ret := -0.100813
					if( bbm > 0.20912 )
						if( ema2 <= 85.3369 )
							if( tema <= 86.2408 )
								ret := 0.014797
							if( tema > 86.2408 )
								ret := -0.500000
						if( ema2 > 85.3369 )
							if( bearPower <= 1.21165 )
								ret := -0.389262
							if( bearPower > 1.21165 )
								ret := 0.223881
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_APPS_15Min_9f808f58(bullPower, bbp, bearPower, bbm, BBPower_Color, ema3, tema, ema2, ema12, ema13, ema1)

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


