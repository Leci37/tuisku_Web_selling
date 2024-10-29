//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: BABA_30Min_1FIB_9b2516e1 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BABA_30Min_1FIB_9b2516e1", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BABA_30Min_9b2516e1(basis_max, upper_1, lower_2, upper_2, lower_3, lower_6, basis_minus, lower_4, upper_4, upper_5, basis, upper_3, lower_5, upper_6, lower_1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( basis_max <= -4.17011 )
		if( lower_1 <= 62.0201 )
			if( lower_5 <= 58.9216 )
				if( lower_1 <= 61.8897 )
					if( lower_2 <= 60.2972 )
						if( basis <= 62.9171 )
							if( lower_4 <= 58.8195 )
								if( upper_2 <= 65.5572 )
									ret := -0.250000
								if( upper_2 > 65.5572 )
									ret := 0.100000
							if( lower_4 > 58.8195 )
								if( lower_2 <= 60.2217 )
									ret := 0.750000 // buy
								if( lower_2 > 60.2217 )
									ret := 1.000000 // buy
						if( basis > 62.9171 )
							if( basis_minus <= 16.3686 )
								if( lower_4 <= 55.6341 )
									ret := 1.000000 // buy
								if( lower_4 > 55.6341 )
									ret := 0.769231 // buy
							if( basis_minus > 16.3686 )
								if( lower_2 <= 59.3241 )
									ret := -0.142857
								if( lower_2 > 59.3241 )
									ret := 1.000000 // buy
					if( lower_2 > 60.2972 )
						if( upper_3 <= 67.074 )
							if( upper_4 <= 67.3023 )
								if( basis <= 62.5372 )
									ret := 0.833333 // buy
								if( basis > 62.5372 )
									ret := 0.111111
							if( upper_4 > 67.3023 )
								ret := 1.000000 // buy
						if( upper_3 > 67.074 )
							if( upper_3 <= 69.0233 )
								if( basis_minus <= 7.71816 )
									ret := -1.000000 // sell
								if( basis_minus > 7.71816 )
									ret := -0.263158
							if( upper_3 > 69.0233 )
								ret := 0.600000
				if( lower_1 > 61.8897 )
					if( basis_minus <= 14.6654 )
						if( upper_6 <= 69.166 )
							ret := 1.000000 // buy
						if( upper_6 > 69.166 )
							if( basis <= 63.8034 )
								if( basis_max <= -7.92736 )
									ret := 0.000000
								if( basis_max > -7.92736 )
									ret := 0.636364
							if( basis > 63.8034 )
								if( upper_5 <= 74.9872 )
									ret := 0.833333 // buy
								if( upper_5 > 74.9872 )
									ret := 0.250000
					if( basis_minus > 14.6654 )
						ret := -0.500000
			if( lower_5 > 58.9216 )
				if( lower_3 <= 60.2608 )
					if( basis_minus <= 4.62643 )
						if( upper_6 <= 67.0631 )
							ret := -1.000000 // sell
						if( upper_6 > 67.0631 )
							ret := -0.750000 // sell
					if( basis_minus > 4.62643 )
						ret := 0.000000
				if( lower_3 > 60.2608 )
					if( lower_2 <= 61.0772 )
						if( lower_2 <= 60.8506 )
							if( lower_1 <= 61.4322 )
								if( basis_max <= -4.22638 )
									ret := 0.250000
								if( basis_max > -4.22638 )
									ret := 1.000000 // buy
							if( lower_1 > 61.4322 )
								ret := 1.000000 // buy
						if( lower_2 > 60.8506 )
							if( lower_1 <= 61.6124 )
								if( lower_3 <= 60.2938 )
									ret := 0.400000
								if( lower_3 > 60.2938 )
									ret := -0.125000
							if( lower_1 > 61.6124 )
								ret := 0.714286 // buy
					if( lower_2 > 61.0772 )
						if( lower_5 <= 59.001 )
							if( lower_5 <= 58.9391 )
								ret := -0.500000
							if( lower_5 > 58.9391 )
								ret := -1.000000 // sell
						if( lower_5 > 59.001 )
							ret := -0.250000
		if( lower_1 > 62.0201 )
			if( lower_2 <= 63.6246 )
				if( lower_4 <= 61.2311 )
					if( lower_1 <= 62.4315 )
						if( lower_1 <= 62.2674 )
							if( lower_6 <= 57.4717 )
								if( basis <= 65.323 )
									ret := 0.204082
								if( basis > 65.323 )
									ret := -0.466667
							if( lower_6 > 57.4717 )
								if( basis_minus <= 6.05416 )
									ret := -1.000000 // sell
								if( basis_minus > 6.05416 )
									ret := -0.777778 // sell
						if( lower_1 > 62.2674 )
							if( lower_5 <= 58.9143 )
								if( lower_2 <= 60.2796 )
									ret := 0.000000
								if( lower_2 > 60.2796 )
									ret := -0.901961 // sell
							if( lower_5 > 58.9143 )
								ret := 0.000000
					if( lower_1 > 62.4315 )
						if( lower_1 <= 62.8067 )
							if( lower_3 <= 60.3866 )
								if( basis_max <= -8.44426 )
									ret := 0.818182 // buy
								if( basis_max > -8.44426 )
									ret := 0.000000
							if( lower_3 > 60.3866 )
								if( basis_max <= -6.63177 )
									ret := 0.978261 // buy
								if( basis_max > -6.63177 )
									ret := 0.625000
						if( lower_1 > 62.8067 )
							if( lower_2 <= 62.2234 )
								if( basis <= 67.4065 )
									ret := -0.453608
								if( basis > 67.4065 )
									ret := 1.000000 // buy
							if( lower_2 > 62.2234 )
								if( upper_3 <= 74.2651 )
									ret := 0.326087
								if( upper_3 > 74.2651 )
									ret := 0.950000 // buy
				if( lower_4 > 61.2311 )
					if( lower_5 <= 61.4093 )
						if( upper_1 <= 68.475 )
							if( upper_2 <= 69.2728 )
								if( upper_3 <= 69.8878 )
									ret := -0.774648 // sell
								if( upper_3 > 69.8878 )
									ret := -0.105263
							if( upper_2 > 69.2728 )
								ret := -1.000000 // sell
						if( upper_1 > 68.475 )
							ret := 0.500000
					if( lower_5 > 61.4093 )
						ret := 0.833333 // buy
			if( lower_2 > 63.6246 )
				if( upper_6 <= 321.163 )
					if( lower_6 <= 59.0635 )
						if( lower_5 <= 61.438 )
							if( lower_5 <= 60.8326 )
								if( lower_4 <= 61.8593 )
									ret := 0.454545
								if( lower_4 > 61.8593 )
									ret := 0.857143 // buy
							if( lower_5 > 60.8326 )
								if( lower_3 <= 64.9563 )
									ret := -1.000000 // sell
								if( lower_3 > 64.9563 )
									ret := -0.032258
						if( lower_5 > 61.438 )
							if( lower_3 <= 76.1895 )
								if( lower_4 <= 67.1336 )
									ret := 0.682927
								if( lower_4 > 67.1336 )
									ret := 0.926606 // buy
							if( lower_3 > 76.1895 )
								if( lower_5 <= 67.9502 )
									ret := -0.777778 // sell
								if( lower_5 > 67.9502 )
									ret := 1.000000 // buy
					if( lower_6 > 59.0635 )
						if( basis_minus <= 47.8555 )
							if( basis_max <= -42.5271 )
								if( lower_5 <= 193.537 )
									ret := 0.230769
								if( lower_5 > 193.537 )
									ret := -0.421687
							if( basis_max > -42.5271 )
								if( upper_5 <= 111.352 )
									ret := 0.002383
								if( upper_5 > 111.352 )
									ret := 0.044271
						if( basis_minus > 47.8555 )
							if( basis_max <= -50.1432 )
								if( upper_6 <= 294.338 )
									ret := -0.937500 // sell
								if( upper_6 > 294.338 )
									ret := -0.500000
							if( basis_max > -50.1432 )
								if( upper_3 <= 269.512 )
									ret := 0.905263 // buy
								if( upper_3 > 269.512 )
									ret := 0.400000
				if( upper_6 > 321.163 )
					if( basis_max <= -28.1247 )
						if( basis <= 284.741 )
							if( upper_5 <= 312.066 )
								ret := 0.000000
							if( upper_5 > 312.066 )
								ret := 0.428571
						if( basis > 284.741 )
							if( lower_3 <= 278.077 )
								if( lower_2 <= 270.862 )
									ret := 0.555556
								if( lower_2 > 270.862 )
									ret := 0.931034 // buy
							if( lower_3 > 278.077 )
								if( basis_minus <= 29.3287 )
									ret := 0.813559 // buy
								if( basis_minus > 29.3287 )
									ret := -0.083333
					if( basis_max > -28.1247 )
						if( lower_5 <= 277.159 )
							if( lower_3 <= 282.819 )
								ret := -0.666667
							if( lower_3 > 282.819 )
								ret := -1.000000 // sell
						if( lower_5 > 277.159 )
							if( basis <= 299.997 )
								if( upper_1 <= 305.762 )
									ret := 0.903226 // buy
								if( upper_1 > 305.762 )
									ret := 0.083333
							if( basis > 299.997 )
								ret := -0.166667
	if( basis_max > -4.17011 )
		if( upper_5 <= 73.3838 )
			if( lower_6 <= 69.8428 )
				if( upper_2 <= 68.8737 )
					if( upper_6 <= 70.2468 )
						if( upper_5 <= 69.2135 )
							if( basis_max <= -4.13078 )
								ret := 0.000000
							if( basis_max > -4.13078 )
								if( upper_5 <= 65.509 )
									ret := 0.972973 // buy
								if( upper_5 > 65.509 )
									ret := 0.714286 // buy
						if( upper_5 > 69.2135 )
							if( upper_4 <= 68.932 )
								if( basis_max <= -2.73853 )
									ret := -0.341463
								if( basis_max > -2.73853 )
									ret := 0.666667
							if( upper_4 > 68.932 )
								if( lower_6 <= 64.409 )
									ret := 0.500000
								if( lower_6 > 64.409 )
									ret := 1.000000 // buy
					if( upper_6 > 70.2468 )
						if( lower_3 <= 65.1282 )
							ret := -0.250000
						if( lower_3 > 65.1282 )
							if( lower_5 <= 65.0484 )
								ret := -1.000000 // sell
							if( lower_5 > 65.0484 )
								ret := -0.250000
				if( upper_2 > 68.8737 )
					if( lower_2 <= 70.9985 )
						if( lower_3 <= 68.429 )
							if( upper_5 <= 72.8514 )
								if( upper_2 <= 70.8515 )
									ret := 0.666667
								if( upper_2 > 70.8515 )
									ret := 0.927536 // buy
							if( upper_5 > 72.8514 )
								if( lower_6 <= 65.6306 )
									ret := -0.666667
								if( lower_6 > 65.6306 )
									ret := 0.526316
						if( lower_3 > 68.429 )
							if( lower_5 <= 70.2505 )
								if( lower_5 <= 67.6202 )
									ret := 0.857143 // buy
								if( lower_5 > 67.6202 )
									ret := 0.076923
							if( lower_5 > 70.2505 )
								if( upper_6 <= 73.5604 )
									ret := 1.000000 // buy
								if( upper_6 > 73.5604 )
									ret := 0.500000
					if( lower_2 > 70.9985 )
						if( upper_4 <= 73.0529 )
							ret := 1.000000 // buy
						if( upper_4 > 73.0529 )
							if( lower_1 <= 71.3419 )
								ret := 0.200000
							if( lower_1 > 71.3419 )
								ret := 1.000000 // buy
			if( lower_6 > 69.8428 )
				if( upper_6 <= 73.5528 )
					if( basis_max <= -1.78831 )
						ret := -0.833333 // sell
					if( basis_max > -1.78831 )
						if( upper_6 <= 73.5029 )
							ret := 0.166667
						if( upper_6 > 73.5029 )
							if( lower_4 <= 70.898 )
								if( upper_6 <= 73.5213 )
									ret := -0.750000 // sell
								if( upper_6 > 73.5213 )
									ret := -0.250000
							if( lower_4 > 70.898 )
								ret := 0.000000
				if( upper_6 > 73.5528 )
					if( upper_5 <= 73.1606 )
						if( upper_1 <= 72.1676 )
							ret := 0.200000
						if( upper_1 > 72.1676 )
							ret := 0.857143 // buy
					if( upper_5 > 73.1606 )
						ret := -0.400000
		if( upper_5 > 73.3838 )
			if( lower_6 <= 69.8208 )
				if( upper_4 <= 73.1555 )
					if( upper_3 <= 72.4625 )
						ret := 0.250000
					if( upper_3 > 72.4625 )
						if( upper_1 <= 71.7339 )
							ret := -1.000000 // sell
						if( upper_1 > 71.7339 )
							if( basis <= 71.7408 )
								ret := 0.200000
							if( basis > 71.7408 )
								ret := -1.000000 // sell
				if( upper_4 > 73.1555 )
					if( lower_5 <= 70.1012 )
						if( upper_6 <= 74.1965 )
							if( lower_5 <= 69.943 )
								ret := 1.000000 // buy
							if( lower_5 > 69.943 )
								ret := 0.750000 // buy
						if( upper_6 > 74.1965 )
							if( upper_3 <= 73.0077 )
								if( upper_4 <= 73.2643 )
									ret := 0.090909
								if( upper_4 > 73.2643 )
									ret := -0.629630
							if( upper_3 > 73.0077 )
								if( upper_6 <= 75.5223 )
									ret := 0.357895
								if( upper_6 > 75.5223 )
									ret := -0.013158
					if( lower_5 > 70.1012 )
						if( upper_2 <= 74.7175 )
							if( upper_4 <= 75.5408 )
								if( basis_max <= -2.77481 )
									ret := -0.184466
								if( basis_max > -2.77481 )
									ret := -0.517241
							if( upper_4 > 75.5408 )
								if( lower_2 <= 71.7418 )
									ret := -0.750000 // sell
								if( lower_2 > 71.7418 )
									ret := -0.945946 // sell
						if( upper_2 > 74.7175 )
							if( lower_2 <= 71.9558 )
								if( lower_5 <= 70.3062 )
									ret := 0.272727
								if( lower_5 > 70.3062 )
									ret := 1.000000 // buy
							if( lower_2 > 71.9558 )
								if( lower_1 <= 72.8794 )
									ret := -0.260870
								if( lower_1 > 72.8794 )
									ret := 1.000000 // buy
			if( lower_6 > 69.8208 )
				if( lower_6 <= 70.1372 )
					if( basis <= 73.2709 )
						if( lower_3 <= 71.2651 )
							if( upper_5 <= 73.5465 )
								if( basis_max <= -2.02643 )
									ret := 0.933333 // buy
								if( basis_max > -2.02643 )
									ret := 0.166667
							if( upper_5 > 73.5465 )
								if( upper_4 <= 73.5899 )
									ret := -0.187500
								if( upper_4 > 73.5899 )
									ret := 0.095890
						if( lower_3 > 71.2651 )
							if( upper_2 <= 73.8752 )
								if( upper_1 <= 73.4174 )
									ret := 0.765957 // buy
								if( upper_1 > 73.4174 )
									ret := 0.942857 // buy
							if( upper_2 > 73.8752 )
								if( basis_minus <= 2.94998 )
									ret := 0.081081
								if( basis_minus > 2.94998 )
									ret := 0.674797
					if( basis > 73.2709 )
						if( lower_5 <= 70.8919 )
							if( basis_minus <= 3.22221 )
								if( basis_minus <= 3.19814 )
									ret := -0.750000 // sell
								if( basis_minus > 3.19814 )
									ret := -1.000000 // sell
							if( basis_minus > 3.22221 )
								if( basis_max <= -3.75689 )
									ret := -0.411765
								if( basis_max > -3.75689 )
									ret := 0.000000
						if( lower_5 > 70.8919 )
							if( upper_4 <= 76.1189 )
								ret := -0.200000
							if( upper_4 > 76.1189 )
								if( upper_6 <= 77.7466 )
									ret := 1.000000 // buy
								if( upper_6 > 77.7466 )
									ret := 0.000000
				if( lower_6 > 70.1372 )
					if( lower_5 <= 70.971 )
						if( lower_1 <= 72.6746 )
							if( basis <= 72.4695 )
								if( lower_6 <= 70.1958 )
									ret := -0.043478
								if( lower_6 > 70.1958 )
									ret := -0.638889
							if( basis > 72.4695 )
								if( upper_6 <= 74.7938 )
									ret := 0.423077
								if( upper_6 > 74.7938 )
									ret := -0.200000
						if( lower_1 > 72.6746 )
							ret := -1.000000 // sell
					if( lower_5 > 70.971 )
						if( lower_1 <= 72.8781 )
							if( upper_3 <= 75.0953 )
								if( upper_6 <= 75.9689 )
									ret := 0.389831
								if( upper_6 > 75.9689 )
									ret := -0.055556
							if( upper_3 > 75.0953 )
								if( basis_max <= -3.22439 )
									ret := 0.750000 // buy
								if( basis_max > -3.22439 )
									ret := 1.000000 // buy
						if( lower_1 > 72.8781 )
							if( upper_6 <= 82.1014 )
								if( upper_1 <= 79.7211 )
									ret := 0.061113
								if( upper_1 > 79.7211 )
									ret := -0.463768
							if( upper_6 > 82.1014 )
								if( upper_4 <= 80.9474 )
									ret := 0.685714
								if( upper_4 > 80.9474 )
									ret := 0.118133
	
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
float op_operation = decision_tree_0_BABA_30Min_9b2516e1(basis_max, upper_1, lower_2, upper_2, lower_3, lower_6, basis_minus, lower_4, upper_4, upper_5, basis, upper_3, lower_5, upper_6, lower_1)

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


