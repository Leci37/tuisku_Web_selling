//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: AVAXUSDT_1Hour_1S00_9f0590bc Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AVAXUSDT_1Hour_1S00_9f0590bc", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AVAXUSDT_1Hour_9f0590bc(rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( d_k <= 0.128521 )
		if( k <= 99.465 )
			if( rsi1 <= 51.548 )
				if( rsi1 <= 12.6532 )
					if( smoothK_k <= -1.33093 )
						if( rsi1 <= 11.6839 )
							ret := -0.788732 // sell
						if( rsi1 > 11.6839 )
							ret := -1.000000 // sell
					if( smoothK_k > -1.33093 )
						if( smoothD_d <= -1.17915 )
							ret := 0.000000
						if( smoothD_d > -1.17915 )
							ret := -0.738095 // sell
				if( rsi1 > 12.6532 )
					if( d_k <= -1.67733 )
						if( smoothD_d <= 9.46122 )
							ret := 0.263280
						if( smoothD_d > 9.46122 )
							ret := 0.005659
					if( d_k > -1.67733 )
						if( d_k <= -0.015287 )
							ret := -0.083562
						if( d_k > -0.015287 )
							ret := -0.329435
			if( rsi1 > 51.548 )
				if( d <= 40.7488 )
					if( d_k <= -6.91409 )
						if( d_k <= -20.8976 )
							ret := 0.671018
						if( d_k > -20.8976 )
							ret := 0.473257
					if( d_k > -6.91409 )
						if( smoothK_k <= 20.6693 )
							ret := 0.152941
						if( smoothK_k > 20.6693 )
							ret := 0.411765
				if( d > 40.7488 )
					if( rsi1 <= 63.9312 )
						if( rsi1 <= 53.302 )
							ret := -0.066937
						if( rsi1 > 53.302 )
							ret := 0.129641
					if( rsi1 > 63.9312 )
						if( k <= 88.7908 )
							ret := 0.446209
						if( k > 88.7908 )
							ret := 0.234869
		if( k > 99.465 )
			if( rsi1 <= 78.0393 )
				if( k <= 99.9796 )
					if( smoothD_d <= 86.2424 )
						if( smoothK_k <= 96.8936 )
							ret := 0.805556 // buy
						if( smoothK_k > 96.8936 )
							ret := 1.000000 // buy
					if( smoothD_d > 86.2424 )
						if( smoothK_k <= 96.8532 )
							ret := 0.328829
						if( smoothK_k > 96.8532 )
							ret := 0.637097
				if( k > 99.9796 )
					if( smoothD_d <= 80.0765 )
						if( rsi1 <= 64.2233 )
							ret := 0.517241
						if( rsi1 > 64.2233 )
							ret := 0.794118 // buy
					if( smoothD_d > 80.0765 )
						if( d <= 88.8198 )
							ret := -0.247525
						if( d > 88.8198 )
							ret := 0.231539
			if( rsi1 > 78.0393 )
				if( d <= 94.7568 )
					if( smoothD_d <= 82.1496 )
						ret := 0.333333
					if( smoothD_d > 82.1496 )
						if( d_k <= -11.2119 )
							ret := 1.000000 // buy
						if( d_k > -11.2119 )
							ret := 0.763158 // buy
				if( d > 94.7568 )
					if( d_k <= -0.838357 )
						if( smoothD_d <= 95.7821 )
							ret := 0.530055
						if( smoothD_d > 95.7821 )
							ret := -0.708333 // sell
					if( d_k > -0.838357 )
						if( rsi1 <= 93.7092 )
							ret := 0.729730 // buy
						if( rsi1 > 93.7092 )
							ret := 0.142857
	if( d_k > 0.128521 )
		if( rsi1 <= 55.7843 )
			if( rsi1 <= 26.6981 )
				if( d_k <= 11.6775 )
					if( rsi1 <= 10.2476 )
						if( k <= 2.7507 )
							ret := -0.918919 // sell
						if( k > 2.7507 )
							ret := 0.125000
					if( rsi1 > 10.2476 )
						if( d <= 21.1639 )
							ret := -0.347623
						if( d > 21.1639 )
							ret := -0.576471
				if( d_k > 11.6775 )
					if( smoothD_d <= 37.0989 )
						if( d <= 33.0043 )
							ret := -0.794872 // sell
						if( d > 33.0043 )
							ret := -0.196078
					if( smoothD_d > 37.0989 )
						if( d_k <= 15.2331 )
							ret := -0.400000
						if( d_k > 15.2331 )
							ret := -0.866667 // sell
			if( rsi1 > 26.6981 )
				if( d_k <= 4.9658 )
					if( rsi1 <= 54.1299 )
						if( rsi1 <= 48.5419 )
							ret := -0.130617
						if( rsi1 > 48.5419 )
							ret := 0.079958
					if( rsi1 > 54.1299 )
						if( rsi1 <= 55.629 )
							ret := -0.280120
						if( rsi1 > 55.629 )
							ret := -0.815789 // sell
				if( d_k > 4.9658 )
					if( d <= 73.5849 )
						if( rsi1 <= 40.1317 )
							ret := -0.346278
						if( rsi1 > 40.1317 )
							ret := -0.161549
					if( d > 73.5849 )
						if( smoothK_k <= 58.1006 )
							ret := -0.669421
						if( smoothK_k > 58.1006 )
							ret := -0.393834
		if( rsi1 > 55.7843 )
			if( d_k <= 2.99406 )
				if( d <= 94.8487 )
					if( rsi1 <= 79.0831 )
						if( k <= 90.4059 )
							ret := 0.220807
						if( k > 90.4059 )
							ret := 0.429150
					if( rsi1 > 79.0831 )
						if( d <= 92.8527 )
							ret := 0.737864 // buy
						if( d > 92.8527 )
							ret := 0.103448
				if( d > 94.8487 )
					if( smoothK_k <= 91.0584 )
						if( smoothD_d <= 92.8679 )
							ret := -0.200000
						if( smoothD_d > 92.8679 )
							ret := -0.823529 // sell
					if( smoothK_k > 91.0584 )
						if( smoothD_d <= 94.3375 )
							ret := 0.307958
						if( smoothD_d > 94.3375 )
							ret := -0.074653
			if( d_k > 2.99406 )
				if( smoothD_d <= 88.2694 )
					if( smoothD_d <= 67.2021 )
						if( smoothK_k <= 49.3653 )
							ret := 0.089231
						if( smoothK_k > 49.3653 )
							ret := 0.295000
					if( smoothD_d > 67.2021 )
						if( d_k <= 8.67049 )
							ret := 0.082353
						if( d_k > 8.67049 )
							ret := -0.185603
				if( smoothD_d > 88.2694 )
					if( rsi1 <= 82.1076 )
						if( d_k <= 6.18915 )
							ret := -0.304625
						if( d_k > 6.18915 )
							ret := -0.555944
					if( rsi1 > 82.1076 )
						if( smoothD_d <= 93.5775 )
							ret := 0.549020
						if( smoothD_d > 93.5775 )
							ret := -0.250000
	
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
float op_operation = decision_tree_0_AVAXUSDT_1Hour_9f0590bc(rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


