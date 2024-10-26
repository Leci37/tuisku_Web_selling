//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: TWLO_30Min_2BT0_78d14cd6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TWLO_30Min_2BT0_78d14cd6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TWLO_30Min_78d14cd6(bbp, bullPower, BBPower_Color, bearPower, bbm, ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( tema <= 74.8411 )
		if( ema13 <= 0.957067 )
			if( bbp <= -1.12743 )
				if( ema12 <= -2.13058 )
					if( ema2 <= 69.8533 )
						if( tema <= 42.1191 )
							ret := -0.076923
						if( tema > 42.1191 )
							ret := -0.921875 // sell
					if( ema2 > 69.8533 )
						ret := 0.937500 // buy
				if( ema12 > -2.13058 )
					if( bearPower <= -3.24064 )
						if( ema2 <= 70.9029 )
							ret := 0.194444
						if( ema2 > 70.9029 )
							ret := 0.955224 // buy
					if( bearPower > -3.24064 )
						if( ema12 <= -1.55927 )
							ret := -0.731707 // sell
						if( ema12 > -1.55927 )
							ret := 0.177650
			if( bbp > -1.12743 )
				if( bbm <= 0.253932 )
					if( tema <= 23.7858 )
						if( tema <= 23.6104 )
							ret := 0.404255
						if( tema > 23.6104 )
							ret := 0.883721 // buy
					if( tema > 23.7858 )
						if( bbp <= 0.804558 )
							ret := 0.050746
						if( bbp > 0.804558 )
							ret := -0.097118
				if( bbm > 0.253932 )
					if( bearPower <= -0.786147 )
						if( bbp <= 0.343884 )
							ret := -0.211516
						if( bbp > 0.343884 )
							ret := 0.541667
					if( bearPower > -0.786147 )
						if( ema3 <= 42.5329 )
							ret := -0.086093
						if( ema3 > 42.5329 )
							ret := -0.008642
		if( ema13 > 0.957067 )
			if( ema2 <= 56.7504 )
				if( bearPower <= 0.439696 )
					if( ema1 <= 39.9296 )
						if( ema13 <= 1.06705 )
							ret := 0.133333
						if( ema13 > 1.06705 )
							ret := -0.777778 // sell
					if( ema1 > 39.9296 )
						if( bullPower <= 2.00727 )
							ret := 0.081395
						if( bullPower > 2.00727 )
							ret := 0.933333 // buy
				if( bearPower > 0.439696 )
					if( ema13 <= 2.59547 )
						if( bbm <= 0.249716 )
							ret := 0.698795
						if( bbm > 0.249716 )
							ret := 0.304940
					if( ema13 > 2.59547 )
						if( ema13 <= 2.99053 )
							ret := 0.982456 // buy
						if( ema13 > 2.99053 )
							ret := 0.666667
			if( ema2 > 56.7504 )
				if( ema12 <= 0.86473 )
					if( bbm <= 0.236354 )
						if( ema1 <= 66.4361 )
							ret := -0.500000
						if( ema1 > 66.4361 )
							ret := 0.269231
					if( bbm > 0.236354 )
						if( ema2 <= 57.0565 )
							ret := -0.785714 // sell
						if( ema2 > 57.0565 )
							ret := 0.305263
				if( ema12 > 0.86473 )
					if( tema <= 74.1008 )
						if( bullPower <= 4.63133 )
							ret := -0.459016
						if( bullPower > 4.63133 )
							ret := 0.666667
					if( tema > 74.1008 )
						if( ema13 <= 2.00011 )
							ret := 0.307692
						if( ema13 > 2.00011 )
							ret := 0.958333 // buy
	if( tema > 74.8411 )
		if( ema1 <= 78.4691 )
			if( bullPower <= -1.55792 )
				if( ema13 <= -2.00828 )
					ret := 1.000000 // buy
				if( ema13 > -2.00828 )
					ret := 0.625000
			if( bullPower > -1.55792 )
				if( ema2 <= 76.2471 )
					if( bullPower <= 0.688462 )
						if( ema2 <= 75.2785 )
							ret := -0.325444
						if( ema2 > 75.2785 )
							ret := 0.286232
					if( bullPower > 0.688462 )
						if( ema3 <= 73.7776 )
							ret := 0.044586
						if( ema3 > 73.7776 )
							ret := -0.627778
				if( ema2 > 76.2471 )
					if( ema2 <= 76.7536 )
						if( ema12 <= -0.516172 )
							ret := 0.500000
						if( ema12 > -0.516172 )
							ret := -0.830275 // sell
					if( ema2 > 76.7536 )
						if( tema <= 75.6261 )
							ret := 0.769231 // buy
						if( tema > 75.6261 )
							ret := -0.434667
		if( ema1 > 78.4691 )
			if( ema2 <= 84.5497 )
				if( ema13 <= -0.106954 )
					if( ema3 <= 84.5847 )
						if( bearPower <= -0.918519 )
							ret := -0.355634
						if( bearPower > -0.918519 )
							ret := 0.130742
					if( ema3 > 84.5847 )
						if( bullPower <= 0.066545 )
							ret := 0.609023
						if( bullPower > 0.066545 )
							ret := -0.111111
				if( ema13 > -0.106954 )
					if( tema <= 79.9795 )
						ret := -0.944444 // sell
					if( tema > 79.9795 )
						if( tema <= 85.736 )
							ret := 0.511940
						if( tema > 85.736 )
							ret := -0.194444
			if( ema2 > 84.5497 )
				if( ema2 <= 87.2901 )
					if( ema13 <= 1.12914 )
						if( bearPower <= -3.46143 )
							ret := -0.890909 // sell
						if( bearPower > -3.46143 )
							ret := -0.103448
					if( ema13 > 1.12914 )
						if( ema2 <= 85.8635 )
							ret := -0.200000
						if( ema2 > 85.8635 )
							ret := -0.804688 // sell
				if( ema2 > 87.2901 )
					if( ema3 <= 91.2016 )
						if( tema <= 90.9364 )
							ret := 0.198400
						if( tema > 90.9364 )
							ret := 0.727273 // buy
					if( ema3 > 91.2016 )
						if( ema1 <= 90.9274 )
							ret := -0.823529 // sell
						if( ema1 > 90.9274 )
							ret := -0.028001
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


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
float op_operation = decision_tree_0_TWLO_30Min_78d14cd6(bbp, bullPower, BBPower_Color, bearPower, bbm, ema2, ema1, ema12, ema3, ema13, tema)

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


