//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: MACD_ULT_MTF
// ID_model: VETUSDT_30Min_1MAC_a1de0a57 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_VETUSDT_30Min_1MAC_a1de0a57", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_VETUSDT_30Min_a1de0a57(histB_IsUpInt, macd, histA_IsDownInt, hist, histB_IsDownInt, macd_IsAboveInt, signal, histA_IsUpInt, macd_IsBelowInt)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=0.7, min_samples_leaf=7,min_samples_split=10, random_state=843828734)
	if( macd <= -0.000218 )
		if( histB_IsDownInt <= 0.5 )
			if( macd <= -0.00108 )
				if( signal <= -0.005057 )
					if( hist <= 0.003545 )
						if( macd <= -0.011557 )
							ret := 1.000000 // buy
						if( macd > -0.011557 )
							if( signal <= -0.006113 )
								if( signal <= -0.007531 )
									ret := 0.555556
								if( signal > -0.007531 )
									ret := -0.818182 // sell
							if( signal > -0.006113 )
								if( hist <= -0.00035 )
									ret := -0.178571
								if( hist > -0.00035 )
									ret := 0.741071 // buy
					if( hist > 0.003545 )
						ret := -1.000000 // sell
				if( signal > -0.005057 )
					if( macd <= -0.001189 )
						if( hist <= 0.000527 )
							if( histA_IsDownInt <= 0.5 )
								if( signal <= -0.004247 )
									ret := -0.428571
								if( signal > -0.004247 )
									ret := 0.031937
							if( histA_IsDownInt > 0.5 )
								if( signal <= -0.002363 )
									ret := -0.484375
								if( signal > -0.002363 )
									ret := 0.446809
						if( hist > 0.000527 )
							if( hist <= 0.00088 )
								if( macd <= -0.001572 )
									ret := -0.269231
								if( macd > -0.001572 )
									ret := -0.781818 // sell
							if( hist > 0.00088 )
								if( macd <= -0.003411 )
									ret := 1.000000 // buy
								if( macd > -0.003411 )
									ret := -0.144231
					if( macd > -0.001189 )
						if( hist <= -0.000339 )
							if( hist <= -0.000563 )
								if( macd <= -0.001149 )
									ret := -1.000000 // sell
								if( macd > -0.001149 )
									ret := -0.800000 // sell
							if( hist > -0.000563 )
								if( macd <= -0.001163 )
									ret := -0.941176 // sell
								if( macd > -0.001163 )
									ret := -0.370370
						if( hist > -0.000339 )
							if( hist <= 9.7e-05 )
								if( hist <= -4.6e-05 )
									ret := -0.058824
								if( hist > -4.6e-05 )
									ret := 0.272727
							if( hist > 9.7e-05 )
								if( macd <= -0.001091 )
									ret := -0.390071
								if( macd > -0.001091 )
									ret := 0.388889
			if( macd > -0.00108 )
				if( hist <= -0.001111 )
					if( signal <= 0.000526 )
						ret := -0.944444 // sell
					if( signal > 0.000526 )
						ret := 0.000000
				if( hist > -0.001111 )
					if( hist <= -0.000284 )
						if( macd <= -0.001014 )
							if( hist <= -0.000434 )
								if( hist <= -0.000519 )
									ret := -0.500000
								if( hist > -0.000519 )
									ret := -1.000000 // sell
							if( hist > -0.000434 )
								ret := 0.000000
						if( macd > -0.001014 )
							if( signal <= -0.000355 )
								if( macd <= -0.000748 )
									ret := 0.510490
								if( macd > -0.000748 )
									ret := 0.806452 // buy
							if( signal > -0.000355 )
								if( signal <= -0.000276 )
									ret := -0.457143
								if( signal > -0.000276 )
									ret := 0.278351
					if( hist > -0.000284 )
						if( histA_IsDownInt <= 0.5 )
							if( signal <= -0.001499 )
								if( signal <= -0.001603 )
									ret := 0.024691
								if( signal > -0.001603 )
									ret := -0.632653
							if( signal > -0.001499 )
								if( hist <= 0.000151 )
									ret := 0.064813
								if( hist > 0.000151 )
									ret := 0.182174
						if( histA_IsDownInt > 0.5 )
							if( hist <= 0.001008 )
								if( macd <= -0.001041 )
									ret := 0.861111 // buy
								if( macd > -0.001041 )
									ret := 0.151387
							if( hist > 0.001008 )
								if( signal <= -0.002359 )
									ret := 0.500000
								if( signal > -0.002359 )
									ret := 1.000000 // buy
		if( histB_IsDownInt > 0.5 )
			if( macd <= -0.003505 )
				if( signal <= -0.003591 )
					if( macd <= -0.00471 )
						if( macd <= -0.006922 )
							ret := -0.400000
						if( macd > -0.006922 )
							if( hist <= -0.00169 )
								ret := 0.416667
							if( hist > -0.00169 )
								if( macd <= -0.005363 )
									ret := 1.000000 // buy
								if( macd > -0.005363 )
									ret := 0.600000
					if( macd > -0.00471 )
						if( macd <= -0.00433 )
							ret := -0.764706 // sell
						if( macd > -0.00433 )
							ret := 0.583333
				if( signal > -0.003591 )
					if( hist <= -0.000499 )
						if( hist <= -0.002344 )
							ret := 0.600000
						if( hist > -0.002344 )
							if( signal <= -0.00242 )
								ret := 1.000000 // buy
							if( signal > -0.00242 )
								ret := 0.833333 // buy
					if( hist > -0.000499 )
						ret := 0.428571
			if( macd > -0.003505 )
				if( hist <= -6.3e-05 )
					if( signal <= -0.002549 )
						if( hist <= -0.000376 )
							ret := -0.842105 // sell
						if( hist > -0.000376 )
							ret := 0.000000
					if( signal > -0.002549 )
						if( signal <= -0.000677 )
							if( macd <= -0.003219 )
								if( macd <= -0.003375 )
									ret := 0.400000
								if( macd > -0.003375 )
									ret := -0.857143 // sell
							if( macd > -0.003219 )
								if( signal <= -0.000686 )
									ret := 0.266742
								if( signal > -0.000686 )
									ret := 0.933333 // buy
						if( signal > -0.000677 )
							if( signal <= -0.000431 )
								if( macd <= -0.000535 )
									ret := -0.036697
								if( macd > -0.000535 )
									ret := -0.833333 // sell
							if( signal > -0.000431 )
								if( macd <= -0.001428 )
									ret := 1.000000 // buy
								if( macd > -0.001428 )
									ret := 0.148352
				if( hist > -6.3e-05 )
					if( hist <= -4.7e-05 )
						if( signal <= -0.000779 )
							if( hist <= -5.5e-05 )
								ret := 1.000000 // buy
							if( hist > -5.5e-05 )
								ret := 0.888889 // buy
						if( signal > -0.000779 )
							if( signal <= -0.000298 )
								if( macd <= -0.00054 )
									ret := 0.615385
								if( macd > -0.00054 )
									ret := 0.148148
							if( signal > -0.000298 )
								if( macd <= -0.000272 )
									ret := 0.711340 // buy
								if( macd > -0.000272 )
									ret := 0.518519
					if( hist > -4.7e-05 )
						if( signal <= -0.00035 )
							if( macd <= -0.000692 )
								if( macd <= -0.000896 )
									ret := -0.361111
								if( macd > -0.000896 )
									ret := 0.793103 // buy
							if( macd > -0.000692 )
								if( macd <= -0.000441 )
									ret := -0.234694
								if( macd > -0.000441 )
									ret := -0.591837
						if( signal > -0.00035 )
							if( macd <= -0.000356 )
								if( hist <= -3.3e-05 )
									ret := 0.461538
								if( hist > -3.3e-05 )
									ret := 1.000000 // buy
							if( macd > -0.000356 )
								if( macd <= -0.000339 )
									ret := -0.666667
								if( macd > -0.000339 )
									ret := 0.367925
	if( macd > -0.000218 )
		if( macd <= 0.002853 )
			if( hist <= -0.000664 )
				if( hist <= -0.001114 )
					if( macd <= 0.000815 )
						if( hist <= -0.001737 )
							ret := 0.058824
						if( hist > -0.001737 )
							if( signal <= 0.001518 )
								ret := -0.285714
							if( signal > 0.001518 )
								if( hist <= -0.001511 )
									ret := -0.857143 // sell
								if( hist > -0.001511 )
									ret := -0.888889 // sell
					if( macd > 0.000815 )
						if( histB_IsDownInt <= 0.5 )
							if( macd <= 0.001912 )
								ret := 0.090909
							if( macd > 0.001912 )
								ret := -0.727273 // sell
						if( histB_IsDownInt > 0.5 )
							if( macd <= 0.002128 )
								if( signal <= 0.003314 )
									ret := 0.888889 // buy
								if( signal > 0.003314 )
									ret := 1.000000 // buy
							if( macd > 0.002128 )
								ret := 0.409091
				if( hist > -0.001114 )
					if( macd <= 0.001333 )
						if( signal <= 0.001179 )
							if( signal <= 0.000914 )
								if( signal <= 0.00084 )
									ret := 0.515625
								if( signal > 0.00084 )
									ret := 0.133333
							if( signal > 0.000914 )
								if( hist <= -0.000776 )
									ret := 1.000000 // buy
								if( hist > -0.000776 )
									ret := 0.818182 // buy
						if( signal > 0.001179 )
							if( macd <= 0.000473 )
								ret := -0.916667 // sell
							if( macd > 0.000473 )
								if( histB_IsUpInt <= 0.5 )
									ret := 0.116071
								if( histB_IsUpInt > 0.5 )
									ret := 0.596774
					if( macd > 0.001333 )
						if( macd <= 0.002212 )
							if( signal <= 0.002551 )
								if( macd <= 0.00148 )
									ret := 0.647059
								if( macd > 0.00148 )
									ret := 0.903226 // buy
							if( signal > 0.002551 )
								if( signal <= 0.002671 )
									ret := 0.000000
								if( signal > 0.002671 )
									ret := 0.617647
						if( macd > 0.002212 )
							if( signal <= 0.003145 )
								ret := 1.000000 // buy
							if( signal > 0.003145 )
								ret := 0.888889 // buy
			if( hist > -0.000664 )
				if( histA_IsDownInt <= 0.5 )
					if( signal <= -0.000203 )
						if( hist <= 0.000224 )
							if( signal <= -0.000248 )
								if( macd <= -0.000186 )
									ret := -0.508850
								if( macd > -0.000186 )
									ret := -0.196850
							if( signal > -0.000248 )
								if( macd <= -4.7e-05 )
									ret := 0.002618
								if( macd > -4.7e-05 )
									ret := -0.560606
						if( hist > 0.000224 )
							if( macd <= 0.000152 )
								if( macd <= 3.1e-05 )
									ret := 0.063232
								if( macd > 3.1e-05 )
									ret := 0.404580
							if( macd > 0.000152 )
								if( macd <= 0.000206 )
									ret := -0.823529 // sell
								if( macd > 0.000206 )
									ret := -0.047872
					if( signal > -0.000203 )
						if( hist <= -8.7e-05 )
							if( signal <= -7.7e-05 )
								if( hist <= -0.000114 )
									ret := -0.185185
								if( hist > -0.000114 )
									ret := 0.500000
							if( signal > -7.7e-05 )
								if( signal <= 0.002716 )
									ret := 0.067466
								if( signal > 0.002716 )
									ret := -0.406250
						if( hist > -8.7e-05 )
							if( signal <= -0.000141 )
								if( hist <= 3.3e-05 )
									ret := 0.137213
								if( hist > 3.3e-05 )
									ret := 0.017361
							if( signal > -0.000141 )
								if( signal <= -9.6e-05 )
									ret := -0.072917
								if( signal > -9.6e-05 )
									ret := 0.018335
				if( histA_IsDownInt > 0.5 )
					if( hist <= 0.001135 )
						if( hist <= 0.001069 )
							if( macd <= 7.1e-05 )
								if( macd <= -5e-05 )
									ret := 0.075828
								if( macd > -5e-05 )
									ret := -0.019940
							if( macd > 7.1e-05 )
								if( macd <= 0.00012 )
									ret := 0.165232
								if( macd > 0.00012 )
									ret := 0.072968
						if( hist > 0.001069 )
							ret := -0.761905 // sell
					if( hist > 0.001135 )
						if( hist <= 0.00188 )
							if( macd <= 0.000501 )
								ret := 0.076923
							if( macd > 0.000501 )
								if( signal <= 0.000464 )
									ret := 1.000000 // buy
								if( signal > 0.000464 )
									ret := 0.857143 // buy
						if( hist > 0.00188 )
							if( macd <= 0.001625 )
								ret := 0.153846
							if( macd > 0.001625 )
								ret := 0.400000
		if( macd > 0.002853 )
			if( hist <= 0.001124 )
				if( macd <= 0.005318 )
					if( hist <= -0.000721 )
						if( signal <= 0.004542 )
							ret := 0.583333
						if( signal > 0.004542 )
							if( macd <= 0.003884 )
								ret := -0.307692
							if( macd > 0.003884 )
								if( macd <= 0.004286 )
									ret := -0.894737 // sell
								if( macd > 0.004286 )
									ret := -1.000000 // sell
					if( hist > -0.000721 )
						if( macd <= 0.003935 )
							if( macd_IsBelowInt <= 0.5 )
								if( macd <= 0.003211 )
									ret := -0.290598
								if( macd > 0.003211 )
									ret := -0.726562 // sell
							if( macd_IsBelowInt > 0.5 )
								if( hist <= -0.000339 )
									ret := 0.750000 // buy
								if( hist > -0.000339 )
									ret := -0.478261
						if( macd > 0.003935 )
							if( hist <= -0.000316 )
								if( hist <= -0.000382 )
									ret := 0.264706
								if( hist > -0.000382 )
									ret := -0.857143 // sell
							if( hist > -0.000316 )
								if( macd <= 0.004825 )
									ret := 0.782609 // buy
								if( macd > 0.004825 )
									ret := 0.192308
				if( macd > 0.005318 )
					if( hist <= -0.002298 )
						ret := 0.000000
					if( hist > -0.002298 )
						if( signal <= 0.005293 )
							ret := -1.000000 // sell
						if( signal > 0.005293 )
							if( macd <= 0.007072 )
								ret := -0.307692
							if( macd > 0.007072 )
								if( macd <= 0.010684 )
									ret := -1.000000 // sell
								if( macd > 0.010684 )
									ret := -0.500000
			if( hist > 0.001124 )
				if( signal <= 0.003004 )
					if( hist <= 0.001853 )
						if( signal <= 0.00182 )
							ret := 0.916667 // buy
						if( signal > 0.00182 )
							if( histA_IsUpInt <= 0.5 )
								ret := 0.230769
							if( histA_IsUpInt > 0.5 )
								ret := -0.785714 // sell
					if( hist > 0.001853 )
						if( signal <= 0.001933 )
							ret := -0.600000
						if( signal > 0.001933 )
							ret := -1.000000 // sell
				if( signal > 0.003004 )
					if( macd <= 0.011863 )
						if( hist <= 0.001973 )
							if( macd <= 0.005009 )
								ret := 0.888889 // buy
							if( macd > 0.005009 )
								ret := -0.333333
						if( hist > 0.001973 )
							if( macd <= 0.007454 )
								ret := 0.333333
							if( macd > 0.007454 )
								ret := 1.000000 // buy
					if( macd > 0.011863 )
						ret := -0.272727
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator MACD_ULT_MTF 
//@version=5
//indicator title="CM_MacD_Ult_MTF", shorttitle="CM_Ult_MacD_MTF", overlay=false)

