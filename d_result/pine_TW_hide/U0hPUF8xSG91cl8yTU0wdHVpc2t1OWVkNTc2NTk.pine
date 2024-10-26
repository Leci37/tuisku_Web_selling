//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_MA_Cross_SMA, L_Money_Flow_Index
// ID_model: SHOP_1Hour_2MM0_9ed57659 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SHOP_1Hour_2MM0_9ed57659", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SHOP_1Hour_9ed57659(Short_Long_Diff, MA_Cross, Long_MA, Short_MA, Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( Negative_Money_Flow_Sum <= 7.65763e+08 )
		if( Raw_Money_Flow <= 973655 )
			if( Short_MA <= 70.1139 )
				if( MFI_High <= -46.0489 )
					if( Positive_Money_Flow_Sum <= 1.63183e+08 )
						if( Negative_Money_Flow_Sum <= 6.67259e+08 )
							ret := 0.050000
						if( Negative_Money_Flow_Sum > 6.67259e+08 )
							ret := -0.782609 // sell
					if( Positive_Money_Flow_Sum > 1.63183e+08 )
						if( Negative_Money_Flow_Sum <= 5.87914e+08 )
							ret := 0.613734
						if( Negative_Money_Flow_Sum > 5.87914e+08 )
							ret := 0.152778
				if( MFI_High > -46.0489 )
					if( MFI_High <= -15.2927 )
						if( Positive_Money_Flow_Sum <= 1.78359e+08 )
							ret := 0.254902
						if( Positive_Money_Flow_Sum > 1.78359e+08 )
							ret := -0.200358
					if( MFI_High > -15.2927 )
						if( MFI <= 97.9895 )
							ret := 0.154696
						if( MFI > 97.9895 )
							ret := -0.564103
			if( Short_MA > 70.1139 )
				if( Negative_Money_Flow_Sum <= 5.24505e+08 )
					if( MFI_High <= -36.8833 )
						if( Short_MA <= 337.677 )
							ret := 0.354745
						if( Short_MA > 337.677 )
							ret := 0.763889 // buy
					if( MFI_High > -36.8833 )
						if( Positive_Money_Flow_Sum <= 9.15736e+07 )
							ret := 0.776119 // buy
						if( Positive_Money_Flow_Sum > 9.15736e+07 )
							ret := 0.133155
				if( Negative_Money_Flow_Sum > 5.24505e+08 )
					if( Negative_Money_Flow_Sum <= 6.23454e+08 )
						if( Positive_Money_Flow <= 654844 )
							ret := -0.322148
						if( Positive_Money_Flow > 654844 )
							ret := 0.512195
					if( Negative_Money_Flow_Sum > 6.23454e+08 )
						if( Short_MA <= 638.521 )
							ret := 0.005714
						if( Short_MA > 638.521 )
							ret := 0.558659
		if( Raw_Money_Flow > 973655 )
			if( Short_Long_Diff <= 10.6951 )
				if( Negative_Money_Flow <= 1.73669e+06 )
					if( Short_Long_Diff <= -18.1027 )
						if( MFI <= 50.6289 )
							ret := 0.333333
						if( MFI > 50.6289 )
							ret := -0.882353 // sell
					if( Short_Long_Diff > -18.1027 )
						if( Negative_Money_Flow_Sum <= 7.59907e+08 )
							ret := 0.028933
						if( Negative_Money_Flow_Sum > 7.59907e+08 )
							ret := 0.884615 // buy
				if( Negative_Money_Flow > 1.73669e+06 )
					if( Negative_Money_Flow_Sum <= 8.26013e+07 )
						if( MFI <= 81.1039 )
							ret := 0.575221
						if( MFI > 81.1039 )
							ret := 0.057851
					if( Negative_Money_Flow_Sum > 8.26013e+07 )
						if( Money_Flow_Ratio <= 0.536519 )
							ret := 0.056653
						if( Money_Flow_Ratio > 0.536519 )
							ret := -0.130736
			if( Short_Long_Diff > 10.6951 )
				if( Long_MA <= 674.763 )
					if( Short_Long_Diff <= 21.6549 )
						if( MFI_High <= -12.8782 )
							ret := -0.240000
						if( MFI_High > -12.8782 )
							ret := 0.645646
					if( Short_Long_Diff > 21.6549 )
						if( MFI_Low <= 66.0909 )
							ret := 0.480000
						if( MFI_Low > 66.0909 )
							ret := -0.617647
				if( Long_MA > 674.763 )
					if( Negative_Money_Flow_Sum <= 1.63319e+08 )
						if( Positive_Money_Flow <= 2.15024e+08 )
							ret := -0.613445
						if( Positive_Money_Flow > 2.15024e+08 )
							ret := 0.194444
					if( Negative_Money_Flow_Sum > 1.63319e+08 )
						if( MFI <= 83.2649 )
							ret := -0.033774
						if( MFI > 83.2649 )
							ret := 0.338422
	if( Negative_Money_Flow_Sum > 7.65763e+08 )
		if( Money_Flow_Ratio <= 0.848766 )
			if( Negative_Money_Flow <= 4.46006e+06 )
				if( Short_MA <= 337.736 )
					if( Raw_Money_Flow <= 8.05849e+07 )
						if( Negative_Money_Flow_Sum <= 8.11311e+08 )
							ret := -0.590476
						if( Negative_Money_Flow_Sum > 8.11311e+08 )
							ret := 0.096886
					if( Raw_Money_Flow > 8.05849e+07 )
						if( MFI_Low <= 10.1582 )
							ret := 0.821429 // buy
						if( MFI_Low > 10.1582 )
							ret := 0.136364
				if( Short_MA > 337.736 )
					if( Negative_Money_Flow_Sum <= 9.56099e+08 )
						if( Raw_Money_Flow <= 978567 )
							ret := -0.179487
						if( Raw_Money_Flow > 978567 )
							ret := -0.611260
					if( Negative_Money_Flow_Sum > 9.56099e+08 )
						if( Negative_Money_Flow_Sum <= 9.77815e+08 )
							ret := 0.583333
						if( Negative_Money_Flow_Sum > 9.77815e+08 )
							ret := -0.249652
			if( Negative_Money_Flow > 4.46006e+06 )
				if( MFI_High <= -66.495 )
					if( Positive_Money_Flow_Sum <= 7.15086e+07 )
						if( Long_MA <= 85.9632 )
							ret := 0.333333
						if( Long_MA > 85.9632 )
							ret := -0.368421
					if( Positive_Money_Flow_Sum > 7.15086e+07 )
						if( Negative_Money_Flow <= 1.31734e+08 )
							ret := 0.785714 // buy
						if( Negative_Money_Flow > 1.31734e+08 )
							ret := 0.127660
				if( MFI_High > -66.495 )
					if( Positive_Money_Flow_Sum <= 2.50763e+08 )
						if( Short_MA <= 993.39 )
							ret := -0.758333 // sell
						if( Short_MA > 993.39 )
							ret := -0.064516
					if( Positive_Money_Flow_Sum > 2.50763e+08 )
						if( Money_Flow_Ratio <= 0.340648 )
							ret := 0.071563
						if( Money_Flow_Ratio > 0.340648 )
							ret := -0.139089
		if( Money_Flow_Ratio > 0.848766 )
			if( Typical_Price <= 1047.23 )
				if( MFI_High <= -32.411 )
					if( Raw_Money_Flow <= 7.00523e+07 )
						if( Typical_Price <= 989.423 )
							ret := 0.904110 // buy
						if( Typical_Price > 989.423 )
							ret := 0.454545
					if( Raw_Money_Flow > 7.00523e+07 )
						if( Short_Long_Diff <= -6.90972 )
							ret := -0.500000
						if( Short_Long_Diff > -6.90972 )
							ret := 0.456522
				if( MFI_High > -32.411 )
					if( Money_Flow_Ratio <= 2.18288 )
						if( Positive_Money_Flow_Sum <= 7.94322e+08 )
							ret := 0.750000 // buy
						if( Positive_Money_Flow_Sum > 7.94322e+08 )
							ret := -0.032461
					if( Money_Flow_Ratio > 2.18288 )
						if( Raw_Money_Flow <= 8.11678e+08 )
							ret := 0.563953
						if( Raw_Money_Flow > 8.11678e+08 )
							ret := -1.000000 // sell
			if( Typical_Price > 1047.23 )
				if( Positive_Money_Flow_Sum <= 2.62237e+09 )
					if( Money_Flow_Ratio <= 1.93561 )
						if( Negative_Money_Flow <= 1.50978e+08 )
							ret := -0.065217
						if( Negative_Money_Flow > 1.50978e+08 )
							ret := -0.409091
					if( Money_Flow_Ratio > 1.93561 )
						if( Short_MA <= 1103.96 )
							ret := -1.000000 // sell
						if( Short_MA > 1103.96 )
							ret := 0.545455
				if( Positive_Money_Flow_Sum > 2.62237e+09 )
					if( Short_MA <= 1410.28 )
						if( Negative_Money_Flow_Sum <= 2.21142e+09 )
							ret := -0.960784 // sell
						if( Negative_Money_Flow_Sum > 2.21142e+09 )
							ret := -0.333333
					if( Short_MA > 1410.28 )
						if( Negative_Money_Flow_Sum <= 1.4589e+09 )
							ret := 0.055556
						if( Negative_Money_Flow_Sum > 1.4589e+09 )
							ret := -0.562500
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
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
float op_operation = decision_tree_0_SHOP_1Hour_9ed57659(Short_Long_Diff, MA_Cross, Long_MA, Short_MA, Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)

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


