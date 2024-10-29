//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: ASAN_1Hour_1S00_a9b6476c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ASAN_1Hour_1S00_a9b6476c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ASAN_1Hour_a9b6476c(rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6,max_features=sqrt, min_samples_split=10,random_state=843828734)
	if( d_k <= 7.10277 )
		if( rsi1 <= 56.977 )
			if( k <= 0.724965 )
				if( smoothD_d <= 1.41685 )
					if( rsi1 <= 36.3784 )
						if( smoothK_k <= -2.88971 )
							ret := -0.071770
						if( smoothK_k > -2.88971 )
							ret := 0.178378
					if( rsi1 > 36.3784 )
						if( smoothD_d <= -0.690986 )
							ret := 0.662651
						if( smoothD_d > -0.690986 )
							ret := 0.235294
				if( smoothD_d > 1.41685 )
					if( smoothD_d <= 3.98645 )
						if( rsi1 <= 33.8043 )
							ret := -0.517857
						if( rsi1 > 33.8043 )
							ret := 0.000000
					if( smoothD_d > 3.98645 )
						ret := 0.500000
			if( k > 0.724965 )
				if( d <= 6.41117 )
					if( smoothD_d <= -1.73894 )
						if( k <= 1.57029 )
							ret := 0.235294
						if( k > 1.57029 )
							ret := -0.032258
					if( smoothD_d > -1.73894 )
						if( rsi1 <= 12.4938 )
							ret := -0.721519 // sell
						if( rsi1 > 12.4938 )
							ret := -0.136452
				if( d > 6.41117 )
					if( rsi1 <= 26.0358 )
						if( smoothD_d <= 38.9724 )
							ret := 0.146026
						if( smoothD_d > 38.9724 )
							ret := 0.540816
					if( rsi1 > 26.0358 )
						if( k <= 14.461 )
							ret := 0.063969
						if( k > 14.461 )
							ret := -0.108183
		if( rsi1 > 56.977 )
			if( rsi1 <= 64.1347 )
				if( d <= 85.1713 )
					if( k <= 22.848 )
						if( smoothD_d <= 15.8519 )
							ret := 0.190722
						if( smoothD_d > 15.8519 )
							ret := 0.888889 // buy
					if( k > 22.848 )
						if( k <= 40.7139 )
							ret := -0.226415
						if( k > 40.7139 )
							ret := 0.051893
				if( d > 85.1713 )
					if( d_k <= -5.69509 )
						if( smoothK_k <= 96.9983 )
							ret := 0.614286
						if( smoothK_k > 96.9983 )
							ret := -0.166667
					if( d_k > -5.69509 )
						if( k <= 98.5481 )
							ret := 0.280303
						if( k > 98.5481 )
							ret := -0.202128
			if( rsi1 > 64.1347 )
				if( smoothD_d <= 96.1491 )
					if( k <= 97.2833 )
						if( d <= 94.7802 )
							ret := -0.037659
						if( d > 94.7802 )
							ret := 0.225352
					if( k > 97.2833 )
						if( rsi1 <= 79.9344 )
							ret := -0.277922
						if( rsi1 > 79.9344 )
							ret := -0.009709
				if( smoothD_d > 96.1491 )
					if( smoothK_k <= 96.6517 )
						if( smoothK_k <= 96.4993 )
							ret := 0.627451
						if( smoothK_k > 96.4993 )
							ret := 0.933333 // buy
					if( smoothK_k > 96.6517 )
						if( smoothD_d <= 96.1932 )
							ret := 1.000000 // buy
						if( smoothD_d > 96.1932 )
							ret := 0.115942
	if( d_k > 7.10277 )
		if( d <= 82.7207 )
			if( smoothD_d <= 68.7311 )
				if( smoothD_d <= 8.65253 )
					if( rsi1 <= 53.9635 )
						if( k <= 1.86601 )
							ret := 0.275862
						if( k > 1.86601 )
							ret := 0.781250 // buy
					if( rsi1 > 53.9635 )
						if( k <= 3.4456 )
							ret := -0.285714
						if( k > 3.4456 )
							ret := 1.000000 // buy
				if( smoothD_d > 8.65253 )
					if( rsi1 <= 43.428 )
						if( smoothK_k <= -2.97649 )
							ret := -0.560976
						if( smoothK_k > -2.97649 )
							ret := 0.050496
					if( rsi1 > 43.428 )
						if( rsi1 <= 75.1409 )
							ret := 0.136674
						if( rsi1 > 75.1409 )
							ret := 0.527778
			if( smoothD_d > 68.7311 )
				if( rsi1 <= 71.6191 )
					if( smoothK_k <= 63.2746 )
						if( smoothK_k <= 48.2603 )
							ret := -0.600000
						if( smoothK_k > 48.2603 )
							ret := -0.219231
					if( smoothK_k > 63.2746 )
						if( smoothD_d <= 78.5404 )
							ret := 0.283186
						if( smoothD_d > 78.5404 )
							ret := -0.151515
				if( rsi1 > 71.6191 )
					if( rsi1 <= 75.2184 )
						if( smoothD_d <= 70.3489 )
							ret := 0.750000 // buy
						if( smoothD_d > 70.3489 )
							ret := 0.200000
					if( rsi1 > 75.2184 )
						if( d <= 77.0064 )
							ret := 0.000000
						if( d > 77.0064 )
							ret := 0.833333 // buy
		if( d > 82.7207 )
			if( smoothD_d <= 87.6409 )
				if( smoothK_k <= 74.0393 )
					if( k <= 75.3558 )
						if( d <= 87.1945 )
							ret := 0.204082
						if( d > 87.1945 )
							ret := 0.666667
					if( k > 75.3558 )
						if( rsi1 <= 68.4596 )
							ret := 0.300000
						if( rsi1 > 68.4596 )
							ret := -0.625000
				if( smoothK_k > 74.0393 )
					if( smoothD_d <= 85.3283 )
						if( smoothK_k <= 74.5632 )
							ret := 0.928571 // buy
						if( smoothK_k > 74.5632 )
							ret := 0.716667 // buy
					if( smoothD_d > 85.3283 )
						if( smoothD_d <= 86.8916 )
							ret := 0.108696
						if( smoothD_d > 86.8916 )
							ret := 0.600000
			if( smoothD_d > 87.6409 )
				if( smoothD_d <= 88.9874 )
					if( rsi1 <= 60.966 )
						if( k <= 84.5186 )
							ret := -0.076923
						if( k > 84.5186 )
							ret := 1.000000 // buy
					if( rsi1 > 60.966 )
						if( k <= 83.1488 )
							ret := -0.842105 // sell
						if( k > 83.1488 )
							ret := -0.375000
				if( smoothD_d > 88.9874 )
					if( rsi1 <= 58.2854 )
						if( smoothD_d <= 89.1876 )
							ret := -1.000000 // sell
						if( smoothD_d > 89.1876 )
							ret := -0.034483
					if( rsi1 > 58.2854 )
						if( rsi1 <= 72.3059 )
							ret := 0.777778 // buy
						if( rsi1 > 72.3059 )
							ret := -0.600000
	
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
float op_operation = decision_tree_0_ASAN_1Hour_a9b6476c(rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


