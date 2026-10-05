//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: ZI_1Hour_1T00_2b07b0de Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ZI_1Hour_1T00_2b07b0de", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ZI_1Hour_2b07b0de(ema2, tema, ema12, ema3, ema1, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( tema <= 42.6554 )
		if( ema2 <= 40.0406 )
			if( tema <= 9.82904 )
				if( ema13 <= -0.541644 )
					if( tema <= 8.27961 )
						ret := 0.000000
					if( tema > 8.27961 )
						if( ema13 <= -0.810877 )
							ret := 0.000000
						if( ema13 > -0.810877 )
							ret := -1.000000 // sell
				if( ema13 > -0.541644 )
					if( ema13 <= 0.102602 )
						if( ema1 <= 9.61223 )
							ret := 0.777778 // buy
						if( ema1 > 9.61223 )
							ret := 0.311111
					if( ema13 > 0.102602 )
						if( ema1 <= 9.16391 )
							ret := 0.133333
						if( ema1 > 9.16391 )
							ret := -0.390244
			if( tema > 9.82904 )
				if( ema12 <= -1.09449 )
					if( ema2 <= 37.3809 )
						if( ema2 <= 35.6273 )
							ret := -0.536585
						if( ema2 > 35.6273 )
							ret := -0.942308 // sell
					if( ema2 > 37.3809 )
						if( ema13 <= -2.47667 )
							ret := -0.250000
						if( ema13 > -2.47667 )
							ret := 0.733333 // buy
				if( ema12 > -1.09449 )
					if( ema2 <= 18.7119 )
						if( tema <= 16.0723 )
							ret := 0.023519
						if( tema > 16.0723 )
							ret := -0.221626
					if( ema2 > 18.7119 )
						if( ema3 <= 37.9258 )
							ret := 0.107622
						if( ema3 > 37.9258 )
							ret := -0.174520
		if( ema2 > 40.0406 )
			if( ema13 <= -1.00663 )
				if( ema13 <= -2.20623 )
					if( ema3 <= 43.8247 )
						ret := 0.600000
					if( ema3 > 43.8247 )
						if( tema <= 41.0428 )
							ret := -0.700000 // sell
						if( tema > 41.0428 )
							ret := 0.000000
				if( ema13 > -2.20623 )
					if( ema12 <= -0.423085 )
						if( ema1 <= 39.3354 )
							ret := -1.000000 // sell
						if( ema1 > 39.3354 )
							ret := 0.684444
					if( ema12 > -0.423085 )
						ret := -0.600000
			if( ema13 > -1.00663 )
				if( ema3 <= 40.7321 )
					if( ema13 <= 0.462959 )
						if( ema12 <= -0.447357 )
							ret := -1.000000 // sell
						if( ema12 > -0.447357 )
							ret := 0.691011
					if( ema13 > 0.462959 )
						if( ema1 <= 41.029 )
							ret := -0.553191
						if( ema1 > 41.029 )
							ret := 0.524590
				if( ema3 > 40.7321 )
					if( ema13 <= -0.405287 )
						if( ema3 <= 41.4559 )
							ret := -0.469388
						if( ema3 > 41.4559 )
							ret := -0.080357
					if( ema13 > -0.405287 )
						if( ema3 <= 42.5061 )
							ret := 0.119891
						if( ema3 > 42.5061 )
							ret := 0.662921
	if( tema > 42.6554 )
		if( ema3 <= 56.937 )
			if( ema1 <= 54.7337 )
				if( ema3 <= 46.9687 )
					if( ema12 <= -0.364987 )
						if( ema1 <= 43.9077 )
							ret := -0.416667
						if( ema1 > 43.9077 )
							ret := 0.282353
					if( ema12 > -0.364987 )
						if( ema13 <= -0.337091 )
							ret := -0.547718
						if( ema13 > -0.337091 )
							ret := -0.118267
				if( ema3 > 46.9687 )
					if( ema1 <= 50.3363 )
						if( ema2 <= 49.1559 )
							ret := 0.022364
						if( ema2 > 49.1559 )
							ret := 0.333973
					if( ema1 > 50.3363 )
						if( ema1 <= 53.5223 )
							ret := -0.228484
						if( ema1 > 53.5223 )
							ret := 0.156658
			if( ema1 > 54.7337 )
				if( ema2 <= 56.9172 )
					if( ema13 <= 1.27549 )
						if( ema13 <= -0.424974 )
							ret := 0.016393
						if( ema13 > -0.424974 )
							ret := -0.545213
					if( ema13 > 1.27549 )
						if( ema12 <= 0.665199 )
							ret := 0.833333 // buy
						if( ema12 > 0.665199 )
							ret := -0.166667
				if( ema2 > 56.9172 )
					if( ema1 <= 57.8672 )
						ret := -1.000000 // sell
					if( ema1 > 57.8672 )
						if( tema <= 58.961 )
							ret := 0.000000
						if( tema > 58.961 )
							ret := -1.000000 // sell
		if( ema3 > 56.937 )
			if( ema13 <= 0.259901 )
				if( tema <= 61.3506 )
					if( ema2 <= 56.8675 )
						if( ema2 <= 56.615 )
							ret := 0.400000
						if( ema2 > 56.615 )
							ret := 1.000000 // buy
					if( ema2 > 56.8675 )
						if( ema12 <= -0.845135 )
							ret := 0.466019
						if( ema12 > -0.845135 )
							ret := 0.032491
				if( tema > 61.3506 )
					if( tema <= 64.3419 )
						if( ema3 <= 64.4153 )
							ret := -0.403141
						if( ema3 > 64.4153 )
							ret := -0.666667
					if( tema > 64.3419 )
						if( ema3 <= 66.194 )
							ret := 0.555556
						if( ema3 > 66.194 )
							ret := -0.326613
			if( ema13 > 0.259901 )
				if( ema13 <= 1.92521 )
					if( tema <= 59.9135 )
						if( ema13 <= 0.63037 )
							ret := -0.052632
						if( ema13 > 0.63037 )
							ret := -0.718750 // sell
					if( tema > 59.9135 )
						if( ema2 <= 59.3529 )
							ret := 0.972222 // buy
						if( ema2 > 59.3529 )
							ret := 0.259677
				if( ema13 > 1.92521 )
					if( ema2 <= 62.8982 )
						if( ema1 <= 60.644 )
							ret := -0.666667
						if( ema1 > 60.644 )
							ret := 0.000000
					if( ema2 > 62.8982 )
						if( tema <= 66.1514 )
							ret := -1.000000 // sell
						if( tema > 66.1514 )
							ret := -0.777778 // sell
	
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
float op_operation = decision_tree_0_ZI_1Hour_2b07b0de(ema2, tema, ema12, ema3, ema1, ema13)

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


