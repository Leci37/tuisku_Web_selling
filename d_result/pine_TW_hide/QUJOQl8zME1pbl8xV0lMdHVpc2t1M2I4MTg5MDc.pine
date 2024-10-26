//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Williams_Vix_Fix
// ID_model: ABNB_30Min_1WIL_3b818907 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ABNB_30Min_1WIL_3b818907", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ABNB_30Min_3b818907(rangeHigh, rangeLow, midLine, sDev, lowerBand, wvf, Color_con1, colInt, Color_con2, upperBand)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( sDev <= 2.23622 )
		if( lowerBand <= -0.812825 )
			if( upperBand <= 2.53611 )
				if( wvf <= 3.43565 )
					if( upperBand <= 2.3654 )
						if( midLine <= 0.634296 )
							ret := 0.775000 // buy
						if( midLine > 0.634296 )
							ret := 0.000000
					if( upperBand > 2.3654 )
						if( sDev <= 1.73187 )
							ret := 0.850746 // buy
						if( sDev > 1.73187 )
							ret := 0.111111
				if( wvf > 3.43565 )
					ret := -0.363636
			if( upperBand > 2.53611 )
				if( Color_con2 <= 1.22335 )
					if( wvf <= 0.907761 )
						if( Color_con2 <= -3.23164 )
							ret := 0.659574
						if( Color_con2 > -3.23164 )
							ret := 0.226950
					if( wvf > 0.907761 )
						if( wvf <= 2.23906 )
							ret := -0.457944
						if( wvf > 2.23906 )
							ret := 0.149123
				if( Color_con2 > 1.22335 )
					if( lowerBand <= -1.04384 )
						if( midLine <= 0.934803 )
							ret := 0.583333
						if( midLine > 0.934803 )
							ret := -0.090909
					if( lowerBand > -1.04384 )
						if( Color_con1 <= 0.91286 )
							ret := 0.976190 // buy
						if( Color_con1 > 0.91286 )
							ret := 0.562500
		if( lowerBand > -0.812825 )
			if( upperBand <= 5.78533 )
				if( upperBand <= 5.21375 )
					if( sDev <= 2.10121 )
						if( lowerBand <= 1.82115 )
							ret := -0.020642
						if( lowerBand > 1.82115 )
							ret := -0.208731
					if( sDev > 2.10121 )
						if( Color_con1 <= -2.34888 )
							ret := -0.128713
						if( Color_con1 > -2.34888 )
							ret := -0.401496
				if( upperBand > 5.21375 )
					if( Color_con1 <= -0.919191 )
						if( sDev <= 2.17706 )
							ret := 0.189911
						if( sDev > 2.17706 )
							ret := 0.724638 // buy
					if( Color_con1 > -0.919191 )
						if( Color_con2 <= 0.686083 )
							ret := 0.972222 // buy
						if( Color_con2 > 0.686083 )
							ret := 0.565217
			if( upperBand > 5.78533 )
				if( sDev <= 1.87063 )
					if( lowerBand <= 4.26365 )
						if( Color_con2 <= -2.09214 )
							ret := -0.421053
						if( Color_con2 > -2.09214 )
							ret := 0.106742
					if( lowerBand > 4.26365 )
						if( Color_con1 <= -1.71208 )
							ret := 0.744186 // buy
						if( Color_con1 > -1.71208 )
							ret := 0.160000
				if( sDev > 1.87063 )
					if( midLine <= 7.13697 )
						if( lowerBand <= 4.75898 )
							ret := -0.460916
						if( lowerBand > 4.75898 )
							ret := -0.942857 // sell
					if( midLine > 7.13697 )
						if( midLine <= 8.0382 )
							ret := 0.666667
						if( midLine > 8.0382 )
							ret := -0.400000
	if( sDev > 2.23622 )
		if( midLine <= 5.74343 )
			if( wvf <= 11.9377 )
				if( upperBand <= 9.35855 )
					if( upperBand <= 5.9423 )
						if( Color_con2 <= 3.41057 )
							ret := 0.127003
						if( Color_con2 > 3.41057 )
							ret := 0.865672 // buy
					if( upperBand > 5.9423 )
						if( midLine <= 2.05247 )
							ret := 0.520000
						if( midLine > 2.05247 )
							ret := -0.019033
				if( upperBand > 9.35855 )
					if( wvf <= 2.34079 )
						if( upperBand <= 11.169 )
							ret := 0.134146
						if( upperBand > 11.169 )
							ret := -0.555556
					if( wvf > 2.34079 )
						if( wvf <= 4.21911 )
							ret := 0.755102 // buy
						if( wvf > 4.21911 )
							ret := 0.263393
			if( wvf > 11.9377 )
				ret := -1.000000 // sell
		if( midLine > 5.74343 )
			if( midLine <= 5.96345 )
				if( Color_con2 <= -0.86967 )
					if( Color_con2 <= -3.19601 )
						if( Color_con2 <= -4.72215 )
							ret := -0.727273 // sell
						if( Color_con2 > -4.72215 )
							ret := 0.500000
					if( Color_con2 > -3.19601 )
						if( midLine <= 5.9577 )
							ret := -0.967742 // sell
						if( midLine > 5.9577 )
							ret := -0.666667
				if( Color_con2 > -0.86967 )
					if( upperBand <= 10.6077 )
						if( upperBand <= 8.42861 )
							ret := -0.846154 // sell
						if( upperBand > 8.42861 )
							ret := 0.640000
					if( upperBand > 10.6077 )
						ret := -0.812500 // sell
			if( midLine > 5.96345 )
				if( upperBand <= 9.87667 )
					if( lowerBand <= 4.13339 )
						if( midLine <= 6.18529 )
							ret := 0.244444
						if( midLine > 6.18529 )
							ret := 0.788462 // buy
					if( lowerBand > 4.13339 )
						if( wvf <= 7.44459 )
							ret := -0.636364
						if( wvf > 7.44459 )
							ret := 0.000000
				if( upperBand > 9.87667 )
					if( wvf <= 1.87922 )
						if( Color_con2 <= -8.01944 )
							ret := -0.281553
						if( Color_con2 > -8.01944 )
							ret := -0.820000 // sell
					if( wvf > 1.87922 )
						if( Color_con2 <= -3.17568 )
							ret := 0.202381
						if( Color_con2 > -3.17568 )
							ret := -0.197425
	
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
float op_operation = decision_tree_0_ABNB_30Min_3b818907(rangeHigh, rangeLow, midLine, sDev, lowerBand, wvf, Color_con1, colInt, Color_con2, upperBand)

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


