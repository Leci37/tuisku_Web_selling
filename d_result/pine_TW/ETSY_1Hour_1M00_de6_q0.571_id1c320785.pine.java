//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index
// ID_model: ETSY_1Hour_1M00_1c320785 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETSY_1Hour_1M00_1c320785", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETSY_1Hour_1c320785(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( Negative_Money_Flow_Sum <= 2.1923e+08 )
		if( Positive_Money_Flow <= 14168.5 )
			if( Negative_Money_Flow_Sum <= 7.91438e+07 )
				if( Typical_Price <= 68.0604 )
					if( Raw_Money_Flow <= 1.05376e+07 )
						if( Positive_Money_Flow <= 11116.8 )
							ret := 0.363538
						if( Positive_Money_Flow > 11116.8 )
							ret := 0.824561 // buy
					if( Raw_Money_Flow > 1.05376e+07 )
						if( Positive_Money_Flow_Sum <= 1.01637e+08 )
							ret := -0.160305
						if( Positive_Money_Flow_Sum > 1.01637e+08 )
							ret := 0.415929
				if( Typical_Price > 68.0604 )
					if( Negative_Money_Flow_Sum <= 4.49906e+07 )
						if( Positive_Money_Flow_Sum <= 3.89164e+08 )
							ret := -0.456790
						if( Positive_Money_Flow_Sum > 3.89164e+08 )
							ret := 0.338235
					if( Negative_Money_Flow_Sum > 4.49906e+07 )
						if( Raw_Money_Flow <= 2.68718e+07 )
							ret := 0.189189
						if( Raw_Money_Flow > 2.68718e+07 )
							ret := -0.266667
			if( Negative_Money_Flow_Sum > 7.91438e+07 )
				if( Typical_Price <= 62.2824 )
					if( Negative_Money_Flow <= 1.02814e+07 )
						if( Positive_Money_Flow_Sum <= 1.14241e+08 )
							ret := -0.059150
						if( Positive_Money_Flow_Sum > 1.14241e+08 )
							ret := 0.442857
					if( Negative_Money_Flow > 1.02814e+07 )
						if( Positive_Money_Flow_Sum <= 3.06982e+07 )
							ret := 0.617188
						if( Positive_Money_Flow_Sum > 3.06982e+07 )
							ret := 0.193717
				if( Typical_Price > 62.2824 )
					if( Raw_Money_Flow <= 1.16081e+07 )
						if( Positive_Money_Flow_Sum <= 1.13145e+08 )
							ret := -0.060659
						if( Positive_Money_Flow_Sum > 1.13145e+08 )
							ret := 0.158970
					if( Raw_Money_Flow > 1.16081e+07 )
						if( Positive_Money_Flow_Sum <= 5.60534e+07 )
							ret := -0.333333
						if( Positive_Money_Flow_Sum > 5.60534e+07 )
							ret := -0.018234
		if( Positive_Money_Flow > 14168.5 )
			if( Money_Flow_Ratio <= 0.050525 )
				if( Typical_Price <= 60.3617 )
					ret := 0.312500
				if( Typical_Price > 60.3617 )
					if( Typical_Price <= 67.1209 )
						ret := 1.000000 // buy
					if( Typical_Price > 67.1209 )
						ret := 0.888889 // buy
			if( Money_Flow_Ratio > 0.050525 )
				if( Positive_Money_Flow_Sum <= 6.16539e+07 )
					if( Positive_Money_Flow <= 1.3016e+07 )
						if( Negative_Money_Flow_Sum <= 2.08473e+08 )
							ret := -0.302013
						if( Negative_Money_Flow_Sum > 2.08473e+08 )
							ret := 0.590909
					if( Positive_Money_Flow > 1.3016e+07 )
						if( Positive_Money_Flow_Sum <= 4.26748e+07 )
							ret := 0.597222
						if( Positive_Money_Flow_Sum > 4.26748e+07 )
							ret := 0.099237
				if( Positive_Money_Flow_Sum > 6.16539e+07 )
					if( Money_Flow_Ratio <= 0.502154 )
						if( Typical_Price <= 120.336 )
							ret := 0.439689
						if( Typical_Price > 120.336 )
							ret := -0.750000 // sell
					if( Money_Flow_Ratio > 0.502154 )
						if( MFI_Low <= 79.9383 )
							ret := -0.004114
						if( MFI_Low > 79.9383 )
							ret := 0.605263
	if( Negative_Money_Flow_Sum > 2.1923e+08 )
		if( Positive_Money_Flow_Sum <= 1.06025e+08 )
			if( Typical_Price <= 123.921 )
				if( Negative_Money_Flow_Sum <= 2.50778e+08 )
					if( Typical_Price <= 58.905 )
						if( MFI_High <= -68.1838 )
							ret := 0.952381 // buy
						if( MFI_High > -68.1838 )
							ret := -0.061538
					if( Typical_Price > 58.905 )
						if( Positive_Money_Flow <= 352516 )
							ret := -0.521073
						if( Positive_Money_Flow > 352516 )
							ret := 0.017544
				if( Negative_Money_Flow_Sum > 2.50778e+08 )
					if( Raw_Money_Flow <= 9.60566e+07 )
						if( MFI_Low <= 7.02618 )
							ret := -0.011690
						if( MFI_Low > 7.02618 )
							ret := 0.794872 // buy
					if( Raw_Money_Flow > 9.60566e+07 )
						if( Raw_Money_Flow <= 1.34927e+08 )
							ret := 0.600000
						if( Raw_Money_Flow > 1.34927e+08 )
							ret := 0.928571 // buy
			if( Typical_Price > 123.921 )
				if( Negative_Money_Flow <= 5.20592e+07 )
					if( MFI <= 15.453 )
						if( Positive_Money_Flow_Sum <= 2.9921e+07 )
							ret := -0.065217
						if( Positive_Money_Flow_Sum > 2.9921e+07 )
							ret := -0.642032
					if( MFI > 15.453 )
						if( Money_Flow_Ratio <= 0.232298 )
							ret := 0.394366
						if( Money_Flow_Ratio > 0.232298 )
							ret := -0.475655
				if( Negative_Money_Flow > 5.20592e+07 )
					if( MFI <= 5.98656 )
						if( Negative_Money_Flow_Sum <= 7.26939e+08 )
							ret := -0.755556 // sell
						if( Negative_Money_Flow_Sum > 7.26939e+08 )
							ret := -0.086957
					if( MFI > 5.98656 )
						if( Positive_Money_Flow_Sum <= 1.0379e+08 )
							ret := 0.175141
						if( Positive_Money_Flow_Sum > 1.0379e+08 )
							ret := -0.882353 // sell
		if( Positive_Money_Flow_Sum > 1.06025e+08 )
			if( Negative_Money_Flow_Sum <= 3.27741e+08 )
				if( Negative_Money_Flow_Sum <= 2.58476e+08 )
					if( Negative_Money_Flow_Sum <= 2.35868e+08 )
						if( Positive_Money_Flow_Sum <= 2.19883e+08 )
							ret := -0.492401
						if( Positive_Money_Flow_Sum > 2.19883e+08 )
							ret := 0.161074
					if( Negative_Money_Flow_Sum > 2.35868e+08 )
						if( Raw_Money_Flow <= 5.51795e+07 )
							ret := 0.176774
						if( Raw_Money_Flow > 5.51795e+07 )
							ret := -0.179916
				if( Negative_Money_Flow_Sum > 2.58476e+08 )
					if( Money_Flow_Ratio <= 0.762788 )
						if( Negative_Money_Flow <= 8.70968e+07 )
							ret := -0.294836
						if( Negative_Money_Flow > 8.70968e+07 )
							ret := 0.395833
					if( Money_Flow_Ratio > 0.762788 )
						if( Positive_Money_Flow_Sum <= 4.455e+08 )
							ret := 0.006859
						if( Positive_Money_Flow_Sum > 4.455e+08 )
							ret := -0.397321
			if( Negative_Money_Flow_Sum > 3.27741e+08 )
				if( MFI <= 56.9479 )
					if( Positive_Money_Flow_Sum <= 1.07113e+09 )
						if( Negative_Money_Flow_Sum <= 6.58808e+08 )
							ret := 0.136290
						if( Negative_Money_Flow_Sum > 6.58808e+08 )
							ret := -0.258294
					if( Positive_Money_Flow_Sum > 1.07113e+09 )
						if( Positive_Money_Flow_Sum <= 1.34659e+09 )
							ret := 0.818182 // buy
						if( Positive_Money_Flow_Sum > 1.34659e+09 )
							ret := 1.000000 // buy
				if( MFI > 56.9479 )
					if( Raw_Money_Flow <= 2.39419e+08 )
						if( Negative_Money_Flow <= 39016.3 )
							ret := -0.686747
						if( Negative_Money_Flow > 39016.3 )
							ret := -0.053435
					if( Raw_Money_Flow > 2.39419e+08 )
						if( MFI <= 68.2277 )
							ret := 0.900000 // buy
						if( MFI > 68.2277 )
							ret := -0.062500
	
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
float op_operation = decision_tree_0_ETSY_1Hour_1c320785(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


