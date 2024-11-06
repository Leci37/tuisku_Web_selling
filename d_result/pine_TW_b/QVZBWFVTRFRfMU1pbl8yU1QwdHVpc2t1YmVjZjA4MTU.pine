//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: AVAXUSDT_1Min_2ST0_becf0815 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AVAXUSDT_1Min_2ST0_becf0815", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AVAXUSDT_1Min_becf0815(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( rsi1 <= 45.7786 )
		if( ema1 <= 31.0599 )
			if( d <= 16.1751 )
				if( ema1 <= 23.9849 )
					if( ema3 <= 18.7862 )
						if( ema1 <= 18.425 )
							if( ema3 <= 18.0644 )
								ret := 0.952381 // buy
							if( ema3 > 18.0644 )
								ret := -0.380282
						if( ema1 > 18.425 )
							if( k <= 2.54573 )
								ret := 1.000000 // buy
							if( k > 2.54573 )
								ret := 0.606061
					if( ema3 > 18.7862 )
						if( ema2 <= 19.3521 )
							if( ema12 <= -0.095931 )
								ret := 1.000000 // buy
							if( ema12 > -0.095931 )
								ret := -0.517588
						if( ema2 > 19.3521 )
							if( ema13 <= -0.157586 )
								ret := 0.769231 // buy
							if( ema13 > -0.157586 )
								ret := -0.005597
				if( ema1 > 23.9849 )
					if( d <= 0.779582 )
						if( ema12 <= 0.001645 )
							if( ema13 <= -0.132978 )
								ret := 0.835821 // buy
							if( ema13 > -0.132978 )
								ret := 0.096393
						if( ema12 > 0.001645 )
							if( ema1 <= 25.7745 )
								ret := 0.452874
							if( ema1 > 25.7745 )
								ret := 0.269434
					if( d > 0.779582 )
						if( rsi1 <= 23.7062 )
							if( d_k <= 3.50579 )
								ret := 0.041836
							if( d_k > 3.50579 )
								ret := -0.212524
						if( rsi1 > 23.7062 )
							if( ema1 <= 26.8392 )
								ret := 0.153152
							if( ema1 > 26.8392 )
								ret := 0.061084
			if( d > 16.1751 )
				if( d <= 74.8242 )
					if( d_k <= 4.77595 )
						if( ema2 <= 30.1561 )
							if( ema13 <= 0.02782 )
								ret := 0.051402
							if( ema13 > 0.02782 )
								ret := -0.089635
						if( ema2 > 30.1561 )
							if( d_k <= -19.7242 )
								ret := -0.741176 // sell
							if( d_k > -19.7242 )
								ret := -0.278481
					if( d_k > 4.77595 )
						if( ema3 <= 24.0773 )
							if( smoothD_d <= 69.9806 )
								ret := -0.026039
							if( smoothD_d > 69.9806 )
								ret := 0.348485
						if( ema3 > 24.0773 )
							if( ema1 <= 29.8995 )
								ret := -0.134496
							if( ema1 > 29.8995 )
								ret := 0.127090
				if( d > 74.8242 )
					if( ema1 <= 23.7139 )
						if( ema12 <= -0.024832 )
							if( rsi1 <= 45.064 )
								ret := -0.370130
							if( rsi1 > 45.064 )
								ret := 0.220000
						if( ema12 > -0.024832 )
							if( ema12 <= 0.012372 )
								ret := 0.139294
							if( ema12 > 0.012372 )
								ret := -0.092727
					if( ema1 > 23.7139 )
						if( ema3 <= 26.3224 )
							if( d_k <= -1.52768 )
								ret := -0.184336
							if( d_k > -1.52768 )
								ret := -0.393775
						if( ema3 > 26.3224 )
							if( ema2 <= 29.2872 )
								ret := -0.137493
							if( ema2 > 29.2872 )
								ret := -0.356808
		if( ema1 > 31.0599 )
			if( rsi1 <= 33.3189 )
				if( ema13 <= -0.120415 )
					if( k <= 4.03567 )
						if( ema2 <= 37.6084 )
							if( smoothD_d <= 2.20068 )
								ret := -0.765957 // sell
							if( smoothD_d > 2.20068 )
								ret := 0.625000
						if( ema2 > 37.6084 )
							if( ema13 <= -0.206904 )
								ret := 0.705882 // buy
							if( ema13 > -0.206904 )
								ret := -0.182927
					if( k > 4.03567 )
						if( rsi1 <= 15.852 )
							if( d <= 27.2496 )
								ret := -0.623762
							if( d > 27.2496 )
								ret := -0.033333
						if( rsi1 > 15.852 )
							if( d <= 62.7074 )
								ret := 0.360000
							if( d > 62.7074 )
								ret := -0.202532
				if( ema13 > -0.120415 )
					if( ema1 <= 32.4627 )
						if( d_k <= -0.498925 )
							if( smoothK_k <= 8.33614 )
								ret := -0.262673
							if( smoothK_k > 8.33614 )
								ret := -0.611231
						if( d_k > -0.498925 )
							if( d_k <= 10.3365 )
								ret := -0.015798
							if( d_k > 10.3365 )
								ret := 0.357143
					if( ema1 > 32.4627 )
						if( ema13 <= -0.05341 )
							if( k <= 34.4284 )
								ret := -0.213896
							if( k > 34.4284 )
								ret := -0.582734
						if( ema13 > -0.05341 )
							if( k <= 12.4647 )
								ret := -0.444367
							if( k > 12.4647 )
								ret := -0.621726
			if( rsi1 > 33.3189 )
				if( ema12 <= -0.019853 )
					if( d <= 71.0651 )
						if( rsi1 <= 41.8823 )
							if( ema13 <= -0.089827 )
								ret := 0.568182
							if( ema13 > -0.089827 )
								ret := 0.088672
						if( rsi1 > 41.8823 )
							if( smoothD_d <= 26.9939 )
								ret := 0.629167
							if( smoothD_d > 26.9939 )
								ret := 0.340845
					if( d > 71.0651 )
						if( ema3 <= 35.6207 )
							if( d_k <= 16.4157 )
								ret := -0.621291
							if( d_k > 16.4157 )
								ret := 0.740741 // buy
						if( ema3 > 35.6207 )
							if( smoothK_k <= 94.7233 )
								ret := -0.238179
							if( smoothK_k > 94.7233 )
								ret := 0.324074
				if( ema12 > -0.019853 )
					if( smoothK_k <= 18.8994 )
						if( ema1 <= 35.9108 )
							if( smoothK_k <= 3.10503 )
								ret := 0.253450
							if( smoothK_k > 3.10503 )
								ret := -0.003594
						if( ema1 > 35.9108 )
							if( ema12 <= -0.004884 )
								ret := -0.059777
							if( ema12 > -0.004884 )
								ret := -0.364211
					if( smoothK_k > 18.8994 )
						if( rsi1 <= 41.1728 )
							if( ema12 <= -0.005033 )
								ret := -0.318182
							if( ema12 > -0.005033 )
								ret := -0.481802
						if( rsi1 > 41.1728 )
							if( ema12 <= -0.000732 )
								ret := -0.132743
							if( ema12 > -0.000732 )
								ret := -0.443756
	if( rsi1 > 45.7786 )
		if( tema <= 31.5119 )
			if( smoothD_d <= 60.4758 )
				if( smoothD_d <= 6.48022 )
					if( tema <= 23.6011 )
						if( k <= 16.3568 )
							if( ema12 <= 0.050182 )
								ret := 0.063201
							if( ema12 > 0.050182 )
								ret := 0.626506
						if( k > 16.3568 )
							if( ema12 <= -0.014366 )
								ret := -0.734694 // sell
							if( ema12 > -0.014366 )
								ret := -0.245614
					if( tema > 23.6011 )
						if( ema3 <= 25.5042 )
							if( d_k <= -11.1514 )
								ret := -0.478261
							if( d_k > -11.1514 )
								ret := 0.420168
						if( ema3 > 25.5042 )
							if( ema3 <= 29.1013 )
								ret := 0.166250
							if( ema3 > 29.1013 )
								ret := 0.437624
				if( smoothD_d > 6.48022 )
					if( d_k <= -3.12017 )
						if( ema3 <= 23.2814 )
							if( smoothD_d <= 8.13367 )
								ret := -0.410714
							if( smoothD_d > 8.13367 )
								ret := -0.005509
						if( ema3 > 23.2814 )
							if( tema <= 28.1139 )
								ret := 0.158889
							if( tema > 28.1139 )
								ret := 0.016936
					if( d_k > -3.12017 )
						if( ema3 <= 29.3275 )
							if( rsi1 <= 68.5707 )
								ret := -0.009038
							if( rsi1 > 68.5707 )
								ret := 0.121891
						if( ema3 > 29.3275 )
							if( ema1 <= 30.6353 )
								ret := 0.183137
							if( ema1 > 30.6353 )
								ret := 0.468254
			if( smoothD_d > 60.4758 )
				if( ema1 <= 23.8534 )
					if( ema13 <= 0.006916 )
						if( ema2 <= 21.0399 )
							if( smoothK_k <= 94.591 )
								ret := 0.105296
							if( smoothK_k > 94.591 )
								ret := 0.334056
						if( ema2 > 21.0399 )
							if( d_k <= 5.72279 )
								ret := 0.058967
							if( d_k > 5.72279 )
								ret := -0.070588
					if( ema13 > 0.006916 )
						if( ema3 <= 20.4228 )
							if( d_k <= 4.17817 )
								ret := -0.221122
							if( d_k > 4.17817 )
								ret := -0.546468
						if( ema3 > 20.4228 )
							if( ema2 <= 22.8816 )
								ret := -0.061803
							if( ema2 > 22.8816 )
								ret := 0.065417
				if( ema1 > 23.8534 )
					if( d_k <= -13.3136 )
						if( ema2 <= 29.8748 )
							if( ema12 <= -0.0332 )
								ret := 0.475758
							if( ema12 > -0.0332 )
								ret := 0.151981
						if( ema2 > 29.8748 )
							if( smoothD_d <= 77.157 )
								ret := -0.483516
							if( smoothD_d > 77.157 )
								ret := 0.033333
					if( d_k > -13.3136 )
						if( d_k <= 13.543 )
							if( smoothD_d <= 96.0786 )
								ret := -0.103215
							if( smoothD_d > 96.0786 )
								ret := -0.224537
						if( d_k > 13.543 )
							if( ema1 <= 30.4182 )
								ret := 0.009585
							if( ema1 > 30.4182 )
								ret := 0.660550
		if( tema > 31.5119 )
			if( rsi1 <= 59.1105 )
				if( ema12 <= 0.000652 )
					if( ema2 <= 35.832 )
						if( smoothK_k <= 83.6006 )
							if( d_k <= 6.37278 )
								ret := -0.012669
							if( d_k > 6.37278 )
								ret := 0.479798
						if( smoothK_k > 83.6006 )
							if( k <= 95.6714 )
								ret := -0.138739
							if( k > 95.6714 )
								ret := -0.516949
					if( ema2 > 35.832 )
						if( ema12 <= -0.015735 )
							if( smoothK_k <= 32.4652 )
								ret := 0.752525 // buy
							if( smoothK_k > 32.4652 )
								ret := 0.399649
						if( ema12 > -0.015735 )
							if( rsi1 <= 53.3497 )
								ret := 0.146199
							if( rsi1 > 53.3497 )
								ret := 0.400605
				if( ema12 > 0.000652 )
					if( smoothK_k <= 23.624 )
						if( tema <= 36.4431 )
							if( smoothK_k <= 3.04544 )
								ret := 0.440299
							if( smoothK_k > 3.04544 )
								ret := 0.125000
						if( tema > 36.4431 )
							if( ema13 <= 0.062764 )
								ret := -0.016322
							if( ema13 > 0.062764 )
								ret := -0.415755
					if( smoothK_k > 23.624 )
						if( rsi1 <= 52.9248 )
							if( ema12 <= 0.012867 )
								ret := -0.319368
							if( ema12 > 0.012867 )
								ret := -0.503409
						if( rsi1 > 52.9248 )
							if( ema12 <= 0.026154 )
								ret := -0.023965
							if( ema12 > 0.026154 )
								ret := -0.392857
			if( rsi1 > 59.1105 )
				if( ema12 <= 0.047316 )
					if( rsi1 <= 75.049 )
						if( smoothK_k <= 82.4775 )
							if( ema12 <= 0.017296 )
								ret := 0.518959
							if( ema12 > 0.017296 )
								ret := 0.270805
						if( smoothK_k > 82.4775 )
							if( ema3 <= 32.7481 )
								ret := -0.107966
							if( ema3 > 32.7481 )
								ret := 0.299027
					if( rsi1 > 75.049 )
						if( ema3 <= 34.8515 )
							if( d_k <= -1.36419 )
								ret := 0.160377
							if( d_k > -1.36419 )
								ret := 0.562777
						if( ema3 > 34.8515 )
							if( rsi1 <= 77.7857 )
								ret := 0.497227
							if( rsi1 > 77.7857 )
								ret := 0.684003
				if( ema12 > 0.047316 )
					if( d_k <= 2.41469 )
						if( rsi1 <= 84.9186 )
							if( ema13 <= 0.167276 )
								ret := 0.233936
							if( ema13 > 0.167276 )
								ret := -0.285714
						if( rsi1 > 84.9186 )
							if( ema1 <= 34.647 )
								ret := 0.000000
							if( ema1 > 34.647 )
								ret := 0.664141
					if( d_k > 2.41469 )
						if( smoothD_d <= 39.7953 )
							if( ema3 <= 39.6824 )
								ret := 0.518135
							if( ema3 > 39.6824 )
								ret := -0.666667
						if( smoothD_d > 39.7953 )
							if( ema3 <= 35.8567 )
								ret := -0.029940
							if( ema3 > 35.8567 )
								ret := -0.498192
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_AVAXUSDT_1Min_becf0815(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)

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


