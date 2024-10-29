//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: TMA_Overlay
// ID_model: NVDA_30Min_1TMA_29813fcc Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVDA_30Min_1TMA_29813fcc", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVDA_30Min_29813fcc(bullishEngulfingInt, smma4, bullSigInt, smma2, ema2, bearSigInt, bearishEngulfingInt, smma3, smma1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( smma4 <= 104.279 )
		if( smma2 <= 111.236 )
			if( smma4 <= 27.9259 )
				if( ema2 <= 30.0834 )
					if( bullishEngulfingInt <= 0.5 )
						if( ema2 <= 27.6062 )
							if( smma3 <= 26.8017 )
								if( ema2 <= 25.2962 )
									ret := 1.000000 // buy
								if( ema2 > 25.2962 )
									ret := 0.796875 // buy
							if( smma3 > 26.8017 )
								if( ema2 <= 25.0355 )
									ret := 1.000000 // buy
								if( ema2 > 25.0355 )
									ret := -0.166667
						if( ema2 > 27.6062 )
							if( smma4 <= 27.5148 )
								if( smma4 <= 27.451 )
									ret := -0.200000
								if( smma4 > 27.451 )
									ret := 0.200000
							if( smma4 > 27.5148 )
								if( ema2 <= 30.0118 )
									ret := 1.000000 // buy
								if( ema2 > 30.0118 )
									ret := 0.750000 // buy
					if( bullishEngulfingInt > 0.5 )
						ret := 0.000000
				if( ema2 > 30.0834 )
					if( smma4 <= 27.8139 )
						ret := 0.000000
					if( smma4 > 27.8139 )
						ret := 0.250000
			if( smma4 > 27.9259 )
				if( ema2 <= 26.8943 )
					if( ema2 <= 25.6816 )
						if( smma3 <= 27.0746 )
							ret := -1.000000 // sell
						if( smma3 > 27.0746 )
							if( smma1 <= 26.3526 )
								if( smma2 <= 26.7253 )
									ret := 0.733333 // buy
								if( smma2 > 26.7253 )
									ret := 0.900000 // buy
							if( smma1 > 26.3526 )
								if( ema2 <= 25.3707 )
									ret := 0.000000
								if( ema2 > 25.3707 )
									ret := -0.875000 // sell
					if( ema2 > 25.6816 )
						if( smma4 <= 29.4246 )
							if( smma2 <= 26.4958 )
								if( smma4 <= 28.0921 )
									ret := -0.600000
								if( smma4 > 28.0921 )
									ret := -0.250000
							if( smma2 > 26.4958 )
								if( bearishEngulfingInt <= 0.5 )
									ret := -0.970588 // sell
								if( bearishEngulfingInt > 0.5 )
									ret := -0.600000
						if( smma4 > 29.4246 )
							if( smma3 <= 29.1736 )
								ret := 1.000000 // buy
							if( smma3 > 29.1736 )
								ret := 0.250000
				if( ema2 > 26.8943 )
					if( smma1 <= 106.576 )
						if( smma3 <= 28.6342 )
							if( smma2 <= 28.3146 )
								if( smma4 <= 29.2055 )
									ret := 0.555556
								if( smma4 > 29.2055 )
									ret := 0.930233 // buy
							if( smma2 > 28.3146 )
								if( smma1 <= 28.6791 )
									ret := 0.133333
								if( smma1 > 28.6791 )
									ret := 0.674419
						if( smma3 > 28.6342 )
							if( smma4 <= 29.3826 )
								if( smma4 <= 28.8052 )
									ret := 0.390244
								if( smma4 > 28.8052 )
									ret := -0.463768
							if( smma4 > 29.3826 )
								if( smma3 <= 104.29 )
									ret := 0.121752
								if( smma3 > 104.29 )
									ret := 0.691358
					if( smma1 > 106.576 )
						if( smma2 <= 106.39 )
							if( smma2 <= 105.152 )
								ret := 0.000000
							if( smma2 > 105.152 )
								if( smma4 <= 101.149 )
									ret := 0.948276 // buy
								if( smma4 > 101.149 )
									ret := 0.600000
						if( smma2 > 106.39 )
							if( smma2 <= 106.826 )
								if( smma1 <= 108.256 )
									ret := 0.083333
								if( smma1 > 108.256 )
									ret := -0.842105 // sell
							if( smma2 > 106.826 )
								if( smma3 <= 108.071 )
									ret := 0.698113
								if( smma3 > 108.071 )
									ret := -0.296296
		if( smma2 > 111.236 )
			if( smma4 <= 103.035 )
				if( smma1 <= 116.033 )
					if( smma2 <= 112.33 )
						ret := 0.000000
					if( smma2 > 112.33 )
						ret := -0.500000
				if( smma1 > 116.033 )
					ret := -1.000000 // sell
			if( smma4 > 103.035 )
				ret := -1.000000 // sell
	if( smma4 > 104.279 )
		if( smma3 <= 104.082 )
			if( smma1 <= 101.882 )
				if( smma3 <= 103.287 )
					if( smma2 <= 100.432 )
						if( smma2 <= 99.9882 )
							ret := -0.500000
						if( smma2 > 99.9882 )
							if( smma4 <= 104.576 )
								ret := -1.000000 // sell
							if( smma4 > 104.576 )
								ret := -0.666667
					if( smma2 > 100.432 )
						if( ema2 <= 98.551 )
							if( ema2 <= 98.1582 )
								ret := 0.250000
							if( ema2 > 98.1582 )
								ret := 0.000000
						if( ema2 > 98.551 )
							if( smma4 <= 104.351 )
								ret := -0.400000
							if( smma4 > 104.351 )
								if( smma4 <= 105.376 )
									ret := -1.000000 // sell
								if( smma4 > 105.376 )
									ret := -0.750000 // sell
				if( smma3 > 103.287 )
					if( smma3 <= 103.753 )
						if( ema2 <= 100.682 )
							if( smma2 <= 102.3 )
								ret := 0.000000
							if( smma2 > 102.3 )
								ret := -0.500000
						if( ema2 > 100.682 )
							ret := -1.000000 // sell
					if( smma3 > 103.753 )
						if( ema2 <= 100.931 )
							ret := 0.500000
						if( ema2 > 100.931 )
							ret := 0.000000
			if( smma1 > 101.882 )
				ret := -1.000000 // sell
		if( smma3 > 104.082 )
			if( smma1 <= 101.633 )
				if( smma4 <= 106.616 )
					if( ema2 <= 100.069 )
						if( smma2 <= 103.172 )
							ret := 1.000000 // buy
						if( smma2 > 103.172 )
							ret := 0.000000
					if( ema2 > 100.069 )
						if( smma2 <= 102.733 )
							ret := 0.000000
						if( smma2 > 102.733 )
							if( smma4 <= 105.348 )
								ret := -0.166667
							if( smma4 > 105.348 )
								ret := -0.800000 // sell
				if( smma4 > 106.616 )
					if( smma4 <= 108.595 )
						if( smma4 <= 108.016 )
							if( smma1 <= 101.406 )
								ret := 1.000000 // buy
							if( smma1 > 101.406 )
								ret := 0.750000 // buy
						if( smma4 > 108.016 )
							ret := 0.000000
					if( smma4 > 108.595 )
						if( smma2 <= 103.293 )
							if( smma1 <= 101.366 )
								if( smma4 <= 110.901 )
									ret := 1.000000 // buy
								if( smma4 > 110.901 )
									ret := 0.714286 // buy
							if( smma1 > 101.366 )
								ret := 0.250000
						if( smma2 > 103.293 )
							if( ema2 <= 101.811 )
								ret := 1.000000 // buy
							if( ema2 > 101.811 )
								ret := 0.833333 // buy
			if( smma1 > 101.633 )
				if( smma3 <= 325.203 )
					if( smma1 <= 328.443 )
						if( smma2 <= 163.17 )
							if( smma2 <= 105.831 )
								if( ema2 <= 103.096 )
									ret := 0.108808
								if( ema2 > 103.096 )
									ret := -0.315920
							if( smma2 > 105.831 )
								if( smma4 <= 439.153 )
									ret := 0.071311
								if( smma4 > 439.153 )
									ret := 0.552632
						if( smma2 > 163.17 )
							if( ema2 <= 156.509 )
								if( smma4 <= 166.098 )
									ret := 0.222222
								if( smma4 > 166.098 )
									ret := -0.708661 // sell
							if( ema2 > 156.509 )
								if( smma1 <= 322.632 )
									ret := 0.012304
								if( smma1 > 322.632 )
									ret := 0.510345
					if( smma1 > 328.443 )
						if( ema2 <= 344.58 )
							if( smma1 <= 328.897 )
								if( smma1 <= 328.673 )
									ret := -0.500000
								if( smma1 > 328.673 )
									ret := -0.500000
							if( smma1 > 328.897 )
								if( ema2 <= 332.148 )
									ret := -0.937500 // sell
								if( ema2 > 332.148 )
									ret := -0.750000 // sell
						if( ema2 > 344.58 )
							if( ema2 <= 383.567 )
								if( smma2 <= 326.642 )
									ret := 0.833333 // buy
								if( smma2 > 326.642 )
									ret := 0.000000
							if( ema2 > 383.567 )
								if( ema2 <= 390.909 )
									ret := -0.722222 // sell
								if( ema2 > 390.909 )
									ret := -1.000000 // sell
				if( smma3 > 325.203 )
					if( smma1 <= 415.965 )
						if( smma4 <= 408.7 )
							if( ema2 <= 338.235 )
								if( smma3 <= 348.965 )
									ret := 1.000000 // buy
								if( smma3 > 348.965 )
									ret := 0.750000 // buy
							if( ema2 > 338.235 )
								if( smma3 <= 412.134 )
									ret := 0.116257
								if( smma3 > 412.134 )
									ret := -0.857143 // sell
						if( smma4 > 408.7 )
							if( smma3 <= 748.101 )
								if( smma2 <= 416.996 )
									ret := 0.275618
								if( smma2 > 416.996 )
									ret := 0.612245
							if( smma3 > 748.101 )
								if( smma4 <= 928.268 )
									ret := -0.727273 // sell
								if( smma4 > 928.268 )
									ret := 0.090909
					if( smma1 > 415.965 )
						if( smma3 <= 413.407 )
							if( smma4 <= 393.236 )
								if( smma3 <= 400.44 )
									ret := -0.571429
								if( smma3 > 400.44 )
									ret := 0.102041
							if( smma4 > 393.236 )
								if( smma1 <= 417.081 )
									ret := -0.300000
								if( smma1 > 417.081 )
									ret := -0.741071 // sell
						if( smma3 > 413.407 )
							if( smma3 <= 418.884 )
								if( smma2 <= 419.477 )
									ret := 0.040000
								if( smma2 > 419.477 )
									ret := 0.598639
							if( smma3 > 418.884 )
								if( smma3 <= 1167.83 )
									ret := 0.053540
								if( smma3 > 1167.83 )
									ret := -0.958333 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator TMA_Overlay 
