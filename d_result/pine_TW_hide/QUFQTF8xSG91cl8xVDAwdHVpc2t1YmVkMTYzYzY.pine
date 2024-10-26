//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: AAPL_1Hour_1T00_bed163c6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAPL_1Hour_1T00_bed163c6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAPL_1Hour_bed163c6(ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( tema <= 134.46 )
		if( ema12 <= 0.757806 )
			if( ema3 <= 109.723 )
				if( ema12 <= 0.505368 )
					if( ema13 <= 0.086702 )
						if( tema <= 108.547 )
							ret := 0.851852 // buy
						if( tema > 108.547 )
							ret := -0.692308
					if( ema13 > 0.086702 )
						if( ema3 <= 108.171 )
							ret := 0.000000
						if( ema3 > 108.171 )
							ret := 0.982456 // buy
				if( ema12 > 0.505368 )
					if( tema <= 110.028 )
						ret := -1.000000 // sell
					if( tema > 110.028 )
						ret := 1.000000 // buy
			if( ema3 > 109.723 )
				if( ema2 <= 112.2 )
					if( ema3 <= 111.026 )
						if( tema <= 106.03 )
							ret := 0.500000
						if( tema > 106.03 )
							ret := -0.853659 // sell
					if( ema3 > 111.026 )
						if( ema1 <= 110.927 )
							ret := 0.620690
						if( ema1 > 110.927 )
							ret := -1.000000 // sell
				if( ema2 > 112.2 )
					if( tema <= 113.903 )
						if( ema12 <= -0.62333 )
							ret := 0.464865
						if( ema12 > -0.62333 )
							ret := 0.839080 // buy
					if( tema > 113.903 )
						if( tema <= 132.233 )
							ret := 0.013472
						if( tema > 132.233 )
							ret := 0.302817
		if( ema12 > 0.757806 )
			if( ema1 <= 124.965 )
				if( ema3 <= 122.15 )
					if( ema13 <= 1.41702 )
						if( ema12 <= 0.905876 )
							ret := 0.121212
						if( ema12 > 0.905876 )
							ret := -0.764706 // sell
					if( ema13 > 1.41702 )
						if( ema3 <= 120.898 )
							ret := 0.673203
						if( ema3 > 120.898 )
							ret := -0.500000
				if( ema3 > 122.15 )
					if( ema13 <= 2.10885 )
						if( ema2 <= 123.906 )
							ret := 1.000000 // buy
						if( ema2 > 123.906 )
							ret := 0.666667
					if( ema13 > 2.10885 )
						ret := -1.000000 // sell
			if( ema1 > 124.965 )
				if( tema <= 128.277 )
					if( ema3 <= 123.213 )
						ret := -1.000000 // sell
					if( ema3 > 123.213 )
						if( ema2 <= 126.701 )
							ret := 0.050000
						if( ema2 > 126.701 )
							ret := -1.000000 // sell
				if( tema > 128.277 )
					if( ema3 <= 125.787 )
						ret := -0.500000
					if( ema3 > 125.787 )
						if( ema3 <= 127.484 )
							ret := 0.923077 // buy
						if( ema3 > 127.484 )
							ret := 0.333333
	if( tema > 134.46 )
		if( ema13 <= -5.11475 )
			if( ema12 <= -5.30169 )
				if( ema12 <= -20.214 )
					ret := -0.500000
				if( ema12 > -20.214 )
					if( ema13 <= -9.87276 )
						if( ema3 <= 216.842 )
							ret := 0.470588
						if( ema3 > 216.842 )
							ret := 0.975000 // buy
					if( ema13 > -9.87276 )
						if( ema13 <= -9.67972 )
							ret := -1.000000 // sell
						if( ema13 > -9.67972 )
							ret := 0.666667
			if( ema12 > -5.30169 )
				if( ema12 <= -4.1839 )
					if( ema2 <= 232.259 )
						ret := 0.909091 // buy
					if( ema2 > 232.259 )
						if( ema1 <= 265.963 )
							ret := -0.800000 // sell
						if( ema1 > 265.963 )
							ret := 0.075000
				if( ema12 > -4.1839 )
					if( tema <= 144.945 )
						if( tema <= 143.048 )
							ret := 0.500000
						if( tema > 143.048 )
							ret := -1.000000 // sell
					if( tema > 144.945 )
						if( ema1 <= 270.52 )
							ret := 0.833333 // buy
						if( ema1 > 270.52 )
							ret := 0.320988
		if( ema13 > -5.11475 )
			if( ema3 <= 135.102 )
				if( ema2 <= 133.927 )
					if( ema2 <= 132.805 )
						ret := 0.777778 // buy
					if( ema2 > 132.805 )
						if( ema2 <= 133.652 )
							ret := -0.307692
						if( ema2 > 133.652 )
							ret := 0.440000
				if( ema2 > 133.927 )
					if( ema12 <= 0.241516 )
						if( ema2 <= 135.082 )
							ret := -0.245902
						if( ema2 > 135.082 )
							ret := -0.863636 // sell
					if( ema12 > 0.241516 )
						if( ema2 <= 135.716 )
							ret := -0.774359 // sell
						if( ema2 > 135.716 )
							ret := 1.000000 // buy
			if( ema3 > 135.102 )
				if( ema3 <= 137.844 )
					if( ema3 <= 136.715 )
						if( ema13 <= -0.419637 )
							ret := -0.659574
						if( ema13 > -0.419637 )
							ret := 0.197309
					if( ema3 > 136.715 )
						if( tema <= 138.981 )
							ret := 0.877049 // buy
						if( tema > 138.981 )
							ret := 0.440678
				if( ema3 > 137.844 )
					if( ema1 <= 136.751 )
						ret := -1.000000 // sell
					if( ema1 > 136.751 )
						if( ema1 <= 500.773 )
							ret := -0.023422
						if( ema1 > 500.773 )
							ret := -0.574074
	
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
float op_operation = decision_tree_0_AAPL_1Hour_bed163c6(ema3, tema, ema2, ema12, ema13, ema1)

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


