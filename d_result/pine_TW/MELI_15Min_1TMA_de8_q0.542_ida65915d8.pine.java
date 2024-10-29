//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: TMA_Overlay
// ID_model: MELI_15Min_1TMA_a65915d8 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MELI_15Min_1TMA_a65915d8", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MELI_15Min_a65915d8(bullishEngulfingInt, smma4, bullSigInt, smma2, ema2, bearSigInt, bearishEngulfingInt, smma3, smma1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( bullishEngulfingInt <= 0.5 )
		if( smma3 <= 258.082 )
			if( ema2 <= 243.473 )
				if( smma1 <= 171.245 )
					if( ema2 <= 157.724 )
						if( smma2 <= 157.766 )
							if( smma2 <= 157.297 )
								if( smma4 <= 156.853 )
									ret := 0.404580
								if( smma4 > 156.853 )
									ret := -0.056338
							if( smma2 > 157.297 )
								if( smma1 <= 155.5 )
									ret := 1.000000 // buy
								if( smma1 > 155.5 )
									ret := 0.666667
						if( smma2 > 157.766 )
							if( smma1 <= 157.944 )
								ret := 0.000000
							if( smma1 > 157.944 )
								ret := -0.285714
					if( ema2 > 157.724 )
						if( smma1 <= 160.061 )
							if( ema2 <= 159.285 )
								if( smma2 <= 156.947 )
									ret := -0.310345
								if( smma2 > 156.947 )
									ret := -0.835294 // sell
							if( ema2 > 159.285 )
								if( smma2 <= 157.758 )
									ret := 0.055556
								if( smma2 > 157.758 )
									ret := -0.275000
						if( smma1 > 160.061 )
							if( smma4 <= 158.283 )
								if( ema2 <= 165.12 )
									ret := 0.166667
								if( ema2 > 165.12 )
									ret := 0.666667
							if( smma4 > 158.283 )
								if( smma1 <= 163.485 )
									ret := -0.563636
								if( smma1 > 163.485 )
									ret := 0.000000
				if( smma1 > 171.245 )
					if( ema2 <= 235.598 )
						if( ema2 <= 231.522 )
							if( smma3 <= 234.574 )
								if( ema2 <= 220.385 )
									ret := 0.121243
								if( ema2 > 220.385 )
									ret := 0.429787
							if( smma3 > 234.574 )
								if( smma2 <= 232.329 )
									ret := -0.883333 // sell
								if( smma2 > 232.329 )
									ret := 0.112500
						if( ema2 > 231.522 )
							if( smma3 <= 230.459 )
								if( smma4 <= 225.7 )
									ret := -0.047619
								if( smma4 > 225.7 )
									ret := -0.750000 // sell
							if( smma3 > 230.459 )
								if( smma2 <= 247.979 )
									ret := 0.651613
								if( smma2 > 247.979 )
									ret := -0.636364
					if( ema2 > 235.598 )
						if( smma1 <= 233.442 )
							if( smma1 <= 232.751 )
								ret := -0.461538
							if( smma1 > 232.751 )
								if( ema2 <= 235.982 )
									ret := -0.909091 // sell
								if( ema2 > 235.982 )
									ret := -1.000000 // sell
						if( smma1 > 233.442 )
							if( smma4 <= 237.961 )
								if( smma1 <= 235.528 )
									ret := -0.133333
								if( smma1 > 235.528 )
									ret := 0.923077 // buy
							if( smma4 > 237.961 )
								if( smma4 <= 241.665 )
									ret := -0.512500
								if( smma4 > 241.665 )
									ret := -0.086826
			if( ema2 > 243.473 )
				if( smma4 <= 241.028 )
					if( smma4 <= 231.268 )
						ret := 1.000000 // buy
					if( smma4 > 231.268 )
						if( smma4 <= 239.648 )
							if( smma3 <= 236.071 )
								ret := 0.900000 // buy
							if( smma3 > 236.071 )
								if( ema2 <= 274.1 )
									ret := 0.586207
								if( ema2 > 274.1 )
									ret := 0.000000
						if( smma4 > 239.648 )
							ret := 1.000000 // buy
				if( smma4 > 241.028 )
					if( smma3 <= 255.691 )
						if( smma1 <= 264.348 )
							if( smma3 <= 243.394 )
								if( smma4 <= 246.613 )
									ret := 0.942308 // buy
								if( smma4 > 246.613 )
									ret := 0.255319
							if( smma3 > 243.394 )
								if( ema2 <= 248.161 )
									ret := -0.777778 // sell
								if( ema2 > 248.161 )
									ret := 0.262931
						if( smma1 > 264.348 )
							if( smma4 <= 248.901 )
								if( smma2 <= 259.262 )
									ret := -0.700000 // sell
								if( smma2 > 259.262 )
									ret := 0.081081
							if( smma4 > 248.901 )
								if( smma2 <= 262.134 )
									ret := -0.967742 // sell
								if( smma2 > 262.134 )
									ret := -0.666667
					if( smma3 > 255.691 )
						ret := 0.615764
		if( smma3 > 258.082 )
			if( ema2 <= 253.947 )
				if( smma3 <= 263.498 )
					if( smma4 <= 268.157 )
						if( smma1 <= 252.547 )
							if( smma1 <= 246.396 )
								if( ema2 <= 235.848 )
									ret := -1.000000 // sell
								if( ema2 > 235.848 )
									ret := -0.777778 // sell
							if( smma1 > 246.396 )
								if( smma2 <= 254.123 )
									ret := 0.066667
								if( smma2 > 254.123 )
									ret := -0.733333 // sell
						if( smma1 > 252.547 )
							if( ema2 <= 252.202 )
								ret := 0.500000
							if( ema2 > 252.202 )
								ret := -0.055556
					if( smma4 > 268.157 )
						ret := -1.000000 // sell
				if( smma3 > 263.498 )
					if( ema2 <= 246.214 )
						if( smma4 <= 267.277 )
							if( smma3 <= 264.139 )
								ret := 0.909091 // buy
							if( smma3 > 264.139 )
								ret := 1.000000 // buy
						if( smma4 > 267.277 )
							ret := 0.545455
					if( ema2 > 246.214 )
						if( smma2 <= 260.198 )
							if( ema2 <= 249.808 )
								if( smma3 <= 264.229 )
									ret := 1.000000 // buy
								if( smma3 > 264.229 )
									ret := 0.500000
							if( ema2 > 249.808 )
								ret := 0.000000
						if( smma2 > 260.198 )
							if( smma1 <= 259.546 )
								if( ema2 <= 250.94 )
									ret := -0.758621 // sell
								if( ema2 > 250.94 )
									ret := -1.000000 // sell
							if( smma1 > 259.546 )
								if( smma1 <= 261.722 )
									ret := 0.333333
								if( smma1 > 261.722 )
									ret := -0.769231 // sell
			if( ema2 > 253.947 )
				if( smma4 <= 1063 )
					if( smma2 <= 1117.7 )
						if( smma3 <= 1068.39 )
							if( bullSigInt <= 0.5 )
								if( smma1 <= 264.053 )
									ret := 0.324190
								if( smma1 > 264.053 )
									ret := -0.001948
							if( bullSigInt > 0.5 )
								if( smma4 <= 871.731 )
									ret := 0.052434
								if( smma4 > 871.731 )
									ret := -0.285714
						if( smma3 > 1068.39 )
							if( smma2 <= 1103.32 )
								if( smma2 <= 1095.66 )
									ret := 0.680000
								if( smma2 > 1095.66 )
									ret := 0.866667 // buy
							if( smma2 > 1103.32 )
								if( smma4 <= 1059.93 )
									ret := 0.000000
								if( smma4 > 1059.93 )
									ret := -0.785714 // sell
					if( smma2 > 1117.7 )
						if( ema2 <= 1211.64 )
							if( smma3 <= 1086.22 )
								if( smma4 <= 1042.25 )
									ret := 0.583333
								if( smma4 > 1042.25 )
									ret := 0.982456 // buy
							if( smma3 > 1086.22 )
								if( smma3 <= 1100.82 )
									ret := 0.291667
								if( smma3 > 1100.82 )
									ret := 0.885714 // buy
						if( ema2 > 1211.64 )
							ret := 0.230769
				if( smma4 > 1063 )
					if( ema2 <= 962.823 )
						if( smma4 <= 1080.29 )
							if( smma2 <= 1016.62 )
								ret := -1.000000 // sell
							if( smma2 > 1016.62 )
								if( ema2 <= 939.725 )
									ret := -0.600000
								if( ema2 > 939.725 )
									ret := -0.942857 // sell
						if( smma4 > 1080.29 )
							ret := -0.555556
					if( ema2 > 962.823 )
						if( ema2 <= 987.74 )
							ret := 0.738095 // buy
						if( ema2 > 987.74 )
							if( ema2 <= 1095.22 )
								if( smma2 <= 1139.45 )
									ret := -0.119980
								if( smma2 > 1139.45 )
									ret := -0.571429
							if( ema2 > 1095.22 )
								if( smma4 <= 1067.52 )
									ret := -0.279412
								if( smma4 > 1067.52 )
									ret := -0.014958
	if( bullishEngulfingInt > 0.5 )
		if( smma4 <= 916.122 )
			if( smma2 <= 798.239 )
				if( smma2 <= 548.118 )
					if( smma2 <= 286.047 )
						if( smma3 <= 281.049 )
							if( smma2 <= 156.578 )
								ret := 0.384615
							if( smma2 > 156.578 )
								if( smma2 <= 180.756 )
									ret := -0.300000
								if( smma2 > 180.756 )
									ret := 0.044164
						if( smma3 > 281.049 )
							ret := -0.400000
					if( smma2 > 286.047 )
						if( smma2 <= 298.76 )
							if( smma3 <= 289.706 )
								ret := 0.187500
							if( smma3 > 289.706 )
								if( smma3 <= 293.591 )
									ret := 0.846154 // buy
								if( smma3 > 293.591 )
									ret := 0.435897
						if( smma2 > 298.76 )
							if( smma4 <= 357.112 )
								if( ema2 <= 334.481 )
									ret := -0.101796
								if( ema2 > 334.481 )
									ret := 0.157895
							if( smma4 > 357.112 )
								if( smma1 <= 374.067 )
									ret := 0.450000
								if( smma1 > 374.067 )
									ret := 0.086486
				if( smma2 > 548.118 )
					if( smma1 <= 552.906 )
						ret := -0.684211
					if( smma1 > 552.906 )
						if( ema2 <= 636.631 )
							if( ema2 <= 574.719 )
								if( smma1 <= 572.949 )
									ret := 0.266667
								if( smma1 > 572.949 )
									ret := 0.000000
							if( ema2 > 574.719 )
								if( smma3 <= 630.542 )
									ret := -0.155172
								if( smma3 > 630.542 )
									ret := -0.444444
						if( ema2 > 636.631 )
							if( smma3 <= 772.286 )
								if( smma1 <= 640.615 )
									ret := 0.750000 // buy
								if( smma1 > 640.615 )
									ret := 0.046512
							if( smma3 > 772.286 )
								ret := -0.500000
			if( smma2 > 798.239 )
				if( smma1 <= 848.898 )
					if( smma3 <= 832.542 )
						if( smma4 <= 801.521 )
							ret := 0.473684
						if( smma4 > 801.521 )
							ret := 0.909091 // buy
					if( smma3 > 832.542 )
						if( smma1 <= 834.997 )
							ret := 0.055556
						if( smma1 > 834.997 )
							ret := 0.692308
				if( smma1 > 848.898 )
					if( ema2 <= 874.927 )
						if( smma3 <= 845.709 )
							ret := -0.500000
						if( smma3 > 845.709 )
							if( smma1 <= 871.447 )
								ret := 0.000000
							if( smma1 > 871.447 )
								ret := 0.000000
					if( ema2 > 874.927 )
						if( smma1 <= 880.338 )
							ret := 0.904762 // buy
						if( smma1 > 880.338 )
							if( bullSigInt <= 0.5 )
								if( smma4 <= 897.662 )
									ret := 0.000000
								if( smma4 > 897.662 )
									ret := 0.384615
							if( bullSigInt > 0.5 )
								ret := -0.222222
		if( smma4 > 916.122 )
			if( ema2 <= 1958.26 )
				if( smma4 <= 1895.03 )
					if( ema2 <= 1025.61 )
						if( smma2 <= 1038.63 )
							if( ema2 <= 1002.29 )
								if( ema2 <= 982.231 )
									ret := -0.015152
								if( ema2 > 982.231 )
									ret := -0.277778
							if( ema2 > 1002.29 )
								ret := 0.450000
						if( smma2 > 1038.63 )
							ret := 0.692308
					if( ema2 > 1025.61 )
						if( smma1 <= 1086.55 )
							if( smma3 <= 1047.25 )
								if( ema2 <= 1062.23 )
									ret := 0.052632
								if( ema2 > 1062.23 )
									ret := -0.470588
							if( smma3 > 1047.25 )
								if( smma2 <= 1036.31 )
									ret := -0.727273 // sell
								if( smma2 > 1036.31 )
									ret := -0.500000
						if( smma1 > 1086.55 )
							if( smma2 <= 1170.93 )
								if( ema2 <= 1093.72 )
									ret := -0.111111
								if( ema2 > 1093.72 )
									ret := 0.264368
							if( smma2 > 1170.93 )
								if( smma3 <= 1192.34 )
									ret := -0.444444
								if( smma3 > 1192.34 )
									ret := 0.001189
				if( smma4 > 1895.03 )
					ret := -0.529412
			if( ema2 > 1958.26 )
				if( smma2 <= 1987.96 )
					ret := 0.500000
				if( smma2 > 1987.96 )
					if( smma2 <= 2007.09 )
						ret := 0.214286
					if( smma2 > 2007.09 )
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
float op_operation = decision_tree_0_MELI_15Min_a65915d8(bullishEngulfingInt, smma4, bullSigInt, smma2, ema2, bearSigInt, bearishEngulfingInt, smma3, smma1)

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


