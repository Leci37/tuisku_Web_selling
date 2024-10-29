//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: TMA_Overlay
// ID_model: GME_1Min_1TMA_d42cbf48 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GME_1Min_1TMA_d42cbf48", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GME_1Min_d42cbf48(bullishEngulfingInt, smma4, bullSigInt, smma2, ema2, bearSigInt, bearishEngulfingInt, smma3, smma1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema2 <= 21.5771 )
		if( smma2 <= 22.8802 )
			if( smma4 <= 21.8298 )
				if( ema2 <= 15.9503 )
					if( smma4 <= 12.3229 )
						if( ema2 <= 12.5559 )
							if( smma2 <= 11.9677 )
								if( smma2 <= 11.8375 )
									ret := 0.074656
								if( smma2 > 11.8375 )
									ret := -0.388889
							if( smma2 > 11.9677 )
								if( smma1 <= 12.5412 )
									ret := 0.784173 // buy
								if( smma1 > 12.5412 )
									ret := 0.381818
						if( ema2 > 12.5559 )
							if( smma2 <= 12.1976 )
								ret := 1.000000 // buy
							if( smma2 > 12.1976 )
								if( ema2 <= 12.6888 )
									ret := -0.639640
								if( ema2 > 12.6888 )
									ret := -0.328571
					if( smma4 > 12.3229 )
						if( smma2 <= 15.279 )
							if( ema2 <= 14.9127 )
								if( ema2 <= 13.0547 )
									ret := 0.896552 // buy
								if( ema2 > 13.0547 )
									ret := 0.305627
							if( ema2 > 14.9127 )
								if( smma1 <= 14.7301 )
									ret := 0.142857
								if( smma1 > 14.7301 )
									ret := 0.940476 // buy
						if( smma2 > 15.279 )
							if( smma1 <= 15.2315 )
								if( smma1 <= 15.0536 )
									ret := 0.750000 // buy
								if( smma1 > 15.0536 )
									ret := -0.738095 // sell
							if( smma1 > 15.2315 )
								if( smma3 <= 15.5512 )
									ret := 0.538071
								if( smma3 > 15.5512 )
									ret := 0.142415
				if( ema2 > 15.9503 )
					if( ema2 <= 16.4273 )
						if( smma3 <= 16.2359 )
							if( smma1 <= 16.1105 )
								if( smma3 <= 15.8975 )
									ret := 0.338983
								if( smma3 > 15.8975 )
									ret := -0.080189
							if( smma1 > 16.1105 )
								if( smma4 <= 15.997 )
									ret := -0.365385
								if( smma4 > 15.997 )
									ret := 0.124260
						if( smma3 > 16.2359 )
							if( smma1 <= 16.3476 )
								if( ema2 <= 15.9894 )
									ret := -0.380952
								if( ema2 > 15.9894 )
									ret := -0.919355 // sell
							if( smma1 > 16.3476 )
								if( smma4 <= 16.3549 )
									ret := 0.125000
								if( smma4 > 16.3549 )
									ret := -0.916667 // sell
					if( ema2 > 16.4273 )
						if( smma4 <= 21.7412 )
							if( smma3 <= 21.6023 )
								if( bullishEngulfingInt <= 0.5 )
									ret := 0.080254
								if( bullishEngulfingInt > 0.5 )
									ret := -0.046512
							if( smma3 > 21.6023 )
								if( smma1 <= 21.5267 )
									ret := 0.531915
								if( smma1 > 21.5267 )
									ret := 0.234432
						if( smma4 > 21.7412 )
							if( smma2 <= 21.6875 )
								if( smma3 <= 21.198 )
									ret := 0.253731
								if( smma3 > 21.198 )
									ret := -0.281250
							if( smma2 > 21.6875 )
								if( smma1 <= 21.5226 )
									ret := 0.125000
								if( smma1 > 21.5226 )
									ret := 0.937500 // buy
			if( smma4 > 21.8298 )
				if( ema2 <= 20.3395 )
					if( smma2 <= 20.6503 )
						if( smma4 <= 23.1115 )
							if( smma1 <= 20.2836 )
								ret := 0.750000 // buy
							if( smma1 > 20.2836 )
								ret := 1.000000 // buy
						if( smma4 > 23.1115 )
							if( ema2 <= 20.1868 )
								if( smma3 <= 21.3968 )
									ret := 1.000000 // buy
								if( smma3 > 21.3968 )
									ret := 0.000000
							if( ema2 > 20.1868 )
								if( ema2 <= 20.2471 )
									ret := -0.250000
								if( ema2 > 20.2471 )
									ret := -1.000000 // sell
					if( smma2 > 20.6503 )
						if( smma1 <= 20.4474 )
							if( smma1 <= 20.3925 )
								ret := 1.000000 // buy
							if( smma1 > 20.3925 )
								if( smma3 <= 21.8431 )
									ret := 0.750000 // buy
								if( smma3 > 21.8431 )
									ret := 1.000000 // buy
						if( smma1 > 20.4474 )
							if( smma2 <= 21.0867 )
								ret := 0.400000
							if( smma2 > 21.0867 )
								ret := 1.000000 // buy
				if( ema2 > 20.3395 )
					if( smma4 <= 22.1927 )
						if( ema2 <= 21.4667 )
							if( smma2 <= 21.7854 )
								if( smma1 <= 21.5857 )
									ret := 0.464583
								if( smma1 > 21.5857 )
									ret := -0.370370
							if( smma2 > 21.7854 )
								if( smma3 <= 22.1436 )
									ret := 0.827586 // buy
								if( smma3 > 22.1436 )
									ret := 0.111111
						if( ema2 > 21.4667 )
							if( smma2 <= 21.8189 )
								if( smma4 <= 21.8601 )
									ret := 0.365079
								if( smma4 > 21.8601 )
									ret := -0.216561
							if( smma2 > 21.8189 )
								if( smma1 <= 21.6853 )
									ret := 0.954545 // buy
								if( smma1 > 21.6853 )
									ret := -0.500000
					if( smma4 > 22.1927 )
						if( smma2 <= 21.6417 )
							if( smma2 <= 20.6107 )
								if( smma1 <= 20.6574 )
									ret := 0.518519
								if( smma1 > 20.6574 )
									ret := -0.818182 // sell
							if( smma2 > 20.6107 )
								if( smma1 <= 20.4115 )
									ret := 1.000000 // buy
								if( smma1 > 20.4115 )
									ret := -0.427152
						if( smma2 > 21.6417 )
							if( smma2 <= 22.0842 )
								if( ema2 <= 21.1971 )
									ret := 0.912500 // buy
								if( ema2 > 21.1971 )
									ret := 0.168831
							if( smma2 > 22.0842 )
								if( smma3 <= 22.6905 )
									ret := 0.733333 // buy
								if( smma3 > 22.6905 )
									ret := -0.537313
		if( smma2 > 22.8802 )
			ret := 1.000000 // buy
	if( ema2 > 21.5771 )
		if( smma4 <= 51.7341 )
			if( ema2 <= 38.6397 )
				if( smma3 <= 37.6911 )
					if( smma2 <= 37.0158 )
						if( smma4 <= 41.6533 )
							if( ema2 <= 37.0355 )
								if( ema2 <= 35.975 )
									ret := 0.026713
								if( ema2 > 35.975 )
									ret := 0.403175
							if( ema2 > 37.0355 )
								if( smma2 <= 36.8945 )
									ret := -0.405063
								if( smma2 > 36.8945 )
									ret := 0.888889 // buy
						if( smma4 > 41.6533 )
							if( smma2 <= 34.6087 )
								ret := 1.000000 // buy
							if( smma2 > 34.6087 )
								ret := 0.500000
					if( smma2 > 37.0158 )
						if( smma4 <= 38.2331 )
							if( smma2 <= 37.5605 )
								if( smma4 <= 38.1728 )
									ret := 0.692308
								if( smma4 > 38.1728 )
									ret := 0.933333 // buy
							if( smma2 > 37.5605 )
								ret := 1.000000 // buy
						if( smma4 > 38.2331 )
							if( smma4 <= 38.2627 )
								ret := -0.500000
							if( smma4 > 38.2627 )
								if( ema2 <= 35.1381 )
									ret := 1.000000 // buy
								if( ema2 > 35.1381 )
									ret := 0.500000
				if( smma3 > 37.6911 )
					if( smma4 <= 42.1652 )
						if( ema2 <= 35.3834 )
							if( smma4 <= 36.9232 )
								if( ema2 <= 29.4776 )
									ret := -0.750000 // sell
								if( ema2 > 29.4776 )
									ret := -1.000000 // sell
							if( smma4 > 36.9232 )
								if( smma4 <= 41.4827 )
									ret := 0.340000
								if( smma4 > 41.4827 )
									ret := -0.250000
						if( ema2 > 35.3834 )
							if( smma1 <= 37.8724 )
								if( smma4 <= 42.1313 )
									ret := -1.000000 // sell
								if( smma4 > 42.1313 )
									ret := -0.750000 // sell
							if( smma1 > 37.8724 )
								if( ema2 <= 36.9534 )
									ret := -0.285714
								if( ema2 > 36.9534 )
									ret := -0.894737 // sell
					if( smma4 > 42.1652 )
						if( smma3 <= 48.0361 )
							if( smma1 <= 33.5167 )
								if( ema2 <= 33.9059 )
									ret := 1.000000 // buy
								if( ema2 > 33.9059 )
									ret := -0.666667
							if( smma1 > 33.5167 )
								if( smma1 <= 38.4838 )
									ret := -0.039164
								if( smma1 > 38.4838 )
									ret := -0.534884
						if( smma3 > 48.0361 )
							if( smma2 <= 46.6814 )
								if( smma2 <= 45.9042 )
									ret := 1.000000 // buy
								if( smma2 > 45.9042 )
									ret := -0.333333
							if( smma2 > 46.6814 )
								ret := 1.000000 // buy
			if( ema2 > 38.6397 )
				if( smma4 <= 48.4663 )
					if( smma1 <= 39.76 )
						if( ema2 <= 43.715 )
							if( smma1 <= 38.7312 )
								if( smma1 <= 36.7741 )
									ret := 0.525000
								if( smma1 > 36.7741 )
									ret := 0.936937 // buy
							if( smma1 > 38.7312 )
								if( ema2 <= 40.8472 )
									ret := 0.668103
								if( ema2 > 40.8472 )
									ret := -0.500000
						if( ema2 > 43.715 )
							ret := -1.000000 // sell
					if( smma1 > 39.76 )
						if( ema2 <= 41.3611 )
							if( smma2 <= 39.2915 )
								if( ema2 <= 39.7539 )
									ret := 0.057971
								if( ema2 > 39.7539 )
									ret := -0.717105 // sell
							if( smma2 > 39.2915 )
								if( smma4 <= 36.2648 )
									ret := 0.450704
								if( smma4 > 36.2648 )
									ret := -0.591304
						if( ema2 > 41.3611 )
							if( smma2 <= 38.6006 )
								if( smma4 <= 26.7487 )
									ret := 0.470588
								if( smma4 > 26.7487 )
									ret := -0.716418 // sell
							if( smma2 > 38.6006 )
								if( smma1 <= 65.4806 )
									ret := 0.363905
								if( smma1 > 65.4806 )
									ret := -0.666667
				if( smma4 > 48.4663 )
					if( smma1 <= 54.3534 )
						if( ema2 <= 53.5418 )
							if( smma4 <= 48.8542 )
								if( smma3 <= 48.0324 )
									ret := -0.862745 // sell
								if( smma3 > 48.0324 )
									ret := -0.285714
							if( smma4 > 48.8542 )
								if( smma4 <= 51.3138 )
									ret := 0.126095
								if( smma4 > 51.3138 )
									ret := -0.492063
						if( ema2 > 53.5418 )
							if( smma2 <= 52.9195 )
								if( smma3 <= 48.3174 )
									ret := 0.000000
								if( smma3 > 48.3174 )
									ret := -0.888889 // sell
							if( smma2 > 52.9195 )
								if( ema2 <= 54.8176 )
									ret := 0.619048
								if( ema2 > 54.8176 )
									ret := -0.812500 // sell
					if( smma1 > 54.3534 )
						if( smma4 <= 51.3491 )
							if( smma4 <= 48.7051 )
								if( smma1 <= 60.7489 )
									ret := 0.250000
								if( smma1 > 60.7489 )
									ret := -0.857143 // sell
							if( smma4 > 48.7051 )
								if( ema2 <= 62.1688 )
									ret := 0.561798
								if( ema2 > 62.1688 )
									ret := -0.090909
						if( smma4 > 51.3491 )
							if( smma4 <= 51.5355 )
								if( smma4 <= 51.4946 )
									ret := 1.000000 // buy
								if( smma4 > 51.4946 )
									ret := 0.833333 // buy
							if( smma4 > 51.5355 )
								if( smma3 <= 56.7469 )
									ret := -0.400000
								if( smma3 > 56.7469 )
									ret := 0.913043 // buy
		if( smma4 > 51.7341 )
			if( ema2 <= 54.3233 )
				if( smma3 <= 53.2944 )
					if( smma3 <= 51.522 )
						if( smma1 <= 45.6976 )
							if( smma1 <= 42.4188 )
								ret := 0.000000
							if( smma1 > 42.4188 )
								if( smma3 <= 50.7008 )
									ret := -0.500000
								if( smma3 > 50.7008 )
									ret := -1.000000 // sell
						if( smma1 > 45.6976 )
							if( smma4 <= 52.0633 )
								ret := 0.428571
							if( smma4 > 52.0633 )
								ret := 1.000000 // buy
					if( smma3 > 51.522 )
						if( smma1 <= 50.7981 )
							if( smma4 <= 52.6704 )
								if( smma2 <= 51.5215 )
									ret := -0.957447 // sell
								if( smma2 > 51.5215 )
									ret := -0.500000
							if( smma4 > 52.6704 )
								if( ema2 <= 42.4426 )
									ret := 1.000000 // buy
								if( ema2 > 42.4426 )
									ret := -0.906250 // sell
						if( smma1 > 50.7981 )
							if( ema2 <= 49.3037 )
								ret := 0.666667
							if( ema2 > 49.3037 )
								if( smma3 <= 53.1816 )
									ret := -1.000000 // sell
								if( smma3 > 53.1816 )
									ret := -0.800000 // sell
				if( smma3 > 53.2944 )
					if( smma3 <= 55.4601 )
						if( smma4 <= 53.6369 )
							if( ema2 <= 50.3507 )
								if( smma2 <= 51.9215 )
									ret := 0.450000
								if( smma2 > 51.9215 )
									ret := 0.882883 // buy
							if( ema2 > 50.3507 )
								if( smma2 <= 52.6548 )
									ret := -1.000000 // sell
								if( smma2 > 52.6548 )
									ret := 0.514706
						if( smma4 > 53.6369 )
							if( smma2 <= 53.8505 )
								if( ema2 <= 45.2421 )
									ret := 0.500000
								if( ema2 > 45.2421 )
									ret := -0.885714 // sell
							if( smma2 > 53.8505 )
								if( ema2 <= 50.5152 )
									ret := 0.687500
								if( ema2 > 50.5152 )
									ret := -1.000000 // sell
					if( smma3 > 55.4601 )
						if( smma3 <= 55.8409 )
							if( smma3 <= 55.5426 )
								if( smma2 <= 53.2508 )
									ret := -0.500000
								if( smma2 > 53.2508 )
									ret := -0.714286 // sell
							if( smma3 > 55.5426 )
								if( smma2 <= 54.4574 )
									ret := -0.812500 // sell
								if( smma2 > 54.4574 )
									ret := -1.000000 // sell
						if( smma3 > 55.8409 )
							if( smma3 <= 59.2197 )
								if( ema2 <= 52.4151 )
									ret := 0.539216
								if( ema2 > 52.4151 )
									ret := -0.781250 // sell
							if( smma3 > 59.2197 )
								if( smma1 <= 63.7102 )
									ret := 0.945946 // buy
								if( smma1 > 63.7102 )
									ret := -0.250000
			if( ema2 > 54.3233 )
				if( smma2 <= 61.3518 )
					if( smma2 <= 61.0276 )
						if( smma1 <= 58.2358 )
							if( smma2 <= 53.5208 )
								ret := 1.000000 // buy
							if( smma2 > 53.5208 )
								if( smma1 <= 57.12 )
									ret := -0.714286 // sell
								if( smma1 > 57.12 )
									ret := -0.941176 // sell
						if( smma1 > 58.2358 )
							if( smma3 <= 59.0373 )
								if( ema2 <= 56.4575 )
									ret := 1.000000 // buy
								if( ema2 > 56.4575 )
									ret := -0.567568
							if( smma3 > 59.0373 )
								if( ema2 <= 56.9157 )
									ret := 1.000000 // buy
								if( ema2 > 56.9157 )
									ret := 0.500000
					if( smma2 > 61.0276 )
						if( smma3 <= 59.0683 )
							if( bullishEngulfingInt <= 0.5 )
								if( smma3 <= 58.3065 )
									ret := 0.571429
								if( smma3 > 58.3065 )
									ret := 0.897436 // buy
							if( bullishEngulfingInt > 0.5 )
								ret := 0.000000
						if( smma3 > 59.0683 )
							ret := -0.500000
				if( smma2 > 61.3518 )
					if( smma4 <= 51.949 )
						ret := 0.666667
					if( smma4 > 51.949 )
						if( smma3 <= 59.3786 )
							if( smma4 <= 54.3005 )
								ret := -1.000000 // sell
							if( smma4 > 54.3005 )
								if( ema2 <= 62.3209 )
									ret := -0.400000
								if( ema2 > 62.3209 )
									ret := -0.800000 // sell
						if( smma3 > 59.3786 )
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
float op_operation = decision_tree_0_GME_1Min_d42cbf48(bullishEngulfingInt, smma4, bullSigInt, smma2, ema2, bearSigInt, bearishEngulfingInt, smma3, smma1)

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


