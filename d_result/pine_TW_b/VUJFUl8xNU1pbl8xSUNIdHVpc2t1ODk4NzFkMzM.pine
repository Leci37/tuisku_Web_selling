//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: UBER_15Min_1ICH_89871d33 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UBER_15Min_1ICH_89871d33", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UBER_15Min_89871d33(senkou_span_a_displaced, cross_dn_tenkan_kinjunInt, kinjun_sen, chinkou_span, senkou_span_b_displaced, basis_minus, senkou_span_b, senkou_span_a, cross_up_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( senkou_span_a_displaced <= 79.3463 )
		if( senkou_span_b <= 21.5774 )
			if( basis_minus <= -0.468302 )
				if( tenkan_sen <= 19.1845 )
					if( senkou_span_b_displaced <= 18.8575 )
						if( senkou_span_a <= 15.3161 )
							if( senkou_span_b <= 15.8045 )
								if( kinjun_sen <= 15.0401 )
									ret := -1.000000 // sell
								if( kinjun_sen > 15.0401 )
									ret := -0.812500 // sell
							if( senkou_span_b > 15.8045 )
								if( chinkou_span <= 15.0054 )
									ret := -0.636364
								if( chinkou_span > 15.0054 )
									ret := -0.238095
						if( senkou_span_a > 15.3161 )
							if( senkou_span_b <= 16.2663 )
								ret := 1.000000 // buy
							if( senkou_span_b > 16.2663 )
								ret := 0.375000
					if( senkou_span_b_displaced > 18.8575 )
						if( senkou_span_a_displaced <= 19.0241 )
							if( senkou_span_b_displaced <= 19.135 )
								ret := -1.000000 // sell
							if( senkou_span_b_displaced > 19.135 )
								if( senkou_span_a <= 17.3446 )
									ret := -0.818182 // sell
								if( senkou_span_a > 17.3446 )
									ret := -1.000000 // sell
						if( senkou_span_a_displaced > 19.0241 )
							if( senkou_span_a_displaced <= 19.2413 )
								ret := 0.666667
							if( senkou_span_a_displaced > 19.2413 )
								if( chinkou_span <= 16.7549 )
									ret := -0.384615
								if( chinkou_span > 16.7549 )
									ret := -1.000000 // sell
				if( tenkan_sen > 19.1845 )
					if( tenkan_sen <= 20.1516 )
						if( basis_minus <= -0.681181 )
							if( senkou_span_b_displaced <= 21.7754 )
								ret := 0.833333 // buy
							if( senkou_span_b_displaced > 21.7754 )
								ret := 1.000000 // buy
						if( basis_minus > -0.681181 )
							ret := 0.666667
					if( tenkan_sen > 20.1516 )
						if( chinkou_span <= 20.7553 )
							if( senkou_span_a_displaced <= 21.6443 )
								if( chinkou_span <= 20.6054 )
									ret := -0.952381 // sell
								if( chinkou_span > 20.6054 )
									ret := -1.000000 // sell
							if( senkou_span_a_displaced > 21.6443 )
								ret := 0.583333
						if( chinkou_span > 20.7553 )
							if( senkou_span_b_displaced <= 21.7906 )
								if( basis_max <= 0.183039 )
									ret := 0.473684
								if( basis_max > 0.183039 )
									ret := 0.909091 // buy
							if( senkou_span_b_displaced > 21.7906 )
								ret := -0.066667
			if( basis_minus > -0.468302 )
				if( chinkou_span <= 20.9011 )
					if( senkou_span_a <= 21.1974 )
						if( senkou_span_b <= 20.4722 )
							if( senkou_span_a <= 19.4142 )
								if( senkou_span_b_displaced <= 15.8699 )
									ret := 0.857143 // buy
								if( senkou_span_b_displaced > 15.8699 )
									ret := -0.838710 // sell
							if( senkou_span_a > 19.4142 )
								if( senkou_span_a <= 19.7697 )
									ret := 0.844444 // buy
								if( senkou_span_a > 19.7697 )
									ret := 0.440678
						if( senkou_span_b > 20.4722 )
							if( chinkou_span <= 19.3051 )
								ret := -1.000000 // sell
							if( chinkou_span > 19.3051 )
								if( senkou_span_b <= 21.1575 )
									ret := -0.144578
								if( senkou_span_b > 21.1575 )
									ret := 0.608696
					if( senkou_span_a > 21.1974 )
						if( kinjun_sen <= 21.3295 )
							ret := -1.000000 // sell
						if( kinjun_sen > 21.3295 )
							ret := -0.777778 // sell
				if( chinkou_span > 20.9011 )
					if( senkou_span_a_displaced <= 18.0694 )
						if( chinkou_span <= 22.9721 )
							ret := -1.000000 // sell
						if( chinkou_span > 22.9721 )
							ret := -0.125000
					if( senkou_span_a_displaced > 18.0694 )
						if( senkou_span_a <= 22.1625 )
							if( basis_max <= 0.28875 )
								if( tenkan_sen <= 21.2322 )
									ret := 0.719870 // buy
								if( tenkan_sen > 21.2322 )
									ret := 0.385204
							if( basis_max > 0.28875 )
								ret := 1.000000 // buy
						if( senkou_span_a > 22.1625 )
							if( tenkan_sen <= 22.9287 )
								ret := -0.190476
							if( tenkan_sen > 22.9287 )
								ret := -1.000000 // sell
		if( senkou_span_b > 21.5774 )
			if( basis_max <= -0.001971 )
				if( basis_minus <= 2.03547 )
					if( senkou_span_b <= 27.6129 )
						if( basis_minus <= -0.354275 )
							if( basis_max <= -0.081863 )
								if( senkou_span_b <= 25.0375 )
									ret := -0.888889 // sell
								if( senkou_span_b > 25.0375 )
									ret := 0.375000
							if( basis_max > -0.081863 )
								if( senkou_span_b_displaced <= 26.5768 )
									ret := -0.615385
								if( senkou_span_b_displaced > 26.5768 )
									ret := 0.062500
						if( basis_minus > -0.354275 )
							if( chinkou_span <= 26.8652 )
								if( senkou_span_b <= 26.5467 )
									ret := 0.045173
								if( senkou_span_b > 26.5467 )
									ret := -0.665829
							if( chinkou_span > 26.8652 )
								if( tenkan_sen <= 27.544 )
									ret := 0.424128
								if( tenkan_sen > 27.544 )
									ret := 0.152505
					if( senkou_span_b > 27.6129 )
						if( senkou_span_a_displaced <= 28.125 )
							if( basis_minus <= 0.51 )
								if( basis_max <= -0.033943 )
									ret := -0.494065
								if( basis_max > -0.033943 )
									ret := -0.029787
							if( basis_minus > 0.51 )
								if( senkou_span_a <= 28.4605 )
									ret := 0.904762 // buy
								if( senkou_span_a > 28.4605 )
									ret := -0.225166
						if( senkou_span_a_displaced > 28.125 )
							if( tenkan_sen <= 28.965 )
								if( senkou_span_b_displaced <= 28.9838 )
									ret := 0.090909
								if( senkou_span_b_displaced > 28.9838 )
									ret := 0.636842
							if( tenkan_sen > 28.965 )
								if( kinjun_sen <= 28.9927 )
									ret := -0.378897
								if( kinjun_sen > 28.9927 )
									ret := -0.027531
				if( basis_minus > 2.03547 )
					if( basis_minus <= 2.60125 )
						if( kinjun_sen <= 34.1413 )
							ret := 0.142857
						if( kinjun_sen > 34.1413 )
							if( basis_max <= -0.448362 )
								if( tenkan_sen <= 77.0585 )
									ret := 0.684211
								if( tenkan_sen > 77.0585 )
									ret := 1.000000 // buy
							if( basis_max > -0.448362 )
								if( basis_max <= -0.23625 )
									ret := -0.190476
								if( basis_max > -0.23625 )
									ret := 0.759036 // buy
					if( basis_minus > 2.60125 )
						if( senkou_span_b <= 57.1872 )
							ret := -0.454545
						if( senkou_span_b > 57.1872 )
							ret := 0.227273
			if( basis_max > -0.001971 )
				if( tenkan_sen <= 20.635 )
					if( senkou_span_a <= 20.6221 )
						ret := 1.000000 // buy
					if( senkou_span_a > 20.6221 )
						if( senkou_span_b_displaced <= 22.845 )
							ret := 0.666667
						if( senkou_span_b_displaced > 22.845 )
							ret := 1.000000 // buy
				if( tenkan_sen > 20.635 )
					if( chinkou_span <= 26.99 )
						if( kinjun_sen <= 27.2558 )
							if( chinkou_span <= 22.4302 )
								if( kinjun_sen <= 21.7868 )
									ret := 0.022581
								if( kinjun_sen > 21.7868 )
									ret := -0.374074
							if( chinkou_span > 22.4302 )
								if( senkou_span_a <= 22.8286 )
									ret := 0.500000
								if( senkou_span_a > 22.8286 )
									ret := -0.067249
						if( kinjun_sen > 27.2558 )
							if( basis_max <= 0.397217 )
								if( senkou_span_a_displaced <= 27.5748 )
									ret := -0.266667
								if( senkou_span_a_displaced > 27.5748 )
									ret := -0.716381 // sell
							if( basis_max > 0.397217 )
								if( senkou_span_b_displaced <= 27.2275 )
									ret := -0.250000
								if( senkou_span_b_displaced > 27.2275 )
									ret := 1.000000 // buy
					if( chinkou_span > 26.99 )
						if( senkou_span_a_displaced <= 27.7748 )
							if( basis_minus <= -0.225031 )
								if( senkou_span_b <= 27.654 )
									ret := 0.738462 // buy
								if( senkou_span_b > 27.654 )
									ret := 0.052632
							if( basis_minus > -0.225031 )
								if( basis_max <= 0.207262 )
									ret := 0.407989
								if( basis_max > 0.207262 )
									ret := -0.730769 // sell
						if( senkou_span_a_displaced > 27.7748 )
							if( chinkou_span <= 28.9217 )
								if( senkou_span_a <= 28.3306 )
									ret := 0.179671
								if( senkou_span_a > 28.3306 )
									ret := -0.378134
							if( chinkou_span > 28.9217 )
								if( tenkan_sen <= 28.787 )
									ret := 0.658065
								if( tenkan_sen > 28.787 )
									ret := 0.030876
	if( senkou_span_a_displaced > 79.3463 )
		if( chinkou_span <= 79.4014 )
			if( tenkan_sen <= 79.9825 )
				if( tenkan_sen <= 78.9186 )
					if( senkou_span_a_displaced <= 79.9488 )
						if( tenkan_sen <= 78.7797 )
							if( senkou_span_a <= 78.6481 )
								if( basis_max <= 0.065338 )
									ret := -0.954545 // sell
								if( basis_max > 0.065338 )
									ret := -0.631579
							if( senkou_span_a > 78.6481 )
								ret := 0.000000
						if( tenkan_sen > 78.7797 )
							if( kinjun_sen <= 79.3356 )
								ret := -1.000000 // sell
							if( kinjun_sen > 79.3356 )
								ret := -0.900000 // sell
					if( senkou_span_a_displaced > 79.9488 )
						ret := 0.000000
				if( tenkan_sen > 78.9186 )
					if( senkou_span_a_displaced <= 81.192 )
						if( senkou_span_b <= 80.2146 )
							if( kinjun_sen <= 79.9181 )
								if( tenkan_sen <= 79.3037 )
									ret := 0.000000
								if( tenkan_sen > 79.3037 )
									ret := -0.333333
							if( kinjun_sen > 79.9181 )
								if( senkou_span_b_displaced <= 79.62 )
									ret := 1.000000 // buy
								if( senkou_span_b_displaced > 79.62 )
									ret := 0.600000
						if( senkou_span_b > 80.2146 )
							if( tenkan_sen <= 79.8893 )
								ret := -0.400000
							if( tenkan_sen > 79.8893 )
								ret := -0.818182 // sell
					if( senkou_span_a_displaced > 81.192 )
						if( tenkan_sen <= 79.4976 )
							ret := -0.615385
						if( tenkan_sen > 79.4976 )
							ret := -1.000000 // sell
			if( tenkan_sen > 79.9825 )
				if( senkou_span_a_displaced <= 81.305 )
					if( basis_minus <= -0.320837 )
						ret := -0.733333 // sell
					if( basis_minus > -0.320837 )
						if( chinkou_span <= 79.1613 )
							if( senkou_span_a_displaced <= 79.5385 )
								if( basis_minus <= 0.255674 )
									ret := -1.000000 // sell
								if( basis_minus > 0.255674 )
									ret := -0.866667 // sell
							if( senkou_span_a_displaced > 79.5385 )
								ret := -1.000000 // sell
						if( chinkou_span > 79.1613 )
							if( senkou_span_a_displaced <= 80.4866 )
								ret := -0.500000
							if( senkou_span_a_displaced > 80.4866 )
								ret := -1.000000 // sell
				if( senkou_span_a_displaced > 81.305 )
					ret := 0.555556
		if( chinkou_span > 79.4014 )
			if( chinkou_span <= 85.8086 )
				if( senkou_span_a <= 79.8562 )
					if( senkou_span_a_displaced <= 80.185 )
						ret := 0.062500
					if( senkou_span_a_displaced > 80.185 )
						if( senkou_span_b_displaced <= 80.6177 )
							ret := 0.909091 // buy
						if( senkou_span_b_displaced > 80.6177 )
							ret := 0.714286 // buy
				if( senkou_span_a > 79.8562 )
					if( basis_minus <= 0.555036 )
						if( senkou_span_b_displaced <= 80.1 )
							if( senkou_span_a_displaced <= 79.9949 )
								if( senkou_span_a <= 80.385 )
									ret := 0.125000
								if( senkou_span_a > 80.385 )
									ret := -0.450000
							if( senkou_span_a_displaced > 79.9949 )
								if( senkou_span_b <= 80.1889 )
									ret := -0.880952 // sell
								if( senkou_span_b > 80.1889 )
									ret := -0.166667
						if( senkou_span_b_displaced > 80.1 )
							if( kinjun_sen <= 85.7825 )
								if( chinkou_span <= 84.975 )
									ret := -0.046154
								if( chinkou_span > 84.975 )
									ret := 0.100000
							if( kinjun_sen > 85.7825 )
								ret := -0.800000 // sell
					if( basis_minus > 0.555036 )
						if( basis_minus <= 1.16029 )
							if( basis_minus <= 0.83506 )
								ret := 0.058824
							if( basis_minus > 0.83506 )
								ret := 1.000000 // buy
						if( basis_minus > 1.16029 )
							if( tenkan_sen <= 85.4378 )
								ret := -0.333333
							if( tenkan_sen > 85.4378 )
								ret := 0.000000
			if( chinkou_span > 85.8086 )
				if( senkou_span_b_displaced <= 79.7516 )
					ret := 0.600000
				if( senkou_span_b_displaced > 79.7516 )
					ret := 1.000000 // buy
	
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
float op_operation = decision_tree_0_UBER_15Min_89871d33(senkou_span_a_displaced, cross_dn_tenkan_kinjunInt, kinjun_sen, chinkou_span, senkou_span_b_displaced, basis_minus, senkou_span_b, senkou_span_a, cross_up_tenkan_kinjunInt, tenkan_sen, basis_max)

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


