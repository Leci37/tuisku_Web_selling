//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: TRXUSDT_30Min_1SQU_ae23b483 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_30Min_1SQU_ae23b483", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_30Min_ae23b483(avgHighLow, priceRange, upperBB, upperKC, sqzOffInt, dev, ma, sqzOnInt, lowerBB, rangema, basis, lowerKC, val, noSqzInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( upperKC <= 0.062076 )
		if( val <= -6.8e-05 )
			if( rangema <= 0.000851 )
				if( upperKC <= 0.033788 )
					if( basis <= 0.031426 )
						if( dev <= 0.000909 )
							if( dev <= 0.000792 )
								ret := 0.317308
							if( dev > 0.000792 )
								ret := -0.355263
						if( dev > 0.000909 )
							if( rangema <= 0.000814 )
								ret := 0.560000
							if( rangema > 0.000814 )
								ret := -1.000000 // sell
					if( basis > 0.031426 )
						if( lowerBB <= 0.029572 )
							ret := 0.833333 // buy
						if( lowerBB > 0.029572 )
							if( lowerBB <= 0.030936 )
								ret := -0.804348 // sell
							if( lowerBB > 0.030936 )
								ret := 0.200000
				if( upperKC > 0.033788 )
					if( avgHighLow <= 0.054349 )
						if( priceRange <= 0.000755 )
							if( ma <= 0.05082 )
								ret := 0.731707 // buy
							if( ma > 0.05082 )
								ret := 0.454545
						if( priceRange > 0.000755 )
							if( lowerBB <= 0.047306 )
								ret := -0.100000
							if( lowerBB > 0.047306 )
								ret := 0.732394 // buy
					if( avgHighLow > 0.054349 )
						if( upperKC <= 0.056859 )
							if( dev <= 0.001307 )
								ret := 0.048193
							if( dev > 0.001307 )
								ret := -0.893617 // sell
						if( upperKC > 0.056859 )
							if( basis <= 0.059944 )
								ret := 0.627628
							if( basis > 0.059944 )
								ret := 0.158879
			if( rangema > 0.000851 )
				if( sqzOnInt <= 0.5 )
					if( basis <= 0.052319 )
						if( upperBB <= 0.055026 )
							if( basis <= 0.051229 )
								ret := 0.093960
							if( basis > 0.051229 )
								ret := -0.974359 // sell
						if( upperBB > 0.055026 )
							if( basis <= 0.051299 )
								ret := 0.500000
							if( basis > 0.051299 )
								ret := 1.000000 // buy
					if( basis > 0.052319 )
						if( avgHighLow <= 0.060336 )
							if( dev <= 0.003262 )
								ret := 0.377358
							if( dev > 0.003262 )
								ret := 0.936937 // buy
						if( avgHighLow > 0.060336 )
							if( priceRange <= 0.000789 )
								ret := -0.200000
							if( priceRange > 0.000789 )
								ret := -1.000000 // sell
				if( sqzOnInt > 0.5 )
					if( avgHighLow <= 0.035397 )
						if( upperKC <= 0.03263 )
							ret := -0.250000
						if( upperKC > 0.03263 )
							if( lowerBB <= 0.033729 )
								ret := 0.769231 // buy
							if( lowerBB > 0.033729 )
								ret := 0.952381 // buy
					if( avgHighLow > 0.035397 )
						if( avgHighLow <= 0.038003 )
							if( upperKC <= 0.035033 )
								ret := -0.750000 // sell
							if( upperKC > 0.035033 )
								ret := -1.000000 // sell
						if( avgHighLow > 0.038003 )
							if( dev <= 0.00138 )
								ret := -0.531250
							if( dev > 0.00138 )
								ret := 0.528571
		if( val > -6.8e-05 )
			if( val <= 0.000135 )
				if( lowerBB <= 0.024859 )
					if( dev <= 0.00033 )
						if( sqzOffInt <= 0.5 )
							if( basis <= 0.025007 )
								ret := 0.488746
							if( basis > 0.025007 )
								ret := -0.096154
						if( sqzOffInt > 0.5 )
							if( val <= -1e-05 )
								ret := 0.464286
							if( val > -1e-05 )
								ret := -0.522727
					if( dev > 0.00033 )
						if( upperBB <= 0.026025 )
							if( dev <= 0.000597 )
								ret := 0.480620
							if( dev > 0.000597 )
								ret := 0.818898 // buy
						if( upperBB > 0.026025 )
							if( upperKC <= 0.025807 )
								ret := -0.850000 // sell
							if( upperKC > 0.025807 )
								ret := 0.517241
				if( lowerBB > 0.024859 )
					if( lowerBB <= 0.034961 )
						if( lowerBB <= 0.034379 )
							if( rangema <= 0.000177 )
								ret := -0.101173
							if( rangema > 0.000177 )
								ret := 0.036836
						if( lowerBB > 0.034379 )
							if( upperKC <= 0.035235 )
								ret := 0.888889 // buy
							if( upperKC > 0.035235 )
								ret := -0.615819
					if( lowerBB > 0.034961 )
						if( upperBB <= 0.047427 )
							if( val <= 4.3e-05 )
								ret := 0.800000 // buy
							if( val > 4.3e-05 )
								ret := 0.367442
						if( upperBB > 0.047427 )
							if( upperKC <= 0.056042 )
								ret := 0.004675
							if( upperKC > 0.056042 )
								ret := 0.112630
			if( val > 0.000135 )
				if( priceRange <= 0.000518 )
					if( avgHighLow <= 0.058303 )
						if( upperKC <= 0.04573 )
							if( avgHighLow <= 0.029187 )
								ret := 1.000000 // buy
							if( avgHighLow > 0.029187 )
								ret := -0.875000 // sell
						if( upperKC > 0.04573 )
							if( val <= 0.000249 )
								ret := 0.552381
							if( val > 0.000249 )
								ret := -1.000000 // sell
					if( avgHighLow > 0.058303 )
						if( upperKC <= 0.061957 )
							if( rangema <= 0.000499 )
								ret := 0.285714
							if( rangema > 0.000499 )
								ret := -0.782609 // sell
						if( upperKC > 0.061957 )
							ret := 1.000000 // buy
				if( priceRange > 0.000518 )
					if( lowerBB <= 0.032975 )
						if( avgHighLow <= 0.028669 )
							ret := 0.000000
						if( avgHighLow > 0.028669 )
							if( rangema <= 0.0009 )
								ret := -0.800000 // sell
							if( rangema > 0.0009 )
								ret := -1.000000 // sell
					if( lowerBB > 0.032975 )
						if( lowerKC <= 0.05736 )
							if( upperBB <= 0.057737 )
								ret := -0.382212
							if( upperBB > 0.057737 )
								ret := 0.122581
						if( lowerKC > 0.05736 )
							if( avgHighLow <= 0.061929 )
								ret := -0.754386 // sell
							if( avgHighLow > 0.061929 )
								ret := 1.000000 // buy
	if( upperKC > 0.062076 )
		if( rangema <= 0.000568 )
			if( avgHighLow <= 0.061293 )
				if( dev <= 0.000985 )
					if( basis <= 0.061683 )
						ret := -0.250000
					if( basis > 0.061683 )
						ret := -0.500000
				if( dev > 0.000985 )
					if( priceRange <= 0.00051 )
						if( rangema <= 0.000481 )
							if( priceRange <= 0.000243 )
								ret := 0.600000
							if( priceRange > 0.000243 )
								ret := 0.981818 // buy
						if( rangema > 0.000481 )
							ret := 0.000000
					if( priceRange > 0.00051 )
						if( upperKC <= 0.062319 )
							if( avgHighLow <= 0.0609 )
								ret := 0.333333
							if( avgHighLow > 0.0609 )
								ret := -1.000000 // sell
						if( upperKC > 0.062319 )
							ret := 1.000000 // buy
			if( avgHighLow > 0.061293 )
				if( lowerBB <= 0.065323 )
					if( rangema <= 0.000307 )
						if( dev <= 0.00029 )
							if( upperKC <= 0.062298 )
								ret := -0.218487
							if( upperKC > 0.062298 )
								ret := 0.057830
						if( dev > 0.00029 )
							if( dev <= 0.00032 )
								ret := -0.343478
							if( dev > 0.00032 )
								ret := -0.130614
					if( rangema > 0.000307 )
						if( lowerBB <= 0.061872 )
							if( avgHighLow <= 0.061859 )
								ret := 0.149306
							if( avgHighLow > 0.061859 )
								ret := -0.243466
						if( lowerBB > 0.061872 )
							if( upperKC <= 0.067027 )
								ret := 0.095674
							if( upperKC > 0.067027 )
								ret := 0.524390
				if( lowerBB > 0.065323 )
					if( dev <= 0.001346 )
						if( lowerKC <= 0.06621 )
							if( upperBB <= 0.067788 )
								ret := -0.145909
							if( upperBB > 0.067788 )
								ret := -0.803030 // sell
						if( lowerKC > 0.06621 )
							if( lowerBB <= 0.066474 )
								ret := 0.260759
							if( lowerBB > 0.066474 )
								ret := -0.053897
					if( dev > 0.001346 )
						if( upperKC <= 0.080114 )
							if( lowerBB <= 0.067755 )
								ret := -0.030534
							if( lowerBB > 0.067755 )
								ret := -0.534014
						if( upperKC > 0.080114 )
							if( lowerKC <= 0.080375 )
								ret := 0.557143
							if( lowerKC > 0.080375 )
								ret := -0.197062
		if( rangema > 0.000568 )
			if( dev <= 0.000845 )
				if( basis <= 0.068978 )
					if( upperKC <= 0.06845 )
						if( rangema <= 0.000651 )
							if( dev <= 0.000708 )
								ret := 0.158824
							if( dev > 0.000708 )
								ret := -0.500000
						if( rangema > 0.000651 )
							if( ma <= 0.061314 )
								ret := -0.761905 // sell
							if( ma > 0.061314 )
								ret := 0.770992 // buy
					if( upperKC > 0.06845 )
						if( upperBB <= 0.068568 )
							if( dev <= 0.000741 )
								ret := -1.000000 // sell
							if( dev > 0.000741 )
								ret := -0.538462
						if( upperBB > 0.068568 )
							if( upperBB <= 0.068818 )
								ret := 0.444444
							if( upperBB > 0.068818 )
								ret := -0.750000 // sell
				if( basis > 0.068978 )
					if( ma <= 0.098022 )
						if( lowerKC <= 0.094765 )
							if( lowerBB <= 0.084761 )
								ret := 0.421152
							if( lowerBB > 0.084761 )
								ret := 0.159777
						if( lowerKC > 0.094765 )
							if( priceRange <= 0.000398 )
								ret := 0.000000
							if( priceRange > 0.000398 )
								ret := 0.757576 // buy
					if( ma > 0.098022 )
						if( upperKC <= 0.099439 )
							if( lowerKC <= 0.097076 )
								ret := 0.000000
							if( lowerKC > 0.097076 )
								ret := -0.880000 // sell
						if( upperKC > 0.099439 )
							if( upperKC <= 0.100402 )
								ret := 0.771429 // buy
							if( upperKC > 0.100402 )
								ret := 0.059789
			if( dev > 0.000845 )
				if( basis <= 0.16025 )
					if( upperBB <= 0.063517 )
						if( lowerBB <= 0.058207 )
							if( ma <= 0.060563 )
								ret := 0.628571
							if( ma > 0.060563 )
								ret := -1.000000 // sell
						if( lowerBB > 0.058207 )
							if( avgHighLow <= 0.060945 )
								ret := -0.168874
							if( avgHighLow > 0.060945 )
								ret := -0.591054
					if( upperBB > 0.063517 )
						if( avgHighLow <= 0.064197 )
							if( priceRange <= 0.000569 )
								ret := 0.576923
							if( priceRange > 0.000569 )
								ret := 0.085627
						if( avgHighLow > 0.064197 )
							if( basis <= 0.065253 )
								ret := -0.442516
							if( basis > 0.065253 )
								ret := -0.004838
				if( basis > 0.16025 )
					if( rangema <= 0.005007 )
						if( upperKC <= 0.16533 )
							if( avgHighLow <= 0.160554 )
								ret := -0.142857
							if( avgHighLow > 0.160554 )
								ret := -0.841667 // sell
						if( upperKC > 0.16533 )
							if( avgHighLow <= 0.165842 )
								ret := 0.160305
							if( avgHighLow > 0.165842 )
								ret := -0.664062
					if( rangema > 0.005007 )
						ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Squeeze_Momentum_Indicator 
