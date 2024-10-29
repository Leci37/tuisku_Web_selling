//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: NVST_30Min_1S00_d37a5d62 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVST_30Min_1S00_d37a5d62", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVST_30Min_d37a5d62(d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( d_k <= 3.07397 )
		if( d_k <= 1.33418 )
			if( d_k <= -10.8599 )
				if( d_k <= -29.7593 )
					if( d_k <= -30.0268 )
						if( smoothD_d <= 30.6393 )
							ret := 0.722222 // buy
						if( smoothD_d > 30.6393 )
							ret := 0.075269
					if( d_k > -30.0268 )
						ret := 0.727273 // buy
				if( d_k > -29.7593 )
					if( k <= 99.3133 )
						if( k <= 89.7747 )
							ret := -0.115789
						if( k > 89.7747 )
							ret := 0.105556
					if( k > 99.3133 )
						if( rsi1 <= 68.2622 )
							ret := -0.510638
						if( rsi1 > 68.2622 )
							ret := 0.034483
			if( d_k > -10.8599 )
				if( k <= 0.096152 )
					if( rsi1 <= 35.5533 )
						if( smoothK_k <= -2.99998 )
							ret := 0.251397
						if( smoothK_k > -2.99998 )
							ret := 0.879310 // buy
					if( rsi1 > 35.5533 )
						if( rsi1 <= 36.9182 )
							ret := -0.750000 // sell
						if( rsi1 > 36.9182 )
							ret := 0.063830
				if( k > 0.096152 )
					if( rsi1 <= 9.62477 )
						if( d_k <= 0.758556 )
							ret := -0.411765
						if( d_k > 0.758556 )
							ret := -1.000000 // sell
					if( rsi1 > 9.62477 )
						if( smoothK_k <= 95.5985 )
							ret := -0.002474
						if( smoothK_k > 95.5985 )
							ret := 0.110767
		if( d_k > 1.33418 )
			if( rsi1 <= 63.8302 )
				if( d <= 87.5329 )
					if( smoothK_k <= 77.7673 )
						if( k <= 2.1797 )
							ret := -0.284133
						if( k > 2.1797 )
							ret := -0.084728
					if( smoothK_k > 77.7673 )
						if( d_k <= 2.47764 )
							ret := -0.375000
						if( d_k > 2.47764 )
							ret := -0.909091 // sell
				if( d > 87.5329 )
					if( d_k <= 2.05063 )
						if( rsi1 <= 44.2514 )
							ret := 0.882353 // buy
						if( rsi1 > 44.2514 )
							ret := 0.310811
					if( d_k > 2.05063 )
						if( smoothD_d <= 94.3472 )
							ret := -0.140000
						if( smoothD_d > 94.3472 )
							ret := 0.450000
			if( rsi1 > 63.8302 )
				if( k <= 96.3181 )
					if( d_k <= 2.59984 )
						if( smoothK_k <= 89.3791 )
							ret := -0.286765
						if( smoothK_k > 89.3791 )
							ret := -0.614865
					if( d_k > 2.59984 )
						if( rsi1 <= 74.0305 )
							ret := -0.322581
						if( rsi1 > 74.0305 )
							ret := 0.289855
				if( k > 96.3181 )
					if( d_k <= 1.50242 )
						ret := 0.636364
					if( d_k > 1.50242 )
						if( k <= 97.1162 )
							ret := 0.208333
						if( k > 97.1162 )
							ret := -0.555556
	if( d_k > 3.07397 )
		if( rsi1 <= 25.1371 )
			if( smoothK_k <= -2.98714 )
				if( smoothD_d <= 4.12451 )
					if( d_k <= 4.21347 )
						ret := -0.545455
					if( d_k > 4.21347 )
						if( d <= 6.14555 )
							ret := 0.481481
						if( d > 6.14555 )
							ret := 1.000000 // buy
				if( smoothD_d > 4.12451 )
					if( rsi1 <= 18.0456 )
						ret := -0.300000
					if( rsi1 > 18.0456 )
						if( smoothD_d <= 14.3404 )
							ret := -0.733333 // sell
						if( smoothD_d > 14.3404 )
							ret := -0.750000 // sell
			if( smoothK_k > -2.98714 )
				if( smoothK_k <= 0.704127 )
					if( smoothD_d <= 4.84214 )
						if( rsi1 <= 19.7858 )
							ret := 0.090909
						if( rsi1 > 19.7858 )
							ret := 0.697674
					if( smoothD_d > 4.84214 )
						if( rsi1 <= 23.0398 )
							ret := 0.902778 // buy
						if( rsi1 > 23.0398 )
							ret := 0.500000
				if( smoothK_k > 0.704127 )
					if( d <= 67.6203 )
						if( rsi1 <= 13.1358 )
							ret := 0.677419
						if( rsi1 > 13.1358 )
							ret := 0.124579
					if( d > 67.6203 )
						if( d_k <= 7.59198 )
							ret := 0.444444
						if( d_k > 7.59198 )
							ret := 0.892857 // buy
		if( rsi1 > 25.1371 )
			if( d_k <= 5.47254 )
				if( d <= 94.7701 )
					if( smoothK_k <= 7.037 )
						if( d <= 12.1012 )
							ret := 0.200000
						if( d > 12.1012 )
							ret := 0.711538 // buy
					if( smoothK_k > 7.037 )
						if( k <= 27.7958 )
							ret := -0.154206
						if( k > 27.7958 )
							ret := 0.115630
				if( d > 94.7701 )
					if( rsi1 <= 83.7188 )
						if( k <= 91.6623 )
							ret := 0.743902 // buy
						if( k > 91.6623 )
							ret := 0.355372
					if( rsi1 > 83.7188 )
						ret := -0.454545
			if( d_k > 5.47254 )
				if( rsi1 <= 71.3979 )
					if( d_k <= 27.8503 )
						if( rsi1 <= 42.6809 )
							ret := 0.067358
						if( rsi1 > 42.6809 )
							ret := -0.025696
					if( d_k > 27.8503 )
						if( smoothK_k <= 17.6296 )
							ret := -0.177083
						if( smoothK_k > 17.6296 )
							ret := 0.609023
				if( rsi1 > 71.3979 )
					if( smoothK_k <= 67.857 )
						if( smoothK_k <= 64.8689 )
							ret := -0.216931
						if( smoothK_k > 64.8689 )
							ret := 0.382353
					if( smoothK_k > 67.857 )
						if( smoothD_d <= 83.6906 )
							ret := -0.673267
						if( smoothD_d > 83.6906 )
							ret := -0.109589
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_NVST_30Min_d37a5d62(d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


