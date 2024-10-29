//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: ETHUSDT_15Min_1WAV_2ff7be28 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETHUSDT_15Min_1WAV_2ff7be28", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETHUSDT_15Min_2ff7be28(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( d_tci <= 75.3356 )
		if( esa <= 3848.99 )
			if( ap <= 1083.89 )
				if( d <= 1.64144 )
					if( esa <= 1054.09 )
						ret := 0.125000
					if( esa > 1054.09 )
						if( ap <= 1077.54 )
							ret := -1.000000 // sell
						if( ap > 1077.54 )
							ret := -0.428571
				if( d > 1.64144 )
					if( ci <= -0.763488 )
						if( d <= 3.45247 )
							if( ci_wt2 <= -61.1391 )
								ret := -0.583333
							if( ci_wt2 > -61.1391 )
								ret := 0.141791
						if( d > 3.45247 )
							if( ci_wt2 <= 8.99367 )
								ret := 0.644880
							if( ci_wt2 > 8.99367 )
								ret := -0.054545
					if( ci > -0.763488 )
						if( d <= 3.06257 )
							if( esa <= 1072.44 )
								ret := 0.625000
							if( esa > 1072.44 )
								ret := -0.687500
						if( d > 3.06257 )
							if( esa <= 978.943 )
								ret := 0.690476
							if( esa > 978.943 )
								ret := -0.103641
			if( ap > 1083.89 )
				if( wt2 <= -57.7701 )
					if( ci_wt2 <= -67.4146 )
						if( esa <= 1628.26 )
							ret := 0.000000
						if( esa > 1628.26 )
							if( ap <= 1828.28 )
								ret := -0.880000 // sell
							if( ap > 1828.28 )
								ret := -0.363636
					if( ci_wt2 > -67.4146 )
						if( tci <= -60.3817 )
							if( ap <= 1188.15 )
								ret := 0.546875
							if( ap > 1188.15 )
								ret := 0.009804
						if( tci > -60.3817 )
							if( ci_wt2 <= 140.127 )
								ret := -0.138365
							if( ci_wt2 > 140.127 )
								ret := 0.769231 // buy
				if( wt2 > -57.7701 )
					if( d <= 44.0451 )
						if( wt2 <= -39.8388 )
							if( esa <= 2626.84 )
								ret := 0.123722
							if( esa > 2626.84 )
								ret := -0.037657
						if( wt2 > -39.8388 )
							if( esa <= 1115.35 )
								ret := -0.144686
							if( esa > 1115.35 )
								ret := 0.039365
					if( d > 44.0451 )
						if( esa <= 3622.62 )
							if( d <= 56.3901 )
								ret := 0.565217
							if( d > 56.3901 )
								ret := 0.929825 // buy
						if( esa > 3622.62 )
							if( ci <= 49.1652 )
								ret := 0.666667
							if( ci > 49.1652 )
								ret := -0.666667
		if( esa > 3848.99 )
			if( d_tci <= 46.0645 )
				if( d <= 39.1437 )
					if( tci <= 54.1578 )
						if( tci <= 53.105 )
							if( ci <= -114.89 )
								ret := -0.541667
							if( ci > -114.89 )
								ret := -0.066074
						if( tci > 53.105 )
							if( esa <= 3879.43 )
								ret := 1.000000 // buy
							if( esa > 3879.43 )
								ret := 0.142857
					if( tci > 54.1578 )
						if( ci <= 82.1924 )
							if( d <= 23.2924 )
								ret := 0.023256
							if( d > 23.2924 )
								ret := -0.823529 // sell
						if( ci > 82.1924 )
							if( esa <= 3948.81 )
								ret := -0.944444 // sell
							if( esa > 3948.81 )
								ret := -0.500000
				if( d > 39.1437 )
					if( ci_wt2 <= 4.49377 )
						ret := 1.000000 // buy
					if( ci_wt2 > 4.49377 )
						ret := 0.571429
			if( d_tci > 46.0645 )
				if( tci <= -36.4568 )
					if( d_tci <= 69.3669 )
						if( esa <= 3885.42 )
							if( ap <= 3851.03 )
								ret := -0.142857
							if( ap > 3851.03 )
								ret := -0.955556 // sell
						if( esa > 3885.42 )
							if( esa <= 3925.36 )
								ret := -0.115385
							if( esa > 3925.36 )
								ret := -0.711864 // sell
					if( d_tci > 69.3669 )
						if( ci <= -69.4559 )
							ret := -0.333333
						if( ci > -69.4559 )
							ret := 0.666667
				if( tci > -36.4568 )
					ret := 0.714286 // buy
	if( d_tci > 75.3356 )
		if( ci <= -54.4269 )
			if( ap <= 1062.11 )
				if( d <= 21.1972 )
					if( ci <= -93.0166 )
						if( ap <= 1010.4 )
							ret := -1.000000 // sell
						if( ap > 1010.4 )
							ret := 0.142857
					if( ci > -93.0166 )
						if( ci <= -63.5291 )
							ret := -1.000000 // sell
						if( ci > -63.5291 )
							ret := -0.857143 // sell
				if( d > 21.1972 )
					if( ci <= -68.6907 )
						if( tci <= -82.7426 )
							ret := -0.714286 // sell
						if( tci > -82.7426 )
							ret := -0.100000
					if( ci > -68.6907 )
						ret := 1.000000 // buy
			if( ap > 1062.11 )
				if( tci <= -54.1801 )
					if( esa <= 1766.57 )
						if( ci <= -96.4039 )
							if( esa <= 1525.58 )
								ret := 0.017143
							if( esa > 1525.58 )
								ret := 0.409836
						if( ci > -96.4039 )
							if( tci <= -71.7664 )
								ret := 0.361204
							if( tci > -71.7664 )
								ret := 0.626263
					if( esa > 1766.57 )
						if( ap <= 1800.36 )
							if( ci <= -106.447 )
								ret := -0.723404 // sell
							if( ci > -106.447 )
								ret := -0.101266
						if( ap > 1800.36 )
							if( d <= 10.1365 )
								ret := -0.024540
							if( d > 10.1365 )
								ret := 0.299938
				if( tci > -54.1801 )
					if( d_tci <= 89.1148 )
						if( esa <= 2283.93 )
							if( d <= 26.2387 )
								ret := -0.142857
							if( d > 26.2387 )
								ret := -0.954545 // sell
						if( esa > 2283.93 )
							if( ap <= 3423.15 )
								ret := 0.238095
							if( ap > 3423.15 )
								ret := -0.842105 // sell
					if( d_tci > 89.1148 )
						if( ci_wt2 <= -96.4473 )
							ret := 1.000000 // buy
						if( ci_wt2 > -96.4473 )
							if( ci <= -79.9639 )
								ret := -0.470588
							if( ci > -79.9639 )
								ret := 0.647059
		if( ci > -54.4269 )
			if( ap <= 1508.33 )
				if( ci <= -27.4833 )
					if( wt2 <= -73.3237 )
						if( wt2 <= -76.6299 )
							if( ap <= 1220.14 )
								ret := 0.894737 // buy
							if( ap > 1220.14 )
								ret := -0.090909
						if( wt2 > -76.6299 )
							if( wt2 <= -75.5455 )
								ret := -1.000000 // sell
							if( wt2 > -75.5455 )
								ret := -0.470588
					if( wt2 > -73.3237 )
						if( esa <= 1461.63 )
							if( tci <= -66.464 )
								ret := 0.745098 // buy
							if( tci > -66.464 )
								ret := 0.500000
						if( esa > 1461.63 )
							ret := 0.000000
				if( ci > -27.4833 )
					if( tci <= -61.1599 )
						if( d <= 16.9283 )
							if( ap <= 1223.51 )
								ret := 1.000000 // buy
							if( ap > 1223.51 )
								ret := 0.500000
						if( d > 16.9283 )
							ret := 1.000000 // buy
					if( tci > -61.1599 )
						ret := 0.500000
			if( ap > 1508.33 )
				if( d_tci <= 91.9708 )
					if( esa <= 1741.53 )
						if( ap <= 1573.54 )
							if( d <= 12.059 )
								ret := 0.714286 // buy
							if( d > 12.059 )
								ret := -0.306452
						if( ap > 1573.54 )
							if( d <= 13.8084 )
								ret := -0.395833
							if( d > 13.8084 )
								ret := -0.804878 // sell
					if( esa > 1741.53 )
						if( esa <= 1805.29 )
							if( d_tci <= 82.2689 )
								ret := 0.545455
							if( d_tci > 82.2689 )
								ret := 0.923077 // buy
						if( esa > 1805.29 )
							if( d_tci <= 79.9775 )
								ret := -0.159259
							if( d_tci > 79.9775 )
								ret := 0.136646
				if( d_tci > 91.9708 )
					if( d <= 75.5122 )
						if( ci_wt2 <= 22.0583 )
							if( ap <= 1986.33 )
								ret := 1.000000 // buy
							if( ap > 1986.33 )
								ret := -0.333333
						if( ci_wt2 > 22.0583 )
							if( tci <= -87.5904 )
								ret := 0.142857
							if( tci > -87.5904 )
								ret := -0.598086
					if( d > 75.5122 )
						if( ap <= 2628.27 )
							ret := 0.714286 // buy
						if( ap > 2628.27 )
							ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_ETHUSDT_15Min_2ff7be28(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)

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


