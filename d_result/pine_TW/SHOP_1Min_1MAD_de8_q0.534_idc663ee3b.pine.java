//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Madrid_Moving_Average_Ribbon
// ID_model: SHOP_1Min_1MAD_c663ee3b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SHOP_1Min_1MAD_c663ee3b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SHOP_1Min_c663ee3b(ma05, ma50_colorInt, ma90, ma35_colorInt, ma90_colorInt, ma55_colorInt, ma20, ma15_colorInt, ma40_colorInt, ma45_colorInt, ma65_colorInt, ma75_colorInt, ma35, ma30, ma60, ma75, ma05_colorInt, ma45, ma40, ma30_colorInt, ma25, ma100, ma50, ma70_colorInt, ma10_colorInt, ma20_colorInt, ma60_colorInt, ma25_colorInt, ma10, ma15, ma80, ma65, ma85_colorInt, ma55, ma70, ma85, ma80_colorInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ma05_colorInt <= 3.5 )
		if( ma10_colorInt <= 1.5 )
			if( ma100 <= 63.9621 )
				if( ma55 <= 58.608 )
					if( ma05 <= 58.7593 )
						if( ma05 <= 51.4751 )
							if( ma15 <= 50.1496 )
								ret := -0.250000
							if( ma15 > 50.1496 )
								if( ma05 <= 51.3744 )
									ret := 1.000000 // buy
								if( ma05 > 51.3744 )
									ret := 0.625000
						if( ma05 > 51.4751 )
							if( ma10 <= 54.8234 )
								if( ma100 <= 54.0897 )
									ret := 0.052381
								if( ma100 > 54.0897 )
									ret := -0.623596
							if( ma10 > 54.8234 )
								if( ma65 <= 55.8899 )
									ret := 0.627119
								if( ma65 > 55.8899 )
									ret := 0.040925
					if( ma05 > 58.7593 )
						if( ma80 <= 57.4737 )
							ret := 1.000000 // buy
						if( ma80 > 57.4737 )
							if( ma80 <= 58.3138 )
								if( ma60 <= 58.3233 )
									ret := -0.750000 // sell
								if( ma60 > 58.3233 )
									ret := -1.000000 // sell
							if( ma80 > 58.3138 )
								if( ma80 <= 58.4898 )
									ret := 0.848485 // buy
								if( ma80 > 58.4898 )
									ret := 0.461538
				if( ma55 > 58.608 )
					if( ma20_colorInt <= 2.5 )
						if( ma50 <= 61.8187 )
							if( ma15 <= 60.9268 )
								if( ma70 <= 60.7726 )
									ret := -0.158526
								if( ma70 > 60.7726 )
									ret := 0.426667
							if( ma15 > 60.9268 )
								if( ma100 <= 60.7273 )
									ret := -0.805195 // sell
								if( ma100 > 60.7273 )
									ret := -0.232525
						if( ma50 > 61.8187 )
							if( ma15 <= 64.1461 )
								if( ma05 <= 62.4326 )
									ret := 0.339080
								if( ma05 > 62.4326 )
									ret := -0.030840
							if( ma15 > 64.1461 )
								if( ma40 <= 64.1739 )
									ret := -0.596491
								if( ma40 > 64.1739 )
									ret := -1.000000 // sell
					if( ma20_colorInt > 2.5 )
						if( ma80_colorInt <= 1.5 )
							if( ma20 <= 63.1753 )
								if( ma85 <= 59.4163 )
									ret := -0.250000
								if( ma85 > 59.4163 )
									ret := -0.750000 // sell
							if( ma20 > 63.1753 )
								ret := 0.666667
						if( ma80_colorInt > 1.5 )
							if( ma25 <= 61.9359 )
								if( ma25 <= 58.6385 )
									ret := -0.875000 // sell
								if( ma25 > 58.6385 )
									ret := 0.464646
							if( ma25 > 61.9359 )
								if( ma25 <= 62.1964 )
									ret := -0.625000
								if( ma25 > 62.1964 )
									ret := 0.055556
			if( ma100 > 63.9621 )
				if( ma15 <= 65.7557 )
					if( ma35 <= 65.1555 )
						if( ma85 <= 64.8113 )
							if( ma05 <= 65.1322 )
								if( ma05 <= 65.0255 )
									ret := 0.162567
								if( ma05 > 65.0255 )
									ret := -0.354839
							if( ma05 > 65.1322 )
								if( ma90 <= 64.3506 )
									ret := -0.500000
								if( ma90 > 64.3506 )
									ret := 0.875000 // buy
						if( ma85 > 64.8113 )
							if( ma40 <= 64.9661 )
								if( ma05 <= 65.0844 )
									ret := -0.126761
								if( ma05 > 65.0844 )
									ret := -0.660377
							if( ma40 > 64.9661 )
								if( ma20 <= 65.1925 )
									ret := 0.126761
								if( ma20 > 65.1925 )
									ret := -0.680000
					if( ma35 > 65.1555 )
						if( ma60 <= 65.1653 )
							if( ma30 <= 65.2011 )
								if( ma90 <= 65.0574 )
									ret := -0.666667
								if( ma90 > 65.0574 )
									ret := 0.586207
							if( ma30 > 65.2011 )
								if( ma100 <= 64.7219 )
									ret := 0.500000
								if( ma100 > 64.7219 )
									ret := 0.941176 // buy
						if( ma60 > 65.1653 )
							if( ma90 <= 65.4392 )
								if( ma65 <= 65.4064 )
									ret := 0.224913
								if( ma65 > 65.4064 )
									ret := -0.303797
							if( ma90 > 65.4392 )
								if( ma45 <= 65.5424 )
									ret := 0.895833 // buy
								if( ma45 > 65.5424 )
									ret := 0.375000
				if( ma15 > 65.7557 )
					if( ma55 <= 65.7198 )
						if( ma25 <= 65.6368 )
							if( ma55 <= 65.1005 )
								ret := -1.000000 // sell
							if( ma55 > 65.1005 )
								if( ma90 <= 65.0113 )
									ret := 1.000000 // buy
								if( ma90 > 65.0113 )
									ret := 0.750000 // buy
						if( ma25 > 65.6368 )
							if( ma05 <= 66.3281 )
								if( ma05 <= 66.1347 )
									ret := -0.365269
								if( ma05 > 66.1347 )
									ret := 0.480000
							if( ma05 > 66.3281 )
								if( ma35 <= 65.9867 )
									ret := -0.813953 // sell
								if( ma35 > 65.9867 )
									ret := 0.000000
					if( ma55 > 65.7198 )
						if( ma10 <= 68.2487 )
							if( ma100 <= 67.3538 )
								if( ma15 <= 67.7145 )
									ret := 0.067669
								if( ma15 > 67.7145 )
									ret := -0.804348 // sell
							if( ma100 > 67.3538 )
								if( ma20 <= 67.7522 )
									ret := 0.162264
								if( ma20 > 67.7522 )
									ret := 0.404930
						if( ma10 > 68.2487 )
							if( ma100 <= 68.6004 )
								if( ma60 <= 68.3779 )
									ret := -0.051351
								if( ma60 > 68.3779 )
									ret := -0.494253
							if( ma100 > 68.6004 )
								if( ma60 <= 68.7825 )
									ret := 0.500000
								if( ma60 > 68.7825 )
									ret := 0.011340
		if( ma10_colorInt > 1.5 )
			if( ma20 <= 53.9861 )
				if( ma30 <= 53.7851 )
					if( ma25 <= 49.4153 )
						if( ma05 <= 49.415 )
							if( ma40 <= 49.5721 )
								if( ma70 <= 49.7654 )
									ret := 1.000000 // buy
								if( ma70 > 49.7654 )
									ret := 0.888889 // buy
							if( ma40 > 49.5721 )
								ret := 0.500000
						if( ma05 > 49.415 )
							ret := 0.000000
					if( ma25 > 49.4153 )
						if( ma10 <= 51.1582 )
							if( ma10_colorInt <= 3.5 )
								if( ma05 <= 50.1232 )
									ret := -0.222222
								if( ma05 > 50.1232 )
									ret := -0.777778 // sell
							if( ma10_colorInt > 3.5 )
								ret := 1.000000 // buy
						if( ma10 > 51.1582 )
							if( ma100 <= 52.4708 )
								if( ma15_colorInt <= 3.5 )
									ret := 0.778846 // buy
								if( ma15_colorInt > 3.5 )
									ret := -0.857143 // sell
							if( ma100 > 52.4708 )
								if( ma30 <= 52.5029 )
									ret := -0.306452
								if( ma30 > 52.5029 )
									ret := 0.267303
				if( ma30 > 53.7851 )
					if( ma05_colorInt <= 2.5 )
						ret := -0.200000
					if( ma05_colorInt > 2.5 )
						if( ma20 <= 53.9714 )
							if( ma10 <= 53.8729 )
								if( ma30 <= 53.8458 )
									ret := 1.000000 // buy
								if( ma30 > 53.8458 )
									ret := 0.873016 // buy
							if( ma10 > 53.8729 )
								if( ma15 <= 53.8814 )
									ret := 0.000000
								if( ma15 > 53.8814 )
									ret := 0.857143 // buy
						if( ma20 > 53.9714 )
							ret := 0.333333
			if( ma20 > 53.9861 )
				if( ma55 <= 54.1187 )
					if( ma15 <= 54.0029 )
						if( ma15 <= 53.9925 )
							if( ma20 <= 53.9915 )
								ret := -0.500000
							if( ma20 > 53.9915 )
								ret := -0.750000 // sell
						if( ma15 > 53.9925 )
							ret := 0.000000
					if( ma15 > 54.0029 )
						if( ma10 <= 54.083 )
							ret := -1.000000 // sell
						if( ma10 > 54.083 )
							ret := -0.250000
				if( ma55 > 54.1187 )
					if( ma90 <= 54.3509 )
						if( ma80 <= 54.3003 )
							if( ma75 <= 54.2905 )
								if( ma10 <= 54.6202 )
									ret := 0.129412
								if( ma10 > 54.6202 )
									ret := 0.833333 // buy
							if( ma75 > 54.2905 )
								if( ma80 <= 54.2912 )
									ret := -0.400000
								if( ma80 > 54.2912 )
									ret := -1.000000 // sell
						if( ma80 > 54.3003 )
							if( ma35_colorInt <= 1.5 )
								if( ma05 <= 54.7647 )
									ret := -0.800000 // sell
								if( ma05 > 54.7647 )
									ret := 1.000000 // buy
							if( ma35_colorInt > 1.5 )
								if( ma65 <= 54.3766 )
									ret := 0.527778
								if( ma65 > 54.3766 )
									ret := 0.960784 // buy
					if( ma90 > 54.3509 )
						if( ma25 <= 54.6529 )
							if( ma50 <= 54.3937 )
								if( ma05 <= 54.2538 )
									ret := 0.900000 // buy
								if( ma05 > 54.2538 )
									ret := -0.714286 // sell
							if( ma50 > 54.3937 )
								if( ma80 <= 54.5763 )
									ret := -0.388060
								if( ma80 > 54.5763 )
									ret := -0.980769 // sell
						if( ma25 > 54.6529 )
							if( ma30 <= 57.6451 )
								if( ma90 <= 57.6227 )
									ret := 0.166463
								if( ma90 > 57.6227 )
									ret := 0.487069
							if( ma30 > 57.6451 )
								if( ma100 <= 57.9138 )
									ret := -0.209632
								if( ma100 > 57.9138 )
									ret := 0.098390
	if( ma05_colorInt > 3.5 )
		if( ma25 <= 60.546 )
			if( ma35 <= 60.2738 )
				if( ma70 <= 60.3043 )
					if( ma65 <= 49.4419 )
						ret := 1.000000 // buy
					if( ma65 > 49.4419 )
						if( ma15 <= 51.8059 )
							if( ma25 <= 49.1688 )
								ret := 0.571429
							if( ma25 > 49.1688 )
								if( ma70 <= 49.4889 )
									ret := 0.142857
								if( ma70 > 49.4889 )
									ret := -0.746269 // sell
						if( ma15 > 51.8059 )
							if( ma05 <= 52.2005 )
								if( ma50 <= 52.2301 )
									ret := 0.928571 // buy
								if( ma50 > 52.2301 )
									ret := 0.428571
							if( ma05 > 52.2005 )
								if( ma20 <= 59.1303 )
									ret := -0.067973
								if( ma20 > 59.1303 )
									ret := -0.210250
				if( ma70 > 60.3043 )
					if( ma10 <= 60.0867 )
						if( ma30 <= 60.1349 )
							if( ma80 <= 60.3834 )
								ret := 0.750000 // buy
							if( ma80 > 60.3834 )
								ret := 0.000000
						if( ma30 > 60.1349 )
							if( ma20 <= 60.1279 )
								ret := 1.000000 // buy
							if( ma20 > 60.1279 )
								ret := 0.750000 // buy
					if( ma10 > 60.0867 )
						if( ma30 <= 60.1875 )
							if( ma35_colorInt <= 3.5 )
								if( ma100 <= 60.5359 )
									ret := 0.400000
								if( ma100 > 60.5359 )
									ret := -1.000000 // sell
							if( ma35_colorInt > 3.5 )
								ret := -1.000000 // sell
						if( ma30 > 60.1875 )
							if( ma45 <= 60.2853 )
								if( ma45_colorInt <= 3.5 )
									ret := 0.555556
								if( ma45_colorInt > 3.5 )
									ret := 1.000000 // buy
							if( ma45 > 60.2853 )
								if( ma40 <= 60.2866 )
									ret := -0.750000 // sell
								if( ma40 > 60.2866 )
									ret := 0.333333
			if( ma35 > 60.2738 )
				if( ma40 <= 60.5118 )
					if( ma80 <= 60.5246 )
						if( ma50 <= 60.3921 )
							if( ma20_colorInt <= 3.5 )
								if( ma20 <= 60.253 )
									ret := -0.200000
								if( ma20 > 60.253 )
									ret := -0.500000
							if( ma20_colorInt > 3.5 )
								if( ma100 <= 60.3955 )
									ret := -0.600000
								if( ma100 > 60.3955 )
									ret := -1.000000 // sell
						if( ma50 > 60.3921 )
							if( ma70 <= 60.4065 )
								ret := -0.500000
							if( ma70 > 60.4065 )
								if( ma90 <= 60.4207 )
									ret := 0.000000
								if( ma90 > 60.4207 )
									ret := 0.250000
					if( ma80 > 60.5246 )
						if( ma05 <= 60.22 )
							if( ma85 <= 60.6336 )
								ret := 0.000000
							if( ma85 > 60.6336 )
								if( ma40 <= 60.3422 )
									ret := -0.750000 // sell
								if( ma40 > 60.3422 )
									ret := -1.000000 // sell
						if( ma05 > 60.22 )
							ret := -1.000000 // sell
				if( ma40 > 60.5118 )
					if( ma15 <= 60.405 )
						ret := 1.000000 // buy
					if( ma15 > 60.405 )
						if( ma65 <= 60.7003 )
							if( ma60 <= 60.6349 )
								ret := 0.250000
							if( ma60 > 60.6349 )
								ret := -0.250000
						if( ma65 > 60.7003 )
							ret := -0.857143 // sell
		if( ma25 > 60.546 )
			if( ma05 <= 61.642 )
				if( ma85 <= 61.823 )
					if( ma50 <= 61.0805 )
						if( ma50 <= 61.0491 )
							if( ma65 <= 60.9009 )
								if( ma15 <= 60.7232 )
									ret := 0.681159
								if( ma15 > 60.7232 )
									ret := 0.140351
							if( ma65 > 60.9009 )
								if( ma70 <= 60.9718 )
									ret := -0.416667
								if( ma70 > 60.9718 )
									ret := 0.210526
						if( ma50 > 61.0491 )
							if( ma30 <= 60.9464 )
								ret := 1.000000 // buy
							if( ma30 > 60.9464 )
								ret := 0.800000 // buy
					if( ma50 > 61.0805 )
						if( ma05 <= 61.1448 )
							if( ma65 <= 61.167 )
								if( ma90 <= 61.1547 )
									ret := -0.750000 // sell
								if( ma90 > 61.1547 )
									ret := 0.500000
							if( ma65 > 61.167 )
								if( ma65 <= 61.3451 )
									ret := -1.000000 // sell
								if( ma65 > 61.3451 )
									ret := -0.666667
						if( ma05 > 61.1448 )
							if( ma35_colorInt <= 3.5 )
								if( ma20_colorInt <= 2.5 )
									ret := -0.250000
								if( ma20_colorInt > 2.5 )
									ret := 0.425000
							if( ma35_colorInt > 3.5 )
								if( ma90_colorInt <= 2.5 )
									ret := -0.764706 // sell
								if( ma90_colorInt > 2.5 )
									ret := -0.060606
				if( ma85 > 61.823 )
					if( ma10 <= 61.6429 )
						if( ma10 <= 61.5291 )
							if( ma15 <= 61.5475 )
								if( ma15 <= 61.5173 )
									ret := 1.000000 // buy
								if( ma15 > 61.5173 )
									ret := 0.846154 // buy
							if( ma15 > 61.5475 )
								ret := 0.400000
						if( ma10 > 61.5291 )
							ret := 1.000000 // buy
					if( ma10 > 61.6429 )
						ret := 0.250000
			if( ma05 > 61.642 )
				if( ma30 <= 62.2522 )
					if( ma20 <= 61.9578 )
						if( ma60 <= 62.155 )
							if( ma100 <= 62.1468 )
								if( ma20 <= 61.6678 )
									ret := -0.750000 // sell
								if( ma20 > 61.6678 )
									ret := 0.216867
							if( ma100 > 62.1468 )
								if( ma10 <= 61.9333 )
									ret := -0.604651
								if( ma10 > 61.9333 )
									ret := 0.500000
						if( ma60 > 62.155 )
							if( ma80 <= 62.4698 )
								ret := 1.000000 // buy
							if( ma80 > 62.4698 )
								ret := 0.250000
					if( ma20 > 61.9578 )
						if( ma65 <= 62.3689 )
							if( ma65 <= 62.2928 )
								if( ma55_colorInt <= 3.5 )
									ret := -0.804878 // sell
								if( ma55_colorInt > 3.5 )
									ret := 0.200000
							if( ma65 > 62.2928 )
								if( ma20 <= 62.1277 )
									ret := -0.500000
								if( ma20 > 62.1277 )
									ret := -1.000000 // sell
						if( ma65 > 62.3689 )
							if( ma05 <= 62.1311 )
								if( ma20 <= 62.1711 )
									ret := 0.400000
								if( ma20 > 62.1711 )
									ret := -0.250000
							if( ma05 > 62.1311 )
								if( ma35 <= 62.2391 )
									ret := -0.500000
								if( ma35 > 62.2391 )
									ret := -1.000000 // sell
				if( ma30 > 62.2522 )
					if( ma85 <= 62.3714 )
						ret := 1.000000 // buy
					if( ma85 > 62.3714 )
						if( ma90 <= 64.6707 )
							if( ma75 <= 63.5697 )
								if( ma90 <= 63.5297 )
									ret := -0.029885
								if( ma90 > 63.5297 )
									ret := -0.755102 // sell
							if( ma75 > 63.5697 )
								if( ma70 <= 63.5602 )
									ret := 0.902439 // buy
								if( ma70 > 63.5602 )
									ret := 0.137441
						if( ma90 > 64.6707 )
							if( ma15 <= 65.7589 )
								if( ma10_colorInt <= 3.5 )
									ret := 0.190476
								if( ma10_colorInt > 3.5 )
									ret := -0.218627
							if( ma15 > 65.7589 )
								if( ma05 <= 69.7984 )
									ret := 0.077181
								if( ma05 > 69.7984 )
									ret := -0.023708
	
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
float op_operation = decision_tree_0_SHOP_1Min_c663ee3b(ma05, ma50_colorInt, ma90, ma35_colorInt, ma90_colorInt, ma55_colorInt, ma20, ma15_colorInt, ma40_colorInt, ma45_colorInt, ma65_colorInt, ma75_colorInt, ma35, ma30, ma60, ma75, ma05_colorInt, ma45, ma40, ma30_colorInt, ma25, ma100, ma50, ma70_colorInt, ma10_colorInt, ma20_colorInt, ma60_colorInt, ma25_colorInt, ma10, ma15, ma80, ma65, ma85_colorInt, ma55, ma70, ma85, ma80_colorInt)

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


