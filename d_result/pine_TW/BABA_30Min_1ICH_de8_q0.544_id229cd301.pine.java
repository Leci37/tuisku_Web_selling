//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: BABA_30Min_1ICH_229cd301 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BABA_30Min_1ICH_229cd301", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BABA_30Min_229cd301(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( basis_max <= -0.139882 )
		if( tenkan_sen <= 311.43 )
			if( basis_minus <= 9.01169 )
				if( senkou_span_b <= 64.8223 )
					if( basis_max <= -0.648166 )
						ret := -0.538462
					if( basis_max > -0.648166 )
						if( senkou_span_a_displaced <= 60.8497 )
							if( kinjun_sen <= 61.345 )
								ret := -1.000000 // sell
							if( kinjun_sen > 61.345 )
								ret := 0.642857
						if( senkou_span_a_displaced > 60.8497 )
							if( senkou_span_a_displaced <= 60.9957 )
								ret := 0.384615
							if( senkou_span_a_displaced > 60.9957 )
								if( basis_max <= -0.1577 )
									ret := 0.904762 // buy
								if( basis_max > -0.1577 )
									ret := 0.666667
				if( senkou_span_b > 64.8223 )
					if( chinkou_span <= 68.67 )
						if( tenkan_sen <= 62.8806 )
							ret := 0.846154 // buy
						if( tenkan_sen > 62.8806 )
							if( senkou_span_a_displaced <= 69.2522 )
								if( chinkou_span <= 66.2058 )
									ret := -0.771739 // sell
								if( chinkou_span > 66.2058 )
									ret := -0.316092
							if( senkou_span_a_displaced > 69.2522 )
								if( senkou_span_a <= 70.2595 )
									ret := -0.750000 // sell
								if( senkou_span_a > 70.2595 )
									ret := -0.927536 // sell
					if( chinkou_span > 68.67 )
						if( basis_max <= -2.92333 )
							if( tenkan_sen <= 266.688 )
								if( senkou_span_a <= 153.219 )
									ret := 0.304348
								if( senkou_span_a > 153.219 )
									ret := 0.841584 // buy
							if( tenkan_sen > 266.688 )
								ret := -0.769231 // sell
						if( basis_max > -2.92333 )
							if( senkou_span_b <= 82.3536 )
								if( senkou_span_a <= 80.969 )
									ret := 0.098620
								if( senkou_span_a > 80.969 )
									ret := 0.471477
							if( senkou_span_b > 82.3536 )
								if( chinkou_span <= 83.9992 )
									ret := -0.580220
								if( chinkou_span > 83.9992 )
									ret := 0.036909
			if( basis_minus > 9.01169 )
				if( senkou_span_a_displaced <= 244.884 )
					if( senkou_span_a <= 100.176 )
						ret := -0.777778 // sell
					if( senkou_span_a > 100.176 )
						ret := -1.000000 // sell
				if( senkou_span_a_displaced > 244.884 )
					ret := -0.411765
		if( tenkan_sen > 311.43 )
			if( tenkan_sen <= 316.473 )
				if( chinkou_span <= 307.126 )
					if( kinjun_sen <= 310.193 )
						ret := -1.000000 // sell
					if( kinjun_sen > 310.193 )
						ret := -0.800000 // sell
				if( chinkou_span > 307.126 )
					ret := -1.000000 // sell
			if( tenkan_sen > 316.473 )
				ret := -0.142857
	if( basis_max > -0.139882 )
		if( senkou_span_a_displaced <= 187.817 )
			if( senkou_span_b <= 186.478 )
				if( senkou_span_b_displaced <= 186.945 )
					if( chinkou_span <= 182.691 )
						if( tenkan_sen <= 181.72 )
							if( senkou_span_a <= 173.402 )
								if( senkou_span_b <= 174.751 )
									ret := -0.007722
								if( senkou_span_b > 174.751 )
									ret := 0.793893 // buy
							if( senkou_span_a > 173.402 )
								if( chinkou_span <= 175.837 )
									ret := -0.385556
								if( chinkou_span > 175.837 )
									ret := 0.136993
						if( tenkan_sen > 181.72 )
							if( senkou_span_a_displaced <= 185.299 )
								if( senkou_span_a <= 182.933 )
									ret := -0.386792
								if( senkou_span_a > 182.933 )
									ret := -0.919708 // sell
							if( senkou_span_a_displaced > 185.299 )
								if( senkou_span_b <= 186.383 )
									ret := -0.278195
								if( senkou_span_b > 186.383 )
									ret := -0.536585
					if( chinkou_span > 182.691 )
						if( kinjun_sen <= 185.737 )
							if( basis_max <= -0.137339 )
								ret := -0.230769
							if( basis_max > -0.137339 )
								if( senkou_span_b <= 180.488 )
									ret := 0.823529 // buy
								if( senkou_span_b > 180.488 )
									ret := 0.538922
						if( kinjun_sen > 185.737 )
							if( senkou_span_a <= 187.158 )
								if( senkou_span_b_displaced <= 184.504 )
									ret := -0.144000
								if( senkou_span_b_displaced > 184.504 )
									ret := 0.234973
							if( senkou_span_a > 187.158 )
								if( kinjun_sen <= 187.65 )
									ret := 1.000000 // buy
								if( kinjun_sen > 187.65 )
									ret := 0.692308
				if( senkou_span_b_displaced > 186.945 )
					if( senkou_span_b <= 184.963 )
						if( senkou_span_b_displaced <= 188.244 )
							if( tenkan_sen <= 181.41 )
								if( basis_minus <= -1.55475 )
									ret := 0.571429
								if( basis_minus > -1.55475 )
									ret := -0.571429
							if( tenkan_sen > 181.41 )
								if( basis_max <= 0.884978 )
									ret := -1.000000 // sell
								if( basis_max > 0.884978 )
									ret := -0.777778 // sell
						if( senkou_span_b_displaced > 188.244 )
							if( senkou_span_a <= 182.897 )
								if( chinkou_span <= 178.785 )
									ret := 0.391304
								if( chinkou_span > 178.785 )
									ret := 0.857143 // buy
							if( senkou_span_a > 182.897 )
								if( basis_minus <= -1.23204 )
									ret := -0.166667
								if( basis_minus > -1.23204 )
									ret := 0.538462
					if( senkou_span_b > 184.963 )
						if( kinjun_sen <= 184.574 )
							if( senkou_span_b <= 185.315 )
								if( tenkan_sen <= 181.81 )
									ret := 0.200000
								if( tenkan_sen > 181.81 )
									ret := 0.850000 // buy
							if( senkou_span_b > 185.315 )
								if( basis_minus <= -2.78005 )
									ret := 1.000000 // buy
								if( basis_minus > -2.78005 )
									ret := 0.400000
						if( kinjun_sen > 184.574 )
							if( basis_minus <= -1.51682 )
								ret := -0.625000
							if( basis_minus > -1.51682 )
								if( chinkou_span <= 185.957 )
									ret := -0.437500
								if( chinkou_span > 185.957 )
									ret := 0.692308
			if( senkou_span_b > 186.478 )
				if( senkou_span_b <= 187.965 )
					if( chinkou_span <= 190.217 )
						if( kinjun_sen <= 184.485 )
							ret := 0.500000
						if( kinjun_sen > 184.485 )
							if( senkou_span_a_displaced <= 186.213 )
								if( senkou_span_b <= 186.689 )
									ret := -1.000000 // sell
								if( senkou_span_b > 186.689 )
									ret := -0.785714 // sell
							if( senkou_span_a_displaced > 186.213 )
								if( senkou_span_a <= 185.782 )
									ret := -0.857143 // sell
								if( senkou_span_a > 185.782 )
									ret := -0.466667
					if( chinkou_span > 190.217 )
						if( senkou_span_b <= 187.378 )
							ret := 0.071429
						if( senkou_span_b > 187.378 )
							ret := 0.727273 // buy
				if( senkou_span_b > 187.965 )
					if( basis_minus <= -0.620962 )
						if( senkou_span_a <= 184.699 )
							ret := 0.666667
						if( senkou_span_a > 184.699 )
							if( chinkou_span <= 187.305 )
								ret := 0.062500
							if( chinkou_span > 187.305 )
								ret := 0.300000
					if( basis_minus > -0.620962 )
						if( basis_minus <= 0.262282 )
							ret := 1.000000 // buy
						if( basis_minus > 0.262282 )
							ret := 0.166667
		if( senkou_span_a_displaced > 187.817 )
			if( chinkou_span <= 186.451 )
				if( senkou_span_b <= 186.732 )
					if( chinkou_span <= 180.929 )
						if( basis_max <= 2.33625 )
							if( tenkan_sen <= 182.516 )
								ret := 0.555556
							if( tenkan_sen > 182.516 )
								ret := -0.105263
						if( basis_max > 2.33625 )
							ret := 1.000000 // buy
					if( chinkou_span > 180.929 )
						if( senkou_span_a <= 184.576 )
							if( tenkan_sen <= 179.508 )
								ret := 0.294118
							if( tenkan_sen > 179.508 )
								if( tenkan_sen <= 182.772 )
									ret := -0.913793 // sell
								if( tenkan_sen > 182.772 )
									ret := -0.545455
						if( senkou_span_a > 184.576 )
							if( senkou_span_a <= 184.714 )
								ret := 0.842105 // buy
							if( senkou_span_a > 184.714 )
								ret := -0.200000
				if( senkou_span_b > 186.732 )
					if( senkou_span_a_displaced <= 194.547 )
						if( chinkou_span <= 182.648 )
							if( basis_max <= 1.19288 )
								if( senkou_span_a_displaced <= 191.148 )
									ret := -0.747525 // sell
								if( senkou_span_a_displaced > 191.148 )
									ret := -0.978723 // sell
							if( basis_max > 1.19288 )
								if( senkou_span_b <= 190.021 )
									ret := 1.000000 // buy
								if( senkou_span_b > 190.021 )
									ret := -1.000000 // sell
						if( chinkou_span > 182.648 )
							if( basis_max <= 0.15875 )
								if( chinkou_span <= 185.091 )
									ret := -0.413043
								if( chinkou_span > 185.091 )
									ret := -0.763889 // sell
							if( basis_max > 0.15875 )
								if( senkou_span_b <= 187.868 )
									ret := -0.613636
								if( senkou_span_b > 187.868 )
									ret := 0.104478
					if( senkou_span_a_displaced > 194.547 )
						if( senkou_span_a <= 190.843 )
							if( senkou_span_a_displaced <= 196.538 )
								if( basis_minus <= -1.5925 )
									ret := -0.948276 // sell
								if( basis_minus > -1.5925 )
									ret := -0.416667
							if( senkou_span_a_displaced > 196.538 )
								if( basis_max <= 3.11474 )
									ret := 0.307692
								if( basis_max > 3.11474 )
									ret := 1.000000 // buy
						if( senkou_span_a > 190.843 )
							if( tenkan_sen <= 193.852 )
								if( kinjun_sen <= 194.358 )
									ret := -0.921053 // sell
								if( kinjun_sen > 194.358 )
									ret := -0.318182
							if( tenkan_sen > 193.852 )
								if( basis_max <= 1.57042 )
									ret := -0.940476 // sell
								if( basis_max > 1.57042 )
									ret := -0.375000
			if( chinkou_span > 186.451 )
				if( kinjun_sen <= 197.798 )
					if( chinkou_span <= 197.2 )
						if( kinjun_sen <= 190.28 )
							if( senkou_span_b <= 193.332 )
								if( chinkou_span <= 194.658 )
									ret := 0.239303
								if( chinkou_span > 194.658 )
									ret := 0.853659 // buy
							if( senkou_span_b > 193.332 )
								ret := -1.000000 // sell
						if( kinjun_sen > 190.28 )
							if( chinkou_span <= 191.888 )
								if( senkou_span_b <= 195.82 )
									ret := -0.388393
								if( senkou_span_b > 195.82 )
									ret := 0.140351
							if( chinkou_span > 191.888 )
								if( senkou_span_a <= 193.019 )
									ret := 0.630137
								if( senkou_span_a > 193.019 )
									ret := -0.118734
					if( chinkou_span > 197.2 )
						if( senkou_span_b <= 198.567 )
							if( senkou_span_a <= 196.573 )
								if( chinkou_span <= 200.7 )
									ret := 0.402010
								if( chinkou_span > 200.7 )
									ret := 0.846154 // buy
							if( senkou_span_a > 196.573 )
								if( senkou_span_b <= 197.55 )
									ret := -0.297872
								if( senkou_span_b > 197.55 )
									ret := 0.697674
						if( senkou_span_b > 198.567 )
							if( senkou_span_b <= 199.943 )
								if( senkou_span_a <= 197.227 )
									ret := 1.000000 // buy
								if( senkou_span_a > 197.227 )
									ret := 0.964286 // buy
							if( senkou_span_b > 199.943 )
								ret := 0.909091 // buy
				if( kinjun_sen > 197.798 )
					if( chinkou_span <= 201.11 )
						if( senkou_span_b <= 203.06 )
							if( chinkou_span <= 195.26 )
								if( basis_max <= 0.932696 )
									ret := -0.725146 // sell
								if( basis_max > 0.932696 )
									ret := -0.343750
							if( chinkou_span > 195.26 )
								if( basis_minus <= -0.40428 )
									ret := 0.414062
								if( basis_minus > -0.40428 )
									ret := -0.324444
						if( senkou_span_b > 203.06 )
							if( senkou_span_a_displaced <= 214.016 )
								if( senkou_span_a <= 205.756 )
									ret := -0.458763
								if( senkou_span_a > 205.756 )
									ret := -0.874074 // sell
							if( senkou_span_a_displaced > 214.016 )
								if( senkou_span_a <= 211.975 )
									ret := 0.750000 // buy
								if( senkou_span_a > 211.975 )
									ret := -0.538462
					if( chinkou_span > 201.11 )
						if( tenkan_sen <= 208.575 )
							if( senkou_span_b <= 200.765 )
								if( basis_minus <= -0.558257 )
									ret := 0.980000 // buy
								if( basis_minus > -0.558257 )
									ret := 0.363636
							if( senkou_span_b > 200.765 )
								if( senkou_span_b <= 203.137 )
									ret := -0.310924
								if( senkou_span_b > 203.137 )
									ret := 0.339679
						if( tenkan_sen > 208.575 )
							if( senkou_span_a <= 210.15 )
								if( senkou_span_a_displaced <= 205.975 )
									ret := -0.035714
								if( senkou_span_a_displaced > 205.975 )
									ret := -0.524510
							if( senkou_span_a > 210.15 )
								if( chinkou_span <= 211.605 )
									ret := -0.471698
								if( chinkou_span > 211.605 )
									ret := -0.038180
	
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
float op_operation = decision_tree_0_BABA_30Min_229cd301(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)

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


