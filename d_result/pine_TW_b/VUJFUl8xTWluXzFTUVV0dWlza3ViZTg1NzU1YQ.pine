//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: UBER_1Min_1SQU_be85755a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UBER_1Min_1SQU_be85755a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UBER_1Min_be85755a(lowerBB, noSqzInt, avgHighLow, rangema, sqzOffInt, upperKC, ma, basis, val, sqzOnInt, dev, priceRange, lowerKC, upperBB)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( rangema <= 0.36203 )
		if( avgHighLow <= 62.7083 )
			if( avgHighLow <= 61.4366 )
				if( val <= 0.00898 )
					if( upperBB <= 58.1046 )
						if( upperKC <= 55.7483 )
							if( val <= -0.006607 )
								if( lowerKC <= 54.8007 )
									ret := -0.288889
								if( lowerKC > 54.8007 )
									ret := -1.000000 // sell
							if( val > -0.006607 )
								if( avgHighLow <= 55.2544 )
									ret := 0.882353 // buy
								if( avgHighLow > 55.2544 )
									ret := 0.500000
						if( upperKC > 55.7483 )
							if( basis <= 56.9064 )
								if( lowerKC <= 56.5391 )
									ret := 0.490000
								if( lowerKC > 56.5391 )
									ret := 0.985714 // buy
							if( basis > 56.9064 )
								if( ma <= 57.701 )
									ret := -0.345455
								if( ma > 57.701 )
									ret := 0.650000
					if( upperBB > 58.1046 )
						if( upperKC <= 58.2084 )
							if( basis <= 57.9825 )
								ret := 0.000000
							if( basis > 57.9825 )
								if( avgHighLow <= 58.0901 )
									ret := -0.923077 // sell
								if( avgHighLow > 58.0901 )
									ret := -1.000000 // sell
						if( upperKC > 58.2084 )
							if( avgHighLow <= 58.0537 )
								if( lowerKC <= 57.8818 )
									ret := 0.692308
								if( lowerKC > 57.8818 )
									ret := 1.000000 // buy
							if( avgHighLow > 58.0537 )
								if( lowerKC <= 61.3021 )
									ret := 0.043648
								if( lowerKC > 61.3021 )
									ret := -0.684211
				if( val > 0.00898 )
					if( basis <= 59.9419 )
						if( priceRange <= 0.086989 )
							if( upperBB <= 55.2718 )
								if( upperBB <= 54.6214 )
									ret := -0.866667 // sell
								if( upperBB > 54.6214 )
									ret := 0.800000 // buy
							if( upperBB > 55.2718 )
								if( basis <= 56.842 )
									ret := -1.000000 // sell
								if( basis > 56.842 )
									ret := -0.558824
						if( priceRange > 0.086989 )
							if( dev <= 0.147059 )
								if( dev <= 0.100552 )
									ret := 0.941176 // buy
								if( dev > 0.100552 )
									ret := 0.615385
							if( dev > 0.147059 )
								if( lowerKC <= 53.4139 )
									ret := 0.777778 // buy
								if( lowerKC > 53.4139 )
									ret := -0.371571
					if( basis > 59.9419 )
						if( avgHighLow <= 60.0195 )
							if( upperBB <= 60.2706 )
								ret := 0.666667
							if( upperBB > 60.2706 )
								ret := -1.000000 // sell
						if( avgHighLow > 60.0195 )
							if( basis <= 59.9766 )
								ret := 1.000000 // buy
							if( basis > 59.9766 )
								if( sqzOffInt <= 0.5 )
									ret := -0.800000 // sell
								if( sqzOffInt > 0.5 )
									ret := 0.339286
			if( avgHighLow > 61.4366 )
				if( upperBB <= 61.6454 )
					if( ma <= 61.4891 )
						ret := -0.333333
					if( ma > 61.4891 )
						ret := -1.000000 // sell
				if( upperBB > 61.6454 )
					if( val <= 0.025436 )
						if( lowerKC <= 61.3927 )
							if( val <= -0.001775 )
								ret := 0.941176 // buy
							if( val > -0.001775 )
								if( ma <= 61.5009 )
									ret := -0.235294
								if( ma > 61.5009 )
									ret := 0.000000
						if( lowerKC > 61.3927 )
							if( priceRange <= 0.06995 )
								if( lowerBB <= 62.3675 )
									ret := -0.714286 // sell
								if( lowerBB > 62.3675 )
									ret := 0.285714
							if( priceRange > 0.06995 )
								if( ma <= 62.6022 )
									ret := -0.234921
								if( ma > 62.6022 )
									ret := -0.750000 // sell
					if( val > 0.025436 )
						if( upperKC <= 61.6853 )
							ret := -1.000000 // sell
						if( upperKC > 61.6853 )
							if( rangema <= 0.109075 )
								ret := 1.000000 // buy
							if( rangema > 0.109075 )
								if( avgHighLow <= 61.5431 )
									ret := 0.909091 // buy
								if( avgHighLow > 61.5431 )
									ret := -0.105263
		if( avgHighLow > 62.7083 )
			if( basis <= 63.0121 )
				if( lowerKC <= 62.7065 )
					if( dev <= 0.323727 )
						if( avgHighLow <= 62.8972 )
							if( dev <= 0.249268 )
								if( avgHighLow <= 62.8192 )
									ret := 0.947368 // buy
								if( avgHighLow > 62.8192 )
									ret := 0.428571
							if( dev > 0.249268 )
								ret := 1.000000 // buy
						if( avgHighLow > 62.8972 )
							if( val <= -0.000158 )
								ret := 1.000000 // buy
							if( val > -0.000158 )
								if( basis <= 62.8297 )
									ret := 0.923077 // buy
								if( basis > 62.8297 )
									ret := -0.375000
					if( dev > 0.323727 )
						ret := 0.166667
				if( lowerKC > 62.7065 )
					if( rangema <= 0.115777 )
						if( dev <= 0.227705 )
							if( dev <= 0.060166 )
								ret := 1.000000 // buy
							if( dev > 0.060166 )
								if( rangema <= 0.07794 )
									ret := 0.041667
								if( rangema > 0.07794 )
									ret := -0.333333
						if( dev > 0.227705 )
							ret := 1.000000 // buy
					if( rangema > 0.115777 )
						if( upperKC <= 63.2139 )
							if( val <= 0.012953 )
								ret := -0.636364
							if( val > 0.012953 )
								ret := -1.000000 // sell
						if( upperKC > 63.2139 )
							ret := 1.000000 // buy
			if( basis > 63.0121 )
				if( dev <= 0.592467 )
					if( priceRange <= 0.74215 )
						if( upperBB <= 63.2626 )
							if( val <= -0.000631 )
								ret := -0.428571
							if( val > -0.000631 )
								if( priceRange <= 0.089107 )
									ret := 0.622754
								if( priceRange > 0.089107 )
									ret := -0.157895
						if( upperBB > 63.2626 )
							if( rangema <= 0.02382 )
								if( priceRange <= 0.010036 )
									ret := 0.108333
								if( priceRange > 0.010036 )
									ret := 0.507937
							if( rangema > 0.02382 )
								if( upperBB <= 86.7376 )
									ret := -0.002194
								if( upperBB > 86.7376 )
									ret := -0.816667 // sell
					if( priceRange > 0.74215 )
						if( upperKC <= 76.8548 )
							if( basis <= 65.9298 )
								if( avgHighLow <= 64.931 )
									ret := -0.545455
								if( avgHighLow > 64.931 )
									ret := 0.000000
							if( basis > 65.9298 )
								if( upperBB <= 72.9505 )
									ret := 0.790000 // buy
								if( upperBB > 72.9505 )
									ret := 0.333333
						if( upperKC > 76.8548 )
							ret := -0.615385
				if( dev > 0.592467 )
					if( avgHighLow <= 68.2058 )
						if( rangema <= 0.293234 )
							if( priceRange <= 0.151332 )
								if( dev <= 0.730735 )
									ret := 0.588235
								if( dev > 0.730735 )
									ret := -0.838710 // sell
							if( priceRange > 0.151332 )
								if( lowerKC <= 65.1972 )
									ret := -0.539326
								if( lowerKC > 65.1972 )
									ret := 0.042553
						if( rangema > 0.293234 )
							if( ma <= 67.1806 )
								if( upperBB <= 66.6567 )
									ret := 0.565217
								if( upperBB > 66.6567 )
									ret := 0.937500 // buy
							if( ma > 67.1806 )
								ret := 0.058824
					if( avgHighLow > 68.2058 )
						if( dev <= 0.931126 )
							if( priceRange <= 0.220182 )
								if( dev <= 0.718107 )
									ret := -0.600000
								if( dev > 0.718107 )
									ret := -0.255639
							if( priceRange > 0.220182 )
								if( lowerKC <= 68.3063 )
									ret := 0.142857
								if( lowerKC > 68.3063 )
									ret := -0.732673 // sell
						if( dev > 0.931126 )
							if( lowerKC <= 71.9546 )
								if( basis <= 70.3462 )
									ret := -0.558140
								if( basis > 70.3462 )
									ret := -1.000000 // sell
							if( lowerKC > 71.9546 )
								if( val <= 0.056702 )
									ret := 0.270270
								if( val > 0.056702 )
									ret := 0.975610 // buy
	if( rangema > 0.36203 )
		if( avgHighLow <= 68.0623 )
			if( dev <= 0.944108 )
				if( val <= -0.005841 )
					if( val <= -0.02903 )
						ret := 0.631579
					if( val > -0.02903 )
						if( ma <= 63.7492 )
							ret := -0.666667
						if( ma > 63.7492 )
							if( lowerKC <= 64.2634 )
								ret := 1.000000 // buy
							if( lowerKC > 64.2634 )
								ret := -0.227273
				if( val > -0.005841 )
					if( upperKC <= 68.0225 )
						if( lowerBB <= 61.5298 )
							if( priceRange <= 0.509934 )
								if( lowerBB <= 60.9116 )
									ret := 0.839416 // buy
								if( lowerBB > 60.9116 )
									ret := -0.055556
							if( priceRange > 0.509934 )
								ret := -0.454545
						if( lowerBB > 61.5298 )
							if( lowerKC <= 65.8741 )
								ret := 1.000000 // buy
							if( lowerKC > 65.8741 )
								ret := 0.909091 // buy
					if( upperKC > 68.0225 )
						ret := -0.555556
			if( dev > 0.944108 )
				if( upperKC <= 68.6486 )
					if( basis <= 62.3235 )
						if( lowerKC <= 57.7293 )
							if( dev <= 2.37989 )
								ret := 0.705882 // buy
							if( dev > 2.37989 )
								ret := 1.000000 // buy
						if( lowerKC > 57.7293 )
							if( basis <= 58.9189 )
								ret := -0.750000 // sell
							if( basis > 58.9189 )
								if( lowerKC <= 60.4811 )
									ret := 1.000000 // buy
								if( lowerKC > 60.4811 )
									ret := 0.727273 // buy
					if( basis > 62.3235 )
						if( rangema <= 0.605427 )
							if( ma <= 65.2953 )
								ret := -1.000000 // sell
							if( ma > 65.2953 )
								ret := 0.642857
						if( rangema > 0.605427 )
							ret := -1.000000 // sell
				if( upperKC > 68.6486 )
					if( upperKC <= 71.3062 )
						if( val <= -0.09883 )
							ret := 1.000000 // buy
						if( val > -0.09883 )
							if( ma <= 68.4645 )
								ret := 1.000000 // buy
							if( ma > 68.4645 )
								ret := 0.777778 // buy
					if( upperKC > 71.3062 )
						ret := 0.111111
		if( avgHighLow > 68.0623 )
			if( basis <= 71.3678 )
				if( rangema <= 0.6788 )
					if( avgHighLow <= 71.5946 )
						if( lowerBB <= 67.1542 )
							if( ma <= 67.6255 )
								if( lowerBB <= 66.4348 )
									ret := -0.750000 // sell
								if( lowerBB > 66.4348 )
									ret := -0.071429
							if( ma > 67.6255 )
								if( ma <= 67.7622 )
									ret := -1.000000 // sell
								if( ma > 67.7622 )
									ret := -0.500000
						if( lowerBB > 67.1542 )
							if( lowerKC <= 67.412 )
								if( avgHighLow <= 68.252 )
									ret := 1.000000 // buy
								if( avgHighLow > 68.252 )
									ret := 0.500000
							if( lowerKC > 67.412 )
								if( upperKC <= 71.441 )
									ret := -1.000000 // sell
								if( upperKC > 71.441 )
									ret := 0.066667
					if( avgHighLow > 71.5946 )
						if( upperKC <= 71.9596 )
							ret := -1.000000 // sell
						if( upperKC > 71.9596 )
							ret := -0.888889 // sell
				if( rangema > 0.6788 )
					if( basis <= 66.0811 )
						ret := -0.200000
					if( basis > 66.0811 )
						if( lowerBB <= 67.0647 )
							ret := -1.000000 // sell
						if( lowerBB > 67.0647 )
							ret := -0.857143 // sell
			if( basis > 71.3678 )
				if( dev <= 0.63222 )
					if( upperBB <= 72.7073 )
						if( basis <= 71.7651 )
							ret := -0.600000
						if( basis > 71.7651 )
							if( dev <= 0.512589 )
								ret := 0.750000 // buy
							if( dev > 0.512589 )
								ret := 0.615385
					if( upperBB > 72.7073 )
						if( ma <= 72.1398 )
							ret := 0.083333
						if( ma > 72.1398 )
							ret := -1.000000 // sell
				if( dev > 0.63222 )
					if( avgHighLow <= 80.8729 )
						if( lowerBB <= 71.4723 )
							if( lowerBB <= 69.5581 )
								ret := 0.428571
							if( lowerBB > 69.5581 )
								if( upperKC <= 72.2428 )
									ret := 0.888889 // buy
								if( upperKC > 72.2428 )
									ret := 1.000000 // buy
						if( lowerBB > 71.4723 )
							if( val <= 0.032808 )
								if( ma <= 73.4102 )
									ret := -0.416667
								if( ma > 73.4102 )
									ret := 0.285714
							if( val > 0.032808 )
								ret := -0.466667
					if( avgHighLow > 80.8729 )
						ret := 1.000000 // buy
	
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
float op_operation = decision_tree_0_UBER_1Min_be85755a(lowerBB, noSqzInt, avgHighLow, rangema, sqzOffInt, upperKC, ma, basis, val, sqzOnInt, dev, priceRange, lowerKC, upperBB)

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


