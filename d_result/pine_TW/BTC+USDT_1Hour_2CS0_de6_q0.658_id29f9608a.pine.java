//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: BTCUSDT_1Hour_2CS0_29f9608a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BTCUSDT_1Hour_2CS0_29f9608a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BTCUSDT_1Hour_29f9608a(ad, mf, ad_mf, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( rsi1 <= 52.0143 )
		if( d_k <= -1.3414 )
			if( ad_mf <= -541.921 )
				if( rsi1 <= 27.5537 )
					if( k <= 9.60113 )
						if( ad_mf <= -2385.26 )
							ret := 0.576271
						if( ad_mf > -2385.26 )
							ret := 0.096774
					if( k > 9.60113 )
						if( ad <= -1516.97 )
							ret := -0.037190
						if( ad > -1516.97 )
							ret := -0.470149
				if( rsi1 > 27.5537 )
					if( d <= 15.4349 )
						if( ad_mf <= -1070.34 )
							ret := 0.613014
						if( ad_mf > -1070.34 )
							ret := 0.253788
					if( d > 15.4349 )
						if( mf <= -0.049712 )
							ret := 0.329545
						if( mf > -0.049712 )
							ret := 0.056204
			if( ad_mf > -541.921 )
				if( d_k <= -5.84009 )
					if( d <= 16.129 )
						if( rsi1 <= 29.3685 )
							ret := 0.000000
						if( rsi1 > 29.3685 )
							ret := 0.346440
					if( d > 16.129 )
						if( mf <= 0.035979 )
							ret := 0.023158
						if( mf > 0.035979 )
							ret := -0.191038
				if( d_k > -5.84009 )
					if( ad <= 1312.04 )
						if( rsi1 <= 30.1289 )
							ret := -0.302128
						if( rsi1 > 30.1289 )
							ret := -0.001422
					if( ad > 1312.04 )
						if( smoothD_d <= 83.2818 )
							ret := -0.327399
						if( smoothD_d > 83.2818 )
							ret := 0.372340
		if( d_k > -1.3414 )
			if( rsi1 <= 34.2137 )
				if( rsi1 <= 20.8842 )
					if( d_k <= -0.377895 )
						if( ad_mf <= -769.697 )
							ret := 0.029412
						if( ad_mf > -769.697 )
							ret := -0.557377
					if( d_k > -0.377895 )
						if( ad <= -4664.98 )
							ret := -0.460967
						if( ad > -4664.98 )
							ret := -0.634127
				if( rsi1 > 20.8842 )
					if( d_k <= 6.0784 )
						if( ad <= -254.063 )
							ret := -0.151663
						if( ad > -254.063 )
							ret := -0.433414
					if( d_k > 6.0784 )
						if( mf <= -0.146284 )
							ret := -0.259939
						if( mf > -0.146284 )
							ret := -0.515000
			if( rsi1 > 34.2137 )
				if( ad <= -3503.83 )
					if( d_k <= 3.71439 )
						if( ad_mf <= -13906.8 )
							ret := 0.878788 // buy
						if( ad_mf > -13906.8 )
							ret := 0.374603
					if( d_k > 3.71439 )
						if( d <= 38.5553 )
							ret := 0.273927
						if( d > 38.5553 )
							ret := -0.091667
				if( ad > -3503.83 )
					if( d_k <= 3.2207 )
						if( ad_mf <= -2.03235 )
							ret := -0.024313
						if( ad_mf > -2.03235 )
							ret := -0.172459
					if( d_k > 3.2207 )
						if( d <= 47.192 )
							ret := -0.172429
						if( d > 47.192 )
							ret := -0.348849
	if( rsi1 > 52.0143 )
		if( d_k <= 0.98371 )
			if( rsi1 <= 63.1101 )
				if( mf <= 0.047032 )
					if( k <= 89.9053 )
						if( d_k <= -7.94667 )
							ret := 0.484281
						if( d_k > -7.94667 )
							ret := 0.254646
					if( k > 89.9053 )
						if( ad <= 4041.01 )
							ret := 0.197848
						if( ad > 4041.01 )
							ret := -0.477273
				if( mf > 0.047032 )
					if( ad <= 1296.01 )
						if( smoothK_k <= 93.8411 )
							ret := 0.103781
						if( smoothK_k > 93.8411 )
							ret := 0.350785
					if( ad > 1296.01 )
						if( rsi1 <= 52.8708 )
							ret := -0.606383
						if( rsi1 > 52.8708 )
							ret := -0.080068
			if( rsi1 > 63.1101 )
				if( rsi1 <= 77.4219 )
					if( mf <= 0.089814 )
						if( d_k <= -0.117363 )
							ret := 0.467551
						if( d_k > -0.117363 )
							ret := 0.257996
					if( mf > 0.089814 )
						if( ad <= 10079.3 )
							ret := 0.271455
						if( ad > 10079.3 )
							ret := -0.263566
				if( rsi1 > 77.4219 )
					if( d_k <= -3.91105 )
						if( mf <= 0.281104 )
							ret := 0.698539
						if( mf > 0.281104 )
							ret := 0.221239
					if( d_k > -3.91105 )
						if( mf <= 0.122518 )
							ret := 0.625000
						if( mf > 0.122518 )
							ret := 0.396078
		if( d_k > 0.98371 )
			if( ad <= -8.20305 )
				if( d_k <= 5.86602 )
					if( smoothD_d <= 90.18 )
						if( rsi1 <= 64.6049 )
							ret := 0.187874
						if( rsi1 > 64.6049 )
							ret := 0.396433
					if( smoothD_d > 90.18 )
						if( ad <= -3430.18 )
							ret := 0.641509
						if( ad > -3430.18 )
							ret := 0.059219
				if( d_k > 5.86602 )
					if( ad_mf <= -2407.17 )
						if( ad_mf <= -2471.36 )
							ret := 0.256822
						if( ad_mf > -2471.36 )
							ret := 0.925926 // buy
					if( ad_mf > -2407.17 )
						if( d <= 77.8322 )
							ret := 0.060513
						if( d > 77.8322 )
							ret := -0.248128
			if( ad > -8.20305 )
				if( rsi1 <= 73.8911 )
					if( ad_mf <= 16038.7 )
						if( k <= 25.2333 )
							ret := 0.020642
						if( k > 25.2333 )
							ret := -0.168669
					if( ad_mf > 16038.7 )
						if( mf <= 0.190019 )
							ret := -0.809524 // sell
						if( mf > 0.190019 )
							ret := -1.000000 // sell
				if( rsi1 > 73.8911 )
					if( ad <= 532.347 )
						if( rsi1 <= 77.3494 )
							ret := 0.139785
						if( rsi1 > 77.3494 )
							ret := 0.528169
					if( ad > 532.347 )
						if( smoothD_d <= 91.495 )
							ret := 0.181452
						if( smoothD_d > 91.495 )
							ret := -0.273171
	
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
float op_operation = decision_tree_0_BTCUSDT_1Hour_29f9608a(ad, mf, ad_mf, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


