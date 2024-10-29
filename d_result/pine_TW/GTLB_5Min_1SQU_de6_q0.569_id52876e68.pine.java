//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: GTLB_5Min_1SQU_52876e68 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GTLB_5Min_1SQU_52876e68", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GTLB_5Min_52876e68(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( lowerBB <= 30.243 )
		if( rangema <= 0.22276 )
			if( basis <= 28.8435 )
				if( lowerBB <= 27.9251 )
					if( ma <= 27.9176 )
						if( val <= 0.025002 )
							ret := 0.500000
						if( val > 0.025002 )
							ret := -0.480000
					if( ma > 27.9176 )
						if( upperKC <= 28.2322 )
							ret := -0.941176 // sell
						if( upperKC > 28.2322 )
							ret := -0.230769
				if( lowerBB > 27.9251 )
					if( dev <= 0.354261 )
						if( dev <= 0.099552 )
							ret := 0.000000
						if( dev > 0.099552 )
							ret := 0.783654 // buy
					if( dev > 0.354261 )
						if( rangema <= 0.178336 )
							ret := 0.200000
						if( rangema > 0.178336 )
							ret := -0.750000 // sell
			if( basis > 28.8435 )
				if( basis <= 29.0401 )
					if( dev <= 0.225682 )
						if( lowerBB <= 28.9041 )
							ret := -0.500000
						if( lowerBB > 28.9041 )
							ret := 1.000000 // buy
					if( dev > 0.225682 )
						if( lowerBB <= 28.7931 )
							ret := -0.972222 // sell
						if( lowerBB > 28.7931 )
							ret := 0.000000
				if( basis > 29.0401 )
					if( sqzOnInt <= 0.5 )
						if( upperKC <= 29.8634 )
							ret := 0.695364
						if( upperKC > 29.8634 )
							ret := 0.274667
					if( sqzOnInt > 0.5 )
						if( dev <= 0.157626 )
							ret := 0.335260
						if( dev > 0.157626 )
							ret := -0.346154
		if( rangema > 0.22276 )
			if( lowerKC <= 26.954 )
				if( lowerBB <= 26.8696 )
					ret := -1.000000 // sell
				if( lowerBB > 26.8696 )
					ret := 0.000000
			if( lowerKC > 26.954 )
				if( dev <= 0.260809 )
					if( upperKC <= 29.0527 )
						ret := 0.000000
					if( upperKC > 29.0527 )
						if( priceRange <= 0.165 )
							ret := 0.000000
						if( priceRange > 0.165 )
							ret := -1.000000 // sell
				if( dev > 0.260809 )
					if( priceRange <= 0.15958 )
						if( upperBB <= 29.3706 )
							ret := 0.906977 // buy
						if( upperBB > 29.3706 )
							ret := -0.153846
					if( priceRange > 0.15958 )
						if( val <= -0.013335 )
							ret := -0.729730 // sell
						if( val > -0.013335 )
							ret := 0.322581
	if( lowerBB > 30.243 )
		if( basis <= 32.9286 )
			if( dev <= 0.347681 )
				if( val <= -0.008668 )
					if( dev <= 0.244553 )
						if( upperBB <= 32.0619 )
							ret := 0.645390
						if( upperBB > 32.0619 )
							ret := 0.033333
					if( dev > 0.244553 )
						if( upperKC <= 32.5954 )
							ret := -0.571429
						if( upperKC > 32.5954 )
							ret := 1.000000 // buy
				if( val > -0.008668 )
					if( lowerBB <= 30.3081 )
						if( priceRange <= 0.17003 )
							ret := -0.250000
						if( priceRange > 0.17003 )
							ret := -0.918919 // sell
					if( lowerBB > 30.3081 )
						if( dev <= 0.282706 )
							ret := -0.190236
						if( dev > 0.282706 )
							ret := 0.233645
			if( dev > 0.347681 )
				if( lowerKC <= 31.0146 )
					if( priceRange <= 0.242141 )
						if( lowerBB <= 30.4404 )
							ret := -1.000000 // sell
						if( lowerBB > 30.4404 )
							ret := -0.403509
					if( priceRange > 0.242141 )
						if( upperKC <= 31.154 )
							ret := -1.000000 // sell
						if( upperKC > 31.154 )
							ret := 0.465517
				if( lowerKC > 31.0146 )
					if( val <= -0.021361 )
						if( lowerKC <= 32.0454 )
							ret := -0.661017
						if( lowerKC > 32.0454 )
							ret := 0.392857
					if( val > -0.021361 )
						if( priceRange <= 0.353212 )
							ret := -0.910112 // sell
						if( priceRange > 0.353212 )
							ret := 0.111111
		if( basis > 32.9286 )
			if( lowerBB <= 33.6565 )
				if( priceRange <= 0.15005 )
					if( lowerBB <= 33.4591 )
						if( upperKC <= 33.3101 )
							ret := 0.576923
						if( upperKC > 33.3101 )
							ret := -0.384615
					if( lowerBB > 33.4591 )
						if( dev <= 0.260791 )
							ret := -1.000000 // sell
						if( dev > 0.260791 )
							ret := 0.906250 // buy
				if( priceRange > 0.15005 )
					if( sqzOffInt <= 0.5 )
						ret := -0.307692
					if( sqzOffInt > 0.5 )
						if( lowerBB <= 33.084 )
							ret := 0.975904 // buy
						if( lowerBB > 33.084 )
							ret := 0.666667
			if( lowerBB > 33.6565 )
				if( upperKC <= 36.7731 )
					if( upperBB <= 36.4333 )
						if( priceRange <= 0.164405 )
							ret := -0.318182
						if( priceRange > 0.164405 )
							ret := 0.095923
					if( upperBB > 36.4333 )
						if( val <= -0.006844 )
							ret := 0.000000
						if( val > -0.006844 )
							ret := -0.809524 // sell
				if( upperKC > 36.7731 )
					if( upperKC <= 41.94 )
						if( upperBB <= 41.7518 )
							ret := 0.352804
						if( upperBB > 41.7518 )
							ret := 0.728070 // buy
					if( upperKC > 41.94 )
						if( upperBB <= 42.1761 )
							ret := -0.543860
						if( upperBB > 42.1761 )
							ret := 0.003949
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_GTLB_5Min_52876e68(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)

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


