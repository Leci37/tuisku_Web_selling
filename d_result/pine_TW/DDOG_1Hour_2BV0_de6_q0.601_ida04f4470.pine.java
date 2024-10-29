//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Vortex_Indicator
// ID_model: DDOG_1Hour_2BV0_a04f4470 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DDOG_1Hour_2BV0_a04f4470", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DDOG_1Hour_a04f4470(bearPower, bbm, bbp, bullPower, BBPower_Color, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( bullPower <= 0.638161 )
		if( VIP <= 1.20128 )
			if( VIP_VIM <= -0.307001 )
				if( bearPower <= -1.61449 )
					if( VIM <= 1.49569 )
						if( bullPower <= -2.77228 )
							ret := 0.293970
						if( bullPower > -2.77228 )
							ret := 0.057279
					if( VIM > 1.49569 )
						if( bbm <= 0.306354 )
							ret := -0.640625
						if( bbm > 0.306354 )
							ret := -0.266332
				if( bearPower > -1.61449 )
					if( bbm <= 7e-06 )
						if( VIP_VIM <= -0.478686 )
							ret := 0.048387
						if( VIP_VIM > -0.478686 )
							ret := -0.553360
					if( bbm > 7e-06 )
						if( bearPower <= -0.453183 )
							ret := -0.136711
						if( bearPower > -0.453183 )
							ret := 0.191781
			if( VIP_VIM > -0.307001 )
				if( bearPower <= -2.39437 )
					if( bullPower <= -2.6983 )
						if( bbp <= -7.4371 )
							ret := 0.846154 // buy
						if( bbp > -7.4371 )
							ret := 0.000000
					if( bullPower > -2.6983 )
						if( bullPower <= -0.857184 )
							ret := -0.366337
						if( bullPower > -0.857184 )
							ret := 0.083077
				if( bearPower > -2.39437 )
					if( bearPower <= 0.018927 )
						if( bbm <= 0.82453 )
							ret := 0.154029
						if( bbm > 0.82453 )
							ret := 0.028127
					if( bearPower > 0.018927 )
						if( VIP_VIM <= 0.029823 )
							ret := 0.116740
						if( VIP_VIM > 0.029823 )
							ret := -0.190395
		if( VIP > 1.20128 )
			if( bullPower <= 0.564795 )
				if( bbm <= 0.679135 )
					if( VIP_VIM <= 0.541689 )
						if( VIP <= 1.39088 )
							ret := 0.321333
						if( VIP > 1.39088 )
							ret := 0.685393
					if( VIP_VIM > 0.541689 )
						if( bearPower <= -0.503843 )
							ret := 1.000000 // buy
						if( bearPower > -0.503843 )
							ret := -0.285714
				if( bbm > 0.679135 )
					if( bbp <= -0.599593 )
						if( bearPower <= -1.43023 )
							ret := -0.357143
						if( bearPower > -1.43023 )
							ret := 0.611940
					if( bbp > -0.599593 )
						if( bearPower <= -0.365649 )
							ret := -0.525424
						if( bearPower > -0.365649 )
							ret := 0.384615
			if( bullPower > 0.564795 )
				if( bbp <= 0.154736 )
					ret := 0.666667
				if( bbp > 0.154736 )
					if( bbp <= 1.05771 )
						if( bbm <= 0.335262 )
							ret := 0.545455
						if( bbm > 0.335262 )
							ret := -0.333333
					if( bbp > 1.05771 )
						if( VIM <= 0.984634 )
							ret := -0.142857
						if( VIM > 0.984634 )
							ret := -0.750000 // sell
	if( bullPower > 0.638161 )
		if( VIP_VIM <= 0.298779 )
			if( VIM <= 1.1879 )
				if( bbp <= 3.19515 )
					if( bbp <= -7.64744 )
						if( VIM <= 0.995671 )
							ret := 0.000000
						if( VIM > 0.995671 )
							ret := 1.000000 // buy
					if( bbp > -7.64744 )
						if( bbp <= 2.92898 )
							ret := -0.059349
						if( bbp > 2.92898 )
							ret := 0.309091
				if( bbp > 3.19515 )
					if( bearPower <= 2.12596 )
						if( bbm <= 1.65649 )
							ret := -0.586022
						if( bbm > 1.65649 )
							ret := -0.250689
					if( bearPower > 2.12596 )
						if( VIP <= 1.20497 )
							ret := 0.000000
						if( VIP > 1.20497 )
							ret := 0.666667
			if( VIM > 1.1879 )
				if( bearPower <= -4.53886 )
					if( VIM <= 1.39273 )
						if( VIM <= 1.25851 )
							ret := 1.000000 // buy
						if( VIM > 1.25851 )
							ret := 0.666667
					if( VIM > 1.39273 )
						ret := 0.000000
				if( bearPower > -4.53886 )
					if( bullPower <= 1.75618 )
						if( bbm <= 2.07245 )
							ret := -0.348485
						if( bbm > 2.07245 )
							ret := -0.692308
					if( bullPower > 1.75618 )
						if( bbp <= 0.946998 )
							ret := 0.866667 // buy
						if( bbp > 0.946998 )
							ret := -0.121212
		if( VIP_VIM > 0.298779 )
			if( bearPower <= 1.36785 )
				if( bearPower <= -0.625598 )
					if( bbp <= 0.43585 )
						if( VIP_VIM <= 0.320179 )
							ret := 0.125000
						if( VIP_VIM > 0.320179 )
							ret := -0.712121 // sell
					if( bbp > 0.43585 )
						if( bearPower <= -1.89896 )
							ret := 0.954545 // buy
						if( bearPower > -1.89896 )
							ret := -0.202020
				if( bearPower > -0.625598 )
					if( VIP <= 1.21915 )
						if( bullPower <= 0.656588 )
							ret := -1.000000 // sell
						if( bullPower > 0.656588 )
							ret := 0.324627
					if( VIP > 1.21915 )
						if( bullPower <= 2.25592 )
							ret := 0.013012
						if( bullPower > 2.25592 )
							ret := 0.244131
			if( bearPower > 1.36785 )
				if( VIP_VIM <= 0.644071 )
					if( bearPower <= 2.00146 )
						if( bearPower <= 1.93088 )
							ret := -0.100457
						if( bearPower > 1.93088 )
							ret := -0.787234 // sell
					if( bearPower > 2.00146 )
						if( VIP <= 1.22676 )
							ret := -0.424242
						if( VIP > 1.22676 )
							ret := 0.257971
				if( VIP_VIM > 0.644071 )
					if( bbm <= 0.922035 )
						if( bbp <= 3.28108 )
							ret := 0.757576 // buy
						if( bbp > 3.28108 )
							ret := -0.008696
					if( bbm > 0.922035 )
						if( bbp <= 26.2184 )
							ret := -0.468254
						if( bbp > 26.2184 )
							ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
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
float op_operation = decision_tree_0_DDOG_1Hour_a04f4470(bearPower, bbm, bbp, bullPower, BBPower_Color, VIP, VIP_VIM, VIM)

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