//@version=5
//indicator "TMA Overlay", shorttitle="TMA Overlay", overlay=true)

// ### Four Smoothed Moving Averages

len1 = 21
src1 = close
smma1 = 0.0
sma_1 = ta.sma(src1, len1)
smma1 := na(smma1[1]) ? sma_1 : (smma1[1] * (len1 - 1) + src1) / len1
plot(smma1, color=color.white, linewidth=2, title="21 SMMA")

len2 = 50
src2 = close
smma2 = 0.0
sma_2 = ta.sma(src2, len2)
smma2 := na(smma2[1]) ? sma_2 : (smma2[1] * (len2 - 1) + src2) / len2
plot(smma2, color=color.rgb(106, 255, 0), linewidth=2, title="50 SMMA")

h100 = input.bool(true, title="Show 100 Line", group="Smoothed MA Inputs")
len3 = 100
src3 = close
smma3 = 0.0
sma_3 = ta.sma(src3, len3)
smma3 := na(smma3[1]) ? sma_3 : (smma3[1] * (len3 - 1) + src3) / len3
sma3plot = plot(h100 ? smma3 : na, color=color.yellow, linewidth=2, title="100 SMMA")

len4 = 200
src4 = close
smma4 = 0.0
sma_4 = ta.sma(src4, len4)
smma4 := na(smma4[1]) ? sma_4 : (smma4[1] * (len4 - 1) + src4) / len4
sma4plot = plot(smma4, color=color.rgb(255, 5, 0), linewidth=2, title="200 SMMA")

