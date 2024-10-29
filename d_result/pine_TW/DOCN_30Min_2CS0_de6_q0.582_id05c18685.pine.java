//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: DOCN_30Min_2CS0_05c18685 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOCN_30Min_2CS0_05c18685", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOCN_30Min_05c18685(mf, ad_mf, ad, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( ad_mf <= -0.004761 )
		if( mf <= 0.209938 )
			if( d_k <= -17.4916 )
				if( rsi1 <= 53.4744 )
					if( ad_mf <= -920.999 )
						if( d_k <= -25.8214 )
							ret := 0.809524 // buy
						if( d_k > -25.8214 )
							ret := 0.132653
					if( ad_mf > -920.999 )
						if( d <= 39.9993 )
							ret := 0.137931
						if( d > 39.9993 )
							ret := -0.604167
				if( rsi1 > 53.4744 )
					if( smoothK_k <= 94.0431 )
						if( ad_mf <= -826.757 )
							ret := -0.150000
						if( ad_mf > -826.757 )
							ret := -0.646552
					if( smoothK_k > 94.0431 )
						if( rsi1 <= 58.6573 )
							ret := -0.200000
						if( rsi1 > 58.6573 )
							ret := 0.705882 // buy
			if( d_k > -17.4916 )
				if( ad <= -43208.5 )
					if( ad <= -47223.5 )
						if( smoothD_d <= 5.62279 )
							ret := -0.189602
						if( smoothD_d > 5.62279 )
							ret := 0.111283
					if( ad > -47223.5 )
						if( smoothD_d <= 62.9816 )
							ret := 0.708861 // buy
						if( smoothD_d > 62.9816 )
							ret := 0.078947
				if( ad > -43208.5 )
					if( ad_mf <= -22659.5 )
						if( ad <= -42133.8 )
							ret := -0.698413
						if( ad > -42133.8 )
							ret := -0.110329
					if( ad_mf > -22659.5 )
						if( rsi1 <= 49.6205 )
							ret := 0.133703
						if( rsi1 > 49.6205 )
							ret := 0.008282
		if( mf > 0.209938 )
			if( ad <= -127396 )
				if( ad_mf <= -205033 )
					if( d_k <= 5.32257 )
						if( d_k <= -6.76191 )
							ret := -1.000000 // sell
						if( d_k > -6.76191 )
							ret := -0.100000
					if( d_k > 5.32257 )
						if( ad_mf <= -304604 )
							ret := 0.000000
						if( ad_mf > -304604 )
							ret := 1.000000 // buy
				if( ad_mf > -205033 )
					if( d_k <= 3.84396 )
						ret := 0.200000
					if( d_k > 3.84396 )
						if( rsi1 <= 58.5411 )
							ret := -1.000000 // sell
						if( rsi1 > 58.5411 )
							ret := -0.444444
			if( ad > -127396 )
				if( ad_mf <= -0.334321 )
					if( d_k <= 5.77312 )
						if( ad <= -92632.9 )
							ret := 0.711538 // buy
						if( ad > -92632.9 )
							ret := 0.134132
					if( d_k > 5.77312 )
						if( rsi1 <= 52.3614 )
							ret := 0.211640
						if( rsi1 > 52.3614 )
							ret := 0.545181
				if( ad_mf > -0.334321 )
					if( d_k <= 1.55023 )
						if( rsi1 <= 47.5647 )
							ret := 0.461538
						if( rsi1 > 47.5647 )
							ret := -0.330000
					if( d_k > 1.55023 )
						if( k <= 40.62 )
							ret := 0.523810
						if( k > 40.62 )
							ret := 0.131387
	if( ad_mf > -0.004761 )
		if( ad_mf <= 7024.04 )
			if( rsi1 <= 39.1534 )
				if( smoothK_k <= 52.0663 )
					if( ad_mf <= 3160.68 )
						if( smoothK_k <= -2.89893 )
							ret := -0.580645
						if( smoothK_k > -2.89893 )
							ret := 0.223982
					if( ad_mf > 3160.68 )
						if( d_k <= 4.91089 )
							ret := -0.462366
						if( d_k > 4.91089 )
							ret := 0.161290
				if( smoothK_k > 52.0663 )
					if( rsi1 <= 38.009 )
						if( k <= 76.6539 )
							ret := -0.185185
						if( k > 76.6539 )
							ret := -0.561798
					if( rsi1 > 38.009 )
						if( smoothK_k <= 63.3485 )
							ret := -0.444444
						if( smoothK_k > 63.3485 )
							ret := 0.650000
			if( rsi1 > 39.1534 )
				if( d_k <= 0.074309 )
					if( smoothK_k <= 2.87702 )
						if( mf <= -0.004041 )
							ret := 0.818182 // buy
						if( mf > -0.004041 )
							ret := -0.272727
					if( smoothK_k > 2.87702 )
						if( mf <= -0.325195 )
							ret := -0.763889 // sell
						if( mf > -0.325195 )
							ret := -0.285564
				if( d_k > 0.074309 )
					if( mf <= 0.031371 )
						if( smoothD_d <= 68.4696 )
							ret := -0.313175
						if( smoothD_d > 68.4696 )
							ret := -0.038760
					if( mf > 0.031371 )
						if( ad <= 323.751 )
							ret := -0.642857
						if( ad > 323.751 )
							ret := 0.174263
		if( ad_mf > 7024.04 )
			if( ad_mf <= 277781 )
				if( mf <= -0.184452 )
					if( ad <= 19503.4 )
						if( d <= 51.8882 )
							ret := 0.215385
						if( d > 51.8882 )
							ret := -0.182796
					if( ad > 19503.4 )
						if( ad_mf <= 163997 )
							ret := -0.278689
						if( ad_mf > 163997 )
							ret := -0.846154 // sell
				if( mf > -0.184452 )
					if( ad_mf <= 10867.9 )
						if( d <= 66.9517 )
							ret := 0.379699
						if( d > 66.9517 )
							ret := -0.013605
					if( ad_mf > 10867.9 )
						if( smoothK_k <= 96.5945 )
							ret := 0.020448
						if( smoothK_k > 96.5945 )
							ret := -0.312925
			if( ad_mf > 277781 )
				if( mf <= -0.172764 )
					if( smoothK_k <= -0.540579 )
						ret := -1.000000 // sell
					if( smoothK_k > -0.540579 )
						if( smoothK_k <= 64.7474 )
							ret := 1.000000 // buy
						if( smoothK_k > 64.7474 )
							ret := 0.333333
				if( mf > -0.172764 )
					if( smoothK_k <= 16.9366 )
						if( ad <= 306801 )
							ret := 0.000000
						if( ad > 306801 )
							ret := -0.927536 // sell
					if( smoothK_k > 16.9366 )
						if( d_k <= 2.74401 )
							ret := -0.431925
						if( d_k > 2.74401 )
							ret := 0.466667
	
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
float op_operation = decision_tree_0_DOCN_30Min_05c18685(mf, ad_mf, ad, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


