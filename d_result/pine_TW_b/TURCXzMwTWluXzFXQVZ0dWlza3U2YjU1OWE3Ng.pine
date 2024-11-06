//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: MDB_30Min_1WAV_6b559a76 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MDB_30Min_1WAV_6b559a76", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MDB_30Min_6b559a76(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( ap <= 287.633 )
		if( ci_wt2 <= 37.8761 )
			if( ci <= -44.8472 )
				if( ap <= 213.615 )
					if( d <= 3.45467 )
						if( ci <= -226.413 )
							ret := -0.630435
						if( ci > -226.413 )
							ret := 0.159701
					if( d > 3.45467 )
						if( d_tci <= 44.3781 )
							ret := 0.179104
						if( d_tci > 44.3781 )
							ret := 0.633803
				if( ap > 213.615 )
					if( tci <= -65.8384 )
						if( ci_wt2 <= -43.0252 )
							ret := -0.923077 // sell
						if( ci_wt2 > -43.0252 )
							ret := -0.256831
					if( tci > -65.8384 )
						if( d <= 2.9541 )
							ret := -0.031667
						if( d > 2.9541 )
							ret := 0.209125
			if( ci > -44.8472 )
				if( ap <= 266.985 )
					if( esa <= 247.379 )
						if( ap <= 241.466 )
							ret := 0.019475
						if( ap > 241.466 )
							ret := 0.408257
					if( esa > 247.379 )
						if( ci_wt2 <= -26.6818 )
							ret := 0.175926
						if( ci_wt2 > -26.6818 )
							ret := -0.298046
				if( ap > 266.985 )
					if( ci_wt2 <= 25.6852 )
						if( ci <= -15.8529 )
							ret := 0.473684
						if( ci > -15.8529 )
							ret := 0.155642
					if( ci_wt2 > 25.6852 )
						if( wt2 <= -12.6007 )
							ret := -0.777778 // sell
						if( wt2 > -12.6007 )
							ret := 0.172414
		if( ci_wt2 > 37.8761 )
			if( d <= 0.922029 )
				if( d <= 0.144111 )
					if( ci <= 80.7968 )
						if( tci <= 6.3334 )
							ret := -0.365854
						if( tci > 6.3334 )
							ret := 0.428571
					if( ci > 80.7968 )
						if( esa <= 29.813 )
							ret := -0.448980
						if( esa > 29.813 )
							ret := -0.833333 // sell
				if( d > 0.144111 )
					if( ci <= 150.547 )
						if( ci_wt2 <= 168.641 )
							ret := 0.082357
						if( ci_wt2 > 168.641 )
							ret := 0.850000 // buy
					if( ci > 150.547 )
						if( ci_wt2 <= 131.625 )
							ret := 0.148148
						if( ci_wt2 > 131.625 )
							ret := -0.420000
			if( d > 0.922029 )
				if( d_tci <= -16.6922 )
					if( esa <= 243.72 )
						if( esa <= 229.06 )
							ret := -0.012475
						if( esa > 229.06 )
							ret := -0.341317
					if( esa > 243.72 )
						if( ci_wt2 <= 48.1431 )
							ret := -0.142857
						if( ci_wt2 > 48.1431 )
							ret := 0.367347
				if( d_tci > -16.6922 )
					if( esa <= 173.145 )
						if( wt2 <= -44.239 )
							ret := -0.626298
						if( wt2 > -44.239 )
							ret := -0.224036
					if( esa > 173.145 )
						if( ci_wt2 <= 173.131 )
							ret := -0.124335
						if( ci_wt2 > 173.131 )
							ret := -0.808511 // sell
	if( ap > 287.633 )
		if( d_tci <= 36.1065 )
			if( d <= 6.91528 )
				if( d <= 1.57536 )
					if( ap <= 317.636 )
						if( ap <= 290.884 )
							ret := 0.175926
						if( ap > 290.884 )
							ret := -0.401961
					if( ap > 317.636 )
						if( esa <= 350.153 )
							ret := 0.372414
						if( esa > 350.153 )
							ret := 0.080153
				if( d > 1.57536 )
					if( ci_wt2 <= 25.5819 )
						if( tci <= 55.6977 )
							ret := -0.040546
						if( tci > 55.6977 )
							ret := 0.117647
					if( ci_wt2 > 25.5819 )
						if( esa <= 347.321 )
							ret := 0.037227
						if( esa > 347.321 )
							ret := -0.153517
			if( d > 6.91528 )
				if( wt2 <= 36.2697 )
					if( wt2 <= -15.2414 )
						if( wt2 <= -22.6314 )
							ret := 1.000000 // buy
						if( wt2 > -22.6314 )
							ret := 0.733333 // buy
					if( wt2 > -15.2414 )
						if( esa <= 287.872 )
							ret := 0.947368 // buy
						if( esa > 287.872 )
							ret := 0.349650
				if( wt2 > 36.2697 )
					if( d_tci <= -32.727 )
						if( ci_wt2 <= 9.19467 )
							ret := 0.393548
						if( ci_wt2 > 9.19467 )
							ret := -0.075630
					if( d_tci > -32.727 )
						if( ap <= 520.145 )
							ret := -0.625000
						if( ap > 520.145 )
							ret := -1.000000 // sell
		if( d_tci > 36.1065 )
			if( esa <= 325.226 )
				if( esa <= 310.956 )
					if( tci <= -36.6643 )
						if( ap <= 290.147 )
							ret := -0.869565 // sell
						if( ap > 290.147 )
							ret := -0.471264
					if( tci > -36.6643 )
						if( esa <= 298.775 )
							ret := 0.800000 // buy
						if( esa > 298.775 )
							ret := -0.461538
				if( esa > 310.956 )
					if( ap <= 309.655 )
						if( ci_wt2 <= -71.932 )
							ret := -0.978723 // sell
						if( ci_wt2 > -71.932 )
							ret := 0.090909
					if( ap > 309.655 )
						if( ci_wt2 <= -9.61856 )
							ret := -0.714286 // sell
						if( ci_wt2 > -9.61856 )
							ret := -1.000000 // sell
			if( esa > 325.226 )
				if( ap <= 470.914 )
					if( ci <= -101.759 )
						if( d_tci <= 64.5293 )
							ret := 0.072539
						if( d_tci > 64.5293 )
							ret := 0.714286 // buy
					if( ci > -101.759 )
						if( esa <= 361.309 )
							ret := 0.034884
						if( esa > 361.309 )
							ret := -0.202819
				if( ap > 470.914 )
					if( esa <= 548.756 )
						if( d_tci <= 39.626 )
							ret := 0.076923
						if( d_tci > 39.626 )
							ret := -0.650919
					if( esa > 548.756 )
						if( ap <= 549.273 )
							ret := 1.000000 // buy
						if( ap > 549.273 )
							ret := 0.047619
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_MDB_30Min_6b559a76(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)

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


