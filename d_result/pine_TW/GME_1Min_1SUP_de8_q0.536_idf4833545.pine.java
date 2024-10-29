//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: SuperTrend
// ID_model: GME_1Min_1SUP_f4833545 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GME_1Min_1SUP_f4833545", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GME_1Min_f4833545(dn1, trend, atr, atr2, buySignalInt, sellSignalInt, up1, up, dn)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( up1 <= 20.8592 )
		if( atr <= 0.03948 )
			if( dn <= 11.1087 )
				if( up <= 10.5645 )
					if( atr2 <= 0.015401 )
						if( atr <= 0.018098 )
							if( atr <= 0.015576 )
								if( dn1 <= 10.0944 )
									ret := 0.405405
								if( dn1 > 10.0944 )
									ret := -0.038793
							if( atr > 0.015576 )
								if( atr <= 0.016863 )
									ret := -0.225806
								if( atr > 0.016863 )
									ret := -0.533333
						if( atr > 0.018098 )
							if( up <= 10.0783 )
								ret := 1.000000 // buy
							if( up > 10.0783 )
								if( dn <= 10.4671 )
									ret := 0.200000
								if( dn > 10.4671 )
									ret := 0.800000 // buy
					if( atr2 > 0.015401 )
						if( dn <= 10.6156 )
							if( up1 <= 10.4751 )
								if( atr <= 0.022623 )
									ret := 0.263914
								if( atr > 0.022623 )
									ret := 0.020408
							if( up1 > 10.4751 )
								if( dn1 <= 10.612 )
									ret := 0.833333 // buy
								if( dn1 > 10.612 )
									ret := 0.461538
						if( dn > 10.6156 )
							if( atr <= 0.033917 )
								if( dn <= 10.6821 )
									ret := -0.350000
								if( dn > 10.6821 )
									ret := 0.647059
							if( atr > 0.033917 )
								if( atr2 <= 0.037315 )
									ret := -0.766667 // sell
								if( atr2 > 0.037315 )
									ret := 0.000000
				if( up > 10.5645 )
					if( dn <= 10.7586 )
						if( dn1 <= 10.677 )
							ret := -0.750000 // sell
						if( dn1 > 10.677 )
							if( up1 <= 10.5718 )
								if( up <= 10.5822 )
									ret := 1.000000 // buy
								if( up > 10.5822 )
									ret := 0.500000
							if( up1 > 10.5718 )
								ret := 1.000000 // buy
					if( dn > 10.7586 )
						if( up <= 10.9682 )
							if( dn1 <= 11.1272 )
								if( dn1 <= 11.0685 )
									ret := 0.216418
								if( dn1 > 11.0685 )
									ret := -0.169231
							if( dn1 > 11.1272 )
								ret := 1.000000 // buy
						if( up > 10.9682 )
							if( atr <= 0.016645 )
								if( atr2 <= 0.013255 )
									ret := 0.029412
								if( atr2 > 0.013255 )
									ret := 0.385965
							if( atr > 0.016645 )
								if( atr2 <= 0.02116 )
									ret := 0.789474 // buy
								if( atr2 > 0.02116 )
									ret := 0.428571
			if( dn > 11.1087 )
				if( up <= 11.083 )
					if( up <= 10.9385 )
						if( atr2 <= 0.0412 )
							ret := 0.000000
						if( atr2 > 0.0412 )
							ret := 1.000000 // buy
					if( up > 10.9385 )
						if( up1 <= 10.9634 )
							if( dn1 <= 11.1334 )
								ret := -1.000000 // sell
							if( dn1 > 11.1334 )
								ret := -0.500000
						if( up1 > 10.9634 )
							if( up <= 11.01 )
								if( dn <= 11.1448 )
									ret := 0.055556
								if( dn > 11.1448 )
									ret := 0.333333
							if( up > 11.01 )
								if( dn1 <= 11.2513 )
									ret := -0.250000
								if( dn1 > 11.2513 )
									ret := -0.866667 // sell
				if( up > 11.083 )
					if( dn <= 11.2331 )
						if( up <= 11.0906 )
							if( atr2 <= 0.018663 )
								if( up1 <= 11.0769 )
									ret := 0.750000 // buy
								if( up1 > 11.0769 )
									ret := 0.966667 // buy
							if( atr2 > 0.018663 )
								ret := 0.142857
						if( up > 11.0906 )
							if( dn <= 11.2305 )
								if( dn1 <= 11.2306 )
									ret := 0.078431
								if( dn1 > 11.2306 )
									ret := 0.750000 // buy
							if( dn > 11.2305 )
								ret := 1.000000 // buy
					if( dn > 11.2331 )
						if( up <= 11.1002 )
							if( up <= 11.09 )
								ret := -0.333333
							if( up > 11.09 )
								if( atr <= 0.02941 )
									ret := -0.500000
								if( atr > 0.02941 )
									ret := -1.000000 // sell
						if( up > 11.1002 )
							if( atr2 <= 0.015305 )
								if( dn1 <= 16.0486 )
									ret := -0.213974
								if( dn1 > 16.0486 )
									ret := -0.002347
							if( atr2 > 0.015305 )
								if( dn1 <= 11.5218 )
									ret := 0.179654
								if( dn1 > 11.5218 )
									ret := 0.039943
		if( atr > 0.03948 )
			if( up <= 15.3532 )
				if( up <= 10.1201 )
					if( sellSignalInt <= 0.5 )
						if( atr2 <= 0.052412 )
							if( dn1 <= 10.2001 )
								if( up1 <= 9.89861 )
									ret := -1.000000 // sell
								if( up1 > 9.89861 )
									ret := -0.250000
							if( dn1 > 10.2001 )
								if( up1 <= 10.0676 )
									ret := 0.200000
								if( up1 > 10.0676 )
									ret := 1.000000 // buy
						if( atr2 > 0.052412 )
							if( up1 <= 9.9626 )
								ret := -1.000000 // sell
							if( up1 > 9.9626 )
								if( dn1 <= 10.5285 )
									ret := -0.794118 // sell
								if( dn1 > 10.5285 )
									ret := 0.800000 // buy
					if( sellSignalInt > 0.5 )
						ret := 1.000000 // buy
				if( up > 10.1201 )
					if( atr2 <= 0.093141 )
						if( dn <= 12.219 )
							if( dn <= 12.1502 )
								if( up <= 10.4726 )
									ret := 0.723077 // buy
								if( up > 10.4726 )
									ret := 0.209184
							if( dn > 12.1502 )
								if( up <= 11.9481 )
									ret := 0.880000 // buy
								if( up > 11.9481 )
									ret := 0.000000
						if( dn > 12.219 )
							if( up1 <= 13.5626 )
								if( dn <= 13.8992 )
									ret := 0.017857
								if( dn > 13.8992 )
									ret := -0.862069 // sell
							if( up1 > 13.5626 )
								if( up1 <= 14.7337 )
									ret := 0.389091
								if( up1 > 14.7337 )
									ret := -0.068323
					if( atr2 > 0.093141 )
						if( up <= 14.8327 )
							if( dn1 <= 15.7711 )
								if( atr2 <= 0.118957 )
									ret := 0.630901
								if( atr2 > 0.118957 )
									ret := 0.211604
							if( dn1 > 15.7711 )
								if( atr2 <= 9.75084 )
									ret := -0.431373
								if( atr2 > 9.75084 )
									ret := 1.000000 // buy
						if( up > 14.8327 )
							if( atr2 <= 0.283447 )
								if( dn1 <= 16.0809 )
									ret := 0.779006 // buy
								if( dn1 > 16.0809 )
									ret := 0.470238
							if( atr2 > 0.283447 )
								ret := -1.000000 // sell
			if( up > 15.3532 )
				if( dn1 <= 19.6691 )
					if( atr <= 0.084585 )
						if( dn <= 15.6956 )
							if( up1 <= 15.3742 )
								ret := 0.333333
							if( up1 > 15.3742 )
								if( up1 <= 15.4483 )
									ret := -0.909091 // sell
								if( up1 > 15.4483 )
									ret := -0.250000
						if( dn > 15.6956 )
							if( up1 <= 15.5535 )
								if( atr <= 0.051909 )
									ret := -0.200000
								if( atr > 0.051909 )
									ret := 0.763441 // buy
							if( up1 > 15.5535 )
								if( dn1 <= 18.3453 )
									ret := 0.144231
								if( dn1 > 18.3453 )
									ret := -0.038462
					if( atr > 0.084585 )
						if( up <= 15.3896 )
							if( up1 <= 15.3468 )
								if( atr <= 0.125312 )
									ret := 0.307692
								if( atr > 0.125312 )
									ret := -0.833333 // sell
							if( up1 > 15.3468 )
								if( atr <= 0.204055 )
									ret := -0.916667 // sell
								if( atr > 0.204055 )
									ret := -0.500000
						if( up > 15.3896 )
							if( atr2 <= 0.138497 )
								if( up <= 15.4833 )
									ret := 0.677419
								if( up > 15.4833 )
									ret := -0.102595
							if( atr2 > 0.138497 )
								if( up <= 17.4562 )
									ret := 0.210370
								if( up > 17.4562 )
									ret := -0.200000
				if( dn1 > 19.6691 )
					if( up1 <= 18.6256 )
						if( dn <= 19.6419 )
							if( up <= 17.7818 )
								ret := -1.000000 // sell
							if( up > 17.7818 )
								ret := -0.750000 // sell
						if( dn > 19.6419 )
							if( up1 <= 18.2752 )
								if( dn1 <= 28.504 )
									ret := 0.923077 // buy
								if( dn1 > 28.504 )
									ret := -0.100000
							if( up1 > 18.2752 )
								if( atr2 <= 0.262321 )
									ret := 1.000000 // buy
								if( atr2 > 0.262321 )
									ret := 0.173913
					if( up1 > 18.6256 )
						if( dn <= 23.1505 )
							if( dn1 <= 21.5589 )
								if( atr2 <= 0.091766 )
									ret := 0.196848
								if( atr2 > 0.091766 )
									ret := 0.027766
							if( dn1 > 21.5589 )
								if( up1 <= 20.594 )
									ret := 0.540323
								if( up1 > 20.594 )
									ret := 0.136364
						if( dn > 23.1505 )
							if( up1 <= 19.063 )
								ret := 1.000000 // buy
							if( up1 > 19.063 )
								if( dn1 <= 26.8275 )
									ret := -0.567010
								if( dn1 > 26.8275 )
									ret := 0.300000
	if( up1 > 20.8592 )
		if( dn <= 56.7374 )
			if( up1 <= 32.4742 )
				if( sellSignalInt <= 0.5 )
					if( up1 <= 31.7891 )
						if( atr2 <= 0.925093 )
							if( dn <= 33.7197 )
								if( dn <= 31.4082 )
									ret := 0.030122
								if( dn > 31.4082 )
									ret := -0.072340
							if( dn > 33.7197 )
								if( dn1 <= 34.9289 )
									ret := 0.636364
								if( dn1 > 34.9289 )
									ret := 0.098039
						if( atr2 > 0.925093 )
							if( dn1 <= 27.468 )
								if( atr <= 0.855785 )
									ret := 0.000000
								if( atr > 0.855785 )
									ret := 1.000000 // buy
							if( dn1 > 27.468 )
								if( up <= 22.8082 )
									ret := -1.000000 // sell
								if( up > 22.8082 )
									ret := -0.211735
					if( up1 > 31.7891 )
						if( dn1 <= 41.3627 )
							if( up <= 31.9552 )
								if( atr2 <= 0.649172 )
									ret := -0.778761 // sell
								if( atr2 > 0.649172 )
									ret := 0.083333
							if( up > 31.9552 )
								if( dn <= 33.4049 )
									ret := 0.453125
								if( dn > 33.4049 )
									ret := -0.237875
						if( dn1 > 41.3627 )
							ret := 1.000000 // buy
				if( sellSignalInt > 0.5 )
					if( atr2 <= 0.052041 )
						if( up <= 22.5557 )
							if( dn <= 22.2899 )
								if( up <= 21.2195 )
									ret := -0.050000
								if( up > 21.2195 )
									ret := 0.275000
							if( dn > 22.2899 )
								if( atr2 <= 0.017925 )
									ret := -0.090909
								if( atr2 > 0.017925 )
									ret := 0.779661 // buy
						if( up > 22.5557 )
							if( atr2 <= 0.049584 )
								if( dn <= 25.1543 )
									ret := -0.032000
								if( dn > 25.1543 )
									ret := 0.269231
							if( atr2 > 0.049584 )
								if( atr2 <= 0.050197 )
									ret := -1.000000 // sell
								if( atr2 > 0.050197 )
									ret := -0.571429
					if( atr2 > 0.052041 )
						if( dn <= 21.1388 )
							ret := -1.000000 // sell
						if( dn > 21.1388 )
							if( dn <= 29.1007 )
								if( dn1 <= 23.6801 )
									ret := 0.270833
								if( dn1 > 23.6801 )
									ret := 0.634921
							if( dn > 29.1007 )
								if( up <= 31.0933 )
									ret := -0.714286 // sell
								if( up > 31.0933 )
									ret := 1.000000 // buy
			if( up1 > 32.4742 )
				if( dn <= 33.7948 )
					if( up <= 33.0243 )
						if( atr <= 0.192374 )
							if( up1 <= 32.9201 )
								if( up1 <= 32.587 )
									ret := 0.888889 // buy
								if( up1 > 32.587 )
									ret := 0.986667 // buy
							if( up1 > 32.9201 )
								if( atr <= 0.120494 )
									ret := 0.933333 // buy
								if( atr > 0.120494 )
									ret := 0.500000
						if( atr > 0.192374 )
							if( dn <= 33.7631 )
								ret := 0.000000
							if( dn > 33.7631 )
								ret := 0.250000
					if( up > 33.0243 )
						if( up1 <= 33.088 )
							ret := -0.750000 // sell
						if( up1 > 33.088 )
							if( atr2 <= 0.077 )
								ret := 0.500000
							if( atr2 > 0.077 )
								ret := 0.250000
				if( dn > 33.7948 )
					if( atr2 <= 0.142315 )
						if( dn <= 33.9901 )
							if( up <= 33.1785 )
								if( atr2 <= 0.134172 )
									ret := -0.500000
								if( atr2 > 0.134172 )
									ret := -1.000000 // sell
							if( up > 33.1785 )
								if( up <= 33.4079 )
									ret := 0.875000 // buy
								if( up > 33.4079 )
									ret := 0.454545
						if( dn > 33.9901 )
							if( atr2 <= 0.10254 )
								if( dn <= 35.1054 )
									ret := -0.636364
								if( dn > 35.1054 )
									ret := -0.900000 // sell
							if( atr2 > 0.10254 )
								if( up <= 35.9119 )
									ret := -0.526316
								if( up > 35.9119 )
									ret := 0.172414
					if( atr2 > 0.142315 )
						if( atr2 <= 0.933586 )
							if( up <= 32.793 )
								if( dn <= 34.3874 )
									ret := 0.000000
								if( dn > 34.3874 )
									ret := 0.746269 // buy
							if( up > 32.793 )
								if( up1 <= 33.2117 )
									ret := -0.142857
								if( up1 > 33.2117 )
									ret := 0.168678
						if( atr2 > 0.933586 )
							if( dn <= 39.1645 )
								if( up1 <= 33.4671 )
									ret := 0.848485 // buy
								if( up1 > 33.4671 )
									ret := 0.000000
							if( dn > 39.1645 )
								if( dn1 <= 42.1623 )
									ret := -0.409449
								if( dn1 > 42.1623 )
									ret := 0.017617
		if( dn > 56.7374 )
			if( dn1 <= 62.2003 )
				if( atr <= 0.554853 )
					if( atr <= 0.439737 )
						ret := -0.500000
					if( atr > 0.439737 )
						ret := -1.000000 // sell
				if( atr > 0.554853 )
					if( up <= 54.566 )
						if( atr2 <= 0.6795 )
							if( atr2 <= 0.588545 )
								ret := -0.285714
							if( atr2 > 0.588545 )
								ret := 0.714286 // buy
						if( atr2 > 0.6795 )
							if( up1 <= 48.2055 )
								if( atr2 <= 3.53801 )
									ret := -0.052632
								if( atr2 > 3.53801 )
									ret := -1.000000 // sell
							if( up1 > 48.2055 )
								if( atr2 <= 1.20115 )
									ret := -0.476744
								if( atr2 > 1.20115 )
									ret := -0.807339 // sell
					if( up > 54.566 )
						if( dn1 <= 61.3242 )
							if( up1 <= 56.1034 )
								if( atr <= 0.594015 )
									ret := 0.000000
								if( atr > 0.594015 )
									ret := 1.000000 // buy
							if( up1 > 56.1034 )
								ret := -0.200000
						if( dn1 > 61.3242 )
							if( atr2 <= 1.065 )
								if( dn1 <= 61.7327 )
									ret := -0.250000
								if( dn1 > 61.7327 )
									ret := -1.000000 // sell
							if( atr2 > 1.065 )
								if( up1 <= 55.9931 )
									ret := 0.500000
								if( up1 > 55.9931 )
									ret := 1.000000 // buy
			if( dn1 > 62.2003 )
				if( dn1 <= 87.0331 )
					if( dn <= 62.1185 )
						if( atr2 <= 1.01164 )
							ret := 0.000000
						if( atr2 > 1.01164 )
							if( atr2 <= 2.08314 )
								ret := 1.000000 // buy
							if( atr2 > 2.08314 )
								if( dn1 <= 62.5901 )
									ret := 1.000000 // buy
								if( dn1 > 62.5901 )
									ret := 0.000000
					if( dn > 62.1185 )
						if( atr2 <= 0.35474 )
							if( up <= 61.1924 )
								if( up <= 60.9696 )
									ret := -1.000000 // sell
								if( up > 60.9696 )
									ret := 0.642857
							if( up > 61.1924 )
								if( atr <= 0.391876 )
									ret := -1.000000 // sell
								if( atr > 0.391876 )
									ret := -0.750000 // sell
						if( atr2 > 0.35474 )
							if( atr <= 1.38702 )
								if( dn <= 66.1406 )
									ret := 0.104167
								if( dn > 66.1406 )
									ret := 1.000000 // buy
							if( atr > 1.38702 )
								if( up1 <= 62.8396 )
									ret := 0.034247
								if( up1 > 62.8396 )
									ret := -0.811321 // sell
				if( dn1 > 87.0331 )
					if( up1 <= 38.633 )
						ret := -0.666667
					if( up1 > 38.633 )
						ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator SuperTrend 
