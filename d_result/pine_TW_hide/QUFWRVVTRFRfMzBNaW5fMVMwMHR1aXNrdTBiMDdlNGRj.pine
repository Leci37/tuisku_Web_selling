//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: AAVEUSDT_30Min_1S00_0b07e4dc Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAVEUSDT_30Min_1S00_0b07e4dc", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAVEUSDT_30Min_0b07e4dc(rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( rsi1 <= 55.0541 )
		if( d_k <= -4.93527 )
			if( rsi1 <= 41.4934 )
				if( d <= 11.9491 )
					if( d <= 4.6045 )
						if( rsi1 <= 26.826 )
							if( d_k <= -5.06625 )
								ret := -0.878378 // sell
							if( d_k > -5.06625 )
								ret := -0.250000
						if( rsi1 > 26.826 )
							if( rsi1 <= 29.8394 )
								ret := 0.000000
							if( rsi1 > 29.8394 )
								ret := -0.541667
					if( d > 4.6045 )
						if( smoothD_d <= 7.31959 )
							if( smoothD_d <= 3.65989 )
								ret := -0.331507
							if( smoothD_d > 3.65989 )
								ret := -0.114598
						if( smoothD_d > 7.31959 )
							if( rsi1 <= 24.4848 )
								ret := 0.121212
							if( rsi1 > 24.4848 )
								ret := -0.537879
				if( d > 11.9491 )
					if( k <= 89.9147 )
						if( rsi1 <= 30.1988 )
							if( smoothD_d <= 58.796 )
								ret := -0.141314
							if( smoothD_d > 58.796 )
								ret := -0.650794
						if( rsi1 > 30.1988 )
							if( smoothD_d <= 46.5514 )
								ret := 0.133333
							if( smoothD_d > 46.5514 )
								ret := -0.059701
					if( k > 89.9147 )
						if( d_k <= -16.2738 )
							if( k <= 92.7733 )
								ret := 0.250000
							if( k > 92.7733 )
								ret := 0.638655
						if( d_k > -16.2738 )
							if( smoothK_k <= 89.9867 )
								ret := 0.541667
							if( smoothK_k > 89.9867 )
								ret := -0.096447
			if( rsi1 > 41.4934 )
				if( k <= 28.6088 )
					if( d_k <= -11.9019 )
						if( smoothK_k <= 19.5032 )
							if( k <= 22.137 )
								ret := 0.812500 // buy
							if( k > 22.137 )
								ret := 1.000000 // buy
						if( smoothK_k > 19.5032 )
							if( rsi1 <= 53.3881 )
								ret := 0.284483
							if( rsi1 > 53.3881 )
								ret := -0.500000
					if( d_k > -11.9019 )
						if( smoothD_d <= 15.0349 )
							if( d <= 12.8737 )
								ret := 0.001267
							if( d > 12.8737 )
								ret := 0.255034
						if( smoothD_d > 15.0349 )
							if( d_k <= -5.87179 )
								ret := 0.000000
							if( d_k > -5.87179 )
								ret := -0.460317
				if( k > 28.6088 )
					if( k <= 96.9968 )
						if( rsi1 <= 45.6806 )
							if( d_k <= -8.43186 )
								ret := 0.242706
							if( d_k > -8.43186 )
								ret := -0.022472
						if( rsi1 > 45.6806 )
							if( d <= 23.2645 )
								ret := 0.476596
							if( d > 23.2645 )
								ret := 0.278179
					if( k > 96.9968 )
						if( d <= 94.5759 )
							if( d <= 84.8741 )
								ret := 0.580000
							if( d > 84.8741 )
								ret := 0.395543
						if( d > 94.5759 )
							if( d_k <= -5.05375 )
								ret := -0.666667
							if( d_k > -5.05375 )
								ret := 0.250000
		if( d_k > -4.93527 )
			if( rsi1 <= 36.0758 )
				if( k <= 1.20772 )
					if( rsi1 <= 21.1381 )
						if( k <= 0.269716 )
							if( d <= 0.593912 )
								ret := -0.891743 // sell
							if( d > 0.593912 )
								ret := -0.828616 // sell
						if( k > 0.269716 )
							if( k <= 0.333497 )
								ret := -0.333333
							if( k > 0.333497 )
								ret := -0.778646 // sell
					if( rsi1 > 21.1381 )
						if( smoothD_d <= -1.68871 )
							if( rsi1 <= 22.5212 )
								ret := -0.072289
							if( rsi1 > 22.5212 )
								ret := -0.529252
						if( smoothD_d > -1.68871 )
							if( rsi1 <= 28.5705 )
								ret := -0.748670 // sell
							if( rsi1 > 28.5705 )
								ret := -0.632701
				if( k > 1.20772 )
					if( d_k <= 8.52879 )
						if( rsi1 <= 26.0343 )
							if( smoothK_k <= 74.9219 )
								ret := -0.619351
							if( smoothK_k > 74.9219 )
								ret := 0.592593
						if( rsi1 > 26.0343 )
							if( d_k <= -1.08478 )
								ret := -0.279366
							if( d_k > -1.08478 )
								ret := -0.395417
					if( d_k > 8.52879 )
						if( rsi1 <= 24.8062 )
							if( smoothD_d <= 13.6833 )
								ret := -0.692308
							if( smoothD_d > 13.6833 )
								ret := -0.854369 // sell
						if( rsi1 > 24.8062 )
							if( smoothD_d <= 86.2551 )
								ret := -0.627867
							if( smoothD_d > 86.2551 )
								ret := 0.272727
			if( rsi1 > 36.0758 )
				if( d_k <= 5.99594 )
					if( smoothK_k <= 0.998757 )
						if( d <= 0.529183 )
							if( rsi1 <= 39.6304 )
								ret := -0.766667 // sell
							if( rsi1 > 39.6304 )
								ret := -0.428571
						if( d > 0.529183 )
							if( smoothD_d <= -2.15899 )
								ret := -0.186207
							if( smoothD_d > -2.15899 )
								ret := -0.402749
					if( smoothK_k > 0.998757 )
						if( rsi1 <= 44.8818 )
							if( smoothK_k <= 95.0946 )
								ret := -0.184109
							if( smoothK_k > 95.0946 )
								ret := 0.477064
						if( rsi1 > 44.8818 )
							if( k <= 95.3512 )
								ret := -0.007493
							if( k > 95.3512 )
								ret := 0.275229
				if( d_k > 5.99594 )
					if( smoothK_k <= 10.7002 )
						if( d <= 32.0806 )
							if( k <= 5.72724 )
								ret := -0.578740
							if( k > 5.72724 )
								ret := -0.433556
						if( d > 32.0806 )
							if( smoothK_k <= -1.44383 )
								ret := -0.250000
							if( smoothK_k > -1.44383 )
								ret := -0.763251 // sell
					if( smoothK_k > 10.7002 )
						if( rsi1 <= 47.6109 )
							if( d_k <= 13.9267 )
								ret := -0.370968
							if( d_k > 13.9267 )
								ret := -0.512364
						if( rsi1 > 47.6109 )
							if( d_k <= 16.1032 )
								ret := -0.190291
							if( d_k > 16.1032 )
								ret := -0.387302
	if( rsi1 > 55.0541 )
		if( k <= 89.3192 )
			if( rsi1 <= 63.4889 )
				if( smoothK_k <= 70.9597 )
					if( smoothD_d <= 48.2237 )
						if( smoothK_k <= 27.8832 )
							if( rsi1 <= 57.4859 )
								ret := -0.194183
							if( rsi1 > 57.4859 )
								ret := 0.134506
						if( smoothK_k > 27.8832 )
							if( d_k <= -3.05172 )
								ret := 0.477024
							if( d_k > -3.05172 )
								ret := 0.098257
					if( smoothD_d > 48.2237 )
						if( smoothK_k <= 53.8981 )
							if( rsi1 <= 57.2747 )
								ret := -0.425532
							if( rsi1 > 57.2747 )
								ret := -0.095563
						if( smoothK_k > 53.8981 )
							if( smoothD_d <= 61.4181 )
								ret := 0.220859
							if( smoothD_d > 61.4181 )
								ret := -0.057367
				if( smoothK_k > 70.9597 )
					if( d <= 77.8422 )
						if( smoothD_d <= 51.9093 )
							if( k <= 74.8126 )
								ret := 0.500000
							if( k > 74.8126 )
								ret := 0.848485 // buy
						if( smoothD_d > 51.9093 )
							if( rsi1 <= 55.4271 )
								ret := 0.134615
							if( rsi1 > 55.4271 )
								ret := 0.482224
					if( d > 77.8422 )
						if( k <= 82.4488 )
							if( d_k <= 3.846 )
								ret := 0.134199
							if( d_k > 3.846 )
								ret := -0.145086
						if( k > 82.4488 )
							if( d_k <= 1.88781 )
								ret := 0.283133
							if( d_k > 1.88781 )
								ret := 0.085676
			if( rsi1 > 63.4889 )
				if( d_k <= 1.1641 )
					if( d_k <= -5.51437 )
						if( d <= 44.5009 )
							if( d_k <= -14.4786 )
								ret := 0.783959 // buy
							if( d_k > -14.4786 )
								ret := 0.626923
						if( d > 44.5009 )
							if( rsi1 <= 75.0099 )
								ret := 0.530511
							if( rsi1 > 75.0099 )
								ret := 0.757642 // buy
					if( d_k > -5.51437 )
						if( k <= 4.3856 )
							if( rsi1 <= 66.2095 )
								ret := 0.500000
							if( rsi1 > 66.2095 )
								ret := -0.500000
						if( k > 4.3856 )
							if( d <= 52.3702 )
								ret := 0.589018
							if( d > 52.3702 )
								ret := 0.356505
				if( d_k > 1.1641 )
					if( k <= 73.7344 )
						if( rsi1 <= 75.1891 )
							if( smoothD_d <= 47.6158 )
								ret := 0.122574
							if( smoothD_d > 47.6158 )
								ret := -0.053547
						if( rsi1 > 75.1891 )
							if( k <= 68.4583 )
								ret := 0.405904
							if( k > 68.4583 )
								ret := -0.025000
					if( k > 73.7344 )
						if( rsi1 <= 68.362 )
							if( smoothD_d <= 83.3782 )
								ret := -0.084071
							if( smoothD_d > 83.3782 )
								ret := 0.257504
						if( rsi1 > 68.362 )
							if( rsi1 <= 77.9516 )
								ret := 0.339399
							if( rsi1 > 77.9516 )
								ret := 0.517928
		if( k > 89.3192 )
			if( smoothK_k <= 96.0542 )
				if( rsi1 <= 63.2508 )
					if( d <= 86.1351 )
						if( k <= 91.216 )
							if( smoothD_d <= 81.0119 )
								ret := 0.232877
							if( smoothD_d > 81.0119 )
								ret := 0.750000 // buy
						if( k > 91.216 )
							if( rsi1 <= 58.4822 )
								ret := 0.493274
							if( rsi1 > 58.4822 )
								ret := 0.708464 // buy
					if( d > 86.1351 )
						if( d_k <= 4.2796 )
							if( d <= 91.0088 )
								ret := 0.375000
							if( d > 91.0088 )
								ret := 0.176962
						if( d_k > 4.2796 )
							if( rsi1 <= 60.7129 )
								ret := 0.730769 // buy
							if( rsi1 > 60.7129 )
								ret := 0.078947
				if( rsi1 > 63.2508 )
					if( rsi1 <= 83.4194 )
						if( d <= 90.2944 )
							if( k <= 97.6507 )
								ret := 0.673319
							if( k > 97.6507 )
								ret := 0.378378
						if( d > 90.2944 )
							if( smoothD_d <= 94.6764 )
								ret := 0.448191
							if( smoothD_d > 94.6764 )
								ret := 0.649457
					if( rsi1 > 83.4194 )
						if( d <= 93.959 )
							if( k <= 90.5919 )
								ret := 0.659091
							if( k > 90.5919 )
								ret := 0.883817 // buy
						if( d > 93.959 )
							if( d <= 96.1225 )
								ret := 0.486486
							if( d > 96.1225 )
								ret := 0.726337 // buy
			if( smoothK_k > 96.0542 )
				if( rsi1 <= 69.6469 )
					if( smoothD_d <= 94.6633 )
						if( d_k <= -2.5389 )
							if( d_k <= -15.403 )
								ret := 0.786458 // buy
							if( d_k > -15.403 )
								ret := 0.629847
						if( d_k > -2.5389 )
							if( smoothK_k <= 96.1301 )
								ret := 0.600000
							if( smoothK_k > 96.1301 )
								ret := 0.928571 // buy
					if( smoothD_d > 94.6633 )
						if( smoothD_d <= 94.7497 )
							if( smoothK_k <= 96.9746 )
								ret := -0.666667
							if( smoothK_k > 96.9746 )
								ret := 0.000000
						if( smoothD_d > 94.7497 )
							if( rsi1 <= 60.1985 )
								ret := 0.320312
							if( rsi1 > 60.1985 )
								ret := 0.532609
				if( rsi1 > 69.6469 )
					if( rsi1 <= 90.4817 )
						if( d_k <= -4.98531 )
							if( d <= 82.1277 )
								ret := 0.720339 // buy
							if( d > 82.1277 )
								ret := 0.866473 // buy
						if( d_k > -4.98531 )
							if( d <= 95.8232 )
								ret := 0.418440
							if( d > 95.8232 )
								ret := 0.748360 // buy
					if( rsi1 > 90.4817 )
						if( rsi1 <= 92.6222 )
							if( smoothK_k <= 96.2262 )
								ret := 0.500000
							if( smoothK_k > 96.2262 )
								ret := 0.878049 // buy
						if( rsi1 > 92.6222 )
							if( d <= 96.9175 )
								ret := 0.818182 // buy
							if( d > 96.9175 )
								ret := 0.969231 // buy
	
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
float op_operation = decision_tree_0_AAVEUSDT_30Min_0b07e4dc(rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


