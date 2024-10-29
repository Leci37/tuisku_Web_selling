//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: QCOM_1Min_2BS0_dee4d144 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_QCOM_1Min_2BS0_dee4d144", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_QCOM_1Min_dee4d144(bbp, bullPower, BBPower_Color, bearPower, bbm, rsi1, d, k, smoothD_d, d_k, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( bearPower <= 0.484572 )
		if( bullPower <= -0.753663 )
			if( k <= 23.0613 )
				if( d <= 11.142 )
					if( smoothK_k <= 3.81399 )
						if( bullPower <= -1.05714 )
							if( bullPower <= -2.10391 )
								ret := -0.307692
							if( bullPower > -2.10391 )
								ret := 0.630252
						if( bullPower > -1.05714 )
							if( smoothD_d <= 2.23676 )
								ret := -0.074713
							if( smoothD_d > 2.23676 )
								ret := 0.527273
					if( smoothK_k > 3.81399 )
						if( smoothD_d <= 7.29501 )
							if( smoothK_k <= 7.8341 )
								ret := 0.977273 // buy
							if( smoothK_k > 7.8341 )
								ret := 0.687500
						if( smoothD_d > 7.29501 )
							ret := 0.000000
				if( d > 11.142 )
					if( d_k <= 4.05883 )
						if( rsi1 <= 16.3542 )
							ret := 0.000000
						if( rsi1 > 16.3542 )
							if( rsi1 <= 29.0675 )
								ret := -0.814815 // sell
							if( rsi1 > 29.0675 )
								ret := -0.285714
					if( d_k > 4.05883 )
						if( d <= 14.0635 )
							ret := -0.818182 // sell
						if( d > 14.0635 )
							if( rsi1 <= 35.2722 )
								ret := 0.084211
							if( rsi1 > 35.2722 )
								ret := 0.785714 // buy
			if( k > 23.0613 )
				if( d <= 89.309 )
					if( rsi1 <= 40.6679 )
						if( bullPower <= -1.02755 )
							if( d <= 58.5141 )
								ret := 0.977273 // buy
							if( d > 58.5141 )
								ret := 0.764706 // buy
						if( bullPower > -1.02755 )
							if( bearPower <= -1.15269 )
								ret := 0.346939
							if( bearPower > -1.15269 )
								ret := 0.730769 // buy
					if( rsi1 > 40.6679 )
						if( smoothD_d <= 47.7762 )
							ret := 0.750000 // buy
						if( smoothD_d > 47.7762 )
							if( smoothK_k <= 52.8206 )
								ret := -0.700000 // sell
							if( smoothK_k > 52.8206 )
								ret := 0.222222
				if( d > 89.309 )
					ret := -0.571429
		if( bullPower > -0.753663 )
			if( bullPower <= -0.115468 )
				if( bbm <= 0.099898 )
					if( d <= 7.57033 )
						if( d_k <= 4.71582 )
							if( bullPower <= -0.211241 )
								ret := -0.079404
							if( bullPower > -0.211241 )
								ret := 0.173285
						if( d_k > 4.71582 )
							if( smoothD_d <= 2.46657 )
								ret := -0.866667 // sell
							if( smoothD_d > 2.46657 )
								ret := -0.368421
					if( d > 7.57033 )
						if( k <= 12.2071 )
							if( bullPower <= -0.501327 )
								ret := 0.631068
							if( bullPower > -0.501327 )
								ret := 0.381663
						if( k > 12.2071 )
							if( rsi1 <= 52.7968 )
								ret := 0.192507
							if( rsi1 > 52.7968 )
								ret := -0.092784
				if( bbm > 0.099898 )
					if( k <= 22.1401 )
						if( d_k <= 21.9527 )
							if( d_k <= 5.68123 )
								ret := -0.010559
							if( d_k > 5.68123 )
								ret := 0.100834
						if( d_k > 21.9527 )
							if( d <= 26.2259 )
								ret := -0.812500 // sell
							if( d > 26.2259 )
								ret := -0.106061
					if( k > 22.1401 )
						if( smoothK_k <= 21.3304 )
							if( smoothD_d <= 21.3915 )
								ret := 0.135802
							if( smoothD_d > 21.3915 )
								ret := 0.606557
						if( smoothK_k > 21.3304 )
							if( d_k <= 21.5634 )
								ret := 0.137681
							if( d_k > 21.5634 )
								ret := -0.165877
			if( bullPower > -0.115468 )
				if( rsi1 <= 34.2303 )
					if( d <= 0.613947 )
						if( bearPower <= -0.540772 )
							ret := 0.750000 // buy
						if( bearPower > -0.540772 )
							if( bearPower <= -0.289533 )
								ret := -0.671642
							if( bearPower > -0.289533 )
								ret := -0.246154
					if( d > 0.613947 )
						if( bbm <= 1.34537 )
							if( d_k <= -7.91915 )
								ret := -0.156682
							if( d_k > -7.91915 )
								ret := 0.000686
						if( bbm > 1.34537 )
							if( smoothD_d <= 72.8417 )
								ret := 0.622951
							if( smoothD_d > 72.8417 )
								ret := -0.857143 // sell
				if( rsi1 > 34.2303 )
					if( bearPower <= 0.306746 )
						if( bbp <= 1.66528 )
							if( bbm <= 1.97 )
								ret := 0.054277
							if( bbm > 1.97 )
								ret := -0.523077
						if( bbp > 1.66528 )
							if( bbm <= 2.41875 )
								ret := 0.909091 // buy
							if( bbm > 2.41875 )
								ret := 0.478261
					if( bearPower > 0.306746 )
						if( bullPower <= 0.427241 )
							if( rsi1 <= 81.7781 )
								ret := -0.181452
							if( rsi1 > 81.7781 )
								ret := 0.333333
						if( bullPower > 0.427241 )
							if( rsi1 <= 91.5879 )
								ret := 0.008838
							if( rsi1 > 91.5879 )
								ret := -0.510204
	if( bearPower > 0.484572 )
		if( bbp <= 1.71595 )
			if( rsi1 <= 77.5794 )
				if( bbp <= 1.70556 )
					if( bbm <= 0.009131 )
						if( rsi1 <= 68.088 )
							if( rsi1 <= 58.7062 )
								ret := -0.320988
							if( rsi1 > 58.7062 )
								ret := -0.629310
						if( rsi1 > 68.088 )
							if( d <= 99.7316 )
								ret := -0.156250
							if( d > 99.7316 )
								ret := 0.600000
					if( bbm > 0.009131 )
						if( d_k <= 1.36954 )
							if( rsi1 <= 74.9918 )
								ret := -0.189911
							if( rsi1 > 74.9918 )
								ret := -0.636364
						if( d_k > 1.36954 )
							if( smoothK_k <= 85.9572 )
								ret := 0.201923
							if( smoothK_k > 85.9572 )
								ret := -0.294118
				if( bbp > 1.70556 )
					ret := 0.777778 // buy
			if( rsi1 > 77.5794 )
				if( rsi1 <= 80.6074 )
					if( bullPower <= 0.979023 )
						if( d_k <= 3.11834 )
							if( bbm <= 0.279918 )
								ret := 0.700000 // buy
							if( bbm > 0.279918 )
								ret := 0.000000
						if( d_k > 3.11834 )
							if( bearPower <= 0.650477 )
								ret := 0.333333
							if( bearPower > 0.650477 )
								ret := -0.888889 // sell
					if( bullPower > 0.979023 )
						if( bbm <= 0.484288 )
							ret := -1.000000 // sell
						if( bbm > 0.484288 )
							ret := -0.142857
				if( rsi1 > 80.6074 )
					if( bullPower <= 0.534407 )
						if( rsi1 <= 86.023 )
							ret := 0.166667
						if( rsi1 > 86.023 )
							ret := 1.000000 // buy
					if( bullPower > 0.534407 )
						if( k <= 94.5369 )
							if( d_k <= 3.46165 )
								ret := -0.549020
							if( d_k > 3.46165 )
								ret := 0.210526
						if( k > 94.5369 )
							if( k <= 98.4472 )
								ret := 0.418182
							if( k > 98.4472 )
								ret := -0.191083
		if( bbp > 1.71595 )
			if( k <= 99.0458 )
				if( d_k <= -19.8635 )
					if( bullPower <= 1.36915 )
						if( d_k <= -22.8506 )
							if( bbp <= 1.95211 )
								ret := -0.750000 // sell
							if( bbp > 1.95211 )
								ret := 0.300000
						if( d_k > -22.8506 )
							if( bullPower <= 1.21275 )
								ret := -1.000000 // sell
							if( bullPower > 1.21275 )
								ret := -0.625000
					if( bullPower > 1.36915 )
						if( smoothD_d <= 62.7977 )
							ret := -1.000000 // sell
						if( smoothD_d > 62.7977 )
							if( d_k <= -23.3243 )
								ret := -1.000000 // sell
							if( d_k > -23.3243 )
								ret := -0.714286 // sell
				if( d_k > -19.8635 )
					if( bullPower <= 2.66301 )
						if( bbp <= 2.95582 )
							if( d <= 22.9759 )
								ret := 0.368421
							if( d > 22.9759 )
								ret := -0.290398
						if( bbp > 2.95582 )
							if( d <= 94.4076 )
								ret := 0.323077
							if( d > 94.4076 )
								ret := -0.533333
					if( bullPower > 2.66301 )
						if( d <= 81.8893 )
							ret := -0.571429
						if( d > 81.8893 )
							ret := -1.000000 // sell
			if( k > 99.0458 )
				if( bearPower <= 0.847572 )
					if( bbp <= 1.99991 )
						if( rsi1 <= 81.3988 )
							if( smoothD_d <= 94.068 )
								ret := -0.142857
							if( smoothD_d > 94.068 )
								ret := -0.714286 // sell
						if( rsi1 > 81.3988 )
							if( bbm <= 0.503885 )
								ret := -1.000000 // sell
							if( bbm > 0.503885 )
								ret := -0.714286 // sell
					if( bbp > 1.99991 )
						if( bearPower <= 0.754283 )
							ret := -0.300000
						if( bearPower > 0.754283 )
							ret := 0.625000
				if( bearPower > 0.847572 )
					if( bearPower <= 1.18888 )
						if( bearPower <= 1.08093 )
							if( rsi1 <= 88.043 )
								ret := -0.857143 // sell
							if( rsi1 > 88.043 )
								ret := -0.428571
						if( bearPower > 1.08093 )
							if( bearPower <= 1.13967 )
								ret := 0.000000
							if( bearPower > 1.13967 )
								ret := -0.777778 // sell
					if( bearPower > 1.18888 )
						if( d_k <= -14.6039 )
							ret := -0.857143 // sell
						if( d_k > -14.6039 )
							ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


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
float op_operation = decision_tree_0_QCOM_1Min_dee4d144(bbp, bullPower, BBPower_Color, bearPower, bbm, rsi1, d, k, smoothD_d, d_k, smoothK_k)

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


