//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: UBER_15Min_2BT0_e22ef0f1 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UBER_15Min_2BT0_e22ef0f1", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UBER_15Min_e22ef0f1(bbp, bullPower, BBPower_Color, bearPower, bbm, ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( ema12 <= -0.251319 )
		if( ema1 <= 32.2048 )
			if( ema12 <= -0.453532 )
				if( ema3 <= 33.0271 )
					if( bbm <= 0.025 )
						ret := -0.500000
					if( bbm > 0.025 )
						if( ema1 <= 24.7058 )
							if( ema1 <= 23.6842 )
								ret := 0.808824 // buy
							if( ema1 > 23.6842 )
								ret := -1.000000 // sell
						if( ema1 > 24.7058 )
							if( bullPower <= -0.619697 )
								ret := 0.923077 // buy
							if( bullPower > -0.619697 )
								ret := 0.602410
				if( ema3 > 33.0271 )
					ret := -0.857143 // sell
			if( ema12 > -0.453532 )
				if( ema1 <= 25.8156 )
					if( tema <= 23.7636 )
						if( ema3 <= 17.4263 )
							if( tema <= 16.0639 )
								ret := -0.142857
							if( tema > 16.0639 )
								ret := -1.000000 // sell
						if( ema3 > 17.4263 )
							if( ema13 <= -0.597104 )
								ret := 0.609524
							if( ema13 > -0.597104 )
								ret := 0.125000
					if( tema > 23.7636 )
						if( ema12 <= -0.386059 )
							if( ema3 <= 25.7979 )
								ret := 0.900000 // buy
							if( ema3 > 25.7979 )
								ret := 0.428571
						if( ema12 > -0.386059 )
							if( bearPower <= -0.514127 )
								ret := -0.830189 // sell
							if( bearPower > -0.514127 )
								ret := -0.235294
				if( ema1 > 25.8156 )
					if( ema13 <= -0.61181 )
						if( tema <= 28.8669 )
							if( bullPower <= -0.495619 )
								ret := -0.125000
							if( bullPower > -0.495619 )
								ret := 0.818182 // buy
						if( tema > 28.8669 )
							if( ema1 <= 30.0646 )
								ret := -0.677419
							if( ema1 > 30.0646 )
								ret := 0.043956
					if( ema13 > -0.61181 )
						if( bbp <= -1.52183 )
							if( bullPower <= -0.466586 )
								ret := -0.371429
							if( bullPower > -0.466586 )
								ret := 1.000000 // buy
						if( bbp > -1.52183 )
							if( ema12 <= -0.294389 )
								ret := 0.730942 // buy
							if( ema12 > -0.294389 )
								ret := 0.416894
		if( ema1 > 32.2048 )
			if( tema <= 33.0967 )
				if( bullPower <= -0.379515 )
					if( bearPower <= -1.2529 )
						if( ema3 <= 33.5538 )
							ret := -1.000000 // sell
						if( ema3 > 33.5538 )
							ret := 1.000000 // buy
					if( bearPower > -1.2529 )
						if( bearPower <= -0.925681 )
							if( ema12 <= -0.329954 )
								ret := -0.945946 // sell
							if( ema12 > -0.329954 )
								ret := -0.714286 // sell
						if( bearPower > -0.925681 )
							if( bbm <= 0.34429 )
								ret := -0.619048
							if( bbm > 0.34429 )
								ret := 0.375000
				if( bullPower > -0.379515 )
					if( bbp <= -0.799128 )
						if( ema13 <= -0.412818 )
							if( ema2 <= 33.4316 )
								ret := 0.672727
							if( ema2 > 33.4316 )
								ret := 0.117647
						if( ema13 > -0.412818 )
							ret := -0.666667
					if( bbp > -0.799128 )
						if( bbm <= 0.1775 )
							if( bullPower <= -0.314978 )
								ret := -0.375000
							if( bullPower > -0.314978 )
								ret := 0.615385
						if( bbm > 0.1775 )
							if( ema1 <= 32.2929 )
								ret := -1.000000 // sell
							if( ema1 > 32.2929 )
								ret := -0.405405
			if( tema > 33.0967 )
				if( ema3 <= 35.3533 )
					if( ema12 <= -0.281722 )
						if( bearPower <= -0.514616 )
							if( tema <= 33.1248 )
								ret := 0.428571
							if( tema > 33.1248 )
								ret := 0.888889 // buy
						if( bearPower > -0.514616 )
							if( bearPower <= -0.459779 )
								ret := 0.142857
							if( bearPower > -0.459779 )
								ret := 0.666667
					if( ema12 > -0.281722 )
						if( ema12 <= -0.267728 )
							if( bbm <= 0.273233 )
								ret := -0.571429
							if( bbm > 0.273233 )
								ret := 0.714286 // buy
						if( ema12 > -0.267728 )
							if( bbp <= -0.822727 )
								ret := 0.153846
							if( bbp > -0.822727 )
								ret := 0.818182 // buy
				if( ema3 > 35.3533 )
					if( ema3 <= 35.7701 )
						if( ema13 <= -0.609504 )
							ret := -0.500000
						if( ema13 > -0.609504 )
							if( ema12 <= -0.323952 )
								ret := -0.571429
							if( ema12 > -0.323952 )
								ret := -0.942857 // sell
					if( ema3 > 35.7701 )
						if( ema2 <= 40.8434 )
							if( bullPower <= -0.605904 )
								ret := 0.394366
							if( bullPower > -0.605904 )
								ret := -0.099369
						if( ema2 > 40.8434 )
							if( ema3 <= 56.582 )
								ret := 0.237805
							if( ema3 > 56.582 )
								ret := 0.064467
	if( ema12 > -0.251319 )
		if( ema1 <= 22.823 )
			if( ema13 <= 0.052813 )
				if( bearPower <= -0.17213 )
					if( ema2 <= 15.1258 )
						if( bbm <= 0.245952 )
							ret := 0.714286 // buy
						if( bbm > 0.245952 )
							ret := 1.000000 // buy
					if( ema2 > 15.1258 )
						if( ema3 <= 19.4301 )
							if( tema <= 17.554 )
								ret := 0.437500
							if( tema > 17.554 )
								ret := -0.965517 // sell
						if( ema3 > 19.4301 )
							if( ema2 <= 21.2045 )
								ret := 0.666667
							if( ema2 > 21.2045 )
								ret := 0.195960
				if( bearPower > -0.17213 )
					if( ema1 <= 19.7114 )
						if( ema2 <= 14.9851 )
							ret := 0.428571
						if( ema2 > 14.9851 )
							if( bbp <= -0.190779 )
								ret := -0.636364
							if( bbp > -0.190779 )
								ret := -1.000000 // sell
					if( ema1 > 19.7114 )
						if( bullPower <= 0.018538 )
							if( tema <= 21.9911 )
								ret := -0.106529
							if( tema > 21.9911 )
								ret := -0.468085
						if( bullPower > 0.018538 )
							if( bearPower <= 0.116853 )
								ret := 0.097087
							if( bearPower > 0.116853 )
								ret := -0.928571 // sell
			if( ema13 > 0.052813 )
				if( ema2 <= 20.8324 )
					if( tema <= 20.8686 )
						if( bbp <= 3.27607 )
							if( bullPower <= 0.490217 )
								ret := 0.011494
							if( bullPower > 0.490217 )
								ret := 0.930233 // buy
						if( bbp > 3.27607 )
							ret := -1.000000 // sell
					if( tema > 20.8686 )
						if( bullPower <= 0.189083 )
							ret := 0.142857
						if( bullPower > 0.189083 )
							if( ema3 <= 20.4528 )
								ret := -0.125000
							if( ema3 > 20.4528 )
								ret := -0.923077 // sell
				if( ema2 > 20.8324 )
					if( ema13 <= 0.326964 )
						if( ema3 <= 21.1474 )
							if( bbp <= 0.231126 )
								ret := 0.607143
							if( bbp > 0.231126 )
								ret := 0.907692 // buy
						if( ema3 > 21.1474 )
							if( ema12 <= 0.058675 )
								ret := 0.404580
							if( ema12 > 0.058675 )
								ret := 0.068182
					if( ema13 > 0.326964 )
						if( ema1 <= 21.8145 )
							if( bearPower <= 0.255567 )
								ret := 0.500000
							if( bearPower > 0.255567 )
								ret := -0.666667
						if( ema1 > 21.8145 )
							if( ema12 <= 0.236023 )
								ret := 0.956522 // buy
							if( ema12 > 0.236023 )
								ret := 0.620690
		if( ema1 > 22.823 )
			if( bullPower <= 0.002466 )
				if( ema2 <= 78.4022 )
					if( bbm <= 0.029978 )
						if( ema1 <= 54.4776 )
							if( ema12 <= -0.1199 )
								ret := 0.326923
							if( ema12 > -0.1199 )
								ret := 0.147338
						if( ema1 > 54.4776 )
							if( tema <= 54.655 )
								ret := -0.736842 // sell
							if( tema > 54.655 )
								ret := 0.028015
					if( bbm > 0.029978 )
						if( tema <= 23.2808 )
							if( tema <= 22.6056 )
								ret := 0.888889 // buy
							if( tema > 22.6056 )
								ret := -0.365482
						if( tema > 23.2808 )
							if( ema2 <= 26.9454 )
								ret := 0.171287
							if( ema2 > 26.9454 )
								ret := 0.053916
				if( ema2 > 78.4022 )
					if( ema3 <= 78.6079 )
						if( bullPower <= -0.094627 )
							ret := -0.428571
						if( bullPower > -0.094627 )
							ret := -1.000000 // sell
					if( ema3 > 78.6079 )
						if( bearPower <= -0.47051 )
							if( ema2 <= 80.3528 )
								ret := -0.185185
							if( ema2 > 80.3528 )
								ret := -0.888889 // sell
						if( bearPower > -0.47051 )
							if( tema <= 81.0495 )
								ret := 0.106061
							if( tema > 81.0495 )
								ret := -0.181818
			if( bullPower > 0.002466 )
				if( bearPower <= 0.145367 )
					if( ema13 <= 0.222911 )
						if( tema <= 31.4745 )
							if( ema12 <= 0.102449 )
								ret := 0.038605
							if( ema12 > 0.102449 )
								ret := 0.262295
						if( tema > 31.4745 )
							if( ema3 <= 31.8445 )
								ret := -0.202286
							if( ema3 > 31.8445 )
								ret := 0.009681
					if( ema13 > 0.222911 )
						if( ema1 <= 37.8038 )
							if( ema12 <= 0.210385 )
								ret := 0.229985
							if( ema12 > 0.210385 )
								ret := -0.032448
						if( ema1 > 37.8038 )
							if( tema <= 45.139 )
								ret := -0.050237
							if( tema > 45.139 )
								ret := 0.109398
				if( bearPower > 0.145367 )
					if( ema1 <= 29.3786 )
						if( bbp <= 0.751516 )
							if( ema1 <= 23.5632 )
								ret := 0.244898
							if( ema1 > 23.5632 )
								ret := -0.304281
						if( bbp > 0.751516 )
							if( bbp <= 2.24501 )
								ret := -0.006803
							if( bbp > 2.24501 )
								ret := -0.666667
					if( ema1 > 29.3786 )
						if( ema3 <= 30.5649 )
							if( bbm <= 0.39566 )
								ret := 0.437939
							if( bbm > 0.39566 )
								ret := -0.129032
						if( ema3 > 30.5649 )
							if( bbm <= 0.143711 )
								ret := -0.097938
							if( bbm > 0.143711 )
								ret := 0.013678
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_UBER_15Min_e22ef0f1(bbp, bullPower, BBPower_Color, bearPower, bbm, ema2, ema1, ema12, ema3, ema13, tema)

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


