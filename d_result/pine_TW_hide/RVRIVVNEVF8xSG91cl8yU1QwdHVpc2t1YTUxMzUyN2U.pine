//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: ETHUSDT_1Hour_2ST0_a513527e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETHUSDT_1Hour_2ST0_a513527e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETHUSDT_1Hour_a513527e(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( rsi1 <= 50.1944 )
		if( ema12 <= 0.955754 )
			if( rsi1 <= 36.5513 )
				if( ema1 <= 1067.7 )
					if( rsi1 <= 11.1408 )
						if( ema12 <= -3.63641 )
							ret := 0.909091 // buy
						if( ema12 > -3.63641 )
							ret := 0.181818
					if( rsi1 > 11.1408 )
						if( ema1 <= 126.659 )
							ret := 0.563107
						if( ema1 > 126.659 )
							ret := -0.066841
				if( ema1 > 1067.7 )
					if( d_k <= -1.52567 )
						if( ema12 <= -20.2337 )
							ret := 0.040021
						if( ema12 > -20.2337 )
							ret := -0.196865
					if( d_k > -1.52567 )
						if( ema12 <= -11.6185 )
							ret := -0.384495
						if( ema12 > -11.6185 )
							ret := -0.595551
			if( rsi1 > 36.5513 )
				if( ema12 <= -9.99053 )
					if( d_k <= -2.19329 )
						if( d <= 56.5045 )
							ret := 0.519461
						if( d > 56.5045 )
							ret := 0.340136
					if( d_k > -2.19329 )
						if( rsi1 <= 42.3166 )
							ret := 0.018182
						if( rsi1 > 42.3166 )
							ret := 0.430804
				if( ema12 > -9.99053 )
					if( ema1 <= 1886.15 )
						if( ema12 <= -3.82385 )
							ret := 0.141538
						if( ema12 > -3.82385 )
							ret := -0.043646
					if( ema1 > 1886.15 )
						if( d_k <= 0.983333 )
							ret := 0.002367
						if( d_k > 0.983333 )
							ret := -0.386959
		if( ema12 > 0.955754 )
			if( ema1 <= 1054.78 )
				if( tema <= 388.073 )
					if( d_k <= 1.72728 )
						ret := 0.181818
					if( d_k > 1.72728 )
						if( d_k <= 4.57907 )
							ret := -1.000000 // sell
						if( d_k > 4.57907 )
							ret := -0.227273
				if( tema > 388.073 )
					if( ema12 <= 2.22737 )
						if( ema2 <= 402.211 )
							ret := 0.916667 // buy
						if( ema2 > 402.211 )
							ret := 0.075758
					if( ema12 > 2.22737 )
						if( ema12 <= 4.4162 )
							ret := 0.960000 // buy
						if( ema12 > 4.4162 )
							ret := 0.600000
			if( ema1 > 1054.78 )
				if( d <= 36.6609 )
					if( rsi1 <= 44.4943 )
						if( ema13 <= 27.1941 )
							ret := -0.548223
						if( ema13 > 27.1941 )
							ret := -0.871287 // sell
					if( rsi1 > 44.4943 )
						if( ema12 <= 10.0815 )
							ret := -0.124277
						if( ema12 > 10.0815 )
							ret := -0.565000
				if( d > 36.6609 )
					if( rsi1 <= 47.4783 )
						if( ema12 <= 1.10651 )
							ret := -0.416667
						if( ema12 > 1.10651 )
							ret := -0.759439 // sell
					if( rsi1 > 47.4783 )
						if( ema12 <= 2.13417 )
							ret := -0.170000
						if( ema12 > 2.13417 )
							ret := -0.614650
	if( rsi1 > 50.1944 )
		if( d_k <= 1.30482 )
			if( ema3 <= 1054.36 )
				if( ema2 <= 1035.7 )
					if( ema12 <= 2.22625 )
						if( ema13 <= 2.7864 )
							ret := 0.089482
						if( ema13 > 2.7864 )
							ret := 0.356796
					if( ema12 > 2.22625 )
						if( d_k <= 0.469806 )
							ret := -0.104377
						if( d_k > 0.469806 )
							ret := 0.420290
				if( ema2 > 1035.7 )
					if( ema1 <= 1059.28 )
						ret := -0.400000
					if( ema1 > 1059.28 )
						if( d_k <= -3.04907 )
							ret := -1.000000 // sell
						if( d_k > -3.04907 )
							ret := -0.888889 // sell
			if( ema3 > 1054.36 )
				if( rsi1 <= 69.9033 )
					if( ema12 <= 7.86516 )
						if( ema12 <= -2.91738 )
							ret := 0.628481
						if( ema12 > -2.91738 )
							ret := 0.299941
					if( ema12 > 7.86516 )
						if( rsi1 <= 62.7939 )
							ret := -0.235208
						if( rsi1 > 62.7939 )
							ret := 0.158859
				if( rsi1 > 69.9033 )
					if( ema13 <= 33.5914 )
						if( rsi1 <= 75.1157 )
							ret := 0.504237
						if( rsi1 > 75.1157 )
							ret := 0.679971
					if( ema13 > 33.5914 )
						if( ema2 <= 1383.39 )
							ret := -0.168224
						if( ema2 > 1383.39 )
							ret := 0.391948
		if( d_k > 1.30482 )
			if( ema12 <= 2.10994 )
				if( ema12 <= -0.412902 )
					if( smoothD_d <= 89.4586 )
						if( k <= 44.7214 )
							ret := 0.683230
						if( k > 44.7214 )
							ret := 0.473310
					if( smoothD_d > 89.4586 )
						if( ema13 <= -10.091 )
							ret := -0.297872
						if( ema13 > -10.091 )
							ret := 0.410714
				if( ema12 > -0.412902 )
					if( ema13 <= -6.44367 )
						if( smoothD_d <= 90.4245 )
							ret := -1.000000 // sell
						if( smoothD_d > 90.4245 )
							ret := -0.636364
					if( ema13 > -6.44367 )
						if( ema3 <= 3196.07 )
							ret := 0.183040
						if( ema3 > 3196.07 )
							ret := -0.257576
			if( ema12 > 2.10994 )
				if( rsi1 <= 65.1739 )
					if( d <= 75.458 )
						if( ema13 <= 40.429 )
							ret := 0.021572
						if( ema13 > 40.429 )
							ret := -0.439834
					if( d > 75.458 )
						if( tema <= 1078.17 )
							ret := 0.266667
						if( tema > 1078.17 )
							ret := -0.472510
				if( rsi1 > 65.1739 )
					if( d <= 86.3576 )
						if( rsi1 <= 79.5228 )
							ret := 0.197581
						if( rsi1 > 79.5228 )
							ret := 0.556911
					if( d > 86.3576 )
						if( rsi1 <= 81.4392 )
							ret := -0.156136
						if( rsi1 > 81.4392 )
							ret := 0.191419
	
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

//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_ETHUSDT_1Hour_a513527e(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)

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


