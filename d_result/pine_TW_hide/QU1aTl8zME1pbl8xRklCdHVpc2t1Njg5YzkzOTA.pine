//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: AMZN_30Min_1FIB_689c9390 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMZN_30Min_1FIB_689c9390", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMZN_30Min_689c9390(basis_max, upper_1, lower_2, upper_2, lower_3, lower_6, basis_minus, lower_4, upper_4, upper_5, basis, upper_3, lower_5, upper_6, lower_1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( upper_6 <= 3454.24 )
		if( basis_max <= -418.182 )
			if( upper_5 <= 3000.43 )
				if( upper_6 <= 2997.58 )
					if( lower_6 <= 1858.8 )
						if( upper_6 <= 2684.71 )
							if( upper_6 <= 2667.94 )
								if( lower_2 <= -264.217 )
									ret := 0.120000
								if( lower_2 > -264.217 )
									ret := -0.516129
							if( upper_6 > 2667.94 )
								if( upper_5 <= 2571.57 )
									ret := 1.000000 // buy
								if( upper_5 > 2571.57 )
									ret := 0.333333
						if( upper_6 > 2684.71 )
							if( basis_minus <= 2582.33 )
								if( upper_2 <= 1468.7 )
									ret := 0.300000
								if( upper_2 > 1468.7 )
									ret := -0.783784 // sell
							if( basis_minus > 2582.33 )
								if( upper_3 <= 1519.34 )
									ret := -0.900000 // sell
								if( upper_3 > 1519.34 )
									ret := -1.000000 // sell
					if( lower_6 > 1858.8 )
						if( lower_3 <= 2212.05 )
							if( basis_minus <= 426.133 )
								if( lower_3 <= 2099.57 )
									ret := 1.000000 // buy
								if( lower_3 > 2099.57 )
									ret := -1.000000 // sell
							if( basis_minus > 426.133 )
								if( lower_5 <= 2081.36 )
									ret := 0.428571
								if( lower_5 > 2081.36 )
									ret := 0.944444 // buy
						if( lower_3 > 2212.05 )
							if( basis_minus <= 499.805 )
								if( basis_minus <= 490.847 )
									ret := -0.428571
								if( basis_minus > 490.847 )
									ret := -1.000000 // sell
							if( basis_minus > 499.805 )
								if( basis_max <= -514.985 )
									ret := 0.750000 // buy
								if( basis_max > -514.985 )
									ret := 0.000000
				if( upper_6 > 2997.58 )
					if( basis_max <= -2706.21 )
						if( upper_4 <= 2257.06 )
							if( upper_2 <= 1347.82 )
								if( upper_3 <= 1626.4 )
									ret := -0.250000
								if( upper_3 > 1626.4 )
									ret := -1.000000 // sell
							if( upper_2 > 1347.82 )
								if( upper_5 <= 2638.59 )
									ret := 0.461538
								if( upper_5 > 2638.59 )
									ret := -0.928571 // sell
						if( upper_4 > 2257.06 )
							if( upper_2 <= 1567.05 )
								ret := 1.000000 // buy
							if( upper_2 > 1567.05 )
								ret := 0.666667
					if( basis_max > -2706.21 )
						if( upper_5 <= 2891.96 )
							if( upper_2 <= 2682.69 )
								if( upper_2 <= 1543.89 )
									ret := -0.833333 // sell
								if( upper_2 > 1543.89 )
									ret := -1.000000 // sell
							if( upper_2 > 2682.69 )
								if( basis_max <= -518.947 )
									ret := -1.000000 // sell
								if( basis_max > -518.947 )
									ret := -0.500000
						if( upper_5 > 2891.96 )
							if( basis_max <= -531.721 )
								ret := 0.571429
							if( basis_max > -531.721 )
								if( lower_3 <= 2294.9 )
									ret := -0.604651
								if( lower_3 > 2294.9 )
									ret := -0.976744 // sell
			if( upper_5 > 3000.43 )
				if( lower_5 <= 2308.72 )
					if( basis_max <= -532.774 )
						if( upper_3 <= 2859.7 )
							ret := 0.666667
						if( upper_3 > 2859.7 )
							ret := 1.000000 // buy
					if( basis_max > -532.774 )
						if( lower_6 <= 2116.93 )
							if( lower_2 <= 2427.93 )
								if( lower_5 <= 2220.46 )
									ret := -0.875000 // sell
								if( lower_5 > 2220.46 )
									ret := -0.600000
							if( lower_2 > 2427.93 )
								if( lower_6 <= 2115.56 )
									ret := 0.384615
								if( lower_6 > 2115.56 )
									ret := -0.636364
						if( lower_6 > 2116.93 )
							if( upper_4 <= 2998.94 )
								if( basis_minus <= 525.445 )
									ret := 0.000000
								if( basis_minus > 525.445 )
									ret := 0.857143 // buy
							if( upper_4 > 2998.94 )
								ret := 1.000000 // buy
				if( lower_5 > 2308.72 )
					if( basis_max <= -442.481 )
						if( lower_6 <= 2459.48 )
							if( lower_4 <= 2488.64 )
								if( basis_minus <= 475.213 )
									ret := 0.000000
								if( basis_minus > 475.213 )
									ret := -0.538462
							if( lower_4 > 2488.64 )
								if( upper_1 <= 3046.07 )
									ret := 0.916667 // buy
								if( upper_1 > 3046.07 )
									ret := 0.250000
						if( lower_6 > 2459.48 )
							if( upper_2 <= 3142.87 )
								if( upper_3 <= 3137.21 )
									ret := -0.200000
								if( upper_3 > 3137.21 )
									ret := -0.952381 // sell
							if( upper_2 > 3142.87 )
								if( lower_4 <= 2653.9 )
									ret := 1.000000 // buy
								if( lower_4 > 2653.9 )
									ret := -0.714286 // sell
					if( basis_max > -442.481 )
						if( lower_4 <= 2628.56 )
							ret := -1.000000 // sell
						if( lower_4 > 2628.56 )
							ret := -0.500000
		if( basis_max > -418.182 )
			if( basis_max <= -266.541 )
				if( basis_minus <= 272.645 )
					if( lower_6 <= 2792.38 )
						if( basis <= 3029.84 )
							if( lower_6 <= 1698.52 )
								if( basis_minus <= 270.541 )
									ret := 1.000000 // buy
								if( basis_minus > 270.541 )
									ret := 0.750000 // buy
							if( lower_6 > 1698.52 )
								if( upper_1 <= 2090.56 )
									ret := -0.250000
								if( upper_1 > 2090.56 )
									ret := 0.372093
						if( basis > 3029.84 )
							if( lower_5 <= 2824.78 )
								ret := 1.000000 // buy
							if( lower_5 > 2824.78 )
								if( lower_4 <= 2864.22 )
									ret := 0.555556
								if( lower_4 > 2864.22 )
									ret := 0.916667 // buy
					if( lower_6 > 2792.38 )
						if( lower_3 <= 2994.39 )
							if( upper_5 <= 3323.68 )
								if( lower_4 <= 2937.35 )
									ret := -0.500000
								if( lower_4 > 2937.35 )
									ret := 1.000000 // buy
							if( upper_5 > 3323.68 )
								if( upper_5 <= 3330.78 )
									ret := -1.000000 // sell
								if( upper_5 > 3330.78 )
									ret := 0.200000
						if( lower_3 > 2994.39 )
							if( lower_4 <= 2966.81 )
								if( basis <= 3132.27 )
									ret := 0.967742 // buy
								if( basis > 3132.27 )
									ret := 0.700000 // buy
							if( lower_4 > 2966.81 )
								if( upper_1 <= 3229.14 )
									ret := -0.181818
								if( upper_1 > 3229.14 )
									ret := 0.666667
				if( basis_minus > 272.645 )
					if( upper_5 <= 2511.92 )
						if( upper_6 <= 2411.91 )
							if( lower_4 <= 1873.56 )
								if( lower_6 <= 1696.2 )
									ret := 0.766234 // buy
								if( lower_6 > 1696.2 )
									ret := 0.047059
							if( lower_4 > 1873.56 )
								if( basis <= 2066.88 )
									ret := -0.800000 // sell
								if( basis > 2066.88 )
									ret := -1.000000 // sell
						if( upper_6 > 2411.91 )
							if( basis_max <= -384.397 )
								ret := 0.000000
							if( basis_max > -384.397 )
								if( lower_6 <= 1914.99 )
									ret := 0.794393 // buy
								if( lower_6 > 1914.99 )
									ret := 0.368421
					if( upper_5 > 2511.92 )
						if( upper_5 <= 3247.63 )
							if( basis_minus <= 409.489 )
								if( lower_6 <= 1879.14 )
									ret := -0.700000 // sell
								if( lower_6 > 1879.14 )
									ret := -0.041498
							if( basis_minus > 409.489 )
								if( upper_2 <= 2371.52 )
									ret := -0.250000
								if( upper_2 > 2371.52 )
									ret := 0.569767
						if( upper_5 > 3247.63 )
							if( upper_1 <= 3139.17 )
								if( lower_2 <= 2877.24 )
									ret := 0.188525
								if( lower_2 > 2877.24 )
									ret := 0.735075 // buy
							if( upper_1 > 3139.17 )
								if( lower_2 <= 2958.99 )
									ret := -0.683333
								if( lower_2 > 2958.99 )
									ret := 0.200647
			if( basis_max > -266.541 )
				if( lower_3 <= 83.7461 )
					if( lower_5 <= 79.6353 )
						if( lower_4 <= 81.3253 )
							if( upper_2 <= 93.2174 )
								ret := -1.000000 // sell
							if( upper_2 > 93.2174 )
								ret := -0.250000
						if( lower_4 > 81.3253 )
							if( upper_4 <= 97.2039 )
								ret := 0.000000
							if( upper_4 > 97.2039 )
								ret := -0.250000
					if( lower_5 > 79.6353 )
						if( basis_max <= -5.06735 )
							if( lower_2 <= 83.2434 )
								ret := 1.000000 // buy
							if( lower_2 > 83.2434 )
								if( upper_2 <= 94.4859 )
									ret := 0.529412
								if( upper_2 > 94.4859 )
									ret := 0.828571 // buy
						if( basis_max > -5.06735 )
							if( upper_4 <= 87.2595 )
								if( lower_2 <= 82.5917 )
									ret := 0.159817
								if( lower_2 > 82.5917 )
									ret := 0.767442 // buy
							if( upper_4 > 87.2595 )
								if( upper_5 <= 88.7979 )
									ret := -0.636364
								if( upper_5 > 88.7979 )
									ret := 0.035714
				if( lower_3 > 83.7461 )
					if( upper_6 <= 95.4594 )
						if( basis_minus <= 7.03848 )
							if( lower_6 <= 81.5298 )
								if( lower_3 <= 83.8827 )
									ret := 0.956522 // buy
								if( lower_3 > 83.8827 )
									ret := 0.250000
							if( lower_6 > 81.5298 )
								if( lower_5 <= 85.5641 )
									ret := -0.854545 // sell
								if( lower_5 > 85.5641 )
									ret := -0.076087
						if( basis_minus > 7.03848 )
							if( upper_5 <= 92.9326 )
								ret := -0.500000
							if( upper_5 > 92.9326 )
								ret := -1.000000 // sell
					if( upper_6 > 95.4594 )
						if( upper_1 <= 94.3101 )
							if( lower_2 <= 92.2196 )
								if( upper_3 <= 95.8958 )
									ret := 0.396947
								if( upper_3 > 95.8958 )
									ret := -0.133333
							if( lower_2 > 92.2196 )
								if( upper_4 <= 95.3798 )
									ret := -0.903226 // sell
								if( upper_4 > 95.3798 )
									ret := 0.000000
						if( upper_1 > 94.3101 )
							if( lower_1 <= 90.0711 )
								if( basis <= 92.7993 )
									ret := -0.616071
								if( basis > 92.7993 )
									ret := -0.117647
							if( lower_1 > 90.0711 )
								if( basis_max <= -4.01235 )
									ret := 0.060353
								if( basis_max > -4.01235 )
									ret := -0.059524
	if( upper_6 > 3454.24 )
		if( lower_1 <= -549.969 )
			if( lower_1 <= -592.021 )
				if( basis_max <= -3375.4 )
					ret := -0.250000
				if( basis_max > -3375.4 )
					ret := -0.500000
			if( lower_1 > -592.021 )
				if( lower_2 <= -1064.28 )
					if( lower_4 <= -1919.66 )
						ret := -0.750000 // sell
					if( lower_4 > -1919.66 )
						if( basis_minus <= 3450.22 )
							if( upper_2 <= 1472.92 )
								ret := -1.000000 // sell
							if( upper_2 > 1472.92 )
								ret := -0.750000 // sell
						if( basis_minus > 3450.22 )
							ret := -1.000000 // sell
				if( lower_2 > -1064.28 )
					ret := -0.500000
		if( lower_1 > -549.969 )
			if( lower_6 <= 3481.85 )
				if( upper_4 <= 3585.52 )
					if( upper_3 <= 3511.11 )
						if( lower_1 <= 3384.8 )
							if( basis_minus <= 116.709 )
								if( lower_6 <= 3292.8 )
									ret := -0.447115
								if( lower_6 > 3292.8 )
									ret := -0.073529
							if( basis_minus > 116.709 )
								if( lower_4 <= 3326.05 )
									ret := -0.037027
								if( lower_4 > 3326.05 )
									ret := -0.954545 // sell
						if( lower_1 > 3384.8 )
							if( lower_2 <= 3415.18 )
								if( upper_5 <= 3539.89 )
									ret := 0.980000 // buy
								if( upper_5 > 3539.89 )
									ret := 0.619048
							if( lower_2 > 3415.18 )
								if( upper_6 <= 3556.03 )
									ret := -0.090909
								if( upper_6 > 3556.03 )
									ret := 0.000000
					if( upper_3 > 3511.11 )
						if( basis_max <= -141.993 )
							if( upper_4 <= 3576.04 )
								if( upper_1 <= 3455.13 )
									ret := -0.593220
								if( upper_1 > 3455.13 )
									ret := -0.197205
							if( upper_4 > 3576.04 )
								if( basis_max <= -400.828 )
									ret := 0.875000 // buy
								if( basis_max > -400.828 )
									ret := -0.707792 // sell
						if( basis_max > -141.993 )
							if( upper_1 <= 3494.83 )
								if( upper_3 <= 3520.61 )
									ret := 0.101695
								if( upper_3 > 3520.61 )
									ret := 0.629630
							if( upper_1 > 3494.83 )
								if( upper_4 <= 3533.66 )
									ret := -0.814815 // sell
								if( upper_4 > 3533.66 )
									ret := -0.090909
				if( upper_4 > 3585.52 )
					if( upper_2 <= 3781.01 )
						if( lower_3 <= 3165.98 )
							if( upper_5 <= 3644.44 )
								if( upper_6 <= 3736.69 )
									ret := -0.400000
								if( upper_6 > 3736.69 )
									ret := 0.500000
							if( upper_5 > 3644.44 )
								if( upper_5 <= 3645.03 )
									ret := 0.857143 // buy
								if( upper_5 > 3645.03 )
									ret := 1.000000 // buy
						if( lower_3 > 3165.98 )
							if( basis_max <= -191.024 )
								if( lower_2 <= 3522.59 )
									ret := 0.037702
								if( lower_2 > 3522.59 )
									ret := 0.420601
							if( basis_max > -191.024 )
								if( basis_minus <= 149.477 )
									ret := 0.323077
								if( basis_minus > 149.477 )
									ret := -0.237113
					if( upper_2 > 3781.01 )
						if( lower_5 <= 3385.05 )
							ret := 0.000000
						if( lower_5 > 3385.05 )
							if( upper_5 <= 3908.77 )
								ret := -0.500000
							if( upper_5 > 3908.77 )
								ret := -1.000000 // sell
			if( lower_6 > 3481.85 )
				if( upper_4 <= 3702.65 )
					ret := -1.000000 // sell
				if( upper_4 > 3702.65 )
					if( upper_6 <= 3802.05 )
						if( upper_4 <= 3703.48 )
							ret := -0.500000
						if( upper_4 > 3703.48 )
							ret := 0.000000
					if( upper_6 > 3802.05 )
						if( upper_6 <= 3833.5 )
							if( upper_2 <= 3739.25 )
								if( upper_6 <= 3813.17 )
									ret := -0.714286 // sell
								if( upper_6 > 3813.17 )
									ret := 0.000000
							if( upper_2 > 3739.25 )
								ret := -1.000000 // sell
						if( upper_6 > 3833.5 )
							if( upper_1 <= 3715.57 )
								ret := 0.250000
							if( upper_1 > 3715.57 )
								if( lower_2 <= 3609.54 )
									ret := -0.750000 // sell
								if( lower_2 > 3609.54 )
									ret := 0.000000
	
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
float op_operation = decision_tree_0_AMZN_30Min_689c9390(basis_max, upper_1, lower_2, upper_2, lower_3, lower_6, basis_minus, lower_4, upper_4, upper_5, basis, upper_3, lower_5, upper_6, lower_1)

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


