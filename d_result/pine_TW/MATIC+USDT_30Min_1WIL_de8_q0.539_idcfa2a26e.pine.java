//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Williams_Vix_Fix
// ID_model: MATICUSDT_30Min_1WIL_cfa2a26e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MATICUSDT_30Min_1WIL_cfa2a26e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MATICUSDT_30Min_cfa2a26e(sDev, Color_con1, lowerBand, wvf, upperBand, midLine, Color_con2, rangeLow, colInt, rangeHigh)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( wvf <= 10.4106 )
		if( upperBand <= 6.44 )
			if( lowerBand <= 3.38627 )
				if( Color_con2 <= 0.502677 )
					if( wvf <= 2.35281 )
						if( sDev <= 2.81791 )
							if( midLine <= 3.31676 )
								if( lowerBand <= -0.475214 )
									ret := 0.038873
								if( lowerBand > -0.475214 )
									ret := -0.025082
							if( midLine > 3.31676 )
								if( midLine <= 3.54606 )
									ret := -0.262774
								if( midLine > 3.54606 )
									ret := -0.063636
						if( sDev > 2.81791 )
							if( upperBand <= 4.97607 )
								if( sDev <= 2.85839 )
									ret := -0.737705 // sell
								if( sDev > 2.85839 )
									ret := -0.180851
							if( upperBand > 4.97607 )
								if( wvf <= 0.62002 )
									ret := 0.021538
								if( wvf > 0.62002 )
									ret := -0.153846
					if( wvf > 2.35281 )
						if( upperBand <= 2.18131 )
							if( wvf <= 2.61533 )
								if( midLine <= 1.02881 )
									ret := -0.030303
								if( midLine > 1.02881 )
									ret := -0.548387
							if( wvf > 2.61533 )
								if( sDev <= 1.22085 )
									ret := -0.947368 // sell
								if( sDev > 1.22085 )
									ret := -0.900000 // sell
						if( upperBand > 2.18131 )
							if( Color_con2 <= -11.232 )
								if( Color_con1 <= -0.404143 )
									ret := 0.742574 // buy
								if( Color_con1 > -0.404143 )
									ret := -0.052632
							if( Color_con2 > -11.232 )
								if( sDev <= 3.90309 )
									ret := 0.014707
								if( sDev > 3.90309 )
									ret := 0.680000
				if( Color_con2 > 0.502677 )
					if( sDev <= 3.88184 )
						if( wvf <= 7.36004 )
							if( wvf <= 6.7795 )
								if( lowerBand <= 0.141593 )
									ret := -0.062272
								if( lowerBand > 0.141593 )
									ret := -0.137645
							if( wvf > 6.7795 )
								if( midLine <= 2.03993 )
									ret := -0.142857
								if( midLine > 2.03993 )
									ret := 0.724638 // buy
						if( wvf > 7.36004 )
							if( lowerBand <= -0.155908 )
								if( Color_con2 <= 4.75393 )
									ret := -0.192308
								if( Color_con2 > 4.75393 )
									ret := -0.636364
							if( lowerBand > -0.155908 )
								ret := -0.850000 // sell
					if( sDev > 3.88184 )
						if( wvf <= 6.00893 )
							if( midLine <= 2.14353 )
								ret := -0.500000
							if( midLine > 2.14353 )
								ret := -0.200000
						if( wvf > 6.00893 )
							if( wvf <= 7.07533 )
								if( Color_con1 <= 0.406145 )
									ret := 0.571429
								if( Color_con1 > 0.406145 )
									ret := 0.941176 // buy
							if( wvf > 7.07533 )
								ret := 0.181818
			if( lowerBand > 3.38627 )
				if( sDev <= 1.11573 )
					ret := -0.294118
				if( sDev > 1.11573 )
					if( Color_con2 <= -0.706978 )
						ret := -1.000000 // sell
					if( Color_con2 > -0.706978 )
						if( sDev <= 1.40931 )
							ret := -0.625000
						if( sDev > 1.40931 )
							ret := -1.000000 // sell
		if( upperBand > 6.44 )
			if( Color_con1 <= -7.79887 )
				if( Color_con2 <= -13.218 )
					if( lowerBand <= -5.18382 )
						if( Color_con2 <= -16.434 )
							ret := -0.312500
						if( Color_con2 > -16.434 )
							ret := -0.823529 // sell
					if( lowerBand > -5.18382 )
						if( sDev <= 20.2249 )
							if( upperBand <= 13.854 )
								if( Color_con1 <= -8.88663 )
									ret := 0.148649
								if( Color_con1 > -8.88663 )
									ret := -0.600000
							if( upperBand > 13.854 )
								if( upperBand <= 29.3269 )
									ret := 0.535433
								if( upperBand > 29.3269 )
									ret := 0.096774
						if( sDev > 20.2249 )
							if( Color_con1 <= -33.6457 )
								if( Color_con1 <= -36.8848 )
									ret := -1.000000 // sell
								if( Color_con1 > -36.8848 )
									ret := -0.818182 // sell
							if( Color_con1 > -33.6457 )
								ret := 0.090909
				if( Color_con2 > -13.218 )
					if( upperBand <= 20.7257 )
						if( midLine <= 6.21687 )
							if( upperBand <= 14.6741 )
								if( Color_con2 <= -4.10698 )
									ret := -0.246945
								if( Color_con2 > -4.10698 )
									ret := 0.375000
							if( upperBand > 14.6741 )
								if( Color_con1 <= -12.1408 )
									ret := 0.454545
								if( Color_con1 > -12.1408 )
									ret := 0.833333 // buy
						if( midLine > 6.21687 )
							if( upperBand <= 16.5349 )
								if( lowerBand <= 2.09125 )
									ret := 0.182684
								if( lowerBand > 2.09125 )
									ret := -0.111396
							if( upperBand > 16.5349 )
								if( Color_con2 <= -8.54746 )
									ret := 0.068966
								if( Color_con2 > -8.54746 )
									ret := -0.227865
					if( upperBand > 20.7257 )
						if( midLine <= 18.2868 )
							if( wvf <= 2.41963 )
								ret := 0.600000
							if( wvf > 2.41963 )
								if( sDev <= 10.305 )
									ret := -0.333333
								if( sDev > 10.305 )
									ret := -0.606811
						if( midLine > 18.2868 )
							ret := 0.812500 // buy
			if( Color_con1 > -7.79887 )
				if( Color_con1 <= 0.205729 )
					if( Color_con1 <= 0.151611 )
						if( Color_con2 <= -7.34145 )
							if( wvf <= 8.73068 )
								if( lowerBand <= 3.3535 )
									ret := 0.344019
								if( lowerBand > 3.3535 )
									ret := -0.790698 // sell
							if( wvf > 8.73068 )
								if( wvf <= 9.34475 )
									ret := -1.000000 // sell
								if( wvf > 9.34475 )
									ret := -0.400000
						if( Color_con2 > -7.34145 )
							if( Color_con1 <= -7.42008 )
								if( lowerBand <= -1.90461 )
									ret := -0.620690
								if( lowerBand > -1.90461 )
									ret := 0.233221
							if( Color_con1 > -7.42008 )
								if( Color_con2 <= 5.17514 )
									ret := 0.035723
								if( Color_con2 > 5.17514 )
									ret := 0.702703 // buy
					if( Color_con1 > 0.151611 )
						if( wvf <= 8.2401 )
							if( sDev <= 3.43165 )
								ret := -0.461538
							if( sDev > 3.43165 )
								if( wvf <= 7.63699 )
									ret := -0.777778 // sell
								if( wvf > 7.63699 )
									ret := -1.000000 // sell
						if( wvf > 8.2401 )
							ret := -0.400000
				if( Color_con1 > 0.205729 )
					if( lowerBand <= -0.686956 )
						if( lowerBand <= -1.02621 )
							if( Color_con2 <= 4.48175 )
								if( wvf <= 7.85867 )
									ret := 0.111111
								if( wvf > 7.85867 )
									ret := 0.763636 // buy
							if( Color_con2 > 4.48175 )
								if( lowerBand <= -1.85684 )
									ret := 0.538462
								if( lowerBand > -1.85684 )
									ret := -0.352941
						if( lowerBand > -1.02621 )
							if( sDev <= 4.21242 )
								if( lowerBand <= -0.839005 )
									ret := 1.000000 // buy
								if( lowerBand > -0.839005 )
									ret := 0.900000 // buy
							if( sDev > 4.21242 )
								ret := 0.684211
					if( lowerBand > -0.686956 )
						if( Color_con1 <= 1.17236 )
							if( Color_con2 <= 0.080633 )
								if( Color_con2 <= -3.24797 )
									ret := 0.941176 // buy
								if( Color_con2 > -3.24797 )
									ret := -0.645833
							if( Color_con2 > 0.080633 )
								if( Color_con2 <= 4.49596 )
									ret := 0.563265
								if( Color_con2 > 4.49596 )
									ret := -0.294118
						if( Color_con1 > 1.17236 )
							if( Color_con1 <= 1.76538 )
								if( lowerBand <= -0.077326 )
									ret := 0.733333 // buy
								if( lowerBand > -0.077326 )
									ret := -0.418605
							if( Color_con1 > 1.76538 )
								if( lowerBand <= -0.185701 )
									ret := -1.000000 // sell
								if( lowerBand > -0.185701 )
									ret := -0.600000
	if( wvf > 10.4106 )
		if( Color_con1 <= -4.99127 )
			if( lowerBand <= 4.59467 )
				if( upperBand <= 28.8531 )
					if( upperBand <= 27.5054 )
						if( colInt <= 0.5 )
							if( lowerBand <= 1.81123 )
								if( lowerBand <= 1.72665 )
									ret := -0.211765
								if( lowerBand > 1.72665 )
									ret := -0.833333 // sell
							if( lowerBand > 1.81123 )
								if( wvf <= 16.3038 )
									ret := 0.052941
								if( wvf > 16.3038 )
									ret := 1.000000 // buy
						if( colInt > 0.5 )
							if( lowerBand <= 1.80371 )
								if( sDev <= 15.2799 )
									ret := -0.539216
								if( sDev > 15.2799 )
									ret := 0.500000
							if( lowerBand > 1.80371 )
								if( Color_con2 <= 0.537051 )
									ret := 0.566667
								if( Color_con2 > 0.537051 )
									ret := -0.413793
					if( upperBand > 27.5054 )
						if( upperBand <= 28.5748 )
							if( lowerBand <= -3.67484 )
								ret := 1.000000 // buy
							if( lowerBand > -3.67484 )
								ret := 0.062500
						if( upperBand > 28.5748 )
							ret := 0.875000 // buy
				if( upperBand > 28.8531 )
					if( Color_con2 <= 5.52903 )
						if( Color_con1 <= -19.6678 )
							if( wvf <= 12.0464 )
								if( wvf <= 11.173 )
									ret := 0.111111
								if( wvf > 11.173 )
									ret := 1.000000 // buy
							if( wvf > 12.0464 )
								ret := -1.000000 // sell
						if( Color_con1 > -19.6678 )
							if( Color_con1 <= -11.484 )
								if( Color_con1 <= -18.7411 )
									ret := -0.800000 // sell
								if( Color_con1 > -18.7411 )
									ret := -0.967742 // sell
							if( Color_con1 > -11.484 )
								if( Color_con2 <= 1.0433 )
									ret := -0.282051
								if( Color_con2 > 1.0433 )
									ret := -0.961538 // sell
					if( Color_con2 > 5.52903 )
						ret := 1.000000 // buy
			if( lowerBand > 4.59467 )
				if( midLine <= 19.0271 )
					if( Color_con2 <= -4.55705 )
						if( lowerBand <= 6.42186 )
							if( Color_con1 <= -10.8202 )
								if( upperBand <= 24.7058 )
									ret := 1.000000 // buy
								if( upperBand > 24.7058 )
									ret := 0.800000 // buy
							if( Color_con1 > -10.8202 )
								ret := -0.230769
						if( lowerBand > 6.42186 )
							if( sDev <= 9.58913 )
								if( lowerBand <= 9.36162 )
									ret := 0.047619
								if( lowerBand > 9.36162 )
									ret := 0.909091 // buy
							if( sDev > 9.58913 )
								if( Color_con1 <= -16.8999 )
									ret := 0.600000
								if( Color_con1 > -16.8999 )
									ret := -1.000000 // sell
					if( Color_con2 > -4.55705 )
						if( upperBand <= 24.6059 )
							if( Color_con2 <= -2.8283 )
								if( wvf <= 11.7508 )
									ret := 0.971429 // buy
								if( wvf > 11.7508 )
									ret := 0.181818
							if( Color_con2 > -2.8283 )
								if( sDev <= 6.58839 )
									ret := 0.706897 // buy
								if( sDev > 6.58839 )
									ret := -0.184211
						if( upperBand > 24.6059 )
							if( Color_con1 <= -11.8393 )
								if( upperBand <= 29.7325 )
									ret := 1.000000 // buy
								if( upperBand > 29.7325 )
									ret := 0.400000
							if( Color_con1 > -11.8393 )
								if( upperBand <= 29.0487 )
									ret := 1.000000 // buy
								if( upperBand > 29.0487 )
									ret := 0.911111 // buy
				if( midLine > 19.0271 )
					if( lowerBand <= 11.6037 )
						if( upperBand <= 28.7352 )
							ret := -0.076923
						if( upperBand > 28.7352 )
							if( Color_con2 <= -0.512912 )
								if( sDev <= 9.79 )
									ret := -0.600000
								if( sDev > 9.79 )
									ret := -1.000000 // sell
							if( Color_con2 > -0.512912 )
								ret := -0.384615
					if( lowerBand > 11.6037 )
						if( upperBand <= 31.2691 )
							if( lowerBand <= 13.2784 )
								ret := 0.200000
							if( lowerBand > 13.2784 )
								ret := -0.142857
						if( upperBand > 31.2691 )
							if( sDev <= 9.54682 )
								ret := 1.000000 // buy
							if( sDev > 9.54682 )
								if( Color_con1 <= -8.3485 )
									ret := 0.916667 // buy
								if( Color_con1 > -8.3485 )
									ret := 0.230769
		if( Color_con1 > -4.99127 )
			if( Color_con2 <= -3.37326 )
				if( midLine <= 10.4796 )
					ret := 1.000000 // buy
				if( midLine > 10.4796 )
					ret := 0.526316
			if( Color_con2 > -3.37326 )
				if( Color_con1 <= 0.162357 )
					if( upperBand <= 16.7611 )
						if( upperBand <= 14.1359 )
							if( upperBand <= 13.1685 )
								if( upperBand <= 11.5364 )
									ret := 0.720930 // buy
								if( upperBand > 11.5364 )
									ret := 0.002445
							if( upperBand > 13.1685 )
								if( upperBand <= 13.672 )
									ret := 0.750000 // buy
								if( upperBand > 13.672 )
									ret := 0.384615
						if( upperBand > 14.1359 )
							if( upperBand <= 15.3652 )
								if( sDev <= 4.48504 )
									ret := -0.974359 // sell
								if( sDev > 4.48504 )
									ret := -0.302419
							if( upperBand > 15.3652 )
								if( Color_con1 <= -1.10238 )
									ret := 0.132616
								if( Color_con1 > -1.10238 )
									ret := 1.000000 // buy
					if( upperBand > 16.7611 )
						if( upperBand <= 18.0987 )
							if( sDev <= 8.15037 )
								if( upperBand <= 17.1565 )
									ret := 0.729730 // buy
								if( upperBand > 17.1565 )
									ret := 0.956989 // buy
							if( sDev > 8.15037 )
								if( midLine <= 8.46999 )
									ret := 0.419355
								if( midLine > 8.46999 )
									ret := -0.526316
						if( upperBand > 18.0987 )
							if( upperBand <= 19.9923 )
								if( Color_con2 <= 1.93668 )
									ret := -0.145833
								if( Color_con2 > 1.93668 )
									ret := 0.347826
							if( upperBand > 19.9923 )
								if( Color_con2 <= 4.43357 )
									ret := 0.690647
								if( Color_con2 > 4.43357 )
									ret := 0.333333
				if( Color_con1 > 0.162357 )
					if( sDev <= 8.05767 )
						if( Color_con1 <= 2.62192 )
							if( Color_con1 <= 1.08965 )
								if( lowerBand <= -2.26497 )
									ret := 0.916667 // buy
								if( lowerBand > -2.26497 )
									ret := 0.274576
							if( Color_con1 > 1.08965 )
								if( lowerBand <= -0.519038 )
									ret := 0.087719
								if( lowerBand > -0.519038 )
									ret := 0.821918 // buy
						if( Color_con1 > 2.62192 )
							if( Color_con1 <= 3.8981 )
								if( lowerBand <= -0.084172 )
									ret := -0.086957
								if( lowerBand > -0.084172 )
									ret := -1.000000 // sell
							if( Color_con1 > 3.8981 )
								if( Color_con2 <= 9.11459 )
									ret := 0.875000 // buy
								if( Color_con2 > 9.11459 )
									ret := 0.210526
					if( sDev > 8.05767 )
						if( sDev <= 11.7735 )
							if( lowerBand <= -3.68377 )
								if( lowerBand <= -4.60629 )
									ret := 1.000000 // buy
								if( lowerBand > -4.60629 )
									ret := 0.538462
							if( lowerBand > -3.68377 )
								if( upperBand <= 22.6377 )
									ret := 0.974026 // buy
								if( upperBand > 22.6377 )
									ret := 0.625000
						if( sDev > 11.7735 )
							if( wvf <= 23.7745 )
								ret := 1.000000 // buy
							if( wvf > 23.7745 )
								if( midLine <= 14.3225 )
									ret := -0.222222
								if( midLine > 14.3225 )
									ret := 0.739130 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Williams_Vix_Fix 
