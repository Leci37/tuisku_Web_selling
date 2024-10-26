//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Vortex_Indicator
// ID_model: ADSK_1Min_2BV0_61ac4639 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADSK_1Min_2BV0_61ac4639", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADSK_1Min_61ac4639(bullPower, bbp, bearPower, bbm, BBPower_Color, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( VIM <= 0.916709 )
		if( bbp <= 1.35209 )
			if( bbp <= 0.95663 )
				if( bullPower <= 0.577104 )
					if( bbm <= 0.536229 )
						if( bearPower <= -0.31347 )
							ret := -0.854167 // sell
						if( bearPower > -0.31347 )
							ret := -0.090026
					if( bbm > 0.536229 )
						if( bullPower <= 0.545009 )
							ret := 0.263566
						if( bullPower > 0.545009 )
							ret := 0.968750 // buy
				if( bullPower > 0.577104 )
					if( bbp <= 0.811882 )
						if( VIP_VIM <= 0.25143 )
							ret := -0.929825 // sell
						if( VIP_VIM > 0.25143 )
							ret := 0.263514
					if( bbp > 0.811882 )
						if( VIM <= 0.887682 )
							ret := -0.589212
						if( VIM > 0.887682 )
							ret := 1.000000 // buy
			if( bbp > 0.95663 )
				if( bbm <= 0.193982 )
					if( bbm <= 0.10685 )
						if( bearPower <= 0.560417 )
							ret := 0.000000
						if( bearPower > 0.560417 )
							ret := -0.516129
					if( bbm > 0.10685 )
						if( VIM <= 0.79362 )
							ret := 0.657303
						if( VIM > 0.79362 )
							ret := -0.333333
				if( bbm > 0.193982 )
					if( VIM <= 0.837271 )
						if( VIP <= 1.31045 )
							ret := 0.193103
						if( VIP > 1.31045 )
							ret := -0.362832
					if( VIM > 0.837271 )
						if( bearPower <= 0.560481 )
							ret := 0.637931
						if( bearPower > 0.560481 )
							ret := -1.000000 // sell
		if( bbp > 1.35209 )
			if( bbp <= 1.45453 )
				if( bbm <= 0.125102 )
					ret := 0.071429
				if( bbm > 0.125102 )
					if( VIP_VIM <= 0.474826 )
						if( VIP_VIM <= 0.417938 )
							ret := -1.000000 // sell
						if( VIP_VIM > 0.417938 )
							ret := 0.888889 // buy
					if( VIP_VIM > 0.474826 )
						if( bullPower <= 0.761276 )
							ret := 1.000000 // buy
						if( bullPower > 0.761276 )
							ret := -0.880000 // sell
			if( bbp > 1.45453 )
				if( bullPower <= 0.851828 )
					if( VIP <= 1.4395 )
						ret := 1.000000 // buy
					if( VIP > 1.4395 )
						ret := -0.200000
				if( bullPower > 0.851828 )
					if( bbp <= 2.32548 )
						if( bbm <= 0.370196 )
							ret := -0.363208
						if( bbm > 0.370196 )
							ret := -0.052381
					if( bbp > 2.32548 )
						if( bullPower <= 2.43291 )
							ret := -0.775510 // sell
						if( bullPower > 2.43291 )
							ret := -0.111111
	if( VIM > 0.916709 )
		if( bbp <= -1.40804 )
			if( VIP <= 1.23878 )
				if( bbp <= -5.16628 )
					ret := 1.000000 // buy
				if( bbp > -5.16628 )
					if( bearPower <= -1.70782 )
						if( VIP_VIM <= -0.264358 )
							ret := -0.660550
						if( VIP_VIM > -0.264358 )
							ret := 0.318182
					if( bearPower > -1.70782 )
						if( bbp <= -2.58101 )
							ret := 0.720588 // buy
						if( bbp > -2.58101 )
							ret := 0.166013
			if( VIP > 1.23878 )
				if( VIM <= 2.54855 )
					if( VIP <= 2.93674 )
						if( bullPower <= -0.73635 )
							ret := 0.805687 // buy
						if( bullPower > -0.73635 )
							ret := 0.363636
					if( VIP > 2.93674 )
						ret := -1.000000 // sell
				if( VIM > 2.54855 )
					if( VIM <= 6.21198 )
						if( VIP <= 5.40841 )
							ret := 0.168421
						if( VIP > 5.40841 )
							ret := -1.000000 // sell
					if( VIM > 6.21198 )
						if( VIM <= 52.6945 )
							ret := 0.865672 // buy
						if( VIM > 52.6945 )
							ret := -0.833333 // sell
		if( bbp > -1.40804 )
			if( bbp <= 4.5026 )
				if( bearPower <= 0.462221 )
					if( bullPower <= 0.163332 )
						if( VIP_VIM <= 0.211768 )
							ret := 0.014789
						if( VIP_VIM > 0.211768 )
							ret := 0.115638
					if( bullPower > 0.163332 )
						if( bbm <= 0.483695 )
							ret := -0.060417
						if( bbm > 0.483695 )
							ret := 0.110224
				if( bearPower > 0.462221 )
					if( bearPower <= 1.39003 )
						if( bearPower <= 0.775745 )
							ret := 0.120211
						if( bearPower > 0.775745 )
							ret := 0.428904
					if( bearPower > 1.39003 )
						if( bbp <= 4.43163 )
							ret := -0.363636
						if( bbp > 4.43163 )
							ret := 0.750000 // buy
			if( bbp > 4.5026 )
				if( VIP <= 7.47781 )
					if( bearPower <= 4.32249 )
						if( bullPower <= 2.42267 )
							ret := 0.500000
						if( bullPower > 2.42267 )
							ret := -0.823944 // sell
					if( bearPower > 4.32249 )
						if( VIM <= 2.69997 )
							ret := 0.488372
						if( VIM > 2.69997 )
							ret := -1.000000 // sell
				if( VIP > 7.47781 )
					if( bullPower <= 4.13792 )
						if( VIP_VIM <= 1.08857 )
							ret := 0.960000 // buy
						if( VIP_VIM > 1.08857 )
							ret := -1.000000 // sell
					if( bullPower > 4.13792 )
						ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_ADSK_1Min_61ac4639(bullPower, bbp, bearPower, bbm, BBPower_Color, VIP, VIM, VIP_VIM)

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


