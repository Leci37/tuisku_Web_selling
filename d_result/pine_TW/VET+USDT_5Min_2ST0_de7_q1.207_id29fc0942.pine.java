//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: VETUSDT_5Min_2ST0_29fc0942 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_VETUSDT_5Min_2ST0_29fc0942", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_VETUSDT_5Min_29fc0942(smoothK_k, d_k, k, smoothD_d, rsi1, d, ema2, tema, ema12, ema3, ema1, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( rsi1 <= 51.7854 )
		if( ema1 <= 0.019344 )
			if( rsi1 <= 37.4982 )
				if( ema13 <= 8e-06 )
					if( ema12 <= -6.7e-05 )
						if( d <= 92.4633 )
							if( rsi1 <= 24.7807 )
								ret := 0.020833
							if( rsi1 > 24.7807 )
								ret := 0.426667
						if( d > 92.4633 )
							ret := -0.714286 // sell
					if( ema12 > -6.7e-05 )
						if( tema <= 0.018823 )
							if( d_k <= -4.38844 )
								ret := -0.375919
							if( d_k > -4.38844 )
								ret := -0.188998
						if( tema > 0.018823 )
							if( smoothD_d <= 44.4231 )
								ret := -0.355469
							if( smoothD_d > 44.4231 )
								ret := -0.786517 // sell
				if( ema13 > 8e-06 )
					if( ema1 <= 0.017163 )
						if( smoothK_k <= 7.84001 )
							if( ema12 <= 2.9e-05 )
								ret := -0.193727
							if( ema12 > 2.9e-05 )
								ret := -0.420000
						if( smoothK_k > 7.84001 )
							if( ema13 <= 2.8e-05 )
								ret := -0.347305
							if( ema13 > 2.8e-05 )
								ret := -0.672727
					if( ema1 > 0.017163 )
						if( d_k <= 2.63546 )
							if( ema13 <= 0.000229 )
								ret := -0.677758
							if( ema13 > 0.000229 )
								ret := 0.000000
						if( d_k > 2.63546 )
							if( smoothK_k <= 4.43667 )
								ret := -0.328767
							if( smoothK_k > 4.43667 )
								ret := -0.652174
			if( rsi1 > 37.4982 )
				if( ema13 <= 4.3e-05 )
					if( k <= 15.6119 )
						if( ema12 <= 1.4e-05 )
							if( ema2 <= 0.019245 )
								ret := 0.056436
							if( ema2 > 0.019245 )
								ret := 0.526316
						if( ema12 > 1.4e-05 )
							if( rsi1 <= 51.5352 )
								ret := -0.050157
							if( rsi1 > 51.5352 )
								ret := -0.500000
					if( k > 15.6119 )
						if( d_k <= 2.75575 )
							if( ema12 <= -0.000111 )
								ret := 0.875000 // buy
							if( ema12 > -0.000111 )
								ret := -0.109743
						if( d_k > 2.75575 )
							if( ema13 <= 4e-06 )
								ret := 0.030049
							if( ema13 > 4e-06 )
								ret := -0.097270
				if( ema13 > 4.3e-05 )
					if( smoothK_k <= 9.27595 )
						if( ema12 <= 6.9e-05 )
							if( rsi1 <= 48.7467 )
								ret := -0.045603
							if( rsi1 > 48.7467 )
								ret := 0.226190
						if( ema12 > 6.9e-05 )
							if( ema12 <= 0.000143 )
								ret := -0.547170
							if( ema12 > 0.000143 )
								ret := -1.000000 // sell
					if( smoothK_k > 9.27595 )
						if( ema13 <= 0.00012 )
							if( ema12 <= 2.3e-05 )
								ret := -0.186441
							if( ema12 > 2.3e-05 )
								ret := -0.592000
						if( ema13 > 0.00012 )
							if( tema <= 0.016283 )
								ret := -0.625000
							if( tema > 0.016283 )
								ret := -0.937500 // sell
		if( ema1 > 0.019344 )
			if( rsi1 <= 39.5273 )
				if( k <= 26.0156 )
					if( d_k <= 7.09972 )
						if( ema12 <= -2.6e-05 )
							if( ema12 <= -7.6e-05 )
								ret := -0.297118
							if( ema12 > -7.6e-05 )
								ret := -0.492701
						if( ema12 > -2.6e-05 )
							if( ema1 <= 0.022951 )
								ret := -0.540216
							if( ema1 > 0.022951 )
								ret := -0.656808
					if( d_k > 7.09972 )
						if( rsi1 <= 33.6797 )
							if( k <= 6.49455 )
								ret := -0.435609
							if( k > 6.49455 )
								ret := -0.634420
						if( rsi1 > 33.6797 )
							if( ema2 <= 0.025802 )
								ret := -0.354783
							if( ema2 > 0.025802 )
								ret := -0.153140
				if( k > 26.0156 )
					if( rsi1 <= 33.2693 )
						if( d_k <= 2.63038 )
							if( rsi1 <= 27.2662 )
								ret := -0.896119 // sell
							if( rsi1 > 27.2662 )
								ret := -0.794143 // sell
						if( d_k > 2.63038 )
							if( ema12 <= -0.000497 )
								ret := 1.000000 // buy
							if( ema12 > -0.000497 )
								ret := -0.697706
					if( rsi1 > 33.2693 )
						if( ema12 <= -2e-06 )
							if( smoothK_k <= 48.4473 )
								ret := -0.419451
							if( smoothK_k > 48.4473 )
								ret := -0.684801
						if( ema12 > -2e-06 )
							if( ema12 <= 1.5e-05 )
								ret := -0.716263 // sell
							if( ema12 > 1.5e-05 )
								ret := -0.830290 // sell
			if( rsi1 > 39.5273 )
				if( d_k <= -1.34 )
					if( k <= 27.0231 )
						if( rsi1 <= 48.3805 )
							if( ema13 <= 0 )
								ret := 0.145553
							if( ema13 > 0 )
								ret := -0.197487
						if( rsi1 > 48.3805 )
							if( ema12 <= 4e-05 )
								ret := 0.398977
							if( ema12 > 4e-05 )
								ret := 0.102102
					if( k > 27.0231 )
						if( rsi1 <= 48.5402 )
							if( k <= 46.6103 )
								ret := -0.352253
							if( k > 46.6103 )
								ret := -0.542210
						if( rsi1 > 48.5402 )
							if( k <= 92.5846 )
								ret := -0.225545
							if( k > 92.5846 )
								ret := -0.380026
				if( d_k > -1.34 )
					if( d <= 85.4208 )
						if( rsi1 <= 44.9611 )
							if( k <= 16.8144 )
								ret := 0.008986
							if( k > 16.8144 )
								ret := -0.235652
						if( rsi1 > 44.9611 )
							if( ema12 <= -1.6e-05 )
								ret := 0.363199
							if( ema12 > -1.6e-05 )
								ret := 0.056180
					if( d > 85.4208 )
						if( smoothK_k <= 89.6735 )
							if( rsi1 <= 48.46 )
								ret := -0.443466
							if( rsi1 > 48.46 )
								ret := -0.113111
						if( smoothK_k > 89.6735 )
							if( rsi1 <= 50.1995 )
								ret := -0.658564
							if( rsi1 > 50.1995 )
								ret := -0.251282
	if( rsi1 > 51.7854 )
		if( rsi1 <= 62.5006 )
			if( k <= 83.9271 )
				if( d_k <= -5.39666 )
					if( ema12 <= -1.7e-05 )
						if( rsi1 <= 54.1799 )
							if( d_k <= -28.0669 )
								ret := -0.500000
							if( d_k > -28.0669 )
								ret := 0.258427
						if( rsi1 > 54.1799 )
							if( ema12 <= -4.7e-05 )
								ret := 0.772379 // buy
							if( ema12 > -4.7e-05 )
								ret := 0.538593
					if( ema12 > -1.7e-05 )
						if( smoothD_d <= 23.667 )
							if( d_k <= -14.8976 )
								ret := -0.010707
							if( d_k > -14.8976 )
								ret := 0.229167
						if( smoothD_d > 23.667 )
							if( ema12 <= 1.5e-05 )
								ret := 0.076120
							if( ema12 > 1.5e-05 )
								ret := -0.304325
				if( d_k > -5.39666 )
					if( ema2 <= 0.019002 )
						if( ema13 <= 0.000101 )
							if( ema12 <= -1.1e-05 )
								ret := 0.375527
							if( ema12 > -1.1e-05 )
								ret := 0.133149
						if( ema13 > 0.000101 )
							if( rsi1 <= 59.4149 )
								ret := -0.514286
							if( rsi1 > 59.4149 )
								ret := 0.028571
					if( ema2 > 0.019002 )
						if( rsi1 <= 57.8966 )
							if( smoothK_k <= 34.446 )
								ret := 0.448439
							if( smoothK_k > 34.446 )
								ret := 0.256604
						if( rsi1 > 57.8966 )
							if( ema12 <= -1.8e-05 )
								ret := 0.730057 // buy
							if( ema12 > -1.8e-05 )
								ret := 0.531573
			if( k > 83.9271 )
				if( ema13 <= -6.6e-05 )
					if( k <= 98.5128 )
						if( ema12 <= -4.7e-05 )
							if( rsi1 <= 55.7004 )
								ret := 0.092478
							if( rsi1 > 55.7004 )
								ret := 0.385490
						if( ema12 > -4.7e-05 )
							if( ema12 <= -3.4e-05 )
								ret := -0.031068
							if( ema12 > -3.4e-05 )
								ret := -0.535211
					if( k > 98.5128 )
						if( rsi1 <= 56.3884 )
							if( d_k <= -0.004044 )
								ret := -0.277680
							if( d_k > -0.004044 )
								ret := -0.636364
						if( rsi1 > 56.3884 )
							if( tema <= 0.026201 )
								ret := 0.170149
							if( tema > 0.026201 )
								ret := -0.165714
				if( ema13 > -6.6e-05 )
					if( ema1 <= 0.023541 )
						if( k <= 94.7535 )
							if( ema12 <= -1.2e-05 )
								ret := 0.226064
							if( ema12 > -1.2e-05 )
								ret := -0.057428
						if( k > 94.7535 )
							if( ema12 <= -3.9e-05 )
								ret := 0.470588
							if( ema12 > -3.9e-05 )
								ret := -0.148477
					if( ema1 > 0.023541 )
						if( ema12 <= -2.2e-05 )
							if( k <= 89.5058 )
								ret := 0.244582
							if( k > 89.5058 )
								ret := -0.216398
						if( ema12 > -2.2e-05 )
							if( smoothK_k <= 90.1788 )
								ret := -0.366013
							if( smoothK_k > 90.1788 )
								ret := -0.620438
		if( rsi1 > 62.5006 )
			if( ema3 <= 0.019075 )
				if( d_k <= -2.87203 )
					if( rsi1 <= 80.0085 )
						if( ema12 <= -1.4e-05 )
							if( ema3 <= 0.017804 )
								ret := 0.309524
							if( ema3 > 0.017804 )
								ret := 0.686275
						if( ema12 > -1.4e-05 )
							if( k <= 20.3463 )
								ret := 0.542857
							if( k > 20.3463 )
								ret := 0.141531
					if( rsi1 > 80.0085 )
						if( rsi1 <= 80.7304 )
							if( ema3 <= 0.01652 )
								ret := 0.500000
							if( ema3 > 0.01652 )
								ret := 1.000000 // buy
						if( rsi1 > 80.7304 )
							if( ema12 <= 3.7e-05 )
								ret := 0.455556
							if( ema12 > 3.7e-05 )
								ret := 0.000000
				if( d_k > -2.87203 )
					if( ema13 <= -4.8e-05 )
						if( ema1 <= 0.018836 )
							if( ema13 <= -8.3e-05 )
								ret := 0.780000 // buy
							if( ema13 > -8.3e-05 )
								ret := 0.606218
						if( ema1 > 0.018836 )
							if( ema1 <= 0.018883 )
								ret := 0.160000
							if( ema1 > 0.018883 )
								ret := 0.750000 // buy
					if( ema13 > -4.8e-05 )
						if( smoothK_k <= 54.2067 )
							if( ema3 <= 0.015943 )
								ret := 0.156863
							if( ema3 > 0.015943 )
								ret := 0.510744
						if( smoothK_k > 54.2067 )
							if( ema13 <= 1.4e-05 )
								ret := 0.369295
							if( ema13 > 1.4e-05 )
								ret := 0.195611
			if( ema3 > 0.019075 )
				if( k <= 91.1346 )
					if( rsi1 <= 68.9658 )
						if( d_k <= -4.58787 )
							if( ema12 <= -4e-06 )
								ret := 0.622020
							if( ema12 > -4e-06 )
								ret := 0.359293
						if( d_k > -4.58787 )
							if( smoothD_d <= 70.1463 )
								ret := 0.749216 // buy
							if( smoothD_d > 70.1463 )
								ret := 0.583250
					if( rsi1 > 68.9658 )
						if( ema3 <= 0.023259 )
							if( rsi1 <= 75.0011 )
								ret := 0.631654
							if( rsi1 > 75.0011 )
								ret := 0.774194 // buy
						if( ema3 > 0.023259 )
							if( d_k <= -6.60161 )
								ret := 0.698893
							if( d_k > -6.60161 )
								ret := 0.848369 // buy
				if( k > 91.1346 )
					if( ema12 <= -8.3e-05 )
						if( rsi1 <= 67.8251 )
							if( ema1 <= 0.038687 )
								ret := 0.553914
							if( ema1 > 0.038687 )
								ret := 0.377990
						if( rsi1 > 67.8251 )
							if( rsi1 <= 76.1472 )
								ret := 0.757962 // buy
							if( rsi1 > 76.1472 )
								ret := 0.907767 // buy
					if( ema12 > -8.3e-05 )
						if( d_k <= -5.74645 )
							if( smoothK_k <= 92.6464 )
								ret := 0.526940
							if( smoothK_k > 92.6464 )
								ret := 0.372831
						if( d_k > -5.74645 )
							if( ema2 <= 0.034945 )
								ret := 0.633241
							if( ema2 > 0.034945 )
								ret := 0.556701
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_VETUSDT_5Min_29fc0942(smoothK_k, d_k, k, smoothD_d, rsi1, d, ema2, tema, ema12, ema3, ema1, ema13)

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


