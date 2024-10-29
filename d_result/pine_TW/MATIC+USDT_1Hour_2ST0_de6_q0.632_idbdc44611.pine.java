//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: MATICUSDT_1Hour_2ST0_bdc44611 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MATICUSDT_1Hour_2ST0_bdc44611", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MATICUSDT_1Hour_bdc44611(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( rsi1 <= 57.3504 )
		if( ema12 <= 0.000353 )
			if( rsi1 <= 43.2559 )
				if( ema1 <= 0.033995 )
					if( d_k <= -7.17998 )
						if( rsi1 <= 36.8654 )
							ret := -0.059006
						if( rsi1 > 36.8654 )
							ret := -0.350711
					if( d_k > -7.17998 )
						if( rsi1 <= 33.0784 )
							ret := 0.251651
						if( rsi1 > 33.0784 )
							ret := 0.038181
				if( ema1 > 0.033995 )
					if( d_k <= -2.65471 )
						if( ema12 <= -0.006044 )
							ret := 0.165607
						if( ema12 > -0.006044 )
							ret := -0.143997
					if( d_k > -2.65471 )
						if( rsi1 <= 25.8256 )
							ret := -0.500364
						if( rsi1 > 25.8256 )
							ret := -0.225654
			if( rsi1 > 43.2559 )
				if( ema12 <= -0.003213 )
					if( d <= 59.1496 )
						if( tema <= 0.857859 )
							ret := 0.714795 // buy
						if( tema > 0.857859 )
							ret := 0.484848
					if( d > 59.1496 )
						if( tema <= 0.783312 )
							ret := 0.593220
						if( tema > 0.783312 )
							ret := 0.145880
				if( ema12 > -0.003213 )
					if( ema12 <= -0.000437 )
						if( ema3 <= 0.684173 )
							ret := 0.373379
						if( ema3 > 0.684173 )
							ret := 0.097056
					if( ema12 > -0.000437 )
						if( d_k <= -17.6724 )
							ret := -0.246851
						if( d_k > -17.6724 )
							ret := 0.087355
		if( ema12 > 0.000353 )
			if( rsi1 <= 47.2007 )
				if( smoothK_k <= 33.7384 )
					if( d_k <= -3.30489 )
						if( smoothD_d <= 10.4908 )
							ret := 0.000000
						if( smoothD_d > 10.4908 )
							ret := 0.657143
					if( d_k > -3.30489 )
						if( ema12 <= 0.001142 )
							ret := -0.333333
						if( ema12 > 0.001142 )
							ret := -0.566735
				if( smoothK_k > 33.7384 )
					if( ema13 <= 0.000761 )
						if( rsi1 <= 43.9302 )
							ret := -0.840278 // sell
						if( rsi1 > 43.9302 )
							ret := -0.444444
					if( ema13 > 0.000761 )
						if( ema12 <= 0.00089 )
							ret := -0.574468
						if( ema12 > 0.00089 )
							ret := -0.867647 // sell
			if( rsi1 > 47.2007 )
				if( ema12 <= 0.00374 )
					if( rsi1 <= 52.7735 )
						if( smoothK_k <= 45.446 )
							ret := -0.179287
						if( smoothK_k > 45.446 )
							ret := -0.374359
					if( rsi1 > 52.7735 )
						if( d <= 56.2603 )
							ret := 0.073818
						if( d > 56.2603 )
							ret := -0.162252
				if( ema12 > 0.00374 )
					if( k <= 0.215071 )
						if( ema13 <= 0.020933 )
							ret := 0.025641
						if( ema13 > 0.020933 )
							ret := 0.865385 // buy
					if( k > 0.215071 )
						if( k <= 17.1118 )
							ret := -0.284768
						if( k > 17.1118 )
							ret := -0.605134
	if( rsi1 > 57.3504 )
		if( ema13 <= 1e-06 )
			if( smoothD_d <= 92.6735 )
				if( ema12 <= -0.003522 )
					if( smoothK_k <= 92.1278 )
						if( smoothD_d <= 40.257 )
							ret := 0.750000 // buy
						if( smoothD_d > 40.257 )
							ret := 0.971429 // buy
					if( smoothK_k > 92.1278 )
						ret := 0.500000
				if( ema12 > -0.003522 )
					if( ema3 <= 0.025304 )
						if( d <= 91.4188 )
							ret := 0.010417
						if( d > 91.4188 )
							ret := 0.571429
					if( ema3 > 0.025304 )
						if( ema3 <= 0.376508 )
							ret := 0.825203 // buy
						if( ema3 > 0.376508 )
							ret := 0.442841
			if( smoothD_d > 92.6735 )
				if( rsi1 <= 62.5942 )
					if( ema3 <= 0.796823 )
						if( rsi1 <= 58.2424 )
							ret := 0.827586 // buy
						if( rsi1 > 58.2424 )
							ret := 0.027027
					if( ema3 > 0.796823 )
						if( d <= 97.742 )
							ret := -0.152174
						if( d > 97.742 )
							ret := -0.828571 // sell
				if( rsi1 > 62.5942 )
					if( smoothK_k <= 93.5276 )
						ret := -0.090909
					if( smoothK_k > 93.5276 )
						if( tema <= 1.38514 )
							ret := 0.705882 // buy
						if( tema > 1.38514 )
							ret := 0.000000
		if( ema13 > 1e-06 )
			if( rsi1 <= 73.0978 )
				if( ema12 <= 0.008517 )
					if( smoothD_d <= 13.7916 )
						if( ema2 <= 0.047918 )
							ret := 0.186567
						if( ema2 > 0.047918 )
							ret := 0.553535
					if( smoothD_d > 13.7916 )
						if( ema1 <= 0.654748 )
							ret := 0.083400
						if( ema1 > 0.654748 )
							ret := 0.237975
				if( ema12 > 0.008517 )
					if( rsi1 <= 63.7075 )
						if( smoothK_k <= -0.664055 )
							ret := 0.666667
						if( smoothK_k > -0.664055 )
							ret := -0.364007
					if( rsi1 > 63.7075 )
						if( d_k <= -0.886092 )
							ret := 0.208920
						if( d_k > -0.886092 )
							ret := -0.128952
			if( rsi1 > 73.0978 )
				if( ema1 <= 0.053285 )
					if( d <= 82.7622 )
						if( rsi1 <= 77.096 )
							ret := -0.010695
						if( rsi1 > 77.096 )
							ret := -0.658824
					if( d > 82.7622 )
						if( tema <= 0.017735 )
							ret := 0.225532
						if( tema > 0.017735 )
							ret := -0.060429
				if( ema1 > 0.053285 )
					if( ema13 <= 0.07279 )
						if( d_k <= 1.53606 )
							ret := 0.532762
						if( d_k > 1.53606 )
							ret := 0.225137
					if( ema13 > 0.07279 )
						if( smoothD_d <= 26.7799 )
							ret := -0.913043 // sell
						if( smoothD_d > 26.7799 )
							ret := 0.107023
	
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
float op_operation = decision_tree_0_MATICUSDT_1Hour_bdc44611(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)

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


