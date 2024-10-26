//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: CRWD_15Min_1SQU_54b95038 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_15Min_1SQU_54b95038", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_15Min_54b95038(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( upperKC <= 189.479 )
		if( upperBB <= 186.537 )
			if( val <= 0.017839 )
				if( upperKC <= 37.9132 )
					if( rangema <= 0.941611 )
						if( val <= 0.003322 )
							if( priceRange <= 1.8321 )
								if( priceRange <= 0.11005 )
									ret := 0.933333 // buy
								if( priceRange > 0.11005 )
									ret := 1.000000 // buy
							if( priceRange > 1.8321 )
								ret := 0.714286 // buy
						if( val > 0.003322 )
							ret := 0.666667
					if( rangema > 0.941611 )
						ret := 0.500000
				if( upperKC > 37.9132 )
					if( avgHighLow <= 36.928 )
						if( rangema <= 0.756956 )
							if( upperKC <= 38.3413 )
								ret := -1.000000 // sell
							if( upperKC > 38.3413 )
								ret := -0.500000
						if( rangema > 0.756956 )
							ret := 0.166667
					if( avgHighLow > 36.928 )
						if( avgHighLow <= 49.2848 )
							if( lowerKC <= 47.3574 )
								if( val <= -0.126491 )
									ret := 0.693333
								if( val > -0.126491 )
									ret := 0.073529
							if( lowerKC > 47.3574 )
								if( dev <= 0.624943 )
									ret := 0.599057
								if( dev > 0.624943 )
									ret := 0.243056
						if( avgHighLow > 49.2848 )
							if( basis <= 51.3736 )
								if( dev <= 0.754465 )
									ret := -0.338462
								if( dev > 0.754465 )
									ret := 0.086705
							if( basis > 51.3736 )
								if( upperBB <= 55.0804 )
									ret := 0.495000
								if( upperBB > 55.0804 )
									ret := 0.092276
			if( val > 0.017839 )
				if( dev <= 0.860693 )
					if( ma <= 153.421 )
						if( ma <= 47.1284 )
							if( dev <= 0.430785 )
								if( upperKC <= 45.8908 )
									ret := 0.000000
								if( upperKC > 45.8908 )
									ret := 0.826087 // buy
							if( dev > 0.430785 )
								if( lowerKC <= 37.292 )
									ret := 1.000000 // buy
								if( lowerKC > 37.292 )
									ret := -0.032520
						if( ma > 47.1284 )
							if( avgHighLow <= 114.892 )
								if( priceRange <= 0.59995 )
									ret := -0.161210
								if( priceRange > 0.59995 )
									ret := 0.018541
							if( avgHighLow > 114.892 )
								if( basis <= 117.008 )
									ret := 0.623529
								if( basis > 117.008 )
									ret := 0.048480
					if( ma > 153.421 )
						if( rangema <= 0.75026 )
							if( val <= 0.038535 )
								if( avgHighLow <= 163.8 )
									ret := -0.500000
								if( avgHighLow > 163.8 )
									ret := 0.234043
							if( val > 0.038535 )
								if( dev <= 0.831995 )
									ret := -0.603448
								if( dev > 0.831995 )
									ret := 0.062500
						if( rangema > 0.75026 )
							if( rangema <= 0.94423 )
								if( priceRange <= 1.055 )
									ret := 0.238095
								if( priceRange > 1.055 )
									ret := 1.000000 // buy
							if( rangema > 0.94423 )
								if( upperBB <= 169.097 )
									ret := -0.461538
								if( upperBB > 169.097 )
									ret := 0.250000
				if( dev > 0.860693 )
					if( avgHighLow <= 48.245 )
						if( val <= 0.148965 )
							if( upperBB <= 35.3255 )
								if( priceRange <= 1.05204 )
									ret := -1.000000 // sell
								if( priceRange > 1.05204 )
									ret := -0.375000
							if( upperBB > 35.3255 )
								if( upperBB <= 38.9973 )
									ret := 0.650000
								if( upperBB > 38.9973 )
									ret := -0.167568
						if( val > 0.148965 )
							if( dev <= 0.954385 )
								ret := 1.000000 // buy
							if( dev > 0.954385 )
								if( dev <= 1.32896 )
									ret := -1.000000 // sell
								if( dev > 1.32896 )
									ret := -0.540000
					if( avgHighLow > 48.245 )
						if( avgHighLow <= 56.701 )
							if( rangema <= 0.707463 )
								if( val <= 0.104907 )
									ret := 0.289116
								if( val > 0.104907 )
									ret := -0.297297
							if( rangema > 0.707463 )
								if( upperKC <= 49.8371 )
									ret := -1.000000 // sell
								if( upperKC > 49.8371 )
									ret := 0.632558
						if( avgHighLow > 56.701 )
							if( basis <= 58.7766 )
								if( rangema <= 0.632469 )
									ret := -0.735849 // sell
								if( rangema > 0.632469 )
									ret := -0.067164
							if( basis > 58.7766 )
								if( ma <= 66.0939 )
									ret := 0.294756
								if( ma > 66.0939 )
									ret := 0.022876
		if( upperBB > 186.537 )
			if( upperKC <= 185.769 )
				if( rangema <= 0.658674 )
					ret := -1.000000 // sell
				if( rangema > 0.658674 )
					if( basis <= 182.277 )
						if( avgHighLow <= 181.922 )
							if( lowerBB <= 161.156 )
								ret := 0.000000
							if( lowerBB > 161.156 )
								ret := 1.000000 // buy
						if( avgHighLow > 181.922 )
							if( lowerKC <= 179.068 )
								if( priceRange <= 1.79154 )
									ret := 0.142857
								if( priceRange > 1.79154 )
									ret := 0.750000 // buy
							if( lowerKC > 179.068 )
								if( dev <= 5.65414 )
									ret := -0.750000 // sell
								if( dev > 5.65414 )
									ret := -0.250000
					if( basis > 182.277 )
						if( dev <= 3.08592 )
							ret := -0.142857
						if( dev > 3.08592 )
							if( upperBB <= 187.21 )
								if( val <= 0.234045 )
									ret := 0.000000
								if( val > 0.234045 )
									ret := 0.800000 // buy
							if( upperBB > 187.21 )
								if( rangema <= 1.70861 )
									ret := 0.964286 // buy
								if( rangema > 1.70861 )
									ret := 0.692308
			if( upperKC > 185.769 )
				if( upperBB <= 192.285 )
					if( rangema <= 0.626149 )
						if( lowerBB <= 186.64 )
							if( priceRange <= 0.300915 )
								if( rangema <= 0.513768 )
									ret := 0.857143 // buy
								if( rangema > 0.513768 )
									ret := 0.250000
							if( priceRange > 0.300915 )
								if( val <= -0.098059 )
									ret := -0.250000
								if( val > -0.098059 )
									ret := 0.967033 // buy
						if( lowerBB > 186.64 )
							if( upperKC <= 189.394 )
								if( rangema <= 0.490835 )
									ret := -0.866667 // sell
								if( rangema > 0.490835 )
									ret := -0.107143
							if( upperKC > 189.394 )
								ret := 1.000000 // buy
					if( rangema > 0.626149 )
						if( dev <= 3.68635 )
							if( upperKC <= 186.636 )
								if( upperBB <= 187.39 )
									ret := -0.524590
								if( upperBB > 187.39 )
									ret := 0.400000
							if( upperKC > 186.636 )
								if( upperKC <= 188.493 )
									ret := 0.373874
								if( upperKC > 188.493 )
									ret := 0.024390
						if( dev > 3.68635 )
							if( val <= 0.566007 )
								if( upperKC <= 186.242 )
									ret := 0.428571
								if( upperKC > 186.242 )
									ret := -0.475000
							if( val > 0.566007 )
								if( rangema <= 1.97302 )
									ret := 0.000000
								if( rangema > 1.97302 )
									ret := 1.000000 // buy
				if( upperBB > 192.285 )
					if( rangema <= 2.09005 )
						ret := 0.500000
					if( rangema > 2.09005 )
						if( upperBB <= 193.039 )
							ret := 0.600000
						if( upperBB > 193.039 )
							ret := 1.000000 // buy
	if( upperKC > 189.479 )
		if( upperBB <= 190.299 )
			if( priceRange <= 0.4993 )
				if( lowerKC <= 186.731 )
					if( ma <= 188.04 )
						ret := 0.166667
					if( ma > 188.04 )
						if( val <= -0.125902 )
							ret := 0.500000
						if( val > -0.125902 )
							if( lowerKC <= 186.44 )
								ret := 1.000000 // buy
							if( lowerKC > 186.44 )
								ret := 0.750000 // buy
				if( lowerKC > 186.731 )
					if( val <= -0.010406 )
						if( basis <= 188.799 )
							ret := 0.000000
						if( basis > 188.799 )
							ret := -0.750000 // sell
					if( val > -0.010406 )
						if( val <= 0.041616 )
							ret := -1.000000 // sell
						if( val > 0.041616 )
							ret := -0.750000 // sell
			if( priceRange > 0.4993 )
				if( priceRange <= 3.47648 )
					if( dev <= 0.903679 )
						ret := 0.000000
					if( dev > 0.903679 )
						if( ma <= 187.324 )
							ret := -1.000000 // sell
						if( ma > 187.324 )
							if( avgHighLow <= 187.745 )
								ret := 0.000000
							if( avgHighLow > 187.745 )
								if( val <= -0.178846 )
									ret := 0.500000
								if( val > -0.178846 )
									ret := -0.754717 // sell
				if( priceRange > 3.47648 )
					if( avgHighLow <= 189.697 )
						ret := 1.000000 // buy
					if( avgHighLow > 189.697 )
						ret := -0.250000
		if( upperBB > 190.299 )
			if( rangema <= 1.93859 )
				if( rangema <= 1.00091 )
					if( basis <= 189.474 )
						if( priceRange <= 1.11709 )
							if( avgHighLow <= 189.205 )
								if( dev <= 2.36043 )
									ret := 0.893617 // buy
								if( dev > 2.36043 )
									ret := 0.000000
							if( avgHighLow > 189.205 )
								if( upperBB <= 190.773 )
									ret := 0.000000
								if( upperBB > 190.773 )
									ret := -0.909091 // sell
						if( priceRange > 1.11709 )
							if( rangema <= 0.791815 )
								if( upperBB <= 191 )
									ret := 1.000000 // buy
								if( upperBB > 191 )
									ret := 0.250000
							if( rangema > 0.791815 )
								if( lowerKC <= 187.077 )
									ret := 0.800000 // buy
								if( lowerKC > 187.077 )
									ret := 1.000000 // buy
					if( basis > 189.474 )
						if( ma <= 190.412 )
							if( rangema <= 0.947925 )
								if( ma <= 189.694 )
									ret := -0.045455
								if( ma > 189.694 )
									ret := -0.589474
							if( rangema > 0.947925 )
								if( lowerBB <= 186.836 )
									ret := -0.400000
								if( lowerBB > 186.836 )
									ret := 0.526316
						if( ma > 190.412 )
							if( upperBB <= 387.055 )
								if( val <= 0.001207 )
									ret := 0.114801
								if( val > 0.001207 )
									ret := 0.014530
							if( upperBB > 387.055 )
								if( ma <= 386.151 )
									ret := -0.807692 // sell
								if( ma > 386.151 )
									ret := -0.191176
				if( rangema > 1.00091 )
					if( lowerBB <= 191.943 )
						if( upperBB <= 191.306 )
							if( avgHighLow <= 189.471 )
								if( val <= -0.026215 )
									ret := 0.648148
								if( val > -0.026215 )
									ret := -0.130435
							if( avgHighLow > 189.471 )
								if( priceRange <= 0.893876 )
									ret := 0.000000
								if( priceRange > 0.893876 )
									ret := -0.714286 // sell
						if( upperBB > 191.306 )
							if( avgHighLow <= 193.94 )
								if( avgHighLow <= 189.688 )
									ret := -0.414530
								if( avgHighLow > 189.688 )
									ret := -0.120805
							if( avgHighLow > 193.94 )
								if( dev <= 4.1015 )
									ret := -0.807692 // sell
								if( dev > 4.1015 )
									ret := 0.000000
					if( lowerBB > 191.943 )
						if( val <= -0.138243 )
							if( rangema <= 1.39986 )
								if( val <= -0.643225 )
									ret := 1.000000 // buy
								if( val > -0.643225 )
									ret := 0.147120
							if( rangema > 1.39986 )
								if( lowerBB <= 192.385 )
									ret := 0.705882 // buy
								if( lowerBB > 192.385 )
									ret := 0.009974
						if( val > -0.138243 )
							if( avgHighLow <= 199.761 )
								if( val <= -0.027325 )
									ret := 0.434599
								if( val > -0.027325 )
									ret := -0.033333
							if( avgHighLow > 199.761 )
								if( avgHighLow <= 231.767 )
									ret := -0.125254
								if( avgHighLow > 231.767 )
									ret := -0.014888
			if( rangema > 1.93859 )
				if( avgHighLow <= 330.57 )
					if( upperBB <= 342.543 )
						if( avgHighLow <= 237.877 )
							if( priceRange <= 2.55832 )
								if( val <= -0.688457 )
									ret := 0.756757 // buy
								if( val > -0.688457 )
									ret := 0.117465
							if( priceRange > 2.55832 )
								if( rangema <= 2.50244 )
									ret := 0.444142
								if( rangema > 2.50244 )
									ret := 0.154150
						if( avgHighLow > 237.877 )
							if( val <= 1.48999 )
								if( avgHighLow <= 244.399 )
									ret := -0.365385
								if( avgHighLow > 244.399 )
									ret := 0.032670
							if( val > 1.48999 )
								if( val <= 2.31087 )
									ret := 0.954545 // buy
								if( val > 2.31087 )
									ret := 0.600000
					if( upperBB > 342.543 )
						if( rangema <= 8.58925 )
							if( basis <= 333.478 )
								if( lowerKC <= 296.45 )
									ret := 0.500000
								if( lowerKC > 296.45 )
									ret := 0.983871 // buy
							if( basis > 333.478 )
								ret := -0.600000
						if( rangema > 8.58925 )
							ret := -1.000000 // sell
				if( avgHighLow > 330.57 )
					if( ma <= 367.631 )
						if( upperKC <= 366.435 )
							if( lowerBB <= 328.751 )
								if( val <= 0.549855 )
									ret := -0.664000
								if( val > 0.549855 )
									ret := 0.157895
							if( lowerBB > 328.751 )
								if( priceRange <= 4.37715 )
									ret := -0.098361
								if( priceRange > 4.37715 )
									ret := 0.700000 // buy
						if( upperKC > 366.435 )
							if( upperKC <= 371.388 )
								if( lowerKC <= 363.538 )
									ret := -0.960784 // sell
								if( lowerKC > 363.538 )
									ret := -0.500000
							if( upperKC > 371.388 )
								ret := -0.400000
					if( ma > 367.631 )
						if( dev <= 3.12409 )
							if( avgHighLow <= 383.284 )
								if( val <= -0.154415 )
									ret := -0.375000
								if( val > -0.154415 )
									ret := 0.869565 // buy
							if( avgHighLow > 383.284 )
								ret := 0.000000
						if( dev > 3.12409 )
							if( val <= 0.580485 )
								if( upperBB <= 374.651 )
									ret := 0.857143 // buy
								if( upperBB > 374.651 )
									ret := 0.079137
							if( val > 0.580485 )
								if( ma <= 373.656 )
									ret := -0.250000
								if( ma > 373.656 )
									ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_CRWD_15Min_54b95038(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)

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


