//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: DOCN_30Min_2SV0_8042c0af Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOCN_30Min_2SV0_8042c0af", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOCN_30Min_8042c0af(d, d_k, smoothK_k, k, rsi1, smoothD_d, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( d_k <= 6.88047 )
		if( VIP <= 0.868692 )
			if( smoothK_k <= 0.89625 )
				if( VIP <= 0.499391 )
					if( VIM <= 1.57162 )
						if( rsi1 <= 5.6473 )
							ret := -0.333333
						if( rsi1 > 5.6473 )
							ret := -0.981818 // sell
					if( VIM > 1.57162 )
						if( smoothK_k <= -0.020416 )
							ret := 0.000000
						if( smoothK_k > -0.020416 )
							ret := -1.000000 // sell
				if( VIP > 0.499391 )
					if( rsi1 <= 25.9993 )
						if( d_k <= 0.39627 )
							ret := -0.352697
						if( d_k > 0.39627 )
							ret := 0.232955
					if( rsi1 > 25.9993 )
						if( VIP_VIM <= -0.785384 )
							ret := 0.266667
						if( VIP_VIM > -0.785384 )
							ret := -0.534694
			if( smoothK_k > 0.89625 )
				if( smoothK_k <= 14.8068 )
					if( VIP <= 0.720217 )
						if( rsi1 <= 12.1042 )
							ret := 0.475410
						if( rsi1 > 12.1042 )
							ret := -0.427027
					if( VIP > 0.720217 )
						if( d <= 9.01077 )
							ret := 0.303125
						if( d > 9.01077 )
							ret := -0.004505
				if( smoothK_k > 14.8068 )
					if( VIM <= 1.46196 )
						if( rsi1 <= 38.1222 )
							ret := -0.086839
						if( rsi1 > 38.1222 )
							ret := -0.537931
					if( VIM > 1.46196 )
						if( rsi1 <= 22.0537 )
							ret := 0.333333
						if( rsi1 > 22.0537 )
							ret := -0.747573 // sell
		if( VIP > 0.868692 )
			if( smoothK_k <= 96.4585 )
				if( VIM <= 1.21318 )
					if( VIM <= 0.625655 )
						if( smoothK_k <= 94.5254 )
							ret := 0.601626
						if( smoothK_k > 94.5254 )
							ret := -0.035714
					if( VIM > 0.625655 )
						if( rsi1 <= 72.559 )
							ret := 0.061523
						if( rsi1 > 72.559 )
							ret := -0.101719
				if( VIM > 1.21318 )
					if( rsi1 <= 37.539 )
						if( smoothK_k <= 67.2183 )
							ret := 0.148483
						if( smoothK_k > 67.2183 )
							ret := -0.500000
					if( rsi1 > 37.539 )
						if( d_k <= -16.6439 )
							ret := -0.393333
						if( d_k > -16.6439 )
							ret := -0.110455
			if( smoothK_k > 96.4585 )
				if( d_k <= -9.49568 )
					if( VIM <= 0.879923 )
						if( rsi1 <= 63.2987 )
							ret := 1.000000 // buy
						if( rsi1 > 63.2987 )
							ret := -0.526316
					if( VIM > 0.879923 )
						if( VIP_VIM <= -0.177652 )
							ret := -1.000000 // sell
						if( VIP_VIM > -0.177652 )
							ret := 0.485714
				if( d_k > -9.49568 )
					if( d <= 99.9954 )
						if( VIM <= 1.27057 )
							ret := -0.371336
						if( VIM > 1.27057 )
							ret := 0.375000
					if( d > 99.9954 )
						if( VIP_VIM <= 0.374107 )
							ret := -0.312500
						if( VIP_VIM > 0.374107 )
							ret := 0.722222 // buy
	if( d_k > 6.88047 )
		if( k <= 80.3215 )
			if( d_k <= 16.1279 )
				if( k <= 10.9832 )
					if( smoothK_k <= 4.63719 )
						if( VIP <= 1.10655 )
							ret := -0.169435
						if( VIP > 1.10655 )
							ret := 0.301282
					if( smoothK_k > 4.63719 )
						if( d_k <= 9.63182 )
							ret := -0.666667
						if( d_k > 9.63182 )
							ret := -0.260274
				if( k > 10.9832 )
					if( VIP <= 0.871098 )
						if( d <= 28.4501 )
							ret := -0.136364
						if( d > 28.4501 )
							ret := 0.452381
					if( VIP > 0.871098 )
						if( VIM <= 1.20816 )
							ret := -0.020301
						if( VIM > 1.20816 )
							ret := 0.144366
			if( d_k > 16.1279 )
				if( VIM <= 1.3051 )
					if( smoothK_k <= 62.2094 )
						if( k <= 43.0504 )
							ret := 0.352877
						if( k > 43.0504 )
							ret := 0.127404
					if( smoothK_k > 62.2094 )
						if( d <= 88.1617 )
							ret := 0.916667 // buy
						if( d > 88.1617 )
							ret := 0.000000
				if( VIM > 1.3051 )
					if( rsi1 <= 35.0486 )
						if( VIM <= 1.77958 )
							ret := -0.367925
						if( VIM > 1.77958 )
							ret := 0.600000
					if( rsi1 > 35.0486 )
						if( d <= 53.9828 )
							ret := 0.413333
						if( d > 53.9828 )
							ret := -0.144144
		if( k > 80.3215 )
			if( rsi1 <= 65.5363 )
				if( VIP <= 1.06061 )
					if( VIM <= 0.916393 )
						ret := -1.000000 // sell
					if( VIM > 0.916393 )
						if( rsi1 <= 41.8965 )
							ret := 0.666667
						if( rsi1 > 41.8965 )
							ret := 0.111111
				if( VIP > 1.06061 )
					if( VIP_VIM <= 0.084035 )
						if( VIP <= 1.06621 )
							ret := 0.000000
						if( VIP > 1.06621 )
							ret := 1.000000 // buy
					if( VIP_VIM > 0.084035 )
						if( rsi1 <= 48.0936 )
							ret := -1.000000 // sell
						if( rsi1 > 48.0936 )
							ret := 0.722772 // buy
			if( rsi1 > 65.5363 )
				if( VIM <= 0.884234 )
					if( VIP <= 1.37799 )
						if( rsi1 <= 68.6777 )
							ret := -1.000000 // sell
						if( rsi1 > 68.6777 )
							ret := 0.076923
					if( VIP > 1.37799 )
						if( d <= 89.9999 )
							ret := 0.000000
						if( d > 89.9999 )
							ret := 0.807692 // buy
				if( VIM > 0.884234 )
					if( smoothK_k <= 78.7968 )
						ret := 0.333333
					if( smoothK_k > 78.7968 )
						if( d <= 93.9949 )
							ret := -0.944444 // sell
						if( d > 93.9949 )
							ret := -0.333333
	
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

//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
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
float op_operation = decision_tree_0_DOCN_30Min_8042c0af(d, d_k, smoothK_k, k, rsi1, smoothD_d, VIP, VIP_VIM, VIM)

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


