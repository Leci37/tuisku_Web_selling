//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: PINS_15Min_1FIB_5b0cd4d8 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PINS_15Min_1FIB_5b0cd4d8", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PINS_15Min_5b0cd4d8(upper_2, basis, lower_6, basis_minus, lower_5, upper_5, upper_4, basis_max, upper_6, upper_3, lower_2, upper_1, lower_4, lower_1, lower_3)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( lower_2 <= 17.6406 )
		if( upper_4 <= 19.7523 )
			if( basis_max <= -2.61987 )
				if( upper_2 <= 15.7611 )
					if( basis_minus <= 2.70866 )
						if( upper_1 <= 13.0482 )
							ret := 0.333333
						if( upper_1 > 13.0482 )
							if( lower_2 <= 12.2883 )
								if( lower_5 <= 10.6988 )
									ret := -0.806452 // sell
								if( lower_5 > 10.6988 )
									ret := -1.000000 // sell
							if( lower_2 > 12.2883 )
								ret := 0.214286
					if( basis_minus > 2.70866 )
						if( basis_minus <= 2.76756 )
							if( basis_max <= -2.7223 )
								if( basis_minus <= 2.74692 )
									ret := 1.000000 // buy
								if( basis_minus > 2.74692 )
									ret := 0.875000 // buy
							if( basis_max > -2.7223 )
								if( basis <= 13.325 )
									ret := 0.944444 // buy
								if( basis > 13.325 )
									ret := 0.375000
						if( basis_minus > 2.76756 )
							if( upper_3 <= 16.0437 )
								if( lower_2 <= 12.6984 )
									ret := 0.031250
								if( lower_2 > 12.6984 )
									ret := -0.761905 // sell
							if( upper_3 > 16.0437 )
								if( lower_4 <= 12.727 )
									ret := 1.000000 // buy
								if( lower_4 > 12.727 )
									ret := 0.800000 // buy
				if( upper_2 > 15.7611 )
					if( upper_3 <= 16.5785 )
						if( lower_1 <= 13.3663 )
							if( lower_5 <= 11.1604 )
								ret := -1.000000 // sell
							if( lower_5 > 11.1604 )
								ret := -0.900000 // sell
						if( lower_1 > 13.3663 )
							ret := -1.000000 // sell
					if( upper_3 > 16.5785 )
						if( upper_3 <= 16.6711 )
							if( lower_3 <= 12.3851 )
								ret := 0.333333
							if( lower_3 > 12.3851 )
								ret := 1.000000 // buy
						if( upper_3 > 16.6711 )
							if( upper_2 <= 18.8971 )
								if( upper_4 <= 17.9447 )
									ret := -0.106007
								if( upper_4 > 17.9447 )
									ret := -0.636042
							if( upper_2 > 18.8971 )
								if( upper_2 <= 19.0663 )
									ret := 0.272727
								if( upper_2 > 19.0663 )
									ret := 0.812500 // buy
			if( basis_max > -2.61987 )
				if( upper_2 <= 18.7261 )
					if( basis <= 17.434 )
						if( basis <= 14.6417 )
							if( upper_2 <= 15.1837 )
								if( basis_minus <= 2.33608 )
									ret := -0.008475
								if( basis_minus > 2.33608 )
									ret := 0.385185
							if( upper_2 > 15.1837 )
								if( upper_4 <= 15.984 )
									ret := 0.867052 // buy
								if( upper_4 > 15.984 )
									ret := -0.882353 // sell
						if( basis > 14.6417 )
							if( lower_2 <= 15.4491 )
								if( lower_5 <= 14.2689 )
									ret := -0.085987
								if( lower_5 > 14.2689 )
									ret := -0.782051 // sell
							if( lower_2 > 15.4491 )
								if( lower_1 <= 16.5218 )
									ret := 0.666667
								if( lower_1 > 16.5218 )
									ret := 0.061121
					if( basis > 17.434 )
						if( basis <= 18.0834 )
							if( upper_5 <= 18.459 )
								if( upper_3 <= 18.2434 )
									ret := 1.000000 // buy
								if( upper_3 > 18.2434 )
									ret := 0.866667 // buy
							if( upper_5 > 18.459 )
								if( basis_minus <= 2.44669 )
									ret := 0.418239
								if( basis_minus > 2.44669 )
									ret := 0.862500 // buy
						if( basis > 18.0834 )
							ret := -0.789474 // sell
				if( upper_2 > 18.7261 )
					if( lower_2 <= 17.5324 )
						if( upper_5 <= 19.5192 )
							if( lower_3 <= 17.2302 )
								if( lower_5 <= 16.5891 )
									ret := -0.823529 // sell
								if( lower_5 > 16.5891 )
									ret := -1.000000 // sell
							if( lower_3 > 17.2302 )
								ret := -0.466667
						if( upper_5 > 19.5192 )
							if( lower_1 <= 17.4598 )
								if( upper_1 <= 18.5284 )
									ret := -0.866667 // sell
								if( upper_1 > 18.5284 )
									ret := -1.000000 // sell
							if( lower_1 > 17.4598 )
								if( upper_2 <= 19.155 )
									ret := -0.012552
								if( upper_2 > 19.155 )
									ret := -1.000000 // sell
					if( lower_2 > 17.5324 )
						if( basis_minus <= 2.03348 )
							if( upper_1 <= 18.6828 )
								if( basis <= 18.2211 )
									ret := 0.352941
								if( basis > 18.2211 )
									ret := 0.795455 // buy
							if( upper_1 > 18.6828 )
								if( upper_5 <= 19.6127 )
									ret := -0.466667
								if( upper_5 > 19.6127 )
									ret := 0.214286
						if( basis_minus > 2.03348 )
							if( lower_2 <= 17.6124 )
								ret := 0.800000 // buy
							if( lower_2 > 17.6124 )
								ret := 1.000000 // buy
		if( upper_4 > 19.7523 )
			if( upper_2 <= 19.3977 )
				if( lower_1 <= 17.7519 )
					if( upper_6 <= 21.4702 )
						if( upper_5 <= 20.2656 )
							if( lower_3 <= 16.786 )
								ret := 0.214286
							if( lower_3 > 16.786 )
								if( upper_5 <= 20.1402 )
									ret := 0.636364
								if( upper_5 > 20.1402 )
									ret := 0.900000 // buy
						if( upper_5 > 20.2656 )
							if( basis <= 18.097 )
								if( lower_4 <= 15.5421 )
									ret := 0.928571 // buy
								if( lower_4 > 15.5421 )
									ret := 0.636364
							if( basis > 18.097 )
								if( upper_2 <= 19.379 )
									ret := 1.000000 // buy
								if( upper_2 > 19.379 )
									ret := 0.944444 // buy
					if( upper_6 > 21.4702 )
						ret := -1.000000 // sell
				if( lower_1 > 17.7519 )
					if( lower_2 <= 17.5751 )
						if( upper_3 <= 19.5509 )
							ret := 0.090909
						if( upper_3 > 19.5509 )
							ret := -0.750000 // sell
					if( lower_2 > 17.5751 )
						ret := 0.761905 // buy
			if( upper_2 > 19.3977 )
				if( lower_5 <= 15.2162 )
					if( lower_6 <= 11.6228 )
						if( upper_3 <= 22.3169 )
							if( lower_5 <= 13.1438 )
								ret := -0.076923
							if( lower_5 > 13.1438 )
								ret := 0.333333
						if( upper_3 > 22.3169 )
							ret := -0.550000
					if( lower_6 > 11.6228 )
						if( upper_2 <= 19.9807 )
							if( basis_max <= -4.05473 )
								ret := 1.000000 // buy
							if( basis_max > -4.05473 )
								ret := 0.555556
						if( upper_2 > 19.9807 )
							if( lower_4 <= 14.7961 )
								if( basis_max <= -7.38585 )
									ret := 0.976190 // buy
								if( basis_max > -7.38585 )
									ret := 0.633028
							if( lower_4 > 14.7961 )
								if( upper_3 <= 20.6294 )
									ret := 0.657143
								if( upper_3 > 20.6294 )
									ret := 0.035714
				if( lower_5 > 15.2162 )
					if( upper_2 <= 19.4736 )
						if( lower_5 <= 15.625 )
							ret := -1.000000 // sell
						if( lower_5 > 15.625 )
							if( lower_6 <= 15.9179 )
								if( lower_3 <= 16.9797 )
									ret := -0.350649
								if( lower_3 > 16.9797 )
									ret := 0.900000 // buy
							if( lower_6 > 15.9179 )
								ret := -0.916667 // sell
					if( upper_2 > 19.4736 )
						if( lower_2 <= 17.6146 )
							if( upper_6 <= 24.2589 )
								if( upper_6 <= 24.2398 )
									ret := 0.291016
								if( upper_6 > 24.2398 )
									ret := -0.750000 // sell
							if( upper_6 > 24.2589 )
								if( lower_1 <= 18.2253 )
									ret := 1.000000 // buy
								if( lower_1 > 18.2253 )
									ret := 0.230769
						if( lower_2 > 17.6146 )
							if( lower_2 <= 17.6336 )
								ret := -0.818182 // sell
							if( lower_2 > 17.6336 )
								ret := -0.384615
	if( lower_2 > 17.6406 )
		if( lower_5 <= 16.7989 )
			if( lower_1 <= 18.8147 )
				if( basis_max <= -4.84159 )
					if( basis_minus <= 5.29343 )
						ret := -1.000000 // sell
					if( basis_minus > 5.29343 )
						if( upper_6 <= 25.7387 )
							ret := -0.888889 // sell
						if( upper_6 > 25.7387 )
							ret := -1.000000 // sell
				if( basis_max > -4.84159 )
					if( upper_4 <= 20.2622 )
						ret := -1.000000 // sell
					if( upper_4 > 20.2622 )
						if( basis <= 19.3517 )
							if( upper_2 <= 19.9236 )
								ret := 0.111111
							if( upper_2 > 19.9236 )
								if( lower_5 <= 16.2274 )
									ret := -0.976744 // sell
								if( lower_5 > 16.2274 )
									ret := -0.553191
						if( basis > 19.3517 )
							if( basis_max <= -4.28711 )
								if( basis_max <= -4.39828 )
									ret := -0.117647
								if( basis_max > -4.39828 )
									ret := -0.968750 // sell
							if( basis_max > -4.28711 )
								if( lower_6 <= 15.7169 )
									ret := 0.227273
								if( lower_6 > 15.7169 )
									ret := -0.200000
			if( lower_1 > 18.8147 )
				if( upper_1 <= 23.4776 )
					if( lower_1 <= 19.535 )
						if( upper_5 <= 27.2804 )
							if( upper_1 <= 21.2964 )
								ret := 0.588235
							if( upper_1 > 21.2964 )
								if( upper_6 <= 26.6922 )
									ret := -0.846154 // sell
								if( upper_6 > 26.6922 )
									ret := 0.000000
						if( upper_5 > 27.2804 )
							if( lower_2 <= 18.3033 )
								ret := 1.000000 // buy
							if( lower_2 > 18.3033 )
								ret := 0.928571 // buy
					if( lower_1 > 19.535 )
						if( lower_1 <= 19.6969 )
							ret := -1.000000 // sell
						if( lower_1 > 19.6969 )
							if( basis <= 21.1809 )
								ret := 1.000000 // buy
							if( basis > 21.1809 )
								if( upper_3 <= 24.195 )
									ret := -0.937500 // sell
								if( upper_3 > 24.195 )
									ret := -0.413043
				if( upper_1 > 23.4776 )
					if( upper_6 <= 29.3305 )
						ret := -0.307692
					if( upper_6 > 29.3305 )
						if( upper_6 <= 29.3413 )
							ret := 0.812500 // buy
						if( upper_6 > 29.3413 )
							ret := 1.000000 // buy
		if( lower_5 > 16.7989 )
			if( lower_4 <= 69.467 )
				if( lower_4 <= 60.1447 )
					if( upper_2 <= 63.4048 )
						if( lower_6 <= 16.2915 )
							if( upper_4 <= 25.9383 )
								if( basis <= 19.7958 )
									ret := 0.661417
								if( basis > 19.7958 )
									ret := 0.156627
							if( upper_4 > 25.9383 )
								if( upper_1 <= 24.1221 )
									ret := 1.000000 // buy
								if( upper_1 > 24.1221 )
									ret := 0.900000 // buy
						if( lower_6 > 16.2915 )
							if( lower_2 <= 24.3348 )
								if( lower_6 <= 23.5065 )
									ret := 0.020003
								if( lower_6 > 23.5065 )
									ret := 0.457143
							if( lower_2 > 24.3348 )
								if( lower_3 <= 24.2573 )
									ret := -0.262732
								if( lower_3 > 24.2573 )
									ret := -0.013154
					if( upper_2 > 63.4048 )
						if( upper_3 <= 80.373 )
							if( upper_5 <= 67.0347 )
								if( basis <= 61.9156 )
									ret := -0.760274 // sell
								if( basis > 61.9156 )
									ret := -0.352201
							if( upper_5 > 67.0347 )
								if( lower_6 <= 55.3307 )
									ret := -0.279592
								if( lower_6 > 55.3307 )
									ret := 0.310811
						if( upper_3 > 80.373 )
							ret := 0.950000 // buy
				if( lower_4 > 60.1447 )
					if( upper_6 <= 66.5812 )
						if( lower_6 <= 59.3801 )
							if( basis <= 62.4772 )
								if( basis_minus <= 3.1574 )
									ret := 0.062500
								if( basis_minus > 3.1574 )
									ret := 0.307692
							if( basis > 62.4772 )
								if( lower_1 <= 61.8189 )
									ret := -0.888889 // sell
								if( lower_1 > 61.8189 )
									ret := 0.000000
						if( lower_6 > 59.3801 )
							if( upper_2 <= 64.8008 )
								if( upper_1 <= 64.3368 )
									ret := 0.478261
								if( upper_1 > 64.3368 )
									ret := 0.872340 // buy
							if( upper_2 > 64.8008 )
								ret := 0.000000
					if( upper_6 > 66.5812 )
						if( lower_5 <= 58.0375 )
							if( upper_1 <= 76.2077 )
								if( lower_3 <= 62.6023 )
									ret := 0.872340 // buy
								if( lower_3 > 62.6023 )
									ret := 0.363636
							if( upper_1 > 76.2077 )
								ret := 1.000000 // buy
						if( lower_5 > 58.0375 )
							if( upper_2 <= 73.0915 )
								if( upper_4 <= 74.0776 )
									ret := 0.097966
								if( upper_4 > 74.0776 )
									ret := 0.562500
							if( upper_2 > 73.0915 )
								if( basis <= 71.896 )
									ret := -0.240449
								if( basis > 71.896 )
									ret := 0.129881
			if( lower_4 > 69.467 )
				if( upper_6 <= 75.9565 )
					if( upper_4 <= 74.4231 )
						if( upper_6 <= 72.2172 )
							if( basis <= 70.5102 )
								if( upper_4 <= 71.5324 )
									ret := -0.750000 // sell
								if( upper_4 > 71.5324 )
									ret := -0.666667
							if( basis > 70.5102 )
								ret := -1.000000 // sell
						if( upper_6 > 72.2172 )
							if( lower_5 <= 69.5154 )
								if( lower_1 <= 70.9986 )
									ret := 0.050847
								if( lower_1 > 70.9986 )
									ret := -0.529412
							if( lower_5 > 69.5154 )
								if( basis_minus <= 2.75227 )
									ret := -0.375000
								if( basis_minus > 2.75227 )
									ret := -0.906977 // sell
					if( upper_4 > 74.4231 )
						if( basis_max <= -3.06851 )
							ret := -0.785714 // sell
						if( basis_max > -3.06851 )
							ret := -1.000000 // sell
				if( upper_6 > 75.9565 )
					if( lower_2 <= 70.5656 )
						if( upper_5 <= 75.037 )
							ret := 1.000000 // buy
						if( upper_5 > 75.037 )
							ret := 0.916667 // buy
					if( lower_2 > 70.5656 )
						if( upper_6 <= 93.0637 )
							if( upper_4 <= 85.7297 )
								if( basis <= 72.7019 )
									ret := 0.235294
								if( basis > 72.7019 )
									ret := -0.204525
							if( upper_4 > 85.7297 )
								if( upper_1 <= 84.9941 )
									ret := 0.202447
								if( upper_1 > 84.9941 )
									ret := -0.197740
						if( upper_6 > 93.0637 )
							if( lower_5 <= 80.4381 )
								if( upper_4 <= 89.5218 )
									ret := -0.763636 // sell
								if( upper_4 > 89.5218 )
									ret := -0.175000
							if( lower_5 > 80.4381 )
								ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_PINS_15Min_5b0cd4d8(upper_2, basis, lower_6, basis_minus, lower_5, upper_5, upper_4, basis_max, upper_6, upper_3, lower_2, upper_1, lower_4, lower_1, lower_3)

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


