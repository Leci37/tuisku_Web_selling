//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: SuperTrend
// ID_model: DOTUSDT_30Min_1SUP_2c43fd6e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOTUSDT_30Min_1SUP_2c43fd6e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOTUSDT_30Min_2c43fd6e(dn1, trend, atr, atr2, buySignalInt, sellSignalInt, up1, up, dn)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( atr <= 0.053791 )
		if( up1 <= 4.41646 )
			if( atr <= 0.03244 )
				if( up <= 3.96659 )
					if( dn <= 3.91289 )
						if( dn <= 3.90421 )
							if( atr2 <= 0.015911 )
								if( atr <= 0.011325 )
									ret := 0.009524
								if( atr > 0.011325 )
									ret := -0.131737
							if( atr2 > 0.015911 )
								if( up <= 3.75383 )
									ret := 0.169231
								if( up > 3.75383 )
									ret := -0.153846
						if( dn > 3.90421 )
							if( atr2 <= 0.02892 )
								ret := -0.142857
							if( atr2 > 0.02892 )
								ret := -1.000000 // sell
					if( dn > 3.91289 )
						if( up1 <= 3.82179 )
							if( dn <= 3.9401 )
								if( atr <= 0.028262 )
									ret := 0.083333
								if( atr > 0.028262 )
									ret := 0.500000
							if( dn > 3.9401 )
								if( dn1 <= 3.95566 )
									ret := 1.000000 // buy
								if( dn1 > 3.95566 )
									ret := 0.500000
						if( up1 > 3.82179 )
							if( dn <= 4.00194 )
								if( atr2 <= 0.022822 )
									ret := -0.150000
								if( atr2 > 0.022822 )
									ret := -0.500000
							if( dn > 4.00194 )
								if( up1 <= 3.85504 )
									ret := 0.608696
								if( up1 > 3.85504 )
									ret := 0.191304
				if( up > 3.96659 )
					if( up <= 4.08425 )
						if( up1 <= 4.05963 )
							if( dn1 <= 4.22692 )
								if( atr <= 0.022603 )
									ret := -0.014535
								if( atr > 0.022603 )
									ret := -0.122905
							if( dn1 > 4.22692 )
								if( dn <= 4.2321 )
									ret := 0.548387
								if( dn > 4.2321 )
									ret := -0.400000
						if( up1 > 4.05963 )
							if( atr2 <= 0.025874 )
								if( dn1 <= 4.18826 )
									ret := -0.221311
								if( dn1 > 4.18826 )
									ret := 0.055556
							if( atr2 > 0.025874 )
								if( up1 <= 4.07099 )
									ret := -0.588235
								if( up1 > 4.07099 )
									ret := -0.050000
					if( up > 4.08425 )
						if( atr <= 0.03194 )
							if( up <= 4.11206 )
								if( dn1 <= 4.25589 )
									ret := 0.095436
								if( dn1 > 4.25589 )
									ret := 0.358209
							if( up > 4.11206 )
								if( up1 <= 4.41546 )
									ret := 0.017126
								if( up1 > 4.41546 )
									ret := 0.529412
						if( atr > 0.03194 )
							if( atr2 <= 0.031905 )
								if( atr2 <= 0.03082 )
									ret := -0.130435
								if( atr2 > 0.03082 )
									ret := 0.266667
							if( atr2 > 0.031905 )
								if( up1 <= 4.37676 )
									ret := -0.346939
								if( up1 > 4.37676 )
									ret := -0.857143 // sell
			if( atr > 0.03244 )
				if( up1 <= 3.61767 )
					if( atr <= 0.053113 )
						ret := 1.000000 // buy
					if( atr > 0.053113 )
						ret := 0.750000 // buy
				if( up1 > 3.61767 )
					if( dn <= 3.88962 )
						if( dn1 <= 3.89256 )
							ret := -1.000000 // sell
						if( dn1 > 3.89256 )
							ret := -0.750000 // sell
					if( dn > 3.88962 )
						if( up1 <= 4.39421 )
							if( up1 <= 4.39267 )
								if( dn1 <= 4.4318 )
									ret := 0.147920
								if( dn1 > 4.4318 )
									ret := 0.053524
							if( up1 > 4.39267 )
								if( atr <= 0.047728 )
									ret := -0.333333
								if( atr > 0.047728 )
									ret := -1.000000 // sell
						if( up1 > 4.39421 )
							if( atr <= 0.050351 )
								if( dn <= 4.60044 )
									ret := -0.181818
								if( dn > 4.60044 )
									ret := 0.513761
							if( atr > 0.050351 )
								if( atr <= 0.052288 )
									ret := -0.500000
								if( atr > 0.052288 )
									ret := -0.750000 // sell
		if( up1 > 4.41646 )
			if( up <= 6.29896 )
				if( atr2 <= 0.033144 )
					if( dn <= 6.47614 )
						if( dn <= 6.3739 )
							if( dn <= 6.16426 )
								if( atr <= 0.024822 )
									ret := -0.008581
								if( atr > 0.024822 )
									ret := -0.077061
							if( dn > 6.16426 )
								if( atr <= 0.036477 )
									ret := 0.140696
								if( atr > 0.036477 )
									ret := 0.733333 // buy
						if( dn > 6.3739 )
							if( atr2 <= 0.028732 )
								if( dn1 <= 6.38637 )
									ret := -0.384615
								if( dn1 > 6.38637 )
									ret := 0.037383
							if( atr2 > 0.028732 )
								if( up1 <= 6.27483 )
									ret := -0.468468
								if( up1 > 6.27483 )
									ret := 0.071429
					if( dn > 6.47614 )
						if( up1 <= 6.28243 )
							ret := 0.000000
						if( up1 > 6.28243 )
							if( atr2 <= 0.03013 )
								ret := 0.250000
							if( atr2 > 0.03013 )
								ret := 1.000000 // buy
				if( atr2 > 0.033144 )
					if( up <= 4.88386 )
						if( dn <= 5.09727 )
							if( dn1 <= 4.93763 )
								if( up <= 4.53168 )
									ret := -0.144330
								if( up > 4.53168 )
									ret := 0.145283
							if( dn1 > 4.93763 )
								if( up1 <= 4.73646 )
									ret := -0.352113
								if( up1 > 4.73646 )
									ret := -0.024823
						if( dn > 5.09727 )
							if( atr2 <= 0.057785 )
								if( atr2 <= 0.048815 )
									ret := -0.392857
								if( atr2 > 0.048815 )
									ret := -0.836735 // sell
							if( atr2 > 0.057785 )
								if( dn1 <= 5.13376 )
									ret := -0.444444
								if( dn1 > 5.13376 )
									ret := 0.285714
					if( up > 4.88386 )
						if( up <= 4.93878 )
							if( dn <= 5.1219 )
								if( up <= 4.88704 )
									ret := 0.571429
								if( up > 4.88704 )
									ret := -0.300000
							if( dn > 5.1219 )
								if( up1 <= 4.9037 )
									ret := 0.360000
								if( up1 > 4.9037 )
									ret := 0.718750 // buy
						if( up > 4.93878 )
							if( dn <= 5.28061 )
								if( up1 <= 5.05387 )
									ret := 0.148148
								if( up1 > 5.05387 )
									ret := 0.557143
							if( dn > 5.28061 )
								if( dn1 <= 6.54298 )
									ret := 0.017108
								if( dn1 > 6.54298 )
									ret := 0.300000
			if( up > 6.29896 )
				if( up1 <= 6.31514 )
					if( dn1 <= 6.53386 )
						if( dn1 <= 6.44025 )
							if( up1 <= 6.29892 )
								ret := -0.750000 // sell
							if( up1 > 6.29892 )
								ret := -1.000000 // sell
						if( dn1 > 6.44025 )
							if( atr <= 0.037533 )
								if( atr2 <= 0.033673 )
									ret := 0.159091
								if( atr2 > 0.033673 )
									ret := -0.285714
							if( atr > 0.037533 )
								if( atr2 <= 0.036689 )
									ret := 0.857143 // buy
								if( atr2 > 0.036689 )
									ret := 0.454545
					if( dn1 > 6.53386 )
						if( atr2 <= 0.035892 )
							ret := -1.000000 // sell
						if( atr2 > 0.035892 )
							if( up <= 6.30122 )
								if( atr2 <= 0.046345 )
									ret := -1.000000 // sell
								if( atr2 > 0.046345 )
									ret := -0.250000
							if( up > 6.30122 )
								if( up1 <= 6.30936 )
									ret := -0.206897
								if( up1 > 6.30936 )
									ret := -0.500000
				if( up1 > 6.31514 )
					if( dn <= 9.78018 )
						if( up <= 6.32811 )
							if( atr <= 0.042462 )
								if( up1 <= 6.32564 )
									ret := 0.410256
								if( up1 > 6.32564 )
									ret := 0.875000 // buy
							if( atr > 0.042462 )
								if( dn <= 6.62139 )
									ret := -0.269231
								if( dn > 6.62139 )
									ret := 1.000000 // buy
						if( up > 6.32811 )
							if( up1 <= 6.36951 )
								if( dn <= 6.59037 )
									ret := -0.043796
								if( dn > 6.59037 )
									ret := -0.301205
							if( up1 > 6.36951 )
								if( up <= 7.12631 )
									ret := -0.048161
								if( up > 7.12631 )
									ret := 0.024487
					if( dn > 9.78018 )
						if( dn <= 9.96481 )
							ret := -1.000000 // sell
						if( dn > 9.96481 )
							ret := -0.166667
	if( atr > 0.053791 )
		if( dn <= 43.7167 )
			if( up1 <= 7.01095 )
				if( dn <= 4.19248 )
					if( atr2 <= 0.083556 )
						if( atr <= 0.05762 )
							if( up <= 3.75092 )
								if( atr2 <= 0.055246 )
									ret := 0.941176 // buy
								if( atr2 > 0.055246 )
									ret := 0.166667
							if( up > 3.75092 )
								if( dn <= 4.17403 )
									ret := -0.125000
								if( dn > 4.17403 )
									ret := 0.750000 // buy
						if( atr > 0.05762 )
							if( up <= 3.58704 )
								ret := 1.000000 // buy
							if( up > 3.58704 )
								if( up <= 3.62813 )
									ret := 0.000000
								if( up > 3.62813 )
									ret := 0.828125 // buy
					if( atr2 > 0.083556 )
						if( atr <= 0.098534 )
							if( up <= 3.47129 )
								ret := -0.400000
							if( up > 3.47129 )
								ret := -1.000000 // sell
						if( atr > 0.098534 )
							ret := 1.000000 // buy
				if( dn > 4.19248 )
					if( atr2 <= 0.205821 )
						if( up1 <= 4.60809 )
							if( up <= 4.54256 )
								if( dn1 <= 5.19682 )
									ret := 0.094833
								if( dn1 > 5.19682 )
									ret := -0.625000
							if( up > 4.54256 )
								if( up1 <= 4.58127 )
									ret := -0.238411
								if( up1 > 4.58127 )
									ret := -0.706667 // sell
						if( up1 > 4.60809 )
							if( dn <= 5.42076 )
								if( dn <= 5.39597 )
									ret := 0.256912
								if( dn > 5.39597 )
									ret := 0.625731
							if( dn > 5.42076 )
								if( dn <= 6.66536 )
									ret := 0.059859
								if( dn > 6.66536 )
									ret := 0.160534
					if( atr2 > 0.205821 )
						if( dn1 <= 10.374 )
							if( dn1 <= 7.74844 )
								if( dn <= 7.14527 )
									ret := 0.553191
								if( dn > 7.14527 )
									ret := -0.056604
							if( dn1 > 7.74844 )
								if( atr2 <= 0.425597 )
									ret := 0.656489
								if( atr2 > 0.425597 )
									ret := 0.941176 // buy
						if( dn1 > 10.374 )
							ret := -0.714286 // sell
			if( up1 > 7.01095 )
				if( atr <= 0.462364 )
					if( dn <= 7.51707 )
						if( atr2 <= 0.060494 )
							if( dn <= 7.44515 )
								if( atr <= 0.056146 )
									ret := -0.153846
								if( atr > 0.056146 )
									ret := 0.365217
							if( dn > 7.44515 )
								if( atr2 <= 0.057983 )
									ret := -0.552239
								if( atr2 > 0.057983 )
									ret := 0.086957
						if( atr2 > 0.060494 )
							if( up1 <= 7.16024 )
								if( up1 <= 7.12562 )
									ret := -0.342629
								if( up1 > 7.12562 )
									ret := -0.628571
							if( up1 > 7.16024 )
								ret := 0.400000
					if( dn > 7.51707 )
						if( atr2 <= 0.153442 )
							if( up1 <= 7.1302 )
								if( dn <= 7.95677 )
									ret := 0.214076
								if( dn > 7.95677 )
									ret := -0.500000
							if( up1 > 7.1302 )
								if( up1 <= 21.8332 )
									ret := -0.005897
								if( up1 > 21.8332 )
									ret := 0.481481
						if( atr2 > 0.153442 )
							if( up1 <= 14.6915 )
								if( up1 <= 13.593 )
									ret := 0.113271
								if( up1 > 13.593 )
									ret := 0.301998
							if( up1 > 14.6915 )
								if( dn1 <= 16.09 )
									ret := -0.298507
								if( dn1 > 16.09 )
									ret := 0.033259
				if( atr > 0.462364 )
					if( up <= 15.6004 )
						if( dn <= 17.1506 )
							if( dn <= 16.2016 )
								if( up <= 7.55436 )
									ret := 0.937500 // buy
								if( up > 7.55436 )
									ret := 0.304688
							if( dn > 16.2016 )
								if( atr <= 0.618349 )
									ret := -0.772727 // sell
								if( atr > 0.618349 )
									ret := -0.187500
						if( dn > 17.1506 )
							if( atr2 <= 0.466727 )
								if( atr2 <= 0.440336 )
									ret := -0.857143 // sell
								if( atr2 > 0.440336 )
									ret := -0.333333
							if( atr2 > 0.466727 )
								if( dn1 <= 20.017 )
									ret := 0.864078 // buy
								if( dn1 > 20.017 )
									ret := 0.446809
					if( up > 15.6004 )
						if( up1 <= 15.9044 )
							if( up1 <= 14.7334 )
								ret := 1.000000 // buy
							if( up1 > 14.7334 )
								if( up1 <= 15.6015 )
									ret := -0.804348 // sell
								if( up1 > 15.6015 )
									ret := -0.241935
						if( up1 > 15.9044 )
							if( dn <= 33.0598 )
								if( atr2 <= 0.784602 )
									ret := 0.149258
								if( atr2 > 0.784602 )
									ret := 0.350575
							if( dn > 33.0598 )
								if( up <= 31.305 )
									ret := -0.113459
								if( up > 31.305 )
									ret := 0.118431
		if( dn > 43.7167 )
			if( atr <= 1.37555 )
				if( atr <= 0.604731 )
					if( atr <= 0.553163 )
						if( atr <= 0.441228 )
							if( up1 <= 41.3286 )
								if( atr <= 0.426742 )
									ret := 0.962963 // buy
								if( atr > 0.426742 )
									ret := -0.444444
							if( up1 > 41.3286 )
								if( dn <= 51.5159 )
									ret := -0.105618
								if( dn > 51.5159 )
									ret := 0.165680
						if( atr > 0.441228 )
							if( up <= 41.1447 )
								if( dn1 <= 43.8277 )
									ret := 0.857143 // buy
								if( dn1 > 43.8277 )
									ret := 0.285714
							if( up > 41.1447 )
								if( up1 <= 41.2742 )
									ret := -0.509804
								if( up1 > 41.2742 )
									ret := -0.167064
					if( atr > 0.553163 )
						if( atr <= 0.579835 )
							if( dn1 <= 52.3699 )
								if( atr2 <= 0.513895 )
									ret := -0.250000
								if( atr2 > 0.513895 )
									ret := 0.746032 // buy
							if( dn1 > 52.3699 )
								if( up <= 50.758 )
									ret := -0.750000 // sell
								if( up > 50.758 )
									ret := 0.300000
						if( atr > 0.579835 )
							if( dn1 <= 46.5025 )
								if( up1 <= 41.3957 )
									ret := 0.230769
								if( up1 > 41.3957 )
									ret := -0.740741 // sell
							if( dn1 > 46.5025 )
								if( atr <= 0.585401 )
									ret := -0.625000
								if( atr > 0.585401 )
									ret := 0.446809
				if( atr > 0.604731 )
					if( dn <= 44.8584 )
						if( up1 <= 36.6863 )
							if( atr2 <= 1.489 )
								if( dn1 <= 44.2208 )
									ret := 1.000000 // buy
								if( dn1 > 44.2208 )
									ret := 0.166667
							if( atr2 > 1.489 )
								ret := -0.750000 // sell
						if( up1 > 36.6863 )
							if( atr <= 0.635123 )
								if( up1 <= 40.4782 )
									ret := 0.600000
								if( up1 > 40.4782 )
									ret := -0.071429
							if( atr > 0.635123 )
								if( atr2 <= 0.658856 )
									ret := 0.090909
								if( atr2 > 0.658856 )
									ret := -0.757396 // sell
					if( dn > 44.8584 )
						if( atr <= 0.730113 )
							if( up1 <= 45.1609 )
								if( up <= 43.3295 )
									ret := -0.371681
								if( up > 43.3295 )
									ret := -0.857143 // sell
							if( up1 > 45.1609 )
								if( atr2 <= 0.637065 )
									ret := 0.421053
								if( atr2 > 0.637065 )
									ret := -0.492537
						if( atr > 0.730113 )
							if( dn1 <= 47.1802 )
								if( dn <= 45.5819 )
									ret := -0.112150
								if( dn > 45.5819 )
									ret := 0.330275
							if( dn1 > 47.1802 )
								if( up <= 44.3788 )
									ret := -0.418750
								if( up > 44.3788 )
									ret := 0.085106
			if( atr > 1.37555 )
				if( dn1 <= 51.8346 )
					if( atr2 <= 1.24274 )
						ret := -0.500000
					if( atr2 > 1.24274 )
						if( dn1 <= 44.5762 )
							if( dn <= 44.3509 )
								ret := 0.800000 // buy
							if( dn > 44.3509 )
								ret := 0.500000
						if( dn1 > 44.5762 )
							if( up1 <= 42.2129 )
								if( up1 <= 35.954 )
									ret := 0.857143 // buy
								if( up1 > 35.954 )
									ret := 1.000000 // buy
							if( up1 > 42.2129 )
								ret := 0.750000 // buy
				if( dn1 > 51.8346 )
					if( dn1 <= 52.6068 )
						ret := -1.000000 // sell
					if( dn1 > 52.6068 )
						ret := -0.750000 // sell
	
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
float op_operation = decision_tree_0_DOTUSDT_30Min_2c43fd6e(dn1, trend, atr, atr2, buySignalInt, sellSignalInt, up1, up, dn)

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


