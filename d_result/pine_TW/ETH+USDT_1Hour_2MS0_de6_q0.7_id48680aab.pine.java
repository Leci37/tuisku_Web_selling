//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: ETHUSDT_1Hour_2MS0_48680aab Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETHUSDT_1Hour_2MS0_48680aab", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETHUSDT_1Hour_48680aab(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( rsi1 <= 54.0659 )
		if( d_k <= -2.13818 )
			if( Negative_Money_Flow <= 2.54531e+07 )
				if( d_k <= -8.0129 )
					if( Positive_Money_Flow_Sum <= 1.55671e+09 )
						if( Positive_Money_Flow_Sum <= 9.72469e+08 )
							ret := 0.015163
						if( Positive_Money_Flow_Sum > 9.72469e+08 )
							ret := 0.648000
					if( Positive_Money_Flow_Sum > 1.55671e+09 )
						ret := -1.000000 // sell
				if( d_k > -8.0129 )
					if( rsi1 <= 38.0393 )
						if( Raw_Money_Flow <= 5.14918e+07 )
							ret := -0.195582
						if( Raw_Money_Flow > 5.14918e+07 )
							ret := -0.480952
					if( rsi1 > 38.0393 )
						if( MFI_High <= -31.0704 )
							ret := -0.006416
						if( MFI_High > -31.0704 )
							ret := -0.266071
			if( Negative_Money_Flow > 2.54531e+07 )
				if( rsi1 <= 35.0891 )
					if( Negative_Money_Flow <= 1.01958e+08 )
						if( MFI_High <= -61.3353 )
							ret := 0.290076
						if( MFI_High > -61.3353 )
							ret := -0.073783
					if( Negative_Money_Flow > 1.01958e+08 )
						if( MFI_Low <= 12.0216 )
							ret := 0.480211
						if( MFI_Low > 12.0216 )
							ret := -0.382353
				if( rsi1 > 35.0891 )
					if( MFI_Low <= 29.9011 )
						if( Negative_Money_Flow <= 3.62492e+07 )
							ret := 0.242254
						if( Negative_Money_Flow > 3.62492e+07 )
							ret := 0.555921
					if( MFI_Low > 29.9011 )
						if( smoothD_d <= 29.1244 )
							ret := 0.396226
						if( smoothD_d > 29.1244 )
							ret := -0.337838
		if( d_k > -2.13818 )
			if( Typical_Price <= 744.072 )
				if( Typical_Price <= 181.838 )
					if( d <= 46.563 )
						if( smoothK_k <= 4.61123 )
							ret := 0.285372
						if( smoothK_k > 4.61123 )
							ret := -0.025357
					if( d > 46.563 )
						if( Negative_Money_Flow <= 1.17564e+07 )
							ret := 0.346899
						if( Negative_Money_Flow > 1.17564e+07 )
							ret := -0.571429
				if( Typical_Price > 181.838 )
					if( Negative_Money_Flow_Sum <= 9.92745e+07 )
						if( MFI_Low <= 7.30545 )
							ret := -0.414747
						if( MFI_Low > 7.30545 )
							ret := -0.053175
					if( Negative_Money_Flow_Sum > 9.92745e+07 )
						if( smoothD_d <= 83.9909 )
							ret := 0.164689
						if( smoothD_d > 83.9909 )
							ret := -0.494505
			if( Typical_Price > 744.072 )
				if( rsi1 <= 37.7853 )
					if( Money_Flow_Ratio <= 0.531909 )
						if( rsi1 <= 27.6328 )
							ret := -0.463862
						if( rsi1 > 27.6328 )
							ret := -0.177340
					if( Money_Flow_Ratio > 0.531909 )
						if( Typical_Price <= 1954.59 )
							ret := -0.393876
						if( Typical_Price > 1954.59 )
							ret := -0.650293
				if( rsi1 > 37.7853 )
					if( Money_Flow_Ratio <= 1.05032 )
						if( Negative_Money_Flow <= 5.96944e+07 )
							ret := -0.090740
						if( Negative_Money_Flow > 5.96944e+07 )
							ret := 0.198457
					if( Money_Flow_Ratio > 1.05032 )
						if( Positive_Money_Flow_Sum <= 2.32667e+08 )
							ret := -0.172662
						if( Positive_Money_Flow_Sum > 2.32667e+08 )
							ret := -0.458417
	if( rsi1 > 54.0659 )
		if( d_k <= -1.37903 )
			if( Typical_Price <= 793.973 )
				if( smoothD_d <= 58.3219 )
					if( Money_Flow_Ratio <= 2.66438 )
						if( MFI_High <= -13.1551 )
							ret := -0.041716
						if( MFI_High > -13.1551 )
							ret := 0.286624
					if( Money_Flow_Ratio > 2.66438 )
						if( d_k <= -25.3138 )
							ret := 0.352941
						if( d_k > -25.3138 )
							ret := -0.609023
				if( smoothD_d > 58.3219 )
					if( Raw_Money_Flow <= 2.12936e+06 )
						if( Money_Flow_Ratio <= 1.74747 )
							ret := 0.063158
						if( Money_Flow_Ratio > 1.74747 )
							ret := -0.512195
					if( Raw_Money_Flow > 2.12936e+06 )
						if( Positive_Money_Flow_Sum <= 6.89116e+07 )
							ret := 0.364341
						if( Positive_Money_Flow_Sum > 6.89116e+07 )
							ret := 0.077372
			if( Typical_Price > 793.973 )
				if( rsi1 <= 69.8514 )
					if( MFI_High <= -14.1194 )
						if( MFI <= 53.214 )
							ret := 0.538641
						if( MFI > 53.214 )
							ret := 0.286503
					if( MFI_High > -14.1194 )
						if( Positive_Money_Flow <= 6.99872e+07 )
							ret := 0.121622
						if( Positive_Money_Flow > 6.99872e+07 )
							ret := -0.540268
				if( rsi1 > 69.8514 )
					if( MFI_Low <= 54.2895 )
						if( Positive_Money_Flow_Sum <= 1.28204e+09 )
							ret := 0.665977
						if( Positive_Money_Flow_Sum > 1.28204e+09 )
							ret := 0.242424
					if( MFI_Low > 54.2895 )
						if( rsi1 <= 77.4275 )
							ret := 0.203647
						if( rsi1 > 77.4275 )
							ret := 0.568475
		if( d_k > -1.37903 )
			if( Positive_Money_Flow <= 4.93354e+07 )
				if( MFI_Low <= 39.0508 )
					if( rsi1 <= 56.8332 )
						if( Positive_Money_Flow_Sum <= 1.14914e+08 )
							ret := -0.103226
						if( Positive_Money_Flow_Sum > 1.14914e+08 )
							ret := 0.202920
					if( rsi1 > 56.8332 )
						if( d <= 11.5983 )
							ret := -0.189189
						if( d > 11.5983 )
							ret := 0.378414
				if( MFI_Low > 39.0508 )
					if( rsi1 <= 71.9859 )
						if( rsi1 <= 61.6553 )
							ret := -0.114967
						if( rsi1 > 61.6553 )
							ret := 0.055493
					if( rsi1 > 71.9859 )
						if( Typical_Price <= 858.206 )
							ret := 0.135770
						if( Typical_Price > 858.206 )
							ret := 0.337894
			if( Positive_Money_Flow > 4.93354e+07 )
				if( d_k <= 2.05907 )
					if( Negative_Money_Flow_Sum <= 9.75143e+08 )
						if( rsi1 <= 74.0497 )
							ret := -0.146776
						if( rsi1 > 74.0497 )
							ret := 0.258752
					if( Negative_Money_Flow_Sum > 9.75143e+08 )
						if( Raw_Money_Flow <= 1.24756e+08 )
							ret := 0.222222
						if( Raw_Money_Flow > 1.24756e+08 )
							ret := 0.968750 // buy
				if( d_k > 2.05907 )
					if( Typical_Price <= 1633.05 )
						if( d <= 74.8379 )
							ret := 0.448980
						if( d > 74.8379 )
							ret := -0.354167
					if( Typical_Price > 1633.05 )
						if( rsi1 <= 68.0429 )
							ret := -0.537430
						if( rsi1 > 68.0429 )
							ret := -0.204839
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Money_Flow_Index 
//@version=5
//indicator title="Money Flow Index (MFI)", shorttitle="MFI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)