//@version=5
//indicator "Squeeze Momentum Indicator [LazyBear]", shorttitle="SQZMOM_LB", overlay=false)

lengthBB = input.int(20, title="BB Length")
mult = input.float(2.0, title="BB MultFactor")
lengthKC = input.int(20, title="KC Length")
multKC = input.float(1.5, title="KC MultFactor")

useTrueRange = input(true, title="Use TrueRange (KC)")

// Calculate BB
source = close
basis = ta.sma(source, lengthBB)
dev = multKC * ta.stdev(source, lengthBB)
upperBB = basis + dev
lowerBB = basis - dev

// Calculate KC
ma = ta.sma(source, lengthKC)
priceRange = useTrueRange ? ta.tr(true) : (high - low)
rangema = ta.sma(priceRange, lengthKC)
upperKC = ma + rangema * multKC
lowerKC = ma - rangema * multKC

sqzOn = (lowerBB > lowerKC) and (upperBB < upperKC)
sqzOff = (lowerBB < lowerKC) and (upperBB > upperKC)
noSqz = not sqzOn and not sqzOff
sqzOnInt = sqzOn ? 1: 0   //Bool to int
sqzOffInt = sqzOff ? 1: 0   //Bool to int
noSqzInt = noSqz ? 1: 0   //Bool to int

avgHighLow = (ta.highest(high, lengthKC) + ta.lowest(low, lengthKC)) / 2
val = ta.linreg(source - (avgHighLow + ta.sma(close, lengthKC)) / 2, lengthKC, 0)

bcolor = val > 0 ? (val > nz(val[1]) ? color.lime : color.green) : (val < nz(val[1]) ? color.red : color.maroon)
scolor = noSqz ? color.blue : sqzOn ? color.black : color.gray

plot(val, color=bcolor, style=plot.style_histogram, linewidth=4)
plot(0, color=scolor, style=plot.style_cross, linewidth=2)


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
float op_operation = decision_tree_0_TRXUSDT_30Min_ae23b483(avgHighLow, priceRange, upperBB, upperKC, sqzOffInt, dev, ma, sqzOnInt, lowerBB, rangema, basis, lowerKC, val, noSqzInt)

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


