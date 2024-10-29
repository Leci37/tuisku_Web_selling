//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: AAPL_1Hour_2SV0_72aa7146 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAPL_1Hour_2SV0_72aa7146", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAPL_1Hour_72aa7146(rsi1, smoothK_k, d_k, k, d, smoothD_d, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( smoothK_k <= 59.3694 )
		if( VIM <= 0.855611 )
			if( d <= 8.2144 )
				if( d <= 1.94666 )
					ret := -0.083333
				if( d > 1.94666 )
					if( VIM <= 0.716652 )
						ret := -1.000000 // sell
					if( VIM > 0.716652 )
						if( VIP <= 1.1467 )
							ret := -0.821429 // sell
						if( VIP > 1.1467 )
							ret := -0.466667
			if( d > 8.2144 )
				if( VIM <= 0.703112 )
					if( rsi1 <= 81.4899 )
						if( VIP <= 1.26393 )
							ret := -0.363636
						if( VIP > 1.26393 )
							ret := 0.522727
					if( rsi1 > 81.4899 )
						if( VIM <= 0.677697 )
							ret := -0.186047
						if( VIM > 0.677697 )
							ret := -0.900000 // sell
				if( VIM > 0.703112 )
					if( rsi1 <= 75.8121 )
						if( k <= 44.3715 )
							ret := -0.225753
						if( k > 44.3715 )
							ret := -0.002809
					if( rsi1 > 75.8121 )
						if( VIP_VIM <= 0.594783 )
							ret := -0.562130
						if( VIP_VIM > 0.594783 )
							ret := -0.128205
		if( VIM > 0.855611 )
			if( rsi1 <= 14.8385 )
				if( VIP <= 0.934334 )
					if( rsi1 <= 12.064 )
						if( rsi1 <= 5.68952 )
							ret := -0.680000
						if( rsi1 > 5.68952 )
							ret := 0.028736
					if( rsi1 > 12.064 )
						if( smoothK_k <= 17.8837 )
							ret := -0.613833
						if( smoothK_k > 17.8837 )
							ret := 0.800000 // buy
				if( VIP > 0.934334 )
					if( VIP_VIM <= -0.581825 )
						ret := -1.000000 // sell
					if( VIP_VIM > -0.581825 )
						if( VIP_VIM <= -0.461377 )
							ret := 0.793103 // buy
						if( VIP_VIM > -0.461377 )
							ret := 0.071429
			if( rsi1 > 14.8385 )
				if( d_k <= 20.0436 )
					if( rsi1 <= 22.4433 )
						if( d <= 5.54408 )
							ret := -0.086777
						if( d > 5.54408 )
							ret := 0.251007
					if( rsi1 > 22.4433 )
						if( VIP_VIM <= -0.281179 )
							ret := -0.104774
						if( VIP_VIM > -0.281179 )
							ret := -0.015842
				if( d_k > 20.0436 )
					if( VIM <= 1.05083 )
						if( d <= 78.9716 )
							ret := 0.352496
						if( d > 78.9716 )
							ret := -0.578947
					if( VIM > 1.05083 )
						if( VIP <= 1.11991 )
							ret := -0.105372
						if( VIP > 1.11991 )
							ret := 0.625000
	if( smoothK_k > 59.3694 )
		if( smoothK_k <= 82.1579 )
			if( d_k <= 13.1896 )
				if( rsi1 <= 53.6442 )
					if( rsi1 <= 45.4627 )
						if( smoothK_k <= 77.1402 )
							ret := 0.091587
						if( smoothK_k > 77.1402 )
							ret := 0.446721
					if( rsi1 > 45.4627 )
						if( d <= 49.3461 )
							ret := 0.512605
						if( d > 49.3461 )
							ret := -0.118861
				if( rsi1 > 53.6442 )
					if( VIP <= 1.29742 )
						if( VIP_VIM <= 0.130449 )
							ret := 0.347666
						if( VIP_VIM > 0.130449 )
							ret := 0.175669
					if( VIP > 1.29742 )
						if( d_k <= 1.32939 )
							ret := -0.173516
						if( d_k > 1.32939 )
							ret := 0.140152
			if( d_k > 13.1896 )
				if( smoothK_k <= 74.4667 )
					if( k <= 72.8199 )
						if( smoothD_d <= 83.8919 )
							ret := -0.157407
						if( smoothD_d > 83.8919 )
							ret := 0.368421
					if( k > 72.8199 )
						if( rsi1 <= 61.2672 )
							ret := -0.820513 // sell
						if( rsi1 > 61.2672 )
							ret := -0.088235
				if( smoothK_k > 74.4667 )
					if( rsi1 <= 48.8346 )
						ret := 0.000000
					if( rsi1 > 48.8346 )
						ret := 1.000000 // buy
		if( smoothK_k > 82.1579 )
			if( VIP <= 1.21901 )
				if( d <= 81.8119 )
					if( VIP_VIM <= 0.03577 )
						if( smoothD_d <= 75.5741 )
							ret := -0.162667
						if( smoothD_d > 75.5741 )
							ret := 0.347458
					if( VIP_VIM > 0.03577 )
						if( d_k <= -23.4326 )
							ret := 0.588235
						if( d_k > -23.4326 )
							ret := 0.057851
				if( d > 81.8119 )
					if( d <= 82.6591 )
						if( VIM <= 1.05511 )
							ret := -0.288136
						if( VIM > 1.05511 )
							ret := -0.882353 // sell
					if( d > 82.6591 )
						if( VIP_VIM <= 0.126211 )
							ret := -0.017690
						if( VIP_VIM > 0.126211 )
							ret := -0.149955
			if( VIP > 1.21901 )
				if( VIP_VIM <= 0.460093 )
					if( smoothK_k <= 94.0223 )
						if( k <= 96.3056 )
							ret := 0.220096
						if( k > 96.3056 )
							ret := -0.320755
					if( smoothK_k > 94.0223 )
						if( rsi1 <= 75.0392 )
							ret := 0.320896
						if( rsi1 > 75.0392 )
							ret := 0.681081
				if( VIP_VIM > 0.460093 )
					if( smoothD_d <= 96.9825 )
						if( d_k <= 4.25228 )
							ret := -0.004147
						if( d_k > 4.25228 )
							ret := -0.308725
					if( smoothD_d > 96.9825 )
						if( VIP <= 1.40437 )
							ret := 0.278351
						if( VIP > 1.40437 )
							ret := 0.755556 // buy
	
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
float op_operation = decision_tree_0_AAPL_1Hour_72aa7146(rsi1, smoothK_k, d_k, k, d, smoothD_d, VIP, VIM, VIP_VIM)

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


