//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Vortex_Indicator
// ID_model: DBX_30Min_2BV0_620c099e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DBX_30Min_2BV0_620c099e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DBX_30Min_620c099e(bearPower, bbm, bbp, bullPower, BBPower_Color, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( bullPower <= 0.056775 )
		if( bbm <= 0.049999 )
			if( bullPower <= -0.149047 )
				if( VIM <= 1.42719 )
					if( VIP <= 0.898593 )
						if( VIP <= 0.697325 )
							ret := -0.644444
						if( VIP > 0.697325 )
							ret := 0.043478
					if( VIP > 0.898593 )
						if( bullPower <= -0.272215 )
							ret := 0.634855
						if( bullPower > -0.272215 )
							ret := 0.368330
				if( VIM > 1.42719 )
					if( bullPower <= -0.532225 )
						if( VIM <= 1.44267 )
							ret := 0.000000
						if( VIM > 1.44267 )
							ret := 0.946667 // buy
					if( bullPower > -0.532225 )
						if( VIP_VIM <= -0.749377 )
							ret := 0.363636
						if( VIP_VIM > -0.749377 )
							ret := 0.663480
			if( bullPower > -0.149047 )
				if( VIP <= 1.03098 )
					if( VIP_VIM <= -0.965803 )
						ret := 0.928571 // buy
					if( VIP_VIM > -0.965803 )
						if( VIM <= 1.25609 )
							ret := 0.068905
						if( VIM > 1.25609 )
							ret := -0.103406
				if( VIP > 1.03098 )
					if( bbp <= -0.116746 )
						if( VIP <= 1.92676 )
							ret := 0.314835
						if( VIP > 1.92676 )
							ret := 0.878378 // buy
					if( bbp > -0.116746 )
						if( bearPower <= 0.052457 )
							ret := 0.180986
						if( bearPower > 0.052457 )
							ret := -0.269663
		if( bbm > 0.049999 )
			if( bbp <= -0.674361 )
				if( bbp <= -2.15915 )
					if( VIM <= 1.27591 )
						if( bullPower <= -0.951749 )
							ret := 1.000000 // buy
						if( bullPower > -0.951749 )
							ret := 0.000000
					if( VIM > 1.27591 )
						if( VIP_VIM <= -0.596331 )
							ret := -0.527778
						if( VIP_VIM > -0.596331 )
							ret := -1.000000 // sell
				if( bbp > -2.15915 )
					if( VIM <= 1.63394 )
						if( VIP_VIM <= -0.233233 )
							ret := 0.110577
						if( VIP_VIM > -0.233233 )
							ret := 0.377926
					if( VIM > 1.63394 )
						if( VIP_VIM <= -1.02019 )
							ret := 0.000000
						if( VIP_VIM > -1.02019 )
							ret := 0.610169
			if( bbp > -0.674361 )
				if( bearPower <= -0.557432 )
					if( VIP <= 0.892539 )
						if( bullPower <= 0.037353 )
							ret := -0.785714 // sell
						if( bullPower > 0.037353 )
							ret := 1.000000 // buy
					if( VIP > 0.892539 )
						if( bbm <= 0.486174 )
							ret := 1.000000 // buy
						if( bbm > 0.486174 )
							ret := -0.901639 // sell
				if( bearPower > -0.557432 )
					if( bullPower <= -0.028558 )
						if( bullPower <= -0.12504 )
							ret := 0.012669
						if( bullPower > -0.12504 )
							ret := 0.112171
					if( bullPower > -0.028558 )
						if( VIP_VIM <= -0.256389 )
							ret := -0.105473
						if( VIP_VIM > -0.256389 )
							ret := 0.028281
	if( bullPower > 0.056775 )
		if( bbp <= 0.285273 )
			if( VIP_VIM <= 0.121967 )
				if( bbm <= 0.443033 )
					if( VIP <= 0.814667 )
						if( VIM <= 1.22665 )
							ret := -0.650943
						if( VIM > 1.22665 )
							ret := 0.233333
					if( VIP > 0.814667 )
						if( VIP_VIM <= 0.114473 )
							ret := -0.111671
						if( VIP_VIM > 0.114473 )
							ret := -0.414474
				if( bbm > 0.443033 )
					if( bbm <= 0.601711 )
						if( bbp <= -0.338181 )
							ret := -0.625000
						if( bbp > -0.338181 )
							ret := 0.301708
					if( bbm > 0.601711 )
						if( bearPower <= -1.25011 )
							ret := 0.730769 // buy
						if( bearPower > -1.25011 )
							ret := -0.199085
			if( VIP_VIM > 0.121967 )
				if( bbm <= 3.2e-05 )
					if( VIP <= 1.15924 )
						if( bearPower <= 0.064114 )
							ret := -0.166667
						if( bearPower > 0.064114 )
							ret := 0.672727
					if( VIP > 1.15924 )
						if( VIP_VIM <= 0.924884 )
							ret := 0.162379
						if( VIP_VIM > 0.924884 )
							ret := -1.000000 // sell
				if( bbm > 3.2e-05 )
					if( VIM <= 1.0854 )
						if( VIP_VIM <= 0.723032 )
							ret := -0.053696
						if( VIP_VIM > 0.723032 )
							ret := -0.470000
					if( VIM > 1.0854 )
						if( bbm <= 0.180915 )
							ret := -0.018164
						if( bbm > 0.180915 )
							ret := 0.248252
		if( bbp > 0.285273 )
			if( bbm <= 0.008429 )
				if( bbp <= 0.583806 )
					if( VIM <= 1.1882 )
						if( VIP_VIM <= -0.053163 )
							ret := 0.857143 // buy
						if( VIP_VIM > -0.053163 )
							ret := -0.259259
					if( VIM > 1.1882 )
						if( VIM <= 1.93202 )
							ret := -0.571930
						if( VIM > 1.93202 )
							ret := 0.800000 // buy
				if( bbp > 0.583806 )
					if( VIP <= 2.38261 )
						if( bullPower <= 0.317938 )
							ret := -0.619048
						if( bullPower > 0.317938 )
							ret := -0.857820 // sell
					if( VIP > 2.38261 )
						ret := 0.500000
			if( bbm > 0.008429 )
				if( bearPower <= -0.313691 )
					if( bbm <= 1.4106 )
						ret := 1.000000 // buy
					if( bbm > 1.4106 )
						if( bbm <= 2.22647 )
							ret := -0.476190
						if( bbm > 2.22647 )
							ret := 0.750000 // buy
				if( bearPower > -0.313691 )
					if( VIP_VIM <= 0.4793 )
						if( bbm <= 0.582032 )
							ret := -0.155700
						if( bbm > 0.582032 )
							ret := -0.413374
					if( VIP_VIM > 0.4793 )
						if( VIM <= 1.49943 )
							ret := -0.056641
						if( VIM > 1.49943 )
							ret := 0.725000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_DBX_30Min_620c099e(bearPower, bbm, bbp, bullPower, BBPower_Color, VIP, VIP_VIM, VIM)

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


