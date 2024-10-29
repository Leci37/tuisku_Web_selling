//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: CRSR_30Min_1S00_23703f8b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRSR_30Min_1S00_23703f8b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRSR_30Min_23703f8b(rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( rsi1 <= 45.7004 )
		if( d <= 10.8401 )
			if( rsi1 <= 43.0769 )
				if( rsi1 <= 30.533 )
					if( smoothD_d <= 0.256511 )
						if( rsi1 <= 24.537 )
							ret := -0.144847
						if( rsi1 > 24.537 )
							ret := 0.163842
					if( smoothD_d > 0.256511 )
						if( d_k <= -3.64786 )
							ret := -0.129944
						if( d_k > -3.64786 )
							ret := 0.321267
				if( rsi1 > 30.533 )
					if( rsi1 <= 42.901 )
						if( smoothD_d <= -2.98603 )
							ret := 0.535714
						if( smoothD_d > -2.98603 )
							ret := -0.074943
					if( rsi1 > 42.901 )
						if( d <= 5.58595 )
							ret := 0.333333
						if( d > 5.58595 )
							ret := 0.812500 // buy
			if( rsi1 > 43.0769 )
				if( smoothK_k <= 9.42122 )
					if( d_k <= 0.883661 )
						if( d_k <= 0.331467 )
							ret := -0.142857
						if( d_k > 0.331467 )
							ret := 1.000000 // buy
					if( d_k > 0.883661 )
						if( d_k <= 5.07465 )
							ret := -0.841270 // sell
						if( d_k > 5.07465 )
							ret := -0.120000
				if( smoothK_k > 9.42122 )
					if( k <= 16.1605 )
						ret := -1.000000 // sell
					if( k > 16.1605 )
						ret := -0.700000 // sell
		if( d > 10.8401 )
			if( rsi1 <= 29.2324 )
				if( smoothD_d <= 60.6524 )
					if( d_k <= 1.92116 )
						if( rsi1 <= 24.7426 )
							ret := 0.030769
						if( rsi1 > 24.7426 )
							ret := 0.319876
					if( d_k > 1.92116 )
						if( k <= 1.8682 )
							ret := 0.000000
						if( k > 1.8682 )
							ret := 0.485294
				if( smoothD_d > 60.6524 )
					if( d_k <= -0.172103 )
						ret := 0.785714 // buy
					if( d_k > -0.172103 )
						if( d <= 66.9777 )
							ret := -0.656250
						if( d > 66.9777 )
							ret := -0.239437
			if( rsi1 > 29.2324 )
				if( d_k <= 11.9489 )
					if( d_k <= 2.85814 )
						if( d_k <= -5.88079 )
							ret := 0.037506
						if( d_k > -5.88079 )
							ret := 0.186409
					if( d_k > 2.85814 )
						if( k <= 5.05804 )
							ret := 0.480519
						if( k > 5.05804 )
							ret := -0.038953
				if( d_k > 11.9489 )
					if( d <= 46.8918 )
						if( rsi1 <= 43.6173 )
							ret := -0.015267
						if( rsi1 > 43.6173 )
							ret := 0.457143
					if( d > 46.8918 )
						if( d <= 76.577 )
							ret := 0.399709
						if( d > 76.577 )
							ret := 0.173913
	if( rsi1 > 45.7004 )
		if( d_k <= 14.5522 )
			if( d_k <= -9.0274 )
				if( d_k <= -29.0289 )
					if( smoothD_d <= 65.9975 )
						if( rsi1 <= 54.6912 )
							ret := -1.000000 // sell
						if( rsi1 > 54.6912 )
							ret := -0.580645
					if( smoothD_d > 65.9975 )
						ret := 0.235294
				if( d_k > -29.0289 )
					if( d_k <= -20.6278 )
						if( rsi1 <= 78.4705 )
							ret := -0.057061
						if( rsi1 > 78.4705 )
							ret := 0.650000
					if( d_k > -20.6278 )
						if( rsi1 <= 50.3726 )
							ret := -0.064286
						if( rsi1 > 50.3726 )
							ret := -0.268500
			if( d_k > -9.0274 )
				if( rsi1 <= 60.2588 )
					if( smoothK_k <= 87.2335 )
						if( d <= 92.1589 )
							ret := -0.002521
						if( d > 92.1589 )
							ret := 0.340909
					if( smoothK_k > 87.2335 )
						if( rsi1 <= 56.146 )
							ret := -0.352679
						if( rsi1 > 56.146 )
							ret := 0.144531
				if( rsi1 > 60.2588 )
					if( k <= 99.6497 )
						if( k <= 4.06122 )
							ret := 1.000000 // buy
						if( k > 4.06122 )
							ret := -0.115988
					if( k > 99.6497 )
						if( d_k <= -0.700709 )
							ret := -0.296296
						if( d_k > -0.700709 )
							ret := -0.526066
		if( d_k > 14.5522 )
			if( rsi1 <= 72.9232 )
				if( rsi1 <= 52.2652 )
					if( smoothK_k <= 21.4679 )
						if( d <= 29.5258 )
							ret := -0.016667
						if( d > 29.5258 )
							ret := 0.507353
					if( smoothK_k > 21.4679 )
						if( k <= 38.3926 )
							ret := -0.595506
						if( k > 38.3926 )
							ret := 0.174888
				if( rsi1 > 52.2652 )
					if( smoothK_k <= 43.8752 )
						if( smoothD_d <= 54.4063 )
							ret := 0.314935
						if( smoothD_d > 54.4063 )
							ret := 0.630872
					if( smoothK_k > 43.8752 )
						if( smoothD_d <= 61.9764 )
							ret := -0.600000
						if( smoothD_d > 61.9764 )
							ret := 0.226804
			if( rsi1 > 72.9232 )
				if( rsi1 <= 74.596 )
					ret := -0.888889 // sell
				if( rsi1 > 74.596 )
					ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_CRSR_30Min_23703f8b(rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


