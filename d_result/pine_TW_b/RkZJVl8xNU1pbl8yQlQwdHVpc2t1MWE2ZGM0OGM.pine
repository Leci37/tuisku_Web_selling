//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: FFIV_15Min_2BT0_1a6dc48c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_FFIV_15Min_2BT0_1a6dc48c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_FFIV_15Min_1a6dc48c(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema3 <= 143.865 )
		if( ema3 <= 90.7872 )
			if( ema3 <= 87.5889 )
				ret := 0.500000
			if( ema3 > 87.5889 )
				ret := 1.000000 // buy
		if( ema3 > 90.7872 )
			if( bearPower <= 0.825891 )
				if( bullPower <= 0.511195 )
					if( ema3 <= 117.962 )
						if( ema13 <= -1.16534 )
							if( ema12 <= -1.43001 )
								if( ema1 <= 100.182 )
									ret := 0.870968 // buy
								if( ema1 > 100.182 )
									ret := -0.500000
							if( ema12 > -1.43001 )
								if( ema2 <= 116.332 )
									ret := -0.503356
								if( ema2 > 116.332 )
									ret := 0.714286 // buy
						if( ema13 > -1.16534 )
							if( bearPower <= -0.682908 )
								if( ema2 <= 99.0563 )
									ret := -0.400000
								if( ema2 > 99.0563 )
									ret := 0.618677
							if( bearPower > -0.682908 )
								if( tema <= 117.127 )
									ret := 0.153199
								if( tema > 117.127 )
									ret := 0.507692
					if( ema3 > 117.962 )
						if( ema1 <= 116.986 )
							if( bearPower <= -1.12788 )
								ret := -1.000000 // sell
							if( bearPower > -1.12788 )
								ret := -0.750000 // sell
						if( ema1 > 116.986 )
							if( ema13 <= -3.61171 )
								if( ema2 <= 135.93 )
									ret := -0.777778 // sell
								if( ema2 > 135.93 )
									ret := 0.193548
							if( ema13 > -3.61171 )
								if( ema12 <= -1.67456 )
									ret := 0.600000
								if( ema12 > -1.67456 )
									ret := 0.063471
				if( bullPower > 0.511195 )
					if( ema1 <= 101.87 )
						if( ema1 <= 100.42 )
							if( tema <= 98.6215 )
								if( bullPower <= 0.795465 )
									ret := -0.750000 // sell
								if( bullPower > 0.795465 )
									ret := -1.000000 // sell
							if( tema > 98.6215 )
								if( bullPower <= 2.51619 )
									ret := 0.586957
								if( bullPower > 2.51619 )
									ret := -0.846154 // sell
						if( ema1 > 100.42 )
							if( ema12 <= 0.007268 )
								ret := 0.000000
							if( ema12 > 0.007268 )
								if( bearPower <= -1.3275 )
									ret := -0.714286 // sell
								if( bearPower > -1.3275 )
									ret := -0.978723 // sell
					if( ema1 > 101.87 )
						if( ema3 <= 141.674 )
							if( bearPower <= 0.245832 )
								if( ema2 <= 139.197 )
									ret := 0.317365
								if( ema2 > 139.197 )
									ret := -0.024096
							if( bearPower > 0.245832 )
								if( ema13 <= 1.44415 )
									ret := 0.061079
								if( ema13 > 1.44415 )
									ret := 0.449495
						if( ema3 > 141.674 )
							if( tema <= 142.845 )
								if( bbp <= 1.38942 )
									ret := 0.711864 // buy
								if( bbp > 1.38942 )
									ret := -0.142857
							if( tema > 142.845 )
								if( ema1 <= 144.244 )
									ret := 0.330671
								if( ema1 > 144.244 )
									ret := -0.007463
			if( bearPower > 0.825891 )
				if( ema12 <= 1.59251 )
					if( bbm <= 1.30781 )
						if( bbm <= 0.199397 )
							if( bullPower <= 2.92426 )
								if( ema3 <= 100.193 )
									ret := 0.714286 // buy
								if( ema3 > 100.193 )
									ret := -0.579710
							if( bullPower > 2.92426 )
								if( tema <= 136.178 )
									ret := 0.000000
								if( tema > 136.178 )
									ret := 1.000000 // buy
						if( bbm > 0.199397 )
							if( ema12 <= 0.972211 )
								if( ema13 <= 0.188524 )
									ret := -0.750000 // sell
								if( ema13 > 0.188524 )
									ret := -0.023454
							if( ema12 > 0.972211 )
								if( bearPower <= 1.03302 )
									ret := 0.409091
								if( bearPower > 1.03302 )
									ret := -0.482906
					if( bbm > 1.30781 )
						if( ema3 <= 105.772 )
							if( bbp <= 4.38753 )
								ret := 0.500000
							if( bbp > 4.38753 )
								if( bearPower <= 1.77796 )
									ret := -1.000000 // sell
								if( bearPower > 1.77796 )
									ret := -0.714286 // sell
						if( ema3 > 105.772 )
							if( tema <= 142.952 )
								if( bbm <= 1.80812 )
									ret := 0.250000
								if( bbm > 1.80812 )
									ret := 0.840000 // buy
							if( tema > 142.952 )
								if( bullPower <= 3.34892 )
									ret := 0.166667
								if( bullPower > 3.34892 )
									ret := -1.000000 // sell
				if( ema12 > 1.59251 )
					if( tema <= 147.729 )
						if( ema1 <= 135.899 )
							if( ema12 <= 1.82337 )
								if( ema3 <= 131.101 )
									ret := 0.787879 // buy
								if( ema3 > 131.101 )
									ret := -0.428571
							if( ema12 > 1.82337 )
								if( ema13 <= 3.07422 )
									ret := 0.666667
								if( ema13 > 3.07422 )
									ret := -0.826087 // sell
						if( ema1 > 135.899 )
							if( ema13 <= 4.48465 )
								if( ema13 <= 4.11313 )
									ret := 0.580645
								if( ema13 > 4.11313 )
									ret := -0.800000 // sell
							if( ema13 > 4.48465 )
								if( ema2 <= 142.852 )
									ret := 1.000000 // buy
								if( ema2 > 142.852 )
									ret := 0.750000 // buy
					if( tema > 147.729 )
						if( ema3 <= 143.159 )
							if( ema13 <= 4.35332 )
								ret := -0.250000
							if( ema13 > 4.35332 )
								if( bearPower <= 2.91196 )
									ret := -0.500000
								if( bearPower > 2.91196 )
									ret := -1.000000 // sell
						if( ema3 > 143.159 )
							ret := 0.714286 // buy
	if( ema3 > 143.865 )
		if( bbp <= 5.05516 )
			if( ema2 <= 144.425 )
				if( ema13 <= -1.10303 )
					if( bbm <= 0.383854 )
						if( bbm <= 0.325 )
							if( bearPower <= -1.43374 )
								if( ema3 <= 144.655 )
									ret := -1.000000 // sell
								if( ema3 > 144.655 )
									ret := 0.000000
							if( bearPower > -1.43374 )
								if( bullPower <= -0.638737 )
									ret := 0.000000
								if( bullPower > -0.638737 )
									ret := -0.250000
						if( bbm > 0.325 )
							if( ema2 <= 143.623 )
								ret := 1.000000 // buy
							if( ema2 > 143.623 )
								ret := -0.200000
					if( bbm > 0.383854 )
						if( ema3 <= 145.655 )
							if( bearPower <= -2.65551 )
								if( bbp <= -7.12786 )
									ret := -0.250000
								if( bbp > -7.12786 )
									ret := -0.952381 // sell
							if( bearPower > -2.65551 )
								if( bearPower <= -1.47521 )
									ret := -0.232558
								if( bearPower > -1.47521 )
									ret := -0.781818 // sell
						if( ema3 > 145.655 )
							ret := 0.400000
				if( ema13 > -1.10303 )
					if( bullPower <= -0.194813 )
						if( bearPower <= -1.56763 )
							if( ema2 <= 144.167 )
								ret := -0.600000
							if( ema2 > 144.167 )
								ret := -1.000000 // sell
						if( bearPower > -1.56763 )
							if( tema <= 142.875 )
								if( bbm <= 0.47 )
									ret := -0.520000
								if( bbm > 0.47 )
									ret := 0.695652
							if( tema > 142.875 )
								if( ema3 <= 143.928 )
									ret := -0.375000
								if( ema3 > 143.928 )
									ret := 0.612403
					if( bullPower > -0.194813 )
						if( bullPower <= 0.10745 )
							if( bbp <= -0.454264 )
								if( bearPower <= -0.911454 )
									ret := -0.812500 // sell
								if( bearPower > -0.911454 )
									ret := -0.166667
							if( bbp > -0.454264 )
								if( ema12 <= -0.045389 )
									ret := 0.250000
								if( ema12 > -0.045389 )
									ret := -0.344828
						if( bullPower > 0.10745 )
							if( ema13 <= -0.32375 )
								if( ema12 <= -0.303088 )
									ret := -1.000000 // sell
								if( ema12 > -0.303088 )
									ret := 0.290323
							if( ema13 > -0.32375 )
								if( bearPower <= 0.417263 )
									ret := -0.460317
								if( bearPower > 0.417263 )
									ret := 0.000000
			if( ema2 > 144.425 )
				if( ema3 <= 237.645 )
					if( ema1 <= 236.583 )
						if( ema13 <= -0.087157 )
							if( ema2 <= 166.266 )
								if( tema <= 151.247 )
									ret := 0.082768
								if( tema > 151.247 )
									ret := -0.048077
							if( ema2 > 166.266 )
								if( ema1 <= 234.024 )
									ret := 0.094111
								if( ema1 > 234.024 )
									ret := -0.426966
						if( ema13 > -0.087157 )
							if( ema2 <= 148.506 )
								if( ema1 <= 146.903 )
									ret := 0.024267
								if( ema1 > 146.903 )
									ret := -0.172120
							if( ema2 > 148.506 )
								if( ema3 <= 150.634 )
									ret := 0.257231
								if( ema3 > 150.634 )
									ret := 0.012811
					if( ema1 > 236.583 )
						if( ema13 <= 0.871624 )
							if( bbp <= 0.700422 )
								if( ema3 <= 236.469 )
									ret := 0.000000
								if( ema3 > 236.469 )
									ret := 1.000000 // buy
							if( bbp > 0.700422 )
								ret := 0.000000
						if( ema13 > 0.871624 )
							if( ema12 <= 1.19866 )
								if( ema12 <= 0.953514 )
									ret := 0.705882 // buy
								if( ema12 > 0.953514 )
									ret := 1.000000 // buy
							if( ema12 > 1.19866 )
								if( bearPower <= 1.24212 )
									ret := 1.000000 // buy
								if( bearPower > 1.24212 )
									ret := 0.000000
				if( ema3 > 237.645 )
					if( bullPower <= 0.658513 )
						if( ema1 <= 239.726 )
							if( bullPower <= -0.851174 )
								if( bearPower <= -1.59658 )
									ret := -0.500000
								if( bearPower > -1.59658 )
									ret := 0.200000
							if( bullPower > -0.851174 )
								if( ema13 <= -1.14607 )
									ret := -0.945946 // sell
								if( ema13 > -1.14607 )
									ret := -0.571429
						if( ema1 > 239.726 )
							if( bearPower <= -0.757433 )
								if( tema <= 245.683 )
									ret := -0.259259
								if( tema > 245.683 )
									ret := 0.523810
							if( bearPower > -0.757433 )
								if( ema2 <= 242.171 )
									ret := 0.083333
								if( ema2 > 242.171 )
									ret := -0.583333
					if( bullPower > 0.658513 )
						if( bbm <= 0.840797 )
							if( ema2 <= 246.386 )
								if( ema12 <= 0.812758 )
									ret := 0.771429 // buy
								if( ema12 > 0.812758 )
									ret := 0.000000
							if( ema2 > 246.386 )
								ret := -0.800000 // sell
						if( bbm > 0.840797 )
							if( ema1 <= 240.833 )
								ret := 0.857143 // buy
							if( ema1 > 240.833 )
								if( ema13 <= 0.844264 )
									ret := 0.125000
								if( ema13 > 0.844264 )
									ret := -0.555556
		if( bbp > 5.05516 )
			if( ema2 <= 152.83 )
				if( tema <= 149.67 )
					if( bullPower <= 4.2727 )
						ret := -0.750000 // sell
					if( bullPower > 4.2727 )
						ret := -1.000000 // sell
				if( tema > 149.67 )
					if( ema13 <= 8.00048 )
						if( bbm <= 3.18 )
							if( bearPower <= 3.07059 )
								if( bbp <= 5.82941 )
									ret := 0.846154 // buy
								if( bbp > 5.82941 )
									ret := -0.500000
							if( bearPower > 3.07059 )
								ret := 1.000000 // buy
						if( bbm > 3.18 )
							if( ema12 <= 1.96295 )
								ret := 1.000000 // buy
							if( ema12 > 1.96295 )
								ret := -0.600000
					if( ema13 > 8.00048 )
						ret := -1.000000 // sell
			if( ema2 > 152.83 )
				if( ema12 <= 4.97993 )
					if( bearPower <= 5.34739 )
						if( ema13 <= 7.22388 )
							if( ema13 <= 5.56559 )
								if( ema13 <= 3.17606 )
									ret := -0.256281
								if( ema13 > 3.17606 )
									ret := -0.753086 // sell
							if( ema13 > 5.56559 )
								if( bbm <= 1.21 )
									ret := 0.652174
								if( bbm > 1.21 )
									ret := -0.125000
						if( ema13 > 7.22388 )
							ret := -1.000000 // sell
					if( bearPower > 5.34739 )
						if( ema2 <= 187.002 )
							ret := 0.250000
						if( ema2 > 187.002 )
							ret := 1.000000 // buy
				if( ema12 > 4.97993 )
					if( bearPower <= 12.755 )
						if( tema <= 205.481 )
							ret := -1.000000 // sell
						if( tema > 205.481 )
							ret := -0.500000
					if( bearPower > 12.755 )
						ret := -0.500000
	
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
float op_operation = decision_tree_0_FFIV_15Min_1a6dc48c(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)

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


