//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: GME_15Min_1SQU_50de9d34 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GME_15Min_1SQU_50de9d34", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GME_15Min_50de9d34(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( avgHighLow <= 4.06009 )
		if( val <= 0.011436 )
			if( lowerKC <= 3.81119 )
				if( lowerKC <= 3.77628 )
					if( rangema <= 0.072039 )
						if( upperKC <= 2.86944 )
							if( upperBB <= 2.83068 )
								ret := 0.500000
							if( upperBB > 2.83068 )
								ret := 1.000000 // buy
						if( upperKC > 2.86944 )
							if( upperBB <= 2.9473 )
								ret := -0.860465 // sell
							if( upperBB > 2.9473 )
								ret := 0.030071
					if( rangema > 0.072039 )
						if( val <= 0.00224 )
							if( dev <= 0.260074 )
								ret := 0.658537
							if( dev > 0.260074 )
								ret := 0.102941
						if( val > 0.00224 )
							if( lowerKC <= 3.57262 )
								ret := 0.600000
							if( lowerKC > 3.57262 )
								ret := -0.480916
				if( lowerKC > 3.77628 )
					if( lowerBB <= 3.82355 )
						if( dev <= 0.105865 )
							if( upperKC <= 3.96312 )
								ret := -0.434783
							if( upperKC > 3.96312 )
								ret := 0.555556
						if( dev > 0.105865 )
							if( val <= -0.015782 )
								ret := 0.250000
							if( val > -0.015782 )
								ret := -0.949495 // sell
					if( lowerBB > 3.82355 )
						if( avgHighLow <= 4.02549 )
							if( priceRange <= 0.059872 )
								ret := -0.750000 // sell
							if( priceRange > 0.059872 )
								ret := 0.444444
						if( avgHighLow > 4.02549 )
							ret := 1.000000 // buy
			if( lowerKC > 3.81119 )
				if( val <= 0.001349 )
					if( priceRange <= 0.032571 )
						if( rangema <= 0.050797 )
							if( upperBB <= 4.1321 )
								ret := 0.689420
							if( upperBB > 4.1321 )
								ret := -0.307692
						if( rangema > 0.050797 )
							if( avgHighLow <= 3.97416 )
								ret := -0.714286 // sell
							if( avgHighLow > 3.97416 )
								ret := 0.222222
					if( priceRange > 0.032571 )
						if( ma <= 3.93642 )
							if( dev <= 0.045604 )
								ret := 0.777778 // buy
							if( dev > 0.045604 )
								ret := -0.176471
						if( ma > 3.93642 )
							if( priceRange <= 0.070405 )
								ret := 0.299145
							if( priceRange > 0.070405 )
								ret := 0.682243
				if( val > 0.001349 )
					if( sqzOffInt <= 0.5 )
						if( lowerBB <= 3.8499 )
							if( ma <= 3.88498 )
								ret := 0.000000
							if( ma > 3.88498 )
								ret := -0.804878 // sell
						if( lowerBB > 3.8499 )
							if( basis <= 3.97031 )
								ret := 0.565217
							if( basis > 3.97031 )
								ret := -0.210227
					if( sqzOffInt > 0.5 )
						if( basis <= 4.04078 )
							if( upperKC <= 4.06832 )
								ret := 0.232558
							if( upperKC > 4.06832 )
								ret := 0.836538 // buy
						if( basis > 4.04078 )
							if( avgHighLow <= 4.05016 )
								ret := -0.533333
							if( avgHighLow > 4.05016 )
								ret := -0.040000
		if( val > 0.011436 )
			if( avgHighLow <= 3.245 )
				if( ma <= 2.72041 )
					ret := 1.000000 // buy
				if( ma > 2.72041 )
					if( upperBB <= 2.93697 )
						ret := 0.000000
					if( upperBB > 2.93697 )
						ret := 0.714286 // buy
			if( avgHighLow > 3.245 )
				if( dev <= 0.215239 )
					if( upperBB <= 3.78018 )
						if( lowerKC <= 3.28413 )
							if( dev <= 0.156086 )
								ret := -0.200000
							if( dev > 0.156086 )
								ret := -1.000000 // sell
						if( lowerKC > 3.28413 )
							if( lowerBB <= 3.52613 )
								ret := 0.285714
							if( lowerBB > 3.52613 )
								ret := -1.000000 // sell
					if( upperBB > 3.78018 )
						if( sqzOffInt <= 0.5 )
							if( lowerBB <= 3.59562 )
								ret := 0.400000
							if( lowerBB > 3.59562 )
								ret := -0.885714 // sell
						if( sqzOffInt > 0.5 )
							if( rangema <= 0.093145 )
								ret := 0.326531
							if( rangema > 0.093145 )
								ret := 0.950000 // buy
				if( dev > 0.215239 )
					if( dev <= 0.29903 )
						if( basis <= 3.626 )
							if( rangema <= 0.094144 )
								ret := -0.888889 // sell
							if( rangema > 0.094144 )
								ret := 0.000000
						if( basis > 3.626 )
							if( val <= 0.012743 )
								ret := -0.833333 // sell
							if( val > 0.012743 )
								ret := -0.986486 // sell
					if( dev > 0.29903 )
						if( lowerBB <= 3.3862 )
							ret := 0.800000 // buy
						if( lowerBB > 3.3862 )
							ret := -0.666667
	if( avgHighLow > 4.06009 )
		if( lowerKC <= 210.83 )
			if( lowerBB <= 207.699 )
				if( val <= -0.00076 )
					if( dev <= 20.4888 )
						if( avgHighLow <= 15.9909 )
							if( sqzOffInt <= 0.5 )
								ret := 0.116787
							if( sqzOffInt > 0.5 )
								ret := 0.026779
						if( avgHighLow > 15.9909 )
							if( avgHighLow <= 208.101 )
								ret := -0.000385
							if( avgHighLow > 208.101 )
								ret := -0.410714
					if( dev > 20.4888 )
						if( lowerBB <= 61.7264 )
							if( ma <= 86.9419 )
								ret := -0.965517 // sell
							if( ma > 86.9419 )
								ret := -0.625000
						if( lowerBB > 61.7264 )
							if( lowerKC <= 132.02 )
								ret := 0.924051 // buy
							if( lowerKC > 132.02 )
								ret := 0.308219
				if( val > -0.00076 )
					if( avgHighLow <= 4.09986 )
						if( lowerKC <= 3.94657 )
							ret := 0.800000 // buy
						if( lowerKC > 3.94657 )
							if( priceRange <= 0.01998 )
								ret := -0.915254 // sell
							if( priceRange > 0.01998 )
								ret := -0.293839
					if( avgHighLow > 4.09986 )
						if( basis <= 206.939 )
							if( rangema <= 1.07502 )
								ret := -0.032922
							if( rangema > 1.07502 )
								ret := 0.035492
						if( basis > 206.939 )
							if( upperBB <= 222.077 )
								ret := -0.629032
							if( upperBB > 222.077 )
								ret := 0.188406
			if( lowerBB > 207.699 )
				if( val <= -0.098941 )
					if( rangema <= 2.32341 )
						if( ma <= 210.26 )
							if( upperKC <= 212.038 )
								ret := 1.000000 // buy
							if( upperKC > 212.038 )
								ret := 0.500000
						if( ma > 210.26 )
							if( priceRange <= 0.7995 )
								ret := -0.090909
							if( priceRange > 0.7995 )
								ret := -0.689655
					if( rangema > 2.32341 )
						if( dev <= 4.56374 )
							if( upperKC <= 216.964 )
								ret := 0.769231 // buy
							if( upperKC > 216.964 )
								ret := -0.916667 // sell
						if( dev > 4.56374 )
							if( ma <= 213.208 )
								ret := 1.000000 // buy
							if( ma > 213.208 )
								ret := 0.568182
				if( val > -0.098941 )
					if( priceRange <= 31.1208 )
						if( rangema <= 2.98141 )
							if( upperKC <= 216.997 )
								ret := 0.510574
							if( upperKC > 216.997 )
								ret := -0.400000
						if( rangema > 2.98141 )
							if( priceRange <= 2.73875 )
								ret := 0.454545
							if( priceRange > 2.73875 )
								ret := 0.897959 // buy
					if( priceRange > 31.1208 )
						ret := -1.000000 // sell
		if( lowerKC > 210.83 )
			if( dev <= 9.8906 )
				if( upperBB <= 216.85 )
					if( val <= 0.154986 )
						if( basis <= 214.401 )
							if( priceRange <= 0.645 )
								ret := 0.090909
							if( priceRange > 0.645 )
								ret := -0.696970
						if( basis > 214.401 )
							if( sqzOnInt <= 0.5 )
								ret := -1.000000 // sell
							if( sqzOnInt > 0.5 )
								ret := -0.666667
					if( val > 0.154986 )
						if( lowerKC <= 213.113 )
							if( basis <= 212.648 )
								ret := -0.750000 // sell
							if( basis > 212.648 )
								ret := 0.214286
						if( lowerKC > 213.113 )
							if( ma <= 214.367 )
								ret := -0.909091 // sell
							if( ma > 214.367 )
								ret := 0.000000
				if( upperBB > 216.85 )
					if( avgHighLow <= 306.794 )
						if( upperKC <= 289.785 )
							if( priceRange <= 6.7858 )
								ret := 0.004147
							if( priceRange > 6.7858 )
								ret := -0.376000
						if( upperKC > 289.785 )
							if( dev <= 8.88787 )
								ret := 0.834711 // buy
							if( dev > 8.88787 )
								ret := -0.052632
					if( avgHighLow > 306.794 )
						if( basis <= 305.798 )
							if( sqzOnInt <= 0.5 )
								ret := -0.888889 // sell
							if( sqzOnInt > 0.5 )
								ret := -0.375000
						if( basis > 305.798 )
							if( lowerBB <= 302.077 )
								ret := -0.900000 // sell
							if( lowerBB > 302.077 )
								ret := -1.000000 // sell
			if( dev > 9.8906 )
				if( dev <= 31.7298 )
					if( avgHighLow <= 226.485 )
						if( basis <= 224.779 )
							if( lowerKC <= 211.476 )
								ret := 0.500000
							if( lowerKC > 211.476 )
								ret := -0.681818
						if( basis > 224.779 )
							if( rangema <= 6.90916 )
								ret := 0.250000
							if( rangema > 6.90916 )
								ret := 0.869565 // buy
					if( avgHighLow > 226.485 )
						if( rangema <= 17.1285 )
							if( upperKC <= 315.873 )
								ret := -0.477658
							if( upperKC > 315.873 )
								ret := 0.327586
						if( rangema > 17.1285 )
							if( priceRange <= 34.6681 )
								ret := -0.946809 // sell
							if( priceRange > 34.6681 )
								ret := -0.230769
				if( dev > 31.7298 )
					if( sqzOnInt <= 0.5 )
						if( lowerBB <= 203.529 )
							ret := -1.000000 // sell
						if( lowerBB > 203.529 )
							if( lowerKC <= 234.099 )
								ret := 0.500000
							if( lowerKC > 234.099 )
								ret := -0.336634
					if( sqzOnInt > 0.5 )
						if( lowerBB <= 329.378 )
							if( rangema <= 43.1921 )
								ret := 0.886957 // buy
							if( rangema > 43.1921 )
								ret := -1.000000 // sell
						if( lowerBB > 329.378 )
							ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_GME_15Min_50de9d34(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)

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


