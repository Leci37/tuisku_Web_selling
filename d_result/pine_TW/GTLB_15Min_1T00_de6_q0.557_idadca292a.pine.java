//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: GTLB_15Min_1T00_adca292a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GTLB_15Min_1T00_adca292a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GTLB_15Min_adca292a(ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( tema <= 43.9559 )
		if( ema13 <= -1.34025 )
			if( ema1 <= 43.2099 )
				if( ema3 <= 41.3219 )
					if( ema13 <= -1.53204 )
						if( ema12 <= -0.82683 )
							ret := 0.822222 // buy
						if( ema12 > -0.82683 )
							ret := 0.083333
					if( ema13 > -1.53204 )
						if( ema13 <= -1.42938 )
							ret := -0.571429
						if( ema13 > -1.42938 )
							ret := 0.666667
				if( ema3 > 41.3219 )
					if( ema12 <= -0.875099 )
						if( ema1 <= 38.3126 )
							ret := 1.000000 // buy
						if( ema1 > 38.3126 )
							ret := -0.521277
					if( ema12 > -0.875099 )
						if( tema <= 41.4174 )
							ret := 0.614035
						if( tema > 41.4174 )
							ret := -0.705882 // sell
			if( ema1 > 43.2099 )
				if( ema13 <= -2.93251 )
					ret := -0.066667
				if( ema13 > -2.93251 )
					if( tema <= 43.664 )
						if( ema13 <= -1.72196 )
							ret := 0.690476
						if( ema13 > -1.72196 )
							ret := 0.923077 // buy
					if( tema > 43.664 )
						if( ema2 <= 45.8252 )
							ret := -0.062500
						if( ema2 > 45.8252 )
							ret := 0.666667
		if( ema13 > -1.34025 )
			if( ema12 <= -0.649377 )
				if( ema3 <= 44.5539 )
					if( ema2 <= 42.0678 )
						if( ema3 <= 40.8114 )
							ret := -0.698113
						if( ema3 > 40.8114 )
							ret := 0.190476
					if( ema2 > 42.0678 )
						if( ema12 <= -0.716558 )
							ret := -0.750000 // sell
						if( ema12 > -0.716558 )
							ret := -1.000000 // sell
				if( ema3 > 44.5539 )
					ret := 0.538462
			if( ema12 > -0.649377 )
				if( ema12 <= 0.301302 )
					if( ema13 <= -0.284375 )
						if( ema13 <= -0.633265 )
							ret := 0.166102
						if( ema13 > -0.633265 )
							ret := -0.164062
					if( ema13 > -0.284375 )
						if( ema12 <= -0.005576 )
							ret := 0.232078
						if( ema12 > -0.005576 )
							ret := 0.080101
				if( ema12 > 0.301302 )
					if( tema <= 37.8517 )
						if( tema <= 37.1195 )
							ret := -0.153509
						if( tema > 37.1195 )
							ret := -0.637168
					if( tema > 37.8517 )
						if( ema3 <= 36.8493 )
							ret := 0.925373 // buy
						if( ema3 > 36.8493 )
							ret := -0.042433
	if( tema > 43.9559 )
		if( ema12 <= 1.60338 )
			if( ema13 <= -0.589638 )
				if( ema3 <= 73.3276 )
					if( tema <= 46.1423 )
						if( ema12 <= -0.334472 )
							ret := -0.282167
						if( ema12 > -0.334472 )
							ret := 0.340909
					if( tema > 46.1423 )
						if( ema13 <= -3.18045 )
							ret := -0.717949 // sell
						if( ema13 > -3.18045 )
							ret := 0.152740
				if( ema3 > 73.3276 )
					if( tema <= 73.5247 )
						if( ema12 <= -0.420666 )
							ret := -0.355072
						if( ema12 > -0.420666 )
							ret := -0.828947 // sell
					if( tema > 73.5247 )
						if( ema2 <= 75.4844 )
							ret := 0.781250 // buy
						if( ema2 > 75.4844 )
							ret := -0.040875
			if( ema13 > -0.589638 )
				if( tema <= 54.044 )
					if( ema3 <= 53.025 )
						if( ema1 <= 47.1274 )
							ret := 0.043992
						if( ema1 > 47.1274 )
							ret := -0.065628
					if( ema3 > 53.025 )
						if( ema12 <= -0.127031 )
							ret := 0.483146
						if( ema12 > -0.127031 )
							ret := 0.022491
				if( tema > 54.044 )
					if( tema <= 129.991 )
						if( ema12 <= 0.47572 )
							ret := -0.068591
						if( ema12 > 0.47572 )
							ret := -0.221890
					if( tema > 129.991 )
						if( ema2 <= 128.593 )
							ret := -0.363636
						if( ema2 > 128.593 )
							ret := -0.934783 // sell
		if( ema12 > 1.60338 )
			if( ema3 <= 50.6881 )
				if( tema <= 45.2242 )
					ret := 0.600000
				if( tema > 45.2242 )
					if( tema <= 49.9574 )
						ret := -0.375000
					if( tema > 49.9574 )
						ret := -1.000000 // sell
			if( ema3 > 50.6881 )
				if( tema <= 59.0468 )
					if( ema12 <= 2.18694 )
						ret := 1.000000 // buy
					if( ema12 > 2.18694 )
						ret := 0.909091 // buy
				if( tema > 59.0468 )
					if( tema <= 59.6568 )
						ret := -0.785714 // sell
					if( tema > 59.6568 )
						if( tema <= 124.818 )
							ret := 0.653333
						if( tema > 124.818 )
							ret := -0.285714
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_GTLB_15Min_adca292a(ema12, ema3, ema13, tema, ema1, ema2)

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


