//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: LINKUSDT_1Hour_2BS0_acd20333 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LINKUSDT_1Hour_2BS0_acd20333", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LINKUSDT_1Hour_acd20333(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( rsi1 <= 46.3504 )
		if( d_k <= -0.829476 )
			if( bullPower <= 0.012523 )
				if( d_k <= -8.23128 )
					if( rsi1 <= 40.7684 )
						if( bullPower <= -0.271898 )
							ret := 0.394030
						if( bullPower > -0.271898 )
							ret := 0.088235
					if( rsi1 > 40.7684 )
						if( bullPower <= -0.038755 )
							ret := 0.597403
						if( bullPower > -0.038755 )
							ret := 0.241090
				if( d_k > -8.23128 )
					if( rsi1 <= 35.4832 )
						if( bbp <= -1.23105 )
							ret := 0.243182
						if( bbp > -1.23105 )
							ret := -0.109278
					if( rsi1 > 35.4832 )
						if( bullPower <= -0.092042 )
							ret := 0.376894
						if( bullPower > -0.092042 )
							ret := 0.071791
			if( bullPower > 0.012523 )
				if( d <= 69.9944 )
					if( rsi1 <= 43.1366 )
						if( smoothD_d <= 57.668 )
							ret := -0.334299
						if( smoothD_d > 57.668 )
							ret := -0.834483 // sell
					if( rsi1 > 43.1366 )
						if( bullPower <= 0.377679 )
							ret := 0.018844
						if( bullPower > 0.377679 )
							ret := -0.580645
				if( d > 69.9944 )
					if( d <= 80.9011 )
						if( bbm <= 0.531367 )
							ret := 0.076142
						if( bbm > 0.531367 )
							ret := 0.914894 // buy
					if( d > 80.9011 )
						if( smoothK_k <= 86.9334 )
							ret := -0.602564
						if( smoothK_k > 86.9334 )
							ret := -0.016949
		if( d_k > -0.829476 )
			if( bbp <= 0.007803 )
				if( rsi1 <= 32.4326 )
					if( bullPower <= 0.016644 )
						if( d <= 59.0594 )
							ret := -0.329259
						if( d > 59.0594 )
							ret := -0.643204
					if( bullPower > 0.016644 )
						if( smoothK_k <= 64.825 )
							ret := -0.689231
						if( smoothK_k > 64.825 )
							ret := 0.000000
				if( rsi1 > 32.4326 )
					if( bullPower <= 0.001784 )
						if( smoothK_k <= 39.0782 )
							ret := -0.079640
						if( smoothK_k > 39.0782 )
							ret := 0.201336
					if( bullPower > 0.001784 )
						if( smoothK_k <= 84.209 )
							ret := -0.285894
						if( smoothK_k > 84.209 )
							ret := 0.246154
			if( bbp > 0.007803 )
				if( bbm <= 0.0603 )
					if( BBPower_Color <= 0.5 )
						ret := -0.789474 // sell
					if( BBPower_Color > 0.5 )
						if( d_k <= 17.6637 )
							ret := -0.056604
						if( d_k > 17.6637 )
							ret := -0.459459
				if( bbm > 0.0603 )
					if( smoothD_d <= 24.3484 )
						if( bearPower <= -0.161927 )
							ret := -0.069767
						if( bearPower > -0.161927 )
							ret := -0.585324
					if( smoothD_d > 24.3484 )
						if( d_k <= 7.93098 )
							ret := -0.509284
						if( d_k > 7.93098 )
							ret := -0.811224 // sell
	if( rsi1 > 46.3504 )
		if( d_k <= 0.392497 )
			if( bearPower <= -0.084286 )
				if( rsi1 <= 63.3785 )
					if( bbp <= -0.094512 )
						if( d_k <= -6.23475 )
							ret := 0.624615
						if( d_k > -6.23475 )
							ret := 0.387198
					if( bbp > -0.094512 )
						if( d_k <= -3.11092 )
							ret := 0.357873
						if( d_k > -3.11092 )
							ret := 0.025591
				if( rsi1 > 63.3785 )
					if( d <= 74.1999 )
						if( rsi1 <= 66.0548 )
							ret := 0.715385 // buy
						if( rsi1 > 66.0548 )
							ret := 0.903670 // buy
					if( d > 74.1999 )
						if( d <= 90.1931 )
							ret := 0.389262
						if( d > 90.1931 )
							ret := 0.897059 // buy
			if( bearPower > -0.084286 )
				if( rsi1 <= 57.0748 )
					if( d_k <= -0.830782 )
						if( bbp <= 0.106655 )
							ret := 0.137418
						if( bbp > 0.106655 )
							ret := -0.036814
					if( d_k > -0.830782 )
						if( smoothK_k <= 94.4726 )
							ret := -0.370629
						if( smoothK_k > 94.4726 )
							ret := 0.242424
				if( rsi1 > 57.0748 )
					if( BBPower_Color <= 0.5 )
						if( bbp <= 0.00071 )
							ret := 0.383592
						if( bbp > 0.00071 )
							ret := 0.757202 // buy
					if( BBPower_Color > 0.5 )
						if( rsi1 <= 66.3098 )
							ret := 0.116415
						if( rsi1 > 66.3098 )
							ret := 0.272727
		if( d_k > 0.392497 )
			if( bbp <= 0.106153 )
				if( rsi1 <= 60.6614 )
					if( d_k <= 10.8794 )
						if( bearPower <= -0.084035 )
							ret := 0.303602
						if( bearPower > -0.084035 )
							ret := 0.029052
					if( d_k > 10.8794 )
						if( bullPower <= 0.143219 )
							ret := 0.002743
						if( bullPower > 0.143219 )
							ret := -0.341390
				if( rsi1 > 60.6614 )
					if( bearPower <= -0.009267 )
						if( k <= 78.9864 )
							ret := 0.506989
						if( k > 78.9864 )
							ret := 0.172897
					if( bearPower > -0.009267 )
						if( smoothD_d <= 19.9183 )
							ret := -0.716981 // sell
						if( smoothD_d > 19.9183 )
							ret := 0.159732
			if( bbp > 0.106153 )
				if( rsi1 <= 64.0327 )
					if( bearPower <= 0.046069 )
						if( smoothD_d <= 39.1875 )
							ret := -0.068966
						if( smoothD_d > 39.1875 )
							ret := -0.326591
					if( bearPower > 0.046069 )
						if( d_k <= 8.20795 )
							ret := -0.401381
						if( d_k > 8.20795 )
							ret := -0.681490
				if( rsi1 > 64.0327 )
					if( d_k <= 13.8379 )
						if( smoothD_d <= 89.6795 )
							ret := 0.189918
						if( smoothD_d > 89.6795 )
							ret := -0.033103
					if( d_k > 13.8379 )
						if( bearPower <= 0.197523 )
							ret := -0.113043
						if( bearPower > 0.197523 )
							ret := -0.693431
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
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
float op_operation = decision_tree_0_LINKUSDT_1Hour_acd20333(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


