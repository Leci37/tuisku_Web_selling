//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: MDB_5Min_2ST0_a850da2a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MDB_5Min_2ST0_a850da2a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MDB_5Min_a850da2a(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( rsi1 <= 54.947 )
		if( ema12 <= -2.06384 )
			if( rsi1 <= 35.2895 )
				if( ema12 <= -5.26871 )
					if( ema2 <= 374.597 )
						if( ema2 <= 258.516 )
							ret := -0.600000
						if( ema2 > 258.516 )
							ret := 0.821429 // buy
					if( ema2 > 374.597 )
						if( smoothD_d <= 11.0012 )
							ret := -0.958333 // sell
						if( smoothD_d > 11.0012 )
							ret := -0.171429
				if( ema12 > -5.26871 )
					if( ema1 <= 443.553 )
						if( ema3 <= 239.661 )
							ret := -0.260870
						if( ema3 > 239.661 )
							ret := 0.413357
					if( ema1 > 443.553 )
						if( tema <= 459.673 )
							ret := -0.681818
						if( tema > 459.673 )
							ret := 0.225000
			if( rsi1 > 35.2895 )
				if( d_k <= -2.59135 )
					if( k <= 17.0118 )
						ret := 0.600000
					if( k > 17.0118 )
						if( d_k <= -4.8175 )
							ret := -0.589744
						if( d_k > -4.8175 )
							ret := 0.000000
				if( d_k > -2.59135 )
					if( rsi1 <= 38.6229 )
						if( ema2 <= 427.09 )
							ret := 0.000000
						if( ema2 > 427.09 )
							ret := -0.764706 // sell
					if( rsi1 > 38.6229 )
						ret := -1.000000 // sell
		if( ema12 > -2.06384 )
			if( ema3 <= 221.73 )
				if( d_k <= -11.8189 )
					if( ema3 <= 220.694 )
						if( tema <= 218.782 )
							ret := -0.826087 // sell
						if( tema > 218.782 )
							ret := -0.375000
					if( ema3 > 220.694 )
						ret := 0.375000
				if( d_k > -11.8189 )
					if( k <= 65.3799 )
						if( d_k <= 20.6001 )
							ret := 0.613169
						if( d_k > 20.6001 )
							ret := -0.187500
					if( k > 65.3799 )
						if( d <= 64.48 )
							ret := -0.727273 // sell
						if( d > 64.48 )
							ret := 0.253012
			if( ema3 > 221.73 )
				if( d <= 45.3595 )
					if( d <= 38.2115 )
						if( tema <= 390.881 )
							ret := 0.034254
						if( tema > 390.881 )
							ret := -0.062383
					if( d > 38.2115 )
						if( d_k <= -7.00011 )
							ret := 0.151020
						if( d_k > -7.00011 )
							ret := -0.253956
				if( d > 45.3595 )
					if( tema <= 475.808 )
						if( ema13 <= 0.244737 )
							ret := 0.055530
						if( ema13 > 0.244737 )
							ret := 0.192061
					if( tema > 475.808 )
						if( tema <= 499.166 )
							ret := -0.549618
						if( tema > 499.166 )
							ret := 0.583333
	if( rsi1 > 54.947 )
		if( ema12 <= 13.2977 )
			if( ema12 <= 1.21609 )
				if( smoothD_d <= 87.6596 )
					if( ema1 <= 392.253 )
						if( d_k <= -13.4414 )
							ret := 0.020863
						if( d_k > -13.4414 )
							ret := -0.129395
					if( ema1 > 392.253 )
						if( tema <= 396.986 )
							ret := 0.349693
						if( tema > 396.986 )
							ret := -0.023963
				if( smoothD_d > 87.6596 )
					if( ema3 <= 218.636 )
						if( d_k <= 0.935941 )
							ret := -1.000000 // sell
						if( d_k > 0.935941 )
							ret := 0.125000
					if( ema3 > 218.636 )
						if( tema <= 230.063 )
							ret := 0.576923
						if( tema > 230.063 )
							ret := 0.068468
			if( ema12 > 1.21609 )
				if( ema1 <= 234.865 )
					if( rsi1 <= 79.1136 )
						if( d <= 87.157 )
							ret := 0.354839
						if( d > 87.157 )
							ret := 0.929577 // buy
					if( rsi1 > 79.1136 )
						if( ema13 <= 4.8584 )
							ret := -0.426471
						if( ema13 > 4.8584 )
							ret := 1.000000 // buy
				if( ema1 > 234.865 )
					if( d_k <= 21.6214 )
						if( tema <= 408.491 )
							ret := -0.120231
						if( tema > 408.491 )
							ret := -0.326870
					if( d_k > 21.6214 )
						if( smoothD_d <= 47.0921 )
							ret := 0.000000
						if( smoothD_d > 47.0921 )
							ret := 0.836364 // buy
		if( ema12 > 13.2977 )
			ret := 1.000000 // buy
	
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
float op_operation = decision_tree_0_MDB_5Min_a850da2a(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)

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


