//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power
// ID_model: LYFT_5Min_1B00_90fe07dc Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LYFT_5Min_1B00_90fe07dc", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LYFT_5Min_90fe07dc(bearPower, bbm, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6,max_features=sqrt, min_samples_split=10,random_state=843828734)
	if( bbp <= 0.040925 )
		if( bbm <= 0.010002 )
			if( bearPower <= -0.037038 )
				if( bbm <= 0.009764 )
					if( bbp <= -0.091262 )
						if( bullPower <= -0.098955 )
							ret := 0.436242
						if( bullPower > -0.098955 )
							ret := 0.601942
					if( bbp > -0.091262 )
						if( bullPower <= -0.038113 )
							ret := 0.242188
						if( bullPower > -0.038113 )
							ret := 0.750000 // buy
				if( bbm > 0.009764 )
					if( bbp <= -0.07178 )
						if( bbm <= 0.009899 )
							ret := -1.000000 // sell
						if( bbm > 0.009899 )
							ret := 0.141479
					if( bbp > -0.07178 )
						if( bullPower <= -0.027509 )
							ret := 0.647059
						if( bullPower > -0.027509 )
							ret := 0.250000
			if( bearPower > -0.037038 )
				if( bearPower <= -0.008288 )
					if( bbm <= 0.008376 )
						if( bbp <= -0.017494 )
							ret := 0.208692
						if( bbp > -0.017494 )
							ret := 0.496124
					if( bbm > 0.008376 )
						if( bullPower <= -0.001229 )
							ret := 0.050913
						if( bullPower > -0.001229 )
							ret := 0.280000
				if( bearPower > -0.008288 )
					if( bullPower <= 0.0247 )
						if( bullPower <= -0.007768 )
							ret := -0.363636
						if( bullPower > -0.007768 )
							ret := 0.046534
					if( bullPower > 0.0247 )
						if( bearPower <= 0.015099 )
							ret := 0.750000 // buy
						if( bearPower > 0.015099 )
							ret := 0.961538 // buy
		if( bbm > 0.010002 )
			if( bbm <= 0.260002 )
				if( bearPower <= -0.354495 )
					if( bullPower <= -0.151188 )
						if( bullPower <= -0.384177 )
							ret := -0.585366
						if( bullPower > -0.384177 )
							ret := -0.125000
					if( bullPower > -0.151188 )
						ret := -1.000000 // sell
				if( bearPower > -0.354495 )
					if( bullPower <= -0.054004 )
						if( bbp <= -0.196926 )
							ret := -0.003310
						if( bbp > -0.196926 )
							ret := 0.201215
					if( bullPower > -0.054004 )
						if( bearPower <= -0.005233 )
							ret := -0.020825
						if( bearPower > -0.005233 )
							ret := 0.066322
			if( bbm > 0.260002 )
				if( bullPower <= -0.02557 )
					if( bbp <= -1.19824 )
						if( bullPower <= -0.657871 )
							ret := 0.857143 // buy
						if( bullPower > -0.657871 )
							ret := 1.000000 // buy
					if( bbp > -1.19824 )
						if( bearPower <= -0.381177 )
							ret := 0.150000
						if( bearPower > -0.381177 )
							ret := 0.861111 // buy
				if( bullPower > -0.02557 )
					if( BBPower_Color <= 0.5 )
						if( bullPower <= 0.036315 )
							ret := -0.241379
						if( bullPower > 0.036315 )
							ret := 0.325000
					if( BBPower_Color > 0.5 )
						if( bullPower <= 0.153672 )
							ret := 0.428571
						if( bullPower > 0.153672 )
							ret := -0.750000 // sell
	if( bbp > 0.040925 )
		if( bbp <= 0.069637 )
			if( bbm <= 0.111937 )
				if( bbm <= 0.106671 )
					if( bbp <= 0.064577 )
						if( bullPower <= 0.021139 )
							ret := -0.521739
						if( bullPower > 0.021139 )
							ret := -0.060367
					if( bbp > 0.064577 )
						if( bullPower <= 0.067316 )
							ret := 0.019011
						if( bullPower > 0.067316 )
							ret := 0.394737
				if( bbm > 0.106671 )
					if( bbm <= 0.10995 )
						if( bbp <= 0.044389 )
							ret := 1.000000 // buy
						if( bbp > 0.044389 )
							ret := -0.588235
					if( bbm > 0.10995 )
						if( bbp <= 0.064534 )
							ret := -0.846154 // sell
						if( bbp > 0.064534 )
							ret := -0.461538
			if( bbm > 0.111937 )
				if( bbp <= 0.057045 )
					if( bullPower <= 0.133355 )
						if( bullPower <= 0.101633 )
							ret := -0.084746
						if( bullPower > 0.101633 )
							ret := 0.703704 // buy
					if( bullPower > 0.133355 )
						if( bearPower <= -0.09573 )
							ret := -0.222222
						if( bearPower > -0.09573 )
							ret := -0.894737 // sell
				if( bbp > 0.057045 )
					if( bbp <= 0.061042 )
						if( bullPower <= 0.087109 )
							ret := 1.000000 // buy
						if( bullPower > 0.087109 )
							ret := 0.333333
					if( bbp > 0.061042 )
						if( bullPower <= 0.119267 )
							ret := 0.784946 // buy
						if( bullPower > 0.119267 )
							ret := 0.500000
		if( bbp > 0.069637 )
			if( bearPower <= -0.111178 )
				if( bullPower <= 0.758757 )
					if( bearPower <= -0.228902 )
						ret := 0.000000
					if( bearPower > -0.228902 )
						if( bbp <= 0.211301 )
							ret := 0.605263
						if( bbp > 0.211301 )
							ret := 0.916667 // buy
				if( bullPower > 0.758757 )
					ret := -1.000000 // sell
			if( bearPower > -0.111178 )
				if( bbp <= 0.331693 )
					if( bbp <= 0.287465 )
						if( bbm <= 0.009976 )
							ret := -0.363757
						if( bbm > 0.009976 )
							ret := -0.052797
					if( bbp > 0.287465 )
						if( bbm <= 0.119315 )
							ret := -0.173804
						if( bbm > 0.119315 )
							ret := -0.645390
				if( bbp > 0.331693 )
					if( bbp <= 0.762147 )
						if( bbp <= 0.672458 )
							ret := 0.002662
						if( bbp > 0.672458 )
							ret := 0.547170
					if( bbp > 0.762147 )
						if( bullPower <= 0.736326 )
							ret := -0.652174
						if( bullPower > 0.736326 )
							ret := 0.008850
	
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
float op_operation = decision_tree_0_LYFT_5Min_90fe07dc(bearPower, bbm, bbp, bullPower, BBPower_Color)

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


