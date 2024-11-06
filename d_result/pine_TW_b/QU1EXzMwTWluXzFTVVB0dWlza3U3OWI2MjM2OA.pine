//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: SuperTrend
// ID_model: AMD_30Min_1SUP_79b62368 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMD_30Min_1SUP_79b62368", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMD_30Min_79b62368(atr, up, dn1, sellSignalInt, buySignalInt, atr2, dn, trend, up1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( up <= 6.66409 )
		if( dn <= 3.51446 )
			if( up <= 2.73116 )
				if( atr2 <= 0.036147 )
					if( dn1 <= 1.98452 )
						if( up <= 1.8752 )
							if( dn1 <= 1.9151 )
								if( dn <= 1.89262 )
									ret := 1.000000 // buy
								if( dn > 1.89262 )
									ret := 0.904762 // buy
							if( dn1 > 1.9151 )
								if( dn <= 1.95369 )
									ret := 0.159420
								if( dn > 1.95369 )
									ret := 0.787500 // buy
						if( up > 1.8752 )
							ret := -1.000000 // sell
					if( dn1 > 1.98452 )
						if( up1 <= 1.87362 )
							if( up <= 1.85955 )
								if( dn <= 1.9946 )
									ret := 0.640000
								if( dn > 1.9946 )
									ret := -0.200000
							if( up > 1.85955 )
								if( up1 <= 1.86761 )
									ret := -1.000000 // sell
								if( up1 > 1.86761 )
									ret := -0.500000
						if( up1 > 1.87362 )
							if( dn1 <= 2.05149 )
								if( dn <= 2.01086 )
									ret := -0.272727
								if( dn > 2.01086 )
									ret := 0.976744 // buy
							if( dn1 > 2.05149 )
								if( atr <= 0.029511 )
									ret := 0.070322
								if( atr > 0.029511 )
									ret := 0.274298
				if( atr2 > 0.036147 )
					if( up <= 2.60074 )
						if( up <= 1.71003 )
							if( dn1 <= 1.96485 )
								ret := 0.000000
							if( dn1 > 1.96485 )
								if( dn <= 1.95723 )
									ret := 1.000000 // buy
								if( dn > 1.95723 )
									ret := 0.500000
						if( up > 1.71003 )
							if( up1 <= 1.88011 )
								if( dn <= 1.94732 )
									ret := 0.142857
								if( dn > 1.94732 )
									ret := -0.781250 // sell
							if( up1 > 1.88011 )
								if( dn <= 2.42336 )
									ret := 0.120930
								if( dn > 2.42336 )
									ret := -0.361371
					if( up > 2.60074 )
						if( up <= 2.70834 )
							if( up1 <= 2.69055 )
								if( up1 <= 2.67404 )
									ret := 0.356322
								if( up1 > 2.67404 )
									ret := -0.615385
							if( up1 > 2.69055 )
								if( dn <= 2.90712 )
									ret := 0.750000 // buy
								if( dn > 2.90712 )
									ret := 1.000000 // buy
						if( up > 2.70834 )
							if( up <= 2.71554 )
								ret := -1.000000 // sell
							if( up > 2.71554 )
								ret := -0.500000
			if( up > 2.73116 )
				if( up1 <= 2.79576 )
					if( atr2 <= 0.020676 )
						if( atr <= 0.018127 )
							if( up1 <= 2.73137 )
								ret := -0.800000 // sell
							if( up1 > 2.73137 )
								ret := -1.000000 // sell
						if( atr > 0.018127 )
							if( dn <= 2.87572 )
								if( up <= 2.73312 )
									ret := -0.500000
								if( up > 2.73312 )
									ret := -0.909091 // sell
							if( dn > 2.87572 )
								ret := -0.500000
					if( atr2 > 0.020676 )
						if( atr2 <= 0.026001 )
							if( atr <= 0.025666 )
								if( atr <= 0.020667 )
									ret := 0.142857
								if( atr > 0.020667 )
									ret := -0.600000
							if( atr > 0.025666 )
								if( up1 <= 2.73192 )
									ret := -1.000000 // sell
								if( up1 > 2.73192 )
									ret := 0.750000 // buy
						if( atr2 > 0.026001 )
							if( dn1 <= 2.91655 )
								ret := -1.000000 // sell
							if( dn1 > 2.91655 )
								if( atr <= 0.030281 )
									ret := -0.250000
								if( atr > 0.030281 )
									ret := -0.680851
				if( up1 > 2.79576 )
					if( up <= 2.84527 )
						if( dn1 <= 3.13112 )
							if( up1 <= 2.81544 )
								if( atr2 <= 0.031446 )
									ret := -0.800000 // sell
								if( atr2 > 0.031446 )
									ret := 0.000000
							if( up1 > 2.81544 )
								if( atr <= 0.030949 )
									ret := 0.900000 // buy
								if( atr > 0.030949 )
									ret := -0.200000
						if( dn1 > 3.13112 )
							ret := 1.000000 // buy
					if( up > 2.84527 )
						if( up1 <= 2.84389 )
							ret := -0.250000
						if( up1 > 2.84389 )
							ret := -1.000000 // sell
		if( dn > 3.51446 )
			if( up1 <= 3.45851 )
				if( up1 <= 3.30987 )
					if( up <= 2.88373 )
						ret := -1.000000 // sell
					if( up > 2.88373 )
						if( atr2 <= 0.119335 )
							if( up <= 3.08697 )
								ret := 1.000000 // buy
							if( up > 3.08697 )
								if( atr2 <= 0.085487 )
									ret := 0.222222
								if( atr2 > 0.085487 )
									ret := -1.000000 // sell
						if( atr2 > 0.119335 )
							if( atr2 <= 0.126209 )
								if( atr2 <= 0.123212 )
									ret := 1.000000 // buy
								if( atr2 > 0.123212 )
									ret := 0.500000
							if( atr2 > 0.126209 )
								if( dn <= 4.03924 )
									ret := 1.000000 // buy
								if( dn > 4.03924 )
									ret := 0.750000 // buy
				if( up1 > 3.30987 )
					if( up <= 3.46875 )
						if( dn <= 3.70405 )
							if( dn <= 3.56382 )
								ret := 1.000000 // buy
							if( dn > 3.56382 )
								if( atr2 <= 0.039745 )
									ret := 0.444444
								if( atr2 > 0.039745 )
									ret := 0.861111 // buy
						if( dn > 3.70405 )
							if( dn1 <= 3.72329 )
								ret := 0.750000 // buy
							if( dn1 > 3.72329 )
								ret := 1.000000 // buy
					if( up > 3.46875 )
						ret := 0.250000
			if( up1 > 3.45851 )
				if( up <= 5.92709 )
					if( dn <= 6.23469 )
						if( dn <= 5.76245 )
							if( up1 <= 5.05439 )
								if( up1 <= 3.72806 )
									ret := 0.000000
								if( up1 > 3.72806 )
									ret := 0.229719
							if( up1 > 5.05439 )
								if( sellSignalInt <= 0.5 )
									ret := -0.327434
								if( sellSignalInt > 0.5 )
									ret := 0.571429
						if( dn > 5.76245 )
							if( atr <= 0.073196 )
								if( atr <= 0.040202 )
									ret := 0.578947
								if( atr > 0.040202 )
									ret := -0.020408
							if( atr > 0.073196 )
								if( dn1 <= 6.15776 )
									ret := 0.869048 // buy
								if( dn1 > 6.15776 )
									ret := 0.210526
					if( dn > 6.23469 )
						if( atr <= 0.101669 )
							if( atr2 <= 0.08225 )
								ret := 0.000000
							if( atr2 > 0.08225 )
								if( dn1 <= 6.30901 )
									ret := -0.428571
								if( dn1 > 6.30901 )
									ret := -1.000000 // sell
						if( atr > 0.101669 )
							if( dn1 <= 6.37211 )
								if( dn1 <= 6.2927 )
									ret := -1.000000 // sell
								if( dn1 > 6.2927 )
									ret := -0.500000
							if( dn1 > 6.37211 )
								ret := -1.000000 // sell
				if( up > 5.92709 )
					if( atr <= 0.039318 )
						if( atr2 <= 0.044134 )
							if( dn <= 6.62589 )
								if( up1 <= 6.29143 )
									ret := 0.643564
								if( up1 > 6.29143 )
									ret := 0.900000 // buy
							if( dn > 6.62589 )
								if( dn1 <= 6.73521 )
									ret := -0.219512
								if( dn1 > 6.73521 )
									ret := 0.761364 // buy
						if( atr2 > 0.044134 )
							if( up1 <= 6.53146 )
								ret := -0.250000
							if( up1 > 6.53146 )
								ret := -1.000000 // sell
					if( atr > 0.039318 )
						if( dn1 <= 7.07659 )
							if( up <= 6.56355 )
								if( atr2 <= 0.063705 )
									ret := 0.293501
								if( atr2 > 0.063705 )
									ret := 0.084746
							if( up > 6.56355 )
								if( dn1 <= 6.88204 )
									ret := 0.728395 // buy
								if( dn1 > 6.88204 )
									ret := 0.244048
						if( dn1 > 7.07659 )
							if( up1 <= 6.50351 )
								if( up <= 6.36541 )
									ret := -0.500000
								if( up > 6.36541 )
									ret := 0.689655
							if( up1 > 6.50351 )
								if( atr2 <= 0.143005 )
									ret := -0.439024
								if( atr2 > 0.143005 )
									ret := 0.833333 // buy
	if( up > 6.66409 )
		if( dn <= 169.417 )
			if( up <= 6.87575 )
				if( atr2 <= 0.032 )
					if( up <= 6.7759 )
						if( up <= 6.69048 )
							ret := -0.500000
						if( up > 6.69048 )
							if( up <= 6.73827 )
								ret := 0.250000
							if( up > 6.73827 )
								ret := -0.166667
					if( up > 6.7759 )
						if( dn1 <= 7.0326 )
							if( up1 <= 6.86244 )
								ret := -1.000000 // sell
							if( up1 > 6.86244 )
								ret := -0.750000 // sell
						if( dn1 > 7.0326 )
							ret := -0.400000
				if( atr2 > 0.032 )
					if( atr <= 0.074058 )
						if( dn <= 7.09111 )
							if( dn <= 6.93038 )
								if( atr2 <= 0.038544 )
									ret := 0.714286 // buy
								if( atr2 > 0.038544 )
									ret := -0.777778 // sell
							if( dn > 6.93038 )
								if( atr2 <= 0.035482 )
									ret := -0.352941
								if( atr2 > 0.035482 )
									ret := 0.238095
						if( dn > 7.09111 )
							if( atr <= 0.061811 )
								if( dn <= 7.15237 )
									ret := -0.352941
								if( dn > 7.15237 )
									ret := -0.807692 // sell
							if( atr > 0.061811 )
								if( atr <= 0.063142 )
									ret := 0.615385
								if( atr > 0.063142 )
									ret := 0.033333
					if( atr > 0.074058 )
						if( dn <= 7.36085 )
							if( atr2 <= 0.07473 )
								if( up1 <= 6.83653 )
									ret := -1.000000 // sell
								if( up1 > 6.83653 )
									ret := -0.500000
							if( atr2 > 0.07473 )
								if( dn <= 7.12021 )
									ret := 0.000000
								if( dn > 7.12021 )
									ret := -0.692308
						if( dn > 7.36085 )
							if( dn <= 7.42144 )
								ret := 1.000000 // buy
							if( dn > 7.42144 )
								ret := -1.000000 // sell
			if( up > 6.87575 )
				if( up1 <= 159.363 )
					if( dn <= 10.1165 )
						if( up1 <= 8.14843 )
							if( up <= 7.58154 )
								if( atr <= 0.028256 )
									ret := 0.451613
								if( atr > 0.028256 )
									ret := 0.081739
							if( up > 7.58154 )
								if( atr2 <= 0.055885 )
									ret := -0.882353 // sell
								if( atr2 > 0.055885 )
									ret := -0.076923
						if( up1 > 8.14843 )
							if( dn <= 8.98054 )
								if( atr2 <= 0.043 )
									ret := 0.125000
								if( atr2 > 0.043 )
									ret := 0.627907
							if( dn > 8.98054 )
								if( atr2 <= 0.122461 )
									ret := 0.129825
								if( atr2 > 0.122461 )
									ret := 0.466667
					if( dn > 10.1165 )
						if( atr2 <= 4.42516 )
							if( dn <= 84.3671 )
								if( up1 <= 33.9742 )
									ret := 0.034617
								if( up1 > 33.9742 )
									ret := 0.082470
							if( dn > 84.3671 )
								if( up1 <= 126.703 )
									ret := 0.007379
								if( up1 > 126.703 )
									ret := 0.063666
						if( atr2 > 4.42516 )
							if( dn1 <= 158.352 )
								ret := -0.250000
							if( dn1 > 158.352 )
								if( atr2 <= 4.66645 )
									ret := 1.000000 // buy
								if( atr2 > 4.66645 )
									ret := 0.666667
				if( up1 > 159.363 )
					if( dn1 <= 167.989 )
						if( trend <= 0.960102 )
							if( trend <= -0.676327 )
								ret := -0.500000
							if( trend > -0.676327 )
								ret := -1.000000 // sell
						if( trend > 0.960102 )
							if( up1 <= 159.705 )
								if( dn <= 165.963 )
									ret := 0.568182
								if( dn > 165.963 )
									ret := 0.111111
							if( up1 > 159.705 )
								if( atr2 <= 0.672015 )
									ret := 0.264840
								if( atr2 > 0.672015 )
									ret := 0.059172
					if( dn1 > 167.989 )
						if( up1 <= 165.335 )
							if( up <= 160.474 )
								if( dn <= 167.303 )
									ret := 1.000000 // buy
								if( dn > 167.303 )
									ret := -0.250000
							if( up > 160.474 )
								if( atr <= 1.16837 )
									ret := 0.395604
								if( atr > 1.16837 )
									ret := 0.753623 // buy
						if( up1 > 165.335 )
							if( dn <= 168.952 )
								if( dn1 <= 168.693 )
									ret := 0.200000
								if( dn1 > 168.693 )
									ret := 0.000000
							if( dn > 168.952 )
								if( dn <= 169.007 )
									ret := -0.750000 // sell
								if( dn > 169.007 )
									ret := -0.142857
		if( dn > 169.417 )
			if( dn <= 171.585 )
				if( atr2 <= 1.12555 )
					if( dn1 <= 169.99 )
						if( dn <= 169.778 )
							if( dn1 <= 169.749 )
								if( atr2 <= 0.555998 )
									ret := 0.000000
								if( atr2 > 0.555998 )
									ret := -0.777778 // sell
							if( dn1 > 169.749 )
								if( dn <= 169.684 )
									ret := -0.200000
								if( dn > 169.684 )
									ret := 0.750000 // buy
						if( dn > 169.778 )
							if( atr <= 0.91452 )
								ret := -0.400000
							if( atr > 0.91452 )
								if( dn1 <= 169.872 )
									ret := -1.000000 // sell
								if( dn1 > 169.872 )
									ret := -0.750000 // sell
					if( dn1 > 169.99 )
						if( up <= 164.589 )
							if( atr <= 1.1001 )
								ret := -0.200000
							if( atr > 1.1001 )
								if( dn <= 169.934 )
									ret := 0.500000
								if( dn > 169.934 )
									ret := 1.000000 // buy
						if( up > 164.589 )
							if( up <= 169.183 )
								if( atr2 <= 0.624876 )
									ret := 0.159091
								if( atr2 > 0.624876 )
									ret := -0.177419
							if( up > 169.183 )
								ret := -1.000000 // sell
				if( atr2 > 1.12555 )
					if( up1 <= 160.966 )
						if( dn1 <= 170.246 )
							if( atr <= 1.81985 )
								ret := 0.600000
							if( atr > 1.81985 )
								if( dn <= 169.805 )
									ret := -0.250000
								if( dn > 169.805 )
									ret := -1.000000 // sell
						if( dn1 > 170.246 )
							if( dn <= 171.221 )
								if( atr2 <= 2.53503 )
									ret := -0.867925 // sell
								if( atr2 > 2.53503 )
									ret := -0.500000
							if( dn > 171.221 )
								ret := -0.500000
					if( up1 > 160.966 )
						if( up <= 164.155 )
							if( up1 <= 163.214 )
								if( atr <= 1.45028 )
									ret := -0.159091
								if( atr > 1.45028 )
									ret := -0.538462
							if( up1 > 163.214 )
								if( atr2 <= 1.36556 )
									ret := 0.000000
								if( atr2 > 1.36556 )
									ret := 0.700000 // buy
						if( up > 164.155 )
							if( atr <= 1.23062 )
								if( dn <= 171.122 )
									ret := 0.000000
								if( dn > 171.122 )
									ret := -0.666667
							if( atr > 1.23062 )
								ret := -1.000000 // sell
			if( dn > 171.585 )
				if( up1 <= 162.884 )
					if( up <= 155.786 )
						if( dn <= 177.359 )
							ret := -0.500000
						if( dn > 177.359 )
							ret := -0.833333 // sell
					if( up > 155.786 )
						if( atr <= 2.63004 )
							if( up <= 161.623 )
								if( dn <= 173.415 )
									ret := -0.583333
								if( dn > 173.415 )
									ret := 0.250000
							if( up > 161.623 )
								if( dn1 <= 173.659 )
									ret := 0.732143 // buy
								if( dn1 > 173.659 )
									ret := 0.208333
						if( atr > 2.63004 )
							ret := 1.000000 // buy
				if( up1 > 162.884 )
					if( atr <= 0.511866 )
						if( dn1 <= 178.643 )
							if( up <= 174.497 )
								if( dn <= 173.742 )
									ret := 0.487179
								if( dn > 173.742 )
									ret := -0.111111
							if( up > 174.497 )
								if( atr2 <= 0.382374 )
									ret := 0.428571
								if( atr2 > 0.382374 )
									ret := 0.900000 // buy
						if( dn1 > 178.643 )
							if( atr <= 0.499109 )
								if( up <= 175.937 )
									ret := -1.000000 // sell
								if( up > 175.937 )
									ret := -0.131579
							if( atr > 0.499109 )
								ret := 0.571429
					if( atr > 0.511866 )
						if( dn <= 216.074 )
							if( atr <= 1.14944 )
								if( up <= 179.542 )
									ret := -0.126739
								if( up > 179.542 )
									ret := -0.449438
							if( atr > 1.14944 )
								if( up1 <= 188.003 )
									ret := -0.072344
								if( up1 > 188.003 )
									ret := 0.208791
						if( dn > 216.074 )
							if( up <= 206.621 )
								if( dn <= 218.203 )
									ret := -0.272727
								if( dn > 218.203 )
									ret := -0.636364
							if( up > 206.621 )
								if( dn1 <= 217.34 )
									ret := -0.666667
								if( dn1 > 217.34 )
									ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_AMD_30Min_79b62368(atr, up, dn1, sellSignalInt, buySignalInt, atr2, dn, trend, up1)

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


