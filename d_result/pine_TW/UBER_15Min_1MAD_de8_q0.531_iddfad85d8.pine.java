//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Madrid_Moving_Average_Ribbon
// ID_model: UBER_15Min_1MAD_dfad85d8 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UBER_15Min_1MAD_dfad85d8", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UBER_15Min_dfad85d8(ma100, ma55_colorInt, ma60_colorInt, ma80, ma25, ma75_colorInt, ma80_colorInt, ma50_colorInt, ma30, ma40_colorInt, ma90, ma45_colorInt, ma40, ma50, ma10_colorInt, ma15_colorInt, ma85_colorInt, ma05_colorInt, ma20, ma70, ma70_colorInt, ma85, ma30_colorInt, ma60, ma45, ma55, ma65, ma90_colorInt, ma35, ma20_colorInt, ma65_colorInt, ma10, ma25_colorInt, ma75, ma15, ma05, ma35_colorInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ma60 <= 23.319 )
		if( ma10_colorInt <= 3.5 )
			if( ma10 <= 19.1385 )
				if( ma05 <= 15.0566 )
					if( ma15 <= 15.1253 )
						ret := 1.000000 // buy
					if( ma15 > 15.1253 )
						if( ma05 <= 14.8926 )
							if( ma65 <= 17.0829 )
								ret := 0.750000 // buy
							if( ma65 > 17.0829 )
								ret := 1.000000 // buy
						if( ma05 > 14.8926 )
							ret := -0.333333
				if( ma05 > 15.0566 )
					if( ma50 <= 19.8144 )
						if( ma35_colorInt <= 3.5 )
							if( ma15 <= 15.1387 )
								ret := 0.500000
							if( ma15 > 15.1387 )
								if( ma25_colorInt <= 1.5 )
									ret := -0.090909
								if( ma25_colorInt > 1.5 )
									ret := -0.688525
						if( ma35_colorInt > 3.5 )
							if( ma85 <= 16.4575 )
								ret := 0.500000
							if( ma85 > 16.4575 )
								ret := 1.000000 // buy
					if( ma50 > 19.8144 )
						ret := 1.000000 // buy
			if( ma10 > 19.1385 )
				if( ma35 <= 21.2964 )
					if( ma100 <= 21.026 )
						if( ma90_colorInt <= 1.5 )
							if( ma85 <= 19.4463 )
								if( ma60 <= 18.8659 )
									ret := -0.250000
								if( ma60 > 18.8659 )
									ret := 1.000000 // buy
							if( ma85 > 19.4463 )
								if( ma100 <= 20.7693 )
									ret := -1.000000 // sell
								if( ma100 > 20.7693 )
									ret := 0.136364
						if( ma90_colorInt > 1.5 )
							if( ma15 <= 21.2078 )
								if( ma60 <= 20.873 )
									ret := 0.842857 // buy
								if( ma60 > 20.873 )
									ret := 0.970000 // buy
							if( ma15 > 21.2078 )
								ret := -0.166667
					if( ma100 > 21.026 )
						if( ma15_colorInt <= 3.5 )
							if( ma65 <= 21.2027 )
								if( ma80 <= 21.147 )
									ret := 0.566667
								if( ma80 > 21.147 )
									ret := -0.382353
							if( ma65 > 21.2027 )
								if( ma50 <= 21.4134 )
									ret := 0.917647 // buy
								if( ma50 > 21.4134 )
									ret := -0.222222
						if( ma15_colorInt > 3.5 )
							ret := -1.000000 // sell
				if( ma35 > 21.2964 )
					if( ma100 <= 23.0396 )
						if( ma50 <= 21.2147 )
							ret := -1.000000 // sell
						if( ma50 > 21.2147 )
							if( ma45_colorInt <= 1.5 )
								if( ma10 <= 22.7316 )
									ret := 0.388571
								if( ma10 > 22.7316 )
									ret := 0.064516
							if( ma45_colorInt > 1.5 )
								if( ma80_colorInt <= 1.5 )
									ret := -0.376147
								if( ma80_colorInt > 1.5 )
									ret := 0.076828
					if( ma100 > 23.0396 )
						if( ma40 <= 22.4489 )
							if( ma100 <= 23.106 )
								ret := 0.166667
							if( ma100 > 23.106 )
								if( ma50 <= 22.4272 )
									ret := -0.250000
								if( ma50 > 22.4272 )
									ret := -0.750000 // sell
						if( ma40 > 22.4489 )
							if( ma05 <= 22.1042 )
								if( ma75 <= 23.1485 )
									ret := 0.769231 // buy
								if( ma75 > 23.1485 )
									ret := 0.983333 // buy
							if( ma05 > 22.1042 )
								if( ma40 <= 22.9185 )
									ret := 0.000000
								if( ma40 > 22.9185 )
									ret := 0.493421
		if( ma10_colorInt > 3.5 )
			if( ma100 <= 23.4635 )
				if( ma30 <= 15.2965 )
					if( ma05 <= 15.0591 )
						ret := 0.666667
					if( ma05 > 15.0591 )
						ret := 1.000000 // buy
				if( ma30 > 15.2965 )
					if( ma90 <= 23.2374 )
						if( ma90 <= 21.4018 )
							if( ma65 <= 21.005 )
								if( ma70 <= 20.893 )
									ret := -0.453846
								if( ma70 > 20.893 )
									ret := 0.176471
							if( ma65 > 21.005 )
								if( ma100 <= 21.3717 )
									ret := -0.947368 // sell
								if( ma100 > 21.3717 )
									ret := -0.666667
						if( ma90 > 21.4018 )
							if( ma90 <= 21.5841 )
								if( ma05 <= 21.5506 )
									ret := 0.400000
								if( ma05 > 21.5506 )
									ret := -0.600000
							if( ma90 > 21.5841 )
								if( ma05 <= 21.9567 )
									ret := -0.295181
								if( ma05 > 21.9567 )
									ret := 0.081081
					if( ma90 > 23.2374 )
						if( ma10 <= 22.2707 )
							ret := -0.750000 // sell
						if( ma10 > 22.2707 )
							ret := -1.000000 // sell
			if( ma100 > 23.4635 )
				if( ma75_colorInt <= 3.5 )
					if( ma20 <= 22.2331 )
						ret := -0.400000
					if( ma20 > 22.2331 )
						if( ma65 <= 23.1778 )
							if( ma75 <= 23.2879 )
								ret := 1.000000 // buy
							if( ma75 > 23.2879 )
								ret := -0.142857
						if( ma65 > 23.1778 )
							ret := 1.000000 // buy
				if( ma75_colorInt > 3.5 )
					if( ma70 <= 23.3531 )
						if( ma100 <= 23.6081 )
							ret := 0.000000
						if( ma100 > 23.6081 )
							if( ma80 <= 23.5485 )
								ret := -1.000000 // sell
							if( ma80 > 23.5485 )
								ret := -0.250000
					if( ma70 > 23.3531 )
						ret := 0.714286 // buy
	if( ma60 > 23.319 )
		if( ma05_colorInt <= 3.5 )
			if( ma05_colorInt <= 1.5 )
				if( ma65_colorInt <= 1.5 )
					if( ma30 <= 51.2195 )
						if( ma100 <= 50.7801 )
							if( ma05 <= 32.4632 )
								if( ma05 <= 32.1669 )
									ret := 0.002370
								if( ma05 > 32.1669 )
									ret := 0.372727
							if( ma05 > 32.4632 )
								if( ma100 <= 32.2973 )
									ret := -0.248344
								if( ma100 > 32.2973 )
									ret := -0.027498
						if( ma100 > 50.7801 )
							if( ma30 <= 50.9374 )
								if( ma50 <= 50.8949 )
									ret := -0.153846
								if( ma50 > 50.8949 )
									ret := 0.250000
							if( ma30 > 50.9374 )
								if( ma50 <= 50.9634 )
									ret := -0.935484 // sell
								if( ma50 > 50.9634 )
									ret := -0.600000
					if( ma30 > 51.2195 )
						if( ma25 <= 52.9304 )
							if( ma40 <= 52.0511 )
								if( ma85_colorInt <= 1.5 )
									ret := 0.171598
								if( ma85_colorInt > 1.5 )
									ret := -0.600000
							if( ma40 > 52.0511 )
								if( ma25 <= 52.7302 )
									ret := 0.813333 // buy
								if( ma25 > 52.7302 )
									ret := 0.294118
						if( ma25 > 52.9304 )
							if( ma65 <= 54.3602 )
								if( ma05 <= 54.7339 )
									ret := -0.036957
								if( ma05 > 54.7339 )
									ret := -0.542857
							if( ma65 > 54.3602 )
								if( ma100 <= 55.3845 )
									ret := 0.360544
								if( ma100 > 55.3845 )
									ret := 0.027977
				if( ma65_colorInt > 1.5 )
					if( ma50_colorInt <= 2.5 )
						if( ma15 <= 34.5987 )
							if( ma10 <= 33.4824 )
								if( ma65 <= 32.0766 )
									ret := 0.377358
								if( ma65 > 32.0766 )
									ret := -0.108108
							if( ma10 > 33.4824 )
								if( ma05 <= 34.592 )
									ret := 0.780488 // buy
								if( ma05 > 34.592 )
									ret := -0.750000 // sell
						if( ma15 > 34.5987 )
							if( ma10_colorInt <= 1.5 )
								if( ma20 <= 36.0937 )
									ret := -0.633333
								if( ma20 > 36.0937 )
									ret := -0.017974
							if( ma10_colorInt > 1.5 )
								if( ma30 <= 35.1887 )
									ret := -1.000000 // sell
								if( ma30 > 35.1887 )
									ret := 0.301370
					if( ma50_colorInt > 2.5 )
						if( ma25 <= 29.1097 )
							if( ma05 <= 29.1085 )
								if( ma100 <= 23.7496 )
									ret := 0.500000
								if( ma100 > 23.7496 )
									ret := -0.153846
							if( ma05 > 29.1085 )
								if( ma20 <= 29.1049 )
									ret := -0.804878 // sell
								if( ma20 > 29.1049 )
									ret := -0.142857
						if( ma25 > 29.1097 )
							if( ma50 <= 31.5367 )
								if( ma35 <= 31.2136 )
									ret := 0.162791
								if( ma35 > 31.2136 )
									ret := 0.649573
							if( ma50 > 31.5367 )
								if( ma90 <= 31.729 )
									ret := -0.569231
								if( ma90 > 31.729 )
									ret := 0.035704
			if( ma05_colorInt > 1.5 )
				if( ma85 <= 79.7276 )
					if( ma10 <= 23.8873 )
						if( ma85 <= 23.5851 )
							if( ma80 <= 23.3702 )
								if( ma70 <= 23.3627 )
									ret := 0.057692
								if( ma70 > 23.3627 )
									ret := -0.526316
							if( ma80 > 23.3702 )
								if( ma20 <= 23.4973 )
									ret := 0.111111
								if( ma20 > 23.4973 )
									ret := 0.571429
						if( ma85 > 23.5851 )
							if( ma05 <= 22.1225 )
								ret := 1.000000 // buy
							if( ma05 > 22.1225 )
								if( ma25 <= 24.2497 )
									ret := -0.382682
								if( ma25 > 24.2497 )
									ret := 0.875000 // buy
					if( ma10 > 23.8873 )
						if( ma50 <= 29.2314 )
							if( ma100 <= 23.8645 )
								if( ma05 <= 24.3775 )
									ret := 0.785714 // buy
								if( ma05 > 24.3775 )
									ret := 0.294118
							if( ma100 > 23.8645 )
								if( ma05 <= 24.6838 )
									ret := -0.105386
								if( ma05 > 24.6838 )
									ret := 0.182583
						if( ma50 > 29.2314 )
							if( ma80 <= 29.636 )
								if( ma55 <= 29.529 )
									ret := -0.064327
								if( ma55 > 29.529 )
									ret := -0.390071
							if( ma80 > 29.636 )
								if( ma90 <= 29.9115 )
									ret := 0.341686
								if( ma90 > 29.9115 )
									ret := 0.075152
				if( ma85 > 79.7276 )
					if( ma40 <= 81.1185 )
						if( ma10 <= 80.2475 )
							if( ma35 <= 80.0572 )
								if( ma30 <= 79.8053 )
									ret := -0.100000
								if( ma30 > 79.8053 )
									ret := -0.718750 // sell
							if( ma35 > 80.0572 )
								if( ma80 <= 80.0829 )
									ret := 0.242424
								if( ma80 > 80.0829 )
									ret := -0.700000 // sell
						if( ma10 > 80.2475 )
							if( ma25_colorInt <= 1.5 )
								if( ma30 <= 81.219 )
									ret := -0.176471
								if( ma30 > 81.219 )
									ret := -1.000000 // sell
							if( ma25_colorInt > 1.5 )
								if( ma85 <= 80.8274 )
									ret := -0.936170 // sell
								if( ma85 > 80.8274 )
									ret := -0.600000
					if( ma40 > 81.1185 )
						if( ma50 <= 85.1553 )
							if( ma100 <= 80.6249 )
								ret := 0.142857
							if( ma100 > 80.6249 )
								ret := 0.000000
						if( ma50 > 85.1553 )
							if( ma70_colorInt <= 1.5 )
								ret := 0.000000
							if( ma70_colorInt > 1.5 )
								ret := 1.000000 // buy
		if( ma05_colorInt > 3.5 )
			if( ma10 <= 37.6739 )
				if( ma90 <= 34.4985 )
					if( ma100 <= 29.9034 )
						if( ma85 <= 29.4191 )
							if( ma90_colorInt <= 2.5 )
								if( ma85_colorInt <= 2.5 )
									ret := 0.150820
								if( ma85_colorInt > 2.5 )
									ret := 0.870968 // buy
							if( ma90_colorInt > 2.5 )
								if( ma45 <= 26.4449 )
									ret := -0.175573
								if( ma45 > 26.4449 )
									ret := -0.004554
						if( ma85 > 29.4191 )
							if( ma60_colorInt <= 2.5 )
								if( ma05 <= 29.4472 )
									ret := 0.083333
								if( ma05 > 29.4472 )
									ret := -0.500000
							if( ma60_colorInt > 2.5 )
								if( ma50 <= 29.7553 )
									ret := 0.617940
								if( ma50 > 29.7553 )
									ret := 0.043478
					if( ma100 > 29.9034 )
						if( ma15 <= 29.7864 )
							if( ma05 <= 29.1982 )
								if( ma90 <= 30.2858 )
									ret := 0.083333
								if( ma90 > 30.2858 )
									ret := 1.000000 // buy
							if( ma05 > 29.1982 )
								if( ma80 <= 30.2221 )
									ret := -0.504000
								if( ma80 > 30.2221 )
									ret := -0.884615 // sell
						if( ma15 > 29.7864 )
							if( ma35_colorInt <= 3.5 )
								if( ma10 <= 33.6568 )
									ret := -0.013143
								if( ma10 > 33.6568 )
									ret := 0.398058
							if( ma35_colorInt > 3.5 )
								if( ma35 <= 33.3583 )
									ret := -0.164273
								if( ma35 > 33.3583 )
									ret := 0.041522
				if( ma90 > 34.4985 )
					if( ma40_colorInt <= 3.5 )
						if( ma10 <= 33.8669 )
							if( ma100 <= 34.7395 )
								if( ma10_colorInt <= 3.5 )
									ret := 0.166667
								if( ma10_colorInt > 3.5 )
									ret := -0.833333 // sell
							if( ma100 > 34.7395 )
								ret := -1.000000 // sell
						if( ma10 > 33.8669 )
							if( ma15 <= 34.1269 )
								if( ma25 <= 34.0597 )
									ret := 0.923077 // buy
								if( ma25 > 34.0597 )
									ret := 0.208955
							if( ma15 > 34.1269 )
								if( ma70 <= 37.7763 )
									ret := -0.182681
								if( ma70 > 37.7763 )
									ret := -0.524272
					if( ma40_colorInt > 3.5 )
						if( ma15 <= 34.3918 )
							if( ma100 <= 34.6331 )
								if( ma70 <= 34.4635 )
									ret := -0.875000 // sell
								if( ma70 > 34.4635 )
									ret := 0.142857
							if( ma100 > 34.6331 )
								if( ma05 <= 34.2531 )
									ret := -0.576923
								if( ma05 > 34.2531 )
									ret := -0.975610 // sell
						if( ma15 > 34.3918 )
							if( ma100 <= 36.0527 )
								if( ma25 <= 35.3043 )
									ret := -0.204082
								if( ma25 > 35.3043 )
									ret := 0.645161
							if( ma100 > 36.0527 )
								if( ma80 <= 38.1192 )
									ret := -0.500000
								if( ma80 > 38.1192 )
									ret := 0.500000
			if( ma10 > 37.6739 )
				if( ma45 <= 38.2074 )
					if( ma45 <= 37.8678 )
						if( ma10 <= 37.954 )
							if( ma45 <= 37.7711 )
								if( ma15 <= 37.7075 )
									ret := 0.272727
								if( ma15 > 37.7075 )
									ret := -0.800000 // sell
							if( ma45 > 37.7711 )
								if( ma45 <= 37.7963 )
									ret := 0.777778 // buy
								if( ma45 > 37.7963 )
									ret := 0.200000
						if( ma10 > 37.954 )
							ret := -1.000000 // sell
					if( ma45 > 37.8678 )
						if( ma40 <= 37.9893 )
							if( ma55 <= 37.937 )
								ret := 0.750000 // buy
							if( ma55 > 37.937 )
								ret := 1.000000 // buy
						if( ma40 > 37.9893 )
							if( ma15 <= 37.8581 )
								if( ma80 <= 38.1948 )
									ret := 0.500000
								if( ma80 > 38.1948 )
									ret := 1.000000 // buy
							if( ma15 > 37.8581 )
								if( ma65 <= 38.2955 )
									ret := 0.107143
								if( ma65 > 38.2955 )
									ret := 0.857143 // buy
				if( ma45 > 38.2074 )
					if( ma90_colorInt <= 2.5 )
						if( ma30_colorInt <= 1.5 )
							if( ma35 <= 70.3906 )
								if( ma100 <= 52.5278 )
									ret := -0.388889
								if( ma100 > 52.5278 )
									ret := -0.800000 // sell
							if( ma35 > 70.3906 )
								ret := 0.000000
						if( ma30_colorInt > 1.5 )
							if( ma80_colorInt <= 2.5 )
								if( ma75_colorInt <= 2.5 )
									ret := -0.042532
								if( ma75_colorInt > 2.5 )
									ret := 0.151515
							if( ma80_colorInt > 2.5 )
								if( ma15 <= 44.04 )
									ret := -0.434783
								if( ma15 > 44.04 )
									ret := -0.127273
					if( ma90_colorInt > 2.5 )
						if( ma85_colorInt <= 3.5 )
							if( ma10 <= 76.6326 )
								if( ma85 <= 66.184 )
									ret := 0.050818
								if( ma85 > 66.184 )
									ret := 0.171053
							if( ma10 > 76.6326 )
								if( ma85 <= 77.5471 )
									ret := -0.764706 // sell
								if( ma85 > 77.5471 )
									ret := -0.015267
						if( ma85_colorInt > 3.5 )
							if( ma35 <= 57.3506 )
								if( ma80 <= 54.2695 )
									ret := -0.056954
								if( ma80 > 54.2695 )
									ret := -0.441558
							if( ma35 > 57.3506 )
								if( ma35 <= 69.3897 )
									ret := 0.377193
								if( ma35 > 69.3897 )
									ret := -0.064935
	
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
float op_operation = decision_tree_0_UBER_15Min_dfad85d8(ma100, ma55_colorInt, ma60_colorInt, ma80, ma25, ma75_colorInt, ma80_colorInt, ma50_colorInt, ma30, ma40_colorInt, ma90, ma45_colorInt, ma40, ma50, ma10_colorInt, ma15_colorInt, ma85_colorInt, ma05_colorInt, ma20, ma70, ma70_colorInt, ma85, ma30_colorInt, ma60, ma45, ma55, ma65, ma90_colorInt, ma35, ma20_colorInt, ma65_colorInt, ma10, ma25_colorInt, ma75, ma15, ma05, ma35_colorInt)

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


