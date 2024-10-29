//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: TMA_Overlay
// ID_model: AMZN_5Min_1TMA_57346f87 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMZN_5Min_1TMA_57346f87", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMZN_5Min_57346f87(bullishEngulfingInt, smma3, bullSigInt, bearishEngulfingInt, smma2, ema2, smma1, smma4, bearSigInt)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( smma1 <= 187.253 )
		if( smma2 <= 125.864 )
			if( ema2 <= 122.551 )
				if( smma4 <= 103.954 )
					if( smma1 <= 104.062 )
						if( smma3 <= 103.451 )
							if( ema2 <= 102.745 )
								if( ema2 <= 101.73 )
									ret := 0.437500
								if( ema2 > 101.73 )
									ret := 0.930233 // buy
							if( ema2 > 102.745 )
								if( smma4 <= 103.602 )
									ret := 0.114865
								if( smma4 > 103.602 )
									ret := -0.594595
						if( smma3 > 103.451 )
							if( smma4 <= 103.915 )
								if( smma2 <= 103.747 )
									ret := 0.833333 // buy
								if( smma2 > 103.747 )
									ret := 1.000000 // buy
							if( smma4 > 103.915 )
								if( smma1 <= 103.775 )
									ret := 0.735294 // buy
								if( smma1 > 103.775 )
									ret := 0.358491
					if( smma1 > 104.062 )
						if( smma4 <= 103.694 )
							ret := -1.000000 // sell
						if( smma4 > 103.694 )
							if( smma1 <= 104.533 )
								if( smma3 <= 103.683 )
									ret := -0.294118
								if( smma3 > 103.683 )
									ret := -0.888889 // sell
							if( smma1 > 104.533 )
								if( ema2 <= 104.819 )
									ret := 0.846154 // buy
								if( ema2 > 104.819 )
									ret := -0.290323
				if( smma4 > 103.954 )
					if( smma1 <= 106.038 )
						if( smma3 <= 107.328 )
							if( ema2 <= 105.834 )
								if( smma2 <= 105.635 )
									ret := 0.012830
								if( smma2 > 105.635 )
									ret := -0.330396
							if( ema2 > 105.834 )
								if( smma3 <= 105.559 )
									ret := -0.905660 // sell
								if( smma3 > 105.559 )
									ret := -0.606061
						if( smma3 > 107.328 )
							if( smma1 <= 105.918 )
								if( smma2 <= 106.769 )
									ret := 0.833333 // buy
								if( smma2 > 106.769 )
									ret := 0.952381 // buy
							if( smma1 > 105.918 )
								if( smma3 <= 107.819 )
									ret := 0.153846
								if( smma3 > 107.819 )
									ret := 0.769231 // buy
					if( smma1 > 106.038 )
						if( smma1 <= 106.193 )
							ret := 0.787500 // buy
						if( smma1 > 106.193 )
							if( smma2 <= 105.497 )
								ret := -1.000000 // sell
							if( smma2 > 105.497 )
								if( smma3 <= 123.1 )
									ret := 0.041306
								if( smma3 > 123.1 )
									ret := -0.199387
			if( ema2 > 122.551 )
				if( smma2 <= 120.292 )
					ret := -1.000000 // sell
				if( smma2 > 120.292 )
					if( ema2 <= 126.044 )
						if( smma4 <= 125.674 )
							if( ema2 <= 124.856 )
								if( bearishEngulfingInt <= 0.5 )
									ret := 0.239212
								if( bearishEngulfingInt > 0.5 )
									ret := -0.029412
							if( ema2 > 124.856 )
								if( smma2 <= 124.723 )
									ret := -0.263456
								if( smma2 > 124.723 )
									ret := 0.216590
						if( smma4 > 125.674 )
							if( smma4 <= 126.489 )
								if( smma3 <= 125.698 )
									ret := 0.804781 // buy
								if( smma3 > 125.698 )
									ret := 0.357564
							if( smma4 > 126.489 )
								if( smma4 <= 127.329 )
									ret := -0.203463
								if( smma4 > 127.329 )
									ret := 0.273504
					if( ema2 > 126.044 )
						if( smma4 <= 123.073 )
							if( smma4 <= 122.917 )
								if( smma2 <= 123.529 )
									ret := 0.800000 // buy
								if( smma2 > 123.529 )
									ret := 0.000000
							if( smma4 > 122.917 )
								ret := 0.916667 // buy
						if( smma4 > 123.073 )
							if( smma3 <= 123.936 )
								if( smma2 <= 124.833 )
									ret := -0.285714
								if( smma2 > 124.833 )
									ret := -0.983871 // sell
							if( smma3 > 123.936 )
								if( smma4 <= 125.447 )
									ret := 0.350877
								if( smma4 > 125.447 )
									ret := -0.314706
		if( smma2 > 125.864 )
			if( smma2 <= 126.522 )
				if( bullishEngulfingInt <= 0.5 )
					if( smma4 <= 126.573 )
						if( smma4 <= 126.536 )
							if( ema2 <= 126.913 )
								if( smma3 <= 126.129 )
									ret := 0.070866
								if( smma3 > 126.129 )
									ret := -0.284946
							if( ema2 > 126.913 )
								if( smma3 <= 125.173 )
									ret := 1.000000 // buy
								if( smma3 > 125.173 )
									ret := 0.141935
						if( smma4 > 126.536 )
							if( smma4 <= 126.543 )
								ret := 1.000000 // buy
							if( smma4 > 126.543 )
								if( smma4 <= 126.552 )
									ret := 0.333333
								if( smma4 > 126.552 )
									ret := 0.777778 // buy
					if( smma4 > 126.573 )
						if( smma3 <= 126.769 )
							if( smma2 <= 126.428 )
								if( ema2 <= 124.197 )
									ret := -1.000000 // sell
								if( ema2 > 124.197 )
									ret := -0.626168
							if( smma2 > 126.428 )
								ret := 0.000000
						if( smma3 > 126.769 )
							if( smma2 <= 126.267 )
								if( smma4 <= 127.418 )
									ret := 0.555556
								if( smma4 > 127.418 )
									ret := 0.137931
							if( smma2 > 126.267 )
								if( smma3 <= 126.915 )
									ret := 0.272727
								if( smma3 > 126.915 )
									ret := -0.659341
				if( bullishEngulfingInt > 0.5 )
					if( smma1 <= 126.184 )
						if( smma1 <= 125.85 )
							ret := 0.153846
						if( smma1 > 125.85 )
							if( ema2 <= 125.973 )
								ret := -0.750000 // sell
							if( ema2 > 125.973 )
								ret := 0.000000
					if( smma1 > 126.184 )
						if( smma1 <= 126.248 )
							if( smma2 <= 126.023 )
								ret := -1.000000 // sell
							if( smma2 > 126.023 )
								ret := 0.111111
						if( smma1 > 126.248 )
							if( smma4 <= 126.346 )
								if( ema2 <= 126.935 )
									ret := -0.875000 // sell
								if( ema2 > 126.935 )
									ret := -0.636364
							if( smma4 > 126.346 )
								ret := -1.000000 // sell
			if( smma2 > 126.522 )
				if( bearishEngulfingInt <= 0.5 )
					if( smma1 <= 127.551 )
						if( smma4 <= 128.426 )
							if( smma2 <= 127.099 )
								if( smma1 <= 126.43 )
									ret := -0.806452 // sell
								if( smma1 > 126.43 )
									ret := 0.096459
							if( smma2 > 127.099 )
								if( smma4 <= 127.244 )
									ret := 0.553846
								if( smma4 > 127.244 )
									ret := 0.047120
						if( smma4 > 128.426 )
							if( smma1 <= 126.931 )
								if( smma3 <= 127.626 )
									ret := 0.210526
								if( smma3 > 127.626 )
									ret := 0.693023
							if( smma1 > 126.931 )
								if( smma4 <= 129.989 )
									ret := 0.183333
								if( smma4 > 129.989 )
									ret := -1.000000 // sell
					if( smma1 > 127.551 )
						if( smma1 <= 127.928 )
							if( smma3 <= 129.242 )
								if( smma4 <= 125.655 )
									ret := 0.210526
								if( smma4 > 125.655 )
									ret := -0.287520
							if( smma3 > 129.242 )
								if( smma4 <= 130.304 )
									ret := -1.000000 // sell
								if( smma4 > 130.304 )
									ret := -0.941176 // sell
						if( smma1 > 127.928 )
							if( smma2 <= 127.615 )
								if( ema2 <= 127.814 )
									ret := 0.666667
								if( ema2 > 127.814 )
									ret := -0.534314
							if( smma2 > 127.615 )
								if( smma1 <= 128.304 )
									ret := 0.282638
								if( smma1 > 128.304 )
									ret := -0.005977
				if( bearishEngulfingInt > 0.5 )
					if( smma1 <= 178.538 )
						if( ema2 <= 128.139 )
							if( ema2 <= 125.536 )
								if( smma1 <= 126.472 )
									ret := 1.000000 // buy
								if( smma1 > 126.472 )
									ret := 0.750000 // buy
							if( ema2 > 125.536 )
								if( smma2 <= 126.745 )
									ret := -0.233333
								if( smma2 > 126.745 )
									ret := 0.506849
						if( ema2 > 128.139 )
							if( ema2 <= 178.105 )
								if( ema2 <= 130.543 )
									ret := -0.173669
								if( ema2 > 130.543 )
									ret := 0.064823
							if( ema2 > 178.105 )
								if( bearSigInt <= 0.5 )
									ret := -0.381818
								if( bearSigInt > 0.5 )
									ret := -1.000000 // sell
					if( smma1 > 178.538 )
						if( ema2 <= 179.983 )
							if( ema2 <= 178.468 )
								ret := -0.600000
							if( ema2 > 178.468 )
								if( smma4 <= 177.801 )
									ret := 0.111111
								if( smma4 > 177.801 )
									ret := 0.594828
						if( ema2 > 179.983 )
							if( bearSigInt <= 0.5 )
								if( smma4 <= 188.095 )
									ret := 0.209524
								if( smma4 > 188.095 )
									ret := 0.782609 // buy
							if( bearSigInt > 0.5 )
								if( smma2 <= 187.209 )
									ret := 0.077586
								if( smma2 > 187.209 )
									ret := -0.909091 // sell
	if( smma1 > 187.253 )
		if( ema2 <= 200.031 )
			if( smma3 <= 189.987 )
				if( smma2 <= 188.75 )
					if( smma1 <= 188.352 )
						if( smma4 <= 187.378 )
							if( smma3 <= 187.8 )
								if( ema2 <= 187.101 )
									ret := 0.239726
								if( ema2 > 187.101 )
									ret := -0.398438
							if( smma3 > 187.8 )
								if( smma4 <= 187.194 )
									ret := -0.947368 // sell
								if( smma4 > 187.194 )
									ret := -0.304348
						if( smma4 > 187.378 )
							if( smma4 <= 187.541 )
								if( ema2 <= 187.188 )
									ret := 0.939394 // buy
								if( ema2 > 187.188 )
									ret := 0.000000
							if( smma4 > 187.541 )
								if( smma1 <= 187.582 )
									ret := -0.301887
								if( smma1 > 187.582 )
									ret := 0.051724
					if( smma1 > 188.352 )
						if( smma2 <= 188.531 )
							if( ema2 <= 188.951 )
								if( smma4 <= 187.23 )
									ret := 0.760684 // buy
								if( smma4 > 187.23 )
									ret := 0.205882
							if( ema2 > 188.951 )
								if( smma1 <= 189.187 )
									ret := 0.061644
								if( smma1 > 189.187 )
									ret := 0.888889 // buy
						if( smma2 > 188.531 )
							ret := -0.120915
				if( smma2 > 188.75 )
					if( smma2 <= 189.355 )
						if( ema2 <= 191.822 )
							if( smma2 <= 189.074 )
								if( smma4 <= 187.065 )
									ret := -0.952941 // sell
								if( smma4 > 187.065 )
									ret := -0.447368
							if( smma2 > 189.074 )
								if( smma4 <= 187.713 )
									ret := -0.677215
								if( smma4 > 187.713 )
									ret := -0.158273
						if( ema2 > 191.822 )
							ret := 1.000000 // buy
					if( smma2 > 189.355 )
						if( smma3 <= 189.35 )
							if( smma1 <= 189.474 )
								if( smma4 <= 188.534 )
									ret := 0.500000
								if( smma4 > 188.534 )
									ret := 0.934211 // buy
							if( smma1 > 189.474 )
								if( smma3 <= 188.965 )
									ret := 0.540984
								if( smma3 > 188.965 )
									ret := -0.396226
						if( smma3 > 189.35 )
							if( ema2 <= 189.687 )
								if( smma3 <= 189.402 )
									ret := -0.058824
								if( smma3 > 189.402 )
									ret := -0.738318 // sell
							if( ema2 > 189.687 )
								if( ema2 <= 193.566 )
									ret := -0.226087
								if( ema2 > 193.566 )
									ret := -0.880000 // sell
			if( smma3 > 189.987 )
				if( smma2 <= 199.768 )
					if( smma2 <= 191.878 )
						if( smma4 <= 191.573 )
							if( smma4 <= 190.131 )
								ret := -0.025424
							if( smma4 > 190.131 )
								if( smma1 <= 191.905 )
									ret := 0.760417 // buy
								if( smma1 > 191.905 )
									ret := -0.200000
						if( smma4 > 191.573 )
							if( smma1 <= 187.598 )
								if( smma4 <= 191.935 )
									ret := -0.666667
								if( smma4 > 191.935 )
									ret := 0.666667
							if( smma1 > 187.598 )
								if( ema2 <= 186.815 )
									ret := 0.312500
								if( ema2 > 186.815 )
									ret := -0.602740
					if( smma2 > 191.878 )
						if( bullSigInt <= 0.5 )
							if( smma1 <= 192.69 )
								if( smma1 <= 192.033 )
									ret := -0.053097
								if( smma1 > 192.033 )
									ret := 0.623077
							if( smma1 > 192.69 )
								if( ema2 <= 196.32 )
									ret := -0.074113
								if( ema2 > 196.32 )
									ret := 0.090307
						if( bullSigInt > 0.5 )
							if( smma2 <= 193.22 )
								if( smma3 <= 192.6 )
									ret := 0.153846
								if( smma3 > 192.6 )
									ret := -0.461538
							if( smma2 > 193.22 )
								if( smma4 <= 198.154 )
									ret := -0.697674
								if( smma4 > 198.154 )
									ret := 0.000000
				if( smma2 > 199.768 )
					if( ema2 <= 199.405 )
						ret := -1.000000 // sell
					if( ema2 > 199.405 )
						if( smma4 <= 199.265 )
							ret := -0.101449
						if( smma4 > 199.265 )
							if( smma3 <= 199.728 )
								if( smma3 <= 199.71 )
									ret := -0.368421
								if( smma3 > 199.71 )
									ret := -0.956522 // sell
							if( smma3 > 199.728 )
								if( smma4 <= 199.636 )
									ret := 0.000000
								if( smma4 > 199.636 )
									ret := -1.000000 // sell
		if( ema2 > 200.031 )
			if( smma2 <= 199.933 )
				if( smma2 <= 198.957 )
					ret := -0.846154 // sell
				if( smma2 > 198.957 )
					if( ema2 <= 200.385 )
						if( smma3 <= 199.709 )
							if( smma2 <= 199.357 )
								ret := -0.545455
							if( smma2 > 199.357 )
								if( smma1 <= 199.965 )
									ret := 0.277778
								if( smma1 > 199.965 )
									ret := -0.125000
						if( smma3 > 199.709 )
							if( smma1 <= 199.93 )
								ret := -0.400000
							if( smma1 > 199.93 )
								if( smma2 <= 199.848 )
									ret := -1.000000 // sell
								if( smma2 > 199.848 )
									ret := -0.555556
					if( ema2 > 200.385 )
						if( smma4 <= 197.895 )
							if( smma1 <= 200.318 )
								ret := -0.111111
							if( smma1 > 200.318 )
								ret := -0.300000
						if( smma4 > 197.895 )
							ret := -1.000000 // sell
			if( smma2 > 199.933 )
				ret := -0.770492 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_AMZN_5Min_57346f87(bullishEngulfingInt, smma3, bullSigInt, bearishEngulfingInt, smma2, ema2, smma1, smma4, bearSigInt)

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


