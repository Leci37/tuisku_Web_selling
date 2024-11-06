//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Madrid_Moving_Average_Ribbon
// ID_model: SNOW_1Min_1MAD_23f68818 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNOW_1Min_1MAD_23f68818", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNOW_1Min_23f68818(ma05, ma50_colorInt, ma90, ma35_colorInt, ma90_colorInt, ma55_colorInt, ma20, ma15_colorInt, ma40_colorInt, ma45_colorInt, ma65_colorInt, ma75_colorInt, ma35, ma30, ma60, ma75, ma05_colorInt, ma45, ma40, ma30_colorInt, ma25, ma100, ma50, ma70_colorInt, ma10_colorInt, ma20_colorInt, ma60_colorInt, ma25_colorInt, ma10, ma15, ma80, ma65, ma85_colorInt, ma55, ma70, ma85, ma80_colorInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ma05 <= 109.789 )
		if( ma10 <= 108.826 )
			if( ma35 <= 107.842 )
				if( ma05_colorInt <= 3.5 )
					if( ma80 <= 107.811 )
						ret := 0.142857
					if( ma80 > 107.811 )
						if( ma45 <= 107.769 )
							if( ma100 <= 108.119 )
								if( ma35 <= 107.721 )
									ret := 0.875000 // buy
								if( ma35 > 107.721 )
									ret := 0.200000
							if( ma100 > 108.119 )
								ret := 0.000000
						if( ma45 > 107.769 )
							if( ma10 <= 107.688 )
								if( ma05 <= 107.608 )
									ret := 0.923077 // buy
								if( ma05 > 107.608 )
									ret := 0.428571
							if( ma10 > 107.688 )
								ret := 1.000000 // buy
				if( ma05_colorInt > 3.5 )
					if( ma35 <= 107.597 )
						if( ma75 <= 107.81 )
							ret := 1.000000 // buy
						if( ma75 > 107.81 )
							if( ma50 <= 107.609 )
								ret := 0.750000 // buy
							if( ma50 > 107.609 )
								ret := 0.250000
					if( ma35 > 107.597 )
						if( ma25 <= 107.62 )
							ret := -0.666667
						if( ma25 > 107.62 )
							if( ma60 <= 107.877 )
								if( ma45 <= 107.733 )
									ret := 0.000000
								if( ma45 > 107.733 )
									ret := -0.250000
							if( ma60 > 107.877 )
								ret := 0.250000
			if( ma35 > 107.842 )
				if( ma75 <= 109.389 )
					if( ma40_colorInt <= 3.5 )
						if( ma25 <= 108.551 )
							if( ma85_colorInt <= 1.5 )
								if( ma10_colorInt <= 1.5 )
									ret := -0.192308
								if( ma10_colorInt > 1.5 )
									ret := 0.642857
							if( ma85_colorInt > 1.5 )
								if( ma60 <= 108.597 )
									ret := -0.452703
								if( ma60 > 108.597 )
									ret := 0.020408
						if( ma25 > 108.551 )
							if( ma35_colorInt <= 1.5 )
								ret := -1.000000 // sell
							if( ma35_colorInt > 1.5 )
								if( ma75 <= 108.931 )
									ret := 0.250000
								if( ma75 > 108.931 )
									ret := -0.560000
					if( ma40_colorInt > 3.5 )
						if( ma70 <= 107.995 )
							if( ma10 <= 108.353 )
								ret := 0.000000
							if( ma10 > 108.353 )
								ret := -0.750000 // sell
						if( ma70 > 107.995 )
							if( ma25 <= 108.558 )
								if( ma20 <= 108.245 )
									ret := 0.750000 // buy
								if( ma20 > 108.245 )
									ret := 0.066667
							if( ma25 > 108.558 )
								if( ma35 <= 108.603 )
									ret := 1.000000 // buy
								if( ma35 > 108.603 )
									ret := 0.250000
				if( ma75 > 109.389 )
					if( ma50 <= 109.202 )
						if( ma20 <= 108.192 )
							if( ma05_colorInt <= 3.5 )
								ret := 1.000000 // buy
							if( ma05_colorInt > 3.5 )
								ret := -1.000000 // sell
						if( ma20 > 108.192 )
							if( ma50 <= 109.157 )
								if( ma85 <= 109.563 )
									ret := 0.500000
								if( ma85 > 109.563 )
									ret := 0.944444 // buy
							if( ma50 > 109.157 )
								ret := 0.250000
					if( ma50 > 109.202 )
						if( ma30 <= 109.021 )
							if( ma85 <= 110.265 )
								ret := 0.000000
							if( ma85 > 110.265 )
								ret := -0.500000
						if( ma30 > 109.021 )
							if( ma10 <= 108.753 )
								if( ma15 <= 108.677 )
									ret := -0.750000 // sell
								if( ma15 > 108.677 )
									ret := -1.000000 // sell
							if( ma10 > 108.753 )
								ret := -0.500000
		if( ma10 > 108.826 )
			if( ma30 <= 109.142 )
				if( ma80 <= 108.456 )
					if( ma10 <= 109.153 )
						if( ma05_colorInt <= 1.5 )
							ret := -0.428571
						if( ma05_colorInt > 1.5 )
							ret := 1.000000 // buy
					if( ma10 > 109.153 )
						if( ma75 <= 108.381 )
							ret := -1.000000 // sell
						if( ma75 > 108.381 )
							ret := -0.250000
				if( ma80 > 108.456 )
					if( ma15 <= 109.368 )
						if( ma45 <= 109.109 )
							if( ma10 <= 108.956 )
								if( ma45 <= 108.752 )
									ret := 0.000000
								if( ma45 > 108.752 )
									ret := 1.000000 // buy
							if( ma10 > 108.956 )
								if( ma05 <= 109.481 )
									ret := 0.942029 // buy
								if( ma05 > 109.481 )
									ret := 0.250000
						if( ma45 > 109.109 )
							if( ma25 <= 108.994 )
								ret := 1.000000 // buy
							if( ma25 > 108.994 )
								if( ma80 <= 109.26 )
									ret := -0.200000
								if( ma80 > 109.26 )
									ret := 0.500000
					if( ma15 > 109.368 )
						ret := -1.000000 // sell
			if( ma30 > 109.142 )
				if( ma15 <= 109.107 )
					if( ma05_colorInt <= 3.5 )
						if( ma50 <= 109.554 )
							if( ma30 <= 109.16 )
								ret := 0.200000
							if( ma30 > 109.16 )
								if( ma30 <= 109.179 )
									ret := -1.000000 // sell
								if( ma30 > 109.179 )
									ret := -0.333333
						if( ma50 > 109.554 )
							ret := 0.571429
					if( ma05_colorInt > 3.5 )
						if( ma05 <= 109.036 )
							if( ma30 <= 109.194 )
								ret := -1.000000 // sell
							if( ma30 > 109.194 )
								if( ma85 <= 109.721 )
									ret := -0.500000
								if( ma85 > 109.721 )
									ret := -1.000000 // sell
						if( ma05 > 109.036 )
							ret := 0.000000
				if( ma15 > 109.107 )
					if( ma15_colorInt <= 1.5 )
						if( ma90 <= 108.871 )
							if( ma05 <= 109.43 )
								if( ma60 <= 108.978 )
									ret := 0.750000 // buy
								if( ma60 > 108.978 )
									ret := -1.000000 // sell
							if( ma05 > 109.43 )
								ret := -1.000000 // sell
						if( ma90 > 108.871 )
							if( ma10 <= 109.482 )
								if( ma05 <= 109.528 )
									ret := 1.000000 // buy
								if( ma05 > 109.528 )
									ret := 0.500000
							if( ma10 > 109.482 )
								if( ma30_colorInt <= 3 )
									ret := 0.142857
								if( ma30_colorInt > 3 )
									ret := -0.342105
					if( ma15_colorInt > 1.5 )
						if( ma75 <= 111.73 )
							if( ma50 <= 110.355 )
								if( ma45 <= 110.009 )
									ret := 0.283898
								if( ma45 > 110.009 )
									ret := 0.586207
							if( ma50 > 110.355 )
								if( ma100 <= 111.924 )
									ret := -0.923077 // sell
								if( ma100 > 111.924 )
									ret := 0.200000
						if( ma75 > 111.73 )
							if( ma65 <= 112.26 )
								ret := 1.000000 // buy
							if( ma65 > 112.26 )
								ret := 0.750000 // buy
	if( ma05 > 109.789 )
		if( ma05_colorInt <= 3.5 )
			if( ma15_colorInt <= 1.5 )
				if( ma15 <= 137.105 )
					if( ma05 <= 136.246 )
						if( ma15 <= 111.71 )
							if( ma30 <= 110.95 )
								if( ma100 <= 109.755 )
									ret := 0.275591
								if( ma100 > 109.755 )
									ret := -0.007576
							if( ma30 > 110.95 )
								if( ma20 <= 111.35 )
									ret := 0.632035
								if( ma20 > 111.35 )
									ret := 0.197044
						if( ma15 > 111.71 )
							if( ma50 <= 111.287 )
								if( ma85_colorInt <= 2.5 )
									ret := -0.943396 // sell
								if( ma85_colorInt > 2.5 )
									ret := -0.333333
							if( ma50 > 111.287 )
								if( ma100 <= 135.387 )
									ret := 0.040165
								if( ma100 > 135.387 )
									ret := -0.350427
					if( ma05 > 136.246 )
						if( ma10_colorInt <= 1.5 )
							if( ma75 <= 136.122 )
								if( ma55 <= 136.091 )
									ret := 0.327434
								if( ma55 > 136.091 )
									ret := 0.852459 // buy
							if( ma75 > 136.122 )
								if( ma80 <= 136.782 )
									ret := -0.086957
								if( ma80 > 136.782 )
									ret := 0.524390
						if( ma10_colorInt > 1.5 )
							if( ma05 <= 136.883 )
								if( ma75 <= 135.725 )
									ret := -0.750000 // sell
								if( ma75 > 135.725 )
									ret := -0.800000 // sell
							if( ma05 > 136.883 )
								ret := 0.000000
				if( ma15 > 137.105 )
					if( ma90 <= 137.229 )
						if( ma70 <= 137.271 )
							if( ma80 <= 136.934 )
								if( ma90 <= 135.421 )
									ret := 0.166667
								if( ma90 > 135.421 )
									ret := -0.673469
							if( ma80 > 136.934 )
								if( ma50_colorInt <= 2 )
									ret := -0.317241
								if( ma50_colorInt > 2 )
									ret := 0.600000
						if( ma70 > 137.271 )
							if( ma10 <= 137.358 )
								ret := -0.250000
							if( ma10 > 137.358 )
								if( ma85 <= 137.19 )
									ret := -0.882353 // sell
								if( ma85 > 137.19 )
									ret := -1.000000 // sell
					if( ma90 > 137.229 )
						if( ma45 <= 170.258 )
							if( ma70 <= 169.711 )
								if( ma100 <= 164.702 )
									ret := -0.043158
								if( ma100 > 164.702 )
									ret := -0.596899
							if( ma70 > 169.711 )
								if( ma75 <= 170.157 )
									ret := 0.681159
								if( ma75 > 170.157 )
									ret := -0.888889 // sell
						if( ma45 > 170.258 )
							if( ma70 <= 170.647 )
								if( ma15 <= 170.482 )
									ret := -0.500000
								if( ma15 > 170.482 )
									ret := -0.945055 // sell
							if( ma70 > 170.647 )
								if( ma05 <= 172.637 )
									ret := 0.333333
								if( ma05 > 172.637 )
									ret := -0.950000 // sell
			if( ma15_colorInt > 1.5 )
				if( ma15 <= 168.722 )
					if( ma05 <= 164.424 )
						if( ma35 <= 118.927 )
							if( ma40 <= 114.642 )
								if( ma100 <= 114.81 )
									ret := 0.093741
								if( ma100 > 114.81 )
									ret := 0.651613
							if( ma40 > 114.642 )
								if( ma70_colorInt <= 2.5 )
									ret := -0.182972
								if( ma70_colorInt > 2.5 )
									ret := -0.011180
						if( ma35 > 118.927 )
							if( ma05 <= 126.281 )
								if( ma25 <= 126.153 )
									ret := 0.153571
								if( ma25 > 126.153 )
									ret := 0.532134
							if( ma05 > 126.281 )
								if( ma85 <= 146.58 )
									ret := 0.058460
								if( ma85 > 146.58 )
									ret := 0.134145
					if( ma05 > 164.424 )
						if( ma65_colorInt <= 1.5 )
							if( ma35 <= 164.65 )
								if( ma10 <= 164.481 )
									ret := -0.500000
								if( ma10 > 164.481 )
									ret := -0.031250
							if( ma35 > 164.65 )
								if( ma25 <= 164.784 )
									ret := -0.964286 // sell
								if( ma25 > 164.784 )
									ret := -0.500000
						if( ma65_colorInt > 1.5 )
							if( ma100 <= 165.175 )
								if( ma40 <= 164.652 )
									ret := -0.303030
								if( ma40 > 164.652 )
									ret := 0.084746
							if( ma100 > 165.175 )
								ret := -1.000000 // sell
				if( ma15 > 168.722 )
					if( ma100 <= 170.058 )
						if( ma05_colorInt <= 1.5 )
							if( ma75 <= 169.667 )
								if( ma100 <= 168.373 )
									ret := -0.500000
								if( ma100 > 168.373 )
									ret := -1.000000 // sell
							if( ma75 > 169.667 )
								if( ma20_colorInt <= 3.5 )
									ret := 1.000000 // buy
								if( ma20_colorInt > 3.5 )
									ret := 0.000000
						if( ma05_colorInt > 1.5 )
							if( ma75 <= 169.681 )
								if( ma80 <= 168.714 )
									ret := 0.500000
								if( ma80 > 168.714 )
									ret := 0.980392 // buy
							if( ma75 > 169.681 )
								if( ma55 <= 170.214 )
									ret := 0.541176
								if( ma55 > 170.214 )
									ret := 1.000000 // buy
					if( ma100 > 170.058 )
						if( ma45 <= 170.486 )
							if( ma90 <= 170.188 )
								if( ma15_colorInt <= 2.5 )
									ret := 0.666667
								if( ma15_colorInt > 2.5 )
									ret := -0.714286 // sell
							if( ma90 > 170.188 )
								if( ma100 <= 170.09 )
									ret := -0.750000 // sell
								if( ma100 > 170.09 )
									ret := -1.000000 // sell
						if( ma45 > 170.486 )
							if( ma100 <= 170.518 )
								if( ma05 <= 170.623 )
									ret := 0.974359 // buy
								if( ma05 > 170.623 )
									ret := 0.000000
							if( ma100 > 170.518 )
								if( ma65 <= 170.858 )
									ret := -0.437500
								if( ma65 > 170.858 )
									ret := -1.000000 // sell
		if( ma05_colorInt > 3.5 )
			if( ma90_colorInt <= 3.5 )
				if( ma55_colorInt <= 1.5 )
					if( ma60 <= 133.053 )
						if( ma50 <= 114.405 )
							if( ma30 <= 112.335 )
								if( ma50_colorInt <= 1.5 )
									ret := -0.760000 // sell
								if( ma50_colorInt > 1.5 )
									ret := -0.181818
							if( ma30 > 112.335 )
								if( ma85 <= 113.255 )
									ret := 1.000000 // buy
								if( ma85 > 113.255 )
									ret := -0.200000
						if( ma50 > 114.405 )
							if( ma35 <= 122.19 )
								if( ma30_colorInt <= 3.5 )
									ret := -1.000000 // sell
								if( ma30_colorInt > 3.5 )
									ret := -0.555556
							if( ma35 > 122.19 )
								if( ma60 <= 123.209 )
									ret := 0.000000
								if( ma60 > 123.209 )
									ret := -0.618182
					if( ma60 > 133.053 )
						if( ma40 <= 137.23 )
							if( ma35_colorInt <= 1.5 )
								ret := 0.333333
							if( ma35_colorInt > 1.5 )
								ret := 0.000000
						if( ma40 > 137.23 )
							if( ma35_colorInt <= 1.5 )
								if( ma10 <= 158.38 )
									ret := -0.333333
								if( ma10 > 158.38 )
									ret := 0.181818
							if( ma35_colorInt > 1.5 )
								if( ma35_colorInt <= 3.5 )
									ret := -0.888889 // sell
								if( ma35_colorInt > 3.5 )
									ret := -0.312500
				if( ma55_colorInt > 1.5 )
					if( ma20 <= 156.841 )
						if( ma15 <= 156.304 )
							if( ma05 <= 110.112 )
								if( ma15 <= 109.931 )
									ret := 0.021978
								if( ma15 > 109.931 )
									ret := -0.471074
							if( ma05 > 110.112 )
								if( ma35 <= 110.234 )
									ret := 0.729730 // buy
								if( ma35 > 110.234 )
									ret := -0.000928
						if( ma15 > 156.304 )
							if( ma85 <= 156.922 )
								if( ma20 <= 156.467 )
									ret := -0.488372
								if( ma20 > 156.467 )
									ret := 0.040541
							if( ma85 > 156.922 )
								if( ma30_colorInt <= 3.5 )
									ret := -0.323529
								if( ma30_colorInt > 3.5 )
									ret := -0.852941 // sell
					if( ma20 > 156.841 )
						if( ma20 <= 157.999 )
							if( ma100 <= 158.033 )
								if( ma70 <= 157.975 )
									ret := 0.255952
								if( ma70 > 157.975 )
									ret := -0.833333 // sell
							if( ma100 > 158.033 )
								if( ma90 <= 158.852 )
									ret := 0.683673
								if( ma90 > 158.852 )
									ret := 0.068966
						if( ma20 > 157.999 )
							if( ma30 <= 162.536 )
								if( ma65 <= 159.591 )
									ret := 0.126984
								if( ma65 > 159.591 )
									ret := -0.246819
							if( ma30 > 162.536 )
								if( ma35_colorInt <= 3.5 )
									ret := 0.048327
								if( ma35_colorInt > 3.5 )
									ret := 0.478992
			if( ma90_colorInt > 3.5 )
				if( ma35 <= 110.723 )
					if( ma90 <= 110.392 )
						if( ma50 <= 110.277 )
							if( ma90 <= 110.05 )
								if( ma90 <= 109.874 )
									ret := -0.750000 // sell
								if( ma90 > 109.874 )
									ret := 0.000000
							if( ma90 > 110.05 )
								if( ma10 <= 110.008 )
									ret := 0.200000
								if( ma10 > 110.008 )
									ret := 0.750000 // buy
						if( ma50 > 110.277 )
							ret := -0.571429
					if( ma90 > 110.392 )
						if( ma65 <= 110.471 )
							if( ma05 <= 110.408 )
								ret := 1.000000 // buy
							if( ma05 > 110.408 )
								ret := 0.500000
						if( ma65 > 110.471 )
							if( ma10 <= 110.455 )
								if( ma25 <= 110.422 )
									ret := 0.250000
								if( ma25 > 110.422 )
									ret := -1.000000 // sell
							if( ma10 > 110.455 )
								if( ma100 <= 110.737 )
									ret := 0.363636
								if( ma100 > 110.737 )
									ret := 0.888889 // buy
				if( ma35 > 110.723 )
					if( ma90 <= 160.88 )
						if( ma10 <= 113.399 )
							if( ma75 <= 112.675 )
								if( ma45 <= 111.788 )
									ret := -0.324324
								if( ma45 > 111.788 )
									ret := 0.166667
							if( ma75 > 112.675 )
								if( ma30 <= 112.898 )
									ret := -1.000000 // sell
								if( ma30 > 112.898 )
									ret := -0.666667
						if( ma10 > 113.399 )
							if( ma25 <= 125.304 )
								if( ma30 <= 122.58 )
									ret := -0.099585
								if( ma30 > 122.58 )
									ret := 0.175926
							if( ma25 > 125.304 )
								if( ma30 <= 125.709 )
									ret := -0.900000 // sell
								if( ma30 > 125.709 )
									ret := -0.216685
					if( ma90 > 160.88 )
						if( ma05 <= 163.027 )
							if( ma90 <= 161.89 )
								if( ma70 <= 161.69 )
									ret := 0.384615
								if( ma70 > 161.69 )
									ret := 0.000000
							if( ma90 > 161.89 )
								if( ma65 <= 162.883 )
									ret := 1.000000 // buy
								if( ma65 > 162.883 )
									ret := 0.250000
						if( ma05 > 163.027 )
							if( ma60 <= 164.507 )
								if( ma90 <= 164.12 )
									ret := 0.125000
								if( ma90 > 164.12 )
									ret := 0.000000
							if( ma60 > 164.507 )
								if( ma10 <= 164.545 )
									ret := -0.857143 // sell
								if( ma10 > 164.545 )
									ret := 0.125000
	
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
float op_operation = decision_tree_0_SNOW_1Min_23f68818(ma05, ma50_colorInt, ma90, ma35_colorInt, ma90_colorInt, ma55_colorInt, ma20, ma15_colorInt, ma40_colorInt, ma45_colorInt, ma65_colorInt, ma75_colorInt, ma35, ma30, ma60, ma75, ma05_colorInt, ma45, ma40, ma30_colorInt, ma25, ma100, ma50, ma70_colorInt, ma10_colorInt, ma20_colorInt, ma60_colorInt, ma25_colorInt, ma10, ma15, ma80, ma65, ma85_colorInt, ma55, ma70, ma85, ma80_colorInt)

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


