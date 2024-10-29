//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: TMA_Overlay
// ID_model: UBER_15Min_1TMA_db9868b6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UBER_15Min_1TMA_db9868b6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UBER_15Min_db9868b6(smma2, smma4, smma3, ema2, bearSigInt, bullSigInt, smma1, bearishEngulfingInt, bullishEngulfingInt)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( smma3 <= 21.466 )
		if( smma3 <= 21.197 )
			if( smma4 <= 22.3747 )
				if( ema2 <= 23.6556 )
					if( smma3 <= 20.1591 )
						if( smma4 <= 21.0116 )
							if( smma3 <= 18.3649 )
								if( smma4 <= 20.7793 )
									ret := 1.000000 // buy
								if( smma4 > 20.7793 )
									ret := 0.593750
							if( smma3 > 18.3649 )
								if( smma4 <= 20.7374 )
									ret := 1.000000 // buy
								if( smma4 > 20.7374 )
									ret := -0.034884
						if( smma4 > 21.0116 )
							if( smma1 <= 19.082 )
								if( smma2 <= 16.906 )
									ret := -0.684211
								if( smma2 > 16.906 )
									ret := 0.279412
							if( smma1 > 19.082 )
								if( smma4 <= 21.0542 )
									ret := -1.000000 // sell
								if( smma4 > 21.0542 )
									ret := -0.450000
					if( smma3 > 20.1591 )
						if( smma2 <= 20.9411 )
							if( smma3 <= 20.2245 )
								if( ema2 <= 20.5618 )
									ret := 1.000000 // buy
								if( ema2 > 20.5618 )
									ret := 0.500000
							if( smma3 > 20.2245 )
								if( ema2 <= 21.2783 )
									ret := 0.833333 // buy
								if( ema2 > 21.2783 )
									ret := -1.000000 // sell
						if( smma2 > 20.9411 )
							if( smma1 <= 22.1473 )
								if( smma2 <= 21.1746 )
									ret := 0.923077 // buy
								if( smma2 > 21.1746 )
									ret := 1.000000 // buy
							if( smma1 > 22.1473 )
								if( ema2 <= 23.5659 )
									ret := 0.636364
								if( ema2 > 23.5659 )
									ret := 0.800000 // buy
				if( ema2 > 23.6556 )
					if( smma1 <= 21.0544 )
						ret := -0.818182 // sell
					if( smma1 > 21.0544 )
						ret := -1.000000 // sell
			if( smma4 > 22.3747 )
				if( ema2 <= 17.6103 )
					if( smma3 <= 20.3206 )
						if( smma1 <= 17.7895 )
							ret := -0.800000 // sell
						if( smma1 > 17.7895 )
							ret := -1.000000 // sell
					if( smma3 > 20.3206 )
						ret := 0.687500
				if( ema2 > 17.6103 )
					ret := -1.000000 // sell
		if( smma3 > 21.197 )
			if( smma4 <= 22.975 )
				if( smma3 <= 21.2206 )
					ret := 0.900000 // buy
				if( smma3 > 21.2206 )
					if( smma1 <= 21.2138 )
						if( smma4 <= 22.1101 )
							if( smma1 <= 20.8666 )
								if( smma4 <= 21.6466 )
									ret := 0.777778 // buy
								if( smma4 > 21.6466 )
									ret := 0.269231
							if( smma1 > 20.8666 )
								if( ema2 <= 20.9266 )
									ret := 0.033333
								if( ema2 > 20.9266 )
									ret := -0.375000
						if( smma4 > 22.1101 )
							ret := 0.804878 // buy
					if( smma1 > 21.2138 )
						ret := 0.651376
			if( smma4 > 22.975 )
				ret := -0.916667 // sell
	if( smma3 > 21.466 )
		if( ema2 <= 31.4108 )
			if( bearishEngulfingInt <= 0.5 )
				if( smma1 <= 31.4973 )
					if( ema2 <= 30.9712 )
						if( bearSigInt <= 0.5 )
							if( smma4 <= 24.8243 )
								if( smma4 <= 24.255 )
									ret := -0.005026
								if( smma4 > 24.255 )
									ret := -0.321377
							if( smma4 > 24.8243 )
								if( smma4 <= 25.3355 )
									ret := 0.261564
								if( smma4 > 25.3355 )
									ret := 0.022872
						if( bearSigInt > 0.5 )
							if( smma4 <= 25.3388 )
								if( ema2 <= 22.8967 )
									ret := -0.800000 // sell
								if( ema2 > 22.8967 )
									ret := -0.100000
							if( smma4 > 25.3388 )
								if( smma4 <= 31.9555 )
									ret := 0.203883
								if( smma4 > 31.9555 )
									ret := 0.923077 // buy
					if( ema2 > 30.9712 )
						if( smma4 <= 31.2391 )
							if( smma2 <= 31.2667 )
								if( smma3 <= 30.167 )
									ret := 0.429412
								if( smma3 > 30.167 )
									ret := -0.039604
							if( smma2 > 31.2667 )
								if( smma3 <= 31.1948 )
									ret := 0.777778 // buy
								if( smma3 > 31.1948 )
									ret := 0.428571
						if( smma4 > 31.2391 )
							if( smma4 <= 31.8177 )
								if( smma4 <= 31.3302 )
									ret := -0.197802
								if( smma4 > 31.3302 )
									ret := -0.714286 // sell
							if( smma4 > 31.8177 )
								if( ema2 <= 30.9789 )
									ret := -0.913043 // sell
								if( ema2 > 30.9789 )
									ret := -0.227011
				if( smma1 > 31.4973 )
					if( smma1 <= 31.6654 )
						if( smma3 <= 31.9012 )
							if( ema2 <= 31.3771 )
								if( smma4 <= 32.0261 )
									ret := 0.693878
								if( smma4 > 32.0261 )
									ret := 1.000000 // buy
							if( ema2 > 31.3771 )
								if( smma2 <= 31.4373 )
									ret := 0.933333 // buy
								if( smma2 > 31.4373 )
									ret := 0.100000
						if( smma3 > 31.9012 )
							if( smma3 <= 31.9897 )
								if( ema2 <= 31.2536 )
									ret := 0.066667
								if( ema2 > 31.2536 )
									ret := -1.000000 // sell
							if( smma3 > 31.9897 )
								if( smma3 <= 32.3963 )
									ret := 0.784091 // buy
								if( smma3 > 32.3963 )
									ret := 0.246154
					if( smma1 > 31.6654 )
						if( smma2 <= 32.0624 )
							if( ema2 <= 31.2423 )
								if( smma1 <= 31.6869 )
									ret := 0.090909
								if( smma1 > 31.6869 )
									ret := 0.886076 // buy
							if( ema2 > 31.2423 )
								if( smma4 <= 32.2729 )
									ret := -0.403846
								if( smma4 > 32.2729 )
									ret := 0.931034 // buy
						if( smma2 > 32.0624 )
							if( smma4 <= 31.7039 )
								if( smma1 <= 32.4385 )
									ret := 1.000000 // buy
								if( smma1 > 32.4385 )
									ret := 0.857143 // buy
							if( smma4 > 31.7039 )
								if( smma3 <= 34.0728 )
									ret := -0.199396
								if( smma3 > 34.0728 )
									ret := 0.716667 // buy
			if( bearishEngulfingInt > 0.5 )
				if( smma4 <= 21.8291 )
					if( smma1 <= 22.1573 )
						ret := -0.125000
					if( smma1 > 22.1573 )
						ret := -0.964286 // sell
				if( smma4 > 21.8291 )
					if( smma2 <= 23.475 )
						if( smma3 <= 23.1412 )
							if( smma1 <= 21.8369 )
								if( ema2 <= 21.3824 )
									ret := 0.384615
								if( ema2 > 21.3824 )
									ret := 0.850000 // buy
							if( smma1 > 21.8369 )
								if( smma4 <= 22.5361 )
									ret := 0.536585
								if( smma4 > 22.5361 )
									ret := -0.073171
						if( smma3 > 23.1412 )
							if( smma1 <= 23.2831 )
								if( smma1 <= 22.5063 )
									ret := 1.000000 // buy
								if( smma1 > 22.5063 )
									ret := 0.333333
							if( smma1 > 23.2831 )
								ret := 1.000000 // buy
					if( smma2 > 23.475 )
						if( smma4 <= 32.0444 )
							if( smma1 <= 27.2528 )
								if( ema2 <= 26.4445 )
									ret := -0.037736
								if( ema2 > 26.4445 )
									ret := -0.313253
							if( smma1 > 27.2528 )
								if( smma2 <= 27.9702 )
									ret := 0.459596
								if( smma2 > 27.9702 )
									ret := 0.182249
						if( smma4 > 32.0444 )
							if( ema2 <= 30.4523 )
								if( ema2 <= 30.0002 )
									ret := -0.117647
								if( ema2 > 30.0002 )
									ret := 0.692308
							if( ema2 > 30.4523 )
								if( smma4 <= 32.5899 )
									ret := -0.820513 // sell
								if( smma4 > 32.5899 )
									ret := 0.241379
		if( ema2 > 31.4108 )
			if( smma4 <= 29.7531 )
				if( smma4 <= 28.9065 )
					if( smma4 <= 28.3007 )
						if( smma4 <= 27.193 )
							ret := 0.161290
						if( smma4 > 27.193 )
							if( smma1 <= 31.7737 )
								ret := -0.232558
							if( smma1 > 31.7737 )
								if( smma3 <= 30.0854 )
									ret := -0.916667 // sell
								if( smma3 > 30.0854 )
									ret := -0.615385
					if( smma4 > 28.3007 )
						if( smma1 <= 30.7235 )
							ret := -0.857143 // sell
						if( smma1 > 30.7235 )
							if( smma1 <= 32.0291 )
								if( smma4 <= 28.5098 )
									ret := 1.000000 // buy
								if( smma4 > 28.5098 )
									ret := 0.777778 // buy
							if( smma1 > 32.0291 )
								ret := 0.333333
				if( smma4 > 28.9065 )
					if( ema2 <= 31.5479 )
						if( smma3 <= 30.4368 )
							if( smma3 <= 30.237 )
								if( smma2 <= 30.3039 )
									ret := -0.533333
								if( smma2 > 30.3039 )
									ret := -0.111111
							if( smma3 > 30.237 )
								ret := 0.818182 // buy
						if( smma3 > 30.4368 )
							ret := -0.666667
					if( ema2 > 31.5479 )
						if( smma2 <= 30.9937 )
							if( smma1 <= 31.4254 )
								if( smma3 <= 30.1022 )
									ret := -0.916667 // sell
								if( smma3 > 30.1022 )
									ret := -0.391304
							if( smma1 > 31.4254 )
								if( smma2 <= 30.8332 )
									ret := 0.777778 // buy
								if( smma2 > 30.8332 )
									ret := 0.076923
						if( smma2 > 30.9937 )
							if( smma3 <= 30.9419 )
								ret := -1.000000 // sell
							if( smma3 > 30.9419 )
								if( smma2 <= 31.9171 )
									ret := -0.793103 // sell
								if( smma2 > 31.9171 )
									ret := -0.333333
			if( smma4 > 29.7531 )
				if( smma1 <= 31.4355 )
					if( smma3 <= 30.326 )
						if( smma1 <= 31.059 )
							if( smma1 <= 30.6613 )
								ret := -0.153846
							if( smma1 > 30.6613 )
								if( smma1 <= 30.9087 )
									ret := -0.600000
								if( smma1 > 30.9087 )
									ret := -1.000000 // sell
						if( smma1 > 31.059 )
							ret := 0.375000
					if( smma3 > 30.326 )
						if( ema2 <= 31.479 )
							if( smma3 <= 30.846 )
								ret := 0.647059
							if( smma3 > 30.846 )
								if( smma2 <= 31.0379 )
									ret := -0.300000
								if( smma2 > 31.0379 )
									ret := -0.791667 // sell
						if( ema2 > 31.479 )
							if( smma2 <= 30.6016 )
								if( ema2 <= 31.8831 )
									ret := 0.596154
								if( ema2 > 31.8831 )
									ret := -1.000000 // sell
							if( smma2 > 30.6016 )
								if( smma2 <= 31.287 )
									ret := 0.420513
								if( smma2 > 31.287 )
									ret := 0.736842 // buy
				if( smma1 > 31.4355 )
					if( smma4 <= 79.3383 )
						if( smma1 <= 31.8399 )
							if( smma3 <= 31.3604 )
								if( smma4 <= 31.0049 )
									ret := 0.299595
								if( smma4 > 31.0049 )
									ret := -0.184358
							if( smma3 > 31.3604 )
								if( smma4 <= 33.9327 )
									ret := -0.352295
								if( smma4 > 33.9327 )
									ret := 0.411765
						if( smma1 > 31.8399 )
							if( smma3 <= 39.4149 )
								if( ema2 <= 40.6878 )
									ret := -0.027387
								if( ema2 > 40.6878 )
									ret := -0.548736
							if( smma3 > 39.4149 )
								if( smma2 <= 40.4716 )
									ret := 0.177289
								if( smma2 > 40.4716 )
									ret := -0.002936
					if( smma4 > 79.3383 )
						if( smma2 <= 79.8799 )
							if( ema2 <= 79.0223 )
								ret := 0.000000
							if( ema2 > 79.0223 )
								if( smma1 <= 79.7931 )
									ret := -0.545455
								if( smma1 > 79.7931 )
									ret := -1.000000 // sell
						if( smma2 > 79.8799 )
							if( smma3 <= 82.0771 )
								ret := 0.181818
							if( smma3 > 82.0771 )
								ret := 0.000000
	
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
float op_operation = decision_tree_0_UBER_15Min_db9868b6(smma2, smma4, smma3, ema2, bearSigInt, bullSigInt, smma1, bearishEngulfingInt, bullishEngulfingInt)

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


