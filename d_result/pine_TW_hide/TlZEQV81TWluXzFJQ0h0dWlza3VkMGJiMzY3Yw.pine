//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: NVDA_5Min_1ICH_d0bb367c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVDA_5Min_1ICH_d0bb367c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVDA_5Min_d0bb367c(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( chinkou_span <= 102.25 )
		if( kinjun_sen <= 101.909 )
			if( senkou_span_b_displaced <= 96.4477 )
				if( basis_minus <= 2.88474 )
					ret := 0.875000 // buy
				if( basis_minus > 2.88474 )
					ret := 1.000000 // buy
			if( senkou_span_b_displaced > 96.4477 )
				if( senkou_span_b <= 96.5281 )
					if( senkou_span_b <= 96.4062 )
						ret := 1.000000 // buy
					if( senkou_span_b > 96.4062 )
						ret := 0.812500 // buy
				if( senkou_span_b > 96.5281 )
					if( senkou_span_b_displaced <= 105.743 )
						if( chinkou_span <= 101.734 )
							if( basis_minus <= -1.08399 )
								if( tenkan_sen <= 98.3103 )
									ret := -0.215686
								if( tenkan_sen > 98.3103 )
									ret := -0.903704 // sell
							if( basis_minus > -1.08399 )
								if( senkou_span_a <= 98.1123 )
									ret := 0.913043 // buy
								if( senkou_span_a > 98.1123 )
									ret := -0.289340
						if( chinkou_span > 101.734 )
							if( basis_minus <= 0.198895 )
								if( kinjun_sen <= 100.652 )
									ret := 0.969697 // buy
								if( kinjun_sen > 100.652 )
									ret := 0.470588
							if( basis_minus > 0.198895 )
								ret := -0.461538
					if( senkou_span_b_displaced > 105.743 )
						if( senkou_span_a <= 100.957 )
							ret := 1.000000 // buy
						if( senkou_span_a > 100.957 )
							ret := 0.818182 // buy
		if( kinjun_sen > 101.909 )
			if( senkou_span_a_displaced <= 102.719 )
				ret := -0.444444
			if( senkou_span_a_displaced > 102.719 )
				if( basis_minus <= -2.4648 )
					ret := -0.411765
				if( basis_minus > -2.4648 )
					if( senkou_span_b_displaced <= 106.478 )
						if( senkou_span_b <= 105.74 )
							if( senkou_span_b_displaced <= 106.216 )
								if( chinkou_span <= 97.2681 )
									ret := -0.985294 // sell
								if( chinkou_span > 97.2681 )
									ret := -0.379310
							if( senkou_span_b_displaced > 106.216 )
								ret := -1.000000 // sell
						if( senkou_span_b > 105.74 )
							if( senkou_span_a_displaced <= 106.532 )
								if( chinkou_span <= 101.818 )
									ret := -0.842105 // sell
								if( chinkou_span > 101.818 )
									ret := -1.000000 // sell
							if( senkou_span_a_displaced > 106.532 )
								ret := -1.000000 // sell
					if( senkou_span_b_displaced > 106.478 )
						ret := -0.200000
	if( chinkou_span > 102.25 )
		if( basis_minus <= -0.812097 )
			if( chinkou_span <= 886.795 )
				if( kinjun_sen <= 862.386 )
					if( chinkou_span <= 846.306 )
						if( senkou_span_b <= 781.277 )
							if( basis_max <= -0.429967 )
								if( tenkan_sen <= 278.225 )
									ret := 0.840000 // buy
								if( tenkan_sen > 278.225 )
									ret := 0.288091
							if( basis_max > -0.429967 )
								if( senkou_span_a_displaced <= 777.933 )
									ret := 0.025213
								if( senkou_span_a_displaced > 777.933 )
									ret := 0.696429
						if( senkou_span_b > 781.277 )
							if( senkou_span_b <= 788.285 )
								if( basis_minus <= -16.8179 )
									ret := -0.703704 // sell
								if( basis_minus > -16.8179 )
									ret := -0.986486 // sell
							if( senkou_span_b > 788.285 )
								if( chinkou_span <= 825.868 )
									ret := -0.301956
								if( chinkou_span > 825.868 )
									ret := 0.121212
					if( chinkou_span > 846.306 )
						if( senkou_span_b <= 850.765 )
							if( tenkan_sen <= 829.074 )
								ret := 0.214286
							if( tenkan_sen > 829.074 )
								if( kinjun_sen <= 844.423 )
									ret := 0.971014 // buy
								if( kinjun_sen > 844.423 )
									ret := 0.796053 // buy
						if( senkou_span_b > 850.765 )
							if( senkou_span_b <= 855.622 )
								if( tenkan_sen <= 846.708 )
									ret := 0.750000 // buy
								if( tenkan_sen > 846.708 )
									ret := -0.828571 // sell
							if( senkou_span_b > 855.622 )
								if( chinkou_span <= 868.77 )
									ret := 0.308081
								if( chinkou_span > 868.77 )
									ret := 0.947368 // buy
				if( kinjun_sen > 862.386 )
					if( senkou_span_b_displaced <= 892.471 )
						if( basis_minus <= -3.24599 )
							if( senkou_span_b_displaced <= 891.007 )
								if( chinkou_span <= 874.87 )
									ret := -0.531172
								if( chinkou_span > 874.87 )
									ret := 0.422535
							if( senkou_span_b_displaced > 891.007 )
								if( kinjun_sen <= 877.286 )
									ret := 0.711538 // buy
								if( kinjun_sen > 877.286 )
									ret := -0.379310
						if( basis_minus > -3.24599 )
							if( kinjun_sen <= 865.47 )
								if( tenkan_sen <= 864.705 )
									ret := -0.555556
								if( tenkan_sen > 864.705 )
									ret := -0.812500 // sell
							if( kinjun_sen > 865.47 )
								if( tenkan_sen <= 873.406 )
									ret := 0.487395
								if( tenkan_sen > 873.406 )
									ret := 0.037383
					if( senkou_span_b_displaced > 892.471 )
						if( basis_minus <= -35.0174 )
							if( basis_max <= 3.10295 )
								ret := 0.900000 // buy
							if( basis_max > 3.10295 )
								ret := 1.000000 // buy
						if( basis_minus > -35.0174 )
							if( basis_minus <= -0.891992 )
								if( chinkou_span <= 865.97 )
									ret := -0.819005 // sell
								if( chinkou_span > 865.97 )
									ret := -0.354902
							if( basis_minus > -0.891992 )
								ret := 0.900000 // buy
			if( chinkou_span > 886.795 )
				if( tenkan_sen <= 886.464 )
					if( kinjun_sen <= 889.526 )
						if( basis_max <= 1.09024 )
							if( basis_minus <= -3.7238 )
								if( basis_minus <= -5.40734 )
									ret := 0.750000 // buy
								if( basis_minus > -5.40734 )
									ret := 1.000000 // buy
							if( basis_minus > -3.7238 )
								if( senkou_span_a_displaced <= 880.819 )
									ret := 0.850000 // buy
								if( senkou_span_a_displaced > 880.819 )
									ret := 0.000000
						if( basis_max > 1.09024 )
							if( chinkou_span <= 890.613 )
								if( basis_max <= 1.56354 )
									ret := 0.866667 // buy
								if( basis_max > 1.56354 )
									ret := 0.989130 // buy
							if( chinkou_span > 890.613 )
								if( basis_max <= 2.64751 )
									ret := 0.926829 // buy
								if( basis_max > 2.64751 )
									ret := 0.521739
					if( kinjun_sen > 889.526 )
						ret := -0.909091 // sell
				if( tenkan_sen > 886.464 )
					if( basis_minus <= -8.309 )
						if( kinjun_sen <= 898.875 )
							if( chinkou_span <= 899.776 )
								ret := 0.153846
							if( chinkou_span > 899.776 )
								if( chinkou_span <= 904.273 )
									ret := 0.631579
								if( chinkou_span > 904.273 )
									ret := 1.000000 // buy
						if( kinjun_sen > 898.875 )
							if( senkou_span_a_displaced <= 1215.12 )
								if( senkou_span_b <= 1114.58 )
									ret := -0.380769
								if( senkou_span_b > 1114.58 )
									ret := 0.814815 // buy
							if( senkou_span_a_displaced > 1215.12 )
								if( tenkan_sen <= 1204.62 )
									ret := -0.972222 // sell
								if( tenkan_sen > 1204.62 )
									ret := -0.800000 // sell
					if( basis_minus > -8.309 )
						if( senkou_span_b <= 892.158 )
							if( basis_minus <= -1.68706 )
								if( chinkou_span <= 890.497 )
									ret := 0.000000
								if( chinkou_span > 890.497 )
									ret := -0.181818
							if( basis_minus > -1.68706 )
								if( chinkou_span <= 891.46 )
									ret := -0.320000
								if( chinkou_span > 891.46 )
									ret := -0.823529 // sell
						if( senkou_span_b > 892.158 )
							if( senkou_span_a <= 1217.08 )
								if( kinjun_sen <= 1208.13 )
									ret := 0.194239
								if( kinjun_sen > 1208.13 )
									ret := -0.653061
							if( senkou_span_a > 1217.08 )
								if( basis_max <= 1.33808 )
									ret := 0.866667 // buy
								if( basis_max > 1.33808 )
									ret := 0.642857
		if( basis_minus > -0.812097 )
			if( senkou_span_b_displaced <= 105.585 )
				if( kinjun_sen <= 106.401 )
					if( senkou_span_b_displaced <= 103.909 )
						if( senkou_span_b <= 100.714 )
							if( basis_max <= -0.42375 )
								if( tenkan_sen <= 102.085 )
									ret := -0.476190
								if( tenkan_sen > 102.085 )
									ret := 1.000000 // buy
							if( basis_max > -0.42375 )
								if( senkou_span_a <= 99.8232 )
									ret := 0.764706 // buy
								if( senkou_span_a > 99.8232 )
									ret := 1.000000 // buy
						if( senkou_span_b > 100.714 )
							if( kinjun_sen <= 102.389 )
								if( senkou_span_a_displaced <= 100.52 )
									ret := -0.846154 // sell
								if( senkou_span_a_displaced > 100.52 )
									ret := -0.220000
							if( kinjun_sen > 102.389 )
								if( basis_minus <= 0.051641 )
									ret := 0.637681
								if( basis_minus > 0.051641 )
									ret := -0.175066
					if( senkou_span_b_displaced > 103.909 )
						if( senkou_span_a_displaced <= 104.842 )
							if( tenkan_sen <= 104.808 )
								if( chinkou_span <= 102.472 )
									ret := 0.230769
								if( chinkou_span > 102.472 )
									ret := 0.677778
							if( tenkan_sen > 104.808 )
								if( kinjun_sen <= 105.298 )
									ret := -0.504950
								if( kinjun_sen > 105.298 )
									ret := 0.405405
						if( senkou_span_a_displaced > 104.842 )
							if( senkou_span_a_displaced <= 105.831 )
								if( kinjun_sen <= 104.779 )
									ret := 0.416667
								if( kinjun_sen > 104.779 )
									ret := 0.810036 // buy
							if( senkou_span_a_displaced > 105.831 )
								if( kinjun_sen <= 105.74 )
									ret := 0.681818
								if( kinjun_sen > 105.74 )
									ret := -0.527273
				if( kinjun_sen > 106.401 )
					if( chinkou_span <= 110.43 )
						if( senkou_span_b_displaced <= 104.558 )
							if( basis_minus <= 3.63797 )
								if( tenkan_sen <= 106.738 )
									ret := -0.326531
								if( tenkan_sen > 106.738 )
									ret := -0.823529 // sell
							if( basis_minus > 3.63797 )
								ret := 0.222222
						if( senkou_span_b_displaced > 104.558 )
							if( senkou_span_a <= 108.392 )
								if( senkou_span_b <= 106.638 )
									ret := -0.068966
								if( senkou_span_b > 106.638 )
									ret := 0.851852 // buy
							if( senkou_span_a > 108.392 )
								ret := -1.000000 // sell
					if( chinkou_span > 110.43 )
						if( basis_max <= 0.174494 )
							ret := 0.600000
						if( basis_max > 0.174494 )
							ret := 1.000000 // buy
			if( senkou_span_b_displaced > 105.585 )
				if( senkou_span_b_displaced <= 107.075 )
					if( tenkan_sen <= 106.834 )
						if( senkou_span_b_displaced <= 106.898 )
							if( tenkan_sen <= 105.597 )
								if( chinkou_span <= 105.153 )
									ret := 0.351351
								if( chinkou_span > 105.153 )
									ret := -0.345455
							if( tenkan_sen > 105.597 )
								if( kinjun_sen <= 106.582 )
									ret := 0.609756
								if( kinjun_sen > 106.582 )
									ret := 0.020408
						if( senkou_span_b_displaced > 106.898 )
							if( basis_minus <= -0.688257 )
								ret := 0.800000 // buy
							if( basis_minus > -0.688257 )
								if( senkou_span_a_displaced <= 107.23 )
									ret := -0.756522 // sell
								if( senkou_span_a_displaced > 107.23 )
									ret := -0.136364
					if( tenkan_sen > 106.834 )
						if( chinkou_span <= 106.997 )
							if( senkou_span_a_displaced <= 107.431 )
								if( basis_minus <= -0.24551 )
									ret := 0.315789
								if( basis_minus > -0.24551 )
									ret := -0.567251
							if( senkou_span_a_displaced > 107.431 )
								if( senkou_span_b <= 107.085 )
									ret := -0.857143 // sell
								if( senkou_span_b > 107.085 )
									ret := -0.989247 // sell
						if( chinkou_span > 106.997 )
							if( tenkan_sen <= 106.852 )
								ret := -1.000000 // sell
							if( tenkan_sen > 106.852 )
								if( senkou_span_b_displaced <= 105.671 )
									ret := -1.000000 // sell
								if( senkou_span_b_displaced > 105.671 )
									ret := 0.111801
				if( senkou_span_b_displaced > 107.075 )
					if( basis_max <= -5.99043 )
						if( tenkan_sen <= 379.493 )
							ret := 1.000000 // buy
						if( tenkan_sen > 379.493 )
							if( chinkou_span <= 722.512 )
								if( basis_minus <= 18.6831 )
									ret := -1.000000 // sell
								if( basis_minus > 18.6831 )
									ret := -0.939394 // sell
							if( chinkou_span > 722.512 )
								if( chinkou_span <= 1013.48 )
									ret := -0.083056
								if( chinkou_span > 1013.48 )
									ret := -0.511905
					if( basis_max > -5.99043 )
						if( senkou_span_a_displaced <= 106.113 )
							if( kinjun_sen <= 105.986 )
								if( chinkou_span <= 106.295 )
									ret := -0.945946 // sell
								if( chinkou_span > 106.295 )
									ret := -1.000000 // sell
							if( kinjun_sen > 105.986 )
								ret := 0.090909
						if( senkou_span_a_displaced > 106.113 )
							if( senkou_span_b_displaced <= 110.237 )
								if( basis_max <= -0.409958 )
									ret := 0.561404
								if( basis_max > -0.409958 )
									ret := 0.170284
							if( senkou_span_b_displaced > 110.237 )
								if( kinjun_sen <= 1239.62 )
									ret := -0.012267
								if( kinjun_sen > 1239.62 )
									ret := -0.754902 // sell
	
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
float op_operation = decision_tree_0_NVDA_5Min_d0bb367c(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)

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


