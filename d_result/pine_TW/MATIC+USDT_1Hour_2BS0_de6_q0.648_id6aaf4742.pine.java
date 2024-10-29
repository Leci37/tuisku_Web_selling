//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: MATICUSDT_1Hour_2BS0_6aaf4742 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MATICUSDT_1Hour_2BS0_6aaf4742", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MATICUSDT_1Hour_6aaf4742(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( rsi1 <= 57.1847 )
		if( bearPower <= 0.000211 )
			if( rsi1 <= 41.6076 )
				if( bullPower <= 0.000168 )
					if( rsi1 <= 26.3603 )
						if( bbm <= 0.001131 )
							ret := 0.144737
						if( bbm > 0.001131 )
							ret := -0.325509
					if( rsi1 > 26.3603 )
						if( bullPower <= -0.014859 )
							ret := 0.246259
						if( bullPower > -0.014859 )
							ret := -0.027311
				if( bullPower > 0.000168 )
					if( d_k <= 9.63098 )
						if( bbp <= -0.00159 )
							ret := -0.291879
						if( bbp > -0.00159 )
							ret := -0.526466
					if( d_k > 9.63098 )
						if( bbm <= 0.000846 )
							ret := 0.304348
						if( bbm > 0.000846 )
							ret := -0.634477
			if( rsi1 > 41.6076 )
				if( bullPower <= -4.3e-05 )
					if( bullPower <= -0.007179 )
						if( rsi1 <= 54.1103 )
							ret := 0.661111
						if( rsi1 > 54.1103 )
							ret := -0.130435
					if( bullPower > -0.007179 )
						if( rsi1 <= 44.0309 )
							ret := 0.160462
						if( rsi1 > 44.0309 )
							ret := 0.387177
				if( bullPower > -4.3e-05 )
					if( bbp <= 0.001509 )
						if( smoothK_k <= 92.9868 )
							ret := 0.052700
						if( smoothK_k > 92.9868 )
							ret := 0.445525
					if( bbp > 0.001509 )
						if( d_k <= 4.61428 )
							ret := -0.122610
						if( d_k > 4.61428 )
							ret := -0.405033
		if( bearPower > 0.000211 )
			if( d_k <= 1.12757 )
				if( bbp <= 0.039039 )
					if( d_k <= 0.007 )
						if( d_k <= -4.11072 )
							ret := -0.179211
						if( d_k > -4.11072 )
							ret := -0.436409
					if( d_k > 0.007 )
						if( bbm <= 0.008754 )
							ret := -0.137255
						if( bbm > 0.008754 )
							ret := 0.428571
				if( bbp > 0.039039 )
					if( smoothK_k <= 93.2872 )
						if( bbm <= 0.02811 )
							ret := -0.462687
						if( bbm > 0.02811 )
							ret := -0.851282 // sell
					if( smoothK_k > 93.2872 )
						if( bbm <= 0.0336 )
							ret := -0.733333 // sell
						if( bbm > 0.0336 )
							ret := 0.666667
			if( d_k > 1.12757 )
				if( bbm <= 0.008303 )
					if( BBPower_Color <= 0.5 )
						if( rsi1 <= 51.8642 )
							ret := -0.896907 // sell
						if( rsi1 > 51.8642 )
							ret := -0.416667
					if( BBPower_Color > 0.5 )
						if( d_k <= 9.52177 )
							ret := -0.199187
						if( d_k > 9.52177 )
							ret := -0.470032
				if( bbm > 0.008303 )
					if( k <= 71.2832 )
						if( bbm <= 0.023355 )
							ret := -0.677758
						if( bbm > 0.023355 )
							ret := -0.882353 // sell
					if( k > 71.2832 )
						if( bullPower <= 0.020523 )
							ret := -0.691729
						if( bullPower > 0.020523 )
							ret := -0.285714
	if( rsi1 > 57.1847 )
		if( BBPower_Color <= 0.5 )
			if( rsi1 <= 60.6712 )
				if( bullPower <= 0.010546 )
					if( d <= 96.7965 )
						if( bearPower <= -0.001078 )
							ret := 0.548900
						if( bearPower > -0.001078 )
							ret := 0.259053
					if( d > 96.7965 )
						if( bbm <= 0.007952 )
							ret := -0.666667
						if( bbm > 0.007952 )
							ret := 0.500000
				if( bullPower > 0.010546 )
					if( d <= 87.8648 )
						if( rsi1 <= 58.0549 )
							ret := -0.365385
						if( rsi1 > 58.0549 )
							ret := 0.323077
					if( d > 87.8648 )
						if( smoothK_k <= 96.7252 )
							ret := -0.535714
						if( smoothK_k > 96.7252 )
							ret := -1.000000 // sell
			if( rsi1 > 60.6712 )
				if( bbm <= 0.001236 )
					if( smoothD_d <= 75.8071 )
						if( d_k <= 0.926718 )
							ret := -0.333333
						if( d_k > 0.926718 )
							ret := 0.414634
					if( smoothD_d > 75.8071 )
						if( smoothK_k <= 90.6505 )
							ret := 0.728571 // buy
						if( smoothK_k > 90.6505 )
							ret := -0.054054
				if( bbm > 0.001236 )
					if( k <= 76.204 )
						if( bbp <= -3.4e-05 )
							ret := 0.679666
						if( bbp > -3.4e-05 )
							ret := 0.893004 // buy
					if( k > 76.204 )
						if( bbm <= 0.0086 )
							ret := 0.689349
						if( bbm > 0.0086 )
							ret := 0.446429
		if( BBPower_Color > 0.5 )
			if( rsi1 <= 73.1583 )
				if( bbp <= 0.065924 )
					if( bearPower <= 0.005703 )
						if( rsi1 <= 62.5435 )
							ret := 0.037882
						if( rsi1 > 62.5435 )
							ret := 0.198115
					if( bearPower > 0.005703 )
						if( d_k <= 0.007529 )
							ret := 0.125958
						if( d_k > 0.007529 )
							ret := -0.312551
				if( bbp > 0.065924 )
					if( bearPower <= 0.017984 )
						if( rsi1 <= 64.9712 )
							ret := -0.445455
						if( rsi1 > 64.9712 )
							ret := 0.431034
					if( bearPower > 0.017984 )
						if( k <= 95.7891 )
							ret := -0.502209
						if( k > 95.7891 )
							ret := 0.071429
			if( rsi1 > 73.1583 )
				if( bbp <= 0.002766 )
					if( rsi1 <= 74.6502 )
						if( k <= 89.6212 )
							ret := 0.530864
						if( k > 89.6212 )
							ret := 0.078652
					if( rsi1 > 74.6502 )
						if( d <= 82.7622 )
							ret := -0.436782
						if( d > 82.7622 )
							ret := 0.000000
				if( bbp > 0.002766 )
					if( smoothK_k <= 93.9194 )
						if( bearPower <= 0.010427 )
							ret := 0.427191
						if( bearPower > 0.010427 )
							ret := 0.113106
					if( smoothK_k > 93.9194 )
						if( rsi1 <= 91.0061 )
							ret := 0.575281
						if( rsi1 > 91.0061 )
							ret := 0.046154
	
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
float op_operation = decision_tree_0_MATICUSDT_1Hour_6aaf4742(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


