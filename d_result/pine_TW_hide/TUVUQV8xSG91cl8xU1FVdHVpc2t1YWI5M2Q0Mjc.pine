//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: META_1Hour_1SQU_ab93d427 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_META_1Hour_1SQU_ab93d427", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_META_1Hour_ab93d427(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( lowerBB <= 144.439 )
		if( upperBB <= 146.269 )
			if( upperBB <= 140.434 )
				if( ma <= 135.159 )
					if( upperBB <= 135.238 )
						if( val <= -0.252438 )
							ret := 0.750000 // buy
						if( val > -0.252438 )
							ret := 0.102517
					if( upperBB > 135.238 )
						if( lowerKC <= 131.657 )
							ret := -0.585586
						if( lowerKC > 131.657 )
							ret := 0.206349
				if( ma > 135.159 )
					if( rangema <= 1.50099 )
						if( upperKC <= 140.66 )
							ret := 0.600000
						if( upperKC > 140.66 )
							ret := -0.500000
					if( rangema > 1.50099 )
						if( lowerKC <= 134.1 )
							ret := 1.000000 // buy
						if( lowerKC > 134.1 )
							ret := -0.923077 // sell
			if( upperBB > 140.434 )
				if( avgHighLow <= 137.414 )
					if( upperBB <= 141.257 )
						if( upperKC <= 138.155 )
							ret := -0.800000 // sell
						if( upperKC > 138.155 )
							ret := 0.117647
					if( upperBB > 141.257 )
						if( dev <= 3.33661 )
							ret := -0.500000
						if( dev > 3.33661 )
							ret := -0.986486 // sell
				if( avgHighLow > 137.414 )
					if( lowerBB <= 134.784 )
						if( dev <= 5.94029 )
							ret := 1.000000 // buy
						if( dev > 5.94029 )
							ret := 0.000000
					if( lowerBB > 134.784 )
						if( dev <= 2.89992 )
							ret := -0.053779
						if( dev > 2.89992 )
							ret := -0.827586 // sell
		if( upperBB > 146.269 )
			if( rangema <= 0.785237 )
				ret := -1.000000 // sell
			if( rangema > 0.785237 )
				if( avgHighLow <= 149.705 )
					if( ma <= 147.32 )
						if( dev <= 6.8268 )
							ret := 0.652695
						if( dev > 6.8268 )
							ret := -1.000000 // sell
					if( ma > 147.32 )
						if( basis <= 149.034 )
							ret := -0.794118 // sell
						if( basis > 149.034 )
							ret := 0.833333 // buy
				if( avgHighLow > 149.705 )
					if( priceRange <= 1.66605 )
						ret := 0.200000
					if( priceRange > 1.66605 )
						if( val <= -0.396002 )
							ret := 0.666667
						if( val > -0.396002 )
							ret := 1.000000 // buy
	if( lowerBB > 144.439 )
		if( lowerBB <= 151.901 )
			if( dev <= 1.4615 )
				if( upperBB <= 148.609 )
					if( upperBB <= 147.394 )
						ret := 1.000000 // buy
					if( upperBB > 147.394 )
						if( val <= -0.08029 )
							ret := 0.000000
						if( val > -0.08029 )
							ret := -0.782609 // sell
				if( upperBB > 148.609 )
					if( avgHighLow <= 151.334 )
						if( val <= 0.146109 )
							ret := 0.714286 // buy
						if( val > 0.146109 )
							ret := 0.058824
					if( avgHighLow > 151.334 )
						ret := -0.500000
			if( dev > 1.4615 )
				if( priceRange <= 7.31306 )
					if( upperKC <= 159.121 )
						if( upperBB <= 155.455 )
							ret := -0.579618
						if( upperBB > 155.455 )
							ret := 0.560000
					if( upperKC > 159.121 )
						if( val <= -0.738374 )
							ret := 0.000000
						if( val > -0.738374 )
							ret := -0.944444 // sell
				if( priceRange > 7.31306 )
					ret := 0.714286 // buy
		if( lowerBB > 151.901 )
			if( upperBB <= 162.062 )
				if( upperBB <= 158.499 )
					if( avgHighLow <= 155.38 )
						ret := 0.000000
					if( avgHighLow > 155.38 )
						if( val <= 0.053331 )
							ret := -0.363636
						if( val > 0.053331 )
							ret := -0.956522 // sell
				if( upperBB > 158.499 )
					if( basis <= 159.729 )
						if( val <= 0.187226 )
							ret := 0.867925 // buy
						if( val > 0.187226 )
							ret := 0.378378
					if( basis > 159.729 )
						if( val <= 0.259983 )
							ret := 0.108108
						if( val > 0.259983 )
							ret := -1.000000 // sell
			if( upperBB > 162.062 )
				if( lowerKC <= 242.826 )
					if( avgHighLow <= 243.27 )
						if( rangema <= 1.22608 )
							ret := 0.034316
						if( rangema > 1.22608 )
							ret := -0.103068
					if( avgHighLow > 243.27 )
						if( basis <= 245.712 )
							ret := -0.916667 // sell
						if( basis > 245.712 )
							ret := 0.000000
				if( lowerKC > 242.826 )
					if( lowerKC <= 249.137 )
						if( priceRange <= 1.59549 )
							ret := 0.260870
						if( priceRange > 1.59549 )
							ret := 0.681319
					if( lowerKC > 249.137 )
						if( rangema <= 3.86553 )
							ret := 0.012525
						if( rangema > 3.86553 )
							ret := -0.139860
	
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
float op_operation = decision_tree_0_META_1Hour_ab93d427(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)

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


