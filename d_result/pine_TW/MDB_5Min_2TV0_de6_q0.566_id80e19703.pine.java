//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: MDB_5Min_2TV0_80e19703 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MDB_5Min_2TV0_80e19703", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MDB_5Min_80e19703(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( ema3 <= 223.475 )
		if( VIM <= 1.35243 )
			if( ema2 <= 222.471 )
				if( ema2 <= 221.822 )
					if( VIM <= 0.757604 )
						ret := -0.727273 // sell
					if( VIM > 0.757604 )
						if( ema13 <= 0.842088 )
							ret := 0.157258
						if( ema13 > 0.842088 )
							ret := 0.615894
				if( ema2 > 221.822 )
					if( VIP_VIM <= 0.428017 )
						if( ema1 <= 221.865 )
							ret := 0.120000
						if( ema1 > 221.865 )
							ret := -0.739726 // sell
					if( VIP_VIM > 0.428017 )
						ret := 0.600000
			if( ema2 > 222.471 )
				if( ema12 <= 1.34996 )
					if( VIP_VIM <= -0.120217 )
						if( VIP <= 0.937231 )
							ret := 0.666667
						if( VIP > 0.937231 )
							ret := -0.181818
					if( VIP_VIM > -0.120217 )
						if( VIM <= 0.703374 )
							ret := 0.300000
						if( VIM > 0.703374 )
							ret := 0.838710 // buy
				if( ema12 > 1.34996 )
					if( VIP_VIM <= 0.81572 )
						if( ema1 <= 225.753 )
							ret := -1.000000 // sell
						if( ema1 > 225.753 )
							ret := -0.714286 // sell
					if( VIP_VIM > 0.81572 )
						ret := 0.875000 // buy
		if( VIM > 1.35243 )
			if( VIP <= 5.92346 )
				if( tema <= 226.41 )
					if( VIP <= 0.794274 )
						ret := 0.000000
					if( VIP > 0.794274 )
						if( VIM <= 2.85974 )
							ret := 0.866310 // buy
						if( VIM > 2.85974 )
							ret := 0.451613
				if( tema > 226.41 )
					ret := -0.647059
			if( VIP > 5.92346 )
				ret := -0.941176 // sell
	if( ema3 > 223.475 )
		if( ema12 <= -2.06469 )
			if( ema12 <= -4.63837 )
				if( VIM <= 1.49161 )
					if( ema13 <= -8.87451 )
						if( ema3 <= 383.519 )
							ret := -0.536585
						if( ema3 > 383.519 )
							ret := 0.215385
					if( ema13 > -8.87451 )
						if( tema <= 413.654 )
							ret := 1.000000 // buy
						if( tema > 413.654 )
							ret := 0.636364
				if( VIM > 1.49161 )
					if( tema <= 364.8 )
						if( ema3 <= 274.431 )
							ret := -0.931034 // sell
						if( ema3 > 274.431 )
							ret := 0.434783
					if( tema > 364.8 )
						if( VIM <= 1.92963 )
							ret := -0.867647 // sell
						if( VIM > 1.92963 )
							ret := -0.357143
			if( ema12 > -4.63837 )
				if( VIP <= 0.774159 )
					if( ema1 <= 394.439 )
						if( ema2 <= 392.58 )
							ret := 0.459649
						if( ema2 > 392.58 )
							ret := -0.500000
					if( ema1 > 394.439 )
						if( ema12 <= -2.48324 )
							ret := 0.816568 // buy
						if( ema12 > -2.48324 )
							ret := 0.504950
				if( VIP > 0.774159 )
					if( tema <= 407.724 )
						if( VIP_VIM <= 0.346139 )
							ret := 0.417910
						if( VIP_VIM > 0.346139 )
							ret := -0.916667 // sell
					if( tema > 407.724 )
						if( VIP <= 1.79966 )
							ret := -0.611111
						if( VIP > 1.79966 )
							ret := 0.600000
		if( ema12 > -2.06469 )
			if( ema12 <= 1.22471 )
				if( VIP_VIM <= 0.291664 )
					if( ema13 <= 0.613557 )
						if( VIP_VIM <= -0.698851 )
							ret := -0.169789
						if( VIP_VIM > -0.698851 )
							ret := 0.011350
					if( ema13 > 0.613557 )
						if( VIP <= 0.90361 )
							ret := 0.680000
						if( VIP > 0.90361 )
							ret := -0.111287
				if( VIP_VIM > 0.291664 )
					if( ema2 <= 234.401 )
						if( ema1 <= 234.281 )
							ret := -0.160326
						if( ema1 > 234.281 )
							ret := -0.833333 // sell
					if( ema2 > 234.401 )
						if( tema <= 244.101 )
							ret := 0.485804
						if( tema > 244.101 )
							ret := 0.074385
			if( ema12 > 1.22471 )
				if( tema <= 395.41 )
					if( ema2 <= 231.909 )
						if( VIP <= 1.44222 )
							ret := -0.666667
						if( VIP > 1.44222 )
							ret := 0.801653 // buy
					if( ema2 > 231.909 )
						if( ema2 <= 243.092 )
							ret := -0.581673
						if( ema2 > 243.092 )
							ret := 0.019337
				if( tema > 395.41 )
					if( ema3 <= 393.562 )
						if( VIP <= 1.19305 )
							ret := -0.285714
						if( VIP > 1.19305 )
							ret := -0.870968 // sell
					if( ema3 > 393.562 )
						if( ema2 <= 412.514 )
							ret := -0.114701
						if( ema2 > 412.514 )
							ret := -0.393548
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_MDB_5Min_80e19703(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)

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


