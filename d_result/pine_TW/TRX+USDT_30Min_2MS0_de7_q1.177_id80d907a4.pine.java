//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: TRXUSDT_30Min_2MS0_80d907a4 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_30Min_2MS0_80d907a4", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_30Min_80d907a4(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, d_k, d, rsi1, k, smoothD_d, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( d_k <= -0.198521 )
		if( smoothK_k <= 19.1811 )
			if( rsi1 <= 35.8124 )
				if( Typical_Price <= 0.050127 )
					if( MFI_High <= -53.0145 )
						if( rsi1 <= 20.264 )
							if( Negative_Money_Flow_Sum <= 1.80282e+07 )
								ret := -0.448276
							if( Negative_Money_Flow_Sum > 1.80282e+07 )
								ret := 0.583333
						if( rsi1 > 20.264 )
							if( MFI_Low <= -5.55648 )
								ret := 0.815789 // buy
							if( MFI_Low > -5.55648 )
								ret := 0.349794
					if( MFI_High > -53.0145 )
						if( Raw_Money_Flow <= 2.86279e+06 )
							if( Positive_Money_Flow_Sum <= 4.83399e+06 )
								ret := -0.218182
							if( Positive_Money_Flow_Sum > 4.83399e+06 )
								ret := 0.234568
						if( Raw_Money_Flow > 2.86279e+06 )
							if( Negative_Money_Flow_Sum <= 3.85346e+07 )
								ret := -0.971429 // sell
							if( Negative_Money_Flow_Sum > 3.85346e+07 )
								ret := 0.333333
				if( Typical_Price > 0.050127 )
					if( d_k <= -4.12983 )
						if( rsi1 <= 24.3469 )
							if( Raw_Money_Flow <= 2.64933e+06 )
								ret := -0.660079
							if( Raw_Money_Flow > 2.64933e+06 )
								ret := -0.259615
						if( rsi1 > 24.3469 )
							if( MFI_High <= -46.6397 )
								ret := 0.013834
							if( MFI_High > -46.6397 )
								ret := -0.411940
					if( d_k > -4.12983 )
						if( Typical_Price <= 0.066645 )
							if( rsi1 <= 25.4128 )
								ret := -0.600000
							if( rsi1 > 25.4128 )
								ret := -0.331407
						if( Typical_Price > 0.066645 )
							if( rsi1 <= 24.8778 )
								ret := -0.743073 // sell
							if( rsi1 > 24.8778 )
								ret := -0.476977
			if( rsi1 > 35.8124 )
				if( Negative_Money_Flow <= 2.34672e+06 )
					if( Negative_Money_Flow_Sum <= 3.27987e+06 )
						if( rsi1 <= 49.3873 )
							if( Money_Flow_Ratio <= 2.4452 )
								ret := -0.195652
							if( Money_Flow_Ratio > 2.4452 )
								ret := -0.642857
						if( rsi1 > 49.3873 )
							if( MFI_High <= 5.08558 )
								ret := 0.014778
							if( MFI_High > 5.08558 )
								ret := -0.323529
					if( Negative_Money_Flow_Sum > 3.27987e+06 )
						if( rsi1 <= 52.8742 )
							if( MFI_High <= -43.7364 )
								ret := 0.279261
							if( MFI_High > -43.7364 )
								ret := -0.079192
						if( rsi1 > 52.8742 )
							if( smoothD_d <= 3.99962 )
								ret := 0.078788
							if( smoothD_d > 3.99962 )
								ret := 0.527415
				if( Negative_Money_Flow > 2.34672e+06 )
					if( smoothK_k <= 2.47169 )
						if( Negative_Money_Flow <= 3.21632e+06 )
							if( Negative_Money_Flow_Sum <= 1.86909e+07 )
								ret := -0.111111
							if( Negative_Money_Flow_Sum > 1.86909e+07 )
								ret := 0.800000 // buy
						if( Negative_Money_Flow > 3.21632e+06 )
							if( rsi1 <= 43.6964 )
								ret := -0.764706 // sell
							if( rsi1 > 43.6964 )
								ret := -0.187500
					if( smoothK_k > 2.47169 )
						if( k <= 14.3999 )
							if( Typical_Price <= 0.101115 )
								ret := 0.456621
							if( Typical_Price > 0.101115 )
								ret := 0.041667
						if( k > 14.3999 )
							if( MFI_Low <= 13.8317 )
								ret := 0.275862
							if( MFI_Low > 13.8317 )
								ret := 0.584127
		if( smoothK_k > 19.1811 )
			if( Positive_Money_Flow_Sum <= 5.08529e+06 )
				if( smoothK_k <= 44.1524 )
					if( Negative_Money_Flow <= 449784 )
						if( Negative_Money_Flow_Sum <= 3.86324e+06 )
							if( rsi1 <= 39.989 )
								ret := -0.417910
							if( rsi1 > 39.989 )
								ret := -0.072190
						if( Negative_Money_Flow_Sum > 3.86324e+06 )
							if( d_k <= -4.36749 )
								ret := 0.178571
							if( d_k > -4.36749 )
								ret := -0.109726
					if( Negative_Money_Flow > 449784 )
						if( rsi1 <= 25.3066 )
							if( Negative_Money_Flow_Sum <= 5.82907e+07 )
								ret := -0.493878
							if( Negative_Money_Flow_Sum > 5.82907e+07 )
								ret := 1.000000 // buy
						if( rsi1 > 25.3066 )
							if( Typical_Price <= 0.081662 )
								ret := 0.500000
							if( Typical_Price > 0.081662 )
								ret := -0.119883
				if( smoothK_k > 44.1524 )
					if( rsi1 <= 39.6632 )
						if( Raw_Money_Flow <= 2.17716e+06 )
							if( Typical_Price <= 0.059934 )
								ret := 0.243902
							if( Typical_Price > 0.059934 )
								ret := -0.192025
						if( Raw_Money_Flow > 2.17716e+06 )
							if( d <= 47.4025 )
								ret := 0.101449
							if( d > 47.4025 )
								ret := 0.746269 // buy
					if( rsi1 > 39.6632 )
						if( Negative_Money_Flow <= 454750 )
							if( rsi1 <= 60.0216 )
								ret := 0.163930
							if( rsi1 > 60.0216 )
								ret := 0.356708
						if( Negative_Money_Flow > 454750 )
							if( MFI <= 28.1317 )
								ret := 0.703297 // buy
							if( MFI > 28.1317 )
								ret := 0.475397
			if( Positive_Money_Flow_Sum > 5.08529e+06 )
				if( Typical_Price <= 0.04283 )
					if( MFI_High <= -1.26368 )
						if( MFI_Low <= 18.4256 )
							if( Positive_Money_Flow_Sum <= 1.16075e+07 )
								ret := 0.490099
							if( Positive_Money_Flow_Sum > 1.16075e+07 )
								ret := 0.156522
						if( MFI_Low > 18.4256 )
							if( Negative_Money_Flow_Sum <= 2.32163e+07 )
								ret := 0.127224
							if( Negative_Money_Flow_Sum > 2.32163e+07 )
								ret := -0.666667
					if( MFI_High > -1.26368 )
						if( k <= 97.5671 )
							if( rsi1 <= 70.2733 )
								ret := -0.083333
							if( rsi1 > 70.2733 )
								ret := -0.658537
						if( k > 97.5671 )
							if( Money_Flow_Ratio <= 5.91448 )
								ret := 0.147059
							if( Money_Flow_Ratio > 5.91448 )
								ret := -0.538462
				if( Typical_Price > 0.04283 )
					if( rsi1 <= 42.4343 )
						if( d_k <= -6.92219 )
							if( rsi1 <= 24.4263 )
								ret := -0.326531
							if( rsi1 > 24.4263 )
								ret := 0.421315
						if( d_k > -6.92219 )
							if( rsi1 <= 36.6398 )
								ret := -0.405464
							if( rsi1 > 36.6398 )
								ret := -0.045455
					if( rsi1 > 42.4343 )
						if( rsi1 <= 55.4624 )
							if( MFI <= 44.7221 )
								ret := 0.627156
							if( MFI > 44.7221 )
								ret := 0.198907
						if( rsi1 > 55.4624 )
							if( Raw_Money_Flow <= 715078 )
								ret := 0.463182
							if( Raw_Money_Flow > 715078 )
								ret := 0.706496 // buy
	if( d_k > -0.198521 )
		if( k <= 69.8733 )
			if( rsi1 <= 50.7904 )
				if( Raw_Money_Flow <= 734650 )
					if( rsi1 <= 37.1363 )
						if( Typical_Price <= 0.033756 )
							if( Negative_Money_Flow_Sum <= 5.42942e+06 )
								ret := -0.091286
							if( Negative_Money_Flow_Sum > 5.42942e+06 )
								ret := 0.328502
						if( Typical_Price > 0.033756 )
							if( Typical_Price <= 0.111988 )
								ret := -0.638192
							if( Typical_Price > 0.111988 )
								ret := -0.266564
					if( rsi1 > 37.1363 )
						if( MFI_Low <= 24.2957 )
							if( Typical_Price <= 0.030043 )
								ret := 0.258621
							if( Typical_Price > 0.030043 )
								ret := -0.094609
						if( MFI_Low > 24.2957 )
							if( Positive_Money_Flow <= 495588 )
								ret := -0.296747
							if( Positive_Money_Flow > 495588 )
								ret := -0.572857
				if( Raw_Money_Flow > 734650 )
					if( Positive_Money_Flow_Sum <= 4.63039e+06 )
						if( Typical_Price <= 0.044661 )
							if( rsi1 <= 42.3755 )
								ret := 0.277251
							if( rsi1 > 42.3755 )
								ret := -0.283784
						if( Typical_Price > 0.044661 )
							if( k <= 11.1267 )
								ret := -0.652742
							if( k > 11.1267 )
								ret := -0.333333
					if( Positive_Money_Flow_Sum > 4.63039e+06 )
						if( rsi1 <= 40.6623 )
							if( Typical_Price <= 0.037316 )
								ret := 0.015789
							if( Typical_Price > 0.037316 )
								ret := -0.770956 // sell
						if( rsi1 > 40.6623 )
							if( Typical_Price <= 0.046086 )
								ret := 0.023857
							if( Typical_Price > 0.046086 )
								ret := -0.584681
			if( rsi1 > 50.7904 )
				if( Negative_Money_Flow <= 67961.1 )
					if( d_k <= 7.0356 )
						if( Positive_Money_Flow_Sum <= 9.28271e+07 )
							if( MFI_Low <= 35.1535 )
								ret := 0.217466
							if( MFI_Low > 35.1535 )
								ret := -0.066755
						if( Positive_Money_Flow_Sum > 9.28271e+07 )
							if( Negative_Money_Flow_Sum <= 1.37321e+08 )
								ret := 0.555556
							if( Negative_Money_Flow_Sum > 1.37321e+08 )
								ret := -1.000000 // sell
					if( d_k > 7.0356 )
						if( Positive_Money_Flow <= 1.45333e+06 )
							if( Typical_Price <= 0.073353 )
								ret := -0.289174
							if( Typical_Price > 0.073353 )
								ret := -0.023979
						if( Positive_Money_Flow > 1.45333e+06 )
							if( rsi1 <= 67.2672 )
								ret := -0.685877
							if( rsi1 > 67.2672 )
								ret := -0.300830
				if( Negative_Money_Flow > 67961.1 )
					if( rsi1 <= 61.884 )
						if( MFI_Low <= 49.7358 )
							if( MFI_High <= -27.9952 )
								ret := 0.286313
							if( MFI_High > -27.9952 )
								ret := -0.049869
						if( MFI_Low > 49.7358 )
							if( Positive_Money_Flow_Sum <= 1.49812e+07 )
								ret := -0.121339
							if( Positive_Money_Flow_Sum > 1.49812e+07 )
								ret := -0.630885
					if( rsi1 > 61.884 )
						if( d_k <= 9.8878 )
							if( rsi1 <= 69.9355 )
								ret := 0.319337
							if( rsi1 > 69.9355 )
								ret := 0.638070
						if( d_k > 9.8878 )
							if( MFI_Low <= 56.3277 )
								ret := 0.097065
							if( MFI_Low > 56.3277 )
								ret := -0.215613
		if( k > 69.8733 )
			if( d_k <= 4.12399 )
				if( rsi1 <= 57.2884 )
					if( k <= 91.0701 )
						if( Positive_Money_Flow_Sum <= 3.34479e+06 )
							if( rsi1 <= 39.2548 )
								ret := -0.243902
							if( rsi1 > 39.2548 )
								ret := 0.166078
						if( Positive_Money_Flow_Sum > 3.34479e+06 )
							if( Typical_Price <= 0.078007 )
								ret := -0.272873
							if( Typical_Price > 0.078007 )
								ret := -0.051724
					if( k > 91.0701 )
						if( Negative_Money_Flow_Sum <= 8.46222e+06 )
							if( Negative_Money_Flow <= 251220 )
								ret := -0.139665
							if( Negative_Money_Flow > 251220 )
								ret := 0.123711
						if( Negative_Money_Flow_Sum > 8.46222e+06 )
							if( Negative_Money_Flow_Sum <= 1.59039e+08 )
								ret := 0.195822
							if( Negative_Money_Flow_Sum > 1.59039e+08 )
								ret := -0.777778 // sell
				if( rsi1 > 57.2884 )
					if( Positive_Money_Flow_Sum <= 7.23522e+06 )
						if( Typical_Price <= 0.033815 )
							if( Positive_Money_Flow <= 167302 )
								ret := 0.166667
							if( Positive_Money_Flow > 167302 )
								ret := -0.213115
						if( Typical_Price > 0.033815 )
							if( Positive_Money_Flow <= 1.22368e+06 )
								ret := 0.322765
							if( Positive_Money_Flow > 1.22368e+06 )
								ret := 0.603774
					if( Positive_Money_Flow_Sum > 7.23522e+06 )
						if( smoothK_k <= 94.169 )
							if( rsi1 <= 69.2661 )
								ret := 0.273159
							if( rsi1 > 69.2661 )
								ret := 0.490379
						if( smoothK_k > 94.169 )
							if( Typical_Price <= 0.053234 )
								ret := 0.239130
							if( Typical_Price > 0.053234 )
								ret := 0.684766
			if( d_k > 4.12399 )
				if( Positive_Money_Flow_Sum <= 1.59261e+07 )
					if( Typical_Price <= 0.070202 )
						if( Positive_Money_Flow_Sum <= 2.11091e+06 )
							if( Money_Flow_Ratio <= 1.67521 )
								ret := 0.360544
							if( Money_Flow_Ratio > 1.67521 )
								ret := -0.181818
						if( Positive_Money_Flow_Sum > 2.11091e+06 )
							if( d <= 91.252 )
								ret := -0.155160
							if( d > 91.252 )
								ret := 0.104208
					if( Typical_Price > 0.070202 )
						if( rsi1 <= 65.3126 )
							if( Positive_Money_Flow <= 1.84774e+06 )
								ret := 0.047399
							if( Positive_Money_Flow > 1.84774e+06 )
								ret := -0.509434
						if( rsi1 > 65.3126 )
							if( Typical_Price <= 0.10069 )
								ret := 0.525568
							if( Typical_Price > 0.10069 )
								ret := 0.312821
				if( Positive_Money_Flow_Sum > 1.59261e+07 )
					if( rsi1 <= 71.5371 )
						if( MFI_Low <= 52.9742 )
							if( rsi1 <= 63.2727 )
								ret := -0.403338
							if( rsi1 > 63.2727 )
								ret := -0.027211
						if( MFI_Low > 52.9742 )
							if( Negative_Money_Flow_Sum <= 1.48792e+07 )
								ret := -0.723343 // sell
							if( Negative_Money_Flow_Sum > 1.48792e+07 )
								ret := -0.387500
					if( rsi1 > 71.5371 )
						if( Money_Flow_Ratio <= 10.3088 )
							if( k <= 89.8772 )
								ret := 0.085034
							if( k > 89.8772 )
								ret := 0.588235
						if( Money_Flow_Ratio > 10.3088 )
							if( smoothD_d <= 90.8633 )
								ret := -0.741379 // sell
							if( smoothD_d > 90.8633 )
								ret := 0.428571
	
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
float op_operation = decision_tree_0_TRXUSDT_30Min_80d907a4(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, d_k, d, rsi1, k, smoothD_d, smoothK_k)

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


