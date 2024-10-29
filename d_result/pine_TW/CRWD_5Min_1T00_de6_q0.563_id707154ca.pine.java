//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: CRWD_5Min_1T00_707154ca Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_5Min_1T00_707154ca", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_5Min_707154ca(ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( ema12 <= 0.077894 )
		if( ema13 <= -1.13069 )
			if( ema1 <= 160.951 )
				if( ema3 <= 157.04 )
					if( tema <= 122.867 )
						if( tema <= 122.359 )
							ret := 0.846154 // buy
						if( tema > 122.359 )
							ret := 1.000000 // buy
					if( tema > 122.867 )
						if( ema2 <= 155.839 )
							ret := -0.281667
						if( ema2 > 155.839 )
							ret := 0.950000 // buy
				if( ema3 > 157.04 )
					if( ema1 <= 158.395 )
						if( ema2 <= 157.126 )
							ret := -0.641026
						if( ema2 > 157.126 )
							ret := -0.943182 // sell
					if( ema1 > 158.395 )
						if( ema3 <= 161.021 )
							ret := 0.666667
						if( ema3 > 161.021 )
							ret := -0.909091 // sell
			if( ema1 > 160.951 )
				if( ema3 <= 234.194 )
					if( ema2 <= 229.132 )
						if( ema1 <= 226.63 )
							ret := 0.153409
						if( ema1 > 226.63 )
							ret := -0.878788 // sell
					if( ema2 > 229.132 )
						if( ema12 <= -1.17787 )
							ret := 0.148936
						if( ema12 > -1.17787 )
							ret := 0.849057 // buy
				if( ema3 > 234.194 )
					if( ema12 <= -2.01256 )
						if( ema1 <= 267.919 )
							ret := -0.656250
						if( ema1 > 267.919 )
							ret := -0.165552
					if( ema12 > -2.01256 )
						if( ema1 <= 234.535 )
							ret := -0.805970 // sell
						if( ema1 > 234.535 )
							ret := -0.005311
		if( ema13 > -1.13069 )
			if( ema3 <= 319.039 )
				if( tema <= 123.677 )
					if( ema3 <= 122.459 )
						if( ema2 <= 118.812 )
							ret := 0.338983
						if( ema2 > 118.812 )
							ret := -0.107955
					if( ema3 > 122.459 )
						if( ema3 <= 124.193 )
							ret := 0.715847 // buy
						if( ema3 > 124.193 )
							ret := -0.222222
				if( tema > 123.677 )
					if( tema <= 315.581 )
						if( ema2 <= 123.848 )
							ret := -0.842105 // sell
						if( ema2 > 123.848 )
							ret := 0.074284
					if( tema > 315.581 )
						if( ema13 <= 0.078197 )
							ret := 0.482500
						if( ema13 > 0.078197 )
							ret := -0.090909
			if( ema3 > 319.039 )
				if( tema <= 336.942 )
					if( ema2 <= 330.783 )
						if( tema <= 329.456 )
							ret := -0.173290
						if( tema > 329.456 )
							ret := 0.651163
					if( ema2 > 330.783 )
						if( ema3 <= 332.466 )
							ret := -0.665306
						if( ema3 > 332.466 )
							ret := -0.105263
				if( tema > 336.942 )
					if( ema1 <= 389.515 )
						if( ema1 <= 339.503 )
							ret := 0.900000 // buy
						if( ema1 > 339.503 )
							ret := 0.064192
					if( ema1 > 389.515 )
						if( ema13 <= -0.680956 )
							ret := 0.071429
						if( ema13 > -0.680956 )
							ret := -0.678832
	if( ema12 > 0.077894 )
		if( ema1 <= 118.903 )
			if( ema1 <= 118.221 )
				if( ema1 <= 117.438 )
					if( ema3 <= 117.023 )
						if( ema1 <= 117.077 )
							ret := 0.000000
						if( ema1 > 117.077 )
							ret := -0.111111
					if( ema3 > 117.023 )
						ret := -1.000000 // sell
				if( ema1 > 117.438 )
					if( tema <= 118.4 )
						if( ema2 <= 117.793 )
							ret := 0.166667
						if( ema2 > 117.793 )
							ret := 0.727273 // buy
					if( tema > 118.4 )
						ret := -0.166667
			if( ema1 > 118.221 )
				if( ema13 <= 0.207051 )
					if( ema3 <= 118.711 )
						ret := -0.133333
					if( ema3 > 118.711 )
						ret := -1.000000 // sell
				if( ema13 > 0.207051 )
					if( ema13 <= 0.458879 )
						if( ema13 <= 0.229617 )
							ret := -0.923077 // sell
						if( ema13 > 0.229617 )
							ret := -1.000000 // sell
					if( ema13 > 0.458879 )
						if( ema13 <= 0.616752 )
							ret := -0.500000
						if( ema13 > 0.616752 )
							ret := -1.000000 // sell
		if( ema1 > 118.903 )
			if( ema3 <= 330.003 )
				if( tema <= 333.635 )
					if( ema3 <= 198.341 )
						if( ema2 <= 154.774 )
							ret := -0.011168
						if( ema2 > 154.774 )
							ret := -0.137722
					if( ema3 > 198.341 )
						if( ema1 <= 201.021 )
							ret := 0.654206
						if( ema1 > 201.021 )
							ret := -0.010640
				if( tema > 333.635 )
					if( ema12 <= 2.33262 )
						ret := 1.000000 // buy
					if( ema12 > 2.33262 )
						if( ema3 <= 325.246 )
							ret := 1.000000 // buy
						if( ema3 > 325.246 )
							ret := 0.454545
			if( ema3 > 330.003 )
				if( ema12 <= 2.20571 )
					if( ema12 <= 1.40678 )
						if( ema3 <= 391.077 )
							ret := -0.154968
						if( ema3 > 391.077 )
							ret := -0.728814 // sell
					if( ema12 > 1.40678 )
						if( tema <= 348.304 )
							ret := -0.072464
						if( tema > 348.304 )
							ret := 0.461165
				if( ema12 > 2.20571 )
					if( ema12 <= 9.80632 )
						if( ema13 <= 5.48822 )
							ret := -0.500000
						if( ema13 > 5.48822 )
							ret := -0.887640 // sell
					if( ema12 > 9.80632 )
						ret := 0.529412
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_CRWD_5Min_707154ca(ema12, ema3, ema13, tema, ema1, ema2)

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


