//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: GME_1Hour_2CS0_bceb1320 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GME_1Hour_2CS0_bceb1320", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GME_1Hour_bceb1320(mf, ad_mf, ad, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( ad <= -560.289 )
		if( rsi1 <= 49.9234 )
			if( d <= 3.59746 )
				if( k <= 0.524976 )
					if( ad_mf <= -25151.4 )
						if( smoothD_d <= -2.55693 )
							ret := 0.120482
						if( smoothD_d > -2.55693 )
							ret := -0.268519
					if( ad_mf > -25151.4 )
						if( mf <= 0.103504 )
							ret := 0.230769
						if( mf > 0.103504 )
							ret := 0.750000 // buy
				if( k > 0.524976 )
					if( ad <= -2.23693e+06 )
						ret := -0.454545
					if( ad > -2.23693e+06 )
						if( ad_mf <= -568455 )
							ret := 0.666667
						if( ad_mf > -568455 )
							ret := 0.185874
			if( d > 3.59746 )
				if( mf <= 0.054452 )
					if( smoothD_d <= 66.9803 )
						if( k <= 81.725 )
							ret := -0.018036
						if( k > 81.725 )
							ret := -0.549020
					if( smoothD_d > 66.9803 )
						if( smoothD_d <= 68.3014 )
							ret := -0.562500
						if( smoothD_d > 68.3014 )
							ret := -0.097760
				if( mf > 0.054452 )
					if( ad <= -424750 )
						if( ad_mf <= -775890 )
							ret := 0.000000
						if( ad_mf > -775890 )
							ret := -0.579710
					if( ad > -424750 )
						if( ad <= -1042.46 )
							ret := 0.094641
						if( ad > -1042.46 )
							ret := 0.714286 // buy
		if( rsi1 > 49.9234 )
			if( ad_mf <= -118625 )
				if( ad <= -753976 )
					if( d_k <= 23.0092 )
						if( smoothK_k <= 84.4714 )
							ret := 0.418269
						if( smoothK_k > 84.4714 )
							ret := 0.074713
					if( d_k > 23.0092 )
						ret := -0.769231 // sell
				if( ad > -753976 )
					if( k <= 42.0827 )
						if( rsi1 <= 57.542 )
							ret := -0.301587
						if( rsi1 > 57.542 )
							ret := 0.140351
					if( k > 42.0827 )
						if( ad <= -675093 )
							ret := -0.520000
						if( ad > -675093 )
							ret := 0.240714
			if( ad_mf > -118625 )
				if( mf <= -0.152077 )
					if( ad_mf <= -6954.78 )
						if( ad_mf <= -11915.2 )
							ret := 0.125000
						if( ad_mf > -11915.2 )
							ret := -0.666667
					if( ad_mf > -6954.78 )
						if( smoothK_k <= 37.3659 )
							ret := -0.357143
						if( smoothK_k > 37.3659 )
							ret := 0.500000
				if( mf > -0.152077 )
					if( ad_mf <= -614.117 )
						if( rsi1 <= 54.8979 )
							ret := 0.112481
						if( rsi1 > 54.8979 )
							ret := -0.050027
					if( ad_mf > -614.117 )
						if( rsi1 <= 68.1199 )
							ret := 0.821429 // buy
						if( rsi1 > 68.1199 )
							ret := 0.000000
	if( ad > -560.289 )
		if( smoothD_d <= 54.9444 )
			if( smoothK_k <= 5.04957 )
				if( mf <= 0.055446 )
					if( k <= 0.399558 )
						if( rsi1 <= 27.6328 )
							ret := -0.076923
						if( rsi1 > 27.6328 )
							ret := 0.377049
					if( k > 0.399558 )
						if( ad <= 135148 )
							ret := -0.087289
						if( ad > 135148 )
							ret := -0.308458
				if( mf > 0.055446 )
					if( ad <= 871961 )
						if( smoothK_k <= 2.92992 )
							ret := 0.021148
						if( smoothK_k > 2.92992 )
							ret := 0.382609
					if( ad > 871961 )
						if( d <= 8.02793 )
							ret := 0.000000
						if( d > 8.02793 )
							ret := 0.857143 // buy
			if( smoothK_k > 5.04957 )
				if( mf <= 0.181848 )
					if( ad <= 324443 )
						if( smoothD_d <= 26.0764 )
							ret := -0.211296
						if( smoothD_d > 26.0764 )
							ret := -0.095048
					if( ad > 324443 )
						if( d_k <= -9.06971 )
							ret := 0.333333
						if( d_k > -9.06971 )
							ret := -0.077035
				if( mf > 0.181848 )
					if( ad <= 477118 )
						if( d <= 55.2365 )
							ret := -0.213396
						if( d > 55.2365 )
							ret := 0.352941
					if( ad > 477118 )
						if( ad <= 1.0311e+07 )
							ret := -0.661871
						if( ad > 1.0311e+07 )
							ret := 0.454545
		if( smoothD_d > 54.9444 )
			if( ad <= 264.072 )
				if( d_k <= 12.1103 )
					if( d <= 95.1092 )
						if( rsi1 <= 57.9394 )
							ret := -0.123260
						if( rsi1 > 57.9394 )
							ret := -0.353061
					if( d > 95.1092 )
						if( smoothD_d <= 93.785 )
							ret := 0.614458
						if( smoothD_d > 93.785 )
							ret := -0.111111
				if( d_k > 12.1103 )
					if( rsi1 <= 68.2753 )
						if( mf <= 0.337453 )
							ret := 0.615385
						if( mf > 0.337453 )
							ret := -1.000000 // sell
					if( rsi1 > 68.2753 )
						ret := -0.333333
			if( ad > 264.072 )
				if( rsi1 <= 66.9164 )
					if( rsi1 <= 55.479 )
						if( ad <= 2.38358e+06 )
							ret := 0.009259
						if( ad > 2.38358e+06 )
							ret := 0.904762 // buy
					if( rsi1 > 55.479 )
						if( smoothD_d <= 56.0622 )
							ret := 0.636364
						if( smoothD_d > 56.0622 )
							ret := 0.163333
				if( rsi1 > 66.9164 )
					if( rsi1 <= 72.2476 )
						if( d <= 72.4125 )
							ret := -0.341564
						if( d > 72.4125 )
							ret := -0.038674
					if( rsi1 > 72.2476 )
						if( d_k <= 10.8032 )
							ret := 0.075728
						if( d_k > 10.8032 )
							ret := -0.450000
	
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
float op_operation = decision_tree_0_GME_1Hour_bceb1320(mf, ad_mf, ad, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


