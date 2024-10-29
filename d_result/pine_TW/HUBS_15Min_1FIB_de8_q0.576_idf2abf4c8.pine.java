//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: HUBS_15Min_1FIB_f2abf4c8 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_HUBS_15Min_1FIB_f2abf4c8", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_HUBS_15Min_f2abf4c8(upper_2, basis, lower_6, basis_minus, lower_5, upper_5, upper_4, basis_max, upper_6, upper_3, lower_2, upper_1, lower_4, lower_1, lower_3)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( upper_5 <= 152.893 )
		if( basis_max <= -18.2094 )
			if( lower_2 <= 118.103 )
				if( basis_max <= -25.0479 )
					if( basis_minus <= 25.1231 )
						if( lower_2 <= 115.092 )
							ret := -1.000000 // sell
						if( lower_2 > 115.092 )
							if( lower_2 <= 115.336 )
								ret := 0.200000
							if( lower_2 > 115.336 )
								ret := -1.000000 // sell
					if( basis_minus > 25.1231 )
						if( upper_3 <= 132.242 )
							if( lower_5 <= 93.8363 )
								if( upper_1 <= 122.214 )
									ret := 0.952381 // buy
								if( upper_1 > 122.214 )
									ret := -0.540541
							if( lower_5 > 93.8363 )
								if( basis_max <= -26.7485 )
									ret := -1.000000 // sell
								if( basis_max > -26.7485 )
									ret := -0.521739
						if( upper_3 > 132.242 )
							if( upper_3 <= 139.757 )
								if( basis_minus <= 25.2364 )
									ret := 0.212121
								if( basis_minus > 25.2364 )
									ret := 0.845238 // buy
							if( upper_3 > 139.757 )
								if( basis <= 127.481 )
									ret := -0.127273
								if( basis > 127.481 )
									ret := 0.804348 // buy
				if( basis_max > -25.0479 )
					if( upper_5 <= 136.486 )
						if( basis_max <= -18.5155 )
							if( upper_6 <= 140.782 )
								ret := 1.000000 // buy
							if( upper_6 > 140.782 )
								if( upper_4 <= 133.529 )
									ret := 0.750000 // buy
								if( upper_4 > 133.529 )
									ret := 1.000000 // buy
						if( basis_max > -18.5155 )
							ret := 0.500000
					if( upper_5 > 136.486 )
						if( upper_2 <= 130.461 )
							if( upper_3 <= 131.878 )
								if( lower_2 <= 114.342 )
									ret := 0.000000
								if( lower_2 > 114.342 )
									ret := 0.769231 // buy
							if( upper_3 > 131.878 )
								if( upper_3 <= 132.492 )
									ret := -0.460000
								if( upper_3 > 132.492 )
									ret := 0.230769
						if( upper_2 > 130.461 )
							if( lower_1 <= 119.147 )
								if( basis_max <= -20.8932 )
									ret := 0.780702 // buy
								if( basis_max > -20.8932 )
									ret := 0.960000 // buy
							if( lower_1 > 119.147 )
								if( lower_4 <= 111.4 )
									ret := -1.000000 // sell
								if( lower_4 > 111.4 )
									ret := 0.481928
			if( lower_2 > 118.103 )
				if( lower_1 <= 125.961 )
					if( upper_2 <= 138.186 )
						if( upper_5 <= 146.042 )
							if( lower_6 <= 109.777 )
								if( upper_6 <= 144.819 )
									ret := 0.600000
								if( upper_6 > 144.819 )
									ret := -0.557377
							if( lower_6 > 109.777 )
								if( lower_6 <= 109.818 )
									ret := 0.500000
								if( lower_6 > 109.818 )
									ret := -0.095238
						if( upper_5 > 146.042 )
							if( basis_max <= -23.6633 )
								ret := 0.400000
							if( basis_max > -23.6633 )
								ret := 0.800000 // buy
					if( upper_2 > 138.186 )
						if( lower_4 <= 113.17 )
							ret := 0.250000
						if( lower_4 > 113.17 )
							if( basis_minus <= 23.4255 )
								if( lower_3 <= 119.76 )
									ret := 0.285714
								if( lower_3 > 119.76 )
									ret := -0.647059
							if( basis_minus > 23.4255 )
								if( lower_5 <= 111.458 )
									ret := -0.846154 // sell
								if( lower_5 > 111.458 )
									ret := -1.000000 // sell
				if( lower_1 > 125.961 )
					if( lower_3 <= 122.407 )
						if( upper_1 <= 136.315 )
							if( lower_6 <= 110.296 )
								ret := 0.857143 // buy
							if( lower_6 > 110.296 )
								if( lower_6 <= 111.168 )
									ret := -0.314286
								if( lower_6 > 111.168 )
									ret := 0.230769
						if( upper_1 > 136.315 )
							if( lower_5 <= 116.072 )
								if( upper_4 <= 144.366 )
									ret := 0.333333
								if( upper_4 > 144.366 )
									ret := 0.937500 // buy
							if( lower_5 > 116.072 )
								if( lower_5 <= 116.693 )
									ret := 0.111111
								if( lower_5 > 116.693 )
									ret := 0.809524 // buy
					if( lower_3 > 122.407 )
						if( lower_5 <= 120.617 )
							if( upper_5 <= 150.04 )
								if( upper_2 <= 141.378 )
									ret := 0.064516
								if( upper_2 > 141.378 )
									ret := -0.342857
							if( upper_5 > 150.04 )
								if( lower_6 <= 111.833 )
									ret := -0.666667
								if( lower_6 > 111.833 )
									ret := -1.000000 // sell
						if( lower_5 > 120.617 )
							if( upper_2 <= 141.826 )
								ret := -0.500000
							if( upper_2 > 141.826 )
								if( upper_2 <= 142.076 )
									ret := 0.866667 // buy
								if( upper_2 > 142.076 )
									ret := 0.333333
		if( basis_max > -18.2094 )
			if( lower_3 <= 140.057 )
				if( basis_minus <= 2.01811 )
					if( lower_4 <= 46.0059 )
						if( lower_5 <= 45.7545 )
							if( upper_1 <= 47.5198 )
								ret := 0.000000
							if( upper_1 > 47.5198 )
								ret := -0.250000
						if( lower_5 > 45.7545 )
							ret := -0.500000
					if( lower_4 > 46.0059 )
						if( lower_2 <= 46.4116 )
							if( upper_4 <= 47.9762 )
								if( upper_1 <= 47.3368 )
									ret := 1.000000 // buy
								if( upper_1 > 47.3368 )
									ret := 0.125000
							if( upper_4 > 47.9762 )
								ret := 1.000000 // buy
						if( lower_2 > 46.4116 )
							if( lower_1 <= 46.6533 )
								if( upper_2 <= 47.6238 )
									ret := -0.750000 // sell
								if( upper_2 > 47.6238 )
									ret := -1.000000 // sell
							if( lower_1 > 46.6533 )
								if( lower_3 <= 69.0216 )
									ret := 0.653061
								if( lower_3 > 69.0216 )
									ret := 0.326241
				if( basis_minus > 2.01811 )
					if( basis_max <= -2.50371 )
						if( lower_3 <= 139.832 )
							if( lower_5 <= 132.095 )
								if( lower_5 <= 126.58 )
									ret := 0.081472
								if( lower_5 > 126.58 )
									ret := -0.087318
							if( lower_5 > 132.095 )
								if( basis_max <= -10.336 )
									ret := 0.779412 // buy
								if( basis_max > -10.336 )
									ret := 0.257732
						if( lower_3 > 139.832 )
							if( lower_3 <= 140.027 )
								if( lower_2 <= 140.539 )
									ret := 0.000000
								if( lower_2 > 140.539 )
									ret := -0.759259 // sell
							if( lower_3 > 140.027 )
								if( basis_max <= -7.71913 )
									ret := 0.750000 // buy
								if( basis_max > -7.71913 )
									ret := -0.400000
					if( basis_max > -2.50371 )
						if( lower_6 <= 78.5264 )
							if( lower_2 <= 71.6679 )
								if( lower_5 <= 45.3328 )
									ret := -0.666667
								if( lower_5 > 45.3328 )
									ret := -0.112766
							if( lower_2 > 71.6679 )
								if( upper_3 <= 73.6423 )
									ret := 1.000000 // buy
								if( upper_3 > 73.6423 )
									ret := 0.000000
						if( lower_6 > 78.5264 )
							if( upper_5 <= 84.4299 )
								ret := -1.000000 // sell
							if( upper_5 > 84.4299 )
								if( lower_4 <= 87.5089 )
									ret := -0.212121
								if( lower_4 > 87.5089 )
									ret := -0.857143 // sell
			if( lower_3 > 140.057 )
				if( basis <= 143.165 )
					if( basis_minus <= 4.70269 )
						if( upper_2 <= 143.969 )
							if( upper_6 <= 146.353 )
								if( upper_3 <= 144.33 )
									ret := 0.000000
								if( upper_3 > 144.33 )
									ret := 0.777778 // buy
							if( upper_6 > 146.353 )
								ret := 1.000000 // buy
						if( upper_2 > 143.969 )
							if( lower_5 <= 139.357 )
								if( basis_minus <= 4.32599 )
									ret := 0.714286 // buy
								if( basis_minus > 4.32599 )
									ret := 0.083333
							if( lower_5 > 139.357 )
								if( basis <= 142.448 )
									ret := -0.750000 // sell
								if( basis > 142.448 )
									ret := 0.066667
					if( basis_minus > 4.70269 )
						if( lower_5 <= 139.361 )
							ret := 1.000000 // buy
						if( lower_5 > 139.361 )
							if( lower_5 <= 139.405 )
								ret := 0.428571
							if( lower_5 > 139.405 )
								ret := 1.000000 // buy
				if( basis > 143.165 )
					if( upper_1 <= 149.098 )
						if( lower_6 <= 136.218 )
							if( lower_6 <= 135.535 )
								ret := 1.000000 // buy
							if( lower_6 > 135.535 )
								if( basis_max <= -9.59547 )
									ret := 0.428571
								if( basis_max > -9.59547 )
									ret := 0.875000 // buy
						if( lower_6 > 136.218 )
							if( lower_4 <= 142.041 )
								if( lower_5 <= 140.833 )
									ret := 0.142857
								if( lower_5 > 140.833 )
									ret := 1.000000 // buy
							if( lower_4 > 142.041 )
								if( lower_3 <= 143.008 )
									ret := -0.727273 // sell
								if( lower_3 > 143.008 )
									ret := 0.023810
					if( upper_1 > 149.098 )
						ret := 1.000000 // buy
	if( upper_5 > 152.893 )
		if( upper_3 <= 152.512 )
			if( upper_5 <= 155.981 )
				if( upper_4 <= 153.301 )
					if( upper_5 <= 154.499 )
						if( upper_5 <= 154.33 )
							if( upper_6 <= 164.356 )
								if( basis_minus <= 8.25147 )
									ret := 0.059603
								if( basis_minus > 8.25147 )
									ret := -0.382857
							if( upper_6 > 164.356 )
								if( basis_max <= -45.0193 )
									ret := 0.500000
								if( basis_max > -45.0193 )
									ret := 1.000000 // buy
						if( upper_5 > 154.33 )
							if( upper_6 <= 162.285 )
								if( lower_3 <= 130.925 )
									ret := 0.000000
								if( lower_3 > 130.925 )
									ret := -0.894737 // sell
							if( upper_6 > 162.285 )
								ret := -1.000000 // sell
					if( upper_5 > 154.499 )
						if( upper_6 <= 163.946 )
							if( upper_6 <= 161.541 )
								if( upper_4 <= 153.1 )
									ret := 0.304878
								if( upper_4 > 153.1 )
									ret := -0.200000
							if( upper_6 > 161.541 )
								if( upper_6 <= 163.884 )
									ret := -0.263158
								if( upper_6 > 163.884 )
									ret := -0.727273 // sell
						if( upper_6 > 163.946 )
							if( upper_2 <= 141.282 )
								if( lower_2 <= 107.87 )
									ret := 0.571429
								if( lower_2 > 107.87 )
									ret := -1.000000 // sell
							if( upper_2 > 141.282 )
								if( basis <= 128.625 )
									ret := 1.000000 // buy
								if( basis > 128.625 )
									ret := 0.250000
				if( upper_4 > 153.301 )
					if( upper_4 <= 153.931 )
						if( upper_4 <= 153.833 )
							if( upper_1 <= 150.026 )
								if( basis_max <= -13.8254 )
									ret := -0.750000 // sell
								if( basis_max > -13.8254 )
									ret := 0.272727
							if( upper_1 > 150.026 )
								ret := -1.000000 // sell
						if( upper_4 > 153.833 )
							if( upper_1 <= 149.039 )
								if( lower_6 <= 132.01 )
									ret := -0.888889 // sell
								if( lower_6 > 132.01 )
									ret := -0.500000
							if( upper_1 > 149.039 )
								ret := -1.000000 // sell
					if( upper_4 > 153.931 )
						ret := -0.142857
			if( upper_5 > 155.981 )
				if( upper_4 <= 153.009 )
					if( upper_5 <= 156.205 )
						if( lower_1 <= 117.438 )
							ret := -1.000000 // sell
						if( lower_1 > 117.438 )
							if( upper_6 <= 164.105 )
								if( upper_5 <= 156.118 )
									ret := -0.571429
								if( upper_5 > 156.118 )
									ret := -0.200000
							if( upper_6 > 164.105 )
								if( lower_4 <= 107.431 )
									ret := -0.200000
								if( lower_4 > 107.431 )
									ret := 0.428571
					if( upper_5 > 156.205 )
						if( upper_3 <= 148.52 )
							if( basis <= 130.281 )
								if( basis <= 124.455 )
									ret := -1.000000 // sell
								if( basis > 124.455 )
									ret := -0.694915
							if( basis > 130.281 )
								if( lower_1 <= 123.344 )
									ret := 0.266667
								if( lower_1 > 123.344 )
									ret := -0.714286 // sell
						if( upper_3 > 148.52 )
							if( lower_6 <= 97.8074 )
								ret := -0.750000 // sell
							if( lower_6 > 97.8074 )
								ret := -1.000000 // sell
				if( upper_4 > 153.009 )
					if( upper_4 <= 153.181 )
						if( lower_3 <= 116.07 )
							ret := -0.750000 // sell
						if( lower_3 > 116.07 )
							if( lower_1 <= 126.097 )
								ret := 1.000000 // buy
							if( lower_1 > 126.097 )
								if( lower_5 <= 110.108 )
									ret := 0.750000 // buy
								if( lower_5 > 110.108 )
									ret := 0.500000
					if( upper_4 > 153.181 )
						if( upper_3 <= 152.326 )
							if( upper_6 <= 171.793 )
								if( upper_5 <= 156.227 )
									ret := -0.700000 // sell
								if( upper_5 > 156.227 )
									ret := 0.000000
							if( upper_6 > 171.793 )
								ret := -1.000000 // sell
						if( upper_3 > 152.326 )
							if( basis_max <= -16.0196 )
								ret := 0.750000 // buy
							if( basis_max > -16.0196 )
								ret := 0.000000
		if( upper_3 > 152.512 )
			if( lower_5 <= 668.47 )
				if( lower_4 <= 667.01 )
					if( basis_max <= -26.3455 )
						if( lower_4 <= 188.349 )
							if( lower_6 <= 91.3965 )
								if( upper_2 <= 154.403 )
									ret := 0.000000
								if( upper_2 > 154.403 )
									ret := 0.906250 // buy
							if( lower_6 > 91.3965 )
								if( lower_6 <= 117.618 )
									ret := -0.497238
								if( lower_6 > 117.618 )
									ret := -0.119149
						if( lower_4 > 188.349 )
							if( lower_3 <= 267.666 )
								if( lower_1 <= 275.427 )
									ret := 0.125000
								if( lower_1 > 275.427 )
									ret := 0.498305
							if( lower_3 > 267.666 )
								if( lower_5 <= 259.462 )
									ret := -0.251599
								if( lower_5 > 259.462 )
									ret := 0.017910
					if( basis_max > -26.3455 )
						if( lower_3 <= 650.381 )
							if( upper_1 <= 150.799 )
								if( lower_6 <= 128.283 )
									ret := 0.937500 // buy
								if( lower_6 > 128.283 )
									ret := 0.372263
							if( upper_1 > 150.799 )
								if( lower_5 <= 181.969 )
									ret := 0.021196
								if( lower_5 > 181.969 )
									ret := 0.102845
						if( lower_3 > 650.381 )
							if( upper_4 <= 682.743 )
								ret := -1.000000 // sell
							if( upper_4 > 682.743 )
								if( basis_max <= -25.2043 )
									ret := -0.833333 // sell
								if( basis_max > -25.2043 )
									ret := 0.000000
				if( lower_4 > 667.01 )
					if( lower_6 <= 654.618 )
						if( lower_6 <= 631.874 )
							if( basis_max <= -144.578 )
								if( upper_2 <= 818.476 )
									ret := 0.500000
								if( upper_2 > 818.476 )
									ret := -0.066667
							if( basis_max > -144.578 )
								if( lower_2 <= 690.424 )
									ret := -0.250000
								if( lower_2 > 690.424 )
									ret := 0.661290
						if( lower_6 > 631.874 )
							if( lower_2 <= 682.786 )
								if( basis_max <= -51.4408 )
									ret := 1.000000 // buy
								if( basis_max > -51.4408 )
									ret := 0.210526
							if( lower_2 > 682.786 )
								if( basis_max <= -47.1021 )
									ret := -0.025641
								if( basis_max > -47.1021 )
									ret := -1.000000 // sell
					if( lower_6 > 654.618 )
						if( upper_2 <= 719.661 )
							if( upper_3 <= 724.789 )
								if( lower_6 <= 659.997 )
									ret := 0.318182
								if( lower_6 > 659.997 )
									ret := 0.840000 // buy
							if( upper_3 > 724.789 )
								if( lower_5 <= 668.358 )
									ret := 1.000000 // buy
								if( lower_5 > 668.358 )
									ret := 0.666667
						if( upper_2 > 719.661 )
							ret := 0.000000
			if( lower_5 > 668.47 )
				if( lower_6 <= 679.155 )
					if( upper_4 <= 858.554 )
						if( lower_3 <= 700.564 )
							if( upper_4 <= 792.831 )
								if( upper_4 <= 707.765 )
									ret := -0.280303
								if( upper_4 > 707.765 )
									ret := -0.736842 // sell
							if( upper_4 > 792.831 )
								if( lower_6 <= 654.829 )
									ret := 0.843750 // buy
								if( lower_6 > 654.829 )
									ret := -0.200000
						if( lower_3 > 700.564 )
							if( lower_3 <= 703.057 )
								if( lower_3 <= 701.544 )
									ret := -1.000000 // sell
								if( lower_3 > 701.544 )
									ret := -0.833333 // sell
							if( lower_3 > 703.057 )
								if( upper_4 <= 853.755 )
									ret := 0.037037
								if( upper_4 > 853.755 )
									ret := -0.953488 // sell
					if( upper_4 > 858.554 )
						if( lower_1 <= 745.115 )
							ret := 0.250000
						if( lower_1 > 745.115 )
							ret := 1.000000 // buy
				if( lower_6 > 679.155 )
					if( upper_2 <= 842.984 )
						if( upper_3 <= 818.492 )
							if( upper_6 <= 823.219 )
								if( lower_2 <= 787.76 )
									ret := -0.132353
								if( lower_2 > 787.76 )
									ret := 0.310811
							if( upper_6 > 823.219 )
								if( upper_1 <= 808.198 )
									ret := -0.651163
								if( upper_1 > 808.198 )
									ret := -0.060976
						if( upper_3 > 818.492 )
							if( lower_4 <= 757.717 )
								if( lower_5 <= 726.699 )
									ret := 0.304147
								if( lower_5 > 726.699 )
									ret := -0.850000 // sell
							if( lower_4 > 757.717 )
								if( upper_6 <= 878.324 )
									ret := 0.259434
								if( upper_6 > 878.324 )
									ret := 0.632184
					if( upper_2 > 842.984 )
						if( upper_4 <= 869.202 )
							if( lower_1 <= 820.89 )
								if( upper_1 <= 828.477 )
									ret := 0.000000
								if( upper_1 > 828.477 )
									ret := -0.838235 // sell
							if( lower_1 > 820.89 )
								if( lower_3 <= 818.831 )
									ret := 0.000000
								if( lower_3 > 818.831 )
									ret := -0.928571 // sell
						if( upper_4 > 869.202 )
							if( lower_6 <= 709.646 )
								ret := 1.000000 // buy
							if( lower_6 > 709.646 )
								if( upper_6 <= 906.364 )
									ret := 0.750000 // buy
								if( upper_6 > 906.364 )
									ret := 0.000000
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Fibonacci_Bollinger 
//@version=5
//indicator shorttitle="FBB", title="Fibonacci Bollinger Bands", overlay=true)

