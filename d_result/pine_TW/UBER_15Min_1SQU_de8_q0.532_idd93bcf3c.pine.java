//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: UBER_15Min_1SQU_d93bcf3c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UBER_15Min_1SQU_d93bcf3c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UBER_15Min_d93bcf3c(lowerBB, noSqzInt, avgHighLow, rangema, sqzOffInt, upperKC, ma, basis, val, sqzOnInt, dev, priceRange, lowerKC, upperBB)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( dev <= 0.446231 )
		if( avgHighLow <= 19.5837 )
			if( priceRange <= 0.295 )
				if( rangema <= 0.38071 )
					ret := -1.000000 // sell
				if( rangema > 0.38071 )
					ret := -0.750000 // sell
			if( priceRange > 0.295 )
				ret := -0.166667
		if( avgHighLow > 19.5837 )
			if( ma <= 21.2268 )
				if( dev <= 0.352854 )
					if( val <= -0.106222 )
						ret := -1.000000 // sell
					if( val > -0.106222 )
						if( ma <= 20.4246 )
							if( lowerBB <= 20.2207 )
								if( val <= 0.100466 )
									ret := 1.000000 // buy
								if( val > 0.100466 )
									ret := 0.750000 // buy
							if( lowerBB > 20.2207 )
								if( avgHighLow <= 20.4423 )
									ret := 1.000000 // buy
								if( avgHighLow > 20.4423 )
									ret := 0.250000
						if( ma > 20.4246 )
							if( ma <= 20.7205 )
								if( upperBB <= 20.7473 )
									ret := 0.155556
								if( upperBB > 20.7473 )
									ret := -0.368421
							if( ma > 20.7205 )
								if( rangema <= 0.189721 )
									ret := 0.440415
								if( rangema > 0.189721 )
									ret := 0.903846 // buy
				if( dev > 0.352854 )
					if( rangema <= 0.310888 )
						if( rangema <= 0.212624 )
							ret := -0.800000 // sell
						if( rangema > 0.212624 )
							if( upperKC <= 21.161 )
								if( val <= -0.005495 )
									ret := 1.000000 // buy
								if( val > -0.005495 )
									ret := -0.833333 // sell
							if( upperKC > 21.161 )
								ret := 1.000000 // buy
					if( rangema > 0.310888 )
						if( rangema <= 0.445041 )
							if( priceRange <= 0.350568 )
								if( lowerKC <= 20.0545 )
									ret := -0.800000 // sell
								if( lowerKC > 20.0545 )
									ret := -1.000000 // sell
							if( priceRange > 0.350568 )
								ret := 0.000000
						if( rangema > 0.445041 )
							ret := 0.166667
			if( ma > 21.2268 )
				if( val <= 0.011978 )
					if( rangema <= 0.481314 )
						if( avgHighLow <= 21.2996 )
							if( ma <= 21.3032 )
								if( rangema <= 0.103803 )
									ret := -0.916667 // sell
								if( rangema > 0.103803 )
									ret := -0.250000
							if( ma > 21.3032 )
								if( basis <= 21.3275 )
									ret := -0.250000
								if( basis > 21.3275 )
									ret := 0.000000
						if( avgHighLow > 21.2996 )
							if( avgHighLow <= 21.6867 )
								if( ma <= 21.5491 )
									ret := 0.149351
								if( ma > 21.5491 )
									ret := 0.614173
							if( avgHighLow > 21.6867 )
								if( upperBB <= 21.9676 )
									ret := -0.436893
								if( upperBB > 21.9676 )
									ret := 0.042481
					if( rangema > 0.481314 )
						if( dev <= 0.385811 )
							ret := 0.500000
						if( dev > 0.385811 )
							if( lowerBB <= 56.2277 )
								if( rangema <= 0.510724 )
									ret := -0.785714 // sell
								if( rangema > 0.510724 )
									ret := -0.976190 // sell
							if( lowerBB > 56.2277 )
								ret := 0.333333
				if( val > 0.011978 )
					if( avgHighLow <= 77.9778 )
						if( lowerKC <= 23.8594 )
							if( avgHighLow <= 23.573 )
								if( dev <= 0.38283 )
									ret := -0.148496
								if( dev > 0.38283 )
									ret := 0.576471
							if( avgHighLow > 23.573 )
								if( upperBB <= 24.2354 )
									ret := -0.778947 // sell
								if( upperBB > 24.2354 )
									ret := -0.347826
						if( lowerKC > 23.8594 )
							if( avgHighLow <= 25.2845 )
								if( avgHighLow <= 24.9735 )
									ret := 0.134409
								if( avgHighLow > 24.9735 )
									ret := 0.705882 // buy
							if( avgHighLow > 25.2845 )
								if( ma <= 25.5922 )
									ret := -0.688525
								if( ma > 25.5922 )
									ret := -0.000536
					if( avgHighLow > 77.9778 )
						if( rangema <= 0.36327 )
							if( priceRange <= 0.309869 )
								if( priceRange <= 0.092156 )
									ret := -0.105263
								if( priceRange > 0.092156 )
									ret := -0.595041
							if( priceRange > 0.309869 )
								if( sqzOffInt <= 0.5 )
									ret := -0.473684
								if( sqzOffInt > 0.5 )
									ret := 0.103448
						if( rangema > 0.36327 )
							if( rangema <= 0.405401 )
								ret := 0.833333 // buy
							if( rangema > 0.405401 )
								ret := -0.500000
	if( dev > 0.446231 )
		if( upperBB <= 32.6502 )
			if( lowerBB <= 31.3415 )
				if( val <= -0.043475 )
					if( upperKC <= 31.1922 )
						if( avgHighLow <= 28.7583 )
							if( dev <= 1.07635 )
								if( lowerBB <= 26.3772 )
									ret := -0.058577
								if( lowerBB > 26.3772 )
									ret := 0.497297
							if( dev > 1.07635 )
								if( rangema <= 0.337311 )
									ret := -0.034483
								if( rangema > 0.337311 )
									ret := 0.705128 // buy
						if( avgHighLow > 28.7583 )
							if( lowerKC <= 29.7916 )
								if( val <= -0.068082 )
									ret := -0.786885 // sell
								if( val > -0.068082 )
									ret := -0.068493
							if( lowerKC > 29.7916 )
								if( dev <= 0.560858 )
									ret := -0.250000
								if( dev > 0.560858 )
									ret := 0.806452 // buy
					if( upperKC > 31.1922 )
						if( rangema <= 0.12874 )
							ret := -1.000000 // sell
						if( rangema > 0.12874 )
							if( lowerBB <= 29.8016 )
								ret := -0.285714
							if( lowerBB > 29.8016 )
								if( dev <= 0.481592 )
									ret := -0.125000
								if( dev > 0.481592 )
									ret := 0.819444 // buy
				if( val > -0.043475 )
					if( rangema <= 0.160413 )
						if( basis <= 26.2164 )
							if( upperBB <= 25.0135 )
								if( dev <= 0.742838 )
									ret := 0.500000
								if( dev > 0.742838 )
									ret := -0.500000
							if( upperBB > 25.0135 )
								if( upperBB <= 26.5149 )
									ret := -0.833333 // sell
								if( upperBB > 26.5149 )
									ret := -0.250000
						if( basis > 26.2164 )
							if( avgHighLow <= 27.3137 )
								if( rangema <= 0.129829 )
									ret := 0.440000
								if( rangema > 0.129829 )
									ret := 0.918033 // buy
							if( avgHighLow > 27.3137 )
								if( upperBB <= 28.5516 )
									ret := -0.818182 // sell
								if( upperBB > 28.5516 )
									ret := 0.405797
					if( rangema > 0.160413 )
						if( avgHighLow <= 22.5416 )
							if( upperBB <= 21.2755 )
								if( ma <= 16.7811 )
									ret := 0.481481
								if( ma > 16.7811 )
									ret := -0.278107
							if( upperBB > 21.2755 )
								if( priceRange <= 0.214857 )
									ret := 0.733728 // buy
								if( priceRange > 0.214857 )
									ret := 0.310078
						if( avgHighLow > 22.5416 )
							if( basis <= 22.8172 )
								if( upperKC <= 22.9666 )
									ret := 0.192308
								if( upperKC > 22.9666 )
									ret := -0.591398
							if( basis > 22.8172 )
								if( ma <= 23.1669 )
									ret := 0.507143
								if( ma > 23.1669 )
									ret := 0.070750
			if( lowerBB > 31.3415 )
				if( rangema <= 0.182114 )
					if( priceRange <= 0.122709 )
						ret := 0.200000
					if( priceRange > 0.122709 )
						ret := -1.000000 // sell
				if( rangema > 0.182114 )
					if( rangema <= 0.221008 )
						if( upperKC <= 32.2901 )
							if( basis <= 31.9362 )
								ret := 0.250000
							if( basis > 31.9362 )
								if( rangema <= 0.188008 )
									ret := 0.000000
								if( rangema > 0.188008 )
									ret := -0.250000
						if( upperKC > 32.2901 )
							if( upperBB <= 32.5252 )
								ret := 1.000000 // buy
							if( upperBB > 32.5252 )
								if( upperBB <= 32.6232 )
									ret := 0.153846
								if( upperBB > 32.6232 )
									ret := 0.750000 // buy
					if( rangema > 0.221008 )
						if( priceRange <= 0.210174 )
							if( priceRange <= 0.159027 )
								if( upperKC <= 32.5031 )
									ret := 0.833333 // buy
								if( upperKC > 32.5031 )
									ret := 1.000000 // buy
							if( priceRange > 0.159027 )
								if( sqzOnInt <= 0.5 )
									ret := 0.473684
								if( sqzOnInt > 0.5 )
									ret := 1.000000 // buy
						if( priceRange > 0.210174 )
							if( val <= 0.016147 )
								ret := 1.000000 // buy
							if( val > 0.016147 )
								if( avgHighLow <= 32.07 )
									ret := 0.500000
								if( avgHighLow > 32.07 )
									ret := 1.000000 // buy
		if( upperBB > 32.6502 )
			if( upperBB <= 82.245 )
				if( avgHighLow <= 80.1647 )
					if( basis <= 32.0625 )
						if( dev <= 1.33023 )
							if( priceRange <= 0.200016 )
								if( avgHighLow <= 32.1888 )
									ret := -0.792208 // sell
								if( avgHighLow > 32.1888 )
									ret := 0.500000
							if( priceRange > 0.200016 )
								if( lowerKC <= 31.5392 )
									ret := -0.470588
								if( lowerKC > 31.5392 )
									ret := 0.366667
						if( dev > 1.33023 )
							if( priceRange <= 0.284294 )
								if( val <= 0.078556 )
									ret := 0.954545 // buy
								if( val > 0.078556 )
									ret := 0.375000
							if( priceRange > 0.284294 )
								if( lowerBB <= 30.1508 )
									ret := -0.800000 // sell
								if( lowerBB > 30.1508 )
									ret := 0.000000
					if( basis > 32.0625 )
						if( dev <= 2.15971 )
							if( dev <= 1.48568 )
								if( val <= 0.054579 )
									ret := 0.077867
								if( val > 0.054579 )
									ret := -0.047271
							if( dev > 1.48568 )
								if( upperBB <= 58.0003 )
									ret := 0.362342
								if( upperBB > 58.0003 )
									ret := -0.033419
						if( dev > 2.15971 )
							if( upperBB <= 73.8726 )
								if( dev <= 3.21541 )
									ret := -0.473282
								if( dev > 3.21541 )
									ret := -1.000000 // sell
							if( upperBB > 73.8726 )
								if( lowerKC <= 68.2153 )
									ret := 0.916667 // buy
								if( lowerKC > 68.2153 )
									ret := 0.312500
				if( avgHighLow > 80.1647 )
					if( val <= -0.029837 )
						if( ma <= 81.1413 )
							if( rangema <= 0.377616 )
								if( dev <= 0.637977 )
									ret := 0.333333
								if( dev > 0.637977 )
									ret := 1.000000 // buy
							if( rangema > 0.377616 )
								ret := -0.714286 // sell
						if( ma > 81.1413 )
							if( lowerBB <= 80.5828 )
								ret := -1.000000 // sell
							if( lowerBB > 80.5828 )
								ret := -0.500000
					if( val > -0.029837 )
						if( sqzOffInt <= 0.5 )
							ret := 0.000000
						if( sqzOffInt > 0.5 )
							if( priceRange <= 0.26146 )
								if( avgHighLow <= 80.6057 )
									ret := -0.900000 // sell
								if( avgHighLow > 80.6057 )
									ret := -0.181818
							if( priceRange > 0.26146 )
								if( upperBB <= 82.0503 )
									ret := -0.954545 // sell
								if( upperBB > 82.0503 )
									ret := -0.600000
			if( upperBB > 82.245 )
				if( priceRange <= 0.337307 )
					if( dev <= 1.04655 )
						ret := 0.000000
					if( dev > 1.04655 )
						ret := 0.600000
				if( priceRange > 0.337307 )
					if( val <= 0.071529 )
						if( rangema <= 0.60719 )
							if( priceRange <= 0.483318 )
								ret := 0.142857
							if( priceRange > 0.483318 )
								if( rangema <= 0.533688 )
									ret := 1.000000 // buy
								if( rangema > 0.533688 )
									ret := 0.250000
						if( rangema > 0.60719 )
							if( avgHighLow <= 80.5175 )
								ret := 0.750000 // buy
							if( avgHighLow > 80.5175 )
								ret := 1.000000 // buy
					if( val > 0.071529 )
						if( val <= 0.10704 )
							if( val <= 0.084584 )
								ret := -0.750000 // sell
							if( val > 0.084584 )
								ret := -0.200000
						if( val > 0.10704 )
							ret := 0.750000 // buy
	
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
float op_operation = decision_tree_0_UBER_15Min_d93bcf3c(lowerBB, noSqzInt, avgHighLow, rangema, sqzOffInt, upperKC, ma, basis, val, sqzOnInt, dev, priceRange, lowerKC, upperBB)

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


