//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: SOLUSDT_15Min_2BS0_5977cc4e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SOLUSDT_15Min_2BS0_5977cc4e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SOLUSDT_15Min_5977cc4e(bbm, bearPower, bbp, bullPower, BBPower_Color, d_k, d, rsi1, k, smoothD_d, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( rsi1 <= 49.6263 )
		if( bbp <= 0.137443 )
			if( smoothD_d <= 12.9073 )
				if( rsi1 <= 31.8069 )
					if( bullPower <= -0.03928 )
						if( bbm <= 0.520063 )
							if( bbp <= -0.591461 )
								ret := -0.080707
							if( bbp > -0.591461 )
								ret := -0.272171
						if( bbm > 0.520063 )
							if( rsi1 <= 28.431 )
								ret := -0.608879
							if( rsi1 > 28.431 )
								ret := -0.386712
					if( bullPower > -0.03928 )
						if( smoothD_d <= 1.85831 )
							if( rsi1 <= 21.8531 )
								ret := -0.886364 // sell
							if( rsi1 > 21.8531 )
								ret := -0.731343 // sell
						if( smoothD_d > 1.85831 )
							if( bbm <= 0.193199 )
								ret := -0.378549
							if( bbm > 0.193199 )
								ret := -0.723010 // sell
				if( rsi1 > 31.8069 )
					if( bbp <= -0.068649 )
						if( bullPower <= 0.034345 )
							if( d_k <= -9.40296 )
								ret := -0.370297
							if( d_k > -9.40296 )
								ret := 0.001339
						if( bullPower > 0.034345 )
							if( rsi1 <= 43.8961 )
								ret := -0.462740
							if( rsi1 > 43.8961 )
								ret := -0.030733
					if( bbp > -0.068649 )
						if( bullPower <= 0.057071 )
							if( rsi1 <= 36.3116 )
								ret := -0.365079
							if( rsi1 > 36.3116 )
								ret := -0.123393
						if( bullPower > 0.057071 )
							if( smoothD_d <= -1.37111 )
								ret := -0.679144
							if( smoothD_d > -1.37111 )
								ret := -0.367995
			if( smoothD_d > 12.9073 )
				if( rsi1 <= 39.7941 )
					if( bbp <= -0.170484 )
						if( bullPower <= 0.040465 )
							if( bullPower <= -1.05476 )
								ret := 0.200226
							if( bullPower > -1.05476 )
								ret := -0.107866
						if( bullPower > 0.040465 )
							if( rsi1 <= 30.81 )
								ret := -0.710983 // sell
							if( rsi1 > 30.81 )
								ret := -0.457249
					if( bbp > -0.170484 )
						if( bearPower <= -0.173458 )
							if( d <= 23.064 )
								ret := -0.803922 // sell
							if( d > 23.064 )
								ret := -0.514071
						if( bearPower > -0.173458 )
							if( bbm <= 0.090583 )
								ret := -0.175738
							if( bbm > 0.090583 )
								ret := -0.417930
				if( rsi1 > 39.7941 )
					if( bearPower <= -0.878738 )
						if( bullPower <= -0.162266 )
							if( rsi1 <= 43.4287 )
								ret := 0.374536
							if( rsi1 > 43.4287 )
								ret := 0.697220
						if( bullPower > -0.162266 )
							if( rsi1 <= 42.5726 )
								ret := -0.278302
							if( rsi1 > 42.5726 )
								ret := 0.287302
					if( bearPower > -0.878738 )
						if( bullPower <= -0.004716 )
							if( d_k <= -22.8045 )
								ret := -0.264706
							if( d_k > -22.8045 )
								ret := 0.183365
						if( bullPower > -0.004716 )
							if( bbp <= -0.000422 )
								ret := -0.069366
							if( bbp > -0.000422 )
								ret := -0.216122
		if( bbp > 0.137443 )
			if( d_k <= -12.0476 )
				if( d <= 19.7171 )
					if( bbp <= 0.260558 )
						if( rsi1 <= 47.4244 )
							ret := -0.833333 // sell
						if( rsi1 > 47.4244 )
							ret := 0.600000
					if( bbp > 0.260558 )
						if( bullPower <= 0.397889 )
							ret := -0.500000
						if( bullPower > 0.397889 )
							if( smoothK_k <= 23.2514 )
								ret := -0.500000
							if( smoothK_k > 23.2514 )
								ret := -1.000000 // sell
				if( d > 19.7171 )
					if( d_k <= -23.9007 )
						if( smoothD_d <= 36.4185 )
							ret := -0.200000
						if( smoothD_d > 36.4185 )
							if( bullPower <= 0.463414 )
								ret := 0.571429
							if( bullPower > 0.463414 )
								ret := 1.000000 // buy
					if( d_k > -23.9007 )
						if( smoothK_k <= 52.0368 )
							if( d <= 38.8632 )
								ret := -0.043956
							if( d > 38.8632 )
								ret := 1.000000 // buy
						if( smoothK_k > 52.0368 )
							if( bbp <= 0.14398 )
								ret := -1.000000 // sell
							if( bbp > 0.14398 )
								ret := -0.263736
			if( d_k > -12.0476 )
				if( smoothK_k <= 38.1143 )
					if( bullPower <= 0.661354 )
						if( rsi1 <= 41.6256 )
							if( bullPower <= 0.121151 )
								ret := -0.222222
							if( bullPower > 0.121151 )
								ret := -0.801516 // sell
						if( rsi1 > 41.6256 )
							if( bbp <= 0.282054 )
								ret := -0.465770
							if( bbp > 0.282054 )
								ret := -0.644444
					if( bullPower > 0.661354 )
						if( rsi1 <= 44.6168 )
							if( d_k <= 27.5703 )
								ret := -0.875149 // sell
							if( d_k > 27.5703 )
								ret := -0.552632
						if( rsi1 > 44.6168 )
							if( bearPower <= -0.048967 )
								ret := -0.464115
							if( bearPower > -0.048967 )
								ret := -0.772000 // sell
				if( smoothK_k > 38.1143 )
					if( bullPower <= 0.747143 )
						if( smoothK_k <= 70.806 )
							if( rsi1 <= 46.8473 )
								ret := -0.575188
							if( rsi1 > 46.8473 )
								ret := -0.330275
						if( smoothK_k > 70.806 )
							if( rsi1 <= 45.203 )
								ret := -0.500000
							if( rsi1 > 45.203 )
								ret := -0.222642
					if( bullPower > 0.747143 )
						if( smoothD_d <= 83.2581 )
							if( d <= 48.8828 )
								ret := -0.392157
							if( d > 48.8828 )
								ret := -0.771255 // sell
						if( smoothD_d > 83.2581 )
							if( bearPower <= 0.576354 )
								ret := 0.081081
							if( bearPower > 0.576354 )
								ret := -0.833333 // sell
	if( rsi1 > 49.6263 )
		if( BBPower_Color <= 0.5 )
			if( bearPower <= -0.239514 )
				if( rsi1 <= 57.1028 )
					if( bearPower <= -0.693264 )
						if( bbp <= -0.952284 )
							if( d_k <= 14.1078 )
								ret := 0.762712 // buy
							if( d_k > 14.1078 )
								ret := 0.055556
						if( bbp > -0.952284 )
							if( d_k <= -9.8356 )
								ret := 0.685590
							if( d_k > -9.8356 )
								ret := 0.450526
					if( bearPower > -0.693264 )
						if( bullPower <= 0.056549 )
							if( k <= 49.4826 )
								ret := 0.266319
							if( k > 49.4826 )
								ret := 0.598344
						if( bullPower > 0.056549 )
							if( smoothD_d <= 84.3932 )
								ret := 0.215261
							if( smoothD_d > 84.3932 )
								ret := 0.469136
				if( rsi1 > 57.1028 )
					if( k <= 21.6244 )
						if( d_k <= -0.770604 )
							if( smoothK_k <= 15.9606 )
								ret := 1.000000 // buy
							if( smoothK_k > 15.9606 )
								ret := 0.500000
						if( d_k > -0.770604 )
							if( smoothK_k <= 15.6202 )
								ret := 0.186047
							if( smoothK_k > 15.6202 )
								ret := -0.928571 // sell
					if( k > 21.6244 )
						if( d_k <= 16.4288 )
							if( bearPower <= -0.534357 )
								ret := 0.853105 // buy
							if( bearPower > -0.534357 )
								ret := 0.743230 // buy
						if( d_k > 16.4288 )
							if( d <= 61.6447 )
								ret := -0.916667 // sell
							if( d > 61.6447 )
								ret := 0.400000
			if( bearPower > -0.239514 )
				if( d <= 93.9223 )
					if( d_k <= -4.16336 )
						if( rsi1 <= 60.1658 )
							if( bearPower <= -0.090643 )
								ret := 0.326775
							if( bearPower > -0.090643 )
								ret := 0.053407
						if( rsi1 > 60.1658 )
							if( bbp <= -5.4e-05 )
								ret := 0.619614
							if( bbp > -5.4e-05 )
								ret := 0.913495 // buy
					if( d_k > -4.16336 )
						if( d <= 87.8328 )
							if( smoothD_d <= -1.85408 )
								ret := 0.833333 // buy
							if( smoothD_d > -1.85408 )
								ret := 0.122469
						if( d > 87.8328 )
							if( smoothD_d <= 90.4927 )
								ret := 0.390244
							if( smoothD_d > 90.4927 )
								ret := -0.084507
				if( d > 93.9223 )
					if( bbm <= 0.06001 )
						if( d_k <= 6.03138 )
							if( rsi1 <= 67.6742 )
								ret := 0.106383
							if( rsi1 > 67.6742 )
								ret := 0.558824
						if( d_k > 6.03138 )
							if( d_k <= 6.22197 )
								ret := -1.000000 // sell
							if( d_k > 6.22197 )
								ret := -0.125000
					if( bbm > 0.06001 )
						if( rsi1 <= 60.3405 )
							if( bullPower <= 0.013965 )
								ret := 0.528571
							if( bullPower > 0.013965 )
								ret := 0.119883
						if( rsi1 > 60.3405 )
							if( rsi1 <= 74.8498 )
								ret := 0.792339 // buy
							if( rsi1 > 74.8498 )
								ret := 0.971429 // buy
		if( BBPower_Color > 0.5 )
			if( smoothD_d <= 80.9322 )
				if( rsi1 <= 63.4162 )
					if( bbp <= 1.17189 )
						if( rsi1 <= 53.4872 )
							if( bullPower <= 0.154567 )
								ret := -0.074703
							if( bullPower > 0.154567 )
								ret := -0.274433
						if( rsi1 > 53.4872 )
							if( bbp <= 0.209035 )
								ret := 0.064443
							if( bbp > 0.209035 )
								ret := -0.081948
					if( bbp > 1.17189 )
						if( bearPower <= 0.522974 )
							if( rsi1 <= 56.2867 )
								ret := -0.526603
							if( rsi1 > 56.2867 )
								ret := -0.201290
						if( bearPower > 0.522974 )
							if( d_k <= 24.4981 )
								ret := -0.632404
							if( d_k > 24.4981 )
								ret := 0.000000
				if( rsi1 > 63.4162 )
					if( bearPower <= -0.008248 )
						if( bearPower <= -0.166432 )
							if( smoothD_d <= 39.3787 )
								ret := 0.801370 // buy
							if( smoothD_d > 39.3787 )
								ret := 0.495268
						if( bearPower > -0.166432 )
							if( d_k <= 0.272302 )
								ret := 0.457112
							if( d_k > 0.272302 )
								ret := 0.233886
					if( bearPower > -0.008248 )
						if( bearPower <= 1.10664 )
							if( smoothD_d <= 54.5495 )
								ret := 0.069171
							if( smoothD_d > 54.5495 )
								ret := 0.181566
						if( bearPower > 1.10664 )
							if( rsi1 <= 70.6098 )
								ret := -0.528090
							if( rsi1 > 70.6098 )
								ret := 0.020290
			if( smoothD_d > 80.9322 )
				if( smoothD_d <= 94.1791 )
					if( rsi1 <= 69.3188 )
						if( d_k <= -1.21032 )
							if( bearPower <= -0.091936 )
								ret := 0.268473
							if( bearPower > -0.091936 )
								ret := -0.093381
						if( d_k > -1.21032 )
							if( d_k <= 11.3322 )
								ret := 0.147774
							if( d_k > 11.3322 )
								ret := 0.419501
					if( rsi1 > 69.3188 )
						if( d_k <= 1.14395 )
							if( bbm <= 0.490605 )
								ret := 0.258532
							if( bbm > 0.490605 )
								ret := 0.535354
						if( d_k > 1.14395 )
							if( bearPower <= 0.076021 )
								ret := 0.634202
							if( bearPower > 0.076021 )
								ret := 0.436508
				if( smoothD_d > 94.1791 )
					if( bbm <= 0.570333 )
						if( rsi1 <= 81.7446 )
							if( bearPower <= -0.02043 )
								ret := 0.580952
							if( bearPower > -0.02043 )
								ret := 0.164684
						if( rsi1 > 81.7446 )
							if( bbp <= 0.639705 )
								ret := 0.793269 // buy
							if( bbp > 0.639705 )
								ret := 0.326146
					if( bbm > 0.570333 )
						if( d_k <= 0.000234 )
							if( bbm <= 0.720537 )
								ret := 0.327485
							if( bbm > 0.720537 )
								ret := 0.636190
						if( d_k > 0.000234 )
							if( rsi1 <= 67.1193 )
								ret := 0.500000
							if( rsi1 > 67.1193 )
								ret := 0.811749 // buy
	
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
float op_operation = decision_tree_0_SOLUSDT_15Min_5977cc4e(bbm, bearPower, bbp, bullPower, BBPower_Color, d_k, d, rsi1, k, smoothD_d, smoothK_k)

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


