//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_MA_Cross_SMA, L_Money_Flow_Index
// ID_model: LYFT_1Min_2MM0_36d89d1a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LYFT_1Min_2MM0_36d89d1a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LYFT_1Min_36d89d1a(Short_MA, Long_MA, Short_Long_Diff, MA_Cross, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( Negative_Money_Flow <= 1.01061 )
		if( Raw_Money_Flow <= 45795.6 )
			if( Positive_Money_Flow <= 714.021 )
				if( Negative_Money_Flow_Sum <= 437067 )
					if( Short_Long_Diff <= -0.006699 )
						if( Positive_Money_Flow <= 280.834 )
							if( Raw_Money_Flow <= 3943.02 )
								ret := 0.037037
							if( Raw_Money_Flow > 3943.02 )
								ret := 0.385542
						if( Positive_Money_Flow > 280.834 )
							if( Positive_Money_Flow_Sum <= 70504.9 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 70504.9 )
								ret := 0.428571
					if( Short_Long_Diff > -0.006699 )
						if( Positive_Money_Flow_Sum <= 95751 )
							if( MFI <= 37.052 )
								ret := 0.156863
							if( MFI > 37.052 )
								ret := -0.157248
						if( Positive_Money_Flow_Sum > 95751 )
							if( Negative_Money_Flow_Sum <= 26916.4 )
								ret := 0.450000
							if( Negative_Money_Flow_Sum > 26916.4 )
								ret := 0.090674
				if( Negative_Money_Flow_Sum > 437067 )
					if( Positive_Money_Flow <= 42.6028 )
						if( Raw_Money_Flow <= 42564.4 )
							if( Short_MA <= 12.1878 )
								ret := -0.147368
							if( Short_MA > 12.1878 )
								ret := -0.004525
						if( Raw_Money_Flow > 42564.4 )
							ret := -0.461538
					if( Positive_Money_Flow > 42.6028 )
						ret := -0.600000
			if( Positive_Money_Flow > 714.021 )
				if( Short_Long_Diff <= 0.012731 )
					if( Positive_Money_Flow <= 12361.1 )
						if( Money_Flow_Ratio <= 0.589092 )
							if( Short_Long_Diff <= -0.002997 )
								ret := -0.007174
							if( Short_Long_Diff > -0.002997 )
								ret := -0.241895
						if( Money_Flow_Ratio > 0.589092 )
							if( Positive_Money_Flow_Sum <= 21071.4 )
								ret := -0.666667
							if( Positive_Money_Flow_Sum > 21071.4 )
								ret := -0.218376
					if( Positive_Money_Flow > 12361.1 )
						if( MFI_Low <= 45.3921 )
							if( Negative_Money_Flow_Sum <= 1.12038e+06 )
								ret := -0.139963
							if( Negative_Money_Flow_Sum > 1.12038e+06 )
								ret := 0.080488
						if( MFI_Low > 45.3921 )
							if( MFI_Low <= 54.0596 )
								ret := 0.251232
							if( MFI_Low > 54.0596 )
								ret := -0.019231
				if( Short_Long_Diff > 0.012731 )
					if( Positive_Money_Flow_Sum <= 71204.1 )
						if( Negative_Money_Flow_Sum <= 229507 )
							if( Negative_Money_Flow_Sum <= 97311.2 )
								ret := -0.462428
							if( Negative_Money_Flow_Sum > 97311.2 )
								ret := -0.670103
						if( Negative_Money_Flow_Sum > 229507 )
							if( Short_Long_Diff <= 0.038581 )
								ret := 0.000000
							if( Short_Long_Diff > 0.038581 )
								ret := -0.625000
					if( Positive_Money_Flow_Sum > 71204.1 )
						if( Short_Long_Diff <= 0.074895 )
							if( Typical_Price <= 10.9963 )
								ret := 0.090090
							if( Typical_Price > 10.9963 )
								ret := -0.233635
						if( Short_Long_Diff > 0.074895 )
							if( MFI_High <= 10.6311 )
								ret := -0.780000 // sell
							if( MFI_High > 10.6311 )
								ret := -0.153846
		if( Raw_Money_Flow > 45795.6 )
			if( MFI <= 82.3542 )
				if( Positive_Money_Flow_Sum <= 4.95992e+06 )
					if( Negative_Money_Flow_Sum <= 9.36336e+06 )
						if( Typical_Price <= 12.61 )
							if( Negative_Money_Flow_Sum <= 1.57745e+06 )
								ret := 0.006774
							if( Negative_Money_Flow_Sum > 1.57745e+06 )
								ret := 0.089176
						if( Typical_Price > 12.61 )
							if( Positive_Money_Flow_Sum <= 3.74184e+06 )
								ret := -0.010946
							if( Positive_Money_Flow_Sum > 3.74184e+06 )
								ret := -0.147612
					if( Negative_Money_Flow_Sum > 9.36336e+06 )
						if( Short_MA <= 12.2163 )
							if( Raw_Money_Flow <= 842087 )
								ret := -0.600000
							if( Raw_Money_Flow > 842087 )
								ret := 0.416667
						if( Short_MA > 12.2163 )
							if( Short_Long_Diff <= -0.025231 )
								ret := 0.512821
							if( Short_Long_Diff > -0.025231 )
								ret := -0.172414
				if( Positive_Money_Flow_Sum > 4.95992e+06 )
					if( Short_Long_Diff <= -0.030001 )
						if( Positive_Money_Flow_Sum <= 1.53071e+07 )
							if( MFI <= 55.414 )
								ret := -0.137457
							if( MFI > 55.414 )
								ret := -0.630435
						if( Positive_Money_Flow_Sum > 1.53071e+07 )
							if( Positive_Money_Flow_Sum <= 3.90493e+07 )
								ret := 0.655172
							if( Positive_Money_Flow_Sum > 3.90493e+07 )
								ret := -0.900000 // sell
					if( Short_Long_Diff > -0.030001 )
						if( Positive_Money_Flow_Sum <= 4.67913e+07 )
							if( MFI <= 71.6087 )
								ret := 0.198590
							if( MFI > 71.6087 )
								ret := 0.011928
						if( Positive_Money_Flow_Sum > 4.67913e+07 )
							if( Raw_Money_Flow <= 3.54841e+06 )
								ret := -0.571429
							if( Raw_Money_Flow > 3.54841e+06 )
								ret := -0.952381 // sell
			if( MFI > 82.3542 )
				if( Short_Long_Diff <= 0.002364 )
					if( Raw_Money_Flow <= 97239.6 )
						if( Negative_Money_Flow_Sum <= 99088.8 )
							if( Negative_Money_Flow_Sum <= 25279.1 )
								ret := 0.333333
							if( Negative_Money_Flow_Sum > 25279.1 )
								ret := 0.904762 // buy
						if( Negative_Money_Flow_Sum > 99088.8 )
							ret := 0.250000
					if( Raw_Money_Flow > 97239.6 )
						if( Money_Flow_Ratio <= 38.2372 )
							if( Short_Long_Diff <= -0.008529 )
								ret := -0.051948
							if( Short_Long_Diff > -0.008529 )
								ret := 0.391304
						if( Money_Flow_Ratio > 38.2372 )
							if( Short_MA <= 12.4261 )
								ret := -0.285714
							if( Short_MA > 12.4261 )
								ret := -0.857143 // sell
				if( Short_Long_Diff > 0.002364 )
					if( Raw_Money_Flow <= 5.6037e+06 )
						if( Long_MA <= 11.6058 )
							if( Negative_Money_Flow_Sum <= 1.21759e+06 )
								ret := -0.070028
							if( Negative_Money_Flow_Sum > 1.21759e+06 )
								ret := 0.539683
						if( Long_MA > 11.6058 )
							if( Positive_Money_Flow_Sum <= 2.87884e+06 )
								ret := -0.065173
							if( Positive_Money_Flow_Sum > 2.87884e+06 )
								ret := -0.310379
					if( Raw_Money_Flow > 5.6037e+06 )
						if( Long_MA <= 16.7041 )
							if( Short_MA <= 15.6416 )
								ret := -0.913793 // sell
							if( Short_MA > 15.6416 )
								ret := -0.500000
						if( Long_MA > 16.7041 )
							ret := 0.250000
	if( Negative_Money_Flow > 1.01061 )
		if( Positive_Money_Flow_Sum <= 114627 )
			if( Negative_Money_Flow_Sum <= 1.94416e+06 )
				if( Raw_Money_Flow <= 15728.9 )
					if( Short_Long_Diff <= -0.00317 )
						if( Negative_Money_Flow_Sum <= 139111 )
							if( Positive_Money_Flow_Sum <= 111150 )
								ret := 0.617964
							if( Positive_Money_Flow_Sum > 111150 )
								ret := -0.857143 // sell
						if( Negative_Money_Flow_Sum > 139111 )
							if( Short_Long_Diff <= -0.180457 )
								ret := -1.000000 // sell
							if( Short_Long_Diff > -0.180457 )
								ret := 0.399598
					if( Short_Long_Diff > -0.00317 )
						if( Typical_Price <= 17.405 )
							if( Positive_Money_Flow <= 174.575 )
								ret := 0.373826
							if( Positive_Money_Flow > 174.575 )
								ret := 0.114155
						if( Typical_Price > 17.405 )
							if( Short_Long_Diff <= 0.012809 )
								ret := 0.222222
							if( Short_Long_Diff > 0.012809 )
								ret := -0.923077 // sell
				if( Raw_Money_Flow > 15728.9 )
					if( MFI_High <= -25.945 )
						if( Short_Long_Diff <= -0.024133 )
							if( MFI_Low <= 10.8996 )
								ret := -0.105691
							if( MFI_Low > 10.8996 )
								ret := 0.583333
						if( Short_Long_Diff > -0.024133 )
							if( Negative_Money_Flow <= 1.28798e+06 )
								ret := 0.358974
							if( Negative_Money_Flow > 1.28798e+06 )
								ret := -0.545455
					if( MFI_High > -25.945 )
						if( Negative_Money_Flow <= 23145.5 )
							if( Negative_Money_Flow <= 15951.4 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow > 15951.4 )
								ret := -0.512821
						if( Negative_Money_Flow > 23145.5 )
							if( Positive_Money_Flow_Sum <= 104762 )
								ret := 0.076923
							if( Positive_Money_Flow_Sum > 104762 )
								ret := 0.875000 // buy
			if( Negative_Money_Flow_Sum > 1.94416e+06 )
				if( Short_Long_Diff <= 0.005219 )
					if( Long_MA <= 16.4645 )
						if( Long_MA <= 13.9841 )
							if( Negative_Money_Flow_Sum <= 1.44373e+07 )
								ret := 0.230769
							if( Negative_Money_Flow_Sum > 1.44373e+07 )
								ret := -0.307692
						if( Long_MA > 13.9841 )
							if( Negative_Money_Flow <= 1.97932e+06 )
								ret := -0.727273 // sell
							if( Negative_Money_Flow > 1.97932e+06 )
								ret := 0.090909
					if( Long_MA > 16.4645 )
						ret := 0.818182 // buy
				if( Short_Long_Diff > 0.005219 )
					if( Negative_Money_Flow <= 72976.4 )
						ret := -0.444444
					if( Negative_Money_Flow > 72976.4 )
						ret := -1.000000 // sell
		if( Positive_Money_Flow_Sum > 114627 )
			if( Negative_Money_Flow_Sum <= 102852 )
				if( MFI <= 88.3583 )
					if( MFI_Low <= 37.9999 )
						if( Short_Long_Diff <= -0.002772 )
							if( Positive_Money_Flow <= 573.565 )
								ret := -0.571429
							if( Positive_Money_Flow > 573.565 )
								ret := -1.000000 // sell
						if( Short_Long_Diff > -0.002772 )
							ret := 0.571429
					if( MFI_Low > 37.9999 )
						if( Negative_Money_Flow_Sum <= 58255.1 )
							if( Negative_Money_Flow_Sum <= 33466.6 )
								ret := 0.651515
							if( Negative_Money_Flow_Sum > 33466.6 )
								ret := 0.180617
						if( Negative_Money_Flow_Sum > 58255.1 )
							if( Negative_Money_Flow <= 6496.26 )
								ret := 0.621528
							if( Negative_Money_Flow > 6496.26 )
								ret := 0.352941
				if( MFI > 88.3583 )
					if( Negative_Money_Flow_Sum <= 50505.6 )
						if( Positive_Money_Flow_Sum <= 1.14623e+06 )
							if( Raw_Money_Flow <= 3531.35 )
								ret := -0.090909
							if( Raw_Money_Flow > 3531.35 )
								ret := 0.458824
						if( Positive_Money_Flow_Sum > 1.14623e+06 )
							if( Positive_Money_Flow_Sum <= 1.44282e+06 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 1.44282e+06 )
								ret := 0.000000
					if( Negative_Money_Flow_Sum > 50505.6 )
						if( Positive_Money_Flow_Sum <= 716498 )
							if( Negative_Money_Flow <= 5626.39 )
								ret := -0.884615 // sell
							if( Negative_Money_Flow > 5626.39 )
								ret := -0.550000
						if( Positive_Money_Flow_Sum > 716498 )
							if( Negative_Money_Flow_Sum <= 96447.3 )
								ret := 0.190476
							if( Negative_Money_Flow_Sum > 96447.3 )
								ret := 0.900000 // buy
			if( Negative_Money_Flow_Sum > 102852 )
				if( Long_MA <= 11.2976 )
					if( Positive_Money_Flow_Sum <= 4.36885e+06 )
						if( MFI_Low <= 63.3562 )
							if( Positive_Money_Flow_Sum <= 117999 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 117999 )
								ret := 0.128886
						if( MFI_Low > 63.3562 )
							if( Raw_Money_Flow <= 100682 )
								ret := -0.428571
							if( Raw_Money_Flow > 100682 )
								ret := -0.863636 // sell
					if( Positive_Money_Flow_Sum > 4.36885e+06 )
						if( MFI <= 44.2169 )
							if( Raw_Money_Flow <= 932456 )
								ret := 0.515152
							if( Raw_Money_Flow > 932456 )
								ret := 0.853333 // buy
						if( MFI > 44.2169 )
							if( Positive_Money_Flow_Sum <= 4.64339e+07 )
								ret := 0.349817
							if( Positive_Money_Flow_Sum > 4.64339e+07 )
								ret := -1.000000 // sell
				if( Long_MA > 11.2976 )
					if( Short_Long_Diff <= -0.017121 )
						if( Negative_Money_Flow <= 5.06799e+06 )
							if( Positive_Money_Flow_Sum <= 306912 )
								ret := 0.279446
							if( Positive_Money_Flow_Sum > 306912 )
								ret := 0.089086
						if( Negative_Money_Flow > 5.06799e+06 )
							if( Positive_Money_Flow_Sum <= 7.68938e+06 )
								ret := 0.837209 // buy
							if( Positive_Money_Flow_Sum > 7.68938e+06 )
								ret := -0.142857
					if( Short_Long_Diff > -0.017121 )
						if( Short_Long_Diff <= 0.097499 )
							if( Typical_Price <= 17.5611 )
								ret := 0.041226
							if( Typical_Price > 17.5611 )
								ret := -0.310127
						if( Short_Long_Diff > 0.097499 )
							if( Negative_Money_Flow <= 215509 )
								ret := 0.313725
							if( Negative_Money_Flow > 215509 )
								ret := -0.376812
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_MA_Cross_SMA 
//@version=5
//indicator title="MA Cross", overlay=true)

shortlen = input.int(9, title="Short MA Length", minval=1)
longlen = input.int(21, title="Long MA Length", minval=1)

// Calculate the short and long simple moving averages (SMA)
Short_MA = ta.sma(close, shortlen)
Long_MA = ta.sma(close, longlen)

// Calculate the difference between short MA and long MA
Short_Long_Diff = Short_MA - Long_MA

// Identify crossover points where short MA crosses above or below the long MA
MA_Cross = ta.valuewhen(ta.crossover(Short_MA, Long_MA), Short_MA, 0)

// Plot the results
plot(Short_MA, color=color.orange, title="Short MA")
plot(Long_MA, color=color.green, title="Long MA")
plotshape(na(MA_Cross) ? na : MA_Cross, style=shape.cross, location=location.absolute, color=color.blue, title="Cross")


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
float op_operation = decision_tree_0_LYFT_1Min_36d89d1a(Short_MA, Long_MA, Short_Long_Diff, MA_Cross, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


