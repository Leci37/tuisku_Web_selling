//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: TMA_Overlay
// ID_model: AFRM_1Min_1TMA_5208d37a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AFRM_1Min_1TMA_5208d37a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AFRM_1Min_5208d37a(bullishEngulfingInt, smma3, bullSigInt, bearishEngulfingInt, smma2, ema2, smma1, smma4, bearSigInt)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( smma1 <= 30.931 )
		if( smma4 <= 30.896 )
			if( ema2 <= 31.2184 )
				if( smma4 <= 30.8473 )
					if( smma1 <= 22.3179 )
						if( ema2 <= 22.1079 )
							if( smma4 <= 24.3582 )
								ret := 1.000000 // buy
							if( smma4 > 24.3582 )
								ret := 0.916667 // buy
						if( ema2 > 22.1079 )
							if( smma2 <= 22.7364 )
								if( smma3 <= 23.4065 )
									ret := 0.882353 // buy
								if( smma3 > 23.4065 )
									ret := 0.700000 // buy
							if( smma2 > 22.7364 )
								ret := -0.750000 // sell
					if( smma1 > 22.3179 )
						if( smma4 <= 25.0309 )
							if( smma3 <= 24.5658 )
								if( smma4 <= 24.7306 )
									ret := 0.103066
								if( smma4 > 24.7306 )
									ret := -0.448819
							if( smma3 > 24.5658 )
								if( smma1 <= 25.6929 )
									ret := -0.174154
								if( smma1 > 25.6929 )
									ret := -0.760000 // sell
						if( smma4 > 25.0309 )
							if( smma1 <= 24.4342 )
								if( ema2 <= 23.5164 )
									ret := -0.342857
								if( ema2 > 23.5164 )
									ret := 0.651584
							if( smma1 > 24.4342 )
								if( smma4 <= 25.1447 )
									ret := 0.260606
								if( smma4 > 25.1447 )
									ret := 0.021359
				if( smma4 > 30.8473 )
					if( smma2 <= 30.6714 )
						if( ema2 <= 30.5807 )
							if( ema2 <= 30.4424 )
								if( smma3 <= 30.5443 )
									ret := -0.666667
								if( smma3 > 30.5443 )
									ret := 0.650000
							if( ema2 > 30.4424 )
								if( smma2 <= 30.4391 )
									ret := 0.771429 // buy
								if( smma2 > 30.4391 )
									ret := 0.400000
						if( ema2 > 30.5807 )
							if( smma4 <= 30.8633 )
								ret := -0.866667 // sell
							if( smma4 > 30.8633 )
								ret := -1.000000 // sell
					if( smma2 > 30.6714 )
						if( smma2 <= 30.9797 )
							if( smma3 <= 30.9018 )
								if( smma3 <= 30.8853 )
									ret := -0.953488 // sell
								if( smma3 > 30.8853 )
									ret := -0.600000
							if( smma3 > 30.9018 )
								ret := -1.000000 // sell
						if( smma2 > 30.9797 )
							ret := 0.800000 // buy
			if( ema2 > 31.2184 )
				if( smma2 <= 30.5374 )
					if( smma2 <= 30.4737 )
						ret := -1.000000 // sell
					if( smma2 > 30.4737 )
						if( smma3 <= 30.3492 )
							ret := -0.850000 // sell
						if( smma3 > 30.3492 )
							ret := -1.000000 // sell
				if( smma2 > 30.5374 )
					if( smma2 <= 30.5524 )
						ret := 0.000000
					if( smma2 > 30.5524 )
						ret := -0.875000 // sell
		if( smma4 > 30.896 )
			if( smma4 <= 31.7059 )
				if( smma2 <= 30.7044 )
					if( smma2 <= 30.4538 )
						if( bullishEngulfingInt <= 0.5 )
							if( ema2 <= 29.6998 )
								if( smma1 <= 29.7668 )
									ret := -0.709091 // sell
								if( smma1 > 29.7668 )
									ret := 0.300000
							if( ema2 > 29.6998 )
								if( ema2 <= 31.7652 )
									ret := 0.587500
								if( ema2 > 31.7652 )
									ret := -0.454545
						if( bullishEngulfingInt > 0.5 )
							ret := 0.076923
					if( smma2 > 30.4538 )
						if( smma1 <= 30.5754 )
							if( ema2 <= 29.6395 )
								if( smma4 <= 31.2334 )
									ret := 0.642857
								if( smma4 > 31.2334 )
									ret := 0.900000 // buy
							if( ema2 > 29.6395 )
								if( bullishEngulfingInt <= 0.5 )
									ret := -0.503731
								if( bullishEngulfingInt > 0.5 )
									ret := 0.714286 // buy
						if( smma1 > 30.5754 )
							if( smma4 <= 31.1435 )
								if( smma1 <= 30.6078 )
									ret := 0.250000
								if( smma1 > 30.6078 )
									ret := -0.125000
							if( smma4 > 31.1435 )
								ret := 0.928571 // buy
				if( smma2 > 30.7044 )
					if( bullishEngulfingInt <= 0.5 )
						if( smma3 <= 30.9054 )
							if( smma1 <= 30.6633 )
								if( smma3 <= 30.852 )
									ret := 0.343750
								if( smma3 > 30.852 )
									ret := 0.960000 // buy
							if( smma1 > 30.6633 )
								if( smma3 <= 30.8587 )
									ret := -0.520000
								if( smma3 > 30.8587 )
									ret := 0.562500
						if( smma3 > 30.9054 )
							if( smma3 <= 30.9512 )
								if( smma3 <= 30.9228 )
									ret := 0.212121
								if( smma3 > 30.9228 )
									ret := -0.600000
							if( smma3 > 30.9512 )
								if( ema2 <= 30.9822 )
									ret := 0.334545
								if( ema2 > 30.9822 )
									ret := -0.298246
					if( bullishEngulfingInt > 0.5 )
						if( ema2 <= 30.5506 )
							ret := 0.058824
						if( ema2 > 30.5506 )
							if( smma4 <= 31.22 )
								if( ema2 <= 30.8105 )
									ret := 1.000000 // buy
								if( ema2 > 30.8105 )
									ret := 0.730769 // buy
							if( smma4 > 31.22 )
								if( smma3 <= 31.0413 )
									ret := -0.285714
								if( smma3 > 31.0413 )
									ret := 0.882353 // buy
			if( smma4 > 31.7059 )
				if( smma1 <= 30.7683 )
					if( smma3 <= 31.241 )
						ret := 0.454545
					if( smma3 > 31.241 )
						ret := 0.909091 // buy
				if( smma1 > 30.7683 )
					if( ema2 <= 30.7876 )
						if( smma1 <= 30.8609 )
							if( smma2 <= 31.0298 )
								ret := -0.250000
							if( smma2 > 31.0298 )
								ret := -0.428571
						if( smma1 > 30.8609 )
							if( smma2 <= 31.1775 )
								ret := 0.111111
							if( smma2 > 31.1775 )
								ret := 1.000000 // buy
					if( ema2 > 30.7876 )
						if( smma2 <= 30.9745 )
							ret := 0.000000
						if( smma2 > 30.9745 )
							if( smma4 <= 31.796 )
								ret := -1.000000 // sell
							if( smma4 > 31.796 )
								ret := -0.809524 // sell
	if( smma1 > 30.931 )
		if( smma2 <= 31.0027 )
			if( smma3 <= 30.9891 )
				if( smma2 <= 30.941 )
					if( smma2 <= 30.9191 )
						if( smma1 <= 31.0853 )
							if( smma2 <= 30.8644 )
								if( smma4 <= 30.8482 )
									ret := -0.381743
								if( smma4 > 30.8482 )
									ret := 1.000000 // buy
							if( smma2 > 30.8644 )
								if( smma1 <= 31.0438 )
									ret := 0.287770
								if( smma1 > 31.0438 )
									ret := -0.681818
						if( smma1 > 31.0853 )
							if( bearishEngulfingInt <= 0.5 )
								if( smma3 <= 30.7409 )
									ret := 0.250000
								if( smma3 > 30.7409 )
									ret := 0.000000
							if( bearishEngulfingInt > 0.5 )
								ret := 1.000000 // buy
					if( smma2 > 30.9191 )
						ret := -0.574468
				if( smma2 > 30.941 )
					if( ema2 <= 31.4598 )
						if( smma3 <= 30.8434 )
							if( ema2 <= 30.9902 )
								if( smma1 <= 31.0132 )
									ret := 0.903226 // buy
								if( smma1 > 31.0132 )
									ret := 0.125000
							if( ema2 > 30.9902 )
								if( smma3 <= 30.8245 )
									ret := -0.588235
								if( smma3 > 30.8245 )
									ret := -0.250000
						if( smma3 > 30.8434 )
							if( smma3 <= 30.9423 )
								if( ema2 <= 31.1109 )
									ret := -0.492308
								if( ema2 > 31.1109 )
									ret := -0.852941 // sell
							if( smma3 > 30.9423 )
								if( smma3 <= 30.9779 )
									ret := 0.127660
								if( smma3 > 30.9779 )
									ret := 0.571429
					if( ema2 > 31.4598 )
						ret := 0.775862 // buy
			if( smma3 > 30.9891 )
				if( ema2 <= 30.9165 )
					if( ema2 <= 30.7886 )
						ret := -0.400000
					if( ema2 > 30.7886 )
						if( smma4 <= 31.069 )
							ret := -1.000000 // sell
						if( smma4 > 31.069 )
							if( smma2 <= 30.9682 )
								if( smma1 <= 30.9361 )
									ret := 0.444444
								if( smma1 > 30.9361 )
									ret := 0.900000 // buy
							if( smma2 > 30.9682 )
								ret := 0.076923
				if( ema2 > 30.9165 )
					if( smma3 <= 31.0822 )
						if( smma1 <= 31.0334 )
							if( smma4 <= 31.2654 )
								if( smma2 <= 30.951 )
									ret := 0.125000
								if( smma2 > 30.951 )
									ret := -0.901639 // sell
							if( smma4 > 31.2654 )
								if( ema2 <= 31.0189 )
									ret := -0.270270
								if( ema2 > 31.0189 )
									ret := -0.945946 // sell
						if( smma1 > 31.0334 )
							ret := 0.214286
					if( smma3 > 31.0822 )
						if( smma2 <= 30.9656 )
							ret := 0.047619
						if( smma2 > 30.9656 )
							ret := -0.500000
		if( smma2 > 31.0027 )
			if( smma3 <= 31.0161 )
				if( ema2 <= 30.8884 )
					if( smma2 <= 31.0237 )
						ret := 0.352941
					if( smma2 > 31.0237 )
						if( smma3 <= 30.9563 )
							ret := 1.000000 // buy
						if( smma3 > 30.9563 )
							if( smma3 <= 30.9897 )
								ret := 0.142857
							if( smma3 > 30.9897 )
								if( smma3 <= 30.995 )
									ret := 1.000000 // buy
								if( smma3 > 30.995 )
									ret := 0.750000 // buy
				if( ema2 > 30.8884 )
					if( smma3 <= 30.8001 )
						if( smma1 <= 31.5112 )
							if( smma2 <= 31.0958 )
								if( smma4 <= 30.4348 )
									ret := -0.857143 // sell
								if( smma4 > 30.4348 )
									ret := 0.312500
							if( smma2 > 31.0958 )
								ret := 1.000000 // buy
						if( smma1 > 31.5112 )
							if( smma1 <= 31.9675 )
								if( smma2 <= 31.0965 )
									ret := 0.000000
								if( smma2 > 31.0965 )
									ret := 0.944444 // buy
							if( smma1 > 31.9675 )
								ret := -0.500000
					if( smma3 > 30.8001 )
						if( smma4 <= 30.9908 )
							if( smma2 <= 31.0207 )
								ret := 0.333333
							if( smma2 > 31.0207 )
								if( smma4 <= 30.488 )
									ret := -0.967742 // sell
								if( smma4 > 30.488 )
									ret := -0.511450
						if( smma4 > 30.9908 )
							if( ema2 <= 31.3341 )
								if( smma1 <= 31.0402 )
									ret := -0.333333
								if( smma1 > 31.0402 )
									ret := 0.000000
							if( ema2 > 31.3341 )
								ret := 0.857143 // buy
			if( smma3 > 31.0161 )
				if( smma4 <= 32.2823 )
					if( ema2 <= 32.1793 )
						if( ema2 <= 32.0128 )
							if( smma3 <= 32.0867 )
								if( smma1 <= 31.8169 )
									ret := 0.008305
								if( smma1 > 31.8169 )
									ret := 0.255728
							if( smma3 > 32.0867 )
								if( smma1 <= 32.0581 )
									ret := -0.573770
								if( smma1 > 32.0581 )
									ret := 0.743590 // buy
						if( ema2 > 32.0128 )
							if( smma2 <= 31.4811 )
								ret := 0.937500 // buy
							if( smma2 > 31.4811 )
								if( smma1 <= 31.8613 )
									ret := -0.845238 // sell
								if( smma1 > 31.8613 )
									ret := -0.242581
					if( ema2 > 32.1793 )
						if( smma3 <= 31.8056 )
							if( smma3 <= 31.5065 )
								if( smma2 <= 31.8403 )
									ret := -0.050420
								if( smma2 > 31.8403 )
									ret := 0.833333 // buy
							if( smma3 > 31.5065 )
								if( smma3 <= 31.7036 )
									ret := -0.533742
								if( smma3 > 31.7036 )
									ret := -0.333333
						if( smma3 > 31.8056 )
							if( smma4 <= 32.1963 )
								if( smma1 <= 32.8795 )
									ret := 0.241435
								if( smma1 > 32.8795 )
									ret := -0.413333
							if( smma4 > 32.1963 )
								if( smma3 <= 32.6797 )
									ret := 0.381166
								if( smma3 > 32.6797 )
									ret := 0.806818 // buy
				if( smma4 > 32.2823 )
					if( smma2 <= 34.2411 )
						if( smma2 <= 34.11 )
							if( bullSigInt <= 0.5 )
								if( smma3 <= 34.3201 )
									ret := -0.073005
								if( smma3 > 34.3201 )
									ret := -0.800000 // sell
							if( bullSigInt > 0.5 )
								if( smma4 <= 32.569 )
									ret := 0.041667
								if( smma4 > 32.569 )
									ret := -0.348837
						if( smma2 > 34.11 )
							if( smma3 <= 33.8213 )
								if( smma2 <= 34.1377 )
									ret := -0.666667
								if( smma2 > 34.1377 )
									ret := 0.142857
							if( smma3 > 33.8213 )
								if( smma3 <= 33.8802 )
									ret := -0.862745 // sell
								if( smma3 > 33.8802 )
									ret := -0.430233
					if( smma2 > 34.2411 )
						if( smma4 <= 34.0254 )
							if( smma3 <= 33.2591 )
								ret := 1.000000 // buy
							if( smma3 > 33.2591 )
								if( ema2 <= 34.4887 )
									ret := 0.734043 // buy
								if( ema2 > 34.4887 )
									ret := 0.072016
						if( smma4 > 34.0254 )
							if( smma2 <= 34.4254 )
								if( smma2 <= 34.3006 )
									ret := -0.300000
								if( smma2 > 34.3006 )
									ret := -0.860759 // sell
							if( smma2 > 34.4254 )
								if( smma1 <= 34.2892 )
									ret := 0.575000
								if( smma1 > 34.2892 )
									ret := -0.007506
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_AFRM_1Min_5208d37a(bullishEngulfingInt, smma3, bullSigInt, bearishEngulfingInt, smma2, ema2, smma1, smma4, bearSigInt)

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


