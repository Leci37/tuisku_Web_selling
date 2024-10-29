//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: RUN_1Min_2TV0_410fd0e0 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_RUN_1Min_2TV0_410fd0e0", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_RUN_1Min_410fd0e0(ema1, tema, ema12, ema2, ema3, ema13, VIP_VIM, VIM, VIP)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( ema12 <= -0.001381 )
		if( VIM <= 5.22094 )
			if( ema2 <= 17.6453 )
				if( ema3 <= 13.5131 )
					if( ema2 <= 12.5877 )
						if( VIP_VIM <= -0.040221 )
							ret := 0.006042
						if( VIP_VIM > -0.040221 )
							ret := 0.195238
					if( ema2 > 12.5877 )
						if( ema2 <= 13.4736 )
							ret := -0.105150
						if( ema2 > 13.4736 )
							ret := -0.697917
				if( ema3 > 13.5131 )
					if( ema3 <= 13.6043 )
						if( VIP_VIM <= -0.438517 )
							ret := 0.118644
						if( VIP_VIM > -0.438517 )
							ret := 0.664336
					if( ema3 > 13.6043 )
						if( ema1 <= 14.3701 )
							ret := -0.007760
						if( ema1 > 14.3701 )
							ret := 0.142626
			if( ema2 > 17.6453 )
				if( tema <= 20.5898 )
					if( ema2 <= 20.4317 )
						if( ema3 <= 17.7219 )
							ret := -0.383607
						if( ema3 > 17.7219 )
							ret := -0.030521
					if( ema2 > 20.4317 )
						if( ema1 <= 20.5348 )
							ret := -0.634021
						if( ema1 > 20.5348 )
							ret := -0.126168
				if( tema > 20.5898 )
					if( tema <= 21.558 )
						if( tema <= 20.6262 )
							ret := 0.663043
						if( tema > 20.6262 )
							ret := 0.202778
					if( tema > 21.558 )
						if( ema3 <= 21.6124 )
							ret := 0.000000
						if( ema3 > 21.6124 )
							ret := -0.950000 // sell
		if( VIM > 5.22094 )
			if( tema <= 18.0977 )
				if( VIP_VIM <= -0.55734 )
					if( ema3 <= 17.8224 )
						if( VIP_VIM <= -0.94927 )
							ret := 0.270694
						if( VIP_VIM > -0.94927 )
							ret := 0.625000
					if( ema3 > 17.8224 )
						if( VIP_VIM <= -1.06494 )
							ret := -0.166667
						if( VIP_VIM > -1.06494 )
							ret := -1.000000 // sell
				if( VIP_VIM > -0.55734 )
					if( VIP_VIM <= 2.6232 )
						if( VIM <= 5.29563 )
							ret := 1.000000 // buy
						if( VIM > 5.29563 )
							ret := -0.023088
					if( VIP_VIM > 2.6232 )
						if( ema13 <= -0.066468 )
							ret := 0.000000
						if( ema13 > -0.066468 )
							ret := 0.920000 // buy
			if( tema > 18.0977 )
				if( ema12 <= -0.003173 )
					if( ema2 <= 20.5304 )
						if( VIM <= 1158.52 )
							ret := 0.626126
						if( VIM > 1158.52 )
							ret := -1.000000 // sell
					if( ema2 > 20.5304 )
						if( ema13 <= -0.027964 )
							ret := -0.100000
						if( ema13 > -0.027964 )
							ret := 0.772727 // buy
				if( ema12 > -0.003173 )
					if( VIP_VIM <= 1.01177 )
						ret := 0.545455
					if( VIP_VIM > 1.01177 )
						ret := -0.750000 // sell
	if( ema12 > -0.001381 )
		if( ema13 <= 0.130787 )
			if( VIM <= 1.04293 )
				if( ema2 <= 9.95259 )
					if( tema <= 9.96538 )
						if( tema <= 9.94539 )
							ret := 0.202346
						if( tema > 9.94539 )
							ret := -0.533333
					if( tema > 9.96538 )
						if( ema1 <= 9.9691 )
							ret := 0.901639 // buy
						if( ema1 > 9.9691 )
							ret := 0.000000
				if( ema2 > 9.95259 )
					if( tema <= 10.018 )
						if( ema2 <= 9.99196 )
							ret := -0.500000
						if( ema2 > 9.99196 )
							ret := -0.896552 // sell
					if( tema > 10.018 )
						if( ema2 <= 21.5951 )
							ret := -0.011762
						if( ema2 > 21.5951 )
							ret := -0.809524 // sell
			if( VIM > 1.04293 )
				if( VIM <= 3.04718 )
					if( ema1 <= 21.2164 )
						if( ema3 <= 18.2387 )
							ret := -0.158797
						if( ema3 > 18.2387 )
							ret := 0.012160
					if( ema1 > 21.2164 )
						if( ema3 <= 21.4978 )
							ret := -0.806452 // sell
						if( ema3 > 21.4978 )
							ret := -0.312500
				if( VIM > 3.04718 )
					if( VIP <= 9.34854 )
						if( VIP <= 4.83047 )
							ret := -0.039275
						if( VIP > 4.83047 )
							ret := 0.183099
					if( VIP > 9.34854 )
						if( ema12 <= 0.038913 )
							ret := -0.089527
						if( ema12 > 0.038913 )
							ret := -0.515152
		if( ema13 > 0.130787 )
			if( ema1 <= 13.13 )
				if( ema12 <= 0.123832 )
					if( ema2 <= 12.4109 )
						if( ema2 <= 10.2731 )
							ret := 0.592593
						if( ema2 > 10.2731 )
							ret := -0.303249
					if( ema2 > 12.4109 )
						if( VIP_VIM <= 0.289351 )
							ret := -0.944444 // sell
						if( VIP_VIM > 0.289351 )
							ret := 0.512605
				if( ema12 > 0.123832 )
					if( ema2 <= 11.5534 )
						if( ema13 <= 0.279718 )
							ret := 0.891892 // buy
						if( ema13 > 0.279718 )
							ret := 0.000000
					if( ema2 > 11.5534 )
						if( VIM <= 0.642125 )
							ret := -0.750000 // sell
						if( VIM > 0.642125 )
							ret := 0.527778
			if( ema1 > 13.13 )
				if( ema3 <= 20.3973 )
					if( VIP <= 5.37666 )
						if( VIP_VIM <= 0.156254 )
							ret := 0.387097
						if( VIP_VIM > 0.156254 )
							ret := -0.277712
					if( VIP > 5.37666 )
						if( ema3 <= 13.5099 )
							ret := 0.200000
						if( ema3 > 13.5099 )
							ret := -0.837500 // sell
				if( ema3 > 20.3973 )
					if( ema2 <= 20.5791 )
						if( tema <= 20.6558 )
							ret := -1.000000 // sell
						if( tema > 20.6558 )
							ret := 0.971429 // buy
					if( ema2 > 20.5791 )
						if( tema <= 21.2479 )
							ret := -0.442308
						if( tema > 21.2479 )
							ret := 0.481481
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_RUN_1Min_410fd0e0(ema1, tema, ema12, ema2, ema3, ema13, VIP_VIM, VIM, VIP)

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


