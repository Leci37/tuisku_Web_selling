//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: ADAUSDT_30Min_2ST0_cd9d5e52 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADAUSDT_30Min_2ST0_cd9d5e52", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADAUSDT_30Min_cd9d5e52(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( rsi1 <= 47.191 )
		if( rsi1 <= 33.6117 )
			if( tema <= 0.266629 )
				if( rsi1 <= 10.6998 )
					if( smoothK_k <= 1.17284 )
						if( ema1 <= 0.085452 )
							if( ema2 <= 0.080886 )
								ret := -0.500000
							if( ema2 > 0.080886 )
								ret := -0.714286 // sell
						if( ema1 > 0.085452 )
							if( ema13 <= -0.003019 )
								ret := -0.750000 // sell
							if( ema13 > -0.003019 )
								ret := -0.970588 // sell
					if( smoothK_k > 1.17284 )
						if( tema <= 0.178771 )
							ret := -0.750000 // sell
						if( tema > 0.178771 )
							ret := 0.000000
				if( rsi1 > 10.6998 )
					if( ema12 <= -0.001493 )
						if( smoothK_k <= 2.81791 )
							if( d <= 2.26006 )
								ret := 0.930233 // buy
							if( d > 2.26006 )
								ret := 0.520833
						if( smoothK_k > 2.81791 )
							if( k <= 65.6598 )
								ret := 0.285714
							if( k > 65.6598 )
								ret := -0.256410
					if( ema12 > -0.001493 )
						if( ema1 <= 0.167876 )
							if( smoothD_d <= -0.403682 )
								ret := 0.490566
							if( smoothD_d > -0.403682 )
								ret := -0.025467
						if( ema1 > 0.167876 )
							if( ema2 <= 0.241562 )
								ret := -0.666667
							if( ema2 > 0.241562 )
								ret := -0.260684
			if( tema > 0.266629 )
				if( d_k <= -2.73785 )
					if( ema12 <= -0.006411 )
						if( d <= 4.59887 )
							if( d_k <= -3.26023 )
								ret := -0.747664 // sell
							if( d_k > -3.26023 )
								ret := -0.142857
						if( d > 4.59887 )
							if( rsi1 <= 21.8896 )
								ret := -0.366812
							if( rsi1 > 21.8896 )
								ret := 0.164877
					if( ema12 > -0.006411 )
						if( ema13 <= -0.003011 )
							if( tema <= 0.404801 )
								ret := -0.230620
							if( tema > 0.404801 )
								ret := -0.521290
						if( ema13 > -0.003011 )
							if( tema <= 0.405559 )
								ret := -0.581911
							if( tema > 0.405559 )
								ret := -0.834906 // sell
				if( d_k > -2.73785 )
					if( tema <= 0.45578 )
						if( ema12 <= -0.002026 )
							if( smoothD_d <= 6.04721 )
								ret := -0.513043
							if( smoothD_d > 6.04721 )
								ret := -0.116110
						if( ema12 > -0.002026 )
							if( ema12 <= -2e-05 )
								ret := -0.594606
							if( ema12 > -2e-05 )
								ret := -0.781377 // sell
					if( tema > 0.45578 )
						if( rsi1 <= 23.7371 )
							if( tema <= 0.558189 )
								ret := -0.789231 // sell
							if( tema > 0.558189 )
								ret := -0.888332 // sell
						if( rsi1 > 23.7371 )
							if( ema13 <= -0.001412 )
								ret := -0.674154
							if( ema13 > -0.001412 )
								ret := -0.829596 // sell
		if( rsi1 > 33.6117 )
			if( ema12 <= 8.7e-05 )
				if( d_k <= -5.80156 )
					if( ema12 <= -0.00462 )
						if( ema12 <= -0.007321 )
							if( ema2 <= 1.38673 )
								ret := 0.757576 // buy
							if( ema2 > 1.38673 )
								ret := 0.583144
						if( ema12 > -0.007321 )
							if( ema2 <= 1.3084 )
								ret := 0.450070
							if( ema2 > 1.3084 )
								ret := -0.070423
					if( ema12 > -0.00462 )
						if( ema12 <= -0.001414 )
							if( rsi1 <= 36.8523 )
								ret := -0.302198
							if( rsi1 > 36.8523 )
								ret := 0.193286
						if( ema12 > -0.001414 )
							if( tema <= 0.317121 )
								ret := -0.009615
							if( tema > 0.317121 )
								ret := -0.310234
				if( d_k > -5.80156 )
					if( tema <= 0.465971 )
						if( ema13 <= -0.002738 )
							if( k <= 63.006 )
								ret := 0.277644
							if( k > 63.006 )
								ret := -0.032864
						if( ema13 > -0.002738 )
							if( tema <= 0.31573 )
								ret := 0.037671
							if( tema > 0.31573 )
								ret := -0.153291
					if( tema > 0.465971 )
						if( ema12 <= -0.006281 )
							if( rsi1 <= 37.2247 )
								ret := -0.270156
							if( rsi1 > 37.2247 )
								ret := 0.231884
						if( ema12 > -0.006281 )
							if( rsi1 <= 38.6914 )
								ret := -0.574348
							if( rsi1 > 38.6914 )
								ret := -0.252073
			if( ema12 > 8.7e-05 )
				if( ema12 <= 0.000603 )
					if( tema <= 0.162469 )
						if( smoothD_d <= 12.6357 )
							if( d <= 1.6669 )
								ret := 1.000000 // buy
							if( d > 1.6669 )
								ret := 0.425000
						if( smoothD_d > 12.6357 )
							if( smoothD_d <= 15.3418 )
								ret := -1.000000 // sell
							if( smoothD_d > 15.3418 )
								ret := 0.125000
					if( tema > 0.162469 )
						if( ema13 <= 0.000131 )
							if( d_k <= -13.3269 )
								ret := 0.375000
							if( d_k > -13.3269 )
								ret := -0.711155 // sell
						if( ema13 > 0.000131 )
							if( ema12 <= 0.000351 )
								ret := -0.337376
							if( ema12 > 0.000351 )
								ret := -0.487952
				if( ema12 > 0.000603 )
					if( rsi1 <= 41.8526 )
						if( ema12 <= 0.002617 )
							if( ema13 <= 0.005923 )
								ret := -0.805128 // sell
							if( ema13 > 0.005923 )
								ret := -0.542373
						if( ema12 > 0.002617 )
							if( d <= 0.012839 )
								ret := -0.642857
							if( d > 0.012839 )
								ret := -0.931715 // sell
					if( rsi1 > 41.8526 )
						if( smoothK_k <= 16.9641 )
							if( ema12 <= 0.001129 )
								ret := -0.314607
							if( ema12 > 0.001129 )
								ret := -0.613487
						if( smoothK_k > 16.9641 )
							if( tema <= 0.302666 )
								ret := 0.000000
							if( tema > 0.302666 )
								ret := -0.776339 // sell
	if( rsi1 > 47.191 )
		if( ema12 <= -0.000425 )
			if( rsi1 <= 55.5558 )
				if( ema12 <= -0.002472 )
					if( smoothD_d <= 80.0335 )
						if( ema2 <= 2.75477 )
							if( tema <= 0.339504 )
								ret := -0.066667
							if( tema > 0.339504 )
								ret := 0.786832 // buy
						if( ema2 > 2.75477 )
							if( ema12 <= -0.003645 )
								ret := 0.000000
							if( ema12 > -0.003645 )
								ret := 0.500000
					if( smoothD_d > 80.0335 )
						if( ema12 <= -0.007171 )
							if( tema <= 1.63796 )
								ret := 0.884462 // buy
							if( tema > 1.63796 )
								ret := 0.608696
						if( ema12 > -0.007171 )
							if( ema3 <= 1.18558 )
								ret := 0.557604
							if( ema3 > 1.18558 )
								ret := -0.017751
				if( ema12 > -0.002472 )
					if( rsi1 <= 50.0077 )
						if( smoothK_k <= 77.5473 )
							if( ema1 <= 1.40427 )
								ret := 0.341954
							if( ema1 > 1.40427 )
								ret := -0.162500
						if( smoothK_k > 77.5473 )
							if( ema13 <= -0.00576 )
								ret := -0.630769
							if( ema13 > -0.00576 )
								ret := 0.098446
					if( rsi1 > 50.0077 )
						if( ema12 <= -0.000915 )
							if( ema13 <= -0.005166 )
								ret := 0.229947
							if( ema13 > -0.005166 )
								ret := 0.612409
						if( ema12 > -0.000915 )
							if( smoothK_k <= 84.9392 )
								ret := 0.420712
							if( smoothK_k > 84.9392 )
								ret := 0.053571
			if( rsi1 > 55.5558 )
				if( ema2 <= 0.461573 )
					if( ema13 <= -0.008661 )
						if( d <= 93.0845 )
							if( tema <= 0.298144 )
								ret := 1.000000 // buy
							if( tema > 0.298144 )
								ret := 0.500000
						if( d > 93.0845 )
							if( smoothK_k <= 96.2023 )
								ret := -0.812500 // sell
							if( smoothK_k > 96.2023 )
								ret := 0.625000
					if( ema13 > -0.008661 )
						if( rsi1 <= 63.841 )
							if( d_k <= 4.00216 )
								ret := 0.552096
							if( d_k > 4.00216 )
								ret := 0.827957 // buy
						if( rsi1 > 63.841 )
							if( smoothD_d <= 73.3135 )
								ret := 0.558442
							if( smoothD_d > 73.3135 )
								ret := 0.807339 // buy
				if( ema2 > 0.461573 )
					if( d_k <= -4.09792 )
						if( ema12 <= -0.002946 )
							if( ema3 <= 2.12789 )
								ret := 0.948148 // buy
							if( ema3 > 2.12789 )
								ret := 0.745763 // buy
						if( ema12 > -0.002946 )
							if( ema2 <= 2.57517 )
								ret := 0.807432 // buy
							if( ema2 > 2.57517 )
								ret := 0.272727
					if( d_k > -4.09792 )
						if( rsi1 <= 64.0115 )
							if( smoothD_d <= 94.3379 )
								ret := 0.688462
							if( smoothD_d > 94.3379 )
								ret := 0.457143
						if( rsi1 > 64.0115 )
							if( smoothK_k <= 94.8785 )
								ret := 0.698276
							if( smoothK_k > 94.8785 )
								ret := 0.965986 // buy
		if( ema12 > -0.000425 )
			if( rsi1 <= 60.7869 )
				if( ema12 <= 0.001939 )
					if( rsi1 <= 52.5676 )
						if( k <= 31.5157 )
							if( ema12 <= 0.000463 )
								ret := 0.259526
							if( ema12 > 0.000463 )
								ret := -0.068085
						if( k > 31.5157 )
							if( ema12 <= 0.000402 )
								ret := -0.071859
							if( ema12 > 0.000402 )
								ret := -0.410097
					if( rsi1 > 52.5676 )
						if( ema2 <= 0.488804 )
							if( k <= 20.5755 )
								ret := 0.212304
							if( k > 20.5755 )
								ret := 0.039187
						if( ema2 > 0.488804 )
							if( d <= 78.1597 )
								ret := 0.416420
							if( d > 78.1597 )
								ret := 0.137558
				if( ema12 > 0.001939 )
					if( d_k <= 8.08225 )
						if( rsi1 <= 53.4749 )
							if( ema13 <= 0.00802 )
								ret := -0.593750
							if( ema13 > 0.00802 )
								ret := -0.337368
						if( rsi1 > 53.4749 )
							if( d_k <= -4.89338 )
								ret := 0.185401
							if( d_k > -4.89338 )
								ret := -0.230735
					if( d_k > 8.08225 )
						if( ema12 <= 0.004569 )
							if( rsi1 <= 57.9967 )
								ret := -0.546994
							if( rsi1 > 57.9967 )
								ret := 0.042208
						if( ema12 > 0.004569 )
							if( rsi1 <= 54.2802 )
								ret := -0.830645 // sell
							if( rsi1 > 54.2802 )
								ret := -0.670823
			if( rsi1 > 60.7869 )
				if( d_k <= 2.77599 )
					if( ema3 <= 0.25845 )
						if( ema12 <= 0.000838 )
							if( ema1 <= 0.120932 )
								ret := -0.055432
							if( ema1 > 0.120932 )
								ret := 0.253612
						if( ema12 > 0.000838 )
							if( d_k <= -0.025498 )
								ret := -0.261364
							if( d_k > -0.025498 )
								ret := 0.153543
					if( ema3 > 0.25845 )
						if( k <= 99.3876 )
							if( rsi1 <= 72.6331 )
								ret := 0.419363
							if( rsi1 > 72.6331 )
								ret := 0.708994 // buy
						if( k > 99.3876 )
							if( rsi1 <= 75.7363 )
								ret := 0.632470
							if( rsi1 > 75.7363 )
								ret := 0.881773 // buy
				if( d_k > 2.77599 )
					if( ema13 <= 0.009159 )
						if( rsi1 <= 71.1345 )
							if( ema13 <= 0.00389 )
								ret := 0.347527
							if( ema13 > 0.00389 )
								ret := 0.136943
						if( rsi1 > 71.1345 )
							if( ema3 <= 0.265787 )
								ret := 0.141700
							if( ema3 > 0.265787 )
								ret := 0.690784
					if( ema13 > 0.009159 )
						if( d <= 94.5798 )
							if( smoothD_d <= 61.9685 )
								ret := 0.060764
							if( smoothD_d > 61.9685 )
								ret := -0.239344
						if( d > 94.5798 )
							if( rsi1 <= 72.3951 )
								ret := -0.081081
							if( rsi1 > 72.3951 )
								ret := 0.641975
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_ADAUSDT_30Min_cd9d5e52(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)

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


