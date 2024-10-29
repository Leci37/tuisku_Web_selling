//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: QCOM_1Min_2BT0_00fa4dd5 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_QCOM_1Min_2BT0_00fa4dd5", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_QCOM_1Min_00fa4dd5(bbp, bullPower, BBPower_Color, bearPower, bbm, ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7,max_features=sqrt, min_samples_leaf=4,random_state=843828734)
	if( bbp <= 1.11778 )
		if( ema1 <= 157.726 )
			if( bbp <= 0.373194 )
				if( ema2 <= 153.417 )
					if( ema12 <= 0.142063 )
						if( ema12 <= -0.080461 )
							if( ema1 <= 151.079 )
								ret := 0.464286
							if( ema1 > 151.079 )
								ret := -0.307692
						if( ema12 > -0.080461 )
							if( ema3 <= 149.905 )
								ret := 1.000000 // buy
							if( ema3 > 149.905 )
								ret := -0.831461 // sell
					if( ema12 > 0.142063 )
						if( ema1 <= 151.786 )
							ret := 1.000000 // buy
						if( ema1 > 151.786 )
							ret := 0.600000
				if( ema2 > 153.417 )
					if( bearPower <= 0.104706 )
						if( bbp <= -10.7522 )
							ret := -1.000000 // sell
						if( bbp > -10.7522 )
							if( ema2 <= 157.12 )
								ret := 0.721622 // buy
							if( ema2 > 157.12 )
								ret := 0.394130
					if( bearPower > 0.104706 )
						if( ema2 <= 157.27 )
							ret := -0.200000
						if( ema2 > 157.27 )
							ret := -1.000000 // sell
			if( bbp > 0.373194 )
				if( bbm <= 0.495168 )
					if( ema12 <= 0.030018 )
						if( tema <= 156.698 )
							ret := -0.666667
						if( tema > 156.698 )
							ret := -1.000000 // sell
					if( ema12 > 0.030018 )
						if( ema3 <= 157.264 )
							if( ema3 <= 151.295 )
								ret := 0.208333
							if( ema3 > 151.295 )
								ret := -0.608247
						if( ema3 > 157.264 )
							if( bbm <= 0.268964 )
								ret := 1.000000 // buy
							if( bbm > 0.268964 )
								ret := 0.800000 // buy
				if( bbm > 0.495168 )
					if( ema13 <= -0.005108 )
						if( ema12 <= 0.006333 )
							ret := 0.833333 // buy
						if( ema12 > 0.006333 )
							ret := -0.571429
					if( ema13 > -0.005108 )
						ret := 1.000000 // buy
		if( ema1 > 157.726 )
			if( ema13 <= -0.541997 )
				if( bbp <= -1.98645 )
					if( bbp <= -4.71776 )
						if( ema3 <= 187.167 )
							if( ema13 <= -1.78274 )
								ret := 0.888889 // buy
							if( ema13 > -1.78274 )
								ret := -1.000000 // sell
						if( ema3 > 187.167 )
							if( ema3 <= 192.252 )
								ret := -1.000000 // sell
							if( ema3 > 192.252 )
								ret := -0.666667
					if( bbp > -4.71776 )
						if( ema3 <= 218.221 )
							if( ema2 <= 195.151 )
								ret := 0.190381
							if( ema2 > 195.151 )
								ret := 0.628571
						if( ema3 > 218.221 )
							if( tema <= 220.758 )
								ret := -0.911111 // sell
							if( tema > 220.758 )
								ret := 0.833333 // buy
				if( bbp > -1.98645 )
					if( bbm <= 0.010146 )
						if( bearPower <= -0.467567 )
							if( ema3 <= 212.901 )
								ret := 0.272000
							if( ema3 > 212.901 )
								ret := -0.320000
						if( bearPower > -0.467567 )
							if( tema <= 159.476 )
								ret := 1.000000 // buy
							if( tema > 159.476 )
								ret := -0.129921
					if( bbm > 0.010146 )
						if( ema2 <= 162.481 )
							if( ema1 <= 161.696 )
								ret := 0.077181
							if( ema1 > 161.696 )
								ret := 0.536232
						if( ema2 > 162.481 )
							if( tema <= 162.368 )
								ret := -0.840580 // sell
							if( tema > 162.368 )
								ret := -0.164580
			if( ema13 > -0.541997 )
				if( ema1 <= 228.965 )
					if( bullPower <= -0.306448 )
						if( ema12 <= -0.101531 )
							if( bbp <= -1.86797 )
								ret := 0.461538
							if( bbp > -1.86797 )
								ret := 0.096310
						if( ema12 > -0.101531 )
							if( bbm <= 0.19805 )
								ret := 0.516456
							if( bbm > 0.19805 )
								ret := -0.300000
					if( bullPower > -0.306448 )
						if( tema <= 219.579 )
							if( bbm <= 0.269293 )
								ret := -0.004036
							if( bbm > 0.269293 )
								ret := 0.045751
						if( tema > 219.579 )
							if( ema12 <= 0.117799 )
								ret := 0.112621
							if( ema12 > 0.117799 )
								ret := 0.606481
				if( ema1 > 228.965 )
					if( bearPower <= -0.072496 )
						if( ema2 <= 229.442 )
							if( ema1 <= 229.124 )
								ret := -0.420290
							if( ema1 > 229.124 )
								ret := 0.272727
						if( ema2 > 229.442 )
							if( ema1 <= 229.453 )
								ret := -0.904762 // sell
							if( ema1 > 229.453 )
								ret := -0.222222
					if( bearPower > -0.072496 )
						if( ema1 <= 229.062 )
							if( tema <= 229.062 )
								ret := -0.200000
							if( tema > 229.062 )
								ret := 0.000000
						if( ema1 > 229.062 )
							if( bbm <= 0.316602 )
								ret := -0.790576 // sell
							if( bbm > 0.316602 )
								ret := -0.517241
	if( bbp > 1.11778 )
		if( ema3 <= 207.521 )
			if( tema <= 208.527 )
				if( ema1 <= 165.972 )
					if( bbm <= 0.9093 )
						if( bearPower <= 0.964974 )
							if( tema <= 165.243 )
								ret := -0.398217
							if( tema > 165.243 )
								ret := -0.905882 // sell
						if( bearPower > 0.964974 )
							if( ema3 <= 149.808 )
								ret := 1.000000 // buy
							if( ema3 > 149.808 )
								ret := -0.051724
					if( bbm > 0.9093 )
						if( bullPower <= 2.3351 )
							if( bbm <= 0.96675 )
								ret := 0.133333
							if( bbm > 0.96675 )
								ret := 0.840000 // buy
						if( bullPower > 2.3351 )
							if( ema3 <= 155.069 )
								ret := -0.666667
							if( ema3 > 155.069 )
								ret := -1.000000 // sell
				if( ema1 > 165.972 )
					if( bearPower <= 0.247317 )
						if( tema <= 206.046 )
							if( ema12 <= 0.722134 )
								ret := 0.460317
							if( ema12 > 0.722134 )
								ret := 1.000000 // buy
						if( tema > 206.046 )
							ret := -0.777778 // sell
					if( bearPower > 0.247317 )
						if( ema12 <= 0.407991 )
							if( ema2 <= 206.198 )
								ret := -0.342980
							if( ema2 > 206.198 )
								ret := 0.521739
						if( ema12 > 0.407991 )
							if( bullPower <= 2.60956 )
								ret := -0.047348
							if( bullPower > 2.60956 )
								ret := -1.000000 // sell
			if( tema > 208.527 )
				if( bbp <= 2.46961 )
					if( ema2 <= 207.945 )
						if( bearPower <= 0.542867 )
							if( bullPower <= 0.877428 )
								ret := 1.000000 // buy
							if( bullPower > 0.877428 )
								ret := 0.666667
						if( bearPower > 0.542867 )
							ret := 1.000000 // buy
					if( ema2 > 207.945 )
						ret := 0.600000
				if( bbp > 2.46961 )
					ret := -0.166667
		if( ema3 > 207.521 )
			if( ema1 <= 211.981 )
				if( ema12 <= 0.181876 )
					ret := -0.200000
				if( ema12 > 0.181876 )
					if( bearPower <= 0.594461 )
						if( ema1 <= 208.367 )
							ret := -1.000000 // sell
						if( ema1 > 208.367 )
							if( bbp <= 1.35132 )
								ret := -0.333333
							if( bbp > 1.35132 )
								ret := -0.827586 // sell
					if( bearPower > 0.594461 )
						if( ema2 <= 208.664 )
							if( ema3 <= 208.476 )
								ret := -0.940000 // sell
							if( ema3 > 208.476 )
								ret := -0.571429
						if( ema2 > 208.664 )
							if( bbp <= 4.65443 )
								ret := -0.981481 // sell
							if( bbp > 4.65443 )
								ret := -0.750000 // sell
			if( ema1 > 211.981 )
				if( bearPower <= 0.59927 )
					if( ema3 <= 213.672 )
						if( ema2 <= 213.543 )
							if( ema3 <= 213.07 )
								ret := 0.000000
							if( ema3 > 213.07 )
								ret := 0.750000 // buy
						if( ema2 > 213.543 )
							ret := 1.000000 // buy
					if( ema3 > 213.672 )
						if( bearPower <= 0.582024 )
							if( tema <= 220.712 )
								ret := -0.086957
							if( tema > 220.712 )
								ret := -0.666667
						if( bearPower > 0.582024 )
							if( bullPower <= 0.602149 )
								ret := 0.800000 // buy
							if( bullPower > 0.602149 )
								ret := 0.200000
				if( bearPower > 0.59927 )
					if( ema3 <= 217.688 )
						if( ema13 <= 1.08837 )
							if( ema3 <= 214.202 )
								ret := -0.166667
							if( ema3 > 214.202 )
								ret := -0.785714 // sell
						if( ema13 > 1.08837 )
							if( ema3 <= 212.317 )
								ret := -0.833333 // sell
							if( ema3 > 212.317 )
								ret := -1.000000 // sell
					if( ema3 > 217.688 )
						if( bearPower <= 1.47288 )
							if( bbm <= 0.359963 )
								ret := -0.470588
							if( bbm > 0.359963 )
								ret := 0.666667
						if( bearPower > 1.47288 )
							ret := 0.714286 // buy
	
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
float op_operation = decision_tree_0_QCOM_1Min_00fa4dd5(bbp, bullPower, BBPower_Color, bearPower, bbm, ema2, ema1, ema12, ema3, ema13, tema)

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


