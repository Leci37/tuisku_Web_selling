//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: LYFT_30Min_1SQU_b18d15e2 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LYFT_30Min_1SQU_b18d15e2", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LYFT_30Min_b18d15e2(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( upperKC <= 10.2325 )
		if( lowerBB <= 8.77667 )
			if( basis <= 8.65523 )
				if( rangema <= 0.07597 )
					if( rangema <= 0.055684 )
						if( upperBB <= 8.24035 )
							ret := 0.358209
						if( upperBB > 8.24035 )
							ret := -0.692308
					if( rangema > 0.055684 )
						if( lowerBB <= 8.50757 )
							ret := 0.081081
						if( lowerBB > 8.50757 )
							ret := 1.000000 // buy
				if( rangema > 0.07597 )
					if( avgHighLow <= 8.66 )
						if( lowerBB <= 8.24965 )
							ret := -0.166667
						if( lowerBB > 8.24965 )
							ret := 0.946565 // buy
					if( avgHighLow > 8.66 )
						if( dev <= 0.262516 )
							ret := -0.777778 // sell
						if( dev > 0.262516 )
							ret := 0.230769
			if( basis > 8.65523 )
				if( lowerBB <= 8.72629 )
					if( val <= 0.022731 )
						if( priceRange <= 0.060049 )
							ret := -0.148148
						if( priceRange > 0.060049 )
							ret := -0.709924 // sell
					if( val > 0.022731 )
						ret := 0.333333
				if( lowerBB > 8.72629 )
					if( avgHighLow <= 8.88873 )
						ret := 0.538462
					if( avgHighLow > 8.88873 )
						ret := -0.238095
		if( lowerBB > 8.77667 )
			if( rangema <= 0.065528 )
				if( upperBB <= 10.1867 )
					if( lowerBB <= 9.65823 )
						if( lowerBB <= 9.46789 )
							ret := 0.466216
						if( lowerBB > 9.46789 )
							ret := 0.853403 // buy
					if( lowerBB > 9.65823 )
						if( lowerBB <= 9.96812 )
							ret := 0.229412
						if( lowerBB > 9.96812 )
							ret := 0.841270 // buy
				if( upperBB > 10.1867 )
					if( rangema <= 0.059839 )
						if( upperKC <= 10.1916 )
							ret := -1.000000 // sell
						if( upperKC > 10.1916 )
							ret := -0.111111
					if( rangema > 0.059839 )
						ret := 0.250000
			if( rangema > 0.065528 )
				if( lowerBB <= 9.00892 )
					if( rangema <= 0.093548 )
						if( priceRange <= 0.092696 )
							ret := 0.514286
						if( priceRange > 0.092696 )
							ret := 0.887640 // buy
					if( rangema > 0.093548 )
						if( lowerKC <= 9.13437 )
							ret := -0.114286
						if( lowerKC > 9.13437 )
							ret := 0.733333 // buy
				if( lowerBB > 9.00892 )
					if( val <= -0.032882 )
						if( upperBB <= 10.3238 )
							ret := -0.545455
						if( upperBB > 10.3238 )
							ret := -1.000000 // sell
					if( val > -0.032882 )
						if( lowerBB <= 9.01254 )
							ret := -0.823529 // sell
						if( lowerBB > 9.01254 )
							ret := 0.176200
	if( upperKC > 10.2325 )
		if( rangema <= 0.997139 )
			if( rangema <= 0.414604 )
				if( lowerBB <= 14.2541 )
					if( upperBB <= 14.2949 )
						if( avgHighLow <= 13.2065 )
							ret := 0.058365
						if( avgHighLow > 13.2065 )
							ret := -0.116948
					if( upperBB > 14.2949 )
						if( val <= -0.023185 )
							ret := -0.229814
						if( val > -0.023185 )
							ret := 0.427336
				if( lowerBB > 14.2541 )
					if( dev <= 0.552867 )
						if( priceRange <= 0.076632 )
							ret := 0.003310
						if( priceRange > 0.076632 )
							ret := -0.122510
					if( dev > 0.552867 )
						if( upperBB <= 17.0867 )
							ret := -0.585153
						if( upperBB > 17.0867 )
							ret := 0.024637
			if( rangema > 0.414604 )
				if( upperBB <= 60.1335 )
					if( avgHighLow <= 15.2531 )
						if( upperBB <= 16.2007 )
							ret := -1.000000 // sell
						if( upperBB > 16.2007 )
							ret := -0.692308
					if( avgHighLow > 15.2531 )
						if( ma <= 17.5044 )
							ret := 0.515464
						if( ma > 17.5044 )
							ret := 0.112770
				if( upperBB > 60.1335 )
					if( val <= 0.054818 )
						if( upperBB <= 61.1208 )
							ret := -0.504310
						if( upperBB > 61.1208 )
							ret := -0.094364
					if( val > 0.054818 )
						if( rangema <= 0.766417 )
							ret := 0.164921
						if( rangema > 0.766417 )
							ret := -0.714286 // sell
		if( rangema > 0.997139 )
			if( basis <= 59.2681 )
				if( upperBB <= 55.523 )
					if( lowerBB <= 20.1717 )
						if( priceRange <= 0.866768 )
							ret := -0.700000 // sell
						if( priceRange > 0.866768 )
							ret := -1.000000 // sell
					if( lowerBB > 20.1717 )
						if( priceRange <= 0.595296 )
							ret := 0.833333 // buy
						if( priceRange > 0.595296 )
							ret := -0.085106
				if( upperBB > 55.523 )
					if( rangema <= 1.12268 )
						if( priceRange <= 0.73893 )
							ret := -0.190476
						if( priceRange > 0.73893 )
							ret := -0.846154 // sell
					if( rangema > 1.12268 )
						if( dev <= 2.71036 )
							ret := -0.937500 // sell
						if( dev > 2.71036 )
							ret := -0.642857
			if( basis > 59.2681 )
				if( ma <= 62.1981 )
					if( priceRange <= 2.25891 )
						if( val <= 0.025819 )
							ret := 0.716981 // buy
						if( val > 0.025819 )
							ret := -0.133333
					if( priceRange > 2.25891 )
						ret := -0.615385
				if( ma > 62.1981 )
					if( avgHighLow <= 63.354 )
						if( upperKC <= 65.2236 )
							ret := -0.176471
						if( upperKC > 65.2236 )
							ret := 0.928571 // buy
					if( avgHighLow > 63.354 )
						if( dev <= 1.40179 )
							ret := 0.187500
						if( dev > 1.40179 )
							ret := -0.855072 // sell
	
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
float op_operation = decision_tree_0_LYFT_30Min_b18d15e2(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)

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


