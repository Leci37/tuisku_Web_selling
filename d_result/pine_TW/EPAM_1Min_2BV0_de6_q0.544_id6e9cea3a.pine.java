//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Vortex_Indicator
// ID_model: EPAM_1Min_2BV0_6e9cea3a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_EPAM_1Min_2BV0_6e9cea3a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_EPAM_1Min_6e9cea3a(bearPower, bbm, bbp, bullPower, BBPower_Color, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( VIP_VIM <= 0.635709 )
		if( VIP_VIM <= 0.269863 )
			if( bearPower <= 0.083141 )
				if( bbp <= -8.42756 )
					if( VIM <= 2.83815 )
						if( bbp <= -10.5029 )
							ret := 0.913043 // buy
						if( bbp > -10.5029 )
							ret := -1.000000 // sell
					if( VIM > 2.83815 )
						if( VIP_VIM <= -1.74871 )
							ret := 0.111111
						if( VIP_VIM > -1.74871 )
							ret := -0.820513 // sell
				if( bbp > -8.42756 )
					if( bbp <= -1.66959 )
						if( bbm <= 0.070028 )
							ret := 0.402632
						if( bbm > 0.070028 )
							ret := 0.051069
					if( bbp > -1.66959 )
						if( bbm <= 0.581419 )
							ret := 0.015981
						if( bbm > 0.581419 )
							ret := -0.162791
			if( bearPower > 0.083141 )
				if( VIP_VIM <= -0.251782 )
					if( VIP <= 3.13405 )
						if( bbp <= 0.951747 )
							ret := -0.307332
						if( bbp > 0.951747 )
							ret := -0.752577 // sell
					if( VIP > 3.13405 )
						if( VIM <= 4.22574 )
							ret := 0.686567
						if( VIM > 4.22574 )
							ret := -0.137405
				if( VIP_VIM > -0.251782 )
					if( bbm <= 0.155196 )
						if( VIM <= 3.59636 )
							ret := -0.116261
						if( VIM > 3.59636 )
							ret := 0.264151
					if( bbm > 0.155196 )
						if( VIM <= 1.77229 )
							ret := 0.061520
						if( VIM > 1.77229 )
							ret := 0.497487
		if( VIP_VIM > 0.269863 )
			if( VIM <= 0.863416 )
				if( VIP_VIM <= 0.548281 )
					if( bullPower <= 0.522832 )
						if( bullPower <= 0.226729 )
							ret := -0.354515
						if( bullPower > 0.226729 )
							ret := 0.013359
					if( bullPower > 0.522832 )
						if( bearPower <= 1.17531 )
							ret := -0.422145
						if( bearPower > 1.17531 )
							ret := 0.888889 // buy
				if( VIP_VIM > 0.548281 )
					if( VIP <= 1.42604 )
						if( bearPower <= 0.115554 )
							ret := 0.496124
						if( bearPower > 0.115554 )
							ret := 0.232000
					if( VIP > 1.42604 )
						if( bearPower <= 0.009109 )
							ret := 0.529412
						if( bearPower > 0.009109 )
							ret := -0.505263
			if( VIM > 0.863416 )
				if( VIP <= 1.3931 )
					if( VIP <= 1.3334 )
						if( bbp <= 0.829288 )
							ret := 0.142500
						if( bbp > 0.829288 )
							ret := 0.675214
					if( VIP > 1.3334 )
						if( VIP_VIM <= 0.379221 )
							ret := 0.596154
						if( VIP_VIM > 0.379221 )
							ret := 0.287879
				if( VIP > 1.3931 )
					if( bearPower <= -0.75736 )
						if( bullPower <= -1.02596 )
							ret := 0.642857
						if( bullPower > -1.02596 )
							ret := -0.628571
					if( bearPower > -0.75736 )
						if( VIP <= 2.97015 )
							ret := 0.083287
						if( VIP > 2.97015 )
							ret := -0.076923
	if( VIP_VIM > 0.635709 )
		if( VIP <= 4.06465 )
			if( bearPower <= 0.560309 )
				if( bullPower <= 0.745055 )
					if( VIP <= 1.41436 )
						if( VIM <= 0.67823 )
							ret := 0.516667
						if( VIM > 0.67823 )
							ret := -0.163636
					if( VIP > 1.41436 )
						if( VIP_VIM <= 1.01611 )
							ret := -0.151061
						if( VIP_VIM > 1.01611 )
							ret := 0.032520
				if( bullPower > 0.745055 )
					if( VIP_VIM <= 0.80159 )
						if( bbp <= 1.31246 )
							ret := -0.705882 // sell
						if( bbp > 1.31246 )
							ret := -0.870968 // sell
					if( VIP_VIM > 0.80159 )
						if( bbp <= 1.22518 )
							ret := -0.650000
						if( bbp > 1.22518 )
							ret := 0.095238
			if( bearPower > 0.560309 )
				if( VIP <= 1.45769 )
					if( VIP_VIM <= 0.865578 )
						if( VIP <= 1.37837 )
							ret := 0.300000
						if( VIP > 1.37837 )
							ret := 0.920635 // buy
					if( VIP_VIM > 0.865578 )
						ret := 0.071429
				if( VIP > 1.45769 )
					if( VIP_VIM <= 0.735152 )
						if( bearPower <= 1.35752 )
							ret := 0.391753
						if( bearPower > 1.35752 )
							ret := -0.739130 // sell
					if( VIP_VIM > 0.735152 )
						if( bearPower <= 2.96918 )
							ret := -0.086108
						if( bearPower > 2.96918 )
							ret := 1.000000 // buy
		if( VIP > 4.06465 )
			if( bbp <= 0.422261 )
				if( VIP_VIM <= 1.05692 )
					if( VIP <= 4.79336 )
						if( VIP <= 4.1839 )
							ret := -0.363636
						if( VIP > 4.1839 )
							ret := 0.666667
					if( VIP > 4.79336 )
						if( VIP <= 5.25582 )
							ret := -0.842105 // sell
						if( VIP > 5.25582 )
							ret := 0.272727
				if( VIP_VIM > 1.05692 )
					if( bearPower <= 0.175235 )
						if( bearPower <= -0.168001 )
							ret := 0.240000
						if( bearPower > -0.168001 )
							ret := 0.811765 // buy
					if( bearPower > 0.175235 )
						ret := 0.000000
			if( bbp > 0.422261 )
				if( VIM <= 3.43412 )
					if( VIP <= 4.37056 )
						if( VIP <= 4.20333 )
							ret := 0.176471
						if( VIP > 4.20333 )
							ret := -0.769231 // sell
					if( VIP > 4.37056 )
						if( VIM <= 3.07448 )
							ret := 0.700000 // buy
						if( VIM > 3.07448 )
							ret := 1.000000 // buy
				if( VIM > 3.43412 )
					if( bullPower <= 0.392525 )
						if( VIP_VIM <= 1.21857 )
							ret := -0.354839
						if( VIP_VIM > 1.21857 )
							ret := -0.947368 // sell
					if( bullPower > 0.392525 )
						if( bbp <= 1.27383 )
							ret := 0.444444
						if( bbp > 1.27383 )
							ret := -0.522727
	
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


//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
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
float op_operation = decision_tree_0_EPAM_1Min_6e9cea3a(bearPower, bbm, bbp, bullPower, BBPower_Color, VIP, VIP_VIM, VIM)

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


