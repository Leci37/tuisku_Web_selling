//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Madrid_Moving_Average_Ribbon
// ID_model: GME_15Min_1MAD_96852ef3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GME_15Min_1MAD_96852ef3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GME_15Min_96852ef3(ma15, ma70_colorInt, ma75_colorInt, ma70, ma40_colorInt, ma80_colorInt, ma20, ma20_colorInt, ma60, ma50, ma65_colorInt, ma45, ma55, ma05_colorInt, ma35_colorInt, ma10_colorInt, ma30, ma25_colorInt, ma100, ma65, ma85, ma80, ma60_colorInt, ma85_colorInt, ma90, ma90_colorInt, ma25, ma40, ma50_colorInt, ma35, ma30_colorInt, ma45_colorInt, ma05, ma75, ma55_colorInt, ma10, ma15_colorInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ma15_colorInt <= 3.5 )
		if( ma05_colorInt <= 1.5 )
			if( ma10 <= 32.2566 )
				if( ma05 <= 3.30092 )
					if( ma45_colorInt <= 3.5 )
						if( ma100 <= 3.01342 )
							ret := 0.600000
						if( ma100 > 3.01342 )
							if( ma05 <= 3.27867 )
								ret := 1.000000 // buy
							if( ma05 > 3.27867 )
								if( ma35 <= 3.22541 )
									ret := 0.500000
								if( ma35 > 3.22541 )
									ret := 1.000000 // buy
					if( ma45_colorInt > 3.5 )
						if( ma10 <= 3.04853 )
							ret := 1.000000 // buy
						if( ma10 > 3.04853 )
							if( ma05 <= 3.11212 )
								ret := -0.600000
							if( ma05 > 3.11212 )
								ret := -1.000000 // sell
				if( ma05 > 3.30092 )
					if( ma100 <= 27.5362 )
						if( ma45 <= 27.3659 )
							if( ma05 <= 29.9606 )
								if( ma05 <= 28.2106 )
									ret := -0.008454
								if( ma05 > 28.2106 )
									ret := 0.617021
							if( ma05 > 29.9606 )
								if( ma30 <= 28.3599 )
									ret := -0.900000 // sell
								if( ma30 > 28.3599 )
									ret := 0.000000
						if( ma45 > 27.3659 )
							if( ma50 <= 28.1491 )
								if( ma20 <= 27.6574 )
									ret := -0.400000
								if( ma20 > 27.6574 )
									ret := 0.779528 // buy
							if( ma50 > 28.1491 )
								if( ma60 <= 28.0458 )
									ret := 0.200000
								if( ma60 > 28.0458 )
									ret := -0.500000
					if( ma100 > 27.5362 )
						if( ma15_colorInt <= 1.5 )
							if( ma35 <= 28.387 )
								if( ma35 <= 28.3183 )
									ret := -0.528736
								if( ma35 > 28.3183 )
									ret := -1.000000 // sell
							if( ma35 > 28.387 )
								if( ma15 <= 28.6231 )
									ret := 0.777778 // buy
								if( ma15 > 28.6231 )
									ret := -0.350168
						if( ma15_colorInt > 1.5 )
							if( ma05 <= 27.9162 )
								ret := -1.000000 // sell
							if( ma05 > 27.9162 )
								if( ma25_colorInt <= 1.5 )
									ret := -0.833333 // sell
								if( ma25_colorInt > 1.5 )
									ret := 0.661765
			if( ma10 > 32.2566 )
				if( ma55 <= 175.927 )
					if( ma15 <= 165.266 )
						if( ma25 <= 33.2644 )
							if( ma100 <= 24.0814 )
								ret := -0.666667
							if( ma100 > 24.0814 )
								if( ma100 <= 24.5964 )
									ret := 0.750000 // buy
								if( ma100 > 24.5964 )
									ret := 0.972973 // buy
						if( ma25 > 33.2644 )
							if( ma65 <= 115.682 )
								if( ma40 <= 112.789 )
									ret := 0.165393
								if( ma40 > 112.789 )
									ret := 0.632530
							if( ma65 > 115.682 )
								if( ma80 <= 123.708 )
									ret := -0.210435
								if( ma80 > 123.708 )
									ret := 0.116022
					if( ma15 > 165.266 )
						if( ma65 <= 163.888 )
							if( ma100 <= 158.423 )
								if( ma90_colorInt <= 3.5 )
									ret := 0.953271 // buy
								if( ma90_colorInt > 3.5 )
									ret := 0.428571
							if( ma100 > 158.423 )
								if( ma65 <= 162.746 )
									ret := -0.333333
								if( ma65 > 162.746 )
									ret := 0.916667 // buy
						if( ma65 > 163.888 )
							if( ma100 <= 163.28 )
								if( ma50 <= 172.385 )
									ret := -0.823529 // sell
								if( ma50 > 172.385 )
									ret := 0.000000
							if( ma100 > 163.28 )
								if( ma85 <= 172.706 )
									ret := 0.285714
								if( ma85 > 172.706 )
									ret := 0.694656
				if( ma55 > 175.927 )
					if( ma80 <= 303.176 )
						if( ma90 <= 258.789 )
							if( ma05 <= 277.552 )
								if( ma50 <= 223.039 )
									ret := -0.106231
								if( ma50 > 223.039 )
									ret := 0.148741
							if( ma05 > 277.552 )
								if( ma15 <= 317.613 )
									ret := -0.435484
								if( ma15 > 317.613 )
									ret := -0.869565 // sell
						if( ma90 > 258.789 )
							if( ma65 <= 263.343 )
								ret := 1.000000 // buy
							if( ma65 > 263.343 )
								if( ma25 <= 277.05 )
									ret := -0.205479
								if( ma25 > 277.05 )
									ret := 0.441748
					if( ma80 > 303.176 )
						if( ma10_colorInt <= 1.5 )
							if( ma20 <= 357.037 )
								if( ma05 <= 335.242 )
									ret := -0.800000 // sell
								if( ma05 > 335.242 )
									ret := -1.000000 // sell
							if( ma20 > 357.037 )
								if( ma50 <= 334.984 )
									ret := -0.200000
								if( ma50 > 334.984 )
									ret := -0.904762 // sell
						if( ma10_colorInt > 1.5 )
							ret := 1.000000 // buy
		if( ma05_colorInt > 1.5 )
			if( ma60 <= 5.76449 )
				if( ma05_colorInt <= 2.5 )
					if( ma60 <= 3.99057 )
						if( ma80 <= 3.81921 )
							if( ma30 <= 3.9054 )
								if( ma15_colorInt <= 1.5 )
									ret := 0.076923
								if( ma15_colorInt > 1.5 )
									ret := 0.641975
							if( ma30 > 3.9054 )
								if( ma35 <= 3.90094 )
									ret := -0.789474 // sell
								if( ma35 > 3.90094 )
									ret := 0.400000
						if( ma80 > 3.81921 )
							if( ma55_colorInt <= 3.5 )
								if( ma10 <= 3.9094 )
									ret := 0.500000
								if( ma10 > 3.9094 )
									ret := 0.913462 // buy
							if( ma55_colorInt > 3.5 )
								ret := 0.000000
					if( ma60 > 3.99057 )
						if( ma70 <= 3.99135 )
							if( ma10_colorInt <= 1.5 )
								ret := 0.000000
							if( ma10_colorInt > 1.5 )
								ret := -1.000000 // sell
						if( ma70 > 3.99135 )
							if( ma20 <= 6.10167 )
								if( ma25_colorInt <= 3.5 )
									ret := 0.260690
								if( ma25_colorInt > 3.5 )
									ret := -0.285714
							if( ma20 > 6.10167 )
								if( ma40 <= 5.9038 )
									ret := -1.000000 // sell
								if( ma40 > 5.9038 )
									ret := -0.750000 // sell
				if( ma05_colorInt > 2.5 )
					if( ma100 <= 5.68975 )
						if( ma80 <= 3.44391 )
							if( ma90 <= 3.34431 )
								if( ma15 <= 2.73129 )
									ret := 0.937500 // buy
								if( ma15 > 2.73129 )
									ret := -0.044776
							if( ma90 > 3.34431 )
								if( ma05_colorInt <= 3.5 )
									ret := -0.773333 // sell
								if( ma05_colorInt > 3.5 )
									ret := 0.625000
						if( ma80 > 3.44391 )
							if( ma50 <= 3.45731 )
								if( ma100 <= 3.58206 )
									ret := 0.964912 // buy
								if( ma100 > 3.58206 )
									ret := 0.642857
							if( ma50 > 3.45731 )
								if( ma40 <= 3.52059 )
									ret := -0.578125
								if( ma40 > 3.52059 )
									ret := 0.135172
					if( ma100 > 5.68975 )
						if( ma10 <= 5.60708 )
							if( ma100 <= 5.70045 )
								if( ma10 <= 5.55679 )
									ret := 0.967742 // buy
								if( ma10 > 5.55679 )
									ret := 0.500000
							if( ma100 > 5.70045 )
								if( ma10_colorInt <= 3.5 )
									ret := 0.550633
								if( ma10_colorInt > 3.5 )
									ret := -0.142857
						if( ma10 > 5.60708 )
							if( ma25 <= 5.62625 )
								ret := -1.000000 // sell
							if( ma25 > 5.62625 )
								if( ma75 <= 5.71699 )
									ret := 0.000000
								if( ma75 > 5.71699 )
									ret := -0.250000
			if( ma60 > 5.76449 )
				if( ma05 <= 6.04738 )
					if( ma35 <= 5.63121 )
						if( ma10 <= 5.0112 )
							ret := 0.750000 // buy
						if( ma10 > 5.0112 )
							ret := 1.000000 // buy
					if( ma35 > 5.63121 )
						if( ma15 <= 5.58933 )
							if( ma05 <= 5.53367 )
								if( ma80 <= 5.90991 )
									ret := -0.750000 // sell
								if( ma80 > 5.90991 )
									ret := -1.000000 // sell
							if( ma05 > 5.53367 )
								ret := -0.333333
						if( ma15 > 5.58933 )
							if( ma30 <= 5.95672 )
								if( ma100 <= 5.74982 )
									ret := 0.604651
								if( ma100 > 5.74982 )
									ret := -0.114114
							if( ma30 > 5.95672 )
								if( ma30_colorInt <= 2.5 )
									ret := -0.686869
								if( ma30_colorInt > 2.5 )
									ret := -0.132231
				if( ma05 > 6.04738 )
					if( ma15 <= 7.6252 )
						if( ma40 <= 6.71115 )
							if( ma05 <= 6.26911 )
								if( ma50 <= 6.33294 )
									ret := 0.260870
								if( ma50 > 6.33294 )
									ret := 0.780000 // buy
							if( ma05 > 6.26911 )
								if( ma90 <= 6.1588 )
									ret := 0.625000
								if( ma90 > 6.1588 )
									ret := -0.187500
						if( ma40 > 6.71115 )
							if( ma85_colorInt <= 2.5 )
								if( ma10_colorInt <= 1.5 )
									ret := 0.000000
								if( ma10_colorInt > 1.5 )
									ret := 0.853107 // buy
							if( ma85_colorInt > 2.5 )
								if( ma15 <= 6.57726 )
									ret := 0.952381 // buy
								if( ma15 > 6.57726 )
									ret := 0.059172
					if( ma15 > 7.6252 )
						if( ma20 <= 7.95341 )
							if( ma45 <= 7.62465 )
								if( ma30 <= 7.61779 )
									ret := 0.333333
								if( ma30 > 7.61779 )
									ret := 1.000000 // buy
							if( ma45 > 7.62465 )
								if( ma100 <= 7.83691 )
									ret := -0.616667
								if( ma100 > 7.83691 )
									ret := 0.066667
						if( ma20 > 7.95341 )
							if( ma70 <= 13.4063 )
								if( ma45 <= 13.3525 )
									ret := 0.123593
								if( ma45 > 13.3525 )
									ret := 0.587838
							if( ma70 > 13.4063 )
								if( ma50 <= 258.271 )
									ret := 0.069873
								if( ma50 > 258.271 )
									ret := -0.096189
	if( ma15_colorInt > 3.5 )
		if( ma10 <= 3.33673 )
			if( ma30_colorInt <= 3.5 )
				if( ma90 <= 3.0512 )
					ret := 1.000000 // buy
				if( ma90 > 3.0512 )
					if( ma40 <= 3.27488 )
						ret := -1.000000 // sell
					if( ma40 > 3.27488 )
						if( ma40 <= 3.33463 )
							ret := 0.666667
						if( ma40 > 3.33463 )
							if( ma25 <= 3.32115 )
								ret := -1.000000 // sell
							if( ma25 > 3.32115 )
								ret := -0.500000
			if( ma30_colorInt > 3.5 )
				if( ma45_colorInt <= 3.5 )
					if( ma25 <= 2.75259 )
						ret := 0.750000 // buy
					if( ma25 > 2.75259 )
						ret := 1.000000 // buy
				if( ma45_colorInt > 3.5 )
					if( ma45 <= 2.80921 )
						ret := -0.800000 // sell
					if( ma45 > 2.80921 )
						if( ma05 <= 3.33006 )
							if( ma85 <= 2.92452 )
								ret := 1.000000 // buy
							if( ma85 > 2.92452 )
								if( ma05_colorInt <= 3.5 )
									ret := 1.000000 // buy
								if( ma05_colorInt > 3.5 )
									ret := 0.461538
						if( ma05 > 3.33006 )
							if( ma35 <= 3.31184 )
								if( ma100 <= 3.33827 )
									ret := 0.000000
								if( ma100 > 3.33827 )
									ret := -0.250000
							if( ma35 > 3.31184 )
								ret := 0.500000
		if( ma10 > 3.33673 )
			if( ma05 <= 227.088 )
				if( ma25_colorInt <= 3.5 )
					if( ma70_colorInt <= 2.5 )
						if( ma100 <= 12.2793 )
							if( ma15 <= 3.64391 )
								ret := 1.000000 // buy
							if( ma15 > 3.64391 )
								if( ma10 <= 4.47375 )
									ret := -0.842105 // sell
								if( ma10 > 4.47375 )
									ret := -0.390244
						if( ma100 > 12.2793 )
							if( ma55 <= 184.31 )
								if( ma45 <= 156.158 )
									ret := -0.081232
								if( ma45 > 156.158 )
									ret := 0.363636
							if( ma55 > 184.31 )
								if( ma100 <= 206.11 )
									ret := -0.625000
								if( ma100 > 206.11 )
									ret := 0.090909
					if( ma70_colorInt > 2.5 )
						if( ma85 <= 186.012 )
							if( ma10_colorInt <= 3.5 )
								if( ma90 <= 40.1305 )
									ret := 0.031746
								if( ma90 > 40.1305 )
									ret := -0.827586 // sell
							if( ma10_colorInt > 3.5 )
								if( ma100 <= 18.647 )
									ret := 0.006907
								if( ma100 > 18.647 )
									ret := 0.128023
						if( ma85 > 186.012 )
							if( ma55 <= 191.831 )
								if( ma10 <= 182.333 )
									ret := 0.000000
								if( ma10 > 182.333 )
									ret := -0.827586 // sell
							if( ma55 > 191.831 )
								if( ma20_colorInt <= 3.5 )
									ret := 0.190476
								if( ma20_colorInt > 3.5 )
									ret := -0.375000
				if( ma25_colorInt > 3.5 )
					if( ma90 <= 25.7031 )
						if( ma60 <= 22.0752 )
							if( ma10 <= 22.1583 )
								if( ma70 <= 8.28294 )
									ret := -0.130306
								if( ma70 > 8.28294 )
									ret := -0.048187
							if( ma10 > 22.1583 )
								if( ma100 <= 22.7365 )
									ret := -1.000000 // sell
								if( ma100 > 22.7365 )
									ret := -0.750000 // sell
						if( ma60 > 22.0752 )
							if( ma05_colorInt <= 1.5 )
								if( ma90_colorInt <= 3.5 )
									ret := 0.472222
								if( ma90_colorInt > 3.5 )
									ret := -0.242331
							if( ma05_colorInt > 1.5 )
								if( ma05 <= 25.0646 )
									ret := 0.056437
								if( ma05 > 25.0646 )
									ret := 0.383648
					if( ma90 > 25.7031 )
						if( ma100 <= 36.6922 )
							if( ma35 <= 34.7682 )
								if( ma30_colorInt <= 3.5 )
									ret := 0.131313
								if( ma30_colorInt > 3.5 )
									ret := -0.286713
							if( ma35 > 34.7682 )
								if( ma50_colorInt <= 3.5 )
									ret := 0.000000
								if( ma50_colorInt > 3.5 )
									ret := -0.872340 // sell
						if( ma100 > 36.6922 )
							if( ma90 <= 37.6381 )
								if( ma20 <= 32.7204 )
									ret := 0.000000
								if( ma20 > 32.7204 )
									ret := 1.000000 // buy
							if( ma90 > 37.6381 )
								if( ma35 <= 38.2643 )
									ret := -0.794118 // sell
								if( ma35 > 38.2643 )
									ret := -0.081056
			if( ma05 > 227.088 )
				if( ma85 <= 288.012 )
					if( ma85 <= 265.689 )
						if( ma85 <= 253.307 )
							if( ma70 <= 246.965 )
								if( ma85 <= 235.613 )
									ret := 0.469388
								if( ma85 > 235.613 )
									ret := -0.379310
							if( ma70 > 246.965 )
								if( ma30 <= 250.435 )
									ret := 0.750000 // buy
								if( ma30 > 250.435 )
									ret := 1.000000 // buy
						if( ma85 > 253.307 )
							if( ma20_colorInt <= 3.5 )
								if( ma80 <= 258.742 )
									ret := 0.000000
								if( ma80 > 258.742 )
									ret := 0.500000
							if( ma20_colorInt > 3.5 )
								if( ma05 <= 249.309 )
									ret := 0.250000
								if( ma05 > 249.309 )
									ret := -0.461538
					if( ma85 > 265.689 )
						ret := 1.000000 // buy
				if( ma85 > 288.012 )
					if( ma10 <= 303.024 )
						if( ma05 <= 281.901 )
							ret := -0.500000
						if( ma05 > 281.901 )
							ret := -1.000000 // sell
					if( ma10 > 303.024 )
						ret := 0.714286 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Madrid_Moving_Average_Ribbon 
