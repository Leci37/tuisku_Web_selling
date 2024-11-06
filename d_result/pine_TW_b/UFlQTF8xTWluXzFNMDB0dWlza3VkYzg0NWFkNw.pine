//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index
// ID_model: PYPL_1Min_1M00_dc845ad7 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PYPL_1Min_1M00_dc845ad7", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PYPL_1Min_dc845ad7(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7,max_features=sqrt, min_samples_leaf=4,random_state=843828734)
	if( Negative_Money_Flow <= 67.5702 )
		if( Raw_Money_Flow <= 71848.1 )
			if( Positive_Money_Flow_Sum <= 144661 )
				if( Money_Flow_Ratio <= 0.682788 )
					if( MFI_Low <= 19.5725 )
						if( Negative_Money_Flow_Sum <= 416815 )
							if( MFI <= 32.9156 )
								ret := 0.125858
							if( MFI > 32.9156 )
								ret := -0.086486
						if( Negative_Money_Flow_Sum > 416815 )
							if( Positive_Money_Flow <= 26.5007 )
								ret := 0.046512
							if( Positive_Money_Flow > 26.5007 )
								ret := -0.372671
					if( MFI_Low > 19.5725 )
						if( Positive_Money_Flow <= 3915.41 )
							if( MFI_Low <= 19.8408 )
								ret := -1.000000 // sell
							if( MFI_Low > 19.8408 )
								ret := -0.700000 // sell
						if( Positive_Money_Flow > 3915.41 )
							if( Raw_Money_Flow <= 35548.2 )
								ret := 0.375000
							if( Raw_Money_Flow > 35548.2 )
								ret := -0.846154 // sell
				if( Money_Flow_Ratio > 0.682788 )
					if( Positive_Money_Flow_Sum <= 122471 )
						if( MFI <= 54.7191 )
							if( MFI_Low <= 21.1607 )
								ret := 0.909091 // buy
							if( MFI_Low > 21.1607 )
								ret := -0.132867
						if( MFI > 54.7191 )
							if( Typical_Price <= 64.1509 )
								ret := 0.000000
							if( Typical_Price > 64.1509 )
								ret := 0.653061
					if( Positive_Money_Flow_Sum > 122471 )
						if( Raw_Money_Flow <= 9777.01 )
							if( MFI_Low <= 22.4117 )
								ret := -1.000000 // sell
							if( MFI_Low > 22.4117 )
								ret := 0.550000
						if( Raw_Money_Flow > 9777.01 )
							if( Positive_Money_Flow <= 811.156 )
								ret := 0.250000
							if( Positive_Money_Flow > 811.156 )
								ret := 0.694444
			if( Positive_Money_Flow_Sum > 144661 )
				if( MFI_High <= -26.5757 )
					if( Positive_Money_Flow <= 772.381 )
						if( MFI_High <= -45.8896 )
							if( MFI_High <= -68.528 )
								ret := 0.054054
							if( MFI_High > -68.528 )
								ret := -0.180000
						if( MFI_High > -45.8896 )
							if( Negative_Money_Flow_Sum <= 331432 )
								ret := 0.477124
							if( Negative_Money_Flow_Sum > 331432 )
								ret := -0.010989
					if( Positive_Money_Flow > 772.381 )
						if( MFI_Low <= -7.92228 )
							if( Negative_Money_Flow_Sum <= 7.04397e+07 )
								ret := -0.634328
							if( Negative_Money_Flow_Sum > 7.04397e+07 )
								ret := -0.096774
						if( MFI_Low > -7.92228 )
							if( Negative_Money_Flow_Sum <= 516684 )
								ret := -0.237213
							if( Negative_Money_Flow_Sum > 516684 )
								ret := -0.039291
				if( MFI_High > -26.5757 )
					if( Positive_Money_Flow <= 383.94 )
						if( Raw_Money_Flow <= 60941.4 )
							if( Negative_Money_Flow_Sum <= 455947 )
								ret := -0.059829
							if( Negative_Money_Flow_Sum > 455947 )
								ret := 0.247706
						if( Raw_Money_Flow > 60941.4 )
							if( Positive_Money_Flow_Sum <= 309777 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 309777 )
								ret := -0.181818
					if( Positive_Money_Flow > 383.94 )
						if( Positive_Money_Flow_Sum <= 1.24885e+08 )
							if( Raw_Money_Flow <= 7500.55 )
								ret := -0.020000
							if( Raw_Money_Flow > 7500.55 )
								ret := -0.278792
						if( Positive_Money_Flow_Sum > 1.24885e+08 )
							if( Negative_Money_Flow_Sum <= 2.59657e+07 )
								ret := 0.181818
							if( Negative_Money_Flow_Sum > 2.59657e+07 )
								ret := 0.733333 // buy
		if( Raw_Money_Flow > 71848.1 )
			if( Negative_Money_Flow_Sum <= 3.43144e+07 )
				if( Positive_Money_Flow <= 6.03556e+07 )
					if( Negative_Money_Flow_Sum <= 3.23181e+07 )
						if( MFI_Low <= 21.7604 )
							if( MFI <= 38.1714 )
								ret := -0.015969
							if( MFI > 38.1714 )
								ret := 0.125121
						if( MFI_Low > 21.7604 )
							if( Negative_Money_Flow_Sum <= 6.12685e+06 )
								ret := -0.084080
							if( Negative_Money_Flow_Sum > 6.12685e+06 )
								ret := -0.023352
					if( Negative_Money_Flow_Sum > 3.23181e+07 )
						if( MFI_High <= -50.5051 )
							if( MFI_High <= -58.6176 )
								ret := 0.604167
							if( MFI_High > -58.6176 )
								ret := 0.905660 // buy
						if( MFI_High > -50.5051 )
							if( Negative_Money_Flow_Sum <= 3.28923e+07 )
								ret := 0.523810
							if( Negative_Money_Flow_Sum > 3.28923e+07 )
								ret := 0.035088
				if( Positive_Money_Flow > 6.03556e+07 )
					if( Positive_Money_Flow_Sum <= 1.47023e+08 )
						if( Money_Flow_Ratio <= 33.8545 )
							if( Money_Flow_Ratio <= 4.06355 )
								ret := -0.777778 // sell
							if( Money_Flow_Ratio > 4.06355 )
								ret := -0.967213 // sell
						if( Money_Flow_Ratio > 33.8545 )
							ret := -0.714286 // sell
					if( Positive_Money_Flow_Sum > 1.47023e+08 )
						ret := 0.000000
			if( Negative_Money_Flow_Sum > 3.43144e+07 )
				if( MFI_High <= -58.8962 )
					if( MFI_Low <= -9.24887 )
						if( Typical_Price <= 61.8212 )
							if( Raw_Money_Flow <= 1.11975e+06 )
								ret := -0.200000
							if( Raw_Money_Flow > 1.11975e+06 )
								ret := 0.400000
						if( Typical_Price > 61.8212 )
							if( MFI <= 5.55104 )
								ret := -0.242424
							if( MFI > 5.55104 )
								ret := -0.794118 // sell
					if( MFI_Low > -9.24887 )
						if( Typical_Price <= 61.9042 )
							if( Typical_Price <= 57.5541 )
								ret := 1.000000 // buy
							if( Typical_Price > 57.5541 )
								ret := -0.571429
						if( Typical_Price > 61.9042 )
							if( Negative_Money_Flow_Sum <= 9.45007e+07 )
								ret := 0.612245
							if( Negative_Money_Flow_Sum > 9.45007e+07 )
								ret := -0.116883
				if( MFI_High > -58.8962 )
					if( MFI_High <= -34.9768 )
						if( Typical_Price <= 65.8586 )
							if( Positive_Money_Flow_Sum <= 2.05879e+07 )
								ret := -0.392857
							if( Positive_Money_Flow_Sum > 2.05879e+07 )
								ret := 0.059172
						if( Typical_Price > 65.8586 )
							if( MFI_High <= -49.2025 )
								ret := -0.408805
							if( MFI_High > -49.2025 )
								ret := -0.677536
					if( MFI_High > -34.9768 )
						if( Money_Flow_Ratio <= 1.90244 )
							if( MFI <= 55.4936 )
								ret := 0.120968
							if( MFI > 55.4936 )
								ret := 0.670886
						if( Money_Flow_Ratio > 1.90244 )
							if( MFI_Low <= 57.4262 )
								ret := -0.606838
							if( MFI_Low > 57.4262 )
								ret := 0.210526
	if( Negative_Money_Flow > 67.5702 )
		if( Positive_Money_Flow_Sum <= 1.07978e+06 )
			if( MFI <= 70.5748 )
				if( Money_Flow_Ratio <= 0.104782 )
					if( Typical_Price <= 64.4599 )
						if( Positive_Money_Flow_Sum <= 305873 )
							if( Negative_Money_Flow_Sum <= 1.40365e+06 )
								ret := -0.421053
							if( Negative_Money_Flow_Sum > 1.40365e+06 )
								ret := 0.606870
						if( Positive_Money_Flow_Sum > 305873 )
							if( Raw_Money_Flow <= 3.76593e+06 )
								ret := -0.330000
							if( Raw_Money_Flow > 3.76593e+06 )
								ret := 0.213483
					if( Typical_Price > 64.4599 )
						if( Negative_Money_Flow_Sum <= 1.54666e+06 )
							if( Positive_Money_Flow <= 611.92 )
								ret := -0.424242
							if( Positive_Money_Flow > 611.92 )
								ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 1.54666e+06 )
							if( Negative_Money_Flow_Sum <= 1.80917e+07 )
								ret := 0.136929
							if( Negative_Money_Flow_Sum > 1.80917e+07 )
								ret := -0.285714
				if( Money_Flow_Ratio > 0.104782 )
					if( MFI_Low <= -1.52506 )
						if( MFI_High <= -67.826 )
							if( Negative_Money_Flow_Sum <= 415249 )
								ret := 0.891892 // buy
							if( Negative_Money_Flow_Sum > 415249 )
								ret := 0.071856
						if( MFI_High > -67.826 )
							if( Raw_Money_Flow <= 129331 )
								ret := 0.547046
							if( Raw_Money_Flow > 129331 )
								ret := 0.178218
					if( MFI_Low > -1.52506 )
						if( Negative_Money_Flow_Sum <= 116766 )
							if( Raw_Money_Flow <= 7933.95 )
								ret := -0.288136
							if( Raw_Money_Flow > 7933.95 )
								ret := 0.671642
						if( Negative_Money_Flow_Sum > 116766 )
							if( Raw_Money_Flow <= 43389.9 )
								ret := 0.254507
							if( Raw_Money_Flow > 43389.9 )
								ret := 0.145870
			if( MFI > 70.5748 )
				if( Typical_Price <= 61.0872 )
					if( Money_Flow_Ratio <= 5.25411 )
						if( MFI_Low <= 57.5313 )
							if( Negative_Money_Flow_Sum <= 146616 )
								ret := 0.142857
							if( Negative_Money_Flow_Sum > 146616 )
								ret := -0.351351
						if( MFI_Low > 57.5313 )
							if( MFI <= 78.7447 )
								ret := 0.888889 // buy
							if( MFI > 78.7447 )
								ret := -0.102564
					if( Money_Flow_Ratio > 5.25411 )
						if( Raw_Money_Flow <= 10200.9 )
							ret := -1.000000 // sell
						if( Raw_Money_Flow > 10200.9 )
							if( Positive_Money_Flow_Sum <= 479009 )
								ret := -0.200000
							if( Positive_Money_Flow_Sum > 479009 )
								ret := -0.583333
				if( Typical_Price > 61.0872 )
					if( Raw_Money_Flow <= 40689.7 )
						if( MFI_Low <= 51.4114 )
							if( Typical_Price <= 69.75 )
								ret := -0.842105 // sell
							if( Typical_Price > 69.75 )
								ret := 0.333333
						if( MFI_Low > 51.4114 )
							if( Negative_Money_Flow_Sum <= 254333 )
								ret := 0.183607
							if( Negative_Money_Flow_Sum > 254333 )
								ret := -0.510204
					if( Raw_Money_Flow > 40689.7 )
						if( Positive_Money_Flow_Sum <= 553908 )
							if( Negative_Money_Flow_Sum <= 153611 )
								ret := -0.384615
							if( Negative_Money_Flow_Sum > 153611 )
								ret := 0.727273 // buy
						if( Positive_Money_Flow_Sum > 553908 )
							if( Positive_Money_Flow_Sum <= 967958 )
								ret := 0.445545
							if( Positive_Money_Flow_Sum > 967958 )
								ret := 0.864865 // buy
		if( Positive_Money_Flow_Sum > 1.07978e+06 )
			if( Negative_Money_Flow_Sum <= 910717 )
				if( MFI <= 96.8521 )
					if( Negative_Money_Flow_Sum <= 703681 )
						if( Typical_Price <= 67.6571 )
							if( MFI <= 71.3982 )
								ret := -0.341176
							if( MFI > 71.3982 )
								ret := 0.116910
						if( Typical_Price > 67.6571 )
							if( Money_Flow_Ratio <= 2.41214 )
								ret := -0.800000 // sell
							if( Money_Flow_Ratio > 2.41214 )
								ret := 0.473498
					if( Negative_Money_Flow_Sum > 703681 )
						if( Positive_Money_Flow <= 195.739 )
							if( Positive_Money_Flow_Sum <= 1.38368e+07 )
								ret := 0.301205
							if( Positive_Money_Flow_Sum > 1.38368e+07 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow > 195.739 )
							if( Negative_Money_Flow_Sum <= 856436 )
								ret := 0.931034 // buy
							if( Negative_Money_Flow_Sum > 856436 )
								ret := -0.200000
				if( MFI > 96.8521 )
					if( Money_Flow_Ratio <= 351.44 )
						if( Negative_Money_Flow_Sum <= 80409.2 )
							if( Raw_Money_Flow <= 20226.3 )
								ret := -0.200000
							if( Raw_Money_Flow > 20226.3 )
								ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 80409.2 )
							if( MFI <= 99.6708 )
								ret := 0.724832 // buy
							if( MFI > 99.6708 )
								ret := 1.000000 // buy
					if( Money_Flow_Ratio > 351.44 )
						if( MFI <= 99.7954 )
							ret := -0.200000
						if( MFI > 99.7954 )
							ret := 0.000000
			if( Negative_Money_Flow_Sum > 910717 )
				if( Positive_Money_Flow_Sum <= 3.45236e+07 )
					if( Money_Flow_Ratio <= 1.82944 )
						if( Negative_Money_Flow <= 906459 )
							if( Positive_Money_Flow_Sum <= 1.19619e+07 )
								ret := -0.041232
							if( Positive_Money_Flow_Sum > 1.19619e+07 )
								ret := 0.194508
						if( Negative_Money_Flow > 906459 )
							if( Raw_Money_Flow <= 5.94103e+07 )
								ret := 0.044851
							if( Raw_Money_Flow > 5.94103e+07 )
								ret := 0.800000 // buy
					if( Money_Flow_Ratio > 1.82944 )
						if( Negative_Money_Flow <= 4.29126e+06 )
							if( MFI_High <= 6.31321 )
								ret := -0.069277
							if( MFI_High > 6.31321 )
								ret := -0.362007
						if( Negative_Money_Flow > 4.29126e+06 )
							if( Negative_Money_Flow <= 5.67303e+06 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow > 5.67303e+06 )
								ret := -0.629630
				if( Positive_Money_Flow_Sum > 3.45236e+07 )
					if( Raw_Money_Flow <= 1.55351e+07 )
						if( MFI <= 32.6062 )
							if( Raw_Money_Flow <= 19351.5 )
								ret := -0.294118
							if( Raw_Money_Flow > 19351.5 )
								ret := 0.766423 // buy
						if( MFI > 32.6062 )
							if( Money_Flow_Ratio <= 3.62297 )
								ret := 0.039062
							if( Money_Flow_Ratio > 3.62297 )
								ret := 0.289199
					if( Raw_Money_Flow > 1.55351e+07 )
						if( Typical_Price <= 68.831 )
							if( Negative_Money_Flow <= 1.79331e+07 )
								ret := -0.270270
							if( Negative_Money_Flow > 1.79331e+07 )
								ret := 0.460000
						if( Typical_Price > 68.831 )
							if( Negative_Money_Flow_Sum <= 1.20701e+08 )
								ret := -0.805556 // sell
							if( Negative_Money_Flow_Sum > 1.20701e+08 )
								ret := -0.214286
	
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
float op_operation = decision_tree_0_PYPL_1Min_dc845ad7(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


