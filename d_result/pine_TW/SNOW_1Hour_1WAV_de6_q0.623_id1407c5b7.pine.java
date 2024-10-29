//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: SNOW_1Hour_1WAV_1407c5b7 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNOW_1Hour_1WAV_1407c5b7", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNOW_1Hour_1407c5b7(esa, d_tci, tci, ci_wt2, wt2, d, ci, ap)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( tci <= 25.5057 )
		if( esa <= 266.266 )
			if( d_tci <= 67.2379 )
				if( esa <= 127.883 )
					if( d_tci <= -12.0539 )
						if( d <= 0.570694 )
							ret := -0.365591
						if( d > 0.570694 )
							ret := 0.209877
					if( d_tci > -12.0539 )
						if( wt2 <= -10.1038 )
							ret := 0.190563
						if( wt2 > -10.1038 )
							ret := 0.494208
				if( esa > 127.883 )
					if( ci_wt2 <= -5.37866 )
						if( ci_wt2 <= -22.6683 )
							ret := -0.003842
						if( ci_wt2 > -22.6683 )
							ret := 0.179431
					if( ci_wt2 > -5.37866 )
						if( esa <= 189.224 )
							ret := -0.138149
						if( esa > 189.224 )
							ret := 0.022585
			if( d_tci > 67.2379 )
				if( wt2 <= -156.504 )
					ret := -1.000000 // sell
				if( wt2 > -156.504 )
					if( ap <= 193.334 )
						if( tci <= -71.2319 )
							ret := -0.144578
						if( tci > -71.2319 )
							ret := 0.331818
					if( ap > 193.334 )
						if( esa <= 255.892 )
							ret := 0.836066 // buy
						if( esa > 255.892 )
							ret := 0.181818
		if( esa > 266.266 )
			if( ci <= -4.35074 )
				if( d <= 5.35532 )
					if( d_tci <= -12.2748 )
						if( d_tci <= -22.2675 )
							ret := -0.769231 // sell
						if( d_tci > -22.2675 )
							ret := 0.268293
					if( d_tci > -12.2748 )
						if( tci <= -7.3178 )
							ret := -0.115052
						if( tci > -7.3178 )
							ret := -0.384127
				if( d > 5.35532 )
					if( ap <= 346.153 )
						if( ci_wt2 <= -58.9108 )
							ret := -0.254237
						if( ci_wt2 > -58.9108 )
							ret := 0.509091
					if( ap > 346.153 )
						if( d_tci <= 62.3375 )
							ret := 0.275862
						if( d_tci > 62.3375 )
							ret := -0.825000 // sell
			if( ci > -4.35074 )
				if( d <= 1.05583 )
					if( ap <= 298.077 )
						if( ap <= 268.516 )
							ret := -1.000000 // sell
						if( ap > 268.516 )
							ret := 0.790323 // buy
					if( ap > 298.077 )
						if( wt2 <= 19.5294 )
							ret := 0.277778
						if( wt2 > 19.5294 )
							ret := -0.800000 // sell
				if( d > 1.05583 )
					if( tci <= 14.1927 )
						if( d <= 2.14791 )
							ret := -0.262590
						if( d > 2.14791 )
							ret := -0.607059
					if( tci > 14.1927 )
						if( d <= 4.56916 )
							ret := -0.208511
						if( d > 4.56916 )
							ret := 0.785714 // buy
	if( tci > 25.5057 )
		if( d_tci <= -61.5255 )
			if( esa <= 191.751 )
				if( d <= 4.78079 )
					if( ci_wt2 <= -8.86453 )
						if( d <= 2.76773 )
							ret := -0.348214
						if( d > 2.76773 )
							ret := 0.283019
					if( ci_wt2 > -8.86453 )
						if( d <= 2.48293 )
							ret := 0.300613
						if( d > 2.48293 )
							ret := -0.219178
				if( d > 4.78079 )
					if( esa <= 172.199 )
						ret := 0.000000
					if( esa > 172.199 )
						if( d <= 9.22281 )
							ret := 1.000000 // buy
						if( d > 9.22281 )
							ret := 0.400000
			if( esa > 191.751 )
				if( tci <= 71.8042 )
					if( ap <= 315.104 )
						if( d <= 3.04046 )
							ret := 0.325000
						if( d > 3.04046 )
							ret := 0.840237 // buy
					if( ap > 315.104 )
						if( d_tci <= -65.2769 )
							ret := -1.000000 // sell
						if( d_tci > -65.2769 )
							ret := -0.095238
				if( tci > 71.8042 )
					if( d_tci <= -67.601 )
						if( d_tci <= -70.1223 )
							ret := -0.222222
						if( d_tci > -70.1223 )
							ret := 0.482759
					if( d_tci > -67.601 )
						if( tci <= 74.1453 )
							ret := -0.739130 // sell
						if( tci > 74.1453 )
							ret := 0.111111
		if( d_tci > -61.5255 )
			if( tci <= 57.701 )
				if( esa <= 145.809 )
					if( ap <= 133.179 )
						if( ci <= -23.7535 )
							ret := -0.875000 // sell
						if( ci > -23.7535 )
							ret := 0.037433
					if( ap > 133.179 )
						if( ci <= 95.5185 )
							ret := 0.196868
						if( ci > 95.5185 )
							ret := 0.659864
				if( esa > 145.809 )
					if( d <= 5.21101 )
						if( esa <= 242.837 )
							ret := -0.016949
						if( esa > 242.837 )
							ret := 0.135825
					if( d > 5.21101 )
						if( ap <= 367.883 )
							ret := 0.589041
						if( ap > 367.883 )
							ret := -0.800000 // sell
			if( tci > 57.701 )
				if( d <= 7.43114 )
					if( wt2 <= 52.7785 )
						if( ap <= 308.038 )
							ret := 0.337500
						if( ap > 308.038 )
							ret := -0.800000 // sell
					if( wt2 > 52.7785 )
						if( ci <= 37.7071 )
							ret := -0.459184
						if( ci > 37.7071 )
							ret := -0.136752
				if( d > 7.43114 )
					ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_SNOW_1Hour_1407c5b7(esa, d_tci, tci, ci_wt2, wt2, d, ci, ap)

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


