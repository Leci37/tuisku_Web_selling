//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: ZI_30Min_1SQU_7fd8efe5 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ZI_30Min_1SQU_7fd8efe5", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ZI_30Min_7fd8efe5(rangema, avgHighLow, upperKC, lowerBB, noSqzInt, ma, upperBB, lowerKC, basis, sqzOnInt, priceRange, dev, val, sqzOffInt)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.65, min_samples_leaf=4,min_samples_split=5, random_state=843828734)
	if( avgHighLow <= 50.1484 )
		if( upperKC <= 49.8251 )
			if( ma <= 45.3368 )
				if( upperKC <= 45.787 )
					if( upperKC <= 8.96164 )
						if( rangema <= 0.236658 )
							ret := 0.879630 // buy
						if( rangema > 0.236658 )
							ret := -0.181818
					if( upperKC > 8.96164 )
						if( val <= 0.132113 )
							ret := 0.030661
						if( val > 0.132113 )
							ret := -0.364583
				if( upperKC > 45.787 )
					if( rangema <= 0.6644 )
						if( rangema <= 0.566236 )
							ret := 0.386364
						if( rangema > 0.566236 )
							ret := -0.608696
					if( rangema > 0.6644 )
						if( rangema <= 0.778051 )
							ret := 0.939655 // buy
						if( rangema > 0.778051 )
							ret := 0.439655
			if( ma > 45.3368 )
				if( avgHighLow <= 48.6075 )
					if( avgHighLow <= 45.5989 )
						if( upperBB <= 47.7245 )
							ret := -0.679167
						if( upperBB > 47.7245 )
							ret := 0.684211
					if( avgHighLow > 45.5989 )
						if( val <= -0.077256 )
							ret := 0.209169
						if( val > -0.077256 )
							ret := -0.093225
				if( avgHighLow > 48.6075 )
					if( val <= -0.013311 )
						if( avgHighLow <= 48.687 )
							ret := -0.777778 // sell
						if( avgHighLow > 48.687 )
							ret := 0.214286
					if( val > -0.013311 )
						if( upperBB <= 50.6223 )
							ret := -0.868020 // sell
						if( upperBB > 50.6223 )
							ret := 1.000000 // buy
		if( upperKC > 49.8251 )
			if( dev <= 1.64916 )
				if( avgHighLow <= 49.9645 )
					if( upperBB <= 49.9082 )
						if( val <= -0.040771 )
							ret := -0.611111
						if( val > -0.040771 )
							ret := 0.857143 // buy
					if( upperBB > 49.9082 )
						if( priceRange <= 0.417438 )
							ret := -0.338462
						if( priceRange > 0.417438 )
							ret := 0.078947
				if( avgHighLow > 49.9645 )
					if( avgHighLow <= 50.0568 )
						if( rangema <= 0.641775 )
							ret := 0.451613
						if( rangema > 0.641775 )
							ret := 0.893204 // buy
					if( avgHighLow > 50.0568 )
						if( avgHighLow <= 50.0606 )
							ret := -1.000000 // sell
						if( avgHighLow > 50.0606 )
							ret := 0.402778
			if( dev > 1.64916 )
				if( basis <= 48.122 )
					if( lowerKC <= 44.352 )
						ret := 0.285714
					if( lowerKC > 44.352 )
						ret := 1.000000 // buy
				if( basis > 48.122 )
					if( rangema <= 1.03257 )
						if( priceRange <= 0.468024 )
							ret := 0.096774
						if( priceRange > 0.468024 )
							ret := 0.851429 // buy
					if( rangema > 1.03257 )
						if( dev <= 2.90744 )
							ret := -0.380952
						if( dev > 2.90744 )
							ret := 0.631579
	if( avgHighLow > 50.1484 )
		if( upperBB <= 51.4093 )
			if( upperBB <= 50.5597 )
				ret := 0.714286 // buy
			if( upperBB > 50.5597 )
				if( lowerBB <= 49.2941 )
					if( ma <= 50.1 )
						if( val <= 0.074595 )
							ret := -0.454545
						if( val > 0.074595 )
							ret := -0.916667 // sell
					if( ma > 50.1 )
						ret := 0.000000
				if( lowerBB > 49.2941 )
					if( lowerBB <= 50.3309 )
						if( priceRange <= 0.275 )
							ret := -0.800000 // sell
						if( priceRange > 0.275 )
							ret := -0.984127 // sell
					if( lowerBB > 50.3309 )
						ret := -0.400000
		if( upperBB > 51.4093 )
			if( upperBB <= 52.5803 )
				if( ma <= 50.5095 )
					if( upperKC <= 50.9633 )
						ret := 0.666667
					if( upperKC > 50.9633 )
						if( dev <= 1.5234 )
							ret := -0.088235
						if( dev > 1.5234 )
							ret := -0.884615 // sell
				if( ma > 50.5095 )
					if( upperBB <= 51.8989 )
						if( priceRange <= 1.35445 )
							ret := 0.196429
						if( priceRange > 1.35445 )
							ret := -0.846154 // sell
					if( upperBB > 51.8989 )
						if( upperKC <= 52.5078 )
							ret := 0.629032
						if( upperKC > 52.5078 )
							ret := 0.093023
			if( upperBB > 52.5803 )
				if( basis <= 52.4858 )
					if( dev <= 1.06005 )
						if( val <= -0.031413 )
							ret := 0.057143
						if( val > -0.031413 )
							ret := -0.781065 // sell
					if( dev > 1.06005 )
						if( lowerBB <= 49.8221 )
							ret := -0.466102
						if( lowerBB > 49.8221 )
							ret := 0.042403
				if( basis > 52.4858 )
					if( lowerKC <= 52.0086 )
						if( priceRange <= 0.573765 )
							ret := -0.084615
						if( priceRange > 0.573765 )
							ret := 0.612335
					if( lowerKC > 52.0086 )
						if( upperBB <= 54.6332 )
							ret := -0.470968
						if( upperBB > 54.6332 )
							ret := -0.080894
	
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
float op_operation = decision_tree_0_ZI_30Min_7fd8efe5(rangema, avgHighLow, upperKC, lowerBB, noSqzInt, ma, upperBB, lowerKC, basis, sqzOnInt, priceRange, dev, val, sqzOffInt)

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


