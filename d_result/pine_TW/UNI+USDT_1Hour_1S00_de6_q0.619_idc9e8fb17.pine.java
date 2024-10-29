//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: UNIUSDT_1Hour_1S00_c9e8fb17 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UNIUSDT_1Hour_1S00_c9e8fb17", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UNIUSDT_1Hour_c9e8fb17(rsi1, d, k, smoothD_d, d_k, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( rsi1 <= 42.5575 )
		if( d_k <= -1.22373 )
			if( d <= 9.99973 )
				if( d_k <= -2.09932 )
					if( d <= 3.1855 )
						if( smoothD_d <= -0.426508 )
							ret := 0.358382
						if( smoothD_d > -0.426508 )
							ret := 0.700000 // buy
					if( d > 3.1855 )
						if( rsi1 <= 24.3532 )
							ret := -0.120690
						if( rsi1 > 24.3532 )
							ret := 0.267407
				if( d_k > -2.09932 )
					if( k <= 4.33986 )
						if( k <= 3.18714 )
							ret := 0.101124
						if( k > 3.18714 )
							ret := 0.434783
					if( k > 4.33986 )
						if( smoothD_d <= 6.85912 )
							ret := -0.229927
						if( smoothD_d > 6.85912 )
							ret := 0.666667
			if( d > 9.99973 )
				if( d_k <= -7.19829 )
					if( rsi1 <= 36.1896 )
						if( d_k <= -13.5807 )
							ret := 0.170833
						if( d_k > -13.5807 )
							ret := -0.049808
					if( rsi1 > 36.1896 )
						if( k <= 73.1751 )
							ret := 0.229770
						if( k > 73.1751 )
							ret := 0.015306
				if( d_k > -7.19829 )
					if( smoothK_k <= 91.4031 )
						if( rsi1 <= 27.5085 )
							ret := -0.321063
						if( rsi1 > 27.5085 )
							ret := -0.095593
					if( smoothK_k > 91.4031 )
						if( k <= 97.124 )
							ret := 0.833333 // buy
						if( k > 97.124 )
							ret := 0.230769
		if( d_k > -1.22373 )
			if( rsi1 <= 28.02 )
				if( k <= 0.5839 )
					if( smoothD_d <= 13.7901 )
						if( smoothK_k <= -2.99998 )
							ret := -0.564602
						if( smoothK_k > -2.99998 )
							ret := -0.755224 // sell
					if( smoothD_d > 13.7901 )
						if( rsi1 <= 16.6882 )
							ret := 1.000000 // buy
						if( rsi1 > 16.6882 )
							ret := -0.368421
				if( k > 0.5839 )
					if( smoothD_d <= 23.0926 )
						if( k <= 9.51766 )
							ret := -0.432653
						if( k > 9.51766 )
							ret := -0.172840
					if( smoothD_d > 23.0926 )
						if( smoothD_d <= 81.2401 )
							ret := -0.644231
						if( smoothD_d > 81.2401 )
							ret := 0.166667
			if( rsi1 > 28.02 )
				if( d_k <= 12.2425 )
					if( d <= 0.001771 )
						if( rsi1 <= 30.086 )
							ret := 0.125000
						if( rsi1 > 30.086 )
							ret := -0.711538 // sell
					if( d > 0.001771 )
						if( smoothD_d <= 47.1732 )
							ret := -0.195496
						if( smoothD_d > 47.1732 )
							ret := -0.325188
				if( d_k > 12.2425 )
					if( d <= 76.6363 )
						if( k <= 56.5776 )
							ret := -0.498562
						if( k > 56.5776 )
							ret := 0.130435
					if( d > 76.6363 )
						if( d <= 81.264 )
							ret := -0.791209 // sell
						if( d > 81.264 )
							ret := -0.593750
	if( rsi1 > 42.5575 )
		if( d_k <= 2.07338 )
			if( d_k <= -8.62545 )
				if( d <= 31.3691 )
					if( rsi1 <= 50.1601 )
						if( smoothD_d <= 13.7569 )
							ret := 0.547739
						if( smoothD_d > 13.7569 )
							ret := 0.212185
					if( rsi1 > 50.1601 )
						if( smoothK_k <= 46.8276 )
							ret := 0.639558
						if( smoothK_k > 46.8276 )
							ret := 0.388889
				if( d > 31.3691 )
					if( rsi1 <= 62.762 )
						if( d_k <= -31.0546 )
							ret := 0.824176 // buy
						if( d_k > -31.0546 )
							ret := 0.192606
					if( rsi1 > 62.762 )
						if( smoothK_k <= 57.6426 )
							ret := 0.126168
						if( smoothK_k > 57.6426 )
							ret := 0.454151
			if( d_k > -8.62545 )
				if( rsi1 <= 59.8064 )
					if( k <= 99.7169 )
						if( k <= 66.4858 )
							ret := 0.129721
						if( k > 66.4858 )
							ret := -0.012327
					if( k > 99.7169 )
						if( smoothD_d <= 96.6775 )
							ret := 0.575610
						if( smoothD_d > 96.6775 )
							ret := 0.035294
				if( rsi1 > 59.8064 )
					if( rsi1 <= 82.465 )
						if( smoothK_k <= -0.844442 )
							ret := -0.888889 // sell
						if( smoothK_k > -0.844442 )
							ret := 0.260407
					if( rsi1 > 82.465 )
						if( d_k <= -2.50258 )
							ret := 0.271028
						if( d_k > -2.50258 )
							ret := 0.599702
		if( d_k > 2.07338 )
			if( d <= 85.107 )
				if( rsi1 <= 65.1533 )
					if( d <= 44.5186 )
						if( rsi1 <= 54.1911 )
							ret := -0.066357
						if( rsi1 > 54.1911 )
							ret := 0.127753
					if( d > 44.5186 )
						if( d_k <= 13.4711 )
							ret := -0.043689
						if( d_k > 13.4711 )
							ret := -0.303030
				if( rsi1 > 65.1533 )
					if( smoothD_d <= 57.7237 )
						if( k <= 8.9891 )
							ret := 0.735849 // buy
						if( k > 8.9891 )
							ret := 0.258197
					if( smoothD_d > 57.7237 )
						if( rsi1 <= 66.8385 )
							ret := 0.388601
						if( rsi1 > 66.8385 )
							ret := -0.023684
			if( d > 85.107 )
				if( d_k <= 8.73698 )
					if( rsi1 <= 45.498 )
						if( d <= 92.0568 )
							ret := -0.802469 // sell
						if( d > 92.0568 )
							ret := -0.366667
					if( rsi1 > 45.498 )
						if( rsi1 <= 70.17 )
							ret := -0.200828
						if( rsi1 > 70.17 )
							ret := 0.001389
				if( d_k > 8.73698 )
					if( d <= 86.6984 )
						if( rsi1 <= 68.0728 )
							ret := -0.090909
						if( rsi1 > 68.0728 )
							ret := -0.659574
					if( d > 86.6984 )
						if( k <= 73.3272 )
							ret := -0.814815 // sell
						if( k > 73.3272 )
							ret := -0.532374
	
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
float op_operation = decision_tree_0_UNIUSDT_1Hour_c9e8fb17(rsi1, d, k, smoothD_d, d_k, smoothK_k)

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


