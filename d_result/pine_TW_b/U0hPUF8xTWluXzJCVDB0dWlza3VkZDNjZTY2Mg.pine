//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: SHOP_1Min_2BT0_dd3ce662 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SHOP_1Min_2BT0_dd3ce662", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SHOP_1Min_dd3ce662(bbm, bearPower, bbp, bullPower, BBPower_Color, ema1, tema, ema12, ema2, ema3, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( bullPower <= -0.023444 )
		if( bbm <= 0.009663 )
			if( tema <= 78.3476 )
				if( ema3 <= 52.5366 )
					if( bearPower <= -0.195826 )
						if( ema12 <= -0.172444 )
							if( ema12 <= -0.205816 )
								ret := 0.571429
							if( ema12 > -0.205816 )
								ret := 1.000000 // buy
						if( ema12 > -0.172444 )
							if( ema12 <= -0.13996 )
								ret := -0.750000 // sell
							if( ema12 > -0.13996 )
								ret := 0.444444
					if( bearPower > -0.195826 )
						if( ema1 <= 50.1064 )
							ret := 0.285714
						if( ema1 > 50.1064 )
							if( ema12 <= 0.001478 )
								ret := -0.902439 // sell
							if( ema12 > 0.001478 )
								ret := -0.571429
				if( ema3 > 52.5366 )
					if( bbp <= -0.244287 )
						if( ema13 <= -0.155499 )
							if( bearPower <= -0.209193 )
								ret := 0.559006
							if( bearPower > -0.209193 )
								ret := 0.121212
						if( ema13 > -0.155499 )
							if( tema <= 53.2061 )
								ret := 0.000000
							if( tema > 53.2061 )
								ret := 0.708511 // buy
					if( bbp > -0.244287 )
						if( ema12 <= -0.038291 )
							if( ema12 <= -0.095022 )
								ret := -0.420290
							if( ema12 > -0.095022 )
								ret := 0.147929
						if( ema12 > -0.038291 )
							if( bbp <= -0.13244 )
								ret := 0.532164
							if( bbp > -0.13244 )
								ret := 0.316074
			if( tema > 78.3476 )
				if( ema12 <= -0.044503 )
					if( ema2 <= 82.2741 )
						if( bearPower <= -0.050511 )
							if( ema13 <= -0.092191 )
								ret := 0.645833
							if( ema13 > -0.092191 )
								ret := 0.142857
						if( bearPower > -0.050511 )
							ret := -0.142857
					if( ema2 > 82.2741 )
						if( ema2 <= 82.8474 )
							if( ema13 <= -0.133886 )
								ret := -0.142857
							if( ema13 > -0.133886 )
								ret := -0.615385
						if( ema2 > 82.8474 )
							if( bbp <= -0.227103 )
								ret := 0.500000
							if( bbp > -0.227103 )
								ret := 0.000000
				if( ema12 > -0.044503 )
					if( ema2 <= 82.7756 )
						if( ema3 <= 82.1305 )
							if( bearPower <= -0.093445 )
								ret := 0.437500
							if( bearPower > -0.093445 )
								ret := -0.426829
						if( ema3 > 82.1305 )
							if( bearPower <= -0.078151 )
								ret := -1.000000 // sell
							if( bearPower > -0.078151 )
								ret := -0.600000
					if( ema2 > 82.7756 )
						ret := 0.272727
		if( bbm > 0.009663 )
			if( ema3 <= 81.0053 )
				if( ema2 <= 53.9901 )
					if( ema3 <= 51.3644 )
						if( ema3 <= 49.5007 )
							if( ema3 <= 49.2617 )
								ret := 0.857143 // buy
							if( ema3 > 49.2617 )
								ret := 1.000000 // buy
						if( ema3 > 49.5007 )
							if( ema12 <= -0.062556 )
								ret := -0.682353
							if( ema12 > -0.062556 )
								ret := 0.909091 // buy
					if( ema3 > 51.3644 )
						if( ema13 <= -0.123039 )
							if( ema3 <= 52.9149 )
								ret := 0.394737
							if( ema3 > 52.9149 )
								ret := 0.949580 // buy
						if( ema13 > -0.123039 )
							if( ema1 <= 53.5078 )
								ret := 0.107527
							if( ema1 > 53.5078 )
								ret := 0.903226 // buy
				if( ema2 > 53.9901 )
					if( ema3 <= 80.567 )
						if( ema3 <= 80.0678 )
							if( bbm <= 0.079512 )
								ret := 0.123028
							if( bbm > 0.079512 )
								ret := 0.036512
						if( ema3 > 80.0678 )
							if( bbm <= 0.040287 )
								ret := -0.122449
							if( bbm > 0.040287 )
								ret := 0.522613
					if( ema3 > 80.567 )
						if( bullPower <= -0.118611 )
							if( bbm <= 0.0825 )
								ret := 0.857143 // buy
							if( bbm > 0.0825 )
								ret := -0.125000
						if( bullPower > -0.118611 )
							if( bbm <= 0.033507 )
								ret := 0.111111
							if( bbm > 0.033507 )
								ret := -0.642857
			if( ema3 > 81.0053 )
				if( ema2 <= 83.478 )
					if( tema <= 81.2699 )
						if( ema3 <= 81.0384 )
							ret := 0.222222
						if( ema3 > 81.0384 )
							if( ema3 <= 81.2156 )
								ret := 0.680000
							if( ema3 > 81.2156 )
								ret := 0.942029 // buy
					if( tema > 81.2699 )
						if( tema <= 82.0587 )
							if( bbp <= -0.324295 )
								ret := -0.944444 // sell
							if( bbp > -0.324295 )
								ret := 0.384615
						if( tema > 82.0587 )
							if( bbm <= 0.060906 )
								ret := 0.200000
							if( bbm > 0.060906 )
								ret := 0.625767
				if( ema2 > 83.478 )
					if( tema <= 83.4257 )
						if( bbm <= 0.058975 )
							if( ema1 <= 83.4526 )
								ret := -0.714286 // sell
							if( ema1 > 83.4526 )
								ret := -1.000000 // sell
						if( bbm > 0.058975 )
							if( bearPower <= -0.251782 )
								ret := -1.000000 // sell
							if( bearPower > -0.251782 )
								ret := -0.153846
					if( tema > 83.4257 )
						if( ema2 <= 84.0517 )
							if( tema <= 83.6879 )
								ret := -0.025641
							if( tema > 83.6879 )
								ret := 0.270833
						if( ema2 > 84.0517 )
							if( ema3 <= 84.0952 )
								ret := -0.555556
							if( ema3 > 84.0952 )
								ret := 0.000000
	if( bullPower > -0.023444 )
		if( bearPower <= 0.08057 )
			if( tema <= 49.4419 )
				if( ema12 <= 0.03831 )
					if( bbp <= 0.039891 )
						ret := 1.000000 // buy
					if( bbp > 0.039891 )
						if( ema13 <= 0.00449 )
							ret := 1.000000 // buy
						if( ema13 > 0.00449 )
							ret := 0.833333 // buy
				if( ema12 > 0.03831 )
					ret := 0.222222
			if( tema > 49.4419 )
				if( ema3 <= 52.7302 )
					if( bullPower <= 0.040643 )
						if( ema13 <= -0.049394 )
							if( bullPower <= 0.014496 )
								ret := 0.608696
							if( bullPower > 0.014496 )
								ret := -0.428571
						if( ema13 > -0.049394 )
							if( tema <= 52.7284 )
								ret := 0.983607 // buy
							if( tema > 52.7284 )
								ret := 0.428571
					if( bullPower > 0.040643 )
						if( ema13 <= -0.026066 )
							if( ema3 <= 51.7796 )
								ret := -1.000000 // sell
							if( ema3 > 51.7796 )
								ret := -0.400000
						if( ema13 > -0.026066 )
							if( bbm <= 0.089411 )
								ret := 0.761905 // buy
							if( bbm > 0.089411 )
								ret := 0.008333
				if( ema3 > 52.7302 )
					if( ema13 <= 0.039657 )
						if( tema <= 54.2359 )
							if( ema13 <= -0.047706 )
								ret := -0.023529
							if( ema13 > -0.047706 )
								ret := -0.424658
						if( tema > 54.2359 )
							if( bbm <= 0.113081 )
								ret := 0.003341
							if( bbm > 0.113081 )
								ret := 0.084978
					if( ema13 > 0.039657 )
						if( tema <= 58.0594 )
							if( bearPower <= -0.049719 )
								ret := -0.216867
							if( bearPower > -0.049719 )
								ret := 0.241273
						if( tema > 58.0594 )
							if( ema3 <= 83.2798 )
								ret := 0.051719
							if( ema3 > 83.2798 )
								ret := -0.157143
		if( bearPower > 0.08057 )
			if( ema13 <= 0.098624 )
				if( ema12 <= 0.03487 )
					if( ema13 <= 0.020178 )
						if( ema12 <= 1.4e-05 )
							if( ema13 <= -0.002668 )
								ret := -0.622807
							if( ema13 > -0.002668 )
								ret := 0.500000
						if( ema12 > 1.4e-05 )
							if( bbm <= 0.05546 )
								ret := -0.210227
							if( bbm > 0.05546 )
								ret := 0.250000
					if( ema13 > 0.020178 )
						if( ema12 <= 0.027672 )
							if( bbp <= 0.201197 )
								ret := -0.872340 // sell
							if( bbp > 0.201197 )
								ret := -0.604651
						if( ema12 > 0.027672 )
							if( bearPower <= 0.124269 )
								ret := -0.328767
							if( bearPower > 0.124269 )
								ret := -0.800000 // sell
				if( ema12 > 0.03487 )
					if( ema2 <= 72.9424 )
						if( ema3 <= 53.1992 )
							if( ema3 <= 51.967 )
								ret := 0.857143 // buy
							if( ema3 > 51.967 )
								ret := 0.222222
						if( ema3 > 53.1992 )
							if( ema3 <= 56.6547 )
								ret := -0.686747
							if( ema3 > 56.6547 )
								ret := -0.212312
					if( ema2 > 72.9424 )
						if( tema <= 73.4756 )
							ret := 0.900000 // buy
						if( tema > 73.4756 )
							if( ema13 <= 0.096175 )
								ret := 0.045614
							if( ema13 > 0.096175 )
								ret := -0.769231 // sell
			if( ema13 > 0.098624 )
				if( bbp <= 0.385452 )
					if( ema12 <= 0.147294 )
						if( bullPower <= 0.236906 )
							if( tema <= 59.3369 )
								ret := -0.124675
							if( tema > 59.3369 )
								ret := 0.063008
						if( bullPower > 0.236906 )
							if( ema3 <= 65.1868 )
								ret := -0.574074
							if( ema3 > 65.1868 )
								ret := -0.090278
					if( ema12 > 0.147294 )
						if( ema3 <= 72.2475 )
							if( tema <= 71.618 )
								ret := 0.439024
							if( tema > 71.618 )
								ret := -0.312500
						if( ema3 > 72.2475 )
							if( ema2 <= 73.3708 )
								ret := 0.965517 // buy
							if( ema2 > 73.3708 )
								ret := 0.393939
				if( bbp > 0.385452 )
					if( ema12 <= 1.09989 )
						if( tema <= 65.3884 )
							if( bullPower <= 0.226079 )
								ret := 0.228571
							if( bullPower > 0.226079 )
								ret := -0.394737
						if( tema > 65.3884 )
							if( ema3 <= 65.5226 )
								ret := 0.553846
							if( ema3 > 65.5226 )
								ret := -0.102881
					if( ema12 > 1.09989 )
						ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_SHOP_1Min_dd3ce662(bbm, bearPower, bbp, bullPower, BBPower_Color, ema1, tema, ema12, ema2, ema3, ema13)

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


