//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: LINKUSDT_30Min_1ICH_52440263 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LINKUSDT_30Min_1ICH_52440263", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LINKUSDT_30Min_52440263(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( senkou_span_a <= 7.08 )
		if( kinjun_sen <= 5.07925 )
			ret := 1.000000 // buy
		if( kinjun_sen > 5.07925 )
			if( basis_max <= 0.018543 )
				if( senkou_span_b_displaced <= 6.83225 )
					if( basis_minus <= 0.182884 )
						if( tenkan_sen <= 6.14927 )
							if( senkou_span_b_displaced <= 6.167 )
								if( chinkou_span <= 6.4135 )
									ret := 0.044410
								if( chinkou_span > 6.4135 )
									ret := 0.835616 // buy
							if( senkou_span_b_displaced > 6.167 )
								if( basis_max <= -0.036872 )
									ret := -0.900000 // sell
								if( basis_max > -0.036872 )
									ret := 0.406940
						if( tenkan_sen > 6.14927 )
							if( senkou_span_b <= 6.15647 )
								if( senkou_span_a <= 6.0837 )
									ret := 0.904762 // buy
								if( senkou_span_a > 6.0837 )
									ret := -0.333333
							if( senkou_span_b > 6.15647 )
								if( senkou_span_b_displaced <= 6.30606 )
									ret := 0.162989
								if( senkou_span_b_displaced > 6.30606 )
									ret := -0.016904
					if( basis_minus > 0.182884 )
						if( senkou_span_b_displaced <= 5.88779 )
							if( basis_max <= -0.0553 )
								if( kinjun_sen <= 6.3275 )
									ret := 0.518519
								if( kinjun_sen > 6.3275 )
									ret := -0.785714 // sell
							if( basis_max > -0.0553 )
								ret := 0.565217
						if( senkou_span_b_displaced > 5.88779 )
							if( senkou_span_b <= 6.77575 )
								if( basis_max <= -0.010125 )
									ret := -0.569106
								if( basis_max > -0.010125 )
									ret := 0.205128
							if( senkou_span_b > 6.77575 )
								if( basis_minus <= 0.2015 )
									ret := -0.250000
								if( basis_minus > 0.2015 )
									ret := 0.551724
				if( senkou_span_b_displaced > 6.83225 )
					if( basis_minus <= 0.126557 )
						if( senkou_span_a_displaced <= 6.84392 )
							if( senkou_span_b_displaced <= 7.14584 )
								if( kinjun_sen <= 6.84244 )
									ret := 0.222672
								if( kinjun_sen > 6.84244 )
									ret := 0.572993
							if( senkou_span_b_displaced > 7.14584 )
								if( basis_minus <= -0.276345 )
									ret := 0.714286 // buy
								if( basis_minus > -0.276345 )
									ret := -0.776316 // sell
						if( senkou_span_a_displaced > 6.84392 )
							if( senkou_span_a <= 6.91862 )
								if( basis_max <= -0.00575 )
									ret := -0.017937
								if( basis_max > -0.00575 )
									ret := 0.253752
							if( senkou_span_a > 6.91862 )
								if( basis_minus <= -0.046823 )
									ret := -0.213942
								if( basis_minus > -0.046823 )
									ret := 0.091071
					if( basis_minus > 0.126557 )
						if( basis_max <= -0.034375 )
							if( kinjun_sen <= 6.8375 )
								if( chinkou_span <= 7.18464 )
									ret := 0.916667 // buy
								if( chinkou_span > 7.18464 )
									ret := 1.000000 // buy
							if( kinjun_sen > 6.8375 )
								if( senkou_span_a <= 7.0352 )
									ret := -0.300000
								if( senkou_span_a > 7.0352 )
									ret := 0.866667 // buy
						if( basis_max > -0.034375 )
							if( senkou_span_b <= 6.91705 )
								if( basis_minus <= 0.169495 )
									ret := 0.888889 // buy
								if( basis_minus > 0.169495 )
									ret := 0.615385
							if( senkou_span_b > 6.91705 )
								ret := 0.117647
			if( basis_max > 0.018543 )
				if( chinkou_span <= 7.07334 )
					if( basis_minus <= 0.052351 )
						if( kinjun_sen <= 6.78874 )
							if( basis_minus <= -0.323621 )
								if( chinkou_span <= 6.59711 )
									ret := 0.797203 // buy
								if( chinkou_span > 6.59711 )
									ret := 0.366667
							if( basis_minus > -0.323621 )
								if( basis_minus <= -0.117457 )
									ret := 0.009363
								if( basis_minus > -0.117457 )
									ret := 0.163838
						if( kinjun_sen > 6.78874 )
							if( tenkan_sen <= 6.66897 )
								if( tenkan_sen <= 6.62725 )
									ret := -0.179487
								if( tenkan_sen > 6.62725 )
									ret := -0.866667 // sell
							if( tenkan_sen > 6.66897 )
								if( senkou_span_b_displaced <= 7.01511 )
									ret := -0.140909
								if( senkou_span_b_displaced > 7.01511 )
									ret := 0.065767
					if( basis_minus > 0.052351 )
						if( basis_max <= 0.0925 )
							if( senkou_span_a_displaced <= 6.07888 )
								if( senkou_span_b_displaced <= 5.95177 )
									ret := 0.476190
								if( senkou_span_b_displaced > 5.95177 )
									ret := 0.918033 // buy
							if( senkou_span_a_displaced > 6.07888 )
								if( kinjun_sen <= 6.55375 )
									ret := -0.111111
								if( kinjun_sen > 6.55375 )
									ret := 0.718182 // buy
						if( basis_max > 0.0925 )
							ret := -0.866667 // sell
				if( chinkou_span > 7.07334 )
					if( senkou_span_b <= 7.2383 )
						if( senkou_span_b <= 6.8565 )
							if( tenkan_sen <= 6.72149 )
								if( tenkan_sen <= 6.5115 )
									ret := 0.928571 // buy
								if( tenkan_sen > 6.5115 )
									ret := 0.500000
							if( tenkan_sen > 6.72149 )
								ret := 1.000000 // buy
						if( senkou_span_b > 6.8565 )
							if( kinjun_sen <= 6.94151 )
								if( basis_minus <= -0.0565 )
									ret := 0.410714
								if( basis_minus > -0.0565 )
									ret := 0.090909
							if( kinjun_sen > 6.94151 )
								if( senkou_span_b <= 7.10839 )
									ret := 0.500000
								if( senkou_span_b > 7.10839 )
									ret := 0.943662 // buy
					if( senkou_span_b > 7.2383 )
						ret := -1.000000 // sell
	if( senkou_span_a > 7.08 )
		if( senkou_span_a <= 48.2182 )
			if( chinkou_span <= 7.30591 )
				if( tenkan_sen <= 7.29031 )
					if( senkou_span_b_displaced <= 7.7764 )
						if( senkou_span_a_displaced <= 7.45137 )
							if( chinkou_span <= 6.99892 )
								if( basis_max <= 0.035405 )
									ret := -0.511568
								if( basis_max > 0.035405 )
									ret := -0.028169
							if( chinkou_span > 6.99892 )
								if( senkou_span_b <= 7.42148 )
									ret := -0.040437
								if( senkou_span_b > 7.42148 )
									ret := -0.758621 // sell
						if( senkou_span_a_displaced > 7.45137 )
							if( senkou_span_a_displaced <= 7.46365 )
								if( basis_max <= 0.009106 )
									ret := 1.000000 // buy
								if( basis_max > 0.009106 )
									ret := 0.764706 // buy
							if( senkou_span_a_displaced > 7.46365 )
								if( senkou_span_b_displaced <= 7.64016 )
									ret := -0.156522
								if( senkou_span_b_displaced > 7.64016 )
									ret := 0.588235
					if( senkou_span_b_displaced > 7.7764 )
						if( basis_minus <= -0.39161 )
							if( senkou_span_a <= 7.19782 )
								if( basis_minus <= -0.507166 )
									ret := -1.000000 // sell
								if( basis_minus > -0.507166 )
									ret := -0.375000
							if( senkou_span_a > 7.19782 )
								ret := -1.000000 // sell
						if( basis_minus > -0.39161 )
							if( senkou_span_b <= 7.5305 )
								if( chinkou_span <= 7.27748 )
									ret := -0.684211
								if( chinkou_span > 7.27748 )
									ret := -1.000000 // sell
							if( senkou_span_b > 7.5305 )
								if( senkou_span_a_displaced <= 8.25833 )
									ret := -0.243902
								if( senkou_span_a_displaced > 8.25833 )
									ret := 0.818182 // buy
				if( tenkan_sen > 7.29031 )
					if( tenkan_sen <= 8.34369 )
						if( senkou_span_a_displaced <= 7.03883 )
							if( kinjun_sen <= 6.96128 )
								ret := 1.000000 // buy
							if( kinjun_sen > 6.96128 )
								if( kinjun_sen <= 7.18683 )
									ret := -0.615385
								if( kinjun_sen > 7.18683 )
									ret := 0.404762
						if( senkou_span_a_displaced > 7.03883 )
							if( senkou_span_a <= 7.85373 )
								if( kinjun_sen <= 7.57643 )
									ret := -0.444030
								if( kinjun_sen > 7.57643 )
									ret := -0.736364 // sell
							if( senkou_span_a > 7.85373 )
								if( chinkou_span <= 6.84703 )
									ret := 0.864865 // buy
								if( chinkou_span > 6.84703 )
									ret := -0.571429
					if( tenkan_sen > 8.34369 )
						if( senkou_span_b <= 8.71725 )
							if( basis_minus <= -0.000378 )
								if( senkou_span_a <= 8.37122 )
									ret := 0.909091 // buy
								if( senkou_span_a > 8.37122 )
									ret := 1.000000 // buy
							if( basis_minus > -0.000378 )
								ret := 0.866667 // buy
						if( senkou_span_b > 8.71725 )
							ret := -1.000000 // sell
			if( chinkou_span > 7.30591 )
				if( tenkan_sen <= 7.59006 )
					if( senkou_span_a_displaced <= 7.20763 )
						if( basis_max <= 0.001213 )
							if( kinjun_sen <= 7.18275 )
								if( senkou_span_a_displaced <= 6.82273 )
									ret := 0.756098 // buy
								if( senkou_span_a_displaced > 6.82273 )
									ret := 0.013514
							if( kinjun_sen > 7.18275 )
								if( basis_max <= -0.06629 )
									ret := 0.774194 // buy
								if( basis_max > -0.06629 )
									ret := 0.458824
						if( basis_max > 0.001213 )
							if( senkou_span_b_displaced <= 7.1535 )
								if( basis_minus <= 0.026176 )
									ret := 0.675000
								if( basis_minus > 0.026176 )
									ret := 0.939024 // buy
							if( senkou_span_b_displaced > 7.1535 )
								if( senkou_span_a <= 7.2365 )
									ret := 0.111111
								if( senkou_span_a > 7.2365 )
									ret := 0.000000
					if( senkou_span_a_displaced > 7.20763 )
						if( basis_max <= 0.088589 )
							if( senkou_span_a <= 7.24078 )
								if( senkou_span_a <= 7.20212 )
									ret := 0.266667
								if( senkou_span_a > 7.20212 )
									ret := 0.685484
							if( senkou_span_a > 7.24078 )
								if( senkou_span_a <= 7.28062 )
									ret := -0.128000
								if( senkou_span_a > 7.28062 )
									ret := 0.181110
						if( basis_max > 0.088589 )
							if( basis_minus <= -0.105 )
								if( senkou_span_a <= 7.311 )
									ret := 0.967742 // buy
								if( senkou_span_a > 7.311 )
									ret := -0.166667
							if( basis_minus > -0.105 )
								if( basis_max <= 0.098703 )
									ret := 0.800000 // buy
								if( basis_max > 0.098703 )
									ret := 0.958333 // buy
				if( tenkan_sen > 7.59006 )
					if( kinjun_sen <= 32.2691 )
						if( chinkou_span <= 30.0812 )
							if( tenkan_sen <= 27.2082 )
								if( chinkou_span <= 25.4586 )
									ret := -0.019544
								if( chinkou_span > 25.4586 )
									ret := 0.247270
							if( tenkan_sen > 27.2082 )
								if( chinkou_span <= 26.9488 )
									ret := -0.549261
								if( chinkou_span > 26.9488 )
									ret := -0.120366
						if( chinkou_span > 30.0812 )
							if( kinjun_sen <= 28.9092 )
								if( senkou_span_a_displaced <= 36.2054 )
									ret := 0.710117 // buy
								if( senkou_span_a_displaced > 36.2054 )
									ret := -1.000000 // sell
							if( kinjun_sen > 28.9092 )
								if( chinkou_span <= 32.2181 )
									ret := 0.145556
								if( chinkou_span > 32.2181 )
									ret := 0.516959
					if( kinjun_sen > 32.2691 )
						if( senkou_span_b <= 34.1088 )
							if( chinkou_span <= 33.9095 )
								if( senkou_span_a <= 33.8084 )
									ret := -0.360236
								if( senkou_span_a > 33.8084 )
									ret := -0.787565 // sell
							if( chinkou_span > 33.9095 )
								if( chinkou_span <= 36.2595 )
									ret := 0.247500
								if( chinkou_span > 36.2595 )
									ret := 0.900000 // buy
						if( senkou_span_b > 34.1088 )
							if( senkou_span_b <= 34.2874 )
								if( tenkan_sen <= 34.3172 )
									ret := 0.972973 // buy
								if( tenkan_sen > 34.3172 )
									ret := 0.416667
							if( senkou_span_b > 34.2874 )
								if( chinkou_span <= 39.7055 )
									ret := -0.193907
								if( chinkou_span > 39.7055 )
									ret := 0.178954
		if( senkou_span_a > 48.2182 )
			if( basis_minus <= 2.25969 )
				if( chinkou_span <= 47.395 )
					if( senkou_span_b_displaced <= 45.7445 )
						ret := -0.615385
					if( senkou_span_b_displaced > 45.7445 )
						if( kinjun_sen <= 50.747 )
							if( basis_max <= -0.0605 )
								ret := -0.909091 // sell
							if( basis_max > -0.0605 )
								ret := -1.000000 // sell
						if( kinjun_sen > 50.747 )
							if( chinkou_span <= 46.0066 )
								ret := -0.800000 // sell
							if( chinkou_span > 46.0066 )
								ret := -0.916667 // sell
				if( chinkou_span > 47.395 )
					if( senkou_span_a <= 48.3524 )
						ret := -0.857143 // sell
					if( senkou_span_a > 48.3524 )
						if( basis_max <= -0.07398 )
							if( chinkou_span <= 48.2226 )
								if( senkou_span_b <= 48.6578 )
									ret := -0.909091 // sell
								if( senkou_span_b > 48.6578 )
									ret := -1.000000 // sell
							if( chinkou_span > 48.2226 )
								if( senkou_span_b_displaced <= 47.7232 )
									ret := 0.105263
								if( senkou_span_b_displaced > 47.7232 )
									ret := -0.458333
						if( basis_max > -0.07398 )
							if( senkou_span_b <= 49.1808 )
								if( tenkan_sen <= 49.1378 )
									ret := -0.285714
								if( tenkan_sen > 49.1378 )
									ret := 0.250000
							if( senkou_span_b > 49.1808 )
								ret := 0.416667
			if( basis_minus > 2.25969 )
				ret := -0.956522 // sell
	
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
float op_operation = decision_tree_0_LINKUSDT_30Min_52440263(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)

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


