//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: PINS_5Min_2TV0_f390b763 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PINS_5Min_2TV0_f390b763", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PINS_5Min_f390b763(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( ema12 <= -0.000138 )
		if( VIP <= 1.59167 )
			if( ema13 <= -0.255111 )
				if( ema1 <= 35.3257 )
					if( ema2 <= 35.0357 )
						if( ema13 <= -0.589594 )
							ret := -0.286667
						if( ema13 > -0.589594 )
							ret := 0.272857
					if( ema2 > 35.0357 )
						if( VIP_VIM <= -0.561969 )
							ret := -0.915254 // sell
						if( VIP_VIM > -0.561969 )
							ret := 0.357143
				if( ema1 > 35.3257 )
					if( VIP <= 0.920677 )
						if( ema2 <= 40.1595 )
							ret := 0.655367
						if( ema2 > 40.1595 )
							ret := 0.300813
					if( VIP > 0.920677 )
						if( VIP_VIM <= -0.454247 )
							ret := 0.181818
						if( VIP_VIM > -0.454247 )
							ret := -0.666667
			if( ema13 > -0.255111 )
				if( VIP <= 0.842904 )
					if( tema <= 44.034 )
						if( VIP_VIM <= -1.10213 )
							ret := -0.733333 // sell
						if( VIP_VIM > -1.10213 )
							ret := 0.082780
					if( tema > 44.034 )
						if( ema2 <= 44.3562 )
							ret := -0.716981 // sell
						if( ema2 > 44.3562 )
							ret := 0.181818
				if( VIP > 0.842904 )
					if( ema3 <= 36.3302 )
						if( ema2 <= 35.1519 )
							ret := 0.003207
						if( ema2 > 35.1519 )
							ret := 0.229527
					if( ema3 > 36.3302 )
						if( ema1 <= 36.3544 )
							ret := -0.868132 // sell
						if( ema1 > 36.3544 )
							ret := -0.049414
		if( VIP > 1.59167 )
			if( VIM <= 1.86472 )
				if( ema12 <= -0.028752 )
					if( ema3 <= 31.2869 )
						if( VIM <= 1.51506 )
							ret := 0.238095
						if( VIM > 1.51506 )
							ret := 0.892308 // buy
					if( ema3 > 31.2869 )
						if( ema2 <= 35.0191 )
							ret := 0.134328
						if( ema2 > 35.0191 )
							ret := 0.658537
				if( ema12 > -0.028752 )
					if( VIP_VIM <= 0.203524 )
						if( ema2 <= 26.7647 )
							ret := 0.606557
						if( ema2 > 26.7647 )
							ret := -0.211268
					if( VIP_VIM > 0.203524 )
						if( tema <= 25.0212 )
							ret := -0.640000
						if( tema > 25.0212 )
							ret := 0.534247
			if( VIM > 1.86472 )
				if( ema13 <= -0.225617 )
					if( ema3 <= 36.6125 )
						ret := 0.444444
					if( ema3 > 36.6125 )
						if( VIP_VIM <= -0.834243 )
							ret := -0.307692
						if( VIP_VIM > -0.834243 )
							ret := -0.948718 // sell
				if( ema13 > -0.225617 )
					if( ema13 <= 0.002491 )
						if( ema12 <= -0.01239 )
							ret := 0.156602
						if( ema12 > -0.01239 )
							ret := -0.104430
					if( ema13 > 0.002491 )
						if( VIP <= 2.01171 )
							ret := -0.400000
						if( VIP > 2.01171 )
							ret := 0.526012
	if( ema12 > -0.000138 )
		if( VIM <= 0.677379 )
			if( VIM <= 0.549006 )
				if( ema12 <= 0.23005 )
					if( ema13 <= 0.269433 )
						if( VIM <= 0.513157 )
							ret := -0.571429
						if( VIM > 0.513157 )
							ret := -0.048387
					if( ema13 > 0.269433 )
						if( ema12 <= 0.191632 )
							ret := 0.210526
						if( ema12 > 0.191632 )
							ret := 0.818182 // buy
				if( ema12 > 0.23005 )
					if( VIP <= 1.38999 )
						ret := -0.357143
					if( VIP > 1.38999 )
						if( VIM <= 0.486294 )
							ret := -0.785714 // sell
						if( VIM > 0.486294 )
							ret := -1.000000 // sell
			if( VIM > 0.549006 )
				if( ema12 <= 0.087676 )
					if( ema13 <= 0.150487 )
						if( ema2 <= 33.4149 )
							ret := -0.085714
						if( ema2 > 33.4149 )
							ret := 0.220000
					if( ema13 > 0.150487 )
						if( VIP_VIM <= 0.675142 )
							ret := -0.928571 // sell
						if( VIP_VIM > 0.675142 )
							ret := -0.090909
				if( ema12 > 0.087676 )
					if( ema13 <= 0.657848 )
						if( VIP_VIM <= 0.85739 )
							ret := 0.394822
						if( VIP_VIM > 0.85739 )
							ret := -0.108108
					if( ema13 > 0.657848 )
						if( ema1 <= 38.6013 )
							ret := 0.276596
						if( ema1 > 38.6013 )
							ret := -1.000000 // sell
		if( VIM > 0.677379 )
			if( tema <= 44.435 )
				if( ema1 <= 21.4623 )
					if( ema3 <= 21.0475 )
						if( tema <= 20.9673 )
							ret := 0.600000
						if( tema > 20.9673 )
							ret := -0.709402 // sell
					if( ema3 > 21.0475 )
						if( VIM <= 0.99556 )
							ret := 0.679803
						if( VIM > 0.99556 )
							ret := 0.081633
				if( ema1 > 21.4623 )
					if( VIP_VIM <= -0.312201 )
						if( ema2 <= 36.5516 )
							ret := -0.358228
						if( ema2 > 36.5516 )
							ret := 0.176471
					if( VIP_VIM > -0.312201 )
						if( ema1 <= 44.2138 )
							ret := -0.048266
						if( ema1 > 44.2138 )
							ret := 0.556604
			if( tema > 44.435 )
				if( ema12 <= 0.029828 )
					if( VIP <= 0.938157 )
						ret := 0.909091 // buy
					if( VIP > 0.938157 )
						ret := -0.052632
				if( ema12 > 0.029828 )
					if( VIP <= 1.25856 )
						if( ema2 <= 44.3933 )
							ret := -0.555556
						if( ema2 > 44.3933 )
							ret := -0.912500 // sell
					if( VIP > 1.25856 )
						if( ema12 <= 0.131003 )
							ret := 0.033333
						if( ema12 > 0.131003 )
							ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_PINS_5Min_f390b763(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)

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


