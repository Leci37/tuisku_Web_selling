//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: DBX_1Hour_2SV0_5da0d189 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DBX_1Hour_2SV0_5da0d189", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DBX_1Hour_5da0d189(d, d_k, smoothK_k, k, rsi1, smoothD_d, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( rsi1 <= 58.425 )
		if( d <= 56.086 )
			if( d_k <= -3.2426 )
				if( rsi1 <= 28.9317 )
					if( VIP_VIM <= -0.798474 )
						if( d_k <= -14.4417 )
							ret := -1.000000 // sell
						if( d_k > -14.4417 )
							ret := -0.444444
					if( VIP_VIM > -0.798474 )
						if( smoothK_k <= 38.8012 )
							ret := 0.400000
						if( smoothK_k > 38.8012 )
							ret := -0.125000
				if( rsi1 > 28.9317 )
					if( VIP <= 1.20435 )
						if( VIP_VIM <= -0.286155 )
							ret := -0.321218
						if( VIP_VIM > -0.286155 )
							ret := -0.083504
					if( VIP > 1.20435 )
						if( VIP_VIM <= -0.285389 )
							ret := -0.346154
						if( VIP_VIM > -0.285389 )
							ret := 0.107143
			if( d_k > -3.2426 )
				if( VIM <= 1.52974 )
					if( d <= 37.6102 )
						if( k <= 14.6525 )
							ret := 0.051134
						if( k > 14.6525 )
							ret := -0.076364
					if( d > 37.6102 )
						if( d <= 38.572 )
							ret := 0.637681
						if( d > 38.572 )
							ret := 0.121257
				if( VIM > 1.52974 )
					if( rsi1 <= 26.2827 )
						if( d_k <= -1.36474 )
							ret := -0.363636
						if( d_k > -1.36474 )
							ret := 0.838983 // buy
					if( rsi1 > 26.2827 )
						if( d <= 51.3198 )
							ret := 0.084071
						if( d > 51.3198 )
							ret := 0.846154 // buy
		if( d > 56.086 )
			if( smoothK_k <= 78.0395 )
				if( VIM <= 1.20833 )
					if( smoothD_d <= 76.8058 )
						if( VIP <= 0.809612 )
							ret := 0.960000 // buy
						if( VIP > 0.809612 )
							ret := 0.046586
					if( smoothD_d > 76.8058 )
						if( d_k <= 8.05926 )
							ret := 0.642045
						if( d_k > 8.05926 )
							ret := 0.088803
				if( VIM > 1.20833 )
					if( d_k <= -4.88633 )
						if( VIP_VIM <= -0.19926 )
							ret := -0.596491
						if( VIP_VIM > -0.19926 )
							ret := 0.450549
					if( d_k > -4.88633 )
						if( smoothD_d <= 58.4707 )
							ret := 0.192053
						if( smoothD_d > 58.4707 )
							ret := 0.512500
			if( smoothK_k > 78.0395 )
				if( d_k <= 0.728602 )
					if( VIP <= 0.958946 )
						if( d_k <= -3.38692 )
							ret := -0.445596
						if( d_k > -3.38692 )
							ret := 0.069444
					if( VIP > 0.958946 )
						if( smoothD_d <= 78.3079 )
							ret := 0.162791
						if( smoothD_d > 78.3079 )
							ret := -0.101993
				if( d_k > 0.728602 )
					if( VIP_VIM <= 0.300076 )
						if( VIP <= 1.13207 )
							ret := 0.055762
						if( VIP > 1.13207 )
							ret := 0.389262
					if( VIP_VIM > 0.300076 )
						if( d_k <= 6.75704 )
							ret := -0.472727
						if( d_k > 6.75704 )
							ret := 0.916667 // buy
	if( rsi1 > 58.425 )
		if( VIP_VIM <= 0.192754 )
			if( smoothK_k <= 93.4201 )
				if( d <= 81.2042 )
					if( rsi1 <= 61.7405 )
						if( smoothK_k <= 85.4535 )
							ret := -0.088889
						if( smoothK_k > 85.4535 )
							ret := -0.717949 // sell
					if( rsi1 > 61.7405 )
						if( smoothD_d <= 69.1327 )
							ret := -0.351515
						if( smoothD_d > 69.1327 )
							ret := -0.740741 // sell
				if( d > 81.2042 )
					if( VIP <= 1.20445 )
						if( d_k <= -1.45807 )
							ret := 0.204082
						if( d_k > -1.45807 )
							ret := -0.308271
					if( VIP > 1.20445 )
						if( d_k <= -4.78866 )
							ret := -0.181818
						if( d_k > -4.78866 )
							ret := 0.435644
			if( smoothK_k > 93.4201 )
				if( smoothK_k <= 94.6841 )
					if( rsi1 <= 61.0181 )
						ret := 0.500000
					if( rsi1 > 61.0181 )
						if( d <= 98.9537 )
							ret := -0.944444 // sell
						if( d > 98.9537 )
							ret := 0.000000
				if( smoothK_k > 94.6841 )
					if( smoothD_d <= 96.3818 )
						if( smoothD_d <= 92.9287 )
							ret := -0.460526
						if( smoothD_d > 92.9287 )
							ret := 0.413793
					if( smoothD_d > 96.3818 )
						if( rsi1 <= 67.4158 )
							ret := -0.843750 // sell
						if( rsi1 > 67.4158 )
							ret := -0.142857
		if( VIP_VIM > 0.192754 )
			if( smoothK_k <= 96.945 )
				if( k <= 97.4084 )
					if( VIM <= 0.880202 )
						if( smoothD_d <= 94.1244 )
							ret := -0.133976
						if( smoothD_d > 94.1244 )
							ret := 0.314050
					if( VIM > 0.880202 )
						if( rsi1 <= 82.3944 )
							ret := 0.017573
						if( rsi1 > 82.3944 )
							ret := 0.892857 // buy
				if( k > 97.4084 )
					if( d_k <= -1.8628 )
						if( VIP_VIM <= 0.297418 )
							ret := -0.509434
						if( VIP_VIM > 0.297418 )
							ret := 0.031532
					if( d_k > -1.8628 )
						if( VIM <= 0.760388 )
							ret := -0.147287
						if( VIM > 0.760388 )
							ret := -0.617021
			if( smoothK_k > 96.945 )
				if( smoothD_d <= 96.6721 )
					if( smoothD_d <= 80.7267 )
						if( d_k <= -21.2675 )
							ret := 0.000000
						if( d_k > -21.2675 )
							ret := -0.625000
					if( smoothD_d > 80.7267 )
						if( smoothD_d <= 84.2362 )
							ret := 0.739130 // buy
						if( smoothD_d > 84.2362 )
							ret := 0.306878
				if( smoothD_d > 96.6721 )
					if( k <= 99.9996 )
						ret := -1.000000 // sell
					if( k > 99.9996 )
						if( d_k <= -0.209011 )
							ret := -0.750000 // sell
						if( d_k > -0.209011 )
							ret := 0.022727
	
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
float op_operation = decision_tree_0_DBX_1Hour_5da0d189(d, d_k, smoothK_k, k, rsi1, smoothD_d, VIP, VIP_VIM, VIM)

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


