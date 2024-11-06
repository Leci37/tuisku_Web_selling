//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: NIO_5Min_1T00_403ee731 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NIO_5Min_1T00_403ee731", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NIO_5Min_403ee731(ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ema12 <= -0.000792 )
		if( tema <= 6.23284 )
			if( tema <= 3.69847 )
				if( tema <= 3.67114 )
					ret := 1.000000 // buy
				if( tema > 3.67114 )
					if( ema12 <= -0.009432 )
						if( ema3 <= 3.72171 )
							ret := 1.000000 // buy
						if( ema3 > 3.72171 )
							ret := 0.888889 // buy
					if( ema12 > -0.009432 )
						if( tema <= 3.68463 )
							ret := 0.095238
						if( tema > 3.68463 )
							if( ema2 <= 3.69791 )
								ret := 1.000000 // buy
							if( ema2 > 3.69791 )
								ret := 0.142857
			if( tema > 3.69847 )
				if( tema <= 3.8971 )
					if( ema13 <= -0.026572 )
						if( ema1 <= 3.81151 )
							if( ema3 <= 3.79015 )
								if( ema2 <= 3.75012 )
									ret := -0.454545
								if( ema2 > 3.75012 )
									ret := -0.761905 // sell
							if( ema3 > 3.79015 )
								if( ema12 <= -0.035967 )
									ret := 0.777778 // buy
								if( ema12 > -0.035967 )
									ret := -0.122642
						if( ema1 > 3.81151 )
							if( ema2 <= 3.96539 )
								if( tema <= 3.84229 )
									ret := -0.578947
								if( tema > 3.84229 )
									ret := -0.794118 // sell
							if( ema2 > 3.96539 )
								ret := 0.272727
					if( ema13 > -0.026572 )
						if( ema1 <= 3.71497 )
							if( ema1 <= 3.7078 )
								ret := -0.277778
							if( ema1 > 3.7078 )
								if( tema <= 3.7131 )
									ret := -0.900000 // sell
								if( tema > 3.7131 )
									ret := -1.000000 // sell
						if( ema1 > 3.71497 )
							if( ema2 <= 3.84697 )
								if( tema <= 3.7166 )
									ret := 0.707317 // buy
								if( tema > 3.7166 )
									ret := -0.096413
							if( ema2 > 3.84697 )
								if( ema1 <= 3.85241 )
									ret := 0.612069
								if( ema1 > 3.85241 )
									ret := 0.062706
				if( tema > 3.8971 )
					if( ema3 <= 6.22521 )
						if( ema2 <= 6.10986 )
							if( ema2 <= 3.93759 )
								if( ema12 <= -0.007621 )
									ret := 0.095238
								if( ema12 > -0.007621 )
									ret := 0.630952
							if( ema2 > 3.93759 )
								if( tema <= 6.06078 )
									ret := 0.084675
								if( tema > 6.06078 )
									ret := 0.392216
						if( ema2 > 6.10986 )
							if( ema12 <= -0.042002 )
								if( ema3 <= 6.19286 )
									ret := -0.400000
								if( ema3 > 6.19286 )
									ret := 0.909091 // buy
							if( ema12 > -0.042002 )
								if( ema3 <= 6.11971 )
									ret := -0.882353 // sell
								if( ema3 > 6.11971 )
									ret := -0.194828
					if( ema3 > 6.22521 )
						if( ema2 <= 6.24109 )
							if( ema13 <= -0.012486 )
								if( ema13 <= -0.01907 )
									ret := 0.708333 // buy
								if( ema13 > -0.01907 )
									ret := -0.037736
							if( ema13 > -0.012486 )
								if( ema13 <= -0.005687 )
									ret := 0.798165 // buy
								if( ema13 > -0.005687 )
									ret := 0.166667
						if( ema2 > 6.24109 )
							if( ema12 <= -0.094392 )
								if( tema <= 6.14393 )
									ret := 0.538462
								if( tema > 6.14393 )
									ret := 1.000000 // buy
							if( ema12 > -0.094392 )
								if( tema <= 6.17202 )
									ret := 0.642857
								if( tema > 6.17202 )
									ret := -0.139130
		if( tema > 6.23284 )
			if( ema13 <= 0.011332 )
				if( ema3 <= 13.8629 )
					if( ema1 <= 13.7071 )
						if( ema3 <= 6.31899 )
							if( ema12 <= -0.01285 )
								if( ema3 <= 6.31043 )
									ret := -0.964286 // sell
								if( ema3 > 6.31043 )
									ret := -0.733333 // sell
							if( ema12 > -0.01285 )
								if( ema3 <= 6.26006 )
									ret := -0.539326
								if( ema3 > 6.26006 )
									ret := -0.207407
						if( ema3 > 6.31899 )
							if( ema13 <= -0.033035 )
								if( ema2 <= 13.2468 )
									ret := -0.042604
								if( ema2 > 13.2468 )
									ret := 0.295455
							if( ema13 > -0.033035 )
								if( ema1 <= 6.31398 )
									ret := 0.775510 // buy
								if( ema1 > 6.31398 )
									ret := 0.017837
					if( ema1 > 13.7071 )
						if( ema2 <= 13.8214 )
							if( ema1 <= 13.7839 )
								ret := 0.722222 // buy
							if( ema1 > 13.7839 )
								ret := 1.000000 // buy
						if( ema2 > 13.8214 )
							ret := 1.000000 // buy
				if( ema3 > 13.8629 )
					if( ema3 <= 15.7531 )
						if( ema13 <= -0.125165 )
							if( ema2 <= 15.2641 )
								if( ema2 <= 14.9347 )
									ret := -0.039062
								if( ema2 > 14.9347 )
									ret := 0.887097 // buy
							if( ema2 > 15.2641 )
								if( ema2 <= 15.4469 )
									ret := -0.925926 // sell
								if( ema2 > 15.4469 )
									ret := -0.083333
						if( ema13 > -0.125165 )
							if( ema2 <= 15.6755 )
								if( ema3 <= 14.9526 )
									ret := -0.220472
								if( ema3 > 14.9526 )
									ret := -0.484211
							if( ema2 > 15.6755 )
								if( ema12 <= -0.015822 )
									ret := 0.823529 // buy
								if( ema12 > -0.015822 )
									ret := 0.523810
					if( ema3 > 15.7531 )
						ret := -1.000000 // sell
			if( ema13 > 0.011332 )
				if( ema1 <= 12.0931 )
					if( tema <= 11.6735 )
						if( ema12 <= -0.011743 )
							ret := 1.000000 // buy
						if( ema12 > -0.011743 )
							if( tema <= 9.22661 )
								if( ema3 <= 8.00176 )
									ret := 0.466667
								if( ema3 > 8.00176 )
									ret := 0.909091 // buy
							if( tema > 9.22661 )
								if( ema1 <= 10.2009 )
									ret := -0.250000
								if( ema1 > 10.2009 )
									ret := 0.606061
					if( tema > 11.6735 )
						ret := 1.000000 // buy
				if( ema1 > 12.0931 )
					if( ema3 <= 14.0464 )
						ret := -0.611111
					if( ema3 > 14.0464 )
						ret := 0.055556
	if( ema12 > -0.000792 )
		if( ema2 <= 15.0083 )
			if( ema13 <= 0.114896 )
				if( ema3 <= 14.0923 )
					if( ema13 <= 0.105629 )
						if( ema1 <= 10.6417 )
							if( ema3 <= 6.35167 )
								if( tema <= 6.03099 )
									ret := -0.035515
								if( tema > 6.03099 )
									ret := -0.162151
							if( ema3 > 6.35167 )
								if( ema1 <= 6.78008 )
									ret := 0.285912
								if( ema1 > 6.78008 )
									ret := 0.002447
						if( ema1 > 10.6417 )
							if( ema2 <= 11.751 )
								if( ema12 <= 0.024965 )
									ret := -0.123848
								if( ema12 > 0.024965 )
									ret := -0.523702
							if( ema2 > 11.751 )
								if( tema <= 12.1802 )
									ret := 0.331492
								if( tema > 12.1802 )
									ret := -0.088417
					if( ema13 > 0.105629 )
						if( ema12 <= 0.060751 )
							if( ema2 <= 5.50398 )
								if( ema2 <= 4.78408 )
									ret := 0.076923
								if( ema2 > 4.78408 )
									ret := 0.897436 // buy
							if( ema2 > 5.50398 )
								if( tema <= 10.6892 )
									ret := 0.120000
								if( tema > 10.6892 )
									ret := 0.580000
						if( ema12 > 0.060751 )
							if( ema12 <= 0.070556 )
								if( ema2 <= 9.09368 )
									ret := -0.530864
								if( ema2 > 9.09368 )
									ret := 0.294118
							if( ema12 > 0.070556 )
								if( ema3 <= 10.6823 )
									ret := 0.676471
								if( ema3 > 10.6823 )
									ret := 0.214286
				if( ema3 > 14.0923 )
					if( ema12 <= 0.019262 )
						if( ema2 <= 14.5547 )
							if( tema <= 14.1935 )
								ret := 0.200000
							if( tema > 14.1935 )
								if( tema <= 14.419 )
									ret := 0.958333 // buy
								if( tema > 14.419 )
									ret := 0.382353
						if( ema2 > 14.5547 )
							if( ema2 <= 14.6137 )
								if( tema <= 14.6066 )
									ret := -0.600000
								if( tema > 14.6066 )
									ret := -1.000000 // sell
							if( ema2 > 14.6137 )
								if( ema2 <= 14.7959 )
									ret := 0.723404 // buy
								if( ema2 > 14.7959 )
									ret := -0.151899
					if( ema12 > 0.019262 )
						if( ema13 <= 0.106728 )
							if( ema13 <= 0.0509 )
								if( ema13 <= 0.036769 )
									ret := 0.769231 // buy
								if( ema13 > 0.036769 )
									ret := 0.940000 // buy
							if( ema13 > 0.0509 )
								if( ema3 <= 14.6995 )
									ret := 0.796875 // buy
								if( ema3 > 14.6995 )
									ret := 0.250000
						if( ema13 > 0.106728 )
							ret := -0.111111
			if( ema13 > 0.114896 )
				if( ema12 <= 0.154237 )
					if( tema <= 9.54559 )
						if( ema12 <= 0.05864 )
							if( ema1 <= 6.52245 )
								ret := 0.875000 // buy
							if( ema1 > 6.52245 )
								if( ema1 <= 8.77585 )
									ret := -0.333333
								if( ema1 > 8.77585 )
									ret := 0.428571
						if( ema12 > 0.05864 )
							if( ema1 <= 4.69597 )
								ret := 0.727273 // buy
							if( ema1 > 4.69597 )
								if( ema12 <= 0.12184 )
									ret := -0.481830
								if( ema12 > 0.12184 )
									ret := -0.111111
					if( tema > 9.54559 )
						if( ema2 <= 14.1438 )
							if( ema2 <= 13.9724 )
								if( tema <= 13.0601 )
									ret := 0.226069
								if( tema > 13.0601 )
									ret := -0.387097
							if( ema2 > 13.9724 )
								if( ema1 <= 14.2017 )
									ret := 1.000000 // buy
								if( ema1 > 14.2017 )
									ret := 0.833333 // buy
						if( ema2 > 14.1438 )
							if( ema1 <= 14.7055 )
								if( ema2 <= 14.3477 )
									ret := -0.500000
								if( ema2 > 14.3477 )
									ret := -0.818182 // sell
							if( ema1 > 14.7055 )
								if( ema1 <= 15.0372 )
									ret := 0.346154
								if( ema1 > 15.0372 )
									ret := -1.000000 // sell
				if( ema12 > 0.154237 )
					if( ema3 <= 6.93031 )
						ret := 0.875000 // buy
					if( ema3 > 6.93031 )
						if( ema13 <= 0.317718 )
							if( ema12 <= 0.178578 )
								if( ema3 <= 10.6144 )
									ret := -1.000000 // sell
								if( ema3 > 10.6144 )
									ret := -0.863636 // sell
							if( ema12 > 0.178578 )
								if( ema2 <= 13.4565 )
									ret := -0.642857
								if( ema2 > 13.4565 )
									ret := -0.733333 // sell
						if( ema13 > 0.317718 )
							if( ema1 <= 8.38027 )
								ret := -1.000000 // sell
							if( ema1 > 8.38027 )
								if( ema2 <= 8.44868 )
									ret := 1.000000 // buy
								if( ema2 > 8.44868 )
									ret := -0.589744
		if( ema2 > 15.0083 )
			if( ema13 <= 0.16869 )
				if( ema2 <= 15.106 )
					if( ema13 <= 0.004276 )
						ret := -0.083333
					if( ema13 > 0.004276 )
						if( ema13 <= 0.017842 )
							if( ema3 <= 15.0935 )
								ret := -0.727273 // sell
							if( ema3 > 15.0935 )
								ret := -1.000000 // sell
						if( ema13 > 0.017842 )
							if( ema12 <= 0.03108 )
								if( ema12 <= 0.020845 )
									ret := -0.846154 // sell
								if( ema12 > 0.020845 )
									ret := 0.100000
							if( ema12 > 0.03108 )
								if( ema2 <= 15.049 )
									ret := -1.000000 // sell
								if( ema2 > 15.049 )
									ret := -0.285714
				if( ema2 > 15.106 )
					if( ema1 <= 15.8407 )
						if( ema12 <= 0.018493 )
							if( ema2 <= 15.4104 )
								if( ema3 <= 15.1756 )
									ret := 0.000000
								if( ema3 > 15.1756 )
									ret := -0.485714
							if( ema2 > 15.4104 )
								if( ema1 <= 15.457 )
									ret := 0.833333 // buy
								if( ema1 > 15.457 )
									ret := 0.172414
						if( ema12 > 0.018493 )
							if( ema3 <= 15.1397 )
								if( ema13 <= 0.084208 )
									ret := 0.727273 // buy
								if( ema13 > 0.084208 )
									ret := -0.555556
							if( ema3 > 15.1397 )
								if( tema <= 15.3362 )
									ret := -0.925926 // sell
								if( tema > 15.3362 )
									ret := -0.362832
					if( ema1 > 15.8407 )
						ret := -1.000000 // sell
			if( ema13 > 0.16869 )
				if( ema12 <= 0.146569 )
					if( ema1 <= 15.4237 )
						if( ema2 <= 15.1149 )
							ret := 0.857143 // buy
						if( ema2 > 15.1149 )
							ret := 1.000000 // buy
					if( ema1 > 15.4237 )
						ret := -0.400000
				if( ema12 > 0.146569 )
					ret := -0.562500
	
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
float op_operation = decision_tree_0_NIO_5Min_403ee731(ema12, ema3, ema13, tema, ema1, ema2)

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


