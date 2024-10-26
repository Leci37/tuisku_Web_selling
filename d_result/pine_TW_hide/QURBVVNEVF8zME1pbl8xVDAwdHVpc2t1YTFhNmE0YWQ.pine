//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: ADAUSDT_30Min_1T00_a1a6a4ad Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADAUSDT_30Min_1T00_a1a6a4ad", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADAUSDT_30Min_a1a6a4ad(ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( ema12 <= -0.011282 )
		if( ema1 <= 1.25877 )
			if( tema <= 1.00101 )
				if( ema1 <= 1.00536 )
					if( ema3 <= 0.516125 )
						if( tema <= 0.25272 )
							ret := -0.200000
						if( tema > 0.25272 )
							if( ema12 <= -0.012065 )
								ret := 0.901961 // buy
							if( ema12 > -0.012065 )
								ret := 0.555556
					if( ema3 > 0.516125 )
						if( ema13 <= -0.04232 )
							if( ema2 <= 0.786202 )
								ret := 0.928571 // buy
							if( ema2 > 0.786202 )
								ret := 0.242424
						if( ema13 > -0.04232 )
							if( ema1 <= 0.583933 )
								ret := -0.361446
							if( ema1 > 0.583933 )
								ret := 0.125402
				if( ema1 > 1.00536 )
					if( ema12 <= -0.020431 )
						ret := -0.454545
					if( ema12 > -0.020431 )
						if( ema3 <= 1.05074 )
							ret := -1.000000 // sell
						if( ema3 > 1.05074 )
							ret := -0.857143 // sell
			if( tema > 1.00101 )
				if( tema <= 1.23098 )
					if( tema <= 1.16919 )
						if( ema1 <= 1.03937 )
							if( ema12 <= -0.013455 )
								ret := 0.555556
							if( ema12 > -0.013455 )
								ret := 1.000000 // buy
						if( ema1 > 1.03937 )
							if( ema3 <= 1.06223 )
								ret := -1.000000 // sell
							if( ema3 > 1.06223 )
								ret := 0.284483
					if( tema > 1.16919 )
						if( tema <= 1.21311 )
							if( ema1 <= 1.21526 )
								ret := 0.553571
							if( ema1 > 1.21526 )
								ret := 0.794444 // buy
						if( tema > 1.21311 )
							if( ema2 <= 1.24888 )
								ret := -0.454545
							if( ema2 > 1.24888 )
								ret := 0.500000
				if( tema > 1.23098 )
					if( ema2 <= 1.26319 )
						ret := -1.000000 // sell
					if( ema2 > 1.26319 )
						ret := -0.285714
		if( ema1 > 1.25877 )
			if( tema <= 1.25496 )
				if( ema12 <= -0.016551 )
					if( ema12 <= -0.043052 )
						ret := 0.111111
					if( ema12 > -0.043052 )
						if( ema13 <= -0.035501 )
							if( ema3 <= 1.32757 )
								ret := -1.000000 // sell
							if( ema3 > 1.32757 )
								ret := -0.882353 // sell
						if( ema13 > -0.035501 )
							ret := -0.666667
				if( ema12 > -0.016551 )
					if( ema1 <= 1.26951 )
						ret := -0.571429
					if( ema1 > 1.26951 )
						ret := 1.000000 // buy
			if( tema > 1.25496 )
				if( ema12 <= -0.059694 )
					if( ema2 <= 2.52824 )
						if( ema12 <= -0.07394 )
							ret := 1.000000 // buy
						if( ema12 > -0.07394 )
							if( ema13 <= -0.104406 )
								ret := 0.565217
							if( ema13 > -0.104406 )
								ret := 1.000000 // buy
					if( ema2 > 2.52824 )
						if( ema13 <= -0.118307 )
							ret := -0.571429
						if( ema13 > -0.118307 )
							ret := 0.916667 // buy
				if( ema12 > -0.059694 )
					if( ema3 <= 1.36916 )
						if( ema12 <= -0.024246 )
							ret := -0.888889 // sell
						if( ema12 > -0.024246 )
							if( ema13 <= -0.028332 )
								ret := 0.741379 // buy
							if( ema13 > -0.028332 )
								ret := 0.444444
					if( ema3 > 1.36916 )
						if( ema1 <= 1.34198 )
							if( tema <= 1.27135 )
								ret := -0.666667
							if( tema > 1.27135 )
								ret := -0.935484 // sell
						if( ema1 > 1.34198 )
							if( ema2 <= 2.70878 )
								ret := 0.093601
							if( ema2 > 2.70878 )
								ret := 0.520833
	if( ema12 > -0.011282 )
		if( ema3 <= 0.499628 )
			if( ema12 <= -0.001348 )
				if( ema12 <= -0.00537 )
					if( tema <= 0.257376 )
						if( ema13 <= -0.013785 )
							ret := 1.000000 // buy
						if( ema13 > -0.013785 )
							if( ema3 <= 0.268279 )
								ret := 0.375000
							if( ema3 > 0.268279 )
								ret := 1.000000 // buy
					if( tema > 0.257376 )
						if( ema2 <= 0.279586 )
							if( tema <= 0.260393 )
								ret := -0.428571
							if( tema > 0.260393 )
								ret := -1.000000 // sell
						if( ema2 > 0.279586 )
							if( ema2 <= 0.380905 )
								ret := 0.232932
							if( ema2 > 0.380905 )
								ret := 0.461153
				if( ema12 > -0.00537 )
					if( ema1 <= 0.294761 )
						if( ema1 <= 0.088313 )
							if( ema1 <= 0.081589 )
								ret := 0.750000 // buy
							if( ema1 > 0.081589 )
								ret := -0.954545 // sell
						if( ema1 > 0.088313 )
							if( ema12 <= -0.00497 )
								ret := -0.310345
							if( ema12 > -0.00497 )
								ret := 0.332961
					if( ema1 > 0.294761 )
						if( tema <= 0.298868 )
							if( ema2 <= 0.300185 )
								ret := -0.375000
							if( ema2 > 0.300185 )
								ret := -0.767442 // sell
						if( tema > 0.298868 )
							if( ema3 <= 0.308928 )
								ret := 0.566667
							if( ema3 > 0.308928 )
								ret := 0.140342
			if( ema12 > -0.001348 )
				if( ema3 <= 0.153858 )
					if( ema3 <= 0.151187 )
						if( ema13 <= 0.00074 )
							if( tema <= 0.146383 )
								ret := 0.045319
							if( tema > 0.146383 )
								ret := -0.934783 // sell
						if( ema13 > 0.00074 )
							if( ema2 <= 0.090633 )
								ret := 0.801802 // buy
							if( ema2 > 0.090633 )
								ret := 0.181227
					if( ema3 > 0.151187 )
						if( ema2 <= 0.151606 )
							if( tema <= 0.152123 )
								ret := 1.000000 // buy
							if( tema > 0.152123 )
								ret := 0.882353 // buy
						if( ema2 > 0.151606 )
							if( ema12 <= -0.00065 )
								ret := -0.586207
							if( ema12 > -0.00065 )
								ret := 0.651961
				if( ema3 > 0.153858 )
					if( ema3 <= 0.173173 )
						if( ema1 <= 0.166758 )
							if( ema1 <= 0.160186 )
								ret := -0.205776
							if( ema1 > 0.160186 )
								ret := 0.222930
						if( ema1 > 0.166758 )
							if( ema1 <= 0.170373 )
								ret := -0.610879
							if( ema1 > 0.170373 )
								ret := -0.194444
					if( ema3 > 0.173173 )
						if( tema <= 0.51038 )
							if( ema12 <= 0.005998 )
								ret := 0.038781
							if( ema12 > 0.005998 )
								ret := -0.145078
						if( tema > 0.51038 )
							if( ema3 <= 0.474985 )
								ret := -0.857143 // sell
							if( ema3 > 0.474985 )
								ret := 0.500000
		if( ema3 > 0.499628 )
			if( ema2 <= 0.503223 )
				if( ema1 <= 0.501125 )
					if( tema <= 0.489596 )
						if( ema2 <= 0.496651 )
							ret := 0.428571
						if( ema2 > 0.496651 )
							if( ema3 <= 0.500564 )
								ret := -0.428571
							if( ema3 > 0.500564 )
								ret := -0.900000 // sell
					if( tema > 0.489596 )
						if( ema1 <= 0.498525 )
							if( ema1 <= 0.497154 )
								ret := -0.086022
							if( ema1 > 0.497154 )
								ret := 0.523810
						if( ema1 > 0.498525 )
							if( ema13 <= -0.002409 )
								ret := -0.533333
							if( ema13 > -0.002409 )
								ret := 0.061224
				if( ema1 > 0.501125 )
					if( ema2 <= 0.501249 )
						ret := -0.076923
					if( ema2 > 0.501249 )
						if( tema <= 0.501199 )
							if( ema1 <= 0.501828 )
								ret := -0.888889 // sell
							if( ema1 > 0.501828 )
								ret := -1.000000 // sell
						if( tema > 0.501199 )
							if( tema <= 0.501751 )
								ret := -0.100000
							if( tema > 0.501751 )
								ret := -0.760563 // sell
			if( ema2 > 0.503223 )
				if( ema3 <= 2.87105 )
					if( ema13 <= 0.002646 )
						if( ema1 <= 0.535471 )
							if( ema1 <= 0.513833 )
								ret := 0.010740
							if( ema1 > 0.513833 )
								ret := -0.201850
						if( ema1 > 0.535471 )
							if( tema <= 0.533539 )
								ret := 0.672727
							if( tema > 0.533539 )
								ret := 0.004011
					if( ema13 > 0.002646 )
						if( ema3 <= 0.555013 )
							if( ema2 <= 0.543045 )
								ret := 0.170120
							if( ema2 > 0.543045 )
								ret := 0.647321
						if( ema3 > 0.555013 )
							if( tema <= 0.566413 )
								ret := -0.746032 // sell
							if( tema > 0.566413 )
								ret := 0.024404
				if( ema3 > 2.87105 )
					if( ema3 <= 2.87318 )
						ret := -1.000000 // sell
					if( ema3 > 2.87318 )
						if( ema12 <= 0.016371 )
							if( tema <= 2.86988 )
								ret := -0.583333
							if( tema > 2.86988 )
								ret := -0.213235
						if( ema12 > 0.016371 )
							if( ema13 <= 0.063857 )
								ret := -0.866667 // sell
							if( ema13 > 0.063857 )
								ret := -0.428571
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_ADAUSDT_30Min_a1a6a4ad(ema3, tema, ema2, ema12, ema13, ema1)

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


