//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Vortex_Indicator
// ID_model: UPST_1Hour_2BV0_b9ab9d80 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UPST_1Hour_2BV0_b9ab9d80", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UPST_1Hour_b9ab9d80(bbp, bullPower, BBPower_Color, bearPower, bbm, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( VIP <= 0.956788 )
		if( bullPower <= -5.29585 )
			if( bullPower <= -5.68105 )
				if( bearPower <= -14.3451 )
					if( bbm <= 10.582 )
						if( VIP_VIM <= -1.02071 )
							ret := -0.967742 // sell
						if( VIP_VIM > -1.02071 )
							ret := -0.682927
					if( bbm > 10.582 )
						if( bbp <= -25.9327 )
							ret := 0.769231 // buy
						if( bbp > -25.9327 )
							ret := -1.000000 // sell
				if( bearPower > -14.3451 )
					if( VIM <= 1.38169 )
						if( VIM <= 1.29746 )
							ret := 0.000000
						if( VIM > 1.29746 )
							ret := -0.658537
					if( VIM > 1.38169 )
						if( bbm <= 2.03516 )
							ret := -0.230769
						if( bbm > 2.03516 )
							ret := 0.772727 // buy
			if( bullPower > -5.68105 )
				if( VIM <= 1.26233 )
					ret := -0.375000
				if( VIM > 1.26233 )
					if( VIP_VIM <= -0.973489 )
						ret := 0.000000
					if( VIP_VIM > -0.973489 )
						if( VIM <= 1.27845 )
							ret := -0.866667 // sell
						if( VIM > 1.27845 )
							ret := -0.977778 // sell
		if( bullPower > -5.29585 )
			if( bbp <= 0.719301 )
				if( bbp <= 0.072373 )
					if( bbm <= 0.099871 )
						if( bullPower <= -0.393735 )
							ret := -0.528302
						if( bullPower > -0.393735 )
							ret := -0.085057
					if( bbm > 0.099871 )
						if( bullPower <= -4.70116 )
							ret := 0.365591
						if( bullPower > -4.70116 )
							ret := -0.061438
				if( bbp > 0.072373 )
					if( VIP <= 0.928553 )
						if( VIM <= 1.07864 )
							ret := 0.656716
						if( VIM > 1.07864 )
							ret := 0.179775
					if( VIP > 0.928553 )
						if( bbp <= 0.163364 )
							ret := 0.545455
						if( bbp > 0.163364 )
							ret := -0.294118
			if( bbp > 0.719301 )
				if( bullPower <= 2.21704 )
					if( VIP <= 0.949865 )
						if( bullPower <= 1.28259 )
							ret := -0.928571 // sell
						if( bullPower > 1.28259 )
							ret := -0.565217
					if( VIP > 0.949865 )
						ret := -0.294118
				if( bullPower > 2.21704 )
					if( bearPower <= -3.11047 )
						if( VIP <= 0.847226 )
							ret := 1.000000 // buy
						if( VIP > 0.847226 )
							ret := -0.750000 // sell
					if( bearPower > -3.11047 )
						if( bullPower <= 6.04429 )
							ret := -0.083333
						if( bullPower > 6.04429 )
							ret := 1.000000 // buy
	if( VIP > 0.956788 )
		if( bearPower <= -0.043513 )
			if( bbp <= -0.234183 )
				if( bullPower <= 0.561305 )
					if( bbm <= 5.35624 )
						if( bbm <= 4.31479 )
							ret := 0.174857
						if( bbm > 4.31479 )
							ret := 0.755556 // buy
					if( bbm > 5.35624 )
						if( bbm <= 8.795 )
							ret := -0.714286 // sell
						if( bbm > 8.795 )
							ret := 1.000000 // buy
				if( bullPower > 0.561305 )
					if( bullPower <= 2.74659 )
						if( bbp <= -0.314491 )
							ret := -0.317647
						if( bbp > -0.314491 )
							ret := 0.333333
					if( bullPower > 2.74659 )
						if( bbp <= -3.55317 )
							ret := -0.961538 // sell
						if( bbp > -3.55317 )
							ret := 0.648148
			if( bbp > -0.234183 )
				if( bbp <= -0.150704 )
					if( VIP_VIM <= -0.073079 )
						if( VIP_VIM <= -0.099518 )
							ret := -0.404762
						if( VIP_VIM > -0.099518 )
							ret := -0.882353 // sell
					if( VIP_VIM > -0.073079 )
						if( VIM <= 0.915999 )
							ret := -0.791667 // sell
						if( VIM > 0.915999 )
							ret := -0.201258
				if( bbp > -0.150704 )
					if( bbm <= 13.1999 )
						if( bbp <= 2.61365 )
							ret := -0.071100
						if( bbp > 2.61365 )
							ret := 0.195965
					if( bbm > 13.1999 )
						if( bbp <= 12.2798 )
							ret := -0.819672 // sell
						if( bbp > 12.2798 )
							ret := 0.111111
		if( bearPower > -0.043513 )
			if( bearPower <= 3.32514 )
				if( bbm <= 2.17054 )
					if( bbp <= 5.74636 )
						if( bbp <= 4.75806 )
							ret := 0.084817
						if( bbp > 4.75806 )
							ret := 0.471963
					if( bbp > 5.74636 )
						if( bearPower <= 2.30828 )
							ret := -0.772727 // sell
						if( bearPower > 2.30828 )
							ret := -0.113333
				if( bbm > 2.17054 )
					if( VIP_VIM <= 0.297325 )
						if( bbm <= 2.75495 )
							ret := 0.470588
						if( bbm > 2.75495 )
							ret := -0.143498
					if( VIP_VIM > 0.297325 )
						if( bbp <= 12.1822 )
							ret := 0.402418
						if( bbp > 12.1822 )
							ret := -0.230769
			if( bearPower > 3.32514 )
				if( VIP <= 1.14678 )
					if( bullPower <= 9.10538 )
						if( bearPower <= 4.6669 )
							ret := 0.964286 // buy
						if( bearPower > 4.6669 )
							ret := 0.000000
					if( bullPower > 9.10538 )
						ret := -0.333333
				if( VIP > 1.14678 )
					if( bullPower <= 14.3482 )
						if( bullPower <= 5.26763 )
							ret := 0.164384
						if( bullPower > 5.26763 )
							ret := -0.271739
					if( bullPower > 14.3482 )
						if( bullPower <= 18.0475 )
							ret := 0.588235
						if( bullPower > 18.0475 )
							ret := -0.708333 // sell
	
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
float op_operation = decision_tree_0_UPST_1Hour_b9ab9d80(bbp, bullPower, BBPower_Color, bearPower, bbm, VIP, VIP_VIM, VIM)

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


