//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: SNOW_15Min_1SQU_14ce6f05 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNOW_15Min_1SQU_14ce6f05", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNOW_15Min_14ce6f05(avgHighLow, priceRange, upperBB, upperKC, sqzOffInt, dev, ma, sqzOnInt, lowerBB, rangema, basis, lowerKC, val, noSqzInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( val <= -0.011029 )
		if( lowerKC <= 136.693 )
			if( basis <= 134.488 )
				if( upperBB <= 132.197 )
					if( priceRange <= 1.22068 )
						if( basis <= 112.543 )
							ret := 0.268097
						if( basis > 112.543 )
							ret := -0.009243
					if( priceRange > 1.22068 )
						if( lowerBB <= 116.515 )
							ret := -0.255556
						if( lowerBB > 116.515 )
							ret := 0.639098
				if( upperBB > 132.197 )
					if( val <= -0.444594 )
						if( priceRange <= 1.07541 )
							ret := -0.583333
						if( priceRange > 1.07541 )
							ret := 0.904762 // buy
					if( val > -0.444594 )
						if( dev <= 5.04626 )
							ret := -0.198745
						if( dev > 5.04626 )
							ret := -0.806122 // sell
			if( basis > 134.488 )
				if( val <= -0.076449 )
					if( lowerKC <= 136.109 )
						if( priceRange <= 0.415 )
							ret := 0.204545
						if( priceRange > 0.415 )
							ret := 0.714894 // buy
					if( lowerKC > 136.109 )
						if( priceRange <= 1.28379 )
							ret := -0.414634
						if( priceRange > 1.28379 )
							ret := 0.818182 // buy
				if( val > -0.076449 )
					if( dev <= 0.87182 )
						if( upperBB <= 135.763 )
							ret := 0.270833
						if( upperBB > 135.763 )
							ret := -0.327731
					if( dev > 0.87182 )
						if( dev <= 1.78473 )
							ret := 0.604278
						if( dev > 1.78473 )
							ret := 0.093333
		if( lowerKC > 136.693 )
			if( rangema <= 2.31422 )
				if( avgHighLow <= 225.951 )
					if( upperBB <= 185.595 )
						if( basis <= 165.905 )
							ret := -0.012196
						if( basis > 165.905 )
							ret := 0.158861
					if( upperBB > 185.595 )
						if( val <= -0.175277 )
							ret := -0.217748
						if( val > -0.175277 )
							ret := 0.004259
				if( avgHighLow > 225.951 )
					if( upperBB <= 231.265 )
						if( rangema <= 0.713435 )
							ret := -0.761905 // sell
						if( rangema > 0.713435 )
							ret := 0.640909
					if( upperBB > 231.265 )
						if( dev <= 3.60078 )
							ret := 0.052087
						if( dev > 3.60078 )
							ret := 0.217465
			if( rangema > 2.31422 )
				if( priceRange <= 6.07384 )
					if( upperKC <= 372.291 )
						if( avgHighLow <= 268.506 )
							ret := 0.016393
						if( avgHighLow > 268.506 )
							ret := -0.150330
					if( upperKC > 372.291 )
						if( priceRange <= 2.04912 )
							ret := 0.093750
						if( priceRange > 2.04912 )
							ret := -0.839623 // sell
				if( priceRange > 6.07384 )
					if( lowerKC <= 343.619 )
						if( rangema <= 7.83807 )
							ret := 0.580071
						if( rangema > 7.83807 )
							ret := -0.411765
					if( lowerKC > 343.619 )
						if( rangema <= 3.45048 )
							ret := -0.916667 // sell
						if( rangema > 3.45048 )
							ret := 0.226667
	if( val > -0.011029 )
		if( avgHighLow <= 232.091 )
			if( lowerBB <= 226.843 )
				if( lowerKC <= 109.096 )
					if( avgHighLow <= 109.452 )
						if( val <= 0.053084 )
							ret := 0.750000 // buy
						if( val > 0.053084 )
							ret := -0.100000
					if( avgHighLow > 109.452 )
						if( avgHighLow <= 111.031 )
							ret := 0.916667 // buy
						if( avgHighLow > 111.031 )
							ret := 0.375000
				if( lowerKC > 109.096 )
					if( val <= 0.466236 )
						if( lowerBB <= 225.416 )
							ret := -0.020842
						if( lowerBB > 225.416 )
							ret := -0.557823
					if( val > 0.466236 )
						if( rangema <= 2.82355 )
							ret := 0.388889
						if( rangema > 2.82355 )
							ret := -0.183206
			if( lowerBB > 226.843 )
				if( lowerKC <= 230.015 )
					if( upperBB <= 235.86 )
						if( dev <= 1.32887 )
							ret := 0.261364
						if( dev > 1.32887 )
							ret := 0.647222
					if( upperBB > 235.86 )
						ret := -0.176471
				if( lowerKC > 230.015 )
					if( lowerBB <= 228.834 )
						if( upperKC <= 234.23 )
							ret := 0.947368 // buy
						if( upperKC > 234.23 )
							ret := 0.307692
					if( lowerBB > 228.834 )
						if( lowerBB <= 231.232 )
							ret := -0.457143
						if( lowerBB > 231.232 )
							ret := 1.000000 // buy
		if( avgHighLow > 232.091 )
			if( lowerBB <= 231.858 )
				if( rangema <= 1.39447 )
					if( avgHighLow <= 234.795 )
						if( upperBB <= 234.613 )
							ret := -0.020833
						if( upperBB > 234.613 )
							ret := 0.555556
					if( avgHighLow > 234.795 )
						ret := -0.846154 // sell
				if( rangema > 1.39447 )
					if( avgHighLow <= 236.743 )
						if( lowerKC <= 224.186 )
							ret := 0.900000 // buy
						if( lowerKC > 224.186 )
							ret := -0.779762 // sell
					if( avgHighLow > 236.743 )
						if( upperKC <= 242.678 )
							ret := 0.519231
						if( upperKC > 242.678 )
							ret := -1.000000 // sell
			if( lowerBB > 231.858 )
				if( lowerKC <= 349.576 )
					if( val <= 0.257414 )
						if( upperBB <= 234.842 )
							ret := -0.970588 // sell
						if( upperBB > 234.842 )
							ret := -0.024297
					if( val > 0.257414 )
						if( upperBB <= 358.05 )
							ret := -0.168732
						if( upperBB > 358.05 )
							ret := 0.510417
				if( lowerKC > 349.576 )
					if( ma <= 357.903 )
						if( lowerBB <= 351.422 )
							ret := -0.803030 // sell
						if( lowerBB > 351.422 )
							ret := -0.466258
					if( ma > 357.903 )
						if( dev <= 2.5717 )
							ret := -0.625000
						if( dev > 2.5717 )
							ret := -0.052734
	
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
float op_operation = decision_tree_0_SNOW_15Min_14ce6f05(avgHighLow, priceRange, upperBB, upperKC, sqzOffInt, dev, ma, sqzOnInt, lowerBB, rangema, basis, lowerKC, val, noSqzInt)

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


