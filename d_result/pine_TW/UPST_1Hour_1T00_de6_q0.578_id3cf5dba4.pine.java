//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: UPST_1Hour_1T00_3cf5dba4 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UPST_1Hour_1T00_3cf5dba4", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UPST_1Hour_3cf5dba4(ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( ema12 <= -0.325277 )
		if( ema2 <= 24.2172 )
			if( ema13 <= -0.92117 )
				if( ema12 <= -0.975655 )
					ret := 1.000000 // buy
				if( ema12 > -0.975655 )
					if( ema13 <= -2.03655 )
						ret := -0.750000 // sell
					if( ema13 > -2.03655 )
						if( ema2 <= 23.6892 )
							ret := 0.549020
						if( ema2 > 23.6892 )
							ret := 0.947368 // buy
			if( ema13 > -0.92117 )
				if( ema2 <= 20.5842 )
					if( tema <= 18.0322 )
						if( ema12 <= -0.352721 )
							ret := -0.032258
						if( ema12 > -0.352721 )
							ret := 0.360000
					if( tema > 18.0322 )
						if( ema12 <= -0.433443 )
							ret := -0.230769
						if( ema12 > -0.433443 )
							ret := -0.939394 // sell
				if( ema2 > 20.5842 )
					if( tema <= 20.5447 )
						if( ema1 <= 21.18 )
							ret := 0.977273 // buy
						if( ema1 > 21.18 )
							ret := 0.000000
					if( tema > 20.5447 )
						if( ema2 <= 22.1088 )
							ret := -0.484848
						if( ema2 > 22.1088 )
							ret := 0.235294
		if( ema2 > 24.2172 )
			if( ema3 <= 30.4152 )
				if( ema13 <= -0.56709 )
					if( ema12 <= -0.790718 )
						if( tema <= 27.0691 )
							ret := -0.812500 // sell
						if( tema > 27.0691 )
							ret := 1.000000 // buy
					if( ema12 > -0.790718 )
						if( tema <= 28.2534 )
							ret := -0.177370
						if( tema > 28.2534 )
							ret := -0.771429 // sell
				if( ema13 > -0.56709 )
					if( tema <= 28.3187 )
						if( ema2 <= 27.7192 )
							ret := -0.761905 // sell
						if( ema2 > 27.7192 )
							ret := -1.000000 // sell
					if( tema > 28.3187 )
						ret := 0.000000
			if( ema3 > 30.4152 )
				if( tema <= 31.8026 )
					if( tema <= 31.0252 )
						if( ema3 <= 30.934 )
							ret := 0.657143
						if( ema3 > 30.934 )
							ret := 0.082803
					if( tema > 31.0252 )
						if( ema3 <= 32.7542 )
							ret := 0.947368 // buy
						if( ema3 > 32.7542 )
							ret := 0.560976
				if( tema > 31.8026 )
					if( ema1 <= 44.6188 )
						if( ema3 <= 38.8393 )
							ret := -0.110497
						if( ema3 > 38.8393 )
							ret := -0.540230
					if( ema1 > 44.6188 )
						if( ema1 <= 113.976 )
							ret := -0.007324
						if( ema1 > 113.976 )
							ret := -0.226472
	if( ema12 > -0.325277 )
		if( ema3 <= 13.1432 )
			if( ema3 <= 12.6016 )
				if( tema <= 12.6616 )
					if( ema1 <= 12.1865 )
						ret := 1.000000 // buy
					if( ema1 > 12.1865 )
						if( ema2 <= 12.2494 )
							ret := 0.625000
						if( ema2 > 12.2494 )
							ret := 0.050000
				if( tema > 12.6616 )
					if( ema13 <= 0.320219 )
						if( ema1 <= 12.5761 )
							ret := 0.000000
						if( ema1 > 12.5761 )
							ret := 0.976744 // buy
					if( ema13 > 0.320219 )
						ret := 0.000000
			if( ema3 > 12.6016 )
				if( tema <= 13.4067 )
					if( ema2 <= 12.9808 )
						if( ema3 <= 13.0375 )
							ret := 0.000000
						if( ema3 > 13.0375 )
							ret := 0.428571
					if( ema2 > 12.9808 )
						if( ema12 <= 0.00238 )
							ret := 0.384615
						if( ema12 > 0.00238 )
							ret := 0.837838 // buy
				if( tema > 13.4067 )
					ret := -0.500000
		if( ema3 > 13.1432 )
			if( ema2 <= 22.5819 )
				if( ema13 <= 0.500348 )
					if( tema <= 18.4449 )
						if( ema2 <= 17.4912 )
							ret := -0.064019
						if( ema2 > 17.4912 )
							ret := 0.340000
					if( tema > 18.4449 )
						if( ema3 <= 20.7192 )
							ret := -0.561905
						if( ema3 > 20.7192 )
							ret := -0.042857
				if( ema13 > 0.500348 )
					if( ema1 <= 21.7307 )
						if( ema1 <= 21.433 )
							ret := 0.257692
						if( ema1 > 21.433 )
							ret := 0.904762 // buy
					if( ema1 > 21.7307 )
						if( ema1 <= 22.9294 )
							ret := -0.088608
						if( ema1 > 22.9294 )
							ret := -0.842105 // sell
			if( ema2 > 22.5819 )
				if( tema <= 150.705 )
					if( ema2 <= 131.434 )
						if( ema12 <= 0.985389 )
							ret := 0.047016
						if( ema12 > 0.985389 )
							ret := 0.200348
					if( ema2 > 131.434 )
						if( ema13 <= -0.718596 )
							ret := -0.437500
						if( ema13 > -0.718596 )
							ret := 0.626168
				if( tema > 150.705 )
					if( ema3 <= 145.392 )
						if( ema1 <= 145.367 )
							ret := 0.200000
						if( ema1 > 145.367 )
							ret := -0.907407 // sell
					if( ema3 > 145.392 )
						if( ema12 <= 0.817287 )
							ret := 0.361111
						if( ema12 > 0.817287 )
							ret := -0.141189
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
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
float op_operation = decision_tree_0_UPST_1Hour_3cf5dba4(ema2, ema1, ema12, ema3, ema13, tema)

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


