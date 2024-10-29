//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: ETHUSDT_30Min_1WAV_7b032b6d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETHUSDT_30Min_1WAV_7b032b6d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETHUSDT_30Min_7b032b6d(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( wt2 <= 76.4518 )
		if( ap <= 1208.22 )
			if( tci <= 53.38 )
				if( d <= 4.68694 )
					if( ap <= 337.352 )
						if( wt2 <= -40.119 )
							if( ci_wt2 <= -60.0039 )
								ret := 0.166667
							if( ci_wt2 > -60.0039 )
								if( ci_wt2 <= -20.9775 )
									ret := 0.769231 // buy
								if( ci_wt2 > -20.9775 )
									ret := 0.925926 // buy
						if( wt2 > -40.119 )
							if( d_tci <= 13.6675 )
								if( d_tci <= -15.5511 )
									ret := 1.000000 // buy
								if( d_tci > -15.5511 )
									ret := 0.666667
							if( d_tci > 13.6675 )
								if( d <= 2.90296 )
									ret := 0.200000
								if( d > 2.90296 )
									ret := -0.533333
					if( ap > 337.352 )
						if( tci <= 36.3946 )
							if( ap <= 349.753 )
								if( wt2 <= -46.2591 )
									ret := 0.666667
								if( wt2 > -46.2591 )
									ret := -0.342609
							if( ap > 349.753 )
								if( ap <= 586.985 )
									ret := 0.102544
								if( ap > 586.985 )
									ret := -0.069801
						if( tci > 36.3946 )
							if( ci_wt2 <= 21.0204 )
								if( ci_wt2 <= 12.1023 )
									ret := 0.296081
								if( ci_wt2 > 12.1023 )
									ret := 0.547619
							if( ci_wt2 > 21.0204 )
								if( tci <= 40.3228 )
									ret := -0.230088
								if( tci > 40.3228 )
									ret := 0.035256
				if( d > 4.68694 )
					if( d_tci <= 37.3308 )
						if( ci <= 76.9883 )
							if( d_tci <= -25.331 )
								if( ap <= 576.118 )
									ret := -0.342857
								if( ap > 576.118 )
									ret := 0.528139
							if( d_tci > -25.331 )
								if( esa <= 1064.89 )
									ret := 0.526678
								if( esa > 1064.89 )
									ret := 0.105759
						if( ci > 76.9883 )
							if( wt2 <= 25.8672 )
								if( esa <= 1097.47 )
									ret := 0.048980
								if( esa > 1097.47 )
									ret := 0.601351
							if( wt2 > 25.8672 )
								if( tci <= 41.8771 )
									ret := -0.105263
								if( tci > 41.8771 )
									ret := -0.512658
					if( d_tci > 37.3308 )
						if( esa <= 1182.81 )
							if( d <= 31.1459 )
								if( d <= 4.84643 )
									ret := 0.866667 // buy
								if( d > 4.84643 )
									ret := -0.089130
							if( d > 31.1459 )
								if( ap <= 1084.71 )
									ret := 0.915493 // buy
								if( ap > 1084.71 )
									ret := 0.319149
						if( esa > 1182.81 )
							if( d_tci <= 47.8118 )
								if( tci <= -26.7664 )
									ret := -0.102564
								if( tci > -26.7664 )
									ret := -0.916667 // sell
							if( d_tci > 47.8118 )
								if( esa <= 1223.83 )
									ret := 0.648829
								if( esa > 1223.83 )
									ret := -0.454545
			if( tci > 53.38 )
				if( ap <= 348.396 )
					if( ap <= 345.058 )
						ret := 1.000000 // buy
					if( ap > 345.058 )
						ret := 0.666667
				if( ap > 348.396 )
					if( wt2 <= 47.7172 )
						if( ci_wt2 <= 82.3861 )
							if( wt2 <= 45.5608 )
								ret := -0.500000
							if( wt2 > 45.5608 )
								ret := 0.222222
						if( ci_wt2 > 82.3861 )
							if( d_tci <= -49.0364 )
								if( wt2 <= 43.8463 )
									ret := 0.950000 // buy
								if( wt2 > 43.8463 )
									ret := 0.516129
							if( d_tci > -49.0364 )
								ret := -0.083333
					if( wt2 > 47.7172 )
						if( esa <= 1107.74 )
							if( ap <= 764.421 )
								if( d_tci <= -74.6704 )
									ret := -0.928571 // sell
								if( d_tci > -74.6704 )
									ret := -0.203106
							if( ap > 764.421 )
								if( ap <= 969.491 )
									ret := 0.847826 // buy
								if( ap > 969.491 )
									ret := 0.013889
						if( esa > 1107.74 )
							if( d <= 20.6034 )
								if( ap <= 1187.56 )
									ret := -0.631068
								if( ap > 1187.56 )
									ret := 0.407407
							if( d > 20.6034 )
								if( wt2 <= 68.4586 )
									ret := -1.000000 // sell
								if( wt2 > 68.4586 )
									ret := -0.769231 // sell
		if( ap > 1208.22 )
			if( ap <= 3491.75 )
				if( esa <= 1251.29 )
					if( wt2 <= 0.608498 )
						if( wt2 <= -78.2138 )
							ret := 1.000000 // buy
						if( wt2 > -78.2138 )
							if( d <= 8.67541 )
								if( d_tci <= 40.7717 )
									ret := 0.232673
								if( d_tci > 40.7717 )
									ret := -0.188679
							if( d > 8.67541 )
								if( wt2 <= -4.87954 )
									ret := -0.227642
								if( wt2 > -4.87954 )
									ret := -0.714286 // sell
					if( wt2 > 0.608498 )
						if( d <= 7.05184 )
							if( ci_wt2 <= -67.9715 )
								if( ci_wt2 <= -133.007 )
									ret := -0.105263
								if( ci_wt2 > -133.007 )
									ret := -0.660714
							if( ci_wt2 > -67.9715 )
								if( esa <= 1229.42 )
									ret := -0.074592
								if( esa > 1229.42 )
									ret := 0.317308
						if( d > 7.05184 )
							if( esa <= 1236.36 )
								if( ci_wt2 <= 75.7379 )
									ret := -0.364557
								if( ci_wt2 > 75.7379 )
									ret := 0.195402
							if( esa > 1236.36 )
								if( wt2 <= 23.2347 )
									ret := -0.256410
								if( wt2 > 23.2347 )
									ret := -0.788945 // sell
				if( esa > 1251.29 )
					if( ci_wt2 <= 122.698 )
						if( ap <= 1591.04 )
							if( d <= 4.2467 )
								if( wt2 <= 22.7891 )
									ret := -0.063286
								if( wt2 > 22.7891 )
									ret := 0.081522
							if( d > 4.2467 )
								if( ci <= 79.3962 )
									ret := 0.062970
								if( ci > 79.3962 )
									ret := 0.232361
						if( ap > 1591.04 )
							if( d_tci <= -37.7911 )
								if( ci_wt2 <= 80.286 )
									ret := -0.076225
								if( ci_wt2 > 80.286 )
									ret := -0.306159
							if( d_tci > -37.7911 )
								if( d_tci <= 3.38346 )
									ret := 0.032651
								if( d_tci > 3.38346 )
									ret := -0.018740
					if( ci_wt2 > 122.698 )
						if( d_tci <= -5.17814 )
							if( esa <= 1344.74 )
								if( wt2 <= 30.1106 )
									ret := -0.460526
								if( wt2 > 30.1106 )
									ret := 0.538462
							if( esa > 1344.74 )
								if( ci_wt2 <= 127.207 )
									ret := 0.579310
								if( ci_wt2 > 127.207 )
									ret := 0.229759
						if( d_tci > -5.17814 )
							if( ci <= 219.716 )
								if( ap <= 1598.74 )
									ret := -0.272727
								if( ap > 1598.74 )
									ret := 0.041245
							if( ci > 219.716 )
								ret := 0.894737 // buy
			if( ap > 3491.75 )
				if( ap <= 3656.4 )
					if( d_tci <= 103.647 )
						if( d_tci <= -32.2208 )
							if( d <= 22.2747 )
								if( ci_wt2 <= 32.1535 )
									ret := 0.073892
								if( ci_wt2 > 32.1535 )
									ret := -0.236842
							if( d > 22.2747 )
								if( ci_wt2 <= 98.3122 )
									ret := 0.396825
								if( ci_wt2 > 98.3122 )
									ret := 1.000000 // buy
						if( d_tci > -32.2208 )
							if( ci <= -91.0164 )
								if( d <= 15.1571 )
									ret := -0.419643
								if( d > 15.1571 )
									ret := 0.683824
							if( ci > -91.0164 )
								if( ci_wt2 <= -117.074 )
									ret := -0.857143 // sell
								if( ci_wt2 > -117.074 )
									ret := -0.292377
					if( d_tci > 103.647 )
						if( d <= 42.3799 )
							if( ap <= 3550.42 )
								ret := -0.300000
							if( ap > 3550.42 )
								ret := -0.818182 // sell
						if( d > 42.3799 )
							if( tci <= -48.43 )
								if( ci_wt2 <= 30.9015 )
									ret := -1.000000 // sell
								if( ci_wt2 > 30.9015 )
									ret := -0.888889 // sell
							if( tci > -48.43 )
								ret := -0.500000
				if( ap > 3656.4 )
					if( esa <= 3717.5 )
						if( ap <= 3749.04 )
							if( d_tci <= -36.8986 )
								if( esa <= 3688.24 )
									ret := -0.740741 // sell
								if( esa > 3688.24 )
									ret := 0.076923
							if( d_tci > -36.8986 )
								if( d_tci <= 91.1227 )
									ret := 0.275534
								if( d_tci > 91.1227 )
									ret := 0.941176 // buy
						if( ap > 3749.04 )
							if( ci_wt2 <= 74.4272 )
								ret := 0.958333 // buy
							if( ci_wt2 > 74.4272 )
								ret := 0.555556
					if( esa > 3717.5 )
						if( esa <= 4187.88 )
							if( d_tci <= -24.7574 )
								if( ci <= 151.024 )
									ret := -0.300690
								if( ci > 151.024 )
									ret := 0.442623
							if( d_tci > -24.7574 )
								if( esa <= 4162.52 )
									ret := 0.004820
								if( esa > 4162.52 )
									ret := 0.709877 // buy
						if( esa > 4187.88 )
							if( d_tci <= 93.6548 )
								if( wt2 <= 14.8911 )
									ret := -0.048471
								if( wt2 > 14.8911 )
									ret := -0.205150
							if( d_tci > 93.6548 )
								if( ci_wt2 <= -54.456 )
									ret := 0.090909
								if( ci_wt2 > -54.456 )
									ret := -0.612903
	if( wt2 > 76.4518 )
		if( d_tci <= -73.9184 )
			if( esa <= 400.749 )
				ret := -0.176471
			if( esa > 400.749 )
				ret := -0.692308
		if( d_tci > -73.9184 )
			if( d <= 49.6193 )
				if( d_tci <= -46.1913 )
					if( esa <= 1798.11 )
						if( d_tci <= -58.2941 )
							if( ci <= 82.7694 )
								if( ap <= 409.564 )
									ret := 0.800000 // buy
								if( ap > 409.564 )
									ret := 0.166667
							if( ci > 82.7694 )
								if( d_tci <= -69.6095 )
									ret := 0.583333
								if( d_tci > -69.6095 )
									ret := 0.818182 // buy
						if( d_tci > -58.2941 )
							if( d <= 36.8466 )
								if( tci <= 77.7105 )
									ret := 0.750000 // buy
								if( tci > 77.7105 )
									ret := 0.967213 // buy
							if( d > 36.8466 )
								ret := 0.461538
					if( esa > 1798.11 )
						if( ci <= 93.0135 )
							if( ci <= 67.9848 )
								if( tci <= 76.0228 )
									ret := 0.388889
								if( tci > 76.0228 )
									ret := 0.058824
							if( ci > 67.9848 )
								ret := -0.625000
						if( ci > 93.0135 )
							ret := 0.882353 // buy
				if( d_tci > -46.1913 )
					if( tci <= 71.7624 )
						ret := 0.750000 // buy
					if( tci > 71.7624 )
						if( esa <= 1458.68 )
							ret := -0.888889 // sell
						if( esa > 1458.68 )
							if( ci_wt2 <= -21.5592 )
								ret := 0.416667
							if( ci_wt2 > -21.5592 )
								ret := -0.050000
			if( d > 49.6193 )
				if( d <= 59.1346 )
					if( wt2 <= 78.4289 )
						ret := 0.900000 // buy
					if( wt2 > 78.4289 )
						ret := 1.000000 // buy
				if( d > 59.1346 )
					ret := 0.380952
	
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
float op_operation = decision_tree_0_ETHUSDT_30Min_7b032b6d(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)

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


