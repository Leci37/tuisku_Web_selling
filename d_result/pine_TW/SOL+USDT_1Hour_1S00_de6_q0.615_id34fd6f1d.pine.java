//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: SOLUSDT_1Hour_1S00_34fd6f1d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SOLUSDT_1Hour_1S00_34fd6f1d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SOLUSDT_1Hour_34fd6f1d(d_k, d, rsi1, k, smoothD_d, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( rsi1 <= 56.3381 )
		if( rsi1 <= 33.4049 )
			if( d_k <= -0.056606 )
				if( d <= 13.8899 )
					if( smoothK_k <= 11.8961 )
						if( d_k <= -5.43587 )
							ret := 0.339744
						if( d_k > -5.43587 )
							ret := -0.120249
					if( smoothK_k > 11.8961 )
						if( d_k <= -8.1962 )
							ret := 0.476636
						if( d_k > -8.1962 )
							ret := 0.118919
				if( d > 13.8899 )
					if( d_k <= -18.6891 )
						if( smoothK_k <= 55.268 )
							ret := 0.451613
						if( smoothK_k > 55.268 )
							ret := -0.111111
					if( d_k > -18.6891 )
						if( d <= 80.9441 )
							ret := -0.315115
						if( d > 80.9441 )
							ret := 0.421053
			if( d_k > -0.056606 )
				if( d <= 25.0384 )
					if( smoothK_k <= -2.92585 )
						if( rsi1 <= 16.1809 )
							ret := -0.713043 // sell
						if( rsi1 > 16.1809 )
							ret := -0.499318
					if( smoothK_k > -2.92585 )
						if( d_k <= 17.2109 )
							ret := -0.308178
						if( d_k > 17.2109 )
							ret := 0.558824
				if( d > 25.0384 )
					if( smoothK_k <= 24.1287 )
						if( k <= 13.979 )
							ret := -0.413793
						if( k > 13.979 )
							ret := -0.660650
					if( smoothK_k > 24.1287 )
						if( smoothK_k <= 29.5085 )
							ret := 0.030075
						if( smoothK_k > 29.5085 )
							ret := -0.508609
		if( rsi1 > 33.4049 )
			if( d_k <= -0.885997 )
				if( smoothD_d <= 35.569 )
					if( d_k <= -9.2257 )
						if( smoothK_k <= 23.3106 )
							ret := 0.524155
						if( smoothK_k > 23.3106 )
							ret := 0.281267
					if( d_k > -9.2257 )
						if( smoothK_k <= 25.759 )
							ret := 0.153069
						if( smoothK_k > 25.759 )
							ret := -0.127466
				if( smoothD_d > 35.569 )
					if( smoothD_d <= 95.2076 )
						if( d <= 78.9709 )
							ret := 0.042828
						if( d > 78.9709 )
							ret := -0.114418
					if( smoothD_d > 95.2076 )
						if( rsi1 <= 48.7938 )
							ret := -0.076923
						if( rsi1 > 48.7938 )
							ret := 0.891304 // buy
			if( d_k > -0.885997 )
				if( d_k <= 11.6768 )
					if( smoothD_d <= 82.5794 )
						if( rsi1 <= 42.0554 )
							ret := -0.171369
						if( rsi1 > 42.0554 )
							ret := -0.000668
					if( smoothD_d > 82.5794 )
						if( d_k <= 3.31284 )
							ret := -0.064481
						if( d_k > 3.31284 )
							ret := -0.506250
				if( d_k > 11.6768 )
					if( k <= 23.9888 )
						if( rsi1 <= 51.7499 )
							ret := -0.238474
						if( rsi1 > 51.7499 )
							ret := 0.103627
					if( k > 23.9888 )
						if( smoothD_d <= 42.4302 )
							ret := -0.725000 // sell
						if( smoothD_d > 42.4302 )
							ret := -0.374336
	if( rsi1 > 56.3381 )
		if( d_k <= 0.778926 )
			if( rsi1 <= 75.0443 )
				if( d_k <= -12.8819 )
					if( rsi1 <= 66.5249 )
						if( k <= 93.7748 )
							ret := 0.393745
						if( k > 93.7748 )
							ret := 0.107843
					if( rsi1 > 66.5249 )
						if( d_k <= -24.6994 )
							ret := 0.773006 // buy
						if( d_k > -24.6994 )
							ret := 0.485294
				if( d_k > -12.8819 )
					if( k <= 99.4859 )
						if( d <= 98.8155 )
							ret := 0.176675
						if( d > 98.8155 )
							ret := -0.255102
					if( k > 99.4859 )
						if( d <= 92.8226 )
							ret := 0.061224
						if( d > 92.8226 )
							ret := 0.441964
			if( rsi1 > 75.0443 )
				if( smoothK_k <= 96.8316 )
					if( d <= 82.1284 )
						if( smoothK_k <= 25.6766 )
							ret := -0.160000
						if( smoothK_k > 25.6766 )
							ret := 0.646130
					if( d > 82.1284 )
						if( k <= 88.2258 )
							ret := -0.225806
						if( k > 88.2258 )
							ret := 0.437121
				if( smoothK_k > 96.8316 )
					if( d <= 82.5368 )
						if( d <= 80.307 )
							ret := 0.100000
						if( d > 80.307 )
							ret := -0.083333
					if( d > 82.5368 )
						if( rsi1 <= 85.3606 )
							ret := 0.740088 // buy
						if( rsi1 > 85.3606 )
							ret := 0.587963
		if( d_k > 0.778926 )
			if( d_k <= 4.99272 )
				if( d <= 95.0082 )
					if( rsi1 <= 64.4513 )
						if( smoothK_k <= 5.14092 )
							ret := -0.437500
						if( smoothK_k > 5.14092 )
							ret := 0.094808
					if( rsi1 > 64.4513 )
						if( smoothD_d <= 86.6773 )
							ret := 0.417683
						if( smoothD_d > 86.6773 )
							ret := 0.126679
				if( d > 95.0082 )
					if( rsi1 <= 89.5735 )
						if( k <= 95.2983 )
							ret := -0.132114
						if( k > 95.2983 )
							ret := 0.067797
					if( rsi1 > 89.5735 )
						ret := 0.826087 // buy
			if( d_k > 4.99272 )
				if( smoothD_d <= 83.9496 )
					if( smoothD_d <= 34.7537 )
						if( d_k <= 14.9517 )
							ret := 0.176606
						if( d_k > 14.9517 )
							ret := 0.519481
					if( smoothD_d > 34.7537 )
						if( rsi1 <= 72.2371 )
							ret := -0.057621
						if( rsi1 > 72.2371 )
							ret := 0.342175
				if( smoothD_d > 83.9496 )
					if( d <= 93.5104 )
						if( smoothK_k <= 83.0276 )
							ret := -0.304897
						if( smoothK_k > 83.0276 )
							ret := 0.345455
					if( d > 93.5104 )
						if( rsi1 <= 68.3722 )
							ret := -0.183908
						if( rsi1 > 68.3722 )
							ret := -0.743455 // sell
	
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
float op_operation = decision_tree_0_SOLUSDT_1Hour_34fd6f1d(d_k, d, rsi1, k, smoothD_d, smoothK_k)

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


