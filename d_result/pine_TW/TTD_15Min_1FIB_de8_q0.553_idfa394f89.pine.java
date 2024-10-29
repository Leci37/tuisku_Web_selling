//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: TTD_15Min_1FIB_fa394f89 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TTD_15Min_1FIB_fa394f89", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TTD_15Min_fa394f89(lower_6, lower_3, basis_max, lower_1, upper_2, upper_6, upper_4, lower_2, basis_minus, upper_3, lower_5, upper_1, lower_4, basis, upper_5)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( lower_3 <= 43.3087 )
		if( lower_6 <= 39.6104 )
			if( upper_5 <= 30.2452 )
				if( lower_6 <= 24.5264 )
					if( basis <= 26.9344 )
						if( lower_2 <= 25.9972 )
							ret := -0.571429
						if( lower_2 > 25.9972 )
							ret := -1.000000 // sell
					if( basis > 26.9344 )
						ret := 0.000000
				if( lower_6 > 24.5264 )
					if( upper_4 <= 30.0369 )
						if( basis_max <= -2.86285 )
							if( lower_6 <= 24.8363 )
								if( upper_1 <= 28.4575 )
									ret := -0.250000
								if( upper_1 > 28.4575 )
									ret := 0.625000
							if( lower_6 > 24.8363 )
								if( lower_2 <= 26.6895 )
									ret := -0.750000 // sell
								if( lower_2 > 26.6895 )
									ret := -1.000000 // sell
						if( basis_max > -2.86285 )
							if( basis_max <= -2.40553 )
								if( lower_6 <= 25.2743 )
									ret := 0.528736
								if( lower_6 > 25.2743 )
									ret := 0.897959 // buy
							if( basis_max > -2.40553 )
								if( basis_minus <= 2.26674 )
									ret := 0.303571
								if( basis_minus > 2.26674 )
									ret := -0.375000
					if( upper_4 > 30.0369 )
						ret := 1.000000 // buy
			if( upper_5 > 30.2452 )
				if( upper_6 <= 32.1428 )
					if( upper_4 <= 30.7071 )
						if( upper_2 <= 29.6003 )
							if( basis <= 27.971 )
								if( basis <= 27.9433 )
									ret := -0.050000
								if( basis > 27.9433 )
									ret := 0.956522 // buy
							if( basis > 27.971 )
								if( basis_max <= -2.7218 )
									ret := -0.637168
								if( basis_max > -2.7218 )
									ret := -0.030769
						if( upper_2 > 29.6003 )
							if( basis_max <= -1.39747 )
								if( lower_6 <= 26.9732 )
									ret := 0.184783
								if( lower_6 > 26.9732 )
									ret := 0.684685
							if( basis_max > -1.39747 )
								if( upper_1 <= 29.5521 )
									ret := 0.000000
								if( upper_1 > 29.5521 )
									ret := -0.904762 // sell
					if( upper_4 > 30.7071 )
						if( basis_max <= -1.71533 )
							if( basis_max <= -2.08439 )
								if( upper_2 <= 30.6984 )
									ret := -0.284211
								if( upper_2 > 30.6984 )
									ret := -0.925000 // sell
							if( basis_max > -2.08439 )
								if( upper_5 <= 31.5987 )
									ret := -0.029940
								if( upper_5 > 31.5987 )
									ret := 0.818182 // buy
						if( basis_max > -1.71533 )
							if( basis_max <= -1.66947 )
								if( basis <= 30.0035 )
									ret := -0.533333
								if( basis > 30.0035 )
									ret := -0.863636 // sell
							if( basis_max > -1.66947 )
								if( lower_5 <= 28.4399 )
									ret := -0.400000
								if( lower_5 > 28.4399 )
									ret := 0.000000
				if( upper_6 > 32.1428 )
					if( upper_5 <= 36.9519 )
						if( basis_minus <= 5.31175 )
							if( lower_3 <= 28.5008 )
								if( lower_5 <= 27.3982 )
									ret := 0.347826
								if( lower_5 > 27.3982 )
									ret := -0.312500
							if( lower_3 > 28.5008 )
								if( lower_6 <= 26.9811 )
									ret := 0.538462
								if( lower_6 > 26.9811 )
									ret := 0.861314 // buy
						if( basis_minus > 5.31175 )
							if( basis_max <= -5.37869 )
								if( basis_minus <= 5.39044 )
									ret := 0.750000 // buy
								if( basis_minus > 5.39044 )
									ret := -0.666667
							if( basis_max > -5.37869 )
								if( lower_4 <= 28.8407 )
									ret := -0.764706 // sell
								if( lower_4 > 28.8407 )
									ret := -0.277778
					if( upper_5 > 36.9519 )
						if( upper_4 <= 36.2068 )
							if( upper_3 <= 35.5642 )
								ret := -1.000000 // sell
							if( upper_3 > 35.5642 )
								if( upper_5 <= 36.9625 )
									ret := -1.000000 // sell
								if( upper_5 > 36.9625 )
									ret := -0.142857
						if( upper_4 > 36.2068 )
							if( lower_1 <= 45.9049 )
								if( lower_2 <= 40.1339 )
									ret := 0.045706
								if( lower_2 > 40.1339 )
									ret := 0.191928
							if( lower_1 > 45.9049 )
								if( lower_1 <= 47.0108 )
									ret := -0.600000
								if( lower_1 > 47.0108 )
									ret := 0.127273
		if( lower_6 > 39.6104 )
			if( upper_6 <= 46.9022 )
				if( upper_6 <= 46.5586 )
					if( upper_1 <= 44.8096 )
						if( basis <= 43.4853 )
							if( lower_5 <= 41.2645 )
								if( upper_1 <= 44.0973 )
									ret := 0.538462
								if( upper_1 > 44.0973 )
									ret := 0.896552 // buy
							if( lower_5 > 41.2645 )
								if( lower_1 <= 42.8356 )
									ret := -0.080000
								if( lower_1 > 42.8356 )
									ret := 0.640000
						if( basis > 43.4853 )
							if( basis_minus <= 2.25003 )
								ret := 0.500000
							if( basis_minus > 2.25003 )
								if( upper_5 <= 46.0055 )
									ret := -0.459459
								if( upper_5 > 46.0055 )
									ret := 0.083333
					if( upper_1 > 44.8096 )
						if( upper_6 <= 46.545 )
							if( upper_4 <= 45.6872 )
								ret := 1.000000 // buy
							if( upper_4 > 45.6872 )
								ret := 0.750000 // buy
						if( upper_6 > 46.545 )
							ret := 1.000000 // buy
				if( upper_6 > 46.5586 )
					if( lower_6 <= 41.8396 )
						if( upper_1 <= 44.3899 )
							if( upper_5 <= 46.0645 )
								if( upper_6 <= 46.7843 )
									ret := -0.473684
								if( upper_6 > 46.7843 )
									ret := -1.000000 // sell
							if( upper_5 > 46.0645 )
								if( upper_3 <= 45.1588 )
									ret := 0.750000 // buy
								if( upper_3 > 45.1588 )
									ret := -0.161290
						if( upper_1 > 44.3899 )
							if( upper_6 <= 46.6061 )
								if( upper_6 <= 46.5829 )
									ret := 0.250000
								if( upper_6 > 46.5829 )
									ret := 0.809524 // buy
							if( upper_6 > 46.6061 )
								if( lower_2 <= 43.0362 )
									ret := 0.531250
								if( lower_2 > 43.0362 )
									ret := -0.169811
					if( lower_6 > 41.8396 )
						if( upper_1 <= 44.8515 )
							if( basis_max <= -2.2755 )
								if( basis_max <= -2.31183 )
									ret := -0.303030
								if( basis_max > -2.31183 )
									ret := -0.933333 // sell
							if( basis_max > -2.2755 )
								if( basis <= 44.3006 )
									ret := 0.250000
								if( basis > 44.3006 )
									ret := 0.000000
						if( upper_1 > 44.8515 )
							if( lower_5 <= 42.4352 )
								ret := -0.250000
							if( lower_5 > 42.4352 )
								ret := -1.000000 // sell
			if( upper_6 > 46.9022 )
				if( upper_5 <= 47.2392 )
					if( lower_1 <= 43.8477 )
						if( lower_5 <= 42.4131 )
							if( basis_minus <= 3.15626 )
								if( upper_2 <= 45.3678 )
									ret := 0.000000
								if( upper_2 > 45.3678 )
									ret := 0.470588
							if( basis_minus > 3.15626 )
								if( lower_4 <= 42.1828 )
									ret := 0.556818
								if( lower_4 > 42.1828 )
									ret := 0.932203 // buy
						if( lower_5 > 42.4131 )
							if( upper_6 <= 47.0553 )
								if( lower_1 <= 43.8306 )
									ret := 0.850000 // buy
								if( lower_1 > 43.8306 )
									ret := 1.000000 // buy
							if( upper_6 > 47.0553 )
								ret := 0.500000
					if( lower_1 > 43.8477 )
						if( lower_4 <= 42.9359 )
							if( lower_6 <= 41.8663 )
								if( lower_5 <= 42.4777 )
									ret := 0.153846
								if( lower_5 > 42.4777 )
									ret := 0.666667
							if( lower_6 > 41.8663 )
								if( lower_1 <= 43.9343 )
									ret := -0.454545
								if( lower_1 > 43.9343 )
									ret := -1.000000 // sell
						if( lower_4 > 42.9359 )
							if( upper_3 <= 45.9145 )
								ret := 1.000000 // buy
							if( upper_3 > 45.9145 )
								ret := 0.250000
				if( upper_5 > 47.2392 )
					if( basis_minus <= 4.38951 )
						if( upper_2 <= 46.8377 )
							if( upper_4 <= 47.5836 )
								if( basis_minus <= 3.61314 )
									ret := 0.866667 // buy
								if( basis_minus > 3.61314 )
									ret := 0.144444
							if( upper_4 > 47.5836 )
								if( upper_6 <= 49.2864 )
									ret := -0.625000
								if( upper_6 > 49.2864 )
									ret := -1.000000 // sell
						if( upper_2 > 46.8377 )
							if( basis_minus <= 4.31864 )
								ret := 0.714286 // buy
							if( basis_minus > 4.31864 )
								ret := 1.000000 // buy
					if( basis_minus > 4.38951 )
						if( lower_3 <= 42.7014 )
							if( lower_4 <= 42.1298 )
								if( lower_3 <= 42.6616 )
									ret := 0.076923
								if( lower_3 > 42.6616 )
									ret := -0.750000 // sell
							if( lower_4 > 42.1298 )
								ret := 0.714286 // buy
						if( lower_3 > 42.7014 )
							if( lower_3 <= 43.2574 )
								if( basis_max <= -6.79254 )
									ret := 0.836735 // buy
								if( basis_max > -6.79254 )
									ret := 0.592593
							if( lower_3 > 43.2574 )
								if( basis_max <= -6.96887 )
									ret := 0.125000
								if( basis_max > -6.96887 )
									ret := -0.400000
	if( lower_3 > 43.3087 )
		if( lower_1 <= 44.714 )
			if( lower_3 <= 43.3395 )
				if( upper_3 <= 47.0132 )
					ret := 0.142857
				if( upper_3 > 47.0132 )
					ret := 0.750000 // buy
			if( lower_3 > 43.3395 )
				if( upper_6 <= 48.5055 )
					if( basis_max <= -2.48795 )
						if( lower_6 <= 42.0685 )
							if( basis_minus <= 2.67327 )
								ret := -1.000000 // sell
							if( basis_minus > 2.67327 )
								if( upper_5 <= 47.7225 )
									ret := -0.125000
								if( upper_5 > 47.7225 )
									ret := -0.666667
						if( lower_6 > 42.0685 )
							if( lower_1 <= 44.5251 )
								if( basis_minus <= 2.52054 )
									ret := -0.777778 // sell
								if( basis_minus > 2.52054 )
									ret := -0.975000 // sell
							if( lower_1 > 44.5251 )
								ret := -0.500000
					if( basis_max > -2.48795 )
						if( upper_2 <= 45.7422 )
							if( lower_3 <= 43.5954 )
								ret := 0.000000
							if( lower_3 > 43.5954 )
								ret := -0.250000
						if( upper_2 > 45.7422 )
							ret := -0.400000
				if( upper_6 > 48.5055 )
					if( upper_5 <= 48.7754 )
						if( upper_2 <= 46.5012 )
							ret := 1.000000 // buy
						if( upper_2 > 46.5012 )
							if( upper_3 <= 46.993 )
								if( upper_2 <= 46.5116 )
									ret := 0.250000
								if( upper_2 > 46.5116 )
									ret := -0.473684
							if( upper_3 > 46.993 )
								if( upper_3 <= 47.0235 )
									ret := 0.000000
								if( upper_3 > 47.0235 )
									ret := 0.250000
					if( upper_5 > 48.7754 )
						if( lower_1 <= 44.6326 )
							ret := -1.000000 // sell
						if( lower_1 > 44.6326 )
							if( basis_max <= -4.22377 )
								if( basis_max <= -4.78711 )
									ret := 0.000000
								if( basis_max > -4.78711 )
									ret := -0.333333
							if( basis_max > -4.22377 )
								ret := -0.800000 // sell
		if( lower_1 > 44.714 )
			if( basis_max <= -11.1213 )
				if( upper_6 <= 977.317 )
					if( basis_minus <= 220.891 )
						if( upper_4 <= 208.446 )
							if( lower_5 <= 139.816 )
								if( lower_6 <= 126.614 )
									ret := 0.111843
								if( lower_6 > 126.614 )
									ret := -0.179707
							if( lower_5 > 139.816 )
								if( lower_5 <= 145.629 )
									ret := 0.611111
								if( lower_5 > 145.629 )
									ret := 0.218289
						if( upper_4 > 208.446 )
							if( basis <= 191.008 )
								if( lower_1 <= 179.771 )
									ret := -0.279720
								if( lower_1 > 179.771 )
									ret := -0.830986 // sell
							if( basis > 191.008 )
								if( upper_5 <= 216.295 )
									ret := -0.159681
								if( upper_5 > 216.295 )
									ret := 0.067894
					if( basis_minus > 220.891 )
						if( lower_2 <= 586.509 )
							if( upper_6 <= 760.534 )
								ret := 0.000000
							if( upper_6 > 760.534 )
								if( upper_5 <= 865.74 )
									ret := 0.906542 // buy
								if( upper_5 > 865.74 )
									ret := 0.250000
						if( lower_2 > 586.509 )
							if( lower_4 <= 535.587 )
								if( basis_max <= -244.687 )
									ret := 0.400000
								if( basis_max > -244.687 )
									ret := -0.807692 // sell
							if( lower_4 > 535.587 )
								if( lower_6 <= 467.446 )
									ret := 1.000000 // buy
								if( lower_6 > 467.446 )
									ret := 0.375000
				if( upper_6 > 977.317 )
					if( basis <= 575.365 )
						ret := 1.000000 // buy
					if( basis > 575.365 )
						if( basis <= 829.575 )
							if( upper_3 <= 868.85 )
								if( lower_5 <= 524.63 )
									ret := -0.894737 // sell
								if( lower_5 > 524.63 )
									ret := 0.600000
							if( upper_3 > 868.85 )
								if( upper_2 <= 847.135 )
									ret := -0.817073 // sell
								if( upper_2 > 847.135 )
									ret := -0.500000
						if( basis > 829.575 )
							if( lower_3 <= 759.415 )
								if( basis_max <= -151.058 )
									ret := 0.907407 // buy
								if( basis_max > -151.058 )
									ret := 0.000000
							if( lower_3 > 759.415 )
								if( upper_5 <= 1005.92 )
									ret := -0.315113
								if( upper_5 > 1005.92 )
									ret := 0.900000 // buy
			if( basis_max > -11.1213 )
				if( lower_6 <= 287.867 )
					if( basis_minus <= 9.57677 )
						if( upper_6 <= 114.433 )
							if( upper_6 <= 113.909 )
								if( basis <= 46.0454 )
									ret := 0.223650
								if( basis > 46.0454 )
									ret := 0.017514
							if( upper_6 > 113.909 )
								if( upper_5 <= 112.788 )
									ret := -0.759494 // sell
								if( upper_5 > 112.788 )
									ret := -0.062500
						if( upper_6 > 114.433 )
							if( upper_6 <= 210.309 )
								if( basis_max <= -8.99786 )
									ret := -0.058997
								if( basis_max > -8.99786 )
									ret := 0.239354
							if( upper_6 > 210.309 )
								if( basis_max <= -8.52509 )
									ret := -0.218692
								if( basis_max > -8.52509 )
									ret := 0.078880
					if( basis_minus > 9.57677 )
						if( upper_4 <= 247.706 )
							if( lower_5 <= 116.685 )
								if( upper_4 <= 71.5782 )
									ret := -0.173352
								if( upper_4 > 71.5782 )
									ret := 0.034503
							if( lower_5 > 116.685 )
								if( lower_6 <= 128.484 )
									ret := -0.631579
								if( lower_6 > 128.484 )
									ret := -0.110181
						if( upper_4 > 247.706 )
							if( basis <= 241.386 )
								ret := 1.000000 // buy
							if( basis > 241.386 )
								if( upper_1 <= 287.2 )
									ret := 0.162963
								if( upper_1 > 287.2 )
									ret := -0.362319
				if( lower_6 > 287.867 )
					if( basis <= 300.048 )
						if( lower_5 <= 291.539 )
							if( upper_3 <= 304.111 )
								ret := 0.600000
							if( upper_3 > 304.111 )
								ret := 1.000000 // buy
						if( lower_5 > 291.539 )
							if( lower_2 <= 295.768 )
								ret := 0.000000
							if( lower_2 > 295.768 )
								if( basis_minus <= 10.7798 )
									ret := -1.000000 // sell
								if( basis_minus > 10.7798 )
									ret := 0.000000
					if( basis > 300.048 )
						if( basis_max <= -10.9308 )
							ret := 0.500000
						if( basis_max > -10.9308 )
							ret := 1.000000 // buy
	
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
float op_operation = decision_tree_0_TTD_15Min_fa394f89(lower_6, lower_3, basis_max, lower_1, upper_2, upper_6, upper_4, lower_2, basis_minus, upper_3, lower_5, upper_1, lower_4, basis, upper_5)

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


