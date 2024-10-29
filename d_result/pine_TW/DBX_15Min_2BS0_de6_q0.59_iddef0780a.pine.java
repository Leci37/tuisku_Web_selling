//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: DBX_15Min_2BS0_def0780a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DBX_15Min_2BS0_def0780a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DBX_15Min_def0780a(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( bullPower <= -0.012252 )
		if( bbm <= 0.039409 )
			if( bbp <= -0.378418 )
				if( d <= 0.535149 )
					if( bbp <= -0.629491 )
						if( bearPower <= -0.389281 )
							ret := 1.000000 // buy
						if( bearPower > -0.389281 )
							ret := 0.777778 // buy
					if( bbp > -0.629491 )
						if( bbm <= 0.000218 )
							ret := -0.166667
						if( bbm > 0.000218 )
							ret := -0.913043 // sell
				if( d > 0.535149 )
					if( rsi1 <= 29.7376 )
						if( k <= 67.4509 )
							ret := 0.788462 // buy
						if( k > 67.4509 )
							ret := -0.090909
					if( rsi1 > 29.7376 )
						if( smoothK_k <= 13.4684 )
							ret := 0.095238
						if( smoothK_k > 13.4684 )
							ret := 0.628352
			if( bbp > -0.378418 )
				if( bbp <= -0.170356 )
					if( rsi1 <= 41.9693 )
						if( rsi1 <= 13.1785 )
							ret := -0.517241
						if( rsi1 > 13.1785 )
							ret := 0.249025
					if( rsi1 > 41.9693 )
						if( rsi1 <= 43.4325 )
							ret := 0.801418 // buy
						if( rsi1 > 43.4325 )
							ret := 0.408578
				if( bbp > -0.170356 )
					if( smoothD_d <= 93.5296 )
						if( rsi1 <= 53.1512 )
							ret := 0.138078
						if( rsi1 > 53.1512 )
							ret := 0.410959
					if( smoothD_d > 93.5296 )
						if( smoothK_k <= 92.1483 )
							ret := -0.636364
						if( smoothK_k > 92.1483 )
							ret := -1.000000 // sell
		if( bbm > 0.039409 )
			if( k <= 39.8066 )
				if( bullPower <= -0.26267 )
					if( rsi1 <= 7.92342 )
						if( bbm <= 0.3088 )
							ret := -0.673077
						if( bbm > 0.3088 )
							ret := 0.833333 // buy
					if( rsi1 > 7.92342 )
						if( k <= 38.5115 )
							ret := 0.326280
						if( k > 38.5115 )
							ret := -0.937500 // sell
				if( bullPower > -0.26267 )
					if( bullPower <= -0.05763 )
						if( bbm <= 0.072204 )
							ret := 0.102519
						if( bbm > 0.072204 )
							ret := -0.056832
					if( bullPower > -0.05763 )
						if( bbm <= 0.105149 )
							ret := 0.017330
						if( bbm > 0.105149 )
							ret := 0.139037
			if( k > 39.8066 )
				if( d_k <= 10.682 )
					if( bearPower <= -0.516764 )
						if( smoothD_d <= 69.2682 )
							ret := -0.607477
						if( smoothD_d > 69.2682 )
							ret := 0.352941
					if( bearPower > -0.516764 )
						if( rsi1 <= 32.7476 )
							ret := 0.281139
						if( rsi1 > 32.7476 )
							ret := 0.064333
				if( d_k > 10.682 )
					if( rsi1 <= 44.7074 )
						if( smoothK_k <= 65.3849 )
							ret := 0.485294
						if( smoothK_k > 65.3849 )
							ret := -0.009259
					if( rsi1 > 44.7074 )
						if( rsi1 <= 45.0632 )
							ret := -0.846154 // sell
						if( rsi1 > 45.0632 )
							ret := 0.144928
	if( bullPower > -0.012252 )
		if( bearPower <= 0.177936 )
			if( rsi1 <= 64.387 )
				if( rsi1 <= 45.6037 )
					if( smoothD_d <= 12.3057 )
						if( smoothK_k <= 17.7654 )
							ret := -0.029211
						if( smoothK_k > 17.7654 )
							ret := -0.323529
					if( smoothD_d > 12.3057 )
						if( bearPower <= -0.122549 )
							ret := 0.174359
						if( bearPower > -0.122549 )
							ret := 0.043607
				if( rsi1 > 45.6037 )
					if( d <= 75.872 )
						if( smoothK_k <= 34.5627 )
							ret := -0.000899
						if( smoothK_k > 34.5627 )
							ret := -0.088796
					if( d > 75.872 )
						if( smoothD_d <= 73.8849 )
							ret := 0.250000
						if( smoothD_d > 73.8849 )
							ret := -0.000117
			if( rsi1 > 64.387 )
				if( d <= 66.9605 )
					if( smoothK_k <= 77.8706 )
						if( rsi1 <= 77.8519 )
							ret := -0.206967
						if( rsi1 > 77.8519 )
							ret := 0.042735
					if( smoothK_k > 77.8706 )
						if( bbp <= 0.101882 )
							ret := 0.120000
						if( bbp > 0.101882 )
							ret := -0.675978
				if( d > 66.9605 )
					if( bearPower <= -0.060222 )
						if( smoothD_d <= 84.4179 )
							ret := -0.155000
						if( smoothD_d > 84.4179 )
							ret := -0.635922
					if( bearPower > -0.060222 )
						if( d_k <= -2.47312 )
							ret := -0.139305
						if( d_k > -2.47312 )
							ret := -0.032652
		if( bearPower > 0.177936 )
			if( bbm <= 0.087794 )
				if( rsi1 <= 58.6179 )
					if( smoothD_d <= 68.164 )
						if( d <= 45.8298 )
							ret := -0.552381
						if( d > 45.8298 )
							ret := -0.148148
					if( smoothD_d > 68.164 )
						if( d_k <= -0.794572 )
							ret := 0.750000 // buy
						if( d_k > -0.794572 )
							ret := -0.533333
				if( rsi1 > 58.6179 )
					if( bbp <= 0.549429 )
						if( bbm <= 0.010062 )
							ret := -0.343675
						if( bbm > 0.010062 )
							ret := -0.517167
					if( bbp > 0.549429 )
						if( bullPower <= 0.365957 )
							ret := -0.635417
						if( bullPower > 0.365957 )
							ret := -0.865942 // sell
			if( bbm > 0.087794 )
				if( smoothD_d <= 94.6583 )
					if( d_k <= -25.5675 )
						if( bearPower <= 0.276075 )
							ret := 0.147059
						if( bearPower > 0.276075 )
							ret := 0.875000 // buy
					if( d_k > -25.5675 )
						if( rsi1 <= 89.3594 )
							ret := -0.235161
						if( rsi1 > 89.3594 )
							ret := 0.397260
				if( smoothD_d > 94.6583 )
					if( bearPower <= 0.220282 )
						if( d_k <= -0.092755 )
							ret := 0.304348
						if( d_k > -0.092755 )
							ret := -0.333333
					if( bearPower > 0.220282 )
						if( d <= 99.9989 )
							ret := 0.268293
						if( d > 99.9989 )
							ret := -0.240000
	
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
float op_operation = decision_tree_0_DBX_15Min_def0780a(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


