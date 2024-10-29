//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: RBLX_30Min_2CM0_56982321 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_RBLX_30Min_2CM0_56982321", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_RBLX_30Min_56982321(ad_mf, mf, ad, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( Typical_Price <= 40.0821 )
		if( Negative_Money_Flow_Sum <= 9.10256e+07 )
			if( Negative_Money_Flow <= 1.1482e+07 )
				if( Money_Flow_Ratio <= 259.696 )
					if( mf <= -0.330327 )
						if( Negative_Money_Flow_Sum <= 718430 )
							ret := -0.626374
						if( Negative_Money_Flow_Sum > 718430 )
							ret := -0.018868
					if( mf > -0.330327 )
						if( MFI_High <= -2.04334 )
							ret := 0.131747
						if( MFI_High > -2.04334 )
							ret := 0.029588
				if( Money_Flow_Ratio > 259.696 )
					if( Raw_Money_Flow <= 182399 )
						if( Negative_Money_Flow <= 13479 )
							ret := 0.178571
						if( Negative_Money_Flow > 13479 )
							ret := -0.407407
					if( Raw_Money_Flow > 182399 )
						if( Typical_Price <= 36.5278 )
							ret := -0.772727 // sell
						if( Typical_Price > 36.5278 )
							ret := -0.320755
			if( Negative_Money_Flow > 1.1482e+07 )
				if( ad <= -702492 )
					if( Positive_Money_Flow_Sum <= 8.61208e+07 )
						if( Negative_Money_Flow_Sum <= 4.79928e+07 )
							ret := -0.431818
						if( Negative_Money_Flow_Sum > 4.79928e+07 )
							ret := 0.164835
					if( Positive_Money_Flow_Sum > 8.61208e+07 )
						if( Negative_Money_Flow_Sum <= 5.41779e+07 )
							ret := -0.214286
						if( Negative_Money_Flow_Sum > 5.41779e+07 )
							ret := 0.888889 // buy
				if( ad > -702492 )
					if( MFI <= 70.6437 )
						if( MFI_High <= -12.5445 )
							ret := 0.344388
						if( MFI_High > -12.5445 )
							ret := 0.760563 // buy
					if( MFI > 70.6437 )
						if( ad <= -395112 )
							ret := 0.456522
						if( ad > -395112 )
							ret := -0.015748
		if( Negative_Money_Flow_Sum > 9.10256e+07 )
			if( MFI <= 14.3309 )
				if( Positive_Money_Flow_Sum <= 4.70774e+07 )
					if( Negative_Money_Flow_Sum <= 4.60896e+08 )
						if( Positive_Money_Flow <= 1.47174e+06 )
							ret := -0.119703
						if( Positive_Money_Flow > 1.47174e+06 )
							ret := 0.644068
					if( Negative_Money_Flow_Sum > 4.60896e+08 )
						if( Negative_Money_Flow_Sum <= 5.4321e+08 )
							ret := -0.871795 // sell
						if( Negative_Money_Flow_Sum > 5.4321e+08 )
							ret := -0.318182
				if( Positive_Money_Flow_Sum > 4.70774e+07 )
					if( ad_mf <= -58935.1 )
						if( Negative_Money_Flow <= 2.64154e+07 )
							ret := 0.750000 // buy
						if( Negative_Money_Flow > 2.64154e+07 )
							ret := -0.230769
					if( ad_mf > -58935.1 )
						if( Positive_Money_Flow_Sum <= 6.99657e+07 )
							ret := -0.946429 // sell
						if( Positive_Money_Flow_Sum > 6.99657e+07 )
							ret := -0.448276
			if( MFI > 14.3309 )
				if( mf <= 0.417468 )
					if( Money_Flow_Ratio <= 2.56302 )
						if( Money_Flow_Ratio <= 2.16136 )
							ret := 0.030465
						if( Money_Flow_Ratio > 2.16136 )
							ret := 0.429530
					if( Money_Flow_Ratio > 2.56302 )
						if( ad_mf <= 166307 )
							ret := -0.036145
						if( ad_mf > 166307 )
							ret := -0.587629
				if( mf > 0.417468 )
					if( mf <= 0.59745 )
						if( Negative_Money_Flow_Sum <= 1.5473e+08 )
							ret := 0.454545
						if( Negative_Money_Flow_Sum > 1.5473e+08 )
							ret := 0.964286 // buy
					if( mf > 0.59745 )
						ret := 0.000000
	if( Typical_Price > 40.0821 )
		if( Negative_Money_Flow_Sum <= 1.48656e+07 )
			if( Negative_Money_Flow_Sum <= 744176 )
				if( Positive_Money_Flow_Sum <= 2.0022e+08 )
					if( Typical_Price <= 47.3819 )
						if( Positive_Money_Flow_Sum <= 480795 )
							ret := -0.878788 // sell
						if( Positive_Money_Flow_Sum > 480795 )
							ret := -0.135714
					if( Typical_Price > 47.3819 )
						if( Raw_Money_Flow <= 51088.4 )
							ret := -0.105263
						if( Raw_Money_Flow > 51088.4 )
							ret := -0.727273 // sell
				if( Positive_Money_Flow_Sum > 2.0022e+08 )
					if( Negative_Money_Flow_Sum <= 509928 )
						if( MFI <= 99.9112 )
							ret := 0.888889 // buy
						if( MFI > 99.9112 )
							ret := 0.500000
					if( Negative_Money_Flow_Sum > 509928 )
						ret := 0.250000
			if( Negative_Money_Flow_Sum > 744176 )
				if( mf <= -0.384928 )
					if( Positive_Money_Flow_Sum <= 8.0082e+06 )
						if( Typical_Price <= 94.6509 )
							ret := -0.603053
						if( Typical_Price > 94.6509 )
							ret := 0.500000
					if( Positive_Money_Flow_Sum > 8.0082e+06 )
						if( ad <= 15610 )
							ret := 0.489796
						if( ad > 15610 )
							ret := -0.500000
				if( mf > -0.384928 )
					if( Raw_Money_Flow <= 1.54932e+08 )
						if( Positive_Money_Flow_Sum <= 6.89294e+07 )
							ret := -0.124917
						if( Positive_Money_Flow_Sum > 6.89294e+07 )
							ret := 0.063091
					if( Raw_Money_Flow > 1.54932e+08 )
						if( Positive_Money_Flow_Sum <= 4.78258e+08 )
							ret := -0.747826 // sell
						if( Positive_Money_Flow_Sum > 4.78258e+08 )
							ret := -0.112903
		if( Negative_Money_Flow_Sum > 1.48656e+07 )
			if( Positive_Money_Flow_Sum <= 5.89118e+08 )
				if( Negative_Money_Flow_Sum <= 9.17514e+07 )
					if( Positive_Money_Flow_Sum <= 3.22314e+08 )
						if( ad_mf <= 309545 )
							ret := 0.023415
						if( ad_mf > 309545 )
							ret := 0.321101
					if( Positive_Money_Flow_Sum > 3.22314e+08 )
						if( mf <= 0.114664 )
							ret := -0.805195 // sell
						if( mf > 0.114664 )
							ret := -0.028571
				if( Negative_Money_Flow_Sum > 9.17514e+07 )
					if( Negative_Money_Flow_Sum <= 1.43949e+08 )
						if( Raw_Money_Flow <= 7.05518e+07 )
							ret := -0.150822
						if( Raw_Money_Flow > 7.05518e+07 )
							ret := -0.478673
					if( Negative_Money_Flow_Sum > 1.43949e+08 )
						if( Raw_Money_Flow <= 104139 )
							ret := 0.202830
						if( Raw_Money_Flow > 104139 )
							ret := -0.056164
			if( Positive_Money_Flow_Sum > 5.89118e+08 )
				if( Positive_Money_Flow_Sum <= 6.6372e+08 )
					if( Money_Flow_Ratio <= 2.00511 )
						if( mf <= -0.108273 )
							ret := 0.395349
						if( mf > -0.108273 )
							ret := 0.750000 // buy
					if( Money_Flow_Ratio > 2.00511 )
						if( Positive_Money_Flow_Sum <= 6.08527e+08 )
							ret := 0.500000
						if( Positive_Money_Flow_Sum > 6.08527e+08 )
							ret := 0.000000
				if( Positive_Money_Flow_Sum > 6.6372e+08 )
					if( Positive_Money_Flow_Sum <= 2.26099e+09 )
						if( mf <= 0.025395 )
							ret := -0.290698
						if( mf > 0.025395 )
							ret := 0.070755
					if( Positive_Money_Flow_Sum > 2.26099e+09 )
						if( Money_Flow_Ratio <= 7.70395 )
							ret := 0.496599
						if( Money_Flow_Ratio > 7.70395 )
							ret := -0.826087 // sell
	
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
float op_operation = decision_tree_0_RBLX_30Min_56982321(ad_mf, mf, ad, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)

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


