//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: ATOMUSDT_30Min_1SQU_f00851a7 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ATOMUSDT_30Min_1SQU_f00851a7", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ATOMUSDT_30Min_f00851a7(val, sqzOnInt, lowerBB, lowerKC, upperKC, dev, rangema, sqzOffInt, upperBB, priceRange, noSqzInt, ma, basis, avgHighLow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( basis <= 40.0517 )
		if( lowerBB <= 11.2802 )
			if( dev <= 0.183498 )
				if( basis <= 11.3555 )
					if( lowerKC <= 4.08037 )
						if( priceRange <= 0.044831 )
							if( upperBB <= 3.89267 )
								if( upperBB <= 3.8878 )
									ret := 0.342857
								if( upperBB > 3.8878 )
									ret := 1.000000 // buy
							if( upperBB > 3.89267 )
								if( upperKC <= 4.14976 )
									ret := -0.046823
								if( upperKC > 4.14976 )
									ret := 0.324324
						if( priceRange > 0.044831 )
							if( val <= -0.004709 )
								if( ma <= 4.12136 )
									ret := -0.400000
								if( ma > 4.12136 )
									ret := -1.000000 // sell
							if( val > -0.004709 )
								if( rangema <= 0.073634 )
									ret := 0.633803
								if( rangema > 0.073634 )
									ret := -0.437500
					if( lowerKC > 4.08037 )
						if( avgHighLow <= 4.19621 )
							if( lowerKC <= 4.15978 )
								if( rangema <= 0.051053 )
									ret := -0.121693
								if( rangema > 0.051053 )
									ret := -0.718750 // sell
							if( lowerKC > 4.15978 )
								if( upperBB <= 4.26057 )
									ret := -0.833333 // sell
								if( upperBB > 4.26057 )
									ret := -0.952381 // sell
						if( avgHighLow > 4.19621 )
							if( val <= 0.025039 )
								if( ma <= 9.15933 )
									ret := 0.007252
								if( ma > 9.15933 )
									ret := -0.037633
							if( val > 0.025039 )
								if( upperKC <= 8.15531 )
									ret := 0.758065 // buy
								if( upperKC > 8.15531 )
									ret := 0.269841
				if( basis > 11.3555 )
					if( lowerBB <= 11.2042 )
						ret := -0.636364
					if( lowerBB > 11.2042 )
						if( lowerKC <= 11.1917 )
							ret := -0.700000 // sell
						if( lowerKC > 11.1917 )
							if( lowerKC <= 11.2137 )
								if( priceRange <= 0.081123 )
									ret := 0.705882 // buy
								if( priceRange > 0.081123 )
									ret := 0.950000 // buy
							if( lowerKC > 11.2137 )
								if( ma <= 11.3922 )
									ret := 0.779412 // buy
								if( ma > 11.3922 )
									ret := 0.222222
			if( dev > 0.183498 )
				if( upperKC <= 12.4058 )
					if( upperKC <= 7.34487 )
						if( basis <= 6.40332 )
							if( upperBB <= 5.16914 )
								if( priceRange <= 0.1153 )
									ret := 0.183206
								if( priceRange > 0.1153 )
									ret := 0.853333 // buy
							if( upperBB > 5.16914 )
								if( upperBB <= 5.20305 )
									ret := -0.823529 // sell
								if( upperBB > 5.20305 )
									ret := 0.061528
						if( basis > 6.40332 )
							if( avgHighLow <= 6.37405 )
								if( upperBB <= 6.80595 )
									ret := -0.980000 // sell
								if( upperBB > 6.80595 )
									ret := -0.866667 // sell
							if( avgHighLow > 6.37405 )
								if( lowerBB <= 6.30819 )
									ret := 0.082474
								if( lowerBB > 6.30819 )
									ret := -0.464789
					if( upperKC > 7.34487 )
						if( priceRange <= 0.439089 )
							if( upperKC <= 8.22519 )
								if( rangema <= 0.116571 )
									ret := 0.613027
								if( rangema > 0.116571 )
									ret := 0.179211
							if( upperKC > 8.22519 )
								if( ma <= 11.2418 )
									ret := 0.079540
								if( ma > 11.2418 )
									ret := 0.238815
						if( priceRange > 0.439089 )
							if( upperKC <= 11.1713 )
								if( rangema <= 0.32248 )
									ret := 0.317829
								if( rangema > 0.32248 )
									ret := 0.882353 // buy
							if( upperKC > 11.1713 )
								if( priceRange <= 0.6185 )
									ret := -0.009901
								if( priceRange > 0.6185 )
									ret := 0.600000
				if( upperKC > 12.4058 )
					if( ma <= 12.2512 )
						if( avgHighLow <= 11.0739 )
							ret := -0.933333 // sell
						if( avgHighLow > 11.0739 )
							ret := -1.000000 // sell
					if( ma > 12.2512 )
						ret := -0.636364
		if( lowerBB > 11.2802 )
			if( priceRange <= 0.329665 )
				if( ma <= 14.1563 )
					if( basis <= 13.4192 )
						if( lowerBB <= 12.9481 )
							if( rangema <= 0.154393 )
								if( dev <= 0.31312 )
									ret := 0.041974
								if( dev > 0.31312 )
									ret := -0.353698
							if( rangema > 0.154393 )
								if( lowerBB <= 11.8737 )
									ret := -0.214624
								if( lowerBB > 11.8737 )
									ret := -0.001579
						if( lowerBB > 12.9481 )
							if( avgHighLow <= 13.0237 )
								if( rangema <= 0.136997 )
									ret := 0.700000 // buy
								if( rangema > 0.136997 )
									ret := 1.000000 // buy
							if( avgHighLow > 13.0237 )
								if( lowerBB <= 12.9883 )
									ret := -0.527950
								if( lowerBB > 12.9883 )
									ret := -0.159635
					if( basis > 13.4192 )
						if( upperBB <= 14.3413 )
							if( lowerKC <= 13.5004 )
								if( avgHighLow <= 13.4067 )
									ret := -0.622642
								if( avgHighLow > 13.4067 )
									ret := 0.250484
							if( lowerKC > 13.5004 )
								if( upperKC <= 13.9394 )
									ret := -0.412698
								if( upperKC > 13.9394 )
									ret := 0.025696
						if( upperBB > 14.3413 )
							if( basis <= 13.5636 )
								ret := 0.933333 // buy
							if( basis > 13.5636 )
								if( dev <= 0.246834 )
									ret := -0.104167
								if( dev > 0.246834 )
									ret := 0.406340
				if( ma > 14.1563 )
					if( dev <= 0.21853 )
						if( lowerBB <= 28.7028 )
							if( avgHighLow <= 15.4257 )
								if( basis <= 15.1586 )
									ret := -0.093548
								if( basis > 15.1586 )
									ret := 0.617021
							if( avgHighLow > 15.4257 )
								if( upperKC <= 18.9069 )
									ret := -0.540943
								if( upperKC > 18.9069 )
									ret := -0.117834
						if( lowerBB > 28.7028 )
							if( val <= -0.007533 )
								if( val <= -0.046767 )
									ret := -0.454545
								if( val > -0.046767 )
									ret := -0.058824
							if( val > -0.007533 )
								if( basis <= 32.3128 )
									ret := -0.983333 // sell
								if( basis > 32.3128 )
									ret := -0.576923
					if( dev > 0.21853 )
						if( val <= 0.012952 )
							if( avgHighLow <= 14.797 )
								if( rangema <= 0.172442 )
									ret := 0.242857
								if( rangema > 0.172442 )
									ret := -0.385827
							if( avgHighLow > 14.797 )
								if( lowerKC <= 18.3116 )
									ret := 0.062288
								if( lowerKC > 18.3116 )
									ret := -0.109492
						if( val > 0.012952 )
							if( dev <= 0.575015 )
								if( upperKC <= 15.2437 )
									ret := -0.464706
								if( upperKC > 15.2437 )
									ret := 0.096542
							if( dev > 0.575015 )
								if( dev <= 1.13867 )
									ret := -0.264822
								if( dev > 1.13867 )
									ret := 0.463576
			if( priceRange > 0.329665 )
				if( rangema <= 1.35385 )
					if( avgHighLow <= 39.4778 )
						if( upperKC <= 40.8593 )
							if( upperBB <= 20.2461 )
								if( upperBB <= 17.4001 )
									ret := -0.007972
								if( upperBB > 17.4001 )
									ret := 0.314869
							if( upperBB > 20.2461 )
								if( dev <= 0.35641 )
									ret := 0.215440
								if( dev > 0.35641 )
									ret := -0.001755
						if( upperKC > 40.8593 )
							if( dev <= 2.23075 )
								if( val <= -0.019446 )
									ret := 0.750000 // buy
								if( val > -0.019446 )
									ret := 1.000000 // buy
							if( dev > 2.23075 )
								ret := 0.454545
					if( avgHighLow > 39.4778 )
						if( rangema <= 0.511919 )
							if( val <= -0.024875 )
								if( upperKC <= 40.492 )
									ret := 0.852941 // buy
								if( upperKC > 40.492 )
									ret := 0.250000
							if( val > -0.024875 )
								ret := -0.222222
						if( rangema > 0.511919 )
							if( upperBB <= 41.0782 )
								if( dev <= 1.30352 )
									ret := -0.507614
								if( dev > 1.30352 )
									ret := -0.952381 // sell
							if( upperBB > 41.0782 )
								if( lowerBB <= 38.5466 )
									ret := -0.571429
								if( lowerBB > 38.5466 )
									ret := 0.677419
				if( rangema > 1.35385 )
					if( upperKC <= 29.9819 )
						if( lowerBB <= 20.1566 )
							if( dev <= 3.45366 )
								if( upperBB <= 17.7803 )
									ret := -0.555556
								if( upperBB > 17.7803 )
									ret := -1.000000 // sell
							if( dev > 3.45366 )
								ret := 0.090909
						if( lowerBB > 20.1566 )
							ret := 1.000000 // buy
					if( upperKC > 29.9819 )
						if( upperBB <= 33.6815 )
							ret := -1.000000 // sell
						if( upperBB > 33.6815 )
							if( sqzOffInt <= 0.5 )
								if( upperKC <= 38.8528 )
									ret := -1.000000 // sell
								if( upperKC > 38.8528 )
									ret := -0.310345
							if( sqzOffInt > 0.5 )
								if( val <= -0.052849 )
									ret := 0.454545
								if( val > -0.052849 )
									ret := -0.812500 // sell
	if( basis > 40.0517 )
		if( val <= -0.07738 )
			if( dev <= 0.973063 )
				if( val <= -0.118976 )
					ret := -0.818182 // sell
				if( val > -0.118976 )
					if( upperKC <= 41.4416 )
						ret := -0.454545
					if( upperKC > 41.4416 )
						if( rangema <= 0.903666 )
							if( ma <= 41.2155 )
								ret := 1.000000 // buy
							if( ma > 41.2155 )
								if( upperKC <= 43.5298 )
									ret := 0.875000 // buy
								if( upperKC > 43.5298 )
									ret := 0.454545
						if( rangema > 0.903666 )
							ret := -0.222222
			if( dev > 0.973063 )
				if( val <= -0.174733 )
					if( rangema <= 1.14276 )
						if( val <= -0.200877 )
							if( lowerBB <= 40.7566 )
								ret := 0.428571
							if( lowerBB > 40.7566 )
								ret := 0.900000 // buy
						if( val > -0.200877 )
							ret := -0.142857
					if( rangema > 1.14276 )
						ret := -0.947368 // sell
				if( val > -0.174733 )
					if( rangema <= 0.790779 )
						ret := 0.250000
					if( rangema > 0.790779 )
						if( rangema <= 1.06213 )
							if( rangema <= 1.01453 )
								if( lowerKC <= 38.8667 )
									ret := -1.000000 // sell
								if( lowerKC > 38.8667 )
									ret := -0.735294 // sell
							if( rangema > 1.01453 )
								ret := 0.000000
						if( rangema > 1.06213 )
							if( upperKC <= 43.673 )
								if( upperBB <= 43.1777 )
									ret := -1.000000 // sell
								if( upperBB > 43.1777 )
									ret := -0.555556
							if( upperKC > 43.673 )
								ret := -1.000000 // sell
		if( val > -0.07738 )
			if( avgHighLow <= 41.1258 )
				if( priceRange <= 1.28864 )
					if( lowerBB <= 38.6419 )
						ret := -1.000000 // sell
					if( lowerBB > 38.6419 )
						if( lowerBB <= 39.0391 )
							if( upperBB <= 42.4297 )
								if( basis <= 40.3642 )
									ret := 0.111111
								if( basis > 40.3642 )
									ret := -0.818182 // sell
							if( upperBB > 42.4297 )
								ret := 0.684211
						if( lowerBB > 39.0391 )
							if( basis <= 40.7165 )
								if( val <= -0.011995 )
									ret := -0.326531
								if( val > -0.011995 )
									ret := -0.980392 // sell
							if( basis > 40.7165 )
								if( upperKC <= 42.2506 )
									ret := -0.063830
								if( upperKC > 42.2506 )
									ret := -0.733333 // sell
				if( priceRange > 1.28864 )
					if( upperKC <= 41.9622 )
						ret := 0.928571 // buy
					if( upperKC > 41.9622 )
						ret := -0.454545
			if( avgHighLow > 41.1258 )
				if( upperKC <= 43.3463 )
					if( rangema <= 1.05932 )
						if( lowerKC <= 40.2564 )
							if( upperBB <= 43.064 )
								ret := -1.000000 // sell
							if( upperBB > 43.064 )
								ret := -0.900000 // sell
						if( lowerKC > 40.2564 )
							if( upperBB <= 42.3456 )
								ret := -0.600000
							if( upperBB > 42.3456 )
								if( avgHighLow <= 42.0614 )
									ret := -0.953846 // sell
								if( avgHighLow > 42.0614 )
									ret := -0.764706 // sell
					if( rangema > 1.05932 )
						ret := -0.526316
				if( upperKC > 43.3463 )
					if( val <= -0.062211 )
						if( ma <= 42.2115 )
							ret := -0.571429
						if( ma > 42.2115 )
							if( avgHighLow <= 42.513 )
								ret := -1.000000 // sell
							if( avgHighLow > 42.513 )
								ret := -0.833333 // sell
					if( val > -0.062211 )
						if( lowerBB <= 42.1697 )
							if( rangema <= 1.12094 )
								if( priceRange <= 0.611277 )
									ret := -0.200000
								if( priceRange > 0.611277 )
									ret := 0.312500
							if( rangema > 1.12094 )
								ret := -0.461538
						if( lowerBB > 42.1697 )
							ret := -0.916667 // sell
	
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
float op_operation = decision_tree_0_ATOMUSDT_30Min_f00851a7(val, sqzOnInt, lowerBB, lowerKC, upperKC, dev, rangema, sqzOffInt, upperBB, priceRange, noSqzInt, ma, basis, avgHighLow)

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


