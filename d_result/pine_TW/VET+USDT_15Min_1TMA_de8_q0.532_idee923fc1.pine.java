//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: TMA_Overlay
// ID_model: VETUSDT_15Min_1TMA_ee923fc1 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_VETUSDT_15Min_1TMA_ee923fc1", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_VETUSDT_15Min_ee923fc1(bullishEngulfingInt, smma2, ema2, smma4, smma1, bullSigInt, bearishEngulfingInt, bearSigInt, smma3)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ema2 <= 0.022589 )
		if( smma1 <= 0.021626 )
			if( smma2 <= 0.014968 )
				if( smma4 <= 0.015046 )
					if( ema2 <= 0.015025 )
						if( smma2 <= 0.014955 )
							ret := 1.000000 // buy
						if( smma2 > 0.014955 )
							ret := 0.882353 // buy
					if( ema2 > 0.015025 )
						ret := 0.555556
				if( smma4 > 0.015046 )
					if( ema2 <= 0.015154 )
						if( smma4 <= 0.015511 )
							if( smma2 <= 0.014785 )
								if( ema2 <= 0.014792 )
									ret := 0.545455
								if( ema2 > 0.014792 )
									ret := 0.966667 // buy
							if( smma2 > 0.014785 )
								if( ema2 <= 0.014732 )
									ret := 0.618182
								if( ema2 > 0.014732 )
									ret := 0.248588
						if( smma4 > 0.015511 )
							ret := -0.600000
					if( ema2 > 0.015154 )
						if( smma3 <= 0.014973 )
							ret := -0.100000
						if( smma3 > 0.014973 )
							if( smma1 <= 0.01493 )
								ret := -0.785714 // sell
							if( smma1 > 0.01493 )
								ret := -0.555556
			if( smma2 > 0.014968 )
				if( smma2 <= 0.015314 )
					if( smma1 <= 0.015225 )
						if( smma2 <= 0.015152 )
							if( ema2 <= 0.01474 )
								if( smma2 <= 0.015032 )
									ret := 1.000000 // buy
								if( smma2 > 0.015032 )
									ret := 0.625000
							if( ema2 > 0.01474 )
								if( smma3 <= 0.015072 )
									ret := -0.354545
								if( smma3 > 0.015072 )
									ret := -0.035714
						if( smma2 > 0.015152 )
							if( smma4 <= 0.015748 )
								if( smma3 <= 0.015354 )
									ret := -0.840000 // sell
								if( smma3 > 0.015354 )
									ret := -0.250000
							if( smma4 > 0.015748 )
								ret := -1.000000 // sell
					if( smma1 > 0.015225 )
						if( smma1 <= 0.015357 )
							if( smma4 <= 0.015081 )
								ret := 1.000000 // buy
							if( smma4 > 0.015081 )
								ret := 0.461538
						if( smma1 > 0.015357 )
							if( smma3 <= 0.015157 )
								ret := 0.000000
							if( smma3 > 0.015157 )
								ret := 0.916667 // buy
				if( smma2 > 0.015314 )
					if( smma3 <= 0.015485 )
						if( bullishEngulfingInt <= 0.5 )
							if( bearishEngulfingInt <= 0.5 )
								if( smma2 <= 0.015689 )
									ret := -0.054945
								if( smma2 > 0.015689 )
									ret := 0.934783 // buy
							if( bearishEngulfingInt > 0.5 )
								ret := 0.769231 // buy
						if( bullishEngulfingInt > 0.5 )
							ret := 0.705882 // buy
					if( smma3 > 0.015485 )
						if( smma4 <= 0.020395 )
							if( smma3 <= 0.019668 )
								if( smma4 <= 0.019389 )
									ret := 0.037999
								if( smma4 > 0.019389 )
									ret := -0.063851
							if( smma3 > 0.019668 )
								if( smma3 <= 0.019679 )
									ret := -0.490000
								if( smma3 > 0.019679 )
									ret := -0.099124
						if( smma4 > 0.020395 )
							if( smma1 <= 0.019766 )
								if( smma4 <= 0.020622 )
									ret := 0.073171
								if( smma4 > 0.020622 )
									ret := -0.772414 // sell
							if( smma1 > 0.019766 )
								if( ema2 <= 0.019766 )
									ret := 0.790598 // buy
								if( ema2 > 0.019766 )
									ret := 0.068987
		if( smma1 > 0.021626 )
			if( smma1 <= 0.0228 )
				if( ema2 <= 0.021919 )
					if( smma3 <= 0.023986 )
						if( ema2 <= 0.021142 )
							if( smma1 <= 0.021812 )
								if( smma4 <= 0.024398 )
									ret := -0.820000 // sell
								if( smma4 > 0.024398 )
									ret := -0.058824
							if( smma1 > 0.021812 )
								if( smma1 <= 0.022261 )
									ret := 0.685714
								if( smma1 > 0.022261 )
									ret := -1.000000 // sell
						if( ema2 > 0.021142 )
							if( smma3 <= 0.021028 )
								ret := -1.000000 // sell
							if( smma3 > 0.021028 )
								if( smma4 <= 0.021591 )
									ret := 0.553571
								if( smma4 > 0.021591 )
									ret := 0.266908
					if( smma3 > 0.023986 )
						if( ema2 <= 0.021156 )
							ret := -0.500000
						if( ema2 > 0.021156 )
							if( smma2 <= 0.023296 )
								ret := -1.000000 // sell
							if( smma2 > 0.023296 )
								ret := -0.941176 // sell
				if( ema2 > 0.021919 )
					if( ema2 <= 0.022556 )
						if( bearishEngulfingInt <= 0.5 )
							if( smma2 <= 0.02173 )
								if( smma3 <= 0.021552 )
									ret := -0.187817
								if( smma3 > 0.021552 )
									ret := -0.680556
							if( smma2 > 0.02173 )
								if( smma3 <= 0.022194 )
									ret := 0.308213
								if( smma3 > 0.022194 )
									ret := 0.036116
						if( bearishEngulfingInt > 0.5 )
							if( ema2 <= 0.0222 )
								if( smma1 <= 0.022212 )
									ret := -0.109489
								if( smma1 > 0.022212 )
									ret := 0.690476
							if( ema2 > 0.0222 )
								if( smma2 <= 0.022174 )
									ret := 0.744681 // buy
								if( smma2 > 0.022174 )
									ret := 0.355372
					if( ema2 > 0.022556 )
						if( bearishEngulfingInt <= 0.5 )
							if( smma2 <= 0.022438 )
								if( smma4 <= 0.022415 )
									ret := 0.818182 // buy
								if( smma4 > 0.022415 )
									ret := 0.292683
							if( smma2 > 0.022438 )
								if( smma1 <= 0.022777 )
									ret := 0.148387
								if( smma1 > 0.022777 )
									ret := 0.900000 // buy
						if( bearishEngulfingInt > 0.5 )
							if( smma2 <= 0.022455 )
								ret := -0.214286
							if( smma2 > 0.022455 )
								ret := 0.235294
			if( smma1 > 0.0228 )
				if( smma4 <= 0.024754 )
					if( ema2 <= 0.022582 )
						if( smma4 <= 0.023842 )
							if( smma4 <= 0.02381 )
								if( smma2 <= 0.023508 )
									ret := 0.613527
								if( smma2 > 0.023508 )
									ret := -0.555556
							if( smma4 > 0.02381 )
								ret := -0.857143 // sell
						if( smma4 > 0.023842 )
							if( ema2 <= 0.022405 )
								ret := 0.687500
							if( ema2 > 0.022405 )
								if( ema2 <= 0.022559 )
									ret := 0.988506 // buy
								if( ema2 > 0.022559 )
									ret := 0.739130 // buy
					if( ema2 > 0.022582 )
						if( smma4 <= 0.023677 )
							ret := -0.666667
						if( smma4 > 0.023677 )
							ret := 0.230769
				if( smma4 > 0.024754 )
					if( smma4 <= 0.02519 )
						if( smma1 <= 0.022938 )
							ret := -0.888889 // sell
						if( smma1 > 0.022938 )
							if( smma2 <= 0.023759 )
								if( smma3 <= 0.024085 )
									ret := 0.307692
								if( smma3 > 0.024085 )
									ret := -0.550000
							if( smma2 > 0.023759 )
								ret := 1.000000 // buy
					if( smma4 > 0.02519 )
						if( smma4 <= 0.025496 )
							ret := 0.833333 // buy
						if( smma4 > 0.025496 )
							ret := 1.000000 // buy
	if( ema2 > 0.022589 )
		if( smma1 <= 0.049938 )
			if( smma4 <= 0.051191 )
				if( ema2 <= 0.048731 )
					if( smma1 <= 0.048766 )
						if( bullishEngulfingInt <= 0.5 )
							if( smma4 <= 0.047025 )
								if( smma2 <= 0.044563 )
									ret := -0.013451
								if( smma2 > 0.044563 )
									ret := -0.155198
							if( smma4 > 0.047025 )
								if( ema2 <= 0.046534 )
									ret := 0.339050
								if( ema2 > 0.046534 )
									ret := 0.005140
						if( bullishEngulfingInt > 0.5 )
							if( smma4 <= 0.024511 )
								if( smma2 <= 0.024286 )
									ret := -0.034526
								if( smma2 > 0.024286 )
									ret := 0.279310
							if( smma4 > 0.024511 )
								if( smma4 <= 0.026278 )
									ret := -0.398148
								if( smma4 > 0.026278 )
									ret := -0.091148
					if( smma1 > 0.048766 )
						if( bullSigInt <= 0.5 )
							if( smma3 <= 0.04904 )
								ret := 0.184049
							if( smma3 > 0.04904 )
								if( smma3 <= 0.049274 )
									ret := 0.903614 // buy
								if( smma3 > 0.049274 )
									ret := 0.672269
						if( bullSigInt > 0.5 )
							ret := -0.708333 // sell
				if( ema2 > 0.048731 )
					if( smma3 <= 0.048814 )
						if( smma1 <= 0.048669 )
							if( smma4 <= 0.048768 )
								if( smma2 <= 0.046451 )
									ret := -0.878788 // sell
								if( smma2 > 0.046451 )
									ret := -0.173077
							if( smma4 > 0.048768 )
								ret := -1.000000 // sell
						if( smma1 > 0.048669 )
							if( bearSigInt <= 0.5 )
								if( smma4 <= 0.048127 )
									ret := 0.033223
								if( smma4 > 0.048127 )
									ret := 0.716129 // buy
							if( bearSigInt > 0.5 )
								if( smma2 <= 0.048491 )
									ret := -1.000000 // sell
								if( smma2 > 0.048491 )
									ret := -0.357143
					if( smma3 > 0.048814 )
						if( smma2 <= 0.049413 )
							if( smma2 <= 0.049325 )
								if( smma3 <= 0.049028 )
									ret := -0.613497
								if( smma3 > 0.049028 )
									ret := -0.339535
							if( smma2 > 0.049325 )
								if( smma2 <= 0.04937 )
									ret := -0.978723 // sell
								if( smma2 > 0.04937 )
									ret := -0.790698 // sell
						if( smma2 > 0.049413 )
							if( ema2 <= 0.049286 )
								if( bearishEngulfingInt <= 0.5 )
									ret := -0.642857
								if( bearishEngulfingInt > 0.5 )
									ret := -0.333333
							if( ema2 > 0.049286 )
								if( smma4 <= 0.049068 )
									ret := 0.518519
								if( smma4 > 0.049068 )
									ret := -0.191489
			if( smma4 > 0.051191 )
				if( smma2 <= 0.050333 )
					ret := -0.800000 // sell
				if( smma2 > 0.050333 )
					ret := -1.000000 // sell
		if( smma1 > 0.049938 )
			if( smma1 <= 0.050533 )
				if( smma1 <= 0.050117 )
					if( ema2 <= 0.050123 )
						if( smma2 <= 0.049764 )
							if( smma1 <= 0.049998 )
								ret := -1.000000 // sell
							if( smma1 > 0.049998 )
								ret := -0.800000 // sell
						if( smma2 > 0.049764 )
							ret := -0.560000
					if( ema2 > 0.050123 )
						if( smma2 <= 0.049462 )
							ret := -1.000000 // sell
						if( smma2 > 0.049462 )
							ret := 0.611111
				if( smma1 > 0.050117 )
					if( smma3 <= 0.04956 )
						if( ema2 <= 0.050457 )
							if( smma4 <= 0.048687 )
								ret := -0.500000
							if( smma4 > 0.048687 )
								ret := 0.125000
						if( ema2 > 0.050457 )
							if( smma4 <= 0.048439 )
								ret := -0.500000
							if( smma4 > 0.048439 )
								ret := -1.000000 // sell
					if( smma3 > 0.04956 )
						if( smma3 <= 0.04957 )
							ret := -0.900000 // sell
						if( smma3 > 0.04957 )
							if( smma1 <= 0.050417 )
								ret := -1.000000 // sell
							if( smma1 > 0.050417 )
								ret := -0.933333 // sell
			if( smma1 > 0.050533 )
				if( smma3 <= 0.049276 )
					if( smma3 <= 0.048996 )
						ret := 0.875000 // buy
					if( smma3 > 0.048996 )
						if( smma1 <= 0.050856 )
							ret := 1.000000 // buy
						if( smma1 > 0.050856 )
							if( ema2 <= 0.051189 )
								ret := -0.333333
							if( ema2 > 0.051189 )
								ret := 0.916667 // buy
				if( smma3 > 0.049276 )
					if( smma4 <= 0.049408 )
						if( smma2 <= 0.050504 )
							ret := -1.000000 // sell
						if( smma2 > 0.050504 )
							if( smma1 <= 0.053209 )
								ret := -0.764706 // sell
							if( smma1 > 0.053209 )
								ret := -1.000000 // sell
					if( smma4 > 0.049408 )
						if( smma3 <= 0.050496 )
							if( smma1 <= 0.052958 )
								ret := 1.000000 // buy
							if( smma1 > 0.052958 )
								ret := 0.777778 // buy
						if( smma3 > 0.050496 )
							if( ema2 <= 0.052533 )
								if( smma3 <= 0.05169 )
									ret := -0.600000
								if( smma3 > 0.05169 )
									ret := 0.250000
							if( ema2 > 0.052533 )
								ret := -0.894737 // sell
	
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
float op_operation = decision_tree_0_VETUSDT_15Min_ee923fc1(bullishEngulfingInt, smma2, ema2, smma4, smma1, bullSigInt, bearishEngulfingInt, bearSigInt, smma3)

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


