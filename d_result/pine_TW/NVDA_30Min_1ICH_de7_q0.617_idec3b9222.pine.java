//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: NVDA_30Min_1ICH_ec3b9222 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVDA_30Min_1ICH_ec3b9222", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVDA_30Min_ec3b9222(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( basis_max <= -0.260499 )
		if( tenkan_sen <= 104.588 )
			if( basis_minus <= 7.07875 )
				if( chinkou_span <= 104.037 )
					if( basis_minus <= 2.13829 )
						if( kinjun_sen <= 28.8599 )
							if( senkou_span_b_displaced <= 27.7496 )
								ret := 0.827586 // buy
							if( senkou_span_b_displaced > 27.7496 )
								ret := 0.411765
						if( kinjun_sen > 28.8599 )
							if( senkou_span_a <= 33.1022 )
								ret := -0.562500
							if( senkou_span_a > 33.1022 )
								ret := 0.215569
					if( basis_minus > 2.13829 )
						if( senkou_span_a <= 84.2963 )
							if( basis_max <= -0.454163 )
								ret := 0.974026 // buy
							if( basis_max > -0.454163 )
								ret := 0.666667
						if( senkou_span_a > 84.2963 )
							if( basis_minus <= 2.42108 )
								ret := 0.696970
							if( basis_minus > 2.42108 )
								ret := 0.085106
				if( chinkou_span > 104.037 )
					if( tenkan_sen <= 103.097 )
						if( senkou_span_b <= 100.934 )
							if( basis_minus <= 1.23251 )
								ret := 0.606061
							if( basis_minus > 1.23251 )
								ret := 0.896552 // buy
						if( senkou_span_b > 100.934 )
							if( senkou_span_b <= 101.69 )
								ret := 0.240000
							if( senkou_span_b > 101.69 )
								ret := -0.111111
					if( tenkan_sen > 103.097 )
						if( senkou_span_a <= 103.944 )
							if( senkou_span_a_displaced <= 105.189 )
								ret := 0.886598 // buy
							if( senkou_span_a_displaced > 105.189 )
								ret := 0.000000
						if( senkou_span_a > 103.944 )
							ret := 0.285714
			if( basis_minus > 7.07875 )
				if( senkou_span_b <= 77.7897 )
					ret := -0.250000
				if( senkou_span_b > 77.7897 )
					ret := -1.000000 // sell
		if( tenkan_sen > 104.588 )
			if( basis_minus <= 2.31872 )
				if( senkou_span_b <= 888.3 )
					if( senkou_span_b_displaced <= 550.922 )
						if( senkou_span_a <= 526.469 )
							if( senkou_span_a_displaced <= 207.184 )
								ret := 0.038952
							if( senkou_span_a_displaced > 207.184 )
								ret := 0.122946
						if( senkou_span_a > 526.469 )
							if( senkou_span_b_displaced <= 536.12 )
								ret := -0.583333
							if( senkou_span_b_displaced > 536.12 )
								ret := -0.081871
					if( senkou_span_b_displaced > 550.922 )
						if( tenkan_sen <= 605.356 )
							if( basis_max <= -3.76783 )
								ret := -0.055556
							if( basis_max > -3.76783 )
								ret := 0.528736
						if( tenkan_sen > 605.356 )
							if( senkou_span_a_displaced <= 627.121 )
								ret := -0.081395
							if( senkou_span_a_displaced > 627.121 )
								ret := 0.315436
				if( senkou_span_b > 888.3 )
					if( chinkou_span <= 889.173 )
						if( kinjun_sen <= 1197.95 )
							if( kinjun_sen <= 885.691 )
								ret := -0.875000 // sell
							if( kinjun_sen > 885.691 )
								ret := -0.984848 // sell
						if( kinjun_sen > 1197.95 )
							if( chinkou_span <= 121.625 )
								ret := -1.000000 // sell
							if( chinkou_span > 121.625 )
								ret := -0.250000
					if( chinkou_span > 889.173 )
						if( basis_minus <= -9.9177 )
							ret := -1.000000 // sell
						if( basis_minus > -9.9177 )
							if( senkou_span_a <= 930.796 )
								ret := -0.046512
							if( senkou_span_a > 930.796 )
								ret := 0.545455
			if( basis_minus > 2.31872 )
				if( basis_max <= -0.984781 )
					if( senkou_span_b_displaced <= 109.723 )
						if( tenkan_sen <= 117.214 )
							if( senkou_span_b_displaced <= 103.29 )
								ret := -1.000000 // sell
							if( senkou_span_b_displaced > 103.29 )
								ret := 0.846715 // buy
						if( tenkan_sen > 117.214 )
							if( senkou_span_a_displaced <= 107.369 )
								ret := -0.956522 // sell
							if( senkou_span_a_displaced > 107.369 )
								ret := 0.452381
					if( senkou_span_b_displaced > 109.723 )
						if( senkou_span_b <= 127.946 )
							if( tenkan_sen <= 119.068 )
								ret := -0.976190 // sell
							if( tenkan_sen > 119.068 )
								ret := -0.591398
						if( senkou_span_b > 127.946 )
							if( senkou_span_a_displaced <= 143.172 )
								ret := 0.386792
							if( senkou_span_a_displaced > 143.172 )
								ret := 0.042802
				if( basis_max > -0.984781 )
					if( chinkou_span <= 120.81 )
						if( tenkan_sen <= 105.452 )
							if( chinkou_span <= 101.137 )
								ret := 0.866667 // buy
							if( chinkou_span > 101.137 )
								ret := -0.416667
						if( tenkan_sen > 105.452 )
							if( chinkou_span <= 118.748 )
								ret := -0.902913 // sell
							if( chinkou_span > 118.748 )
								ret := -0.500000
					if( chinkou_span > 120.81 )
						if( kinjun_sen <= 122.688 )
							if( basis_minus <= 2.90636 )
								ret := 0.478261
							if( basis_minus > 2.90636 )
								ret := 0.880000 // buy
						if( kinjun_sen > 122.688 )
							if( chinkou_span <= 256.823 )
								ret := -0.185586
							if( chinkou_span > 256.823 )
								ret := -0.018236
	if( basis_max > -0.260499 )
		if( senkou_span_b <= 124.283 )
			if( chinkou_span <= 116.12 )
				if( senkou_span_b <= 111.751 )
					if( chinkou_span <= 106.655 )
						if( tenkan_sen <= 104.475 )
							if( senkou_span_b <= 106.665 )
								ret := 0.030014
							if( senkou_span_b > 106.665 )
								ret := 0.930233 // buy
						if( tenkan_sen > 104.475 )
							if( basis_max <= 0.426379 )
								ret := -0.614260
							if( basis_max > 0.426379 )
								ret := 0.142857
					if( chinkou_span > 106.655 )
						if( tenkan_sen <= 106.746 )
							if( basis_minus <= 1.61509 )
								ret := 0.739550 // buy
							if( basis_minus > 1.61509 )
								ret := -0.166667
						if( tenkan_sen > 106.746 )
							if( chinkou_span <= 108.567 )
								ret := -0.364238
							if( chinkou_span > 108.567 )
								ret := 0.493151
				if( senkou_span_b > 111.751 )
					if( senkou_span_b_displaced <= 128.8 )
						if( senkou_span_a <= 117.056 )
							if( senkou_span_b_displaced <= 114.517 )
								ret := -0.630824
							if( senkou_span_b_displaced > 114.517 )
								ret := -0.142857
						if( senkou_span_a > 117.056 )
							if( basis_max <= 0.32534 )
								ret := -0.952055 // sell
							if( basis_max > 0.32534 )
								ret := -0.725275 // sell
					if( senkou_span_b_displaced > 128.8 )
						if( senkou_span_b_displaced <= 129.31 )
							ret := 1.000000 // buy
						if( senkou_span_b_displaced > 129.31 )
							ret := 0.750000 // buy
			if( chinkou_span > 116.12 )
				if( tenkan_sen <= 119.559 )
					if( senkou_span_b_displaced <= 103.406 )
						if( tenkan_sen <= 108.885 )
							ret := -0.500000
						if( tenkan_sen > 108.885 )
							if( kinjun_sen <= 109.212 )
								ret := -1.000000 // sell
							if( kinjun_sen > 109.212 )
								ret := -0.625000
					if( senkou_span_b_displaced > 103.406 )
						if( tenkan_sen <= 114.039 )
							if( kinjun_sen <= 116.852 )
								ret := 0.906977 // buy
							if( kinjun_sen > 116.852 )
								ret := 0.333333
						if( tenkan_sen > 114.039 )
							if( senkou_span_a <= 118.923 )
								ret := 0.348485
							if( senkou_span_a > 118.923 )
								ret := 0.707113 // buy
				if( tenkan_sen > 119.559 )
					if( chinkou_span <= 121.683 )
						if( senkou_span_a_displaced <= 117.666 )
							if( chinkou_span <= 119.042 )
								ret := 0.923077 // buy
							if( chinkou_span > 119.042 )
								ret := 0.500000
						if( senkou_span_a_displaced > 117.666 )
							if( senkou_span_a_displaced <= 127.455 )
								ret := -0.405797
							if( senkou_span_a_displaced > 127.455 )
								ret := 0.600000
					if( chinkou_span > 121.683 )
						if( basis_minus <= -0.437815 )
							if( kinjun_sen <= 121.37 )
								ret := -0.500000
							if( kinjun_sen > 121.37 )
								ret := 0.776744 // buy
						if( basis_minus > -0.437815 )
							if( basis_minus <= 0.053988 )
								ret := -0.420290
							if( basis_minus > 0.053988 )
								ret := 0.501887
		if( senkou_span_b > 124.283 )
			if( chinkou_span <= 128.188 )
				if( senkou_span_a <= 392.256 )
					if( chinkou_span <= 123.515 )
						if( kinjun_sen <= 124.741 )
							if( senkou_span_b <= 126.38 )
								ret := -0.822430 // sell
							if( senkou_span_b > 126.38 )
								ret := -0.148148
						if( kinjun_sen > 124.741 )
							if( senkou_span_b_displaced <= 124.283 )
								ret := -0.300000
							if( senkou_span_b_displaced > 124.283 )
								ret := -0.872852 // sell
					if( chinkou_span > 123.515 )
						if( tenkan_sen <= 130.241 )
							if( senkou_span_b_displaced <= 135.413 )
								ret := -0.381924
							if( senkou_span_b_displaced > 135.413 )
								ret := 0.506667
						if( tenkan_sen > 130.241 )
							if( chinkou_span <= 126.334 )
								ret := -0.451613
							if( chinkou_span > 126.334 )
								ret := -0.801282 // sell
				if( senkou_span_a > 392.256 )
					if( basis_minus <= -18.7263 )
						if( chinkou_span <= 121.315 )
							if( senkou_span_a <= 1197 )
								ret := 0.777778 // buy
							if( senkou_span_a > 1197 )
								ret := 0.941176 // buy
						if( chinkou_span > 121.315 )
							if( tenkan_sen <= 119.646 )
								ret := 0.750000 // buy
							if( tenkan_sen > 119.646 )
								ret := 0.250000
					if( basis_minus > -18.7263 )
						if( senkou_span_a <= 666.193 )
							ret := 0.000000
						if( senkou_span_a > 666.193 )
							ret := 0.250000
			if( chinkou_span > 128.188 )
				if( kinjun_sen <= 130.049 )
					if( chinkou_span <= 129.994 )
						if( senkou_span_a <= 126.392 )
							if( basis_max <= 0.921681 )
								ret := 0.928571 // buy
							if( basis_max > 0.921681 )
								ret := 0.166667
						if( senkou_span_a > 126.392 )
							if( basis_minus <= -2.71725 )
								ret := -1.000000 // sell
							if( basis_minus > -2.71725 )
								ret := -0.033333
					if( chinkou_span > 129.994 )
						if( senkou_span_b_displaced <= 135.44 )
							if( tenkan_sen <= 127.424 )
								ret := 0.948980 // buy
							if( tenkan_sen > 127.424 )
								ret := 0.658120
						if( senkou_span_b_displaced > 135.44 )
							ret := -0.400000
				if( kinjun_sen > 130.049 )
					if( kinjun_sen <= 150.404 )
						if( chinkou_span <= 150.731 )
							if( senkou_span_b <= 128.983 )
								ret := -0.791667 // sell
							if( senkou_span_b > 128.983 )
								ret := -0.019188
						if( chinkou_span > 150.731 )
							if( senkou_span_b <= 151.623 )
								ret := 0.710173 // buy
							if( senkou_span_b > 151.623 )
								ret := -0.241935
					if( kinjun_sen > 150.404 )
						if( chinkou_span <= 151.778 )
							if( senkou_span_a_displaced <= 164.432 )
								ret := -0.520945
							if( senkou_span_a_displaced > 164.432 )
								ret := -0.866667 // sell
						if( chinkou_span > 151.778 )
							if( kinjun_sen <= 158.218 )
								ret := 0.291820
							if( kinjun_sen > 158.218 )
								ret := -0.046403
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_NVDA_30Min_ec3b9222(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)

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


