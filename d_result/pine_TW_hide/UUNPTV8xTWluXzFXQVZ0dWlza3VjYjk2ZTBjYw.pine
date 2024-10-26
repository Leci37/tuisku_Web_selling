//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: QCOM_1Min_1WAV_cb96e0cc Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_QCOM_1Min_1WAV_cb96e0cc", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_QCOM_1Min_cb96e0cc(ap, d_tci, ci, ci_wt2, tci, d, wt2, esa)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7,max_features=sqrt, min_samples_leaf=4,random_state=843828734)
	if( ci <= -64.3766 )
		if( wt2 <= 4.67524 )
			if( esa <= 158.022 )
				if( ap <= 148.798 )
					if( ci_wt2 <= -31.9354 )
						ret := 0.666667
					if( ci_wt2 > -31.9354 )
						ret := -1.000000 // sell
				if( ap > 148.798 )
					if( tci <= -68.0822 )
						if( ci_wt2 <= -20.3712 )
							if( ap <= 156.336 )
								ret := -0.166667
							if( ap > 156.336 )
								ret := -1.000000 // sell
						if( ci_wt2 > -20.3712 )
							if( ci <= -79.1058 )
								ret := 0.333333
							if( ci > -79.1058 )
								ret := 0.900000 // buy
					if( tci > -68.0822 )
						if( ci <= -170.645 )
							ret := -0.250000
						if( ci > -170.645 )
							if( tci <= -12.9285 )
								ret := 0.727700 // buy
							if( tci > -12.9285 )
								ret := 0.100000
			if( esa > 158.022 )
				if( esa <= 161.12 )
					if( wt2 <= -70.0533 )
						if( tci <= -77.4151 )
							if( ci <= -99.4342 )
								ret := -0.823529 // sell
							if( ci > -99.4342 )
								ret := -1.000000 // sell
						if( tci > -77.4151 )
							if( ci_wt2 <= 9.53935 )
								ret := -0.050000
							if( ci_wt2 > 9.53935 )
								ret := -1.000000 // sell
					if( wt2 > -70.0533 )
						if( ci_wt2 <= -121.519 )
							if( tci <= -35.8943 )
								ret := -0.250000
							if( tci > -35.8943 )
								ret := 0.761905 // buy
						if( ci_wt2 > -121.519 )
							if( ci <= -136.908 )
								ret := 0.766667 // buy
							if( ci > -136.908 )
								ret := -0.205234
				if( esa > 161.12 )
					if( esa <= 169.637 )
						if( ci <= -94.5168 )
							if( wt2 <= 0.952101 )
								ret := 0.217307
							if( wt2 > 0.952101 )
								ret := -0.175258
						if( ci > -94.5168 )
							if( d_tci <= 70.2364 )
								ret := -0.001703
							if( d_tci > 70.2364 )
								ret := 0.575472
					if( esa > 169.637 )
						if( tci <= -84.0418 )
							if( d_tci <= 90.0689 )
								ret := -0.785714 // sell
							if( d_tci > 90.0689 )
								ret := -0.222222
						if( tci > -84.0418 )
							if( ci_wt2 <= -107.117 )
								ret := -0.136084
							if( ci_wt2 > -107.117 )
								ret := 0.012612
		if( wt2 > 4.67524 )
			if( ci <= -154.521 )
				if( ap <= 210.243 )
					if( esa <= 160.612 )
						ret := -0.571429
					if( esa > 160.612 )
						if( d <= 0.142343 )
							if( ap <= 167.066 )
								ret := 0.666667
							if( ap > 167.066 )
								ret := -0.234043
						if( d > 0.142343 )
							if( d_tci <= -6.8925 )
								ret := 0.746269 // buy
							if( d_tci > -6.8925 )
								ret := 0.440594
				if( ap > 210.243 )
					if( d_tci <= -6.87462 )
						if( tci <= 12.651 )
							if( wt2 <= 24.874 )
								ret := -1.000000 // sell
							if( wt2 > 24.874 )
								ret := 0.000000
						if( tci > 12.651 )
							ret := -1.000000 // sell
					if( d_tci > -6.87462 )
						if( tci <= 0.016633 )
							if( d_tci <= 7.24638 )
								ret := -0.818182 // sell
							if( d_tci > 7.24638 )
								ret := 0.875000 // buy
						if( tci > 0.016633 )
							ret := 1.000000 // buy
			if( ci > -154.521 )
				if( d_tci <= -27.3418 )
					if( ci <= -134.211 )
						if( esa <= 175.313 )
							ret := -0.142857
						if( esa > 175.313 )
							if( tci <= 34.0595 )
								ret := -0.777778 // sell
							if( tci > 34.0595 )
								ret := -1.000000 // sell
					if( ci > -134.211 )
						if( wt2 <= 42.2259 )
							if( ci <= -72.8767 )
								ret := 0.666667
							if( ci > -72.8767 )
								ret := 0.275862
						if( wt2 > 42.2259 )
							if( wt2 <= 59.4281 )
								ret := 0.254902
							if( wt2 > 59.4281 )
								ret := 0.744186 // buy
				if( d_tci > -27.3418 )
					if( tci <= 6.8038 )
						if( wt2 <= 13.7116 )
							if( d_tci <= 5.30004 )
								ret := 0.334409
							if( d_tci > 5.30004 )
								ret := 0.075688
						if( wt2 > 13.7116 )
							if( wt2 <= 16.1175 )
								ret := -0.109043
							if( wt2 > 16.1175 )
								ret := 0.215867
					if( tci > 6.8038 )
						if( d_tci <= -22.0872 )
							if( tci <= 23.9324 )
								ret := -0.355932
							if( tci > 23.9324 )
								ret := 0.085938
						if( d_tci > -22.0872 )
							if( ci_wt2 <= -179.278 )
								ret := -0.531250
							if( ci_wt2 > -179.278 )
								ret := 0.074031
	if( ci > -64.3766 )
		if( ap <= 162.387 )
			if( ci <= -6.09291 )
				if( ap <= 157.462 )
					if( ap <= 153.244 )
						if( ci_wt2 <= 11.8478 )
							if( ci_wt2 <= -0.172966 )
								ret := 0.761905 // buy
							if( ci_wt2 > -0.172966 )
								ret := -0.857143 // sell
						if( ci_wt2 > 11.8478 )
							if( d_tci <= 48.8906 )
								ret := 0.500000
							if( d_tci > 48.8906 )
								ret := 1.000000 // buy
					if( ap > 153.244 )
						if( wt2 <= -58.9211 )
							if( wt2 <= -65.8239 )
								ret := 0.923077 // buy
							if( wt2 > -65.8239 )
								ret := -0.166667
						if( wt2 > -58.9211 )
							if( d_tci <= -5.59687 )
								ret := 0.935484 // buy
							if( d_tci > -5.59687 )
								ret := 0.753731 // buy
				if( ap > 157.462 )
					if( ap <= 161.841 )
						if( wt2 <= -75.4888 )
							if( ap <= 158.78 )
								ret := -0.400000
							if( ap > 158.78 )
								ret := -0.882353 // sell
						if( wt2 > -75.4888 )
							if( tci <= -65.5006 )
								ret := 0.510870
							if( tci > -65.5006 )
								ret := 0.084647
					if( ap > 161.841 )
						if( d <= 0.389273 )
							if( ci <= -22.6933 )
								ret := 0.285068
							if( ci > -22.6933 )
								ret := 0.639175
						if( d > 0.389273 )
							if( esa <= 162.376 )
								ret := -1.000000 // sell
							if( esa > 162.376 )
								ret := 0.000000
			if( ci > -6.09291 )
				if( ci <= 103.958 )
					if( ci_wt2 <= 110.434 )
						if( ci_wt2 <= 28.4983 )
							if( ap <= 159.416 )
								ret := -0.237569
							if( ap > 159.416 )
								ret := 0.050896
						if( ci_wt2 > 28.4983 )
							if( d <= 0.212327 )
								ret := 0.223037
							if( d > 0.212327 )
								ret := -0.014977
					if( ci_wt2 > 110.434 )
						if( d <= 0.137461 )
							if( wt2 <= -17.5246 )
								ret := -0.214286
							if( wt2 > -17.5246 )
								ret := 1.000000 // buy
						if( d > 0.137461 )
							if( d_tci <= 31.8039 )
								ret := -0.847059 // sell
							if( d_tci > 31.8039 )
								ret := -0.071429
				if( ci > 103.958 )
					if( ci <= 175.091 )
						if( wt2 <= 29.7148 )
							if( ap <= 157.678 )
								ret := -0.961538 // sell
							if( ap > 157.678 )
								ret := -0.220994
						if( wt2 > 29.7148 )
							if( ci_wt2 <= 49.5174 )
								ret := -1.000000 // sell
							if( ci_wt2 > 49.5174 )
								ret := 0.079439
					if( ci > 175.091 )
						if( ap <= 160.147 )
							if( d <= 0.200259 )
								ret := 0.500000
							if( d > 0.200259 )
								ret := 1.000000 // buy
						if( ap > 160.147 )
							if( esa <= 160.301 )
								ret := -0.454545
							if( esa > 160.301 )
								ret := 0.533333
		if( ap > 162.387 )
			if( ci_wt2 <= 178.509 )
				if( ap <= 229.082 )
					if( ci_wt2 <= 46.0593 )
						if( esa <= 216.978 )
							if( ci <= 58.2477 )
								ret := 0.002247
							if( ci > 58.2477 )
								ret := -0.078269
						if( esa > 216.978 )
							if( d_tci <= 19.4402 )
								ret := 0.237654
							if( d_tci > 19.4402 )
								ret := -0.192623
					if( ci_wt2 > 46.0593 )
						if( d <= 0.306704 )
							if( ci <= 58.2447 )
								ret := -0.113631
							if( ci > 58.2447 )
								ret := 0.002686
						if( d > 0.306704 )
							if( d_tci <= -58.9991 )
								ret := -0.496429
							if( d_tci > -58.9991 )
								ret := -0.224632
				if( ap > 229.082 )
					if( ci <= -51.0257 )
						if( wt2 <= -4.05628 )
							ret := 0.714286 // buy
						if( wt2 > -4.05628 )
							ret := 0.142857
					if( ci > -51.0257 )
						if( d_tci <= -30.5167 )
							if( ci <= 17.9207 )
								ret := -0.100000
							if( ci > 17.9207 )
								ret := -0.808989 // sell
						if( d_tci > -30.5167 )
							if( d <= 0.39811 )
								ret := -0.521739
							if( d > 0.39811 )
								ret := 0.153846
			if( ci_wt2 > 178.509 )
				if( d_tci <= -18.1635 )
					if( ci <= 223.921 )
						if( ci <= 210.521 )
							if( ci_wt2 <= 191.33 )
								ret := -0.400000
							if( ci_wt2 > 191.33 )
								ret := 0.500000
						if( ci > 210.521 )
							if( ci_wt2 <= 200.597 )
								ret := -0.428571
							if( ci_wt2 > 200.597 )
								ret := -0.916667 // sell
					if( ci > 223.921 )
						if( d_tci <= -27.6646 )
							if( ap <= 171.223 )
								ret := -0.846154 // sell
							if( ap > 171.223 )
								ret := 0.125000
						if( d_tci > -27.6646 )
							if( ci <= 271.253 )
								ret := 0.954545 // buy
							if( ci > 271.253 )
								ret := 0.200000
				if( d_tci > -18.1635 )
					if( d_tci <= 99.0543 )
						if( ci <= 242.487 )
							if( d <= 0.320972 )
								ret := -0.292553
							if( d > 0.320972 )
								ret := -0.858407 // sell
						if( ci > 242.487 )
							ret := -1.000000 // sell
					if( d_tci > 99.0543 )
						ret := 0.500000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_QCOM_1Min_cb96e0cc(ap, d_tci, ci, ci_wt2, tci, d, wt2, esa)

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


