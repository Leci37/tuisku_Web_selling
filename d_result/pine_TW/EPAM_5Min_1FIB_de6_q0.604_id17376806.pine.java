//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: EPAM_5Min_1FIB_17376806 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_EPAM_5Min_1FIB_17376806", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_EPAM_5Min_17376806(upper_2, basis, lower_6, basis_minus, lower_5, upper_5, upper_4, basis_max, upper_6, upper_3, lower_2, upper_1, lower_4, lower_1, lower_3)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( upper_4 <= 250.181 )
		if( basis_max <= -3.72417 )
			if( upper_1 <= 176.554 )
				if( basis_max <= -8.11603 )
					if( lower_1 <= 172.202 )
						ret := -1.000000 // sell
					if( lower_1 > 172.202 )
						if( lower_3 <= 170.03 )
							ret := -1.000000 // sell
						if( lower_3 > 170.03 )
							ret := 0.842105 // buy
				if( basis_max > -8.11603 )
					if( lower_2 <= 171.038 )
						ret := 1.000000 // buy
					if( lower_2 > 171.038 )
						ret := 0.833333 // buy
			if( upper_1 > 176.554 )
				if( upper_1 <= 180.558 )
					if( upper_2 <= 182.186 )
						if( basis_minus <= 12.6401 )
							ret := -0.258189
						if( basis_minus > 12.6401 )
							ret := -0.903226 // sell
					if( upper_2 > 182.186 )
						if( basis_max <= -13.2065 )
							ret := -0.428571
						if( basis_max > -13.2065 )
							ret := 0.733333 // buy
				if( upper_1 > 180.558 )
					if( upper_3 <= 186.642 )
						if( upper_5 <= 187.396 )
							ret := 0.089431
						if( upper_5 > 187.396 )
							ret := 0.661597
					if( upper_3 > 186.642 )
						if( upper_4 <= 189.612 )
							ret := -0.237569
						if( upper_4 > 189.612 )
							ret := 0.076341
		if( basis_max > -3.72417 )
			if( lower_5 <= 175.155 )
				if( basis_max <= -3.02578 )
					if( upper_6 <= 178.534 )
						if( lower_6 <= 171.917 )
							ret := -0.133333
						if( lower_6 > 171.917 )
							ret := 0.787879 // buy
					if( upper_6 > 178.534 )
						if( upper_6 <= 179.691 )
							ret := -0.179245
						if( upper_6 > 179.691 )
							ret := 0.150685
				if( basis_max > -3.02578 )
					if( basis_minus <= 2.80965 )
						if( upper_2 <= 177.704 )
							ret := 0.882353 // buy
						if( upper_2 > 177.704 )
							ret := -0.155844
					if( basis_minus > 2.80965 )
						if( upper_3 <= 176.464 )
							ret := 0.000000
						if( upper_3 > 176.464 )
							ret := 0.723577 // buy
			if( lower_5 > 175.155 )
				if( lower_2 <= 224.243 )
					if( lower_6 <= 207.116 )
						if( basis <= 203.368 )
							ret := -0.127745
						if( basis > 203.368 )
							ret := -0.520202
					if( lower_6 > 207.116 )
						if( lower_3 <= 223.818 )
							ret := 0.803922 // buy
						if( lower_3 > 223.818 )
							ret := -0.333333
				if( lower_2 > 224.243 )
					if( upper_4 <= 243.999 )
						if( upper_6 <= 245.186 )
							ret := -0.804348 // sell
						if( upper_6 > 245.186 )
							ret := 1.000000 // buy
					if( upper_4 > 243.999 )
						if( lower_2 <= 240.878 )
							ret := 0.571429
						if( lower_2 > 240.878 )
							ret := 0.142857
	if( upper_4 > 250.181 )
		if( lower_6 <= 199.81 )
			if( upper_3 <= 245.989 )
				if( lower_4 <= 173.228 )
					if( basis_max <= -89.9308 )
						ret := 0.200000
					if( basis_max > -89.9308 )
						if( upper_3 <= 245.655 )
							ret := 0.977273 // buy
						if( upper_3 > 245.655 )
							ret := 0.500000
				if( lower_4 > 173.228 )
					ret := -0.714286 // sell
			if( upper_3 > 245.989 )
				if( upper_2 <= 247.326 )
					if( upper_2 <= 243.261 )
						if( upper_5 <= 270.074 )
							ret := -0.665217
						if( upper_5 > 270.074 )
							ret := 1.000000 // buy
					if( upper_2 > 243.261 )
						if( lower_6 <= 166.272 )
							ret := 0.635135
						if( lower_6 > 166.272 )
							ret := -1.000000 // sell
				if( upper_2 > 247.326 )
					if( upper_5 <= 275.117 )
						ret := 0.000000
					if( upper_5 > 275.117 )
						if( upper_4 <= 269.721 )
							ret := -0.781457 // sell
						if( upper_4 > 269.721 )
							ret := -1.000000 // sell
		if( lower_6 > 199.81 )
			if( lower_1 <= 239.014 )
				if( lower_3 <= 232.523 )
					if( lower_3 <= 227.212 )
						if( upper_4 <= 265.368 )
							ret := 0.538462
						if( upper_4 > 265.368 )
							ret := 0.952381 // buy
					if( lower_3 > 227.212 )
						if( upper_5 <= 255.874 )
							ret := 0.319797
						if( upper_5 > 255.874 )
							ret := -0.393204
				if( lower_3 > 232.523 )
					if( lower_5 <= 228.963 )
						if( upper_1 <= 247.244 )
							ret := 0.898551 // buy
						if( upper_1 > 247.244 )
							ret := 0.480519
					if( lower_5 > 228.963 )
						if( lower_2 <= 236.12 )
							ret := -0.529412
						if( lower_2 > 236.12 )
							ret := 0.900000 // buy
			if( lower_1 > 239.014 )
				if( upper_1 <= 247.008 )
					if( upper_6 <= 254.533 )
						if( basis_minus <= 9.84574 )
							ret := 0.800000 // buy
						if( basis_minus > 9.84574 )
							ret := -0.309524
					if( upper_6 > 254.533 )
						if( lower_3 <= 236.02 )
							ret := -0.250000
						if( lower_3 > 236.02 )
							ret := -0.809783 // sell
				if( upper_1 > 247.008 )
					if( upper_6 <= 320.813 )
						if( upper_5 <= 251.738 )
							ret := -0.395455
						if( upper_5 > 251.738 )
							ret := -0.052706
					if( upper_6 > 320.813 )
						if( upper_3 <= 310.603 )
							ret := 0.696296
						if( upper_3 > 310.603 )
							ret := -0.157895
	
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
float op_operation = decision_tree_0_EPAM_5Min_17376806(upper_2, basis, lower_6, basis_minus, lower_5, upper_5, upper_4, basis_max, upper_6, upper_3, lower_2, upper_1, lower_4, lower_1, lower_3)

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


