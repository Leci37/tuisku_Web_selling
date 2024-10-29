//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: BNBUSDT_15Min_2MS0_f4b70b6c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BNBUSDT_15Min_2MS0_f4b70b6c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BNBUSDT_15Min_f4b70b6c(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7,max_features=sqrt, min_samples_leaf=4,random_state=843828734)
	if( k <= 52.0273 )
		if( rsi1 <= 44.4439 )
			if( MFI_Low <= 24.5084 )
				if( rsi1 <= 30.3473 )
					if( MFI_High <= -56.1488 )
						if( Typical_Price <= 407.608 )
							if( Raw_Money_Flow <= 1.98833e+06 )
								ret := -0.252794
							if( Raw_Money_Flow > 1.98833e+06 )
								ret := -0.008664
						if( Typical_Price > 407.608 )
							if( MFI_High <= -72.3489 )
								ret := 0.191304
							if( MFI_High > -72.3489 )
								ret := -0.659756
					if( MFI_High > -56.1488 )
						if( Typical_Price <= 331.661 )
							if( Raw_Money_Flow <= 1.82597e+07 )
								ret := -0.363888
							if( Raw_Money_Flow > 1.82597e+07 )
								ret := 0.904762 // buy
						if( Typical_Price > 331.661 )
							if( rsi1 <= 26.9465 )
								ret := -0.833561 // sell
							if( rsi1 > 26.9465 )
								ret := -0.600251
				if( rsi1 > 30.3473 )
					if( Money_Flow_Ratio <= 0.423965 )
						if( Positive_Money_Flow <= 19305.1 )
							if( smoothD_d <= 26.1455 )
								ret := -0.028428
							if( smoothD_d > 26.1455 )
								ret := 0.384548
						if( Positive_Money_Flow > 19305.1 )
							if( smoothK_k <= 1.44483 )
								ret := 0.388060
							if( smoothK_k > 1.44483 )
								ret := -0.138817
					if( Money_Flow_Ratio > 0.423965 )
						if( rsi1 <= 36.3492 )
							if( Typical_Price <= 326.417 )
								ret := -0.208197
							if( Typical_Price > 326.417 )
								ret := -0.551356
						if( rsi1 > 36.3492 )
							if( Positive_Money_Flow <= 462526 )
								ret := -0.098498
							if( Positive_Money_Flow > 462526 )
								ret := -0.274214
			if( MFI_Low > 24.5084 )
				if( Positive_Money_Flow <= 867204 )
					if( Typical_Price <= 354.3 )
						if( rsi1 <= 37.8368 )
							if( Negative_Money_Flow_Sum <= 5.89514e+06 )
								ret := -0.424779
							if( Negative_Money_Flow_Sum > 5.89514e+06 )
								ret := -0.629550
						if( rsi1 > 37.8368 )
							if( MFI_Low <= 34.3351 )
								ret := -0.179745
							if( MFI_Low > 34.3351 )
								ret := -0.365182
					if( Typical_Price > 354.3 )
						if( d_k <= 23.645 )
							if( rsi1 <= 36.1987 )
								ret := -0.807670 // sell
							if( rsi1 > 36.1987 )
								ret := -0.602057
						if( d_k > 23.645 )
							if( MFI_High <= -18.1994 )
								ret := -0.127660
							if( MFI_High > -18.1994 )
								ret := -0.500000
				if( Positive_Money_Flow > 867204 )
					if( MFI_Low <= 33.6924 )
						if( Typical_Price <= 323.145 )
							if( Negative_Money_Flow_Sum <= 4.19996e+07 )
								ret := -0.503748
							if( Negative_Money_Flow_Sum > 4.19996e+07 )
								ret := 0.125000
						if( Typical_Price > 323.145 )
							if( rsi1 <= 34.5991 )
								ret := -0.915789 // sell
							if( rsi1 > 34.5991 )
								ret := -0.599567
					if( MFI_Low > 33.6924 )
						if( Money_Flow_Ratio <= 2.25886 )
							if( Raw_Money_Flow <= 5.70757e+06 )
								ret := -0.752800 // sell
							if( Raw_Money_Flow > 5.70757e+06 )
								ret := -0.930233 // sell
						if( Money_Flow_Ratio > 2.25886 )
							if( Positive_Money_Flow_Sum <= 7.41115e+06 )
								ret := -0.300000
							if( Positive_Money_Flow_Sum > 7.41115e+06 )
								ret := -0.897177 // sell
		if( rsi1 > 44.4439 )
			if( MFI <= 61.4008 )
				if( rsi1 <= 55.9054 )
					if( Money_Flow_Ratio <= 0.569209 )
						if( smoothD_d <= 20.0714 )
							if( Positive_Money_Flow_Sum <= 2.89506e+07 )
								ret := 0.048346
							if( Positive_Money_Flow_Sum > 2.89506e+07 )
								ret := -0.800000 // sell
						if( smoothD_d > 20.0714 )
							if( Raw_Money_Flow <= 323185 )
								ret := 0.054795
							if( Raw_Money_Flow > 323185 )
								ret := 0.497696
					if( Money_Flow_Ratio > 0.569209 )
						if( MFI_Low <= 30.9515 )
							if( k <= 7.54022 )
								ret := -0.326733
							if( k > 7.54022 )
								ret := 0.047759
						if( MFI_Low > 30.9515 )
							if( Positive_Money_Flow <= 650604 )
								ret := -0.067037
							if( Positive_Money_Flow > 650604 )
								ret := -0.275656
				if( rsi1 > 55.9054 )
					if( Typical_Price <= 409.073 )
						if( d_k <= 9.84619 )
							if( d <= 31.3685 )
								ret := 0.164798
							if( d > 31.3685 )
								ret := 0.354102
						if( d_k > 9.84619 )
							if( Raw_Money_Flow <= 795930 )
								ret := 0.277778
							if( Raw_Money_Flow > 795930 )
								ret := -0.171103
					if( Typical_Price > 409.073 )
						if( Positive_Money_Flow <= 2.26712e+06 )
							if( smoothK_k <= 34.8664 )
								ret := 0.288462
							if( smoothK_k > 34.8664 )
								ret := 0.605042
						if( Positive_Money_Flow > 2.26712e+06 )
							if( Raw_Money_Flow <= 2.50593e+06 )
								ret := -0.321429
							if( Raw_Money_Flow > 2.50593e+06 )
								ret := 0.206349
			if( MFI > 61.4008 )
				if( d <= 54.6606 )
					if( d_k <= -1.92307 )
						if( k <= 24.7735 )
							if( rsi1 <= 55.7642 )
								ret := -0.412429
							if( rsi1 > 55.7642 )
								ret := -0.028497
						if( k > 24.7735 )
							if( rsi1 <= 61.8346 )
								ret := -0.209302
							if( rsi1 > 61.8346 )
								ret := 0.224377
					if( d_k > -1.92307 )
						if( Positive_Money_Flow <= 979688 )
							if( Negative_Money_Flow <= 1.14834e+07 )
								ret := -0.130735
							if( Negative_Money_Flow > 1.14834e+07 )
								ret := -0.693069
						if( Positive_Money_Flow > 979688 )
							if( Positive_Money_Flow_Sum <= 2.35583e+08 )
								ret := -0.429767
							if( Positive_Money_Flow_Sum > 2.35583e+08 )
								ret := 0.562500
				if( d > 54.6606 )
					if( rsi1 <= 68.8466 )
						if( Negative_Money_Flow <= 22591 )
							if( rsi1 <= 53.4323 )
								ret := -0.513514
							if( rsi1 > 53.4323 )
								ret := -0.134875
						if( Negative_Money_Flow > 22591 )
							if( Negative_Money_Flow <= 2.91571e+06 )
								ret := 0.134663
							if( Negative_Money_Flow > 2.91571e+06 )
								ret := -0.220930
					if( rsi1 > 68.8466 )
						if( Positive_Money_Flow <= 1.35789e+06 )
							if( Raw_Money_Flow <= 5.14728e+06 )
								ret := -0.010526
							if( Raw_Money_Flow > 5.14728e+06 )
								ret := 0.833333 // buy
						if( Positive_Money_Flow > 1.35789e+06 )
							if( MFI_Low <= 75.106 )
								ret := 0.728571 // buy
							if( MFI_Low > 75.106 )
								ret := -0.888889 // sell
	if( k > 52.0273 )
		if( rsi1 <= 55.0054 )
			if( MFI_Low <= 18.9881 )
				if( Negative_Money_Flow <= 1.47693e+06 )
					if( Positive_Money_Flow <= 2.85474e+06 )
						if( smoothK_k <= 78.2752 )
							if( rsi1 <= 45.3868 )
								ret := -0.091817
							if( rsi1 > 45.3868 )
								ret := 0.320000
						if( smoothK_k > 78.2752 )
							if( rsi1 <= 35.4503 )
								ret := -0.262500
							if( rsi1 > 35.4503 )
								ret := 0.252040
					if( Positive_Money_Flow > 2.85474e+06 )
						if( Typical_Price <= 562.719 )
							if( rsi1 <= 39.2934 )
								ret := 0.085938
							if( rsi1 > 39.2934 )
								ret := 0.599620
						if( Typical_Price > 562.719 )
							if( Typical_Price <= 599.867 )
								ret := -0.102740
							if( Typical_Price > 599.867 )
								ret := 0.571429
				if( Negative_Money_Flow > 1.47693e+06 )
					if( rsi1 <= 43.3796 )
						if( smoothD_d <= 35.7649 )
							if( MFI_High <= -69.3878 )
								ret := 0.000000
							if( MFI_High > -69.3878 )
								ret := -0.513889
						if( smoothD_d > 35.7649 )
							if( MFI_Low <= 1.70037 )
								ret := 0.520486
							if( MFI_Low > 1.70037 )
								ret := 0.060606
					if( rsi1 > 43.3796 )
						if( MFI_High <= -45.7322 )
							if( d <= 37.1177 )
								ret := -0.137931
							if( d > 37.1177 )
								ret := 0.766553 // buy
						if( MFI_High > -45.7322 )
							if( rsi1 <= 52.6432 )
								ret := 0.277154
							if( rsi1 > 52.6432 )
								ret := 0.772727 // buy
			if( MFI_Low > 18.9881 )
				if( smoothD_d <= 76.6223 )
					if( MFI <= 53.847 )
						if( rsi1 <= 46.4859 )
							if( Negative_Money_Flow_Sum <= 1.58391e+08 )
								ret := -0.208311
							if( Negative_Money_Flow_Sum > 1.58391e+08 )
								ret := -1.000000 // sell
						if( rsi1 > 46.4859 )
							if( Positive_Money_Flow <= 16234.9 )
								ret := 0.235115
							if( Positive_Money_Flow > 16234.9 )
								ret := 0.052571
					if( MFI > 53.847 )
						if( Negative_Money_Flow_Sum <= 6.18961e+06 )
							if( Money_Flow_Ratio <= 2.41476 )
								ret := -0.049630
							if( Money_Flow_Ratio > 2.41476 )
								ret := -0.480000
						if( Negative_Money_Flow_Sum > 6.18961e+06 )
							if( Raw_Money_Flow <= 1.20113e+07 )
								ret := -0.464746
							if( Raw_Money_Flow > 1.20113e+07 )
								ret := 0.619048
				if( smoothD_d > 76.6223 )
					if( Negative_Money_Flow <= 851735 )
						if( Positive_Money_Flow_Sum <= 8.92889e+06 )
							if( Positive_Money_Flow_Sum <= 8.01173e+06 )
								ret := 0.019097
							if( Positive_Money_Flow_Sum > 8.01173e+06 )
								ret := -0.270270
						if( Positive_Money_Flow_Sum > 8.92889e+06 )
							if( Positive_Money_Flow <= 1.59898e+07 )
								ret := 0.124502
							if( Positive_Money_Flow > 1.59898e+07 )
								ret := 0.900000 // buy
					if( Negative_Money_Flow > 851735 )
						if( Positive_Money_Flow_Sum <= 8.22588e+07 )
							if( MFI <= 54.2209 )
								ret := 0.317232
							if( MFI > 54.2209 )
								ret := 0.068862
						if( Positive_Money_Flow_Sum > 8.22588e+07 )
							if( rsi1 <= 46.5872 )
								ret := -0.884615 // sell
							if( rsi1 > 46.5872 )
								ret := -0.100000
		if( rsi1 > 55.0054 )
			if( MFI_Low <= 36.5 )
				if( rsi1 <= 66.6682 )
					if( Negative_Money_Flow_Sum <= 1.03342e+07 )
						if( Negative_Money_Flow <= 402938 )
							if( Money_Flow_Ratio <= 1.27655 )
								ret := 0.268390
							if( Money_Flow_Ratio > 1.27655 )
								ret := 0.477612
						if( Negative_Money_Flow > 402938 )
							if( Typical_Price <= 354.111 )
								ret := 0.386633
							if( Typical_Price > 354.111 )
								ret := 0.668852
					if( Negative_Money_Flow_Sum > 1.03342e+07 )
						if( MFI_High <= -27.332 )
							if( Money_Flow_Ratio <= 0.634662 )
								ret := 0.701923 // buy
							if( Money_Flow_Ratio > 0.634662 )
								ret := 0.551895
						if( MFI_High > -27.332 )
							if( Money_Flow_Ratio <= 1.17285 )
								ret := 0.135714
							if( Money_Flow_Ratio > 1.17285 )
								ret := 0.396789
				if( rsi1 > 66.6682 )
					if( d_k <= 10.2308 )
						if( Negative_Money_Flow_Sum <= 6.44657e+06 )
							if( k <= 99.9754 )
								ret := 0.627237
							if( k > 99.9754 )
								ret := 0.264957
						if( Negative_Money_Flow_Sum > 6.44657e+06 )
							if( Negative_Money_Flow <= 980645 )
								ret := 0.689821
							if( Negative_Money_Flow > 980645 )
								ret := 0.820817 // buy
					if( d_k > 10.2308 )
						ret := -0.300000
			if( MFI_Low > 36.5 )
				if( Typical_Price <= 381.455 )
					if( smoothD_d <= 70.7559 )
						if( rsi1 <= 73.2064 )
							if( MFI_Low <= 51.0001 )
								ret := 0.069714
							if( MFI_Low > 51.0001 )
								ret := -0.204828
						if( rsi1 > 73.2064 )
							if( MFI <= 68.1591 )
								ret := 0.621622
							if( MFI > 68.1591 )
								ret := 0.234279
					if( smoothD_d > 70.7559 )
						if( Typical_Price <= 265.005 )
							if( rsi1 <= 67.6493 )
								ret := 0.201567
							if( rsi1 > 67.6493 )
								ret := 0.380762
						if( Typical_Price > 265.005 )
							if( rsi1 <= 69.728 )
								ret := 0.030382
							if( rsi1 > 69.728 )
								ret := 0.263230
				if( Typical_Price > 381.455 )
					if( rsi1 <= 71.6667 )
						if( MFI_Low <= 54.8805 )
							if( MFI_High <= -16.3155 )
								ret := 0.476670
							if( MFI_High > -16.3155 )
								ret := 0.223170
						if( MFI_Low > 54.8805 )
							if( rsi1 <= 65.6736 )
								ret := -0.364312
							if( rsi1 > 65.6736 )
								ret := -0.039535
					if( rsi1 > 71.6667 )
						if( Money_Flow_Ratio <= 15.2802 )
							if( Negative_Money_Flow <= 1.87928e+07 )
								ret := 0.723594 // buy
							if( Negative_Money_Flow > 1.87928e+07 )
								ret := -0.600000
						if( Money_Flow_Ratio > 15.2802 )
							if( Negative_Money_Flow_Sum <= 917828 )
								ret := 0.875000 // buy
							if( Negative_Money_Flow_Sum > 917828 )
								ret := -0.185185
	
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
float op_operation = decision_tree_0_BNBUSDT_15Min_f4b70b6c(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


