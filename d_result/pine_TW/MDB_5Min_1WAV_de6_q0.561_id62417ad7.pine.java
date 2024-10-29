//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: MDB_5Min_1WAV_62417ad7 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MDB_5Min_1WAV_62417ad7", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MDB_5Min_62417ad7(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( tci <= 13.377 )
		if( wt2 <= -40.9818 )
			if( d <= 2.29432 )
				if( ap <= 473.077 )
					if( tci <= -64.0595 )
						if( ap <= 378.921 )
							ret := 0.237736
						if( ap > 378.921 )
							ret := -0.227799
					if( tci > -64.0595 )
						if( ci_wt2 <= -89.1047 )
							ret := 0.390909
						if( ci_wt2 > -89.1047 )
							ret := -0.093340
				if( ap > 473.077 )
					if( ci <= -31.9067 )
						if( wt2 <= -49.7781 )
							ret := 0.133333
						if( wt2 > -49.7781 )
							ret := -0.736842 // sell
					if( ci > -31.9067 )
						if( esa <= 475.879 )
							ret := -0.750000 // sell
						if( esa > 475.879 )
							ret := -0.960000 // sell
			if( d > 2.29432 )
				if( wt2 <= -70.4246 )
					if( ap <= 401.968 )
						if( esa <= 366.427 )
							ret := -0.266667
						if( esa > 366.427 )
							ret := 0.645161
					if( ap > 401.968 )
						if( tci <= -80.1894 )
							ret := -0.934783 // sell
						if( tci > -80.1894 )
							ret := -0.272727
				if( wt2 > -70.4246 )
					if( ci_wt2 <= 12.3118 )
						if( wt2 <= -63.9666 )
							ret := 0.166667
						if( wt2 > -63.9666 )
							ret := 0.629526
					if( ci_wt2 > 12.3118 )
						if( ap <= 416.861 )
							ret := 0.050000
						if( ap > 416.861 )
							ret := 0.576271
		if( wt2 > -40.9818 )
			if( esa <= 380.384 )
				if( d <= 0.683825 )
					if( ci <= 37.5229 )
						if( ci <= 26.8217 )
							ret := 0.030708
						if( ci > 26.8217 )
							ret := -0.335793
					if( ci > 37.5229 )
						if( ap <= 288.476 )
							ret := 0.247514
						if( ap > 288.476 )
							ret := 0.032211
				if( d > 0.683825 )
					if( ci_wt2 <= 152.4 )
						if( ap <= 232.534 )
							ret := 0.385621
						if( ap > 232.534 )
							ret := 0.137103
					if( ci_wt2 > 152.4 )
						if( wt2 <= -29.7588 )
							ret := 0.329787
						if( wt2 > -29.7588 )
							ret := -0.421348
			if( esa > 380.384 )
				if( ci_wt2 <= 103.835 )
					if( ap <= 385.277 )
						if( ap <= 378.768 )
							ret := -0.868421 // sell
						if( ap > 378.768 )
							ret := -0.192037
					if( ap > 385.277 )
						if( d_tci <= 51.3218 )
							ret := 0.035572
						if( d_tci > 51.3218 )
							ret := 0.909091 // buy
				if( ci_wt2 > 103.835 )
					if( ci_wt2 <= 147.397 )
						if( tci <= 6.62786 )
							ret := -0.463950
						if( tci > 6.62786 )
							ret := 0.130435
					if( ci_wt2 > 147.397 )
						if( ci_wt2 <= 161.241 )
							ret := 0.608696
						if( ci_wt2 > 161.241 )
							ret := -0.224719
	if( tci > 13.377 )
		if( ap <= 418.437 )
			if( ci_wt2 <= 167.596 )
				if( ap <= 226.339 )
					if( ci <= 79.9905 )
						if( d <= 0.30948 )
							ret := -0.087719
						if( d > 0.30948 )
							ret := 0.473354
					if( ci > 79.9905 )
						if( ap <= 224.348 )
							ret := -0.618421
						if( ap > 224.348 )
							ret := 0.444444
				if( ap > 226.339 )
					if( tci <= 33.9273 )
						if( d <= 0.65239 )
							ret := -0.005102
						if( d > 0.65239 )
							ret := -0.134985
					if( tci > 33.9273 )
						if( ap <= 227.533 )
							ret := -0.662791
						if( ap > 227.533 )
							ret := 0.008083
			if( ci_wt2 > 167.596 )
				if( ap <= 388.197 )
					if( ci_wt2 <= 185.437 )
						if( esa <= 357.372 )
							ret := -0.974359 // sell
						if( esa > 357.372 )
							ret := -0.684211
					if( ci_wt2 > 185.437 )
						if( ap <= 370.355 )
							ret := -0.219512
						if( ap > 370.355 )
							ret := -1.000000 // sell
				if( ap > 388.197 )
					if( ci <= 247.222 )
						if( ci_wt2 <= 191.055 )
							ret := -0.137931
						if( ci_wt2 > 191.055 )
							ret := -0.888889 // sell
					if( ci > 247.222 )
						ret := 0.500000
		if( ap > 418.437 )
			if( d <= 1.44419 )
				if( esa <= 426.476 )
					if( ci <= 21.9998 )
						if( ci_wt2 <= -99.8706 )
							ret := -0.423077
						if( ci_wt2 > -99.8706 )
							ret := 0.358025
					if( ci > 21.9998 )
						if( ci <= 129.535 )
							ret := -0.362007
						if( ci > 129.535 )
							ret := -0.863636 // sell
				if( esa > 426.476 )
					if( wt2 <= 53.2211 )
						if( esa <= 503.243 )
							ret := 0.176535
						if( esa > 503.243 )
							ret := -0.666667
					if( wt2 > 53.2211 )
						if( ap <= 433.163 )
							ret := 0.160000
						if( ap > 433.163 )
							ret := -0.545455
			if( d > 1.44419 )
				if( esa <= 441.141 )
					if( esa <= 433.324 )
						if( esa <= 415.945 )
							ret := 0.131579
						if( esa > 415.945 )
							ret := -0.474576
					if( esa > 433.324 )
						if( ci_wt2 <= -5.54672 )
							ret := 0.724138 // buy
						if( ci_wt2 > -5.54672 )
							ret := -0.118812
				if( esa > 441.141 )
					if( wt2 <= 72.6374 )
						if( ci_wt2 <= -54.972 )
							ret := -0.216216
						if( ci_wt2 > -54.972 )
							ret := -0.645714
					if( wt2 > 72.6374 )
						ret := 0.571429
	
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
float op_operation = decision_tree_0_MDB_5Min_62417ad7(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)

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


