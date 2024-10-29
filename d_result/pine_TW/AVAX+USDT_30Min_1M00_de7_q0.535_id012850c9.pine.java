//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index
// ID_model: AVAXUSDT_30Min_1M00_012850c9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AVAXUSDT_30Min_1M00_012850c9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AVAXUSDT_30Min_012850c9(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( MFI_Low <= 3.58469 )
		if( Negative_Money_Flow <= 7.37332e+06 )
			if( Positive_Money_Flow_Sum <= 1.66491e+07 )
				if( Positive_Money_Flow <= 1365.83 )
					if( Raw_Money_Flow <= 1.51093e+06 )
						if( MFI <= 16.6572 )
							if( Typical_Price <= 3.33807 )
								ret := 0.529412
							if( Typical_Price > 3.33807 )
								ret := -0.029851
						if( MFI > 16.6572 )
							if( Negative_Money_Flow_Sum <= 2.23186e+07 )
								ret := 0.200494
							if( Negative_Money_Flow_Sum > 2.23186e+07 )
								ret := 0.570248
					if( Raw_Money_Flow > 1.51093e+06 )
						if( Negative_Money_Flow_Sum <= 3.14773e+07 )
							if( Typical_Price <= 14.9934 )
								ret := 0.250000
							if( Typical_Price > 14.9934 )
								ret := -0.184022
						if( Negative_Money_Flow_Sum > 3.14773e+07 )
							if( Money_Flow_Ratio <= 0.221405 )
								ret := 0.512690
							if( Money_Flow_Ratio > 0.221405 )
								ret := -0.104348
				if( Positive_Money_Flow > 1365.83 )
					if( MFI_Low <= -2.86154 )
						if( Positive_Money_Flow <= 3.36916e+06 )
							if( Positive_Money_Flow_Sum <= 1.22247e+07 )
								ret := -0.185512
							if( Positive_Money_Flow_Sum > 1.22247e+07 )
								ret := 0.750000 // buy
						if( Positive_Money_Flow > 3.36916e+06 )
							if( Typical_Price <= 48.193 )
								ret := 0.000000
							if( Typical_Price > 48.193 )
								ret := -0.800000 // sell
					if( MFI_Low > -2.86154 )
						if( Negative_Money_Flow_Sum <= 2.97159e+07 )
							if( Positive_Money_Flow_Sum <= 3.27409e+06 )
								ret := 0.019900
							if( Positive_Money_Flow_Sum > 3.27409e+06 )
								ret := 0.254079
						if( Negative_Money_Flow_Sum > 2.97159e+07 )
							if( Positive_Money_Flow <= 1.40766e+06 )
								ret := -0.787234 // sell
							if( Positive_Money_Flow > 1.40766e+06 )
								ret := -0.061947
			if( Positive_Money_Flow_Sum > 1.66491e+07 )
				if( Negative_Money_Flow_Sum <= 7.67397e+07 )
					if( MFI_Low <= 1.78298 )
						if( Typical_Price <= 94.4267 )
							if( Raw_Money_Flow <= 3.51575e+06 )
								ret := 0.285714
							if( Raw_Money_Flow > 3.51575e+06 )
								ret := 0.917808 // buy
						if( Typical_Price > 94.4267 )
							ret := -0.666667
					if( MFI_Low > 1.78298 )
						if( Typical_Price <= 86.5386 )
							if( Typical_Price <= 20.4283 )
								ret := -0.750000 // sell
							if( Typical_Price > 20.4283 )
								ret := 0.545455
						if( Typical_Price > 86.5386 )
							if( Raw_Money_Flow <= 5.44023e+06 )
								ret := -1.000000 // sell
							if( Raw_Money_Flow > 5.44023e+06 )
								ret := 0.000000
				if( Negative_Money_Flow_Sum > 7.67397e+07 )
					if( MFI_High <= -61.6755 )
						if( Positive_Money_Flow_Sum <= 1.79732e+07 )
							if( Typical_Price <= 67.3833 )
								ret := -0.222222
							if( Typical_Price > 67.3833 )
								ret := 0.800000 // buy
						if( Positive_Money_Flow_Sum > 1.79732e+07 )
							if( Raw_Money_Flow <= 8.63726e+06 )
								ret := 0.894737 // buy
							if( Raw_Money_Flow > 8.63726e+06 )
								ret := 0.600000
					if( MFI_High > -61.6755 )
						if( Positive_Money_Flow_Sum <= 3.56468e+07 )
							if( Positive_Money_Flow <= 2.27251e+06 )
								ret := 0.073171
							if( Positive_Money_Flow > 2.27251e+06 )
								ret := -0.589286
						if( Positive_Money_Flow_Sum > 3.56468e+07 )
							if( Raw_Money_Flow <= 1.5934e+07 )
								ret := 0.833333 // buy
							if( Raw_Money_Flow > 1.5934e+07 )
								ret := 0.333333
		if( Negative_Money_Flow > 7.37332e+06 )
			if( Negative_Money_Flow_Sum <= 1.95842e+08 )
				if( MFI <= 17.6315 )
					if( Typical_Price <= 35.4889 )
						if( Negative_Money_Flow_Sum <= 3.00725e+07 )
							if( Typical_Price <= 20.0644 )
								ret := 0.809524 // buy
							if( Typical_Price > 20.0644 )
								ret := 0.227273
						if( Negative_Money_Flow_Sum > 3.00725e+07 )
							if( MFI_Low <= -6.75672 )
								ret := 0.923077 // buy
							if( MFI_Low > -6.75672 )
								ret := 0.588235
					if( Typical_Price > 35.4889 )
						if( Money_Flow_Ratio <= 0.080203 )
							if( Negative_Money_Flow_Sum <= 7.85879e+07 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 7.85879e+07 )
								ret := 0.000000
						if( Money_Flow_Ratio > 0.080203 )
							if( MFI_High <= -66.6504 )
								ret := 0.619048
							if( MFI_High > -66.6504 )
								ret := -0.023622
				if( MFI > 17.6315 )
					if( Money_Flow_Ratio <= 0.293134 )
						if( Positive_Money_Flow_Sum <= 8.35247e+06 )
							if( Raw_Money_Flow <= 8.35766e+06 )
								ret := 0.700000 // buy
							if( Raw_Money_Flow > 8.35766e+06 )
								ret := -0.466667
						if( Positive_Money_Flow_Sum > 8.35247e+06 )
							if( Raw_Money_Flow <= 1.08754e+07 )
								ret := 0.856209 // buy
							if( Raw_Money_Flow > 1.08754e+07 )
								ret := 0.666667
					if( Money_Flow_Ratio > 0.293134 )
						if( Raw_Money_Flow <= 1.11135e+07 )
							if( MFI_Low <= 3.38879 )
								ret := -0.580645
							if( MFI_Low > 3.38879 )
								ret := 0.750000 // buy
						if( Raw_Money_Flow > 1.11135e+07 )
							if( Positive_Money_Flow_Sum <= 2.03102e+07 )
								ret := 0.454545
							if( Positive_Money_Flow_Sum > 2.03102e+07 )
								ret := 0.882353 // buy
			if( Negative_Money_Flow_Sum > 1.95842e+08 )
				if( Money_Flow_Ratio <= 0.228981 )
					ret := 0.833333 // buy
				if( Money_Flow_Ratio > 0.228981 )
					if( Negative_Money_Flow <= 2.91841e+07 )
						if( Money_Flow_Ratio <= 0.257764 )
							ret := -1.000000 // sell
						if( Money_Flow_Ratio > 0.257764 )
							ret := -0.750000 // sell
					if( Negative_Money_Flow > 2.91841e+07 )
						ret := 0.000000
	if( MFI_Low > 3.58469 )
		if( Negative_Money_Flow_Sum <= 2.5551e+07 )
			if( Positive_Money_Flow_Sum <= 1.15182e+06 )
				if( Positive_Money_Flow_Sum <= 300578 )
					if( Negative_Money_Flow <= 25865.9 )
						if( MFI_High <= -53.7349 )
							if( Money_Flow_Ratio <= 0.324799 )
								ret := -0.122807
							if( Money_Flow_Ratio > 0.324799 )
								ret := 0.494737
						if( MFI_High > -53.7349 )
							if( MFI_High <= -39.401 )
								ret := -0.177346
							if( MFI_High > -39.401 )
								ret := 0.001245
					if( Negative_Money_Flow > 25865.9 )
						if( MFI_High <= -42.1725 )
							if( Negative_Money_Flow <= 208436 )
								ret := -0.014894
							if( Negative_Money_Flow > 208436 )
								ret := -0.857143 // sell
						if( MFI_High > -42.1725 )
							if( MFI_High <= -33.097 )
								ret := 0.618056
							if( MFI_High > -33.097 )
								ret := 0.310484
				if( Positive_Money_Flow_Sum > 300578 )
					if( Negative_Money_Flow_Sum <= 157528 )
						if( Positive_Money_Flow_Sum <= 540519 )
							if( MFI_High <= -8.45327 )
								ret := 0.000000
							if( MFI_High > -8.45327 )
								ret := 0.545977
						if( Positive_Money_Flow_Sum > 540519 )
							if( Positive_Money_Flow_Sum <= 717974 )
								ret := -0.657143
							if( Positive_Money_Flow_Sum > 717974 )
								ret := 0.315789
					if( Negative_Money_Flow_Sum > 157528 )
						if( Typical_Price <= 8.29902 )
							if( Positive_Money_Flow_Sum <= 918305 )
								ret := -0.125687
							if( Positive_Money_Flow_Sum > 918305 )
								ret := -0.518395
						if( Typical_Price > 8.29902 )
							if( Negative_Money_Flow <= 1.02508e+06 )
								ret := -0.030751
							if( Negative_Money_Flow > 1.02508e+06 )
								ret := -0.714286 // sell
			if( Positive_Money_Flow_Sum > 1.15182e+06 )
				if( MFI <= 56.7597 )
					if( MFI_High <= -45.4772 )
						if( Typical_Price <= 36.115 )
							if( Negative_Money_Flow <= 1.3226e+06 )
								ret := 0.041958
							if( Negative_Money_Flow > 1.3226e+06 )
								ret := 0.205564
						if( Typical_Price > 36.115 )
							if( Negative_Money_Flow_Sum <= 2.10993e+07 )
								ret := -0.265649
							if( Negative_Money_Flow_Sum > 2.10993e+07 )
								ret := 0.187970
					if( MFI_High > -45.4772 )
						if( Negative_Money_Flow_Sum <= 4.01318e+06 )
							if( Negative_Money_Flow_Sum <= 2.90106e+06 )
								ret := 0.017273
							if( Negative_Money_Flow_Sum > 2.90106e+06 )
								ret := 0.137014
						if( Negative_Money_Flow_Sum > 4.01318e+06 )
							if( Negative_Money_Flow <= 4.6952e+06 )
								ret := -0.043500
							if( Negative_Money_Flow > 4.6952e+06 )
								ret := -0.317857
				if( MFI > 56.7597 )
					if( MFI_Low <= 65.1531 )
						if( Positive_Money_Flow_Sum <= 6.35331e+07 )
							if( Raw_Money_Flow <= 132250 )
								ret := -0.082917
							if( Raw_Money_Flow > 132250 )
								ret := 0.044135
						if( Positive_Money_Flow_Sum > 6.35331e+07 )
							if( Raw_Money_Flow <= 3.86487e+06 )
								ret := 0.686747
							if( Raw_Money_Flow > 3.86487e+06 )
								ret := 0.187500
					if( MFI_Low > 65.1531 )
						if( Typical_Price <= 28.1082 )
							if( Positive_Money_Flow_Sum <= 7.12522e+06 )
								ret := 0.208054
							if( Positive_Money_Flow_Sum > 7.12522e+06 )
								ret := -0.001212
						if( Typical_Price > 28.1082 )
							if( Positive_Money_Flow_Sum <= 1.23278e+08 )
								ret := -0.303279
							if( Positive_Money_Flow_Sum > 1.23278e+08 )
								ret := 0.196970
		if( Negative_Money_Flow_Sum > 2.5551e+07 )
			if( Negative_Money_Flow <= 4.62043e+06 )
				if( Negative_Money_Flow_Sum <= 8.23275e+07 )
					if( Typical_Price <= 74.7684 )
						if( MFI <= 39.2662 )
							if( Raw_Money_Flow <= 2.21518e+06 )
								ret := -0.113524
							if( Raw_Money_Flow > 2.21518e+06 )
								ret := 0.134065
						if( MFI > 39.2662 )
							if( Money_Flow_Ratio <= 3.64982 )
								ret := -0.068485
							if( Money_Flow_Ratio > 3.64982 )
								ret := -0.459854
					if( Typical_Price > 74.7684 )
						if( Raw_Money_Flow <= 1.44029e+07 )
							if( Positive_Money_Flow <= 8.34864e+06 )
								ret := -0.196842
							if( Positive_Money_Flow > 8.34864e+06 )
								ret := -0.469933
						if( Raw_Money_Flow > 1.44029e+07 )
							if( Typical_Price <= 123.383 )
								ret := 0.233553
							if( Typical_Price > 123.383 )
								ret := -0.562500
				if( Negative_Money_Flow_Sum > 8.23275e+07 )
					if( Typical_Price <= 107.648 )
						if( MFI_High <= -42.8654 )
							if( MFI_Low <= 9.63501 )
								ret := -0.261538
							if( MFI_Low > 9.63501 )
								ret := -0.619863
						if( MFI_High > -42.8654 )
							if( Positive_Money_Flow <= 1.34153e+07 )
								ret := -0.066964
							if( Positive_Money_Flow > 1.34153e+07 )
								ret := -0.365651
					if( Typical_Price > 107.648 )
						if( Positive_Money_Flow_Sum <= 2.28266e+08 )
							if( MFI <= 38.1285 )
								ret := -0.724138 // sell
							if( MFI > 38.1285 )
								ret := -0.200000
						if( Positive_Money_Flow_Sum > 2.28266e+08 )
							if( Negative_Money_Flow_Sum <= 1.118e+08 )
								ret := -0.800000 // sell
							if( Negative_Money_Flow_Sum > 1.118e+08 )
								ret := -1.000000 // sell
			if( Negative_Money_Flow > 4.62043e+06 )
				if( Negative_Money_Flow <= 1.91324e+07 )
					if( Negative_Money_Flow_Sum <= 1.05644e+08 )
						if( Negative_Money_Flow_Sum <= 7.1923e+07 )
							if( Positive_Money_Flow_Sum <= 4.49176e+07 )
								ret := 0.090000
							if( Positive_Money_Flow_Sum > 4.49176e+07 )
								ret := -0.059430
						if( Negative_Money_Flow_Sum > 7.1923e+07 )
							if( MFI <= 64.5026 )
								ret := 0.122601
							if( MFI > 64.5026 )
								ret := 0.466216
					if( Negative_Money_Flow_Sum > 1.05644e+08 )
						if( Typical_Price <= 57.3717 )
							if( Negative_Money_Flow_Sum <= 1.20498e+08 )
								ret := -0.378378
							if( Negative_Money_Flow_Sum > 1.20498e+08 )
								ret := 0.333333
						if( Typical_Price > 57.3717 )
							if( Negative_Money_Flow_Sum <= 1.72941e+08 )
								ret := -0.470219
							if( Negative_Money_Flow_Sum > 1.72941e+08 )
								ret := 0.387097
				if( Negative_Money_Flow > 1.91324e+07 )
					if( MFI <= 49.7349 )
						if( Negative_Money_Flow_Sum <= 3.06891e+07 )
							ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 3.06891e+07 )
							if( MFI <= 25.7597 )
								ret := 0.210526
							if( MFI > 25.7597 )
								ret := 0.722973 // buy
					if( MFI > 49.7349 )
						if( MFI <= 55.2385 )
							if( Negative_Money_Flow <= 1.94595e+07 )
								ret := 0.000000
							if( Negative_Money_Flow > 1.94595e+07 )
								ret := -0.952381 // sell
						if( MFI > 55.2385 )
							if( Money_Flow_Ratio <= 1.76104 )
								ret := 0.607143
							if( Money_Flow_Ratio > 1.76104 )
								ret := -0.066667
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_AVAXUSDT_30Min_012850c9(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

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


