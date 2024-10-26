//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: ADSK_15Min_1SQU_f0432a4c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADSK_15Min_1SQU_f0432a4c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADSK_15Min_f0432a4c(val, sqzOnInt, lowerBB, lowerKC, upperKC, dev, rangema, sqzOffInt, upperBB, priceRange, noSqzInt, ma, basis, avgHighLow)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( lowerKC <= 196.751 )
		if( lowerBB <= 194.017 )
			if( lowerKC <= 68.795 )
				if( upperBB <= 69.8731 )
					ret := 1.000000 // buy
				if( upperBB > 69.8731 )
					ret := 0.909091 // buy
			if( lowerKC > 68.795 )
				if( lowerKC <= 193.412 )
					if( lowerBB <= 193.474 )
						if( upperBB <= 191.863 )
							if( upperBB <= 191.105 )
								if( upperKC <= 189.86 )
									ret := 0.013080
								if( upperKC > 189.86 )
									ret := 0.283626
							if( upperBB > 191.105 )
								if( dev <= 5.13557 )
									ret := -0.460630
								if( dev > 5.13557 )
									ret := 0.285714
						if( upperBB > 191.863 )
							if( avgHighLow <= 189.05 )
								if( rangema <= 1.80583 )
									ret := 0.823009 // buy
								if( rangema > 1.80583 )
									ret := 0.243902
							if( avgHighLow > 189.05 )
								if( upperBB <= 195.877 )
									ret := 0.208061
								if( upperBB > 195.877 )
									ret := -0.120427
					if( lowerBB > 193.474 )
						if( upperBB <= 196.621 )
							if( lowerBB <= 193.711 )
								if( rangema <= 1.06065 )
									ret := 0.411765
								if( rangema > 1.06065 )
									ret := 0.806452 // buy
							if( lowerBB > 193.711 )
								if( val <= -0.010924 )
									ret := 0.812500 // buy
								if( val > -0.010924 )
									ret := 1.000000 // buy
						if( upperBB > 196.621 )
							ret := -0.100000
				if( lowerKC > 193.412 )
					if( avgHighLow <= 195.766 )
						if( lowerBB <= 193.216 )
							if( upperBB <= 196.144 )
								if( dev <= 1.55162 )
									ret := -0.777778 // sell
								if( dev > 1.55162 )
									ret := -1.000000 // sell
							if( upperBB > 196.144 )
								if( lowerKC <= 193.739 )
									ret := 0.419753
								if( lowerKC > 193.739 )
									ret := 0.000000
						if( lowerBB > 193.216 )
							if( val <= 0.068048 )
								if( priceRange <= 2.23 )
									ret := -0.057143
								if( priceRange > 2.23 )
									ret := -0.767857 // sell
							if( val > 0.068048 )
								if( ma <= 195.404 )
									ret := -0.862595 // sell
								if( ma > 195.404 )
									ret := 0.156250
					if( avgHighLow > 195.766 )
						if( priceRange <= 0.728266 )
							if( upperBB <= 198.488 )
								if( lowerBB <= 193.905 )
									ret := -0.470588
								if( lowerBB > 193.905 )
									ret := 1.000000 // buy
							if( upperBB > 198.488 )
								if( basis <= 196.088 )
									ret := 1.000000 // buy
								if( basis > 196.088 )
									ret := 0.343750
						if( priceRange > 0.728266 )
							if( rangema <= 1.14999 )
								if( lowerBB <= 192.971 )
									ret := -0.421053
								if( lowerBB > 192.971 )
									ret := 0.490566
							if( rangema > 1.14999 )
								if( ma <= 195.85 )
									ret := 0.440000
								if( ma > 195.85 )
									ret := -0.286344
		if( lowerBB > 194.017 )
			if( lowerKC <= 195.538 )
				if( basis <= 196.042 )
					if( dev <= 0.818546 )
						if( avgHighLow <= 195.438 )
							if( lowerBB <= 194.535 )
								ret := -0.666667
							if( lowerBB > 194.535 )
								ret := -0.857143 // sell
						if( avgHighLow > 195.438 )
							ret := -0.583333
					if( dev > 0.818546 )
						if( upperBB <= 196.252 )
							if( priceRange <= 0.6525 )
								ret := -0.555556
							if( priceRange > 0.6525 )
								ret := -0.111111
						if( upperBB > 196.252 )
							if( val <= 0.084364 )
								if( ma <= 195.751 )
									ret := 0.783582 // buy
								if( ma > 195.751 )
									ret := 0.415301
							if( val > 0.084364 )
								if( basis <= 195.549 )
									ret := 0.222222
								if( basis > 195.549 )
									ret := -0.027027
				if( basis > 196.042 )
					if( avgHighLow <= 199.185 )
						if( avgHighLow <= 198.958 )
							if( rangema <= 1.79487 )
								if( upperKC <= 199.698 )
									ret := -0.104121
								if( upperKC > 199.698 )
									ret := 0.562500
							if( rangema > 1.79487 )
								ret := -1.000000 // sell
						if( avgHighLow > 198.958 )
							ret := 1.000000 // buy
					if( avgHighLow > 199.185 )
						if( priceRange <= 0.8139 )
							ret := -1.000000 // sell
						if( priceRange > 0.8139 )
							ret := -0.800000 // sell
			if( lowerKC > 195.538 )
				if( dev <= 2.50418 )
					if( rangema <= 0.562167 )
						if( lowerBB <= 196.224 )
							if( priceRange <= 0.645192 )
								if( dev <= 0.709571 )
									ret := 0.722222 // buy
								if( dev > 0.709571 )
									ret := 0.166667
							if( priceRange > 0.645192 )
								if( sqzOnInt <= 0.5 )
									ret := 0.133333
								if( sqzOnInt > 0.5 )
									ret := -0.388889
						if( lowerBB > 196.224 )
							if( val <= -0.038616 )
								ret := -0.166667
							if( val > -0.038616 )
								ret := -1.000000 // sell
					if( rangema > 0.562167 )
						if( lowerBB <= 195.258 )
							if( lowerKC <= 196.174 )
								if( lowerBB <= 195.03 )
									ret := -0.666667
								if( lowerBB > 195.03 )
									ret := -0.900000 // sell
							if( lowerKC > 196.174 )
								ret := -0.384615
						if( lowerBB > 195.258 )
							if( ma <= 197.781 )
								if( dev <= 0.608707 )
									ret := -0.545455
								if( dev > 0.608707 )
									ret := 0.538610
							if( ma > 197.781 )
								if( val <= -0.106732 )
									ret := 0.590909
								if( val > -0.106732 )
									ret := -0.100719
				if( dev > 2.50418 )
					if( upperKC <= 202.616 )
						if( avgHighLow <= 197.665 )
							if( ma <= 198.01 )
								if( upperBB <= 200.598 )
									ret := 0.681818
								if( upperBB > 200.598 )
									ret := 0.941176 // buy
							if( ma > 198.01 )
								ret := 1.000000 // buy
						if( avgHighLow > 197.665 )
							if( priceRange <= 1.61951 )
								if( basis <= 197.848 )
									ret := 0.055556
								if( basis > 197.848 )
									ret := 0.528736
							if( priceRange > 1.61951 )
								if( dev <= 3.11667 )
									ret := 0.931034 // buy
								if( dev > 3.11667 )
									ret := 0.700000 // buy
					if( upperKC > 202.616 )
						ret := 0.000000
	if( lowerKC > 196.751 )
		if( sqzOffInt <= 0.5 )
			if( lowerKC <= 327.588 )
				if( upperKC <= 199.984 )
					if( val <= -0.028274 )
						if( lowerBB <= 197.478 )
							ret := 0.545455
						if( lowerBB > 197.478 )
							if( ma <= 198.761 )
								if( val <= -0.088584 )
									ret := 1.000000 // buy
								if( val > -0.088584 )
									ret := 0.875000 // buy
							if( ma > 198.761 )
								if( lowerKC <= 198.553 )
									ret := 0.222222
								if( lowerKC > 198.553 )
									ret := 1.000000 // buy
					if( val > -0.028274 )
						if( lowerBB <= 197.259 )
							ret := -0.600000
						if( lowerBB > 197.259 )
							if( lowerBB <= 197.402 )
								ret := -0.090909
							if( lowerBB > 197.402 )
								ret := 0.166667
				if( upperKC > 199.984 )
					if( lowerBB <= 205.618 )
						if( ma <= 198.834 )
							if( val <= -0.150397 )
								ret := 0.076923
							if( val > -0.150397 )
								if( dev <= 1.11014 )
									ret := 0.958333 // buy
								if( dev > 1.11014 )
									ret := 0.583333
						if( ma > 198.834 )
							if( upperBB <= 206.935 )
								if( upperBB <= 201.626 )
									ret := -0.380048
								if( upperBB > 201.626 )
									ret := 0.016064
							if( upperBB > 206.935 )
								if( upperBB <= 207.489 )
									ret := -0.692308
								if( upperBB > 207.489 )
									ret := -0.398230
					if( lowerBB > 205.618 )
						if( upperBB <= 209.527 )
							if( priceRange <= 0.520714 )
								if( rangema <= 0.889917 )
									ret := -0.050420
								if( rangema > 0.889917 )
									ret := 0.709677 // buy
							if( priceRange > 0.520714 )
								if( val <= -0.073737 )
									ret := 0.917808 // buy
								if( val > -0.073737 )
									ret := 0.283843
						if( upperBB > 209.527 )
							if( basis <= 324.168 )
								if( ma <= 293.018 )
									ret := 0.036561
								if( ma > 293.018 )
									ret := -0.160557
							if( basis > 324.168 )
								if( lowerBB <= 322.971 )
									ret := 0.941176 // buy
								if( lowerBB > 322.971 )
									ret := 0.379747
			if( lowerKC > 327.588 )
				if( upperKC <= 331.257 )
					if( ma <= 328.988 )
						ret := -0.894737 // sell
					if( ma > 328.988 )
						ret := -1.000000 // sell
				if( upperKC > 331.257 )
					if( basis <= 330.713 )
						if( dev <= 1.18988 )
							ret := 0.666667
						if( dev > 1.18988 )
							ret := -0.333333
					if( basis > 330.713 )
						if( dev <= 0.732903 )
							ret := 1.000000 // buy
						if( dev > 0.732903 )
							if( val <= 0.017602 )
								if( dev <= 1.09942 )
									ret := 0.041667
								if( dev > 1.09942 )
									ret := -0.580247
							if( val > 0.017602 )
								if( lowerKC <= 339.503 )
									ret := -0.905660 // sell
								if( lowerKC > 339.503 )
									ret := -0.750000 // sell
		if( sqzOffInt > 0.5 )
			if( rangema <= 2.16031 )
				if( ma <= 199.65 )
					if( upperBB <= 199.337 )
						ret := -1.000000 // sell
					if( upperBB > 199.337 )
						if( ma <= 199.081 )
							if( val <= 0.022029 )
								if( ma <= 199.01 )
									ret := -0.140625
								if( ma > 199.01 )
									ret := 0.800000 // buy
							if( val > 0.022029 )
								if( lowerKC <= 196.937 )
									ret := -0.846154 // sell
								if( lowerKC > 196.937 )
									ret := -0.328571
						if( ma > 199.081 )
							if( dev <= 2.00897 )
								if( upperBB <= 200.511 )
									ret := -0.809524 // sell
								if( upperBB > 200.511 )
									ret := 0.140625
							if( dev > 2.00897 )
								if( avgHighLow <= 199.299 )
									ret := -0.260870
								if( avgHighLow > 199.299 )
									ret := -0.714286 // sell
				if( ma > 199.65 )
					if( rangema <= 0.792097 )
						if( val <= 0.221441 )
							if( basis <= 298.994 )
								if( lowerBB <= 201.684 )
									ret := 0.221583
								if( lowerBB > 201.684 )
									ret := 0.011697
							if( basis > 298.994 )
								if( priceRange <= 0.926991 )
									ret := 0.611465
								if( priceRange > 0.926991 )
									ret := 0.174603
						if( val > 0.221441 )
							if( upperBB <= 206.67 )
								ret := 0.187500
							if( upperBB > 206.67 )
								if( upperKC <= 257.214 )
									ret := -0.771429 // sell
								if( upperKC > 257.214 )
									ret := 0.000000
					if( rangema > 0.792097 )
						if( dev <= 9.50738 )
							if( upperBB <= 314.689 )
								if( lowerBB <= 303.282 )
									ret := -0.053307
								if( lowerBB > 303.282 )
									ret := 0.173375
							if( upperBB > 314.689 )
								if( avgHighLow <= 320.167 )
									ret := -0.455556
								if( avgHighLow > 320.167 )
									ret := 0.037445
						if( dev > 9.50738 )
							if( avgHighLow <= 206.958 )
								ret := 0.909091 // buy
							if( avgHighLow > 206.958 )
								ret := 0.500000
			if( rangema > 2.16031 )
				if( ma <= 261.907 )
					if( lowerBB <= 253.427 )
						if( basis <= 257.823 )
							if( lowerKC <= 244.924 )
								if( upperBB <= 212.018 )
									ret := 0.310345
								if( upperBB > 212.018 )
									ret := -0.344340
							if( lowerKC > 244.924 )
								if( rangema <= 2.83648 )
									ret := -0.917647 // sell
								if( rangema > 2.83648 )
									ret := -0.083333
						if( basis > 257.823 )
							if( upperKC <= 263.986 )
								ret := 0.928571 // buy
							if( upperKC > 263.986 )
								ret := 0.153846
					if( lowerBB > 253.427 )
						if( val <= 0.100119 )
							ret := -1.000000 // sell
						if( val > 0.100119 )
							ret := -0.900000 // sell
				if( ma > 261.907 )
					if( basis <= 263.925 )
						if( dev <= 8.26136 )
							if( priceRange <= 1.60518 )
								ret := 0.545455
							if( priceRange > 1.60518 )
								if( rangema <= 2.80723 )
									ret := 1.000000 // buy
								if( rangema > 2.80723 )
									ret := 0.900000 // buy
						if( dev > 8.26136 )
							ret := 0.500000
					if( basis > 263.925 )
						if( lowerBB <= 247.603 )
							ret := 0.923077 // buy
						if( lowerBB > 247.603 )
							if( lowerKC <= 329.477 )
								if( upperBB <= 270.362 )
									ret := 0.608696
								if( upperBB > 270.362 )
									ret := -0.363636
							if( lowerKC > 329.477 )
								ret := 0.800000 // buy
	
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
float op_operation = decision_tree_0_ADSK_15Min_f0432a4c(val, sqzOnInt, lowerBB, lowerKC, upperKC, dev, rangema, sqzOffInt, upperBB, priceRange, noSqzInt, ma, basis, avgHighLow)

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


