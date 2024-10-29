//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: AMD_30Min_1FIB_6c4ed79d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMD_30Min_1FIB_6c4ed79d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMD_30Min_6c4ed79d(basis_max, upper_1, lower_2, upper_2, lower_3, lower_6, basis_minus, lower_4, upper_4, upper_5, basis, upper_3, lower_5, upper_6, lower_1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( upper_3 <= 7.16209 )
		if( basis_max <= -0.175855 )
			if( upper_3 <= 7.05304 )
				if( basis_minus <= 0.60651 )
					if( upper_2 <= 6.98453 )
						if( lower_4 <= 4.97027 )
							if( upper_6 <= 5.58385 )
								if( lower_2 <= 2.13343 )
									ret := 0.099206
								if( lower_2 > 2.13343 )
									ret := 0.260985
							if( upper_6 > 5.58385 )
								if( upper_2 <= 5.49674 )
									ret := -0.234694
								if( upper_2 > 5.49674 )
									ret := -1.000000 // sell
						if( lower_4 > 4.97027 )
							if( upper_5 <= 6.37073 )
								if( lower_4 <= 5.37282 )
									ret := 0.980000 // buy
								if( lower_4 > 5.37282 )
									ret := 0.629630
							if( upper_5 > 6.37073 )
								if( lower_4 <= 6.50789 )
									ret := 0.307605
								if( lower_4 > 6.50789 )
									ret := 0.860465 // buy
					if( upper_2 > 6.98453 )
						if( lower_1 <= 6.70467 )
							if( upper_4 <= 7.09647 )
								ret := -0.750000 // sell
							if( upper_4 > 7.09647 )
								ret := -1.000000 // sell
						if( lower_1 > 6.70467 )
							if( upper_2 <= 6.99655 )
								if( lower_1 <= 6.71749 )
									ret := 0.428571
								if( lower_1 > 6.71749 )
									ret := 0.000000
							if( upper_2 > 6.99655 )
								if( lower_1 <= 6.71907 )
									ret := -1.000000 // sell
								if( lower_1 > 6.71907 )
									ret := -0.473684
				if( basis_minus > 0.60651 )
					if( lower_6 <= 5.93499 )
						if( lower_5 <= 4.74931 )
							if( upper_3 <= 5.49807 )
								if( upper_5 <= 5.62392 )
									ret := -0.019257
								if( upper_5 > 5.62392 )
									ret := 0.764706 // buy
							if( upper_3 > 5.49807 )
								if( upper_3 <= 5.58795 )
									ret := -0.754386 // sell
								if( upper_3 > 5.58795 )
									ret := -0.039216
						if( lower_5 > 4.74931 )
							if( lower_2 <= 5.32225 )
								if( basis_minus <= 0.670981 )
									ret := -0.333333
								if( basis_minus > 0.670981 )
									ret := 0.863636 // buy
							if( lower_2 > 5.32225 )
								if( basis <= 5.99719 )
									ret := -0.240000
								if( basis > 5.99719 )
									ret := 0.379630
					if( lower_6 > 5.93499 )
						if( lower_3 <= 6.27407 )
							if( lower_1 <= 6.43689 )
								if( basis_minus <= 0.623729 )
									ret := -0.928571 // sell
								if( basis_minus > 0.623729 )
									ret := 0.000000
							if( lower_1 > 6.43689 )
								if( upper_1 <= 6.74982 )
									ret := -0.875000 // sell
								if( upper_1 > 6.74982 )
									ret := -1.000000 // sell
						if( lower_3 > 6.27407 )
							if( upper_6 <= 7.28857 )
								if( lower_6 <= 5.94637 )
									ret := 0.625000
								if( lower_6 > 5.94637 )
									ret := 0.137931
							if( upper_6 > 7.28857 )
								if( basis <= 6.6899 )
									ret := -0.466667
								if( basis > 6.6899 )
									ret := -0.913043 // sell
			if( upper_3 > 7.05304 )
				if( lower_6 <= 6.31971 )
					if( upper_5 <= 7.24965 )
						if( upper_2 <= 7.00762 )
							if( lower_4 <= 6.41547 )
								if( lower_5 <= 6.32593 )
									ret := 0.200000
								if( lower_5 > 6.32593 )
									ret := -0.500000
							if( lower_4 > 6.41547 )
								if( upper_6 <= 7.35268 )
									ret := 0.333333
								if( upper_6 > 7.35268 )
									ret := 1.000000 // buy
						if( upper_2 > 7.00762 )
							if( lower_6 <= 6.21139 )
								ret := -0.250000
							if( lower_6 > 6.21139 )
								ret := -1.000000 // sell
					if( upper_5 > 7.24965 )
						if( basis <= 6.71076 )
							if( upper_1 <= 6.88228 )
								if( upper_6 <= 7.45119 )
									ret := -0.277778
								if( upper_6 > 7.45119 )
									ret := 0.575758
							if( upper_1 > 6.88228 )
								if( upper_3 <= 7.12532 )
									ret := -1.000000 // sell
								if( upper_3 > 7.12532 )
									ret := -0.500000
						if( basis > 6.71076 )
							if( basis_minus <= 0.615075 )
								if( upper_1 <= 6.93848 )
									ret := -0.500000
								if( upper_1 > 6.93848 )
									ret := 0.571429
							if( basis_minus > 0.615075 )
								if( upper_4 <= 7.15738 )
									ret := 0.461538
								if( upper_4 > 7.15738 )
									ret := 0.916667 // buy
				if( lower_6 > 6.31971 )
					if( lower_2 <= 6.64435 )
						ret := 1.000000 // buy
					if( lower_2 > 6.64435 )
						if( basis_max <= -0.456606 )
							ret := -0.400000
						if( basis_max > -0.456606 )
							if( basis <= 6.839 )
								if( lower_1 <= 6.7254 )
									ret := 0.777778 // buy
								if( lower_1 > 6.7254 )
									ret := 1.000000 // buy
							if( basis > 6.839 )
								ret := 0.400000
		if( basis_max > -0.175855 )
			if( lower_5 <= 3.5052 )
				if( upper_1 <= 1.93652 )
					if( lower_5 <= 1.79666 )
						if( basis <= 1.90211 )
							ret := 1.000000 // buy
						if( basis > 1.90211 )
							ret := 0.750000 // buy
					if( lower_5 > 1.79666 )
						ret := -0.600000
				if( upper_1 > 1.93652 )
					if( upper_5 <= 2.86038 )
						if( basis_max <= -0.171089 )
							if( upper_3 <= 1.99582 )
								ret := 0.857143 // buy
							if( upper_3 > 1.99582 )
								ret := 0.200000
						if( basis_max > -0.171089 )
							if( basis <= 1.90301 )
								ret := 0.250000
							if( basis > 1.90301 )
								if( upper_3 <= 2.82033 )
									ret := -0.643478
								if( upper_3 > 2.82033 )
									ret := -0.944444 // sell
					if( upper_5 > 2.86038 )
						if( lower_6 <= 2.61268 )
							if( upper_5 <= 2.86269 )
								if( upper_6 <= 2.89876 )
									ret := 0.833333 // buy
								if( upper_6 > 2.89876 )
									ret := -0.523810
							if( upper_5 > 2.86269 )
								if( lower_3 <= 2.65954 )
									ret := 0.321429
								if( lower_3 > 2.65954 )
									ret := 0.765957 // buy
						if( lower_6 > 2.61268 )
							if( lower_6 <= 2.61885 )
								if( lower_1 <= 2.72258 )
									ret := -0.777778 // sell
								if( lower_1 > 2.72258 )
									ret := -0.115385
							if( lower_6 > 2.61885 )
								if( upper_1 <= 2.85515 )
									ret := -0.716216 // sell
								if( upper_1 > 2.85515 )
									ret := -0.176471
			if( lower_5 > 3.5052 )
				if( lower_3 <= 3.57425 )
					if( upper_5 <= 3.76564 )
						if( lower_2 <= 3.58035 )
							ret := 1.000000 // buy
						if( lower_2 > 3.58035 )
							ret := 0.400000
					if( upper_5 > 3.76564 )
						if( basis_max <= -0.166863 )
							ret := 0.000000
						if( basis_max > -0.166863 )
							ret := -1.000000 // sell
				if( lower_3 > 3.57425 )
					if( basis_max <= -0.155648 )
						ret := 0.750000 // buy
					if( basis_max > -0.155648 )
						ret := 1.000000 // buy
	if( upper_3 > 7.16209 )
		if( upper_5 <= 7.89795 )
			if( upper_2 <= 7.45427 )
				if( upper_3 <= 7.32113 )
					if( lower_6 <= 4.48095 )
						if( basis_minus <= 1.97115 )
							if( basis_minus <= 1.95219 )
								if( basis_max <= -1.93611 )
									ret := -0.607143
								if( basis_max > -1.93611 )
									ret := 0.192308
							if( basis_minus > 1.95219 )
								if( upper_2 <= 7.04817 )
									ret := 0.647059
								if( upper_2 > 7.04817 )
									ret := -0.166667
						if( basis_minus > 1.97115 )
							if( upper_5 <= 7.78383 )
								if( upper_5 <= 7.75593 )
									ret := -0.750000 // sell
								if( upper_5 > 7.75593 )
									ret := -1.000000 // sell
							if( upper_5 > 7.78383 )
								ret := -0.200000
					if( lower_6 > 4.48095 )
						if( upper_2 <= 7.08615 )
							if( upper_1 <= 6.80603 )
								if( upper_4 <= 7.45565 )
									ret := -0.250000
								if( upper_4 > 7.45565 )
									ret := -0.840000 // sell
							if( upper_1 > 6.80603 )
								if( upper_2 <= 7.04809 )
									ret := -0.958333 // sell
								if( upper_2 > 7.04809 )
									ret := -1.000000 // sell
						if( upper_2 > 7.08615 )
							if( basis_max <= -0.639549 )
								if( upper_4 <= 7.28008 )
									ret := 1.000000 // buy
								if( upper_4 > 7.28008 )
									ret := -0.344828
							if( basis_max > -0.639549 )
								if( lower_4 <= 6.5078 )
									ret := -0.250000
								if( lower_4 > 6.5078 )
									ret := -1.000000 // sell
				if( upper_3 > 7.32113 )
					if( lower_6 <= 6.29467 )
						if( lower_5 <= 6.38857 )
							if( basis_max <= -0.938919 )
								if( upper_4 <= 7.60319 )
									ret := 0.645161
								if( upper_4 > 7.60319 )
									ret := -0.368421
							if( basis_max > -0.938919 )
								if( lower_6 <= 6.05219 )
									ret := -0.870968 // sell
								if( lower_6 > 6.05219 )
									ret := 0.068966
						if( lower_5 > 6.38857 )
							if( lower_3 <= 6.66331 )
								ret := 1.000000 // buy
							if( lower_3 > 6.66331 )
								if( lower_4 <= 6.58324 )
									ret := -0.090909
								if( lower_4 > 6.58324 )
									ret := 0.827586 // buy
					if( lower_6 > 6.29467 )
						if( upper_5 <= 7.60425 )
							ret := -1.000000 // sell
						if( upper_5 > 7.60425 )
							if( basis <= 7.04992 )
								if( basis <= 7.03905 )
									ret := -0.750000 // sell
								if( basis > 7.03905 )
									ret := -0.400000
							if( basis > 7.04992 )
								ret := -1.000000 // sell
			if( upper_2 > 7.45427 )
				if( upper_6 <= 7.89454 )
					ret := 0.285714
				if( upper_6 > 7.89454 )
					if( upper_4 <= 7.66234 )
						if( upper_3 <= 7.55805 )
							if( basis_minus <= 0.833689 )
								ret := -0.857143 // sell
							if( basis_minus > 0.833689 )
								ret := -0.500000
						if( upper_3 > 7.55805 )
							if( lower_3 <= 6.81473 )
								if( lower_3 <= 6.75237 )
									ret := 0.250000
								if( lower_3 > 6.75237 )
									ret := 0.750000 // buy
							if( lower_3 > 6.81473 )
								if( upper_1 <= 7.37793 )
									ret := -0.666667
								if( upper_1 > 7.37793 )
									ret := 0.000000
					if( upper_4 > 7.66234 )
						if( basis_max <= -0.96524 )
							ret := 0.400000
						if( basis_max > -0.96524 )
							if( upper_2 <= 7.46898 )
								ret := -1.000000 // sell
							if( upper_2 > 7.46898 )
								if( basis_minus <= 0.959043 )
									ret := -0.616915
								if( basis_minus > 0.959043 )
									ret := 0.000000
		if( upper_5 > 7.89795 )
			if( lower_5 <= 174.592 )
				if( upper_4 <= 11.0972 )
					if( lower_4 <= 9.89221 )
						if( upper_6 <= 11.5528 )
							if( lower_1 <= 10.1043 )
								if( lower_1 <= 10.0569 )
									ret := 0.148014
								if( lower_1 > 10.0569 )
									ret := -0.456693
							if( lower_1 > 10.1043 )
								if( lower_3 <= 9.911 )
									ret := 0.672727
								if( lower_3 > 9.911 )
									ret := 0.040000
						if( upper_6 > 11.5528 )
							if( upper_4 <= 11.0616 )
								if( upper_6 <= 11.6213 )
									ret := 0.970588 // buy
								if( upper_6 > 11.6213 )
									ret := 0.750000 // buy
							if( upper_4 > 11.0616 )
								if( upper_4 <= 11.0856 )
									ret := 0.000000
								if( upper_4 > 11.0856 )
									ret := 0.500000
					if( lower_4 > 9.89221 )
						if( basis_minus <= 0.724688 )
							if( upper_5 <= 11.1376 )
								if( basis_max <= -0.69684 )
									ret := -0.600000
								if( basis_max > -0.69684 )
									ret := 0.656250
							if( upper_5 > 11.1376 )
								if( upper_1 <= 10.8165 )
									ret := 1.000000 // buy
								if( upper_1 > 10.8165 )
									ret := 0.789474 // buy
						if( basis_minus > 0.724688 )
							if( upper_1 <= 10.77 )
								if( upper_1 <= 10.7575 )
									ret := 0.333333
								if( upper_1 > 10.7575 )
									ret := 1.000000 // buy
							if( upper_1 > 10.77 )
								if( lower_2 <= 10.333 )
									ret := 0.000000
								if( lower_2 > 10.333 )
									ret := -0.250000
				if( upper_4 > 11.0972 )
					if( upper_3 <= 86.3903 )
						if( lower_1 <= 14.3607 )
							if( basis <= 14.52 )
								if( upper_4 <= 14.4298 )
									ret := 0.045695
								if( upper_4 > 14.4298 )
									ret := -0.097930
							if( basis > 14.52 )
								if( upper_2 <= 15.5053 )
									ret := -0.721429 // sell
								if( upper_2 > 15.5053 )
									ret := 0.400000
						if( lower_1 > 14.3607 )
							if( lower_4 <= 14.458 )
								if( upper_5 <= 16.1022 )
									ret := -0.111111
								if( upper_5 > 16.1022 )
									ret := 0.692308
							if( lower_4 > 14.458 )
								if( upper_5 <= 28.4613 )
									ret := 0.131989
								if( upper_5 > 28.4613 )
									ret := 0.051487
					if( upper_3 > 86.3903 )
						if( lower_2 <= 81.87 )
							if( lower_5 <= 78.9547 )
								if( basis_max <= -10.0268 )
									ret := -0.223493
								if( basis_max > -10.0268 )
									ret := 0.161417
							if( lower_5 > 78.9547 )
								if( upper_6 <= 89.8115 )
									ret := -0.135135
								if( upper_6 > 89.8115 )
									ret := -0.794326 // sell
						if( lower_2 > 81.87 )
							if( lower_1 <= 89.0978 )
								if( upper_2 <= 87.1572 )
									ret := -0.090764
								if( upper_2 > 87.1572 )
									ret := 0.150033
							if( lower_1 > 89.0978 )
								if( lower_2 <= 89.3823 )
									ret := -0.197285
								if( lower_2 > 89.3823 )
									ret := 0.024208
			if( lower_5 > 174.592 )
				if( basis_minus <= 25.0991 )
					if( upper_6 <= 185.257 )
						if( lower_1 <= 178.029 )
							ret := 0.333333
						if( lower_1 > 178.029 )
							ret := 1.000000 // buy
					if( upper_6 > 185.257 )
						if( basis <= 207.867 )
							if( lower_5 <= 175.206 )
								if( lower_4 <= 175.657 )
									ret := 0.071429
								if( lower_4 > 175.657 )
									ret := -0.817073 // sell
							if( lower_5 > 175.206 )
								if( lower_5 <= 180.449 )
									ret := -0.070588
								if( lower_5 > 180.449 )
									ret := -0.457143
						if( basis > 207.867 )
							if( lower_5 <= 197.115 )
								ret := 1.000000 // buy
							if( lower_5 > 197.115 )
								if( basis_minus <= 14.1427 )
									ret := 0.250000
								if( basis_minus > 14.1427 )
									ret := 0.000000
				if( basis_minus > 25.0991 )
					if( lower_2 <= 191.648 )
						if( upper_1 <= 209.566 )
							if( lower_4 <= 183.566 )
								ret := 0.500000
							if( lower_4 > 183.566 )
								ret := 0.142857
						if( upper_1 > 209.566 )
							ret := 0.000000
					if( lower_2 > 191.648 )
						if( basis_max <= -25.4111 )
							ret := 1.000000 // buy
						if( basis_max > -25.4111 )
							ret := 0.500000
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_AMD_30Min_6c4ed79d(basis_max, upper_1, lower_2, upper_2, lower_3, lower_6, basis_minus, lower_4, upper_4, upper_5, basis, upper_3, lower_5, upper_6, lower_1)

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


