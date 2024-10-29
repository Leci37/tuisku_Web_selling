//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: XLMUSDT_15Min_1SQU_c502a9fd Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XLMUSDT_15Min_1SQU_c502a9fd", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XLMUSDT_15Min_c502a9fd(rangema, avgHighLow, upperKC, lowerBB, noSqzInt, ma, upperBB, lowerKC, basis, sqzOnInt, priceRange, dev, val, sqzOffInt)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( lowerBB <= 0.140342 )
		if( rangema <= 0.000424 )
			if( lowerBB <= 0.076049 )
				if( avgHighLow <= 0.076267 )
					if( sqzOffInt <= 0.5 )
						if( dev <= 0.000279 )
							if( basis <= 0.07237 )
								if( basis <= 0.072293 )
									ret := 0.099448
								if( basis > 0.072293 )
									ret := 0.600000
							if( basis > 0.07237 )
								if( lowerKC <= 0.073736 )
									ret := -0.369176
								if( lowerKC > 0.073736 )
									ret := -0.022005
						if( dev > 0.000279 )
							if( rangema <= 0.00025 )
								if( ma <= 0.07393 )
									ret := -0.771429 // sell
								if( ma > 0.07393 )
									ret := 0.169231
							if( rangema > 0.00025 )
								if( upperBB <= 0.076443 )
									ret := 0.334211
								if( upperBB > 0.076443 )
									ret := -0.600000
					if( sqzOffInt > 0.5 )
						if( upperKC <= 0.076738 )
							if( upperKC <= 0.076459 )
								if( upperBB <= 0.075215 )
									ret := 0.304267
								if( upperBB > 0.075215 )
									ret := -0.036364
							if( upperKC > 0.076459 )
								if( basis <= 0.076078 )
									ret := 0.972222 // buy
								if( basis > 0.076078 )
									ret := 0.000000
						if( upperKC > 0.076738 )
							ret := -0.631579
				if( avgHighLow > 0.076267 )
					if( rangema <= 0.000242 )
						ret := 0.200000
					if( rangema > 0.000242 )
						if( upperKC <= 0.077048 )
							if( lowerKC <= 0.075921 )
								ret := 1.000000 // buy
							if( lowerKC > 0.075921 )
								if( lowerBB <= 0.075946 )
									ret := 0.722222 // buy
								if( lowerBB > 0.075946 )
									ret := 0.857143 // buy
						if( upperKC > 0.077048 )
							ret := 0.375000
			if( lowerBB > 0.076049 )
				if( ma <= 0.077007 )
					if( ma <= 0.076643 )
						ret := -0.040000
					if( ma > 0.076643 )
						if( lowerKC <= 0.076284 )
							if( avgHighLow <= 0.076684 )
								ret := -0.869565 // sell
							if( avgHighLow > 0.076684 )
								ret := 0.176471
						if( lowerKC > 0.076284 )
							if( priceRange <= 0.000208 )
								ret := -0.900000 // sell
							if( priceRange > 0.000208 )
								ret := -1.000000 // sell
				if( ma > 0.077007 )
					if( sqzOffInt <= 0.5 )
						if( lowerBB <= 0.088704 )
							if( ma <= 0.081994 )
								if( avgHighLow <= 0.079103 )
									ret := 0.187713
								if( avgHighLow > 0.079103 )
									ret := -0.269841
							if( ma > 0.081994 )
								if( lowerKC <= 0.086889 )
									ret := 0.111748
								if( lowerKC > 0.086889 )
									ret := -0.026090
						if( lowerBB > 0.088704 )
							if( ma <= 0.089482 )
								if( lowerKC <= 0.088489 )
									ret := 0.666667
								if( lowerKC > 0.088489 )
									ret := -0.338156
							if( ma > 0.089482 )
								if( priceRange <= 0.000305 )
									ret := -0.044785
								if( priceRange > 0.000305 )
									ret := -0.113418
					if( sqzOffInt > 0.5 )
						if( avgHighLow <= 0.12492 )
							if( val <= 6e-06 )
								if( upperBB <= 0.07942 )
									ret := -0.537634
								if( upperBB > 0.07942 )
									ret := 0.048416
							if( val > 6e-06 )
								if( priceRange <= 0.00069 )
									ret := -0.068900
								if( priceRange > 0.00069 )
									ret := 0.239382
						if( avgHighLow > 0.12492 )
							if( val <= 7.2e-05 )
								if( basis <= 0.127274 )
									ret := 0.516949
								if( basis > 0.127274 )
									ret := 0.046809
							if( val > 7.2e-05 )
								if( basis <= 0.129655 )
									ret := 0.812500 // buy
								if( basis > 0.129655 )
									ret := 0.000000
		if( rangema > 0.000424 )
			if( lowerBB <= 0.087536 )
				if( dev <= 0.00605 )
					if( dev <= 0.004423 )
						if( lowerBB <= 0.077686 )
							if( basis <= 0.08062 )
								if( lowerBB <= 0.074812 )
									ret := 0.021505
								if( lowerBB > 0.074812 )
									ret := 0.706897 // buy
							if( basis > 0.08062 )
								ret := -0.833333 // sell
						if( lowerBB > 0.077686 )
							if( upperKC <= 0.089911 )
								if( basis <= 0.082092 )
									ret := -0.005312
								if( basis > 0.082092 )
									ret := 0.183546
							if( upperKC > 0.089911 )
								if( basis <= 0.089531 )
									ret := 0.821053 // buy
								if( basis > 0.089531 )
									ret := 0.400000
					if( dev > 0.004423 )
						if( upperBB <= 0.090256 )
							if( upperKC <= 0.086493 )
								ret := 1.000000 // buy
							if( upperKC > 0.086493 )
								if( avgHighLow <= 0.083779 )
									ret := 0.555556
								if( avgHighLow > 0.083779 )
									ret := 1.000000 // buy
						if( upperBB > 0.090256 )
							if( ma <= 0.086015 )
								ret := 0.300000
							if( ma > 0.086015 )
								ret := 0.857143 // buy
				if( dev > 0.00605 )
					if( basis <= 0.103795 )
						if( upperKC <= 0.085556 )
							ret := -0.818182 // sell
						if( upperKC > 0.085556 )
							ret := -0.500000
					if( basis > 0.103795 )
						ret := -1.000000 // sell
			if( lowerBB > 0.087536 )
				if( upperBB <= 0.089635 )
					if( priceRange <= 0.001017 )
						if( avgHighLow <= 0.088153 )
							if( ma <= 0.08822 )
								if( basis <= 0.088057 )
									ret := 0.750000 // buy
								if( basis > 0.088057 )
									ret := -0.391304
							if( ma > 0.08822 )
								if( ma <= 0.08832 )
									ret := 1.000000 // buy
								if( ma > 0.08832 )
									ret := 0.214286
						if( avgHighLow > 0.088153 )
							if( basis <= 0.088713 )
								if( lowerKC <= 0.087899 )
									ret := -0.586387
								if( lowerKC > 0.087899 )
									ret := -0.043478
							if( basis > 0.088713 )
								if( upperBB <= 0.089563 )
									ret := -0.640000
								if( upperBB > 0.089563 )
									ret := -0.862745 // sell
					if( priceRange > 0.001017 )
						if( dev <= 0.000855 )
							if( upperBB <= 0.08917 )
								ret := 0.615385
							if( upperBB > 0.08917 )
								ret := -0.444444
						if( dev > 0.000855 )
							ret := 0.866667 // buy
				if( upperBB > 0.089635 )
					if( priceRange <= 0.006041 )
						if( ma <= 0.10958 )
							if( val <= -0.000236 )
								if( upperKC <= 0.110434 )
									ret := 0.745098 // buy
								if( upperKC > 0.110434 )
									ret := -0.095890
							if( val > -0.000236 )
								if( avgHighLow <= 0.105945 )
									ret := 0.036451
								if( avgHighLow > 0.105945 )
									ret := 0.141855
						if( ma > 0.10958 )
							if( lowerKC <= 0.109614 )
								if( rangema <= 0.001919 )
									ret := -0.214286
								if( rangema > 0.001919 )
									ret := 0.596154
							if( lowerKC > 0.109614 )
								if( rangema <= 0.003614 )
									ret := 0.017806
								if( rangema > 0.003614 )
									ret := -0.932432 // sell
					if( priceRange > 0.006041 )
						if( avgHighLow <= 0.14567 )
							if( lowerBB <= 0.103345 )
								ret := 1.000000 // buy
							if( lowerBB > 0.103345 )
								if( lowerBB <= 0.123403 )
									ret := -0.058824
								if( lowerBB > 0.123403 )
									ret := 0.830508 // buy
						if( avgHighLow > 0.14567 )
							if( dev <= 0.032134 )
								ret := 0.916667 // buy
							if( dev > 0.032134 )
								if( priceRange <= 0.011547 )
									ret := -1.000000 // sell
								if( priceRange > 0.011547 )
									ret := -0.800000 // sell
	if( lowerBB > 0.140342 )
		if( rangema <= 0.002362 )
			if( val <= 0.000179 )
				if( avgHighLow <= 0.185518 )
					if( upperBB <= 0.166369 )
						if( lowerKC <= 0.15706 )
							if( avgHighLow <= 0.154226 )
								if( avgHighLow <= 0.148703 )
									ret := -0.100485
								if( avgHighLow > 0.148703 )
									ret := -0.328720
							if( avgHighLow > 0.154226 )
								if( lowerBB <= 0.154227 )
									ret := 0.651961
								if( lowerBB > 0.154227 )
									ret := -0.093023
						if( lowerKC > 0.15706 )
							if( lowerKC <= 0.161936 )
								if( lowerBB <= 0.158016 )
									ret := -0.753846 // sell
								if( lowerBB > 0.158016 )
									ret := -0.232877
							if( lowerKC > 0.161936 )
								if( rangema <= 0.001343 )
									ret := -0.733333 // sell
								if( rangema > 0.001343 )
									ret := -1.000000 // sell
					if( upperBB > 0.166369 )
						if( upperBB <= 0.166882 )
							if( upperKC <= 0.167192 )
								if( upperBB <= 0.166642 )
									ret := 0.675676
								if( upperBB > 0.166642 )
									ret := 0.964286 // buy
							if( upperKC > 0.167192 )
								ret := -0.272727
						if( upperBB > 0.166882 )
							if( lowerKC <= 0.1655 )
								if( lowerKC <= 0.162054 )
									ret := 0.206897
								if( lowerKC > 0.162054 )
									ret := -0.566176
							if( lowerKC > 0.1655 )
								if( avgHighLow <= 0.168151 )
									ret := 0.746479 // buy
								if( avgHighLow > 0.168151 )
									ret := 0.026316
				if( avgHighLow > 0.185518 )
					if( lowerBB <= 0.185784 )
						if( val <= -0.000106 )
							if( priceRange <= 0.000619 )
								ret := -0.875000 // sell
							if( priceRange > 0.000619 )
								ret := -1.000000 // sell
						if( val > -0.000106 )
							if( lowerBB <= 0.18546 )
								if( upperKC <= 0.187053 )
									ret := -0.812500 // sell
								if( upperKC > 0.187053 )
									ret := -0.538462
							if( lowerBB > 0.18546 )
								ret := -0.285714
					if( lowerBB > 0.185784 )
						if( ma <= 0.187009 )
							ret := 0.583333
						if( ma > 0.187009 )
							ret := -0.222222
			if( val > 0.000179 )
				if( basis <= 0.157733 )
					if( lowerBB <= 0.144449 )
						if( ma <= 0.145586 )
							if( upperKC <= 0.145895 )
								if( ma <= 0.142283 )
									ret := -0.785714 // sell
								if( ma > 0.142283 )
									ret := 0.090909
							if( upperKC > 0.145895 )
								if( ma <= 0.145316 )
									ret := -0.964286 // sell
								if( ma > 0.145316 )
									ret := -0.777778 // sell
						if( ma > 0.145586 )
							ret := 0.300000
					if( lowerBB > 0.144449 )
						if( avgHighLow <= 0.146 )
							ret := -0.125000
						if( avgHighLow > 0.146 )
							if( ma <= 0.15556 )
								if( upperBB <= 0.150694 )
									ret := -0.829787 // sell
								if( upperBB > 0.150694 )
									ret := -1.000000 // sell
							if( ma > 0.15556 )
								if( priceRange <= 0.001203 )
									ret := -0.181818
								if( priceRange > 0.001203 )
									ret := -0.833333 // sell
				if( basis > 0.157733 )
					if( avgHighLow <= 0.163213 )
						if( priceRange <= 0.001412 )
							if( basis <= 0.161537 )
								ret := 0.764706 // buy
							if( basis > 0.161537 )
								ret := 1.000000 // buy
						if( priceRange > 0.001412 )
							if( basis <= 0.161115 )
								ret := -0.909091 // sell
							if( basis > 0.161115 )
								ret := 0.500000
					if( avgHighLow > 0.163213 )
						if( avgHighLow <= 0.169395 )
							if( rangema <= 0.001393 )
								if( dev <= 0.001599 )
									ret := -0.857143 // sell
								if( dev > 0.001599 )
									ret := -0.500000
							if( rangema > 0.001393 )
								if( priceRange <= 0.001433 )
									ret := -0.761905 // sell
								if( priceRange > 0.001433 )
									ret := -1.000000 // sell
						if( avgHighLow > 0.169395 )
							if( upperBB <= 0.17304 )
								if( upperBB <= 0.172205 )
									ret := 0.785714 // buy
								if( upperBB > 0.172205 )
									ret := 1.000000 // buy
							if( upperBB > 0.17304 )
								if( upperKC <= 0.175179 )
									ret := -0.928571 // sell
								if( upperKC > 0.175179 )
									ret := -0.547170
		if( rangema > 0.002362 )
			if( avgHighLow <= 0.149676 )
				if( val <= 0.000331 )
					if( avgHighLow <= 0.143215 )
						ret := 0.176471
					if( avgHighLow > 0.143215 )
						if( priceRange <= 0.005147 )
							if( lowerKC <= 0.145315 )
								if( upperBB <= 0.153303 )
									ret := 0.808511 // buy
								if( upperBB > 0.153303 )
									ret := 1.000000 // buy
							if( lowerKC > 0.145315 )
								ret := 0.200000
						if( priceRange > 0.005147 )
							ret := 0.117647
				if( val > 0.000331 )
					if( upperKC <= 0.150989 )
						ret := 0.416667
					if( upperKC > 0.150989 )
						if( ma <= 0.146388 )
							ret := -1.000000 // sell
						if( ma > 0.146388 )
							ret := -0.625000
			if( avgHighLow > 0.149676 )
				if( basis <= 0.153484 )
					if( ma <= 0.148492 )
						if( lowerBB <= 0.143693 )
							ret := 0.833333 // buy
						if( lowerBB > 0.143693 )
							ret := 1.000000 // buy
					if( ma > 0.148492 )
						if( sqzOnInt <= 0.5 )
							if( upperBB <= 0.155537 )
								ret := -1.000000 // sell
							if( upperBB > 0.155537 )
								if( priceRange <= 0.002893 )
									ret := -0.933333 // sell
								if( priceRange > 0.002893 )
									ret := -0.214286
						if( sqzOnInt > 0.5 )
							if( lowerKC <= 0.145533 )
								if( lowerBB <= 0.145337 )
									ret := 0.400000
								if( lowerBB > 0.145337 )
									ret := -0.827586 // sell
							if( lowerKC > 0.145533 )
								ret := 0.904762 // buy
				if( basis > 0.153484 )
					if( upperKC <= 0.166054 )
						if( upperBB <= 0.161023 )
							if( rangema <= 0.002486 )
								ret := 0.615385
							if( rangema > 0.002486 )
								ret := 1.000000 // buy
						if( upperBB > 0.161023 )
							if( upperKC <= 0.162867 )
								if( lowerBB <= 0.151033 )
									ret := 0.000000
								if( lowerBB > 0.151033 )
									ret := -0.333333
							if( upperKC > 0.162867 )
								if( basis <= 0.158506 )
									ret := 0.933333 // buy
								if( basis > 0.158506 )
									ret := 0.380952
					if( upperKC > 0.166054 )
						if( priceRange <= 0.004547 )
							if( avgHighLow <= 0.170061 )
								if( dev <= 0.010688 )
									ret := -0.531250
								if( dev > 0.010688 )
									ret := 0.909091 // buy
							if( avgHighLow > 0.170061 )
								if( upperBB <= 0.176421 )
									ret := 1.000000 // buy
								if( upperBB > 0.176421 )
									ret := -0.333333
						if( priceRange > 0.004547 )
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
float op_operation = decision_tree_0_XLMUSDT_15Min_c502a9fd(rangema, avgHighLow, upperKC, lowerBB, noSqzInt, ma, upperBB, lowerKC, basis, sqzOnInt, priceRange, dev, val, sqzOffInt)

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


