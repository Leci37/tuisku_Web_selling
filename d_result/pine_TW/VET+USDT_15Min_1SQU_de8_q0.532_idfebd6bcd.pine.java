//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: VETUSDT_15Min_1SQU_febd6bcd Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_VETUSDT_15Min_1SQU_febd6bcd", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_VETUSDT_15Min_febd6bcd(rangema, avgHighLow, upperKC, lowerBB, noSqzInt, ma, upperBB, lowerKC, basis, sqzOnInt, priceRange, dev, val, sqzOffInt)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( lowerBB <= 0.027353 )
		if( rangema <= 0.000187 )
			if( upperKC <= 0.02773 )
				if( basis <= 0.01496 )
					if( lowerBB <= 0.014662 )
						if( ma <= 0.014747 )
							if( lowerKC <= 0.014497 )
								if( basis <= 0.014632 )
									ret := 0.400000
								if( basis > 0.014632 )
									ret := 1.000000 // buy
							if( lowerKC > 0.014497 )
								if( lowerKC <= 0.014615 )
									ret := -0.300000
								if( lowerKC > 0.014615 )
									ret := 0.050000
						if( ma > 0.014747 )
							if( rangema <= 0.000102 )
								if( avgHighLow <= 0.014872 )
									ret := -0.833333 // sell
								if( avgHighLow > 0.014872 )
									ret := -0.312500
							if( rangema > 0.000102 )
								ret := -1.000000 // sell
					if( lowerBB > 0.014662 )
						if( sqzOffInt <= 0.5 )
							if( avgHighLow <= 0.014779 )
								if( lowerBB <= 0.014702 )
									ret := 0.315789
								if( lowerBB > 0.014702 )
									ret := 0.851064 // buy
							if( avgHighLow > 0.014779 )
								if( upperBB <= 0.015057 )
									ret := -0.255319
								if( upperBB > 0.015057 )
									ret := 0.904762 // buy
						if( sqzOffInt > 0.5 )
							if( basis <= 0.014776 )
								ret := 1.000000 // buy
							if( basis > 0.014776 )
								if( rangema <= 5e-05 )
									ret := 0.068966
								if( rangema > 5e-05 )
									ret := 0.674074
				if( basis > 0.01496 )
					if( lowerBB <= 0.025465 )
						if( basis <= 0.02563 )
							if( dev <= 0.000255 )
								if( lowerBB <= 0.025102 )
									ret := 0.000869
								if( lowerBB > 0.025102 )
									ret := 0.190227
							if( dev > 0.000255 )
								if( upperKC <= 0.023035 )
									ret := 0.148950
								if( upperKC > 0.023035 )
									ret := -0.014607
						if( basis > 0.02563 )
							if( lowerBB <= 0.025248 )
								if( lowerKC <= 0.025441 )
									ret := 1.000000 // buy
								if( lowerKC > 0.025441 )
									ret := 0.909091 // buy
							if( lowerBB > 0.025248 )
								if( lowerBB <= 0.025377 )
									ret := 0.129870
								if( lowerBB > 0.025377 )
									ret := 0.579439
					if( lowerBB > 0.025465 )
						if( lowerKC <= 0.026292 )
							if( ma <= 0.026405 )
								if( upperKC <= 0.026618 )
									ret := -0.120724
								if( upperKC > 0.026618 )
									ret := 0.521739
							if( ma > 0.026405 )
								if( avgHighLow <= 0.026444 )
									ret := -0.594203
								if( avgHighLow > 0.026444 )
									ret := -0.214815
						if( lowerKC > 0.026292 )
							if( basis <= 0.026668 )
								if( upperKC <= 0.026714 )
									ret := -0.351648
								if( upperKC > 0.026714 )
									ret := 0.470852
							if( basis > 0.026668 )
								if( upperBB <= 0.027753 )
									ret := -0.064862
								if( upperBB > 0.027753 )
									ret := 0.521127
			if( upperKC > 0.02773 )
				if( priceRange <= 0.000201 )
					if( avgHighLow <= 0.027476 )
						if( ma <= 0.027547 )
							ret := 0.555556
						if( ma > 0.027547 )
							ret := -0.818182 // sell
					if( avgHighLow > 0.027476 )
						if( ma <= 0.027609 )
							if( lowerKC <= 0.027367 )
								if( lowerKC <= 0.027349 )
									ret := 0.627907
								if( lowerKC > 0.027349 )
									ret := 0.320000
							if( lowerKC > 0.027367 )
								if( priceRange <= 0.000108 )
									ret := 0.928571 // buy
								if( priceRange > 0.000108 )
									ret := 0.727273 // buy
						if( ma > 0.027609 )
							if( priceRange <= 9.6e-05 )
								ret := -0.214286
							if( priceRange > 9.6e-05 )
								if( lowerKC <= 0.027462 )
									ret := 0.100000
								if( lowerKC > 0.027462 )
									ret := 0.928571 // buy
				if( priceRange > 0.000201 )
					if( upperKC <= 0.027788 )
						ret := 0.769231 // buy
					if( upperKC > 0.027788 )
						ret := 1.000000 // buy
		if( rangema > 0.000187 )
			if( avgHighLow <= 0.022458 )
				if( lowerKC <= 0.020769 )
					if( val <= -2e-05 )
						if( priceRange <= 0.000129 )
							if( val <= -3.9e-05 )
								ret := 0.076923
							if( val > -3.9e-05 )
								if( dev <= 0.000419 )
									ret := -0.636364
								if( dev > 0.000419 )
									ret := -0.166667
						if( priceRange > 0.000129 )
							if( upperBB <= 0.018832 )
								if( upperKC <= 0.016675 )
									ret := 0.535714
								if( upperKC > 0.016675 )
									ret := 1.000000 // buy
							if( upperBB > 0.018832 )
								if( lowerBB <= 0.020635 )
									ret := 0.480556
								if( lowerBB > 0.020635 )
									ret := -0.923077 // sell
					if( val > -2e-05 )
						if( dev <= 0.000737 )
							if( val <= 2.4e-05 )
								if( lowerBB <= 0.019122 )
									ret := -0.369906
								if( lowerBB > 0.019122 )
									ret := 0.032086
							if( val > 2.4e-05 )
								if( lowerKC <= 0.020169 )
									ret := 0.261364
								if( lowerKC > 0.020169 )
									ret := 0.586777
						if( dev > 0.000737 )
							if( basis <= 0.020199 )
								if( priceRange <= 0.000554 )
									ret := 0.409091
								if( priceRange > 0.000554 )
									ret := 1.000000 // buy
							if( basis > 0.020199 )
								if( basis <= 0.021214 )
									ret := -0.394231
								if( basis > 0.021214 )
									ret := -0.914286 // sell
				if( lowerKC > 0.020769 )
					if( lowerKC <= 0.021011 )
						if( lowerBB <= 0.020321 )
							ret := -0.400000
						if( lowerBB > 0.020321 )
							if( upperKC <= 0.021655 )
								if( priceRange <= 0.000145 )
									ret := -0.068966
								if( priceRange > 0.000145 )
									ret := 0.728155 // buy
							if( upperKC > 0.021655 )
								if( sqzOnInt <= 0.5 )
									ret := 0.863636 // buy
								if( sqzOnInt > 0.5 )
									ret := 1.000000 // buy
					if( lowerKC > 0.021011 )
						if( ma <= 0.021661 )
							if( lowerBB <= 0.021438 )
								if( lowerBB <= 0.021327 )
									ret := -0.084211
								if( lowerBB > 0.021327 )
									ret := 0.430380
							if( lowerBB > 0.021438 )
								if( priceRange <= 0.000136 )
									ret := -1.000000 // sell
								if( priceRange > 0.000136 )
									ret := -0.900000 // sell
						if( ma > 0.021661 )
							if( upperKC <= 0.022097 )
								if( priceRange <= 0.000121 )
									ret := 0.470588
								if( priceRange > 0.000121 )
									ret := 0.915663 // buy
							if( upperKC > 0.022097 )
								if( dev <= 0.001033 )
									ret := 0.246377
								if( dev > 0.001033 )
									ret := 0.669643
			if( avgHighLow > 0.022458 )
				if( basis <= 0.027758 )
					if( val <= -1.1e-05 )
						if( rangema <= 0.000425 )
							if( rangema <= 0.000383 )
								if( priceRange <= 0.00015 )
									ret := 0.393836
								if( priceRange > 0.00015 )
									ret := 0.048348
							if( rangema > 0.000383 )
								if( dev <= 0.001171 )
									ret := -0.678832
								if( dev > 0.001171 )
									ret := 0.500000
						if( rangema > 0.000425 )
							if( val <= -2.3e-05 )
								if( ma <= 0.027309 )
									ret := 0.748571 // buy
								if( ma > 0.027309 )
									ret := 0.274510
							if( val > -2.3e-05 )
								if( ma <= 0.023443 )
									ret := 0.950000 // buy
								if( ma > 0.023443 )
									ret := -0.628571
					if( val > -1.1e-05 )
						if( basis <= 0.022612 )
							if( priceRange <= 0.000584 )
								if( upperBB <= 0.023097 )
									ret := -0.664894
								if( upperBB > 0.023097 )
									ret := 0.179487
							if( priceRange > 0.000584 )
								ret := 0.454545
						if( basis > 0.022612 )
							if( basis <= 0.026268 )
								if( lowerBB <= 0.024448 )
									ret := -0.013276
								if( lowerBB > 0.024448 )
									ret := 0.256949
							if( basis > 0.026268 )
								if( lowerKC <= 0.026845 )
									ret := -0.271529
								if( lowerKC > 0.026845 )
									ret := 0.182561
				if( basis > 0.027758 )
					if( rangema <= 0.000358 )
						if( upperBB <= 0.029049 )
							if( basis <= 0.027899 )
								if( avgHighLow <= 0.027752 )
									ret := 0.876712 // buy
								if( avgHighLow > 0.027752 )
									ret := 0.333333
							if( basis > 0.027899 )
								if( lowerKC <= 0.027544 )
									ret := 0.842105 // buy
								if( lowerKC > 0.027544 )
									ret := 1.000000 // buy
						if( upperBB > 0.029049 )
							ret := 0.000000
					if( rangema > 0.000358 )
						if( upperKC <= 0.029834 )
							if( lowerKC <= 0.027822 )
								if( avgHighLow <= 0.028049 )
									ret := 0.636364
								if( avgHighLow > 0.028049 )
									ret := -0.563380
							if( lowerKC > 0.027822 )
								if( dev <= 0.0014 )
									ret := 1.000000 // buy
								if( dev > 0.0014 )
									ret := 0.000000
						if( upperKC > 0.029834 )
							if( ma <= 0.02925 )
								ret := 1.000000 // buy
							if( ma > 0.02925 )
								ret := -0.333333
	if( lowerBB > 0.027353 )
		if( ma <= 0.049187 )
			if( basis <= 0.027652 )
				if( priceRange <= 0.000157 )
					if( dev <= 0.00017 )
						if( upperKC <= 0.027822 )
							if( priceRange <= 0.000101 )
								ret := -0.833333 // sell
							if( priceRange > 0.000101 )
								ret := -1.000000 // sell
						if( upperKC > 0.027822 )
							ret := -1.000000 // sell
					if( dev > 0.00017 )
						if( dev <= 0.000186 )
							ret := -0.333333
						if( dev > 0.000186 )
							if( priceRange <= 0.00012 )
								ret := -0.722222 // sell
							if( priceRange > 0.00012 )
								ret := -1.000000 // sell
				if( priceRange > 0.000157 )
					if( val <= -1e-06 )
						ret := 0.600000
					if( val > -1e-06 )
						ret := -0.866667 // sell
			if( basis > 0.027652 )
				if( rangema <= 0.000277 )
					if( sqzOnInt <= 0.5 )
						if( upperBB <= 0.028079 )
							if( lowerBB <= 0.027585 )
								if( val <= -1.3e-05 )
									ret := 0.133333
								if( val > -1.3e-05 )
									ret := 0.684211
							if( lowerBB > 0.027585 )
								if( rangema <= 0.000101 )
									ret := 0.000000
								if( rangema > 0.000101 )
									ret := -0.142857
						if( upperBB > 0.028079 )
							if( val <= 1.3e-05 )
								if( basis <= 0.039723 )
									ret := 0.004224
								if( basis > 0.039723 )
									ret := 0.247772
							if( val > 1.3e-05 )
								if( dev <= 0.000664 )
									ret := -0.170083
								if( dev > 0.000664 )
									ret := 0.232472
					if( sqzOnInt > 0.5 )
						if( rangema <= 0.000259 )
							if( priceRange <= 0.00048 )
								if( priceRange <= 0.00025 )
									ret := -0.110750
								if( priceRange > 0.00025 )
									ret := -0.002427
							if( priceRange > 0.00048 )
								if( basis <= 0.031245 )
									ret := 0.871795 // buy
								if( basis > 0.031245 )
									ret := 0.278846
						if( rangema > 0.000259 )
							if( upperBB <= 0.0424 )
								if( avgHighLow <= 0.041912 )
									ret := -0.213115
								if( avgHighLow > 0.041912 )
									ret := 0.947368 // buy
							if( upperBB > 0.0424 )
								if( dev <= 0.000199 )
									ret := 0.400000
								if( dev > 0.000199 )
									ret := -0.506024
				if( rangema > 0.000277 )
					if( val <= 7.4e-05 )
						if( val <= -0.000214 )
							ret := 1.000000 // buy
						if( val > -0.000214 )
							if( lowerKC <= 0.030523 )
								if( basis <= 0.030598 )
									ret := 0.056331
								if( basis > 0.030598 )
									ret := 0.439063
							if( lowerKC > 0.030523 )
								if( rangema <= 0.00066 )
									ret := 0.019385
								if( rangema > 0.00066 )
									ret := -0.147865
					if( val > 7.4e-05 )
						if( basis <= 0.047469 )
							if( priceRange <= 0.000345 )
								if( upperBB <= 0.04296 )
									ret := -0.272727
								if( upperBB > 0.04296 )
									ret := 0.401575
							if( priceRange > 0.000345 )
								if( dev <= 0.000638 )
									ret := -0.872549 // sell
								if( dev > 0.000638 )
									ret := -0.322917
						if( basis > 0.047469 )
							if( ma <= 0.047875 )
								if( ma <= 0.047652 )
									ret := 1.000000 // buy
								if( ma > 0.047652 )
									ret := 0.666667
							if( ma > 0.047875 )
								if( lowerKC <= 0.047236 )
									ret := -0.541667
								if( lowerKC > 0.047236 )
									ret := 0.300000
		if( ma > 0.049187 )
			if( ma <= 0.049633 )
				if( ma <= 0.049498 )
					if( rangema <= 0.00043 )
						if( val <= 1.1e-05 )
							if( upperBB <= 0.049623 )
								ret := 0.384615
							if( upperBB > 0.049623 )
								if( avgHighLow <= 0.049463 )
									ret := -0.666667
								if( avgHighLow > 0.049463 )
									ret := 0.227273
						if( val > 1.1e-05 )
							if( ma <= 0.049376 )
								if( lowerKC <= 0.048762 )
									ret := -0.931034 // sell
								if( lowerKC > 0.048762 )
									ret := -1.000000 // sell
							if( ma > 0.049376 )
								ret := -0.500000
					if( rangema > 0.00043 )
						if( priceRange <= 0.001382 )
							if( dev <= 0.000596 )
								if( lowerKC <= 0.048692 )
									ret := -0.045455
								if( lowerKC > 0.048692 )
									ret := 0.880000 // buy
							if( dev > 0.000596 )
								if( lowerBB <= 0.04856 )
									ret := -0.717949 // sell
								if( lowerBB > 0.04856 )
									ret := -0.277778
						if( priceRange > 0.001382 )
							ret := 1.000000 // buy
				if( ma > 0.049498 )
					if( priceRange <= 0.00027 )
						if( lowerBB <= 0.04893 )
							ret := -0.375000
						if( lowerBB > 0.04893 )
							ret := -0.818182 // sell
					if( priceRange > 0.00027 )
						if( lowerBB <= 0.047719 )
							ret := -0.692308
						if( lowerBB > 0.047719 )
							ret := -1.000000 // sell
			if( ma > 0.049633 )
				if( rangema <= 0.000225 )
					if( dev <= 0.000308 )
						ret := 1.000000 // buy
					if( dev > 0.000308 )
						ret := 0.785714 // buy
				if( rangema > 0.000225 )
					if( avgHighLow <= 0.050343 )
						if( val <= 1e-06 )
							if( val <= -5.2e-05 )
								if( basis <= 0.050155 )
									ret := 0.125000
								if( basis > 0.050155 )
									ret := -0.805556 // sell
							if( val > -5.2e-05 )
								if( rangema <= 0.000269 )
									ret := 0.238095
								if( rangema > 0.000269 )
									ret := 0.690647
						if( val > 1e-06 )
							if( avgHighLow <= 0.04995 )
								if( basis <= 0.049698 )
									ret := 0.666667
								if( basis > 0.049698 )
									ret := -0.673469
							if( avgHighLow > 0.04995 )
								if( val <= 0.000102 )
									ret := 0.142857
								if( val > 0.000102 )
									ret := 1.000000 // buy
					if( avgHighLow > 0.050343 )
						if( upperBB <= 0.051607 )
							if( lowerKC <= 0.049829 )
								if( upperKC <= 0.051413 )
									ret := -0.386364
								if( upperKC > 0.051413 )
									ret := -1.000000 // sell
							if( lowerKC > 0.049829 )
								if( avgHighLow <= 0.051145 )
									ret := -0.964286 // sell
								if( avgHighLow > 0.051145 )
									ret := -0.636364
						if( upperBB > 0.051607 )
							if( basis <= 0.051759 )
								if( dev <= 0.002569 )
									ret := 0.225225
								if( dev > 0.002569 )
									ret := -1.000000 // sell
							if( basis > 0.051759 )
								if( ma <= 0.052217 )
									ret := -0.318841
								if( ma > 0.052217 )
									ret := -0.627329
	
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
float op_operation = decision_tree_0_VETUSDT_15Min_febd6bcd(rangema, avgHighLow, upperKC, lowerBB, noSqzInt, ma, upperBB, lowerKC, basis, sqzOnInt, priceRange, dev, val, sqzOffInt)

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


