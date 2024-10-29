//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: APPS_5Min_2BT0_d6c249d2 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_APPS_5Min_2BT0_d6c249d2", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_APPS_5Min_d6c249d2(bullPower, bbp, bearPower, bbm, BBPower_Color, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( bearPower <= 0.006649 )
		if( bullPower <= -0.026941 )
			if( bbm <= 0.008674 )
				if( bullPower <= -0.126104 )
					if( bearPower <= -0.135338 )
						ret := 1.000000 // buy
					if( bearPower > -0.135338 )
						ret := 0.777778 // buy
				if( bullPower > -0.126104 )
					if( ema1 <= 4.38401 )
						if( bearPower <= -0.076638 )
							ret := -0.571429
						if( bearPower > -0.076638 )
							ret := 0.631884
					if( ema1 > 4.38401 )
						if( ema3 <= 5.69035 )
							ret := -0.056818
						if( ema3 > 5.69035 )
							ret := 0.324830
			if( bbm > 0.008674 )
				if( ema12 <= -0.097396 )
					if( bullPower <= -0.1069 )
						if( bbm <= 0.060658 )
							ret := 0.666667
						if( bbm > 0.060658 )
							ret := -0.158537
					if( bullPower > -0.1069 )
						if( ema13 <= -0.188656 )
							ret := -0.870968 // sell
						if( ema13 > -0.188656 )
							ret := -0.238095
				if( ema12 > -0.097396 )
					if( ema12 <= -0.079125 )
						if( bbm <= 0.096051 )
							ret := 0.648936
						if( bbm > 0.096051 )
							ret := 0.235294
					if( ema12 > -0.079125 )
						if( tema <= 13.3344 )
							ret := 0.085920
						if( tema > 13.3344 )
							ret := 0.690141
		if( bullPower > -0.026941 )
			if( bbm <= 0.004269 )
				if( bearPower <= -0.002296 )
					if( ema3 <= 3.13822 )
						if( ema12 <= -0.009147 )
							ret := 0.026316
						if( ema12 > -0.009147 )
							ret := 0.504726
					if( ema3 > 3.13822 )
						if( tema <= 10.7719 )
							ret := 0.200528
						if( tema > 10.7719 )
							ret := -0.369231
				if( bearPower > -0.002296 )
					if( ema13 <= -0.003528 )
						if( ema2 <= 1.63752 )
							ret := 1.000000 // buy
						if( ema2 > 1.63752 )
							ret := -0.338182
					if( ema13 > -0.003528 )
						if( bullPower <= 0.003235 )
							ret := -0.127273
						if( bullPower > 0.003235 )
							ret := 0.157143
			if( bbm > 0.004269 )
				if( ema2 <= 1.42391 )
					if( ema2 <= 1.4237 )
						if( ema2 <= 1.42162 )
							ret := 0.813953 // buy
						if( ema2 > 1.42162 )
							ret := 0.200000
					if( ema2 > 1.4237 )
						ret := 1.000000 // buy
				if( ema2 > 1.42391 )
					if( ema3 <= 2.47839 )
						if( ema2 <= 2.15775 )
							ret := 0.000798
						if( ema2 > 2.15775 )
							ret := -0.129188
					if( ema3 > 2.47839 )
						if( tema <= 2.81246 )
							ret := 0.200335
						if( tema > 2.81246 )
							ret := -0.003721
	if( bearPower > 0.006649 )
		if( bbm <= 0.00986 )
			if( bbp <= 0.149025 )
				if( ema13 <= 0.014562 )
					if( bullPower <= 0.022726 )
						if( ema1 <= 1.86043 )
							ret := -0.073359
						if( ema1 > 1.86043 )
							ret := -0.342793
					if( bullPower > 0.022726 )
						if( ema3 <= 3.88669 )
							ret := -0.792717 // sell
						if( ema3 > 3.88669 )
							ret := -0.427586
				if( ema13 > 0.014562 )
					if( bearPower <= 0.045561 )
						if( ema2 <= 11.1926 )
							ret := -0.107973
						if( ema2 > 11.1926 )
							ret := -0.698413
					if( bearPower > 0.045561 )
						if( ema12 <= 0.034537 )
							ret := -0.536184
						if( ema12 > 0.034537 )
							ret := 0.360656
			if( bbp > 0.149025 )
				if( ema12 <= 0.078456 )
					if( ema2 <= 11.2386 )
						if( tema <= 5.83492 )
							ret := -0.816901 // sell
						if( tema > 5.83492 )
							ret := -0.968153 // sell
					if( ema2 > 11.2386 )
						if( tema <= 12.1858 )
							ret := -0.142857
						if( tema > 12.1858 )
							ret := -0.941176 // sell
				if( ema12 > 0.078456 )
					ret := 0.555556
		if( bbm > 0.00986 )
			if( bullPower <= 0.178195 )
				if( bbp <= 0.109248 )
					if( tema <= 1.51504 )
						if( ema13 <= 0.015263 )
							ret := -0.666667
						if( ema13 > 0.015263 )
							ret := -1.000000 // sell
					if( tema > 1.51504 )
						if( ema3 <= 4.17394 )
							ret := -0.046209
						if( ema3 > 4.17394 )
							ret := 0.053233
				if( bbp > 0.109248 )
					if( ema13 <= 0.033659 )
						if( tema <= 8.97824 )
							ret := -0.603175
						if( tema > 8.97824 )
							ret := -0.073394
					if( ema13 > 0.033659 )
						if( ema2 <= 12.4962 )
							ret := -0.113924
						if( ema2 > 12.4962 )
							ret := 0.323308
			if( bullPower > 0.178195 )
				if( ema2 <= 2.98319 )
					if( ema13 <= 0.177494 )
						ret := 1.000000 // buy
					if( ema13 > 0.177494 )
						ret := 0.615385
				if( ema2 > 2.98319 )
					if( tema <= 10.854 )
						if( ema1 <= 9.49507 )
							ret := 0.243161
						if( ema1 > 9.49507 )
							ret := -0.458333
					if( tema > 10.854 )
						if( ema3 <= 13.0916 )
							ret := 0.814815 // buy
						if( ema3 > 13.0916 )
							ret := 0.400000
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_APPS_5Min_d6c249d2(bullPower, bbp, bearPower, bbm, BBPower_Color, ema3, tema, ema2, ema12, ema13, ema1)

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


