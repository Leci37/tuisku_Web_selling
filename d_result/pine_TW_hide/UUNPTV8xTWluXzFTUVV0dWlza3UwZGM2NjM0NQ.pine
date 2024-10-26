//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: QCOM_1Min_1SQU_0dc66345 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_QCOM_1Min_1SQU_0dc66345", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_QCOM_1Min_0dc66345(lowerBB, noSqzInt, avgHighLow, rangema, sqzOffInt, upperKC, ma, basis, val, sqzOnInt, dev, priceRange, lowerKC, upperBB)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( lowerBB <= 157.615 )
		if( avgHighLow <= 150.291 )
			if( rangema <= 0.527016 )
				if( priceRange <= 0.345 )
					if( dev <= 1.52893 )
						ret := 1.000000 // buy
					if( dev > 1.52893 )
						ret := 0.750000 // buy
				if( priceRange > 0.345 )
					if( basis <= 148.93 )
						if( lowerBB <= 146.66 )
							ret := 0.833333 // buy
						if( lowerBB > 146.66 )
							ret := 1.000000 // buy
					if( basis > 148.93 )
						if( upperKC <= 150.213 )
							ret := -0.500000
						if( upperKC > 150.213 )
							if( lowerKC <= 149.713 )
								ret := 1.000000 // buy
							if( lowerKC > 149.713 )
								ret := 0.500000
			if( rangema > 0.527016 )
				ret := -0.857143 // sell
		if( avgHighLow > 150.291 )
			if( basis <= 150.864 )
				if( priceRange <= 2.44093 )
					if( upperKC <= 151.163 )
						if( rangema <= 0.211527 )
							ret := -0.500000
						if( rangema > 0.211527 )
							if( lowerBB <= 149.824 )
								ret := -1.000000 // sell
							if( lowerBB > 149.824 )
								if( basis <= 150.677 )
									ret := -0.750000 // sell
								if( basis > 150.677 )
									ret := -1.000000 // sell
					if( upperKC > 151.163 )
						if( basis <= 150.799 )
							ret := -0.142857
						if( basis > 150.799 )
							ret := -1.000000 // sell
				if( priceRange > 2.44093 )
					ret := 0.500000
			if( basis > 150.864 )
				if( val <= -0.008214 )
					if( upperKC <= 159.435 )
						if( rangema <= 0.327263 )
							if( avgHighLow <= 157.841 )
								if( dev <= 0.79899 )
									ret := 0.576642
								if( dev > 0.79899 )
									ret := -0.250000
							if( avgHighLow > 157.841 )
								if( lowerKC <= 157.892 )
									ret := -0.543478
								if( lowerKC > 157.892 )
									ret := 0.692308
						if( rangema > 0.327263 )
							if( priceRange <= 0.64102 )
								if( avgHighLow <= 157.743 )
									ret := 0.912698 // buy
								if( avgHighLow > 157.743 )
									ret := 0.633663
							if( priceRange > 0.64102 )
								if( val <= -0.090295 )
									ret := 1.000000 // buy
								if( val > -0.090295 )
									ret := 0.148649
					if( upperKC > 159.435 )
						if( avgHighLow <= 159.311 )
							if( upperKC <= 159.772 )
								if( avgHighLow <= 158.339 )
									ret := -0.750000 // sell
								if( avgHighLow > 158.339 )
									ret := -1.000000 // sell
							if( upperKC > 159.772 )
								if( priceRange <= 0.409508 )
									ret := -1.000000 // sell
								if( priceRange > 0.409508 )
									ret := -0.333333
						if( avgHighLow > 159.311 )
							ret := 1.000000 // buy
				if( val > -0.008214 )
					if( upperBB <= 156.839 )
						if( lowerKC <= 150.833 )
							if( upperKC <= 152.797 )
								if( rangema <= 0.406846 )
									ret := 1.000000 // buy
								if( rangema > 0.406846 )
									ret := -0.600000
							if( upperKC > 152.797 )
								if( lowerBB <= 150.527 )
									ret := 1.000000 // buy
								if( lowerBB > 150.527 )
									ret := 0.500000
						if( lowerKC > 150.833 )
							if( upperBB <= 156.49 )
								if( upperBB <= 156.333 )
									ret := -0.705882 // sell
								if( upperBB > 156.333 )
									ret := 0.551020
							if( upperBB > 156.49 )
								if( lowerKC <= 155.678 )
									ret := -0.974359 // sell
								if( lowerKC > 155.678 )
									ret := -0.714286 // sell
					if( upperBB > 156.839 )
						if( upperKC <= 157.295 )
							if( ma <= 153.881 )
								ret := -1.000000 // sell
							if( ma > 153.881 )
								if( val <= 0.07592 )
									ret := 0.821053 // buy
								if( val > 0.07592 )
									ret := -0.052632
						if( upperKC > 157.295 )
							if( avgHighLow <= 157.51 )
								if( upperBB <= 157.662 )
									ret := 0.241758
								if( upperBB > 157.662 )
									ret := -0.594937
							if( avgHighLow > 157.51 )
								if( avgHighLow <= 157.833 )
									ret := 0.460317
								if( avgHighLow > 157.833 )
									ret := 0.161125
	if( lowerBB > 157.615 )
		if( val <= 0.083736 )
			if( rangema <= 0.741902 )
				if( basis <= 229.309 )
					if( ma <= 158.91 )
						if( avgHighLow <= 158.723 )
							if( lowerBB <= 158.307 )
								if( lowerKC <= 158.359 )
									ret := -0.078049
								if( lowerKC > 158.359 )
									ret := -0.735294 // sell
							if( lowerBB > 158.307 )
								if( rangema <= 0.253192 )
									ret := 0.378378
								if( rangema > 0.253192 )
									ret := 1.000000 // buy
						if( avgHighLow > 158.723 )
							if( lowerKC <= 158.278 )
								if( val <= -0.030376 )
									ret := -1.000000 // sell
								if( val > -0.030376 )
									ret := 0.340909
							if( lowerKC > 158.278 )
								if( dev <= 0.304216 )
									ret := -0.259259
								if( dev > 0.304216 )
									ret := -0.817391 // sell
					if( ma > 158.91 )
						if( avgHighLow <= 165.715 )
							if( upperKC <= 165.833 )
								if( upperBB <= 159.331 )
									ret := 0.727273 // buy
								if( upperBB > 159.331 )
									ret := 0.087036
							if( upperKC > 165.833 )
								if( lowerBB <= 165.195 )
									ret := 0.617564
								if( lowerBB > 165.195 )
									ret := 0.036082
						if( avgHighLow > 165.715 )
							if( lowerKC <= 165.328 )
								if( upperBB <= 166.535 )
									ret := -0.740385 // sell
								if( upperBB > 166.535 )
									ret := 0.142857
							if( lowerKC > 165.328 )
								if( rangema <= 0.585339 )
									ret := 0.040167
								if( rangema > 0.585339 )
									ret := 0.271205
				if( basis > 229.309 )
					if( lowerBB <= 228.65 )
						if( basis <= 229.583 )
							if( priceRange <= 0.30873 )
								ret := 0.400000
							if( priceRange > 0.30873 )
								if( lowerBB <= 228.594 )
									ret := 1.000000 // buy
								if( lowerBB > 228.594 )
									ret := 0.750000 // buy
						if( basis > 229.583 )
							ret := -0.571429
					if( lowerBB > 228.65 )
						if( dev <= 0.418101 )
							if( dev <= 0.390315 )
								if( avgHighLow <= 229.34 )
									ret := -0.900000 // sell
								if( avgHighLow > 229.34 )
									ret := -0.363636
							if( dev > 0.390315 )
								if( avgHighLow <= 229.418 )
									ret := -0.454545
								if( avgHighLow > 229.418 )
									ret := 0.428571
						if( dev > 0.418101 )
							if( val <= -0.085953 )
								if( rangema <= 0.33254 )
									ret := 0.166667
								if( rangema > 0.33254 )
									ret := -0.625000
							if( val > -0.085953 )
								if( ma <= 229.346 )
									ret := -0.375000
								if( ma > 229.346 )
									ret := -0.914286 // sell
			if( rangema > 0.741902 )
				if( dev <= 5.61179 )
					if( val <= -0.133401 )
						if( avgHighLow <= 187.344 )
							if( dev <= 1.18935 )
								if( priceRange <= 0.857756 )
									ret := -1.000000 // sell
								if( priceRange > 0.857756 )
									ret := 0.750000 // buy
							if( dev > 1.18935 )
								if( priceRange <= 1.98975 )
									ret := -1.000000 // sell
								if( priceRange > 1.98975 )
									ret := -0.833333 // sell
						if( avgHighLow > 187.344 )
							if( rangema <= 2.42707 )
								if( val <= -0.160259 )
									ret := -0.357143
								if( val > -0.160259 )
									ret := 0.500000
							if( rangema > 2.42707 )
								ret := 0.666667
					if( val > -0.133401 )
						if( dev <= 2.82557 )
							if( rangema <= 1.39274 )
								if( rangema <= 1.17445 )
									ret := -0.250000
								if( rangema > 1.17445 )
									ret := 0.372093
							if( rangema > 1.39274 )
								if( lowerKC <= 165.464 )
									ret := 0.600000
								if( lowerKC > 165.464 )
									ret := -0.792453 // sell
						if( dev > 2.82557 )
							if( dev <= 3.83593 )
								if( upperKC <= 170.622 )
									ret := -0.142857
								if( upperKC > 170.622 )
									ret := 0.800000 // buy
							if( dev > 3.83593 )
								if( priceRange <= 0.565555 )
									ret := -0.166667
								if( priceRange > 0.565555 )
									ret := -0.800000 // sell
				if( dev > 5.61179 )
					if( basis <= 184.226 )
						ret := 0.500000
					if( basis > 184.226 )
						ret := 1.000000 // buy
		if( val > 0.083736 )
			if( dev <= 0.535839 )
				if( upperBB <= 170.367 )
					if( basis <= 159.209 )
						ret := 0.600000
					if( basis > 159.209 )
						if( priceRange <= 0.576696 )
							if( rangema <= 0.357267 )
								if( priceRange <= 0.3175 )
									ret := -0.804878 // sell
								if( priceRange > 0.3175 )
									ret := 0.000000
							if( rangema > 0.357267 )
								if( upperKC <= 166.921 )
									ret := -1.000000 // sell
								if( upperKC > 166.921 )
									ret := -0.750000 // sell
						if( priceRange > 0.576696 )
							ret := 0.250000
				if( upperBB > 170.367 )
					if( upperKC <= 217.658 )
						if( basis <= 213.948 )
							if( priceRange <= 0.222933 )
								if( lowerBB <= 205.511 )
									ret := 0.190476
								if( lowerBB > 205.511 )
									ret := -0.750000 // sell
							if( priceRange > 0.222933 )
								if( dev <= 0.485064 )
									ret := -0.888889 // sell
								if( dev > 0.485064 )
									ret := -0.300000
						if( basis > 213.948 )
							if( dev <= 0.346135 )
								ret := 1.000000 // buy
							if( dev > 0.346135 )
								if( val <= 0.090794 )
									ret := 1.000000 // buy
								if( val > 0.090794 )
									ret := 0.111111
					if( upperKC > 217.658 )
						ret := -1.000000 // sell
			if( dev > 0.535839 )
				if( rangema <= 2.21886 )
					if( val <= 0.205465 )
						if( rangema <= 1.60299 )
							if( priceRange <= 0.119312 )
								if( upperBB <= 170.992 )
									ret := -0.750000 // sell
								if( upperBB > 170.992 )
									ret := -0.165289
							if( priceRange > 0.119312 )
								if( lowerKC <= 158.089 )
									ret := 0.705882 // buy
								if( lowerKC > 158.089 )
									ret := -0.060372
						if( rangema > 1.60299 )
							if( sqzOffInt <= 0.5 )
								ret := 1.000000 // buy
							if( sqzOffInt > 0.5 )
								ret := -0.500000
					if( val > 0.205465 )
						if( dev <= 1.46482 )
							ret := 0.250000
						if( dev > 1.46482 )
							if( priceRange <= 0.42 )
								ret := -0.400000
							if( priceRange > 0.42 )
								if( dev <= 2.73209 )
									ret := -0.916667 // sell
								if( dev > 2.73209 )
									ret := -1.000000 // sell
				if( rangema > 2.21886 )
					if( val <= 0.356152 )
						if( avgHighLow <= 186.617 )
							ret := 0.600000
						if( avgHighLow > 186.617 )
							ret := 1.000000 // buy
					if( val > 0.356152 )
						ret := 0.000000
	
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
float op_operation = decision_tree_0_QCOM_1Min_0dc66345(lowerBB, noSqzInt, avgHighLow, rangema, sqzOffInt, upperKC, ma, basis, val, sqzOnInt, dev, priceRange, lowerKC, upperBB)

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


