//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Williams_Vix_Fix
// ID_model: ATOMUSDT_30Min_1WIL_e421bbe6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ATOMUSDT_30Min_1WIL_e421bbe6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ATOMUSDT_30Min_e421bbe6(rangeHigh, rangeLow, midLine, sDev, lowerBand, wvf, Color_con1, colInt, Color_con2, upperBand)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( lowerBand <= 5.72903 )
		if( Color_con2 <= 2.33121 )
			if( upperBand <= 28.3076 )
				if( wvf <= 2.88103 )
					if( midLine <= 2.21637 )
						if( Color_con2 <= -6.96456 )
							if( sDev <= 0.938303 )
								if( upperBand <= 1.80512 )
									ret := -0.222222
								if( upperBand > 1.80512 )
									ret := 0.613333
							if( sDev > 0.938303 )
								if( wvf <= 2.64153 )
									ret := -0.249685
								if( wvf > 2.64153 )
									ret := 0.750000 // buy
						if( Color_con2 > -6.96456 )
							if( sDev <= 0.694634 )
								if( Color_con2 <= -2.13194 )
									ret := -0.238323
								if( Color_con2 > -2.13194 )
									ret := -0.057731
							if( sDev > 0.694634 )
								if( upperBand <= 2.20428 )
									ret := 0.057752
								if( upperBand > 2.20428 )
									ret := -0.018017
					if( midLine > 2.21637 )
						if( Color_con2 <= -3.64466 )
							if( midLine <= 2.38907 )
								if( Color_con1 <= -3.57868 )
									ret := 0.033457
								if( Color_con1 > -3.57868 )
									ret := -0.496552
							if( midLine > 2.38907 )
								if( lowerBand <= -1.11097 )
									ret := -0.139459
								if( lowerBand > -1.11097 )
									ret := 0.061875
						if( Color_con2 > -3.64466 )
							if( midLine <= 2.67298 )
								if( lowerBand <= -1.10878 )
									ret := -0.660000
								if( lowerBand > -1.10878 )
									ret := -0.039958
							if( midLine > 2.67298 )
								if( lowerBand <= -0.402258 )
									ret := -0.373626
								if( lowerBand > -0.402258 )
									ret := -0.128071
				if( wvf > 2.88103 )
					if( Color_con2 <= -1.79255 )
						if( Color_con1 <= -1.98817 )
							if( sDev <= 9.81075 )
								if( wvf <= 4.08212 )
									ret := 0.100541
								if( wvf > 4.08212 )
									ret := -0.008704
							if( sDev > 9.81075 )
								if( wvf <= 4.47136 )
									ret := 0.653543
								if( wvf > 4.47136 )
									ret := 0.121495
						if( Color_con1 > -1.98817 )
							if( sDev <= 2.27501 )
								if( Color_con1 <= 0.288283 )
									ret := 0.148815
								if( Color_con1 > 0.288283 )
									ret := -0.446043
							if( sDev > 2.27501 )
								if( sDev <= 2.35583 )
									ret := 0.737864 // buy
								if( sDev > 2.35583 )
									ret := 0.258508
					if( Color_con2 > -1.79255 )
						if( colInt <= 0.5 )
							if( wvf <= 11.9586 )
								if( sDev <= 2.68958 )
									ret := -0.061467
								if( sDev > 2.68958 )
									ret := 0.035530
							if( wvf > 11.9586 )
								if( wvf <= 13.1657 )
									ret := -0.654321
								if( wvf > 13.1657 )
									ret := 0.027397
						if( colInt > 0.5 )
							if( sDev <= 1.98257 )
								if( wvf <= 6.03237 )
									ret := 0.113678
								if( wvf > 6.03237 )
									ret := 0.588235
							if( sDev > 1.98257 )
								if( wvf <= 10.4057 )
									ret := -0.018306
								if( wvf > 10.4057 )
									ret := 0.184438
			if( upperBand > 28.3076 )
				if( Color_con2 <= -19.5086 )
					if( Color_con2 <= -22.1462 )
						if( Color_con1 <= -28.2552 )
							ret := -0.125000
						if( Color_con1 > -28.2552 )
							ret := -1.000000 // sell
					if( Color_con2 > -22.1462 )
						ret := 0.727273 // buy
				if( Color_con2 > -19.5086 )
					if( upperBand <= 30.0509 )
						if( sDev <= 13.5367 )
							ret := -1.000000 // sell
						if( sDev > 13.5367 )
							ret := -0.740741 // sell
					if( upperBand > 30.0509 )
						if( upperBand <= 31.0709 )
							ret := 0.785714 // buy
						if( upperBand > 31.0709 )
							if( colInt <= 0.5 )
								if( Color_con1 <= -21.7292 )
									ret := -1.000000 // sell
								if( Color_con1 > -21.7292 )
									ret := 0.272727
							if( colInt > 0.5 )
								ret := -1.000000 // sell
		if( Color_con2 > 2.33121 )
			if( sDev <= 2.36319 )
				if( lowerBand <= -0.645552 )
					if( midLine <= 1.1847 )
						ret := -0.555556
					if( midLine > 1.1847 )
						if( Color_con1 <= 1.02093 )
							ret := 0.333333
						if( Color_con1 > 1.02093 )
							ret := -0.100000
				if( lowerBand > -0.645552 )
					if( Color_con1 <= 0.885403 )
						if( Color_con1 <= 0.710101 )
							if( wvf <= 3.98118 )
								ret := 1.000000 // buy
							if( wvf > 3.98118 )
								if( sDev <= 2.22028 )
									ret := 0.933333 // buy
								if( sDev > 2.22028 )
									ret := 0.384615
						if( Color_con1 > 0.710101 )
							ret := 1.000000 // buy
					if( Color_con1 > 0.885403 )
						if( Color_con1 <= 0.919634 )
							ret := -0.200000
						if( Color_con1 > 0.919634 )
							if( sDev <= 2.01972 )
								if( Color_con2 <= 2.727 )
									ret := -0.090909
								if( Color_con2 > 2.727 )
									ret := 0.416667
							if( sDev > 2.01972 )
								if( Color_con1 <= 1.49466 )
									ret := 0.906250 // buy
								if( Color_con1 > 1.49466 )
									ret := 0.692308
			if( sDev > 2.36319 )
				if( Color_con1 <= 5.43789 )
					if( upperBand <= 8.35119 )
						if( upperBand <= 5.82818 )
							if( wvf <= 6.94442 )
								if( Color_con2 <= 3.08576 )
									ret := -0.011811
								if( Color_con2 > 3.08576 )
									ret := 0.430000
							if( wvf > 6.94442 )
								if( Color_con2 <= 5.70331 )
									ret := -0.682927
								if( Color_con2 > 5.70331 )
									ret := -0.142857
						if( upperBand > 5.82818 )
							if( midLine <= 2.58026 )
								if( midLine <= 1.89501 )
									ret := -0.833333 // sell
								if( midLine > 1.89501 )
									ret := 0.662983
							if( midLine > 2.58026 )
								if( sDev <= 3.18989 )
									ret := 0.545852
								if( sDev > 3.18989 )
									ret := 0.154848
					if( upperBand > 8.35119 )
						if( lowerBand <= -1.42946 )
							if( Color_con2 <= 11.7539 )
								if( wvf <= 6.15194 )
									ret := 0.909091 // buy
								if( wvf > 6.15194 )
									ret := -0.171429
							if( Color_con2 > 11.7539 )
								if( wvf <= 25.5382 )
									ret := 0.944444 // buy
								if( wvf > 25.5382 )
									ret := 0.076923
						if( lowerBand > -1.42946 )
							if( upperBand <= 8.66281 )
								if( midLine <= 4.24383 )
									ret := -0.666667
								if( midLine > 4.24383 )
									ret := 0.000000
							if( upperBand > 8.66281 )
								if( wvf <= 7.74834 )
									ret := -0.550000
								if( wvf > 7.74834 )
									ret := 0.230955
				if( Color_con1 > 5.43789 )
					ret := 1.000000 // buy
	if( lowerBand > 5.72903 )
		if( midLine <= 11.2415 )
			if( wvf <= 4.95597 )
				ret := -0.500000
			if( wvf > 4.95597 )
				if( lowerBand <= 6.06144 )
					if( Color_con2 <= 0.585149 )
						if( Color_con2 <= -4.26127 )
							ret := 0.727273 // buy
						if( Color_con2 > -4.26127 )
							if( wvf <= 8.12706 )
								if( upperBand <= 10.8611 )
									ret := 0.090909
								if( upperBand > 10.8611 )
									ret := 0.562500
							if( wvf > 8.12706 )
								if( sDev <= 4.01364 )
									ret := -0.642857
								if( sDev > 4.01364 )
									ret := 0.250000
					if( Color_con2 > 0.585149 )
						ret := 0.800000 // buy
				if( lowerBand > 6.06144 )
					if( sDev <= 2.46299 )
						if( Color_con1 <= -2.48717 )
							ret := 0.789474 // buy
						if( Color_con1 > -2.48717 )
							ret := -0.533333
					if( sDev > 2.46299 )
						if( wvf <= 11.2528 )
							if( lowerBand <= 6.39883 )
								if( lowerBand <= 6.28903 )
									ret := 0.853659 // buy
								if( lowerBand > 6.28903 )
									ret := 0.363636
							if( lowerBand > 6.39883 )
								if( Color_con1 <= -5.36765 )
									ret := 0.666667
								if( Color_con1 > -5.36765 )
									ret := 0.917355 // buy
						if( wvf > 11.2528 )
							ret := 0.250000
		if( midLine > 11.2415 )
			if( midLine <= 13.343 )
				if( sDev <= 4.72953 )
					if( upperBand <= 16.4132 )
						if( sDev <= 4.03634 )
							if( wvf <= 11.8434 )
								if( wvf <= 9.50271 )
									ret := -0.062500
								if( wvf > 9.50271 )
									ret := -0.735294 // sell
							if( wvf > 11.8434 )
								if( colInt <= 0.5 )
									ret := 0.461538
								if( colInt > 0.5 )
									ret := -0.586207
						if( sDev > 4.03634 )
							ret := 0.750000 // buy
					if( upperBand > 16.4132 )
						if( sDev <= 4.10952 )
							ret := -0.750000 // sell
						if( sDev > 4.10952 )
							if( wvf <= 9.68632 )
								ret := -0.909091 // sell
							if( wvf > 9.68632 )
								ret := -1.000000 // sell
				if( sDev > 4.72953 )
					if( upperBand <= 17.8613 )
						if( Color_con2 <= -0.768683 )
							if( wvf <= 9.27324 )
								ret := 0.625000
							if( wvf > 9.27324 )
								ret := -0.400000
						if( Color_con2 > -0.768683 )
							if( upperBand <= 17.5508 )
								ret := 0.875000 // buy
							if( upperBand > 17.5508 )
								ret := 1.000000 // buy
					if( upperBand > 17.8613 )
						if( wvf <= 9.37205 )
							if( upperBand <= 19.2506 )
								if( Color_con1 <= -11.2075 )
									ret := -1.000000 // sell
								if( Color_con1 > -11.2075 )
									ret := -0.923077 // sell
							if( upperBand > 19.2506 )
								ret := -0.375000
						if( wvf > 9.37205 )
							if( wvf <= 13.2488 )
								if( lowerBand <= 6.04041 )
									ret := 0.538462
								if( lowerBand > 6.04041 )
									ret := -0.777778 // sell
							if( wvf > 13.2488 )
								ret := 1.000000 // buy
			if( midLine > 13.343 )
				if( sDev <= 19.7953 )
					if( Color_con2 <= -5.5934 )
						if( upperBand <= 29.1719 )
							if( lowerBand <= 11.0866 )
								if( sDev <= 5.96579 )
									ret := 0.964286 // buy
								if( sDev > 5.96579 )
									ret := 0.593407
							if( lowerBand > 11.0866 )
								ret := -0.818182 // sell
						if( upperBand > 29.1719 )
							if( Color_con1 <= -16.0578 )
								ret := 1.000000 // buy
							if( Color_con1 > -16.0578 )
								if( wvf <= 18.3493 )
									ret := 0.411765
								if( wvf > 18.3493 )
									ret := 1.000000 // buy
					if( Color_con2 > -5.5934 )
						if( midLine <= 17.9105 )
							if( lowerBand <= 9.30138 )
								if( sDev <= 7.24538 )
									ret := 0.220930
								if( sDev > 7.24538 )
									ret := -0.565789
							if( lowerBand > 9.30138 )
								if( lowerBand <= 11.1074 )
									ret := 0.925926 // buy
								if( lowerBand > 11.1074 )
									ret := 0.333333
						if( midLine > 17.9105 )
							if( Color_con1 <= -10.4148 )
								if( lowerBand <= 9.30913 )
									ret := 0.000000
								if( lowerBand > 9.30913 )
									ret := 1.000000 // buy
							if( Color_con1 > -10.4148 )
								if( Color_con1 <= -9.09434 )
									ret := 0.714286 // buy
								if( Color_con1 > -9.09434 )
									ret := 1.000000 // buy
				if( sDev > 19.7953 )
					if( Color_con2 <= -3.43388 )
						ret := -1.000000 // sell
					if( Color_con2 > -3.43388 )
						ret := -0.571429
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Williams_Vix_Fix 
//@version=5
//indicator "CM_Williams_Vix_Fix", overlay=false)

