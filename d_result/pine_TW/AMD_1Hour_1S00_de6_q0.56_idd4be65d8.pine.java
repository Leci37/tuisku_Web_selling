//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: AMD_1Hour_1S00_d4be65d8 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMD_1Hour_1S00_d4be65d8", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMD_1Hour_d4be65d8(rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( k <= 3.77555 )
		if( rsi1 <= 35.4728 )
			if( rsi1 <= 21.5625 )
				if( d_k <= 2.42055 )
					if( d <= 2.2996 )
						if( smoothD_d <= -2.28028 )
							ret := -0.255760
						if( smoothD_d > -2.28028 )
							ret := 0.098958
					if( d > 2.2996 )
						if( rsi1 <= 10.9379 )
							ret := -0.796296 // sell
						if( rsi1 > 10.9379 )
							ret := -0.256757
				if( d_k > 2.42055 )
					if( rsi1 <= 16.7997 )
						if( k <= 0.09414 )
							ret := 0.260000
						if( k > 0.09414 )
							ret := 0.658537
					if( rsi1 > 16.7997 )
						if( rsi1 <= 20.8877 )
							ret := -0.211538
						if( rsi1 > 20.8877 )
							ret := 0.588235
			if( rsi1 > 21.5625 )
				if( smoothK_k <= 0.540968 )
					if( smoothK_k <= 0.393432 )
						if( d_k <= 0.209218 )
							ret := -0.459341
						if( d_k > 0.209218 )
							ret := -0.231250
					if( smoothK_k > 0.393432 )
						if( smoothK_k <= 0.417093 )
							ret := 0.733333 // buy
						if( smoothK_k > 0.417093 )
							ret := -0.157895
				if( smoothK_k > 0.540968 )
					if( d <= 2.96938 )
						ret := -1.000000 // sell
					if( d > 2.96938 )
						if( rsi1 <= 29.7578 )
							ret := -0.437500
						if( rsi1 > 29.7578 )
							ret := -1.000000 // sell
		if( rsi1 > 35.4728 )
			if( rsi1 <= 55.9748 )
				if( smoothD_d <= 1.66692 )
					if( smoothD_d <= 0.930494 )
						if( rsi1 <= 51.9897 )
							ret := 0.036408
						if( rsi1 > 51.9897 )
							ret := 0.520000
					if( smoothD_d > 0.930494 )
						if( smoothK_k <= -2.9339 )
							ret := -0.571429
						if( smoothK_k > -2.9339 )
							ret := 0.847826 // buy
				if( smoothD_d > 1.66692 )
					if( d_k <= 15.4485 )
						if( d <= 11.9781 )
							ret := -0.081433
						if( d > 11.9781 )
							ret := -0.626087
					if( d_k > 15.4485 )
						if( smoothD_d <= 17.1599 )
							ret := 0.621622
						if( smoothD_d > 17.1599 )
							ret := -0.016000
			if( rsi1 > 55.9748 )
				if( d_k <= 10.5425 )
					if( d <= 1.14394 )
						if( rsi1 <= 59.4675 )
							ret := -0.375000
						if( rsi1 > 59.4675 )
							ret := 0.666667
					if( d > 1.14394 )
						if( k <= 0.023465 )
							ret := -0.827586 // sell
						if( k > 0.023465 )
							ret := -0.500000
				if( d_k > 10.5425 )
					if( d_k <= 31.3098 )
						if( d_k <= 10.8508 )
							ret := 1.000000 // buy
						if( d_k > 10.8508 )
							ret := 0.000000
					if( d_k > 31.3098 )
						ret := 0.800000 // buy
	if( k > 3.77555 )
		if( d_k <= -5.22426 )
			if( d <= 91.4988 )
				if( d <= 8.95631 )
					if( smoothK_k <= 10.324 )
						if( d_k <= -7.03436 )
							ret := 0.675676
						if( d_k > -7.03436 )
							ret := 0.152381
					if( smoothK_k > 10.324 )
						if( rsi1 <= 19.7238 )
							ret := 0.217391
						if( rsi1 > 19.7238 )
							ret := -0.380597
				if( d > 8.95631 )
					if( k <= 41.1529 )
						if( d_k <= -16.764 )
							ret := 0.526087
						if( d_k > -16.764 )
							ret := 0.134085
					if( k > 41.1529 )
						if( d <= 22.8551 )
							ret := -0.430380
						if( d > 22.8551 )
							ret := 0.053454
			if( d > 91.4988 )
				if( rsi1 <= 77.6154 )
					if( smoothK_k <= 96.9171 )
						if( rsi1 <= 74.4782 )
							ret := 0.659341
						if( rsi1 > 74.4782 )
							ret := -0.900000 // sell
					if( smoothK_k > 96.9171 )
						if( d <= 93.8957 )
							ret := -0.119048
						if( d > 93.8957 )
							ret := 0.354839
				if( rsi1 > 77.6154 )
					if( d <= 94.0849 )
						if( smoothK_k <= 95.1743 )
							ret := 1.000000 // buy
						if( smoothK_k > 95.1743 )
							ret := 0.357143
					if( d > 94.0849 )
						if( smoothK_k <= 96.7299 )
							ret := 0.000000
						if( smoothK_k > 96.7299 )
							ret := 1.000000 // buy
		if( d_k > -5.22426 )
			if( rsi1 <= 21.3195 )
				if( smoothD_d <= 7.68603 )
					if( smoothD_d <= 1.33628 )
						if( rsi1 <= 19.1058 )
							ret := 0.144928
						if( rsi1 > 19.1058 )
							ret := -0.393443
					if( smoothD_d > 1.33628 )
						if( k <= 3.85594 )
							ret := -0.750000 // sell
						if( k > 3.85594 )
							ret := 0.601423
				if( smoothD_d > 7.68603 )
					if( smoothD_d <= 9.68805 )
						if( d_k <= -1.88621 )
							ret := 0.333333
						if( d_k > -1.88621 )
							ret := -0.804878 // sell
					if( smoothD_d > 9.68805 )
						if( rsi1 <= 19.6898 )
							ret := -0.023622
						if( rsi1 > 19.6898 )
							ret := 0.483146
			if( rsi1 > 21.3195 )
				if( rsi1 <= 98.3144 )
					if( rsi1 <= 95.931 )
						if( d <= 90.6131 )
							ret := -0.038953
						if( d > 90.6131 )
							ret := 0.036884
					if( rsi1 > 95.931 )
						if( d <= 99.6293 )
							ret := 0.829787 // buy
						if( d > 99.6293 )
							ret := -0.125000
				if( rsi1 > 98.3144 )
					if( d_k <= -2.6557 )
						ret := 0.000000
					if( d_k > -2.6557 )
						if( k <= 99.8636 )
							ret := -1.000000 // sell
						if( k > 99.8636 )
							ret := -0.761905 // sell
	
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
float op_operation = decision_tree_0_AMD_1Hour_d4be65d8(rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


