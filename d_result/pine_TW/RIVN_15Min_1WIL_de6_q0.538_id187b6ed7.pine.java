//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Williams_Vix_Fix
// ID_model: RIVN_15Min_1WIL_187b6ed7 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_RIVN_15Min_1WIL_187b6ed7", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_RIVN_15Min_187b6ed7(Color_con1, Color_con2, colInt, rangeHigh, midLine, sDev, rangeLow, upperBand, lowerBand, wvf)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( Color_con2 <= -5.60791 )
		if( lowerBand <= 0.178794 )
			if( sDev <= 5.07785 )
				if( lowerBand <= -0.084665 )
					if( wvf <= 4.74282 )
						if( wvf <= 2.47831 )
							ret := -0.332553
						if( wvf > 2.47831 )
							ret := -0.876106 // sell
					if( wvf > 4.74282 )
						if( Color_con2 <= -8.76419 )
							ret := -0.500000
						if( Color_con2 > -8.76419 )
							ret := 1.000000 // buy
				if( lowerBand > -0.084665 )
					if( Color_con2 <= -7.61214 )
						if( sDev <= 1.03415 )
							ret := -0.207407
						if( sDev > 1.03415 )
							ret := 0.613636
					if( Color_con2 > -7.61214 )
						if( lowerBand <= -0.026399 )
							ret := 0.031579
						if( lowerBand > -0.026399 )
							ret := -0.461187
			if( sDev > 5.07785 )
				if( midLine <= 5.36806 )
					if( sDev <= 6.00997 )
						if( upperBand <= 8.19145 )
							ret := 0.523810
						if( upperBand > 8.19145 )
							ret := -0.164773
					if( sDev > 6.00997 )
						if( wvf <= 1.84768 )
							ret := 0.393013
						if( wvf > 1.84768 )
							ret := -0.703704 // sell
				if( midLine > 5.36806 )
					if( lowerBand <= -5.12958 )
						ret := 1.000000 // buy
					if( lowerBand > -5.12958 )
						if( lowerBand <= -2.07492 )
							ret := -0.729167 // sell
						if( lowerBand > -2.07492 )
							ret := -0.176101
		if( lowerBand > 0.178794 )
			if( Color_con2 <= -7.97246 )
				if( upperBand <= 21.9301 )
					if( lowerBand <= 2.39692 )
						if( Color_con2 <= -9.2345 )
							ret := -0.008065
						if( Color_con2 > -9.2345 )
							ret := 0.432099
					if( lowerBand > 2.39692 )
						if( lowerBand <= 5.41641 )
							ret := 0.886792 // buy
						if( lowerBand > 5.41641 )
							ret := 0.000000
				if( upperBand > 21.9301 )
					if( Color_con1 <= -18.4126 )
						ret := 0.000000
					if( Color_con1 > -18.4126 )
						ret := -1.000000 // sell
			if( Color_con2 > -7.97246 )
				if( sDev <= 4.30888 )
					if( lowerBand <= 0.976808 )
						if( sDev <= 3.52349 )
							ret := -0.015625
						if( sDev > 3.52349 )
							ret := -0.866667 // sell
					if( lowerBand > 0.976808 )
						if( midLine <= 7.58654 )
							ret := 0.561290
						if( midLine > 7.58654 )
							ret := -0.363636
				if( sDev > 4.30888 )
					if( sDev <= 5.80367 )
						if( midLine <= 11.9837 )
							ret := -0.427184
						if( midLine > 11.9837 )
							ret := 1.000000 // buy
					if( sDev > 5.80367 )
						if( sDev <= 7.6534 )
							ret := 0.516667
						if( sDev > 7.6534 )
							ret := -1.000000 // sell
	if( Color_con2 > -5.60791 )
		if( upperBand <= 2.28032 )
			if( Color_con1 <= 0.668581 )
				if( upperBand <= 1.12214 )
					if( upperBand <= 1.03358 )
						if( Color_con2 <= -0.414056 )
							ret := 0.025618
						if( Color_con2 > -0.414056 )
							ret := -0.296429
					if( upperBand > 1.03358 )
						if( Color_con2 <= -0.053989 )
							ret := 0.224751
						if( Color_con2 > -0.053989 )
							ret := -0.390244
				if( upperBand > 1.12214 )
					if( wvf <= 0.874135 )
						if( Color_con2 <= -2.49941 )
							ret := -0.176327
						if( Color_con2 > -2.49941 )
							ret := 0.029971
					if( wvf > 0.874135 )
						if( Color_con2 <= 1.26097 )
							ret := -0.127938
						if( Color_con2 > 1.26097 )
							ret := 0.616667
			if( Color_con1 > 0.668581 )
				if( midLine <= 0.971202 )
					if( upperBand <= 1.89966 )
						if( wvf <= 2.37606 )
							ret := 0.041667
						if( wvf > 2.37606 )
							ret := 0.706349 // buy
					if( upperBand > 1.89966 )
						if( midLine <= 0.88639 )
							ret := -0.033898
						if( midLine > 0.88639 )
							ret := 0.722222 // buy
				if( midLine > 0.971202 )
					if( midLine <= 1.03855 )
						ret := -1.000000 // sell
					if( midLine > 1.03855 )
						ret := 0.200000
		if( upperBand > 2.28032 )
			if( sDev <= 4.42274 )
				if( Color_con2 <= -0.936644 )
					if( midLine <= 1.68097 )
						if( upperBand <= 2.356 )
							ret := 0.188841
						if( upperBand > 2.356 )
							ret := -0.080766
					if( midLine > 1.68097 )
						if( Color_con1 <= -0.352964 )
							ret := 0.038760
						if( Color_con1 > -0.352964 )
							ret := 0.529126
				if( Color_con2 > -0.936644 )
					if( sDev <= 1.50771 )
						if( wvf <= 1.61516 )
							ret := 0.132605
						if( wvf > 1.61516 )
							ret := -0.038944
					if( sDev > 1.50771 )
						if( sDev <= 1.76033 )
							ret := 0.230499
						if( sDev > 1.76033 )
							ret := 0.074969
			if( sDev > 4.42274 )
				if( upperBand <= 16.9747 )
					if( Color_con2 <= 2.85147 )
						if( lowerBand <= 2.08674 )
							ret := -0.192016
						if( lowerBand > 2.08674 )
							ret := -0.513423
					if( Color_con2 > 2.85147 )
						if( wvf <= 6.3695 )
							ret := 0.716049 // buy
						if( wvf > 6.3695 )
							ret := -0.014118
				if( upperBand > 16.9747 )
					if( Color_con2 <= -1.99525 )
						if( upperBand <= 21.8507 )
							ret := -0.875000 // sell
						if( upperBand > 21.8507 )
							ret := 0.600000
					if( Color_con2 > -1.99525 )
						if( Color_con2 <= 9.24432 )
							ret := 0.664894
						if( Color_con2 > 9.24432 )
							ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Williams_Vix_Fix 
