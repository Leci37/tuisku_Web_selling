//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: TMA_Overlay
// ID_model: TRXUSDT_30Min_1TMA_c71ec878 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_30Min_1TMA_c71ec878", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_30Min_c71ec878(smma2, ema2, bullSigInt, smma3, smma1, bearSigInt, smma4, bullishEngulfingInt, bearishEngulfingInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema2 <= 0.060103 )
		if( smma3 <= 0.057186 )
			if( smma3 <= 0.056034 )
				if( smma3 <= 0.033132 )
					if( ema2 <= 0.03032 )
						if( smma4 <= 0.030134 )
							if( smma3 <= 0.027067 )
								if( smma3 <= 0.026009 )
									ret := 0.202899
								if( smma3 > 0.026009 )
									ret := -0.098143
							if( smma3 > 0.027067 )
								if( smma4 <= 0.029827 )
									ret := 0.179193
								if( smma4 > 0.029827 )
									ret := 0.418900
						if( smma4 > 0.030134 )
							if( smma2 <= 0.030464 )
								if( ema2 <= 0.027176 )
									ret := 0.688172
								if( ema2 > 0.027176 )
									ret := -0.452632
							if( smma2 > 0.030464 )
								if( smma3 <= 0.031272 )
									ret := 0.326446
								if( smma3 > 0.031272 )
									ret := -0.067485
					if( ema2 > 0.03032 )
						if( smma3 <= 0.030047 )
							if( smma4 <= 0.029536 )
								if( smma1 <= 0.02964 )
									ret := -0.641026
								if( smma1 > 0.02964 )
									ret := 0.026490
							if( smma4 > 0.029536 )
								if( smma3 <= 0.030019 )
									ret := -0.802721 // sell
								if( smma3 > 0.030019 )
									ret := -0.440000
						if( smma3 > 0.030047 )
							if( smma3 <= 0.030531 )
								if( smma4 <= 0.029743 )
									ret := 0.663636
								if( smma4 > 0.029743 )
									ret := 0.005634
							if( smma3 > 0.030531 )
								if( smma4 <= 0.029778 )
									ret := 0.611940
								if( smma4 > 0.029778 )
									ret := -0.124016
				if( smma3 > 0.033132 )
					if( ema2 <= 0.050428 )
						if( smma1 <= 0.048478 )
							if( ema2 <= 0.048488 )
								if( smma4 <= 0.054011 )
									ret := 0.284084
								if( smma4 > 0.054011 )
									ret := -0.842105 // sell
							if( ema2 > 0.048488 )
								if( smma3 <= 0.050053 )
									ret := -0.435897
								if( smma3 > 0.050053 )
									ret := -0.916667 // sell
						if( smma1 > 0.048478 )
							if( ema2 <= 0.049687 )
								if( smma2 <= 0.055237 )
									ret := 0.753247 // buy
								if( smma2 > 0.055237 )
									ret := -0.142857
							if( ema2 > 0.049687 )
								if( smma4 <= 0.04902 )
									ret := -0.161290
								if( smma4 > 0.04902 )
									ret := 0.525333
					if( ema2 > 0.050428 )
						if( smma2 <= 0.056427 )
							if( smma4 <= 0.056162 )
								if( smma1 <= 0.057618 )
									ret := 0.085111
								if( smma1 > 0.057618 )
									ret := -0.958333 // sell
							if( smma4 > 0.056162 )
								if( smma3 <= 0.05541 )
									ret := -0.925373 // sell
								if( smma3 > 0.05541 )
									ret := -0.324324
						if( smma2 > 0.056427 )
							if( bullSigInt <= 0.5 )
								if( ema2 <= 0.05818 )
									ret := 0.617021
								if( ema2 > 0.05818 )
									ret := 1.000000 // buy
							if( bullSigInt > 0.5 )
								ret := 0.000000
			if( smma3 > 0.056034 )
				if( smma1 <= 0.055185 )
					if( smma4 <= 0.057772 )
						if( smma3 <= 0.057122 )
							if( ema2 <= 0.050754 )
								if( smma4 <= 0.055318 )
									ret := -1.000000 // sell
								if( smma4 > 0.055318 )
									ret := -0.600000
							if( ema2 > 0.050754 )
								ret := -1.000000 // sell
						if( smma3 > 0.057122 )
							ret := -0.750000 // sell
					if( smma4 > 0.057772 )
						if( ema2 <= 0.052007 )
							if( ema2 <= 0.051891 )
								ret := 1.000000 // buy
							if( ema2 > 0.051891 )
								ret := 0.500000
						if( ema2 > 0.052007 )
							if( smma3 <= 0.056705 )
								if( smma4 <= 0.058205 )
									ret := -0.545455
								if( smma4 > 0.058205 )
									ret := -1.000000 // sell
							if( smma3 > 0.056705 )
								if( smma4 <= 0.058628 )
									ret := 0.500000
								if( smma4 > 0.058628 )
									ret := -0.062500
				if( smma1 > 0.055185 )
					if( ema2 <= 0.055646 )
						if( smma4 <= 0.058361 )
							if( smma4 <= 0.058183 )
								ret := 0.571429
							if( smma4 > 0.058183 )
								ret := -1.000000 // sell
						if( smma4 > 0.058361 )
							if( smma1 <= 0.056276 )
								if( smma3 <= 0.056866 )
									ret := 1.000000 // buy
								if( smma3 > 0.056866 )
									ret := 0.916667 // buy
							if( smma1 > 0.056276 )
								ret := 0.000000
					if( ema2 > 0.055646 )
						if( smma4 <= 0.05846 )
							if( smma1 <= 0.055991 )
								ret := -1.000000 // sell
							if( smma1 > 0.055991 )
								if( smma3 <= 0.056623 )
									ret := 0.941176 // buy
								if( smma3 > 0.056623 )
									ret := 0.348837
						if( smma4 > 0.05846 )
							if( smma1 <= 0.056158 )
								if( ema2 <= 0.05651 )
									ret := 0.600000
								if( ema2 > 0.05651 )
									ret := -0.294118
							if( smma1 > 0.056158 )
								if( smma3 <= 0.056599 )
									ret := 0.388889
								if( smma3 > 0.056599 )
									ret := -0.704348 // sell
		if( smma3 > 0.057186 )
			if( smma1 <= 0.054795 )
				if( smma3 <= 0.058241 )
					if( ema2 <= 0.055277 )
						if( smma3 <= 0.057951 )
							if( ema2 <= 0.054693 )
								if( smma4 <= 0.061286 )
									ret := 1.000000 // buy
								if( smma4 > 0.061286 )
									ret := 0.750000 // buy
							if( ema2 > 0.054693 )
								ret := 0.333333
						if( smma3 > 0.057951 )
							ret := 0.000000
					if( ema2 > 0.055277 )
						ret := -0.800000 // sell
				if( smma3 > 0.058241 )
					if( ema2 <= 0.055851 )
						if( smma1 <= 0.053019 )
							if( smma4 <= 0.065284 )
								if( smma1 <= 0.052536 )
									ret := 1.000000 // buy
								if( smma1 > 0.052536 )
									ret := 0.466667
							if( smma4 > 0.065284 )
								if( ema2 <= 0.051865 )
									ret := 0.000000
								if( ema2 > 0.051865 )
									ret := -1.000000 // sell
						if( smma1 > 0.053019 )
							if( smma2 <= 0.05709 )
								if( smma3 <= 0.059856 )
									ret := 0.868132 // buy
								if( smma3 > 0.059856 )
									ret := -0.500000
							if( smma2 > 0.05709 )
								if( ema2 <= 0.049196 )
									ret := 0.750000 // buy
								if( ema2 > 0.049196 )
									ret := 1.000000 // buy
					if( ema2 > 0.055851 )
						if( ema2 <= 0.056467 )
							ret := -0.250000
						if( ema2 > 0.056467 )
							ret := -1.000000 // sell
			if( smma1 > 0.054795 )
				if( smma4 <= 0.0581 )
					if( smma1 <= 0.05929 )
						if( smma3 <= 0.058087 )
							if( smma4 <= 0.057104 )
								if( ema2 <= 0.052936 )
									ret := 0.923077 // buy
								if( ema2 > 0.052936 )
									ret := 0.285714
							if( smma4 > 0.057104 )
								if( ema2 <= 0.05944 )
									ret := 0.964706 // buy
								if( ema2 > 0.05944 )
									ret := 0.750000 // buy
						if( smma3 > 0.058087 )
							if( smma4 <= 0.056968 )
								if( smma2 <= 0.059011 )
									ret := -1.000000 // sell
								if( smma2 > 0.059011 )
									ret := 0.375000
							if( smma4 > 0.056968 )
								if( smma1 <= 0.055947 )
									ret := 0.615385
								if( smma1 > 0.055947 )
									ret := 0.903226 // buy
					if( smma1 > 0.05929 )
						if( ema2 <= 0.058445 )
							if( smma2 <= 0.059134 )
								ret := 0.500000
							if( smma2 > 0.059134 )
								ret := 1.000000 // buy
						if( ema2 > 0.058445 )
							if( smma3 <= 0.058326 )
								if( smma3 <= 0.058104 )
									ret := 0.027027
								if( smma3 > 0.058104 )
									ret := -0.676471
							if( smma3 > 0.058326 )
								if( smma3 <= 0.058892 )
									ret := 0.937500 // buy
								if( smma3 > 0.058892 )
									ret := 0.500000
				if( smma4 > 0.0581 )
					if( smma2 <= 0.058039 )
						if( ema2 <= 0.056353 )
							if( smma4 <= 0.062867 )
								if( smma4 <= 0.05815 )
									ret := -0.600000
								if( smma4 > 0.05815 )
									ret := 0.370044
							if( smma4 > 0.062867 )
								if( smma2 <= 0.057953 )
									ret := -0.594595
								if( smma2 > 0.057953 )
									ret := 1.000000 // buy
						if( ema2 > 0.056353 )
							if( bullishEngulfingInt <= 0.5 )
								if( ema2 <= 0.059043 )
									ret := -0.659259
								if( ema2 > 0.059043 )
									ret := 0.000000
							if( bullishEngulfingInt > 0.5 )
								if( smma1 <= 0.057254 )
									ret := 0.000000
								if( smma1 > 0.057254 )
									ret := 0.800000 // buy
					if( smma2 > 0.058039 )
						if( smma3 <= 0.064334 )
							if( ema2 <= 0.05983 )
								if( smma4 <= 0.067233 )
									ret := 0.276777
								if( smma4 > 0.067233 )
									ret := 0.784314 // buy
							if( ema2 > 0.05983 )
								if( smma1 <= 0.060284 )
									ret := -0.011494
								if( smma1 > 0.060284 )
									ret := 0.418605
						if( smma3 > 0.064334 )
							if( smma2 <= 0.06604 )
								if( smma1 <= 0.060322 )
									ret := 0.054545
								if( smma1 > 0.060322 )
									ret := -0.547826
							if( smma2 > 0.06604 )
								if( ema2 <= 0.059885 )
									ret := 0.925000 // buy
								if( ema2 > 0.059885 )
									ret := -0.111111
	if( ema2 > 0.060103 )
		if( smma1 <= 0.165151 )
			if( smma2 <= 0.058924 )
				if( smma4 <= 0.053278 )
					if( smma1 <= 0.057799 )
						if( ema2 <= 0.061258 )
							ret := 1.000000 // buy
						if( ema2 > 0.061258 )
							ret := 0.714286 // buy
					if( smma1 > 0.057799 )
						if( smma1 <= 0.059501 )
							if( ema2 <= 0.060513 )
								ret := 0.600000
							if( ema2 > 0.060513 )
								if( smma4 <= 0.053102 )
									ret := -0.950000 // sell
								if( smma4 > 0.053102 )
									ret := -0.500000
						if( smma1 > 0.059501 )
							ret := -1.000000 // sell
				if( smma4 > 0.053278 )
					if( bullishEngulfingInt <= 0.5 )
						if( ema2 <= 0.061893 )
							if( smma4 <= 0.053647 )
								if( ema2 <= 0.060787 )
									ret := 0.750000 // buy
								if( ema2 > 0.060787 )
									ret := -0.285714
							if( smma4 > 0.053647 )
								if( ema2 <= 0.060318 )
									ret := 0.400000
								if( ema2 > 0.060318 )
									ret := 0.904255 // buy
						if( ema2 > 0.061893 )
							if( smma4 <= 0.062704 )
								if( smma4 <= 0.055895 )
									ret := 0.675000
								if( smma4 > 0.055895 )
									ret := -0.428571
							if( smma4 > 0.062704 )
								if( smma2 <= 0.058423 )
									ret := 1.000000 // buy
								if( smma2 > 0.058423 )
									ret := 0.700000 // buy
					if( bullishEngulfingInt > 0.5 )
						if( smma1 <= 0.059459 )
							ret := -1.000000 // sell
						if( smma1 > 0.059459 )
							if( ema2 <= 0.061227 )
								ret := -0.500000
							if( ema2 > 0.061227 )
								ret := -0.166667
			if( smma2 > 0.058924 )
				if( smma3 <= 0.058498 )
					if( ema2 <= 0.061529 )
						if( ema2 <= 0.061084 )
							if( smma4 <= 0.054345 )
								ret := 0.250000
							if( smma4 > 0.054345 )
								if( smma1 <= 0.059633 )
									ret := -0.461538
								if( smma1 > 0.059633 )
									ret := -1.000000 // sell
						if( ema2 > 0.061084 )
							if( smma2 <= 0.060835 )
								if( smma3 <= 0.058175 )
									ret := -0.142857
								if( smma3 > 0.058175 )
									ret := 0.500000
							if( smma2 > 0.060835 )
								ret := -1.000000 // sell
					if( ema2 > 0.061529 )
						if( smma1 <= 0.06075 )
							ret := -0.500000
						if( smma1 > 0.06075 )
							if( smma2 <= 0.059481 )
								ret := -1.000000 // sell
							if( smma2 > 0.059481 )
								if( smma1 <= 0.062231 )
									ret := -0.500000
								if( smma1 > 0.062231 )
									ret := -0.909091 // sell
				if( smma3 > 0.058498 )
					if( smma4 <= 0.057169 )
						if( smma3 <= 0.059473 )
							if( smma3 <= 0.058874 )
								if( smma3 <= 0.058596 )
									ret := -0.222222
								if( smma3 > 0.058596 )
									ret := 0.743590 // buy
							if( smma3 > 0.058874 )
								if( smma4 <= 0.056507 )
									ret := -0.625000
								if( smma4 > 0.056507 )
									ret := 0.285714
						if( smma3 > 0.059473 )
							if( ema2 <= 0.064371 )
								if( smma4 <= 0.056922 )
									ret := 0.750000 // buy
								if( smma4 > 0.056922 )
									ret := 1.000000 // buy
							if( ema2 > 0.064371 )
								ret := 0.500000
					if( smma4 > 0.057169 )
						if( smma2 <= 0.060378 )
							if( smma3 <= 0.061196 )
								if( smma4 <= 0.062096 )
									ret := -0.118785
								if( smma4 > 0.062096 )
									ret := 0.424242
							if( smma3 > 0.061196 )
								if( ema2 <= 0.06055 )
									ret := -0.220000
								if( ema2 > 0.06055 )
									ret := -0.851852 // sell
						if( smma2 > 0.060378 )
							if( ema2 <= 0.061329 )
								if( smma4 <= 0.06451 )
									ret := 0.208262
								if( smma4 > 0.06451 )
									ret := -0.394495
							if( ema2 > 0.061329 )
								if( smma2 <= 0.063286 )
									ret := -0.052130
								if( smma2 > 0.063286 )
									ret := 0.031757
		if( smma1 > 0.165151 )
			if( smma1 <= 0.165623 )
				if( smma1 <= 0.165322 )
					if( smma2 <= 0.163032 )
						ret := -0.333333
					if( smma2 > 0.163032 )
						ret := -1.000000 // sell
				if( smma1 > 0.165322 )
					if( ema2 <= 0.167285 )
						ret := -1.000000 // sell
					if( ema2 > 0.167285 )
						if( ema2 <= 0.167927 )
							ret := -0.500000
						if( ema2 > 0.167927 )
							ret := -1.000000 // sell
			if( smma1 > 0.165623 )
				ret := -0.333333
	
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
float op_operation = decision_tree_0_TRXUSDT_30Min_c71ec878(smma2, ema2, bullSigInt, smma3, smma1, bearSigInt, smma4, bullishEngulfingInt, bearishEngulfingInt)

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


