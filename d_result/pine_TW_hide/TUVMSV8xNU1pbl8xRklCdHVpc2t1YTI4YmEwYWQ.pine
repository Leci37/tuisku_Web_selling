//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Fibonacci_Bollinger
// ID_model: MELI_15Min_1FIB_a28ba0ad Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MELI_15Min_1FIB_a28ba0ad", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MELI_15Min_a28ba0ad(upper_2, basis, lower_6, basis_minus, lower_5, upper_5, upper_4, basis_max, upper_6, upper_3, lower_2, upper_1, lower_4, lower_1, lower_3)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( lower_6 <= 252.099 )
		if( lower_6 <= 144.483 )
			if( lower_4 <= 149.286 )
				if( upper_5 <= 168.568 )
					if( lower_2 <= 152.448 )
						ret := -0.250000
					if( lower_2 > 152.448 )
						ret := 0.000000
				if( upper_5 > 168.568 )
					if( upper_1 <= 161.151 )
						if( basis_max <= -14.1341 )
							ret := -1.000000 // sell
						if( basis_max > -14.1341 )
							ret := -0.800000 // sell
					if( upper_1 > 161.151 )
						ret := -0.333333
			if( lower_4 > 149.286 )
				if( lower_5 <= 147.408 )
					if( upper_3 <= 164.593 )
						ret := -1.000000 // sell
					if( upper_3 > 164.593 )
						ret := -0.900000 // sell
				if( lower_5 > 147.408 )
					ret := -0.750000 // sell
		if( lower_6 > 144.483 )
			if( upper_3 <= 326.379 )
				if( basis_minus <= 31.4951 )
					if( basis <= 230.169 )
						if( upper_3 <= 236.935 )
							if( lower_2 <= 225.915 )
								if( lower_3 <= 151.689 )
									ret := 0.505263
								if( lower_3 > 151.689 )
									ret := 0.092228
							if( lower_2 > 225.915 )
								ret := -1.000000 // sell
						if( upper_3 > 236.935 )
							if( lower_1 <= 225.431 )
								if( basis <= 228.986 )
									ret := -0.787879 // sell
								if( basis > 228.986 )
									ret := 0.321429
							if( lower_1 > 225.431 )
								if( basis <= 229.75 )
									ret := -1.000000 // sell
								if( basis > 229.75 )
									ret := -0.533333
					if( basis > 230.169 )
						if( lower_5 <= 220.138 )
							if( lower_3 <= 220.75 )
								ret := 1.000000 // buy
							if( lower_3 > 220.75 )
								if( upper_1 <= 236.339 )
									ret := 0.532258
								if( upper_1 > 236.339 )
									ret := 0.794872 // buy
						if( lower_5 > 220.138 )
							if( lower_4 <= 224.399 )
								if( lower_2 <= 227.051 )
									ret := -1.000000 // sell
								if( lower_2 > 227.051 )
									ret := -0.260000
							if( lower_4 > 224.399 )
								if( upper_2 <= 245.632 )
									ret := 0.490964
								if( upper_2 > 245.632 )
									ret := 0.162804
				if( basis_minus > 31.4951 )
					if( upper_5 <= 284.267 )
						if( upper_5 <= 279.573 )
							if( upper_2 <= 260.342 )
								if( upper_5 <= 271.004 )
									ret := -0.500000
								if( upper_5 > 271.004 )
									ret := 0.000000
							if( upper_2 > 260.342 )
								if( upper_4 <= 272.279 )
									ret := 0.800000 // buy
								if( upper_4 > 272.279 )
									ret := 0.000000
						if( upper_5 > 279.573 )
							if( lower_2 <= 240.702 )
								if( lower_5 <= 209.64 )
									ret := -0.100000
								if( lower_5 > 209.64 )
									ret := -0.739726 // sell
							if( lower_2 > 240.702 )
								if( lower_6 <= 223.883 )
									ret := -1.000000 // sell
								if( lower_6 > 223.883 )
									ret := -0.909091 // sell
					if( upper_5 > 284.267 )
						if( upper_5 <= 286.88 )
							if( lower_5 <= 231.83 )
								if( upper_3 <= 272.812 )
									ret := 0.373134
								if( upper_3 > 272.812 )
									ret := 0.781250 // buy
							if( lower_5 > 231.83 )
								if( lower_3 <= 243.022 )
									ret := -0.933333 // sell
								if( lower_3 > 243.022 )
									ret := 1.000000 // buy
						if( upper_5 > 286.88 )
							if( lower_2 <= 265.927 )
								if( upper_3 <= 276.712 )
									ret := -0.727273 // sell
								if( upper_3 > 276.712 )
									ret := -0.124752
							if( lower_2 > 265.927 )
								if( lower_2 <= 272.827 )
									ret := 0.333333
								if( lower_2 > 272.827 )
									ret := -0.297297
			if( upper_3 > 326.379 )
				if( upper_1 <= 317.765 )
					if( lower_1 <= 285.572 )
						ret := 1.000000 // buy
					if( lower_1 > 285.572 )
						if( upper_1 <= 316.082 )
							ret := 0.055556
						if( upper_1 > 316.082 )
							ret := 1.000000 // buy
				if( upper_1 > 317.765 )
					ret := 0.000000
	if( lower_6 > 252.099 )
		if( basis_max <= -320.4 )
			if( lower_3 <= 866.479 )
				if( lower_1 <= 952.881 )
					ret := -0.800000 // sell
				if( lower_1 > 952.881 )
					ret := -1.000000 // sell
			if( lower_3 > 866.479 )
				if( basis <= 1051.93 )
					if( upper_6 <= 1370.83 )
						ret := 0.583333
					if( upper_6 > 1370.83 )
						if( lower_2 <= 911.907 )
							ret := 0.944444 // buy
						if( lower_2 > 911.907 )
							ret := 1.000000 // buy
				if( basis > 1051.93 )
					if( upper_2 <= 1212.11 )
						if( lower_1 <= 996.563 )
							ret := 0.000000
						if( lower_1 > 996.563 )
							ret := -1.000000 // sell
					if( upper_2 > 1212.11 )
						if( upper_6 <= 1837.46 )
							if( basis <= 1163.12 )
								ret := 1.000000 // buy
							if( basis > 1163.12 )
								if( lower_3 <= 1011.9 )
									ret := 0.700000 // buy
								if( lower_3 > 1011.9 )
									ret := 0.925926 // buy
						if( upper_6 > 1837.46 )
							if( upper_1 <= 1599.56 )
								ret := -0.437500
							if( upper_1 > 1599.56 )
								if( basis_max <= -333.958 )
									ret := 0.931034 // buy
								if( basis_max > -333.958 )
									ret := 0.028571
		if( basis_max > -320.4 )
			if( lower_2 <= 269.977 )
				if( upper_2 <= 268.895 )
					if( lower_1 <= 263.448 )
						if( lower_3 <= 259.933 )
							ret := 0.866667 // buy
						if( lower_3 > 259.933 )
							if( lower_3 <= 260.046 )
								ret := 0.642857
							if( lower_3 > 260.046 )
								ret := 0.538462
					if( lower_1 > 263.448 )
						ret := 0.130435
				if( upper_2 > 268.895 )
					if( upper_3 <= 291.498 )
						if( upper_3 <= 284.607 )
							if( lower_5 <= 258.68 )
								if( upper_5 <= 282.718 )
									ret := -0.515152
								if( upper_5 > 282.718 )
									ret := 0.476190
							if( lower_5 > 258.68 )
								if( basis_max <= -10.0112 )
									ret := -0.317536
								if( basis_max > -10.0112 )
									ret := 0.102326
						if( upper_3 > 284.607 )
							if( lower_4 <= 264.477 )
								if( upper_4 <= 290.483 )
									ret := -1.000000 // sell
								if( upper_4 > 290.483 )
									ret := -0.883721 // sell
							if( lower_4 > 264.477 )
								ret := -0.545455
					if( upper_3 > 291.498 )
						if( basis_max <= -27.2372 )
							ret := 0.000000
						if( basis_max > -27.2372 )
							ret := 0.954545 // buy
			if( lower_2 > 269.977 )
				if( upper_2 <= 1560.19 )
					if( lower_4 <= 1348.27 )
						if( lower_1 <= 275.199 )
							if( upper_5 <= 297.659 )
								if( lower_2 <= 271.052 )
									ret := -0.128000
								if( lower_2 > 271.052 )
									ret := 0.553333
							if( upper_5 > 297.659 )
								if( basis <= 280.674 )
									ret := 0.948276 // buy
								if( basis > 280.674 )
									ret := 0.307692
						if( lower_1 > 275.199 )
							if( lower_3 <= 1362.48 )
								if( basis_max <= -264.515 )
									ret := -0.256957
								if( basis_max > -264.515 )
									ret := -0.006365
							if( lower_3 > 1362.48 )
								if( lower_1 <= 1403.1 )
									ret := 0.083333
								if( lower_1 > 1403.1 )
									ret := 0.880952 // buy
					if( lower_4 > 1348.27 )
						if( lower_5 <= 1334.83 )
							if( upper_3 <= 1542.4 )
								if( basis_max <= -125.434 )
									ret := 0.346154
								if( basis_max > -125.434 )
									ret := 0.816327 // buy
							if( upper_3 > 1542.4 )
								if( basis_minus <= 189.943 )
									ret := 0.855263 // buy
								if( basis_minus > 189.943 )
									ret := 0.142857
						if( lower_5 > 1334.83 )
							if( upper_6 <= 1569.32 )
								if( lower_6 <= 1313.7 )
									ret := -0.888889 // sell
								if( lower_6 > 1313.7 )
									ret := 0.028141
							if( upper_6 > 1569.32 )
								if( upper_2 <= 1513.46 )
									ret := 0.758621 // buy
								if( upper_2 > 1513.46 )
									ret := 0.180353
				if( upper_2 > 1560.19 )
					if( upper_2 <= 1582.84 )
						if( basis_minus <= 141.266 )
							if( upper_6 <= 1591.58 )
								if( upper_1 <= 1554.03 )
									ret := -1.000000 // sell
								if( upper_1 > 1554.03 )
									ret := -0.437500
							if( upper_6 > 1591.58 )
								if( lower_1 <= 1490.83 )
									ret := 0.301075
								if( lower_1 > 1490.83 )
									ret := -0.120053
						if( basis_minus > 141.266 )
							if( upper_2 <= 1574.3 )
								if( upper_1 <= 1540.87 )
									ret := -0.473282
								if( upper_1 > 1540.87 )
									ret := 0.042553
							if( upper_2 > 1574.3 )
								if( lower_4 <= 1437.27 )
									ret := -0.852459 // sell
								if( lower_4 > 1437.27 )
									ret := -0.300000
					if( upper_2 > 1582.84 )
						if( upper_2 <= 1590.84 )
							if( upper_6 <= 1704.24 )
								if( lower_2 <= 1517.19 )
									ret := 0.639535
								if( lower_2 > 1517.19 )
									ret := 0.056180
							if( upper_6 > 1704.24 )
								if( lower_1 <= 1466.3 )
									ret := -0.166667
								if( lower_1 > 1466.3 )
									ret := -0.954545 // sell
						if( upper_2 > 1590.84 )
							if( basis <= 1621.38 )
								if( upper_3 <= 1712.12 )
									ret := -0.118099
								if( upper_3 > 1712.12 )
									ret := -0.543750
							if( basis > 1621.38 )
								if( upper_2 <= 1665.62 )
									ret := 0.791045 // buy
								if( upper_2 > 1665.62 )
									ret := -0.006234
	
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
float op_operation = decision_tree_0_MELI_15Min_a28ba0ad(upper_2, basis, lower_6, basis_minus, lower_5, upper_5, upper_4, basis_max, upper_6, upper_3, lower_2, upper_1, lower_4, lower_1, lower_3)

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


