//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: ETHUSDT_30Min_2BT0_2294f057 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETHUSDT_30Min_2BT0_2294f057", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETHUSDT_30Min_2294f057(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bbp <= -171.328 )
		if( tema <= 4020.64 )
			if( ema3 <= 3779.08 )
				if( ema2 <= 3703.75 )
					if( bbp <= -360.017 )
						if( bbp <= -507.436 )
							ret := 0.500000
						if( bbp > -507.436 )
							if( bbp <= -369.927 )
								ret := 1.000000 // buy
							if( bbp > -369.927 )
								ret := 0.750000 // buy
					if( bbp > -360.017 )
						if( tema <= 1928.09 )
							if( ema2 <= 1326.78 )
								ret := 0.333333
							if( ema2 > 1326.78 )
								if( ema12 <= -45.4212 )
									ret := 1.000000 // buy
								if( ema12 > -45.4212 )
									ret := 0.875000 // buy
						if( tema > 1928.09 )
							if( ema1 <= 3297.46 )
								if( ema2 <= 3149.5 )
									ret := 0.270677
								if( ema2 > 3149.5 )
									ret := -0.428571
							if( ema1 > 3297.46 )
								if( ema1 <= 3514.56 )
									ret := 0.698925
								if( ema1 > 3514.56 )
									ret := -0.222222
				if( ema2 > 3703.75 )
					if( ema2 <= 3733.36 )
						ret := -1.000000 // sell
					if( ema2 > 3733.36 )
						ret := -0.142857
			if( ema3 > 3779.08 )
				if( ema13 <= -43.1918 )
					if( ema13 <= -55.3187 )
						if( ema1 <= 4114.46 )
							if( ema1 <= 3959.06 )
								if( bbm <= 64.8569 )
									ret := 0.200000
								if( bbm > 64.8569 )
									ret := 0.870370 // buy
							if( ema1 > 3959.06 )
								if( tema <= 4015.43 )
									ret := 0.982143 // buy
								if( tema > 4015.43 )
									ret := 0.750000 // buy
						if( ema1 > 4114.46 )
							ret := 0.500000
					if( ema13 > -55.3187 )
						if( ema12 <= -38.6875 )
							ret := 0.400000
						if( ema12 > -38.6875 )
							ret := 0.800000 // buy
				if( ema13 > -43.1918 )
					ret := 0.000000
		if( tema > 4020.64 )
			if( tema <= 4519.47 )
				if( ema2 <= 4460.51 )
					if( tema <= 4165.72 )
						if( ema2 <= 4199.85 )
							if( bullPower <= -41.6284 )
								ret := -0.250000
							if( bullPower > -41.6284 )
								ret := -1.000000 // sell
						if( ema2 > 4199.85 )
							ret := -1.000000 // sell
					if( tema > 4165.72 )
						if( tema <= 4229.93 )
							ret := 0.666667
						if( tema > 4229.93 )
							ret := -0.250000
				if( ema2 > 4460.51 )
					if( bbp <= -268.683 )
						ret := -0.750000 // sell
					if( bbp > -268.683 )
						ret := -1.000000 // sell
			if( tema > 4519.47 )
				ret := 0.800000 // buy
	if( bbp > -171.328 )
		if( ema1 <= 1198.1 )
			if( bbm <= 11.3918 )
				if( ema3 <= 333.788 )
					if( ema3 <= 328.65 )
						if( ema3 <= 325.104 )
							ret := 1.000000 // buy
						if( ema3 > 325.104 )
							if( ema3 <= 327.037 )
								if( bullPower <= 1.19524 )
									ret := 0.250000
								if( bullPower > 1.19524 )
									ret := 0.000000
							if( ema3 > 327.037 )
								ret := 0.500000
					if( ema3 > 328.65 )
						if( ema2 <= 327.957 )
							ret := 0.500000
						if( ema2 > 327.957 )
							if( bearPower <= 4.80779 )
								ret := 1.000000 // buy
							if( bearPower > 4.80779 )
								ret := 0.500000
				if( ema3 > 333.788 )
					if( ema3 <= 417.408 )
						if( ema2 <= 415.23 )
							if( bearPower <= -9.07251 )
								if( ema3 <= 364.315 )
									ret := -0.096774
								if( ema3 > 364.315 )
									ret := -0.648649
							if( bearPower > -9.07251 )
								if( bbm <= 4.602 )
									ret := 0.039706
								if( bbm > 4.602 )
									ret := -0.157754
						if( ema2 > 415.23 )
							if( bullPower <= -0.264024 )
								ret := -0.250000
							if( bullPower > -0.264024 )
								if( bbm <= 6.39982 )
									ret := -0.973684 // sell
								if( bbm > 6.39982 )
									ret := -0.777778 // sell
					if( ema3 > 417.408 )
						if( ema3 <= 559.548 )
							if( ema1 <= 447.252 )
								if( ema12 <= 0.368333 )
									ret := 0.728155 // buy
								if( ema12 > 0.368333 )
									ret := 0.375000
							if( ema1 > 447.252 )
								if( ema3 <= 473.425 )
									ret := 0.025547
								if( ema3 > 473.425 )
									ret := 0.364109
						if( ema3 > 559.548 )
							if( ema13 <= -3.4916 )
								if( ema3 <= 1201.75 )
									ret := 0.175505
								if( ema3 > 1201.75 )
									ret := 0.625000
							if( ema13 > -3.4916 )
								if( ema12 <= 0.681495 )
									ret := -0.096008
								if( ema12 > 0.681495 )
									ret := 0.066892
			if( bbm > 11.3918 )
				if( bbp <= 67.3005 )
					if( tema <= 1077.84 )
						if( tema <= 738.789 )
							if( ema3 <= 547.916 )
								if( bullPower <= -6.48217 )
									ret := 0.903226 // buy
								if( bullPower > -6.48217 )
									ret := 0.269231
							if( ema3 > 547.916 )
								if( ema13 <= 10.9475 )
									ret := 0.048485
								if( ema13 > 10.9475 )
									ret := -0.586207
						if( tema > 738.789 )
							if( tema <= 1028.27 )
								if( bbp <= 45.2457 )
									ret := 0.707792 // buy
								if( bbp > 45.2457 )
									ret := 0.111111
							if( tema > 1028.27 )
								if( ema2 <= 1030.53 )
									ret := -0.183099
								if( ema2 > 1030.53 )
									ret := 0.489676
					if( tema > 1077.84 )
						if( tema <= 1152.66 )
							if( ema1 <= 1163.87 )
								if( ema3 <= 1103.74 )
									ret := -0.058282
								if( ema3 > 1103.74 )
									ret := 0.207921
							if( ema1 > 1163.87 )
								if( ema3 <= 1214.29 )
									ret := -0.906250 // sell
								if( ema3 > 1214.29 )
									ret := 0.312500
						if( tema > 1152.66 )
							if( ema13 <= 33.4918 )
								if( ema1 <= 1176.95 )
									ret := 0.560000
								if( ema1 > 1176.95 )
									ret := 0.320755
							if( ema13 > 33.4918 )
								if( tema <= 1198.32 )
									ret := -0.250000
								if( tema > 1198.32 )
									ret := -1.000000 // sell
				if( bbp > 67.3005 )
					if( tema <= 1056.76 )
						if( bbp <= 114.185 )
							if( bullPower <= 50.3585 )
								ret := -1.000000 // sell
							if( bullPower > 50.3585 )
								if( bbp <= 98.3027 )
									ret := 0.933333 // buy
								if( bbp > 98.3027 )
									ret := 0.250000
						if( bbp > 114.185 )
							ret := -1.000000 // sell
					if( tema > 1056.76 )
						if( ema3 <= 1033.26 )
							if( bearPower <= 22.5225 )
								ret := -0.750000 // sell
							if( bearPower > 22.5225 )
								ret := -1.000000 // sell
						if( ema3 > 1033.26 )
							if( ema3 <= 1040.81 )
								ret := 1.000000 // buy
							if( ema3 > 1040.81 )
								if( bbp <= 96.7822 )
									ret := -0.777778 // sell
								if( bbp > 96.7822 )
									ret := 0.142857
		if( ema1 > 1198.1 )
			if( bbm <= 26.3036 )
				if( ema12 <= 0.623776 )
					if( ema1 <= 3503.79 )
						if( bbm <= 12.9498 )
							if( ema1 <= 1201.07 )
								if( ema12 <= -0.434438 )
									ret := -0.618182
								if( ema12 > -0.434438 )
									ret := 0.058824
							if( ema1 > 1201.07 )
								if( ema1 <= 1314.87 )
									ret := -0.088005
								if( ema1 > 1314.87 )
									ret := -0.023376
						if( bbm > 12.9498 )
							if( tema <= 3473.32 )
								if( ema3 <= 3200.82 )
									ret := 0.052873
								if( ema3 > 3200.82 )
									ret := -0.095272
							if( tema > 3473.32 )
								if( tema <= 3495.62 )
									ret := 0.603448
								if( tema > 3495.62 )
									ret := -0.400000
					if( ema1 > 3503.79 )
						if( ema1 <= 3673.22 )
							if( tema <= 3592.64 )
								if( bullPower <= 4.74074 )
									ret := -0.154079
								if( bullPower > 4.74074 )
									ret := -0.446281
							if( tema > 3592.64 )
								if( ema2 <= 3681.23 )
									ret := -0.794521 // sell
								if( ema2 > 3681.23 )
									ret := 0.000000
						if( ema1 > 3673.22 )
							if( ema3 <= 3797.54 )
								if( ema2 <= 3774.88 )
									ret := 0.088561
								if( ema2 > 3774.88 )
									ret := 0.518519
							if( ema3 > 3797.54 )
								if( tema <= 4138.22 )
									ret := -0.216867
								if( tema > 4138.22 )
									ret := 0.028846
				if( ema12 > 0.623776 )
					if( ema2 <= 2045.42 )
						if( ema2 <= 1265.95 )
							if( bearPower <= -0.813194 )
								if( ema12 <= 3.77533 )
									ret := -0.254902
								if( ema12 > 3.77533 )
									ret := -0.802632 // sell
							if( bearPower > -0.813194 )
								if( tema <= 1261.32 )
									ret := 0.117403
								if( tema > 1261.32 )
									ret := -0.376404
						if( ema2 > 1265.95 )
							if( ema3 <= 2020.74 )
								if( ema3 <= 1550.84 )
									ret := 0.188541
								if( ema3 > 1550.84 )
									ret := 0.067171
							if( ema3 > 2020.74 )
								if( bearPower <= -6.89127 )
									ret := -0.217391
								if( bearPower > -6.89127 )
									ret := 0.631579
					if( ema2 > 2045.42 )
						if( tema <= 2133.11 )
							if( ema3 <= 2051.4 )
								if( ema3 <= 2035.64 )
									ret := -0.461538
								if( ema3 > 2035.64 )
									ret := 0.252101
							if( ema3 > 2051.4 )
								if( tema <= 2126.65 )
									ret := -0.190171
								if( tema > 2126.65 )
									ret := -0.666667
						if( tema > 2133.11 )
							if( ema1 <= 2225.62 )
								if( tema <= 2213.05 )
									ret := 0.048469
								if( tema > 2213.05 )
									ret := 0.497608
							if( ema1 > 2225.62 )
								if( ema1 <= 2539.27 )
									ret := -0.038965
								if( ema1 > 2539.27 )
									ret := 0.043894
			if( bbm > 26.3036 )
				if( ema1 <= 4549.83 )
					if( ema1 <= 2485.74 )
						if( ema13 <= 89.5535 )
							if( ema2 <= 2468.36 )
								if( ema2 <= 2454.96 )
									ret := 0.134151
								if( ema2 > 2454.96 )
									ret := -0.246154
							if( ema2 > 2468.36 )
								if( ema12 <= -15.618 )
									ret := 0.130952
								if( ema12 > -15.618 )
									ret := 0.653061
						if( ema13 > 89.5535 )
							if( ema13 <= 116.15 )
								ret := 1.000000 // buy
							if( ema13 > 116.15 )
								ret := 0.500000
					if( ema1 > 2485.74 )
						if( ema3 <= 2839.73 )
							if( ema1 <= 2822.49 )
								if( bearPower <= 59.4358 )
									ret := -0.010338
								if( bearPower > 59.4358 )
									ret := -0.690141
							if( ema1 > 2822.49 )
								if( bbm <= 79.085 )
									ret := -0.666667
								if( bbm > 79.085 )
									ret := 0.500000
						if( ema3 > 2839.73 )
							if( ema2 <= 2969.01 )
								if( ema2 <= 2830.34 )
									ret := -0.571429
								if( ema2 > 2830.34 )
									ret := 0.389785
							if( ema2 > 2969.01 )
								if( tema <= 2943.41 )
									ret := -0.575342
								if( tema > 2943.41 )
									ret := 0.072129
				if( ema1 > 4549.83 )
					if( bbm <= 40.0073 )
						if( ema1 <= 4807.35 )
							if( ema13 <= -3.49815 )
								if( bullPower <= -2.45432 )
									ret := -0.090909
								if( bullPower > -2.45432 )
									ret := -0.609756
							if( ema13 > -3.49815 )
								if( ema3 <= 4717.44 )
									ret := -0.063830
								if( ema3 > 4717.44 )
									ret := 0.500000
						if( ema1 > 4807.35 )
							ret := -1.000000 // sell
					if( bbm > 40.0073 )
						if( ema13 <= -69.8885 )
							if( bbm <= 57.445 )
								ret := 0.000000
							if( bbm > 57.445 )
								ret := 0.250000
						if( ema13 > -69.8885 )
							if( bbp <= 2.67673 )
								if( ema2 <= 4714.28 )
									ret := -0.767857 // sell
								if( ema2 > 4714.28 )
									ret := -0.363636
							if( bbp > 2.67673 )
								if( bearPower <= -18.9916 )
									ret := 0.333333
								if( bearPower > -18.9916 )
									ret := -0.500000
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_ETHUSDT_30Min_2294f057(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)

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


