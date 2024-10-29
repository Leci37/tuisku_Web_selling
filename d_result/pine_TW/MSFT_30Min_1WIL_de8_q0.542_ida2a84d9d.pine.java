//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Williams_Vix_Fix
// ID_model: MSFT_30Min_1WIL_a2a84d9d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_30Min_1WIL_a2a84d9d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_30Min_a2a84d9d(sDev, Color_con1, lowerBand, wvf, upperBand, midLine, Color_con2, rangeLow, colInt, rangeHigh)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=0.7, min_samples_leaf=7,min_samples_split=10, random_state=843828734)
	if( Color_con1 <= 0.58509 )
		if( Color_con1 <= -4.09354 )
			if( Color_con1 <= -8.80297 )
				if( midLine <= 5.04973 )
					ret := -0.666667
				if( midLine > 5.04973 )
					ret := -1.000000 // sell
			if( Color_con1 > -8.80297 )
				if( upperBand <= 7.23698 )
					if( lowerBand <= 0.613793 )
						if( sDev <= 3.16722 )
							if( lowerBand <= 0.082797 )
								if( wvf <= 0.664832 )
									ret := -0.116071
								if( wvf > 0.664832 )
									ret := 0.500000
							if( lowerBand > 0.082797 )
								if( Color_con2 <= -3.81494 )
									ret := 0.078947
								if( Color_con2 > -3.81494 )
									ret := -0.558824
						if( sDev > 3.16722 )
							if( lowerBand <= -1.33514 )
								if( wvf <= 0.770239 )
									ret := -0.684211
								if( wvf > 0.770239 )
									ret := 0.294118
							if( lowerBand > -1.33514 )
								if( Color_con1 <= -4.37725 )
									ret := -0.829670 // sell
								if( Color_con1 > -4.37725 )
									ret := 0.312500
					if( lowerBand > 0.613793 )
						if( upperBand <= 5.38648 )
							if( upperBand <= 4.87046 )
								if( wvf <= 0.511278 )
									ret := -0.111111
								if( wvf > 0.511278 )
									ret := 0.700000 // buy
							if( upperBand > 4.87046 )
								if( midLine <= 2.91497 )
									ret := -1.000000 // sell
								if( midLine > 2.91497 )
									ret := -0.625000
						if( upperBand > 5.38648 )
							if( upperBand <= 6.18639 )
								if( lowerBand <= 1.26328 )
									ret := 0.938776 // buy
								if( lowerBand > 1.26328 )
									ret := 0.600000
							if( upperBand > 6.18639 )
								if( Color_con2 <= -3.93132 )
									ret := 1.000000 // buy
								if( Color_con2 > -3.93132 )
									ret := -0.194444
				if( upperBand > 7.23698 )
					if( midLine <= 4.61723 )
						if( Color_con1 <= -6.81518 )
							if( upperBand <= 8.93589 )
								if( midLine <= 3.70937 )
									ret := -0.666667
								if( midLine > 3.70937 )
									ret := 0.095238
							if( upperBand > 8.93589 )
								ret := 0.538462
						if( Color_con1 > -6.81518 )
							if( Color_con2 <= -8.88756 )
								ret := -0.428571
							if( Color_con2 > -8.88756 )
								if( lowerBand <= -0.180925 )
									ret := 0.868687 // buy
								if( lowerBand > -0.180925 )
									ret := 0.409091
					if( midLine > 4.61723 )
						if( Color_con2 <= -7.0124 )
							if( Color_con2 <= -7.52987 )
								ret := 1.000000 // buy
							if( Color_con2 > -7.52987 )
								ret := 0.400000
						if( Color_con2 > -7.0124 )
							if( lowerBand <= 1.59786 )
								if( wvf <= 4.1096 )
									ret := -0.817073 // sell
								if( wvf > 4.1096 )
									ret := 0.800000 // buy
							if( lowerBand > 1.59786 )
								if( Color_con2 <= -2.6516 )
									ret := -0.007752
								if( Color_con2 > -2.6516 )
									ret := -0.800000 // sell
		if( Color_con1 > -4.09354 )
			if( midLine <= 1.02555 )
				if( Color_con1 <= -1.53155 )
					if( lowerBand <= -1.19661 )
						if( sDev <= 1.85863 )
							if( Color_con2 <= -0.592552 )
								ret := 0.900000 // buy
							if( Color_con2 > -0.592552 )
								ret := 1.000000 // buy
						if( sDev > 1.85863 )
							ret := -0.357143
					if( lowerBand > -1.19661 )
						if( Color_con1 <= -2.10747 )
							if( wvf <= 0.435571 )
								if( upperBand <= 2.62404 )
									ret := 0.308057
								if( upperBand > 2.62404 )
									ret := -0.232877
							if( wvf > 0.435571 )
								if( midLine <= 0.972827 )
									ret := -0.111111
								if( midLine > 0.972827 )
									ret := -0.800000 // sell
						if( Color_con1 > -2.10747 )
							if( wvf <= 0.152481 )
								if( Color_con2 <= -3.45686 )
									ret := 0.380952
								if( Color_con2 > -3.45686 )
									ret := -0.313208
							if( wvf > 0.152481 )
								if( midLine <= 0.786719 )
									ret := 0.233533
								if( midLine > 0.786719 )
									ret := -0.166087
				if( Color_con1 > -1.53155 )
					if( lowerBand <= 0.360849 )
						if( Color_con2 <= -6.03262 )
							if( Color_con1 <= -0.751489 )
								ret := 0.578947
							if( Color_con1 > -0.751489 )
								ret := 1.000000 // buy
						if( Color_con2 > -6.03262 )
							if( Color_con2 <= -2.35487 )
								if( lowerBand <= -0.290536 )
									ret := 0.400000
								if( lowerBand > -0.290536 )
									ret := -0.195670
							if( Color_con2 > -2.35487 )
								if( wvf <= 0.14281 )
									ret := -0.018570
								if( wvf > 0.14281 )
									ret := 0.043951
					if( lowerBand > 0.360849 )
						if( wvf <= 0.479602 )
							if( Color_con1 <= -0.664812 )
								if( sDev <= 0.524869 )
									ret := 0.296875
								if( sDev > 0.524869 )
									ret := -0.441176
							if( Color_con1 > -0.664812 )
								if( wvf <= 0.449633 )
									ret := -0.169811
								if( wvf > 0.449633 )
									ret := -0.774194 // sell
						if( wvf > 0.479602 )
							if( Color_con2 <= -1.18315 )
								if( upperBand <= 1.19161 )
									ret := 0.315789
								if( upperBand > 1.19161 )
									ret := 0.738095 // buy
							if( Color_con2 > -1.18315 )
								if( lowerBand <= 0.55728 )
									ret := 0.219237
								if( lowerBand > 0.55728 )
									ret := -0.103261
			if( midLine > 1.02555 )
				if( wvf <= 1.38468 )
					if( lowerBand <= -1.04594 )
						if( wvf <= 0.69692 )
							if( lowerBand <= -1.06854 )
								if( Color_con1 <= -3.85342 )
									ret := -0.600000
								if( Color_con1 > -3.85342 )
									ret := -0.910448 // sell
							if( lowerBand > -1.06854 )
								ret := 0.000000
						if( wvf > 0.69692 )
							if( sDev <= 2.4498 )
								ret := -1.000000 // sell
							if( sDev > 2.4498 )
								if( Color_con2 <= -1.27947 )
									ret := 0.375000
								if( Color_con2 > -1.27947 )
									ret := -0.222222
					if( lowerBand > -1.04594 )
						if( upperBand <= 4.22121 )
							if( midLine <= 1.91321 )
								if( sDev <= 1.39112 )
									ret := 0.121720
								if( sDev > 1.39112 )
									ret := 0.219461
							if( midLine > 1.91321 )
								if( Color_con2 <= -1.96578 )
									ret := -0.298578
								if( Color_con2 > -1.96578 )
									ret := 0.093431
						if( upperBand > 4.22121 )
							if( upperBand <= 4.83782 )
								if( upperBand <= 4.60441 )
									ret := 0.358333
								if( upperBand > 4.60441 )
									ret := 0.822222 // buy
							if( upperBand > 4.83782 )
								if( sDev <= 1.9753 )
									ret := -0.857143 // sell
								if( sDev > 1.9753 )
									ret := 0.035294
				if( wvf > 1.38468 )
					if( wvf <= 5.88358 )
						if( sDev <= 0.855368 )
							if( upperBand <= 1.80003 )
								if( sDev <= 0.563153 )
									ret := -0.526882
								if( sDev > 0.563153 )
									ret := 0.000000
							if( upperBand > 1.80003 )
								if( Color_con2 <= -0.652094 )
									ret := 0.396040
								if( Color_con2 > -0.652094 )
									ret := 0.163100
						if( sDev > 0.855368 )
							if( Color_con1 <= -2.75277 )
								if( wvf <= 4.13675 )
									ret := 0.156291
								if( wvf > 4.13675 )
									ret := 0.732673 // buy
							if( Color_con1 > -2.75277 )
								if( lowerBand <= 0.925992 )
									ret := 0.036406
								if( lowerBand > 0.925992 )
									ret := -0.119134
					if( wvf > 5.88358 )
						if( upperBand <= 8.54397 )
							if( lowerBand <= -1.3283 )
								if( lowerBand <= -2.28952 )
									ret := 1.000000 // buy
								if( lowerBand > -2.28952 )
									ret := -0.238095
							if( lowerBand > -1.3283 )
								if( wvf <= 6.00398 )
									ret := 0.486486
								if( wvf > 6.00398 )
									ret := 0.828125 // buy
						if( upperBand > 8.54397 )
							if( wvf <= 6.98076 )
								if( upperBand <= 8.78217 )
									ret := -0.466667
								if( upperBand > 8.78217 )
									ret := -0.970588 // sell
							if( wvf > 6.98076 )
								if( Color_con2 <= 1.6852 )
									ret := 0.693878
								if( Color_con2 > 1.6852 )
									ret := -0.236842
	if( Color_con1 > 0.58509 )
		if( sDev <= 2.00589 )
			if( Color_con2 <= -0.260186 )
				ret := -0.454545
			if( Color_con2 > -0.260186 )
				if( Color_con2 <= 1.48542 )
					if( lowerBand <= -0.405115 )
						if( lowerBand <= -0.670241 )
							if( wvf <= 3.0392 )
								ret := -0.363636
							if( wvf > 3.0392 )
								ret := 0.222222
						if( lowerBand > -0.670241 )
							if( wvf <= 2.14462 )
								ret := 1.000000 // buy
							if( wvf > 2.14462 )
								if( Color_con2 <= 1.06553 )
									ret := 0.200000
								if( Color_con2 > 1.06553 )
									ret := 0.842105 // buy
					if( lowerBand > -0.405115 )
						if( Color_con2 <= 1.34708 )
							if( midLine <= 1.2064 )
								if( sDev <= 0.738442 )
									ret := -0.090909
								if( sDev > 0.738442 )
									ret := 0.312500
							if( midLine > 1.2064 )
								ret := 1.000000 // buy
						if( Color_con2 > 1.34708 )
							ret := -0.937500 // sell
				if( Color_con2 > 1.48542 )
					if( wvf <= 4.25457 )
						if( upperBand <= 2.84517 )
							if( upperBand <= 2.32413 )
								if( Color_con1 <= 1.13485 )
									ret := 0.785714 // buy
								if( Color_con1 > 1.13485 )
									ret := 1.000000 // buy
							if( upperBand > 2.32413 )
								if( Color_con1 <= 1.05773 )
									ret := -0.083333
								if( Color_con1 > 1.05773 )
									ret := 0.714286 // buy
						if( upperBand > 2.84517 )
							ret := 1.000000 // buy
					if( wvf > 4.25457 )
						if( wvf <= 5.04866 )
							ret := 0.000000
						if( wvf > 5.04866 )
							ret := 0.692308
		if( sDev > 2.00589 )
			if( upperBand <= 5.14257 )
				if( wvf <= 5.17387 )
					if( upperBand <= 3.51628 )
						if( wvf <= 4.33307 )
							ret := -0.529412
						if( wvf > 4.33307 )
							ret := 0.454545
					if( upperBand > 3.51628 )
						if( Color_con1 <= 0.818002 )
							ret := 0.750000 // buy
						if( Color_con1 > 0.818002 )
							ret := 1.000000 // buy
				if( wvf > 5.17387 )
					if( midLine <= 1.51869 )
						ret := -0.500000
					if( midLine > 1.51869 )
						ret := -1.000000 // sell
			if( upperBand > 5.14257 )
				if( midLine <= 2.94643 )
					ret := 1.000000 // buy
				if( midLine > 2.94643 )
					ret := 0.625000
	
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
float op_operation = decision_tree_0_MSFT_30Min_a2a84d9d(sDev, Color_con1, lowerBand, wvf, upperBand, midLine, Color_con2, rangeLow, colInt, rangeHigh)

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


