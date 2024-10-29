//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: ETHUSDT_30Min_1S00_739c6f90 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETHUSDT_30Min_1S00_739c6f90", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETHUSDT_30Min_739c6f90(d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( smoothK_k <= 33.2571 )
		if( d_k <= -2.98145 )
			if( d <= 9.52234 )
				if( rsi1 <= 41.8367 )
					if( rsi1 <= 21.4865 )
						if( smoothD_d <= -0.01452 )
							if( smoothK_k <= 1.74808 )
								ret := -0.714286 // sell
							if( smoothK_k > 1.74808 )
								ret := -0.965116 // sell
						if( smoothD_d > -0.01452 )
							if( k <= 7.47729 )
								ret := 0.100000
							if( k > 7.47729 )
								ret := -0.691120
					if( rsi1 > 21.4865 )
						if( smoothD_d <= 0.553559 )
							if( smoothK_k <= 4.45712 )
								ret := -0.447205
							if( smoothK_k > 4.45712 )
								ret := -0.755396 // sell
						if( smoothD_d > 0.553559 )
							if( d <= 9.0898 )
								ret := -0.269094
							if( d > 9.0898 )
								ret := -0.580420
				if( rsi1 > 41.8367 )
					if( rsi1 <= 54.6753 )
						if( d <= 6.05132 )
							if( rsi1 <= 52.6813 )
								ret := -0.279805
							if( rsi1 > 52.6813 )
								ret := 0.440000
						if( d > 6.05132 )
							if( d <= 8.98045 )
								ret := 0.079800
							if( d > 8.98045 )
								ret := -0.230769
					if( rsi1 > 54.6753 )
						if( smoothK_k <= 10.0303 )
							if( smoothD_d <= 0.090135 )
								ret := -0.100000
							if( smoothD_d > 0.090135 )
								ret := 0.544186
						if( smoothK_k > 10.0303 )
							if( rsi1 <= 68.1919 )
								ret := 0.028777
							if( rsi1 > 68.1919 )
								ret := 0.750000 // buy
			if( d > 9.52234 )
				if( rsi1 <= 35.4027 )
					if( rsi1 <= 22.5414 )
						if( d <= 18.8957 )
							if( smoothK_k <= 23.6539 )
								ret := -0.244344
							if( smoothK_k > 23.6539 )
								ret := 0.346154
						if( d > 18.8957 )
							if( smoothK_k <= 27.864 )
								ret := -0.772727 // sell
							if( smoothK_k > 27.864 )
								ret := -0.425926
					if( rsi1 > 22.5414 )
						if( rsi1 <= 31.2312 )
							if( k <= 14.468 )
								ret := 0.568182
							if( k > 14.468 )
								ret := 0.038229
						if( rsi1 > 31.2312 )
							if( k <= 19.6444 )
								ret := 0.021277
							if( k > 19.6444 )
								ret := -0.240122
				if( rsi1 > 35.4027 )
					if( smoothD_d <= 18.6664 )
						if( rsi1 <= 58.5154 )
							if( smoothK_k <= 22.8314 )
								ret := 0.125247
							if( smoothK_k > 22.8314 )
								ret := 0.315259
						if( rsi1 > 58.5154 )
							if( smoothD_d <= 8.86021 )
								ret := 0.329545
							if( smoothD_d > 8.86021 )
								ret := 0.606316
					if( smoothD_d > 18.6664 )
						if( smoothK_k <= 31.1714 )
							if( rsi1 <= 49.7026 )
								ret := -0.196581
							if( rsi1 > 49.7026 )
								ret := 0.151603
						if( smoothK_k > 31.1714 )
							if( d_k <= -13.3891 )
								ret := -0.700000 // sell
							if( d_k > -13.3891 )
								ret := 0.311346
		if( d_k > -2.98145 )
			if( d <= 3.36842 )
				if( rsi1 <= 32.1288 )
					if( k <= 0.204023 )
						if( k <= 0.144793 )
							if( rsi1 <= 20.3757 )
								ret := -0.907190 // sell
							if( rsi1 > 20.3757 )
								ret := -0.691729
						if( k > 0.144793 )
							if( k <= 0.190682 )
								ret := -1.000000 // sell
							if( k > 0.190682 )
								ret := -0.833333 // sell
					if( k > 0.204023 )
						if( rsi1 <= 25.2758 )
							if( k <= 0.213258 )
								ret := 0.000000
							if( k > 0.213258 )
								ret := -0.746185 // sell
						if( rsi1 > 25.2758 )
							if( smoothD_d <= 0.032494 )
								ret := -0.550476
							if( smoothD_d > 0.032494 )
								ret := -0.772727 // sell
				if( rsi1 > 32.1288 )
					if( rsi1 <= 50.5993 )
						if( d <= 0.369334 )
							if( rsi1 <= 35.0277 )
								ret := -0.816901 // sell
							if( rsi1 > 35.0277 )
								ret := -0.450292
						if( d > 0.369334 )
							if( smoothK_k <= 1.75174 )
								ret := -0.308975
							if( smoothK_k > 1.75174 )
								ret := 0.137255
					if( rsi1 > 50.5993 )
						if( d_k <= -1.51504 )
							if( smoothK_k <= 0.205212 )
								ret := -0.944444 // sell
							if( smoothK_k > 0.205212 )
								ret := 0.178571
						if( d_k > -1.51504 )
							if( k <= 0.439359 )
								ret := -0.152778
							if( k > 0.439359 )
								ret := 0.283333
			if( d > 3.36842 )
				if( rsi1 <= 41.9974 )
					if( d_k <= 3.68639 )
						if( rsi1 <= 27.4764 )
							if( d <= 12.81 )
								ret := -0.662974
							if( d > 12.81 )
								ret := -0.404181
						if( rsi1 > 27.4764 )
							if( smoothD_d <= 4.77849 )
								ret := -0.380983
							if( smoothD_d > 4.77849 )
								ret := -0.225614
					if( d_k > 3.68639 )
						if( rsi1 <= 29.6519 )
							if( d_k <= 4.73107 )
								ret := -0.638636
							if( d_k > 4.73107 )
								ret := -0.764093 // sell
						if( rsi1 > 29.6519 )
							if( k <= 0.831716 )
								ret := -0.688385
							if( k > 0.831716 )
								ret := -0.523654
				if( rsi1 > 41.9974 )
					if( rsi1 <= 61.8919 )
						if( d_k <= 7.93421 )
							if( rsi1 <= 51.4677 )
								ret := -0.172085
							if( rsi1 > 51.4677 )
								ret := 0.009672
						if( d_k > 7.93421 )
							if( d_k <= 19.2151 )
								ret := -0.303011
							if( d_k > 19.2151 )
								ret := -0.488593
					if( rsi1 > 61.8919 )
						if( d <= 26.0011 )
							if( rsi1 <= 67.167 )
								ret := 0.169312
							if( rsi1 > 67.167 )
								ret := 0.552980
						if( d > 26.0011 )
							if( smoothK_k <= 2.47185 )
								ret := -0.888889 // sell
							if( smoothK_k > 2.47185 )
								ret := 0.082040
	if( smoothK_k > 33.2571 )
		if( k <= 88.7412 )
			if( rsi1 <= 56.0001 )
				if( d_k <= 0.659133 )
					if( d_k <= -10.1768 )
						if( rsi1 <= 23.6038 )
							if( d <= 30.5754 )
								ret := 0.454545
							if( d > 30.5754 )
								ret := -0.559524
						if( rsi1 > 23.6038 )
							if( smoothK_k <= 73.0382 )
								ret := 0.258984
							if( smoothK_k > 73.0382 )
								ret := 0.394888
					if( d_k > -10.1768 )
						if( smoothD_d <= 81.3718 )
							if( rsi1 <= 41.4785 )
								ret := -0.163821
							if( rsi1 > 41.4785 )
								ret := 0.155841
						if( smoothD_d > 81.3718 )
							if( smoothD_d <= 84.0416 )
								ret := -0.342342
							if( smoothD_d > 84.0416 )
								ret := 0.018519
				if( d_k > 0.659133 )
					if( rsi1 <= 42.3574 )
						if( d <= 65.203 )
							if( rsi1 <= 36.5864 )
								ret := -0.600812
							if( rsi1 > 36.5864 )
								ret := -0.301639
						if( d > 65.203 )
							if( k <= 42.2377 )
								ret := -0.937500 // sell
							if( k > 42.2377 )
								ret := -0.559105
					if( rsi1 > 42.3574 )
						if( d <= 39.9683 )
							if( k <= 36.386 )
								ret := 1.000000 // buy
							if( k > 36.386 )
								ret := 0.484848
						if( d > 39.9683 )
							if( d_k <= 16.9007 )
								ret := -0.204142
							if( d_k > 16.9007 )
								ret := -0.417895
			if( rsi1 > 56.0001 )
				if( smoothD_d <= 53.661 )
					if( k <= 48.5093 )
						if( d <= 40.9697 )
							if( smoothK_k <= 35.132 )
								ret := 0.292079
							if( smoothK_k > 35.132 )
								ret := 0.527415
						if( d > 40.9697 )
							if( smoothD_d <= 46.5646 )
								ret := 0.030879
							if( smoothD_d > 46.5646 )
								ret := 0.225201
					if( k > 48.5093 )
						if( k <= 64.812 )
							if( d <= 51.6616 )
								ret := 0.540575
							if( d > 51.6616 )
								ret := 0.311340
						if( k > 64.812 )
							if( rsi1 <= 57.401 )
								ret := 0.288136
							if( rsi1 > 57.401 )
								ret := 0.671296
				if( smoothD_d > 53.661 )
					if( k <= 62.2555 )
						if( smoothD_d <= 59.9946 )
							if( k <= 60.8639 )
								ret := -0.038760
							if( k > 60.8639 )
								ret := 0.529412
						if( smoothD_d > 59.9946 )
							if( rsi1 <= 73.7242 )
								ret := -0.194030
							if( rsi1 > 73.7242 )
								ret := 0.306250
					if( k > 62.2555 )
						if( d <= 74.9664 )
							if( rsi1 <= 61.0866 )
								ret := 0.264448
							if( rsi1 > 61.0866 )
								ret := 0.476354
						if( d > 74.9664 )
							if( d_k <= -1.50948 )
								ret := 0.439004
							if( d_k > -1.50948 )
								ret := 0.132673
		if( k > 88.7412 )
			if( rsi1 <= 63.1421 )
				if( rsi1 <= 38.4094 )
					if( d_k <= -19.0989 )
						if( smoothK_k <= 88.9348 )
							if( smoothD_d <= 62.6873 )
								ret := 1.000000 // buy
							if( smoothD_d > 62.6873 )
								ret := 0.583333
						if( smoothK_k > 88.9348 )
							if( smoothK_k <= 89.6344 )
								ret := -1.000000 // sell
							if( smoothK_k > 89.6344 )
								ret := 0.375000
					if( d_k > -19.0989 )
						if( d <= 99.9661 )
							if( k <= 96.278 )
								ret := -0.229091
							if( k > 96.278 )
								ret := -0.506579
						if( d > 99.9661 )
							ret := 1.000000 // buy
				if( rsi1 > 38.4094 )
					if( d <= 85.6631 )
						if( smoothK_k <= 95.9842 )
							if( d_k <= -21.8976 )
								ret := 0.605364
							if( d_k > -21.8976 )
								ret := 0.343237
						if( smoothK_k > 95.9842 )
							if( d_k <= -26.0771 )
								ret := 0.333333
							if( d_k > -26.0771 )
								ret := 0.817460 // buy
					if( d > 85.6631 )
						if( rsi1 <= 56.2255 )
							if( k <= 93.7743 )
								ret := -0.091753
							if( k > 93.7743 )
								ret := 0.223269
						if( rsi1 > 56.2255 )
							if( k <= 98.5415 )
								ret := 0.227074
							if( k > 98.5415 )
								ret := 0.520339
			if( rsi1 > 63.1421 )
				if( rsi1 <= 80.5 )
					if( d_k <= -2.2015 )
						if( d <= 81.883 )
							if( k <= 95.3116 )
								ret := 0.711893 // buy
							if( k > 95.3116 )
								ret := 0.806122 // buy
						if( d > 81.883 )
							if( smoothK_k <= 89.8514 )
								ret := 0.426854
							if( smoothK_k > 89.8514 )
								ret := 0.655298
					if( d_k > -2.2015 )
						if( rsi1 <= 68.8989 )
							if( smoothK_k <= 93.7361 )
								ret := 0.235877
							if( smoothK_k > 93.7361 )
								ret := 0.498965
						if( rsi1 > 68.8989 )
							if( d_k <= 2.07005 )
								ret := 0.490537
							if( d_k > 2.07005 )
								ret := 0.628407
				if( rsi1 > 80.5 )
					if( smoothK_k <= 96.7047 )
						if( d <= 99.7931 )
							if( rsi1 <= 90.69 )
								ret := 0.651390
							if( rsi1 > 90.69 )
								ret := 0.846591 // buy
						if( d > 99.7931 )
							if( rsi1 <= 83.8331 )
								ret := -0.833333 // sell
							if( rsi1 > 83.8331 )
								ret := 0.307692
					if( smoothK_k > 96.7047 )
						if( rsi1 <= 85.6558 )
							if( smoothK_k <= 96.8963 )
								ret := 0.444444
							if( smoothK_k > 96.8963 )
								ret := 0.822785 // buy
						if( rsi1 > 85.6558 )
							if( d_k <= 0.154763 )
								ret := 0.906329 // buy
							if( d_k > 0.154763 )
								ret := 0.500000
	
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
float op_operation = decision_tree_0_ETHUSDT_30Min_739c6f90(d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


