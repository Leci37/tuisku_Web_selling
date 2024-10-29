//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: ADSK_5Min_1T00_a5edd47a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADSK_5Min_1T00_a5edd47a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADSK_5Min_a5edd47a(ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( ema3 <= 259.763 )
		if( ema3 <= 258.961 )
			if( ema3 <= 202.886 )
				if( ema12 <= 0.461374 )
					if( tema <= 203.243 )
						if( tema <= 189.782 )
							ret := 0.714286 // buy
						if( tema > 189.782 )
							ret := 0.087798
					if( tema > 203.243 )
						if( ema3 <= 202.731 )
							ret := 0.746753 // buy
						if( ema3 > 202.731 )
							ret := -0.190476
				if( ema12 > 0.461374 )
					if( tema <= 199.913 )
						if( ema2 <= 194.641 )
							ret := 0.089286
						if( ema2 > 194.641 )
							ret := -0.567568
					if( tema > 199.913 )
						if( ema3 <= 199.268 )
							ret := 0.595238
						if( ema3 > 199.268 )
							ret := -0.212766
			if( ema3 > 202.886 )
				if( tema <= 204.359 )
					if( ema1 <= 202.181 )
						if( ema1 <= 201.586 )
							ret := 0.928571 // buy
						if( ema1 > 201.586 )
							ret := 0.351351
					if( ema1 > 202.181 )
						if( ema3 <= 204.747 )
							ret := -0.194222
						if( ema3 > 204.747 )
							ret := -0.455331
				if( tema > 204.359 )
					if( ema1 <= 204.602 )
						if( ema3 <= 203.366 )
							ret := 0.853333 // buy
						if( ema3 > 203.366 )
							ret := 0.386861
					if( ema1 > 204.602 )
						if( ema2 <= 221.602 )
							ret := -0.036908
						if( ema2 > 221.602 )
							ret := 0.036003
		if( ema3 > 258.961 )
			if( ema3 <= 259.379 )
				if( ema1 <= 260.987 )
					if( ema2 <= 258.77 )
						if( ema2 <= 258.729 )
							ret := 0.277778
						if( ema2 > 258.729 )
							ret := -1.000000 // sell
					if( ema2 > 258.77 )
						if( ema1 <= 259.79 )
							ret := 0.783951 // buy
						if( ema1 > 259.79 )
							ret := 0.479167
				if( ema1 > 260.987 )
					ret := -1.000000 // sell
			if( ema3 > 259.379 )
				if( ema12 <= 0.426239 )
					if( ema1 <= 259.873 )
						if( ema3 <= 259.389 )
							ret := -1.000000 // sell
						if( ema3 > 259.389 )
							ret := 0.163636
					if( ema1 > 259.873 )
						if( tema <= 260.099 )
							ret := -1.000000 // sell
						if( tema > 260.099 )
							ret := -0.250000
				if( ema12 > 0.426239 )
					if( ema3 <= 259.402 )
						ret := 0.000000
					if( ema3 > 259.402 )
						if( ema12 <= 0.457663 )
							ret := 0.500000
						if( ema12 > 0.457663 )
							ret := 1.000000 // buy
	if( ema3 > 259.763 )
		if( ema13 <= -0.459415 )
			if( ema3 <= 264.543 )
				if( ema13 <= -1.52446 )
					if( ema1 <= 259.831 )
						ret := -0.333333
					if( ema1 > 259.831 )
						if( ema2 <= 261.458 )
							ret := 1.000000 // buy
						if( ema2 > 261.458 )
							ret := 0.826087 // buy
				if( ema13 > -1.52446 )
					if( tema <= 262.533 )
						if( ema12 <= -0.512481 )
							ret := -0.704142 // sell
						if( ema12 > -0.512481 )
							ret := -0.414773
					if( tema > 262.533 )
						if( ema1 <= 263.747 )
							ret := -1.000000 // sell
						if( ema1 > 263.747 )
							ret := -0.400000
			if( ema3 > 264.543 )
				if( ema12 <= -0.712048 )
					if( tema <= 262.831 )
						ret := 0.444444
					if( tema > 262.831 )
						if( ema13 <= -1.1168 )
							ret := -0.861314 // sell
						if( ema13 > -1.1168 )
							ret := 1.000000 // buy
				if( ema12 > -0.712048 )
					if( ema12 <= -0.401857 )
						if( tema <= 264.366 )
							ret := 0.634146
						if( tema > 264.366 )
							ret := 0.236994
					if( ema12 > -0.401857 )
						if( ema2 <= 264.926 )
							ret := 0.476190
						if( ema2 > 264.926 )
							ret := -0.358382
		if( ema13 > -0.459415 )
			if( ema2 <= 283.094 )
				if( ema3 <= 260.57 )
					if( tema <= 262.008 )
						if( ema2 <= 260.551 )
							ret := -0.230159
						if( ema2 > 260.551 )
							ret := -0.786885 // sell
					if( tema > 262.008 )
						if( ema3 <= 260.133 )
							ret := 0.812500 // buy
						if( ema3 > 260.133 )
							ret := -0.166667
				if( ema3 > 260.57 )
					if( tema <= 259.869 )
						if( ema3 <= 260.675 )
							ret := 1.000000 // buy
						if( ema3 > 260.675 )
							ret := 0.857143 // buy
					if( tema > 259.869 )
						if( ema13 <= 1.23327 )
							ret := -0.019342
						if( ema13 > 1.23327 )
							ret := -0.265252
			if( ema2 > 283.094 )
				if( ema1 <= 284.126 )
					if( ema1 <= 283.489 )
						ret := 0.833333 // buy
					if( ema1 > 283.489 )
						ret := 1.000000 // buy
				if( ema1 > 284.126 )
					if( tema <= 284.564 )
						ret := 1.000000 // buy
					if( tema > 284.564 )
						if( ema3 <= 283.534 )
							ret := -1.000000 // sell
						if( ema3 > 283.534 )
							ret := 0.064516
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_ADSK_5Min_a5edd47a(ema3, tema, ema2, ema12, ema13, ema1)

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


