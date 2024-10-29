//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: MACD_ULT_MTF
// ID_model: ADBE_1Hour_1MAC_bb8c744d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADBE_1Hour_1MAC_bb8c744d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADBE_1Hour_bb8c744d(macd_IsAboveInt, histB_IsDownInt, histA_IsDownInt, histB_IsUpInt, signal, histA_IsUpInt, hist, macd_IsBelowInt, macd)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( hist <= -1.08352 )
		if( histB_IsUpInt <= 0.5 )
			if( macd <= 1.56137 )
				if( macd <= -2.44858 )
					if( hist <= -4.31613 )
						if( histB_IsDownInt <= 0.5 )
							ret := 0.793103 // buy
						if( histB_IsDownInt > 0.5 )
							ret := 0.121212
					if( hist > -4.31613 )
						if( signal <= -4.79763 )
							ret := -0.517241
						if( signal > -4.79763 )
							ret := 0.084677
				if( macd > -2.44858 )
					if( signal <= 1.79523 )
						if( signal <= 0.010857 )
							ret := -0.456410
						if( signal > 0.010857 )
							ret := 0.089059
					if( signal > 1.79523 )
						if( hist <= -1.78693 )
							ret := -0.267857
						if( hist > -1.78693 )
							ret := -0.648649
			if( macd > 1.56137 )
				if( hist <= -1.64122 )
					if( histB_IsDownInt <= 0.5 )
						ret := -1.000000 // sell
					if( histB_IsDownInt > 0.5 )
						if( hist <= -2.20048 )
							ret := -0.250000
						if( hist > -2.20048 )
							ret := 0.048387
				if( hist > -1.64122 )
					if( macd <= 6.14906 )
						if( macd <= 4.10927 )
							ret := 0.345070
						if( macd > 4.10927 )
							ret := 0.702128 // buy
					if( macd > 6.14906 )
						ret := -0.095238
		if( histB_IsUpInt > 0.5 )
			if( signal <= -9.75218 )
				if( macd <= -17.0975 )
					ret := -1.000000 // sell
				if( macd > -17.0975 )
					if( hist <= -1.91949 )
						ret := -0.888889 // sell
					if( hist > -1.91949 )
						ret := -0.818182 // sell
			if( signal > -9.75218 )
				if( macd <= -0.51173 )
					if( signal <= -0.566799 )
						if( macd <= -4.02777 )
							ret := -0.383420
						if( macd > -4.02777 )
							ret := 0.012397
					if( signal > -0.566799 )
						if( signal <= -0.406702 )
							ret := -0.911111 // sell
						if( signal > -0.406702 )
							ret := -0.390476
				if( macd > -0.51173 )
					if( macd <= 5.03724 )
						if( signal <= 2.01626 )
							ret := 0.062893
						if( signal > 2.01626 )
							ret := -0.178947
					if( macd > 5.03724 )
						ret := -0.866667 // sell
	if( hist > -1.08352 )
		if( signal <= 0.301419 )
			if( hist <= -0.772111 )
				if( macd <= -3.43244 )
					if( macd <= -7.19249 )
						if( macd <= -9.39877 )
							ret := 0.200000
						if( macd > -9.39877 )
							ret := 0.076923
					if( macd > -7.19249 )
						if( macd <= -6.21404 )
							ret := -0.902439 // sell
						if( macd > -6.21404 )
							ret := -0.356784
				if( macd > -3.43244 )
					if( macd <= -0.743034 )
						if( signal <= -0.69028 )
							ret := 0.028302
						if( signal > -0.69028 )
							ret := -0.245192
					if( macd > -0.743034 )
						if( macd <= -0.698514 )
							ret := 0.950000 // buy
						if( macd > -0.698514 )
							ret := 0.137931
			if( hist > -0.772111 )
				if( macd <= -3.84194 )
					if( signal <= -4.75033 )
						if( hist <= 1.55078 )
							ret := 0.041540
						if( hist > 1.55078 )
							ret := 0.356846
					if( signal > -4.75033 )
						if( macd <= -4.18221 )
							ret := 0.282258
						if( macd > -4.18221 )
							ret := 0.672316
				if( macd > -3.84194 )
					if( hist <= 2.14285 )
						if( signal <= -3.42133 )
							ret := -0.180380
						if( signal > -3.42133 )
							ret := 0.098005
					if( hist > 2.14285 )
						if( macd <= 0.688369 )
							ret := -0.007018
						if( macd > 0.688369 )
							ret := -0.377880
		if( signal > 0.301419 )
			if( hist <= -0.949664 )
				if( macd <= 0.526581 )
					if( hist <= -1.00883 )
						if( signal <= 0.627766 )
							ret := 0.739130 // buy
						if( signal > 0.627766 )
							ret := 0.244898
					if( hist > -1.00883 )
						if( signal <= 0.715912 )
							ret := -0.363636
						if( signal > 0.715912 )
							ret := 0.133333
				if( macd > 0.526581 )
					if( macd <= 3.14248 )
						if( histB_IsUpInt <= 0.5 )
							ret := 0.660000
						if( histB_IsUpInt > 0.5 )
							ret := 0.321429
					if( macd > 3.14248 )
						if( hist <= -1.02622 )
							ret := 0.600000
						if( hist > -1.02622 )
							ret := -0.151515
			if( hist > -0.949664 )
				if( signal <= 0.439786 )
					if( macd <= 0.620653 )
						if( hist <= -0.54967 )
							ret := -0.233766
						if( hist > -0.54967 )
							ret := -0.518152
					if( macd > 0.620653 )
						if( hist <= 0.533007 )
							ret := 0.364706
						if( hist > 0.533007 )
							ret := -0.166667
				if( signal > 0.439786 )
					if( hist <= 2.52984 )
						if( signal <= 3.7369 )
							ret := -0.013048
						if( signal > 3.7369 )
							ret := -0.147878
					if( hist > 2.52984 )
						if( hist <= 3.69611 )
							ret := 0.561224
						if( hist > 3.69611 )
							ret := -0.333333
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator MACD_ULT_MTF 
//@version=5
//indicator title="CM_MacD_Ult_MTF", shorttitle="CM_Ult_MacD_MTF", overlay=false)

