//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: SOLUSDT_15Min_1S00_032d7745 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SOLUSDT_15Min_1S00_032d7745", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SOLUSDT_15Min_032d7745(d_k, d, rsi1, k, smoothD_d, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( rsi1 <= 49.5978 )
		if( d <= 15.9079 )
			if( rsi1 <= 31.225 )
				if( smoothD_d <= -2.8492 )
					if( rsi1 <= 10.0903 )
						if( smoothK_k <= -2.96809 )
							if( rsi1 <= 6.67947 )
								ret := -0.511905
							if( rsi1 > 6.67947 )
								ret := 0.161290
						if( smoothK_k > -2.96809 )
							if( k <= 0.138187 )
								ret := -0.935484 // sell
							if( k > 0.138187 )
								ret := -0.545455
					if( rsi1 > 10.0903 )
						if( rsi1 <= 20.6626 )
							if( rsi1 <= 12.7374 )
								ret := -0.720930 // sell
							if( rsi1 > 12.7374 )
								ret := -0.905882 // sell
						if( rsi1 > 20.6626 )
							if( rsi1 <= 20.9677 )
								ret := 0.307692
							if( rsi1 > 20.9677 )
								ret := -0.700000 // sell
				if( smoothD_d > -2.8492 )
					if( smoothD_d <= 6.05906 )
						if( d_k <= -3.21389 )
							if( smoothK_k <= 15.0096 )
								ret := -0.670391
							if( smoothK_k > 15.0096 )
								ret := -0.322581
						if( d_k > -3.21389 )
							if( smoothK_k <= 0.406099 )
								ret := -0.493411
							if( smoothK_k > 0.406099 )
								ret := -0.385560
					if( smoothD_d > 6.05906 )
						if( k <= 20.4628 )
							if( rsi1 <= 17.0374 )
								ret := -0.529126
							if( rsi1 > 17.0374 )
								ret := -0.308562
						if( k > 20.4628 )
							if( d <= 15.0005 )
								ret := -0.693038
							if( d > 15.0005 )
								ret := -0.375000
			if( rsi1 > 31.225 )
				if( smoothD_d <= 0.342258 )
					if( smoothD_d <= -2.11792 )
						if( d_k <= -0.450191 )
							if( k <= 1.09777 )
								ret := 0.739130 // buy
							if( k > 1.09777 )
								ret := -0.586207
						if( d_k > -0.450191 )
							if( d_k <= 0.406925 )
								ret := -0.642726
							if( d_k > 0.406925 )
								ret := -0.242857
					if( smoothD_d > -2.11792 )
						if( smoothK_k <= 1.09467 )
							if( k <= 3.4116 )
								ret := -0.392405
							if( k > 3.4116 )
								ret := -0.031250
						if( smoothK_k > 1.09467 )
							if( rsi1 <= 47.5262 )
								ret := -0.462025
							if( rsi1 > 47.5262 )
								ret := -0.759259 // sell
				if( smoothD_d > 0.342258 )
					if( k <= 27.7368 )
						if( smoothD_d <= 0.521258 )
							if( smoothK_k <= 4.14969 )
								ret := 0.188976
							if( smoothK_k > 4.14969 )
								ret := -0.687500
						if( smoothD_d > 0.521258 )
							if( smoothD_d <= 11.5078 )
								ret := -0.286490
							if( smoothD_d > 11.5078 )
								ret := -0.203501
					if( k > 27.7368 )
						if( rsi1 <= 43.2716 )
							if( smoothD_d <= 10.3883 )
								ret := -1.000000 // sell
							if( smoothD_d > 10.3883 )
								ret := -0.670732
						if( rsi1 > 43.2716 )
							if( k <= 30.475 )
								ret := -0.434783
							if( k > 30.475 )
								ret := 0.076923
		if( d > 15.9079 )
			if( smoothK_k <= 54.3482 )
				if( k <= 14.5893 )
					if( d_k <= 8.9954 )
						if( k <= 8.64423 )
							if( rsi1 <= 37.6517 )
								ret := 0.111111
							if( rsi1 > 37.6517 )
								ret := 0.833333 // buy
						if( k > 8.64423 )
							if( rsi1 <= 27.7091 )
								ret := 0.034722
							if( rsi1 > 27.7091 )
								ret := -0.327869
					if( d_k > 8.9954 )
						if( smoothK_k <= 9.32598 )
							if( k <= 4.52506 )
								ret := -0.440160
							if( k > 4.52506 )
								ret := -0.321625
						if( smoothK_k > 9.32598 )
							if( d <= 35.6815 )
								ret := -0.644540
							if( d > 35.6815 )
								ret := -0.202703
				if( k > 14.5893 )
					if( rsi1 <= 37.4842 )
						if( d_k <= -20.9575 )
							if( smoothD_d <= 18.3034 )
								ret := -0.125000
							if( smoothD_d > 18.3034 )
								ret := -0.764706 // sell
						if( d_k > -20.9575 )
							if( d_k <= 9.55537 )
								ret := -0.206986
							if( d_k > 9.55537 )
								ret := -0.317555
					if( rsi1 > 37.4842 )
						if( d_k <= 0.040464 )
							if( smoothK_k <= 53.0378 )
								ret := 0.028916
							if( smoothK_k > 53.0378 )
								ret := -0.396104
						if( d_k > 0.040464 )
							if( d <= 33.4867 )
								ret := -0.124097
							if( d > 33.4867 )
								ret := -0.266720
			if( smoothK_k > 54.3482 )
				if( rsi1 <= 42.0836 )
					if( smoothK_k <= 90.0008 )
						if( smoothD_d <= 82.1905 )
							if( d_k <= -21.3478 )
								ret := -0.358696
							if( d_k > -21.3478 )
								ret := -0.075999
						if( smoothD_d > 82.1905 )
							if( rsi1 <= 33.9137 )
								ret := 0.015748
							if( rsi1 > 33.9137 )
								ret := -0.394340
					if( smoothK_k > 90.0008 )
						if( smoothD_d <= 94.1564 )
							if( rsi1 <= 22.9683 )
								ret := -1.000000 // sell
							if( rsi1 > 22.9683 )
								ret := 0.146067
						if( smoothD_d > 94.1564 )
							if( smoothD_d <= 95.1865 )
								ret := -0.607143
							if( smoothD_d > 95.1865 )
								ret := 0.391304
				if( rsi1 > 42.0836 )
					if( d <= 86.9339 )
						if( d <= 45.1088 )
							if( k <= 58.7904 )
								ret := 0.171429
							if( k > 58.7904 )
								ret := -0.294872
						if( d > 45.1088 )
							if( d_k <= -6.57354 )
								ret := 0.164066
							if( d_k > -6.57354 )
								ret := 0.001597
					if( d > 86.9339 )
						if( d <= 99.6334 )
							if( d <= 88.2202 )
								ret := 0.395833
							if( d > 88.2202 )
								ret := 0.168823
						if( d > 99.6334 )
							if( rsi1 <= 47.6182 )
								ret := 0.738095 // buy
							if( rsi1 > 47.6182 )
								ret := 0.375000
	if( rsi1 > 49.5978 )
		if( smoothK_k <= 74.732 )
			if( d_k <= -4.15117 )
				if( k <= 31.9005 )
					if( d_k <= -7.07525 )
						if( d_k <= -14.6104 )
							if( smoothD_d <= 10.9128 )
								ret := -0.025000
							if( smoothD_d > 10.9128 )
								ret := 0.581395
						if( d_k > -14.6104 )
							if( rsi1 <= 68.241 )
								ret := -0.159311
							if( rsi1 > 68.241 )
								ret := 0.411765
					if( d_k > -7.07525 )
						if( smoothK_k <= 7.40205 )
							if( smoothD_d <= -0.464448 )
								ret := 0.312500
							if( smoothD_d > -0.464448 )
								ret := -0.363636
						if( smoothK_k > 7.40205 )
							if( smoothK_k <= 26.4979 )
								ret := 0.150338
							if( smoothK_k > 26.4979 )
								ret := 0.456140
				if( k > 31.9005 )
					if( k <= 76.855 )
						if( d <= 28.8549 )
							if( k <= 50.9618 )
								ret := 0.159593
							if( k > 50.9618 )
								ret := 0.549296
						if( d > 28.8549 )
							if( k <= 41.76 )
								ret := 0.492958
							if( k > 41.76 )
								ret := 0.290220
					if( k > 76.855 )
						if( d_k <= -9.2161 )
							if( rsi1 <= 64.9591 )
								ret := 0.045977
							if( rsi1 > 64.9591 )
								ret := 0.480000
						if( d_k > -9.2161 )
							if( d <= 72.1064 )
								ret := -0.300000
							if( d > 72.1064 )
								ret := 0.545455
			if( d_k > -4.15117 )
				if( rsi1 <= 61.0331 )
					if( k <= 4.41599 )
						if( d_k <= 0.297396 )
							if( rsi1 <= 58.7722 )
								ret := -0.568627
							if( rsi1 > 58.7722 )
								ret := 0.437500
						if( d_k > 0.297396 )
							if( smoothK_k <= 0.663253 )
								ret := -0.175150
							if( smoothK_k > 0.663253 )
								ret := -0.508772
					if( k > 4.41599 )
						if( smoothD_d <= 79.2678 )
							if( d_k <= 3.64625 )
								ret := 0.007151
							if( d_k > 3.64625 )
								ret := -0.081004
						if( smoothD_d > 79.2678 )
							if( k <= 69.9181 )
								ret := -0.067308
							if( k > 69.9181 )
								ret := 0.280061
				if( rsi1 > 61.0331 )
					if( d_k <= 11.3393 )
						if( smoothK_k <= 62.9341 )
							if( d_k <= 6.33714 )
								ret := 0.059721
							if( d_k > 6.33714 )
								ret := -0.085026
						if( smoothK_k > 62.9341 )
							if( rsi1 <= 76.2818 )
								ret := 0.131376
							if( rsi1 > 76.2818 )
								ret := 0.556017
					if( d_k > 11.3393 )
						if( rsi1 <= 72.8749 )
							if( smoothD_d <= 75.5798 )
								ret := 0.152275
							if( smoothD_d > 75.5798 )
								ret := 0.454733
						if( rsi1 > 72.8749 )
							if( d <= 83.3226 )
								ret := 0.636042
							if( d > 83.3226 )
								ret := 0.100000
		if( smoothK_k > 74.732 )
			if( rsi1 <= 70.6122 )
				if( smoothD_d <= 94.5048 )
					if( rsi1 <= 60.652 )
						if( d_k <= -9.59439 )
							if( k <= 88.7166 )
								ret := 0.229875
							if( k > 88.7166 )
								ret := 0.371644
						if( d_k > -9.59439 )
							if( k <= 99.5731 )
								ret := 0.151598
							if( k > 99.5731 )
								ret := 0.463889
					if( rsi1 > 60.652 )
						if( d_k <= -6.99753 )
							if( smoothD_d <= 86.447 )
								ret := 0.372133
							if( smoothD_d > 86.447 )
								ret := 0.643902
						if( d_k > -6.99753 )
							if( smoothD_d <= 72.7006 )
								ret := -0.208333
							if( smoothD_d > 72.7006 )
								ret := 0.306899
				if( smoothD_d > 94.5048 )
					if( d_k <= 2.02044 )
						if( rsi1 <= 55.4597 )
							if( smoothD_d <= 94.9069 )
								ret := 0.812500 // buy
							if( smoothD_d > 94.9069 )
								ret := 0.570093
						if( rsi1 > 55.4597 )
							if( smoothK_k <= 94.8306 )
								ret := 0.140762
							if( smoothK_k > 94.8306 )
								ret := 0.486284
					if( d_k > 2.02044 )
						if( smoothD_d <= 95.3962 )
							if( smoothD_d <= 94.6389 )
								ret := 0.846154 // buy
							if( smoothD_d > 94.6389 )
								ret := 0.521978
						if( smoothD_d > 95.3962 )
							if( smoothD_d <= 95.595 )
								ret := 0.872727 // buy
							if( smoothD_d > 95.595 )
								ret := 0.705128 // buy
			if( rsi1 > 70.6122 )
				if( smoothD_d <= 86.5531 )
					if( d_k <= -10.3441 )
						if( k <= 96.5607 )
							if( rsi1 <= 71.6373 )
								ret := 0.401575
							if( rsi1 > 71.6373 )
								ret := 0.653743
						if( k > 96.5607 )
							if( d <= 86.6015 )
								ret := 0.335548
							if( d > 86.6015 )
								ret := 0.725000 // buy
					if( d_k > -10.3441 )
						if( rsi1 <= 85.1073 )
							if( rsi1 <= 81.4714 )
								ret := 0.308111
							if( rsi1 > 81.4714 )
								ret := 0.017544
						if( rsi1 > 85.1073 )
							if( k <= 96.6561 )
								ret := 0.700000 // buy
							if( k > 96.6561 )
								ret := -1.000000 // sell
				if( smoothD_d > 86.5531 )
					if( d_k <= 0.002276 )
						if( rsi1 <= 81.933 )
							if( k <= 97.7628 )
								ret := 0.295960
							if( k > 97.7628 )
								ret := 0.460401
						if( rsi1 > 81.933 )
							if( smoothD_d <= 91.2944 )
								ret := 0.765957 // buy
							if( smoothD_d > 91.2944 )
								ret := 0.602564
					if( d_k > 0.002276 )
						if( rsi1 <= 92.2586 )
							if( smoothK_k <= 96.6289 )
								ret := 0.610404
							if( smoothK_k > 96.6289 )
								ret := 0.876344 // buy
						if( rsi1 > 92.2586 )
							if( d <= 99.92 )
								ret := -0.166667
							if( d > 99.92 )
								ret := 0.772727 // buy
	
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
float op_operation = decision_tree_0_SOLUSDT_15Min_032d7745(d_k, d, rsi1, k, smoothD_d, smoothK_k)

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


