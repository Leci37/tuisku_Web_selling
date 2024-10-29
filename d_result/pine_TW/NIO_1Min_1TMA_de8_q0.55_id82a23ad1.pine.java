//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: TMA_Overlay
// ID_model: NIO_1Min_1TMA_82a23ad1 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NIO_1Min_1TMA_82a23ad1", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NIO_1Min_82a23ad1(bullishEngulfingInt, smma4, bullSigInt, smma2, ema2, bearSigInt, bearishEngulfingInt, smma3, smma1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( bullishEngulfingInt <= 0.5 )
		if( ema2 <= 3.78661 )
			if( ema2 <= 3.70536 )
				if( smma1 <= 3.7276 )
					if( ema2 <= 3.69964 )
						if( smma4 <= 3.8657 )
							if( smma4 <= 3.78256 )
								if( smma2 <= 3.71258 )
									ret := 0.293367
								if( smma2 > 3.71258 )
									ret := -0.307692
							if( smma4 > 3.78256 )
								if( smma4 <= 3.83176 )
									ret := 0.727273 // buy
								if( smma4 > 3.83176 )
									ret := 0.173077
						if( smma4 > 3.8657 )
							ret := -1.000000 // sell
					if( ema2 > 3.69964 )
						if( smma4 <= 3.75937 )
							if( smma2 <= 3.7087 )
								if( smma3 <= 3.71862 )
									ret := 0.976744 // buy
								if( smma3 > 3.71862 )
									ret := 0.687500
							if( smma2 > 3.7087 )
								if( smma4 <= 3.74833 )
									ret := -0.812500 // sell
								if( smma4 > 3.74833 )
									ret := 0.959184 // buy
						if( smma4 > 3.75937 )
							if( smma1 <= 3.71452 )
								if( smma1 <= 3.70478 )
									ret := 0.447368
								if( smma1 > 3.70478 )
									ret := -0.125000
							if( smma1 > 3.71452 )
								if( smma1 <= 3.7224 )
									ret := 0.833333 // buy
								if( smma1 > 3.7224 )
									ret := 0.400000
				if( smma1 > 3.7276 )
					ret := -0.705882 // sell
			if( ema2 > 3.70536 )
				if( ema2 <= 3.75802 )
					if( smma2 <= 3.76949 )
						if( ema2 <= 3.73536 )
							if( smma3 <= 3.78089 )
								if( ema2 <= 3.73158 )
									ret := 0.049708
								if( ema2 > 3.73158 )
									ret := 0.559322
							if( smma3 > 3.78089 )
								if( ema2 <= 3.72419 )
									ret := -0.708333 // sell
								if( ema2 > 3.72419 )
									ret := -0.250000
						if( ema2 > 3.73536 )
							if( smma3 <= 3.71643 )
								if( smma4 <= 3.71527 )
									ret := -0.933333 // sell
								if( smma4 > 3.71527 )
									ret := -0.555556
							if( smma3 > 3.71643 )
								if( smma3 <= 3.76323 )
									ret := -0.078853
								if( smma3 > 3.76323 )
									ret := -0.540698
					if( smma2 > 3.76949 )
						if( ema2 <= 3.75403 )
							if( smma2 <= 3.79976 )
								if( smma1 <= 3.75053 )
									ret := 0.060606
								if( smma1 > 3.75053 )
									ret := 0.685567
							if( smma2 > 3.79976 )
								if( smma4 <= 3.87157 )
									ret := -1.000000 // sell
								if( smma4 > 3.87157 )
									ret := 0.800000 // buy
						if( ema2 > 3.75403 )
							if( smma1 <= 3.7805 )
								if( smma2 <= 3.78217 )
									ret := -0.447368
								if( smma2 > 3.78217 )
									ret := 0.409091
							if( smma1 > 3.7805 )
								ret := -1.000000 // sell
				if( ema2 > 3.75802 )
					if( smma4 <= 3.76493 )
						if( smma2 <= 3.77217 )
							if( smma4 <= 3.75093 )
								ret := 1.000000 // buy
							if( smma4 > 3.75093 )
								ret := 0.852273 // buy
						if( smma2 > 3.77217 )
							ret := -0.300000
					if( smma4 > 3.76493 )
						if( smma1 <= 3.77568 )
							if( smma3 <= 3.86305 )
								if( smma3 <= 3.77779 )
									ret := 0.441176
								if( smma3 > 3.77779 )
									ret := -0.334862
							if( smma3 > 3.86305 )
								ret := 0.764706 // buy
						if( smma1 > 3.77568 )
							if( smma1 <= 3.79155 )
								if( ema2 <= 3.77364 )
									ret := 0.756184 // buy
								if( ema2 > 3.77364 )
									ret := 0.285408
							if( smma1 > 3.79155 )
								if( smma4 <= 3.95428 )
									ret := 0.017621
								if( smma4 > 3.95428 )
									ret := 0.923077 // buy
		if( ema2 > 3.78661 )
			if( bearishEngulfingInt <= 0.5 )
				if( ema2 <= 7.3995 )
					if( smma3 <= 7.43949 )
						if( smma2 <= 7.2257 )
							if( smma1 <= 3.84962 )
								if( smma4 <= 3.92779 )
									ret := -0.082213
								if( smma4 > 3.92779 )
									ret := -0.876923 // sell
							if( smma1 > 3.84962 )
								if( ema2 <= 3.85774 )
									ret := 0.317365
								if( ema2 > 3.85774 )
									ret := -0.000682
						if( smma2 > 7.2257 )
							if( ema2 <= 7.36895 )
								if( smma3 <= 7.33454 )
									ret := -0.006494
								if( smma3 > 7.33454 )
									ret := -0.621908
							if( ema2 > 7.36895 )
								if( smma3 <= 7.43553 )
									ret := 0.419355
								if( smma3 > 7.43553 )
									ret := -0.800000 // sell
					if( smma3 > 7.43949 )
						if( smma1 <= 7.47011 )
							if( smma2 <= 7.46669 )
								ret := 0.882353 // buy
							if( smma2 > 7.46669 )
								if( smma4 <= 7.30288 )
									ret := 0.629630
								if( smma4 > 7.30288 )
									ret := -0.055556
						if( smma1 > 7.47011 )
							ret := 1.000000 // buy
				if( ema2 > 7.3995 )
					if( smma2 <= 7.50053 )
						if( ema2 <= 7.44992 )
							if( smma2 <= 7.44368 )
								if( smma4 <= 7.11164 )
									ret := -0.609756
								if( smma4 > 7.11164 )
									ret := 0.481481
							if( smma2 > 7.44368 )
								if( ema2 <= 7.4142 )
									ret := -0.444444
								if( ema2 > 7.4142 )
									ret := -0.917647 // sell
						if( ema2 > 7.44992 )
							if( smma4 <= 7.17804 )
								if( ema2 <= 7.50362 )
									ret := 0.000000
								if( ema2 > 7.50362 )
									ret := -0.526316
							if( smma4 > 7.17804 )
								if( smma4 <= 7.28851 )
									ret := 0.455319
								if( smma4 > 7.28851 )
									ret := -0.379310
					if( smma2 > 7.50053 )
						if( smma2 <= 7.50815 )
							if( smma2 <= 7.50403 )
								if( smma3 <= 7.45209 )
									ret := -0.307692
								if( smma3 > 7.45209 )
									ret := -1.000000 // sell
							if( smma2 > 7.50403 )
								ret := 0.125000
						if( smma2 > 7.50815 )
							if( ema2 <= 7.63869 )
								if( smma1 <= 7.53337 )
									ret := -0.937500 // sell
								if( smma1 > 7.53337 )
									ret := -1.000000 // sell
							if( ema2 > 7.63869 )
								if( ema2 <= 7.70393 )
									ret := -0.181818
								if( ema2 > 7.70393 )
									ret := -1.000000 // sell
			if( bearishEngulfingInt > 0.5 )
				if( bearSigInt <= 0.5 )
					if( smma4 <= 4.93796 )
						if( smma3 <= 3.80134 )
							if( ema2 <= 3.82259 )
								if( smma2 <= 3.78705 )
									ret := 0.400000
								if( smma2 > 3.78705 )
									ret := -0.312500
							if( ema2 > 3.82259 )
								ret := -0.916667 // sell
						if( smma3 > 3.80134 )
							if( smma1 <= 4.67197 )
								if( smma1 <= 4.66603 )
									ret := 0.238372
								if( smma1 > 4.66603 )
									ret := -0.806452 // sell
							if( smma1 > 4.67197 )
								if( smma3 <= 4.80126 )
									ret := 0.511182
								if( smma3 > 4.80126 )
									ret := 0.268939
					if( smma4 > 4.93796 )
						if( smma1 <= 5.10585 )
							if( ema2 <= 4.92135 )
								if( smma3 <= 4.96772 )
									ret := -0.142857
								if( smma3 > 4.96772 )
									ret := 0.142857
							if( ema2 > 4.92135 )
								if( smma3 <= 4.95005 )
									ret := -0.931034 // sell
								if( smma3 > 4.95005 )
									ret := -0.389610
						if( smma1 > 5.10585 )
							if( smma2 <= 5.21478 )
								if( smma4 <= 5.23876 )
									ret := 0.649573
								if( smma4 > 5.23876 )
									ret := 0.121951
							if( smma2 > 5.21478 )
								if( smma4 <= 5.14774 )
									ret := 0.931034 // buy
								if( smma4 > 5.14774 )
									ret := 0.117016
				if( bearSigInt > 0.5 )
					if( smma2 <= 3.9052 )
						if( smma3 <= 3.83108 )
							ret := 0.777778 // buy
						if( smma3 > 3.83108 )
							ret := 1.000000 // buy
					if( smma2 > 3.9052 )
						if( smma3 <= 4.09731 )
							if( smma1 <= 4.01723 )
								ret := -0.636364
							if( smma1 > 4.01723 )
								ret := -0.944444 // sell
						if( smma3 > 4.09731 )
							if( smma4 <= 5.30049 )
								if( smma3 <= 4.49028 )
									ret := -0.127907
								if( smma3 > 4.49028 )
									ret := 0.561983
							if( smma4 > 5.30049 )
								if( smma3 <= 5.52338 )
									ret := -0.679245
								if( smma3 > 5.52338 )
									ret := 0.141892
	if( bullishEngulfingInt > 0.5 )
		if( smma1 <= 6.79876 )
			if( smma1 <= 5.90011 )
				if( smma1 <= 4.50225 )
					if( smma2 <= 4.49745 )
						if( ema2 <= 4.48691 )
							if( bullSigInt <= 0.5 )
								if( ema2 <= 4.37648 )
									ret := -0.126270
								if( ema2 > 4.37648 )
									ret := -0.339901
							if( bullSigInt > 0.5 )
								if( smma3 <= 4.38394 )
									ret := -0.010204
								if( smma3 > 4.38394 )
									ret := -0.766667 // sell
						if( ema2 > 4.48691 )
							if( smma4 <= 4.44588 )
								if( ema2 <= 4.50825 )
									ret := 0.684211
								if( ema2 > 4.50825 )
									ret := 1.000000 // buy
							if( smma4 > 4.44588 )
								if( smma1 <= 4.48402 )
									ret := -0.153846
								if( smma1 > 4.48402 )
									ret := 0.538462
					if( smma2 > 4.49745 )
						if( smma1 <= 4.48168 )
							if( smma3 <= 4.58936 )
								ret := -0.800000 // sell
							if( smma3 > 4.58936 )
								ret := 0.090909
						if( smma1 > 4.48168 )
							if( ema2 <= 4.48473 )
								if( smma1 <= 4.48838 )
									ret := 0.833333 // buy
								if( smma1 > 4.48838 )
									ret := 1.000000 // buy
							if( ema2 > 4.48473 )
								ret := 0.205882
				if( smma1 > 4.50225 )
					if( smma4 <= 5.84448 )
						if( smma4 <= 5.77165 )
							if( smma1 <= 4.53469 )
								if( ema2 <= 4.52129 )
									ret := -0.458333
								if( ema2 > 4.52129 )
									ret := -0.767123 // sell
							if( smma1 > 4.53469 )
								if( smma1 <= 5.75319 )
									ret := -0.246229
								if( smma1 > 5.75319 )
									ret := 0.279070
						if( smma4 > 5.77165 )
							ret := 0.666667
					if( smma4 > 5.84448 )
						if( ema2 <= 5.81057 )
							ret := -0.181818
						if( ema2 > 5.81057 )
							if( smma1 <= 5.88221 )
								if( smma4 <= 5.93093 )
									ret := -1.000000 // sell
								if( smma4 > 5.93093 )
									ret := -0.545455
							if( smma1 > 5.88221 )
								ret := -1.000000 // sell
			if( smma1 > 5.90011 )
				if( smma2 <= 6.23573 )
					if( smma2 <= 6.06311 )
						if( smma3 <= 5.91552 )
							if( smma2 <= 5.89545 )
								ret := 0.000000
							if( smma2 > 5.89545 )
								ret := 0.750000 // buy
						if( smma3 > 5.91552 )
							ret := -0.047619
					if( smma2 > 6.06311 )
						if( smma4 <= 6.11534 )
							ret := 1.000000 // buy
						if( smma4 > 6.11534 )
							if( smma2 <= 6.18474 )
								if( smma1 <= 6.0888 )
									ret := 0.000000
								if( smma1 > 6.0888 )
									ret := 0.000000
							if( smma2 > 6.18474 )
								if( smma3 <= 6.22967 )
									ret := 0.769231 // buy
								if( smma3 > 6.22967 )
									ret := 0.400000
				if( smma2 > 6.23573 )
					if( smma3 <= 6.78483 )
						if( smma1 <= 6.67946 )
							if( smma1 <= 6.67592 )
								if( smma3 <= 6.70843 )
									ret := -0.227513
								if( smma3 > 6.70843 )
									ret := -1.000000 // sell
							if( smma1 > 6.67592 )
								ret := 1.000000 // buy
						if( smma1 > 6.67946 )
							if( smma3 <= 6.73818 )
								if( smma3 <= 6.70733 )
									ret := -0.500000
								if( smma3 > 6.70733 )
									ret := 0.000000
							if( smma3 > 6.73818 )
								if( smma3 <= 6.75498 )
									ret := -1.000000 // sell
								if( smma3 > 6.75498 )
									ret := -0.785714 // sell
					if( smma3 > 6.78483 )
						if( ema2 <= 6.75475 )
							if( ema2 <= 6.72427 )
								ret := 0.600000
							if( ema2 > 6.72427 )
								ret := 0.950000 // buy
						if( ema2 > 6.75475 )
							if( ema2 <= 6.8031 )
								if( smma3 <= 6.7931 )
									ret := -0.615385
								if( smma3 > 6.7931 )
									ret := 0.000000
							if( ema2 > 6.8031 )
								ret := 0.523810
		if( smma1 > 6.79876 )
			if( smma4 <= 7.18311 )
				if( bullSigInt <= 0.5 )
					if( smma4 <= 6.97551 )
						if( smma2 <= 6.83735 )
							if( smma1 <= 6.8329 )
								ret := -0.933333 // sell
							if( smma1 > 6.8329 )
								ret := -0.875000 // sell
						if( smma2 > 6.83735 )
							if( smma3 <= 6.92603 )
								if( smma4 <= 6.8858 )
									ret := -0.500000
								if( smma4 > 6.8858 )
									ret := 0.166667
							if( smma3 > 6.92603 )
								ret := -0.736842 // sell
					if( smma4 > 6.97551 )
						if( smma4 <= 7.14093 )
							if( smma2 <= 7.12239 )
								ret := 0.636364
							if( smma2 > 7.12239 )
								ret := 1.000000 // buy
						if( smma4 > 7.14093 )
							ret := -0.473684
				if( bullSigInt > 0.5 )
					if( smma2 <= 6.87875 )
						ret := -0.875000 // sell
					if( smma2 > 6.87875 )
						ret := -0.800000 // sell
			if( smma4 > 7.18311 )
				if( smma4 <= 7.32826 )
					if( ema2 <= 7.21043 )
						if( smma3 <= 7.23427 )
							ret := -0.857143 // sell
						if( smma3 > 7.23427 )
							ret := -1.000000 // sell
					if( ema2 > 7.21043 )
						ret := -0.642857
				if( smma4 > 7.32826 )
					ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_NIO_1Min_82a23ad1(bullishEngulfingInt, smma4, bullSigInt, smma2, ema2, bearSigInt, bearishEngulfingInt, smma3, smma1)

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


