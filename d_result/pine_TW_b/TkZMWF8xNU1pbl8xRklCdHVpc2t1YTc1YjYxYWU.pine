//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: NFLX_15Min_1FIB_a75b61ae Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NFLX_15Min_1FIB_a75b61ae", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NFLX_15Min_a75b61ae(upper_2, basis, lower_6, basis_minus, lower_5, upper_5, upper_4, basis_max, upper_6, upper_3, lower_2, upper_1, lower_4, lower_1, lower_3)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( upper_2 <= 685.313 )
		if( upper_4 <= 326.892 )
			if( basis_max <= -1.65375 )
				if( upper_2 <= 187.745 )
					if( basis_minus <= 13.8405 )
						if( lower_6 <= 170.205 )
							if( basis_max <= -13.5507 )
								if( lower_5 <= 163.232 )
									ret := -0.747368 // sell
								if( lower_5 > 163.232 )
									ret := 0.000000
							if( basis_max > -13.5507 )
								if( upper_1 <= 181.215 )
									ret := 0.024516
								if( upper_1 > 181.215 )
									ret := 0.579235
						if( lower_6 > 170.205 )
							if( lower_1 <= 179.155 )
								if( basis_minus <= 6.48795 )
									ret := 0.657289
								if( basis_minus > 6.48795 )
									ret := 0.072289
							if( lower_1 > 179.155 )
								if( upper_5 <= 190.622 )
									ret := 0.017908
								if( upper_5 > 190.622 )
									ret := 0.517007
					if( basis_minus > 13.8405 )
						if( lower_2 <= 150.501 )
							if( upper_1 <= 161.005 )
								if( upper_4 <= 167.02 )
									ret := -0.300000
								if( upper_4 > 167.02 )
									ret := 0.571429
							if( upper_1 > 161.005 )
								if( basis <= 156.955 )
									ret := -0.846154 // sell
								if( basis > 156.955 )
									ret := -0.533333
						if( lower_2 > 150.501 )
							if( lower_1 <= 170.366 )
								if( basis <= 173.213 )
									ret := 0.274510
								if( basis > 173.213 )
									ret := 0.733333 // buy
							if( lower_1 > 170.366 )
								if( lower_5 <= 162.833 )
									ret := -0.175758
								if( lower_5 > 162.833 )
									ret := 0.383978
				if( upper_2 > 187.745 )
					if( upper_2 <= 189.274 )
						if( upper_1 <= 188.54 )
							if( lower_4 <= 184.567 )
								if( lower_2 <= 180.29 )
									ret := -0.119266
								if( lower_2 > 180.29 )
									ret := -0.371014
							if( lower_4 > 184.567 )
								if( upper_2 <= 188.088 )
									ret := 1.000000 // buy
								if( upper_2 > 188.088 )
									ret := 0.485294
						if( upper_1 > 188.54 )
							if( upper_3 <= 189.405 )
								ret := -1.000000 // sell
							if( upper_3 > 189.405 )
								ret := -0.727273 // sell
					if( upper_2 > 189.274 )
						if( lower_2 <= 169.085 )
							if( upper_6 <= 207.391 )
								ret := 0.333333
							if( upper_6 > 207.391 )
								if( upper_5 <= 203.974 )
									ret := 1.000000 // buy
								if( upper_5 > 203.974 )
									ret := 0.727273 // buy
						if( lower_2 > 169.085 )
							if( upper_4 <= 324.672 )
								if( upper_2 <= 317.052 )
									ret := 0.030461
								if( upper_2 > 317.052 )
									ret := -0.138847
							if( upper_4 > 324.672 )
								if( lower_5 <= 288.19 )
									ret := -0.079787
								if( lower_5 > 288.19 )
									ret := 0.349325
			if( basis_max > -1.65375 )
				if( upper_4 <= 166.213 )
					if( lower_4 <= 141.835 )
						if( upper_5 <= 143.977 )
							ret := -0.555556
						if( upper_5 > 143.977 )
							ret := -0.625000
					if( lower_4 > 141.835 )
						ret := 0.000000
				if( upper_4 > 166.213 )
					if( upper_3 <= 166.06 )
						ret := -0.909091 // sell
					if( upper_3 > 166.06 )
						ret := -1.000000 // sell
		if( upper_4 > 326.892 )
			if( basis_minus <= 25.5337 )
				if( upper_3 <= 331.165 )
					if( basis <= 314.793 )
						if( lower_3 <= 303.526 )
							ret := -0.080000
						if( lower_3 > 303.526 )
							if( lower_5 <= 298.578 )
								if( lower_1 <= 309.601 )
									ret := -1.000000 // sell
								if( lower_1 > 309.601 )
									ret := -0.785714 // sell
							if( lower_5 > 298.578 )
								ret := -0.333333
					if( basis > 314.793 )
						if( basis_max <= -21.575 )
							if( upper_2 <= 325.488 )
								if( lower_6 <= 292.919 )
									ret := 0.000000
								if( lower_6 > 292.919 )
									ret := 0.553571
							if( upper_2 > 325.488 )
								if( lower_1 <= 312.399 )
									ret := 0.895522 // buy
								if( lower_1 > 312.399 )
									ret := -0.222222
						if( basis_max > -21.575 )
							if( upper_6 <= 335.281 )
								if( upper_5 <= 329.101 )
									ret := -0.711538 // sell
								if( upper_5 > 329.101 )
									ret := 0.056093
							if( upper_6 > 335.281 )
								if( lower_2 <= 307.141 )
									ret := 0.480000
								if( lower_2 > 307.141 )
									ret := -0.264062
				if( upper_3 > 331.165 )
					if( lower_4 <= 323.455 )
						if( lower_3 <= 324.145 )
							if( lower_1 <= 328.181 )
								if( basis_max <= -15.6457 )
									ret := 0.032216
								if( basis_max > -15.6457 )
									ret := 0.211961
							if( lower_1 > 328.181 )
								if( lower_5 <= 319.127 )
									ret := -0.034091
								if( lower_5 > 319.127 )
									ret := -0.840909 // sell
						if( lower_3 > 324.145 )
							if( lower_5 <= 321.325 )
								if( basis_max <= -19.4243 )
									ret := 0.557522
								if( basis_max > -19.4243 )
									ret := 0.120000
							if( lower_5 > 321.325 )
								if( lower_5 <= 321.459 )
									ret := 0.941176 // buy
								if( lower_5 > 321.459 )
									ret := 0.349206
					if( lower_4 > 323.455 )
						if( upper_2 <= 409.024 )
							if( lower_2 <= 392.428 )
								if( lower_3 <= 387.697 )
									ret := -0.024738
								if( lower_3 > 387.697 )
									ret := 0.184534
							if( lower_2 > 392.428 )
								if( lower_4 <= 391.845 )
									ret := -0.595833
								if( lower_4 > 391.845 )
									ret := -0.119231
						if( upper_2 > 409.024 )
							if( upper_3 <= 414.552 )
								if( upper_4 <= 414.557 )
									ret := 0.092958
								if( upper_4 > 414.557 )
									ret := 0.655738
							if( upper_3 > 414.552 )
								if( upper_4 <= 417.708 )
									ret := -0.452769
								if( upper_4 > 417.708 )
									ret := 0.023062
			if( basis_minus > 25.5337 )
				if( upper_2 <= 628.079 )
					if( basis_max <= -31.2445 )
						if( basis_minus <= 163.62 )
							if( basis_max <= -163.024 )
								if( upper_3 <= 318.714 )
									ret := 0.894737 // buy
								if( upper_3 > 318.714 )
									ret := 0.142857
							if( basis_max > -163.024 )
								if( upper_2 <= 317.52 )
									ret := -0.364078
								if( upper_2 > 317.52 )
									ret := -0.010532
						if( basis_minus > 163.62 )
							if( lower_5 <= 267.516 )
								if( upper_5 <= 544.891 )
									ret := -0.347826
								if( upper_5 > 544.891 )
									ret := 0.782609 // buy
							if( lower_5 > 267.516 )
								if( upper_5 <= 546.433 )
									ret := -1.000000 // sell
								if( upper_5 > 546.433 )
									ret := -0.818182 // sell
					if( basis_max > -31.2445 )
						if( lower_2 <= 305.789 )
							if( upper_6 <= 338.623 )
								if( lower_3 <= 298.249 )
									ret := -0.214286
								if( lower_3 > 298.249 )
									ret := -0.863636 // sell
							if( upper_6 > 338.623 )
								if( basis_max <= -27.4198 )
									ret := 0.505376
								if( basis_max > -27.4198 )
									ret := 0.038095
						if( lower_2 > 305.789 )
							if( upper_1 <= 323.767 )
								if( lower_2 <= 305.866 )
									ret := -0.521739
								if( lower_2 > 305.866 )
									ret := -0.934211 // sell
							if( upper_1 > 323.767 )
								if( upper_3 <= 628.802 )
									ret := -0.110342
								if( upper_3 > 628.802 )
									ret := -0.581921
				if( upper_2 > 628.079 )
					if( lower_5 <= 584.644 )
						if( basis_minus <= 40.1968 )
							ret := -0.090909
						if( basis_minus > 40.1968 )
							if( upper_6 <= 677.155 )
								if( lower_6 <= 574.457 )
									ret := 0.857143 // buy
								if( lower_6 > 574.457 )
									ret := 1.000000 // buy
							if( upper_6 > 677.155 )
								if( upper_2 <= 654.913 )
									ret := -0.192308
								if( upper_2 > 654.913 )
									ret := 0.704918 // buy
					if( lower_5 > 584.644 )
						if( upper_3 <= 632.902 )
							if( basis_minus <= 29.73 )
								if( basis_max <= -29.1479 )
									ret := 0.363636
								if( basis_max > -29.1479 )
									ret := 0.000000
							if( basis_minus > 29.73 )
								if( basis_max <= -30.5198 )
									ret := 0.625000
								if( basis_max > -30.5198 )
									ret := 1.000000 // buy
						if( upper_3 > 632.902 )
							if( lower_6 <= 577.595 )
								if( upper_1 <= 653.309 )
									ret := -0.254098
								if( upper_1 > 653.309 )
									ret := -1.000000 // sell
							if( lower_6 > 577.595 )
								if( upper_1 <= 626.047 )
									ret := -0.517241
								if( upper_1 > 626.047 )
									ret := 0.077387
	if( upper_2 > 685.313 )
		if( upper_5 <= 702.748 )
			if( basis_max <= -16.7701 )
				if( lower_3 <= 674.401 )
					if( lower_2 <= 665.898 )
						if( lower_1 <= 669.002 )
							if( lower_2 <= 658.747 )
								if( lower_3 <= 650.246 )
									ret := 0.000000
								if( lower_3 > 650.246 )
									ret := -0.734694 // sell
							if( lower_2 > 658.747 )
								if( upper_2 <= 686.474 )
									ret := -0.166667
								if( upper_2 > 686.474 )
									ret := 0.083333
						if( lower_1 > 669.002 )
							if( upper_6 <= 701.579 )
								ret := -0.818182 // sell
							if( upper_6 > 701.579 )
								ret := -1.000000 // sell
					if( lower_2 > 665.898 )
						if( lower_4 <= 660.851 )
							if( upper_2 <= 686.258 )
								ret := 0.000000
							if( upper_2 > 686.258 )
								if( basis_minus <= 26.479 )
									ret := 0.960000 // buy
								if( basis_minus > 26.479 )
									ret := 0.333333
						if( lower_4 > 660.851 )
							if( lower_2 <= 668.523 )
								if( upper_4 <= 693.055 )
									ret := -0.804878 // sell
								if( upper_4 > 693.055 )
									ret := -0.400000
							if( lower_2 > 668.523 )
								if( basis_max <= -17.4064 )
									ret := -0.161137
								if( basis_max > -17.4064 )
									ret := 0.461538
				if( lower_3 > 674.401 )
					if( upper_1 <= 689.044 )
						ret := -0.250000
					if( upper_1 > 689.044 )
						if( lower_1 <= 680.067 )
							ret := -1.000000 // sell
						if( lower_1 > 680.067 )
							if( lower_6 <= 667.037 )
								ret := 0.142857
							if( lower_6 > 667.037 )
								if( basis_max <= -17.1906 )
									ret := -1.000000 // sell
								if( basis_max > -17.1906 )
									ret := -0.909091 // sell
			if( basis_max > -16.7701 )
				if( upper_3 <= 690.379 )
					if( upper_1 <= 684.029 )
						if( basis <= 679.988 )
							ret := -0.500000
						if( basis > 679.988 )
							if( lower_6 <= 663.591 )
								ret := -1.000000 // sell
							if( lower_6 > 663.591 )
								ret := -0.900000 // sell
					if( upper_1 > 684.029 )
						if( upper_6 <= 698.074 )
							ret := 0.000000
						if( upper_6 > 698.074 )
							ret := 0.090909
				if( upper_3 > 690.379 )
					if( lower_6 <= 669.752 )
						if( basis <= 684.474 )
							if( basis_minus <= 15.2026 )
								ret := -0.833333 // sell
							if( basis_minus > 15.2026 )
								ret := -1.000000 // sell
						if( basis > 684.474 )
							if( lower_1 <= 681.193 )
								if( upper_5 <= 697.386 )
									ret := -0.142857
								if( upper_5 > 697.386 )
									ret := 0.000000
							if( lower_1 > 681.193 )
								ret := -1.000000 // sell
					if( lower_6 > 669.752 )
						ret := -0.187500
		if( upper_5 > 702.748 )
			if( upper_1 <= 695.781 )
				if( upper_6 <= 710.97 )
					if( upper_3 <= 695.315 )
						if( upper_3 <= 694.974 )
							ret := 0.800000 // buy
						if( upper_3 > 694.974 )
							ret := 1.000000 // buy
					if( upper_3 > 695.315 )
						if( upper_5 <= 703.447 )
							ret := -0.681818
						if( upper_5 > 703.447 )
							if( upper_4 <= 701.923 )
								if( basis <= 689.949 )
									ret := 0.540541
								if( basis > 689.949 )
									ret := 0.826923 // buy
							if( upper_4 > 701.923 )
								if( upper_2 <= 698.169 )
									ret := 0.000000
								if( upper_2 > 698.169 )
									ret := 0.675676
				if( upper_6 > 710.97 )
					if( upper_4 <= 710.088 )
						if( basis_max <= -43.9589 )
							if( basis_max <= -46.4165 )
								ret := -0.363636
							if( basis_max > -46.4165 )
								if( upper_6 <= 715.885 )
									ret := -0.764706 // sell
								if( upper_6 > 715.885 )
									ret := -1.000000 // sell
						if( basis_max > -43.9589 )
							if( upper_4 <= 704.595 )
								if( lower_1 <= 660.524 )
									ret := 0.800000 // buy
								if( lower_1 > 660.524 )
									ret := -0.161765
							if( upper_4 > 704.595 )
								if( basis_minus <= 38.0845 )
									ret := 0.754717 // buy
								if( basis_minus > 38.0845 )
									ret := -0.117647
					if( upper_4 > 710.088 )
						ret := -1.000000 // sell
			if( upper_1 > 695.781 )
				if( lower_3 <= 684.448 )
					if( upper_2 <= 699.675 )
						if( upper_5 <= 705.173 )
							ret := -0.250000
						if( upper_5 > 705.173 )
							if( upper_6 <= 710.087 )
								ret := -1.000000 // sell
							if( upper_6 > 710.087 )
								if( lower_1 <= 687.113 )
									ret := -0.863636 // sell
								if( lower_1 > 687.113 )
									ret := -0.500000
					if( upper_2 > 699.675 )
						if( lower_6 <= 669.868 )
							if( upper_1 <= 697.744 )
								if( lower_5 <= 663.988 )
									ret := -0.916667 // sell
								if( lower_5 > 663.988 )
									ret := -0.179487
							if( upper_1 > 697.744 )
								if( upper_4 <= 708.792 )
									ret := -0.958333 // sell
								if( upper_4 > 708.792 )
									ret := -0.400000
						if( lower_6 > 669.868 )
							if( lower_4 <= 681.46 )
								if( lower_6 <= 672.396 )
									ret := 0.135135
								if( lower_6 > 672.396 )
									ret := 0.424242
							if( lower_4 > 681.46 )
								if( lower_5 <= 678.548 )
									ret := -0.933333 // sell
								if( lower_5 > 678.548 )
									ret := -0.080000
				if( lower_3 > 684.448 )
					if( basis_minus <= 26.3714 )
						if( lower_4 <= 699.625 )
							if( upper_1 <= 704.473 )
								if( lower_5 <= 683.86 )
									ret := 0.192661
								if( lower_5 > 683.86 )
									ret := -0.625000
							if( upper_1 > 704.473 )
								if( upper_3 <= 708.837 )
									ret := 1.000000 // buy
								if( upper_3 > 708.837 )
									ret := 0.202216
						if( lower_4 > 699.625 )
							if( upper_2 <= 713.214 )
								if( lower_4 <= 702.091 )
									ret := 0.472222
								if( lower_4 > 702.091 )
									ret := 0.105263
							if( upper_2 > 713.214 )
								if( basis_minus <= 13.5405 )
									ret := -0.840580 // sell
								if( basis_minus > 13.5405 )
									ret := -0.061856
					if( basis_minus > 26.3714 )
						if( basis_minus <= 27.9549 )
							if( lower_4 <= 704.347 )
								if( basis <= 714.302 )
									ret := -0.925926 // sell
								if( basis > 714.302 )
									ret := -0.380952
							if( lower_4 > 704.347 )
								if( upper_6 <= 748.3 )
									ret := -0.888889 // sell
								if( upper_6 > 748.3 )
									ret := -1.000000 // sell
						if( basis_minus > 27.9549 )
							if( basis_minus <= 28.105 )
								ret := -0.166667
							if( basis_minus > 28.105 )
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
float op_operation = decision_tree_0_NFLX_15Min_a75b61ae(upper_2, basis, lower_6, basis_minus, lower_5, upper_5, upper_4, basis_max, upper_6, upper_3, lower_2, upper_1, lower_4, lower_1, lower_3)

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


