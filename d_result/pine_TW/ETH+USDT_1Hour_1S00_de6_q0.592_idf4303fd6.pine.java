//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: ETHUSDT_1Hour_1S00_f4303fd6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETHUSDT_1Hour_1S00_f4303fd6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETHUSDT_1Hour_f4303fd6(d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( d_k <= 0.000275 )
		if( rsi1 <= 52.6363 )
			if( d_k <= -7.47822 )
				if( rsi1 <= 28.3873 )
					if( smoothD_d <= 6.4936 )
						if( d_k <= -8.40523 )
							ret := 0.379310
						if( d_k > -8.40523 )
							ret := 0.846154 // buy
					if( smoothD_d > 6.4936 )
						if( d_k <= -20.3195 )
							ret := 0.326087
						if( d_k > -20.3195 )
							ret := -0.272953
				if( rsi1 > 28.3873 )
					if( d <= 21.0565 )
						if( d_k <= -11.8734 )
							ret := 0.428000
						if( d_k > -11.8734 )
							ret := 0.178771
					if( d > 21.0565 )
						if( rsi1 <= 49.5308 )
							ret := 0.060266
						if( rsi1 > 49.5308 )
							ret := 0.255459
			if( d_k > -7.47822 )
				if( smoothK_k <= 76.6696 )
					if( d <= 11.327 )
						if( d_k <= -5.83901 )
							ret := 0.230594
						if( d_k > -5.83901 )
							ret := -0.099542
					if( d > 11.327 )
						if( rsi1 <= 34.7914 )
							ret := -0.306122
						if( rsi1 > 34.7914 )
							ret := -0.116678
				if( smoothK_k > 76.6696 )
					if( smoothD_d <= 75.6498 )
						if( rsi1 <= 39.822 )
							ret := -0.458333
						if( rsi1 > 39.822 )
							ret := 0.831683 // buy
					if( smoothD_d > 75.6498 )
						if( smoothD_d <= 96.4147 )
							ret := 0.049010
						if( smoothD_d > 96.4147 )
							ret := 0.769231 // buy
		if( rsi1 > 52.6363 )
			if( d_k <= -7.00027 )
				if( rsi1 <= 67.9415 )
					if( d_k <= -15.614 )
						if( d <= 27.3057 )
							ret := 0.681661
						if( d > 27.3057 )
							ret := 0.275085
					if( d_k > -15.614 )
						if( smoothD_d <= 9.92625 )
							ret := 0.481781
						if( smoothD_d > 9.92625 )
							ret := 0.163616
				if( rsi1 > 67.9415 )
					if( smoothK_k <= 59.8842 )
						if( rsi1 <= 78.7937 )
							ret := 0.444118
						if( rsi1 > 78.7937 )
							ret := -0.152542
					if( smoothK_k > 59.8842 )
						if( d <= 46.6012 )
							ret := 0.821782 // buy
						if( d > 46.6012 )
							ret := 0.537180
			if( d_k > -7.00027 )
				if( rsi1 <= 70.9539 )
					if( smoothK_k <= 96.9534 )
						if( k <= 97.5474 )
							ret := 0.136899
						if( k > 97.5474 )
							ret := -0.081136
					if( smoothK_k > 96.9534 )
						if( d <= 98.1154 )
							ret := 0.556180
						if( d > 98.1154 )
							ret := 0.136986
				if( rsi1 > 70.9539 )
					if( rsi1 <= 85.3147 )
						if( smoothD_d <= 94.9711 )
							ret := 0.361542
						if( smoothD_d > 94.9711 )
							ret := 0.128535
					if( rsi1 > 85.3147 )
						if( d_k <= -2.47165 )
							ret := 0.798165 // buy
						if( d_k > -2.47165 )
							ret := 0.471322
	if( d_k > 0.000275 )
		if( rsi1 <= 49.2459 )
			if( rsi1 <= 32.6415 )
				if( smoothK_k <= 75.702 )
					if( d_k <= 15.7232 )
						if( rsi1 <= 17.7155 )
							ret := -0.595318
						if( rsi1 > 17.7155 )
							ret := -0.364903
					if( d_k > 15.7232 )
						if( rsi1 <= 30.8092 )
							ret := -0.702817 // sell
						if( rsi1 > 30.8092 )
							ret := -0.175573
				if( smoothK_k > 75.702 )
					if( rsi1 <= 28.2664 )
						if( smoothD_d <= 86.0015 )
							ret := 1.000000 // buy
						if( smoothD_d > 86.0015 )
							ret := 0.739130 // buy
					if( rsi1 > 28.2664 )
						if( smoothK_k <= 80.2481 )
							ret := 0.666667
						if( smoothK_k > 80.2481 )
							ret := -0.375000
			if( rsi1 > 32.6415 )
				if( d_k <= 5.63397 )
					if( k <= 7.21535 )
						if( smoothD_d <= 4.95178 )
							ret := -0.142731
						if( smoothD_d > 4.95178 )
							ret := -0.471503
					if( k > 7.21535 )
						if( smoothK_k <= 10.8109 )
							ret := 0.223256
						if( smoothK_k > 10.8109 )
							ret := -0.075147
				if( d_k > 5.63397 )
					if( smoothD_d <= 49.7281 )
						if( k <= 8.93296 )
							ret := -0.300922
						if( k > 8.93296 )
							ret := -0.177825
					if( smoothD_d > 49.7281 )
						if( rsi1 <= 40.7041 )
							ret := -0.557110
						if( rsi1 > 40.7041 )
							ret := -0.275064
		if( rsi1 > 49.2459 )
			if( rsi1 <= 66.3619 )
				if( d <= 73.3912 )
					if( d_k <= 24.3975 )
						if( d <= 71.848 )
							ret := 0.083532
						if( d > 71.848 )
							ret := 0.422222
					if( d_k > 24.3975 )
						if( smoothK_k <= 31.6319 )
							ret := -0.149780
						if( smoothK_k > 31.6319 )
							ret := -0.603175
				if( d > 73.3912 )
					if( smoothD_d <= 96.1046 )
						if( rsi1 <= 56.5563 )
							ret := -0.279323
						if( rsi1 > 56.5563 )
							ret := -0.095662
					if( smoothD_d > 96.1046 )
						if( smoothD_d <= 96.9505 )
							ret := 0.518182
						if( smoothD_d > 96.9505 )
							ret := -0.333333
			if( rsi1 > 66.3619 )
				if( d <= 85.095 )
					if( rsi1 <= 79.5203 )
						if( d_k <= 5.81454 )
							ret := 0.360634
						if( d_k > 5.81454 )
							ret := 0.157580
					if( rsi1 > 79.5203 )
						if( d <= 38.2514 )
							ret := -0.192308
						if( d > 38.2514 )
							ret := 0.718644 // buy
				if( d > 85.095 )
					if( smoothK_k <= 94.148 )
						if( d <= 95.7512 )
							ret := 0.070438
						if( d > 95.7512 )
							ret := -0.171694
					if( smoothK_k > 94.148 )
						if( smoothD_d <= 95.9751 )
							ret := 0.512195
						if( smoothD_d > 95.9751 )
							ret := 0.142857
	
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
float op_operation = decision_tree_0_ETHUSDT_1Hour_f4303fd6(d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


