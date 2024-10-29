//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: DOGEUSDT_30Min_2ST0_b6170555 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOGEUSDT_30Min_2ST0_b6170555", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOGEUSDT_30Min_b6170555(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( rsi1 <= 41.7418 )
		if( ema1 <= 0.050517 )
			if( ema13 <= -0.000398 )
				if( rsi1 <= 34.9653 )
					if( ema13 <= -0.00267 )
						if( ema13 <= -0.007439 )
							if( ema13 <= -0.007929 )
								ret := 0.500000
							if( ema13 > -0.007929 )
								ret := -0.500000
						if( ema13 > -0.007439 )
							if( ema12 <= -0.001925 )
								ret := 1.000000 // buy
							if( ema12 > -0.001925 )
								ret := 0.692308
					if( ema13 > -0.00267 )
						if( d_k <= -6.47908 )
							if( ema12 <= -0.000374 )
								ret := -0.178571
							if( ema12 > -0.000374 )
								ret := -0.750000 // sell
						if( d_k > -6.47908 )
							if( ema1 <= 0.031582 )
								ret := 0.474227
							if( ema1 > 0.031582 )
								ret := -0.007407
				if( rsi1 > 34.9653 )
					if( smoothD_d <= 62.9776 )
						if( ema1 <= 0.011813 )
							if( d <= 44.2901 )
								ret := -0.250000
							if( d > 44.2901 )
								ret := 1.000000 // buy
						if( ema1 > 0.011813 )
							if( ema2 <= 0.027019 )
								ret := 1.000000 // buy
							if( ema2 > 0.027019 )
								ret := 0.744000 // buy
					if( smoothD_d > 62.9776 )
						if( d <= 68.6683 )
							ret := -1.000000 // sell
						if( d > 68.6683 )
							if( ema12 <= -0.000313 )
								ret := 0.900000 // buy
							if( ema12 > -0.000313 )
								ret := -0.500000
			if( ema13 > -0.000398 )
				if( tema <= 0.017827 )
					if( smoothD_d <= 55.7927 )
						if( ema13 <= -0.000185 )
							if( rsi1 <= 28.6932 )
								ret := 0.263158
							if( rsi1 > 28.6932 )
								ret := 0.694444
						if( ema13 > -0.000185 )
							if( d_k <= 4.85706 )
								ret := 0.090615
							if( d_k > 4.85706 )
								ret := 0.286938
					if( smoothD_d > 55.7927 )
						if( ema3 <= 0.004142 )
							if( tema <= 0.003371 )
								ret := 0.060241
							if( tema > 0.003371 )
								ret := 0.545455
						if( ema3 > 0.004142 )
							if( d <= 81.7675 )
								ret := -0.246154
							if( d > 81.7675 )
								ret := -1.000000 // sell
				if( tema > 0.017827 )
					if( d <= 1.11956 )
						if( tema <= 0.043822 )
							ret := 1.000000 // buy
						if( tema > 0.043822 )
							ret := 0.500000
					if( d > 1.11956 )
						if( ema12 <= -9.2e-05 )
							if( ema13 <= -0.000102 )
								ret := 0.032432
							if( ema13 > -0.000102 )
								ret := 0.818182 // buy
						if( ema12 > -9.2e-05 )
							if( rsi1 <= 40.9001 )
								ret := -0.697479
							if( rsi1 > 40.9001 )
								ret := 0.000000
		if( ema1 > 0.050517 )
			if( d_k <= -3.86711 )
				if( smoothD_d <= 10.6957 )
					if( ema13 <= -0.001014 )
						if( d <= 3.78424 )
							if( tema <= 0.070956 )
								ret := -0.250000
							if( tema > 0.070956 )
								ret := -0.867347 // sell
						if( d > 3.78424 )
							if( k <= 23.1557 )
								ret := 0.001185
							if( k > 23.1557 )
								ret := -0.561404
					if( ema13 > -0.001014 )
						if( ema2 <= 0.075735 )
							if( smoothD_d <= 0.558661 )
								ret := -0.693548
							if( smoothD_d > 0.558661 )
								ret := -0.275949
						if( ema2 > 0.075735 )
							if( ema12 <= -0.000681 )
								ret := -0.032787
							if( ema12 > -0.000681 )
								ret := -0.652273
				if( smoothD_d > 10.6957 )
					if( ema3 <= 0.181427 )
						if( ema12 <= -0.000612 )
							if( rsi1 <= 33.7281 )
								ret := 0.027953
							if( rsi1 > 33.7281 )
								ret := 0.381609
						if( ema12 > -0.000612 )
							if( ema1 <= 0.089116 )
								ret := -0.206178
							if( ema1 > 0.089116 )
								ret := -0.547967
					if( ema3 > 0.181427 )
						if( ema13 <= -0.001435 )
							if( smoothD_d <= 37.4392 )
								ret := 0.435556
							if( smoothD_d > 37.4392 )
								ret := 0.131707
						if( ema13 > -0.001435 )
							if( smoothD_d <= 28.5603 )
								ret := -0.390625
							if( smoothD_d > 28.5603 )
								ret := -0.810345 // sell
			if( d_k > -3.86711 )
				if( ema1 <= 0.086024 )
					if( rsi1 <= 24.6051 )
						if( ema12 <= -0.001839 )
							if( smoothK_k <= 13.8766 )
								ret := -0.500000
							if( smoothK_k > 13.8766 )
								ret := 0.909091 // buy
						if( ema12 > -0.001839 )
							if( rsi1 <= 21.4483 )
								ret := -0.759221 // sell
							if( rsi1 > 21.4483 )
								ret := -0.598848
					if( rsi1 > 24.6051 )
						if( d_k <= 3.58134 )
							if( ema12 <= -0.000393 )
								ret := 0.092857
							if( ema12 > -0.000393 )
								ret := -0.342610
						if( d_k > 3.58134 )
							if( rsi1 <= 36.2802 )
								ret := -0.513778
							if( rsi1 > 36.2802 )
								ret := -0.328346
				if( ema1 > 0.086024 )
					if( rsi1 <= 29.2141 )
						if( ema12 <= -0.001468 )
							if( tema <= 0.181309 )
								ret := -0.516423
							if( tema > 0.181309 )
								ret := -0.782662 // sell
						if( ema12 > -0.001468 )
							if( rsi1 <= 21.7184 )
								ret := -0.909091 // sell
							if( rsi1 > 21.7184 )
								ret := -0.785159 // sell
					if( rsi1 > 29.2141 )
						if( ema12 <= -0.000283 )
							if( d_k <= 1.06211 )
								ret := -0.160968
							if( d_k > 1.06211 )
								ret := -0.440632
						if( ema12 > -0.000283 )
							if( ema12 <= 0.000172 )
								ret := -0.690577
							if( ema12 > 0.000172 )
								ret := -0.858025 // sell
	if( rsi1 > 41.7418 )
		if( d_k <= 4.4031 )
			if( rsi1 <= 64.4459 )
				if( smoothK_k <= 16.0428 )
					if( ema13 <= 0.000701 )
						if( d_k <= -9.39728 )
							if( smoothK_k <= 15.4861 )
								ret := -0.384615
							if( smoothK_k > 15.4861 )
								ret := -0.862069 // sell
						if( d_k > -9.39728 )
							if( rsi1 <= 44.9122 )
								ret := -0.018182
							if( rsi1 > 44.9122 )
								ret := 0.152672
					if( ema13 > 0.000701 )
						if( ema12 <= 0.000246 )
							if( rsi1 <= 44.4109 )
								ret := -0.338028
							if( rsi1 > 44.4109 )
								ret := 0.619289
						if( ema12 > 0.000246 )
							if( k <= 5.60402 )
								ret := -0.401392
							if( k > 5.60402 )
								ret := -0.116054
				if( smoothK_k > 16.0428 )
					if( ema12 <= -0.000264 )
						if( rsi1 <= 50.2791 )
							if( ema12 <= -0.000653 )
								ret := 0.620452
							if( ema12 > -0.000653 )
								ret := 0.296810
						if( rsi1 > 50.2791 )
							if( ema1 <= 0.04972 )
								ret := 0.125000
							if( ema1 > 0.04972 )
								ret := 0.744710 // buy
					if( ema12 > -0.000264 )
						if( ema12 <= -2e-05 )
							if( rsi1 <= 50.9558 )
								ret := -0.041835
							if( rsi1 > 50.9558 )
								ret := 0.445015
						if( ema12 > -2e-05 )
							if( rsi1 <= 55.2825 )
								ret := -0.218118
							if( rsi1 > 55.2825 )
								ret := 0.138122
			if( rsi1 > 64.4459 )
				if( rsi1 <= 73.5141 )
					if( ema3 <= 0.050483 )
						if( smoothK_k <= 77.9097 )
							if( ema2 <= 0.010287 )
								ret := -0.051724
							if( ema2 > 0.010287 )
								ret := 0.429348
						if( smoothK_k > 77.9097 )
							if( smoothD_d <= 68.2518 )
								ret := 0.615385
							if( smoothD_d > 68.2518 )
								ret := -0.255230
					if( ema3 > 0.050483 )
						if( ema13 <= 0.005102 )
							if( ema1 <= 0.109036 )
								ret := 0.468326
							if( ema1 > 0.109036 )
								ret := 0.678164
						if( ema13 > 0.005102 )
							if( rsi1 <= 70.0229 )
								ret := -0.196262
							if( rsi1 > 70.0229 )
								ret := 0.484211
				if( rsi1 > 73.5141 )
					if( ema2 <= 0.05012 )
						if( ema3 <= 0.004395 )
							if( rsi1 <= 73.9788 )
								ret := 0.777778 // buy
							if( rsi1 > 73.9788 )
								ret := -0.543011
						if( ema3 > 0.004395 )
							if( ema12 <= 0.001022 )
								ret := 0.203922
							if( ema12 > 0.001022 )
								ret := -0.477273
					if( ema2 > 0.05012 )
						if( ema1 <= 0.071806 )
							if( rsi1 <= 82.7749 )
								ret := 0.486877
							if( rsi1 > 82.7749 )
								ret := 0.786624 // buy
						if( ema1 > 0.071806 )
							if( d_k <= 0.095772 )
								ret := 0.809083 // buy
							if( d_k > 0.095772 )
								ret := 0.674622
		if( d_k > 4.4031 )
			if( ema12 <= 4.1e-05 )
				if( ema3 <= 0.204167 )
					if( ema12 <= -0.00025 )
						if( smoothK_k <= 10.0599 )
							if( rsi1 <= 44.3845 )
								ret := -0.785714 // sell
							if( rsi1 > 44.3845 )
								ret := 0.375000
						if( smoothK_k > 10.0599 )
							if( ema13 <= -0.000829 )
								ret := 0.383877
							if( ema13 > -0.000829 )
								ret := 0.710366 // buy
					if( ema12 > -0.00025 )
						if( rsi1 <= 46.7317 )
							if( ema2 <= 0.046527 )
								ret := 0.204545
							if( ema2 > 0.046527 )
								ret := -0.264871
						if( rsi1 > 46.7317 )
							if( ema1 <= 0.00651 )
								ret := 0.052229
							if( ema1 > 0.00651 )
								ret := 0.299602
				if( ema3 > 0.204167 )
					if( rsi1 <= 52.9568 )
						if( d_k <= 22.102 )
							if( k <= 57.8588 )
								ret := 0.011070
							if( k > 57.8588 )
								ret := -0.345178
						if( d_k > 22.102 )
							if( d <= 73.0349 )
								ret := -1.000000 // sell
							if( d > 73.0349 )
								ret := -0.750000 // sell
					if( rsi1 > 52.9568 )
						if( ema3 <= 0.327955 )
							if( rsi1 <= 54.298 )
								ret := 0.437500
							if( rsi1 > 54.298 )
								ret := 0.869565 // buy
						if( ema3 > 0.327955 )
							ret := -0.333333
			if( ema12 > 4.1e-05 )
				if( k <= 77.8292 )
					if( tema <= 0.187642 )
						if( smoothK_k <= 38.1139 )
							if( ema3 <= 0.045394 )
								ret := 0.171004
							if( ema3 > 0.045394 )
								ret := -0.303321
						if( smoothK_k > 38.1139 )
							if( rsi1 <= 63.4464 )
								ret := -0.319548
							if( rsi1 > 63.4464 )
								ret := 0.227182
					if( tema > 0.187642 )
						if( d_k <= 9.10579 )
							if( ema3 <= 0.587252 )
								ret := -0.231207
							if( ema3 > 0.587252 )
								ret := 0.687500
						if( d_k > 9.10579 )
							if( ema12 <= 0.000771 )
								ret := -0.480080
							if( ema12 > 0.000771 )
								ret := -0.701599 // sell
				if( k > 77.8292 )
					if( d <= 94.9997 )
						if( rsi1 <= 62.4925 )
							if( ema12 <= 0.000325 )
								ret := -0.025714
							if( ema12 > 0.000325 )
								ret := -0.504298
						if( rsi1 > 62.4925 )
							if( ema13 <= 0.003736 )
								ret := 0.400774
							if( ema13 > 0.003736 )
								ret := -0.005236
					if( d > 94.9997 )
						if( rsi1 <= 60.5515 )
							if( smoothK_k <= 84.3543 )
								ret := 0.571429
							if( smoothK_k > 84.3543 )
								ret := -0.511111
						if( rsi1 > 60.5515 )
							if( ema1 <= 0.024092 )
								ret := -0.750000 // sell
							if( ema1 > 0.024092 )
								ret := 0.641447
	
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
float op_operation = decision_tree_0_DOGEUSDT_30Min_b6170555(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)

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