// Inputs
length_FiboBB = input.int(200, minval=1)
src = input(hlc3, title="Source")
mult = input.float(3.0, minval=0.001, maxval=50)

// Calculations
basis = ta.vwma(src, length_FiboBB)
dev = mult * ta.stdev(src, length_FiboBB)

// Upper Bands
upper_1 = basis + (0.236 * dev)
upper_2 = basis + (0.382 * dev)
upper_3 = basis + (0.5 * dev)
upper_4 = basis + (0.618 * dev)
upper_5 = basis + (0.764 * dev)
upper_6 = basis + (1 * dev)

// Lower Bands
lower_1 = basis - (0.236 * dev)
lower_2 = basis - (0.382 * dev)
lower_3 = basis - (0.5 * dev)
lower_4 = basis - (0.618 * dev)
lower_5 = basis - (0.764 * dev)
lower_6 = basis - (1 * dev)

basis_minus = basis -lower_6
basis_max = basis -upper_6

// Plotting
plot(basis, color=color.fuchsia, linewidth=2)
plot(upper_1, color=color.white, linewidth=1, title="0.236")
plot(upper_2, color=color.white, linewidth=1, title="0.382")
plot(upper_3, color=color.white, linewidth=1, title="0.5")
plot(upper_4, color=color.white, linewidth=1, title="0.618")
plot(upper_5, color=color.white, linewidth=1, title="0.764")
plot(upper_6, color=color.red, linewidth=2, title="1")
plot(lower_1, color=color.white, linewidth=1, title="0.236")
plot(lower_2, color=color.white, linewidth=1, title="0.382")
plot(lower_3, color=color.white, linewidth=1, title="0.5")
plot(lower_4, color=color.white, linewidth=1, title="0.618")
plot(lower_5, color=color.white, linewidth=1, title="0.764")
plot(lower_6, color=color.green, linewidth=2, title="1")

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
float op_operation = decision_tree_0_HUBS_15Min_f2abf4c8(upper_2, basis, lower_6, basis_minus, lower_5, upper_5, upper_4, basis_max, upper_6, upper_3, lower_2, upper_1, lower_4, lower_1, lower_3)

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


