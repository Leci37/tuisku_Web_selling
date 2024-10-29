//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: MATICUSDT_30Min_1T00_9b378be3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MATICUSDT_30Min_1T00_9b378be3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MATICUSDT_30Min_9b378be3(ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( ema12 <= -0.017235 )
		if( ema12 <= -0.038705 )
			if( ema13 <= -0.067077 )
				if( tema <= 1.92251 )
					if( ema12 <= -0.055193 )
						if( tema <= 1.06349 )
							ret := 0.000000
						if( tema > 1.06349 )
							if( ema13 <= -0.169018 )
								ret := 1.000000 // buy
							if( ema13 > -0.169018 )
								ret := 0.826667 // buy
					if( ema12 > -0.055193 )
						if( ema12 <= -0.048908 )
							if( tema <= 1.57068 )
								ret := -0.129630
							if( tema > 1.57068 )
								ret := 0.513514
						if( ema12 > -0.048908 )
							if( ema13 <= -0.08288 )
								ret := 0.732558 // buy
							if( ema13 > -0.08288 )
								ret := 0.329787
				if( tema > 1.92251 )
					if( ema3 <= 2.31792 )
						if( ema12 <= -0.046724 )
							if( ema3 <= 2.17372 )
								ret := -0.428571
							if( ema3 > 2.17372 )
								ret := -1.000000 // sell
						if( ema12 > -0.046724 )
							if( tema <= 2.16525 )
								ret := 0.437500
							if( tema > 2.16525 )
								ret := -0.714286 // sell
					if( ema3 > 2.31792 )
						if( ema1 <= 2.24385 )
							ret := 1.000000 // buy
						if( ema1 > 2.24385 )
							if( tema <= 2.32496 )
								ret := -0.533333
							if( tema > 2.32496 )
								ret := 0.850000 // buy
			if( ema13 > -0.067077 )
				if( ema12 <= -0.043563 )
					ret := 0.500000
				if( ema12 > -0.043563 )
					if( ema12 <= -0.042769 )
						ret := 0.750000 // buy
					if( ema12 > -0.042769 )
						if( ema2 <= 1.15401 )
							ret := 0.818182 // buy
						if( ema2 > 1.15401 )
							if( ema3 <= 1.83502 )
								ret := 1.000000 // buy
							if( ema3 > 1.83502 )
								ret := 0.875000 // buy
		if( ema12 > -0.038705 )
			if( ema1 <= 1.36632 )
				if( ema3 <= 0.917105 )
					if( ema13 <= -0.042419 )
						if( tema <= 0.561514 )
							if( ema1 <= 0.56727 )
								ret := 1.000000 // buy
							if( ema1 > 0.56727 )
								ret := 0.428571
						if( tema > 0.561514 )
							if( ema3 <= 0.846787 )
								ret := -0.461538
							if( ema3 > 0.846787 )
								ret := 0.419355
					if( ema13 > -0.042419 )
						if( ema3 <= 0.896278 )
							if( tema <= 0.59237 )
								ret := 1.000000 // buy
							if( tema > 0.59237 )
								ret := 0.590361
						if( ema3 > 0.896278 )
							if( ema13 <= -0.037347 )
								ret := 0.000000
							if( ema13 > -0.037347 )
								ret := -0.833333 // sell
				if( ema3 > 0.917105 )
					if( ema2 <= 1.0983 )
						if( ema3 <= 1.07624 )
							if( tema <= 1.00449 )
								ret := 0.687023
							if( tema > 1.00449 )
								ret := 0.000000
						if( ema3 > 1.07624 )
							if( ema12 <= -0.031429 )
								ret := 0.571429
							if( ema12 > -0.031429 )
								ret := 0.913043 // buy
					if( ema2 > 1.0983 )
						if( tema <= 1.0661 )
							if( ema13 <= -0.045637 )
								ret := -1.000000 // sell
							if( ema13 > -0.045637 )
								ret := -0.088235
						if( tema > 1.0661 )
							if( ema2 <= 1.3624 )
								ret := 0.348765
							if( ema2 > 1.3624 )
								ret := 0.857143 // buy
			if( ema1 > 1.36632 )
				if( tema <= 1.45852 )
					if( ema13 <= -0.037123 )
						if( ema2 <= 1.46631 )
							if( tema <= 1.39958 )
								ret := -0.740000 // sell
							if( tema > 1.39958 )
								ret := 0.833333 // buy
						if( ema2 > 1.46631 )
							if( ema2 <= 1.47218 )
								ret := -1.000000 // sell
							if( ema2 > 1.47218 )
								ret := -0.794118 // sell
					if( ema13 > -0.037123 )
						if( ema1 <= 1.47298 )
							if( ema13 <= -0.029023 )
								ret := 0.218182
							if( ema13 > -0.029023 )
								ret := 0.880000 // buy
						if( ema1 > 1.47298 )
							if( ema12 <= -0.01951 )
								ret := -1.000000 // sell
							if( ema12 > -0.01951 )
								ret := -0.714286 // sell
				if( tema > 1.45852 )
					if( ema13 <= -0.026386 )
						if( ema3 <= 1.74944 )
							if( ema13 <= -0.035078 )
								ret := 0.169550
							if( ema13 > -0.035078 )
								ret := 0.576923
						if( ema3 > 1.74944 )
							if( tema <= 1.69242 )
								ret := -0.897436 // sell
							if( tema > 1.69242 )
								ret := 0.064000
					if( ema13 > -0.026386 )
						if( ema2 <= 2.05603 )
							if( ema12 <= -0.02303 )
								ret := 1.000000 // buy
							if( ema12 > -0.02303 )
								ret := 0.698413
						if( ema2 > 2.05603 )
							if( ema2 <= 2.23804 )
								ret := -0.777778 // sell
							if( ema2 > 2.23804 )
								ret := 0.333333
	if( ema12 > -0.017235 )
		if( ema3 <= 0.367784 )
			if( ema3 <= 0.330681 )
				if( ema13 <= -0.001743 )
					if( ema2 <= 0.125948 )
						if( ema1 <= 0.027305 )
							if( ema3 <= 0.028662 )
								ret := 0.821429 // buy
							if( ema3 > 0.028662 )
								ret := -1.000000 // sell
						if( ema1 > 0.027305 )
							if( ema3 <= 0.103123 )
								ret := 0.964286 // buy
							if( ema3 > 0.103123 )
								ret := 0.690141
					if( ema2 > 0.125948 )
						if( ema3 <= 0.224863 )
							if( ema12 <= -0.005536 )
								ret := 0.843137 // buy
							if( ema12 > -0.005536 )
								ret := -0.123786
						if( ema3 > 0.224863 )
							if( ema3 <= 0.230259 )
								ret := 0.915493 // buy
							if( ema3 > 0.230259 )
								ret := 0.239521
				if( ema13 > -0.001743 )
					if( ema3 <= 0.10318 )
						if( ema2 <= 0.046437 )
							if( ema3 <= 0.04232 )
								ret := 0.090707
							if( ema3 > 0.04232 )
								ret := -0.456897
						if( ema2 > 0.046437 )
							if( ema1 <= 0.050931 )
								ret := 0.792793 // buy
							if( ema1 > 0.050931 )
								ret := 0.236220
					if( ema3 > 0.10318 )
						if( ema1 <= 0.168028 )
							if( ema3 <= 0.157497 )
								ret := -0.155975
							if( ema3 > 0.157497 )
								ret := -0.865385 // sell
						if( ema1 > 0.168028 )
							if( tema <= 0.189432 )
								ret := 0.455882
							if( tema > 0.189432 )
								ret := 0.011905
			if( ema3 > 0.330681 )
				if( ema13 <= 0.014468 )
					if( ema3 <= 0.342336 )
						if( tema <= 0.344903 )
							if( ema1 <= 0.321663 )
								ret := -0.428571
							if( ema1 > 0.321663 )
								ret := 0.694118
						if( tema > 0.344903 )
							if( ema3 <= 0.341313 )
								ret := -0.164384
							if( ema3 > 0.341313 )
								ret := 0.774194 // buy
					if( ema3 > 0.342336 )
						if( ema2 <= 0.346756 )
							if( ema12 <= 0.003954 )
								ret := -0.439759
							if( ema12 > 0.003954 )
								ret := 0.888889 // buy
						if( ema2 > 0.346756 )
							if( ema3 <= 0.363963 )
								ret := 0.413972
							if( ema3 > 0.363963 )
								ret := 0.190476
				if( ema13 > 0.014468 )
					if( ema1 <= 0.376981 )
						if( ema1 <= 0.364983 )
							if( ema3 <= 0.335206 )
								ret := -0.857143 // sell
							if( ema3 > 0.335206 )
								ret := -0.285714
						if( ema1 > 0.364983 )
							if( ema12 <= 0.008614 )
								ret := -0.714286 // sell
							if( ema12 > 0.008614 )
								ret := -1.000000 // sell
					if( ema1 > 0.376981 )
						ret := 0.500000
		if( ema3 > 0.367784 )
			if( ema3 <= 1.85904 )
				if( ema13 <= 0.072633 )
					if( ema2 <= 0.380229 )
						if( ema1 <= 0.377866 )
							if( ema2 <= 0.374905 )
								ret := -0.223382
							if( ema2 > 0.374905 )
								ret := 0.239362
						if( ema1 > 0.377866 )
							if( ema12 <= 0.003039 )
								ret := -0.762500 // sell
							if( ema12 > 0.003039 )
								ret := -0.122807
					if( ema2 > 0.380229 )
						if( ema3 <= 0.398806 )
							if( ema3 <= 0.386054 )
								ret := -0.019157
							if( ema3 > 0.386054 )
								ret := 0.362725
						if( ema3 > 0.398806 )
							if( ema1 <= 0.439727 )
								ret := -0.081443
							if( ema1 > 0.439727 )
								ret := 0.032530
				if( ema13 > 0.072633 )
					if( ema13 <= 0.118422 )
						if( ema2 <= 1.73444 )
							if( ema1 <= 1.74122 )
								ret := 0.682540
							if( ema1 > 1.74122 )
								ret := -1.000000 // sell
						if( ema2 > 1.73444 )
							if( tema <= 1.96454 )
								ret := 0.975610 // buy
							if( tema > 1.96454 )
								ret := 0.714286 // buy
					if( ema13 > 0.118422 )
						if( tema <= 1.43903 )
							if( ema2 <= 1.14686 )
								ret := 0.500000
							if( ema2 > 1.14686 )
								ret := 0.928571 // buy
						if( tema > 1.43903 )
							if( ema1 <= 1.91039 )
								ret := -0.255556
							if( ema1 > 1.91039 )
								ret := 0.842105 // buy
			if( ema3 > 1.85904 )
				if( ema2 <= 1.88095 )
					if( ema13 <= -0.029166 )
						if( ema2 <= 1.85223 )
							ret := 1.000000 // buy
						if( ema2 > 1.85223 )
							ret := 0.428571
					if( ema13 > -0.029166 )
						if( ema2 <= 1.87331 )
							if( ema2 <= 1.86026 )
								ret := -0.240000
							if( ema2 > 1.86026 )
								ret := -0.780000 // sell
						if( ema2 > 1.87331 )
							if( ema12 <= -0.007029 )
								ret := -1.000000 // sell
							if( ema12 > -0.007029 )
								ret := -0.170213
				if( ema2 > 1.88095 )
					if( ema13 <= 0.049276 )
						if( ema13 <= -0.027348 )
							if( ema1 <= 2.07136 )
								ret := -0.717391 // sell
							if( ema1 > 2.07136 )
								ret := 0.007692
						if( ema13 > -0.027348 )
							if( ema3 <= 2.16495 )
								ret := 0.045819
							if( ema3 > 2.16495 )
								ret := -0.084758
					if( ema13 > 0.049276 )
						if( ema13 <= 0.125283 )
							if( ema1 <= 2.20873 )
								ret := -0.610811
							if( ema1 > 2.20873 )
								ret := -0.176471
						if( ema13 > 0.125283 )
							if( ema2 <= 2.03993 )
								ret := 0.645161
							if( ema2 > 2.03993 )
								ret := -0.130435
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_MATICUSDT_30Min_9b378be3(ema12, ema3, ema13, tema, ema1, ema2)

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


