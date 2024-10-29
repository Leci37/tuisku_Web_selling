//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: SOLUSDT_30Min_1SQU_93cad76e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SOLUSDT_30Min_1SQU_93cad76e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SOLUSDT_30Min_93cad76e(avgHighLow, priceRange, upperBB, upperKC, sqzOffInt, dev, ma, sqzOnInt, lowerBB, rangema, basis, lowerKC, val, noSqzInt)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( upperKC <= 1.3592 )
		if( rangema <= 0.022977 )
			if( upperKC <= 1.3522 )
				if( val <= 0.000926 )
					if( upperKC <= 1.33434 )
						if( dev <= 0.024481 )
							ret := 1.000000 // buy
						if( dev > 0.024481 )
							ret := 0.625000
					if( upperKC > 1.33434 )
						ret := 0.636364
				if( val > 0.000926 )
					ret := -0.285714
			if( upperKC > 1.3522 )
				ret := 1.000000 // buy
		if( rangema > 0.022977 )
			if( priceRange <= 0.024778 )
				if( sqzOnInt <= 0.5 )
					ret := -1.000000 // sell
				if( sqzOnInt > 0.5 )
					if( avgHighLow <= 1.2435 )
						ret := -0.571429
					if( avgHighLow > 1.2435 )
						ret := 0.846154 // buy
			if( priceRange > 0.024778 )
				if( dev <= 0.07344 )
					ret := 0.181818
				if( dev > 0.07344 )
					if( priceRange <= 0.041202 )
						ret := 0.769231 // buy
					if( priceRange > 0.041202 )
						ret := 1.000000 // buy
	if( upperKC > 1.3592 )
		if( ma <= 146.542 )
			if( priceRange <= 0.023194 )
				if( rangema <= 0.033841 )
					if( avgHighLow <= 1.36538 )
						if( avgHighLow <= 1.3421 )
							if( lowerBB <= 1.28664 )
								ret := -1.000000 // sell
							if( lowerBB > 1.28664 )
								if( lowerKC <= 1.31554 )
									ret := 0.416667
								if( lowerKC > 1.31554 )
									ret := 0.000000
						if( avgHighLow > 1.3421 )
							if( basis <= 1.34521 )
								ret := 0.428571
							if( basis > 1.34521 )
								if( dev <= 0.033303 )
									ret := 0.400000
								if( dev > 0.033303 )
									ret := 0.970588 // buy
					if( avgHighLow > 1.36538 )
						if( upperKC <= 1.39435 )
							if( upperBB <= 1.38269 )
								if( rangema <= 0.015117 )
									ret := -1.000000 // sell
								if( rangema > 0.015117 )
									ret := -0.916667 // sell
							if( upperBB > 1.38269 )
								ret := -0.777778 // sell
						if( upperKC > 1.39435 )
							if( lowerKC <= 1.37979 )
								if( basis <= 1.37336 )
									ret := -0.571429
								if( basis > 1.37336 )
									ret := 0.401639
							if( lowerKC > 1.37979 )
								if( lowerKC <= 2.89093 )
									ret := -0.183242
								if( lowerKC > 2.89093 )
									ret := -0.593220
				if( rangema > 0.033841 )
					if( avgHighLow <= 2.26512 )
						if( upperBB <= 2.2474 )
							if( lowerKC <= 1.8591 )
								if( val <= 0.005179 )
									ret := 0.528090
								if( val > 0.005179 )
									ret := -0.500000
							if( lowerKC > 1.8591 )
								if( upperBB <= 2.19334 )
									ret := -0.040816
								if( upperBB > 2.19334 )
									ret := -0.642857
						if( upperBB > 2.2474 )
							if( sqzOffInt <= 0.5 )
								ret := 0.750000 // buy
							if( sqzOffInt > 0.5 )
								ret := 1.000000 // buy
					if( avgHighLow > 2.26512 )
						if( dev <= 0.067071 )
							if( priceRange <= 0.020771 )
								if( avgHighLow <= 3.12212 )
									ret := 0.675676
								if( avgHighLow > 3.12212 )
									ret := 0.185185
							if( priceRange > 0.020771 )
								if( avgHighLow <= 2.95755 )
									ret := 0.133333
								if( avgHighLow > 2.95755 )
									ret := -0.300000
						if( dev > 0.067071 )
							if( lowerKC <= 2.46706 )
								if( lowerKC <= 2.3853 )
									ret := -0.428571
								if( lowerKC > 2.3853 )
									ret := -1.000000 // sell
							if( lowerKC > 2.46706 )
								if( basis <= 2.66139 )
									ret := 0.666667
								if( basis > 2.66139 )
									ret := -0.271186
			if( priceRange > 0.023194 )
				if( basis <= 2.1177 )
					if( upperKC <= 2.10204 )
						if( upperBB <= 2.06009 )
							if( rangema <= 0.034565 )
								if( avgHighLow <= 1.94865 )
									ret := 0.098390
								if( avgHighLow > 1.94865 )
									ret := -0.281250
							if( rangema > 0.034565 )
								if( val <= 0.013097 )
									ret := 0.498925
								if( val > 0.013097 )
									ret := -1.000000 // sell
						if( upperBB > 2.06009 )
							if( lowerKC <= 1.97796 )
								if( upperKC <= 2.05441 )
									ret := -0.666667
								if( upperKC > 2.05441 )
									ret := 0.761905 // buy
							if( lowerKC > 1.97796 )
								if( basis <= 2.03075 )
									ret := -0.782609 // sell
								if( basis > 2.03075 )
									ret := -0.318841
					if( upperKC > 2.10204 )
						if( val <= 0.008155 )
							if( rangema <= 0.053935 )
								if( upperKC <= 2.15534 )
									ret := 0.607143
								if( upperKC > 2.15534 )
									ret := -0.146067
							if( rangema > 0.053935 )
								if( dev <= 0.232737 )
									ret := 0.807910 // buy
								if( dev > 0.232737 )
									ret := -0.111111
						if( val > 0.008155 )
							if( basis <= 2.05453 )
								if( dev <= 0.110939 )
									ret := 0.357143
								if( dev > 0.110939 )
									ret := 0.900000 // buy
							if( basis > 2.05453 )
								if( lowerKC <= 1.93319 )
									ret := 0.538462
								if( lowerKC > 1.93319 )
									ret := -0.627451
				if( basis > 2.1177 )
					if( rangema <= 0.032495 )
						if( val <= -0.00457 )
							if( avgHighLow <= 2.56528 )
								if( lowerKC <= 2.4952 )
									ret := 0.395349
								if( lowerKC > 2.4952 )
									ret := 0.909091 // buy
							if( avgHighLow > 2.56528 )
								if( upperKC <= 2.97592 )
									ret := 0.000000
								if( upperKC > 2.97592 )
									ret := -0.600000
						if( val > -0.00457 )
							if( dev <= 0.052872 )
								if( basis <= 2.12603 )
									ret := 0.520000
								if( basis > 2.12603 )
									ret := -0.249292
							if( dev > 0.052872 )
								if( dev <= 0.062507 )
									ret := -0.807229 // sell
								if( dev > 0.062507 )
									ret := -0.366972
					if( rangema > 0.032495 )
						if( upperBB <= 152.091 )
							if( priceRange <= 1.12833 )
								if( upperKC <= 24.6216 )
									ret := 0.030692
								if( upperKC > 24.6216 )
									ret := -0.021524
							if( priceRange > 1.12833 )
								if( avgHighLow <= 14.4796 )
									ret := 0.900000 // buy
								if( avgHighLow > 14.4796 )
									ret := 0.051886
						if( upperBB > 152.091 )
							if( upperBB <= 155.385 )
								if( ma <= 145.717 )
									ret := -0.285714
								if( ma > 145.717 )
									ret := 0.891304 // buy
							if( upperBB > 155.385 )
								ret := 1.000000 // buy
		if( ma > 146.542 )
			if( upperKC <= 155.851 )
				if( lowerBB <= 142.351 )
					if( avgHighLow <= 144.993 )
						ret := -1.000000 // sell
					if( avgHighLow > 144.993 )
						if( lowerBB <= 140.299 )
							if( ma <= 147.391 )
								ret := 1.000000 // buy
							if( ma > 147.391 )
								ret := 0.888889 // buy
						if( lowerBB > 140.299 )
							if( val <= -0.05429 )
								ret := 0.176471
							if( val > -0.05429 )
								if( val <= 0.215105 )
									ret := 1.000000 // buy
								if( val > 0.215105 )
									ret := 0.641026
				if( lowerBB > 142.351 )
					if( val <= -0.043661 )
						if( upperBB <= 154.691 )
							if( dev <= 2.98702 )
								if( dev <= 1.90325 )
									ret := -0.253644
								if( dev > 1.90325 )
									ret := -0.515244
							if( dev > 2.98702 )
								if( sqzOffInt <= 0.5 )
									ret := 0.532258
								if( sqzOffInt > 0.5 )
									ret := -0.401869
						if( upperBB > 154.691 )
							if( upperKC <= 154.219 )
								if( val <= -0.136218 )
									ret := -0.730769 // sell
								if( val > -0.136218 )
									ret := -1.000000 // sell
							if( upperKC > 154.219 )
								if( upperKC <= 155.685 )
									ret := -0.370000
								if( upperKC > 155.685 )
									ret := -0.939394 // sell
					if( val > -0.043661 )
						if( upperKC <= 152.875 )
							if( upperKC <= 150.273 )
								if( lowerKC <= 144.459 )
									ret := -0.675676
								if( lowerKC > 144.459 )
									ret := -0.168790
							if( upperKC > 150.273 )
								if( basis <= 150.792 )
									ret := 0.076167
								if( basis > 150.792 )
									ret := 0.950000 // buy
						if( upperKC > 152.875 )
							if( upperBB <= 153.176 )
								if( avgHighLow <= 150.969 )
									ret := -0.812500 // sell
								if( avgHighLow > 150.969 )
									ret := -0.428571
							if( upperBB > 153.176 )
								if( lowerKC <= 145.26 )
									ret := -1.000000 // sell
								if( lowerKC > 145.26 )
									ret := -0.199187
			if( upperKC > 155.851 )
				if( lowerBB <= 155.64 )
					if( val <= -0.089995 )
						if( basis <= 159.644 )
							if( basis <= 156.543 )
								if( priceRange <= 4.00921 )
									ret := -0.281818
								if( priceRange > 4.00921 )
									ret := 0.684211
							if( basis > 156.543 )
								if( val <= -0.291562 )
									ret := 0.736264 // buy
								if( val > -0.291562 )
									ret := -0.007692
						if( basis > 159.644 )
							if( upperKC <= 166.816 )
								if( dev <= 7.11407 )
									ret := -0.978261 // sell
								if( dev > 7.11407 )
									ret := -0.500000
							if( upperKC > 166.816 )
								if( ma <= 163.785 )
									ret := 0.500000
								if( ma > 163.785 )
									ret := -0.684211
					if( val > -0.089995 )
						if( ma <= 156.777 )
							if( avgHighLow <= 154.285 )
								if( priceRange <= 1.12 )
									ret := 0.857143 // buy
								if( priceRange > 1.12 )
									ret := 0.318182
							if( avgHighLow > 154.285 )
								if( val <= -0.040681 )
									ret := 0.536585
								if( val > -0.040681 )
									ret := -0.095023
						if( ma > 156.777 )
							if( rangema <= 6.14 )
								if( basis <= 162.921 )
									ret := 0.482639
								if( basis > 162.921 )
									ret := -0.384615
							if( rangema > 6.14 )
								ret := 1.000000 // buy
				if( lowerBB > 155.64 )
					if( dev <= 5.99798 )
						if( sqzOffInt <= 0.5 )
							if( val <= -0.385342 )
								if( ma <= 182.029 )
									ret := 0.553763
								if( ma > 182.029 )
									ret := -0.046099
							if( val > -0.385342 )
								if( lowerBB <= 233.872 )
									ret := -0.020991
								if( lowerBB > 233.872 )
									ret := -0.244898
						if( sqzOffInt > 0.5 )
							if( val <= -0.275107 )
								if( basis <= 192.705 )
									ret := 0.235294
								if( basis > 192.705 )
									ret := -0.151515
							if( val > -0.275107 )
								if( upperKC <= 224.945 )
									ret := -0.148325
								if( upperKC > 224.945 )
									ret := -0.401709
					if( dev > 5.99798 )
						if( upperKC <= 193.298 )
							if( upperBB <= 170.415 )
								ret := -0.928571 // sell
							if( upperBB > 170.415 )
								if( sqzOnInt <= 0.5 )
									ret := 0.430233
								if( sqzOnInt > 0.5 )
									ret := -0.197183
						if( upperKC > 193.298 )
							if( dev <= 8.03263 )
								if( upperBB <= 194.626 )
									ret := -0.740741 // sell
								if( upperBB > 194.626 )
									ret := 0.271071
							if( dev > 8.03263 )
								if( lowerKC <= 201.901 )
									ret := -0.226804
								if( lowerKC > 201.901 )
									ret := -0.555556
	
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
float op_operation = decision_tree_0_SOLUSDT_30Min_93cad76e(avgHighLow, priceRange, upperBB, upperKC, sqzOffInt, dev, ma, sqzOnInt, lowerBB, rangema, basis, lowerKC, val, noSqzInt)

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


