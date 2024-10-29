//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Williams_Vix_Fix
// ID_model: ASAN_15Min_1WIL_326b663a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ASAN_15Min_1WIL_326b663a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ASAN_15Min_326b663a(rangeHigh, rangeLow, midLine, sDev, lowerBand, wvf, Color_con1, colInt, Color_con2, upperBand)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( wvf <= 0.212936 )
		if( lowerBand <= 0.149542 )
			if( Color_con2 <= -1.92275 )
				if( midLine <= 3.20229 )
					if( Color_con2 <= -5.64385 )
						if( lowerBand <= -0.749418 )
							ret := -0.387755
						if( lowerBand > -0.749418 )
							ret := -0.850000 // sell
					if( Color_con2 > -5.64385 )
						if( Color_con2 <= -2.59298 )
							ret := -0.138991
						if( Color_con2 > -2.59298 )
							ret := -0.354955
				if( midLine > 3.20229 )
					if( Color_con2 <= -4.53152 )
						if( lowerBand <= -0.420853 )
							ret := 0.075758
						if( lowerBand > -0.420853 )
							ret := -0.550000
					if( Color_con2 > -4.53152 )
						if( lowerBand <= -0.09242 )
							ret := 1.000000 // buy
						if( lowerBand > -0.09242 )
							ret := -0.500000
			if( Color_con2 > -1.92275 )
				if( Color_con1 <= -1.16772 )
					if( sDev <= 0.877689 )
						if( lowerBand <= -0.167849 )
							ret := 0.370370
						if( lowerBand > -0.167849 )
							ret := -0.627660
					if( sDev > 0.877689 )
						if( upperBand <= 1.95972 )
							ret := 0.286822
						if( upperBand > 1.95972 )
							ret := -0.202381
				if( Color_con1 > -1.16772 )
					if( Color_con2 <= -1.1815 )
						if( lowerBand <= -0.237991 )
							ret := -0.057143
						if( lowerBand > -0.237991 )
							ret := 0.722222 // buy
					if( Color_con2 > -1.1815 )
						if( Color_con1 <= -1.02577 )
							ret := 0.571429
						if( Color_con1 > -1.02577 )
							ret := -0.333333
		if( lowerBand > 0.149542 )
			if( Color_con1 <= -1.60285 )
				if( wvf <= 0.028403 )
					if( Color_con1 <= -3.34602 )
						if( midLine <= 3.21605 )
							ret := -0.446429
						if( midLine > 3.21605 )
							ret := -0.800000 // sell
					if( Color_con1 > -3.34602 )
						if( lowerBand <= 0.212434 )
							ret := -0.631579
						if( lowerBand > 0.212434 )
							ret := -0.903846 // sell
				if( wvf > 0.028403 )
					if( sDev <= 0.836906 )
						ret := -1.000000 // sell
					if( sDev > 0.836906 )
						if( Color_con2 <= -4.23452 )
							ret := -0.605263
						if( Color_con2 > -4.23452 )
							ret := -0.179487
			if( Color_con1 > -1.60285 )
				if( wvf <= 0.180487 )
					ret := 0.000000
				if( wvf > 0.180487 )
					ret := 1.000000 // buy
	if( wvf > 0.212936 )
		if( Color_con1 <= -0.911128 )
			if( upperBand <= 21.9874 )
				if( lowerBand <= 5.1451 )
					if( Color_con2 <= -8.99932 )
						if( sDev <= 9.05065 )
							ret := -0.299864
						if( sDev > 9.05065 )
							ret := 0.315789
					if( Color_con2 > -8.99932 )
						if( Color_con1 <= -13.4806 )
							ret := 0.682927
						if( Color_con1 > -13.4806 )
							ret := -0.006783
				if( lowerBand > 5.1451 )
					if( sDev <= 3.91456 )
						if( sDev <= 2.82491 )
							ret := 0.156028
						if( sDev > 2.82491 )
							ret := 0.653179
					if( sDev > 3.91456 )
						if( midLine <= 10.6395 )
							ret := -0.458333
						if( midLine > 10.6395 )
							ret := 0.682540
			if( upperBand > 21.9874 )
				if( sDev <= 10.686 )
					if( Color_con2 <= -1.32605 )
						if( wvf <= 11.0847 )
							ret := -0.277778
						if( wvf > 11.0847 )
							ret := -0.818182 // sell
					if( Color_con2 > -1.32605 )
						if( midLine <= 16.0805 )
							ret := 0.894737 // buy
						if( midLine > 16.0805 )
							ret := -0.400000
				if( sDev > 10.686 )
					if( sDev <= 13.6133 )
						if( Color_con2 <= -1.01334 )
							ret := -0.931034 // sell
						if( Color_con2 > -1.01334 )
							ret := -0.621212
					if( sDev > 13.6133 )
						if( sDev <= 15.4296 )
							ret := 0.175000
						if( sDev > 15.4296 )
							ret := -0.928571 // sell
		if( Color_con1 > -0.911128 )
			if( wvf <= 3.21646 )
				if( sDev <= 1.59725 )
					if( lowerBand <= -0.391385 )
						if( Color_con1 <= 0.616514 )
							ret := -0.174279
						if( Color_con1 > 0.616514 )
							ret := 0.344538
					if( lowerBand > -0.391385 )
						if( Color_con2 <= -2.07325 )
							ret := 0.272000
						if( Color_con2 > -2.07325 )
							ret := 0.111697
				if( sDev > 1.59725 )
					if( Color_con2 <= -0.08569 )
						if( lowerBand <= -0.630244 )
							ret := 0.614865
						if( lowerBand > -0.630244 )
							ret := 0.262821
					if( Color_con2 > -0.08569 )
						if( sDev <= 2.04449 )
							ret := 0.202652
						if( sDev > 2.04449 )
							ret := -0.126667
			if( wvf > 3.21646 )
				if( Color_con2 <= 0.321316 )
					if( sDev <= 4.12905 )
						if( wvf <= 6.95039 )
							ret := -0.178676
						if( wvf > 6.95039 )
							ret := -0.596899
					if( sDev > 4.12905 )
						if( upperBand <= 7.0856 )
							ret := -0.409091
						if( upperBand > 7.0856 )
							ret := 0.578512
				if( Color_con2 > 0.321316 )
					if( sDev <= 12.1727 )
						if( Color_con2 <= 0.713868 )
							ret := 0.220486
						if( Color_con2 > 0.713868 )
							ret := 0.013089
					if( sDev > 12.1727 )
						ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_ASAN_15Min_326b663a(rangeHigh, rangeLow, midLine, sDev, lowerBand, wvf, Color_con1, colInt, Color_con2, upperBand)

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


