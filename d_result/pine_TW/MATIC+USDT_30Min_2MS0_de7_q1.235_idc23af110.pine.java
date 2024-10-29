//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: MATICUSDT_30Min_2MS0_c23af110 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MATICUSDT_30Min_2MS0_c23af110", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MATICUSDT_30Min_c23af110(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( rsi1 <= 52.2098 )
		if( d_k <= -3.53388 )
			if( d_k <= -10.3824 )
				if( Raw_Money_Flow <= 1.16372e+06 )
					if( Typical_Price <= 0.017615 )
						if( rsi1 <= 38.2745 )
							if( smoothK_k <= 61.3832 )
								ret := 0.145161
							if( smoothK_k > 61.3832 )
								ret := -0.451613
						if( rsi1 > 38.2745 )
							if( Positive_Money_Flow_Sum <= 188875 )
								ret := 0.048780
							if( Positive_Money_Flow_Sum > 188875 )
								ret := 0.730000 // buy
					if( Typical_Price > 0.017615 )
						if( rsi1 <= 38.0303 )
							if( Typical_Price <= 0.040383 )
								ret := 0.190909
							if( Typical_Price > 0.040383 )
								ret := -0.269750
						if( rsi1 > 38.0303 )
							if( Positive_Money_Flow_Sum <= 171913 )
								ret := -0.522727
							if( Positive_Money_Flow_Sum > 171913 )
								ret := 0.143085
				if( Raw_Money_Flow > 1.16372e+06 )
					if( rsi1 <= 28.715 )
						if( Negative_Money_Flow <= 5.67508e+06 )
							if( rsi1 <= 25.422 )
								ret := -0.595420
							if( rsi1 > 25.422 )
								ret := -0.133333
						if( Negative_Money_Flow > 5.67508e+06 )
							if( MFI_High <= -54.9323 )
								ret := 0.444444
							if( MFI_High > -54.9323 )
								ret := -0.750000 // sell
					if( rsi1 > 28.715 )
						if( MFI_High <= -40.9639 )
							if( Negative_Money_Flow <= 4.92596e+06 )
								ret := 0.551889
							if( Negative_Money_Flow > 4.92596e+06 )
								ret := 0.769406 // buy
						if( MFI_High > -40.9639 )
							if( rsi1 <= 44.6529 )
								ret := -0.225610
							if( rsi1 > 44.6529 )
								ret := 0.289256
			if( d_k > -10.3824 )
				if( rsi1 <= 37.2454 )
					if( MFI <= 35.4275 )
						if( Typical_Price <= 0.357787 )
							if( Positive_Money_Flow_Sum <= 207619 )
								ret := -0.171642
							if( Positive_Money_Flow_Sum > 207619 )
								ret := 0.192878
						if( Typical_Price > 0.357787 )
							if( MFI_Low <= 2.90031 )
								ret := -0.090649
							if( MFI_Low > 2.90031 )
								ret := -0.341991
					if( MFI > 35.4275 )
						if( Negative_Money_Flow_Sum <= 317497 )
							if( MFI_High <= -41.9564 )
								ret := -0.500000
							if( MFI_High > -41.9564 )
								ret := 0.769231 // buy
						if( Negative_Money_Flow_Sum > 317497 )
							if( rsi1 <= 35.0788 )
								ret := -0.660615
							if( rsi1 > 35.0788 )
								ret := -0.414286
				if( rsi1 > 37.2454 )
					if( MFI_Low <= 30.6515 )
						if( Raw_Money_Flow <= 1.36398e+06 )
							if( rsi1 <= 47.6011 )
								ret := 0.055556
							if( rsi1 > 47.6011 )
								ret := 0.262321
						if( Raw_Money_Flow > 1.36398e+06 )
							if( Typical_Price <= 1.66887 )
								ret := 0.401479
							if( Typical_Price > 1.66887 )
								ret := 0.004049
					if( MFI_Low > 30.6515 )
						if( Negative_Money_Flow <= 3.3792e+06 )
							if( Money_Flow_Ratio <= 1.80053 )
								ret := -0.101070
							if( Money_Flow_Ratio > 1.80053 )
								ret := -0.479290
						if( Negative_Money_Flow > 3.3792e+06 )
							if( smoothK_k <= 76.9343 )
								ret := 0.488372
							if( smoothK_k > 76.9343 )
								ret := -1.000000 // sell
		if( d_k > -3.53388 )
			if( Positive_Money_Flow_Sum <= 2.45245e+06 )
				if( rsi1 <= 21.8128 )
					if( Typical_Price <= 0.019697 )
						if( Raw_Money_Flow <= 124437 )
							if( MFI_High <= -55.101 )
								ret := -0.356589
							if( MFI_High > -55.101 )
								ret := 0.192308
						if( Raw_Money_Flow > 124437 )
							if( MFI_High <= -58.93 )
								ret := 0.753086 // buy
							if( MFI_High > -58.93 )
								ret := 0.000000
					if( Typical_Price > 0.019697 )
						if( d_k <= 6.0162 )
							if( rsi1 <= 11.9695 )
								ret := -0.827957 // sell
							if( rsi1 > 11.9695 )
								ret := -0.516575
						if( d_k > 6.0162 )
							if( Typical_Price <= 0.109796 )
								ret := 0.526316
							if( Typical_Price > 0.109796 )
								ret := -0.295455
				if( rsi1 > 21.8128 )
					if( Typical_Price <= 0.038435 )
						if( Positive_Money_Flow_Sum <= 227693 )
							if( MFI_Low <= 21.6131 )
								ret := -0.102389
							if( MFI_Low > 21.6131 )
								ret := 0.240458
						if( Positive_Money_Flow_Sum > 227693 )
							if( Negative_Money_Flow <= 292640 )
								ret := 0.128629
							if( Negative_Money_Flow > 292640 )
								ret := 0.512195
					if( Typical_Price > 0.038435 )
						if( rsi1 <= 36.3935 )
							if( Negative_Money_Flow_Sum <= 2.0533e+07 )
								ret := -0.258578
							if( Negative_Money_Flow_Sum > 2.0533e+07 )
								ret := 1.000000 // buy
						if( rsi1 > 36.3935 )
							if( Typical_Price <= 0.166684 )
								ret := -0.388489
							if( Typical_Price > 0.166684 )
								ret := 0.018307
			if( Positive_Money_Flow_Sum > 2.45245e+06 )
				if( rsi1 <= 38.9825 )
					if( Positive_Money_Flow_Sum <= 4.98447e+06 )
						if( Typical_Price <= 0.108833 )
							if( Positive_Money_Flow_Sum <= 4.7046e+06 )
								ret := 0.636364
							if( Positive_Money_Flow_Sum > 4.7046e+06 )
								ret := -0.714286 // sell
						if( Typical_Price > 0.108833 )
							if( smoothK_k <= 23.6575 )
								ret := -0.582766
							if( smoothK_k > 23.6575 )
								ret := -0.368336
					if( Positive_Money_Flow_Sum > 4.98447e+06 )
						if( k <= 80.0281 )
							if( Positive_Money_Flow <= 1.34397e+06 )
								ret := -0.683919
							if( Positive_Money_Flow > 1.34397e+06 )
								ret := -0.782452 // sell
						if( k > 80.0281 )
							if( Raw_Money_Flow <= 5.43804e+06 )
								ret := -0.474286
							if( Raw_Money_Flow > 5.43804e+06 )
								ret := 0.066667
				if( rsi1 > 38.9825 )
					if( Money_Flow_Ratio <= 0.849162 )
						if( Positive_Money_Flow <= 4.22214e+06 )
							if( MFI_Low <= 14.5743 )
								ret := 0.162500
							if( MFI_Low > 14.5743 )
								ret := -0.099644
						if( Positive_Money_Flow > 4.22214e+06 )
							if( smoothD_d <= 94.7409 )
								ret := -0.509217
							if( smoothD_d > 94.7409 )
								ret := 0.588235
					if( Money_Flow_Ratio > 0.849162 )
						if( Raw_Money_Flow <= 1.31002e+06 )
							if( d_k <= 6.37219 )
								ret := -0.194369
							if( d_k > 6.37219 )
								ret := -0.415069
						if( Raw_Money_Flow > 1.31002e+06 )
							if( MFI_High <= -23.3979 )
								ret := -0.392371
							if( MFI_High > -23.3979 )
								ret := -0.658429
	if( rsi1 > 52.2098 )
		if( MFI <= 55.3007 )
			if( Raw_Money_Flow <= 494466 )
				if( Typical_Price <= 0.10597 )
					if( Typical_Price <= 0.020089 )
						if( rsi1 <= 62.517 )
							if( Raw_Money_Flow <= 225031 )
								ret := 0.258156
							if( Raw_Money_Flow > 225031 )
								ret := -0.875000 // sell
						if( rsi1 > 62.517 )
							if( d_k <= 0.544885 )
								ret := -0.333333
							if( d_k > 0.544885 )
								ret := 0.015152
					if( Typical_Price > 0.020089 )
						if( Raw_Money_Flow <= 109757 )
							if( smoothD_d <= 46.8518 )
								ret := -0.187500
							if( smoothD_d > 46.8518 )
								ret := -0.621212
						if( Raw_Money_Flow > 109757 )
							if( Raw_Money_Flow <= 125080 )
								ret := 0.600000
							if( Raw_Money_Flow > 125080 )
								ret := -0.035519
				if( Typical_Price > 0.10597 )
					if( k <= 41.6193 )
						if( Money_Flow_Ratio <= 0.90792 )
							if( Typical_Price <= 0.506562 )
								ret := 0.666667
							if( Typical_Price > 0.506562 )
								ret := 0.186667
						if( Money_Flow_Ratio > 0.90792 )
							if( Raw_Money_Flow <= 134332 )
								ret := -0.500000
							if( Raw_Money_Flow > 134332 )
								ret := -0.011364
					if( k > 41.6193 )
						if( Typical_Price <= 0.495606 )
							if( Negative_Money_Flow_Sum <= 1.83041e+06 )
								ret := 0.307692
							if( Negative_Money_Flow_Sum > 1.83041e+06 )
								ret := 0.703791 // buy
						if( Typical_Price > 0.495606 )
							if( Negative_Money_Flow <= 335954 )
								ret := 0.199293
							if( Negative_Money_Flow > 335954 )
								ret := 0.378238
			if( Raw_Money_Flow > 494466 )
				if( rsi1 <= 58.2749 )
					if( d_k <= -2.02156 )
						if( MFI_Low <= 20.3491 )
							if( Raw_Money_Flow <= 1.45849e+06 )
								ret := 0.577778
							if( Raw_Money_Flow > 1.45849e+06 )
								ret := 0.814516 // buy
						if( MFI_Low > 20.3491 )
							if( MFI_Low <= 33.1713 )
								ret := 0.509510
							if( MFI_Low > 33.1713 )
								ret := 0.214634
					if( d_k > -2.02156 )
						if( MFI_High <= -34.744 )
							if( Negative_Money_Flow <= 683235 )
								ret := 0.214953
							if( Negative_Money_Flow > 683235 )
								ret := 0.580128
						if( MFI_High > -34.744 )
							if( d <= 59.0183 )
								ret := 0.248858
							if( d > 59.0183 )
								ret := -0.011204
				if( rsi1 > 58.2749 )
					if( Raw_Money_Flow <= 1.77153e+06 )
						if( d_k <= -2.07845 )
							if( k <= 99.9709 )
								ret := 0.707655 // buy
							if( k > 99.9709 )
								ret := 0.446009
						if( d_k > -2.07845 )
							if( rsi1 <= 65.9583 )
								ret := 0.419908
							if( rsi1 > 65.9583 )
								ret := 0.640816
					if( Raw_Money_Flow > 1.77153e+06 )
						if( d_k <= -2.79326 )
							if( MFI_High <= -26.385 )
								ret := 0.850041 // buy
							if( MFI_High > -26.385 )
								ret := 0.656250
						if( d_k > -2.79326 )
							if( Positive_Money_Flow_Sum <= 4.08345e+08 )
								ret := 0.621779
							if( Positive_Money_Flow_Sum > 4.08345e+08 )
								ret := -0.900000 // sell
		if( MFI > 55.3007 )
			if( d_k <= 6.67069 )
				if( Typical_Price <= 0.078833 )
					if( rsi1 <= 57.4758 )
						if( Negative_Money_Flow_Sum <= 415227 )
							if( Positive_Money_Flow_Sum <= 500645 )
								ret := 0.072165
							if( Positive_Money_Flow_Sum > 500645 )
								ret := 0.648148
						if( Negative_Money_Flow_Sum > 415227 )
							if( MFI_High <= -23.3793 )
								ret := -0.771429 // sell
							if( MFI_High > -23.3793 )
								ret := 0.075342
					if( rsi1 > 57.4758 )
						if( Positive_Money_Flow_Sum <= 440663 )
							if( Positive_Money_Flow_Sum <= 247535 )
								ret := -0.157895
							if( Positive_Money_Flow_Sum > 247535 )
								ret := 0.122407
						if( Positive_Money_Flow_Sum > 440663 )
							if( Negative_Money_Flow_Sum <= 306147 )
								ret := -0.408127
							if( Negative_Money_Flow_Sum > 306147 )
								ret := -0.086592
				if( Typical_Price > 0.078833 )
					if( k <= 88.6766 )
						if( Negative_Money_Flow <= 1.03333e+06 )
							if( rsi1 <= 65.7524 )
								ret := 0.039771
							if( rsi1 > 65.7524 )
								ret := 0.473228
						if( Negative_Money_Flow > 1.03333e+06 )
							if( rsi1 <= 61.36 )
								ret := 0.309322
							if( rsi1 > 61.36 )
								ret := 0.667129
					if( k > 88.6766 )
						if( rsi1 <= 70.9185 )
							if( Negative_Money_Flow <= 1.04005e+07 )
								ret := 0.399749
							if( Negative_Money_Flow > 1.04005e+07 )
								ret := -0.236842
						if( rsi1 > 70.9185 )
							if( Raw_Money_Flow <= 1.84903e+06 )
								ret := 0.618509
							if( Raw_Money_Flow > 1.84903e+06 )
								ret := 0.779379 // buy
			if( d_k > 6.67069 )
				if( Positive_Money_Flow <= 3.8404e+06 )
					if( smoothK_k <= 62.673 )
						if( Positive_Money_Flow <= 1.61878e+06 )
							if( Positive_Money_Flow_Sum <= 1.0207e+07 )
								ret := 0.067133
							if( Positive_Money_Flow_Sum > 1.0207e+07 )
								ret := -0.178115
						if( Positive_Money_Flow > 1.61878e+06 )
							if( rsi1 <= 71.715 )
								ret := -0.438257
							if( rsi1 > 71.715 )
								ret := 0.457143
					if( smoothK_k > 62.673 )
						if( Raw_Money_Flow <= 1.76577e+06 )
							if( rsi1 <= 65.3365 )
								ret := 0.053913
							if( rsi1 > 65.3365 )
								ret := 0.340292
						if( Raw_Money_Flow > 1.76577e+06 )
							if( MFI_Low <= 55.3694 )
								ret := -0.206128
							if( MFI_Low > 55.3694 )
								ret := 0.228723
				if( Positive_Money_Flow > 3.8404e+06 )
					if( smoothD_d <= 85.3686 )
						if( rsi1 <= 70.2653 )
							if( Typical_Price <= 1.1651 )
								ret := -0.615546
							if( Typical_Price > 1.1651 )
								ret := -0.805930 // sell
						if( rsi1 > 70.2653 )
							if( Positive_Money_Flow_Sum <= 4.64472e+07 )
								ret := 0.210526
							if( Positive_Money_Flow_Sum > 4.64472e+07 )
								ret := -0.478469
					if( smoothD_d > 85.3686 )
						if( Typical_Price <= 1.69848 )
							if( Raw_Money_Flow <= 5.00232e+06 )
								ret := -0.160000
							if( Raw_Money_Flow > 5.00232e+06 )
								ret := 0.359223
						if( Typical_Price > 1.69848 )
							if( Negative_Money_Flow_Sum <= 6.28352e+07 )
								ret := -0.764706 // sell
							if( Negative_Money_Flow_Sum > 6.28352e+07 )
								ret := 0.166667
	
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
float op_operation = decision_tree_0_MATICUSDT_30Min_c23af110(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