//@version=5
//indicator title="Supertrend", overlay=true, format=format.price, precision=2, timeframe="")

Periods = input.int(title="ATR Period", defval=10)
src = input.source(hl2, title="Source")
Multiplier = input.float(title="ATR Multiplier", step=0.1, defval=3.0)
changeATR = input.bool(title="Change ATR Calculation Method?", defval=true)
showsignals = input.bool(title="Show Buy/Sell Signals?", defval=true)
highlighting = input.bool(title="Highlighter On/Off?", defval=true)

atr2 = ta.sma(ta.tr, Periods)
atr = changeATR ? ta.atr(Periods) : atr2

up = src - (Multiplier * atr)
up1 = nz(up[1], up)
up := close[1] > up1 ? math.max(up, up1) : up

dn = src + (Multiplier * atr)
dn1 = nz(dn[1], dn)
dn := close[1] < dn1 ? math.min(dn, dn1) : dn

var trend = 1
trend := nz(trend[1], trend)
trend := trend == -1 and close > dn1 ? 1 : trend == 1 and close < up1 ? -1 : trend

upPlot = plot(trend == 1 ? up : na, title="Up Trend", style=plot.style_linebr, linewidth=2, color=color.green)
dnPlot = plot(trend == 1 ? na : dn, title="Down Trend", style=plot.style_linebr, linewidth=2, color=color.red)

