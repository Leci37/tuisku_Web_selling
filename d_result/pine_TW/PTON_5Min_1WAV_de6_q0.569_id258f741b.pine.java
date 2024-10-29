//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: PTON_5Min_1WAV_258f741b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PTON_5Min_1WAV_258f741b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PTON_5Min_258f741b(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.6, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ci <= -28.663 )
		if( ci <= -132.329 )
			if( esa <= 4.91905 )
				if( tci <= -25.6018 )
					if( d <= 0.030376 )
						if( ci_wt2 <= -174.103 )
							ret := 0.666667
						if( ci_wt2 > -174.103 )
							ret := 0.284895
					if( d > 0.030376 )
						if( d_tci <= 42.1402 )
							ret := -0.625000
						if( d_tci > 42.1402 )
							ret := 0.324675
				if( tci > -25.6018 )
					if( ci_wt2 <= -122.605 )
						if( ap <= 4.70796 )
							ret := 0.695958
						if( ap > 4.70796 )
							ret := 0.238095
					if( ci_wt2 > -122.605 )
						if( ap <= 4.39081 )
							ret := -1.000000 // sell
						if( ap > 4.39081 )
							ret := -0.428571
			if( esa > 4.91905 )
				if( wt2 <= -14.8083 )
					if( ap <= 4.91289 )
						if( ci_wt2 <= -146.315 )
							ret := -1.000000 // sell
						if( ci_wt2 > -146.315 )
							ret := -0.111111
					if( ap > 4.91289 )
						if( d <= 0.019352 )
							ret := 0.580420
						if( d > 0.019352 )
							ret := 0.260870
				if( wt2 > -14.8083 )
					if( wt2 <= 23.7113 )
						if( tci <= -0.244351 )
							ret := 0.006303
						if( tci > -0.244351 )
							ret := 0.560345
					if( wt2 > 23.7113 )
						if( tci <= 17.7951 )
							ret := -0.576923
						if( tci > 17.7951 )
							ret := 0.391304
		if( ci > -132.329 )
			if( tci <= -7.14249 )
				if( d <= 0.176473 )
					if( esa <= 4.55287 )
						if( d_tci <= 68.8105 )
							ret := 0.083912
						if( d_tci > 68.8105 )
							ret := 0.373702
					if( esa > 4.55287 )
						if( ci <= -89.1696 )
							ret := -0.064325
						if( ci > -89.1696 )
							ret := 0.064603
				if( d > 0.176473 )
					if( ci <= -38.1043 )
						if( esa <= 6.47615 )
							ret := -0.790323 // sell
						if( esa > 6.47615 )
							ret := -0.395833
					if( ci > -38.1043 )
						ret := 0.545455
			if( tci > -7.14249 )
				if( esa <= 3.60558 )
					if( d <= 0.012304 )
						if( d_tci <= -20.9435 )
							ret := -0.059322
						if( d_tci > -20.9435 )
							ret := 0.303109
					if( d > 0.012304 )
						if( ci <= -43.5299 )
							ret := 0.619512
						if( ci > -43.5299 )
							ret := 0.141026
				if( esa > 3.60558 )
					if( wt2 <= -3.45453 )
						if( ci <= -34.4981 )
							ret := 0.538462
						if( ci > -34.4981 )
							ret := 0.931818 // buy
					if( wt2 > -3.45453 )
						if( ap <= 5.7901 )
							ret := 0.146158
						if( ap > 5.7901 )
							ret := 0.009488
	if( ci > -28.663 )
		if( ci <= 48.7231 )
			if( ci_wt2 <= 87.8287 )
				if( ci_wt2 <= -25.5763 )
					if( ci_wt2 <= -41.6669 )
						if( tci <= 16.0504 )
							ret := -0.541667
						if( tci > 16.0504 )
							ret := 0.034375
					if( ci_wt2 > -41.6669 )
						if( d <= 0.123286 )
							ret := -0.152805
						if( d > 0.123286 )
							ret := -0.937500 // sell
				if( ci_wt2 > -25.5763 )
					if( d_tci <= -43.0842 )
						if( d <= 0.041184 )
							ret := 0.253564
						if( d > 0.041184 )
							ret := -0.056140
					if( d_tci > -43.0842 )
						if( tci <= -62.0703 )
							ret := -0.379630
						if( tci > -62.0703 )
							ret := -0.004136
			if( ci_wt2 > 87.8287 )
				if( ap <= 4.03309 )
					if( d <= 0.011619 )
						ret := -0.300000
					if( d > 0.011619 )
						if( ci_wt2 <= 102.627 )
							ret := -0.846154 // sell
						if( ci_wt2 > 102.627 )
							ret := -0.500000
				if( ap > 4.03309 )
					if( d <= 0.026952 )
						if( ci <= 47.52 )
							ret := -0.379310
						if( ci > 47.52 )
							ret := -0.800000 // sell
					if( d > 0.026952 )
						if( tci <= -53.751 )
							ret := -0.285714
						if( tci > -53.751 )
							ret := 0.315789
		if( ci > 48.7231 )
			if( ci_wt2 <= 175.855 )
				if( tci <= 67.8053 )
					if( tci <= 63.0752 )
						if( tci <= -37.8701 )
							ret := -0.443902
						if( tci > -37.8701 )
							ret := -0.107043
					if( tci > 63.0752 )
						if( wt2 <= 61.9359 )
							ret := 0.003236
						if( wt2 > 61.9359 )
							ret := 0.292035
				if( tci > 67.8053 )
					if( ap <= 5.00948 )
						if( d <= 0.025377 )
							ret := -0.016393
						if( d > 0.025377 )
							ret := -0.640449
					if( ap > 5.00948 )
						if( esa <= 8.84906 )
							ret := -0.093578
						if( esa > 8.84906 )
							ret := 0.500000
			if( ci_wt2 > 175.855 )
				if( wt2 <= 20.1651 )
					if( ci_wt2 <= 212.808 )
						if( ci_wt2 <= 191.976 )
							ret := -0.547893
						if( ci_wt2 > 191.976 )
							ret := -0.241706
					if( ci_wt2 > 212.808 )
						if( esa <= 6.50537 )
							ret := -0.813008 // sell
						if( esa > 6.50537 )
							ret := -0.609375
				if( wt2 > 20.1651 )
					if( ci <= 216.569 )
						if( esa <= 5.13884 )
							ret := 0.000000
						if( esa > 5.13884 )
							ret := 1.000000 // buy
					if( ci > 216.569 )
						if( tci <= 59.6277 )
							ret := -0.469136
						if( tci > 59.6277 )
							ret := 0.875000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Wave_Trend_Calculation 
