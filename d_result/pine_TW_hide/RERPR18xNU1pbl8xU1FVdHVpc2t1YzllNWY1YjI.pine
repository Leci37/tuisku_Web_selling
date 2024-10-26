//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: DDOG_15Min_1SQU_c9e5f5b2 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DDOG_15Min_1SQU_c9e5f5b2", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DDOG_15Min_c9e5f5b2(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( val <= -0.003512 )
		if( upperKC <= 91.6017 )
			if( lowerBB <= 86.4228 )
				if( upperKC <= 88.1135 )
					if( val <= -0.211973 )
						if( dev <= 3.0697 )
							ret := 0.386667
						if( dev > 3.0697 )
							ret := 0.812121 // buy
					if( val > -0.211973 )
						if( upperKC <= 69.2271 )
							ret := 0.138071
						if( upperKC > 69.2271 )
							ret := 0.037153
				if( upperKC > 88.1135 )
					if( upperBB <= 93.6955 )
						if( avgHighLow <= 88.2317 )
							ret := -0.296912
						if( avgHighLow > 88.2317 )
							ret := -0.725664 // sell
					if( upperBB > 93.6955 )
						ret := 0.782609 // buy
			if( lowerBB > 86.4228 )
				if( upperKC <= 88.2876 )
					if( rangema <= 0.426875 )
						if( upperBB <= 87.4673 )
							ret := 0.230769
						if( upperBB > 87.4673 )
							ret := 0.880795 // buy
					if( rangema > 0.426875 )
						if( priceRange <= 0.493431 )
							ret := 0.000000
						if( priceRange > 0.493431 )
							ret := 0.742857 // buy
				if( upperKC > 88.2876 )
					if( upperKC <= 91.3308 )
						if( upperKC <= 90.4647 )
							ret := 0.225780
						if( upperKC > 90.4647 )
							ret := -0.007605
					if( upperKC > 91.3308 )
						if( avgHighLow <= 90.9841 )
							ret := 0.689922
						if( avgHighLow > 90.9841 )
							ret := 0.173913
		if( upperKC > 91.6017 )
			if( lowerKC <= 165.581 )
				if( avgHighLow <= 159.906 )
					if( rangema <= 1.344 )
						if( priceRange <= 0.476948 )
							ret := 0.041281
						if( priceRange > 0.476948 )
							ret := -0.058671
					if( rangema > 1.344 )
						if( lowerKC <= 151.572 )
							ret := 0.193608
						if( lowerKC > 151.572 )
							ret := -0.403315
				if( avgHighLow > 159.906 )
					if( ma <= 162.671 )
						if( val <= -0.026828 )
							ret := 0.660550
						if( val > -0.026828 )
							ret := 0.021739
					if( ma > 162.671 )
						if( upperBB <= 167.396 )
							ret := -0.329268
						if( upperBB > 167.396 )
							ret := 0.556452
			if( lowerKC > 165.581 )
				if( dev <= 7.56079 )
					if( dev <= 1.91835 )
						if( avgHighLow <= 193.384 )
							ret := 0.092784
						if( avgHighLow > 193.384 )
							ret := -0.648649
					if( dev > 1.91835 )
						if( priceRange <= 1.005 )
							ret := -0.100000
						if( priceRange > 1.005 )
							ret := -0.531792
				if( dev > 7.56079 )
					if( upperKC <= 177.896 )
						ret := -0.333333
					if( upperKC > 177.896 )
						if( upperBB <= 197.486 )
							ret := 0.923077 // buy
						if( upperBB > 197.486 )
							ret := 0.666667
	if( val > -0.003512 )
		if( upperBB <= 32.0566 )
			if( rangema <= 0.212565 )
				if( upperBB <= 30.4133 )
					ret := -1.000000 // sell
				if( upperBB > 30.4133 )
					ret := -0.500000
			if( rangema > 0.212565 )
				if( lowerKC <= 27.847 )
					if( upperBB <= 28.8132 )
						ret := 0.692308
					if( upperBB > 28.8132 )
						ret := -0.777778 // sell
				if( lowerKC > 27.847 )
					if( priceRange <= 0.487796 )
						if( priceRange <= 0.361309 )
							ret := 0.826667 // buy
						if( priceRange > 0.361309 )
							ret := 0.375000
					if( priceRange > 0.487796 )
						if( dev <= 0.53274 )
							ret := 0.880000 // buy
						if( dev > 0.53274 )
							ret := 1.000000 // buy
		if( upperBB > 32.0566 )
			if( lowerKC <= 91.8784 )
				if( upperBB <= 92.8798 )
					if( dev <= 0.876951 )
						if( upperKC <= 32.0063 )
							ret := -0.947368 // sell
						if( upperKC > 32.0063 )
							ret := 0.041428
					if( dev > 0.876951 )
						if( avgHighLow <= 43.9677 )
							ret := -0.232704
						if( avgHighLow > 43.9677 )
							ret := -0.048504
				if( upperBB > 92.8798 )
					if( avgHighLow <= 94.3764 )
						if( avgHighLow <= 93.0263 )
							ret := 0.394343
						if( avgHighLow > 93.0263 )
							ret := -0.210526
					if( avgHighLow > 94.3764 )
						if( ma <= 93.5088 )
							ret := 1.000000 // buy
						if( ma > 93.5088 )
							ret := 0.500000
			if( lowerKC > 91.8784 )
				if( lowerBB <= 96.1234 )
					if( rangema <= 1.49345 )
						if( dev <= 0.611717 )
							ret := 0.155932
						if( dev > 0.611717 )
							ret := -0.244928
					if( rangema > 1.49345 )
						if( priceRange <= 2.56054 )
							ret := -0.869318 // sell
						if( priceRange > 2.56054 )
							ret := 0.176471
				if( lowerBB > 96.1234 )
					if( dev <= 5.91296 )
						if( ma <= 193.012 )
							ret := -0.072090
						if( ma > 193.012 )
							ret := -0.734177 // sell
					if( dev > 5.91296 )
						if( rangema <= 5.62067 )
							ret := 0.504202
						if( rangema > 5.62067 )
							ret := -0.909091 // sell
	
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
float op_operation = decision_tree_0_DDOG_15Min_c9e5f5b2(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)

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


