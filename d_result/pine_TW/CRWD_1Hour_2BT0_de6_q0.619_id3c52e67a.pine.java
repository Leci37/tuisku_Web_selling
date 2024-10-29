//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: CRWD_1Hour_2BT0_3c52e67a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_1Hour_2BT0_3c52e67a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_1Hour_3c52e67a(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( ema3 <= 186.118 )
		if( ema1 <= 185.007 )
			if( ema2 <= 48.9605 )
				if( ema3 <= 46.2029 )
					if( ema2 <= 40.6341 )
						if( bullPower <= -1.05946 )
							ret := -0.653846
						if( bullPower > -1.05946 )
							ret := 0.434783
					if( ema2 > 40.6341 )
						if( ema13 <= 3.35424 )
							ret := -0.931034 // sell
						if( ema13 > 3.35424 )
							ret := -0.250000
				if( ema3 > 46.2029 )
					if( ema2 <= 47.4181 )
						if( ema1 <= 46.4406 )
							ret := 0.724138 // buy
						if( ema1 > 46.4406 )
							ret := -0.307692
					if( ema2 > 47.4181 )
						if( ema13 <= -0.46656 )
							ret := 0.340909
						if( ema13 > -0.46656 )
							ret := 0.726776 // buy
			if( ema2 > 48.9605 )
				if( tema <= 51.6329 )
					if( tema <= 49.1075 )
						if( ema1 <= 48.8086 )
							ret := -0.833333 // sell
						if( ema1 > 48.8086 )
							ret := 0.390244
					if( tema > 49.1075 )
						if( ema2 <= 49.1333 )
							ret := -0.062500
						if( ema2 > 49.1333 )
							ret := -0.695035
				if( tema > 51.6329 )
					if( ema13 <= -0.30461 )
						if( bearPower <= -3.03648 )
							ret := 0.100202
						if( bearPower > -3.03648 )
							ret := -0.079779
					if( ema13 > -0.30461 )
						if( bullPower <= 0.920814 )
							ret := 0.187928
						if( bullPower > 0.920814 )
							ret := 0.023538
		if( ema1 > 185.007 )
			if( tema <= 196.58 )
				if( ema12 <= 2.03204 )
					if( bbp <= 4.32436 )
						if( ema12 <= 0.758038 )
							ret := 0.686567
						if( ema12 > 0.758038 )
							ret := 0.152174
					if( bbp > 4.32436 )
						if( ema13 <= 2.57835 )
							ret := 0.125000
						if( ema13 > 2.57835 )
							ret := 0.973684 // buy
				if( ema12 > 2.03204 )
					if( ema12 <= 2.14795 )
						ret := -0.900000 // sell
					if( ema12 > 2.14795 )
						if( bullPower <= 3.05391 )
							ret := 0.888889 // buy
						if( bullPower > 3.05391 )
							ret := 0.044444
			if( tema > 196.58 )
				ret := 1.000000 // buy
	if( ema3 > 186.118 )
		if( bearPower <= -7.26859 )
			if( ema1 <= 218.039 )
				if( ema12 <= -5.79521 )
					ret := -1.000000 // sell
				if( ema12 > -5.79521 )
					if( tema <= 201.876 )
						if( ema13 <= -2.44749 )
							ret := 0.833333 // buy
						if( ema13 > -2.44749 )
							ret := 0.222222
					if( tema > 201.876 )
						if( ema2 <= 212.594 )
							ret := -0.466667
						if( ema2 > 212.594 )
							ret := 0.833333 // buy
			if( ema1 > 218.039 )
				if( bullPower <= -5.44356 )
					if( ema3 <= 323.524 )
						if( ema3 <= 310.288 )
							ret := 0.382353
						if( ema3 > 310.288 )
							ret := -0.411765
					if( ema3 > 323.524 )
						if( tema <= 309.661 )
							ret := 1.000000 // buy
						if( tema > 309.661 )
							ret := 0.375000
				if( bullPower > -5.44356 )
					if( ema1 <= 313.903 )
						if( tema <= 263.033 )
							ret := 0.074074
						if( tema > 263.033 )
							ret := -0.685393
					if( ema1 > 313.903 )
						if( tema <= 334.114 )
							ret := 0.533333
						if( tema > 334.114 )
							ret := -0.285714
		if( bearPower > -7.26859 )
			if( ema13 <= -4.59286 )
				if( ema3 <= 191.346 )
					if( bearPower <= -4.9278 )
						ret := 0.117647
					if( bearPower > -4.9278 )
						if( ema1 <= 183.937 )
							ret := -0.986111 // sell
						if( ema1 > 183.937 )
							ret := -0.777778 // sell
				if( ema3 > 191.346 )
					if( ema1 <= 375.942 )
						if( tema <= 319.374 )
							ret := -0.212860
						if( tema > 319.374 )
							ret := -0.826087 // sell
					if( ema1 > 375.942 )
						ret := 1.000000 // buy
			if( ema13 > -4.59286 )
				if( ema1 <= 193.653 )
					if( ema2 <= 188.176 )
						if( ema3 <= 187.721 )
							ret := -0.077626
						if( ema3 > 187.721 )
							ret := 0.662651
					if( ema2 > 188.176 )
						if( bbm <= 1.85273 )
							ret := -0.265244
						if( bbm > 1.85273 )
							ret := -0.511111
				if( ema1 > 193.653 )
					if( ema3 <= 385.654 )
						if( bullPower <= 16.6446 )
							ret := -0.037771
						if( bullPower > 16.6446 )
							ret := -0.970588 // sell
					if( ema3 > 385.654 )
						if( tema <= 391.603 )
							ret := -0.398230
						if( tema > 391.603 )
							ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_CRWD_1Hour_3c52e67a(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)

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


