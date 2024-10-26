//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: UPST_1Hour_1WAV_751ac9f8 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UPST_1Hour_1WAV_751ac9f8", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UPST_1Hour_751ac9f8(ap, d_tci, ci, ci_wt2, tci, d, wt2, esa)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( wt2 <= -49.6463 )
		if( tci <= -62.7798 )
			if( d_tci <= 92.7986 )
				if( ap <= 124.376 )
					if( esa <= 84.7791 )
						if( esa <= 53.8334 )
							ret := 0.128090
						if( esa > 53.8334 )
							ret := -0.892857 // sell
					if( esa > 84.7791 )
						if( wt2 <= -69.1577 )
							ret := 0.967742 // buy
						if( wt2 > -69.1577 )
							ret := 0.402299
				if( ap > 124.376 )
					if( esa <= 145.843 )
						if( ci_wt2 <= 7.41897 )
							ret := -0.346154
						if( ci_wt2 > 7.41897 )
							ret := -1.000000 // sell
					if( esa > 145.843 )
						if( ap <= 160.275 )
							ret := 0.545455
						if( ap > 160.275 )
							ret := -0.095238
			if( d_tci > 92.7986 )
				ret := -1.000000 // sell
		if( tci > -62.7798 )
			if( ap <= 31.583 )
				if( d <= 1.56351 )
					if( wt2 <= -52.381 )
						if( esa <= 23.6915 )
							ret := 0.234694
						if( esa > 23.6915 )
							ret := -0.114907
					if( wt2 > -52.381 )
						if( ci_wt2 <= 7.91425 )
							ret := 0.044776
						if( ci_wt2 > 7.91425 )
							ret := -0.463636
				if( d > 1.56351 )
					if( ci_wt2 <= 1.01294 )
						ret := -1.000000 // sell
					if( ci_wt2 > 1.01294 )
						ret := -0.692308
			if( ap > 31.583 )
				if( ci <= -96.8584 )
					if( tci <= -59.3679 )
						if( ap <= 73.1436 )
							ret := -0.250000
						if( ap > 73.1436 )
							ret := 0.739130 // buy
					if( tci > -59.3679 )
						if( ci <= -117.262 )
							ret := -0.846154 // sell
						if( ci > -117.262 )
							ret := -0.100000
				if( ci > -96.8584 )
					if( ci <= -85.0745 )
						if( ci <= -90.775 )
							ret := -0.826087 // sell
						if( ci > -90.775 )
							ret := -1.000000 // sell
					if( ci > -85.0745 )
						if( esa <= 41.9684 )
							ret := -0.633484
						if( esa > 41.9684 )
							ret := -0.370253
	if( wt2 > -49.6463 )
		if( ci <= 20.2912 )
			if( wt2 <= 63.1832 )
				if( ci <= -37.3079 )
					if( ci <= -54.4084 )
						if( tci <= 9.85933 )
							ret := 0.023886
						if( tci > 9.85933 )
							ret := -0.204027
					if( ci > -54.4084 )
						if( tci <= 27.4852 )
							ret := 0.124664
						if( tci > 27.4852 )
							ret := 0.529915
				if( ci > -37.3079 )
					if( esa <= 165.515 )
						if( d_tci <= 7.82711 )
							ret := -0.065082
						if( d_tci > 7.82711 )
							ret := -0.224320
					if( esa > 165.515 )
						if( ap <= 192.87 )
							ret := 0.723404 // buy
						if( ap > 192.87 )
							ret := 0.144860
			if( wt2 > 63.1832 )
				if( ci <= 18.5774 )
					if( ap <= 50.7224 )
						if( d <= 0.557899 )
							ret := 0.272727
						if( d > 0.557899 )
							ret := 0.878788 // buy
					if( ap > 50.7224 )
						ret := 0.142857
				if( ci > 18.5774 )
					ret := -0.461538
		if( ci > 20.2912 )
			if( tci <= 56.1944 )
				if( ap <= 332.061 )
					if( ci_wt2 <= -20.1269 )
						if( ap <= 113.184 )
							ret := 0.672340
						if( ap > 113.184 )
							ret := 0.235294
					if( ci_wt2 > -20.1269 )
						if( ci <= 146.281 )
							ret := 0.087881
						if( ci > 146.281 )
							ret := 0.288925
				if( ap > 332.061 )
					if( d_tci <= -19.8952 )
						if( d <= 4.75605 )
							ret := -0.848101 // sell
						if( d > 4.75605 )
							ret := -0.200000
					if( d_tci > -19.8952 )
						if( d <= 3.40439 )
							ret := -0.400000
						if( d > 3.40439 )
							ret := -0.136364
			if( tci > 56.1944 )
				if( d_tci <= -65.3053 )
					if( ci <= 109.613 )
						if( ci <= 85.0672 )
							ret := 0.161716
						if( ci > 85.0672 )
							ret := 0.466667
					if( ci > 109.613 )
						if( esa <= 39.4344 )
							ret := -0.295082
						if( esa > 39.4344 )
							ret := 0.512195
				if( d_tci > -65.3053 )
					if( esa <= 38.9581 )
						if( ci <= 58.8229 )
							ret := -0.426036
						if( ci > 58.8229 )
							ret := 0.122340
					if( esa > 38.9581 )
						if( ci <= 36.9986 )
							ret := 0.202532
						if( ci > 36.9986 )
							ret := -0.430183
	
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
float op_operation = decision_tree_0_UPST_1Hour_751ac9f8(ap, d_tci, ci, ci_wt2, tci, d, wt2, esa)

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


