//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: AAPL_1Min_1ICH_3187657e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAPL_1Min_1ICH_3187657e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAPL_1Min_3187657e(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( basis_max <= 1e-06 )
		if( basis_minus <= 0.485055 )
			if( chinkou_span <= 228.567 )
				if( senkou_span_a <= 227.961 )
					if( chinkou_span <= 227.859 )
						if( tenkan_sen <= 227.027 )
							if( chinkou_span <= 227.335 )
								ret := 0.014217
							if( chinkou_span > 227.335 )
								ret := 0.597938
						if( tenkan_sen > 227.027 )
							if( chinkou_span <= 227.476 )
								ret := -0.382320
							if( chinkou_span > 227.476 )
								ret := -0.060417
					if( chinkou_span > 227.859 )
						if( tenkan_sen <= 227.402 )
							if( senkou_span_b_displaced <= 227.642 )
								ret := 0.644737
							if( senkou_span_b_displaced > 227.642 )
								ret := -0.571429
						if( tenkan_sen > 227.402 )
							if( senkou_span_b <= 227.768 )
								ret := 0.119318
							if( senkou_span_b > 227.768 )
								ret := 0.431452
				if( senkou_span_a > 227.961 )
					if( senkou_span_a <= 229.498 )
						if( chinkou_span <= 227.994 )
							if( senkou_span_b_displaced <= 227.665 )
								ret := 0.179104
							if( senkou_span_b_displaced > 227.665 )
								ret := -0.572632
						if( chinkou_span > 227.994 )
							if( kinjun_sen <= 228.879 )
								ret := -0.168919
							if( kinjun_sen > 228.879 )
								ret := 0.489362
					if( senkou_span_a > 229.498 )
						if( kinjun_sen <= 230.114 )
							if( senkou_span_a <= 230.03 )
								ret := -0.821429 // sell
							if( senkou_span_a > 230.03 )
								ret := -0.285714
						if( kinjun_sen > 230.114 )
							if( tenkan_sen <= 232.699 )
								ret := -1.000000 // sell
							if( tenkan_sen > 232.699 )
								ret := -0.857143 // sell
			if( chinkou_span > 228.567 )
				if( senkou_span_b <= 228.544 )
					if( senkou_span_a <= 228.159 )
						if( tenkan_sen <= 227.45 )
							if( senkou_span_b_displaced <= 226.89 )
								ret := 0.437500
							if( senkou_span_b_displaced > 226.89 )
								ret := -0.565217
						if( tenkan_sen > 227.45 )
							if( senkou_span_a_displaced <= 228.013 )
								ret := 0.718919 // buy
							if( senkou_span_a_displaced > 228.013 )
								ret := 0.928571 // buy
					if( senkou_span_a > 228.159 )
						if( kinjun_sen <= 228.331 )
							if( senkou_span_a <= 228.324 )
								ret := 0.258278
							if( senkou_span_a > 228.324 )
								ret := -0.078947
						if( kinjun_sen > 228.331 )
							if( senkou_span_b_displaced <= 228.63 )
								ret := 0.491349
							if( senkou_span_b_displaced > 228.63 )
								ret := -0.147059
				if( senkou_span_b > 228.544 )
					if( chinkou_span <= 230.505 )
						if( senkou_span_a <= 230.199 )
							if( chinkou_span <= 229.061 )
								ret := -0.188510
							if( chinkou_span > 229.061 )
								ret := 0.105574
						if( senkou_span_a > 230.199 )
							if( senkou_span_b_displaced <= 231.425 )
								ret := -0.298013
							if( senkou_span_b_displaced > 231.425 )
								ret := -0.765217 // sell
					if( chinkou_span > 230.505 )
						if( tenkan_sen <= 231.698 )
							if( chinkou_span <= 231.403 )
								ret := 0.234426
							if( chinkou_span > 231.403 )
								ret := 0.590206
						if( tenkan_sen > 231.698 )
							if( kinjun_sen <= 235.432 )
								ret := 0.031430
							if( kinjun_sen > 235.432 )
								ret := -0.637500
		if( basis_minus > 0.485055 )
			if( kinjun_sen <= 228.492 )
				if( senkou_span_a_displaced <= 182.826 )
					if( tenkan_sen <= 175.481 )
						if( basis_max <= -0.03993 )
							if( senkou_span_b <= 170.058 )
								ret := 0.115385
							if( senkou_span_b > 170.058 )
								ret := -0.400000
						if( basis_max > -0.03993 )
							if( basis_minus <= 0.587718 )
								ret := 0.612903
							if( basis_minus > 0.587718 )
								ret := 0.083333
					if( tenkan_sen > 175.481 )
						if( basis_minus <= 3.24939 )
							if( basis_max <= -2.59368 )
								ret := -0.612903
							if( basis_max > -2.59368 )
								ret := -0.869565 // sell
						if( basis_minus > 3.24939 )
							if( basis_max <= -0.035 )
								ret := 0.750000 // buy
							if( basis_max > -0.035 )
								ret := -0.384615
				if( senkou_span_a_displaced > 182.826 )
					if( chinkou_span <= 203.96 )
						if( basis_minus <= 0.677646 )
							if( senkou_span_b <= 193.865 )
								ret := 0.201258
							if( senkou_span_b > 193.865 )
								ret := -0.717949 // sell
						if( basis_minus > 0.677646 )
							if( chinkou_span <= 191.585 )
								ret := 0.127660
							if( chinkou_span > 191.585 )
								ret := 0.667606
					if( chinkou_span > 203.96 )
						if( senkou_span_b <= 201.62 )
							if( basis_max <= -0.250593 )
								ret := -1.000000 // sell
							if( basis_max > -0.250593 )
								ret := -0.571429
						if( senkou_span_b > 201.62 )
							if( chinkou_span <= 227.379 )
								ret := 0.092096
							if( chinkou_span > 227.379 )
								ret := 0.385475
			if( kinjun_sen > 228.492 )
				if( senkou_span_a <= 231.585 )
					if( basis_minus <= 0.796363 )
						if( senkou_span_b <= 230.403 )
							if( senkou_span_b_displaced <= 227.862 )
								ret := -0.696970
							if( senkou_span_b_displaced > 227.862 )
								ret := 0.287356
						if( senkou_span_b > 230.403 )
							if( basis_max <= -0.083806 )
								ret := -0.216216
							if( basis_max > -0.083806 )
								ret := -0.909091 // sell
					if( basis_minus > 0.796363 )
						if( tenkan_sen <= 231.357 )
							if( senkou_span_b_displaced <= 228.624 )
								ret := -0.310345
							if( senkou_span_b_displaced > 228.624 )
								ret := -0.881188 // sell
						if( tenkan_sen > 231.357 )
							ret := 0.461538
				if( senkou_span_a > 231.585 )
					if( tenkan_sen <= 235.315 )
						if( basis_minus <= 0.727786 )
							if( chinkou_span <= 234.265 )
								ret := -0.253333
							if( chinkou_span > 234.265 )
								ret := 0.433333
						if( basis_minus > 0.727786 )
							if( senkou_span_a_displaced <= 233.113 )
								ret := 0.609091
							if( senkou_span_a_displaced > 233.113 )
								ret := -0.230769
					if( tenkan_sen > 235.315 )
						if( senkou_span_a_displaced <= 234.313 )
							ret := -0.500000
						if( senkou_span_a_displaced > 234.313 )
							if( basis_max <= -0.165 )
								ret := -1.000000 // sell
							if( basis_max > -0.165 )
								ret := -0.818182 // sell
	if( basis_max > 1e-06 )
		if( basis_minus <= -3.80377 )
			if( basis_max <= 0.498128 )
				if( senkou_span_b_displaced <= 210.732 )
					if( senkou_span_a <= 206.567 )
						if( senkou_span_a_displaced <= 208.003 )
							ret := -0.916667 // sell
						if( senkou_span_a_displaced > 208.003 )
							ret := -1.000000 // sell
					if( senkou_span_a > 206.567 )
						ret := -0.857143 // sell
				if( senkou_span_b_displaced > 210.732 )
					ret := -0.428571
			if( basis_max > 0.498128 )
				if( senkou_span_a <= 204.415 )
					ret := 1.000000 // buy
				if( senkou_span_a > 204.415 )
					ret := 0.000000
		if( basis_minus > -3.80377 )
			if( basis_minus <= -0.248398 )
				if( senkou_span_b_displaced <= 226.618 )
					if( chinkou_span <= 224.748 )
						if( senkou_span_a_displaced <= 224.69 )
							if( chinkou_span <= 223.335 )
								ret := 0.139894
							if( chinkou_span > 223.335 )
								ret := 0.546512
						if( senkou_span_a_displaced > 224.69 )
							if( chinkou_span <= 223.954 )
								ret := -0.400000
							if( chinkou_span > 223.954 )
								ret := 0.064327
					if( chinkou_span > 224.748 )
						if( tenkan_sen <= 224.8 )
							if( basis_max <= 0.339746 )
								ret := 0.701887 // buy
							if( basis_max > 0.339746 )
								ret := -0.933333 // sell
						if( tenkan_sen > 224.8 )
							if( kinjun_sen <= 225.769 )
								ret := -0.004695
							if( kinjun_sen > 225.769 )
								ret := 0.529032
				if( senkou_span_b_displaced > 226.618 )
					if( chinkou_span <= 226.665 )
						if( senkou_span_b <= 227.357 )
							if( kinjun_sen <= 226.885 )
								ret := -0.298333
							if( kinjun_sen > 226.885 )
								ret := 0.734375 // buy
						if( senkou_span_b > 227.357 )
							if( senkou_span_b_displaced <= 228.146 )
								ret := 0.375000
							if( senkou_span_b_displaced > 228.146 )
								ret := -0.724299 // sell
					if( chinkou_span > 226.665 )
						if( senkou_span_a <= 228.175 )
							if( chinkou_span <= 227.272 )
								ret := 0.074906
							if( chinkou_span > 227.272 )
								ret := 0.505800
						if( senkou_span_a > 228.175 )
							if( chinkou_span <= 229.431 )
								ret := -0.374622
							if( chinkou_span > 229.431 )
								ret := 0.169794
			if( basis_minus > -0.248398 )
				if( basis_minus <= 0.869337 )
					if( chinkou_span <= 165.13 )
						if( chinkou_span <= 164.35 )
							if( senkou_span_a_displaced <= 165.028 )
								ret := -0.571429
							if( senkou_span_a_displaced > 165.028 )
								ret := -0.884615 // sell
						if( chinkou_span > 164.35 )
							if( basis_max <= 0.10625 )
								ret := -0.145729
							if( basis_max > 0.10625 )
								ret := -0.894737 // sell
					if( chinkou_span > 165.13 )
						if( senkou_span_a <= 165.779 )
							if( senkou_span_a_displaced <= 165.666 )
								ret := 0.172589
							if( senkou_span_a_displaced > 165.666 )
								ret := 0.532995
						if( senkou_span_a > 165.779 )
							if( chinkou_span <= 166.409 )
								ret := -0.301205
							if( chinkou_span > 166.409 )
								ret := 0.058283
				if( basis_minus > 0.869337 )
					if( basis_minus <= 3.03559 )
						if( tenkan_sen <= 230.128 )
							if( senkou_span_a_displaced <= 228.462 )
								ret := 0.392617
							if( senkou_span_a_displaced > 228.462 )
								ret := 0.948718 // buy
						if( tenkan_sen > 230.128 )
							ret := 0.000000
					if( basis_minus > 3.03559 )
						if( tenkan_sen <= 184.811 )
							if( chinkou_span <= 183.573 )
								ret := 0.750000 // buy
							if( chinkou_span > 183.573 )
								ret := 0.352941
						if( tenkan_sen > 184.811 )
							if( basis_minus <= 5.35044 )
								ret := -0.769231 // sell
							if( basis_minus > 5.35044 )
								ret := 0.388889
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Ichimoku_Cloud 
//@version=5
//indicator "Ichimoku Cloud", overlay=true)

