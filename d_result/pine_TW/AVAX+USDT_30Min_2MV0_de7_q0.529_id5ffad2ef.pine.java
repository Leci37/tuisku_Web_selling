//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Vortex_Indicator
// ID_model: AVAXUSDT_30Min_2MV0_5ffad2ef Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AVAXUSDT_30Min_2MV0_5ffad2ef", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AVAXUSDT_30Min_5ffad2ef(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( MFI_High <= -57.0335 )
		if( Positive_Money_Flow_Sum <= 4.93658e+06 )
			if( Money_Flow_Ratio <= 0.218063 )
				if( Negative_Money_Flow_Sum <= 2.91205e+06 )
					if( Typical_Price <= 3.13448 )
						if( Negative_Money_Flow_Sum <= 556171 )
							if( Typical_Price <= 3.04174 )
								ret := 0.857143 // buy
							if( Typical_Price > 3.04174 )
								ret := 0.250000
						if( Negative_Money_Flow_Sum > 556171 )
							if( VIP_VIM <= -0.475631 )
								ret := 0.400000
							if( VIP_VIM > -0.475631 )
								ret := -0.857143 // sell
					if( Typical_Price > 3.13448 )
						if( Positive_Money_Flow <= 1360.4 )
							if( Raw_Money_Flow <= 281679 )
								ret := 0.252033
							if( Raw_Money_Flow > 281679 )
								ret := 0.645570
						if( Positive_Money_Flow > 1360.4 )
							if( Negative_Money_Flow_Sum <= 2.44738e+06 )
								ret := 0.062500
							if( Negative_Money_Flow_Sum > 2.44738e+06 )
								ret := -0.680000
				if( Negative_Money_Flow_Sum > 2.91205e+06 )
					if( VIP <= 0.509356 )
						if( MFI_Low <= -8.14715 )
							if( VIP <= 0.457104 )
								ret := 0.882353 // buy
							if( VIP > 0.457104 )
								ret := 0.458333
						if( MFI_Low > -8.14715 )
							ret := -0.200000
					if( VIP > 0.509356 )
						if( Negative_Money_Flow_Sum <= 5.77143e+06 )
							if( Typical_Price <= 17.1898 )
								ret := -0.366667
							if( Typical_Price > 17.1898 )
								ret := 0.281250
						if( Negative_Money_Flow_Sum > 5.77143e+06 )
							if( VIM <= 1.25453 )
								ret := 0.136253
							if( VIM > 1.25453 )
								ret := -0.138405
			if( Money_Flow_Ratio > 0.218063 )
				if( VIM <= 1.10886 )
					if( Positive_Money_Flow_Sum <= 1.76478e+06 )
						if( Negative_Money_Flow <= 225762 )
							if( Negative_Money_Flow_Sum <= 231538 )
								ret := -0.923077 // sell
							if( Negative_Money_Flow_Sum > 231538 )
								ret := -0.036496
						if( Negative_Money_Flow > 225762 )
							if( Negative_Money_Flow_Sum <= 3.84682e+06 )
								ret := -0.208333
							if( Negative_Money_Flow_Sum > 3.84682e+06 )
								ret := -0.628571
					if( Positive_Money_Flow_Sum > 1.76478e+06 )
						if( VIM <= 1.10642 )
							if( Positive_Money_Flow <= 400684 )
								ret := 0.128205
							if( Positive_Money_Flow > 400684 )
								ret := 0.692308
						if( VIM > 1.10642 )
							ret := -0.750000 // sell
				if( VIM > 1.10886 )
					if( Negative_Money_Flow_Sum <= 1.18085e+07 )
						if( Positive_Money_Flow_Sum <= 1.7298e+06 )
							if( Raw_Money_Flow <= 316228 )
								ret := 0.218182
							if( Raw_Money_Flow > 316228 )
								ret := -0.047170
						if( Positive_Money_Flow_Sum > 1.7298e+06 )
							if( Positive_Money_Flow <= 206733 )
								ret := 0.518717
							if( Positive_Money_Flow > 206733 )
								ret := 0.219780
					if( Negative_Money_Flow_Sum > 1.18085e+07 )
						if( Negative_Money_Flow_Sum <= 1.38023e+07 )
							if( Money_Flow_Ratio <= 0.252424 )
								ret := -0.662338
							if( Money_Flow_Ratio > 0.252424 )
								ret := -0.146667
						if( Negative_Money_Flow_Sum > 1.38023e+07 )
							if( Negative_Money_Flow_Sum <= 1.49091e+07 )
								ret := 0.530303
							if( Negative_Money_Flow_Sum > 1.49091e+07 )
								ret := -0.074236
		if( Positive_Money_Flow_Sum > 4.93658e+06 )
			if( Negative_Money_Flow_Sum <= 6.08825e+07 )
				if( Positive_Money_Flow <= 462911 )
					if( MFI <= 12.7211 )
						if( Typical_Price <= 77.3991 )
							if( VIM <= 1.31759 )
								ret := 0.914894 // buy
							if( VIM > 1.31759 )
								ret := 0.588235
						if( Typical_Price > 77.3991 )
							if( MFI <= 9.6671 )
								ret := 0.333333
							if( MFI > 9.6671 )
								ret := -0.750000 // sell
					if( MFI > 12.7211 )
						if( Raw_Money_Flow <= 4.33543e+06 )
							if( MFI <= 20.9918 )
								ret := 0.444181
							if( MFI > 20.9918 )
								ret := 0.147410
						if( Raw_Money_Flow > 4.33543e+06 )
							if( VIM <= 1.2118 )
								ret := 0.350877
							if( VIM > 1.2118 )
								ret := -0.203883
				if( Positive_Money_Flow > 462911 )
					if( Negative_Money_Flow_Sum <= 2.86802e+07 )
						if( MFI_High <= -58.9297 )
							if( Typical_Price <= 35.5817 )
								ret := 0.677778
							if( Typical_Price > 35.5817 )
								ret := -0.083333
						if( MFI_High > -58.9297 )
							if( Raw_Money_Flow <= 1.26623e+06 )
								ret := 0.078947
							if( Raw_Money_Flow > 1.26623e+06 )
								ret := -0.372093
					if( Negative_Money_Flow_Sum > 2.86802e+07 )
						if( Positive_Money_Flow_Sum <= 8.41e+06 )
							if( Typical_Price <= 42.4171 )
								ret := -0.365079
							if( Typical_Price > 42.4171 )
								ret := -0.769231 // sell
						if( Positive_Money_Flow_Sum > 8.41e+06 )
							if( VIP <= 0.728271 )
								ret := -0.216981
							if( VIP > 0.728271 )
								ret := 0.352941
			if( Negative_Money_Flow_Sum > 6.08825e+07 )
				if( Typical_Price <= 106.648 )
					if( Negative_Money_Flow <= 2.8705e+06 )
						if( VIM <= 1.39066 )
							if( Negative_Money_Flow_Sum <= 7.65094e+07 )
								ret := 0.558442
							if( Negative_Money_Flow_Sum > 7.65094e+07 )
								ret := 0.038462
						if( VIM > 1.39066 )
							ret := -1.000000 // sell
					if( Negative_Money_Flow > 2.8705e+06 )
						if( Raw_Money_Flow <= 1.16527e+07 )
							if( VIP_VIM <= -0.419644 )
								ret := 0.770370 // buy
							if( VIP_VIM > -0.419644 )
								ret := 0.265823
						if( Raw_Money_Flow > 1.16527e+07 )
							if( VIP_VIM <= -0.656154 )
								ret := 0.723404 // buy
							if( VIP_VIM > -0.656154 )
								ret := 0.128205
				if( Typical_Price > 106.648 )
					if( Raw_Money_Flow <= 6.54075e+06 )
						if( VIP_VIM <= -0.533598 )
							ret := 0.000000
						if( VIP_VIM > -0.533598 )
							if( Positive_Money_Flow_Sum <= 2.29066e+07 )
								ret := -0.857143 // sell
							if( Positive_Money_Flow_Sum > 2.29066e+07 )
								ret := -0.250000
					if( Raw_Money_Flow > 6.54075e+06 )
						if( Positive_Money_Flow_Sum <= 3.15112e+07 )
							if( Positive_Money_Flow_Sum <= 1.12467e+07 )
								ret := 0.500000
							if( Positive_Money_Flow_Sum > 1.12467e+07 )
								ret := -0.083333
						if( Positive_Money_Flow_Sum > 3.15112e+07 )
							if( Money_Flow_Ratio <= 0.255653 )
								ret := 0.250000
							if( Money_Flow_Ratio > 0.255653 )
								ret := 1.000000 // buy
	if( MFI_High > -57.0335 )
		if( Typical_Price <= 89.6203 )
			if( Negative_Money_Flow <= 1.70657e+07 )
				if( Positive_Money_Flow_Sum <= 3.44935e+07 )
					if( MFI_High <= 6.53906 )
						if( Positive_Money_Flow <= 1.07562e+07 )
							if( Positive_Money_Flow_Sum <= 59826.6 )
								ret := -0.508475
							if( Positive_Money_Flow_Sum > 59826.6 )
								ret := -0.000768
						if( Positive_Money_Flow > 1.07562e+07 )
							if( MFI_Low <= 58.8045 )
								ret := 0.574803
							if( MFI_Low > 58.8045 )
								ret := -0.687500
					if( MFI_High > 6.53906 )
						if( Negative_Money_Flow_Sum <= 3.57724e+06 )
							if( VIM <= 0.690106 )
								ret := 0.289902
							if( VIM > 0.690106 )
								ret := 0.031630
						if( Negative_Money_Flow_Sum > 3.57724e+06 )
							if( VIM <= 0.64768 )
								ret := -0.840000 // sell
							if( VIM > 0.64768 )
								ret := -0.214286
				if( Positive_Money_Flow_Sum > 3.44935e+07 )
					if( MFI_High <= -11.6413 )
						if( Money_Flow_Ratio <= 0.58695 )
							if( VIP <= 0.810659 )
								ret := 0.082873
							if( VIP > 0.810659 )
								ret := -0.382450
						if( Money_Flow_Ratio > 0.58695 )
							if( Negative_Money_Flow_Sum <= 3.6272e+07 )
								ret := -0.153744
							if( Negative_Money_Flow_Sum > 3.6272e+07 )
								ret := -0.048705
					if( MFI_High > -11.6413 )
						if( VIM <= 0.866589 )
							if( MFI_High <= 7.2223 )
								ret := 0.020148
							if( MFI_High > 7.2223 )
								ret := -0.280423
						if( VIM > 0.866589 )
							if( MFI_High <= -6.66541 )
								ret := 0.429348
							if( MFI_High > -6.66541 )
								ret := -0.055944
			if( Negative_Money_Flow > 1.70657e+07 )
				if( Negative_Money_Flow_Sum <= 7.71422e+07 )
					if( VIM <= 0.937421 )
						if( MFI_Low <= 60.9086 )
							if( VIM <= 0.658537 )
								ret := 0.500000
							if( VIM > 0.658537 )
								ret := -0.666667
						if( MFI_Low > 60.9086 )
							ret := 1.000000 // buy
					if( VIM > 0.937421 )
						if( Money_Flow_Ratio <= 1.31272 )
							if( VIM <= 1.15547 )
								ret := 0.846154 // buy
							if( VIM > 1.15547 )
								ret := 0.200000
						if( Money_Flow_Ratio > 1.31272 )
							ret := 0.000000
				if( Negative_Money_Flow_Sum > 7.71422e+07 )
					if( Raw_Money_Flow <= 2.36289e+07 )
						if( Negative_Money_Flow_Sum <= 1.37023e+08 )
							if( Typical_Price <= 66.9865 )
								ret := 0.853333 // buy
							if( Typical_Price > 66.9865 )
								ret := 0.166667
						if( Negative_Money_Flow_Sum > 1.37023e+08 )
							if( Negative_Money_Flow_Sum <= 1.64213e+08 )
								ret := -0.727273 // sell
							if( Negative_Money_Flow_Sum > 1.64213e+08 )
								ret := 0.833333 // buy
					if( Raw_Money_Flow > 2.36289e+07 )
						if( VIP <= 1.24076 )
							if( VIM <= 1.18901 )
								ret := 0.865772 // buy
							if( VIM > 1.18901 )
								ret := 0.250000
						if( VIP > 1.24076 )
							ret := -0.250000
		if( Typical_Price > 89.6203 )
			if( Negative_Money_Flow <= 9.25798e+06 )
				if( Positive_Money_Flow_Sum <= 2.2709e+08 )
					if( Raw_Money_Flow <= 1.34003e+07 )
						if( VIP_VIM <= 0.193575 )
							if( Raw_Money_Flow <= 9.2488e+06 )
								ret := -0.194670
							if( Raw_Money_Flow > 9.2488e+06 )
								ret := -0.515528
						if( VIP_VIM > 0.193575 )
							if( MFI_High <= 8.66367 )
								ret := 0.002265
							if( MFI_High > 8.66367 )
								ret := -0.729730 // sell
					if( Raw_Money_Flow > 1.34003e+07 )
						if( VIP_VIM <= 0.220415 )
							if( VIP <= 0.985266 )
								ret := 0.209524
							if( VIP > 0.985266 )
								ret := -0.240385
						if( VIP_VIM > 0.220415 )
							if( VIP <= 1.21046 )
								ret := 0.640777
							if( VIP > 1.21046 )
								ret := -0.083333
				if( Positive_Money_Flow_Sum > 2.2709e+08 )
					if( Typical_Price <= 106.356 )
						if( Positive_Money_Flow_Sum <= 2.45161e+08 )
							if( Typical_Price <= 103.79 )
								ret := 0.000000
							if( Typical_Price > 103.79 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 2.45161e+08 )
							if( Positive_Money_Flow <= 1.57222e+07 )
								ret := -0.250000
							if( Positive_Money_Flow > 1.57222e+07 )
								ret := -1.000000 // sell
					if( Typical_Price > 106.356 )
						if( Negative_Money_Flow_Sum <= 5.24211e+07 )
							ret := -0.750000 // sell
						if( Negative_Money_Flow_Sum > 5.24211e+07 )
							if( Raw_Money_Flow <= 1.07062e+07 )
								ret := -0.933333 // sell
							if( Raw_Money_Flow > 1.07062e+07 )
								ret := -1.000000 // sell
			if( Negative_Money_Flow > 9.25798e+06 )
				if( Negative_Money_Flow_Sum <= 7.50792e+07 )
					if( Positive_Money_Flow_Sum <= 1.01508e+08 )
						if( MFI <= 45.0829 )
							if( MFI <= 42.8215 )
								ret := 0.420290
							if( MFI > 42.8215 )
								ret := -0.666667
						if( MFI > 45.0829 )
							if( Negative_Money_Flow <= 9.78992e+06 )
								ret := 0.958333 // buy
							if( Negative_Money_Flow > 9.78992e+06 )
								ret := 0.670455
					if( Positive_Money_Flow_Sum > 1.01508e+08 )
						if( VIM <= 0.969657 )
							if( Negative_Money_Flow_Sum <= 4.64402e+07 )
								ret := -0.555556
							if( Negative_Money_Flow_Sum > 4.64402e+07 )
								ret := 0.326087
						if( VIM > 0.969657 )
							ret := -1.000000 // sell
				if( Negative_Money_Flow_Sum > 7.50792e+07 )
					if( Negative_Money_Flow_Sum <= 1.84998e+08 )
						if( Positive_Money_Flow_Sum <= 7.87682e+07 )
							if( Typical_Price <= 110.856 )
								ret := -0.706897 // sell
							if( Typical_Price > 110.856 )
								ret := -0.066667
						if( Positive_Money_Flow_Sum > 7.87682e+07 )
							if( Positive_Money_Flow_Sum <= 1.88812e+08 )
								ret := 0.336449
							if( Positive_Money_Flow_Sum > 1.88812e+08 )
								ret := -0.513514
					if( Negative_Money_Flow_Sum > 1.84998e+08 )
						if( VIP <= 0.918904 )
							ret := 1.000000 // buy
						if( VIP > 0.918904 )
							ret := 0.750000 // buy
	
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


//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
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
float op_operation = decision_tree_0_AVAXUSDT_30Min_5ffad2ef(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, VIP, VIM, VIP_VIM)

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