//@version=5
//indicator "Madrid Moving Average Ribbon", shorttitle="Madrid Ribbon", overlay=true)


PHI     = (1 + math.sqrt(5)) / 2
PI      = 104348 / 33215

BULL    = 1
BEAR    = -1
NONE    = 0

GRN01 = color.rgb(124, 252, 0)
GRN02 = color.rgb(50, 205, 50)
GRN03 = color.rgb(34, 139, 34)
GRN04 = color.rgb(0, 100, 0)
GRN05 = color.rgb(0, 128, 0)
GRN06 = color.rgb(9, 53, 7)
RED01 = color.rgb(255, 69, 0)
RED02 = color.rgb(255, 0, 0)
RED03 = color.rgb(178, 34, 34)
RED04 = color.rgb(139, 0, 0)
RED05 = color.rgb(128, 0, 0)
RED06 = color.rgb(51, 13, 6)

// Define other v3 Style Colors
AQUA    = color.rgb(0, 255, 255)
BLACK   = color.rgb(0, 0, 0)
BLUE    = color.rgb(0, 0, 255)
FUCHSIA = color.rgb(255, 0, 255)
GRAY    = color.rgb(128, 128, 128)
GREEN   = color.rgb(0, 128, 0)
LIME    = color.rgb(0, 255, 0)
MAROON  = color.rgb(128, 0, 0)
NAVY    = color.rgb(0, 0, 128)
OLIVE   = color.rgb(128, 128, 0)
ORANGE  = color.rgb(255, 127, 0)
PURPLE  = color.rgb(128, 0, 128)
RUBI    = color.rgb(255, 0, 0)
SILVER  = color.rgb(192, 192, 192)
TEAL    = color.rgb(0, 128, 128)
YELLOW  = color.rgb(255, 255, 0)
WHITE   = color.rgb(255, 255, 255)


