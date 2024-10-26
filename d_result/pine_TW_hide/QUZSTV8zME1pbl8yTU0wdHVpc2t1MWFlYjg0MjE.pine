//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_MA_Cross_SMA, L_Money_Flow_Index
// ID_model: AFRM_30Min_2MM0_1aeb8421 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AFRM_30Min_2MM0_1aeb8421", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AFRM_30Min_1aeb8421(Short_Long_Diff, MA_Cross, Long_MA, Short_MA, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( MFI_High <= -45.506 )
		if( Negative_Money_Flow_Sum <= 4.30018e+06 )
			if( Long_MA <= 20.2659 )
				if( MFI_Low <= 2.64237 )
					if( Typical_Price <= 17.5489 )
						if( Raw_Money_Flow <= 197690 )
							ret := -0.178571
						if( Raw_Money_Flow > 197690 )
							ret := -0.850877 // sell
					if( Typical_Price > 17.5489 )
						if( Positive_Money_Flow_Sum <= 245360 )
							ret := 0.857143 // buy
						if( Positive_Money_Flow_Sum > 245360 )
							ret := -0.266667
				if( MFI_Low > 2.64237 )
					if( Negative_Money_Flow_Sum <= 2.16335e+06 )
						if( Money_Flow_Ratio <= 0.355819 )
							ret := 0.746479 // buy
						if( Money_Flow_Ratio > 0.355819 )
							ret := -0.031250
					if( Negative_Money_Flow_Sum > 2.16335e+06 )
						if( Positive_Money_Flow_Sum <= 1.22065e+06 )
							ret := -0.750000 // sell
						if( Positive_Money_Flow_Sum > 1.22065e+06 )
							ret := -1.000000 // sell
			if( Long_MA > 20.2659 )
				if( MFI <= 11.3424 )
					ret := 0.388889
				if( MFI > 11.3424 )
					if( Negative_Money_Flow <= 1.33376e+06 )
						if( Negative_Money_Flow_Sum <= 899559 )
							ret := -0.909091 // sell
						if( Negative_Money_Flow_Sum > 899559 )
							ret := -0.543974
					if( Negative_Money_Flow > 1.33376e+06 )
						if( Long_MA <= 31.049 )
							ret := 0.611111
						if( Long_MA > 31.049 )
							ret := -0.382353
		if( Negative_Money_Flow_Sum > 4.30018e+06 )
			if( Long_MA <= 18.4874 )
				if( Short_Long_Diff <= 0.040761 )
					if( Short_Long_Diff <= -0.829916 )
						if( Short_MA <= 15.2107 )
							ret := 0.902439 // buy
						if( Short_MA > 15.2107 )
							ret := 0.050000
					if( Short_Long_Diff > -0.829916 )
						if( Positive_Money_Flow_Sum <= 2.45448e+07 )
							ret := 0.150376
						if( Positive_Money_Flow_Sum > 2.45448e+07 )
							ret := -0.065600
				if( Short_Long_Diff > 0.040761 )
					if( Raw_Money_Flow <= 7.96131e+06 )
						if( Short_Long_Diff <= 0.134703 )
							ret := 0.060606
						if( Short_Long_Diff > 0.134703 )
							ret := -0.439024
					if( Raw_Money_Flow > 7.96131e+06 )
						if( Negative_Money_Flow_Sum <= 8.62665e+07 )
							ret := -0.681818
						if( Negative_Money_Flow_Sum > 8.62665e+07 )
							ret := -0.105263
			if( Long_MA > 18.4874 )
				if( MFI <= 4.98505 )
					if( Short_Long_Diff <= -1.73448 )
						if( Money_Flow_Ratio <= 0.003774 )
							ret := 0.875000 // buy
						if( Money_Flow_Ratio > 0.003774 )
							ret := 0.100000
					if( Short_Long_Diff > -1.73448 )
						if( Negative_Money_Flow_Sum <= 6.22202e+07 )
							ret := -0.096436
						if( Negative_Money_Flow_Sum > 6.22202e+07 )
							ret := -0.269690
				if( MFI > 4.98505 )
					if( Positive_Money_Flow <= 3.81066e+06 )
						if( Negative_Money_Flow_Sum <= 2.70728e+07 )
							ret := 0.173629
						if( Negative_Money_Flow_Sum > 2.70728e+07 )
							ret := -0.010553
					if( Positive_Money_Flow > 3.81066e+06 )
						if( Positive_Money_Flow_Sum <= 5.06858e+08 )
							ret := -0.155072
						if( Positive_Money_Flow_Sum > 5.06858e+08 )
							ret := -0.688889
	if( MFI_High > -45.506 )
		if( Raw_Money_Flow <= 838229 )
			if( Positive_Money_Flow <= 1122.4 )
				if( Short_MA <= 19.2369 )
					if( Positive_Money_Flow_Sum <= 1.00365e+06 )
						if( Negative_Money_Flow_Sum <= 642769 )
							ret := 0.703125 // buy
						if( Negative_Money_Flow_Sum > 642769 )
							ret := 0.049587
					if( Positive_Money_Flow_Sum > 1.00365e+06 )
						if( Negative_Money_Flow <= 516498 )
							ret := 0.111940
						if( Negative_Money_Flow > 516498 )
							ret := -0.380000
				if( Short_MA > 19.2369 )
					if( Negative_Money_Flow_Sum <= 1.26881e+06 )
						if( MA_Cross <= 0.551118 )
							ret := -0.278937
						if( MA_Cross > 0.551118 )
							ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 1.26881e+06 )
						if( Negative_Money_Flow_Sum <= 5.37954e+07 )
							ret := 0.127892
						if( Negative_Money_Flow_Sum > 5.37954e+07 )
							ret := -0.024129
			if( Positive_Money_Flow > 1122.4 )
				if( Short_Long_Diff <= 0.349693 )
					if( Raw_Money_Flow <= 51485.8 )
						if( MFI <= 76.7302 )
							ret := -0.081888
						if( MFI > 76.7302 )
							ret := 0.146530
					if( Raw_Money_Flow > 51485.8 )
						if( Money_Flow_Ratio <= 0.924816 )
							ret := -0.018223
						if( Money_Flow_Ratio > 0.924816 )
							ret := -0.183466
				if( Short_Long_Diff > 0.349693 )
					if( Positive_Money_Flow_Sum <= 2.67833e+07 )
						if( Money_Flow_Ratio <= 2.0774 )
							ret := -0.038462
						if( Money_Flow_Ratio > 2.0774 )
							ret := 0.873563 // buy
					if( Positive_Money_Flow_Sum > 2.67833e+07 )
						if( Negative_Money_Flow_Sum <= 844730 )
							ret := -0.541176
						if( Negative_Money_Flow_Sum > 844730 )
							ret := 0.071348
		if( Raw_Money_Flow > 838229 )
			if( Negative_Money_Flow <= 3.12496e+07 )
				if( Short_Long_Diff <= 4.33896 )
					if( Long_MA <= 65.1 )
						if( Short_Long_Diff <= 0.016694 )
							ret := 0.024601
						if( Short_Long_Diff > 0.016694 )
							ret := 0.123064
					if( Long_MA > 65.1 )
						if( MFI_Low <= 21.2476 )
							ret := 0.170520
						if( MFI_Low > 21.2476 )
							ret := -0.060477
				if( Short_Long_Diff > 4.33896 )
					if( Short_MA <= 117.423 )
						if( Raw_Money_Flow <= 8.3002e+07 )
							ret := 0.840426 // buy
						if( Raw_Money_Flow > 8.3002e+07 )
							ret := -0.230769
					if( Short_MA > 117.423 )
						if( Negative_Money_Flow_Sum <= 1.97857e+08 )
							ret := -0.888889 // sell
						if( Negative_Money_Flow_Sum > 1.97857e+08 )
							ret := 0.052632
			if( Negative_Money_Flow > 3.12496e+07 )
				if( Typical_Price <= 19.2932 )
					if( MFI <= 55.0407 )
						ret := 0.000000
					if( MFI > 55.0407 )
						if( Money_Flow_Ratio <= 1.92304 )
							ret := -0.964286 // sell
						if( Money_Flow_Ratio > 1.92304 )
							ret := -0.655172
				if( Typical_Price > 19.2932 )
					if( Negative_Money_Flow_Sum <= 9.08198e+08 )
						if( Positive_Money_Flow_Sum <= 2.08819e+09 )
							ret := -0.065961
						if( Positive_Money_Flow_Sum > 2.08819e+09 )
							ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 9.08198e+08 )
						if( Negative_Money_Flow <= 2.70769e+08 )
							ret := -0.633333
						if( Negative_Money_Flow > 2.70769e+08 )
							ret := 0.555556
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_MA_Cross_SMA 
//@version=5
//indicator title="MA Cross", overlay=true)

shortlen = input.int(9, title="Short MA Length", minval=1)
longlen = input.int(21, title="Long MA Length", minval=1)

// Calculate the short and long simple moving averages (SMA)
Short_MA = ta.sma(close, shortlen)
Long_MA = ta.sma(close, longlen)

// Calculate the difference between short MA and long MA
Short_Long_Diff = Short_MA - Long_MA

// Identify crossover points where short MA crosses above or below the long MA
MA_Cross = ta.valuewhen(ta.crossover(Short_MA, Long_MA), Short_MA, 0)

// Plot the results
plot(Short_MA, color=color.orange, title="Short MA")
plot(Long_MA, color=color.green, title="Long MA")
plotshape(na(MA_Cross) ? na : MA_Cross, style=shape.cross, location=location.absolute, color=color.blue, title="Cross")


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
float op_operation = decision_tree_0_AFRM_30Min_1aeb8421(Short_Long_Diff, MA_Cross, Long_MA, Short_MA, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

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


