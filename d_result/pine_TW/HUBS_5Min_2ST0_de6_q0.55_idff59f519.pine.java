//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: HUBS_5Min_2ST0_ff59f519 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_HUBS_5Min_2ST0_ff59f519", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_HUBS_5Min_ff59f519(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( ema1 <= 419.131 )
		if( d <= 65.0183 )
			if( smoothK_k <= 33.638 )
				if( tema <= 411.732 )
					if( rsi1 <= 18.912 )
						if( ema12 <= -2.35268 )
							ret := -0.391304
						if( ema12 > -2.35268 )
							ret := 0.727273 // buy
					if( rsi1 > 18.912 )
						if( ema1 <= 412.675 )
							ret := 0.655738
						if( ema1 > 412.675 )
							ret := 1.000000 // buy
				if( tema > 411.732 )
					if( d_k <= 9.9237 )
						if( ema12 <= -2.1551 )
							ret := -0.800000 // sell
						if( ema12 > -2.1551 )
							ret := 0.373288
					if( d_k > 9.9237 )
						if( smoothK_k <= 4.88766 )
							ret := 0.285714
						if( smoothK_k > 4.88766 )
							ret := -0.602941
			if( smoothK_k > 33.638 )
				if( rsi1 <= 62.5857 )
					if( ema1 <= 402.765 )
						ret := -0.300000
					if( ema1 > 402.765 )
						if( d_k <= -14.3 )
							ret := 0.435897
						if( d_k > -14.3 )
							ret := 0.828829 // buy
				if( rsi1 > 62.5857 )
					if( ema1 <= 415.634 )
						ret := 0.166667
					if( ema1 > 415.634 )
						ret := -0.428571
		if( d > 65.0183 )
			if( d <= 96.8137 )
				if( ema12 <= -0.251837 )
					if( d <= 68.7019 )
						ret := -0.105263
					if( d > 68.7019 )
						if( d <= 89.1714 )
							ret := 0.826087 // buy
						if( d > 89.1714 )
							ret := -0.214286
				if( ema12 > -0.251837 )
					if( smoothD_d <= 68.3063 )
						if( rsi1 <= 55.9015 )
							ret := 0.000000
						if( rsi1 > 55.9015 )
							ret := -1.000000 // sell
					if( smoothD_d > 68.3063 )
						if( ema3 <= 413.403 )
							ret := -0.452174
						if( ema3 > 413.403 )
							ret := 0.066986
			if( d > 96.8137 )
				if( ema12 <= 0.544526 )
					ret := -0.125000
				if( ema12 > 0.544526 )
					if( ema2 <= 415.712 )
						ret := 1.000000 // buy
					if( ema2 > 415.712 )
						ret := 0.375000
	if( ema1 > 419.131 )
		if( tema <= 614.267 )
			if( ema2 <= 424.524 )
				if( smoothD_d <= 19.7198 )
					if( smoothK_k <= 15.9037 )
						if( rsi1 <= 36.2771 )
							ret := 0.551724
						if( rsi1 > 36.2771 )
							ret := -0.184211
					if( smoothK_k > 15.9037 )
						if( d_k <= -7.00009 )
							ret := -0.055556
						if( d_k > -7.00009 )
							ret := 0.820513 // buy
				if( smoothD_d > 19.7198 )
					if( ema2 <= 418.775 )
						if( tema <= 421.343 )
							ret := 0.677419
						if( tema > 421.343 )
							ret := -0.083333
					if( ema2 > 418.775 )
						if( smoothD_d <= 83.2908 )
							ret := -0.409201
						if( smoothD_d > 83.2908 )
							ret := -0.835821 // sell
			if( ema2 > 424.524 )
				if( ema12 <= -3.10357 )
					if( tema <= 421.708 )
						if( rsi1 <= 25.4905 )
							ret := 1.000000 // buy
						if( rsi1 > 25.4905 )
							ret := 0.769231 // buy
					if( tema > 421.708 )
						if( ema3 <= 544.618 )
							ret := -0.050114
						if( ema3 > 544.618 )
							ret := -0.415973
				if( ema12 > -3.10357 )
					if( ema12 <= -1.57158 )
						if( smoothD_d <= -0.952962 )
							ret := -0.301310
						if( smoothD_d > -0.952962 )
							ret := 0.184566
					if( ema12 > -1.57158 )
						if( rsi1 <= 71.5503 )
							ret := 0.023512
						if( rsi1 > 71.5503 )
							ret := -0.098454
		if( tema > 614.267 )
			if( tema <= 619.736 )
				if( ema3 <= 621.96 )
					if( d_k <= 6.79155 )
						if( rsi1 <= 57.0567 )
							ret := -0.209932
						if( rsi1 > 57.0567 )
							ret := -0.483607
					if( d_k > 6.79155 )
						if( ema12 <= 0.150954 )
							ret := 0.274725
						if( ema12 > 0.150954 )
							ret := -0.210843
				if( ema3 > 621.96 )
					if( ema2 <= 626.944 )
						if( smoothK_k <= 59.0565 )
							ret := -0.978495 // sell
						if( smoothK_k > 59.0565 )
							ret := -0.650000
					if( ema2 > 626.944 )
						ret := 0.133333
			if( tema > 619.736 )
				if( ema3 <= 674.846 )
					if( tema <= 670.662 )
						if( smoothD_d <= 10.7947 )
							ret := -0.230950
						if( smoothD_d > 10.7947 )
							ret := -0.024891
					if( tema > 670.662 )
						if( tema <= 678.115 )
							ret := 0.536585
						if( tema > 678.115 )
							ret := -0.555556
				if( ema3 > 674.846 )
					if( k <= 7.96936 )
						if( tema <= 674.071 )
							ret := -0.600000
						if( tema > 674.071 )
							ret := 0.428571
					if( k > 7.96936 )
						if( d_k <= 3.57405 )
							ret := -0.788462 // sell
						if( d_k > 3.57405 )
							ret := -0.294118
	
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
float op_operation = decision_tree_0_HUBS_5Min_ff59f519(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)

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


