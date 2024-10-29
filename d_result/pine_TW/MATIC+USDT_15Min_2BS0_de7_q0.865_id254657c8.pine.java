//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: MATICUSDT_15Min_2BS0_254657c8 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MATICUSDT_15Min_2BS0_254657c8", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MATICUSDT_15Min_254657c8(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( smoothK_k <= 33.3366 )
		if( rsi1 <= 40.7218 )
			if( bbp <= -0.010497 )
				if( rsi1 <= 22.9986 )
					if( bullPower <= -0.006183 )
						if( bearPower <= -0.065733 )
							if( k <= 19.2667 )
								ret := 1.000000 // buy
							if( k > 19.2667 )
								ret := 0.800000 // buy
						if( bearPower > -0.065733 )
							if( d_k <= -9.39966 )
								ret := -0.943396 // sell
							if( d_k > -9.39966 )
								ret := -0.079641
					if( bullPower > -0.006183 )
						if( rsi1 <= 15.2597 )
							if( smoothK_k <= 21.9278 )
								ret := -0.756322 // sell
							if( smoothK_k > 21.9278 )
								ret := 0.625000
						if( rsi1 > 15.2597 )
							if( bbp <= -0.015829 )
								ret := -0.266219
							if( bbp > -0.015829 )
								ret := -0.538358
				if( rsi1 > 22.9986 )
					if( rsi1 <= 32.3554 )
						if( bullPower <= -0.005319 )
							if( d_k <= 30.0955 )
								ret := 0.065522
							if( d_k > 30.0955 )
								ret := -1.000000 // sell
						if( bullPower > -0.005319 )
							if( rsi1 <= 28.7339 )
								ret := -0.256393
							if( rsi1 > 28.7339 )
								ret := -0.112257
					if( rsi1 > 32.3554 )
						if( bearPower <= -0.01116 )
							if( smoothK_k <= 7.51525 )
								ret := 0.035907
							if( smoothK_k > 7.51525 )
								ret := 0.304245
						if( bearPower > -0.01116 )
							if( k <= 14.943 )
								ret := 0.104779
							if( k > 14.943 )
								ret := -0.116129
			if( bbp > -0.010497 )
				if( bearPower <= -0.000215 )
					if( rsi1 <= 28.5498 )
						if( bullPower <= -8.6e-05 )
							if( rsi1 <= 23.2246 )
								ret := -0.711827 // sell
							if( rsi1 > 23.2246 )
								ret := -0.421773
						if( bullPower > -8.6e-05 )
							if( bbm <= 0.001503 )
								ret := -0.458904
							if( bbm > 0.001503 )
								ret := -0.792553 // sell
					if( rsi1 > 28.5498 )
						if( bbp <= -0.000819 )
							if( bullPower <= -0.000359 )
								ret := -0.200102
							if( bullPower > -0.000359 )
								ret := -0.387848
						if( bbp > -0.000819 )
							if( bbm <= 0.0024 )
								ret := -0.402204
							if( bbm > 0.0024 )
								ret := -0.675074
				if( bearPower > -0.000215 )
					if( bbp <= 0.002424 )
						if( rsi1 <= 30.8749 )
							if( d_k <= 0.125498 )
								ret := -1.000000 // sell
							if( d_k > 0.125498 )
								ret := -0.615385
						if( rsi1 > 30.8749 )
							if( bearPower <= 0.000303 )
								ret := -0.437811
							if( bearPower > 0.000303 )
								ret := -0.076923
					if( bbp > 0.002424 )
						if( d_k <= -5.94184 )
							if( bbm <= 0.005919 )
								ret := -0.571429
							if( bbm > 0.005919 )
								ret := 0.750000 // buy
						if( d_k > -5.94184 )
							if( bbm <= 0.0014 )
								ret := -0.500000
							if( bbm > 0.0014 )
								ret := -0.891810 // sell
		if( rsi1 > 40.7218 )
			if( BBPower_Color <= 0.5 )
				if( bbp <= 8.3e-05 )
					if( bbp <= -0.004669 )
						if( d <= 29.4602 )
							if( smoothK_k <= 19.9319 )
								ret := 0.115661
							if( smoothK_k > 19.9319 )
								ret := 0.411475
						if( d > 29.4602 )
							if( rsi1 <= 48.8553 )
								ret := -0.155143
							if( rsi1 > 48.8553 )
								ret := 0.355372
					if( bbp > -0.004669 )
						if( rsi1 <= 51.1015 )
							if( d_k <= -0.648116 )
								ret := -0.164049
							if( d_k > -0.648116 )
								ret := -0.021328
						if( rsi1 > 51.1015 )
							if( d <= 12.7588 )
								ret := 0.099071
							if( d > 12.7588 )
								ret := 0.292605
				if( bbp > 8.3e-05 )
					if( bearPower <= -0.000403 )
						if( rsi1 <= 52.744 )
							if( bbm <= 0.007791 )
								ret := -0.504726
							if( bbm > 0.007791 )
								ret := -0.060870
						if( rsi1 > 52.744 )
							if( rsi1 <= 60.0309 )
								ret := 0.147059
							if( rsi1 > 60.0309 )
								ret := 0.684211
					if( bearPower > -0.000403 )
						if( smoothK_k <= 4.06344 )
							if( smoothK_k <= -1.04981 )
								ret := -0.521739
							if( smoothK_k > -1.04981 )
								ret := -0.941748 // sell
						if( smoothK_k > 4.06344 )
							if( bbm <= 0.00832 )
								ret := -0.536657
							if( bbm > 0.00832 )
								ret := -0.176471
			if( BBPower_Color > 0.5 )
				if( bbp <= 0.005975 )
					if( smoothD_d <= 10.4705 )
						if( bullPower <= 0.003499 )
							if( rsi1 <= 47.8125 )
								ret := -0.292639
							if( rsi1 > 47.8125 )
								ret := -0.004847
						if( bullPower > 0.003499 )
							if( smoothK_k <= -2.61425 )
								ret := -0.558333
							if( smoothK_k > -2.61425 )
								ret := -0.334842
					if( smoothD_d > 10.4705 )
						if( bbm <= 0.008628 )
							if( d <= 54.3212 )
								ret := -0.122164
							if( d > 54.3212 )
								ret := 0.157025
						if( bbm > 0.008628 )
							if( bbp <= 0.004023 )
								ret := 0.391753
							if( bbp > 0.004023 )
								ret := 0.000000
				if( bbp > 0.005975 )
					if( d_k <= -5.12765 )
						if( rsi1 <= 55.2584 )
							if( bullPower <= 0.015043 )
								ret := -0.453039
							if( bullPower > 0.015043 )
								ret := 0.400000
						if( rsi1 > 55.2584 )
							if( smoothD_d <= 11.4981 )
								ret := -0.134615
							if( smoothD_d > 11.4981 )
								ret := 0.332203
					if( d_k > -5.12765 )
						if( smoothD_d <= 3.70113 )
							if( rsi1 <= 62.9419 )
								ret := -0.701571 // sell
							if( rsi1 > 62.9419 )
								ret := 0.010638
						if( smoothD_d > 3.70113 )
							if( smoothD_d <= 30.658 )
								ret := -0.416813
							if( smoothD_d > 30.658 )
								ret := -0.252381
	if( smoothK_k > 33.3366 )
		if( rsi1 <= 61.7657 )
			if( bearPower <= -0.001945 )
				if( rsi1 <= 46.9141 )
					if( smoothK_k <= 85.8584 )
						if( bullPower <= -0.00177 )
							if( rsi1 <= 34.3648 )
								ret := -0.051271
							if( rsi1 > 34.3648 )
								ret := 0.326944
						if( bullPower > -0.00177 )
							if( bbp <= -0.004124 )
								ret := -0.053552
							if( bbp > -0.004124 )
								ret := -0.241144
					if( smoothK_k > 85.8584 )
						if( bullPower <= -0.001769 )
							if( bearPower <= -0.014957 )
								ret := 0.717949 // buy
							if( bearPower > -0.014957 )
								ret := 0.368491
						if( bullPower > -0.001769 )
							if( rsi1 <= 41.8532 )
								ret := -0.292740
							if( rsi1 > 41.8532 )
								ret := 0.063830
				if( rsi1 > 46.9141 )
					if( BBPower_Color <= 0.5 )
						if( bullPower <= 0.000123 )
							if( bbp <= -0.004139 )
								ret := 0.614112
							if( bbp > -0.004139 )
								ret := 0.351891
						if( bullPower > 0.000123 )
							if( bullPower <= 0.001644 )
								ret := 0.367965
							if( bullPower > 0.001644 )
								ret := 0.227242
					if( BBPower_Color > 0.5 )
						if( k <= 85.3796 )
							if( smoothD_d <= 50.2454 )
								ret := 0.129371
							if( smoothD_d > 50.2454 )
								ret := -0.209877
						if( k > 85.3796 )
							if( k <= 87.4882 )
								ret := 0.446154
							if( k > 87.4882 )
								ret := 0.086643
			if( bearPower > -0.001945 )
				if( bbp <= 0.006386 )
					if( rsi1 <= 48.6441 )
						if( bbm <= 0.002603 )
							if( bearPower <= 0.00049 )
								ret := -0.120000
							if( bearPower > 0.00049 )
								ret := -0.432624
						if( bbm > 0.002603 )
							if( rsi1 <= 42.4965 )
								ret := -0.625969
							if( rsi1 > 42.4965 )
								ret := -0.344277
					if( rsi1 > 48.6441 )
						if( BBPower_Color <= 0.5 )
							if( bbm <= 0.002351 )
								ret := 0.126149
							if( bbm > 0.002351 )
								ret := 0.301148
						if( BBPower_Color > 0.5 )
							if( rsi1 <= 55.7137 )
								ret := -0.091480
							if( rsi1 > 55.7137 )
								ret := 0.058588
				if( bbp > 0.006386 )
					if( k <= 68.5206 )
						if( smoothD_d <= 43.381 )
							if( smoothK_k <= 39.1658 )
								ret := -0.461140
							if( smoothK_k > 39.1658 )
								ret := 0.002331
						if( smoothD_d > 43.381 )
							if( rsi1 <= 48.8077 )
								ret := -0.768182 // sell
							if( rsi1 > 48.8077 )
								ret := -0.396211
					if( k > 68.5206 )
						if( BBPower_Color <= 0.5 )
							if( smoothD_d <= 65.1927 )
								ret := 0.590909
							if( smoothD_d > 65.1927 )
								ret := 0.041322
						if( BBPower_Color > 0.5 )
							if( bbp <= 0.042685 )
								ret := -0.225579
							if( bbp > 0.042685 )
								ret := 0.666667
		if( rsi1 > 61.7657 )
			if( bbp <= 0.008001 )
				if( rsi1 <= 71.3769 )
					if( bullPower <= 0.000569 )
						if( bbp <= -0.00175 )
							if( bearPower <= -0.002469 )
								ret := 0.854321 // buy
							if( bearPower > -0.002469 )
								ret := 0.681818
						if( bbp > -0.00175 )
							if( bbm <= 0.001202 )
								ret := 0.160000
							if( bbm > 0.001202 )
								ret := 0.582011
					if( bullPower > 0.000569 )
						if( BBPower_Color <= 0.5 )
							if( rsi1 <= 62.2391 )
								ret := 0.385417
							if( rsi1 > 62.2391 )
								ret := 0.698669
						if( BBPower_Color > 0.5 )
							if( bearPower <= 0.000219 )
								ret := 0.351374
							if( bearPower > 0.000219 )
								ret := 0.210339
				if( rsi1 > 71.3769 )
					if( bearPower <= -0.00052 )
						if( d_k <= 7.76751 )
							if( bbm <= 0.002109 )
								ret := 0.619792
							if( bbm > 0.002109 )
								ret := 0.854027 // buy
						if( d_k > 7.76751 )
							if( bullPower <= 0.003923 )
								ret := 0.363636
							if( bullPower > 0.003923 )
								ret := -0.666667
					if( bearPower > -0.00052 )
						if( rsi1 <= 80.0016 )
							if( BBPower_Color <= 0.5 )
								ret := 0.949045 // buy
							if( BBPower_Color > 0.5 )
								ret := 0.500000
						if( rsi1 > 80.0016 )
							if( smoothD_d <= 95.4032 )
								ret := 0.703180 // buy
							if( smoothD_d > 95.4032 )
								ret := 0.874659 // buy
			if( bbp > 0.008001 )
				if( bbp <= 0.024487 )
					if( rsi1 <= 76.7112 )
						if( BBPower_Color <= 0.5 )
							if( d_k <= 1.86442 )
								ret := 0.800000 // buy
							if( d_k > 1.86442 )
								ret := 0.117647
						if( BBPower_Color > 0.5 )
							if( rsi1 <= 64.2071 )
								ret := -0.140766
							if( rsi1 > 64.2071 )
								ret := 0.124569
					if( rsi1 > 76.7112 )
						if( bbp <= 0.016498 )
							if( rsi1 <= 81.8358 )
								ret := 0.481557
							if( rsi1 > 81.8358 )
								ret := 0.732203 // buy
						if( bbp > 0.016498 )
							if( rsi1 <= 82.2257 )
								ret := 0.267961
							if( rsi1 > 82.2257 )
								ret := 0.619355
				if( bbp > 0.024487 )
					if( rsi1 <= 85.5649 )
						if( smoothD_d <= 85.288 )
							if( d <= 40.0484 )
								ret := 0.376812
							if( d > 40.0484 )
								ret := -0.241719
						if( smoothD_d > 85.288 )
							if( d_k <= 2.30839 )
								ret := -0.135266
							if( d_k > 2.30839 )
								ret := 0.345930
					if( rsi1 > 85.5649 )
						if( bearPower <= 0.029919 )
							if( d_k <= -2.03844 )
								ret := 0.012500
							if( d_k > -2.03844 )
								ret := 0.517544
						if( bearPower > 0.029919 )
							ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_MATICUSDT_15Min_254657c8(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


