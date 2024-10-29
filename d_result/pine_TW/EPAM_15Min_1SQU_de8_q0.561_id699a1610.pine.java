//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: EPAM_15Min_1SQU_699a1610 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_EPAM_15Min_1SQU_699a1610", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_EPAM_15Min_699a1610(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ma <= 298.166 )
		if( dev <= 12.7585 )
			if( lowerBB <= 296.584 )
				if( upperKC <= 296.382 )
					if( rangema <= 5.98706 )
						if( sqzOnInt <= 0.5 )
							if( val <= -0.8974 )
								if( val <= -1.06571 )
									ret := 0.980392 // buy
								if( val > -1.06571 )
									ret := 0.785714 // buy
							if( val > -0.8974 )
								if( rangema <= 2.27419 )
									ret := 0.012018
								if( rangema > 2.27419 )
									ret := -0.148893
						if( sqzOnInt > 0.5 )
							if( lowerKC <= 62.1363 )
								if( dev <= 0.268894 )
									ret := 0.960000 // buy
								if( dev > 0.268894 )
									ret := 0.594595
							if( lowerKC > 62.1363 )
								if( basis <= 282.804 )
									ret := 0.046743
								if( basis > 282.804 )
									ret := -0.177196
					if( rangema > 5.98706 )
						ret := 1.000000 // buy
				if( upperKC > 296.382 )
					if( ma <= 293.473 )
						if( ma <= 292.122 )
							ret := -0.444444
						if( ma > 292.122 )
							if( avgHighLow <= 295.458 )
								if( dev <= 5.28627 )
									ret := 0.948718 // buy
								if( dev > 5.28627 )
									ret := 1.000000 // buy
							if( avgHighLow > 295.458 )
								ret := 0.700000 // buy
					if( ma > 293.473 )
						if( val <= -0.390445 )
							if( avgHighLow <= 295.482 )
								if( upperBB <= 301.05 )
									ret := 0.692308
								if( upperBB > 301.05 )
									ret := 0.971014 // buy
							if( avgHighLow > 295.482 )
								if( val <= -0.553947 )
									ret := 0.562500
								if( val > -0.553947 )
									ret := 0.026316
						if( val > -0.390445 )
							if( ma <= 295.954 )
								if( ma <= 294.6 )
									ret := -0.466667
								if( ma > 294.6 )
									ret := -0.076923
							if( ma > 295.954 )
								if( priceRange <= 2.08509 )
									ret := 0.259804
								if( priceRange > 2.08509 )
									ret := -0.139896
			if( lowerBB > 296.584 )
				if( val <= 0.125185 )
					if( priceRange <= 1.44451 )
						ret := 1.000000 // buy
					if( priceRange > 1.44451 )
						ret := 0.916667 // buy
				if( val > 0.125185 )
					ret := 0.454545
		if( dev > 12.7585 )
			if( ma <= 231.606 )
				if( upperKC <= 200.691 )
					if( avgHighLow <= 188.558 )
						if( ma <= 184.9 )
							ret := 0.250000
						if( ma > 184.9 )
							if( val <= 1.143 )
								ret := -0.875000 // sell
							if( val > 1.143 )
								ret := -1.000000 // sell
					if( avgHighLow > 188.558 )
						ret := 1.000000 // buy
				if( upperKC > 200.691 )
					if( dev <= 13.4152 )
						ret := -0.363636
					if( dev > 13.4152 )
						if( avgHighLow <= 226.306 )
							if( lowerBB <= 180.054 )
								ret := -0.588235
							if( lowerBB > 180.054 )
								if( upperBB <= 213.934 )
									ret := -0.818182 // sell
								if( upperBB > 213.934 )
									ret := -1.000000 // sell
						if( avgHighLow > 226.306 )
							if( upperKC <= 234.942 )
								if( upperKC <= 229.341 )
									ret := -0.777778 // sell
								if( upperKC > 229.341 )
									ret := 0.384615
							if( upperKC > 234.942 )
								if( lowerBB <= 211.331 )
									ret := -1.000000 // sell
								if( lowerBB > 211.331 )
									ret := -0.714286 // sell
			if( ma > 231.606 )
				if( lowerKC <= 232.084 )
					if( rangema <= 5.07856 )
						if( rangema <= 4.79728 )
							ret := 1.000000 // buy
						if( rangema > 4.79728 )
							ret := 0.818182 // buy
					if( rangema > 5.07856 )
						if( basis <= 236.883 )
							ret := -0.733333 // sell
						if( basis > 236.883 )
							ret := 0.636364
				if( lowerKC > 232.084 )
					if( rangema <= 4.0847 )
						if( ma <= 290.527 )
							if( upperKC <= 292.207 )
								if( val <= -1.654 )
									ret := -1.000000 // sell
								if( val > -1.654 )
									ret := -0.759494 // sell
							if( upperKC > 292.207 )
								if( upperBB <= 304.566 )
									ret := -0.090909
								if( upperBB > 304.566 )
									ret := -0.750000 // sell
						if( ma > 290.527 )
							ret := 0.500000
					if( rangema > 4.0847 )
						if( avgHighLow <= 281.505 )
							if( rangema <= 4.18982 )
								if( val <= -0.584798 )
									ret := 0.900000 // buy
								if( val > -0.584798 )
									ret := 1.000000 // buy
							if( rangema > 4.18982 )
								if( dev <= 20.0461 )
									ret := -0.550000
								if( dev > 20.0461 )
									ret := 0.666667
						if( avgHighLow > 281.505 )
							if( upperKC <= 302.914 )
								ret := -0.714286 // sell
							if( upperKC > 302.914 )
								ret := -1.000000 // sell
	if( ma > 298.166 )
		if( basis <= 300.525 )
			if( dev <= 11.6388 )
				if( avgHighLow <= 299.017 )
					if( lowerKC <= 292.938 )
						if( val <= 0.995009 )
							if( basis <= 298.696 )
								ret := -0.800000 // sell
							if( basis > 298.696 )
								ret := -1.000000 // sell
						if( val > 0.995009 )
							ret := -0.692308
					if( lowerKC > 292.938 )
						if( lowerBB <= 296.891 )
							if( sqzOnInt <= 0.5 )
								if( val <= 0.192857 )
									ret := 0.075949
								if( val > 0.192857 )
									ret := 1.000000 // buy
							if( sqzOnInt > 0.5 )
								if( upperBB <= 301.513 )
									ret := 0.428571
								if( upperBB > 301.513 )
									ret := -0.846154 // sell
						if( lowerBB > 296.891 )
							if( avgHighLow <= 297.972 )
								if( ma <= 298.523 )
									ret := -0.750000 // sell
								if( ma > 298.523 )
									ret := -0.928571 // sell
							if( avgHighLow > 297.972 )
								if( rangema <= 1.02464 )
									ret := -0.615385
								if( rangema > 1.02464 )
									ret := 0.029412
				if( avgHighLow > 299.017 )
					if( lowerKC <= 298.778 )
						if( avgHighLow <= 299.151 )
							if( rangema <= 2.1782 )
								if( val <= 0.288736 )
									ret := -0.666667
								if( val > 0.288736 )
									ret := -1.000000 // sell
							if( rangema > 2.1782 )
								ret := -1.000000 // sell
						if( avgHighLow > 299.151 )
							if( dev <= 3.59938 )
								if( avgHighLow <= 299.771 )
									ret := 0.277778
								if( avgHighLow > 299.771 )
									ret := -0.500000
							if( dev > 3.59938 )
								if( priceRange <= 2.51198 )
									ret := -0.700000 // sell
								if( priceRange > 2.51198 )
									ret := -0.333333
					if( lowerKC > 298.778 )
						if( rangema <= 0.688255 )
							ret := -1.000000 // sell
						if( rangema > 0.688255 )
							if( priceRange <= 0.4725 )
								ret := -0.461538
							if( priceRange > 0.4725 )
								if( upperKC <= 301.528 )
									ret := -0.666667
								if( upperKC > 301.528 )
									ret := -0.948718 // sell
			if( dev > 11.6388 )
				ret := 0.888889 // buy
		if( basis > 300.525 )
			if( dev <= 2.14008 )
				if( basis <= 314.714 )
					if( basis <= 304.698 )
						if( basis <= 301.617 )
							if( dev <= 1.64131 )
								if( lowerBB <= 299.417 )
									ret := 0.750000 // buy
								if( lowerBB > 299.417 )
									ret := 0.040000
							if( dev > 1.64131 )
								if( dev <= 1.85748 )
									ret := -1.000000 // sell
								if( dev > 1.85748 )
									ret := -0.230769
						if( basis > 301.617 )
							if( upperKC <= 303.246 )
								ret := -0.066667
							if( upperKC > 303.246 )
								if( rangema <= 0.878805 )
									ret := -0.026316
								if( rangema > 0.878805 )
									ret := 0.638095
					if( basis > 304.698 )
						if( ma <= 305.988 )
							if( upperBB <= 306.346 )
								ret := 0.428571
							if( upperBB > 306.346 )
								if( priceRange <= 2.20828 )
									ret := -0.634328
								if( priceRange > 2.20828 )
									ret := 0.625000
						if( ma > 305.988 )
							if( upperKC <= 314.922 )
								if( lowerBB <= 310.255 )
									ret := -0.005305
								if( lowerBB > 310.255 )
									ret := 0.697368
							if( upperKC > 314.922 )
								if( lowerKC <= 309.932 )
									ret := -0.038462
								if( lowerKC > 309.932 )
									ret := -0.616162
				if( basis > 314.714 )
					if( upperBB <= 326.99 )
						if( sqzOnInt <= 0.5 )
							if( val <= 0.165477 )
								if( dev <= 1.8251 )
									ret := 0.595745
								if( dev > 1.8251 )
									ret := 0.984848 // buy
							if( val > 0.165477 )
								if( sqzOffInt <= 0.5 )
									ret := 0.714286 // buy
								if( sqzOffInt > 0.5 )
									ret := 0.125000
						if( sqzOnInt > 0.5 )
							if( rangema <= 1.76004 )
								if( upperKC <= 323.833 )
									ret := 0.135922
								if( upperKC > 323.833 )
									ret := 0.710526 // buy
							if( rangema > 1.76004 )
								if( upperBB <= 323.499 )
									ret := 0.153846
								if( upperBB > 323.499 )
									ret := -0.846154 // sell
					if( upperBB > 326.99 )
						if( rangema <= 2.23564 )
							if( avgHighLow <= 635.108 )
								if( upperKC <= 601.8 )
									ret := 0.063953
								if( upperKC > 601.8 )
									ret := 0.520000
							if( avgHighLow > 635.108 )
								if( upperKC <= 657.498 )
									ret := -0.904762 // sell
								if( upperKC > 657.498 )
									ret := -0.250000
						if( rangema > 2.23564 )
							if( ma <= 347.896 )
								if( lowerBB <= 333.14 )
									ret := 0.250000
								if( lowerBB > 333.14 )
									ret := -1.000000 // sell
							if( ma > 347.896 )
								if( dev <= 1.90548 )
									ret := 0.462963
								if( dev > 1.90548 )
									ret := 0.847458 // buy
			if( dev > 2.14008 )
				if( rangema <= 3.56017 )
					if( lowerBB <= 401.495 )
						if( upperKC <= 383.057 )
							if( avgHighLow <= 299.63 )
								if( avgHighLow <= 299.35 )
									ret := 0.666667
								if( avgHighLow > 299.35 )
									ret := 1.000000 // buy
							if( avgHighLow > 299.63 )
								if( rangema <= 1.76941 )
									ret := -0.141832
								if( rangema > 1.76941 )
									ret := -0.005644
						if( upperKC > 383.057 )
							if( lowerBB <= 381.632 )
								if( dev <= 9.60511 )
									ret := -0.606838
								if( dev > 9.60511 )
									ret := 0.545455
							if( lowerBB > 381.632 )
								if( upperKC <= 409.555 )
									ret := -0.161017
								if( upperKC > 409.555 )
									ret := -0.951220 // sell
					if( lowerBB > 401.495 )
						if( lowerKC <= 410.464 )
							if( lowerBB <= 406.3 )
								if( lowerBB <= 403.542 )
									ret := 0.555556
								if( lowerBB > 403.542 )
									ret := 0.890411 // buy
							if( lowerBB > 406.3 )
								if( lowerKC <= 408.688 )
									ret := 0.000000
								if( lowerKC > 408.688 )
									ret := 0.807692 // buy
						if( lowerKC > 410.464 )
							if( sqzOnInt <= 0.5 )
								if( upperBB <= 624.54 )
									ret := 0.127799
								if( upperBB > 624.54 )
									ret := -0.070413
							if( sqzOnInt > 0.5 )
								if( lowerBB <= 414.075 )
									ret := 0.925926 // buy
								if( lowerBB > 414.075 )
									ret := -0.124113
				if( rangema > 3.56017 )
					if( dev <= 4.63026 )
						if( dev <= 3.35674 )
							if( val <= 0.399197 )
								ret := -0.600000
							if( val > 0.399197 )
								ret := 0.916667 // buy
						if( dev > 3.35674 )
							if( avgHighLow <= 623.805 )
								if( avgHighLow <= 478.695 )
									ret := -0.525424
								if( avgHighLow > 478.695 )
									ret := -0.914530 // sell
							if( avgHighLow > 623.805 )
								if( upperBB <= 631.729 )
									ret := 1.000000 // buy
								if( upperBB > 631.729 )
									ret := -0.739130 // sell
					if( dev > 4.63026 )
						if( lowerBB <= 308.686 )
							if( dev <= 76.2748 )
								if( dev <= 10.9727 )
									ret := 0.062271
								if( dev > 10.9727 )
									ret := 0.492386
							if( dev > 76.2748 )
								ret := -1.000000 // sell
						if( lowerBB > 308.686 )
							if( val <= -0.499715 )
								if( upperKC <= 461.752 )
									ret := 0.327402
								if( upperKC > 461.752 )
									ret := -0.104240
							if( val > -0.499715 )
								if( lowerBB <= 315.4 )
									ret := -0.830189 // sell
								if( lowerBB > 315.4 )
									ret := -0.216673
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_EPAM_15Min_699a1610(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)

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


