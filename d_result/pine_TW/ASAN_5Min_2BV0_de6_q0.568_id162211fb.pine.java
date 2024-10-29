//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Vortex_Indicator
// ID_model: ASAN_5Min_2BV0_162211fb Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ASAN_5Min_2BV0_162211fb", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ASAN_5Min_162211fb(bullPower, bbp, bearPower, bbm, BBPower_Color, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( bearPower <= 0.020592 )
		if( VIP <= 1.3806 )
			if( bbm <= 0.009978 )
				if( bullPower <= -0.042384 )
					if( VIP_VIM <= 0.123555 )
						if( bearPower <= -0.260637 )
							ret := -0.714286 // sell
						if( bearPower > -0.260637 )
							ret := 0.653620
					if( VIP_VIM > 0.123555 )
						if( VIM <= 1.1274 )
							ret := 0.350000
						if( VIM > 1.1274 )
							ret := -1.000000 // sell
				if( bullPower > -0.042384 )
					if( VIP_VIM <= 0.1292 )
						if( VIM <= 1.0317 )
							ret := 0.419355
						if( VIM > 1.0317 )
							ret := 0.106557
					if( VIP_VIM > 0.1292 )
						if( bbp <= -0.02814 )
							ret := -0.851852 // sell
						if( bbp > -0.02814 )
							ret := -0.108333
			if( bbm > 0.009978 )
				if( VIM <= 1.45511 )
					if( VIP <= 0.782178 )
						if( bullPower <= -0.643915 )
							ret := -0.947368 // sell
						if( bullPower > -0.643915 )
							ret := 0.106486
					if( VIP > 0.782178 )
						if( bullPower <= -0.072108 )
							ret := -0.137931
						if( bullPower > -0.072108 )
							ret := 0.005896
				if( VIM > 1.45511 )
					if( VIM <= 1.90739 )
						if( bbm <= 0.281398 )
							ret := -0.268734
						if( bbm > 0.281398 )
							ret := 0.292683
					if( VIM > 1.90739 )
						if( VIP <= 1.1024 )
							ret := -0.647059
						if( VIP > 1.1024 )
							ret := 0.525000
		if( VIP > 1.3806 )
			if( VIP <= 2.84309 )
				if( bullPower <= -0.068811 )
					if( bbm <= 7.2e-05 )
						if( VIP_VIM <= 0.171124 )
							ret := 0.315985
						if( VIP_VIM > 0.171124 )
							ret := 0.711712 // buy
					if( bbm > 7.2e-05 )
						if( VIM <= 1.7613 )
							ret := -0.074074
						if( VIM > 1.7613 )
							ret := 0.373832
				if( bullPower > -0.068811 )
					if( bullPower <= 0.102227 )
						if( VIM <= 1.27359 )
							ret := 0.416413
						if( VIM > 1.27359 )
							ret := 0.088889
					if( bullPower > 0.102227 )
						if( VIP <= 2.3055 )
							ret := -0.070815
						if( VIP > 2.3055 )
							ret := -0.678571
			if( VIP > 2.84309 )
				if( bbp <= 0.111736 )
					if( bullPower <= -0.058225 )
						if( VIP <= 5.08362 )
							ret := 0.002299
						if( VIP > 5.08362 )
							ret := 0.377880
					if( bullPower > -0.058225 )
						if( bbm <= 0.16224 )
							ret := -0.166667
						if( bbm > 0.16224 )
							ret := -0.826923 // sell
				if( bbp > 0.111736 )
					if( bullPower <= 0.20381 )
						ret := 1.000000 // buy
					if( bullPower > 0.20381 )
						ret := 0.307692
	if( bearPower > 0.020592 )
		if( VIP_VIM <= -0.220193 )
			if( bearPower <= 0.147078 )
				if( VIP_VIM <= -0.885251 )
					if( VIM <= 20.3943 )
						if( VIP <= 4.25643 )
							ret := -0.468085
						if( VIP > 4.25643 )
							ret := -0.883333 // sell
					if( VIM > 20.3943 )
						ret := 1.000000 // buy
				if( VIP_VIM > -0.885251 )
					if( bbp <= 0.361251 )
						if( VIM <= 1.99466 )
							ret := -0.433476
						if( VIM > 1.99466 )
							ret := -0.101990
					if( bbp > 0.361251 )
						ret := 1.000000 // buy
			if( bearPower > 0.147078 )
				if( VIP_VIM <= -1.50952 )
					ret := 0.000000
				if( VIP_VIM > -1.50952 )
					if( VIM <= 2.76964 )
						if( VIP <= 1.1358 )
							ret := 0.000000
						if( VIP > 1.1358 )
							ret := -0.977273 // sell
					if( VIM > 2.76964 )
						if( VIM <= 3.31231 )
							ret := -0.086957
						if( VIM > 3.31231 )
							ret := -0.878788 // sell
		if( VIP_VIM > -0.220193 )
			if( bullPower <= 0.483864 )
				if( bbm <= 0.014954 )
					if( VIM <= 6.96315 )
						if( VIP <= 1.21587 )
							ret := 0.072243
						if( VIP > 1.21587 )
							ret := -0.296469
					if( VIM > 6.96315 )
						if( bullPower <= 0.175652 )
							ret := 0.597122
						if( bullPower > 0.175652 )
							ret := -0.500000
				if( bbm > 0.014954 )
					if( VIP <= 2.68426 )
						if( bbm <= 0.097396 )
							ret := -0.061809
						if( bbm > 0.097396 )
							ret := 0.068079
					if( VIP > 2.68426 )
						if( VIM <= 2.34718 )
							ret := 0.790698 // buy
						if( VIM > 2.34718 )
							ret := 0.268116
			if( bullPower > 0.483864 )
				if( VIP <= 1.47726 )
					if( VIM <= 0.982815 )
						if( bbp <= 0.831511 )
							ret := -0.793103 // sell
						if( bbp > 0.831511 )
							ret := -1.000000 // sell
					if( VIM > 0.982815 )
						ret := 1.000000 // buy
				if( VIP > 1.47726 )
					if( VIP <= 1.56373 )
						if( bullPower <= 0.582368 )
							ret := 0.888889 // buy
						if( bullPower > 0.582368 )
							ret := -0.272727
					if( VIP > 1.56373 )
						if( VIP_VIM <= 1.14876 )
							ret := -0.350877
						if( VIP_VIM > 1.14876 )
							ret := -0.864865 // sell
	
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
float op_operation = decision_tree_0_ASAN_5Min_162211fb(bullPower, bbp, bearPower, bbm, BBPower_Color, VIP, VIM, VIP_VIM)

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


