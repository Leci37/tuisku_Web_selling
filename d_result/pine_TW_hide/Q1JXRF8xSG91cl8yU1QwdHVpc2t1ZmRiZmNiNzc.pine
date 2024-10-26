//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: CRWD_1Hour_2ST0_fdbfcb77 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_1Hour_2ST0_fdbfcb77", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_1Hour_fdbfcb77(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( d <= 49.0509 )
		if( ema12 <= -3.24792 )
			if( d <= 35.0464 )
				if( ema2 <= 216.543 )
					if( rsi1 <= 26.2319 )
						if( smoothK_k <= 10.9229 )
							ret := 0.686364
						if( smoothK_k > 10.9229 )
							ret := 0.131148
					if( rsi1 > 26.2319 )
						if( smoothK_k <= 0.771919 )
							ret := -0.700000 // sell
						if( smoothK_k > 0.771919 )
							ret := 0.256410
				if( ema2 > 216.543 )
					if( smoothK_k <= -2.33647 )
						if( ema3 <= 335.516 )
							ret := 0.722222 // buy
						if( ema3 > 335.516 )
							ret := 0.000000
					if( smoothK_k > -2.33647 )
						if( rsi1 <= 25.046 )
							ret := -0.178082
						if( rsi1 > 25.046 )
							ret := 0.528302
			if( d > 35.0464 )
				if( d_k <= -8.81918 )
					ret := 0.700000 // buy
				if( d_k > -8.81918 )
					if( ema3 <= 163.838 )
						ret := 1.000000 // buy
					if( ema3 > 163.838 )
						if( rsi1 <= 18.984 )
							ret := 1.000000 // buy
						if( rsi1 > 18.984 )
							ret := -0.771429 // sell
		if( ema12 > -3.24792 )
			if( ema13 <= -0.85717 )
				if( ema1 <= 33.9788 )
					ret := 1.000000 // buy
				if( ema1 > 33.9788 )
					if( ema3 <= 54.359 )
						if( ema13 <= -1.06402 )
							ret := -0.710983 // sell
						if( ema13 > -1.06402 )
							ret := 0.159091
					if( ema3 > 54.359 )
						if( rsi1 <= 14.362 )
							ret := 0.446078
						if( rsi1 > 14.362 )
							ret := -0.144350
			if( ema13 > -0.85717 )
				if( ema3 <= 48.9181 )
					if( ema13 <= -0.393022 )
						if( ema3 <= 46.7268 )
							ret := -0.666667
						if( ema3 > 46.7268 )
							ret := 0.475000
					if( ema13 > -0.393022 )
						if( rsi1 <= 58.9108 )
							ret := 0.881579 // buy
						if( rsi1 > 58.9108 )
							ret := 0.066667
				if( ema3 > 48.9181 )
					if( ema2 <= 259.966 )
						if( smoothK_k <= -1.86381 )
							ret := 0.220657
						if( smoothK_k > -1.86381 )
							ret := -0.018166
					if( ema2 > 259.966 )
						if( ema1 <= 267.475 )
							ret := -0.609137
						if( ema1 > 267.475 )
							ret := -0.115237
	if( d > 49.0509 )
		if( d_k <= -22.2548 )
			if( ema13 <= 11.3802 )
				if( rsi1 <= 44.9387 )
					if( tema <= 137.729 )
						ret := -0.600000
					if( tema > 137.729 )
						if( k <= 76.958 )
							ret := 1.000000 // buy
						if( k > 76.958 )
							ret := 0.062500
				if( rsi1 > 44.9387 )
					if( smoothD_d <= 61.38 )
						if( rsi1 <= 66.7701 )
							ret := 0.733333 // buy
						if( rsi1 > 66.7701 )
							ret := 0.386364
					if( smoothD_d > 61.38 )
						if( ema3 <= 209.422 )
							ret := 0.471910
						if( ema3 > 209.422 )
							ret := 0.000000
			if( ema13 > 11.3802 )
				ret := -1.000000 // sell
		if( d_k > -22.2548 )
			if( ema1 <= 340.884 )
				if( ema12 <= 0.618953 )
					if( ema12 <= 0.105447 )
						if( tema <= 78.9458 )
							ret := -0.241162
						if( tema > 78.9458 )
							ret := 0.089137
					if( ema12 > 0.105447 )
						if( ema3 <= 123.311 )
							ret := 0.340249
						if( ema3 > 123.311 )
							ret := 0.097619
				if( ema12 > 0.618953 )
					if( ema12 <= 2.32568 )
						if( rsi1 <= 85.9264 )
							ret := -0.017691
						if( rsi1 > 85.9264 )
							ret := -0.302405
					if( ema12 > 2.32568 )
						if( ema1 <= 136.143 )
							ret := 0.788618 // buy
						if( ema1 > 136.143 )
							ret := 0.093248
			if( ema1 > 340.884 )
				if( ema13 <= -0.591627 )
					if( ema3 <= 363.749 )
						if( ema3 <= 347.678 )
							ret := 0.000000
						if( ema3 > 347.678 )
							ret := -0.982143 // sell
					if( ema3 > 363.749 )
						if( tema <= 376.502 )
							ret := 0.000000
						if( tema > 376.502 )
							ret := -0.833333 // sell
				if( ema13 > -0.591627 )
					if( d <= 92.5212 )
						if( rsi1 <= 76.7952 )
							ret := -0.025000
						if( rsi1 > 76.7952 )
							ret := 0.655172
					if( d > 92.5212 )
						if( ema13 <= 5.15178 )
							ret := -0.368421
						if( ema13 > 5.15178 )
							ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_CRWD_1Hour_fdbfcb77(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)

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


