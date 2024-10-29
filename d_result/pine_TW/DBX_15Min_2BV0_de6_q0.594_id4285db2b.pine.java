//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Vortex_Indicator
// ID_model: DBX_15Min_2BV0_4285db2b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DBX_15Min_2BV0_4285db2b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DBX_15Min_4285db2b(bearPower, bbm, bbp, bullPower, BBPower_Color, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( bullPower <= -0.019866 )
		if( bbm <= 0.02945 )
			if( bullPower <= -0.146788 )
				if( VIP <= 1.00919 )
					if( VIM <= 1.20546 )
						if( bearPower <= -0.217175 )
							ret := 0.357143
						if( bearPower > -0.217175 )
							ret := 0.979167 // buy
					if( VIM > 1.20546 )
						if( VIP_VIM <= -0.279116 )
							ret := 0.310651
						if( VIP_VIM > -0.279116 )
							ret := -1.000000 // sell
				if( VIP > 1.00919 )
					if( bbp <= -0.398912 )
						if( VIM <= 1.0518 )
							ret := -0.444444
						if( VIM > 1.0518 )
							ret := 0.739610 // buy
					if( bbp > -0.398912 )
						if( VIM <= 0.974758 )
							ret := -1.000000 // sell
						if( VIM > 0.974758 )
							ret := 0.497207
			if( bullPower > -0.146788 )
				if( VIP <= 0.981669 )
					if( VIM <= 1.65303 )
						if( bbp <= -0.123164 )
							ret := -0.054248
						if( bbp > -0.123164 )
							ret := 0.173145
					if( VIM > 1.65303 )
						if( bearPower <= -0.083788 )
							ret := 0.947368 // buy
						if( bearPower > -0.083788 )
							ret := 0.208333
				if( VIP > 0.981669 )
					if( bearPower <= -0.110283 )
						if( VIM <= 3.17732 )
							ret := 0.538110
						if( VIM > 3.17732 )
							ret := -0.300000
					if( bearPower > -0.110283 )
						if( VIP <= 1.12162 )
							ret := 0.126344
						if( VIP > 1.12162 )
							ret := 0.342797
		if( bbm > 0.02945 )
			if( bbp <= -0.710585 )
				if( VIM <= 1.51695 )
					if( bbm <= 0.095271 )
						if( VIP <= 0.68535 )
							ret := 0.437500
						if( VIP > 0.68535 )
							ret := 0.884615 // buy
					if( bbm > 0.095271 )
						if( bearPower <= -0.766907 )
							ret := 0.252408
						if( bearPower > -0.766907 )
							ret := -0.068599
				if( VIM > 1.51695 )
					if( VIP <= 0.474779 )
						if( bbp <= -2.00106 )
							ret := 0.333333
						if( bbp > -2.00106 )
							ret := -1.000000 // sell
					if( VIP > 0.474779 )
						if( bearPower <= -0.851722 )
							ret := 0.098592
						if( bearPower > -0.851722 )
							ret := 0.644841
			if( bbp > -0.710585 )
				if( bbp <= -0.478163 )
					if( bbm <= 0.056504 )
						if( bearPower <= -0.36523 )
							ret := -0.333333
						if( bearPower > -0.36523 )
							ret := 0.554455
					if( bbm > 0.056504 )
						if( VIP <= 2.16988 )
							ret := -0.156632
						if( VIP > 2.16988 )
							ret := 0.807692 // buy
				if( bbp > -0.478163 )
					if( bearPower <= -0.378464 )
						if( VIP <= 0.8388 )
							ret := -0.105263
						if( VIP > 0.8388 )
							ret := -0.688073
					if( bearPower > -0.378464 )
						if( bbm <= 0.168368 )
							ret := 0.037324
						if( bbm > 0.168368 )
							ret := 0.185442
	if( bullPower > -0.019866 )
		if( bearPower <= 0.069844 )
			if( bullPower <= 0.238513 )
				if( VIP <= 0.849257 )
					if( VIM <= 1.4048 )
						if( bearPower <= -0.117026 )
							ret := 0.296095
						if( bearPower > -0.117026 )
							ret := 0.064840
					if( VIM > 1.4048 )
						if( bbm <= 0.381336 )
							ret := -0.792453 // sell
						if( bbm > 0.381336 )
							ret := 0.250000
				if( VIP > 0.849257 )
					if( VIP_VIM <= 0.527088 )
						if( VIM <= 3.23419 )
							ret := -0.030299
						if( VIM > 3.23419 )
							ret := -0.366142
					if( VIP_VIM > 0.527088 )
						if( bbp <= 0.196972 )
							ret := 0.174007
						if( bbp > 0.196972 )
							ret := -0.237410
			if( bullPower > 0.238513 )
				if( VIP_VIM <= 0.130447 )
					if( VIM <= 1.03529 )
						if( bearPower <= -1.40434 )
							ret := 1.000000 // buy
						if( bearPower > -1.40434 )
							ret := -0.631944
					if( VIM > 1.03529 )
						if( VIP_VIM <= 0.093136 )
							ret := -0.213115
						if( VIP_VIM > 0.093136 )
							ret := 0.387755
				if( VIP_VIM > 0.130447 )
					if( bbm <= 0.947763 )
						if( VIP <= 1.60971 )
							ret := 0.031967
						if( VIP > 1.60971 )
							ret := -0.327206
					if( bbm > 0.947763 )
						if( bearPower <= -0.128161 )
							ret := -0.675214
						if( bearPower > -0.128161 )
							ret := 0.166667
		if( bearPower > 0.069844 )
			if( bbm <= 0.025198 )
				if( bbp <= 0.561876 )
					if( VIM <= 3.20422 )
						if( bearPower <= 0.111 )
							ret := -0.148536
						if( bearPower > 0.111 )
							ret := -0.319018
					if( VIM > 3.20422 )
						if( VIM <= 6.22474 )
							ret := 0.451923
						if( VIM > 6.22474 )
							ret := -0.363636
				if( bbp > 0.561876 )
					if( VIM <= 1.31326 )
						if( VIM <= 0.895963 )
							ret := -0.820000 // sell
						if( VIM > 0.895963 )
							ret := -0.112500
					if( VIM > 1.31326 )
						if( VIP <= 1.28579 )
							ret := -0.166667
						if( VIP > 1.28579 )
							ret := -0.860681 // sell
			if( bbm > 0.025198 )
				if( VIP <= 1.66023 )
					if( VIM <= 1.41444 )
						if( VIP_VIM <= 0.036324 )
							ret := 0.208609
						if( VIP_VIM > 0.036324 )
							ret := -0.062207
					if( VIM > 1.41444 )
						if( VIP_VIM <= 0.03501 )
							ret := -0.518919
						if( VIP_VIM > 0.03501 )
							ret := 0.108108
				if( VIP > 1.66023 )
					if( VIM <= 1.70149 )
						if( bullPower <= 0.968556 )
							ret := -0.294167
						if( bullPower > 0.968556 )
							ret := 0.631579
					if( VIM > 1.70149 )
						if( bbp <= 0.628291 )
							ret := 0.063177
						if( bbp > 0.628291 )
							ret := -0.708333 // sell
	
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
float op_operation = decision_tree_0_DBX_15Min_4285db2b(bearPower, bbm, bbp, bullPower, BBPower_Color, VIP, VIP_VIM, VIM)

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


