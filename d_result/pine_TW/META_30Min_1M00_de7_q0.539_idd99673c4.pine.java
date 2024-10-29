//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index
// ID_model: META_30Min_1M00_d99673c4 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_META_30Min_1M00_d99673c4", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_META_30Min_d99673c4(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7,max_features=sqrt, min_samples_leaf=4,random_state=843828734)
	if( Negative_Money_Flow <= 1.58836e+08 )
		if( Negative_Money_Flow_Sum <= 4.87269e+09 )
			if( Money_Flow_Ratio <= 2.28028 )
				if( Negative_Money_Flow <= 43.2893 )
					if( MFI_Low <= 36.3807 )
						if( Positive_Money_Flow_Sum <= 3.1793e+09 )
							if( MFI <= 55.2329 )
								ret := -0.013297
							if( MFI > 55.2329 )
								ret := 0.161235
						if( Positive_Money_Flow_Sum > 3.1793e+09 )
							if( MFI_Low <= 29.9082 )
								ret := 0.681319
							if( MFI_Low > 29.9082 )
								ret := 0.157407
					if( MFI_Low > 36.3807 )
						if( Typical_Price <= 419.811 )
							if( Raw_Money_Flow <= 8.21729e+07 )
								ret := -0.130690
							if( Raw_Money_Flow > 8.21729e+07 )
								ret := -0.013476
						if( Typical_Price > 419.811 )
							if( Positive_Money_Flow_Sum <= 4.28865e+07 )
								ret := -0.148649
							if( Positive_Money_Flow_Sum > 4.28865e+07 )
								ret := 0.209052
				if( Negative_Money_Flow > 43.2893 )
					if( MFI_High <= -38.3935 )
						if( MFI_Low <= 19.855 )
							if( MFI_High <= -41.2836 )
								ret := 0.058242
							if( MFI_High > -41.2836 )
								ret := -0.099624
						if( MFI_Low > 19.855 )
							if( Negative_Money_Flow <= 6.37485e+07 )
								ret := 0.250712
							if( Negative_Money_Flow > 6.37485e+07 )
								ret := -0.274648
					if( MFI_High > -38.3935 )
						if( Negative_Money_Flow <= 885283 )
							if( Negative_Money_Flow_Sum <= 2.96336e+09 )
								ret := -0.052752
							if( Negative_Money_Flow_Sum > 2.96336e+09 )
								ret := 0.814815 // buy
						if( Negative_Money_Flow > 885283 )
							if( Negative_Money_Flow <= 5.44903e+06 )
								ret := 0.111293
							if( Negative_Money_Flow > 5.44903e+06 )
								ret := -0.030615
			if( Money_Flow_Ratio > 2.28028 )
				if( Raw_Money_Flow <= 1.42362e+09 )
					if( Negative_Money_Flow_Sum <= 2.46994e+09 )
						if( MFI_High <= -10.3858 )
							if( MFI <= 69.3516 )
								ret := 0.125000
							if( MFI > 69.3516 )
								ret := 0.612903
						if( MFI_High > -10.3858 )
							if( Negative_Money_Flow_Sum <= 1.49453e+09 )
								ret := 0.053726
							if( Negative_Money_Flow_Sum > 1.49453e+09 )
								ret := -0.228833
					if( Negative_Money_Flow_Sum > 2.46994e+09 )
						if( Negative_Money_Flow_Sum <= 3.55841e+09 )
							if( Negative_Money_Flow <= 5.16295e+07 )
								ret := 0.621212
							if( Negative_Money_Flow > 5.16295e+07 )
								ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 3.55841e+09 )
							if( Typical_Price <= 304.623 )
								ret := -0.400000
							if( Typical_Price > 304.623 )
								ret := -1.000000 // sell
				if( Raw_Money_Flow > 1.42362e+09 )
					if( Raw_Money_Flow <= 1.67639e+09 )
						if( Money_Flow_Ratio <= 4.61717 )
							if( Money_Flow_Ratio <= 3.8168 )
								ret := 0.900000 // buy
							if( Money_Flow_Ratio > 3.8168 )
								ret := 0.500000
						if( Money_Flow_Ratio > 4.61717 )
							if( Money_Flow_Ratio <= 63.3872 )
								ret := -0.703704 // sell
							if( Money_Flow_Ratio > 63.3872 )
								ret := 0.272727
					if( Raw_Money_Flow > 1.67639e+09 )
						if( Positive_Money_Flow <= 1.68738e+09 )
							ret := 0.454545
						if( Positive_Money_Flow > 1.68738e+09 )
							if( MFI <= 79.9377 )
								ret := 0.571429
							if( MFI > 79.9377 )
								ret := -0.233766
		if( Negative_Money_Flow_Sum > 4.87269e+09 )
			if( Positive_Money_Flow <= 1.05945e+08 )
				if( MFI_High <= -79.2011 )
					if( Positive_Money_Flow <= 101030 )
						if( Raw_Money_Flow <= 5.05834e+06 )
							if( Money_Flow_Ratio <= 0.003118 )
								ret := 0.750000 // buy
							if( Money_Flow_Ratio > 0.003118 )
								ret := 1.000000 // buy
						if( Raw_Money_Flow > 5.05834e+06 )
							ret := 0.666667
					if( Positive_Money_Flow > 101030 )
						ret := 0.142857
				if( MFI_High > -79.2011 )
					if( MFI_High <= -41.804 )
						if( Positive_Money_Flow_Sum <= 3.30711e+09 )
							if( Positive_Money_Flow_Sum <= 9.49626e+08 )
								ret := -0.325000
							if( Positive_Money_Flow_Sum > 9.49626e+08 )
								ret := -0.618343
						if( Positive_Money_Flow_Sum > 3.30711e+09 )
							if( MFI_High <= -46.5663 )
								ret := 0.294118
							if( MFI_High > -46.5663 )
								ret := -0.444444
					if( MFI_High > -41.804 )
						if( Positive_Money_Flow_Sum <= 4.66257e+09 )
							if( MFI_Low <= 19.7715 )
								ret := 0.500000
							if( MFI_Low > 19.7715 )
								ret := 0.857143 // buy
						if( Positive_Money_Flow_Sum > 4.66257e+09 )
							if( Positive_Money_Flow <= 1.92561e+07 )
								ret := -0.301587
							if( Positive_Money_Flow > 1.92561e+07 )
								ret := 0.411765
			if( Positive_Money_Flow > 1.05945e+08 )
				if( Typical_Price <= 239.31 )
					if( MFI_High <= -66.3942 )
						if( Raw_Money_Flow <= 9.33233e+08 )
							if( MFI_High <= -69.2012 )
								ret := -1.000000 // sell
							if( MFI_High > -69.2012 )
								ret := -0.769231 // sell
						if( Raw_Money_Flow > 9.33233e+08 )
							ret := -0.333333
					if( MFI_High > -66.3942 )
						if( MFI_High <= -17.6726 )
							if( Raw_Money_Flow <= 9.88619e+08 )
								ret := 0.160494
							if( Raw_Money_Flow > 9.88619e+08 )
								ret := 0.565789
						if( MFI_High > -17.6726 )
							ret := -1.000000 // sell
				if( Typical_Price > 239.31 )
					if( Money_Flow_Ratio <= 0.328141 )
						if( MFI_Low <= -5.1599 )
							if( Negative_Money_Flow_Sum <= 6.03174e+09 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 6.03174e+09 )
								ret := -0.500000
						if( MFI_Low > -5.1599 )
							if( Raw_Money_Flow <= 1.2336e+09 )
								ret := 0.521739
							if( Raw_Money_Flow > 1.2336e+09 )
								ret := -0.200000
					if( Money_Flow_Ratio > 0.328141 )
						if( Negative_Money_Flow_Sum <= 6.16566e+09 )
							if( Raw_Money_Flow <= 1.55754e+09 )
								ret := -0.693878
							if( Raw_Money_Flow > 1.55754e+09 )
								ret := 0.250000
						if( Negative_Money_Flow_Sum > 6.16566e+09 )
							if( Typical_Price <= 310.614 )
								ret := -0.627451
							if( Typical_Price > 310.614 )
								ret := 0.410714
	if( Negative_Money_Flow > 1.58836e+08 )
		if( MFI_Low <= -5.79429 )
			if( Positive_Money_Flow_Sum <= 2.41251e+08 )
				if( Money_Flow_Ratio <= 0.026364 )
					if( Raw_Money_Flow <= 9.70969e+08 )
						if( Negative_Money_Flow <= 9.56504e+08 )
							if( Negative_Money_Flow_Sum <= 4.60618e+09 )
								ret := 0.051852
							if( Negative_Money_Flow_Sum > 4.60618e+09 )
								ret := -0.465517
						if( Negative_Money_Flow > 9.56504e+08 )
							if( Negative_Money_Flow_Sum <= 9.98337e+08 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 9.98337e+08 )
								ret := 0.166667
					if( Raw_Money_Flow > 9.70969e+08 )
						if( Positive_Money_Flow_Sum <= 2.49635e+07 )
							if( Raw_Money_Flow <= 1.08978e+09 )
								ret := -0.590909
							if( Raw_Money_Flow > 1.08978e+09 )
								ret := 0.310345
						if( Positive_Money_Flow_Sum > 2.49635e+07 )
							if( MFI <= 0.92069 )
								ret := 0.000000
							if( MFI > 0.92069 )
								ret := -0.631068
				if( Money_Flow_Ratio > 0.026364 )
					if( Negative_Money_Flow_Sum <= 3.68455e+09 )
						if( Negative_Money_Flow <= 8.08892e+08 )
							if( Negative_Money_Flow_Sum <= 5.82477e+08 )
								ret := 0.025568
							if( Negative_Money_Flow_Sum > 5.82477e+08 )
								ret := -0.260722
						if( Negative_Money_Flow > 8.08892e+08 )
							if( MFI <= 5.65999 )
								ret := -0.096774
							if( MFI > 5.65999 )
								ret := 0.514019
					if( Negative_Money_Flow_Sum > 3.68455e+09 )
						if( MFI_High <= -77.1416 )
							ret := 0.250000
						if( MFI_High > -77.1416 )
							if( Positive_Money_Flow_Sum <= 1.44627e+08 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 1.44627e+08 )
								ret := -0.633333
			if( Positive_Money_Flow_Sum > 2.41251e+08 )
				if( MFI_Low <= -7.43134 )
					if( Negative_Money_Flow <= 9.52887e+08 )
						if( Raw_Money_Flow <= 4.52964e+08 )
							if( Typical_Price <= 192.287 )
								ret := 0.093023
							if( Typical_Price > 192.287 )
								ret := 0.539062
						if( Raw_Money_Flow > 4.52964e+08 )
							if( Negative_Money_Flow_Sum <= 2.82401e+09 )
								ret := -0.200000
							if( Negative_Money_Flow_Sum > 2.82401e+09 )
								ret := 0.750000 // buy
					if( Negative_Money_Flow > 9.52887e+08 )
						if( Negative_Money_Flow <= 4.22414e+09 )
							if( Negative_Money_Flow_Sum <= 1.14217e+10 )
								ret := -0.094118
							if( Negative_Money_Flow_Sum > 1.14217e+10 )
								ret := 1.000000 // buy
						if( Negative_Money_Flow > 4.22414e+09 )
							if( MFI <= 7.29976 )
								ret := 1.000000 // buy
							if( MFI > 7.29976 )
								ret := 0.666667
				if( MFI_Low > -7.43134 )
					if( Positive_Money_Flow_Sum <= 5.51346e+08 )
						if( Raw_Money_Flow <= 2.00838e+08 )
							if( Raw_Money_Flow <= 1.74658e+08 )
								ret := 0.500000
							if( Raw_Money_Flow > 1.74658e+08 )
								ret := -0.571429
						if( Raw_Money_Flow > 2.00838e+08 )
							if( Money_Flow_Ratio <= 0.150415 )
								ret := -0.047619
							if( Money_Flow_Ratio > 0.150415 )
								ret := 0.714286 // buy
					if( Positive_Money_Flow_Sum > 5.51346e+08 )
						if( Typical_Price <= 142.607 )
							ret := 1.000000 // buy
						if( Typical_Price > 142.607 )
							if( Positive_Money_Flow <= 184688 )
								ret := -0.384615
							if( Positive_Money_Flow > 184688 )
								ret := 1.000000 // buy
		if( MFI_Low > -5.79429 )
			if( MFI_High <= -46.9094 )
				if( MFI <= 19.9054 )
					if( Raw_Money_Flow <= 8.28633e+08 )
						if( Negative_Money_Flow_Sum <= 2.295e+09 )
							if( MFI_High <= -64.5685 )
								ret := 0.470588
							if( MFI_High > -64.5685 )
								ret := -0.236364
						if( Negative_Money_Flow_Sum > 2.295e+09 )
							if( Positive_Money_Flow_Sum <= 1.49527e+09 )
								ret := -0.589691
							if( Positive_Money_Flow_Sum > 1.49527e+09 )
								ret := 0.277778
					if( Raw_Money_Flow > 8.28633e+08 )
						if( Positive_Money_Flow_Sum <= 9.66563e+08 )
							if( MFI_High <= -65.068 )
								ret := -0.666667
							if( MFI_High > -65.068 )
								ret := 0.911111 // buy
						if( Positive_Money_Flow_Sum > 9.66563e+08 )
							if( Positive_Money_Flow_Sum <= 1.09349e+09 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 1.09349e+09 )
								ret := -0.346154
				if( MFI > 19.9054 )
					if( Positive_Money_Flow <= 1.44743e+07 )
						if( Negative_Money_Flow <= 3.65467e+08 )
							if( MFI <= 25.5163 )
								ret := -0.238411
							if( MFI > 25.5163 )
								ret := -0.046790
						if( Negative_Money_Flow > 3.65467e+08 )
							if( Negative_Money_Flow_Sum <= 3.8038e+09 )
								ret := -0.396514
							if( Negative_Money_Flow_Sum > 3.8038e+09 )
								ret := -0.124204
					if( Positive_Money_Flow > 1.44743e+07 )
						if( MFI_Low <= 11.5383 )
							if( Raw_Money_Flow <= 6.62609e+08 )
								ret := 1.000000 // buy
							if( Raw_Money_Flow > 6.62609e+08 )
								ret := 0.600000
						if( MFI_Low > 11.5383 )
							ret := -0.714286 // sell
			if( MFI_High > -46.9094 )
				if( Money_Flow_Ratio <= 2.27984 )
					if( Positive_Money_Flow_Sum <= 1.34928e+09 )
						if( Raw_Money_Flow <= 4.55288e+08 )
							if( Negative_Money_Flow_Sum <= 1.30433e+09 )
								ret := -0.055334
							if( Negative_Money_Flow_Sum > 1.30433e+09 )
								ret := 0.153953
						if( Raw_Money_Flow > 4.55288e+08 )
							if( Typical_Price <= 164.215 )
								ret := 0.840909 // buy
							if( Typical_Price > 164.215 )
								ret := 0.187755
					if( Positive_Money_Flow_Sum > 1.34928e+09 )
						if( Negative_Money_Flow <= 1.73224e+09 )
							if( Negative_Money_Flow_Sum <= 1.06953e+10 )
								ret := -0.148634
							if( Negative_Money_Flow_Sum > 1.06953e+10 )
								ret := 0.645161
						if( Negative_Money_Flow > 1.73224e+09 )
							if( Negative_Money_Flow <= 1.99643e+09 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow > 1.99643e+09 )
								ret := -0.035714
				if( Money_Flow_Ratio > 2.27984 )
					if( Money_Flow_Ratio <= 3.1325 )
						if( Raw_Money_Flow <= 2.81254e+08 )
							if( Money_Flow_Ratio <= 2.70769 )
								ret := -0.132812
							if( Money_Flow_Ratio > 2.70769 )
								ret := 0.203463
						if( Raw_Money_Flow > 2.81254e+08 )
							if( Raw_Money_Flow <= 3.38421e+08 )
								ret := 0.616883
							if( Raw_Money_Flow > 3.38421e+08 )
								ret := 0.078550
					if( Money_Flow_Ratio > 3.1325 )
						if( Positive_Money_Flow_Sum <= 2.47755e+09 )
							if( Money_Flow_Ratio <= 8.16723 )
								ret := 0.000000
							if( Money_Flow_Ratio > 8.16723 )
								ret := 0.653333
						if( Positive_Money_Flow_Sum > 2.47755e+09 )
							if( Negative_Money_Flow <= 3.59683e+08 )
								ret := -0.285714
							if( Negative_Money_Flow > 3.59683e+08 )
								ret := -0.102740
	
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
float op_operation = decision_tree_0_META_30Min_d99673c4(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


