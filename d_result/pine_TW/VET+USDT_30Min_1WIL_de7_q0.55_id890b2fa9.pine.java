//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Williams_Vix_Fix
// ID_model: VETUSDT_30Min_1WIL_890b2fa9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_VETUSDT_30Min_1WIL_890b2fa9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_VETUSDT_30Min_890b2fa9(wvf, sDev, upperBand, Color_con2, colInt, rangeHigh, Color_con1, lowerBand, midLine, rangeLow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( Color_con2 <= 7.40362 )
		if( wvf <= 4.74546 )
			if( lowerBand <= 1.99706 )
				if( midLine <= 6.77155 )
					if( Color_con2 <= -11.7339 )
						if( Color_con1 <= -12.4859 )
							if( lowerBand <= -3.92507 )
								ret := -0.166667
							if( lowerBand > -3.92507 )
								ret := 0.885714 // buy
						if( Color_con1 > -12.4859 )
							if( sDev <= 5.15998 )
								ret := -0.638298
							if( sDev > 5.15998 )
								ret := -0.272277
					if( Color_con2 > -11.7339 )
						if( lowerBand <= -1.42845 )
							if( wvf <= 1.10814 )
								ret := -0.383298
							if( wvf > 1.10814 )
								ret := -0.029586
						if( lowerBand > -1.42845 )
							if( midLine <= 3.91549 )
								ret := -0.017785
							if( midLine > 3.91549 )
								ret := 0.045486
				if( midLine > 6.77155 )
					if( sDev <= 10.8436 )
						if( Color_con2 <= -10.5204 )
							if( midLine <= 9.41936 )
								ret := 0.823009 // buy
							if( midLine > 9.41936 )
								ret := 0.219512
						if( Color_con2 > -10.5204 )
							if( Color_con1 <= -15.5093 )
								ret := 0.673469
							if( Color_con1 > -15.5093 )
								ret := -0.109170
					if( sDev > 10.8436 )
						if( upperBand <= 22.7212 )
							if( upperBand <= 19.3154 )
								ret := 0.714286 // buy
							if( upperBand > 19.3154 )
								ret := -0.328244
						if( upperBand > 22.7212 )
							if( upperBand <= 28.3098 )
								ret := 0.617021
							if( upperBand > 28.3098 )
								ret := -0.250000
			if( lowerBand > 1.99706 )
				if( wvf <= 3.84685 )
					if( wvf <= 3.3772 )
						if( Color_con1 <= -12.3809 )
							if( Color_con1 <= -18.5901 )
								ret := -0.500000
							if( Color_con1 > -18.5901 )
								ret := 0.676471
						if( Color_con1 > -12.3809 )
							if( upperBand <= 3.33683 )
								ret := 1.000000 // buy
							if( upperBand > 3.33683 )
								ret := -0.125698
					if( wvf > 3.3772 )
						if( sDev <= 1.1068 )
							if( Color_con1 <= -1.22071 )
								ret := -0.789474 // sell
							if( Color_con1 > -1.22071 )
								ret := 0.030303
						if( sDev > 1.1068 )
							if( sDev <= 1.75619 )
								ret := 0.408333
							if( sDev > 1.75619 )
								ret := -0.007331
				if( wvf > 3.84685 )
					if( midLine <= 4.68247 )
						if( upperBand <= 6.10546 )
							if( Color_con1 <= -1.67976 )
								ret := 0.490909
							if( Color_con1 > -1.67976 )
								ret := -0.260355
						if( upperBand > 6.10546 )
							if( colInt <= 0.5 )
								ret := -0.609442
							if( colInt > 0.5 )
								ret := 0.714286 // buy
					if( midLine > 4.68247 )
						if( upperBand <= 7.02809 )
							if( lowerBand <= 2.80538 )
								ret := -0.100000
							if( lowerBand > 2.80538 )
								ret := 0.611111
						if( upperBand > 7.02809 )
							if( Color_con1 <= -2.95796 )
								ret := -0.223084
							if( Color_con1 > -2.95796 )
								ret := 0.172840
		if( wvf > 4.74546 )
			if( lowerBand <= 5.05581 )
				if( Color_con1 <= -2.70772 )
					if( Color_con2 <= -11.0541 )
						if( upperBand <= 38.3408 )
							if( lowerBand <= 1.36737 )
								ret := 0.300752
							if( lowerBand > 1.36737 )
								ret := 0.756098 // buy
						if( upperBand > 38.3408 )
							ret := -1.000000 // sell
					if( Color_con2 > -11.0541 )
						if( wvf <= 16.1013 )
							if( Color_con1 <= -18.782 )
								ret := -0.954545 // sell
							if( Color_con1 > -18.782 )
								ret := -0.089155
						if( wvf > 16.1013 )
							if( midLine <= 26.6421 )
								ret := -0.587983
							if( midLine > 26.6421 )
								ret := 1.000000 // buy
				if( Color_con1 > -2.70772 )
					if( sDev <= 2.5046 )
						if( Color_con2 <= -4.64327 )
							if( midLine <= 4.20927 )
								ret := 0.500000
							if( midLine > 4.20927 )
								ret := -0.928571 // sell
						if( Color_con2 > -4.64327 )
							if( wvf <= 6.6821 )
								ret := 0.242752
							if( wvf > 6.6821 )
								ret := 0.646018
					if( sDev > 2.5046 )
						if( midLine <= 4.6856 )
							if( Color_con1 <= -0.705837 )
								ret := -0.010095
							if( Color_con1 > -0.705837 )
								ret := 0.133580
						if( midLine > 4.6856 )
							if( midLine <= 9.39917 )
								ret := 0.186061
							if( midLine > 9.39917 )
								ret := 0.603774
			if( lowerBand > 5.05581 )
				if( wvf <= 14.828 )
					if( sDev <= 6.56064 )
						if( upperBand <= 17.5176 )
							if( lowerBand <= 7.03667 )
								ret := 0.282369
							if( lowerBand > 7.03667 )
								ret := -0.109375
						if( upperBand > 17.5176 )
							if( wvf <= 13.1707 )
								ret := 0.753425 // buy
							if( wvf > 13.1707 )
								ret := 0.055556
					if( sDev > 6.56064 )
						if( upperBand <= 31.2783 )
							if( Color_con2 <= -4.24134 )
								ret := -0.606250
							if( Color_con2 > -4.24134 )
								ret := 0.145161
						if( upperBand > 31.2783 )
							if( wvf <= 8.36267 )
								ret := 0.142857
							if( wvf > 8.36267 )
								ret := 1.000000 // buy
				if( wvf > 14.828 )
					if( upperBand <= 31.0645 )
						if( lowerBand <= 8.96571 )
							if( Color_con2 <= 5.68919 )
								ret := 0.823944 // buy
							if( Color_con2 > 5.68919 )
								ret := 0.200000
						if( lowerBand > 8.96571 )
							if( sDev <= 8.03304 )
								ret := 0.727273 // buy
							if( sDev > 8.03304 )
								ret := -0.615385
					if( upperBand > 31.0645 )
						if( Color_con1 <= -17.1548 )
							if( Color_con1 <= -20.4203 )
								ret := 1.000000 // buy
							if( Color_con1 > -20.4203 )
								ret := -0.500000
						if( Color_con1 > -17.1548 )
							if( Color_con2 <= 0.240366 )
								ret := 1.000000 // buy
							if( Color_con2 > 0.240366 )
								ret := 0.750000 // buy
	if( Color_con2 > 7.40362 )
		if( Color_con1 <= -1.32818 )
			if( Color_con2 <= 10.2867 )
				if( Color_con1 <= -1.38433 )
					if( Color_con1 <= -5.34243 )
						if( lowerBand <= -2.13263 )
							ret := 0.428571
						if( lowerBand > -2.13263 )
							ret := -1.000000 // sell
					if( Color_con1 > -5.34243 )
						if( upperBand <= 19.7738 )
							if( Color_con1 <= -1.7059 )
								ret := 0.904762 // buy
							if( Color_con1 > -1.7059 )
								ret := 0.500000
						if( upperBand > 19.7738 )
							if( sDev <= 13.301 )
								ret := -0.647059
							if( sDev > 13.301 )
								ret := 0.555556
				if( Color_con1 > -1.38433 )
					ret := -0.750000 // sell
			if( Color_con2 > 10.2867 )
				if( upperBand <= 29.696 )
					if( wvf <= 18.1328 )
						ret := 1.000000 // buy
					if( wvf > 18.1328 )
						ret := 0.500000
				if( upperBand > 29.696 )
					ret := 1.000000 // buy
		if( Color_con1 > -1.32818 )
			if( midLine <= 6.05312 )
				if( midLine <= 4.508 )
					if( sDev <= 9.17066 )
						if( Color_con1 <= 1.97382 )
							if( Color_con1 <= 1.6759 )
								ret := 0.714286 // buy
							if( Color_con1 > 1.6759 )
								ret := 0.250000
						if( Color_con1 > 1.97382 )
							if( Color_con1 <= 4.93479 )
								ret := 0.851852 // buy
							if( Color_con1 > 4.93479 )
								ret := 1.000000 // buy
					if( sDev > 9.17066 )
						ret := 0.000000
				if( midLine > 4.508 )
					if( upperBand <= 13.7292 )
						if( wvf <= 12.6544 )
							ret := 0.333333
						if( wvf > 12.6544 )
							if( upperBand <= 11.6262 )
								ret := -0.800000 // sell
							if( upperBand > 11.6262 )
								ret := -0.333333
					if( upperBand > 13.7292 )
						if( wvf <= 20.757 )
							ret := 1.000000 // buy
						if( wvf > 20.757 )
							ret := 0.000000
			if( midLine > 6.05312 )
				if( sDev <= 6.10509 )
					ret := -0.500000
				if( sDev > 6.10509 )
					if( upperBand <= 18.5123 )
						if( lowerBand <= -4.79732 )
							ret := 0.750000 // buy
						if( lowerBand > -4.79732 )
							if( Color_con1 <= 5.32649 )
								ret := 1.000000 // buy
							if( Color_con1 > 5.32649 )
								ret := 0.888889 // buy
					if( upperBand > 18.5123 )
						if( upperBand <= 24.419 )
							if( lowerBand <= -1.58705 )
								ret := 0.764706 // buy
							if( lowerBand > -1.58705 )
								ret := 0.230769
						if( upperBand > 24.419 )
							if( sDev <= 14.3511 )
								ret := 0.928571 // buy
							if( sDev > 14.3511 )
								ret := 1.000000 // buy
	
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
float op_operation = decision_tree_0_VETUSDT_30Min_890b2fa9(wvf, sDev, upperBand, Color_con2, colInt, rangeHigh, Color_con1, lowerBand, midLine, rangeLow)

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


