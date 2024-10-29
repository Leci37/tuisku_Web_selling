//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: XLMUSDT_15Min_2ST0_be9210c9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XLMUSDT_15Min_2ST0_be9210c9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XLMUSDT_15Min_be9210c9(smoothK_k, d_k, k, smoothD_d, rsi1, d, ema2, tema, ema12, ema3, ema1, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( smoothK_k <= 42.5091 )
		if( rsi1 <= 45.6986 )
			if( ema12 <= 1.1e-05 )
				if( rsi1 <= 29.9994 )
					if( ema13 <= -0.000528 )
						if( ema12 <= -0.000664 )
							if( ema3 <= 0.108837 )
								ret := 0.277950
							if( ema3 > 0.108837 )
								ret := -0.108200
						if( ema12 > -0.000664 )
							if( rsi1 <= 20.4457 )
								ret := -0.454217
							if( rsi1 > 20.4457 )
								ret := -0.160406
					if( ema13 > -0.000528 )
						if( tema <= 0.091457 )
							if( d <= 9.43048 )
								ret := -0.349498
							if( d > 9.43048 )
								ret := -0.020455
						if( tema > 0.091457 )
							if( ema12 <= -0.000138 )
								ret := -0.531089
							if( ema12 > -0.000138 )
								ret := -0.693284
				if( rsi1 > 29.9994 )
					if( ema12 <= -0.000197 )
						if( rsi1 <= 38.7769 )
							if( ema12 <= -0.000346 )
								ret := 0.134623
							if( ema12 > -0.000346 )
								ret := -0.102158
						if( rsi1 > 38.7769 )
							if( d_k <= 7.09484 )
								ret := 0.349815
							if( d_k > 7.09484 )
								ret := -0.021053
					if( ema12 > -0.000197 )
						if( rsi1 <= 36.3466 )
							if( tema <= 0.114267 )
								ret := -0.250720
							if( tema > 0.114267 )
								ret := -0.581114
						if( rsi1 > 36.3466 )
							if( d_k <= -0.932899 )
								ret := -0.231140
							if( d_k > -0.932899 )
								ret := -0.028892
			if( ema12 > 1.1e-05 )
				if( ema12 <= 0.000145 )
					if( tema <= 0.093738 )
						if( rsi1 <= 36.2664 )
							if( ema2 <= 0.091413 )
								ret := -0.710145 // sell
							if( ema2 > 0.091413 )
								ret := -0.514706
						if( rsi1 > 36.2664 )
							if( smoothK_k <= -2.20503 )
								ret := -0.037975
							if( smoothK_k > -2.20503 )
								ret := -0.273632
					if( tema > 0.093738 )
						if( rsi1 <= 39.8663 )
							if( rsi1 <= 33.3253 )
								ret := -0.849123 // sell
							if( rsi1 > 33.3253 )
								ret := -0.657980
						if( rsi1 > 39.8663 )
							if( d_k <= 11.3854 )
								ret := -0.504399
							if( d_k > 11.3854 )
								ret := -0.178295
				if( ema12 > 0.000145 )
					if( smoothD_d <= 63.0805 )
						if( rsi1 <= 39.9951 )
							if( ema2 <= 0.1482 )
								ret := -0.901659 // sell
							if( ema2 > 0.1482 )
								ret := -0.588235
						if( rsi1 > 39.9951 )
							if( ema12 <= 0.000229 )
								ret := -0.657732
							if( ema12 > 0.000229 )
								ret := -0.828047 // sell
					if( smoothD_d > 63.0805 )
						if( smoothK_k <= 36.8318 )
							ret := 1.000000 // buy
						if( smoothK_k > 36.8318 )
							ret := -0.375000
		if( rsi1 > 45.6986 )
			if( ema13 <= 0.000269 )
				if( ema12 <= -2.3e-05 )
					if( rsi1 <= 50.0172 )
						if( tema <= 0.136048 )
							if( ema12 <= -0.000129 )
								ret := 0.452750
							if( ema12 > -0.000129 )
								ret := 0.111300
						if( tema > 0.136048 )
							if( smoothD_d <= 57.2262 )
								ret := -0.157534
							if( smoothD_d > 57.2262 )
								ret := 1.000000 // buy
					if( rsi1 > 50.0172 )
						if( d_k <= -8.3154 )
							if( smoothD_d <= 5.81676 )
								ret := -0.750000 // sell
							if( smoothD_d > 5.81676 )
								ret := 0.321799
						if( d_k > -8.3154 )
							if( smoothD_d <= -0.561638 )
								ret := -0.571429
							if( smoothD_d > -0.561638 )
								ret := 0.580205
				if( ema12 > -2.3e-05 )
					if( rsi1 <= 50.7646 )
						if( ema12 <= 7.2e-05 )
							if( ema13 <= 0.000179 )
								ret := -0.129817
							if( ema13 > 0.000179 )
								ret := 0.328125
						if( ema12 > 7.2e-05 )
							if( k <= 12.8387 )
								ret := -0.114286
							if( k > 12.8387 )
								ret := -0.446585
					if( rsi1 > 50.7646 )
						if( ema12 <= 0.000129 )
							if( d_k <= -7.82566 )
								ret := -0.016393
							if( d_k > -7.82566 )
								ret := 0.154394
						if( ema12 > 0.000129 )
							if( rsi1 <= 54.1861 )
								ret := -0.376344
							if( rsi1 > 54.1861 )
								ret := -0.096552
			if( ema13 > 0.000269 )
				if( rsi1 <= 57.8078 )
					if( ema12 <= 0.000189 )
						if( ema12 <= 0.000128 )
							if( ema12 <= 4.6e-05 )
								ret := 0.567901
							if( ema12 > 4.6e-05 )
								ret := 0.213483
						if( ema12 > 0.000128 )
							if( ema13 <= 0.000415 )
								ret := -0.202564
							if( ema13 > 0.000415 )
								ret := 0.204633
					if( ema12 > 0.000189 )
						if( smoothD_d <= 51.1289 )
							if( ema12 <= 0.000388 )
								ret := -0.368779
							if( ema12 > 0.000388 )
								ret := -0.668067
						if( smoothD_d > 51.1289 )
							if( d_k <= 20.2618 )
								ret := -0.352273
							if( d_k > 20.2618 )
								ret := 0.205128
				if( rsi1 > 57.8078 )
					if( ema12 <= 0.000734 )
						if( rsi1 <= 65.922 )
							if( d_k <= 20.659 )
								ret := 0.016202
							if( d_k > 20.659 )
								ret := 0.248299
						if( rsi1 > 65.922 )
							if( d <= 51.3932 )
								ret := 0.315297
							if( d > 51.3932 )
								ret := 0.073333
					if( ema12 > 0.000734 )
						if( d_k <= 18.139 )
							if( rsi1 <= 71.7225 )
								ret := -0.488470
							if( rsi1 > 71.7225 )
								ret := 0.289720
						if( d_k > 18.139 )
							if( d_k <= 26.1338 )
								ret := 0.045872
							if( d_k > 26.1338 )
								ret := 0.666667
	if( smoothK_k > 42.5091 )
		if( rsi1 <= 58.8255 )
			if( ema12 <= -0.000121 )
				if( rsi1 <= 43.8076 )
					if( ema12 <= -0.00048 )
						if( d_k <= -14.6984 )
							if( d <= 29.1387 )
								ret := -0.650000
							if( d > 29.1387 )
								ret := 0.080610
						if( d_k > -14.6984 )
							if( rsi1 <= 21.9484 )
								ret := -0.568627
							if( rsi1 > 21.9484 )
								ret := 0.369970
					if( ema12 > -0.00048 )
						if( tema <= 0.119129 )
							if( ema12 <= -0.000284 )
								ret := 0.182075
							if( ema12 > -0.000284 )
								ret := 0.007071
						if( tema > 0.119129 )
							if( smoothD_d <= 67.1899 )
								ret := -0.085271
							if( smoothD_d > 67.1899 )
								ret := -0.324405
				if( rsi1 > 43.8076 )
					if( rsi1 <= 50.001 )
						if( ema13 <= -0.000694 )
							if( ema12 <= -0.000378 )
								ret := 0.644610
							if( ema12 > -0.000378 )
								ret := 0.008439
						if( ema13 > -0.000694 )
							if( d_k <= 8.62797 )
								ret := 0.272241
							if( d_k > 8.62797 )
								ret := 0.606838
					if( rsi1 > 50.001 )
						if( d <= 35.6083 )
							if( d_k <= -24.2371 )
								ret := -0.400000
							if( d_k > -24.2371 )
								ret := 0.258065
						if( d > 35.6083 )
							if( ema13 <= 8.6e-05 )
								ret := 0.656867
							if( ema13 > 8.6e-05 )
								ret := -0.571429
			if( ema12 > -0.000121 )
				if( rsi1 <= 49.9978 )
					if( tema <= 0.0917 )
						if( ema12 <= -2.2e-05 )
							if( smoothK_k <= 60.5385 )
								ret := -0.049231
							if( smoothK_k > 60.5385 )
								ret := 0.129590
						if( ema12 > -2.2e-05 )
							if( ema12 <= 0.000162 )
								ret := -0.122283
							if( ema12 > 0.000162 )
								ret := -1.000000 // sell
					if( tema > 0.0917 )
						if( smoothD_d <= 73.9075 )
							if( rsi1 <= 35.3943 )
								ret := -0.614583
							if( rsi1 > 35.3943 )
								ret := -0.287099
						if( smoothD_d > 73.9075 )
							if( ema13 <= -0.000393 )
								ret := -0.609195
							if( ema13 > -0.000393 )
								ret := -0.084730
				if( rsi1 > 49.9978 )
					if( d_k <= 0.65538 )
						if( ema12 <= 6e-06 )
							if( rsi1 <= 53.8706 )
								ret := 0.003676
							if( rsi1 > 53.8706 )
								ret := 0.285390
						if( ema12 > 6e-06 )
							if( smoothD_d <= 92.0197 )
								ret := -0.117493
							if( smoothD_d > 92.0197 )
								ret := -0.447489
					if( d_k > 0.65538 )
						if( ema12 <= -2.1e-05 )
							if( smoothD_d <= 84.674 )
								ret := 0.306859
							if( smoothD_d > 84.674 )
								ret := 0.495434
						if( ema12 > -2.1e-05 )
							if( ema12 <= 0.000631 )
								ret := 0.054372
							if( ema12 > 0.000631 )
								ret := -0.708333 // sell
		if( rsi1 > 58.8255 )
			if( ema12 <= 2e-05 )
				if( ema12 <= -0.000105 )
					if( rsi1 <= 65.0283 )
						if( d_k <= -25.9032 )
							if( d_k <= -27.9045 )
								ret := 0.700000 // buy
							if( d_k > -27.9045 )
								ret := 0.000000
						if( d_k > -25.9032 )
							if( ema13 <= -0.001135 )
								ret := 0.387755
							if( ema13 > -0.001135 )
								ret := 0.812183 // buy
					if( rsi1 > 65.0283 )
						if( d_k <= 2.91018 )
							if( ema13 <= -0.000389 )
								ret := 0.867816 // buy
							if( ema13 > -0.000389 )
								ret := 0.947619 // buy
						if( d_k > 2.91018 )
							if( rsi1 <= 67.5918 )
								ret := 0.769231 // buy
							if( rsi1 > 67.5918 )
								ret := 0.090909
				if( ema12 > -0.000105 )
					if( ema1 <= 0.093414 )
						if( rsi1 <= 63.6642 )
							if( d_k <= 1.63033 )
								ret := 0.243363
							if( d_k > 1.63033 )
								ret := 0.544444
						if( rsi1 > 63.6642 )
							if( ema12 <= -9.1e-05 )
								ret := 1.000000 // buy
							if( ema12 > -9.1e-05 )
								ret := 0.496552
					if( ema1 > 0.093414 )
						if( rsi1 <= 66.6788 )
							if( ema13 <= -0.000267 )
								ret := 0.385621
							if( ema13 > -0.000267 )
								ret := 0.622929
						if( rsi1 > 66.6788 )
							if( ema12 <= -3.1e-05 )
								ret := 0.840000 // buy
							if( ema12 > -3.1e-05 )
								ret := 0.755396 // buy
			if( ema12 > 2e-05 )
				if( rsi1 <= 68.4242 )
					if( ema12 <= 0.000327 )
						if( d_k <= 3.90038 )
							if( ema3 <= 0.123596 )
								ret := 0.134909
							if( ema3 > 0.123596 )
								ret := 0.305430
						if( d_k > 3.90038 )
							if( ema1 <= 0.093722 )
								ret := 0.145086
							if( ema1 > 0.093722 )
								ret := 0.374113
					if( ema12 > 0.000327 )
						if( d_k <= 11.2597 )
							if( smoothK_k <= 93.0526 )
								ret := -0.178844
							if( smoothK_k > 93.0526 )
								ret := 0.189189
						if( d_k > 11.2597 )
							if( ema13 <= 0.001604 )
								ret := 0.314815
							if( ema13 > 0.001604 )
								ret := -0.166667
				if( rsi1 > 68.4242 )
					if( ema12 <= 0.000315 )
						if( ema3 <= 0.093132 )
							if( smoothK_k <= 55.9388 )
								ret := -0.205128
							if( smoothK_k > 55.9388 )
								ret := 0.239091
						if( ema3 > 0.093132 )
							if( d <= 92.2738 )
								ret := 0.495439
							if( d > 92.2738 )
								ret := 0.665938
					if( ema12 > 0.000315 )
						if( rsi1 <= 77.0792 )
							if( smoothK_k <= 89.2615 )
								ret := 0.267304
							if( smoothK_k > 89.2615 )
								ret := -0.017672
						if( rsi1 > 77.0792 )
							if( ema12 <= 0.001314 )
								ret := 0.445687
							if( ema12 > 0.001314 )
								ret := 0.060932
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Stochastic_RSI 
//@version=5
//indicator title="Stochastic RSI", shorttitle="Stoch RSI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
smoothK = input.int(3, "K", minval=1)
smoothD = input.int(3, "D", minval=1)
lengthRSI = input.int(14, "RSI Length", minval=1)
lengthStoch = input.int(14, "Stochastic Length", minval=1)
src = input(close, title="RSI Source")
rsi1 = ta.rsi(src, lengthRSI)
k = ta.sma(ta.stoch(rsi1, rsi1, rsi1, lengthStoch), smoothK)
d = ta.sma(k, smoothD)
plot(k, "K", color=#2962FF)
plot(d, "D", color=#FF6D00)

d_k = d - k
smoothD_d = d - smoothD
smoothK_k = k - smoothK

h0 = hline(80, "Upper Band", color=#787B86)
hline(50, "Middle Band", color=color.new(#787B86, 50))
h1 = hline(20, "Lower Band", color=#787B86)
fill(h0, h1, color=color.rgb(33, 150, 243, 90), title="Background")

//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_XLMUSDT_15Min_be9210c9(smoothK_k, d_k, k, smoothD_d, rsi1, d, ema2, tema, ema12, ema3, ema1, ema13)

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


