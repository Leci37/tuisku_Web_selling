//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: MATICUSDT_1Min_2ST0_b509951c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MATICUSDT_1Min_2ST0_b509951c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MATICUSDT_1Min_b509951c(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( rsi1 <= 48.8916 )
		if( ema12 <= -0.000374 )
			if( rsi1 <= 31.6982 )
				if( ema2 <= 0.643642 )
					if( ema12 <= -0.001172 )
						if( rsi1 <= 27.4756 )
							if( rsi1 <= 15.8404 )
								ret := -0.841837 // sell
							if( rsi1 > 15.8404 )
								ret := -0.460970
						if( rsi1 > 27.4756 )
							if( ema2 <= 0.470612 )
								ret := -0.284153
							if( ema2 > 0.470612 )
								ret := 0.262087
					if( ema12 > -0.001172 )
						if( rsi1 <= 21.0495 )
							if( rsi1 <= 15.6243 )
								ret := -0.879867 // sell
							if( rsi1 > 15.6243 )
								ret := -0.775296 // sell
						if( rsi1 > 21.0495 )
							if( ema1 <= 0.532705 )
								ret := -0.651299
							if( ema1 > 0.532705 )
								ret := -0.450242
				if( ema2 > 0.643642 )
					if( d_k <= -0.177452 )
						if( ema12 <= -0.00081 )
							if( d <= 12.7006 )
								ret := 0.337415
							if( d > 12.7006 )
								ret := 0.035654
						if( ema12 > -0.00081 )
							if( tema <= 0.682221 )
								ret := -0.328520
							if( tema > 0.682221 )
								ret := -0.012415
					if( d_k > -0.177452 )
						if( ema1 <= 0.681151 )
							if( rsi1 <= 24.9691 )
								ret := -0.646753
							if( rsi1 > 24.9691 )
								ret := -0.230769
						if( ema1 > 0.681151 )
							if( rsi1 <= 17.8979 )
								ret := -0.396396
							if( rsi1 > 17.8979 )
								ret := -0.135965
			if( rsi1 > 31.6982 )
				if( rsi1 <= 40.6761 )
					if( ema2 <= 0.533464 )
						if( ema12 <= -0.000674 )
							if( d_k <= -16.0359 )
								ret := -0.488038
							if( d_k > -16.0359 )
								ret := 0.155911
						if( ema12 > -0.000674 )
							if( d_k <= -0.752953 )
								ret := -0.456665
							if( d_k > -0.752953 )
								ret := 0.064028
					if( ema2 > 0.533464 )
						if( ema12 <= -0.000566 )
							if( d <= 59.4078 )
								ret := 0.404742
							if( d > 59.4078 )
								ret := 0.098776
						if( ema12 > -0.000566 )
							if( d <= 18.0336 )
								ret := 0.171129
							if( d > 18.0336 )
								ret := -0.178611
				if( rsi1 > 40.6761 )
					if( ema2 <= 0.482442 )
						if( d_k <= -9.59972 )
							if( k <= 50.88 )
								ret := 0.234783
							if( k > 50.88 )
								ret := -0.361072
						if( d_k > -9.59972 )
							if( smoothD_d <= 80.2876 )
								ret := 0.572152
							if( smoothD_d > 80.2876 )
								ret := 0.186982
					if( ema2 > 0.482442 )
						if( d_k <= -24.0568 )
							if( tema <= 0.53891 )
								ret := -0.472603
							if( tema > 0.53891 )
								ret := 0.044444
						if( d_k > -24.0568 )
							if( smoothK_k <= 85.9318 )
								ret := 0.590909
							if( smoothK_k > 85.9318 )
								ret := 0.348757
		if( ema12 > -0.000374 )
			if( ema2 <= 0.646995 )
				if( ema12 <= 0.000151 )
					if( d_k <= 2.04563 )
						if( ema2 <= 0.547671 )
							if( smoothD_d <= 21.1464 )
								ret := -0.625537
							if( smoothD_d > 21.1464 )
								ret := -0.466965
						if( ema2 > 0.547671 )
							if( rsi1 <= 39.9687 )
								ret := -0.571126
							if( rsi1 > 39.9687 )
								ret := -0.103565
					if( d_k > 2.04563 )
						if( tema <= 0.439273 )
							if( rsi1 <= 39.8782 )
								ret := -0.314711
							if( rsi1 > 39.8782 )
								ret := 0.202073
						if( tema > 0.439273 )
							if( rsi1 <= 39.9567 )
								ret := -0.586636
							if( rsi1 > 39.9567 )
								ret := -0.062291
				if( ema12 > 0.000151 )
					if( rsi1 <= 39.9994 )
						if( ema2 <= 0.37822 )
							if( ema3 <= 0.370754 )
								ret := -0.585526
							if( ema3 > 0.370754 )
								ret := -0.162698
						if( ema2 > 0.37822 )
							if( ema2 <= 0.430515 )
								ret := -0.716597 // sell
							if( ema2 > 0.430515 )
								ret := -0.836814 // sell
					if( rsi1 > 39.9994 )
						if( k <= 4.08529 )
							if( ema13 <= 0.000866 )
								ret := -0.230126
							if( ema13 > 0.000866 )
								ret := -0.565773
						if( k > 4.08529 )
							if( d_k <= 15.1522 )
								ret := -0.753526 // sell
							if( d_k > 15.1522 )
								ret := -0.470964
			if( ema2 > 0.646995 )
				if( ema12 <= 4e-06 )
					if( rsi1 <= 39.993 )
						if( ema3 <= 0.684695 )
							if( rsi1 <= 30.4323 )
								ret := -0.663265
							if( rsi1 > 30.4323 )
								ret := -0.352795
						if( ema3 > 0.684695 )
							if( d <= 18.1897 )
								ret := -0.118247
							if( d > 18.1897 )
								ret := -0.279748
					if( rsi1 > 39.993 )
						if( ema12 <= -0.00021 )
							if( d <= 30.5002 )
								ret := 0.402244
							if( d > 30.5002 )
								ret := 0.124685
						if( ema12 > -0.00021 )
							if( smoothD_d <= 34.8073 )
								ret := 0.052810
							if( smoothD_d > 34.8073 )
								ret := -0.152993
				if( ema12 > 4e-06 )
					if( rsi1 <= 44.4387 )
						if( ema3 <= 0.681848 )
							if( ema1 <= 0.65176 )
								ret := -0.506024
							if( ema1 > 0.65176 )
								ret := -0.863281 // sell
						if( ema3 > 0.681848 )
							if( ema12 <= 3.9e-05 )
								ret := -0.296610
							if( ema12 > 3.9e-05 )
								ret := -0.594203
					if( rsi1 > 44.4387 )
						if( ema13 <= 0.000496 )
							if( ema12 <= 0.000149 )
								ret := -0.179050
							if( ema12 > 0.000149 )
								ret := -0.500000
						if( ema13 > 0.000496 )
							if( smoothK_k <= 4.32569 )
								ret := -0.279070
							if( smoothK_k > 4.32569 )
								ret := -0.730994 // sell
	if( rsi1 > 48.8916 )
		if( smoothD_d <= 79.0152 )
			if( ema13 <= 0.000214 )
				if( ema12 <= -9.3e-05 )
					if( d_k <= -19.5717 )
						if( ema2 <= 0.526145 )
							if( rsi1 <= 58.4969 )
								ret := -0.120996
							if( rsi1 > 58.4969 )
								ret := 0.569358
						if( ema2 > 0.526145 )
							if( k <= 66.7561 )
								ret := 0.718280 // buy
							if( k > 66.7561 )
								ret := 0.501710
					if( d_k > -19.5717 )
						if( k <= 76.7556 )
							if( rsi1 <= 52.5014 )
								ret := 0.579683
							if( rsi1 > 52.5014 )
								ret := 0.783905 // buy
						if( k > 76.7556 )
							if( rsi1 <= 50.8779 )
								ret := 0.220183
							if( rsi1 > 50.8779 )
								ret := 0.562202
				if( ema12 > -9.3e-05 )
					if( rsi1 <= 55.592 )
						if( ema12 <= 9.8e-05 )
							if( k <= 69.4432 )
								ret := 0.143839
							if( k > 69.4432 )
								ret := -0.185154
						if( ema12 > 9.8e-05 )
							if( ema3 <= 0.620858 )
								ret := -0.437247
							if( ema3 > 0.620858 )
								ret := -0.046512
					if( rsi1 > 55.592 )
						if( rsi1 <= 63.1579 )
							if( d_k <= -5.71861 )
								ret := 0.168593
							if( d_k > -5.71861 )
								ret := 0.477671
						if( rsi1 > 63.1579 )
							if( ema12 <= 3.6e-05 )
								ret := 0.692210
							if( ema12 > 3.6e-05 )
								ret := 0.510359
			if( ema13 > 0.000214 )
				if( rsi1 <= 61.5753 )
					if( ema13 <= 0.000723 )
						if( rsi1 <= 54.5387 )
							if( d_k <= 14.485 )
								ret := -0.224043
							if( d_k > 14.485 )
								ret := 0.085251
						if( rsi1 > 54.5387 )
							if( ema12 <= 0.000203 )
								ret := 0.339887
							if( ema12 > 0.000203 )
								ret := -0.041585
					if( ema13 > 0.000723 )
						if( ema12 <= 0.000459 )
							if( rsi1 <= 54.5493 )
								ret := -0.191876
							if( rsi1 > 54.5493 )
								ret := 0.187417
						if( ema12 > 0.000459 )
							if( rsi1 <= 55.3938 )
								ret := -0.541655
							if( rsi1 > 55.3938 )
								ret := -0.290419
				if( rsi1 > 61.5753 )
					if( tema <= 0.642814 )
						if( smoothD_d <= 22.4557 )
							if( rsi1 <= 66.6677 )
								ret := 0.104552
							if( rsi1 > 66.6677 )
								ret := 0.441419
						if( smoothD_d > 22.4557 )
							if( ema12 <= 0.00059 )
								ret := 0.536128
							if( ema12 > 0.00059 )
								ret := 0.336146
					if( tema > 0.642814 )
						if( d_k <= 8.88715 )
							if( d <= 72.97 )
								ret := 0.317951
							if( d > 72.97 )
								ret := 0.021965
						if( d_k > 8.88715 )
							if( ema12 <= 0.000841 )
								ret := -0.006046
							if( ema12 > 0.000841 )
								ret := -0.533528
		if( smoothD_d > 79.0152 )
			if( ema1 <= 0.601833 )
				if( rsi1 <= 66.6676 )
					if( ema13 <= -0.000219 )
						if( rsi1 <= 55.6075 )
							if( ema13 <= -0.00056 )
								ret := 0.554398
							if( ema13 > -0.00056 )
								ret := 0.224884
						if( rsi1 > 55.6075 )
							if( k <= 99.3439 )
								ret := 0.722886 // buy
							if( k > 99.3439 )
								ret := 0.553571
					if( ema13 > -0.000219 )
						if( rsi1 <= 55.9648 )
							if( smoothK_k <= 75.0123 )
								ret := 0.299213
							if( smoothK_k > 75.0123 )
								ret := -0.243129
						if( rsi1 > 55.9648 )
							if( k <= 86.6976 )
								ret := 0.463708
							if( k > 86.6976 )
								ret := 0.217525
				if( rsi1 > 66.6676 )
					if( ema3 <= 0.378915 )
						if( ema2 <= 0.367161 )
							if( ema1 <= 0.345994 )
								ret := -0.333333
							if( ema1 > 0.345994 )
								ret := 0.795812 // buy
						if( ema2 > 0.367161 )
							if( ema12 <= 0.000217 )
								ret := 0.284389
							if( ema12 > 0.000217 )
								ret := 0.597561
					if( ema3 > 0.378915 )
						if( ema3 <= 0.558297 )
							if( d_k <= -1.96733 )
								ret := 0.697984
							if( d_k > -1.96733 )
								ret := 0.797987 // buy
						if( ema3 > 0.558297 )
							if( smoothK_k <= 86.9543 )
								ret := 0.418426
							if( smoothK_k > 86.9543 )
								ret := 0.686005
			if( ema1 > 0.601833 )
				if( smoothK_k <= 88.8238 )
					if( d_k <= 5.98336 )
						if( ema3 <= 0.695668 )
							if( ema12 <= -3.3e-05 )
								ret := 0.518750
							if( ema12 > -3.3e-05 )
								ret := 0.084775
						if( ema3 > 0.695668 )
							if( d <= 88.3498 )
								ret := -0.001730
							if( d > 88.3498 )
								ret := -0.214888
					if( d_k > 5.98336 )
						if( ema12 <= 0.000833 )
							if( rsi1 <= 62.3009 )
								ret := -0.457203
							if( rsi1 > 62.3009 )
								ret := -0.003306
						if( ema12 > 0.000833 )
							if( d <= 92.7833 )
								ret := -0.492837
							if( d > 92.7833 )
								ret := -0.886957 // sell
				if( smoothK_k > 88.8238 )
					if( ema1 <= 0.689588 )
						if( ema12 <= -0.000186 )
							if( rsi1 <= 54.5524 )
								ret := 0.560284
							if( rsi1 > 54.5524 )
								ret := 0.881579 // buy
						if( ema12 > -0.000186 )
							if( smoothK_k <= 93.081 )
								ret := 0.253521
							if( smoothK_k > 93.081 )
								ret := 0.467570
					if( ema1 > 0.689588 )
						if( k <= 99.9923 )
							if( smoothD_d <= 94.496 )
								ret := 0.166923
							if( smoothD_d > 94.496 )
								ret := -0.220667
						if( k > 99.9923 )
							if( ema12 <= -0.000245 )
								ret := 0.730769 // buy
							if( ema12 > -0.000245 )
								ret := 0.337580
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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

//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_MATICUSDT_1Min_b509951c(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)

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


