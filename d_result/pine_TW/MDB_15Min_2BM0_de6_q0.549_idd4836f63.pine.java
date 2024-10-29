//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: MDB_15Min_2BM0_d4836f63 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MDB_15Min_2BM0_d4836f63", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MDB_15Min_d4836f63(bearPower, bbm, bbp, bullPower, BBPower_Color, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( bearPower <= 0.316446 )
		if( Typical_Price <= 401.155 )
			if( Typical_Price <= 151.567 )
				if( bbp <= -4.43926 )
					if( Positive_Money_Flow_Sum <= 3.39333e+07 )
						if( Raw_Money_Flow <= 1.0065e+07 )
							ret := 0.615176
						if( Raw_Money_Flow > 1.0065e+07 )
							ret := 0.171674
					if( Positive_Money_Flow_Sum > 3.39333e+07 )
						if( bbm <= 2.02478 )
							ret := -0.416667
						if( bbm > 2.02478 )
							ret := 0.652174
				if( bbp > -4.43926 )
					if( Money_Flow_Ratio <= 1.47308 )
						if( Negative_Money_Flow_Sum <= 3.47038e+06 )
							ret := -0.102420
						if( Negative_Money_Flow_Sum > 3.47038e+06 )
							ret := 0.045334
					if( Money_Flow_Ratio > 1.47308 )
						if( bullPower <= -0.024511 )
							ret := 0.341951
						if( bullPower > -0.024511 )
							ret := 0.103817
			if( Typical_Price > 151.567 )
				if( bullPower <= -4.01285 )
					if( Negative_Money_Flow_Sum <= 5.08228e+07 )
						if( MFI <= 73.3704 )
							ret := 0.891473 // buy
						if( MFI > 73.3704 )
							ret := -0.192308
					if( Negative_Money_Flow_Sum > 5.08228e+07 )
						if( Positive_Money_Flow_Sum <= 6.67393e+07 )
							ret := 0.028233
						if( Positive_Money_Flow_Sum > 6.67393e+07 )
							ret := 0.318008
				if( bullPower > -4.01285 )
					if( MFI_High <= -61.2275 )
						if( Raw_Money_Flow <= 65376 )
							ret := 0.202952
						if( Raw_Money_Flow > 65376 )
							ret := -0.088279
					if( MFI_High > -61.2275 )
						if( Positive_Money_Flow <= 2.1314e+07 )
							ret := 0.004025
						if( Positive_Money_Flow > 2.1314e+07 )
							ret := 0.136683
		if( Typical_Price > 401.155 )
			if( Negative_Money_Flow_Sum <= 1.01658e+08 )
				if( MFI <= 71.1526 )
					if( bearPower <= 0.250617 )
						if( Positive_Money_Flow_Sum <= 1.80932e+08 )
							ret := -0.010989
						if( Positive_Money_Flow_Sum > 1.80932e+08 )
							ret := 0.863636 // buy
					if( bearPower > 0.250617 )
						if( Money_Flow_Ratio <= 0.782175 )
							ret := -0.285714
						if( Money_Flow_Ratio > 0.782175 )
							ret := 0.648649
				if( MFI > 71.1526 )
					if( bbp <= -3.07267 )
						if( Raw_Money_Flow <= 8.09838e+07 )
							ret := -0.655462
						if( Raw_Money_Flow > 8.09838e+07 )
							ret := 1.000000 // buy
					if( bbp > -3.07267 )
						if( bullPower <= 6.38959 )
							ret := -0.002924
						if( bullPower > 6.38959 )
							ret := -0.481481
			if( Negative_Money_Flow_Sum > 1.01658e+08 )
				if( MFI_High <= -18.524 )
					if( bullPower <= 1.23479 )
						if( Negative_Money_Flow_Sum <= 2.07842e+08 )
							ret := -0.236457
						if( Negative_Money_Flow_Sum > 2.07842e+08 )
							ret := 0.000000
					if( bullPower > 1.23479 )
						if( bullPower <= 7.23299 )
							ret := 0.078390
						if( bullPower > 7.23299 )
							ret := -0.818182 // sell
				if( MFI_High > -18.524 )
					if( Negative_Money_Flow <= 1.50304e+08 )
						if( Negative_Money_Flow_Sum <= 1.29668e+08 )
							ret := -0.345238
						if( Negative_Money_Flow_Sum > 1.29668e+08 )
							ret := -0.807692 // sell
					if( Negative_Money_Flow > 1.50304e+08 )
						ret := 1.000000 // buy
	if( bearPower > 0.316446 )
		if( bbm <= 0.723306 )
			if( Money_Flow_Ratio <= 17.2316 )
				if( Positive_Money_Flow_Sum <= 502771 )
					if( Negative_Money_Flow <= 135799 )
						if( bullPower <= 0.381044 )
							ret := 0.000000
						if( bullPower > 0.381044 )
							ret := -0.961538 // sell
					if( Negative_Money_Flow > 135799 )
						ret := 0.000000
				if( Positive_Money_Flow_Sum > 502771 )
					if( Negative_Money_Flow_Sum <= 5.16349e+06 )
						if( Positive_Money_Flow_Sum <= 1.97912e+07 )
							ret := 0.211994
						if( Positive_Money_Flow_Sum > 1.97912e+07 )
							ret := -0.173684
					if( Negative_Money_Flow_Sum > 5.16349e+06 )
						if( Typical_Price <= 37.4117 )
							ret := 0.621622
						if( Typical_Price > 37.4117 )
							ret := -0.133538
			if( Money_Flow_Ratio > 17.2316 )
				if( Positive_Money_Flow <= 1.58988e+06 )
					if( Positive_Money_Flow <= 1230.26 )
						if( Negative_Money_Flow <= 193180 )
							ret := 0.040000
						if( Negative_Money_Flow > 193180 )
							ret := -0.589744
					if( Positive_Money_Flow > 1230.26 )
						if( Typical_Price <= 361.041 )
							ret := -0.825843 // sell
						if( Typical_Price > 361.041 )
							ret := -0.368421
				if( Positive_Money_Flow > 1.58988e+06 )
					if( bullPower <= 2.75028 )
						if( MFI_High <= 13.4746 )
							ret := 1.000000 // buy
						if( MFI_High > 13.4746 )
							ret := 0.000000
					if( bullPower > 2.75028 )
						ret := -0.714286 // sell
		if( bbm > 0.723306 )
			if( MFI_Low <= 59.5564 )
				if( Positive_Money_Flow <= 2.06174e+07 )
					if( Positive_Money_Flow_Sum <= 9.25484e+07 )
						if( MFI <= 50.5552 )
							ret := -0.092225
						if( MFI > 50.5552 )
							ret := 0.021148
					if( Positive_Money_Flow_Sum > 9.25484e+07 )
						if( MFI <= 33.6468 )
							ret := -0.789474 // sell
						if( MFI > 33.6468 )
							ret := 0.103813
				if( Positive_Money_Flow > 2.06174e+07 )
					if( Positive_Money_Flow <= 3.37241e+07 )
						if( Positive_Money_Flow_Sum <= 6.56947e+07 )
							ret := 0.375000
						if( Positive_Money_Flow_Sum > 6.56947e+07 )
							ret := -0.326861
					if( Positive_Money_Flow > 3.37241e+07 )
						if( Negative_Money_Flow_Sum <= 1.64552e+08 )
							ret := 0.101744
						if( Negative_Money_Flow_Sum > 1.64552e+08 )
							ret := -0.600000
			if( MFI_Low > 59.5564 )
				if( bearPower <= 13.0053 )
					if( Raw_Money_Flow <= 5.14391e+07 )
						if( Positive_Money_Flow_Sum <= 2.86328e+07 )
							ret := -0.564417
						if( Positive_Money_Flow_Sum > 2.86328e+07 )
							ret := -0.071368
					if( Raw_Money_Flow > 5.14391e+07 )
						if( bbm <= 13.5726 )
							ret := -0.440191
						if( bbm > 13.5726 )
							ret := 1.000000 // buy
				if( bearPower > 13.0053 )
					if( Money_Flow_Ratio <= 4.96249 )
						ret := -0.857143 // sell
					if( Money_Flow_Ratio > 4.96249 )
						if( bbm <= 11.7214 )
							ret := 0.746667 // buy
						if( bbm > 11.7214 )
							ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_MDB_15Min_d4836f63(bearPower, bbm, bbp, bullPower, BBPower_Color, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


