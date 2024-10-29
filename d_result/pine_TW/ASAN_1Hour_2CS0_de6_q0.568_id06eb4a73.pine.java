//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: ASAN_1Hour_2CS0_06eb4a73 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ASAN_1Hour_2CS0_06eb4a73", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ASAN_1Hour_06eb4a73(ad, mf, ad_mf, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( mf <= 0.193548 )
		if( ad_mf <= -0.118605 )
			if( k <= 78.8895 )
				if( ad_mf <= -5677.3 )
					if( rsi1 <= 59.4441 )
						if( ad_mf <= -9057.16 )
							ret := -0.010846
						if( ad_mf > -9057.16 )
							ret := -0.371212
					if( rsi1 > 59.4441 )
						if( ad <= -126480 )
							ret := -0.489583
						if( ad > -126480 )
							ret := 0.104762
				if( ad_mf > -5677.3 )
					if( d_k <= 4.95479 )
						if( rsi1 <= 34.8992 )
							ret := 0.179070
						if( rsi1 > 34.8992 )
							ret := -0.112660
					if( d_k > 4.95479 )
						if( mf <= -0.36724 )
							ret := -0.615385
						if( mf > -0.36724 )
							ret := 0.371179
			if( k > 78.8895 )
				if( ad_mf <= -671799 )
					if( mf <= -0.065666 )
						ret := -0.888889 // sell
					if( mf > -0.065666 )
						ret := -0.125000
				if( ad_mf > -671799 )
					if( rsi1 <= 30.652 )
						if( smoothK_k <= 83.6596 )
							ret := 1.000000 // buy
						if( smoothK_k > 83.6596 )
							ret := 0.500000
					if( rsi1 > 30.652 )
						if( ad <= -1078.51 )
							ret := 0.191431
						if( ad > -1078.51 )
							ret := 0.009901
		if( ad_mf > -0.118605 )
			if( ad <= 575179 )
				if( mf <= -0.044065 )
					if( smoothD_d <= 37.9766 )
						if( ad <= 766.5 )
							ret := -0.217608
						if( ad > 766.5 )
							ret := 0.008523
					if( smoothD_d > 37.9766 )
						if( d_k <= 2.00482 )
							ret := -0.337327
						if( d_k > 2.00482 )
							ret := -0.119691
				if( mf > -0.044065 )
					if( rsi1 <= 73.0004 )
						if( ad_mf <= 0.001414 )
							ret := -0.194539
						if( ad_mf > 0.001414 )
							ret := -0.001377
					if( rsi1 > 73.0004 )
						if( d_k <= -0.132012 )
							ret := -0.418919
						if( d_k > -0.132012 )
							ret := -0.123288
			if( ad > 575179 )
				if( ad <= 754523 )
					if( mf <= -0.108792 )
						ret := 0.076923
					if( mf > -0.108792 )
						if( rsi1 <= 45.4088 )
							ret := 1.000000 // buy
						if( rsi1 > 45.4088 )
							ret := 0.687500
				if( ad > 754523 )
					if( d_k <= -12.8712 )
						if( rsi1 <= 59.7262 )
							ret := 0.125000
						if( rsi1 > 59.7262 )
							ret := -0.904762 // sell
					if( d_k > -12.8712 )
						if( d_k <= -2.70932 )
							ret := 0.516129
						if( d_k > -2.70932 )
							ret := -0.256410
	if( mf > 0.193548 )
		if( d_k <= 7.39534 )
			if( d <= 59.8788 )
				if( rsi1 <= 75.1766 )
					if( ad_mf <= -0.230154 )
						if( ad <= -103080 )
							ret := 0.327731
						if( ad > -103080 )
							ret := 0.009456
					if( ad_mf > -0.230154 )
						if( smoothK_k <= 61.3582 )
							ret := 0.268739
						if( smoothK_k > 61.3582 )
							ret := 0.672727
				if( rsi1 > 75.1766 )
					if( ad_mf <= 244075 )
						if( d_k <= 0.306752 )
							ret := -0.157895
						if( d_k > 0.306752 )
							ret := 0.625000
					if( ad_mf > 244075 )
						if( smoothD_d <= 39.0175 )
							ret := -0.333333
						if( smoothD_d > 39.0175 )
							ret := -0.866667 // sell
			if( d > 59.8788 )
				if( rsi1 <= 41.7886 )
					if( d_k <= 3.96699 )
						ret := -0.400000
					if( d_k > 3.96699 )
						ret := -0.863636 // sell
				if( rsi1 > 41.7886 )
					if( k <= 92.0008 )
						if( ad <= 258814 )
							ret := 0.026987
						if( ad > 258814 )
							ret := -0.322222
					if( k > 92.0008 )
						if( mf <= 0.524192 )
							ret := 0.200772
						if( mf > 0.524192 )
							ret := -0.548387
		if( d_k > 7.39534 )
			if( ad <= 532.759 )
				if( ad <= -11296.2 )
					if( ad_mf <= -123082 )
						if( k <= 62.1952 )
							ret := 0.582418
						if( k > 62.1952 )
							ret := -0.142857
					if( ad_mf > -123082 )
						if( ad_mf <= -78787 )
							ret := -0.476190
						if( ad_mf > -78787 )
							ret := 0.042553
				if( ad > -11296.2 )
					if( smoothK_k <= 4.27059 )
						ret := -0.200000
					if( smoothK_k > 4.27059 )
						if( ad_mf <= -0.197681 )
							ret := 0.696970
						if( ad_mf > -0.197681 )
							ret := 0.282051
			if( ad > 532.759 )
				if( rsi1 <= 45.644 )
					if( d <= 30.6373 )
						ret := -0.454545
					if( d > 30.6373 )
						ret := -0.823529 // sell
				if( rsi1 > 45.644 )
					if( ad <= 1.0067e+06 )
						if( d <= 43.2026 )
							ret := 0.406250
						if( d > 43.2026 )
							ret := 0.012422
					if( ad > 1.0067e+06 )
						ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

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
float op_operation = decision_tree_0_ASAN_1Hour_06eb4a73(ad, mf, ad_mf, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