// ──────────[ Moving Average Color ]
maColor(_ma, _maRef) =>
    diffMA = ta.change(_ma)
    diffMA >= 0 and _ma > _maRef ? LIME : diffMA < 0 and _ma > _maRef ? MAROON : diffMA <= 0 and _ma < _maRef ? RUBI : diffMA >= 0 and _ma < _maRef ? GREEN : GRAY

// Function to calculate the integer representing the color condition
ma_color_int(ma, ma_ref) =>
    diff_ma = ta.change(ma)
    diff_ma >= 0 and ma > ma_ref ? 1 : diff_ma < 0 and ma > ma_ref ? 2 : diff_ma <= 0 and ma < ma_ref ? 3 : diff_ma >= 0 and ma < ma_ref ? 4 : 5


_10   = input.bool(false, '───────────[ Madrid Ribbon]───────────' )
i_exp = input(true, title="Exponential MA")

// ────────────────────[ Processing ]
src = close

ma05  = i_exp ? ta.ema(src, 5) : ta.sma(src, 5)
ma10  = i_exp ? ta.ema(src, 10) : ta.sma(src, 10)
ma15  = i_exp ? ta.ema(src, 15) : ta.sma(src, 15)
ma20  = i_exp ? ta.ema(src, 20) : ta.sma(src, 20)
ma25  = i_exp ? ta.ema(src, 25) : ta.sma(src, 25)
ma30  = i_exp ? ta.ema(src, 30) : ta.sma(src, 30)
ma35  = i_exp ? ta.ema(src, 35) : ta.sma(src, 35)
ma40  = i_exp ? ta.ema(src, 40) : ta.sma(src, 40)
ma45  = i_exp ? ta.ema(src, 45) : ta.sma(src, 45)
ma50  = i_exp ? ta.ema(src, 50) : ta.sma(src, 50)
ma55  = i_exp ? ta.ema(src, 55) : ta.sma(src, 55)
ma60  = i_exp ? ta.ema(src, 60) : ta.sma(src, 60)
ma65  = i_exp ? ta.ema(src, 65) : ta.sma(src, 65)
ma70  = i_exp ? ta.ema(src, 70) : ta.sma(src, 70)
ma75  = i_exp ? ta.ema(src, 75) : ta.sma(src, 75)
ma80  = i_exp ? ta.ema(src, 80) : ta.sma(src, 80)
ma85  = i_exp ? ta.ema(src, 85) : ta.sma(src, 85)
ma90  = i_exp ? ta.ema(src, 90) : ta.sma(src, 90)
ma100 = i_exp ? ta.ema(src, 100) : ta.sma(src, 100)

