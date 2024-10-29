//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: TSLA_30Min_2TV0_e20476c7 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TSLA_30Min_2TV0_e20476c7", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TSLA_30Min_e20476c7(ema2, ema1, ema12, ema3, ema13, tema, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( ema13 <= 6.26753 )
		if( tema <= 2166.15 )
			if( ema12 <= -1.31167 )
				if( ema2 <= 531.996 )
					if( ema1 <= 509.245 )
						if( tema <= 495.908 )
							if( ema2 <= 497.678 )
								ret := -0.091793
							if( ema2 > 497.678 )
								ret := -0.893617 // sell
						if( tema > 495.908 )
							if( ema13 <= -6.74688 )
								ret := 0.847458 // buy
							if( ema13 > -6.74688 )
								ret := 0.016393
					if( ema1 > 509.245 )
						if( VIM <= 1.07362 )
							if( VIP_VIM <= -0.058003 )
								ret := 0.750000 // buy
							if( VIP_VIM > -0.058003 )
								ret := -0.600000
						if( VIM > 1.07362 )
							if( tema <= 519.64 )
								ret := -0.911765 // sell
							if( tema > 519.64 )
								ret := -0.703704 // sell
				if( ema2 > 531.996 )
					if( tema <= 561.428 )
						if( ema2 <= 1482.19 )
							if( VIM <= 21.5777 )
								ret := 0.631746
							if( VIM > 21.5777 )
								ret := -0.888889 // sell
						if( ema2 > 1482.19 )
							ret := -1.000000 // sell
					if( tema > 561.428 )
						if( ema12 <= -11.6327 )
							if( ema1 <= 716.48 )
								ret := 0.271084
							if( ema1 > 716.48 )
								ret := -0.316469
						if( ema12 > -11.6327 )
							if( tema <= 1468.87 )
								ret := -0.008533
							if( tema > 1468.87 )
								ret := 0.446494
			if( ema12 > -1.31167 )
				if( ema2 <= 119.683 )
					if( ema13 <= 3.28389 )
						if( tema <= 114.63 )
							if( ema1 <= 113.442 )
								ret := 0.212644
							if( ema1 > 113.442 )
								ret := -1.000000 // sell
						if( tema > 114.63 )
							if( ema13 <= 0.693178 )
								ret := 0.625000
							if( ema13 > 0.693178 )
								ret := 0.941176 // buy
					if( ema13 > 3.28389 )
						if( ema3 <= 115.584 )
							ret := 0.000000
						if( ema3 > 115.584 )
							if( ema13 <= 3.82214 )
								ret := -1.000000 // sell
							if( ema13 > 3.82214 )
								ret := -0.750000 // sell
				if( ema2 > 119.683 )
					if( ema1 <= 119.99 )
						if( VIP <= 0.90403 )
							ret := -0.750000 // sell
						if( VIP > 0.90403 )
							ret := -1.000000 // sell
					if( ema1 > 119.99 )
						if( ema2 <= 1582.83 )
							if( ema1 <= 1100.46 )
								ret := 0.002711
							if( ema1 > 1100.46 )
								ret := -0.261708
						if( ema2 > 1582.83 )
							if( VIP_VIM <= -0.038005 )
								ret := 0.040000
							if( VIP_VIM > -0.038005 )
								ret := 0.785714 // buy
		if( tema > 2166.15 )
			ret := -1.000000 // sell
	if( ema13 > 6.26753 )
		if( tema <= 686.967 )
			if( ema12 <= 7.21786 )
				if( ema3 <= 664.582 )
					if( VIM <= 1.16378 )
						if( ema3 <= 660.393 )
							if( ema3 <= 645.89 )
								ret := 0.246686
							if( ema3 > 645.89 )
								ret := 0.543046
						if( ema3 > 660.393 )
							if( ema1 <= 675.817 )
								ret := -0.736842 // sell
							if( ema1 > 675.817 )
								ret := 1.000000 // buy
					if( VIM > 1.16378 )
						if( ema13 <= 8.96528 )
							if( ema1 <= 357.254 )
								ret := -0.750000 // sell
							if( ema1 > 357.254 )
								ret := -1.000000 // sell
						if( ema13 > 8.96528 )
							ret := 0.400000
				if( ema3 > 664.582 )
					if( ema3 <= 671.887 )
						if( VIP <= 1.26649 )
							if( ema2 <= 668.722 )
								ret := 0.000000
							if( ema2 > 668.722 )
								ret := 0.970000 // buy
						if( VIP > 1.26649 )
							ret := 0.000000
					if( ema3 > 671.887 )
						if( tema <= 685.985 )
							ret := -1.000000 // sell
						if( tema > 685.985 )
							ret := 0.000000
			if( ema12 > 7.21786 )
				if( ema3 <= 573.475 )
					if( ema3 <= 556.948 )
						if( ema3 <= 441.221 )
							if( tema <= 429.858 )
								ret := 0.113333
							if( tema > 429.858 )
								ret := -0.827586 // sell
						if( ema3 > 441.221 )
							if( ema13 <= 23.5315 )
								ret := 0.389831
							if( ema13 > 23.5315 )
								ret := -0.850000 // sell
					if( ema3 > 556.948 )
						ret := -1.000000 // sell
				if( ema3 > 573.475 )
					if( ema1 <= 633.511 )
						if( VIM <= 0.565514 )
							if( ema2 <= 607.899 )
								ret := 0.000000
							if( ema2 > 607.899 )
								ret := -0.750000 // sell
						if( VIM > 0.565514 )
							if( ema12 <= 7.40644 )
								ret := 0.125000
							if( ema12 > 7.40644 )
								ret := 0.835052 // buy
					if( ema1 > 633.511 )
						if( ema2 <= 653.02 )
							if( ema12 <= 9.65461 )
								ret := -0.755556 // sell
							if( ema12 > 9.65461 )
								ret := 0.103448
						if( ema2 > 653.02 )
							if( ema3 <= 651.844 )
								ret := 0.937500 // buy
							if( ema3 > 651.844 )
								ret := 0.157895
		if( tema > 686.967 )
			if( ema13 <= 14.137 )
				if( ema3 <= 1092 )
					if( ema1 <= 846.595 )
						if( ema1 <= 842.596 )
							if( ema3 <= 673.185 )
								ret := 0.700000 // buy
							if( ema3 > 673.185 )
								ret := -0.095737
						if( ema1 > 842.596 )
							if( VIM <= 0.783532 )
								ret := 0.000000
							if( VIM > 0.783532 )
								ret := -0.882353 // sell
					if( ema1 > 846.595 )
						if( ema3 <= 858.9 )
							if( VIP_VIM <= 0.571019 )
								ret := 0.657143
							if( VIP_VIM > 0.571019 )
								ret := -0.592593
						if( ema3 > 858.9 )
							if( ema3 <= 1056.95 )
								ret := 0.015439
							if( ema3 > 1056.95 )
								ret := 0.523438
				if( ema3 > 1092 )
					if( tema <= 1603.65 )
						if( ema2 <= 1486.8 )
							if( tema <= 1115.26 )
								ret := -0.757143 // sell
							if( tema > 1115.26 )
								ret := -0.055556
						if( ema2 > 1486.8 )
							if( VIP_VIM <= 0.095285 )
								ret := -0.285714
							if( VIP_VIM > 0.095285 )
								ret := -0.908333 // sell
					if( tema > 1603.65 )
						if( ema2 <= 2212.25 )
							if( VIP_VIM <= -0.041883 )
								ret := -0.857143 // sell
							if( VIP_VIM > -0.041883 )
								ret := 0.709677 // buy
						if( ema2 > 2212.25 )
							ret := -1.000000 // sell
			if( ema13 > 14.137 )
				if( ema2 <= 1100.24 )
					if( ema1 <= 762.866 )
						if( ema3 <= 732.377 )
							if( tema <= 764.478 )
								ret := 0.362573
							if( tema > 764.478 )
								ret := -0.885714 // sell
						if( ema3 > 732.377 )
							if( VIP_VIM <= 0.676718 )
								ret := 0.944444 // buy
							if( VIP_VIM > 0.676718 )
								ret := 0.272727
					if( ema1 > 762.866 )
						if( ema12 <= 6.7868 )
							if( ema13 <= 14.3372 )
								ret := 0.700000 // buy
							if( ema13 > 14.3372 )
								ret := -0.623188
						if( ema12 > 6.7868 )
							if( VIP <= 1.14638 )
								ret := -0.582418
							if( VIP > 1.14638 )
								ret := 0.075650
				if( ema2 > 1100.24 )
					if( tema <= 1199.93 )
						if( VIM <= 0.639561 )
							if( ema12 <= 12.8222 )
								ret := -0.500000
							if( ema12 > 12.8222 )
								ret := 0.166667
						if( VIM > 0.639561 )
							if( VIP <= 1.2251 )
								ret := 0.571429
							if( VIP > 1.2251 )
								ret := 0.883495 // buy
					if( tema > 1199.93 )
						if( ema12 <= 44.2489 )
							if( ema13 <= 61.921 )
								ret := 0.227506
							if( ema13 > 61.921 )
								ret := 0.757576 // buy
						if( ema12 > 44.2489 )
							if( ema12 <= 49.2856 )
								ret := -0.750000 // sell
							if( ema12 > 49.2856 )
								ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_TSLA_30Min_e20476c7(ema2, ema1, ema12, ema3, ema13, tema, VIP, VIP_VIM, VIM)

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


