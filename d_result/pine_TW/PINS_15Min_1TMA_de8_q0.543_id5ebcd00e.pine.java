//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: TMA_Overlay
// ID_model: PINS_15Min_1TMA_5ebcd00e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PINS_15Min_1TMA_5ebcd00e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PINS_15Min_5ebcd00e(bullishEngulfingInt, smma4, bullSigInt, smma2, ema2, bearSigInt, bearishEngulfingInt, smma3, smma1)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=0.7, min_samples_leaf=7,min_samples_split=10, random_state=843828734)
	if( ema2 <= 24.8105 )
		if( smma3 <= 12.1797 )
			if( ema2 <= 12.4409 )
				if( ema2 <= 11.3783 )
					ret := 0.777778 // buy
				if( ema2 > 11.3783 )
					ret := 1.000000 // buy
			if( ema2 > 12.4409 )
				ret := -0.050000
		if( smma3 > 12.1797 )
			if( smma4 <= 13.0248 )
				if( smma3 <= 12.3242 )
					if( ema2 <= 12.6511 )
						if( smma2 <= 12.2495 )
							ret := 0.454545
						if( smma2 > 12.2495 )
							ret := 1.000000 // buy
					if( ema2 > 12.6511 )
						ret := -0.933333 // sell
				if( smma3 > 12.3242 )
					if( smma2 <= 12.7672 )
						if( ema2 <= 13.3661 )
							if( smma1 <= 12.554 )
								if( smma3 <= 12.3361 )
									ret := 1.000000 // buy
								if( smma3 > 12.3361 )
									ret := 0.545455
							if( smma1 > 12.554 )
								ret := 1.000000 // buy
						if( ema2 > 13.3661 )
							if( smma4 <= 12.9793 )
								ret := 0.100000
							if( smma4 > 12.9793 )
								ret := 0.500000
					if( smma2 > 12.7672 )
						if( smma1 <= 13.233 )
							ret := 1.000000 // buy
						if( smma1 > 13.233 )
							ret := 0.900000 // buy
			if( smma4 > 13.0248 )
				if( smma2 <= 16.5364 )
					if( smma4 <= 15.3484 )
						if( ema2 <= 15.2443 )
							if( smma3 <= 13.5027 )
								if( ema2 <= 12.2317 )
									ret := 0.139344
								if( ema2 > 12.2317 )
									ret := -0.446281
							if( smma3 > 13.5027 )
								if( smma3 <= 14.864 )
									ret := 0.420048
								if( smma3 > 14.864 )
									ret := -0.809524 // sell
						if( ema2 > 15.2443 )
							if( smma3 <= 15.5314 )
								if( smma3 <= 14.7787 )
									ret := -0.729412 // sell
								if( smma3 > 14.7787 )
									ret := -0.290541
							if( smma3 > 15.5314 )
								if( ema2 <= 16.6872 )
									ret := 0.944444 // buy
								if( ema2 > 16.6872 )
									ret := 0.090909
					if( smma4 > 15.3484 )
						if( smma4 <= 16.1958 )
							if( ema2 <= 11.9427 )
								ret := 0.230769
							if( ema2 > 11.9427 )
								if( smma2 <= 16.5104 )
									ret := -0.980952 // sell
								if( smma2 > 16.5104 )
									ret := -0.846154 // sell
						if( smma4 > 16.1958 )
							if( ema2 <= 12.7657 )
								ret := 1.000000 // buy
							if( ema2 > 12.7657 )
								if( smma1 <= 13.4566 )
									ret := 0.730769 // buy
								if( smma1 > 13.4566 )
									ret := -0.597015
				if( smma2 > 16.5364 )
					if( smma4 <= 18.4562 )
						if( smma4 <= 16.8688 )
							if( smma1 <= 16.9315 )
								if( smma2 <= 16.8532 )
									ret := 0.693694
								if( smma2 > 16.8532 )
									ret := -0.043478
							if( smma1 > 16.9315 )
								if( smma4 <= 16.6743 )
									ret := -0.305677
								if( smma4 > 16.6743 )
									ret := 0.097087
						if( smma4 > 16.8688 )
							if( ema2 <= 18.5122 )
								if( ema2 <= 18.3124 )
									ret := 0.437500
								if( ema2 > 18.3124 )
									ret := 0.912000 // buy
							if( ema2 > 18.5122 )
								if( ema2 <= 19.6546 )
									ret := 0.052356
								if( ema2 > 19.6546 )
									ret := 0.740385 // buy
					if( smma4 > 18.4562 )
						if( ema2 <= 17.5544 )
							if( smma1 <= 17.4216 )
								if( ema2 <= 16.3186 )
									ret := 0.921569 // buy
								if( ema2 > 16.3186 )
									ret := -0.160194
							if( smma1 > 17.4216 )
								if( smma3 <= 19.3829 )
									ret := 0.353846
								if( smma3 > 19.3829 )
									ret := 0.738854 // buy
						if( ema2 > 17.5544 )
							if( smma1 <= 17.6627 )
								if( ema2 <= 17.7496 )
									ret := 0.477273
								if( ema2 > 17.7496 )
									ret := 0.898305 // buy
							if( smma1 > 17.6627 )
								if( smma1 <= 18.6895 )
									ret := -0.073219
								if( smma1 > 18.6895 )
									ret := 0.087979
	if( ema2 > 24.8105 )
		if( ema2 <= 85.6498 )
			if( ema2 <= 25.5466 )
				if( smma2 <= 25.0188 )
					if( smma1 <= 24.8595 )
						if( smma4 <= 24.3679 )
							if( ema2 <= 25.2579 )
								if( smma2 <= 24.5658 )
									ret := -0.219512
								if( smma2 > 24.5658 )
									ret := -0.712121 // sell
							if( ema2 > 25.2579 )
								ret := 0.916667 // buy
						if( smma4 > 24.3679 )
							if( smma2 <= 24.8432 )
								if( smma2 <= 24.692 )
									ret := 0.095070
								if( smma2 > 24.692 )
									ret := 0.517241
							if( smma2 > 24.8432 )
								if( smma4 <= 25.9816 )
									ret := -0.862069 // sell
								if( smma4 > 25.9816 )
									ret := 0.090909
					if( smma1 > 24.8595 )
						if( smma2 <= 24.4758 )
							if( smma4 <= 23.2793 )
								ret := 0.615385
							if( smma4 > 23.2793 )
								ret := 1.000000 // buy
						if( smma2 > 24.4758 )
							if( ema2 <= 25.1934 )
								if( smma3 <= 24.9018 )
									ret := 0.503311
								if( smma3 > 24.9018 )
									ret := -0.027027
							if( ema2 > 25.1934 )
								if( smma1 <= 25.0349 )
									ret := 0.359551
								if( smma1 > 25.0349 )
									ret := -0.246377
				if( smma2 > 25.0188 )
					if( smma1 <= 25.4766 )
						if( smma4 <= 26.5931 )
							if( ema2 <= 25.3516 )
								if( smma4 <= 25.9742 )
									ret := -0.205448
								if( smma4 > 25.9742 )
									ret := 0.111111
							if( ema2 > 25.3516 )
								if( smma1 <= 25.4065 )
									ret := -0.671233
								if( smma1 > 25.4065 )
									ret := -0.071429
						if( smma4 > 26.5931 )
							if( smma1 <= 25.4554 )
								if( ema2 <= 24.9757 )
									ret := -0.931034 // sell
								if( ema2 > 24.9757 )
									ret := -1.000000 // sell
							if( smma1 > 25.4554 )
								if( smma4 <= 26.7085 )
									ret := -1.000000 // sell
								if( smma4 > 26.7085 )
									ret := -0.200000
					if( smma1 > 25.4766 )
						if( smma4 <= 25.855 )
							if( ema2 <= 25.0998 )
								if( smma4 <= 24.2916 )
									ret := -0.250000
								if( smma4 > 24.2916 )
									ret := 0.326087
							if( ema2 > 25.0998 )
								if( smma4 <= 24.1485 )
									ret := -0.880952 // sell
								if( smma4 > 24.1485 )
									ret := -0.244048
						if( smma4 > 25.855 )
							if( smma2 <= 25.992 )
								if( bearishEngulfingInt <= 0.5 )
									ret := 0.444444
								if( bearishEngulfingInt > 0.5 )
									ret := 0.900000 // buy
							if( smma2 > 25.992 )
								if( smma3 <= 26.2716 )
									ret := -0.769231 // sell
								if( smma3 > 26.2716 )
									ret := -0.037879
			if( ema2 > 25.5466 )
				if( smma1 <= 25.8099 )
					if( ema2 <= 26.6024 )
						if( smma4 <= 25.2732 )
							if( smma4 <= 24.6745 )
								if( smma3 <= 25.0005 )
									ret := 0.120301
								if( smma3 > 25.0005 )
									ret := 1.000000 // buy
							if( smma4 > 24.6745 )
								if( smma1 <= 25.2373 )
									ret := 0.000000
								if( smma1 > 25.2373 )
									ret := 0.558659
						if( smma4 > 25.2732 )
							if( smma2 <= 25.6104 )
								if( smma2 <= 25.3506 )
									ret := 0.123288
								if( smma2 > 25.3506 )
									ret := -0.401515
							if( smma2 > 25.6104 )
								if( smma4 <= 26.8475 )
									ret := 0.312102
								if( smma4 > 26.8475 )
									ret := -0.162162
					if( ema2 > 26.6024 )
						if( smma3 <= 23.3329 )
							ret := 0.368421
						if( smma3 > 23.3329 )
							if( smma3 <= 25.4321 )
								ret := 1.000000 // buy
							if( smma3 > 25.4321 )
								ret := 0.809524 // buy
				if( smma1 > 25.8099 )
					if( smma1 <= 84.5808 )
						if( smma4 <= 83.4181 )
							if( smma4 <= 24.7656 )
								if( smma3 <= 23.9284 )
									ret := 0.894737 // buy
								if( smma3 > 23.9284 )
									ret := -0.328488
							if( smma4 > 24.7656 )
								if( smma4 <= 25.719 )
									ret := 0.185472
								if( smma4 > 25.719 )
									ret := 0.029459
						if( smma4 > 83.4181 )
							if( ema2 <= 77.0397 )
								ret := 1.000000 // buy
							if( ema2 > 77.0397 )
								if( smma4 <= 84.3653 )
									ret := -0.924242 // sell
								if( smma4 > 84.3653 )
									ret := -0.687500
					if( smma1 > 84.5808 )
						if( smma1 <= 85.213 )
							if( smma4 <= 81.9989 )
								if( smma4 <= 78.8448 )
									ret := 0.222222
								if( smma4 > 78.8448 )
									ret := 0.864583 // buy
							if( smma4 > 81.9989 )
								ret := 0.090909
						if( smma1 > 85.213 )
							if( smma4 <= 83.6604 )
								if( ema2 <= 84.5785 )
									ret := 0.153846
								if( ema2 > 84.5785 )
									ret := -0.692308
							if( smma4 > 83.6604 )
								if( smma1 <= 85.3867 )
									ret := -0.055556
								if( smma1 > 85.3867 )
									ret := 0.576923
		if( ema2 > 85.6498 )
			if( smma3 <= 79.5338 )
				if( smma1 <= 83.5638 )
					ret := -0.400000
				if( smma1 > 83.5638 )
					ret := -1.000000 // sell
			if( smma3 > 79.5338 )
				if( smma2 <= 81.7791 )
					ret := 0.600000
				if( smma2 > 81.7791 )
					if( smma1 <= 85.0112 )
						if( smma2 <= 82.3901 )
							ret := -0.642857
						if( smma2 > 82.3901 )
							ret := -1.000000 // sell
					if( smma1 > 85.0112 )
						if( smma3 <= 82.8513 )
							if( smma1 <= 85.5428 )
								ret := 0.100000
							if( smma1 > 85.5428 )
								ret := 0.625000
						if( smma3 > 82.8513 )
							if( smma2 <= 87.3149 )
								if( smma4 <= 84.7622 )
									ret := -0.331429
								if( smma4 > 84.7622 )
									ret := -1.000000 // sell
							if( smma2 > 87.3149 )
								ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_PINS_15Min_5ebcd00e(bullishEngulfingInt, smma4, bullSigInt, smma2, ema2, bearSigInt, bearishEngulfingInt, smma3, smma1)

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


