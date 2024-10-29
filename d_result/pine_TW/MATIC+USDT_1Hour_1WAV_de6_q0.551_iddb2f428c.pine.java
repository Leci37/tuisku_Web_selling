//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: MATICUSDT_1Hour_1WAV_db2f428c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MATICUSDT_1Hour_1WAV_db2f428c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MATICUSDT_1Hour_db2f428c(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( ap <= 0.366105 )
		if( ci_wt2 <= 40.6273 )
			if( wt2 <= 50.9297 )
				if( d_tci <= -2.31433 )
					if( ci <= -50.3693 )
						if( ci_wt2 <= -88.1288 )
							ret := 0.202564
						if( ci_wt2 > -88.1288 )
							ret := 0.615721
					if( ci > -50.3693 )
						if( tci <= 54.8629 )
							ret := 0.139365
						if( tci > 54.8629 )
							ret := 0.818182 // buy
				if( d_tci > -2.31433 )
					if( d <= 0.000129 )
						if( ci_wt2 <= 5.26502 )
							ret := -0.133259
						if( ci_wt2 > 5.26502 )
							ret := 0.095041
					if( d > 0.000129 )
						if( ci_wt2 <= -140.643 )
							ret := -0.294872
						if( ci_wt2 > -140.643 )
							ret := 0.103959
			if( wt2 > 50.9297 )
				if( wt2 <= 64.6729 )
					if( ci <= -9.95102 )
						if( ci <= -22.3791 )
							ret := -0.273504
						if( ci > -22.3791 )
							ret := -0.809524 // sell
					if( ci > -9.95102 )
						if( ci_wt2 <= -7.02601 )
							ret := 0.016949
						if( ci_wt2 > -7.02601 )
							ret := -0.269231
				if( wt2 > 64.6729 )
					if( ci <= 97.4634 )
						if( tci <= 73.8717 )
							ret := 0.216966
						if( tci > 73.8717 )
							ret := 0.539877
					if( ci > 97.4634 )
						if( ap <= 0.017975 )
							ret := 0.750000 // buy
						if( ap > 0.017975 )
							ret := -0.867925 // sell
		if( ci_wt2 > 40.6273 )
			if( ci <= 19.2111 )
				if( d <= 0.008122 )
					if( wt2 <= -28.0316 )
						if( tci <= -26.1496 )
							ret := -0.284468
						if( tci > -26.1496 )
							ret := 0.583333
					if( wt2 > -28.0316 )
						if( ci_wt2 <= 43.0689 )
							ret := -0.777778 // sell
						if( ci_wt2 > 43.0689 )
							ret := -1.000000 // sell
				if( d > 0.008122 )
					if( ap <= 0.34406 )
						ret := 1.000000 // buy
					if( ap > 0.34406 )
						ret := 0.090909
			if( ci > 19.2111 )
				if( ci_wt2 <= 42.4275 )
					if( tci <= 65.0432 )
						if( ap <= 0.193487 )
							ret := -0.796875 // sell
						if( ap > 0.193487 )
							ret := 0.083333
					if( tci > 65.0432 )
						ret := 0.846154 // buy
				if( ci_wt2 > 42.4275 )
					if( wt2 <= -59.2595 )
						if( ci <= 30.1063 )
							ret := 0.000000
						if( ci > 30.1063 )
							ret := -0.750000 // sell
					if( wt2 > -59.2595 )
						if( wt2 <= 48.5727 )
							ret := 0.063091
						if( wt2 > 48.5727 )
							ret := -0.199377
	if( ap > 0.366105 )
		if( ci <= 153.278 )
			if( wt2 <= -73.3883 )
				if( tci <= -77.4092 )
					if( ci <= -88.7346 )
						if( d <= 0.019469 )
							ret := -0.034483
						if( d > 0.019469 )
							ret := 0.759259 // buy
					if( ci > -88.7346 )
						if( ci <= -68.948 )
							ret := -0.739130 // sell
						if( ci > -68.948 )
							ret := -0.108696
				if( tci > -77.4092 )
					if( d <= 0.011268 )
						if( tci <= -71.9614 )
							ret := -0.333333
						if( tci > -71.9614 )
							ret := 0.470588
					if( d > 0.011268 )
						if( d <= 0.036963 )
							ret := 0.664948
						if( d > 0.036963 )
							ret := -0.037037
			if( wt2 > -73.3883 )
				if( ci_wt2 <= -24.8167 )
					if( d <= 0.04227 )
						if( ap <= 1.36813 )
							ret := 0.016686
						if( ap > 1.36813 )
							ret := -0.126320
					if( d > 0.04227 )
						if( d_tci <= 66.7408 )
							ret := 0.271111
						if( d_tci > 66.7408 )
							ret := 0.935484 // buy
				if( ci_wt2 > -24.8167 )
					if( ap <= 0.872975 )
						if( ci_wt2 <= 138.036 )
							ret := -0.017192
						if( ci_wt2 > 138.036 )
							ret := -0.288809
					if( ap > 0.872975 )
						if( d <= 0.063846 )
							ret := -0.099606
						if( d > 0.063846 )
							ret := 0.120181
		if( ci > 153.278 )
			if( ci_wt2 <= 205.88 )
				if( ap <= 1.50357 )
					if( wt2 <= 15.0765 )
						if( d_tci <= -9.12114 )
							ret := -0.023529
						if( d_tci > -9.12114 )
							ret := 0.569620
					if( wt2 > 15.0765 )
						if( ci_wt2 <= 104.726 )
							ret := -0.200000
						if( ci_wt2 > 104.726 )
							ret := 0.612069
				if( ap > 1.50357 )
					if( tci <= 56.5297 )
						if( ci <= 171.743 )
							ret := -0.654545
						if( ci > 171.743 )
							ret := 0.529412
					if( tci > 56.5297 )
						ret := 0.928571 // buy
			if( ci_wt2 > 205.88 )
				if( d <= 0.009429 )
					if( d_tci <= -24.9107 )
						ret := -1.000000 // sell
					if( d_tci > -24.9107 )
						ret := -0.571429
				if( d > 0.009429 )
					ret := 0.545455
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
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
float op_operation = decision_tree_0_MATICUSDT_1Hour_db2f428c(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)

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


