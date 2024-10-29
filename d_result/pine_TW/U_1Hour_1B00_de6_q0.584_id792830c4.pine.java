//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power
// ID_model: U_1Hour_1B00_792830c4 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_U_1Hour_1B00_792830c4", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_U_1Hour_792830c4(bbp, bullPower, BBPower_Color, bearPower, bbm)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( bbp <= 0.736129 )
		if( bullPower <= -0.727811 )
			if( bbp <= -2.71523 )
				if( bullPower <= -1.17269 )
					if( bbp <= -3.19084 )
						if( bearPower <= -3.53344 )
							ret := 0.147014
						if( bearPower > -3.53344 )
							ret := -0.081690
					if( bbp > -3.19084 )
						if( bbp <= -2.98996 )
							ret := -0.672414
						if( bbp > -2.98996 )
							ret := -0.244444
				if( bullPower > -1.17269 )
					if( bbm <= 2.28301 )
						if( bbp <= -4.17217 )
							ret := -1.000000 // sell
						if( bbp > -4.17217 )
							ret := 0.262948
					if( bbm > 2.28301 )
						if( bearPower <= -4.96934 )
							ret := -0.357143
						if( bearPower > -4.96934 )
							ret := 0.800000 // buy
			if( bbp > -2.71523 )
				if( bullPower <= -1.00276 )
					if( bbp <= -2.61697 )
						if( bullPower <= -1.18835 )
							ret := -0.583333
						if( bullPower > -1.18835 )
							ret := 0.818182 // buy
					if( bbp > -2.61697 )
						if( bearPower <= -1.35475 )
							ret := 0.861111 // buy
						if( bearPower > -1.35475 )
							ret := 0.555556
				if( bullPower > -1.00276 )
					if( bbm <= 0.573553 )
						if( bbm <= 0.167549 )
							ret := 0.401961
						if( bbm > 0.167549 )
							ret := -0.025362
					if( bbm > 0.573553 )
						if( bbm <= 0.932886 )
							ret := 0.619048
						if( bbm > 0.932886 )
							ret := -0.142857
		if( bullPower > -0.727811 )
			if( bearPower <= -1.93172 )
				if( bbm <= 2.60673 )
					if( bbp <= -2.84267 )
						if( bbm <= 1.94777 )
							ret := 0.552632
						if( bbm > 1.94777 )
							ret := -0.340000
					if( bbp > -2.84267 )
						if( bearPower <= -2.2264 )
							ret := -0.869565 // sell
						if( bearPower > -2.2264 )
							ret := -0.601770
				if( bbm > 2.60673 )
					if( bbp <= -1.99473 )
						if( bbp <= -3.20495 )
							ret := -0.113725
						if( bbp > -3.20495 )
							ret := 0.354839
					if( bbp > -1.99473 )
						if( bbp <= -1.26732 )
							ret := -0.763636 // sell
						if( bbp > -1.26732 )
							ret := -0.040000
			if( bearPower > -1.93172 )
				if( bearPower <= -1.6126 )
					if( bearPower <= -1.67121 )
						if( bbm <= 1.265 )
							ret := -0.705882 // sell
						if( bbm > 1.265 )
							ret := 0.227564
					if( bearPower > -1.67121 )
						if( bullPower <= -0.154937 )
							ret := 0.090909
						if( bullPower > -0.154937 )
							ret := 0.731343 // buy
				if( bearPower > -1.6126 )
					if( bullPower <= -0.294837 )
						if( bearPower <= -0.894106 )
							ret := 0.050096
						if( bearPower > -0.894106 )
							ret := -0.262655
					if( bullPower > -0.294837 )
						if( bbm <= 2.85488 )
							ret := -0.029770
						if( bbm > 2.85488 )
							ret := -0.787234 // sell
	if( bbp > 0.736129 )
		if( bullPower <= 1.05038 )
			if( bullPower <= 0.879956 )
				if( bbm <= 0.257058 )
					if( bbm <= 0.190374 )
						if( bearPower <= 0.362294 )
							ret := 0.396040
						if( bearPower > 0.362294 )
							ret := 0.096606
					if( bbm > 0.190374 )
						if( bullPower <= 0.519459 )
							ret := 0.083333
						if( bullPower > 0.519459 )
							ret := 0.560510
				if( bbm > 0.257058 )
					if( bearPower <= 0.443542 )
						if( bbm <= 0.33975 )
							ret := -0.201754
						if( bbm > 0.33975 )
							ret := 0.120000
					if( bearPower > 0.443542 )
						if( bullPower <= 0.765036 )
							ret := -0.928571 // sell
						if( bullPower > 0.765036 )
							ret := -0.250000
			if( bullPower > 0.879956 )
				if( bbm <= 0.738309 )
					if( bearPower <= 0.276715 )
						if( bearPower <= 0.237363 )
							ret := -0.555556
						if( bearPower > 0.237363 )
							ret := -0.027027
					if( bearPower > 0.276715 )
						if( bbp <= 1.40831 )
							ret := 0.608696
						if( bbp > 1.40831 )
							ret := 0.214744
				if( bbm > 0.738309 )
					if( bbm <= 0.832986 )
						if( bullPower <= 0.987804 )
							ret := 0.921053 // buy
						if( bullPower > 0.987804 )
							ret := 0.681818
					if( bbm > 0.832986 )
						if( bbp <= 0.818626 )
							ret := 0.954545 // buy
						if( bbp > 0.818626 )
							ret := 0.339286
		if( bullPower > 1.05038 )
			if( bbm <= 7.7141 )
				if( bbp <= 11.8999 )
					if( bbp <= 2.1725 )
						if( bbp <= 2.01055 )
							ret := -0.025377
						if( bbp > 2.01055 )
							ret := -0.339207
					if( bbp > 2.1725 )
						if( bbm <= 1.04563 )
							ret := -0.002473
						if( bbm > 1.04563 )
							ret := 0.147504
				if( bbp > 11.8999 )
					if( bullPower <= 8.17026 )
						if( bearPower <= 4.90651 )
							ret := -0.777778 // sell
						if( bearPower > 4.90651 )
							ret := -0.083333
					if( bullPower > 8.17026 )
						ret := -1.000000 // sell
			if( bbm > 7.7141 )
				if( bbp <= 4.68212 )
					if( bbm <= 9.19089 )
						ret := -0.789474 // sell
					if( bbm > 9.19089 )
						ret := -1.000000 // sell
				if( bbp > 4.68212 )
					if( bbm <= 9.4375 )
						ret := 0.090909
					if( bbm > 9.4375 )
						ret := -0.444444
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
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
float op_operation = decision_tree_0_U_1Hour_792830c4(bbp, bullPower, BBPower_Color, bearPower, bbm)

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


