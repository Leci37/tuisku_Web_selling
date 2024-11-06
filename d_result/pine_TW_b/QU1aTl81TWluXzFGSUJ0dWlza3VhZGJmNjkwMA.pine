//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: AMZN_5Min_1FIB_adbf6900 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMZN_5Min_1FIB_adbf6900", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMZN_5Min_adbf6900(basis_max, upper_1, lower_2, upper_2, lower_3, lower_6, basis_minus, lower_4, upper_4, upper_5, basis, upper_3, lower_5, upper_6, lower_1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( upper_6 <= 130.061 )
		if( lower_4 <= 126.415 )
			if( lower_5 <= 125.463 )
				if( basis_minus <= 3.16722 )
					if( basis_minus <= 2.82232 )
						if( upper_6 <= 105.145 )
							if( lower_4 <= 101.327 )
								if( upper_2 <= 103.398 )
									ret := -0.545455
								if( upper_2 > 103.398 )
									ret := 0.461538
							if( lower_4 > 101.327 )
								if( basis_max <= -0.745132 )
									ret := 0.802198 // buy
								if( basis_max > -0.745132 )
									ret := 0.000000
						if( upper_6 > 105.145 )
							if( lower_6 <= 103.306 )
								if( lower_6 <= 102.863 )
									ret := 0.070270
								if( lower_6 > 102.863 )
									ret := -0.340426
							if( lower_6 > 103.306 )
								if( upper_6 <= 129.706 )
									ret := 0.146108
								if( upper_6 > 129.706 )
									ret := -0.384615
					if( basis_minus > 2.82232 )
						if( upper_5 <= 106.964 )
							if( basis_minus <= 2.92201 )
								ret := 0.000000
							if( basis_minus > 2.92201 )
								if( lower_3 <= 102.704 )
									ret := 0.750000 // buy
								if( lower_3 > 102.704 )
									ret := 1.000000 // buy
						if( upper_5 > 106.964 )
							if( upper_2 <= 106.976 )
								if( lower_1 <= 104.852 )
									ret := 0.386364
								if( lower_1 > 104.852 )
									ret := -0.838710 // sell
							if( upper_2 > 106.976 )
								if( upper_1 <= 107.066 )
									ret := 1.000000 // buy
								if( upper_1 > 107.066 )
									ret := 0.280822
				if( basis_minus > 3.16722 )
					if( basis_max <= -4.01036 )
						if( upper_5 <= 124.878 )
							if( lower_2 <= 108.042 )
								if( basis_max <= -10.8101 )
									ret := -0.814815 // sell
								if( basis_max > -10.8101 )
									ret := 0.246964
							if( lower_2 > 108.042 )
								if( basis_max <= -6.24795 )
									ret := -0.534161
								if( basis_max > -6.24795 )
									ret := 0.024000
						if( upper_5 > 124.878 )
							if( lower_5 <= 119.667 )
								if( upper_5 <= 125.441 )
									ret := 0.830986 // buy
								if( upper_5 > 125.441 )
									ret := 0.428571
							if( lower_5 > 119.667 )
								if( basis_minus <= 4.79321 )
									ret := 0.243243
								if( basis_minus > 4.79321 )
									ret := -0.871795 // sell
					if( basis_max > -4.01036 )
						if( lower_1 <= 104.999 )
							if( basis <= 102.939 )
								ret := 1.000000 // buy
							if( basis > 102.939 )
								if( basis_max <= -3.44597 )
									ret := -0.337884
								if( basis_max > -3.44597 )
									ret := -0.878788 // sell
						if( lower_1 > 104.999 )
							if( upper_6 <= 129.295 )
								if( lower_1 <= 121.718 )
									ret := -0.023033
								if( lower_1 > 121.718 )
									ret := 0.325581
							if( upper_6 > 129.295 )
								if( upper_6 <= 129.536 )
									ret := -0.650000
								if( upper_6 > 129.536 )
									ret := -0.066298
			if( lower_5 > 125.463 )
				if( lower_4 <= 125.866 )
					if( basis <= 126.615 )
						if( lower_6 <= 125.198 )
							if( lower_5 <= 125.468 )
								ret := -0.750000 // sell
							if( lower_5 > 125.468 )
								if( lower_5 <= 125.482 )
									ret := 0.000000
								if( lower_5 > 125.482 )
									ret := 0.250000
						if( lower_6 > 125.198 )
							if( upper_2 <= 126.868 )
								if( upper_6 <= 127.517 )
									ret := -0.818182 // sell
								if( upper_6 > 127.517 )
									ret := 0.444444
							if( upper_2 > 126.868 )
								if( basis <= 126.421 )
									ret := -0.500000
								if( basis > 126.421 )
									ret := -0.957143 // sell
					if( basis > 126.615 )
						if( upper_6 <= 127.974 )
							ret := 0.250000
						if( upper_6 > 127.974 )
							ret := -0.200000
				if( lower_4 > 125.866 )
					if( lower_6 <= 125.518 )
						if( lower_6 <= 125.25 )
							if( lower_3 <= 126.16 )
								ret := -0.833333 // sell
							if( lower_3 > 126.16 )
								if( lower_4 <= 125.991 )
									ret := 0.000000
								if( lower_4 > 125.991 )
									ret := -0.750000 // sell
						if( lower_6 > 125.25 )
							if( lower_5 <= 125.832 )
								if( upper_3 <= 128.388 )
									ret := 0.758621 // buy
								if( upper_3 > 128.388 )
									ret := 0.166667
							if( lower_5 > 125.832 )
								if( basis <= 127.348 )
									ret := -1.000000 // sell
								if( basis > 127.348 )
									ret := 0.440000
					if( lower_6 > 125.518 )
						if( lower_3 <= 126.538 )
							if( upper_4 <= 127.393 )
								if( upper_1 <= 126.67 )
									ret := -0.818182 // sell
								if( upper_1 > 126.67 )
									ret := 0.066667
							if( upper_4 > 127.393 )
								if( lower_5 <= 125.849 )
									ret := -0.684211
								if( lower_5 > 125.849 )
									ret := -0.920000 // sell
						if( lower_3 > 126.538 )
							if( lower_3 <= 126.627 )
								if( upper_3 <= 128.594 )
									ret := 0.105263
								if( upper_3 > 128.594 )
									ret := 0.888889 // buy
							if( lower_3 > 126.627 )
								if( lower_3 <= 126.64 )
									ret := -0.923077 // sell
								if( lower_3 > 126.64 )
									ret := -0.222222
		if( lower_4 > 126.415 )
			if( upper_1 <= 129.138 )
				if( upper_6 <= 129.73 )
					if( basis <= 127.558 )
						if( upper_3 <= 128.434 )
							if( upper_5 <= 128.537 )
								ret := 0.285714
							if( upper_5 > 128.537 )
								if( lower_6 <= 125.847 )
									ret := 0.977778 // buy
								if( lower_6 > 125.847 )
									ret := 0.757576 // buy
						if( upper_3 > 128.434 )
							ret := 0.000000
					if( basis > 127.558 )
						if( upper_5 <= 128.827 )
							if( upper_4 <= 128.58 )
								if( basis_max <= -1.64348 )
									ret := 0.000000
								if( basis_max > -1.64348 )
									ret := -0.571429
							if( upper_4 > 128.58 )
								if( basis <= 127.56 )
									ret := -0.333333
								if( basis > 127.56 )
									ret := -0.800000 // sell
						if( upper_5 > 128.827 )
							if( upper_5 <= 129.183 )
								if( lower_1 <= 127.165 )
									ret := -0.133333
								if( lower_1 > 127.165 )
									ret := 0.724771 // buy
							if( upper_5 > 129.183 )
								if( lower_3 <= 127.845 )
									ret := -0.492958
								if( lower_3 > 127.845 )
									ret := 0.765957 // buy
				if( upper_6 > 129.73 )
					if( basis_minus <= 2.16971 )
						if( basis_max <= -1.38702 )
							if( basis_max <= -1.77545 )
								if( upper_5 <= 129.454 )
									ret := 0.740000 // buy
								if( upper_5 > 129.454 )
									ret := 0.090909
							if( basis_max > -1.77545 )
								if( upper_5 <= 129.593 )
									ret := 0.753623 // buy
								if( upper_5 > 129.593 )
									ret := 0.959184 // buy
						if( basis_max > -1.38702 )
							if( lower_5 <= 127.459 )
								if( upper_1 <= 128.771 )
									ret := -0.750000 // sell
								if( upper_1 > 128.771 )
									ret := 0.000000
							if( lower_5 > 127.459 )
								if( upper_2 <= 129.148 )
									ret := 0.714286 // buy
								if( upper_2 > 129.148 )
									ret := 0.000000
					if( basis_minus > 2.16971 )
						ret := -0.333333
			if( upper_1 > 129.138 )
				if( lower_6 <= 128.319 )
					if( lower_3 <= 128.653 )
						if( upper_5 <= 129.557 )
							if( lower_4 <= 128.566 )
								if( lower_5 <= 128.459 )
									ret := -0.333333
								if( lower_5 > 128.459 )
									ret := 0.555556
							if( lower_4 > 128.566 )
								if( lower_6 <= 128.314 )
									ret := -1.000000 // sell
								if( lower_6 > 128.314 )
									ret := -0.285714
						if( upper_5 > 129.557 )
							if( upper_2 <= 129.304 )
								ret := -1.000000 // sell
							if( upper_2 > 129.304 )
								ret := -0.500000
					if( lower_3 > 128.653 )
						if( lower_3 <= 128.661 )
							if( upper_4 <= 129.467 )
								ret := 0.500000
							if( upper_4 > 129.467 )
								if( lower_6 <= 128.281 )
									ret := 0.125000
								if( lower_6 > 128.281 )
									ret := -0.500000
						if( lower_3 > 128.661 )
							if( upper_2 <= 129.358 )
								ret := 0.833333 // buy
							if( upper_2 > 129.358 )
								ret := 0.000000
				if( lower_6 > 128.319 )
					if( upper_6 <= 129.664 )
						ret := -0.750000 // sell
					if( upper_6 > 129.664 )
						ret := -1.000000 // sell
	if( upper_6 > 130.061 )
		if( upper_2 <= 187.252 )
			if( upper_3 <= 182.651 )
				if( upper_6 <= 183.4 )
					if( lower_1 <= 118.621 )
						ret := -1.000000 // sell
					if( lower_1 > 118.621 )
						if( lower_6 <= 136.379 )
							if( upper_5 <= 135.987 )
								if( lower_4 <= 131.221 )
									ret := 0.001375
								if( lower_4 > 131.221 )
									ret := 0.172840
							if( upper_5 > 135.987 )
								if( upper_3 <= 136.265 )
									ret := -0.279616
								if( upper_3 > 136.265 )
									ret := -0.033606
						if( lower_6 > 136.379 )
							if( lower_6 <= 172.272 )
								if( lower_5 <= 172.904 )
									ret := 0.064128
								if( lower_5 > 172.904 )
									ret := 0.375921
							if( lower_6 > 172.272 )
								if( basis_minus <= 1.09208 )
									ret := 0.576000
								if( basis_minus > 1.09208 )
									ret := -0.009213
				if( upper_6 > 183.4 )
					if( lower_6 <= 168.175 )
						if( lower_1 <= 170.216 )
							if( upper_2 <= 176.925 )
								if( upper_3 <= 178.186 )
									ret := -0.400000
								if( upper_3 > 178.186 )
									ret := 0.967742 // buy
							if( upper_2 > 176.925 )
								if( lower_6 <= 148.495 )
									ret := 0.125000
								if( lower_6 > 148.495 )
									ret := -0.852459 // sell
						if( lower_1 > 170.216 )
							if( upper_1 <= 176.075 )
								if( upper_6 <= 184.03 )
									ret := 1.000000 // buy
								if( upper_6 > 184.03 )
									ret := 0.666667
							if( upper_1 > 176.075 )
								if( upper_3 <= 180.514 )
									ret := -0.238095
								if( upper_3 > 180.514 )
									ret := 0.590551
					if( lower_6 > 168.175 )
						if( basis_minus <= 7.45245 )
							if( basis_minus <= 2.77601 )
								if( upper_5 <= 182.812 )
									ret := 0.111111
								if( upper_5 > 182.812 )
									ret := -0.700855 // sell
							if( basis_minus > 2.77601 )
								if( basis_minus <= 5.45721 )
									ret := -0.155696
								if( basis_minus > 5.45721 )
									ret := 0.346535
						if( basis_minus > 7.45245 )
							if( upper_1 <= 179.177 )
								if( basis <= 177.079 )
									ret := -0.850000 // sell
								if( basis > 177.079 )
									ret := -0.576923
							if( upper_1 > 179.177 )
								ret := 0.250000
			if( upper_3 > 182.651 )
				if( lower_5 <= 178.861 )
					if( upper_2 <= 184.329 )
						if( lower_5 <= 177.991 )
							if( lower_4 <= 177.28 )
								if( lower_6 <= 173.941 )
									ret := 0.408377
								if( lower_6 > 173.941 )
									ret := 0.721893 // buy
							if( lower_4 > 177.28 )
								if( basis_minus <= 3.83014 )
									ret := -0.290323
								if( basis_minus > 3.83014 )
									ret := 0.203320
						if( lower_5 > 177.991 )
							if( upper_6 <= 184.468 )
								if( basis <= 181.082 )
									ret := -0.428571
								if( basis > 181.082 )
									ret := 0.000000
							if( upper_6 > 184.468 )
								if( lower_6 <= 176.759 )
									ret := -0.500000
								if( lower_6 > 176.759 )
									ret := 0.652866
					if( upper_2 > 184.329 )
						if( lower_5 <= 178.797 )
							if( upper_2 <= 184.369 )
								if( upper_2 <= 184.349 )
									ret := -0.200000
								if( upper_2 > 184.349 )
									ret := -1.000000 // sell
							if( upper_2 > 184.369 )
								if( upper_5 <= 187.866 )
									ret := 0.358744
								if( upper_5 > 187.866 )
									ret := 0.009259
						if( lower_5 > 178.797 )
							if( lower_1 <= 181.6 )
								ret := 0.250000
							if( lower_1 > 181.6 )
								if( upper_2 <= 184.894 )
									ret := 1.000000 // buy
								if( upper_2 > 184.894 )
									ret := 0.806452 // buy
				if( lower_5 > 178.861 )
					if( upper_1 <= 186.409 )
						if( upper_2 <= 183.279 )
							if( lower_1 <= 182.256 )
								if( upper_5 <= 184.327 )
									ret := 0.191702
								if( upper_5 > 184.327 )
									ret := 0.723404 // buy
							if( lower_1 > 182.256 )
								ret := 1.000000 // buy
						if( upper_2 > 183.279 )
							if( basis <= 185.849 )
								if( lower_5 <= 184.146 )
									ret := 0.009901
								if( lower_5 > 184.146 )
									ret := 0.329787
							if( basis > 185.849 )
								if( upper_3 <= 186.749 )
									ret := -0.935484 // sell
								if( upper_3 > 186.749 )
									ret := -0.272727
					if( upper_1 > 186.409 )
						if( lower_6 <= 185.243 )
							if( lower_2 <= 185.909 )
								if( upper_3 <= 187.62 )
									ret := 0.205607
								if( upper_3 > 187.62 )
									ret := 0.688889
							if( lower_2 > 185.909 )
								ret := -1.000000 // sell
						if( lower_6 > 185.243 )
							if( basis_max <= -0.941274 )
								if( upper_4 <= 186.91 )
									ret := 0.897436 // buy
								if( upper_4 > 186.91 )
									ret := 0.555556
							if( basis_max > -0.941274 )
								if( lower_6 <= 185.318 )
									ret := 0.250000
								if( lower_6 > 185.318 )
									ret := 0.000000
		if( upper_2 > 187.252 )
			if( upper_1 <= 187.423 )
				if( basis_max <= -10.7158 )
					if( upper_1 <= 187.1 )
						if( upper_2 <= 188.562 )
							if( lower_4 <= 176.587 )
								if( basis_minus <= 12.41 )
									ret := 0.500000
								if( basis_minus > 12.41 )
									ret := -0.500000
							if( lower_4 > 176.587 )
								ret := -1.000000 // sell
						if( upper_2 > 188.562 )
							ret := -1.000000 // sell
					if( upper_1 > 187.1 )
						if( lower_5 <= 176.282 )
							if( lower_2 <= 177.015 )
								ret := -0.142857
							if( lower_2 > 177.015 )
								ret := -0.600000
						if( lower_5 > 176.282 )
							ret := 0.200000
				if( basis_max > -10.7158 )
					if( upper_4 <= 189.908 )
						if( upper_5 <= 187.986 )
							if( upper_1 <= 187.188 )
								if( basis <= 186.847 )
									ret := 0.242424
								if( basis > 186.847 )
									ret := -0.666667
							if( upper_1 > 187.188 )
								if( basis <= 186.916 )
									ret := 0.941176 // buy
								if( basis > 186.916 )
									ret := 0.315789
						if( upper_5 > 187.986 )
							if( upper_4 <= 188.287 )
								if( upper_3 <= 187.877 )
									ret := -0.203180
								if( upper_3 > 187.877 )
									ret := 0.292857
							if( upper_4 > 188.287 )
								if( upper_4 <= 188.708 )
									ret := -0.404192
								if( upper_4 > 188.708 )
									ret := -0.180392
					if( upper_4 > 189.908 )
						if( basis_max <= -10.6523 )
							ret := -0.333333
						if( basis_max > -10.6523 )
							if( upper_6 <= 192.573 )
								ret := 0.000000
							if( upper_6 > 192.573 )
								if( lower_2 <= 181.251 )
									ret := 0.931034 // buy
								if( lower_2 > 181.251 )
									ret := 0.666667
			if( upper_1 > 187.423 )
				if( basis_minus <= 7.28861 )
					if( upper_6 <= 203.702 )
						if( upper_3 <= 200.667 )
							if( upper_3 <= 200.263 )
								if( upper_2 <= 198.17 )
									ret := 0.010325
								if( upper_2 > 198.17 )
									ret := -0.198232
							if( upper_3 > 200.263 )
								if( upper_4 <= 200.477 )
									ret := 0.678571
								if( upper_4 > 200.477 )
									ret := 0.228311
						if( upper_3 > 200.667 )
							if( upper_2 <= 200.3 )
								if( lower_4 <= 196.411 )
									ret := -0.640000
								if( lower_4 > 196.411 )
									ret := -1.000000 // sell
							if( upper_2 > 200.3 )
								if( upper_2 <= 200.391 )
									ret := 0.375000
								if( upper_2 > 200.391 )
									ret := -0.232877
					if( upper_6 > 203.702 )
						if( upper_3 <= 200.815 )
							if( upper_6 <= 203.816 )
								ret := 0.750000 // buy
							if( upper_6 > 203.816 )
								ret := 1.000000 // buy
						if( upper_3 > 200.815 )
							if( upper_5 <= 202.693 )
								if( lower_5 <= 192.257 )
									ret := 1.000000 // buy
								if( lower_5 > 192.257 )
									ret := 0.250000
							if( upper_5 > 202.693 )
								ret := 0.000000
				if( basis_minus > 7.28861 )
					if( upper_3 <= 192.969 )
						if( upper_6 <= 196.295 )
							if( upper_3 <= 190.588 )
								if( lower_5 <= 180.86 )
									ret := 0.560000
								if( lower_5 > 180.86 )
									ret := 1.000000 // buy
							if( upper_3 > 190.588 )
								if( basis <= 186.522 )
									ret := 0.551724
								if( basis > 186.522 )
									ret := -0.457143
						if( upper_6 > 196.295 )
							if( lower_4 <= 171.082 )
								ret := 0.000000
							if( lower_4 > 171.082 )
								if( lower_2 <= 185.846 )
									ret := 1.000000 // buy
								if( lower_2 > 185.846 )
									ret := 0.758621 // buy
					if( upper_3 > 192.969 )
						if( upper_3 <= 194.454 )
							if( lower_2 <= 186.76 )
								if( basis_minus <= 7.34225 )
									ret := 1.000000 // buy
								if( basis_minus > 7.34225 )
									ret := -0.375000
							if( lower_2 > 186.76 )
								if( lower_2 <= 186.773 )
									ret := -0.750000 // sell
								if( lower_2 > 186.773 )
									ret := -1.000000 // sell
						if( upper_3 > 194.454 )
							if( basis_max <= -24.9242 )
								if( upper_6 <= 207.99 )
									ret := -0.531250
								if( upper_6 > 207.99 )
									ret := 1.000000 // buy
							if( basis_max > -24.9242 )
								if( upper_3 <= 196.499 )
									ret := 0.577236
								if( upper_3 > 196.499 )
									ret := 0.159091
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_AMZN_5Min_adbf6900(basis_max, upper_1, lower_2, upper_2, lower_3, lower_6, basis_minus, lower_4, upper_4, upper_5, basis, upper_3, lower_5, upper_6, lower_1)

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


