//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: XRPUSDT_30Min_1SQU_0f147950 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XRPUSDT_30Min_1SQU_0f147950", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XRPUSDT_30Min_0f147950(rangema, avgHighLow, upperKC, lowerBB, noSqzInt, ma, upperBB, lowerKC, basis, sqzOnInt, priceRange, dev, val, sqzOffInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( val <= 0.002727 )
		if( rangema <= 0.045207 )
			if( lowerBB <= 0.233262 )
				if( val <= 0.000249 )
					if( rangema <= 0.001331 )
						if( lowerBB <= 0.230013 )
							if( basis <= 0.231635 )
								ret := -0.500000
							if( basis > 0.231635 )
								ret := -1.000000 // sell
						if( lowerBB > 0.230013 )
							if( avgHighLow <= 0.231515 )
								if( ma <= 0.23169 )
									ret := 0.000000
								if( ma > 0.23169 )
									ret := 0.866667 // buy
							if( avgHighLow > 0.231515 )
								if( ma <= 0.232446 )
									ret := -0.282609
								if( ma > 0.232446 )
									ret := 0.188235
					if( rangema > 0.001331 )
						if( dev <= 0.005052 )
							if( avgHighLow <= 0.235448 )
								if( priceRange <= 0.006225 )
									ret := 0.672316
								if( priceRange > 0.006225 )
									ret := -0.117647
							if( avgHighLow > 0.235448 )
								if( upperBB <= 0.238742 )
									ret := -0.857143 // sell
								if( upperBB > 0.238742 )
									ret := 0.551724
						if( dev > 0.005052 )
							if( val <= 0.00019 )
								if( priceRange <= 0.002725 )
									ret := -0.203704
								if( priceRange > 0.002725 )
									ret := 0.401384
							if( val > 0.00019 )
								if( lowerBB <= 0.219729 )
									ret := -0.764706 // sell
								if( lowerBB > 0.219729 )
									ret := 0.166667
				if( val > 0.000249 )
					if( upperKC <= 0.221276 )
						if( basis <= 0.205479 )
							ret := 0.000000
						if( basis > 0.205479 )
							if( upperKC <= 0.220945 )
								ret := 1.000000 // buy
							if( upperKC > 0.220945 )
								ret := 0.600000
					if( upperKC > 0.221276 )
						if( priceRange <= 0.003377 )
							if( avgHighLow <= 0.220475 )
								ret := -1.000000 // sell
							if( avgHighLow > 0.220475 )
								if( avgHighLow <= 0.235817 )
									ret := 0.413333
								if( avgHighLow > 0.235817 )
									ret := -0.200000
						if( priceRange > 0.003377 )
							if( lowerKC <= 0.184103 )
								ret := 1.000000 // buy
							if( lowerKC > 0.184103 )
								if( rangema <= 0.004589 )
									ret := -0.188679
								if( rangema > 0.004589 )
									ret := -0.768519 // sell
			if( lowerBB > 0.233262 )
				if( upperKC <= 1.59726 )
					if( dev <= 0.043884 )
						if( avgHighLow <= 0.611099 )
							if( priceRange <= 0.002725 )
								if( val <= 0.000613 )
									ret := 0.023608
								if( val > 0.000613 )
									ret := -0.117851
							if( priceRange > 0.002725 )
								if( lowerKC <= 0.605774 )
									ret := 0.090963
								if( lowerKC > 0.605774 )
									ret := 0.612613
						if( avgHighLow > 0.611099 )
							if( lowerBB <= 0.604145 )
								if( priceRange <= 0.017005 )
									ret := -0.419028
								if( priceRange > 0.017005 )
									ret := 0.129630
							if( lowerBB > 0.604145 )
								if( priceRange <= 0.008016 )
									ret := -0.021902
								if( priceRange > 0.008016 )
									ret := 0.083076
					if( dev > 0.043884 )
						if( priceRange <= 0.022113 )
							if( rangema <= 0.019051 )
								if( lowerBB <= 0.957417 )
									ret := 0.350427
								if( lowerBB > 0.957417 )
									ret := -0.421053
							if( rangema > 0.019051 )
								if( rangema <= 0.023227 )
									ret := -0.429293
								if( rangema > 0.023227 )
									ret := 0.096447
						if( priceRange > 0.022113 )
							if( lowerKC <= 1.49353 )
								if( val <= -0.006242 )
									ret := -0.604651
								if( val > -0.006242 )
									ret := 0.349235
							if( lowerKC > 1.49353 )
								if( avgHighLow <= 1.5171 )
									ret := 0.750000 // buy
								if( avgHighLow > 1.5171 )
									ret := -0.894737 // sell
				if( upperKC > 1.59726 )
					if( val <= -0.000757 )
						if( avgHighLow <= 1.71887 )
							if( rangema <= 0.031414 )
								if( sqzOffInt <= 0.5 )
									ret := -0.541667
								if( sqzOffInt > 0.5 )
									ret := 0.106383
							if( rangema > 0.031414 )
								if( priceRange <= 0.021371 )
									ret := 0.891892 // buy
								if( priceRange > 0.021371 )
									ret := 0.159091
						if( avgHighLow > 1.71887 )
							if( upperBB <= 1.81821 )
								if( priceRange <= 0.042742 )
									ret := -0.964286 // sell
								if( priceRange > 0.042742 )
									ret := -0.333333
							if( upperBB > 1.81821 )
								ret := 0.000000
					if( val > -0.000757 )
						if( upperBB <= 1.61398 )
							if( dev <= 0.014845 )
								if( val <= -6.2e-05 )
									ret := -0.750000 // sell
								if( val > -6.2e-05 )
									ret := -1.000000 // sell
							if( dev > 0.014845 )
								if( rangema <= 0.021584 )
									ret := 0.411765
								if( rangema > 0.021584 )
									ret := -0.442308
						if( upperBB > 1.61398 )
							if( lowerBB <= 1.56636 )
								if( val <= -0.000434 )
									ret := -0.250000
								if( val > -0.000434 )
									ret := -0.881720 // sell
							if( lowerBB > 1.56636 )
								if( lowerKC <= 1.55818 )
									ret := 1.000000 // buy
								if( lowerKC > 1.55818 )
									ret := -0.451613
		if( rangema > 0.045207 )
			if( upperKC <= 1.95227 )
				if( lowerBB <= 0.589113 )
					if( dev <= 0.17088 )
						if( rangema <= 0.063334 )
							ret := -1.000000 // sell
						if( rangema > 0.063334 )
							ret := -0.750000 // sell
					if( dev > 0.17088 )
						if( upperKC <= 0.638479 )
							ret := 1.000000 // buy
						if( upperKC > 0.638479 )
							ret := 0.142857
				if( lowerBB > 0.589113 )
					if( upperBB <= 1.37068 )
						if( dev <= 0.052444 )
							if( val <= -0.004141 )
								ret := 0.600000
							if( val > -0.004141 )
								if( priceRange <= 0.04373 )
									ret := -1.000000 // sell
								if( priceRange > 0.04373 )
									ret := 0.000000
						if( dev > 0.052444 )
							if( val <= 0.001538 )
								if( rangema <= 0.049043 )
									ret := 0.661017
								if( rangema > 0.049043 )
									ret := 0.875000 // buy
							if( val > 0.001538 )
								if( val <= 0.002174 )
									ret := -0.333333
								if( val > 0.002174 )
									ret := 0.785714 // buy
					if( upperBB > 1.37068 )
						if( ma <= 1.29367 )
							if( avgHighLow <= 1.16694 )
								ret := 0.500000
							if( avgHighLow > 1.16694 )
								ret := -1.000000 // sell
						if( ma > 1.29367 )
							if( lowerBB <= 1.40156 )
								if( lowerBB <= 1.37019 )
									ret := 0.224806
								if( lowerBB > 1.37019 )
									ret := -0.766667 // sell
							if( lowerBB > 1.40156 )
								if( lowerKC <= 1.65192 )
									ret := 0.674419
								if( lowerKC > 1.65192 )
									ret := 0.222222
			if( upperKC > 1.95227 )
				ret := -1.000000 // sell
	if( val > 0.002727 )
		if( avgHighLow <= 1.58964 )
			if( avgHighLow <= 1.43786 )
				if( upperBB <= 0.87261 )
					if( lowerBB <= 0.635292 )
						if( rangema <= 0.01691 )
							if( priceRange <= 0.02907 )
								if( priceRange <= 0.008983 )
									ret := -0.371429
								if( priceRange > 0.008983 )
									ret := -0.737705 // sell
							if( priceRange > 0.02907 )
								ret := 0.750000 // buy
						if( rangema > 0.01691 )
							if( dev <= 0.021196 )
								if( rangema <= 0.021099 )
									ret := 0.875000 // buy
								if( rangema > 0.021099 )
									ret := 0.333333
							if( dev > 0.021196 )
								if( priceRange <= 0.057755 )
									ret := -0.079787
								if( priceRange > 0.057755 )
									ret := -1.000000 // sell
					if( lowerBB > 0.635292 )
						if( upperKC <= 0.804343 )
							if( ma <= 0.762928 )
								if( val <= 0.00281 )
									ret := -0.500000
								if( val > 0.00281 )
									ret := 0.614035
							if( ma > 0.762928 )
								if( ma <= 0.77161 )
									ret := -0.750000 // sell
								if( ma > 0.77161 )
									ret := -1.000000 // sell
						if( upperKC > 0.804343 )
							if( basis <= 0.829915 )
								if( rangema <= 0.017218 )
									ret := 0.500000
								if( rangema > 0.017218 )
									ret := 0.979167 // buy
							if( basis > 0.829915 )
								ret := -0.600000
				if( upperBB > 0.87261 )
					if( rangema <= 0.033355 )
						if( dev <= 0.015771 )
							if( ma <= 0.94832 )
								if( dev <= 0.013819 )
									ret := 0.750000 // buy
								if( dev > 0.013819 )
									ret := 1.000000 // buy
							if( ma > 0.94832 )
								if( lowerKC <= 0.934826 )
									ret := 0.000000
								if( lowerKC > 0.934826 )
									ret := -0.750000 // sell
						if( dev > 0.015771 )
							if( lowerKC <= 0.881287 )
								if( dev <= 0.027165 )
									ret := -0.484848
								if( dev > 0.027165 )
									ret := -0.890244 // sell
							if( lowerKC > 0.881287 )
								if( lowerKC <= 0.9085 )
									ret := 0.476190
								if( lowerKC > 0.9085 )
									ret := -0.544444
					if( rangema > 0.033355 )
						if( upperBB <= 1.11578 )
							if( upperBB <= 0.97205 )
								if( val <= 0.003304 )
									ret := 0.666667
								if( val > 0.003304 )
									ret := -0.484848
							if( upperBB > 0.97205 )
								if( avgHighLow <= 0.976848 )
									ret := -0.972222 // sell
								if( avgHighLow > 0.976848 )
									ret := -0.565217
						if( upperBB > 1.11578 )
							if( basis <= 1.29826 )
								if( rangema <= 0.06893 )
									ret := 0.613793
								if( rangema > 0.06893 )
									ret := -0.461538
							if( basis > 1.29826 )
								if( val <= 0.004007 )
									ret := 0.206897
								if( val > 0.004007 )
									ret := -0.740000 // sell
			if( avgHighLow > 1.43786 )
				if( upperKC <= 1.70443 )
					if( ma <= 1.42705 )
						if( priceRange <= 0.085626 )
							if( upperBB <= 1.48689 )
								ret := 0.750000 // buy
							if( upperBB > 1.48689 )
								ret := 1.000000 // buy
						if( priceRange > 0.085626 )
							ret := 0.000000
					if( ma > 1.42705 )
						if( upperBB <= 1.58225 )
							if( val <= 0.003009 )
								ret := 0.600000
							if( val > 0.003009 )
								if( priceRange <= 0.04065 )
									ret := -0.904762 // sell
								if( priceRange > 0.04065 )
									ret := -0.142857
						if( upperBB > 1.58225 )
							if( dev <= 0.086132 )
								if( avgHighLow <= 1.57564 )
									ret := 0.857143 // buy
								if( avgHighLow > 1.57564 )
									ret := -0.428571
							if( dev > 0.086132 )
								if( dev <= 0.133647 )
									ret := 0.967742 // buy
								if( dev > 0.133647 )
									ret := 0.000000
				if( upperKC > 1.70443 )
					if( basis <= 1.606 )
						ret := 0.200000
					if( basis > 1.606 )
						ret := -1.000000 // sell
		if( avgHighLow > 1.58964 )
			if( avgHighLow <= 1.71034 )
				if( lowerBB <= 1.66135 )
					if( upperBB <= 1.67817 )
						if( ma <= 1.59349 )
							ret := -1.000000 // sell
						if( ma > 1.59349 )
							ret := 0.000000
					if( upperBB > 1.67817 )
						ret := -1.000000 // sell
				if( lowerBB > 1.66135 )
					ret := -0.250000
			if( avgHighLow > 1.71034 )
				if( ma <= 1.74312 )
					if( priceRange <= 0.03491 )
						ret := 1.000000 // buy
					if( priceRange > 0.03491 )
						ret := 0.600000
				if( ma > 1.74312 )
					if( priceRange <= 0.029952 )
						ret := -0.500000
					if( priceRange > 0.029952 )
						if( lowerBB <= 1.71691 )
							ret := -1.000000 // sell
						if( lowerBB > 1.71691 )
							if( dev <= 0.100996 )
								ret := -0.500000
							if( dev > 0.100996 )
								ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_XRPUSDT_30Min_0f147950(rangema, avgHighLow, upperKC, lowerBB, noSqzInt, ma, upperBB, lowerKC, basis, sqzOnInt, priceRange, dev, val, sqzOffInt)

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


