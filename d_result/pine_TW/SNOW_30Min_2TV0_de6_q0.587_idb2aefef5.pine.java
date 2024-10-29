//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: SNOW_30Min_2TV0_b2aefef5 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNOW_30Min_2TV0_b2aefef5", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNOW_30Min_b2aefef5(ema1, tema, ema12, ema2, ema3, ema13, VIP_VIM, VIM, VIP)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( ema3 <= 128.95 )
		if( VIP_VIM <= 0.248787 )
			if( ema12 <= 0.357748 )
				if( ema2 <= 125.605 )
					if( ema2 <= 122.426 )
						if( tema <= 113.426 )
							ret := 0.350534
						if( tema > 113.426 )
							ret := 0.045714
					if( ema2 > 122.426 )
						if( ema1 <= 123.025 )
							ret := -0.801802 // sell
						if( ema1 > 123.025 )
							ret := 0.171975
				if( ema2 > 125.605 )
					if( ema1 <= 126.629 )
						if( tema <= 126.407 )
							ret := 0.613095
						if( tema > 126.407 )
							ret := 0.934426 // buy
					if( ema1 > 126.629 )
						if( ema2 <= 127.567 )
							ret := 0.036232
						if( ema2 > 127.567 )
							ret := 0.534884
			if( ema12 > 0.357748 )
				if( ema13 <= 2.05844 )
					if( ema3 <= 128.06 )
						if( ema1 <= 116.15 )
							ret := 0.461538
						if( ema1 > 116.15 )
							ret := 0.802083 // buy
					if( ema3 > 128.06 )
						ret := -1.000000 // sell
				if( ema13 > 2.05844 )
					if( VIP <= 1.21225 )
						ret := -1.000000 // sell
					if( VIP > 1.21225 )
						ret := 0.833333 // buy
		if( VIP_VIM > 0.248787 )
			if( tema <= 132.536 )
				if( ema12 <= 1.07688 )
					if( tema <= 128.642 )
						if( ema13 <= -0.060101 )
							ret := -0.642857
						if( ema13 > -0.060101 )
							ret := -0.031042
					if( tema > 128.642 )
						if( tema <= 130.621 )
							ret := 0.843137 // buy
						if( tema > 130.621 )
							ret := -0.166667
				if( ema12 > 1.07688 )
					if( ema3 <= 115.825 )
						if( ema3 <= 113.613 )
							ret := 0.000000
						if( ema3 > 113.613 )
							ret := 1.000000 // buy
					if( ema3 > 115.825 )
						if( ema13 <= 2.28562 )
							ret := -0.250000
						if( ema13 > 2.28562 )
							ret := -0.728261 // sell
			if( tema > 132.536 )
				if( ema12 <= 4.28092 )
					if( tema <= 133.823 )
						ret := 0.375000
					if( tema > 133.823 )
						if( ema2 <= 128.627 )
							ret := 0.500000
						if( ema2 > 128.627 )
							ret := 1.000000 // buy
				if( ema12 > 4.28092 )
					ret := 0.000000
	if( ema3 > 128.95 )
		if( ema1 <= 133.434 )
			if( ema2 <= 132.208 )
				if( VIM <= 1.104 )
					if( VIP_VIM <= 0.16336 )
						if( ema3 <= 129.497 )
							ret := -0.562500
						if( ema3 > 129.497 )
							ret := 0.401235
					if( VIP_VIM > 0.16336 )
						if( ema1 <= 132.242 )
							ret := -0.488889
						if( ema1 > 132.242 )
							ret := 0.692308
				if( VIM > 1.104 )
					if( ema13 <= -5.23183 )
						ret := 0.900000 // buy
					if( ema13 > -5.23183 )
						if( VIP <= 1.60969 )
							ret := -0.402703
						if( VIP > 1.60969 )
							ret := 0.833333 // buy
			if( ema2 > 132.208 )
				if( ema12 <= -1.00119 )
					if( ema3 <= 133.498 )
						ret := -1.000000 // sell
					if( ema3 > 133.498 )
						if( VIP_VIM <= -0.355758 )
							ret := 0.545455
						if( VIP_VIM > -0.355758 )
							ret := -0.583333
				if( ema12 > -1.00119 )
					if( ema12 <= -0.686537 )
						if( ema13 <= -1.95935 )
							ret := 0.333333
						if( ema13 > -1.95935 )
							ret := -0.895833 // sell
					if( ema12 > -0.686537 )
						if( VIP <= 0.950504 )
							ret := -0.114286
						if( VIP > 0.950504 )
							ret := -0.733333 // sell
		if( ema1 > 133.434 )
			if( tema <= 135.483 )
				if( ema12 <= -0.326501 )
					if( ema2 <= 138.082 )
						if( VIM <= 1.39663 )
							ret := 0.659483
						if( VIM > 1.39663 )
							ret := 0.157895
					if( ema2 > 138.082 )
						if( ema1 <= 138.927 )
							ret := -0.400000
						if( ema1 > 138.927 )
							ret := 1.000000 // buy
				if( ema12 > -0.326501 )
					if( VIM <= 0.902077 )
						if( ema13 <= 0.125768 )
							ret := -0.900000 // sell
						if( ema13 > 0.125768 )
							ret := -0.037037
					if( VIM > 0.902077 )
						if( ema3 <= 135.058 )
							ret := 0.553030
						if( ema3 > 135.058 )
							ret := -0.142857
			if( tema > 135.483 )
				if( ema3 <= 147.404 )
					if( ema1 <= 147.329 )
						if( ema12 <= 1.27536 )
							ret := 0.009020
						if( ema12 > 1.27536 )
							ret := 0.334320
					if( ema1 > 147.329 )
						if( ema12 <= 0.272344 )
							ret := -0.416667
						if( ema12 > 0.272344 )
							ret := 0.627240
				if( ema3 > 147.404 )
					if( VIP <= 0.541274 )
						if( ema13 <= -2.09603 )
							ret := 0.582011
						if( ema13 > -2.09603 )
							ret := -0.850000 // sell
					if( VIP > 0.541274 )
						if( tema <= 143.256 )
							ret := 0.577320
						if( tema > 143.256 )
							ret := -0.037973
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_SNOW_30Min_b2aefef5(ema1, tema, ema12, ema2, ema3, ema13, VIP_VIM, VIM, VIP)

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


