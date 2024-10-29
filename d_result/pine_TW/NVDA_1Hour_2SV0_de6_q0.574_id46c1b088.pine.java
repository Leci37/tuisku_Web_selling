//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: NVDA_1Hour_2SV0_46c1b088 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVDA_1Hour_2SV0_46c1b088", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVDA_1Hour_46c1b088(d, d_k, smoothK_k, k, rsi1, smoothD_d, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( smoothK_k <= 64.6733 )
		if( d <= 61.5589 )
			if( k <= 8.15397 )
				if( rsi1 <= 2.25872 )
					if( VIP <= 14.0839 )
						if( VIM <= 1.4072 )
							ret := 0.578947
						if( VIM > 1.4072 )
							ret := 0.935484 // buy
					if( VIP > 14.0839 )
						ret := -0.363636
				if( rsi1 > 2.25872 )
					if( VIP_VIM <= 0.146325 )
						if( VIP <= 1.00498 )
							ret := -0.123133
						if( VIP > 1.00498 )
							ret := 0.064782
					if( VIP_VIM > 0.146325 )
						if( d <= 27.3581 )
							ret := -0.278539
						if( d > 27.3581 )
							ret := -0.773585 // sell
			if( k > 8.15397 )
				if( rsi1 <= 18.4869 )
					if( smoothK_k <= 40.2053 )
						if( d_k <= -2.41364 )
							ret := 0.604762
						if( d_k > -2.41364 )
							ret := 0.240000
					if( smoothK_k > 40.2053 )
						ret := -0.562500
				if( rsi1 > 18.4869 )
					if( d_k <= -14.1706 )
						if( smoothK_k <= 27.8602 )
							ret := -0.372881
						if( smoothK_k > 27.8602 )
							ret := 0.154586
					if( d_k > -14.1706 )
						if( d <= 21.0941 )
							ret := 0.033125
						if( d > 21.0941 )
							ret := -0.104650
		if( d > 61.5589 )
			if( smoothD_d <= 62.2158 )
				if( VIM <= 0.878986 )
					if( VIP_VIM <= 0.40804 )
						if( rsi1 <= 72.3612 )
							ret := 0.377358
						if( rsi1 > 72.3612 )
							ret := -0.307692
					if( VIP_VIM > 0.40804 )
						if( VIP_VIM <= 0.616405 )
							ret := -0.375000
						if( VIP_VIM > 0.616405 )
							ret := -0.880000 // sell
				if( VIM > 0.878986 )
					if( rsi1 <= 28.6353 )
						if( k <= 43.8177 )
							ret := -0.400000
						if( k > 43.8177 )
							ret := 0.900000 // buy
					if( rsi1 > 28.6353 )
						if( d_k <= 11.0434 )
							ret := -0.707763 // sell
						if( d_k > 11.0434 )
							ret := -0.406250
			if( smoothD_d > 62.2158 )
				if( VIP_VIM <= -0.259795 )
					if( k <= 60.1942 )
						if( k <= 44.3252 )
							ret := -0.923077 // sell
						if( k > 44.3252 )
							ret := -0.190476
					if( k > 60.1942 )
						if( d <= 72.3111 )
							ret := -0.363636
						if( d > 72.3111 )
							ret := -0.870968 // sell
				if( VIP_VIM > -0.259795 )
					if( smoothK_k <= 60.7099 )
						if( rsi1 <= 39.2702 )
							ret := 0.388430
						if( rsi1 > 39.2702 )
							ret := -0.081384
					if( smoothK_k > 60.7099 )
						if( VIP_VIM <= 0.086595 )
							ret := -0.530726
						if( VIP_VIM > 0.086595 )
							ret := -0.072464
	if( smoothK_k > 64.6733 )
		if( VIP_VIM <= -0.315182 )
			if( d_k <= -27.3003 )
				ret := -0.933333 // sell
			if( d_k > -27.3003 )
				if( smoothD_d <= 62.9854 )
					if( d_k <= -20.8135 )
						if( k <= 81.5922 )
							ret := 0.465116
						if( k > 81.5922 )
							ret := -0.636364
					if( d_k > -20.8135 )
						if( rsi1 <= 33.0468 )
							ret := 0.785714 // buy
						if( rsi1 > 33.0468 )
							ret := 1.000000 // buy
				if( smoothD_d > 62.9854 )
					if( smoothD_d <= 80.0723 )
						if( VIP <= 0.895854 )
							ret := -0.206186
						if( VIP > 0.895854 )
							ret := 0.644444
					if( smoothD_d > 80.0723 )
						if( d_k <= -7.29565 )
							ret := -0.040000
						if( d_k > -7.29565 )
							ret := 0.732026 // buy
		if( VIP_VIM > -0.315182 )
			if( rsi1 <= 96.7401 )
				if( VIP <= 1.21257 )
					if( rsi1 <= 64.606 )
						if( rsi1 <= 52.0432 )
							ret := -0.004122
						if( rsi1 > 52.0432 )
							ret := 0.169441
					if( rsi1 > 64.606 )
						if( d_k <= -5.37732 )
							ret := 0.070707
						if( d_k > -5.37732 )
							ret := -0.153382
				if( VIP > 1.21257 )
					if( d <= 92.7426 )
						if( VIP <= 1.32014 )
							ret := 0.135836
						if( VIP > 1.32014 )
							ret := -0.064034
					if( d > 92.7426 )
						if( rsi1 <= 73.7835 )
							ret := 0.375661
						if( rsi1 > 73.7835 )
							ret := 0.179155
			if( rsi1 > 96.7401 )
				if( VIP <= 1.57081 )
					if( k <= 99.8076 )
						if( VIP <= 1.48559 )
							ret := -0.642857
						if( VIP > 1.48559 )
							ret := 0.333333
					if( k > 99.8076 )
						if( k <= 99.9978 )
							ret := -1.000000 // sell
						if( k > 99.9978 )
							ret := -0.608696
				if( VIP > 1.57081 )
					ret := 0.312500
	
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
float op_operation = decision_tree_0_NVDA_1Hour_46c1b088(d, d_k, smoothK_k, k, rsi1, smoothD_d, VIP, VIP_VIM, VIM)

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


