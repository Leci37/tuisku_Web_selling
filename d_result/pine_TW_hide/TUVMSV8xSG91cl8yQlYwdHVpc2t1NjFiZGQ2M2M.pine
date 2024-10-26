//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Vortex_Indicator
// ID_model: MELI_1Hour_2BV0_61bdd63c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MELI_1Hour_2BV0_61bdd63c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MELI_1Hour_61bdd63c(bearPower, bbm, bbp, bullPower, BBPower_Color, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( VIP <= 1.03248 )
		if( bbm <= 1.6e-05 )
			if( VIP_VIM <= -0.173396 )
				if( bearPower <= 4.4367 )
					if( bullPower <= -16.009 )
						if( VIP_VIM <= -0.480458 )
							ret := -0.105882
						if( VIP_VIM > -0.480458 )
							ret := 0.509091
					if( bullPower > -16.009 )
						if( bearPower <= -13.6167 )
							ret := -0.644068
						if( bearPower > -13.6167 )
							ret := -0.138614
				if( bearPower > 4.4367 )
					if( bullPower <= 6.1623 )
						ret := -1.000000 // sell
					if( bullPower > 6.1623 )
						ret := 0.000000
			if( VIP_VIM > -0.173396 )
				if( bullPower <= -1.26213 )
					if( VIP_VIM <= -0.117888 )
						if( VIP_VIM <= -0.119923 )
							ret := -0.596774
						if( VIP_VIM > -0.119923 )
							ret := 1.000000 // buy
					if( VIP_VIM > -0.117888 )
						if( bbp <= -11.4209 )
							ret := -0.571429
						if( bbp > -11.4209 )
							ret := -0.972222 // sell
				if( bullPower > -1.26213 )
					if( bearPower <= 1.47888 )
						if( VIM <= 1.08911 )
							ret := 1.000000 // buy
						if( VIM > 1.08911 )
							ret := -0.041667
					if( bearPower > 1.47888 )
						if( bearPower <= 8.26521 )
							ret := -0.775000 // sell
						if( bearPower > 8.26521 )
							ret := 0.000000
		if( bbm > 1.6e-05 )
			if( VIM <= 1.25374 )
				if( bullPower <= 12.1294 )
					if( bearPower <= -67.6692 )
						if( bullPower <= -20.3943 )
							ret := 0.869565 // buy
						if( bullPower > -20.3943 )
							ret := -0.333333
					if( bearPower > -67.6692 )
						if( bearPower <= -54.1573 )
							ret := -0.518519
						if( bearPower > -54.1573 )
							ret := 0.022156
				if( bullPower > 12.1294 )
					if( bbp <= 9.06874 )
						if( bullPower <= 19.0186 )
							ret := -0.294118
						if( bullPower > 19.0186 )
							ret := -0.691176
					if( bbp > 9.06874 )
						if( bbm <= 16.8432 )
							ret := -0.213675
						if( bbm > 16.8432 )
							ret := 0.145161
			if( VIM > 1.25374 )
				if( bbm <= 0.071766 )
					if( bullPower <= -15.5826 )
						if( VIM <= 1.44277 )
							ret := 1.000000 // buy
						if( VIM > 1.44277 )
							ret := 0.523810
					if( bullPower > -15.5826 )
						if( bullPower <= -8.90037 )
							ret := -0.631579
						if( bullPower > -8.90037 )
							ret := 0.482759
				if( bbm > 0.071766 )
					if( bearPower <= -38.9886 )
						if( bearPower <= -53.9786 )
							ret := -0.308271
						if( bearPower > -53.9786 )
							ret := 0.181009
					if( bearPower > -38.9886 )
						if( bullPower <= -24.9284 )
							ret := -0.693878
						if( bullPower > -24.9284 )
							ret := -0.165006
	if( VIP > 1.03248 )
		if( bbp <= 88.5088 )
			if( bullPower <= 4.42227 )
				if( bullPower <= 3.90764 )
					if( bbp <= 7.25024 )
						if( VIM <= 1.59735 )
							ret := 0.087520
						if( VIM > 1.59735 )
							ret := 0.676923
					if( bbp > 7.25024 )
						if( bbm <= 0.045585 )
							ret := -0.840909 // sell
						if( bbm > 0.045585 )
							ret := 1.000000 // buy
				if( bullPower > 3.90764 )
					if( bearPower <= 4.38928 )
						if( bbm <= 9.2575 )
							ret := 0.491892
						if( bbm > 9.2575 )
							ret := 0.741935 // buy
					if( bearPower > 4.38928 )
						ret := -1.000000 // sell
			if( bullPower > 4.42227 )
				if( VIP <= 1.64207 )
					if( VIP <= 1.32414 )
						if( bullPower <= 5.236 )
							ret := -0.383607
						if( bullPower > 5.236 )
							ret := -0.003572
					if( VIP > 1.32414 )
						if( VIM <= 0.833767 )
							ret := 0.008628
						if( VIM > 0.833767 )
							ret := 0.154303
				if( VIP > 1.64207 )
					if( bearPower <= 28.2203 )
						if( bullPower <= 19.31 )
							ret := -0.560976
						if( bullPower > 19.31 )
							ret := 0.133333
					if( bearPower > 28.2203 )
						if( VIP_VIM <= 0.932007 )
							ret := -0.846154 // sell
						if( VIP_VIM > 0.932007 )
							ret := 0.000000
		if( bbp > 88.5088 )
			if( bullPower <= 73.9848 )
				if( VIM <= 0.791412 )
					if( VIM <= 0.624976 )
						if( bbm <= 38.5025 )
							ret := 0.719298 // buy
						if( bbm > 38.5025 )
							ret := -1.000000 // sell
					if( VIM > 0.624976 )
						if( bearPower <= 44.064 )
							ret := 0.780488 // buy
						if( bearPower > 44.064 )
							ret := 1.000000 // buy
				if( VIM > 0.791412 )
					if( bearPower <= 44.0759 )
						if( bbm <= 41.5202 )
							ret := 0.872340 // buy
						if( bbm > 41.5202 )
							ret := 0.000000
					if( bearPower > 44.0759 )
						if( bearPower <= 53.7972 )
							ret := -0.684211
						if( bearPower > 53.7972 )
							ret := 0.833333 // buy
			if( bullPower > 73.9848 )
				if( VIP <= 1.12265 )
					ret := 1.000000 // buy
				if( VIP > 1.12265 )
					if( VIP <= 1.3587 )
						if( bullPower <= 76.0898 )
							ret := 0.000000
						if( bullPower > 76.0898 )
							ret := -0.953488 // sell
					if( VIP > 1.3587 )
						if( bearPower <= 37.1294 )
							ret := -0.562500
						if( bearPower > 37.1294 )
							ret := 0.209302
	
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
float op_operation = decision_tree_0_MELI_1Hour_61bdd63c(bearPower, bbm, bbp, bullPower, BBPower_Color, VIP, VIP_VIM, VIM)

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


