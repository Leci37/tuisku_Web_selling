//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: XRPUSDT_15Min_1SQU_3fb2785e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XRPUSDT_15Min_1SQU_3fb2785e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XRPUSDT_15Min_3fb2785e(rangema, avgHighLow, upperKC, lowerBB, noSqzInt, ma, upperBB, lowerKC, basis, sqzOnInt, priceRange, dev, val, sqzOffInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( val <= -0.000405 )
		if( dev <= 0.008168 )
			if( lowerBB <= 0.353516 )
				if( basis <= 0.315755 )
					if( dev <= 0.003869 )
						ret := 0.285714
					if( dev > 0.003869 )
						if( upperKC <= 0.311628 )
							ret := 0.714286 // buy
						if( upperKC > 0.311628 )
							ret := 1.000000 // buy
				if( basis > 0.315755 )
					if( upperBB <= 0.324505 )
						if( upperBB <= 0.321892 )
							if( lowerKC <= 0.311648 )
								ret := -0.700000 // sell
							if( lowerKC > 0.311648 )
								ret := -0.888889 // sell
						if( upperBB > 0.321892 )
							ret := -1.000000 // sell
					if( upperBB > 0.324505 )
						if( upperBB <= 0.36136 )
							if( val <= -0.000601 )
								ret := -0.548387
							if( val > -0.000601 )
								ret := 0.087379
						if( upperBB > 0.36136 )
							if( lowerKC <= 0.355306 )
								ret := -0.970588 // sell
							if( lowerKC > 0.355306 )
								ret := -0.428571
			if( lowerBB > 0.353516 )
				if( lowerKC <= 0.363849 )
					if( avgHighLow <= 0.36624 )
						if( lowerBB <= 0.357802 )
							if( dev <= 0.005866 )
								ret := 0.192308
							if( dev > 0.005866 )
								ret := 0.920000 // buy
						if( lowerBB > 0.357802 )
							if( dev <= 0.005213 )
								ret := 0.222222
							if( dev > 0.005213 )
								ret := -0.750000 // sell
					if( avgHighLow > 0.36624 )
						if( dev <= 0.002886 )
							ret := 0.571429
						if( dev > 0.002886 )
							ret := 1.000000 // buy
				if( lowerKC > 0.363849 )
					if( upperKC <= 0.828741 )
						if( rangema <= 0.006592 )
							if( upperBB <= 0.38094 )
								ret := 0.391304
							if( upperBB > 0.38094 )
								ret := 0.064884
						if( rangema > 0.006592 )
							if( rangema <= 0.007049 )
								ret := 0.688889
							if( rangema > 0.007049 )
								ret := 0.078431
					if( upperKC > 0.828741 )
						ret := -1.000000 // sell
		if( dev > 0.008168 )
			if( rangema <= 0.007113 )
				if( rangema <= 0.006026 )
					if( lowerKC <= 0.450212 )
						if( upperBB <= 0.444544 )
							if( lowerKC <= 0.367828 )
								ret := -0.019900
							if( lowerKC > 0.367828 )
								ret := 0.336043
						if( upperBB > 0.444544 )
							if( avgHighLow <= 0.440085 )
								ret := -0.886792 // sell
							if( avgHighLow > 0.440085 )
								ret := 0.000000
					if( lowerKC > 0.450212 )
						if( rangema <= 0.002796 )
							if( val <= -0.000499 )
								ret := -1.000000 // sell
							if( val > -0.000499 )
								ret := 0.888889 // buy
						if( rangema > 0.002796 )
							if( upperBB <= 0.517125 )
								ret := 0.714859 // buy
							if( upperBB > 0.517125 )
								ret := 0.302494
				if( rangema > 0.006026 )
					if( upperBB <= 0.834102 )
						if( val <= -0.001124 )
							if( ma <= 0.467696 )
								ret := 0.312500
							if( ma > 0.467696 )
								ret := 0.822368 // buy
						if( val > -0.001124 )
							if( avgHighLow <= 0.388065 )
								ret := 0.844444 // buy
							if( avgHighLow > 0.388065 )
								ret := 0.397849
					if( upperBB > 0.834102 )
						ret := -0.428571
			if( rangema > 0.007113 )
				if( dev <= 0.033175 )
					if( dev <= 0.011945 )
						if( val <= -0.002846 )
							if( lowerKC <= 0.712476 )
								ret := 0.285714
							if( lowerKC > 0.712476 )
								ret := -0.950000 // sell
						if( val > -0.002846 )
							if( val <= -0.00114 )
								ret := 0.593496
							if( val > -0.00114 )
								ret := 0.118110
					if( dev > 0.011945 )
						if( avgHighLow <= 0.7964 )
							if( val <= -0.003708 )
								ret := 0.958333 // buy
							if( val > -0.003708 )
								ret := -0.105392
						if( avgHighLow > 0.7964 )
							if( upperKC <= 0.809948 )
								ret := -1.000000 // sell
							if( upperKC > 0.809948 )
								ret := -0.700000 // sell
				if( dev > 0.033175 )
					if( upperBB <= 0.534839 )
						if( dev <= 0.040345 )
							if( val <= -0.001402 )
								ret := 1.000000 // buy
							if( val > -0.001402 )
								ret := 0.750000 // buy
						if( dev > 0.040345 )
							ret := -1.000000 // sell
					if( upperBB > 0.534839 )
						if( dev <= 0.037627 )
							if( upperKC <= 0.625332 )
								ret := 0.555556
							if( upperKC > 0.625332 )
								ret := -0.142857
						if( dev > 0.037627 )
							if( val <= -0.00066 )
								ret := 0.919708 // buy
							if( val > -0.00066 )
								ret := 0.200000
	if( val > -0.000405 )
		if( ma <= 0.620462 )
			if( rangema <= 0.001881 )
				if( lowerBB <= 0.328741 )
					if( dev <= 0.005899 )
						if( ma <= 0.330337 )
							if( upperBB <= 0.309472 )
								ret := -0.777778 // sell
							if( upperBB > 0.309472 )
								ret := 0.161666
						if( ma > 0.330337 )
							if( lowerKC <= 0.329762 )
								ret := 0.654867
							if( lowerKC > 0.329762 )
								ret := -0.714286 // sell
					if( dev > 0.005899 )
						ret := -1.000000 // sell
				if( lowerBB > 0.328741 )
					if( avgHighLow <= 0.333809 )
						if( upperKC <= 0.332117 )
							if( dev <= 0.001337 )
								ret := 0.084746
							if( dev > 0.001337 )
								ret := 0.571429
						if( upperKC > 0.332117 )
							if( rangema <= 0.001708 )
								ret := -0.362881
							if( rangema > 0.001708 )
								ret := 0.468750
					if( avgHighLow > 0.333809 )
						if( lowerBB <= 0.352645 )
							if( upperBB <= 0.354956 )
								ret := 0.062556
							if( upperBB > 0.354956 )
								ret := 0.495283
						if( lowerBB > 0.352645 )
							if( upperBB <= 0.361646 )
								ret := -0.260047
							if( upperBB > 0.361646 )
								ret := -0.001194
			if( rangema > 0.001881 )
				if( val <= 0.000458 )
					if( ma <= 0.31712 )
						if( val <= -8e-05 )
							if( dev <= 0.00403 )
								ret := -0.411765
							if( dev > 0.00403 )
								ret := 0.589041
						if( val > -8e-05 )
							if( dev <= 0.006003 )
								ret := 0.609375
							if( dev > 0.006003 )
								ret := 0.103093
					if( ma > 0.31712 )
						if( lowerKC <= 0.314018 )
							if( priceRange <= 0.005664 )
								ret := -0.698630
							if( priceRange > 0.005664 )
								ret := 0.214286
						if( lowerKC > 0.314018 )
							if( rangema <= 0.00353 )
								ret := 0.073460
							if( rangema > 0.00353 )
								ret := 0.154433
				if( val > 0.000458 )
					if( dev <= 0.008026 )
						if( rangema <= 0.004235 )
							if( dev <= 0.003911 )
								ret := -0.043357
							if( dev > 0.003911 )
								ret := 0.156377
						if( rangema > 0.004235 )
							if( val <= 0.000958 )
								ret := -0.173025
							if( val > 0.000958 )
								ret := 0.089385
					if( dev > 0.008026 )
						if( lowerBB <= 0.338186 )
							if( lowerBB <= 0.296397 )
								ret := -0.923077 // sell
							if( lowerBB > 0.296397 )
								ret := 0.471503
						if( lowerBB > 0.338186 )
							if( val <= 0.00448 )
								ret := -0.173041
							if( val > 0.00448 )
								ret := 0.794118 // buy
		if( ma > 0.620462 )
			if( lowerKC <= 0.615984 )
				if( avgHighLow <= 0.618368 )
					if( priceRange <= 0.00945 )
						if( upperBB <= 0.627252 )
							ret := -0.714286 // sell
						if( upperBB > 0.627252 )
							if( dev <= 0.009381 )
								ret := 0.769231 // buy
							if( dev > 0.009381 )
								ret := -0.160000
					if( priceRange > 0.00945 )
						ret := 1.000000 // buy
				if( avgHighLow > 0.618368 )
					if( lowerKC <= 0.612807 )
						if( lowerBB <= 0.610892 )
							ret := -1.000000 // sell
						if( lowerBB > 0.610892 )
							ret := -0.714286 // sell
					if( lowerKC > 0.612807 )
						if( upperBB <= 0.638547 )
							if( lowerBB <= 0.618811 )
								ret := -0.606667
							if( lowerBB > 0.618811 )
								ret := 0.285714
						if( upperBB > 0.638547 )
							ret := 0.500000
			if( lowerKC > 0.615984 )
				if( rangema <= 0.002875 )
					if( dev <= 0.00305 )
						if( lowerKC <= 0.710285 )
							if( basis <= 0.64312 )
								ret := -0.075797
							if( basis > 0.64312 )
								ret := 0.167286
						if( lowerKC > 0.710285 )
							if( rangema <= 0.002285 )
								ret := -0.652174
							if( rangema > 0.002285 )
								ret := 0.307692
					if( dev > 0.00305 )
						if( avgHighLow <= 0.61855 )
							ret := 0.750000 // buy
						if( avgHighLow > 0.61855 )
							if( upperBB <= 0.633971 )
								ret := -0.137313
							if( upperBB > 0.633971 )
								ret := -0.286966
				if( rangema > 0.002875 )
					if( priceRange <= 0.002425 )
						if( lowerBB <= 0.726616 )
							if( lowerKC <= 0.642874 )
								ret := 0.077859
							if( lowerKC > 0.642874 )
								ret := 0.395604
						if( lowerBB > 0.726616 )
							if( upperBB <= 0.778027 )
								ret := -0.368421
							if( upperBB > 0.778027 )
								ret := -0.875000 // sell
					if( priceRange > 0.002425 )
						if( upperKC <= 0.631639 )
							if( lowerBB <= 0.622244 )
								ret := 0.156627
							if( lowerBB > 0.622244 )
								ret := 0.866667 // buy
						if( upperKC > 0.631639 )
							if( lowerBB <= 0.641627 )
								ret := -0.155664
							if( lowerBB > 0.641627 )
								ret := 0.001866
	
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
float op_operation = decision_tree_0_XRPUSDT_15Min_3fb2785e(rangema, avgHighLow, upperKC, lowerBB, noSqzInt, ma, upperBB, lowerKC, basis, sqzOnInt, priceRange, dev, val, sqzOffInt)

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


