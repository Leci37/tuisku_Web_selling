//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: SuperTrend
// ID_model: TTD_15Min_1SUP_eaaeeb46 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TTD_15Min_1SUP_eaaeeb46", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TTD_15Min_eaaeeb46(dn1, atr, dn, up1, up, sellSignalInt, atr2, buySignalInt, trend)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( dn <= 45.0469 )
		if( atr2 <= 0.439876 )
			if( dn <= 28.7704 )
				if( atr2 <= 0.21286 )
					if( up1 <= 26.9616 )
						if( atr <= 0.231815 )
							if( atr2 <= 0.175459 )
								ret := 0.571429
							if( atr2 > 0.175459 )
								if( up1 <= 26.7677 )
									ret := 0.972222 // buy
								if( up1 > 26.7677 )
									ret := 0.789474 // buy
						if( atr > 0.231815 )
							ret := 0.142857
					if( up1 > 26.9616 )
						if( dn1 <= 28.5949 )
							if( dn <= 28.1903 )
								if( dn1 <= 28.1463 )
									ret := 0.000000
								if( dn1 > 28.1463 )
									ret := 0.800000 // buy
							if( dn > 28.1903 )
								if( up <= 27.33 )
									ret := 0.250000
								if( up > 27.33 )
									ret := -0.576923
						if( dn1 > 28.5949 )
							if( dn <= 28.6945 )
								if( up <= 27.9658 )
									ret := 0.800000 // buy
								if( up > 27.9658 )
									ret := 1.000000 // buy
							if( dn > 28.6945 )
								if( dn1 <= 28.8452 )
									ret := 0.166667
								if( dn1 > 28.8452 )
									ret := 1.000000 // buy
				if( atr2 > 0.21286 )
					if( atr <= 0.269177 )
						if( dn1 <= 28.2187 )
							if( dn1 <= 27.3431 )
								if( up1 <= 25.4976 )
									ret := 0.250000
								if( up1 > 25.4976 )
									ret := 0.000000
							if( dn1 > 27.3431 )
								if( atr2 <= 0.25435 )
									ret := -0.725490 // sell
								if( atr2 > 0.25435 )
									ret := -0.230769
						if( dn1 > 28.2187 )
							if( dn1 <= 28.648 )
								if( atr2 <= 0.25734 )
									ret := 0.812500 // buy
								if( atr2 > 0.25734 )
									ret := 0.000000
							if( dn1 > 28.648 )
								ret := -0.333333
					if( atr > 0.269177 )
						if( dn1 <= 27.0435 )
							if( up <= 24.6436 )
								ret := 1.000000 // buy
							if( up > 24.6436 )
								if( up1 <= 25.0105 )
									ret := 0.000000
								if( up1 > 25.0105 )
									ret := 0.833333 // buy
						if( dn1 > 27.0435 )
							if( atr <= 0.403657 )
								if( dn <= 28.3697 )
									ret := 0.358491
								if( dn > 28.3697 )
									ret := 0.733333 // buy
							if( atr > 0.403657 )
								if( atr2 <= 0.4207 )
									ret := -0.800000 // sell
								if( atr2 > 0.4207 )
									ret := 0.000000
			if( dn > 28.7704 )
				if( up1 <= 29.2204 )
					if( dn1 <= 30.5621 )
						if( dn1 <= 29.8002 )
							if( atr2 <= 0.260525 )
								if( dn <= 29.0334 )
									ret := 0.487805
								if( dn > 29.0334 )
									ret := -0.069597
							if( atr2 > 0.260525 )
								if( up <= 28.1738 )
									ret := -0.481752
								if( up > 28.1738 )
									ret := 0.714286 // buy
						if( dn1 > 29.8002 )
							if( atr2 <= 0.291911 )
								if( dn <= 29.8465 )
									ret := 0.454545
								if( dn > 29.8465 )
									ret := -0.114537
							if( atr2 > 0.291911 )
								if( atr2 <= 0.377735 )
									ret := 0.375000
								if( atr2 > 0.377735 )
									ret := 0.789474 // buy
					if( dn1 > 30.5621 )
						if( up <= 29.2458 )
							if( up <= 28.4384 )
								if( atr2 <= 0.424565 )
									ret := 0.000000
								if( atr2 > 0.424565 )
									ret := -0.250000
							if( up > 28.4384 )
								if( dn1 <= 30.7514 )
									ret := -0.803922 // sell
								if( dn1 > 30.7514 )
									ret := -0.638298
						if( up > 29.2458 )
							if( up <= 29.2769 )
								ret := 0.600000
							if( up > 29.2769 )
								ret := -0.600000
				if( up1 > 29.2204 )
					if( up1 <= 36.4415 )
						if( dn1 <= 37.5821 )
							if( dn <= 37.018 )
								if( up1 <= 30.9163 )
									ret := 0.123894
								if( up1 > 30.9163 )
									ret := 0.425532
							if( dn > 37.018 )
								if( atr <= 0.325185 )
									ret := -0.025641
								if( atr > 0.325185 )
									ret := -0.727273 // sell
						if( dn1 > 37.5821 )
							if( atr2 <= 0.269255 )
								if( up <= 36.4239 )
									ret := 0.872340 // buy
								if( up > 36.4239 )
									ret := 0.454545
							if( atr2 > 0.269255 )
								if( up1 <= 35.9259 )
									ret := 0.716418 // buy
								if( up1 > 35.9259 )
									ret := 0.223301
					if( up1 > 36.4415 )
						if( dn1 <= 39.9043 )
							if( dn <= 37.426 )
								if( up1 <= 36.5164 )
									ret := 0.333333
								if( up1 > 36.5164 )
									ret := 1.000000 // buy
							if( dn > 37.426 )
								if( dn1 <= 38.0767 )
									ret := -0.588235
								if( dn1 > 38.0767 )
									ret := -0.175393
						if( dn1 > 39.9043 )
							if( dn1 <= 40.5602 )
								if( up <= 39.6378 )
									ret := 0.644068
								if( up > 39.6378 )
									ret := -0.250000
							if( dn1 > 40.5602 )
								if( up1 <= 39.4759 )
									ret := -0.439394
								if( up1 > 39.4759 )
									ret := 0.120335
		if( atr2 > 0.439876 )
			if( atr <= 0.529934 )
				if( atr2 <= 0.568178 )
					if( atr <= 0.457578 )
						if( up1 <= 25.295 )
							if( up1 <= 24.5506 )
								ret := 1.000000 // buy
							if( up1 > 24.5506 )
								ret := 0.750000 // buy
						if( up1 > 25.295 )
							if( up1 <= 27.1513 )
								if( atr2 <= 0.494385 )
									ret := -0.692308
								if( atr2 > 0.494385 )
									ret := 0.000000
							if( up1 > 27.1513 )
								if( atr <= 0.433753 )
									ret := 0.315789
								if( atr > 0.433753 )
									ret := -0.020408
					if( atr > 0.457578 )
						if( up1 <= 42.248 )
							if( up <= 41.601 )
								if( up <= 39.8597 )
									ret := 0.600000
								if( up > 39.8597 )
									ret := -0.071429
							if( up > 41.601 )
								if( dn <= 44.6297 )
									ret := 0.555556
								if( dn > 44.6297 )
									ret := 0.885714 // buy
						if( up1 > 42.248 )
							if( up <= 42.4319 )
								ret := -1.000000 // sell
							if( up > 42.4319 )
								ret := 0.666667
				if( atr2 > 0.568178 )
					if( up1 <= 41.4744 )
						if( atr2 <= 0.599011 )
							if( atr <= 0.445173 )
								ret := 0.000000
							if( atr > 0.445173 )
								ret := -0.600000
						if( atr2 > 0.599011 )
							if( atr <= 0.477017 )
								ret := 1.000000 // buy
							if( atr > 0.477017 )
								if( atr2 <= 0.610405 )
									ret := 0.000000
								if( atr2 > 0.610405 )
									ret := 0.250000
					if( up1 > 41.4744 )
						if( dn <= 44.6444 )
							if( up <= 41.6472 )
								ret := -1.000000 // sell
							if( up > 41.6472 )
								ret := -0.750000 // sell
						if( dn > 44.6444 )
							if( up <= 41.8862 )
								ret := -0.500000
							if( up > 41.8862 )
								ret := 0.000000
			if( atr > 0.529934 )
				if( up <= 38.7429 )
					if( dn <= 44.2744 )
						if( dn1 <= 43.5478 )
							if( atr2 <= 0.50217 )
								if( atr <= 0.641863 )
									ret := -0.428571
								if( atr > 0.641863 )
									ret := 0.750000 // buy
							if( atr2 > 0.50217 )
								if( atr2 <= 1.12025 )
									ret := 0.739130 // buy
								if( atr2 > 1.12025 )
									ret := 0.000000
						if( dn1 > 43.5478 )
							ret := -0.500000
					if( dn > 44.2744 )
						if( dn1 <= 45.4521 )
							ret := 1.000000 // buy
						if( dn1 > 45.4521 )
							ret := 0.750000 // buy
				if( up > 38.7429 )
					if( up1 <= 38.6598 )
						if( up <= 39.1898 )
							if( dn <= 42.4931 )
								ret := -1.000000 // sell
							if( dn > 42.4931 )
								ret := 0.000000
						if( up > 39.1898 )
							ret := -1.000000 // sell
					if( up1 > 38.6598 )
						if( dn <= 42.0197 )
							ret := -0.714286 // sell
						if( dn > 42.0197 )
							if( dn <= 43.1323 )
								if( dn <= 42.3914 )
									ret := 0.333333
								if( dn > 42.3914 )
									ret := 0.879310 // buy
							if( dn > 43.1323 )
								if( dn <= 43.3213 )
									ret := -0.391304
								if( dn > 43.3213 )
									ret := 0.465686
	if( dn > 45.0469 )
		if( dn1 <= 938.641 )
			if( atr2 <= 6.98501 )
				if( atr <= 1.11364 )
					if( trend <= -0.977518 )
						if( up1 <= 48.4025 )
							if( up1 <= 45.0793 )
								if( dn <= 45.9084 )
									ret := 0.750000 // buy
								if( dn > 45.9084 )
									ret := -1.000000 // sell
							if( up1 > 45.0793 )
								if( atr2 <= 0.19175 )
									ret := -0.250000
								if( atr2 > 0.19175 )
									ret := 0.897959 // buy
						if( up1 > 48.4025 )
							if( up <= 50.52 )
								if( atr <= 0.786269 )
									ret := -0.720930 // sell
								if( atr > 0.786269 )
									ret := 1.000000 // buy
							if( up > 50.52 )
								if( up1 <= 60.6491 )
									ret := 0.563492
								if( up1 > 60.6491 )
									ret := 0.200993
					if( trend > -0.977518 )
						if( dn1 <= 291.408 )
							if( atr2 <= 0.091757 )
								if( up1 <= 61.1802 )
									ret := -0.625000
								if( up1 > 61.1802 )
									ret := -0.111111
							if( atr2 > 0.091757 )
								if( dn1 <= 203.302 )
									ret := 0.030436
								if( dn1 > 203.302 )
									ret := -0.043343
						if( dn1 > 291.408 )
							if( dn <= 299.297 )
								if( up1 <= 285.318 )
									ret := 0.000000
								if( up1 > 285.318 )
									ret := 0.742424 // buy
							if( dn > 299.297 )
								if( up <= 313.883 )
									ret := 0.020408
								if( up > 313.883 )
									ret := 0.406250
				if( atr > 1.11364 )
					if( up <= 71.6216 )
						if( dn <= 84.5109 )
							if( atr <= 1.49217 )
								if( up1 <= 43.4133 )
									ret := -0.121739
								if( up1 > 43.4133 )
									ret := 0.238095
							if( atr > 1.49217 )
								if( up <= 45.5087 )
									ret := 0.070175
								if( up > 45.5087 )
									ret := 0.788288 // buy
						if( dn > 84.5109 )
							ret := -1.000000 // sell
					if( up > 71.6216 )
						if( up <= 74.6145 )
							if( up <= 72.9702 )
								if( up <= 72.8416 )
									ret := -0.230769
								if( up > 72.8416 )
									ret := 0.833333 // buy
							if( up > 72.9702 )
								if( dn1 <= 86.9417 )
									ret := -0.459184
								if( dn1 > 86.9417 )
									ret := 0.285714
						if( up > 74.6145 )
							if( up1 <= 76.6422 )
								if( dn1 <= 83.3604 )
									ret := 0.200000
								if( dn1 > 83.3604 )
									ret := 0.765306 // buy
							if( up1 > 76.6422 )
								if( dn <= 89.8468 )
									ret := -0.244344
								if( dn > 89.8468 )
									ret := 0.071639
			if( atr2 > 6.98501 )
				if( dn <= 520.512 )
					if( dn1 <= 282.892 )
						if( up1 <= 42.5412 )
							if( atr2 <= 7.44229 )
								ret := -1.000000 // sell
							if( atr2 > 7.44229 )
								if( atr2 <= 53.0685 )
									ret := 0.888889 // buy
								if( atr2 > 53.0685 )
									ret := 0.000000
						if( up1 > 42.5412 )
							ret := -1.000000 // sell
					if( dn1 > 282.892 )
						if( up <= 459.184 )
							if( atr2 <= 9.58957 )
								if( atr <= 8.22632 )
									ret := 0.306122
								if( atr > 8.22632 )
									ret := -0.625000
							if( atr2 > 9.58957 )
								if( atr2 <= 11.0811 )
									ret := 0.960000 // buy
								if( atr2 > 11.0811 )
									ret := 0.750000 // buy
						if( up > 459.184 )
							if( atr2 <= 9.07917 )
								if( up <= 478.155 )
									ret := 0.951220 // buy
								if( up > 478.155 )
									ret := 0.333333
							if( atr2 > 9.07917 )
								if( atr <= 8.48952 )
									ret := -0.500000
								if( atr > 8.48952 )
									ret := -1.000000 // sell
				if( dn > 520.512 )
					if( up1 <= 670.083 )
						if( up1 <= 515.978 )
							if( dn1 <= 536.033 )
								if( up <= 476.918 )
									ret := -0.857143 // sell
								if( up > 476.918 )
									ret := -0.210526
							if( dn1 > 536.033 )
								if( up1 <= 470.026 )
									ret := -0.600000
								if( up1 > 470.026 )
									ret := -0.973684 // sell
						if( up1 > 515.978 )
							if( up1 <= 595.063 )
								if( atr2 <= 14.131 )
									ret := 0.137255
								if( atr2 > 14.131 )
									ret := 0.689655
							if( up1 > 595.063 )
								if( up <= 644.835 )
									ret := -0.298805
								if( up > 644.835 )
									ret := -0.554795
					if( up1 > 670.083 )
						if( dn <= 796.479 )
							if( atr2 <= 9.46157 )
								if( atr2 <= 7.61063 )
									ret := 0.047619
								if( atr2 > 7.61063 )
									ret := -0.458824
							if( atr2 > 9.46157 )
								if( atr <= 9.12739 )
									ret := 0.696970
								if( atr > 9.12739 )
									ret := -0.026549
						if( dn > 796.479 )
							if( up1 <= 756.256 )
								if( atr2 <= 16.0874 )
									ret := 0.653543
								if( atr2 > 16.0874 )
									ret := -1.000000 // sell
							if( up1 > 756.256 )
								if( dn1 <= 892.089 )
									ret := -0.183432
								if( dn1 > 892.089 )
									ret := 0.174312
		if( dn1 > 938.641 )
			if( atr2 <= 6.29235 )
				if( atr2 <= 4.94979 )
					if( dn1 <= 942.628 )
						if( up <= 915.865 )
							ret := -0.200000
						if( up > 915.865 )
							if( atr2 <= 3.24321 )
								ret := -0.571429
							if( atr2 > 3.24321 )
								ret := -1.000000 // sell
					if( dn1 > 942.628 )
						if( atr <= 4.30119 )
							if( up1 <= 938.891 )
								if( atr2 <= 3.71428 )
									ret := -0.131579
								if( atr2 > 3.71428 )
									ret := 0.307692
							if( up1 > 938.891 )
								if( atr <= 3.56073 )
									ret := -0.615385
								if( atr > 3.56073 )
									ret := -0.181818
						if( atr > 4.30119 )
							if( up <= 922.49 )
								ret := 0.000000
							if( up > 922.49 )
								if( atr2 <= 4.2466 )
									ret := -0.909091 // sell
								if( atr2 > 4.2466 )
									ret := -0.307692
				if( atr2 > 4.94979 )
					if( up <= 922.732 )
						if( up1 <= 915.695 )
							if( dn <= 942.384 )
								ret := 0.000000
							if( dn > 942.384 )
								if( atr <= 6.08181 )
									ret := 0.000000
								if( atr > 6.08181 )
									ret := -0.500000
						if( up1 > 915.695 )
							if( dn <= 954.164 )
								if( atr2 <= 5.84909 )
									ret := 0.866667 // buy
								if( atr2 > 5.84909 )
									ret := 0.333333
							if( dn > 954.164 )
								ret := 0.200000
					if( up > 922.732 )
						if( atr2 <= 5.7658 )
							if( dn1 <= 954.931 )
								ret := -0.500000
							if( dn1 > 954.931 )
								if( up1 <= 929.483 )
									ret := 0.222222
								if( up1 > 929.483 )
									ret := -0.142857
						if( atr2 > 5.7658 )
							if( up1 <= 935.062 )
								ret := -0.750000 // sell
							if( up1 > 935.062 )
								ret := -0.500000
			if( atr2 > 6.29235 )
				if( dn1 <= 970.63 )
					if( atr2 <= 14.4153 )
						if( dn <= 954.422 )
							if( dn <= 937.834 )
								ret := -0.600000
							if( dn > 937.834 )
								if( dn1 <= 953.054 )
									ret := -1.000000 // sell
								if( dn1 > 953.054 )
									ret := -0.750000 // sell
						if( dn > 954.422 )
							if( up1 <= 926.993 )
								if( atr <= 8.61923 )
									ret := 0.125000
								if( atr > 8.61923 )
									ret := -0.500000
							if( up1 > 926.993 )
								ret := -1.000000 // sell
					if( atr2 > 14.4153 )
						ret := 0.166667
				if( dn1 > 970.63 )
					if( dn <= 974.128 )
						if( dn1 <= 974.746 )
							ret := 0.250000
						if( dn1 > 974.746 )
							ret := 0.750000 // buy
					if( dn > 974.128 )
						if( atr2 <= 8.18155 )
							ret := -0.250000
						if( atr2 > 8.18155 )
							ret := -0.200000
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_TTD_15Min_eaaeeb46(dn1, atr, dn, up1, up, sellSignalInt, atr2, buySignalInt, trend)

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


