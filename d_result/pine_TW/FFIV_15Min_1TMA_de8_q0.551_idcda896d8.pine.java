//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: TMA_Overlay
// ID_model: FFIV_15Min_1TMA_cda896d8 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_FFIV_15Min_1TMA_cda896d8", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_FFIV_15Min_cda896d8(bullishEngulfingInt, smma4, bullSigInt, smma2, ema2, bearSigInt, bearishEngulfingInt, smma3, smma1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema2 <= 144.266 )
		if( smma2 <= 94.1396 )
			if( smma4 <= 106.628 )
				if( smma2 <= 93.9049 )
					ret := 1.000000 // buy
				if( smma2 > 93.9049 )
					ret := 0.750000 // buy
			if( smma4 > 106.628 )
				if( smma4 <= 106.83 )
					ret := 0.500000
				if( smma4 > 106.83 )
					ret := 0.750000 // buy
		if( smma2 > 94.1396 )
			if( smma4 <= 145.876 )
				if( smma3 <= 139.629 )
					if( smma1 <= 143.091 )
						if( ema2 <= 141.866 )
							if( smma3 <= 138.352 )
								if( smma4 <= 110.63 )
									ret := 0.258600
								if( smma4 > 110.63 )
									ret := 0.067771
							if( smma3 > 138.352 )
								if( ema2 <= 134.392 )
									ret := 0.683544
								if( ema2 > 134.392 )
									ret := -0.074460
						if( ema2 > 141.866 )
							if( smma1 <= 142.404 )
								if( smma2 <= 133.172 )
									ret := 1.000000 // buy
								if( smma2 > 133.172 )
									ret := 0.459364
							if( smma1 > 142.404 )
								if( smma3 <= 138.153 )
									ret := -0.533333
								if( smma3 > 138.153 )
									ret := 0.000000
					if( smma1 > 143.091 )
						if( smma3 <= 135.666 )
							ret := 0.000000
						if( smma3 > 135.666 )
							if( ema2 <= 142.854 )
								ret := -0.800000 // sell
							if( ema2 > 142.854 )
								ret := -1.000000 // sell
				if( smma3 > 139.629 )
					if( smma3 <= 140.477 )
						if( ema2 <= 136.591 )
							if( bearishEngulfingInt <= 0.5 )
								if( smma3 <= 139.761 )
									ret := 0.583333
								if( smma3 > 139.761 )
									ret := 0.862857 // buy
							if( bearishEngulfingInt > 0.5 )
								ret := 0.200000
						if( ema2 > 136.591 )
							if( smma1 <= 136.271 )
								ret := -1.000000 // sell
							if( smma1 > 136.271 )
								if( smma1 <= 142.517 )
									ret := 0.218515
								if( smma1 > 142.517 )
									ret := -0.500000
					if( smma3 > 140.477 )
						if( smma2 <= 141.497 )
							if( smma2 <= 141.217 )
								if( smma1 <= 138.149 )
									ret := 0.210682
								if( smma1 > 138.149 )
									ret := -0.058017
							if( smma2 > 141.217 )
								if( smma4 <= 140.788 )
									ret := 0.074074
								if( smma4 > 140.788 )
									ret := -0.396648
						if( smma2 > 141.497 )
							if( smma2 <= 142.603 )
								if( ema2 <= 140.218 )
									ret := -0.102222
								if( ema2 > 140.218 )
									ret := 0.421580
							if( smma2 > 142.603 )
								if( smma4 <= 141.443 )
									ret := -0.132316
								if( smma4 > 141.443 )
									ret := 0.143957
			if( smma4 > 145.876 )
				if( ema2 <= 139.296 )
					if( smma2 <= 141.919 )
						if( smma4 <= 147.322 )
							if( smma1 <= 139.349 )
								ret := 0.500000
							if( smma1 > 139.349 )
								ret := 1.000000 // buy
						if( smma4 > 147.322 )
							ret := 0.000000
					if( smma2 > 141.919 )
						if( smma1 <= 143.477 )
							if( smma4 <= 146.732 )
								if( smma3 <= 145.783 )
									ret := -0.380952
								if( smma3 > 145.783 )
									ret := -1.000000 // sell
							if( smma4 > 146.732 )
								if( ema2 <= 139.031 )
									ret := 0.308642
								if( ema2 > 139.031 )
									ret := -0.769231 // sell
						if( smma1 > 143.477 )
							if( smma2 <= 147.732 )
								if( smma2 <= 146.753 )
									ret := 0.666667
								if( smma2 > 146.753 )
									ret := 1.000000 // buy
							if( smma2 > 147.732 )
								ret := 0.500000
				if( ema2 > 139.296 )
					if( smma4 <= 150.275 )
						if( smma3 <= 147.985 )
							if( smma3 <= 147.076 )
								if( smma2 <= 141.185 )
									ret := 0.538462
								if( smma2 > 141.185 )
									ret := -0.327869
							if( smma3 > 147.076 )
								if( smma2 <= 145.731 )
									ret := -0.315789
								if( smma2 > 145.731 )
									ret := 0.500000
						if( smma3 > 147.985 )
							if( smma1 <= 145.641 )
								if( smma2 <= 147.824 )
									ret := -0.606557
								if( smma2 > 147.824 )
									ret := 0.800000 // buy
							if( smma1 > 145.641 )
								if( ema2 <= 141.457 )
									ret := -1.000000 // sell
								if( ema2 > 141.457 )
									ret := -0.772727 // sell
					if( smma4 > 150.275 )
						if( smma1 <= 144.694 )
							if( smma1 <= 143.944 )
								if( smma4 <= 151.378 )
									ret := 0.731707 // buy
								if( smma4 > 151.378 )
									ret := -0.233333
							if( smma1 > 143.944 )
								if( smma3 <= 147.548 )
									ret := -0.166667
								if( smma3 > 147.548 )
									ret := 0.851064 // buy
						if( smma1 > 144.694 )
							if( smma2 <= 147.979 )
								if( smma4 <= 152.258 )
									ret := -0.733333 // sell
								if( smma4 > 152.258 )
									ret := -1.000000 // sell
							if( smma2 > 147.979 )
								if( smma1 <= 147.83 )
									ret := 0.772727 // buy
								if( smma1 > 147.83 )
									ret := 0.166667
	if( ema2 > 144.266 )
		if( smma2 <= 143.507 )
			if( smma2 <= 142.605 )
				if( smma1 <= 140.501 )
					if( ema2 <= 146.907 )
						if( smma1 <= 138.446 )
							ret := 1.000000 // buy
						if( smma1 > 138.446 )
							if( smma4 <= 136.767 )
								ret := 0.500000
							if( smma4 > 136.767 )
								ret := 1.000000 // buy
					if( ema2 > 146.907 )
						ret := -0.400000
				if( smma1 > 140.501 )
					if( smma2 <= 139.159 )
						if( smma1 <= 141.862 )
							if( ema2 <= 146.553 )
								ret := -0.714286 // sell
							if( ema2 > 146.553 )
								ret := -1.000000 // sell
						if( smma1 > 141.862 )
							ret := -1.000000 // sell
					if( smma2 > 139.159 )
						if( smma2 <= 139.823 )
							if( smma4 <= 139.618 )
								if( smma3 <= 138.041 )
									ret := 0.750000 // buy
								if( smma3 > 138.041 )
									ret := -0.857143 // sell
							if( smma4 > 139.618 )
								ret := 1.000000 // buy
						if( smma2 > 139.823 )
							if( ema2 <= 145.844 )
								if( smma2 <= 141.461 )
									ret := -0.824561 // sell
								if( smma2 > 141.461 )
									ret := 0.006536
							if( ema2 > 145.844 )
								if( smma1 <= 145.457 )
									ret := 0.320000
								if( smma1 > 145.457 )
									ret := -0.583333
			if( smma2 > 142.605 )
				if( smma3 <= 141.668 )
					if( smma1 <= 144.517 )
						if( smma4 <= 140.743 )
							if( smma3 <= 141.527 )
								if( smma1 <= 144.214 )
									ret := 0.000000
								if( smma1 > 144.214 )
									ret := -0.625000
							if( smma3 > 141.527 )
								if( smma1 <= 143.551 )
									ret := -1.000000 // sell
								if( smma1 > 143.551 )
									ret := -0.625000
						if( smma4 > 140.743 )
							ret := -1.000000 // sell
					if( smma1 > 144.517 )
						if( smma4 <= 141.553 )
							if( smma3 <= 141.358 )
								if( smma1 <= 145.904 )
									ret := -0.400000
								if( smma1 > 145.904 )
									ret := -0.945946 // sell
							if( smma3 > 141.358 )
								ret := -1.000000 // sell
						if( smma4 > 141.553 )
							ret := 0.000000
				if( smma3 > 141.668 )
					if( smma3 <= 143.425 )
						if( smma4 <= 144.588 )
							if( ema2 <= 145.238 )
								if( smma4 <= 144.128 )
									ret := -0.114035
								if( smma4 > 144.128 )
									ret := 0.617647
							if( ema2 > 145.238 )
								if( smma3 <= 142.323 )
									ret := -0.204545
								if( smma3 > 142.323 )
									ret := -0.676923
						if( smma4 > 144.588 )
							if( smma1 <= 143.42 )
								if( ema2 <= 144.424 )
									ret := -0.750000 // sell
								if( ema2 > 144.424 )
									ret := -1.000000 // sell
							if( smma1 > 143.42 )
								if( smma4 <= 145.221 )
									ret := -0.250000
								if( smma4 > 145.221 )
									ret := -0.500000
					if( smma3 > 143.425 )
						if( ema2 <= 145.183 )
							if( smma1 <= 143.019 )
								if( smma1 <= 142.798 )
									ret := -0.750000 // sell
								if( smma1 > 142.798 )
									ret := 0.000000
							if( smma1 > 143.019 )
								if( smma2 <= 143.446 )
									ret := -1.000000 // sell
								if( smma2 > 143.446 )
									ret := -0.714286 // sell
						if( ema2 > 145.183 )
							ret := 0.000000
		if( smma2 > 143.507 )
			if( smma2 <= 238.005 )
				if( smma3 <= 237.199 )
					if( ema2 <= 201.412 )
						if( smma4 <= 195.89 )
							if( smma1 <= 146.686 )
								if( smma1 <= 146.183 )
									ret := 0.044118
								if( smma1 > 146.183 )
									ret := 0.240363
							if( smma1 > 146.686 )
								if( smma3 <= 153.109 )
									ret := -0.057478
								if( smma3 > 153.109 )
									ret := 0.039075
						if( smma4 > 195.89 )
							if( smma1 <= 200.498 )
								if( smma4 <= 207.554 )
									ret := 0.208848
								if( smma4 > 207.554 )
									ret := 0.600000
							if( smma1 > 200.498 )
								if( smma4 <= 196.995 )
									ret := 0.647059
								if( smma4 > 196.995 )
									ret := -0.058085
					if( ema2 > 201.412 )
						if( smma4 <= 188.506 )
							if( smma4 <= 184.166 )
								if( smma2 <= 192.693 )
									ret := -0.700000 // sell
								if( smma2 > 192.693 )
									ret := 0.080000
							if( smma4 > 184.166 )
								if( smma3 <= 190.904 )
									ret := -0.900000 // sell
								if( smma3 > 190.904 )
									ret := -1.000000 // sell
						if( smma4 > 188.506 )
							if( smma4 <= 191.843 )
								if( ema2 <= 204.22 )
									ret := 0.816092 // buy
								if( ema2 > 204.22 )
									ret := -0.137931
							if( smma4 > 191.843 )
								if( smma1 <= 202.965 )
									ret := -0.217961
								if( smma1 > 202.965 )
									ret := 0.012381
				if( smma3 > 237.199 )
					if( ema2 <= 233.832 )
						if( smma1 <= 234.395 )
							if( smma4 <= 237.732 )
								if( smma1 <= 233.691 )
									ret := 1.000000 // buy
								if( smma1 > 233.691 )
									ret := 0.750000 // buy
							if( smma4 > 237.732 )
								if( smma2 <= 236.322 )
									ret := 0.000000
								if( smma2 > 236.322 )
									ret := 0.933333 // buy
						if( smma1 > 234.395 )
							if( smma3 <= 237.74 )
								ret := -0.333333
							if( smma3 > 237.74 )
								if( smma4 <= 237.906 )
									ret := 1.000000 // buy
								if( smma4 > 237.906 )
									ret := 0.125000
					if( ema2 > 233.832 )
						if( ema2 <= 237.293 )
							if( smma2 <= 235.276 )
								ret := 0.800000 // buy
							if( smma2 > 235.276 )
								if( smma4 <= 237.752 )
									ret := -0.967742 // sell
								if( smma4 > 237.752 )
									ret := -0.333333
						if( ema2 > 237.293 )
							if( ema2 <= 240.399 )
								if( smma1 <= 236.401 )
									ret := 0.250000
								if( smma1 > 236.401 )
									ret := 0.947368 // buy
							if( ema2 > 240.399 )
								if( smma3 <= 237.804 )
									ret := 0.500000
								if( smma3 > 237.804 )
									ret := 0.000000
			if( smma2 > 238.005 )
				if( smma4 <= 237.61 )
					if( ema2 <= 247.321 )
						if( ema2 <= 246.609 )
							if( smma1 <= 246.467 )
								if( smma3 <= 241.299 )
									ret := 0.727273 // buy
								if( smma3 > 241.299 )
									ret := 0.000000
							if( smma1 > 246.467 )
								if( smma1 <= 246.515 )
									ret := 0.000000
								if( smma1 > 246.515 )
									ret := -0.250000
						if( ema2 > 246.609 )
							if( ema2 <= 246.696 )
								ret := -0.250000
							if( ema2 > 246.696 )
								if( smma1 <= 245.133 )
									ret := 0.250000
								if( smma1 > 245.133 )
									ret := 0.000000
					if( ema2 > 247.321 )
						if( smma4 <= 234.895 )
							if( ema2 <= 247.981 )
								ret := -0.500000
							if( ema2 > 247.981 )
								ret := -1.000000 // sell
						if( smma4 > 234.895 )
							if( smma4 <= 235.569 )
								ret := -0.500000
							if( smma4 > 235.569 )
								ret := -0.750000 // sell
				if( smma4 > 237.61 )
					if( ema2 <= 234.028 )
						ret := 1.000000 // buy
					if( ema2 > 234.028 )
						if( smma2 <= 238.614 )
							if( smma1 <= 240.188 )
								if( ema2 <= 234.648 )
									ret := -0.400000
								if( ema2 > 234.648 )
									ret := -0.937500 // sell
							if( smma1 > 240.188 )
								ret := -0.250000
						if( smma2 > 238.614 )
							if( smma4 <= 238.919 )
								if( smma2 <= 244.967 )
									ret := -0.229358
								if( smma2 > 244.967 )
									ret := -1.000000 // sell
							if( smma4 > 238.919 )
								if( smma4 <= 239.019 )
									ret := -1.000000 // sell
								if( smma4 > 239.019 )
									ret := -0.571429
	
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
float op_operation = decision_tree_0_FFIV_15Min_cda896d8(bullishEngulfingInt, smma4, bullSigInt, smma2, ema2, bearSigInt, bearishEngulfingInt, smma3, smma1)

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


