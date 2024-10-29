//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: BNBUSDT_1Hour_2BT0_bb00f02e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BNBUSDT_1Hour_2BT0_bb00f02e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BNBUSDT_1Hour_bb00f02e(bullPower, bbp, bearPower, bbm, BBPower_Color, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( ema1 <= 586.323 )
		if( ema12 <= -0.027356 )
			if( bbp <= -14.1198 )
				if( ema3 <= 246.204 )
					if( ema13 <= -8.05907 )
						if( bullPower <= -8.71308 )
							ret := 0.000000
						if( bullPower > -8.71308 )
							ret := 1.000000 // buy
					if( ema13 > -8.05907 )
						if( bearPower <= -11.282 )
							ret := 0.700000 // buy
						if( bearPower > -11.282 )
							ret := -0.166667
				if( ema3 > 246.204 )
					if( bbp <= -86.511 )
						if( bullPower <= -18.0077 )
							ret := 0.931818 // buy
						if( bullPower > -18.0077 )
							ret := -1.000000 // sell
					if( bbp > -86.511 )
						if( bullPower <= -20.3386 )
							ret := -0.548387
						if( bullPower > -20.3386 )
							ret := 0.089949
			if( bbp > -14.1198 )
				if( tema <= 9.20711 )
					ret := 1.000000 // buy
				if( tema > 9.20711 )
					if( ema3 <= 311.817 )
						if( bearPower <= -2.70119 )
							ret := 0.059774
						if( bearPower > -2.70119 )
							ret := -0.038854
					if( ema3 > 311.817 )
						if( ema13 <= -5.93766 )
							ret := 0.058428
						if( ema13 > -5.93766 )
							ret := -0.106357
		if( ema12 > -0.027356 )
			if( bullPower <= 0.370239 )
				if( ema3 <= 42.4257 )
					if( ema2 <= 40.0762 )
						if( tema <= 10.2125 )
							ret := 0.892857 // buy
						if( tema > 10.2125 )
							ret := 0.107734
					if( ema2 > 40.0762 )
						if( bearPower <= -0.047341 )
							ret := 0.825688 // buy
						if( bearPower > -0.047341 )
							ret := -0.333333
				if( ema3 > 42.4257 )
					if( tema <= 44.725 )
						if( bearPower <= -0.014571 )
							ret := -0.950820 // sell
						if( bearPower > -0.014571 )
							ret := 1.000000 // buy
					if( tema > 44.725 )
						if( ema3 <= 50.2414 )
							ret := 1.000000 // buy
						if( ema3 > 50.2414 )
							ret := -0.050704
			if( bullPower > 0.370239 )
				if( ema2 <= 50.8008 )
					if( bbm <= 0.289686 )
						if( ema2 <= 11.7736 )
							ret := 0.883721 // buy
						if( ema2 > 11.7736 )
							ret := 0.041806
					if( bbm > 0.289686 )
						if( ema3 <= 22.5726 )
							ret := -0.314060
						if( ema3 > 22.5726 )
							ret := -0.116505
				if( ema2 > 50.8008 )
					if( ema3 <= 130.837 )
						if( bullPower <= 12.7145 )
							ret := 0.654040
						if( bullPower > 12.7145 )
							ret := -0.384615
					if( ema3 > 130.837 )
						if( ema13 <= -0.301272 )
							ret := 0.255501
						if( ema13 > -0.301272 )
							ret := 0.008635
	if( ema1 > 586.323 )
		if( bullPower <= -12.2647 )
			if( ema3 <= 619.995 )
				ret := -0.250000
			if( ema3 > 619.995 )
				if( ema12 <= -8.81046 )
					if( ema1 <= 655.64 )
						if( ema2 <= 612.625 )
							ret := 0.500000
						if( ema2 > 612.625 )
							ret := 0.964286 // buy
					if( ema1 > 655.64 )
						ret := 0.000000
				if( ema12 > -8.81046 )
					ret := 0.000000
		if( bullPower > -12.2647 )
			if( ema3 <= 653.633 )
				if( tema <= 659.827 )
					if( ema2 <= 635.801 )
						if( tema <= 634.544 )
							ret := -0.147941
						if( tema > 634.544 )
							ret := 0.650000
					if( ema2 > 635.801 )
						if( ema2 <= 642.809 )
							ret := -0.742690 // sell
						if( ema2 > 642.809 )
							ret := -0.148148
				if( tema > 659.827 )
					if( bearPower <= 7.26171 )
						if( tema <= 674.606 )
							ret := 0.333333
						if( tema > 674.606 )
							ret := -1.000000 // sell
					if( bearPower > 7.26171 )
						if( ema12 <= 11.8824 )
							ret := 0.830189 // buy
						if( ema12 > 11.8824 )
							ret := -0.400000
			if( ema3 > 653.633 )
				if( ema1 <= 677.914 )
					if( ema12 <= -4.2509 )
						if( bullPower <= -1.19261 )
							ret := 0.230769
						if( bullPower > -1.19261 )
							ret := -1.000000 // sell
					if( ema12 > -4.2509 )
						if( ema13 <= 2.83673 )
							ret := -0.963303 // sell
						if( ema13 > 2.83673 )
							ret := -0.591837
				if( ema1 > 677.914 )
					if( bullPower <= 2.78008 )
						if( bullPower <= 1.74326 )
							ret := -0.065217
						if( bullPower > 1.74326 )
							ret := 0.818182 // buy
					if( bullPower > 2.78008 )
						if( ema3 <= 688.709 )
							ret := 0.352941
						if( ema3 > 688.709 )
							ret := -0.734694 // sell
	
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
float op_operation = decision_tree_0_BNBUSDT_1Hour_bb00f02e(bullPower, bbp, bearPower, bbm, BBPower_Color, ema3, tema, ema2, ema12, ema13, ema1)

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


