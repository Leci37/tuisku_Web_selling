//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: LINKUSDT_15Min_1SQU_dc5eab4d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LINKUSDT_15Min_1SQU_dc5eab4d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LINKUSDT_15Min_dc5eab4d(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( lowerBB <= 20.3154 )
		if( lowerKC <= 6.89154 )
			if( lowerBB <= 5.00703 )
				if( upperKC <= 5.11747 )
					if( avgHighLow <= 5.03164 )
						if( upperBB <= 5.05977 )
							ret := 0.900000 // buy
						if( upperBB > 5.05977 )
							ret := 0.600000
					if( avgHighLow > 5.03164 )
						ret := -0.636364
				if( upperKC > 5.11747 )
					if( val <= 0.006418 )
						if( val <= -0.008753 )
							ret := 1.000000 // buy
						if( val > -0.008753 )
							if( upperBB <= 5.20814 )
								ret := 1.000000 // buy
							if( upperBB > 5.20814 )
								ret := 0.750000 // buy
					if( val > 0.006418 )
						ret := 0.583333
			if( lowerBB > 5.00703 )
				if( avgHighLow <= 6.855 )
					if( rangema <= 0.043605 )
						if( basis <= 5.93205 )
							if( ma <= 5.84853 )
								if( dev <= 0.054198 )
									ret := 0.117336
								if( dev > 0.054198 )
									ret := -0.194763
							if( ma > 5.84853 )
								if( upperBB <= 5.90065 )
									ret := 0.716216 // buy
								if( upperBB > 5.90065 )
									ret := 0.280303
						if( basis > 5.93205 )
							if( upperBB <= 6.03938 )
								if( val <= -0.00201 )
									ret := -0.313225
								if( val > -0.00201 )
									ret := -0.086314
							if( upperBB > 6.03938 )
								if( val <= 0.006143 )
									ret := -0.003443
								if( val > 0.006143 )
									ret := -0.194915
					if( rangema > 0.043605 )
						if( priceRange <= 0.033948 )
							if( val <= 0.015024 )
								if( dev <= 0.159236 )
									ret := 0.286140
								if( dev > 0.159236 )
									ret := -0.179487
							if( val > 0.015024 )
								if( ma <= 6.6694 )
									ret := -0.838710 // sell
								if( ma > 6.6694 )
									ret := 0.000000
						if( priceRange > 0.033948 )
							if( avgHighLow <= 5.50755 )
								if( rangema <= 0.110625 )
									ret := -0.538462
								if( rangema > 0.110625 )
									ret := -0.964286 // sell
							if( avgHighLow > 5.50755 )
								if( avgHighLow <= 5.7455 )
									ret := 0.604545
								if( avgHighLow > 5.7455 )
									ret := 0.043943
				if( avgHighLow > 6.855 )
					if( avgHighLow <= 6.96401 )
						if( upperKC <= 7.03371 )
							if( ma <= 6.82573 )
								if( val <= 0.010049 )
									ret := -0.696429
								if( val > 0.010049 )
									ret := 0.795455 // buy
							if( ma > 6.82573 )
								if( upperKC <= 6.89159 )
									ret := -0.481481
								if( upperKC > 6.89159 )
									ret := 0.150513
						if( upperKC > 7.03371 )
							if( upperBB <= 7.16105 )
								if( basis <= 6.94916 )
									ret := 0.255682
								if( basis > 6.94916 )
									ret := 0.644654
							if( upperBB > 7.16105 )
								if( lowerBB <= 6.61404 )
									ret := 0.290323
								if( lowerBB > 6.61404 )
									ret := -0.411765
					if( avgHighLow > 6.96401 )
						if( rangema <= 0.07016 )
							if( upperBB <= 7.05405 )
								if( basis <= 6.9703 )
									ret := -0.125000
								if( basis > 6.9703 )
									ret := -0.916667 // sell
							if( upperBB > 7.05405 )
								if( ma <= 6.97844 )
									ret := 0.790000 // buy
								if( ma > 6.97844 )
									ret := 0.297297
						if( rangema > 0.07016 )
							if( avgHighLow <= 7.00842 )
								if( basis <= 6.94625 )
									ret := 0.350000
								if( basis > 6.94625 )
									ret := -0.683486
							if( avgHighLow > 7.00842 )
								if( dev <= 0.220072 )
									ret := -0.157407
								if( dev > 0.220072 )
									ret := 0.676923
		if( lowerKC > 6.89154 )
			if( val <= -0.018041 )
				if( rangema <= 0.123541 )
					if( upperBB <= 14.5444 )
						if( upperBB <= 13.3136 )
							if( upperKC <= 11.8614 )
								if( val <= -0.03069 )
									ret := 0.750000 // buy
								if( val > -0.03069 )
									ret := 0.072250
							if( upperKC > 11.8614 )
								if( dev <= 0.150008 )
									ret := 0.471698
								if( dev > 0.150008 )
									ret := -0.637255
						if( upperBB > 13.3136 )
							if( lowerBB <= 13.3091 )
								if( basis <= 13.4215 )
									ret := 0.922222 // buy
								if( basis > 13.4215 )
									ret := 0.222222
							if( lowerBB > 13.3091 )
								if( avgHighLow <= 13.7432 )
									ret := -0.578947
								if( avgHighLow > 13.7432 )
									ret := 0.357798
					if( upperBB > 14.5444 )
						if( basis <= 14.3417 )
							if( lowerBB <= 14.026 )
								ret := -0.750000 // sell
							if( lowerBB > 14.026 )
								ret := -1.000000 // sell
						if( basis > 14.3417 )
							if( upperKC <= 18.9245 )
								if( dev <= 0.162777 )
									ret := -0.245833
								if( dev > 0.162777 )
									ret := 0.174927
							if( upperKC > 18.9245 )
								if( ma <= 18.8201 )
									ret := -0.913043 // sell
								if( ma > 18.8201 )
									ret := -0.149533
				if( rangema > 0.123541 )
					if( priceRange <= 0.274126 )
						if( upperKC <= 8.36023 )
							if( lowerBB <= 7.07013 )
								ret := 0.333333
							if( lowerBB > 7.07013 )
								if( val <= -0.02248 )
									ret := -0.969697 // sell
								if( val > -0.02248 )
									ret := -0.347826
						if( upperKC > 8.36023 )
							if( dev <= 0.129975 )
								if( val <= -0.023161 )
									ret := -0.785714 // sell
								if( val > -0.023161 )
									ret := 0.170732
							if( dev > 0.129975 )
								if( upperBB <= 9.10371 )
									ret := 0.778523 // buy
								if( upperBB > 9.10371 )
									ret := 0.175772
					if( priceRange > 0.274126 )
						if( lowerBB <= 20.1379 )
							if( upperBB <= 15.8953 )
								if( rangema <= 0.353225 )
									ret := 0.290598
								if( rangema > 0.353225 )
									ret := 1.000000 // buy
							if( upperBB > 15.8953 )
								if( dev <= 0.195017 )
									ret := -0.222222
								if( dev > 0.195017 )
									ret := 0.743590 // buy
						if( lowerBB > 20.1379 )
							ret := -0.642857
			if( val > -0.018041 )
				if( upperBB <= 9.88336 )
					if( rangema <= 0.113962 )
						if( ma <= 8.66659 )
							if( lowerBB <= 8.20627 )
								if( lowerKC <= 7.86509 )
									ret := -0.026199
								if( lowerKC > 7.86509 )
									ret := -0.142755
							if( lowerBB > 8.20627 )
								if( upperBB <= 8.76877 )
									ret := 0.252270
								if( upperBB > 8.76877 )
									ret := -0.392857
						if( ma > 8.66659 )
							if( lowerKC <= 8.8191 )
								if( priceRange <= 0.0785 )
									ret := -0.573770
								if( priceRange > 0.0785 )
									ret := -0.328283
							if( lowerKC > 8.8191 )
								if( ma <= 9.0083 )
									ret := 0.457627
								if( ma > 9.0083 )
									ret := -0.081737
					if( rangema > 0.113962 )
						if( lowerBB <= 8.42976 )
							if( upperKC <= 8.63785 )
								if( upperKC <= 7.42296 )
									ret := -0.879518 // sell
								if( upperKC > 7.42296 )
									ret := -0.395210
							if( upperKC > 8.63785 )
								if( lowerKC <= 8.32123 )
									ret := 0.514286
								if( lowerKC > 8.32123 )
									ret := -0.295964
						if( lowerBB > 8.42976 )
							if( priceRange <= 0.071257 )
								if( upperBB <= 9.12255 )
									ret := -1.000000 // sell
								if( upperBB > 9.12255 )
									ret := 0.645161
							if( priceRange > 0.071257 )
								if( upperKC <= 9.47511 )
									ret := -0.472941
								if( upperKC > 9.47511 )
									ret := -0.791667 // sell
				if( upperBB > 9.88336 )
					if( avgHighLow <= 10.2155 )
						if( lowerBB <= 9.83023 )
							if( val <= 0.020431 )
								if( avgHighLow <= 9.77405 )
									ret := 0.625000
								if( avgHighLow > 9.77405 )
									ret := -0.659420
							if( val > 0.020431 )
								if( lowerBB <= 9.31167 )
									ret := 0.750000 // buy
								if( lowerBB > 9.31167 )
									ret := -0.150000
						if( lowerBB > 9.83023 )
							if( priceRange <= 0.09168 )
								if( rangema <= 0.034665 )
									ret := -0.420290
								if( rangema > 0.034665 )
									ret := 0.250000
							if( priceRange > 0.09168 )
								if( val <= 0.000578 )
									ret := 0.273585
								if( val > 0.000578 )
									ret := 0.808511 // buy
					if( avgHighLow > 10.2155 )
						if( upperKC <= 15.4295 )
							if( val <= 0.021608 )
								if( priceRange <= 0.26654 )
									ret := 0.020825
								if( priceRange > 0.26654 )
									ret := 0.361032
							if( val > 0.021608 )
								if( lowerBB <= 14.8378 )
									ret := -0.140178
								if( lowerBB > 14.8378 )
									ret := -0.756410 // sell
						if( upperKC > 15.4295 )
							if( lowerKC <= 20.2703 )
								if( upperKC <= 20.1471 )
									ret := -0.029451
								if( upperKC > 20.1471 )
									ret := -0.257833
							if( lowerKC > 20.2703 )
								if( priceRange <= 0.349994 )
									ret := 0.630435
								if( priceRange > 0.349994 )
									ret := -0.041667
	if( lowerBB > 20.3154 )
		if( upperBB <= 21.4418 )
			if( lowerKC <= 20.9635 )
				if( basis <= 20.4745 )
					ret := 0.842105 // buy
				if( basis > 20.4745 )
					if( val <= -0.000394 )
						if( ma <= 21.1573 )
							if( dev <= 0.0971 )
								if( basis <= 20.5488 )
									ret := 0.000000
								if( basis > 20.5488 )
									ret := 0.812500 // buy
							if( dev > 0.0971 )
								if( upperBB <= 20.7995 )
									ret := -0.553846
								if( upperBB > 20.7995 )
									ret := -0.231760
						if( ma > 21.1573 )
							ret := 1.000000 // buy
					if( val > -0.000394 )
						if( lowerBB <= 20.6623 )
							if( lowerKC <= 20.4832 )
								if( sqzOnInt <= 0.5 )
									ret := -0.200000
								if( sqzOnInt > 0.5 )
									ret := -0.743243 // sell
							if( lowerKC > 20.4832 )
								if( upperKC <= 20.8748 )
									ret := -0.642857
								if( upperKC > 20.8748 )
									ret := -0.971014 // sell
						if( lowerBB > 20.6623 )
							if( upperKC <= 21.4049 )
								ret := 0.600000
							if( upperKC > 21.4049 )
								ret := -0.384615
			if( lowerKC > 20.9635 )
				if( val <= 0.000788 )
					if( rangema <= 0.092691 )
						ret := -0.888889 // sell
					if( rangema > 0.092691 )
						if( basis <= 21.2898 )
							ret := -1.000000 // sell
						if( basis > 21.2898 )
							ret := -0.888889 // sell
				if( val > 0.000788 )
					ret := -0.363636
		if( upperBB > 21.4418 )
			if( upperBB <= 21.5242 )
				if( avgHighLow <= 20.7888 )
					ret := -0.857143 // sell
				if( avgHighLow > 20.7888 )
					if( dev <= 0.153 )
						if( rangema <= 0.114658 )
							ret := 0.357143
						if( rangema > 0.114658 )
							if( avgHighLow <= 21.3163 )
								ret := 0.300000
							if( avgHighLow > 21.3163 )
								ret := -0.454545
					if( dev > 0.153 )
						if( val <= 0.003875 )
							if( ma <= 21.3255 )
								if( priceRange <= 0.122 )
									ret := 0.100000
								if( priceRange > 0.122 )
									ret := 0.642857
							if( ma > 21.3255 )
								ret := 0.700000 // buy
						if( val > 0.003875 )
							if( priceRange <= 0.164142 )
								ret := 0.727273 // buy
							if( priceRange > 0.164142 )
								if( basis <= 21.281 )
									ret := 1.000000 // buy
								if( basis > 21.281 )
									ret := 0.900000 // buy
			if( upperBB > 21.5242 )
				if( lowerBB <= 21.1527 )
					if( ma <= 21.189 )
						if( avgHighLow <= 21.1841 )
							ret := -0.500000
						if( avgHighLow > 21.1841 )
							ret := 0.714286 // buy
					if( ma > 21.189 )
						if( sqzOffInt <= 0.5 )
							if( priceRange <= 0.274337 )
								if( priceRange <= 0.159118 )
									ret := -0.500000
								if( priceRange > 0.159118 )
									ret := -0.952381 // sell
							if( priceRange > 0.274337 )
								ret := 0.142857
						if( sqzOffInt > 0.5 )
							if( lowerBB <= 20.7402 )
								ret := -1.000000 // sell
							if( lowerBB > 20.7402 )
								ret := -0.818182 // sell
				if( lowerBB > 21.1527 )
					if( val <= 0.002184 )
						ret := 0.400000
					if( val > 0.002184 )
						ret := -0.571429
	
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
float op_operation = decision_tree_0_LINKUSDT_15Min_dc5eab4d(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)

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


