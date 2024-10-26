//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: SPOT_5Min_2BT0_88ec8e72 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SPOT_5Min_2BT0_88ec8e72", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SPOT_5Min_88ec8e72(bbm, bearPower, bbp, bullPower, BBPower_Color, ema1, tema, ema12, ema2, ema3, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( bbp <= 1.76507 )
		if( bbm <= 0.052433 )
			if( bullPower <= -1.41144 )
				if( ema13 <= -5.45774 )
					if( bullPower <= -7.84652 )
						ret := -1.000000 // sell
					if( bullPower > -7.84652 )
						ret := -0.800000 // sell
				if( ema13 > -5.45774 )
					if( tema <= 281.829 )
						if( ema13 <= -1.48661 )
							ret := 0.200000
						if( ema13 > -1.48661 )
							ret := 0.731959 // buy
					if( tema > 281.829 )
						if( ema3 <= 336.042 )
							ret := 0.958678 // buy
						if( ema3 > 336.042 )
							ret := 0.464286
			if( bullPower > -1.41144 )
				if( tema <= 131.783 )
					if( bullPower <= -0.879574 )
						ret := 0.000000
					if( bullPower > -0.879574 )
						if( bbp <= -1.41718 )
							ret := -0.700000 // sell
						if( bbp > -1.41718 )
							ret := -1.000000 // sell
				if( tema > 131.783 )
					if( ema1 <= 343.251 )
						if( ema3 <= 156.919 )
							ret := 0.249729
						if( ema3 > 156.919 )
							ret := 0.047209
					if( ema1 > 343.251 )
						if( ema1 <= 374.25 )
							ret := 0.644578
						if( ema1 > 374.25 )
							ret := -0.428571
		if( bbm > 0.052433 )
			if( ema3 <= 384.762 )
				if( ema3 <= 156.933 )
					if( ema3 <= 140.223 )
						if( bbp <= -1.96779 )
							ret := 0.560976
						if( bbp > -1.96779 )
							ret := -0.076037
					if( ema3 > 140.223 )
						if( bullPower <= -1.35887 )
							ret := 0.585106
						if( bullPower > -1.35887 )
							ret := 0.115997
				if( ema3 > 156.933 )
					if( ema3 <= 164.42 )
						if( tema <= 154.469 )
							ret := 1.000000 // buy
						if( tema > 154.469 )
							ret := -0.158032
					if( ema3 > 164.42 )
						if( ema3 <= 167.377 )
							ret := 0.416309
						if( ema3 > 167.377 )
							ret := 0.011429
			if( ema3 > 384.762 )
				if( ema3 <= 385.532 )
					ret := -0.555556
				if( ema3 > 385.532 )
					if( ema2 <= 386.023 )
						ret := -0.875000 // sell
					if( ema2 > 386.023 )
						ret := -1.000000 // sell
	if( bbp > 1.76507 )
		if( bearPower <= 1.10512 )
			if( ema2 <= 299.939 )
				if( ema1 <= 298.044 )
					if( bbm <= 0.251146 )
						if( ema1 <= 283.575 )
							ret := -0.548387
						if( ema1 > 283.575 )
							ret := 0.500000
					if( bbm > 0.251146 )
						if( tema <= 297.267 )
							ret := 0.056790
						if( tema > 297.267 )
							ret := -0.646154
				if( ema1 > 298.044 )
					if( bbm <= 1.21447 )
						if( ema13 <= 0.940706 )
							ret := 0.590909
						if( ema13 > 0.940706 )
							ret := 0.926829 // buy
					if( bbm > 1.21447 )
						if( bbm <= 1.90294 )
							ret := 0.000000
						if( bbm > 1.90294 )
							ret := 0.833333 // buy
			if( ema2 > 299.939 )
				if( ema13 <= 1.1332 )
					if( ema2 <= 322.446 )
						if( ema3 <= 314.514 )
							ret := -0.125000
						if( ema3 > 314.514 )
							ret := -0.863636 // sell
					if( ema2 > 322.446 )
						if( ema3 <= 323.658 )
							ret := 0.825000 // buy
						if( ema3 > 323.658 )
							ret := -0.032738
				if( ema13 > 1.1332 )
					if( ema12 <= 1.47009 )
						if( ema1 <= 325.642 )
							ret := -0.638514
						if( ema1 > 325.642 )
							ret := -0.350230
					if( ema12 > 1.47009 )
						if( tema <= 312.831 )
							ret := 0.666667
						if( tema > 312.831 )
							ret := -0.192308
		if( bearPower > 1.10512 )
			if( ema12 <= 1.33102 )
				if( bearPower <= 2.11368 )
					if( bullPower <= 1.47707 )
						if( ema13 <= 1.33968 )
							ret := -0.780749 // sell
						if( ema13 > 1.33968 )
							ret := -0.303030
					if( bullPower > 1.47707 )
						if( ema12 <= 1.23865 )
							ret := -0.279592
						if( ema12 > 1.23865 )
							ret := -0.724138 // sell
				if( bearPower > 2.11368 )
					if( ema2 <= 332.343 )
						if( ema12 <= 1.28456 )
							ret := -0.846995 // sell
						if( ema12 > 1.28456 )
							ret := -0.333333
					if( ema2 > 332.343 )
						if( ema2 <= 363.531 )
							ret := 0.071429
						if( ema2 > 363.531 )
							ret := -0.416667
			if( ema12 > 1.33102 )
				if( bullPower <= 6.9805 )
					if( ema13 <= 5.57603 )
						if( ema2 <= 204.402 )
							ret := 0.267516
						if( ema2 > 204.402 )
							ret := -0.104693
					if( ema13 > 5.57603 )
						if( ema1 <= 309.555 )
							ret := 0.967742 // buy
						if( ema1 > 309.555 )
							ret := 0.264706
				if( bullPower > 6.9805 )
					if( bullPower <= 20.0698 )
						if( ema12 <= 2.94863 )
							ret := -0.945946 // sell
						if( ema12 > 2.94863 )
							ret := -0.461538
					if( bullPower > 20.0698 )
						ret := 0.733333 // buy
	
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
float op_operation = decision_tree_0_SPOT_5Min_88ec8e72(bbm, bearPower, bbp, bullPower, BBPower_Color, ema1, tema, ema12, ema2, ema3, ema13)

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


