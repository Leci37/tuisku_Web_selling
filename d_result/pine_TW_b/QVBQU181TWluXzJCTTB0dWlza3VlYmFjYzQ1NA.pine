//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: APPS_5Min_2BM0_ebacc454 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_APPS_5Min_2BM0_ebacc454", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_APPS_5Min_ebacc454(bullPower, bbp, bearPower, bbm, BBPower_Color, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( Positive_Money_Flow <= 0.030115 )
		if( bbp <= -0.007718 )
			if( bbm <= 0.004783 )
				if( MFI <= 0.790662 )
					if( Raw_Money_Flow <= 765.25 )
						ret := 0.076923
					if( Raw_Money_Flow > 765.25 )
						if( Typical_Price <= 7.67562 )
							ret := -0.810811 // sell
						if( Typical_Price > 7.67562 )
							ret := -0.250000
				if( MFI > 0.790662 )
					if( Negative_Money_Flow_Sum <= 141327 )
						if( Money_Flow_Ratio <= 0.211464 )
							ret := -0.357143
						if( Money_Flow_Ratio > 0.211464 )
							ret := 0.292627
					if( Negative_Money_Flow_Sum > 141327 )
						if( bbp <= -0.060181 )
							ret := 0.719212 // buy
						if( bbp > -0.060181 )
							ret := 0.424829
			if( bbm > 0.004783 )
				if( Negative_Money_Flow_Sum <= 1.92125e+06 )
					if( Negative_Money_Flow_Sum <= 167180 )
						if( Raw_Money_Flow <= 68359.5 )
							ret := 0.202255
						if( Raw_Money_Flow > 68359.5 )
							ret := 0.734177 // buy
					if( Negative_Money_Flow_Sum > 167180 )
						if( Positive_Money_Flow_Sum <= 138218 )
							ret := -0.067975
						if( Positive_Money_Flow_Sum > 138218 )
							ret := 0.087278
				if( Negative_Money_Flow_Sum > 1.92125e+06 )
					if( Typical_Price <= 6.22759 )
						if( Raw_Money_Flow <= 452045 )
							ret := 0.286863
						if( Raw_Money_Flow > 452045 )
							ret := 0.759162 // buy
					if( Typical_Price > 6.22759 )
						if( bearPower <= -0.989736 )
							ret := -0.846154 // sell
						if( bearPower > -0.989736 )
							ret := 0.133787
		if( bbp > -0.007718 )
			if( Negative_Money_Flow <= 79716.6 )
				if( bearPower <= 0.026576 )
					if( Positive_Money_Flow_Sum <= 12411 )
						if( Positive_Money_Flow_Sum <= 11217 )
							ret := 0.158672
						if( Positive_Money_Flow_Sum > 11217 )
							ret := 0.771429 // buy
					if( Positive_Money_Flow_Sum > 12411 )
						if( Negative_Money_Flow_Sum <= 18430.8 )
							ret := -0.248588
						if( Negative_Money_Flow_Sum > 18430.8 )
							ret := 0.067311
				if( bearPower > 0.026576 )
					if( Money_Flow_Ratio <= 6.1556 )
						if( Raw_Money_Flow <= 57374.1 )
							ret := -0.371758
						if( Raw_Money_Flow > 57374.1 )
							ret := 0.280702
					if( Money_Flow_Ratio > 6.1556 )
						if( Negative_Money_Flow_Sum <= 17191.6 )
							ret := -0.206897
						if( Negative_Money_Flow_Sum > 17191.6 )
							ret := 0.552239
			if( Negative_Money_Flow > 79716.6 )
				if( Typical_Price <= 1.89167 )
					if( MFI_Low <= 43.4601 )
						if( BBPower_Color <= 0.5 )
							ret := 1.000000 // buy
						if( BBPower_Color > 0.5 )
							ret := 0.550000
					if( MFI_Low > 43.4601 )
						ret := -0.181818
				if( Typical_Price > 1.89167 )
					if( Positive_Money_Flow_Sum <= 1.02596e+07 )
						if( Positive_Money_Flow_Sum <= 8.06614e+06 )
							ret := -0.125647
						if( Positive_Money_Flow_Sum > 8.06614e+06 )
							ret := -0.933333 // sell
					if( Positive_Money_Flow_Sum > 1.02596e+07 )
						if( MFI_High <= -9.66988 )
							ret := 0.923077 // buy
						if( MFI_High > -9.66988 )
							ret := 0.238095
	if( Positive_Money_Flow > 0.030115 )
		if( bearPower <= 0.01312 )
			if( bbm <= 0.005007 )
				if( bbp <= -0.006715 )
					if( Positive_Money_Flow_Sum <= 13212.6 )
						if( Money_Flow_Ratio <= 0.403055 )
							ret := -0.494737
						if( Money_Flow_Ratio > 0.403055 )
							ret := 0.345679
					if( Positive_Money_Flow_Sum > 13212.6 )
						if( Negative_Money_Flow_Sum <= 9925.48 )
							ret := -0.500000
						if( Negative_Money_Flow_Sum > 9925.48 )
							ret := 0.347945
				if( bbp > -0.006715 )
					if( Positive_Money_Flow <= 249.382 )
						if( Raw_Money_Flow <= 3679.92 )
							ret := -0.418502
						if( Raw_Money_Flow > 3679.92 )
							ret := 0.357143
					if( Positive_Money_Flow > 249.382 )
						if( Money_Flow_Ratio <= 17.8094 )
							ret := 0.021053
						if( Money_Flow_Ratio > 17.8094 )
							ret := -0.515152
			if( bbm > 0.005007 )
				if( Typical_Price <= 1.44244 )
					if( Negative_Money_Flow_Sum <= 178536 )
						if( MFI_Low <= 13.5117 )
							ret := -0.500000
						if( MFI_Low > 13.5117 )
							ret := 0.250000
					if( Negative_Money_Flow_Sum > 178536 )
						if( Typical_Price <= 1.43441 )
							ret := 0.951220 // buy
						if( Typical_Price > 1.43441 )
							ret := 0.470588
				if( Typical_Price > 1.44244 )
					if( Typical_Price <= 2.27836 )
						if( MFI <= 74.6047 )
							ret := -0.174851
						if( MFI > 74.6047 )
							ret := 0.135417
					if( Typical_Price > 2.27836 )
						if( bearPower <= -0.18547 )
							ret := -0.467153
						if( bearPower > -0.18547 )
							ret := -0.031781
		if( bearPower > 0.01312 )
			if( Positive_Money_Flow <= 14517.1 )
				if( bearPower <= 0.02319 )
					if( Negative_Money_Flow_Sum <= 149287 )
						if( Typical_Price <= 3.43516 )
							ret := -0.216418
						if( Typical_Price > 3.43516 )
							ret := 0.258427
					if( Negative_Money_Flow_Sum > 149287 )
						if( Negative_Money_Flow_Sum <= 564816 )
							ret := -0.533333
						if( Negative_Money_Flow_Sum > 564816 )
							ret := -0.265781
				if( bearPower > 0.02319 )
					if( bearPower <= 0.069001 )
						if( Negative_Money_Flow_Sum <= 6681.36 )
							ret := -0.067227
						if( Negative_Money_Flow_Sum > 6681.36 )
							ret := -0.523295
					if( bearPower > 0.069001 )
						if( Typical_Price <= 10.1072 )
							ret := -0.848000 // sell
						if( Typical_Price > 10.1072 )
							ret := -0.423729
			if( Positive_Money_Flow > 14517.1 )
				if( bullPower <= 0.182118 )
					if( Negative_Money_Flow_Sum <= 922612 )
						if( Negative_Money_Flow_Sum <= 125711 )
							ret := -0.209809
						if( Negative_Money_Flow_Sum > 125711 )
							ret := 0.046102
					if( Negative_Money_Flow_Sum > 922612 )
						if( Raw_Money_Flow <= 149278 )
							ret := -0.526316
						if( Raw_Money_Flow > 149278 )
							ret := -0.251440
				if( bullPower > 0.182118 )
					if( MFI <= 74.6912 )
						if( Negative_Money_Flow_Sum <= 651174 )
							ret := -0.166667
						if( Negative_Money_Flow_Sum > 651174 )
							ret := 0.813187 // buy
					if( MFI > 74.6912 )
						if( Raw_Money_Flow <= 440399 )
							ret := -0.294118
						if( Raw_Money_Flow > 440399 )
							ret := 0.361386
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_APPS_5Min_ebacc454(bullPower, bbp, bearPower, bbm, BBPower_Color, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

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


