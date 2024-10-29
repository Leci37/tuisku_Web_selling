//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: MATICUSDT_1Hour_2SV0_171d2cf9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MATICUSDT_1Hour_2SV0_171d2cf9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MATICUSDT_1Hour_171d2cf9(d, d_k, smoothK_k, k, rsi1, smoothD_d, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( rsi1 <= 57.272 )
		if( VIP_VIM <= 0.124328 )
			if( rsi1 <= 41.5999 )
				if( VIP_VIM <= -0.245058 )
					if( d_k <= -2.65469 )
						if( VIP <= 0.703741 )
							ret := 0.442647
						if( VIP > 0.703741 )
							ret := 0.049732
					if( d_k > -2.65469 )
						if( rsi1 <= 22.6985 )
							ret := -0.394929
						if( rsi1 > 22.6985 )
							ret := 0.006775
				if( VIP_VIM > -0.245058 )
					if( rsi1 <= 30.663 )
						if( smoothK_k <= 76.0727 )
							ret := -0.685053
						if( smoothK_k > 76.0727 )
							ret := 0.416667
					if( rsi1 > 30.663 )
						if( VIM <= 1.02681 )
							ret := -0.600612
						if( VIM > 1.02681 )
							ret := -0.229878
			if( rsi1 > 41.5999 )
				if( VIP <= 0.926212 )
					if( VIM <= 1.105 )
						if( rsi1 <= 42.6262 )
							ret := -0.145522
						if( rsi1 > 42.6262 )
							ret := 0.307997
					if( VIM > 1.105 )
						if( VIP <= 0.892811 )
							ret := 0.574236
						if( VIP > 0.892811 )
							ret := 0.325123
				if( VIP > 0.926212 )
					if( rsi1 <= 47.0742 )
						if( VIM <= 1.01448 )
							ret := -0.362308
						if( VIM > 1.01448 )
							ret := -0.012070
					if( rsi1 > 47.0742 )
						if( VIP_VIM <= 0.076804 )
							ret := 0.136301
						if( VIP_VIM > 0.076804 )
							ret := -0.097060
		if( VIP_VIM > 0.124328 )
			if( rsi1 <= 47.425 )
				if( d_k <= 25.4305 )
					if( smoothK_k <= 33.5059 )
						if( k <= 22.6256 )
							ret := -0.702614 // sell
						if( k > 22.6256 )
							ret := -0.362069
					if( smoothK_k > 33.5059 )
						if( rsi1 <= 42.2897 )
							ret := -0.911392 // sell
						if( rsi1 > 42.2897 )
							ret := -0.745763 // sell
				if( d_k > 25.4305 )
					if( VIP <= 1.04428 )
						ret := 0.555556
					if( VIP > 1.04428 )
						if( rsi1 <= 43.7051 )
							ret := -0.680556
						if( rsi1 > 43.7051 )
							ret := -0.161290
			if( rsi1 > 47.425 )
				if( VIP_VIM <= 0.220349 )
					if( k <= 1.22272 )
						if( d_k <= 0.383429 )
							ret := 0.800000 // buy
						if( d_k > 0.383429 )
							ret := 0.075000
					if( k > 1.22272 )
						if( d_k <= 5.81555 )
							ret := -0.398619
						if( d_k > 5.81555 )
							ret := -0.212034
				if( VIP_VIM > 0.220349 )
					if( VIM <= 0.909718 )
						if( smoothK_k <= -2.82422 )
							ret := 0.208333
						if( smoothK_k > -2.82422 )
							ret := -0.600671
					if( VIM > 0.909718 )
						if( rsi1 <= 54.4001 )
							ret := -0.365079
						if( rsi1 > 54.4001 )
							ret := 0.155556
	if( rsi1 > 57.272 )
		if( VIP_VIM <= 0.190507 )
			if( VIP_VIM <= 0.102765 )
				if( rsi1 <= 61.2947 )
					if( VIM <= 0.916876 )
						if( VIP <= 0.979063 )
							ret := -0.454545
						if( VIP > 0.979063 )
							ret := -0.666667
					if( VIM > 0.916876 )
						if( VIP <= 1.08651 )
							ret := 0.396996
						if( VIP > 1.08651 )
							ret := -0.431818
				if( rsi1 > 61.2947 )
					if( d <= 60.9117 )
						if( VIP <= 1.04402 )
							ret := 0.779592 // buy
						if( VIP > 1.04402 )
							ret := 0.442748
					if( d > 60.9117 )
						if( smoothD_d <= 66.8578 )
							ret := 0.263566
						if( smoothD_d > 66.8578 )
							ret := 0.512894
			if( VIP_VIM > 0.102765 )
				if( rsi1 <= 62.1168 )
					if( d_k <= -4.80394 )
						if( smoothD_d <= 59.9316 )
							ret := -0.272436
						if( smoothD_d > 59.9316 )
							ret := 0.134921
					if( d_k > -4.80394 )
						if( smoothD_d <= 92.1801 )
							ret := 0.253271
						if( smoothD_d > 92.1801 )
							ret := -0.205882
				if( rsi1 > 62.1168 )
					if( rsi1 <= 70.2298 )
						if( smoothK_k <= 96.7943 )
							ret := 0.442064
						if( smoothK_k > 96.7943 )
							ret := 0.122642
					if( rsi1 > 70.2298 )
						if( d <= 89.6623 )
							ret := 0.831683 // buy
						if( d > 89.6623 )
							ret := 0.494949
		if( VIP_VIM > 0.190507 )
			if( rsi1 <= 73.1583 )
				if( VIM <= 0.774679 )
					if( rsi1 <= 68.0012 )
						if( k <= 6.85729 )
							ret := 0.791667 // buy
						if( k > 6.85729 )
							ret := -0.479070
					if( rsi1 > 68.0012 )
						if( VIM <= 0.717802 )
							ret := -0.456790
						if( VIM > 0.717802 )
							ret := -0.023778
				if( VIM > 0.774679 )
					if( rsi1 <= 62.9223 )
						if( VIP_VIM <= 0.323037 )
							ret := 0.002493
						if( VIP_VIM > 0.323037 )
							ret := -0.355263
					if( rsi1 > 62.9223 )
						if( VIM <= 0.862822 )
							ret := 0.076963
						if( VIM > 0.862822 )
							ret := 0.281665
			if( rsi1 > 73.1583 )
				if( VIP_VIM <= 0.39248 )
					if( VIP <= 1.05466 )
						if( d_k <= -9.03716 )
							ret := 0.384615
						if( d_k > -9.03716 )
							ret := -0.846154 // sell
					if( VIP > 1.05466 )
						if( VIP_VIM <= 0.311349 )
							ret := 0.664794
						if( VIP_VIM > 0.311349 )
							ret := 0.475989
				if( VIP_VIM > 0.39248 )
					if( smoothK_k <= 93.8558 )
						if( VIP_VIM <= 0.656437 )
							ret := 0.170857
						if( VIP_VIM > 0.656437 )
							ret := -0.243108
					if( smoothK_k > 93.8558 )
						if( VIP <= 1.35932 )
							ret := 0.420444
						if( VIP > 1.35932 )
							ret := -0.140845
	
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
float op_operation = decision_tree_0_MATICUSDT_1Hour_171d2cf9(d, d_k, smoothK_k, k, rsi1, smoothD_d, VIP, VIP_VIM, VIM)

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


