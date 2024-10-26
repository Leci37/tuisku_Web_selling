//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: MELI_1Hour_1WAV_7a64374e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MELI_1Hour_1WAV_7a64374e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MELI_1Hour_7a64374e(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( ap <= 484.944 )
		if( ap <= 380.088 )
			if( wt2 <= 67.7972 )
				if( d <= 2.50757 )
					if( d_tci <= -39.8908 )
						if( ap <= 344.532 )
							ret := -0.846154 // sell
						if( ap > 344.532 )
							ret := 0.161290
					if( d_tci > -39.8908 )
						if( wt2 <= 24.3209 )
							ret := 0.272000
						if( wt2 > 24.3209 )
							ret := 0.815534 // buy
				if( d > 2.50757 )
					if( esa <= 295.264 )
						if( tci <= 16.9991 )
							ret := 0.862745 // buy
						if( tci > 16.9991 )
							ret := 0.083333
					if( esa > 295.264 )
						if( d <= 5.75252 )
							ret := -0.142165
						if( d > 5.75252 )
							ret := 0.312500
			if( wt2 > 67.7972 )
				if( ap <= 302.629 )
					ret := 1.000000 // buy
				if( ap > 302.629 )
					if( ci_wt2 <= -10.7159 )
						if( d_tci <= -58.2118 )
							ret := -1.000000 // sell
						if( d_tci > -58.2118 )
							ret := 0.000000
					if( ci_wt2 > -10.7159 )
						ret := 0.000000
		if( ap > 380.088 )
			if( ap <= 456.664 )
				if( d_tci <= 52.7168 )
					if( ap <= 451.567 )
						ret := 1.000000 // buy
					if( ap > 451.567 )
						if( ap <= 452.215 )
							ret := 0.000000
						if( ap > 452.215 )
							ret := 0.947368 // buy
				if( d_tci > 52.7168 )
					if( ci_wt2 <= -27.6256 )
						ret := 0.769231 // buy
					if( ci_wt2 > -27.6256 )
						ret := -0.400000
			if( ap > 456.664 )
				if( ci <= -44.1501 )
					if( ci <= -108.062 )
						if( wt2 <= -16.7072 )
							ret := 0.840000 // buy
						if( wt2 > -16.7072 )
							ret := -0.666667
					if( ci > -108.062 )
						if( d <= 13.0851 )
							ret := 0.864407 // buy
						if( d > 13.0851 )
							ret := 0.521739
				if( ci > -44.1501 )
					if( d_tci <= 19.4573 )
						if( esa <= 456.034 )
							ret := 0.937500 // buy
						if( esa > 456.034 )
							ret := 0.250000
					if( d_tci > 19.4573 )
						if( tci <= -23.4688 )
							ret := 0.631579
						if( tci > -23.4688 )
							ret := -0.903226 // sell
	if( ap > 484.944 )
		if( d_tci <= 52.9968 )
			if( d <= 31.0729 )
				if( esa <= 885.055 )
					if( ap <= 744.173 )
						if( esa <= 495.699 )
							ret := -0.318898
						if( esa > 495.699 )
							ret := 0.009057
					if( ap > 744.173 )
						if( d_tci <= -24.9694 )
							ret := 0.401408
						if( d_tci > -24.9694 )
							ret := 0.101942
				if( esa > 885.055 )
					if( esa <= 954.545 )
						if( wt2 <= 53.2209 )
							ret := -0.378862
						if( wt2 > 53.2209 )
							ret := 0.267327
					if( esa > 954.545 )
						if( d <= 8.16452 )
							ret := 0.067475
						if( d > 8.16452 )
							ret := -0.058887
			if( d > 31.0729 )
				if( d <= 49.9921 )
					if( esa <= 1748.63 )
						if( ci <= 62.3722 )
							ret := 0.435185
						if( ci > 62.3722 )
							ret := 0.691729
					if( esa > 1748.63 )
						if( ci_wt2 <= 37.2981 )
							ret := -0.142857
						if( ci_wt2 > 37.2981 )
							ret := -0.588235
				if( d > 49.9921 )
					if( esa <= 1718.65 )
						ret := -0.818182 // sell
					if( esa > 1718.65 )
						ret := 0.000000
		if( d_tci > 52.9968 )
			if( ap <= 560.926 )
				if( esa <= 542.879 )
					if( ap <= 533.533 )
						if( ci <= -94.4038 )
							ret := 1.000000 // buy
						if( ci > -94.4038 )
							ret := 0.066667
					if( ap > 533.533 )
						ret := -1.000000 // sell
				if( esa > 542.879 )
					if( d_tci <= 61.6912 )
						ret := 0.125000
					if( d_tci > 61.6912 )
						if( esa <= 581.98 )
							ret := 0.972973 // buy
						if( esa > 581.98 )
							ret := 0.000000
			if( ap > 560.926 )
				if( ap <= 1634.48 )
					if( d_tci <= 86.9187 )
						if( tci <= -59.6231 )
							ret := 0.198511
						if( tci > -59.6231 )
							ret := -0.145299
					if( d_tci > 86.9187 )
						if( ap <= 692.152 )
							ret := 0.750000 // buy
						if( ap > 692.152 )
							ret := -0.318735
				if( ap > 1634.48 )
					if( tci <= -55.2857 )
						if( ci <= -36.9246 )
							ret := -0.049180
						if( ci > -36.9246 )
							ret := 0.727273 // buy
					if( tci > -55.2857 )
						if( ap <= 1884.54 )
							ret := -0.648780
						if( ap > 1884.54 )
							ret := 0.000000
	
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
float op_operation = decision_tree_0_MELI_1Hour_7a64374e(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)

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


