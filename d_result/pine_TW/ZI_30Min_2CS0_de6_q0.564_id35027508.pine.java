//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: ZI_30Min_2CS0_35027508 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ZI_30Min_2CS0_35027508", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ZI_30Min_35027508(ad, ad_mf, mf, smoothK_k, d_k, k, smoothD_d, rsi1, d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( ad_mf <= 0.274758 )
		if( rsi1 <= 50.8806 )
			if( ad_mf <= -3243.63 )
				if( d_k <= 18.1626 )
					if( ad_mf <= -5296.16 )
						if( ad_mf <= -8574.98 )
							ret := 0.048011
						if( ad_mf > -8574.98 )
							ret := 0.455814
					if( ad_mf > -5296.16 )
						if( k <= 82.4521 )
							ret := -0.354260
						if( k > 82.4521 )
							ret := 0.733333 // buy
				if( d_k > 18.1626 )
					if( ad <= -136355 )
						if( ad_mf <= -166451 )
							ret := -0.142857
						if( ad_mf > -166451 )
							ret := 0.627907
					if( ad > -136355 )
						if( k <= 40.3995 )
							ret := -0.554140
						if( k > 40.3995 )
							ret := 0.131579
			if( ad_mf > -3243.63 )
				if( d_k <= 11.383 )
					if( smoothD_d <= 57.9014 )
						if( ad <= -2946.23 )
							ret := 0.727273 // buy
						if( ad > -2946.23 )
							ret := 0.063291
					if( smoothD_d > 57.9014 )
						if( k <= 88.107 )
							ret := 0.486111
						if( k > 88.107 )
							ret := -0.034188
				if( d_k > 11.383 )
					if( ad_mf <= -0.004707 )
						if( mf <= -0.174658 )
							ret := -0.272727
						if( mf > -0.174658 )
							ret := 0.670833
					if( ad_mf > -0.004707 )
						if( mf <= -0.201911 )
							ret := 0.818182 // buy
						if( mf > -0.201911 )
							ret := -0.047059
		if( rsi1 > 50.8806 )
			if( ad_mf <= -0.098216 )
				if( d_k <= 3.1335 )
					if( smoothK_k <= 74.7286 )
						if( mf <= 0.099645 )
							ret := -0.229240
						if( mf > 0.099645 )
							ret := -0.035539
					if( smoothK_k > 74.7286 )
						if( d <= 67.6674 )
							ret := 0.434783
						if( d > 67.6674 )
							ret := -0.002606
				if( d_k > 3.1335 )
					if( smoothD_d <= 67.9266 )
						if( ad <= -703.743 )
							ret := 0.063448
						if( ad > -703.743 )
							ret := -0.201465
					if( smoothD_d > 67.9266 )
						if( ad_mf <= -0.458226 )
							ret := 0.066882
						if( ad_mf > -0.458226 )
							ret := 0.329545
			if( ad_mf > -0.098216 )
				if( k <= 98.4444 )
					if( smoothK_k <= 94.7339 )
						if( rsi1 <= 52.7315 )
							ret := 0.142857
						if( rsi1 > 52.7315 )
							ret := -0.272884
					if( smoothK_k > 94.7339 )
						if( ad_mf <= 0.230721 )
							ret := -0.837838 // sell
						if( ad_mf > 0.230721 )
							ret := 1.000000 // buy
				if( k > 98.4444 )
					if( rsi1 <= 60.9951 )
						if( smoothK_k <= 96.0279 )
							ret := 0.000000
						if( smoothK_k > 96.0279 )
							ret := 0.837838 // buy
					if( rsi1 > 60.9951 )
						if( smoothK_k <= 96.7789 )
							ret := 0.133333
						if( smoothK_k > 96.7789 )
							ret := -0.441176
	if( ad_mf > 0.274758 )
		if( ad <= 13307 )
			if( ad_mf <= 11450.6 )
				if( rsi1 <= 44.2594 )
					if( d_k <= -3.32828 )
						if( smoothK_k <= 13.4577 )
							ret := 0.700000 // buy
						if( smoothK_k > 13.4577 )
							ret := 0.060127
					if( d_k > -3.32828 )
						if( ad <= 555.502 )
							ret := -0.388626
						if( ad > 555.502 )
							ret := -0.002227
				if( rsi1 > 44.2594 )
					if( smoothD_d <= 80.8402 )
						if( ad <= 4493.5 )
							ret := -0.365961
						if( ad > 4493.5 )
							ret := 0.005602
					if( smoothD_d > 80.8402 )
						if( ad <= 320 )
							ret := 0.549020
						if( ad > 320 )
							ret := -0.150121
			if( ad_mf > 11450.6 )
				if( d <= 8.68052 )
					ret := 0.266667
				if( d > 8.68052 )
					if( d <= 90.9634 )
						if( d_k <= -21.4895 )
							ret := 0.500000
						if( d_k > -21.4895 )
							ret := -0.663265
					if( d > 90.9634 )
						ret := 0.375000
		if( ad > 13307 )
			if( ad_mf <= 1.0549e+06 )
				if( smoothD_d <= 82.8415 )
					if( ad <= 752658 )
						if( ad_mf <= 705161 )
							ret := -0.014537
						if( ad_mf > 705161 )
							ret := 0.697674
					if( ad > 752658 )
						if( d_k <= -21.1281 )
							ret := 0.833333 // buy
						if( d_k > -21.1281 )
							ret := -0.521008
				if( smoothD_d > 82.8415 )
					if( rsi1 <= 74.6076 )
						if( ad <= 242456 )
							ret := 0.130385
						if( ad > 242456 )
							ret := 0.455000
					if( rsi1 > 74.6076 )
						if( k <= 97.9521 )
							ret := 0.029412
						if( k > 97.9521 )
							ret := -0.193966
			if( ad_mf > 1.0549e+06 )
				if( ad_mf <= 1.40315e+06 )
					if( ad_mf <= 1.28377e+06 )
						if( ad <= 1.27031e+06 )
							ret := 0.589744
						if( ad > 1.27031e+06 )
							ret := -1.000000 // sell
					if( ad_mf > 1.28377e+06 )
						if( d_k <= -18.2119 )
							ret := 0.000000
						if( d_k > -18.2119 )
							ret := 0.974359 // buy
				if( ad_mf > 1.40315e+06 )
					if( rsi1 <= 31.9015 )
						if( mf <= 0.074861 )
							ret := 0.833333 // buy
						if( mf > 0.074861 )
							ret := 0.000000
					if( rsi1 > 31.9015 )
						if( ad <= 2.63487e+06 )
							ret := -0.500000
						if( ad > 2.63487e+06 )
							ret := 0.411765
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_ZI_30Min_35027508(ad, ad_mf, mf, smoothK_k, d_k, k, smoothD_d, rsi1, d)

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