//@version=5
//indicator "WaveTrend [LazyBear]", shorttitle="WT_LB", overlay=false)

n1 = input.int(10, title="Channel Length")
n2 = input.int(21, title="Average Length")
obLevel1 = input.float(60, title="Over Bought Level 1")
obLevel2 = input.float(53, title="Over Bought Level 2")
osLevel1 = input.float(-60, title="Over Sold Level 1")
osLevel2 = input.float(-53, title="Over Sold Level 2")

ap = hlc3
esa = ta.ema(ap, n1)
d = ta.ema(math.abs(ap - esa), n1)
ci = (ap - esa) / (0.015 * d)
tci = ta.ema(ci, n2)

wt1 = tci
wt2 = ta.sma(wt1, 4)

d_tci = d-tci
ci_wt2 = ci - wt2

plot(0, color=color.gray)
plot(obLevel1, color=color.red)
plot(osLevel1, color=color.green)
plot(obLevel2, color=color.red, linewidth=2, style=plot.style_line, title="OB Level 2 (Dashed)", color=color.red)
plot(osLevel2, color=color.green, linewidth=2, style=plot.style_line, title="OS Level 2 (Dashed)", color=color.green)

plot(wt1, color=color.green, title="WT1")
plot(wt2, color=color.red, title="WT2", style=plot.style_line, linewidth=1)
plot(wt1 - wt2, color=color.new(color.blue, 80), title="WT1-WT2", style=plot.style_area)

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
float op_operation = decision_tree_0_PTON_5Min_258f741b(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)

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


