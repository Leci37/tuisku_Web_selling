//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: VETUSDT_15Min_2MS0_063557e3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_VETUSDT_15Min_2MS0_063557e3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_VETUSDT_15Min_063557e3(Positive_Money_Flow_Sum, MFI, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, MFI_High, Typical_Price, Positive_Money_Flow, Negative_Money_Flow_Sum, smoothK_k, d_k, k, smoothD_d, rsi1, d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( smoothK_k <= 51.7034 )
		if( d <= 22.5418 )
			if( Raw_Money_Flow <= 103075 )
				if( rsi1 <= 40.622 )
					if( MFI <= 42.3285 )
						if( rsi1 <= 28.5652 )
							if( MFI_Low <= -3.09889 )
								ret := -0.369427
							if( MFI_Low > -3.09889 )
								ret := -0.621993
						if( rsi1 > 28.5652 )
							if( MFI_Low <= 15.9084 )
								ret := -0.273133
							if( MFI_Low > 15.9084 )
								ret := -0.432836
					if( MFI > 42.3285 )
						if( Positive_Money_Flow_Sum <= 190922 )
							if( Raw_Money_Flow <= 6196.22 )
								ret := -0.100000
							if( Raw_Money_Flow > 6196.22 )
								ret := -0.463700
						if( Positive_Money_Flow_Sum > 190922 )
							if( rsi1 <= 30.6742 )
								ret := -0.775827 // sell
							if( rsi1 > 30.6742 )
								ret := -0.604581
				if( rsi1 > 40.622 )
					if( rsi1 <= 48.9324 )
						if( MFI_Low <= 25.0252 )
							if( MFI <= 34.2015 )
								ret := 0.042453
							if( MFI > 34.2015 )
								ret := -0.131387
						if( MFI_Low > 25.0252 )
							if( MFI <= 60.1763 )
								ret := -0.313789
							if( MFI > 60.1763 )
								ret := -0.481992
					if( rsi1 > 48.9324 )
						if( Positive_Money_Flow <= 43824 )
							if( Negative_Money_Flow_Sum <= 423686 )
								ret := -0.090568
							if( Negative_Money_Flow_Sum > 423686 )
								ret := 0.169776
						if( Positive_Money_Flow > 43824 )
							if( rsi1 <= 67.036 )
								ret := -0.326555
							if( rsi1 > 67.036 )
								ret := 0.280702
			if( Raw_Money_Flow > 103075 )
				if( MFI_High <= -51.7722 )
					if( Typical_Price <= 0.031625 )
						if( Negative_Money_Flow_Sum <= 1.04637e+06 )
							if( rsi1 <= 28.7068 )
								ret := -0.537415
							if( rsi1 > 28.7068 )
								ret := 0.030864
						if( Negative_Money_Flow_Sum > 1.04637e+06 )
							if( Negative_Money_Flow_Sum <= 3.17251e+06 )
								ret := 0.095823
							if( Negative_Money_Flow_Sum > 3.17251e+06 )
								ret := 0.315271
					if( Typical_Price > 0.031625 )
						if( d_k <= 0.872076 )
							if( Raw_Money_Flow <= 284935 )
								ret := -0.581560
							if( Raw_Money_Flow > 284935 )
								ret := -0.252252
						if( d_k > 0.872076 )
							if( rsi1 <= 26.8068 )
								ret := -0.269461
							if( rsi1 > 26.8068 )
								ret := 0.351064
				if( MFI_High > -51.7722 )
					if( Typical_Price <= 0.032794 )
						if( rsi1 <= 34.8076 )
							if( MFI <= 35.3878 )
								ret := -0.135785
							if( MFI > 35.3878 )
								ret := -0.619300
						if( rsi1 > 34.8076 )
							if( MFI <= 51.3859 )
								ret := 0.012710
							if( MFI > 51.3859 )
								ret := -0.260690
					if( Typical_Price > 0.032794 )
						if( rsi1 <= 49.2422 )
							if( Negative_Money_Flow_Sum <= 1.87636e+06 )
								ret := -0.724425 // sell
							if( Negative_Money_Flow_Sum > 1.87636e+06 )
								ret := -0.470466
						if( rsi1 > 49.2422 )
							if( MFI_Low <= 50.7558 )
								ret := 0.082218
							if( MFI_Low > 50.7558 )
								ret := -0.494340
		if( d > 22.5418 )
			if( rsi1 <= 52.0819 )
				if( Money_Flow_Ratio <= 0.888448 )
					if( Negative_Money_Flow <= 47388.7 )
						if( Positive_Money_Flow_Sum <= 1.04322e+06 )
							if( Positive_Money_Flow <= 8543.86 )
								ret := -0.127423
							if( Positive_Money_Flow > 8543.86 )
								ret := -0.287025
						if( Positive_Money_Flow_Sum > 1.04322e+06 )
							if( rsi1 <= 43.8955 )
								ret := -0.066521
							if( rsi1 > 43.8955 )
								ret := 0.225989
					if( Negative_Money_Flow > 47388.7 )
						if( rsi1 <= 39.971 )
							if( MFI_Low <= 14.8728 )
								ret := 0.115264
							if( MFI_Low > 14.8728 )
								ret := -0.319380
						if( rsi1 > 39.971 )
							if( MFI_High <= -46.788 )
								ret := 0.469565
							if( MFI_High > -46.788 )
								ret := 0.175594
				if( Money_Flow_Ratio > 0.888448 )
					if( rsi1 <= 43.1186 )
						if( Typical_Price <= 0.031097 )
							if( Positive_Money_Flow <= 4509.6 )
								ret := -0.370840
							if( Positive_Money_Flow > 4509.6 )
								ret := -0.621368
						if( Typical_Price > 0.031097 )
							if( Positive_Money_Flow_Sum <= 540997 )
								ret := -0.390625
							if( Positive_Money_Flow_Sum > 540997 )
								ret := -0.792000 // sell
					if( rsi1 > 43.1186 )
						if( MFI_Low <= 41.0055 )
							if( Negative_Money_Flow <= 65734.4 )
								ret := -0.217007
							if( Negative_Money_Flow > 65734.4 )
								ret := -0.068109
						if( MFI_Low > 41.0055 )
							if( Positive_Money_Flow <= 10997.5 )
								ret := -0.343189
							if( Positive_Money_Flow > 10997.5 )
								ret := -0.638136
			if( rsi1 > 52.0819 )
				if( Negative_Money_Flow <= 276.147 )
					if( MFI_High <= -16.99 )
						if( Positive_Money_Flow <= 434837 )
							if( rsi1 <= 62.2591 )
								ret := 0.043124
							if( rsi1 > 62.2591 )
								ret := 0.378713
						if( Positive_Money_Flow > 434837 )
							if( Negative_Money_Flow_Sum <= 4.81469e+06 )
								ret := -0.523810
							if( Negative_Money_Flow_Sum > 4.81469e+06 )
								ret := 0.423077
					if( MFI_High > -16.99 )
						if( Money_Flow_Ratio <= 3.71533 )
							if( rsi1 <= 66.6601 )
								ret := -0.240149
							if( rsi1 > 66.6601 )
								ret := 0.292308
						if( Money_Flow_Ratio > 3.71533 )
							if( rsi1 <= 67.9025 )
								ret := -0.513514
							if( rsi1 > 67.9025 )
								ret := -0.017544
				if( Negative_Money_Flow > 276.147 )
					if( d_k <= 2.7955 )
						if( rsi1 <= 67.8113 )
							if( MFI_High <= -21.1941 )
								ret := 0.426818
							if( MFI_High > -21.1941 )
								ret := 0.166247
						if( rsi1 > 67.8113 )
							if( Negative_Money_Flow_Sum <= 1.28169e+06 )
								ret := 0.579710
							if( Negative_Money_Flow_Sum > 1.28169e+06 )
								ret := 0.870370 // buy
					if( d_k > 2.7955 )
						if( rsi1 <= 59.4273 )
							if( Money_Flow_Ratio <= 3.10772 )
								ret := 0.096491
							if( Money_Flow_Ratio > 3.10772 )
								ret := -0.404255
						if( rsi1 > 59.4273 )
							if( Negative_Money_Flow_Sum <= 438864 )
								ret := 0.143297
							if( Negative_Money_Flow_Sum > 438864 )
								ret := 0.355590
	if( smoothK_k > 51.7034 )
		if( smoothK_k <= 73.7643 )
			if( Negative_Money_Flow <= 7.043 )
				if( rsi1 <= 49.2535 )
					if( MFI <= 39.2188 )
						if( rsi1 <= 44.0662 )
							if( rsi1 <= 40.8695 )
								ret := -0.179372
							if( rsi1 > 40.8695 )
								ret := 0.027108
						if( rsi1 > 44.0662 )
							if( Money_Flow_Ratio <= 0.434053 )
								ret := 0.469697
							if( Money_Flow_Ratio > 0.434053 )
								ret := 0.128834
					if( MFI > 39.2188 )
						if( MFI <= 53.3918 )
							if( Positive_Money_Flow <= 14674.9 )
								ret := 0.026316
							if( Positive_Money_Flow > 14674.9 )
								ret := -0.256611
						if( MFI > 53.3918 )
							if( Raw_Money_Flow <= 285715 )
								ret := -0.424855
							if( Raw_Money_Flow > 285715 )
								ret := -0.900000 // sell
				if( rsi1 > 49.2535 )
					if( MFI_High <= -33.8015 )
						if( Positive_Money_Flow <= 13154.4 )
							if( MFI_Low <= 25.1809 )
								ret := -0.041379
							if( MFI_Low > 25.1809 )
								ret := 0.461538
						if( Positive_Money_Flow > 13154.4 )
							if( smoothD_d <= 40.2376 )
								ret := 0.055118
							if( smoothD_d > 40.2376 )
								ret := 0.416866
					if( MFI_High > -33.8015 )
						if( rsi1 <= 63.8868 )
							if( Raw_Money_Flow <= 152724 )
								ret := 0.027263
							if( Raw_Money_Flow > 152724 )
								ret := -0.276578
						if( rsi1 > 63.8868 )
							if( MFI_Low <= 57.3842 )
								ret := 0.289924
							if( MFI_Low > 57.3842 )
								ret := -0.015918
			if( Negative_Money_Flow > 7.043 )
				if( Negative_Money_Flow_Sum <= 1.70986e+07 )
					if( rsi1 <= 60.4199 )
						if( Money_Flow_Ratio <= 0.87187 )
							if( rsi1 <= 39.7502 )
								ret := 0.004144
							if( rsi1 > 39.7502 )
								ret := 0.400342
						if( Money_Flow_Ratio > 0.87187 )
							if( Positive_Money_Flow_Sum <= 2.61232e+06 )
								ret := 0.044643
							if( Positive_Money_Flow_Sum > 2.61232e+06 )
								ret := -0.288462
					if( rsi1 > 60.4199 )
						if( MFI <= 74.3673 )
							if( rsi1 <= 66.9202 )
								ret := 0.422255
							if( rsi1 > 66.9202 )
								ret := 0.637435
						if( MFI > 74.3673 )
							if( rsi1 <= 70.5177 )
								ret := -0.140288
							if( rsi1 > 70.5177 )
								ret := 0.430189
				if( Negative_Money_Flow_Sum > 1.70986e+07 )
					if( Positive_Money_Flow <= 236761 )
						ret := -1.000000 // sell
					if( Positive_Money_Flow > 236761 )
						ret := 0.000000
		if( smoothK_k > 73.7643 )
			if( MFI_Low <= 26.2323 )
				if( k <= 86.4075 )
					if( Positive_Money_Flow_Sum <= 811928 )
						if( rsi1 <= 53.4495 )
							if( Raw_Money_Flow <= 76510.7 )
								ret := 0.145849
							if( Raw_Money_Flow > 76510.7 )
								ret := 0.533716
						if( rsi1 > 53.4495 )
							if( smoothD_d <= 53.009 )
								ret := 0.152174
							if( smoothD_d > 53.009 )
								ret := 0.646018
					if( Positive_Money_Flow_Sum > 811928 )
						if( Negative_Money_Flow <= 202801 )
							if( Negative_Money_Flow_Sum <= 1.90771e+06 )
								ret := 0.359848
							if( Negative_Money_Flow_Sum > 1.90771e+06 )
								ret := 0.040777
						if( Negative_Money_Flow > 202801 )
							if( Positive_Money_Flow_Sum <= 1.01805e+07 )
								ret := 0.546075
							if( Positive_Money_Flow_Sum > 1.01805e+07 )
								ret := -0.916667 // sell
				if( k > 86.4075 )
					if( rsi1 <= 55.5581 )
						if( MFI_High <= -45.0336 )
							if( rsi1 <= 41.7692 )
								ret := 0.235577
							if( rsi1 > 41.7692 )
								ret := 0.531882
						if( MFI_High > -45.0336 )
							if( Positive_Money_Flow <= 249057 )
								ret := 0.128067
							if( Positive_Money_Flow > 249057 )
								ret := 0.429577
					if( rsi1 > 55.5581 )
						if( Typical_Price <= 0.019583 )
							if( Raw_Money_Flow <= 23000.4 )
								ret := 0.391398
							if( Raw_Money_Flow > 23000.4 )
								ret := 0.590909
						if( Typical_Price > 0.019583 )
							if( MFI_Low <= 15.1507 )
								ret := 0.771659 // buy
							if( MFI_Low > 15.1507 )
								ret := 0.651044
			if( MFI_Low > 26.2323 )
				if( rsi1 <= 68.6727 )
					if( rsi1 <= 59.695 )
						if( Raw_Money_Flow <= 230502 )
							if( Positive_Money_Flow_Sum <= 1.1547e+06 )
								ret := 0.107309
							if( Positive_Money_Flow_Sum > 1.1547e+06 )
								ret := -0.124650
						if( Raw_Money_Flow > 230502 )
							if( Negative_Money_Flow <= 341940 )
								ret := -0.314662
							if( Negative_Money_Flow > 341940 )
								ret := 0.130000
					if( rsi1 > 59.695 )
						if( MFI <= 58.4335 )
							if( Positive_Money_Flow <= 71068.5 )
								ret := 0.448687
							if( Positive_Money_Flow > 71068.5 )
								ret := 0.207418
						if( MFI > 58.4335 )
							if( Negative_Money_Flow_Sum <= 516918 )
								ret := 0.207077
							if( Negative_Money_Flow_Sum > 516918 )
								ret := -0.047847
				if( rsi1 > 68.6727 )
					if( MFI_Low <= 54.9269 )
						if( rsi1 <= 75.0037 )
							if( MFI_High <= -14.2402 )
								ret := 0.553023
							if( MFI_High > -14.2402 )
								ret := 0.307038
						if( rsi1 > 75.0037 )
							if( Typical_Price <= 0.027134 )
								ret := 0.624138
							if( Typical_Price > 0.027134 )
								ret := 0.785501 // buy
					if( MFI_Low > 54.9269 )
						if( Positive_Money_Flow_Sum <= 5.29757e+06 )
							if( rsi1 <= 81.4849 )
								ret := 0.204241
							if( rsi1 > 81.4849 )
								ret := 0.510221
						if( Positive_Money_Flow_Sum > 5.29757e+06 )
							if( Negative_Money_Flow_Sum <= 2.93983e+06 )
								ret := -0.533937
							if( Negative_Money_Flow_Sum > 2.93983e+06 )
								ret := 0.891892 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_VETUSDT_15Min_063557e3(Positive_Money_Flow_Sum, MFI, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, MFI_High, Typical_Price, Positive_Money_Flow, Negative_Money_Flow_Sum, smoothK_k, d_k, k, smoothD_d, rsi1, d)

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


