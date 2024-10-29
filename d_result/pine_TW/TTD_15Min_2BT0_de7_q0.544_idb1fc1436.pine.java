//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: TTD_15Min_2BT0_b1fc1436 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TTD_15Min_2BT0_b1fc1436", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TTD_15Min_b1fc1436(bbp, bullPower, BBPower_Color, bearPower, bbm, ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( tema <= 43.6769 )
		if( ema13 <= -0.494731 )
			if( tema <= 41.7281 )
				if( bbm <= 0.08995 )
					ret := -0.285714
				if( bbm > 0.08995 )
					if( bearPower <= -0.835911 )
						if( ema2 <= 42.8887 )
							if( bullPower <= -0.452594 )
								ret := 0.969231 // buy
							if( bullPower > -0.452594 )
								ret := 0.694444
						if( ema2 > 42.8887 )
							if( ema12 <= -1.10021 )
								ret := 0.823529 // buy
							if( ema12 > -1.10021 )
								ret := -0.727273 // sell
					if( bearPower > -0.835911 )
						if( ema12 <= -0.525853 )
							if( bbm <= 0.487702 )
								ret := -0.400000
							if( bbm > 0.487702 )
								ret := -1.000000 // sell
						if( ema12 > -0.525853 )
							if( tema <= 40.4843 )
								ret := 0.570370
							if( tema > 40.4843 )
								ret := 0.910714 // buy
			if( tema > 41.7281 )
				if( ema1 <= 43.45 )
					if( bbp <= -1.01639 )
						if( tema <= 42.5623 )
							if( ema2 <= 43.434 )
								ret := -0.583333
							if( ema2 > 43.434 )
								ret := -1.000000 // sell
						if( tema > 42.5623 )
							if( ema1 <= 43.3 )
								ret := 0.250000
							if( ema1 > 43.3 )
								ret := -0.750000 // sell
					if( bbp > -1.01639 )
						if( bbp <= -0.954127 )
							if( ema12 <= -0.320184 )
								ret := 0.625000
							if( ema12 > -0.320184 )
								ret := 1.000000 // buy
						if( bbp > -0.954127 )
							if( bbm <= 0.565 )
								ret := -0.222222
							if( bbm > 0.565 )
								ret := 0.714286 // buy
				if( ema1 > 43.45 )
					if( bbp <= -2.10334 )
						if( ema1 <= 44.0057 )
							ret := 0.400000
						if( ema1 > 44.0057 )
							if( bbm <= 0.35632 )
								ret := 0.600000
							if( bbm > 0.35632 )
								ret := 0.962264 // buy
					if( bbp > -2.10334 )
						if( ema1 <= 43.9853 )
							if( tema <= 43.0426 )
								ret := 0.000000
							if( tema > 43.0426 )
								ret := 0.676471
						if( ema1 > 43.9853 )
							if( ema3 <= 45.3601 )
								ret := -0.444444
							if( ema3 > 45.3601 )
								ret := 0.250000
		if( ema13 > -0.494731 )
			if( ema1 <= 27.7443 )
				if( bullPower <= 0.041234 )
					if( ema13 <= 0.013046 )
						if( ema2 <= 27.2285 )
							if( bbm <= 0.425996 )
								ret := 0.824074 // buy
							if( bbm > 0.425996 )
								ret := -0.333333
						if( ema2 > 27.2285 )
							if( ema2 <= 27.2895 )
								ret := -1.000000 // sell
							if( ema2 > 27.2895 )
								ret := 0.573171
					if( ema13 > 0.013046 )
						if( bearPower <= -0.247754 )
							ret := -0.857143 // sell
						if( bearPower > -0.247754 )
							if( ema13 <= 0.035412 )
								ret := 0.166667
							if( ema13 > 0.035412 )
								ret := 1.000000 // buy
				if( bullPower > 0.041234 )
					if( tema <= 27.0703 )
						if( ema13 <= 0.180192 )
							if( tema <= 25.9905 )
								ret := -0.700000 // sell
							if( tema > 25.9905 )
								ret := 0.087591
						if( ema13 > 0.180192 )
							if( bearPower <= 0.069095 )
								ret := -0.500000
							if( bearPower > 0.069095 )
								ret := -1.000000 // sell
					if( tema > 27.0703 )
						if( bbp <= 0.989693 )
							if( tema <= 27.6355 )
								ret := 0.433333
							if( tema > 27.6355 )
								ret := 0.861538 // buy
						if( bbp > 0.989693 )
							ret := -0.500000
			if( ema1 > 27.7443 )
				if( ema2 <= 28.241 )
					if( bbp <= 0.981017 )
						if( ema3 <= 27.7985 )
							if( ema13 <= 0.385338 )
								ret := 0.291667
							if( ema13 > 0.385338 )
								ret := -0.500000
						if( ema3 > 27.7985 )
							if( tema <= 27.5861 )
								ret := 0.250000
							if( tema > 27.5861 )
								ret := -0.611111
					if( bbp > 0.981017 )
						if( bearPower <= 0.396096 )
							if( ema3 <= 27.7642 )
								ret := -0.500000
							if( ema3 > 27.7642 )
								ret := -0.888889 // sell
						if( bearPower > 0.396096 )
							ret := -1.000000 // sell
				if( ema2 > 28.241 )
					if( bearPower <= -0.714108 )
						if( ema3 <= 37.4605 )
							if( ema3 <= 32.5358 )
								ret := 0.266667
							if( ema3 > 32.5358 )
								ret := -0.722222 // sell
						if( ema3 > 37.4605 )
							if( tema <= 42.7397 )
								ret := 0.908163 // buy
							if( tema > 42.7397 )
								ret := 0.233333
					if( bearPower > -0.714108 )
						if( ema12 <= 0.087632 )
							if( ema2 <= 36.4136 )
								ret := 0.156721
							if( ema2 > 36.4136 )
								ret := -0.134114
						if( ema12 > 0.087632 )
							if( ema2 <= 31.1323 )
								ret := -0.093366
							if( ema2 > 31.1323 )
								ret := 0.291151
	if( tema > 43.6769 )
		if( bullPower <= -0.098771 )
			if( bbm <= 0.548544 )
				if( ema2 <= 101.001 )
					if( tema <= 64.2111 )
						if( ema3 <= 63.6599 )
							if( ema12 <= -0.149551 )
								ret := 0.146528
							if( ema12 > -0.149551 )
								ret := -0.049128
						if( ema3 > 63.6599 )
							if( bbm <= 0.251338 )
								ret := 0.350365
							if( bbm > 0.251338 )
								ret := 0.694915
					if( tema > 64.2111 )
						if( ema2 <= 65.9354 )
							if( bbp <= -1.44706 )
								ret := -0.941176 // sell
							if( bbp > -1.44706 )
								ret := -0.385714
						if( ema2 > 65.9354 )
							if( ema3 <= 98.1013 )
								ret := 0.034240
							if( ema3 > 98.1013 )
								ret := -0.248963
				if( ema2 > 101.001 )
					if( ema2 <= 135.688 )
						if( ema1 <= 130.31 )
							if( ema2 <= 127.422 )
								ret := 0.389985
							if( ema2 > 127.422 )
								ret := -0.333333
						if( ema1 > 130.31 )
							if( bbm <= 0.425901 )
								ret := 0.873563 // buy
							if( bbm > 0.425901 )
								ret := 0.000000
					if( ema2 > 135.688 )
						if( ema1 <= 138.299 )
							if( ema1 <= 135.978 )
								ret := 0.200000
							if( ema1 > 135.978 )
								ret := -0.883721 // sell
						if( ema1 > 138.299 )
							if( bbp <= -12.1886 )
								ret := -0.184466
							if( bbp > -12.1886 )
								ret := 0.178687
			if( bbm > 0.548544 )
				if( ema1 <= 47.8203 )
					if( ema3 <= 45.1302 )
						if( ema1 <= 44.6021 )
							if( ema2 <= 44.4987 )
								ret := -0.600000
							if( ema2 > 44.4987 )
								ret := 0.866667 // buy
						if( ema1 > 44.6021 )
							ret := -1.000000 // sell
					if( ema3 > 45.1302 )
						if( bbm <= 1.2925 )
							if( ema3 <= 46.4954 )
								ret := -0.802632 // sell
							if( ema3 > 46.4954 )
								ret := -0.415842
						if( bbm > 1.2925 )
							if( ema3 <= 45.9446 )
								ret := -0.500000
							if( ema3 > 45.9446 )
								ret := 1.000000 // buy
				if( ema1 > 47.8203 )
					if( bullPower <= -16.7212 )
						if( tema <= 147.785 )
							ret := 1.000000 // buy
						if( tema > 147.785 )
							if( ema12 <= -22.1535 )
								ret := -0.940000 // sell
							if( ema12 > -22.1535 )
								ret := -0.416667
					if( bullPower > -16.7212 )
						if( ema2 <= 52.2555 )
							if( ema12 <= -0.659726 )
								ret := 0.747475 // buy
							if( ema12 > -0.659726 )
								ret := 0.119522
						if( ema2 > 52.2555 )
							if( ema2 <= 53.6108 )
								ret := -0.443350
							if( ema2 > 53.6108 )
								ret := 0.000000
		if( bullPower > -0.098771 )
			if( ema13 <= 1.25371 )
				if( bearPower <= 0.461975 )
					if( ema3 <= 49.1236 )
						if( ema2 <= 49.0304 )
							if( bearPower <= -0.378144 )
								ret := 0.227151
							if( bearPower > -0.378144 )
								ret := -0.002259
						if( ema2 > 49.0304 )
							if( bearPower <= 0.260513 )
								ret := 0.625000
							if( bearPower > 0.260513 )
								ret := -0.217391
					if( ema3 > 49.1236 )
						if( ema2 <= 65.3109 )
							if( ema2 <= 64.85 )
								ret := -0.079490
							if( ema2 > 64.85 )
								ret := -0.508671
						if( ema2 > 65.3109 )
							if( bbm <= 1.46089 )
								ret := -0.005019
							if( bbm > 1.46089 )
								ret := -0.091862
				if( bearPower > 0.461975 )
					if( tema <= 50.4461 )
						if( ema1 <= 43.5384 )
							if( ema2 <= 42.4631 )
								ret := -0.333333
							if( ema2 > 42.4631 )
								ret := 0.789474 // buy
						if( ema1 > 43.5384 )
							if( ema13 <= 0.306701 )
								ret := -0.802817 // sell
							if( ema13 > 0.306701 )
								ret := -0.356234
					if( tema > 50.4461 )
						if( ema12 <= 0.362565 )
							if( tema <= 85.7757 )
								ret := -0.362924
							if( tema > 85.7757 )
								ret := -0.173210
						if( ema12 > 0.362565 )
							if( ema2 <= 49.6578 )
								ret := 0.900000 // buy
							if( ema2 > 49.6578 )
								ret := -0.062965
			if( ema13 > 1.25371 )
				if( tema <= 845.704 )
					if( ema3 <= 827.952 )
						if( ema3 <= 810.876 )
							if( bearPower <= 2.5986 )
								ret := 0.030594
							if( bearPower > 2.5986 )
								ret := 0.119136
						if( ema3 > 810.876 )
							if( tema <= 825.128 )
								ret := -0.688525
							if( tema > 825.128 )
								ret := -0.243902
					if( ema3 > 827.952 )
						if( ema2 <= 839.135 )
							if( ema12 <= 2.22099 )
								ret := 0.977273 // buy
							if( ema12 > 2.22099 )
								ret := 0.333333
						if( ema2 > 839.135 )
							ret := -1.000000 // sell
				if( tema > 845.704 )
					if( bbp <= 7.95947 )
						if( ema3 <= 875.933 )
							if( ema1 <= 865.114 )
								ret := -0.019231
							if( ema1 > 865.114 )
								ret := -0.729730 // sell
						if( ema3 > 875.933 )
							if( tema <= 886.898 )
								ret := 0.928571 // buy
							if( tema > 886.898 )
								ret := -0.010753
					if( bbp > 7.95947 )
						if( ema2 <= 919.935 )
							if( ema3 <= 875.53 )
								ret := -0.516667
							if( ema3 > 875.53 )
								ret := -0.166667
						if( ema2 > 919.935 )
							if( ema13 <= 6.61771 )
								ret := -0.812500 // sell
							if( ema13 > 6.61771 )
								ret := 0.000000
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


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
float op_operation = decision_tree_0_TTD_15Min_b1fc1436(bbp, bullPower, BBPower_Color, bearPower, bbm, ema2, ema1, ema12, ema3, ema13, tema)

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


