//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: SOLUSDT_1Hour_2ST0_eb7dffc5 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SOLUSDT_1Hour_2ST0_eb7dffc5", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SOLUSDT_1Hour_eb7dffc5(d_k, d, rsi1, k, smoothD_d, smoothK_k, ema1, tema, ema12, ema2, ema3, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( rsi1 <= 57.1953 )
		if( d_k <= -0.888572 )
			if( ema12 <= -0.049321 )
				if( d_k <= -5.19844 )
					if( rsi1 <= 38.6058 )
						if( smoothD_d <= 10.1872 )
							ret := 0.336493
						if( smoothD_d > 10.1872 )
							ret := -0.114631
					if( rsi1 > 38.6058 )
						if( ema12 <= -0.97487 )
							ret := 0.612686
						if( ema12 > -0.97487 )
							ret := 0.291221
				if( d_k > -5.19844 )
					if( rsi1 <= 29.7157 )
						if( d <= 7.23578 )
							ret := 0.000000
						if( d > 7.23578 )
							ret := -0.468813
					if( rsi1 > 29.7157 )
						if( rsi1 <= 48.5087 )
							ret := 0.073502
						if( rsi1 > 48.5087 )
							ret := 0.382892
			if( ema12 > -0.049321 )
				if( d <= 23.7408 )
					if( rsi1 <= 49.1461 )
						if( d_k <= -8.19752 )
							ret := 0.241636
						if( d_k > -8.19752 )
							ret := -0.141935
					if( rsi1 > 49.1461 )
						if( smoothD_d <= 2.4089 )
							ret := 0.650485
						if( smoothD_d > 2.4089 )
							ret := 0.140417
				if( d > 23.7408 )
					if( ema12 <= 0.306621 )
						if( rsi1 <= 46.8948 )
							ret := -0.297071
						if( rsi1 > 46.8948 )
							ret := -0.079084
					if( ema12 > 0.306621 )
						if( tema <= 111.148 )
							ret := -0.760000 // sell
						if( tema > 111.148 )
							ret := -0.416667
		if( d_k > -0.888572 )
			if( tema <= 8.7915 )
				if( ema12 <= -0.02162 )
					if( ema3 <= 2.25877 )
						if( smoothK_k <= 11.2176 )
							ret := 0.654206
						if( smoothK_k > 11.2176 )
							ret := 0.295775
					if( ema3 > 2.25877 )
						if( d_k <= -0.399123 )
							ret := -0.490566
						if( d_k > -0.399123 )
							ret := 0.275498
				if( ema12 > -0.02162 )
					if( d_k <= 12.5055 )
						if( rsi1 <= 29.7152 )
							ret := -0.675000
						if( rsi1 > 29.7152 )
							ret := 0.101669
					if( d_k > 12.5055 )
						if( rsi1 <= 56.4705 )
							ret := -0.272545
						if( rsi1 > 56.4705 )
							ret := 0.620690
			if( tema > 8.7915 )
				if( rsi1 <= 37.7181 )
					if( ema12 <= -0.008747 )
						if( rsi1 <= 33.1413 )
							ret := -0.476292
						if( rsi1 > 33.1413 )
							ret := -0.308761
					if( ema12 > -0.008747 )
						if( k <= 8.50579 )
							ret := -0.677725
						if( k > 8.50579 )
							ret := -0.868293 // sell
				if( rsi1 > 37.7181 )
					if( ema12 <= 0.063821 )
						if( rsi1 <= 47.8086 )
							ret := -0.161412
						if( rsi1 > 47.8086 )
							ret := 0.131826
					if( ema12 > 0.063821 )
						if( ema12 <= 0.610811 )
							ret := -0.341325
						if( ema12 > 0.610811 )
							ret := -0.621719
	if( rsi1 > 57.1953 )
		if( d_k <= 0.664485 )
			if( tema <= 5.16263 )
				if( ema13 <= 0.043897 )
					if( smoothK_k <= 91.3715 )
						if( k <= 63.8546 )
							ret := -0.440000
						if( k > 63.8546 )
							ret := 0.263930
					if( smoothK_k > 91.3715 )
						if( rsi1 <= 60.6033 )
							ret := 0.456522
						if( rsi1 > 60.6033 )
							ret := -0.444444
				if( ema13 > 0.043897 )
					if( k <= 98.1497 )
						if( ema2 <= 1.85212 )
							ret := 0.120879
						if( ema2 > 1.85212 )
							ret := -0.559880
					if( k > 98.1497 )
						if( rsi1 <= 82.5112 )
							ret := 0.116279
						if( rsi1 > 82.5112 )
							ret := -0.800000 // sell
			if( tema > 5.16263 )
				if( rsi1 <= 72.3586 )
					if( ema12 <= 0.091787 )
						if( smoothD_d <= 44.9007 )
							ret := 0.763766 // buy
						if( smoothD_d > 44.9007 )
							ret := 0.474564
					if( ema12 > 0.091787 )
						if( ema3 <= 66.61 )
							ret := 0.107407
						if( ema3 > 66.61 )
							ret := 0.416968
				if( rsi1 > 72.3586 )
					if( rsi1 <= 80.7267 )
						if( smoothD_d <= 76.01 )
							ret := 0.679274
						if( smoothD_d > 76.01 )
							ret := 0.475323
					if( rsi1 > 80.7267 )
						if( ema13 <= 0.752284 )
							ret := 0.810298 // buy
						if( ema13 > 0.752284 )
							ret := 0.604396
		if( d_k > 0.664485 )
			if( ema12 <= 0.537516 )
				if( d <= 86.9834 )
					if( d_k <= 17.2669 )
						if( ema3 <= 2.88197 )
							ret := 0.070681
						if( ema3 > 2.88197 )
							ret := 0.307730
					if( d_k > 17.2669 )
						if( smoothD_d <= 41.3505 )
							ret := 0.433333
						if( smoothD_d > 41.3505 )
							ret := -0.108871
				if( d > 86.9834 )
					if( d_k <= 2.98999 )
						if( tema <= 14.8183 )
							ret := -0.070470
						if( tema > 14.8183 )
							ret := 0.285383
					if( d_k > 2.98999 )
						if( ema12 <= 0.030974 )
							ret := 0.335878
						if( ema12 > 0.030974 )
							ret := -0.226444
			if( ema12 > 0.537516 )
				if( rsi1 <= 63.4586 )
					if( smoothK_k <= 23.4622 )
						if( ema13 <= 2.72291 )
							ret := 0.315152
						if( ema13 > 2.72291 )
							ret := -0.233766
					if( smoothK_k > 23.4622 )
						if( d_k <= 7.12965 )
							ret := -0.288184
						if( d_k > 7.12965 )
							ret := -0.576046
				if( rsi1 > 63.4586 )
					if( ema2 <= 34.8503 )
						if( d <= 94.1443 )
							ret := -0.269625
						if( d > 94.1443 )
							ret := -0.754237 // sell
					if( ema2 > 34.8503 )
						if( d_k <= 5.37159 )
							ret := 0.263293
						if( d_k > 5.37159 )
							ret := -0.052521
	
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
float op_operation = decision_tree_0_SOLUSDT_1Hour_eb7dffc5(d_k, d, rsi1, k, smoothD_d, smoothK_k, ema1, tema, ema12, ema2, ema3, ema13)

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


