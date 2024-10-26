//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: XRPUSDT_30Min_2BS0_585c4f41 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XRPUSDT_30Min_2BS0_585c4f41", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XRPUSDT_30Min_585c4f41(bbp, bullPower, BBPower_Color, bearPower, bbm, smoothK_k, d_k, k, smoothD_d, rsi1, d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( rsi1 <= 48.0434 )
		if( d_k <= -1.35943 )
			if( bbp <= -0.009627 )
				if( d_k <= -8.14465 )
					if( rsi1 <= 32.683 )
						if( bullPower <= -0.007707 )
							if( d <= 74.1143 )
								ret := 0.450122
							if( d > 74.1143 )
								ret := -0.500000
						if( bullPower > -0.007707 )
							if( bullPower <= -0.002005 )
								ret := -0.051151
							if( bullPower > -0.002005 )
								ret := -0.647059
					if( rsi1 > 32.683 )
						if( bbp <= -0.017005 )
							if( bullPower <= 0.000314 )
								ret := 0.784502 // buy
							if( bullPower > 0.000314 )
								ret := -0.022222
						if( bbp > -0.017005 )
							if( rsi1 <= 36.6406 )
								ret := 0.018072
							if( rsi1 > 36.6406 )
								ret := 0.522449
				if( d_k > -8.14465 )
					if( rsi1 <= 33.2852 )
						if( rsi1 <= 23.0098 )
							if( smoothD_d <= 2.10108 )
								ret := -0.607143
							if( smoothD_d > 2.10108 )
								ret := -0.353982
						if( rsi1 > 23.0098 )
							if( bullPower <= -0.011855 )
								ret := 0.364444
							if( bullPower > -0.011855 )
								ret := -0.206025
					if( rsi1 > 33.2852 )
						if( bullPower <= -0.005679 )
							if( d_k <= -6.08922 )
								ret := 0.806122 // buy
							if( d_k > -6.08922 )
								ret := 0.559420
						if( bullPower > -0.005679 )
							if( rsi1 <= 40.246 )
								ret := 0.188383
							if( rsi1 > 40.246 )
								ret := 0.581848
			if( bbp > -0.009627 )
				if( rsi1 <= 40.6161 )
					if( bullPower <= 0.000334 )
						if( k <= 11.2549 )
							if( rsi1 <= 35.3806 )
								ret := -0.505051
							if( rsi1 > 35.3806 )
								ret := -0.094891
						if( k > 11.2549 )
							if( rsi1 <= 28.3369 )
								ret := -0.474138
							if( rsi1 > 28.3369 )
								ret := -0.116567
					if( bullPower > 0.000334 )
						if( rsi1 <= 32.8149 )
							if( bbm <= 0.00165 )
								ret := -0.333333
							if( bbm > 0.00165 )
								ret := -0.811268 // sell
						if( rsi1 > 32.8149 )
							if( bullPower <= 0.001718 )
								ret := -0.343032
							if( bullPower > 0.001718 )
								ret := -0.600414
				if( rsi1 > 40.6161 )
					if( bbp <= -0.003118 )
						if( bbp <= -0.00576 )
							if( d_k <= -7.83989 )
								ret := 0.456989
							if( d_k > -7.83989 )
								ret := 0.201072
						if( bbp > -0.00576 )
							if( bbm <= 0.015855 )
								ret := 0.149171
							if( bbm > 0.015855 )
								ret := -0.620690
					if( bbp > -0.003118 )
						if( bullPower <= 0.002118 )
							if( bullPower <= 0.000684 )
								ret := -0.002119
							if( bullPower > 0.000684 )
								ret := -0.150754
						if( bullPower > 0.002118 )
							if( bearPower <= -0.000983 )
								ret := -0.302694
							if( bearPower > -0.000983 )
								ret := -0.556136
		if( d_k > -1.35943 )
			if( bullPower <= 0.002239 )
				if( rsi1 <= 33.1374 )
					if( rsi1 <= 25.5507 )
						if( rsi1 <= 19.2287 )
							if( bullPower <= -0.010662 )
								ret := -0.364130
							if( bullPower > -0.010662 )
								ret := -0.783609 // sell
						if( rsi1 > 19.2287 )
							if( bullPower <= 0.000287 )
								ret := -0.526840
							if( bullPower > 0.000287 )
								ret := -0.814324 // sell
					if( rsi1 > 25.5507 )
						if( bullPower <= -0.000122 )
							if( bbm <= 0.002302 )
								ret := -0.147239
							if( bbm > 0.002302 )
								ret := -0.393186
						if( bullPower > -0.000122 )
							if( bearPower <= -0.001667 )
								ret := -0.630412
							if( bearPower > -0.001667 )
								ret := -0.431068
				if( rsi1 > 33.1374 )
					if( bbp <= -0.010539 )
						if( bullPower <= -0.001068 )
							if( rsi1 <= 43.5666 )
								ret := 0.223752
							if( rsi1 > 43.5666 )
								ret := 0.601660
						if( bullPower > -0.001068 )
							if( k <= 37.7394 )
								ret := -0.227273
							if( k > 37.7394 )
								ret := 0.240000
					if( bbp > -0.010539 )
						if( rsi1 <= 40.3792 )
							if( bullPower <= 5.9e-05 )
								ret := -0.098226
							if( bullPower > 5.9e-05 )
								ret := -0.395036
						if( rsi1 > 40.3792 )
							if( bearPower <= -0.003405 )
								ret := 0.146115
							if( bearPower > -0.003405 )
								ret := -0.113278
			if( bullPower > 0.002239 )
				if( rsi1 <= 42.1596 )
					if( rsi1 <= 36.9156 )
						if( bbp <= -0.014078 )
							if( bbp <= -0.017044 )
								ret := -0.622951
							if( bbp > -0.017044 )
								ret := 0.166667
						if( bbp > -0.014078 )
							if( rsi1 <= 31.7891 )
								ret := -0.907514 // sell
							if( rsi1 > 31.7891 )
								ret := -0.794702 // sell
					if( rsi1 > 36.9156 )
						if( bullPower <= 0.003972 )
							if( BBPower_Color <= 0.5 )
								ret := -0.646865
							if( BBPower_Color > 0.5 )
								ret := -0.441088
						if( bullPower > 0.003972 )
							if( bbm <= 0.014386 )
								ret := -0.815000 // sell
							if( bbm > 0.014386 )
								ret := -0.598540
				if( rsi1 > 42.1596 )
					if( bbp <= 0.001637 )
						if( smoothD_d <= 51.4761 )
							if( rsi1 <= 46.1516 )
								ret := -0.208955
							if( rsi1 > 46.1516 )
								ret := 0.162791
						if( smoothD_d > 51.4761 )
							if( bullPower <= 0.005585 )
								ret := -0.248848
							if( bullPower > 0.005585 )
								ret := -0.620253
					if( bbp > 0.001637 )
						if( bbp <= 0.007013 )
							if( smoothD_d <= 16.5076 )
								ret := -0.340116
							if( smoothD_d > 16.5076 )
								ret := -0.552516
						if( bbp > 0.007013 )
							if( smoothK_k <= 90.3722 )
								ret := -0.716418 // sell
							if( smoothK_k > 90.3722 )
								ret := 0.153846
	if( rsi1 > 48.0434 )
		if( d_k <= 2.57867 )
			if( bearPower <= -0.002207 )
				if( rsi1 <= 55.2317 )
					if( bbp <= -0.006475 )
						if( smoothK_k <= 6.61022 )
							if( d <= 2.30696 )
								ret := 0.888889 // buy
							if( d > 2.30696 )
								ret := -0.345455
						if( smoothK_k > 6.61022 )
							if( d_k <= -2.49374 )
								ret := 0.758344 // buy
							if( d_k > -2.49374 )
								ret := 0.495627
					if( bbp > -0.006475 )
						if( d_k <= -9.38594 )
							if( d <= 9.36458 )
								ret := -0.263158
							if( d > 9.36458 )
								ret := 0.488285
						if( d_k > -9.38594 )
							if( bbp <= 0.003388 )
								ret := 0.290366
							if( bbp > 0.003388 )
								ret := -0.095808
				if( rsi1 > 55.2317 )
					if( d_k <= -6.92058 )
						if( bbm <= 0.003005 )
							if( rsi1 <= 60.9459 )
								ret := 0.446154
							if( rsi1 > 60.9459 )
								ret := 0.685039
						if( bbm > 0.003005 )
							if( rsi1 <= 62.0896 )
								ret := 0.771111 // buy
							if( rsi1 > 62.0896 )
								ret := 0.894912 // buy
					if( d_k > -6.92058 )
						if( bbm <= 0.065023 )
							if( rsi1 <= 65.6304 )
								ret := 0.596679
							if( rsi1 > 65.6304 )
								ret := 0.806499 // buy
						if( bbm > 0.065023 )
							if( rsi1 <= 62.235 )
								ret := -0.909091 // sell
							if( rsi1 > 62.235 )
								ret := -0.142857
			if( bearPower > -0.002207 )
				if( rsi1 <= 67.6973 )
					if( bearPower <= 0.000396 )
						if( rsi1 <= 56.0018 )
							if( rsi1 <= 50.1685 )
								ret := -0.104097
							if( rsi1 > 50.1685 )
								ret := 0.078625
						if( rsi1 > 56.0018 )
							if( BBPower_Color <= 0.5 )
								ret := 0.466033
							if( BBPower_Color > 0.5 )
								ret := 0.226550
					if( bearPower > 0.000396 )
						if( rsi1 <= 62.7738 )
							if( BBPower_Color <= 0.5 )
								ret := 0.291667
							if( BBPower_Color > 0.5 )
								ret := -0.224017
						if( rsi1 > 62.7738 )
							if( BBPower_Color <= 0.5 )
								ret := 0.939394 // buy
							if( BBPower_Color > 0.5 )
								ret := 0.091301
				if( rsi1 > 67.6973 )
					if( rsi1 <= 77.4202 )
						if( bbm <= 0.0022 )
							if( BBPower_Color <= 0.5 )
								ret := 0.546875
							if( BBPower_Color > 0.5 )
								ret := 0.215576
						if( bbm > 0.0022 )
							if( bearPower <= 0.00519 )
								ret := 0.609375
							if( bearPower > 0.00519 )
								ret := 0.296045
					if( rsi1 > 77.4202 )
						if( bearPower <= 0.014135 )
							if( BBPower_Color <= 0.5 )
								ret := 0.911917 // buy
							if( BBPower_Color > 0.5 )
								ret := 0.685554
						if( bearPower > 0.014135 )
							if( smoothK_k <= 86.3883 )
								ret := 0.688889
							if( smoothK_k > 86.3883 )
								ret := 0.237113
		if( d_k > 2.57867 )
			if( bbp <= 0.008913 )
				if( rsi1 <= 57.3669 )
					if( bbp <= 0.001895 )
						if( bbp <= -0.001545 )
							if( d <= 17.7759 )
								ret := -0.265625
							if( d > 17.7759 )
								ret := 0.376246
						if( bbp > -0.001545 )
							if( BBPower_Color <= 0.5 )
								ret := 0.100218
							if( BBPower_Color > 0.5 )
								ret := -0.026667
					if( bbp > 0.001895 )
						if( bbp <= 0.004032 )
							if( rsi1 <= 48.9281 )
								ret := -0.524272
							if( rsi1 > 48.9281 )
								ret := -0.089796
						if( bbp > 0.004032 )
							if( d_k <= 9.41443 )
								ret := -0.227353
							if( d_k > 9.41443 )
								ret := -0.443773
				if( rsi1 > 57.3669 )
					if( BBPower_Color <= 0.5 )
						if( k <= 31.8153 )
							if( bearPower <= -0.01087 )
								ret := -0.647059
							if( bearPower > -0.01087 )
								ret := 0.375000
						if( k > 31.8153 )
							if( bbm <= 0.001032 )
								ret := 0.171429
							if( bbm > 0.001032 )
								ret := 0.703576 // buy
					if( BBPower_Color > 0.5 )
						if( rsi1 <= 63.8581 )
							if( bearPower <= 0.00039 )
								ret := 0.196749
							if( bearPower > 0.00039 )
								ret := -0.050171
						if( rsi1 > 63.8581 )
							if( rsi1 <= 73.2172 )
								ret := 0.317489
							if( rsi1 > 73.2172 )
								ret := 0.557110
			if( bbp > 0.008913 )
				if( rsi1 <= 61.5422 )
					if( d_k <= 8.66677 )
						if( BBPower_Color <= 0.5 )
							if( d_k <= 6.79308 )
								ret := -0.125000
							if( d_k > 6.79308 )
								ret := 0.888889 // buy
						if( BBPower_Color > 0.5 )
							if( rsi1 <= 56.416 )
								ret := -0.572917
							if( rsi1 > 56.416 )
								ret := -0.305764
					if( d_k > 8.66677 )
						if( bbp <= 0.028684 )
							if( rsi1 <= 56.5525 )
								ret := -0.719276 // sell
							if( rsi1 > 56.5525 )
								ret := -0.430464
						if( bbp > 0.028684 )
							if( smoothD_d <= 11.2235 )
								ret := 0.111111
							if( smoothD_d > 11.2235 )
								ret := -0.884507 // sell
				if( rsi1 > 61.5422 )
					if( bbp <= 0.02124 )
						if( rsi1 <= 74.4439 )
							if( bearPower <= 0.003624 )
								ret := 0.258102
							if( bearPower > 0.003624 )
								ret := -0.041335
						if( rsi1 > 74.4439 )
							if( bbm <= 0.003217 )
								ret := 0.050847
							if( bbm > 0.003217 )
								ret := 0.573333
					if( bbp > 0.02124 )
						if( smoothD_d <= 90.6147 )
							if( rsi1 <= 83.4224 )
								ret := -0.390228
							if( rsi1 > 83.4224 )
								ret := 0.630435
						if( smoothD_d > 90.6147 )
							if( rsi1 <= 84.8982 )
								ret := 0.253659
							if( rsi1 > 84.8982 )
								ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_XRPUSDT_30Min_585c4f41(bbp, bullPower, BBPower_Color, bearPower, bbm, smoothK_k, d_k, k, smoothD_d, rsi1, d)

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