// Input parameters
length_MFI = input.int(14, minval=1, title="MFI Length")

// Calculate the Typical Price
Typical_Price = (high + low + close) / 3

// Calculate Raw Money Flow
Raw_Money_Flow = Typical_Price * volume

// Calculate Positive and Negative Money Flow
Positive_Money_Flow = Raw_Money_Flow * (Typical_Price > Typical_Price[1] ? 1 : 0)
Negative_Money_Flow = Raw_Money_Flow * (Typical_Price < Typical_Price[1] ? 1 : 0)

// Sum of Positive and Negative Money Flow over the given length
Positive_Money_Flow_Sum = ta.sma(Positive_Money_Flow, length_MFI) * length_MFI
Negative_Money_Flow_Sum = ta.sma(Negative_Money_Flow, length_MFI) * length_MFI

// Calculate Money Flow Ratio
Money_Flow_Ratio = Positive_Money_Flow_Sum / Negative_Money_Flow_Sum

// Calculate MFI
MFI = 100 - (100 / (1 + Money_Flow_Ratio))

// Calculate MFI high and low bands
MFI_High = MFI - 80
MFI_Low = MFI - 20

// Plot the MFI
plot(MFI, color=color.blue, title="MFI")

// Plot the MFI high and low bands
hline(80, "MFI High", color=color.red, linestyle=hline.style_dashed)
hline(20, "MFI Low", color=color.green, linestyle=hline.style_dashed)
plot(MFI_High, color=color.red, title="MFI High Band")
plot(MFI_Low, color=color.green, title="MFI Low Band")


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
float op_operation = decision_tree_0_ETHUSDT_1Hour_48680aab(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


