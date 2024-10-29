//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: NIO_5Min_1FIB_e8e89c78 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NIO_5Min_1FIB_e8e89c78", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NIO_5Min_e8e89c78(upper_2, basis, lower_6, basis_minus, lower_5, upper_5, upper_4, basis_max, upper_6, upper_3, lower_2, upper_1, lower_4, lower_1, lower_3)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( lower_2 <= 3.73785 )
		if( lower_4 <= 3.68695 )
			if( lower_4 <= 3.65704 )
				if( basis <= 3.88462 )
					if( basis_minus <= 0.180182 )
						if( upper_3 <= 3.8409 )
							if( lower_3 <= 3.6642 )
								ret := 0.933333 // buy
							if( lower_3 > 3.6642 )
								if( lower_5 <= 3.62541 )
									ret := -0.782609 // sell
								if( lower_5 > 3.62541 )
									ret := 0.333333
						if( upper_3 > 3.8409 )
							if( upper_3 <= 3.84544 )
								ret := -1.000000 // sell
							if( upper_3 > 3.84544 )
								ret := -0.214286
					if( basis_minus > 0.180182 )
						if( upper_3 <= 3.8809 )
							if( upper_5 <= 3.92183 )
								if( lower_2 <= 3.68851 )
									ret := 1.000000 // buy
								if( lower_2 > 3.68851 )
									ret := 0.791667 // buy
							if( upper_5 > 3.92183 )
								if( lower_2 <= 3.68179 )
									ret := 1.000000 // buy
								if( lower_2 > 3.68179 )
									ret := 0.384615
						if( upper_3 > 3.8809 )
							if( lower_2 <= 3.70312 )
								if( upper_4 <= 3.92368 )
									ret := -0.609756
								if( upper_4 > 3.92368 )
									ret := 0.184211
							if( lower_2 > 3.70312 )
								if( basis <= 3.88354 )
									ret := 0.666667
								if( basis > 3.88354 )
									ret := -0.083333
				if( basis > 3.88462 )
					ret := -0.909091 // sell
			if( lower_4 > 3.65704 )
				if( lower_1 <= 3.73917 )
					if( basis_minus <= 0.190871 )
						if( upper_3 <= 3.87521 )
							if( basis <= 3.78215 )
								ret := -0.866667 // sell
							if( basis > 3.78215 )
								ret := -1.000000 // sell
						if( upper_3 > 3.87521 )
							ret := -0.529412
					if( basis_minus > 0.190871 )
						if( upper_2 <= 3.85941 )
							if( upper_4 <= 3.90273 )
								if( upper_2 <= 3.85573 )
									ret := 0.000000
								if( upper_2 > 3.85573 )
									ret := 0.428571
							if( upper_4 > 3.90273 )
								ret := 0.000000
						if( upper_2 > 3.85941 )
							if( basis <= 3.78469 )
								ret := -0.200000
							if( basis > 3.78469 )
								ret := -0.705882 // sell
				if( lower_1 > 3.73917 )
					if( basis <= 3.78398 )
						if( upper_5 <= 3.92326 )
							if( upper_2 <= 3.84885 )
								ret := 0.846154 // buy
							if( upper_2 > 3.84885 )
								if( upper_5 <= 3.92217 )
									ret := 0.275862
								if( upper_5 > 3.92217 )
									ret := -0.142857
						if( upper_5 > 3.92326 )
							if( lower_5 <= 3.64207 )
								ret := 1.000000 // buy
							if( lower_5 > 3.64207 )
								ret := 0.727273 // buy
					if( basis > 3.78398 )
						if( upper_2 <= 3.85331 )
							if( upper_1 <= 3.82388 )
								ret := -0.875000 // sell
							if( upper_1 > 3.82388 )
								ret := -1.000000 // sell
						if( upper_2 > 3.85331 )
							if( upper_4 <= 3.99849 )
								if( lower_4 <= 3.66298 )
									ret := -0.700000 // sell
								if( lower_4 > 3.66298 )
									ret := 0.000000
							if( upper_4 > 3.99849 )
								ret := 0.363636
		if( lower_4 > 3.68695 )
			if( lower_5 <= 3.67905 )
				if( upper_2 <= 3.84323 )
					if( lower_3 <= 3.71297 )
						if( upper_3 <= 3.8573 )
							ret := 0.636364
						if( upper_3 > 3.8573 )
							if( upper_5 <= 3.89825 )
								ret := 0.923077 // buy
							if( upper_5 > 3.89825 )
								ret := 1.000000 // buy
					if( lower_3 > 3.71297 )
						ret := 1.000000 // buy
				if( upper_2 > 3.84323 )
					if( lower_2 <= 3.73389 )
						if( lower_5 <= 3.67322 )
							if( upper_5 <= 3.90495 )
								ret := 1.000000 // buy
							if( upper_5 > 3.90495 )
								ret := 0.769231 // buy
						if( lower_5 > 3.67322 )
							ret := 0.066667
					if( lower_2 > 3.73389 )
						if( basis_max <= -0.177597 )
							ret := 0.904762 // buy
						if( basis_max > -0.177597 )
							ret := 1.000000 // buy
			if( lower_5 > 3.67905 )
				if( upper_2 <= 3.81725 )
					if( lower_6 <= 3.66894 )
						ret := 0.636364
					if( lower_6 > 3.66894 )
						ret := 1.000000 // buy
				if( upper_2 > 3.81725 )
					if( upper_6 <= 3.91548 )
						if( basis <= 3.77789 )
							ret := -0.666667
						if( basis > 3.77789 )
							ret := -0.136364
					if( upper_6 > 3.91548 )
						ret := -1.000000 // sell
	if( lower_2 > 3.73785 )
		if( upper_5 <= 7.96683 )
			if( upper_4 <= 6.83291 )
				if( lower_4 <= 5.39098 )
					if( lower_3 <= 5.34089 )
						if( lower_3 <= 5.21353 )
							if( basis_max <= -0.299283 )
								if( lower_3 <= 5.20091 )
									ret := 0.105978
								if( lower_3 > 5.20091 )
									ret := 0.609756
							if( basis_max > -0.299283 )
								if( lower_5 <= 5.15344 )
									ret := 0.000858
								if( lower_5 > 5.15344 )
									ret := 0.224790
						if( lower_3 > 5.21353 )
							if( basis_max <= -0.479298 )
								if( lower_4 <= 5.17037 )
									ret := -0.080000
								if( lower_4 > 5.17037 )
									ret := 0.638095
							if( basis_max > -0.479298 )
								if( upper_2 <= 5.35628 )
									ret := -0.635294
								if( upper_2 > 5.35628 )
									ret := -0.137341
					if( lower_3 > 5.34089 )
						if( upper_4 <= 5.64277 )
							if( upper_3 <= 5.52397 )
								if( lower_5 <= 5.31788 )
									ret := 0.500000
								if( lower_5 > 5.31788 )
									ret := -0.094891
							if( upper_3 > 5.52397 )
								if( lower_6 <= 5.32924 )
									ret := 0.446691
								if( lower_6 > 5.32924 )
									ret := -0.700000 // sell
						if( upper_4 > 5.64277 )
							if( lower_4 <= 5.3732 )
								if( lower_5 <= 5.29396 )
									ret := 0.227273
								if( lower_5 > 5.29396 )
									ret := -0.516779
							if( lower_4 > 5.3732 )
								if( upper_2 <= 5.99001 )
									ret := 0.386760
								if( upper_2 > 5.99001 )
									ret := -0.666667
				if( lower_4 > 5.39098 )
					if( upper_3 <= 5.61802 )
						if( basis_minus <= 0.130839 )
							if( basis_max <= -0.129012 )
								ret := 0.666667
							if( basis_max > -0.129012 )
								ret := 0.187500
						if( basis_minus > 0.130839 )
							if( basis_max <= -0.166438 )
								if( upper_4 <= 5.63771 )
									ret := -0.076923
								if( upper_4 > 5.63771 )
									ret := -0.850000 // sell
							if( basis_max > -0.166438 )
								if( upper_5 <= 5.65396 )
									ret := -0.877451 // sell
								if( upper_5 > 5.65396 )
									ret := -0.466667
					if( upper_3 > 5.61802 )
						if( lower_6 <= 5.3243 )
							if( upper_5 <= 6.25109 )
								if( lower_2 <= 5.51037 )
									ret := -0.025490
								if( lower_2 > 5.51037 )
									ret := 0.325282
							if( upper_5 > 6.25109 )
								if( lower_6 <= 5.27435 )
									ret := -0.411765
								if( lower_6 > 5.27435 )
									ret := -1.000000 // sell
						if( lower_6 > 5.3243 )
							if( lower_4 <= 5.44297 )
								if( basis_max <= -0.187872 )
									ret := -0.590551
								if( basis_max > -0.187872 )
									ret := 0.202020
							if( lower_4 > 5.44297 )
								if( lower_1 <= 6.55907 )
									ret := -0.057563
								if( lower_1 > 6.55907 )
									ret := 0.323699
			if( upper_4 > 6.83291 )
				if( lower_2 <= 6.37116 )
					if( lower_4 <= 6.07843 )
						if( lower_5 <= 5.85155 )
							if( basis_minus <= 0.829278 )
								if( upper_2 <= 6.7317 )
									ret := 1.000000 // buy
								if( upper_2 > 6.7317 )
									ret := 0.545455
							if( basis_minus > 0.829278 )
								if( upper_4 <= 7.01192 )
									ret := -0.071429
								if( upper_4 > 7.01192 )
									ret := 0.382075
						if( lower_5 > 5.85155 )
							if( upper_3 <= 7.14045 )
								ret := -0.882353 // sell
							if( upper_3 > 7.14045 )
								ret := -0.307692
					if( lower_4 > 6.07843 )
						if( upper_2 <= 7.02969 )
							if( lower_5 <= 6.05703 )
								if( lower_2 <= 6.35563 )
									ret := 1.000000 // buy
								if( lower_2 > 6.35563 )
									ret := 0.225806
							if( lower_5 > 6.05703 )
								if( basis_max <= -0.642881 )
									ret := 0.953488 // buy
								if( basis_max > -0.642881 )
									ret := 0.702703 // buy
						if( upper_2 > 7.02969 )
							if( lower_1 <= 6.44915 )
								ret := 0.900000 // buy
							if( lower_1 > 6.44915 )
								ret := 1.000000 // buy
				if( lower_2 > 6.37116 )
					if( upper_1 <= 7.49855 )
						if( upper_1 <= 7.44617 )
							if( lower_4 <= 6.2024 )
								if( upper_1 <= 6.85259 )
									ret := -1.000000 // sell
								if( upper_1 > 6.85259 )
									ret := -0.352941
							if( lower_4 > 6.2024 )
								if( upper_6 <= 7.30292 )
									ret := 0.272018
								if( upper_6 > 7.30292 )
									ret := 0.053363
						if( upper_1 > 7.44617 )
							if( lower_1 <= 7.41699 )
								if( basis <= 7.41718 )
									ret := 0.477273
								if( basis > 7.41718 )
									ret := 0.002801
							if( lower_1 > 7.41699 )
								if( lower_2 <= 7.41112 )
									ret := 0.754902 // buy
								if( lower_2 > 7.41112 )
									ret := 0.081081
					if( upper_1 > 7.49855 )
						if( upper_3 <= 7.70066 )
							if( basis <= 7.58202 )
								if( lower_1 <= 7.46472 )
									ret := -0.100457
								if( lower_1 > 7.46472 )
									ret := -0.367010
							if( basis > 7.58202 )
								if( lower_4 <= 7.5664 )
									ret := 0.765957 // buy
								if( lower_4 > 7.5664 )
									ret := -0.107143
						if( upper_3 > 7.70066 )
							if( upper_2 <= 7.67363 )
								if( basis_minus <= 0.462903 )
									ret := 0.722727 // buy
								if( basis_minus > 0.462903 )
									ret := 0.128834
							if( upper_2 > 7.67363 )
								if( lower_6 <= 7.00294 )
									ret := -0.808824 // sell
								if( lower_6 > 7.00294 )
									ret := 0.053966
		if( upper_5 > 7.96683 )
			if( basis <= 7.95238 )
				if( basis <= 7.85121 )
					if( upper_1 <= 7.9617 )
						if( lower_1 <= 6.74651 )
							if( upper_2 <= 7.51181 )
								ret := -1.000000 // sell
							if( upper_2 > 7.51181 )
								ret := -0.888889 // sell
						if( lower_1 > 6.74651 )
							if( lower_3 <= 7.31729 )
								if( basis_minus <= 1.15772 )
									ret := 0.552764
								if( basis_minus > 1.15772 )
									ret := -0.233766
							if( lower_3 > 7.31729 )
								if( upper_5 <= 8.17088 )
									ret := -0.050023
								if( upper_5 > 8.17088 )
									ret := -0.406528
					if( upper_1 > 7.9617 )
						if( lower_4 <= 7.42002 )
							if( lower_6 <= 7.16742 )
								ret := 0.100000
							if( lower_6 > 7.16742 )
								if( upper_6 <= 8.4504 )
									ret := 1.000000 // buy
								if( upper_6 > 8.4504 )
									ret := 0.764706 // buy
						if( lower_4 > 7.42002 )
							if( lower_6 <= 7.32323 )
								if( basis <= 7.83809 )
									ret := -0.414634
								if( basis > 7.83809 )
									ret := 0.297872
							if( lower_6 > 7.32323 )
								if( upper_3 <= 8.09651 )
									ret := 0.000000
								if( upper_3 > 8.09651 )
									ret := 0.923077 // buy
				if( basis > 7.85121 )
					if( lower_1 <= 7.86149 )
						if( upper_2 <= 8.12469 )
							if( upper_1 <= 8.03034 )
								if( upper_6 <= 8.22363 )
									ret := -0.257812
								if( upper_6 > 8.22363 )
									ret := -0.530612
							if( upper_1 > 8.03034 )
								if( basis_minus <= 0.412011 )
									ret := -0.444444
								if( basis_minus > 0.412011 )
									ret := -0.850877 // sell
						if( upper_2 > 8.12469 )
							if( basis <= 7.88477 )
								if( basis <= 7.88146 )
									ret := 0.500000
								if( basis > 7.88146 )
									ret := 1.000000 // buy
							if( basis > 7.88477 )
								if( upper_4 <= 8.24983 )
									ret := 0.370370
								if( upper_4 > 8.24983 )
									ret := -0.219595
					if( lower_1 > 7.86149 )
						if( upper_4 <= 8.15924 )
							if( lower_4 <= 7.8345 )
								if( upper_5 <= 8.07209 )
									ret := -0.053942
								if( upper_5 > 8.07209 )
									ret := 0.325581
							if( lower_4 > 7.8345 )
								if( basis_max <= -0.148539 )
									ret := 1.000000 // buy
								if( basis_max > -0.148539 )
									ret := 0.777778 // buy
						if( upper_4 > 8.15924 )
							if( basis_max <= -0.352826 )
								ret := -0.500000
							if( basis_max > -0.352826 )
								ret := -1.000000 // sell
			if( basis > 7.95238 )
				if( upper_5 <= 8.55926 )
					if( upper_4 <= 8.08251 )
						if( lower_1 <= 7.91273 )
							if( upper_1 <= 8.00313 )
								if( upper_3 <= 8.05373 )
									ret := 0.500000
								if( upper_3 > 8.05373 )
									ret := -0.047619
							if( upper_1 > 8.00313 )
								ret := -0.947368 // sell
						if( lower_1 > 7.91273 )
							if( lower_2 <= 7.89338 )
								ret := -0.800000 // sell
							if( lower_2 > 7.89338 )
								ret := -1.000000 // sell
					if( upper_4 > 8.08251 )
						if( upper_3 <= 8.22128 )
							if( upper_6 <= 8.18345 )
								if( lower_1 <= 7.90052 )
									ret := 1.000000 // buy
								if( lower_1 > 7.90052 )
									ret := 0.688073
							if( upper_6 > 8.18345 )
								if( upper_2 <= 8.10179 )
									ret := -0.338983
								if( upper_2 > 8.10179 )
									ret := 0.380178
						if( upper_3 > 8.22128 )
							if( upper_1 <= 8.11945 )
								if( upper_3 <= 8.22584 )
									ret := -0.307692
								if( upper_3 > 8.22584 )
									ret := -0.735294 // sell
							if( upper_1 > 8.11945 )
								if( lower_6 <= 7.33589 )
									ret := 1.000000 // buy
								if( lower_6 > 7.33589 )
									ret := 0.050325
				if( upper_5 > 8.55926 )
					if( upper_2 <= 8.44441 )
						if( lower_6 <= 7.30153 )
							if( upper_1 <= 8.27945 )
								if( lower_3 <= 7.67007 )
									ret := -0.790123 // sell
								if( lower_3 > 7.67007 )
									ret := -1.000000 // sell
							if( upper_1 > 8.27945 )
								ret := -0.333333
						if( lower_6 > 7.30153 )
							if( upper_2 <= 8.37535 )
								if( upper_1 <= 8.2461 )
									ret := -0.280374
								if( upper_1 > 8.2461 )
									ret := 0.485294
							if( upper_2 > 8.37535 )
								if( upper_1 <= 8.33792 )
									ret := -0.651786
								if( upper_1 > 8.33792 )
									ret := -0.310345
					if( upper_2 > 8.44441 )
						if( basis <= 15.5006 )
							if( basis_minus <= 0.933885 )
								if( basis <= 10.8475 )
									ret := -0.029113
								if( basis > 10.8475 )
									ret := -0.147202
							if( basis_minus > 0.933885 )
								if( basis_minus <= 0.968314 )
									ret := 0.354067
								if( basis_minus > 0.968314 )
									ret := 0.099029
						if( basis > 15.5006 )
							if( basis_minus <= 0.486574 )
								ret := -0.857143 // sell
							if( basis_minus > 0.486574 )
								ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_NIO_5Min_e8e89c78(upper_2, basis, lower_6, basis_minus, lower_5, upper_5, upper_4, basis_max, upper_6, upper_3, lower_2, upper_1, lower_4, lower_1, lower_3)

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


