//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: BNBUSDT_1Hour_2TV0_bfe8382c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BNBUSDT_1Hour_2TV0_bfe8382c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BNBUSDT_1Hour_bfe8382c(ema3, tema, ema2, ema12, ema13, ema1, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6,max_features=sqrt, min_samples_split=10,random_state=843828734)
	if( ema2 <= 277.174 )
		if( VIM <= 0.807094 )
			if( ema3 <= 42.8971 )
				if( ema12 <= 0.344636 )
					if( ema2 <= 17.3042 )
						if( tema <= 11.6782 )
							ret := 1.000000 // buy
						if( tema > 11.6782 )
							ret := 0.195815
					if( ema2 > 17.3042 )
						if( ema1 <= 18.4715 )
							ret := -0.368794
						if( ema1 > 18.4715 )
							ret := 0.046715
				if( ema12 > 0.344636 )
					if( tema <= 32.7936 )
						if( tema <= 31.8254 )
							ret := 0.387234
						if( tema > 31.8254 )
							ret := 0.976190 // buy
					if( tema > 32.7936 )
						if( VIP <= 1.25464 )
							ret := 0.121495
						if( VIP > 1.25464 )
							ret := -0.571429
			if( ema3 > 42.8971 )
				if( ema1 <= 208.522 )
					if( VIP <= 1.16814 )
						if( ema1 <= 73.5026 )
							ret := -1.000000 // sell
						if( ema1 > 73.5026 )
							ret := 0.125000
					if( VIP > 1.16814 )
						if( ema13 <= 16.4999 )
							ret := 0.758017 // buy
						if( ema13 > 16.4999 )
							ret := -0.500000
				if( ema1 > 208.522 )
					if( ema1 <= 228.553 )
						if( ema2 <= 218.325 )
							ret := 0.034014
						if( ema2 > 218.325 )
							ret := -0.375000
					if( ema1 > 228.553 )
						if( tema <= 242.959 )
							ret := 0.041176
						if( tema > 242.959 )
							ret := 0.302158
		if( VIM > 0.807094 )
			if( ema12 <= -9.6312 )
				if( ema3 <= 287.187 )
					if( VIP <= 0.663665 )
						ret := -0.750000 // sell
					if( VIP > 0.663665 )
						if( ema2 <= 245.349 )
							ret := 0.764706 // buy
						if( ema2 > 245.349 )
							ret := 1.000000 // buy
				if( ema3 > 287.187 )
					ret := -1.000000 // sell
			if( ema12 > -9.6312 )
				if( ema13 <= 0.34328 )
					if( VIP_VIM <= -0.064083 )
						if( ema12 <= -0.06324 )
							ret := 0.027579
						if( ema12 > -0.06324 )
							ret := -0.123542
					if( VIP_VIM > -0.064083 )
						if( ema1 <= 10.3958 )
							ret := 0.654545
						if( ema1 > 10.3958 )
							ret := 0.094799
				if( ema13 > 0.34328 )
					if( ema2 <= 50.8329 )
						if( ema2 <= 42.8838 )
							ret := -0.181146
						if( ema2 > 42.8838 )
							ret := -0.678161
					if( ema2 > 50.8329 )
						if( ema2 <= 125.207 )
							ret := 0.853659 // buy
						if( ema2 > 125.207 )
							ret := -0.018792
	if( ema2 > 277.174 )
		if( ema12 <= -9.38089 )
			if( ema2 <= 506.217 )
				if( ema2 <= 497.566 )
					if( ema3 <= 404.169 )
						if( ema2 <= 348.255 )
							ret := -0.160920
						if( ema2 > 348.255 )
							ret := 0.690909
					if( ema3 > 404.169 )
						if( ema2 <= 416.114 )
							ret := -0.824324 // sell
						if( ema2 > 416.114 )
							ret := 0.351562
				if( ema2 > 497.566 )
					if( ema13 <= -29.9917 )
						ret := 1.000000 // buy
					if( ema13 > -29.9917 )
						if( tema <= 479.708 )
							ret := -0.977778 // sell
						if( tema > 479.708 )
							ret := 1.000000 // buy
			if( ema2 > 506.217 )
				if( ema13 <= -18.4755 )
					if( ema3 <= 557.105 )
						if( ema2 <= 539.846 )
							ret := 0.444444
						if( ema2 > 539.846 )
							ret := -1.000000 // sell
					if( ema3 > 557.105 )
						if( ema12 <= -12.78 )
							ret := 0.750000 // buy
						if( ema12 > -12.78 )
							ret := 0.024096
				if( ema13 > -18.4755 )
					if( VIP <= 0.787027 )
						if( ema13 <= -16.9229 )
							ret := -0.062500
						if( ema13 > -16.9229 )
							ret := 0.810811 // buy
					if( VIP > 0.787027 )
						if( tema <= 545.163 )
							ret := 1.000000 // buy
						if( tema > 545.163 )
							ret := 0.833333 // buy
		if( ema12 > -9.38089 )
			if( ema2 <= 635.172 )
				if( ema3 <= 619.326 )
					if( ema2 <= 586.823 )
						if( ema2 <= 357.818 )
							ret := -0.070182
						if( ema2 > 357.818 )
							ret := -0.001120
					if( ema2 > 586.823 )
						if( ema12 <= -7.84186 )
							ret := 0.571429
						if( ema12 > -7.84186 )
							ret := -0.180188
				if( ema3 > 619.326 )
					if( ema13 <= 3.09598 )
						if( VIM <= 1.16548 )
							ret := 0.003135
						if( VIM > 1.16548 )
							ret := 0.625000
					if( ema13 > 3.09598 )
						if( ema2 <= 629.085 )
							ret := 0.685714
						if( ema2 > 629.085 )
							ret := 0.136364
			if( ema2 > 635.172 )
				if( tema <= 660.925 )
					if( VIM <= 0.972816 )
						if( ema3 <= 634.79 )
							ret := -0.933333 // sell
						if( ema3 > 634.79 )
							ret := -0.680000
					if( VIM > 0.972816 )
						if( ema1 <= 646.049 )
							ret := -0.140625
						if( ema1 > 646.049 )
							ret := -0.729885 // sell
				if( tema > 660.925 )
					if( VIP <= 1.31288 )
						if( ema2 <= 643.79 )
							ret := 1.000000 // buy
						if( ema2 > 643.79 )
							ret := -0.238739
					if( VIP > 1.31288 )
						if( ema12 <= 11.9007 )
							ret := 0.818182 // buy
						if( ema12 > 11.9007 )
							ret := 0.000000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
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
float op_operation = decision_tree_0_BNBUSDT_1Hour_bfe8382c(ema3, tema, ema2, ema12, ema13, ema1, VIP, VIM, VIP_VIM)

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


