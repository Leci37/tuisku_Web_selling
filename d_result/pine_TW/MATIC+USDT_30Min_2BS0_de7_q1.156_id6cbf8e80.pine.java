//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: MATICUSDT_30Min_2BS0_6cbf8e80 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MATICUSDT_30Min_2BS0_6cbf8e80", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MATICUSDT_30Min_6cbf8e80(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( rsi1 <= 53.586 )
		if( d_k <= -3.48867 )
			if( bbp <= -0.014466 )
				if( d_k <= -11.1071 )
					if( rsi1 <= 28.3532 )
						if( bbp <= -0.088511 )
							if( d <= 19.0963 )
								ret := -0.615385
							if( d > 19.0963 )
								ret := 0.843750 // buy
						if( bbp > -0.088511 )
							if( rsi1 <= 25.9182 )
								ret := -0.385827
							if( rsi1 > 25.9182 )
								ret := 0.050847
					if( rsi1 > 28.3532 )
						if( bearPower <= -0.019764 )
							if( bbp <= -0.044472 )
								ret := 0.838614 // buy
							if( bbp > -0.044472 )
								ret := 0.631056
						if( bearPower > -0.019764 )
							if( bbm <= 0.00505 )
								ret := 0.170455
							if( bbm > 0.00505 )
								ret := 0.483429
				if( d_k > -11.1071 )
					if( rsi1 <= 33.6089 )
						if( d <= 7.51084 )
							if( bullPower <= -0.028188 )
								ret := -0.047619
							if( bullPower > -0.028188 )
								ret := -0.565359
						if( d > 7.51084 )
							if( bbp <= -0.037148 )
								ret := 0.171642
							if( bbp > -0.037148 )
								ret := -0.258303
					if( rsi1 > 33.6089 )
						if( rsi1 <= 43.8463 )
							if( bbp <= -0.041372 )
								ret := 0.501953
							if( bbp > -0.041372 )
								ret := 0.192746
						if( rsi1 > 43.8463 )
							if( bbm <= 0.119956 )
								ret := 0.656516
							if( bbm > 0.119956 )
								ret := -0.846154 // sell
			if( bbp > -0.014466 )
				if( rsi1 <= 39.5328 )
					if( bbm <= 0.002827 )
						if( rsi1 <= 13.695 )
							ret := -0.923077 // sell
						if( rsi1 > 13.695 )
							if( bbm <= 0.000692 )
								ret := 0.065963
							if( bbm > 0.000692 )
								ret := -0.147110
					if( bbm > 0.002827 )
						if( rsi1 <= 29.5185 )
							if( smoothD_d <= 19.9867 )
								ret := -0.753165 // sell
							if( smoothD_d > 19.9867 )
								ret := -0.395062
						if( rsi1 > 29.5185 )
							if( bullPower <= -0.000116 )
								ret := -0.176136
							if( bullPower > -0.000116 )
								ret := -0.568254
				if( rsi1 > 39.5328 )
					if( bbp <= 7.8e-05 )
						if( rsi1 <= 45.6236 )
							if( d_k <= -24.1307 )
								ret := -0.400000
							if( d_k > -24.1307 )
								ret := 0.089651
						if( rsi1 > 45.6236 )
							if( bbp <= -0.00233 )
								ret := 0.380441
							if( bbp > -0.00233 )
								ret := 0.123393
					if( bbp > 7.8e-05 )
						if( bbp <= 0.010807 )
							if( rsi1 <= 49.2063 )
								ret := -0.240132
							if( rsi1 > 49.2063 )
								ret := -0.045093
						if( bbp > 0.010807 )
							if( k <= 94.7129 )
								ret := -0.592287
							if( k > 94.7129 )
								ret := 0.666667
		if( d_k > -3.48867 )
			if( bullPower <= 0.004316 )
				if( rsi1 <= 33.007 )
					if( bbm <= 0.002458 )
						if( bbm <= 0.001243 )
							if( k <= 0.583088 )
								ret := 0.494318
							if( k > 0.583088 )
								ret := 0.115086
						if( bbm > 0.001243 )
							if( bullPower <= 0.000356 )
								ret := -0.084257
							if( bullPower > 0.000356 )
								ret := -0.403101
					if( bbm > 0.002458 )
						if( k <= 0.343768 )
							if( bbm <= 0.004805 )
								ret := -0.562278
							if( bbm > 0.004805 )
								ret := -0.867365 // sell
						if( k > 0.343768 )
							if( rsi1 <= 27.6495 )
								ret := -0.628693
							if( rsi1 > 27.6495 )
								ret := -0.410959
				if( rsi1 > 33.007 )
					if( rsi1 <= 40.2034 )
						if( bullPower <= 0.000314 )
							if( bearPower <= -0.001735 )
								ret := -0.049111
							if( bearPower > -0.001735 )
								ret := 0.268254
						if( bullPower > 0.000314 )
							if( bbm <= 0.005105 )
								ret := -0.278788
							if( bbm > 0.005105 )
								ret := -0.548598
					if( rsi1 > 40.2034 )
						if( bearPower <= -0.009025 )
							if( bullPower <= -0.002413 )
								ret := 0.498092
							if( bullPower > -0.002413 )
								ret := 0.148115
						if( bearPower > -0.009025 )
							if( bullPower <= 0.000833 )
								ret := 0.141977
							if( bullPower > 0.000833 )
								ret := -0.114249
			if( bullPower > 0.004316 )
				if( rsi1 <= 41.767 )
					if( bbp <= 0.008919 )
						if( rsi1 <= 35.4833 )
							if( bearPower <= -0.025978 )
								ret := -0.674419
							if( bearPower > -0.025978 )
								ret := -0.840885 // sell
						if( rsi1 > 35.4833 )
							if( d_k <= 7.85064 )
								ret := -0.606757
							if( d_k > 7.85064 )
								ret := -0.727417 // sell
					if( bbp > 0.008919 )
						if( rsi1 <= 38.9466 )
							if( k <= 15.4226 )
								ret := -0.893372 // sell
							if( k > 15.4226 )
								ret := -0.983696 // sell
						if( rsi1 > 38.9466 )
							if( smoothD_d <= 5.51036 )
								ret := -0.597015
							if( smoothD_d > 5.51036 )
								ret := -0.861224 // sell
				if( rsi1 > 41.767 )
					if( bearPower <= 0.004247 )
						if( bbp <= 0.007956 )
							if( rsi1 <= 47.1827 )
								ret := -0.433386
							if( rsi1 > 47.1827 )
								ret := -0.103896
						if( bbp > 0.007956 )
							if( d_k <= 5.95036 )
								ret := -0.404419
							if( d_k > 5.95036 )
								ret := -0.633216
					if( bearPower > 0.004247 )
						if( bullPower <= 0.0195 )
							if( rsi1 <= 51.5742 )
								ret := -0.753333 // sell
							if( rsi1 > 51.5742 )
								ret := -0.420000
						if( bullPower > 0.0195 )
							if( bearPower <= 0.01336 )
								ret := -0.806818 // sell
							if( bearPower > 0.01336 )
								ret := -0.957031 // sell
	if( rsi1 > 53.586 )
		if( BBPower_Color <= 0.5 )
			if( bbm <= 0.004002 )
				if( rsi1 <= 64.997 )
					if( bbm <= 0.000565 )
						if( smoothK_k <= 92.795 )
							if( smoothD_d <= 6.96143 )
								ret := -0.375000
							if( smoothD_d > 6.96143 )
								ret := 0.206667
						if( smoothK_k > 92.795 )
							if( rsi1 <= 60.027 )
								ret := -0.285714
							if( rsi1 > 60.027 )
								ret := -0.857143 // sell
					if( bbm > 0.000565 )
						if( bearPower <= 0.0005 )
							if( bbp <= -4.1e-05 )
								ret := 0.344770
							if( bbp > -4.1e-05 )
								ret := 0.685185
						if( bearPower > 0.0005 )
							if( d_k <= 12.175 )
								ret := 0.133333
							if( d_k > 12.175 )
								ret := -0.647059
				if( rsi1 > 64.997 )
					if( bbp <= 7.2e-05 )
						if( bearPower <= -0.001232 )
							if( d_k <= 4.41907 )
								ret := 0.525597
							if( d_k > 4.41907 )
								ret := 0.933333 // buy
						if( bearPower > -0.001232 )
							if( bullPower <= 0.000121 )
								ret := -0.103448
							if( bullPower > 0.000121 )
								ret := 0.283019
					if( bbp > 7.2e-05 )
						if( bearPower <= 0.000419 )
							if( smoothK_k <= 92.4717 )
								ret := 1.000000 // buy
							if( smoothK_k > 92.4717 )
								ret := 0.714286 // buy
						if( bearPower > 0.000419 )
							ret := 0.454545
			if( bbm > 0.004002 )
				if( d_k <= 7.53699 )
					if( rsi1 <= 59.4043 )
						if( bbm <= 0.009105 )
							if( bbp <= -0.003717 )
								ret := 0.617778
							if( bbp > -0.003717 )
								ret := 0.476285
						if( bbm > 0.009105 )
							if( bullPower <= 0.083359 )
								ret := 0.777270 // buy
							if( bullPower > 0.083359 )
								ret := -0.500000
					if( rsi1 > 59.4043 )
						if( bbp <= -3.4e-05 )
							if( d_k <= -8.67175 )
								ret := 0.863780 // buy
							if( d_k > -8.67175 )
								ret := 0.726897 // buy
						if( bbp > -3.4e-05 )
							if( bearPower <= 0.010309 )
								ret := 0.975379 // buy
							if( bearPower > 0.010309 )
								ret := 0.728814 // buy
				if( d_k > 7.53699 )
					if( bbp <= 0.006247 )
						if( rsi1 <= 57.3471 )
							if( d_k <= 15.3625 )
								ret := 0.226804
							if( d_k > 15.3625 )
								ret := 0.698113
						if( rsi1 > 57.3471 )
							if( smoothD_d <= 75.7213 )
								ret := 0.756757 // buy
							if( smoothD_d > 75.7213 )
								ret := 0.932203 // buy
					if( bbp > 0.006247 )
						if( rsi1 <= 56.2957 )
							if( d_k <= 16.327 )
								ret := -0.600000
							if( d_k > 16.327 )
								ret := 0.777778 // buy
						if( rsi1 > 56.2957 )
							if( d_k <= 12.4622 )
								ret := 0.833333 // buy
							if( d_k > 12.4622 )
								ret := 0.023256
		if( BBPower_Color > 0.5 )
			if( rsi1 <= 70.9969 )
				if( bbp <= 0.023288 )
					if( bearPower <= -0.000149 )
						if( rsi1 <= 59.8864 )
							if( d <= 11.3928 )
								ret := 0.475904
							if( d > 11.3928 )
								ret := 0.108632
						if( rsi1 > 59.8864 )
							if( bbm <= 0.006101 )
								ret := 0.302781
							if( bbm > 0.006101 )
								ret := 0.543938
					if( bearPower > -0.000149 )
						if( rsi1 <= 64.9383 )
							if( bbp <= 0.013944 )
								ret := 0.029059
							if( bbp > 0.013944 )
								ret := -0.191212
						if( rsi1 > 64.9383 )
							if( bullPower <= 0.002611 )
								ret := -0.103145
							if( bullPower > 0.002611 )
								ret := 0.272556
				if( bbp > 0.023288 )
					if( d_k <= 3.67584 )
						if( rsi1 <= 63.5178 )
							if( k <= 94.8632 )
								ret := -0.236908
							if( k > 94.8632 )
								ret := 0.330357
						if( rsi1 > 63.5178 )
							if( d_k <= -8.31913 )
								ret := 0.659218
							if( d_k > -8.31913 )
								ret := 0.246914
					if( d_k > 3.67584 )
						if( rsi1 <= 63.5983 )
							if( d <= 92.0646 )
								ret := -0.658986
							if( d > 92.0646 )
								ret := -0.042857
						if( rsi1 > 63.5983 )
							if( bearPower <= 0.016072 )
								ret := -0.123333
							if( bearPower > 0.016072 )
								ret := -0.481108
			if( rsi1 > 70.9969 )
				if( bullPower <= 0.001992 )
					if( bbm <= 0.001133 )
						if( d_k <= 0.801716 )
							if( k <= 99.993 )
								ret := -0.290030
							if( k > 99.993 )
								ret := 0.027027
						if( d_k > 0.801716 )
							if( rsi1 <= 74.9901 )
								ret := 0.318182
							if( rsi1 > 74.9901 )
								ret := -0.053333
					if( bbm > 0.001133 )
						if( bullPower <= 0.001755 )
							if( smoothD_d <= 71.8041 )
								ret := 0.125000
							if( smoothD_d > 71.8041 )
								ret := 0.605634
						if( bullPower > 0.001755 )
							if( rsi1 <= 74.0056 )
								ret := 0.416667
							if( rsi1 > 74.0056 )
								ret := -0.173913
				if( bullPower > 0.001992 )
					if( k <= 92.2181 )
						if( bearPower <= 0.016125 )
							if( bearPower <= 0.00029 )
								ret := 0.708145 // buy
							if( bearPower > 0.00029 )
								ret := 0.449166
						if( bearPower > 0.016125 )
							if( d_k <= 5.89429 )
								ret := 0.415313
							if( d_k > 5.89429 )
								ret := -0.233803
					if( k > 92.2181 )
						if( bbm <= 0.003633 )
							if( rsi1 <= 81.9726 )
								ret := 0.264095
							if( rsi1 > 81.9726 )
								ret := 0.521008
						if( bbm > 0.003633 )
							if( rsi1 <= 80.6522 )
								ret := 0.700643 // buy
							if( rsi1 > 80.6522 )
								ret := 0.826970 // buy
	
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
float op_operation = decision_tree_0_MATICUSDT_30Min_6cbf8e80(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


