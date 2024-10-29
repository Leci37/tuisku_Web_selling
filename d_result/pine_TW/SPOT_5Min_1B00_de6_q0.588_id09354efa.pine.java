//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power
// ID_model: SPOT_5Min_1B00_09354efa Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SPOT_5Min_1B00_09354efa", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SPOT_5Min_09354efa(bbm, bearPower, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( bbp <= 1.87294 )
		if( bullPower <= -1.02851 )
			if( bbm <= 0.008822 )
				if( bearPower <= -8.51618 )
					ret := -1.000000 // sell
				if( bearPower > -8.51618 )
					if( bbp <= -2.4476 )
						if( bullPower <= -3.62147 )
							ret := 0.142857
						if( bullPower > -3.62147 )
							ret := 0.781053 // buy
					if( bbp > -2.4476 )
						if( bearPower <= -1.12881 )
							ret := -0.589744
						if( bearPower > -1.12881 )
							ret := 0.504762
			if( bbm > 0.008822 )
				if( bullPower <= -1.07915 )
					if( bbm <= 2.24356 )
						if( bbp <= -3.65282 )
							ret := 0.175024
						if( bbp > -3.65282 )
							ret := -0.065217
					if( bbm > 2.24356 )
						if( bullPower <= -2.40435 )
							ret := -0.560000
						if( bullPower > -2.40435 )
							ret := 0.021127
				if( bullPower > -1.07915 )
					if( bbp <= -2.76386 )
						if( bbm <= 1.99401 )
							ret := 0.702703 // buy
						if( bbm > 1.99401 )
							ret := -0.600000
					if( bbp > -2.76386 )
						if( bullPower <= -1.06329 )
							ret := -0.833333 // sell
						if( bullPower > -1.06329 )
							ret := 0.208333
		if( bullPower > -1.02851 )
			if( bbp <= -1.73925 )
				if( bullPower <= -0.107712 )
					if( bbm <= 2.54296 )
						if( bbp <= -2.46283 )
							ret := 0.133172
						if( bbp > -2.46283 )
							ret := -0.161080
					if( bbm > 2.54296 )
						if( bullPower <= -0.193357 )
							ret := -0.769231 // sell
						if( bullPower > -0.193357 )
							ret := 0.666667
				if( bullPower > -0.107712 )
					if( bullPower <= 0.214505 )
						if( bearPower <= -1.96941 )
							ret := 0.800000 // buy
						if( bearPower > -1.96941 )
							ret := 0.200000
					if( bullPower > 0.214505 )
						if( bbp <= -2.42001 )
							ret := -0.308511
						if( bbp > -2.42001 )
							ret := 0.346939
			if( bbp > -1.73925 )
				if( bullPower <= -0.807504 )
					if( bbp <= -1.72059 )
						ret := -0.333333
					if( bbp > -1.72059 )
						if( bearPower <= -0.836672 )
							ret := 0.666667
						if( bearPower > -0.836672 )
							ret := 0.915493 // buy
				if( bullPower > -0.807504 )
					if( bearPower <= -2.1783 )
						if( bbp <= -1.31162 )
							ret := 0.940000 // buy
						if( bbp > -1.31162 )
							ret := 0.290323
					if( bearPower > -2.1783 )
						if( bullPower <= 1.38957 )
							ret := 0.022905
						if( bullPower > 1.38957 )
							ret := -0.158824
	if( bbp > 1.87294 )
		if( bearPower <= 0.815349 )
			if( bearPower <= 0.641933 )
				if( bearPower <= -0.324213 )
					if( bullPower <= 4.91519 )
						if( bbm <= 3.97796 )
							ret := -0.659574
						if( bbm > 3.97796 )
							ret := 0.404255
					if( bullPower > 4.91519 )
						if( bearPower <= -4.54242 )
							ret := 1.000000 // buy
						if( bearPower > -4.54242 )
							ret := -0.789474 // sell
				if( bearPower > -0.324213 )
					if( bearPower <= -0.018791 )
						if( bbp <= 2.04873 )
							ret := 0.073171
						if( bbp > 2.04873 )
							ret := 0.640625
					if( bearPower > -0.018791 )
						if( bearPower <= 0.062143 )
							ret := -0.934783 // sell
						if( bearPower > 0.062143 )
							ret := -0.133333
			if( bearPower > 0.641933 )
				if( bbp <= 3.46788 )
					if( bbm <= 1.3475 )
						if( bbp <= 2.26052 )
							ret := 0.216495
						if( bbp > 2.26052 )
							ret := -0.216981
					if( bbm > 1.3475 )
						if( bbp <= 2.91933 )
							ret := 0.857143 // buy
						if( bbp > 2.91933 )
							ret := 0.386667
				if( bbp > 3.46788 )
					if( bullPower <= 4.632 )
						if( bullPower <= 2.78404 )
							ret := -0.250000
						if( bullPower > 2.78404 )
							ret := -0.730769 // sell
					if( bullPower > 4.632 )
						ret := 1.000000 // buy
		if( bearPower > 0.815349 )
			if( bbm <= 0.944689 )
				if( bullPower <= 4.00828 )
					if( bearPower <= 2.96825 )
						if( bullPower <= 1.39629 )
							ret := -0.462006
						if( bullPower > 1.39629 )
							ret := -0.278920
					if( bearPower > 2.96825 )
						if( bearPower <= 3.04704 )
							ret := -1.000000 // sell
						if( bearPower > 3.04704 )
							ret := -0.859375 // sell
				if( bullPower > 4.00828 )
					if( bearPower <= 4.44124 )
						if( bearPower <= 4.14997 )
							ret := 0.312500
						if( bearPower > 4.14997 )
							ret := 0.882353 // buy
					if( bearPower > 4.44124 )
						if( bbp <= 8.99976 )
							ret := -1.000000 // sell
						if( bbp > 8.99976 )
							ret := 0.000000
			if( bbm > 0.944689 )
				if( bbm <= 1.06277 )
					if( bearPower <= 1.32215 )
						if( bbp <= 3.23111 )
							ret := 0.406250
						if( bbp > 3.23111 )
							ret := 0.844444 // buy
					if( bearPower > 1.32215 )
						if( bullPower <= 2.69112 )
							ret := -0.363636
						if( bullPower > 2.69112 )
							ret := 0.100000
				if( bbm > 1.06277 )
					if( bullPower <= 2.47024 )
						if( bearPower <= 0.895119 )
							ret := 0.175000
						if( bearPower > 0.895119 )
							ret := -0.689441
					if( bullPower > 2.47024 )
						if( bullPower <= 7.00866 )
							ret := -0.003191
						if( bullPower > 7.00866 )
							ret := -0.528455
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_SPOT_5Min_09354efa(bbm, bearPower, bbp, bullPower, BBPower_Color)

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


