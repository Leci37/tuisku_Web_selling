//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: MELI_1Min_1SQU_32ef5715 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MELI_1Min_1SQU_32ef5715", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MELI_1Min_32ef5715(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( lowerKC <= 1630.41 )
		if( val <= 0.471464 )
			if( lowerBB <= 1626.12 )
				if( upperKC <= 1631.55 )
					if( upperBB <= 1628.16 )
						if( val <= 0.218301 )
							ret := 0.117953
						if( val > 0.218301 )
							ret := -0.055913
					if( upperBB > 1628.16 )
						if( rangema <= 3.03276 )
							ret := 0.655172
						if( rangema > 3.03276 )
							ret := 0.195876
				if( upperKC > 1631.55 )
					if( upperKC <= 1636.88 )
						if( upperKC <= 1633.28 )
							ret := -0.300000
						if( upperKC > 1633.28 )
							ret := -0.840336 // sell
					if( upperKC > 1636.88 )
						if( dev <= 10.7518 )
							ret := 0.790323 // buy
						if( dev > 10.7518 )
							ret := -0.651163
			if( lowerBB > 1626.12 )
				if( lowerKC <= 1628.7 )
					if( rangema <= 2.09719 )
						ret := 0.333333
					if( rangema > 2.09719 )
						if( val <= 0.120214 )
							ret := 0.982143 // buy
						if( val > 0.120214 )
							ret := 0.743902 // buy
				if( lowerKC > 1628.7 )
					if( upperBB <= 1636.52 )
						if( upperBB <= 1636.38 )
							ret := 0.307692
						if( upperBB > 1636.38 )
							ret := 1.000000 // buy
					if( upperBB > 1636.52 )
						if( rangema <= 2.36462 )
							ret := -0.928571 // sell
						if( rangema > 2.36462 )
							ret := -0.100000
		if( val > 0.471464 )
			if( upperBB <= 1582.47 )
				if( lowerKC <= 1446.51 )
					if( dev <= 16.1195 )
						if( lowerKC <= 1441.02 )
							ret := 0.254777
						if( lowerKC > 1441.02 )
							ret := -0.880000 // sell
					if( dev > 16.1195 )
						if( dev <= 21.4157 )
							ret := -1.000000 // sell
						if( dev > 21.4157 )
							ret := -0.666667
				if( lowerKC > 1446.51 )
					if( val <= 0.617476 )
						if( priceRange <= 3.11 )
							ret := 0.677419
						if( priceRange > 3.11 )
							ret := -0.125000
					if( val > 0.617476 )
						if( upperBB <= 1576.32 )
							ret := 0.963636 // buy
						if( upperBB > 1576.32 )
							ret := 0.400000
			if( upperBB > 1582.47 )
				if( lowerKC <= 1594.7 )
					if( upperBB <= 1597.19 )
						if( avgHighLow <= 1589.55 )
							ret := -0.321839
						if( avgHighLow > 1589.55 )
							ret := 0.681818
					if( upperBB > 1597.19 )
						if( lowerBB <= 1562.28 )
							ret := -0.212121
						if( lowerBB > 1562.28 )
							ret := -0.764192 // sell
				if( lowerKC > 1594.7 )
					if( dev <= 5.3407 )
						if( rangema <= 1.87707 )
							ret := 0.384615
						if( rangema > 1.87707 )
							ret := -0.725000 // sell
					if( dev > 5.3407 )
						if( val <= 0.895576 )
							ret := 0.024242
						if( val > 0.895576 )
							ret := 0.700000 // buy
	if( lowerKC > 1630.41 )
		if( dev <= 58.7903 )
			if( avgHighLow <= 2140.18 )
				if( basis <= 1671.66 )
					if( ma <= 1670.17 )
						if( avgHighLow <= 1669.49 )
							ret := -0.130368
						if( avgHighLow > 1669.49 )
							ret := 0.349398
					if( ma > 1670.17 )
						if( lowerBB <= 1663.26 )
							ret := 0.272727
						if( lowerBB > 1663.26 )
							ret := -0.880282 // sell
				if( basis > 1671.66 )
					if( upperKC <= 1677.95 )
						if( lowerBB <= 1672.34 )
							ret := 0.312500
						if( lowerBB > 1672.34 )
							ret := 0.803922 // buy
					if( upperKC > 1677.95 )
						if( val <= -0.143339 )
							ret := 0.046268
						if( val > -0.143339 )
							ret := -0.047773
			if( avgHighLow > 2140.18 )
				if( dev <= 4.19216 )
					ret := -0.285714
				if( dev > 4.19216 )
					if( lowerKC <= 2139.07 )
						if( avgHighLow <= 2143.74 )
							ret := -0.984127 // sell
						if( avgHighLow > 2143.74 )
							ret := -0.692308
					if( lowerKC > 2139.07 )
						ret := -0.555556
		if( dev > 58.7903 )
			if( upperKC <= 1722.23 )
				ret := -0.882353 // sell
			if( upperKC > 1722.23 )
				if( upperBB <= 2078.45 )
					ret := 1.000000 // buy
				if( upperBB > 2078.45 )
					ret := 0.875000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_MELI_1Min_32ef5715(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)

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


