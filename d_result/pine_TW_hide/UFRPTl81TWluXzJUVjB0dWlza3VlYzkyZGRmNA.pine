//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: PTON_5Min_2TV0_ec92ddf4 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PTON_5Min_2TV0_ec92ddf4", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PTON_5Min_ec92ddf4(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( ema12 <= 0.001455 )
		if( VIP <= 1.73474 )
			if( ema2 <= 5.90172 )
				if( tema <= 5.62651 )
					if( ema3 <= 5.41499 )
						if( ema3 <= 2.97644 )
							ret := 0.370588
						if( ema3 > 2.97644 )
							ret := 0.036170
					if( ema3 > 5.41499 )
						if( VIP_VIM <= -0.904456 )
							ret := -0.881579 // sell
						if( VIP_VIM > -0.904456 )
							ret := -0.117702
				if( tema > 5.62651 )
					if( VIP <= 1.27442 )
						if( ema3 <= 5.75232 )
							ret := 0.537594
						if( ema3 > 5.75232 )
							ret := 0.217295
					if( VIP > 1.27442 )
						if( tema <= 5.71838 )
							ret := 0.534884
						if( tema > 5.71838 )
							ret := -0.585106
			if( ema2 > 5.90172 )
				if( VIM <= 1.71312 )
					if( VIP <= 1.51387 )
						if( ema3 <= 5.93222 )
							ret := -0.560976
						if( ema3 > 5.93222 )
							ret := -0.044312
					if( VIP > 1.51387 )
						if( ema1 <= 8.10389 )
							ret := -0.854701 // sell
						if( ema1 > 8.10389 )
							ret := 0.062500
				if( VIM > 1.71312 )
					if( ema2 <= 7.52507 )
						if( tema <= 7.16746 )
							ret := 0.436090
						if( tema > 7.16746 )
							ret := -0.223881
					if( ema2 > 7.52507 )
						if( VIM <= 2.37815 )
							ret := 0.753086 // buy
						if( VIM > 2.37815 )
							ret := 0.100000
		if( VIP > 1.73474 )
			if( tema <= 4.65988 )
				if( ema13 <= -0.009583 )
					if( VIM <= 2.48147 )
						if( ema1 <= 4.40189 )
							ret := 0.337931
						if( ema1 > 4.40189 )
							ret := -0.206897
					if( VIM > 2.48147 )
						if( ema3 <= 3.31474 )
							ret := 0.019608
						if( ema3 > 3.31474 )
							ret := 0.639130
				if( ema13 > -0.009583 )
					if( ema1 <= 3.18474 )
						if( ema12 <= -0.006841 )
							ret := -0.833333 // sell
						if( ema12 > -0.006841 )
							ret := 0.600000
					if( ema1 > 3.18474 )
						if( VIP_VIM <= 0.426499 )
							ret := 0.277574
						if( VIP_VIM > 0.426499 )
							ret := -0.041237
			if( tema > 4.65988 )
				if( ema1 <= 9.3567 )
					if( ema2 <= 4.69846 )
						if( VIP <= 4.23403 )
							ret := -0.647059
						if( VIP > 4.23403 )
							ret := 1.000000 // buy
					if( ema2 > 4.69846 )
						if( VIP_VIM <= -0.213342 )
							ret := 0.026316
						if( VIP_VIM > -0.213342 )
							ret := 0.200142
				if( ema1 > 9.3567 )
					if( VIP <= 2.37451 )
						if( ema2 <= 9.56397 )
							ret := -0.978261 // sell
						if( ema2 > 9.56397 )
							ret := -0.210526
					if( VIP > 2.37451 )
						if( VIP_VIM <= -0.850761 )
							ret := -0.857143 // sell
						if( VIP_VIM > -0.850761 )
							ret := 0.212121
	if( ema12 > 0.001455 )
		if( VIM <= 1.37019 )
			if( VIP <= 1.40012 )
				if( ema3 <= 9.58459 )
					if( ema13 <= 0.28408 )
						if( ema13 <= 0.017604 )
							ret := -0.035498
						if( ema13 > 0.017604 )
							ret := 0.038976
					if( ema13 > 0.28408 )
						if( ema12 <= 0.274036 )
							ret := -0.953488 // sell
						if( ema12 > 0.274036 )
							ret := -0.076923
				if( ema3 > 9.58459 )
					if( ema13 <= 0.017802 )
						if( ema12 <= 0.002127 )
							ret := 0.000000
						if( ema12 > 0.002127 )
							ret := -0.930233 // sell
					if( ema13 > 0.017802 )
						if( tema <= 9.6344 )
							ret := 0.222222
						if( tema > 9.6344 )
							ret := -0.559524
			if( VIP > 1.40012 )
				if( ema2 <= 9.23297 )
					if( ema13 <= 0.092483 )
						if( ema2 <= 8.33914 )
							ret := -0.167595
						if( ema2 > 8.33914 )
							ret := 0.328947
					if( ema13 > 0.092483 )
						if( ema2 <= 3.15292 )
							ret := 0.833333 // buy
						if( ema2 > 3.15292 )
							ret := -0.474576
				if( ema2 > 9.23297 )
					if( ema13 <= 0.007825 )
						ret := 0.000000
					if( ema13 > 0.007825 )
						if( ema1 <= 9.47306 )
							ret := -1.000000 // sell
						if( ema1 > 9.47306 )
							ret := -0.711111 // sell
		if( VIM > 1.37019 )
			if( ema12 <= 0.008571 )
				if( tema <= 3.06297 )
					if( ema2 <= 2.94621 )
						if( VIP <= 1.75812 )
							ret := -1.000000 // sell
						if( VIP > 1.75812 )
							ret := 0.235294
					if( ema2 > 2.94621 )
						if( VIP_VIM <= 0.773526 )
							ret := 0.653333
						if( VIP_VIM > 0.773526 )
							ret := 0.111111
				if( tema > 3.06297 )
					if( ema2 <= 8.26355 )
						if( ema13 <= 0.00375 )
							ret := -0.291667
						if( ema13 > 0.00375 )
							ret := -0.086425
					if( ema2 > 8.26355 )
						if( ema13 <= 0.008869 )
							ret := 0.024096
						if( ema13 > 0.008869 )
							ret := 0.476923
			if( ema12 > 0.008571 )
				if( ema13 <= 0.010902 )
					if( ema2 <= 7.7476 )
						if( ema13 <= 0.009699 )
							ret := -0.918033 // sell
						if( ema13 > 0.009699 )
							ret := -0.655172
					if( ema2 > 7.7476 )
						if( VIP_VIM <= 0.216367 )
							ret := -0.888889 // sell
						if( VIP_VIM > 0.216367 )
							ret := -0.083333
				if( ema13 > 0.010902 )
					if( VIM <= 25.3665 )
						if( ema3 <= 4.21022 )
							ret := -0.481081
						if( ema3 > 4.21022 )
							ret := -0.233602
					if( VIM > 25.3665 )
						if( tema <= 4.58822 )
							ret := 1.000000 // buy
						if( tema > 4.58822 )
							ret := 0.153846
	
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
float op_operation = decision_tree_0_PTON_5Min_ec92ddf4(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)

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


