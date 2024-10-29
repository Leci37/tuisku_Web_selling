//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: TMA_Overlay
// ID_model: AAVEUSDT_30Min_1TMA_ede0b8bb Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAVEUSDT_30Min_1TMA_ede0b8bb", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAVEUSDT_30Min_ede0b8bb(bullishEngulfingInt, smma3, bullSigInt, bearishEngulfingInt, smma2, ema2, smma1, smma4, bearSigInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema2 <= 558.519 )
		if( smma1 <= 84.954 )
			if( smma2 <= 81.7944 )
				if( smma4 <= 89.0704 )
					if( smma4 <= 30.3127 )
						if( ema2 <= 29.6733 )
							ret := 1.000000 // buy
						if( ema2 > 29.6733 )
							if( smma4 <= 30.2674 )
								if( smma3 <= 28.7449 )
									ret := 0.500000
								if( smma3 > 28.7449 )
									ret := 0.000000
							if( smma4 > 30.2674 )
								ret := 1.000000 // buy
					if( smma4 > 30.3127 )
						if( ema2 <= 84.5533 )
							if( smma1 <= 42.8174 )
								if( smma3 <= 39.0121 )
									ret := 0.013199
								if( smma3 > 39.0121 )
									ret := -0.445161
							if( smma1 > 42.8174 )
								if( smma3 <= 51.4827 )
									ret := 0.506329
								if( smma3 > 51.4827 )
									ret := 0.064015
						if( ema2 > 84.5533 )
							if( smma3 <= 74.8691 )
								if( smma4 <= 70.1433 )
									ret := -1.000000 // sell
								if( smma4 > 70.1433 )
									ret := 0.516129
							if( smma3 > 74.8691 )
								if( smma3 <= 80.3929 )
									ret := -0.557252
								if( smma3 > 80.3929 )
									ret := 0.181818
				if( smma4 > 89.0704 )
					if( smma3 <= 86.7876 )
						if( ema2 <= 63.5342 )
							ret := -0.200000
						if( ema2 > 63.5342 )
							if( smma2 <= 76.7459 )
								if( smma3 <= 82.5049 )
									ret := -1.000000 // sell
								if( smma3 > 82.5049 )
									ret := -0.250000
							if( smma2 > 76.7459 )
								if( smma2 <= 79.9231 )
									ret := -1.000000 // sell
								if( smma2 > 79.9231 )
									ret := -0.750000 // sell
					if( smma3 > 86.7876 )
						if( ema2 <= 73.1189 )
							ret := 0.600000
						if( ema2 > 73.1189 )
							ret := -0.500000
			if( smma2 > 81.7944 )
				if( smma4 <= 77.9982 )
					if( smma4 <= 75.6627 )
						if( smma2 <= 83.1077 )
							if( ema2 <= 84.8557 )
								if( smma3 <= 80.0652 )
									ret := 0.304878
								if( smma3 > 80.0652 )
									ret := 0.837209 // buy
							if( ema2 > 84.8557 )
								if( ema2 <= 85.1621 )
									ret := -0.375000
								if( ema2 > 85.1621 )
									ret := -1.000000 // sell
						if( smma2 > 83.1077 )
							if( smma4 <= 75.2107 )
								if( ema2 <= 83.3145 )
									ret := 0.500000
								if( ema2 > 83.3145 )
									ret := -1.000000 // sell
							if( smma4 > 75.2107 )
								if( ema2 <= 82.9742 )
									ret := 0.000000
								if( ema2 > 82.9742 )
									ret := -1.000000 // sell
					if( smma4 > 75.6627 )
						if( smma2 <= 82.6572 )
							if( smma1 <= 82.6057 )
								if( smma3 <= 80.167 )
									ret := 0.500000
								if( smma3 > 80.167 )
									ret := -0.083333
							if( smma1 > 82.6057 )
								if( smma3 <= 80.661 )
									ret := -0.823529 // sell
								if( smma3 > 80.661 )
									ret := 0.000000
						if( smma2 > 82.6572 )
							if( smma2 <= 83.2822 )
								if( smma1 <= 82.8324 )
									ret := -0.666667
								if( smma1 > 82.8324 )
									ret := -1.000000 // sell
							if( smma2 > 83.2822 )
								if( smma1 <= 84.2562 )
									ret := -0.416667
								if( smma1 > 84.2562 )
									ret := -0.937500 // sell
				if( smma4 > 77.9982 )
					if( smma1 <= 81.6893 )
						if( smma1 <= 76.3375 )
							ret := -1.000000 // sell
						if( smma1 > 76.3375 )
							if( smma2 <= 82.1302 )
								if( smma4 <= 84.6216 )
									ret := 0.454545
								if( smma4 > 84.6216 )
									ret := 0.786260 // buy
							if( smma2 > 82.1302 )
								if( smma1 <= 78.2141 )
									ret := 0.860000 // buy
								if( smma1 > 78.2141 )
									ret := 0.253041
					if( smma1 > 81.6893 )
						if( smma4 <= 91.3701 )
							if( smma4 <= 83.874 )
								if( smma4 <= 78.8396 )
									ret := 0.857143 // buy
								if( smma4 > 78.8396 )
									ret := 0.236912
							if( smma4 > 83.874 )
								if( ema2 <= 82.8032 )
									ret := -0.077626
								if( ema2 > 82.8032 )
									ret := 0.173267
						if( smma4 > 91.3701 )
							if( smma4 <= 93.6997 )
								if( smma1 <= 84.8488 )
									ret := 0.876543 // buy
								if( smma1 > 84.8488 )
									ret := 0.058824
							if( smma4 > 93.6997 )
								if( ema2 <= 84.5813 )
									ret := 0.574713
								if( ema2 > 84.5813 )
									ret := -0.032680
		if( smma1 > 84.954 )
			if( smma2 <= 120.49 )
				if( ema2 <= 118.682 )
					if( smma2 <= 119.294 )
						if( smma4 <= 124.825 )
							if( ema2 <= 116.565 )
								if( smma2 <= 110.886 )
									ret := 0.003161
								if( smma2 > 110.886 )
									ret := 0.149831
							if( ema2 > 116.565 )
								if( smma1 <= 112.597 )
									ret := 0.363636
								if( smma1 > 112.597 )
									ret := -0.306338
						if( smma4 > 124.825 )
							if( smma4 <= 134.196 )
								if( ema2 <= 105.176 )
									ret := -0.237500
								if( ema2 > 105.176 )
									ret := -0.850575 // sell
							if( smma4 > 134.196 )
								if( smma1 <= 110.358 )
									ret := 0.851852 // buy
								if( smma1 > 110.358 )
									ret := 0.066667
					if( smma2 > 119.294 )
						if( smma4 <= 122.221 )
							if( smma3 <= 120.692 )
								if( smma1 <= 120.282 )
									ret := -0.230769
								if( smma1 > 120.282 )
									ret := 0.769231 // buy
							if( smma3 > 120.692 )
								ret := -1.000000 // sell
						if( smma4 > 122.221 )
							if( smma1 <= 111.458 )
								ret := 0.000000
							if( smma1 > 111.458 )
								if( smma3 <= 120.196 )
									ret := 1.000000 // buy
								if( smma3 > 120.196 )
									ret := 0.705882 // buy
				if( ema2 > 118.682 )
					if( smma3 <= 110.428 )
						if( smma1 <= 111.95 )
							if( smma4 <= 100.199 )
								ret := -1.000000 // sell
							if( smma4 > 100.199 )
								if( smma3 <= 104.099 )
									ret := 0.750000 // buy
								if( smma3 > 104.099 )
									ret := 1.000000 // buy
						if( smma1 > 111.95 )
							if( smma1 <= 117.482 )
								if( smma1 <= 116.516 )
									ret := -0.862500 // sell
								if( smma1 > 116.516 )
									ret := -0.125000
							if( smma1 > 117.482 )
								if( smma4 <= 101.119 )
									ret := -0.750000 // sell
								if( smma4 > 101.119 )
									ret := -1.000000 // sell
					if( smma3 > 110.428 )
						if( smma4 <= 108.939 )
							if( smma2 <= 115.573 )
								if( smma1 <= 115.604 )
									ret := 0.769231 // buy
								if( smma1 > 115.604 )
									ret := 1.000000 // buy
							if( smma2 > 115.573 )
								if( ema2 <= 123.384 )
									ret := 0.818182 // buy
								if( ema2 > 123.384 )
									ret := -0.272727
						if( smma4 > 108.939 )
							if( ema2 <= 125.478 )
								if( smma4 <= 121.92 )
									ret := 0.067797
								if( smma4 > 121.92 )
									ret := -0.426778
							if( ema2 > 125.478 )
								if( ema2 <= 129.365 )
									ret := -0.603774
								if( ema2 > 129.365 )
									ret := -1.000000 // sell
			if( smma2 > 120.49 )
				if( smma3 <= 122.489 )
					if( ema2 <= 139.205 )
						if( smma1 <= 118.606 )
							if( smma4 <= 122.319 )
								ret := -1.000000 // sell
							if( smma4 > 122.319 )
								ret := -0.250000
						if( smma1 > 118.606 )
							if( ema2 <= 122.443 )
								if( smma3 <= 122.209 )
									ret := 0.825397 // buy
								if( smma3 > 122.209 )
									ret := 0.444444
							if( ema2 > 122.443 )
								if( smma4 <= 116.136 )
									ret := 0.551282
								if( smma4 > 116.136 )
									ret := 0.093960
					if( ema2 > 139.205 )
						if( smma1 <= 130.178 )
							ret := 0.000000
						if( smma1 > 130.178 )
							if( ema2 <= 140.194 )
								ret := -0.750000 // sell
							if( ema2 > 140.194 )
								ret := -1.000000 // sell
				if( smma3 > 122.489 )
					if( smma1 <= 399.436 )
						if( smma4 <= 440.168 )
							if( smma2 <= 394.614 )
								if( smma4 <= 411.846 )
									ret := 0.055714
								if( smma4 > 411.846 )
									ret := 0.394161
							if( smma2 > 394.614 )
								if( smma4 <= 384.2 )
									ret := 0.650685
								if( smma4 > 384.2 )
									ret := 0.196687
						if( smma4 > 440.168 )
							if( smma3 <= 424.808 )
								if( ema2 <= 286.031 )
									ret := -0.500000
								if( ema2 > 286.031 )
									ret := -0.940000 // sell
							if( smma3 > 424.808 )
								if( smma3 <= 467.176 )
									ret := 0.195652
								if( smma3 > 467.176 )
									ret := -0.920000 // sell
					if( smma1 > 399.436 )
						if( smma4 <= 415.799 )
							if( smma2 <= 467.76 )
								if( smma3 <= 431.569 )
									ret := -0.124934
								if( smma3 > 431.569 )
									ret := 0.508929
							if( smma2 > 467.76 )
								if( ema2 <= 503.604 )
									ret := -0.661765
								if( ema2 > 503.604 )
									ret := -1.000000 // sell
						if( smma4 > 415.799 )
							if( smma2 <= 450.263 )
								if( smma2 <= 446.354 )
									ret := 0.046440
								if( smma2 > 446.354 )
									ret := 0.668449
							if( smma2 > 450.263 )
								if( smma4 <= 444.823 )
									ret := 0.413333
								if( smma4 > 444.823 )
									ret := -0.049711
	if( ema2 > 558.519 )
		if( smma4 <= 522.005 )
			if( smma3 <= 535.805 )
				if( ema2 <= 569.88 )
					if( smma4 <= 496.093 )
						if( smma3 <= 477.553 )
							ret := 0.833333 // buy
						if( smma3 > 477.553 )
							if( ema2 <= 564.999 )
								if( smma3 <= 481.319 )
									ret := -0.400000
								if( smma3 > 481.319 )
									ret := -1.000000 // sell
							if( ema2 > 564.999 )
								ret := 0.000000
					if( smma4 > 496.093 )
						if( smma2 <= 535.29 )
							ret := 0.750000 // buy
						if( smma2 > 535.29 )
							ret := 1.000000 // buy
				if( ema2 > 569.88 )
					if( smma2 <= 549.473 )
						if( ema2 <= 580.675 )
							if( smma1 <= 542.704 )
								ret := -1.000000 // sell
							if( smma1 > 542.704 )
								ret := -0.200000
						if( ema2 > 580.675 )
							if( smma2 <= 521.188 )
								if( smma4 <= 472.635 )
									ret := -1.000000 // sell
								if( smma4 > 472.635 )
									ret := 0.571429
							if( smma2 > 521.188 )
								if( smma1 <= 566.795 )
									ret := -0.928571 // sell
								if( smma1 > 566.795 )
									ret := -0.750000 // sell
					if( smma2 > 549.473 )
						if( smma1 <= 573.09 )
							if( smma4 <= 502.501 )
								ret := 0.500000
							if( smma4 > 502.501 )
								ret := 1.000000 // buy
						if( smma1 > 573.09 )
							if( smma2 <= 556.591 )
								ret := -0.333333
							if( smma2 > 556.591 )
								if( smma4 <= 506.801 )
									ret := -1.000000 // sell
								if( smma4 > 506.801 )
									ret := -0.500000
			if( smma3 > 535.805 )
				if( smma2 <= 562.987 )
					if( smma1 <= 571.155 )
						ret := -1.000000 // sell
					if( smma1 > 571.155 )
						if( smma4 <= 511.974 )
							ret := -1.000000 // sell
						if( smma4 > 511.974 )
							ret := -0.500000
				if( smma2 > 562.987 )
					ret := -0.600000
		if( smma4 > 522.005 )
			if( smma2 <= 593.76 )
				if( smma2 <= 557.594 )
					if( smma2 <= 542.286 )
						if( ema2 <= 572.381 )
							ret := 1.000000 // buy
						if( ema2 > 572.381 )
							ret := -1.000000 // sell
					if( smma2 > 542.286 )
						if( ema2 <= 607.121 )
							ret := 1.000000 // buy
						if( ema2 > 607.121 )
							if( smma2 <= 551.66 )
								ret := 0.500000
							if( smma2 > 551.66 )
								ret := 1.000000 // buy
				if( smma2 > 557.594 )
					if( ema2 <= 636.05 )
						if( smma3 <= 563.739 )
							ret := -0.600000
						if( smma3 > 563.739 )
							if( smma1 <= 617.95 )
								ret := 1.000000 // buy
							if( smma1 > 617.95 )
								if( smma3 <= 567.174 )
									ret := 0.500000
								if( smma3 > 567.174 )
									ret := 1.000000 // buy
					if( ema2 > 636.05 )
						if( smma4 <= 535.218 )
							ret := 0.000000
						if( smma4 > 535.218 )
							ret := -1.000000 // sell
			if( smma2 > 593.76 )
				if( ema2 <= 597.257 )
					if( smma3 <= 579.291 )
						ret := 0.600000
					if( smma3 > 579.291 )
						ret := -1.000000 // sell
				if( ema2 > 597.257 )
					if( smma1 <= 629.003 )
						ret := -1.000000 // sell
					if( smma1 > 629.003 )
						ret := -0.500000
	
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
float op_operation = decision_tree_0_AAVEUSDT_30Min_ede0b8bb(bullishEngulfingInt, smma3, bullSigInt, bearishEngulfingInt, smma2, ema2, smma1, smma4, bearSigInt)

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


