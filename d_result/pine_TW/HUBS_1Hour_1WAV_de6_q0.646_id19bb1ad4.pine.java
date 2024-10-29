//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: HUBS_1Hour_1WAV_19bb1ad4 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_HUBS_1Hour_1WAV_19bb1ad4", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_HUBS_1Hour_19bb1ad4(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.65, min_samples_leaf=4,min_samples_split=5, random_state=843828734)
	if( ap <= 285.714 )
		if( ap <= 222.494 )
			if( esa <= 128.01 )
				if( d <= 2.63678 )
					if( d_tci <= 31.1199 )
						if( ci <= 106.75 )
							ret := 0.500000
						if( ci > 106.75 )
							ret := -0.350000
					if( d_tci > 31.1199 )
						if( d <= 2.45802 )
							ret := 0.972222 // buy
						if( d > 2.45802 )
							ret := 0.428571
				if( d > 2.63678 )
					if( tci <= -22.0462 )
						if( tci <= -40.7835 )
							ret := 0.295652
						if( tci > -40.7835 )
							ret := -0.696629
					if( tci > -22.0462 )
						if( wt2 <= 32.6642 )
							ret := 0.773196 // buy
						if( wt2 > 32.6642 )
							ret := -0.080000
			if( esa > 128.01 )
				if( tci <= -13.795 )
					if( tci <= -48.7927 )
						if( d <= 6.03691 )
							ret := -0.292225
						if( d > 6.03691 )
							ret := 0.619048
					if( tci > -48.7927 )
						if( ap <= 143.031 )
							ret := 0.470790
						if( ap > 143.031 )
							ret := 0.204629
				if( tci > -13.795 )
					if( ci_wt2 <= -20.2393 )
						if( d_tci <= 0.070907 )
							ret := -0.171982
						if( d_tci > 0.070907 )
							ret := -0.471631
					if( ci_wt2 > -20.2393 )
						if( ap <= 133.65 )
							ret := -0.490000
						if( ap > 133.65 )
							ret := 0.066927
		if( ap > 222.494 )
			if( d <= 3.53914 )
				if( wt2 <= -0.341546 )
					if( ci <= 157.483 )
						if( ci_wt2 <= -117.24 )
							ret := -0.500000
						if( ci_wt2 > -117.24 )
							ret := 0.638968
					if( ci > 157.483 )
						ret := -0.333333
				if( wt2 > -0.341546 )
					if( ci_wt2 <= -123.831 )
						if( wt2 <= 2.13206 )
							ret := -1.000000 // sell
						if( wt2 > 2.13206 )
							ret := 0.000000
					if( ci_wt2 > -123.831 )
						if( ap <= 271.325 )
							ret := 0.083682
						if( ap > 271.325 )
							ret := 0.518018
			if( d > 3.53914 )
				if( ap <= 266.397 )
					if( d_tci <= 22.9358 )
						if( ap <= 258.995 )
							ret := 0.523810
						if( ap > 258.995 )
							ret := -0.266667
					if( d_tci > 22.9358 )
						if( wt2 <= -58.5144 )
							ret := 0.000000
						if( wt2 > -58.5144 )
							ret := 0.862745 // buy
				if( ap > 266.397 )
					if( tci <= 21.0764 )
						if( d_tci <= 62.7566 )
							ret := -0.379213
						if( d_tci > 62.7566 )
							ret := 0.500000
					if( tci > 21.0764 )
						if( d_tci <= -32.5466 )
							ret := -0.240000
						if( d_tci > -32.5466 )
							ret := 0.750000 // buy
	if( ap > 285.714 )
		if( tci <= -42.5629 )
			if( ap <= 622.677 )
				if( ap <= 452.82 )
					if( d <= 7.06588 )
						if( tci <= -61.3283 )
							ret := -0.560976
						if( tci > -61.3283 )
							ret := 0.082687
					if( d > 7.06588 )
						if( ap <= 340.742 )
							ret := 0.120000
						if( ap > 340.742 )
							ret := 0.621818
				if( ap > 452.82 )
					if( wt2 <= -51.1017 )
						if( ap <= 471.081 )
							ret := -0.767677 // sell
						if( ap > 471.081 )
							ret := -0.197917
					if( wt2 > -51.1017 )
						if( esa <= 467.495 )
							ret := -1.000000 // sell
						if( esa > 467.495 )
							ret := 0.323770
			if( ap > 622.677 )
				if( ap <= 770.103 )
					if( tci <= -48.3325 )
						if( ci <= -76.5731 )
							ret := 0.581395
						if( ci > -76.5731 )
							ret := 0.935185 // buy
					if( tci > -48.3325 )
						if( esa <= 715.828 )
							ret := 0.766667 // buy
						if( esa > 715.828 )
							ret := 0.000000
				if( ap > 770.103 )
					if( ci_wt2 <= -20.8378 )
						if( d <= 9.35433 )
							ret := -0.333333
						if( d > 9.35433 )
							ret := 0.000000
					if( ci_wt2 > -20.8378 )
						if( esa <= 781.206 )
							ret := 0.000000
						if( esa > 781.206 )
							ret := -0.956522 // sell
		if( tci > -42.5629 )
			if( ci <= 191.114 )
				if( d_tci <= -59.7529 )
					if( ci_wt2 <= 16.7341 )
						if( d_tci <= -60.1435 )
							ret := -0.350877
						if( d_tci > -60.1435 )
							ret := 0.461538
					if( ci_wt2 > 16.7341 )
						if( esa <= 309.077 )
							ret := -1.000000 // sell
						if( esa > 309.077 )
							ret := -0.408451
				if( d_tci > -59.7529 )
					if( esa <= 834.993 )
						if( d <= 6.47163 )
							ret := -0.029857
						if( d > 6.47163 )
							ret := -0.160216
					if( esa > 834.993 )
						if( esa <= 840.079 )
							ret := -0.885246 // sell
						if( esa > 840.079 )
							ret := -0.307692
			if( ci > 191.114 )
				if( wt2 <= 0.833373 )
					ret := 0.428571
				if( wt2 > 0.833373 )
					if( esa <= 446.279 )
						ret := 1.000000 // buy
					if( esa > 446.279 )
						ret := 0.428571
	
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
float op_operation = decision_tree_0_HUBS_1Hour_19bb1ad4(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)

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


