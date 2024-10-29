//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: ABNB_5Min_1ICH_274c4840 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ABNB_5Min_1ICH_274c4840", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ABNB_5Min_274c4840(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( senkou_span_b_displaced <= 126.67 )
		if( chinkou_span <= 125.927 )
			if( tenkan_sen <= 125.233 )
				if( chinkou_span <= 119.493 )
					if( tenkan_sen <= 117.944 )
						if( chinkou_span <= 117.18 )
							ret := -0.005579
						if( chinkou_span > 117.18 )
							ret := 0.362336
					if( tenkan_sen > 117.944 )
						if( kinjun_sen <= 120.67 )
							ret := -0.267516
						if( kinjun_sen > 120.67 )
							ret := -0.801418 // sell
				if( chinkou_span > 119.493 )
					if( senkou_span_a <= 120.911 )
						if( senkou_span_b_displaced <= 117.262 )
							ret := 0.319231
						if( senkou_span_b_displaced > 117.262 )
							ret := 0.629902
					if( senkou_span_a > 120.911 )
						if( chinkou_span <= 124.383 )
							ret := -0.105686
						if( chinkou_span > 124.383 )
							ret := 0.337802
			if( tenkan_sen > 125.233 )
				if( senkou_span_b_displaced <= 126.142 )
					if( basis_minus <= -0.15609 )
						if( basis_max <= -0.0272 )
							ret := 0.541667
						if( basis_max > -0.0272 )
							ret := -0.281690
					if( basis_minus > -0.15609 )
						if( senkou_span_b_displaced <= 124.493 )
							ret := 0.054545
						if( senkou_span_b_displaced > 124.493 )
							ret := -0.661142
				if( senkou_span_b_displaced > 126.142 )
					if( senkou_span_a_displaced <= 125.957 )
						if( basis_minus <= -0.191207 )
							ret := -0.666667
						if( basis_minus > -0.191207 )
							ret := 0.764706 // buy
					if( senkou_span_a_displaced > 125.957 )
						if( senkou_span_b_displaced <= 126.208 )
							ret := 0.625000
						if( senkou_span_b_displaced > 126.208 )
							ret := -0.712121 // sell
		if( chinkou_span > 125.927 )
			if( basis_max <= -0.047409 )
				if( senkou_span_a_displaced <= 125.105 )
					if( basis_max <= -0.639751 )
						if( senkou_span_b_displaced <= 124.395 )
							ret := -0.161290
						if( senkou_span_b_displaced > 124.395 )
							ret := -0.937500 // sell
					if( basis_max > -0.639751 )
						if( senkou_span_b <= 122.985 )
							ret := -1.000000 // sell
						if( senkou_span_b > 122.985 )
							ret := 0.596302
				if( senkou_span_a_displaced > 125.105 )
					if( tenkan_sen <= 126.805 )
						if( senkou_span_b <= 125.938 )
							ret := 0.414634
						if( senkou_span_b > 125.938 )
							ret := -0.379310
					if( tenkan_sen > 126.805 )
						if( basis_minus <= 0.427085 )
							ret := 0.659259
						if( basis_minus > 0.427085 )
							ret := 0.175197
			if( basis_max > -0.047409 )
				if( chinkou_span <= 128.069 )
					if( tenkan_sen <= 126.37 )
						if( kinjun_sen <= 123.437 )
							ret := -0.666667
						if( kinjun_sen > 123.437 )
							ret := 0.675381
					if( tenkan_sen > 126.37 )
						if( basis_minus <= 0.024369 )
							ret := 0.666667
						if( basis_minus > 0.024369 )
							ret := -0.519481
				if( chinkou_span > 128.069 )
					if( senkou_span_b_displaced <= 126.394 )
						if( senkou_span_a_displaced <= 126.663 )
							ret := 0.926829 // buy
						if( senkou_span_a_displaced > 126.663 )
							ret := 0.723077 // buy
					if( senkou_span_b_displaced > 126.394 )
						if( senkou_span_b <= 127.339 )
							ret := 0.151515
						if( senkou_span_b > 127.339 )
							ret := 0.846154 // buy
	if( senkou_span_b_displaced > 126.67 )
		if( senkou_span_a_displaced <= 168.964 )
			if( chinkou_span <= 127.846 )
				if( senkou_span_a <= 126.568 )
					if( senkou_span_b <= 125.852 )
						if( chinkou_span <= 109.913 )
							ret := 0.439024
						if( chinkou_span > 109.913 )
							ret := -0.450644
					if( senkou_span_b > 125.852 )
						if( basis_minus <= -1.47053 )
							ret := -0.478261
						if( basis_minus > -1.47053 )
							ret := 0.247951
				if( senkou_span_a > 126.568 )
					if( senkou_span_a_displaced <= 129.873 )
						if( chinkou_span <= 126.192 )
							ret := -0.605357
						if( chinkou_span > 126.192 )
							ret := -0.259259
					if( senkou_span_a_displaced > 129.873 )
						if( chinkou_span <= 125.985 )
							ret := -0.071429
						if( chinkou_span > 125.985 )
							ret := -0.881423 // sell
			if( chinkou_span > 127.846 )
				if( kinjun_sen <= 127.95 )
					if( senkou_span_a_displaced <= 127.436 )
						if( chinkou_span <= 128.377 )
							ret := -0.192308
						if( chinkou_span > 128.377 )
							ret := 0.670330
					if( senkou_span_a_displaced > 127.436 )
						if( chinkou_span <= 128.243 )
							ret := 0.200000
						if( chinkou_span > 128.243 )
							ret := 0.766284 // buy
				if( kinjun_sen > 127.95 )
					if( chinkou_span <= 138.635 )
						if( tenkan_sen <= 137.469 )
							ret := -0.034413
						if( tenkan_sen > 137.469 )
							ret := -0.532781
					if( chinkou_span > 138.635 )
						if( tenkan_sen <= 139.615 )
							ret := 0.454373
						if( tenkan_sen > 139.615 )
							ret := -0.011542
		if( senkou_span_a_displaced > 168.964 )
			if( basis_max <= 0.183578 )
				if( chinkou_span <= 168.215 )
					if( senkou_span_b <= 168.101 )
						ret := 0.000000
					if( senkou_span_b > 168.101 )
						if( tenkan_sen <= 168.747 )
							ret := -1.000000 // sell
						if( tenkan_sen > 168.747 )
							ret := -0.800000 // sell
				if( chinkou_span > 168.215 )
					ret := 0.000000
			if( basis_max > 0.183578 )
				ret := -0.142857
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_ABNB_5Min_274c4840(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)

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