//@version=5
//indicator "CM_Williams_Vix_Fix", overlay=false)

// Inputs
pd = input.int(22, title="LookBack Period Standard Deviation High")
bbl = input.int(20, title="Bollinger Band Length")
mult = input.float(2.0, minval=1, maxval=5, title="Bollinger Band Standard Deviation Up")
lb = input.int(50, title="Look Back Period Percentile High")
ph = input.float(0.85, title="Highest Percentile - 0.90=90%, 0.95=95%, 0.99=99%")
pl = input.float(1.01, title="Lowest Percentile - 1.10=90%, 1.05=95%, 1.01=99%")
hp = input.bool(false, title="Show High Range - Based on Percentile and LookBack Period?")
sd = input.bool(false, title="Show Standard Deviation Line?")

// Calculations
wvf = ((ta.highest(close, pd) - low) / ta.highest(close, pd)) * 100

sDev = mult * ta.stdev(wvf, bbl)
midLine = ta.sma(wvf, bbl)
lowerBand = midLine - sDev
upperBand = midLine + sDev

rangeHigh = ta.highest(wvf, lb) * ph
rangeLow = ta.lowest(wvf, lb) * pl


Color_con1 = wvf - upperBand
Color_con2 = wvf - rangeHigh
// Color condition
col = wvf >= upperBand or wvf >= rangeHigh ? color.lime : color.gray
colInt = wvf >= upperBand or wvf >= rangeHigh ? 1 : 0 //Bool to int

// Plots
plot(hp and na(rangeHigh) ? na : rangeHigh, title="Range High Percentile", color=color.orange, linewidth=4)
plot(hp and na(rangeLow) ? na : rangeLow, title="Range Low Percentile", color=color.orange, linewidth=4)
plot(wvf, title="Williams Vix Fix", color=col, style=plot.style_histogram, linewidth=4)
plot(sd and na(upperBand) ? na : upperBand, title="Upper Band", color=color.aqua, linewidth=3)

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
float op_operation = decision_tree_0_RIVN_15Min_187b6ed7(Color_con1, Color_con2, colInt, rangeHigh, midLine, sDev, rangeLow, upperBand, lowerBand, wvf)

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


