//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: CRWD_15Min_1FIB_a5d8b574 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_15Min_1FIB_a5d8b574", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_15Min_a5d8b574(upper_2, basis, lower_6, basis_minus, lower_5, upper_5, upper_4, basis_max, upper_6, upper_3, lower_2, upper_1, lower_4, lower_1, lower_3)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( lower_2 <= 47.4544 )
		if( lower_6 <= 24.5194 )
			if( basis_max <= -15.9882 )
				ret := -1.000000 // sell
			if( basis_max > -15.9882 )
				if( upper_5 <= 49.8501 )
					ret := -0.823529 // sell
				if( upper_5 > 49.8501 )
					ret := -0.750000 // sell
		if( lower_6 > 24.5194 )
			if( lower_2 <= 46.9996 )
				if( lower_6 <= 45.1698 )
					if( basis_max <= -12.8591 )
						if( lower_5 <= 37.6909 )
							if( basis_minus <= 17.2058 )
								if( upper_3 <= 54.9978 )
									ret := 0.581967
								if( upper_3 > 54.9978 )
									ret := -0.225000
							if( basis_minus > 17.2058 )
								ret := -1.000000 // sell
						if( lower_5 > 37.6909 )
							if( upper_4 <= 58.9382 )
								if( upper_5 <= 60.3305 )
									ret := 0.625000
								if( upper_5 > 60.3305 )
									ret := 0.960000 // buy
							if( upper_4 > 58.9382 )
								ret := -0.222222
					if( basis_max > -12.8591 )
						if( upper_2 <= 53.6403 )
							if( basis <= 36.6954 )
								if( lower_3 <= 33.2814 )
									ret := 1.000000 // buy
								if( lower_3 > 33.2814 )
									ret := 0.450000
							if( basis > 36.6954 )
								if( basis <= 48.8693 )
									ret := 0.040771
								if( basis > 48.8693 )
									ret := 0.503311
						if( upper_2 > 53.6403 )
							if( lower_1 <= 48.264 )
								if( basis_minus <= 12.6549 )
									ret := -0.801980 // sell
								if( basis_minus > 12.6549 )
									ret := -0.301887
							if( lower_1 > 48.264 )
								if( lower_5 <= 42.9528 )
									ret := -0.428571
								if( lower_5 > 42.9528 )
									ret := 0.647059
				if( lower_6 > 45.1698 )
					if( basis <= 48.0802 )
						if( upper_2 <= 49.0831 )
							ret := -1.000000 // sell
						if( upper_2 > 49.0831 )
							if( lower_4 <= 46.2945 )
								ret := -1.000000 // sell
							if( lower_4 > 46.2945 )
								ret := -0.750000 // sell
					if( basis > 48.0802 )
						if( upper_2 <= 49.1999 )
							ret := 0.800000 // buy
						if( upper_2 > 49.1999 )
							ret := -0.700000 // sell
			if( lower_2 > 46.9996 )
				if( upper_2 <= 57.4663 )
					if( basis <= 49.7602 )
						if( lower_2 <= 47.3421 )
							if( upper_2 <= 50.7504 )
								if( upper_5 <= 52.342 )
									ret := 0.623037
								if( upper_5 > 52.342 )
									ret := 0.969231 // buy
							if( upper_2 > 50.7504 )
								if( upper_4 <= 51.9366 )
									ret := -0.739130 // sell
								if( upper_4 > 51.9366 )
									ret := 0.363636
						if( lower_2 > 47.3421 )
							if( upper_5 <= 51.9844 )
								if( upper_1 <= 49.8335 )
									ret := 0.058824
								if( upper_1 > 49.8335 )
									ret := -0.777778 // sell
							if( upper_5 > 51.9844 )
								if( lower_6 <= 44.7671 )
									ret := 0.090909
								if( lower_6 > 44.7671 )
									ret := 0.727273 // buy
					if( basis > 49.7602 )
						if( lower_4 <= 44.3879 )
							if( upper_5 <= 61.0536 )
								ret := -0.684211
							if( upper_5 > 61.0536 )
								ret := 0.642857
						if( lower_4 > 44.3879 )
							if( upper_3 <= 55.4169 )
								ret := 0.750000 // buy
							if( upper_3 > 55.4169 )
								if( basis_minus <= 12.015 )
									ret := 1.000000 // buy
								if( basis_minus > 12.015 )
									ret := 0.888889 // buy
				if( upper_2 > 57.4663 )
					ret := -0.913043 // sell
	if( lower_2 > 47.4544 )
		if( lower_2 <= 54.0521 )
			if( basis <= 55.3863 )
				if( lower_3 <= 49.2042 )
					if( lower_5 <= 46.6827 )
						if( upper_5 <= 62.807 )
							if( basis_max <= -11.8155 )
								if( upper_2 <= 56.995 )
									ret := 1.000000 // buy
								if( upper_2 > 56.995 )
									ret := 0.454545
							if( basis_max > -11.8155 )
								if( basis_minus <= 8.30308 )
									ret := -0.368852
								if( basis_minus > 8.30308 )
									ret := -0.850340 // sell
						if( upper_5 > 62.807 )
							if( upper_6 <= 66.9295 )
								if( upper_6 <= 66.6164 )
									ret := 0.916667 // buy
								if( upper_6 > 66.6164 )
									ret := 0.545455
							if( upper_6 > 66.9295 )
								if( upper_5 <= 63.8617 )
									ret := 0.400000
								if( upper_5 > 63.8617 )
									ret := -0.785714 // sell
					if( lower_5 > 46.6827 )
						if( upper_4 <= 50.3649 )
							if( upper_6 <= 51.2399 )
								ret := 0.157895
							if( upper_6 > 51.2399 )
								if( upper_2 <= 49.8178 )
									ret := 1.000000 // buy
								if( upper_2 > 49.8178 )
									ret := 0.583333
						if( upper_4 > 50.3649 )
							if( lower_1 <= 48.4047 )
								if( basis_max <= -2.43825 )
									ret := 0.166667
								if( basis_max > -2.43825 )
									ret := -0.750000 // sell
							if( lower_1 > 48.4047 )
								if( lower_5 <= 47.2032 )
									ret := 0.263566
								if( lower_5 > 47.2032 )
									ret := -0.135314
				if( lower_3 > 49.2042 )
					if( upper_1 <= 57.2395 )
						if( lower_2 <= 50.0733 )
							if( lower_2 <= 50.0181 )
								if( lower_2 <= 49.5147 )
									ret := 0.666667
								if( lower_2 > 49.5147 )
									ret := 1.000000 // buy
							if( lower_2 > 50.0181 )
								ret := 0.714286 // buy
						if( lower_2 > 50.0733 )
							if( upper_4 <= 56.8196 )
								if( upper_3 <= 56.1542 )
									ret := -0.544643
								if( upper_3 > 56.1542 )
									ret := 0.727273 // buy
							if( upper_4 > 56.8196 )
								if( lower_5 <= 50.8222 )
									ret := 0.106383
								if( lower_5 > 50.8222 )
									ret := 0.571429
					if( upper_1 > 57.2395 )
						if( upper_3 <= 59.5147 )
							ret := -1.000000 // sell
						if( upper_3 > 59.5147 )
							if( lower_4 <= 49.8861 )
								ret := -0.909091 // sell
							if( lower_4 > 49.8861 )
								ret := -0.875000 // sell
			if( basis > 55.3863 )
				if( lower_5 <= 50.7584 )
					if( upper_2 <= 58.4265 )
						if( basis_max <= -6.8569 )
							if( upper_1 <= 57.2317 )
								ret := -0.875000 // sell
							if( upper_1 > 57.2317 )
								if( upper_4 <= 60.1116 )
									ret := -0.962963 // sell
								if( upper_4 > 60.1116 )
									ret := -1.000000 // sell
						if( basis_max > -6.8569 )
							ret := -0.777778 // sell
					if( upper_2 > 58.4265 )
						if( upper_3 <= 61.0884 )
							if( upper_1 <= 57.3654 )
								if( lower_5 <= 49.3502 )
									ret := -1.000000 // sell
								if( lower_5 > 49.3502 )
									ret := -0.625000
							if( upper_1 > 57.3654 )
								if( lower_1 <= 53.8255 )
									ret := 0.736842 // buy
								if( lower_1 > 53.8255 )
									ret := -0.298246
						if( upper_3 > 61.0884 )
							if( upper_5 <= 64.3266 )
								if( lower_2 <= 53.906 )
									ret := -0.900000 // sell
								if( lower_2 > 53.906 )
									ret := -1.000000 // sell
							if( upper_5 > 64.3266 )
								ret := -0.642857
				if( lower_5 > 50.7584 )
					if( upper_6 <= 62.6072 )
						if( upper_6 <= 62.3475 )
							if( basis_max <= -5.66168 )
								if( lower_1 <= 54.5721 )
									ret := 1.000000 // buy
								if( lower_1 > 54.5721 )
									ret := 0.000000
							if( basis_max > -5.66168 )
								if( lower_2 <= 53.9807 )
									ret := -0.177215
								if( lower_2 > 53.9807 )
									ret := -0.821429 // sell
						if( upper_6 > 62.3475 )
							if( upper_3 <= 59.2976 )
								if( basis_max <= -6.41973 )
									ret := -1.000000 // sell
								if( basis_max > -6.41973 )
									ret := -0.812500 // sell
							if( upper_3 > 59.2976 )
								ret := -0.294118
					if( upper_6 > 62.6072 )
						if( upper_2 <= 58.7439 )
							if( upper_6 <= 62.6971 )
								ret := 0.625000
							if( upper_6 > 62.6971 )
								ret := 1.000000 // buy
						if( upper_2 > 58.7439 )
							ret := -0.700000 // sell
		if( lower_2 > 54.0521 )
			if( upper_4 <= 158.421 )
				if( upper_2 <= 148.391 )
					if( upper_3 <= 149.223 )
						if( basis_minus <= 34.359 )
							if( basis_max <= -30.0845 )
								if( basis_max <= -33.1869 )
									ret := -0.285714
								if( basis_max > -33.1869 )
									ret := -0.810811 // sell
							if( basis_max > -30.0845 )
								if( basis <= 145.568 )
									ret := 0.018256
								if( basis > 145.568 )
									ret := -0.510067
						if( basis_minus > 34.359 )
							if( upper_1 <= 127.695 )
								if( upper_6 <= 154.907 )
									ret := 0.837209 // buy
								if( upper_6 > 154.907 )
									ret := -0.098361
							if( upper_1 > 127.695 )
								if( upper_5 <= 147.724 )
									ret := 0.875000 // buy
								if( upper_5 > 147.724 )
									ret := 1.000000 // buy
					if( upper_3 > 149.223 )
						if( upper_2 <= 147.606 )
							if( lower_3 <= 123.546 )
								if( lower_2 <= 123.554 )
									ret := -0.288462
								if( lower_2 > 123.554 )
									ret := -0.972477 // sell
							if( lower_3 > 123.546 )
								ret := 0.307692
						if( upper_2 > 147.606 )
							if( upper_1 <= 143.152 )
								if( lower_2 <= 122.161 )
									ret := 0.900000 // buy
								if( lower_2 > 122.161 )
									ret := 0.538462
							if( upper_1 > 143.152 )
								if( upper_3 <= 151.857 )
									ret := -0.116788
								if( upper_3 > 151.857 )
									ret := -0.797468 // sell
				if( upper_2 > 148.391 )
					if( upper_2 <= 150.591 )
						if( lower_1 <= 146.197 )
							if( lower_4 <= 117.969 )
								if( lower_6 <= 95.9695 )
									ret := -0.428571
								if( lower_6 > 95.9695 )
									ret := 0.806818 // buy
							if( lower_4 > 117.969 )
								if( upper_4 <= 155.781 )
									ret := 0.262987
								if( upper_4 > 155.781 )
									ret := -0.604651
						if( lower_1 > 146.197 )
							if( upper_3 <= 151.059 )
								if( upper_4 <= 151.436 )
									ret := 0.428571
								if( upper_4 > 151.436 )
									ret := 0.980392 // buy
							if( upper_3 > 151.059 )
								ret := 0.545455
					if( upper_2 > 150.591 )
						if( basis <= 145.343 )
							if( upper_1 <= 149.36 )
								if( lower_1 <= 141.06 )
									ret := 0.956522 // buy
								if( lower_1 > 141.06 )
									ret := 0.188235
							if( upper_1 > 149.36 )
								if( upper_2 <= 152.677 )
									ret := 0.800000 // buy
								if( upper_2 > 152.677 )
									ret := 1.000000 // buy
						if( basis > 145.343 )
							if( upper_2 <= 153.656 )
								if( basis_minus <= 6.44592 )
									ret := 0.247978
								if( basis_minus > 6.44592 )
									ret := -0.116082
							if( upper_2 > 153.656 )
								if( upper_5 <= 160.401 )
									ret := 0.123057
								if( upper_5 > 160.401 )
									ret := 0.793103 // buy
			if( upper_4 > 158.421 )
				if( basis <= 156.838 )
					if( upper_3 <= 156.388 )
						if( lower_2 <= 137.93 )
							if( lower_6 <= 100.797 )
								if( basis <= 136.602 )
									ret := -0.500000
								if( basis > 136.602 )
									ret := -1.000000 // sell
							if( lower_6 > 100.797 )
								if( basis_minus <= 34.1387 )
									ret := -0.285714
								if( basis_minus > 34.1387 )
									ret := 0.206897
						if( lower_2 > 137.93 )
							if( lower_5 <= 132.191 )
								ret := -1.000000 // sell
							if( lower_5 > 132.191 )
								ret := -0.636364
					if( upper_3 > 156.388 )
						if( lower_2 <= 148.444 )
							if( lower_2 <= 148.392 )
								if( upper_6 <= 163.923 )
									ret := -0.511450
								if( upper_6 > 163.923 )
									ret := -0.056604
							if( lower_2 > 148.392 )
								if( basis_minus <= 11.0574 )
									ret := 0.378378
								if( basis_minus > 11.0574 )
									ret := 0.714286 // buy
						if( lower_2 > 148.444 )
							if( lower_3 <= 150.994 )
								if( basis <= 155.817 )
									ret := -0.283282
								if( basis > 155.817 )
									ret := -0.733333 // sell
							if( lower_3 > 150.994 )
								if( upper_2 <= 157.535 )
									ret := 0.900000 // buy
								if( upper_2 > 157.535 )
									ret := -0.043243
				if( basis > 156.838 )
					if( upper_4 <= 164.415 )
						if( lower_4 <= 150.444 )
							ret := 0.100000
						if( lower_4 > 150.444 )
							if( upper_2 <= 161.455 )
								if( upper_6 <= 167.801 )
									ret := 1.000000 // buy
								if( upper_6 > 167.801 )
									ret := 0.823529 // buy
							if( upper_2 > 161.455 )
								if( upper_3 <= 163.017 )
									ret := 0.568627
								if( upper_3 > 163.017 )
									ret := 0.962963 // buy
					if( upper_4 > 164.415 )
						if( upper_4 <= 350.597 )
							if( basis_max <= -4.63561 )
								if( lower_1 <= 343.647 )
									ret := -0.008280
								if( lower_1 > 343.647 )
									ret := 0.942857 // buy
							if( basis_max > -4.63561 )
								if( upper_5 <= 172.833 )
									ret := -0.960526 // sell
								if( upper_5 > 172.833 )
									ret := -0.156740
						if( upper_4 > 350.597 )
							if( lower_3 <= 286.356 )
								if( upper_1 <= 334.147 )
									ret := -0.903509 // sell
								if( upper_1 > 334.147 )
									ret := -0.355932
							if( lower_3 > 286.356 )
								if( upper_5 <= 395.423 )
									ret := -0.127066
								if( upper_5 > 395.423 )
									ret := 0.252336
	
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
float op_operation = decision_tree_0_CRWD_15Min_a5d8b574(upper_2, basis, lower_6, basis_minus, lower_5, upper_5, upper_4, basis_max, upper_6, upper_3, lower_2, upper_1, lower_4, lower_1, lower_3)

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


