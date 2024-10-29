//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Williams_Vix_Fix
// ID_model: SHIBUSDT_30Min_1WIL_2b15c9a2 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SHIBUSDT_30Min_1WIL_2b15c9a2", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SHIBUSDT_30Min_2b15c9a2(Color_con1, Color_con2, colInt, rangeHigh, midLine, sDev, rangeLow, upperBand, lowerBand, wvf)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( wvf <= 4.25722 )
		if( lowerBand <= 3.8227 )
			if( sDev <= 3.24712 )
				if( upperBand <= 6.79971 )
					if( Color_con2 <= -11.3047 )
						if( midLine <= 1.62723 )
							if( sDev <= 1.05988 )
								ret := 0.500000
							if( sDev > 1.05988 )
								ret := 1.000000 // buy
						if( midLine > 1.62723 )
							if( wvf <= 2.98391 )
								if( Color_con2 <= -17.5789 )
									ret := 0.000000
								if( Color_con2 > -17.5789 )
									ret := -0.848101 // sell
							if( wvf > 2.98391 )
								if( lowerBand <= 0.141192 )
									ret := -0.250000
								if( lowerBand > 0.141192 )
									ret := 0.250000
					if( Color_con2 > -11.3047 )
						if( Color_con2 <= -9.16828 )
							if( Color_con1 <= -2.16942 )
								if( upperBand <= 5.45965 )
									ret := -0.084337
								if( upperBand > 5.45965 )
									ret := 0.676471
							if( Color_con1 > -2.16942 )
								if( lowerBand <= 0.000551 )
									ret := 0.909091 // buy
								if( lowerBand > 0.000551 )
									ret := 0.400000
						if( Color_con2 > -9.16828 )
							if( wvf <= 0.859139 )
								if( midLine <= 2.90951 )
									ret := 0.066585
								if( midLine > 2.90951 )
									ret := -0.197861
							if( wvf > 0.859139 )
								if( sDev <= 0.850752 )
									ret := -0.046534
								if( sDev > 0.850752 )
									ret := 0.012696
				if( upperBand > 6.79971 )
					if( Color_con2 <= -1.91728 )
						if( upperBand <= 7.82771 )
							if( Color_con2 <= -4.15828 )
								if( wvf <= 1.9009 )
									ret := -0.235849
								if( wvf > 1.9009 )
									ret := 0.209040
							if( Color_con2 > -4.15828 )
								if( Color_con1 <= -5.93974 )
									ret := -0.233333
								if( Color_con1 > -5.93974 )
									ret := 0.387826
						if( upperBand > 7.82771 )
							if( lowerBand <= 2.74459 )
								if( Color_con2 <= -2.30499 )
									ret := 0.046218
								if( Color_con2 > -2.30499 )
									ret := -0.761905 // sell
							if( lowerBand > 2.74459 )
								if( lowerBand <= 3.75445 )
									ret := 0.226744
								if( lowerBand > 3.75445 )
									ret := 1.000000 // buy
					if( Color_con2 > -1.91728 )
						if( Color_con1 <= -3.79862 )
							if( wvf <= 3.93974 )
								if( midLine <= 4.22338 )
									ret := -0.720000 // sell
								if( midLine > 4.22338 )
									ret := -0.253521
							if( wvf > 3.93974 )
								if( Color_con2 <= -1.50885 )
									ret := 0.400000
								if( Color_con2 > -1.50885 )
									ret := -0.111111
						if( Color_con1 > -3.79862 )
							if( lowerBand <= 1.11789 )
								if( lowerBand <= 0.985661 )
									ret := -0.166667
								if( lowerBand > 0.985661 )
									ret := -0.833333 // sell
							if( lowerBand > 1.11789 )
								if( midLine <= 4.26692 )
									ret := 0.631579
								if( midLine > 4.26692 )
									ret := 0.098361
			if( sDev > 3.24712 )
				if( wvf <= 1.75501 )
					if( Color_con1 <= -10.9721 )
						if( wvf <= 1.25661 )
							if( midLine <= 5.36168 )
								if( sDev <= 7.69417 )
									ret := 0.250000
								if( sDev > 7.69417 )
									ret := -0.666667
							if( midLine > 5.36168 )
								if( midLine <= 9.02513 )
									ret := 0.638889
								if( midLine > 9.02513 )
									ret := -0.312500
						if( wvf > 1.25661 )
							if( Color_con2 <= -11.2843 )
								if( upperBand <= 13.1871 )
									ret := 0.750000 // buy
								if( upperBand > 13.1871 )
									ret := -0.478261
							if( Color_con2 > -11.2843 )
								if( Color_con1 <= -15.9254 )
									ret := 0.833333 // buy
								if( Color_con1 > -15.9254 )
									ret := -0.093750
					if( Color_con1 > -10.9721 )
						if( sDev <= 5.1851 )
							if( lowerBand <= -0.435707 )
								if( upperBand <= 8.77008 )
									ret := -0.039947
								if( upperBand > 8.77008 )
									ret := 0.492063
							if( lowerBand > -0.435707 )
								if( upperBand <= 6.61719 )
									ret := 0.333333
								if( upperBand > 6.61719 )
									ret := -0.258362
						if( sDev > 5.1851 )
							if( sDev <= 6.14567 )
								if( Color_con2 <= -9.25547 )
									ret := 0.473684
								if( Color_con2 > -9.25547 )
									ret := -0.445652
							if( sDev > 6.14567 )
								if( lowerBand <= -1.73363 )
									ret := -0.666667
								if( lowerBand > -1.73363 )
									ret := -0.918919 // sell
				if( wvf > 1.75501 )
					if( Color_con2 <= -8.10063 )
						if( Color_con1 <= -10.858 )
							if( Color_con2 <= -11.9165 )
								if( Color_con1 <= -23.2214 )
									ret := 0.515152
								if( Color_con1 > -23.2214 )
									ret := -0.582677
							if( Color_con2 > -11.9165 )
								if( Color_con1 <= -15.4358 )
									ret := 0.500000
								if( Color_con1 > -15.4358 )
									ret := -0.116959
						if( Color_con1 > -10.858 )
							if( wvf <= 2.48547 )
								if( sDev <= 4.58514 )
									ret := -0.097561
								if( sDev > 4.58514 )
									ret := 0.473684
							if( wvf > 2.48547 )
								if( sDev <= 5.78497 )
									ret := 0.615741
								if( sDev > 5.78497 )
									ret := 0.229508
					if( Color_con2 > -8.10063 )
						if( upperBand <= 14.1551 )
							if( sDev <= 5.85804 )
								if( lowerBand <= 0.313419 )
									ret := 0.038902
								if( lowerBand > 0.313419 )
									ret := -0.141660
							if( sDev > 5.85804 )
								if( midLine <= 4.95779 )
									ret := -0.800000 // sell
								if( midLine > 4.95779 )
									ret := -0.345794
						if( upperBand > 14.1551 )
							if( Color_con2 <= -5.08585 )
								if( Color_con2 <= -8.03415 )
									ret := -0.888889 // sell
								if( Color_con2 > -8.03415 )
									ret := 0.217391
							if( Color_con2 > -5.08585 )
								ret := 1.000000 // buy
		if( lowerBand > 3.8227 )
			if( Color_con1 <= -6.56482 )
				if( wvf <= 2.8886 )
					if( lowerBand <= 4.01808 )
						ret := -0.750000 // sell
					if( lowerBand > 4.01808 )
						if( upperBand <= 20.2521 )
							if( Color_con2 <= -10.6607 )
								ret := -0.500000
							if( Color_con2 > -10.6607 )
								ret := 0.200000
						if( upperBand > 20.2521 )
							ret := 0.666667
				if( wvf > 2.8886 )
					if( wvf <= 3.86752 )
						if( wvf <= 3.39003 )
							if( wvf <= 3.32622 )
								if( Color_con2 <= -8.50055 )
									ret := -0.625000
								if( Color_con2 > -8.50055 )
									ret := -0.892857 // sell
							if( wvf > 3.32622 )
								ret := -0.500000
						if( wvf > 3.39003 )
							if( lowerBand <= 4.90381 )
								ret := -1.000000 // sell
							if( lowerBand > 4.90381 )
								ret := -0.857143 // sell
					if( wvf > 3.86752 )
						if( wvf <= 4.03851 )
							if( upperBand <= 13.4357 )
								ret := 0.000000
							if( upperBand > 13.4357 )
								ret := -0.500000
						if( wvf > 4.03851 )
							ret := -0.857143 // sell
			if( Color_con1 > -6.56482 )
				if( Color_con1 <= -6.37081 )
					ret := 1.000000 // buy
				if( Color_con1 > -6.37081 )
					if( midLine <= 5.86327 )
						ret := 0.428571
					if( midLine > 5.86327 )
						if( wvf <= 3.9576 )
							if( upperBand <= 8.87007 )
								if( midLine <= 6.34589 )
									ret := -0.222222
								if( midLine > 6.34589 )
									ret := -0.750000 // sell
							if( upperBand > 8.87007 )
								if( Color_con2 <= -3.58042 )
									ret := 0.000000
								if( Color_con2 > -3.58042 )
									ret := 0.833333 // buy
						if( wvf > 3.9576 )
							if( Color_con1 <= -5.24159 )
								ret := -1.000000 // sell
							if( Color_con1 > -5.24159 )
								ret := -0.500000
	if( wvf > 4.25722 )
		if( Color_con2 <= 0.29936 )
			if( upperBand <= 44.0096 )
				if( lowerBand <= 6.0704 )
					if( lowerBand <= 4.0893 )
						if( upperBand <= 28.2864 )
							if( Color_con1 <= -12.8511 )
								if( sDev <= 12.0857 )
									ret := -0.127389
								if( sDev > 12.0857 )
									ret := -0.750000 // sell
							if( Color_con1 > -12.8511 )
								if( Color_con2 <= -7.21983 )
									ret := 0.412860
								if( Color_con2 > -7.21983 )
									ret := 0.087416
						if( upperBand > 28.2864 )
							if( Color_con2 <= -5.32178 )
								if( wvf <= 5.08651 )
									ret := 0.923077 // buy
								if( wvf > 5.08651 )
									ret := 0.149425
							if( Color_con2 > -5.32178 )
								if( midLine <= 15.2128 )
									ret := 0.904762 // buy
								if( midLine > 15.2128 )
									ret := 1.000000 // buy
					if( lowerBand > 4.0893 )
						if( upperBand <= 22.0659 )
							if( Color_con2 <= -2.52351 )
								if( midLine <= 12.7777 )
									ret := -0.253425
								if( midLine > 12.7777 )
									ret := -0.909091 // sell
							if( Color_con2 > -2.52351 )
								if( wvf <= 13.1476 )
									ret := 0.095133
								if( wvf > 13.1476 )
									ret := -0.954545 // sell
						if( upperBand > 22.0659 )
							if( sDev <= 12.6783 )
								if( Color_con2 <= -8.78271 )
									ret := -0.208333
								if( Color_con2 > -8.78271 )
									ret := 0.816667 // buy
							if( sDev > 12.6783 )
								if( Color_con1 <= -27.6794 )
									ret := 1.000000 // buy
								if( Color_con1 > -27.6794 )
									ret := -0.636364
				if( lowerBand > 6.0704 )
					if( sDev <= 6.96671 )
						if( midLine <= 12.6415 )
							if( Color_con2 <= -3.05562 )
								if( midLine <= 11.6261 )
									ret := -0.555556
								if( midLine > 11.6261 )
									ret := 0.647059
							if( Color_con2 > -3.05562 )
								if( wvf <= 10.7059 )
									ret := 0.793103 // buy
								if( wvf > 10.7059 )
									ret := 0.098039
						if( midLine > 12.6415 )
							if( midLine <= 15.1318 )
								if( midLine <= 12.8136 )
									ret := 0.700000 // buy
								if( midLine > 12.8136 )
									ret := 0.980198 // buy
							if( midLine > 15.1318 )
								ret := 0.000000
					if( sDev > 6.96671 )
						if( midLine <= 20.596 )
							if( Color_con1 <= -20.6215 )
								ret := -1.000000 // sell
							if( Color_con1 > -20.6215 )
								if( upperBand <= 25.0055 )
									ret := -0.580645
								if( upperBand > 25.0055 )
									ret := 0.178862
						if( midLine > 20.596 )
							if( upperBand <= 31.9464 )
								if( lowerBand <= 12.9381 )
									ret := -0.500000
								if( lowerBand > 12.9381 )
									ret := 0.800000 // buy
							if( upperBand > 31.9464 )
								if( midLine <= 27.7129 )
									ret := 0.907407 // buy
								if( midLine > 27.7129 )
									ret := 0.083333
			if( upperBand > 44.0096 )
				if( Color_con1 <= -28.9967 )
					if( sDev <= 18.049 )
						ret := -0.833333 // sell
					if( sDev > 18.049 )
						ret := -1.000000 // sell
				if( Color_con1 > -28.9967 )
					if( lowerBand <= 17.1193 )
						if( wvf <= 26.0291 )
							if( lowerBand <= 12.1937 )
								ret := 0.500000
							if( lowerBand > 12.1937 )
								ret := 1.000000 // buy
						if( wvf > 26.0291 )
							ret := 0.200000
					if( lowerBand > 17.1193 )
						if( wvf <= 20.0262 )
							ret := 0.000000
						if( wvf > 20.0262 )
							ret := -1.000000 // sell
		if( Color_con2 > 0.29936 )
			if( upperBand <= 3.19387 )
				if( lowerBand <= -0.831905 )
					ret := -0.500000
				if( lowerBand > -0.831905 )
					if( wvf <= 4.35614 )
						if( sDev <= 1.75221 )
							ret := -0.500000
						if( sDev > 1.75221 )
							ret := -1.000000 // sell
					if( wvf > 4.35614 )
						ret := -1.000000 // sell
			if( upperBand > 3.19387 )
				if( Color_con2 <= 4.45112 )
					if( lowerBand <= -3.37867 )
						if( lowerBand <= -7.46166 )
							ret := 1.000000 // buy
						if( lowerBand > -7.46166 )
							if( Color_con2 <= 1.72269 )
								if( lowerBand <= -4.44287 )
									ret := -0.750000 // sell
								if( lowerBand > -4.44287 )
									ret := 0.250000
							if( Color_con2 > 1.72269 )
								if( Color_con2 <= 2.7963 )
									ret := -1.000000 // sell
								if( Color_con2 > 2.7963 )
									ret := -0.772727 // sell
					if( lowerBand > -3.37867 )
						if( Color_con1 <= 0.546764 )
							if( sDev <= 7.15458 )
								if( lowerBand <= -2.01903 )
									ret := -0.119497
								if( lowerBand > -2.01903 )
									ret := 0.189109
							if( sDev > 7.15458 )
								if( sDev <= 10.6049 )
									ret := 0.468835
								if( sDev > 10.6049 )
									ret := -0.033058
						if( Color_con1 > 0.546764 )
							if( midLine <= 7.97917 )
								if( midLine <= 1.91895 )
									ret := 0.135922
								if( midLine > 1.91895 )
									ret := 0.454237
							if( midLine > 7.97917 )
								if( midLine <= 10.5291 )
									ret := -0.900000 // sell
								if( midLine > 10.5291 )
									ret := 0.333333
				if( Color_con2 > 4.45112 )
					if( midLine <= 3.48083 )
						if( upperBand <= 7.69498 )
							if( upperBand <= 6.03134 )
								if( wvf <= 9.137 )
									ret := -0.119403
								if( wvf > 9.137 )
									ret := 0.888889 // buy
							if( upperBand > 6.03134 )
								if( midLine <= 3.38254 )
									ret := 0.681159
								if( midLine > 3.38254 )
									ret := -0.250000
						if( upperBand > 7.69498 )
							if( wvf <= 10.9756 )
								if( Color_con1 <= -0.088004 )
									ret := -0.466667
								if( Color_con1 > -0.088004 )
									ret := 0.357143
							if( wvf > 10.9756 )
								if( lowerBand <= -7.1542 )
									ret := 0.250000
								if( lowerBand > -7.1542 )
									ret := -0.750000 // sell
					if( midLine > 3.48083 )
						if( midLine <= 11.6046 )
							if( sDev <= 12.5094 )
								if( wvf <= 10.2918 )
									ret := 0.767442 // buy
								if( wvf > 10.2918 )
									ret := 0.395683
							if( sDev > 12.5094 )
								if( lowerBand <= -10.0185 )
									ret := 0.222222
								if( lowerBand > -10.0185 )
									ret := 0.924051 // buy
						if( midLine > 11.6046 )
							if( wvf <= 36.6808 )
								if( lowerBand <= 7.0235 )
									ret := -0.300000
								if( lowerBand > 7.0235 )
									ret := 0.545455
							if( wvf > 36.6808 )
								if( wvf <= 37.2279 )
									ret := 0.750000 // buy
								if( wvf > 37.2279 )
									ret := 1.000000 // buy
	
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
float op_operation = decision_tree_0_SHIBUSDT_30Min_2b15c9a2(Color_con1, Color_con2, colInt, rangeHigh, midLine, sDev, rangeLow, upperBand, lowerBand, wvf)

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