// Trend Fill

trendFill = input.bool(true, title="Show Trend Fill", group="Smoothed MA Inputs")
ema2 = ta.ema(close, 2)
ema2plot = plot(ema2, color=color.new(color.rgb(46, 204, 113), 100), style=plot.style_line, linewidth=1, title="EMA(2)", editable=false)

fill(ema2plot, sma4plot, color=ema2 > smma4 and trendFill ? color.green : ema2 < smma4 and trendFill ? color.red : na, title="Trend Fill")

// End ###

// ### 3 Line Strike

bearS = input.bool(true, title="Show Bearish 3 Line Strike", group="3 Line Strike")
bullS = input.bool(true, title="Show Bullish 3 Line Strike", group="3 Line Strike")

bearSig = close[3] > open[3] and close[2] > open[2] and close[1] > open[1] and close < open[1]
bullSig = close[3] < open[3] and close[2] < open[2] and close[1] < open[1] and close > open[1]

plotshape(bullS ? bullSig : na, style=shape.triangleup, color=color.green, location=location.belowbar, size=size.small, text="3s-Bull", title="3 Line Strike Up")
plotshape(bearS ? bearSig : na, style=shape.triangledown, color=color.red, location=location.abovebar, size=size.small, text="3s-Bear", title="3 Line Strike Down")

