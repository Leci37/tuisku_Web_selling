//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Williams_Vix_Fix
// ID_model: UPST_1Min_1WIL_e6aca8b7 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UPST_1Min_1WIL_e6aca8b7", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UPST_1Min_e6aca8b7(rangeLow, wvf, Color_con1, midLine, sDev, colInt, upperBand, rangeHigh, lowerBand, Color_con2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( Color_con1 <= 0.079471 )
		if( wvf <= 0.020011 )
			if( Color_con2 <= -0.393949 )
				if( sDev <= 0.290249 )
					if( upperBand <= 0.310741 )
						if( Color_con2 <= -0.534665 )
							if( midLine <= 0.081393 )
								if( Color_con2 <= -0.606511 )
									ret := -1.000000 // sell
								if( Color_con2 > -0.606511 )
									ret := -0.769231 // sell
							if( midLine > 0.081393 )
								if( Color_con2 <= -0.795853 )
									ret := -0.727273 // sell
								if( Color_con2 > -0.795853 )
									ret := -0.136364
						if( Color_con2 > -0.534665 )
							if( midLine <= 0.101461 )
								ret := -0.500000
							if( midLine > 0.101461 )
								ret := 0.000000
					if( upperBand > 0.310741 )
						if( wvf <= 0.015089 )
							if( lowerBand <= -0.05205 )
								if( upperBand <= 0.456491 )
									ret := 0.202614
								if( upperBand > 0.456491 )
									ret := -0.347826
							if( lowerBand > -0.05205 )
								if( Color_con1 <= -0.346975 )
									ret := -0.537500
								if( Color_con1 > -0.346975 )
									ret := 0.166667
						if( wvf > 0.015089 )
							ret := 0.411765
				if( sDev > 0.290249 )
					if( midLine <= 0.155508 )
						if( lowerBand <= -0.229359 )
							ret := -0.363636
						if( lowerBand > -0.229359 )
							if( midLine <= 0.139448 )
								ret := -0.400000
							if( midLine > 0.139448 )
								if( sDev <= 0.337243 )
									ret := -0.888889 // sell
								if( sDev > 0.337243 )
									ret := -1.000000 // sell
					if( midLine > 0.155508 )
						if( upperBand <= 1.35739 )
							if( upperBand <= 1.2042 )
								if( wvf <= 0.000928 )
									ret := -0.322129
								if( wvf > 0.000928 )
									ret := -0.556757
							if( upperBand > 1.2042 )
								if( sDev <= 0.928405 )
									ret := -0.259259
								if( sDev > 0.928405 )
									ret := 0.608696
						if( upperBand > 1.35739 )
							if( Color_con1 <= -1.5436 )
								if( sDev <= 1.08702 )
									ret := 0.136364
								if( sDev > 1.08702 )
									ret := -0.654545
							if( Color_con1 > -1.5436 )
								if( sDev <= 0.830015 )
									ret := -0.869565 // sell
								if( sDev > 0.830015 )
									ret := -0.620000
			if( Color_con2 > -0.393949 )
				if( Color_con1 <= -0.146597 )
					if( sDev <= 0.245376 )
						if( upperBand <= 0.34636 )
							if( sDev <= 0.22526 )
								if( lowerBand <= -0.035245 )
									ret := 0.443038
								if( lowerBand > -0.035245 )
									ret := -0.294118
							if( sDev > 0.22526 )
								ret := -0.700000 // sell
						if( upperBand > 0.34636 )
							if( Color_con2 <= -0.318139 )
								if( sDev <= 0.232801 )
									ret := 0.500000
								if( sDev > 0.232801 )
									ret := 0.800000 // buy
							if( Color_con2 > -0.318139 )
								if( midLine <= 0.144204 )
									ret := 1.000000 // buy
								if( midLine > 0.144204 )
									ret := 0.600000
					if( sDev > 0.245376 )
						if( lowerBand <= -0.333507 )
							ret := -1.000000 // sell
						if( lowerBand > -0.333507 )
							if( sDev <= 0.261453 )
								if( sDev <= 0.254138 )
									ret := -1.000000 // sell
								if( sDev > 0.254138 )
									ret := -0.400000
							if( sDev > 0.261453 )
								if( sDev <= 0.379289 )
									ret := 0.321429
								if( sDev > 0.379289 )
									ret := 0.015873
				if( Color_con1 > -0.146597 )
					if( midLine <= 0.037117 )
						ret := -0.636364
					if( midLine > 0.037117 )
						ret := -1.000000 // sell
		if( wvf > 0.020011 )
			if( midLine <= 3.29432 )
				if( wvf <= 2.673 )
					if( Color_con2 <= -4.03487 )
						if( midLine <= 3.07527 )
							if( Color_con1 <= -0.267531 )
								if( lowerBand <= -1.09742 )
									ret := -0.018182
								if( lowerBand > -1.09742 )
									ret := -0.725490 // sell
							if( Color_con1 > -0.267531 )
								ret := 0.523810
						if( midLine > 3.07527 )
							ret := 0.769231 // buy
					if( Color_con2 > -4.03487 )
						if( lowerBand <= -0.278908 )
							if( wvf <= 0.827133 )
								if( sDev <= 2.62847 )
									ret := -0.204278
								if( sDev > 2.62847 )
									ret := 0.206422
							if( wvf > 0.827133 )
								if( Color_con1 <= -2.57252 )
									ret := -0.366013
								if( Color_con1 > -2.57252 )
									ret := 0.021839
						if( lowerBand > -0.278908 )
							if( wvf <= 1.56045 )
								if( Color_con2 <= -1.08677 )
									ret := 0.061613
								if( Color_con2 > -1.08677 )
									ret := -0.004284
							if( wvf > 1.56045 )
								if( wvf <= 1.70644 )
									ret := 0.222482
								if( wvf > 1.70644 )
									ret := 0.063577
				if( wvf > 2.673 )
					if( sDev <= 3.09027 )
						if( colInt <= 0.5 )
							if( lowerBand <= 2.36559 )
								if( Color_con1 <= -0.869281 )
									ret := -0.732591 // sell
								if( Color_con1 > -0.869281 )
									ret := 0.179104
							if( lowerBand > 2.36559 )
								ret := 0.750000 // buy
						if( colInt > 0.5 )
							if( Color_con1 <= -0.634634 )
								if( Color_con1 <= -1.09928 )
									ret := -0.320755
								if( Color_con1 > -1.09928 )
									ret := 0.131640
							if( Color_con1 > -0.634634 )
								if( wvf <= 2.72865 )
									ret := -0.718750 // sell
								if( wvf > 2.72865 )
									ret := -0.292593
					if( sDev > 3.09027 )
						if( sDev <= 6.1371 )
							if( midLine <= 1.75822 )
								ret := -0.461538
							if( midLine > 1.75822 )
								if( Color_con1 <= -2.24968 )
									ret := 0.461538
								if( Color_con1 > -2.24968 )
									ret := 0.875000 // buy
						if( sDev > 6.1371 )
							if( sDev <= 6.576 )
								ret := -1.000000 // sell
							if( sDev > 6.576 )
								ret := -0.100000
			if( midLine > 3.29432 )
				if( upperBand <= 5.22839 )
					if( upperBand <= 4.67903 )
						if( lowerBand <= 2.40447 )
							ret := -0.266667
						if( lowerBand > 2.40447 )
							if( midLine <= 3.38308 )
								ret := 1.000000 // buy
							if( midLine > 3.38308 )
								ret := 0.200000
					if( upperBand > 4.67903 )
						if( sDev <= 1.12101 )
							ret := 0.100000
						if( sDev > 1.12101 )
							if( sDev <= 1.23016 )
								if( upperBand <= 4.71236 )
									ret := 1.000000 // buy
								if( upperBand > 4.71236 )
									ret := 0.166667
							if( sDev > 1.23016 )
								if( wvf <= 3.64961 )
									ret := 0.685185
								if( wvf > 3.64961 )
									ret := 0.944444 // buy
				if( upperBand > 5.22839 )
					if( sDev <= 3.98711 )
						if( upperBand <= 8.4649 )
							if( midLine <= 4.7564 )
								if( lowerBand <= 2.63659 )
									ret := 0.171958
								if( lowerBand > 2.63659 )
									ret := -0.555556
							if( midLine > 4.7564 )
								if( upperBand <= 7.67123 )
									ret := 0.961538 // buy
								if( upperBand > 7.67123 )
									ret := 0.520000
						if( upperBand > 8.4649 )
							if( wvf <= 4.37885 )
								ret := -0.250000
							if( wvf > 4.37885 )
								if( Color_con2 <= -2.81805 )
									ret := -1.000000 // sell
								if( Color_con2 > -2.81805 )
									ret := -0.625000
					if( sDev > 3.98711 )
						if( midLine <= 5.30807 )
							if( upperBand <= 8.66996 )
								ret := -0.111111
							if( upperBand > 8.66996 )
								if( Color_con1 <= -5.66145 )
									ret := 0.684211
								if( Color_con1 > -5.66145 )
									ret := 0.955556 // buy
						if( midLine > 5.30807 )
							if( upperBand <= 26.2854 )
								if( lowerBand <= -8.2397 )
									ret := 0.000000
								if( lowerBand > -8.2397 )
									ret := -0.833333 // sell
							if( upperBand > 26.2854 )
								if( midLine <= 11.9286 )
									ret := 0.600000
								if( midLine > 11.9286 )
									ret := 1.000000 // buy
	if( Color_con1 > 0.079471 )
		if( lowerBand <= -0.174943 )
			if( midLine <= 0.624305 )
				if( lowerBand <= -0.256343 )
					if( sDev <= 0.65793 )
						if( wvf <= 0.927669 )
							if( wvf <= 0.863582 )
								ret := 0.357143
							if( wvf > 0.863582 )
								if( lowerBand <= -0.26554 )
									ret := 0.846154 // buy
								if( lowerBand > -0.26554 )
									ret := 1.000000 // buy
						if( wvf > 0.927669 )
							if( sDev <= 0.583164 )
								if( midLine <= 0.153649 )
									ret := 0.200000
								if( midLine > 0.153649 )
									ret := -0.621212
							if( sDev > 0.583164 )
								if( Color_con1 <= 0.424248 )
									ret := 0.300000
								if( Color_con1 > 0.424248 )
									ret := -0.541667
					if( sDev > 0.65793 )
						if( wvf <= 2.62503 )
							if( sDev <= 0.90526 )
								if( sDev <= 0.682255 )
									ret := 0.789474 // buy
								if( sDev > 0.682255 )
									ret := 0.291513
							if( sDev > 0.90526 )
								if( sDev <= 1.15586 )
									ret := 0.816216 // buy
								if( sDev > 1.15586 )
									ret := 0.326087
						if( wvf > 2.62503 )
							if( sDev <= 1.32202 )
								ret := -0.750000 // sell
							if( sDev > 1.32202 )
								ret := 0.583333
				if( lowerBand > -0.256343 )
					if( midLine <= 0.237243 )
						if( wvf <= 0.897701 )
							if( upperBand <= 0.51127 )
								if( midLine <= 0.134987 )
									ret := 0.812500 // buy
								if( midLine > 0.134987 )
									ret := 0.428571
							if( upperBand > 0.51127 )
								if( lowerBand <= -0.213452 )
									ret := 1.000000 // buy
								if( lowerBand > -0.213452 )
									ret := 0.791667 // buy
						if( wvf > 0.897701 )
							ret := 0.076923
					if( midLine > 0.237243 )
						if( wvf <= 1.00291 )
							if( Color_con1 <= 0.190054 )
								if( sDev <= 0.521307 )
									ret := 0.315789
								if( sDev > 0.521307 )
									ret := 0.000000
							if( Color_con1 > 0.190054 )
								ret := -0.842105 // sell
						if( wvf > 1.00291 )
							if( wvf <= 1.60557 )
								if( midLine <= 0.33062 )
									ret := 0.939394 // buy
								if( midLine > 0.33062 )
									ret := 0.306452
							if( wvf > 1.60557 )
								if( sDev <= 0.78196 )
									ret := 0.967742 // buy
								if( sDev > 0.78196 )
									ret := 0.250000
			if( midLine > 0.624305 )
				if( midLine <= 2.41902 )
					if( lowerBand <= -0.768197 )
						if( wvf <= 2.8613 )
							ret := -1.000000 // sell
						if( wvf > 2.8613 )
							if( Color_con2 <= 7.66275 )
								if( Color_con1 <= 1.42533 )
									ret := 0.152778
								if( Color_con1 > 1.42533 )
									ret := -0.600000
							if( Color_con2 > 7.66275 )
								ret := -1.000000 // sell
					if( lowerBand > -0.768197 )
						if( Color_con1 <= 0.664688 )
							if( wvf <= 3.9059 )
								if( Color_con1 <= 0.32467 )
									ret := 0.306748
								if( Color_con1 > 0.32467 )
									ret := -0.131148
							if( wvf > 3.9059 )
								if( upperBand <= 4.06026 )
									ret := -0.818182 // sell
								if( upperBand > 4.06026 )
									ret := 0.400000
						if( Color_con1 > 0.664688 )
							if( sDev <= 1.39924 )
								ret := 0.500000
							if( sDev > 1.39924 )
								ret := 1.000000 // buy
				if( midLine > 2.41902 )
					ret := 1.000000 // buy
		if( lowerBand > -0.174943 )
			if( lowerBand <= 0.177982 )
				if( wvf <= 2.11717 )
					if( midLine <= 0.860474 )
						if( Color_con2 <= -1.68676 )
							if( Color_con1 <= 0.118976 )
								ret := 1.000000 // buy
							if( Color_con1 > 0.118976 )
								ret := 0.400000
						if( Color_con2 > -1.68676 )
							if( Color_con2 <= -1.03351 )
								if( Color_con2 <= -1.17799 )
									ret := -0.062500
								if( Color_con2 > -1.17799 )
									ret := -0.764706 // sell
							if( Color_con2 > -1.03351 )
								if( sDev <= 0.839056 )
									ret := 0.024484
								if( sDev > 0.839056 )
									ret := 0.697674
					if( midLine > 0.860474 )
						if( wvf <= 2.06138 )
							ret := -0.166667
						if( wvf > 2.06138 )
							if( wvf <= 2.06873 )
								ret := -0.909091 // sell
							if( wvf > 2.06873 )
								ret := -0.600000
				if( wvf > 2.11717 )
					if( sDev <= 1.54426 )
						if( wvf <= 2.92981 )
							if( wvf <= 2.76988 )
								if( Color_con2 <= 1.29392 )
									ret := 0.600000
								if( Color_con2 > 1.29392 )
									ret := -0.454545
							if( wvf > 2.76988 )
								if( sDev <= 1.30281 )
									ret := -1.000000 // sell
								if( sDev > 1.30281 )
									ret := 0.272727
						if( wvf > 2.92981 )
							ret := 0.941176 // buy
					if( sDev > 1.54426 )
						ret := -0.500000
			if( lowerBand > 0.177982 )
				if( wvf <= 2.71154 )
					if( upperBand <= 1.96754 )
						if( wvf <= 1.17973 )
							if( upperBand <= 0.95171 )
								ret := -0.230769
							if( upperBand > 0.95171 )
								ret := -0.400000
						if( wvf > 1.17973 )
							if( midLine <= 0.669514 )
								ret := 1.000000 // buy
							if( midLine > 0.669514 )
								if( Color_con1 <= 0.278134 )
									ret := 0.347561
								if( Color_con1 > 0.278134 )
									ret := 1.000000 // buy
					if( upperBand > 1.96754 )
						if( sDev <= 0.947025 )
							if( lowerBand <= 0.861966 )
								if( lowerBand <= 0.696515 )
									ret := -0.571429
								if( lowerBand > 0.696515 )
									ret := -0.833333 // sell
							if( lowerBand > 0.861966 )
								ret := 0.000000
						if( sDev > 0.947025 )
							if( Color_con1 <= 0.191644 )
								ret := 0.461538
							if( Color_con1 > 0.191644 )
								ret := 0.000000
				if( wvf > 2.71154 )
					if( lowerBand <= 0.438991 )
						ret := 0.181818
					if( lowerBand > 0.438991 )
						if( sDev <= 1.11326 )
							ret := 1.000000 // buy
						if( sDev > 1.11326 )
							ret := 0.818182 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_UPST_1Min_e6aca8b7(rangeLow, wvf, Color_con1, midLine, sDev, colInt, upperBand, rangeHigh, lowerBand, Color_con2)

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