source = close
useCurrentRes = input(true, title="Use Current Chart Resolution?")
resCustom = input.timeframe(title="Use Different Timeframe? Uncheck Box Above", defval="60")
smd = input(true, title="Show MacD & Signal Line? Also Turn Off Dots Below")
sd = input(true, title="Show Dots When MacD Crosses Signal Line?")
sh = input(true, title="Show Histogram?")
macd_colorChange = input(true,title="Change MacD Line Color-Signal Line Cross?")
hist_colorChange = input(true,title="MacD Histogram 4 Colors?")

res = useCurrentRes ? timeframe.period : resCustom

fastLength = input.int(12, minval=1)
slowLength = input.int(26, minval=1)
signalLength = input.int(9, minval=1)

fastMA = ta.ema(source, fastLength)
slowMA = ta.ema(source, slowLength)

macd = fastMA - slowMA
signal = ta.sma(macd, signalLength)
hist = macd - signal

outMacD = request.security(syminfo.tickerid, res, macd)
outSignal = request.security(syminfo.tickerid, res, signal)
outHist = request.security(syminfo.tickerid, res, hist)

histA_IsUp = outHist > outHist[1] and outHist > 0
histA_IsDown = outHist < outHist[1] and outHist > 0
histB_IsDown = outHist < outHist[1] and outHist <= 0
histB_IsUp = outHist > outHist[1] and outHist <= 0

// MacD Color Definitions
macd_IsAbove = outMacD >= outSignal
macd_IsBelow = outMacD < outSignal

plot_color = hist_colorChange ? histA_IsUp ? color.aqua : histA_IsDown ? color.blue : histB_IsDown ? color.red : histB_IsUp ? color.maroon : color.yellow : color.gray
macd_color = macd_colorChange ? macd_IsAbove ? color.lime : color.red : color.red
signal_color = macd_colorChange ? macd_IsAbove ? color.yellow : color.yellow : color.lime

circleYPosition = outSignal

plot(smd and outMacD ? outMacD : na, title="MACD", color=macd_color, linewidth=4)
plot(smd and outSignal ? outSignal : na, title="Signal Line", color=signal_color, style=plot.style_line, linewidth=2)
plot(sh and outHist ? outHist : na, title="Histogram", color=plot_color, style=plot.style_histogram, linewidth=4)
plot(sd and ta.cross(outMacD, outSignal) ? circleYPosition : na, title="Cross", style=plot.style_circles, linewidth=4, color=macd_color)
hline(0, '0 Line', linestyle=hline.style_solid, linewidth=2, color=color.white)

histA_IsUpInt = histA_IsUp ? 1: 0
histA_IsDownInt = histA_IsDown ? 1: 0
histB_IsDownInt = histB_IsDown ? 1: 0
histB_IsUpInt = histB_IsUp ? 1: 0
macd_IsAboveInt = macd_IsAbove ? 1: 0
macd_IsBelowInt = macd_IsBelow ? 1: 0

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
float op_operation = decision_tree_0_ADBE_1Hour_bb8c744d(macd_IsAboveInt, histB_IsDownInt, histA_IsDownInt, histB_IsUpInt, signal, histA_IsUpInt, hist, macd_IsBelowInt, macd)

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


