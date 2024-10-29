//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: TMA_Overlay
// ID_model: UNIUSDT_15Min_1TMA_7576b479 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UNIUSDT_15Min_1TMA_7576b479", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UNIUSDT_15Min_7576b479(smma2, smma4, smma3, ema2, bearSigInt, bullSigInt, smma1, bearishEngulfingInt, bullishEngulfingInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( smma2 <= 6.16926 )
		if( smma3 <= 3.8087 )
			if( smma2 <= 3.65155 )
				ret := 1.000000 // buy
			if( smma2 > 3.65155 )
				if( bullishEngulfingInt <= 0.5 )
					if( smma1 <= 3.73548 )
						if( smma4 <= 3.87078 )
							if( smma4 <= 3.8279 )
								ret := 0.538462
							if( smma4 > 3.8279 )
								if( smma1 <= 3.60976 )
									ret := -0.133333
								if( smma1 > 3.60976 )
									ret := -0.900000 // sell
						if( smma4 > 3.87078 )
							ret := 0.529851
					if( smma1 > 3.73548 )
						if( smma4 <= 3.84914 )
							if( ema2 <= 3.90795 )
								ret := 1.000000 // buy
							if( ema2 > 3.90795 )
								if( smma1 <= 3.85329 )
									ret := -0.285714
								if( smma1 > 3.85329 )
									ret := 0.500000
						if( smma4 > 3.84914 )
							if( smma4 <= 3.96348 )
								if( smma1 <= 3.7887 )
									ret := 0.909091 // buy
								if( smma1 > 3.7887 )
									ret := 1.000000 // buy
							if( smma4 > 3.96348 )
								ret := 0.700000 // buy
				if( bullishEngulfingInt > 0.5 )
					ret := -0.555556
		if( smma3 > 3.8087 )
			if( smma4 <= 6.45744 )
				if( smma3 <= 3.89305 )
					if( smma2 <= 3.7113 )
						if( ema2 <= 3.70019 )
							if( smma3 <= 3.85151 )
								ret := 1.000000 // buy
							if( smma3 > 3.85151 )
								ret := 0.785714 // buy
						if( ema2 > 3.70019 )
							if( ema2 <= 3.74312 )
								ret := -0.416667
							if( ema2 > 3.74312 )
								ret := -1.000000 // sell
					if( smma2 > 3.7113 )
						if( ema2 <= 3.79846 )
							if( ema2 <= 3.72639 )
								if( smma2 <= 3.81276 )
									ret := -0.776119 // sell
								if( smma2 > 3.81276 )
									ret := 0.125000
							if( ema2 > 3.72639 )
								if( smma4 <= 4.19854 )
									ret := -1.000000 // sell
								if( smma4 > 4.19854 )
									ret := -0.818182 // sell
						if( ema2 > 3.79846 )
							if( bearishEngulfingInt <= 0.5 )
								if( smma3 <= 3.88356 )
									ret := -0.714286 // sell
								if( smma3 > 3.88356 )
									ret := -0.333333
							if( bearishEngulfingInt > 0.5 )
								ret := 0.562500
				if( smma3 > 3.89305 )
					if( smma3 <= 5.67525 )
						if( smma3 <= 5.65337 )
							if( ema2 <= 3.58172 )
								if( smma4 <= 4.27109 )
									ret := 1.000000 // buy
								if( smma4 > 4.27109 )
									ret := 0.918919 // buy
							if( ema2 > 3.58172 )
								if( smma3 <= 3.93443 )
									ret := 0.398176
								if( smma3 > 3.93443 )
									ret := 0.019043
						if( smma3 > 5.65337 )
							if( smma3 <= 5.66758 )
								if( smma3 <= 5.65799 )
									ret := -0.900000 // sell
								if( smma3 > 5.65799 )
									ret := -0.705882 // sell
							if( smma3 > 5.66758 )
								if( smma2 <= 5.57674 )
									ret := 0.166667
								if( smma2 > 5.57674 )
									ret := -0.372093
					if( smma3 > 5.67525 )
						if( smma3 <= 5.71968 )
							if( ema2 <= 5.80366 )
								if( smma2 <= 5.37648 )
									ret := -1.000000 // sell
								if( smma2 > 5.37648 )
									ret := 0.633508
							if( ema2 > 5.80366 )
								if( smma4 <= 5.74008 )
									ret := -0.324201
								if( smma4 > 5.74008 )
									ret := 0.246575
						if( smma3 > 5.71968 )
							if( smma3 <= 6.18418 )
								if( smma1 <= 5.09882 )
									ret := -1.000000 // sell
								if( smma1 > 5.09882 )
									ret := 0.073450
							if( smma3 > 6.18418 )
								if( ema2 <= 6.1682 )
									ret := 0.307107
								if( ema2 > 6.1682 )
									ret := -0.333333
			if( smma4 > 6.45744 )
				if( ema2 <= 5.12325 )
					if( smma3 <= 6.16005 )
						if( smma3 <= 6.06624 )
							ret := 0.866667 // buy
						if( smma3 > 6.06624 )
							ret := -1.000000 // sell
					if( smma3 > 6.16005 )
						ret := 1.000000 // buy
				if( ema2 > 5.12325 )
					if( ema2 <= 6.05241 )
						if( smma2 <= 6.10162 )
							if( ema2 <= 5.18499 )
								if( ema2 <= 5.13464 )
									ret := -0.833333 // sell
								if( ema2 > 5.13464 )
									ret := 0.230769
							if( ema2 > 5.18499 )
								if( smma2 <= 5.94592 )
									ret := -1.000000 // sell
								if( smma2 > 5.94592 )
									ret := -0.668421
						if( smma2 > 6.10162 )
							if( smma4 <= 6.47146 )
								ret := -1.000000 // sell
							if( smma4 > 6.47146 )
								if( smma2 <= 6.13486 )
									ret := 0.080000
								if( smma2 > 6.13486 )
									ret := 0.518519
					if( ema2 > 6.05241 )
						if( smma2 <= 6.09279 )
							ret := -1.000000 // sell
						if( smma2 > 6.09279 )
							if( smma1 <= 6.05084 )
								ret := -0.636364
							if( smma1 > 6.05084 )
								ret := -1.000000 // sell
	if( smma2 > 6.16926 )
		if( smma4 <= 6.16381 )
			if( smma4 <= 5.68812 )
				if( smma3 <= 5.94399 )
					ret := 0.538462
				if( smma3 > 5.94399 )
					ret := 1.000000 // buy
			if( smma4 > 5.68812 )
				if( ema2 <= 7.0596 )
					if( smma2 <= 6.21589 )
						if( ema2 <= 6.23187 )
							if( smma3 <= 6.1242 )
								if( smma2 <= 6.18306 )
									ret := -0.097561
								if( smma2 > 6.18306 )
									ret := 0.380952
							if( smma3 > 6.1242 )
								if( smma3 <= 6.17253 )
									ret := -0.311174
								if( smma3 > 6.17253 )
									ret := 0.009901
						if( ema2 > 6.23187 )
							if( ema2 <= 6.33363 )
								if( smma4 <= 5.91749 )
									ret := -0.480000
								if( smma4 > 5.91749 )
									ret := 0.411150
							if( ema2 > 6.33363 )
								if( smma3 <= 6.06118 )
									ret := -0.421053
								if( smma3 > 6.06118 )
									ret := -0.047244
					if( smma2 > 6.21589 )
						if( smma1 <= 6.51932 )
							if( smma2 <= 6.24339 )
								if( smma1 <= 6.25307 )
									ret := -0.166189
								if( smma1 > 6.25307 )
									ret := -0.576642
							if( smma2 > 6.24339 )
								if( smma3 <= 6.14111 )
									ret := -0.500000
								if( smma3 > 6.14111 )
									ret := -0.166667
						if( smma1 > 6.51932 )
							if( smma3 <= 6.33507 )
								if( ema2 <= 6.93819 )
									ret := 0.567010
								if( ema2 > 6.93819 )
									ret := -0.615385
							if( smma3 > 6.33507 )
								if( smma3 <= 6.35473 )
									ret := -0.642857
								if( smma3 > 6.35473 )
									ret := 0.125000
				if( ema2 > 7.0596 )
					ret := -1.000000 // sell
		if( smma4 > 6.16381 )
			if( smma2 <= 7.34864 )
				if( smma4 <= 6.82092 )
					if( smma2 <= 7.15212 )
						if( ema2 <= 6.77753 )
							if( smma4 <= 6.6518 )
								if( smma2 <= 6.72824 )
									ret := 0.011089
								if( smma2 > 6.72824 )
									ret := 0.453846
							if( smma4 > 6.6518 )
								if( smma1 <= 6.72657 )
									ret := -0.194728
								if( smma1 > 6.72657 )
									ret := 0.088962
						if( ema2 > 6.77753 )
							if( smma2 <= 6.57487 )
								if( smma3 <= 6.5712 )
									ret := 0.641026
								if( smma3 > 6.5712 )
									ret := -0.900000 // sell
							if( smma2 > 6.57487 )
								if( smma2 <= 6.832 )
									ret := -0.253285
								if( smma2 > 6.832 )
									ret := -0.017662
					if( smma2 > 7.15212 )
						if( smma4 <= 6.727 )
							ret := 0.100000
						if( smma4 > 6.727 )
							if( ema2 <= 7.15418 )
								if( smma1 <= 7.17518 )
									ret := -0.916667 // sell
								if( smma1 > 7.17518 )
									ret := -0.157895
							if( ema2 > 7.15418 )
								if( smma3 <= 7.01523 )
									ret := -0.628571
								if( smma3 > 7.01523 )
									ret := -0.967742 // sell
				if( smma4 > 6.82092 )
					if( ema2 <= 7.10414 )
						if( smma3 <= 7.27924 )
							if( smma3 <= 7.16527 )
								if( smma1 <= 6.76638 )
									ret := -0.028271
								if( smma1 > 6.76638 )
									ret := 0.163453
							if( smma3 > 7.16527 )
								if( ema2 <= 7.09082 )
									ret := -0.217454
								if( ema2 > 7.09082 )
									ret := 0.432836
						if( smma3 > 7.27924 )
							if( smma3 <= 7.53562 )
								if( ema2 <= 6.83548 )
									ret := -0.260000
								if( ema2 > 6.83548 )
									ret := 0.416168
							if( smma3 > 7.53562 )
								if( smma1 <= 7.10679 )
									ret := 1.000000 // buy
								if( smma1 > 7.10679 )
									ret := 0.839286 // buy
					if( ema2 > 7.10414 )
						if( smma1 <= 7.0554 )
							if( ema2 <= 7.11289 )
								if( smma2 <= 6.94444 )
									ret := -0.500000
								if( smma2 > 6.94444 )
									ret := -0.437500
							if( ema2 > 7.11289 )
								if( smma2 <= 6.99491 )
									ret := 0.781250 // buy
								if( smma2 > 6.99491 )
									ret := 0.050314
						if( smma1 > 7.0554 )
							if( smma4 <= 8.41979 )
								if( smma1 <= 7.16076 )
									ret := -0.213344
								if( smma1 > 7.16076 )
									ret := -0.005689
							if( smma4 > 8.41979 )
								if( smma4 <= 8.56855 )
									ret := -1.000000 // sell
								if( smma4 > 8.56855 )
									ret := -0.928571 // sell
			if( smma2 > 7.34864 )
				if( smma3 <= 11.211 )
					if( smma3 <= 10.8066 )
						if( ema2 <= 11.2336 )
							if( smma1 <= 10.3567 )
								if( ema2 <= 6.76611 )
									ret := 0.787879 // buy
								if( ema2 > 6.76611 )
									ret := -0.063423
							if( smma1 > 10.3567 )
								if( smma1 <= 11.7444 )
									ret := 0.147956
								if( smma1 > 11.7444 )
									ret := -0.928571 // sell
						if( ema2 > 11.2336 )
							if( smma3 <= 10.7554 )
								if( smma3 <= 9.64915 )
									ret := -0.079646
								if( smma3 > 9.64915 )
									ret := -0.611446
							if( smma3 > 10.7554 )
								if( ema2 <= 11.44 )
									ret := 0.864865 // buy
								if( ema2 > 11.44 )
									ret := -0.230769
					if( smma3 > 10.8066 )
						if( ema2 <= 11.0272 )
							if( smma2 <= 11.0896 )
								if( smma3 <= 11.0266 )
									ret := -0.016544
								if( smma3 > 11.0266 )
									ret := -0.638095
							if( smma2 > 11.0896 )
								if( smma4 <= 10.928 )
									ret := 0.253731
								if( smma4 > 10.928 )
									ret := 0.847458 // buy
						if( ema2 > 11.0272 )
							if( smma1 <= 11.0198 )
								if( bullishEngulfingInt <= 0.5 )
									ret := -0.675214
								if( bullishEngulfingInt > 0.5 )
									ret := -0.950000 // sell
							if( smma1 > 11.0198 )
								if( smma2 <= 11.2933 )
									ret := -0.289586
								if( smma2 > 11.2933 )
									ret := 0.110000
				if( smma3 > 11.211 )
					if( ema2 <= 10.7917 )
						if( smma2 <= 11.1177 )
							if( smma3 <= 11.4056 )
								if( ema2 <= 10.6246 )
									ret := 0.923077 // buy
								if( ema2 > 10.6246 )
									ret := 1.000000 // buy
							if( smma3 > 11.4056 )
								if( smma4 <= 11.8777 )
									ret := 0.846154 // buy
								if( smma4 > 11.8777 )
									ret := 1.000000 // buy
						if( smma2 > 11.1177 )
							if( smma4 <= 11.9696 )
								ret := 0.300000
							if( smma4 > 11.9696 )
								if( ema2 <= 10.6709 )
									ret := 0.939394 // buy
								if( ema2 > 10.6709 )
									ret := 0.181818
					if( ema2 > 10.7917 )
						if( ema2 <= 12.736 )
							if( smma4 <= 12.4628 )
								if( smma3 <= 12.5343 )
									ret := 0.097207
								if( smma3 > 12.5343 )
									ret := 0.893617 // buy
							if( smma4 > 12.4628 )
								if( smma1 <= 12.5419 )
									ret := -0.336106
								if( smma1 > 12.5419 )
									ret := 0.275000
						if( ema2 > 12.736 )
							if( smma1 <= 13.4117 )
								if( smma4 <= 13.7913 )
									ret := -0.316742
								if( smma4 > 13.7913 )
									ret := -0.822785 // sell
							if( smma1 > 13.4117 )
								if( smma1 <= 14.1746 )
									ret := 0.256693
								if( smma1 > 14.1746 )
									ret := -0.154959
	
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
float op_operation = decision_tree_0_UNIUSDT_15Min_7576b479(smma2, smma4, smma3, ema2, bearSigInt, bullSigInt, smma1, bearishEngulfingInt, bullishEngulfingInt)

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


