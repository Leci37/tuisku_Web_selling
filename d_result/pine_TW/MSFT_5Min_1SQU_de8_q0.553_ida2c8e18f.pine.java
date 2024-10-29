//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: MSFT_5Min_1SQU_a2c8e18f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_5Min_1SQU_a2c8e18f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_5Min_a2c8e18f(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( avgHighLow <= 330.489 )
		if( lowerKC <= 279.472 )
			if( dev <= 0.808753 )
				if( rangema <= 0.471493 )
					if( rangema <= 0.437721 )
						ret := -0.750000 // sell
					if( rangema > 0.437721 )
						if( val <= -0.008889 )
							ret := 1.000000 // buy
						if( val > -0.008889 )
							ret := 0.000000
				if( rangema > 0.471493 )
					if( lowerBB <= 277.333 )
						if( sqzOnInt <= 0.5 )
							ret := -1.000000 // sell
						if( sqzOnInt > 0.5 )
							ret := 0.000000
					if( lowerBB > 277.333 )
						if( val <= -0.010521 )
							ret := -0.400000
						if( val > -0.010521 )
							if( val <= 0.091864 )
								ret := -1.000000 // sell
							if( val > 0.091864 )
								ret := -0.750000 // sell
			if( dev > 0.808753 )
				if( priceRange <= 1.085 )
					if( lowerBB <= 277.054 )
						if( ma <= 277.454 )
							ret := 0.000000
						if( ma > 277.454 )
							if( val <= -0.032234 )
								ret := 1.000000 // buy
							if( val > -0.032234 )
								if( lowerKC <= 277.344 )
									ret := 1.000000 // buy
								if( lowerKC > 277.344 )
									ret := 0.600000
					if( lowerBB > 277.054 )
						if( priceRange <= 0.365 )
							if( priceRange <= 0.309588 )
								ret := -0.750000 // sell
							if( priceRange > 0.309588 )
								ret := -1.000000 // sell
						if( priceRange > 0.365 )
							if( rangema <= 0.607418 )
								if( avgHighLow <= 279.035 )
									ret := 0.000000
								if( avgHighLow > 279.035 )
									ret := -0.500000
							if( rangema > 0.607418 )
								if( rangema <= 0.776663 )
									ret := 0.857143 // buy
								if( rangema > 0.776663 )
									ret := 0.250000
				if( priceRange > 1.085 )
					ret := -1.000000 // sell
		if( lowerKC > 279.472 )
			if( lowerBB <= 329.013 )
				if( rangema <= 0.799702 )
					if( lowerKC <= 328.611 )
						if( val <= 0.06529 )
							if( upperBB <= 330.305 )
								if( dev <= 1.43384 )
									ret := 0.081028
								if( dev > 1.43384 )
									ret := 0.353191
							if( upperBB > 330.305 )
								if( lowerBB <= 328.41 )
									ret := 0.626866
								if( lowerBB > 328.41 )
									ret := -1.000000 // sell
						if( val > 0.06529 )
							if( avgHighLow <= 306.723 )
								if( rangema <= 0.45167 )
									ret := 0.641975
								if( rangema > 0.45167 )
									ret := 0.152542
							if( avgHighLow > 306.723 )
								if( avgHighLow <= 324.058 )
									ret := -0.200000
								if( avgHighLow > 324.058 )
									ret := 0.144665
					if( lowerKC > 328.611 )
						if( lowerBB <= 328.683 )
							if( val <= -0.074723 )
								if( val <= -0.118266 )
									ret := 1.000000 // buy
								if( val > -0.118266 )
									ret := 0.105263
							if( val > -0.074723 )
								if( priceRange <= 1.00672 )
									ret := -0.392070
								if( priceRange > 1.00672 )
									ret := -0.846154 // sell
						if( lowerBB > 328.683 )
							if( avgHighLow <= 329.815 )
								if( upperKC <= 329.938 )
									ret := 0.044248
								if( upperKC > 329.938 )
									ret := -0.394737
							if( avgHighLow > 329.815 )
								if( lowerKC <= 329.359 )
									ret := 0.704918 // buy
								if( lowerKC > 329.359 )
									ret := -0.200000
				if( rangema > 0.799702 )
					if( upperBB <= 298.339 )
						if( basis <= 285.351 )
							ret := -0.500000
						if( basis > 285.351 )
							if( upperBB <= 296.482 )
								ret := 1.000000 // buy
							if( upperBB > 296.482 )
								if( avgHighLow <= 295.81 )
									ret := 0.357143
								if( avgHighLow > 295.81 )
									ret := 0.916667 // buy
					if( upperBB > 298.339 )
						if( rangema <= 1.55693 )
							if( val <= 0.030898 )
								if( upperBB <= 327.407 )
									ret := 0.275124
								if( upperBB > 327.407 )
									ret := -0.148867
							if( val > 0.030898 )
								if( upperBB <= 299.021 )
									ret := -1.000000 // sell
								if( upperBB > 299.021 )
									ret := 0.472477
						if( rangema > 1.55693 )
							if( avgHighLow <= 296.526 )
								if( avgHighLow <= 296.157 )
									ret := -0.300000
								if( avgHighLow > 296.157 )
									ret := 0.750000 // buy
							if( avgHighLow > 296.526 )
								if( upperBB <= 324.866 )
									ret := -1.000000 // sell
								if( upperBB > 324.866 )
									ret := -0.571429
			if( lowerBB > 329.013 )
				if( upperKC <= 331.598 )
					if( val <= -0.03192 )
						if( lowerBB <= 329.661 )
							if( ma <= 330.554 )
								if( priceRange <= 0.64805 )
									ret := 0.333333
								if( priceRange > 0.64805 )
									ret := -0.428571
							if( ma > 330.554 )
								if( lowerKC <= 329.839 )
									ret := 1.000000 // buy
								if( lowerKC > 329.839 )
									ret := 0.750000 // buy
						if( lowerBB > 329.661 )
							if( val <= -0.072797 )
								if( val <= -0.092478 )
									ret := 1.000000 // buy
								if( val > -0.092478 )
									ret := 0.200000
							if( val > -0.072797 )
								if( rangema <= 0.150195 )
									ret := 0.000000
								if( rangema > 0.150195 )
									ret := -0.774194 // sell
					if( val > -0.03192 )
						if( upperBB <= 331.468 )
							if( priceRange <= 0.10023 )
								if( rangema <= 0.088337 )
									ret := 0.687500
								if( rangema > 0.088337 )
									ret := 0.068182
							if( priceRange > 0.10023 )
								if( upperBB <= 330.641 )
									ret := 0.603175
								if( upperBB > 330.641 )
									ret := 0.296482
						if( upperBB > 331.468 )
							if( val <= 0.052172 )
								ret := 1.000000 // buy
							if( val > 0.052172 )
								ret := 0.250000
				if( upperKC > 331.598 )
					if( dev <= 0.926119 )
						if( dev <= 0.89693 )
							ret := 0.142857
						if( dev > 0.89693 )
							if( rangema <= 0.965827 )
								ret := -1.000000 // sell
							if( rangema > 0.965827 )
								ret := -0.500000
					if( dev > 0.926119 )
						if( lowerKC <= 330.563 )
							if( priceRange <= 0.839096 )
								ret := 0.000000
							if( priceRange > 0.839096 )
								if( dev <= 0.991199 )
									ret := 0.333333
								if( dev > 0.991199 )
									ret := 1.000000 // buy
						if( lowerKC > 330.563 )
							ret := -1.000000 // sell
	if( avgHighLow > 330.489 )
		if( dev <= 1.33242 )
			if( upperKC <= 351.85 )
				if( upperKC <= 349.821 )
					if( basis <= 330.574 )
						if( lowerBB <= 329.327 )
							if( lowerKC <= 329.197 )
								if( upperKC <= 331.534 )
									ret := -0.750000 // sell
								if( upperKC > 331.534 )
									ret := -1.000000 // sell
							if( lowerKC > 329.197 )
								if( avgHighLow <= 330.563 )
									ret := -0.777778 // sell
								if( avgHighLow > 330.563 )
									ret := 0.283333
						if( lowerBB > 329.327 )
							if( val <= 0.033379 )
								if( lowerBB <= 330.002 )
									ret := -0.790476 // sell
								if( lowerBB > 330.002 )
									ret := 0.062500
							if( val > 0.033379 )
								if( avgHighLow <= 330.571 )
									ret := 1.000000 // buy
								if( avgHighLow > 330.571 )
									ret := -0.333333
					if( basis > 330.574 )
						if( lowerBB <= 330.34 )
							if( rangema <= 0.260953 )
								if( dev <= 0.685957 )
									ret := 0.083333
								if( dev > 0.685957 )
									ret := -0.771429 // sell
							if( rangema > 0.260953 )
								if( lowerKC <= 329.776 )
									ret := -0.120000
								if( lowerKC > 329.776 )
									ret := 0.508475
						if( lowerBB > 330.34 )
							if( ma <= 332.139 )
								if( dev <= 0.851336 )
									ret := -0.063857
								if( dev > 0.851336 )
									ret := -0.472973
							if( ma > 332.139 )
								if( rangema <= 0.767767 )
									ret := 0.003208
								if( rangema > 0.767767 )
									ret := 0.197691
				if( upperKC > 349.821 )
					if( sqzOnInt <= 0.5 )
						if( avgHighLow <= 349.665 )
							if( avgHighLow <= 348.977 )
								if( lowerBB <= 347.702 )
									ret := -1.000000 // sell
								if( lowerBB > 347.702 )
									ret := -0.285714
							if( avgHighLow > 348.977 )
								if( val <= -0.045497 )
									ret := 1.000000 // buy
								if( val > -0.045497 )
									ret := 0.518519
						if( avgHighLow > 349.665 )
							if( val <= -0.012208 )
								ret := 0.333333
							if( val > -0.012208 )
								if( basis <= 349.585 )
									ret := -0.833333 // sell
								if( basis > 349.585 )
									ret := -1.000000 // sell
					if( sqzOnInt > 0.5 )
						if( rangema <= 0.500073 )
							if( avgHighLow <= 349.182 )
								if( lowerBB <= 348.592 )
									ret := 0.000000
								if( lowerBB > 348.592 )
									ret := -1.000000 // sell
							if( avgHighLow > 349.182 )
								ret := 0.000000
						if( rangema > 0.500073 )
							if( priceRange <= 0.819415 )
								if( ma <= 350.222 )
									ret := -0.981818 // sell
								if( ma > 350.222 )
									ret := -0.809524 // sell
							if( priceRange > 0.819415 )
								if( lowerKC <= 349.134 )
									ret := -0.714286 // sell
								if( lowerKC > 349.134 )
									ret := 0.250000
			if( upperKC > 351.85 )
				if( lowerBB <= 352.786 )
					if( priceRange <= 0.156845 )
						if( priceRange <= 0.09915 )
							if( dev <= 0.153428 )
								ret := 0.250000
							if( dev > 0.153428 )
								ret := 0.000000
						if( priceRange > 0.09915 )
							if( lowerBB <= 352.384 )
								ret := 0.666667
							if( lowerBB > 352.384 )
								ret := 0.000000
					if( priceRange > 0.156845 )
						if( val <= -0.04092 )
							ret := 0.000000
						if( val > -0.04092 )
							if( dev <= 0.47144 )
								ret := 0.000000
							if( dev > 0.47144 )
								if( avgHighLow <= 353.01 )
									ret := 0.673913
								if( avgHighLow > 353.01 )
									ret := 0.941176 // buy
				if( lowerBB > 352.786 )
					if( avgHighLow <= 408.204 )
						if( ma <= 407.837 )
							if( rangema <= 0.938875 )
								if( upperKC <= 407.983 )
									ret := 0.090902
								if( upperKC > 407.983 )
									ret := -0.161905
							if( rangema > 0.938875 )
								if( upperBB <= 407.635 )
									ret := 0.275362
								if( upperBB > 407.635 )
									ret := 0.891892 // buy
						if( ma > 407.837 )
							if( sqzOffInt <= 0.5 )
								if( priceRange <= 0.2258 )
									ret := -0.181818
								if( priceRange > 0.2258 )
									ret := 0.570815
							if( sqzOffInt > 0.5 )
								if( avgHighLow <= 407.908 )
									ret := 0.418182
								if( avgHighLow > 407.908 )
									ret := -0.127907
					if( avgHighLow > 408.204 )
						if( upperBB <= 409.606 )
							if( dev <= 0.965074 )
								if( upperKC <= 409.594 )
									ret := -0.569024
								if( upperKC > 409.594 )
									ret := -0.078947
							if( dev > 0.965074 )
								if( rangema <= 1.16376 )
									ret := 0.000000
								if( rangema > 1.16376 )
									ret := 1.000000 // buy
						if( upperBB > 409.606 )
							if( upperKC <= 410.006 )
								if( upperBB <= 409.84 )
									ret := 0.056075
								if( upperBB > 409.84 )
									ret := 0.534247
							if( upperKC > 410.006 )
								if( rangema <= 0.590876 )
									ret := 0.029943
								if( rangema > 0.590876 )
									ret := 0.098660
		if( dev > 1.33242 )
			if( rangema <= 0.590299 )
				if( ma <= 330.902 )
					if( dev <= 1.49707 )
						ret := 0.285714
					if( dev > 1.49707 )
						if( basis <= 330.62 )
							ret := 0.750000 // buy
						if( basis > 330.62 )
							ret := 1.000000 // buy
				if( ma > 330.902 )
					if( val <= 0.185482 )
						if( dev <= 1.69827 )
							if( dev <= 1.68441 )
								if( rangema <= 0.19625 )
									ret := -0.909091 // sell
								if( rangema > 0.19625 )
									ret := 0.057279
							if( dev > 1.68441 )
								if( avgHighLow <= 408.854 )
									ret := -0.555556
								if( avgHighLow > 408.854 )
									ret := 0.133333
						if( dev > 1.69827 )
							if( lowerKC <= 376.323 )
								if( avgHighLow <= 335.986 )
									ret := 0.092308
								if( avgHighLow > 335.986 )
									ret := 0.625000
							if( lowerKC > 376.323 )
								if( priceRange <= 0.880965 )
									ret := 0.236253
								if( priceRange > 0.880965 )
									ret := -0.487179
					if( val > 0.185482 )
						if( rangema <= 0.380633 )
							if( upperBB <= 404.882 )
								ret := 0.250000
							if( upperBB > 404.882 )
								ret := 0.000000
						if( rangema > 0.380633 )
							if( priceRange <= 0.13396 )
								ret := 1.000000 // buy
							if( priceRange > 0.13396 )
								if( val <= 0.21617 )
									ret := 0.769231 // buy
								if( val > 0.21617 )
									ret := 0.300000
			if( rangema > 0.590299 )
				if( ma <= 335.286 )
					if( rangema <= 0.981346 )
						if( lowerBB <= 330.528 )
							if( dev <= 1.40964 )
								if( val <= 0.107732 )
									ret := -0.057143
								if( val > 0.107732 )
									ret := 0.833333 // buy
							if( dev > 1.40964 )
								if( lowerKC <= 329.766 )
									ret := -0.821429 // sell
								if( lowerKC > 329.766 )
									ret := -0.265306
						if( lowerBB > 330.528 )
							if( dev <= 2.1283 )
								if( dev <= 1.78926 )
									ret := -0.659420
								if( dev > 1.78926 )
									ret := -0.081081
							if( dev > 2.1283 )
								if( val <= -0.187806 )
									ret := -0.500000
								if( val > -0.187806 )
									ret := -0.945205 // sell
					if( rangema > 0.981346 )
						if( val <= -0.071108 )
							if( upperBB <= 338.08 )
								if( upperBB <= 336.197 )
									ret := 0.294118
								if( upperBB > 336.197 )
									ret := 0.950000 // buy
							if( upperBB > 338.08 )
								ret := -1.000000 // sell
						if( val > -0.071108 )
							if( rangema <= 1.04748 )
								if( lowerKC <= 330.967 )
									ret := -0.500000
								if( lowerKC > 330.967 )
									ret := 0.578947
							if( rangema > 1.04748 )
								if( avgHighLow <= 332.494 )
									ret := 0.078431
								if( avgHighLow > 332.494 )
									ret := -0.627451
				if( ma > 335.286 )
					if( lowerBB <= 334.686 )
						if( lowerKC <= 334.678 )
							if( val <= 0.099589 )
								if( lowerBB <= 331.704 )
									ret := -0.666667
								if( lowerBB > 331.704 )
									ret := 0.504854
							if( val > 0.099589 )
								if( lowerKC <= 334.313 )
									ret := 0.303030
								if( lowerKC > 334.313 )
									ret := -0.809524 // sell
						if( lowerKC > 334.678 )
							if( upperKC <= 340.215 )
								if( upperBB <= 338.793 )
									ret := 0.557692
								if( upperBB > 338.793 )
									ret := 0.871795 // buy
							if( upperKC > 340.215 )
								if( dev <= 7.48174 )
									ret := 0.000000
								if( dev > 7.48174 )
									ret := -1.000000 // sell
					if( lowerBB > 334.686 )
						if( dev <= 2.24673 )
							if( rangema <= 0.829462 )
								if( upperBB <= 430.318 )
									ret := 0.040313
								if( upperBB > 430.318 )
									ret := -0.276139
							if( rangema > 0.829462 )
								if( lowerKC <= 405.794 )
									ret := -0.063756
								if( lowerKC > 405.794 )
									ret := -0.231650
						if( dev > 2.24673 )
							if( priceRange <= 2.10304 )
								if( ma <= 394.265 )
									ret := -0.144854
								if( ma > 394.265 )
									ret := 0.083408
							if( priceRange > 2.10304 )
								if( upperBB <= 407.176 )
									ret := 0.627329
								if( upperBB > 407.176 )
									ret := 0.047244
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_MSFT_5Min_a2c8e18f(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)

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


