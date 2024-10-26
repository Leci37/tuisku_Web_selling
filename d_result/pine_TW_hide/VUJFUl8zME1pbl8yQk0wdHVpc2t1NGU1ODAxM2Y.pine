//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: UBER_30Min_2BM0_4e58013f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UBER_30Min_2BM0_4e58013f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UBER_30Min_4e58013f(bbp, bullPower, BBPower_Color, bearPower, bbm, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( Positive_Money_Flow <= 1114.79 )
		if( Raw_Money_Flow <= 1.44111e+07 )
			if( bbp <= -0.413653 )
				if( Positive_Money_Flow_Sum <= 8.80628e+08 )
					if( Positive_Money_Flow_Sum <= 570133 )
						if( MFI_Low <= -19.9139 )
							ret := 0.842105 // buy
						if( MFI_Low > -19.9139 )
							ret := -0.200000
					if( Positive_Money_Flow_Sum > 570133 )
						if( Typical_Price <= 67.9913 )
							ret := 0.284946
						if( Typical_Price > 67.9913 )
							ret := -0.070866
				if( Positive_Money_Flow_Sum > 8.80628e+08 )
					if( MFI_Low <= 41.5274 )
						ret := -0.363636
					if( MFI_Low > 41.5274 )
						ret := -0.909091 // sell
			if( bbp > -0.413653 )
				if( BBPower_Color <= 0.5 )
					if( Money_Flow_Ratio <= 0.768412 )
						if( Money_Flow_Ratio <= 0.143727 )
							ret := 0.218950
						if( Money_Flow_Ratio > 0.143727 )
							ret := 0.012078
					if( Money_Flow_Ratio > 0.768412 )
						if( Money_Flow_Ratio <= 5.53196 )
							ret := 0.240581
						if( Money_Flow_Ratio > 5.53196 )
							ret := -0.032200
				if( BBPower_Color > 0.5 )
					if( bbm <= 0.561004 )
						if( bbm <= 0.451245 )
							ret := 0.018605
						if( bbm > 0.451245 )
							ret := -0.320000
					if( bbm > 0.561004 )
						if( bbp <= 0.517801 )
							ret := 0.637363
						if( bbp > 0.517801 )
							ret := 0.230769
		if( Raw_Money_Flow > 1.44111e+07 )
			if( Positive_Money_Flow_Sum <= 3.1626e+08 )
				if( Typical_Price <= 27.5746 )
					if( bearPower <= -1.04807 )
						if( Typical_Price <= 26.7222 )
							ret := 0.940299 // buy
						if( Typical_Price > 26.7222 )
							ret := 0.416667
					if( bearPower > -1.04807 )
						if( Negative_Money_Flow <= 8.44497e+07 )
							ret := 0.249389
						if( Negative_Money_Flow > 8.44497e+07 )
							ret := -0.262069
				if( Typical_Price > 27.5746 )
					if( MFI_High <= -12.527 )
						if( bbp <= -0.704174 )
							ret := 0.082040
						if( bbp > -0.704174 )
							ret := -0.083994
					if( MFI_High > -12.527 )
						if( MFI <= 70.0281 )
							ret := 0.568493
						if( MFI > 70.0281 )
							ret := 0.128571
			if( Positive_Money_Flow_Sum > 3.1626e+08 )
				if( Positive_Money_Flow_Sum <= 4.49172e+08 )
					if( bearPower <= -0.288456 )
						if( Typical_Price <= 57.9722 )
							ret := -0.460722
						if( Typical_Price > 57.9722 )
							ret := 0.055556
					if( bearPower > -0.288456 )
						if( MFI_Low <= 67.3302 )
							ret := -0.127030
						if( MFI_Low > 67.3302 )
							ret := -0.641509
				if( Positive_Money_Flow_Sum > 4.49172e+08 )
					if( Negative_Money_Flow_Sum <= 9.11233e+08 )
						if( bearPower <= -0.915418 )
							ret := 0.548387
						if( bearPower > -0.915418 )
							ret := -0.009524
					if( Negative_Money_Flow_Sum > 9.11233e+08 )
						if( bbm <= 0.609928 )
							ret := -0.169492
						if( bbm > 0.609928 )
							ret := -0.622222
	if( Positive_Money_Flow > 1114.79 )
		if( Positive_Money_Flow <= 1.70474e+08 )
			if( Negative_Money_Flow_Sum <= 3.64186e+08 )
				if( Negative_Money_Flow_Sum <= 6.33224e+07 )
					if( Raw_Money_Flow <= 2.37818e+06 )
						if( Negative_Money_Flow_Sum <= 1.8598e+06 )
							ret := -0.039143
						if( Negative_Money_Flow_Sum > 1.8598e+06 )
							ret := -0.232113
					if( Raw_Money_Flow > 2.37818e+06 )
						if( Typical_Price <= 22.9392 )
							ret := 0.630137
						if( Typical_Price > 22.9392 )
							ret := -0.009646
				if( Negative_Money_Flow_Sum > 6.33224e+07 )
					if( Raw_Money_Flow <= 6.17272e+07 )
						if( Money_Flow_Ratio <= 0.247335 )
							ret := -0.082371
						if( Money_Flow_Ratio > 0.247335 )
							ret := 0.041593
					if( Raw_Money_Flow > 6.17272e+07 )
						if( MFI_High <= -57.605 )
							ret := 0.671875
						if( MFI_High > -57.605 )
							ret := -0.131407
			if( Negative_Money_Flow_Sum > 3.64186e+08 )
				if( Money_Flow_Ratio <= 0.006505 )
					if( Negative_Money_Flow_Sum <= 7.72288e+08 )
						if( bbp <= -0.049384 )
							ret := 0.714286 // buy
						if( bbp > -0.049384 )
							ret := 0.107143
					if( Negative_Money_Flow_Sum > 7.72288e+08 )
						ret := -0.769231 // sell
				if( Money_Flow_Ratio > 0.006505 )
					if( Raw_Money_Flow <= 8.82683e+07 )
						if( MFI_High <= -12.3525 )
							ret := -0.185663
						if( MFI_High > -12.3525 )
							ret := 0.281250
					if( Raw_Money_Flow > 8.82683e+07 )
						if( bbm <= 0.535696 )
							ret := 0.164786
						if( bbm > 0.535696 )
							ret := -0.289753
		if( Positive_Money_Flow > 1.70474e+08 )
			if( Money_Flow_Ratio <= 112.427 )
				if( Positive_Money_Flow <= 2.48336e+08 )
					if( Raw_Money_Flow <= 2.05167e+08 )
						if( Typical_Price <= 28.7427 )
							ret := -0.727273 // sell
						if( Typical_Price > 28.7427 )
							ret := 0.109524
					if( Raw_Money_Flow > 2.05167e+08 )
						if( bbm <= 0.830255 )
							ret := 0.072289
						if( bbm > 0.830255 )
							ret := 0.732824 // buy
				if( Positive_Money_Flow > 2.48336e+08 )
					if( Positive_Money_Flow_Sum <= 1.78829e+09 )
						if( BBPower_Color <= 0.5 )
							ret := -0.794872 // sell
						if( BBPower_Color > 0.5 )
							ret := -0.036842
					if( Positive_Money_Flow_Sum > 1.78829e+09 )
						if( Typical_Price <= 63.0005 )
							ret := 0.000000
						if( Typical_Price > 63.0005 )
							ret := 0.741935 // buy
			if( Money_Flow_Ratio > 112.427 )
				if( bbm <= 0.719553 )
					if( Typical_Price <= 47.1014 )
						ret := 0.846154 // buy
					if( Typical_Price > 47.1014 )
						ret := -0.071429
				if( bbm > 0.719553 )
					if( bbp <= 1.43793 )
						ret := 0.600000
					if( bbp > 1.43793 )
						if( Positive_Money_Flow_Sum <= 7.72673e+08 )
							ret := 0.973333 // buy
						if( Positive_Money_Flow_Sum > 7.72673e+08 )
							ret := 0.500000
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_UBER_30Min_4e58013f(bbp, bullPower, BBPower_Color, bearPower, bbm, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)

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


