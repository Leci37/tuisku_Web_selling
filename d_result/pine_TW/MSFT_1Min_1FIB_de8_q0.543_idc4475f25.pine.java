//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: MSFT_1Min_1FIB_c4475f25 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_1Min_1FIB_c4475f25", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_1Min_c4475f25(upper_2, basis, lower_6, basis_minus, lower_5, upper_5, upper_4, basis_max, upper_6, upper_3, lower_2, upper_1, lower_4, lower_1, lower_3)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( lower_1 <= 398.611 )
		if( upper_1 <= 400.882 )
			if( upper_3 <= 397.744 )
				if( lower_6 <= 380.841 )
					if( basis_minus <= 11.5571 )
						if( lower_2 <= 387.723 )
							if( basis_max <= -11.3134 )
								ret := 1.000000 // buy
							if( basis_max > -11.3134 )
								if( basis_minus <= 11.2845 )
									ret := 0.983607 // buy
								if( basis_minus > 11.2845 )
									ret := 0.750000 // buy
						if( lower_2 > 387.723 )
							ret := 0.500000
					if( basis_minus > 11.5571 )
						if( basis_max <= -11.7039 )
							if( upper_1 <= 394.579 )
								if( lower_1 <= 388.865 )
									ret := 1.000000 // buy
								if( lower_1 > 388.865 )
									ret := 0.833333 // buy
							if( upper_1 > 394.579 )
								ret := 0.400000
						if( basis_max > -11.7039 )
							ret := -0.500000
				if( lower_6 > 380.841 )
					if( upper_3 <= 395.358 )
						if( upper_5 <= 396.172 )
							if( upper_6 <= 397.808 )
								if( lower_6 <= 388.948 )
									ret := 0.048696
								if( lower_6 > 388.948 )
									ret := 0.374016
							if( upper_6 > 397.808 )
								if( basis_max <= -8.14164 )
									ret := 0.500000
								if( basis_max > -8.14164 )
									ret := 0.975610 // buy
						if( upper_5 > 396.172 )
							if( upper_6 <= 397.356 )
								if( upper_4 <= 395.646 )
									ret := 0.200000
								if( upper_4 > 395.646 )
									ret := -0.819672 // sell
							if( upper_6 > 397.356 )
								if( lower_1 <= 390.486 )
									ret := -0.485149
								if( lower_1 > 390.486 )
									ret := 0.394737
					if( upper_3 > 395.358 )
						if( lower_4 <= 385.43 )
							if( lower_4 <= 385.261 )
								if( upper_3 <= 396.677 )
									ret := 1.000000 // buy
								if( upper_3 > 396.677 )
									ret := -0.166667
							if( lower_4 > 385.261 )
								if( upper_1 <= 394.579 )
									ret := -0.750000 // sell
								if( upper_1 > 394.579 )
									ret := 0.000000
						if( lower_4 > 385.43 )
							if( upper_1 <= 396.469 )
								if( basis_minus <= 2.6474 )
									ret := 0.905660 // buy
								if( basis_minus > 2.6474 )
									ret := 0.381643
							if( upper_1 > 396.469 )
								if( lower_1 <= 395.815 )
									ret := -0.090909
								if( lower_1 > 395.815 )
									ret := 0.506329
			if( upper_3 > 397.744 )
				if( upper_1 <= 396.5 )
					if( upper_4 <= 399.084 )
						if( lower_2 <= 393.059 )
							if( basis_minus <= 6.66544 )
								if( lower_5 <= 390.768 )
									ret := -0.750000 // sell
								if( lower_5 > 390.768 )
									ret := -1.000000 // sell
							if( basis_minus > 6.66544 )
								ret := -1.000000 // sell
						if( lower_2 > 393.059 )
							ret := -0.333333
					if( upper_4 > 399.084 )
						if( basis <= 392.863 )
							if( upper_1 <= 394.56 )
								ret := 1.000000 // buy
							if( upper_1 > 394.56 )
								if( upper_4 <= 399.103 )
									ret := 0.571429
								if( upper_4 > 399.103 )
									ret := -0.666667
						if( basis > 392.863 )
							if( lower_1 <= 389.904 )
								if( lower_2 <= 387.942 )
									ret := 1.000000 // buy
								if( lower_2 > 387.942 )
									ret := 0.500000
							if( lower_1 > 389.904 )
								if( lower_3 <= 386.36 )
									ret := 0.500000
								if( lower_3 > 386.36 )
									ret := -1.000000 // sell
				if( upper_1 > 396.5 )
					if( upper_1 <= 396.874 )
						if( lower_3 <= 393.475 )
							if( lower_5 <= 390.27 )
								if( basis_minus <= 6.84307 )
									ret := -0.741935 // sell
								if( basis_minus > 6.84307 )
									ret := 0.526786
							if( lower_5 > 390.27 )
								if( lower_6 <= 390.759 )
									ret := 0.785714 // buy
								if( lower_6 > 390.759 )
									ret := 0.052632
						if( lower_3 > 393.475 )
							ret := -1.000000 // sell
					if( upper_1 > 396.874 )
						if( basis_max <= -6.80462 )
							if( upper_3 <= 399.777 )
								if( upper_2 <= 397.993 )
									ret := 0.400000
								if( upper_2 > 397.993 )
									ret := -0.736364 // sell
							if( upper_3 > 399.777 )
								if( basis <= 397.173 )
									ret := 0.157088
								if( basis > 397.173 )
									ret := -0.680000
						if( basis_max > -6.80462 )
							if( lower_3 <= 395.57 )
								if( upper_6 <= 403.641 )
									ret := 0.236631
								if( upper_6 > 403.641 )
									ret := 0.820513 // buy
							if( lower_3 > 395.57 )
								if( upper_1 <= 398.272 )
									ret := -0.413793
								if( upper_1 > 398.272 )
									ret := 0.093257
		if( upper_1 > 400.882 )
			if( basis_minus <= 25.586 )
				if( upper_2 <= 402.334 )
					if( upper_2 <= 401.925 )
						if( upper_2 <= 401.757 )
							ret := 1.000000 // buy
						if( upper_2 > 401.757 )
							if( lower_6 <= 393.221 )
								ret := 0.750000 // buy
							if( lower_6 > 393.221 )
								if( lower_5 <= 395.271 )
									ret := 0.000000
								if( lower_5 > 395.271 )
									ret := 0.571429
					if( upper_2 > 401.925 )
						if( basis <= 399.778 )
							if( upper_1 <= 401.105 )
								if( upper_2 <= 401.967 )
									ret := 1.000000 // buy
								if( upper_2 > 401.967 )
									ret := 0.852941 // buy
							if( upper_1 > 401.105 )
								ret := 1.000000 // buy
						if( basis > 399.778 )
							ret := 0.200000
				if( upper_2 > 402.334 )
					if( lower_5 <= 393.336 )
						if( upper_4 <= 413.284 )
							if( upper_5 <= 415.104 )
								if( upper_5 <= 407.967 )
									ret := 0.370968
								if( upper_5 > 407.967 )
									ret := 0.814516 // buy
							if( upper_5 > 415.104 )
								if( basis_max <= -24.6954 )
									ret := -0.125000
								if( basis_max > -24.6954 )
									ret := -0.838710 // sell
						if( upper_4 > 413.284 )
							if( basis_minus <= 17.5593 )
								ret := 0.500000
							if( basis_minus > 17.5593 )
								if( basis <= 398.454 )
									ret := 0.666667
								if( basis > 398.454 )
									ret := 0.949153 // buy
					if( lower_5 > 393.336 )
						if( basis <= 399.848 )
							if( lower_5 <= 393.642 )
								ret := -1.000000 // sell
							if( lower_5 > 393.642 )
								if( basis_max <= -7.7389 )
									ret := -0.500000
								if( basis_max > -7.7389 )
									ret := -0.750000 // sell
						if( basis > 399.848 )
							if( lower_6 <= 392.684 )
								if( basis_minus <= 7.70832 )
									ret := -0.666667
								if( basis_minus > 7.70832 )
									ret := 0.250000
							if( lower_6 > 392.684 )
								if( basis_minus <= 7.0055 )
									ret := -0.500000
								if( basis_minus > 7.0055 )
									ret := 0.689655
			if( basis_minus > 25.586 )
				if( upper_3 <= 417.818 )
					ret := -0.750000 // sell
				if( upper_3 > 417.818 )
					if( basis_minus <= 26.4568 )
						ret := -1.000000 // sell
					if( basis_minus > 26.4568 )
						ret := -0.750000 // sell
	if( lower_1 > 398.611 )
		if( lower_1 <= 399.897 )
			if( lower_2 <= 399.215 )
				if( lower_1 <= 399.572 )
					if( upper_3 <= 411.722 )
						if( upper_6 <= 417.282 )
							if( upper_1 <= 400.74 )
								if( upper_3 <= 401.59 )
									ret := -0.051515
								if( upper_3 > 401.59 )
									ret := 0.857143 // buy
							if( upper_1 > 400.74 )
								if( upper_3 <= 404.048 )
									ret := -0.457490
								if( upper_3 > 404.048 )
									ret := 0.047619
						if( upper_6 > 417.282 )
							if( upper_5 <= 416.003 )
								ret := 1.000000 // buy
							if( upper_5 > 416.003 )
								ret := 0.000000
					if( upper_3 > 411.722 )
						if( lower_5 <= 383.858 )
							if( upper_6 <= 434.281 )
								if( upper_6 <= 433.747 )
									ret := -0.750000 // sell
								if( upper_6 > 433.747 )
									ret := -1.000000 // sell
							if( upper_6 > 434.281 )
								if( upper_2 <= 416.718 )
									ret := 0.750000 // buy
								if( upper_2 > 416.718 )
									ret := 0.250000
						if( lower_5 > 383.858 )
							if( lower_6 <= 377.371 )
								if( lower_6 <= 377.202 )
									ret := -0.823529 // sell
								if( lower_6 > 377.202 )
									ret := -1.000000 // sell
							if( lower_6 > 377.371 )
								if( basis <= 405.367 )
									ret := -0.650000
								if( basis > 405.367 )
									ret := 0.500000
				if( lower_1 > 399.572 )
					if( basis_minus <= 3.70424 )
						if( basis_minus <= 3.69304 )
							if( lower_3 <= 398.748 )
								if( lower_1 <= 399.604 )
									ret := 0.555556
								if( lower_1 > 399.604 )
									ret := -0.368421
							if( lower_3 > 398.748 )
								if( upper_2 <= 401.632 )
									ret := -0.250000
								if( upper_2 > 401.632 )
									ret := 0.827586 // buy
						if( basis_minus > 3.69304 )
							if( lower_4 <= 398.172 )
								ret := 0.833333 // buy
							if( lower_4 > 398.172 )
								ret := 1.000000 // buy
					if( basis_minus > 3.70424 )
						if( basis_minus <= 4.99347 )
							if( lower_2 <= 399.085 )
								if( upper_4 <= 402.832 )
									ret := -0.937500 // sell
								if( upper_4 > 402.832 )
									ret := -0.600000
							if( lower_2 > 399.085 )
								if( upper_2 <= 402.055 )
									ret := 0.300000
								if( upper_2 > 402.055 )
									ret := -0.388889
						if( basis_minus > 4.99347 )
							if( upper_6 <= 441.573 )
								if( lower_3 <= 391.289 )
									ret := -0.750000 // sell
								if( lower_3 > 391.289 )
									ret := 0.128378
							if( upper_6 > 441.573 )
								if( lower_1 <= 399.652 )
									ret := 0.444444
								if( lower_1 > 399.652 )
									ret := 1.000000 // buy
			if( lower_2 > 399.215 )
				if( upper_2 <= 401.722 )
					if( lower_5 <= 398.151 )
						ret := -0.750000 // sell
					if( lower_5 > 398.151 )
						ret := -1.000000 // sell
				if( upper_2 > 401.722 )
					if( upper_2 <= 401.95 )
						if( lower_1 <= 399.842 )
							if( upper_3 <= 402.259 )
								ret := -0.250000
							if( upper_3 > 402.259 )
								ret := 0.250000
						if( lower_1 > 399.842 )
							if( upper_6 <= 403.645 )
								ret := 1.000000 // buy
							if( upper_6 > 403.645 )
								ret := 0.750000 // buy
					if( upper_2 > 401.95 )
						if( upper_3 <= 402.494 )
							if( upper_2 <= 401.992 )
								ret := -0.500000
							if( upper_2 > 401.992 )
								if( upper_1 <= 401.522 )
									ret := -1.000000 // sell
								if( upper_1 > 401.522 )
									ret := -0.750000 // sell
						if( upper_3 > 402.494 )
							if( lower_6 <= 396.999 )
								ret := -1.000000 // sell
							if( lower_6 > 396.999 )
								if( upper_5 <= 403.519 )
									ret := -0.400000
								if( upper_5 > 403.519 )
									ret := 0.857143 // buy
		if( lower_1 > 399.897 )
			if( basis_max <= -2.26885 )
				if( upper_5 <= 405.704 )
					if( lower_1 <= 399.994 )
						if( lower_1 <= 399.914 )
							ret := -0.333333
						if( lower_1 > 399.914 )
							if( upper_2 <= 402.424 )
								if( upper_4 <= 403.28 )
									ret := -0.769231 // sell
								if( upper_4 > 403.28 )
									ret := -1.000000 // sell
							if( upper_2 > 402.424 )
								ret := -0.600000
					if( lower_1 > 399.994 )
						if( lower_4 <= 400.054 )
							if( lower_1 <= 400.96 )
								if( basis <= 401.535 )
									ret := 0.136240
								if( basis > 401.535 )
									ret := 0.810811 // buy
							if( lower_1 > 400.96 )
								if( upper_4 <= 405.082 )
									ret := -0.521739
								if( upper_4 > 405.082 )
									ret := 0.812500 // buy
						if( lower_4 > 400.054 )
							if( basis_minus <= 3.45009 )
								if( upper_5 <= 405.643 )
									ret := 0.370968
								if( upper_5 > 405.643 )
									ret := -0.500000
							if( basis_minus > 3.45009 )
								if( upper_4 <= 405.172 )
									ret := 0.863636 // buy
								if( upper_4 > 405.172 )
									ret := -0.285714
				if( upper_5 > 405.704 )
					if( upper_4 <= 405.49 )
						if( upper_6 <= 406.415 )
							if( basis_minus <= 2.36456 )
								if( upper_4 <= 405.452 )
									ret := -0.375000
								if( upper_4 > 405.452 )
									ret := 0.166667
							if( basis_minus > 2.36456 )
								if( upper_3 <= 405.113 )
									ret := 0.310345
								if( upper_3 > 405.113 )
									ret := 0.666667
						if( upper_6 > 406.415 )
							if( lower_2 <= 401.925 )
								if( lower_5 <= 400.563 )
									ret := -0.191406
								if( lower_5 > 400.563 )
									ret := 0.814815 // buy
							if( lower_2 > 401.925 )
								if( upper_1 <= 404.141 )
									ret := -0.889908 // sell
								if( upper_1 > 404.141 )
									ret := -0.232558
					if( upper_4 > 405.49 )
						if( upper_1 <= 403.305 )
							if( lower_4 <= 398.162 )
								if( lower_3 <= 398.311 )
									ret := 1.000000 // buy
								if( lower_3 > 398.311 )
									ret := 0.250000
							if( lower_4 > 398.162 )
								if( upper_6 <= 407.76 )
									ret := 1.000000 // buy
								if( upper_6 > 407.76 )
									ret := 0.750000 // buy
						if( upper_1 > 403.305 )
							if( lower_3 <= 451.543 )
								if( upper_2 <= 451.046 )
									ret := 0.029259
								if( upper_2 > 451.046 )
									ret := 0.183521
							if( lower_3 > 451.543 )
								if( upper_4 <= 468.096 )
									ret := -0.076233
								if( upper_4 > 468.096 )
									ret := 0.367347
			if( basis_max > -2.26885 )
				if( upper_5 <= 443.64 )
					if( upper_6 <= 402.288 )
						if( lower_6 <= 399.88 )
							ret := 0.000000
						if( lower_6 > 399.88 )
							if( upper_5 <= 401.993 )
								ret := -1.000000 // sell
							if( upper_5 > 401.993 )
								if( lower_1 <= 400.798 )
									ret := -0.500000
								if( lower_1 > 400.798 )
									ret := -1.000000 // sell
					if( upper_6 > 402.288 )
						if( upper_1 <= 442.852 )
							if( upper_4 <= 443.332 )
								if( basis <= 401.006 )
									ret := 0.537313
								if( basis > 401.006 )
									ret := 0.053369
							if( upper_4 > 443.332 )
								if( lower_4 <= 441.476 )
									ret := 0.400000
								if( lower_4 > 441.476 )
									ret := 0.950000 // buy
						if( upper_1 > 442.852 )
							if( upper_2 <= 443.073 )
								if( basis_max <= -1.4428 )
									ret := -0.600000
								if( basis_max > -1.4428 )
									ret := -1.000000 // sell
							if( upper_2 > 443.073 )
								if( upper_3 <= 443.251 )
									ret := 0.166667
								if( upper_3 > 443.251 )
									ret := -0.777778 // sell
				if( upper_5 > 443.64 )
					if( upper_6 <= 467.904 )
						if( lower_4 <= 446.837 )
							if( lower_2 <= 447.13 )
								if( upper_1 <= 442.874 )
									ret := 0.769231 // buy
								if( upper_1 > 442.874 )
									ret := 0.201183
							if( lower_2 > 447.13 )
								if( lower_2 <= 447.17 )
									ret := 0.807018 // buy
								if( lower_2 > 447.17 )
									ret := 0.445455
						if( lower_4 > 446.837 )
							if( basis_max <= -2.14568 )
								if( upper_2 <= 451.56 )
									ret := 0.610169
								if( upper_2 > 451.56 )
									ret := 0.159836
							if( basis_max > -2.14568 )
								if( upper_4 <= 460.354 )
									ret := 0.053260
								if( upper_4 > 460.354 )
									ret := 0.261346
					if( upper_6 > 467.904 )
						if( basis_minus <= 2.10636 )
							if( upper_1 <= 467.456 )
								if( upper_6 <= 468.497 )
									ret := -0.142857
								if( upper_6 > 468.497 )
									ret := 0.212121
							if( upper_1 > 467.456 )
								if( lower_3 <= 466.305 )
									ret := -0.814815 // sell
								if( lower_3 > 466.305 )
									ret := -0.214286
						if( basis_minus > 2.10636 )
							if( lower_2 <= 465.353 )
								if( lower_6 <= 463.637 )
									ret := -0.375000
								if( lower_6 > 463.637 )
									ret := 0.000000
							if( lower_2 > 465.353 )
								if( upper_5 <= 468.256 )
									ret := -1.000000 // sell
								if( upper_5 > 468.256 )
									ret := -0.200000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_MSFT_1Min_c4475f25(upper_2, basis, lower_6, basis_minus, lower_5, upper_5, upper_4, basis_max, upper_6, upper_3, lower_2, upper_1, lower_4, lower_1, lower_3)

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


