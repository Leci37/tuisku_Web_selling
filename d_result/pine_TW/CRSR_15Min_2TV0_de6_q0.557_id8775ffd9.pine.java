//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: CRSR_15Min_2TV0_8775ffd9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRSR_15Min_2TV0_8775ffd9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRSR_15Min_8775ffd9(ema3, tema, ema2, ema12, ema13, ema1, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( ema12 <= 0.009229 )
		if( VIP_VIM <= 0.10859 )
			if( ema12 <= -0.205799 )
				if( VIP_VIM <= -0.40147 )
					if( ema3 <= 14.974 )
						if( VIM <= 1.51128 )
							ret := 0.977273 // buy
						if( VIM > 1.51128 )
							ret := 0.680000
					if( ema3 > 14.974 )
						if( VIM <= 1.38988 )
							ret := 0.420022
						if( VIM > 1.38988 )
							ret := 0.113924
				if( VIP_VIM > -0.40147 )
					if( ema13 <= -0.388784 )
						if( ema3 <= 42.1256 )
							ret := -0.040123
						if( ema3 > 42.1256 )
							ret := -0.417989
					if( ema13 > -0.388784 )
						if( tema <= 39.674 )
							ret := 0.486486
						if( tema > 39.674 )
							ret := -0.666667
			if( ema12 > -0.205799 )
				if( VIP_VIM <= -0.295851 )
					if( VIP <= 1.64051 )
						if( ema1 <= 32.8154 )
							ret := -0.009884
						if( ema1 > 32.8154 )
							ret := 0.223048
					if( VIP > 1.64051 )
						if( ema2 <= 11.4382 )
							ret := -0.802083 // sell
						if( ema2 > 11.4382 )
							ret := -0.165891
				if( VIP_VIM > -0.295851 )
					if( ema12 <= -0.042531 )
						if( ema3 <= 18.9828 )
							ret := 0.278304
						if( ema3 > 18.9828 )
							ret := 0.048947
					if( ema12 > -0.042531 )
						if( ema1 <= 12.9061 )
							ret := 0.165281
						if( ema1 > 12.9061 )
							ret := -0.027683
		if( VIP_VIM > 0.10859 )
			if( VIM <= 1.10583 )
				if( ema1 <= 6.48266 )
					if( VIP <= 1.13211 )
						if( ema2 <= 6.4515 )
							ret := 0.888889 // buy
						if( ema2 > 6.4515 )
							ret := 1.000000 // buy
					if( VIP > 1.13211 )
						ret := 0.363636
				if( ema1 > 6.48266 )
					if( ema12 <= -0.040856 )
						if( VIM <= 1.05802 )
							ret := 0.580882
						if( VIM > 1.05802 )
							ret := -0.228571
					if( ema12 > -0.040856 )
						if( ema1 <= 26.4062 )
							ret := -0.025152
						if( ema1 > 26.4062 )
							ret := 0.219178
			if( VIM > 1.10583 )
				if( VIP <= 4.80784 )
					if( VIP <= 2.77568 )
						if( ema13 <= -0.033732 )
							ret := 0.212214
						if( ema13 > -0.033732 )
							ret := 0.401225
					if( VIP > 2.77568 )
						if( ema13 <= 0.020181 )
							ret := 0.625000
						if( ema13 > 0.020181 )
							ret := -0.444444
				if( VIP > 4.80784 )
					if( VIP_VIM <= 0.238832 )
						ret := -0.357143
					if( VIP_VIM > 0.238832 )
						ret := -0.866667 // sell
	if( ema12 > 0.009229 )
		if( ema1 <= 6.44903 )
			if( ema3 <= 6.1461 )
				if( ema1 <= 6.02829 )
					if( VIP_VIM <= 0.377373 )
						if( ema3 <= 5.82763 )
							ret := 1.000000 // buy
						if( ema3 > 5.82763 )
							ret := 0.600000
					if( VIP_VIM > 0.377373 )
						ret := 0.222222
				if( ema1 > 6.02829 )
					if( ema13 <= 0.046908 )
						if( ema12 <= 0.017889 )
							ret := -0.181818
						if( ema12 > 0.017889 )
							ret := -1.000000 // sell
					if( ema13 > 0.046908 )
						if( ema12 <= 0.04363 )
							ret := 0.658537
						if( ema12 > 0.04363 )
							ret := -0.700000 // sell
			if( ema3 > 6.1461 )
				if( ema12 <= 0.066481 )
					if( VIP_VIM <= 0.477758 )
						if( VIP_VIM <= 0.128426 )
							ret := 0.521739
						if( VIP_VIM > 0.128426 )
							ret := 0.884615 // buy
					if( VIP_VIM > 0.477758 )
						if( VIM <= 0.74981 )
							ret := 0.857143 // buy
						if( VIM > 0.74981 )
							ret := -0.266667
				if( ema12 > 0.066481 )
					ret := -0.200000
		if( ema1 > 6.44903 )
			if( VIM <= 1.61371 )
				if( ema12 <= 0.324332 )
					if( ema13 <= 0.112619 )
						if( VIM <= 1.58404 )
							ret := -0.125575
						if( VIM > 1.58404 )
							ret := 0.588235
					if( ema13 > 0.112619 )
						if( ema1 <= 43.1249 )
							ret := 0.005611
						if( ema1 > 43.1249 )
							ret := 0.416974
				if( ema12 > 0.324332 )
					if( ema3 <= 46.45 )
						if( ema3 <= 41.6762 )
							ret := -0.265366
						if( ema3 > 41.6762 )
							ret := -0.806723 // sell
					if( ema3 > 46.45 )
						if( ema12 <= 0.50683 )
							ret := 0.773585 // buy
						if( ema12 > 0.50683 )
							ret := -0.642857
			if( VIM > 1.61371 )
				if( tema <= 29.5761 )
					if( VIP_VIM <= -0.487349 )
						if( ema3 <= 16.6949 )
							ret := -0.500000
						if( ema3 > 16.6949 )
							ret := -0.881356 // sell
					if( VIP_VIM > -0.487349 )
						if( tema <= 16.5896 )
							ret := -0.281081
						if( tema > 16.5896 )
							ret := 0.038896
				if( tema > 29.5761 )
					if( ema13 <= 0.182063 )
						if( ema3 <= 31.2253 )
							ret := -0.742857 // sell
						if( ema3 > 31.2253 )
							ret := -0.208543
					if( ema13 > 0.182063 )
						if( VIP <= 4.09476 )
							ret := -0.666667
						if( VIP > 4.09476 )
							ret := 0.272727
	
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
float op_operation = decision_tree_0_CRSR_15Min_8775ffd9(ema3, tema, ema2, ema12, ema13, ema1, VIP, VIM, VIP_VIM)

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


