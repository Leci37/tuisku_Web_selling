//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power
// ID_model: PTON_1Min_1B00_b2d1dcbf Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PTON_1Min_1B00_b2d1dcbf", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PTON_1Min_b2d1dcbf(bearPower, bbm, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6,max_features=sqrt, min_samples_split=10,random_state=843828734)
	if( bearPower <= 0.004516 )
		if( bbm <= 0.001505 )
			if( bearPower <= -0.008092 )
				if( bbp <= -0.040908 )
					if( bbp <= -0.058085 )
						if( bullPower <= -0.039566 )
							ret := 0.895184 // buy
						if( bullPower > -0.039566 )
							ret := 0.736434 // buy
					if( bbp > -0.058085 )
						if( bullPower <= -0.022842 )
							ret := 0.485366
						if( bullPower > -0.022842 )
							ret := 0.767241 // buy
				if( bbp > -0.040908 )
					if( bbp <= -0.028745 )
						if( bbm <= 0.00025 )
							ret := 0.493776
						if( bbm > 0.00025 )
							ret := -0.125000
					if( bbp > -0.028745 )
						if( bullPower <= -0.008403 )
							ret := 0.307636
						if( bullPower > -0.008403 )
							ret := 0.639098
			if( bearPower > -0.008092 )
				if( bearPower <= -0.003102 )
					if( bearPower <= -0.003301 )
						if( bbp <= -0.01615 )
							ret := -0.833333 // sell
						if( bbp > -0.01615 )
							ret := 0.168785
					if( bearPower > -0.003301 )
						if( bearPower <= -0.003158 )
							ret := 0.616279
						if( bearPower > -0.003158 )
							ret := 0.137931
				if( bearPower > -0.003102 )
					if( bullPower <= 0.004467 )
						if( bullPower <= 8.4e-05 )
							ret := 0.041245
						if( bullPower > 8.4e-05 )
							ret := -0.049683
					if( bullPower > 0.004467 )
						if( bbm <= 0.0002 )
							ret := 0.720000 // buy
						if( bbm > 0.0002 )
							ret := 0.000000
		if( bbm > 0.001505 )
			if( bbp <= -0.024952 )
				if( bearPower <= -0.134749 )
					if( bearPower <= -0.193396 )
						if( bearPower <= -0.223933 )
							ret := -0.194444
						if( bearPower > -0.223933 )
							ret := 0.678571
					if( bearPower > -0.193396 )
						if( bbp <= -0.259098 )
							ret := -0.030303
						if( bbp > -0.259098 )
							ret := -0.815534 // sell
				if( bearPower > -0.134749 )
					if( bullPower <= -0.042684 )
						if( bbm <= 0.014053 )
							ret := 0.823529 // buy
						if( bbm > 0.014053 )
							ret := 0.302013
					if( bullPower > -0.042684 )
						if( bearPower <= -0.018373 )
							ret := 0.057508
						if( bearPower > -0.018373 )
							ret := 0.216611
			if( bbp > -0.024952 )
				if( bullPower <= 0.001408 )
					if( bbm <= 0.005039 )
						if( bbp <= -0.002217 )
							ret := -0.077275
						if( bbp > -0.002217 )
							ret := -0.623529
					if( bbm > 0.005039 )
						if( bullPower <= 0.001287 )
							ret := 0.009655
						if( bullPower > 0.001287 )
							ret := -0.429348
				if( bullPower > 0.001408 )
					if( BBPower_Color <= 0.5 )
						if( bbm <= 0.005002 )
							ret := -0.107831
						if( bbm > 0.005002 )
							ret := 0.060862
					if( BBPower_Color > 0.5 )
						if( bullPower <= 0.135548 )
							ret := -0.002475
						if( bullPower > 0.135548 )
							ret := -0.545455
	if( bearPower > 0.004516 )
		if( bearPower <= 0.017521 )
			if( bullPower <= 0.020964 )
				if( bbm <= 0.0001 )
					if( bullPower <= 0.009615 )
						if( bullPower <= 0.009566 )
							ret := -0.177270
						if( bullPower > 0.009566 )
							ret := 0.647059
					if( bullPower > 0.009615 )
						if( bearPower <= 0.016992 )
							ret := -0.309773
						if( bearPower > 0.016992 )
							ret := -0.732558 // sell
				if( bbm > 0.0001 )
					if( bbm <= 0.00999 )
						if( bearPower <= 0.014663 )
							ret := -0.010973
						if( bearPower > 0.014663 )
							ret := -0.484536
					if( bbm > 0.00999 )
						if( bullPower <= 0.017016 )
							ret := 0.000000
						if( bullPower > 0.017016 )
							ret := -0.289782
			if( bullPower > 0.020964 )
				if( bullPower <= 0.068867 )
					if( bullPower <= 0.065253 )
						if( bbp <= 0.032742 )
							ret := -0.203219
						if( bbp > 0.032742 )
							ret := -0.029781
					if( bullPower > 0.065253 )
						if( bbm <= 0.0525 )
							ret := 0.416667
						if( bbm > 0.0525 )
							ret := 0.947368 // buy
				if( bullPower > 0.068867 )
					if( bullPower <= 0.10495 )
						if( bullPower <= 0.098157 )
							ret := -0.774648 // sell
						if( bullPower > 0.098157 )
							ret := -0.300000
					if( bullPower > 0.10495 )
						if( bbp <= 0.212012 )
							ret := 1.000000 // buy
						if( bbp > 0.212012 )
							ret := -1.000000 // sell
		if( bearPower > 0.017521 )
			if( bullPower <= 0.027551 )
				if( bullPower <= 0.021789 )
					if( bbm <= 0.000108 )
						if( bbm <= 3e-06 )
							ret := -0.645485
						if( bbm > 3e-06 )
							ret := -0.920000 // sell
					if( bbm > 0.000108 )
						if( bbm <= 0.000173 )
							ret := 1.000000 // buy
						if( bbm > 0.000173 )
							ret := 0.000000
				if( bullPower > 0.021789 )
					if( bearPower <= 0.022176 )
						if( bearPower <= 0.021815 )
							ret := -0.186567
						if( bearPower > 0.021815 )
							ret := 0.694444
					if( bearPower > 0.022176 )
						if( bbm <= 5e-05 )
							ret := -0.649194
						if( bbm > 5e-05 )
							ret := -0.250000
			if( bullPower > 0.027551 )
				if( bbm <= 0.007314 )
					if( bbp <= 0.061518 )
						if( bbp <= 0.058972 )
							ret := -0.331361
						if( bbp > 0.058972 )
							ret := 0.441860
					if( bbp > 0.061518 )
						if( bearPower <= 0.049798 )
							ret := -0.617450
						if( bearPower > 0.049798 )
							ret := -0.973684 // sell
				if( bbm > 0.007314 )
					if( bullPower <= 0.08159 )
						if( bullPower <= 0.032544 )
							ret := 0.061662
						if( bullPower > 0.032544 )
							ret := -0.158402
					if( bullPower > 0.08159 )
						if( bbp <= 0.373627 )
							ret := 0.140903
						if( bbp > 0.373627 )
							ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_PTON_1Min_b2d1dcbf(bearPower, bbm, bbp, bullPower, BBPower_Color)

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


