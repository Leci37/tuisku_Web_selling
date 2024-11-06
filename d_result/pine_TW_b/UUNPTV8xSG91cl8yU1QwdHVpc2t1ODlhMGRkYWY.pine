//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: QCOM_1Hour_2ST0_89a0ddaf Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_QCOM_1Hour_2ST0_89a0ddaf", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_QCOM_1Hour_89a0ddaf(rsi1, d, k, smoothD_d, d_k, smoothK_k, ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( ema1 <= 171.929 )
		if( ema12 <= 1.75673 )
			if( d_k <= -4.74547 )
				if( ema13 <= -2.32148 )
					if( ema3 <= 127.293 )
						if( d_k <= -10.1483 )
							ret := -0.362069
						if( d_k > -10.1483 )
							ret := 0.425532
					if( ema3 > 127.293 )
						if( ema12 <= -1.69339 )
							ret := 0.069767
						if( ema12 > -1.69339 )
							ret := 0.737705 // buy
				if( ema13 > -2.32148 )
					if( rsi1 <= 39.0405 )
						if( smoothK_k <= 63.8323 )
							ret := -0.131474
						if( smoothK_k > 63.8323 )
							ret := 0.224066
					if( rsi1 > 39.0405 )
						if( rsi1 <= 56.2737 )
							ret := 0.176187
						if( rsi1 > 56.2737 )
							ret := 0.008699
			if( d_k > -4.74547 )
				if( ema13 <= 1.85006 )
					if( tema <= 165.173 )
						if( tema <= 113.851 )
							ret := 0.026332
						if( tema > 113.851 )
							ret := -0.053867
					if( tema > 165.173 )
						if( d_k <= 15.4249 )
							ret := 0.057647
						if( d_k > 15.4249 )
							ret := 0.554795
				if( ema13 > 1.85006 )
					if( tema <= 82.6263 )
						if( d <= 84.9275 )
							ret := -0.344828
						if( d > 84.9275 )
							ret := -0.936508 // sell
					if( tema > 82.6263 )
						if( rsi1 <= 65.7405 )
							ret := 0.256410
						if( rsi1 > 65.7405 )
							ret := -0.177871
		if( ema12 > 1.75673 )
			if( ema1 <= 115.918 )
				if( tema <= 104.734 )
					if( d_k <= -0.02693 )
						ret := 0.823529 // buy
					if( d_k > -0.02693 )
						ret := 1.000000 // buy
				if( tema > 104.734 )
					if( ema1 <= 107.314 )
						ret := -0.300000
					if( ema1 > 107.314 )
						if( rsi1 <= 83.8313 )
							ret := 1.000000 // buy
						if( rsi1 > 83.8313 )
							ret := 0.818182 // buy
			if( ema1 > 115.918 )
				if( tema <= 170.807 )
					if( rsi1 <= 88.9314 )
						if( k <= 85.2771 )
							ret := 0.300000
						if( k > 85.2771 )
							ret := -0.309859
					if( rsi1 > 88.9314 )
						if( d <= 99.7213 )
							ret := 0.763158 // buy
						if( d > 99.7213 )
							ret := -0.181818
				if( tema > 170.807 )
					if( rsi1 <= 78.6217 )
						ret := 1.000000 // buy
					if( rsi1 > 78.6217 )
						ret := 0.625000
	if( ema1 > 171.929 )
		if( ema3 <= 174.618 )
			if( d_k <= -5.27851 )
				if( ema1 <= 173.367 )
					if( ema2 <= 172.127 )
						ret := 0.538462
					if( ema2 > 172.127 )
						ret := -0.166667
				if( ema1 > 173.367 )
					ret := 0.750000 // buy
			if( d_k > -5.27851 )
				if( tema <= 177.221 )
					if( d <= 8.26418 )
						if( ema12 <= 0.487262 )
							ret := -0.300000
						if( ema12 > 0.487262 )
							ret := 0.909091 // buy
					if( d > 8.26418 )
						if( rsi1 <= 62.8733 )
							ret := -0.808989 // sell
						if( rsi1 > 62.8733 )
							ret := -0.443662
				if( tema > 177.221 )
					if( ema2 <= 174.31 )
						ret := 0.600000
					if( ema2 > 174.31 )
						ret := -0.300000
		if( ema3 > 174.618 )
			if( smoothD_d <= 2.9079 )
				if( ema3 <= 205.088 )
					if( ema13 <= -1.63262 )
						if( ema1 <= 176.679 )
							ret := 0.696970
						if( ema1 > 176.679 )
							ret := -0.245098
					if( ema13 > -1.63262 )
						if( ema13 <= -0.409613 )
							ret := -0.815385 // sell
						if( ema13 > -0.409613 )
							ret := -0.081633
				if( ema3 > 205.088 )
					if( smoothK_k <= -2.8648 )
						ret := -0.166667
					if( smoothK_k > -2.8648 )
						if( d <= 3.92397 )
							ret := -0.918605 // sell
						if( d > 3.92397 )
							ret := -0.642857
			if( smoothD_d > 2.9079 )
				if( rsi1 <= 44.3143 )
					if( ema3 <= 208.553 )
						if( ema2 <= 181.462 )
							ret := -0.030457
						if( ema2 > 181.462 )
							ret := 0.442724
					if( ema3 > 208.553 )
						if( ema1 <= 211.335 )
							ret := -0.633333
						if( ema1 > 211.335 )
							ret := 0.000000
				if( rsi1 > 44.3143 )
					if( ema2 <= 215.673 )
						if( ema1 <= 182.113 )
							ret := 0.094037
						if( ema1 > 182.113 )
							ret := -0.238569
					if( ema2 > 215.673 )
						if( smoothK_k <= 72.8408 )
							ret := -0.272727
						if( smoothK_k > 72.8408 )
							ret := 0.891892 // buy
	
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
float op_operation = decision_tree_0_QCOM_1Hour_89a0ddaf(rsi1, d, k, smoothD_d, d_k, smoothK_k, ema2, ema1, ema12, ema3, ema13, tema)

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


