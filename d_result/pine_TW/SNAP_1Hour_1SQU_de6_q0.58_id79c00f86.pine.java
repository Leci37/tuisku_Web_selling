//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: SNAP_1Hour_1SQU_79c00f86 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNAP_1Hour_1SQU_79c00f86", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNAP_1Hour_79c00f86(avgHighLow, priceRange, upperBB, upperKC, sqzOffInt, dev, ma, sqzOnInt, lowerBB, rangema, basis, lowerKC, val, noSqzInt)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( avgHighLow <= 11.0864 )
		if( val <= -0.0392 )
			if( lowerKC <= 9.32397 )
				if( lowerBB <= 7.83873 )
					if( dev <= 0.532241 )
						ret := -0.714286 // sell
					if( dev > 0.532241 )
						ret := 1.000000 // buy
				if( lowerBB > 7.83873 )
					if( lowerBB <= 8.65162 )
						if( ma <= 8.65604 )
							ret := 0.000000
						if( ma > 8.65604 )
							ret := -0.703704 // sell
					if( lowerBB > 8.65162 )
						ret := 0.363636
			if( lowerKC > 9.32397 )
				if( lowerBB <= 10.4204 )
					if( rangema <= 0.452399 )
						if( upperBB <= 11.7844 )
							ret := 0.934066 // buy
						if( upperBB > 11.7844 )
							ret := 0.181818
					if( rangema > 0.452399 )
						ret := -0.333333
				if( lowerBB > 10.4204 )
					if( lowerBB <= 10.5936 )
						ret := -0.230769
					if( lowerBB > 10.5936 )
						if( basis <= 10.9336 )
							ret := 0.000000
						if( basis > 10.9336 )
							ret := 0.769231 // buy
		if( val > -0.0392 )
			if( dev <= 0.096489 )
				if( avgHighLow <= 6.31998 )
					if( lowerBB <= 5.60922 )
						ret := -0.666667
					if( lowerBB > 5.60922 )
						if( dev <= 0.082334 )
							ret := 0.933962 // buy
						if( dev > 0.082334 )
							ret := 0.629630
				if( avgHighLow > 6.31998 )
					if( lowerBB <= 6.35654 )
						if( dev <= 0.078521 )
							ret := 0.192308
						if( dev > 0.078521 )
							ret := -0.584615
					if( lowerBB > 6.35654 )
						if( basis <= 8.60827 )
							ret := 0.525000
						if( basis > 8.60827 )
							ret := 0.069370
			if( dev > 0.096489 )
				if( lowerBB <= 7.38835 )
					if( upperKC <= 6.42971 )
						if( lowerKC <= 5.90424 )
							ret := -0.059426
						if( lowerKC > 5.90424 )
							ret := 0.604651
					if( upperKC > 6.42971 )
						if( sqzOnInt <= 0.5 )
							ret := -0.449074
						if( sqzOnInt > 0.5 )
							ret := -0.004484
				if( lowerBB > 7.38835 )
					if( basis <= 8.55966 )
						if( upperKC <= 8.6322 )
							ret := 0.262136
						if( upperKC > 8.6322 )
							ret := 0.798780 // buy
					if( basis > 8.55966 )
						if( upperKC <= 8.97157 )
							ret := -0.203343
						if( upperKC > 8.97157 )
							ret := 0.060833
	if( avgHighLow > 11.0864 )
		if( avgHighLow <= 12.7425 )
			if( basis <= 12.4756 )
				if( basis <= 12.311 )
					if( lowerBB <= 11.12 )
						if( upperKC <= 11.4351 )
							ret := -0.252730
						if( upperKC > 11.4351 )
							ret := 0.102497
					if( lowerBB > 11.12 )
						if( rangema <= 0.171165 )
							ret := -0.139370
						if( rangema > 0.171165 )
							ret := -0.395522
				if( basis > 12.311 )
					if( basis <= 12.3895 )
						if( dev <= 0.39941 )
							ret := 0.808824 // buy
						if( dev > 0.39941 )
							ret := -0.235294
					if( basis > 12.3895 )
						if( val <= 0.013176 )
							ret := -0.651163
						if( val > 0.013176 )
							ret := 0.571429
			if( basis > 12.4756 )
				if( upperBB <= 12.7937 )
					ret := 0.000000
				if( upperBB > 12.7937 )
					if( rangema <= 0.209281 )
						if( rangema <= 0.194543 )
							ret := -0.795699 // sell
						if( rangema > 0.194543 )
							ret := 0.466667
					if( rangema > 0.209281 )
						if( priceRange <= 0.372456 )
							ret := -0.952381 // sell
						if( priceRange > 0.372456 )
							ret := 0.000000
		if( avgHighLow > 12.7425 )
			if( ma <= 13.1498 )
				if( avgHighLow <= 12.9274 )
					if( priceRange <= 0.1675 )
						if( rangema <= 0.213358 )
							ret := 0.500000
						if( rangema > 0.213358 )
							ret := -0.357143
					if( priceRange > 0.1675 )
						if( rangema <= 0.234321 )
							ret := 0.952941 // buy
						if( rangema > 0.234321 )
							ret := 0.500000
				if( avgHighLow > 12.9274 )
					if( avgHighLow <= 13.0973 )
						if( lowerBB <= 12.4629 )
							ret := -0.900000 // sell
						if( lowerBB > 12.4629 )
							ret := 0.025316
					if( avgHighLow > 13.0973 )
						if( dev <= 0.414308 )
							ret := 0.813559 // buy
						if( dev > 0.414308 )
							ret := -0.125000
			if( ma > 13.1498 )
				if( upperBB <= 80.6074 )
					if( avgHighLow <= 77.8567 )
						if( lowerBB <= 73.299 )
							ret := -0.019382
						if( lowerBB > 73.299 )
							ret := -0.250000
					if( avgHighLow > 77.8567 )
						if( lowerKC <= 75.9532 )
							ret := 0.000000
						if( lowerKC > 75.9532 )
							ret := 0.885714 // buy
				if( upperBB > 80.6074 )
					if( rangema <= 0.866993 )
						ret := -1.000000 // sell
					if( rangema > 0.866993 )
						if( dev <= 10.1481 )
							ret := 0.000000
						if( dev > 10.1481 )
							ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
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
float op_operation = decision_tree_0_SNAP_1Hour_79c00f86(avgHighLow, priceRange, upperBB, upperKC, sqzOffInt, dev, ma, sqzOnInt, lowerBB, rangema, basis, lowerKC, val, noSqzInt)

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


