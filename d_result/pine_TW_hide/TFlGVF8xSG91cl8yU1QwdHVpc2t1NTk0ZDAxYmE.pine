//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: LYFT_1Hour_2ST0_594d01ba Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LYFT_1Hour_2ST0_594d01ba", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LYFT_1Hour_594d01ba(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( ema3 <= 14.5096 )
		if( ema13 <= 0.222747 )
			if( rsi1 <= 13.2882 )
				if( ema3 <= 10.555 )
					if( rsi1 <= 11.1221 )
						if( d_k <= 0.440586 )
							ret := 1.000000 // buy
						if( d_k > 0.440586 )
							ret := 0.400000
					if( rsi1 > 11.1221 )
						ret := -0.052632
				if( ema3 > 10.555 )
					if( ema13 <= -0.315583 )
						if( tema <= 10.8594 )
							ret := -0.500000
						if( tema > 10.8594 )
							ret := -0.937500 // sell
					if( ema13 > -0.315583 )
						if( smoothD_d <= -0.8847 )
							ret := -0.636364
						if( smoothD_d > -0.8847 )
							ret := 0.100000
			if( rsi1 > 13.2882 )
				if( d_k <= 14.2733 )
					if( rsi1 <= 16.7381 )
						if( ema1 <= 9.50894 )
							ret := -0.727273 // sell
						if( ema1 > 9.50894 )
							ret := 0.666667
					if( rsi1 > 16.7381 )
						if( ema3 <= 10.0573 )
							ret := 0.190570
						if( ema3 > 10.0573 )
							ret := -0.017180
				if( d_k > 14.2733 )
					if( rsi1 <= 38.1013 )
						if( d <= 72.9697 )
							ret := 0.611765
						if( d > 72.9697 )
							ret := -0.333333
					if( rsi1 > 38.1013 )
						if( d_k <= 20.8696 )
							ret := 0.255411
						if( d_k > 20.8696 )
							ret := -0.107345
		if( ema13 > 0.222747 )
			if( d_k <= -0.872174 )
				if( d_k <= -8.94289 )
					if( smoothD_d <= 84.0063 )
						if( rsi1 <= 75.6097 )
							ret := 0.769231 // buy
						if( rsi1 > 75.6097 )
							ret := -0.017241
					if( smoothD_d > 84.0063 )
						ret := 1.000000 // buy
				if( d_k > -8.94289 )
					if( rsi1 <= 68.3508 )
						if( rsi1 <= 64.6252 )
							ret := 0.111111
						if( rsi1 > 64.6252 )
							ret := 0.875000 // buy
					if( rsi1 > 68.3508 )
						if( d <= 97.1778 )
							ret := -0.191257
						if( d > 97.1778 )
							ret := 0.578947
			if( d_k > -0.872174 )
				if( k <= 99.6135 )
					if( rsi1 <= 82.7544 )
						if( smoothK_k <= 92.2339 )
							ret := 0.355009
						if( smoothK_k > 92.2339 )
							ret := 0.736842 // buy
					if( rsi1 > 82.7544 )
						if( ema12 <= 0.337689 )
							ret := 0.158416
						if( ema12 > 0.337689 )
							ret := -0.564103
				if( k > 99.6135 )
					if( ema12 <= 0.195487 )
						ret := -0.444444
					if( ema12 > 0.195487 )
						if( d <= 99.9976 )
							ret := 1.000000 // buy
						if( d > 99.9976 )
							ret := 0.687500
	if( ema3 > 14.5096 )
		if( ema13 <= 0.660668 )
			if( ema3 <= 33.5699 )
				if( ema3 <= 30.5573 )
					if( ema3 <= 26.9041 )
						if( ema13 <= -1.85727 )
							ret := 0.611111
						if( ema13 > -1.85727 )
							ret := -0.144287
					if( ema3 > 26.9041 )
						if( rsi1 <= 64.1389 )
							ret := 0.102541
						if( rsi1 > 64.1389 )
							ret := -0.255682
				if( ema3 > 30.5573 )
					if( smoothD_d <= 87.3133 )
						if( smoothD_d <= 69.7931 )
							ret := -0.279452
						if( smoothD_d > 69.7931 )
							ret := 0.046980
					if( smoothD_d > 87.3133 )
						if( k <= 99.305 )
							ret := -0.892617 // sell
						if( k > 99.305 )
							ret := 0.263158
			if( ema3 > 33.5699 )
				if( ema3 <= 63.6875 )
					if( rsi1 <= 59.9025 )
						if( d <= 95.857 )
							ret := 0.009105
						if( d > 95.857 )
							ret := 0.326996
					if( rsi1 > 59.9025 )
						if( ema3 <= 51.9751 )
							ret := -0.230490
						if( ema3 > 51.9751 )
							ret := 0.127660
				if( ema3 > 63.6875 )
					if( ema12 <= -0.306916 )
						if( d_k <= -4.80348 )
							ret := 0.043478
						if( d_k > -4.80348 )
							ret := -0.679775
					if( ema12 > -0.306916 )
						if( smoothD_d <= 78.2944 )
							ret := -0.189320
						if( smoothD_d > 78.2944 )
							ret := 0.452830
		if( ema13 > 0.660668 )
			if( tema <= 37.4898 )
				if( k <= 88.6489 )
					if( tema <= 29.11 )
						if( rsi1 <= 62.632 )
							ret := -0.100000
						if( rsi1 > 62.632 )
							ret := 0.655914
					if( tema > 29.11 )
						if( ema2 <= 30.8844 )
							ret := -0.474576
						if( ema2 > 30.8844 )
							ret := 0.351064
				if( k > 88.6489 )
					if( ema2 <= 17.7905 )
						if( ema1 <= 15.9699 )
							ret := 0.937500 // buy
						if( ema1 > 15.9699 )
							ret := -0.068966
					if( ema2 > 17.7905 )
						if( d_k <= -3.43453 )
							ret := 0.090909
						if( d_k > -3.43453 )
							ret := 0.811765 // buy
			if( tema > 37.4898 )
				if( ema13 <= 2.10479 )
					if( d_k <= 0.940259 )
						if( ema13 <= 1.91136 )
							ret := 0.061372
						if( ema13 > 1.91136 )
							ret := 0.702128 // buy
					if( d_k > 0.940259 )
						if( ema1 <= 39.379 )
							ret := 0.320755
						if( ema1 > 39.379 )
							ret := -0.199074
				if( ema13 > 2.10479 )
					if( ema1 <= 49.1 )
						ret := -0.214286
					if( ema1 > 49.1 )
						if( d <= 96.016 )
							ret := -0.714286 // sell
						if( d > 96.016 )
							ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_LYFT_1Hour_594d01ba(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)

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


