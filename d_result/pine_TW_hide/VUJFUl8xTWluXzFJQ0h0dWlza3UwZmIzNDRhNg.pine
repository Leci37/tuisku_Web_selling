//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: UBER_1Min_1ICH_0fb344a6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UBER_1Min_1ICH_0fb344a6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UBER_1Min_0fb344a6(senkou_span_a_displaced, cross_dn_tenkan_kinjunInt, kinjun_sen, chinkou_span, senkou_span_b_displaced, basis_minus, senkou_span_b, senkou_span_a, cross_up_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( senkou_span_a_displaced <= 54.7863 )
		if( tenkan_sen <= 55.5712 )
			if( senkou_span_a_displaced <= 54.0134 )
				if( basis_max <= -0.18625 )
					if( kinjun_sen <= 55.11 )
						if( senkou_span_a_displaced <= 53.6417 )
							if( basis_minus <= 0.393639 )
								ret := 0.750000 // buy
							if( basis_minus > 0.393639 )
								ret := 1.000000 // buy
						if( senkou_span_a_displaced > 53.6417 )
							ret := 1.000000 // buy
					if( kinjun_sen > 55.11 )
						ret := 0.500000
				if( basis_max > -0.18625 )
					ret := 1.000000 // buy
			if( senkou_span_a_displaced > 54.0134 )
				if( tenkan_sen <= 53.7718 )
					ret := 1.000000 // buy
				if( tenkan_sen > 53.7718 )
					if( senkou_span_a_displaced <= 54.1832 )
						ret := 0.600000
					if( senkou_span_a_displaced > 54.1832 )
						ret := -0.250000
		if( tenkan_sen > 55.5712 )
			if( senkou_span_b_displaced <= 54.1195 )
				ret := 1.000000 // buy
			if( senkou_span_b_displaced > 54.1195 )
				if( senkou_span_a_displaced <= 54.6313 )
					if( basis_max <= -0.27875 )
						ret := -0.500000
					if( basis_max > -0.27875 )
						ret := -1.000000 // sell
				if( senkou_span_a_displaced > 54.6313 )
					ret := 0.000000
	if( senkou_span_a_displaced > 54.7863 )
		if( basis_max <= 0.004013 )
			if( senkou_span_b <= 72.7225 )
				if( tenkan_sen <= 57.0657 )
					if( tenkan_sen <= 56.8919 )
						if( basis_max <= -0.001059 )
							if( chinkou_span <= 57.7561 )
								ret := -1.000000 // sell
							if( chinkou_span > 57.7561 )
								ret := -0.833333 // sell
						if( basis_max > -0.001059 )
							if( basis_minus <= -0.00149 )
								ret := -0.666667
							if( basis_minus > -0.00149 )
								ret := -0.250000
					if( tenkan_sen > 56.8919 )
						if( chinkou_span <= 57.685 )
							if( basis_minus <= 1.01452 )
								ret := -0.870968 // sell
							if( basis_minus > 1.01452 )
								ret := 0.250000
						if( chinkou_span > 57.685 )
							ret := 1.000000 // buy
				if( tenkan_sen > 57.0657 )
					if( senkou_span_a_displaced <= 72.4336 )
						if( chinkou_span <= 72.444 )
							if( senkou_span_b_displaced <= 71.5699 )
								ret := -0.012578
							if( senkou_span_b_displaced > 71.5699 )
								ret := -0.240987
						if( chinkou_span > 72.444 )
							if( tenkan_sen <= 72.6573 )
								ret := 0.441744
							if( tenkan_sen > 72.6573 )
								ret := -0.153595
					if( senkou_span_a_displaced > 72.4336 )
						if( senkou_span_b <= 72.5885 )
							if( senkou_span_b_displaced <= 72.5016 )
								ret := 0.144366
							if( senkou_span_b_displaced > 72.5016 )
								ret := 0.517937
						if( senkou_span_b > 72.5885 )
							if( chinkou_span <= 72.8078 )
								ret := -0.188506
							if( chinkou_span > 72.8078 )
								ret := 0.361345
			if( senkou_span_b > 72.7225 )
				if( chinkou_span <= 73.0449 )
					if( tenkan_sen <= 72.9583 )
						if( chinkou_span <= 72.5492 )
							if( senkou_span_b_displaced <= 72.9125 )
								ret := -0.740331 // sell
							if( senkou_span_b_displaced > 72.9125 )
								ret := 0.058824
						if( chinkou_span > 72.5492 )
							if( basis_minus <= -0.146338 )
								ret := -0.755556 // sell
							if( basis_minus > -0.146338 )
								ret := -0.021212
					if( tenkan_sen > 72.9583 )
						if( kinjun_sen <= 73.0386 )
							if( basis_minus <= -0.065154 )
								ret := -0.166667
							if( basis_minus > -0.065154 )
								ret := -0.646503
						if( kinjun_sen > 73.0386 )
							if( senkou_span_b <= 73.3952 )
								ret := -0.026846
							if( senkou_span_b > 73.3952 )
								ret := -0.729730 // sell
				if( chinkou_span > 73.0449 )
					if( chinkou_span <= 74.0853 )
						if( tenkan_sen <= 74.038 )
							if( kinjun_sen <= 72.8278 )
								ret := 0.732143 // buy
							if( kinjun_sen > 72.8278 )
								ret := -0.063422
						if( tenkan_sen > 74.038 )
							if( senkou_span_b_displaced <= 73.9887 )
								ret := -0.708171 // sell
							if( senkou_span_b_displaced > 73.9887 )
								ret := -0.384314
					if( chinkou_span > 74.0853 )
						if( kinjun_sen <= 73.8801 )
							if( chinkou_span <= 74.1252 )
								ret := 0.232558
							if( chinkou_span > 74.1252 )
								ret := 0.728302 // buy
						if( kinjun_sen > 73.8801 )
							if( basis_minus <= 1.01331 )
								ret := -0.002039
							if( basis_minus > 1.01331 )
								ret := -0.901639 // sell
		if( basis_max > 0.004013 )
			if( senkou_span_a <= 76.9464 )
				if( basis_minus <= -0.438216 )
					if( chinkou_span <= 71.0291 )
						if( senkou_span_a <= 69.4784 )
							if( chinkou_span <= 69.0335 )
								ret := -0.146962
							if( chinkou_span > 69.0335 )
								ret := 0.671642
						if( senkou_span_a > 69.4784 )
							if( basis_minus <= -0.585611 )
								ret := -0.176991
							if( basis_minus > -0.585611 )
								ret := -0.818640 // sell
					if( chinkou_span > 71.0291 )
						if( senkou_span_a_displaced <= 73.248 )
							if( basis_max <= 0.018587 )
								ret := -0.214286
							if( basis_max > 0.018587 )
								ret := 0.751553 // buy
						if( senkou_span_a_displaced > 73.248 )
							if( basis_minus <= -0.51849 )
								ret := -0.157576
							if( basis_minus > -0.51849 )
								ret := -0.764706 // sell
				if( basis_minus > -0.438216 )
					if( basis_minus <= 0.95096 )
						if( senkou_span_b_displaced <= 55.8599 )
							if( senkou_span_a <= 54.6813 )
								ret := -0.500000
							if( senkou_span_a > 54.6813 )
								ret := -0.911392 // sell
						if( senkou_span_b_displaced > 55.8599 )
							if( senkou_span_a <= 57.8366 )
								ret := 0.694915
							if( senkou_span_a > 57.8366 )
								ret := 0.035395
					if( basis_minus > 0.95096 )
						if( senkou_span_a <= 70.9781 )
							if( senkou_span_a_displaced <= 70.3187 )
								ret := -1.000000 // sell
							if( senkou_span_a_displaced > 70.3187 )
								ret := -0.833333 // sell
						if( senkou_span_a > 70.9781 )
							ret := -0.333333
			if( senkou_span_a > 76.9464 )
				if( chinkou_span <= 77.3703 )
					if( senkou_span_a_displaced <= 77.6997 )
						if( senkou_span_b_displaced <= 76.786 )
							if( basis_minus <= 0.438263 )
								ret := -0.777778 // sell
							if( basis_minus > 0.438263 )
								ret := 0.000000
						if( senkou_span_b_displaced > 76.786 )
							if( tenkan_sen <= 76.9729 )
								ret := 0.692308
							if( tenkan_sen > 76.9729 )
								ret := 0.070423
					if( senkou_span_a_displaced > 77.6997 )
						if( senkou_span_b_displaced <= 77.7681 )
							if( kinjun_sen <= 77.7383 )
								ret := -0.617647
							if( kinjun_sen > 77.7383 )
								ret := 0.090909
						if( senkou_span_b_displaced > 77.7681 )
							if( senkou_span_a_displaced <= 78.0377 )
								ret := -0.800000 // sell
							if( senkou_span_a_displaced > 78.0377 )
								ret := -0.957447 // sell
				if( chinkou_span > 77.3703 )
					if( tenkan_sen <= 84.6122 )
						if( chinkou_span <= 81.9687 )
							if( tenkan_sen <= 77.4163 )
								ret := 0.662100
							if( tenkan_sen > 77.4163 )
								ret := 0.180479
						if( chinkou_span > 81.9687 )
							if( basis_max <= 0.074404 )
								ret := 0.589041
							if( basis_max > 0.074404 )
								ret := 0.888889 // buy
					if( tenkan_sen > 84.6122 )
						if( basis_minus <= -0.154919 )
							if( tenkan_sen <= 85.4879 )
								ret := 0.060976
							if( tenkan_sen > 85.4879 )
								ret := 0.670330
						if( basis_minus > -0.154919 )
							if( senkou_span_b <= 85.2189 )
								ret := 0.016949
							if( senkou_span_b > 85.2189 )
								ret := -0.327354
	
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
float op_operation = decision_tree_0_UBER_1Min_0fb344a6(senkou_span_a_displaced, cross_dn_tenkan_kinjunInt, kinjun_sen, chinkou_span, senkou_span_b_displaced, basis_minus, senkou_span_b, senkou_span_a, cross_up_tenkan_kinjunInt, tenkan_sen, basis_max)

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


