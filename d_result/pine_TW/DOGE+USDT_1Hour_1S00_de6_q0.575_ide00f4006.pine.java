//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: DOGEUSDT_1Hour_1S00_e00f4006 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOGEUSDT_1Hour_1S00_e00f4006", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOGEUSDT_1Hour_e00f4006(d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6,max_features=sqrt, min_samples_split=10,random_state=843828734)
	if( smoothK_k <= 54.1817 )
		if( k <= 5.3665 )
			if( d <= 3.55586 )
				if( k <= 1.7124 )
					if( k <= 0.003062 )
						if( d_k <= 0.000945 )
							ret := -0.035088
						if( d_k > 0.000945 )
							ret := -0.370062
					if( k > 0.003062 )
						if( k <= 0.093806 )
							ret := 0.136364
						if( k > 0.093806 )
							ret := -0.183007
				if( k > 1.7124 )
					if( rsi1 <= 53.882 )
						if( k <= 1.76928 )
							ret := 0.722222 // buy
						if( k > 1.76928 )
							ret := -0.087133
					if( rsi1 > 53.882 )
						if( smoothK_k <= -1.25324 )
							ret := -0.500000
						if( smoothK_k > -1.25324 )
							ret := 0.675000
			if( d > 3.55586 )
				if( rsi1 <= 25.2394 )
					if( k <= 0.592057 )
						if( smoothD_d <= 0.642216 )
							ret := -1.000000 // sell
						if( smoothD_d > 0.642216 )
							ret := -0.717131 // sell
					if( k > 0.592057 )
						if( d <= 7.86867 )
							ret := -0.576271
						if( d > 7.86867 )
							ret := -0.284000
				if( rsi1 > 25.2394 )
					if( rsi1 <= 56.9535 )
						if( smoothD_d <= 28.363 )
							ret := -0.267088
						if( smoothD_d > 28.363 )
							ret := 0.650000
					if( rsi1 > 56.9535 )
						if( d <= 13.0118 )
							ret := 0.351485
						if( d > 13.0118 )
							ret := -0.338710
		if( k > 5.3665 )
			if( rsi1 <= 46.9523 )
				if( rsi1 <= 37.3263 )
					if( smoothD_d <= 7.94196 )
						if( k <= 13.1039 )
							ret := -0.043452
						if( k > 13.1039 )
							ret := 0.351675
					if( smoothD_d > 7.94196 )
						if( rsi1 <= 21.1924 )
							ret := -0.638333
						if( rsi1 > 21.1924 )
							ret := -0.264688
				if( rsi1 > 37.3263 )
					if( d_k <= -2.36743 )
						if( smoothD_d <= 15.9299 )
							ret := 0.138172
						if( smoothD_d > 15.9299 )
							ret := 0.048501
					if( d_k > -2.36743 )
						if( smoothD_d <= 39.7949 )
							ret := -0.124872
						if( smoothD_d > 39.7949 )
							ret := -0.303242
			if( rsi1 > 46.9523 )
				if( d <= 49.2105 )
					if( rsi1 <= 69.9007 )
						if( d <= 8.0598 )
							ret := 0.359806
						if( d > 8.0598 )
							ret := 0.126707
					if( rsi1 > 69.9007 )
						if( d_k <= 0.810534 )
							ret := 0.605322
						if( d_k > 0.810534 )
							ret := 0.328358
				if( d > 49.2105 )
					if( d_k <= 23.8073 )
						if( smoothD_d <= 48.3296 )
							ret := -0.245070
						if( smoothD_d > 48.3296 )
							ret := 0.002152
					if( d_k > 23.8073 )
						if( rsi1 <= 50.2836 )
							ret := -0.584416
						if( rsi1 > 50.2836 )
							ret := -0.188341
	if( smoothK_k > 54.1817 )
		if( smoothK_k <= 92.5524 )
			if( smoothD_d <= 75.0047 )
				if( rsi1 <= 62.7415 )
					if( smoothD_d <= 47.9231 )
						if( k <= 76.8794 )
							ret := 0.184669
						if( k > 76.8794 )
							ret := 0.545455
					if( smoothD_d > 47.9231 )
						if( d <= 55.4625 )
							ret := -0.143722
						if( d > 55.4625 )
							ret := 0.022108
				if( rsi1 > 62.7415 )
					if( d_k <= 0.317487 )
						if( rsi1 <= 65.6062 )
							ret := 0.299807
						if( rsi1 > 65.6062 )
							ret := 0.485685
					if( d_k > 0.317487 )
						if( d <= 73.9944 )
							ret := 0.299029
						if( d > 73.9944 )
							ret := -0.029508
			if( smoothD_d > 75.0047 )
				if( d_k <= 1.99572 )
					if( d <= 84.9584 )
						if( d_k <= -11.5641 )
							ret := 0.432900
						if( d_k > -11.5641 )
							ret := -0.023783
					if( d > 84.9584 )
						if( smoothK_k <= 92.1941 )
							ret := 0.201553
						if( smoothK_k > 92.1941 )
							ret := -0.128319
				if( d_k > 1.99572 )
					if( smoothK_k <= 61.874 )
						if( d_k <= 17.3964 )
							ret := -0.233766
						if( d_k > 17.3964 )
							ret := -0.637555
					if( smoothK_k > 61.874 )
						if( d <= 93.2907 )
							ret := -0.090118
						if( d > 93.2907 )
							ret := -0.210568
		if( smoothK_k > 92.5524 )
			if( rsi1 <= 65.9763 )
				if( d_k <= 1.0669 )
					if( rsi1 <= 47.5966 )
						if( smoothD_d <= 79.5958 )
							ret := 0.292308
						if( smoothD_d > 79.5958 )
							ret := -0.056022
					if( rsi1 > 47.5966 )
						if( d <= 90.2324 )
							ret := 0.115304
						if( d > 90.2324 )
							ret := 0.281669
				if( d_k > 1.0669 )
					if( smoothD_d <= 95.3822 )
						if( smoothD_d <= 94.1136 )
							ret := -0.666667
						if( smoothD_d > 94.1136 )
							ret := -0.285714
					if( smoothD_d > 95.3822 )
						if( smoothD_d <= 95.5293 )
							ret := -1.000000 // sell
						if( smoothD_d > 95.5293 )
							ret := -0.617284
			if( rsi1 > 65.9763 )
				if( d <= 97.1668 )
					if( rsi1 <= 87.8309 )
						if( d <= 72.2972 )
							ret := -0.136364
						if( d > 72.2972 )
							ret := 0.466967
					if( rsi1 > 87.8309 )
						if( d <= 95.7655 )
							ret := 0.866667 // buy
						if( d > 95.7655 )
							ret := -0.050000
				if( d > 97.1668 )
					if( k <= 99.7012 )
						if( d_k <= -0.317589 )
							ret := -0.401709
						if( d_k > -0.317589 )
							ret := 0.220676
					if( k > 99.7012 )
						if( d_k <= -0.188333 )
							ret := 0.303977
						if( d_k > -0.188333 )
							ret := 0.619433
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Stochastic_RSI 
//@version=5
//indicator title="Stochastic RSI", shorttitle="Stoch RSI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
smoothK = input.int(3, "K", minval=1)
smoothD = input.int(3, "D", minval=1)
lengthRSI = input.int(14, "RSI Length", minval=1)
lengthStoch = input.int(14, "Stochastic Length", minval=1)
src = input(close, title="RSI Source")
rsi1 = ta.rsi(src, lengthRSI)
k = ta.sma(ta.stoch(rsi1, rsi1, rsi1, lengthStoch), smoothK)
d = ta.sma(k, smoothD)
plot(k, "K", color=#2962FF)
plot(d, "D", color=#FF6D00)

d_k = d - k
smoothD_d = d - smoothD
smoothK_k = k - smoothK

h0 = hline(80, "Upper Band", color=#787B86)
hline(50, "Middle Band", color=color.new(#787B86, 50))
h1 = hline(20, "Lower Band", color=#787B86)
fill(h0, h1, color=color.rgb(33, 150, 243, 90), title="Background")
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
float op_operation = decision_tree_0_DOGEUSDT_1Hour_e00f4006(d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


