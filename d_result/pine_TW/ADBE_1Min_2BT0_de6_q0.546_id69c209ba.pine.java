//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: ADBE_1Min_2BT0_69c209ba Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADBE_1Min_2BT0_69c209ba", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADBE_1Min_69c209ba(bullPower, bbp, bearPower, bbm, BBPower_Color, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( bullPower <= -1.54092 )
		if( ema13 <= -1.56129 )
			if( bullPower <= -2.27612 )
				if( bullPower <= -11.3704 )
					if( ema12 <= -12.4554 )
						ret := 0.666667
					if( ema12 > -12.4554 )
						ret := -1.000000 // sell
				if( bullPower > -11.3704 )
					if( tema <= 568.558 )
						if( bearPower <= -3.70472 )
							ret := 0.853659 // buy
						if( bearPower > -3.70472 )
							ret := 0.526882
					if( tema > 568.558 )
						if( ema13 <= -2.49749 )
							ret := -1.000000 // sell
						if( ema13 > -2.49749 )
							ret := 0.777778 // buy
			if( bullPower > -2.27612 )
				if( ema1 <= 529.686 )
					if( bearPower <= -2.1634 )
						if( ema2 <= 469.772 )
							ret := -0.107143
						if( ema2 > 469.772 )
							ret := 0.750000 // buy
					if( bearPower > -2.1634 )
						if( tema <= 462.454 )
							ret := 0.333333
						if( tema > 462.454 )
							ret := -0.828571 // sell
				if( ema1 > 529.686 )
					if( bearPower <= -2.25177 )
						if( ema1 <= 533.605 )
							ret := -0.931034 // sell
						if( ema1 > 533.605 )
							ret := -0.256757
					if( bearPower > -2.25177 )
						if( bbm <= 0.537612 )
							ret := 0.944444 // buy
						if( bbm > 0.537612 )
							ret := -0.600000
		if( ema13 > -1.56129 )
			if( ema13 <= -1.13173 )
				if( ema3 <= 553.989 )
					ret := 1.000000 // buy
				if( ema3 > 553.989 )
					if( tema <= 561.248 )
						ret := 0.142857
					if( tema > 561.248 )
						ret := 1.000000 // buy
			if( ema13 > -1.13173 )
				if( ema12 <= -0.593659 )
					if( tema <= 516.817 )
						if( ema3 <= 477.066 )
							ret := 0.923077 // buy
						if( ema3 > 477.066 )
							ret := -0.590909
					if( tema > 516.817 )
						if( ema2 <= 559.54 )
							ret := 0.862069 // buy
						if( ema2 > 559.54 )
							ret := 0.166667
				if( ema12 > -0.593659 )
					if( bullPower <= -1.54438 )
						if( ema12 <= -0.41837 )
							ret := 0.763158 // buy
						if( ema12 > -0.41837 )
							ret := 1.000000 // buy
					if( bullPower > -1.54438 )
						ret := -0.333333
	if( bullPower > -1.54092 )
		if( ema2 <= 576.394 )
			if( ema1 <= 548.697 )
				if( ema2 <= 548.074 )
					if( ema3 <= 438.947 )
						if( bbp <= -0.741447 )
							ret := 0.608696
						if( bbp > -0.741447 )
							ret := 0.104369
					if( ema3 > 438.947 )
						if( bearPower <= -1.35667 )
							ret := 0.141528
						if( bearPower > -1.35667 )
							ret := -0.024780
				if( ema2 > 548.074 )
					if( ema2 <= 548.403 )
						if( bbm <= 0.595 )
							ret := -0.821053 // sell
						if( bbm > 0.595 )
							ret := 0.000000
					if( ema2 > 548.403 )
						if( ema13 <= -0.21432 )
							ret := -0.571429
						if( ema13 > -0.21432 )
							ret := 0.555556
			if( ema1 > 548.697 )
				if( ema1 <= 550.918 )
					if( bbp <= 3.38387 )
						if( bbm <= 1.61518 )
							ret := 0.651099
						if( bbm > 1.61518 )
							ret := -0.210526
					if( bbp > 3.38387 )
						ret := -1.000000 // sell
				if( ema1 > 550.918 )
					if( bullPower <= 3.35445 )
						if( bullPower <= 1.87853 )
							ret := 0.019380
						if( bullPower > 1.87853 )
							ret := 0.345622
					if( bullPower > 3.35445 )
						if( ema3 <= 551.647 )
							ret := 0.375000
						if( ema3 > 551.647 )
							ret := -0.651786
		if( ema2 > 576.394 )
			if( ema3 <= 581.572 )
				if( ema3 <= 578.744 )
					if( ema1 <= 578.398 )
						if( tema <= 578.206 )
							ret := -0.209091
						if( tema > 578.206 )
							ret := -0.615385
					if( ema1 > 578.398 )
						if( ema1 <= 582.685 )
							ret := 0.333333
						if( ema1 > 582.685 )
							ret := -1.000000 // sell
				if( ema3 > 578.744 )
					if( ema12 <= -0.561493 )
						ret := 0.833333 // buy
					if( ema12 > -0.561493 )
						if( ema13 <= 0.68107 )
							ret := -0.688525
						if( ema13 > 0.68107 )
							ret := -0.254237
			if( ema3 > 581.572 )
				if( BBPower_Color <= 0.5 )
					if( bbm <= 0.312891 )
						if( tema <= 581.146 )
							ret := 1.000000 // buy
						if( tema > 581.146 )
							ret := -0.071429
					if( bbm > 0.312891 )
						if( ema2 <= 581.252 )
							ret := -1.000000 // sell
						if( ema2 > 581.252 )
							ret := 0.765766 // buy
				if( BBPower_Color > 0.5 )
					if( ema1 <= 583.965 )
						if( bearPower <= 0.227152 )
							ret := 0.276923
						if( bearPower > 0.227152 )
							ret := -0.558824
					if( ema1 > 583.965 )
						if( tema <= 584.333 )
							ret := 0.000000
						if( tema > 584.333 )
							ret := -0.802469 // sell
	
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
float op_operation = decision_tree_0_ADBE_1Min_69c209ba(bullPower, bbp, bearPower, bbm, BBPower_Color, ema3, tema, ema2, ema12, ema13, ema1)

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


