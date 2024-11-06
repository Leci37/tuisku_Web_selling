//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Madrid_Moving_Average_Ribbon
// ID_model: U_1Min_1MAD_1031fb1f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_U_1Min_1MAD_1031fb1f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_U_1Min_1031fb1f(ma100, ma55_colorInt, ma60_colorInt, ma80, ma25, ma75_colorInt, ma80_colorInt, ma50_colorInt, ma30, ma40_colorInt, ma90, ma45_colorInt, ma40, ma50, ma10_colorInt, ma15_colorInt, ma85_colorInt, ma05_colorInt, ma20, ma70, ma70_colorInt, ma85, ma30_colorInt, ma60, ma45, ma55, ma65, ma90_colorInt, ma35, ma20_colorInt, ma65_colorInt, ma10, ma25_colorInt, ma75, ma15, ma05, ma35_colorInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ma20_colorInt <= 3.5 )
		if( ma25_colorInt <= 1.5 )
			if( ma90 <= 14.4595 )
				if( ma100 <= 14.0216 )
					if( ma60 <= 14.0355 )
						if( ma90 <= 13.8928 )
							if( ma30_colorInt <= 1.5 )
								if( ma05 <= 14.3205 )
									ret := 0.941176 // buy
								if( ma05 > 14.3205 )
									ret := 0.250000
							if( ma30_colorInt > 1.5 )
								if( ma35 <= 13.6655 )
									ret := -0.250000
								if( ma35 > 13.6655 )
									ret := -1.000000 // sell
						if( ma90 > 13.8928 )
							if( ma10 <= 14.0616 )
								if( ma05 <= 13.9658 )
									ret := 0.750000 // buy
								if( ma05 > 13.9658 )
									ret := -0.806452 // sell
							if( ma10 > 14.0616 )
								if( ma50 <= 14.0356 )
									ret := 0.684211
								if( ma50 > 14.0356 )
									ret := -0.818182 // sell
					if( ma60 > 14.0355 )
						if( ma65 <= 14.0538 )
							if( ma65 <= 14.0357 )
								ret := 1.000000 // buy
							if( ma65 > 14.0357 )
								ret := 0.500000
						if( ma65 > 14.0538 )
							ret := 1.000000 // buy
				if( ma100 > 14.0216 )
					if( ma80_colorInt <= 2 )
						if( ma05 <= 14.2605 )
							if( ma85 <= 14.1553 )
								if( ma55 <= 14.1294 )
									ret := -0.828571 // sell
								if( ma55 > 14.1294 )
									ret := -0.300000
							if( ma85 > 14.1553 )
								if( ma05 <= 14.2505 )
									ret := 0.871795 // buy
								if( ma05 > 14.2505 )
									ret := 0.272727
						if( ma05 > 14.2605 )
							if( ma10 <= 14.7741 )
								if( ma10 <= 14.6105 )
									ret := -0.382418
								if( ma10 > 14.6105 )
									ret := -0.915254 // sell
							if( ma10 > 14.7741 )
								if( ma15 <= 15.0468 )
									ret := 1.000000 // buy
								if( ma15 > 15.0468 )
									ret := -0.250000
					if( ma80_colorInt > 2 )
						if( ma45 <= 14.2252 )
							if( ma50_colorInt <= 3.5 )
								if( ma05 <= 14.3188 )
									ret := 0.125000
								if( ma05 > 14.3188 )
									ret := 1.000000 // buy
							if( ma50_colorInt > 3.5 )
								if( ma15 <= 14.2376 )
									ret := 0.200000
								if( ma15 > 14.2376 )
									ret := -0.958333 // sell
						if( ma45 > 14.2252 )
							if( ma05_colorInt <= 1.5 )
								if( ma10 <= 14.5055 )
									ret := 0.692308
								if( ma10 > 14.5055 )
									ret := 0.000000
							if( ma05_colorInt > 1.5 )
								ret := -0.500000
			if( ma90 > 14.4595 )
				if( ma50 <= 14.6541 )
					if( ma80 <= 14.5086 )
						if( ma85 <= 14.4835 )
							if( ma15 <= 14.5678 )
								if( ma55 <= 14.4907 )
									ret := 0.400000
								if( ma55 > 14.4907 )
									ret := 0.969697 // buy
							if( ma15 > 14.5678 )
								if( ma45 <= 14.5245 )
									ret := 0.000000
								if( ma45 > 14.5245 )
									ret := -0.500000
						if( ma85 > 14.4835 )
							if( ma60 <= 14.5223 )
								if( ma05 <= 14.6065 )
									ret := -0.400000
								if( ma05 > 14.6065 )
									ret := 0.500000
							if( ma60 > 14.5223 )
								if( ma40 <= 14.5425 )
									ret := -0.285714
								if( ma40 > 14.5425 )
									ret := -0.960000 // sell
					if( ma80 > 14.5086 )
						if( ma55_colorInt <= 2.5 )
							if( ma75 <= 14.5948 )
								if( ma15 <= 14.6939 )
									ret := 0.687500
								if( ma15 > 14.6939 )
									ret := -0.600000
							if( ma75 > 14.5948 )
								if( ma100 <= 14.5705 )
									ret := 0.200000
								if( ma100 > 14.5705 )
									ret := 0.953488 // buy
						if( ma55_colorInt > 2.5 )
							if( ma50 <= 14.5973 )
								ret := -0.714286 // sell
							if( ma50 > 14.5973 )
								if( ma05 <= 14.6848 )
									ret := 1.000000 // buy
								if( ma05 > 14.6848 )
									ret := -0.200000
				if( ma50 > 14.6541 )
					if( ma100 <= 14.6623 )
						if( ma20 <= 14.7262 )
							if( ma100 <= 14.5919 )
								if( ma85 <= 14.6114 )
									ret := -0.750000 // sell
								if( ma85 > 14.6114 )
									ret := -1.000000 // sell
							if( ma100 > 14.5919 )
								if( ma45 <= 14.6659 )
									ret := 0.727273 // buy
								if( ma45 > 14.6659 )
									ret := 0.033333
						if( ma20 > 14.7262 )
							if( ma05_colorInt <= 1.5 )
								if( ma70 <= 14.6383 )
									ret := -0.571429
								if( ma70 > 14.6383 )
									ret := -0.984127 // sell
							if( ma05_colorInt > 1.5 )
								if( ma05 <= 15.2687 )
									ret := -0.846154 // sell
								if( ma05 > 15.2687 )
									ret := 1.000000 // buy
					if( ma100 > 14.6623 )
						if( ma05 <= 15.2356 )
							if( ma20 <= 14.6982 )
								if( ma15 <= 14.6933 )
									ret := -0.250000
								if( ma15 > 14.6933 )
									ret := -1.000000 // sell
							if( ma20 > 14.6982 )
								if( ma10 <= 14.9336 )
									ret := 0.951220 // buy
								if( ma10 > 14.9336 )
									ret := 0.490741
						if( ma05 > 15.2356 )
							if( ma40 <= 15.2782 )
								if( ma75_colorInt <= 1.5 )
									ret := -0.536398
								if( ma75_colorInt > 1.5 )
									ret := 0.407407
							if( ma40 > 15.2782 )
								if( ma20 <= 24.8944 )
									ret := 0.022087
								if( ma20 > 24.8944 )
									ret := -0.193684
		if( ma25_colorInt > 1.5 )
			if( ma80 <= 14.2771 )
				if( ma35 <= 13.848 )
					if( ma05 <= 13.3466 )
						if( ma40 <= 13.5007 )
							ret := 1.000000 // buy
						if( ma40 > 13.5007 )
							if( ma100 <= 13.7486 )
								ret := 0.750000 // buy
							if( ma100 > 13.7486 )
								ret := 1.000000 // buy
					if( ma05 > 13.3466 )
						if( ma90 <= 13.8468 )
							if( ma65 <= 13.6839 )
								if( ma60 <= 13.6344 )
									ret := -0.941176 // sell
								if( ma60 > 13.6344 )
									ret := 0.375000
							if( ma65 > 13.6839 )
								if( ma05 <= 13.4569 )
									ret := -0.500000
								if( ma05 > 13.4569 )
									ret := -0.956522 // sell
						if( ma90 > 13.8468 )
							if( ma55 <= 13.8407 )
								if( ma10 <= 13.672 )
									ret := 0.833333 // buy
								if( ma10 > 13.672 )
									ret := 1.000000 // buy
							if( ma55 > 13.8407 )
								if( ma85 <= 13.9653 )
									ret := -0.857143 // sell
								if( ma85 > 13.9653 )
									ret := -1.000000 // sell
				if( ma35 > 13.848 )
					if( ma05 <= 13.8693 )
						if( ma50 <= 13.8981 )
							if( ma05 <= 13.8251 )
								ret := 1.000000 // buy
							if( ma05 > 13.8251 )
								if( ma25 <= 13.8723 )
									ret := 0.454545
								if( ma25 > 13.8723 )
									ret := 0.000000
						if( ma50 > 13.8981 )
							if( ma20 <= 13.884 )
								if( ma40 <= 13.8907 )
									ret := 0.750000 // buy
								if( ma40 > 13.8907 )
									ret := 0.964912 // buy
							if( ma20 > 13.884 )
								if( ma25 <= 13.8951 )
									ret := 0.250000
								if( ma25 > 13.8951 )
									ret := 0.916667 // buy
					if( ma05 > 13.8693 )
						if( ma70 <= 14.1146 )
							if( ma100 <= 14.0543 )
								if( ma75 <= 13.9014 )
									ret := -1.000000 // sell
								if( ma75 > 13.9014 )
									ret := 0.554622
							if( ma100 > 14.0543 )
								if( ma50 <= 14.0301 )
									ret := -0.500000
								if( ma50 > 14.0301 )
									ret := 0.043478
						if( ma70 > 14.1146 )
							if( ma70_colorInt <= 1.5 )
								if( ma60 <= 14.1402 )
									ret := 1.000000 // buy
								if( ma60 > 14.1402 )
									ret := 0.240000
							if( ma70_colorInt > 1.5 )
								if( ma80 <= 14.223 )
									ret := 0.797753 // buy
								if( ma80 > 14.223 )
									ret := 0.568345
			if( ma80 > 14.2771 )
				if( ma90 <= 15.7919 )
					if( ma70 <= 14.2831 )
						if( ma40 <= 14.283 )
							if( ma20 <= 13.9511 )
								ret := -1.000000 // sell
							if( ma20 > 13.9511 )
								if( ma65 <= 14.2673 )
									ret := 0.222222
								if( ma65 > 14.2673 )
									ret := -0.380952
						if( ma40 > 14.283 )
							ret := -1.000000 // sell
					if( ma70 > 14.2831 )
						if( ma10 <= 13.9829 )
							if( ma05_colorInt <= 3.5 )
								ret := 1.000000 // buy
							if( ma05_colorInt > 3.5 )
								ret := 0.750000 // buy
						if( ma10 > 13.9829 )
							if( ma35 <= 14.239 )
								if( ma45 <= 14.2521 )
									ret := -0.500000
								if( ma45 > 14.2521 )
									ret := -1.000000 // sell
							if( ma35 > 14.239 )
								if( ma15 <= 15.725 )
									ret := 0.179054
								if( ma15 > 15.725 )
									ret := 0.475000
				if( ma90 > 15.7919 )
					if( ma45 <= 20.0267 )
						if( ma90_colorInt <= 2.5 )
							if( ma80_colorInt <= 2.5 )
								if( ma10 <= 17.8823 )
									ret := 0.154968
								if( ma10 > 17.8823 )
									ret := 0.046183
							if( ma80_colorInt > 2.5 )
								if( ma50 <= 17.0293 )
									ret := 0.075000
								if( ma50 > 17.0293 )
									ret := -0.460000
						if( ma90_colorInt > 2.5 )
							if( ma25 <= 15.7378 )
								if( ma10 <= 15.61 )
									ret := -0.882353 // sell
								if( ma10 > 15.61 )
									ret := -0.271429
							if( ma25 > 15.7378 )
								if( ma100 <= 16.742 )
									ret := 0.072151
								if( ma100 > 16.742 )
									ret := -0.025274
					if( ma45 > 20.0267 )
						if( ma05 <= 20.1537 )
							if( ma40 <= 20.1402 )
								if( ma90 <= 20.0352 )
									ret := 0.595238
								if( ma90 > 20.0352 )
									ret := -0.040650
							if( ma40 > 20.1402 )
								if( ma100 <= 20.5807 )
									ret := 0.677903
								if( ma100 > 20.5807 )
									ret := -0.400000
						if( ma05 > 20.1537 )
							if( ma70 <= 22.6157 )
								if( ma100 <= 22.6049 )
									ret := 0.154869
								if( ma100 > 22.6049 )
									ret := 0.623077
							if( ma70 > 22.6157 )
								if( ma55 <= 22.6259 )
									ret := -0.558140
								if( ma55 > 22.6259 )
									ret := 0.071552
	if( ma20_colorInt > 3.5 )
		if( ma90_colorInt <= 2.5 )
			if( ma50 <= 14.5968 )
				if( ma70 <= 14.283 )
					if( ma50_colorInt <= 1.5 )
						ret := 0.000000
					if( ma50_colorInt > 1.5 )
						ret := 0.500000
				if( ma70 > 14.283 )
					if( ma55_colorInt <= 1.5 )
						ret := -0.400000
					if( ma55_colorInt > 1.5 )
						if( ma05 <= 14.4308 )
							if( ma35 <= 14.4395 )
								ret := -1.000000 // sell
							if( ma35 > 14.4395 )
								ret := -0.400000
						if( ma05 > 14.4308 )
							ret := -1.000000 // sell
			if( ma50 > 14.5968 )
				if( ma05 <= 15.2319 )
					if( ma40 <= 15.129 )
						if( ma40 <= 14.6546 )
							if( ma25_colorInt <= 2.5 )
								ret := 0.750000 // buy
							if( ma25_colorInt > 2.5 )
								if( ma25 <= 14.6073 )
									ret := -0.250000
								if( ma25 > 14.6073 )
									ret := 0.000000
						if( ma40 > 14.6546 )
							if( ma75 <= 15.061 )
								ret := -1.000000 // sell
							if( ma75 > 15.061 )
								ret := 0.000000
					if( ma40 > 15.129 )
						if( ma50_colorInt <= 2.5 )
							ret := 0.142857
						if( ma50_colorInt > 2.5 )
							if( ma80 <= 15.1828 )
								ret := 1.000000 // buy
							if( ma80 > 15.1828 )
								if( ma65 <= 15.1955 )
									ret := 0.500000
								if( ma65 > 15.1955 )
									ret := 1.000000 // buy
				if( ma05 > 15.2319 )
					if( ma80 <= 15.5363 )
						if( ma05_colorInt <= 2.5 )
							ret := -1.000000 // sell
						if( ma05_colorInt > 2.5 )
							if( ma55_colorInt <= 3 )
								ret := 0.000000
							if( ma55_colorInt > 3 )
								ret := -0.250000
					if( ma80 > 15.5363 )
						if( ma100 <= 15.9405 )
							if( ma80 <= 15.8194 )
								if( ma25 <= 15.5527 )
									ret := -0.045455
								if( ma25 > 15.5527 )
									ret := -1.000000 // sell
							if( ma80 > 15.8194 )
								if( ma05_colorInt <= 2.5 )
									ret := 0.000000
								if( ma05_colorInt > 2.5 )
									ret := 0.526316
						if( ma100 > 15.9405 )
							if( ma50 <= 16.2606 )
								if( ma75_colorInt <= 3.5 )
									ret := -0.666667
								if( ma75_colorInt > 3.5 )
									ret := 0.500000
							if( ma50 > 16.2606 )
								if( ma40 <= 16.6839 )
									ret := -0.031469
								if( ma40 > 16.6839 )
									ret := -0.242228
		if( ma90_colorInt > 2.5 )
			if( ma85 <= 13.5843 )
				if( ma05_colorInt <= 3.5 )
					ret := 1.000000 // buy
				if( ma05_colorInt > 3.5 )
					ret := 0.600000
			if( ma85 > 13.5843 )
				if( ma10 <= 14.0842 )
					if( ma05_colorInt <= 2.5 )
						if( ma60 <= 13.6329 )
							ret := 0.500000
						if( ma60 > 13.6329 )
							ret := 1.000000 // buy
					if( ma05_colorInt > 2.5 )
						if( ma15 <= 13.6959 )
							if( ma90 <= 13.608 )
								ret := -1.000000 // sell
							if( ma90 > 13.608 )
								if( ma50_colorInt <= 3.5 )
									ret := 1.000000 // buy
								if( ma50_colorInt > 3.5 )
									ret := 0.250000
						if( ma15 > 13.6959 )
							if( ma100 <= 14.1695 )
								if( ma05 <= 13.9939 )
									ret := -0.598131
								if( ma05 > 13.9939 )
									ret := 0.222222
							if( ma100 > 14.1695 )
								if( ma100 <= 14.2273 )
									ret := -0.725000 // sell
								if( ma100 > 14.2273 )
									ret := -0.964286 // sell
				if( ma10 > 14.0842 )
					if( ma90_colorInt <= 3.5 )
						if( ma65 <= 14.6291 )
							if( ma15 <= 14.4908 )
								if( ma30_colorInt <= 3.5 )
									ret := 0.478261
								if( ma30_colorInt > 3.5 )
									ret := -0.160584
							if( ma15 > 14.4908 )
								if( ma45_colorInt <= 3.5 )
									ret := 1.000000 // buy
								if( ma45_colorInt > 3.5 )
									ret := 0.708333 // buy
						if( ma65 > 14.6291 )
							if( ma10 <= 15.0535 )
								if( ma05 <= 14.9544 )
									ret := -0.580645
								if( ma05 > 14.9544 )
									ret := -0.875000 // sell
							if( ma10 > 15.0535 )
								if( ma80 <= 15.4577 )
									ret := 0.246637
								if( ma80 > 15.4577 )
									ret := -0.021823
					if( ma90_colorInt > 3.5 )
						if( ma30 <= 14.2545 )
							if( ma05 <= 14.172 )
								if( ma20 <= 14.0871 )
									ret := 0.571429
								if( ma20 > 14.0871 )
									ret := -1.000000 // sell
							if( ma05 > 14.172 )
								if( ma05_colorInt <= 2.5 )
									ret := 0.967742 // buy
								if( ma05_colorInt > 2.5 )
									ret := 0.000000
						if( ma30 > 14.2545 )
							if( ma85 <= 25.3666 )
								if( ma05_colorInt <= 3.5 )
									ret := -0.060416
								if( ma05_colorInt > 3.5 )
									ret := -0.175591
							if( ma85 > 25.3666 )
								if( ma85 <= 25.3999 )
									ret := 1.000000 // buy
								if( ma85 > 25.3999 )
									ret := 0.000000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_U_1Min_1031fb1f(ma100, ma55_colorInt, ma60_colorInt, ma80, ma25, ma75_colorInt, ma80_colorInt, ma50_colorInt, ma30, ma40_colorInt, ma90, ma45_colorInt, ma40, ma50, ma10_colorInt, ma15_colorInt, ma85_colorInt, ma05_colorInt, ma20, ma70, ma70_colorInt, ma85, ma30_colorInt, ma60, ma45, ma55, ma65, ma90_colorInt, ma35, ma20_colorInt, ma65_colorInt, ma10, ma25_colorInt, ma75, ma15, ma05, ma35_colorInt)

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


