//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: RUN_15Min_1ICH_34eda305 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_RUN_15Min_1ICH_34eda305", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_RUN_15Min_34eda305(tenkan_sen, basis_minus, cross_up_tenkan_kinjunInt, senkou_span_a, cross_dn_tenkan_kinjunInt, senkou_span_b, chinkou_span, senkou_span_a_displaced, senkou_span_b_displaced, kinjun_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( tenkan_sen <= 4.93653 )
		if( chinkou_span <= 4.94196 )
			if( basis_max <= 0.012393 )
				if( senkou_span_b <= 4.90927 )
					if( senkou_span_b <= 4.89 )
						if( kinjun_sen <= 4.72086 )
							ret := 0.818182 // buy
						if( kinjun_sen > 4.72086 )
							if( senkou_span_a <= 4.85793 )
								ret := 0.000000
							if( senkou_span_a > 4.85793 )
								if( chinkou_span <= 4.8964 )
									ret := 0.428571
								if( chinkou_span > 4.8964 )
									ret := 0.086957
					if( senkou_span_b > 4.89 )
						if( senkou_span_b <= 4.90094 )
							ret := 0.812500 // buy
						if( senkou_span_b > 4.90094 )
							ret := 0.923077 // buy
				if( senkou_span_b > 4.90927 )
					if( chinkou_span <= 4.81364 )
						if( tenkan_sen <= 4.89291 )
							ret := -0.428571
						if( tenkan_sen > 4.89291 )
							if( senkou_span_b_displaced <= 4.97767 )
								ret := -0.777778 // sell
							if( senkou_span_b_displaced > 4.97767 )
								ret := -1.000000 // sell
					if( chinkou_span > 4.81364 )
						if( senkou_span_a_displaced <= 4.97372 )
							if( senkou_span_b <= 4.92486 )
								ret := -0.043478
							if( senkou_span_b > 4.92486 )
								if( senkou_span_b <= 4.93664 )
									ret := -0.793103 // sell
								if( senkou_span_b > 4.93664 )
									ret := -0.315789
						if( senkou_span_a_displaced > 4.97372 )
							if( senkou_span_b <= 5.00502 )
								if( senkou_span_b <= 4.9525 )
									ret := 0.800000 // buy
								if( senkou_span_b > 4.9525 )
									ret := 0.000000
							if( senkou_span_b > 5.00502 )
								ret := 1.000000 // buy
			if( basis_max > 0.012393 )
				if( tenkan_sen <= 4.9025 )
					if( senkou_span_a <= 4.90519 )
						if( senkou_span_b_displaced <= 4.9325 )
							ret := 0.000000
						if( senkou_span_b_displaced > 4.9325 )
							if( senkou_span_a <= 4.89738 )
								if( tenkan_sen <= 4.6687 )
									ret := 0.958333 // buy
								if( tenkan_sen > 4.6687 )
									ret := 0.728395 // buy
							if( senkou_span_a > 4.89738 )
								if( senkou_span_a_displaced <= 4.97029 )
									ret := 0.000000
								if( senkou_span_a_displaced > 4.97029 )
									ret := 0.500000
					if( senkou_span_a > 4.90519 )
						if( senkou_span_a <= 4.91684 )
							ret := 1.000000 // buy
						if( senkou_span_a > 4.91684 )
							ret := 0.882353 // buy
				if( tenkan_sen > 4.9025 )
					if( senkou_span_a_displaced <= 4.96683 )
						ret := 0.076923
					if( senkou_span_a_displaced > 4.96683 )
						ret := -0.250000
		if( chinkou_span > 4.94196 )
			if( basis_max <= -0.004548 )
				if( kinjun_sen <= 4.875 )
					ret := 0.705882 // buy
				if( kinjun_sen > 4.875 )
					if( basis_minus <= 0.01625 )
						ret := -0.111111
					if( basis_minus > 0.01625 )
						ret := 0.000000
			if( basis_max > -0.004548 )
				if( chinkou_span <= 5.14256 )
					if( senkou_span_a_displaced <= 4.95138 )
						if( tenkan_sen <= 4.84125 )
							if( basis_max <= 0.010948 )
								ret := 1.000000 // buy
							if( basis_max > 0.010948 )
								if( chinkou_span <= 4.96946 )
									ret := 0.846154 // buy
								if( chinkou_span > 4.96946 )
									ret := 0.133333
						if( tenkan_sen > 4.84125 )
							if( senkou_span_a_displaced <= 4.88492 )
								if( chinkou_span <= 5.08625 )
									ret := 0.863636 // buy
								if( chinkou_span > 5.08625 )
									ret := 0.363636
							if( senkou_span_a_displaced > 4.88492 )
								if( chinkou_span <= 5.06075 )
									ret := 0.058824
								if( chinkou_span > 5.06075 )
									ret := 0.428571
					if( senkou_span_a_displaced > 4.95138 )
						if( chinkou_span <= 4.96301 )
							ret := 0.437500
						if( chinkou_span > 4.96301 )
							if( tenkan_sen <= 4.90163 )
								if( basis_max <= 0.01235 )
									ret := 1.000000 // buy
								if( basis_max > 0.01235 )
									ret := 0.888889 // buy
							if( tenkan_sen > 4.90163 )
								ret := 0.769231 // buy
				if( chinkou_span > 5.14256 )
					if( basis_max <= 0.025 )
						ret := 1.000000 // buy
					if( basis_max > 0.025 )
						ret := 0.384615
	if( tenkan_sen > 4.93653 )
		if( senkou_span_b <= 11.63 )
			if( kinjun_sen <= 11.5802 )
				if( basis_max <= 0.310138 )
					if( kinjun_sen <= 11.5799 )
						if( basis_max <= -0.031331 )
							if( chinkou_span <= 11.0324 )
								if( kinjun_sen <= 10.556 )
									ret := -0.057851
								if( kinjun_sen > 10.556 )
									ret := -0.488372
							if( chinkou_span > 11.0324 )
								if( senkou_span_b_displaced <= 11.0495 )
									ret := 0.344538
								if( senkou_span_b_displaced > 11.0495 )
									ret := 0.042017
						if( basis_max > -0.031331 )
							if( senkou_span_b_displaced <= 11.3211 )
								if( chinkou_span <= 10.8308 )
									ret := 0.040736
								if( chinkou_span > 10.8308 )
									ret := 0.440748
							if( senkou_span_b_displaced > 11.3211 )
								if( tenkan_sen <= 9.88853 )
									ret := 1.000000 // buy
								if( tenkan_sen > 9.88853 )
									ret := -0.173864
					if( kinjun_sen > 11.5799 )
						if( senkou_span_a <= 11.7572 )
							ret := -0.636364
						if( senkou_span_a > 11.7572 )
							ret := -1.000000 // sell
				if( basis_max > 0.310138 )
					if( senkou_span_a_displaced <= 11.3356 )
						if( senkou_span_a_displaced <= 11.1975 )
							if( basis_max <= 0.32375 )
								ret := 0.900000 // buy
							if( basis_max > 0.32375 )
								ret := 0.812500 // buy
						if( senkou_span_a_displaced > 11.1975 )
							ret := 1.000000 // buy
					if( senkou_span_a_displaced > 11.3356 )
						ret := 0.266667
			if( kinjun_sen > 11.5802 )
				if( senkou_span_a <= 11.8525 )
					if( senkou_span_a_displaced <= 11.1361 )
						if( basis_minus <= 0.23836 )
							ret := 0.583333
						if( basis_minus > 0.23836 )
							ret := -0.333333
					if( senkou_span_a_displaced > 11.1361 )
						if( senkou_span_a_displaced <= 11.7103 )
							if( senkou_span_b <= 11.5289 )
								if( senkou_span_b_displaced <= 11.0687 )
									ret := 0.979167 // buy
								if( senkou_span_b_displaced > 11.0687 )
									ret := 0.676056
							if( senkou_span_b > 11.5289 )
								if( senkou_span_b_displaced <= 11.5687 )
									ret := 0.202247
								if( senkou_span_b_displaced > 11.5687 )
									ret := 0.621622
						if( senkou_span_a_displaced > 11.7103 )
							if( senkou_span_a_displaced <= 11.861 )
								if( basis_max <= 0.036237 )
									ret := 1.000000 // buy
								if( basis_max > 0.036237 )
									ret := 0.923077 // buy
							if( senkou_span_a_displaced > 11.861 )
								ret := 0.416667
				if( senkou_span_a > 11.8525 )
					if( senkou_span_b <= 11.5533 )
						if( senkou_span_b <= 11.4203 )
							ret := 0.277778
						if( senkou_span_b > 11.4203 )
							if( senkou_span_a <= 11.9309 )
								if( kinjun_sen <= 11.7827 )
									ret := 0.900000 // buy
								if( kinjun_sen > 11.7827 )
									ret := 0.666667
							if( senkou_span_a > 11.9309 )
								ret := 1.000000 // buy
					if( senkou_span_b > 11.5533 )
						if( senkou_span_a <= 12.1435 )
							if( chinkou_span <= 11.8334 )
								if( senkou_span_b_displaced <= 11.0029 )
									ret := -1.000000 // sell
								if( senkou_span_b_displaced > 11.0029 )
									ret := -0.740741 // sell
							if( chinkou_span > 11.8334 )
								if( chinkou_span <= 12.63 )
									ret := 0.166667
								if( chinkou_span > 12.63 )
									ret := -0.583333
						if( senkou_span_a > 12.1435 )
							ret := 1.000000 // buy
		if( senkou_span_b > 11.63 )
			if( chinkou_span <= 11.8545 )
				if( basis_minus <= -0.17361 )
					if( kinjun_sen <= 12.0552 )
						if( basis_minus <= -1.21358 )
							ret := 1.000000 // buy
						if( basis_minus > -1.21358 )
							if( basis_max <= 0.392135 )
								if( tenkan_sen <= 11.3212 )
									ret := -0.671875
								if( tenkan_sen > 11.3212 )
									ret := -0.115942
							if( basis_max > 0.392135 )
								if( tenkan_sen <= 10.7568 )
									ret := 1.000000 // buy
								if( tenkan_sen > 10.7568 )
									ret := 0.722222 // buy
					if( kinjun_sen > 12.0552 )
						if( chinkou_span <= 11.4562 )
							if( basis_max <= 0.14494 )
								if( tenkan_sen <= 12.0872 )
									ret := -0.111111
								if( tenkan_sen > 12.0872 )
									ret := -0.794872 // sell
							if( basis_max > 0.14494 )
								ret := -1.000000 // sell
						if( chinkou_span > 11.4562 )
							if( senkou_span_b_displaced <= 13.065 )
								if( tenkan_sen <= 12.43 )
									ret := -0.173913
								if( tenkan_sen > 12.43 )
									ret := 0.409091
							if( senkou_span_b_displaced > 13.065 )
								if( senkou_span_b <= 12.6611 )
									ret := -0.666667
								if( senkou_span_b > 12.6611 )
									ret := -0.906977 // sell
				if( basis_minus > -0.17361 )
					if( senkou_span_a <= 11.6559 )
						if( basis_max <= -0.007333 )
							ret := -0.769231 // sell
						if( basis_max > -0.007333 )
							if( tenkan_sen <= 11.4913 )
								if( kinjun_sen <= 11.68 )
									ret := 0.214286
								if( kinjun_sen > 11.68 )
									ret := 0.545455
							if( tenkan_sen > 11.4913 )
								if( basis_max <= 0.000102 )
									ret := 0.666667
								if( basis_max > 0.000102 )
									ret := -0.375000
					if( senkou_span_a > 11.6559 )
						if( tenkan_sen <= 11.6229 )
							ret := 0.266667
						if( tenkan_sen > 11.6229 )
							if( senkou_span_b_displaced <= 12.7425 )
								if( senkou_span_b_displaced <= 12.6613 )
									ret := -0.614498
								if( senkou_span_b_displaced > 12.6613 )
									ret := 0.133333
							if( senkou_span_b_displaced > 12.7425 )
								if( tenkan_sen <= 12.5656 )
									ret := -0.820513 // sell
								if( tenkan_sen > 12.5656 )
									ret := -0.950000 // sell
			if( chinkou_span > 11.8545 )
				if( kinjun_sen <= 12.1423 )
					if( senkou_span_b_displaced <= 11.6601 )
						if( senkou_span_a <= 12.1429 )
							if( basis_max <= -0.019046 )
								if( chinkou_span <= 12.8 )
									ret := -0.493506
								if( chinkou_span > 12.8 )
									ret := 0.545455
							if( basis_max > -0.019046 )
								if( kinjun_sen <= 12.0411 )
									ret := 0.558442
								if( kinjun_sen > 12.0411 )
									ret := -0.053571
						if( senkou_span_a > 12.1429 )
							if( basis_max <= -0.023926 )
								ret := 0.538462
							if( basis_max > -0.023926 )
								ret := 1.000000 // buy
					if( senkou_span_b_displaced > 11.6601 )
						if( kinjun_sen <= 11.827 )
							if( kinjun_sen <= 11.7755 )
								if( basis_max <= -0.036675 )
									ret := 0.058824
								if( basis_max > -0.036675 )
									ret := 0.704545 // buy
							if( kinjun_sen > 11.7755 )
								if( tenkan_sen <= 11.9176 )
									ret := 0.946667 // buy
								if( tenkan_sen > 11.9176 )
									ret := 0.592593
						if( kinjun_sen > 11.827 )
							if( tenkan_sen <= 12.3834 )
								if( kinjun_sen <= 11.9499 )
									ret := 0.043956
								if( kinjun_sen > 11.9499 )
									ret := 0.392971
							if( tenkan_sen > 12.3834 )
								if( senkou_span_b_displaced <= 12.1202 )
									ret := 0.150000
								if( senkou_span_b_displaced > 12.1202 )
									ret := -0.941176 // sell
				if( kinjun_sen > 12.1423 )
					if( chinkou_span <= 12.4599 )
						if( tenkan_sen <= 12.0192 )
							if( senkou_span_b <= 12.2347 )
								ret := -0.055556
							if( senkou_span_b > 12.2347 )
								if( senkou_span_a <= 12.1981 )
									ret := 0.741573 // buy
								if( senkou_span_a > 12.1981 )
									ret := 0.000000
						if( tenkan_sen > 12.0192 )
							if( senkou_span_a <= 12.1796 )
								if( senkou_span_b_displaced <= 11.8989 )
									ret := 0.785714 // buy
								if( senkou_span_b_displaced > 11.8989 )
									ret := -0.051546
							if( senkou_span_a > 12.1796 )
								if( basis_max <= 0.076001 )
									ret := -0.467884
								if( basis_max > 0.076001 )
									ret := -0.103004
					if( chinkou_span > 12.4599 )
						if( senkou_span_b_displaced <= 13.7673 )
							if( chinkou_span <= 13.271 )
								if( tenkan_sen <= 12.5729 )
									ret := 0.516432
								if( tenkan_sen > 12.5729 )
									ret := -0.134568
							if( chinkou_span > 13.271 )
								if( tenkan_sen <= 13.1032 )
									ret := 0.657729
								if( tenkan_sen > 13.1032 )
									ret := 0.249805
						if( senkou_span_b_displaced > 13.7673 )
							if( basis_minus <= 2.78858 )
								if( senkou_span_b <= 13.3911 )
									ret := 0.587413
								if( senkou_span_b > 13.3911 )
									ret := -0.015188
							if( basis_minus > 2.78858 )
								if( senkou_span_b <= 84.4364 )
									ret := 0.704433 // buy
								if( senkou_span_b > 84.4364 )
									ret := -0.064516
	
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
float op_operation = decision_tree_0_RUN_15Min_34eda305(tenkan_sen, basis_minus, cross_up_tenkan_kinjunInt, senkou_span_a, cross_dn_tenkan_kinjunInt, senkou_span_b, chinkou_span, senkou_span_a_displaced, senkou_span_b_displaced, kinjun_sen, basis_max)

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


