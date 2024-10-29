//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: TMA_Overlay
// ID_model: MSFT_5Min_1TMA_2eb414e2 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_5Min_1TMA_2eb414e2", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_5Min_2eb414e2(bullishEngulfingInt, smma4, bullSigInt, smma2, ema2, bearSigInt, bearishEngulfingInt, smma3, smma1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema2 <= 328.264 )
		if( ema2 <= 325.305 )
			if( smma2 <= 329.306 )
				if( smma1 <= 280.588 )
					if( smma1 <= 277.566 )
						ret := 1.000000 // buy
					if( smma1 > 277.566 )
						if( ema2 <= 276.985 )
							if( smma3 <= 279.993 )
								ret := 0.200000
							if( smma3 > 279.993 )
								ret := 0.500000
						if( ema2 > 276.985 )
							if( smma4 <= 281.876 )
								if( smma1 <= 278.52 )
									ret := -1.000000 // sell
								if( smma1 > 278.52 )
									ret := -0.560440
							if( smma4 > 281.876 )
								if( ema2 <= 280.007 )
									ret := 1.000000 // buy
								if( ema2 > 280.007 )
									ret := -0.714286 // sell
				if( smma1 > 280.588 )
					if( ema2 <= 295.483 )
						if( smma2 <= 295.904 )
							if( smma1 <= 280.894 )
								ret := 0.000000
							if( smma1 > 280.894 )
								if( smma1 <= 295.388 )
									ret := 0.925373 // buy
								if( smma1 > 295.388 )
									ret := 0.761905 // buy
						if( smma2 > 295.904 )
							ret := 0.000000
					if( ema2 > 295.483 )
						if( ema2 <= 306.884 )
							if( smma4 <= 292.245 )
								if( smma2 <= 295.612 )
									ret := 0.165680
								if( smma2 > 295.612 )
									ret := -0.518182
							if( smma4 > 292.245 )
								if( smma4 <= 305.927 )
									ret := 0.213294
								if( smma4 > 305.927 )
									ret := 0.698795
						if( ema2 > 306.884 )
							if( smma3 <= 306.346 )
								if( smma2 <= 306.37 )
									ret := 0.019231
								if( smma2 > 306.37 )
									ret := -0.546218
							if( smma3 > 306.346 )
								if( smma2 <= 306.871 )
									ret := 0.782609 // buy
								if( smma2 > 306.871 )
									ret := 0.069059
			if( smma2 > 329.306 )
				if( smma3 <= 331.553 )
					if( smma4 <= 327.478 )
						if( smma1 <= 327.6 )
							ret := -0.750000 // sell
						if( smma1 > 327.6 )
							ret := -1.000000 // sell
					if( smma4 > 327.478 )
						if( smma3 <= 329.964 )
							ret := -0.250000
						if( smma3 > 329.964 )
							ret := -1.000000 // sell
				if( smma3 > 331.553 )
					if( smma4 <= 332.888 )
						ret := 0.000000
					if( smma4 > 332.888 )
						ret := -0.666667
		if( ema2 > 325.305 )
			if( smma4 <= 333.657 )
				if( smma1 <= 330.007 )
					if( smma1 <= 324.136 )
						if( smma1 <= 323.117 )
							ret := 0.000000
						if( smma1 > 323.117 )
							if( ema2 <= 325.664 )
								ret := 1.000000 // buy
							if( ema2 > 325.664 )
								if( smma1 <= 323.561 )
									ret := 1.000000 // buy
								if( smma1 > 323.561 )
									ret := 0.428571
					if( smma1 > 324.136 )
						if( smma1 <= 327.175 )
							if( smma3 <= 328.399 )
								if( smma4 <= 329.161 )
									ret := 0.115132
								if( smma4 > 329.161 )
									ret := 0.631579
							if( smma3 > 328.399 )
								if( ema2 <= 325.717 )
									ret := 0.736842 // buy
								if( ema2 > 325.717 )
									ret := -0.531250
						if( smma1 > 327.175 )
							if( smma2 <= 327.858 )
								if( smma2 <= 326.949 )
									ret := 0.070175
								if( smma2 > 326.949 )
									ret := 0.616915
							if( smma2 > 327.858 )
								if( ema2 <= 327.445 )
									ret := 0.435897
								if( ema2 > 327.445 )
									ret := -0.008772
				if( smma1 > 330.007 )
					if( smma2 <= 331.845 )
						if( smma2 <= 330.764 )
							ret := -0.142857
						if( smma2 > 330.764 )
							if( ema2 <= 328.121 )
								ret := -1.000000 // sell
							if( ema2 > 328.121 )
								ret := -0.750000 // sell
					if( smma2 > 331.845 )
						if( ema2 <= 327.195 )
							ret := 0.666667
						if( ema2 > 327.195 )
							ret := -1.000000 // sell
			if( smma4 > 333.657 )
				if( ema2 <= 328.081 )
					if( smma4 <= 335.031 )
						if( smma2 <= 331.691 )
							if( smma3 <= 333.168 )
								if( ema2 <= 327.945 )
									ret := 1.000000 // buy
								if( ema2 > 327.945 )
									ret := 0.769231 // buy
							if( smma3 > 333.168 )
								ret := 0.200000
						if( smma2 > 331.691 )
							if( smma3 <= 333.078 )
								if( smma4 <= 333.811 )
									ret := 1.000000 // buy
								if( smma4 > 333.811 )
									ret := 0.000000
							if( smma3 > 333.078 )
								ret := -0.500000
					if( smma4 > 335.031 )
						if( smma1 <= 331.681 )
							ret := 1.000000 // buy
						if( smma1 > 331.681 )
							ret := 0.750000 // buy
				if( ema2 > 328.081 )
					if( smma3 <= 332.285 )
						if( smma1 <= 329.17 )
							ret := 0.500000
						if( smma1 > 329.17 )
							ret := 1.000000 // buy
					if( smma3 > 332.285 )
						if( smma4 <= 334.378 )
							if( smma1 <= 329.316 )
								ret := 0.000000
							if( smma1 > 329.316 )
								ret := -0.500000
						if( smma4 > 334.378 )
							if( ema2 <= 328.168 )
								ret := 0.750000 // buy
							if( ema2 > 328.168 )
								ret := 0.000000
	if( ema2 > 328.264 )
		if( smma3 <= 331.146 )
			if( smma2 <= 331.012 )
				if( smma4 <= 329.661 )
					if( ema2 <= 333.603 )
						if( smma1 <= 326.349 )
							if( smma2 <= 325.286 )
								if( smma1 <= 325.951 )
									ret := -0.625000
								if( smma1 > 325.951 )
									ret := -1.000000 // sell
							if( smma2 > 325.286 )
								ret := -0.250000
						if( smma1 > 326.349 )
							if( smma4 <= 322.055 )
								if( smma1 <= 328.538 )
									ret := -0.055556
								if( smma1 > 328.538 )
									ret := -1.000000 // sell
							if( smma4 > 322.055 )
								if( smma1 <= 327.735 )
									ret := 0.666667
								if( smma1 > 327.735 )
									ret := 0.099692
					if( ema2 > 333.603 )
						if( smma4 <= 328.323 )
							if( smma4 <= 325.867 )
								ret := -0.800000 // sell
							if( smma4 > 325.867 )
								ret := -1.000000 // sell
						if( smma4 > 328.323 )
							if( smma3 <= 329.458 )
								if( smma2 <= 330.303 )
									ret := -0.400000
								if( smma2 > 330.303 )
									ret := -1.000000 // sell
							if( smma3 > 329.458 )
								ret := 0.000000
				if( smma4 > 329.661 )
					if( smma2 <= 329.741 )
						if( smma2 <= 329.329 )
							if( smma4 <= 332.063 )
								if( smma2 <= 329.108 )
									ret := -0.479592
								if( smma2 > 329.108 )
									ret := -0.135802
							if( smma4 > 332.063 )
								ret := 0.750000 // buy
						if( smma2 > 329.329 )
							if( smma1 <= 330.035 )
								if( smma1 <= 328.981 )
									ret := 0.000000
								if( smma1 > 328.981 )
									ret := -0.900000 // sell
							if( smma1 > 330.035 )
								if( ema2 <= 332.775 )
									ret := 0.416667
								if( ema2 > 332.775 )
									ret := -1.000000 // sell
					if( smma2 > 329.741 )
						if( ema2 <= 328.955 )
							if( smma2 <= 330.037 )
								if( ema2 <= 328.51 )
									ret := 0.750000 // buy
								if( ema2 > 328.51 )
									ret := -0.142857
							if( smma2 > 330.037 )
								if( bullishEngulfingInt <= 0.5 )
									ret := -0.857143 // sell
								if( bullishEngulfingInt > 0.5 )
									ret := 0.750000 // buy
						if( ema2 > 328.955 )
							if( smma1 <= 331.096 )
								if( smma4 <= 330.891 )
									ret := 0.476821
								if( smma4 > 330.891 )
									ret := -0.161290
							if( smma1 > 331.096 )
								if( ema2 <= 332.639 )
									ret := 0.257143
								if( ema2 > 332.639 )
									ret := -0.656716
			if( smma2 > 331.012 )
				if( smma3 <= 329.539 )
					if( smma1 <= 332.724 )
						ret := -0.285714
					if( smma1 > 332.724 )
						if( smma4 <= 326.029 )
							ret := 1.000000 // buy
						if( smma4 > 326.029 )
							if( ema2 <= 334.025 )
								if( smma2 <= 331.37 )
									ret := 0.125000
								if( smma2 > 331.37 )
									ret := 0.909091 // buy
							if( ema2 > 334.025 )
								ret := -0.250000
				if( smma3 > 329.539 )
					if( smma2 <= 332.361 )
						if( smma1 <= 331 )
							if( ema2 <= 329.823 )
								if( smma3 <= 330.96 )
									ret := 0.428571
								if( smma3 > 330.96 )
									ret := 0.833333 // buy
							if( ema2 > 329.823 )
								if( smma4 <= 330.23 )
									ret := 0.000000
								if( smma4 > 330.23 )
									ret := -0.500000
						if( smma1 > 331 )
							if( ema2 <= 333.92 )
								if( smma1 <= 333.09 )
									ret := -0.545994
								if( smma1 > 333.09 )
									ret := -0.016393
							if( ema2 > 333.92 )
								if( smma4 <= 330.767 )
									ret := -0.853659 // sell
								if( smma4 > 330.767 )
									ret := 0.000000
					if( smma2 > 332.361 )
						if( smma1 <= 333.34 )
							if( smma2 <= 332.415 )
								ret := 0.200000
							if( smma2 > 332.415 )
								ret := 1.000000 // buy
						if( smma1 > 333.34 )
							if( smma2 <= 332.544 )
								ret := -0.166667
							if( smma2 > 332.544 )
								if( ema2 <= 336.342 )
									ret := 0.750000 // buy
								if( ema2 > 336.342 )
									ret := 0.000000
		if( smma3 > 331.146 )
			if( smma3 <= 331.786 )
				if( ema2 <= 332.831 )
					if( smma1 <= 328.979 )
						ret := -1.000000 // sell
					if( smma1 > 328.979 )
						if( smma2 <= 332.586 )
							if( ema2 <= 329.863 )
								if( smma4 <= 331.28 )
									ret := 0.857143 // buy
								if( smma4 > 331.28 )
									ret := 0.444444
							if( ema2 > 329.863 )
								if( smma2 <= 331.325 )
									ret := 0.146179
								if( smma2 > 331.325 )
									ret := 0.391753
						if( smma2 > 332.586 )
							if( smma1 <= 333.373 )
								if( smma2 <= 332.74 )
									ret := 1.000000 // buy
								if( smma2 > 332.74 )
									ret := 0.600000
							if( smma1 > 333.373 )
								if( ema2 <= 331.529 )
									ret := 0.750000 // buy
								if( ema2 > 331.529 )
									ret := -0.285714
				if( ema2 > 332.831 )
					if( smma1 <= 333.061 )
						if( ema2 <= 333.582 )
							if( smma4 <= 332.786 )
								if( smma2 <= 332.631 )
									ret := -0.288889
								if( smma2 > 332.631 )
									ret := 0.666667
							if( smma4 > 332.786 )
								if( smma1 <= 331.995 )
									ret := -0.250000
								if( smma1 > 331.995 )
									ret := 1.000000 // buy
						if( ema2 > 333.582 )
							if( smma1 <= 332.487 )
								if( smma4 <= 332.122 )
									ret := -0.250000
								if( smma4 > 332.122 )
									ret := 1.000000 // buy
							if( smma1 > 332.487 )
								if( smma4 <= 331.127 )
									ret := 0.500000
								if( smma4 > 331.127 )
									ret := 1.000000 // buy
					if( smma1 > 333.061 )
						if( smma1 <= 334.51 )
							if( smma4 <= 329.887 )
								if( smma3 <= 331.37 )
									ret := -0.714286 // sell
								if( smma3 > 331.37 )
									ret := -1.000000 // sell
							if( smma4 > 329.887 )
								if( smma1 <= 333.167 )
									ret := -0.857143 // sell
								if( smma1 > 333.167 )
									ret := -0.258621
						if( smma1 > 334.51 )
							if( smma1 <= 335.91 )
								ret := 0.750000 // buy
							if( smma1 > 335.91 )
								if( ema2 <= 337.146 )
									ret := 0.250000
								if( ema2 > 337.146 )
									ret := 0.000000
			if( smma3 > 331.786 )
				if( smma4 <= 463.612 )
					if( ema2 <= 406.456 )
						if( smma2 <= 405.585 )
							if( smma2 <= 404.653 )
								if( smma4 <= 381.729 )
									ret := 0.028355
								if( smma4 > 381.729 )
									ret := 0.119122
							if( smma2 > 404.653 )
								if( ema2 <= 397.157 )
									ret := -1.000000 // sell
								if( ema2 > 397.157 )
									ret := -0.149832
						if( smma2 > 405.585 )
							if( smma3 <= 406.353 )
								if( smma3 <= 404.394 )
									ret := -0.500000
								if( smma3 > 404.394 )
									ret := 0.791908 // buy
							if( smma3 > 406.353 )
								if( smma4 <= 406.835 )
									ret := -0.398305
								if( smma4 > 406.835 )
									ret := 0.234241
					if( ema2 > 406.456 )
						if( smma4 <= 411.228 )
							if( smma4 <= 406.343 )
								if( ema2 <= 416.473 )
									ret := 0.119367
								if( ema2 > 416.473 )
									ret := -0.800000 // sell
							if( smma4 > 406.343 )
								if( smma1 <= 415.274 )
									ret := -0.092503
								if( smma1 > 415.274 )
									ret := -0.641975
						if( smma4 > 411.228 )
							if( ema2 <= 407.198 )
								if( smma1 <= 406.886 )
									ret := 0.400000
								if( smma1 > 406.886 )
									ret := -0.428571
							if( ema2 > 407.198 )
								if( ema2 <= 409.918 )
									ret := 0.244378
								if( ema2 > 409.918 )
									ret := 0.034539
				if( smma4 > 463.612 )
					if( smma2 <= 465.622 )
						if( smma2 <= 464.672 )
							if( ema2 <= 459.683 )
								if( ema2 <= 459.186 )
									ret := 0.750000 // buy
								if( ema2 > 459.186 )
									ret := 0.000000
							if( ema2 > 459.683 )
								if( smma3 <= 464.508 )
									ret := -1.000000 // sell
								if( smma3 > 464.508 )
									ret := -0.111111
						if( smma2 > 464.672 )
							if( smma1 <= 464.212 )
								if( smma3 <= 465.487 )
									ret := -1.000000 // sell
								if( smma3 > 465.487 )
									ret := -0.500000
							if( smma1 > 464.212 )
								if( smma1 <= 465.81 )
									ret := -0.976744 // sell
								if( smma1 > 465.81 )
									ret := -0.750000 // sell
					if( smma2 > 465.622 )
						if( smma3 <= 466.267 )
							if( smma3 <= 465.842 )
								if( smma1 <= 465.497 )
									ret := 1.000000 // buy
								if( smma1 > 465.497 )
									ret := 0.166667
							if( smma3 > 465.842 )
								if( smma4 <= 464.664 )
									ret := -0.062500
								if( smma4 > 464.664 )
									ret := -0.352941
						if( smma3 > 466.267 )
							ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_MSFT_5Min_2eb414e2(bullishEngulfingInt, smma4, bullSigInt, smma2, ema2, bearSigInt, bearishEngulfingInt, smma3, smma1)

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


