//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: AAPL_5Min_1T00_f401b380 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAPL_5Min_1T00_f401b380", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAPL_5Min_f401b380(ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ema3 <= 169.69 )
		if( ema12 <= 0.316789 )
			if( ema12 <= -0.319423 )
				if( ema1 <= 165.84 )
					if( ema3 <= 166.742 )
						if( ema13 <= -0.785522 )
							if( ema1 <= 164.127 )
								ret := 1.000000 // buy
							if( ema1 > 164.127 )
								ret := 0.888889 // buy
						if( ema13 > -0.785522 )
							ret := 0.583333
					if( ema3 > 166.742 )
						ret := 0.200000
				if( ema1 > 165.84 )
					if( ema1 <= 168.813 )
						if( ema3 <= 168.742 )
							if( ema2 <= 168.114 )
								if( ema13 <= -0.960107 )
									ret := -0.538462
								if( ema13 > -0.960107 )
									ret := -0.909091 // sell
							if( ema2 > 168.114 )
								ret := 1.000000 // buy
						if( ema3 > 168.742 )
							if( ema12 <= -0.511887 )
								ret := -0.727273 // sell
							if( ema12 > -0.511887 )
								if( ema1 <= 168.453 )
									ret := -0.933333 // sell
								if( ema1 > 168.453 )
									ret := -1.000000 // sell
					if( ema1 > 168.813 )
						ret := 0.083333
			if( ema12 > -0.319423 )
				if( ema3 <= 168.752 )
					if( ema1 <= 168.867 )
						if( ema1 <= 163.697 )
							if( ema3 <= 163.696 )
								if( ema3 <= 163.545 )
									ret := 0.615385
								if( ema3 > 163.545 )
									ret := 0.882353 // buy
							if( ema3 > 163.696 )
								ret := 0.000000
						if( ema1 > 163.697 )
							if( ema13 <= -0.411185 )
								if( ema1 <= 167.18 )
									ret := 0.382716
								if( ema1 > 167.18 )
									ret := 0.648649
							if( ema13 > -0.411185 )
								if( ema13 <= -0.203825 )
									ret := -0.204301
								if( ema13 > -0.203825 )
									ret := 0.093090
					if( ema1 > 168.867 )
						if( ema13 <= 0.344219 )
							if( tema <= 169.225 )
								if( ema1 <= 168.91 )
									ret := -0.714286 // sell
								if( ema1 > 168.91 )
									ret := -0.978261 // sell
							if( tema > 169.225 )
								ret := -0.125000
						if( ema13 > 0.344219 )
							if( ema3 <= 168.728 )
								ret := 0.388889
							if( ema3 > 168.728 )
								ret := -0.600000
				if( ema3 > 168.752 )
					if( ema12 <= 0.030191 )
						if( ema13 <= -0.055015 )
							if( ema2 <= 168.974 )
								if( ema1 <= 168.662 )
									ret := 0.703390 // buy
								if( ema1 > 168.662 )
									ret := 0.246032
							if( ema2 > 168.974 )
								if( ema2 <= 169.558 )
									ret := -0.015351
								if( ema2 > 169.558 )
									ret := 0.716418 // buy
						if( ema13 > -0.055015 )
							if( ema2 <= 169.696 )
								if( ema13 <= -0.030073 )
									ret := 0.642857
								if( ema13 > -0.030073 )
									ret := 0.312169
							if( ema2 > 169.696 )
								ret := -0.666667
					if( ema12 > 0.030191 )
						if( ema1 <= 169.696 )
							if( ema1 <= 169.007 )
								if( ema13 <= 0.210428 )
									ret := 0.265625
								if( ema13 > 0.210428 )
									ret := 1.000000 // buy
							if( ema1 > 169.007 )
								if( ema1 <= 169.112 )
									ret := -0.423913
								if( ema1 > 169.112 )
									ret := 0.009119
						if( ema1 > 169.696 )
							if( ema12 <= 0.046258 )
								ret := -0.307692
							if( ema12 > 0.046258 )
								if( ema2 <= 169.574 )
									ret := 0.000000
								if( ema2 > 169.574 )
									ret := 0.606061
		if( ema12 > 0.316789 )
			if( ema13 <= 0.781286 )
				if( ema3 <= 165.494 )
					if( ema3 <= 164.99 )
						ret := -0.636364
					if( ema3 > 164.99 )
						ret := -1.000000 // sell
				if( ema3 > 165.494 )
					if( ema3 <= 167.1 )
						if( ema3 <= 166.1 )
							ret := -0.428571
						if( ema3 > 166.1 )
							ret := 0.111111
					if( ema3 > 167.1 )
						if( ema1 <= 168.622 )
							ret := -1.000000 // sell
						if( ema1 > 168.622 )
							if( ema3 <= 168.851 )
								ret := 0.100000
							if( ema3 > 168.851 )
								if( ema2 <= 169.723 )
									ret := -0.960000 // sell
								if( ema2 > 169.723 )
									ret := -0.529412
			if( ema13 > 0.781286 )
				if( tema <= 169.334 )
					if( ema3 <= 167.129 )
						if( ema13 <= 0.881651 )
							ret := 1.000000 // buy
						if( ema13 > 0.881651 )
							ret := 0.666667
					if( ema3 > 167.129 )
						ret := 1.000000 // buy
				if( tema > 169.334 )
					ret := -1.000000 // sell
	if( ema3 > 169.69 )
		if( ema12 <= -1.93396 )
			if( ema13 <= -6.12444 )
				ret := -1.000000 // sell
			if( ema13 > -6.12444 )
				ret := -0.750000 // sell
		if( ema12 > -1.93396 )
			if( ema3 <= 170.298 )
				if( ema1 <= 170.376 )
					if( ema1 <= 170.156 )
						if( tema <= 169.866 )
							if( tema <= 169.321 )
								if( ema3 <= 169.828 )
									ret := -0.134328
								if( ema3 > 169.828 )
									ret := -0.780220 // sell
							if( tema > 169.321 )
								if( ema12 <= -0.101688 )
									ret := 0.232824
								if( ema12 > -0.101688 )
									ret := -0.072816
						if( tema > 169.866 )
							if( ema12 <= 0.03562 )
								if( ema13 <= 0.024213 )
									ret := -0.395257
								if( ema13 > 0.024213 )
									ret := -0.038217
							if( ema12 > 0.03562 )
								if( ema1 <= 170.097 )
									ret := -0.605351
								if( ema1 > 170.097 )
									ret := -0.103448
					if( ema1 > 170.156 )
						if( tema <= 170.125 )
							if( tema <= 170.073 )
								ret := 0.375000
							if( tema > 170.073 )
								if( tema <= 170.106 )
									ret := 1.000000 // buy
								if( tema > 170.106 )
									ret := 0.900000 // buy
						if( tema > 170.125 )
							if( tema <= 170.389 )
								if( ema13 <= 0.004193 )
									ret := 0.517241
								if( ema13 > 0.004193 )
									ret := -0.327044
							if( tema > 170.389 )
								if( ema3 <= 170.217 )
									ret := 0.458333
								if( ema3 > 170.217 )
									ret := -0.500000
				if( ema1 > 170.376 )
					if( tema <= 170.7 )
						if( ema12 <= 0.061527 )
							ret := -1.000000 // sell
						if( ema12 > 0.061527 )
							if( tema <= 170.584 )
								if( ema1 <= 170.428 )
									ret := -0.090909
								if( ema1 > 170.428 )
									ret := -0.954545 // sell
							if( tema > 170.584 )
								if( ema13 <= 0.199632 )
									ret := -0.571429
								if( ema13 > 0.199632 )
									ret := -1.000000 // sell
					if( tema > 170.7 )
						if( ema12 <= 0.494845 )
							if( ema3 <= 170.013 )
								ret := 1.000000 // buy
							if( ema3 > 170.013 )
								ret := -0.125000
						if( ema12 > 0.494845 )
							ret := -0.952381 // sell
			if( ema3 > 170.298 )
				if( ema1 <= 171.049 )
					if( ema3 <= 171.134 )
						if( ema1 <= 170.548 )
							if( tema <= 170.477 )
								if( ema12 <= -0.065348 )
									ret := 0.290909
								if( ema12 > -0.065348 )
									ret := 0.029630
							if( tema > 170.477 )
								if( ema3 <= 170.333 )
									ret := -0.636364
								if( ema3 > 170.333 )
									ret := -0.150000
						if( ema1 > 170.548 )
							if( ema1 <= 170.639 )
								if( ema2 <= 170.668 )
									ret := 0.852941 // buy
								if( ema2 > 170.668 )
									ret := -0.800000 // sell
							if( ema1 > 170.639 )
								if( ema3 <= 170.483 )
									ret := -0.432432
								if( ema3 > 170.483 )
									ret := 0.453168
					if( ema3 > 171.134 )
						if( ema1 <= 170.463 )
							if( ema12 <= -0.831056 )
								ret := 0.923077 // buy
							if( ema12 > -0.831056 )
								if( ema3 <= 171.489 )
									ret := 0.071429
								if( ema3 > 171.489 )
									ret := 1.000000 // buy
						if( ema1 > 170.463 )
							if( tema <= 170.343 )
								if( tema <= 169.653 )
									ret := -0.666667
								if( tema > 169.653 )
									ret := -0.942857 // sell
							if( tema > 170.343 )
								if( ema1 <= 170.912 )
									ret := -0.307692
								if( ema1 > 170.912 )
									ret := 0.216000
				if( ema1 > 171.049 )
					if( ema3 <= 227.987 )
						if( tema <= 225.576 )
							if( ema12 <= -1.09897 )
								if( ema12 <= -1.21089 )
									ret := 0.442308
								if( ema12 > -1.21089 )
									ret := 0.862069 // buy
							if( ema12 > -1.09897 )
								if( ema2 <= 225.624 )
									ret := -0.009056
								if( ema2 > 225.624 )
									ret := -0.311741
						if( tema > 225.576 )
							if( ema12 <= -0.077592 )
								if( ema3 <= 227.201 )
									ret := 0.120690
								if( ema3 > 227.201 )
									ret := 0.512658
							if( ema12 > -0.077592 )
								if( ema3 <= 225.332 )
									ret := 0.544444
								if( ema3 > 225.332 )
									ret := 0.018549
					if( ema3 > 227.987 )
						if( ema13 <= 1.43719 )
							if( ema1 <= 227.574 )
								if( ema1 <= 227.055 )
									ret := -0.472222
								if( ema1 > 227.055 )
									ret := -0.869565 // sell
							if( ema1 > 227.574 )
								if( ema1 <= 227.834 )
									ret := 0.730769 // buy
								if( ema1 > 227.834 )
									ret := -0.089470
						if( ema13 > 1.43719 )
							if( ema1 <= 233.968 )
								ret := 1.000000 // buy
							if( ema1 > 233.968 )
								ret := 0.071429
	
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
float op_operation = decision_tree_0_AAPL_5Min_f401b380(ema3, tema, ema2, ema12, ema13, ema1)

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


