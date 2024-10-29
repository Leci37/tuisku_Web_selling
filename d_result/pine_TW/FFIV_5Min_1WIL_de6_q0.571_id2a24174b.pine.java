//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Williams_Vix_Fix
// ID_model: FFIV_5Min_1WIL_2a24174b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_FFIV_5Min_1WIL_2a24174b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_FFIV_5Min_2a24174b(sDev, Color_con1, lowerBand, wvf, upperBand, midLine, Color_con2, rangeLow, colInt, rangeHigh)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( sDev <= 0.635342 )
		if( lowerBand <= 0.036921 )
			if( Color_con2 <= -2.62922 )
				if( midLine <= 0.280906 )
					if( lowerBand <= 0.002595 )
						ret := 0.000000
					if( lowerBand > 0.002595 )
						ret := -0.615385
				if( midLine > 0.280906 )
					if( wvf <= 0.864952 )
						if( Color_con2 <= -3.54936 )
							ret := -1.000000 // sell
						if( Color_con2 > -3.54936 )
							ret := -0.666667
					if( wvf > 0.864952 )
						ret := -0.615385
			if( Color_con2 > -2.62922 )
				if( Color_con2 <= -0.547706 )
					if( wvf <= 0.856348 )
						if( upperBand <= 1.0257 )
							ret := 0.049259
						if( upperBand > 1.0257 )
							ret := 0.308540
					if( wvf > 0.856348 )
						if( midLine <= 0.483203 )
							ret := -0.277778
						if( midLine > 0.483203 )
							ret := -0.979592 // sell
				if( Color_con2 > -0.547706 )
					if( Color_con1 <= -0.420444 )
						if( midLine <= 0.216506 )
							ret := -0.423729
						if( midLine > 0.216506 )
							ret := -0.096245
					if( Color_con1 > -0.420444 )
						if( midLine <= 0.339078 )
							ret := -0.030123
						if( midLine > 0.339078 )
							ret := 0.095386
		if( lowerBand > 0.036921 )
			if( Color_con2 <= -0.187623 )
				if( Color_con2 <= -3.18981 )
					if( Color_con1 <= -0.820505 )
						ret := 0.142857
					if( Color_con1 > -0.820505 )
						if( upperBand <= 1.29189 )
							ret := 0.806452 // buy
						if( upperBand > 1.29189 )
							ret := 1.000000 // buy
				if( Color_con2 > -3.18981 )
					if( wvf <= 0.496359 )
						if( Color_con2 <= -1.57045 )
							ret := -0.425373
						if( Color_con2 > -1.57045 )
							ret := 0.055802
					if( wvf > 0.496359 )
						if( wvf <= 0.976252 )
							ret := -0.177650
						if( wvf > 0.976252 )
							ret := 0.354680
			if( Color_con2 > -0.187623 )
				if( midLine <= 0.279892 )
					if( Color_con2 <= 0.102535 )
						if( Color_con2 <= 0.038643 )
							ret := -0.150000
						if( Color_con2 > 0.038643 )
							ret := -0.596491
					if( Color_con2 > 0.102535 )
						if( wvf <= 0.435469 )
							ret := 0.772727 // buy
						if( wvf > 0.435469 )
							ret := -0.178571
				if( midLine > 0.279892 )
					if( wvf <= 1.24208 )
						if( Color_con1 <= -0.521874 )
							ret := 0.586466
						if( Color_con1 > -0.521874 )
							ret := 0.146592
					if( wvf > 1.24208 )
						if( wvf <= 1.92423 )
							ret := 0.642105
						if( wvf > 1.92423 )
							ret := -0.733333 // sell
	if( sDev > 0.635342 )
		if( wvf <= 1.06378 )
			if( Color_con2 <= -0.801246 )
				if( upperBand <= 1.60471 )
					if( midLine <= 0.392536 )
						if( Color_con2 <= -1.54316 )
							ret := -0.037037
						if( Color_con2 > -1.54316 )
							ret := -0.420000
					if( midLine > 0.392536 )
						if( sDev <= 0.834378 )
							ret := 0.133100
						if( sDev > 0.834378 )
							ret := 0.640394
				if( upperBand > 1.60471 )
					if( Color_con2 <= -9.56903 )
						if( wvf <= 0.654741 )
							ret := -1.000000 // sell
						if( wvf > 0.654741 )
							ret := -0.375000
					if( Color_con2 > -9.56903 )
						if( sDev <= 2.74433 )
							ret := -0.134438
						if( sDev > 2.74433 )
							ret := 0.555556
			if( Color_con2 > -0.801246 )
				if( Color_con1 <= -0.462626 )
					if( midLine <= 0.569865 )
						if( midLine <= 0.367732 )
							ret := -0.657143
						if( midLine > 0.367732 )
							ret := -0.097826
					if( midLine > 0.569865 )
						if( Color_con2 <= -0.220245 )
							ret := -0.512352
						if( Color_con2 > -0.220245 )
							ret := -0.266881
				if( Color_con1 > -0.462626 )
					if( sDev <= 0.644492 )
						if( Color_con1 <= -0.369609 )
							ret := -0.052632
						if( Color_con1 > -0.369609 )
							ret := -0.857143 // sell
					if( sDev > 0.644492 )
						if( lowerBand <= -0.195445 )
							ret := -0.140187
						if( lowerBand > -0.195445 )
							ret := 0.251534
		if( wvf > 1.06378 )
			if( colInt <= 0.5 )
				if( lowerBand <= -0.158733 )
					if( sDev <= 2.90364 )
						if( wvf <= 1.70787 )
							ret := 0.648649
						if( wvf > 1.70787 )
							ret := -0.823529 // sell
					if( sDev > 2.90364 )
						if( wvf <= 1.8494 )
							ret := 0.562500
						if( wvf > 1.8494 )
							ret := 0.975000 // buy
				if( lowerBand > -0.158733 )
					if( wvf <= 1.64261 )
						if( Color_con1 <= -1.87782 )
							ret := -0.355932
						if( Color_con1 > -1.87782 )
							ret := 0.360845
					if( wvf > 1.64261 )
						if( lowerBand <= 0.065245 )
							ret := -0.895833 // sell
						if( lowerBand > 0.065245 )
							ret := 0.006969
			if( colInt > 0.5 )
				if( lowerBand <= -0.442395 )
					if( upperBand <= 4.68511 )
						if( upperBand <= 2.74957 )
							ret := 0.053743
						if( upperBand > 2.74957 )
							ret := 0.394040
					if( upperBand > 4.68511 )
						if( lowerBand <= -1.37027 )
							ret := -0.569106
						if( lowerBand > -1.37027 )
							ret := 0.666667
				if( lowerBand > -0.442395 )
					if( lowerBand <= -0.210814 )
						if( midLine <= 0.45743 )
							ret := 0.030075
						if( midLine > 0.45743 )
							ret := -0.437186
					if( lowerBand > -0.210814 )
						if( wvf <= 1.35269 )
							ret := 0.206030
						if( wvf > 1.35269 )
							ret := -0.147368
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_FFIV_5Min_2a24174b(sDev, Color_con1, lowerBand, wvf, upperBand, midLine, Color_con2, rangeLow, colInt, rangeHigh)

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


