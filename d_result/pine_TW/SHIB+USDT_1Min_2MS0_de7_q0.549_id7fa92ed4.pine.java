//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: SHIBUSDT_1Min_2MS0_7fa92ed4 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SHIBUSDT_1Min_2MS0_7fa92ed4", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SHIBUSDT_1Min_7fa92ed4(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, d_k, d, rsi1, k, smoothD_d, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( rsi1 <= 50.0024 )
		if( MFI_High <= -26.8003 )
			if( Negative_Money_Flow <= 100050 )
				if( rsi1 <= 35.6499 )
					if( MFI <= 43.3753 )
						if( Negative_Money_Flow_Sum <= 169994 )
							if( Positive_Money_Flow <= 0.69547 )
								ret := -0.091515
							if( Positive_Money_Flow > 0.69547 )
								ret := -0.208167
						if( Negative_Money_Flow_Sum > 169994 )
							if( MFI_Low <= -2.03789 )
								ret := 0.053796
							if( MFI_Low > -2.03789 )
								ret := -0.063527
					if( MFI > 43.3753 )
						if( Typical_Price <= 2.2e-05 )
							if( Positive_Money_Flow_Sum <= 679376 )
								ret := -0.291156
							if( Positive_Money_Flow_Sum > 679376 )
								ret := -0.665049
						if( Typical_Price > 2.2e-05 )
							if( Negative_Money_Flow_Sum <= 3.0315e+06 )
								ret := -0.060729
							if( Negative_Money_Flow_Sum > 3.0315e+06 )
								ret := 0.846154 // buy
				if( rsi1 > 35.6499 )
					if( Negative_Money_Flow <= 317.581 )
						if( Negative_Money_Flow_Sum <= 357366 )
							if( rsi1 <= 42.8555 )
								ret := -0.092839
							if( rsi1 > 42.8555 )
								ret := -0.021618
						if( Negative_Money_Flow_Sum > 357366 )
							if( Money_Flow_Ratio <= 0.460788 )
								ret := 0.115121
							if( Money_Flow_Ratio > 0.460788 )
								ret := 0.006368
					if( Negative_Money_Flow > 317.581 )
						if( MFI <= 20.3604 )
							if( smoothK_k <= 77.3602 )
								ret := 0.215488
							if( smoothK_k > 77.3602 )
								ret := -0.019449
						if( MFI > 20.3604 )
							if( rsi1 <= 43.1166 )
								ret := 0.007940
							if( rsi1 > 43.1166 )
								ret := 0.083886
			if( Negative_Money_Flow > 100050 )
				if( Money_Flow_Ratio <= 0.407222 )
					if( rsi1 <= 37.2519 )
						if( d_k <= -10.7477 )
							if( Typical_Price <= 2.4e-05 )
								ret := -0.347150
							if( Typical_Price > 2.4e-05 )
								ret := 0.224138
						if( d_k > -10.7477 )
							if( Raw_Money_Flow <= 505048 )
								ret := 0.157661
							if( Raw_Money_Flow > 505048 )
								ret := 0.341606
					if( rsi1 > 37.2519 )
						if( k <= 96.1308 )
							if( k <= 31.2481 )
								ret := 0.109589
							if( k > 31.2481 )
								ret := 0.449786
						if( k > 96.1308 )
							if( MFI <= 16.6214 )
								ret := 0.121951
							if( MFI > 16.6214 )
								ret := -0.422222
				if( Money_Flow_Ratio > 0.407222 )
					if( rsi1 <= 28.7273 )
						if( Typical_Price <= 2.2e-05 )
							if( rsi1 <= 23.9538 )
								ret := -0.651613
							if( rsi1 > 23.9538 )
								ret := -0.230435
						if( Typical_Price > 2.2e-05 )
							if( Negative_Money_Flow_Sum <= 2.38393e+06 )
								ret := -0.129353
							if( Negative_Money_Flow_Sum > 2.38393e+06 )
								ret := 0.337500
					if( rsi1 > 28.7273 )
						if( Positive_Money_Flow_Sum <= 5.07283e+06 )
							if( MFI <= 40.0402 )
								ret := 0.133205
							if( MFI > 40.0402 )
								ret := -0.017925
						if( Positive_Money_Flow_Sum > 5.07283e+06 )
							if( Typical_Price <= 2.6e-05 )
								ret := 1.000000 // buy
							if( Typical_Price > 2.6e-05 )
								ret := 0.142857
		if( MFI_High > -26.8003 )
			if( rsi1 <= 39.9882 )
				if( rsi1 <= 33.3313 )
					if( Positive_Money_Flow_Sum <= 161474 )
						if( smoothK_k <= 2.18499 )
							if( rsi1 <= 13.9555 )
								ret := -0.633333
							if( rsi1 > 13.9555 )
								ret := -0.206633
						if( smoothK_k > 2.18499 )
							if( rsi1 <= 31.5825 )
								ret := -0.413732
							if( rsi1 > 31.5825 )
								ret := -0.914894 // sell
					if( Positive_Money_Flow_Sum > 161474 )
						if( Typical_Price <= 2.4e-05 )
							if( d <= 49.137 )
								ret := -0.619608
							if( d > 49.137 )
								ret := 0.117647
						if( Typical_Price > 2.4e-05 )
							if( Raw_Money_Flow <= 5509.22 )
								ret := 0.500000
							if( Raw_Money_Flow > 5509.22 )
								ret := -0.088608
				if( rsi1 > 33.3313 )
					if( MFI <= 69.4468 )
						if( k <= 14.6977 )
							if( Negative_Money_Flow <= 6.54043 )
								ret := -0.201754
							if( Negative_Money_Flow > 6.54043 )
								ret := -0.039957
						if( k > 14.6977 )
							if( Positive_Money_Flow_Sum <= 402776 )
								ret := -0.221918
							if( Positive_Money_Flow_Sum > 402776 )
								ret := -0.502137
					if( MFI > 69.4468 )
						if( Positive_Money_Flow <= 920.089 )
							if( Raw_Money_Flow <= 18983.7 )
								ret := -0.241379
							if( Raw_Money_Flow > 18983.7 )
								ret := -0.502024
						if( Positive_Money_Flow > 920.089 )
							if( Positive_Money_Flow_Sum <= 115838 )
								ret := -0.378947
							if( Positive_Money_Flow_Sum > 115838 )
								ret := -0.704989 // sell
			if( rsi1 > 39.9882 )
				if( Positive_Money_Flow <= 2.76322 )
					if( Negative_Money_Flow <= 250274 )
						if( MFI_Low <= 47.2233 )
							if( Negative_Money_Flow_Sum <= 1.61193e+06 )
								ret := -0.006444
							if( Negative_Money_Flow_Sum > 1.61193e+06 )
								ret := 0.449275
						if( MFI_Low > 47.2233 )
							if( rsi1 <= 43.437 )
								ret := -0.202367
							if( rsi1 > 43.437 )
								ret := -0.047346
					if( Negative_Money_Flow > 250274 )
						if( Positive_Money_Flow_Sum <= 4.22099e+06 )
							if( Negative_Money_Flow <= 309020 )
								ret := -0.340909
							if( Negative_Money_Flow > 309020 )
								ret := -0.716216 // sell
						if( Positive_Money_Flow_Sum > 4.22099e+06 )
							if( Positive_Money_Flow_Sum <= 5.94292e+06 )
								ret := 0.560000
							if( Positive_Money_Flow_Sum > 5.94292e+06 )
								ret := -0.689655
				if( Positive_Money_Flow > 2.76322 )
					if( Money_Flow_Ratio <= 2.26561 )
						if( Negative_Money_Flow_Sum <= 985208 )
							if( Positive_Money_Flow_Sum <= 1.07017e+06 )
								ret := -0.135422
							if( Positive_Money_Flow_Sum > 1.07017e+06 )
								ret := -0.439759
						if( Negative_Money_Flow_Sum > 985208 )
							if( Positive_Money_Flow <= 390549 )
								ret := 0.288372
							if( Positive_Money_Flow > 390549 )
								ret := -0.574468
					if( Money_Flow_Ratio > 2.26561 )
						if( rsi1 <= 49.989 )
							if( Typical_Price <= 2.3e-05 )
								ret := -0.415924
							if( Typical_Price > 2.3e-05 )
								ret := 0.000000
						if( rsi1 > 49.989 )
							if( Money_Flow_Ratio <= 3.71112 )
								ret := -0.046455
							if( Money_Flow_Ratio > 3.71112 )
								ret := -0.223485
	if( rsi1 > 50.0024 )
		if( Money_Flow_Ratio <= 0.813286 )
			if( rsi1 <= 62.5007 )
				if( Negative_Money_Flow <= 0.714731 )
					if( Negative_Money_Flow_Sum <= 227491 )
						if( smoothK_k <= 78.3442 )
							if( Negative_Money_Flow_Sum <= 221448 )
								ret := 0.146135
							if( Negative_Money_Flow_Sum > 221448 )
								ret := -0.371795
						if( smoothK_k > 78.3442 )
							if( Positive_Money_Flow_Sum <= 122919 )
								ret := -0.003878
							if( Positive_Money_Flow_Sum > 122919 )
								ret := 0.276316
					if( Negative_Money_Flow_Sum > 227491 )
						if( smoothD_d <= 19.1153 )
							if( d_k <= -15.8248 )
								ret := -0.545455
							if( d_k > -15.8248 )
								ret := -0.022556
						if( smoothD_d > 19.1153 )
							if( smoothK_k <= 82.6063 )
								ret := 0.323476
							if( smoothK_k > 82.6063 )
								ret := 0.158722
				if( Negative_Money_Flow > 0.714731 )
					if( MFI_High <= -44.6203 )
						if( Negative_Money_Flow_Sum <= 204099 )
							if( Negative_Money_Flow <= 29421 )
								ret := 0.330428
							if( Negative_Money_Flow > 29421 )
								ret := 0.059574
						if( Negative_Money_Flow_Sum > 204099 )
							if( smoothK_k <= 87.4597 )
								ret := 0.581319
							if( smoothK_k > 87.4597 )
								ret := 0.358726
					if( MFI_High > -44.6203 )
						if( rsi1 <= 58.5276 )
							if( Negative_Money_Flow <= 4067.19 )
								ret := 0.350797
							if( Negative_Money_Flow > 4067.19 )
								ret := 0.171529
						if( rsi1 > 58.5276 )
							if( Typical_Price <= 2.2e-05 )
								ret := 0.415655
							if( Typical_Price > 2.2e-05 )
								ret := 0.107527
			if( rsi1 > 62.5007 )
				if( Negative_Money_Flow_Sum <= 709361 )
					if( rsi1 <= 66.6713 )
						if( k <= 99.991 )
							if( rsi1 <= 66.6651 )
								ret := 0.468331
							if( rsi1 > 66.6651 )
								ret := 0.202636
						if( k > 99.991 )
							if( MFI <= 16.361 )
								ret := 0.371429
							if( MFI > 16.361 )
								ret := 0.079295
					if( rsi1 > 66.6713 )
						if( Typical_Price <= 2.1e-05 )
							if( smoothK_k <= 96.9709 )
								ret := 0.603578
							if( smoothK_k > 96.9709 )
								ret := 0.371681
						if( Typical_Price > 2.1e-05 )
							if( Positive_Money_Flow_Sum <= 198561 )
								ret := -0.092308
							if( Positive_Money_Flow_Sum > 198561 )
								ret := 0.323077
				if( Negative_Money_Flow_Sum > 709361 )
					if( Typical_Price <= 1.4e-05 )
						if( MFI_Low <= 16.245 )
							ret := 0.538462
						if( MFI_Low > 16.245 )
							if( Raw_Money_Flow <= 54873.3 )
								ret := -0.900000 // sell
							if( Raw_Money_Flow > 54873.3 )
								ret := 0.125000
					if( Typical_Price > 1.4e-05 )
						if( smoothK_k <= 96.9584 )
							if( Typical_Price <= 2.3e-05 )
								ret := 0.786927 // buy
							if( Typical_Price > 2.3e-05 )
								ret := 0.207547
						if( smoothK_k > 96.9584 )
							if( MFI_High <= -42.3986 )
								ret := 0.570552
							if( MFI_High > -42.3986 )
								ret := 0.193548
		if( Money_Flow_Ratio > 0.813286 )
			if( rsi1 <= 60.0063 )
				if( Negative_Money_Flow <= 17.8102 )
					if( MFI <= 78.547 )
						if( Positive_Money_Flow <= 319441 )
							if( Negative_Money_Flow_Sum <= 92553.6 )
								ret := -0.035264
							if( Negative_Money_Flow_Sum > 92553.6 )
								ret := 0.068219
						if( Positive_Money_Flow > 319441 )
							if( d <= 93.1721 )
								ret := -0.414557
							if( d > 93.1721 )
								ret := 0.666667
					if( MFI > 78.547 )
						if( rsi1 <= 53.3008 )
							if( Typical_Price <= 2.2e-05 )
								ret := -0.549645
							if( Typical_Price > 2.2e-05 )
								ret := 0.173913
						if( rsi1 > 53.3008 )
							if( Raw_Money_Flow <= 140594 )
								ret := -0.100897
							if( Raw_Money_Flow > 140594 )
								ret := -0.382353
				if( Negative_Money_Flow > 17.8102 )
					if( MFI_Low <= 30.1727 )
						if( Typical_Price <= 1.3e-05 )
							ret := -0.727273 // sell
						if( Typical_Price > 1.3e-05 )
							if( Positive_Money_Flow <= 16400.1 )
								ret := 0.190458
							if( Positive_Money_Flow > 16400.1 )
								ret := 0.882353 // buy
					if( MFI_Low > 30.1727 )
						if( Positive_Money_Flow_Sum <= 75119.1 )
							if( d <= 71.7962 )
								ret := 0.261297
							if( d > 71.7962 )
								ret := 0.094005
						if( Positive_Money_Flow_Sum > 75119.1 )
							if( Negative_Money_Flow_Sum <= 1.12319e+06 )
								ret := 0.087182
							if( Negative_Money_Flow_Sum > 1.12319e+06 )
								ret := -0.067466
			if( rsi1 > 60.0063 )
				if( MFI <= 68.8433 )
					if( rsi1 <= 66.682 )
						if( Positive_Money_Flow_Sum <= 549847 )
							if( MFI_Low <= 40.6768 )
								ret := 0.159563
							if( MFI_Low > 40.6768 )
								ret := 0.074792
						if( Positive_Money_Flow_Sum > 549847 )
							if( Positive_Money_Flow_Sum <= 3.3209e+06 )
								ret := 0.257416
							if( Positive_Money_Flow_Sum > 3.3209e+06 )
								ret := -0.130769
					if( rsi1 > 66.682 )
						if( smoothK_k <= 92.5743 )
							if( MFI_Low <= 30.3068 )
								ret := 0.471569
							if( MFI_Low > 30.3068 )
								ret := 0.285251
						if( smoothK_k > 92.5743 )
							if( Typical_Price <= 2.2e-05 )
								ret := 0.194469
							if( Typical_Price > 2.2e-05 )
								ret := -0.019608
				if( MFI > 68.8433 )
					if( MFI_High <= 4.60105 )
						if( k <= 53.699 )
							if( Money_Flow_Ratio <= 3.26533 )
								ret := 0.219097
							if( Money_Flow_Ratio > 3.26533 )
								ret := 0.101829
						if( k > 53.699 )
							if( Raw_Money_Flow <= 566959 )
								ret := 0.084464
							if( Raw_Money_Flow > 566959 )
								ret := 0.334677
					if( MFI_High > 4.60105 )
						if( rsi1 <= 80.0218 )
							if( smoothK_k <= 59.2027 )
								ret := 0.074618
							if( smoothK_k > 59.2027 )
								ret := -0.069513
						if( rsi1 > 80.0218 )
							if( Positive_Money_Flow_Sum <= 849716 )
								ret := 0.167668
							if( Positive_Money_Flow_Sum > 849716 )
								ret := -0.023182
	
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
float op_operation = decision_tree_0_SHIBUSDT_1Min_7fa92ed4(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, d_k, d, rsi1, k, smoothD_d, smoothK_k)

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


