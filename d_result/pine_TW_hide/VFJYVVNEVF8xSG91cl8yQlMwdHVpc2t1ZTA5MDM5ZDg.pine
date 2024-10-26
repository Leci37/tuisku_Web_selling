//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: TRXUSDT_1Hour_2BS0_e09039d8 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_1Hour_2BS0_e09039d8", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_1Hour_e09039d8(bbm, bearPower, bbp, bullPower, BBPower_Color, d_k, d, rsi1, k, smoothD_d, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( rsi1 <= 58.1776 )
		if( d_k <= -0.653772 )
			if( bbp <= 0.000201 )
				if( bbp <= -0.001014 )
					if( rsi1 <= 28.7041 )
						if( bullPower <= -0.000858 )
							ret := 0.169014
						if( bullPower > -0.000858 )
							ret := -0.182109
					if( rsi1 > 28.7041 )
						if( bullPower <= -0.001771 )
							ret := 0.817708 // buy
						if( bullPower > -0.001771 )
							ret := 0.308328
				if( bbp > -0.001014 )
					if( rsi1 <= 43.7629 )
						if( bullPower <= 0.000106 )
							ret := -0.051544
						if( bullPower > 0.000106 )
							ret := -0.277492
					if( rsi1 > 43.7629 )
						if( bearPower <= -0.000329 )
							ret := 0.337014
						if( bearPower > -0.000329 )
							ret := 0.096268
			if( bbp > 0.000201 )
				if( d <= 85.3553 )
					if( bbp <= 0.000978 )
						if( rsi1 <= 44.6156 )
							ret := -0.548173
						if( rsi1 > 44.6156 )
							ret := -0.071935
					if( bbp > 0.000978 )
						if( rsi1 <= 54.2266 )
							ret := -0.666667
						if( rsi1 > 54.2266 )
							ret := -0.329787
				if( d > 85.3553 )
					if( bullPower <= 0.000396 )
						if( smoothK_k <= 96.2262 )
							ret := 0.060606
						if( smoothK_k > 96.2262 )
							ret := -0.622222
					if( bullPower > 0.000396 )
						if( smoothD_d <= 90.5823 )
							ret := 0.511962
						if( smoothD_d > 90.5823 )
							ret := 0.034884
		if( d_k > -0.653772 )
			if( rsi1 <= 31.4739 )
				if( bullPower <= -2.5e-05 )
					if( rsi1 <= 21.4482 )
						if( smoothK_k <= -2.97083 )
							ret := -0.603025
						if( smoothK_k > -2.97083 )
							ret := -0.359036
					if( rsi1 > 21.4482 )
						if( bbp <= -0.002454 )
							ret := 0.082278
						if( bbp > -0.002454 )
							ret := -0.287542
				if( bullPower > -2.5e-05 )
					if( bbm <= 0.000291 )
						if( d <= 10.921 )
							ret := -0.064935
						if( d > 10.921 )
							ret := -0.582734
					if( bbm > 0.000291 )
						if( bearPower <= -0.002024 )
							ret := -0.935065 // sell
						if( bearPower > -0.002024 )
							ret := -0.657795
			if( rsi1 > 31.4739 )
				if( bearPower <= 0.000108 )
					if( bullPower <= 0.000206 )
						if( rsi1 <= 41.524 )
							ret := -0.090606
						if( rsi1 > 41.524 )
							ret := 0.090113
					if( bullPower > 0.000206 )
						if( rsi1 <= 51.901 )
							ret := -0.325395
						if( rsi1 > 51.901 )
							ret := -0.068577
				if( bearPower > 0.000108 )
					if( smoothK_k <= 84.2269 )
						if( d_k <= 2.53105 )
							ret := -0.179612
						if( d_k > 2.53105 )
							ret := -0.647781
					if( smoothK_k > 84.2269 )
						if( rsi1 <= 54.8331 )
							ret := 0.068702
						if( rsi1 > 54.8331 )
							ret := -0.418367
	if( rsi1 > 58.1776 )
		if( bearPower <= -0.000125 )
			if( bearPower <= -0.000452 )
				if( bbm <= 0.008547 )
					if( smoothD_d <= 7.81213 )
						if( rsi1 <= 59.7682 )
							ret := 0.888889 // buy
						if( rsi1 > 59.7682 )
							ret := -0.466667
					if( smoothD_d > 7.81213 )
						if( smoothK_k <= 3.09511 )
							ret := -0.368421
						if( smoothK_k > 3.09511 )
							ret := 0.670401
				if( bbm > 0.008547 )
					ret := -0.800000 // sell
			if( bearPower > -0.000452 )
				if( d_k <= 0.650042 )
					if( d <= 40.2431 )
						if( k <= 28.4441 )
							ret := 0.437500
						if( k > 28.4441 )
							ret := 0.693878
					if( d > 40.2431 )
						if( rsi1 <= 59.5348 )
							ret := 0.105263
						if( rsi1 > 59.5348 )
							ret := 0.439412
				if( d_k > 0.650042 )
					if( d <= 95.7874 )
						if( bbm <= 0.000592 )
							ret := 0.170561
						if( bbm > 0.000592 )
							ret := 0.383929
					if( d > 95.7874 )
						if( bbm <= 0.000486 )
							ret := 0.439024
						if( bbm > 0.000486 )
							ret := -0.820513 // sell
		if( bearPower > -0.000125 )
			if( smoothK_k <= 93.5414 )
				if( bearPower <= 0.000118 )
					if( d_k <= 0.003776 )
						if( bbm <= 0.00021 )
							ret := 0.079196
						if( bbm > 0.00021 )
							ret := 0.297853
					if( d_k > 0.003776 )
						if( d <= 78.3625 )
							ret := -0.009731
						if( d > 78.3625 )
							ret := 0.127730
				if( bearPower > 0.000118 )
					if( rsi1 <= 68.1627 )
						if( d_k <= 17.4585 )
							ret := -0.205534
						if( d_k > 17.4585 )
							ret := -0.687719
					if( rsi1 > 68.1627 )
						if( bullPower <= 0.004933 )
							ret := 0.151185
						if( bullPower > 0.004933 )
							ret := -0.441860
			if( smoothK_k > 93.5414 )
				if( bbm <= 0.000485 )
					if( d_k <= -16.5976 )
						if( d_k <= -18.6604 )
							ret := 0.166667
						if( d_k > -18.6604 )
							ret := -0.688889
					if( d_k > -16.5976 )
						if( BBPower_Color <= 0.5 )
							ret := 0.593750
						if( BBPower_Color > 0.5 )
							ret := 0.127756
				if( bbm > 0.000485 )
					if( rsi1 <= 77.8658 )
						if( bullPower <= 0.000685 )
							ret := 0.647059
						if( bullPower > 0.000685 )
							ret := 0.225256
					if( rsi1 > 77.8658 )
						if( smoothK_k <= 96.9846 )
							ret := 0.453271
						if( smoothK_k > 96.9846 )
							ret := 0.693593
	
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
float op_operation = decision_tree_0_TRXUSDT_1Hour_e09039d8(bbm, bearPower, bbp, bullPower, BBPower_Color, d_k, d, rsi1, k, smoothD_d, smoothK_k)

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


