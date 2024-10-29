//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: ZI_15Min_2TV0_e558489a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ZI_15Min_2TV0_e558489a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ZI_15Min_e558489a(ema2, tema, ema12, ema3, ema1, ema13, VIP_VIM, VIP, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( ema12 <= -0.510392 )
		if( ema1 <= 63.3984 )
			if( tema <= 47.2353 )
				if( VIP_VIM <= -0.623822 )
					if( ema12 <= -0.795044 )
						if( VIP_VIM <= -0.798357 )
							ret := 0.729508 // buy
						if( VIP_VIM > -0.798357 )
							ret := 0.260000
					if( ema12 > -0.795044 )
						if( ema13 <= -1.22648 )
							ret := -0.636364
						if( ema13 > -1.22648 )
							ret := 0.098214
				if( VIP_VIM > -0.623822 )
					if( ema3 <= 47.6272 )
						if( VIM <= 1.63079 )
							ret := 0.642857
						if( VIM > 1.63079 )
							ret := -0.852941 // sell
					if( ema3 > 47.6272 )
						if( ema13 <= -0.810017 )
							ret := 0.992248 // buy
						if( ema13 > -0.810017 )
							ret := 0.250000
			if( tema > 47.2353 )
				if( ema2 <= 49.9977 )
					if( VIP_VIM <= -0.492148 )
						if( ema3 <= 50.9303 )
							ret := -0.780822 // sell
						if( ema3 > 50.9303 )
							ret := 1.000000 // buy
					if( VIP_VIM > -0.492148 )
						if( ema13 <= -1.31611 )
							ret := 1.000000 // buy
						if( ema13 > -1.31611 )
							ret := 0.444444
				if( ema2 > 49.9977 )
					if( ema13 <= -2.71128 )
						if( ema1 <= 54.4238 )
							ret := -0.967742 // sell
						if( ema1 > 54.4238 )
							ret := 1.000000 // buy
					if( ema13 > -2.71128 )
						if( tema <= 48.4134 )
							ret := 0.891892 // buy
						if( tema > 48.4134 )
							ret := 0.224845
		if( ema1 > 63.3984 )
			if( tema <= 65.2773 )
				if( VIM <= 1.35396 )
					if( VIP <= 0.631392 )
						ret := 0.666667
					if( VIP > 0.631392 )
						if( VIM <= 1.17284 )
							ret := -0.250000
						if( VIM > 1.17284 )
							ret := -0.979167 // sell
				if( VIM > 1.35396 )
					if( ema2 <= 66.517 )
						if( ema12 <= -0.770629 )
							ret := 0.000000
						if( ema12 > -0.770629 )
							ret := 0.857143 // buy
					if( ema2 > 66.517 )
						if( ema1 <= 66.1146 )
							ret := -1.000000 // sell
						if( ema1 > 66.1146 )
							ret := -0.636364
			if( tema > 65.2773 )
				if( VIP_VIM <= -0.541771 )
					if( ema2 <= 70.9016 )
						ret := 0.000000
					if( ema2 > 70.9016 )
						if( VIM <= 1.45046 )
							ret := -0.222222
						if( VIM > 1.45046 )
							ret := -1.000000 // sell
				if( VIP_VIM > -0.541771 )
					if( ema1 <= 70.7461 )
						if( ema3 <= 71.3495 )
							ret := 0.533333
						if( ema3 > 71.3495 )
							ret := -0.857143 // sell
					if( ema1 > 70.7461 )
						if( ema12 <= -0.973523 )
							ret := 0.000000
						if( ema12 > -0.973523 )
							ret := 0.846154 // buy
	if( ema12 > -0.510392 )
		if( ema2 <= 45.6847 )
			if( VIP_VIM <= -0.20378 )
				if( ema2 <= 44.1696 )
					if( ema12 <= 0.060385 )
						if( VIP_VIM <= -0.735856 )
							ret := 0.165000
						if( VIP_VIM > -0.735856 )
							ret := -0.062507
					if( ema12 > 0.060385 )
						if( ema1 <= 42.9393 )
							ret := -0.383333
						if( ema1 > 42.9393 )
							ret := -0.975610 // sell
				if( ema2 > 44.1696 )
					if( tema <= 43.9603 )
						if( VIM <= 1.19749 )
							ret := -0.103448
						if( VIM > 1.19749 )
							ret := 0.813084 // buy
					if( tema > 43.9603 )
						if( ema12 <= -0.25998 )
							ret := -0.342282
						if( ema12 > -0.25998 )
							ret := 0.208000
			if( VIP_VIM > -0.20378 )
				if( tema <= 9.21352 )
					if( ema2 <= 8.60497 )
						if( ema3 <= 8.16728 )
							ret := 0.589744
						if( ema3 > 8.16728 )
							ret := -0.247312
					if( ema2 > 8.60497 )
						if( ema3 <= 9.15242 )
							ret := 0.786096 // buy
						if( ema3 > 9.15242 )
							ret := -0.148148
				if( tema > 9.21352 )
					if( VIM <= 0.590991 )
						if( ema3 <= 11.973 )
							ret := -0.666667
						if( ema3 > 11.973 )
							ret := 0.523256
					if( VIM > 0.590991 )
						if( VIM <= 2.34279 )
							ret := 0.040927
						if( VIM > 2.34279 )
							ret := -0.291228
		if( ema2 > 45.6847 )
			if( ema3 <= 46.4771 )
				if( tema <= 47.8138 )
					if( VIM <= 1.5825 )
						if( ema3 <= 45.4711 )
							ret := 0.629630
						if( ema3 > 45.4711 )
							ret := -0.319030
					if( VIM > 1.5825 )
						if( ema13 <= -0.099111 )
							ret := 0.808511 // buy
						if( ema13 > -0.099111 )
							ret := -0.571429
				if( tema > 47.8138 )
					if( ema13 <= 1.43902 )
						if( ema2 <= 45.9866 )
							ret := 0.000000
						if( ema2 > 45.9866 )
							ret := 1.000000 // buy
					if( ema13 > 1.43902 )
						if( tema <= 48.8615 )
							ret := 1.000000 // buy
						if( tema > 48.8615 )
							ret := -0.714286 // sell
			if( ema3 > 46.4771 )
				if( ema1 <= 48.2624 )
					if( ema13 <= -0.34475 )
						if( ema13 <= -0.890949 )
							ret := 0.782609 // buy
						if( ema13 > -0.890949 )
							ret := -0.221441
					if( ema13 > -0.34475 )
						if( ema1 <= 47.1699 )
							ret := 0.544747
						if( ema1 > 47.1699 )
							ret := 0.109815
				if( ema1 > 48.2624 )
					if( ema2 <= 48.3395 )
						if( ema1 <= 48.3415 )
							ret := -0.839506 // sell
						if( ema1 > 48.3415 )
							ret := -0.412766
					if( ema2 > 48.3395 )
						if( VIP <= 1.24746 )
							ret := -0.092638
						if( VIP > 1.24746 )
							ret := 0.017107
	
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
float op_operation = decision_tree_0_ZI_15Min_e558489a(ema2, tema, ema12, ema3, ema1, ema13, VIP_VIM, VIP, VIM)

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


