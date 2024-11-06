//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: TRXUSDT_1Min_2MT0_92ec6292 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_1Min_2MT0_92ec6292", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_1Min_92ec6292(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, ema1, tema, ema12, ema2, ema3, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( Negative_Money_Flow <= 0.108399 )
		if( Positive_Money_Flow <= 0.489062 )
			if( MFI <= 81.8616 )
				if( Negative_Money_Flow_Sum <= 6965.44 )
					if( ema12 <= -2e-06 )
						if( Money_Flow_Ratio <= 2.50886 )
							if( Raw_Money_Flow <= 8210.31 )
								ret := 0.446154
							if( Raw_Money_Flow > 8210.31 )
								ret := -0.166667
						if( Money_Flow_Ratio > 2.50886 )
							if( ema13 <= -1.5e-05 )
								ret := 0.555556
							if( ema13 > -1.5e-05 )
								ret := 0.954545 // buy
					if( ema12 > -2e-06 )
						if( ema12 <= 1.2e-05 )
							if( MFI <= 68.0502 )
								ret := -0.443548
							if( MFI > 68.0502 )
								ret := -0.090226
						if( ema12 > 1.2e-05 )
							if( ema13 <= 4.2e-05 )
								ret := -0.645669
							if( ema13 > 4.2e-05 )
								ret := -0.295082
				if( Negative_Money_Flow_Sum > 6965.44 )
					if( Positive_Money_Flow_Sum <= 8798.82 )
						if( ema12 <= -8e-06 )
							if( Negative_Money_Flow_Sum <= 39605.6 )
								ret := 0.535433
							if( Negative_Money_Flow_Sum > 39605.6 )
								ret := 0.090650
						if( ema12 > -8e-06 )
							if( Positive_Money_Flow_Sum <= 7857.5 )
								ret := -0.334282
							if( Positive_Money_Flow_Sum > 7857.5 )
								ret := -0.047120
					if( Positive_Money_Flow_Sum > 8798.82 )
						if( Typical_Price <= 0.150346 )
							if( ema13 <= 6.4e-05 )
								ret := 0.037329
							if( ema13 > 6.4e-05 )
								ret := -0.147907
						if( Typical_Price > 0.150346 )
							if( ema13 <= -3.6e-05 )
								ret := 0.117647
							if( ema13 > -3.6e-05 )
								ret := -0.071763
			if( MFI > 81.8616 )
				if( ema12 <= 2e-06 )
					if( Typical_Price <= 0.150631 )
						if( ema2 <= 0.123669 )
							if( Negative_Money_Flow_Sum <= 13770.1 )
								ret := -0.363636
							if( Negative_Money_Flow_Sum > 13770.1 )
								ret := 0.076923
						if( ema2 > 0.123669 )
							if( Raw_Money_Flow <= 5527.18 )
								ret := 0.422594
							if( Raw_Money_Flow > 5527.18 )
								ret := 0.650442
					if( Typical_Price > 0.150631 )
						if( Negative_Money_Flow_Sum <= 14777.2 )
							if( MFI <= 90.6307 )
								ret := -0.166667
							if( MFI > 90.6307 )
								ret := 0.357143
						if( Negative_Money_Flow_Sum > 14777.2 )
							if( MFI_Low <= 65.6825 )
								ret := 0.096774
							if( MFI_Low > 65.6825 )
								ret := 0.534247
				if( ema12 > 2e-06 )
					if( Raw_Money_Flow <= 88113.8 )
						if( ema12 <= 6.6e-05 )
							if( ema13 <= 5.3e-05 )
								ret := -0.071362
							if( ema13 > 5.3e-05 )
								ret := -0.257745
						if( ema12 > 6.6e-05 )
							if( Positive_Money_Flow_Sum <= 561413 )
								ret := -0.433566
							if( Positive_Money_Flow_Sum > 561413 )
								ret := -0.079365
					if( Raw_Money_Flow > 88113.8 )
						if( Money_Flow_Ratio <= 5.83548 )
							if( Negative_Money_Flow_Sum <= 114225 )
								ret := 0.296296
							if( Negative_Money_Flow_Sum > 114225 )
								ret := -0.600000
						if( Money_Flow_Ratio > 5.83548 )
							if( ema1 <= 0.150308 )
								ret := 0.532338
							if( ema1 > 0.150308 )
								ret := 0.267123
		if( Positive_Money_Flow > 0.489062 )
			if( tema <= 0.130136 )
				if( ema13 <= 0.000186 )
					if( tema <= 0.12356 )
						if( MFI <= 31.6612 )
							if( Negative_Money_Flow_Sum <= 2.13774e+06 )
								ret := 0.043956
							if( Negative_Money_Flow_Sum > 2.13774e+06 )
								ret := 0.650000
						if( MFI > 31.6612 )
							if( Positive_Money_Flow <= 86724 )
								ret := -0.038119
							if( Positive_Money_Flow > 86724 )
								ret := -0.146842
					if( tema > 0.12356 )
						if( Positive_Money_Flow <= 5982.12 )
							if( ema13 <= 1e-06 )
								ret := -0.084602
							if( ema13 > 1e-06 )
								ret := -0.262962
						if( Positive_Money_Flow > 5982.12 )
							if( Positive_Money_Flow_Sum <= 612365 )
								ret := -0.078120
							if( Positive_Money_Flow_Sum > 612365 )
								ret := 0.077852
				if( ema13 > 0.000186 )
					if( MFI <= 84.8174 )
						if( Negative_Money_Flow_Sum <= 234111 )
							if( Typical_Price <= 0.127916 )
								ret := -0.739130 // sell
							if( Typical_Price > 0.127916 )
								ret := -0.142857
						if( Negative_Money_Flow_Sum > 234111 )
							if( ema13 <= 0.000554 )
								ret := 0.607509
							if( ema13 > 0.000554 )
								ret := -0.333333
					if( MFI > 84.8174 )
						if( Negative_Money_Flow_Sum <= 182513 )
							if( Negative_Money_Flow_Sum <= 22730.2 )
								ret := -0.474576
							if( Negative_Money_Flow_Sum > 22730.2 )
								ret := 0.345000
						if( Negative_Money_Flow_Sum > 182513 )
							if( Money_Flow_Ratio <= 5.89598 )
								ret := -0.809524 // sell
							if( Money_Flow_Ratio > 5.89598 )
								ret := -0.338710
			if( tema > 0.130136 )
				if( Raw_Money_Flow <= 30350.4 )
					if( tema <= 0.138437 )
						if( Positive_Money_Flow <= 4800.86 )
							if( ema3 <= 0.133759 )
								ret := -0.351176
							if( ema3 > 0.133759 )
								ret := -0.239467
						if( Positive_Money_Flow > 4800.86 )
							if( ema13 <= 2.2e-05 )
								ret := -0.099256
							if( ema13 > 2.2e-05 )
								ret := -0.211367
					if( tema > 0.138437 )
						if( Raw_Money_Flow <= 10806.3 )
							if( ema3 <= 0.147133 )
								ret := -0.515593
							if( ema3 > 0.147133 )
								ret := -0.348663
						if( Raw_Money_Flow > 10806.3 )
							if( ema13 <= -0 )
								ret := -0.218507
							if( ema13 > -0 )
								ret := -0.318813
				if( Raw_Money_Flow > 30350.4 )
					if( Positive_Money_Flow <= 826352 )
						if( Positive_Money_Flow_Sum <= 5.14011e+06 )
							if( Positive_Money_Flow_Sum <= 1.25353e+06 )
								ret := -0.078494
							if( Positive_Money_Flow_Sum > 1.25353e+06 )
								ret := 0.066179
						if( Positive_Money_Flow_Sum > 5.14011e+06 )
							if( Positive_Money_Flow <= 581201 )
								ret := 0.948718 // buy
							if( Positive_Money_Flow > 581201 )
								ret := 0.125000
					if( Positive_Money_Flow > 826352 )
						if( Negative_Money_Flow_Sum <= 3.09859e+06 )
							if( Negative_Money_Flow_Sum <= 129620 )
								ret := -0.187500
							if( Negative_Money_Flow_Sum > 129620 )
								ret := -0.704545 // sell
						if( Negative_Money_Flow_Sum > 3.09859e+06 )
							if( ema1 <= 0.158599 )
								ret := 0.692308
							if( ema1 > 0.158599 )
								ret := -0.866667 // sell
	if( Negative_Money_Flow > 0.108399 )
		if( Typical_Price <= 0.126028 )
			if( ema2 <= 0.1207 )
				if( Negative_Money_Flow <= 692.311 )
					if( ema13 <= -5e-06 )
						if( Negative_Money_Flow_Sum <= 553425 )
							if( Raw_Money_Flow <= 793.507 )
								ret := 0.285714
							if( Raw_Money_Flow > 793.507 )
								ret := 0.913043 // buy
						if( Negative_Money_Flow_Sum > 553425 )
							ret := 0.111111
					if( ema13 > -5e-06 )
						if( Positive_Money_Flow <= 1623.55 )
							if( ema12 <= 1.7e-05 )
								ret := 0.212766
							if( ema12 > 1.7e-05 )
								ret := -0.434783
						if( Positive_Money_Flow > 1623.55 )
							if( MFI_Low <= 40.5277 )
								ret := -0.428571
							if( MFI_Low > 40.5277 )
								ret := 0.703704 // buy
				if( Negative_Money_Flow > 692.311 )
					if( Negative_Money_Flow_Sum <= 4.03817e+06 )
						if( Negative_Money_Flow_Sum <= 80557.2 )
							if( ema13 <= 3e-05 )
								ret := 0.004660
							if( ema13 > 3e-05 )
								ret := -0.099357
						if( Negative_Money_Flow_Sum > 80557.2 )
							if( Negative_Money_Flow <= 19747.6 )
								ret := 0.100435
							if( Negative_Money_Flow > 19747.6 )
								ret := 0.004893
					if( Negative_Money_Flow_Sum > 4.03817e+06 )
						if( ema2 <= 0.113255 )
							if( MFI_High <= -41.5844 )
								ret := -0.714286 // sell
							if( MFI_High > -41.5844 )
								ret := -0.857143 // sell
						if( ema2 > 0.113255 )
							ret := -1.000000 // sell
			if( ema2 > 0.1207 )
				if( Negative_Money_Flow <= 3442.58 )
					if( ema12 <= -1e-06 )
						if( ema2 <= 0.122725 )
							if( Typical_Price <= 0.12226 )
								ret := 0.243781
							if( Typical_Price > 0.12226 )
								ret := -0.138889
						if( ema2 > 0.122725 )
							if( Negative_Money_Flow_Sum <= 14678.6 )
								ret := 0.877551 // buy
							if( Negative_Money_Flow_Sum > 14678.6 )
								ret := 0.388375
					if( ema12 > -1e-06 )
						if( MFI_Low <= 62.2749 )
							if( Negative_Money_Flow_Sum <= 635118 )
								ret := 0.087912
							if( Negative_Money_Flow_Sum > 635118 )
								ret := 1.000000 // buy
						if( MFI_Low > 62.2749 )
							if( ema3 <= 0.122433 )
								ret := -0.135135
							if( ema3 > 0.122433 )
								ret := 0.455782
				if( Negative_Money_Flow > 3442.58 )
					if( ema13 <= 8.1e-05 )
						if( Negative_Money_Flow <= 56033.6 )
							if( ema13 <= -1.3e-05 )
								ret := 0.138394
							if( ema13 > -1.3e-05 )
								ret := 0.058452
						if( Negative_Money_Flow > 56033.6 )
							if( MFI_High <= -48.8525 )
								ret := -0.081900
							if( MFI_High > -48.8525 )
								ret := 0.110335
					if( ema13 > 8.1e-05 )
						if( tema <= 0.126022 )
							if( ema12 <= 3.3e-05 )
								ret := 0.658537
							if( ema12 > 3.3e-05 )
								ret := 0.250653
						if( tema > 0.126022 )
							ret := -0.666667
		if( Typical_Price > 0.126028 )
			if( Raw_Money_Flow <= 24969.9 )
				if( ema3 <= 0.138451 )
					if( Negative_Money_Flow_Sum <= 24473.6 )
						if( ema12 <= 2.6e-05 )
							if( Negative_Money_Flow_Sum <= 11283.7 )
								ret := 0.749406 // buy
							if( Negative_Money_Flow_Sum > 11283.7 )
								ret := 0.596705
						if( ema12 > 2.6e-05 )
							if( Raw_Money_Flow <= 1771.09 )
								ret := 0.682243
							if( Raw_Money_Flow > 1771.09 )
								ret := 0.329596
					if( Negative_Money_Flow_Sum > 24473.6 )
						if( Positive_Money_Flow_Sum <= 25098.3 )
							if( ema12 <= -2.4e-05 )
								ret := 0.533840
							if( ema12 > -2.4e-05 )
								ret := 0.365511
						if( Positive_Money_Flow_Sum > 25098.3 )
							if( ema12 <= 4.9e-05 )
								ret := 0.283464
							if( ema12 > 4.9e-05 )
								ret := -0.039295
				if( ema3 > 0.138451 )
					if( Positive_Money_Flow <= 80.918 )
						if( ema12 <= 4.9e-05 )
							if( tema <= 0.149519 )
								ret := 0.618732
							if( tema > 0.149519 )
								ret := 0.495904
						if( ema12 > 4.9e-05 )
							if( Raw_Money_Flow <= 6692.42 )
								ret := 0.313984
							if( Raw_Money_Flow > 6692.42 )
								ret := 0.085079
					if( Positive_Money_Flow > 80.918 )
						if( ema13 <= 8e-06 )
							if( tema <= 0.159687 )
								ret := 0.263328
							if( tema > 0.159687 )
								ret := -0.500000
						if( ema13 > 8e-06 )
							if( Typical_Price <= 0.154564 )
								ret := 0.011442
							if( Typical_Price > 0.154564 )
								ret := -0.356322
			if( Raw_Money_Flow > 24969.9 )
				if( Negative_Money_Flow_Sum <= 479622 )
					if( ema13 <= 1.6e-05 )
						if( Money_Flow_Ratio <= 0.876604 )
							if( ema1 <= 0.139007 )
								ret := 0.159660
							if( ema1 > 0.139007 )
								ret := 0.296680
						if( Money_Flow_Ratio > 0.876604 )
							if( Raw_Money_Flow <= 43746.7 )
								ret := 0.504717
							if( Raw_Money_Flow > 43746.7 )
								ret := 0.284006
					if( ema13 > 1.6e-05 )
						if( Negative_Money_Flow_Sum <= 240730 )
							if( ema12 <= 7.2e-05 )
								ret := 0.142561
							if( ema12 > 7.2e-05 )
								ret := -0.051495
						if( Negative_Money_Flow_Sum > 240730 )
							if( ema12 <= 0.000228 )
								ret := 0.266805
							if( ema12 > 0.000228 )
								ret := -0.892857 // sell
				if( Negative_Money_Flow_Sum > 479622 )
					if( ema12 <= -0.000376 )
						if( Typical_Price <= 0.165255 )
							if( Negative_Money_Flow_Sum <= 3.12472e+06 )
								ret := 0.444444
							if( Negative_Money_Flow_Sum > 3.12472e+06 )
								ret := 0.891304 // buy
						if( Typical_Price > 0.165255 )
							ret := -0.285714
					if( ema12 > -0.000376 )
						if( Negative_Money_Flow <= 61896.7 )
							if( Negative_Money_Flow_Sum <= 3.77619e+06 )
								ret := 0.199866
							if( Negative_Money_Flow_Sum > 3.77619e+06 )
								ret := -0.457831
						if( Negative_Money_Flow > 61896.7 )
							if( Money_Flow_Ratio <= 1.30562 )
								ret := 0.002224
							if( Money_Flow_Ratio > 1.30562 )
								ret := 0.176215
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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


//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_TRXUSDT_1Min_92ec6292(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, ema1, tema, ema12, ema2, ema3, ema13)

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


