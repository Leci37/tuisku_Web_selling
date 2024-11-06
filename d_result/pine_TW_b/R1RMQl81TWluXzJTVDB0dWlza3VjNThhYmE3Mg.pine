//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: GTLB_5Min_2ST0_c58aba72 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GTLB_5Min_2ST0_c58aba72", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GTLB_5Min_c58aba72(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( rsi1 <= 29.1138 )
		if( k <= 0.625337 )
			if( ema3 <= 44.6146 )
				if( ema2 <= 34.306 )
					if( d <= 0.348665 )
						ret := -0.363636
					if( d > 0.348665 )
						if( rsi1 <= 20.7324 )
							ret := 0.000000
						if( rsi1 > 20.7324 )
							ret := 0.923077 // buy
				if( ema2 > 34.306 )
					if( d_k <= 6.0102 )
						if( rsi1 <= 16.2421 )
							ret := -0.520833
						if( rsi1 > 16.2421 )
							ret := -0.982143 // sell
					if( d_k > 6.0102 )
						if( ema3 <= 42.4368 )
							ret := 1.000000 // buy
						if( ema3 > 42.4368 )
							ret := -0.250000
			if( ema3 > 44.6146 )
				if( ema12 <= -0.219218 )
					if( ema1 <= 46.8681 )
						if( ema2 <= 44.7207 )
							ret := -0.250000
						if( ema2 > 44.7207 )
							ret := 0.555556
					if( ema1 > 46.8681 )
						if( d <= 0.131812 )
							ret := 0.107692
						if( d > 0.131812 )
							ret := -0.389831
				if( ema12 > -0.219218 )
					if( d_k <= 8.29781 )
						if( ema13 <= -0.328994 )
							ret := 0.838710 // buy
						if( ema13 > -0.328994 )
							ret := 0.207273
					if( d_k > 8.29781 )
						if( ema12 <= -0.216118 )
							ret := 1.000000 // buy
						if( ema12 > -0.216118 )
							ret := -0.517857
		if( k > 0.625337 )
			if( ema13 <= -2.933 )
				if( rsi1 <= 21.8973 )
					ret := 0.666667
				if( rsi1 > 21.8973 )
					if( ema12 <= -2.91077 )
						ret := 0.000000
					if( ema12 > -2.91077 )
						ret := -1.000000 // sell
			if( ema13 > -2.933 )
				if( d_k <= -7.71949 )
					if( ema3 <= 54.7514 )
						if( smoothK_k <= 74.1279 )
							ret := -0.407563
						if( smoothK_k > 74.1279 )
							ret := 0.500000
					if( ema3 > 54.7514 )
						if( smoothD_d <= 19.8493 )
							ret := 0.735294 // buy
						if( smoothD_d > 19.8493 )
							ret := 0.000000
				if( d_k > -7.71949 )
					if( tema <= 46.7157 )
						if( ema13 <= -0.668128 )
							ret := 0.804054 // buy
						if( ema13 > -0.668128 )
							ret := 0.252720
					if( tema > 46.7157 )
						if( rsi1 <= 25.4222 )
							ret := 0.043447
						if( rsi1 > 25.4222 )
							ret := 0.284974
	if( rsi1 > 29.1138 )
		if( d <= 89.6779 )
			if( ema12 <= 1.05287 )
				if( d_k <= 2.59789 )
					if( ema12 <= 0.061609 )
						if( tema <= 51.1049 )
							ret := -0.062428
						if( tema > 51.1049 )
							ret := 0.042278
					if( ema12 > 0.061609 )
						if( ema13 <= 0.628735 )
							ret := -0.168562
						if( ema13 > 0.628735 )
							ret := 0.077778
				if( d_k > 2.59789 )
					if( k <= 82.7381 )
						if( d <= 8.87743 )
							ret := 0.205000
						if( d > 8.87743 )
							ret := 0.005552
					if( k > 82.7381 )
						if( rsi1 <= 77.0686 )
							ret := 0.166667
						if( rsi1 > 77.0686 )
							ret := 0.754717 // buy
			if( ema12 > 1.05287 )
				if( tema <= 63.3643 )
					if( d_k <= 4.89488 )
						if( ema12 <= 1.84687 )
							ret := 1.000000 // buy
						if( ema12 > 1.84687 )
							ret := 0.500000
					if( d_k > 4.89488 )
						ret := -0.066667
				if( tema > 63.3643 )
					ret := -1.000000 // sell
		if( d > 89.6779 )
			if( rsi1 <= 78.984 )
				if( ema2 <= 60.7735 )
					if( ema1 <= 53.0639 )
						if( ema13 <= 0.330303 )
							ret := 0.101623
						if( ema13 > 0.330303 )
							ret := 0.323194
					if( ema1 > 53.0639 )
						if( d <= 97.5835 )
							ret := -0.122222
						if( d > 97.5835 )
							ret := 0.201550
				if( ema2 > 60.7735 )
					if( ema2 <= 63.2598 )
						if( rsi1 <= 68.1023 )
							ret := 0.821705 // buy
						if( rsi1 > 68.1023 )
							ret := 0.385965
					if( ema2 > 63.2598 )
						if( ema3 <= 74.0458 )
							ret := 0.244660
						if( ema3 > 74.0458 )
							ret := -0.283333
			if( rsi1 > 78.984 )
				if( ema3 <= 62.173 )
					if( tema <= 56.7835 )
						if( ema3 <= 33.3861 )
							ret := 0.355140
						if( ema3 > 33.3861 )
							ret := -0.135193
					if( tema > 56.7835 )
						if( ema12 <= 0.290705 )
							ret := -0.416667
						if( ema12 > 0.290705 )
							ret := -0.829545 // sell
				if( ema3 > 62.173 )
					if( ema2 <= 71.6258 )
						if( rsi1 <= 85.1562 )
							ret := 0.300000
						if( rsi1 > 85.1562 )
							ret := 0.841270 // buy
					if( ema2 > 71.6258 )
						if( ema12 <= 0.367473 )
							ret := -0.644444
						if( ema12 > 0.367473 )
							ret := 0.258065
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_GTLB_5Min_c58aba72(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)

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


