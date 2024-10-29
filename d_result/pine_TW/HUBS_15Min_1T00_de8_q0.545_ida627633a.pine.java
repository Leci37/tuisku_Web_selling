//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: HUBS_15Min_1T00_a627633a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_HUBS_15Min_1T00_a627633a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_HUBS_15Min_a627633a(ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ema13 <= -12.2373 )
		if( tema <= 545.209 )
			if( tema <= 531.044 )
				if( tema <= 508.329 )
					if( ema12 <= -10.1302 )
						if( ema3 <= 533.591 )
							if( ema2 <= 446.995 )
								if( ema2 <= 345.651 )
									ret := 0.818182 // buy
								if( ema2 > 345.651 )
									ret := 0.444444
							if( ema2 > 446.995 )
								if( tema <= 465.083 )
									ret := 1.000000 // buy
								if( tema > 465.083 )
									ret := 0.750000 // buy
						if( ema3 > 533.591 )
							ret := 0.375000
					if( ema12 > -10.1302 )
						if( ema1 <= 494.781 )
							if( ema2 <= 493.661 )
								if( ema3 <= 451.058 )
									ret := 0.012195
								if( ema3 > 451.058 )
									ret := 0.617647
							if( ema2 > 493.661 )
								if( ema12 <= -7.32996 )
									ret := -1.000000 // sell
								if( ema12 > -7.32996 )
									ret := -0.666667
						if( ema1 > 494.781 )
							if( ema1 <= 512.525 )
								if( ema2 <= 509.372 )
									ret := 0.692308
								if( ema2 > 509.372 )
									ret := 0.960000 // buy
							if( ema1 > 512.525 )
								ret := 0.181818
				if( tema > 508.329 )
					ret := -0.555556
			if( tema > 531.044 )
				if( ema2 <= 556.389 )
					if( ema12 <= -7.02276 )
						ret := 0.900000 // buy
					if( ema12 > -7.02276 )
						ret := 1.000000 // buy
				if( ema2 > 556.389 )
					ret := 0.500000
		if( tema > 545.209 )
			if( ema1 <= 558.587 )
				ret := -1.000000 // sell
			if( ema1 > 558.587 )
				if( ema1 <= 749.628 )
					if( ema2 <= 735.859 )
						if( tema <= 689.457 )
							if( ema13 <= -19.3447 )
								if( ema3 <= 668.503 )
									ret := -0.800000 // sell
								if( ema3 > 668.503 )
									ret := 0.444444
							if( ema13 > -19.3447 )
								if( ema2 <= 694.881 )
									ret := 0.339286
								if( ema2 > 694.881 )
									ret := 1.000000 // buy
						if( tema > 689.457 )
							if( ema2 <= 703.353 )
								ret := -1.000000 // sell
							if( ema2 > 703.353 )
								ret := -0.625000
					if( ema2 > 735.859 )
						if( ema12 <= -10.6024 )
							ret := 1.000000 // buy
						if( ema12 > -10.6024 )
							ret := 0.500000
				if( ema1 > 749.628 )
					if( tema <= 757.946 )
						if( ema12 <= -10.8265 )
							ret := -0.888889 // sell
						if( ema12 > -10.8265 )
							ret := -1.000000 // sell
					if( tema > 757.946 )
						if( ema2 <= 808.807 )
							ret := -0.150000
						if( ema2 > 808.807 )
							ret := 0.526316
	if( ema13 > -12.2373 )
		if( ema3 <= 283.96 )
			if( ema2 <= 242.051 )
				if( ema1 <= 237.945 )
					if( ema2 <= 133.083 )
						if( ema2 <= 46.4208 )
							if( ema1 <= 46.2964 )
								ret := 1.000000 // buy
							if( ema1 > 46.2964 )
								if( ema2 <= 46.3859 )
									ret := 0.076923
								if( ema2 > 46.3859 )
									ret := 0.583333
						if( ema2 > 46.4208 )
							if( tema <= 102.277 )
								if( ema13 <= -6.31414 )
									ret := 1.000000 // buy
								if( ema13 > -6.31414 )
									ret := 0.017156
							if( tema > 102.277 )
								if( ema3 <= 105.598 )
									ret := 0.578723
								if( ema3 > 105.598 )
									ret := 0.078140
					if( ema2 > 133.083 )
						if( ema1 <= 133.763 )
							if( ema12 <= -0.58564 )
								if( ema3 <= 134.891 )
									ret := -0.918605 // sell
								if( ema3 > 134.891 )
									ret := -0.285714
							if( ema12 > -0.58564 )
								if( ema3 <= 133.277 )
									ret := -0.523077
								if( ema3 > 133.277 )
									ret := 0.142857
						if( ema1 > 133.763 )
							if( ema3 <= 230.816 )
								if( ema12 <= -1.16465 )
									ret := 0.163066
								if( ema12 > -1.16465 )
									ret := -0.010039
							if( ema3 > 230.816 )
								if( ema2 <= 232.609 )
									ret := -0.559633
								if( ema2 > 232.609 )
									ret := 0.123457
				if( ema1 > 237.945 )
					if( ema1 <= 239.752 )
						if( ema2 <= 238.496 )
							if( ema1 <= 239.069 )
								ret := -0.111111
							if( ema1 > 239.069 )
								ret := -0.941176 // sell
						if( ema2 > 238.496 )
							if( tema <= 237.192 )
								ret := -0.800000 // sell
							if( tema > 237.192 )
								ret := -1.000000 // sell
					if( ema1 > 239.752 )
						if( ema13 <= 2.43503 )
							ret := -0.214286
						if( ema13 > 2.43503 )
							ret := 0.500000
			if( ema2 > 242.051 )
				if( ema2 <= 264.871 )
					if( ema12 <= -0.866482 )
						if( ema2 <= 262.023 )
							if( ema2 <= 258.806 )
								ret := 1.000000 // buy
							if( ema2 > 258.806 )
								if( ema2 <= 259.964 )
									ret := 0.685714
								if( ema2 > 259.964 )
									ret := 0.970149 // buy
						if( ema2 > 262.023 )
							if( tema <= 259.403 )
								if( ema1 <= 260.763 )
									ret := 0.555556
								if( ema1 > 260.763 )
									ret := -0.357143
							if( tema > 259.403 )
								if( ema12 <= -1.57491 )
									ret := 1.000000 // buy
								if( ema12 > -1.57491 )
									ret := 0.818182 // buy
					if( ema12 > -0.866482 )
						if( ema1 <= 256.278 )
							if( tema <= 254.167 )
								ret := 1.000000 // buy
							if( tema > 254.167 )
								if( ema3 <= 254.232 )
									ret := 0.777778 // buy
								if( ema3 > 254.232 )
									ret := 1.000000 // buy
						if( ema1 > 256.278 )
							if( ema3 <= 262.032 )
								if( ema3 <= 260.441 )
									ret := 0.070093
								if( ema3 > 260.441 )
									ret := -0.359551
							if( ema3 > 262.032 )
								if( ema2 <= 262.531 )
									ret := -0.333333
								if( ema2 > 262.531 )
									ret := 0.750000 // buy
				if( ema2 > 264.871 )
					if( ema1 <= 266.049 )
						if( ema12 <= -2.06205 )
							if( ema13 <= -8.03604 )
								ret := -0.888889 // sell
							if( ema13 > -8.03604 )
								if( tema <= 260.617 )
									ret := 0.888889 // buy
								if( tema > 260.617 )
									ret := -0.384615
						if( ema12 > -2.06205 )
							if( tema <= 263.009 )
								ret := -0.600000
							if( tema > 263.009 )
								if( tema <= 264.885 )
									ret := -1.000000 // sell
								if( tema > 264.885 )
									ret := -0.916667 // sell
					if( ema1 > 266.049 )
						if( ema13 <= 9.48391 )
							if( tema <= 275.936 )
								if( ema12 <= -1.62122 )
									ret := 0.076355
								if( ema12 > -1.62122 )
									ret := 0.331099
							if( tema > 275.936 )
								if( ema2 <= 281.307 )
									ret := -0.045155
								if( ema2 > 281.307 )
									ret := 0.283105
						if( ema13 > 9.48391 )
							if( ema12 <= 6.56126 )
								if( ema2 <= 273.602 )
									ret := -1.000000 // sell
								if( ema2 > 273.602 )
									ret := -0.909091 // sell
							if( ema12 > 6.56126 )
								if( ema2 <= 270.577 )
									ret := -1.000000 // sell
								if( ema2 > 270.577 )
									ret := 0.083333
		if( ema3 > 283.96 )
			if( tema <= 285.217 )
				if( ema1 <= 280.723 )
					if( ema1 <= 279.191 )
						if( ema3 <= 286.014 )
							ret := -0.500000
						if( ema3 > 286.014 )
							ret := -1.000000 // sell
					if( ema1 > 279.191 )
						if( ema1 <= 279.357 )
							ret := 1.000000 // buy
						if( ema1 > 279.357 )
							if( tema <= 276.719 )
								if( ema1 <= 279.564 )
									ret := 0.400000
								if( ema1 > 279.564 )
									ret := 0.111111
							if( tema > 276.719 )
								if( tema <= 277.513 )
									ret := 1.000000 // buy
								if( tema > 277.513 )
									ret := 0.461538
				if( ema1 > 280.723 )
					if( ema2 <= 291.017 )
						if( ema3 <= 292.489 )
							if( ema12 <= -0.937754 )
								if( ema13 <= -7.44167 )
									ret := 0.500000
								if( ema13 > -7.44167 )
									ret := -0.488136
							if( ema12 > -0.937754 )
								if( ema13 <= -2.04384 )
									ret := -0.941176 // sell
								if( ema13 > -2.04384 )
									ret := 0.059701
						if( ema3 > 292.489 )
							ret := 0.636364
					if( ema2 > 291.017 )
						if( ema13 <= -9.02687 )
							ret := -0.333333
						if( ema13 > -9.02687 )
							if( ema3 <= 294.99 )
								ret := -1.000000 // sell
							if( ema3 > 294.99 )
								ret := -0.363636
			if( tema > 285.217 )
				if( ema12 <= -2.72785 )
					if( ema2 <= 778.019 )
						if( ema3 <= 653.485 )
							if( ema1 <= 618.409 )
								if( ema2 <= 583.045 )
									ret := -0.156345
								if( ema2 > 583.045 )
									ret := 0.262873
							if( ema1 > 618.409 )
								if( ema1 <= 630.348 )
									ret := -0.838235 // sell
								if( ema1 > 630.348 )
									ret := -0.308511
						if( ema3 > 653.485 )
							if( ema12 <= -6.0693 )
								if( ema13 <= -9.1092 )
									ret := -0.611111
								if( ema13 > -9.1092 )
									ret := -1.000000 // sell
							if( ema12 > -6.0693 )
								if( ema2 <= 676.502 )
									ret := 0.544379
								if( ema2 > 676.502 )
									ret := 0.126667
					if( ema2 > 778.019 )
						if( ema2 <= 786.609 )
							if( tema <= 776.379 )
								if( ema1 <= 778.248 )
									ret := -0.928571 // sell
								if( ema1 > 778.248 )
									ret := -0.636364
							if( tema > 776.379 )
								ret := -1.000000 // sell
						if( ema2 > 786.609 )
							if( ema3 <= 809.734 )
								if( tema <= 788.467 )
									ret := 0.214286
								if( tema > 788.467 )
									ret := 0.400000
							if( ema3 > 809.734 )
								if( ema12 <= -3.31405 )
									ret := -0.771084 // sell
								if( ema12 > -3.31405 )
									ret := -0.133333
				if( ema12 > -2.72785 )
					if( ema12 <= 1.51417 )
						if( ema2 <= 285.199 )
							if( ema3 <= 284.225 )
								ret := -0.428571
							if( ema3 > 284.225 )
								if( tema <= 286.278 )
									ret := -1.000000 // sell
								if( tema > 286.278 )
									ret := -0.857143 // sell
						if( ema2 > 285.199 )
							if( ema2 <= 287.234 )
								if( ema2 <= 286.611 )
									ret := -0.106796
								if( ema2 > 286.611 )
									ret := 0.848214 // buy
							if( ema2 > 287.234 )
								if( ema3 <= 841.434 )
									ret := -0.001500
								if( ema3 > 841.434 )
									ret := -0.869565 // sell
					if( ema12 > 1.51417 )
						if( ema2 <= 453.471 )
							if( ema1 <= 311.295 )
								if( ema13 <= 9.3448 )
									ret := -0.232270
								if( ema13 > 9.3448 )
									ret := -0.729730 // sell
							if( ema1 > 311.295 )
								if( ema2 <= 449.987 )
									ret := 0.013894
								if( ema2 > 449.987 )
									ret := 0.623762
						if( ema2 > 453.471 )
							if( ema12 <= 2.045 )
								if( ema3 <= 461.759 )
									ret := -0.789474 // sell
								if( ema3 > 461.759 )
									ret := -0.183406
							if( ema12 > 2.045 )
								if( ema13 <= 3.13769 )
									ret := 0.177700
								if( ema13 > 3.13769 )
									ret := -0.113789
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_HUBS_15Min_a627633a(ema12, ema3, ema13, tema, ema1, ema2)

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