// ────────────────────[ Plot ]
plot(ma05, color=maColor(ma05, ma100), title="MMA05", linewidth=3)
plot(ma10, color=maColor(ma10, ma100), title="MMA10", linewidth=1)
plot(ma15, color=maColor(ma15, ma100), title="MMA15", linewidth=1)
plot(ma20, color=maColor(ma20, ma100), title="MMA20", linewidth=1)
plot(ma25, color=maColor(ma25, ma100), title="MMA25", linewidth=1)
plot(ma30, color=maColor(ma30, ma100), title="MMA30", linewidth=1)
plot(ma35, color=maColor(ma35, ma100), title="MMA35", linewidth=1)
plot(ma40, color=maColor(ma40, ma100), title="MMA40", linewidth=1)
plot(ma45, color=maColor(ma45, ma100), title="MMA45", linewidth=1)
plot(ma50, color=maColor(ma50, ma100), title="MMA50", linewidth=1)
plot(ma55, color=maColor(ma55, ma100), title="MMA55", linewidth=1)
plot(ma60, color=maColor(ma60, ma100), title="MMA60", linewidth=1)
plot(ma65, color=maColor(ma65, ma100), title="MMA65", linewidth=1)
plot(ma70, color=maColor(ma70, ma100), title="MMA70", linewidth=1)
plot(ma75, color=maColor(ma75, ma100), title="MMA75", linewidth=1)
plot(ma80, color=maColor(ma80, ma100), title="MMA80", linewidth=1)
plot(ma85, color=maColor(ma85, ma100), title="MMA85", linewidth=1)
plot(ma90, color=maColor(ma90, ma100), title="MMA90", linewidth=3)



