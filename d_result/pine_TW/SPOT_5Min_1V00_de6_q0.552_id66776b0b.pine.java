//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Vortex_Indicator
// ID_model: SPOT_5Min_1V00_66776b0b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SPOT_5Min_1V00_66776b0b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SPOT_5Min_66776b0b(VIP_VIM, VIM, VIP)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( VIP_VIM <= -0.761943 )
		if( VIM <= 8.06325 )
			if( VIM <= 1.41259 )
				if( VIM <= 1.39997 )
					if( VIP <= 0.627549 )
						if( VIP <= 0.519156 )
							ret := -1.000000 // sell
						if( VIP > 0.519156 )
							ret := 0.524752
					if( VIP > 0.627549 )
						ret := -1.000000 // sell
				if( VIM > 1.39997 )
					if( VIP <= 0.624839 )
						if( VIP_VIM <= -0.824394 )
							ret := -0.423077
						if( VIP_VIM > -0.824394 )
							ret := -0.939394 // sell
					if( VIP > 0.624839 )
						ret := 0.444444
			if( VIM > 1.41259 )
				if( VIP_VIM <= -1.30987 )
					if( VIP <= 1.14382 )
						if( VIP <= 0.920904 )
							ret := 0.901961 // buy
						if( VIP > 0.920904 )
							ret := 1.000000 // buy
					if( VIP > 1.14382 )
						if( VIP_VIM <= -1.74786 )
							ret := 1.000000 // buy
						if( VIP_VIM > -1.74786 )
							ret := 0.387097
				if( VIP_VIM > -1.30987 )
					if( VIP_VIM <= -0.885759 )
						if( VIP_VIM <= -0.949905 )
							ret := 0.291581
						if( VIP_VIM > -0.949905 )
							ret := -0.018692
					if( VIP_VIM > -0.885759 )
						if( VIP <= 1.39712 )
							ret := 0.363158
						if( VIP > 1.39712 )
							ret := 0.705479 // buy
		if( VIM > 8.06325 )
			if( VIP <= 12.065 )
				if( VIP <= 6.08635 )
					ret := 0.500000
				if( VIP > 6.08635 )
					if( VIP <= 8.46975 )
						if( VIP_VIM <= -1.09092 )
							ret := -1.000000 // sell
						if( VIP_VIM > -1.09092 )
							ret := 0.000000
					if( VIP > 8.46975 )
						if( VIM <= 11.5912 )
							ret := 0.400000
						if( VIM > 11.5912 )
							ret := -1.000000 // sell
			if( VIP > 12.065 )
				if( VIP <= 16.8733 )
					if( VIM <= 15.3525 )
						ret := 1.000000 // buy
					if( VIM > 15.3525 )
						ret := 0.444444
				if( VIP > 16.8733 )
					if( VIP_VIM <= -1.35475 )
						if( VIP <= 49.8893 )
							ret := -1.000000 // sell
						if( VIP > 49.8893 )
							ret := -0.750000 // sell
					if( VIP_VIM > -1.35475 )
						if( VIM <= 29.4244 )
							ret := 0.625000
						if( VIM > 29.4244 )
							ret := -1.000000 // sell
	if( VIP_VIM > -0.761943 )
		if( VIP <= 4.55934 )
			if( VIM <= 2.52794 )
				if( VIP <= 0.636769 )
					if( VIM <= 1.21903 )
						ret := 0.571429
					if( VIM > 1.21903 )
						if( VIP <= 0.626244 )
							ret := -0.274510
						if( VIP > 0.626244 )
							ret := -0.614458
				if( VIP > 0.636769 )
					if( VIM <= 2.38114 )
						if( VIP_VIM <= -0.666658 )
							ret := 0.232804
						if( VIP_VIM > -0.666658 )
							ret := -0.007169
					if( VIM > 2.38114 )
						if( VIM <= 2.49156 )
							ret := -0.500000
						if( VIM > 2.49156 )
							ret := -0.023810
			if( VIM > 2.52794 )
				if( VIP_VIM <= 0.402086 )
					if( VIM <= 3.15488 )
						if( VIM <= 2.95011 )
							ret := 0.313953
						if( VIM > 2.95011 )
							ret := 0.722689 // buy
					if( VIM > 3.15488 )
						if( VIP <= 3.40683 )
							ret := -0.179012
						if( VIP > 3.40683 )
							ret := 0.209059
				if( VIP_VIM > 0.402086 )
					if( VIP_VIM <= 1.10084 )
						if( VIP <= 4.46304 )
							ret := -0.413408
						if( VIP > 4.46304 )
							ret := 1.000000 // buy
					if( VIP_VIM > 1.10084 )
						if( VIP_VIM <= 1.26749 )
							ret := 0.956522 // buy
						if( VIP_VIM > 1.26749 )
							ret := 0.000000
		if( VIP > 4.55934 )
			if( VIP_VIM <= 0.820938 )
				if( VIP <= 7.19208 )
					if( VIP_VIM <= -0.025806 )
						if( VIM <= 5.36832 )
							ret := 0.478261
						if( VIM > 5.36832 )
							ret := -0.461538
					if( VIP_VIM > -0.025806 )
						if( VIP_VIM <= 0.391194 )
							ret := -0.753086 // sell
						if( VIP_VIM > 0.391194 )
							ret := -0.350877
				if( VIP > 7.19208 )
					if( VIM <= 23.6774 )
						if( VIP <= 13.3367 )
							ret := -0.289157
						if( VIP > 13.3367 )
							ret := 0.954545 // buy
					if( VIM > 23.6774 )
						if( VIP <= 44.0514 )
							ret := -1.000000 // sell
						if( VIP > 44.0514 )
							ret := 0.000000
			if( VIP_VIM > 0.820938 )
				if( VIP <= 57.5873 )
					if( VIM <= 3.50863 )
						ret := -1.000000 // sell
					if( VIM > 3.50863 )
						if( VIP_VIM <= 2.73238 )
							ret := 0.625000
						if( VIP_VIM > 2.73238 )
							ret := -0.500000
				if( VIP > 57.5873 )
					ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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
float op_operation = decision_tree_0_SPOT_5Min_66776b0b(VIP_VIM, VIM, VIP)

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


