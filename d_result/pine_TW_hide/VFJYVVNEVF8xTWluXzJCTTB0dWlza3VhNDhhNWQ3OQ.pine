//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: TRXUSDT_1Min_2BM0_a48a5d79 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_1Min_2BM0_a48a5d79", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_1Min_a48a5d79(bbm, bearPower, bbp, bullPower, BBPower_Color, Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( Negative_Money_Flow <= 0.108399 )
		if( Positive_Money_Flow <= 0.489062 )
			if( BBPower_Color <= 0.5 )
				if( Negative_Money_Flow_Sum <= 31954 )
					if( MFI_High <= -56.1158 )
						if( bullPower <= 3.1e-05 )
							if( Raw_Money_Flow <= 3158.61 )
								ret := 0.033333
							if( Raw_Money_Flow > 3158.61 )
								ret := -0.330275
						if( bullPower > 3.1e-05 )
							if( Raw_Money_Flow <= 5890.01 )
								ret := 0.727273 // buy
							if( Raw_Money_Flow > 5890.01 )
								ret := 0.261905
					if( MFI_High > -56.1158 )
						if( MFI_Low <= 64.4628 )
							if( bbp <= -4e-06 )
								ret := -0.242308
							if( bbp > -4e-06 )
								ret := 0.134921
						if( MFI_Low > 64.4628 )
							if( bbp <= 1e-06 )
								ret := -0.296761
							if( bbp > 1e-06 )
								ret := -0.605322
				if( Negative_Money_Flow_Sum > 31954 )
					if( bullPower <= 6.1e-05 )
						if( MFI_High <= -47.9202 )
							if( bbp <= -6.6e-05 )
								ret := -0.070709
							if( bbp > -6.6e-05 )
								ret := 0.167217
						if( MFI_High > -47.9202 )
							if( bullPower <= -6.7e-05 )
								ret := -0.362745
							if( bullPower > -6.7e-05 )
								ret := -0.076777
					if( bullPower > 6.1e-05 )
						if( MFI_Low <= 34.7788 )
							if( Typical_Price <= 0.162217 )
								ret := 0.316764
							if( Typical_Price > 0.162217 )
								ret := -0.700000 // sell
						if( MFI_Low > 34.7788 )
							if( Negative_Money_Flow_Sum <= 224330 )
								ret := 0.075130
							if( Negative_Money_Flow_Sum > 224330 )
								ret := -0.575472
			if( BBPower_Color > 0.5 )
				if( Positive_Money_Flow_Sum <= 39144.4 )
					if( bbm <= 2.1e-05 )
						if( MFI_High <= -19.6034 )
							if( Negative_Money_Flow_Sum <= 14470.6 )
								ret := -0.500000
							if( Negative_Money_Flow_Sum > 14470.6 )
								ret := -0.028939
						if( MFI_High > -19.6034 )
							if( bbm <= 1e-05 )
								ret := 0.055046
							if( bbm > 1e-05 )
								ret := 0.428571
					if( bbm > 2.1e-05 )
						if( Money_Flow_Ratio <= 12.4846 )
							if( Typical_Price <= 0.153356 )
								ret := 0.477828
							if( Typical_Price > 0.153356 )
								ret := 0.293458
						if( Money_Flow_Ratio > 12.4846 )
							if( Positive_Money_Flow_Sum <= 31565.6 )
								ret := 0.130435
							if( Positive_Money_Flow_Sum > 31565.6 )
								ret := -0.775000 // sell
				if( Positive_Money_Flow_Sum > 39144.4 )
					if( bbm <= 0.0001 )
						if( MFI_High <= 1.7713 )
							if( bbm <= 6.6e-05 )
								ret := -0.021956
							if( bbm > 6.6e-05 )
								ret := 0.107075
						if( MFI_High > 1.7713 )
							if( bullPower <= 0.000115 )
								ret := -0.129731
							if( bullPower > 0.000115 )
								ret := 0.049223
					if( bbm > 0.0001 )
						if( bbp <= 4.7e-05 )
							if( MFI <= 70.3553 )
								ret := 0.082803
							if( MFI > 70.3553 )
								ret := -0.359223
						if( bbp > 4.7e-05 )
							if( Negative_Money_Flow_Sum <= 34141.8 )
								ret := 0.617857
							if( Negative_Money_Flow_Sum > 34141.8 )
								ret := 0.258447
		if( Positive_Money_Flow > 0.489062 )
			if( Typical_Price <= 0.130146 )
				if( bbm <= 9.9e-05 )
					if( Money_Flow_Ratio <= 0.459179 )
						if( bullPower <= 4.5e-05 )
							if( Negative_Money_Flow_Sum <= 154819 )
								ret := 0.005484
							if( Negative_Money_Flow_Sum > 154819 )
								ret := 0.134953
						if( bullPower > 4.5e-05 )
							if( Typical_Price <= 0.11109 )
								ret := 0.875000 // buy
							if( Typical_Price > 0.11109 )
								ret := -0.176316
					if( Money_Flow_Ratio > 0.459179 )
						if( Positive_Money_Flow_Sum <= 669029 )
							if( Negative_Money_Flow_Sum <= 881891 )
								ret := -0.037253
							if( Negative_Money_Flow_Sum > 881891 )
								ret := 0.735294 // buy
						if( Positive_Money_Flow_Sum > 669029 )
							if( Typical_Price <= 0.116372 )
								ret := -0.208791
							if( Typical_Price > 0.116372 )
								ret := 0.243516
				if( bbm > 9.9e-05 )
					if( Positive_Money_Flow <= 13894.6 )
						if( bbm <= 0.000104 )
							if( Negative_Money_Flow_Sum <= 297674 )
								ret := -0.331620
							if( Negative_Money_Flow_Sum > 297674 )
								ret := -0.114894
						if( bbm > 0.000104 )
							if( Positive_Money_Flow_Sum <= 103495 )
								ret := 0.226744
							if( Positive_Money_Flow_Sum > 103495 )
								ret := -0.379518
					if( Positive_Money_Flow > 13894.6 )
						if( Positive_Money_Flow_Sum <= 687125 )
							if( bbp <= -0.000238 )
								ret := 0.074236
							if( bbp > -0.000238 )
								ret := -0.162787
						if( Positive_Money_Flow_Sum > 687125 )
							if( bbm <= 0.000171 )
								ret := 0.319481
							if( bbm > 0.000171 )
								ret := 0.022187
			if( Typical_Price > 0.130146 )
				if( Raw_Money_Flow <= 30350.4 )
					if( bbm <= 4.1e-05 )
						if( Positive_Money_Flow <= 481.965 )
							if( Positive_Money_Flow_Sum <= 113009 )
								ret := -0.407407
							if( Positive_Money_Flow_Sum > 113009 )
								ret := -1.000000 // sell
						if( Positive_Money_Flow > 481.965 )
							if( bullPower <= 1.8e-05 )
								ret := 0.033987
							if( bullPower > 1.8e-05 )
								ret := -0.083398
					if( bbm > 4.1e-05 )
						if( Raw_Money_Flow <= 11207.1 )
							if( MFI <= 84.0649 )
								ret := -0.347578
							if( MFI > 84.0649 )
								ret := -0.467220
						if( Raw_Money_Flow > 11207.1 )
							if( Typical_Price <= 0.138941 )
								ret := -0.148659
							if( Typical_Price > 0.138941 )
								ret := -0.280936
				if( Raw_Money_Flow > 30350.4 )
					if( BBPower_Color <= 0.5 )
						if( Money_Flow_Ratio <= 0.260039 )
							if( bullPower <= -0.000205 )
								ret := 0.395349
							if( bullPower > -0.000205 )
								ret := 0.005469
						if( Money_Flow_Ratio > 0.260039 )
							if( Positive_Money_Flow_Sum <= 146274 )
								ret := -0.048227
							if( Positive_Money_Flow_Sum > 146274 )
								ret := -0.189628
					if( BBPower_Color > 0.5 )
						if( bbm <= 0.000707 )
							if( Negative_Money_Flow_Sum <= 696521 )
								ret := -0.033186
							if( Negative_Money_Flow_Sum > 696521 )
								ret := 0.195763
						if( bbm > 0.000707 )
							if( Positive_Money_Flow_Sum <= 851715 )
								ret := 0.636364
							if( Positive_Money_Flow_Sum > 851715 )
								ret := -0.720930 // sell
	if( Negative_Money_Flow > 0.108399 )
		if( Typical_Price <= 0.126028 )
			if( bbm <= 7.6e-05 )
				if( Negative_Money_Flow_Sum <= 84182.1 )
					if( Raw_Money_Flow <= 9686.5 )
						if( Negative_Money_Flow <= 356.963 )
							if( BBPower_Color <= 0.5 )
								ret := 0.707317 // buy
							if( BBPower_Color > 0.5 )
								ret := 0.117647
						if( Negative_Money_Flow > 356.963 )
							if( bbm <= 3.1e-05 )
								ret := -0.011192
							if( bbm > 3.1e-05 )
								ret := 0.192575
					if( Raw_Money_Flow > 9686.5 )
						if( bbp <= -1.1e-05 )
							if( bbm <= 4.9e-05 )
								ret := -0.050493
							if( bbm > 4.9e-05 )
								ret := 0.131507
						if( bbp > -1.1e-05 )
							if( bbp <= 0.000204 )
								ret := -0.139276
							if( bbp > 0.000204 )
								ret := 0.526316
				if( Negative_Money_Flow_Sum > 84182.1 )
					if( Negative_Money_Flow <= 17922.9 )
						if( bbm <= 3.1e-05 )
							if( Negative_Money_Flow <= 641.796 )
								ret := 0.485437
							if( Negative_Money_Flow > 641.796 )
								ret := 0.046746
						if( bbm > 3.1e-05 )
							if( bbp <= -4.5e-05 )
								ret := 0.311094
							if( bbp > -4.5e-05 )
								ret := 0.106552
					if( Negative_Money_Flow > 17922.9 )
						if( bbm <= 5.2e-05 )
							if( Negative_Money_Flow_Sum <= 279331 )
								ret := -0.012612
							if( Negative_Money_Flow_Sum > 279331 )
								ret := -0.133903
						if( bbm > 5.2e-05 )
							if( Raw_Money_Flow <= 99057.4 )
								ret := 0.073829
							if( Raw_Money_Flow > 99057.4 )
								ret := -0.254717
			if( bbm > 7.6e-05 )
				if( Negative_Money_Flow <= 12177.1 )
					if( Positive_Money_Flow_Sum <= 278585 )
						if( Raw_Money_Flow <= 5853.25 )
							if( Negative_Money_Flow <= 886.506 )
								ret := 0.307692
							if( Negative_Money_Flow > 886.506 )
								ret := 0.609238
						if( Raw_Money_Flow > 5853.25 )
							if( bbm <= 9.7e-05 )
								ret := 0.162679
							if( bbm > 9.7e-05 )
								ret := 0.419598
					if( Positive_Money_Flow_Sum > 278585 )
						if( Positive_Money_Flow_Sum <= 382111 )
							if( bullPower <= 0.000143 )
								ret := -0.200000
							if( bullPower > 0.000143 )
								ret := 0.681818
						if( Positive_Money_Flow_Sum > 382111 )
							if( Raw_Money_Flow <= 5516.94 )
								ret := -0.074074
							if( Raw_Money_Flow > 5516.94 )
								ret := 0.708333 // buy
				if( Negative_Money_Flow > 12177.1 )
					if( bullPower <= 2.4e-05 )
						if( bearPower <= -0.000372 )
							if( MFI_High <= -78.9724 )
								ret := 0.703704 // buy
							if( MFI_High > -78.9724 )
								ret := -0.221441
						if( bearPower > -0.000372 )
							if( Positive_Money_Flow_Sum <= 120004 )
								ret := 0.116930
							if( Positive_Money_Flow_Sum > 120004 )
								ret := -0.009110
					if( bullPower > 2.4e-05 )
						if( bullPower <= 0.000445 )
							if( Typical_Price <= 0.120617 )
								ret := 0.101527
							if( Typical_Price > 0.120617 )
								ret := 0.243149
						if( bullPower > 0.000445 )
							if( bbm <= 0.000497 )
								ret := 1.000000 // buy
							if( bbm > 0.000497 )
								ret := 0.571429
		if( Typical_Price > 0.126028 )
			if( Raw_Money_Flow <= 24969.9 )
				if( bbm <= 3.2e-05 )
					if( Negative_Money_Flow <= 926.762 )
						if( bbm <= 2.1e-05 )
							if( MFI_High <= -25.8207 )
								ret := 0.375000
							if( MFI_High > -25.8207 )
								ret := -0.140000
						if( bbm > 2.1e-05 )
							if( Negative_Money_Flow_Sum <= 54086.7 )
								ret := 0.333333
							if( Negative_Money_Flow_Sum > 54086.7 )
								ret := 0.882353 // buy
					if( Negative_Money_Flow > 926.762 )
						if( Positive_Money_Flow <= 1.95605 )
							if( Raw_Money_Flow <= 5289.49 )
								ret := 0.063882
							if( Raw_Money_Flow > 5289.49 )
								ret := -0.024011
						if( Positive_Money_Flow > 1.95605 )
							if( Negative_Money_Flow <= 2288.62 )
								ret := 0.142857
							if( Negative_Money_Flow > 2288.62 )
								ret := -0.728814 // sell
				if( bbm > 3.2e-05 )
					if( Positive_Money_Flow_Sum <= 157253 )
						if( bbm <= 8.3e-05 )
							if( Negative_Money_Flow_Sum <= 56256.5 )
								ret := 0.130088
							if( Negative_Money_Flow_Sum > 56256.5 )
								ret := 0.325375
						if( bbm > 8.3e-05 )
							if( bbp <= -0.000136 )
								ret := 0.357826
							if( bbp > -0.000136 )
								ret := 0.615208
					if( Positive_Money_Flow_Sum > 157253 )
						if( bbm <= 7.2e-05 )
							if( Negative_Money_Flow <= 10933.1 )
								ret := 0.133032
							if( Negative_Money_Flow > 10933.1 )
								ret := -0.061327
						if( bbm > 7.2e-05 )
							if( Positive_Money_Flow <= 233.969 )
								ret := 0.427930
							if( Positive_Money_Flow > 233.969 )
								ret := 0.088123
			if( Raw_Money_Flow > 24969.9 )
				if( Negative_Money_Flow_Sum <= 479622 )
					if( bbm <= 7.3e-05 )
						if( MFI_Low <= 42.1651 )
							if( Typical_Price <= 0.142551 )
								ret := 0.069629
							if( Typical_Price > 0.142551 )
								ret := 1.000000 // buy
						if( MFI_Low > 42.1651 )
							if( MFI <= 64.5805 )
								ret := -0.500000
							if( MFI > 64.5805 )
								ret := -0.055336
					if( bbm > 7.3e-05 )
						if( Raw_Money_Flow <= 42836.5 )
							if( bbm <= 0.000199 )
								ret := 0.364885
							if( bbm > 0.000199 )
								ret := 0.220093
						if( Raw_Money_Flow > 42836.5 )
							if( bearPower <= -8.7e-05 )
								ret := 0.166552
							if( bearPower > -8.7e-05 )
								ret := 0.298557
				if( Negative_Money_Flow_Sum > 479622 )
					if( bullPower <= 0.000526 )
						if( Money_Flow_Ratio <= 2.00128 )
							if( bbm <= 0.000534 )
								ret := 0.055562
							if( bbm > 0.000534 )
								ret := 0.397196
						if( Money_Flow_Ratio > 2.00128 )
							if( Positive_Money_Flow_Sum <= 1.09866e+06 )
								ret := -0.818182 // sell
							if( Positive_Money_Flow_Sum > 1.09866e+06 )
								ret := 0.395657
					if( bullPower > 0.000526 )
						if( MFI_Low <= 54.5403 )
							if( Negative_Money_Flow_Sum <= 1.96922e+06 )
								ret := -0.343750
							if( Negative_Money_Flow_Sum > 1.96922e+06 )
								ret := 0.387500
						if( MFI_Low > 54.5403 )
							if( Typical_Price <= 0.163633 )
								ret := -0.930435 // sell
							if( Typical_Price > 0.163633 )
								ret := -0.500000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


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
float op_operation = decision_tree_0_TRXUSDT_1Min_a48a5d79(bbm, bearPower, bbp, bullPower, BBPower_Color, Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)

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


