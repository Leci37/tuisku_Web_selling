//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: QCOM_1Hour_1WAV_86819b17 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_QCOM_1Hour_1WAV_86819b17", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_QCOM_1Hour_86819b17(ap, d_tci, ci, ci_wt2, tci, d, wt2, esa)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( ci <= 157.861 )
		if( ci <= -136.88 )
			if( d <= 0.713066 )
				if( ap <= 74.5324 )
					if( ci <= -173.843 )
						if( wt2 <= 11.4762 )
							ret := -0.615385
						if( wt2 > 11.4762 )
							ret := 1.000000 // buy
					if( ci > -173.843 )
						if( d_tci <= 49.7921 )
							ret := 0.658228
						if( d_tci > 49.7921 )
							ret := -0.428571
				if( ap > 74.5324 )
					if( ci_wt2 <= -212.921 )
						if( ci_wt2 <= -218.312 )
							ret := 1.000000 // buy
						if( ci_wt2 > -218.312 )
							ret := 0.750000 // buy
					if( ci_wt2 > -212.921 )
						if( esa <= 92.2165 )
							ret := -0.637681
						if( esa > 92.2165 )
							ret := -0.137255
			if( d > 0.713066 )
				if( wt2 <= 2.82474 )
					if( tci <= -41.8622 )
						if( ci <= -247.658 )
							ret := 1.000000 // buy
						if( ci > -247.658 )
							ret := -0.539683
					if( tci > -41.8622 )
						if( ci <= -153.627 )
							ret := 0.700000 // buy
						if( ci > -153.627 )
							ret := -0.130435
				if( wt2 > 2.82474 )
					if( ap <= 198.343 )
						if( d <= 0.915645 )
							ret := -0.659091
						if( d > 0.915645 )
							ret := -0.979167 // sell
					if( ap > 198.343 )
						if( ci_wt2 <= -179.645 )
							ret := -0.916667 // sell
						if( ci_wt2 > -179.645 )
							ret := 1.000000 // buy
		if( ci > -136.88 )
			if( ap <= 129.299 )
				if( esa <= 95.3656 )
					if( ap <= 90.8539 )
						if( wt2 <= 20.055 )
							ret := 0.070703
						if( wt2 > 20.055 )
							ret := -0.044880
					if( ap > 90.8539 )
						if( d_tci <= 16.4128 )
							ret := -0.413551
						if( d_tci > 16.4128 )
							ret := 0.067797
				if( esa > 95.3656 )
					if( ap <= 110.813 )
						if( wt2 <= -79.2743 )
							ret := -1.000000 // sell
						if( wt2 > -79.2743 )
							ret := 0.313065
					if( ap > 110.813 )
						if( ci <= 134.938 )
							ret := 0.041160
						if( ci > 134.938 )
							ret := 0.640625
			if( ap > 129.299 )
				if( d <= 0.432408 )
					if( wt2 <= -35.4733 )
						if( esa <= 143.385 )
							ret := 0.717391 // buy
						if( esa > 143.385 )
							ret := -0.015152
					if( wt2 > -35.4733 )
						if( ci_wt2 <= -21.9844 )
							ret := 0.194362
						if( ci_wt2 > -21.9844 )
							ret := -0.013876
				if( d > 0.432408 )
					if( d_tci <= -82.4752 )
						ret := 1.000000 // buy
					if( d_tci > -82.4752 )
						if( wt2 <= -58.8719 )
							ret := 0.220217
						if( wt2 > -58.8719 )
							ret := -0.061100
	if( ci > 157.861 )
		if( d_tci <= -62.7244 )
			if( d <= 1.14982 )
				ret := -0.111111
			if( d > 1.14982 )
				if( wt2 <= 51.2898 )
					ret := 0.333333
				if( wt2 > 51.2898 )
					ret := 0.944444 // buy
		if( d_tci > -62.7244 )
			if( d <= 0.516913 )
				if( d <= 0.446219 )
					if( wt2 <= -13.495 )
						if( d_tci <= 7.97475 )
							ret := 0.800000 // buy
						if( d_tci > 7.97475 )
							ret := -1.000000 // sell
					if( wt2 > -13.495 )
						if( wt2 <= 3.81629 )
							ret := -0.721311 // sell
						if( wt2 > 3.81629 )
							ret := -0.203704
				if( d > 0.446219 )
					if( esa <= 72.0821 )
						ret := 1.000000 // buy
					if( esa > 72.0821 )
						if( wt2 <= 34.6027 )
							ret := 0.000000
						if( wt2 > 34.6027 )
							ret := -0.666667
			if( d > 0.516913 )
				if( ap <= 160.933 )
					if( ci <= 176.818 )
						if( ci_wt2 <= 198.599 )
							ret := -0.831461 // sell
						if( ci_wt2 > 198.599 )
							ret := 0.000000
					if( ci > 176.818 )
						if( d_tci <= -23.2221 )
							ret := -0.619048
						if( d_tci > -23.2221 )
							ret := -0.142857
				if( ap > 160.933 )
					if( ci <= 169.488 )
						if( ap <= 190.729 )
							ret := 0.923077 // buy
						if( ap > 190.729 )
							ret := 0.000000
					if( ci > 169.488 )
						if( wt2 <= 26.7065 )
							ret := -0.466667
						if( wt2 > 26.7065 )
							ret := -0.857143 // sell
	
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
float op_operation = decision_tree_0_QCOM_1Hour_86819b17(ap, d_tci, ci, ci_wt2, tci, d, wt2, esa)

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


