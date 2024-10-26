//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: DDOG_1Hour_1WAV_a2bb40cf Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DDOG_1Hour_1WAV_a2bb40cf", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DDOG_1Hour_a2bb40cf(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( ap <= 98.3328 )
		if( ap <= 34.4769 )
			if( d <= 0.436935 )
				if( ci <= -47.2707 )
					if( d <= 0.374921 )
						if( tci <= -2.44921 )
							ret := 0.555556
						if( tci > -2.44921 )
							ret := 1.000000 // buy
					if( d > 0.374921 )
						ret := -0.133333
				if( ci > -47.2707 )
					if( ap <= 33.4915 )
						if( d_tci <= 44.4425 )
							ret := 1.000000 // buy
						if( d_tci > 44.4425 )
							ret := 0.833333 // buy
					if( ap > 33.4915 )
						if( ci <= 15.4022 )
							ret := 0.888889 // buy
						if( ci > 15.4022 )
							ret := 0.409091
			if( d > 0.436935 )
				if( ci_wt2 <= -9.56271 )
					if( d <= 0.699272 )
						if( tci <= -2.95086 )
							ret := -0.648148
						if( tci > -2.95086 )
							ret := 0.333333
					if( d > 0.699272 )
						if( tci <= -42.6214 )
							ret := 0.809524 // buy
						if( tci > -42.6214 )
							ret := 0.086957
				if( ci_wt2 > -9.56271 )
					if( ci_wt2 <= 35.4208 )
						if( d <= 0.564917 )
							ret := 0.967213 // buy
						if( d > 0.564917 )
							ret := 0.616162
					if( ci_wt2 > 35.4208 )
						if( tci <= 31.9819 )
							ret := -0.123457
						if( tci > 31.9819 )
							ret := 0.952381 // buy
		if( ap > 34.4769 )
			if( ci_wt2 <= -112.351 )
				if( ap <= 44.59 )
					if( wt2 <= 29.0994 )
						if( ci_wt2 <= -126.474 )
							ret := 0.936508 // buy
						if( ci_wt2 > -126.474 )
							ret := 0.529412
					if( wt2 > 29.0994 )
						if( ci_wt2 <= -154.971 )
							ret := 0.875000 // buy
						if( ci_wt2 > -154.971 )
							ret := 0.000000
				if( ap > 44.59 )
					if( ci <= -141.502 )
						if( ci_wt2 <= -199.904 )
							ret := 0.702703 // buy
						if( ci_wt2 > -199.904 )
							ret := -0.309353
					if( ci > -141.502 )
						if( ci <= -116.834 )
							ret := 0.644068
						if( ci > -116.834 )
							ret := 0.255605
			if( ci_wt2 > -112.351 )
				if( esa <= 35.9656 )
					if( ci_wt2 <= 57.4688 )
						if( d <= 0.773253 )
							ret := 0.004098
						if( d > 0.773253 )
							ret := -0.769231 // sell
					if( ci_wt2 > 57.4688 )
						if( ci_wt2 <= 109.039 )
							ret := -0.828571 // sell
						if( ci_wt2 > 109.039 )
							ret := -0.142857
				if( esa > 35.9656 )
					if( wt2 <= 62.5745 )
						if( esa <= 97.6949 )
							ret := 0.044536
						if( esa > 97.6949 )
							ret := 0.370787
					if( wt2 > 62.5745 )
						if( wt2 <= 74.9736 )
							ret := -0.397297
						if( wt2 > 74.9736 )
							ret := 0.606557
	if( ap > 98.3328 )
		if( tci <= -22.1615 )
			if( esa <= 115.949 )
				if( ci_wt2 <= -57.185 )
					if( wt2 <= -48.7081 )
						if( tci <= -67.4616 )
							ret := 0.000000
						if( tci > -67.4616 )
							ret := -0.809524 // sell
					if( wt2 > -48.7081 )
						if( ap <= 99.6487 )
							ret := -0.727273 // sell
						if( ap > 99.6487 )
							ret := 0.329730
				if( ci_wt2 > -57.185 )
					if( ci_wt2 <= -46.8528 )
						if( d <= 1.03338 )
							ret := -0.217391
						if( d > 1.03338 )
							ret := -0.916667 // sell
					if( ci_wt2 > -46.8528 )
						if( ci_wt2 <= 33.8987 )
							ret := -0.255354
						if( ci_wt2 > 33.8987 )
							ret := 0.046809
			if( esa > 115.949 )
				if( esa <= 133.023 )
					if( wt2 <= -59.7721 )
						if( d_tci <= 65.3975 )
							ret := -0.230769
						if( d_tci > 65.3975 )
							ret := -0.842105 // sell
					if( wt2 > -59.7721 )
						if( tci <= -47.2701 )
							ret := 0.560403
						if( tci > -47.2701 )
							ret := 0.237805
				if( esa > 133.023 )
					if( d_tci <= 69.549 )
						if( d_tci <= 44.1047 )
							ret := 0.146628
						if( d_tci > 44.1047 )
							ret := -0.455471
					if( d_tci > 69.549 )
						if( ap <= 136.253 )
							ret := 0.181818
						if( ap > 136.253 )
							ret := 0.913043 // buy
		if( tci > -22.1615 )
			if( tci <= 18.9498 )
				if( ci_wt2 <= 114.704 )
					if( wt2 <= 22.2038 )
						if( d_tci <= 0.37152 )
							ret := -0.318914
						if( d_tci > 0.37152 )
							ret := -0.126079
					if( wt2 > 22.2038 )
						if( ap <= 155.876 )
							ret := 0.235294
						if( ap > 155.876 )
							ret := -0.800000 // sell
				if( ci_wt2 > 114.704 )
					if( d_tci <= -9.54779 )
						if( d_tci <= -10.5418 )
							ret := 0.103448
						if( d_tci > -10.5418 )
							ret := 0.583333
					if( d_tci > -9.54779 )
						if( ci <= 173.727 )
							ret := -0.652174
						if( ci > 173.727 )
							ret := 0.100000
			if( tci > 18.9498 )
				if( esa <= 131.087 )
					if( wt2 <= 63.4226 )
						if( ap <= 98.6042 )
							ret := -0.642857
						if( ap > 98.6042 )
							ret := 0.043514
					if( wt2 > 63.4226 )
						if( esa <= 115.865 )
							ret := -0.368750
						if( esa > 115.865 )
							ret := 0.073529
				if( esa > 131.087 )
					if( wt2 <= 30.9337 )
						if( esa <= 149.706 )
							ret := -0.230000
						if( esa > 149.706 )
							ret := 0.533333
					if( wt2 > 30.9337 )
						if( d <= 2.0616 )
							ret := -0.375000
						if( d > 2.0616 )
							ret := 0.020906
	
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
float op_operation = decision_tree_0_DDOG_1Hour_a2bb40cf(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)

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


