//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: ATOMUSDT_1Hour_2SV0_e9c6a238 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ATOMUSDT_1Hour_2SV0_e9c6a238", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ATOMUSDT_1Hour_e9c6a238(rsi1, smoothK_k, d_k, k, d, smoothD_d, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( d_k <= -0.189382 )
		if( rsi1 <= 53.3524 )
			if( VIP_VIM <= -0.099244 )
				if( rsi1 <= 43.8166 )
					if( VIP <= 0.79531 )
						if( rsi1 <= 31.5685 )
							ret := 0.253292
						if( rsi1 > 31.5685 )
							ret := 0.458291
					if( VIP > 0.79531 )
						if( rsi1 <= 36.4393 )
							ret := -0.267265
						if( rsi1 > 36.4393 )
							ret := 0.081723
				if( rsi1 > 43.8166 )
					if( VIP_VIM <= -0.183145 )
						if( rsi1 <= 47.1488 )
							ret := 0.441514
						if( rsi1 > 47.1488 )
							ret := 0.594972
					if( VIP_VIM > -0.183145 )
						if( d_k <= -9.37834 )
							ret := 0.074334
						if( d_k > -9.37834 )
							ret := 0.268409
			if( VIP_VIM > -0.099244 )
				if( VIP_VIM <= 0.000922 )
					if( rsi1 <= 48.6791 )
						if( rsi1 <= 42.3945 )
							ret := -0.487871
						if( rsi1 > 42.3945 )
							ret := -0.165450
					if( rsi1 > 48.6791 )
						if( k <= 33.0346 )
							ret := 0.323353
						if( k > 33.0346 )
							ret := -0.041262
				if( VIP_VIM > 0.000922 )
					if( smoothD_d <= 82.2173 )
						if( VIM <= 0.929174 )
							ret := -0.741259 // sell
						if( VIM > 0.929174 )
							ret := -0.345374
					if( smoothD_d > 82.2173 )
						if( VIM <= 0.951549 )
							ret := -0.650000
						if( VIM > 0.951549 )
							ret := 0.195122
		if( rsi1 > 53.3524 )
			if( VIP <= 1.00027 )
				if( VIP_VIM <= -0.099623 )
					if( d <= 93.1305 )
						if( rsi1 <= 62.7318 )
							ret := 0.712828 // buy
						if( rsi1 > 62.7318 )
							ret := 0.436782
					if( d > 93.1305 )
						if( k <= 99.928 )
							ret := 0.437500
						if( k > 99.928 )
							ret := 0.000000
				if( VIP_VIM > -0.099623 )
					if( rsi1 <= 61.1791 )
						if( VIM <= 1.00756 )
							ret := 0.245243
						if( VIM > 1.00756 )
							ret := 0.434322
					if( rsi1 > 61.1791 )
						if( smoothD_d <= 84.4669 )
							ret := 0.701389 // buy
						if( smoothD_d > 84.4669 )
							ret := 0.288462
			if( VIP > 1.00027 )
				if( rsi1 <= 67.0293 )
					if( VIP_VIM <= 0.21149 )
						if( d_k <= -6.05923 )
							ret := 0.127854
						if( d_k > -6.05923 )
							ret := 0.263847
					if( VIP_VIM > 0.21149 )
						if( d_k <= -6.36074 )
							ret := -0.290957
						if( d_k > -6.36074 )
							ret := 0.037322
				if( rsi1 > 67.0293 )
					if( VIP_VIM <= 0.309867 )
						if( rsi1 <= 71.7111 )
							ret := 0.368641
						if( rsi1 > 71.7111 )
							ret := 0.652738
					if( VIP_VIM > 0.309867 )
						if( d_k <= -6.45158 )
							ret := 0.016684
						if( d_k > -6.45158 )
							ret := 0.267905
	if( d_k > -0.189382 )
		if( rsi1 <= 45.5915 )
			if( VIP_VIM <= -0.024337 )
				if( rsi1 <= 28.5978 )
					if( VIP_VIM <= -0.407103 )
						if( d <= 0.338333 )
							ret := -0.650485
						if( d > 0.338333 )
							ret := -0.096260
					if( VIP_VIM > -0.407103 )
						if( VIP_VIM <= -0.259008 )
							ret := -0.503106
						if( VIP_VIM > -0.259008 )
							ret := -0.732026 // sell
				if( rsi1 > 28.5978 )
					if( VIP_VIM <= -0.161301 )
						if( rsi1 <= 40.4553 )
							ret := -0.016150
						if( rsi1 > 40.4553 )
							ret := 0.310954
					if( VIP_VIM > -0.161301 )
						if( rsi1 <= 38.2293 )
							ret := -0.526622
						if( rsi1 > 38.2293 )
							ret := -0.107629
			if( VIP_VIM > -0.024337 )
				if( VIM <= 1.00673 )
					if( d_k <= 8.7189 )
						if( smoothD_d <= 1.41117 )
							ret := -0.809917 // sell
						if( smoothD_d > 1.41117 )
							ret := -0.449704
					if( d_k > 8.7189 )
						if( rsi1 <= 37.0569 )
							ret := -0.849206 // sell
						if( rsi1 > 37.0569 )
							ret := -0.667049
				if( VIM > 1.00673 )
					if( VIM <= 1.04033 )
						if( d_k <= 24.9549 )
							ret := -0.459893
						if( d_k > 24.9549 )
							ret := 0.214286
					if( VIM > 1.04033 )
						if( rsi1 <= 33.5687 )
							ret := -0.923077 // sell
						if( rsi1 > 33.5687 )
							ret := 0.200000
		if( rsi1 > 45.5915 )
			if( VIP <= 0.992915 )
				if( VIP <= 0.943334 )
					if( VIP_VIM <= -0.199657 )
						if( smoothK_k <= 69.9788 )
							ret := 0.960000 // buy
						if( smoothK_k > 69.9788 )
							ret := 0.600000
					if( VIP_VIM > -0.199657 )
						if( smoothK_k <= 69.7529 )
							ret := 0.560669
						if( smoothK_k > 69.7529 )
							ret := 0.205882
				if( VIP > 0.943334 )
					if( rsi1 <= 47.0969 )
						if( VIP_VIM <= -0.092077 )
							ret := -0.515625
						if( VIP_VIM > -0.092077 )
							ret := 0.013333
					if( rsi1 > 47.0969 )
						if( VIM <= 1.04367 )
							ret := 0.238558
						if( VIM > 1.04367 )
							ret := 0.610256
			if( VIP > 0.992915 )
				if( rsi1 <= 60.4333 )
					if( VIP <= 1.10229 )
						if( rsi1 <= 53.239 )
							ret := -0.169010
						if( rsi1 > 53.239 )
							ret := 0.072015
					if( VIP > 1.10229 )
						if( rsi1 <= 55.5143 )
							ret := -0.491883
						if( rsi1 > 55.5143 )
							ret := -0.243506
				if( rsi1 > 60.4333 )
					if( VIM <= 0.742313 )
						if( rsi1 <= 72.4116 )
							ret := -0.447587
						if( rsi1 > 72.4116 )
							ret := -0.062992
					if( VIM > 0.742313 )
						if( rsi1 <= 71.5733 )
							ret := 0.069179
						if( rsi1 > 71.5733 )
							ret := 0.378976
	
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
float op_operation = decision_tree_0_ATOMUSDT_1Hour_e9c6a238(rsi1, smoothK_k, d_k, k, d, smoothD_d, VIP, VIM, VIP_VIM)

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


