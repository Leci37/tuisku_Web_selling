//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Madrid_Moving_Average_Ribbon
// ID_model: NFLX_15Min_1MAD_1c5047fd Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NFLX_15Min_1MAD_1c5047fd", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NFLX_15Min_1c5047fd(ma15, ma70_colorInt, ma75_colorInt, ma70, ma40_colorInt, ma80_colorInt, ma20, ma20_colorInt, ma60, ma50, ma65_colorInt, ma45, ma55, ma05_colorInt, ma35_colorInt, ma10_colorInt, ma30, ma25_colorInt, ma100, ma65, ma85, ma80, ma60_colorInt, ma85_colorInt, ma90, ma90_colorInt, ma25, ma40, ma50_colorInt, ma35, ma30_colorInt, ma45_colorInt, ma05, ma75, ma55_colorInt, ma10, ma15_colorInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ma70 <= 291.013 )
		if( ma05 <= 276.549 )
			if( ma85 <= 271.728 )
				if( ma45 <= 116.829 )
					if( ma55_colorInt <= 3.5 )
						if( ma100 <= 116.906 )
							if( ma05_colorInt <= 3.5 )
								if( ma50 <= 116.715 )
									ret := 1.000000 // buy
								if( ma50 > 116.715 )
									ret := 0.777778 // buy
							if( ma05_colorInt > 3.5 )
								ret := 0.142857
						if( ma100 > 116.906 )
							ret := 1.000000 // buy
					if( ma55_colorInt > 3.5 )
						if( ma05 <= 116.863 )
							if( ma30 <= 116.668 )
								ret := 0.000000
							if( ma30 > 116.668 )
								ret := 1.000000 // buy
						if( ma05 > 116.863 )
							if( ma75 <= 116.834 )
								ret := -0.250000
							if( ma75 > 116.834 )
								ret := 0.000000
				if( ma45 > 116.829 )
					if( ma60 <= 249.066 )
						if( ma05 <= 226.403 )
							if( ma40 <= 215.736 )
								if( ma45 <= 197.27 )
									ret := 0.074873
								if( ma45 > 197.27 )
									ret := -0.037929
							if( ma40 > 215.736 )
								if( ma90_colorInt <= 1.5 )
									ret := 0.012915
								if( ma90_colorInt > 1.5 )
									ret := 0.321662
						if( ma05 > 226.403 )
							if( ma10 <= 228.669 )
								if( ma15 <= 225.58 )
									ret := 0.782609 // buy
								if( ma15 > 225.58 )
									ret := -0.345982
							if( ma10 > 228.669 )
								if( ma80 <= 247.903 )
									ret := 0.015385
								if( ma80 > 247.903 )
									ret := -0.750000 // sell
					if( ma60 > 249.066 )
						if( ma65 <= 258.18 )
							if( ma05 <= 273.958 )
								if( ma45 <= 255.582 )
									ret := 0.287554
								if( ma45 > 255.582 )
									ret := 0.594306
							if( ma05 > 273.958 )
								if( ma05 <= 274.596 )
									ret := -0.500000
								if( ma05 > 274.596 )
									ret := -1.000000 // sell
						if( ma65 > 258.18 )
							if( ma90_colorInt <= 2.5 )
								if( ma25 <= 263.511 )
									ret := 0.576923
								if( ma25 > 263.511 )
									ret := 0.147281
							if( ma90_colorInt > 2.5 )
								if( ma15 <= 272.07 )
									ret := 0.020918
								if( ma15 > 272.07 )
									ret := -0.704918 // sell
			if( ma85 > 271.728 )
				if( ma75 <= 281.778 )
					if( ma100 <= 280.611 )
						if( ma45 <= 270.624 )
							if( ma10 <= 264.537 )
								if( ma80 <= 271.191 )
									ret := -0.750000 // sell
								if( ma80 > 271.191 )
									ret := 0.857143 // buy
							if( ma10 > 264.537 )
								if( ma60 <= 270.533 )
									ret := -0.384615
								if( ma60 > 270.533 )
									ret := -0.835616 // sell
						if( ma45 > 270.624 )
							if( ma05 <= 269.355 )
								if( ma45 <= 271.433 )
									ret := 0.693878
								if( ma45 > 271.433 )
									ret := 0.037975
							if( ma05 > 269.355 )
								if( ma25_colorInt <= 3.5 )
									ret := -0.358025
								if( ma25_colorInt > 3.5 )
									ret := 0.098592
					if( ma100 > 280.611 )
						if( ma70 <= 278.177 )
							if( ma45 <= 254.559 )
								ret := 1.000000 // buy
							if( ma45 > 254.559 )
								if( ma25 <= 243.527 )
									ret := -1.000000 // sell
								if( ma25 > 243.527 )
									ret := -0.500000
						if( ma70 > 278.177 )
							if( ma10 <= 270.834 )
								if( ma05_colorInt <= 3.5 )
									ret := 0.969697 // buy
								if( ma05_colorInt > 3.5 )
									ret := 0.428571
							if( ma10 > 270.834 )
								if( ma15 <= 273.501 )
									ret := 0.000000
								if( ma15 > 273.501 )
									ret := 0.687500
				if( ma75 > 281.778 )
					if( ma15 <= 276.292 )
						if( ma05_colorInt <= 3.5 )
							if( ma85 <= 282.606 )
								ret := -0.600000
							if( ma85 > 282.606 )
								if( ma20 <= 275.521 )
									ret := -0.842105 // sell
								if( ma20 > 275.521 )
									ret := -0.979167 // sell
						if( ma05_colorInt > 3.5 )
							ret := -0.142857
					if( ma15 > 276.292 )
						if( ma05 <= 276.067 )
							if( ma05 <= 274.513 )
								if( ma90 <= 284.827 )
									ret := -0.500000
								if( ma90 > 284.827 )
									ret := -1.000000 // sell
							if( ma05 > 274.513 )
								if( ma20 <= 279.711 )
									ret := 0.160000
								if( ma20 > 279.711 )
									ret := -0.700000 // sell
						if( ma05 > 276.067 )
							ret := -1.000000 // sell
		if( ma05 > 276.549 )
			if( ma25 <= 280.23 )
				if( ma15 <= 278.438 )
					if( ma90 <= 270.657 )
						if( ma15 <= 277.277 )
							if( ma85 <= 269.435 )
								if( ma15 <= 275.337 )
									ret := 0.142857
								if( ma15 > 275.337 )
									ret := -0.250000
							if( ma85 > 269.435 )
								if( ma20 <= 274.342 )
									ret := 0.444444
								if( ma20 > 274.342 )
									ret := 0.846154 // buy
						if( ma15 > 277.277 )
							ret := -0.400000
					if( ma90 > 270.657 )
						if( ma60 <= 273.889 )
							if( ma05 <= 280.523 )
								if( ma15 <= 277.068 )
									ret := 0.096774
								if( ma15 > 277.068 )
									ret := -0.631579
							if( ma05 > 280.523 )
								ret := 1.000000 // buy
						if( ma60 > 273.889 )
							if( ma65 <= 277.61 )
								if( ma25 <= 277.118 )
									ret := 0.555556
								if( ma25 > 277.118 )
									ret := 1.000000 // buy
							if( ma65 > 277.61 )
								if( ma45 <= 277.502 )
									ret := -0.736842 // sell
								if( ma45 > 277.502 )
									ret := 0.275510
				if( ma15 > 278.438 )
					if( ma05 <= 278.738 )
						if( ma60 <= 278.056 )
							if( ma10_colorInt <= 1.5 )
								ret := -1.000000 // sell
							if( ma10_colorInt > 1.5 )
								ret := 0.000000
						if( ma60 > 278.056 )
							if( ma90 <= 277.767 )
								ret := 1.000000 // buy
							if( ma90 > 277.767 )
								if( ma55 <= 281.099 )
									ret := -0.103448
								if( ma55 > 281.099 )
									ret := 1.000000 // buy
					if( ma05 > 278.738 )
						if( ma25 <= 279.676 )
							if( ma90 <= 279.978 )
								if( ma70_colorInt <= 2.5 )
									ret := 0.705426 // buy
								if( ma70_colorInt > 2.5 )
									ret := 0.076923
							if( ma90 > 279.978 )
								ret := 1.000000 // buy
						if( ma25 > 279.676 )
							if( ma100 <= 281.673 )
								if( ma40 <= 278.277 )
									ret := 0.833333 // buy
								if( ma40 > 278.277 )
									ret := 0.061224
							if( ma100 > 281.673 )
								if( ma05 <= 279.865 )
									ret := 1.000000 // buy
								if( ma05 > 279.865 )
									ret := 0.400000
			if( ma25 > 280.23 )
				if( ma35 <= 293.401 )
					if( ma65 <= 280.409 )
						if( ma10 <= 283.821 )
							if( ma05 <= 283.925 )
								if( ma20 <= 281.348 )
									ret := -0.144231
								if( ma20 > 281.348 )
									ret := -0.635294
							if( ma05 > 283.925 )
								if( ma60 <= 276.911 )
									ret := 1.000000 // buy
								if( ma60 > 276.911 )
									ret := 0.050000
						if( ma10 > 283.821 )
							if( ma85 <= 275.886 )
								if( ma55 <= 276.712 )
									ret := 0.250000
								if( ma55 > 276.712 )
									ret := 0.960000 // buy
							if( ma85 > 275.886 )
								if( ma40 <= 280.498 )
									ret := -0.666667
								if( ma40 > 280.498 )
									ret := 0.187500
					if( ma65 > 280.409 )
						if( ma45 <= 281.68 )
							if( ma90 <= 280.152 )
								if( ma05 <= 280.141 )
									ret := 0.761905 // buy
								if( ma05 > 280.141 )
									ret := -0.459459
							if( ma90 > 280.152 )
								if( ma30 <= 280.583 )
									ret := -0.035714
								if( ma30 > 280.583 )
									ret := 0.666667
						if( ma45 > 281.68 )
							if( ma40 <= 283.347 )
								if( ma05 <= 285.875 )
									ret := -0.313808
								if( ma05 > 285.875 )
									ret := 0.500000
							if( ma40 > 283.347 )
								if( ma35 <= 284.473 )
									ret := 0.420000
								if( ma35 > 284.473 )
									ret := 0.110799
				if( ma35 > 293.401 )
					if( ma40 <= 294.709 )
						if( ma45 <= 292.598 )
							if( ma50 <= 291.688 )
								if( ma45 <= 291.962 )
									ret := 0.750000 // buy
								if( ma45 > 291.962 )
									ret := 1.000000 // buy
							if( ma50 > 291.688 )
								ret := 0.000000
						if( ma45 > 292.598 )
							if( ma25 <= 297.904 )
								if( ma90 <= 289.74 )
									ret := 1.000000 // buy
								if( ma90 > 289.74 )
									ret := 0.857143 // buy
							if( ma25 > 297.904 )
								ret := 0.750000 // buy
					if( ma40 > 294.709 )
						ret := 0.000000
	if( ma70 > 291.013 )
		if( ma60 <= 293.342 )
			if( ma05 <= 291.656 )
				if( ma65 <= 290.925 )
					if( ma15 <= 286.789 )
						if( ma85 <= 294.832 )
							ret := 0.250000
						if( ma85 > 294.832 )
							ret := -1.000000 // sell
					if( ma15 > 286.789 )
						if( ma35 <= 289.252 )
							ret := -1.000000 // sell
						if( ma35 > 289.252 )
							ret := -0.500000
				if( ma65 > 290.925 )
					if( ma50 <= 290.668 )
						if( ma60 <= 290.56 )
							ret := -0.857143 // sell
						if( ma60 > 290.56 )
							if( ma35_colorInt <= 3.5 )
								if( ma90 <= 292.563 )
									ret := 0.636364
								if( ma90 > 292.563 )
									ret := 0.914286 // buy
							if( ma35_colorInt > 3.5 )
								if( ma80 <= 292.87 )
									ret := -0.500000
								if( ma80 > 292.87 )
									ret := 0.250000
					if( ma50 > 290.668 )
						if( ma20 <= 290.093 )
							if( ma50 <= 291.18 )
								if( ma25 <= 289.587 )
									ret := 0.371429
								if( ma25 > 289.587 )
									ret := -0.500000
							if( ma50 > 291.18 )
								if( ma25 <= 290.002 )
									ret := -0.833333 // sell
								if( ma25 > 290.002 )
									ret := -0.222222
						if( ma20 > 290.093 )
							if( ma05 <= 288.678 )
								if( ma100 <= 291.631 )
									ret := 0.961538 // buy
								if( ma100 > 291.631 )
									ret := 0.363636
							if( ma05 > 288.678 )
								if( ma85 <= 292.381 )
									ret := -0.068826
								if( ma85 > 292.381 )
									ret := 0.345946
			if( ma05 > 291.656 )
				if( ma10 <= 291.776 )
					if( ma55_colorInt <= 2.5 )
						ret := 0.000000
					if( ma55_colorInt > 2.5 )
						if( ma05_colorInt <= 2 )
							ret := -0.285714
						if( ma05_colorInt > 2 )
							if( ma100 <= 291.917 )
								ret := -0.500000
							if( ma100 > 291.917 )
								if( ma80 <= 293.9 )
									ret := -0.980000 // sell
								if( ma80 > 293.9 )
									ret := -0.600000
				if( ma10 > 291.776 )
					if( ma10 <= 292.645 )
						if( ma20 <= 292.907 )
							if( ma35_colorInt <= 1.5 )
								if( ma90 <= 291.335 )
									ret := 0.652174
								if( ma90 > 291.335 )
									ret := 0.210526
							if( ma35_colorInt > 1.5 )
								if( ma45 <= 292.278 )
									ret := -0.714286 // sell
								if( ma45 > 292.278 )
									ret := 0.146341
						if( ma20 > 292.907 )
							if( ma55 <= 293.075 )
								if( ma75 <= 292.56 )
									ret := 0.750000 // buy
								if( ma75 > 292.56 )
									ret := 1.000000 // buy
							if( ma55 > 293.075 )
								ret := 0.142857
					if( ma10 > 292.645 )
						if( ma35 <= 293.969 )
							if( ma20 <= 293.889 )
								if( ma20 <= 292.657 )
									ret := 0.060606
								if( ma20 > 292.657 )
									ret := -0.553571
							if( ma20 > 293.889 )
								if( ma20 <= 294.269 )
									ret := 0.298507
								if( ma20 > 294.269 )
									ret := -0.163636
						if( ma35 > 293.969 )
							if( ma60 <= 293.157 )
								if( ma40_colorInt <= 1.5 )
									ret := -0.818182 // sell
								if( ma40_colorInt > 1.5 )
									ret := 0.000000
							if( ma60 > 293.157 )
								if( ma65 <= 293.124 )
									ret := 0.111111
								if( ma65 > 293.124 )
									ret := -1.000000 // sell
		if( ma60 > 293.342 )
			if( ma05_colorInt <= 3.5 )
				if( ma25_colorInt <= 1.5 )
					if( ma10 <= 305.911 )
						if( ma40 <= 299.982 )
							if( ma60 <= 296.484 )
								if( ma35 <= 295.82 )
									ret := -0.101266
								if( ma35 > 295.82 )
									ret := 0.456410
							if( ma60 > 296.484 )
								if( ma100 <= 296.278 )
									ret := -0.518519
								if( ma100 > 296.278 )
									ret := -0.127119
						if( ma40 > 299.982 )
							if( ma10_colorInt <= 1.5 )
								if( ma05_colorInt <= 1.5 )
									ret := 0.617647
								if( ma05_colorInt > 1.5 )
									ret := -0.242424
							if( ma10_colorInt > 1.5 )
								if( ma85 <= 302.366 )
									ret := -0.162162
								if( ma85 > 302.366 )
									ret := 0.333333
					if( ma10 > 305.911 )
						if( ma05 <= 696.127 )
							if( ma80 <= 656.795 )
								if( ma100 <= 652.12 )
									ret := 0.012699
								if( ma100 > 652.12 )
									ret := -0.527273
							if( ma80 > 656.795 )
								if( ma40 <= 664.802 )
									ret := 0.570175
								if( ma40 > 664.802 )
									ret := 0.112936
						if( ma05 > 696.127 )
							if( ma50 <= 697.689 )
								if( ma90 <= 690.254 )
									ret := -0.062500
								if( ma90 > 690.254 )
									ret := -0.611570
							if( ma50 > 697.689 )
								if( ma20 <= 701.592 )
									ret := 0.612903
								if( ma20 > 701.592 )
									ret := -0.128289
				if( ma25_colorInt > 1.5 )
					if( ma10 <= 294.031 )
						if( ma35 <= 292.662 )
							if( ma100 <= 294.121 )
								ret := 0.833333 // buy
							if( ma100 > 294.121 )
								if( ma20 <= 288.869 )
									ret := -0.235294
								if( ma20 > 288.869 )
									ret := -0.766667 // sell
						if( ma35 > 292.662 )
							if( ma15 <= 291.321 )
								if( ma50 <= 298.804 )
									ret := -0.565217
								if( ma50 > 298.804 )
									ret := 0.700000 // buy
							if( ma15 > 291.321 )
								if( ma25 <= 295.153 )
									ret := 0.558704
								if( ma25 > 295.153 )
									ret := 0.000000
					if( ma10 > 294.031 )
						if( ma35 <= 298.138 )
							if( ma65 <= 300.009 )
								if( ma05 <= 295.723 )
									ret := 0.056548
								if( ma05 > 295.723 )
									ret := -0.289062
							if( ma65 > 300.009 )
								if( ma05 <= 294.863 )
									ret := -0.500000
								if( ma05 > 294.863 )
									ret := -1.000000 // sell
						if( ma35 > 298.138 )
							if( ma100 <= 301.489 )
								if( ma70_colorInt <= 3.5 )
									ret := 0.400794
								if( ma70_colorInt > 3.5 )
									ret := 0.973684 // buy
							if( ma100 > 301.489 )
								if( ma75 <= 301.512 )
									ret := -0.794872 // sell
								if( ma75 > 301.512 )
									ret := 0.066583
			if( ma05_colorInt > 3.5 )
				if( ma60 <= 301.508 )
					if( ma50 <= 298.82 )
						if( ma45 <= 297.728 )
							if( ma05 <= 296.191 )
								if( ma100 <= 295.85 )
									ret := -0.289256
								if( ma100 > 295.85 )
									ret := 0.056338
							if( ma05 > 296.191 )
								if( ma35_colorInt <= 3.5 )
									ret := 0.111111
								if( ma35_colorInt > 3.5 )
									ret := -0.687500
						if( ma45 > 297.728 )
							if( ma20 <= 297.123 )
								if( ma15_colorInt <= 3.5 )
									ret := 0.937500 // buy
								if( ma15_colorInt > 3.5 )
									ret := 0.500000
							if( ma20 > 297.123 )
								if( ma05 <= 298.661 )
									ret := -0.238095
								if( ma05 > 298.661 )
									ret := 1.000000 // buy
					if( ma50 > 298.82 )
						if( ma70 <= 299.888 )
							ret := -1.000000 // sell
						if( ma70 > 299.888 )
							if( ma85 <= 301.003 )
								if( ma15 <= 298.166 )
									ret := 0.000000
								if( ma15 > 298.166 )
									ret := -0.250000
							if( ma85 > 301.003 )
								if( ma15 <= 296.269 )
									ret := -0.375000
								if( ma15 > 296.269 )
									ret := -0.818182 // sell
				if( ma60 > 301.508 )
					if( ma80 <= 303.312 )
						if( ma70 <= 301.999 )
							ret := 0.000000
						if( ma70 > 301.999 )
							if( ma55 <= 302.029 )
								if( ma90 <= 302.83 )
									ret := 0.714286 // buy
								if( ma90 > 302.83 )
									ret := 1.000000 // buy
							if( ma55 > 302.029 )
								ret := 0.666667
					if( ma80 > 303.312 )
						if( ma30_colorInt <= 3.5 )
							if( ma45 <= 531.948 )
								if( ma20 <= 341.083 )
									ret := -0.028159
								if( ma20 > 341.083 )
									ret := 0.076959
							if( ma45 > 531.948 )
								if( ma40 <= 535.074 )
									ret := -0.562500
								if( ma40 > 535.074 )
									ret := -0.019380
						if( ma30_colorInt > 3.5 )
							if( ma40 <= 324.777 )
								if( ma90 <= 318.787 )
									ret := -0.141479
								if( ma90 > 318.787 )
									ret := 0.470175
							if( ma40 > 324.777 )
								if( ma85 <= 638.27 )
									ret := -0.076223
								if( ma85 > 638.27 )
									ret := 0.100313
	
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
float op_operation = decision_tree_0_NFLX_15Min_1c5047fd(ma15, ma70_colorInt, ma75_colorInt, ma70, ma40_colorInt, ma80_colorInt, ma20, ma20_colorInt, ma60, ma50, ma65_colorInt, ma45, ma55, ma05_colorInt, ma35_colorInt, ma10_colorInt, ma30, ma25_colorInt, ma100, ma65, ma85, ma80, ma60_colorInt, ma85_colorInt, ma90, ma90_colorInt, ma25, ma40, ma50_colorInt, ma35, ma30_colorInt, ma45_colorInt, ma05, ma75, ma55_colorInt, ma10, ma15_colorInt)

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


