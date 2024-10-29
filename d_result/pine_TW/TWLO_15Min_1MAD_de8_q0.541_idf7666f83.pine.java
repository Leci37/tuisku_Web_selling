//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Madrid_Moving_Average_Ribbon
// ID_model: TWLO_15Min_1MAD_f7666f83 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TWLO_15Min_1MAD_f7666f83", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TWLO_15Min_f7666f83(ma100, ma55_colorInt, ma60_colorInt, ma80, ma25, ma75_colorInt, ma80_colorInt, ma50_colorInt, ma30, ma40_colorInt, ma90, ma45_colorInt, ma40, ma50, ma10_colorInt, ma15_colorInt, ma85_colorInt, ma05_colorInt, ma20, ma70, ma70_colorInt, ma85, ma30_colorInt, ma60, ma45, ma55, ma65, ma90_colorInt, ma35, ma20_colorInt, ma65_colorInt, ma10, ma25_colorInt, ma75, ma15, ma05, ma35_colorInt)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ma55 <= 130.502 )
		if( ma05_colorInt <= 3.5 )
			if( ma05_colorInt <= 1.5 )
				if( ma80 <= 24.7556 )
					if( ma90 <= 23.6075 )
						if( ma65 <= 23.3549 )
							ret := -1.000000 // sell
						if( ma65 > 23.3549 )
							ret := -0.217391
					if( ma90 > 23.6075 )
						if( ma25_colorInt <= 1.5 )
							if( ma20 <= 24.896 )
								if( ma50 <= 24.6627 )
									ret := 0.404255
								if( ma50 > 24.6627 )
									ret := -0.484848
							if( ma20 > 24.896 )
								if( ma05 <= 25.0612 )
									ret := 1.000000 // buy
								if( ma05 > 25.0612 )
									ret := 0.666667
						if( ma25_colorInt > 1.5 )
							if( ma50 <= 24.2986 )
								if( ma05 <= 24.5325 )
									ret := 0.923077 // buy
								if( ma05 > 24.5325 )
									ret := -0.076923
							if( ma50 > 24.2986 )
								if( ma90 <= 24.6391 )
									ret := 0.823529 // buy
								if( ma90 > 24.6391 )
									ret := 1.000000 // buy
				if( ma80 > 24.7556 )
					if( ma25 <= 131.325 )
						if( ma10 <= 130.745 )
							if( ma100 <= 34.3539 )
								if( ma10 <= 34.4776 )
									ret := -0.077752
								if( ma10 > 34.4776 )
									ret := -0.680000
							if( ma100 > 34.3539 )
								if( ma65 <= 38.0518 )
									ret := 0.426621
								if( ma65 > 38.0518 )
									ret := -0.008709
						if( ma10 > 130.745 )
							if( ma65 <= 129.786 )
								if( ma40 <= 129.719 )
									ret := -0.659091
								if( ma40 > 129.719 )
									ret := -0.023810
							if( ma65 > 129.786 )
								if( ma80_colorInt <= 2.5 )
									ret := -0.839286 // sell
								if( ma80_colorInt > 2.5 )
									ret := -0.133333
					if( ma25 > 131.325 )
						if( ma100 <= 129.115 )
							ret := 0.250000
						if( ma100 > 129.115 )
							if( ma85 <= 129.762 )
								if( ma100 <= 129.219 )
									ret := 0.888889 // buy
								if( ma100 > 129.219 )
									ret := 1.000000 // buy
							if( ma85 > 129.762 )
								ret := 0.714286 // buy
			if( ma05_colorInt > 1.5 )
				if( ma05 <= 24.4815 )
					if( ma20 <= 24.6945 )
						if( ma30 <= 24.4205 )
							if( ma05_colorInt <= 2.5 )
								if( ma75 <= 23.6128 )
									ret := 0.083333
								if( ma75 > 23.6128 )
									ret := 0.784615 // buy
							if( ma05_colorInt > 2.5 )
								if( ma25 <= 24.3579 )
									ret := 0.235714
								if( ma25 > 24.3579 )
									ret := -0.888889 // sell
						if( ma30 > 24.4205 )
							if( ma20 <= 24.4039 )
								if( ma25 <= 24.4459 )
									ret := 1.000000 // buy
								if( ma25 > 24.4459 )
									ret := 0.900000 // buy
							if( ma20 > 24.4039 )
								if( ma65_colorInt <= 2.5 )
									ret := 0.083333
								if( ma65_colorInt > 2.5 )
									ret := 0.516129
					if( ma20 > 24.6945 )
						if( ma50 <= 28.0072 )
							ret := -0.736842 // sell
						if( ma50 > 28.0072 )
							ret := -0.200000
				if( ma05 > 24.4815 )
					if( ma80 <= 71.2576 )
						if( ma25 <= 38.6923 )
							if( ma90 <= 31.3596 )
								if( ma15 <= 32.025 )
									ret := 0.108011
								if( ma15 > 32.025 )
									ret := -0.681818
							if( ma90 > 31.3596 )
								if( ma20 <= 38.2377 )
									ret := -0.104242
								if( ma20 > 38.2377 )
									ret := -0.864865 // sell
						if( ma25 > 38.6923 )
							if( ma35 <= 40.6336 )
								if( ma40_colorInt <= 1.5 )
									ret := -0.030769
								if( ma40_colorInt > 1.5 )
									ret := 0.731801 // buy
							if( ma35 > 40.6336 )
								if( ma60 <= 71.1523 )
									ret := 0.107880
								if( ma60 > 71.1523 )
									ret := 0.709091 // buy
					if( ma80 > 71.2576 )
						if( ma90 <= 74.6712 )
							if( ma60 <= 74.4187 )
								if( ma55 <= 73.0856 )
									ret := -0.192999
								if( ma55 > 73.0856 )
									ret := 0.112329
							if( ma60 > 74.4187 )
								if( ma60 <= 74.8156 )
									ret := -0.627273
								if( ma60 > 74.8156 )
									ret := -0.149254
						if( ma90 > 74.6712 )
							if( ma05 <= 71.5488 )
								ret := 1.000000 // buy
							if( ma05 > 71.5488 )
								if( ma50 <= 130.202 )
									ret := 0.053896
								if( ma50 > 130.202 )
									ret := 0.456044
		if( ma05_colorInt > 3.5 )
			if( ma85 <= 100.437 )
				if( ma80 <= 99.1428 )
					if( ma55 <= 84.7661 )
						if( ma50 <= 84.0693 )
							if( ma30 <= 54.7773 )
								if( ma90 <= 50.773 )
									ret := -0.081761
								if( ma90 > 50.773 )
									ret := -0.349693
							if( ma30 > 54.7773 )
								if( ma80 <= 55.5309 )
									ret := 0.711864 // buy
								if( ma80 > 55.5309 )
									ret := -0.031136
						if( ma50 > 84.0693 )
							if( ma60_colorInt <= 3.5 )
								if( ma75 <= 84.3751 )
									ret := 0.941176 // buy
								if( ma75 > 84.3751 )
									ret := 0.589744
							if( ma60_colorInt > 3.5 )
								ret := 0.100000
					if( ma55 > 84.7661 )
						if( ma20 <= 91.034 )
							if( ma10 <= 88.8274 )
								if( ma40 <= 89.0537 )
									ret := -0.354167
								if( ma40 > 89.0537 )
									ret := 0.642857
							if( ma10 > 88.8274 )
								if( ma100 <= 93.0462 )
									ret := -0.687500
								if( ma100 > 93.0462 )
									ret := -0.962963 // sell
						if( ma20 > 91.034 )
							if( ma90 <= 96.2778 )
								if( ma30 <= 94.9013 )
									ret := 0.145161
								if( ma30 > 94.9013 )
									ret := 0.578947
							if( ma90 > 96.2778 )
								if( ma55 <= 97.6937 )
									ret := -0.416667
								if( ma55 > 97.6937 )
									ret := 0.101124
				if( ma80 > 99.1428 )
					if( ma55 <= 99.4733 )
						if( ma20 <= 95.8218 )
							ret := -1.000000 // sell
						if( ma20 > 95.8218 )
							if( ma60 <= 99.4061 )
								if( ma10 <= 97.2326 )
									ret := -0.272727
								if( ma10 > 97.2326 )
									ret := -0.904762 // sell
							if( ma60 > 99.4061 )
								ret := -1.000000 // sell
					if( ma55 > 99.4733 )
						if( ma55 <= 99.7908 )
							ret := -0.111111
						if( ma55 > 99.7908 )
							ret := -0.250000
			if( ma85 > 100.437 )
				if( ma35 <= 101.215 )
					if( ma60 <= 101.643 )
						if( ma75 <= 101.377 )
							if( ma60 <= 99.469 )
								ret := 1.000000 // buy
							if( ma60 > 99.469 )
								if( ma70 <= 101.234 )
									ret := -0.181818
								if( ma70 > 101.234 )
									ret := 0.478261
						if( ma75 > 101.377 )
							if( ma85 <= 101.809 )
								if( ma20 <= 100.513 )
									ret := 0.916667 // buy
								if( ma20 > 100.513 )
									ret := 0.500000
							if( ma85 > 101.809 )
								if( ma45 <= 100.91 )
									ret := 0.800000 // buy
								if( ma45 > 100.91 )
									ret := 1.000000 // buy
					if( ma60 > 101.643 )
						if( ma100 <= 102.934 )
							ret := 0.181818
						if( ma100 > 102.934 )
							ret := -0.461538
				if( ma35 > 101.215 )
					if( ma60 <= 104.724 )
						if( ma80_colorInt <= 1.5 )
							ret := -0.761905 // sell
						if( ma80_colorInt > 1.5 )
							if( ma15 <= 102.503 )
								if( ma30 <= 102.543 )
									ret := -0.268817
								if( ma30 > 102.543 )
									ret := 0.411765
							if( ma15 > 102.503 )
								if( ma10 <= 103.197 )
									ret := -0.755556 // sell
								if( ma10 > 103.197 )
									ret := -0.071429
					if( ma60 > 104.724 )
						if( ma10 <= 121.791 )
							if( ma45 <= 117.187 )
								if( ma20 <= 111.091 )
									ret := 0.202417
								if( ma20 > 111.091 )
									ret := -0.139373
							if( ma45 > 117.187 )
								if( ma35_colorInt <= 3.5 )
									ret := 0.596591
								if( ma35_colorInt > 3.5 )
									ret := 0.206186
						if( ma10 > 121.791 )
							if( ma15 <= 128.798 )
								if( ma75 <= 127.803 )
									ret := -0.040346
								if( ma75 > 127.803 )
									ret := -0.353211
							if( ma15 > 128.798 )
								if( ma05 <= 129.87 )
									ret := 0.573034
								if( ma05 > 129.87 )
									ret := -0.214286
	if( ma55 > 130.502 )
		if( ma50 <= 134.37 )
			if( ma50 <= 130.781 )
				if( ma10 <= 130.666 )
					if( ma10 <= 128.983 )
						if( ma85_colorInt <= 2.5 )
							ret := -0.923077 // sell
						if( ma85_colorInt > 2.5 )
							if( ma65 <= 130.971 )
								ret := 0.500000
							if( ma65 > 130.971 )
								ret := -0.125000
					if( ma10 > 128.983 )
						if( ma75 <= 131.189 )
							if( ma60 <= 130.773 )
								if( ma80 <= 130.526 )
									ret := 0.352941
								if( ma80 > 130.526 )
									ret := 0.750000 // buy
							if( ma60 > 130.773 )
								ret := 0.111111
						if( ma75 > 131.189 )
							ret := 0.916667 // buy
				if( ma10 > 130.666 )
					if( ma35 <= 130.567 )
						if( ma85 <= 130.888 )
							if( ma15 <= 130.795 )
								ret := -0.800000 // sell
							if( ma15 > 130.795 )
								ret := -1.000000 // sell
						if( ma85 > 130.888 )
							ret := -0.444444
					if( ma35 > 130.567 )
						if( ma05 <= 131.383 )
							if( ma50 <= 130.704 )
								if( ma65_colorInt <= 1.5 )
									ret := 0.000000
								if( ma65_colorInt > 1.5 )
									ret := 0.916667 // buy
							if( ma50 > 130.704 )
								ret := -0.571429
						if( ma05 > 131.383 )
							if( ma75 <= 130.593 )
								if( ma90 <= 129.69 )
									ret := 0.000000
								if( ma90 > 129.69 )
									ret := -0.695652
							if( ma75 > 130.593 )
								ret := -0.111111
			if( ma50 > 130.781 )
				if( ma85 <= 131.813 )
					if( ma30 <= 134.076 )
						if( ma35 <= 131.959 )
							if( ma85 <= 130.596 )
								if( ma45 <= 131.155 )
									ret := -0.729167 // sell
								if( ma45 > 131.155 )
									ret := -0.400000
							if( ma85 > 130.596 )
								if( ma90 <= 130.955 )
									ret := 0.167832
								if( ma90 > 130.955 )
									ret := -0.458498
						if( ma35 > 131.959 )
							if( ma05 <= 133.224 )
								if( ma80_colorInt <= 1.5 )
									ret := 0.472222
								if( ma80_colorInt > 1.5 )
									ret := -0.333333
							if( ma05 > 133.224 )
								if( ma05 <= 134.042 )
									ret := -0.566038
								if( ma05 > 134.042 )
									ret := 0.000000
					if( ma30 > 134.076 )
						if( ma85 <= 131.337 )
							ret := 0.250000
						if( ma85 > 131.337 )
							ret := -1.000000 // sell
				if( ma85 > 131.813 )
					if( ma70 <= 132.504 )
						if( ma80 <= 131.824 )
							ret := -0.230769
						if( ma80 > 131.824 )
							if( ma100 <= 131.77 )
								ret := -0.210526
							if( ma100 > 131.77 )
								if( ma65 <= 131.674 )
									ret := -0.400000
								if( ma65 > 131.674 )
									ret := -0.861472 // sell
					if( ma70 > 132.504 )
						if( ma55 <= 133.763 )
							if( ma100 <= 135.553 )
								if( ma10 <= 134.528 )
									ret := -0.453552
								if( ma10 > 134.528 )
									ret := 0.318182
							if( ma100 > 135.553 )
								if( ma55 <= 133.65 )
									ret := 0.935484 // buy
								if( ma55 > 133.65 )
									ret := 0.181818
						if( ma55 > 133.763 )
							if( ma100 <= 136.854 )
								if( ma25 <= 134.068 )
									ret := -0.781513 // sell
								if( ma25 > 134.068 )
									ret := -0.471154
							if( ma100 > 136.854 )
								ret := 0.136364
		if( ma50 > 134.37 )
			if( ma90 <= 136.792 )
				if( ma60 <= 138.209 )
					if( ma35 <= 134.678 )
						if( ma20 <= 132.477 )
							ret := 0.736842 // buy
						if( ma20 > 132.477 )
							if( ma30 <= 134.159 )
								if( ma05 <= 132.151 )
									ret := -1.000000 // sell
								if( ma05 > 132.151 )
									ret := -0.857143 // sell
							if( ma30 > 134.159 )
								ret := -0.285714
					if( ma35 > 134.678 )
						if( ma30 <= 136.05 )
							if( ma50 <= 135.34 )
								if( ma10_colorInt <= 1.5 )
									ret := 0.310345
								if( ma10_colorInt > 1.5 )
									ret := 0.755319 // buy
							if( ma50 > 135.34 )
								if( ma65 <= 135.436 )
									ret := -0.783784 // sell
								if( ma65 > 135.436 )
									ret := 0.266667
						if( ma30 > 136.05 )
							if( ma75 <= 134.936 )
								if( ma40 <= 135.738 )
									ret := 0.500000
								if( ma40 > 135.738 )
									ret := 0.915254 // buy
							if( ma75 > 134.936 )
								if( ma65_colorInt <= 3.5 )
									ret := 0.645669
								if( ma65_colorInt > 3.5 )
									ret := 0.043478
				if( ma60 > 138.209 )
					if( ma30 <= 149.491 )
						if( ma25 <= 142.225 )
							ret := -0.846154 // sell
						if( ma25 > 142.225 )
							ret := -0.750000 // sell
					if( ma30 > 149.491 )
						ret := 0.166667
			if( ma90 > 136.792 )
				if( ma75 <= 389.724 )
					if( ma75_colorInt <= 2.5 )
						if( ma100 <= 338.546 )
							if( ma35_colorInt <= 1.5 )
								if( ma20 <= 346.737 )
									ret := -0.064361
								if( ma20 > 346.737 )
									ret := -0.776119 // sell
							if( ma35_colorInt > 1.5 )
								if( ma40 <= 318.282 )
									ret := 0.096237
								if( ma40 > 318.282 )
									ret := -0.186837
						if( ma100 > 338.546 )
							if( ma05 <= 364.915 )
								if( ma30_colorInt <= 1.5 )
									ret := 0.149184
								if( ma30_colorInt > 1.5 )
									ret := 0.401327
							if( ma05 > 364.915 )
								if( ma40 <= 391.464 )
									ret := -0.015897
								if( ma40 > 391.464 )
									ret := 0.838710 // buy
					if( ma75_colorInt > 2.5 )
						if( ma65 <= 387.565 )
							if( ma10 <= 182.548 )
								if( ma40 <= 161.247 )
									ret := -0.092294
								if( ma40 > 161.247 )
									ret := -0.481799
							if( ma10 > 182.548 )
								if( ma40 <= 193.65 )
									ret := 0.220557
								if( ma40 > 193.65 )
									ret := -0.059164
						if( ma65 > 387.565 )
							if( ma30_colorInt <= 3.5 )
								if( ma65 <= 388.976 )
									ret := 0.847826 // buy
								if( ma65 > 388.976 )
									ret := 0.416667
							if( ma30_colorInt > 3.5 )
								if( ma60 <= 388.801 )
									ret := 0.000000
								if( ma60 > 388.801 )
									ret := 0.625000
				if( ma75 > 389.724 )
					if( ma45 <= 392.011 )
						if( ma90 <= 392.048 )
							if( ma90_colorInt <= 2.5 )
								if( ma90 <= 391.279 )
									ret := -0.750000 // sell
								if( ma90 > 391.279 )
									ret := -1.000000 // sell
							if( ma90_colorInt > 2.5 )
								if( ma35_colorInt <= 3.5 )
									ret := -0.338710
								if( ma35_colorInt > 3.5 )
									ret := -0.916667 // sell
						if( ma90 > 392.048 )
							if( ma55 <= 390.924 )
								if( ma55_colorInt <= 3.5 )
									ret := 0.777778 // buy
								if( ma55_colorInt > 3.5 )
									ret := -0.300000
							if( ma55 > 390.924 )
								if( ma20 <= 385.177 )
									ret := -1.000000 // sell
								if( ma20 > 385.177 )
									ret := -0.073171
					if( ma45 > 392.011 )
						if( ma60 <= 392.146 )
							if( ma75 <= 391.473 )
								ret := 0.111111
							if( ma75 > 391.473 )
								if( ma15 <= 392.85 )
									ret := 0.777778 // buy
								if( ma15 > 392.85 )
									ret := 1.000000 // buy
						if( ma60 > 392.146 )
							if( ma50_colorInt <= 3.5 )
								if( ma35_colorInt <= 1.5 )
									ret := -0.319871
								if( ma35_colorInt > 1.5 )
									ret := 0.018605
							if( ma50_colorInt > 3.5 )
								if( ma55 <= 406.859 )
									ret := 0.000000
								if( ma55 > 406.859 )
									ret := -0.945946 // sell
	
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
float op_operation = decision_tree_0_TWLO_15Min_f7666f83(ma100, ma55_colorInt, ma60_colorInt, ma80, ma25, ma75_colorInt, ma80_colorInt, ma50_colorInt, ma30, ma40_colorInt, ma90, ma45_colorInt, ma40, ma50, ma10_colorInt, ma15_colorInt, ma85_colorInt, ma05_colorInt, ma20, ma70, ma70_colorInt, ma85, ma30_colorInt, ma60, ma45, ma55, ma65, ma90_colorInt, ma35, ma20_colorInt, ma65_colorInt, ma10, ma25_colorInt, ma75, ma15, ma05, ma35_colorInt)

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


