//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: VETUSDT_15Min_2BS0_8de14f28 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_VETUSDT_15Min_2BS0_8de14f28", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_VETUSDT_15Min_8de14f28(bbp, bullPower, BBPower_Color, bearPower, bbm, smoothK_k, d_k, k, smoothD_d, rsi1, d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( k <= 59.8651 )
		if( rsi1 <= 47.0578 )
			if( bullPower <= 9.8e-05 )
				if( rsi1 <= 34.2752 )
					if( bullPower <= -7.3e-05 )
						if( rsi1 <= 29.4243 )
							if( bullPower <= -0.000211 )
								ret := -0.080633
							if( bullPower > -0.000211 )
								ret := -0.383199
						if( rsi1 > 29.4243 )
							if( bullPower <= -0.000157 )
								ret := 0.189109
							if( bullPower > -0.000157 )
								ret := -0.058729
					if( bullPower > -7.3e-05 )
						if( rsi1 <= 27.2723 )
							if( bbm <= 5e-05 )
								ret := -0.334361
							if( bbm > 5e-05 )
								ret := -0.706280 // sell
						if( rsi1 > 27.2723 )
							if( bullPower <= 4e-06 )
								ret := -0.299078
							if( bullPower > 4e-06 )
								ret := -0.611347
				if( rsi1 > 34.2752 )
					if( BBPower_Color <= 0.5 )
						if( bbp <= -0.000165 )
							if( d_k <= -8.97023 )
								ret := -0.119714
							if( d_k > -8.97023 )
								ret := 0.155397
						if( bbp > -0.000165 )
							if( bbp <= -1e-06 )
								ret := -0.178585
							if( bbp > -1e-06 )
								ret := -0.740984 // sell
					if( BBPower_Color > 0.5 )
						if( smoothK_k <= 22.426 )
							if( bullPower <= 5e-05 )
								ret := -0.130518
							if( bullPower > 5e-05 )
								ret := -0.441379
						if( smoothK_k > 22.426 )
							if( bbm <= 6e-05 )
								ret := -0.099415
							if( bbm > 6e-05 )
								ret := -0.286697
			if( bullPower > 9.8e-05 )
				if( k <= 18.7838 )
					if( rsi1 <= 40.2521 )
						if( bbp <= 6.5e-05 )
							if( d <= 2.22204 )
								ret := -0.901961 // sell
							if( d > 2.22204 )
								ret := -0.722222 // sell
						if( bbp > 6.5e-05 )
							if( bbp <= 0.000245 )
								ret := -0.877240 // sell
							if( bbp > 0.000245 )
								ret := -0.972414 // sell
					if( rsi1 > 40.2521 )
						if( smoothK_k <= -1.85533 )
							if( bullPower <= 0.000234 )
								ret := -0.709957 // sell
							if( bullPower > 0.000234 )
								ret := -0.946524 // sell
						if( smoothK_k > -1.85533 )
							if( bearPower <= -0.000188 )
								ret := -0.111111
							if( bearPower > -0.000188 )
								ret := -0.668390
				if( k > 18.7838 )
					if( bearPower <= -0.000221 )
						if( bbp <= -0.000668 )
							if( smoothK_k <= 38.8297 )
								ret := 0.862069 // buy
							if( smoothK_k > 38.8297 )
								ret := -0.066667
						if( bbp > -0.000668 )
							if( d_k <= -14.2748 )
								ret := -0.727273 // sell
							if( d_k > -14.2748 )
								ret := -0.154639
					if( bearPower > -0.000221 )
						if( bearPower <= -0.0001 )
							if( rsi1 <= 37.4727 )
								ret := -0.800000 // sell
							if( rsi1 > 37.4727 )
								ret := -0.355972
						if( bearPower > -0.0001 )
							if( rsi1 <= 38.803 )
								ret := -0.872054 // sell
							if( rsi1 > 38.803 )
								ret := -0.593032
		if( rsi1 > 47.0578 )
			if( bullPower <= 0.000156 )
				if( bbm <= 0.000154 )
					if( bearPower <= -4.5e-05 )
						if( rsi1 <= 54.6589 )
							if( d_k <= 8.35849 )
								ret := 0.173285
							if( d_k > 8.35849 )
								ret := -0.009479
						if( rsi1 > 54.6589 )
							if( rsi1 <= 59.6204 )
								ret := 0.354136
							if( rsi1 > 59.6204 )
								ret := 0.604905
					if( bearPower > -4.5e-05 )
						if( rsi1 <= 55.8996 )
							if( bullPower <= 8.5e-05 )
								ret := -0.037125
							if( bullPower > 8.5e-05 )
								ret := -0.283008
						if( rsi1 > 55.8996 )
							if( rsi1 <= 62.9673 )
								ret := 0.054281
							if( rsi1 > 62.9673 )
								ret := 0.257600
				if( bbm > 0.000154 )
					if( BBPower_Color <= 0.5 )
						if( rsi1 <= 52.9373 )
							if( d_k <= -13.625 )
								ret := -0.134146
							if( d_k > -13.625 )
								ret := 0.274387
						if( rsi1 > 52.9373 )
							if( d_k <= 8.95118 )
								ret := 0.623894
							if( d_k > 8.95118 )
								ret := 0.286822
					if( BBPower_Color > 0.5 )
						if( smoothD_d <= 50.0111 )
							if( rsi1 <= 52.1384 )
								ret := -0.216814
							if( rsi1 > 52.1384 )
								ret := 0.049724
						if( smoothD_d > 50.0111 )
							if( d <= 55.0881 )
								ret := 0.615385
							if( d > 55.0881 )
								ret := 0.234848
			if( bullPower > 0.000156 )
				if( bearPower <= 4.8e-05 )
					if( bearPower <= -0.000111 )
						if( d_k <= 19.5304 )
							if( rsi1 <= 54.2099 )
								ret := -0.121302
							if( rsi1 > 54.2099 )
								ret := 0.472222
						if( d_k > 19.5304 )
							if( bbp <= -3e-05 )
								ret := 0.400000
							if( bbp > -3e-05 )
								ret := 0.767442 // buy
					if( bearPower > -0.000111 )
						if( d_k <= 19.8071 )
							if( BBPower_Color <= 0.5 )
								ret := 0.088161
							if( BBPower_Color > 0.5 )
								ret := -0.154063
						if( d_k > 19.8071 )
							if( rsi1 <= 52.9395 )
								ret := -0.260417
							if( rsi1 > 52.9395 )
								ret := 0.479167
				if( bearPower > 4.8e-05 )
					if( smoothK_k <= 19.579 )
						if( bearPower <= 0.000147 )
							if( rsi1 <= 67.3876 )
								ret := -0.494372
							if( rsi1 > 67.3876 )
								ret := 0.572193
						if( bearPower > 0.000147 )
							if( d <= 25.8218 )
								ret := -0.713267 // sell
							if( d > 25.8218 )
								ret := -0.311741
					if( smoothK_k > 19.579 )
						if( d <= 72.7211 )
							if( smoothK_k <= 32.9712 )
								ret := -0.090750
							if( smoothK_k > 32.9712 )
								ret := -0.251394
						if( d > 72.7211 )
							if( d_k <= 16.5228 )
								ret := -0.500000
							if( d_k > 16.5228 )
								ret := 0.466019
	if( k > 59.8651 )
		if( BBPower_Color <= 0.5 )
			if( rsi1 <= 55.0629 )
				if( bearPower <= -0.000152 )
					if( bullPower <= -2.3e-05 )
						if( rsi1 <= 39.736 )
							if( rsi1 <= 32.9539 )
								ret := -0.016461
							if( rsi1 > 32.9539 )
								ret := 0.322251
						if( rsi1 > 39.736 )
							if( bullPower <= -0.000129 )
								ret := 0.791478 // buy
							if( bullPower > -0.000129 )
								ret := 0.552184
					if( bullPower > -2.3e-05 )
						if( smoothD_d <= 73.6636 )
							if( rsi1 <= 41.6018 )
								ret := -0.421429
							if( rsi1 > 41.6018 )
								ret := 0.224436
						if( smoothD_d > 73.6636 )
							if( bbp <= 4e-06 )
								ret := 0.301668
							if( bbp > 4e-06 )
								ret := -0.515152
				if( bearPower > -0.000152 )
					if( rsi1 <= 46.4812 )
						if( bbp <= -5e-06 )
							if( bullPower <= 1.4e-05 )
								ret := 0.003277
							if( bullPower > 1.4e-05 )
								ret := -0.269762
						if( bbp > -5e-06 )
							if( d <= 64.3022 )
								ret := -0.188889
							if( d > 64.3022 )
								ret := -0.619048
					if( rsi1 > 46.4812 )
						if( bearPower <= -6.7e-05 )
							if( bbp <= -0.000122 )
								ret := 0.515548
							if( bbp > -0.000122 )
								ret := 0.212273
						if( bearPower > -6.7e-05 )
							if( bbp <= 0.000412 )
								ret := 0.028630
							if( bbp > 0.000412 )
								ret := -0.851852 // sell
			if( rsi1 > 55.0629 )
				if( rsi1 <= 64.5202 )
					if( bearPower <= -6.9e-05 )
						if( bearPower <= -0.000133 )
							if( bullPower <= -7e-06 )
								ret := 0.854744 // buy
							if( bullPower > -7e-06 )
								ret := 0.648049
						if( bearPower > -0.000133 )
							if( smoothD_d <= 90.6447 )
								ret := 0.559038
							if( smoothD_d > 90.6447 )
								ret := 0.740053 // buy
					if( bearPower > -6.9e-05 )
						if( rsi1 <= 59.6939 )
							if( smoothK_k <= 59.7445 )
								ret := -0.246753
							if( smoothK_k > 59.7445 )
								ret := 0.253838
						if( rsi1 > 59.6939 )
							if( bbm <= 8.3e-05 )
								ret := 0.366599
							if( bbm > 8.3e-05 )
								ret := 0.575439
				if( rsi1 > 64.5202 )
					if( smoothK_k <= 79.0235 )
						if( d <= 83.5169 )
							if( d_k <= 12.0488 )
								ret := 0.771536 // buy
							if( d_k > 12.0488 )
								ret := -0.120000
						if( d > 83.5169 )
							if( d_k <= 8.42217 )
								ret := -0.586207
							if( d_k > 8.42217 )
								ret := 0.857143 // buy
					if( smoothK_k > 79.0235 )
						if( bbp <= -0 )
							if( bearPower <= -5.9e-05 )
								ret := 0.881319 // buy
							if( bearPower > -5.9e-05 )
								ret := 0.624113
						if( bbp > -0 )
							if( d_k <= -5.45599 )
								ret := 1.000000 // buy
							if( d_k > -5.45599 )
								ret := 0.892925 // buy
		if( BBPower_Color > 0.5 )
			if( rsi1 <= 67.1121 )
				if( rsi1 <= 57.4855 )
					if( bullPower <= 0.000161 )
						if( bbp <= 0.000102 )
							if( rsi1 <= 49.9657 )
								ret := -0.152198
							if( rsi1 > 49.9657 )
								ret := -0.038037
						if( bbp > 0.000102 )
							if( rsi1 <= 46.8502 )
								ret := -0.542056
							if( rsi1 > 46.8502 )
								ret := -0.232979
					if( bullPower > 0.000161 )
						if( bullPower <= 0.000357 )
							if( rsi1 <= 48.747 )
								ret := -0.576441
							if( rsi1 > 48.747 )
								ret := -0.268070
						if( bullPower > 0.000357 )
							if( smoothD_d <= 94.5024 )
								ret := -0.618841
							if( smoothD_d > 94.5024 )
								ret := 0.312500
				if( rsi1 > 57.4855 )
					if( bbp <= 0.000283 )
						if( d_k <= 8.74879 )
							if( rsi1 <= 62.8857 )
								ret := 0.029432
							if( rsi1 > 62.8857 )
								ret := 0.182214
						if( d_k > 8.74879 )
							if( smoothD_d <= 81.5927 )
								ret := 0.284360
							if( smoothD_d > 81.5927 )
								ret := 0.483680
					if( bbp > 0.000283 )
						if( bbp <= 0.000492 )
							if( smoothD_d <= 71.088 )
								ret := -0.298405
							if( smoothD_d > 71.088 )
								ret := -0.060788
						if( bbp > 0.000492 )
							if( smoothD_d <= 75.8787 )
								ret := -0.530612
							if( smoothD_d > 75.8787 )
								ret := -0.224350
			if( rsi1 > 67.1121 )
				if( smoothD_d <= 92.3606 )
					if( rsi1 <= 75.4069 )
						if( bbp <= 0.000334 )
							if( bbm <= 8e-05 )
								ret := 0.182779
							if( bbm > 8e-05 )
								ret := 0.396655
						if( bbp > 0.000334 )
							if( smoothD_d <= 82.8077 )
								ret := -0.127825
							if( smoothD_d > 82.8077 )
								ret := 0.137195
					if( rsi1 > 75.4069 )
						if( bbp <= 0.000374 )
							if( bbm <= 6e-05 )
								ret := 0.268793
							if( bbm > 6e-05 )
								ret := 0.615533
						if( bbp > 0.000374 )
							if( bbm <= 0.000211 )
								ret := 0.195402
							if( bbm > 0.000211 )
								ret := 0.493601
				if( smoothD_d > 92.3606 )
					if( rsi1 <= 77.3472 )
						if( bearPower <= 0.000143 )
							if( bbm <= 0.00013 )
								ret := 0.326351
							if( bbm > 0.00013 )
								ret := 0.619824
						if( bearPower > 0.000143 )
							if( d_k <= 4.07597 )
								ret := -0.098765
							if( d_k > 4.07597 )
								ret := 0.868421 // buy
					if( rsi1 > 77.3472 )
						if( bearPower <= 8.9e-05 )
							if( d <= 95.6069 )
								ret := 0.041667
							if( d > 95.6069 )
								ret := 0.748731 // buy
						if( bearPower > 8.9e-05 )
							if( d_k <= 1.88258 )
								ret := 0.413462
							if( d_k > 1.88258 )
								ret := 0.641791
	
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
float op_operation = decision_tree_0_VETUSDT_15Min_8de14f28(bbp, bullPower, BBPower_Color, bearPower, bbm, smoothK_k, d_k, k, smoothD_d, rsi1, d)

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


