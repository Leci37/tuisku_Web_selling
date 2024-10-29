//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: BNBUSDT_30Min_2ST0_70a0d419 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BNBUSDT_30Min_2ST0_70a0d419", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BNBUSDT_30Min_70a0d419(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( rsi1 <= 46.7991 )
		if( rsi1 <= 34.0181 )
			if( tema <= 122.966 )
				if( ema1 <= 35.2795 )
					if( smoothK_k <= -1.53471 )
						if( ema2 <= 27.9237 )
							if( ema3 <= 27.0142 )
								ret := -0.800000 // sell
							if( ema3 > 27.0142 )
								ret := -0.291667
						if( ema2 > 27.9237 )
							if( smoothD_d <= -1.8368 )
								ret := 0.884615 // buy
							if( smoothD_d > -1.8368 )
								ret := 0.288660
					if( smoothK_k > -1.53471 )
						if( tema <= 27.0649 )
							if( k <= 11.2071 )
								ret := -0.171875
							if( k > 11.2071 )
								ret := 0.423729
						if( tema > 27.0649 )
							if( ema13 <= -0.10128 )
								ret := -0.267425
							if( ema13 > -0.10128 )
								ret := 0.480519
				if( ema1 > 35.2795 )
					if( d <= 0.590536 )
						if( ema13 <= -1.28111 )
							ret := 0.750000 // buy
						if( ema13 > -1.28111 )
							if( ema13 <= -0.68708 )
								ret := -1.000000 // sell
							if( ema13 > -0.68708 )
								ret := -0.333333
					if( d > 0.590536 )
						if( d_k <= -6.17725 )
							if( ema13 <= -0.959085 )
								ret := 0.000000
							if( ema13 > -0.959085 )
								ret := -0.555556
						if( d_k > -6.17725 )
							if( d_k <= 12.376 )
								ret := 0.699346
							if( d_k > 12.376 )
								ret := 0.272727
			if( tema > 122.966 )
				if( d_k <= -3.58413 )
					if( ema12 <= -2.52047 )
						if( k <= 54.5342 )
							if( rsi1 <= 23.6812 )
								ret := -0.286517
							if( rsi1 > 23.6812 )
								ret := 0.255838
						if( k > 54.5342 )
							if( d_k <= -10.3863 )
								ret := -0.108108
							if( d_k > -10.3863 )
								ret := -0.711443 // sell
					if( ema12 > -2.52047 )
						if( ema1 <= 416.534 )
							if( ema12 <= -1.54979 )
								ret := -0.160763
							if( ema12 > -1.54979 )
								ret := -0.474407
						if( ema1 > 416.534 )
							if( rsi1 <= 28.1462 )
								ret := -0.848684 // sell
							if( rsi1 > 28.1462 )
								ret := -0.690000
				if( d_k > -3.58413 )
					if( rsi1 <= 24.9998 )
						if( d_k <= -1.47718 )
							if( ema2 <= 310.507 )
								ret := -0.423729
							if( ema2 > 310.507 )
								ret := -0.717949 // sell
						if( d_k > -1.47718 )
							if( ema2 <= 315.319 )
								ret := -0.767828 // sell
							if( ema2 > 315.319 )
								ret := -0.872288 // sell
					if( rsi1 > 24.9998 )
						if( ema12 <= -2.86609 )
							if( d <= 23.0511 )
								ret := -0.005128
							if( d > 23.0511 )
								ret := -0.627863
						if( ema12 > -2.86609 )
							if( ema12 <= 0.175881 )
								ret := -0.638064
							if( ema12 > 0.175881 )
								ret := -0.860377 // sell
		if( rsi1 > 34.0181 )
			if( ema13 <= 0.157295 )
				if( ema12 <= -1.2236 )
					if( rsi1 <= 39.4327 )
						if( ema12 <= -3.09607 )
							if( smoothD_d <= 44.764 )
								ret := 0.559271
							if( smoothD_d > 44.764 )
								ret := -0.044053
						if( ema12 > -3.09607 )
							if( ema1 <= 493.93 )
								ret := 0.070958
							if( ema1 > 493.93 )
								ret := -0.380623
					if( rsi1 > 39.4327 )
						if( ema12 <= -2.85193 )
							if( d_k <= -9.3978 )
								ret := 0.817376 // buy
							if( d_k > -9.3978 )
								ret := 0.539730
						if( ema12 > -2.85193 )
							if( tema <= 485.829 )
								ret := 0.516657
							if( tema > 485.829 )
								ret := 0.054054
				if( ema12 > -1.2236 )
					if( tema <= 41.2033 )
						if( k <= 68.4745 )
							if( ema2 <= 27.825 )
								ret := 0.284906
							if( ema2 > 27.825 )
								ret := 0.102333
						if( k > 68.4745 )
							if( ema12 <= -0.241208 )
								ret := -0.779070 // sell
							if( ema12 > -0.241208 )
								ret := -0.078689
					if( tema > 41.2033 )
						if( rsi1 <= 41.6644 )
							if( ema3 <= 333.07 )
								ret := -0.318476
							if( ema3 > 333.07 )
								ret := -0.554875
						if( rsi1 > 41.6644 )
							if( ema12 <= -0.376097 )
								ret := 0.102211
							if( ema12 > -0.376097 )
								ret := -0.347525
			if( ema13 > 0.157295 )
				if( ema12 <= 0.30671 )
					if( ema12 <= -0.285585 )
						if( rsi1 <= 40.2124 )
							if( smoothK_k <= 3.70664 )
								ret := -0.566038
							if( smoothK_k > 3.70664 )
								ret := 0.300000
						if( rsi1 > 40.2124 )
							if( ema3 <= 584.136 )
								ret := 0.489933
							if( ema3 > 584.136 )
								ret := -0.296296
					if( ema12 > -0.285585 )
						if( rsi1 <= 39.5784 )
							if( k <= 0.009299 )
								ret := -0.333333
							if( k > 0.009299 )
								ret := -0.625604
						if( rsi1 > 39.5784 )
							if( ema3 <= 221.075 )
								ret := 0.024876
							if( ema3 > 221.075 )
								ret := -0.321294
				if( ema12 > 0.30671 )
					if( ema12 <= 0.557137 )
						if( ema3 <= 100.519 )
							ret := 1.000000 // buy
						if( ema3 > 100.519 )
							if( ema13 <= 1.87358 )
								ret := -0.616007
							if( ema13 > 1.87358 )
								ret := -0.268041
					if( ema12 > 0.557137 )
						if( smoothK_k <= -2.99557 )
							if( ema2 <= 498.313 )
								ret := -0.701493 // sell
							if( ema2 > 498.313 )
								ret := -0.329412
						if( smoothK_k > -2.99557 )
							if( ema3 <= 206.108 )
								ret := -0.241379
							if( ema3 > 206.108 )
								ret := -0.797311 // sell
	if( rsi1 > 46.7991 )
		if( ema12 <= -0.147026 )
			if( rsi1 <= 54.5472 )
				if( ema12 <= -0.602707 )
					if( smoothD_d <= 52.7012 )
						if( tema <= 551.763 )
							if( ema12 <= -1.28747 )
								ret := 0.906722 // buy
							if( ema12 > -1.28747 )
								ret := 0.744472 // buy
						if( tema > 551.763 )
							if( d_k <= -25.832 )
								ret := -0.684211
							if( d_k > -25.832 )
								ret := 0.465909
					if( smoothD_d > 52.7012 )
						if( ema12 <= -1.57439 )
							if( ema12 <= -4.01844 )
								ret := 0.880165 // buy
							if( ema12 > -4.01844 )
								ret := 0.624855
						if( ema12 > -1.57439 )
							if( ema13 <= -3.61259 )
								ret := -0.231884
							if( ema13 > -3.61259 )
								ret := 0.461338
				if( ema12 > -0.602707 )
					if( smoothK_k <= 57.8781 )
						if( ema13 <= -0.080136 )
							if( ema2 <= 99.1909 )
								ret := -0.583333
							if( ema2 > 99.1909 )
								ret := 0.309735
						if( ema13 > -0.080136 )
							if( rsi1 <= 51.1226 )
								ret := 0.449495
							if( rsi1 > 51.1226 )
								ret := 0.800000 // buy
					if( smoothK_k > 57.8781 )
						if( ema13 <= -1.63634 )
							if( rsi1 <= 52.8203 )
								ret := -0.733333 // sell
							if( rsi1 > 52.8203 )
								ret := -0.121212
						if( ema13 > -1.63634 )
							if( rsi1 <= 50.6141 )
								ret := -0.035928
							if( rsi1 > 50.6141 )
								ret := 0.284091
			if( rsi1 > 54.5472 )
				if( rsi1 <= 57.1454 )
					if( d <= 92.2774 )
						if( ema2 <= 126.878 )
							ret := -0.500000
						if( ema2 > 126.878 )
							if( smoothD_d <= 40.2981 )
								ret := 0.821114 // buy
							if( smoothD_d > 40.2981 )
								ret := 0.649510
					if( d > 92.2774 )
						if( ema12 <= -1.26298 )
							if( ema2 <= 356.542 )
								ret := 0.906250 // buy
							if( ema2 > 356.542 )
								ret := 0.489796
						if( ema12 > -1.26298 )
							if( ema13 <= -4.11717 )
								ret := -0.916667 // sell
							if( ema13 > -4.11717 )
								ret := 0.267045
				if( rsi1 > 57.1454 )
					if( ema12 <= -0.61593 )
						if( tema <= 588.526 )
							if( ema12 <= -1.31657 )
								ret := 0.901701 // buy
							if( ema12 > -1.31657 )
								ret := 0.804810 // buy
						if( tema > 588.526 )
							if( ema1 <= 588.985 )
								ret := -0.105263
							if( ema1 > 588.985 )
								ret := 0.696000
					if( ema12 > -0.61593 )
						if( smoothK_k <= 59.9743 )
							if( tema <= 596.535 )
								ret := 0.857143 // buy
							if( tema > 596.535 )
								ret := 0.428571
						if( smoothK_k > 59.9743 )
							if( ema13 <= -0.110752 )
								ret := 0.657991
							if( ema13 > -0.110752 )
								ret := 0.914286 // buy
		if( ema12 > -0.147026 )
			if( rsi1 <= 62.3545 )
				if( ema12 <= 1.03736 )
					if( ema12 <= 0.386286 )
						if( ema13 <= 0.658315 )
							if( ema12 <= 0.185884 )
								ret := 0.113901
							if( ema12 > 0.185884 )
								ret := -0.041874
						if( ema13 > 0.658315 )
							if( ema12 <= 0.210865 )
								ret := 0.661435
							if( ema12 > 0.210865 )
								ret := 0.302682
					if( ema12 > 0.386286 )
						if( ema2 <= 339.972 )
							if( rsi1 <= 53.8074 )
								ret := -0.473377
							if( rsi1 > 53.8074 )
								ret := -0.016347
						if( ema2 > 339.972 )
							if( smoothD_d <= 52.1923 )
								ret := 0.168317
							if( smoothD_d > 52.1923 )
								ret := -0.039604
				if( ema12 > 1.03736 )
					if( rsi1 <= 56.3281 )
						if( d <= 44.9277 )
							if( ema12 <= 2.41814 )
								ret := -0.481048
							if( ema12 > 2.41814 )
								ret := -0.746584 // sell
						if( d > 44.9277 )
							if( ema2 <= 475.284 )
								ret := -0.868705 // sell
							if( ema2 > 475.284 )
								ret := -0.640394
					if( rsi1 > 56.3281 )
						if( smoothD_d <= 34.0775 )
							if( k <= 11.5034 )
								ret := -0.296053
							if( k > 11.5034 )
								ret := 0.144643
						if( smoothD_d > 34.0775 )
							if( rsi1 <= 60.3247 )
								ret := -0.502833
							if( rsi1 > 60.3247 )
								ret := -0.215527
			if( rsi1 > 62.3545 )
				if( d_k <= 2.53036 )
					if( ema3 <= 70.346 )
						if( ema12 <= 0.20041 )
							if( d <= 99.1822 )
								ret := 0.200810
							if( d > 99.1822 )
								ret := -0.626866
						if( ema12 > 0.20041 )
							if( ema2 <= 51.3425 )
								ret := -0.239316
							if( ema2 > 51.3425 )
								ret := 0.280822
					if( ema3 > 70.346 )
						if( rsi1 <= 70.7435 )
							if( ema12 <= 3.22496 )
								ret := 0.520697
							if( ema12 > 3.22496 )
								ret := 0.161863
						if( rsi1 > 70.7435 )
							if( rsi1 <= 80.0013 )
								ret := 0.664605
							if( rsi1 > 80.0013 )
								ret := 0.801158 // buy
				if( d_k > 2.53036 )
					if( ema13 <= 5.13177 )
						if( k <= 87.0255 )
							if( ema3 <= 478.551 )
								ret := 0.175937
							if( ema3 > 478.551 )
								ret := 0.559944
						if( k > 87.0255 )
							if( ema13 <= 4.84633 )
								ret := 0.465035
							if( ema13 > 4.84633 )
								ret := -0.263158
					if( ema13 > 5.13177 )
						if( rsi1 <= 78.246 )
							if( d <= 59.3208 )
								ret := 0.158284
							if( d > 59.3208 )
								ret := -0.345440
						if( rsi1 > 78.246 )
							if( ema13 <= 17.7565 )
								ret := 0.482353
							if( ema13 > 17.7565 )
								ret := -0.437500
	
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
float op_operation = decision_tree_0_BNBUSDT_30Min_70a0d419(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)

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


