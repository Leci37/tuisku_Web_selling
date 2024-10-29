//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: LINKUSDT_1Hour_1S00_3ab66b6e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LINKUSDT_1Hour_1S00_3ab66b6e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LINKUSDT_1Hour_3ab66b6e(d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( d_k <= -0.584923 )
		if( rsi1 <= 43.7909 )
			if( d_k <= -7.83738 )
				if( d <= 19.52 )
					if( d_k <= -13.8257 )
						if( smoothD_d <= 14.5521 )
							ret := 0.321839
						if( smoothD_d > 14.5521 )
							ret := 0.817204 // buy
					if( d_k > -13.8257 )
						if( k <= 24.6502 )
							ret := 0.016985
						if( k > 24.6502 )
							ret := 0.251678
				if( d > 19.52 )
					if( rsi1 <= 36.5591 )
						if( smoothD_d <= 74.6396 )
							ret := -0.141370
						if( smoothD_d > 74.6396 )
							ret := 0.325000
					if( rsi1 > 36.5591 )
						if( d_k <= -13.5763 )
							ret := 0.216428
						if( d_k > -13.5763 )
							ret := -0.024624
			if( d_k > -7.83738 )
				if( smoothK_k <= 33.7181 )
					if( smoothK_k <= 33.1794 )
						if( rsi1 <= 24.6663 )
							ret := -0.166667
						if( rsi1 > 24.6663 )
							ret := -0.015787
					if( smoothK_k > 33.1794 )
						if( rsi1 <= 34.9299 )
							ret := 0.666667
						if( rsi1 > 34.9299 )
							ret := 0.421053
				if( smoothK_k > 33.7181 )
					if( k <= 51.9089 )
						if( d <= 46.2673 )
							ret := -0.363441
						if( d > 46.2673 )
							ret := -0.846154 // sell
					if( k > 51.9089 )
						if( smoothD_d <= 89.4939 )
							ret := -0.113938
						if( smoothD_d > 89.4939 )
							ret := 0.368421
		if( rsi1 > 43.7909 )
			if( d_k <= -10.7146 )
				if( smoothK_k <= 78.4787 )
					if( rsi1 <= 49.9776 )
						if( smoothK_k <= 70.0666 )
							ret := 0.277027
						if( smoothK_k > 70.0666 )
							ret := -0.226994
					if( rsi1 > 49.9776 )
						if( rsi1 <= 57.1268 )
							ret := 0.382191
						if( rsi1 > 57.1268 )
							ret := 0.517445
				if( smoothK_k > 78.4787 )
					if( rsi1 <= 69.1227 )
						if( smoothD_d <= 84.3878 )
							ret := 0.091681
						if( smoothD_d > 84.3878 )
							ret := 0.651163
					if( rsi1 > 69.1227 )
						if( k <= 98.7163 )
							ret := 0.246479
						if( k > 98.7163 )
							ret := 0.789157 // buy
			if( d_k > -10.7146 )
				if( rsi1 <= 64.4631 )
					if( d_k <= -10.0229 )
						if( rsi1 <= 45.5088 )
							ret := -0.666667
						if( rsi1 > 45.5088 )
							ret := -0.074906
					if( d_k > -10.0229 )
						if( rsi1 <= 60.5043 )
							ret := 0.193942
						if( rsi1 > 60.5043 )
							ret := 0.055735
				if( rsi1 > 64.4631 )
					if( d <= 60.8141 )
						if( smoothK_k <= 62.3738 )
							ret := 0.145870
						if( smoothK_k > 62.3738 )
							ret := -0.606061
					if( d > 60.8141 )
						if( smoothK_k <= 87.0112 )
							ret := 0.457565
						if( smoothK_k > 87.0112 )
							ret := 0.266164
	if( d_k > -0.584923 )
		if( rsi1 <= 47.0778 )
			if( rsi1 <= 32.2737 )
				if( d <= 58.8718 )
					if( k <= 25.8612 )
						if( d_k <= 15.2747 )
							ret := -0.369786
						if( d_k > 15.2747 )
							ret := -0.594705
					if( k > 25.8612 )
						if( rsi1 <= 28.9772 )
							ret := -0.312102
						if( rsi1 > 28.9772 )
							ret := 0.082474
				if( d > 58.8718 )
					if( rsi1 <= 27.5459 )
						if( smoothD_d <= 80.3971 )
							ret := -0.866667 // sell
						if( smoothD_d > 80.3971 )
							ret := -0.333333
					if( rsi1 > 27.5459 )
						if( d_k <= 19.709 )
							ret := -0.623853
						if( d_k > 19.709 )
							ret := -0.191489
			if( rsi1 > 32.2737 )
				if( d_k <= 11.489 )
					if( k <= 44.6739 )
						if( rsi1 <= 39.2079 )
							ret := -0.143820
						if( rsi1 > 39.2079 )
							ret := -0.264878
					if( k > 44.6739 )
						if( d_k <= 4.81409 )
							ret := 0.108543
						if( d_k > 4.81409 )
							ret := -0.178056
				if( d_k > 11.489 )
					if( smoothD_d <= 56.181 )
						if( rsi1 <= 34.4939 )
							ret := -0.518672
						if( rsi1 > 34.4939 )
							ret := -0.259330
					if( smoothD_d > 56.181 )
						if( smoothD_d <= 82.3104 )
							ret := -0.482239
						if( smoothD_d > 82.3104 )
							ret := -0.743590 // sell
		if( rsi1 > 47.0778 )
			if( rsi1 <= 64.3059 )
				if( d_k <= 10.3622 )
					if( smoothK_k <= 95.0265 )
						if( d <= 88.2156 )
							ret := 0.021288
						if( d > 88.2156 )
							ret := -0.151706
					if( smoothK_k > 95.0265 )
						if( smoothK_k <= 96.1933 )
							ret := 0.682692
						if( smoothK_k > 96.1933 )
							ret := 0.246479
				if( d_k > 10.3622 )
					if( k <= 30.2061 )
						if( rsi1 <= 49.2323 )
							ret := -0.224832
						if( rsi1 > 49.2323 )
							ret := 0.059072
					if( k > 30.2061 )
						if( d_k <= 18.2911 )
							ret := -0.232116
						if( d_k > 18.2911 )
							ret := -0.469421
			if( rsi1 > 64.3059 )
				if( k <= 98.181 )
					if( smoothD_d <= 91.2093 )
						if( d_k <= 13.7979 )
							ret := 0.203762
						if( d_k > 13.7979 )
							ret := -0.120275
					if( smoothD_d > 91.2093 )
						if( k <= 89.7638 )
							ret := -0.443609
						if( k > 89.7638 )
							ret := 0.020240
				if( k > 98.181 )
					if( rsi1 <= 93.1184 )
						if( rsi1 <= 67.233 )
							ret := 0.601695
						if( rsi1 > 67.233 )
							ret := 0.322825
					if( rsi1 > 93.1184 )
						if( smoothK_k <= 96.736 )
							ret := 0.100000
						if( smoothK_k > 96.736 )
							ret := 1.000000 // buy
	
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
float op_operation = decision_tree_0_LINKUSDT_1Hour_3ab66b6e(d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


