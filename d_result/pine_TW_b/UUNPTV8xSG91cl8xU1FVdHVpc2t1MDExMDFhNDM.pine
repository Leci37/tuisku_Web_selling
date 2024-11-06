//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: QCOM_1Hour_1SQU_01101a43 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_QCOM_1Hour_1SQU_01101a43", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_QCOM_1Hour_01101a43(lowerBB, noSqzInt, avgHighLow, rangema, sqzOffInt, upperKC, ma, basis, val, sqzOnInt, dev, priceRange, lowerKC, upperBB)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( lowerBB <= 176.524 )
		if( lowerKC <= 172.846 )
			if( lowerKC <= 170.339 )
				if( val <= 0.374064 )
					if( lowerKC <= 120.369 )
						if( ma <= 121.124 )
							ret := 0.032002
						if( ma > 121.124 )
							ret := 0.730233 // buy
					if( lowerKC > 120.369 )
						if( dev <= 5.79118 )
							ret := -0.034434
						if( dev > 5.79118 )
							ret := 0.320132
				if( val > 0.374064 )
					if( rangema <= 2.455 )
						if( dev <= 7.2565 )
							ret := 0.304136
						if( dev > 7.2565 )
							ret := 0.968254 // buy
					if( rangema > 2.455 )
						if( val <= 0.410801 )
							ret := 0.125000
						if( val > 0.410801 )
							ret := -0.666667
			if( lowerKC > 170.339 )
				if( val <= -0.232382 )
					if( avgHighLow <= 173.044 )
						if( avgHighLow <= 172.8 )
							ret := 0.526316
						if( avgHighLow > 172.8 )
							ret := 0.937500 // buy
					if( avgHighLow > 173.044 )
						if( priceRange <= 0.906791 )
							ret := 0.047619
						if( priceRange > 0.906791 )
							ret := -0.266667
				if( val > -0.232382 )
					if( val <= -0.146953 )
						if( dev <= 3.67896 )
							ret := 0.025641
						if( dev > 3.67896 )
							ret := -1.000000 // sell
					if( val > -0.146953 )
						if( lowerBB <= 172.595 )
							ret := -0.739300 // sell
						if( lowerBB > 172.595 )
							ret := 0.076923
		if( lowerKC > 172.846 )
			if( dev <= 2.0711 )
				if( lowerKC <= 173.02 )
					ret := 0.888889 // buy
				if( lowerKC > 173.02 )
					if( val <= -0.011769 )
						ret := -0.111111
					if( val > -0.011769 )
						if( rangema <= 1.77969 )
							ret := -1.000000 // sell
						if( rangema > 1.77969 )
							ret := -0.333333
			if( dev > 2.0711 )
				if( avgHighLow <= 177.874 )
					if( val <= 0.382592 )
						if( dev <= 3.37116 )
							ret := 0.803797 // buy
						if( dev > 3.37116 )
							ret := 0.375000
					if( val > 0.382592 )
						ret := -0.066667
				if( avgHighLow > 177.874 )
					if( rangema <= 1.75773 )
						if( upperBB <= 185.016 )
							ret := -0.655172
						if( upperBB > 185.016 )
							ret := -0.153846
					if( rangema > 1.75773 )
						if( priceRange <= 2.11138 )
							ret := 0.320755
						if( priceRange > 2.11138 )
							ret := 0.840000 // buy
	if( lowerBB > 176.524 )
		if( lowerBB <= 192.349 )
			if( rangema <= 0.749386 )
				if( val <= 0.017685 )
					ret := 0.722222 // buy
				if( val > 0.017685 )
					ret := 0.100000
			if( rangema > 0.749386 )
				if( avgHighLow <= 179.2 )
					if( priceRange <= 1.95502 )
						if( upperKC <= 181.298 )
							ret := 0.363636
						if( upperKC > 181.298 )
							ret := 0.083333
					if( priceRange > 1.95502 )
						ret := 0.764706 // buy
				if( avgHighLow > 179.2 )
					if( lowerBB <= 180.1 )
						if( avgHighLow <= 185.568 )
							ret := -0.513699
						if( avgHighLow > 185.568 )
							ret := -0.972973 // sell
					if( lowerBB > 180.1 )
						if( avgHighLow <= 184.992 )
							ret := -0.115385
						if( avgHighLow > 184.992 )
							ret := -0.441860
		if( lowerBB > 192.349 )
			if( upperKC <= 207.816 )
				if( priceRange <= 1.20771 )
					if( upperBB <= 205.497 )
						if( rangema <= 1.32407 )
							ret := 0.605634
						if( rangema > 1.32407 )
							ret := -0.388889
					if( upperBB > 205.497 )
						if( upperBB <= 207.36 )
							ret := 0.928571 // buy
						if( upperBB > 207.36 )
							ret := 0.083333
				if( priceRange > 1.20771 )
					if( rangema <= 1.77109 )
						if( upperBB <= 204.401 )
							ret := -0.287500
						if( upperBB > 204.401 )
							ret := 0.215385
					if( rangema > 1.77109 )
						if( avgHighLow <= 204.948 )
							ret := 0.800000 // buy
						if( avgHighLow > 204.948 )
							ret := -0.200000
			if( upperKC > 207.816 )
				if( upperKC <= 217.271 )
					if( lowerKC <= 206.405 )
						if( rangema <= 1.6885 )
							ret := -0.037975
						if( rangema > 1.6885 )
							ret := -0.852941 // sell
					if( lowerKC > 206.405 )
						if( dev <= 2.51037 )
							ret := -0.850877 // sell
						if( dev > 2.51037 )
							ret := -0.376471
				if( upperKC > 217.271 )
					if( val <= -0.331474 )
						if( avgHighLow <= 222.288 )
							ret := -0.500000
						if( avgHighLow > 222.288 )
							ret := -1.000000 // sell
					if( val > -0.331474 )
						if( val <= -0.021911 )
							ret := 0.081081
						if( val > -0.021911 )
							ret := 0.721311 // buy
	
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
float op_operation = decision_tree_0_QCOM_1Hour_01101a43(lowerBB, noSqzInt, avgHighLow, rangema, sqzOffInt, upperKC, ma, basis, val, sqzOnInt, dev, priceRange, lowerKC, upperBB)

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


