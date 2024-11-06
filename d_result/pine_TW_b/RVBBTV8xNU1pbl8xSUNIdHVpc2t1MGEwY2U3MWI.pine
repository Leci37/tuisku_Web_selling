//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: EPAM_15Min_1ICH_0a0ce71b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_EPAM_15Min_1ICH_0a0ce71b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_EPAM_15Min_0a0ce71b(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( senkou_span_a <= 701.835 )
		if( kinjun_sen <= 167.898 )
			if( senkou_span_b_displaced <= 165.128 )
				if( basis_minus <= -2.19426 )
					if( kinjun_sen <= 117.192 )
						if( basis_max <= 0.605 )
							if( tenkan_sen <= 101.991 )
								ret := 0.450000
							if( tenkan_sen > 101.991 )
								if( chinkou_span <= 108.77 )
									ret := -0.822917 // sell
								if( chinkou_span > 108.77 )
									ret := 0.388889
						if( basis_max > 0.605 )
							if( tenkan_sen <= 109.875 )
								if( chinkou_span <= 108.567 )
									ret := 1.000000 // buy
								if( chinkou_span > 108.567 )
									ret := 0.857143 // buy
							if( tenkan_sen > 109.875 )
								if( senkou_span_a <= 111.344 )
									ret := -0.857143 // sell
								if( senkou_span_a > 111.344 )
									ret := 1.000000 // buy
					if( kinjun_sen > 117.192 )
						if( basis_minus <= -2.62697 )
							if( kinjun_sen <= 126.647 )
								if( basis_max <= 0.426074 )
									ret := -0.617647
								if( basis_max > 0.426074 )
									ret := -0.973333 // sell
							if( kinjun_sen > 126.647 )
								ret := 0.000000
						if( basis_minus > -2.62697 )
							if( tenkan_sen <= 126.235 )
								if( senkou_span_b_displaced <= 123.455 )
									ret := -0.756098 // sell
								if( senkou_span_b_displaced > 123.455 )
									ret := 0.189189
							if( tenkan_sen > 126.235 )
								if( senkou_span_a <= 127.21 )
									ret := -1.000000 // sell
								if( senkou_span_a > 127.21 )
									ret := -0.684211
				if( basis_minus > -2.19426 )
					if( chinkou_span <= 126.662 )
						if( senkou_span_a <= 124.53 )
							if( chinkou_span <= 122.725 )
								if( senkou_span_b <= 115.2 )
									ret := 0.052601
								if( senkou_span_b > 115.2 )
									ret := -0.161229
							if( chinkou_span > 122.725 )
								if( senkou_span_a <= 122.179 )
									ret := 0.653846
								if( senkou_span_a > 122.179 )
									ret := 0.172174
						if( senkou_span_a > 124.53 )
							if( basis_minus <= -0.980135 )
								if( kinjun_sen <= 125.636 )
									ret := 0.333333
								if( kinjun_sen > 125.636 )
									ret := -0.193798
							if( basis_minus > -0.980135 )
								if( chinkou_span <= 125.786 )
									ret := -0.580268
								if( chinkou_span > 125.786 )
									ret := -0.011628
					if( chinkou_span > 126.662 )
						if( senkou_span_b_displaced <= 126.061 )
							if( senkou_span_b <= 124.68 )
								if( senkou_span_a_displaced <= 119.542 )
									ret := 0.262295
								if( senkou_span_a_displaced > 119.542 )
									ret := 0.791165 // buy
							if( senkou_span_b > 124.68 )
								if( chinkou_span <= 130.515 )
									ret := 0.233945
								if( chinkou_span > 130.515 )
									ret := 0.654088
						if( senkou_span_b_displaced > 126.061 )
							if( tenkan_sen <= 129.105 )
								if( senkou_span_a <= 128.442 )
									ret := 0.354167
								if( senkou_span_a > 128.442 )
									ret := 0.824427 // buy
							if( tenkan_sen > 129.105 )
								if( senkou_span_b <= 135.103 )
									ret := -0.136190
								if( senkou_span_b > 135.103 )
									ret := 0.069170
			if( senkou_span_b_displaced > 165.128 )
				if( kinjun_sen <= 164.615 )
					if( basis_minus <= -0.80628 )
						if( senkou_span_a <= 164.88 )
							if( basis_minus <= -2.94 )
								if( basis_minus <= -4.99687 )
									ret := 0.923077 // buy
								if( basis_minus > -4.99687 )
									ret := 0.607143
							if( basis_minus > -2.94 )
								ret := 1.000000 // buy
						if( senkou_span_a > 164.88 )
							ret := -0.117647
					if( basis_minus > -0.80628 )
						ret := 1.000000 // buy
				if( kinjun_sen > 164.615 )
					if( basis_minus <= 1.74332 )
						if( basis_max <= 1.05892 )
							if( chinkou_span <= 170.143 )
								if( senkou_span_a_displaced <= 170.921 )
									ret := 0.341137
								if( senkou_span_a_displaced > 170.921 )
									ret := 0.843137 // buy
							if( chinkou_span > 170.143 )
								if( tenkan_sen <= 165.855 )
									ret := -0.714286 // sell
								if( tenkan_sen > 165.855 )
									ret := 0.871795 // buy
						if( basis_max > 1.05892 )
							if( senkou_span_a_displaced <= 172.206 )
								if( tenkan_sen <= 162.816 )
									ret := 1.000000 // buy
								if( tenkan_sen > 162.816 )
									ret := 0.222222
							if( senkou_span_a_displaced > 172.206 )
								ret := -0.954545 // sell
					if( basis_minus > 1.74332 )
						if( tenkan_sen <= 170.836 )
							if( senkou_span_b <= 165.991 )
								ret := -0.666667
							if( senkou_span_b > 165.991 )
								ret := 0.111111
						if( tenkan_sen > 170.836 )
							ret := -1.000000 // sell
		if( kinjun_sen > 167.898 )
			if( chinkou_span <= 170.814 )
				if( senkou_span_a <= 171.719 )
					if( kinjun_sen <= 171.547 )
						if( senkou_span_b <= 170.347 )
							if( senkou_span_a_displaced <= 165.994 )
								if( kinjun_sen <= 170.001 )
									ret := 1.000000 // buy
								if( kinjun_sen > 170.001 )
									ret := 0.769231 // buy
							if( senkou_span_a_displaced > 165.994 )
								if( senkou_span_b_displaced <= 165.912 )
									ret := -0.761905 // sell
								if( senkou_span_b_displaced > 165.912 )
									ret := -0.240566
						if( senkou_span_b > 170.347 )
							if( tenkan_sen <= 170.446 )
								if( senkou_span_a <= 169.129 )
									ret := -1.000000 // sell
								if( senkou_span_a > 169.129 )
									ret := -0.160714
							if( tenkan_sen > 170.446 )
								if( senkou_span_a <= 171.114 )
									ret := -0.708333 // sell
								if( senkou_span_a > 171.114 )
									ret := -1.000000 // sell
					if( kinjun_sen > 171.547 )
						if( basis_minus <= -2.80563 )
							ret := -0.538462
						if( basis_minus > -2.80563 )
							if( kinjun_sen <= 171.891 )
								ret := 0.882353 // buy
							if( kinjun_sen > 171.891 )
								if( chinkou_span <= 165.75 )
									ret := 0.708333 // buy
								if( chinkou_span > 165.75 )
									ret := 0.384615
				if( senkou_span_a > 171.719 )
					if( kinjun_sen <= 178.529 )
						if( senkou_span_b <= 182.836 )
							if( senkou_span_b_displaced <= 172.915 )
								if( senkou_span_b <= 167.375 )
									ret := -0.951220 // sell
								if( senkou_span_b > 167.375 )
									ret := -0.723810 // sell
							if( senkou_span_b_displaced > 172.915 )
								if( senkou_span_a_displaced <= 175.643 )
									ret := -0.066667
								if( senkou_span_a_displaced > 175.643 )
									ret := -0.650350
						if( senkou_span_b > 182.836 )
							if( senkou_span_a_displaced <= 183.253 )
								ret := 0.750000 // buy
							if( senkou_span_a_displaced > 183.253 )
								ret := 0.923077 // buy
					if( kinjun_sen > 178.529 )
						if( chinkou_span <= 170.538 )
							ret := -1.000000 // sell
						if( chinkou_span > 170.538 )
							ret := -0.833333 // sell
			if( chinkou_span > 170.814 )
				if( kinjun_sen <= 182.156 )
					if( chinkou_span <= 180.188 )
						if( senkou_span_a_displaced <= 178.127 )
							if( basis_max <= 1.51125 )
								if( senkou_span_a <= 173.221 )
									ret := 0.333333
								if( senkou_span_a > 173.221 )
									ret := 0.023126
							if( basis_max > 1.51125 )
								if( basis_minus <= -3.81178 )
									ret := -1.000000 // sell
								if( basis_minus > -3.81178 )
									ret := -0.611111
						if( senkou_span_a_displaced > 178.127 )
							if( senkou_span_a <= 177.253 )
								if( senkou_span_b_displaced <= 184.223 )
									ret := -0.118644
								if( senkou_span_b_displaced > 184.223 )
									ret := 0.632653
							if( senkou_span_a > 177.253 )
								if( senkou_span_b <= 179.236 )
									ret := -0.355072
								if( senkou_span_b > 179.236 )
									ret := -0.612500
					if( chinkou_span > 180.188 )
						if( senkou_span_a_displaced <= 185.775 )
							if( tenkan_sen <= 179.885 )
								if( senkou_span_a <= 180.15 )
									ret := 0.411215
								if( senkou_span_a > 180.15 )
									ret := -0.400000
							if( tenkan_sen > 179.885 )
								if( basis_max <= -1.17 )
									ret := 0.133333
								if( basis_max > -1.17 )
									ret := 0.592486
						if( senkou_span_a_displaced > 185.775 )
							if( senkou_span_b_displaced <= 189.439 )
								ret := 0.782609 // buy
							if( senkou_span_b_displaced > 189.439 )
								ret := 1.000000 // buy
				if( kinjun_sen > 182.156 )
					if( basis_max <= 0.963702 )
						if( senkou_span_a_displaced <= 670.69 )
							if( chinkou_span <= 183.07 )
								if( basis_max <= 0.351741 )
									ret := -0.692982
								if( basis_max > 0.351741 )
									ret := -0.378378
							if( chinkou_span > 183.07 )
								if( senkou_span_a <= 186.837 )
									ret := 0.214744
								if( senkou_span_a > 186.837 )
									ret := 0.006796
						if( senkou_span_a_displaced > 670.69 )
							if( basis_minus <= -2.4456 )
								if( chinkou_span <= 667.815 )
									ret := -0.909091 // sell
								if( chinkou_span > 667.815 )
									ret := -0.325843
							if( basis_minus > -2.4456 )
								if( basis_max <= -3.07931 )
									ret := 0.714286 // buy
								if( basis_max > -3.07931 )
									ret := 0.160000
					if( basis_max > 0.963702 )
						if( chinkou_span <= 229.666 )
							if( senkou_span_a <= 218.231 )
								if( basis_max <= 2.38437 )
									ret := -0.009537
								if( basis_max > 2.38437 )
									ret := -0.388235
							if( senkou_span_a > 218.231 )
								if( basis_max <= 14.0022 )
									ret := -0.638935
								if( basis_max > 14.0022 )
									ret := -0.086207
						if( chinkou_span > 229.666 )
							if( senkou_span_a <= 234.526 )
								if( basis_max <= 1.00103 )
									ret := 0.000000
								if( basis_max > 1.00103 )
									ret := 0.774336 // buy
							if( senkou_span_a > 234.526 )
								if( senkou_span_b <= 437.584 )
									ret := -0.088996
								if( senkou_span_b > 437.584 )
									ret := 0.054632
	if( senkou_span_a > 701.835 )
		if( chinkou_span <= 700.545 )
			if( kinjun_sen <= 717.542 )
				if( senkou_span_b_displaced <= 711.737 )
					if( senkou_span_b_displaced <= 694.996 )
						if( chinkou_span <= 697.327 )
							if( senkou_span_a_displaced <= 707.937 )
								ret := -0.181818
							if( senkou_span_a_displaced > 707.937 )
								ret := -1.000000 // sell
						if( chinkou_span > 697.327 )
							ret := -1.000000 // sell
					if( senkou_span_b_displaced > 694.996 )
						ret := -1.000000 // sell
				if( senkou_span_b_displaced > 711.737 )
					ret := -0.500000
			if( kinjun_sen > 717.542 )
				ret := -0.333333
		if( chinkou_span > 700.545 )
			if( kinjun_sen <= 713.29 )
				if( tenkan_sen <= 716.589 )
					if( chinkou_span <= 707.622 )
						ret := -0.375000
					if( chinkou_span > 707.622 )
						if( senkou_span_a_displaced <= 714.775 )
							ret := 0.750000 // buy
						if( senkou_span_a_displaced > 714.775 )
							ret := 0.100000
				if( tenkan_sen > 716.589 )
					ret := -0.368421
			if( kinjun_sen > 713.29 )
				if( basis_minus <= 12.2059 )
					ret := 0.100000
				if( basis_minus > 12.2059 )
					ret := -0.714286 // sell
	
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
float op_operation = decision_tree_0_EPAM_15Min_0a0ce71b(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)

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


