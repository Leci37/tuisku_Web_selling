//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: MACD_ULT_MTF
// ID_model: EPAM_1Min_1MAC_2b550a1a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_EPAM_1Min_1MAC_2b550a1a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_EPAM_1Min_2b550a1a(macd, macd_IsBelowInt, signal, histB_IsUpInt, macd_IsAboveInt, histB_IsDownInt, histA_IsUpInt, hist, histA_IsDownInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( signal <= 0.891442 )
		if( signal <= 0.264938 )
			if( hist <= -0.22413 )
				if( hist <= -0.561111 )
					if( signal <= -1.55147 )
						if( signal <= -3.82459 )
							ret := -0.777778 // sell
						if( signal > -3.82459 )
							ret := 0.913043 // buy
					if( signal > -1.55147 )
						if( signal <= -0.268175 )
							ret := -0.810811 // sell
						if( signal > -0.268175 )
							ret := 0.142857
				if( hist > -0.561111 )
					if( signal <= -0.07692 )
						if( macd <= -0.592866 )
							ret := 0.333333
						if( macd > -0.592866 )
							ret := 0.684746
					if( signal > -0.07692 )
						if( signal <= 0.092778 )
							ret := -0.321839
						if( signal > 0.092778 )
							ret := 0.375758
			if( hist > -0.22413 )
				if( hist <= 0.062947 )
					if( hist <= -0.203404 )
						if( macd <= -0.810347 )
							ret := 0.666667
						if( macd > -0.810347 )
							ret := -0.472050
					if( hist > -0.203404 )
						if( signal <= 0.262325 )
							ret := 0.023309
						if( signal > 0.262325 )
							ret := 0.621622
				if( hist > 0.062947 )
					if( hist <= 0.201148 )
						if( signal <= -0.666497 )
							ret := -0.434211
						if( signal > -0.666497 )
							ret := -0.076067
					if( hist > 0.201148 )
						if( macd <= -0.927732 )
							ret := 0.491979
						if( macd > -0.927732 )
							ret := 0.112385
		if( signal > 0.264938 )
			if( macd <= 0.708828 )
				if( macd <= 0.151274 )
					if( signal <= 0.266723 )
						ret := -0.818182 // sell
					if( signal > 0.266723 )
						if( hist <= -0.14875 )
							ret := 0.288372
						if( hist > -0.14875 )
							ret := 0.771429 // buy
				if( macd > 0.151274 )
					if( hist <= 0.099256 )
						if( macd <= 0.625972 )
							ret := -0.202688
						if( macd > 0.625972 )
							ret := -0.703226 // sell
					if( hist > 0.099256 )
						if( hist <= 0.171998 )
							ret := 0.248663
						if( hist > 0.171998 )
							ret := -0.152381
			if( macd > 0.708828 )
				if( hist <= 0.099276 )
					if( macd <= 0.801408 )
						if( histB_IsDownInt <= 0.5 )
							ret := 0.377778
						if( histB_IsDownInt > 0.5 )
							ret := -0.600000
					if( macd > 0.801408 )
						if( signal <= 0.856742 )
							ret := -0.875000 // sell
						if( signal > 0.856742 )
							ret := -0.434783
				if( hist > 0.099276 )
					if( hist <= 0.249948 )
						if( hist <= 0.182977 )
							ret := 0.455285
						if( hist > 0.182977 )
							ret := 0.788462 // buy
					if( hist > 0.249948 )
						if( hist <= 0.580378 )
							ret := -0.300000
						if( hist > 0.580378 )
							ret := 1.000000 // buy
	if( signal > 0.891442 )
		if( hist <= -0.071088 )
			if( signal <= 0.927678 )
				if( macd <= 0.745095 )
					ret := -0.066667
				if( macd > 0.745095 )
					if( signal <= 0.914201 )
						ret := 0.809524 // buy
					if( signal > 0.914201 )
						ret := 0.333333
			if( signal > 0.927678 )
				if( hist <= -0.189073 )
					if( hist <= -0.290971 )
						if( signal <= 1.07515 )
							ret := 1.000000 // buy
						if( signal > 1.07515 )
							ret := 0.585366
					if( hist > -0.290971 )
						if( hist <= -0.259604 )
							ret := 0.047619
						if( hist > -0.259604 )
							ret := 0.608108
				if( hist > -0.189073 )
					if( hist <= -0.099474 )
						if( signal <= 1.64074 )
							ret := 0.888889 // buy
						if( signal > 1.64074 )
							ret := 0.588235
					if( hist > -0.099474 )
						ret := 0.526316
		if( hist > -0.071088 )
			if( hist <= 0.011266 )
				if( macd <= 1.32956 )
					if( macd <= 1.24596 )
						if( hist <= -0.052564 )
							ret := -0.090909
						if( hist > -0.052564 )
							ret := -0.600000
					if( macd > 1.24596 )
						ret := 0.500000
				if( macd > 1.32956 )
					ret := -1.000000 // sell
			if( hist > 0.011266 )
				if( macd <= 1.19844 )
					if( macd <= 1.00779 )
						ret := -0.400000
					if( macd > 1.00779 )
						if( signal <= 1.04773 )
							ret := 0.940000 // buy
						if( signal > 1.04773 )
							ret := 0.486486
				if( macd > 1.19844 )
					if( hist <= 0.257417 )
						if( signal <= 1.09858 )
							ret := 0.818182 // buy
						if( signal > 1.09858 )
							ret := -0.442623
					if( hist > 0.257417 )
						if( signal <= 1.08738 )
							ret := 0.294118
						if( signal > 1.08738 )
							ret := 0.809524 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_EPAM_1Min_2b550a1a(macd, macd_IsBelowInt, signal, histB_IsUpInt, macd_IsAboveInt, histB_IsDownInt, histA_IsUpInt, hist, histA_IsDownInt)

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


