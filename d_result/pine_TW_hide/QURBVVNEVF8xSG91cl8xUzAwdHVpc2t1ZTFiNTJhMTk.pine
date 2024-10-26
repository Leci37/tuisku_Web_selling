//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: ADAUSDT_1Hour_1S00_e1b52a19 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADAUSDT_1Hour_1S00_e1b52a19", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADAUSDT_1Hour_e1b52a19(rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( rsi1 <= 42.3387 )
		if( d_k <= -0.777772 )
			if( d_k <= -7.31627 )
				if( d <= 11.5543 )
					if( smoothK_k <= 18.2163 )
						if( d_k <= -10.2359 )
							ret := -0.316667
						if( d_k > -10.2359 )
							ret := 0.379747
					if( smoothK_k > 18.2163 )
						if( smoothD_d <= 7.08025 )
							ret := 1.000000 // buy
						if( smoothD_d > 7.08025 )
							ret := 0.736842 // buy
				if( d > 11.5543 )
					if( rsi1 <= 37.0065 )
						if( k <= 92.8024 )
							ret := -0.061247
						if( k > 92.8024 )
							ret := 0.622222
					if( rsi1 > 37.0065 )
						if( d_k <= -22.7805 )
							ret := -0.160305
						if( d_k > -22.7805 )
							ret := 0.170330
			if( d_k > -7.31627 )
				if( smoothK_k <= 95.5398 )
					if( k <= 33.6814 )
						if( rsi1 <= 25.3311 )
							ret := -0.237576
						if( rsi1 > 25.3311 )
							ret := -0.006534
					if( k > 33.6814 )
						if( rsi1 <= 41.7233 )
							ret := -0.264045
						if( rsi1 > 41.7233 )
							ret := 0.289157
				if( smoothK_k > 95.5398 )
					if( smoothD_d <= 92.017 )
						if( smoothK_k <= 96.8656 )
							ret := 0.625000
						if( smoothK_k > 96.8656 )
							ret := 0.923077 // buy
					if( smoothD_d > 92.017 )
						if( k <= 99.9125 )
							ret := 0.800000 // buy
						if( k > 99.9125 )
							ret := 0.071429
		if( d_k > -0.777772 )
			if( d_k <= 10.6618 )
				if( rsi1 <= 26.6042 )
					if( smoothD_d <= 12.8164 )
						if( smoothK_k <= 9.12045 )
							ret := -0.341942
						if( smoothK_k > 9.12045 )
							ret := 0.275000
					if( smoothD_d > 12.8164 )
						if( d_k <= 1.80777 )
							ret := -0.407407
						if( d_k > 1.80777 )
							ret := -0.657033
				if( rsi1 > 26.6042 )
					if( k <= 84.3934 )
						if( smoothD_d <= 79.2718 )
							ret := -0.199966
						if( smoothD_d > 79.2718 )
							ret := -0.544379
					if( k > 84.3934 )
						if( k <= 97.5571 )
							ret := 0.168000
						if( k > 97.5571 )
							ret := -0.722222 // sell
			if( d_k > 10.6618 )
				if( d <= 67.8553 )
					if( rsi1 <= 31.8316 )
						if( smoothD_d <= 58.3795 )
							ret := -0.548954
						if( smoothD_d > 58.3795 )
							ret := -0.042254
					if( rsi1 > 31.8316 )
						if( smoothK_k <= -0.604555 )
							ret := -0.560000
						if( smoothK_k > -0.604555 )
							ret := -0.257725
				if( d > 67.8553 )
					if( k <= 68.934 )
						if( d_k <= 11.0488 )
							ret := -0.214286
						if( d_k > 11.0488 )
							ret := -0.716981 // sell
					if( k > 68.934 )
						if( rsi1 <= 34.3271 )
							ret := 0.148936
						if( rsi1 > 34.3271 )
							ret := -0.572816
	if( rsi1 > 42.3387 )
		if( d_k <= 1.17575 )
			if( rsi1 <= 64.0151 )
				if( d_k <= -7.6239 )
					if( smoothD_d <= 85.5444 )
						if( d_k <= -16.6051 )
							ret := 0.277300
						if( d_k > -16.6051 )
							ret := 0.152485
					if( smoothD_d > 85.5444 )
						if( smoothK_k <= 96.9693 )
							ret := 0.706522 // buy
						if( smoothK_k > 96.9693 )
							ret := 0.372549
				if( d_k > -7.6239 )
					if( rsi1 <= 53.1872 )
						if( smoothK_k <= -2.78088 )
							ret := -0.441176
						if( smoothK_k > -2.78088 )
							ret := 0.023220
					if( rsi1 > 53.1872 )
						if( smoothD_d <= 9.72015 )
							ret := -0.065263
						if( smoothD_d > 9.72015 )
							ret := 0.179872
			if( rsi1 > 64.0151 )
				if( rsi1 <= 75.738 )
					if( d_k <= -2.16611 )
						if( d_k <= -29.8404 )
							ret := 0.842105 // buy
						if( d_k > -29.8404 )
							ret := 0.341581
					if( d_k > -2.16611 )
						if( smoothD_d <= 95.5938 )
							ret := 0.138601
						if( smoothD_d > 95.5938 )
							ret := 0.438503
				if( rsi1 > 75.738 )
					if( rsi1 <= 79.2329 )
						if( smoothK_k <= 81.885 )
							ret := 0.336700
						if( smoothK_k > 81.885 )
							ret := 0.628319
					if( rsi1 > 79.2329 )
						if( rsi1 <= 88.1082 )
							ret := 0.376329
						if( rsi1 > 88.1082 )
							ret := 0.609091
		if( d_k > 1.17575 )
			if( rsi1 <= 63.8751 )
				if( d <= 22.504 )
					if( smoothD_d <= 14.5998 )
						if( smoothD_d <= 10.0874 )
							ret := 0.015817
						if( smoothD_d > 10.0874 )
							ret := -0.207469
					if( smoothD_d > 14.5998 )
						if( d <= 19.7063 )
							ret := 0.343434
						if( d > 19.7063 )
							ret := 0.000000
				if( d > 22.504 )
					if( d_k <= 13.3728 )
						if( k <= 81.3939 )
							ret := -0.098664
						if( k > 81.3939 )
							ret := -0.007808
					if( d_k > 13.3728 )
						if( d <= 85.3366 )
							ret := -0.243754
						if( d > 85.3366 )
							ret := -0.766234 // sell
			if( rsi1 > 63.8751 )
				if( smoothK_k <= 6.62098 )
					if( smoothK_k <= 1.83878 )
						if( smoothD_d <= 7.86878 )
							ret := 0.604651
						if( smoothD_d > 7.86878 )
							ret := -0.484848
					if( smoothK_k > 1.83878 )
						if( rsi1 <= 66.4402 )
							ret := 0.315789
						if( rsi1 > 66.4402 )
							ret := 0.791209 // buy
				if( smoothK_k > 6.62098 )
					if( rsi1 <= 74.2847 )
						if( k <= 82.8875 )
							ret := 0.095722
						if( k > 82.8875 )
							ret := -0.140990
					if( rsi1 > 74.2847 )
						if( smoothK_k <= 28.4453 )
							ret := -0.328125
						if( smoothK_k > 28.4453 )
							ret := 0.232409
	
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
float op_operation = decision_tree_0_ADAUSDT_1Hour_e1b52a19(rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


