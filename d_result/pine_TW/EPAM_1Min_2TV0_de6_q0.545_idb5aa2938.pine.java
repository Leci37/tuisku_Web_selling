//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: EPAM_1Min_2TV0_b5aa2938 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_EPAM_1Min_2TV0_b5aa2938", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_EPAM_1Min_b5aa2938(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( ema3 <= 203.717 )
		if( ema2 <= 176.116 )
			if( ema13 <= 0.430201 )
				if( VIP_VIM <= 0.644081 )
					if( ema2 <= 174.797 )
						if( ema1 <= 169.943 )
							ret := 0.777778 // buy
						if( ema1 > 169.943 )
							ret := -0.062992
					if( ema2 > 174.797 )
						if( ema1 <= 175.391 )
							ret := 0.494737
						if( ema1 > 175.391 )
							ret := 0.173034
				if( VIP_VIM > 0.644081 )
					if( ema1 <= 175.843 )
						if( VIM <= 0.852407 )
							ret := 0.321429
						if( VIM > 0.852407 )
							ret := -0.286957
					if( ema1 > 175.843 )
						if( ema2 <= 175.959 )
							ret := -0.877551 // sell
						if( ema2 > 175.959 )
							ret := 0.000000
			if( ema13 > 0.430201 )
				if( VIM <= 0.602436 )
					ret := 0.187500
				if( VIM > 0.602436 )
					if( VIP_VIM <= 0.978726 )
						if( VIP_VIM <= 0.600277 )
							ret := 0.551724
						if( VIP_VIM > 0.600277 )
							ret := 0.897196 // buy
					if( VIP_VIM > 0.978726 )
						ret := 0.117647
		if( ema2 > 176.116 )
			if( ema1 <= 202.448 )
				if( ema12 <= 1.11114 )
					if( ema13 <= 1.06734 )
						if( VIP <= 1.27025 )
							ret := 0.061545
						if( VIP > 1.27025 )
							ret := -0.019130
					if( ema13 > 1.06734 )
						if( ema2 <= 200.807 )
							ret := 0.369650
						if( ema2 > 200.807 )
							ret := -0.933333 // sell
				if( ema12 > 1.11114 )
					if( tema <= 203.097 )
						if( ema3 <= 198.107 )
							ret := -0.692308
						if( ema3 > 198.107 )
							ret := -1.000000 // sell
					if( tema > 203.097 )
						ret := -0.083333
			if( ema1 > 202.448 )
				if( VIM <= 1.82669 )
					if( tema <= 202.923 )
						if( ema3 <= 203.3 )
							ret := 0.624000
						if( ema3 > 203.3 )
							ret := -0.263158
					if( tema > 202.923 )
						if( ema2 <= 203.327 )
							ret := 0.079498
						if( ema2 > 203.327 )
							ret := 0.495017
				if( VIM > 1.82669 )
					if( tema <= 203.372 )
						if( VIM <= 3.03702 )
							ret := 0.245192
						if( VIM > 3.03702 )
							ret := -0.298701
					if( tema > 203.372 )
						if( VIP <= 3.30791 )
							ret := -0.493421
						if( VIP > 3.30791 )
							ret := 0.470588
	if( ema3 > 203.717 )
		if( ema3 <= 204.213 )
			if( ema3 <= 203.854 )
				if( VIP <= 1.82098 )
					if( VIP_VIM <= 0.351679 )
						if( VIP <= 1.36691 )
							ret := -0.225000
						if( VIP > 1.36691 )
							ret := -0.805556 // sell
					if( VIP_VIM > 0.351679 )
						ret := 0.230769
				if( VIP > 1.82098 )
					if( tema <= 204.351 )
						if( VIM <= 2.67378 )
							ret := 1.000000 // buy
						if( VIM > 2.67378 )
							ret := 0.111111
					if( tema > 204.351 )
						ret := -0.800000 // sell
			if( ema3 > 203.854 )
				if( VIP_VIM <= -0.764698 )
					if( ema1 <= 203.718 )
						ret := -1.000000 // sell
					if( ema1 > 203.718 )
						ret := -0.809524 // sell
				if( VIP_VIM > -0.764698 )
					if( VIP <= 0.975682 )
						ret := 0.363636
					if( VIP > 0.975682 )
						if( VIP_VIM <= -0.528416 )
							ret := 0.129032
						if( VIP_VIM > -0.528416 )
							ret := -0.671815
		if( ema3 > 204.213 )
			if( tema <= 249.543 )
				if( VIM <= 3.97022 )
					if( ema12 <= -0.91296 )
						if( ema1 <= 196.49 )
							ret := 1.000000 // buy
						if( ema1 > 196.49 )
							ret := -0.624242
					if( ema12 > -0.91296 )
						if( VIP <= 0.635413 )
							ret := 0.522124
						if( VIP > 0.635413 )
							ret := -0.046012
				if( VIM > 3.97022 )
					if( ema2 <= 246.149 )
						if( ema2 <= 237.189 )
							ret := 0.228311
						if( ema2 > 237.189 )
							ret := 0.764286 // buy
					if( ema2 > 246.149 )
						if( ema2 <= 246.454 )
							ret := -0.904762 // sell
						if( ema2 > 246.454 )
							ret := 0.304348
			if( tema > 249.543 )
				if( ema3 <= 249.623 )
					if( tema <= 250.106 )
						if( ema3 <= 249.461 )
							ret := -0.387755
						if( ema3 > 249.461 )
							ret := -0.852941 // sell
					if( tema > 250.106 )
						ret := -1.000000 // sell
				if( ema3 > 249.623 )
					if( ema3 <= 249.753 )
						ret := 0.550000
					if( ema3 > 249.753 )
						if( VIM <= 2.80545 )
							ret := -0.463542
						if( VIM > 2.80545 )
							ret := 0.454545
	
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
float op_operation = decision_tree_0_EPAM_1Min_b5aa2938(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)

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