source = close
useCurrentRes = input(true, title="Use Current Chart Resolution?")
resCustom = input.timeframe(title="Use Different Timeframe? Uncheck Box Above", defval="60")
smd = input(true, title="Show MacD & Signal Line? Also Turn Off Dots Below")
sd = input(true, title="Show Dots When MacD Crosses Signal Line?")
sh = input(true, title="Show Histogram?")
macd_colorChange = input(true,title="Change MacD Line Color-Signal Line Cross?")
hist_colorChange = input(true,title="MacD Histogram 4 Colors?")

res = useCurrentRes ? timeframe.period : resCustom

fastLength = input.int(12, minval=1)
slowLength = input.int(26, minval=1)
signalLength = input.int(9, minval=1)

fastMA = ta.ema(source, fastLength)
slowMA = ta.ema(source, slowLength)

macd = fastMA - slowMA
signal = ta.sma(macd, signalLength)
hist = macd - signal

outMacD = request.security(syminfo.tickerid, res, macd)
outSignal = request.security(syminfo.tickerid, res, signal)
outHist = request.security(syminfo.tickerid, res, hist)

histA_IsUp = outHist > outHist[1] and outHist > 0
histA_IsDown = outHist < outHist[1] and outHist > 0
histB_IsDown = outHist < outHist[1] and outHist <= 0
histB_IsUp = outHist > outHist[1] and outHist <= 0

