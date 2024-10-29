//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: RUN_30Min_2ST0_e8ba7add Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_RUN_30Min_2ST0_e8ba7add", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_RUN_30Min_e8ba7add(d_k, d, rsi1, k, smoothD_d, smoothK_k, ema1, tema, ema12, ema2, ema3, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( ema3 <= 24.198 )
		if( ema1 <= 23.5734 )
			if( ema12 <= -0.403317 )
				if( d_k <= -0.916184 )
					if( rsi1 <= 25.4445 )
						if( ema1 <= 12.7158 )
							ret := -0.937500 // sell
						if( ema1 > 12.7158 )
							ret := 0.612069
					if( rsi1 > 25.4445 )
						if( tema <= 21.616 )
							ret := -0.538462
						if( tema > 21.616 )
							ret := 0.550000
				if( d_k > -0.916184 )
					if( ema2 <= 14.3895 )
						if( rsi1 <= 40.2424 )
							ret := 0.960784 // buy
						if( rsi1 > 40.2424 )
							ret := 0.000000
					if( ema2 > 14.3895 )
						if( ema1 <= 18.0742 )
							ret := -0.042857
						if( ema1 > 18.0742 )
							ret := 0.486188
			if( ema12 > -0.403317 )
				if( ema1 <= 5.02411 )
					if( tema <= 4.7155 )
						if( d_k <= 2.14417 )
							ret := 0.368421
						if( d_k > 2.14417 )
							ret := 0.976190 // buy
					if( tema > 4.7155 )
						if( ema13 <= -0.069097 )
							ret := -0.236842
						if( ema13 > -0.069097 )
							ret := 0.260586
				if( ema1 > 5.02411 )
					if( d_k <= -2.39451 )
						if( ema12 <= 0.130087 )
							ret := -0.004737
						if( ema12 > 0.130087 )
							ret := -0.241333
					if( d_k > -2.39451 )
						if( ema13 <= 0.740011 )
							ret := 0.028495
						if( ema13 > 0.740011 )
							ret := 0.429185
		if( ema1 > 23.5734 )
			if( ema13 <= -0.005934 )
				if( d <= 88.2952 )
					if( d_k <= -14.1144 )
						if( ema3 <= 24.0552 )
							ret := -0.937500 // sell
						if( ema3 > 24.0552 )
							ret := 0.200000
					if( d_k > -14.1144 )
						if( smoothD_d <= 7.55566 )
							ret := -0.478261
						if( smoothD_d > 7.55566 )
							ret := 0.280576
				if( d > 88.2952 )
					if( ema1 <= 23.6887 )
						ret := 0.000000
					if( ema1 > 23.6887 )
						ret := -1.000000 // sell
			if( ema13 > -0.005934 )
				if( tema <= 23.8052 )
					if( d_k <= 8.80856 )
						if( rsi1 <= 65.7753 )
							ret := 0.910256 // buy
						if( rsi1 > 65.7753 )
							ret := 0.000000
					if( d_k > 8.80856 )
						ret := 0.272727
				if( tema > 23.8052 )
					if( rsi1 <= 79.3326 )
						if( tema <= 24.7647 )
							ret := 0.214876
						if( tema > 24.7647 )
							ret := 0.610687
					if( rsi1 > 79.3326 )
						if( ema13 <= 1.22687 )
							ret := -0.076923
						if( ema13 > 1.22687 )
							ret := -0.866667 // sell
	if( ema3 > 24.198 )
		if( ema2 <= 29.7712 )
			if( smoothD_d <= 4.89804 )
				if( ema12 <= -0.577003 )
					if( k <= 3.04992 )
						if( d_k <= -1.54227 )
							ret := 0.000000
						if( d_k > -1.54227 )
							ret := 0.972222 // buy
					if( k > 3.04992 )
						if( d_k <= -1.70567 )
							ret := -0.500000
						if( d_k > -1.70567 )
							ret := 0.833333 // buy
				if( ema12 > -0.577003 )
					if( smoothD_d <= 2.27971 )
						if( rsi1 <= 20.8641 )
							ret := -0.490385
						if( rsi1 > 20.8641 )
							ret := 0.000000
					if( smoothD_d > 2.27971 )
						if( d_k <= 4.29798 )
							ret := 0.470588
						if( d_k > 4.29798 )
							ret := -0.409091
			if( smoothD_d > 4.89804 )
				if( d <= 98.8691 )
					if( smoothD_d <= 84.3123 )
						if( k <= 66.1732 )
							ret := -0.161545
						if( k > 66.1732 )
							ret := -0.337931
					if( smoothD_d > 84.3123 )
						if( rsi1 <= 55.2687 )
							ret := -0.331492
						if( rsi1 > 55.2687 )
							ret := 0.145320
				if( d > 98.8691 )
					if( ema2 <= 25.1146 )
						if( ema1 <= 24.2907 )
							ret := 0.000000
						if( ema1 > 24.2907 )
							ret := 0.666667
					if( ema2 > 25.1146 )
						if( d <= 99.3949 )
							ret := -0.444444
						if( d > 99.3949 )
							ret := -0.918919 // sell
		if( ema2 > 29.7712 )
			if( d_k <= 6.91233 )
				if( rsi1 <= 83.5634 )
					if( ema12 <= 0.697347 )
						if( tema <= 31.0493 )
							ret := 0.115778
						if( tema > 31.0493 )
							ret := -0.053725
					if( ema12 > 0.697347 )
						if( smoothK_k <= 77.9021 )
							ret := 0.044025
						if( smoothK_k > 77.9021 )
							ret := -0.373832
				if( rsi1 > 83.5634 )
					if( d_k <= -0.045446 )
						if( tema <= 34.9274 )
							ret := -0.380952
						if( tema > 34.9274 )
							ret := 0.650350
					if( d_k > -0.045446 )
						if( ema12 <= 0.591426 )
							ret := 0.428571
						if( ema12 > 0.591426 )
							ret := -0.126437
			if( d_k > 6.91233 )
				if( ema1 <= 30.4922 )
					if( rsi1 <= 42.6234 )
						if( rsi1 <= 35.3262 )
							ret := 0.531250
						if( rsi1 > 35.3262 )
							ret := 0.937500 // buy
					if( rsi1 > 42.6234 )
						if( smoothD_d <= 55.7297 )
							ret := -0.666667
						if( smoothD_d > 55.7297 )
							ret := 0.303030
				if( ema1 > 30.4922 )
					if( ema3 <= 65.6728 )
						if( ema13 <= -1.318 )
							ret := 0.578512
						if( ema13 > -1.318 )
							ret := -0.002558
					if( ema3 > 65.6728 )
						if( rsi1 <= 37.0773 )
							ret := 0.000000
						if( rsi1 > 37.0773 )
							ret := 0.397695
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_RUN_30Min_e8ba7add(d_k, d, rsi1, k, smoothD_d, smoothK_k, ema1, tema, ema12, ema2, ema3, ema13)

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


