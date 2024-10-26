//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: TTD_15Min_2TV0_2e6bb184 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TTD_15Min_2TV0_2e6bb184", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TTD_15Min_2e6bb184(ema2, ema1, ema12, ema3, ema13, tema, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( ema12 <= -0.127149 )
		if( tema <= 48.5422 )
			if( VIM <= 2.32741 )
				if( VIP_VIM <= -0.736414 )
					if( VIM <= 1.45843 )
						if( tema <= 47.8098 )
							if( ema2 <= 49.8335 )
								ret := 0.397059
							if( ema2 > 49.8335 )
								ret := 1.000000 // buy
						if( tema > 47.8098 )
							if( VIP <= 0.545301 )
								ret := 1.000000 // buy
							if( VIP > 0.545301 )
								ret := -0.615385
					if( VIM > 1.45843 )
						if( ema12 <= -0.52843 )
							if( VIP <= 0.952956 )
								ret := 0.645161
							if( VIP > 0.952956 )
								ret := -0.545455
						if( ema12 > -0.52843 )
							if( tema <= 43.0366 )
								ret := 0.250000
							if( tema > 43.0366 )
								ret := 0.887850 // buy
				if( VIP_VIM > -0.736414 )
					if( tema <= 35.8315 )
						if( ema13 <= -0.148356 )
							if( ema2 <= 32.0047 )
								ret := 0.439850
							if( ema2 > 32.0047 )
								ret := 0.812500 // buy
						if( ema13 > -0.148356 )
							if( VIM <= 1.17687 )
								ret := -0.500000
							if( VIM > 1.17687 )
								ret := -1.000000 // sell
					if( tema > 35.8315 )
						if( ema1 <= 36.8724 )
							if( tema <= 36.0839 )
								ret := -0.313725
							if( tema > 36.0839 )
								ret := -0.942029 // sell
						if( ema1 > 36.8724 )
							if( ema12 <= -1.07357 )
								ret := 0.857143 // buy
							if( ema12 > -1.07357 )
								ret := 0.181182
			if( VIM > 2.32741 )
				if( ema13 <= -0.546684 )
					if( ema3 <= 45.3353 )
						if( ema1 <= 42.6344 )
							ret := 0.400000
						if( ema1 > 42.6344 )
							ret := -1.000000 // sell
					if( ema3 > 45.3353 )
						if( ema1 <= 46.3315 )
							if( ema3 <= 46.8591 )
								ret := 1.000000 // buy
							if( ema3 > 46.8591 )
								ret := 0.750000 // buy
						if( ema1 > 46.3315 )
							if( ema2 <= 47.1086 )
								ret := -0.642857
							if( ema2 > 47.1086 )
								ret := 0.296296
				if( ema13 > -0.546684 )
					if( ema2 <= 43.991 )
						if( VIM <= 2.99531 )
							if( ema13 <= -0.346297 )
								ret := -1.000000 // sell
							if( ema13 > -0.346297 )
								ret := -0.800000 // sell
						if( VIM > 2.99531 )
							ret := 0.000000
					if( ema2 > 43.991 )
						if( VIP <= 2.58973 )
							if( ema13 <= -0.387712 )
								ret := -0.333333
							if( ema13 > -0.387712 )
								ret := 0.428571
						if( VIP > 2.58973 )
							if( tema <= 45.7394 )
								ret := -0.500000
							if( tema > 45.7394 )
								ret := -1.000000 // sell
		if( tema > 48.5422 )
			if( VIP <= 4.1124 )
				if( ema3 <= 51.4778 )
					if( ema3 <= 51.2962 )
						if( VIM <= 1.36165 )
							if( VIP <= 0.861162 )
								ret := -0.147651
							if( VIP > 0.861162 )
								ret := 0.219124
						if( VIM > 1.36165 )
							if( ema12 <= -0.566467 )
								ret := 0.444444
							if( ema12 > -0.566467 )
								ret := -0.490066
					if( ema3 > 51.2962 )
						if( ema13 <= -0.479499 )
							if( tema <= 50.3546 )
								ret := 0.307692
							if( tema > 50.3546 )
								ret := 0.800000 // buy
						if( ema13 > -0.479499 )
							if( ema2 <= 51.1058 )
								ret := 0.200000
							if( ema2 > 51.1058 )
								ret := -0.925532 // sell
				if( ema3 > 51.4778 )
					if( tema <= 50.816 )
						if( ema2 <= 51.7657 )
							if( VIP_VIM <= -0.321636 )
								ret := 0.693333
							if( VIP_VIM > -0.321636 )
								ret := -0.518519
						if( ema2 > 51.7657 )
							if( VIP <= 0.557229 )
								ret := -0.833333 // sell
							if( VIP > 0.557229 )
								ret := 0.820755 // buy
					if( tema > 50.816 )
						if( VIP_VIM <= 0.14616 )
							if( ema1 <= 64.7858 )
								ret := 0.091764
							if( ema1 > 64.7858 )
								ret := 0.010126
						if( VIP_VIM > 0.14616 )
							if( tema <= 56.486 )
								ret := -0.333333
							if( tema > 56.486 )
								ret := 0.217228
			if( VIP > 4.1124 )
				if( tema <= 113.625 )
					if( ema2 <= 65.2717 )
						if( VIM <= 7.76032 )
							ret := 0.500000
						if( VIM > 7.76032 )
							ret := 1.000000 // buy
					if( ema2 > 65.2717 )
						if( VIP <= 17.1681 )
							if( ema1 <= 85.9194 )
								ret := 0.000000
							if( ema1 > 85.9194 )
								ret := -0.200000
						if( VIP > 17.1681 )
							ret := 0.600000
				if( tema > 113.625 )
					if( ema2 <= 272.884 )
						if( VIM <= 4.61689 )
							ret := 0.666667
						if( VIM > 4.61689 )
							if( tema <= 212.437 )
								ret := 0.888889 // buy
							if( tema > 212.437 )
								ret := 1.000000 // buy
					if( ema2 > 272.884 )
						if( VIP <= 6.15183 )
							if( ema12 <= -0.779195 )
								ret := 0.833333 // buy
							if( ema12 > -0.779195 )
								ret := 0.000000
						if( VIP > 6.15183 )
							if( ema1 <= 279.503 )
								ret := 0.000000
							if( ema1 > 279.503 )
								ret := -0.250000
	if( ema12 > -0.127149 )
		if( VIM <= 0.582759 )
			if( tema <= 48.0275 )
				if( ema3 <= 36.761 )
					ret := -0.400000
				if( ema3 > 36.761 )
					if( VIM <= 0.34926 )
						ret := -0.500000
					if( VIM > 0.34926 )
						if( VIP_VIM <= 1.04054 )
							if( ema3 <= 37.5226 )
								ret := 1.000000 // buy
							if( ema3 > 37.5226 )
								ret := 0.545455
						if( VIP_VIM > 1.04054 )
							ret := 1.000000 // buy
			if( tema > 48.0275 )
				if( ema12 <= 2.52919 )
					if( VIP <= 1.28943 )
						if( VIM <= 0.558438 )
							if( VIP_VIM <= 0.675778 )
								ret := 0.100000
							if( VIP_VIM > 0.675778 )
								ret := 0.842105 // buy
						if( VIM > 0.558438 )
							if( ema13 <= 1.29381 )
								ret := 0.714286 // buy
							if( ema13 > 1.29381 )
								ret := 1.000000 // buy
					if( VIP > 1.28943 )
						if( ema1 <= 81.7762 )
							if( ema13 <= 4.64363 )
								ret := 0.226277
							if( ema13 > 4.64363 )
								ret := -0.842105 // sell
						if( ema1 > 81.7762 )
							if( ema1 <= 470.053 )
								ret := -0.320000
							if( ema1 > 470.053 )
								ret := 1.000000 // buy
				if( ema12 > 2.52919 )
					if( tema <= 214.59 )
						if( VIM <= 0.496243 )
							if( ema12 <= 2.80105 )
								ret := 0.100000
							if( ema12 > 2.80105 )
								ret := 0.732143 // buy
						if( VIM > 0.496243 )
							if( ema13 <= 11.9123 )
								ret := 0.880000 // buy
							if( ema13 > 11.9123 )
								ret := 0.636364
					if( tema > 214.59 )
						if( VIP <= 1.30288 )
							ret := -1.000000 // sell
						if( VIP > 1.30288 )
							if( VIM <= 0.539949 )
								ret := 0.513889
							if( VIM > 0.539949 )
								ret := -0.027397
		if( VIM > 0.582759 )
			if( VIM <= 1.08319 )
				if( ema12 <= 1.43512 )
					if( ema3 <= 36.9509 )
						if( ema3 <= 31.7561 )
							if( VIP <= 1.06308 )
								ret := 0.186084
							if( VIP > 1.06308 )
								ret := -0.140859
						if( ema3 > 31.7561 )
							if( ema13 <= 0.718591 )
								ret := 0.450397
							if( ema13 > 0.718591 )
								ret := -0.562500
					if( ema3 > 36.9509 )
						if( ema1 <= 38.4803 )
							if( VIM <= 0.959455 )
								ret := -0.558333
							if( VIM > 0.959455 )
								ret := -0.231638
						if( ema1 > 38.4803 )
							if( ema3 <= 42.4377 )
								ret := 0.228013
							if( ema3 > 42.4377 )
								ret := -0.024909
				if( ema12 > 1.43512 )
					if( ema3 <= 188.509 )
						if( VIP_VIM <= 0.756403 )
							if( ema3 <= 90.4743 )
								ret := 0.737179 // buy
							if( ema3 > 90.4743 )
								ret := 0.396794
						if( VIP_VIM > 0.756403 )
							if( tema <= 114.548 )
								ret := 0.536585
							if( tema > 114.548 )
								ret := -0.325843
					if( ema3 > 188.509 )
						if( ema3 <= 194.188 )
							if( VIP_VIM <= 0.671555 )
								ret := -0.741935 // sell
							if( VIP_VIM > 0.671555 )
								ret := 0.333333
						if( ema3 > 194.188 )
							if( ema1 <= 901.611 )
								ret := 0.038430
							if( ema1 > 901.611 )
								ret := -0.378205
			if( VIM > 1.08319 )
				if( ema12 <= 4.1765 )
					if( ema1 <= 234.792 )
						if( tema <= 229.431 )
							if( ema12 <= 1.35428 )
								ret := -0.081062
							if( ema12 > 1.35428 )
								ret := 0.438776
						if( tema > 229.431 )
							if( ema12 <= 0.035257 )
								ret := -0.105263
							if( ema12 > 0.035257 )
								ret := -0.795082 // sell
					if( ema1 > 234.792 )
						if( tema <= 786.345 )
							if( ema1 <= 693.979 )
								ret := 0.070066
							if( ema1 > 693.979 )
								ret := 0.433140
						if( tema > 786.345 )
							if( VIP_VIM <= -0.042907 )
								ret := -0.488462
							if( VIP_VIM > -0.042907 )
								ret := -0.163522
				if( ema12 > 4.1765 )
					if( VIP_VIM <= 0.535565 )
						if( VIP <= 1.25511 )
							if( ema2 <= 771.132 )
								ret := -0.250000
							if( ema2 > 771.132 )
								ret := 0.166667
						if( VIP > 1.25511 )
							if( ema12 <= 6.93291 )
								ret := -0.637838
							if( ema12 > 6.93291 )
								ret := 0.250000
					if( VIP_VIM > 0.535565 )
						if( ema3 <= 334.152 )
							if( VIM <= 1.4648 )
								ret := -0.931034 // sell
							if( VIM > 1.4648 )
								ret := 0.750000 // buy
						if( ema3 > 334.152 )
							if( ema3 <= 614.613 )
								ret := 0.850000 // buy
							if( ema3 > 614.613 )
								ret := -0.175439
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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
float op_operation = decision_tree_0_TTD_15Min_2e6bb184(ema2, ema1, ema12, ema3, ema13, tema, VIP, VIP_VIM, VIM)

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


