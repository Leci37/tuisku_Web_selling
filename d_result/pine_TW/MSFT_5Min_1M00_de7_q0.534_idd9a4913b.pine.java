//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index
// ID_model: MSFT_5Min_1M00_d9a4913b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_5Min_1M00_d9a4913b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_5Min_d9a4913b(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7,max_features=sqrt, min_samples_leaf=4,random_state=843828734)
	if( Negative_Money_Flow <= 1564.27 )
		if( MFI_High <= -25.1903 )
			if( Positive_Money_Flow_Sum <= 2.02563e+06 )
				if( Positive_Money_Flow <= 108364 )
					if( MFI_Low <= -4.51735 )
						if( Negative_Money_Flow_Sum <= 3.42306e+06 )
							ret := 0.666667
						if( Negative_Money_Flow_Sum > 3.42306e+06 )
							if( MFI <= 13.6515 )
								ret := 0.232558
							if( MFI > 13.6515 )
								ret := -0.076923
					if( MFI_Low > -4.51735 )
						if( Positive_Money_Flow <= 92630.5 )
							if( Negative_Money_Flow_Sum <= 2.83252e+06 )
								ret := 0.012270
							if( Negative_Money_Flow_Sum > 2.83252e+06 )
								ret := -0.265306
						if( Positive_Money_Flow > 92630.5 )
							if( MFI_Low <= 12.6181 )
								ret := -0.636364
							if( MFI_Low > 12.6181 )
								ret := -0.214286
				if( Positive_Money_Flow > 108364 )
					if( MFI_Low <= 31.1078 )
						if( Positive_Money_Flow <= 1.17193e+06 )
							if( Positive_Money_Flow <= 264176 )
								ret := 0.243433
							if( Positive_Money_Flow > 264176 )
								ret := 0.082734
						if( Positive_Money_Flow > 1.17193e+06 )
							if( Raw_Money_Flow <= 1.30907e+06 )
								ret := -1.000000 // sell
							if( Raw_Money_Flow > 1.30907e+06 )
								ret := -0.625000
					if( MFI_Low > 31.1078 )
						if( MFI_High <= -25.7205 )
							if( Positive_Money_Flow_Sum <= 1.72775e+06 )
								ret := 0.925926 // buy
							if( Positive_Money_Flow_Sum > 1.72775e+06 )
								ret := 0.500000
						if( MFI_High > -25.7205 )
							ret := 0.000000
			if( Positive_Money_Flow_Sum > 2.02563e+06 )
				if( Typical_Price <= 413.648 )
					if( Negative_Money_Flow_Sum <= 3.67423e+06 )
						if( Money_Flow_Ratio <= 0.722779 )
							if( Negative_Money_Flow_Sum <= 3.49863e+06 )
								ret := -0.282609
							if( Negative_Money_Flow_Sum > 3.49863e+06 )
								ret := -0.933333 // sell
						if( Money_Flow_Ratio > 0.722779 )
							if( Positive_Money_Flow <= 631899 )
								ret := -0.029046
							if( Positive_Money_Flow > 631899 )
								ret := -0.315436
					if( Negative_Money_Flow_Sum > 3.67423e+06 )
						if( Positive_Money_Flow_Sum <= 8.53967e+08 )
							if( Positive_Money_Flow <= 1.73262e+08 )
								ret := 0.037894
							if( Positive_Money_Flow > 1.73262e+08 )
								ret := -0.206406
						if( Positive_Money_Flow_Sum > 8.53967e+08 )
							if( Positive_Money_Flow_Sum <= 1.33595e+09 )
								ret := -0.193980
							if( Positive_Money_Flow_Sum > 1.33595e+09 )
								ret := 0.341667
				if( Typical_Price > 413.648 )
					if( Negative_Money_Flow_Sum <= 5.77168e+08 )
						if( MFI <= 46.1865 )
							if( Negative_Money_Flow_Sum <= 5.61228e+08 )
								ret := 0.014549
							if( Negative_Money_Flow_Sum > 5.61228e+08 )
								ret := 0.806452 // buy
						if( MFI > 46.1865 )
							if( Positive_Money_Flow_Sum <= 2.58994e+08 )
								ret := -0.252226
							if( Positive_Money_Flow_Sum > 2.58994e+08 )
								ret := -0.015066
					if( Negative_Money_Flow_Sum > 5.77168e+08 )
						if( MFI_High <= -55.7129 )
							if( MFI <= 23.5428 )
								ret := -0.135338
							if( MFI > 23.5428 )
								ret := 0.272727
						if( MFI_High > -55.7129 )
							if( Raw_Money_Flow <= 3.49747e+07 )
								ret := -0.039604
							if( Raw_Money_Flow > 3.49747e+07 )
								ret := -0.399713
		if( MFI_High > -25.1903 )
			if( Positive_Money_Flow_Sum <= 2.83359e+08 )
				if( Negative_Money_Flow_Sum <= 8.75139e+06 )
					if( Positive_Money_Flow <= 5.10536e+06 )
						if( MFI <= 86.0811 )
							if( Money_Flow_Ratio <= 2.7523 )
								ret := -0.038733
							if( Money_Flow_Ratio > 2.7523 )
								ret := -0.151120
						if( MFI > 86.0811 )
							if( MFI_High <= 10.0203 )
								ret := 0.250836
							if( MFI_High > 10.0203 )
								ret := -0.030120
					if( Positive_Money_Flow > 5.10536e+06 )
						if( Typical_Price <= 407.184 )
							if( Positive_Money_Flow_Sum <= 1.03912e+07 )
								ret := -0.763158 // sell
							if( Positive_Money_Flow_Sum > 1.03912e+07 )
								ret := -0.052941
						if( Typical_Price > 407.184 )
							if( MFI <= 96.4495 )
								ret := -0.793103 // sell
							if( MFI > 96.4495 )
								ret := 0.500000
				if( Negative_Money_Flow_Sum > 8.75139e+06 )
					if( Typical_Price <= 296.033 )
						if( Money_Flow_Ratio <= 1.45558 )
							ret := 0.666667
						if( Money_Flow_Ratio > 1.45558 )
							ret := 1.000000 // buy
					if( Typical_Price > 296.033 )
						if( Money_Flow_Ratio <= 1.84855 )
							if( Typical_Price <= 416.35 )
								ret := -0.051462
							if( Typical_Price > 416.35 )
								ret := -0.369863
						if( Money_Flow_Ratio > 1.84855 )
							if( Raw_Money_Flow <= 1.48668e+06 )
								ret := -0.045685
							if( Raw_Money_Flow > 1.48668e+06 )
								ret := -0.349585
			if( Positive_Money_Flow_Sum > 2.83359e+08 )
				if( Negative_Money_Flow_Sum <= 3.98122e+08 )
					if( Positive_Money_Flow_Sum <= 2.96478e+08 )
						if( Negative_Money_Flow_Sum <= 2.2852e+08 )
							if( MFI_High <= -11.2321 )
								ret := -0.051020
							if( MFI_High > -11.2321 )
								ret := 0.584906
						if( Negative_Money_Flow_Sum > 2.2852e+08 )
							if( Money_Flow_Ratio <= 1.23205 )
								ret := 0.000000
							if( Money_Flow_Ratio > 1.23205 )
								ret := 0.948718 // buy
					if( Positive_Money_Flow_Sum > 2.96478e+08 )
						if( Money_Flow_Ratio <= 2.98563 )
							if( Positive_Money_Flow_Sum <= 8.76153e+08 )
								ret := 0.024104
							if( Positive_Money_Flow_Sum > 8.76153e+08 )
								ret := 0.509009
						if( Money_Flow_Ratio > 2.98563 )
							if( Typical_Price <= 302.412 )
								ret := 0.538462
							if( Typical_Price > 302.412 )
								ret := -0.060826
				if( Negative_Money_Flow_Sum > 3.98122e+08 )
					if( Positive_Money_Flow_Sum <= 5.56051e+08 )
						if( MFI_Low <= 37.3493 )
							if( Raw_Money_Flow <= 1.00467e+08 )
								ret := -0.663866
							if( Raw_Money_Flow > 1.00467e+08 )
								ret := 0.700000 // buy
						if( MFI_Low > 37.3493 )
							ret := 0.833333 // buy
					if( Positive_Money_Flow_Sum > 5.56051e+08 )
						if( Raw_Money_Flow <= 1.62887e+09 )
							if( Positive_Money_Flow <= 1.61601e+08 )
								ret := -0.070772
							if( Positive_Money_Flow > 1.61601e+08 )
								ret := -0.237705
						if( Raw_Money_Flow > 1.62887e+09 )
							if( MFI_Low <= 44.638 )
								ret := 1.000000 // buy
							if( MFI_Low > 44.638 )
								ret := 0.311688
	if( Negative_Money_Flow > 1564.27 )
		if( MFI_High <= -56.2672 )
			if( Negative_Money_Flow_Sum <= 3.55762e+07 )
				if( Positive_Money_Flow_Sum <= 1.53201e+06 )
					if( Raw_Money_Flow <= 1.24551e+06 )
						if( Negative_Money_Flow_Sum <= 2.77475e+06 )
							if( Negative_Money_Flow <= 26039.8 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow > 26039.8 )
								ret := -0.522523
						if( Negative_Money_Flow_Sum > 2.77475e+06 )
							if( MFI_High <= -66.8816 )
								ret := 0.603376
							if( MFI_High > -66.8816 )
								ret := 0.271805
					if( Raw_Money_Flow > 1.24551e+06 )
						if( MFI <= 10.9627 )
							if( Typical_Price <= 386.086 )
								ret := -0.173077
							if( Typical_Price > 386.086 )
								ret := 0.677419
						if( MFI > 10.9627 )
							if( Positive_Money_Flow_Sum <= 911945 )
								ret := 0.571429
							if( Positive_Money_Flow_Sum > 911945 )
								ret := -0.470588
				if( Positive_Money_Flow_Sum > 1.53201e+06 )
					if( Money_Flow_Ratio <= 0.262295 )
						if( Negative_Money_Flow_Sum <= 8.45325e+06 )
							if( Positive_Money_Flow_Sum <= 1.59976e+06 )
								ret := 0.842105 // buy
							if( Positive_Money_Flow_Sum > 1.59976e+06 )
								ret := -0.173077
						if( Negative_Money_Flow_Sum > 8.45325e+06 )
							if( Negative_Money_Flow_Sum <= 2.23593e+07 )
								ret := 0.606947
							if( Negative_Money_Flow_Sum > 2.23593e+07 )
								ret := 0.302326
					if( Money_Flow_Ratio > 0.262295 )
						if( Negative_Money_Flow <= 932015 )
							if( Typical_Price <= 411.974 )
								ret := 0.588889
							if( Typical_Price > 411.974 )
								ret := 0.068182
						if( Negative_Money_Flow > 932015 )
							if( Negative_Money_Flow_Sum <= 2.53531e+07 )
								ret := -0.056180
							if( Negative_Money_Flow_Sum > 2.53531e+07 )
								ret := 0.377778
			if( Negative_Money_Flow_Sum > 3.55762e+07 )
				if( Positive_Money_Flow <= 7.50522e+07 )
					if( Negative_Money_Flow_Sum <= 6.31537e+08 )
						if( Negative_Money_Flow_Sum <= 3.43165e+08 )
							if( Raw_Money_Flow <= 1.07922e+07 )
								ret := 0.092375
							if( Raw_Money_Flow > 1.07922e+07 )
								ret := -0.113402
						if( Negative_Money_Flow_Sum > 3.43165e+08 )
							if( Money_Flow_Ratio <= 0.038625 )
								ret := 0.110512
							if( Money_Flow_Ratio > 0.038625 )
								ret := 0.320158
					if( Negative_Money_Flow_Sum > 6.31537e+08 )
						if( Negative_Money_Flow <= 2.5957e+07 )
							if( Raw_Money_Flow <= 1.44733e+07 )
								ret := -0.028571
							if( Raw_Money_Flow > 1.44733e+07 )
								ret := -0.584416
						if( Negative_Money_Flow > 2.5957e+07 )
							if( Raw_Money_Flow <= 4.42203e+07 )
								ret := 0.416149
							if( Raw_Money_Flow > 4.42203e+07 )
								ret := 0.036693
				if( Positive_Money_Flow > 7.50522e+07 )
					if( MFI <= 15.4061 )
						ret := 1.000000 // buy
					if( MFI > 15.4061 )
						ret := 0.666667
		if( MFI_High > -56.2672 )
			if( MFI_High <= -38.009 )
				if( Negative_Money_Flow_Sum <= 2.34813e+09 )
					if( Money_Flow_Ratio <= 0.661037 )
						if( Negative_Money_Flow <= 1.59193e+08 )
							if( Positive_Money_Flow_Sum <= 8.04336e+08 )
								ret := 0.034524
							if( Positive_Money_Flow_Sum > 8.04336e+08 )
								ret := 0.354286
						if( Negative_Money_Flow > 1.59193e+08 )
							if( Positive_Money_Flow_Sum <= 4.18215e+08 )
								ret := 0.137056
							if( Positive_Money_Flow_Sum > 4.18215e+08 )
								ret := -0.369973
					if( Money_Flow_Ratio > 0.661037 )
						if( Typical_Price <= 416.345 )
							if( Positive_Money_Flow <= 1.49981e+06 )
								ret := 0.189720
							if( Positive_Money_Flow > 1.49981e+06 )
								ret := 1.000000 // buy
						if( Typical_Price > 416.345 )
							if( MFI_Low <= 20.0143 )
								ret := 0.468750
							if( MFI_Low > 20.0143 )
								ret := -0.131805
				if( Negative_Money_Flow_Sum > 2.34813e+09 )
					if( Raw_Money_Flow <= 3.03298e+08 )
						if( MFI_Low <= 6.50078 )
							if( Negative_Money_Flow_Sum <= 3.46688e+09 )
								ret := -0.823529 // sell
							if( Negative_Money_Flow_Sum > 3.46688e+09 )
								ret := 0.375000
						if( MFI_Low > 6.50078 )
							if( Raw_Money_Flow <= 1.49997e+08 )
								ret := -0.493827
							if( Raw_Money_Flow > 1.49997e+08 )
								ret := -0.946429 // sell
					if( Raw_Money_Flow > 3.03298e+08 )
						if( Money_Flow_Ratio <= 0.380243 )
							if( Raw_Money_Flow <= 1.41101e+09 )
								ret := 1.000000 // buy
							if( Raw_Money_Flow > 1.41101e+09 )
								ret := 0.625000
						if( Money_Flow_Ratio > 0.380243 )
							if( Negative_Money_Flow <= 1.21105e+09 )
								ret := -0.375000
							if( Negative_Money_Flow > 1.21105e+09 )
								ret := 0.250000
			if( MFI_High > -38.009 )
				if( Money_Flow_Ratio <= 2.11702 )
					if( Positive_Money_Flow_Sum <= 1.25636e+06 )
						if( Positive_Money_Flow_Sum <= 806098 )
							ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 806098 )
							if( Typical_Price <= 327.976 )
								ret := 0.878788 // buy
							if( Typical_Price > 327.976 )
								ret := 0.512821
					if( Positive_Money_Flow_Sum > 1.25636e+06 )
						if( Raw_Money_Flow <= 2.6121e+08 )
							if( Typical_Price <= 370.667 )
								ret := 0.010619
							if( Typical_Price > 370.667 )
								ret := -0.069889
						if( Raw_Money_Flow > 2.6121e+08 )
							if( Money_Flow_Ratio <= 0.914332 )
								ret := -0.773585 // sell
							if( Money_Flow_Ratio > 0.914332 )
								ret := -0.461538
				if( Money_Flow_Ratio > 2.11702 )
					if( Raw_Money_Flow <= 1.20111e+08 )
						if( MFI <= 83.9457 )
							if( Raw_Money_Flow <= 6.64257e+07 )
								ret := 0.123133
							if( Raw_Money_Flow > 6.64257e+07 )
								ret := -0.042763
						if( MFI > 83.9457 )
							if( Positive_Money_Flow_Sum <= 5.32086e+06 )
								ret := -0.523810
							if( Positive_Money_Flow_Sum > 5.32086e+06 )
								ret := -0.007829
					if( Raw_Money_Flow > 1.20111e+08 )
						if( Typical_Price <= 359.733 )
							if( MFI_High <= 2.37768 )
								ret := -0.652850
							if( MFI_High > 2.37768 )
								ret := 0.485714
						if( Typical_Price > 359.733 )
							if( MFI_High <= 13.5811 )
								ret := 0.034722
							if( MFI_High > 13.5811 )
								ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_MSFT_5Min_d9a4913b(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