buySignal = trend == 1 and trend[1] == -1
sellSignal = trend == -1 and trend[1] == 1

plotshape(buySignal, title="UpTrend Begins", location=location.absolute, style=shape.circle, size=size.tiny, color=color.green, textcolor=color.white)
plotshape(sellSignal, title="DownTrend Begins", location=location.absolute, style=shape.circle, size=size.tiny, color=color.red, textcolor=color.white)

plotshape(showsignals and buySignal, title="Buy", text="Buy", location=location.absolute, style=shape.labelup, size=size.tiny, color=color.green, textcolor=color.white)
plotshape(showsignals and sellSignal, title="Sell", text="Sell", location=location.absolute, style=shape.labeldown, size=size.tiny, color=color.red, textcolor=color.white)

mPlot = plot(ohlc4, title="", style=plot.style_circles, linewidth=1)

longFillColor = highlighting ? (trend == 1 ? color.new(color.green, 80) : color.new(color.white, 100)) : color.new(color.white, 100)
shortFillColor = highlighting ? (trend == -1 ? color.new(color.red, 80) : color.new(color.white, 100)) : color.new(color.white, 100)

fill(mPlot, upPlot, title="UpTrend Highlighter", color=longFillColor)
fill(mPlot, dnPlot, title="DownTrend Highlighter", color=shortFillColor)

alertcondition(buySignal, title="SuperTrend Buy", message="SuperTrend Buy!")
alertcondition(sellSignal, title="SuperTrend Sell", message="SuperTrend Sell!")
changeCond = trend != trend[1]
alertcondition(changeCond, title="SuperTrend Direction Change", message="SuperTrend has changed direction!")

buySignalInt = buySignal ? 1: 0   //Bool to int
sellSignalInt = sellSignal ? 1: 0   //Bool to int

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
float op_operation = decision_tree_0_GME_1Min_f4833545(dn1, trend, atr, atr2, buySignalInt, sellSignalInt, up1, up, dn)

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


