//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: LINKUSDT_15Min_2BS0_be80a9e6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LINKUSDT_15Min_2BS0_be80a9e6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LINKUSDT_15Min_be80a9e6(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( smoothK_k <= 57.0272 )
		if( rsi1 <= 43.5897 )
			if( bbp <= 0.012159 )
				if( smoothD_d <= 8.68019 )
					if( bullPower <= 0.00905 )
						if( rsi1 <= 32.5401 )
							if( rsi1 <= 21.4839 )
								ret := -0.524301
							if( rsi1 > 21.4839 )
								ret := -0.360969
						if( rsi1 > 32.5401 )
							if( smoothK_k <= -1.31658 )
								ret := 0.034700
							if( smoothK_k > -1.31658 )
								ret := -0.174559
					if( bullPower > 0.00905 )
						if( rsi1 <= 33.6961 )
							if( rsi1 <= 28.8318 )
								ret := -0.871724 // sell
							if( rsi1 > 28.8318 )
								ret := -0.704202 // sell
						if( rsi1 > 33.6961 )
							if( rsi1 <= 39.1266 )
								ret := -0.582933
							if( rsi1 > 39.1266 )
								ret := -0.376956
				if( smoothD_d > 8.68019 )
					if( bbp <= -0.124405 )
						if( bbp <= -0.343306 )
							if( k <= 16.2407 )
								ret := -0.030651
							if( k > 16.2407 )
								ret := 0.303340
						if( bbp > -0.343306 )
							if( d <= 23.8906 )
								ret := -0.147525
							if( d > 23.8906 )
								ret := 0.070409
					if( bbp > -0.124405 )
						if( bullPower <= 0.016084 )
							if( rsi1 <= 33.3323 )
								ret := -0.309599
							if( rsi1 > 33.3323 )
								ret := -0.101150
						if( bullPower > 0.016084 )
							if( rsi1 <= 39.1276 )
								ret := -0.609756
							if( rsi1 > 39.1276 )
								ret := -0.318085
			if( bbp > 0.012159 )
				if( d_k <= -10.4978 )
					if( smoothD_d <= 35.0147 )
						if( bullPower <= 0.030889 )
							if( bullPower <= 0.02348 )
								ret := 0.076923
							if( bullPower > 0.02348 )
								ret := -0.750000 // sell
						if( bullPower > 0.030889 )
							if( bullPower <= 0.036683 )
								ret := 0.812500 // buy
							if( bullPower > 0.036683 )
								ret := 0.161290
					if( smoothD_d > 35.0147 )
						if( BBPower_Color <= 0.5 )
							ret := -1.000000 // sell
						if( BBPower_Color > 0.5 )
							ret := -0.400000
				if( d_k > -10.4978 )
					if( bullPower <= 0.051642 )
						if( bbm <= 0.022023 )
							if( BBPower_Color <= 0.5 )
								ret := -1.000000 // sell
							if( BBPower_Color > 0.5 )
								ret := -0.368421
						if( bbm > 0.022023 )
							if( rsi1 <= 34.1895 )
								ret := -0.859259 // sell
							if( rsi1 > 34.1895 )
								ret := -0.575330
					if( bullPower > 0.051642 )
						if( k <= 25.0377 )
							if( bbp <= 0.106205 )
								ret := -0.840153 // sell
							if( bbp > 0.106205 )
								ret := -0.928821 // sell
						if( k > 25.0377 )
							if( d <= 38.4151 )
								ret := -0.397849
							if( d > 38.4151 )
								ret := -0.783726 // sell
		if( rsi1 > 43.5897 )
			if( bullPower <= 0.048669 )
				if( bbp <= -0.033814 )
					if( rsi1 <= 47.8114 )
						if( bearPower <= -0.103029 )
							if( d_k <= 7.37046 )
								ret := 0.459788
							if( d_k > 7.37046 )
								ret := 0.039474
						if( bearPower > -0.103029 )
							if( smoothD_d <= 71.5719 )
								ret := 0.125205
							if( smoothD_d > 71.5719 )
								ret := -0.478261
					if( rsi1 > 47.8114 )
						if( bbm <= 0.060007 )
							if( k <= 45.4601 )
								ret := 0.188652
							if( k > 45.4601 )
								ret := 0.434447
						if( bbm > 0.060007 )
							if( d_k <= 3.02651 )
								ret := 0.593622
							if( d_k > 3.02651 )
								ret := 0.317269
				if( bbp > -0.033814 )
					if( rsi1 <= 48.6635 )
						if( bbp <= 0.005158 )
							if( k <= 14.9579 )
								ret := 0.104412
							if( k > 14.9579 )
								ret := -0.110523
						if( bbp > 0.005158 )
							if( BBPower_Color <= 0.5 )
								ret := -0.507812
							if( BBPower_Color > 0.5 )
								ret := -0.197828
					if( rsi1 > 48.6635 )
						if( rsi1 <= 64.8812 )
							if( BBPower_Color <= 0.5 )
								ret := 0.128407
							if( BBPower_Color > 0.5 )
								ret := -0.016945
						if( rsi1 > 64.8812 )
							if( BBPower_Color <= 0.5 )
								ret := 0.684615
							if( BBPower_Color > 0.5 )
								ret := 0.192675
			if( bullPower > 0.048669 )
				if( rsi1 <= 59.828 )
					if( d_k <= -9.59562 )
						if( BBPower_Color <= 0.5 )
							if( d_k <= -24.3449 )
								ret := -0.692308
							if( d_k > -24.3449 )
								ret := 0.121693
						if( BBPower_Color > 0.5 )
							if( rsi1 <= 53.5553 )
								ret := -0.508671
							if( rsi1 > 53.5553 )
								ret := -0.084577
					if( d_k > -9.59562 )
						if( bullPower <= 0.105706 )
							if( bbp <= 0.053755 )
								ret := -0.149521
							if( bbp > 0.053755 )
								ret := -0.432290
						if( bullPower > 0.105706 )
							if( bbp <= 0.123942 )
								ret := -0.270796
							if( bbp > 0.123942 )
								ret := -0.704348 // sell
				if( rsi1 > 59.828 )
					if( bearPower <= -0.008808 )
						if( d <= 61.2712 )
							if( BBPower_Color <= 0.5 )
								ret := 0.843537 // buy
							if( BBPower_Color > 0.5 )
								ret := 0.403599
						if( d > 61.2712 )
							if( d_k <= 15.0424 )
								ret := 0.375000
							if( d_k > 15.0424 )
								ret := -0.692308
					if( bearPower > -0.008808 )
						if( bullPower <= 0.132083 )
							if( rsi1 <= 76.5012 )
								ret := 0.017530
							if( rsi1 > 76.5012 )
								ret := 0.651961
						if( bullPower > 0.132083 )
							if( rsi1 <= 69.1637 )
								ret := -0.318943
							if( rsi1 > 69.1637 )
								ret := 0.178626
	if( smoothK_k > 57.0272 )
		if( rsi1 <= 66.2924 )
			if( bearPower <= -0.034003 )
				if( rsi1 <= 45.3792 )
					if( bullPower <= -0.003836 )
						if( rsi1 <= 37.4795 )
							if( bearPower <= -0.369061 )
								ret := 0.623457
							if( bearPower > -0.369061 )
								ret := -0.015133
						if( rsi1 > 37.4795 )
							if( d_k <= 0.895015 )
								ret := 0.432377
							if( d_k > 0.895015 )
								ret := 0.174138
					if( bullPower > -0.003836 )
						if( bearPower <= -0.074835 )
							if( bearPower <= -0.084138 )
								ret := -0.199616
							if( bearPower > -0.084138 )
								ret := 0.102190
						if( bearPower > -0.074835 )
							if( d_k <= 9.93078 )
								ret := -0.406889
							if( d_k > 9.93078 )
								ret := 0.007812
				if( rsi1 > 45.3792 )
					if( bbp <= -0.06434 )
						if( bbm <= 0.037 )
							if( smoothD_d <= 83.6205 )
								ret := 0.303704
							if( smoothD_d > 83.6205 )
								ret := 0.558824
						if( bbm > 0.037 )
							if( d_k <= 19.4542 )
								ret := 0.696674
							if( d_k > 19.4542 )
								ret := -1.000000 // sell
					if( bbp > -0.06434 )
						if( bbp <= 0.022174 )
							if( k <= 87.7507 )
								ret := 0.393822
							if( k > 87.7507 )
								ret := 0.532824
						if( bbp > 0.022174 )
							if( k <= 97.8529 )
								ret := 0.022901
							if( k > 97.8529 )
								ret := 0.804878 // buy
			if( bearPower > -0.034003 )
				if( rsi1 <= 57.3213 )
					if( bearPower <= 0.026969 )
						if( bbp <= 0.028836 )
							if( rsi1 <= 45.4536 )
								ret := -0.171133
							if( rsi1 > 45.4536 )
								ret := 0.074537
						if( bbp > 0.028836 )
							if( rsi1 <= 44.6437 )
								ret := -0.605536
							if( rsi1 > 44.6437 )
								ret := -0.169480
					if( bearPower > 0.026969 )
						if( k <= 77.6243 )
							if( d_k <= 15.8488 )
								ret := -0.669935
							if( d_k > 15.8488 )
								ret := 0.161290
						if( k > 77.6243 )
							if( smoothD_d <= 88.2322 )
								ret := -0.135371
							if( smoothD_d > 88.2322 )
								ret := -0.638889
				if( rsi1 > 57.3213 )
					if( BBPower_Color <= 0.5 )
						if( bullPower <= 0.013229 )
							if( bearPower <= -0.018335 )
								ret := 0.400000
							if( bearPower > -0.018335 )
								ret := 0.155367
						if( bullPower > 0.013229 )
							if( bearPower <= 0.041087 )
								ret := 0.622321
							if( bearPower > 0.041087 )
								ret := 0.076923
					if( BBPower_Color > 0.5 )
						if( d <= 76.3408 )
							if( bbp <= 0.086838 )
								ret := 0.014426
							if( bbp > 0.086838 )
								ret := -0.419708
						if( d > 76.3408 )
							if( smoothK_k <= 88.9538 )
								ret := 0.162454
							if( smoothK_k > 88.9538 )
								ret := -0.027156
		if( rsi1 > 66.2924 )
			if( BBPower_Color <= 0.5 )
				if( smoothK_k <= 94.5835 )
					if( rsi1 <= 67.2785 )
						if( bbm <= 0.035569 )
							if( smoothD_d <= 89.2563 )
								ret := 0.585366
							if( smoothD_d > 89.2563 )
								ret := 0.000000
						if( bbm > 0.035569 )
							if( k <= 86.9129 )
								ret := 0.925926 // buy
							if( k > 86.9129 )
								ret := 0.673267
					if( rsi1 > 67.2785 )
						if( smoothK_k <= 93.9559 )
							if( d_k <= 8.99311 )
								ret := 0.888522 // buy
							if( d_k > 8.99311 )
								ret := -0.400000
						if( smoothK_k > 93.9559 )
							if( d <= 92.7412 )
								ret := 0.850000 // buy
							if( d > 92.7412 )
								ret := 0.269231
				if( smoothK_k > 94.5835 )
					if( bbm <= 0.022081 )
						if( d_k <= -1.95569 )
							if( rsi1 <= 70.5486 )
								ret := 0.560000
							if( rsi1 > 70.5486 )
								ret := 0.892857 // buy
						if( d_k > -1.95569 )
							if( d <= 99.5056 )
								ret := 0.076923
							if( d > 99.5056 )
								ret := 0.750000 // buy
					if( bbm > 0.022081 )
						if( bbp <= -0.000274 )
							if( bearPower <= -0.032953 )
								ret := 0.947464 // buy
							if( bearPower > -0.032953 )
								ret := 0.832168 // buy
						if( bbp > -0.000274 )
							ret := 1.000000 // buy
			if( BBPower_Color > 0.5 )
				if( k <= 87.3928 )
					if( rsi1 <= 78.2248 )
						if( d_k <= 6.86659 )
							if( bullPower <= 0.15814 )
								ret := 0.170933
							if( bullPower > 0.15814 )
								ret := -0.073016
						if( d_k > 6.86659 )
							if( bullPower <= 0.048919 )
								ret := 0.276265
							if( bullPower > 0.048919 )
								ret := 0.539112
					if( rsi1 > 78.2248 )
						if( d <= 88.1786 )
							if( d_k <= -10.617 )
								ret := 0.633094
							if( d_k > -10.617 )
								ret := 0.388792
						if( d > 88.1786 )
							if( bbp <= 0.630231 )
								ret := 0.664835
							if( bbp > 0.630231 )
								ret := -0.400000
				if( k > 87.3928 )
					if( bearPower <= -0.004123 )
						if( rsi1 <= 69.2539 )
							if( smoothD_d <= 84.1869 )
								ret := 0.057471
							if( smoothD_d > 84.1869 )
								ret := 0.605960
						if( rsi1 > 69.2539 )
							if( bullPower <= 0.015003 )
								ret := 0.341463
							if( bullPower > 0.015003 )
								ret := 0.791374 // buy
					if( bearPower > -0.004123 )
						if( rsi1 <= 78.922 )
							if( bbm <= 0.070191 )
								ret := 0.228965
							if( bbm > 0.070191 )
								ret := 0.369287
						if( rsi1 > 78.922 )
							if( bearPower <= 0.039944 )
								ret := 0.689005
							if( bearPower > 0.039944 )
								ret := 0.492174
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_LINKUSDT_15Min_be80a9e6(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