// Inputs
pd = input.int(22, title="LookBack Period Standard Deviation High")
bbl = input.int(20, title="Bollinger Band Length")
mult = input.float(2.0, minval=1, maxval=5, title="Bollinger Band Standard Deviation Up")
lb = input.int(50, title="Look Back Period Percentile High")
ph = input.float(0.85, title="Highest Percentile - 0.90=90%, 0.95=95%, 0.99=99%")
pl = input.float(1.01, title="Lowest Percentile - 1.10=90%, 1.05=95%, 1.01=99%")
hp = input.bool(false, title="Show High Range - Based on Percentile and LookBack Period?")
sd = input.bool(false, title="Show Standard Deviation Line?")

// Calculations
wvf = ((ta.highest(close, pd) - low) / ta.highest(close, pd)) * 100

sDev = mult * ta.stdev(wvf, bbl)
midLine = ta.sma(wvf, bbl)
lowerBand = midLine - sDev
upperBand = midLine + sDev

rangeHigh = ta.highest(wvf, lb) * ph
rangeLow = ta.lowest(wvf, lb) * pl


Color_con1 = wvf - upperBand
Color_con2 = wvf - rangeHigh
// Color condition
col = wvf >= upperBand or wvf >= rangeHigh ? color.lime : color.gray
colInt = wvf >= upperBand or wvf >= rangeHigh ? 1 : 0 //Bool to int

// Plots
plot(hp and na(rangeHigh) ? na : rangeHigh, title="Range High Percentile", color=color.orange, linewidth=4)
plot(hp and na(rangeLow) ? na : rangeLow, title="Range Low Percentile", color=color.orange, linewidth=4)
plot(wvf, title="Williams Vix Fix", color=col, style=plot.style_histogram, linewidth=4)
plot(sd and na(upperBand) ? na : upperBand, title="Upper Band", color=color.aqua, linewidth=3)

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
float op_operation = decision_tree_0_ATOMUSDT_30Min_e421bbe6(rangeHigh, rangeLow, midLine, sDev, lowerBand, wvf, Color_con1, colInt, Color_con2, upperBand)

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


