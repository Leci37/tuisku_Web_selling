//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: ETHUSDT_15Min_2MS0_4257999f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETHUSDT_15Min_2MS0_4257999f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETHUSDT_15Min_4257999f(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( k <= 51.8331 )
		if( Typical_Price <= 1894.74 )
			if( Money_Flow_Ratio <= 0.829436 )
				if( Positive_Money_Flow_Sum <= 4.51371e+07 )
					if( Typical_Price <= 1670.11 )
						if( rsi1 <= 40.3532 )
							if( Positive_Money_Flow_Sum <= 2.95593e+07 )
								ret := -0.095324
							if( Positive_Money_Flow_Sum > 2.95593e+07 )
								ret := 0.047022
						if( rsi1 > 40.3532 )
							if( Raw_Money_Flow <= 1.91777e+06 )
								ret := -0.069909
							if( Raw_Money_Flow > 1.91777e+06 )
								ret := 0.145950
					if( Typical_Price > 1670.11 )
						if( rsi1 <= 40.5782 )
							if( MFI_Low <= 10.1427 )
								ret := -0.156182
							if( MFI_Low > 10.1427 )
								ret := -0.422890
						if( rsi1 > 40.5782 )
							if( rsi1 <= 46.8279 )
								ret := -0.031780
							if( rsi1 > 46.8279 )
								ret := 0.246951
				if( Positive_Money_Flow_Sum > 4.51371e+07 )
					if( rsi1 <= 32.7984 )
						if( Raw_Money_Flow <= 1.34369e+07 )
							if( smoothD_d <= 10.6465 )
								ret := -0.025641
							if( smoothD_d > 10.6465 )
								ret := -0.271157
						if( Raw_Money_Flow > 1.34369e+07 )
							if( MFI_High <= -55.0316 )
								ret := 0.328979
							if( MFI_High > -55.0316 )
								ret := -0.042357
					if( rsi1 > 32.7984 )
						if( Money_Flow_Ratio <= 0.557558 )
							if( k <= 9.23258 )
								ret := 0.110656
							if( k > 9.23258 )
								ret := 0.372719
						if( Money_Flow_Ratio > 0.557558 )
							if( rsi1 <= 43.0202 )
								ret := 0.055404
							if( rsi1 > 43.0202 )
								ret := 0.247541
			if( Money_Flow_Ratio > 0.829436 )
				if( rsi1 <= 49.6557 )
					if( Negative_Money_Flow_Sum <= 1.56046e+08 )
						if( Typical_Price <= 1652.63 )
							if( d_k <= 12.051 )
								ret := -0.265447
							if( d_k > 12.051 )
								ret := -0.082865
						if( Typical_Price > 1652.63 )
							if( d_k <= 17.2412 )
								ret := -0.430135
							if( d_k > 17.2412 )
								ret := -0.145078
					if( Negative_Money_Flow_Sum > 1.56046e+08 )
						if( k <= 7.05689 )
							if( d_k <= 0.242073 )
								ret := -0.913043 // sell
							if( d_k > 0.242073 )
								ret := -0.194444
						if( k > 7.05689 )
							if( MFI_Low <= 30.8296 )
								ret := 0.589744
							if( MFI_Low > 30.8296 )
								ret := -0.229167
				if( rsi1 > 49.6557 )
					if( Raw_Money_Flow <= 8.27502e+06 )
						if( rsi1 <= 61.3938 )
							if( Money_Flow_Ratio <= 2.50559 )
								ret := -0.004486
							if( Money_Flow_Ratio > 2.50559 )
								ret := -0.233333
						if( rsi1 > 61.3938 )
							if( MFI <= 73.9987 )
								ret := 0.220000
							if( MFI > 73.9987 )
								ret := -0.015267
					if( Raw_Money_Flow > 8.27502e+06 )
						if( Negative_Money_Flow <= 8.47426e+06 )
							if( Money_Flow_Ratio <= 2.60719 )
								ret := -0.197868
							if( Money_Flow_Ratio > 2.60719 )
								ret := -0.444175
						if( Negative_Money_Flow > 8.47426e+06 )
							if( Negative_Money_Flow <= 1.40044e+07 )
								ret := 0.106416
							if( Negative_Money_Flow > 1.40044e+07 )
								ret := -0.155303
		if( Typical_Price > 1894.74 )
			if( rsi1 <= 42.5298 )
				if( MFI <= 36.5359 )
					if( d <= 23.5757 )
						if( Negative_Money_Flow_Sum <= 1.46781e+08 )
							if( d <= 11.2652 )
								ret := -0.649023
							if( d > 11.2652 )
								ret := -0.484081
						if( Negative_Money_Flow_Sum > 1.46781e+08 )
							if( rsi1 <= 21.1016 )
								ret := -0.622084
							if( rsi1 > 21.1016 )
								ret := -0.180055
					if( d > 23.5757 )
						if( Raw_Money_Flow <= 2.4054e+07 )
							if( rsi1 <= 35.4127 )
								ret := -0.496797
							if( rsi1 > 35.4127 )
								ret := 0.037037
						if( Raw_Money_Flow > 2.4054e+07 )
							if( rsi1 <= 26.3197 )
								ret := -0.225664
							if( rsi1 > 26.3197 )
								ret := 0.383803
				if( MFI > 36.5359 )
					if( rsi1 <= 33.9952 )
						if( Positive_Money_Flow_Sum <= 1.65429e+07 )
							if( smoothD_d <= 0.426551 )
								ret := -0.052632
							if( smoothD_d > 0.426551 )
								ret := -0.412698
						if( Positive_Money_Flow_Sum > 1.65429e+07 )
							if( Positive_Money_Flow_Sum <= 1.30701e+08 )
								ret := -0.777943 // sell
							if( Positive_Money_Flow_Sum > 1.30701e+08 )
								ret := -0.566234
					if( rsi1 > 33.9952 )
						if( Negative_Money_Flow <= 2.49411e+07 )
							if( MFI <= 43.9396 )
								ret := -0.426241
							if( MFI > 43.9396 )
								ret := -0.654024
						if( Negative_Money_Flow > 2.49411e+07 )
							if( MFI_High <= -26.0129 )
								ret := 0.010753
							if( MFI_High > -26.0129 )
								ret := -0.830189 // sell
			if( rsi1 > 42.5298 )
				if( Money_Flow_Ratio <= 0.935766 )
					if( smoothD_d <= 25.2065 )
						if( Negative_Money_Flow_Sum <= 2.34495e+08 )
							if( MFI_High <= -47.4291 )
								ret := 0.228916
							if( MFI_High > -47.4291 )
								ret := -0.078185
						if( Negative_Money_Flow_Sum > 2.34495e+08 )
							if( Negative_Money_Flow_Sum <= 2.79503e+08 )
								ret := 0.724138 // buy
							if( Negative_Money_Flow_Sum > 2.79503e+08 )
								ret := 0.196970
					if( smoothD_d > 25.2065 )
						if( MFI <= 37.4265 )
							if( Positive_Money_Flow <= 720794 )
								ret := 0.620053
							if( Positive_Money_Flow > 720794 )
								ret := 0.331839
						if( MFI > 37.4265 )
							if( rsi1 <= 50.8402 )
								ret := 0.031432
							if( rsi1 > 50.8402 )
								ret := 0.541568
				if( Money_Flow_Ratio > 0.935766 )
					if( Positive_Money_Flow <= 8.34435e+06 )
						if( k <= 30.1213 )
							if( Negative_Money_Flow_Sum <= 7.35323e+07 )
								ret := -0.270017
							if( Negative_Money_Flow_Sum > 7.35323e+07 )
								ret := -0.076503
						if( k > 30.1213 )
							if( d_k <= -6.64879 )
								ret := 0.164800
							if( d_k > -6.64879 )
								ret := -0.082968
					if( Positive_Money_Flow > 8.34435e+06 )
						if( rsi1 <= 59.3503 )
							if( MFI <= 67.438 )
								ret := -0.495347
							if( MFI > 67.438 )
								ret := -0.747275 // sell
						if( rsi1 > 59.3503 )
							if( MFI_High <= -7.11303 )
								ret := 0.167019
							if( MFI_High > -7.11303 )
								ret := -0.338645
	if( k > 51.8331 )
		if( Typical_Price <= 1919.71 )
			if( rsi1 <= 71.8434 )
				if( MFI_Low <= 44.4543 )
					if( Positive_Money_Flow_Sum <= 1.50812e+08 )
						if( rsi1 <= 59.7881 )
							if( Money_Flow_Ratio <= 0.763823 )
								ret := 0.155333
							if( Money_Flow_Ratio > 0.763823 )
								ret := 0.036102
						if( rsi1 > 59.7881 )
							if( Typical_Price <= 1351.53 )
								ret := 0.031944
							if( Typical_Price > 1351.53 )
								ret := 0.342903
					if( Positive_Money_Flow_Sum > 1.50812e+08 )
						if( Negative_Money_Flow_Sum <= 4.1522e+08 )
							if( MFI <= 56.454 )
								ret := -0.384242
							if( MFI > 56.454 )
								ret := -0.075503
						if( Negative_Money_Flow_Sum > 4.1522e+08 )
							if( Negative_Money_Flow_Sum <= 5.54e+08 )
								ret := 0.533333
							if( Negative_Money_Flow_Sum > 5.54e+08 )
								ret := -0.209302
				if( MFI_Low > 44.4543 )
					if( Positive_Money_Flow_Sum <= 8.71686e+07 )
						if( rsi1 <= 65.5131 )
							if( d <= 81.021 )
								ret := -0.149744
							if( d > 81.021 )
								ret := 0.020710
						if( rsi1 > 65.5131 )
							if( Positive_Money_Flow_Sum <= 7.09764e+07 )
								ret := 0.070613
							if( Positive_Money_Flow_Sum > 7.09764e+07 )
								ret := 0.314488
					if( Positive_Money_Flow_Sum > 8.71686e+07 )
						if( Negative_Money_Flow_Sum <= 3.29398e+07 )
							if( smoothK_k <= 82.8465 )
								ret := -0.638498
							if( smoothK_k > 82.8465 )
								ret := -0.144737
						if( Negative_Money_Flow_Sum > 3.29398e+07 )
							if( Positive_Money_Flow_Sum <= 4.00057e+08 )
								ret := -0.145516
							if( Positive_Money_Flow_Sum > 4.00057e+08 )
								ret := 0.548387
			if( rsi1 > 71.8434 )
				if( Positive_Money_Flow_Sum <= 9.92136e+07 )
					if( MFI <= 72.5672 )
						if( Positive_Money_Flow <= 4.3542e+07 )
							if( rsi1 <= 79.6083 )
								ret := 0.517050
							if( rsi1 > 79.6083 )
								ret := 0.794979 // buy
						if( Positive_Money_Flow > 4.3542e+07 )
							ret := -1.000000 // sell
					if( MFI > 72.5672 )
						if( Money_Flow_Ratio <= 11.7905 )
							if( Typical_Price <= 1567.94 )
								ret := 0.095339
							if( Typical_Price > 1567.94 )
								ret := 0.420339
						if( Money_Flow_Ratio > 11.7905 )
							if( MFI_High <= 13.1273 )
								ret := -0.923077 // sell
							if( MFI_High > 13.1273 )
								ret := -0.588235
				if( Positive_Money_Flow_Sum > 9.92136e+07 )
					if( Positive_Money_Flow <= 8.68385e+06 )
						if( Negative_Money_Flow <= 1.07357e+07 )
							if( d_k <= -10.2256 )
								ret := -0.423077
							if( d_k > -10.2256 )
								ret := 0.362403
						if( Negative_Money_Flow > 1.07357e+07 )
							if( Typical_Price <= 1671.32 )
								ret := -0.147929
							if( Typical_Price > 1671.32 )
								ret := 0.493671
					if( Positive_Money_Flow > 8.68385e+06 )
						if( Raw_Money_Flow <= 7.18907e+07 )
							if( rsi1 <= 87.4308 )
								ret := -0.083221
							if( rsi1 > 87.4308 )
								ret := 0.210938
						if( Raw_Money_Flow > 7.18907e+07 )
							if( Positive_Money_Flow <= 9.90712e+07 )
								ret := 0.712329 // buy
							if( Positive_Money_Flow > 9.90712e+07 )
								ret := 0.061538
		if( Typical_Price > 1919.71 )
			if( rsi1 <= 59.4006 )
				if( MFI <= 53.5591 )
					if( Positive_Money_Flow <= 1.32987e+06 )
						if( rsi1 <= 39.2422 )
							if( Raw_Money_Flow <= 1.86032e+07 )
								ret := -0.263087
							if( Raw_Money_Flow > 1.86032e+07 )
								ret := 0.321818
						if( rsi1 > 39.2422 )
							if( MFI <= 34.6177 )
								ret := 0.639557
							if( MFI > 34.6177 )
								ret := 0.294716
					if( Positive_Money_Flow > 1.32987e+06 )
						if( Positive_Money_Flow_Sum <= 5.0841e+08 )
							if( k <= 78.5533 )
								ret := 0.024992
							if( k > 78.5533 )
								ret := 0.285179
						if( Positive_Money_Flow_Sum > 5.0841e+08 )
							if( MFI_Low <= 26.5 )
								ret := -0.986301 // sell
							if( MFI_Low > 26.5 )
								ret := -0.500000
				if( MFI > 53.5591 )
					if( Negative_Money_Flow <= 893711 )
						if( Positive_Money_Flow <= 1.54346e+07 )
							if( rsi1 <= 52.0919 )
								ret := -0.416667
							if( rsi1 > 52.0919 )
								ret := -0.036300
						if( Positive_Money_Flow > 1.54346e+07 )
							if( d <= 78.7011 )
								ret := -0.747851 // sell
							if( d > 78.7011 )
								ret := -0.292453
					if( Negative_Money_Flow > 893711 )
						if( k <= 67.9503 )
							if( rsi1 <= 51.5168 )
								ret := -0.370044
							if( rsi1 > 51.5168 )
								ret := 0.024259
						if( k > 67.9503 )
							if( Negative_Money_Flow_Sum <= 3.32866e+08 )
								ret := 0.241237
							if( Negative_Money_Flow_Sum > 3.32866e+08 )
								ret := -0.727273 // sell
			if( rsi1 > 59.4006 )
				if( MFI_High <= -15.9226 )
					if( Positive_Money_Flow <= 1.97652e+07 )
						if( Typical_Price <= 3489.3 )
							if( smoothK_k <= 96.9852 )
								ret := 0.716358 // buy
							if( smoothK_k > 96.9852 )
								ret := 0.518182
						if( Typical_Price > 3489.3 )
							if( Raw_Money_Flow <= 5.16929e+06 )
								ret := 0.261364
							if( Raw_Money_Flow > 5.16929e+06 )
								ret := 0.600343
					if( Positive_Money_Flow > 1.97652e+07 )
						if( Positive_Money_Flow_Sum <= 1.43279e+08 )
							if( MFI_Low <= 40.3103 )
								ret := 0.753695 // buy
							if( MFI_Low > 40.3103 )
								ret := 0.321429
						if( Positive_Money_Flow_Sum > 1.43279e+08 )
							if( MFI <= 46.3245 )
								ret := 0.680556
							if( MFI > 46.3245 )
								ret := 0.139344
				if( MFI_High > -15.9226 )
					if( rsi1 <= 70.8199 )
						if( Raw_Money_Flow <= 2.21473e+07 )
							if( MFI_Low <= 56.3087 )
								ret := 0.320942
							if( MFI_Low > 56.3087 )
								ret := -0.067542
						if( Raw_Money_Flow > 2.21473e+07 )
							if( smoothD_d <= 80.1027 )
								ret := -0.461905
							if( smoothD_d > 80.1027 )
								ret := 0.028902
					if( rsi1 > 70.8199 )
						if( MFI <= 79.3178 )
							if( rsi1 <= 75.9183 )
								ret := 0.572634
							if( rsi1 > 75.9183 )
								ret := 0.790507 // buy
						if( MFI > 79.3178 )
							if( smoothD_d <= 79.7102 )
								ret := 0.102970
							if( smoothD_d > 79.7102 )
								ret := 0.564103
	
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
float op_operation = decision_tree_0_ETHUSDT_15Min_4257999f(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


