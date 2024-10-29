//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: DOTUSDT_30Min_1SQU_de918259 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOTUSDT_30Min_1SQU_de918259", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOTUSDT_30Min_de918259(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( upperKC <= 44.7439 )
		if( lowerKC <= 3.97342 )
			if( upperKC <= 4.40825 )
				if( upperBB <= 3.82991 )
					if( lowerBB <= 3.75363 )
						if( lowerBB <= 3.63361 )
							if( lowerBB <= 3.62474 )
								if( ma <= 3.6496 )
									ret := 0.000000
								if( ma > 3.6496 )
									ret := 0.250000
							if( lowerBB > 3.62474 )
								if( avgHighLow <= 3.63512 )
									ret := 0.800000 // buy
								if( avgHighLow > 3.63512 )
									ret := 1.000000 // buy
						if( lowerBB > 3.63361 )
							if( upperBB <= 3.82456 )
								if( rangema <= 0.034105 )
									ret := -0.013468
								if( rangema > 0.034105 )
									ret := 0.333333
							if( upperBB > 3.82456 )
								ret := -0.500000
					if( lowerBB > 3.75363 )
						if( upperBB <= 3.82296 )
							if( lowerKC <= 3.79165 )
								if( avgHighLow <= 3.80687 )
									ret := -0.250000
								if( avgHighLow > 3.80687 )
									ret := -1.000000 // sell
							if( lowerKC > 3.79165 )
								ret := -1.000000 // sell
						if( upperBB > 3.82296 )
							if( upperKC <= 3.83862 )
								ret := -0.250000
							if( upperKC > 3.83862 )
								ret := 0.000000
				if( upperBB > 3.82991 )
					if( lowerKC <= 3.75538 )
						if( dev <= 0.065278 )
							if( avgHighLow <= 3.782 )
								if( upperBB <= 3.84444 )
									ret := 0.444444
								if( upperBB > 3.84444 )
									ret := -1.000000 // sell
							if( avgHighLow > 3.782 )
								if( val <= 0.002191 )
									ret := 0.916667 // buy
								if( val > 0.002191 )
									ret := 0.000000
						if( dev > 0.065278 )
							if( rangema <= 0.057512 )
								if( upperKC <= 3.85732 )
									ret := 1.000000 // buy
								if( upperKC > 3.85732 )
									ret := 0.500000
							if( rangema > 0.057512 )
								if( priceRange <= 0.049865 )
									ret := -0.100000
								if( priceRange > 0.049865 )
									ret := 0.794521 // buy
					if( lowerKC > 3.75538 )
						if( lowerBB <= 3.89952 )
							if( lowerBB <= 3.83227 )
								if( upperKC <= 3.88029 )
									ret := 0.037037
								if( upperKC > 3.88029 )
									ret := 0.606299
							if( lowerBB > 3.83227 )
								if( dev <= 0.089123 )
									ret := 0.080000
								if( dev > 0.089123 )
									ret := -0.666667
						if( lowerBB > 3.89952 )
							if( val <= 0.015759 )
								if( upperKC <= 4.12366 )
									ret := 0.330623
								if( upperKC > 4.12366 )
									ret := 0.696629
							if( val > 0.015759 )
								if( upperKC <= 4.21425 )
									ret := 0.000000
								if( upperKC > 4.21425 )
									ret := -0.733333 // sell
			if( upperKC > 4.40825 )
				if( priceRange <= 0.279898 )
					if( rangema <= 0.254435 )
						if( priceRange <= 0.213522 )
							ret := -1.000000 // sell
						if( priceRange > 0.213522 )
							ret := -0.800000 // sell
					if( rangema > 0.254435 )
						ret := -0.500000
				if( priceRange > 0.279898 )
					ret := 0.500000
		if( lowerKC > 3.97342 )
			if( priceRange <= 0.340968 )
				if( lowerBB <= 17.5615 )
					if( dev <= 0.143608 )
						if( lowerKC <= 10.2562 )
							if( lowerKC <= 9.86463 )
								if( priceRange <= 0.027032 )
									ret := -0.013497
								if( priceRange > 0.027032 )
									ret := 0.043828
							if( lowerKC > 9.86463 )
								if( dev <= 0.123615 )
									ret := 0.602649
								if( dev > 0.123615 )
									ret := 0.083333
						if( lowerKC > 10.2562 )
							if( upperKC <= 14.328 )
								if( upperKC <= 11.1439 )
									ret := -0.327273
								if( upperKC > 11.1439 )
									ret := -0.808989 // sell
							if( upperKC > 14.328 )
								if( val <= -0.007849 )
									ret := -0.492754
								if( val > -0.007849 )
									ret := -0.032258
					if( dev > 0.143608 )
						if( ma <= 7.15773 )
							if( avgHighLow <= 7.01475 )
								if( lowerKC <= 6.83045 )
									ret := 0.216416
								if( lowerKC > 6.83045 )
									ret := -0.468966
							if( avgHighLow > 7.01475 )
								if( lowerBB <= 6.97438 )
									ret := 0.454294
								if( lowerBB > 6.97438 )
									ret := -0.266667
						if( ma > 7.15773 )
							if( rangema <= 0.137203 )
								if( upperBB <= 7.83606 )
									ret := 0.138260
								if( upperBB > 7.83606 )
									ret := -0.063713
							if( rangema > 0.137203 )
								if( rangema <= 0.549778 )
									ret := 0.102909
								if( rangema > 0.549778 )
									ret := -0.622642
				if( lowerBB > 17.5615 )
					if( avgHighLow <= 18.2896 )
						if( rangema <= 0.12725 )
							if( upperBB <= 18.2419 )
								if( lowerBB <= 17.778 )
									ret := 0.166667
								if( lowerBB > 17.778 )
									ret := -0.583333
							if( upperBB > 18.2419 )
								if( avgHighLow <= 18.2049 )
									ret := 0.619048
								if( avgHighLow > 18.2049 )
									ret := 0.000000
						if( rangema > 0.12725 )
							if( upperBB <= 18.5932 )
								if( rangema <= 0.250995 )
									ret := -0.369159
								if( rangema > 0.250995 )
									ret := 0.079365
							if( upperBB > 18.5932 )
								if( avgHighLow <= 18.1267 )
									ret := -0.285714
								if( avgHighLow > 18.1267 )
									ret := -0.944444 // sell
					if( avgHighLow > 18.2896 )
						if( dev <= 1.13022 )
							if( avgHighLow <= 43.7083 )
								if( basis <= 18.1888 )
									ret := -0.833333 // sell
								if( basis > 18.1888 )
									ret := -0.003772
							if( avgHighLow > 43.7083 )
								if( lowerKC <= 43.4402 )
									ret := 0.700000 // buy
								if( lowerKC > 43.4402 )
									ret := -0.058824
						if( dev > 1.13022 )
							if( val <= 0.086493 )
								if( dev <= 1.37465 )
									ret := -0.280899
								if( dev > 1.37465 )
									ret := -0.641509
							if( val > 0.086493 )
								if( upperBB <= 36.6554 )
									ret := 0.375000
								if( upperBB > 36.6554 )
									ret := -0.500000
			if( priceRange > 0.340968 )
				if( upperBB <= 35.4231 )
					if( lowerBB <= 31.8736 )
						if( lowerKC <= 31.4645 )
							if( avgHighLow <= 32.1701 )
								if( rangema <= 2.11103 )
									ret := 0.131434
								if( rangema > 2.11103 )
									ret := -0.750000 // sell
							if( avgHighLow > 32.1701 )
								if( lowerKC <= 31.3473 )
									ret := 0.894737 // buy
								if( lowerKC > 31.3473 )
									ret := 0.375000
						if( lowerKC > 31.4645 )
							if( val <= 0.063381 )
								if( rangema <= 0.331617 )
									ret := 0.307692
								if( rangema > 0.331617 )
									ret := -0.659091
							if( val > 0.063381 )
								if( basis <= 33.18 )
									ret := 0.300000
								if( basis > 33.18 )
									ret := -0.600000
					if( lowerBB > 31.8736 )
						if( upperBB <= 34.3855 )
							if( dev <= 0.64216 )
								if( val <= 0.051328 )
									ret := 0.452206
								if( val > 0.051328 )
									ret := -0.538462
							if( dev > 0.64216 )
								if( avgHighLow <= 33.4038 )
									ret := 0.861635 // buy
								if( avgHighLow > 33.4038 )
									ret := -0.062500
						if( upperBB > 34.3855 )
							if( avgHighLow <= 33.5235 )
								if( lowerKC <= 32.3232 )
									ret := 0.333333
								if( lowerKC > 32.3232 )
									ret := -0.629630
							if( avgHighLow > 33.5235 )
								if( lowerKC <= 33.1991 )
									ret := 0.547619
								if( lowerKC > 33.1991 )
									ret := 0.160600
				if( upperBB > 35.4231 )
					if( avgHighLow <= 36.0215 )
						if( upperBB <= 36.3539 )
							if( avgHighLow <= 35.2205 )
								if( basis <= 34.8286 )
									ret := 0.070370
								if( basis > 34.8286 )
									ret := -0.293194
							if( avgHighLow > 35.2205 )
								if( priceRange <= 0.701278 )
									ret := 0.377451
								if( priceRange > 0.701278 )
									ret := -0.190476
						if( upperBB > 36.3539 )
							if( rangema <= 1.47329 )
								if( ma <= 36.3464 )
									ret := -0.347023
								if( ma > 36.3464 )
									ret := 0.255814
							if( rangema > 1.47329 )
								if( lowerKC <= 28.3243 )
									ret := -0.700000 // sell
								if( lowerKC > 28.3243 )
									ret := 0.681818
					if( avgHighLow > 36.0215 )
						if( basis <= 36.4567 )
							if( upperBB <= 36.8515 )
								if( lowerBB <= 35.5874 )
									ret := -0.212766
								if( lowerBB > 35.5874 )
									ret := 0.506024
							if( upperBB > 36.8515 )
								if( upperKC <= 37.1664 )
									ret := 0.717557 // buy
								if( upperKC > 37.1664 )
									ret := 0.268293
						if( basis > 36.4567 )
							if( ma <= 36.6533 )
								if( val <= -0.043892 )
									ret := 0.375000
								if( val > -0.043892 )
									ret := -0.560748
							if( ma > 36.6533 )
								if( upperKC <= 37.5593 )
									ret := 0.515152
								if( upperKC > 37.5593 )
									ret := 0.045417
	if( upperKC > 44.7439 )
		if( basis <= 45.5609 )
			if( lowerKC <= 41.6158 )
				ret := 1.000000 // buy
			if( lowerKC > 41.6158 )
				if( basis <= 44.8928 )
					if( val <= -0.080632 )
						if( ma <= 44.5168 )
							if( lowerBB <= 41.663 )
								ret := -0.500000
							if( lowerBB > 41.663 )
								if( lowerKC <= 43.4816 )
									ret := 0.722222 // buy
								if( lowerKC > 43.4816 )
									ret := 0.000000
						if( ma > 44.5168 )
							if( rangema <= 1.01369 )
								if( rangema <= 0.692544 )
									ret := -0.272727
								if( rangema > 0.692544 )
									ret := -0.888889 // sell
							if( rangema > 1.01369 )
								if( upperBB <= 46.8113 )
									ret := 0.000000
								if( upperBB > 46.8113 )
									ret := 0.500000
					if( val > -0.080632 )
						if( ma <= 44.6469 )
							if( upperKC <= 45.0307 )
								if( val <= -0.03003 )
									ret := 0.050000
								if( val > -0.03003 )
									ret := -0.687500
							if( upperKC > 45.0307 )
								if( rangema <= 1.07 )
									ret := -0.766990 // sell
								if( rangema > 1.07 )
									ret := 0.000000
						if( ma > 44.6469 )
							if( rangema <= 0.667191 )
								if( upperBB <= 45.6679 )
									ret := 0.272727
								if( upperBB > 45.6679 )
									ret := -0.631579
							if( rangema > 0.667191 )
								if( lowerKC <= 43.4173 )
									ret := 0.333333
								if( lowerKC > 43.4173 )
									ret := 1.000000 // buy
				if( basis > 44.8928 )
					if( upperKC <= 46.48 )
						if( priceRange <= 0.375 )
							ret := -0.400000
						if( priceRange > 0.375 )
							if( rangema <= 0.782449 )
								if( val <= -0.089792 )
									ret := -0.866667 // sell
								if( val > -0.089792 )
									ret := -0.984375 // sell
							if( rangema > 0.782449 )
								if( val <= -0.119897 )
									ret := -0.833333 // sell
								if( val > -0.119897 )
									ret := 0.000000
					if( upperKC > 46.48 )
						if( basis <= 45.2235 )
							ret := -0.833333 // sell
						if( basis > 45.2235 )
							if( avgHighLow <= 45.2993 )
								ret := 0.714286 // buy
							if( avgHighLow > 45.2993 )
								ret := -0.200000
		if( basis > 45.5609 )
			if( upperBB <= 46.335 )
				if( upperKC <= 46.2682 )
					ret := 1.000000 // buy
				if( upperKC > 46.2682 )
					if( basis <= 45.7735 )
						ret := 0.500000
					if( basis > 45.7735 )
						ret := 1.000000 // buy
			if( upperBB > 46.335 )
				if( rangema <= 1.37 )
					if( lowerBB <= 44.3193 )
						if( avgHighLow <= 46.1534 )
							ret := 0.500000
						if( avgHighLow > 46.1534 )
							ret := 1.000000 // buy
					if( lowerBB > 44.3193 )
						if( lowerBB <= 47.7566 )
							if( dev <= 0.449765 )
								if( val <= -0.023193 )
									ret := -0.387097
								if( val > -0.023193 )
									ret := -0.940000 // sell
							if( dev > 0.449765 )
								if( priceRange <= 1.1255 )
									ret := -0.048387
								if( priceRange > 1.1255 )
									ret := -0.500000
						if( lowerBB > 47.7566 )
							if( avgHighLow <= 50.9478 )
								if( priceRange <= 1.19861 )
									ret := 0.385417
								if( priceRange > 1.19861 )
									ret := -0.875000 // sell
							if( avgHighLow > 50.9478 )
								if( dev <= 0.473203 )
									ret := 0.294872
								if( dev > 0.473203 )
									ret := -0.210210
				if( rangema > 1.37 )
					if( dev <= 2.12433 )
						ret := 0.500000
					if( dev > 2.12433 )
						if( basis <= 47.228 )
							ret := 1.000000 // buy
						if( basis > 47.228 )
							ret := 0.857143 // buy
	
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
float op_operation = decision_tree_0_DOTUSDT_30Min_de918259(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)

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


