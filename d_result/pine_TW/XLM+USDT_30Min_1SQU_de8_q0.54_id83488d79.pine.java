//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: XLMUSDT_30Min_1SQU_83488d79 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XLMUSDT_30Min_1SQU_83488d79", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XLMUSDT_30Min_83488d79(rangema, avgHighLow, upperKC, lowerBB, noSqzInt, ma, upperBB, lowerKC, basis, sqzOnInt, priceRange, dev, val, sqzOffInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( lowerBB <= 0.6872 )
		if( rangema <= 0.002836 )
			if( lowerKC <= 0.108134 )
				if( dev <= 0.001974 )
					if( lowerBB <= 0.075788 )
						if( upperKC <= 0.077201 )
							if( lowerBB <= 0.073337 )
								if( upperBB <= 0.074921 )
									ret := 0.122649
								if( upperBB > 0.074921 )
									ret := 0.666667
							if( lowerBB > 0.073337 )
								if( ma <= 0.076402 )
									ret := -0.021102
								if( ma > 0.076402 )
									ret := -0.875000 // sell
						if( upperKC > 0.077201 )
							if( rangema <= 0.000535 )
								if( val <= -2.9e-05 )
									ret := 0.000000
								if( val > -2.9e-05 )
									ret := 0.666667
							if( rangema > 0.000535 )
								if( rangema <= 0.001157 )
									ret := 0.812155 // buy
								if( rangema > 0.001157 )
									ret := 0.333333
					if( lowerBB > 0.075788 )
						if( upperBB <= 0.079246 )
							if( upperKC <= 0.078392 )
								if( val <= 1.3e-05 )
									ret := 0.233184
								if( val > 1.3e-05 )
									ret := -0.158470
							if( upperKC > 0.078392 )
								if( val <= -0.000106 )
									ret := 0.433333
								if( val > -0.000106 )
									ret := -0.363636
						if( upperBB > 0.079246 )
							if( upperKC <= 0.081425 )
								if( dev <= 0.000362 )
									ret := -0.416667
								if( dev > 0.000362 )
									ret := 0.275902
							if( upperKC > 0.081425 )
								if( priceRange <= 0.000608 )
									ret := 0.007340
								if( priceRange > 0.000608 )
									ret := 0.083643
				if( dev > 0.001974 )
					if( dev <= 0.003001 )
						if( lowerKC <= 0.093574 )
							if( upperKC <= 0.094212 )
								if( avgHighLow <= 0.091124 )
									ret := 0.178982
								if( avgHighLow > 0.091124 )
									ret := 0.767442 // buy
							if( upperKC > 0.094212 )
								if( rangema <= 0.001082 )
									ret := 0.208333
								if( rangema > 0.001082 )
									ret := -0.645833
						if( lowerKC > 0.093574 )
							if( priceRange <= 0.001112 )
								if( dev <= 0.002672 )
									ret := 0.247525
								if( dev > 0.002672 )
									ret := 0.519231
							if( priceRange > 0.001112 )
								if( avgHighLow <= 0.110957 )
									ret := 0.621429
								if( avgHighLow > 0.110957 )
									ret := -0.437500
					if( dev > 0.003001 )
						if( avgHighLow <= 0.103003 )
							if( avgHighLow <= 0.100005 )
								if( val <= -7.3e-05 )
									ret := -0.112426
								if( val > -7.3e-05 )
									ret := 0.371681
							if( avgHighLow > 0.100005 )
								if( rangema <= 0.001038 )
									ret := 0.000000
								if( rangema > 0.001038 )
									ret := 0.870588 // buy
						if( avgHighLow > 0.103003 )
							if( val <= -0.000179 )
								if( avgHighLow <= 0.108794 )
									ret := 0.754098 // buy
								if( avgHighLow > 0.108794 )
									ret := 0.185185
							if( val > -0.000179 )
								if( priceRange <= 0.003747 )
									ret := -0.320475
								if( priceRange > 0.003747 )
									ret := 0.551724
			if( lowerKC > 0.108134 )
				if( avgHighLow <= 0.129495 )
					if( lowerBB <= 0.109067 )
						if( rangema <= 0.001148 )
							if( val <= 5.8e-05 )
								if( rangema <= 0.00111 )
									ret := -0.210832
								if( rangema > 0.00111 )
									ret := 0.619048
							if( val > 5.8e-05 )
								if( avgHighLow <= 0.110151 )
									ret := 0.248120
								if( avgHighLow > 0.110151 )
									ret := -0.309524
						if( rangema > 0.001148 )
							if( dev <= 0.00152 )
								if( avgHighLow <= 0.11005 )
									ret := -1.000000 // sell
								if( avgHighLow > 0.11005 )
									ret := -0.400000
							if( dev > 0.00152 )
								if( lowerKC <= 0.108296 )
									ret := 0.611111
								if( lowerKC > 0.108296 )
									ret := -0.436620
					if( lowerBB > 0.109067 )
						if( dev <= 0.001357 )
							if( upperBB <= 0.111011 )
								if( lowerBB <= 0.109511 )
									ret := 0.275986
								if( lowerBB > 0.109511 )
									ret := -0.017544
							if( upperBB > 0.111011 )
								if( lowerBB <= 0.109712 )
									ret := -0.338308
								if( lowerBB > 0.109712 )
									ret := -0.001910
						if( dev > 0.001357 )
							if( lowerBB <= 0.12408 )
								if( ma <= 0.125158 )
									ret := 0.084981
								if( ma > 0.125158 )
									ret := -0.219512
							if( lowerBB > 0.12408 )
								if( rangema <= 0.000735 )
									ret := -0.304348
								if( rangema > 0.000735 )
									ret := 0.346491
				if( avgHighLow > 0.129495 )
					if( lowerBB <= 0.132351 )
						if( lowerKC <= 0.130638 )
							if( basis <= 0.129148 )
								if( dev <= 0.004947 )
									ret := -0.617021
								if( dev > 0.004947 )
									ret := 0.888889 // buy
							if( basis > 0.129148 )
								if( lowerBB <= 0.12964 )
									ret := 0.047458
								if( lowerBB > 0.12964 )
									ret := -0.133772
						if( lowerKC > 0.130638 )
							if( ma <= 0.137136 )
								if( upperKC <= 0.135262 )
									ret := -0.485185
								if( upperKC > 0.135262 )
									ret := -0.227425
							if( ma > 0.137136 )
								ret := 1.000000 // buy
					if( lowerBB > 0.132351 )
						if( lowerKC <= 0.138224 )
							if( rangema <= 0.002426 )
								if( rangema <= 0.001449 )
									ret := 0.079887
								if( rangema > 0.001449 )
									ret := 0.410023
							if( rangema > 0.002426 )
								if( sqzOnInt <= 0.5 )
									ret := 0.818182 // buy
								if( sqzOnInt > 0.5 )
									ret := -0.779412 // sell
						if( lowerKC > 0.138224 )
							if( lowerKC <= 0.155284 )
								if( avgHighLow <= 0.150512 )
									ret := -0.070984
								if( avgHighLow > 0.150512 )
									ret := -0.431871
							if( lowerKC > 0.155284 )
								if( lowerBB <= 0.156475 )
									ret := 0.301370
								if( lowerBB > 0.156475 )
									ret := -0.011345
		if( rangema > 0.002836 )
			if( lowerBB <= 0.252738 )
				if( avgHighLow <= 0.224262 )
					if( lowerKC <= 0.194123 )
						if( val <= 0.000156 )
							if( priceRange <= 0.001529 )
								if( rangema <= 0.003522 )
									ret := -0.650000
								if( rangema > 0.003522 )
									ret := 0.384615
							if( priceRange > 0.001529 )
								if( dev <= 0.005737 )
									ret := 0.456923
								if( dev > 0.005737 )
									ret := 0.189964
						if( val > 0.000156 )
							if( ma <= 0.20108 )
								if( upperBB <= 0.194707 )
									ret := 0.111374
								if( upperBB > 0.194707 )
									ret := -0.500000
							if( ma > 0.20108 )
								if( lowerBB <= 0.186542 )
									ret := 0.500000
								if( lowerBB > 0.186542 )
									ret := 1.000000 // buy
					if( lowerKC > 0.194123 )
						if( priceRange <= 0.01442 )
							if( upperKC <= 0.227585 )
								if( ma <= 0.206963 )
									ret := -0.800000 // sell
								if( ma > 0.206963 )
									ret := -0.070707
							if( upperKC > 0.227585 )
								if( basis <= 0.226338 )
									ret := -0.968750 // sell
								if( basis > 0.226338 )
									ret := -0.500000
						if( priceRange > 0.01442 )
							if( dev <= 0.012666 )
								ret := 0.750000 // buy
							if( dev > 0.012666 )
								ret := 1.000000 // buy
				if( avgHighLow > 0.224262 )
					if( lowerKC <= 0.225462 )
						if( rangema <= 0.016725 )
							if( upperBB <= 0.228777 )
								if( avgHighLow <= 0.225022 )
									ret := 0.333333
								if( avgHighLow > 0.225022 )
									ret := -1.000000 // sell
							if( upperBB > 0.228777 )
								if( priceRange <= 0.00143 )
									ret := 0.000000
								if( priceRange > 0.00143 )
									ret := 0.894231 // buy
						if( rangema > 0.016725 )
							ret := -1.000000 // sell
					if( lowerKC > 0.225462 )
						if( lowerBB <= 0.249397 )
							if( upperKC <= 0.239775 )
								if( dev <= 0.004429 )
									ret := -0.730769 // sell
								if( dev > 0.004429 )
									ret := 0.000000
							if( upperKC > 0.239775 )
								if( lowerKC <= 0.232663 )
									ret := 0.613333
								if( lowerKC > 0.232663 )
									ret := 0.109557
						if( lowerBB > 0.249397 )
							if( priceRange <= 0.008466 )
								if( lowerBB <= 0.251414 )
									ret := 0.807229 // buy
								if( lowerBB > 0.251414 )
									ret := 0.481818
							if( priceRange > 0.008466 )
								ret := -1.000000 // sell
			if( lowerBB > 0.252738 )
				if( ma <= 0.259593 )
					if( upperKC <= 0.261821 )
						ret := 0.666667
					if( upperKC > 0.261821 )
						if( lowerBB <= 0.255213 )
							if( val <= 0.000109 )
								if( rangema <= 0.004593 )
									ret := -0.166667
								if( rangema > 0.004593 )
									ret := -1.000000 // sell
							if( val > 0.000109 )
								if( basis <= 0.259427 )
									ret := -0.906977 // sell
								if( basis > 0.259427 )
									ret := -0.636364
						if( lowerBB > 0.255213 )
							if( val <= -0.000268 )
								ret := 1.000000 // buy
							if( val > -0.000268 )
								if( upperKC <= 0.263191 )
									ret := -0.250000
								if( upperKC > 0.263191 )
									ret := 0.000000
				if( ma > 0.259593 )
					if( dev <= 0.006844 )
						if( lowerKC <= 0.299091 )
							if( upperKC <= 0.271483 )
								if( val <= -0.000886 )
									ret := -0.920000 // sell
								if( val > -0.000886 )
									ret := 0.323210
							if( upperKC > 0.271483 )
								if( basis <= 0.269422 )
									ret := -0.403061
								if( basis > 0.269422 )
									ret := 0.005025
						if( lowerKC > 0.299091 )
							if( avgHighLow <= 0.310137 )
								if( lowerBB <= 0.300444 )
									ret := 0.000000
								if( lowerBB > 0.300444 )
									ret := 0.890411 // buy
							if( avgHighLow > 0.310137 )
								if( val <= -0.000117 )
									ret := 0.058961
								if( val > -0.000117 )
									ret := 0.233287
					if( dev > 0.006844 )
						if( val <= -0.003113 )
							if( priceRange <= 0.02531 )
								if( dev <= 0.021326 )
									ret := -0.833333 // sell
								if( dev > 0.021326 )
									ret := 0.835165 // buy
							if( priceRange > 0.02531 )
								if( ma <= 0.389858 )
									ret := -1.000000 // sell
								if( ma > 0.389858 )
									ret := 0.555556
						if( val > -0.003113 )
							if( val <= -0.000923 )
								if( priceRange <= 0.01684 )
									ret := -0.116580
								if( priceRange > 0.01684 )
									ret := 0.290735
							if( val > -0.000923 )
								if( priceRange <= 0.019811 )
									ret := 0.065196
								if( priceRange > 0.019811 )
									ret := -0.175701
	if( lowerBB > 0.6872 )
		if( upperKC <= 0.730463 )
			ret := -0.400000
		if( upperKC > 0.730463 )
			if( dev <= 0.013262 )
				ret := -0.750000 // sell
			if( dev > 0.013262 )
				if( val <= -0.001161 )
					ret := -1.000000 // sell
				if( val > -0.001161 )
					if( upperKC <= 0.776127 )
						ret := -1.000000 // sell
					if( upperKC > 0.776127 )
						ret := -0.750000 // sell
	
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
float op_operation = decision_tree_0_XLMUSDT_30Min_83488d79(rangema, avgHighLow, upperKC, lowerBB, noSqzInt, ma, upperBB, lowerKC, basis, sqzOnInt, priceRange, dev, val, sqzOffInt)

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


