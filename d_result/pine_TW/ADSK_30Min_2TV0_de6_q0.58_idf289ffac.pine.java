//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: ADSK_30Min_2TV0_f289ffac Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADSK_30Min_2TV0_f289ffac", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADSK_30Min_f289ffac(ema3, tema, ema2, ema12, ema13, ema1, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( ema3 <= 198.162 )
		if( ema3 <= 196.569 )
			if( ema13 <= 5.31077 )
				if( ema13 <= 2.54372 )
					if( ema2 <= 43.1115 )
						if( ema2 <= 42.7477 )
							ret := 0.727273 // buy
						if( ema2 > 42.7477 )
							ret := 1.000000 // buy
					if( ema2 > 43.1115 )
						if( VIP <= 1.12391 )
							ret := 0.067483
						if( VIP > 1.12391 )
							ret := -0.022398
				if( ema13 > 2.54372 )
					if( ema1 <= 150.042 )
						if( ema12 <= 3.02527 )
							ret := 0.730640 // buy
						if( ema12 > 3.02527 )
							ret := -0.272727
					if( ema1 > 150.042 )
						if( ema2 <= 150.958 )
							ret := -0.687500
						if( ema2 > 150.958 )
							ret := 0.230534
			if( ema13 > 5.31077 )
				if( VIP_VIM <= 0.757404 )
					if( VIP <= 1.30127 )
						if( ema13 <= 5.9303 )
							ret := -0.333333
						if( ema13 > 5.9303 )
							ret := -1.000000 // sell
					if( VIP > 1.30127 )
						if( ema2 <= 185.641 )
							ret := -0.984127 // sell
						if( ema2 > 185.641 )
							ret := -0.727273 // sell
				if( VIP_VIM > 0.757404 )
					if( ema12 <= 3.43002 )
						ret := -0.615385
					if( ema12 > 3.43002 )
						ret := -0.125000
		if( ema3 > 196.569 )
			if( ema12 <= -0.274716 )
				if( ema13 <= -0.806232 )
					if( VIM <= 1.0959 )
						if( ema1 <= 195.306 )
							ret := -0.875000 // sell
						if( ema1 > 195.306 )
							ret := -0.142857
					if( VIM > 1.0959 )
						if( ema2 <= 196.854 )
							ret := 0.713514 // buy
						if( ema2 > 196.854 )
							ret := 0.080000
				if( ema13 > -0.806232 )
					if( tema <= 195.661 )
						ret := 0.600000
					if( tema > 195.661 )
						if( ema1 <= 197.479 )
							ret := 1.000000 // buy
						if( ema1 > 197.479 )
							ret := 0.875000 // buy
			if( ema12 > -0.274716 )
				if( VIM <= 1.2834 )
					if( ema3 <= 197.926 )
						if( VIP_VIM <= -0.11596 )
							ret := -0.642857
						if( VIP_VIM > -0.11596 )
							ret := 0.448622
					if( ema3 > 197.926 )
						if( VIP_VIM <= 0.484327 )
							ret := -0.574468
						if( VIP_VIM > 0.484327 )
							ret := 0.863636 // buy
				if( VIM > 1.2834 )
					if( tema <= 202.172 )
						if( ema2 <= 197.397 )
							ret := -0.782609 // sell
						if( ema2 > 197.397 )
							ret := -0.166667
					if( tema > 202.172 )
						ret := -1.000000 // sell
	if( ema3 > 198.162 )
		if( tema <= 201.563 )
			if( ema3 <= 202.109 )
				if( ema12 <= -0.097512 )
					if( ema13 <= -3.40017 )
						if( ema2 <= 195.873 )
							ret := 1.000000 // buy
						if( ema2 > 195.873 )
							ret := -0.590164
					if( ema13 > -3.40017 )
						if( tema <= 196.955 )
							ret := 0.411765
						if( tema > 196.955 )
							ret := -0.053452
				if( ema12 > -0.097512 )
					if( VIP_VIM <= -0.008546 )
						if( VIM <= 1.045 )
							ret := -0.250000
						if( VIM > 1.045 )
							ret := -0.918182 // sell
					if( VIP_VIM > -0.008546 )
						if( ema13 <= 0.858951 )
							ret := 0.000000
						if( ema13 > 0.858951 )
							ret := -0.601942
			if( ema3 > 202.109 )
				if( ema1 <= 202.196 )
					if( VIP <= 1.06881 )
						if( ema1 <= 198.614 )
							ret := 0.000000
						if( ema1 > 198.614 )
							ret := -0.758621 // sell
					if( VIP > 1.06881 )
						if( ema2 <= 201.701 )
							ret := -0.941176 // sell
						if( ema2 > 201.701 )
							ret := 0.232143
				if( ema1 > 202.196 )
					if( ema12 <= -2.36435 )
						if( VIP_VIM <= -0.7838 )
							ret := -0.500000
						if( VIP_VIM > -0.7838 )
							ret := -1.000000 // sell
					if( ema12 > -2.36435 )
						if( VIM <= 1.36135 )
							ret := 0.380952
						if( VIM > 1.36135 )
							ret := 0.000000
		if( tema > 201.563 )
			if( ema1 <= 202.747 )
				if( ema2 <= 202.239 )
					if( ema3 <= 202.249 )
						if( ema12 <= 0.14053 )
							ret := 0.851852 // buy
						if( ema12 > 0.14053 )
							ret := 0.216327
					if( ema3 > 202.249 )
						if( VIP_VIM <= -0.053495 )
							ret := -0.625000
						if( VIP_VIM > -0.053495 )
							ret := -1.000000 // sell
				if( ema2 > 202.239 )
					if( ema3 <= 202.564 )
						if( VIP <= 1.01361 )
							ret := 0.500000
						if( VIP > 1.01361 )
							ret := 0.972222 // buy
					if( ema3 > 202.564 )
						if( ema3 <= 202.928 )
							ret := -0.024390
						if( ema3 > 202.928 )
							ret := 0.603774
			if( ema1 > 202.747 )
				if( VIM <= 1.07511 )
					if( ema13 <= 2.5122 )
						if( ema1 <= 204.077 )
							ret := -0.573529
						if( ema1 > 204.077 )
							ret := 0.051233
					if( ema13 > 2.5122 )
						if( ema1 <= 242.079 )
							ret := 0.018349
						if( ema1 > 242.079 )
							ret := -0.237077
				if( VIM > 1.07511 )
					if( tema <= 277.965 )
						if( ema3 <= 269.254 )
							ret := -0.075497
						if( ema3 > 269.254 )
							ret := 0.324155
					if( tema > 277.965 )
						if( tema <= 279.769 )
							ret := -0.752941 // sell
						if( tema > 279.769 )
							ret := -0.171938
	
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
float op_operation = decision_tree_0_ADSK_30Min_f289ffac(ema3, tema, ema2, ema12, ema13, ema1, VIP, VIM, VIP_VIM)

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


