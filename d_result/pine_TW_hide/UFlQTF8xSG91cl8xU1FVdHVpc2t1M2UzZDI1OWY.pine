//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: PYPL_1Hour_1SQU_3e3d259f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PYPL_1Hour_1SQU_3e3d259f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PYPL_1Hour_3e3d259f(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( rangema <= 1.8596 )
		if( upperBB <= 59.3731 )
			if( upperBB <= 57.4197 )
				if( upperKC <= 56.5451 )
					if( rangema <= 0.353883 )
						if( val <= 0.040807 )
							ret := 0.682927
						if( val > 0.040807 )
							ret := 0.080000
					if( rangema > 0.353883 )
						if( priceRange <= 1.984 )
							ret := -0.146552
						if( priceRange > 1.984 )
							ret := 1.000000 // buy
				if( upperKC > 56.5451 )
					if( dev <= 0.291834 )
						if( val <= 0.031486 )
							ret := -1.000000 // sell
						if( val > 0.031486 )
							ret := 0.000000
					if( dev > 0.291834 )
						if( upperKC <= 56.6721 )
							ret := -0.700000 // sell
						if( upperKC > 56.6721 )
							ret := -0.193548
			if( upperBB > 57.4197 )
				if( rangema <= 0.4583 )
					if( ma <= 58.6181 )
						if( avgHighLow <= 58.6167 )
							ret := 0.185484
						if( avgHighLow > 58.6167 )
							ret := -0.446809
					if( ma > 58.6181 )
						if( upperKC <= 59.2688 )
							ret := 0.769231 // buy
						if( upperKC > 59.2688 )
							ret := 0.208955
				if( rangema > 0.4583 )
					if( ma <= 58.4039 )
						if( dev <= 1.21815 )
							ret := 0.882353 // buy
						if( dev > 1.21815 )
							ret := 0.000000
					if( ma > 58.4039 )
						if( lowerKC <= 57.8918 )
							ret := -0.066667
						if( lowerKC > 57.8918 )
							ret := 0.900000 // buy
		if( upperBB > 59.3731 )
			if( dev <= 3.27398 )
				if( lowerKC <= 66.6108 )
					if( basis <= 66.9149 )
						if( dev <= 0.859977 )
							ret := -0.138678
						if( dev > 0.859977 )
							ret := 0.025794
					if( basis > 66.9149 )
						if( avgHighLow <= 67.0446 )
							ret := -0.840580 // sell
						if( avgHighLow > 67.0446 )
							ret := -0.283951
				if( lowerKC > 66.6108 )
					if( basis <= 73.8068 )
						if( avgHighLow <= 72.9064 )
							ret := 0.160133
						if( avgHighLow > 72.9064 )
							ret := 0.409917
					if( basis > 73.8068 )
						if( basis <= 76.8137 )
							ret := -0.244733
						if( basis > 76.8137 )
							ret := -0.003257
			if( dev > 3.27398 )
				if( rangema <= 1.19596 )
					if( priceRange <= 2.85995 )
						if( val <= 0.206174 )
							ret := -0.651246
						if( val > 0.206174 )
							ret := -0.180723
					if( priceRange > 2.85995 )
						ret := 0.750000 // buy
				if( rangema > 1.19596 )
					if( val <= 0.153077 )
						if( rangema <= 1.70909 )
							ret := -0.268431
						if( rangema > 1.70909 )
							ret := 0.090062
					if( val > 0.153077 )
						if( upperBB <= 188.16 )
							ret := 0.397590
						if( upperBB > 188.16 )
							ret := -0.066298
	if( rangema > 1.8596 )
		if( avgHighLow <= 248.183 )
			if( dev <= 3.04586 )
				if( dev <= 1.87868 )
					if( lowerKC <= 131.206 )
						if( priceRange <= 0.722977 )
							ret := 0.000000
						if( priceRange > 0.722977 )
							ret := 0.870968 // buy
					if( lowerKC > 131.206 )
						if( lowerBB <= 234.283 )
							ret := -0.772727 // sell
						if( lowerBB > 234.283 )
							ret := 0.272727
				if( dev > 1.87868 )
					if( upperKC <= 232.434 )
						if( upperBB <= 187.127 )
							ret := 0.554487
						if( upperBB > 187.127 )
							ret := 0.077419
					if( upperKC > 232.434 )
						if( dev <= 3.01384 )
							ret := 0.804054 // buy
						if( dev > 3.01384 )
							ret := 0.000000
			if( dev > 3.04586 )
				if( rangema <= 3.85662 )
					if( lowerKC <= 170.826 )
						if( lowerKC <= 84.9033 )
							ret := 0.651163
						if( lowerKC > 84.9033 )
							ret := -0.178457
					if( lowerKC > 170.826 )
						if( rangema <= 2.08709 )
							ret := -0.044503
						if( rangema > 2.08709 )
							ret := 0.363385
				if( rangema > 3.85662 )
					if( priceRange <= 7.12933 )
						if( dev <= 10.6158 )
							ret := -0.860759 // sell
						if( dev > 10.6158 )
							ret := -0.230769
					if( priceRange > 7.12933 )
						if( lowerKC <= 229.775 )
							ret := 0.250000
						if( lowerKC > 229.775 )
							ret := 0.875000 // buy
		if( avgHighLow > 248.183 )
			if( upperBB <= 259.419 )
				if( dev <= 4.2715 )
					if( avgHighLow <= 250.221 )
						if( lowerBB <= 244.421 )
							ret := -0.347826
						if( lowerBB > 244.421 )
							ret := 0.659091
					if( avgHighLow > 250.221 )
						if( val <= 0.347382 )
							ret := -0.833333 // sell
						if( val > 0.347382 )
							ret := 0.250000
				if( dev > 4.2715 )
					if( priceRange <= 5.77921 )
						if( dev <= 8.77777 )
							ret := -0.830688 // sell
						if( dev > 8.77777 )
							ret := 0.000000
					if( priceRange > 5.77921 )
						ret := 0.500000
			if( upperBB > 259.419 )
				if( avgHighLow <= 258.86 )
					if( rangema <= 4.19755 )
						if( priceRange <= 0.92505 )
							ret := 0.090909
						if( priceRange > 0.92505 )
							ret := 0.803922 // buy
					if( rangema > 4.19755 )
						ret := -0.125000
				if( avgHighLow > 258.86 )
					if( val <= -0.464341 )
						if( upperBB <= 307.97 )
							ret := -0.627119
						if( upperBB > 307.97 )
							ret := 0.857143 // buy
					if( val > -0.464341 )
						if( rangema <= 2.20329 )
							ret := 0.258427
						if( rangema > 2.20329 )
							ret := -0.209709
	
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
float op_operation = decision_tree_0_PYPL_1Hour_3e3d259f(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)

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


