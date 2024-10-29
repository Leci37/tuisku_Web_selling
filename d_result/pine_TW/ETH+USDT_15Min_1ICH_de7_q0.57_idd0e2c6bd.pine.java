//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: ETHUSDT_15Min_1ICH_d0e2c6bd Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETHUSDT_15Min_1ICH_d0e2c6bd", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETHUSDT_15Min_d0e2c6bd(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( basis_max <= -9.11148 )
		if( senkou_span_a_displaced <= 1096.41 )
			if( tenkan_sen <= 975.855 )
				ret := 1.000000 // buy
			if( tenkan_sen > 975.855 )
				if( kinjun_sen <= 1116.23 )
					if( basis_max <= -9.88457 )
						if( basis_max <= -14.6275 )
							ret := -1.000000 // sell
						if( basis_max > -14.6275 )
							if( basis_max <= -14.0773 )
								ret := -0.333333
							if( basis_max > -14.0773 )
								ret := -0.937500 // sell
					if( basis_max > -9.88457 )
						ret := -0.384615
				if( kinjun_sen > 1116.23 )
					if( basis_minus <= 16.8369 )
						ret := 0.750000 // buy
					if( basis_minus > 16.8369 )
						if( senkou_span_a_displaced <= 1085.2 )
							if( senkou_span_b_displaced <= 1100.42 )
								ret := -0.750000 // sell
							if( senkou_span_b_displaced > 1100.42 )
								ret := -0.428571
						if( senkou_span_a_displaced > 1085.2 )
							ret := -1.000000 // sell
		if( senkou_span_a_displaced > 1096.41 )
			if( senkou_span_a_displaced <= 3430.89 )
				if( chinkou_span <= 3234.14 )
					if( tenkan_sen <= 3179.79 )
						if( chinkou_span <= 3102.42 )
							if( senkou_span_a <= 3016.48 )
								ret := -0.024754
							if( senkou_span_a > 3016.48 )
								ret := -0.438525
						if( chinkou_span > 3102.42 )
							if( senkou_span_b <= 3074.16 )
								ret := 0.657143
							if( senkou_span_b > 3074.16 )
								ret := 0.203822
					if( tenkan_sen > 3179.79 )
						if( senkou_span_b <= 3297.53 )
							if( senkou_span_b_displaced <= 3077.91 )
								ret := -0.058824
							if( senkou_span_b_displaced > 3077.91 )
								ret := -0.669725
						if( senkou_span_b > 3297.53 )
							ret := 0.428571
				if( chinkou_span > 3234.14 )
					if( senkou_span_b_displaced <= 3314.7 )
						if( basis_minus <= 94.27 )
							if( chinkou_span <= 3473.98 )
								ret := 0.487032
							if( chinkou_span > 3473.98 )
								ret := 0.934211 // buy
						if( basis_minus > 94.27 )
							if( basis_max <= -30.3113 )
								ret := 0.390244
							if( basis_max > -30.3113 )
								ret := -0.954545 // sell
					if( senkou_span_b_displaced > 3314.7 )
						if( senkou_span_a <= 3460.17 )
							if( basis_max <= -11.9443 )
								ret := -0.281609
							if( basis_max > -11.9443 )
								ret := 0.245283
						if( senkou_span_a > 3460.17 )
							if( chinkou_span <= 3693.2 )
								ret := 0.531250
							if( chinkou_span > 3693.2 )
								ret := -0.857143 // sell
			if( senkou_span_a_displaced > 3430.89 )
				if( chinkou_span <= 3798.52 )
					if( senkou_span_b_displaced <= 3564.47 )
						if( senkou_span_a_displaced <= 3527.16 )
							if( senkou_span_a_displaced <= 3487.66 )
								ret := -0.509709
							if( senkou_span_a_displaced > 3487.66 )
								ret := -0.172897
						if( senkou_span_a_displaced > 3527.16 )
							if( basis_max <= -11.646 )
								ret := 0.551724
							if( basis_max > -11.646 )
								ret := -0.088889
					if( senkou_span_b_displaced > 3564.47 )
						if( basis_max <= -11.8683 )
							if( senkou_span_b <= 3845.81 )
								ret := -0.674797
							if( senkou_span_b > 3845.81 )
								ret := 0.444444
						if( basis_max > -11.8683 )
							if( chinkou_span <= 3727.43 )
								ret := -0.666667
							if( chinkou_span > 3727.43 )
								ret := 0.186047
				if( chinkou_span > 3798.52 )
					if( basis_max <= -25.3412 )
						if( tenkan_sen <= 3816.21 )
							if( senkou_span_a_displaced <= 3483.73 )
								ret := 0.375000
							if( senkou_span_a_displaced > 3483.73 )
								ret := -0.571429
						if( tenkan_sen > 3816.21 )
							if( senkou_span_b <= 3888.48 )
								ret := 0.894737 // buy
							if( senkou_span_b > 3888.48 )
								ret := -0.142857
					if( basis_max > -25.3412 )
						if( kinjun_sen <= 3644.13 )
							ret := 1.000000 // buy
						if( kinjun_sen > 3644.13 )
							if( kinjun_sen <= 3803.39 )
								ret := -0.304348
							if( kinjun_sen > 3803.39 )
								ret := 0.200000
	if( basis_max > -9.11148 )
		if( senkou_span_b <= 1589.54 )
			if( tenkan_sen <= 1483.8 )
				if( chinkou_span <= 1449.7 )
					if( senkou_span_b <= 1413.19 )
						if( chinkou_span <= 1293.62 )
							if( tenkan_sen <= 1286.4 )
								ret := 0.050968
							if( tenkan_sen > 1286.4 )
								ret := -0.329177
						if( chinkou_span > 1293.62 )
							if( senkou_span_a <= 1291.69 )
								ret := 0.603421
							if( senkou_span_a > 1291.69 )
								ret := 0.091607
					if( senkou_span_b > 1413.19 )
						if( tenkan_sen <= 1466.54 )
							if( senkou_span_b <= 1490.33 )
								ret := -0.349265
							if( senkou_span_b > 1490.33 )
								ret := 1.000000 // buy
						if( tenkan_sen > 1466.54 )
							if( tenkan_sen <= 1480.88 )
								ret := -0.950000 // sell
							if( tenkan_sen > 1480.88 )
								ret := -0.454545
				if( chinkou_span > 1449.7 )
					if( tenkan_sen <= 1457.8 )
						if( senkou_span_a_displaced <= 1385.86 )
							if( senkou_span_a_displaced <= 1345.26 )
								ret := 0.428571
							if( senkou_span_a_displaced > 1345.26 )
								ret := 0.971698 // buy
						if( senkou_span_a_displaced > 1385.86 )
							if( tenkan_sen <= 1415.05 )
								ret := -0.631579
							if( tenkan_sen > 1415.05 )
								ret := 0.673203
					if( tenkan_sen > 1457.8 )
						if( basis_max <= -0.0025 )
							if( chinkou_span <= 1530.95 )
								ret := -0.352459
							if( chinkou_span > 1530.95 )
								ret := 0.733333 // buy
						if( basis_max > -0.0025 )
							if( senkou_span_a_displaced <= 1509.8 )
								ret := 0.514768
							if( senkou_span_a_displaced > 1509.8 )
								ret := -0.159091
			if( tenkan_sen > 1483.8 )
				if( chinkou_span <= 1568.68 )
					if( senkou_span_a <= 1563.32 )
						if( chinkou_span <= 1484.16 )
							if( senkou_span_a_displaced <= 1605.04 )
								ret := -0.424000
							if( senkou_span_a_displaced > 1605.04 )
								ret := 0.950000 // buy
						if( chinkou_span > 1484.16 )
							if( tenkan_sen <= 1533.09 )
								ret := 0.356351
							if( tenkan_sen > 1533.09 )
								ret := 0.036501
					if( senkou_span_a > 1563.32 )
						if( kinjun_sen <= 1589.83 )
							if( chinkou_span <= 1564.59 )
								ret := -0.475410
							if( chinkou_span > 1564.59 )
								ret := 0.024272
						if( kinjun_sen > 1589.83 )
							if( senkou_span_a <= 1589.24 )
								ret := 0.840000 // buy
							if( senkou_span_a > 1589.24 )
								ret := -0.250000
				if( chinkou_span > 1568.68 )
					if( tenkan_sen <= 1567.14 )
						if( chinkou_span <= 1612.03 )
							if( basis_minus <= 38.6829 )
								ret := 0.512195
							if( basis_minus > 38.6829 )
								ret := -0.409091
						if( chinkou_span > 1612.03 )
							if( basis_minus <= 8.9127 )
								ret := 0.836538 // buy
							if( basis_minus > 8.9127 )
								ret := 1.000000 // buy
					if( tenkan_sen > 1567.14 )
						if( basis_max <= -0.307081 )
							if( chinkou_span <= 1646.11 )
								ret := 0.101474
							if( chinkou_span > 1646.11 )
								ret := 0.619048
						if( basis_max > -0.307081 )
							if( kinjun_sen <= 1603.46 )
								ret := 0.443357
							if( kinjun_sen > 1603.46 )
								ret := -0.583333
		if( senkou_span_b > 1589.54 )
			if( chinkou_span <= 1587.55 )
				if( basis_minus <= -15.3335 )
					if( senkou_span_b <= 1590.64 )
						if( senkou_span_b_displaced <= 1606.49 )
							ret := 0.125000
						if( senkou_span_b_displaced > 1606.49 )
							if( senkou_span_b <= 1590.47 )
								ret := 1.000000 // buy
							if( senkou_span_b > 1590.47 )
								ret := 0.857143 // buy
					if( senkou_span_b > 1590.64 )
						if( chinkou_span <= 1542.21 )
							if( senkou_span_b_displaced <= 1668.6 )
								ret := -0.422535
							if( senkou_span_b_displaced > 1668.6 )
								ret := -1.000000 // sell
						if( chinkou_span > 1542.21 )
							if( basis_max <= 1.58604 )
								ret := -0.367347
							if( basis_max > 1.58604 )
								ret := 0.170588
				if( basis_minus > -15.3335 )
					if( kinjun_sen <= 1606.62 )
						if( senkou_span_a <= 1602.95 )
							if( senkou_span_b_displaced <= 1579.41 )
								ret := -0.900000 // sell
							if( senkou_span_b_displaced > 1579.41 )
								ret := -0.257790
						if( senkou_span_a > 1602.95 )
							if( chinkou_span <= 1562.09 )
								ret := 0.916667 // buy
							if( chinkou_span > 1562.09 )
								ret := -0.125000
					if( kinjun_sen > 1606.62 )
						if( kinjun_sen <= 1632.87 )
							if( senkou_span_a <= 1612.8 )
								ret := -0.563758
							if( senkou_span_a > 1612.8 )
								ret := -0.773946 // sell
						if( kinjun_sen > 1632.87 )
							if( tenkan_sen <= 1646.76 )
								ret := 0.028571
							if( tenkan_sen > 1646.76 )
								ret := -0.734375 // sell
			if( chinkou_span > 1587.55 )
				if( senkou_span_a <= 1625.94 )
					if( chinkou_span <= 1627.22 )
						if( basis_max <= 8.01893 )
							if( senkou_span_b <= 1662.88 )
								ret := 0.015592
							if( senkou_span_b > 1662.88 )
								ret := -0.920000 // sell
						if( basis_max > 8.01893 )
							if( chinkou_span <= 1606.22 )
								ret := 0.847222 // buy
							if( chinkou_span > 1606.22 )
								ret := 0.357143
					if( chinkou_span > 1627.22 )
						if( chinkou_span <= 1656.75 )
							if( senkou_span_a <= 1598.52 )
								ret := -0.014925
							if( senkou_span_a > 1598.52 )
								ret := 0.490637
						if( chinkou_span > 1656.75 )
							if( basis_max <= -0.649431 )
								ret := 0.891089 // buy
							if( basis_max > -0.649431 )
								ret := 0.631579
				if( senkou_span_a > 1625.94 )
					if( chinkou_span <= 1627.74 )
						if( senkou_span_a_displaced <= 1700.28 )
							if( senkou_span_b_displaced <= 1698.34 )
								ret := -0.238790
							if( senkou_span_b_displaced > 1698.34 )
								ret := 0.435897
						if( senkou_span_a_displaced > 1700.28 )
							if( basis_max <= 4.03875 )
								ret := -0.922078 // sell
							if( basis_max > 4.03875 )
								ret := 1.000000 // buy
					if( chinkou_span > 1627.74 )
						if( tenkan_sen <= 1629.22 )
							if( basis_minus <= -11.235 )
								ret := 0.892308 // buy
							if( basis_minus > -11.235 )
								ret := 0.333333
						if( tenkan_sen > 1629.22 )
							if( chinkou_span <= 1656.2 )
								ret := -0.090488
							if( chinkou_span > 1656.2 )
								ret := 0.051951
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_ETHUSDT_15Min_d0e2c6bd(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)

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


