//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: CRWD_30Min_2SV0_f15190d8 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_30Min_2SV0_f15190d8", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_30Min_f15190d8(d, d_k, smoothK_k, k, rsi1, smoothD_d, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( d_k <= 6.55183 )
		if( d <= 4.90758 )
			if( d_k <= 3.70724 )
				if( VIP <= 1.18237 )
					if( VIP_VIM <= -0.03596 )
						if( VIP <= 0.80884 )
							ret := 0.016117
						if( VIP > 0.80884 )
							ret := 0.193813
					if( VIP_VIM > -0.03596 )
						if( rsi1 <= 52.9708 )
							ret := -0.434483
						if( rsi1 > 52.9708 )
							ret := 0.122642
				if( VIP > 1.18237 )
					if( smoothD_d <= 1.12146 )
						if( VIP_VIM <= 0.433132 )
							ret := 0.606557
						if( VIP_VIM > 0.433132 )
							ret := -0.047619
					if( smoothD_d > 1.12146 )
						if( smoothD_d <= 1.78693 )
							ret := -0.375000
						if( smoothD_d > 1.78693 )
							ret := 0.727273 // buy
			if( d_k > 3.70724 )
				if( VIM <= 1.40078 )
					if( smoothK_k <= -2.36807 )
						if( d_k <= 4.37108 )
							ret := 0.772727 // buy
						if( d_k > 4.37108 )
							ret := 0.500000
					if( smoothK_k > -2.36807 )
						ret := -1.000000 // sell
				if( VIM > 1.40078 )
					if( rsi1 <= 11.8884 )
						ret := 1.000000 // buy
					if( rsi1 > 11.8884 )
						if( d_k <= 4.35936 )
							ret := -0.789474 // sell
						if( d_k > 4.35936 )
							ret := -0.142857
		if( d > 4.90758 )
			if( VIP_VIM <= 0.234455 )
				if( rsi1 <= 46.7478 )
					if( VIP <= 0.943442 )
						if( VIM <= 1.44273 )
							ret := -0.078455
						if( VIM > 1.44273 )
							ret := 0.213415
					if( VIP > 0.943442 )
						if( smoothD_d <= 13.3791 )
							ret := 0.191424
						if( smoothD_d > 13.3791 )
							ret := -0.009017
				if( rsi1 > 46.7478 )
					if( rsi1 <= 63.3301 )
						if( VIP_VIM <= 0.054277 )
							ret := -0.149665
						if( VIP_VIM > 0.054277 )
							ret := -0.015905
					if( rsi1 > 63.3301 )
						if( smoothK_k <= 35.4646 )
							ret := -0.534161
						if( smoothK_k > 35.4646 )
							ret := -0.177763
			if( VIP_VIM > 0.234455 )
				if( d <= 96.9915 )
					if( VIM <= 0.511157 )
						if( d_k <= 1.89977 )
							ret := -0.757576 // sell
						if( d_k > 1.89977 )
							ret := 1.000000 // buy
					if( VIM > 0.511157 )
						if( VIM <= 0.935595 )
							ret := 0.086042
						if( VIM > 0.935595 )
							ret := -0.030932
				if( d > 96.9915 )
					if( VIP <= 1.54429 )
						if( VIP <= 1.12233 )
							ret := 0.916667 // buy
						if( VIP > 1.12233 )
							ret := -0.098395
					if( VIP > 1.54429 )
						if( rsi1 <= 85.8311 )
							ret := -0.675978
						if( rsi1 > 85.8311 )
							ret := -0.081967
	if( d_k > 6.55183 )
		if( smoothD_d <= 89.3026 )
			if( VIP <= 1.25235 )
				if( VIP_VIM <= -0.783836 )
					if( d <= 29.5509 )
						if( VIP_VIM <= -0.797587 )
							ret := -0.393939
						if( VIP_VIM > -0.797587 )
							ret := -1.000000 // sell
					if( d > 29.5509 )
						if( smoothK_k <= 18.6292 )
							ret := 0.588235
						if( smoothK_k > 18.6292 )
							ret := -0.108108
				if( VIP_VIM > -0.783836 )
					if( d_k <= 29.3696 )
						if( smoothD_d <= 84.2452 )
							ret := 0.131882
						if( smoothD_d > 84.2452 )
							ret := -0.109890
					if( d_k > 29.3696 )
						if( smoothD_d <= 56.5447 )
							ret := -0.046512
						if( smoothD_d > 56.5447 )
							ret := -0.645161
			if( VIP > 1.25235 )
				if( VIM <= 0.720005 )
					if( d <= 82.5093 )
						if( VIP <= 1.40042 )
							ret := 0.326923
						if( VIP > 1.40042 )
							ret := 0.805556 // buy
					if( d > 82.5093 )
						if( d <= 90.1903 )
							ret := -0.291667
						if( d > 90.1903 )
							ret := 0.545455
				if( VIM > 0.720005 )
					if( d <= 42.0951 )
						if( VIM <= 1.70276 )
							ret := 0.026906
						if( VIM > 1.70276 )
							ret := 0.735849 // buy
					if( d > 42.0951 )
						if( smoothK_k <= 20.6683 )
							ret := -0.645833
						if( smoothK_k > 20.6683 )
							ret := -0.078931
		if( smoothD_d > 89.3026 )
			if( rsi1 <= 52.6653 )
				if( VIP <= 1.21855 )
					if( rsi1 <= 29.6277 )
						ret := 0.200000
					if( rsi1 > 29.6277 )
						if( smoothD_d <= 89.5791 )
							ret := 0.375000
						if( smoothD_d > 89.5791 )
							ret := 0.926316 // buy
				if( VIP > 1.21855 )
					if( smoothD_d <= 90.0299 )
						ret := 1.000000 // buy
					if( smoothD_d > 90.0299 )
						if( k <= 86.7555 )
							ret := -0.315789
						if( k > 86.7555 )
							ret := 0.900000 // buy
			if( rsi1 > 52.6653 )
				if( d_k <= 9.0116 )
					if( d <= 94.3017 )
						if( VIP_VIM <= 0.559184 )
							ret := -0.238095
						if( VIP_VIM > 0.559184 )
							ret := -1.000000 // sell
					if( d > 94.3017 )
						if( VIM <= 0.937301 )
							ret := -0.107143
						if( VIM > 0.937301 )
							ret := 0.793103 // buy
				if( d_k > 9.0116 )
					if( VIM <= 0.913093 )
						if( rsi1 <= 76.6414 )
							ret := 0.100000
						if( rsi1 > 76.6414 )
							ret := 0.857143 // buy
					if( VIM > 0.913093 )
						if( VIM <= 1.39338 )
							ret := 1.000000 // buy
						if( VIM > 1.39338 )
							ret := 0.000000
	
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
float op_operation = decision_tree_0_CRWD_30Min_f15190d8(d, d_k, smoothK_k, k, rsi1, smoothD_d, VIP, VIP_VIM, VIM)

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


