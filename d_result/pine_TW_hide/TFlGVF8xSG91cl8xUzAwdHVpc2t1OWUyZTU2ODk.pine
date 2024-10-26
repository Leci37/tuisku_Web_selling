//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: LYFT_1Hour_1S00_9e2e5689 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LYFT_1Hour_1S00_9e2e5689", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LYFT_1Hour_9e2e5689(d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( d <= 28.539 )
		if( d_k <= 16.0246 )
			if( smoothD_d <= 13.719 )
				if( rsi1 <= 13.8764 )
					if( k <= 4.11454 )
						if( smoothD_d <= -1.6307 )
							ret := -0.358696
						if( smoothD_d > -1.6307 )
							ret := 0.086207
					if( k > 4.11454 )
						if( d <= 12.71 )
							ret := -0.596774
						if( d > 12.71 )
							ret := 0.500000
				if( rsi1 > 13.8764 )
					if( rsi1 <= 16.5262 )
						if( smoothD_d <= 1.10248 )
							ret := 0.724832 // buy
						if( smoothD_d > 1.10248 )
							ret := 0.222222
					if( rsi1 > 16.5262 )
						if( smoothD_d <= 7.06371 )
							ret := -0.092533
						if( smoothD_d > 7.06371 )
							ret := 0.031754
			if( smoothD_d > 13.719 )
				if( smoothK_k <= 48.9641 )
					if( smoothK_k <= 41.4608 )
						if( smoothD_d <= 21.9006 )
							ret := -0.129492
						if( smoothD_d > 21.9006 )
							ret := -0.300000
					if( smoothK_k > 41.4608 )
						if( smoothD_d <= 23.7999 )
							ret := -0.202381
						if( smoothD_d > 23.7999 )
							ret := 0.760000 // buy
				if( smoothK_k > 48.9641 )
					ret := -0.791667 // sell
		if( d_k > 16.0246 )
			if( smoothD_d <= 24.3148 )
				if( d <= 24.947 )
					if( rsi1 <= 46.1803 )
						if( k <= 5.20193 )
							ret := 0.291139
						if( k > 5.20193 )
							ret := -0.384615
					if( rsi1 > 46.1803 )
						if( d <= 18.6416 )
							ret := 0.928571 // buy
						if( d > 18.6416 )
							ret := 0.500000
				if( d > 24.947 )
					if( d_k <= 25.1354 )
						if( d <= 26.2881 )
							ret := 1.000000 // buy
						if( d > 26.2881 )
							ret := 0.600000
					if( d_k > 25.1354 )
						ret := 0.230769
			if( smoothD_d > 24.3148 )
				if( rsi1 <= 49.1454 )
					if( smoothK_k <= 3.99821 )
						ret := 0.400000
					if( smoothK_k > 3.99821 )
						ret := -0.166667
				if( rsi1 > 49.1454 )
					ret := -0.692308
	if( d > 28.539 )
		if( rsi1 <= 65.3543 )
			if( d_k <= -22.2042 )
				if( rsi1 <= 36.0453 )
					if( smoothK_k <= 65.4231 )
						if( k <= 64.0624 )
							ret := 0.666667
						if( k > 64.0624 )
							ret := 0.117647
					if( smoothK_k > 65.4231 )
						if( smoothK_k <= 71.0777 )
							ret := 0.967742 // buy
						if( smoothK_k > 71.0777 )
							ret := 0.500000
				if( rsi1 > 36.0453 )
					if( d <= 46.5173 )
						if( rsi1 <= 39.1489 )
							ret := -0.714286 // sell
						if( rsi1 > 39.1489 )
							ret := 0.444444
					if( d > 46.5173 )
						if( smoothD_d <= 60.3037 )
							ret := -0.151832
						if( smoothD_d > 60.3037 )
							ret := 0.355932
			if( d_k > -22.2042 )
				if( rsi1 <= 59.6634 )
					if( d_k <= -13.0804 )
						if( smoothK_k <= 49.8594 )
							ret := 0.389313
						if( smoothK_k > 49.8594 )
							ret := -0.205290
					if( d_k > -13.0804 )
						if( smoothD_d <= 84.5977 )
							ret := 0.048530
						if( smoothD_d > 84.5977 )
							ret := -0.059829
				if( rsi1 > 59.6634 )
					if( d <= 32.8375 )
						if( d_k <= 0.111265 )
							ret := 0.732143 // buy
						if( d_k > 0.111265 )
							ret := 0.096774
					if( d > 32.8375 )
						if( rsi1 <= 63.4607 )
							ret := -0.210678
						if( rsi1 > 63.4607 )
							ret := -0.030928
		if( rsi1 > 65.3543 )
			if( d_k <= 25.3249 )
				if( smoothK_k <= 19.2538 )
					if( k <= 15.7922 )
						ret := 0.416667
					if( k > 15.7922 )
						if( k <= 18.4906 )
							ret := -0.961538 // sell
						if( k > 18.4906 )
							ret := -0.437500
				if( smoothK_k > 19.2538 )
					if( rsi1 <= 91.943 )
						if( d <= 99.1374 )
							ret := 0.090572
						if( d > 99.1374 )
							ret := -0.069333
					if( rsi1 > 91.943 )
						if( d_k <= 0.202145 )
							ret := 0.728814 // buy
						if( d_k > 0.202145 )
							ret := -0.125000
			if( d_k > 25.3249 )
				if( d_k <= 30.1266 )
					if( rsi1 <= 67.5657 )
						ret := 0.307692
					if( rsi1 > 67.5657 )
						if( k <= 34.9307 )
							ret := 0.895833 // buy
						if( k > 34.9307 )
							ret := 0.583333
				if( d_k > 30.1266 )
					ret := -0.071429
	
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
float op_operation = decision_tree_0_LYFT_1Hour_9e2e5689(d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


