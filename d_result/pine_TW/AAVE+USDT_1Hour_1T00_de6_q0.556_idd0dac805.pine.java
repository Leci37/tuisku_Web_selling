//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: AAVEUSDT_1Hour_1T00_d0dac805 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAVEUSDT_1Hour_1T00_d0dac805", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAVEUSDT_1Hour_d0dac805(ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( ema1 <= 455.182 )
		if( ema2 <= 437.344 )
			if( ema1 <= 399.495 )
				if( ema1 <= 395.778 )
					if( ema12 <= -0.906267 )
						if( ema2 <= 153.929 )
							ret := 0.154955
						if( ema2 > 153.929 )
							ret := 0.017308
					if( ema12 > -0.906267 )
						if( ema3 <= 84.7394 )
							ret := 0.032501
						if( ema3 > 84.7394 )
							ret := -0.025509
				if( ema1 > 395.778 )
					if( tema <= 392.76 )
						ret := -0.235294
					if( tema > 392.76 )
						if( ema12 <= 4.02155 )
							ret := 0.698630
						if( ema12 > 4.02155 )
							ret := 0.200000
			if( ema1 > 399.495 )
				if( tema <= 402.922 )
					if( ema12 <= -2.65347 )
						if( tema <= 391.549 )
							ret := -0.400000
						if( tema > 391.549 )
							ret := -0.875000 // sell
					if( ema12 > -2.65347 )
						if( tema <= 402.288 )
							ret := -0.111111
						if( tema > 402.288 )
							ret := -0.920000 // sell
				if( tema > 402.922 )
					if( ema1 <= 429.13 )
						if( tema <= 423.841 )
							ret := -0.165625
						if( tema > 423.841 )
							ret := 0.496644
					if( ema1 > 429.13 )
						if( ema13 <= 1.01155 )
							ret := -0.820896 // sell
						if( ema13 > 1.01155 )
							ret := -0.373016
		if( ema2 > 437.344 )
			if( ema3 <= 441.177 )
				if( ema2 <= 439.344 )
					if( ema1 <= 440.249 )
						if( ema12 <= -0.021267 )
							ret := 0.363636
						if( ema12 > -0.021267 )
							ret := 0.894737 // buy
					if( ema1 > 440.249 )
						ret := 0.000000
				if( ema2 > 439.344 )
					if( ema13 <= 9.12884 )
						ret := 1.000000 // buy
					if( ema13 > 9.12884 )
						ret := 0.625000
			if( ema3 > 441.177 )
				if( ema13 <= -15.1813 )
					if( ema1 <= 430.612 )
						if( ema1 <= 426.243 )
							ret := 1.000000 // buy
						if( ema1 > 426.243 )
							ret := -0.272727
					if( ema1 > 430.612 )
						if( tema <= 437.227 )
							ret := 0.966667 // buy
						if( tema > 437.227 )
							ret := 0.666667
				if( ema13 > -15.1813 )
					if( ema13 <= -4.44597 )
						if( tema <= 444.668 )
							ret := 0.006452
						if( tema > 444.668 )
							ret := 0.878049 // buy
					if( ema13 > -4.44597 )
						if( ema12 <= 4.06776 )
							ret := -0.302083
						if( ema12 > 4.06776 )
							ret := 0.750000 // buy
	if( ema1 > 455.182 )
		if( tema <= 470.924 )
			if( ema3 <= 447.171 )
				ret := 0.875000 // buy
			if( ema3 > 447.171 )
				if( ema3 <= 457.052 )
					if( ema13 <= 11.3618 )
						ret := -1.000000 // sell
					if( ema13 > 11.3618 )
						if( ema13 <= 12.3533 )
							ret := -0.600000
						if( ema13 > 12.3533 )
							ret := -0.909091 // sell
				if( ema3 > 457.052 )
					if( ema2 <= 459.021 )
						if( ema1 <= 456.719 )
							ret := 0.200000
						if( ema1 > 456.719 )
							ret := 1.000000 // buy
					if( ema2 > 459.021 )
						if( ema12 <= -7.58811 )
							ret := -0.226415
						if( ema12 > -7.58811 )
							ret := -0.705882 // sell
		if( tema > 470.924 )
			if( ema3 <= 492.529 )
				if( ema1 <= 480.356 )
					if( ema1 <= 472.212 )
						if( ema13 <= 18.2324 )
							ret := 0.315789
						if( ema13 > 18.2324 )
							ret := -0.371429
					if( ema1 > 472.212 )
						if( ema3 <= 468.615 )
							ret := -0.360000
						if( ema3 > 468.615 )
							ret := -1.000000 // sell
				if( ema1 > 480.356 )
					if( ema1 <= 502.201 )
						if( ema12 <= 1.16173 )
							ret := 0.465116
						if( ema12 > 1.16173 )
							ret := 0.923077 // buy
					if( ema1 > 502.201 )
						if( tema <= 523.563 )
							ret := -0.833333 // sell
						if( tema > 523.563 )
							ret := 0.785714 // buy
			if( ema3 > 492.529 )
				if( ema12 <= -9.24963 )
					if( ema1 <= 561.611 )
						if( ema3 <= 559.747 )
							ret := 0.894737 // buy
						if( ema3 > 559.747 )
							ret := -0.714286 // sell
					if( ema1 > 561.611 )
						ret := 1.000000 // buy
				if( ema12 > -9.24963 )
					if( ema3 <= 514.906 )
						if( ema1 <= 487.666 )
							ret := 0.733333 // buy
						if( ema1 > 487.666 )
							ret := -0.808511 // sell
					if( ema3 > 514.906 )
						if( ema1 <= 521.569 )
							ret := 0.417910
						if( ema1 > 521.569 )
							ret := -0.363363
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
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
float op_operation = decision_tree_0_AAVEUSDT_1Hour_d0dac805(ema3, tema, ema2, ema12, ema13, ema1)

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