//@version=5
//indicator "CM_Williams_Vix_Fix", overlay=false)

// Inputs
pd = input.int(22, title="LookBack Period Standard Deviation High")
bbl = input.int(20, title="Bollinger Band Length")
mult = input.float(2.0, minval=1, maxval=5, title="Bollinger Band Standard Deviation Up")
lb = input.int(50, title="Look Back Period Percentile High")
ph = input.float(0.85, title="Highest Percentile - 0.90=90%, 0.95=95%, 0.99=99%")
pl = input.float(1.01, title="Lowest Percentile - 1.10=90%, 1.05=95%, 1.01=99%")
hp = input.bool(false, title="Show High Range - Based on Percentile and LookBack Period?")
sd = input.bool(false, title="Show Standard Deviation Line?")

// Calculations
wvf = ((ta.highest(close, pd) - low) / ta.highest(close, pd)) * 100

sDev = mult * ta.stdev(wvf, bbl)
midLine = ta.sma(wvf, bbl)
lowerBand = midLine - sDev
upperBand = midLine + sDev

rangeHigh = ta.highest(wvf, lb) * ph
rangeLow = ta.lowest(wvf, lb) * pl


Color_con1 = wvf - upperBand
Color_con2 = wvf - rangeHigh
// Color condition
col = wvf >= upperBand or wvf >= rangeHigh ? color.lime : color.gray
colInt = wvf >= upperBand or wvf >= rangeHigh ? 1 : 0 //Bool to int

// Plots
plot(hp and na(rangeHigh) ? na : rangeHigh, title="Range High Percentile", color=color.orange, linewidth=4)
plot(hp and na(rangeLow) ? na : rangeLow, title="Range Low Percentile", color=color.orange, linewidth=4)
plot(wvf, title="Williams Vix Fix", color=col, style=plot.style_histogram, linewidth=4)
plot(sd and na(upperBand) ? na : upperBand, title="Upper Band", color=color.aqua, linewidth=3)

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
float op_operation = decision_tree_0_MATICUSDT_30Min_cfa2a26e(sDev, Color_con1, lowerBand, wvf, upperBand, midLine, Color_con2, rangeLow, colInt, rangeHigh)

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


