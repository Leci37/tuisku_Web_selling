//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: DOTUSDT_15Min_1S00_44a78973 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOTUSDT_15Min_1S00_44a78973", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOTUSDT_15Min_44a78973(d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( smoothK_k <= 45.5241 )
		if( smoothK_k <= 8.57728 )
			if( d <= 1.7167 )
				if( rsi1 <= 36.2749 )
					if( smoothK_k <= -1.9034 )
						if( k <= 0.341002 )
							if( d <= 0.000306 )
								ret := -0.460719
							if( d > 0.000306 )
								ret := -0.603109
						if( k > 0.341002 )
							if( d <= 0.840457 )
								ret := -0.458182
							if( d > 0.840457 )
								ret := -0.206107
					if( smoothK_k > -1.9034 )
						if( rsi1 <= 20.8136 )
							if( smoothK_k <= -0.850506 )
								ret := -0.894040 // sell
							if( smoothK_k > -0.850506 )
								ret := -0.745283 // sell
						if( rsi1 > 20.8136 )
							if( d <= 0.458949 )
								ret := -0.900000 // sell
							if( d > 0.458949 )
								ret := -0.583086
				if( rsi1 > 36.2749 )
					if( rsi1 <= 43.2203 )
						if( d <= 0.064734 )
							if( rsi1 <= 41.4863 )
								ret := -0.627273
							if( rsi1 > 41.4863 )
								ret := 0.217391
						if( d > 0.064734 )
							if( smoothK_k <= 1.06994 )
								ret := -0.127586
							if( smoothK_k > 1.06994 )
								ret := -0.555556
					if( rsi1 > 43.2203 )
						if( d <= 0.010898 )
							ret := -0.151786
						if( d > 0.010898 )
							if( rsi1 <= 59.0168 )
								ret := -0.615804
							if( rsi1 > 59.0168 )
								ret := -0.047619
			if( d > 1.7167 )
				if( rsi1 <= 29.5432 )
					if( rsi1 <= 4.56047 )
						if( d <= 3.60751 )
							ret := 0.250000
						if( d > 3.60751 )
							if( smoothK_k <= -1.88902 )
								ret := 0.500000
							if( smoothK_k > -1.88902 )
								ret := 1.000000 // buy
					if( rsi1 > 4.56047 )
						if( rsi1 <= 18.75 )
							if( rsi1 <= 14.328 )
								ret := -0.410509
							if( rsi1 > 14.328 )
								ret := -0.625946
						if( rsi1 > 18.75 )
							if( d_k <= -5.48308 )
								ret := -0.750000 // sell
							if( d_k > -5.48308 )
								ret := -0.443657
				if( rsi1 > 29.5432 )
					if( d <= 20.5478 )
						if( d_k <= -2.86347 )
							if( rsi1 <= 56.0969 )
								ret := -0.432234
							if( rsi1 > 56.0969 )
								ret := 0.302632
						if( d_k > -2.86347 )
							if( smoothD_d <= -1.06269 )
								ret := 0.129310
							if( smoothD_d > -1.06269 )
								ret := -0.234851
					if( d > 20.5478 )
						if( rsi1 <= 44.4392 )
							if( smoothK_k <= 0.406603 )
								ret := -0.326241
							if( smoothK_k > 0.406603 )
								ret := -0.572016
						if( rsi1 > 44.4392 )
							if( d <= 21.2732 )
								ret := -0.584270
							if( d > 21.2732 )
								ret := -0.181948
		if( smoothK_k > 8.57728 )
			if( k <= 33.2756 )
				if( d <= 11.8367 )
					if( rsi1 <= 47.5691 )
						if( k <= 17.2449 )
							if( d <= 9.04583 )
								ret := -0.421053
							if( d > 9.04583 )
								ret := -0.257050
						if( k > 17.2449 )
							if( rsi1 <= 27.8928 )
								ret := -0.895028 // sell
							if( rsi1 > 27.8928 )
								ret := -0.476395
					if( rsi1 > 47.5691 )
						if( d <= 10.0223 )
							if( d_k <= -8.35662 )
								ret := -0.424710
							if( d_k > -8.35662 )
								ret := -0.045977
						if( d > 10.0223 )
							if( k <= 11.6936 )
								ret := 1.000000 // buy
							if( k > 11.6936 )
								ret := 0.054245
				if( d > 11.8367 )
					if( d_k <= 7.95923 )
						if( rsi1 <= 52.2946 )
							if( d <= 20.51 )
								ret := -0.234515
							if( d > 20.51 )
								ret := -0.137216
						if( rsi1 > 52.2946 )
							if( d <= 33.4418 )
								ret := 0.127203
							if( d > 33.4418 )
								ret := -0.209184
					if( d_k > 7.95923 )
						if( smoothD_d <= 19.9041 )
							if( d_k <= 10.7032 )
								ret := -0.530726
							if( d_k > 10.7032 )
								ret := 0.750000 // buy
						if( smoothD_d > 19.9041 )
							if( d <= 51.2316 )
								ret := -0.247308
							if( d > 51.2316 )
								ret := -0.115677
			if( k > 33.2756 )
				if( d_k <= -18.6397 )
					if( rsi1 <= 56.5817 )
						if( smoothD_d <= 20.6186 )
							if( k <= 38.5284 )
								ret := -0.280000
							if( k > 38.5284 )
								ret := -0.615385
						if( smoothD_d > 20.6186 )
							if( rsi1 <= 47.2497 )
								ret := -0.468354
							if( rsi1 > 47.2497 )
								ret := 0.139535
					if( rsi1 > 56.5817 )
						if( smoothK_k <= 36.7299 )
							if( rsi1 <= 58.4038 )
								ret := 0.846154 // buy
							if( rsi1 > 58.4038 )
								ret := 0.166667
						if( smoothK_k > 36.7299 )
							if( k <= 46.8072 )
								ret := -0.200000
							if( k > 46.8072 )
								ret := 0.458333
				if( d_k > -18.6397 )
					if( rsi1 <= 66.2585 )
						if( rsi1 <= 50.0366 )
							if( d_k <= 3.42061 )
								ret := -0.055486
							if( d_k > 3.42061 )
								ret := -0.182656
						if( rsi1 > 50.0366 )
							if( smoothD_d <= 34.1561 )
								ret := 0.119493
							if( smoothD_d > 34.1561 )
								ret := -0.034761
					if( rsi1 > 66.2585 )
						if( d <= 38.0472 )
							if( d_k <= -4.1888 )
								ret := 0.468293
							if( d_k > -4.1888 )
								ret := 0.835821 // buy
						if( d > 38.0472 )
							if( d_k <= 19.9719 )
								ret := 0.174757
							if( d_k > 19.9719 )
								ret := 0.662921
	if( smoothK_k > 45.5241 )
		if( smoothK_k <= 83.221 )
			if( k <= 68.0481 )
				if( rsi1 <= 58.1422 )
					if( d_k <= -3.17998 )
						if( d_k <= -12.1908 )
							if( rsi1 <= 34.9511 )
								ret := -0.343490
							if( rsi1 > 34.9511 )
								ret := 0.025759
						if( d_k > -12.1908 )
							if( rsi1 <= 39.2093 )
								ret := 0.014587
							if( rsi1 > 39.2093 )
								ret := 0.177700
					if( d_k > -3.17998 )
						if( d <= 66.6239 )
							if( d_k <= 6.47074 )
								ret := -0.080985
							if( d_k > 6.47074 )
								ret := -0.237778
						if( d > 66.6239 )
							if( rsi1 <= 46.8419 )
								ret := -0.132075
							if( rsi1 > 46.8419 )
								ret := 0.099523
				if( rsi1 > 58.1422 )
					if( smoothD_d <= 69.9184 )
						if( smoothD_d <= 68.2853 )
							if( d_k <= -11.4331 )
								ret := 0.312500
							if( d_k > -11.4331 )
								ret := 0.151992
						if( smoothD_d > 68.2853 )
							if( rsi1 <= 70.97 )
								ret := -0.345745
							if( rsi1 > 70.97 )
								ret := 0.294118
					if( smoothD_d > 69.9184 )
						if( k <= 55.7105 )
							if( d <= 73.7175 )
								ret := 0.370370
							if( d > 73.7175 )
								ret := 0.766667 // buy
						if( k > 55.7105 )
							if( d_k <= 7.01044 )
								ret := 0.857143 // buy
							if( d_k > 7.01044 )
								ret := 0.257516
			if( k > 68.0481 )
				if( rsi1 <= 54.775 )
					if( smoothD_d <= 61.106 )
						if( smoothD_d <= 49.8797 )
							if( rsi1 <= 41.7623 )
								ret := -0.275000
							if( rsi1 > 41.7623 )
								ret := 0.191011
						if( smoothD_d > 49.8797 )
							if( rsi1 <= 52.9959 )
								ret := 0.200000
							if( rsi1 > 52.9959 )
								ret := 0.518072
					if( smoothD_d > 61.106 )
						if( d_k <= -0.771205 )
							if( rsi1 <= 45.242 )
								ret := -0.001079
							if( rsi1 > 45.242 )
								ret := 0.201780
						if( d_k > -0.771205 )
							if( d <= 86.2517 )
								ret := -0.080125
							if( d > 86.2517 )
								ret := 0.070318
				if( rsi1 > 54.775 )
					if( rsi1 <= 72.731 )
						if( d <= 91.1503 )
							if( smoothD_d <= 59.4434 )
								ret := 0.347192
							if( smoothD_d > 59.4434 )
								ret := 0.178135
						if( d > 91.1503 )
							if( smoothD_d <= 91.4053 )
								ret := 0.553684
							if( smoothD_d > 91.4053 )
								ret := -0.333333
					if( rsi1 > 72.731 )
						if( rsi1 <= 83.8895 )
							if( d <= 71.6076 )
								ret := 0.647208
							if( d > 71.6076 )
								ret := 0.309630
						if( rsi1 > 83.8895 )
							if( smoothD_d <= 78.0518 )
								ret := 0.329545
							if( smoothD_d > 78.0518 )
								ret := 0.796610 // buy
		if( smoothK_k > 83.221 )
			if( smoothD_d <= 93.4261 )
				if( rsi1 <= 70.0454 )
					if( rsi1 <= 49.5618 )
						if( rsi1 <= 30.1296 )
							if( d <= 91.8436 )
								ret := -0.645833
							if( d > 91.8436 )
								ret := 0.500000
						if( rsi1 > 30.1296 )
							if( d_k <= -28.8228 )
								ret := 0.594595
							if( d_k > -28.8228 )
								ret := 0.115560
					if( rsi1 > 49.5618 )
						if( smoothK_k <= 90.7837 )
							if( d_k <= 2.5884 )
								ret := 0.216155
							if( d_k > 2.5884 )
								ret := 0.351692
						if( smoothK_k > 90.7837 )
							if( d_k <= -8.30538 )
								ret := 0.430572
							if( d_k > -8.30538 )
								ret := 0.304015
				if( rsi1 > 70.0454 )
					if( rsi1 <= 77.7999 )
						if( d <= 83.7845 )
							if( d_k <= -16.0201 )
								ret := 0.662069
							if( d_k > -16.0201 )
								ret := 0.430034
						if( d > 83.7845 )
							if( d_k <= 3.73582 )
								ret := 0.327036
							if( d_k > 3.73582 )
								ret := 0.663043
					if( rsi1 > 77.7999 )
						if( smoothD_d <= 86.3809 )
							if( k <= 86.6217 )
								ret := -0.066667
							if( k > 86.6217 )
								ret := 0.718543 // buy
						if( smoothD_d > 86.3809 )
							if( k <= 99.9281 )
								ret := 0.613411
							if( k > 99.9281 )
								ret := 0.341365
			if( smoothD_d > 93.4261 )
				if( rsi1 <= 64.5182 )
					if( rsi1 <= 64.1003 )
						if( d <= 98.823 )
							if( rsi1 <= 47.1848 )
								ret := 0.507463
							if( rsi1 > 47.1848 )
								ret := 0.251739
						if( d > 98.823 )
							if( smoothK_k <= 96.9997 )
								ret := 0.592771
							if( smoothK_k > 96.9997 )
								ret := 0.240000
					if( rsi1 > 64.1003 )
						if( d_k <= 2.00256 )
							if( d_k <= 1.5352 )
								ret := -0.276923
							if( d_k > 1.5352 )
								ret := -1.000000 // sell
						if( d_k > 2.00256 )
							if( smoothK_k <= 92.0114 )
								ret := 0.833333 // buy
							if( smoothK_k > 92.0114 )
								ret := 0.300000
				if( rsi1 > 64.5182 )
					if( smoothK_k <= 96.6234 )
						if( d_k <= 0.325705 )
							if( rsi1 <= 69.8263 )
								ret := 0.261818
							if( rsi1 > 69.8263 )
								ret := 0.461722
						if( d_k > 0.325705 )
							if( d <= 98.8918 )
								ret := 0.509018
							if( d > 98.8918 )
								ret := 0.707724 // buy
					if( smoothK_k > 96.6234 )
						if( rsi1 <= 90.7062 )
							if( smoothK_k <= 96.9972 )
								ret := 0.702778 // buy
							if( smoothK_k > 96.9972 )
								ret := 0.558169
						if( rsi1 > 90.7062 )
							if( smoothD_d <= 94.5592 )
								ret := -0.200000
							if( smoothD_d > 94.5592 )
								ret := 0.830000 // buy
	
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
float op_operation = decision_tree_0_DOTUSDT_15Min_44a78973(d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


