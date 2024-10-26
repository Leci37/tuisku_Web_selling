//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Williams_Vix_Fix
// ID_model: XLMUSDT_15Min_1WIL_b7c16fc1 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XLMUSDT_15Min_1WIL_b7c16fc1", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XLMUSDT_15Min_b7c16fc1(wvf, sDev, upperBand, Color_con2, colInt, rangeHigh, Color_con1, lowerBand, midLine, rangeLow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( wvf <= 2.85715 )
		if( colInt <= 0.5 )
			if( upperBand <= 9.11461 )
				if( upperBand <= 4.22056 )
					if( Color_con2 <= -2.85973 )
						if( Color_con1 <= -3.24355 )
							if( lowerBand <= -0.93045 )
								if( Color_con2 <= -3.6198 )
									ret := -0.871795 // sell
								if( Color_con2 > -3.6198 )
									ret := -0.458333
							if( lowerBand > -0.93045 )
								if( Color_con2 <= -10.0712 )
									ret := 1.000000 // buy
								if( Color_con2 > -10.0712 )
									ret := -0.244792
						if( Color_con1 > -3.24355 )
							if( upperBand <= 3.65921 )
								if( midLine <= 1.00194 )
									ret := -0.297041
								if( midLine > 1.00194 )
									ret := -0.142206
							if( upperBand > 3.65921 )
								if( sDev <= 2.26861 )
									ret := 0.268116
								if( sDev > 2.26861 )
									ret := -0.509091
					if( Color_con2 > -2.85973 )
						if( upperBand <= 3.25769 )
							if( Color_con1 <= -0.343774 )
								if( lowerBand <= 1.29018 )
									ret := -0.022757
								if( lowerBand > 1.29018 )
									ret := 0.305495
							if( Color_con1 > -0.343774 )
								if( midLine <= 0.263283 )
									ret := -0.125190
								if( midLine > 0.263283 )
									ret := 0.046315
						if( upperBand > 3.25769 )
							if( lowerBand <= -0.83372 )
								if( sDev <= 2.20755 )
									ret := -0.854167 // sell
								if( sDev > 2.20755 )
									ret := -0.376344
							if( lowerBand > -0.83372 )
								if( upperBand <= 3.2787 )
									ret := -0.447917
								if( upperBand > 3.2787 )
									ret := -0.079685
				if( upperBand > 4.22056 )
					if( upperBand <= 7.48473 )
						if( sDev <= 1.23416 )
							if( lowerBand <= 2.43056 )
								if( wvf <= 2.71362 )
									ret := 0.958333 // buy
								if( wvf > 2.71362 )
									ret := 0.764706 // buy
							if( lowerBand > 2.43056 )
								ret := 0.500000
						if( sDev > 1.23416 )
							if( wvf <= 0.505064 )
								if( sDev <= 4.03915 )
									ret := -0.164295
								if( sDev > 4.03915 )
									ret := 0.551724
							if( wvf > 0.505064 )
								if( wvf <= 2.364 )
									ret := 0.133121
								if( wvf > 2.364 )
									ret := -0.082286
					if( upperBand > 7.48473 )
						if( upperBand <= 8.76248 )
							if( upperBand <= 8.02302 )
								if( midLine <= 4.78099 )
									ret := -0.209424
								if( midLine > 4.78099 )
									ret := -0.666667
							if( upperBand > 8.02302 )
								if( Color_con1 <= -6.11875 )
									ret := 0.005747
								if( Color_con1 > -6.11875 )
									ret := -0.681818
						if( upperBand > 8.76248 )
							if( Color_con2 <= -4.26969 )
								if( sDev <= 4.58094 )
									ret := 0.809524 // buy
								if( sDev > 4.58094 )
									ret := -0.333333
							if( Color_con2 > -4.26969 )
								ret := -0.714286 // sell
			if( upperBand > 9.11461 )
				if( upperBand <= 14.854 )
					if( Color_con2 <= -8.83137 )
						if( sDev <= 7.1388 )
							ret := -0.272727
						if( sDev > 7.1388 )
							if( lowerBand <= -2.80243 )
								ret := -0.888889 // sell
							if( lowerBand > -2.80243 )
								ret := -1.000000 // sell
					if( Color_con2 > -8.83137 )
						if( sDev <= 6.56464 )
							if( lowerBand <= 1.25174 )
								if( wvf <= 1.71397 )
									ret := -0.422414
								if( wvf > 1.71397 )
									ret := -0.986667 // sell
							if( lowerBand > 1.25174 )
								if( midLine <= 7.34194 )
									ret := 0.000000
								if( midLine > 7.34194 )
									ret := -0.730769 // sell
						if( sDev > 6.56464 )
							if( wvf <= 1.13203 )
								if( midLine <= 5.20163 )
									ret := 0.687500
								if( midLine > 5.20163 )
									ret := 1.000000 // buy
							if( wvf > 1.13203 )
								if( midLine <= 5.63474 )
									ret := -0.456522
								if( midLine > 5.63474 )
									ret := 0.531250
				if( upperBand > 14.854 )
					if( wvf <= 1.55948 )
						ret := 0.937500 // buy
					if( wvf > 1.55948 )
						ret := 0.500000
		if( colInt > 0.5 )
			if( upperBand <= 3.99802 )
				if( Color_con2 <= 0.862703 )
					if( midLine <= 1.06647 )
						if( midLine <= 0.953956 )
							if( sDev <= 0.773783 )
								if( lowerBand <= 0.040645 )
									ret := 0.047445
								if( lowerBand > 0.040645 )
									ret := -0.058824
							if( sDev > 0.773783 )
								if( sDev <= 1.6533 )
									ret := 0.093842
								if( sDev > 1.6533 )
									ret := -0.657143
						if( midLine > 0.953956 )
							if( Color_con1 <= -0.364588 )
								if( wvf <= 1.29255 )
									ret := 0.392473
								if( wvf > 1.29255 )
									ret := -0.208716
							if( Color_con1 > -0.364588 )
								if( upperBand <= 1.30055 )
									ret := 0.571429
								if( upperBand > 1.30055 )
									ret := -0.267593
					if( midLine > 1.06647 )
						if( midLine <= 1.241 )
							if( upperBand <= 2.47887 )
								if( Color_con2 <= 0.571666 )
									ret := 0.286847
								if( Color_con2 > 0.571666 )
									ret := -0.119691
							if( upperBand > 2.47887 )
								if( lowerBand <= -0.34239 )
									ret := 0.186869
								if( lowerBand > -0.34239 )
									ret := -0.213018
						if( midLine > 1.241 )
							if( sDev <= 0.773375 )
								if( midLine <= 1.8244 )
									ret := 0.085185
								if( midLine > 1.8244 )
									ret := 0.746377 // buy
							if( sDev > 0.773375 )
								if( lowerBand <= 1.14691 )
									ret := 0.000822
								if( lowerBand > 1.14691 )
									ret := 0.657895
				if( Color_con2 > 0.862703 )
					if( sDev <= 0.841965 )
						if( Color_con1 <= 0.506081 )
							if( lowerBand <= 0.155169 )
								if( midLine <= 0.440012 )
									ret := -0.230769
								if( midLine > 0.440012 )
									ret := 0.428571
							if( lowerBand > 0.155169 )
								if( Color_con2 <= 1.08478 )
									ret := 0.883721 // buy
								if( Color_con2 > 1.08478 )
									ret := 1.000000 // buy
						if( Color_con1 > 0.506081 )
							if( sDev <= 0.743505 )
								ret := -0.933333 // sell
							if( sDev > 0.743505 )
								ret := 0.500000
					if( sDev > 0.841965 )
						if( sDev <= 1.58781 )
							if( Color_con2 <= 1.12231 )
								if( lowerBand <= -0.42505 )
									ret := -0.232558
								if( lowerBand > -0.42505 )
									ret := 0.251838
							if( Color_con2 > 1.12231 )
								if( sDev <= 1.47892 )
									ret := 0.068220
								if( sDev > 1.47892 )
									ret := -0.426829
						if( sDev > 1.58781 )
							if( Color_con1 <= -1.04296 )
								ret := -0.687500
							if( Color_con1 > -1.04296 )
								if( Color_con1 <= -0.203501 )
									ret := 0.226496
								if( Color_con1 > -0.203501 )
									ret := 0.660714
			if( upperBand > 3.99802 )
				if( midLine <= 1.4687 )
					ret := 1.000000 // buy
				if( midLine > 1.4687 )
					if( Color_con2 <= 0.083823 )
						if( lowerBand <= 0.642042 )
							if( sDev <= 2.37773 )
								if( wvf <= 2.71567 )
									ret := -0.117647
								if( wvf > 2.71567 )
									ret := -0.761905 // sell
							if( sDev > 2.37773 )
								if( sDev <= 2.50999 )
									ret := -0.909091 // sell
								if( sDev > 2.50999 )
									ret := -0.666667
						if( lowerBand > 0.642042 )
							if( sDev <= 1.5522 )
								ret := -0.700000 // sell
							if( sDev > 1.5522 )
								ret := -0.900000 // sell
					if( Color_con2 > 0.083823 )
						if( lowerBand <= -0.221876 )
							if( sDev <= 2.72944 )
								if( Color_con1 <= -1.41895 )
									ret := -0.076923
								if( Color_con1 > -1.41895 )
									ret := -0.818182 // sell
							if( sDev > 2.72944 )
								ret := -1.000000 // sell
						if( lowerBand > -0.221876 )
							if( midLine <= 2.12795 )
								if( Color_con1 <= -1.58611 )
									ret := -0.083333
								if( Color_con1 > -1.58611 )
									ret := 0.923077 // buy
							if( midLine > 2.12795 )
								if( upperBand <= 4.15518 )
									ret := -0.600000
								if( upperBand > 4.15518 )
									ret := -0.052632
	if( wvf > 2.85715 )
		if( Color_con2 <= 5.86886 )
			if( sDev <= 1.58531 )
				if( wvf <= 3.11035 )
					if( lowerBand <= 0.993617 )
						if( midLine <= 1.22043 )
							if( midLine <= 0.984133 )
								if( lowerBand <= -0.495505 )
									ret := 0.342857
								if( lowerBand > -0.495505 )
									ret := -0.437500
							if( midLine > 0.984133 )
								if( Color_con1 <= 0.678795 )
									ret := 0.854369 // buy
								if( Color_con1 > 0.678795 )
									ret := 0.066667
						if( midLine > 1.22043 )
							if( upperBand <= 2.98466 )
								if( upperBand <= 2.68938 )
									ret := 0.433333
								if( upperBand > 2.68938 )
									ret := -0.313043
							if( upperBand > 2.98466 )
								if( midLine <= 2.18133 )
									ret := 0.479290
								if( midLine > 2.18133 )
									ret := -0.057143
					if( lowerBand > 0.993617 )
						if( midLine <= 3.5141 )
							if( midLine <= 3.47797 )
								if( Color_con2 <= 0.128827 )
									ret := 0.448560
								if( Color_con2 > 0.128827 )
									ret := 0.718447 // buy
							if( midLine > 3.47797 )
								if( sDev <= 1.22556 )
									ret := 0.777778 // buy
								if( sDev > 1.22556 )
									ret := 1.000000 // buy
						if( midLine > 3.5141 )
							if( midLine <= 3.71222 )
								ret := -0.800000 // sell
							if( midLine > 3.71222 )
								if( Color_con2 <= -1.07784 )
									ret := -0.545455
								if( Color_con2 > -1.07784 )
									ret := 1.000000 // buy
				if( wvf > 3.11035 )
					if( Color_con2 <= 0.524873 )
						if( Color_con1 <= -0.492352 )
							if( sDev <= 0.795994 )
								ret := -1.000000 // sell
							if( sDev > 0.795994 )
								if( Color_con1 <= -1.94972 )
									ret := -0.431818
								if( Color_con1 > -1.94972 )
									ret := 0.326360
						if( Color_con1 > -0.492352 )
							if( upperBand <= 3.06417 )
								if( Color_con2 <= -0.114449 )
									ret := -0.071429
								if( Color_con2 > -0.114449 )
									ret := 0.642857
							if( upperBand > 3.06417 )
								if( lowerBand <= 1.89289 )
									ret := -0.550633
								if( lowerBand > 1.89289 )
									ret := -0.024390
					if( Color_con2 > 0.524873 )
						if( sDev <= 1.49419 )
							if( midLine <= 2.36661 )
								if( Color_con2 <= 1.51347 )
									ret := 0.489510
								if( Color_con2 > 1.51347 )
									ret := 0.765766 // buy
							if( midLine > 2.36661 )
								if( midLine <= 2.83546 )
									ret := -0.101695
								if( midLine > 2.83546 )
									ret := 0.647887
						if( sDev > 1.49419 )
							if( upperBand <= 3.14456 )
								if( midLine <= 1.13522 )
									ret := -0.050000
								if( midLine > 1.13522 )
									ret := -0.700000 // sell
							if( upperBand > 3.14456 )
								if( wvf <= 3.319 )
									ret := -0.466667
								if( wvf > 3.319 )
									ret := 0.437500
			if( sDev > 1.58531 )
				if( sDev <= 5.90422 )
					if( sDev <= 4.63216 )
						if( Color_con1 <= -3.00307 )
							if( midLine <= 3.41681 )
								if( Color_con2 <= -0.44105 )
									ret := 0.428571
								if( Color_con2 > -0.44105 )
									ret := 0.937500 // buy
							if( midLine > 3.41681 )
								if( sDev <= 3.88349 )
									ret := -0.103876
								if( sDev > 3.88349 )
									ret := -0.366795
						if( Color_con1 > -3.00307 )
							if( Color_con2 <= 0.155315 )
								if( wvf <= 5.21821 )
									ret := 0.220179
								if( wvf > 5.21821 )
									ret := -0.180851
							if( Color_con2 > 0.155315 )
								if( sDev <= 1.73594 )
									ret := 0.234000
								if( sDev > 1.73594 )
									ret := 0.022443
					if( sDev > 4.63216 )
						if( Color_con2 <= 2.9329 )
							if( wvf <= 6.91699 )
								if( Color_con2 <= -4.07288 )
									ret := 0.633333
								if( Color_con2 > -4.07288 )
									ret := 0.035587
							if( wvf > 6.91699 )
								if( Color_con1 <= -6.23696 )
									ret := -0.473684
								if( Color_con1 > -6.23696 )
									ret := 0.649842
						if( Color_con2 > 2.9329 )
							if( wvf <= 6.49652 )
								if( Color_con1 <= -1.23314 )
									ret := 1.000000 // buy
								if( Color_con1 > -1.23314 )
									ret := 0.700000 // buy
							if( wvf > 6.49652 )
								if( sDev <= 5.05061 )
									ret := -0.816327 // sell
								if( sDev > 5.05061 )
									ret := -0.109589
				if( sDev > 5.90422 )
					if( wvf <= 9.38184 )
						if( Color_con2 <= -7.87908 )
							if( lowerBand <= -0.602694 )
								ret := 0.846154 // buy
							if( lowerBand > -0.602694 )
								ret := 0.500000
						if( Color_con2 > -7.87908 )
							if( Color_con2 <= -1.23509 )
								if( sDev <= 7.06412 )
									ret := 0.129630
								if( sDev > 7.06412 )
									ret := -0.574468
							if( Color_con2 > -1.23509 )
								if( Color_con2 <= -0.084722 )
									ret := -0.913580 // sell
								if( Color_con2 > -0.084722 )
									ret := -0.290503
					if( wvf > 9.38184 )
						if( Color_con2 <= 2.74933 )
							if( wvf <= 9.86337 )
								if( Color_con1 <= -6.64129 )
									ret := -0.500000
								if( Color_con1 > -6.64129 )
									ret := 1.000000 // buy
							if( wvf > 9.86337 )
								if( midLine <= 11.4631 )
									ret := -0.809524 // sell
								if( midLine > 11.4631 )
									ret := 0.913043 // buy
						if( Color_con2 > 2.74933 )
							if( Color_con2 <= 5.51921 )
								if( Color_con1 <= -1.82261 )
									ret := 0.936842 // buy
								if( Color_con1 > -1.82261 )
									ret := -0.583333
							if( Color_con2 > 5.51921 )
								ret := -0.166667
		if( Color_con2 > 5.86886 )
			if( midLine <= 3.11143 )
				if( lowerBand <= -2.80015 )
					if( Color_con1 <= 0.136961 )
						if( lowerBand <= -4.09553 )
							ret := 0.888889 // buy
						if( lowerBand > -4.09553 )
							ret := 1.000000 // buy
					if( Color_con1 > 0.136961 )
						ret := 1.000000 // buy
				if( lowerBand > -2.80015 )
					ret := 0.812500 // buy
			if( midLine > 3.11143 )
				if( midLine <= 3.68499 )
					ret := -0.187500
				if( midLine > 3.68499 )
					if( wvf <= 13.2901 )
						if( upperBand <= 13.8505 )
							ret := 1.000000 // buy
						if( upperBand > 13.8505 )
							ret := -0.428571
					if( wvf > 13.2901 )
						if( Color_con1 <= -1.5936 )
							ret := 0.875000 // buy
						if( Color_con1 > -1.5936 )
							ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_XLMUSDT_15Min_b7c16fc1(wvf, sDev, upperBand, Color_con2, colInt, rangeHigh, Color_con1, lowerBand, midLine, rangeLow)

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