// MacD Color Definitions
macd_IsAbove = outMacD >= outSignal
macd_IsBelow = outMacD < outSignal

plot_color = hist_colorChange ? histA_IsUp ? color.aqua : histA_IsDown ? color.blue : histB_IsDown ? color.red : histB_IsUp ? color.maroon : color.yellow : color.gray
macd_color = macd_colorChange ? macd_IsAbove ? color.lime : color.red : color.red
signal_color = macd_colorChange ? macd_IsAbove ? color.yellow : color.yellow : color.lime

circleYPosition = outSignal

plot(smd and outMacD ? outMacD : na, title="MACD", color=macd_color, linewidth=4)
plot(smd and outSignal ? outSignal : na, title="Signal Line", color=signal_color, style=plot.style_line, linewidth=2)
plot(sh and outHist ? outHist : na, title="Histogram", color=plot_color, style=plot.style_histogram, linewidth=4)
plot(sd and ta.cross(outMacD, outSignal) ? circleYPosition : na, title="Cross", style=plot.style_circles, linewidth=4, color=macd_color)
hline(0, '0 Line', linestyle=hline.style_solid, linewidth=2, color=color.white)

histA_IsUpInt = histA_IsUp ? 1: 0
histA_IsDownInt = histA_IsDown ? 1: 0
histB_IsDownInt = histB_IsDown ? 1: 0
histB_IsUpInt = histB_IsUp ? 1: 0
macd_IsAboveInt = macd_IsAbove ? 1: 0
macd_IsBelowInt = macd_IsBelow ? 1: 0

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
float op_operation = decision_tree_0_VETUSDT_30Min_a1de0a57(histB_IsUpInt, macd, histA_IsDownInt, hist, histB_IsDownInt, macd_IsAboveInt, signal, histA_IsUpInt, macd_IsBelowInt)

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