//Calculate colors based on the moving averages compared to ma100
ma05_colorInt = ma_color_int(ma05, ma100)
ma10_colorInt = ma_color_int(ma10, ma100)
ma15_colorInt = ma_color_int(ma15, ma100)
ma20_colorInt = ma_color_int(ma20, ma100)
ma25_colorInt = ma_color_int(ma25, ma100)
ma30_colorInt = ma_color_int(ma30, ma100)
ma35_colorInt = ma_color_int(ma35, ma100)
ma40_colorInt = ma_color_int(ma40, ma100)
ma45_colorInt = ma_color_int(ma45, ma100)
ma50_colorInt = ma_color_int(ma50, ma100)
ma55_colorInt = ma_color_int(ma55, ma100)
ma60_colorInt = ma_color_int(ma60, ma100)
ma65_colorInt = ma_color_int(ma65, ma100)
ma70_colorInt = ma_color_int(ma70, ma100)
ma75_colorInt = ma_color_int(ma75, ma100)
ma80_colorInt = ma_color_int(ma80, ma100)
ma85_colorInt = ma_color_int(ma85, ma100)
ma90_colorInt = ma_color_int(ma90, ma100)


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
float op_operation = decision_tree_0_GME_15Min_96852ef3(ma15, ma70_colorInt, ma75_colorInt, ma70, ma40_colorInt, ma80_colorInt, ma20, ma20_colorInt, ma60, ma50, ma65_colorInt, ma45, ma55, ma05_colorInt, ma35_colorInt, ma10_colorInt, ma30, ma25_colorInt, ma100, ma65, ma85, ma80, ma60_colorInt, ma85_colorInt, ma90, ma90_colorInt, ma25, ma40, ma50_colorInt, ma35, ma30_colorInt, ma45_colorInt, ma05, ma75, ma55_colorInt, ma10, ma15_colorInt)

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


