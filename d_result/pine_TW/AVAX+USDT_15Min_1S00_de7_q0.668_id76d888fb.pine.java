//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: AVAXUSDT_15Min_1S00_76d888fb Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AVAXUSDT_15Min_1S00_76d888fb", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AVAXUSDT_15Min_76d888fb(rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7,max_features=sqrt, min_samples_leaf=4,random_state=843828734)
	if( rsi1 <= 52.7175 )
		if( k <= 27.7259 )
			if( rsi1 <= 34.2377 )
				if( smoothD_d <= 1.45528 )
					if( rsi1 <= 25.7772 )
						if( d <= 1.19591 )
							if( smoothD_d <= -2.08278 )
								ret := -0.607882
							if( smoothD_d > -2.08278 )
								ret := 0.000000
						if( d > 1.19591 )
							if( smoothD_d <= -0.42282 )
								ret := -0.719500 // sell
							if( smoothD_d > -0.42282 )
								ret := -0.575639
					if( rsi1 > 25.7772 )
						if( k <= 5.64044 )
							if( d_k <= 3.11018 )
								ret := -0.366706
							if( d_k > 3.11018 )
								ret := -0.758065 // sell
						if( k > 5.64044 )
							if( smoothD_d <= -0.098103 )
								ret := -0.325301
							if( smoothD_d > -0.098103 )
								ret := -0.734748 // sell
				if( smoothD_d > 1.45528 )
					if( k <= 8.31787 )
						if( smoothD_d <= 2.6836 )
							if( d <= 5.58154 )
								ret := -0.318293
							if( d > 5.58154 )
								ret := 0.166667
						if( smoothD_d > 2.6836 )
							if( smoothD_d <= 26.7725 )
								ret := -0.463876
							if( smoothD_d > 26.7725 )
								ret := -0.787879 // sell
					if( k > 8.31787 )
						if( smoothD_d <= 11.465 )
							if( rsi1 <= 21.7128 )
								ret := -0.628981
							if( rsi1 > 21.7128 )
								ret := -0.355682
						if( smoothD_d > 11.465 )
							if( d <= 32.7516 )
								ret := -0.221999
							if( d > 32.7516 )
								ret := -0.428748
			if( rsi1 > 34.2377 )
				if( d <= 4.70288 )
					if( d_k <= -3.78258 )
						if( d <= 4.24288 )
							if( d_k <= -4.27885 )
								ret := -0.612245
							if( d_k > -4.27885 )
								ret := -0.808989 // sell
						if( d > 4.24288 )
							if( smoothK_k <= 6.47717 )
								ret := 0.193548
							if( smoothK_k > 6.47717 )
								ret := -0.339623
					if( d_k > -3.78258 )
						if( smoothD_d <= -2.89037 )
							if( rsi1 <= 51.8752 )
								ret := -0.643123
							if( rsi1 > 51.8752 )
								ret := 0.714286 // buy
						if( smoothD_d > -2.89037 )
							if( rsi1 <= 45.7974 )
								ret := -0.384025
							if( rsi1 > 45.7974 )
								ret := -0.164129
				if( d > 4.70288 )
					if( d <= 12.9482 )
						if( rsi1 <= 41.4622 )
							if( smoothK_k <= 5.05067 )
								ret := -0.205318
							if( smoothK_k > 5.05067 )
								ret := -0.448839
						if( rsi1 > 41.4622 )
							if( smoothK_k <= 19.6258 )
								ret := -0.215139
							if( smoothK_k > 19.6258 )
								ret := 0.097902
					if( d > 12.9482 )
						if( d_k <= 6.07814 )
							if( d <= 23.4235 )
								ret := -0.067986
							if( d > 23.4235 )
								ret := -0.232184
						if( d_k > 6.07814 )
							if( smoothD_d <= 45.5942 )
								ret := -0.289166
							if( smoothD_d > 45.5942 )
								ret := 0.031088
		if( k > 27.7259 )
			if( smoothD_d <= 77.9194 )
				if( rsi1 <= 47.1714 )
					if( k <= 51.0766 )
						if( d_k <= 13.0617 )
							if( d_k <= -10.6559 )
								ret := -0.244074
							if( d_k > -10.6559 )
								ret := -0.080816
						if( d_k > 13.0617 )
							if( smoothK_k <= 25.5593 )
								ret := -0.754386 // sell
							if( smoothK_k > 25.5593 )
								ret := -0.280213
					if( k > 51.0766 )
						if( rsi1 <= 19.9173 )
							if( smoothK_k <= 79.8169 )
								ret := -0.879310 // sell
							if( smoothK_k > 79.8169 )
								ret := 0.250000
						if( rsi1 > 19.9173 )
							if( smoothK_k <= 48.7789 )
								ret := 0.239234
							if( smoothK_k > 48.7789 )
								ret := -0.046246
				if( rsi1 > 47.1714 )
					if( smoothK_k <= 83.8484 )
						if( smoothD_d <= 65.0886 )
							if( d_k <= 6.94081 )
								ret := 0.082577
							if( d_k > 6.94081 )
								ret := -0.082102
						if( smoothD_d > 65.0886 )
							if( d_k <= -11.2679 )
								ret := -0.602151
							if( d_k > -11.2679 )
								ret := -0.069016
					if( smoothK_k > 83.8484 )
						if( d <= 80.276 )
							if( rsi1 <= 49.4722 )
								ret := -0.075758
							if( rsi1 > 49.4722 )
								ret := 0.361702
						if( d > 80.276 )
							if( smoothK_k <= 90.5938 )
								ret := 0.869565 // buy
							if( smoothK_k > 90.5938 )
								ret := 0.200000
			if( smoothD_d > 77.9194 )
				if( k <= 94.424 )
					if( d_k <= -6.67108 )
						if( rsi1 <= 25.9841 )
							ret := -1.000000 // sell
						if( rsi1 > 25.9841 )
							if( rsi1 <= 51.145 )
								ret := 0.474138
							if( rsi1 > 51.145 )
								ret := -0.400000
					if( d_k > -6.67108 )
						if( smoothK_k <= 87.2128 )
							if( smoothD_d <= 86.5652 )
								ret := 0.023884
							if( smoothD_d > 86.5652 )
								ret := 0.164306
						if( smoothK_k > 87.2128 )
							if( smoothD_d <= 83.144 )
								ret := 0.444444
							if( smoothD_d > 83.144 )
								ret := -0.180406
				if( k > 94.424 )
					if( k <= 95.6385 )
						if( d <= 98.2591 )
							if( rsi1 <= 24.5491 )
								ret := -1.000000 // sell
							if( rsi1 > 24.5491 )
								ret := 0.521390
						if( d > 98.2591 )
							ret := -0.076923
					if( k > 95.6385 )
						if( d <= 99.5294 )
							if( k <= 97.2667 )
								ret := -0.105675
							if( k > 97.2667 )
								ret := 0.150613
						if( d > 99.5294 )
							if( rsi1 <= 39.7373 )
								ret := 0.000000
							if( rsi1 > 39.7373 )
								ret := 0.681159
	if( rsi1 > 52.7175 )
		if( d <= 85.0694 )
			if( d_k <= -2.87623 )
				if( smoothD_d <= 16.2804 )
					if( d <= 6.5842 )
						if( rsi1 <= 55.4031 )
							if( smoothK_k <= 12.3811 )
								ret := -0.506494
							if( smoothK_k > 12.3811 )
								ret := -1.000000 // sell
						if( rsi1 > 55.4031 )
							if( d <= 4.22659 )
								ret := 0.400000
							if( d > 4.22659 )
								ret := -0.303030
					if( d > 6.5842 )
						if( smoothK_k <= 7.3316 )
							ret := 1.000000 // buy
						if( smoothK_k > 7.3316 )
							if( smoothD_d <= 15.5939 )
								ret := 0.065041
							if( smoothD_d > 15.5939 )
								ret := -0.265060
				if( smoothD_d > 16.2804 )
					if( d_k <= -13.6385 )
						if( smoothD_d <= 38.5238 )
							if( rsi1 <= 73.8557 )
								ret := 0.192308
							if( rsi1 > 73.8557 )
								ret := 0.679104
						if( smoothD_d > 38.5238 )
							if( smoothD_d <= 77.8262 )
								ret := 0.363682
							if( smoothD_d > 77.8262 )
								ret := 0.597598
					if( d_k > -13.6385 )
						if( rsi1 <= 68.5428 )
							if( smoothD_d <= 42.2044 )
								ret := 0.271775
							if( smoothD_d > 42.2044 )
								ret := 0.172874
						if( rsi1 > 68.5428 )
							if( smoothK_k <= 76.0957 )
								ret := 0.505143
							if( smoothK_k > 76.0957 )
								ret := 0.288591
			if( d_k > -2.87623 )
				if( k <= 33.3564 )
					if( rsi1 <= 66.9964 )
						if( smoothD_d <= -1.57119 )
							if( d_k <= 0.453145 )
								ret := -0.637931
							if( d_k > 0.453145 )
								ret := -0.280000
						if( smoothD_d > -1.57119 )
							if( d <= 7.52687 )
								ret := 0.057816
							if( d > 7.52687 )
								ret := -0.076128
					if( rsi1 > 66.9964 )
						if( smoothD_d <= 38.6091 )
							if( d <= 35.0149 )
								ret := 0.221978
							if( d > 35.0149 )
								ret := -0.354545
						if( smoothD_d > 38.6091 )
							if( k <= 21.049 )
								ret := -0.666667
							if( k > 21.049 )
								ret := 0.534351
				if( k > 33.3564 )
					if( smoothD_d <= 55.9525 )
						if( smoothK_k <= 32.3881 )
							if( rsi1 <= 59.5735 )
								ret := 0.070866
							if( rsi1 > 59.5735 )
								ret := 0.379167
						if( smoothK_k > 32.3881 )
							if( rsi1 <= 70.0365 )
								ret := -0.065801
							if( rsi1 > 70.0365 )
								ret := 0.311688
					if( smoothD_d > 55.9525 )
						if( d_k <= 19.261 )
							if( d_k <= -0.138087 )
								ret := -0.006920
							if( d_k > -0.138087 )
								ret := 0.136496
						if( d_k > 19.261 )
							if( k <= 34.7198 )
								ret := 0.708333 // buy
							if( k > 34.7198 )
								ret := 0.354260
		if( d > 85.0694 )
			if( rsi1 <= 76.9425 )
				if( smoothD_d <= 96.0759 )
					if( rsi1 <= 69.2569 )
						if( d <= 94.315 )
							if( d <= 91.9469 )
								ret := 0.298343
							if( d > 91.9469 )
								ret := 0.210999
						if( d > 94.315 )
							if( d <= 95.6558 )
								ret := 0.452799
							if( d > 95.6558 )
								ret := 0.298452
					if( rsi1 > 69.2569 )
						if( rsi1 <= 70.4715 )
							if( d_k <= -0.173957 )
								ret := 0.438095
							if( d_k > -0.173957 )
								ret := 0.642984
						if( rsi1 > 70.4715 )
							if( smoothD_d <= 89.0327 )
								ret := 0.290630
							if( smoothD_d > 89.0327 )
								ret := 0.422853
				if( smoothD_d > 96.0759 )
					if( k <= 99.3016 )
						if( d <= 99.5199 )
							if( d <= 99.1018 )
								ret := 0.909091 // buy
							if( d > 99.1018 )
								ret := 0.637209
						if( d > 99.5199 )
							if( smoothD_d <= 96.6976 )
								ret := 0.920455 // buy
							if( smoothD_d > 96.6976 )
								ret := 0.714286 // buy
					if( k > 99.3016 )
						if( k <= 99.5704 )
							if( rsi1 <= 57.1141 )
								ret := 0.666667
							if( rsi1 > 57.1141 )
								ret := -0.346939
						if( k > 99.5704 )
							if( rsi1 <= 68.2672 )
								ret := 0.655311
							if( rsi1 > 68.2672 )
								ret := 0.417062
			if( rsi1 > 76.9425 )
				if( smoothD_d <= 95.6478 )
					if( smoothK_k <= 93.6971 )
						if( smoothD_d <= 85.1658 )
							if( d <= 87.3724 )
								ret := 0.671756
							if( d > 87.3724 )
								ret := 0.846154 // buy
						if( smoothD_d > 85.1658 )
							if( smoothD_d <= 86.4162 )
								ret := 0.287129
							if( smoothD_d > 86.4162 )
								ret := 0.624834
					if( smoothK_k > 93.6971 )
						if( d_k <= -2.15663 )
							if( rsi1 <= 79.7617 )
								ret := 0.789831 // buy
							if( rsi1 > 79.7617 )
								ret := 0.503636
						if( d_k > -2.15663 )
							if( d <= 95.6927 )
								ret := -0.684211
							if( d > 95.6927 )
								ret := 0.449744
				if( smoothD_d > 95.6478 )
					if( d_k <= -0.282086 )
						if( smoothK_k <= 96.7389 )
							if( d_k <= -0.414085 )
								ret := -0.750000 // sell
							if( d_k > -0.414085 )
								ret := 0.300000
						if( smoothK_k > 96.7389 )
							if( rsi1 <= 82.7127 )
								ret := 0.770492 // buy
							if( rsi1 > 82.7127 )
								ret := 0.469136
					if( d_k > -0.282086 )
						if( d_k <= -0.012324 )
							if( d <= 98.7404 )
								ret := 0.777778 // buy
							if( d > 98.7404 )
								ret := 0.956790 // buy
						if( d_k > -0.012324 )
							if( rsi1 <= 95.9572 )
								ret := 0.731405 // buy
							if( rsi1 > 95.9572 )
								ret := 0.980000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_AVAXUSDT_15Min_76d888fb(rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