// End ###

// ### Engulfing Candles

bearE = input.bool(true, title="Show Bearish Big A$$ Candles", group="Big A$$ Candles")
bullE = input.bool(true, title="Show Bullish Big A$$ Candles", group="Big A$$ Candles")

openBarPrevious = open[1]
closeBarPrevious = close[1]
openBarCurrent = open
closeBarCurrent = close

bullishEngulfing = openBarCurrent <= closeBarPrevious and openBarCurrent < openBarPrevious and closeBarCurrent > openBarPrevious
bearishEngulfing = openBarCurrent >= closeBarPrevious and openBarCurrent > openBarPrevious and closeBarCurrent < openBarPrevious

plotshape(bullE ? bullishEngulfing : na, style=shape.triangleup, location=location.belowbar, color=color.green, size=size.tiny, title="Big Ass Candle Up")
plotshape(bearE ? bearishEngulfing : na, style=shape.triangledown, location=location.abovebar, color=color.red, size=size.tiny, title="Big Ass Candle Down")

alertcondition(bullishEngulfing, title="Bullish Engulfing", message="[CurrencyPair] [TimeFrame], Bullish candle engulfing previous candle")
alertcondition(bearishEngulfing, title="Bearish Engulfing", message="[CurrencyPair] [TimeFrame], Bearish candle engulfing previous candle")

// End ###

// ### Trading Session

ts = input.bool(true, title="Show Trade Session", group="Trade Session")

