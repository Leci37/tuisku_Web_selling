//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: VETUSDT_15Min_1S00_6b1c5137 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_VETUSDT_15Min_1S00_6b1c5137", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_VETUSDT_15Min_6b1c5137(smoothK_k, d_k, k, smoothD_d, rsi1, d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( smoothK_k <= 56.9058 )
		if( k <= 25.3876 )
			if( d <= 7.89931 )
				if( rsi1 <= 27.7638 )
					if( d_k <= 2.30281 )
						if( smoothK_k <= 3.57991 )
							if( smoothD_d <= -0.634318 )
								ret := -0.588811
							if( smoothD_d > -0.634318 )
								ret := -0.459964
						if( smoothK_k > 3.57991 )
							if( smoothK_k <= 11.0968 )
								ret := -0.636468
							if( smoothK_k > 11.0968 )
								ret := -0.877551 // sell
					if( d_k > 2.30281 )
						if( k <= 1.35357 )
							if( d <= 3.61876 )
								ret := -0.370370
							if( d > 3.61876 )
								ret := -0.520747
						if( k > 1.35357 )
							if( d <= 6.38445 )
								ret := -0.325203
							if( d > 6.38445 )
								ret := 0.116071
				if( rsi1 > 27.7638 )
					if( rsi1 <= 48.6479 )
						if( smoothK_k <= 5.7579 )
							if( d <= 0.374683 )
								ret := -0.505263
							if( d > 0.374683 )
								ret := -0.312121
						if( smoothK_k > 5.7579 )
							if( smoothK_k <= 7.76526 )
								ret := -0.558140
							if( smoothK_k > 7.76526 )
								ret := -0.424920
					if( rsi1 > 48.6479 )
						if( k <= 0.902332 )
							if( k <= 0.000118 )
								ret := -0.246667
							if( k > 0.000118 )
								ret := -0.564356
						if( k > 0.902332 )
							if( d <= 2.77041 )
								ret := 0.087719
							if( d > 2.77041 )
								ret := -0.188226
			if( d > 7.89931 )
				if( rsi1 <= 47.2578 )
					if( rsi1 <= 34.852 )
						if( d_k <= 12.1604 )
							if( smoothD_d <= 10.6302 )
								ret := -0.400111
							if( smoothD_d > 10.6302 )
								ret := -0.275543
						if( d_k > 12.1604 )
							if( rsi1 <= 29.6285 )
								ret := -0.568562
							if( rsi1 > 29.6285 )
								ret := -0.405815
					if( rsi1 > 34.852 )
						if( d <= 48.4845 )
							if( d_k <= -8.29861 )
								ret := -0.441125
							if( d_k > -8.29861 )
								ret := -0.218863
						if( d > 48.4845 )
							if( smoothK_k <= 19.4084 )
								ret := -0.300000
							if( smoothK_k > 19.4084 )
								ret := -0.741573 // sell
				if( rsi1 > 47.2578 )
					if( smoothD_d <= 18.6808 )
						if( rsi1 <= 68.9739 )
							if( smoothK_k <= 5.27172 )
								ret := -0.234300
							if( smoothK_k > 5.27172 )
								ret := -0.084718
						if( rsi1 > 68.9739 )
							if( d_k <= -12.8554 )
								ret := -0.888889 // sell
							if( d_k > -12.8554 )
								ret := 0.524038
					if( smoothD_d > 18.6808 )
						if( rsi1 <= 55.8237 )
							if( smoothK_k <= 21.9456 )
								ret := -0.179678
							if( smoothK_k > 21.9456 )
								ret := 0.356164
						if( rsi1 > 55.8237 )
							if( d_k <= -0.8305 )
								ret := 0.777778 // buy
							if( d_k > -0.8305 )
								ret := 0.169062
		if( k > 25.3876 )
			if( d_k <= 3.66796 )
				if( rsi1 <= 47.2198 )
					if( smoothD_d <= 16.9808 )
						if( smoothK_k <= 27.66 )
							if( rsi1 <= 26.1544 )
								ret := 0.220339
							if( rsi1 > 26.1544 )
								ret := -0.289855
						if( smoothK_k > 27.66 )
							if( smoothD_d <= 16.1589 )
								ret := -0.608392
							if( smoothD_d > 16.1589 )
								ret := -0.204819
					if( smoothD_d > 16.9808 )
						if( d_k <= -12.6373 )
							if( smoothK_k <= 40.02 )
								ret := -0.086239
							if( smoothK_k > 40.02 )
								ret := -0.284644
						if( d_k > -12.6373 )
							if( d <= 47.965 )
								ret := -0.044887
							if( d > 47.965 )
								ret := -0.230769
				if( rsi1 > 47.2198 )
					if( rsi1 <= 67.1818 )
						if( smoothD_d <= 57.6134 )
							if( d_k <= -15.864 )
								ret := -0.111859
							if( d_k > -15.864 )
								ret := 0.119059
						if( smoothD_d > 57.6134 )
							if( k <= 58.7964 )
								ret := -0.807692 // sell
							if( k > 58.7964 )
								ret := -0.520000
					if( rsi1 > 67.1818 )
						if( smoothK_k <= 53.7054 )
							if( d <= 14.5666 )
								ret := -0.263158
							if( d > 14.5666 )
								ret := 0.475669
						if( smoothK_k > 53.7054 )
							if( d_k <= -6.74041 )
								ret := 0.206186
							if( d_k > -6.74041 )
								ret := -0.360465
			if( d_k > 3.66796 )
				if( rsi1 <= 60.7155 )
					if( rsi1 <= 32.9782 )
						if( smoothD_d <= 36.8486 )
							if( rsi1 <= 27.3536 )
								ret := -0.488889
							if( rsi1 > 27.3536 )
								ret := 0.314607
						if( smoothD_d > 36.8486 )
							if( k <= 26.9516 )
								ret := 0.114286
							if( k > 26.9516 )
								ret := -0.426566
					if( rsi1 > 32.9782 )
						if( d <= 51.4668 )
							if( d_k <= 8.68257 )
								ret := -0.075069
							if( d_k > 8.68257 )
								ret := -0.267371
						if( d > 51.4668 )
							if( rsi1 <= 45.8042 )
								ret := -0.151965
							if( rsi1 > 45.8042 )
								ret := -0.042814
				if( rsi1 > 60.7155 )
					if( rsi1 <= 74.546 )
						if( smoothD_d <= 42.5403 )
							if( smoothD_d <= 39.8975 )
								ret := -0.084158
							if( smoothD_d > 39.8975 )
								ret := -0.417910
						if( smoothD_d > 42.5403 )
							if( smoothK_k <= 50.6458 )
								ret := 0.100426
							if( smoothK_k > 50.6458 )
								ret := 0.334135
					if( rsi1 > 74.546 )
						if( d_k <= 14.1526 )
							if( rsi1 <= 84.1434 )
								ret := 0.300000
							if( rsi1 > 84.1434 )
								ret := -0.666667
						if( d_k > 14.1526 )
							if( smoothD_d <= 46.9278 )
								ret := 0.964286 // buy
							if( smoothD_d > 46.9278 )
								ret := 0.659341
	if( smoothK_k > 56.9058 )
		if( smoothK_k <= 83.8302 )
			if( rsi1 <= 57.4894 )
				if( d_k <= -8.33818 )
					if( d_k <= -26.1683 )
						if( rsi1 <= 46.5476 )
							if( rsi1 <= 42.3197 )
								ret := -0.212121
							if( rsi1 > 42.3197 )
								ret := -0.564706
						if( rsi1 > 46.5476 )
							if( smoothK_k <= 64.7085 )
								ret := -0.222222
							if( smoothK_k > 64.7085 )
								ret := 0.258278
					if( d_k > -26.1683 )
						if( d <= 70.8024 )
							if( smoothK_k <= 74.2252 )
								ret := 0.134615
							if( smoothK_k > 74.2252 )
								ret := 0.264682
						if( d > 70.8024 )
							if( d <= 75.2089 )
								ret := -0.059603
							if( d > 75.2089 )
								ret := 0.301075
				if( d_k > -8.33818 )
					if( rsi1 <= 41.3589 )
						if( d_k <= 1.10968 )
							if( rsi1 <= 29.9274 )
								ret := -0.633136
							if( rsi1 > 29.9274 )
								ret := -0.223512
						if( d_k > 1.10968 )
							if( smoothK_k <= 68.3989 )
								ret := -0.098746
							if( smoothK_k > 68.3989 )
								ret := 0.135274
					if( rsi1 > 41.3589 )
						if( smoothD_d <= 51.0664 )
							if( k <= 60.3233 )
								ret := 0.000000
							if( k > 60.3233 )
								ret := -0.846154 // sell
						if( smoothD_d > 51.0664 )
							if( d_k <= -1.94865 )
								ret := 0.141431
							if( d_k > -1.94865 )
								ret := 0.027133
			if( rsi1 > 57.4894 )
				if( k <= 74.961 )
					if( smoothD_d <= 60.3992 )
						if( rsi1 <= 79.0732 )
							if( k <= 60.2914 )
								ret := 0.687500
							if( k > 60.2914 )
								ret := 0.230914
						if( rsi1 > 79.0732 )
							if( d_k <= -0.094247 )
								ret := 0.706897 // buy
							if( d_k > -0.094247 )
								ret := 1.000000 // buy
					if( smoothD_d > 60.3992 )
						if( smoothD_d <= 78.5029 )
							if( smoothK_k <= 63.0475 )
								ret := 0.165496
							if( smoothK_k > 63.0475 )
								ret := 0.018027
						if( smoothD_d > 78.5029 )
							if( k <= 66.4767 )
								ret := -0.112903
							if( k > 66.4767 )
								ret := 0.384735
				if( k > 74.961 )
					if( smoothD_d <= 63.2029 )
						if( smoothK_k <= 73.5344 )
							if( d <= 63.6155 )
								ret := 0.335227
							if( d > 63.6155 )
								ret := -0.291667
						if( smoothK_k > 73.5344 )
							if( rsi1 <= 76.8137 )
								ret := 0.517544
							if( rsi1 > 76.8137 )
								ret := 0.831461 // buy
					if( smoothD_d > 63.2029 )
						if( d <= 87.6443 )
							if( rsi1 <= 75.3438 )
								ret := 0.200659
							if( rsi1 > 75.3438 )
								ret := 0.488756
						if( d > 87.6443 )
							if( d_k <= 8.86031 )
								ret := 0.311008
							if( d_k > 8.86031 )
								ret := 0.601786
		if( smoothK_k > 83.8302 )
			if( rsi1 <= 67.0734 )
				if( smoothD_d <= 93.2196 )
					if( k <= 99.9829 )
						if( k <= 97.5896 )
							if( d_k <= 6.96015 )
								ret := 0.234647
							if( d_k > 6.96015 )
								ret := 0.613208
						if( k > 97.5896 )
							if( smoothD_d <= 88.9556 )
								ret := 0.193642
							if( smoothD_d > 88.9556 )
								ret := -0.095528
					if( k > 99.9829 )
						if( d_k <= -13.8078 )
							if( rsi1 <= 59.9383 )
								ret := 0.134615
							if( rsi1 > 59.9383 )
								ret := 0.417476
						if( d_k > -13.8078 )
							if( rsi1 <= 45.0564 )
								ret := -0.045455
							if( rsi1 > 45.0564 )
								ret := 0.507987
				if( smoothD_d > 93.2196 )
					if( smoothD_d <= 94.8663 )
						if( rsi1 <= 46.779 )
							if( rsi1 <= 34.0291 )
								ret := 0.892857 // buy
							if( rsi1 > 34.0291 )
								ret := -0.052288
						if( rsi1 > 46.779 )
							if( smoothK_k <= 89.1846 )
								ret := 0.618705
							if( smoothK_k > 89.1846 )
								ret := 0.350844
					if( smoothD_d > 94.8663 )
						if( d <= 99.0234 )
							if( rsi1 <= 59.7648 )
								ret := 0.583153
							if( rsi1 > 59.7648 )
								ret := 0.426696
						if( d > 99.0234 )
							if( rsi1 <= 64.9441 )
								ret := 0.396947
							if( rsi1 > 64.9441 )
								ret := 0.000000
			if( rsi1 > 67.0734 )
				if( rsi1 <= 80.0342 )
					if( smoothD_d <= 73.0178 )
						if( k <= 98.5771 )
							if( d <= 58.3124 )
								ret := 0.000000
							if( d > 58.3124 )
								ret := 0.690544
						if( k > 98.5771 )
							if( rsi1 <= 76.1935 )
								ret := 0.500000
							if( rsi1 > 76.1935 )
								ret := -1.000000 // sell
					if( smoothD_d > 73.0178 )
						if( d <= 95.3606 )
							if( d_k <= 6.09453 )
								ret := 0.372748
							if( d_k > 6.09453 )
								ret := -0.123077
						if( d > 95.3606 )
							if( k <= 92.9439 )
								ret := 0.680851
							if( k > 92.9439 )
								ret := 0.454237
				if( rsi1 > 80.0342 )
					if( d_k <= -10.3707 )
						if( d <= 65.5684 )
							ret := 0.250000
						if( d > 65.5684 )
							if( smoothK_k <= 86.3681 )
								ret := 1.000000 // buy
							if( smoothK_k > 86.3681 )
								ret := 0.782609 // buy
					if( d_k > -10.3707 )
						if( d_k <= -6.2407 )
							if( smoothK_k <= 96.9958 )
								ret := 0.006993
							if( smoothK_k > 96.9958 )
								ret := 0.474576
						if( d_k > -6.2407 )
							if( d <= 96.0604 )
								ret := 0.516763
							if( d > 96.0604 )
								ret := 0.639898
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_VETUSDT_15Min_6b1c5137(smoothK_k, d_k, k, smoothD_d, rsi1, d)

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


