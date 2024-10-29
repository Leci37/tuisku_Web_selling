//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: LINKUSDT_15Min_1S00_5cac7e70 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LINKUSDT_15Min_1S00_5cac7e70", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LINKUSDT_15Min_5cac7e70(d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( smoothK_k <= 58.9131 )
		if( smoothK_k <= 12.7042 )
			if( rsi1 <= 45.2528 )
				if( smoothD_d <= -1.10952 )
					if( d_k <= 0.048129 )
						if( k <= 3.47701 )
							if( d <= 6.3e-05 )
								ret := -0.493455
							if( d > 6.3e-05 )
								ret := -0.605053
						if( k > 3.47701 )
							if( d_k <= -2.75807 )
								ret := -0.577778
							if( d_k > -2.75807 )
								ret := -0.085271
					if( d_k > 0.048129 )
						if( rsi1 <= 23.7346 )
							if( rsi1 <= 2.13035 )
								ret := 0.500000
							if( rsi1 > 2.13035 )
								ret := -0.503686
						if( rsi1 > 23.7346 )
							if( d <= 0.521527 )
								ret := -0.048077
							if( d > 0.521527 )
								ret := -0.357500
				if( smoothD_d > -1.10952 )
					if( d_k <= -2.92068 )
						if( smoothK_k <= 3.83377 )
							if( d_k <= -2.99893 )
								ret := -0.689516
							if( d_k > -2.99893 )
								ret := -0.263158
						if( smoothK_k > 3.83377 )
							if( rsi1 <= 32.6165 )
								ret := -0.532747
							if( rsi1 > 32.6165 )
								ret := -0.327952
					if( d_k > -2.92068 )
						if( k <= 5.88572 )
							if( d_k <= 9.08403 )
								ret := -0.302434
							if( d_k > 9.08403 )
								ret := -0.410897
						if( k > 5.88572 )
							if( smoothD_d <= 25.4198 )
								ret := -0.202938
							if( smoothD_d > 25.4198 )
								ret := -0.375899
			if( rsi1 > 45.2528 )
				if( rsi1 <= 60.0029 )
					if( d_k <= 27.8485 )
						if( smoothK_k <= 7.20602 )
							if( d_k <= 9.93648 )
								ret := -0.100081
							if( d_k > 9.93648 )
								ret := -0.287559
						if( smoothK_k > 7.20602 )
							if( d_k <= -1.01908 )
								ret := -0.171303
							if( d_k > -1.01908 )
								ret := 0.052314
					if( d_k > 27.8485 )
						if( d <= 43.2401 )
							if( d_k <= 31.7019 )
								ret := -0.830508 // sell
							if( d_k > 31.7019 )
								ret := -0.250000
						if( d > 43.2401 )
							ret := -0.153846
				if( rsi1 > 60.0029 )
					if( k <= 14.6952 )
						if( smoothD_d <= -2.38627 )
							if( k <= 0.098797 )
								ret := -0.300000
							if( k > 0.098797 )
								ret := -0.857143 // sell
						if( smoothD_d > -2.38627 )
							if( d <= 1.48737 )
								ret := 0.681818
							if( d > 1.48737 )
								ret := 0.116972
					if( k > 14.6952 )
						if( smoothK_k <= 12.3622 )
							if( rsi1 <= 61.6304 )
								ret := -1.000000 // sell
							if( rsi1 > 61.6304 )
								ret := -0.447368
						if( smoothK_k > 12.3622 )
							ret := 0.000000
		if( smoothK_k > 12.7042 )
			if( rsi1 <= 47.8007 )
				if( smoothK_k <= 27.4753 )
					if( d <= 30.0549 )
						if( smoothD_d <= 11.1104 )
							if( rsi1 <= 21.4041 )
								ret := -0.700000 // sell
							if( rsi1 > 21.4041 )
								ret := -0.230992
						if( smoothD_d > 11.1104 )
							if( d_k <= -3.68587 )
								ret := -0.129766
							if( d_k > -3.68587 )
								ret := -0.025907
					if( d > 30.0549 )
						if( rsi1 <= 43.0341 )
							if( d_k <= 10.062 )
								ret := -0.137255
							if( d_k > 10.062 )
								ret := -0.354735
						if( rsi1 > 43.0341 )
							if( k <= 18.3139 )
								ret := 0.246914
							if( k > 18.3139 )
								ret := -0.219344
				if( smoothK_k > 27.4753 )
					if( d_k <= 1.54323 )
						if( rsi1 <= 34.9441 )
							if( rsi1 <= 30.8573 )
								ret := -0.025328
							if( rsi1 > 30.8573 )
								ret := -0.209302
						if( rsi1 > 34.9441 )
							if( d_k <= -15.7175 )
								ret := -0.142857
							if( d_k > -15.7175 )
								ret := 0.081225
					if( d_k > 1.54323 )
						if( rsi1 <= 19.8273 )
							if( d <= 59.2556 )
								ret := -0.952381 // sell
							if( d > 59.2556 )
								ret := 0.000000
						if( rsi1 > 19.8273 )
							if( rsi1 <= 24.1759 )
								ret := 0.198020
							if( rsi1 > 24.1759 )
								ret := -0.136649
			if( rsi1 > 47.8007 )
				if( d_k <= -3.27304 )
					if( rsi1 <= 65.44 )
						if( smoothD_d <= 6.79909 )
							if( rsi1 <= 49.0381 )
								ret := -0.607143
							if( rsi1 > 49.0381 )
								ret := -0.102190
						if( smoothD_d > 6.79909 )
							if( k <= 17.6044 )
								ret := 0.468750
							if( k > 17.6044 )
								ret := 0.113690
					if( rsi1 > 65.44 )
						if( smoothK_k <= 29.6641 )
							if( smoothK_k <= 15.1048 )
								ret := -0.187500
							if( smoothK_k > 15.1048 )
								ret := 0.577181
						if( smoothK_k > 29.6641 )
							if( smoothD_d <= 23.0186 )
								ret := -0.144000
							if( smoothD_d > 23.0186 )
								ret := 0.384615
				if( d_k > -3.27304 )
					if( rsi1 <= 69.1696 )
						if( d <= 72.1209 )
							if( d_k <= 29.7999 )
								ret := -0.046283
							if( d_k > 29.7999 )
								ret := 0.469697
						if( d > 72.1209 )
							if( d <= 79.4209 )
								ret := 0.261719
							if( d > 79.4209 )
								ret := -0.014286
					if( rsi1 > 69.1696 )
						if( rsi1 <= 77.5184 )
							if( d_k <= 22.6411 )
								ret := 0.165945
							if( d_k > 22.6411 )
								ret := 0.610390
						if( rsi1 > 77.5184 )
							if( smoothD_d <= 40.7674 )
								ret := 0.923913 // buy
							if( smoothD_d > 40.7674 )
								ret := 0.368852
	if( smoothK_k > 58.9131 )
		if( rsi1 <= 66.1659 )
			if( smoothK_k <= 81.4566 )
				if( rsi1 <= 44.6342 )
					if( d <= 65.0919 )
						if( rsi1 <= 37.3234 )
							if( d_k <= -30.2539 )
								ret := -0.684211
							if( d_k > -30.2539 )
								ret := -0.064103
						if( rsi1 > 37.3234 )
							if( rsi1 <= 38.1358 )
								ret := 0.493976
							if( rsi1 > 38.1358 )
								ret := 0.128514
					if( d > 65.0919 )
						if( smoothK_k <= 80.0206 )
							if( d <= 91.1609 )
								ret := -0.044456
							if( d > 91.1609 )
								ret := 0.578947
						if( smoothK_k > 80.0206 )
							if( k <= 83.9275 )
								ret := -0.525862
							if( k > 83.9275 )
								ret := -0.048780
				if( rsi1 > 44.6342 )
					if( d <= 81.9223 )
						if( d <= 69.0894 )
							if( rsi1 <= 55.9708 )
								ret := 0.162743
							if( rsi1 > 55.9708 )
								ret := 0.248889
						if( d > 69.0894 )
							if( smoothD_d <= 69.9722 )
								ret := -0.054688
							if( smoothD_d > 69.9722 )
								ret := 0.148289
					if( d > 81.9223 )
						if( rsi1 <= 51.8565 )
							if( smoothK_k <= 80.5349 )
								ret := 0.181287
							if( smoothK_k > 80.5349 )
								ret := -0.202247
						if( rsi1 > 51.8565 )
							if( rsi1 <= 53.9663 )
								ret := 0.419890
							if( rsi1 > 53.9663 )
								ret := 0.277606
			if( smoothK_k > 81.4566 )
				if( rsi1 <= 45.4544 )
					if( rsi1 <= 27.2001 )
						if( k <= 96.4748 )
							if( rsi1 <= 23.365 )
								ret := -0.111111
							if( rsi1 > 23.365 )
								ret := -0.685714
						if( k > 96.4748 )
							ret := 0.272727
					if( rsi1 > 27.2001 )
						if( rsi1 <= 43.1183 )
							if( smoothK_k <= 87.4808 )
								ret := 0.057851
							if( smoothK_k > 87.4808 )
								ret := 0.200000
						if( rsi1 > 43.1183 )
							if( d_k <= 1.55908 )
								ret := 0.022624
							if( d_k > 1.55908 )
								ret := -0.289474
				if( rsi1 > 45.4544 )
					if( k <= 97.2917 )
						if( rsi1 <= 56.8593 )
							if( smoothD_d <= 76.126 )
								ret := 0.326389
							if( smoothD_d > 76.126 )
								ret := 0.194864
						if( rsi1 > 56.8593 )
							if( d_k <= 3.52947 )
								ret := 0.268817
							if( d_k > 3.52947 )
								ret := 0.430657
					if( k > 97.2917 )
						if( rsi1 <= 57.4187 )
							if( rsi1 <= 55.2547 )
								ret := 0.354776
							if( rsi1 > 55.2547 )
								ret := 0.121622
						if( rsi1 > 57.4187 )
							if( rsi1 <= 64.9343 )
								ret := 0.465830
							if( rsi1 > 64.9343 )
								ret := 0.240816
		if( rsi1 > 66.1659 )
			if( k <= 87.462 )
				if( d_k <= -14.2102 )
					if( rsi1 <= 67.2368 )
						if( smoothK_k <= 78.8815 )
							if( k <= 64.9769 )
								ret := -0.333333
							if( k > 64.9769 )
								ret := 0.549020
						if( smoothK_k > 78.8815 )
							if( smoothK_k <= 79.5622 )
								ret := -1.000000 // sell
							if( smoothK_k > 79.5622 )
								ret := 0.307692
					if( rsi1 > 67.2368 )
						if( smoothK_k <= 84.2153 )
							if( d_k <= -30.0432 )
								ret := 0.314286
							if( d_k > -30.0432 )
								ret := 0.603390
						if( smoothK_k > 84.2153 )
							ret := -0.333333
				if( d_k > -14.2102 )
					if( rsi1 <= 78.2201 )
						if( smoothD_d <= 87.1374 )
							if( d_k <= 7.24356 )
								ret := 0.196988
							if( d_k > 7.24356 )
								ret := 0.435506
						if( smoothD_d > 87.1374 )
							if( d_k <= 6.85616 )
								ret := 0.191083
							if( d_k > 6.85616 )
								ret := 0.653226
					if( rsi1 > 78.2201 )
						if( d_k <= -10.626 )
							if( rsi1 <= 80.3217 )
								ret := 0.400000
							if( rsi1 > 80.3217 )
								ret := 0.953488 // buy
						if( d_k > -10.626 )
							if( d <= 86.3032 )
								ret := 0.381295
							if( d > 86.3032 )
								ret := 0.551181
			if( k > 87.462 )
				if( smoothD_d <= 95.3483 )
					if( rsi1 <= 78.7918 )
						if( k <= 97.2857 )
							if( d_k <= 4.69368 )
								ret := 0.392398
							if( d_k > 4.69368 )
								ret := 0.660606
						if( k > 97.2857 )
							if( smoothD_d <= 79.1847 )
								ret := 0.743750 // buy
							if( smoothD_d > 79.1847 )
								ret := 0.493855
					if( rsi1 > 78.7918 )
						if( k <= 90.2 )
							if( smoothK_k <= 86.6443 )
								ret := 0.682927
							if( smoothK_k > 86.6443 )
								ret := 0.927711 // buy
						if( k > 90.2 )
							if( d <= 87.2883 )
								ret := 0.774590 // buy
							if( d > 87.2883 )
								ret := 0.520833
				if( smoothD_d > 95.3483 )
					if( rsi1 <= 72.6303 )
						if( k <= 96.3633 )
							if( k <= 95.9812 )
								ret := 0.388889
							if( k > 95.9812 )
								ret := -0.428571
						if( k > 96.3633 )
							if( d_k <= 0.238365 )
								ret := 0.349398
							if( d_k > 0.238365 )
								ret := 0.696429
					if( rsi1 > 72.6303 )
						if( smoothD_d <= 95.6689 )
							if( d_k <= 0.215788 )
								ret := 0.846626 // buy
							if( d_k > 0.215788 )
								ret := 0.635036
						if( smoothD_d > 95.6689 )
							if( rsi1 <= 97.2961 )
								ret := 0.618961
							if( rsi1 > 97.2961 )
								ret := 0.956522 // buy
	
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
float op_operation = decision_tree_0_LINKUSDT_15Min_5cac7e70(d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


