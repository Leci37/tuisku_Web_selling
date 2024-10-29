//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: AVAXUSDT_1Hour_2ST0_9850a638 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AVAXUSDT_1Hour_2ST0_9850a638", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AVAXUSDT_1Hour_9850a638(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( d_k <= 0.020696 )
		if( rsi1 <= 56.8851 )
			if( ema12 <= 0.035735 )
				if( rsi1 <= 46.4401 )
					if( d <= 23.7587 )
						if( d_k <= -5.31525 )
							ret := 0.311206
						if( d_k > -5.31525 )
							ret := 0.017437
					if( d > 23.7587 )
						if( ema12 <= -0.277929 )
							ret := 0.094118
						if( ema12 > -0.277929 )
							ret := -0.196342
				if( rsi1 > 46.4401 )
					if( ema12 <= -0.012139 )
						if( tema <= 84.0986 )
							ret := 0.432423
						if( tema > 84.0986 )
							ret := -0.008929
					if( ema12 > -0.012139 )
						if( smoothD_d <= 29.4781 )
							ret := 0.296512
						if( smoothD_d > 29.4781 )
							ret := -0.056338
			if( ema12 > 0.035735 )
				if( rsi1 <= 48.8499 )
					if( smoothD_d <= 2.42629 )
						if( ema3 <= 95.4346 )
							ret := -0.260417
						if( ema3 > 95.4346 )
							ret := 0.866667 // buy
					if( smoothD_d > 2.42629 )
						if( smoothD_d <= 8.5049 )
							ret := -0.926471 // sell
						if( smoothD_d > 8.5049 )
							ret := -0.667910
				if( rsi1 > 48.8499 )
					if( ema1 <= 16.9045 )
						if( ema1 <= 4.64813 )
							ret := 0.176471
						if( ema1 > 4.64813 )
							ret := -0.642105
					if( ema1 > 16.9045 )
						if( ema12 <= 0.225307 )
							ret := 0.010512
						if( ema12 > 0.225307 )
							ret := -0.428191
		if( rsi1 > 56.8851 )
			if( ema2 <= 5.31325 )
				if( ema12 <= 0.041165 )
					if( d <= 70.4773 )
						if( d_k <= -26.9608 )
							ret := -0.777778 // sell
						if( d_k > -26.9608 )
							ret := 0.409449
					if( d > 70.4773 )
						if( d <= 99.3757 )
							ret := -0.365079
						if( d > 99.3757 )
							ret := 0.789474 // buy
				if( ema12 > 0.041165 )
					if( smoothK_k <= 90.2839 )
						if( d_k <= -7.9108 )
							ret := -0.540000
						if( d_k > -7.9108 )
							ret := 0.205128
					if( smoothK_k > 90.2839 )
						if( d <= 82.0341 )
							ret := 0.625000
						if( d > 82.0341 )
							ret := -0.775510 // sell
			if( ema2 > 5.31325 )
				if( ema12 <= 0.082977 )
					if( ema3 <= 19.9517 )
						if( d_k <= -13.4925 )
							ret := 0.599609
						if( d_k > -13.4925 )
							ret := 0.340232
					if( ema3 > 19.9517 )
						if( k <= 85.2581 )
							ret := 0.743280 // buy
						if( k > 85.2581 )
							ret := 0.502732
				if( ema12 > 0.082977 )
					if( rsi1 <= 70.4655 )
						if( k <= 79.3012 )
							ret := 0.320817
						if( k > 79.3012 )
							ret := 0.027944
					if( rsi1 > 70.4655 )
						if( ema13 <= 3.08335 )
							ret := 0.506576
						if( ema13 > 3.08335 )
							ret := 0.096970
	if( d_k > 0.020696 )
		if( rsi1 <= 55.8628 )
			if( ema12 <= 0.056991 )
				if( rsi1 <= 37.8267 )
					if( ema1 <= 13.267 )
						if( ema12 <= -0.075817 )
							ret := 0.258126
						if( ema12 > -0.075817 )
							ret := -0.140225
					if( ema1 > 13.267 )
						if( ema12 <= -1.39545 )
							ret := 0.200000
						if( ema12 > -1.39545 )
							ret := -0.510016
				if( rsi1 > 37.8267 )
					if( ema12 <= -0.11872 )
						if( rsi1 <= 41.5834 )
							ret := -0.045926
						if( rsi1 > 41.5834 )
							ret := 0.331675
					if( ema12 > -0.11872 )
						if( rsi1 <= 47.0075 )
							ret := -0.237842
						if( rsi1 > 47.0075 )
							ret := 0.023371
			if( ema12 > 0.056991 )
				if( rsi1 <= 50.9141 )
					if( d <= 38.3338 )
						if( ema2 <= 36.5384 )
							ret := -0.634091
						if( ema2 > 36.5384 )
							ret := -0.374677
					if( d > 38.3338 )
						if( rsi1 <= 46.7198 )
							ret := -0.839695 // sell
						if( rsi1 > 46.7198 )
							ret := -0.643396
				if( rsi1 > 50.9141 )
					if( d <= 37.3397 )
						if( ema12 <= 0.268426 )
							ret := 0.086124
						if( ema12 > 0.268426 )
							ret := -0.349206
					if( d > 37.3397 )
						if( ema13 <= 0.474311 )
							ret := -0.371631
						if( ema13 > 0.474311 )
							ret := -0.704835 // sell
		if( rsi1 > 55.8628 )
			if( ema12 <= 0.144562 )
				if( ema1 <= 15.7104 )
					if( smoothD_d <= 91.8074 )
						if( d_k <= 3.65583 )
							ret := 0.214286
						if( d_k > 3.65583 )
							ret := 0.020305
					if( smoothD_d > 91.8074 )
						if( ema1 <= 3.70263 )
							ret := -0.600000
						if( ema1 > 3.70263 )
							ret := -0.125714
				if( ema1 > 15.7104 )
					if( ema12 <= 0.007316 )
						if( ema2 <= 79.848 )
							ret := 0.741573 // buy
						if( ema2 > 79.848 )
							ret := 0.000000
					if( ema12 > 0.007316 )
						if( ema13 <= 0.292366 )
							ret := 0.286344
						if( ema13 > 0.292366 )
							ret := 0.714286 // buy
			if( ema12 > 0.144562 )
				if( d_k <= 2.76005 )
					if( rsi1 <= 68.7724 )
						if( k <= 92.44 )
							ret := 0.139381
						if( k > 92.44 )
							ret := -0.416309
					if( rsi1 > 68.7724 )
						if( d <= 97.4528 )
							ret := 0.366279
						if( d > 97.4528 )
							ret := 0.037288
				if( d_k > 2.76005 )
					if( d <= 88.2413 )
						if( ema2 <= 67.3379 )
							ret := -0.063182
						if( ema2 > 67.3379 )
							ret := 0.165289
					if( d > 88.2413 )
						if( rsi1 <= 81.4246 )
							ret := -0.397498
						if( rsi1 > 81.4246 )
							ret := 0.202128
	
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
float op_operation = decision_tree_0_AVAXUSDT_1Hour_9850a638(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)

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


