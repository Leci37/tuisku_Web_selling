//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: CRWD_15Min_1ICH_f47d68f5 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_15Min_1ICH_f47d68f5", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_15Min_f47d68f5(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( chinkou_span <= 49.0014 )
		if( tenkan_sen <= 47.265 )
			if( basis_max <= -0.106313 )
				if( tenkan_sen <= 46.8074 )
					if( basis_minus <= 0.583125 )
						if( senkou_span_a_displaced <= 45.5728 )
							if( senkou_span_a_displaced <= 33.9625 )
								ret := -0.250000
							if( senkou_span_a_displaced > 33.9625 )
								ret := -0.912088 // sell
						if( senkou_span_a_displaced > 45.5728 )
							if( chinkou_span <= 45.7095 )
								ret := -0.882353 // sell
							if( chinkou_span > 45.7095 )
								ret := 0.476190
					if( basis_minus > 0.583125 )
						if( basis_max <= -0.314688 )
							if( tenkan_sen <= 36.7256 )
								ret := 0.750000 // buy
							if( tenkan_sen > 36.7256 )
								ret := -0.666667
						if( basis_max > -0.314688 )
							if( basis_minus <= 1.40454 )
								ret := 0.944444 // buy
							if( basis_minus > 1.40454 )
								ret := -0.090909
				if( tenkan_sen > 46.8074 )
					if( chinkou_span <= 47.8824 )
						ret := 0.428571
					if( chinkou_span > 47.8824 )
						ret := 1.000000 // buy
			if( basis_max > -0.106313 )
				if( senkou_span_a_displaced <= 37.9653 )
					if( chinkou_span <= 33.1788 )
						ret := -0.666667
					if( chinkou_span > 33.1788 )
						if( basis_max <= 0.109025 )
							if( senkou_span_a_displaced <= 36.2887 )
								ret := 0.250000
							if( senkou_span_a_displaced > 36.2887 )
								ret := 0.931034 // buy
						if( basis_max > 0.109025 )
							if( basis_minus <= 1.0976 )
								ret := 0.943182 // buy
							if( basis_minus > 1.0976 )
								ret := 0.285714
				if( senkou_span_a_displaced > 37.9653 )
					if( senkou_span_a_displaced <= 46.4187 )
						if( senkou_span_b_displaced <= 46.3251 )
							if( senkou_span_b <= 37.9975 )
								ret := -0.260274
							if( senkou_span_b > 37.9975 )
								ret := 0.419580
						if( senkou_span_b_displaced > 46.3251 )
							if( tenkan_sen <= 44.3581 )
								ret := -0.296296
							if( tenkan_sen > 44.3581 )
								ret := -0.760870 // sell
					if( senkou_span_a_displaced > 46.4187 )
						if( kinjun_sen <= 47.2581 )
							if( chinkou_span <= 47.82 )
								ret := 0.687943
							if( chinkou_span > 47.82 )
								ret := -0.625000
						if( kinjun_sen > 47.2581 )
							if( senkou_span_b_displaced <= 48.9926 )
								ret := -0.384615
							if( senkou_span_b_displaced > 48.9926 )
								ret := 0.433962
		if( tenkan_sen > 47.265 )
			if( basis_max <= 0.002046 )
				if( tenkan_sen <= 50.8583 )
					if( kinjun_sen <= 49.4475 )
						if( chinkou_span <= 47.495 )
							if( basis_max <= -0.28625 )
								ret := -0.111111
							if( basis_max > -0.28625 )
								ret := -0.830357 // sell
						if( chinkou_span > 47.495 )
							if( senkou_span_a <= 47.6025 )
								ret := 0.485714
							if( senkou_span_a > 47.6025 )
								ret := -0.448485
					if( kinjun_sen > 49.4475 )
						if( kinjun_sen <= 49.7651 )
							if( senkou_span_a <= 49.7768 )
								ret := -0.823529 // sell
							if( senkou_span_a > 49.7768 )
								ret := -0.111111
						if( kinjun_sen > 49.7651 )
							if( senkou_span_b_displaced <= 50.5419 )
								ret := -1.000000 // sell
							if( senkou_span_b_displaced > 50.5419 )
								ret := -0.666667
				if( tenkan_sen > 50.8583 )
					ret := 1.000000 // buy
			if( basis_max > 0.002046 )
				if( senkou_span_a_displaced <= 51.3025 )
					if( basis_minus <= -0.407369 )
						if( basis_minus <= -0.846719 )
							if( senkou_span_b <= 48.9154 )
								ret := -0.631579
							if( senkou_span_b > 48.9154 )
								ret := 0.000000
						if( basis_minus > -0.846719 )
							if( chinkou_span <= 48.3223 )
								ret := 0.294737
							if( chinkou_span > 48.3223 )
								ret := 0.771429 // buy
					if( basis_minus > -0.407369 )
						if( kinjun_sen <= 48.8374 )
							if( tenkan_sen <= 47.7457 )
								ret := 0.750000 // buy
							if( tenkan_sen > 47.7457 )
								ret := 0.033333
						if( kinjun_sen > 48.8374 )
							if( chinkou_span <= 47.8488 )
								ret := -0.760870 // sell
							if( chinkou_span > 47.8488 )
								ret := -0.125000
				if( senkou_span_a_displaced > 51.3025 )
					if( basis_max <= 0.632567 )
						if( senkou_span_a_displaced <= 55.6425 )
							if( basis_minus <= -0.7825 )
								ret := -0.916667 // sell
							if( basis_minus > -0.7825 )
								ret := -0.500000
						if( senkou_span_a_displaced > 55.6425 )
							ret := -0.125000
					if( basis_max > 0.632567 )
						if( chinkou_span <= 47.413 )
							if( tenkan_sen <= 51.1838 )
								ret := 0.600000
							if( tenkan_sen > 51.1838 )
								ret := -0.857143 // sell
						if( chinkou_span > 47.413 )
							ret := 1.000000 // buy
	if( chinkou_span > 49.0014 )
		if( senkou_span_a_displaced <= 48.9371 )
			if( chinkou_span <= 49.8803 )
				if( tenkan_sen <= 49.5275 )
					if( senkou_span_a <= 49.04 )
						if( basis_minus <= -0.583012 )
							if( tenkan_sen <= 46.076 )
								ret := 0.954545 // buy
							if( tenkan_sen > 46.076 )
								ret := 0.666667
						if( basis_minus > -0.583012 )
							if( senkou_span_b <= 47.4475 )
								ret := 0.430380
							if( senkou_span_b > 47.4475 )
								ret := -0.133333
					if( senkou_span_a > 49.04 )
						if( basis_max <= 0.0125 )
							ret := 1.000000 // buy
						if( basis_max > 0.0125 )
							ret := 0.857143 // buy
				if( tenkan_sen > 49.5275 )
					if( tenkan_sen <= 50.9989 )
						if( basis_minus <= 0.906491 )
							ret := -0.200000
						if( basis_minus > 0.906491 )
							if( basis_minus <= 0.966375 )
								ret := -0.714286 // sell
							if( basis_minus > 0.966375 )
								ret := -0.944444 // sell
					if( tenkan_sen > 50.9989 )
						if( basis_minus <= 0.965201 )
							ret := 0.000000
						if( basis_minus > 0.965201 )
							if( kinjun_sen <= 50.181 )
								ret := 1.000000 // buy
							if( kinjun_sen > 50.181 )
								ret := 0.571429
			if( chinkou_span > 49.8803 )
				if( basis_max <= 0.2712 )
					if( chinkou_span <= 51.5505 )
						if( senkou_span_a <= 49.4833 )
							if( tenkan_sen <= 42.63 )
								ret := 0.967742 // buy
							if( tenkan_sen > 42.63 )
								ret := 0.605714
						if( senkou_span_a > 49.4833 )
							if( senkou_span_a_displaced <= 48.15 )
								ret := -0.571429
							if( senkou_span_a_displaced > 48.15 )
								ret := 0.000000
					if( chinkou_span > 51.5505 )
						if( basis_minus <= 1.89005 )
							if( senkou_span_a_displaced <= 48.2816 )
								ret := 0.783505 // buy
							if( senkou_span_a_displaced > 48.2816 )
								ret := 0.971014 // buy
						if( basis_minus > 1.89005 )
							if( chinkou_span <= 55.5462 )
								ret := -0.571429
							if( chinkou_span > 55.5462 )
								ret := 0.944444 // buy
				if( basis_max > 0.2712 )
					ret := -0.625000
		if( senkou_span_a_displaced > 48.9371 )
			if( chinkou_span <= 55.3054 )
				if( kinjun_sen <= 56.0225 )
					if( basis_max <= 0.33835 )
						if( senkou_span_a <= 50.0815 )
							if( senkou_span_b_displaced <= 46.186 )
								ret := -1.000000 // sell
							if( senkou_span_b_displaced > 46.186 )
								ret := 0.146341
						if( senkou_span_a > 50.0815 )
							if( chinkou_span <= 53.0795 )
								ret := -0.533923
							if( chinkou_span > 53.0795 )
								ret := 0.017442
					if( basis_max > 0.33835 )
						if( senkou_span_b_displaced <= 56.0914 )
							if( senkou_span_b <= 52.785 )
								ret := 0.690476
							if( senkou_span_b > 52.785 )
								ret := -0.324324
						if( senkou_span_b_displaced > 56.0914 )
							if( kinjun_sen <= 55.8858 )
								ret := 0.846154 // buy
							if( kinjun_sen > 55.8858 )
								ret := 0.400000
				if( kinjun_sen > 56.0225 )
					if( chinkou_span <= 54.7385 )
						if( basis_minus <= -1.8675 )
							if( senkou_span_b <= 59.0586 )
								ret := 1.000000 // buy
							if( senkou_span_b > 59.0586 )
								ret := 0.428571
						if( basis_minus > -1.8675 )
							if( tenkan_sen <= 57.3407 )
								ret := -0.243243
							if( tenkan_sen > 57.3407 )
								ret := -0.714286 // sell
					if( chinkou_span > 54.7385 )
						if( senkou_span_b <= 58.315 )
							if( basis_minus <= 1.2922 )
								ret := -0.911504 // sell
							if( basis_minus > 1.2922 )
								ret := -0.562500
						if( senkou_span_b > 58.315 )
							if( senkou_span_a <= 59.4387 )
								ret := 0.000000
							if( senkou_span_a > 59.4387 )
								ret := -0.875000 // sell
			if( chinkou_span > 55.3054 )
				if( senkou_span_a <= 56.1535 )
					if( kinjun_sen <= 55.4051 )
						if( kinjun_sen <= 54.5198 )
							if( senkou_span_a_displaced <= 55.3546 )
								ret := 0.703883 // buy
							if( senkou_span_a_displaced > 55.3546 )
								ret := 0.104167
						if( kinjun_sen > 54.5198 )
							if( tenkan_sen <= 55.2198 )
								ret := -0.410714
							if( tenkan_sen > 55.2198 )
								ret := 0.197674
					if( kinjun_sen > 55.4051 )
						if( chinkou_span <= 56.005 )
							if( senkou_span_a <= 56.0856 )
								ret := 0.540541
							if( senkou_span_a > 56.0856 )
								ret := -0.400000
						if( chinkou_span > 56.005 )
							if( tenkan_sen <= 56.1419 )
								ret := 0.801105 // buy
							if( tenkan_sen > 56.1419 )
								ret := 0.388889
				if( senkou_span_a > 56.1535 )
					if( chinkou_span <= 59.1936 )
						if( tenkan_sen <= 57.6319 )
							if( senkou_span_a <= 57.3378 )
								ret := -0.081420
							if( senkou_span_a > 57.3378 )
								ret := 0.410256
						if( tenkan_sen > 57.6319 )
							if( basis_max <= 0.506096 )
								ret := -0.360864
							if( basis_max > 0.506096 )
								ret := 0.692308
					if( chinkou_span > 59.1936 )
						if( tenkan_sen <= 60.0654 )
							if( basis_max <= -0.123317 )
								ret := 0.173913
							if( basis_max > -0.123317 )
								ret := 0.585014
						if( tenkan_sen > 60.0654 )
							if( basis_minus <= 23.4737 )
								ret := 0.049325
							if( basis_minus > 23.4737 )
								ret := -0.930233 // sell
	
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
float op_operation = decision_tree_0_CRWD_15Min_f47d68f5(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)

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


