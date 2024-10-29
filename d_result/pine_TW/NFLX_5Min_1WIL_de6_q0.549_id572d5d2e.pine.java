//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Williams_Vix_Fix
// ID_model: NFLX_5Min_1WIL_572d5d2e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NFLX_5Min_1WIL_572d5d2e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NFLX_5Min_572d5d2e(sDev, Color_con1, lowerBand, wvf, upperBand, midLine, Color_con2, rangeLow, colInt, rangeHigh)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( lowerBand <= 0.558744 )
		if( Color_con1 <= -0.245738 )
			if( upperBand <= 0.30092 )
				if( midLine <= 0.116658 )
					if( upperBand <= 0.281824 )
						if( upperBand <= 0.280846 )
							ret := -0.545455
						if( upperBand > 0.280846 )
							ret := 0.000000
					if( upperBand > 0.281824 )
						if( Color_con2 <= -0.463984 )
							ret := -0.333333
						if( Color_con2 > -0.463984 )
							ret := -0.978723 // sell
				if( midLine > 0.116658 )
					if( Color_con2 <= -0.218841 )
						if( Color_con1 <= -0.29765 )
							ret := -1.000000 // sell
						if( Color_con1 > -0.29765 )
							ret := 0.055556
					if( Color_con2 > -0.218841 )
						if( lowerBand <= -0.044604 )
							ret := 0.333333
						if( lowerBand > -0.044604 )
							ret := -0.722222 // sell
			if( upperBand > 0.30092 )
				if( wvf <= 1.31117 )
					if( upperBand <= 1.58296 )
						if( Color_con2 <= -0.087743 )
							ret := -0.041053
						if( Color_con2 > -0.087743 )
							ret := 0.068903
					if( upperBand > 1.58296 )
						if( midLine <= 1.08713 )
							ret := 0.134094
						if( midLine > 1.08713 )
							ret := -0.068798
				if( wvf > 1.31117 )
					if( sDev <= 1.49811 )
						if( Color_con2 <= 0.49726 )
							ret := -0.124815
						if( Color_con2 > 0.49726 )
							ret := -0.481319
					if( sDev > 1.49811 )
						if( wvf <= 1.99139 )
							ret := -0.184615
						if( wvf > 1.99139 )
							ret := 0.160391
		if( Color_con1 > -0.245738 )
			if( midLine <= 0.543782 )
				if( upperBand <= 0.249825 )
					if( upperBand <= 0.135293 )
						if( lowerBand <= -0.049867 )
							ret := 0.866667 // buy
						if( lowerBand > -0.049867 )
							ret := 0.260870
					if( upperBand > 0.135293 )
						if( lowerBand <= 0.050307 )
							ret := -0.126437
						if( lowerBand > 0.050307 )
							ret := -0.528090
				if( upperBand > 0.249825 )
					if( sDev <= 0.155051 )
						if( sDev <= 0.104729 )
							ret := -0.260274
						if( sDev > 0.104729 )
							ret := 0.209479
					if( sDev > 0.155051 )
						if( upperBand <= 0.442561 )
							ret := -0.049282
						if( upperBand > 0.442561 )
							ret := 0.079717
			if( midLine > 0.543782 )
				if( midLine <= 0.661221 )
					if( Color_con2 <= -0.642338 )
						if( lowerBand <= 0.37062 )
							ret := 0.470588
						if( lowerBand > 0.37062 )
							ret := -0.560000
					if( Color_con2 > -0.642338 )
						if( sDev <= 1.7367 )
							ret := -0.247632
						if( sDev > 1.7367 )
							ret := 0.857143 // buy
				if( midLine > 0.661221 )
					if( wvf <= 0.941193 )
						if( Color_con2 <= -0.042811 )
							ret := 0.000000
						if( Color_con2 > -0.042811 )
							ret := 0.709677 // buy
					if( wvf > 0.941193 )
						if( upperBand <= 1.20587 )
							ret := -0.322751
						if( upperBand > 1.20587 )
							ret := 0.028144
	if( lowerBand > 0.558744 )
		if( Color_con1 <= -0.534977 )
			if( sDev <= 0.513154 )
				if( midLine <= 1.33838 )
					if( Color_con2 <= -1.12425 )
						if( sDev <= 0.288747 )
							ret := 1.000000 // buy
						if( sDev > 0.288747 )
							ret := -0.677419
					if( Color_con2 > -1.12425 )
						if( lowerBand <= 0.572739 )
							ret := 0.666667
						if( lowerBand > 0.572739 )
							ret := 0.074586
				if( midLine > 1.33838 )
					if( Color_con2 <= -0.17261 )
						if( Color_con2 <= -0.264589 )
							ret := 0.872180 // buy
						if( Color_con2 > -0.264589 )
							ret := 0.428571
					if( Color_con2 > -0.17261 )
						ret := -1.000000 // sell
			if( sDev > 0.513154 )
				if( sDev <= 0.892557 )
					if( midLine <= 1.44405 )
						if( upperBand <= 1.86332 )
							ret := -0.334545
						if( upperBand > 1.86332 )
							ret := 0.321799
					if( midLine > 1.44405 )
						if( sDev <= 0.601862 )
							ret := 0.027778
						if( sDev > 0.601862 )
							ret := -0.474227
				if( sDev > 0.892557 )
					if( sDev <= 1.2071 )
						if( Color_con1 <= -0.582495 )
							ret := 0.432773
						if( Color_con1 > -0.582495 )
							ret := -0.888889 // sell
					if( sDev > 1.2071 )
						if( lowerBand <= 0.719441 )
							ret := -0.658537
						if( lowerBand > 0.719441 )
							ret := 0.054054
		if( Color_con1 > -0.534977 )
			if( sDev <= 0.307966 )
				if( Color_con2 <= 0.093376 )
					if( lowerBand <= 0.572557 )
						ret := 0.700000 // buy
					if( lowerBand > 0.572557 )
						if( Color_con2 <= -0.206158 )
							ret := -0.283951
						if( Color_con2 > -0.206158 )
							ret := 0.025806
				if( Color_con2 > 0.093376 )
					if( Color_con2 <= 0.143903 )
						ret := 1.000000 // buy
					if( Color_con2 > 0.143903 )
						ret := 0.166667
			if( sDev > 0.307966 )
				if( sDev <= 0.469085 )
					if( Color_con2 <= -0.825116 )
						if( wvf <= 1.09177 )
							ret := -0.700000 // sell
						if( wvf > 1.09177 )
							ret := 0.000000
					if( Color_con2 > -0.825116 )
						if( upperBand <= 2.29711 )
							ret := 0.613108
						if( upperBand > 2.29711 )
							ret := -0.428571
				if( sDev > 0.469085 )
					if( upperBand <= 2.09556 )
						if( midLine <= 1.43969 )
							ret := 0.068493
						if( midLine > 1.43969 )
							ret := -0.750000 // sell
					if( upperBand > 2.09556 )
						if( lowerBand <= 0.988785 )
							ret := 0.630137
						if( lowerBand > 0.988785 )
							ret := 0.137255
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_NFLX_5Min_572d5d2e(sDev, Color_con1, lowerBand, wvf, upperBand, midLine, Color_con2, rangeLow, colInt, rangeHigh)

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


