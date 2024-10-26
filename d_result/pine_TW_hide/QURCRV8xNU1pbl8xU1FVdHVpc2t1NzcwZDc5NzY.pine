//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: ADBE_15Min_1SQU_770d7976 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADBE_15Min_1SQU_770d7976", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADBE_15Min_770d7976(val, sqzOnInt, lowerBB, lowerKC, upperKC, dev, rangema, sqzOffInt, upperBB, priceRange, noSqzInt, ma, basis, avgHighLow)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( lowerKC <= 671.4 )
		if( val <= 0.265776 )
			if( dev <= 4.03768 )
				if( upperBB <= 512.149 )
					if( avgHighLow <= 507.97 )
						if( dev <= 2.34031 )
							if( upperBB <= 491.343 )
								if( upperBB <= 487.673 )
									ret := 0.016164
								if( upperBB > 487.673 )
									ret := -0.371134
							if( upperBB > 491.343 )
								if( upperKC <= 502.79 )
									ret := 0.248396
								if( upperKC > 502.79 )
									ret := -0.167702
						if( dev > 2.34031 )
							if( upperBB <= 226.781 )
								if( priceRange <= 2.88408 )
									ret := 0.377863
								if( priceRange > 2.88408 )
									ret := -0.410714
							if( upperBB > 226.781 )
								if( upperBB <= 231.366 )
									ret := -0.356667
								if( upperBB > 231.366 )
									ret := 0.067805
					if( avgHighLow > 507.97 )
						if( upperBB <= 510.29 )
							if( dev <= 1.58229 )
								ret := 0.750000 // buy
							if( dev > 1.58229 )
								ret := -0.062500
						if( upperBB > 510.29 )
							if( rangema <= 1.76973 )
								if( avgHighLow <= 509.592 )
									ret := 0.914634 // buy
								if( avgHighLow > 509.592 )
									ret := 0.800000 // buy
							if( rangema > 1.76973 )
								if( val <= -0.008594 )
									ret := 0.833333 // buy
								if( val > -0.008594 )
									ret := 0.230769
				if( upperBB > 512.149 )
					if( lowerBB <= 524.658 )
						if( dev <= 1.80496 )
							if( lowerBB <= 522.022 )
								if( basis <= 511.151 )
									ret := -0.830986 // sell
								if( basis > 511.151 )
									ret := -0.034247
							if( lowerBB > 522.022 )
								if( upperBB <= 525.642 )
									ret := -0.881579 // sell
								if( upperBB > 525.642 )
									ret := -0.422222
						if( dev > 1.80496 )
							if( lowerKC <= 505.391 )
								ret := 1.000000 // buy
							if( lowerKC > 505.391 )
								if( priceRange <= 2.59098 )
									ret := -0.021774
								if( priceRange > 2.59098 )
									ret := -0.204214
					if( lowerBB > 524.658 )
						if( lowerKC <= 560.404 )
							if( lowerBB <= 555.539 )
								if( lowerBB <= 525.573 )
									ret := 0.614286
								if( lowerBB > 525.573 )
									ret := 0.008417
							if( lowerBB > 555.539 )
								if( upperBB <= 564.998 )
									ret := 0.384473
								if( upperBB > 564.998 )
									ret := -0.134831
						if( lowerKC > 560.404 )
							if( priceRange <= 1.346 )
								if( avgHighLow <= 672.245 )
									ret := 0.049760
								if( avgHighLow > 672.245 )
									ret := 0.794118 // buy
							if( priceRange > 1.346 )
								if( upperBB <= 595.221 )
									ret := -0.241660
								if( upperBB > 595.221 )
									ret := -0.011202
			if( dev > 4.03768 )
				if( rangema <= 6.79263 )
					if( lowerBB <= 324.187 )
						if( priceRange <= 2.1633 )
							if( upperKC <= 314.114 )
								if( upperKC <= 307.88 )
									ret := -0.130295
								if( upperKC > 307.88 )
									ret := 0.250000
							if( upperKC > 314.114 )
								if( upperBB <= 340.511 )
									ret := -0.627832
								if( upperBB > 340.511 )
									ret := 0.125000
						if( priceRange > 2.1633 )
							if( dev <= 4.85334 )
								if( rangema <= 2.72326 )
									ret := 0.085714
								if( rangema > 2.72326 )
									ret := 0.673077
							if( dev > 4.85334 )
								if( lowerKC <= 320.059 )
									ret := -0.071121
								if( lowerKC > 320.059 )
									ret := -0.795918 // sell
					if( lowerBB > 324.187 )
						if( avgHighLow <= 386.002 )
							if( upperBB <= 385.818 )
								if( dev <= 12.2498 )
									ret := 0.058462
								if( dev > 12.2498 )
									ret := -0.967742 // sell
							if( upperBB > 385.818 )
								if( avgHighLow <= 383.425 )
									ret := 0.866142 // buy
								if( avgHighLow > 383.425 )
									ret := 0.456311
						if( avgHighLow > 386.002 )
							if( basis <= 398.76 )
								if( lowerBB <= 389.575 )
									ret := -0.270992
								if( lowerBB > 389.575 )
									ret := -0.833333 // sell
							if( basis > 398.76 )
								if( rangema <= 1.57668 )
									ret := -0.249682
								if( rangema > 1.57668 )
									ret := -0.022858
				if( rangema > 6.79263 )
					if( lowerBB <= 577.037 )
						if( lowerBB <= 301.647 )
							ret := 0.857143 // buy
						if( lowerBB > 301.647 )
							if( upperBB <= 581.645 )
								ret := -0.434783
							if( upperBB > 581.645 )
								if( lowerKC <= 598.07 )
									ret := -0.967033 // sell
								if( lowerKC > 598.07 )
									ret := -0.857143 // sell
					if( lowerBB > 577.037 )
						if( ma <= 624.456 )
							if( basis <= 613.99 )
								ret := 0.894737 // buy
							if( basis > 613.99 )
								ret := 0.642857
						if( ma > 624.456 )
							ret := -1.000000 // sell
		if( val > 0.265776 )
			if( lowerKC <= 361.748 )
				if( lowerBB <= 294.393 )
					if( rangema <= 5.39563 )
						if( ma <= 299.846 )
							if( upperKC <= 304.856 )
								if( priceRange <= 0.844419 )
									ret := -0.213144
								if( priceRange > 0.844419 )
									ret := 0.054054
							if( upperKC > 304.856 )
								if( rangema <= 4.97913 )
									ret := -0.900000 // sell
								if( rangema > 4.97913 )
									ret := -0.466667
						if( ma > 299.846 )
							if( priceRange <= 3.59179 )
								ret := 1.000000 // buy
							if( priceRange > 3.59179 )
								if( upperBB <= 313.103 )
									ret := 1.000000 // buy
								if( upperBB > 313.103 )
									ret := -0.777778 // sell
					if( rangema > 5.39563 )
						if( basis <= 292.13 )
							ret := -0.300000
						if( basis > 292.13 )
							if( rangema <= 5.58687 )
								ret := 0.466667
							if( rangema > 5.58687 )
								ret := 1.000000 // buy
				if( lowerBB > 294.393 )
					if( dev <= 8.90666 )
						if( basis <= 334.478 )
							if( rangema <= 3.18513 )
								if( avgHighLow <= 330.893 )
									ret := -0.422000
								if( avgHighLow > 330.893 )
									ret := -0.769231 // sell
							if( rangema > 3.18513 )
								if( avgHighLow <= 332.49 )
									ret := 0.239583
								if( avgHighLow > 332.49 )
									ret := -0.421053
						if( basis > 334.478 )
							if( lowerKC <= 340.355 )
								if( val <= 0.309796 )
									ret := 0.044776
								if( val > 0.309796 )
									ret := 0.661417
							if( lowerKC > 340.355 )
								if( rangema <= 1.46972 )
									ret := -0.721854 // sell
								if( rangema > 1.46972 )
									ret := -0.185596
					if( dev > 8.90666 )
						if( priceRange <= 9.55484 )
							if( dev <= 10.195 )
								if( val <= 0.579954 )
									ret := -0.975904 // sell
								if( val > 0.579954 )
									ret := -0.833333 // sell
							if( dev > 10.195 )
								if( priceRange <= 2.97652 )
									ret := -0.209302
								if( priceRange > 2.97652 )
									ret := -0.882353 // sell
						if( priceRange > 9.55484 )
							ret := 0.428571
			if( lowerKC > 361.748 )
				if( upperBB <= 372.913 )
					if( rangema <= 2.05417 )
						if( rangema <= 1.62059 )
							if( lowerKC <= 362.264 )
								ret := 0.937500 // buy
							if( lowerKC > 362.264 )
								if( ma <= 364.57 )
									ret := 0.041667
								if( ma > 364.57 )
									ret := 0.626866
						if( rangema > 1.62059 )
							if( basis <= 365.618 )
								ret := -0.333333
							if( basis > 365.618 )
								if( lowerKC <= 364.779 )
									ret := 0.882353 // buy
								if( lowerKC > 364.779 )
									ret := -0.125000
					if( rangema > 2.05417 )
						if( dev <= 4.30217 )
							ret := 0.727273 // buy
						if( dev > 4.30217 )
							ret := 1.000000 // buy
				if( upperBB > 372.913 )
					if( val <= 1.07048 )
						if( lowerBB <= 378.259 )
							if( dev <= 3.04433 )
								if( upperBB <= 381.434 )
									ret := -0.746032 // sell
								if( upperBB > 381.434 )
									ret := -1.000000 // sell
							if( dev > 3.04433 )
								if( upperKC <= 384.798 )
									ret := 0.000000
								if( upperKC > 384.798 )
									ret := -0.827586 // sell
						if( lowerBB > 378.259 )
							if( lowerBB <= 380.425 )
								if( upperBB <= 388.272 )
									ret := 0.033333
								if( upperBB > 388.272 )
									ret := 0.962264 // buy
							if( lowerBB > 380.425 )
								if( avgHighLow <= 595.941 )
									ret := -0.053396
								if( avgHighLow > 595.941 )
									ret := 0.093645
					if( val > 1.07048 )
						if( ma <= 478.185 )
							if( rangema <= 2.43806 )
								ret := -0.800000 // sell
							if( rangema > 2.43806 )
								if( lowerKC <= 425.176 )
									ret := 0.055556
								if( lowerKC > 425.176 )
									ret := 0.882353 // buy
						if( ma > 478.185 )
							if( avgHighLow <= 508.902 )
								if( rangema <= 4.23141 )
									ret := -0.956522 // sell
								if( rangema > 4.23141 )
									ret := -0.634146
							if( avgHighLow > 508.902 )
								if( basis <= 612.249 )
									ret := -0.096154
								if( basis > 612.249 )
									ret := -0.836735 // sell
	if( lowerKC > 671.4 )
		if( ma <= 681.788 )
			if( dev <= 10.1587 )
				if( dev <= 4.25851 )
					if( priceRange <= 1.5403 )
						ret := -0.181818
					if( priceRange > 1.5403 )
						ret := -0.882353 // sell
				if( dev > 4.25851 )
					if( lowerBB <= 672.549 )
						ret := -1.000000 // sell
					if( lowerBB > 672.549 )
						ret := -0.875000 // sell
			if( dev > 10.1587 )
				ret := -0.083333
		if( ma > 681.788 )
			if( upperBB <= 697.406 )
				if( priceRange <= 3.5779 )
					if( ma <= 685.164 )
						ret := 0.076923
					if( ma > 685.164 )
						if( rangema <= 2.05381 )
							if( priceRange <= 0.949652 )
								ret := 0.909091 // buy
							if( priceRange > 0.949652 )
								ret := 1.000000 // buy
						if( rangema > 2.05381 )
							ret := 0.727273 // buy
				if( priceRange > 3.5779 )
					ret := -0.636364
			if( upperBB > 697.406 )
				if( avgHighLow <= 688.235 )
					ret := -0.437500
				if( avgHighLow > 688.235 )
					if( lowerKC <= 690.533 )
						if( upperBB <= 699.756 )
							ret := -1.000000 // sell
						if( upperBB > 699.756 )
							ret := -0.923077 // sell
					if( lowerKC > 690.533 )
						ret := -0.700000 // sell
	
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
float op_operation = decision_tree_0_ADBE_15Min_770d7976(val, sqzOnInt, lowerBB, lowerKC, upperKC, dev, rangema, sqzOffInt, upperBB, priceRange, noSqzInt, ma, basis, avgHighLow)

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


