//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: UNIUSDT_5Min_1ICH_889b484b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UNIUSDT_5Min_1ICH_889b484b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UNIUSDT_5Min_889b484b(senkou_span_a_displaced, cross_dn_tenkan_kinjunInt, kinjun_sen, chinkou_span, senkou_span_b_displaced, basis_minus, senkou_span_b, senkou_span_a, cross_up_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( basis_max <= 0.00037 )
		if( senkou_span_b_displaced <= 7.52726 )
			if( chinkou_span <= 7.44924 )
				if( kinjun_sen <= 7.3856 )
					if( chinkou_span <= 7.27056 )
						if( senkou_span_b <= 7.12317 )
							if( chinkou_span <= 6.99706 )
								ret := 0.031433
							if( chinkou_span > 6.99706 )
								ret := 0.226155
						if( senkou_span_b > 7.12317 )
							if( basis_minus <= 0.024125 )
								ret := -0.202339
							if( basis_minus > 0.024125 )
								ret := -0.542146
					if( chinkou_span > 7.27056 )
						if( senkou_span_a <= 7.21188 )
							if( tenkan_sen <= 7.09101 )
								ret := 0.922222 // buy
							if( tenkan_sen > 7.09101 )
								ret := 0.662577
						if( senkou_span_a > 7.21188 )
							if( basis_max <= -0.023588 )
								ret := -0.163934
							if( basis_max > -0.023588 )
								ret := 0.191506
				if( kinjun_sen > 7.3856 )
					if( chinkou_span <= 7.39987 )
						if( kinjun_sen <= 7.39925 )
							if( basis_max <= -0.01125 )
								ret := 0.291667
							if( basis_max > -0.01125 )
								ret := -0.442308
						if( kinjun_sen > 7.39925 )
							if( senkou_span_b <= 7.31292 )
								ret := 0.000000
							if( senkou_span_b > 7.31292 )
								ret := -0.726384 // sell
					if( chinkou_span > 7.39987 )
						if( tenkan_sen <= 7.47087 )
							if( senkou_span_b <= 7.41842 )
								ret := 0.340426
							if( senkou_span_b > 7.41842 )
								ret := -0.302083
						if( tenkan_sen > 7.47087 )
							if( senkou_span_b_displaced <= 7.31775 )
								ret := -0.916667 // sell
							if( senkou_span_b_displaced > 7.31775 )
								ret := -0.333333
			if( chinkou_span > 7.44924 )
				if( kinjun_sen <= 7.46397 )
					if( chinkou_span <= 7.6161 )
						if( tenkan_sen <= 7.36141 )
							if( basis_minus <= 0.143911 )
								ret := 0.776256 // buy
							if( basis_minus > 0.143911 )
								ret := 0.409091
						if( tenkan_sen > 7.36141 )
							if( basis_max <= -0.030125 )
								ret := -0.139535
							if( basis_max > -0.030125 )
								ret := 0.446269
					if( chinkou_span > 7.6161 )
						if( chinkou_span <= 11.309 )
							if( basis_minus <= 0.15728 )
								ret := 0.874286 // buy
							if( basis_minus > 0.15728 )
								ret := 0.472222
						if( chinkou_span > 11.309 )
							ret := 0.222222
				if( kinjun_sen > 7.46397 )
					if( chinkou_span <= 7.65427 )
						if( kinjun_sen <= 7.53663 )
							if( basis_max <= -0.036056 )
								ret := -0.666667
							if( basis_max > -0.036056 )
								ret := 0.197655
						if( kinjun_sen > 7.53663 )
							if( chinkou_span <= 7.49036 )
								ret := 0.764706 // buy
							if( chinkou_span > 7.49036 )
								ret := -0.271978
					if( chinkou_span > 7.65427 )
						if( senkou_span_b <= 7.45425 )
							if( kinjun_sen <= 7.47722 )
								ret := -0.857143 // sell
							if( kinjun_sen > 7.47722 )
								ret := -1.000000 // sell
						if( senkou_span_b > 7.45425 )
							if( basis_minus <= 0.141762 )
								ret := 0.607843
							if( basis_minus > 0.141762 )
								ret := -0.333333
		if( senkou_span_b_displaced > 7.52726 )
			if( chinkou_span <= 7.60033 )
				if( senkou_span_a <= 7.55588 )
					if( chinkou_span <= 7.4365 )
						if( senkou_span_a_displaced <= 7.5472 )
							if( senkou_span_b <= 7.53325 )
								ret := -0.632653
							if( senkou_span_b > 7.53325 )
								ret := 0.384615
						if( senkou_span_a_displaced > 7.5472 )
							if( kinjun_sen <= 7.53432 )
								ret := -0.911765 // sell
							if( kinjun_sen > 7.53432 )
								ret := -0.285714
					if( chinkou_span > 7.4365 )
						if( senkou_span_b_displaced <= 7.647 )
							if( senkou_span_a_displaced <= 7.54058 )
								ret := 0.126761
							if( senkou_span_a_displaced > 7.54058 )
								ret := -0.338308
						if( senkou_span_b_displaced > 7.647 )
							if( senkou_span_b <= 7.54908 )
								ret := 0.947368 // buy
							if( senkou_span_b > 7.54908 )
								ret := 0.000000
				if( senkou_span_a > 7.55588 )
					if( basis_max <= -0.007005 )
						if( senkou_span_a <= 7.66637 )
							if( senkou_span_b_displaced <= 7.53775 )
								ret := -0.840580 // sell
							if( senkou_span_b_displaced > 7.53775 )
								ret := -0.487437
						if( senkou_span_a > 7.66637 )
							if( basis_minus <= 0.007305 )
								ret := -0.285714
							if( basis_minus > 0.007305 )
								ret := -0.904762 // sell
					if( basis_max > -0.007005 )
						if( chinkou_span <= 7.5175 )
							if( senkou_span_a_displaced <= 7.53225 )
								ret := 0.142857
							if( senkou_span_a_displaced > 7.53225 )
								ret := -0.692308
						if( chinkou_span > 7.5175 )
							if( senkou_span_b <= 7.65037 )
								ret := -0.330396
							if( senkou_span_b > 7.65037 )
								ret := 0.096154
			if( chinkou_span > 7.60033 )
				if( senkou_span_b <= 7.58687 )
					if( senkou_span_a <= 7.51573 )
						if( basis_minus <= -0.0115 )
							ret := 0.000000
						if( basis_minus > -0.0115 )
							ret := -0.888889 // sell
					if( senkou_span_a > 7.51573 )
						if( senkou_span_b_displaced <= 7.53457 )
							if( chinkou_span <= 7.722 )
								ret := -0.210526
							if( chinkou_span > 7.722 )
								ret := 0.700000 // buy
						if( senkou_span_b_displaced > 7.53457 )
							if( basis_minus <= -0.026975 )
								ret := -0.133333
							if( basis_minus > -0.026975 )
								ret := 0.614148
				if( senkou_span_b > 7.58687 )
					if( chinkou_span <= 7.71122 )
						if( senkou_span_a <= 7.74586 )
							if( basis_minus <= -0.048856 )
								ret := 0.479452
							if( basis_minus > -0.048856 )
								ret := -0.150235
						if( senkou_span_a > 7.74586 )
							if( basis_minus <= -0.01075 )
								ret := -0.138889
							if( basis_minus > -0.01075 )
								ret := -0.696970
					if( chinkou_span > 7.71122 )
						if( senkou_span_b_displaced <= 7.83925 )
							if( chinkou_span <= 7.95826 )
								ret := 0.064819
							if( chinkou_span > 7.95826 )
								ret := 0.546374
						if( senkou_span_b_displaced > 7.83925 )
							if( senkou_span_a <= 15.8961 )
								ret := -0.007995
							if( senkou_span_a > 15.8961 )
								ret := -0.938776 // sell
	if( basis_max > 0.00037 )
		if( basis_minus <= -0.038813 )
			if( chinkou_span <= 10.9475 )
				if( senkou_span_a <= 10.885 )
					if( chinkou_span <= 10.6082 )
						if( tenkan_sen <= 10.5259 )
							if( chinkou_span <= 10.0016 )
								ret := 0.107363
							if( chinkou_span > 10.0016 )
								ret := 0.354622
						if( tenkan_sen > 10.5259 )
							if( basis_max <= 0.070046 )
								ret := -0.533808
							if( basis_max > 0.070046 )
								ret := 0.344828
					if( chinkou_span > 10.6082 )
						if( senkou_span_a <= 10.7016 )
							if( senkou_span_b_displaced <= 10.694 )
								ret := 0.974359 // buy
							if( senkou_span_b_displaced > 10.694 )
								ret := 0.551724
						if( senkou_span_a > 10.7016 )
							if( basis_max <= 0.01951 )
								ret := -0.320755
							if( basis_max > 0.01951 )
								ret := 0.215743
				if( senkou_span_a > 10.885 )
					if( senkou_span_b_displaced <= 11.0328 )
						if( senkou_span_b <= 11.0241 )
							if( senkou_span_a_displaced <= 11.0818 )
								ret := -1.000000 // sell
							if( senkou_span_a_displaced > 11.0818 )
								ret := -0.882353 // sell
						if( senkou_span_b > 11.0241 )
							if( tenkan_sen <= 10.9221 )
								ret := -0.555556
							if( tenkan_sen > 10.9221 )
								ret := -0.937500 // sell
					if( senkou_span_b_displaced > 11.0328 )
						if( basis_minus <= -0.051331 )
							if( chinkou_span <= 10.8874 )
								ret := -0.594737
							if( chinkou_span > 10.8874 )
								ret := -0.230769
						if( basis_minus > -0.051331 )
							if( basis_max <= 0.034 )
								ret := 0.689655
							if( basis_max > 0.034 )
								ret := -0.666667
			if( chinkou_span > 10.9475 )
				if( tenkan_sen <= 11.0333 )
					if( chinkou_span <= 11.1982 )
						if( basis_minus <= -0.167151 )
							if( basis_max <= 0.011607 )
								ret := 0.571429
							if( basis_max > 0.011607 )
								ret := 1.000000 // buy
						if( basis_minus > -0.167151 )
							if( kinjun_sen <= 10.8484 )
								ret := 0.747899 // buy
							if( kinjun_sen > 10.8484 )
								ret := 0.308197
					if( chinkou_span > 11.1982 )
						if( basis_max <= 0.007725 )
							ret := 0.428571
						if( basis_max > 0.007725 )
							if( tenkan_sen <= 11.0142 )
								ret := 0.956140 // buy
							if( tenkan_sen > 11.0142 )
								ret := 0.625000
				if( tenkan_sen > 11.0333 )
					if( senkou_span_b_displaced <= 11.1885 )
						if( basis_max <= 0.111432 )
							if( basis_max <= 0.018497 )
								ret := 0.428571
							if( basis_max > 0.018497 )
								ret := -0.931818 // sell
						if( basis_max > 0.111432 )
							ret := 0.846154 // buy
					if( senkou_span_b_displaced > 11.1885 )
						if( chinkou_span <= 11.1281 )
							if( senkou_span_a_displaced <= 11.6526 )
								ret := -0.150943
							if( senkou_span_a_displaced > 11.6526 )
								ret := -0.807018 // sell
						if( chinkou_span > 11.1281 )
							if( kinjun_sen <= 11.4063 )
								ret := 0.409836
							if( kinjun_sen > 11.4063 )
								ret := 0.140421
		if( basis_minus > -0.038813 )
			if( kinjun_sen <= 8.109 )
				if( chinkou_span <= 7.85586 )
					if( senkou_span_b <= 7.81165 )
						if( chinkou_span <= 7.54721 )
							if( tenkan_sen <= 7.5452 )
								ret := 0.053383
							if( tenkan_sen > 7.5452 )
								ret := -0.374220
						if( chinkou_span > 7.54721 )
							if( tenkan_sen <= 7.59681 )
								ret := 0.449219
							if( tenkan_sen > 7.59681 )
								ret := 0.055586
					if( senkou_span_b > 7.81165 )
						if( chinkou_span <= 7.76665 )
							if( basis_max <= 0.020031 )
								ret := -0.452899
							if( basis_max > 0.020031 )
								ret := -0.885714 // sell
						if( chinkou_span > 7.76665 )
							if( tenkan_sen <= 7.83536 )
								ret := 0.145161
							if( tenkan_sen > 7.83536 )
								ret := -0.221875
				if( chinkou_span > 7.85586 )
					if( kinjun_sen <= 7.84047 )
						if( cross_dn_tenkan_kinjunInt <= 0.5 )
							if( senkou_span_a_displaced <= 7.38861 )
								ret := 0.125000
							if( senkou_span_a_displaced > 7.38861 )
								ret := 0.806557 // buy
						if( cross_dn_tenkan_kinjunInt > 0.5 )
							ret := 0.000000
					if( kinjun_sen > 7.84047 )
						if( chinkou_span <= 8.07116 )
							if( senkou_span_b <= 7.94578 )
								ret := 0.323944
							if( senkou_span_b > 7.94578 )
								ret := 0.037879
						if( chinkou_span > 8.07116 )
							if( tenkan_sen <= 8.04225 )
								ret := 0.734177 // buy
							if( tenkan_sen > 8.04225 )
								ret := 0.343750
			if( kinjun_sen > 8.109 )
				if( chinkou_span <= 8.13213 )
					if( tenkan_sen <= 8.18672 )
						if( basis_minus <= -0.031324 )
							if( tenkan_sen <= 8.0948 )
								ret := 1.000000 // buy
							if( tenkan_sen > 8.0948 )
								ret := 0.000000
						if( basis_minus > -0.031324 )
							if( senkou_span_b_displaced <= 8.06092 )
								ret := -0.641026
							if( senkou_span_b_displaced > 8.06092 )
								ret := -0.261364
					if( tenkan_sen > 8.18672 )
						if( kinjun_sen <= 8.22745 )
							if( basis_max <= 0.003396 )
								ret := -1.000000 // sell
							if( basis_max > 0.003396 )
								ret := -0.843750 // sell
						if( kinjun_sen > 8.22745 )
							if( basis_max <= 0.022763 )
								ret := -0.520000
							if( basis_max > 0.022763 )
								ret := -0.913043 // sell
				if( chinkou_span > 8.13213 )
					if( chinkou_span <= 10.9407 )
						if( senkou_span_a <= 10.8427 )
							if( chinkou_span <= 10.6719 )
								ret := -0.005191
							if( chinkou_span > 10.6719 )
								ret := 0.421296
						if( senkou_span_a > 10.8427 )
							if( basis_minus <= 0.102904 )
								ret := -0.476190
							if( basis_minus > 0.102904 )
								ret := -0.909091 // sell
					if( chinkou_span > 10.9407 )
						if( kinjun_sen <= 11.0199 )
							if( chinkou_span <= 10.9875 )
								ret := 0.247863
							if( chinkou_span > 10.9875 )
								ret := 0.690037
						if( kinjun_sen > 11.0199 )
							if( chinkou_span <= 11.1912 )
								ret := -0.195326
							if( chinkou_span > 11.1912 )
								ret := 0.073001
	
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
float op_operation = decision_tree_0_UNIUSDT_5Min_889b484b(senkou_span_a_displaced, cross_dn_tenkan_kinjunInt, kinjun_sen, chinkou_span, senkou_span_b_displaced, basis_minus, senkou_span_b, senkou_span_a, cross_up_tenkan_kinjunInt, tenkan_sen, basis_max)

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


