//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Williams_Vix_Fix
// ID_model: AVAXUSDT_30Min_1WIL_34e8c5b9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AVAXUSDT_30Min_1WIL_34e8c5b9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AVAXUSDT_30Min_34e8c5b9(rangeHigh, rangeLow, midLine, sDev, lowerBand, wvf, Color_con1, colInt, Color_con2, upperBand)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( lowerBand <= 0.538754 )
		if( Color_con2 <= 3.93855 )
			if( upperBand <= 1.81942 )
				if( Color_con1 <= -1.06848 )
					if( upperBand <= 1.56545 )
						if( Color_con2 <= -2.26496 )
							if( lowerBand <= 0.073214 )
								ret := 0.000000
							if( lowerBand > 0.073214 )
								ret := -0.533333
						if( Color_con2 > -2.26496 )
							if( upperBand <= 1.47583 )
								if( wvf <= 0.345111 )
									ret := 0.150442
								if( wvf > 0.345111 )
									ret := 0.900000 // buy
							if( upperBand > 1.47583 )
								if( midLine <= 0.850293 )
									ret := 0.658537
								if( midLine > 0.850293 )
									ret := 0.170732
					if( upperBand > 1.56545 )
						if( lowerBand <= -0.329127 )
							if( Color_con2 <= -1.09785 )
								if( Color_con1 <= -1.49569 )
									ret := 0.846154 // buy
								if( Color_con1 > -1.49569 )
									ret := 0.384615
							if( Color_con2 > -1.09785 )
								ret := 0.000000
						if( lowerBand > -0.329127 )
							if( Color_con2 <= -0.674356 )
								if( sDev <= 0.924937 )
									ret := 0.063918
								if( sDev > 0.924937 )
									ret := 0.306818
							if( Color_con2 > -0.674356 )
								if( lowerBand <= 0.149317 )
									ret := -0.612903
								if( lowerBand > 0.149317 )
									ret := 0.000000
				if( Color_con1 > -1.06848 )
					if( Color_con2 <= -4.96865 )
						if( Color_con1 <= -0.440683 )
							if( lowerBand <= 0.182613 )
								if( lowerBand <= 0.097321 )
									ret := -0.346154
								if( lowerBand > 0.097321 )
									ret := -0.689655
							if( lowerBand > 0.182613 )
								ret := -0.200000
						if( Color_con1 > -0.440683 )
							if( upperBand <= 1.45253 )
								ret := 0.100000
							if( upperBand > 1.45253 )
								ret := -0.272727
					if( Color_con2 > -4.96865 )
						if( midLine <= 0.75759 )
							if( wvf <= 0.509214 )
								if( Color_con1 <= -0.665978 )
									ret := -0.139037
								if( Color_con1 > -0.665978 )
									ret := 0.021374
							if( wvf > 0.509214 )
								if( Color_con1 <= -0.296803 )
									ret := 0.085385
								if( Color_con1 > -0.296803 )
									ret := -0.061345
						if( midLine > 0.75759 )
							if( sDev <= 0.506606 )
								if( Color_con1 <= -0.222333 )
									ret := 0.369427
								if( Color_con1 > -0.222333 )
									ret := 0.000000
							if( sDev > 0.506606 )
								if( Color_con2 <= -0.824494 )
									ret := 0.143488
								if( Color_con2 > -0.824494 )
									ret := 0.009591
			if( upperBand > 1.81942 )
				if( wvf <= 5.1185 )
					if( Color_con1 <= -12.705 )
						if( wvf <= 0.521266 )
							ret := -0.857143 // sell
						if( wvf > 0.521266 )
							if( sDev <= 8.84627 )
								if( Color_con2 <= -11.3661 )
									ret := -0.909091 // sell
								if( Color_con2 > -11.3661 )
									ret := 0.672727
							if( sDev > 8.84627 )
								if( lowerBand <= -2.9966 )
									ret := 0.391608
								if( lowerBand > -2.9966 )
									ret := -0.136364
					if( Color_con1 > -12.705 )
						if( wvf <= 1.55621 )
							if( upperBand <= 12.1493 )
								if( Color_con2 <= -2.77557 )
									ret := -0.070005
								if( Color_con2 > -2.77557 )
									ret := 0.033046
							if( upperBand > 12.1493 )
								if( midLine <= 5.30308 )
									ret := -0.755102 // sell
								if( midLine > 5.30308 )
									ret := -0.238532
						if( wvf > 1.55621 )
							if( wvf <= 3.52102 )
								if( colInt <= 0.5 )
									ret := -0.078215
								if( colInt > 0.5 )
									ret := -0.134250
							if( wvf > 3.52102 )
								if( sDev <= 2.2846 )
									ret := 0.083614
								if( sDev > 2.2846 )
									ret := -0.068898
				if( wvf > 5.1185 )
					if( colInt <= 0.5 )
						if( Color_con2 <= -2.85332 )
							if( sDev <= 8.4371 )
								if( lowerBand <= -0.316948 )
									ret := 0.464789
								if( lowerBand > -0.316948 )
									ret := 0.095563
							if( sDev > 8.4371 )
								if( upperBand <= 30.6366 )
									ret := -0.221477
								if( upperBand > 30.6366 )
									ret := 0.888889 // buy
						if( Color_con2 > -2.85332 )
							if( sDev <= 5.28902 )
								if( Color_con1 <= -2.36316 )
									ret := -0.216749
								if( Color_con1 > -2.36316 )
									ret := 0.206119
							if( sDev > 5.28902 )
								if( Color_con1 <= -4.95309 )
									ret := -0.561129
								if( Color_con1 > -4.95309 )
									ret := -0.122744
					if( colInt > 0.5 )
						if( Color_con2 <= -3.50487 )
							if( Color_con1 <= 0.816338 )
								if( Color_con2 <= -4.49535 )
									ret := 0.750000 // buy
								if( Color_con2 > -4.49535 )
									ret := 1.000000 // buy
							if( Color_con1 > 0.816338 )
								ret := 0.434783
						if( Color_con2 > -3.50487 )
							if( sDev <= 10.0085 )
								if( lowerBand <= -0.904445 )
									ret := -0.055011
								if( lowerBand > -0.904445 )
									ret := 0.101821
							if( sDev > 10.0085 )
								if( Color_con2 <= 2.61468 )
									ret := -0.629630
								if( Color_con2 > 2.61468 )
									ret := -0.205882
		if( Color_con2 > 3.93855 )
			if( Color_con2 <= 12.6482 )
				if( midLine <= 8.9142 )
					if( midLine <= 1.85119 )
						if( wvf <= 9.38026 )
							if( sDev <= 3.3175 )
								ret := 0.000000
							if( sDev > 3.3175 )
								ret := -0.250000
						if( wvf > 9.38026 )
							ret := -1.000000 // sell
					if( midLine > 1.85119 )
						if( Color_con1 <= 2.08586 )
							if( wvf <= 9.86773 )
								if( upperBand <= 11.1496 )
									ret := 0.150943
								if( upperBand > 11.1496 )
									ret := -0.608696
							if( wvf > 9.86773 )
								if( sDev <= 6.10965 )
									ret := 0.688312
								if( sDev > 6.10965 )
									ret := 0.315068
						if( Color_con1 > 2.08586 )
							if( lowerBand <= -2.98336 )
								ret := 0.000000
							if( lowerBand > -2.98336 )
								if( midLine <= 4.55354 )
									ret := 0.752212 // buy
								if( midLine > 4.55354 )
									ret := 0.257143
				if( midLine > 8.9142 )
					if( wvf <= 21.9704 )
						if( wvf <= 19.0113 )
							if( midLine <= 10.8711 )
								if( Color_con1 <= -5.1354 )
									ret := 0.000000
								if( Color_con1 > -5.1354 )
									ret := -0.657895
							if( midLine > 10.8711 )
								ret := -0.117647
						if( wvf > 19.0113 )
							if( wvf <= 20.3215 )
								ret := 0.333333
							if( wvf > 20.3215 )
								ret := 0.562500
					if( wvf > 21.9704 )
						ret := -0.900000 // sell
			if( Color_con2 > 12.6482 )
				if( upperBand <= 17.8321 )
					ret := 0.500000
				if( upperBand > 17.8321 )
					ret := 1.000000 // buy
	if( lowerBand > 0.538754 )
		if( upperBand <= 15.2623 )
			if( lowerBand <= 6.65416 )
				if( midLine <= 7.74555 )
					if( midLine <= 7.45937 )
						if( Color_con2 <= -1.75138 )
							if( midLine <= 5.80198 )
								if( midLine <= 2.11388 )
									ret := -0.012678
								if( midLine > 2.11388 )
									ret := 0.116044
							if( midLine > 5.80198 )
								if( sDev <= 5.45215 )
									ret := 0.025751
								if( sDev > 5.45215 )
									ret := -0.278515
						if( Color_con2 > -1.75138 )
							if( Color_con2 <= 0.155003 )
								if( lowerBand <= 4.44902 )
									ret := -0.018391
								if( lowerBand > 4.44902 )
									ret := 0.457143
							if( Color_con2 > 0.155003 )
								if( upperBand <= 2.50398 )
									ret := 0.467153
								if( upperBand > 2.50398 )
									ret := 0.069185
					if( midLine > 7.45937 )
						if( upperBand <= 14.2796 )
							if( Color_con2 <= -0.170425 )
								if( Color_con2 <= -8.062 )
									ret := 0.400000
								if( Color_con2 > -8.062 )
									ret := -0.397541
							if( Color_con2 > -0.170425 )
								if( midLine <= 7.54371 )
									ret := 0.457143
								if( midLine > 7.54371 )
									ret := -0.227273
						if( upperBand > 14.2796 )
							if( Color_con1 <= -11.3986 )
								ret := 1.000000 // buy
							if( Color_con1 > -11.3986 )
								if( midLine <= 7.5733 )
									ret := 0.928571 // buy
								if( midLine > 7.5733 )
									ret := 0.000000
				if( midLine > 7.74555 )
					if( wvf <= 9.94581 )
						if( lowerBand <= 6.49532 )
							if( upperBand <= 14.1247 )
								if( Color_con1 <= -4.05943 )
									ret := -0.031440
								if( Color_con1 > -4.05943 )
									ret := 0.245136
							if( upperBand > 14.1247 )
								if( upperBand <= 14.7491 )
									ret := 0.391304
								if( upperBand > 14.7491 )
									ret := 0.114286
						if( lowerBand > 6.49532 )
							if( lowerBand <= 6.62103 )
								if( midLine <= 9.98623 )
									ret := -0.958333 // sell
								if( midLine > 9.98623 )
									ret := -0.625000
							if( lowerBand > 6.62103 )
								ret := -0.428571
					if( wvf > 9.94581 )
						if( Color_con1 <= -2.49878 )
							if( sDev <= 4.63617 )
								if( sDev <= 3.90027 )
									ret := -0.166667
								if( sDev > 3.90027 )
									ret := 0.837838 // buy
							if( sDev > 4.63617 )
								if( upperBand <= 15.0204 )
									ret := -0.336735
								if( upperBand > 15.0204 )
									ret := 0.224490
						if( Color_con1 > -2.49878 )
							if( Color_con2 <= 0.525796 )
								if( sDev <= 4.45122 )
									ret := 0.717949 // buy
								if( sDev > 4.45122 )
									ret := 0.964912 // buy
							if( Color_con2 > 0.525796 )
								if( upperBand <= 13.148 )
									ret := 0.862500 // buy
								if( upperBand > 13.148 )
									ret := 0.025773
			if( lowerBand > 6.65416 )
				if( wvf <= 11.0154 )
					if( lowerBand <= 7.33254 )
						if( Color_con2 <= -2.37324 )
							if( midLine <= 10.4956 )
								ret := -0.200000
							if( midLine > 10.4956 )
								ret := 0.846154 // buy
						if( Color_con2 > -2.37324 )
							if( Color_con2 <= -1.55511 )
								ret := 1.000000 // buy
							if( Color_con2 > -1.55511 )
								if( Color_con1 <= -3.62337 )
									ret := 0.916667 // buy
								if( Color_con1 > -3.62337 )
									ret := 0.214286
					if( lowerBand > 7.33254 )
						if( Color_con2 <= -2.86678 )
							ret := 0.142857
						if( Color_con2 > -2.86678 )
							ret := -0.500000
				if( wvf > 11.0154 )
					if( wvf <= 11.9402 )
						ret := 1.000000 // buy
					if( wvf > 11.9402 )
						ret := 0.833333 // buy
		if( upperBand > 15.2623 )
			if( Color_con1 <= -5.70677 )
				if( midLine <= 10.527 )
					if( sDev <= 5.96692 )
						if( Color_con2 <= -3.92467 )
							if( upperBand <= 15.8644 )
								if( sDev <= 5.76837 )
									ret := -0.766667 // sell
								if( sDev > 5.76837 )
									ret := -1.000000 // sell
							if( upperBand > 15.8644 )
								ret := -0.181818
						if( Color_con2 > -3.92467 )
							if( wvf <= 7.5207 )
								ret := 0.636364
							if( wvf > 7.5207 )
								if( Color_con1 <= -6.71736 )
									ret := -0.750000 // sell
								if( Color_con1 > -6.71736 )
									ret := -0.545455
					if( sDev > 5.96692 )
						if( midLine <= 8.4488 )
							if( sDev <= 7.42888 )
								if( Color_con1 <= -11.8244 )
									ret := -0.846154 // sell
								if( Color_con1 > -11.8244 )
									ret := -0.882353 // sell
							if( sDev > 7.42888 )
								ret := -0.700000 // sell
						if( midLine > 8.4488 )
							if( wvf <= 10.0314 )
								if( upperBand <= 18.7476 )
									ret := -0.155080
								if( upperBand > 18.7476 )
									ret := -0.714286 // sell
							if( wvf > 10.0314 )
								if( sDev <= 8.34666 )
									ret := -0.753247 // sell
								if( sDev > 8.34666 )
									ret := 0.111111
				if( midLine > 10.527 )
					if( wvf <= 1.74173 )
						ret := 0.909091 // buy
					if( wvf > 1.74173 )
						if( lowerBand <= 12.2071 )
							if( upperBand <= 34.0038 )
								if( sDev <= 4.23364 )
									ret := -0.959184 // sell
								if( sDev > 4.23364 )
									ret := -0.063107
							if( upperBand > 34.0038 )
								if( sDev <= 20.9262 )
									ret := -0.939189 // sell
								if( sDev > 20.9262 )
									ret := 1.000000 // buy
						if( lowerBand > 12.2071 )
							if( lowerBand <= 13.4744 )
								ret := 0.846154 // buy
							if( lowerBand > 13.4744 )
								ret := 1.000000 // buy
			if( Color_con1 > -5.70677 )
				if( sDev <= 4.57565 )
					if( Color_con1 <= -5.42689 )
						ret := 0.250000
					if( Color_con1 > -5.42689 )
						if( midLine <= 15.2195 )
							if( midLine <= 12.1626 )
								if( upperBand <= 15.6251 )
									ret := 0.166667
								if( upperBand > 15.6251 )
									ret := -0.590909
							if( midLine > 12.1626 )
								if( lowerBand <= 10.9755 )
									ret := -1.000000 // sell
								if( lowerBand > 10.9755 )
									ret := -0.714286 // sell
						if( midLine > 15.2195 )
							ret := 0.470588
				if( sDev > 4.57565 )
					if( Color_con1 <= -2.54849 )
						if( lowerBand <= 4.26289 )
							if( upperBand <= 16.027 )
								if( upperBand <= 15.5176 )
									ret := 0.406250
								if( upperBand > 15.5176 )
									ret := -0.234375
							if( upperBand > 16.027 )
								if( sDev <= 11.6271 )
									ret := 0.638037
								if( sDev > 11.6271 )
									ret := -0.200000
						if( lowerBand > 4.26289 )
							if( midLine <= 14.1341 )
								if( upperBand <= 20.1783 )
									ret := 0.213115
								if( upperBand > 20.1783 )
									ret := -0.765957 // sell
							if( midLine > 14.1341 )
								ret := 0.666667
					if( Color_con1 > -2.54849 )
						if( sDev <= 7.24425 )
							if( lowerBand <= 6.1096 )
								if( midLine <= 10.5656 )
									ret := 0.866667 // buy
								if( midLine > 10.5656 )
									ret := 0.400000
							if( lowerBand > 6.1096 )
								if( sDev <= 4.90851 )
									ret := 0.900000 // buy
								if( sDev > 4.90851 )
									ret := 1.000000 // buy
						if( sDev > 7.24425 )
							if( Color_con2 <= 5.58209 )
								if( lowerBand <= 1.05685 )
									ret := -0.818182 // sell
								if( lowerBand > 1.05685 )
									ret := -0.250000
							if( Color_con2 > 5.58209 )
								if( midLine <= 11.4417 )
									ret := 0.978723 // buy
								if( midLine > 11.4417 )
									ret := 0.040000
	
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
float op_operation = decision_tree_0_AVAXUSDT_30Min_34e8c5b9(rangeHigh, rangeLow, midLine, sDev, lowerBand, wvf, Color_con1, colInt, Color_con2, upperBand)

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


