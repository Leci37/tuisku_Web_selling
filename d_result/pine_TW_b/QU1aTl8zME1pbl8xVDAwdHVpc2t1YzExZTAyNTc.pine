//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: AMZN_30Min_1T00_c11e0257 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMZN_30Min_1T00_c11e0257", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMZN_30Min_c11e0257(ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ema2 <= 83.3378 )
		if( ema3 <= 83.3517 )
			if( ema12 <= -0.1932 )
				ret := 0.500000
			if( ema12 > -0.1932 )
				if( ema1 <= 83.0342 )
					if( ema12 <= -0.183708 )
						ret := 0.916667 // buy
					if( ema12 > -0.183708 )
						ret := 1.000000 // buy
				if( ema1 > 83.0342 )
					if( tema <= 83.9351 )
						ret := 0.736842 // buy
					if( tema > 83.9351 )
						ret := 1.000000 // buy
		if( ema3 > 83.3517 )
			ret := 0.307692
	if( ema2 > 83.3378 )
		if( ema1 <= 3061.39 )
			if( ema13 <= 2.4296 )
				if( ema12 <= -24.2698 )
					if( ema13 <= -1035.65 )
						ret := 1.000000 // buy
					if( ema13 > -1035.65 )
						if( ema1 <= 2831.74 )
							if( tema <= 2667.06 )
								if( ema1 <= 1746.17 )
									ret := 0.051724
								if( ema1 > 1746.17 )
									ret := -0.509174
							if( tema > 2667.06 )
								if( ema13 <= -60.4189 )
									ret := -0.312500
								if( ema13 > -60.4189 )
									ret := 0.593750
						if( ema1 > 2831.74 )
							if( ema1 <= 3048.12 )
								if( ema12 <= -31.6508 )
									ret := 0.181818
								if( ema12 > -31.6508 )
									ret := -0.727891 // sell
							if( ema1 > 3048.12 )
								ret := 0.466667
				if( ema12 > -24.2698 )
					if( ema3 <= 3076.02 )
						if( ema13 <= 0.313375 )
							if( ema13 <= 0.166668 )
								if( ema2 <= 2912.42 )
									ret := 0.008639
								if( ema2 > 2912.42 )
									ret := -0.146029
							if( ema13 > 0.166668 )
								if( ema12 <= -1.23476 )
									ret := -0.473684
								if( ema12 > -1.23476 )
									ret := 0.089510
						if( ema13 > 0.313375 )
							if( ema2 <= 2846.97 )
								if( ema2 <= 174.923 )
									ret := 0.025037
								if( ema2 > 174.923 )
									ret := -0.084636
							if( ema2 > 2846.97 )
								if( ema1 <= 3051.67 )
									ret := 0.476923
								if( ema1 > 3051.67 )
									ret := 0.784314 // buy
					if( ema3 > 3076.02 )
						if( ema1 <= 3055.97 )
							if( ema3 <= 3081.57 )
								ret := 0.368421
							if( ema3 > 3081.57 )
								if( ema13 <= -38.4397 )
									ret := 0.976190 // buy
								if( ema13 > -38.4397 )
									ret := 0.642857
						if( ema1 > 3055.97 )
							if( ema3 <= 3092.62 )
								ret := -0.363636
							if( ema3 > 3092.62 )
								ret := -0.071429
			if( ema13 > 2.4296 )
				if( tema <= 1766.94 )
					if( tema <= 788.328 )
						if( ema2 <= 751.723 )
							if( ema13 <= 10.8157 )
								if( ema1 <= 744.84 )
									ret := 0.084198
								if( ema1 > 744.84 )
									ret := 0.719298 // buy
							if( ema13 > 10.8157 )
								if( ema2 <= 656.78 )
									ret := -0.657143
								if( ema2 > 656.78 )
									ret := -1.000000 // sell
						if( ema2 > 751.723 )
							if( ema3 <= 760.479 )
								if( ema1 <= 763.32 )
									ret := -0.264706
								if( ema1 > 763.32 )
									ret := -0.857143 // sell
							if( ema3 > 760.479 )
								if( ema2 <= 772.306 )
									ret := 0.012579
								if( ema2 > 772.306 )
									ret := -0.403226
					if( tema > 788.328 )
						if( ema3 <= 1738.99 )
							if( ema13 <= 21.173 )
								if( ema13 <= 12.8191 )
									ret := 0.120655
								if( ema13 > 12.8191 )
									ret := 0.382646
							if( ema13 > 21.173 )
								if( ema3 <= 1403.13 )
									ret := 0.658537
								if( ema3 > 1403.13 )
									ret := -0.310231
						if( ema3 > 1738.99 )
							if( ema3 <= 1749.76 )
								if( tema <= 1760.36 )
									ret := 0.614815
								if( tema > 1760.36 )
									ret := 0.939394 // buy
							if( ema3 > 1749.76 )
								if( ema1 <= 1762.4 )
									ret := -0.183673
								if( ema1 > 1762.4 )
									ret := 0.533333
				if( tema > 1766.94 )
					if( ema2 <= 2123.1 )
						if( ema2 <= 1745.93 )
							if( ema13 <= 39.8343 )
								if( ema1 <= 1750.45 )
									ret := -1.000000 // sell
								if( ema1 > 1750.45 )
									ret := -0.833333 // sell
							if( ema13 > 39.8343 )
								ret := -0.450000
						if( ema2 > 1745.93 )
							if( tema <= 1961.52 )
								if( ema12 <= 15.5244 )
									ret := 0.011829
								if( ema12 > 15.5244 )
									ret := -0.616667
							if( tema > 1961.52 )
								if( ema2 <= 1964.27 )
									ret := -0.630137
								if( ema2 > 1964.27 )
									ret := -0.196359
					if( ema2 > 2123.1 )
						if( ema1 <= 2149.87 )
							if( ema1 <= 2137.48 )
								if( tema <= 2135.5 )
									ret := 0.984375 // buy
								if( tema > 2135.5 )
									ret := 0.875000 // buy
							if( ema1 > 2137.48 )
								if( ema1 <= 2146.92 )
									ret := -0.133333
								if( ema1 > 2146.92 )
									ret := 0.928571 // buy
						if( ema1 > 2149.87 )
							if( tema <= 2184.11 )
								if( ema3 <= 2166.58 )
									ret := -0.255556
								if( ema3 > 2166.58 )
									ret := -0.937500 // sell
							if( tema > 2184.11 )
								if( ema12 <= 4.68224 )
									ret := 0.404318
								if( ema12 > 4.68224 )
									ret := -0.015320
		if( ema1 > 3061.39 )
			if( ema12 <= -5.66475 )
				if( ema13 <= -39.3983 )
					if( ema1 <= 3119.73 )
						if( tema <= 3044.88 )
							if( ema13 <= -47.3186 )
								ret := 0.727273 // buy
							if( ema13 > -47.3186 )
								ret := 0.545455
						if( tema > 3044.88 )
							if( tema <= 3074.3 )
								if( tema <= 3048.59 )
									ret := -0.750000 // sell
								if( tema > 3048.59 )
									ret := -0.959184 // sell
							if( tema > 3074.3 )
								ret := -0.307692
					if( ema1 > 3119.73 )
						if( ema2 <= 3373.12 )
							if( tema <= 3313.51 )
								if( ema2 <= 3239.07 )
									ret := 0.725000 // buy
								if( ema2 > 3239.07 )
									ret := 0.382979
							if( tema > 3313.51 )
								ret := 1.000000 // buy
						if( ema2 > 3373.12 )
							if( ema13 <= -55.9519 )
								if( ema12 <= -40.7738 )
									ret := -0.400000
								if( ema12 > -40.7738 )
									ret := -0.777778 // sell
							if( ema13 > -55.9519 )
								if( ema1 <= 3605.9 )
									ret := -0.294118
								if( ema1 > 3605.9 )
									ret := 0.600000
				if( ema13 > -39.3983 )
					if( ema2 <= 3099.25 )
						if( ema12 <= -11.7682 )
							if( ema1 <= 3076.92 )
								if( ema12 <= -16.9092 )
									ret := -0.888889 // sell
								if( ema12 > -16.9092 )
									ret := -1.000000 // sell
							if( ema1 > 3076.92 )
								ret := -0.777778 // sell
						if( ema12 > -11.7682 )
							if( ema2 <= 3090.18 )
								if( ema1 <= 3075.28 )
									ret := -0.518519
								if( ema1 > 3075.28 )
									ret := 0.800000 // buy
							if( ema2 > 3090.18 )
								if( tema <= 3069.06 )
									ret := -1.000000 // sell
								if( tema > 3069.06 )
									ret := -0.526316
					if( ema2 > 3099.25 )
						if( tema <= 3558.13 )
							if( ema3 <= 3539.56 )
								if( ema1 <= 3499.04 )
									ret := -0.139814
								if( ema1 > 3499.04 )
									ret := -0.623529
							if( ema3 > 3539.56 )
								if( tema <= 3547.43 )
									ret := 0.136364
								if( tema > 3547.43 )
									ret := 0.857143 // buy
						if( tema > 3558.13 )
							if( ema3 <= 3700.76 )
								if( ema1 <= 3657.58 )
									ret := -0.549618
								if( ema1 > 3657.58 )
									ret := -1.000000 // sell
							if( ema3 > 3700.76 )
								if( ema13 <= -22.1365 )
									ret := 0.904762 // buy
								if( ema13 > -22.1365 )
									ret := -0.476190
			if( ema12 > -5.66475 )
				if( ema3 <= 2986.52 )
					ret := -1.000000 // sell
				if( ema3 > 2986.52 )
					if( tema <= 3142.95 )
						if( ema12 <= 2.38746 )
							if( ema3 <= 3128.97 )
								if( ema2 <= 3123.86 )
									ret := 0.274286
								if( ema2 > 3123.86 )
									ret := 0.841270 // buy
							if( ema3 > 3128.97 )
								if( ema2 <= 3143.4 )
									ret := -0.440000
								if( ema2 > 3143.4 )
									ret := 0.637931
						if( ema12 > 2.38746 )
							if( ema2 <= 3123.37 )
								if( ema12 <= 13.6161 )
									ret := -0.229091
								if( ema12 > 13.6161 )
									ret := 0.390977
							if( ema2 > 3123.37 )
								if( ema2 <= 3130.14 )
									ret := 0.583333
								if( ema2 > 3130.14 )
									ret := 0.965517 // buy
					if( tema > 3142.95 )
						if( ema1 <= 3180.62 )
							if( ema3 <= 3167.06 )
								if( ema13 <= 66.0794 )
									ret := -0.181731
								if( ema13 > 66.0794 )
									ret := 0.913043 // buy
							if( ema3 > 3167.06 )
								if( ema1 <= 3166.5 )
									ret := -0.094118
								if( ema1 > 3166.5 )
									ret := -0.692857
						if( ema1 > 3180.62 )
							if( ema1 <= 3209.45 )
								if( ema3 <= 3206.32 )
									ret := 0.227712
								if( ema3 > 3206.32 )
									ret := -0.438202
							if( ema1 > 3209.45 )
								if( ema1 <= 3727.94 )
									ret := -0.054457
								if( ema1 > 3727.94 )
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
float op_operation = decision_tree_0_AMZN_30Min_c11e0257(ema3, tema, ema2, ema12, ema13, ema1)

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


