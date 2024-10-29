//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: ZI_1Hour_1WAV_29631346 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ZI_1Hour_1WAV_29631346", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ZI_1Hour_29631346(wt2, ap, ci_wt2, esa, ci, tci, d_tci, d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( ci <= -50.7445 )
		if( ap <= 51.0559 )
			if( tci <= -72.3756 )
				if( ci <= -102.155 )
					if( ap <= 24.1817 )
						ret := -0.800000 // sell
					if( ap > 24.1817 )
						ret := 0.647059
				if( ci > -102.155 )
					if( ap <= 32.3094 )
						if( wt2 <= -73.9155 )
							ret := 0.333333
						if( wt2 > -73.9155 )
							ret := -0.571429
					if( ap > 32.3094 )
						if( esa <= 40.13 )
							ret := -0.825581 // sell
						if( esa > 40.13 )
							ret := 1.000000 // buy
			if( tci > -72.3756 )
				if( d <= 0.577684 )
					if( ci_wt2 <= -34.5022 )
						if( ci_wt2 <= -46.9979 )
							ret := 0.103298
						if( ci_wt2 > -46.9979 )
							ret := 0.438596
					if( ci_wt2 > -34.5022 )
						if( esa <= 39.264 )
							ret := -0.174941
						if( esa > 39.264 )
							ret := 0.333333
				if( d > 0.577684 )
					if( tci <= -68.5067 )
						if( ap <= 36.25 )
							ret := -0.333333
						if( ap > 36.25 )
							ret := 1.000000 // buy
					if( tci > -68.5067 )
						if( esa <= 23.7503 )
							ret := -0.586207
						if( esa > 23.7503 )
							ret := 0.326568
		if( ap > 51.0559 )
			if( ci_wt2 <= -77.3904 )
				if( ap <= 52.4448 )
					if( d_tci <= 39.9459 )
						if( ci <= -53.9374 )
							ret := -0.769231 // sell
						if( ci > -53.9374 )
							ret := 0.333333
					if( d_tci > 39.9459 )
						ret := 1.000000 // buy
				if( ap > 52.4448 )
					if( wt2 <= -14.8211 )
						if( ci <= -103.785 )
							ret := 0.312500
						if( ci > -103.785 )
							ret := 0.941176 // buy
					if( wt2 > -14.8211 )
						if( wt2 <= 18.6375 )
							ret := -0.138686
						if( wt2 > 18.6375 )
							ret := 0.236842
			if( ci_wt2 > -77.3904 )
				if( ci_wt2 <= -54.9862 )
					if( ci <= -103.038 )
						if( ap <= 53.1954 )
							ret := 0.800000 // buy
						if( ap > 53.1954 )
							ret := -0.200000
					if( ci > -103.038 )
						if( ci_wt2 <= -69.6904 )
							ret := -0.890110 // sell
						if( ci_wt2 > -69.6904 )
							ret := -0.450000
				if( ci_wt2 > -54.9862 )
					if( wt2 <= -25.6615 )
						if( wt2 <= -66.2662 )
							ret := 0.842105 // buy
						if( wt2 > -66.2662 )
							ret := -0.208738
					if( wt2 > -25.6615 )
						if( tci <= -18.9117 )
							ret := 0.800000 // buy
						if( tci > -18.9117 )
							ret := 0.000000
	if( ci > -50.7445 )
		if( esa <= 47.7262 )
			if( wt2 <= 55.567 )
				if( d <= 1.25289 )
					if( ci <= 193.945 )
						if( ap <= 22.3477 )
							ret := -0.061931
						if( ap > 22.3477 )
							ret := 0.093286
					if( ci > 193.945 )
						if( wt2 <= 3.10865 )
							ret := -0.852459 // sell
						if( wt2 > 3.10865 )
							ret := -0.263158
				if( d > 1.25289 )
					if( ci_wt2 <= 103.914 )
						if( tci <= 47.582 )
							ret := -0.733333 // sell
						if( tci > 47.582 )
							ret := 0.400000
					if( ci_wt2 > 103.914 )
						if( ci <= 110.766 )
							ret := 1.000000 // buy
						if( ci > 110.766 )
							ret := -0.250000
			if( wt2 > 55.567 )
				if( ci <= 28.7791 )
					if( d <= 0.566875 )
						if( esa <= 14.0538 )
							ret := 0.538462
						if( esa > 14.0538 )
							ret := -0.209302
					if( d > 0.566875 )
						if( ap <= 40.4026 )
							ret := 0.000000
						if( ap > 40.4026 )
							ret := 0.538462
				if( ci > 28.7791 )
					if( d_tci <= -57.5587 )
						if( d_tci <= -68.2832 )
							ret := -0.740000 // sell
						if( d_tci > -68.2832 )
							ret := -0.180371
					if( d_tci > -57.5587 )
						if( ci_wt2 <= -20.8233 )
							ret := -0.058824
						if( ci_wt2 > -20.8233 )
							ret := -0.787234 // sell
		if( esa > 47.7262 )
			if( wt2 <= 17.4661 )
				if( wt2 <= -7.04741 )
					if( tci <= -21.5567 )
						if( tci <= -32.0227 )
							ret := -0.066059
						if( tci > -32.0227 )
							ret := -0.456432
					if( tci > -21.5567 )
						if( tci <= -3.73388 )
							ret := 0.157080
						if( tci > -3.73388 )
							ret := -0.505376
				if( wt2 > -7.04741 )
					if( ci_wt2 <= -55.4104 )
						if( d_tci <= -3.54279 )
							ret := 0.923077 // buy
						if( d_tci > -3.54279 )
							ret := -0.666667
					if( ci_wt2 > -55.4104 )
						if( ap <= 49.0149 )
							ret := -0.120482
						if( ap > 49.0149 )
							ret := -0.590538
			if( wt2 > 17.4661 )
				if( ci <= 74.4308 )
					if( ci <= -28.8531 )
						if( d_tci <= -12.0531 )
							ret := -0.483146
						if( d_tci > -12.0531 )
							ret := 1.000000 // buy
					if( ci > -28.8531 )
						if( ci <= -17.4208 )
							ret := 0.642857
						if( ci > -17.4208 )
							ret := 0.023969
				if( ci > 74.4308 )
					if( d <= 0.958913 )
						if( ci_wt2 <= 61.5294 )
							ret := -0.308081
						if( ci_wt2 > 61.5294 )
							ret := 0.116505
					if( d > 0.958913 )
						if( wt2 <= 63.1506 )
							ret := -0.489130
						if( wt2 > 63.1506 )
							ret := -0.969697 // sell
	
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
float op_operation = decision_tree_0_ZI_1Hour_29631346(wt2, ap, ci_wt2, esa, ci, tci, d_tci, d)

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


