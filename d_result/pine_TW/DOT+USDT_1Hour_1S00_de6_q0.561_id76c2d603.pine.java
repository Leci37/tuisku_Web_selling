//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: DOTUSDT_1Hour_1S00_76c2d603 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOTUSDT_1Hour_1S00_76c2d603", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOTUSDT_1Hour_76c2d603(d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( d_k <= -0.716383 )
		if( rsi1 <= 48.4085 )
			if( smoothD_d <= 55.124 )
				if( d_k <= -8.99049 )
					if( k <= 70.7045 )
						if( d_k <= -22.9316 )
							ret := 0.538012
						if( d_k > -22.9316 )
							ret := 0.193966
					if( k > 70.7045 )
						if( k <= 73.0938 )
							ret := -0.493506
						if( k > 73.0938 )
							ret := 0.181818
				if( d_k > -8.99049 )
					if( d <= 11.9877 )
						if( d_k <= -1.37982 )
							ret := 0.181460
						if( d_k > -1.37982 )
							ret := -0.085106
					if( d > 11.9877 )
						if( rsi1 <= 31.9262 )
							ret := -0.305665
						if( rsi1 > 31.9262 )
							ret := -0.000987
			if( smoothD_d > 55.124 )
				if( rsi1 <= 41.7311 )
					if( smoothK_k <= 64.0808 )
						if( rsi1 <= 36.3146 )
							ret := -0.142857
						if( rsi1 > 36.3146 )
							ret := -0.763158 // sell
					if( smoothK_k > 64.0808 )
						if( smoothK_k <= 71.8465 )
							ret := 0.076923
						if( smoothK_k > 71.8465 )
							ret := -0.298701
				if( rsi1 > 41.7311 )
					if( k <= 68.9744 )
						if( d <= 62.6021 )
							ret := -0.657895
						if( d > 62.6021 )
							ret := -0.222222
					if( k > 68.9744 )
						if( smoothK_k <= 66.1355 )
							ret := 0.900000 // buy
						if( smoothK_k > 66.1355 )
							ret := 0.016423
		if( rsi1 > 48.4085 )
			if( d_k <= -6.83862 )
				if( rsi1 <= 61.6013 )
					if( k <= 45.6397 )
						if( smoothK_k <= 20.4411 )
							ret := 0.675676
						if( smoothK_k > 20.4411 )
							ret := 0.356413
					if( k > 45.6397 )
						if( smoothK_k <= 46.5076 )
							ret := -0.262887
						if( smoothK_k > 46.5076 )
							ret := 0.184593
				if( rsi1 > 61.6013 )
					if( smoothD_d <= 16.1838 )
						if( smoothD_d <= 4.17464 )
							ret := 0.222222
						if( smoothD_d > 4.17464 )
							ret := 0.860000 // buy
					if( smoothD_d > 16.1838 )
						if( k <= 33.5303 )
							ret := -0.763158 // sell
						if( k > 33.5303 )
							ret := 0.425539
			if( d_k > -6.83862 )
				if( d <= 93.7276 )
					if( rsi1 <= 75.2 )
						if( smoothD_d <= -1.06271 )
							ret := -0.428571
						if( smoothD_d > -1.06271 )
							ret := 0.140903
					if( rsi1 > 75.2 )
						if( d <= 81.052 )
							ret := 0.642276
						if( d > 81.052 )
							ret := 0.246429
				if( d > 93.7276 )
					if( k <= 97.0789 )
						if( rsi1 <= 66.3898 )
							ret := 0.856250 // buy
						if( rsi1 > 66.3898 )
							ret := 0.142857
					if( k > 97.0789 )
						if( rsi1 <= 77.2126 )
							ret := 0.295711
						if( rsi1 > 77.2126 )
							ret := 0.563518
	if( d_k > -0.716383 )
		if( rsi1 <= 52.426 )
			if( rsi1 <= 36.7999 )
				if( rsi1 <= 25.6357 )
					if( smoothD_d <= 33.5376 )
						if( d <= 0.043003 )
							ret := -0.052632
						if( d > 0.043003 )
							ret := -0.501832
					if( smoothD_d > 33.5376 )
						if( k <= 58.5227 )
							ret := -0.841549 // sell
						if( k > 58.5227 )
							ret := -0.444444
				if( rsi1 > 25.6357 )
					if( d_k <= 4.66308 )
						if( rsi1 <= 29.0756 )
							ret := -0.411672
						if( rsi1 > 29.0756 )
							ret := -0.175838
					if( d_k > 4.66308 )
						if( d_k <= 14.1832 )
							ret := -0.381818
						if( d_k > 14.1832 )
							ret := -0.524625
			if( rsi1 > 36.7999 )
				if( smoothD_d <= 50.819 )
					if( k <= 27.5652 )
						if( smoothK_k <= 22.1968 )
							ret := -0.109973
						if( smoothK_k > 22.1968 )
							ret := -0.527426
					if( k > 27.5652 )
						if( smoothK_k <= 27.1022 )
							ret := 0.316583
						if( smoothK_k > 27.1022 )
							ret := -0.005924
				if( smoothD_d > 50.819 )
					if( d_k <= 12.7286 )
						if( rsi1 <= 40.842 )
							ret := -0.463362
						if( rsi1 > 40.842 )
							ret := -0.149088
					if( d_k > 12.7286 )
						if( k <= 53.6803 )
							ret := -0.569007
						if( k > 53.6803 )
							ret := -0.356364
		if( rsi1 > 52.426 )
			if( rsi1 <= 76.5499 )
				if( d <= 75.1666 )
					if( d_k <= 16.494 )
						if( d <= 4.63524 )
							ret := -0.455446
						if( d > 4.63524 )
							ret := 0.165089
					if( d_k > 16.494 )
						if( smoothK_k <= 17.9164 )
							ret := 0.086207
						if( smoothK_k > 17.9164 )
							ret := -0.203911
				if( d > 75.1666 )
					if( d_k <= 2.12176 )
						if( smoothK_k <= 92.4435 )
							ret := 0.196639
						if( smoothK_k > 92.4435 )
							ret := 0.019473
					if( d_k > 2.12176 )
						if( smoothD_d <= 90.0853 )
							ret := -0.130897
						if( smoothD_d > 90.0853 )
							ret := -0.395101
			if( rsi1 > 76.5499 )
				if( k <= 84.1545 )
					if( k <= 36.4772 )
						ret := -0.529412
					if( k > 36.4772 )
						if( d_k <= 8.55006 )
							ret := 0.631579
						if( d_k > 8.55006 )
							ret := 0.094340
				if( k > 84.1545 )
					if( k <= 92.0335 )
						if( smoothD_d <= 86.5041 )
							ret := 0.171875
						if( smoothD_d > 86.5041 )
							ret := -0.292818
					if( k > 92.0335 )
						if( d <= 97.8205 )
							ret := 0.507407
						if( d > 97.8205 )
							ret := 0.252315
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
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
float op_operation = decision_tree_0_DOTUSDT_1Hour_76c2d603(d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


