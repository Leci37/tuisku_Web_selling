//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: BTCUSDT_1Hour_1S00_b50d2f70 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BTCUSDT_1Hour_1S00_b50d2f70", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BTCUSDT_1Hour_b50d2f70(rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( rsi1 <= 49.9761 )
		if( d_k <= -0.946517 )
			if( rsi1 <= 26.9776 )
				if( d_k <= -1.45681 )
					if( smoothK_k <= 6.30535 )
						if( k <= 6.23638 )
							ret := -0.165289
						if( k > 6.23638 )
							ret := 0.295082
					if( smoothK_k > 6.30535 )
						if( k <= 11.5739 )
							ret := -0.617391
						if( k > 11.5739 )
							ret := -0.176729
				if( d_k > -1.45681 )
					if( rsi1 <= 20.6769 )
						if( d_k <= -1.08237 )
							ret := -0.364865
						if( d_k > -1.08237 )
							ret := 0.148148
					if( rsi1 > 20.6769 )
						if( smoothD_d <= 1.55824 )
							ret := -0.275862
						if( smoothD_d > 1.55824 )
							ret := -0.717391 // sell
			if( rsi1 > 26.9776 )
				if( smoothD_d <= 11.615 )
					if( smoothK_k <= 15.6582 )
						if( smoothD_d <= 4.08566 )
							ret := 0.245654
						if( smoothD_d > 4.08566 )
							ret := 0.067628
					if( smoothK_k > 15.6582 )
						if( smoothK_k <= 19.345 )
							ret := 0.518519
						if( smoothK_k > 19.345 )
							ret := 0.162791
				if( smoothD_d > 11.615 )
					if( k <= 25.5045 )
						if( smoothD_d <= 17.0646 )
							ret := -0.187123
						if( smoothD_d > 17.0646 )
							ret := -0.524476
					if( k > 25.5045 )
						if( d_k <= -8.76248 )
							ret := 0.090033
						if( d_k > -8.76248 )
							ret := -0.061840
		if( d_k > -0.946517 )
			if( rsi1 <= 34.1212 )
				if( rsi1 <= 26.6644 )
					if( d_k <= 10.2615 )
						if( smoothK_k <= 17.7028 )
							ret := -0.389688
						if( smoothK_k > 17.7028 )
							ret := -0.669872
					if( d_k > 10.2615 )
						if( smoothD_d <= 20.5852 )
							ret := -0.613445
						if( smoothD_d > 20.5852 )
							ret := -0.792100 // sell
				if( rsi1 > 26.6644 )
					if( d <= 57.5426 )
						if( k <= 49.5556 )
							ret := -0.309114
						if( k > 49.5556 )
							ret := 0.634146
					if( d > 57.5426 )
						if( d <= 97.551 )
							ret := -0.572835
						if( d > 97.551 )
							ret := 0.700000 // buy
			if( rsi1 > 34.1212 )
				if( d <= 37.6535 )
					if( k <= 29.8064 )
						if( k <= 0.147502 )
							ret := -0.295203
						if( k > 0.147502 )
							ret := -0.117324
					if( k > 29.8064 )
						if( d_k <= 1.78078 )
							ret := -0.136364
						if( d_k > 1.78078 )
							ret := 0.650943
				if( d > 37.6535 )
					if( d_k <= 0.86499 )
						if( d <= 68.0535 )
							ret := -0.244344
						if( d > 68.0535 )
							ret := 0.197970
					if( d_k > 0.86499 )
						if( d <= 80.2283 )
							ret := -0.224479
						if( d > 80.2283 )
							ret := -0.355748
	if( rsi1 > 49.9761 )
		if( d_k <= 1.23733 )
			if( rsi1 <= 62.2677 )
				if( k <= 99.5596 )
					if( d <= 14.9818 )
						if( k <= 9.04577 )
							ret := 0.065445
						if( k > 9.04577 )
							ret := 0.334444
					if( d > 14.9818 )
						if( smoothK_k <= 62.7005 )
							ret := 0.038187
						if( smoothK_k > 62.7005 )
							ret := 0.177551
				if( k > 99.5596 )
					if( rsi1 <= 60.6072 )
						if( rsi1 <= 57.1538 )
							ret := 0.545455
						if( rsi1 > 57.1538 )
							ret := 0.131579
					if( rsi1 > 60.6072 )
						if( d_k <= -11.1879 )
							ret := -0.285714
						if( d_k > -11.1879 )
							ret := 0.873239 // buy
			if( rsi1 > 62.2677 )
				if( rsi1 <= 83.1175 )
					if( d_k <= -1.80672 )
						if( d <= 94.3003 )
							ret := 0.370826
						if( d > 94.3003 )
							ret := 0.566914
					if( d_k > -1.80672 )
						if( smoothK_k <= 94.454 )
							ret := 0.289990
						if( smoothK_k > 94.454 )
							ret := 0.119312
				if( rsi1 > 83.1175 )
					if( d_k <= -4.14983 )
						if( smoothD_d <= 77.5928 )
							ret := 0.852041 // buy
						if( smoothD_d > 77.5928 )
							ret := 0.618182
					if( d_k > -4.14983 )
						if( smoothD_d <= 96.1527 )
							ret := 0.352941
						if( smoothD_d > 96.1527 )
							ret := 0.709571 // buy
		if( d_k > 1.23733 )
			if( rsi1 <= 61.1916 )
				if( smoothK_k <= 21.8481 )
					if( smoothD_d <= 47.6364 )
						if( d_k <= 24.8253 )
							ret := -0.002502
						if( d_k > 24.8253 )
							ret := 0.495050
					if( smoothD_d > 47.6364 )
						if( d_k <= 28.9931 )
							ret := 1.000000 // buy
						if( d_k > 28.9931 )
							ret := -0.952381 // sell
				if( smoothK_k > 21.8481 )
					if( smoothD_d <= 35.4537 )
						if( smoothK_k <= 31.8506 )
							ret := -0.513761
						if( smoothK_k > 31.8506 )
							ret := 0.307692
					if( smoothD_d > 35.4537 )
						if( d_k <= 12.3619 )
							ret := -0.073480
						if( d_k > 12.3619 )
							ret := -0.257749
			if( rsi1 > 61.1916 )
				if( d <= 89.2065 )
					if( smoothK_k <= 75.5393 )
						if( smoothK_k <= 20.2899 )
							ret := 0.273121
						if( smoothK_k > 20.2899 )
							ret := 0.003074
					if( smoothK_k > 75.5393 )
						if( rsi1 <= 80.1037 )
							ret := 0.258427
						if( rsi1 > 80.1037 )
							ret := 0.679739
				if( d > 89.2065 )
					if( d_k <= 5.22111 )
						if( smoothD_d <= 90.6097 )
							ret := 0.198598
						if( smoothD_d > 90.6097 )
							ret := -0.033333
					if( d_k > 5.22111 )
						if( smoothD_d <= 92.5413 )
							ret := -0.230274
						if( smoothD_d > 92.5413 )
							ret := -0.837838 // sell
	
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
float op_operation = decision_tree_0_BTCUSDT_1Hour_b50d2f70(rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