// Input parameters for the Ichimoku Cloud
turning_periods = input.int(9, title="Tenkan-Sen Period")
standard_periods = input.int(26, title="Kinjun-Sen Period")
leading_span2_periods = input.int(52, title="Senkou Span B Period")
displacement = input.int(26, title="Displacement")

show_tenkan_sen = input.bool(true, title="Show Tenkan-Sen")
show_kinjun_sen = input.bool(true, title="Show Kinjun-Sen")
show_chinkou_span = input.bool(true, title="Show Chinkou Span")
show_cloud = input.bool(true, title="Show Cloud")
show_crosses = input.bool(false, title="Show Crosses")

// Donchian channel calculation
donchian(highs, lows, length) =>
    (ta.highest(highs, length) + ta.lowest(lows, length)) / 2

// Ichimoku calculations
tenkan_sen = donchian(high, low, turning_periods)
kinjun_sen = donchian(high, low, standard_periods)
senkou_span_a = (tenkan_sen + kinjun_sen) / 2
senkou_span_b = donchian(high, low, leading_span2_periods)

// Displaced Senkou Spans
senkou_span_a_displaced = senkou_span_a[displacement]
senkou_span_b_displaced = senkou_span_b[displacement]

// Chinkou Span
chinkou_span = close[displacement]

