//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: DOGEUSDT_30Min_1SQU_9fac5610 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOGEUSDT_30Min_1SQU_9fac5610", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOGEUSDT_30Min_9fac5610(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( upperKC <= 0.054658 )
		if( rangema <= 0.00038 )
			if( upperKC <= 0.008832 )
				if( rangema <= 4.1e-05 )
					if( upperBB <= 0.00281 )
						if( upperBB <= 0.002699 )
							if( rangema <= 1.8e-05 )
								if( priceRange <= 3.7e-05 )
									ret := 0.010989
								if( priceRange > 3.7e-05 )
									ret := 0.500000
							if( rangema > 1.8e-05 )
								if( val <= 4e-06 )
									ret := 0.237903
								if( val > 4e-06 )
									ret := -0.400000
						if( upperBB > 0.002699 )
							if( lowerKC <= 0.002658 )
								if( lowerBB <= 0.002631 )
									ret := 0.100000
								if( lowerBB > 0.002631 )
									ret := 0.630769
							if( lowerKC > 0.002658 )
								if( rangema <= 3.3e-05 )
									ret := 0.112583
								if( rangema > 3.3e-05 )
									ret := 0.519231
					if( upperBB > 0.00281 )
						if( ma <= 0.002899 )
							if( dev <= 1.7e-05 )
								if( upperKC <= 0.002821 )
									ret := -0.090909
								if( upperKC > 0.002821 )
									ret := -0.581395
							if( dev > 1.7e-05 )
								if( priceRange <= 2e-05 )
									ret := 0.062147
								if( priceRange > 2e-05 )
									ret := -0.253623
						if( ma > 0.002899 )
							if( basis <= 0.003398 )
								if( avgHighLow <= 0.003383 )
									ret := 0.092123
								if( avgHighLow > 0.003383 )
									ret := 0.516129
							if( basis > 0.003398 )
								if( lowerBB <= 0.0034 )
									ret := -0.574468
								if( lowerBB > 0.0034 )
									ret := 0.315068
				if( rangema > 4.1e-05 )
					if( upperKC <= 0.00357 )
						if( rangema <= 9.4e-05 )
							if( rangema <= 6e-05 )
								if( lowerBB <= 0.003409 )
									ret := 0.215488
								if( lowerBB > 0.003409 )
									ret := 0.840000 // buy
							if( rangema > 6e-05 )
								if( avgHighLow <= 0.003457 )
									ret := 0.730769 // buy
								if( avgHighLow > 0.003457 )
									ret := -0.600000
						if( rangema > 9.4e-05 )
							if( basis <= 0.003212 )
								ret := 0.666667
							if( basis > 0.003212 )
								if( dev <= 0.000153 )
									ret := -1.000000 // sell
								if( dev > 0.000153 )
									ret := -0.750000 // sell
					if( upperKC > 0.00357 )
						if( val <= -1.1e-05 )
							if( avgHighLow <= 0.003863 )
								if( upperKC <= 0.004091 )
									ret := -0.535714
								if( upperKC > 0.004091 )
									ret := 0.857143 // buy
							if( avgHighLow > 0.003863 )
								if( ma <= 0.00473 )
									ret := 0.784091 // buy
								if( ma > 0.00473 )
									ret := 0.276596
						if( val > -1.1e-05 )
							if( lowerBB <= 0.003661 )
								if( upperBB <= 0.0039 )
									ret := 0.025641
								if( upperBB > 0.0039 )
									ret := -0.872727 // sell
							if( lowerBB > 0.003661 )
								if( dev <= 0.000372 )
									ret := 0.068196
								if( dev > 0.000372 )
									ret := 0.776119 // buy
			if( upperKC > 0.008832 )
				if( lowerKC <= 0.008606 )
					if( upperKC <= 0.00897 )
						if( val <= -2.8e-05 )
							if( lowerKC <= 0.008181 )
								ret := 0.750000 // buy
							if( lowerKC > 0.008181 )
								ret := 1.000000 // buy
						if( val > -2.8e-05 )
							if( priceRange <= 0.000291 )
								if( rangema <= 0.000144 )
									ret := -0.155556
								if( rangema > 0.000144 )
									ret := -0.884615 // sell
							if( priceRange > 0.000291 )
								ret := 1.000000 // buy
					if( upperKC > 0.00897 )
						if( lowerKC <= 0.008561 )
							ret := -1.000000 // sell
						if( lowerKC > 0.008561 )
							ret := -0.714286 // sell
				if( lowerKC > 0.008606 )
					if( priceRange <= 0.000144 )
						if( rangema <= 8e-05 )
							if( lowerKC <= 0.00904 )
								if( lowerBB <= 0.008661 )
									ret := 0.750000 // buy
								if( lowerBB > 0.008661 )
									ret := -0.250000
							if( lowerKC > 0.00904 )
								ret := 1.000000 // buy
						if( rangema > 8e-05 )
							if( lowerKC <= 0.010018 )
								if( upperBB <= 0.010426 )
									ret := -0.223022
								if( upperBB > 0.010426 )
									ret := -0.958333 // sell
							if( lowerKC > 0.010018 )
								if( rangema <= 0.000287 )
									ret := 1.000000 // buy
								if( rangema > 0.000287 )
									ret := 0.250000
					if( priceRange > 0.000144 )
						if( val <= 5e-06 )
							if( upperKC <= 0.009794 )
								if( upperKC <= 0.009641 )
									ret := 0.282051
								if( upperKC > 0.009641 )
									ret := 1.000000 // buy
							if( upperKC > 0.009794 )
								if( val <= -2.9e-05 )
									ret := 0.785714 // buy
								if( val > -2.9e-05 )
									ret := 0.025937
						if( val > 5e-06 )
							if( ma <= 0.010181 )
								if( upperBB <= 0.010093 )
									ret := -0.082474
								if( upperBB > 0.010093 )
									ret := -0.723077 // sell
							if( ma > 0.010181 )
								if( dev <= 0.000219 )
									ret := -0.500000
								if( dev > 0.000219 )
									ret := 0.283582
		if( rangema > 0.00038 )
			if( lowerKC <= 0.050665 )
				if( lowerKC <= 0.008814 )
					if( upperBB <= 0.007411 )
						ret := -1.000000 // sell
					if( upperBB > 0.007411 )
						if( priceRange <= 0.001434 )
							if( lowerBB <= 0.007189 )
								if( lowerBB <= 0.005656 )
									ret := 0.111111
								if( lowerBB > 0.005656 )
									ret := 0.947368 // buy
							if( lowerBB > 0.007189 )
								if( lowerKC <= 0.008363 )
									ret := 0.060000
								if( lowerKC > 0.008363 )
									ret := 0.849057 // buy
						if( priceRange > 0.001434 )
							if( dev <= 0.002707 )
								ret := -0.833333 // sell
							if( dev > 0.002707 )
								ret := 0.333333
				if( lowerKC > 0.008814 )
					if( upperBB <= 0.011082 )
						if( upperKC <= 0.010231 )
							ret := 1.000000 // buy
						if( upperKC > 0.010231 )
							ret := -1.000000 // sell
					if( upperBB > 0.011082 )
						if( lowerBB <= 0.009747 )
							if( avgHighLow <= 0.010983 )
								if( lowerBB <= 0.008833 )
									ret := 1.000000 // buy
								if( lowerBB > 0.008833 )
									ret := -0.625000
							if( avgHighLow > 0.010983 )
								if( ma <= 0.01551 )
									ret := 0.911765 // buy
								if( ma > 0.01551 )
									ret := -0.500000
						if( lowerBB > 0.009747 )
							if( val <= 0.000254 )
								if( upperBB <= 0.013307 )
									ret := -0.481481
								if( upperBB > 0.013307 )
									ret := 0.196066
							if( val > 0.000254 )
								if( ma <= 0.032981 )
									ret := 0.171429
								if( ma > 0.032981 )
									ret := -0.767857 // sell
			if( lowerKC > 0.050665 )
				if( lowerBB <= 0.050945 )
					if( rangema <= 0.001077 )
						if( lowerKC <= 0.051535 )
							if( val <= 0.000206 )
								if( priceRange <= 0.00102 )
									ret := 0.906977 // buy
								if( priceRange > 0.00102 )
									ret := 1.000000 // buy
							if( val > 0.000206 )
								ret := 0.500000
						if( lowerKC > 0.051535 )
							ret := 0.500000
					if( rangema > 0.001077 )
						if( val <= -0.000101 )
							ret := 1.000000 // buy
						if( val > -0.000101 )
							ret := -0.500000
				if( lowerBB > 0.050945 )
					if( avgHighLow <= 0.05341 )
						if( priceRange <= 0.001587 )
							if( upperKC <= 0.053192 )
								if( priceRange <= 0.000304 )
									ret := 0.000000
								if( priceRange > 0.000304 )
									ret := 0.608696
							if( upperKC > 0.053192 )
								if( lowerKC <= 0.05135 )
									ret := -1.000000 // sell
								if( lowerKC > 0.05135 )
									ret := 0.180723
						if( priceRange > 0.001587 )
							if( upperKC <= 0.054537 )
								ret := 1.000000 // buy
							if( upperKC > 0.054537 )
								ret := 0.750000 // buy
					if( avgHighLow > 0.05341 )
						if( ma <= 0.053523 )
							ret := 0.250000
						if( ma > 0.053523 )
							if( val <= -1e-06 )
								if( priceRange <= 0.000272 )
									ret := 0.250000
								if( priceRange > 0.000272 )
									ret := 1.000000 // buy
							if( val > -1e-06 )
								ret := 1.000000 // buy
	if( upperKC > 0.054658 )
		if( val <= -0.000522 )
			if( upperBB <= 0.655658 )
				if( val <= -0.001093 )
					if( dev <= 0.015196 )
						if( dev <= 0.007875 )
							if( dev <= 0.006558 )
								if( priceRange <= 0.004608 )
									ret := 0.925000 // buy
								if( priceRange > 0.004608 )
									ret := -0.111111
							if( dev > 0.006558 )
								if( ma <= 0.179117 )
									ret := -0.900000 // sell
								if( ma > 0.179117 )
									ret := 0.375000
						if( dev > 0.007875 )
							if( sqzOffInt <= 0.5 )
								if( rangema <= 0.006586 )
									ret := 0.100000
								if( rangema > 0.006586 )
									ret := 0.847682 // buy
							if( sqzOffInt > 0.5 )
								if( lowerBB <= 0.256953 )
									ret := 0.585366
								if( lowerBB > 0.256953 )
									ret := 0.052632
					if( dev > 0.015196 )
						if( lowerKC <= 0.225726 )
							if( avgHighLow <= 0.058483 )
								ret := 0.000000
							if( avgHighLow > 0.058483 )
								if( lowerBB <= 0.144422 )
									ret := 0.676471
								if( lowerBB > 0.144422 )
									ret := 0.975610 // buy
						if( lowerKC > 0.225726 )
							if( upperKC <= 0.37262 )
								if( rangema <= 0.012607 )
									ret := -0.705882 // sell
								if( rangema > 0.012607 )
									ret := 0.183333
							if( upperKC > 0.37262 )
								if( priceRange <= 0.023581 )
									ret := 0.217687
								if( priceRange > 0.023581 )
									ret := 0.728395 // buy
				if( val > -0.001093 )
					if( avgHighLow <= 0.305167 )
						if( dev <= 0.012909 )
							if( dev <= 0.008831 )
								if( upperBB <= 0.144888 )
									ret := 0.633333
								if( upperBB > 0.144888 )
									ret := 0.192110
							if( dev > 0.008831 )
								if( priceRange <= 0.003695 )
									ret := -0.633803
								if( priceRange > 0.003695 )
									ret := 0.219512
						if( dev > 0.012909 )
							if( upperBB <= 0.177522 )
								ret := -1.000000 // sell
							if( upperBB > 0.177522 )
								if( avgHighLow <= 0.284743 )
									ret := 0.634146
								if( avgHighLow > 0.284743 )
									ret := 0.151515
					if( avgHighLow > 0.305167 )
						if( lowerKC <= 0.324091 )
							if( sqzOnInt <= 0.5 )
								if( upperBB <= 0.319432 )
									ret := -1.000000 // sell
								if( upperBB > 0.319432 )
									ret := -0.329670
							if( sqzOnInt > 0.5 )
								if( rangema <= 0.021681 )
									ret := 0.180851
								if( rangema > 0.021681 )
									ret := -0.800000 // sell
						if( lowerKC > 0.324091 )
							if( rangema <= 0.009602 )
								if( avgHighLow <= 0.500938 )
									ret := 0.106918
								if( avgHighLow > 0.500938 )
									ret := -1.000000 // sell
							if( rangema > 0.009602 )
								if( priceRange <= 0.020695 )
									ret := 0.213793
								if( priceRange > 0.020695 )
									ret := 0.891892 // buy
			if( upperBB > 0.655658 )
				if( priceRange <= 0.030728 )
					if( val <= -0.002371 )
						if( val <= -0.004598 )
							ret := -0.200000
						if( val > -0.004598 )
							ret := -1.000000 // sell
					if( val > -0.002371 )
						if( dev <= 0.022205 )
							if( lowerBB <= 0.69529 )
								ret := -0.750000 // sell
							if( lowerBB > 0.69529 )
								ret := -1.000000 // sell
						if( dev > 0.022205 )
							if( lowerBB <= 0.650286 )
								if( val <= -0.001917 )
									ret := 0.333333
								if( val > -0.001917 )
									ret := -0.588235
							if( lowerBB > 0.650286 )
								if( priceRange <= 0.01629 )
									ret := 1.000000 // buy
								if( priceRange > 0.01629 )
									ret := 0.250000
				if( priceRange > 0.030728 )
					if( rangema <= 0.04065 )
						if( rangema <= 0.028072 )
							if( basis <= 0.6963 )
								if( dev <= 0.044269 )
									ret := 0.000000
								if( dev > 0.044269 )
									ret := -0.750000 // sell
							if( basis > 0.6963 )
								ret := 1.000000 // buy
						if( rangema > 0.028072 )
							ret := 1.000000 // buy
					if( rangema > 0.04065 )
						ret := -1.000000 // sell
		if( val > -0.000522 )
			if( avgHighLow <= 0.051461 )
				if( priceRange <= 0.006675 )
					if( val <= -0.000296 )
						ret := 0.200000
					if( val > -0.000296 )
						if( val <= 0.000274 )
							ret := -1.000000 // sell
						if( val > 0.000274 )
							ret := -0.750000 // sell
				if( priceRange > 0.006675 )
					ret := 1.000000 // buy
			if( avgHighLow > 0.051461 )
				if( dev <= 0.003017 )
					if( basis <= 0.168878 )
						if( upperKC <= 0.055838 )
							if( dev <= 0.002695 )
								if( dev <= 0.001558 )
									ret := -0.196078
								if( dev > 0.001558 )
									ret := -0.777778 // sell
							if( dev > 0.002695 )
								if( priceRange <= 0.00159 )
									ret := 1.000000 // buy
								if( priceRange > 0.00159 )
									ret := -0.800000 // sell
						if( upperKC > 0.055838 )
							if( upperBB <= 0.055917 )
								if( val <= 3.7e-05 )
									ret := 0.695652
								if( val > 3.7e-05 )
									ret := 0.190476
							if( upperBB > 0.055917 )
								if( lowerKC <= 0.052634 )
									ret := 0.657534
								if( lowerKC > 0.052634 )
									ret := 0.030885
					if( basis > 0.168878 )
						if( avgHighLow <= 0.191087 )
							if( upperKC <= 0.192333 )
								if( val <= 8e-05 )
									ret := -0.124207
								if( val > 8e-05 )
									ret := -0.374101
							if( upperKC > 0.192333 )
								if( avgHighLow <= 0.189937 )
									ret := -0.888889 // sell
								if( avgHighLow > 0.189937 )
									ret := -0.492754
						if( avgHighLow > 0.191087 )
							if( upperBB <= 0.199327 )
								if( basis <= 0.193268 )
									ret := 0.025000
								if( basis > 0.193268 )
									ret := 0.608392
							if( upperBB > 0.199327 )
								if( upperKC <= 0.242151 )
									ret := -0.091915
								if( upperKC > 0.242151 )
									ret := 0.073384
				if( dev > 0.003017 )
					if( val <= 0.00011 )
						if( avgHighLow <= 0.249062 )
							if( rangema <= 0.00508 )
								if( upperBB <= 0.252059 )
									ret := 0.197558
								if( upperBB > 0.252059 )
									ret := 0.681818
							if( rangema > 0.00508 )
								if( basis <= 0.189166 )
									ret := -0.517413
								if( basis > 0.189166 )
									ret := 0.191667
						if( avgHighLow > 0.249062 )
							if( upperKC <= 0.256936 )
								if( rangema <= 0.003413 )
									ret := -0.952381 // sell
								if( rangema > 0.003413 )
									ret := -0.387097
							if( upperKC > 0.256936 )
								if( val <= -3.4e-05 )
									ret := 0.000000
								if( val > -3.4e-05 )
									ret := 0.188133
					if( val > 0.00011 )
						if( lowerKC <= 0.14062 )
							if( upperBB <= 0.097324 )
								if( upperBB <= 0.057457 )
									ret := 0.923077 // buy
								if( upperBB > 0.057457 )
									ret := -0.106195
							if( upperBB > 0.097324 )
								if( lowerBB <= 0.088523 )
									ret := 0.888889 // buy
								if( lowerBB > 0.088523 )
									ret := 0.204283
						if( lowerKC > 0.14062 )
							if( basis <= 0.164605 )
								if( dev <= 0.005206 )
									ret := 0.012739
								if( dev > 0.005206 )
									ret := -0.473684
							if( basis > 0.164605 )
								if( lowerKC <= 0.16376 )
									ret := 0.574324
								if( lowerKC > 0.16376 )
									ret := -0.048004
	
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
float op_operation = decision_tree_0_DOGEUSDT_30Min_9fac5610(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)

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


