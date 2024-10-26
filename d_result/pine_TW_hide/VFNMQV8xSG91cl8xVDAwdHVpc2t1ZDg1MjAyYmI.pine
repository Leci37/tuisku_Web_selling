//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: TSLA_1Hour_1T00_d85202bb Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TSLA_1Hour_1T00_d85202bb", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TSLA_1Hour_d85202bb(ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( ema12 <= 1.7171 )
		if( ema12 <= -0.701828 )
			if( ema13 <= -365.292 )
				ret := 1.000000 // buy
			if( ema13 > -365.292 )
				if( ema3 <= 112.134 )
					ret := 1.000000 // buy
				if( ema3 > 112.134 )
					if( ema2 <= 153.443 )
						if( tema <= 126.042 )
							ret := -0.250000
						if( tema > 126.042 )
							ret := -0.659574
					if( ema2 > 153.443 )
						if( tema <= 153.756 )
							ret := 0.765957 // buy
						if( tema > 153.756 )
							ret := -0.101548
		if( ema12 > -0.701828 )
			if( ema2 <= 171.423 )
				if( tema <= 164.78 )
					if( ema12 <= 0.487061 )
						if( ema3 <= 112.991 )
							ret := -0.661017
						if( ema3 > 112.991 )
							ret := -0.124675
					if( ema12 > 0.487061 )
						if( ema1 <= 162.786 )
							ret := 0.400000
						if( ema1 > 162.786 )
							ret := -0.818182 // sell
				if( tema > 164.78 )
					if( tema <= 170.462 )
						if( ema3 <= 171.716 )
							ret := 0.666667
						if( ema3 > 171.716 )
							ret := -0.285714
					if( tema > 170.462 )
						if( ema1 <= 171.705 )
							ret := -0.162500
						if( ema1 > 171.705 )
							ret := 0.727273 // buy
			if( ema2 > 171.423 )
				if( ema2 <= 194.989 )
					if( ema1 <= 175.985 )
						if( ema1 <= 174.327 )
							ret := -0.202290
						if( ema1 > 174.327 )
							ret := 0.490196
					if( ema1 > 175.985 )
						if( ema3 <= 178.087 )
							ret := -0.383838
						if( ema3 > 178.087 )
							ret := -0.122340
				if( ema2 > 194.989 )
					if( ema1 <= 198.965 )
						if( ema13 <= 1.36937 )
							ret := 0.504717
						if( ema13 > 1.36937 )
							ret := -0.212500
					if( ema1 > 198.965 )
						if( ema13 <= -5.12655 )
							ret := -0.465347
						if( ema13 > -5.12655 )
							ret := -0.002551
	if( ema12 > 1.7171 )
		if( ema1 <= 182.928 )
			if( ema13 <= 4.46292 )
				if( ema1 <= 160.506 )
					if( ema13 <= 3.57429 )
						ret := 1.000000 // buy
					if( ema13 > 3.57429 )
						if( ema1 <= 118.59 )
							ret := 0.000000
						if( ema1 > 118.59 )
							ret := 0.847826 // buy
				if( ema1 > 160.506 )
					if( tema <= 177.774 )
						if( ema2 <= 166.643 )
							ret := 0.517241
						if( ema2 > 166.643 )
							ret := -0.281250
					if( tema > 177.774 )
						if( ema12 <= 2.47558 )
							ret := 0.906977 // buy
						if( ema12 > 2.47558 )
							ret := 0.411765
			if( ema13 > 4.46292 )
				if( ema1 <= 119.194 )
					ret := -1.000000 // sell
				if( ema1 > 119.194 )
					if( tema <= 179.496 )
						if( tema <= 174.022 )
							ret := 0.381443
						if( tema > 174.022 )
							ret := -0.840000 // sell
					if( tema > 179.496 )
						if( ema3 <= 172.889 )
							ret := 1.000000 // buy
						if( ema3 > 172.889 )
							ret := 0.352941
		if( ema1 > 182.928 )
			if( ema12 <= 5.65387 )
				if( ema2 <= 814.43 )
					if( ema3 <= 549.746 )
						if( ema1 <= 512.088 )
							ret := 0.088720
						if( ema1 > 512.088 )
							ret := -0.758065 // sell
					if( ema3 > 549.746 )
						if( ema1 <= 734.657 )
							ret := 0.312303
						if( ema1 > 734.657 )
							ret := 0.024948
				if( ema2 > 814.43 )
					if( ema13 <= -2.67731 )
						if( ema1 <= 960.267 )
							ret := -1.000000 // sell
						if( ema1 > 960.267 )
							ret := 0.850000 // buy
					if( ema13 > -2.67731 )
						if( ema13 <= 6.63961 )
							ret := -0.288306
						if( ema13 > 6.63961 )
							ret := -0.024390
			if( ema12 > 5.65387 )
				if( ema3 <= 820.415 )
					if( ema1 <= 677.415 )
						if( tema <= 390.939 )
							ret := -0.246032
						if( tema > 390.939 )
							ret := 0.269723
					if( ema1 > 677.415 )
						if( ema1 <= 692.427 )
							ret := -0.695652
						if( ema1 > 692.427 )
							ret := 0.045036
				if( ema3 > 820.415 )
					if( tema <= 913.345 )
						if( ema1 <= 855.981 )
							ret := 0.828125 // buy
						if( ema1 > 855.981 )
							ret := 0.442708
					if( tema > 913.345 )
						if( ema2 <= 893.726 )
							ret := -0.772727 // sell
						if( ema2 > 893.726 )
							ret := 0.214078
	
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
float op_operation = decision_tree_0_TSLA_1Hour_d85202bb(ema2, ema1, ema12, ema3, ema13, tema)

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


