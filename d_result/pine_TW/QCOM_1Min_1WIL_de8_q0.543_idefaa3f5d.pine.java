//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Williams_Vix_Fix
// ID_model: QCOM_1Min_1WIL_efaa3f5d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_QCOM_1Min_1WIL_efaa3f5d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_QCOM_1Min_efaa3f5d(rangeLow, wvf, Color_con1, midLine, sDev, colInt, upperBand, rangeHigh, lowerBand, Color_con2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( Color_con1 <= -0.858168 )
		if( lowerBand <= -1.97789 )
			if( upperBand <= 5.42001 )
				if( upperBand <= 4.97777 )
					if( Color_con2 <= -2.118 )
						if( lowerBand <= -1.98667 )
							ret := -0.750000 // sell
						if( lowerBand > -1.98667 )
							ret := -0.875000 // sell
					if( Color_con2 > -2.118 )
						ret := -1.000000 // sell
				if( upperBand > 4.97777 )
					if( midLine <= 1.41221 )
						ret := -1.000000 // sell
					if( midLine > 1.41221 )
						ret := -0.647059
			if( upperBand > 5.42001 )
				ret := 1.000000 // buy
		if( lowerBand > -1.97789 )
			if( Color_con2 <= -2.02133 )
				if( Color_con1 <= -2.781 )
					if( midLine <= 1.00271 )
						if( upperBand <= 3.45281 )
							ret := 0.937500 // buy
						if( upperBand > 3.45281 )
							ret := 0.555556
					if( midLine > 1.00271 )
						if( Color_con2 <= -2.30336 )
							if( sDev <= 2.6772 )
								if( lowerBand <= -0.745125 )
									ret := -1.000000 // sell
								if( lowerBand > -0.745125 )
									ret := -0.814815 // sell
							if( sDev > 2.6772 )
								if( midLine <= 4.53464 )
									ret := 0.151515
								if( midLine > 4.53464 )
									ret := -0.333333
						if( Color_con2 > -2.30336 )
							if( lowerBand <= -0.446669 )
								ret := 0.833333 // buy
							if( lowerBand > -0.446669 )
								ret := 0.040000
				if( Color_con1 > -2.781 )
					if( midLine <= 0.970101 )
						if( sDev <= 0.902897 )
							if( sDev <= 0.647641 )
								if( midLine <= 0.513477 )
									ret := -0.900000 // sell
								if( midLine > 0.513477 )
									ret := -1.000000 // sell
							if( sDev > 0.647641 )
								if( upperBand <= 1.41126 )
									ret := 0.333333
								if( upperBand > 1.41126 )
									ret := -0.500000
						if( sDev > 0.902897 )
							if( midLine <= 0.758617 )
								if( wvf <= 0.084627 )
									ret := -1.000000 // sell
								if( wvf > 0.084627 )
									ret := -0.777778 // sell
							if( midLine > 0.758617 )
								ret := -1.000000 // sell
					if( midLine > 0.970101 )
						if( Color_con2 <= -3.20174 )
							if( wvf <= 0.665542 )
								ret := -0.272727
							if( wvf > 0.665542 )
								ret := 0.700000 // buy
						if( Color_con2 > -3.20174 )
							if( wvf <= 0.538342 )
								ret := -0.461538
							if( wvf > 0.538342 )
								ret := -0.937500 // sell
			if( Color_con2 > -2.02133 )
				if( upperBand <= 1.43318 )
					if( wvf <= 0.014063 )
						if( sDev <= 0.402608 )
							ret := 0.615385
						if( sDev > 0.402608 )
							if( Color_con2 <= -1.15465 )
								if( Color_con2 <= -1.37347 )
									ret := 0.230769
								if( Color_con2 > -1.37347 )
									ret := 1.000000 // buy
							if( Color_con2 > -1.15465 )
								if( Color_con2 <= -0.667581 )
									ret := -0.619048
								if( Color_con2 > -0.667581 )
									ret := -0.128205
					if( wvf > 0.014063 )
						if( midLine <= 0.332104 )
							if( wvf <= 0.106117 )
								if( Color_con1 <= -0.889933 )
									ret := 0.140000
								if( Color_con1 > -0.889933 )
									ret := -0.714286 // sell
							if( wvf > 0.106117 )
								if( Color_con2 <= -0.242869 )
									ret := 0.333333
								if( Color_con2 > -0.242869 )
									ret := 0.807692 // buy
						if( midLine > 0.332104 )
							if( Color_con2 <= -1.62898 )
								if( wvf <= 0.063709 )
									ret := 0.076923
								if( wvf > 0.063709 )
									ret := 0.753846 // buy
							if( Color_con2 > -1.62898 )
								if( upperBand <= 1.36619 )
									ret := -0.050943
								if( upperBand > 1.36619 )
									ret := 0.150558
				if( upperBand > 1.43318 )
					if( Color_con1 <= -1.9535 )
						if( midLine <= 4.45711 )
							if( Color_con1 <= -2.40528 )
								if( sDev <= 3.3378 )
									ret := 0.068536
								if( sDev > 3.3378 )
									ret := 0.692308
							if( Color_con1 > -2.40528 )
								if( upperBand <= 3.77237 )
									ret := -0.069272
								if( upperBand > 3.77237 )
									ret := 0.328358
						if( midLine > 4.45711 )
							ret := -1.000000 // sell
					if( Color_con1 > -1.9535 )
						if( sDev <= 1.4487 )
							if( sDev <= 1.27973 )
								if( midLine <= 0.551886 )
									ret := 0.462963
								if( midLine > 0.551886 )
									ret := -0.173052
							if( sDev > 1.27973 )
								if( Color_con1 <= -1.87113 )
									ret := -0.680000
								if( Color_con1 > -1.87113 )
									ret := 0.568421
						if( sDev > 1.4487 )
							if( Color_con1 <= -0.939658 )
								if( wvf <= 2.40844 )
									ret := -0.720000 // sell
								if( wvf > 2.40844 )
									ret := -0.275862
							if( Color_con1 > -0.939658 )
								if( midLine <= 1.38711 )
									ret := 0.555556
								if( midLine > 1.38711 )
									ret := -0.400000
	if( Color_con1 > -0.858168 )
		if( upperBand <= 2.57569 )
			if( lowerBand <= -0.251938 )
				if( midLine <= 0.239554 )
					if( Color_con1 <= 0.297825 )
						if( Color_con1 <= -0.699324 )
							if( Color_con2 <= -0.616295 )
								ret := -0.083333
							if( Color_con2 > -0.616295 )
								if( midLine <= 0.231457 )
									ret := -0.727273 // sell
								if( midLine > 0.231457 )
									ret := -1.000000 // sell
						if( Color_con1 > -0.699324 )
							if( lowerBand <= -0.457353 )
								if( lowerBand <= -0.471425 )
									ret := 0.250000
								if( lowerBand > -0.471425 )
									ret := 0.916667 // buy
							if( lowerBand > -0.457353 )
								if( upperBand <= 0.592639 )
									ret := -0.555556
								if( upperBand > 0.592639 )
									ret := 0.025641
					if( Color_con1 > 0.297825 )
						if( sDev <= 0.611054 )
							if( upperBand <= 0.725577 )
								if( Color_con1 <= 0.468322 )
									ret := 1.000000 // buy
								if( Color_con1 > 0.468322 )
									ret := 0.636364
							if( upperBand > 0.725577 )
								if( Color_con1 <= 0.46669 )
									ret := -0.294118
								if( Color_con1 > 0.46669 )
									ret := 0.230769
						if( sDev > 0.611054 )
							ret := 1.000000 // buy
				if( midLine > 0.239554 )
					if( midLine <= 0.315276 )
						if( wvf <= 0.099015 )
							if( wvf <= 0.034597 )
								if( lowerBand <= -0.299662 )
									ret := -0.428571
								if( lowerBand > -0.299662 )
									ret := -0.750000 // sell
							if( wvf > 0.034597 )
								ret := 0.000000
						if( wvf > 0.099015 )
							if( Color_con2 <= -1.05475 )
								if( wvf <= 0.210913 )
									ret := 0.090909
								if( wvf > 0.210913 )
									ret := -1.000000 // sell
							if( Color_con2 > -1.05475 )
								if( lowerBand <= -0.356891 )
									ret := 0.104712
								if( lowerBand > -0.356891 )
									ret := 0.685879
					if( midLine > 0.315276 )
						if( Color_con2 <= 1.31221 )
							if( Color_con1 <= -0.609227 )
								if( upperBand <= 1.14003 )
									ret := 0.000000
								if( upperBand > 1.14003 )
									ret := 0.608939
							if( Color_con1 > -0.609227 )
								if( lowerBand <= -0.809109 )
									ret := 0.975000 // buy
								if( lowerBand > -0.809109 )
									ret := 0.007488
						if( Color_con2 > 1.31221 )
							if( wvf <= 2.40719 )
								if( lowerBand <= -0.796259 )
									ret := -1.000000 // sell
								if( lowerBand > -0.796259 )
									ret := -0.538462
							if( wvf > 2.40719 )
								ret := 0.538462
			if( lowerBand > -0.251938 )
				if( lowerBand <= 0.655711 )
					if( colInt <= 0.5 )
						if( lowerBand <= 0.398307 )
							if( midLine <= 1.04678 )
								if( upperBand <= 1.92845 )
									ret := 0.004813
								if( upperBand > 1.92845 )
									ret := -0.950000 // sell
							if( midLine > 1.04678 )
								if( Color_con2 <= -0.024158 )
									ret := 0.686747
								if( Color_con2 > -0.024158 )
									ret := -0.833333 // sell
						if( lowerBand > 0.398307 )
							if( upperBand <= 0.864645 )
								if( Color_con1 <= -0.18377 )
									ret := 0.437500
								if( Color_con1 > -0.18377 )
									ret := -0.266667
							if( upperBand > 0.864645 )
								if( Color_con1 <= -0.727722 )
									ret := 0.056522
								if( Color_con1 > -0.727722 )
									ret := -0.233354
					if( colInt > 0.5 )
						if( Color_con2 <= -0.963924 )
							if( wvf <= 0.66203 )
								if( midLine <= 0.214567 )
									ret := -0.892857 // sell
								if( midLine > 0.214567 )
									ret := -1.000000 // sell
							if( wvf > 0.66203 )
								if( Color_con1 <= 0.047816 )
									ret := -0.066667
								if( Color_con1 > 0.047816 )
									ret := -0.833333 // sell
						if( Color_con2 > -0.963924 )
							if( lowerBand <= -0.017178 )
								if( upperBand <= 2.234 )
									ret := 0.062479
								if( upperBand > 2.234 )
									ret := -0.619718
							if( lowerBand > -0.017178 )
								if( sDev <= 1.02986 )
									ret := -0.027640
								if( sDev > 1.02986 )
									ret := 0.491525
				if( lowerBand > 0.655711 )
					if( upperBand <= 2.16111 )
						if( wvf <= 1.77971 )
							if( colInt <= 0.5 )
								if( upperBand <= 1.25231 )
									ret := -0.406977
								if( upperBand > 1.25231 )
									ret := 0.326400
							if( colInt > 0.5 )
								if( lowerBand <= 0.786717 )
									ret := 0.195652
								if( lowerBand > 0.786717 )
									ret := -0.323944
						if( wvf > 1.77971 )
							ret := 1.000000 // buy
					if( upperBand > 2.16111 )
						if( lowerBand <= 1.25931 )
							if( Color_con2 <= -0.210535 )
								if( upperBand <= 2.27458 )
									ret := -1.000000 // sell
								if( upperBand > 2.27458 )
									ret := -0.900000 // sell
							if( Color_con2 > -0.210535 )
								if( midLine <= 1.53188 )
									ret := 1.000000 // buy
								if( midLine > 1.53188 )
									ret := -0.489796
						if( lowerBand > 1.25931 )
							if( sDev <= 0.465272 )
								ret := 0.272727
							if( sDev > 0.465272 )
								if( wvf <= 1.7455 )
									ret := 1.000000 // buy
								if( wvf > 1.7455 )
									ret := 0.500000
		if( upperBand > 2.57569 )
			if( Color_con2 <= 0.79556 )
				if( sDev <= 0.894633 )
					if( upperBand <= 2.64651 )
						ret := 0.545455
					if( upperBand > 2.64651 )
						if( wvf <= 2.21695 )
							ret := 0.923077 // buy
						if( wvf > 2.21695 )
							if( Color_con2 <= -0.122601 )
								if( Color_con2 <= -0.223839 )
									ret := 0.818182 // buy
								if( Color_con2 > -0.223839 )
									ret := 0.923077 // buy
							if( Color_con2 > -0.122601 )
								ret := 0.625000
				if( sDev > 0.894633 )
					if( sDev <= 1.44832 )
						if( upperBand <= 2.64383 )
							if( sDev <= 1.30977 )
								ret := 0.888889 // buy
							if( sDev > 1.30977 )
								ret := -0.166667
						if( upperBand > 2.64383 )
							if( lowerBand <= 0.171217 )
								if( Color_con2 <= 0.494669 )
									ret := -0.545455
								if( Color_con2 > 0.494669 )
									ret := -1.000000 // sell
							if( lowerBand > 0.171217 )
								if( lowerBand <= 0.743348 )
									ret := 0.163265
								if( lowerBand > 0.743348 )
									ret := -0.625000
					if( sDev > 1.44832 )
						if( midLine <= 1.20637 )
							ret := 0.055556
						if( midLine > 1.20637 )
							if( Color_con1 <= -0.789761 )
								ret := 0.333333
							if( Color_con1 > -0.789761 )
								ret := 1.000000 // buy
			if( Color_con2 > 0.79556 )
				if( wvf <= 4.08765 )
					if( wvf <= 2.99715 )
						if( sDev <= 1.20538 )
							ret := -0.111111
						if( sDev > 1.20538 )
							if( Color_con1 <= -0.426823 )
								if( midLine <= 1.02109 )
									ret := 0.500000
								if( midLine > 1.02109 )
									ret := 1.000000 // buy
							if( Color_con1 > -0.426823 )
								ret := 1.000000 // buy
					if( wvf > 2.99715 )
						ret := 1.000000 // buy
				if( wvf > 4.08765 )
					if( wvf <= 6.32825 )
						if( lowerBand <= -1.88365 )
							ret := -0.941176 // sell
						if( lowerBand > -1.88365 )
							ret := -0.200000
					if( wvf > 6.32825 )
						ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_QCOM_1Min_efaa3f5d(rangeLow, wvf, Color_con1, midLine, sDev, colInt, upperBand, rangeHigh, lowerBand, Color_con2)

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