tz = input.string(defval="America/Chicago", title="Timezone", options=["Asia/Sydney", "Asia/Tokyo", "Europe/Frankfurt", "Europe/London", "UTC", "America/New_York", "America/Chicago"], group="Trade Session")
label = input.string(defval="CME Open", title="Label", tooltip="For easy identification", group="Trade Session")

startHour = input.int(defval=7, minval=0, maxval=23, title="analysis Start hour", group="Trade Session")
startMinute = input.int(defval=0, minval=0, maxval=59, title="analysis Start minute", group="Trade Session")

startHour2 = input.int(defval=8, minval=0, maxval=23, title="Session Start hour", group="Trade Session")
startMinute2 = input.int(defval=30, minval=0, maxval=59, title="Session Start minute", group="Trade Session")
endHour2 = input.int(defval=12, minval=0, maxval=23, title="Session End hour", group="Trade Session")
endMinute2 = input.int(defval=0, minval=0, maxval=59, title="Session End minute", group="Trade Session")

rangeColor = input.color(defval=color.new(color.rgb(25, 118, 210), 31), title="Color", group="Trade Session")
showMon = input.bool(true, title="Monday", group="Trade Session")
showTue = input.bool(true, title="Tuesday", group="Trade Session")
showWed = input.bool(true, title="Wednesday", group="Trade Session")
showThu = input.bool(true, title="Thursday", group="Trade Session")
showFri = input.bool(true, title="Friday", group="Trade Session")
showSat = input.bool(false, title="Saturday", group="Trade Session")
showSun = input.bool(false, title="Sunday", group="Trade Session")

tzYear = year(time(tz))
tzMonth = month(time(tz))
tzDay = dayofmonth(time(tz))
tzDayOfWeek = dayofweek(time(tz))
startTime = timestamp(tz, tzYear, tzMonth, tzDay, startHour, startMinute)
endTime = timestamp(tz, tzYear, tzMonth, tzDay, endHour2, endMinute2)

active = if startTime <= time and time <= endTime and ts
    if tzDayOfWeek == dayofweek.monday and showMon
        true
    else if tzDayOfWeek == dayofweek.tuesday and showTue
        true
    else if tzDayOfWeek == dayofweek.wednesday and showWed
        true
    else if tzDayOfWeek == dayofweek.thursday and showThu
        true
    else if tzDayOfWeek == dayofweek.friday and showFri
        true
    else if tzDayOfWeek == dayofweek.saturday and showSat
        true
    else if tzDayOfWeek == dayofweek.sunday and showSun
        true
    else
        false
else
    false

bgcolor(color=active ? rangeColor : na, title="Session Background")

startTime2 = timestamp(tz, tzYear, tzMonth, tzDay, startHour2, startMinute2)
endTime2 = timestamp(tz, tzYear, tzMonth, tzDay, endHour2, endMinute2)

active2 = if startTime2 <= time and time <= endTime2 and ts
    if tzDayOfWeek == dayofweek.monday and showMon
        true
    else if tzDayOfWeek == dayofweek.tuesday and showTue
        true
    else if tzDayOfWeek == dayofweek.wednesday and showWed
        true
    else if tzDayOfWeek == dayofweek.thursday and showThu
        true
    else if tzDayOfWeek == dayofweek.friday and showFri
        true
    else if tzDayOfWeek == dayofweek.saturday and showSat
        true
    else if tzDayOfWeek == dayofweek.sunday and showSun
        true
    else
        false
else
    false

bgcolor(color=active2 ? rangeColor : na, title="Session Background")

bullSigInt = bullSig ? 1: 0   //Bool to int
bearSigInt = bearSig ? 1: 0   //Bool to int
bullishEngulfingInt = bullishEngulfing ? 1: 0   //Bool to int
bearishEngulfingInt = bearishEngulfing ? 1: 0   //Bool to int


// End ###

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
float op_operation = decision_tree_0_NVDA_30Min_29813fcc(bullishEngulfingInt, smma4, bullSigInt, smma2, ema2, bearSigInt, bearishEngulfingInt, smma3, smma1)

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


