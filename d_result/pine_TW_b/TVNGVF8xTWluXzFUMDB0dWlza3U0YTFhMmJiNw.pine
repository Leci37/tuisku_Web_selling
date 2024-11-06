//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: MSFT_1Min_1T00_4a1a2bb7 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_1Min_1T00_4a1a2bb7", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_1Min_4a1a2bb7(ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ema12 <= 0.303835 )
		if( tema <= 390.175 )
			if( ema12 <= -0.957359 )
				ret := 1.000000 // buy
			if( ema12 > -0.957359 )
				if( ema2 <= 386.293 )
					if( ema12 <= -0.752265 )
						ret := 0.538462
					if( ema12 > -0.752265 )
						ret := 1.000000 // buy
				if( ema2 > 386.293 )
					if( ema1 <= 387.722 )
						if( tema <= 387.101 )
							ret := -1.000000 // sell
						if( tema > 387.101 )
							ret := 0.272727
					if( ema1 > 387.722 )
						if( ema2 <= 389.918 )
							if( ema12 <= -0.612451 )
								if( ema13 <= -1.3009 )
									ret := 0.368421
								if( ema13 > -1.3009 )
									ret := -0.733333 // sell
							if( ema12 > -0.612451 )
								if( ema2 <= 389.287 )
									ret := 1.000000 // buy
								if( ema2 > 389.287 )
									ret := 0.521212
						if( ema2 > 389.918 )
							if( tema <= 389.911 )
								if( ema12 <= -0.885797 )
									ret := 0.500000
								if( ema12 > -0.885797 )
									ret := -0.392857
							if( tema > 389.911 )
								if( ema1 <= 389.903 )
									ret := -1.000000 // sell
								if( ema1 > 389.903 )
									ret := 0.483516
		if( tema > 390.175 )
			if( ema2 <= 406.546 )
				if( ema2 <= 406.067 )
					if( ema12 <= -0.319617 )
						if( ema1 <= 404.73 )
							if( tema <= 390.443 )
								ret := -0.952381 // sell
							if( tema > 390.443 )
								if( ema13 <= -0.860153 )
									ret := 0.063465
								if( ema13 > -0.860153 )
									ret := -0.167812
						if( ema1 > 404.73 )
							if( tema <= 404.315 )
								ret := -0.333333
							if( tema > 404.315 )
								if( ema1 <= 405.121 )
									ret := -1.000000 // sell
								if( ema1 > 405.121 )
									ret := -0.600000
					if( ema12 > -0.319617 )
						if( ema3 <= 404.613 )
							if( tema <= 404.344 )
								if( ema2 <= 404.01 )
									ret := 0.072787
								if( ema2 > 404.01 )
									ret := -0.207885
							if( tema > 404.344 )
								if( ema12 <= 0.050437 )
									ret := 0.753247 // buy
								if( ema12 > 0.050437 )
									ret := 0.255639
						if( ema3 > 404.613 )
							if( ema1 <= 404.577 )
								if( ema13 <= -0.30118 )
									ret := -0.586207
								if( ema13 > -0.30118 )
									ret := -0.886792 // sell
							if( ema1 > 404.577 )
								if( ema2 <= 404.918 )
									ret := -0.332046
								if( ema2 > 404.918 )
									ret := 0.034343
				if( ema2 > 406.067 )
					if( ema13 <= -0.502074 )
						if( ema2 <= 406.509 )
							if( ema13 <= -0.542013 )
								if( ema2 <= 406.225 )
									ret := 1.000000 // buy
								if( ema2 > 406.225 )
									ret := 0.912088 // buy
							if( ema13 > -0.542013 )
								ret := 0.571429
						if( ema2 > 406.509 )
							ret := 0.444444
					if( ema13 > -0.502074 )
						if( ema13 <= -0.215087 )
							if( ema12 <= -0.166634 )
								if( tema <= 405.937 )
									ret := 0.553571
								if( tema > 405.937 )
									ret := -0.162791
							if( ema12 > -0.166634 )
								if( tema <= 406.005 )
									ret := -0.745098 // sell
								if( tema > 406.005 )
									ret := -0.312500
						if( ema13 > -0.215087 )
							if( ema12 <= -0.043267 )
								if( ema1 <= 406.302 )
									ret := 0.438095
								if( ema1 > 406.302 )
									ret := 0.851852 // buy
							if( ema12 > -0.043267 )
								if( ema1 <= 406.479 )
									ret := 0.052980
								if( ema1 > 406.479 )
									ret := 0.426357
			if( ema2 > 406.546 )
				if( ema12 <= -0.212713 )
					if( ema12 <= -0.739557 )
						if( ema3 <= 443.517 )
							if( ema2 <= 415.249 )
								if( ema13 <= -2.19897 )
									ret := 0.305556
								if( ema13 > -2.19897 )
									ret := -0.533981
							if( ema2 > 415.249 )
								if( ema13 <= -2.25536 )
									ret := -0.576923
								if( ema13 > -2.25536 )
									ret := 0.095142
						if( ema3 > 443.517 )
							if( ema1 <= 446.881 )
								if( ema12 <= -1.14999 )
									ret := -0.705882 // sell
								if( ema12 > -1.14999 )
									ret := -0.952381 // sell
							if( ema1 > 446.881 )
								if( ema1 <= 456.821 )
									ret := 0.960000 // buy
								if( ema1 > 456.821 )
									ret := -0.736842 // sell
					if( ema12 > -0.739557 )
						if( tema <= 407.964 )
							if( ema1 <= 406.815 )
								if( ema12 <= -0.221186 )
									ret := -0.119403
								if( ema12 > -0.221186 )
									ret := 0.900000 // buy
							if( ema1 > 406.815 )
								if( ema12 <= -0.402941 )
									ret := 0.600877
								if( ema12 > -0.402941 )
									ret := 0.289544
						if( tema > 407.964 )
							if( ema2 <= 413.081 )
								if( ema2 <= 409.802 )
									ret := 0.166154
								if( ema2 > 409.802 )
									ret := -0.122843
							if( ema2 > 413.081 )
								if( ema2 <= 413.899 )
									ret := 0.418129
								if( ema2 > 413.899 )
									ret := 0.110708
				if( ema12 > -0.212713 )
					if( tema <= 408.146 )
						if( ema1 <= 408.005 )
							if( ema12 <= 0.054936 )
								if( ema12 <= -0.158266 )
									ret := 0.203390
								if( ema12 > -0.158266 )
									ret := -0.271252
							if( ema12 > 0.054936 )
								if( ema2 <= 407.738 )
									ret := 0.010333
								if( ema2 > 407.738 )
									ret := 0.644068
						if( ema1 > 408.005 )
							if( ema3 <= 408.243 )
								if( ema1 <= 408.066 )
									ret := -0.250000
								if( ema1 > 408.066 )
									ret := 0.523810
							if( ema3 > 408.243 )
								if( ema3 <= 408.454 )
									ret := -0.859375 // sell
								if( ema3 > 408.454 )
									ret := -0.150000
					if( tema > 408.146 )
						if( ema2 <= 415.867 )
							if( ema13 <= -0.410299 )
								if( ema12 <= -0.199794 )
									ret := 0.340426
								if( ema12 > -0.199794 )
									ret := 0.610169
							if( ema13 > -0.410299 )
								if( ema3 <= 415.674 )
									ret := 0.009610
								if( ema3 > 415.674 )
									ret := 0.263423
						if( ema2 > 415.867 )
							if( tema <= 467.497 )
								if( tema <= 464.601 )
									ret := -0.019107
								if( tema > 464.601 )
									ret := 0.123967
							if( tema > 467.497 )
								if( ema2 <= 467.788 )
									ret := -0.617021
								if( ema2 > 467.788 )
									ret := -0.196262
	if( ema12 > 0.303835 )
		if( ema1 <= 415.765 )
			if( tema <= 415.819 )
				if( ema2 <= 414.485 )
					if( ema2 <= 413.356 )
						if( ema13 <= 0.460487 )
							if( ema2 <= 409.261 )
								if( ema3 <= 393.63 )
									ret := 0.611111
								if( ema3 > 393.63 )
									ret := -0.594595
							if( ema2 > 409.261 )
								if( tema <= 412.17 )
									ret := 0.764706 // buy
								if( tema > 412.17 )
									ret := -0.214286
						if( ema13 > 0.460487 )
							if( ema1 <= 412.868 )
								if( ema2 <= 411.601 )
									ret := -0.063854
								if( ema2 > 411.601 )
									ret := 0.584071
							if( ema1 > 412.868 )
								if( ema13 <= 1.18124 )
									ret := -0.312977
								if( ema13 > 1.18124 )
									ret := -0.693333
					if( ema2 > 413.356 )
						if( ema12 <= 0.613877 )
							if( ema2 <= 413.622 )
								if( ema1 <= 413.843 )
									ret := 0.864865 // buy
								if( ema1 > 413.843 )
									ret := 0.666667
							if( ema2 > 413.622 )
								if( ema12 <= 0.331656 )
									ret := -0.410256
								if( ema12 > 0.331656 )
									ret := 0.347518
						if( ema12 > 0.613877 )
							if( ema3 <= 412.749 )
								ret := -1.000000 // sell
							if( ema3 > 412.749 )
								ret := -0.461538
				if( ema2 > 414.485 )
					if( tema <= 415.72 )
						if( ema2 <= 414.801 )
							ret := -0.550000
						if( ema2 > 414.801 )
							if( ema13 <= 0.545047 )
								ret := -1.000000 // sell
							if( ema13 > 0.545047 )
								ret := -0.857143 // sell
					if( tema > 415.72 )
						ret := -0.272727
			if( tema > 415.819 )
				if( ema13 <= 9.88441 )
					if( tema <= 416.081 )
						if( tema <= 415.945 )
							ret := 0.375000
						if( tema > 415.945 )
							if( ema12 <= 0.587375 )
								if( tema <= 415.997 )
									ret := 0.846154 // buy
								if( tema > 415.997 )
									ret := 1.000000 // buy
							if( ema12 > 0.587375 )
								ret := 0.769231 // buy
					if( tema > 416.081 )
						if( ema12 <= 0.656624 )
							if( ema12 <= 0.423709 )
								if( ema1 <= 415.726 )
									ret := 0.333333
								if( ema1 > 415.726 )
									ret := -0.181818
							if( ema12 > 0.423709 )
								ret := -0.714286 // sell
						if( ema12 > 0.656624 )
							if( ema1 <= 415.285 )
								ret := 0.333333
							if( ema1 > 415.285 )
								ret := 0.863636 // buy
				if( ema13 > 9.88441 )
					ret := -1.000000 // sell
		if( ema1 > 415.765 )
			if( ema2 <= 464.48 )
				if( ema2 <= 457.555 )
					if( ema1 <= 416.891 )
						if( ema2 <= 416.192 )
							if( tema <= 417.065 )
								if( ema1 <= 416.121 )
									ret := -0.746835 // sell
								if( ema1 > 416.121 )
									ret := -0.444444
							if( tema > 417.065 )
								if( ema3 <= 414.569 )
									ret := -0.761905 // sell
								if( ema3 > 414.569 )
									ret := 0.511628
						if( ema2 > 416.192 )
							ret := -1.000000 // sell
					if( ema1 > 416.891 )
						if( ema1 <= 418.034 )
							if( ema3 <= 416.033 )
								if( ema12 <= 1.04775 )
									ret := 0.888889 // buy
								if( ema12 > 1.04775 )
									ret := 0.565217
							if( ema3 > 416.033 )
								if( ema2 <= 417.223 )
									ret := -0.050000
								if( ema2 > 417.223 )
									ret := 0.693878
						if( ema1 > 418.034 )
							if( tema <= 455.353 )
								if( tema <= 449.239 )
									ret := -0.237814
								if( tema > 449.239 )
									ret := 0.018041
							if( tema > 455.353 )
								if( ema1 <= 455.313 )
									ret := -0.888889 // sell
								if( ema1 > 455.313 )
									ret := -0.546667
				if( ema2 > 457.555 )
					if( tema <= 463.546 )
						if( ema3 <= 461.217 )
							if( ema12 <= 0.382044 )
								if( ema13 <= 0.592963 )
									ret := 0.323529
								if( ema13 > 0.592963 )
									ret := 0.787234 // buy
							if( ema12 > 0.382044 )
								if( ema13 <= 0.797035 )
									ret := -0.500000
								if( ema13 > 0.797035 )
									ret := 0.400000
						if( ema3 > 461.217 )
							if( ema2 <= 461.733 )
								ret := -1.000000 // sell
							if( ema2 > 461.733 )
								if( ema13 <= 0.788314 )
									ret := -0.400000
								if( ema13 > 0.788314 )
									ret := 0.333333
					if( tema > 463.546 )
						if( ema12 <= 0.583673 )
							ret := 0.777778 // buy
						if( ema12 > 0.583673 )
							ret := 1.000000 // buy
			if( ema2 > 464.48 )
				if( ema13 <= 0.728165 )
					if( ema13 <= 0.621998 )
						if( ema1 <= 466.155 )
							ret := -0.500000
						if( ema1 > 466.155 )
							ret := -1.000000 // sell
					if( ema13 > 0.621998 )
						ret := -0.187500
				if( ema13 > 0.728165 )
					if( ema2 <= 465.574 )
						ret := -0.833333 // sell
					if( ema2 > 465.574 )
						ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_MSFT_1Min_4a1a2bb7(ema12, ema3, ema13, tema, ema1, ema2)

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


