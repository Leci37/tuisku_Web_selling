//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: VETUSDT_30Min_1S00_19c78411 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_VETUSDT_30Min_1S00_19c78411", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_VETUSDT_30Min_19c78411(smoothK_k, d_k, k, smoothD_d, rsi1, d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( smoothK_k <= 56.9258 )
		if( d_k <= -4.67243 )
			if( d <= 9.57037 )
				if( rsi1 <= 45.0178 )
					if( k <= 11.242 )
						if( d <= 3.27609 )
							if( smoothD_d <= -0.529061 )
								ret := -0.125000
							if( smoothD_d > -0.529061 )
								ret := -0.803279 // sell
						if( d > 3.27609 )
							if( smoothK_k <= 5.45984 )
								ret := 0.428571
							if( smoothK_k > 5.45984 )
								ret := -0.551020
					if( k > 11.242 )
						if( rsi1 <= 32.6277 )
							if( k <= 14.8951 )
								ret := -0.550676
							if( k > 14.8951 )
								ret := -0.315271
						if( rsi1 > 32.6277 )
							if( smoothK_k <= 11.3356 )
								ret := -0.095975
							if( smoothK_k > 11.3356 )
								ret := -0.337079
				if( rsi1 > 45.0178 )
					if( rsi1 <= 53.4291 )
						if( rsi1 <= 48.7707 )
							if( d <= 3.86331 )
								ret := -0.700000 // sell
							if( d > 3.86331 )
								ret := 0.273810
						if( rsi1 > 48.7707 )
							if( smoothK_k <= 10.1809 )
								ret := -0.525000
							if( smoothK_k > 10.1809 )
								ret := -0.039604
					if( rsi1 > 53.4291 )
						if( smoothD_d <= 3.74638 )
							if( smoothD_d <= 3.43281 )
								ret := 0.424242
							if( smoothD_d > 3.43281 )
								ret := 0.827586 // buy
						if( smoothD_d > 3.74638 )
							if( rsi1 <= 65.9031 )
								ret := 0.054545
							if( rsi1 > 65.9031 )
								ret := 0.875000 // buy
			if( d > 9.57037 )
				if( rsi1 <= 45.7301 )
					if( rsi1 <= 32.2892 )
						if( d_k <= -10.1502 )
							if( smoothD_d <= 7.92421 )
								ret := -0.840000 // sell
							if( smoothD_d > 7.92421 )
								ret := 0.027985
						if( d_k > -10.1502 )
							if( k <= 15.8696 )
								ret := 0.611111
							if( k > 15.8696 )
								ret := -0.242915
					if( rsi1 > 32.2892 )
						if( rsi1 <= 38.7943 )
							if( smoothD_d <= 22.2857 )
								ret := -0.064840
							if( smoothD_d > 22.2857 )
								ret := 0.101311
						if( rsi1 > 38.7943 )
							if( smoothK_k <= 16.3746 )
								ret := 0.457746
							if( smoothK_k > 16.3746 )
								ret := 0.123130
				if( rsi1 > 45.7301 )
					if( d_k <= -17.387 )
						if( rsi1 <= 48.2753 )
							if( d <= 34.0862 )
								ret := 0.065934
							if( d > 34.0862 )
								ret := 0.717391 // buy
						if( rsi1 > 48.2753 )
							if( d_k <= -28.0304 )
								ret := -0.150000
							if( d_k > -28.0304 )
								ret := 0.563241
					if( d_k > -17.387 )
						if( rsi1 <= 52.0719 )
							if( rsi1 <= 49.2623 )
								ret := 0.304976
							if( rsi1 > 49.2623 )
								ret := 0.115924
						if( rsi1 > 52.0719 )
							if( d_k <= -5.35078 )
								ret := 0.462166
							if( d_k > -5.35078 )
								ret := 0.216931
		if( d_k > -4.67243 )
			if( smoothK_k <= 6.88639 )
				if( rsi1 <= 42.094 )
					if( smoothK_k <= -0.917991 )
						if( smoothK_k <= -2.9159 )
							if( rsi1 <= 23.1915 )
								ret := -0.778872 // sell
							if( rsi1 > 23.1915 )
								ret := -0.647734
						if( smoothK_k > -2.9159 )
							if( smoothD_d <= 18.7076 )
								ret := -0.610426
							if( smoothD_d > 18.7076 )
								ret := -0.833333 // sell
					if( smoothK_k > -0.917991 )
						if( rsi1 <= 24.1349 )
							if( smoothK_k <= 0.816877 )
								ret := -0.561983
							if( smoothK_k > 0.816877 )
								ret := -0.689545
						if( rsi1 > 24.1349 )
							if( d_k <= 4.92389 )
								ret := -0.384239
							if( d_k > 4.92389 )
								ret := -0.590832
				if( rsi1 > 42.094 )
					if( rsi1 <= 52.2882 )
						if( smoothD_d <= 10.3044 )
							if( smoothK_k <= -2.83446 )
								ret := -0.460560
							if( smoothK_k > -2.83446 )
								ret := -0.212299
						if( smoothD_d > 10.3044 )
							if( k <= 5.22292 )
								ret := -0.627083
							if( k > 5.22292 )
								ret := -0.353057
					if( rsi1 > 52.2882 )
						if( d_k <= 0.22492 )
							if( smoothK_k <= 2.23275 )
								ret := -0.113636
							if( smoothK_k > 2.23275 )
								ret := 0.449275
						if( d_k > 0.22492 )
							if( smoothD_d <= 19.0056 )
								ret := -0.119518
							if( smoothD_d > 19.0056 )
								ret := -0.422727
			if( smoothK_k > 6.88639 )
				if( rsi1 <= 49.9918 )
					if( d_k <= 3.53866 )
						if( rsi1 <= 33.5787 )
							if( d <= 28.9335 )
								ret := -0.471847
							if( d > 28.9335 )
								ret := -0.215190
						if( rsi1 > 33.5787 )
							if( d <= 53.5152 )
								ret := -0.065824
							if( d > 53.5152 )
								ret := -0.357357
					if( d_k > 3.53866 )
						if( rsi1 <= 34.4346 )
							if( d_k <= 10.696 )
								ret := -0.557466
							if( d_k > 10.696 )
								ret := -0.698556
						if( rsi1 > 34.4346 )
							if( rsi1 <= 46.051 )
								ret := -0.475822
							if( rsi1 > 46.051 )
								ret := -0.366071
				if( rsi1 > 49.9918 )
					if( d_k <= 7.57223 )
						if( rsi1 <= 67.2232 )
							if( smoothD_d <= 40.3458 )
								ret := 0.160419
							if( smoothD_d > 40.3458 )
								ret := 0.017109
						if( rsi1 > 67.2232 )
							if( d_k <= -2.17885 )
								ret := 0.671329
							if( d_k > -2.17885 )
								ret := 0.343158
					if( d_k > 7.57223 )
						if( d_k <= 14.2937 )
							if( rsi1 <= 69.8572 )
								ret := -0.126453
							if( rsi1 > 69.8572 )
								ret := 0.275132
						if( d_k > 14.2937 )
							if( smoothD_d <= 72.3321 )
								ret := -0.301399
							if( smoothD_d > 72.3321 )
								ret := 0.092593
	if( smoothK_k > 56.9258 )
		if( smoothK_k <= 89.9014 )
			if( rsi1 <= 54.4432 )
				if( d_k <= -3.5326 )
					if( d_k <= -12.7452 )
						if( rsi1 <= 45.2834 )
							if( d_k <= -25.0273 )
								ret := 0.486166
							if( d_k > -25.0273 )
								ret := 0.143333
						if( rsi1 > 45.2834 )
							if( smoothD_d <= 49.0849 )
								ret := 0.576159
							if( smoothD_d > 49.0849 )
								ret := 0.386707
					if( d_k > -12.7452 )
						if( d <= 85.8081 )
							if( rsi1 <= 48.2605 )
								ret := -0.027010
							if( rsi1 > 48.2605 )
								ret := 0.294118
						if( d > 85.8081 )
							if( smoothK_k <= 88.6221 )
								ret := 0.210526
							if( smoothK_k > 88.6221 )
								ret := 0.580645
				if( d_k > -3.5326 )
					if( rsi1 <= 37.0091 )
						if( d_k <= 0.122127 )
							if( smoothD_d <= 71.8802 )
								ret := -0.495238
							if( smoothD_d > 71.8802 )
								ret := 0.360000
						if( d_k > 0.122127 )
							if( smoothK_k <= 63.2642 )
								ret := -0.352601
							if( smoothK_k > 63.2642 )
								ret := -0.608527
					if( rsi1 > 37.0091 )
						if( rsi1 <= 47.9284 )
							if( smoothD_d <= 64.9981 )
								ret := 0.011594
							if( smoothD_d > 64.9981 )
								ret := -0.262997
						if( rsi1 > 47.9284 )
							if( d_k <= 2.60602 )
								ret := 0.148018
							if( d_k > 2.60602 )
								ret := -0.204749
			if( rsi1 > 54.4432 )
				if( smoothD_d <= 63.588 )
					if( k <= 75.7666 )
						if( rsi1 <= 66.2205 )
							if( k <= 75.2186 )
								ret := 0.412426
							if( k > 75.2186 )
								ret := -0.212121
						if( rsi1 > 66.2205 )
							if( d_k <= -20.9299 )
								ret := 0.779412 // buy
							if( d_k > -20.9299 )
								ret := 0.585995
					if( k > 75.7666 )
						if( k <= 79.1888 )
							if( smoothD_d <= 42.503 )
								ret := -0.200000
							if( smoothD_d > 42.503 )
								ret := 0.741294 // buy
						if( k > 79.1888 )
							if( smoothD_d <= 60.6687 )
								ret := 0.631295
							if( smoothD_d > 60.6687 )
								ret := 0.375000
				if( smoothD_d > 63.588 )
					if( smoothK_k <= 79.8436 )
						if( d <= 78.584 )
							if( smoothK_k <= 62.5544 )
								ret := -0.135908
							if( smoothK_k > 62.5544 )
								ret := 0.341683
						if( d > 78.584 )
							if( rsi1 <= 63.5455 )
								ret := -0.089147
							if( rsi1 > 63.5455 )
								ret := 0.173098
					if( smoothK_k > 79.8436 )
						if( d <= 84.2155 )
							if( rsi1 <= 75.4117 )
								ret := 0.510341
							if( rsi1 > 75.4117 )
								ret := 0.733577 // buy
						if( d > 84.2155 )
							if( d_k <= -6.53147 )
								ret := -0.208333
							if( d_k > -6.53147 )
								ret := 0.340426
		if( smoothK_k > 89.9014 )
			if( rsi1 <= 60.534 )
				if( smoothD_d <= 82.9641 )
					if( d_k <= -12.9935 )
						if( smoothD_d <= 72.8261 )
							if( smoothD_d <= 70.2664 )
								ret := 0.604790
							if( smoothD_d > 70.2664 )
								ret := 0.788618 // buy
						if( smoothD_d > 72.8261 )
							if( smoothD_d <= 77.0378 )
								ret := 0.282700
							if( smoothD_d > 77.0378 )
								ret := 0.632546
					if( d_k > -12.9935 )
						if( d_k <= -12.351 )
							if( rsi1 <= 55.7404 )
								ret := 0.000000
							if( rsi1 > 55.7404 )
								ret := -0.555556
						if( d_k > -12.351 )
							if( rsi1 <= 57.5858 )
								ret := 0.244186
							if( rsi1 > 57.5858 )
								ret := 0.743590 // buy
				if( smoothD_d > 82.9641 )
					if( k <= 99.9912 )
						if( rsi1 <= 53.8703 )
							if( d_k <= -4.10232 )
								ret := 0.264637
							if( d_k > -4.10232 )
								ret := -0.069767
						if( rsi1 > 53.8703 )
							if( rsi1 <= 59.3522 )
								ret := 0.404494
							if( rsi1 > 59.3522 )
								ret := 0.080189
					if( k > 99.9912 )
						if( rsi1 <= 42.7545 )
							if( d <= 97.6997 )
								ret := 0.520000
							if( d > 97.6997 )
								ret := -0.375000
						if( rsi1 > 42.7545 )
							if( rsi1 <= 43.9212 )
								ret := 0.933333 // buy
							if( rsi1 > 43.9212 )
								ret := 0.482173
			if( rsi1 > 60.534 )
				if( rsi1 <= 75.0769 )
					if( d_k <= -5.65839 )
						if( rsi1 <= 65.2193 )
							if( smoothD_d <= 89.2836 )
								ret := 0.540385
							if( smoothD_d > 89.2836 )
								ret := 0.117647
						if( rsi1 > 65.2193 )
							if( smoothK_k <= 93.5998 )
								ret := 0.585586
							if( smoothK_k > 93.5998 )
								ret := 0.763367 // buy
					if( d_k > -5.65839 )
						if( d_k <= 2.2062 )
							if( d_k <= -5.6053 )
								ret := -0.105263
							if( d_k > -5.6053 )
								ret := 0.498596
						if( d_k > 2.2062 )
							if( k <= 94.8849 )
								ret := 0.380952
							if( k > 94.8849 )
								ret := 0.074766
				if( rsi1 > 75.0769 )
					if( d <= 99.2759 )
						if( rsi1 <= 81.9253 )
							if( d <= 83.3692 )
								ret := 0.446970
							if( d > 83.3692 )
								ret := 0.641873
						if( rsi1 > 81.9253 )
							if( rsi1 <= 95.3151 )
								ret := 0.711435 // buy
							if( rsi1 > 95.3151 )
								ret := -0.250000
					if( d > 99.2759 )
						if( d_k <= 0.000594 )
							if( smoothD_d <= 96.8468 )
								ret := 0.710983 // buy
							if( smoothD_d > 96.8468 )
								ret := 0.810427 // buy
						if( d_k > 0.000594 )
							if( smoothK_k <= 95.193 )
								ret := 0.538462
							if( smoothK_k > 95.193 )
								ret := 0.878571 // buy
	
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
float op_operation = decision_tree_0_VETUSDT_30Min_19c78411(smoothK_k, d_k, k, smoothD_d, rsi1, d)

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