// Crosses
cross_up_tenkan_kinjun = ta.crossover(tenkan_sen, kinjun_sen)
cross_dn_tenkan_kinjun = ta.crossunder(tenkan_sen, kinjun_sen)
cross_up_tenkan_kinjunInt = cross_up_tenkan_kinjun ? 1 : 0  // Bool to int
cross_dn_tenkan_kinjunInt = cross_dn_tenkan_kinjun ? 1 : 0  // Bool to int

basis_minus = senkou_span_a - senkou_span_b
basis_max = senkou_span_a - tenkan_sen

// Plotting
plot(show_tenkan_sen ? tenkan_sen : na, color=color.lime, title="Tenkan-Sen", linewidth=1)
plot(show_kinjun_sen ? kinjun_sen : na, color=color.fuchsia, title="Kinjun-Sen", linewidth=1)
plot(show_chinkou_span ? chinkou_span : na, color=color.aqua, title="Chinkou Span", linewidth=1, offset=-displacement)

// Plot the Senkou Span lines and store the plot references
senkou_span_a_plot = plot(show_cloud ? senkou_span_a_displaced : na, color=color.green, title="Senkou Span A", linewidth=1)
senkou_span_b_plot = plot(show_cloud ? senkou_span_b_displaced : na, color=color.red, title="Senkou Span B", linewidth=1)

// Cloud filling
fill(senkou_span_a_plot, senkou_span_b_plot, color=color.new(color.lime, 90), title="Bullish Cloud", transp=70, fillgaps=true)
fill(senkou_span_a_plot, senkou_span_b_plot, color=color.new(color.red, 90), title="Bearish Cloud", transp=70, fillgaps=true)

plotshape(series=(show_crosses and cross_up_tenkan_kinjun) ? close : na, location=location.belowbar, color=color.yellow, style=shape.triangleup, size=size.small, title="Cross Up Tenkan Kinjun")
plotshape(series=(show_crosses and cross_dn_tenkan_kinjun) ? close : na, location=location.abovebar, color=color.yellow, style=shape.triangledown, size=size.small, title="Cross Down Tenkan Kinjun")

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
float op_operation = decision_tree_0_AAPL_1Min_3187657e(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)

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


