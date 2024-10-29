//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: BNBUSDT_30Min_1S00_a51af8ba Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BNBUSDT_30Min_1S00_a51af8ba", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BNBUSDT_30Min_a51af8ba(rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( rsi1 <= 42.2057 )
		if( d_k <= -2.39652 )
			if( rsi1 <= 29.6592 )
				if( d <= 8.89391 )
					if( d_k <= -2.42937 )
						if( smoothD_d <= 0.391286 )
							if( rsi1 <= 16.9287 )
								ret := -0.954545 // sell
							if( rsi1 > 16.9287 )
								ret := -0.631818
						if( smoothD_d > 0.391286 )
							if( d_k <= -2.61056 )
								ret := -0.526316
							if( d_k > -2.61056 )
								ret := -0.045455
					if( d_k > -2.42937 )
						if( smoothD_d <= 1.47451 )
							if( d_k <= -2.40862 )
								ret := 0.500000
							if( d_k > -2.40862 )
								ret := -0.750000 // sell
						if( smoothD_d > 1.47451 )
							ret := 1.000000 // buy
				if( d > 8.89391 )
					if( smoothD_d <= 44.586 )
						if( d <= 40.5562 )
							if( d <= 34.6745 )
								ret := -0.145543
							if( d > 34.6745 )
								ret := -0.627273
						if( d > 40.5562 )
							if( smoothK_k <= 55.5398 )
								ret := 0.590909
							if( smoothK_k > 55.5398 )
								ret := -0.631579
					if( smoothD_d > 44.586 )
						if( d_k <= -13.5192 )
							if( rsi1 <= 27.4773 )
								ret := -0.375000
							if( rsi1 > 27.4773 )
								ret := 0.266667
						if( d_k > -13.5192 )
							if( d_k <= -6.60858 )
								ret := -0.647059
							if( d_k > -6.60858 )
								ret := -0.896226 // sell
			if( rsi1 > 29.6592 )
				if( smoothD_d <= 4.05212 )
					if( d <= 3.70014 )
						if( d_k <= -2.55943 )
							if( rsi1 <= 32.5653 )
								ret := -0.241379
							if( rsi1 > 32.5653 )
								ret := -0.621212
						if( d_k > -2.55943 )
							if( k <= 5.19849 )
								ret := -0.500000
							if( k > 5.19849 )
								ret := 0.272727
					if( d > 3.70014 )
						if( d_k <= -5.40676 )
							if( k <= 12.4563 )
								ret := -0.478873
							if( k > 12.4563 )
								ret := -0.197531
						if( d_k > -5.40676 )
							if( d <= 5.72603 )
								ret := 0.040268
							if( d > 5.72603 )
								ret := -0.262887
				if( smoothD_d > 4.05212 )
					if( rsi1 <= 34.7336 )
						if( smoothD_d <= 42.684 )
							if( smoothD_d <= 20.6846 )
								ret := -0.104839
							if( smoothD_d > 20.6846 )
								ret := 0.080439
						if( smoothD_d > 42.684 )
							if( d_k <= -24.6214 )
								ret := 0.542857
							if( d_k > -24.6214 )
								ret := -0.296296
					if( rsi1 > 34.7336 )
						if( d <= 89.6151 )
							if( k <= 94.7888 )
								ret := 0.082244
							if( k > 94.7888 )
								ret := 0.719626 // buy
						if( d > 89.6151 )
							if( d <= 90.89 )
								ret := -0.703704 // sell
							if( d > 90.89 )
								ret := -0.207317
		if( d_k > -2.39652 )
			if( smoothK_k <= -2.30283 )
				if( rsi1 <= 29.2146 )
					if( d <= 0.15435 )
						if( rsi1 <= 13.2545 )
							if( rsi1 <= 8.16815 )
								ret := -0.898734 // sell
							if( rsi1 > 8.16815 )
								ret := -0.984848 // sell
						if( rsi1 > 13.2545 )
							if( rsi1 <= 13.454 )
								ret := 0.000000
							if( rsi1 > 13.454 )
								ret := -0.832962 // sell
					if( d > 0.15435 )
						if( rsi1 <= 16.9087 )
							if( smoothD_d <= -1.90795 )
								ret := -0.737288 // sell
							if( smoothD_d > -1.90795 )
								ret := -0.920000 // sell
						if( rsi1 > 16.9087 )
							if( smoothD_d <= -0.376895 )
								ret := -0.610548
							if( smoothD_d > -0.376895 )
								ret := -0.792023 // sell
				if( rsi1 > 29.2146 )
					if( smoothD_d <= 4.74774 )
						if( smoothD_d <= -1.25993 )
							if( k <= 0.080847 )
								ret := -0.661765
							if( k > 0.080847 )
								ret := -0.403670
						if( smoothD_d > -1.25993 )
							if( rsi1 <= 35.0397 )
								ret := -0.524823
							if( rsi1 > 35.0397 )
								ret := -0.259868
					if( smoothD_d > 4.74774 )
						if( d_k <= 15.1484 )
							if( rsi1 <= 41.8251 )
								ret := -0.763158 // sell
							if( rsi1 > 41.8251 )
								ret := -0.111111
						if( d_k > 15.1484 )
							if( rsi1 <= 34.3102 )
								ret := -0.666667
							if( rsi1 > 34.3102 )
								ret := -0.191176
			if( smoothK_k > -2.30283 )
				if( smoothD_d <= 90.3679 )
					if( rsi1 <= 29.8658 )
						if( d <= 19.6884 )
							if( k <= 8.14293 )
								ret := -0.651679
							if( k > 8.14293 )
								ret := -0.458891
						if( d > 19.6884 )
							if( rsi1 <= 23.8059 )
								ret := -0.815756 // sell
							if( rsi1 > 23.8059 )
								ret := -0.659534
					if( rsi1 > 29.8658 )
						if( d_k <= 5.4163 )
							if( rsi1 <= 39.2993 )
								ret := -0.368465
							if( rsi1 > 39.2993 )
								ret := -0.166554
						if( d_k > 5.4163 )
							if( smoothK_k <= -1.99209 )
								ret := 0.076923
							if( smoothK_k > -1.99209 )
								ret := -0.539625
				if( smoothD_d > 90.3679 )
					if( smoothD_d <= 94.7683 )
						if( smoothK_k <= 93.2346 )
							if( smoothK_k <= 88.8113 )
								ret := -0.303030
							if( smoothK_k > 88.8113 )
								ret := 0.202247
						if( smoothK_k > 93.2346 )
							if( k <= 98.0465 )
								ret := -0.857143 // sell
							if( k > 98.0465 )
								ret := 0.000000
					if( smoothD_d > 94.7683 )
						if( smoothK_k <= 95.259 )
							if( rsi1 <= 37.7526 )
								ret := 0.500000
							if( rsi1 > 37.7526 )
								ret := 1.000000 // buy
						if( smoothK_k > 95.259 )
							if( d_k <= -0.645796 )
								ret := 0.384615
							if( d_k > -0.645796 )
								ret := -0.400000
	if( rsi1 > 42.2057 )
		if( d_k <= 4.02947 )
			if( rsi1 <= 62.1663 )
				if( k <= 13.3296 )
					if( smoothK_k <= -2.78722 )
						if( rsi1 <= 44.0057 )
							if( d <= 0.014027 )
								ret := -0.612903
							if( d > 0.014027 )
								ret := 0.241379
						if( rsi1 > 44.0057 )
							if( rsi1 <= 45.5541 )
								ret := -0.860465 // sell
							if( rsi1 > 45.5541 )
								ret := -0.400000
					if( smoothK_k > -2.78722 )
						if( rsi1 <= 45.0155 )
							if( smoothK_k <= -1.6178 )
								ret := 0.500000
							if( smoothK_k > -1.6178 )
								ret := -0.267442
						if( rsi1 > 45.0155 )
							if( d <= 2.13224 )
								ret := -0.358491
							if( d > 2.13224 )
								ret := -0.054465
				if( k > 13.3296 )
					if( rsi1 <= 50.0001 )
						if( k <= 24.1931 )
							if( smoothD_d <= 17.7892 )
								ret := 0.070073
							if( smoothD_d > 17.7892 )
								ret := -0.205882
						if( k > 24.1931 )
							if( d <= 68.5263 )
								ret := 0.220930
							if( d > 68.5263 )
								ret := 0.081203
					if( rsi1 > 50.0001 )
						if( k <= 99.6116 )
							if( d <= 83.9942 )
								ret := 0.330135
							if( d > 83.9942 )
								ret := 0.178691
						if( k > 99.6116 )
							if( d_k <= -4.17649 )
								ret := 0.689516
							if( d_k > -4.17649 )
								ret := 0.323607
			if( rsi1 > 62.1663 )
				if( smoothK_k <= 91.6803 )
					if( d_k <= -10.2175 )
						if( k <= 27.9634 )
							if( d_k <= -13.9876 )
								ret := -0.578947
							if( d_k > -13.9876 )
								ret := 0.314286
						if( k > 27.9634 )
							if( rsi1 <= 64.8359 )
								ret := 0.492519
							if( rsi1 > 64.8359 )
								ret := 0.654244
					if( d_k > -10.2175 )
						if( smoothK_k <= -2.80599 )
							if( d <= 1.7765 )
								ret := -0.444444
							if( d > 1.7765 )
								ret := -0.904762 // sell
						if( smoothK_k > -2.80599 )
							if( rsi1 <= 69.7564 )
								ret := 0.356239
							if( rsi1 > 69.7564 )
								ret := 0.488581
				if( smoothK_k > 91.6803 )
					if( k <= 99.4288 )
						if( rsi1 <= 82.8328 )
							if( rsi1 <= 70.782 )
								ret := 0.461240
							if( rsi1 > 70.782 )
								ret := 0.587094
						if( rsi1 > 82.8328 )
							if( smoothD_d <= 96.312 )
								ret := 0.773196 // buy
							if( smoothD_d > 96.312 )
								ret := 0.407407
					if( k > 99.4288 )
						if( k <= 100 )
							if( d_k <= -1.16135 )
								ret := 0.839344 // buy
							if( d_k > -1.16135 )
								ret := 0.595181
						if( k > 100 )
							if( rsi1 <= 77.5374 )
								ret := 0.566770
							if( rsi1 > 77.5374 )
								ret := 0.756233 // buy
		if( d_k > 4.02947 )
			if( rsi1 <= 62.0534 )
				if( d_k <= 9.89111 )
					if( k <= 9.84624 )
						if( d <= 11.0206 )
							if( rsi1 <= 49.3164 )
								ret := -0.423333
							if( rsi1 > 49.3164 )
								ret := 0.030769
						if( d > 11.0206 )
							if( smoothD_d <= 9.46459 )
								ret := -0.554913
							if( smoothD_d > 9.46459 )
								ret := -0.347458
					if( k > 9.84624 )
						if( k <= 89.1578 )
							if( rsi1 <= 51.1859 )
								ret := -0.188602
							if( rsi1 > 51.1859 )
								ret := -0.080543
						if( k > 89.1578 )
							if( d <= 95.1871 )
								ret := -0.075949
							if( d > 95.1871 )
								ret := 0.267943
				if( d_k > 9.89111 )
					if( rsi1 <= 54.1459 )
						if( d_k <= 20.2512 )
							if( d <= 21.7689 )
								ret := -0.479201
							if( d > 21.7689 )
								ret := -0.335067
						if( d_k > 20.2512 )
							if( k <= 15.9858 )
								ret := -0.355882
							if( k > 15.9858 )
								ret := -0.614481
					if( rsi1 > 54.1459 )
						if( smoothD_d <= 80.3946 )
							if( d <= 75.9758 )
								ret := -0.255339
							if( d > 75.9758 )
								ret := -0.419512
						if( smoothD_d > 80.3946 )
							if( d <= 83.7197 )
								ret := 0.700000 // buy
							if( d > 83.7197 )
								ret := -0.059480
			if( rsi1 > 62.0534 )
				if( rsi1 <= 78.8411 )
					if( rsi1 <= 68.4559 )
						if( smoothD_d <= 7.78442 )
							if( k <= 0.106671 )
								ret := 0.000000
							if( k > 0.106671 )
								ret := -0.692308
						if( smoothD_d > 7.78442 )
							if( d_k <= 11.8779 )
								ret := 0.085086
							if( d_k > 11.8779 )
								ret := -0.097601
					if( rsi1 > 68.4559 )
						if( smoothK_k <= 2.58113 )
							if( d_k <= 13.0808 )
								ret := 0.029412
							if( d_k > 13.0808 )
								ret := -0.562500
						if( smoothK_k > 2.58113 )
							if( smoothD_d <= 46.9907 )
								ret := 0.455414
							if( smoothD_d > 46.9907 )
								ret := 0.174300
				if( rsi1 > 78.8411 )
					if( k <= 76.2961 )
						if( smoothK_k <= 71.8833 )
							if( d_k <= 5.98049 )
								ret := 0.050000
							if( d_k > 5.98049 )
								ret := 0.613861
						if( smoothK_k > 71.8833 )
							if( rsi1 <= 81.0604 )
								ret := 0.444444
							if( rsi1 > 81.0604 )
								ret := -0.647059
					if( k > 76.2961 )
						if( smoothK_k <= 87.5282 )
							if( rsi1 <= 79.28 )
								ret := 0.100000
							if( rsi1 > 79.28 )
								ret := 0.696970
						if( smoothK_k > 87.5282 )
							if( smoothK_k <= 88.7656 )
								ret := 0.187500
							if( smoothK_k > 88.7656 )
								ret := 0.551724
	
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
float op_operation = decision_tree_0_BNBUSDT_30Min_a51af8ba(rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


