//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: ADAUSDT_1Hour_2ST0_2826d734 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADAUSDT_1Hour_2ST0_2826d734", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADAUSDT_1Hour_2826d734(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( rsi1 <= 57.6441 )
		if( d_k <= -0.790362 )
			if( ema12 <= -0.000262 )
				if( rsi1 <= 45.1754 )
					if( d_k <= -9.44536 )
						if( ema12 <= -0.005614 )
							ret := 0.275546
						if( ema12 > -0.005614 )
							ret := 0.043135
					if( d_k > -9.44536 )
						if( k <= 98.5268 )
							ret := -0.063896
						if( k > 98.5268 )
							ret := 0.698630
				if( rsi1 > 45.1754 )
					if( rsi1 <= 53.1846 )
						if( ema12 <= -0.001208 )
							ret := 0.423848
						if( ema12 > -0.001208 )
							ret := 0.104662
					if( rsi1 > 53.1846 )
						if( k <= 66.4906 )
							ret := 0.753388 // buy
						if( k > 66.4906 )
							ret := 0.466667
			if( ema12 > -0.000262 )
				if( ema12 <= 0.001795 )
					if( rsi1 <= 49.73 )
						if( ema3 <= 0.055409 )
							ret := -0.003425
						if( ema3 > 0.055409 )
							ret := -0.264000
					if( rsi1 > 49.73 )
						if( tema <= 0.219079 )
							ret := -0.123344
						if( tema > 0.219079 )
							ret := 0.096139
				if( ema12 > 0.001795 )
					if( rsi1 <= 50.4562 )
						if( d_k <= -5.83444 )
							ret := -0.404762
						if( d_k > -5.83444 )
							ret := -0.732824 // sell
					if( rsi1 > 50.4562 )
						if( ema13 <= -0.002395 )
							ret := 0.619048
						if( ema13 > -0.002395 )
							ret := -0.257053
		if( d_k > -0.790362 )
			if( ema12 <= 0.00099 )
				if( tema <= 0.264197 )
					if( ema12 <= 0.000211 )
						if( rsi1 <= 42.7197 )
							ret := -0.038138
						if( rsi1 > 42.7197 )
							ret := 0.180010
					if( ema12 > 0.000211 )
						if( rsi1 <= 48.7102 )
							ret := -0.568282
						if( rsi1 > 48.7102 )
							ret := -0.125806
				if( tema > 0.264197 )
					if( rsi1 <= 39.8117 )
						if( ema12 <= -0.007233 )
							ret := -0.237810
						if( ema12 > -0.007233 )
							ret := -0.499459
					if( rsi1 > 39.8117 )
						if( ema12 <= -0.002382 )
							ret := 0.305389
						if( ema12 > -0.002382 )
							ret := -0.038122
			if( ema12 > 0.00099 )
				if( ema3 <= 0.968266 )
					if( ema12 <= 0.003029 )
						if( rsi1 <= 54.7255 )
							ret := -0.524503
						if( rsi1 > 54.7255 )
							ret := -0.219512
					if( ema12 > 0.003029 )
						if( d <= 22.3505 )
							ret := -0.450980
						if( d > 22.3505 )
							ret := -0.740741 // sell
				if( ema3 > 0.968266 )
					if( rsi1 <= 51.0066 )
						if( ema12 <= 0.002801 )
							ret := -0.200627
						if( ema12 > 0.002801 )
							ret := -0.643678
					if( rsi1 > 51.0066 )
						if( tema <= 2.29778 )
							ret := -0.275982
						if( tema > 2.29778 )
							ret := 0.418605
	if( rsi1 > 57.6441 )
		if( ema13 <= 0 )
			if( ema12 <= -0.000151 )
				if( ema1 <= 0.162799 )
					if( d <= 39.2424 )
						ret := -0.692308
					if( d > 39.2424 )
						if( k <= 84.2497 )
							ret := 0.181818
						if( k > 84.2497 )
							ret := 0.850000 // buy
				if( ema1 > 0.162799 )
					if( ema12 <= -0.000883 )
						if( smoothK_k <= 87.4529 )
							ret := 0.881579 // buy
						if( smoothK_k > 87.4529 )
							ret := 0.666667
					if( ema12 > -0.000883 )
						if( tema <= 0.242804 )
							ret := 0.950000 // buy
						if( tema > 0.242804 )
							ret := 0.603448
			if( ema12 > -0.000151 )
				if( rsi1 <= 61.9445 )
					if( k <= 93.1172 )
						if( d_k <= -21.7548 )
							ret := -0.153846
						if( d_k > -21.7548 )
							ret := 0.555556
					if( k > 93.1172 )
						if( ema2 <= 0.596552 )
							ret := 0.299320
						if( ema2 > 0.596552 )
							ret := -0.362500
				if( rsi1 > 61.9445 )
					if( ema1 <= 0.090444 )
						if( rsi1 <= 64.9909 )
							ret := 0.300000
						if( rsi1 > 64.9909 )
							ret := -0.466667
					if( ema1 > 0.090444 )
						if( ema12 <= 0.002645 )
							ret := 0.607477
						if( ema12 > 0.002645 )
							ret := 0.031250
		if( ema13 > 0 )
			if( rsi1 <= 69.8121 )
				if( ema12 <= 0.003653 )
					if( ema2 <= 0.462052 )
						if( ema12 <= 0.002724 )
							ret := 0.157684
						if( ema12 > 0.002724 )
							ret := -0.167715
					if( ema2 > 0.462052 )
						if( d_k <= -0.616729 )
							ret := 0.522273
						if( d_k > -0.616729 )
							ret := 0.309932
				if( ema12 > 0.003653 )
					if( smoothK_k <= 94.8927 )
						if( rsi1 <= 64.9971 )
							ret := -0.268081
						if( rsi1 > 64.9971 )
							ret := -0.041741
					if( smoothK_k > 94.8927 )
						if( rsi1 <= 61.3907 )
							ret := -0.447368
						if( rsi1 > 61.3907 )
							ret := 0.648810
			if( rsi1 > 69.8121 )
				if( d_k <= 0.940135 )
					if( ema2 <= 0.183476 )
						if( ema12 <= 0.005122 )
							ret := 0.156415
						if( ema12 > 0.005122 )
							ret := -0.947368 // sell
					if( ema2 > 0.183476 )
						if( ema13 <= 0.057009 )
							ret := 0.513630
						if( ema13 > 0.057009 )
							ret := -0.016260
				if( d_k > 0.940135 )
					if( tema <= 2.06275 )
						if( ema12 <= 0.043098 )
							ret := 0.171330
						if( ema12 > 0.043098 )
							ret := 0.712121 // buy
					if( tema > 2.06275 )
						if( d_k <= 13.5724 )
							ret := -0.419048
						if( d_k > 13.5724 )
							ret := 0.875000 // buy
	
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
float op_operation = decision_tree_0_ADAUSDT_1Hour_2826d734(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)

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


