//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: AAVEUSDT_1Hour_1S00_98218592 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAVEUSDT_1Hour_1S00_98218592", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAVEUSDT_1Hour_98218592(rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( d_k <= 1.78281 )
		if( rsi1 <= 53.5049 )
			if( d_k <= -2.68838 )
				if( smoothD_d <= 4.71829 )
					if( smoothK_k <= 8.16508 )
						if( smoothD_d <= 0.60237 )
							ret := 0.461818
						if( smoothD_d > 0.60237 )
							ret := 0.115702
					if( smoothK_k > 8.16508 )
						if( d_k <= -5.67014 )
							ret := 0.584071
						if( d_k > -5.67014 )
							ret := 0.151899
				if( smoothD_d > 4.71829 )
					if( rsi1 <= 39.9706 )
						if( d_k <= -8.10409 )
							ret := 0.086059
						if( d_k > -8.10409 )
							ret := -0.164841
					if( rsi1 > 39.9706 )
						if( d_k <= -22.9768 )
							ret := 0.374118
						if( d_k > -22.9768 )
							ret := 0.104445
			if( d_k > -2.68838 )
				if( rsi1 <= 31.6963 )
					if( rsi1 <= 16.6095 )
						if( d_k <= 0.189376 )
							ret := -0.633508
						if( d_k > 0.189376 )
							ret := -0.265432
					if( rsi1 > 16.6095 )
						if( smoothD_d <= -1.4999 )
							ret := 0.000000
						if( smoothD_d > -1.4999 )
							ret := -0.340084
				if( rsi1 > 31.6963 )
					if( k <= 2.33225 )
						if( d_k <= -0.416664 )
							ret := 0.081081
						if( d_k > -0.416664 )
							ret := -0.378601
					if( k > 2.33225 )
						if( smoothD_d <= 11.2997 )
							ret := 0.100741
						if( smoothD_d > 11.2997 )
							ret := -0.102617
		if( rsi1 > 53.5049 )
			if( rsi1 <= 76.3122 )
				if( smoothD_d <= 60.1934 )
					if( d_k <= -14.0475 )
						if( smoothD_d <= 32.7593 )
							ret := 0.701220 // buy
						if( smoothD_d > 32.7593 )
							ret := 0.446809
					if( d_k > -14.0475 )
						if( smoothD_d <= -0.671292 )
							ret := 0.819149 // buy
						if( smoothD_d > -0.671292 )
							ret := 0.314176
				if( smoothD_d > 60.1934 )
					if( k <= 81.3709 )
						if( smoothD_d <= 73.8358 )
							ret := 0.048889
						if( smoothD_d > 73.8358 )
							ret := -0.385542
					if( k > 81.3709 )
						if( d_k <= -0.000327 )
							ret := 0.267963
						if( d_k > -0.000327 )
							ret := 0.138148
			if( rsi1 > 76.3122 )
				if( smoothK_k <= 96.7298 )
					if( smoothD_d <= 93.2917 )
						if( k <= 96.6415 )
							ret := 0.452830
						if( k > 96.6415 )
							ret := 0.640625
					if( smoothD_d > 93.2917 )
						if( d <= 96.9461 )
							ret := -0.061224
						if( d > 96.9461 )
							ret := 0.336562
				if( smoothK_k > 96.7298 )
					if( d_k <= -0.029384 )
						if( d <= 99.6642 )
							ret := 0.710204 // buy
						if( d > 99.6642 )
							ret := 0.980769 // buy
					if( d_k > -0.029384 )
						if( rsi1 <= 86.3217 )
							ret := 0.117647
						if( rsi1 > 86.3217 )
							ret := 0.630435
	if( d_k > 1.78281 )
		if( rsi1 <= 49.9928 )
			if( rsi1 <= 32.9638 )
				if( d_k <= 8.3519 )
					if( smoothK_k <= 21.991 )
						if( rsi1 <= 18.4522 )
							ret := -0.612766
						if( rsi1 > 18.4522 )
							ret := -0.245297
					if( smoothK_k > 21.991 )
						if( smoothK_k <= 36.0275 )
							ret := -0.775000 // sell
						if( smoothK_k > 36.0275 )
							ret := -0.402367
				if( d_k > 8.3519 )
					if( d <= 10.1007 )
						if( k <= 0.15152 )
							ret := 0.576923
						if( k > 0.15152 )
							ret := -0.700000 // sell
					if( d > 10.1007 )
						if( d_k <= 16.5975 )
							ret := -0.547493
						if( d_k > 16.5975 )
							ret := -0.687692
			if( rsi1 > 32.9638 )
				if( d <= 80.4156 )
					if( d_k <= 14.3801 )
						if( rsi1 <= 47.9363 )
							ret := -0.218517
						if( rsi1 > 47.9363 )
							ret := -0.039146
					if( d_k > 14.3801 )
						if( d_k <= 15.1311 )
							ret := -0.601626
						if( d_k > 15.1311 )
							ret := -0.310427
				if( d > 80.4156 )
					if( d_k <= 8.0641 )
						if( rsi1 <= 36.4771 )
							ret := 0.424242
						if( rsi1 > 36.4771 )
							ret := -0.283433
					if( d_k > 8.0641 )
						if( k <= 70.4044 )
							ret := -0.854651 // sell
						if( k > 70.4044 )
							ret := -0.588556
		if( rsi1 > 49.9928 )
			if( smoothD_d <= 85.321 )
				if( rsi1 <= 73.7664 )
					if( smoothD_d <= 25.2365 )
						if( d_k <= 19.5354 )
							ret := 0.085000
						if( d_k > 19.5354 )
							ret := 0.600000
					if( smoothD_d > 25.2365 )
						if( d_k <= 11.0003 )
							ret := 0.056367
						if( d_k > 11.0003 )
							ret := -0.216471
				if( rsi1 > 73.7664 )
					if( rsi1 <= 76.085 )
						if( smoothK_k <= 80.7373 )
							ret := 0.618834
						if( smoothK_k > 80.7373 )
							ret := -0.222222
					if( rsi1 > 76.085 )
						if( d_k <= 8.42062 )
							ret := 0.401015
						if( d_k > 8.42062 )
							ret := -0.102362
			if( smoothD_d > 85.321 )
				if( d_k <= 7.96613 )
					if( d <= 93.6372 )
						if( rsi1 <= 67.7129 )
							ret := -0.187629
						if( rsi1 > 67.7129 )
							ret := 0.226708
					if( d > 93.6372 )
						if( rsi1 <= 90.9534 )
							ret := -0.285575
						if( rsi1 > 90.9534 )
							ret := 0.818182 // buy
				if( d_k > 7.96613 )
					if( k <= 83.4572 )
						if( smoothD_d <= 88.0615 )
							ret := -0.715909 // sell
						if( smoothD_d > 88.0615 )
							ret := -0.310345
					if( k > 83.4572 )
						if( smoothD_d <= 92.3215 )
							ret := -0.875000 // sell
						if( smoothD_d > 92.3215 )
							ret := -0.300000
	
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
float op_operation = decision_tree_0_AAVEUSDT_1Hour_98218592(rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


