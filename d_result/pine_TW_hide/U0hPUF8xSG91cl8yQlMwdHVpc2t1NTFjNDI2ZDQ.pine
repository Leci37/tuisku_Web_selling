//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: SHOP_1Hour_2BS0_51c426d4 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SHOP_1Hour_2BS0_51c426d4", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SHOP_1Hour_51c426d4(bbm, bearPower, bbp, bullPower, BBPower_Color, d_k, d, rsi1, k, smoothD_d, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( rsi1 <= 39.2769 )
		if( smoothD_d <= -1.86739 )
			if( bearPower <= -6.00616 )
				if( bbp <= -48.9017 )
					if( bbm <= 30.1595 )
						if( bbp <= -58.4824 )
							ret := -0.563380
						if( bbp > -58.4824 )
							ret := 0.440000
					if( bbm > 30.1595 )
						ret := 0.857143 // buy
				if( bbp > -48.9017 )
					if( bbm <= 0.08 )
						ret := 0.307692
					if( bbm > 0.08 )
						if( smoothD_d <= -1.91368 )
							ret := -0.712177 // sell
						if( smoothD_d > -1.91368 )
							ret := 0.000000
			if( bearPower > -6.00616 )
				if( rsi1 <= 25.7053 )
					if( rsi1 <= 6.33583 )
						ret := 0.733333 // buy
					if( rsi1 > 6.33583 )
						if( bbm <= 0.281287 )
							ret := -0.138462
						if( bbm > 0.281287 )
							ret := -0.496124
				if( rsi1 > 25.7053 )
					if( bearPower <= -4.39453 )
						ret := -0.428571
					if( bearPower > -4.39453 )
						if( rsi1 <= 34.3308 )
							ret := 0.620000
						if( rsi1 > 34.3308 )
							ret := 0.037037
		if( smoothD_d > -1.86739 )
			if( bbp <= 1.1414 )
				if( bullPower <= 8.62531 )
					if( bbm <= 21.2009 )
						if( bearPower <= -13.2467 )
							ret := -0.199326
						if( bearPower > -13.2467 )
							ret := -0.031220
					if( bbm > 21.2009 )
						if( d <= 34.9151 )
							ret := 0.266355
						if( d > 34.9151 )
							ret := -0.175000
				if( bullPower > 8.62531 )
					if( bbm <= 35.6039 )
						if( d_k <= -17.5281 )
							ret := 0.000000
						if( d_k > -17.5281 )
							ret := -0.810345 // sell
					if( bbm > 35.6039 )
						if( k <= 78.7264 )
							ret := -0.142857
						if( k > 78.7264 )
							ret := -1.000000 // sell
			if( bbp > 1.1414 )
				if( smoothD_d <= 17.0769 )
					if( smoothK_k <= -0.509072 )
						ret := 1.000000 // buy
					if( smoothK_k > -0.509072 )
						if( d <= 4.97623 )
							ret := 0.428571
						if( d > 4.97623 )
							ret := -0.783784 // sell
				if( smoothD_d > 17.0769 )
					if( bbm <= 5.59925 )
						if( smoothD_d <= 74.3281 )
							ret := -0.740741 // sell
						if( smoothD_d > 74.3281 )
							ret := 0.500000
					if( bbm > 5.59925 )
						if( smoothK_k <= 41.31 )
							ret := 0.772727 // buy
						if( smoothK_k > 41.31 )
							ret := -0.312500
	if( rsi1 > 39.2769 )
		if( d <= 2.15058 )
			if( rsi1 <= 53.9084 )
				if( smoothK_k <= -2.50047 )
					if( bullPower <= 4.22491 )
						if( bbm <= 2.10642 )
							ret := 0.702970 // buy
						if( bbm > 2.10642 )
							ret := 0.240000
					if( bullPower > 4.22491 )
						ret := -0.285714
				if( smoothK_k > -2.50047 )
					if( d_k <= 0.996546 )
						if( bullPower <= -3.14807 )
							ret := 0.714286 // buy
						if( bullPower > -3.14807 )
							ret := -0.010000
					if( d_k > 0.996546 )
						ret := 1.000000 // buy
			if( rsi1 > 53.9084 )
				if( rsi1 <= 64.513 )
					ret := 1.000000 // buy
				if( rsi1 > 64.513 )
					ret := 0.285714
		if( d > 2.15058 )
			if( bearPower <= 15.9254 )
				if( bearPower <= 13.12 )
					if( bbm <= 9.16535 )
						if( d_k <= 17.5613 )
							ret := 0.059467
						if( d_k > 17.5613 )
							ret := -0.129374
					if( bbm > 9.16535 )
						if( rsi1 <= 60.0221 )
							ret := -0.147989
						if( rsi1 > 60.0221 )
							ret := 0.097117
				if( bearPower > 13.12 )
					if( smoothK_k <= 95.9806 )
						if( d <= 13.4625 )
							ret := -0.769231 // sell
						if( d > 13.4625 )
							ret := 0.260000
					if( smoothK_k > 95.9806 )
						if( k <= 99.9757 )
							ret := 0.940476 // buy
						if( k > 99.9757 )
							ret := 0.350000
			if( bearPower > 15.9254 )
				if( rsi1 <= 72.6785 )
					if( d_k <= -0.936576 )
						if( k <= 67.9167 )
							ret := -0.711538 // sell
						if( k > 67.9167 )
							ret := -0.047619
					if( d_k > -0.936576 )
						if( d_k <= 2.62576 )
							ret := -0.923077 // sell
						if( d_k > 2.62576 )
							ret := -0.241379
				if( rsi1 > 72.6785 )
					if( bbm <= 11.3895 )
						if( rsi1 <= 93.4993 )
							ret := -0.134897
						if( rsi1 > 93.4993 )
							ret := -0.785714 // sell
					if( bbm > 11.3895 )
						if( bbp <= 77.3864 )
							ret := 0.050505
						if( bbp > 77.3864 )
							ret := 0.614035
	
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
float op_operation = decision_tree_0_SHOP_1Hour_51c426d4(bbm, bearPower, bbp, bullPower, BBPower_Color, d_k, d, rsi1, k, smoothD_d, smoothK_k)

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


