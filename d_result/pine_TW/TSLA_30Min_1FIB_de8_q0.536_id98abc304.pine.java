//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: TSLA_30Min_1FIB_98abc304 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TSLA_30Min_1FIB_98abc304", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TSLA_30Min_98abc304(lower_6, lower_3, basis_max, lower_1, upper_2, upper_6, upper_4, lower_2, basis_minus, upper_3, lower_5, upper_1, lower_4, basis, upper_5)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( upper_6 <= 172.263 )
		if( basis_minus <= 20.5914 )
			if( lower_6 <= 96.5031 )
				if( lower_3 <= 104.851 )
					ret := -0.500000
				if( lower_3 > 104.851 )
					ret := -1.000000 // sell
			if( lower_6 > 96.5031 )
				if( basis_minus <= 10.8631 )
					if( basis_minus <= 8.08833 )
						if( lower_6 <= 154.126 )
							ret := 1.000000 // buy
						if( lower_6 > 154.126 )
							if( basis_max <= -7.63367 )
								ret := 1.000000 // buy
							if( basis_max > -7.63367 )
								if( basis_max <= -7.50933 )
									ret := 0.250000
								if( basis_max > -7.50933 )
									ret := 0.625000
					if( basis_minus > 8.08833 )
						if( upper_6 <= 169.172 )
							if( lower_2 <= 156.468 )
								ret := 0.000000
							if( lower_2 > 156.468 )
								if( lower_5 <= 153.115 )
									ret := 0.833333 // buy
								if( lower_5 > 153.115 )
									ret := 0.235294
						if( upper_6 > 169.172 )
							if( upper_1 <= 162.257 )
								if( upper_1 <= 162.226 )
									ret := -0.300000
								if( upper_1 > 162.226 )
									ret := -0.846154 // sell
							if( upper_1 > 162.257 )
								if( lower_4 <= 154.028 )
									ret := -0.750000 // sell
								if( lower_4 > 154.028 )
									ret := 0.022989
				if( basis_minus > 10.8631 )
					if( lower_5 <= 114.541 )
						if( upper_5 <= 132.719 )
							if( upper_2 <= 123.135 )
								if( lower_4 <= 103.557 )
									ret := 0.814159 // buy
								if( lower_4 > 103.557 )
									ret := 0.006667
							if( upper_2 > 123.135 )
								if( basis_max <= -19.3514 )
									ret := 0.375000
								if( basis_max > -19.3514 )
									ret := 0.825175 // buy
						if( upper_5 > 132.719 )
							if( upper_3 <= 131.395 )
								if( upper_3 <= 129.182 )
									ret := 0.000000
								if( upper_3 > 129.182 )
									ret := -0.697674
							if( upper_3 > 131.395 )
								if( upper_1 <= 127.707 )
									ret := 0.600000
								if( upper_1 > 127.707 )
									ret := 0.103448
					if( lower_5 > 114.541 )
						if( upper_6 <= 168.225 )
							if( lower_6 <= 110.731 )
								if( lower_1 <= 124.295 )
									ret := 0.000000
								if( lower_1 > 124.295 )
									ret := 1.000000 // buy
							if( lower_6 > 110.731 )
								if( lower_6 <= 111.329 )
									ret := 1.000000 // buy
								if( lower_6 > 111.329 )
									ret := 0.897959 // buy
						if( upper_6 > 168.225 )
							if( basis <= 153.088 )
								if( lower_6 <= 131.096 )
									ret := 0.837838 // buy
								if( lower_6 > 131.096 )
									ret := -0.027778
							if( basis > 153.088 )
								if( upper_5 <= 165.055 )
									ret := 0.750000 // buy
								if( upper_5 > 165.055 )
									ret := 0.950000 // buy
		if( basis_minus > 20.5914 )
			if( upper_6 <= 156.803 )
				if( upper_3 <= 129.57 )
					if( lower_4 <= 105.195 )
						ret := 1.000000 // buy
					if( lower_4 > 105.195 )
						ret := 0.750000 // buy
				if( upper_3 > 129.57 )
					if( upper_2 <= 132.17 )
						if( lower_6 <= 96.5925 )
							if( lower_3 <= 107.611 )
								if( lower_4 <= 104.498 )
									ret := -1.000000 // sell
								if( lower_4 > 104.498 )
									ret := -0.500000
							if( lower_3 > 107.611 )
								ret := -1.000000 // sell
						if( lower_6 > 96.5925 )
							ret := -0.500000
					if( upper_2 > 132.17 )
						if( basis <= 121.627 )
							if( basis_minus <= 29.7612 )
								ret := 1.000000 // buy
							if( basis_minus > 29.7612 )
								ret := 0.500000
						if( basis > 121.627 )
							if( basis <= 131.953 )
								if( lower_1 <= 114.75 )
									ret := -0.909091 // sell
								if( lower_1 > 114.75 )
									ret := 0.066667
							if( basis > 131.953 )
								if( upper_6 <= 154.345 )
									ret := -1.000000 // sell
								if( upper_6 > 154.345 )
									ret := -0.653846
			if( upper_6 > 156.803 )
				if( upper_2 <= 145.378 )
					if( lower_5 <= 96.6399 )
						if( lower_4 <= 101.494 )
							if( lower_1 <= 115.643 )
								ret := 0.750000 // buy
							if( lower_1 > 115.643 )
								ret := 1.000000 // buy
						if( lower_4 > 101.494 )
							if( basis_max <= -40.8905 )
								ret := 1.000000 // buy
							if( basis_max > -40.8905 )
								ret := 0.500000
					if( lower_5 > 96.6399 )
						if( lower_3 <= 106.599 )
							ret := -0.500000
						if( lower_3 > 106.599 )
							if( upper_5 <= 152.535 )
								ret := 1.000000 // buy
							if( upper_5 > 152.535 )
								if( basis_max <= -41.6832 )
									ret := 1.000000 // buy
								if( basis_max > -41.6832 )
									ret := 0.227273
				if( upper_2 > 145.378 )
					if( basis_max <= -24.1831 )
						if( lower_1 <= 132.294 )
							if( upper_2 <= 146.071 )
								ret := -0.500000
							if( upper_2 > 146.071 )
								ret := -1.000000 // sell
						if( lower_1 > 132.294 )
							if( lower_3 <= 126.015 )
								if( lower_5 <= 118.235 )
									ret := 0.750000 // buy
								if( lower_5 > 118.235 )
									ret := 0.166667
							if( lower_3 > 126.015 )
								ret := 0.142857
					if( basis_max > -24.1831 )
						ret := 1.000000 // buy
	if( upper_6 > 172.263 )
		if( lower_5 <= -215.013 )
			if( lower_2 <= -307.627 )
				if( lower_6 <= -1855.76 )
					if( lower_5 <= -1269.84 )
						ret := 0.428571
					if( lower_5 > -1269.84 )
						ret := -1.000000 // sell
				if( lower_6 > -1855.76 )
					if( upper_3 <= 1801.22 )
						ret := 0.750000 // buy
					if( upper_3 > 1801.22 )
						ret := 1.000000 // buy
			if( lower_2 > -307.627 )
				if( lower_1 <= 98.6055 )
					if( lower_2 <= -303.766 )
						if( upper_2 <= 1570.78 )
							ret := 0.500000
						if( upper_2 > 1570.78 )
							ret := -0.571429
					if( lower_2 > -303.766 )
						if( lower_2 <= -297.415 )
							ret := -0.714286 // sell
						if( lower_2 > -297.415 )
							if( lower_3 <= -518.495 )
								ret := -1.000000 // sell
							if( lower_3 > -518.495 )
								if( lower_4 <= -676.042 )
									ret := -0.500000
								if( lower_4 > -676.042 )
									ret := -1.000000 // sell
				if( lower_1 > 98.6055 )
					if( upper_5 <= 2698.73 )
						if( lower_3 <= -116.706 )
							if( lower_1 <= 124.173 )
								if( upper_3 <= 1627.2 )
									ret := -1.000000 // sell
								if( upper_3 > 1627.2 )
									ret := 0.285714
							if( lower_1 > 124.173 )
								if( lower_6 <= -1250.48 )
									ret := 0.440000
								if( lower_6 > -1250.48 )
									ret := 1.000000 // buy
						if( lower_3 > -116.706 )
							if( lower_4 <= -112.772 )
								if( lower_4 <= -127.467 )
									ret := -0.533333
								if( lower_4 > -127.467 )
									ret := 0.416667
							if( lower_4 > -112.772 )
								if( basis_max <= -889.023 )
									ret := -1.000000 // sell
								if( basis_max > -889.023 )
									ret := -0.250000
					if( upper_5 > 2698.73 )
						if( lower_3 <= -506.192 )
							if( upper_4 <= 2330.87 )
								if( upper_4 <= 2329.77 )
									ret := 0.200000
								if( upper_4 > 2329.77 )
									ret := -1.000000 // sell
							if( upper_4 > 2330.87 )
								ret := 0.333333
						if( lower_3 > -506.192 )
							if( basis_minus <= 2524.04 )
								if( lower_1 <= 403.933 )
									ret := -1.000000 // sell
								if( lower_1 > 403.933 )
									ret := -0.923077 // sell
							if( basis_minus > 2524.04 )
								ret := -0.666667
		if( lower_5 > -215.013 )
			if( basis_minus <= 884.416 )
				if( upper_3 <= 2239.66 )
					if( basis_minus <= 26.9877 )
						if( basis_minus <= 20.3785 )
							if( upper_4 <= 359.335 )
								if( upper_1 <= 273.384 )
									ret := 0.023088
								if( upper_1 > 273.384 )
									ret := 0.107839
							if( upper_4 > 359.335 )
								if( upper_6 <= 365.454 )
									ret := -0.385787
								if( upper_6 > 365.454 )
									ret := -0.090730
						if( basis_minus > 20.3785 )
							if( upper_3 <= 267.662 )
								if( upper_5 <= 272.243 )
									ret := 0.007670
								if( upper_5 > 272.243 )
									ret := 0.295858
							if( upper_3 > 267.662 )
								if( upper_4 <= 274.688 )
									ret := -0.452575
								if( upper_4 > 274.688 )
									ret := -0.047637
					if( basis_minus > 26.9877 )
						if( upper_5 <= 1734.88 )
							if( lower_6 <= 950.495 )
								if( lower_1 <= 132.821 )
									ret := -0.535714
								if( lower_1 > 132.821 )
									ret := 0.077927
							if( lower_6 > 950.495 )
								if( basis_max <= -77.5595 )
									ret := -0.022863
								if( basis_max > -77.5595 )
									ret := -0.344186
						if( upper_5 > 1734.88 )
							if( upper_4 <= 2145.92 )
								if( lower_6 <= 1184.46 )
									ret := -0.098039
								if( lower_6 > 1184.46 )
									ret := 0.648855
							if( upper_4 > 2145.92 )
								if( upper_3 <= 2138.45 )
									ret := -0.370968
								if( upper_3 > 2138.45 )
									ret := 0.604167
				if( upper_3 > 2239.66 )
					if( upper_6 <= 2414.63 )
						ret := -1.000000 // sell
					if( upper_6 > 2414.63 )
						if( upper_4 <= 2404.92 )
							ret := -0.500000
						if( upper_4 > 2404.92 )
							ret := -1.000000 // sell
			if( basis_minus > 884.416 )
				if( upper_4 <= 1023.68 )
					ret := 0.250000
				if( upper_4 > 1023.68 )
					if( lower_2 <= 1697.52 )
						ret := 1.000000 // buy
					if( lower_2 > 1697.52 )
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
float op_operation = decision_tree_0_TSLA_30Min_98abc304(lower_6, lower_3, basis_max, lower_1, upper_2, upper_6, upper_4, lower_2, basis_minus, upper_3, lower_5, upper_1, lower_4, basis, upper_5)

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


