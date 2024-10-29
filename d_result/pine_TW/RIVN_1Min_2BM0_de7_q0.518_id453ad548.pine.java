//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: RIVN_1Min_2BM0_453ad548 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_RIVN_1Min_2BM0_453ad548", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_RIVN_1Min_453ad548(bbm, bearPower, bbp, bullPower, BBPower_Color, Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( Negative_Money_Flow <= 5.84619 )
		if( Positive_Money_Flow_Sum <= 1.40657e+06 )
			if( bearPower <= 0.011552 )
				if( bullPower <= -0.010028 )
					if( Negative_Money_Flow_Sum <= 151362 )
						if( Positive_Money_Flow <= 52748.9 )
							if( Negative_Money_Flow_Sum <= 52979.3 )
								ret := -0.017241
							if( Negative_Money_Flow_Sum > 52979.3 )
								ret := 0.235060
						if( Positive_Money_Flow > 52748.9 )
							if( bearPower <= -0.047758 )
								ret := -0.857143 // sell
							if( bearPower > -0.047758 )
								ret := -0.111111
					if( Negative_Money_Flow_Sum > 151362 )
						if( MFI <= 47.6586 )
							if( Typical_Price <= 13.1094 )
								ret := -0.050987
							if( Typical_Price > 13.1094 )
								ret := 0.138268
						if( MFI > 47.6586 )
							if( bbm <= 3e-05 )
								ret := -0.050000
							if( bbm > 3e-05 )
								ret := -0.440000
				if( bullPower > -0.010028 )
					if( bbp <= 0.123536 )
						if( bullPower <= 0.032775 )
							if( Positive_Money_Flow_Sum <= 1.08457e+06 )
								ret := -0.023974
							if( Positive_Money_Flow_Sum > 1.08457e+06 )
								ret := -0.154583
						if( bullPower > 0.032775 )
							if( Negative_Money_Flow_Sum <= 298409 )
								ret := -0.338785
							if( Negative_Money_Flow_Sum > 298409 )
								ret := 0.017986
					if( bbp > 0.123536 )
						if( Money_Flow_Ratio <= 5.21679 )
							if( Positive_Money_Flow_Sum <= 815298 )
								ret := 0.000000
							if( Positive_Money_Flow_Sum > 815298 )
								ret := 0.714286 // buy
						if( Money_Flow_Ratio > 5.21679 )
							ret := 1.000000 // buy
			if( bearPower > 0.011552 )
				if( bbm <= 0.090524 )
					if( bbp <= 0.052513 )
						if( Positive_Money_Flow <= 3270.89 )
							if( bearPower <= 0.021717 )
								ret := -0.212259
							if( bearPower > 0.021717 )
								ret := -0.416667
						if( Positive_Money_Flow > 3270.89 )
							if( MFI_Low <= -16.6286 )
								ret := 0.937500 // buy
							if( MFI_Low > -16.6286 )
								ret := -0.081707
					if( bbp > 0.052513 )
						if( Positive_Money_Flow <= 14528.1 )
							if( Raw_Money_Flow <= 22482.9 )
								ret := -0.436499
							if( Raw_Money_Flow > 22482.9 )
								ret := 0.162791
						if( Positive_Money_Flow > 14528.1 )
							if( Negative_Money_Flow_Sum <= 247117 )
								ret := -0.077147
							if( Negative_Money_Flow_Sum > 247117 )
								ret := -0.432234
				if( bbm > 0.090524 )
					if( Positive_Money_Flow_Sum <= 278794 )
						ret := 0.100000
					if( Positive_Money_Flow_Sum > 278794 )
						if( Raw_Money_Flow <= 372763 )
							if( Positive_Money_Flow <= 229795 )
								ret := 0.750000 // buy
							if( Positive_Money_Flow > 229795 )
								ret := 1.000000 // buy
						if( Raw_Money_Flow > 372763 )
							ret := 0.142857
		if( Positive_Money_Flow_Sum > 1.40657e+06 )
			if( Positive_Money_Flow_Sum <= 4.62519e+07 )
				if( bbp <= -0.103157 )
					if( Positive_Money_Flow_Sum <= 1.16361e+07 )
						if( bullPower <= -0.051771 )
							if( bbm <= 0.162435 )
								ret := -0.032609
							if( bbm > 0.162435 )
								ret := -0.833333 // sell
						if( bullPower > -0.051771 )
							if( Positive_Money_Flow <= 4.10799e+06 )
								ret := 0.195195
							if( Positive_Money_Flow > 4.10799e+06 )
								ret := -0.461538
					if( Positive_Money_Flow_Sum > 1.16361e+07 )
						if( Positive_Money_Flow <= 4.79444e+06 )
							if( Positive_Money_Flow_Sum <= 1.72595e+07 )
								ret := 0.401460
							if( Positive_Money_Flow_Sum > 1.72595e+07 )
								ret := 0.814815 // buy
						if( Positive_Money_Flow > 4.79444e+06 )
							if( Raw_Money_Flow <= 7.71269e+06 )
								ret := -0.125000
							if( Raw_Money_Flow > 7.71269e+06 )
								ret := 0.687500
				if( bbp > -0.103157 )
					if( Positive_Money_Flow_Sum <= 9.54838e+06 )
						if( bbm <= 0.050489 )
							if( bearPower <= 0.033775 )
								ret := 0.050404
							if( bearPower > 0.033775 )
								ret := 0.243709
						if( bbm > 0.050489 )
							if( MFI_High <= -29.8519 )
								ret := 0.052813
							if( MFI_High > -29.8519 )
								ret := -0.146320
					if( Positive_Money_Flow_Sum > 9.54838e+06 )
						if( Negative_Money_Flow_Sum <= 9.04742e+06 )
							if( Positive_Money_Flow_Sum <= 4.00077e+07 )
								ret := -0.081903
							if( Positive_Money_Flow_Sum > 4.00077e+07 )
								ret := 0.573333
						if( Negative_Money_Flow_Sum > 9.04742e+06 )
							if( Typical_Price <= 13.2997 )
								ret := -0.095124
							if( Typical_Price > 13.2997 )
								ret := 0.088092
			if( Positive_Money_Flow_Sum > 4.62519e+07 )
				if( Positive_Money_Flow <= 1.10773e+07 )
					if( Typical_Price <= 18.4122 )
						if( Negative_Money_Flow_Sum <= 2.24897e+07 )
							if( Negative_Money_Flow_Sum <= 1.3956e+07 )
								ret := 0.528634
							if( Negative_Money_Flow_Sum > 1.3956e+07 )
								ret := -0.178571
						if( Negative_Money_Flow_Sum > 2.24897e+07 )
							if( Typical_Price <= 12.1292 )
								ret := -0.347826
							if( Typical_Price > 12.1292 )
								ret := 0.637224
					if( Typical_Price > 18.4122 )
						if( Negative_Money_Flow_Sum <= 1.35735e+07 )
							ret := -0.428571
						if( Negative_Money_Flow_Sum > 1.35735e+07 )
							ret := -1.000000 // sell
				if( Positive_Money_Flow > 1.10773e+07 )
					if( Negative_Money_Flow_Sum <= 2.07709e+08 )
						if( Positive_Money_Flow_Sum <= 1.01976e+08 )
							if( Money_Flow_Ratio <= 2.47481 )
								ret := -0.461538
							if( Money_Flow_Ratio > 2.47481 )
								ret := 0.265306
						if( Positive_Money_Flow_Sum > 1.01976e+08 )
							if( Typical_Price <= 15.9917 )
								ret := -0.250000
							if( Typical_Price > 15.9917 )
								ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 2.07709e+08 )
						ret := 1.000000 // buy
	if( Negative_Money_Flow > 5.84619 )
		if( bullPower <= -0.007895 )
			if( Negative_Money_Flow <= 17985.4 )
				if( bbm <= 6e-06 )
					if( Money_Flow_Ratio <= 1.03649 )
						if( Negative_Money_Flow_Sum <= 178436 )
							if( Negative_Money_Flow_Sum <= 102344 )
								ret := 0.136646
							if( Negative_Money_Flow_Sum > 102344 )
								ret := 0.360996
						if( Negative_Money_Flow_Sum > 178436 )
							if( MFI_Low <= 28.7042 )
								ret := 0.134783
							if( MFI_Low > 28.7042 )
								ret := -0.555556
					if( Money_Flow_Ratio > 1.03649 )
						if( Negative_Money_Flow <= 2349.54 )
							if( Positive_Money_Flow <= 391.896 )
								ret := 0.526596
							if( Positive_Money_Flow > 391.896 )
								ret := 1.000000 // buy
						if( Negative_Money_Flow > 2349.54 )
							if( Positive_Money_Flow_Sum <= 271798 )
								ret := 0.397980
							if( Positive_Money_Flow_Sum > 271798 )
								ret := 0.093750
				if( bbm > 6e-06 )
					if( bbm <= 0.009671 )
						if( Raw_Money_Flow <= 14210.6 )
							if( bearPower <= -0.013168 )
								ret := 0.719807 // buy
							if( bearPower > -0.013168 )
								ret := 0.333333
						if( Raw_Money_Flow > 14210.6 )
							if( Raw_Money_Flow <= 15434.7 )
								ret := -0.083333
							if( Raw_Money_Flow > 15434.7 )
								ret := 0.511364
					if( bbm > 0.009671 )
						if( Negative_Money_Flow_Sum <= 57020.5 )
							if( Negative_Money_Flow_Sum <= 42023.5 )
								ret := 0.411765
							if( Negative_Money_Flow_Sum > 42023.5 )
								ret := -0.555556
						if( Negative_Money_Flow_Sum > 57020.5 )
							if( Negative_Money_Flow_Sum <= 1.3921e+06 )
								ret := 0.423868
							if( Negative_Money_Flow_Sum > 1.3921e+06 )
								ret := -0.080645
			if( Negative_Money_Flow > 17985.4 )
				if( bullPower <= -0.024729 )
					if( bearPower <= -0.294618 )
						if( Typical_Price <= 13.9448 )
							if( bbp <= -0.645166 )
								ret := -0.923077 // sell
							if( bbp > -0.645166 )
								ret := -0.283019
						if( Typical_Price > 13.9448 )
							if( Raw_Money_Flow <= 1.99568e+06 )
								ret := 0.681818
							if( Raw_Money_Flow > 1.99568e+06 )
								ret := -0.173077
					if( bearPower > -0.294618 )
						if( Negative_Money_Flow_Sum <= 8.70118e+07 )
							if( Positive_Money_Flow_Sum <= 1.76324e+06 )
								ret := 0.248156
							if( Positive_Money_Flow_Sum > 1.76324e+06 )
								ret := 0.143054
						if( Negative_Money_Flow_Sum > 8.70118e+07 )
							if( Raw_Money_Flow <= 1.48156e+07 )
								ret := 0.767857 // buy
							if( Raw_Money_Flow > 1.48156e+07 )
								ret := 0.000000
				if( bullPower > -0.024729 )
					if( Positive_Money_Flow_Sum <= 763162 )
						if( Raw_Money_Flow <= 710099 )
							if( Typical_Price <= 13.0201 )
								ret := 0.266440
							if( Typical_Price > 13.0201 )
								ret := 0.102999
						if( Raw_Money_Flow > 710099 )
							if( Negative_Money_Flow_Sum <= 1.40029e+07 )
								ret := -0.400000
							if( Negative_Money_Flow_Sum > 1.40029e+07 )
								ret := 0.714286 // buy
					if( Positive_Money_Flow_Sum > 763162 )
						if( bearPower <= -0.05079 )
							if( Raw_Money_Flow <= 3.00284e+06 )
								ret := 0.193686
							if( Raw_Money_Flow > 3.00284e+06 )
								ret := -0.127572
						if( bearPower > -0.05079 )
							if( Raw_Money_Flow <= 2.4712e+06 )
								ret := 0.000000
							if( Raw_Money_Flow > 2.4712e+06 )
								ret := 0.312500
		if( bullPower > -0.007895 )
			if( Positive_Money_Flow_Sum <= 145271 )
				if( BBPower_Color <= 0.5 )
					if( MFI_High <= -28.0689 )
						if( bearPower <= 0.012945 )
							if( Typical_Price <= 10.3478 )
								ret := 0.288486
							if( Typical_Price > 10.3478 )
								ret := 0.136629
						if( bearPower > 0.012945 )
							if( MFI_Low <= 9.07221 )
								ret := -1.000000 // sell
							if( MFI_Low > 9.07221 )
								ret := -0.222222
					if( MFI_High > -28.0689 )
						if( bbm <= 0.000512 )
							if( Negative_Money_Flow <= 871.077 )
								ret := 0.709677 // buy
							if( Negative_Money_Flow > 871.077 )
								ret := 0.205508
						if( bbm > 0.000512 )
							if( Raw_Money_Flow <= 38525 )
								ret := 0.603627
							if( Raw_Money_Flow > 38525 )
								ret := -0.125000
				if( BBPower_Color > 0.5 )
					if( bearPower <= 0.009111 )
						if( Positive_Money_Flow <= 63.0924 )
							if( bbm <= 0.001088 )
								ret := 0.012681
							if( bbm > 0.001088 )
								ret := 0.146474
						if( Positive_Money_Flow > 63.0924 )
							if( MFI_Low <= 35.691 )
								ret := -0.684211
							if( MFI_Low > 35.691 )
								ret := 0.142857
					if( bearPower > 0.009111 )
						if( Positive_Money_Flow <= 127.816 )
							if( Money_Flow_Ratio <= 2.00781 )
								ret := -0.096386
							if( Money_Flow_Ratio > 2.00781 )
								ret := -0.408163
						if( Positive_Money_Flow > 127.816 )
							if( Raw_Money_Flow <= 5089.28 )
								ret := -0.869565 // sell
							if( Raw_Money_Flow > 5089.28 )
								ret := -0.333333
			if( Positive_Money_Flow_Sum > 145271 )
				if( bbm <= 0.060684 )
					if( bearPower <= 0.0356 )
						if( Negative_Money_Flow_Sum <= 1.05265e+07 )
							if( Negative_Money_Flow <= 870554 )
								ret := 0.037185
							if( Negative_Money_Flow > 870554 )
								ret := 0.107768
						if( Negative_Money_Flow_Sum > 1.05265e+07 )
							if( Money_Flow_Ratio <= 0.427996 )
								ret := 0.102215
							if( Money_Flow_Ratio > 0.427996 )
								ret := -0.094041
					if( bearPower > 0.0356 )
						if( Positive_Money_Flow_Sum <= 5.50114e+06 )
							if( Negative_Money_Flow_Sum <= 192849 )
								ret := -0.037037
							if( Negative_Money_Flow_Sum > 192849 )
								ret := -0.571429
						if( Positive_Money_Flow_Sum > 5.50114e+06 )
							if( Typical_Price <= 10.8051 )
								ret := 0.323944
							if( Typical_Price > 10.8051 )
								ret := -0.115282
				if( bbm > 0.060684 )
					if( Raw_Money_Flow <= 116845 )
						if( Raw_Money_Flow <= 58254.9 )
							if( Typical_Price <= 13.7269 )
								ret := 0.134328
							if( Typical_Price > 13.7269 )
								ret := 0.739130 // buy
						if( Raw_Money_Flow > 58254.9 )
							if( MFI_High <= -26.3425 )
								ret := 0.500000
							if( MFI_High > -26.3425 )
								ret := 0.930556 // buy
					if( Raw_Money_Flow > 116845 )
						if( MFI <= 84.6913 )
							if( MFI <= 6.7636 )
								ret := -0.471698
							if( MFI > 6.7636 )
								ret := 0.148845
						if( MFI > 84.6913 )
							if( bearPower <= 0.044283 )
								ret := -0.793651 // sell
							if( bearPower > 0.044283 )
								ret := 0.135135
	
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
float op_operation = decision_tree_0_RIVN_1Min_453ad548(bbm, bearPower, bbp, bullPower, BBPower_Color, Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)

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


