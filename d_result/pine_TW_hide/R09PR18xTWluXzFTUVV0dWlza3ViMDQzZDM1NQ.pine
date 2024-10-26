//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: GOOG_1Min_1SQU_b043d355 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GOOG_1Min_1SQU_b043d355", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GOOG_1Min_b043d355(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( val <= 0.015717 )
		if( rangema <= 0.111516 )
			if( upperKC <= 156.539 )
				if( lowerKC <= 149.548 )
					if( rangema <= 0.100125 )
						if( lowerBB <= 149.299 )
							if( ma <= 149.041 )
								ret := -0.636364
							if( ma > 149.041 )
								ret := -0.968750 // sell
						if( lowerBB > 149.299 )
							ret := -0.142857
					if( rangema > 0.100125 )
						if( dev <= 0.329279 )
							if( priceRange <= 0.085239 )
								ret := 0.285714
							if( priceRange > 0.085239 )
								ret := -0.714286 // sell
						if( dev > 0.329279 )
							ret := 0.571429
				if( lowerKC > 149.548 )
					if( val <= 0.00452 )
						if( lowerBB <= 155.012 )
							if( lowerKC <= 153.697 )
								ret := 0.145861
							if( lowerKC > 153.697 )
								ret := 0.607362
						if( lowerBB > 155.012 )
							if( avgHighLow <= 156.216 )
								ret := -0.259804
							if( avgHighLow > 156.216 )
								ret := 0.655172
					if( val > 0.00452 )
						if( basis <= 155.523 )
							if( dev <= 0.131526 )
								ret := 0.445946
							if( dev > 0.131526 )
								ret := 0.040230
						if( basis > 155.523 )
							if( dev <= 0.242992 )
								ret := 0.864078 // buy
							if( dev > 0.242992 )
								ret := 0.481481
			if( upperKC > 156.539 )
				if( lowerBB <= 156.966 )
					if( val <= 0.011851 )
						if( lowerBB <= 156.833 )
							if( val <= -0.001878 )
								ret := -0.027586
							if( val > -0.001878 )
								ret := -0.460870
						if( lowerBB > 156.833 )
							if( rangema <= 0.083829 )
								ret := -0.951220 // sell
							if( rangema > 0.083829 )
								ret := 0.058824
					if( val > 0.011851 )
						if( priceRange <= 0.091182 )
							ret := 0.166667
						if( priceRange > 0.091182 )
							ret := 0.923077 // buy
				if( lowerBB > 156.966 )
					if( lowerBB <= 157.729 )
						if( avgHighLow <= 157.776 )
							if( upperKC <= 157.31 )
								ret := 0.944444 // buy
							if( upperKC > 157.31 )
								ret := 0.020325
						if( avgHighLow > 157.776 )
							if( priceRange <= 0.006645 )
								ret := -0.125000
							if( priceRange > 0.006645 )
								ret := 0.600000
					if( lowerBB > 157.729 )
						if( upperBB <= 159.281 )
							if( avgHighLow <= 158.907 )
								ret := -0.025306
							if( avgHighLow > 158.907 )
								ret := -0.542484
						if( upperBB > 159.281 )
							if( avgHighLow <= 159.502 )
								ret := 0.530303
							if( avgHighLow > 159.502 )
								ret := 0.033177
		if( rangema > 0.111516 )
			if( lowerBB <= 185.253 )
				if( rangema <= 0.299199 )
					if( upperBB <= 185.49 )
						if( dev <= 0.794445 )
							if( rangema <= 0.224543 )
								ret := 0.082278
							if( rangema > 0.224543 )
								ret := 0.176128
						if( dev > 0.794445 )
							if( basis <= 170.52 )
								ret := 0.111111
							if( basis > 170.52 )
								ret := 0.688372
					if( upperBB > 185.49 )
						if( lowerKC <= 185.168 )
							if( priceRange <= 1.0999 )
								ret := 0.716763 // buy
							if( priceRange > 1.0999 )
								ret := -0.714286 // sell
						if( lowerKC > 185.168 )
							if( priceRange <= 0.210622 )
								ret := -0.189189
							if( priceRange > 0.210622 )
								ret := 0.785714 // buy
				if( rangema > 0.299199 )
					if( sqzOffInt <= 0.5 )
						if( upperKC <= 155.191 )
							if( rangema <= 0.378405 )
								ret := 0.518519
							if( rangema > 0.378405 )
								ret := 0.962963 // buy
						if( upperKC > 155.191 )
							if( lowerBB <= 157.685 )
								ret := -0.482353
							if( lowerBB > 157.685 )
								ret := 0.111607
					if( sqzOffInt > 0.5 )
						if( upperBB <= 161.425 )
							if( upperKC <= 158.366 )
								ret := -0.386667
							if( upperKC > 158.366 )
								ret := 0.461957
						if( upperBB > 161.425 )
							if( upperBB <= 170.73 )
								ret := -0.263386
							if( upperBB > 170.73 )
								ret := -0.040362
			if( lowerBB > 185.253 )
				if( priceRange <= 0.090274 )
					if( basis <= 188.7 )
						if( upperBB <= 188.56 )
							if( lowerBB <= 187.884 )
								ret := 0.042781
							if( lowerBB > 187.884 )
								ret := 0.857143 // buy
						if( upperBB > 188.56 )
							if( lowerBB <= 188.03 )
								ret := -1.000000 // sell
							if( lowerBB > 188.03 )
								ret := -0.466667
					if( basis > 188.7 )
						if( lowerBB <= 188.657 )
							if( dev <= 0.247835 )
								ret := 0.500000
							if( dev > 0.247835 )
								ret := 0.888889 // buy
						if( lowerBB > 188.657 )
							if( lowerBB <= 189.08 )
								ret := -0.416667
							if( lowerBB > 189.08 )
								ret := 0.365854
				if( priceRange > 0.090274 )
					if( rangema <= 0.218504 )
						if( val <= -0.040129 )
							if( upperBB <= 187.711 )
								ret := 0.882353 // buy
							if( upperBB > 187.711 )
								ret := 0.020833
						if( val > -0.040129 )
							if( dev <= 0.458031 )
								ret := -0.143975
							if( dev > 0.458031 )
								ret := -0.519685
					if( rangema > 0.218504 )
						if( rangema <= 0.262449 )
							if( val <= -0.053149 )
								ret := 0.926829 // buy
							if( val > -0.053149 )
								ret := 0.119658
						if( rangema > 0.262449 )
							if( avgHighLow <= 189.267 )
								ret := 0.111111
							if( avgHighLow > 189.267 )
								ret := -0.489130
	if( val > 0.015717 )
		if( upperBB <= 149.628 )
			if( rangema <= 0.127567 )
				ret := -0.375000
			if( rangema > 0.127567 )
				if( val <= 0.034082 )
					if( avgHighLow <= 148.999 )
						ret := 1.000000 // buy
					if( avgHighLow > 148.999 )
						ret := 0.714286 // buy
				if( val > 0.034082 )
					if( upperBB <= 149.311 )
						ret := -0.250000
					if( upperBB > 149.311 )
						if( val <= 0.036984 )
							ret := 1.000000 // buy
						if( val > 0.036984 )
							ret := 0.583333
		if( upperBB > 149.628 )
			if( upperBB <= 177.398 )
				if( ma <= 172.05 )
					if( avgHighLow <= 171.217 )
						if( lowerBB <= 169.509 )
							if( upperKC <= 170.6 )
								ret := -0.006861
							if( upperKC > 170.6 )
								ret := -0.933333 // sell
						if( lowerBB > 169.509 )
							if( dev <= 0.618715 )
								ret := 0.146998
							if( dev > 0.618715 )
								ret := 0.869565 // buy
					if( avgHighLow > 171.217 )
						if( dev <= 0.411349 )
							if( upperBB <= 171.565 )
								ret := -0.519231
							if( upperBB > 171.565 )
								ret := -0.055866
						if( dev > 0.411349 )
							if( priceRange <= 0.253212 )
								ret := -0.765306 // sell
							if( priceRange > 0.253212 )
								ret := -0.342593
				if( ma > 172.05 )
					if( lowerBB <= 171.845 )
						if( upperKC <= 172.876 )
							if( avgHighLow <= 172.208 )
								ret := 0.875000 // buy
							if( avgHighLow > 172.208 )
								ret := 0.062500
						if( upperKC > 172.876 )
							if( lowerBB <= 171.822 )
								ret := 0.958904 // buy
							if( lowerBB > 171.822 )
								ret := 0.428571
					if( lowerBB > 171.845 )
						if( upperKC <= 173.858 )
							if( rangema <= 0.312496 )
								ret := 0.288431
							if( rangema > 0.312496 )
								ret := -0.227273
						if( upperKC > 173.858 )
							if( avgHighLow <= 176.745 )
								ret := -0.032587
							if( avgHighLow > 176.745 )
								ret := 0.333333
			if( upperBB > 177.398 )
				if( lowerBB <= 177.042 )
					if( upperKC <= 177.504 )
						if( val <= 0.023982 )
							if( upperBB <= 177.559 )
								ret := -0.241379
							if( upperBB > 177.559 )
								ret := 0.800000 // buy
						if( val > 0.023982 )
							if( lowerKC <= 168.601 )
								ret := 0.100000
							if( lowerKC > 168.601 )
								ret := -0.598425
					if( upperKC > 177.504 )
						if( val <= 0.065691 )
							if( val <= 0.034089 )
								ret := -0.724638 // sell
							if( val > 0.034089 )
								ret := -0.943396 // sell
						if( val > 0.065691 )
							ret := 0.000000
				if( lowerBB > 177.042 )
					if( dev <= 0.980099 )
						if( dev <= 0.728461 )
							if( rangema <= 0.238908 )
								ret := -0.045060
							if( rangema > 0.238908 )
								ret := 0.237197
						if( dev > 0.728461 )
							if( lowerBB <= 177.942 )
								ret := 0.666667
							if( lowerBB > 177.942 )
								ret := -0.446602
					if( dev > 0.980099 )
						if( upperBB <= 181.623 )
							ret := -0.666667
						if( upperBB > 181.623 )
							if( val <= 0.081096 )
								ret := 0.626374
							if( val > 0.081096 )
								ret := -0.023810
	
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
float op_operation = decision_tree_0_GOOG_1Min_b043d355(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)

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


