//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: ETHUSDT_1Hour_1T00_8b18c1e6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETHUSDT_1Hour_1T00_8b18c1e6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETHUSDT_1Hour_8b18c1e6(ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6,max_features=sqrt, min_samples_split=10,random_state=843828734)
	if( ema12 <= 0.024264 )
		if( tema <= 122.886 )
			if( tema <= 107.615 )
				ret := 1.000000 // buy
			if( tema > 107.615 )
				if( ema2 <= 123.948 )
					if( ema12 <= -1.67717 )
						if( ema1 <= 111.437 )
							ret := 0.000000
						if( ema1 > 111.437 )
							ret := -0.937500 // sell
					if( ema12 > -1.67717 )
						if( tema <= 114.797 )
							ret := 0.684211
						if( tema > 114.797 )
							ret := 0.027027
				if( ema2 > 123.948 )
					if( ema1 <= 122.952 )
						ret := 0.375000
					if( ema1 > 122.952 )
						if( tema <= 122.879 )
							ret := 0.918033 // buy
						if( tema > 122.879 )
							ret := 0.000000
		if( tema > 122.886 )
			if( ema13 <= -10.6929 )
				if( ema2 <= 163.759 )
					ret := -1.000000 // sell
				if( ema2 > 163.759 )
					if( tema <= 1059 )
						if( ema2 <= 1041.58 )
							ret := 0.164456
						if( ema2 > 1041.58 )
							ret := 0.638095
					if( tema > 1059 )
						if( ema1 <= 1721.86 )
							ret := -0.110023
						if( ema1 > 1721.86 )
							ret := 0.009148
			if( ema13 > -10.6929 )
				if( ema2 <= 3565.63 )
					if( ema2 <= 226.653 )
						if( ema12 <= -4.78376 )
							ret := -0.973684 // sell
						if( ema12 > -4.78376 )
							ret := 0.009785
					if( ema2 > 226.653 )
						if( ema1 <= 271.517 )
							ret := -0.192748
						if( ema1 > 271.517 )
							ret := -0.050507
				if( ema2 > 3565.63 )
					if( tema <= 3672.02 )
						if( ema2 <= 3572.95 )
							ret := -0.958333 // sell
						if( ema2 > 3572.95 )
							ret := -0.646154
					if( tema > 3672.02 )
						if( tema <= 4341.18 )
							ret := -0.138614
						if( tema > 4341.18 )
							ret := -0.600000
	if( ema12 > 0.024264 )
		if( ema1 <= 4191.15 )
			if( ema3 <= 1186.74 )
				if( ema2 <= 1102.85 )
					if( ema2 <= 1057.52 )
						if( tema <= 749.409 )
							ret := 0.076412
						if( tema > 749.409 )
							ret := 0.399317
					if( ema2 > 1057.52 )
						if( tema <= 1131.56 )
							ret := -0.054264
						if( tema > 1131.56 )
							ret := -0.963636 // sell
				if( ema2 > 1102.85 )
					if( ema13 <= 21.2386 )
						if( ema2 <= 1178.88 )
							ret := 0.691667
						if( ema2 > 1178.88 )
							ret := 0.253731
					if( ema13 > 21.2386 )
						if( ema3 <= 1117.1 )
							ret := 0.508475
						if( ema3 > 1117.1 )
							ret := -0.139303
			if( ema3 > 1186.74 )
				if( ema2 <= 1241.47 )
					if( ema1 <= 1253.06 )
						if( ema2 <= 1219.56 )
							ret := -0.161058
						if( ema2 > 1219.56 )
							ret := -0.609589
					if( ema1 > 1253.06 )
						if( ema2 <= 1228.9 )
							ret := -0.500000
						if( ema2 > 1228.9 )
							ret := 0.965517 // buy
				if( ema2 > 1241.47 )
					if( ema1 <= 1556.74 )
						if( ema2 <= 1411.67 )
							ret := 0.017928
						if( ema2 > 1411.67 )
							ret := 0.376271
					if( ema1 > 1556.74 )
						if( tema <= 4158.44 )
							ret := 0.004233
						if( tema > 4158.44 )
							ret := 0.639535
		if( ema1 > 4191.15 )
			if( ema13 <= 14.4378 )
				if( ema3 <= 4255.2 )
					if( ema1 <= 4210.14 )
						if( ema12 <= 3.06134 )
							ret := 0.000000
						if( ema12 > 3.06134 )
							ret := -0.884615 // sell
					if( ema1 > 4210.14 )
						ret := -1.000000 // sell
				if( ema3 > 4255.2 )
					if( ema3 <= 4322.75 )
						if( ema12 <= 4.05629 )
							ret := 0.666667
						if( ema12 > 4.05629 )
							ret := 0.000000
					if( ema3 > 4322.75 )
						if( ema3 <= 4368.82 )
							ret := -0.937500 // sell
						if( ema3 > 4368.82 )
							ret := -0.346154
			if( ema13 > 14.4378 )
				if( ema13 <= 72.4663 )
					if( ema2 <= 4735.43 )
						if( ema1 <= 4715.3 )
							ret := -0.187500
						if( ema1 > 4715.3 )
							ret := 0.500000
					if( ema2 > 4735.43 )
						if( ema2 <= 4771.67 )
							ret := -0.886792 // sell
						if( ema2 > 4771.67 )
							ret := 0.000000
				if( ema13 > 72.4663 )
					if( ema1 <= 4561.52 )
						if( tema <= 4249.1 )
							ret := -1.000000 // sell
						if( tema > 4249.1 )
							ret := -0.025000
					if( ema1 > 4561.52 )
						if( ema1 <= 4667.33 )
							ret := 0.880000 // buy
						if( ema1 > 4667.33 )
							ret := -0.400000
	
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
float op_operation = decision_tree_0_ETHUSDT_1Hour_8b18c1e6(ema12, ema3, ema13, tema, ema1, ema2)

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


