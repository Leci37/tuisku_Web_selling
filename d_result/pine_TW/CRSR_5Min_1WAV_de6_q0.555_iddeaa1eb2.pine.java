//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: CRSR_5Min_1WAV_deaa1eb2 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRSR_5Min_1WAV_deaa1eb2", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRSR_5Min_deaa1eb2(tci, ci, d_tci, esa, d, ci_wt2, wt2, ap)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6,max_features=sqrt, min_samples_split=10,random_state=843828734)
	if( d_tci <= 53.8138 )
		if( esa <= 6.55061 )
			if( d_tci <= 39.5183 )
				if( ci_wt2 <= -103.835 )
					if( wt2 <= 26.4291 )
						if( d <= 0.046467 )
							ret := -0.018182
						if( d > 0.046467 )
							ret := 0.687500
					if( wt2 > 26.4291 )
						if( esa <= 6.23424 )
							ret := -0.838710 // sell
						if( esa > 6.23424 )
							ret := -0.368421
				if( ci_wt2 > -103.835 )
					if( esa <= 6.03465 )
						if( d_tci <= -54.4816 )
							ret := -0.400000
						if( d_tci > -54.4816 )
							ret := 0.568807
					if( esa > 6.03465 )
						if( d_tci <= -65.9844 )
							ret := 0.693333
						if( d_tci > -65.9844 )
							ret := 0.222106
			if( d_tci > 39.5183 )
				if( d <= 0.023999 )
					if( ci_wt2 <= -61.7187 )
						if( tci <= -52.1039 )
							ret := 0.000000
						if( tci > -52.1039 )
							ret := -0.857143 // sell
					if( ci_wt2 > -61.7187 )
						if( ap <= 5.76439 )
							ret := 1.000000 // buy
						if( ap > 5.76439 )
							ret := 0.199115
				if( d > 0.023999 )
					if( wt2 <= -50.2534 )
						if( ap <= 5.72982 )
							ret := 0.000000
						if( ap > 5.72982 )
							ret := -0.920000 // sell
					if( wt2 > -50.2534 )
						if( esa <= 6.17332 )
							ret := 0.296296
						if( esa > 6.17332 )
							ret := -0.309735
		if( esa > 6.55061 )
			if( ap <= 20.1117 )
				if( ci_wt2 <= -165.745 )
					if( ci_wt2 <= -243.709 )
						if( d_tci <= 47.3829 )
							ret := 0.977778 // buy
						if( d_tci > 47.3829 )
							ret := 0.857143 // buy
					if( ci_wt2 > -243.709 )
						if( wt2 <= -8.16526 )
							ret := 0.801527 // buy
						if( wt2 > -8.16526 )
							ret := 0.373832
				if( ci_wt2 > -165.745 )
					if( ci <= 176.165 )
						if( ci <= -63.5963 )
							ret := 0.062129
						if( ci > -63.5963 )
							ret := -0.051357
					if( ci > 176.165 )
						if( d <= 0.039753 )
							ret := -0.336683
						if( d > 0.039753 )
							ret := -0.760870 // sell
			if( ap > 20.1117 )
				if( esa <= 20.2026 )
					if( d_tci <= -15.831 )
						if( d_tci <= -40.4728 )
							ret := -1.000000 // sell
						if( d_tci > -40.4728 )
							ret := 0.000000
					if( d_tci > -15.831 )
						ret := -1.000000 // sell
				if( esa > 20.2026 )
					ret := 0.000000
	if( d_tci > 53.8138 )
		if( ap <= 17.4424 )
			if( ci_wt2 <= -1.34331 )
				if( d_tci <= 62.4879 )
					if( ap <= 6.00853 )
						if( tci <= -59.2471 )
							ret := 0.272727
						if( tci > -59.2471 )
							ret := -0.965517 // sell
					if( ap > 6.00853 )
						if( d <= 0.094443 )
							ret := 0.123469
						if( d > 0.094443 )
							ret := 0.646154
				if( d_tci > 62.4879 )
					if( ap <= 7.98113 )
						if( ap <= 5.76991 )
							ret := -0.250000
						if( ap > 5.76991 )
							ret := 0.829787 // buy
					if( ap > 7.98113 )
						if( ci <= -144.979 )
							ret := 0.735294 // buy
						if( ci > -144.979 )
							ret := 0.202899
			if( ci_wt2 > -1.34331 )
				if( ci <= -68.2088 )
					if( ap <= 15.7125 )
						if( ap <= 15.3295 )
							ret := 0.488372
						if( ap > 15.3295 )
							ret := -0.750000 // sell
					if( ap > 15.7125 )
						ret := 1.000000 // buy
				if( ci > -68.2088 )
					if( d <= 0.024737 )
						if( wt2 <= -61.3882 )
							ret := 0.400000
						if( wt2 > -61.3882 )
							ret := -0.035294
					if( d > 0.024737 )
						if( d_tci <= 71.2485 )
							ret := -0.108716
						if( d_tci > 71.2485 )
							ret := 0.198413
		if( ap > 17.4424 )
			if( wt2 <= -67.0516 )
				if( tci <= -77.3506 )
					if( ap <= 19.4385 )
						if( ci <= -107.163 )
							ret := -1.000000 // sell
						if( ci > -107.163 )
							ret := 0.333333
					if( ap > 19.4385 )
						ret := -1.000000 // sell
				if( tci > -77.3506 )
					if( ap <= 17.5442 )
						ret := 0.500000
					if( ap > 17.5442 )
						if( ci <= -77.6058 )
							ret := -0.888889 // sell
						if( ci > -77.6058 )
							ret := -0.319444
			if( wt2 > -67.0516 )
				if( d <= 0.062506 )
					if( esa <= 19.695 )
						if( ci <= -86.3253 )
							ret := -0.450980
						if( ci > -86.3253 )
							ret := 0.064935
					if( esa > 19.695 )
						if( d_tci <= 55.7865 )
							ret := -0.333333
						if( d_tci > 55.7865 )
							ret := -0.909091 // sell
				if( d > 0.062506 )
					if( d <= 0.08214 )
						if( tci <= -69.8272 )
							ret := 0.000000
						if( tci > -69.8272 )
							ret := 0.894737 // buy
					if( d > 0.08214 )
						if( esa <= 19.5977 )
							ret := 0.307692
						if( esa > 19.5977 )
							ret := 0.857143 // buy
	
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
float op_operation = decision_tree_0_CRSR_5Min_deaa1eb2(tci, ci, d_tci, esa, d, ci_wt2, wt2, ap)

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


