//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Vortex_Indicator
// ID_model: APPS_15Min_2BV0_e3a828bd Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_APPS_15Min_2BV0_e3a828bd", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_APPS_15Min_e3a828bd(bullPower, bbp, bearPower, bbm, BBPower_Color, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7,max_features=sqrt, min_samples_leaf=4,random_state=843828734)
	if( bearPower <= 0.005928 )
		if( bbm <= 0.004725 )
			if( bearPower <= -0.004068 )
				if( VIP <= 4.19361 )
					if( VIM <= 1.13821 )
						if( bearPower <= -0.007607 )
							if( VIM <= 1.06013 )
								ret := 0.603070
							if( VIM > 1.06013 )
								ret := 0.407970
						if( bearPower > -0.007607 )
							if( VIM <= 1.04441 )
								ret := -0.034014
							if( VIM > 1.04441 )
								ret := 0.440000
					if( VIM > 1.13821 )
						if( bearPower <= -1.20627 )
							if( VIM <= 1.69211 )
								ret := 1.000000 // buy
							if( VIM > 1.69211 )
								ret := 0.555556
						if( bearPower > -1.20627 )
							if( bullPower <= -0.003254 )
								ret := 0.287813
							if( bullPower > -0.003254 )
								ret := 0.602151
				if( VIP > 4.19361 )
					if( VIP_VIM <= 0.359702 )
						if( bullPower <= -0.048246 )
							if( VIP_VIM <= -0.254448 )
								ret := 0.280000
							if( VIP_VIM > -0.254448 )
								ret := -0.666667
						if( bullPower > -0.048246 )
							if( bearPower <= -0.025687 )
								ret := -0.821429 // sell
							if( bearPower > -0.025687 )
								ret := -0.965517 // sell
					if( VIP_VIM > 0.359702 )
						if( VIP_VIM <= 1.04877 )
							if( VIP <= 4.94956 )
								ret := 1.000000 // buy
							if( VIP > 4.94956 )
								ret := 0.714286 // buy
						if( VIP_VIM > 1.04877 )
							ret := 0.375000
			if( bearPower > -0.004068 )
				if( VIP_VIM <= 0.154196 )
					if( bearPower <= 0.003774 )
						if( VIP_VIM <= 0.087278 )
							if( VIP <= 0.968542 )
								ret := -0.193133
							if( VIP > 0.968542 )
								ret := 0.017010
						if( VIP_VIM > 0.087278 )
							if( VIP <= 1.14429 )
								ret := -0.573770
							if( VIP > 1.14429 )
								ret := 0.093750
					if( bearPower > 0.003774 )
						if( bbp <= 0.008157 )
							if( bullPower <= 0.003947 )
								ret := 0.000000
							if( bullPower > 0.003947 )
								ret := -0.916667 // sell
						if( bbp > 0.008157 )
							if( bullPower <= 0.008212 )
								ret := -0.170909
							if( bullPower > 0.008212 )
								ret := -0.615385
				if( VIP_VIM > 0.154196 )
					if( VIP_VIM <= 0.827163 )
						if( bbp <= 0.01066 )
							if( bbm <= 0.004063 )
								ret := 0.024712
							if( bbm > 0.004063 )
								ret := 0.736842 // buy
						if( bbp > 0.01066 )
							if( VIP_VIM <= 0.378713 )
								ret := 0.759259 // buy
							if( VIP_VIM > 0.378713 )
								ret := 0.000000
					if( VIP_VIM > 0.827163 )
						if( VIP <= 1.70715 )
							ret := 0.500000
						if( VIP > 1.70715 )
							if( bearPower <= 0.00205 )
								ret := 0.666667
							if( bearPower > 0.00205 )
								ret := 1.000000 // buy
		if( bbm > 0.004725 )
			if( bbp <= 0.135368 )
				if( bbm <= 0.213288 )
					if( bullPower <= -0.970757 )
						if( VIP_VIM <= -0.459674 )
							if( bearPower <= -1.42336 )
								ret := 0.807692 // buy
							if( bearPower > -1.42336 )
								ret := -0.437500
						if( VIP_VIM > -0.459674 )
							if( VIM <= 1.74417 )
								ret := 0.936170 // buy
							if( VIM > 1.74417 )
								ret := 0.500000
					if( bullPower > -0.970757 )
						if( bearPower <= -0.010723 )
							if( VIP_VIM <= 0.494209 )
								ret := 0.053775
							if( VIP_VIM > 0.494209 )
								ret := 0.379475
						if( bearPower > -0.010723 )
							if( VIP_VIM <= -0.349329 )
								ret := -0.297872
							if( VIP_VIM > -0.349329 )
								ret := 0.010094
				if( bbm > 0.213288 )
					if( bearPower <= -4.32362 )
						if( bullPower <= -1.99971 )
							if( bbp <= -7.28542 )
								ret := 0.545455
							if( bbp > -7.28542 )
								ret := -0.933333 // sell
						if( bullPower > -1.99971 )
							if( bullPower <= -0.895735 )
								ret := 0.652174
							if( bullPower > -0.895735 )
								ret := 0.963636 // buy
					if( bearPower > -4.32362 )
						if( bbm <= 0.393909 )
							if( VIP_VIM <= 0.137909 )
								ret := -0.047779
							if( VIP_VIM > 0.137909 )
								ret := -0.312057
						if( bbm > 0.393909 )
							if( bearPower <= -4.15467 )
								ret := -0.760000 // sell
							if( bearPower > -4.15467 )
								ret := 0.010534
			if( bbp > 0.135368 )
				if( bullPower <= 0.731329 )
					if( bbp <= 0.654439 )
						if( bearPower <= -0.356365 )
							if( bearPower <= -0.369299 )
								ret := -0.586207
							if( bearPower > -0.369299 )
								ret := -1.000000 // sell
						if( bearPower > -0.356365 )
							if( bbm <= 0.612654 )
								ret := -0.113537
							if( bbm > 0.612654 )
								ret := 0.033479
					if( bbp > 0.654439 )
						if( bbp <= 0.680114 )
							ret := -0.916667 // sell
						if( bbp > 0.680114 )
							ret := -0.500000
				if( bullPower > 0.731329 )
					if( bearPower <= -0.112704 )
						if( VIM <= 1.42751 )
							if( bullPower <= 0.762599 )
								ret := 0.500000
							if( bullPower > 0.762599 )
								ret := -0.133578
						if( VIM > 1.42751 )
							if( bullPower <= 0.801375 )
								ret := 0.000000
							if( bullPower > 0.801375 )
								ret := 0.770833 // buy
					if( bearPower > -0.112704 )
						if( bbp <= 0.726535 )
							if( VIM <= 0.980232 )
								ret := -0.700000 // sell
							if( VIM > 0.980232 )
								ret := 0.400000
						if( bbp > 0.726535 )
							if( VIM <= 1.00502 )
								ret := 0.331551
							if( VIM > 1.00502 )
								ret := 0.644444
	if( bearPower > 0.005928 )
		if( bbp <= 0.333214 )
			if( bbm <= 0.009455 )
				if( VIM <= 1.04855 )
					if( bbm <= 0.009209 )
						if( VIP <= 1.20517 )
							if( VIP <= 1.09807 )
								ret := -0.105000
							if( VIP > 1.09807 )
								ret := 0.172196
						if( VIP > 1.20517 )
							if( VIM <= 0.637831 )
								ret := 0.375000
							if( VIM > 0.637831 )
								ret := -0.185236
					if( bbm > 0.009209 )
						if( bullPower <= 0.023669 )
							if( VIP <= 1.18034 )
								ret := -1.000000 // sell
							if( VIP > 1.18034 )
								ret := 0.000000
						if( bullPower > 0.023669 )
							if( bullPower <= 0.06128 )
								ret := -1.000000 // sell
							if( bullPower > 0.06128 )
								ret := -0.833333 // sell
				if( VIM > 1.04855 )
					if( bbp <= 0.116806 )
						if( bearPower <= 0.012639 )
							if( bullPower <= 0.014196 )
								ret := -0.211842
							if( bullPower > 0.014196 )
								ret := 0.047619
						if( bearPower > 0.012639 )
							if( VIP_VIM <= 0.266467 )
								ret := -0.365990
							if( VIP_VIM > 0.266467 )
								ret := -0.200426
					if( bbp > 0.116806 )
						if( VIP_VIM <= -0.262988 )
							if( bbp <= 0.244575 )
								ret := -0.736842 // sell
							if( bbp > 0.244575 )
								ret := -0.426230
						if( VIP_VIM > -0.262988 )
							if( VIP <= 5.99992 )
								ret := -0.430368
							if( VIP > 5.99992 )
								ret := 0.380952
			if( bbm > 0.009455 )
				if( VIP_VIM <= -0.135082 )
					if( VIM <= 4.7707 )
						if( bullPower <= 0.106299 )
							if( bullPower <= 0.094464 )
								ret := -0.233906
							if( bullPower > 0.094464 )
								ret := 0.403846
						if( bullPower > 0.106299 )
							if( bearPower <= 0.142341 )
								ret := -0.366142
							if( bearPower > 0.142341 )
								ret := -1.000000 // sell
					if( VIM > 4.7707 )
						if( bbm <= 0.020279 )
							ret := 0.571429
						if( bbm > 0.020279 )
							ret := 0.666667
				if( VIP_VIM > -0.135082 )
					if( VIP_VIM <= -0.118676 )
						if( bbm <= 0.039477 )
							if( VIP <= 1.16303 )
								ret := 0.755102 // buy
							if( VIP > 1.16303 )
								ret := 0.285714
						if( bbm > 0.039477 )
							if( VIM <= 2.10387 )
								ret := -0.346154
							if( VIM > 2.10387 )
								ret := 0.600000
					if( VIP_VIM > -0.118676 )
						if( VIP_VIM <= 0.044217 )
							if( bbp <= 0.303524 )
								ret := -0.124464
							if( bbp > 0.303524 )
								ret := -0.630435
						if( VIP_VIM > 0.044217 )
							if( bullPower <= 0.034517 )
								ret := 0.052632
							if( bullPower > 0.034517 )
								ret := -0.063988
		if( bbp > 0.333214 )
			if( bullPower <= 1.46825 )
				if( bbm <= 0.034942 )
					if( VIP <= 1.33579 )
						if( VIP_VIM <= 0.424541 )
							if( bbp <= 0.338286 )
								ret := 0.636364
							if( bbp > 0.338286 )
								ret := -0.187135
						if( VIP_VIM > 0.424541 )
							if( bearPower <= 0.381245 )
								ret := 0.678571
							if( bearPower > 0.381245 )
								ret := -0.071429
					if( VIP > 1.33579 )
						if( bullPower <= 0.309946 )
							if( VIP_VIM <= -0.764354 )
								ret := 0.437500
							if( VIP_VIM > -0.764354 )
								ret := -0.376210
						if( bullPower > 0.309946 )
							if( VIM <= 2.18767 )
								ret := -0.092308
							if( VIM > 2.18767 )
								ret := -0.395349
				if( bbm > 0.034942 )
					if( bearPower <= 0.109942 )
						if( bbm <= 0.38995 )
							if( VIP_VIM <= 0.034275 )
								ret := 0.286550
							if( VIP_VIM > 0.034275 )
								ret := -0.102351
						if( bbm > 0.38995 )
							if( VIM <= 1.37343 )
								ret := -0.250667
							if( VIM > 1.37343 )
								ret := 0.357143
					if( bearPower > 0.109942 )
						if( bbp <= 0.382154 )
							if( VIP_VIM <= 0.034221 )
								ret := -0.470588
							if( VIP_VIM > 0.034221 )
								ret := 0.358757
						if( bbp > 0.382154 )
							if( bbm <= 0.207209 )
								ret := -0.109467
							if( bbm > 0.207209 )
								ret := 0.058451
			if( bullPower > 1.46825 )
				if( VIM <= 0.601014 )
					if( bullPower <= 1.80957 )
						if( bbm <= 0.53959 )
							ret := 0.200000
						if( bbm > 0.53959 )
							if( VIM <= 0.587402 )
								ret := -1.000000 // sell
							if( VIM > 0.587402 )
								ret := -0.571429
					if( bullPower > 1.80957 )
						if( bbp <= 7.76207 )
							if( VIM <= 0.596289 )
								ret := 0.000000
							if( VIM > 0.596289 )
								ret := -0.608696
						if( bbp > 7.76207 )
							if( VIP <= 1.42516 )
								ret := -1.000000 // sell
							if( VIP > 1.42516 )
								ret := -0.818182 // sell
				if( VIM > 0.601014 )
					if( VIP <= 1.18023 )
						if( bbp <= 2.36844 )
							if( bbp <= 1.86858 )
								ret := -0.421053
							if( bbp > 1.86858 )
								ret := 0.512821
						if( bbp > 2.36844 )
							if( VIP_VIM <= 0.147434 )
								ret := -0.771429 // sell
							if( VIP_VIM > 0.147434 )
								ret := 0.083333
					if( VIP > 1.18023 )
						if( bearPower <= 0.963259 )
							if( bearPower <= 0.931525 )
								ret := -0.310992
							if( bearPower > 0.931525 )
								ret := -0.727273 // sell
						if( bearPower > 0.963259 )
							if( bbm <= 0.296489 )
								ret := -0.666667
							if( bbm > 0.296489 )
								ret := -0.031189
	
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
float op_operation = decision_tree_0_APPS_15Min_e3a828bd(bullPower, bbp, bearPower, bbm, BBPower_Color, VIP, VIM, VIP_VIM)

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


