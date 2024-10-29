//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: MELI_5Min_2ST0_bd2a00c2 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MELI_5Min_2ST0_bd2a00c2", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MELI_5Min_bd2a00c2(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( ema3 <= 1184.87 )
		if( ema13 <= -8.66169 )
			if( d <= 95.0357 )
				if( d_k <= 12.2802 )
					if( tema <= 1074.17 )
						ret := 0.400000
					if( tema > 1074.17 )
						if( ema3 <= 1182.63 )
							ret := -0.872340 // sell
						if( ema3 > 1182.63 )
							ret := 0.000000
				if( d_k > 12.2802 )
					if( rsi1 <= 28.7189 )
						ret := 0.800000 // buy
					if( rsi1 > 28.7189 )
						ret := 1.000000 // buy
			if( d > 95.0357 )
				if( ema3 <= 1172.35 )
					ret := -0.400000
				if( ema3 > 1172.35 )
					if( k <= 99.9936 )
						ret := 1.000000 // buy
					if( k > 99.9936 )
						ret := 0.000000
		if( ema13 > -8.66169 )
			if( ema13 <= -1.60389 )
				if( d_k <= 26.2242 )
					if( ema1 <= 1144.47 )
						if( d_k <= 0.486121 )
							ret := -0.245902
						if( d_k > 0.486121 )
							ret := 0.684211
					if( ema1 > 1144.47 )
						if( d_k <= -5.43325 )
							ret := 0.796209 // buy
						if( d_k > -5.43325 )
							ret := 0.420339
				if( d_k > 26.2242 )
					ret := -1.000000 // sell
			if( ema13 > -1.60389 )
				if( ema2 <= 1118.64 )
					if( k <= 75.268 )
						if( smoothD_d <= 2.20387 )
							ret := 0.142857
						if( smoothD_d > 2.20387 )
							ret := 0.842593 // buy
					if( k > 75.268 )
						if( d <= 78.9039 )
							ret := -0.882353 // sell
						if( d > 78.9039 )
							ret := 0.610390
				if( ema2 > 1118.64 )
					if( ema3 <= 1171.05 )
						if( ema2 <= 1171.49 )
							ret := -0.052707
						if( ema2 > 1171.49 )
							ret := -0.781818 // sell
					if( ema3 > 1171.05 )
						if( smoothK_k <= 30.5822 )
							ret := 0.715517 // buy
						if( smoothK_k > 30.5822 )
							ret := 0.045872
	if( ema3 > 1184.87 )
		if( tema <= 1188.13 )
			if( rsi1 <= 19.079 )
				if( ema3 <= 1186.49 )
					ret := 0.000000
				if( ema3 > 1186.49 )
					if( d_k <= 5.0139 )
						if( smoothK_k <= -2.96212 )
							ret := 0.000000
						if( smoothK_k > -2.96212 )
							ret := -0.929204 // sell
					if( d_k > 5.0139 )
						ret := 1.000000 // buy
			if( rsi1 > 19.079 )
				if( smoothK_k <= 3.47872 )
					if( smoothK_k <= -1.95192 )
						ret := 0.066667
					if( smoothK_k > -1.95192 )
						ret := 0.909091 // buy
				if( smoothK_k > 3.47872 )
					if( ema3 <= 1186.67 )
						if( k <= 22.6602 )
							ret := 0.444444
						if( k > 22.6602 )
							ret := -0.210526
					if( ema3 > 1186.67 )
						if( smoothD_d <= 76.7593 )
							ret := -0.765957 // sell
						if( smoothD_d > 76.7593 )
							ret := 0.166667
		if( tema > 1188.13 )
			if( ema2 <= 2133.8 )
				if( ema1 <= 1203.7 )
					if( d <= 78.9977 )
						if( ema1 <= 1195.07 )
							ret := -0.359712
						if( ema1 > 1195.07 )
							ret := 0.220000
					if( d > 78.9977 )
						if( tema <= 1206.37 )
							ret := 0.611296
						if( tema > 1206.37 )
							ret := -0.328125
				if( ema1 > 1203.7 )
					if( ema13 <= -28.5445 )
						if( ema3 <= 1660.83 )
							ret := -0.666667
						if( ema3 > 1660.83 )
							ret := 0.790123 // buy
					if( ema13 > -28.5445 )
						if( rsi1 <= 11.2856 )
							ret := -0.445513
						if( rsi1 > 11.2856 )
							ret := -0.012472
			if( ema2 > 2133.8 )
				if( tema <= 2133.13 )
					ret := -0.142857
				if( tema > 2133.13 )
					if( rsi1 <= 35.5763 )
						ret := 0.000000
					if( rsi1 > 35.5763 )
						ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_MELI_5Min_bd2a00c2(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)

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


