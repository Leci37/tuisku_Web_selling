//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: AMZN_1Hour_1S00_a9d6fb58 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMZN_1Hour_1S00_a9d6fb58", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMZN_1Hour_a9d6fb58(rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( smoothD_d <= 10.1445 )
		if( d_k <= 4.93673 )
			if( rsi1 <= 18.1533 )
				if( smoothK_k <= 1.37029 )
					if( d_k <= -0.56477 )
						if( rsi1 <= 13.2845 )
							ret := -0.853933 // sell
						if( rsi1 > 13.2845 )
							ret := -0.015152
					if( d_k > -0.56477 )
						if( smoothD_d <= 1.97503 )
							ret := 0.123558
						if( smoothD_d > 1.97503 )
							ret := -0.584906
				if( smoothK_k > 1.37029 )
					if( rsi1 <= 17.4405 )
						if( k <= 14.5 )
							ret := 0.485401
						if( k > 14.5 )
							ret := -0.090909
					if( rsi1 > 17.4405 )
						if( d_k <= -1.87442 )
							ret := -0.894737 // sell
						if( d_k > -1.87442 )
							ret := 0.428571
			if( rsi1 > 18.1533 )
				if( d_k <= 4.86677 )
					if( rsi1 <= 21.1287 )
						if( smoothK_k <= -1.82077 )
							ret := -0.102190
						if( smoothK_k > -1.82077 )
							ret := -0.468165
					if( rsi1 > 21.1287 )
						if( d_k <= -13.5844 )
							ret := -0.500000
						if( d_k > -13.5844 )
							ret := -0.072473
				if( d_k > 4.86677 )
					if( smoothD_d <= 4.74589 )
						ret := 0.384615
					if( smoothD_d > 4.74589 )
						ret := 0.714286 // buy
		if( d_k > 4.93673 )
			if( rsi1 <= 11.6127 )
				if( smoothD_d <= 3.54215 )
					ret := 0.785714 // buy
				if( smoothD_d > 3.54215 )
					ret := 0.000000
			if( rsi1 > 11.6127 )
				if( smoothD_d <= 6.22851 )
					if( d_k <= 5.48077 )
						if( smoothD_d <= 5.35829 )
							ret := -0.801802 // sell
						if( smoothD_d > 5.35829 )
							ret := -0.055556
					if( d_k > 5.48077 )
						if( rsi1 <= 46.7079 )
							ret := -0.404762
						if( rsi1 > 46.7079 )
							ret := -0.014706
				if( smoothD_d > 6.22851 )
					if( d <= 11.6617 )
						if( d_k <= 6.66935 )
							ret := 0.381818
						if( d_k > 6.66935 )
							ret := -0.154639
					if( d > 11.6617 )
						if( d_k <= 12.1503 )
							ret := -0.442308
						if( d_k > 12.1503 )
							ret := -0.863636 // sell
	if( smoothD_d > 10.1445 )
		if( smoothD_d <= 95.6341 )
			if( d <= 96.4795 )
				if( smoothK_k <= -1.36603 )
					if( rsi1 <= 63.1815 )
						if( d <= 19.5956 )
							ret := 0.293578
						if( d > 19.5956 )
							ret := 0.614458
					if( rsi1 > 63.1815 )
						ret := -0.615385
				if( smoothK_k > -1.36603 )
					if( d_k <= -6.49892 )
						if( rsi1 <= 87.8919 )
							ret := 0.084226
						if( rsi1 > 87.8919 )
							ret := -0.487805
					if( d_k > -6.49892 )
						if( smoothD_d <= 12.6501 )
							ret := 0.225331
						if( smoothD_d > 12.6501 )
							ret := -0.007543
			if( d > 96.4795 )
				if( k <= 94.1788 )
					if( d_k <= 2.9773 )
						ret := -0.500000
					if( d_k > 2.9773 )
						if( d_k <= 3.49343 )
							ret := 0.933333 // buy
						if( d_k > 3.49343 )
							ret := 0.266667
				if( k > 94.1788 )
					if( rsi1 <= 46.1571 )
						if( d_k <= -1.4539 )
							ret := -0.206897
						if( d_k > -1.4539 )
							ret := -0.854545 // sell
					if( rsi1 > 46.1571 )
						if( rsi1 <= 49.2131 )
							ret := 0.390244
						if( rsi1 > 49.2131 )
							ret := -0.182495
		if( smoothD_d > 95.6341 )
			if( rsi1 <= 84.7831 )
				if( d_k <= 0.621475 )
					if( rsi1 <= 60.6866 )
						if( smoothD_d <= 96.5449 )
							ret := 0.260274
						if( smoothD_d > 96.5449 )
							ret := -0.459184
					if( rsi1 > 60.6866 )
						if( d <= 99.9973 )
							ret := 0.287634
						if( d > 99.9973 )
							ret := -0.065574
				if( d_k > 0.621475 )
					if( d_k <= 0.666303 )
						ret := -0.875000 // sell
					if( d_k > 0.666303 )
						if( smoothD_d <= 96.4245 )
							ret := -0.217822
						if( smoothD_d > 96.4245 )
							ret := 0.473684
			if( rsi1 > 84.7831 )
				if( d_k <= -1.01836 )
					ret := -0.461538
				if( d_k > -1.01836 )
					if( smoothK_k <= 95.2446 )
						if( rsi1 <= 87.0396 )
							ret := 0.736842 // buy
						if( rsi1 > 87.0396 )
							ret := -0.354839
					if( smoothK_k > 95.2446 )
						if( k <= 99.8655 )
							ret := 0.641593
						if( k > 99.8655 )
							ret := 0.342105
	
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
float op_operation = decision_tree_0_AMZN_1Hour_a9d6fb58(rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


