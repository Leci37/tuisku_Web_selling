//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_MA_Cross_SMA, L_Money_Flow_Index
// ID_model: SNAP_1Min_2MM0_c5e9ded9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNAP_1Min_2MM0_c5e9ded9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNAP_1Min_c5e9ded9(Short_Long_Diff, MA_Cross, Long_MA, Short_MA, Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( Positive_Money_Flow <= 0.046902 )
		if( Positive_Money_Flow_Sum <= 151060 )
			if( Money_Flow_Ratio <= 1.39426 )
				if( Short_MA <= 14.1139 )
					if( Negative_Money_Flow <= 45.7383 )
						if( Short_Long_Diff <= -0.007754 )
							if( Positive_Money_Flow_Sum <= 11139 )
								ret := 0.707317 // buy
							if( Positive_Money_Flow_Sum > 11139 )
								ret := 0.287081
						if( Short_Long_Diff > -0.007754 )
							if( Short_MA <= 9.71452 )
								ret := -0.004878
							if( Short_MA > 9.71452 )
								ret := 0.233918
					if( Negative_Money_Flow > 45.7383 )
						if( Money_Flow_Ratio <= 0.184584 )
							if( Positive_Money_Flow_Sum <= 45517.3 )
								ret := 0.163793
							if( Positive_Money_Flow_Sum > 45517.3 )
								ret := 0.347368
						if( Money_Flow_Ratio > 0.184584 )
							if( Short_Long_Diff <= -0.008988 )
								ret := 0.602941
							if( Short_Long_Diff > -0.008988 )
								ret := 0.380107
				if( Short_MA > 14.1139 )
					if( Short_Long_Diff <= -0.009227 )
						if( Raw_Money_Flow <= 3.92221e+06 )
							if( Negative_Money_Flow_Sum <= 40045.1 )
								ret := -0.080000
							if( Negative_Money_Flow_Sum > 40045.1 )
								ret := 0.359649
						if( Raw_Money_Flow > 3.92221e+06 )
							ret := -0.857143 // sell
					if( Short_Long_Diff > -0.009227 )
						if( Raw_Money_Flow <= 1.5166e+06 )
							if( Positive_Money_Flow_Sum <= 98633.1 )
								ret := 0.117384
							if( Positive_Money_Flow_Sum > 98633.1 )
								ret := 0.323651
						if( Raw_Money_Flow > 1.5166e+06 )
							if( Raw_Money_Flow <= 3.36158e+06 )
								ret := -1.000000 // sell
							if( Raw_Money_Flow > 3.36158e+06 )
								ret := -0.500000
			if( Money_Flow_Ratio > 1.39426 )
				if( Short_Long_Diff <= 0.018621 )
					if( Positive_Money_Flow_Sum <= 72619.9 )
						if( Negative_Money_Flow <= 4720.94 )
							if( Money_Flow_Ratio <= 3.28523 )
								ret := 0.134066
							if( Money_Flow_Ratio > 3.28523 )
								ret := -0.214815
						if( Negative_Money_Flow > 4720.94 )
							if( Short_Long_Diff <= 0.011992 )
								ret := -0.380000
							if( Short_Long_Diff > 0.011992 )
								ret := 0.315789
					if( Positive_Money_Flow_Sum > 72619.9 )
						if( Negative_Money_Flow_Sum <= 34645 )
							if( Positive_Money_Flow_Sum <= 81005.5 )
								ret := 0.739726 // buy
							if( Positive_Money_Flow_Sum > 81005.5 )
								ret := 0.333333
						if( Negative_Money_Flow_Sum > 34645 )
							if( MFI_Low <= 41.6244 )
								ret := 0.294643
							if( MFI_Low > 41.6244 )
								ret := 0.000000
				if( Short_Long_Diff > 0.018621 )
					if( Positive_Money_Flow_Sum <= 141038 )
						if( Negative_Money_Flow <= 482.005 )
							if( Typical_Price <= 16.285 )
								ret := -0.568421
							if( Typical_Price > 16.285 )
								ret := 0.500000
						if( Negative_Money_Flow > 482.005 )
							if( Short_Long_Diff <= 0.042649 )
								ret := 0.110345
							if( Short_Long_Diff > 0.042649 )
								ret := -0.409091
					if( Positive_Money_Flow_Sum > 141038 )
						if( Short_MA <= 14.9656 )
							ret := 1.000000 // buy
						if( Short_MA > 14.9656 )
							if( MFI_Low <= 47.7005 )
								ret := 0.250000
							if( MFI_Low > 47.7005 )
								ret := -0.500000
		if( Positive_Money_Flow_Sum > 151060 )
			if( Negative_Money_Flow_Sum <= 3.55004e+07 )
				if( Short_Long_Diff <= 0.010002 )
					if( Negative_Money_Flow_Sum <= 920883 )
						if( Negative_Money_Flow <= 6.10893 )
							if( Short_MA <= 15.1334 )
								ret := -0.027586
							if( Short_MA > 15.1334 )
								ret := -0.137931
						if( Negative_Money_Flow > 6.10893 )
							if( Positive_Money_Flow_Sum <= 223697 )
								ret := -0.005639
							if( Positive_Money_Flow_Sum > 223697 )
								ret := 0.262963
					if( Negative_Money_Flow_Sum > 920883 )
						if( Positive_Money_Flow_Sum <= 1.47757e+06 )
							if( MFI <= 7.56745 )
								ret := 0.138952
							if( MFI > 7.56745 )
								ret := -0.057296
						if( Positive_Money_Flow_Sum > 1.47757e+06 )
							if( Positive_Money_Flow_Sum <= 2.90251e+06 )
								ret := 0.108403
							if( Positive_Money_Flow_Sum > 2.90251e+06 )
								ret := 0.018127
				if( Short_Long_Diff > 0.010002 )
					if( Positive_Money_Flow_Sum <= 1.0209e+07 )
						if( Typical_Price <= 9.48322 )
							if( Short_Long_Diff <= 0.015107 )
								ret := -0.030120
							if( Short_Long_Diff > 0.015107 )
								ret := 0.170960
						if( Typical_Price > 9.48322 )
							if( Positive_Money_Flow_Sum <= 386762 )
								ret := 0.149497
							if( Positive_Money_Flow_Sum > 386762 )
								ret := -0.079159
					if( Positive_Money_Flow_Sum > 1.0209e+07 )
						if( Raw_Money_Flow <= 447061 )
							if( Negative_Money_Flow_Sum <= 4.72297e+06 )
								ret := -0.488722
							if( Negative_Money_Flow_Sum > 4.72297e+06 )
								ret := 0.075758
						if( Raw_Money_Flow > 447061 )
							if( Positive_Money_Flow_Sum <= 2.4788e+07 )
								ret := 0.094127
							if( Positive_Money_Flow_Sum > 2.4788e+07 )
								ret := 0.403042
			if( Negative_Money_Flow_Sum > 3.55004e+07 )
				if( MA_Cross <= 0.008328 )
					if( Money_Flow_Ratio <= 0.057998 )
						if( Raw_Money_Flow <= 109195 )
							if( Negative_Money_Flow_Sum <= 9.83701e+07 )
								ret := 0.500000
							if( Negative_Money_Flow_Sum > 9.83701e+07 )
								ret := 0.000000
						if( Raw_Money_Flow > 109195 )
							if( Negative_Money_Flow_Sum <= 4.76114e+07 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 4.76114e+07 )
								ret := 0.771429 // buy
					if( Money_Flow_Ratio > 0.057998 )
						if( Positive_Money_Flow_Sum <= 3.35133e+06 )
							if( Negative_Money_Flow <= 3.87144e+06 )
								ret := -0.400000
							if( Negative_Money_Flow > 3.87144e+06 )
								ret := -0.888889 // sell
						if( Positive_Money_Flow_Sum > 3.35133e+06 )
							if( Short_MA <= 10.0681 )
								ret := 0.744186 // buy
							if( Short_MA > 10.0681 )
								ret := 0.228477
				if( MA_Cross > 0.008328 )
					ret := -1.000000 // sell
	if( Positive_Money_Flow > 0.046902 )
		if( Negative_Money_Flow_Sum <= 521086 )
			if( Short_Long_Diff <= 0.032433 )
				if( Negative_Money_Flow <= 126.363 )
					if( Positive_Money_Flow_Sum <= 55752.4 )
						if( Short_Long_Diff <= -0.00515 )
							if( MFI_High <= -61.6935 )
								ret := -0.188034
							if( MFI_High > -61.6935 )
								ret := 0.144218
						if( Short_Long_Diff > -0.00515 )
							if( Positive_Money_Flow_Sum <= 13085.2 )
								ret := -0.592593
							if( Positive_Money_Flow_Sum > 13085.2 )
								ret := -0.187578
					if( Positive_Money_Flow_Sum > 55752.4 )
						if( Raw_Money_Flow <= 3231.29 )
							if( MA_Cross <= 0.039927 )
								ret := -0.354503
							if( MA_Cross > 0.039927 )
								ret := -0.814433 // sell
						if( Raw_Money_Flow > 3231.29 )
							if( Positive_Money_Flow_Sum <= 137790 )
								ret := -0.268990
							if( Positive_Money_Flow_Sum > 137790 )
								ret := -0.135389
				if( Negative_Money_Flow > 126.363 )
					if( MA_Cross <= 1.21976 )
						if( Negative_Money_Flow_Sum <= 166640 )
							if( Short_Long_Diff <= 0.028348 )
								ret := 0.280677
							if( Short_Long_Diff > 0.028348 )
								ret := -0.800000 // sell
						if( Negative_Money_Flow_Sum > 166640 )
							if( MFI_Low <= -10.51 )
								ret := -0.657143
							if( MFI_Low > -10.51 )
								ret := 0.019892
					if( MA_Cross > 1.21976 )
						if( Negative_Money_Flow_Sum <= 72221.9 )
							if( Short_Long_Diff <= 0.002699 )
								ret := 0.000000
							if( Short_Long_Diff > 0.002699 )
								ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 72221.9 )
							if( MFI <= 75.5585 )
								ret := -0.333333
							if( MFI > 75.5585 )
								ret := 0.636364
			if( Short_Long_Diff > 0.032433 )
				if( Negative_Money_Flow_Sum <= 119564 )
					if( Positive_Money_Flow_Sum <= 146111 )
						if( MFI_High <= 4.73302 )
							if( MFI <= 44.4513 )
								ret := 0.333333
							if( MFI > 44.4513 )
								ret := -0.492063
						if( MFI_High > 4.73302 )
							if( Long_MA <= 14.4486 )
								ret := 0.785714 // buy
							if( Long_MA > 14.4486 )
								ret := -0.500000
					if( Positive_Money_Flow_Sum > 146111 )
						if( Short_Long_Diff <= 0.116444 )
							if( Positive_Money_Flow_Sum <= 6.25891e+06 )
								ret := -0.783607 // sell
							if( Positive_Money_Flow_Sum > 6.25891e+06 )
								ret := -0.114286
						if( Short_Long_Diff > 0.116444 )
							ret := 0.800000 // buy
				if( Negative_Money_Flow_Sum > 119564 )
					if( Positive_Money_Flow_Sum <= 1.05219e+07 )
						if( Positive_Money_Flow_Sum <= 6.39457e+06 )
							if( Short_MA <= 12.768 )
								ret := -0.590909
							if( Short_MA > 12.768 )
								ret := -0.126374
						if( Positive_Money_Flow_Sum > 6.39457e+06 )
							if( Long_MA <= 13.8583 )
								ret := 0.720000 // buy
							if( Long_MA > 13.8583 )
								ret := -0.352941
					if( Positive_Money_Flow_Sum > 1.05219e+07 )
						if( Raw_Money_Flow <= 653546 )
							ret := 0.750000 // buy
						if( Raw_Money_Flow > 653546 )
							if( Negative_Money_Flow_Sum <= 509572 )
								ret := -0.969697 // sell
							if( Negative_Money_Flow_Sum > 509572 )
								ret := -0.500000
		if( Negative_Money_Flow_Sum > 521086 )
			if( MFI_Low <= 45.0172 )
				if( Short_Long_Diff <= -0.195903 )
					if( Negative_Money_Flow_Sum <= 2.43041e+07 )
						if( MFI_High <= -46.4395 )
							if( Typical_Price <= 15.3353 )
								ret := 0.750000 // buy
							if( Typical_Price > 15.3353 )
								ret := 1.000000 // buy
						if( MFI_High > -46.4395 )
							if( Positive_Money_Flow_Sum <= 1.51788e+06 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 1.51788e+06 )
								ret := 0.000000
					if( Negative_Money_Flow_Sum > 2.43041e+07 )
						ret := 1.000000 // buy
				if( Short_Long_Diff > -0.195903 )
					if( Negative_Money_Flow_Sum <= 1.17903e+07 )
						if( Positive_Money_Flow_Sum <= 984644 )
							if( Raw_Money_Flow <= 44848.7 )
								ret := 0.000000
							if( Raw_Money_Flow > 44848.7 )
								ret := -0.211602
						if( Positive_Money_Flow_Sum > 984644 )
							if( Short_MA <= 14.0981 )
								ret := -0.015641
							if( Short_MA > 14.0981 )
								ret := 0.069552
					if( Negative_Money_Flow_Sum > 1.17903e+07 )
						if( Raw_Money_Flow <= 6.14055e+06 )
							if( Short_Long_Diff <= -0.077022 )
								ret := 0.244147
							if( Short_Long_Diff > -0.077022 )
								ret := -0.170483
						if( Raw_Money_Flow > 6.14055e+06 )
							if( Short_Long_Diff <= -0.098636 )
								ret := 0.555556
							if( Short_Long_Diff > -0.098636 )
								ret := -0.574074
			if( MFI_Low > 45.0172 )
				if( Raw_Money_Flow <= 3.56782e+06 )
					if( Positive_Money_Flow_Sum <= 2.81771e+07 )
						if( Negative_Money_Flow_Sum <= 2.9428e+06 )
							if( Positive_Money_Flow_Sum <= 8.92563e+06 )
								ret := -0.087733
							if( Positive_Money_Flow_Sum > 8.92563e+06 )
								ret := 0.060570
						if( Negative_Money_Flow_Sum > 2.9428e+06 )
							if( Short_Long_Diff <= -0.06433 )
								ret := 0.931034 // buy
							if( Short_Long_Diff > -0.06433 )
								ret := -0.246005
					if( Positive_Money_Flow_Sum > 2.81771e+07 )
						if( Short_Long_Diff <= 0.017842 )
							if( Short_Long_Diff <= -0.00469 )
								ret := -0.622222
							if( Short_Long_Diff > -0.00469 )
								ret := -0.111111
						if( Short_Long_Diff > 0.017842 )
							if( Long_MA <= 15.3141 )
								ret := 0.620253
							if( Long_MA > 15.3141 )
								ret := -0.094340
				if( Raw_Money_Flow > 3.56782e+06 )
					if( Positive_Money_Flow_Sum <= 1.0429e+07 )
						if( Short_Long_Diff <= 0.000136 )
							if( Positive_Money_Flow <= 5.10996e+06 )
								ret := -0.666667
							if( Positive_Money_Flow > 5.10996e+06 )
								ret := 0.250000
						if( Short_Long_Diff > 0.000136 )
							if( Money_Flow_Ratio <= 4.31807 )
								ret := 0.363636
							if( Money_Flow_Ratio > 4.31807 )
								ret := 0.933333 // buy
					if( Positive_Money_Flow_Sum > 1.0429e+07 )
						if( Money_Flow_Ratio <= 2.09677 )
							if( Positive_Money_Flow <= 4.09292e+06 )
								ret := -0.428571
							if( Positive_Money_Flow > 4.09292e+06 )
								ret := 0.500000
						if( Money_Flow_Ratio > 2.09677 )
							if( MFI <= 82.3728 )
								ret := -0.642308
							if( MFI > 82.3728 )
								ret := -0.189655
	
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
float op_operation = decision_tree_0_SNAP_1Min_c5e9ded9(Short_Long_Diff, MA_Cross, Long_MA, Short_MA, Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)

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


