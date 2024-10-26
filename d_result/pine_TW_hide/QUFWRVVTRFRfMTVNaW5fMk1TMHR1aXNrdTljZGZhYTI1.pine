//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: AAVEUSDT_15Min_2MS0_9cdfaa25 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAVEUSDT_15Min_2MS0_9cdfaa25", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAVEUSDT_15Min_9cdfaa25(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( k <= 50.589 )
		if( smoothK_k <= 22.5264 )
			if( rsi1 <= 37.4952 )
				if( MFI_Low <= 19.9295 )
					if( rsi1 <= 26.649 )
						if( Typical_Price <= 102.499 )
							if( Money_Flow_Ratio <= 0.166701 )
								ret := -0.227454
							if( Money_Flow_Ratio > 0.166701 )
								ret := -0.441070
						if( Typical_Price > 102.499 )
							if( MFI <= 21.101 )
								ret := -0.506048
							if( MFI > 21.101 )
								ret := -0.737430 // sell
					if( rsi1 > 26.649 )
						if( Money_Flow_Ratio <= 0.415217 )
							if( d <= 15.1719 )
								ret := -0.237176
							if( d > 15.1719 )
								ret := -0.048415
						if( Money_Flow_Ratio > 0.415217 )
							if( Negative_Money_Flow <= 1.9622e+06 )
								ret := -0.315345
							if( Negative_Money_Flow > 1.9622e+06 )
								ret := -1.000000 // sell
				if( MFI_Low > 19.9295 )
					if( Negative_Money_Flow_Sum <= 9.88452e+06 )
						if( rsi1 <= 33.3278 )
							if( Positive_Money_Flow_Sum <= 1.0482e+06 )
								ret := -0.613204
							if( Positive_Money_Flow_Sum > 1.0482e+06 )
								ret := -0.755467 // sell
						if( rsi1 > 33.3278 )
							if( rsi1 <= 33.3341 )
								ret := -0.170068
							if( rsi1 > 33.3341 )
								ret := -0.570350
					if( Negative_Money_Flow_Sum > 9.88452e+06 )
						if( Positive_Money_Flow <= 250636 )
							if( smoothD_d <= 1.89731 )
								ret := 0.285714
							if( smoothD_d > 1.89731 )
								ret := 0.958333 // buy
						if( Positive_Money_Flow > 250636 )
							if( Money_Flow_Ratio <= 0.994943 )
								ret := -0.250000
							if( Money_Flow_Ratio > 0.994943 )
								ret := -1.000000 // sell
			if( rsi1 > 37.4952 )
				if( Money_Flow_Ratio <= 0.63383 )
					if( Positive_Money_Flow_Sum <= 2.24956e+06 )
						if( Negative_Money_Flow_Sum <= 2.35905e+06 )
							if( smoothD_d <= 19.3667 )
								ret := -0.019897
							if( smoothD_d > 19.3667 )
								ret := 0.192385
						if( Negative_Money_Flow_Sum > 2.35905e+06 )
							if( Raw_Money_Flow <= 406886 )
								ret := 0.134615
							if( Raw_Money_Flow > 406886 )
								ret := 0.504673
					if( Positive_Money_Flow_Sum > 2.24956e+06 )
						if( Raw_Money_Flow <= 665216 )
							if( Positive_Money_Flow <= 6844.93 )
								ret := 0.390244
							if( Positive_Money_Flow > 6844.93 )
								ret := -0.448276
						if( Raw_Money_Flow > 665216 )
							if( Positive_Money_Flow <= 736014 )
								ret := -0.809524 // sell
							if( Positive_Money_Flow > 736014 )
								ret := 0.500000
				if( Money_Flow_Ratio > 0.63383 )
					if( rsi1 <= 49.9983 )
						if( Typical_Price <= 91.4671 )
							if( MFI_Low <= 52.0794 )
								ret := -0.241063
							if( MFI_Low > 52.0794 )
								ret := -0.548013
						if( Typical_Price > 91.4671 )
							if( MFI_Low <= 37.2793 )
								ret := -0.389682
							if( MFI_Low > 37.2793 )
								ret := -0.607965
					if( rsi1 > 49.9983 )
						if( Money_Flow_Ratio <= 2.00969 )
							if( Typical_Price <= 134.857 )
								ret := -0.022616
							if( Typical_Price > 134.857 )
								ret := -0.388889
						if( Money_Flow_Ratio > 2.00969 )
							if( Raw_Money_Flow <= 197456 )
								ret := -0.111856
							if( Raw_Money_Flow > 197456 )
								ret := -0.470178
		if( smoothK_k > 22.5264 )
			if( Positive_Money_Flow <= 2367.95 )
				if( MFI <= 33.3775 )
					if( rsi1 <= 34.5902 )
						if( Money_Flow_Ratio <= 0.09503 )
							if( smoothD_d <= 21.0165 )
								ret := -0.090909
							if( smoothD_d > 21.0165 )
								ret := 0.603604
						if( Money_Flow_Ratio > 0.09503 )
							if( rsi1 <= 24.2344 )
								ret := -0.427208
							if( rsi1 > 24.2344 )
								ret := -0.043564
					if( rsi1 > 34.5902 )
						if( Raw_Money_Flow <= 84530.2 )
							if( smoothD_d <= 16.1569 )
								ret := -0.274194
							if( smoothD_d > 16.1569 )
								ret := 0.148055
						if( Raw_Money_Flow > 84530.2 )
							if( d <= 27.5874 )
								ret := 0.212121
							if( d > 27.5874 )
								ret := 0.498922
				if( MFI > 33.3775 )
					if( k <= 43.9073 )
						if( rsi1 <= 50.1427 )
							if( MFI_Low <= 30.8512 )
								ret := -0.140802
							if( MFI_Low > 30.8512 )
								ret := -0.346038
						if( rsi1 > 50.1427 )
							if( MFI_High <= -19.8528 )
								ret := 0.279839
							if( MFI_High > -19.8528 )
								ret := 0.012346
					if( k > 43.9073 )
						if( Raw_Money_Flow <= 244778 )
							if( rsi1 <= 44.768 )
								ret := -0.314342
							if( rsi1 > 44.768 )
								ret := 0.129781
						if( Raw_Money_Flow > 244778 )
							if( MFI <= 40.1742 )
								ret := 0.444444
							if( MFI > 40.1742 )
								ret := 0.173804
			if( Positive_Money_Flow > 2367.95 )
				if( rsi1 <= 52.6239 )
					if( MFI_High <= -33.6325 )
						if( d_k <= 3.69931 )
							if( rsi1 <= 35.7135 )
								ret := -0.360577
							if( rsi1 > 35.7135 )
								ret := -0.009031
						if( d_k > 3.69931 )
							if( rsi1 <= 38.6029 )
								ret := -0.526718
							if( rsi1 > 38.6029 )
								ret := -0.085106
					if( MFI_High > -33.6325 )
						if( Typical_Price <= 87.141 )
							if( rsi1 <= 45.4529 )
								ret := -0.463415
							if( rsi1 > 45.4529 )
								ret := -0.230398
						if( Typical_Price > 87.141 )
							if( d_k <= -4.84673 )
								ret := -0.415042
							if( d_k > -4.84673 )
								ret := -0.653435
				if( rsi1 > 52.6239 )
					if( Money_Flow_Ratio <= 3.04655 )
						if( rsi1 <= 65.3231 )
							if( Money_Flow_Ratio <= 1.3317 )
								ret := 0.151824
							if( Money_Flow_Ratio > 1.3317 )
								ret := -0.155860
						if( rsi1 > 65.3231 )
							if( d_k <= -11.3451 )
								ret := -0.158537
							if( d_k > -11.3451 )
								ret := 0.403183
					if( Money_Flow_Ratio > 3.04655 )
						if( Positive_Money_Flow <= 481652 )
							if( smoothD_d <= 56.275 )
								ret := -0.265487
							if( smoothD_d > 56.275 )
								ret := 0.125000
						if( Positive_Money_Flow > 481652 )
							if( d_k <= 13.3373 )
								ret := -0.789030 // sell
							if( d_k > 13.3373 )
								ret := -0.375000
	if( k > 50.589 )
		if( k <= 74.1029 )
			if( Positive_Money_Flow <= 2397.1 )
				if( MFI <= 33.8044 )
					if( Raw_Money_Flow <= 88065.6 )
						if( Money_Flow_Ratio <= 0.487869 )
							if( rsi1 <= 47.2023 )
								ret := -0.071332
							if( rsi1 > 47.2023 )
								ret := 0.483146
						if( Money_Flow_Ratio > 0.487869 )
							if( Negative_Money_Flow_Sum <= 505628 )
								ret := 0.051282
							if( Negative_Money_Flow_Sum > 505628 )
								ret := 0.724138 // buy
					if( Raw_Money_Flow > 88065.6 )
						if( rsi1 <= 39.1949 )
							if( MFI <= 7.65073 )
								ret := 0.661972
							if( MFI > 7.65073 )
								ret := 0.146879
						if( rsi1 > 39.1949 )
							if( MFI <= 29.7893 )
								ret := 0.724576 // buy
							if( MFI > 29.7893 )
								ret := 0.498246
				if( MFI > 33.8044 )
					if( smoothK_k <= 52.9999 )
						if( rsi1 <= 53.9988 )
							if( Typical_Price <= 94.6643 )
								ret := -0.045262
							if( Typical_Price > 94.6643 )
								ret := -0.284530
						if( rsi1 > 53.9988 )
							if( d <= 53.8519 )
								ret := 0.487252
							if( d > 53.8519 )
								ret := 0.221359
					if( smoothK_k > 52.9999 )
						if( d_k <= -3.96192 )
							if( rsi1 <= 61.752 )
								ret := 0.165981
							if( rsi1 > 61.752 )
								ret := 0.601045
						if( d_k > -3.96192 )
							if( rsi1 <= 51.8385 )
								ret := -0.019825
							if( rsi1 > 51.8385 )
								ret := 0.279219
			if( Positive_Money_Flow > 2397.1 )
				if( Raw_Money_Flow <= 56044.8 )
					if( rsi1 <= 47.1846 )
						if( Positive_Money_Flow_Sum <= 451488 )
							if( Positive_Money_Flow_Sum <= 342250 )
								ret := -0.144216
							if( Positive_Money_Flow_Sum > 342250 )
								ret := -0.575540
						if( Positive_Money_Flow_Sum > 451488 )
							if( Typical_Price <= 80.9959 )
								ret := 0.367521
							if( Typical_Price > 80.9959 )
								ret := -0.212766
					if( rsi1 > 47.1846 )
						if( rsi1 <= 59.637 )
							if( Money_Flow_Ratio <= 1.70115 )
								ret := 0.169451
							if( Money_Flow_Ratio > 1.70115 )
								ret := -0.180822
						if( rsi1 > 59.637 )
							if( MFI_High <= -19.5218 )
								ret := 0.524934
							if( MFI_High > -19.5218 )
								ret := 0.185507
				if( Raw_Money_Flow > 56044.8 )
					if( Negative_Money_Flow_Sum <= 638784 )
						if( d <= 71.8899 )
							if( Positive_Money_Flow_Sum <= 2.16276e+06 )
								ret := -0.181976
							if( Positive_Money_Flow_Sum > 2.16276e+06 )
								ret := -0.634615
						if( d > 71.8899 )
							if( smoothK_k <= 63.8207 )
								ret := 0.270992
							if( smoothK_k > 63.8207 )
								ret := 0.012072
					if( Negative_Money_Flow_Sum > 638784 )
						if( rsi1 <= 60.5507 )
							if( MFI <= 49.8977 )
								ret := -0.013342
							if( MFI > 49.8977 )
								ret := -0.288312
						if( rsi1 > 60.5507 )
							if( Money_Flow_Ratio <= 1.27872 )
								ret := 0.612827
							if( Money_Flow_Ratio > 1.27872 )
								ret := 0.192995
		if( k > 74.1029 )
			if( smoothK_k <= 84.4134 )
				if( Negative_Money_Flow <= 1496.87 )
					if( smoothD_d <= 82.3254 )
						if( rsi1 <= 57.4216 )
							if( MFI_Low <= 13.338 )
								ret := 0.151199
							if( MFI_Low > 13.338 )
								ret := -0.051143
						if( rsi1 > 57.4216 )
							if( MFI_High <= -18.5014 )
								ret := 0.489758
							if( MFI_High > -18.5014 )
								ret := 0.150714
					if( smoothD_d > 82.3254 )
						if( rsi1 <= 59.3349 )
							if( MFI_Low <= 10.1426 )
								ret := 0.371429
							if( MFI_Low > 10.1426 )
								ret := 0.016349
						if( rsi1 > 59.3349 )
							if( d_k <= 3.95348 )
								ret := 0.311765
							if( d_k > 3.95348 )
								ret := 0.515551
				if( Negative_Money_Flow > 1496.87 )
					if( Typical_Price <= 101.548 )
						if( rsi1 <= 50.474 )
							if( Money_Flow_Ratio <= 0.510476 )
								ret := 0.269231
							if( Money_Flow_Ratio > 0.510476 )
								ret := 0.039903
						if( rsi1 > 50.474 )
							if( Positive_Money_Flow_Sum <= 1.49264e+06 )
								ret := 0.450469
							if( Positive_Money_Flow_Sum > 1.49264e+06 )
								ret := 0.129274
					if( Typical_Price > 101.548 )
						if( MFI_Low <= 6.74208 )
							if( d_k <= -12.6659 )
								ret := 0.549020
							if( d_k > -12.6659 )
								ret := 0.808989 // buy
						if( MFI_Low > 6.74208 )
							if( rsi1 <= 45.0954 )
								ret := -0.373016
							if( rsi1 > 45.0954 )
								ret := 0.508634
			if( smoothK_k > 84.4134 )
				if( Typical_Price <= 93.1732 )
					if( rsi1 <= 73.0871 )
						if( MFI_High <= -32.4211 )
							if( rsi1 <= 56.2858 )
								ret := 0.227775
							if( rsi1 > 56.2858 )
								ret := 0.534698
						if( MFI_High > -32.4211 )
							if( Positive_Money_Flow_Sum <= 2.12908e+06 )
								ret := 0.216062
							if( Positive_Money_Flow_Sum > 2.12908e+06 )
								ret := -0.012027
					if( rsi1 > 73.0871 )
						if( MFI_High <= -9.406 )
							if( rsi1 <= 77.2743 )
								ret := 0.608054
							if( rsi1 > 77.2743 )
								ret := 0.740499 // buy
						if( MFI_High > -9.406 )
							if( Negative_Money_Flow_Sum <= 119761 )
								ret := 0.546939
							if( Negative_Money_Flow_Sum > 119761 )
								ret := 0.293646
				if( Typical_Price > 93.1732 )
					if( Negative_Money_Flow <= 319.926 )
						if( Typical_Price <= 108.366 )
							if( rsi1 <= 75.0008 )
								ret := 0.298827
							if( rsi1 > 75.0008 )
								ret := 0.674716
						if( Typical_Price > 108.366 )
							if( Typical_Price <= 137.743 )
								ret := 0.587702
							if( Typical_Price > 137.743 )
								ret := 0.366057
					if( Negative_Money_Flow > 319.926 )
						if( Typical_Price <= 165.847 )
							if( rsi1 <= 69.007 )
								ret := 0.468884
							if( rsi1 > 69.007 )
								ret := 0.769231 // buy
						if( Typical_Price > 165.847 )
							if( rsi1 <= 55.2826 )
								ret := -0.400000
							if( rsi1 > 55.2826 )
								ret := 0.333333
	
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
float op_operation = decision_tree_0_AAVEUSDT_15Min_9cdfaa25(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


