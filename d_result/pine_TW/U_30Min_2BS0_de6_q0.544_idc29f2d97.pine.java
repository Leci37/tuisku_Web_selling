//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: U_30Min_2BS0_c29f2d97 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_U_30Min_2BS0_c29f2d97", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_U_30Min_c29f2d97(bbp, bullPower, BBPower_Color, bearPower, bbm, rsi1, d, k, smoothD_d, d_k, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( smoothK_k <= -0.668702 )
		if( rsi1 <= 10.4821 )
			if( bullPower <= -0.709745 )
				if( bearPower <= -3.443 )
					ret := 0.578947
				if( bearPower > -3.443 )
					if( bbp <= -2.7961 )
						if( bbp <= -4.49787 )
							ret := 0.875000 // buy
						if( bbp > -4.49787 )
							ret := 1.000000 // buy
					if( bbp > -2.7961 )
						if( smoothK_k <= -2.98929 )
							ret := 0.600000
						if( smoothK_k > -2.98929 )
							ret := 1.000000 // buy
			if( bullPower > -0.709745 )
				if( bbp <= -1.59177 )
					ret := -0.363636
				if( bbp > -1.59177 )
					if( bbm <= 0.09395 )
						ret := 0.000000
					if( bbm > 0.09395 )
						if( d_k <= 0.785453 )
							ret := 0.281250
						if( d_k > 0.785453 )
							ret := 0.777778 // buy
		if( rsi1 > 10.4821 )
			if( d <= 0.916115 )
				if( d_k <= 0.33454 )
					if( bbm <= 0.169273 )
						if( bbp <= -1.52269 )
							ret := 0.650000
						if( bbp > -1.52269 )
							ret := -0.014388
					if( bbm > 0.169273 )
						if( bearPower <= -0.582055 )
							ret := -0.154122
						if( bearPower > -0.582055 )
							ret := -0.537415
				if( d_k > 0.33454 )
					if( bbm <= 1.54466 )
						if( bbm <= 0.606386 )
							ret := 0.168421
						if( bbm > 0.606386 )
							ret := 1.000000 // buy
					if( bbm > 1.54466 )
						ret := -0.611111
			if( d > 0.916115 )
				if( bearPower <= -4.46242 )
					if( rsi1 <= 21.2598 )
						ret := 0.153846
					if( rsi1 > 21.2598 )
						if( bbm <= 3.60696 )
							ret := -0.909091 // sell
						if( bbm > 3.60696 )
							ret := -0.400000
				if( bearPower > -4.46242 )
					if( rsi1 <= 29.126 )
						if( bearPower <= -1.88355 )
							ret := 0.629310
						if( bearPower > -1.88355 )
							ret := 0.188380
					if( rsi1 > 29.126 )
						if( bbm <= 1.20503 )
							ret := 0.152059
						if( bbm > 1.20503 )
							ret := -0.432432
	if( smoothK_k > -0.668702 )
		if( bullPower <= -0.222149 )
			if( smoothD_d <= -0.708893 )
				if( k <= 4.02608 )
					if( rsi1 <= 24.6662 )
						if( k <= 3.03279 )
							ret := -0.583333
						if( k > 3.03279 )
							ret := -0.938776 // sell
					if( rsi1 > 24.6662 )
						if( bearPower <= -0.767664 )
							ret := -0.666667
						if( bearPower > -0.767664 )
							ret := 0.384615
				if( k > 4.02608 )
					if( bullPower <= -1.2691 )
						if( bearPower <= -4.52724 )
							ret := -1.000000 // sell
						if( bearPower > -4.52724 )
							ret := -0.625000
					if( bullPower > -1.2691 )
						if( bbm <= 0.615065 )
							ret := 0.055556
						if( bbm > 0.615065 )
							ret := 0.727273 // buy
			if( smoothD_d > -0.708893 )
				if( smoothK_k <= 66.0479 )
					if( smoothD_d <= 8.14367 )
						if( rsi1 <= 36.5191 )
							ret := 0.015672
						if( rsi1 > 36.5191 )
							ret := -0.366279
					if( smoothD_d > 8.14367 )
						if( smoothK_k <= 9.3503 )
							ret := 0.278884
						if( smoothK_k > 9.3503 )
							ret := 0.125288
				if( smoothK_k > 66.0479 )
					if( k <= 79.098 )
						if( d_k <= -1.15988 )
							ret := -0.381818
						if( d_k > -1.15988 )
							ret := -0.712500 // sell
					if( k > 79.098 )
						if( d_k <= 5.0338 )
							ret := 0.236842
						if( d_k > 5.0338 )
							ret := -0.547945
		if( bullPower > -0.222149 )
			if( smoothD_d <= 15.125 )
				if( d <= 12.4006 )
					if( bbm <= 0.710357 )
						if( bullPower <= -0.113708 )
							ret := -0.161504
						if( bullPower > -0.113708 )
							ret := 0.070975
					if( bbm > 0.710357 )
						if( k <= 11.2013 )
							ret := -0.375286
						if( k > 11.2013 )
							ret := 0.055085
				if( d > 12.4006 )
					if( bearPower <= -1.71371 )
						if( rsi1 <= 45.0962 )
							ret := 0.740741 // buy
						if( rsi1 > 45.0962 )
							ret := -0.150000
					if( bearPower > -1.71371 )
						if( bbm <= 0.18995 )
							ret := -0.093863
						if( bbm > 0.18995 )
							ret := -0.320725
			if( smoothD_d > 15.125 )
				if( bbp <= 8.09929 )
					if( rsi1 <= 79.4997 )
						if( k <= 10.2569 )
							ret := 0.288571
						if( k > 10.2569 )
							ret := -0.023610
					if( rsi1 > 79.4997 )
						if( bbm <= 0.073874 )
							ret := -0.222826
						if( bbm > 0.073874 )
							ret := 0.139710
				if( bbp > 8.09929 )
					if( smoothK_k <= 96.8825 )
						if( rsi1 <= 66.0638 )
							ret := 0.200000
						if( rsi1 > 66.0638 )
							ret := -0.721311 // sell
					if( smoothK_k > 96.8825 )
						if( rsi1 <= 83.0557 )
							ret := 0.666667
						if( rsi1 > 83.0557 )
							ret := -0.090909
	
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
float op_operation = decision_tree_0_U_30Min_c29f2d97(bbp, bullPower, BBPower_Color, bearPower, bbm, rsi1, d, k, smoothD_d, d_k, smoothK_k)

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


