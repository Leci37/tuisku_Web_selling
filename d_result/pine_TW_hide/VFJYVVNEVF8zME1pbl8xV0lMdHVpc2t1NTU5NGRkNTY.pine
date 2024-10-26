//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Williams_Vix_Fix
// ID_model: TRXUSDT_30Min_1WIL_5594dd56 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_30Min_1WIL_5594dd56", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_30Min_5594dd56(Color_con1, Color_con2, colInt, rangeHigh, midLine, sDev, rangeLow, upperBand, lowerBand, wvf)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( wvf <= 3.48692 )
		if( Color_con2 <= -2.0838 )
			if( wvf <= 1.04145 )
				if( midLine <= 3.59963 )
					if( Color_con2 <= -4.23585 )
						if( Color_con2 <= -7.64587 )
							if( sDev <= 1.96399 )
								if( sDev <= 1.1555 )
									ret := -0.145833
								if( sDev > 1.1555 )
									ret := 0.696078
							if( sDev > 1.96399 )
								if( Color_con2 <= -11.7094 )
									ret := -0.750000 // sell
								if( Color_con2 > -11.7094 )
									ret := -0.149254
						if( Color_con2 > -7.64587 )
							if( Color_con2 <= -5.56287 )
								if( Color_con1 <= -2.78419 )
									ret := -0.173432
								if( Color_con1 > -2.78419 )
									ret := -0.575163
							if( Color_con2 > -5.56287 )
								if( lowerBand <= -1.63898 )
									ret := 0.617021
								if( lowerBand > -1.63898 )
									ret := -0.061876
					if( Color_con2 > -4.23585 )
						if( Color_con1 <= -3.46409 )
							if( midLine <= 2.98044 )
								if( Color_con2 <= -3.4892 )
									ret := 0.101695
								if( Color_con2 > -3.4892 )
									ret := -0.190205
							if( midLine > 2.98044 )
								if( upperBand <= 5.9939 )
									ret := 0.563830
								if( upperBand > 5.9939 )
									ret := 0.068376
						if( Color_con1 > -3.46409 )
							if( upperBand <= 3.82989 )
								if( lowerBand <= 0.009652 )
									ret := 0.027049
								if( lowerBand > 0.009652 )
									ret := 0.136678
							if( upperBand > 3.82989 )
								if( midLine <= 2.01505 )
									ret := 0.029412
								if( midLine > 2.01505 )
									ret := 0.500000
				if( midLine > 3.59963 )
					if( sDev <= 3.38459 )
						if( lowerBand <= 2.09558 )
							if( Color_con2 <= -4.48644 )
								if( lowerBand <= 1.29295 )
									ret := 1.000000 // buy
								if( lowerBand > 1.29295 )
									ret := 0.818182 // buy
							if( Color_con2 > -4.48644 )
								if( upperBand <= 6.10286 )
									ret := -0.333333
								if( upperBand > 6.10286 )
									ret := 0.536585
						if( lowerBand > 2.09558 )
							ret := -0.500000
					if( sDev > 3.38459 )
						if( lowerBand <= -0.248677 )
							if( upperBand <= 8.71135 )
								if( sDev <= 4.35897 )
									ret := 0.400000
								if( sDev > 4.35897 )
									ret := -0.280000
							if( upperBand > 8.71135 )
								if( wvf <= 0.670984 )
									ret := 0.692308
								if( wvf > 0.670984 )
									ret := 0.318966
						if( lowerBand > -0.248677 )
							if( midLine <= 3.96443 )
								if( Color_con2 <= -5.06219 )
									ret := 0.000000
								if( Color_con2 > -5.06219 )
									ret := -0.685714
							if( midLine > 3.96443 )
								if( Color_con2 <= -14.3406 )
									ret := -1.000000 // sell
								if( Color_con2 > -14.3406 )
									ret := 0.115000
			if( wvf > 1.04145 )
				if( Color_con1 <= -2.11302 )
					if( Color_con1 <= -2.77801 )
						if( lowerBand <= -1.39697 )
							if( Color_con1 <= -17.1443 )
								if( wvf <= 2.97946 )
									ret := -0.916667 // sell
								if( wvf > 2.97946 )
									ret := 0.666667
							if( Color_con1 > -17.1443 )
								if( upperBand <= 11.7369 )
									ret := 0.229358
								if( upperBand > 11.7369 )
									ret := 0.735849 // buy
						if( lowerBand > -1.39697 )
							if( Color_con2 <= -6.61846 )
								if( midLine <= 2.75227 )
									ret := -0.341014
								if( midLine > 2.75227 )
									ret := 0.028689
							if( Color_con2 > -6.61846 )
								if( Color_con1 <= -3.7964 )
									ret := 0.078580
								if( Color_con1 > -3.7964 )
									ret := 0.292208
					if( Color_con1 > -2.77801 )
						if( Color_con2 <= -2.54794 )
							if( upperBand <= 3.77173 )
								if( Color_con2 <= -4.35048 )
									ret := 0.428571
								if( Color_con2 > -4.35048 )
									ret := -0.060241
							if( upperBand > 3.77173 )
								if( Color_con2 <= -6.08956 )
									ret := 0.024793
								if( Color_con2 > -6.08956 )
									ret := -0.480597
						if( Color_con2 > -2.54794 )
							if( midLine <= 2.04714 )
								if( midLine <= 1.70511 )
									ret := 0.200000
								if( midLine > 1.70511 )
									ret := -0.600000
							if( midLine > 2.04714 )
								if( midLine <= 2.47298 )
									ret := 0.777778 // buy
								if( midLine > 2.47298 )
									ret := 0.314815
				if( Color_con1 > -2.11302 )
					if( upperBand <= 4.69807 )
						if( Color_con1 <= -1.18963 )
							if( midLine <= 1.29193 )
								if( sDev <= 1.66061 )
									ret := -0.400000
								if( sDev > 1.66061 )
									ret := 0.459459
							if( midLine > 1.29193 )
								if( lowerBand <= 1.19847 )
									ret := 0.360000
								if( lowerBand > 1.19847 )
									ret := 0.789474 // buy
						if( Color_con1 > -1.18963 )
							if( wvf <= 2.8259 )
								if( wvf <= 1.73745 )
									ret := 0.241695
								if( wvf > 1.73745 )
									ret := -0.036415
							if( wvf > 2.8259 )
								if( Color_con1 <= -0.602581 )
									ret := 0.017241
								if( Color_con1 > -0.602581 )
									ret := 0.676136
					if( upperBand > 4.69807 )
						if( upperBand <= 5.20738 )
							if( lowerBand <= 1.0317 )
								if( lowerBand <= 0.729941 )
									ret := -0.550000
								if( lowerBand > 0.729941 )
									ret := 0.315789
							if( lowerBand > 1.0317 )
								if( wvf <= 3.16259 )
									ret := -0.750000 // sell
								if( wvf > 3.16259 )
									ret := -1.000000 // sell
						if( upperBand > 5.20738 )
							ret := 0.750000 // buy
		if( Color_con2 > -2.0838 )
			if( upperBand <= 4.07752 )
				if( sDev <= 1.7123 )
					if( sDev <= 1.50624 )
						if( sDev <= 0.877405 )
							if( midLine <= 0.854118 )
								if( upperBand <= 1.55557 )
									ret := 0.009474
								if( upperBand > 1.55557 )
									ret := 0.108974
							if( midLine > 0.854118 )
								if( lowerBand <= 0.312359 )
									ret := -0.151408
								if( lowerBand > 0.312359 )
									ret := -0.006227
						if( sDev > 0.877405 )
							if( lowerBand <= -0.247063 )
								if( Color_con1 <= -0.057649 )
									ret := -0.089052
								if( Color_con1 > -0.057649 )
									ret := 0.108800
							if( lowerBand > -0.247063 )
								if( upperBand <= 2.72987 )
									ret := 0.106226
								if( upperBand > 2.72987 )
									ret := -0.017261
					if( sDev > 1.50624 )
						if( Color_con2 <= 0.64925 )
							if( wvf <= 2.70321 )
								if( wvf <= 0.416029 )
									ret := 0.222973
								if( wvf > 0.416029 )
									ret := -0.078243
							if( wvf > 2.70321 )
								if( wvf <= 3.31761 )
									ret := -0.510460
								if( wvf > 3.31761 )
									ret := 0.034483
						if( Color_con2 > 0.64925 )
							if( wvf <= 3.05564 )
								if( Color_con2 <= 1.1646 )
									ret := 0.171875
								if( Color_con2 > 1.1646 )
									ret := -0.459016
							if( wvf > 3.05564 )
								if( upperBand <= 3.48373 )
									ret := 0.555556
								if( upperBand > 3.48373 )
									ret := 0.030303
				if( sDev > 1.7123 )
					if( lowerBand <= 0.023048 )
						if( midLine <= 1.17902 )
							if( upperBand <= 2.99786 )
								if( midLine <= 1.10747 )
									ret := -0.157025
								if( midLine > 1.10747 )
									ret := 0.277778
							if( upperBand > 2.99786 )
								if( sDev <= 2.39134 )
									ret := -0.453608
								if( sDev > 2.39134 )
									ret := 0.117647
						if( midLine > 1.17902 )
							if( lowerBand <= -0.205792 )
								if( Color_con2 <= -1.50755 )
									ret := -0.061688
								if( Color_con2 > -1.50755 )
									ret := 0.233205
							if( lowerBand > -0.205792 )
								if( Color_con1 <= -2.47065 )
									ret := 0.342466
								if( Color_con1 > -2.47065 )
									ret := -0.197368
					if( lowerBand > 0.023048 )
						if( Color_con2 <= -1.08536 )
							if( Color_con1 <= -2.22862 )
								if( upperBand <= 3.91063 )
									ret := 0.540984
								if( upperBand > 3.91063 )
									ret := -0.094340
							if( Color_con1 > -2.22862 )
								if( wvf <= 2.88517 )
									ret := -0.360000
								if( wvf > 2.88517 )
									ret := 1.000000 // buy
						if( Color_con2 > -1.08536 )
							if( lowerBand <= 0.503914 )
								if( wvf <= 3.13156 )
									ret := 0.602941
								if( wvf > 3.13156 )
									ret := 0.000000
							if( lowerBand > 0.503914 )
								if( Color_con2 <= -0.82285 )
									ret := 0.500000
								if( Color_con2 > -0.82285 )
									ret := -0.777778 // sell
			if( upperBand > 4.07752 )
				if( sDev <= 1.20738 )
					if( Color_con2 <= -0.016073 )
						if( Color_con1 <= -2.08855 )
							if( Color_con1 <= -2.22611 )
								if( Color_con2 <= -1.84524 )
									ret := 0.000000
								if( Color_con2 > -1.84524 )
									ret := -0.866667 // sell
							if( Color_con1 > -2.22611 )
								if( wvf <= 2.55279 )
									ret := -0.166667
								if( wvf > 2.55279 )
									ret := 0.833333 // buy
						if( Color_con1 > -2.08855 )
							if( Color_con2 <= -1.02738 )
								if( Color_con2 <= -1.4854 )
									ret := -0.200000
								if( Color_con2 > -1.4854 )
									ret := -0.861111 // sell
							if( Color_con2 > -1.02738 )
								if( wvf <= 3.05856 )
									ret := -0.333333
								if( wvf > 3.05856 )
									ret := -0.820896 // sell
					if( Color_con2 > -0.016073 )
						if( Color_con2 <= 0.058312 )
							ret := 0.750000 // buy
						if( Color_con2 > 0.058312 )
							ret := 0.000000
				if( sDev > 1.20738 )
					if( wvf <= 0.912082 )
						if( midLine <= 2.11283 )
							if( midLine <= 1.97872 )
								if( sDev <= 2.42446 )
									ret := 0.777778 // buy
								if( sDev > 2.42446 )
									ret := 0.307692
							if( midLine > 1.97872 )
								ret := 0.000000
						if( midLine > 2.11283 )
							if( Color_con2 <= -2.03157 )
								ret := 0.000000
							if( Color_con2 > -2.03157 )
								ret := 1.000000 // buy
					if( wvf > 0.912082 )
						if( upperBand <= 7.30488 )
							if( Color_con1 <= -1.9969 )
								if( upperBand <= 4.1523 )
									ret := -0.495327
								if( upperBand > 4.1523 )
									ret := 0.027827
							if( Color_con1 > -1.9969 )
								if( midLine <= 2.91243 )
									ret := -0.226433
								if( midLine > 2.91243 )
									ret := 0.016835
						if( upperBand > 7.30488 )
							if( sDev <= 3.02952 )
								ret := -1.000000 // sell
							if( sDev > 3.02952 )
								if( lowerBand <= 0.679966 )
									ret := -0.795455 // sell
								if( lowerBand > 0.679966 )
									ret := 0.266667
	if( wvf > 3.48692 )
		if( Color_con2 <= -14.0214 )
			if( midLine <= 18.2502 )
				if( upperBand <= 22.6371 )
					if( midLine <= 2.9718 )
						ret := 0.500000
					if( midLine > 2.9718 )
						if( lowerBand <= 4.35554 )
							ret := 1.000000 // buy
						if( lowerBand > 4.35554 )
							ret := 0.750000 // buy
				if( upperBand > 22.6371 )
					if( midLine <= 14.0205 )
						if( midLine <= 12.7934 )
							if( midLine <= 11.2011 )
								ret := 0.500000
							if( midLine > 11.2011 )
								ret := 1.000000 // buy
						if( midLine > 12.7934 )
							ret := -0.250000
					if( midLine > 14.0205 )
						if( wvf <= 5.32936 )
							if( upperBand <= 26.6069 )
								ret := 1.000000 // buy
							if( upperBand > 26.6069 )
								ret := 0.500000
						if( wvf > 5.32936 )
							ret := 1.000000 // buy
			if( midLine > 18.2502 )
				ret := -1.000000 // sell
		if( Color_con2 > -14.0214 )
			if( Color_con1 <= -15.7034 )
				if( upperBand <= 23.4139 )
					if( lowerBand <= 5.12272 )
						if( Color_con2 <= -13.139 )
							ret := 0.857143 // buy
						if( Color_con2 > -13.139 )
							ret := -1.000000 // sell
					if( lowerBand > 5.12272 )
						if( wvf <= 6.44751 )
							ret := 1.000000 // buy
						if( wvf > 6.44751 )
							ret := 0.500000
				if( upperBand > 23.4139 )
					if( lowerBand <= 11.2229 )
						if( wvf <= 19.5911 )
							if( midLine <= 16.8615 )
								if( upperBand <= 26.0652 )
									ret := -1.000000 // sell
								if( upperBand > 26.0652 )
									ret := 0.000000
							if( midLine > 16.8615 )
								if( wvf <= 8.47319 )
									ret := -0.750000 // sell
								if( wvf > 8.47319 )
									ret := -1.000000 // sell
						if( wvf > 19.5911 )
							ret := 0.833333 // buy
					if( lowerBand > 11.2229 )
						ret := 1.000000 // buy
			if( Color_con1 > -15.7034 )
				if( Color_con2 <= 10.6572 )
					if( lowerBand <= -1.39673 )
						if( Color_con2 <= -3.91947 )
							if( Color_con2 <= -12.0792 )
								ret := -1.000000 // sell
							if( Color_con2 > -12.0792 )
								if( upperBand <= 7.86677 )
									ret := 0.750000 // buy
								if( upperBand > 7.86677 )
									ret := 0.985294 // buy
						if( Color_con2 > -3.91947 )
							if( Color_con1 <= 0.204496 )
								if( wvf <= 5.53489 )
									ret := -0.439114
								if( wvf > 5.53489 )
									ret := -0.063114
							if( Color_con1 > 0.204496 )
								if( Color_con1 <= 3.38633 )
									ret := 0.463203
								if( Color_con1 > 3.38633 )
									ret := -0.750000 // sell
					if( lowerBand > -1.39673 )
						if( Color_con2 <= -9.52231 )
							if( midLine <= 7.704 )
								if( wvf <= 6.26307 )
									ret := -0.814286 // sell
								if( wvf > 6.26307 )
									ret := 0.500000
							if( midLine > 7.704 )
								if( midLine <= 11.6367 )
									ret := 0.904762 // buy
								if( midLine > 11.6367 )
									ret := -0.368421
						if( Color_con2 > -9.52231 )
							if( Color_con2 <= -5.95477 )
								if( lowerBand <= 3.77971 )
									ret := 0.531429
								if( lowerBand > 3.77971 )
									ret := 0.148387
							if( Color_con2 > -5.95477 )
								if( Color_con2 <= -5.72537 )
									ret := -0.361111
								if( Color_con2 > -5.72537 )
									ret := 0.150837
				if( Color_con2 > 10.6572 )
					if( Color_con1 <= 8.64053 )
						if( Color_con1 <= -0.594782 )
							if( wvf <= 31.0959 )
								ret := -0.250000
							if( wvf > 31.0959 )
								ret := 1.000000 // buy
						if( Color_con1 > -0.594782 )
							if( Color_con2 <= 10.873 )
								ret := 0.500000
							if( Color_con2 > 10.873 )
								if( lowerBand <= -1.62732 )
									ret := 0.869565 // buy
								if( lowerBand > -1.62732 )
									ret := 1.000000 // buy
					if( Color_con1 > 8.64053 )
						ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_TRXUSDT_30Min_5594dd56(Color_con1, Color_con2, colInt, rangeHigh, midLine, sDev, rangeLow, upperBand, lowerBand, wvf)

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


