//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Madrid_Moving_Average_Ribbon
// ID_model: HUBS_15Min_1MAD_17f6dffd Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_HUBS_15Min_1MAD_17f6dffd", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_HUBS_15Min_17f6dffd(ma15, ma70_colorInt, ma75_colorInt, ma70, ma40_colorInt, ma80_colorInt, ma20, ma20_colorInt, ma60, ma50, ma65_colorInt, ma45, ma55, ma05_colorInt, ma35_colorInt, ma10_colorInt, ma30, ma25_colorInt, ma100, ma65, ma85, ma80, ma60_colorInt, ma85_colorInt, ma90, ma90_colorInt, ma25, ma40, ma50_colorInt, ma35, ma30_colorInt, ma45_colorInt, ma05, ma75, ma55_colorInt, ma10, ma15_colorInt)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ma85 <= 286.187 )
		if( ma65 <= 258.165 )
			if( ma65 <= 133.66 )
				if( ma35 <= 132.99 )
					if( ma65_colorInt <= 3.5 )
						if( ma05 <= 46.3052 )
							if( ma20 <= 46.4959 )
								ret := 1.000000 // buy
							if( ma20 > 46.4959 )
								ret := 0.200000
						if( ma05 > 46.3052 )
							if( ma25 <= 121.364 )
								if( ma50 <= 121.993 )
									ret := 0.049087
								if( ma50 > 121.993 )
									ret := -0.659341
							if( ma25 > 121.364 )
								if( ma60 <= 128.38 )
									ret := 0.300409
								if( ma60 > 128.38 )
									ret := 0.002312
					if( ma65_colorInt > 3.5 )
						if( ma35_colorInt <= 3.5 )
							if( ma15 <= 127.812 )
								if( ma20 <= 125.492 )
									ret := -0.220455
								if( ma20 > 125.492 )
									ret := 0.488889
							if( ma15 > 127.812 )
								if( ma55 <= 127.687 )
									ret := -1.000000 // sell
								if( ma55 > 127.687 )
									ret := -0.656716
						if( ma35_colorInt > 3.5 )
							if( ma100 <= 109.345 )
								if( ma05 <= 95.7653 )
									ret := -0.042842
								if( ma05 > 95.7653 )
									ret := -0.535484
							if( ma100 > 109.345 )
								if( ma60 <= 109.251 )
									ret := 0.948276 // buy
								if( ma60 > 109.251 )
									ret := 0.093710
				if( ma35 > 132.99 )
					if( ma10 <= 142.459 )
						if( ma100 <= 131.931 )
							if( ma20_colorInt <= 1.5 )
								if( ma20 <= 137.557 )
									ret := 0.704819 // buy
								if( ma20 > 137.557 )
									ret := -0.400000
							if( ma20_colorInt > 1.5 )
								ret := 1.000000 // buy
						if( ma100 > 131.931 )
							if( ma40 <= 134.695 )
								if( ma55 <= 133.698 )
									ret := 0.141667
								if( ma55 > 133.698 )
									ret := 0.800000 // buy
							if( ma40 > 134.695 )
								ret := -0.555556
					if( ma10 > 142.459 )
						ret := -1.000000 // sell
			if( ma65 > 133.66 )
				if( ma15 <= 138.413 )
					if( ma35 <= 138.253 )
						if( ma55 <= 133.656 )
							if( ma85 <= 135.156 )
								ret := -0.588235
							if( ma85 > 135.156 )
								if( ma70 <= 134.595 )
									ret := -0.800000 // sell
								if( ma70 > 134.595 )
									ret := -1.000000 // sell
						if( ma55 > 133.656 )
							if( ma35 <= 133.816 )
								if( ma40 <= 133.227 )
									ret := 0.137255
								if( ma40 > 133.227 )
									ret := 0.602041
							if( ma35 > 133.816 )
								if( ma05 <= 137.644 )
									ret := -0.264674
								if( ma05 > 137.644 )
									ret := 0.467290
					if( ma35 > 138.253 )
						if( ma10 <= 137.522 )
							if( ma70 <= 142.047 )
								if( ma60 <= 137.883 )
									ret := -1.000000 // sell
								if( ma60 > 137.883 )
									ret := 0.415094
							if( ma70 > 142.047 )
								if( ma55 <= 141.697 )
									ret := -1.000000 // sell
								if( ma55 > 141.697 )
									ret := 0.272727
						if( ma10 > 137.522 )
							if( ma85 <= 140.277 )
								ret := -1.000000 // sell
							if( ma85 > 140.277 )
								ret := -0.888889 // sell
				if( ma15 > 138.413 )
					if( ma10 <= 260.347 )
						if( ma80 <= 244.006 )
							if( ma25 <= 225.604 )
								if( ma85 <= 211.44 )
									ret := -0.006175
								if( ma85 > 211.44 )
									ret := 0.366032
							if( ma25 > 225.604 )
								if( ma80_colorInt <= 2.5 )
									ret := -0.114323
								if( ma80_colorInt > 2.5 )
									ret := -0.827160 // sell
						if( ma80 > 244.006 )
							if( ma45 <= 258.397 )
								if( ma15_colorInt <= 1.5 )
									ret := 0.861111 // buy
								if( ma15_colorInt > 1.5 )
									ret := 1.000000 // buy
							if( ma45 > 258.397 )
								if( ma10_colorInt <= 1.5 )
									ret := -0.928571 // sell
								if( ma10_colorInt > 1.5 )
									ret := 0.357143
					if( ma10 > 260.347 )
						if( ma100 <= 252.042 )
							ret := -0.625000
						if( ma100 > 252.042 )
							if( ma65 <= 257.894 )
								ret := -1.000000 // sell
							if( ma65 > 257.894 )
								ret := -0.928571 // sell
		if( ma65 > 258.165 )
			if( ma20 <= 265.85 )
				if( ma100 <= 268.671 )
					if( ma100 <= 265.148 )
						if( ma60 <= 262.823 )
							if( ma55 <= 258.568 )
								ret := 1.000000 // buy
							if( ma55 > 258.568 )
								if( ma75 <= 258.874 )
									ret := -0.289474
								if( ma75 > 258.874 )
									ret := 0.407407
						if( ma60 > 262.823 )
							if( ma45 <= 262.867 )
								ret := 1.000000 // buy
							if( ma45 > 262.867 )
								if( ma05 <= 268.783 )
									ret := 0.583333
								if( ma05 > 268.783 )
									ret := 1.000000 // buy
					if( ma100 > 265.148 )
						if( ma30 <= 261.515 )
							if( ma50 <= 261.578 )
								ret := 0.142857
							if( ma50 > 261.578 )
								ret := 1.000000 // buy
						if( ma30 > 261.515 )
							if( ma75 <= 265.977 )
								if( ma10 <= 262.025 )
									ret := -0.222222
								if( ma10 > 262.025 )
									ret := -0.795918 // sell
							if( ma75 > 265.977 )
								if( ma70 <= 267.014 )
									ret := 0.833333 // buy
								if( ma70 > 267.014 )
									ret := -0.416667
				if( ma100 > 268.671 )
					if( ma50 <= 268.999 )
						if( ma60 <= 267.914 )
							if( ma20 <= 259.123 )
								ret := 0.000000
							if( ma20 > 259.123 )
								if( ma45 <= 265.278 )
									ret := 0.869565 // buy
								if( ma45 > 265.278 )
									ret := 0.428571
						if( ma60 > 267.914 )
							if( ma10 <= 264.841 )
								if( ma35 <= 265.646 )
									ret := 0.918367 // buy
								if( ma35 > 265.646 )
									ret := 1.000000 // buy
							if( ma10 > 264.841 )
								ret := 0.785714 // buy
					if( ma50 > 268.999 )
						if( ma25 <= 264.237 )
							ret := -1.000000 // sell
						if( ma25 > 264.237 )
							if( ma30 <= 266.988 )
								ret := 0.058824
							if( ma30 > 266.988 )
								ret := 1.000000 // buy
			if( ma20 > 265.85 )
				if( ma05 <= 267.075 )
					if( ma75 <= 274.923 )
						if( ma10 <= 265.833 )
							if( ma05 <= 264.533 )
								ret := -0.818182 // sell
							if( ma05 > 264.533 )
								ret := -1.000000 // sell
						if( ma10 > 265.833 )
							if( ma85 <= 271.234 )
								ret := -0.350000
							if( ma85 > 271.234 )
								if( ma55 <= 271.934 )
									ret := -0.615385
								if( ma55 > 271.934 )
									ret := -1.000000 // sell
					if( ma75 > 274.923 )
						if( ma55 <= 276.478 )
							if( ma30 <= 269.167 )
								ret := -0.437500
							if( ma30 > 269.167 )
								if( ma50 <= 274.351 )
									ret := 0.928571 // buy
								if( ma50 > 274.351 )
									ret := 0.454545
						if( ma55 > 276.478 )
							if( ma90 <= 280.881 )
								ret := -1.000000 // sell
							if( ma90 > 280.881 )
								ret := -0.625000
				if( ma05 > 267.075 )
					if( ma25_colorInt <= 1.5 )
						if( ma100 <= 276.897 )
							if( ma40 <= 275.889 )
								if( ma35 <= 273.394 )
									ret := -0.225806
								if( ma35 > 273.394 )
									ret := 0.660550
							if( ma40 > 275.889 )
								if( ma55 <= 276.384 )
									ret := -0.797297 // sell
								if( ma55 > 276.384 )
									ret := -0.287671
						if( ma100 > 276.897 )
							if( ma65 <= 279.078 )
								if( ma10 <= 280.414 )
									ret := 0.600000
								if( ma10 > 280.414 )
									ret := 0.896104 // buy
							if( ma65 > 279.078 )
								if( ma45 <= 282.442 )
									ret := -0.374046
								if( ma45 > 282.442 )
									ret := 0.192440
					if( ma25_colorInt > 1.5 )
						if( ma100 <= 280.492 )
							if( ma30 <= 278.481 )
								if( ma15_colorInt <= 2.5 )
									ret := -0.080247
								if( ma15_colorInt > 2.5 )
									ret := 0.485656
							if( ma30 > 278.481 )
								if( ma75_colorInt <= 1.5 )
									ret := 0.478261
								if( ma75_colorInt > 1.5 )
									ret := 0.839080 // buy
						if( ma100 > 280.492 )
							if( ma55 <= 278.778 )
								if( ma25 <= 271.661 )
									ret := 0.454545
								if( ma25 > 271.661 )
									ret := -0.769912 // sell
							if( ma55 > 278.778 )
								if( ma75_colorInt <= 3.5 )
									ret := 0.233748
								if( ma75_colorInt > 3.5 )
									ret := -0.397959
	if( ma85 > 286.187 )
		if( ma80 <= 307.535 )
			if( ma70 <= 306.34 )
				if( ma85_colorInt <= 1.5 )
					if( ma65 <= 287.325 )
						if( ma30 <= 288.06 )
							ret := 0.555556
						if( ma30 > 288.06 )
							if( ma100 <= 286.241 )
								if( ma80 <= 286.441 )
									ret := -1.000000 // sell
								if( ma80 > 286.441 )
									ret := -0.888889 // sell
							if( ma100 > 286.241 )
								ret := -0.866667 // sell
					if( ma65 > 287.325 )
						if( ma100 <= 301.586 )
							if( ma100 <= 296.855 )
								if( ma50 <= 303.611 )
									ret := -0.042791
								if( ma50 > 303.611 )
									ret := 1.000000 // buy
							if( ma100 > 296.855 )
								if( ma05 <= 305.772 )
									ret := 0.882353 // buy
								if( ma05 > 305.772 )
									ret := 0.352381
						if( ma100 > 301.586 )
							if( ma20_colorInt <= 1.5 )
								if( ma55 <= 306.797 )
									ret := -0.840000 // sell
								if( ma55 > 306.797 )
									ret := -0.225806
							if( ma20_colorInt > 1.5 )
								if( ma80 <= 303.935 )
									ret := -1.000000 // sell
								if( ma80 > 303.935 )
									ret := 0.954545 // buy
				if( ma85_colorInt > 1.5 )
					if( ma20 <= 274.895 )
						if( ma25 <= 275.475 )
							ret := 1.000000 // buy
						if( ma25 > 275.475 )
							ret := 0.636364
					if( ma20 > 274.895 )
						if( ma90 <= 289.481 )
							if( ma45_colorInt <= 2.5 )
								if( ma15 <= 292.172 )
									ret := -0.836207 // sell
								if( ma15 > 292.172 )
									ret := -0.181818
							if( ma45_colorInt > 2.5 )
								if( ma20_colorInt <= 3.5 )
									ret := -0.139535
								if( ma20_colorInt > 3.5 )
									ret := -0.875000 // sell
						if( ma90 > 289.481 )
							if( ma65 <= 292.684 )
								if( ma30 <= 289.188 )
									ret := -0.096970
								if( ma30 > 289.188 )
									ret := 0.324324
							if( ma65 > 292.684 )
								if( ma30 <= 304.969 )
									ret := -0.341065
								if( ma30 > 304.969 )
									ret := 0.500000
			if( ma70 > 306.34 )
				if( ma05 <= 309.374 )
					if( ma80 <= 306.291 )
						ret := -0.400000
					if( ma80 > 306.291 )
						if( ma100 <= 307.324 )
							if( ma70 <= 307.289 )
								ret := -1.000000 // sell
							if( ma70 > 307.289 )
								if( ma35 <= 311.052 )
									ret := -0.750000 // sell
								if( ma35 > 311.052 )
									ret := -1.000000 // sell
						if( ma100 > 307.324 )
							if( ma45 <= 305.102 )
								ret := -1.000000 // sell
							if( ma45 > 305.102 )
								ret := -0.090909
				if( ma05 > 309.374 )
					if( ma55 <= 310.309 )
						if( ma20_colorInt <= 1.5 )
							if( ma25 <= 313.171 )
								if( ma35 <= 310.656 )
									ret := -0.125000
								if( ma35 > 310.656 )
									ret := -0.866667 // sell
							if( ma25 > 313.171 )
								if( ma15 <= 315.31 )
									ret := -0.090909
								if( ma15 > 315.31 )
									ret := 0.300000
						if( ma20_colorInt > 1.5 )
							if( ma30 <= 312.713 )
								if( ma70_colorInt <= 1.5 )
									ret := 1.000000 // buy
								if( ma70_colorInt > 1.5 )
									ret := 0.555556
							if( ma30 > 312.713 )
								ret := 0.461538
					if( ma55 > 310.309 )
						if( ma80 <= 306.609 )
							ret := -1.000000 // sell
						if( ma80 > 306.609 )
							ret := -0.846154 // sell
		if( ma80 > 307.535 )
			if( ma70 <= 808.299 )
				if( ma65 <= 313.611 )
					if( ma90_colorInt <= 2.5 )
						if( ma40 <= 312.594 )
							if( ma65 <= 309.15 )
								ret := -0.923077 // sell
							if( ma65 > 309.15 )
								ret := 0.600000
						if( ma40 > 312.594 )
							if( ma55 <= 311.85 )
								if( ma20 <= 316.542 )
									ret := 0.769231 // buy
								if( ma20 > 316.542 )
									ret := -0.266667
							if( ma55 > 311.85 )
								if( ma100 <= 309.634 )
									ret := 0.915789 // buy
								if( ma100 > 309.634 )
									ret := 0.600000
					if( ma90_colorInt > 2.5 )
						if( ma10 <= 297.326 )
							if( ma10 <= 295.822 )
								ret := 1.000000 // buy
							if( ma10 > 295.822 )
								if( ma45 <= 303.037 )
									ret := 1.000000 // buy
								if( ma45 > 303.037 )
									ret := 0.461538
						if( ma10 > 297.326 )
							if( ma70 <= 308.868 )
								if( ma15_colorInt <= 3.5 )
									ret := 0.635417
								if( ma15_colorInt > 3.5 )
									ret := -0.062500
							if( ma70 > 308.868 )
								if( ma20_colorInt <= 3.5 )
									ret := 0.105691
								if( ma20_colorInt > 3.5 )
									ret := -0.411765
				if( ma65 > 313.611 )
					if( ma20_colorInt <= 1.5 )
						if( ma30 <= 808.044 )
							if( ma35_colorInt <= 3.5 )
								if( ma90 <= 489.361 )
									ret := -0.021549
								if( ma90 > 489.361 )
									ret := -0.103250
							if( ma35_colorInt > 3.5 )
								if( ma40 <= 537.62 )
									ret := -0.388785
								if( ma40 > 537.62 )
									ret := 0.018750
						if( ma30 > 808.044 )
							if( ma100 <= 805.097 )
								if( ma90 <= 803.252 )
									ret := 0.652174
								if( ma90 > 803.252 )
									ret := 0.947368 // buy
							if( ma100 > 805.097 )
								ret := 0.176471
					if( ma20_colorInt > 1.5 )
						if( ma85 <= 319.577 )
							if( ma25_colorInt <= 3.5 )
								if( ma75 <= 314.74 )
									ret := 0.738095 // buy
								if( ma75 > 314.74 )
									ret := -0.346939
							if( ma25_colorInt > 3.5 )
								if( ma45_colorInt <= 3.5 )
									ret := -0.656250
								if( ma45_colorInt > 3.5 )
									ret := -0.961538 // sell
						if( ma85 > 319.577 )
							if( ma15 <= 313.731 )
								if( ma90 <= 321.426 )
									ret := -0.047619
								if( ma90 > 321.426 )
									ret := 0.593023
							if( ma15 > 313.731 )
								if( ma35 <= 334.964 )
									ret := -0.288931
								if( ma35 > 334.964 )
									ret := 0.011437
			if( ma70 > 808.299 )
				if( ma100 <= 818.46 )
					if( ma10 <= 819.622 )
						if( ma80 <= 807.91 )
							ret := -0.136364
						if( ma80 > 807.91 )
							if( ma30 <= 810.236 )
								if( ma30 <= 796.41 )
									ret := -1.000000 // sell
								if( ma30 > 796.41 )
									ret := -0.428571
							if( ma30 > 810.236 )
								if( ma25 <= 818.861 )
									ret := -1.000000 // sell
								if( ma25 > 818.861 )
									ret := -0.833333 // sell
					if( ma10 > 819.622 )
						if( ma80 <= 819.932 )
							if( ma10 <= 840.551 )
								ret := 0.750000 // buy
							if( ma10 > 840.551 )
								ret := -0.166667
						if( ma80 > 819.932 )
							ret := -1.000000 // sell
				if( ma100 > 818.46 )
					if( ma60 <= 825.647 )
						if( ma85_colorInt <= 1.5 )
							if( ma30 <= 821.521 )
								ret := -0.500000
							if( ma30 > 821.521 )
								ret := 0.437500
						if( ma85_colorInt > 1.5 )
							if( ma25 <= 818.786 )
								ret := 0.368421
							if( ma25 > 818.786 )
								if( ma15 <= 818.777 )
									ret := 0.750000 // buy
								if( ma15 > 818.777 )
									ret := 1.000000 // buy
					if( ma60 > 825.647 )
						if( ma10 <= 825.4 )
							if( ma50 <= 828.084 )
								ret := -0.454545
							if( ma50 > 828.084 )
								ret := -1.000000 // sell
						if( ma10 > 825.4 )
							if( ma25 <= 839.968 )
								if( ma25_colorInt <= 2.5 )
									ret := 0.102190
								if( ma25_colorInt > 2.5 )
									ret := -0.736842 // sell
							if( ma25 > 839.968 )
								if( ma60_colorInt <= 1.5 )
									ret := -0.921569 // sell
								if( ma60_colorInt > 1.5 )
									ret := -0.444444
	
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
float op_operation = decision_tree_0_HUBS_15Min_17f6dffd(ma15, ma70_colorInt, ma75_colorInt, ma70, ma40_colorInt, ma80_colorInt, ma20, ma20_colorInt, ma60, ma50, ma65_colorInt, ma45, ma55, ma05_colorInt, ma35_colorInt, ma10_colorInt, ma30, ma25_colorInt, ma100, ma65, ma85, ma80, ma60_colorInt, ma85_colorInt, ma90, ma90_colorInt, ma25, ma40, ma50_colorInt, ma35, ma30_colorInt, ma45_colorInt, ma05, ma75, ma55_colorInt, ma10, ma15_colorInt)

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


